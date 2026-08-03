// Exact ARM64 listing for WCLGHomeSwipeBlockerTarget

// +[WCLGHomeSwipeBlockerTarget shared] IMP=0x3713CC bounds=0x3713CC-0x3713FC
loc_3713CC:
    adrp     x8, #0x581000
    ldr      x8, [x8, #0x438]
    cmn      x8, #1
    b.ne     #0x3713e8
    adrp     x8, #0x581000
    ldr      x0, [x8, #0x430]
    b        #0x461cc0 // _objc_retainAutoreleaseReturnValue
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    bl       #0x460ae0
    ldp      x29, x30, [sp], #0x10
    b        #0x3713dc

// -[WCLGHomeSwipeBlockerTarget handlePan:] IMP=0x371430 bounds=0x371430-0x371434
loc_371430:
    ret      
