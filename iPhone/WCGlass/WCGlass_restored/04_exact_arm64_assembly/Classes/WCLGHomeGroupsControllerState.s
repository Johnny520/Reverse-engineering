// Exact ARM64 listing for WCLGHomeGroupsControllerState

// -[WCLGHomeGroupsControllerState fullscreenRowsBusy] IMP=0x365B80 bounds=0x365B80-0x365B88
loc_365B80:
    ldrb     w0, [x0, #8]
    ret      

// -[WCLGHomeGroupsControllerState setFullscreenRowsBusy:] IMP=0x365B88 bounds=0x365B88-0x365B90
loc_365B88:
    strb     w2, [x0, #8]
    ret      

// -[WCLGHomeGroupsControllerState fullscreenCapsulePositionPending] IMP=0x365B90 bounds=0x365B90-0x365B98
loc_365B90:
    ldrb     w0, [x0, #9]
    ret      

// -[WCLGHomeGroupsControllerState setFullscreenCapsulePositionPending:] IMP=0x365B98 bounds=0x365B98-0x365BA0
loc_365B98:
    strb     w2, [x0, #9]
    ret      

// -[WCLGHomeGroupsControllerState fullscreenCapsulePositionScheduled] IMP=0x365BA0 bounds=0x365BA0-0x365BA8
loc_365BA0:
    ldrb     w0, [x0, #0xa]
    ret      

// -[WCLGHomeGroupsControllerState setFullscreenCapsulePositionScheduled:] IMP=0x365BA8 bounds=0x365BA8-0x365BB0
loc_365BA8:
    strb     w2, [x0, #0xa]
    ret      

// -[WCLGHomeGroupsControllerState fullscreenCapsulePositionScheduledEpoch] IMP=0x365BB0 bounds=0x365BB0-0x365BB8
loc_365BB0:
    ldr      x0, [x0, #0x10]
    ret      

// -[WCLGHomeGroupsControllerState setFullscreenCapsulePositionScheduledEpoch:] IMP=0x365BB8 bounds=0x365BB8-0x365BC0
loc_365BB8:
    str      x2, [x0, #0x10]
    ret      

// -[WCLGHomeGroupsControllerState fullscreenCapsulePositionAttemptCount] IMP=0x365BC0 bounds=0x365BC0-0x365BC8
loc_365BC0:
    ldr      x0, [x0, #0x18]
    ret      

// -[WCLGHomeGroupsControllerState setFullscreenCapsulePositionAttemptCount:] IMP=0x365BC8 bounds=0x365BC8-0x365BD0
loc_365BC8:
    str      x2, [x0, #0x18]
    ret      

// -[WCLGHomeGroupsControllerState fullscreenCapsulePositionTargetToken] IMP=0x365BD0 bounds=0x365BD0-0x365BD8
loc_365BD0:
    ldr      x0, [x0, #0x20]
    ret      

// -[WCLGHomeGroupsControllerState setFullscreenCapsulePositionTargetToken:] IMP=0x365BD8 bounds=0x365BD8-0x365BE0
loc_365BD8:
    str      x2, [x0, #0x20]
    ret      

// -[WCLGHomeGroupsControllerState fullscreenCapsulePositionEpoch] IMP=0x365BE0 bounds=0x365BE0-0x365BE8
loc_365BE0:
    ldr      x0, [x0, #0x28]
    ret      

// -[WCLGHomeGroupsControllerState setFullscreenCapsulePositionEpoch:] IMP=0x365BE8 bounds=0x365BE8-0x365BF0
loc_365BE8:
    str      x2, [x0, #0x28]
    ret      
