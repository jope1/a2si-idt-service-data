package com.bjss.nhsd.a2si.idt;

import org.junit.Test;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class TestAll {


    @Test
    public void testDisposition() {

        String dispositionCode = "dispoCode";
        String dispositionText = "dispoText";
        String dispositionGroup = "dispoGroup";
        String dispositionBroadGroup = "dispoBroadGroup";

        Disposition disposition = new Disposition();
        disposition.setCode(dispositionCode);
        disposition.setText(dispositionText);
        disposition.setGroup(dispositionGroup);
        disposition.setBroadGroup(dispositionBroadGroup);

        assertNotNull(disposition);
        assertEquals(dispositionCode, disposition.getCode());
        assertEquals(dispositionText, disposition.getText());
        assertEquals(dispositionGroup, disposition.getGroup());
        assertEquals(dispositionBroadGroup, disposition.getBroadGroup());

        System.out.println(disposition);

    }

    //     private String id;
    //    private String callTime;
    //    private String locationCCG;
    //    private String sgDescription;
    //    private Disposition disposition;
    //    private String orgName;
    //    private String dosServiceId;
    //    private Timestamp timestamp;

    @Test
    public void testServiceData() {

        String id = "serviceDataId";
        String callTime = "2017-12-01 00:00:00";
        String locationCCG = "Location CCG Value";
        String sgDescription = "SG Description";

        String dispositionCode = "dispoCode";
        String dispositionText = "dispoText";
        String dispositionGroup = "dispoGroup";
        String dispositionBroadGroup = "dispoBroadGroup";

        String orgName = "Org Name";
        String dosServiceId = "DoS Servicve Id";
        Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());

        IdtServiceData idtServiceData = new IdtServiceData();
        idtServiceData.setId(id);
        idtServiceData.setCallTime(callTime);
        idtServiceData.setLocationCCG(locationCCG);
        idtServiceData.setSgDescription(sgDescription);

        Disposition disposition = new Disposition();
        disposition.setCode(dispositionCode);
        disposition.setText(dispositionText);
        disposition.setGroup(dispositionGroup);
        disposition.setBroadGroup(dispositionBroadGroup);

        idtServiceData.setDisposition(disposition);

        idtServiceData.setOrgName(orgName);
        idtServiceData.setDosServiceId(dosServiceId);
        idtServiceData.setTimestamp(timestamp);

        assertNotNull(disposition);
        assertEquals(dispositionCode, disposition.getCode());
        assertEquals(dispositionText, disposition.getText());
        assertEquals(dispositionGroup, disposition.getGroup());
        assertEquals(dispositionBroadGroup, disposition.getBroadGroup());

        System.out.println(disposition);

    }

}
