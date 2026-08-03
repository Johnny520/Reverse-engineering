// Exact ARM64 listing for WCLGFuncCardLongPressTarget

// +[WCLGFuncCardLongPressTarget shared] IMP=0x31F9B0 bounds=0x31F9B0-0x31F9E0
loc_31F9B0:
    adrp     x8, #0x580000
    ldr      x8, [x8, #0xc50]
    cmn      x8, #1
    b.ne     #0x31f9cc
    adrp     x8, #0x580000
    ldr      x0, [x8, #0xc48]
    b        #0x461cc0 // _objc_retainAutoreleaseReturnValue
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    bl       #0x4605e8
    ldp      x29, x30, [sp], #0x10
    b        #0x31f9c0

// -[WCLGFuncCardLongPressTarget onLongPress:] IMP=0x31FA0C bounds=0x31FA0C-0x31FA3C
loc_31FA0C:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    mov      x0, x2
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x3d0]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    b.ne     #0x31fa34
    ldp      x29, x30, [sp], #0x10
    b        #0x2e1f9c
    ldp      x29, x30, [sp], #0x10
    ret      

// -[WCLGFuncCardLongPressTarget gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:] IMP=0x31FA3C bounds=0x31FA3C-0x31FA44
loc_31FA3C:
    mov      w0, #1
    ret      
