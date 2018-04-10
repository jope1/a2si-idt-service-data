package com.bjss.nhsd.a2si.idt;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class IdtServiceData {

    private String id;
    private String callTime;
    private String locationCCG;
    private String sgDescription;
    private Disposition disposition;
    private String orgName;
    private String dosServiceId;
    private Timestamp timestamp;

    // The call time might be the start of the call and not indicative of when the patient was sent
    // If we use the current time for when we receive the message this MIGHT be more indicative

    // We could potentially build dashbaoards split by service if, or location ccg, and we could break them into the
    // disposition groups.
}
