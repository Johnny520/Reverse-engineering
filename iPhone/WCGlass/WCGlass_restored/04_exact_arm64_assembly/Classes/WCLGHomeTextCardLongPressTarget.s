// Exact ARM64 listing for WCLGHomeTextCardLongPressTarget

// +[WCLGHomeTextCardLongPressTarget shared] IMP=0x39076C bounds=0x39076C-0x39079C
loc_39076C:
    adrp     x8, #0x581000
    ldr      x8, [x8, #0xad8]
    cmn      x8, #1
    b.ne     #0x390788
    adrp     x8, #0x581000
    ldr      x0, [x8, #0xad0]
    b        #0x461cc0 // _objc_retainAutoreleaseReturnValue
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    bl       #0x460bdc
    ldp      x29, x30, [sp], #0x10
    b        #0x39077c

// -[WCLGHomeTextCardLongPressTarget onLongPress:] IMP=0x3907C8 bounds=0x3907C8-0x3907FC
loc_3907C8:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    mov      x0, x2
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x3d0]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    b.ne     #0x3907f4
    mov      x0, #0
    ldp      x29, x30, [sp], #0x10
    b        #0x3d6cd4
    ldp      x29, x30, [sp], #0x10
    ret      
