// Exact ARM64 listing for WCLGGlassBackgroundView

// -[WCLGGlassBackgroundView initWithFrame:] IMP=0x2FAED0 bounds=0x2FAED0-0x2FB370
loc_2FAED0:
    sub      sp, sp, #0xd0
    stp      x28, x27, [sp, #0x70]
    stp      x26, x25, [sp, #0x80]
    stp      x24, x23, [sp, #0x90]
    stp      x22, x21, [sp, #0xa0]
    stp      x20, x19, [sp, #0xb0]
    stp      x29, x30, [sp, #0xc0]
    add      x29, sp, #0xc0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7a8]
    stp      x0, x8, [sp, #0x28]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    add      x0, sp, #0x28
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x19, x0
    cbz      x0, #0x2fb330
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x290]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    str      x1, [sp, #8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x788]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x26, [x8, #0x790]
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x850]
    str      x1, [sp, #0x20]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x530]
    fmov     d1, xzr
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x858]
    str      x1, [sp, #0x18]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x590]
    fmov     d1, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x24, #0x4c4000
    ldr      x0, [x24, #0xa8]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x498]
    fmov     d0, xzr
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    str      x0, [sp, #0x50]
    ldr      x0, [x24, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x8b0]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    str      x0, [sp, #0x58]
    ldr      x0, [x24, #0xa8]
    fmov     d0, #1.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    str      x0, [sp, #0x60]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    str      x1, [sp, #0x10]
    add      x2, sp, #0x50
    mov      w3, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x25, [x8, #0xe58]
    mov      x1, x25
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldr      x28, [sp, #8]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x26, [x8, #0x810]
    mov      x0, x20
    mov      x1, x26
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x290]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x798]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x27, [x8, #0x7a0]
    mov      x0, x19
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x390]
    fmov     d0, xzr
    ldr      x1, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x900]
    fmov     d0, #1.00000000
    ldr      x1, [sp, #0x18]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x24, #0xa8]
    fmov     d0, xzr
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    str      x0, [sp, #0x38]
    ldr      x0, [x24, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x440]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    str      x0, [sp, #0x40]
    ldr      x0, [x24, #0xa8]
    fmov     d0, #1.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    str      x0, [sp, #0x48]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    add      x2, sp, #0x38
    ldr      x1, [sp, #0x10]
    mov      w3, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x19
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x1, x25
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    mov      x1, x26
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x7a8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x7b0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2fb36c
    mov      x0, x19
    ldp      x29, x30, [sp, #0xc0]
    ldp      x20, x19, [sp, #0xb0]
    ldp      x22, x21, [sp, #0xa0]
    ldp      x24, x23, [sp, #0x90]
    ldp      x26, x25, [sp, #0x80]
    ldp      x28, x27, [sp, #0x70]
    add      sp, sp, #0xd0
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGGlassBackgroundView isDark] IMP=0x2FB370 bounds=0x2FB370-0x2FB3C0
loc_2FB370:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3f8]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #2
    cset     w20, eq
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    ret      

// -[WCLGGlassBackgroundView colorsA] IMP=0x2FB3C0 bounds=0x2FB3C0-0x2FB620
loc_2FB3C0:
    sub      sp, sp, #0x90
    stp      d9, d8, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    str      x8, [sp, #0x38]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x7b8]
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    adrp     x23, #0x4c4000
    ldr      x0, [x23, #0x90]
    adrp     x9, #0x4be000
    ldr      x20, [x9, #0x8f8]
    cbz      w8, #0x2fb4d4
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x880]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x460]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x530]
    fmov     d3, #1.00000000
    mov      x1, x20
    fmov     d2, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xac0]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x20]
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x492000
    ldr      d1, [x8, #0x1d0]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x418]
    fmov     d3, #1.00000000
    mov      x1, x20
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x28]
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x850]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x9f0]
    fmov     d3, #1.00000000
    mov      x1, x20
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    add      x23, sp, #0x20
    b        #0x2fb590
    adrp     x8, #0x491000
    ldr      d8, [x8, #0xb70]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x448]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x918]
    fmov     d3, #1.00000000
    mov      x1, x20
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xac0]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #8]
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x4d8]
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x20
    fmov     d0, d9
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x10]
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x548]
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x20
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    add      x23, sp, #8
    mov      x0, x20
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x23, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    mov      x2, x23
    mov      w3, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x38]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2fb61c
    mov      x0, x21
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      d9, d8, [sp, #0x40]
    add      sp, sp, #0x90
    b        #0x461be8 // _objc_autoreleaseReturnValue
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGGlassBackgroundView colorsB] IMP=0x2FB620 bounds=0x2FB620-0x2FB884
loc_2FB620:
    sub      sp, sp, #0x90
    stp      d9, d8, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    str      x8, [sp, #0x38]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x7b8]
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    adrp     x23, #0x4c4000
    ldr      x0, [x23, #0x90]
    adrp     x9, #0x4be000
    ldr      x20, [x9, #0x8f8]
    cbz      w8, #0x2fb738
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x530]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x9f0]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x390]
    fmov     d3, #1.00000000
    mov      x1, x20
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xac0]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x20]
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x880]
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x3b0]
    fmov     d3, #1.00000000
    mov      x1, x20
    fmov     d1, d9
    fmov     d2, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x28]
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x492000
    ldr      d1, [x8, #0x1d0]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x418]
    fmov     d3, #1.00000000
    mov      x1, x20
    fmov     d0, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    add      x23, sp, #0x20
    b        #0x2fb7f4
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x720]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x590]
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xac0]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #8]
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x448]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0xb70]
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x20
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x10]
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x5c8]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x4d8]
    fmov     d3, #1.00000000
    mov      x1, x20
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    add      x23, sp, #8
    mov      x0, x20
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x23, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    mov      x2, x23
    mov      w3, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x38]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2fb880
    mov      x0, x21
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      d9, d8, [sp, #0x40]
    add      sp, sp, #0x90
    b        #0x461be8 // _objc_autoreleaseReturnValue
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGGlassBackgroundView updateColors] IMP=0x2FB884 bounds=0x2FB884-0x2FBA44
loc_2FB884:
    stp      d9, d8, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x7c0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x790]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x22, [x8, #0x868]
    mov      x1, x22
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x7c8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x21, [x8, #0x7a0]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x22
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x20, [x8, #0x7b8]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    adrp     x8, #0x492000
    ldr      s0, [x8, #0x1f8]
    adrp     x8, #0x492000
    ldr      s1, [x8, #0x1fc]
    fcsel    s8, s1, s0, ne
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xaf8]
    fmov     s0, s8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    adrp     x9, #0x4c4000
    ldr      x0, [x9, #0x90]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0x8f8]
    tbz      w8, #0, #0x2fb9ec
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x880]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x9d0]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x530]
    b        #0x2fba00
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3e8]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x590]
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      d9, d8, [sp], #0x50
    b        #0x461c9c // _objc_release

// -[WCLGGlassBackgroundView layoutSubviews] IMP=0x2FBA44 bounds=0x2FBA44-0x2FBB9C
loc_2FBA44:
    sub      sp, sp, #0x70
    stp      d11, d10, [sp, #0x10]
    stp      d9, d8, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7a8]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x23, #0x4c4000
    ldr      x0, [x23, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x318]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x23, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x320]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x4d8]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x790]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x678]
    mov      x1, x22
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x7a0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x22
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x328]
    bl       #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    ldp      d11, d10, [sp, #0x10]
    add      sp, sp, #0x70
    ret      

// -[WCLGGlassBackgroundView traitCollectionDidChange:] IMP=0x2FBB9C bounds=0x2FBB9C-0x2FBC68
loc_2FBB9C:
    sub      sp, sp, #0x50
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x20, x2
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7a8]
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
    ldr      x22, [x8, #0x3f8]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cmp      x23, x22
    b.eq     #0x2fbc50
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x7a8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    add      sp, sp, #0x50
    ret      

// -[WCLGGlassBackgroundView startAnimations] IMP=0x2FBC68 bounds=0x2FBC68-0x2FBE94
loc_2FBC68:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x580000
    add      x8, x8, #0x74c
    ldar     w9, [x8]
    cbnz     w9, #0x2fbd04
    adrp     x9, #0x545000
    add      x9, x9, #0x218
    ldrb     w10, [x9]
    mov      w11, #0x5d
    adrp     x12, #0x545000
    add      x12, x12, #0x21f
    eor      w10, w10, w11
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    mov      w11, #0x7d
    eor      w10, w10, w11
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    mov      w13, #0x13
    eor      w10, w10, w13
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #8
    strb     w10, [x12, #3]
    ldrb     w10, [x9, #4]
    mov      w13, #0xc6
    eor      w10, w10, w13
    strb     w10, [x12, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, w11
    strb     w10, [x12, #5]
    ldrb     w9, [x9, #6]
    mov      w10, #0xa4
    eor      w9, w9, w10
    strb     w9, [x12, #6]
    mov      w9, #1
    stlr     w9, [x8]
    bl       #0x461804 // _UIAccessibilityIsReduceMotionEnabled
    tbz      w0, #0, #0x2fbd24
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    ret      
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x298]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x880]
    adrp     x21, #0x545000
    add      x21, x21, #0x250
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x7c0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x888]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x7c8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x890]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x898]
    fmov     d0, #8.00000000
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x7d0]
    mov      x0, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8a0]
    mov      w8, #0x7f800000
    fmov     s0, w8
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x558]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x660]
    ldr      x2, [x8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x7d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x7e0]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x790]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8b0]
    mov      x2, x20
    mov      x3, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGGlassBackgroundView gradA] IMP=0x2FBE94 bounds=0x2FBE94-0x2FBEA4
loc_2FBE94:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xcd8]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGGlassBackgroundView setGradA:] IMP=0x2FBEA4 bounds=0x2FBEA4-0x2FBEB8
loc_2FBEA4:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xcd8]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGGlassBackgroundView gradB] IMP=0x2FBEB8 bounds=0x2FBEB8-0x2FBEC8
loc_2FBEB8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xcdc]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGGlassBackgroundView setGradB:] IMP=0x2FBEC8 bounds=0x2FBEC8-0x2FBEDC
loc_2FBEC8:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xcdc]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGGlassBackgroundView .cxx_destruct] IMP=0x2FBEDC bounds=0x2FBEDC-0x2FBF1C
loc_2FBEDC:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xcdc]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xcd8]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
