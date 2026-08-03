// Exact ARM64 listing for WCLGThemeDetailViewController

// -[WCLGThemeDetailViewController initWithTheme:download:] IMP=0x446DC4 bounds=0x446DC4-0x446E7C
loc_446DC4:
    sub      sp, sp, #0x40
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x20, x3
    mov      x19, x2
    mov      x21, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x838]
    stp      x21, x8, [sp]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb78]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x21, x0
    cbz      x0, #0x446e54
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xefc]
    add      x0, x21, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0xf00]
    ldr      x8, [x21, x9]
    str      x0, [x21, x9]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    add      sp, sp, #0x40
    ret      

// -[WCLGThemeDetailViewController dealloc] IMP=0x446E7C bounds=0x446E7C-0x446EE0
loc_446E7C:
    sub      sp, sp, #0x30
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf04]
    ldr      x0, [x0, x8]
    mov      x1, #0
    bl       #0x2d9d44
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf08]
    ldr      x0, [x19, x8]
    bl       #0x2da1d0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x838]
    stp      x19, x8, [sp]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd88]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    add      sp, sp, #0x30
    ret      

// -[WCLGThemeDetailViewController viewDidLoad] IMP=0x446EE0 bounds=0x446EE0-0x447240
loc_446EE0:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xaf8
    ldar     w9, [x8]
    cbnz     w9, #0x446f4c
    adrp     x9, #0x577000
    add      x9, x9, #0x3f0
    ldrh     w10, [x9]
    mov      w11, #0x3154
    eor      w10, w10, w11
    adrp     x11, #0x577000
    add      x11, x11, #0x3f6
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x252c
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0xd418
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x8, sp
    sub      x0, x8, #0x10
    mov      sp, x0
    adrp     x9, #0x4c4000
    ldr      x9, [x9, #0x838]
    stp      x19, x9, [x8, #-0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc80]
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb80]
    adrp     x2, #0x577000
    add      x2, x2, #0x420
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x3d8]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x490]
    bl       #0x461ba0 // _objc_alloc
    mov      x23, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x4d8]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xb38]
    mov      x0, x23
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xec0]
    mov      x0, x19
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x24, [x8, #0xec8]
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x448]
    mov      x1, x23
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xe90]
    mov      x0, x25
    mov      x2, x24
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x188]
    bl       #0x461ba0 // _objc_alloc
    mov      x24, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0xd0]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x21, [x8, #0xd38]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x1, x23
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbf8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x118]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    sub      sp, x29, #0x40
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    ret      

// -[WCLGThemeDetailViewController stateTitle] IMP=0x447240 bounds=0x447240-0x447504
loc_447240:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xafc
    ldar     w9, [x8]
    cbnz     w9, #0x4473f4
    adrp     x9, #0x577000
    add      x9, x9, #0x47c
    ldrh     w10, [x9]
    mov      w11, #0xd1a5
    eor      w10, w10, w11
    adrp     x11, #0x577000
    add      x11, x11, #0x486
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xe6c4
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x1055
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xc070
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xe1ab
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x577000
    add      x9, x9, #0x46c
    ldrh     w10, [x9]
    mov      w11, #0x3791
    eor      w10, w10, w11
    adrp     x11, #0x577000
    add      x11, x11, #0x474
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xaea5
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x5ed7
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w9, [x9, #6]
    mov      w10, #0xaa2f
    eor      w9, w9, w10
    strh     w9, [x11, #6]
    adrp     x9, #0x577000
    add      x9, x9, #0x458
    ldrh     w10, [x9]
    mov      w11, #0x3b73
    eor      w10, w10, w11
    adrp     x11, #0x577000
    add      x11, x11, #0x462
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x555
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x9ac9
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x7c49
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xcf69
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x577000
    add      x9, x9, #0x44c
    ldrh     w10, [x9]
    mov      w11, #0xe417
    eor      w10, w10, w11
    adrp     x11, #0x577000
    add      x11, x11, #0x452
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xc9a7
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x6f98
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x577000
    add      x9, x9, #0x440
    ldrh     w10, [x9]
    mov      w11, #0x614
    eor      w10, w10, w11
    adrp     x11, #0x577000
    add      x11, x11, #0x446
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xe782
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x3a9a
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x120]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x44741c
    adrp     x0, #0x577000
    add      x0, x0, #0x530
    b        #0x4474f4
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x128]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x44743c
    adrp     x0, #0x577000
    add      x0, x0, #0x4f0
    b        #0x4474f4
    adrp     x8, #0x4c3000
    ldr      x20, [x8, #0x130]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xea8]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    tbz      w22, #0, #0x447484
    adrp     x0, #0x577000
    add      x0, x0, #0x4b0
    b        #0x4474f4
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xeb8]
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x4474c0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x0, #0x577000
    add      x0, x0, #0x5b0
    b        #0x4474f4
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x138]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x577000
    add      x8, x8, #0x570
    adrp     x9, #0x577000
    add      x9, x9, #0x5b0
    cmp      w19, #0
    csel     x0, x9, x8, ne
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    ret      

// -[WCLGThemeDetailViewController stateIcon] IMP=0x447504 bounds=0x447504-0x447C98
loc_447504:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xb00
    ldar     w9, [x8]
    cbnz     w9, #0x447b88
    adrp     x11, #0x577000
    add      x11, x11, #0x6d0
    ldrb     w9, [x11]
    mov      w10, #0x65
    adrp     x12, #0x577000
    add      x12, x12, #0x6f0
    eor      w9, w9, w10
    strb     w9, [x12]
    ldrb     w9, [x11, #1]
    mov      w13, #0x43
    eor      w9, w9, w13
    strb     w9, [x12, #1]
    ldrb     w9, [x11, #2]
    eor      w9, w9, #0x30
    strb     w9, [x12, #2]
    ldrb     w9, [x11, #3]
    eor      w9, w9, #2
    strb     w9, [x12, #3]
    ldrb     w9, [x11, #4]
    mov      w13, #0x9a
    eor      w9, w9, w13
    strb     w9, [x12, #4]
    ldrb     w9, [x11, #5]
    mov      w13, #0x5a
    eor      w9, w9, w13
    strb     w9, [x12, #5]
    ldrb     w9, [x11, #6]
    eor      w9, w9, w10
    strb     w9, [x12, #6]
    ldrb     w9, [x11, #7]
    mov      w10, #0x9e
    eor      w9, w9, w10
    strb     w9, [x12, #7]
    ldrb     w9, [x11, #8]
    mov      w10, #0x12
    eor      w9, w9, w10
    strb     w9, [x12, #8]
    ldrb     w9, [x11, #9]
    mov      w10, #0x28
    eor      w9, w9, w10
    strb     w9, [x12, #9]
    ldrb     w9, [x11, #0xa]
    mov      w10, #0x5c
    eor      w9, w9, w10
    strb     w9, [x12, #0xa]
    ldrb     w10, [x11, #0xb]
    mov      w9, #0x5d
    eor      w10, w10, w9
    strb     w10, [x12, #0xb]
    ldrb     w13, [x11, #0xc]
    mov      w10, #0xaf
    eor      w13, w13, w10
    strb     w13, [x12, #0xc]
    ldrb     w13, [x11, #0xd]
    mov      w14, #0x32
    eor      w13, w13, w14
    strb     w13, [x12, #0xd]
    ldrb     w13, [x11, #0xe]
    mov      w14, #0x75
    eor      w13, w13, w14
    strb     w13, [x12, #0xe]
    ldrb     w13, [x11, #0xf]
    mov      w14, #0x2e
    eor      w13, w13, w14
    strb     w13, [x12, #0xf]
    ldrb     w13, [x11, #0x10]
    mov      w14, #0x62
    eor      w13, w13, w14
    strb     w13, [x12, #0x10]
    ldrb     w11, [x11, #0x11]
    mov      w13, #0x56
    eor      w11, w11, w13
    strb     w11, [x12, #0x11]
    adrp     x12, #0x577000
    add      x12, x12, #0x650
    ldrb     w11, [x12]
    mov      w13, #0xd8
    eor      w11, w11, w13
    adrp     x15, #0x577000
    add      x15, x15, #0x670
    strb     w11, [x15]
    ldrb     w11, [x12, #1]
    mov      w16, #0xc4
    eor      w11, w11, w16
    strb     w11, [x15, #1]
    ldrb     w11, [x12, #2]
    mov      w13, #9
    eor      w11, w11, w13
    strb     w11, [x15, #2]
    ldrb     w11, [x12, #3]
    mov      w14, #0xe4
    eor      w11, w11, w14
    strb     w11, [x15, #3]
    ldrb     w11, [x12, #4]
    mov      w17, #0x71
    eor      w11, w11, w17
    strb     w11, [x15, #4]
    ldrb     w11, [x12, #5]
    mov      w17, #0x2f
    eor      w11, w11, w17
    strb     w11, [x15, #5]
    ldrb     w11, [x12, #6]
    eor      w11, w11, #0x78
    strb     w11, [x15, #6]
    ldrb     w11, [x12, #7]
    mov      w17, #0x68
    eor      w11, w11, w17
    strb     w11, [x15, #7]
    ldrb     w11, [x12, #8]
    mov      w17, #0xd5
    eor      w11, w11, w17
    strb     w11, [x15, #8]
    ldrb     w11, [x12, #9]
    mov      w0, #0x79
    eor      w11, w11, w0
    strb     w11, [x15, #9]
    ldrb     w11, [x12, #0xa]
    eor      w11, w11, #0xe0
    strb     w11, [x15, #0xa]
    ldrb     w11, [x12, #0xb]
    eor      w11, w11, #1
    strb     w11, [x15, #0xb]
    ldrb     w11, [x12, #0xc]
    mov      w0, #0x16
    eor      w11, w11, w0
    strb     w11, [x15, #0xc]
    ldrb     w11, [x12, #0xd]
    eor      w11, w11, #0x30
    strb     w11, [x15, #0xd]
    ldrb     w11, [x12, #0xe]
    eor      w11, w11, w17
    strb     w11, [x15, #0xe]
    ldrb     w11, [x12, #0xf]
    mov      w17, #0x2c
    eor      w11, w11, w17
    strb     w11, [x15, #0xf]
    ldrb     w11, [x12, #0x10]
    eor      w11, w11, #0xfffffffb
    strb     w11, [x15, #0x10]
    ldrb     w11, [x12, #0x11]
    mov      w17, #0x8c
    eor      w11, w11, w17
    strb     w11, [x15, #0x11]
    ldrb     w17, [x12, #0x12]
    mov      w11, #0x7d
    eor      w17, w17, w11
    strb     w17, [x15, #0x12]
    ldrb     w17, [x12, #0x13]
    eor      w17, w17, #0xffffffc7
    strb     w17, [x15, #0x13]
    ldrb     w17, [x12, #0x14]
    mov      w0, #0xd9
    eor      w17, w17, w0
    strb     w17, [x15, #0x14]
    ldrb     w12, [x12, #0x15]
    eor      w12, w12, w16
    strb     w12, [x15, #0x15]
    adrp     x15, #0x577000
    add      x15, x15, #0x690
    ldrb     w12, [x15]
    adrp     x16, #0x577000
    add      x16, x16, #0x6b0
    eor      w12, w12, #7
    strb     w12, [x16]
    ldrb     w12, [x15, #1]
    eor      w12, w12, #0x7f
    strb     w12, [x16, #1]
    ldrb     w12, [x15, #2]
    mov      w17, #0x24
    eor      w12, w12, w17
    strb     w12, [x16, #2]
    ldrb     w12, [x15, #3]
    eor      w12, w12, #0x7e
    strb     w12, [x16, #3]
    ldrb     w12, [x15, #4]
    mvn      w12, w12
    strb     w12, [x16, #4]
    ldrb     w17, [x15, #5]
    mov      w12, #0x7a
    eor      w17, w17, w12
    strb     w17, [x16, #5]
    ldrb     w17, [x15, #6]
    mov      w0, #0xed
    eor      w17, w17, w0
    strb     w17, [x16, #6]
    ldrb     w17, [x15, #7]
    mov      w0, #0x3d
    eor      w17, w17, w0
    strb     w17, [x16, #7]
    ldrb     w17, [x15, #8]
    mov      w0, #0x8b
    eor      w17, w17, w0
    strb     w17, [x16, #8]
    ldrb     w17, [x15, #9]
    mov      w0, #0x39
    eor      w17, w17, w0
    strb     w17, [x16, #9]
    ldrb     w17, [x15, #0xa]
    mov      w0, #0x67
    eor      w17, w17, w0
    strb     w17, [x16, #0xa]
    ldrb     w17, [x15, #0xb]
    mov      w0, #0xb5
    eor      w17, w17, w0
    strb     w17, [x16, #0xb]
    ldrb     w17, [x15, #0xc]
    eor      w17, w17, #0x66666666
    strb     w17, [x16, #0xc]
    ldrb     w17, [x15, #0xd]
    mov      w0, #0xdc
    eor      w17, w17, w0
    strb     w17, [x16, #0xd]
    ldrb     w17, [x15, #0xe]
    strb     w17, [x16, #0xe]
    ldrb     w17, [x15, #0xf]
    mov      w0, #0xbd
    eor      w17, w17, w0
    strb     w17, [x16, #0xf]
    ldrb     w17, [x15, #0x10]
    eor      w17, w17, #0xcccccccc
    strb     w17, [x16, #0x10]
    ldrb     w17, [x15, #0x11]
    eor      w17, w17, #0xffffffc3
    strb     w17, [x16, #0x11]
    ldrb     w17, [x15, #0x12]
    mov      w0, #0xa8
    eor      w17, w17, w0
    strb     w17, [x16, #0x12]
    ldrb     w0, [x15, #0x13]
    mov      w17, #0x9d
    eor      w0, w0, w17
    strb     w0, [x16, #0x13]
    ldrb     w0, [x15, #0x14]
    eor      w0, w0, #0xc
    strb     w0, [x16, #0x14]
    ldrb     w0, [x15, #0x15]
    mov      w1, #0xd4
    eor      w0, w0, w1
    strb     w0, [x16, #0x15]
    ldrb     w0, [x15, #0x16]
    mov      w1, #0x14
    eor      w0, w0, w1
    strb     w0, [x16, #0x16]
    ldrb     w0, [x15, #0x17]
    mov      w1, #0x6f
    eor      w0, w0, w1
    strb     w0, [x16, #0x17]
    ldrb     w0, [x15, #0x18]
    mov      w1, #0xb8
    eor      w0, w0, w1
    strb     w0, [x16, #0x18]
    ldrb     w1, [x15, #0x19]
    mov      w0, #0xb3
    eor      w1, w1, w0
    strb     w1, [x16, #0x19]
    ldrb     w1, [x15, #0x1a]
    eor      w14, w1, w14
    strb     w14, [x16, #0x1a]
    ldrb     w14, [x15, #0x1b]
    mov      w15, #0xca
    eor      w14, w14, w15
    strb     w14, [x16, #0x1b]
    adrp     x14, #0x577000
    add      x14, x14, #0x610
    ldrb     w15, [x14]
    mov      w16, #0x59
    eor      w16, w15, w16
    adrp     x15, #0x577000
    add      x15, x15, #0x630
    strb     w16, [x15]
    ldrb     w16, [x14, #1]
    strb     w16, [x15, #1]
    ldrb     w16, [x14, #2]
    mov      w1, #0x57
    eor      w16, w16, w1
    strb     w16, [x15, #2]
    ldrb     w16, [x14, #3]
    mov      w1, #0xb1
    eor      w16, w16, w1
    strb     w16, [x15, #3]
    ldrb     w16, [x14, #4]
    eor      w13, w16, w13
    strb     w13, [x15, #4]
    ldrb     w13, [x14, #5]
    mov      w16, #0xd7
    eor      w13, w13, w16
    strb     w13, [x15, #5]
    ldrb     w13, [x14, #6]
    eor      w13, w13, #0x11111111
    strb     w13, [x15, #6]
    ldrb     w13, [x14, #7]
    mov      w16, #0xab
    eor      w13, w13, w16
    strb     w13, [x15, #7]
    ldrb     w13, [x14, #8]
    mov      w16, #0xc6
    eor      w13, w13, w16
    strb     w13, [x15, #8]
    ldrb     w13, [x14, #9]
    mov      w16, #0x19
    eor      w13, w13, w16
    strb     w13, [x15, #9]
    ldrb     w13, [x14, #0xa]
    mov      w16, #0x27
    eor      w13, w13, w16
    strb     w13, [x15, #0xa]
    ldrb     w13, [x14, #0xb]
    mov      w16, #0x85
    eor      w13, w13, w16
    strb     w13, [x15, #0xb]
    ldrb     w13, [x14, #0xc]
    eor      w10, w13, w10
    strb     w10, [x15, #0xc]
    ldrb     w10, [x14, #0xd]
    mov      w13, #0x42
    eor      w10, w10, w13
    strb     w10, [x15, #0xd]
    ldrb     w10, [x14, #0xe]
    eor      w10, w10, #0x18
    strb     w10, [x15, #0xe]
    ldrb     w10, [x14, #0xf]
    eor      w10, w10, w17
    strb     w10, [x15, #0xf]
    ldrb     w10, [x14, #0x10]
    eor      w10, w10, w0
    strb     w10, [x15, #0x10]
    ldrb     w10, [x14, #0x11]
    mov      w13, #0x23
    eor      w10, w10, w13
    strb     w10, [x15, #0x11]
    ldrb     w10, [x14, #0x12]
    mov      w13, #0x4d
    eor      w10, w10, w13
    strb     w10, [x15, #0x12]
    ldrb     w10, [x14, #0x13]
    mov      w13, #0xf5
    eor      w10, w10, w13
    strb     w10, [x15, #0x13]
    ldrb     w10, [x14, #0x14]
    mov      w13, #0x37
    eor      w10, w10, w13
    strb     w10, [x15, #0x14]
    ldrb     w10, [x14, #0x15]
    eor      w10, w10, #0x66666666
    strb     w10, [x15, #0x15]
    adrp     x10, #0x577000
    add      x10, x10, #0x5d0
    ldrb     w13, [x10]
    mov      w14, #0xc8
    eor      w13, w13, w14
    adrp     x14, #0x577000
    add      x14, x14, #0x5f0
    strb     w13, [x14]
    ldrb     w13, [x10, #1]
    mov      w15, #0xde
    eor      w13, w13, w15
    strb     w13, [x14, #1]
    ldrb     w13, [x10, #2]
    eor      w13, w13, #0xcccccccc
    strb     w13, [x14, #2]
    ldrb     w13, [x10, #3]
    mov      w15, #0x25
    eor      w13, w13, w15
    strb     w13, [x14, #3]
    ldrb     w13, [x10, #4]
    eor      w13, w13, #0xaaaaaaaa
    strb     w13, [x14, #4]
    ldrb     w13, [x10, #5]
    mov      w15, #0x3b
    eor      w13, w13, w15
    strb     w13, [x14, #5]
    ldrb     w13, [x10, #6]
    eor      w13, w13, #0xf0
    strb     w13, [x14, #6]
    ldrb     w13, [x10, #7]
    eor      w13, w13, #0x1c
    strb     w13, [x14, #7]
    ldrb     w13, [x10, #8]
    eor      w13, w13, #0xffffff87
    strb     w13, [x14, #8]
    ldrb     w13, [x10, #9]
    mov      w15, #0x96
    eor      w13, w13, w15
    strb     w13, [x14, #9]
    ldrb     w13, [x10, #0xa]
    mov      w15, #0xf4
    eor      w13, w13, w15
    strb     w13, [x14, #0xa]
    ldrb     w13, [x10, #0xb]
    eor      w12, w13, w12
    strb     w12, [x14, #0xb]
    ldrb     w12, [x10, #0xc]
    eor      w9, w12, w9
    strb     w9, [x14, #0xc]
    ldrb     w9, [x10, #0xd]
    mov      w12, #0xf2
    eor      w9, w9, w12
    strb     w9, [x14, #0xd]
    ldrb     w9, [x10, #0xe]
    eor      w9, w9, #0x7e
    strb     w9, [x14, #0xe]
    ldrb     w9, [x10, #0xf]
    eor      w9, w9, w11
    strb     w9, [x14, #0xf]
    ldrb     w9, [x10, #0x10]
    mov      w10, #0xce
    eor      w9, w9, w10
    strb     w9, [x14, #0x10]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x120]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x447bb0
    adrp     x0, #0x577000
    add      x0, x0, #0x770
    b        #0x447c88
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x128]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x447bd0
    adrp     x0, #0x577000
    add      x0, x0, #0x730
    b        #0x447c88
    adrp     x8, #0x4c3000
    ldr      x20, [x8, #0x130]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xea8]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    tbz      w22, #0, #0x447c18
    adrp     x0, #0x577000
    add      x0, x0, #0x7f0
    b        #0x447c88
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xeb8]
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x447c54
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x0, #0x577000
    add      x0, x0, #0x830
    b        #0x447c88
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x138]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x577000
    add      x8, x8, #0x7b0
    adrp     x9, #0x577000
    add      x9, x9, #0x830
    cmp      w19, #0
    csel     x0, x9, x8, ne
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    ret      

// -[WCLGThemeDetailViewController buildContent] IMP=0x447C98 bounds=0x447C98-0x449AF0
loc_447C98:
    stp      d15, d14, [sp, #-0xa0]!
    stp      d13, d12, [sp, #0x10]
    stp      d11, d10, [sp, #0x20]
    stp      d9, d8, [sp, #0x30]
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    sub      sp, sp, #0x170
    mov      x26, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0xa0]
    adrp     x8, #0x582000
    add      x8, x8, #0xb04
    ldar     w9, [x8]
    cbnz     w9, #0x4480f8
    adrp     x9, #0x577000
    add      x9, x9, #0x8ec
    ldrh     w10, [x9]
    mov      w11, #0xd3c0
    eor      w10, w10, w11
    adrp     x11, #0x577000
    add      x11, x11, #0x8f6
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x2365
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xc06d
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x22d9
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x1182
    eor      w9, w9, w10
    adrp     x10, #0x577000
    add      x10, x10, #0x8e2
    strh     w9, [x11, #8]
    ldrb     w9, [x10]
    mov      w11, #0xd6
    eor      w9, w9, w11
    adrp     x11, #0x577000
    add      x11, x11, #0x8e7
    strb     w9, [x11]
    ldrb     w9, [x10, #1]
    mov      w12, #0x1b
    eor      w9, w9, w12
    strb     w9, [x11, #1]
    ldrb     w9, [x10, #2]
    mov      w12, #0x96
    eor      w9, w9, w12
    strb     w9, [x11, #2]
    ldrb     w9, [x10, #3]
    mov      w12, #0x75
    eor      w9, w9, w12
    strb     w9, [x11, #3]
    ldrb     w9, [x10, #4]
    mov      w10, #0x32
    eor      w9, w9, w10
    adrp     x10, #0x577000
    add      x10, x10, #0x8ce
    strb     w9, [x11, #4]
    ldrh     w9, [x10]
    mov      w11, #0x2125
    eor      w9, w9, w11
    adrp     x11, #0x577000
    add      x11, x11, #0x8d8
    strh     w9, [x11]
    ldrh     w9, [x10, #2]
    mov      w12, #0xc69
    eor      w9, w9, w12
    strh     w9, [x11, #2]
    ldrh     w9, [x10, #4]
    mov      w12, #0xab0c
    eor      w9, w9, w12
    strh     w9, [x11, #4]
    ldrh     w9, [x10, #6]
    mov      w12, #0xa10f
    eor      w9, w9, w12
    strh     w9, [x11, #6]
    ldrh     w9, [x10, #8]
    mov      w10, #0xfbf4
    eor      w9, w9, w10
    adrp     x10, #0x577000
    add      x10, x10, #0x8c2
    strh     w9, [x11, #8]
    ldrh     w9, [x10]
    mov      w11, #0x2f62
    eor      w9, w9, w11
    adrp     x11, #0x577000
    add      x11, x11, #0x8c8
    strh     w9, [x11]
    ldrh     w9, [x10, #2]
    mov      w12, #0xbb50
    eor      w9, w9, w12
    strh     w9, [x11, #2]
    ldrh     w9, [x10, #4]
    mov      w10, #0x45d8
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x577000
    add      x9, x9, #0x8a6
    ldrb     w10, [x9]
    mov      w11, #0xd7
    eor      w10, w10, w11
    adrp     x11, #0x577000
    add      x11, x11, #0x8b4
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x1e
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x6e
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xffffffdf
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x25
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x9c
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0xe8
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    eor      w10, w10, #0xffffff81
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w12, #0x9d
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    eor      w10, w10, #0xe
    strb     w10, [x11, #9]
    ldrb     w10, [x9, #0xa]
    eor      w10, w10, #0x30
    strb     w10, [x11, #0xa]
    ldrb     w10, [x9, #0xb]
    eor      w10, w10, #0xffffff87
    strb     w10, [x11, #0xb]
    ldrb     w10, [x9, #0xc]
    mov      w12, #0xc5
    eor      w10, w10, w12
    strb     w10, [x11, #0xc]
    ldrb     w9, [x9, #0xd]
    eor      w9, w9, #0x3c
    strb     w9, [x11, #0xd]
    adrp     x9, #0x577000
    add      x9, x9, #0x900
    ldrb     w10, [x9]
    mov      w11, #0x46
    eor      w10, w10, w11
    adrp     x11, #0x577000
    add      x11, x11, #0x907
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x3c
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x63
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x7d
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x71
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w9, [x9, #6]
    mov      w10, #0x1a
    eor      w9, w9, w10
    strb     w9, [x11, #6]
    adrp     x9, #0x577000
    add      x9, x9, #0x89a
    ldrh     w10, [x9]
    mov      w11, #0xfdbc
    eor      w10, w10, w11
    adrp     x11, #0x577000
    add      x11, x11, #0x8a0
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xbcca
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0xfab1
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x577000
    add      x9, x9, #0x886
    ldrh     w10, [x9]
    mov      w11, #0xb96
    adrp     x12, #0x577000
    add      x12, x12, #0x890
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0xa531
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0xc405
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x42f
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x958c
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    adrp     x9, #0x577000
    add      x9, x9, #0x850
    ldrh     w10, [x9]
    mov      w11, #0x1307
    adrp     x12, #0x577000
    add      x12, x12, #0x870
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x9ca3
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0xda49
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0xa007
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0xb284
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w10, [x9, #0xa]
    mov      w11, #0x8153
    eor      w10, w10, w11
    strh     w10, [x12, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w11, #0xd653
    eor      w10, w10, w11
    strh     w10, [x12, #0xc]
    ldrh     w10, [x9, #0xe]
    mov      w11, #0xd1a9
    eor      w10, w10, w11
    strh     w10, [x12, #0xe]
    ldrh     w10, [x9, #0x10]
    mov      w11, #0x8d3a
    eor      w10, w10, w11
    strh     w10, [x12, #0x10]
    ldrh     w10, [x9, #0x12]
    mov      w11, #0x1090
    eor      w10, w10, w11
    strh     w10, [x12, #0x12]
    ldrh     w9, [x9, #0x14]
    mov      w10, #0x8ccc
    eor      w9, w9, w10
    strh     w9, [x12, #0x14]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x10
    sub      x9, x29, #0x90
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    sub      x8, sp, #0x30
    sub      x9, x29, #0x98
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    sub      x8, sp, #0x40
    stur     x8, [x29, #-0xd8]
    mov      sp, x8
    sub      x8, sp, #0x80
    sub      x9, x29, #0x48
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d2
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x130]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0xb38]
    mov      x8, #0x4059000000000000
    fmov     d2, x8
    fmov     d0, #20.00000000
    fmov     d1, #16.00000000
    mov      x1, x27
    stur     x27, [x29, #-0xd0]
    fmov     d3, d2
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x430]
    stur     x1, [x29, #-0xf8]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    mov      x0, x22
    stur     x1, [x29, #-0xe0]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xac8]
    mov      x0, x22
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, #22.00000000
    stur     x1, [x29, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x628]
    ldr      x20, [x8]
    mov      x0, x22
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb50]
    sub      x8, x29, #0x10
    stur     x1, [x8, #-0x100]
    sub      x8, x29, #8
    stur     x20, [x8, #-0x100]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb10]
    fmov     d0, #0.50000000
    sub      x8, x29, #0x18
    stur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    mov      x25, x8
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xbf0]
    adrp     x8, #0x491000
    ldr      d10, [x8, #0x3e0]
    fmov     d0, #0.50000000
    mov      x1, x23
    fmov     d1, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac0]
    sub      x8, x29, #0x20
    stur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x22
    stur     x21, [x29, #-0xa8]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb18]
    sub      x8, x29, #0x28
    stur     x1, [x8, #-0x100]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x90]
    adrp     x8, #0x491000
    ldr      d11, [x8, #0x3f8]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x400]
    stur     x23, [x29, #-0xb0]
    mov      x1, x23
    fmov     d0, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x0, x22
    sub      x8, x29, #0x30
    stur     x1, [x8, #-0x100]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x19, [x8, #0x480]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe90]
    mov      x0, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe70]
    mov      x0, x28
    sub      x8, x29, #0xc0
    stur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xea0]
    mov      x0, x19
    mov      x2, x20
    mov      x3, x21
    mov      x4, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x25, [x8, #0xd38]
    mov      x0, x26
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0xb40]
    mov      x1, x20
    sub      x8, x29, #0xd8
    stur     x22, [x8, #-0x100]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x8, #-0x3f9f000000000000
    fmov     d0, x8
    fadd     d0, d8, d0
    fmov     d1, #-20.00000000
    fadd     d12, d0, d1
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x8, #0x4061000000000000
    fmov     d13, x8
    fmov     d1, #20.00000000
    fmov     d3, #30.00000000
    mov      x1, x27
    fmov     d0, d13
    fmov     d2, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x360]
    ldr      d9, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    fmov     d0, #22.00000000
    sub      x8, x29, #0xb0
    stur     x1, [x8, #-0x100]
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0xec8]
    mov      x0, x21
    mov      x1, x27
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x2f8]
    sub      x8, x29, #0xd0
    stur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xea8]
    mov      x0, x21
    mov      x1, x22
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x7f8]
    mov      x0, x21
    mov      x1, x23
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8d0]
    mov      x0, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x6f8]
    mov      x0, x21
    mov      x1, x24
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x248]
    mov      x8, #0x404e000000000000
    fmov     d1, x8
    mov      x0, x21
    sub      x8, x29, #0xf8
    stur     x1, [x8, #-0x100]
    fmov     d0, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x8, #0x404d000000000000
    fmov     d0, x8
    fcmp     d1, d0
    fcsel    d3, d0, d1, gt
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    fmov     d1, #20.00000000
    mov      x0, x21
    sub      x8, x29, #0x88
    stur     x1, [x8, #-0x100]
    fmov     d0, d13
    fmov     d2, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    sub      x8, x29, #0xb8
    stur     x25, [x8, #-0x100]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    stur     x20, [x29, #-0xc8]
    mov      x1, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x19, [x8, #0x770]
    sub      x8, x29, #0xa0
    stur     x21, [x8, #-0x100]
    mov      x0, x21
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616cc // _CGRectGetMaxY
    fmov     d1, #4.00000000
    fadd     d1, d0, d1
    fmov     d3, #20.00000000
    mov      x0, x20
    ldur     x1, [x29, #-0xd0]
    fmov     d0, d13
    fmov     d2, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x800]
    fmov     d0, #14.00000000
    sub      x8, x29, #0x78
    stur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    sub      x8, x29, #0x60
    stur     x27, [x8, #-0x100]
    mov      x1, x27
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc18]
    sub      x8, x29, #0x80
    stur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    sub      x8, x29, #0x68
    stur     x22, [x8, #-0x100]
    mov      x1, x22
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x20, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    sub      x8, x29, #0xf0
    stur     x23, [x8, #-0x100]
    mov      x1, x23
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0xe68]
    sub      x8, x29, #0x50
    stur     x28, [x8, #-0x100]
    mov      x0, x28
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    sub      x8, x29, #0xa8
    stur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    adrp     x27, #0x4be000
    adrp     x25, #0x577000
    add      x25, x25, #0xab0
    adrp     x28, #0x577000
    add      x28, x28, #0xaf0
    sub      x8, x29, #0x70
    stur     x24, [x8, #-0x100]
    sub      x8, x29, #0x50
    cbz      x0, #0x4487b8
    ldur     x0, [x8, #-0x100]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    sub      x8, x29, #0xc0
    ldur     x25, [x8, #-0x100]
    b        #0x448800
    ldur     x0, [x8, #-0x100]
    sub      x8, x29, #0xc0
    ldur     x23, [x8, #-0x100]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [x27, #0x358]
    adrp     x2, #0x577000
    add      x2, x2, #0xb30
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    csel     x2, x28, x25, ne
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x23
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x7f0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    sub      x8, x29, #0xa0
    ldur     x0, [x8, #-0x100]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616cc // _CGRectGetMaxY
    fmov     d1, #4.00000000
    fadd     d13, d0, d1
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x8, #0x4044000000000000
    fmov     d0, x8
    fcmp     d3, d0
    fcsel    d3, d0, d3, gt
    mov      x8, #0x4061000000000000
    fmov     d14, x8
    mov      x0, x20
    sub      x8, x29, #0x88
    ldur     x1, [x8, #-0x100]
    fmov     d0, d14
    fmov     d1, d13
    fmov     d2, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    sub      x8, x29, #0xb8
    ldur     x28, [x8, #-0x100]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x20
    mov      x20, x0
    ldur     x1, [x29, #-0xc8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xe0
    stur     x21, [x8, #-0x100]
    mov      x0, x21
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616cc // _CGRectGetMaxY
    fmov     d1, #10.00000000
    fadd     d0, d0, d1
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x5c0]
    fmaxnm   d13, d0, d1
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x6c8]
    bl       #0x461ba0 // _objc_alloc
    mov      x8, #0x405b000000000000
    fmov     d2, x8
    mov      x8, #0x4040000000000000
    fmov     d3, x8
    ldur     x1, [x29, #-0xd0]
    fmov     d0, d14
    fmov     d1, d13
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x140]
    mov      x0, x26
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x19, [x8, #0x148]
    mov      x0, x26
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x150]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x158]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x160]
    mov      x0, x20
    mov      x2, x21
    mov      x3, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x90
    ldur     x20, [x8, #-0x100]
    mov      x0, x20
    mov      x1, x26
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    sub      x9, x29, #0x98
    ldur     x21, [x9, #-0x100]
    str      x8, [x21]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x21, #8]
    adrp     x8, #0x449000
    add      x8, x8, #0xaf0
    adrp     x9, #0x4a1000
    add      x9, x9, #0xdf0
    stp      x8, x9, [x21, #0x10]
    add      x0, x21, #0x20
    mov      x1, x20
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x26
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldur     x24, [x29, #-0xd8]
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb48]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x26
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x21
    ldur     x1, [x29, #-0xc8]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x8, #-0x3fa3000000000000
    fmov     d0, x8
    fadd     d2, d12, d0
    adrp     x8, #0x492000
    ldr      d0, [x8, #0x5c8]
    mov      x8, #0x4040000000000000
    fmov     d3, x8
    ldur     x1, [x29, #-0xd0]
    fmov     d1, d13
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x170]
    mov      x0, x26
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x378]
    ldr      d1, [x8]
    fmov     d0, #12.00000000
    sub      x8, x29, #0xb0
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c3000
    ldr      x19, [x8, #0x178]
    mov      x0, x26
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    sub      x8, x29, #0x60
    ldur     x1, [x8, #-0x100]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    sub      x8, x29, #0x80
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x26
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    sub      x8, x29, #0x68
    ldur     x1, [x8, #-0x100]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x2, #0x4a6000
    add      x2, x2, #0xd8
    sub      x8, x29, #0x70
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x26
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x21
    ldur     x1, [x29, #-0xc8]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x8, #0x4040000000000000
    fmov     d0, x8
    fadd     d0, d13, d0
    mov      x8, #0x405d000000000000
    fmov     d1, x8
    fmaxnm   d0, d0, d1
    fmov     d1, #22.00000000
    fadd     d0, d0, d1
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x180]
    fmov     d2, #20.00000000
    mov      x0, x26
    sub      x8, x29, #0xc8
    stur     x1, [x8, #-0x100]
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    fmov     d12, d0
    sub      x8, x29, #0x50
    ldur     x0, [x8, #-0x100]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [x27, #0x358]
    adrp     x2, #0x577000
    add      x2, x2, #0xa70
    sub      x8, x29, #0xe8
    stur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    adrp     x23, #0x4be000
    tbz      w0, #0, #0x448d2c
    adrp     x8, #0x4c3000
    ldr      x19, [x8, #0x188]
    sub      x8, x29, #0x50
    ldur     x0, [x8, #-0x100]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [x23, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cbnz     x22, #0x448d3c
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x190]
    fmov     d2, #20.00000000
    mov      x0, x26
    fmov     d0, d12
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    fmov     d2, #20.00000000
    mov      x0, x26
    sub      x8, x29, #0xc8
    ldur     x1, [x8, #-0x100]
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    fmov     d12, d0
    b        #0x4491b4
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x19, [x8, #0x188]
    sub      x8, x29, #0x50
    ldur     x0, [x8, #-0x100]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [x23, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    cbz      x21, #0x4491b4
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x188]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x491000
    ldr      d13, [x8, #0x928]
    fmov     d0, xzr
    ldur     x1, [x29, #-0xd0]
    fmov     d1, d12
    fmov     d2, d8
    fmov     d3, d13
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbe8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x440]
    ldr      d0, [x8]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x198]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    ldur     x1, [x29, #-0xe0]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    stur     x20, [x29, #-0xf0]
    sub      x8, x29, #0x100
    stur     d9, [x8, #-0x100]
    stur     x26, [x29, #-0xe8]
    movi     v0.16b, #0
    stp      q0, q0, [x24, #0x20]
    stp      q0, q0, [x24]
    sub      x8, x29, #0x50
    ldur     x0, [x8, #-0x100]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    sub      x8, x29, #0x58
    stur     x1, [x8, #-0x100]
    mov      x2, x24
    sub      x8, x29, #0x48
    ldur     x3, [x8, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    fmov     d14, #20.00000000
    cbz      x0, #0x44910c
    mov      x27, x0
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x410]
    fmul     d15, d8, d0
    ldr      x8, [x24, #0x10]
    ldr      x8, [x8]
    sub      x9, x29, #0x38
    stur     x8, [x9, #-0x100]
    fmov     d0, #12.00000000
    fadd     d9, d15, d0
    sub      x8, x29, #0x40
    stur     x19, [x8, #-0x100]
    mov      x19, #0
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x440]
    adrp     x8, #0x4c3000
    ldr      x8, [x8, #0x1a0]
    stp      x8, x9, [x29, #-0xc0]
    adrp     x8, #0x4c3000
    ldr      x23, [x8, #0x1a8]
    adrp     x8, #0x4bf000
    ldr      x25, [x8, #0x440]
    adrp     x8, #0x4bf000
    ldr      x21, [x8, #0x450]
    ldr      x8, [x24, #0x10]
    ldr      x8, [x8]
    sub      x9, x29, #0x38
    ldur     x9, [x9, #-0x100]
    cmp      x8, x9
    b.eq     #0x448ec4
    sub      x8, x29, #0x40
    ldur     x0, [x8, #-0x100]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x24, #8]
    ldr      x24, [x8, x19, lsl #3]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461ba0 // _objc_alloc
    fmov     d1, xzr
    ldur     x1, [x29, #-0xd0]
    fmov     d0, d14
    fmov     d2, d15
    fmov     d3, d13
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    ldur     x1, [x29, #-0xf8]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    ldur     x1, [x29, #-0xe0]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    ldur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    fmov     d0, #18.00000000
    ldur     x1, [x29, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    sub      x8, x29, #0x10
    ldur     x1, [x8, #-0x100]
    sub      x8, x29, #8
    ldur     x2, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    fmov     d0, #0.50000000
    sub      x8, x29, #0x18
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    fmov     d0, #0.50000000
    fmov     d1, #0.25000000
    ldur     x1, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    sub      x8, x29, #0x20
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x22
    ldur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    sub      x8, x29, #0x28
    ldur     x1, [x8, #-0x100]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    ldur     x1, [x29, #-0xb0]
    fmov     d0, d11
    fmov     d1, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x22
    sub      x8, x29, #0x30
    ldur     x1, [x8, #-0x100]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldur     x1, [x29, #-0xb8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x480]
    ldur     x1, [x29, #-0xc0]
    mov      x2, x24
    mov      x3, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x3f8]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x25
    ldur     x2, [x29, #-0xe8]
    mov      x3, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x22
    mov      x1, x21
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    ldur     x0, [x29, #-0xf0]
    ldur     x1, [x29, #-0xc8]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    fadd     d14, d9, d14
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    add      x19, x19, #1
    cmp      x27, x19
    ldur     x24, [x29, #-0xd8]
    b.ne     #0x448ea0
    sub      x8, x29, #0x40
    ldur     x19, [x8, #-0x100]
    mov      x0, x19
    sub      x8, x29, #0x58
    ldur     x1, [x8, #-0x100]
    mov      x2, x24
    sub      x8, x29, #0x48
    ldur     x3, [x8, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    cbnz     x0, #0x448e70
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fmov     d0, #-12.00000000
    fadd     d0, d14, d0
    fmov     d1, #20.00000000
    fadd     d0, d0, d1
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x730]
    ldur     x20, [x29, #-0xf0]
    mov      x0, x20
    fmov     d1, d13
    bl       #0x461c6c // _objc_msgSend
    ldur     x26, [x29, #-0xe8]
    sub      x8, x29, #0xb8
    ldur     x28, [x8, #-0x100]
    mov      x0, x26
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0xc8]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x492000
    ldr      d0, [x8, #0x5d0]
    fadd     d0, d12, d0
    fmov     d2, #20.00000000
    mov      x0, x26
    sub      x8, x29, #0xc8
    ldur     x1, [x8, #-0x100]
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    fmov     d12, d0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xc0
    ldur     x25, [x8, #-0x100]
    sub      x8, x29, #0x100
    ldur     d9, [x8, #-0x100]
    adrp     x8, #0x4c3000
    ldr      x20, [x8, #0x1b0]
    sub      x8, x29, #0x50
    ldur     x0, [x8, #-0x100]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    sub      x8, x29, #0xa8
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cbz      x21, #0x449488
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    sub      x8, x29, #0x70
    ldur     x23, [x8, #-0x100]
    mov      x8, #-0x3fbc000000000000
    fmov     d0, x8
    fadd     d10, d8, d0
    fmov     d0, #20.00000000
    fmov     d3, #22.00000000
    ldur     x1, [x29, #-0xd0]
    fmov     d1, d12
    fmov     d2, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    fmov     d0, #20.00000000
    sub      x8, x29, #0xb0
    ldur     x1, [x8, #-0x100]
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x19
    sub      x8, x29, #0x60
    ldur     x1, [x8, #-0x100]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    sub      x8, x29, #0xd0
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x19
    sub      x8, x29, #0x68
    ldur     x1, [x8, #-0x100]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x577000
    add      x2, x2, #0xa30
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldur     x1, [x29, #-0xc8]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    fmov     d0, #30.00000000
    fadd     d9, d12, d0
    fmov     d0, #20.00000000
    fmov     d3, xzr
    ldur     x1, [x29, #-0xd0]
    fmov     d1, d9
    fmov     d2, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    fmov     d0, #15.00000000
    sub      x8, x29, #0x78
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x21
    sub      x8, x29, #0x60
    ldur     x1, [x8, #-0x100]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    sub      x8, x29, #0xd0
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x21
    sub      x8, x29, #0x68
    ldur     x1, [x8, #-0x100]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    sub      x8, x29, #0xf0
    ldur     x1, [x8, #-0x100]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    sub      x8, x29, #0x50
    ldur     x0, [x8, #-0x100]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    mov      x1, x23
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x8, #0x7fefffffffffffff
    fmov     d1, x8
    mov      x0, x21
    sub      x8, x29, #0xf8
    ldur     x1, [x8, #-0x100]
    fmov     d0, d10
    bl       #0x461c6c // _objc_msgSend
    fmov     d11, d1
    fmov     d0, #20.00000000
    mov      x0, x21
    sub      x8, x29, #0x88
    ldur     x1, [x8, #-0x100]
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldur     x1, [x29, #-0xc8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    fmov     d0, #18.00000000
    fadd     d0, d11, d0
    fadd     d0, d9, d0
    fmov     d2, #20.00000000
    mov      x0, x26
    sub      x8, x29, #0xc8
    ldur     x1, [x8, #-0x100]
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    fmov     d12, d0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x1b8]
    fmov     d2, #20.00000000
    mov      x0, x26
    fmov     d0, d12
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x8, #-0x3fbc000000000000
    fmov     d0, x8
    fadd     d10, d8, d0
    fmov     d0, #20.00000000
    fmov     d3, #18.00000000
    ldur     x1, [x29, #-0xd0]
    fmov     d1, d9
    fmov     d2, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    fmov     d0, #13.00000000
    sub      x8, x29, #0x78
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    sub      x8, x29, #0x60
    ldur     x1, [x8, #-0x100]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    sub      x8, x29, #0x80
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    sub      x8, x29, #0x68
    ldur     x1, [x8, #-0x100]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x577000
    add      x2, x2, #0x9f0
    mov      x0, x19
    sub      x8, x29, #0x70
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldur     x1, [x29, #-0xc8]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    fmov     d0, #20.00000000
    fadd     d1, d9, d0
    fmov     d0, #-20.00000000
    fadd     d2, d10, d0
    fmov     d0, #20.00000000
    fmov     d3, #24.00000000
    ldur     x1, [x29, #-0xd0]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    fmov     d0, #17.00000000
    sub      x8, x29, #0x78
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    sub      x8, x29, #0x60
    ldur     x1, [x8, #-0x100]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x480]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x40]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    sub      x8, x29, #0x68
    ldur     x1, [x8, #-0x100]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x23, [x8, #0x1c0]
    sub      x8, x29, #0x50
    ldur     x0, [x8, #-0x100]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    sub      x8, x29, #0xa8
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    cbz      x0, #0x4496a0
    sub      x8, x29, #0x50
    ldur     x0, [x8, #-0x100]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    b        #0x4496a8
    adrp     x23, #0x577000
    add      x23, x23, #0x9b0
    mov      x0, x20
    sub      x8, x29, #0x70
    ldur     x1, [x8, #-0x100]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      x22, #0x4496c8
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldur     x1, [x29, #-0xc8]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x25
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461ba0 // _objc_alloc
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x80]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1d8]
    adrp     x2, #0x577000
    add      x2, x2, #0x970
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x428]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xdf0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc40]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    fmov     d0, #-20.00000000
    fadd     d0, d8, d0
    fmov     d1, #-10.00000000
    fadd     d0, d0, d1
    fmov     d1, #24.00000000
    fadd     d1, d9, d1
    fmov     d2, #8.00000000
    fmov     d3, #13.00000000
    mov      x0, x21
    sub      x8, x29, #0x88
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0xc8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x8, #0x404a000000000000
    fmov     d0, x8
    fadd     d1, d9, d0
    fmov     d0, #20.00000000
    fmov     d3, #18.00000000
    ldur     x1, [x29, #-0xd0]
    fmov     d2, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    fmov     d0, #13.00000000
    sub      x8, x29, #0x78
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x22
    sub      x8, x29, #0x60
    ldur     x1, [x8, #-0x100]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    sub      x8, x29, #0x80
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x22
    sub      x8, x29, #0x68
    ldur     x1, [x8, #-0x100]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x25, [x8, #0xb8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe80]
    sub      x8, x29, #0x50
    ldur     x0, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    sub      x8, x29, #0x50
    ldur     x0, [x8, #-0x100]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x2, #0x577000
    add      x2, x2, #0xb30
    sub      x8, x29, #0xe8
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    adrp     x8, #0x577000
    add      x8, x8, #0xab0
    adrp     x9, #0x577000
    add      x9, x9, #0xaf0
    csel     x8, x9, x8, ne
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0x620]
    stp      x23, x8, [sp, #-0x10]!
    adrp     x2, #0x577000
    add      x2, x2, #0x930
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    add      sp, sp, #0x10
    mov      x25, x0
    mov      x0, x22
    sub      x8, x29, #0x70
    ldur     x1, [x8, #-0x100]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldur     x1, [x29, #-0xc8]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x8, #0x4055000000000000
    fmov     d0, x8
    fadd     d0, d9, d0
    fmov     d1, #20.00000000
    fadd     d1, d0, d1
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x730]
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x98
    ldur     x8, [x8, #-0x100]
    add      x0, x8, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    sub      x8, x29, #0x90
    ldur     x0, [x8, #-0x100]
    bl       #0x461c0c // _objc_destroyWeak
    sub      x8, x29, #0xe0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xa0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xd8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x50
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0xa0]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x449a88
    sub      sp, x29, #0x90
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    ldp      d9, d8, [sp, #0x30]
    ldp      d11, d10, [sp, #0x20]
    ldp      d13, d12, [sp, #0x10]
    ldp      d15, d14, [sp], #0xa0
    ret      
    bl       #0x4618b8 // ___stack_chk_fail
    b        #0x449ac8
    b        #0x449ac8
    b        #0x449ac8
    b        #0x449ac8
    b        #0x449ac8
    b        #0x449ac8
    b        #0x449ac8
    b        #0x449ac8
    b        #0x449ac8
    b        #0x449ac8
    b        #0x449ac8
    b        #0x449ac8
    b        #0x449ac8
    b        #0x449ac8
    b        #0x449ac8
    mov      x19, x0
    sub      x8, x29, #0x98
    ldur     x8, [x8, #-0x100]
    add      x0, x8, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    sub      x8, x29, #0x90
    ldur     x0, [x8, #-0x100]
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGThemeDetailViewController addSubPackagesAtY:width:pad:] IMP=0x449B24 bounds=0x449B24-0x44AA60
loc_449B24:
    stp      d15, d14, [sp, #-0xa0]!
    stp      d13, d12, [sp, #0x10]
    stp      d11, d10, [sp, #0x20]
    stp      d9, d8, [sp, #0x30]
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    sub      sp, sp, #0x210
    str      d2, [sp, #0x198]
    fmov     d9, d1
    fmov     d8, d0
    mov      x26, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xb14
    ldar     w9, [x8]
    cbnz     w9, #0x449dfc
    adrp     x9, #0x577000
    add      x9, x9, #0xbae
    ldrh     w10, [x9]
    mov      w11, #0xb401
    adrp     x12, #0x577000
    add      x12, x12, #0xbb4
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0xcf20
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x5af6
    eor      w9, w9, w10
    strh     w9, [x12, #4]
    adrp     x9, #0x577000
    add      x9, x9, #0xb7e
    ldrh     w10, [x9]
    mov      w11, #0x3a8c
    eor      w10, w10, w11
    adrp     x11, #0x577000
    add      x11, x11, #0xb88
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x6a58
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x36a4
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xb2a5
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x86f0
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x577000
    add      x9, x9, #0xb92
    ldrb     w10, [x9]
    eor      w10, w10, #0xffffff83
    adrp     x11, #0x577000
    add      x11, x11, #0xba0
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x48
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xd
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xfffffffd
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0xa5
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0xc9
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    eor      w10, w10, #0x18
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0x4f
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    eor      w10, w10, #7
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    mov      w12, #0x7b
    eor      w10, w10, w12
    strb     w10, [x11, #9]
    ldrb     w10, [x9, #0xa]
    mov      w12, #0x2e
    eor      w10, w10, w12
    strb     w10, [x11, #0xa]
    ldrb     w10, [x9, #0xb]
    mov      w12, #0xb7
    eor      w10, w10, w12
    strb     w10, [x11, #0xb]
    ldrb     w10, [x9, #0xc]
    mov      w12, #0x9b
    eor      w10, w10, w12
    strb     w10, [x11, #0xc]
    ldrb     w9, [x9, #0xd]
    eor      w9, w9, #0xffffffc7
    adrp     x10, #0x577000
    add      x10, x10, #0xb6e
    strb     w9, [x11, #0xd]
    ldrh     w9, [x10]
    mov      w11, #0x3cca
    eor      w9, w9, w11
    adrp     x11, #0x577000
    add      x11, x11, #0xb76
    strh     w9, [x11]
    ldrh     w9, [x10, #2]
    mov      w12, #0x4dd
    eor      w9, w9, w12
    strh     w9, [x11, #2]
    ldrh     w9, [x10, #4]
    mov      w12, #0x1dab
    eor      w9, w9, w12
    strh     w9, [x11, #4]
    ldrh     w9, [x10, #6]
    mov      w10, #0xa235
    eor      w9, w9, w10
    strh     w9, [x11, #6]
    adrp     x9, #0x577000
    add      x9, x9, #0xb60
    ldrb     w10, [x9]
    mov      w11, #0x2a
    eor      w10, w10, w11
    adrp     x11, #0x577000
    add      x11, x11, #0xb67
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xfffffffb
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x2c
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xffffff81
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0xfffffff3
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0x1f
    strb     w10, [x11, #5]
    ldrb     w9, [x9, #6]
    eor      w9, w9, #0xe0
    strb     w9, [x11, #6]
    adrp     x9, #0x577000
    add      x9, x9, #0xb50
    ldrh     w10, [x9]
    mov      w11, #0x74e0
    eor      w10, w10, w11
    adrp     x11, #0x577000
    add      x11, x11, #0xb58
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x9b39
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xadda
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w9, [x9, #6]
    mov      w10, #0x5b4f
    eor      w9, w9, w10
    strh     w9, [x11, #6]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c3000
    ldr      x19, [x8, #0x130]
    mov      x0, x26
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe70]
    str      x1, [sp, #0x190]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    adrp     x2, #0x577000
    add      x2, x2, #0xd20
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x44aa14
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x600]
    mov      x0, x21
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbz      x20, #0x44aa24
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    fmov     d1, #-2.00000000
    ldr      d0, [sp, #0x198]
    str      d9, [sp, #0x10]
    fmadd    d2, d0, d1, d9
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    fmov     d3, #24.00000000
    stur     x1, [x29, #-0xe0]
    fmov     d1, d8
    str      d2, [sp, #0x188]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x360]
    ldr      d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    fmov     d0, #20.00000000
    stur     x1, [x29, #-0xe8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x0, x20
    stur     x1, [x29, #-0xf0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x2f8]
    str      x1, [sp, #0x180]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x20
    stur     x1, [x29, #-0xf8]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    adrp     x2, #0x577000
    add      x2, x2, #0xce0
    mov      x0, x20
    stur     x1, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd38]
    mov      x0, x26
    str      x1, [sp, #0x178]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    stur     x1, [x29, #-0xb0]
    str      x20, [sp, #8]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x8, #0x4041000000000000
    fmov     d0, x8
    fadd     d11, d8, d0
    mov      x0, x21
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    b.lt     #0x44a9e8
    mov      x19, #0
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x608]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0xc30]
    stp      x8, x9, [sp, #0x158]
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0x9c8]
    str      x8, [sp, #0x150]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x460]
    stur     x8, [x29, #-0xb8]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0xac8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xb48]
    stp      x8, x9, [sp, #0x140]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x628]
    ldr      x9, [x8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xb50]
    stp      x8, x9, [sp, #0x130]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0xb10]
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0xde0]
    stp      x8, x9, [sp, #0x120]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0xac0]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xb18]
    stp      x8, x9, [sp, #0x110]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x440]
    adrp     x8, #0x4c3000
    ldr      x8, [x8, #0x1c8]
    stp      x8, x9, [sp, #0x100]
    adrp     x8, #0x4bf000
    ldr      x9, [x8, #0x440]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0x450]
    stp      x8, x9, [sp, #0xf0]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x430]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x438]
    stp      x8, x9, [sp, #0xe0]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0xbf0]
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0xe90]
    stp      x8, x9, [sp, #0xd0]
    adrp     x8, #0x4c0000
    adrp     x9, #0x4be000
    ldr      x8, [x8, #0xea0]
    str      x8, [sp, #0xc8]
    adrp     x13, #0x4bf000
    adrp     x14, #0x4bf000
    adrp     x12, #0x4bf000
    ldr      x8, [x9, #0x4d8]
    stur     x8, [x29, #-0xa8]
    adrp     x10, #0x4a0000
    ldr      x10, [x10, #0x388]
    adrp     x8, #0x4c0000
    adrp     x9, #0x4be000
    ldr      d12, [x10]
    adrp     x10, #0x4bf000
    adrp     x11, #0x4be000
    ldr      x13, [x13, #0x8d0]
    str      x13, [sp, #0xc0]
    mov      x13, #0x404e000000000000
    fmov     d13, x13
    ldr      x13, [x14, #0x800]
    str      x13, [sp, #0xb0]
    mov      x13, #0x4045000000000000
    fmov     d14, x13
    adrp     x13, #0x491000
    ldr      d0, [x13, #0x3f8]
    str      d0, [sp, #0xa8]
    mov      x13, #-0x3fb0000000000000
    ldr      x12, [x12, #0xc18]
    stp      x13, x12, [sp, #0x98]
    adrp     x12, #0x491000
    ldr      d0, [x12, #0x400]
    str      d0, [sp, #0x90]
    mov      x12, #-0x3fbc000000000000
    str      x12, [sp, #0x88]
    mov      x12, #0x4050000000000000
    fmov     d8, x12
    mov      x12, #0x4040000000000000
    fmov     d10, x12
    adrp     x12, #0x491000
    ldr      d15, [x12, #0x5a0]
    adrp     x12, #0x491000
    ldr      d0, [x12, #0x460]
    str      d0, [sp, #0x40]
    adrp     x12, #0x491000
    ldr      d0, [x12, #0x950]
    str      d0, [sp, #0x38]
    adrp     x12, #0x491000
    ldr      d0, [x12, #0x3e0]
    str      d0, [sp, #0x30]
    adrp     x12, #0x4c0000
    ldr      x27, [x8, #0xe68]
    ldr      x8, [x9, #0x338]
    str      x8, [sp, #0x78]
    ldr      x9, [x10, #0x1d8]
    ldr      x8, [x11, #0x428]
    stp      x8, x9, [sp, #0x68]
    ldr      x9, [x12, #0xdf0]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xc40]
    stp      x8, x9, [sp, #0x58]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x678]
    str      x8, [sp, #0x50]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x448]
    stur     x8, [x29, #-0x100]
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0xeb8]
    str      x8, [sp, #0x48]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x8f8]
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0xea8]
    stp      x8, x9, [sp, #0x20]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0x1f8]
    str      x8, [sp, #0x18]
    stp      x21, x26, [sp, #0x168]
    str      x25, [sp, #0xb8]
    str      x27, [sp, #0x80]
    mov      x0, x21
    ldr      x1, [sp, #0x160]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xd8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    ldur     x23, [x29, #-0xe0]
    mov      x1, x23
    ldr      d0, [sp, #0x198]
    fmov     d1, d11
    ldr      d2, [sp, #0x188]
    fmov     d3, d13
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    ldr      x1, [sp, #0x158]
    stur     x19, [x29, #-0xc0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x480]
    mov      x21, x8
    ldr      x1, [sp, #0x150]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x22
    ldur     x1, [x29, #-0xb8]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldr      x20, [sp, #0x148]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    fmov     d0, #14.00000000
    ldr      x27, [sp, #0x140]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x25, [sp, #0x130]
    mov      x1, x25
    mov      x28, x26
    ldr      x26, [sp, #0x138]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    fmov     d0, #0.50000000
    ldr      x1, [sp, #0x128]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [x21, #0x480]
    ldr      x1, [sp, #0x120]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    ldr      x1, [sp, #0x118]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x22
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x1, [sp, #0x110]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldr      x1, [sp, #0x108]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x3f8]
    bl       #0x461ba0 // _objc_alloc
    ldp      x1, x3, [sp, #0xf8]
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x22
    ldr      x1, [sp, #0xf0]
    stur     x2, [x29, #-0xc8]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461ba0 // _objc_alloc
    fmov     d0, #10.00000000
    fmov     d1, #9.00000000
    mov      x1, x23
    fmov     d2, d14
    fmov     d3, d14
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    ldr      x1, [sp, #0xe8]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    ldr      x1, [sp, #0xe0]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    fmov     d0, #10.00000000
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x25
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x27, #0x4c4000
    ldr      x0, [x27, #0x90]
    ldr      x1, [sp, #0xd8]
    ldr      d0, [sp, #0xa8]
    ldr      d1, [sp, #0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x28
    ldur     x1, [x29, #-0xb8]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x19, [x8, #0x480]
    ldur     x25, [x29, #-0xd8]
    mov      x0, x25
    ldr      x1, [sp, #0xd0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x25
    ldr      x1, [sp, #0x190]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x19
    ldr      x1, [sp, #0xc8]
    mov      x2, x21
    mov      x3, x24
    mov      x4, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldur     x20, [x29, #-0xb0]
    mov      x1, x20
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    ldur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    ldr      d0, [sp, #0x98]
    fadd     d0, d2, d0
    ldr      d1, [sp, #0x88]
    fadd     d9, d0, d1
    adrp     x24, #0x4c4000
    ldr      x0, [x24, #0x158]
    bl       #0x461ba0 // _objc_alloc
    fmov     d1, #11.00000000
    fmov     d3, #20.00000000
    mov      x21, x23
    mov      x1, x23
    fmov     d0, d8
    fmov     d2, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    adrp     x26, #0x4c4000
    ldr      x0, [x26, #0x218]
    fmov     d0, #15.00000000
    ldur     x1, [x29, #-0xe8]
    fmov     d1, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x24
    ldur     x23, [x29, #-0xf0]
    mov      x1, x23
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [x27, #0x90]
    ldr      x1, [sp, #0x180]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x24
    ldur     x27, [x29, #-0xf8]
    mov      x1, x27
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    ldr      x1, [sp, #0xc0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x24
    ldur     x1, [x29, #-0xa0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    mov      x1, x20
    stur     x24, [x29, #-0xd0]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    fmov     d3, #18.00000000
    mov      x1, x21
    fmov     d0, d8
    fmov     d1, d10
    fmov     d2, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    ldr      x0, [x26, #0x218]
    fmov     d0, #12.00000000
    ldr      x1, [sp, #0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x19
    mov      x1, x23
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    ldr      x1, [sp, #0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x19
    mov      x1, x27
    ldr      x27, [sp, #0x80]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x1, [sp, #0x78]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x44a720
    mov      x0, x25
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x19
    ldur     x1, [x29, #-0xa0]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    b        #0x44a734
    mov      x0, x19
    ldur     x1, [x29, #-0xa0]
    adrp     x2, #0x577000
    add      x2, x2, #0xc20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldur     x20, [x29, #-0xb0]
    mov      x1, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461ba0 // _objc_alloc
    mov      x24, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x80]
    ldr      x1, [sp, #0x70]
    adrp     x2, #0x577000
    add      x2, x2, #0xca0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x24
    ldr      x1, [sp, #0x68]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    ldr      x1, [sp, #0x60]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x24
    ldr      x1, [sp, #0x58]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #-24.00000000
    fadd     d0, d2, d0
    fmov     d2, #8.00000000
    fmov     d3, #13.00000000
    mov      x0, x24
    ldr      x1, [sp, #0x50]
    fmov     d1, d15
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    ldur     x1, [x29, #-0x100]
    mov      w2, #0x29
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    mov      x1, x20
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    ldr      x1, [sp, #0x48]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x44a958
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x26, x0
    mov      x0, x22
    ldur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x8, #-0x3fa9000000000000
    fmov     d0, x8
    fadd     d0, d2, d0
    fmov     d1, #20.00000000
    fmov     d3, #20.00000000
    mov      x0, x26
    ldur     x1, [x29, #-0xe0]
    fmov     d2, d13
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    fmov     d0, #11.00000000
    ldur     x1, [x29, #-0xe8]
    fmov     d1, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x26
    ldur     x1, [x29, #-0xf0]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    fmov     d3, #1.00000000
    ldr      x1, [sp, #0x28]
    ldp      d1, d0, [sp, #0x38]
    ldr      d2, [sp, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x26
    ldur     x1, [x29, #-0xf8]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    ldr      x1, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    adrp     x8, #0x577000
    add      x8, x8, #0xc60
    adrp     x9, #0x577000
    add      x9, x9, #0xbe0
    csel     x2, x9, x8, ne
    mov      x0, x26
    ldur     x1, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    ldr      x1, [sp, #0x18]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    ldur     x1, [x29, #-0x100]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    mov      x1, x20
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldp      x26, x1, [sp, #0x170]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x8, #0x4051000000000000
    fmov     d0, x8
    fadd     d11, d11, d0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xd0]
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xc8]
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldur     x19, [x29, #-0xc0]
    add      x19, x19, #1
    ldr      x21, [sp, #0x168]
    mov      x0, x21
    ldr      x1, [sp, #0xb8]
    bl       #0x461c6c // _objc_msgSend
    cmp      x19, x0
    b.lt     #0x44a224
    fmov     d0, #10.00000000
    fadd     d0, d11, d0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x180]
    mov      x0, x26
    ldr      d1, [sp, #0x10]
    ldr      d2, [sp, #0x198]
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    ldr      x22, [sp, #8]
    b        #0x44aa1c
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    fmov     d0, d8
    add      sp, sp, #0x210
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    ldp      d9, d8, [sp, #0x30]
    ldp      d11, d10, [sp, #0x20]
    ldp      d13, d12, [sp, #0x10]
    ldp      d15, d14, [sp], #0xa0
    ret      

// -[WCLGThemeDetailViewController subPackageTapped:] IMP=0x44AA60 bounds=0x44AA60-0x44AC3C
loc_44AA60:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    mov      x0, x2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x470]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x130]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    tbnz     x21, #0x3f, #0x44ac20
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cmp      x21, x0
    b.ge     #0x44ac20
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x4b8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xfe8]
    adrp     x3, #0x4a5000
    add      x3, x3, #0xeb8
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1b8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f0]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x328]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c2000
    ldr      x4, [x8, #0xd8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xba8]
    mov      w2, #0x18
    mov      x3, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbb0]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbb8]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb50]
    mov      x0, x23
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x19
    mov      x2, x23
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    b        #0x461c9c // _objc_release

// -[WCLGThemeDetailViewController wclgDismissModal] IMP=0x44AC40 bounds=0x44AC40-0x44AC54
loc_44AC40:
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb38]
    mov      w2, #1
    mov      x3, #0
    b        #0x461c6c // _objc_msgSend

// -[WCLGThemeDetailViewController addLiveCardPreviewAtY:width:pad:] IMP=0x44AC54 bounds=0x44AC54-0x44B984
loc_44AC54:
    sub      sp, sp, #0x140
    stp      d15, d14, [sp, #0xa0]
    stp      d13, d12, [sp, #0xb0]
    stp      d11, d10, [sp, #0xc0]
    stp      d9, d8, [sp, #0xd0]
    stp      x28, x27, [sp, #0xe0]
    stp      x26, x25, [sp, #0xf0]
    stp      x24, x23, [sp, #0x100]
    stp      x22, x21, [sp, #0x110]
    stp      x20, x19, [sp, #0x120]
    stp      x29, x30, [sp, #0x130]
    add      x29, sp, #0x130
    fmov     d10, d2
    fmov     d8, d1
    fmov     d9, d0
    mov      x19, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xb24
    ldar     w9, [x8]
    cbnz     w9, #0x44aea8
    adrp     x9, #0x577000
    add      x9, x9, #0xd92
    ldrh     w10, [x9]
    mov      w11, #0xdbc2
    eor      w10, w10, w11
    adrp     x11, #0x577000
    add      x11, x11, #0xd9c
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x3360
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x8e53
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xc77c
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xd516
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x577000
    add      x9, x9, #0xd84
    ldrb     w10, [x9]
    mov      w11, #0xe4
    eor      w10, w10, w11
    adrp     x11, #0x577000
    add      x11, x11, #0xd8b
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x1e
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0x22222222
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x3d
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0xfffffff9
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x9a
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w9, [x9, #6]
    eor      w9, w9, #0xffffffc3
    strb     w9, [x11, #6]
    adrp     x9, #0x577000
    add      x9, x9, #0xd74
    ldrb     w10, [x9]
    adrp     x11, #0x577000
    add      x11, x11, #0xd7c
    eor      w10, w10, #0xfffffffd
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x73
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x59
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #3
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0xd
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x95
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    eor      w10, w10, #0xe0
    strb     w10, [x11, #6]
    ldrb     w9, [x9, #7]
    mov      w10, #0x54
    eor      w9, w9, w10
    strb     w9, [x11, #7]
    adrp     x9, #0x577000
    add      x9, x9, #0xd40
    ldrh     w10, [x9]
    mov      w11, #0x8b1e
    eor      w10, w10, w11
    adrp     x11, #0x577000
    add      x11, x11, #0xd60
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x3d2c
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x607c
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x3ce6
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0xb6a3
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0xa7a7
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0xd9e8
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w10, [x9, #0xe]
    mov      w12, #0x6917
    eor      w10, w10, w12
    strh     w10, [x11, #0xe]
    ldrh     w10, [x9, #0x10]
    mov      w12, #0xeabb
    eor      w10, w10, w12
    strh     w10, [x11, #0x10]
    ldrh     w9, [x9, #0x12]
    mov      w10, #0x5c7
    eor      w9, w9, w10
    strh     w9, [x11, #0x12]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    fmov     d0, #-2.00000000
    fmadd    d2, d10, d0, d8
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xb38]
    fmov     d3, #24.00000000
    mov      x1, x23
    fmov     d0, d10
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x360]
    ldr      d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    str      x1, [sp, #0x70]
    fmov     d0, #20.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    str      x1, [sp, #0x68]
    mov      x0, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    mov      x24, x8
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x2f8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    str      x1, [sp, #0x60]
    mov      x0, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    str      x1, [sp, #0x78]
    adrp     x2, #0x577000
    add      x2, x2, #0xe90
    mov      x0, x21
    str      x21, [sp, #0x88]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd38]
    str      x1, [sp, #0x80]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    str      x1, [sp, #0x50]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x8, #0x4041000000000000
    fmov     d0, x8
    fadd     d9, d9, d0
    fmov     d0, d8
    bl       #0x31d4e4
    fmov     d0, #1.00000000
    fmaxnm   d10, d1, d0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x188]
    bl       #0x461ba0 // _objc_alloc
    fmov     d0, xzr
    str      x23, [sp, #0x40]
    mov      x1, x23
    fmov     d1, d9
    fmov     d2, d8
    fmov     d3, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    str      x0, [sp, #0x58]
    ldr      x0, [x24, #0x90]
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0xab8]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x0, x21
    mov      x24, x1
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbe8]
    str      x1, [sp, #0x20]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x3b8]
    str      x1, [sp, #0x28]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    str      x1, [sp, #0x90]
    mov      x0, x21
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x1d0]
    mov      x0, x21
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x1d8]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x1e0]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x608]
    ldp      d11, d12, [x8]
    ldp      d13, d14, [x8, #0x10]
    mov      x1, x23
    fmov     d0, d11
    fmov     d1, d12
    fmov     d2, d13
    fmov     d3, d14
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    str      x0, [sp, #0x30]
    bl       #0x31d5d0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x1e8]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x5b0]
    bl       #0x461bac // _objc_alloc_init
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb98]
    mov      x21, x0
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x5c0]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xbe8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xbb0]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xba0]
    mov      x0, x21
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xba8]
    mov      x0, x21
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    bl       #0x31af18
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x2a8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x1f0]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    bl       #0x31af18
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xbb8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xbc0]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    str      x21, [sp, #0x48]
    mov      x0, x21
    bl       #0x2a7bbc
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x1f8]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x5b8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xbc8]
    fmov     d0, d11
    fmov     d1, d12
    fmov     d2, d13
    fmov     d3, d14
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x200]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x1, x27
    bl       #0x2d9c98
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x22, [x8, #0xb8]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x130]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x578]
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x300]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xa98]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xaa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    stp      x25, x0, [sp]
    adrp     x2, #0x577000
    add      x2, x2, #0xe50
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    str      x0, [sp, #0x38]
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x0, #0x577000
    add      x0, x0, #0xe10
    mov      x1, x21
    bl       #0x2d9e94
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x208]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x210]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x27
    mov      x1, x22
    bl       #0x2d9d44
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x31b0c4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x448]
    str      x1, [sp, #0x18]
    mov      x0, x27
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x218]
    mov      x0, x27
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x690]
    mov      x0, x27
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x21, #0x4c4000
    ldr      x0, [x21, #0x90]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x27
    str      x24, [sp, #0x10]
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x21, #0x90]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x3f0]
    mov      x0, x27
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x24
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xbd0]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xbd8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0x20]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0x28]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    bl       #0x31d440
    fmov     d15, d0
    mov      x0, x27
    ldr      x21, [sp, #0x90]
    mov      x1, x21
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0xac8]
    mov      x0, x27
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xb48]
    mov      x1, x23
    fmov     d0, d15
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x628]
    ldr      x24, [x8]
    mov      x0, x27
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0xb50]
    mov      x1, x26
    mov      x2, x24
    str      x24, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x1, x21
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x23
    fmov     d0, d15
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x1, x26
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x25, [sp, #0x30]
    mov      x0, x25
    ldr      x28, [sp, #0x50]
    mov      x1, x28
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x220]
    mov      x0, x19
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    ldr      x1, [sp, #0x40]
    fmov     d0, d11
    fmov     d1, d12
    fmov     d2, d13
    fmov     d3, d14
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    ldr      x1, [sp, #0x18]
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    adrp     x24, #0x4c4000
    ldr      x0, [x24, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf0]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x460]
    fmov     d0, #0.50000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x22
    ldr      x1, [sp, #0x10]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x378]
    ldr      d1, [x8]
    fmov     d0, #14.00000000
    ldr      x1, [sp, #0x70]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x22
    ldr      x1, [sp, #0x68]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x24, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc18]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x22
    ldr      x1, [sp, #0x60]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1f8]
    mov      x0, x22
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x7f8]
    mov      x0, x22
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x2, #0x577000
    add      x2, x2, #0xdd0
    mov      x0, x22
    ldr      x1, [sp, #0x78]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    ldr      x1, [sp, #0x90]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x23
    fmov     d0, d15
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x26
    ldr      x2, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x28
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x228]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    ldr      x21, [sp, #0x58]
    mov      x0, x21
    mov      x1, x28
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldr      x1, [sp, #0x80]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x28
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x230]
    mov      x0, x19
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x238]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fadd     d0, d9, d10
    fmov     d1, #18.00000000
    fadd     d8, d0, d1
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x38]
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x48]
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x88]
    bl       #0x461c9c // _objc_release
    fmov     d0, d8
    ldp      x29, x30, [sp, #0x130]
    ldp      x20, x19, [sp, #0x120]
    ldp      x22, x21, [sp, #0x110]
    ldp      x24, x23, [sp, #0x100]
    ldp      x26, x25, [sp, #0xf0]
    ldp      x28, x27, [sp, #0xe0]
    ldp      d9, d8, [sp, #0xd0]
    ldp      d11, d10, [sp, #0xc0]
    ldp      d13, d12, [sp, #0xb0]
    ldp      d15, d14, [sp, #0xa0]
    add      sp, sp, #0x140
    ret      

// -[WCLGThemeDetailViewController layoutLiveCardPreviewForWidth:] IMP=0x44B984 bounds=0x44B984-0x44BD4C
loc_44B984:
    sub      sp, sp, #0x130
    stp      d15, d14, [sp, #0x90]
    stp      d13, d12, [sp, #0xa0]
    stp      d11, d10, [sp, #0xb0]
    stp      d9, d8, [sp, #0xc0]
    stp      x28, x27, [sp, #0xd0]
    stp      x26, x25, [sp, #0xe0]
    stp      x24, x23, [sp, #0xf0]
    stp      x22, x21, [sp, #0x100]
    stp      x20, x19, [sp, #0x110]
    stp      x29, x30, [sp, #0x120]
    add      x29, sp, #0x120
    fmov     d8, d0
    mov      x20, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x240]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x248]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    fcmp     d8, #0.0
    ccmp     x19, #0, #4, hi
    ccmp     x0, #0, #4, ne
    b.eq     #0x44bd0c
    fmov     d0, d8
    bl       #0x31d4e4
    fmov     d2, #1.00000000
    fmaxnm   d9, d0, d2
    fmaxnm   d11, d1, d2
    bl       #0x31d418
    mov      x8, #0x4059000000000000
    fmov     d1, x8
    fdiv     d0, d0, d1
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3d8]
    fmaxnm   d10, d0, d1
    fdiv     d12, d9, d10
    fmov     d15, #0.50000000
    fadd     d0, d8, d15
    fcmp     d9, d0
    cset     w22, gt
    mov      x8, #0x4044000000000000
    fmov     d0, x8
    fadd     d0, d9, d0
    fcsel    d9, d0, d8, gt
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x770]
    fdiv     d13, d11, d10
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x678]
    fmov     d0, xzr
    mov      x0, x19
    mov      x1, x24
    fmov     d2, d8
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xbd0]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbe0]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xbd8]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x730]
    mov      x0, x19
    mov      x1, x23
    fmov     d0, d9
    fmov     d1, d11
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x470]
    ldp      q0, q1, [x8]
    stp      q0, q1, [sp, #0x60]
    ldr      q0, [x8, #0x20]
    str      q0, [sp, #0x80]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x6c8]
    add      x2, sp, #0x60
    mov      x0, x21
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x568]
    ldp      d0, d1, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xaa0]
    mov      x0, x21
    fmov     d2, d12
    fmov     d3, d13
    bl       #0x461c6c // _objc_msgSend
    fmul     d0, d9, d15
    fmul     d1, d11, d15
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xe0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x31d5d0
    adrp     x8, #0x4c3000
    ldr      x26, [x8, #0x250]
    mov      x0, x20
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    bl       #0x31b0c4
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x4d8]
    mov      x0, x21
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    fmov     d11, d0
    fmov     d12, d1
    fmov     d13, d2
    fmov     d14, d3
    mov      x0, x20
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x24
    fmov     d0, d11
    fmov     d1, d12
    fmov     d2, d13
    fmov     d3, d14
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    fmov     d11, d0
    fmov     d12, d1
    fmov     d13, d2
    fmov     d14, d3
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x258]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x24
    fmov     d0, d11
    fmov     d1, d12
    fmov     d2, d13
    fmov     d3, d14
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    add      x8, sp, #0x30
    fmov     d0, d10
    fmov     d1, d10
    bl       #0x461540 // _CGAffineTransformMakeScale
    ldp      q0, q1, [sp, #0x30]
    stp      q0, q1, [sp]
    ldr      q0, [sp, #0x50]
    str      q0, [sp, #0x20]
    mov      x2, sp
    mov      x0, x21
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    fsub     d0, d9, d8
    fmul     d0, d0, d15
    fcmp     d0, #0.0
    cset     w8, gt
    tst      w22, w8
    fmov     d1, xzr
    fcsel    d0, d0, d1, ne
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x860]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x22, [x8, #0xd38]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d0]
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d1
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x1, x23
    fmov     d0, d8
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x260]
    mov      x0, x20
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x120]
    ldp      x20, x19, [sp, #0x110]
    ldp      x22, x21, [sp, #0x100]
    ldp      x24, x23, [sp, #0xf0]
    ldp      x26, x25, [sp, #0xe0]
    ldp      x28, x27, [sp, #0xd0]
    ldp      d9, d8, [sp, #0xc0]
    ldp      d11, d10, [sp, #0xb0]
    ldp      d13, d12, [sp, #0xa0]
    ldp      d15, d14, [sp, #0x90]
    add      sp, sp, #0x130
    ret      

// -[WCLGThemeDetailViewController viewDidLayoutSubviews] IMP=0x44BD4C bounds=0x44BD4C-0x44BE24
loc_44BD4C:
    sub      sp, sp, #0x40
    stp      d9, d8, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x838]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x390]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d2
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x240]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cbz      x0, #0x44be10
    mov      x20, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x268]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fabd     d9, d8, d0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    fmov     d0, #0.50000000
    fcmp     d9, d0
    b.le     #0x44be10
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x230]
    mov      x0, x19
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      d9, d8, [sp, #0x10]
    add      sp, sp, #0x40
    ret      

// -[WCLGThemeDetailViewController loadLiveCardPreview] IMP=0x44BE24 bounds=0x44BE24-0x44C298
loc_44BE24:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xb30
    ldar     w9, [x8]
    cbnz     w9, #0x44bf60
    adrp     x9, #0x577000
    add      x9, x9, #0xee4
    ldrb     w10, [x9]
    mov      w11, #0xb6
    eor      w10, w10, w11
    adrp     x11, #0x577000
    add      x11, x11, #0xee9
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x27
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xbd
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x4b
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    eor      w9, w9, #0xffffffc3
    strb     w9, [x11, #4]
    adrp     x9, #0x577000
    add      x9, x9, #0xeb0
    ldrh     w10, [x9]
    mov      w11, #0x34b5
    eor      w10, w10, w11
    adrp     x11, #0x577000
    add      x11, x11, #0xed0
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x1cca
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x53aa
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x9c92
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x2bb0
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0xdf00
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0xa5b
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w10, [x9, #0xe]
    mov      w12, #0x9fdb
    eor      w10, w10, w12
    strh     w10, [x11, #0xe]
    ldrh     w10, [x9, #0x10]
    mov      w12, #0x62d2
    eor      w10, w10, w12
    strh     w10, [x11, #0x10]
    ldrh     w9, [x9, #0x12]
    mov      w10, #0x15ea
    eor      w9, w9, w10
    strh     w9, [x11, #0x12]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x20, sp, #0x10
    mov      sp, x20
    sub      x21, sp, #0x40
    mov      sp, x21
    adrp     x8, #0x4c3000
    ldr      x22, [x8, #0x130]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe70]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    adrp     x2, #0x577000
    add      x2, x2, #0xf50
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x44c0f8
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x250]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cbz      x25, #0x44c254
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x270]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    add      x23, x0, #1
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x278]
    mov      x0, x19
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x578]
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x740]
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x280]
    bl       #0x461c6c // _objc_msgSend
    mov      x1, x0
    mov      x0, x25
    bl       #0x2ece94
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x44c124
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x288]
    mov      x0, x19
    mov      x2, x24
    mov      x3, x23
    bl       #0x461c6c // _objc_msgSend
    b        #0x44c24c
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    b        #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x27, [x8, #0x258]
    mov      x0, x19
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    adrp     x2, #0x577000
    add      x2, x2, #0xf10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x4b0]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x21]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x21, #8]
    adrp     x8, #0x44c000
    add      x8, x8, #0x298
    adrp     x9, #0x4a5000
    add      x9, x9, #0xed8
    stp      x8, x9, [x21, #0x10]
    add      x0, x21, #0x20
    mov      x1, x20
    bl       #0x461c00 // _objc_copyWeak
    stp      x23, x25, [x21, #0x28]
    str      x26, [x21, #0x38]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x290]
    mov      x0, x27
    mov      x2, x19
    mov      x3, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    add      x0, x21, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    mov      x19, x0
    add      x0, x21, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    b        #0x44c288
    mov      x19, x0
    mov      x0, x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGThemeDetailViewController renderLiveCardPreviewHTML:generation:] IMP=0x44C610 bounds=0x44C610-0x44C9D8
loc_44C610:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x21, x3
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xb38
    ldar     w9, [x8]
    cbnz     w9, #0x44c778
    adrp     x9, #0x578000
    add      x9, x9, #0x70
    ldrh     w10, [x9]
    mov      w11, #0xc575
    eor      w10, w10, w11
    adrp     x11, #0x578000
    add      x11, x11, #0x90
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x7cec
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xa9db
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x9b8c
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0xae67
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0x6ca1
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0xd855
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w10, [x9, #0xe]
    mov      w12, #0x562d
    eor      w10, w10, w12
    strh     w10, [x11, #0xe]
    ldrh     w10, [x9, #0x10]
    mov      w12, #0xabc
    eor      w10, w10, w12
    strh     w10, [x11, #0x10]
    ldrh     w9, [x9, #0x12]
    mov      w10, #0xd3b0
    eor      w9, w9, w10
    strh     w9, [x11, #0x12]
    adrp     x9, #0x578000
    add      x9, x9, #0x50
    ldrh     w10, [x9]
    mov      w11, #0x1582
    eor      w10, w10, w11
    adrp     x11, #0x578000
    add      x11, x11, #0x5e
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x3c24
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x34a1
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xcc1f
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0xcb
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0xb1
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w9, [x9, #0xc]
    mov      w10, #0xd601
    eor      w9, w9, w10
    strh     w9, [x11, #0xc]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x44c9b8
    adrp     x8, #0x4c3000
    ldr      x22, [x8, #0x250]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cbz      x0, #0x44c9b8
    mov      x23, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x270]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cmp      x24, x21
    b.ne     #0x44c9b8
    adrp     x8, #0x4c3000
    ldr      x21, [x8, #0x258]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x6f8]
    adrp     x2, #0x578000
    add      x2, x2, #0x110
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x31d9b4
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x130]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x578]
    bl       #0x461c6c // _objc_msgSend
    mov      w1, #1
    bl       #0x31ed88
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x210]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x26
    mov      x1, x27
    bl       #0x2d9d44
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb80]
    mov      x2, x24
    mov      x3, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x298]
    mov      x0, x20
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x2a0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461c9c // _objc_release
    cbnz     x22, #0x44c9a8
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x2, #0x578000
    add      x2, x2, #0xd0
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    b        #0x461c9c // _objc_release

// -[WCLGThemeDetailViewController webView:decidePolicyForNavigationAction:decisionHandler:] IMP=0x44C9D8 bounds=0x44C9D8-0x44CDC8
loc_44C9D8:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x20, x4
    mov      x19, x3
    mov      x21, x2
    mov      x23, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xb3c
    ldar     w9, [x8]
    cbnz     w9, #0x44ca80
    adrp     x9, #0x578000
    add      x9, x9, #0x130
    ldrb     w10, [x9]
    eor      w10, w10, #3
    adrp     x11, #0x578000
    add      x11, x11, #0x136
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x23
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xffffffe1
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0xaf
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x98
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w9, [x9, #5]
    mov      w10, #0xa3
    eor      w9, w9, w10
    strb     w9, [x11, #5]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c3000
    ldr      x22, [x8, #0x250]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x23
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cmp      x22, x21
    b.eq     #0x44caec
    ldr      x8, [x20, #0x10]
    mov      x0, x20
    mov      w1, #1
    blr      x8
    b        #0x44cd9c
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x238]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x240]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x24, [x8, #0x1e0]
    mov      x0, x28
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x5d0]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4a6000
    add      x8, x8, #0xd8
    cmp      x0, #0
    csel     x22, x8, x0, eq
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x130]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x578]
    bl       #0x461c6c // _objc_msgSend
    mov      w1, #1
    bl       #0x31ed88
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x358]
    mov      x0, x22
    mov      x1, x25
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x44cd08
    str      x24, [sp, #0x10]
    adrp     x8, #0x4c0000
    mov      x21, x28
    ldr      x28, [x8, #0x280]
    mov      x0, x21
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x20]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x23
    mov      x23, x0
    mov      x0, x24
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    str      x23, [sp, #0x18]
    mov      x0, x23
    mov      x1, x25
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    str      x21, [sp, #0x28]
    cbz      w0, #0x44cd10
    adrp     x8, #0x4c0000
    str      x28, [sp, #8]
    ldr      x28, [x8, #0x288]
    mov      x0, x21
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x24
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x0, x23
    mov      x1, x25
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      w21, w0
    mov      x0, x28
    ldr      x28, [sp, #8]
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    b        #0x44cd14
    mov      x21, #0
    b        #0x44cd40
    mov      x21, #0
    mov      x23, x24
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    ldr      x28, [sp, #0x28]
    ldr      x24, [sp, #0x10]
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    cbz      x28, #0x44cd74
    adrp     x2, #0x578000
    add      x2, x2, #0x160
    mov      x0, x22
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    csinc    x1, x21, xzr, eq
    b        #0x44cd78
    mov      w1, #1
    ldr      x8, [x20, #0x10]
    mov      x0, x20
    blr      x8
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    b        #0x461c9c // _objc_release

// -[WCLGThemeDetailViewController webView:didFinishNavigation:] IMP=0x44CDC8 bounds=0x44CDC8-0x44CEB8
loc_44CDC8:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x3
    mov      x22, x2
    mov      x20, x0
    mov      x0, x3
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c3000
    ldr      x21, [x8, #0x250]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cmp      x21, x22
    b.eq     #0x44ce30
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    b        #0x44ce60
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x2a0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cmp      x22, x19
    b.eq     #0x44ce74
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x298]
    mov      x0, x20
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x258]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    b        #0x44ce24

// -[WCLGThemeDetailViewController webView:didFailNavigation:withError:] IMP=0x44CEB8 bounds=0x44CEB8-0x44CED0
loc_44CEB8:
    mov      x8, x2
    adrp     x9, #0x4c3000
    ldr      x1, [x9, #0x2a8]
    mov      x2, x4
    mov      x4, x8
    b        #0x461c6c // _objc_msgSend

// -[WCLGThemeDetailViewController webView:didFailProvisionalNavigation:withError:] IMP=0x44CED0 bounds=0x44CED0-0x44CEE8
loc_44CED0:
    mov      x8, x2
    adrp     x9, #0x4c3000
    ldr      x1, [x9, #0x2a8]
    mov      x2, x4
    mov      x4, x8
    b        #0x461c6c // _objc_msgSend

// -[WCLGThemeDetailViewController showCardPreviewNavigationError:navigation:inWebView:] IMP=0x44CEE8 bounds=0x44CEE8-0x44D394
loc_44CEE8:
    sub      sp, sp, #0x60
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x22, x4
    mov      x20, x3
    mov      x19, x2
    mov      x21, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xb4c
    ldar     w9, [x8]
    cbnz     w9, #0x44d0e4
    adrp     x9, #0x578000
    add      x9, x9, #0x1a0
    ldrh     w10, [x9]
    mov      w11, #0x6a14
    eor      w10, w10, w11
    adrp     x11, #0x578000
    add      x11, x11, #0x1c0
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x11f9
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x641d
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xf543
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x4fa
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0xadcf
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0xfaf3
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w10, [x9, #0xe]
    mov      w12, #0xbf1b
    eor      w10, w10, w12
    strh     w10, [x11, #0xe]
    ldrh     w10, [x9, #0x10]
    mov      w12, #0x58d8
    eor      w10, w10, w12
    strh     w10, [x11, #0x10]
    ldrh     w9, [x9, #0x12]
    mov      w10, #0xd9a6
    eor      w9, w9, w10
    strh     w9, [x11, #0x12]
    adrp     x9, #0x578000
    add      x9, x9, #0x1d4
    ldrh     w10, [x9]
    mov      w11, #0x5aef
    eor      w10, w10, w11
    adrp     x11, #0x578000
    add      x11, x11, #0x1e4
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xce2d
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xb0aa
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x865d
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x95bb
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0xd513
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0xad97
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w9, [x9, #0xe]
    mov      w10, #0x8911
    eor      w9, w9, w10
    strh     w9, [x11, #0xe]
    adrp     x9, #0x578000
    add      x9, x9, #0x180
    ldrh     w10, [x9]
    mov      w11, #0x4b4f
    eor      w10, w10, w11
    adrp     x11, #0x578000
    add      x11, x11, #0x18e
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x56da
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x4dbf
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x8dfb
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x1430
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0xd057
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w9, [x9, #0xc]
    mov      w10, #0x5a4f
    eor      w9, w9, w10
    strh     w9, [x11, #0xc]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c3000
    ldr      x23, [x8, #0x250]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cmp      x23, x22
    b.eq     #0x44d140
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    b        #0x44d170
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x2a0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cmp      x22, x20
    b.eq     #0x44d198
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    add      sp, sp, #0x60
    b        #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x2b0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x268]
    ldr      x2, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x44d270
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x2b8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cmn      x23, #0x3e7
    b.ne     #0x44d278
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x298]
    mov      x0, x21
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c3000
    ldr      x22, [x8, #0x258]
    mov      x0, x21
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    adrp     x2, #0x578000
    add      x2, x2, #0x2a0
    bl       #0x461c6c // _objc_msgSend
    b        #0x44d134
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x298]
    mov      x0, x21
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c3000
    ldr      x22, [x8, #0x258]
    mov      x0, x21
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x25, [x8, #0x2c0]
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    cbz      x0, #0x44d344
    adrp     x8, #0x4c4000
    ldr      x26, [x8, #0xb8]
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    str      x0, [sp]
    adrp     x2, #0x578000
    add      x2, x2, #0x260
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    b        #0x44d34c
    adrp     x26, #0x578000
    add      x26, x26, #0x220
    mov      x0, x21
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cbz      x24, #0x44d134
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    b        #0x44d134

// -[WCLGThemeDetailViewController traitCollectionDidChange:] IMP=0x44D394 bounds=0x44D394-0x44D45C
loc_44D394:
    sub      sp, sp, #0x40
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x20, x2
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x838]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x398]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, sp
    mov      x1, x21
    mov      x2, x20
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3f0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x408]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cbz      w22, #0x44d448
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x248]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x31d5d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    add      sp, sp, #0x40
    ret      

// -[WCLGThemeDetailViewController addSeparatorAtY:width:pad:] IMP=0x44D45C bounds=0x44D45C-0x44D55C
loc_44D45C:
    stp      d11, d10, [sp, #-0x50]!
    stp      d9, d8, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    fmov     d9, d2
    fmov     d10, d1
    fmov     d8, d0
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    fmov     d0, #-2.00000000
    fmadd    d2, d9, d0, d10
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    fmov     d3, #0.50000000
    fmov     d0, d9
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf0]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x488]
    fmov     d0, #0.50000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd38]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fmov     d0, #18.00000000
    fadd     d8, d8, d0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    fmov     d0, d8
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      d9, d8, [sp, #0x10]
    ldp      d11, d10, [sp], #0x50
    ret      

// -[WCLGThemeDetailViewController previewTapped:] IMP=0x44D55C bounds=0x44D55C-0x44D660
loc_44D55C:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    mov      x0, x2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x44d64c
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xb98]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461c9c // _objc_release
    cbz      x22, #0x44d64c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x6d0]
    bl       #0x461ba0 // _objc_alloc
    mov      x22, x0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x428]
    mov      x0, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x20
    mov      x2, x22
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGThemeDetailViewController startDownload] IMP=0x44D660 bounds=0x44D660-0x44D8D4
loc_44D660:
    stp      d9, d8, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x22, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xb5c
    ldar     w9, [x8]
    cbnz     w9, #0x44d6ec
    adrp     x9, #0x578000
    add      x9, x9, #0x2c0
    ldrh     w10, [x9]
    mov      w11, #0x6447
    adrp     x12, #0x578000
    add      x12, x12, #0x2ca
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x7ae2
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x6088
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0xdc49
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xceb3
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x19, sp, #0x10
    mov      sp, x19
    sub      x20, sp, #0x30
    mov      sp, x20
    sub      x21, sp, #0x30
    mov      sp, x21
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x2c8]
    mov      x0, x22
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x2d0]
    mov      x0, x22
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x148]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0xb8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x178]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    adrp     x2, #0x578000
    add      x2, x2, #0x300
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x4b0]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x130]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x24, #0x4a0000
    ldr      x24, [x24, #0x748]
    str      x24, [x20]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    str      d8, [x20, #8]
    adrp     x8, #0x44d000
    add      x8, x8, #0x8d4
    adrp     x9, #0x4a5000
    add      x9, x9, #0xf08
    stp      x8, x9, [x20, #0x10]
    add      x0, x20, #0x20
    mov      x1, x19
    bl       #0x461c00 // _objc_copyWeak
    str      x24, [x21]
    str      d8, [x21, #8]
    adrp     x8, #0x44d000
    add      x8, x8, #0xbf8
    adrp     x9, #0x4a5000
    add      x9, x9, #0xf38
    stp      x8, x9, [x21, #0x10]
    add      x0, x21, #0x20
    mov      x1, x19
    bl       #0x461c00 // _objc_copyWeak
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x748]
    mov      x0, x23
    mov      x2, x22
    mov      x3, x20
    mov      x4, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    add      x0, x21, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x20, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461c0c // _objc_destroyWeak
    sub      sp, x29, #0x40
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      d9, d8, [sp], #0x50
    ret      
    mov      x22, x0
    add      x0, x21, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x20, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    b        #0x44d8c4
    mov      x22, x0
    mov      x0, x19
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x22
    bl       #0x461894 // __Unwind_Resume

// -[WCLGThemeDetailViewController primaryButtonTapped] IMP=0x44E32C bounds=0x44E32C-0x44E9E0
loc_44E32C:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xb68
    ldar     w9, [x8]
    cbnz     w9, #0x44e7dc
    adrp     x9, #0x578000
    add      x9, x9, #0x696
    ldrh     w10, [x9]
    mov      w11, #0x14da
    eor      w10, w10, w11
    adrp     x11, #0x578000
    add      x11, x11, #0x6a6
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x15a
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x22a5
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x7b61
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x4ecd
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0x6758
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0x7d96
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w9, [x9, #0xe]
    mov      w10, #0x1823
    eor      w9, w9, w10
    strh     w9, [x11, #0xe]
    adrp     x9, #0x578000
    add      x9, x9, #0x676
    ldrh     w10, [x9]
    mov      w11, #0x8542
    eor      w10, w10, w11
    adrp     x11, #0x578000
    add      x11, x11, #0x686
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xba93
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x169e
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xabdf
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x447f
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0xc955
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0xe539
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w9, [x9, #0xe]
    mov      w10, #0x10f6
    eor      w9, w9, w10
    strh     w9, [x11, #0xe]
    adrp     x9, #0x578000
    add      x9, x9, #0x666
    ldrh     w10, [x9]
    mov      w11, #0x23fc
    eor      w10, w10, w11
    adrp     x11, #0x578000
    add      x11, x11, #0x66e
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x8b1d
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x4906
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w9, [x9, #6]
    mov      w10, #0x69
    eor      w10, w9, w10
    adrp     x9, #0x578000
    add      x9, x9, #0x630
    strh     w10, [x11, #6]
    ldrb     w10, [x9]
    mov      w11, #0xc6
    eor      w11, w10, w11
    adrp     x10, #0x578000
    add      x10, x10, #0x650
    strb     w11, [x10]
    ldrb     w11, [x9, #1]
    eor      w11, w11, #0xfffffffd
    strb     w11, [x10, #1]
    ldrb     w11, [x9, #2]
    eor      w11, w11, #0xf0
    strb     w11, [x10, #2]
    ldrb     w11, [x9, #3]
    eor      w11, w11, #2
    strb     w11, [x10, #3]
    ldrb     w11, [x9, #4]
    mov      w12, #0x17
    eor      w11, w11, w12
    strb     w11, [x10, #4]
    ldrb     w11, [x9, #5]
    mov      w12, #0xa0
    eor      w11, w11, w12
    strb     w11, [x10, #5]
    ldrb     w11, [x9, #6]
    mov      w12, #0xb4
    eor      w11, w11, w12
    strb     w11, [x10, #6]
    ldrb     w11, [x9, #7]
    mov      w12, #0xd8
    eor      w11, w11, w12
    strb     w11, [x10, #7]
    ldrb     w11, [x9, #8]
    eor      w11, w11, #0xffffffc7
    strb     w11, [x10, #8]
    ldrb     w11, [x9, #9]
    mov      w12, #0x54
    eor      w11, w11, w12
    strb     w11, [x10, #9]
    ldrb     w11, [x9, #0xa]
    eor      w11, w11, #0xfffffff9
    strb     w11, [x10, #0xa]
    ldrb     w11, [x9, #0xb]
    mov      w12, #0x2c
    eor      w11, w11, w12
    strb     w11, [x10, #0xb]
    ldrb     w11, [x9, #0xc]
    eor      w11, w11, #0xffffffc7
    strb     w11, [x10, #0xc]
    ldrb     w11, [x9, #0xd]
    mov      w12, #0xda
    eor      w11, w11, w12
    strb     w11, [x10, #0xd]
    ldrb     w11, [x9, #0xe]
    mov      w12, #0xd5
    eor      w11, w11, w12
    strb     w11, [x10, #0xe]
    ldrb     w11, [x9, #0xf]
    mov      w12, #0x43
    eor      w11, w11, w12
    strb     w11, [x10, #0xf]
    ldrb     w11, [x9, #0x10]
    mov      w12, #0x15
    eor      w11, w11, w12
    strb     w11, [x10, #0x10]
    ldrb     w11, [x9, #0x11]
    mov      w12, #0xbe
    eor      w11, w11, w12
    strb     w11, [x10, #0x11]
    ldrb     w11, [x9, #0x12]
    mov      w12, #0x31
    eor      w11, w11, w12
    strb     w11, [x10, #0x12]
    ldrb     w11, [x9, #0x13]
    mov      w12, #0x4e
    eor      w11, w11, w12
    strb     w11, [x10, #0x13]
    ldrb     w11, [x9, #0x14]
    eor      w11, w11, #0xe0
    strb     w11, [x10, #0x14]
    ldrb     w9, [x9, #0x15]
    mov      w11, #0x2f
    eor      w9, w9, w11
    strb     w9, [x10, #0x15]
    adrp     x9, #0x578000
    add      x9, x9, #0x616
    ldrb     w10, [x9]
    mov      w11, #0x9b
    adrp     x12, #0x578000
    add      x12, x12, #0x61d
    eor      w10, w10, w11
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xffffffef
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    mov      w11, #0xdb
    eor      w10, w10, w11
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    mov      w11, #0xb7
    eor      w10, w10, w11
    strb     w10, [x12, #3]
    ldrb     w10, [x9, #4]
    mov      w11, #0xa1
    eor      w10, w10, w11
    strb     w10, [x12, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0xfffffffd
    strb     w10, [x12, #5]
    ldrb     w9, [x9, #6]
    mov      w10, #0x14
    eor      w9, w9, w10
    strb     w9, [x12, #6]
    adrp     x9, #0x578000
    add      x9, x9, #0x5f6
    ldrh     w10, [x9]
    mov      w11, #0xe17a
    adrp     x12, #0x578000
    add      x12, x12, #0x606
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x796f
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0xf854
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x4426
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0x5218
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w10, [x9, #0xa]
    mov      w11, #0xfed9
    eor      w10, w10, w11
    strh     w10, [x12, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w11, #0x9a19
    eor      w10, w10, w11
    strh     w10, [x12, #0xc]
    ldrh     w9, [x9, #0xe]
    mov      w10, #0xf4dc
    eor      w9, w9, w10
    strh     w9, [x12, #0xe]
    adrp     x9, #0x578000
    add      x9, x9, #0x5c0
    ldrh     w10, [x9]
    mov      w11, #0x9160
    adrp     x12, #0x578000
    add      x12, x12, #0x5e0
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x3921
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x4388
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x71d8
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0x4d30
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w10, [x9, #0xa]
    mov      w11, #0x4a90
    eor      w10, w10, w11
    strh     w10, [x12, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w11, #0xf0af
    eor      w10, w10, w11
    strh     w10, [x12, #0xc]
    ldrh     w10, [x9, #0xe]
    mov      w11, #0xe88a
    eor      w10, w10, w11
    strh     w10, [x12, #0xe]
    ldrh     w10, [x9, #0x10]
    mov      w11, #0xca17
    eor      w10, w10, w11
    strh     w10, [x12, #0x10]
    ldrh     w10, [x9, #0x12]
    mov      w11, #0x89ea
    eor      w10, w10, w11
    strh     w10, [x12, #0x12]
    ldrh     w9, [x9, #0x14]
    mov      w10, #0x4aa0
    eor      w9, w9, w10
    strh     w9, [x12, #0x14]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x120]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x44e81c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf58]
    adrp     x2, #0x578000
    add      x2, x2, #0x860
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x128]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x44e9b0
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0x538]
    adrp     x8, #0x4c3000
    ldr      x20, [x8, #0x130]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x578]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x300]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbz      w21, #0x44e9cc
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x2c8]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x2d0]
    mov      x0, x19
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x178]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    adrp     x2, #0x4a6000
    add      x2, x2, #0xd8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x148]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x160]
    adrp     x2, #0x578000
    add      x2, x2, #0x7e0
    adrp     x3, #0x578000
    add      x3, x3, #0x7a0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe70]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    adrp     x2, #0x578000
    add      x2, x2, #0x720
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x578000
    add      x8, x8, #0x760
    adrp     x9, #0x578000
    add      x9, x9, #0x6e0
    cmp      w0, #0
    csel     x2, x9, x8, ne
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf58]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x2f8]
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf58]
    adrp     x2, #0x578000
    add      x2, x2, #0x820
    b        #0x44e808

// -[WCLGThemeDetailViewController percentText:] IMP=0x44E9E0 bounds=0x44E9E0-0x44EAB0
loc_44E9E0:
    adrp     x8, #0x582000
    add      x8, x8, #0xb6c
    ldar     w9, [x8]
    cbnz     w9, #0x44ea4c
    adrp     x9, #0x578000
    add      x9, x9, #0x880
    ldrb     w10, [x9]
    mov      w11, #0x63
    eor      w10, w10, w11
    adrp     x11, #0x578000
    add      x11, x11, #0x885
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x32
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xcd
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xdddddddd
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0xe8
    eor      w9, w9, w10
    strb     w9, [x11, #4]
    sub      sp, sp, #0x20
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    fmov     d1, xzr
    fmaxnm   d0, d0, d1
    fmov     d1, #1.00000000
    fcmp     d0, d1
    fcsel    d0, d1, d0, gt
    mov      x8, #0x4059000000000000
    fmov     d1, x8
    fmul     d0, d0, d1
    fcvtas   w8, d0
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0x620]
    str      x8, [sp]
    adrp     x2, #0x578000
    add      x2, x2, #0x8b0
    bl       #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGThemeDetailViewController speedText:] IMP=0x44EAB0 bounds=0x44EAB0-0x44EC98
loc_44EAB0:
    adrp     x8, #0x582000
    add      x8, x8, #0xb70
    ldar     w9, [x8]
    cbnz     w9, #0x44ec08
    adrp     x9, #0x578000
    add      x9, x9, #0x8e4
    ldrb     w10, [x9]
    mov      w11, #0x7a
    eor      w10, w10, w11
    adrp     x11, #0x578000
    add      x11, x11, #0x8ee
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x60
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x63
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x43
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #6
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0xffffffc1
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    eor      w10, w10, #0x7c
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    eor      w10, w10, #0x88888888
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w12, #0xe5
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w9, [x9, #9]
    mov      w10, #0x41
    eor      w9, w9, w10
    adrp     x10, #0x578000
    add      x10, x10, #0x8d0
    strb     w9, [x11, #9]
    ldrb     w9, [x10]
    mov      w11, #0x7d
    eor      w9, w9, w11
    adrp     x11, #0x578000
    add      x11, x11, #0x8da
    strb     w9, [x11]
    ldrb     w9, [x10, #1]
    mov      w12, #0xdb
    eor      w9, w9, w12
    strb     w9, [x11, #1]
    ldrb     w9, [x10, #2]
    mov      w12, #0x6e
    eor      w9, w9, w12
    strb     w9, [x11, #2]
    ldrb     w9, [x10, #3]
    eor      w9, w9, #0x10
    strb     w9, [x11, #3]
    ldrb     w9, [x10, #4]
    mov      w12, #0x8c
    eor      w9, w9, w12
    strb     w9, [x11, #4]
    ldrb     w9, [x10, #5]
    mov      w12, #0x75
    eor      w9, w9, w12
    strb     w9, [x11, #5]
    ldrb     w9, [x10, #6]
    mov      w12, #0xcd
    eor      w9, w9, w12
    strb     w9, [x11, #6]
    ldrb     w9, [x10, #7]
    mov      w12, #0x9a
    eor      w9, w9, w12
    strb     w9, [x11, #7]
    ldrb     w9, [x10, #8]
    mov      w12, #0x15
    eor      w9, w9, w12
    strb     w9, [x11, #8]
    ldrb     w9, [x10, #9]
    mov      w10, #0xd2
    eor      w9, w9, w10
    strb     w9, [x11, #9]
    mov      w9, #1
    stlr     w9, [x8]
    fmov     d1, #1.00000000
    fcmp     d0, d1
    b.pl     #0x44ec28
    adrp     x0, #0x4a6000
    add      x0, x0, #0xd8
    b        #0x461be8 // _objc_autoreleaseReturnValue
    sub      sp, sp, #0x20
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    mov      x8, #0x4130000000000000
    fmov     d1, x8
    fcmp     d0, d1
    mov      x8, #0x3eb0000000000000
    fmov     d1, x8
    mov      x8, #0x3f50000000000000
    fmov     d2, x8
    fcsel    d1, d2, d1, lt
    adrp     x8, #0x578000
    add      x8, x8, #0x920
    adrp     x9, #0x578000
    add      x9, x9, #0x960
    csel     x2, x9, x8, lt
    fmul     d0, d1, d0
    str      d0, [sp]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldp      x29, x30, [sp, #0x10]
    add      sp, sp, #0x20
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGThemeDetailViewController toast:] IMP=0x44EC98 bounds=0x44EC98-0x44ED14
loc_44EC98:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0x480]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x3d8]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xff0]
    mov      x0, x21
    mov      x2, x19
    mov      x3, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGThemeDetailViewController theme] IMP=0x44ED14 bounds=0x44ED14-0x44ED24
loc_44ED14:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xefc]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController setTheme:] IMP=0x44ED24 bounds=0x44ED24-0x44ED38
loc_44ED24:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xefc]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeDetailViewController downloadHandler] IMP=0x44ED38 bounds=0x44ED38-0x44ED48
loc_44ED38:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf00]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController setDownloadHandler:] IMP=0x44ED48 bounds=0x44ED48-0x44ED54
loc_44ED48:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xf00]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGThemeDetailViewController bg] IMP=0x44ED54 bounds=0x44ED54-0x44ED64
loc_44ED54:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf0c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController setBg:] IMP=0x44ED64 bounds=0x44ED64-0x44ED78
loc_44ED64:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf0c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeDetailViewController scroll] IMP=0x44ED78 bounds=0x44ED78-0x44ED88
loc_44ED78:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf10]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController setScroll:] IMP=0x44ED88 bounds=0x44ED88-0x44ED9C
loc_44ED88:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf10]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeDetailViewController getButton] IMP=0x44ED9C bounds=0x44ED9C-0x44EDAC
loc_44ED9C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf14]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController setGetButton:] IMP=0x44EDAC bounds=0x44EDAC-0x44EDC0
loc_44EDAC:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf14]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeDetailViewController speedLabel] IMP=0x44EDC0 bounds=0x44EDC0-0x44EDD0
loc_44EDC0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf18]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController setSpeedLabel:] IMP=0x44EDD0 bounds=0x44EDD0-0x44EDE4
loc_44EDD0:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf18]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeDetailViewController downloadedNow] IMP=0x44EDE4 bounds=0x44EDE4-0x44EDF4
loc_44EDE4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf1c]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController setDownloadedNow:] IMP=0x44EDF4 bounds=0x44EDF4-0x44EE04
loc_44EDF4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf1c]
    strb     w2, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController readyToApply] IMP=0x44EE04 bounds=0x44EE04-0x44EE14
loc_44EE04:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf20]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController setReadyToApply:] IMP=0x44EE14 bounds=0x44EE14-0x44EE24
loc_44EE14:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf20]
    strb     w2, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController appliedNow] IMP=0x44EE24 bounds=0x44EE24-0x44EE34
loc_44EE24:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf24]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController setAppliedNow:] IMP=0x44EE34 bounds=0x44EE34-0x44EE44
loc_44EE34:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf24]
    strb     w2, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController cardPreviewContainer] IMP=0x44EE44 bounds=0x44EE44-0x44EE54
loc_44EE44:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf28]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController setCardPreviewContainer:] IMP=0x44EE54 bounds=0x44EE54-0x44EE68
loc_44EE54:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf28]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeDetailViewController cardPreviewViewport] IMP=0x44EE68 bounds=0x44EE68-0x44EE78
loc_44EE68:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf2c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController setCardPreviewViewport:] IMP=0x44EE78 bounds=0x44EE78-0x44EE8C
loc_44EE78:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf2c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeDetailViewController cardPreviewWebView] IMP=0x44EE8C bounds=0x44EE8C-0x44EE9C
loc_44EE8C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf04]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController setCardPreviewWebView:] IMP=0x44EE9C bounds=0x44EE9C-0x44EEB0
loc_44EE9C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf04]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeDetailViewController cardPreviewMediaController] IMP=0x44EEB0 bounds=0x44EEB0-0x44EEC0
loc_44EEB0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf30]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController setCardPreviewMediaController:] IMP=0x44EEC0 bounds=0x44EEC0-0x44EED4
loc_44EEC0:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf30]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeDetailViewController cardPreviewMediaScope] IMP=0x44EED4 bounds=0x44EED4-0x44EEE4
loc_44EED4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf08]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController setCardPreviewMediaScope:] IMP=0x44EEE4 bounds=0x44EEE4-0x44EEF0
loc_44EEE4:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xf08]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGThemeDetailViewController cardPreviewStatus] IMP=0x44EEF0 bounds=0x44EEF0-0x44EF00
loc_44EEF0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf34]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController setCardPreviewStatus:] IMP=0x44EF00 bounds=0x44EF00-0x44EF14
loc_44EF00:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf34]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeDetailViewController cardPreviewNavigation] IMP=0x44EF14 bounds=0x44EF14-0x44EF24
loc_44EF14:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf38]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController setCardPreviewNavigation:] IMP=0x44EF24 bounds=0x44EF24-0x44EF38
loc_44EF24:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf38]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeDetailViewController cardPreviewGeneration] IMP=0x44EF38 bounds=0x44EF38-0x44EF48
loc_44EF38:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf3c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController setCardPreviewGeneration:] IMP=0x44EF48 bounds=0x44EF48-0x44EF58
loc_44EF48:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf3c]
    str      x2, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController cardPreviewLayoutWidth] IMP=0x44EF58 bounds=0x44EF58-0x44EF68
loc_44EF58:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf40]
    ldr      d0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController setCardPreviewLayoutWidth:] IMP=0x44EF68 bounds=0x44EF68-0x44EF78
loc_44EF68:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf40]
    str      d0, [x0, x8]
    ret      

// -[WCLGThemeDetailViewController .cxx_destruct] IMP=0x44EF78 bounds=0x44EF78-0x44F094
loc_44EF78:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf38]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf34]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf08]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf30]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf04]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf2c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf28]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf18]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf14]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf10]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf0c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf00]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xefc]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
