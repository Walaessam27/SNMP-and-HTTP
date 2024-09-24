<?php
function getSnmp($ip,$cmName,$id,$column){
    $columnArr=array();
     for($i=1;$i<=$column;$i++) {
         $columnArr[$i - 1] = snmp2_walk($ip, $cmName, $id . "." . "$i");
     }
     return $columnArr;
}

function setSnmp($name, $location, $contact,$type) {
    if($type=="name")
        snmp2_set("127.0.0.1", "public", '.1.3.6.1.2.1.1.5.0', 's', $name);
    elseif ($type=="loc")
        snmp2_set("127.0.0.1", "public", ".1.3.6.1.2.1.1.6.0", 's', $location);
    elseif($type=="cont")
        snmp2_set("127.0.0.1", "public", ".1.3.6.1.2.1.1.4.0", 's', $contact);

}


$ip = "127.0.0.1";
$cmName = "public";
if (isset($_POST['type'])) {
    $type = $_POST['type'];
    $result=array();
   if($type=="arp")
           $result=getSnmp($ip,$cmName,".1.3.6.1.2.1.4.22.1",4);
       elseif ($type=="tcp")
           $result=getSnmp($ip,$cmName,".1.3.6.1.2.1.6.13.1",5);
       else if($type=="system")
           $result=getSnmp($ip,$cmName,".1.3.6.1.2.1.1",6);

       else{
       setSnmp($_POST['name'],$_POST['location'],$_POST['contact'],$type);
       return;
    }
    echo json_encode($result);
}
?>

<?php
function snmp_get_data($oid) {
    $value = snmp2_get("127.0.0.1", "public", $oid, 100000, 2);
    if ($value === false) {
        return "Error getting data for OID: $oid<br>";
    } else {
        $get_result = remove_type($value);
        return $get_result;
    }
}

function snmp_walk_data($oid) {
    $value = snmp2_walk("127.0.0.1", "public", $oid, 100000, 2);

    if ($value === false) {
        echo "Error walking data for OID: $oid<br>";
    } else {
        $walk_result = remove_type($value);
        return $walk_result;
    }
}

function remove_type($value) {
    // Split the value using space as delimiter
    $value_ex = explode(" ", $value);

    // The value will be the last part after splitting
    $last_value = end($value_ex);

    return $last_value;
}


function object_names() {

    $object_names = array(
        0 => "snmpInPkts",
        1 => "snmpOutPkts",
        2 => "snmpInBadVersions",
        3 => "snmpInBadCommunityNames",
        4 => "snmpInBadCommunityUses",
        5 => "snmpInASNParseErrs",
        6 => "snmpInTooBigs",
        7 => "snmpInNoSuchNames",
        8 => "snmpInBadValues",
        9 => "snmpInReadOnlys",
        10 => "snmpInGenErrs",
        11 => "snmpInTotalReqVars",
        12 => "snmpInTotalSetVars",
        13 => "snmpInGetRequests",
        14 => "snmpInGetNexts",
        15 => "snmpInSetRequests",
        16 => "snmpInGetResponses",
        17 => "snmpInTraps",
        18 => "snmpOutTooBigs",
        19 => "snmpOutNoSuchNames",
        20 => "snmpOutBadValues",
        21 => "snmpOutGenErrs",
        22 => "snmpOutGetRequests",
        23 => "snmpOutGetNexts",
        24 => "snmpOutSetRequests",
        25=> "snmpOutGetResponses",
        26 => "snmpOutTraps",
        27 => "snmpEnableAuthenTraps",
        // Add more names as needed
    );

    return $object_names;
}

$object_names = object_names();
function loops(){
    for ($i = 1,$index=0 ; $i <= 30, $index<=27; $i++, $index++) {
        if ($i != 7 && $i != 23) { // Exclude OIDs 7 and 23
            $object_name = isset($object_names[$index]) ? $object_names[$index] : "Unnamed Object $index";
            $value = snmp_get_data($i);
            $GetArray[$index] = array(
                "id" => $i,
                "name" => $object_name,
                "value" => $value
            );
        }
    }
    for ($index=0 ;  $index<=27; $index++) {
        $object_name = isset($object_names[$index]) ? $object_names[$index] : "Unnamed Object $index";
        $value = snmp_walk_data($oid);
        $WalkArray [$index] = array(
            "item" => $index,
            "name" => $object_name,
            "value" => $value
        );

    }
}
$GetArray = array();
$WalkArray = array();

?>
