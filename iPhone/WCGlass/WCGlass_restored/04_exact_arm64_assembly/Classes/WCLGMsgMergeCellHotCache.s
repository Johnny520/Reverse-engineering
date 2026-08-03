// Exact ARM64 listing for WCLGMsgMergeCellHotCache

// -[WCLGMsgMergeCellHotCache .cxx_destruct] IMP=0x9D318 bounds=0x9D318-0x9D378
loc_9D318:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    add      x0, x0, #0x48
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x19, #0x40
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x19, #0x38
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x19, #0x30
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x19, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x19, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x19, #0x18
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x19, #0x10
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x19, #8
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c0c // _objc_destroyWeak
