// Exact ARM64 listing for WCLGFuncCardDocPickerDelegate

// -[WCLGFuncCardDocPickerDelegate documentPicker:didPickDocumentsAtURLs:] IMP=0x322208 bounds=0x322208-0x3227C8
loc_322208:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x20
    mov      x22, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x580000
    add      x8, x8, #0xd70
    ldar     w9, [x8]
    cbnz     w9, #0x3223c0
    adrp     x9, #0x548000
    add      x9, x9, #0xfba
    ldrb     w10, [x9]
    eor      w10, w10, #0x33333333
    adrp     x11, #0x548000
    add      x11, x11, #0xfc4
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xe2
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xfffffff1
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0xde
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0xb4
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0x99999999
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0xc2
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0xae
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w12, #0xf4
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w9, [x9, #9]
    mov      w10, #0x43
    eor      w9, w9, w10
    strb     w9, [x11, #9]
    adrp     x9, #0x548000
    add      x9, x9, #0xfa0
    ldrb     w10, [x9]
    eor      w10, w10, #0xfe
    adrp     x11, #0x548000
    add      x11, x11, #0xfad
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x98
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xfffffffb
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0xe4
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x4c
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x53
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    eor      w10, w10, #0x22222222
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0x16
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w12, #0x4d
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    mov      w12, #0xf5
    eor      w10, w10, w12
    strb     w10, [x11, #9]
    ldrb     w10, [x9, #0xa]
    mov      w12, #0x6e
    eor      w10, w10, w12
    strb     w10, [x11, #0xa]
    ldrb     w10, [x9, #0xb]
    mov      w12, #0x3a
    eor      w10, w10, w12
    strb     w10, [x11, #0xb]
    ldrb     w9, [x9, #0xc]
    eor      w9, w9, #0x20
    strb     w9, [x11, #0xc]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x27, sp, #0x10
    mov      sp, x27
    sub      x25, sp, #0x10
    mov      sp, x25
    sub      x26, sp, #0x10
    mov      sp, x26
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x918]
    mov      x0, x3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    cbz      x0, #0x322720
    stur     x22, [x29, #-0x68]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7b0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    stur     w0, [x29, #-0x6c]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x420]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x338]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x322468
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    b        #0x322470
    adrp     x23, #0x549000
    add      x23, x23, #0x30
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    bl       #0x3227c8
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x820]
    mov      x1, x22
    stur     x23, [x29, #-0x60]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x108]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x800]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x960]
    mov      x2, x23
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2c0]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x318]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    str      xzr, [x27]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x320]
    mov      x0, x24
    mov      x2, x20
    mov      x3, x19
    mov      x4, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    ldr      x27, [x27]
    mov      x0, x27
    bl       #0x461ca8 // _objc_retain
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    tbnz     w28, #0, #0x3225a0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x130]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7c0]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x3226dc
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc68]
    mov      x0, x19
    mov      x2, x23
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cbz      w21, #0x3226e4
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x200]
    ldr      x8, [x8]
    str      x8, [x26]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1d0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x778]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    str      x0, [x25]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    mov      x2, x25
    mov      x3, x26
    mov      w4, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x300]
    mov      x0, x24
    mov      x2, x21
    mov      x3, x23
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x2ea7d0
    adrp     x0, #0x548000
    add      x0, x0, #0xff0
    mov      x1, x22
    ldur     x22, [x29, #-0x60]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4a3000
    add      x8, x8, #0xe98
    ldr      x3, [x8]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x9e8]
    mov      x0, x19
    mov      x1, x25
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a3000
    add      x8, x8, #0xea0
    ldr      x3, [x8]
    mov      x0, x19
    mov      x1, x25
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4a3000
    add      x8, x8, #0xe80
    ldr      x3, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x908]
    mov      x0, x19
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     w8, [x29, #-0x6c]
    cbz      w8, #0x3226fc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7d0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x60]
    bl       #0x461c9c // _objc_release
    ldur     x22, [x29, #-0x68]
    adrp     x8, #0x4c0000
    ldr      x19, [x8, #0x718]
    mov      x0, x22
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461c9c // _objc_release
    cbz      x21, #0x322770
    mov      x0, x22
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x8, [x0, #0x10]
    blr      x8
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb40]
    mov      x0, x22
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x3227c4
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGFuncCardDocPickerDelegate documentPickerWasCancelled:] IMP=0x322960 bounds=0x322960-0x322970
loc_322960:
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb40]
    mov      x2, #0
    b        #0x461c6c // _objc_msgSend

// -[WCLGFuncCardDocPickerDelegate onChange] IMP=0x322970 bounds=0x322970-0x322978
loc_322970:
    ldr      x0, [x0, #8]
    ret      

// -[WCLGFuncCardDocPickerDelegate setOnChange:] IMP=0x322978 bounds=0x322978-0x322980
loc_322978:
    mov      w3, #8
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGFuncCardDocPickerDelegate retainSelf] IMP=0x322980 bounds=0x322980-0x322988
loc_322980:
    ldr      x0, [x0, #0x10]
    ret      

// -[WCLGFuncCardDocPickerDelegate setRetainSelf:] IMP=0x322988 bounds=0x322988-0x322994
loc_322988:
    mov      x1, x2
    add      x0, x0, #0x10
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFuncCardDocPickerDelegate .cxx_destruct] IMP=0x322994 bounds=0x322994-0x3229C4
loc_322994:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    add      x0, x0, #0x10
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
