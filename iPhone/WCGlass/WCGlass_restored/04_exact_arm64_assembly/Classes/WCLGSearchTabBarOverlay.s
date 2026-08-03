// Exact ARM64 listing for WCLGSearchTabBarOverlay

// -[WCLGSearchTabBarOverlay initWithTabBar:] IMP=0x3C30EC bounds=0x3C30EC-0x3C3284
loc_3C30EC:
    sub      sp, sp, #0x40
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x810]
    stp      x20, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x608]
    ldp      d0, d1, [x8]
    ldp      d2, d3, [x8, #0x10]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x20, x0
    cbz      x0, #0x3c3264
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe24]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461d08 // _objc_storeWeak
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x2d8]
    ldr      x1, [x8]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe28]
    add      x0, x20, x8
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe2c]
    mov      x9, #-1
    str      x9, [x20, x8]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe30]
    str      x9, [x20, x8]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe34]
    strb     wzr, [x20, x8]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe38]
    strb     wzr, [x20, x8]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe3c]
    add      x8, x20, x8
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x5f0]
    ldp      q1, q0, [x9]
    stp      q1, q0, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
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
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x690]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9c8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3a0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x448]
    mov      x0, x20
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x330]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    add      sp, sp, #0x40
    ret      

// -[WCLGSearchTabBarOverlay isDarkMode] IMP=0x3C3284 bounds=0x3C3284-0x3C32D4
loc_3C3284:
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

// -[WCLGSearchTabBarOverlay glassView] IMP=0x3C32D4 bounds=0x3C32D4-0x3C359C
loc_3C32D4:
    adrp     x8, #0x581000
    add      x8, x8, #0xfe8
    ldar     w9, [x8]
    cbnz     w9, #0x3c33c8
    adrp     x9, #0x55a000
    add      x9, x9, #0xe20
    ldrb     w10, [x9]
    mov      w11, #0xc8
    eor      w10, w10, w11
    adrp     x11, #0x55a000
    add      x11, x11, #0xe2e
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xfa
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x59
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x61
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x2f
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0x80
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    eor      w10, w10, #0xffffff83
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0x2d
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w12, #0x21
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    mov      w12, #0xa8
    eor      w10, w10, w12
    strb     w10, [x11, #9]
    ldrb     w10, [x9, #0xa]
    mov      w12, #0x35
    eor      w10, w10, w12
    strb     w10, [x11, #0xa]
    ldrb     w10, [x9, #0xb]
    eor      w10, w10, #0x70
    strb     w10, [x11, #0xb]
    ldrb     w10, [x9, #0xc]
    mov      w12, #0x8a
    eor      w10, w10, w12
    strb     w10, [x11, #0xc]
    ldrb     w9, [x9, #0xd]
    mov      w10, #0x8b
    eor      w9, w9, w10
    strb     w9, [x11, #0xd]
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9c0]
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x148]
    bl       #0x461ba0 // _objc_alloc
    mov      x20, x0
    adrp     x0, #0x55a000
    add      x0, x0, #0xe60
    bl       #0x461780 // _NSClassFromString
    cbz      x0, #0x3c344c
    bl       #0x461bac // _objc_alloc_init
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xc38]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3c347c
    mov      x0, x21
    mov      x1, x22
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    b        #0x3c347c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x180]
    cmp      w19, #0
    mov      w8, #0xb
    mov      w9, #0x11
    csel     x2, x9, x8, ne
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbb8]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x690]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x23, #0x4c4000
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x460]
    mov      x0, x20
    mov      x1, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf0]
    cbz      w19, #0x3c3528
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x538]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x418]
    b        #0x3c3534
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x530]
    fmov     d0, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xaf0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x1, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x7aa9c
    mov      x0, x20
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGSearchTabBarOverlay styleGlassControl:glass:] IMP=0x3C359C bounds=0x3C359C-0x3C3944
loc_3C359C:
    stp      d13, d12, [sp, #-0x90]!
    stp      d11, d10, [sp, #0x10]
    stp      d9, d8, [sp, #0x20]
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x19, x3
    mov      x22, x2
    mov      x20, x0
    mov      x0, x3
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x4d8]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616b4 // _CGRectGetHeight
    fmov     d1, #0.50000000
    fmul     d8, d0, d1
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9c0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0xac8]
    mov      x0, x22
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xb48]
    mov      x1, x25
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x438]
    mov      x0, x22
    mov      x1, x23
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x450]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac0]
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    mov      x0, x22
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbc0]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    cmp      w21, #0
    adrp     x8, #0x491000
    ldr      s0, [x8, #0xbe4]
    adrp     x8, #0x491000
    ldr      s1, [x8, #0x894]
    fcsel    s9, s1, s0, ne
    mov      x0, x22
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb08]
    fmov     s0, s9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbc8]
    fmov     d0, #18.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbd0]
    fmov     d0, xzr
    fmov     d1, #8.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x628]
    ldr      x26, [x8]
    mov      x0, x22
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0xb50]
    mov      x1, x27
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    fmov     d10, d1
    fmov     d11, d2
    fmov     d12, d3
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    mov      x0, x19
    fmov     d0, d9
    fmov     d1, d10
    fmov     d2, d11
    fmov     d3, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x1, x25
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x23
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf0]
    cbz      w21, #0x3c3894
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x538]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x418]
    b        #0x3c38a0
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x530]
    fmov     d0, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xaf0]
    mov      x0, x19
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
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x27
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    ldp      d11, d10, [sp, #0x10]
    ldp      d13, d12, [sp], #0x90
    b        #0x461c9c // _objc_release

// -[WCLGSearchTabBarOverlay searchIcon] IMP=0x3C3944 bounds=0x3C3944-0x3C3BB4
loc_3C3944:
    adrp     x8, #0x581000
    add      x8, x8, #0xff0
    ldar     w9, [x8]
    cbnz     w9, #0x3c3a50
    adrp     x9, #0x55a000
    add      x9, x9, #0xe80
    ldrb     w10, [x9]
    eor      w10, w10, #0xbbbbbbbb
    adrp     x11, #0x55a000
    add      x11, x11, #0xe90
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xcb
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x69
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0x18
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0x78
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0xd3
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0xb5
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0x5c
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w12, #0xd
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    mov      w12, #0xb6
    eor      w10, w10, w12
    strb     w10, [x11, #9]
    ldrb     w10, [x9, #0xa]
    mov      w12, #0x2c
    eor      w10, w10, w12
    strb     w10, [x11, #0xa]
    ldrb     w10, [x9, #0xb]
    mov      w12, #0x25
    eor      w10, w10, w12
    strb     w10, [x11, #0xb]
    ldrb     w10, [x9, #0xc]
    mov      w12, #0x52
    eor      w10, w10, w12
    strb     w10, [x11, #0xc]
    ldrb     w10, [x9, #0xd]
    mov      w12, #0xc6
    eor      w10, w10, w12
    strb     w10, [x11, #0xd]
    ldrb     w10, [x9, #0xe]
    eor      w10, w10, #0x7c
    strb     w10, [x11, #0xe]
    ldrb     w9, [x9, #0xf]
    eor      w9, w9, #0x1c
    strb     w9, [x11, #0xf]
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      w9, #1
    stlr     w9, [x8]
    mov      x8, sp
    sub      x21, x8, #0x10
    mov      sp, x21
    mov      x23, sp
    sub      x19, x23, #0x10
    mov      sp, x19
    sturb    wzr, [x8, #-0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    stur     xzr, [x23, #-0x10]
    mov      x1, x19
    mov      x2, x21
    bl       #0x3ab428
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldur     x19, [x23, #-0x10]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbz      x20, #0x3c3af0
    ldrb     w8, [x21]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0xef0]
    mov      x0, x20
    tbz      w8, #0, #0x3c3b74
    mov      w2, #2
    b        #0x3c3b78
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x210]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1c8]
    fmov     d0, #22.00000000
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x80]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1d0]
    adrp     x2, #0x55a000
    add      x2, x2, #0xec0
    mov      x3, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xef0]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    b        #0x3c3b88
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    sub      sp, x29, #0x30
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGSearchTabBarOverlay badgeRedColor] IMP=0x3C3BB4 bounds=0x3C3BB4-0x3C3D8C
loc_3C3BB4:
    sub      sp, sp, #0x70
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4a3000
    add      x8, x8, #0xca8
    ldr      x2, [x8]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x330]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4a3000
    add      x8, x8, #0xcb0
    ldr      x2, [x8]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x4e8]
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x3e0]
    mov      x0, x20
    mov      x1, x24
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3c3c70
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    b        #0x3c3c74
    mov      x22, #0
    mov      x0, x21
    mov      x1, x24
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3c3c98
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    b        #0x3c3c9c
    mov      x0, #0
    orr      x8, x22, x0
    cbnz     x8, #0x3c3cac
    mov      x22, #0
    b        #0x3c3d04
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x90]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x748]
    str      x9, [sp]
    adrp     x9, #0x491000
    ldr      d0, [x9, #0x4a0]
    str      d0, [sp, #8]
    adrp     x9, #0x3d2000
    add      x9, x9, #0x114
    adrp     x10, #0x4a4000
    add      x10, x10, #0xda8
    stp      x9, x10, [sp, #0x10]
    stp      x0, x22, [sp, #0x20]
    adrp     x9, #0x4bf000
    ldr      x1, [x9, #0x130]
    mov      x2, sp
    mov      x0, x8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cbz      x22, #0x3c3d30
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    mov      x19, x22
    b        #0x3c3d68
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8f8]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x650]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x488]
    fmov     d0, #1.00000000
    fmov     d3, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    add      sp, sp, #0x70
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGSearchTabBarOverlay applyBadge:dotView:label:] IMP=0x3C3D8C bounds=0x3C3D8C-0x3C41A0
loc_3C3D8C:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x21, x4
    mov      x20, x3
    mov      x19, x2
    mov      x23, x0
    adrp     x8, #0x581000
    add      x8, x8, #0xff8
    ldar     w9, [x8]
    cbnz     w9, #0x3c3e70
    adrp     x9, #0x55a000
    add      x9, x9, #0xee8
    ldrb     w10, [x9]
    mov      w11, #0x43
    adrp     x12, #0x55a000
    add      x12, x12, #0xeed
    eor      w10, w10, w11
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    mov      w11, #9
    eor      w10, w10, w11
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    mov      w11, #0xb6
    eor      w10, w10, w11
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    mov      w13, #0x19
    eor      w10, w10, w13
    strb     w10, [x12, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0x4b
    eor      w9, w9, w10
    strb     w9, [x12, #4]
    adrp     x9, #0x55a000
    add      x9, x9, #0xee0
    ldrb     w10, [x9]
    mov      w12, #0x4d
    adrp     x13, #0x55a000
    add      x13, x13, #0xee4
    eor      w10, w10, w12
    strb     w10, [x13]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x60
    strb     w10, [x13, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, w11
    strb     w10, [x13, #2]
    ldrb     w9, [x9, #3]
    mov      w10, #0x6d
    eor      w9, w9, w10
    strb     w9, [x13, #3]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x528]
    adrp     x2, #0x55a000
    add      x2, x2, #0xf60
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3c3f08
    adrp     x2, #0x55a000
    add      x2, x2, #0xf60
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    b        #0x3c3f0c
    mov      x22, #0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    cbz      x0, #0x3c3f34
    mov      w25, #0
    b        #0x3c3fb4
    adrp     x2, #0x55a000
    add      x2, x2, #0xf20
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x370]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3c3fa8
    adrp     x2, #0x55a000
    add      x2, x2, #0xf20
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    b        #0x3c3fac
    mov      w25, #0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    cmp      x24, #0
    cset     w26, eq
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x338]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    eor      w25, w25, #1
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x9b0]
    mov      x0, x20
    mov      x1, x27
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      x1, x27
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x28, #0x4be000
    adrp     x26, #0x4be000
    adrp     x27, #0x4be000
    tbnz     w25, #0, #0x3c4050
    ldr      x1, [x28, #0x460]
    mov      x0, x20
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x26, #0xac8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x1, [x27, #0xb10]
    fmov     d0, xzr
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x0, x21
    cbz      x24, #0x3c40e8
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x28, #0x460]
    mov      x0, x21
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x458]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x21
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldr      x24, [x26, #0xac8]
    mov      x0, x21
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x1, [x27, #0xb10]
    fmov     d0, xzr
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    b        #0x3c40f4
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x24, [x26, #0xac8]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x620]
    ldr      x25, [x8]
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0xb50]
    mov      x1, x27
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x1, x27
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    b        #0x461c9c // _objc_release

// -[WCLGSearchTabBarOverlay applyModeBadgeFromItem:fallbackBadge:] IMP=0x3C41A0 bounds=0x3C41A0-0x3C423C
loc_3C41A0:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x3
    mov      x20, x0
    adrp     x8, #0x4c2000
    ldr      x21, [x8, #0x340]
    mov      x0, x3
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x348]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x350]
    mov      x0, x20
    mov      x2, x19
    mov      x3, x21
    mov      x4, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGSearchTabBarOverlay badgeLabelWidthForText:height:] IMP=0x3C423C bounds=0x3C423C-0x3C43D4
loc_3C423C:
    sub      sp, sp, #0x60
    stp      d9, d8, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    fmov     d8, d0
    mov      x19, x2
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    str      x8, [sp, #0x18]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x3c4394
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    fmov     d0, #11.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x308]
    ldr      x8, [x8]
    stp      x8, x0, [sp, #8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    add      x2, sp, #0x10
    add      x3, sp, #8
    mov      w4, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x2d8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x4f0]
    mov      x0, x19
    fmov     d1, d8
    mov      w2, #1
    mov      x3, x21
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d2
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    frintp   d0, d9
    fmov     d1, #9.00000000
    fadd     d0, d0, d1
    fcmp     d0, d8
    fcsel    d9, d0, d8, gt
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x128]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9f8]
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    fcmp     d8, #0.0
    fmov     d0, #2.00000000
    fcsel    d0, d8, d0, hi
    fmul     d1, d9, d0
    frinta   d1, d1
    fdiv     d8, d1, d0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x18]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x3c43d0
    fmov     d0, d8
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    add      sp, sp, #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGSearchTabBarOverlay lightFeedback] IMP=0x3C43D4 bounds=0x3C43D4-0x3C441C
loc_3C43D4:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x238]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x478]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x480]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c9c // _objc_release

// -[WCLGSearchTabBarOverlay selectionFeedback] IMP=0x3C441C bounds=0x3C441C-0x3C4454
loc_3C441C:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x570]
    bl       #0x461bac // _objc_alloc_init
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xa10]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c9c // _objc_release

// -[WCLGSearchTabBarOverlay resetControlInteractionState] IMP=0x3C4454 bounds=0x3C4454-0x3C46B8
loc_3C4454:
    sub      sp, sp, #0x170
    stp      x26, x25, [sp, #0x120]
    stp      x24, x23, [sp, #0x130]
    stp      x22, x21, [sp, #0x140]
    stp      x20, x19, [sp, #0x150]
    stp      x29, x30, [sp, #0x160]
    add      x29, sp, #0x160
    mov      x19, x0
    adrp     x25, #0x4c4000
    ldr      x0, [x25, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x318]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x25, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x320]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x358]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x470]
    ldp      q0, q1, [x8]
    stp      q1, q0, [sp, #0x10]
    stp      q0, q1, [x29, #-0x70]
    ldr      q0, [x8, #0x20]
    str      q0, [sp]
    stur     q0, [x29, #-0x50]
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x6c8]
    sub      x2, x29, #0x70
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x360]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldp      q0, q1, [sp, #0x10]
    stp      q1, q0, [x29, #-0xa0]
    ldr      q0, [sp]
    stur     q0, [x29, #-0x80]
    sub      x2, x29, #0xa0
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x21, [x8, #0x368]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldp      q0, q1, [sp, #0x10]
    stp      q1, q0, [sp, #0x90]
    ldr      q0, [sp]
    str      q0, [sp, #0xb0]
    add      x2, sp, #0x90
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x22, [x8, #0x370]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldp      q0, q1, [sp, #0x10]
    stp      q1, q0, [sp, #0x60]
    ldr      q0, [sp]
    str      q0, [sp, #0x80]
    add      x2, sp, #0x60
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x23, [x8, #0x378]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldp      q0, q1, [sp, #0x10]
    stp      q1, q0, [sp, #0x30]
    ldr      q0, [sp]
    str      q0, [sp, #0x50]
    add      x2, sp, #0x30
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x9c8]
    fmov     d0, #1.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    fmov     d0, #1.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    fmov     d0, #1.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x328]
    bl       #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x160]
    ldp      x20, x19, [sp, #0x150]
    ldp      x22, x21, [sp, #0x140]
    ldp      x24, x23, [sp, #0x130]
    ldp      x26, x25, [sp, #0x120]
    add      sp, sp, #0x170
    ret      

// -[WCLGSearchTabBarOverlay applySystemGlassButtonConfigurationsWithSizeMode:primary:secondary:] IMP=0x3C46B8 bounds=0x3C46B8-0x3C4F30
loc_3C46B8:
    sub      sp, sp, #0xc0
    stp      d13, d12, [sp, #0x30]
    stp      d11, d10, [sp, #0x40]
    stp      d9, d8, [sp, #0x50]
    stp      x28, x27, [sp, #0x60]
    stp      x26, x25, [sp, #0x70]
    stp      x24, x23, [sp, #0x80]
    stp      x22, x21, [sp, #0x90]
    stp      x20, x19, [sp, #0xa0]
    stp      x29, x30, [sp, #0xb0]
    add      x29, sp, #0xb0
    mov      x21, x4
    mov      x19, x3
    mov      x23, x2
    mov      x20, x0
    adrp     x8, #0x4c2000
    ldr      x27, [x8, #0x368]
    mov      x0, x4
    bl       #0x461ca8 // _objc_retain
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0xb98]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    cbz      x0, #0x3c4754
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    mov      x26, x25
    b        #0x3c4770
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x380]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    cmp      x23, #0
    fmov     d0, #8.00000000
    fmov     d1, #7.00000000
    fcsel    d9, d1, d0, eq
    cmp      x23, #1
    cset     w8, eq
    adrp     x9, #0x491000
    ldr      d0, [x9, #0x5a8]
    fmov     d1, #31.00000000
    fcsel    d0, d1, d0, eq
    adrp     x9, #0x492000
    ldr      d1, [x9, #0x340]
    fmov     d2, #19.00000000
    fcsel    d1, d1, d2, eq
    fmov     d3, #20.00000000
    fcsel    d2, d2, d3, eq
    fmov     d3, #18.00000000
    fmov     d4, #16.00000000
    fcsel    d4, d4, d3, eq
    cmp      x23, #0
    adrp     x9, #0x492000
    add      x9, x9, #0x380
    ldr      d5, [x9, w8, uxtw #3]
    adrp     x8, #0x491000
    ldr      d6, [x8, #0x4c8]
    fcsel    d10, d6, d5, eq
    fmov     d5, #29.00000000
    fcsel    d8, d5, d0, eq
    adrp     x8, #0x492000
    ldr      d0, [x8, #0x258]
    fcsel    d11, d0, d1, eq
    fcsel    d12, d3, d2, eq
    fmov     d0, #14.00000000
    fcsel    d13, d0, d4, eq
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    bl       #0x3c4f30
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    fmov     d0, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x3, x0
    fmov     d0, xzr
    fmov     d2, xzr
    mov      x0, x21
    stp      x3, x26, [sp, #0x20]
    mov      x1, x26
    mov      x2, x23
    fmov     d1, d12
    fmov     d3, d13
    fmov     d4, d9
    fmov     d5, d10
    bl       #0x3c5198
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x28, [x8, #0x378]
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    fmov     d0, xzr
    fmov     d1, xzr
    fmov     d2, xzr
    fmov     d3, xzr
    fmov     d4, xzr
    mov      x0, x19
    str      x22, [sp, #0x10]
    mov      x1, x22
    mov      x2, #0
    mov      x3, #0
    fmov     d5, d8
    bl       #0x3c5198
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cmp      x25, #0
    ccmp     x26, #0, #4, ne
    cset     w21, ne
    adrp     x8, #0x4c2000
    ldr      x19, [x8, #0x358]
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x22, [x8, #0x760]
    str      w21, [sp, #0xc]
    str      x25, [sp, #0x18]
    tbz      w21, #0, #0x3c4d20
    str      x23, [sp]
    mov      x0, x24
    mov      x1, x22
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x21, [x8, #0x360]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x1, x22
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c2000
    ldr      x22, [x8, #0x398]
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x3e0]
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    cbz      w23, #0x3c4a08
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x22
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cbz      w24, #0x3c4a68
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x22
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x1a0]
    mov      x1, x23
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x1, x23
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1a8]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x388]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x9b0]
    mov      x1, x22
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x22
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x370]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x22
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x390]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x22
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x22
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xac8]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xb08]
    fmov     s0, wzr
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    fmov     s0, wzr
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0xbe8]
    mov      x1, x24
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x24
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x23, [sp]
    b        #0x3c4ec4
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x3e0]
    mov      x0, x24
    mov      x1, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    cbz      w25, #0x3c4d74
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x22
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x19, [x8, #0x360]
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x1, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    cbz      w21, #0x3c4ddc
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x22
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x388]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x19, [x8, #0x9b0]
    mov      x1, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x370]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x390]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x19, [sp, #0x18]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x10]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      w0, [sp, #0xc]
    ldp      x29, x30, [sp, #0xb0]
    ldp      x20, x19, [sp, #0xa0]
    ldp      x22, x21, [sp, #0x90]
    ldp      x24, x23, [sp, #0x80]
    ldp      x26, x25, [sp, #0x70]
    ldp      x28, x27, [sp, #0x60]
    ldp      d9, d8, [sp, #0x50]
    ldp      d11, d10, [sp, #0x40]
    ldp      d13, d12, [sp, #0x30]
    add      sp, sp, #0xc0
    ret      

// -[WCLGSearchTabBarOverlay buildSubviews] IMP=0x3C592C bounds=0x3C592C-0x3C6EF8
loc_3C592C:
    sub      sp, sp, #0x1a0
    stp      d15, d14, [sp, #0x100]
    stp      d13, d12, [sp, #0x110]
    stp      d11, d10, [sp, #0x120]
    stp      d9, d8, [sp, #0x130]
    stp      x28, x27, [sp, #0x140]
    stp      x26, x25, [sp, #0x150]
    stp      x24, x23, [sp, #0x160]
    stp      x22, x21, [sp, #0x170]
    stp      x20, x19, [sp, #0x180]
    stp      x29, x30, [sp, #0x190]
    add      x29, sp, #0x190
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x168]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x170]
    str      x1, [sp, #0xc8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x3a0]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    str      x1, [sp, #0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c2000
    ldr      x21, [x8, #0x358]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    str      x1, [sp, #0xa8]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x690]
    str      x1, [sp, #0xa0]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x198]
    str      x1, [sp, #0xc0]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1a0]
    str      x1, [sp, #0xb8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0xb40]
    mov      x0, x19
    mov      x1, x24
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x3a8]
    stur     x1, [x29, #-0xc0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x3b0]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x388]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x3b5f30
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1d8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c2000
    ldr      x3, [x8, #0x3b8]
    adrp     x8, #0x4bf000
    ldr      x25, [x8, #0x440]
    mov      x1, x25
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x3c0]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x20, [x8, #0x3c8]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc78]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x710]
    str      x1, [sp, #0x90]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x718]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x26, [x8, #0x450]
    mov      x0, x22
    mov      x1, x26
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0xb38]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x608]
    ldp      d8, d9, [x8]
    ldp      d10, d11, [x8, #0x10]
    mov      x1, x27
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x3d0]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x20, [x8, #0x368]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x28, [x8, #0x430]
    mov      x1, x28
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x22
    mov      x1, x24
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x27
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x3d8]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    bl       #0x3c4f30
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c2000
    ldr      x20, [x8, #0x370]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d12, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    str      x1, [sp, #0x98]
    adrp     x8, #0x492000
    ldr      d0, [x8, #0x348]
    fmov     d1, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    stur     x1, [x29, #-0xa0]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x200]
    stur     x1, [x29, #-0xa8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x208]
    stur     x1, [x29, #-0xb0]
    adrp     x8, #0x491000
    ldr      d13, [x8, #0x648]
    fmov     d0, d13
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    mov      x1, x24
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x168]
    ldr      x1, [sp, #0xc8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x3e0]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    ldr      x1, [sp, #0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c2000
    ldr      x20, [x8, #0x360]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [sp, #0xa8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x23, [sp, #0xa0]
    mov      x1, x23
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0xc0]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0xb8]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1a8]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c2000
    ldr      x3, [x8, #0x3e8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    str      x1, [sp, #0x78]
    mov      x2, x19
    mov      w4, #0x40
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x19
    mov      x1, x24
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x400]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c2000
    ldr      x3, [x8, #0x3f0]
    mov      x1, x25
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x308]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3b0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x26
    str      x22, [sp, #0x10]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1d8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c2000
    ldr      x3, [x8, #0x3f8]
    mov      x1, x25
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    ldr      x1, [sp, #0x90]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x26
    str      x22, [sp, #8]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldur     x1, [x29, #-0xc0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x400]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x390]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x21
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x27
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x408]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x21, [x8, #0x378]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    str      x28, [sp, #0x80]
    mov      x1, x28
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
    mov      x0, x20
    mov      x1, x24
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x27
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x410]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x20, [x8, #0x340]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x440]
    mov      x1, x25
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x28, x23
    mov      x1, x23
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x9b0]
    mov      x1, x23
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x24
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x27
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x418]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x20, [x8, #0x348]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x25
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1f8]
    str      x1, [sp, #0x68]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    fmov     d0, #11.00000000
    ldr      x1, [sp, #0x98]
    fmov     d1, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0xa0]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x26, #0x4c4000
    ldr      x0, [x26, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x458]
    str      x1, [sp, #0x60]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    str      x1, [sp, #0x58]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldur     x1, [x29, #-0xa8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x491000
    ldr      d14, [x8, #0x9b8]
    ldur     x1, [x29, #-0xb0]
    fmov     d0, d14
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x23
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x24
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x27
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x510]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x90]
    ldr      x1, [sp, #0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x26, [x8, #0x520]
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0xa8]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x28
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x25
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    str      x23, [sp, #0x70]
    mov      x1, x23
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9c8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3a0]
    str      x1, [sp, #0x48]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x24
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldur     x1, [x29, #-0xc0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x420]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x428]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    mov      x1, x24
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    str      x27, [sp, #0x88]
    mov      x1, x27
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x430]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x20, [x8, #0x438]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    stur     x25, [x29, #-0xc0]
    mov      x1, x25
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x28
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    str      x26, [sp, #0x50]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    str      x24, [sp, #0x90]
    mov      x1, x24
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x60]
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x440]
    stur     x19, [x29, #-0xb8]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x19, #0
    adrp     x8, #0x4bf000
    ldr      x9, [x8, #0xc30]
    adrp     x8, #0x4c2000
    ldr      x8, [x8, #0x448]
    stp      x8, x9, [sp, #0x38]
    adrp     x8, #0x4c2000
    ldr      x9, [x8, #0x450]
    adrp     x8, #0x4c2000
    ldr      x8, [x8, #0x458]
    stp      x8, x9, [sp, #0x28]
    adrp     x8, #0x4c2000
    ldr      x9, [x8, #0x460]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x830]
    stp      x8, x9, [sp, #0x18]
    ldp      x28, x27, [sp, #0x90]
    str      x19, [sp, #0xc8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x150]
    bl       #0x461ba0 // _objc_alloc
    ldr      x20, [sp, #0x88]
    mov      x1, x20
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    ldr      x24, [sp, #0x40]
    mov      x1, x24
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x19, #0x4c4000
    ldr      x0, [x19, #0x90]
    ldr      x1, [sp, #0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x26
    ldr      x1, [sp, #0xa8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    ldr      x22, [sp, #0xa0]
    mov      x1, x22
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    ldr      x19, [sp, #0x78]
    mov      x1, x19
    ldur     x21, [x29, #-0xb8]
    mov      x2, x21
    ldr      x3, [sp, #0x38]
    mov      w4, #0x11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x1, x19
    mov      x2, x21
    ldr      x3, [sp, #0x30]
    mov      w4, #0x1a0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x1, x19
    mov      x2, x21
    ldr      x3, [sp, #0x28]
    mov      w4, #0x40
    bl       #0x461c6c // _objc_msgSend
    adrp     x25, #0x4c4000
    ldr      x0, [x25, #0x78]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x20
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    mov      x1, x24
    mov      w2, #0x3e9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldur     x1, [x29, #-0xc0]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    str      x19, [sp, #0xc0]
    mov      x1, x22
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, xzr
    mov      x0, x19
    ldr      x1, [sp, #0x48]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x1, x28
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x20
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    str      x0, [sp, #0xb8]
    mov      x1, x24
    mov      w2, #0x3ea
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldr      x1, [sp, #0x80]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x1, x28
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x20
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x1, x24
    mov      w2, #0x3eb
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    fmov     d0, #19.00000000
    mov      x1, x27
    fmov     d1, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x21
    ldur     x1, [x29, #-0xa0]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldur     x1, [x29, #-0xa8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    ldur     x1, [x29, #-0xb0]
    fmov     d0, d13
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x1, x28
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x25, #0x78]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x20
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    mov      x1, x24
    mov      w2, #0x3ec
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    ldur     x19, [x29, #-0xc0]
    mov      x1, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    mov      x1, x22
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    ldr      x22, [sp, #0x70]
    mov      x1, x22
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x1, x28
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x20
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x1, x24
    mov      w2, #0x3ed
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    mov      x1, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    ldr      x1, [sp, #0x68]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    fmov     d0, #11.00000000
    mov      x1, x27
    fmov     d1, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x23
    ldur     x1, [x29, #-0xa0]
    ldr      x19, [sp, #0xc8]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    ldr      x1, [sp, #0x60]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x23
    ldr      x1, [sp, #0x58]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    ldur     x1, [x29, #-0xa8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    ldur     x1, [x29, #-0xb0]
    fmov     d0, d14
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    mov      x1, x22
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x1, x28
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    ldur     x20, [x29, #-0xb8]
    mov      x0, x20
    ldr      x1, [sp, #0x50]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x1, x28
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldr      x1, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x1, [sp, #0x18]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0xb8]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0xc0]
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    add      x19, x19, #1
    cmp      x19, #4
    b.ne     #0x3c6a5c
    ldr      x0, [sp, #8]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x10]
    ldp      x29, x30, [sp, #0x190]
    ldp      x20, x19, [sp, #0x180]
    ldp      x22, x21, [sp, #0x170]
    ldp      x24, x23, [sp, #0x160]
    ldp      x26, x25, [sp, #0x150]
    ldp      x28, x27, [sp, #0x140]
    ldp      d9, d8, [sp, #0x130]
    ldp      d11, d10, [sp, #0x120]
    ldp      d13, d12, [sp, #0x110]
    ldp      d15, d14, [sp, #0x100]
    add      sp, sp, #0x1a0
    b        #0x461c9c // _objc_release

// -[WCLGSearchTabBarOverlay pointInside:withEvent:] IMP=0x3C6EF8 bounds=0x3C6EF8-0x3C7098
loc_3C6EF8:
    stp      d9, d8, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    fmov     d8, d1
    fmov     d9, d0
    mov      x19, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x358]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x770]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, #-8.00000000
    fmov     d5, #-8.00000000
    bl       #0x461714 // _CGRectInset
    fmov     d4, d9
    fmov     d5, d8
    bl       #0x46169c // _CGRectContainsPoint
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    tbnz     w22, #0, #0x3c6fb8
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x360]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, #-8.00000000
    fmov     d5, #-8.00000000
    bl       #0x461714 // _CGRectInset
    fmov     d4, d9
    fmov     d5, d8
    bl       #0x46169c // _CGRectContainsPoint
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    tbz      w22, #0, #0x3c6fd4
    mov      w0, #1
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      d9, d8, [sp], #0x50
    ret      
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0x4d0]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3c7078
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0x520]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9a8]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3c7028
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    b        #0x3c7078
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, #-12.00000000
    fmov     d5, #-12.00000000
    bl       #0x461714 // _CGRectInset
    fmov     d4, d9
    fmov     d5, d8
    bl       #0x46169c // _CGRectContainsPoint
    mov      x20, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    tbnz     w20, #0, #0x3c6fb8
    mov      x0, x19
    mov      x1, x21
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      d9, d8, [sp], #0x50
    b        #0x461c6c // _objc_msgSend

// -[WCLGSearchTabBarOverlay hitTest:withEvent:] IMP=0x3C7098 bounds=0x3C7098-0x3C731C
loc_3C7098:
    stp      d9, d8, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    fmov     d8, d1
    fmov     d9, d0
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9a8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x3c72f4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9c0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3d8]
    fcmp     d0, d1
    b.mi     #0x3c72f4
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xdf0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3c72f4
    adrp     x8, #0x4c2000
    ldr      x22, [x8, #0x360]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x770]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, #-10.00000000
    fmov     d5, #-10.00000000
    bl       #0x461714 // _CGRectInset
    fmov     d4, d9
    fmov     d5, d8
    bl       #0x46169c // _CGRectContainsPoint
    mov      x24, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cbnz     w24, #0x3c71b8
    adrp     x8, #0x4c2000
    ldr      x22, [x8, #0x358]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, #-8.00000000
    fmov     d5, #-8.00000000
    bl       #0x461714 // _CGRectInset
    fmov     d4, d9
    fmov     d5, d8
    bl       #0x46169c // _CGRectContainsPoint
    mov      x24, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cbz      w24, #0x3c7274
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xff8]
    fmov     d0, d9
    fmov     d1, d8
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xa98]
    fmov     d0, d8
    fmov     d1, d9
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    cbz      x0, #0x3c7248
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    mov      x20, x23
    b        #0x3c7260
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    b        #0x3c72f8
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x4d0]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3c72d8
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x520]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, #-12.00000000
    fmov     d5, #-10.00000000
    bl       #0x461714 // _CGRectInset
    fmov     d4, d9
    fmov     d5, d8
    bl       #0x46169c // _CGRectContainsPoint
    mov      x21, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cbnz     w21, #0x3c72e8
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3c72f4
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    b        #0x3c72f8
    mov      x20, #0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      d9, d8, [sp], #0x50
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGSearchTabBarOverlay currentIndex] IMP=0x3C731C bounds=0x3C731C-0x3C79D0
loc_3C731C:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x90
    mov      x20, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x582000
    add      x8, x8, #0x28
    ldar     w9, [x8]
    cbnz     w9, #0x3c7538
    adrp     x10, #0x55b000
    add      x10, x10, #0x66
    ldrb     w9, [x10]
    eor      w9, w9, #0x88888888
    adrp     x11, #0x55b000
    add      x11, x11, #0x70
    strb     w9, [x11]
    ldrb     w9, [x10, #1]
    mov      w12, #0x35
    eor      w9, w9, w12
    strb     w9, [x11, #1]
    ldrb     w9, [x10, #2]
    eor      w9, w9, #0x40
    strb     w9, [x11, #2]
    ldrb     w9, [x10, #3]
    eor      w9, w9, #0xffffffe7
    strb     w9, [x11, #3]
    ldrb     w9, [x10, #4]
    eor      w9, w9, #0x66666666
    strb     w9, [x11, #4]
    ldrb     w9, [x10, #5]
    eor      w9, w9, #0xeeeeeeee
    strb     w9, [x11, #5]
    ldrb     w9, [x10, #6]
    mov      w12, #0x2a
    eor      w9, w9, w12
    strb     w9, [x11, #6]
    ldrb     w12, [x10, #7]
    mov      w9, #0x39
    eor      w12, w12, w9
    strb     w12, [x11, #7]
    ldrb     w12, [x10, #8]
    mov      w13, #0x57
    eor      w12, w12, w13
    strb     w12, [x11, #8]
    ldrb     w10, [x10, #9]
    mov      w12, #0x5c
    eor      w10, w10, w12
    adrp     x12, #0x55b000
    add      x12, x12, #0x7a
    strb     w10, [x11, #9]
    ldrb     w10, [x12]
    mov      w11, #0x6d
    eor      w10, w10, w11
    adrp     x11, #0x55b000
    add      x11, x11, #0x83
    strb     w10, [x11]
    ldrb     w10, [x12, #1]
    mov      w13, #0xad
    eor      w10, w10, w13
    strb     w10, [x11, #1]
    ldrb     w10, [x12, #2]
    eor      w10, w10, w13
    strb     w10, [x11, #2]
    ldrb     w10, [x12, #3]
    mov      w13, #0x4a
    eor      w10, w10, w13
    strb     w10, [x11, #3]
    ldrb     w10, [x12, #4]
    eor      w10, w10, #0xffffff9f
    strb     w10, [x11, #4]
    ldrb     w10, [x12, #5]
    eor      w10, w10, #0xffffffdf
    strb     w10, [x11, #5]
    ldrb     w10, [x12, #6]
    eor      w10, w10, #0xffffffbf
    strb     w10, [x11, #6]
    ldrb     w10, [x12, #7]
    mov      w13, #0x2b
    eor      w10, w10, w13
    strb     w10, [x11, #7]
    ldrb     w10, [x12, #8]
    mov      w12, #0xd1
    eor      w10, w10, w12
    adrp     x12, #0x55b000
    add      x12, x12, #0x50
    strb     w10, [x11, #8]
    ldrb     w10, [x12]
    eor      w10, w10, #0xffffff81
    adrp     x11, #0x55b000
    add      x11, x11, #0x5b
    strb     w10, [x11]
    ldrb     w10, [x12, #1]
    mov      w13, #0x53
    eor      w10, w10, w13
    strb     w10, [x11, #1]
    ldrb     w10, [x12, #2]
    mov      w13, #0xd5
    eor      w10, w10, w13
    strb     w10, [x11, #2]
    ldrb     w10, [x12, #3]
    eor      w9, w10, w9
    strb     w9, [x11, #3]
    ldrb     w9, [x12, #4]
    mov      w10, #0x2f
    eor      w9, w9, w10
    strb     w9, [x11, #4]
    ldrb     w9, [x12, #5]
    eor      w9, w9, #0xffffff9f
    strb     w9, [x11, #5]
    ldrb     w9, [x12, #6]
    mov      w10, #0x17
    eor      w9, w9, w10
    strb     w9, [x11, #6]
    ldrb     w9, [x12, #7]
    mov      w10, #0x8e
    eor      w9, w9, w10
    strb     w9, [x11, #7]
    ldrb     w9, [x12, #8]
    eor      w9, w9, #0xfc
    strb     w9, [x11, #8]
    ldrb     w9, [x12, #9]
    eor      w9, w9, #0x55555555
    strb     w9, [x11, #9]
    ldrb     w9, [x12, #0xa]
    mov      w10, #0xb9
    eor      w9, w9, w10
    strb     w9, [x11, #0xa]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x21, sp, #0x40
    mov      sp, x21
    sub      x27, sp, #0x80
    mov      sp, x27
    sub      x23, sp, #0x20
    mov      sp, x23
    sub      x28, sp, #0x40
    mov      sp, x28
    sub      x8, sp, #0x80
    stur     x8, [x29, #-0x78]
    mov      sp, x8
    adrp     x8, #0x4bf000
    ldr      x24, [x8, #0x110]
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    bl       #0x3c79d0
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    cbz      x0, #0x3c7600
    adrp     x8, #0x4c2000
    ldr      x19, [x8, #0x468]
    mov      x0, x22
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x8, #0x7fffffffffffffff
    cmp      x0, x8
    b.eq     #0x3c7600
    mov      x0, x22
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, x26
    b.hs     #0x3c7600
    mov      x0, x22
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    b        #0x3c7964
    cbz      x26, #0x3c7960
    stur     x20, [x29, #-0x80]
    mov      x25, #0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x608]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x410]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x418]
    stp      x8, x9, [x29, #-0x68]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xf68]
    stp      x28, x8, [x29, #-0xc0]
    adrp     x8, #0x4be000
    adrp     x9, #0x4be000
    adrp     x10, #0x4be000
    ldr      x8, [x8, #0x470]
    stp      x8, x22, [x29, #-0xa0]
    ldr      x8, [x9, #0x478]
    stur     x8, [x29, #-0x70]
    ldr      x8, [x10, #0x7c0]
    stp      x23, x8, [x29, #-0xd0]
    stp      x20, x24, [x29, #-0xe0]
    stur     x26, [x29, #-0xb0]
    ldur     x0, [x29, #-0x80]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x20
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    bl       #0x461ca8 // _objc_retain
    cbz      x0, #0x3c790c
    stur     x25, [x29, #-0x88]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x150]
    ldur     x1, [x29, #-0x60]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x26
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3c76d0
    mov      x0, x26
    ldur     x1, [x29, #-0xb8]
    bl       #0x461c6c // _objc_msgSend
    cbnz     w0, #0x3c79a8
    movi     v0.16b, #0
    stp      q0, q0, [x21, #0x20]
    stp      q0, q0, [x21]
    adrp     x8, #0x55b000
    add      x9, x8, #0x130
    adrp     x8, #0x55b000
    add      x8, x8, #0xf0
    stp      x9, x8, [x23]
    adrp     x8, #0x55b000
    add      x8, x8, #0xb0
    str      x8, [x23, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    ldur     x1, [x29, #-0xa0]
    mov      x2, x23
    mov      w3, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x70]
    mov      x2, x21
    mov      x3, x27
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x19, [x29, #-0x90]
    cbz      x0, #0x3c7810
    mov      x28, x0
    ldr      x8, [x21, #0x10]
    ldr      x25, [x8]
    stur     x27, [x29, #-0xa8]
    mov      x24, #0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x500]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x370]
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x3e0]
    ldr      x8, [x21, #0x10]
    ldr      x8, [x8]
    cmp      x8, x25
    b.eq     #0x3c7780
    mov      x0, x22
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x21, #8]
    ldr      x2, [x8, x24, lsl #3]
    mov      x0, x26
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x27
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3c77c0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x3c792c
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    add      x24, x24, #1
    cmp      x28, x24
    b.ne     #0x3c7768
    b        #0x3c77ec
    cmp      w1, #1
    b.ne     #0x3c79cc
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    b        #0x3c77c8
    mov      x0, x22
    ldur     x1, [x29, #-0x70]
    mov      x2, x21
    ldur     x27, [x29, #-0xa8]
    mov      x3, x27
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    cbnz     x0, #0x3c774c
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldp      x1, x28, [x29, #-0xc8]
    movi     v0.16b, #0
    stp      q0, q0, [x28, #0x20]
    stp      q0, q0, [x28]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldp      x3, x1, [x29, #-0x78]
    mov      x2, x28
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x3c78e4
    mov      x20, x0
    ldr      x8, [x28, #0x10]
    ldr      x24, [x8]
    mov      x25, #0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xf68]
    ldr      x8, [x28, #0x10]
    ldr      x8, [x8]
    cmp      x8, x24
    b.eq     #0x3c7880
    mov      x0, x22
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x28, #8]
    ldr      x19, [x8, x25, lsl #3]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x150]
    ldur     x1, [x29, #-0x60]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x19
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3c78bc
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x3c7934
    add      x25, x25, #1
    cmp      x20, x25
    b.ne     #0x3c7868
    mov      x0, x22
    ldp      x3, x1, [x29, #-0x78]
    mov      x2, x28
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    cbnz     x0, #0x3c785c
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldp      x22, x19, [x29, #-0x98]
    ldp      x24, x23, [x29, #-0xd8]
    ldur     x25, [x29, #-0x88]
    ldur     x20, [x29, #-0xe0]
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x19, #0
    add      x25, x25, #1
    ldur     x26, [x29, #-0xb0]
    cmp      x25, x26
    b.ne     #0x3c7660
    b        #0x3c7964
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x90]
    bl       #0x461c9c // _objc_release
    ldur     x19, [x29, #-0x88]
    ldur     x22, [x29, #-0x98]
    b        #0x3c7964
    mov      x19, #0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x3c79c8
    mov      x0, x19
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x19, [x29, #-0x88]
    b        #0x3c7964
    bl       #0x4618b8 // ___stack_chk_fail
    bl       #0x461894 // __Unwind_Resume

// -[WCLGSearchTabBarOverlay nativeIndexForMenuRow:count:] IMP=0x3C7B20 bounds=0x3C7B20-0x3C7B44
loc_3C7B20:
    cmp      x3, #4
    mov      w8, #4
    csel     x8, x3, x8, lo
    mvn      x9, x2
    add      x9, x8, x9
    cmp      x8, x2
    mov      x8, #0x7fffffffffffffff
    csel     x0, x9, x8, hi
    ret      

// -[WCLGSearchTabBarOverlay refreshWithItems:] IMP=0x3C7B44 bounds=0x3C7B44-0x3C8748
loc_3C7B44:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0xf0
    stur     x0, [x29, #-0x68]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x60]
    adrp     x8, #0x582000
    add      x8, x8, #0x34
    ldar     w9, [x8]
    cbnz     w9, #0x3c7cc8
    adrp     x9, #0x55b000
    add      x9, x9, #0x180
    ldrh     w10, [x9]
    mov      w11, #0x4e32
    eor      w10, w10, w11
    adrp     x11, #0x55b000
    add      x11, x11, #0x186
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x8551
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0xcc23
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x55b000
    add      x9, x9, #0x16c
    ldrh     w10, [x9]
    mov      w11, #0x5228
    eor      w10, w10, w11
    adrp     x11, #0x55b000
    add      x11, x11, #0x170
    strh     w10, [x11]
    ldrh     w9, [x9, #2]
    mov      w10, #0xf7bb
    eor      w9, w9, w10
    strh     w9, [x11, #2]
    adrp     x9, #0x55b000
    add      x9, x9, #0x174
    ldrh     w10, [x9]
    mov      w11, #0x90ec
    eor      w10, w10, w11
    adrp     x11, #0x55b000
    add      x11, x11, #0x17a
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x59c6
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x8d0c
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x55b000
    add      x9, x9, #0x15c
    ldrh     w10, [x9]
    mov      w11, #0x7b46
    adrp     x12, #0x55b000
    add      x12, x12, #0x164
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0xe7e
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x2c84
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w9, [x9, #6]
    mov      w10, #0x96e
    eor      w9, w9, w10
    strh     w9, [x12, #6]
    adrp     x9, #0x55b000
    add      x9, x9, #0x150
    ldrh     w10, [x9]
    mov      w11, #0x552d
    eor      w10, w10, w11
    adrp     x11, #0x55b000
    add      x11, x11, #0x156
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x29fe
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x7c8d
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x20
    sub      x9, x29, #0x10
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x2d8]
    ldr      x8, [x8]
    cmp      x2, #0
    csel     x2, x8, x2, eq
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb98]
    ldur     x19, [x29, #-0x68]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9c0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    adrp     x20, #0x4c4000
    ldr      x0, [x20, #0x90]
    adrp     x9, #0x4be000
    ldr      x19, [x9, #0xbf0]
    tbz      w8, #0, #0x3c7d64
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3e8]
    fmov     d0, #1.00000000
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x0, [x20, #0x90]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x430]
    fmov     d0, #1.00000000
    b        #0x3c7d94
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x428]
    fmov     d0, xzr
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x0, [x20, #0x90]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x4e8]
    fmov     d0, xzr
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c2000
    ldr      x19, [x8, #0x370]
    ldur     x26, [x29, #-0x68]
    mov      x0, x26
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    stur     x1, [x29, #-0xb8]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    bl       #0x3c4f30
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x26
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    stur     x1, [x29, #-0xc0]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x19, [x8, #0x368]
    mov      x0, x26
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0xc40]
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x21, [x8, #0x378]
    mov      x0, x26
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    stur     x24, [x29, #-0xc8]
    mov      x1, x24
    stur     x22, [x29, #-0xa0]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x380]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x26
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    stur     x1, [x29, #-0xa8]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x470]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x25, [x8, #0x110]
    mov      x0, x26
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    stur     x1, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    adrp     x24, #0x4be000
    cmp      x20, x0
    sub      x8, x29, #0x20
    stur     x23, [x8, #-0x100]
    b.hs     #0x3c7fb4
    ldur     x0, [x29, #-0x68]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [x24, #0x608]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x20
    bl       #0x3c8748
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    b        #0x3c7fcc
    fmov     d0, #24.00000000
    mov      x0, x20
    bl       #0x3c8b1c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x23, [x29, #-0x68]
    mov      x0, x23
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0xa8]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    cmp      x20, x0
    mov      x26, x25
    stur     x25, [x29, #-0xb0]
    sub      x8, x29, #0x28
    stur     x27, [x8, #-0x100]
    b.hs     #0x3c8094
    ldur     x0, [x29, #-0x68]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [x24, #0x608]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x3c90fc
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldur     x26, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    b        #0x3c8098
    mov      x23, #0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x68]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    cmp      x20, x0
    b.hs     #0x3c8108
    ldur     x0, [x29, #-0x68]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [x24, #0x608]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    ldur     x26, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    b        #0x3c810c
    mov      x20, #0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x478]
    ldur     x21, [x29, #-0x68]
    mov      x0, x21
    sub      x8, x29, #0x38
    stur     x20, [x8, #-0x100]
    mov      x2, x20
    sub      x8, x29, #0x30
    stur     x23, [x8, #-0x100]
    mov      x3, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x22, [x29, #-0x98]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cmp      x20, #4
    mov      w8, #4
    csel     x8, x20, x8, lo
    stur     x8, [x29, #-0xd0]
    adrp     x8, #0x4c2000
    ldr      x25, [x8, #0x460]
    mov      x0, x21
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cbz      x20, #0x3c86b0
    mov      x23, #0
    adrp     x8, #0x4c2000
    ldr      x9, [x24, #0x608]
    stur     x9, [x29, #-0x70]
    adrp     x9, #0x4bf000
    ldr      x28, [x8, #0x480]
    ldr      x10, [x9, #0xc30]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x9b0]
    stp      x8, x10, [x29, #-0xe8]
    adrp     x8, #0x4be000
    adrp     x9, #0x4bf000
    adrp     x10, #0x4be000
    adrp     x11, #0x4be000
    adrp     x12, #0x4c2000
    ldr      x8, [x8, #0x440]
    stur     x8, [x29, #-0xf0]
    ldr      x8, [x9, #0xc28]
    stur     x8, [x29, #-0x78]
    ldr      x8, [x10, #0x338]
    sub      x9, x29, #8
    stur     x8, [x9, #-0x100]
    ldr      x8, [x11, #0x470]
    sub      x9, x29, #0x18
    stur     x8, [x9, #-0x100]
    ldr      x8, [x12, #0x350]
    stp      x28, x8, [x29, #-0x100]
    stur     x25, [x29, #-0xd8]
    ldur     x20, [x29, #-0x68]
    mov      x0, x20
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0x70]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x28
    mov      x2, x23
    ldur     x3, [x29, #-0xd0]
    bl       #0x461c6c // _objc_msgSend
    mov      x8, #0x7fffffffffffffff
    cmp      x0, x8
    stur     x0, [x29, #-0x88]
    b.ne     #0x3c8294
    mov      w20, #0
    mov      x2, x23
    b        #0x3c82d0
    mov      x21, x0
    ldur     x0, [x29, #-0x68]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cmp      x21, x20
    cset     w20, lo
    csel     x2, x21, x23, lo
    ldur     x24, [x29, #-0xa0]
    mov      x0, x25
    ldur     x1, [x29, #-0xe0]
    bl       #0x461c6c // _objc_msgSend
    eor      w19, w20, #1
    mov      x0, x25
    ldur     x1, [x29, #-0xe8]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    ldur     x1, [x29, #-0xf0]
    stur     w20, [x29, #-0x8c]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    ldur     x20, [x29, #-0x78]
    mov      x1, x20
    mov      w2, #0x3ea
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x25
    mov      x1, x20
    mov      w2, #0x3eb
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x27
    ldur     x1, [x29, #-0xc8]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    stur     x27, [x29, #-0x80]
    tbnz     w19, #0, #0x3c8450
    ldur     x0, [x29, #-0x68]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x28, [x29, #-0x70]
    mov      x1, x28
    ldur     x21, [x29, #-0x88]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x21
    bl       #0x3c8748
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x24
    mov      x24, x0
    mov      x0, x27
    ldur     x1, [x29, #-0xa8]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldur     x1, [x29, #-0xb8]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    ldur     x0, [x29, #-0x68]
    ldur     x1, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x28
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x1, #0
    bl       #0x3d3ef8
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    sub      x8, x29, #8
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x22
    cbz      x0, #0x3c84b0
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    mov      x19, x26
    ldur     x28, [x29, #-0x100]
    b        #0x3c854c
    fmov     d0, #23.00000000
    mov      x0, x23
    bl       #0x3c8b1c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x27
    ldur     x1, [x29, #-0xa8]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldur     x1, [x29, #-0xb8]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    ldur     x1, [x29, #-0xc0]
    adrp     x2, #0x4a6000
    add      x2, x2, #0xd8
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x22
    ldur     x21, [x29, #-0x88]
    b        #0x3c8580
    mov      x22, x20
    sub      x8, x29, #0x10
    ldur     x2, [x8, #-0x100]
    adrp     x8, #0x55b000
    add      x9, x8, #0x2b0
    adrp     x8, #0x55b000
    add      x8, x8, #0x270
    stp      x9, x8, [x2]
    adrp     x8, #0x55b000
    add      x9, x8, #0x230
    adrp     x8, #0x55b000
    add      x8, x8, #0x1f0
    stp      x9, x8, [x2, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    sub      x8, x29, #0x18
    ldur     x1, [x8, #-0x100]
    mov      w3, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldur     x1, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    adrp     x19, #0x55b000
    add      x19, x19, #0x1b0
    cmp      x0, x21
    b.ls     #0x3c853c
    mov      x0, x20
    ldur     x1, [x29, #-0x70]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x28, [x29, #-0x100]
    mov      x20, x22
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    ldur     x1, [x29, #-0xc0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x26, [x29, #-0xb0]
    mov      x0, x25
    ldur     x20, [x29, #-0x78]
    mov      x1, x20
    mov      w2, #0x3ec
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x25
    mov      x1, x20
    mov      w2, #0x3ed
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldur     w8, [x29, #-0x8c]
    cbz      w8, #0x3c8620
    ldur     x0, [x29, #-0x68]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldur     x1, [x29, #-0x70]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x26
    mov      x26, x0
    bl       #0x3c90fc
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x26
    mov      x26, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    b        #0x3c8624
    mov      x22, #0
    ldur     x24, [x29, #-0x80]
    ldur     x21, [x29, #-0x68]
    mov      x0, x21
    ldur     x1, [x29, #-0xf8]
    mov      x2, x22
    mov      x3, x19
    mov      x4, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    add      x23, x23, #1
    mov      x0, x21
    ldur     x25, [x29, #-0xd8]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cmp      x23, x20
    b.lo     #0x3c8228
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x488]
    ldur     x19, [x29, #-0x68]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    sub      x8, x29, #0x38
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x30
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x28
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x20
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x3c8744
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGSearchTabBarOverlay layoutSubviews] IMP=0x3C9354 bounds=0x3C9354-0x3CB8AC
loc_3C9354:
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
    sub      sp, sp, #0x200
    mov      x24, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x810]
    stp      x0, x8, [x29, #-0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
    sub      x0, x29, #0xa8
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x438]
    mov      x0, x24
    mov      x1, x23
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xac8]
    mov      x0, x24
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf8]
    str      x1, [sp, #0x160]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x20, [x8, #0xea8]
    mov      x0, x24
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x22, #0x4be000
    cbz      x0, #0x3c94b4
    mov      x0, x24
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x26, [x22, #0x4d8]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    mov      x0, x24
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xf0]
    mov      x0, x24
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    fmov     d15, d0
    fmov     d10, d1
    fmov     d12, d2
    fmov     d13, d3
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    b        #0x3c94d4
    ldr      x26, [x22, #0x4d8]
    mov      x0, x24
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    fmov     d15, d0
    fmov     d10, d1
    fmov     d12, d2
    fmov     d13, d3
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x3cb8ac
    mov      x21, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cbz      w21, #0x3c9540
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x490]
    mov      x0, x24
    fmov     d0, d15
    fmov     d1, d10
    fmov     d2, d12
    fmov     d3, d13
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x498]
    mov      x0, x24
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    b        #0x3c9634
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4a0]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3c95b0
    adrp     x8, #0x4c2000
    ldr      x21, [x8, #0x4a8]
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    fmov     d8, d0
    mov      x0, x24
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    fabd     d0, d8, d0
    fmov     d1, #24.00000000
    fcmp     d0, d1
    b.pl     #0x3c95b0
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d15, d0
    fmov     d10, d1
    fmov     d12, d2
    fmov     d13, d3
    b        #0x3c9634
    fmov     d0, d15
    fmov     d1, d10
    fmov     d2, d12
    fmov     d3, d13
    bl       #0x461708 // _CGRectGetWidth
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x550]
    fcmp     d0, d1
    b.mi     #0x3c95f8
    fmov     d0, d15
    fmov     d1, d10
    fmov     d2, d12
    fmov     d3, d13
    bl       #0x4616b4 // _CGRectGetHeight
    mov      x8, #0x4042000000000000
    fmov     d1, x8
    fcmp     d0, d1
    b.pl     #0x3c9634
    mov      x0, x24
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616b4 // _CGRectGetHeight
    mov      x8, #-0x3faa000000000000
    fmov     d1, x8
    fadd     d10, d0, d1
    mov      x0, x24
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    fmov     d12, d0
    fmov     d15, xzr
    mov      x8, #0x4056000000000000
    fmov     d13, x8
    fmov     d0, d15
    fmov     d1, d10
    fmov     d2, d12
    fmov     d3, d13
    bl       #0x461708 // _CGRectGetWidth
    fmov     d8, d0
    fmov     d0, d15
    fmov     d1, d10
    fmov     d2, d12
    fmov     d3, d13
    bl       #0x4616b4 // _CGRectGetHeight
    fcmp     d8, #0.0
    b.ls     #0x3cb87c
    fmov     d9, d0
    fcmp     d0, #0.0
    b.ls     #0x3cb87c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9c0]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    adrp     x19, #0x4c4000
    ldr      x0, [x19, #0x90]
    adrp     x9, #0x4be000
    ldr      x21, [x9, #0xbf0]
    str      w8, [sp, #0x124]
    stp      x21, x23, [sp, #0x170]
    mov      x28, x25
    tbz      w8, #0, #0x3c96dc
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3e8]
    fmov     d0, #1.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x0, [x19, #0x90]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x430]
    fmov     d0, #1.00000000
    b        #0x3c970c
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x428]
    fmov     d0, xzr
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x0, [x19, #0x90]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x4e8]
    fmov     d0, xzr
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x10]
    adrp     x8, #0x583000
    add      x8, x8, #0
    ldr      x27, [x8]
    cmp      x27, #2
    mov      w8, #2
    csel     x21, x27, x8, lo
    cmp      x27, #1
    mov      x8, #0x404f000000000000
    fmov     d0, x8
    adrp     x8, #0x492000
    ldr      d1, [x8, #0x350]
    fcsel    d0, d1, d0, eq
    mov      x8, #0x404e000000000000
    fmov     d2, x8
    fcsel    d1, d1, d2, eq
    fmov     d2, #12.00000000
    fmov     d3, #11.00000000
    fcsel    d4, d3, d2, eq
    cmp      x27, #0
    mov      x8, #0x404a000000000000
    fmov     d2, x8
    fcsel    d0, d2, d0, eq
    fcsel    d1, d2, d1, eq
    fmov     d2, #18.00000000
    fmov     d3, #28.00000000
    fcsel    d2, d3, d2, eq
    stur     d2, [x29, #-0xe8]
    fmov     d2, #14.00000000
    str      d4, [sp, #0xc0]
    fcsel    d2, d2, d4, eq
    str      d2, [sp, #0x188]
    fcmp     d0, d1
    fcsel    d1, d0, d1, mi
    mov      x8, #0x4056000000000000
    fmov     d2, x8
    fcmp     d9, d2
    fcsel    d0, d1, d0, mi
    stur     d0, [x29, #-0xf0]
    mov      x0, x24
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461c9c // _objc_release
    adrp     x22, #0x4bf000
    cbz      x19, #0x3c980c
    mov      x0, x24
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x1, [x22, #0x190]
    bl       #0x461c6c // _objc_msgSend
    fmov     d11, d2
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    b        #0x3c981c
    ldr      x1, [x22, #0x190]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    fmov     d11, d2
    fmov     d0, #8.00000000
    fcmp     d11, d0
    fcsel    d11, d0, d11, mi
    fmov     d0, d15
    fmov     d1, d10
    fmov     d2, d12
    fmov     d3, d13
    bl       #0x4616fc // _CGRectGetMinY
    fadd     d0, d9, d0
    fsub     d0, d0, d11
    ldur     d14, [x29, #-0xf0]
    fsub     d0, d0, d14
    fmov     d1, #4.00000000
    fmaxnm   d11, d0, d1
    adrp     x20, #0x4c4000
    ldr      x0, [x20, #0x128]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x9f0]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x9f8]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fcmp     d9, #0.0
    fmov     d0, #2.00000000
    fcsel    d0, d9, d0, hi
    fmul     d1, d11, d0
    frinta   d1, d1
    fdiv     d0, d1, d0
    str      d0, [sp, #0x180]
    fmov     d0, d15
    fmov     d1, d10
    fmov     d2, d12
    fmov     d3, d13
    bl       #0x4616f0 // _CGRectGetMinX
    str      d8, [sp, #0xe8]
    fadd     d0, d8, d0
    ldur     d9, [x29, #-0xe8]
    fsub     d0, d0, d9
    fsub     d8, d0, d14
    ldr      x0, [x20, #0x128]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    fmov     d11, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fcmp     d11, #0.0
    fmov     d0, #2.00000000
    fcsel    d0, d11, d0, hi
    fmul     d1, d8, d0
    frinta   d1, d1
    fdiv     d11, d1, d0
    stp      d15, d10, [x29, #-0x100]
    fmov     d0, d15
    fmov     d1, d10
    str      d12, [sp, #0x168]
    fmov     d2, d12
    str      d13, [sp, #0x118]
    fmov     d3, d13
    bl       #0x4616f0 // _CGRectGetMinX
    fadd     d15, d9, d0
    ldr      x0, [x20, #0x128]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    fmov     d12, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fcmp     d12, #0.0
    fmov     d8, #2.00000000
    fcsel    d0, d12, d8, hi
    fmul     d1, d15, d0
    frinta   d1, d1
    fdiv     d12, d1, d0
    ldr      d0, [sp, #0x188]
    fsub     d0, d11, d0
    fsub     d0, d0, d12
    mov      x8, #0x405e000000000000
    fmov     d1, x8
    fmaxnm   d15, d0, d1
    ldr      x0, [x20, #0x128]
    str      x22, [sp, #0x158]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    str      x25, [sp, #0x150]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    fmov     d13, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fcmp     d13, #0.0
    fcsel    d0, d13, d8, hi
    fmul     d1, d0, d15
    frinta   d1, d1
    fdiv     d10, d1, d0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x358]
    mov      x0, x24
    str      x1, [sp, #0xe0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x678]
    mov      x1, x20
    fmov     d0, d12
    ldr      d8, [sp, #0x180]
    fmov     d1, d8
    fmov     d2, d10
    fmov     d3, d14
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x25, [x8, #0x360]
    mov      x0, x24
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    str      x20, [sp, #0x70]
    mov      x1, x20
    fmov     d0, d11
    fmov     d1, d8
    fmov     d2, d14
    fmov     d3, d14
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4b0]
    mov      x0, x24
    mov      x2, x21
    mov      x3, x23
    ldr      x4, [sp, #0x10]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    tbnz     w0, #0, #0x3c9b60
    mov      x0, x24
    ldr      x1, [sp, #0xe0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x388]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c2000
    ldr      x22, [x8, #0x4b8]
    mov      x0, x24
    mov      x1, x22
    mov      x2, x19
    mov      x3, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x390]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x24
    mov      x1, x22
    mov      x2, x19
    mov      x3, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4c0]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    str      x23, [sp, #8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    cmp      x27, #1
    adrp     x8, #0x492000
    ldr      d0, [x8, #0x340]
    fmov     d1, #19.00000000
    fcsel    d0, d0, d1, eq
    cmp      x27, #0
    adrp     x8, #0x492000
    ldr      d1, [x8, #0x258]
    fcsel    d0, d1, d0, eq
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    str      x1, [sp, #0x140]
    str      d1, [sp, #0x130]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c2000
    ldr      x21, [x8, #0x370]
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    str      x1, [sp, #0x138]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    bl       #0x3c4f30
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    tbnz     w20, #0, #0x3c9e34
    cmp      x27, #1
    fmov     d0, #14.00000000
    fmov     d1, #12.00000000
    fcsel    d1, d1, d0, eq
    fmov     d2, #18.00000000
    fmov     d3, #16.00000000
    fcsel    d2, d3, d2, eq
    mov      x8, #0x404b000000000000
    fmov     d3, x8
    adrp     x8, #0x492000
    ldr      d4, [x8, #0x268]
    fcsel    d3, d4, d3, eq
    fmov     d4, #28.00000000
    fmov     d5, #26.00000000
    fcsel    d4, d5, d4, eq
    adrp     x8, #0x492000
    ldr      d5, [x8, #0x358]
    fmov     d6, #21.00000000
    fcsel    d5, d5, d6, eq
    cmp      x27, #0
    fmov     d6, #11.00000000
    fcsel    d1, d6, d1, eq
    str      d1, [sp, #0x188]
    fcsel    d15, d0, d2, eq
    mov      x8, #0x4047000000000000
    fmov     d0, x8
    fcsel    d11, d0, d3, eq
    fmov     d0, #24.00000000
    fcsel    d12, d0, d4, eq
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x4c8]
    fcsel    d13, d0, d5, eq
    ldur     d9, [x29, #-0xf0]
    fsub     d0, d9, d13
    fmov     d1, #0.50000000
    fmov     d8, d10
    fmul     d10, d0, d1
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x128]
    ldr      x1, [sp, #0x158]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x1, [sp, #0x150]
    bl       #0x461c6c // _objc_msgSend
    fmov     d14, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fcmp     d14, #0.0
    fmov     d0, #2.00000000
    fcsel    d0, d14, d0, hi
    fmul     d1, d10, d0
    fmov     d10, d8
    frinta   d1, d1
    fdiv     d14, d1, d0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x368]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x22, [sp, #0x70]
    mov      x1, x22
    fmov     d0, d12
    fmov     d1, d14
    fmov     d2, d13
    fmov     d3, d13
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fsub     d0, d8, d11
    fsub     d0, d0, d15
    fmov     d1, xzr
    fmaxnm   d12, d0, d1
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    fmov     d1, xzr
    mov      x1, x22
    fmov     d0, d11
    fmov     d2, d12
    fmov     d3, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    ldr      d4, [sp, #0x188]
    fmov     d5, d4
    bl       #0x461714 // _CGRectInset
    fmov     d8, d0
    fmov     d9, d1
    fmov     d11, d2
    fmov     d12, d3
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x378]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x22
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d11
    fmov     d3, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cmp      x27, #1
    fmov     d0, #18.00000000
    fmov     d1, #17.00000000
    fcsel    d0, d1, d0, eq
    fmov     d1, #9.00000000
    fmov     d2, #8.50000000
    fcsel    d1, d2, d1, eq
    cmp      x27, #0
    fmov     d2, #16.00000000
    fcsel    d8, d2, d0, eq
    fmov     d0, #8.00000000
    fcsel    d0, d0, d1, eq
    str      d0, [sp, #0x100]
    fmov     d0, d8
    bl       #0x3cbae8
    fmov     d12, d0
    mov      x0, x24
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x770]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616f0 // _CGRectGetMinX
    fmov     d9, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616fc // _CGRectGetMinY
    fmov     d15, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    fmov     d11, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616b4 // _CGRectGetHeight
    fmov     d13, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x20, [x8, #0x348]
    mov      x0, x24
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9a8]
    str      x1, [sp, #0x188]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    str      d8, [sp, #0xf8]
    str      x23, [sp, #0x68]
    tbnz     w21, #0, #0x3ca188
    mov      x0, x24
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x7a0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4c8]
    mov      x0, x24
    mov      x2, x21
    fmov     d0, d12
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fadd     d0, d9, d11
    fsub     d0, d0, d8
    fmov     d1, #-3.00000000
    fadd     d0, d0, d1
    fmov     d1, #-1.00000000
    stur     d11, [x29, #-0xf0]
    str      d10, [sp, #0x180]
    fadd     d10, d0, d1
    adrp     x21, #0x4c4000
    ldr      x0, [x21, #0x128]
    ldr      x22, [sp, #0x158]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x23, [sp, #0x150]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    str      d13, [sp, #0x148]
    fmov     d13, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fcmp     d13, #0.0
    fmov     d11, #2.00000000
    fcsel    d0, d13, d11, hi
    fmul     d1, d10, d0
    frinta   d1, d1
    fdiv     d13, d1, d0
    fmov     d0, #5.00000000
    fadd     d0, d15, d0
    fmov     d1, #1.00000000
    fadd     d10, d0, d1
    ldr      x0, [x21, #0x128]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x23
    ldr      x23, [sp, #0x68]
    bl       #0x461c6c // _objc_msgSend
    fmov     d14, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fcmp     d14, #0.0
    fcsel    d0, d14, d11, hi
    fmul     d1, d10, d0
    ldr      d10, [sp, #0x180]
    ldur     d11, [x29, #-0xf0]
    frinta   d1, d1
    fdiv     d14, d1, d0
    mov      x0, x24
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x1, [sp, #0x70]
    fmov     d0, d13
    ldr      d13, [sp, #0x148]
    fmov     d1, d14
    fmov     d2, d8
    fmov     d3, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fmov     d0, #0.50000000
    fmul     d8, d12, d0
    mov      x0, x24
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x160]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x21, [x8, #0x340]
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x1, [sp, #0x188]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    tbnz     w22, #0, #0x3ca210
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x558]
    fmadd    d0, d11, d0, d9
    fmov     d1, #-1.00000000
    fadd     d0, d0, d1
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x650]
    fmadd    d1, d13, d1, d15
    fmov     d2, #1.00000000
    fadd     d1, d1, d2
    ldr      d2, [sp, #0x100]
    bl       #0x3cbb74
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x9d0]
    mov      x0, x24
    mov      x1, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x24
    str      x21, [sp, #0xf0]
    mov      x1, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cmp      x27, #1
    mov      x8, #0x404b000000000000
    fmov     d0, x8
    mov      x8, #0x4049000000000000
    fmov     d1, x8
    fcsel    d0, d1, d0, eq
    fmov     d1, #10.00000000
    fmov     d2, #9.00000000
    fcsel    d2, d2, d1, eq
    cmp      x27, #0
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x6a8]
    fcsel    d8, d1, d0, eq
    fmov     d0, #7.00000000
    str      d2, [sp, #0x80]
    fcsel    d9, d0, d2, eq
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x110]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    str      x1, [sp, #0x108]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fmov     d0, xzr
    cmp      x20, #4
    mov      w8, #4
    csel     x8, x20, x8, lo
    ucvtf    d1, x8
    str      d8, [sp, #0x148]
    fmul     d1, d8, d1
    fmov     d11, #2.00000000
    str      d9, [sp, #0x110]
    fmadd    d1, d9, d11, d1
    cmp      x20, #0
    fcsel    d0, d0, d1, eq
    stur     d0, [x29, #-0xf0]
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4d0]
    mov      x0, x24
    str      x1, [sp, #0x180]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3ca448
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x580]
    fcmp     d10, d0
    fcsel    d9, d0, d10, mi
    mov      x0, x24
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    ldur     d13, [x29, #-0xe8]
    fmsub    d0, d13, d11, d0
    fcmp     d9, d0
    fcsel    d10, d9, d0, mi
    adrp     x20, #0x4c4000
    ldr      x0, [x20, #0x128]
    ldr      x21, [sp, #0x158]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x22, [sp, #0x150]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fcmp     d9, #0.0
    fcsel    d0, d9, d11, hi
    fmul     d1, d10, d0
    frinta   d1, d1
    fdiv     d15, d1, d0
    ldp      d12, d11, [x29, #-0x100]
    fmov     d0, d12
    fmov     d1, d11
    ldr      d8, [sp, #0x168]
    fmov     d2, d8
    ldr      d14, [sp, #0x118]
    fmov     d3, d14
    bl       #0x4616f0 // _CGRectGetMinX
    fadd     d10, d13, d0
    mov      x0, x24
    ldr      x25, [sp, #0xe0]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616f0 // _CGRectGetMinX
    fmov     d9, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fmov     d0, d12
    fmov     d1, d11
    fmov     d2, d8
    fmov     d3, d14
    fmov     d14, d15
    bl       #0x4616f0 // _CGRectGetMinX
    ldr      d1, [sp, #0xe8]
    fadd     d0, d1, d0
    fsub     d0, d0, d13
    fsub     d0, d0, d15
    fcmp     d9, d0
    fcsel    d0, d9, d0, mi
    b        #0x3ca594
    cmp      x27, #1
    cset     w8, eq
    mov      x9, #0x4066000000000000
    fmov     d0, x9
    mov      x9, #0x4065000000000000
    fmov     d1, x9
    fcsel    d0, d1, d0, eq
    cmp      x27, #0
    adrp     x9, #0x491000
    ldr      d1, [x9, #0x990]
    fcsel    d0, d1, d0, eq
    adrp     x9, #0x492000
    add      x9, x9, #0x390
    ldr      d1, [x9, w8, uxtw #3]
    adrp     x9, #0x492000
    ldr      d2, [x9, #0x360]
    adrp     x9, #0x492000
    add      x9, x9, #0x3a0
    fcsel    d1, d2, d1, eq
    ldr      d2, [x9, w8, uxtw #3]
    adrp     x8, #0x491000
    ldr      d3, [x8, #0x4f8]
    fcsel    d2, d3, d2, eq
    ldr      d13, [sp, #0xe8]
    fmul     d2, d13, d2
    fcmp     d2, d0
    fcsel    d0, d0, d2, mi
    fcmp     d0, d1
    fcsel    d10, d0, d1, mi
    adrp     x20, #0x4c4000
    ldr      x0, [x20, #0x128]
    ldr      x21, [sp, #0x158]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x22, [sp, #0x150]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fcmp     d9, #0.0
    fcsel    d0, d9, d11, hi
    fmul     d1, d10, d0
    frinta   d1, d1
    fdiv     d15, d1, d0
    mov      x0, x24
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616c0 // _CGRectGetMaxX
    fmov     d9, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      d12, d11, [x29, #-0x100]
    fmov     d0, d12
    fmov     d1, d11
    ldr      d8, [sp, #0x168]
    fmov     d2, d8
    ldr      d14, [sp, #0x118]
    fmov     d3, d14
    bl       #0x4616f0 // _CGRectGetMinX
    fmov     d1, #18.00000000
    fadd     d10, d0, d1
    fmov     d0, d12
    fmov     d1, d11
    fmov     d2, d8
    fmov     d3, d14
    fmov     d14, d15
    bl       #0x4616f0 // _CGRectGetMinX
    fadd     d0, d13, d0
    fmov     d1, #-18.00000000
    fadd     d0, d0, d1
    fsub     d0, d0, d15
    fsub     d1, d9, d15
    fcmp     d0, d1
    fcsel    d0, d0, d1, mi
    fcmp     d10, d0
    fcsel    d10, d0, d10, mi
    ldr      x0, [x20, #0x128]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fcmp     d9, #0.0
    fmov     d11, #2.00000000
    fcsel    d0, d9, d11, hi
    fmul     d1, d0, d10
    frinta   d1, d1
    fdiv     d9, d1, d0
    mov      x0, x24
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616fc // _CGRectGetMinY
    ldr      d1, [sp, #0x110]
    fsub     d0, d0, d1
    ldur     d8, [x29, #-0xf0]
    fsub     d12, d0, d8
    ldr      x0, [x20, #0x128]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    fcmp     d10, #0.0
    fcsel    d0, d10, d11, hi
    fmul     d1, d12, d0
    frinta   d1, d1
    fdiv     d10, d1, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x19, #0x4c4000
    ldr      x0, [x19, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x318]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x320]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0x520]
    mov      x0, x24
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x470]
    ldp      q0, q1, [x8]
    stp      q0, q1, [x29, #-0xe0]
    ldr      q0, [x8, #0x20]
    stur     q0, [x29, #-0xc0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6c8]
    sub      x2, x29, #0xe0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x22, [sp, #0x70]
    mov      x1, x22
    fmov     d0, d9
    fmov     d1, d10
    fmov     d2, d14
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    stur     x26, [x29, #-0xf8]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d12, d3
    adrp     x8, #0x4c2000
    ldr      x21, [x8, #0x428]
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x22
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xe98]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x25, #0x4c4000
    ldr      x0, [x25, #0x90]
    ldr      w8, [sp, #0x124]
    cbz      w8, #0x3ca804
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x490]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3b8]
    b        #0x3ca810
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3e0]
    fmov     d0, #1.00000000
    ldr      x26, [sp, #0x170]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    str      x1, [sp, #0x118]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x19, #0x491000
    ldr      w8, [sp, #0x124]
    tbz      w8, #0, #0x3ca884
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x90]
    ldr      d0, [x19, #0x418]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x480]
    b        #0x3ca89c
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x90]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x950]
    fmov     d0, #1.00000000
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xaf0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [sp, #0x118]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0xf8]
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d12, d3
    adrp     x8, #0x4c2000
    ldr      x22, [x8, #0x438]
    mov      x0, x24
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0x70]
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x90]
    ldr      w8, [sp, #0x124]
    str      d14, [sp, #0xe8]
    stur     x23, [x29, #-0xe8]
    cbz      w8, #0x3ca9c8
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3b0]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x480]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x491000
    ldr      d10, [x8, #0x538]
    adrp     x8, #0x492000
    ldr      s9, [x8, #0x37c]
    b        #0x3ca9f8
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3f0]
    fmov     d0, #1.00000000
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x491000
    ldr      d10, [x8, #0x720]
    adrp     x8, #0x492000
    ldr      s9, [x8, #0x378]
    mov      x0, x24
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x1, [sp, #0x118]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    cmp      x27, #1
    fmov     d0, #26.00000000
    fmov     d1, #25.00000000
    fcsel    d0, d1, d0, eq
    str      x27, [sp, #0x168]
    cmp      x27, #0
    fmov     d11, #22.00000000
    fcsel    d8, d11, d0, eq
    mov      x0, x24
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x27, x28
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xb48]
    mov      x1, x25
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x23, [sp, #0x160]
    mov      x1, x23
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    stur     x25, [x29, #-0x100]
    mov      x1, x25
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x23
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x1, [sp, #0x178]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb10]
    adrp     x8, #0x492000
    ldr      d0, [x8, #0x368]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x25, #0x4c4000
    ldr      x0, [x25, #0x90]
    fmov     d0, #1.00000000
    mov      x1, x26
    fmov     d1, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0xac0]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x24, [x29, #-0xf0]
    mov      x24, x0
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x25
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb18]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x450]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    ldp      x0, x28, [x29, #-0xf0]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbc0]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xf0]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb08]
    fmov     s0, s9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xf0]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbc8]
    fmov     d0, #28.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xf0]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbd0]
    fmov     d9, #12.00000000
    fmov     d0, xzr
    fmov     d1, #12.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x19, [x8, #0xd8]
    ldur     x0, [x29, #-0xf0]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldur     x1, [x29, #-0xf8]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbd8]
    mov      x0, x19
    fmov     d4, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbe0]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    ldur     x0, [x29, #-0xf0]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbe8]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    ldur     x24, [x29, #-0xf0]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x628]
    ldr      x23, [x8]
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xb50]
    mov      x1, x21
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x21
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    stp      x21, x23, [sp, #0xd8]
    mov      x1, x21
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x328]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x21, [x8, #0x460]
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x1, [sp, #0x108]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x23, [sp, #0x70]
    ldr      d10, [sp, #0x148]
    cbz      x20, #0x3cb86c
    mov      x22, #0
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x608]
    str      x8, [sp, #0xc8]
    ldr      x9, [sp, #0x168]
    cmp      x9, #1
    fmov     d0, #5.00000000
    fmov     d1, #4.50000000
    fcsel    d0, d1, d0, eq
    fmov     d1, #24.00000000
    fcsel    d1, d11, d1, eq
    fmov     d2, #20.00000000
    fcsel    d3, d2, d11, eq
    fmov     d4, #15.00000000
    fmov     d5, #14.00000000
    fcsel    d4, d5, d4, eq
    mov      x8, #0x404f000000000000
    fmov     d6, x8
    mov      x8, #0x404d000000000000
    fmov     d7, x8
    fcsel    d6, d7, d6, eq
    mov      x8, #0x4049000000000000
    fmov     d7, x8
    adrp     x8, #0x492000
    ldr      d16, [x8, #0x370]
    fcsel    d7, d16, d7, eq
    fmov     d16, #19.00000000
    fmov     d17, #18.00000000
    fcsel    d16, d17, d16, eq
    fmov     d18, #17.00000000
    fmov     d19, #16.00000000
    fcsel    d20, d19, d18, eq
    fcsel    d21, d17, d2, eq
    fmov     d22, #8.50000000
    fmov     d25, #8.00000000
    fcsel    d22, d25, d22, eq
    cmp      x9, #0
    fmov     d23, #10.00000000
    ldr      d24, [sp, #0xc0]
    fcsel    d11, d23, d24, eq
    fmov     d23, #3.50000000
    fcsel    d14, d23, d0, eq
    fcsel    d12, d2, d1, eq
    fcsel    d1, d17, d3, eq
    fcsel    d0, d9, d4, eq
    stp      d0, d1, [sp, #0xb8]
    mov      x8, #0x404a000000000000
    fmov     d0, x8
    fcsel    d1, d0, d6, eq
    mov      x8, #0x4045000000000000
    fmov     d0, x8
    fcsel    d0, d0, d7, eq
    stp      d0, d1, [sp, #0xa8]
    fcsel    d0, d18, d16, eq
    str      d0, [sp, #0xa0]
    adrp     x8, #0x4bf000
    ldr      x9, [x8, #0xc28]
    fcsel    d8, d5, d20, eq
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xbf0]
    stp      x8, x9, [sp, #0x90]
    fsub     d0, d10, d12
    fmov     d1, #0.50000000
    fmul     d13, d0, d1
    fcsel    d1, d19, d21, eq
    ldr      d0, [sp, #0x80]
    fcsel    d0, d25, d0, eq
    stp      d0, d1, [sp, #0x50]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x7a0]
    adrp     x8, #0x4c2000
    ldr      x8, [x8, #0x4c8]
    stp      x8, x9, [sp, #0x40]
    fmov     d0, #7.50000000
    fcsel    d0, d0, d22, eq
    str      d0, [sp, #0x38]
    fneg     d0, d0
    str      d0, [sp, #0x30]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x620]
    ldr      x8, [x8]
    str      x8, [sp, #0x80]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x418]
    str      d0, [sp, #0x20]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x440]
    str      d0, [sp, #0x18]
    str      x27, [sp, #0x128]
    str      x21, [sp, #0xd0]
    str      d11, [sp, #0x60]
    str      d8, [sp, #0x88]
    str      d12, [sp, #0x28]
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x1, [sp, #0xc8]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    ldr      x19, [sp, #0x180]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      d0, [sp, #0x100]
    fcsel    d9, d11, d0, ne
    mov      x0, x24
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldp      d1, d0, [sp, #0xb8]
    fcsel    d15, d0, d1, ne
    mov      x0, x24
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldp      d1, d0, [sp, #0xa8]
    fcsel    d0, d0, d1, ne
    str      d0, [sp, #0x168]
    str      x22, [sp, #0x170]
    ucvtf    d0, x22
    ldr      d1, [sp, #0x110]
    fmadd    d1, d0, d10, d1
    ldr      d0, [sp, #0xe8]
    fmov     d2, #2.00000000
    fmsub    d2, d9, d2, d0
    mov      x0, x25
    mov      x1, x23
    fmov     d0, d9
    fmov     d3, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    ldr      x19, [sp, #0x98]
    mov      x1, x19
    mov      w2, #0x3e9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x25
    mov      x1, x19
    mov      w2, #0x3ea
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xe8]
    mov      x0, x25
    mov      x1, x19
    mov      w2, #0x3eb
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x25
    mov      x1, x19
    mov      w2, #0x3ec
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x25
    mov      x1, x19
    mov      w2, #0x3ed
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    ldr      x1, [sp, #0x140]
    ldr      d0, [sp, #0xa0]
    ldr      d1, [sp, #0x130]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    str      x20, [sp, #0x178]
    mov      x0, x20
    ldr      x1, [sp, #0x138]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    ldur     x1, [x29, #-0xf8]
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, #2.00000000
    fmov     d5, d14
    bl       #0x461714 // _CGRectInset
    mov      x0, x24
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0x100]
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x1, [sp, #0x160]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    ldr      w8, [sp, #0x124]
    tbz      w8, #0, #0x3cb398
    fmov     d0, #1.00000000
    ldr      x1, [sp, #0x90]
    ldr      d1, [sp, #0x20]
    b        #0x3cb3a8
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x530]
    fmov     d0, xzr
    ldr      x1, [sp, #0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x26, #0x4c4000
    mov      x0, x24
    ldr      x1, [sp, #0x118]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x128]
    ldr      x1, [sp, #0x158]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x1, [sp, #0x150]
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fcmp     d9, #0.0
    fmov     d0, #2.00000000
    fcsel    d0, d9, d0, hi
    fmul     d1, d13, d0
    frinta   d1, d1
    fdiv     d1, d1, d0
    ldur     x0, [x29, #-0xe8]
    mov      x1, x23
    fmov     d0, d15
    fmov     d2, d12
    fmov     d3, d12
    bl       #0x461c6c // _objc_msgSend
    ldr      d0, [sp, #0xf8]
    bl       #0x3cbae8
    fmov     d8, d0
    ldur     x0, [x29, #-0xf0]
    ldr      x1, [sp, #0x180]
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    mov      x0, x28
    ldr      x1, [sp, #0x188]
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, xzr
    tbnz     w0, #0, #0x3cb638
    cmp      w19, #0
    ldp      d1, d0, [sp, #0x50]
    fcsel    d10, d0, d1, ne
    str      d10, [sp, #0x78]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    fmov     d0, #11.00000000
    ldr      x1, [sp, #0x140]
    ldr      d1, [sp, #0x130]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x28
    ldr      x1, [sp, #0x138]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    ldr      x1, [sp, #0x48]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x0, [x29, #-0xf0]
    ldr      x1, [sp, #0x40]
    mov      x2, x19
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    ldur     x1, [x29, #-0xf8]
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    fsub     d0, d0, d10
    fmov     d12, d14
    fsub     d14, d0, d9
    ldr      x0, [x26, #0x128]
    ldr      x27, [sp, #0x158]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x21, [sp, #0x150]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fcmp     d10, #0.0
    fmov     d11, #2.00000000
    fcsel    d0, d10, d11, hi
    fmul     d1, d14, d0
    frinta   d1, d1
    fdiv     d10, d1, d0
    ldr      d0, [sp, #0x148]
    fsub     d0, d0, d8
    fmov     d1, #0.50000000
    fmul     d15, d0, d1
    ldr      x0, [x26, #0x128]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x21
    ldr      x23, [sp, #0x70]
    bl       #0x461c6c // _objc_msgSend
    fmov     d14, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fcmp     d14, #0.0
    fcsel    d0, d14, d11, hi
    fmov     d14, d12
    ldr      d12, [sp, #0x28]
    fmul     d1, d15, d0
    frinta   d1, d1
    fdiv     d1, d1, d0
    mov      x0, x28
    mov      x1, x23
    fmov     d0, d10
    fmov     d2, d9
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #0.50000000
    fmul     d8, d8, d0
    mov      x0, x28
    ldr      x27, [sp, #0x128]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0x100]
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x1, [sp, #0x160]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      d0, [sp, #0x78]
    fadd     d0, d0, d9
    ldr      d11, [sp, #0x60]
    fmov     d1, #8.00000000
    fadd     d9, d0, d1
    mov      x26, x22
    mov      x0, x22
    ldr      x1, [sp, #0x188]
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x3cb6a0
    ldur     x21, [x29, #-0xe8]
    mov      x0, x21
    ldr      x19, [sp, #0x68]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616f0 // _CGRectGetMinX
    fadd     d0, d12, d0
    ldr      d10, [sp, #0x30]
    ldr      d1, [sp, #0x18]
    fmadd    d8, d10, d1, d0
    mov      x0, x21
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616fc // _CGRectGetMinY
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x390]
    fmadd    d1, d10, d1, d0
    mov      x0, x26
    fmov     d0, d8
    ldr      d2, [sp, #0x38]
    bl       #0x3cbb74
    mov      x0, x25
    ldur     x1, [x29, #-0xf8]
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    ldr      d3, [sp, #0x168]
    fsub     d0, d0, d3
    fmov     d1, #-10.00000000
    fadd     d0, d0, d1
    fsub     d0, d0, d9
    fmov     d1, xzr
    fmaxnm   d2, d0, d1
    ldr      x22, [sp, #0x178]
    mov      x0, x22
    mov      x1, x23
    fmov     d0, d3
    ldr      d10, [sp, #0x148]
    fmov     d3, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    ldr      x27, [sp, #0x128]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0x100]
    ldr      d8, [sp, #0x88]
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldp      x21, x20, [sp, #0xd8]
    mov      x1, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x21
    ldr      x20, [sp, #0x80]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    ldr      x19, [sp, #0xf0]
    mov      x1, x19
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    mov      x1, x19
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xe8]
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldr      x22, [sp, #0x170]
    add      x22, x22, #1
    ldur     x24, [x29, #-0xf0]
    mov      x0, x24
    ldr      x21, [sp, #0xd0]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x1, [sp, #0x108]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cmp      x22, x20
    b.lo     #0x3cb174
    ldr      x0, [sp, #0x10]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #8]
    bl       #0x461c9c // _objc_release
    add      sp, sp, #0x200
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

// -[WCLGSearchTabBarOverlay optionPressBegan:] IMP=0x3CBD44 bounds=0x3CBD44-0x3CBD90
loc_3CBD44:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x470]
    mov      x0, x2
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x438]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x488]
    mov      x0, x19
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c6c // _objc_msgSend

// -[WCLGSearchTabBarOverlay optionPressEnded:] IMP=0x3CBD90 bounds=0x3CBD90-0x3CBDC8
loc_3CBD90:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x438]
    mov      x2, #-1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x488]
    mov      x0, x19
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c6c // _objc_msgSend

// -[WCLGSearchTabBarOverlay setMenuVisible:animated:] IMP=0x3CBDC8 bounds=0x3CBDC8-0x3CC118
loc_3CBDC8:
    sub      sp, sp, #0xb0
    stp      d9, d8, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      x20, x3
    mov      x19, x2
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldrsw    x24, [x8, #0xe40]
    ldrb     w8, [x0, x24]
    cmp      w8, w2
    b.ne     #0x3cbe58
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x520]
    mov      x0, x21
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9c0]
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cbz      w19, #0x3cbf64
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x5c8]
    fcmp     d8, d0
    b.gt     #0x3cc0fc
    strb     w19, [x21, x24]
    b        #0x3cbe68
    strb     w19, [x21, x24]
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x520]
    cbz      w19, #0x3cbf78
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x21
    mov      x2, #-1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4b0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
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
    ldr      x1, [x8, #0x440]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9a0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x9d0]
    mov      x1, x24
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x21
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, #1.00000000
    b        #0x3cbfe4
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3d8]
    fcmp     d8, d0
    b.mi     #0x3cc0fc
    strb     w19, [x21, x24]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x438]
    mov      x0, x21
    mov      x2, #-1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x21
    mov      x2, #-1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4e0]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x3a0]
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x488]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x23, #0x4a0000
    ldr      x23, [x23, #0x748]
    str      x23, [sp, #0x30]
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x388]
    str      d9, [sp, #0x38]
    adrp     x8, #0x3cc000
    add      x8, x8, #0x118
    adrp     x9, #0x4a1000
    add      x9, x9, #0xa30
    stp      x8, x9, [sp, #0x40]
    str      x21, [sp, #0x50]
    str      d8, [sp, #0x58]
    add      x0, sp, #0x30
    bl       #0x461cd8 // _objc_retainBlock
    mov      x22, x0
    str      x23, [sp]
    str      d9, [sp, #8]
    adrp     x8, #0x3cc000
    add      x8, x8, #0x1d0
    adrp     x9, #0x4a5000
    add      x9, x9, #0x8a0
    stp      x8, x9, [sp, #0x10]
    str      x21, [sp, #0x20]
    strb     w19, [sp, #0x28]
    mov      x0, sp
    bl       #0x461cd8 // _objc_retainBlock
    mov      x21, x0
    cbz      w20, #0x3cc0d0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    cmp      w19, #0
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3b0]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x418]
    fcsel    d0, d1, d0, ne
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x720]
    fmov     d2, #1.00000000
    fcsel    d2, d1, d2, ne
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x400]
    fmov     d3, xzr
    fcsel    d3, d1, d3, ne
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xe98]
    fmov     d1, xzr
    mov      w2, #6
    mov      x3, x22
    mov      x4, x21
    bl       #0x461c6c // _objc_msgSend
    b        #0x3cc0ec
    ldr      x8, [x22, #0x10]
    mov      x0, x22
    blr      x8
    ldr      x8, [x21, #0x10]
    mov      x0, x21
    mov      w1, #1
    blr      x8
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      d9, d8, [sp, #0x60]
    add      sp, sp, #0xb0
    ret      

// -[WCLGSearchTabBarOverlay setOverlayDisplayed:animated:interactive:] IMP=0x3CC25C bounds=0x3CC25C-0x3CC5A8
loc_3CC25C:
    sub      sp, sp, #0xc0
    stp      d9, d8, [sp, #0x60]
    stp      x26, x25, [sp, #0x70]
    stp      x24, x23, [sp, #0x80]
    stp      x22, x21, [sp, #0x90]
    stp      x20, x19, [sp, #0xa0]
    stp      x29, x30, [sp, #0xb0]
    add      x29, sp, #0xb0
    mov      x22, x4
    mov      x20, x3
    mov      x19, x2
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldrsw    x24, [x8, #0xe44]
    ldrb     w9, [x0, x24]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe34]
    cmp      w9, w2
    b.ne     #0x3cc2fc
    add      x23, x21, x8
    ldrb     w25, [x23]
    cmp      w25, w22
    b.ne     #0x3cc2fc
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9c0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w19, #0x3cc3fc
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x5c8]
    fcmp     d0, d1
    b.le     #0x3cc2f0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xdf0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x3cc588
    strb     w19, [x21, x24]
    strb     w25, [x23]
    b        #0x3cc310
    strb     w19, [x21, x24]
    and      w9, w19, w22
    add      x23, x21, x8
    strb     w9, [x23]
    cbz      w19, #0x3cc428
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldrb     w2, [x23]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    tbnz     w22, #0, #0x3cc3a0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4e0]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4e8]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f0]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4c0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f8]
    mov      x0, x21
    mov      w2, #0
    mov      w3, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9a0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9d0]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4b0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #1.00000000
    b        #0x3cc4a8
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3d8]
    fcmp     d0, d1
    b.pl     #0x3cc420
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xdf0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x3cc588
    strb     w19, [x21, x24]
    strb     wzr, [x23]
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4e0]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4e8]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f0]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4c0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f8]
    mov      x0, x21
    mov      w2, #0
    mov      w3, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3a0]
    adrp     x23, #0x4a0000
    ldr      x23, [x23, #0x748]
    str      x23, [sp, #0x30]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    str      d8, [sp, #0x38]
    adrp     x8, #0x3cc000
    add      x8, x8, #0x5a8
    adrp     x9, #0x4a1000
    add      x9, x9, #0xa30
    stp      x8, x9, [sp, #0x40]
    str      x21, [sp, #0x50]
    str      d0, [sp, #0x58]
    add      x0, sp, #0x30
    bl       #0x461cd8 // _objc_retainBlock
    mov      x22, x0
    str      x23, [sp, #8]
    adrp     x8, #0x3cc000
    add      x8, x8, #0x5bc
    str      d8, [sp, #0x10]
    adrp     x9, #0x4a2000
    add      x9, x9, #0xd0
    stp      x8, x9, [sp, #0x18]
    str      x21, [sp, #0x28]
    add      x0, sp, #8
    bl       #0x461cd8 // _objc_retainBlock
    mov      x21, x0
    cbz      w20, #0x3cc55c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    cmp      w19, #0
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x9d0]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3b0]
    fcsel    d0, d1, d0, ne
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xe60]
    fmov     d1, xzr
    mov      w2, #6
    movk     w2, #2, lsl #16
    mov      x3, x22
    mov      x4, x21
    bl       #0x461c6c // _objc_msgSend
    b        #0x3cc578
    ldr      x8, [x22, #0x10]
    mov      x0, x22
    blr      x8
    ldr      x8, [x21, #0x10]
    mov      x0, x21
    mov      w1, #1
    blr      x8
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0xb0]
    ldp      x20, x19, [sp, #0xa0]
    ldp      x22, x21, [sp, #0x90]
    ldp      x24, x23, [sp, #0x80]
    ldp      x26, x25, [sp, #0x70]
    ldp      d9, d8, [sp, #0x60]
    add      sp, sp, #0xc0
    ret      

// -[WCLGSearchTabBarOverlay setOverlayDisplayed:animated:] IMP=0x3CC60C bounds=0x3CC60C-0x3CC61C
loc_3CC60C:
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x508]
    mov      x4, x2
    b        #0x461c6c // _objc_msgSend

// -[WCLGSearchTabBarOverlay gestureRecognizerShouldBegin:] IMP=0x3CC61C bounds=0x3CC61C-0x3CC6C0
loc_3CC61C:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x3c8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461c9c // _objc_release
    cmp      x21, x19
    b.eq     #0x3cc66c
    mov      w20, #1
    b        #0x3cc6a4
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x460]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    fcmp     d1, #0.0
    cset     w8, mi
    fneg     d1, d1
    fabs     d0, d0
    adrp     x9, #0x491000
    ldr      d2, [x9, #0x438]
    fmul     d0, d0, d2
    fcmp     d0, d1
    csel     w20, wzr, w8, hi
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    ret      

// -[WCLGSearchTabBarOverlay modeTapped:] IMP=0x3CC6C0 bounds=0x3CC6C0-0x3CC720
loc_3CC6C0:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x510]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x518]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f8]
    eor      w2, w0, #1
    mov      x0, x19
    mov      w3, #1
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c6c // _objc_msgSend

// -[WCLGSearchTabBarOverlay modePanned:] IMP=0x3CC720 bounds=0x3CC720-0x3CC9B8
loc_3CC720:
    stp      d9, d8, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x21, [x8, #0x3d0]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    b.ne     #0x3cc788
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x510]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f0]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4b0]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    fmov     d8, d1
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    b.eq     #0x3cc7cc
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #2
    b.ne     #0x3cc8a4
    adrp     x8, #0x4c2000
    ldr      x21, [x8, #0x520]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x3cc858
    fneg     d0, d8
    fabs     d1, d9
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x438]
    fmul     d1, d1, d2
    fmov     d2, #-3.00000000
    fcmp     d8, d2
    fccmp    d1, d0, #2, mi
    b.hi     #0x3cc858
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4e8]
    mov      x0, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x510]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x518]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f8]
    mov      x0, x20
    mov      w2, #1
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3cc9a0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x528]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x438]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x488]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    b        #0x3cc9a0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #3
    b.ne     #0x3cc904
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x520]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    cbz      w0, #0x3cc944
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x468]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    tbz      x0, #0x3f, #0x3cc948
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x528]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    b        #0x3cc948
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #4
    b.eq     #0x3cc92c
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #5
    b.ne     #0x3cc9a0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4e8]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    b        #0x3cc988
    mov      x22, #-1
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4e8]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    cmp      x22, #0
    csel     w8, wzr, w21, lt
    cmp      w8, #1
    b.ne     #0x3cc984
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x530]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    b        #0x3cc9a0
    cbz      w21, #0x3cc9a0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f8]
    mov      x0, x20
    mov      w2, #0
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      d9, d8, [sp], #0x40
    b        #0x461c9c // _objc_release

// -[WCLGSearchTabBarOverlay searchPanned:] IMP=0x3CC9B8 bounds=0x3CC9B8-0x3CCC50
loc_3CC9B8:
    stp      d9, d8, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x21, [x8, #0x3d0]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    b.ne     #0x3cca20
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x510]
    mov      x0, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4e8]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4b0]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    fmov     d8, d1
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    b.eq     #0x3cca64
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #2
    b.ne     #0x3ccb3c
    adrp     x8, #0x4c2000
    ldr      x21, [x8, #0x538]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x3ccaf0
    fneg     d0, d8
    fabs     d1, d9
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x438]
    fmul     d1, d1, d2
    fmov     d2, #-3.00000000
    fcmp     d8, d2
    fccmp    d1, d0, #2, mi
    b.hi     #0x3ccaf0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f0]
    mov      x0, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x510]
    mov      x0, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x518]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f8]
    mov      x0, x20
    mov      w2, #1
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3ccc38
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x528]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x438]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x488]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    b        #0x3ccc38
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #3
    b.ne     #0x3ccb9c
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x538]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    cbz      w0, #0x3ccbdc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x468]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    tbz      x0, #0x3f, #0x3ccbe0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x528]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    b        #0x3ccbe0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #4
    b.eq     #0x3ccbc4
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #5
    b.ne     #0x3ccc38
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f0]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    b        #0x3ccc20
    mov      x22, #-1
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f0]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    cmp      x22, #0
    csel     w8, wzr, w21, lt
    cmp      w8, #1
    b.ne     #0x3ccc1c
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x530]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    b        #0x3ccc38
    cbz      w21, #0x3ccc38
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f8]
    mov      x0, x20
    mov      w2, #0
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      d9, d8, [sp], #0x40
    b        #0x461c9c // _objc_release

// -[WCLGSearchTabBarOverlay optionTapped:] IMP=0x3CCC50 bounds=0x3CCC50-0x3CCCB4
loc_3CCC50:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4d0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x3ccca4
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x470]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x530]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c9c // _objc_release

// -[WCLGSearchTabBarOverlay overlayTapped:] IMP=0x3CCCB4 bounds=0x3CCCB4-0x3CCEC8
loc_3CCCB4:
    stp      d9, d8, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x3d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #3
    b.ne     #0x3ccea8
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4d0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3ccea8
    adrp     x8, #0x4bf000
    ldr      x21, [x8, #0x458]
    mov      x0, x19
    mov      x1, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x360]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x770]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, #-10.00000000
    fmov     d5, #-10.00000000
    bl       #0x461714 // _CGRectInset
    fmov     d4, d8
    fmov     d5, d9
    bl       #0x46169c // _CGRectContainsPoint
    cbz      w0, #0x3ccd80
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    b        #0x3ccea8
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x358]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, #-8.00000000
    fmov     d5, #-8.00000000
    bl       #0x461714 // _CGRectInset
    fmov     d4, d8
    fmov     d5, d9
    bl       #0x46169c // _CGRectContainsPoint
    mov      x25, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    tbnz     w25, #0, #0x3ccea8
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0x520]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, #-14.00000000
    fmov     d5, #-12.00000000
    bl       #0x461714 // _CGRectInset
    fmov     d4, d8
    fmov     d5, d9
    bl       #0x46169c // _CGRectContainsPoint
    mov      x22, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    cbz      w22, #0x3cce90
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x19
    mov      x1, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x540]
    mov      x0, x20
    fmov     d0, d8
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    tbnz     x0, #0x3f, #0x3cce90
    mov      x2, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x530]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    b        #0x3ccea8
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f8]
    mov      x0, x20
    mov      w2, #0
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      d9, d8, [sp], #0x60
    b        #0x461c9c // _objc_release

// -[WCLGSearchTabBarOverlay optionIndexAtPointInMenu:] IMP=0x3CCEC8 bounds=0x3CCEC8-0x3CD1D8
loc_3CCEC8:
    sub      sp, sp, #0x90
    stp      d11, d10, [sp, #0x10]
    stp      d9, d8, [sp, #0x20]
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    fmov     d8, d1
    fmov     d9, d0
    mov      x19, x0
    adrp     x8, #0x4c2000
    ldr      x20, [x8, #0x460]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x26, #0x4be000
    ldr      x21, [x26, #0x600]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbz      x23, #0x3cd008
    mov      x22, #0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x608]
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x9a8]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x770]
    ldr      x21, [x26, #0x600]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x1, x23
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x3ccfc8
    mov      x0, x26
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, #-10.00000000
    fmov     d5, #-7.00000000
    bl       #0x461714 // _CGRectInset
    fmov     d4, d9
    fmov     d5, d8
    bl       #0x46169c // _CGRectContainsPoint
    tbnz     w0, #0, #0x3cd190
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    add      x22, x22, #1
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    cmp      x22, x27
    b.lo     #0x3ccf58
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x520]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, #-12.00000000
    fmov     d5, #-10.00000000
    bl       #0x461714 // _CGRectInset
    fmov     d4, d9
    fmov     d5, d8
    bl       #0x46169c // _CGRectContainsPoint
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbz      w23, #0x3cd188
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbz      x23, #0x3cd188
    mov      x22, #0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x608]
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x9a8]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x770]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0x470]
    str      x8, [sp, #8]
    mov      x27, #-1
    mov      x8, #0x7fefffffffffffff
    fmov     d9, x8
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x23
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x3cd134
    mov      x0, x28
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616e4 // _CGRectGetMidY
    fabd     d10, d8, d0
    fcmp     d10, d9
    b.pl     #0x3cd134
    mov      x0, x28
    ldr      x1, [sp, #8]
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    fmov     d9, d10
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    add      x22, x22, #1
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    cmp      x22, x28
    b.lo     #0x3cd0bc
    mov      x8, #0x4042000000000000
    fmov     d0, x8
    fcmp     d9, d0
    csinv    x0, x27, xzr, ls
    b        #0x3cd1b0
    mov      x0, #-1
    b        #0x3cd1b0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x470]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    ldp      d11, d10, [sp, #0x10]
    add      sp, sp, #0x90
    ret      

// -[WCLGSearchTabBarOverlay optionIndexAtGesture:] IMP=0x3CD1D8 bounds=0x3CD1D8-0x3CD270
loc_3CD1D8:
    stp      d9, d8, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0x520]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x458]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x540]
    mov      x0, x20
    fmov     d0, d8
    fmov     d1, d9
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      d9, d8, [sp], #0x40
    b        #0x461c6c // _objc_msgSend

// -[WCLGSearchTabBarOverlay optionIndexAtTouch:] IMP=0x3CD270 bounds=0x3CD270-0x3CD33C
loc_3CD270:
    stp      d9, d8, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x20, x2
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x4d8]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616d8 // _CGRectGetMidX
    fmov     d8, d0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616e4 // _CGRectGetMidY
    fmov     d9, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x520]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xa88]
    mov      x0, x20
    fmov     d0, d8
    fmov     d1, d9
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x540]
    mov      x0, x19
    fmov     d0, d8
    fmov     d1, d9
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      d9, d8, [sp], #0x40
    b        #0x461c6c // _objc_msgSend

// -[WCLGSearchTabBarOverlay optionIndexAtOverlayPoint:] IMP=0x3CD33C bounds=0x3CD33C-0x3CD3BC
loc_3CD33C:
    stp      d9, d8, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    fmov     d8, d1
    fmov     d9, d0
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x520]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xff8]
    fmov     d0, d9
    fmov     d1, d8
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x540]
    mov      x0, x19
    fmov     d0, d8
    fmov     d1, d9
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      d9, d8, [sp], #0x30
    b        #0x461c6c // _objc_msgSend

// -[WCLGSearchTabBarOverlay updateOptionHighlights] IMP=0x3CD3BC bounds=0x3CD3BC-0x3CD788
loc_3CD3BC:
    sub      sp, sp, #0x170
    stp      d15, d14, [sp, #0xd0]
    stp      d13, d12, [sp, #0xe0]
    stp      d11, d10, [sp, #0xf0]
    stp      d9, d8, [sp, #0x100]
    stp      x28, x27, [sp, #0x110]
    stp      x26, x25, [sp, #0x120]
    stp      x24, x23, [sp, #0x130]
    stp      x22, x21, [sp, #0x140]
    stp      x20, x19, [sp, #0x150]
    stp      x29, x30, [sp, #0x160]
    add      x29, sp, #0x160
    mov      x26, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x470]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x78]
    adrp     x8, #0x4c2000
    ldr      x24, [x8, #0x460]
    mov      x0, x26
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x19, #0x4be000
    ldr      x1, [x19, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x25, [x8, #0x468]
    cbz      x21, #0x3cd6dc
    mov      x23, #0
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x608]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0xc28]
    stp      x8, x9, [sp, #0x60]
    adrp     x8, #0x4bf000
    ldr      x9, [x8, #0x470]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x6c8]
    stp      x8, x9, [sp, #0x50]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x9a8]
    str      x8, [sp, #0x48]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x470]
    ldp      q1, q0, [x8]
    stp      q0, q1, [sp, #0x20]
    ldr      q0, [x8, #0x20]
    str      q0, [sp, #0x10]
    adrp     x8, #0x491000
    ldr      d10, [x8, #0x480]
    adrp     x8, #0x491000
    ldr      d11, [x8, #0x910]
    adrp     x8, #0x491000
    ldr      d12, [x8, #0x4d8]
    adrp     x8, #0x491000
    ldr      d13, [x8, #0x3e8]
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x9c8]
    fmov     d14, #1.00000000
    fmov     d15, xzr
    ldr      x8, [x19, #0x600]
    str      x8, [sp, #8]
    str      x24, [sp, #0x70]
    mov      x0, x26
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x68]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    ldr      x19, [sp, #0x60]
    mov      x1, x19
    mov      w2, #0x3e9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x88]
    mov      x0, x24
    mov      x1, x19
    mov      w2, #0x3ea
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x80]
    mov      x0, x24
    mov      x1, x19
    mov      w2, #0x3eb
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x0, x24
    mov      x1, x19
    mov      w2, #0x3ec
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x24
    mov      x1, x19
    mov      w2, #0x3ed
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x24
    ldr      x1, [sp, #0x58]
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    mov      x0, x26
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x25
    mov      x25, x0
    ldp      q0, q1, [sp, #0x20]
    stp      q1, q0, [sp, #0x90]
    ldr      q0, [sp, #0x10]
    str      q0, [sp, #0xb0]
    add      x2, sp, #0x90
    mov      x0, x24
    ldr      x1, [sp, #0x50]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    ldr      x1, [sp, #0x48]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    fcsel    d0, d15, d14, ne
    mov      x0, x24
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x78]
    cmp      x19, x8
    fcsel    d0, d10, d15, eq
    cmp      x19, x25
    mov      x25, x27
    fcsel    d8, d14, d11, eq
    fcsel    d9, d14, d12, eq
    fcsel    d0, d13, d0, eq
    ldr      x19, [sp, #0x88]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x27, [sp, #0x80]
    mov      x0, x27
    mov      x1, x20
    fmov     d0, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    mov      x1, x20
    fmov     d0, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      x1, x20
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    mov      x1, x20
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    ldr      x24, [sp, #0x70]
    bl       #0x461c9c // _objc_release
    add      x23, x23, #1
    mov      x0, x26
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x1, [sp, #8]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cmp      x23, x21
    b.lo     #0x3cd4d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4d0]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x3cd738
    mov      x0, x26
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    tbnz     x0, #0x3f, #0x3cd738
    mov      x0, x26
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x548]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    cmp      x19, x0
    b.eq     #0x3cd738
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x550]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x160]
    ldp      x20, x19, [sp, #0x150]
    ldp      x22, x21, [sp, #0x140]
    ldp      x24, x23, [sp, #0x130]
    ldp      x26, x25, [sp, #0x120]
    ldp      x28, x27, [sp, #0x110]
    ldp      d9, d8, [sp, #0x100]
    ldp      d11, d10, [sp, #0xf0]
    ldp      d13, d12, [sp, #0xe0]
    ldp      d15, d14, [sp, #0xd0]
    add      sp, sp, #0x170
    ret      

// -[WCLGSearchTabBarOverlay touchesBegan:withEvent:] IMP=0x3CD788 bounds=0x3CD788-0x3CD928
loc_3CD788:
    sub      sp, sp, #0x60
    stp      d9, d8, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x20, x3
    mov      x19, x2
    mov      x22, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x650]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x458]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4d0]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3cd8d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x520]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x770]
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, #-12.00000000
    fmov     d5, #-10.00000000
    bl       #0x461714 // _CGRectInset
    fmov     d4, d8
    fmov     d5, d9
    bl       #0x46169c // _CGRectContainsPoint
    mov      x24, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cbz      w24, #0x3cd8d0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4e0]
    mov      x0, x22
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x558]
    mov      x0, x22
    fmov     d0, d8
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x438]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x468]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    tbnz     x0, #0x3f, #0x3cd8bc
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x518]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x488]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    b        #0x3cd8f4
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x810]
    stp      x22, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xe18]
    mov      x0, sp
    mov      x2, x19
    mov      x3, x20
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      d9, d8, [sp, #0x10]
    add      sp, sp, #0x60
    ret      

// -[WCLGSearchTabBarOverlay touchesMoved:withEvent:] IMP=0x3CD928 bounds=0x3CD928-0x3CDA2C
loc_3CD928:
    sub      sp, sp, #0x40
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x3
    mov      x21, x2
    mov      x20, x0
    mov      x0, x3
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c2000
    ldr      x22, [x8, #0x560]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3cd9e4
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x650]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x458]
    mov      x0, x22
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x558]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x438]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x488]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    b        #0x3cda0c
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x810]
    stp      x20, x8, [sp]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6d0]
    mov      x0, sp
    mov      x2, x21
    mov      x3, x19
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    add      sp, sp, #0x40
    ret      

// -[WCLGSearchTabBarOverlay touchesEnded:withEvent:] IMP=0x3CDA2C bounds=0x3CDA2C-0x3CDBB4
loc_3CDA2C:
    sub      sp, sp, #0x50
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x20, x3
    mov      x19, x2
    mov      x21, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x560]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3cdad0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x650]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x458]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x558]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    tbnz     x0, #0x3f, #0x3cdb28
    mov      x23, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4e0]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    b        #0x3cdb54
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4d0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3cdb00
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f8]
    mov      x0, x21
    mov      w2, #0
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    b        #0x3cdb70
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x810]
    stp      x21, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xe20]
    mov      x0, sp
    mov      x2, x19
    mov      x3, x20
    bl       #0x461c84 // _objc_msgSendSuper2
    b        #0x3cdb70
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x468]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4e0]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    tbnz     x23, #0x3f, #0x3cdb98
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x530]
    mov      x0, x21
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    add      sp, sp, #0x50
    ret      
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f8]
    mov      x0, x21
    mov      w2, #0
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    b        #0x3cdb68

// -[WCLGSearchTabBarOverlay touchesCancelled:withEvent:] IMP=0x3CDBB4 bounds=0x3CDBB4-0x3CDC7C
loc_3CDBB4:
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
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x560]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3cdc34
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4e0]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x438]
    mov      x0, x21
    mov      x2, #-1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x488]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    b        #0x3cdc58
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x810]
    stp      x21, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xe28]
    mov      x0, sp
    mov      x2, x19
    mov      x3, x20
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    add      sp, sp, #0x40
    ret      

// -[WCLGSearchTabBarOverlay modeLongPressed:] IMP=0x3CDC7C bounds=0x3CDC7C-0x3CDE20
loc_3CDC7C:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x520]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x3cdd6c
    adrp     x8, #0x4bf000
    ldr      x21, [x8, #0x3d0]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    b.ne     #0x3cdd20
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x510]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f0]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x518]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f8]
    mov      x0, x20
    mov      w2, #1
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    b        #0x3cdd34
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #2
    b.ne     #0x3cdd80
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x528]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x438]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x488]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #3
    b.ne     #0x3cdddc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x468]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    tbz      x0, #0x3f, #0x3cddc8
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x528]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    tbnz     x0, #0x3f, #0x3cde04
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x530]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    b        #0x3cdd6c
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #4
    b.eq     #0x3cde04
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #5
    b.ne     #0x3cdd6c
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f8]
    mov      x0, x20
    mov      w2, #0
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    b        #0x3cdd6c

// -[WCLGSearchTabBarOverlay selectIndex:] IMP=0x3CDE20 bounds=0x3CDE20-0x3CF9B8
loc_3CDE20:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    sub      sp, sp, #0x80
    mov      x25, x2
    mov      x26, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x68]
    adrp     x3, #0x582000
    add      x3, x3, #0xc0
    ldar     w8, [x3]
    cbnz     w8, #0x3cef58
    adrp     x8, #0x55b000
    add      x8, x8, #0x8b0
    ldrb     w9, [x8]
    eor      w10, w9, #0xffffffe7
    adrp     x9, #0x55b000
    add      x9, x9, #0x8d0
    strb     w10, [x9]
    ldrb     w10, [x8, #1]
    mov      w23, #0x5d
    eor      w10, w10, w23
    strb     w10, [x9, #1]
    ldrb     w10, [x8, #2]
    mov      w11, #0xd9
    eor      w10, w10, w11
    mov      w19, #0xd9
    strb     w10, [x9, #2]
    ldrb     w10, [x8, #3]
    mov      w11, #0xc5
    eor      w10, w10, w11
    strb     w10, [x9, #3]
    ldrb     w10, [x8, #4]
    mov      w11, #0x25
    eor      w10, w10, w11
    strb     w10, [x9, #4]
    ldrb     w10, [x8, #5]
    mov      w11, #0x43
    eor      w10, w10, w11
    strb     w10, [x9, #5]
    ldrb     w10, [x8, #6]
    mov      w11, #0x12
    eor      w10, w10, w11
    strb     w10, [x9, #6]
    ldrb     w10, [x8, #7]
    stur     x25, [x29, #-0x80]
    mov      w25, #0x46
    eor      w10, w10, w25
    strb     w10, [x9, #7]
    ldrb     w10, [x8, #8]
    mov      w11, #0xf2
    eor      w10, w10, w11
    strb     w10, [x9, #8]
    ldrb     w11, [x8, #9]
    mov      w10, #0xda
    eor      w11, w11, w10
    strb     w11, [x9, #9]
    ldrb     w11, [x8, #0xa]
    eor      w11, w11, #0x7c
    strb     w11, [x9, #0xa]
    ldrb     w11, [x8, #0xb]
    eor      w11, w11, #0xffffff8f
    strb     w11, [x9, #0xb]
    ldrb     w11, [x8, #0xc]
    mov      w12, #0xaf
    eor      w11, w11, w12
    strb     w11, [x9, #0xc]
    ldrb     w11, [x8, #0xd]
    eor      w11, w11, #3
    strb     w11, [x9, #0xd]
    ldrb     w11, [x8, #0xe]
    mov      w12, #0x72
    eor      w11, w11, w12
    strb     w11, [x9, #0xe]
    ldrb     w11, [x8, #0xf]
    mov      w12, #0xb5
    eor      w11, w11, w12
    mov      w20, #0xb5
    strb     w11, [x9, #0xf]
    ldrb     w11, [x8, #0x10]
    mov      w12, #0xcb
    eor      w11, w11, w12
    strb     w11, [x9, #0x10]
    ldrb     w11, [x8, #0x11]
    eor      w11, w11, #0x18
    strb     w11, [x9, #0x11]
    ldrb     w11, [x8, #0x12]
    mov      w14, #0x95
    eor      w11, w11, w14
    strb     w11, [x9, #0x12]
    ldrb     w11, [x8, #0x13]
    eor      w11, w11, w23
    strb     w11, [x9, #0x13]
    ldrb     w11, [x8, #0x14]
    mov      w0, #0xb8
    eor      w11, w11, w0
    strb     w11, [x9, #0x14]
    ldrb     w11, [x8, #0x15]
    mov      w12, #0xc4
    eor      w11, w11, w12
    strb     w11, [x9, #0x15]
    ldrb     w11, [x8, #0x16]
    eor      w11, w11, #0xbbbbbbbb
    strb     w11, [x9, #0x16]
    ldrb     w11, [x8, #0x17]
    mov      w13, #0x4d
    eor      w11, w11, w13
    strb     w11, [x9, #0x17]
    ldrb     w11, [x8, #0x18]
    mov      w12, #0x7d
    eor      w11, w11, w12
    strb     w11, [x9, #0x18]
    ldrb     w11, [x8, #0x19]
    mov      w12, #0xfa
    eor      w11, w11, w12
    mov      w2, #0xfa
    strb     w11, [x9, #0x19]
    ldrb     w11, [x8, #0x1a]
    mov      w12, #0x86
    eor      w11, w11, w12
    strb     w11, [x9, #0x1a]
    ldrb     w11, [x8, #0x1b]
    mov      w17, #0xa8
    eor      w11, w11, w17
    strb     w11, [x9, #0x1b]
    ldrb     w11, [x8, #0x1c]
    eor      w11, w11, #0xffffffe3
    strb     w11, [x9, #0x1c]
    ldrb     w8, [x8, #0x1d]
    eor      w8, w8, #0x60
    strb     w8, [x9, #0x1d]
    adrp     x11, #0x55b000
    add      x11, x11, #0x850
    ldrb     w8, [x11]
    mov      w9, #0x9c
    eor      w8, w8, w9
    adrp     x12, #0x55b000
    add      x12, x12, #0x880
    strb     w8, [x12]
    ldrb     w8, [x11, #1]
    mov      w9, #0x98
    eor      w8, w8, w9
    strb     w8, [x12, #1]
    ldrb     w8, [x11, #2]
    mov      w15, #0x7a
    eor      w8, w8, w15
    strb     w8, [x12, #2]
    ldrb     w8, [x11, #3]
    mov      w9, #0x32
    eor      w8, w8, w9
    strb     w8, [x12, #3]
    ldrb     w8, [x11, #4]
    eor      w8, w8, #4
    strb     w8, [x12, #4]
    ldrb     w8, [x11, #5]
    mov      w16, #0xa7
    eor      w8, w8, w16
    strb     w8, [x12, #5]
    ldrb     w8, [x11, #6]
    mov      w28, #0xe8
    eor      w8, w8, w28
    strb     w8, [x12, #6]
    ldrb     w8, [x11, #7]
    eor      w8, w8, #0xffffffcf
    strb     w8, [x12, #7]
    ldrb     w8, [x11, #8]
    mov      w27, #0x9b
    eor      w8, w8, w27
    strb     w8, [x12, #8]
    ldrb     w8, [x11, #9]
    eor      w8, w8, #0xf
    strb     w8, [x12, #9]
    ldrb     w8, [x11, #0xa]
    mov      w5, #0x1a
    eor      w8, w8, w5
    strb     w8, [x12, #0xa]
    ldrb     w8, [x11, #0xb]
    eor      w8, w8, w14
    strb     w8, [x12, #0xb]
    ldrb     w8, [x11, #0xc]
    eor      w8, w8, w27
    strb     w8, [x12, #0xc]
    ldrb     w8, [x11, #0xd]
    eor      w8, w8, w16
    strb     w8, [x12, #0xd]
    ldrb     w8, [x11, #0xe]
    mov      w30, #0x58
    eor      w8, w8, w30
    strb     w8, [x12, #0xe]
    ldrb     w8, [x11, #0xf]
    eor      w8, w8, #0xffffffc3
    strb     w8, [x12, #0xf]
    ldrb     w14, [x11, #0x10]
    mov      w8, #0xbc
    eor      w14, w14, w8
    strb     w14, [x12, #0x10]
    ldrb     w16, [x11, #0x11]
    mov      w4, #0x6c
    eor      w16, w16, w4
    strb     w16, [x12, #0x11]
    ldrb     w16, [x11, #0x12]
    eor      w16, w16, #7
    strb     w16, [x12, #0x12]
    ldrb     w16, [x11, #0x13]
    mov      w1, #0x2d
    eor      w16, w16, w1
    strb     w16, [x12, #0x13]
    ldrb     w16, [x11, #0x14]
    eor      w16, w16, w0
    strb     w16, [x12, #0x14]
    ldrb     w16, [x11, #0x15]
    eor      w16, w16, #0xffffffc1
    strb     w16, [x12, #0x15]
    ldrb     w16, [x11, #0x16]
    mov      w14, #0x50
    eor      w16, w16, w14
    strb     w16, [x12, #0x16]
    ldrb     w16, [x11, #0x17]
    eor      w16, w16, w14
    strb     w16, [x12, #0x17]
    ldrb     w16, [x11, #0x18]
    mov      w14, #0x4c
    eor      w16, w16, w14
    strb     w16, [x12, #0x18]
    ldrb     w16, [x11, #0x19]
    eor      w16, w16, #0xffffff8f
    strb     w16, [x12, #0x19]
    ldrb     w16, [x11, #0x1a]
    mov      w0, #0xd3
    eor      w16, w16, w0
    strb     w16, [x12, #0x1a]
    ldrb     w16, [x11, #0x1b]
    mov      w7, #9
    eor      w16, w16, w7
    strb     w16, [x12, #0x1b]
    ldrb     w16, [x11, #0x1c]
    mov      w0, #0x4b
    eor      w16, w16, w0
    strb     w16, [x12, #0x1c]
    ldrb     w16, [x11, #0x1d]
    eor      w16, w16, w9
    strb     w16, [x12, #0x1d]
    ldrb     w16, [x11, #0x1e]
    mov      w6, #0x9a
    eor      w16, w16, w6
    strb     w16, [x12, #0x1e]
    ldrb     w16, [x11, #0x1f]
    mov      w0, #0x79
    eor      w16, w16, w0
    strb     w16, [x12, #0x1f]
    ldrb     w16, [x11, #0x20]
    eor      w16, w16, w20
    strb     w16, [x12, #0x20]
    ldrb     w11, [x11, #0x21]
    mov      w16, #0x14
    eor      w11, w11, w16
    strb     w11, [x12, #0x21]
    adrp     x11, #0x55b000
    add      x11, x11, #0x810
    ldrb     w12, [x11]
    mov      w20, #0x62
    eor      w12, w12, w20
    adrp     x16, #0x55b000
    add      x16, x16, #0x830
    strb     w12, [x16]
    ldrb     w12, [x11, #1]
    mov      w0, #0x4e
    eor      w12, w12, w0
    strb     w12, [x16, #1]
    ldrb     w12, [x11, #2]
    eor      w12, w12, w0
    strb     w12, [x16, #2]
    ldrb     w12, [x11, #3]
    mov      w14, #0xad
    eor      w12, w12, w14
    strb     w12, [x16, #3]
    ldrb     w12, [x11, #4]
    eor      w12, w12, w8
    strb     w12, [x16, #4]
    ldrb     w0, [x11, #5]
    mov      w12, #0x4f
    eor      w0, w0, w12
    strb     w0, [x16, #5]
    ldrb     w0, [x11, #6]
    mov      w14, #0x26
    eor      w0, w0, w14
    strb     w0, [x16, #6]
    ldrb     w0, [x11, #7]
    eor      w0, w0, #0xaaaaaaaa
    strb     w0, [x16, #7]
    ldrb     w0, [x11, #8]
    mov      w1, #0x19
    eor      w0, w0, w1
    strb     w0, [x16, #8]
    ldrb     w0, [x11, #9]
    mov      w14, #0x2f
    eor      w0, w0, w14
    strb     w0, [x16, #9]
    ldrb     w0, [x11, #0xa]
    eor      w0, w0, w19
    strb     w0, [x16, #0xa]
    ldrb     w0, [x11, #0xb]
    mov      w19, #0x89
    eor      w0, w0, w19
    strb     w0, [x16, #0xb]
    ldrb     w0, [x11, #0xc]
    eor      w0, w0, #0x22222222
    strb     w0, [x16, #0xc]
    ldrb     w0, [x11, #0xd]
    mov      w1, #0xb
    eor      w0, w0, w1
    strb     w0, [x16, #0xd]
    ldrb     w0, [x11, #0xe]
    mov      w21, #0xce
    eor      w0, w0, w21
    strb     w0, [x16, #0xe]
    ldrb     w0, [x11, #0xf]
    eor      w0, w0, w6
    strb     w0, [x16, #0xf]
    ldrb     w0, [x11, #0x10]
    eor      w0, w0, #0x10
    strb     w0, [x16, #0x10]
    ldrb     w0, [x11, #0x11]
    mov      w21, #0x48
    eor      w0, w0, w21
    strb     w0, [x16, #0x11]
    ldrb     w0, [x11, #0x12]
    eor      w0, w0, #0x70
    strb     w0, [x16, #0x12]
    ldrb     w0, [x11, #0x13]
    mov      w21, #0xc2
    eor      w0, w0, w21
    strb     w0, [x16, #0x13]
    ldrb     w0, [x11, #0x14]
    mov      x14, x26
    mov      w26, #0x74
    eor      w0, w0, w26
    strb     w0, [x16, #0x14]
    ldrb     w0, [x11, #0x15]
    mov      w22, #0xa0
    eor      w0, w0, w22
    strb     w0, [x16, #0x15]
    ldrb     w11, [x11, #0x16]
    eor      w11, w11, #0xffffffef
    strb     w11, [x16, #0x16]
    adrp     x0, #0x55b000
    add      x0, x0, #0x770
    ldrb     w11, [x0]
    mov      w16, #0x67
    eor      w11, w11, w16
    adrp     x16, #0x55b000
    add      x16, x16, #0x790
    strb     w11, [x16]
    ldrb     w11, [x0, #1]
    eor      w11, w11, #0x1c
    strb     w11, [x16, #1]
    ldrb     w11, [x0, #2]
    eor      w11, w11, w28
    strb     w11, [x16, #2]
    ldrb     w11, [x0, #3]
    mov      w22, #0x8a
    eor      w11, w11, w22
    strb     w11, [x16, #3]
    ldrb     w11, [x0, #4]
    eor      w11, w11, #0x78
    strb     w11, [x16, #4]
    ldrb     w11, [x0, #5]
    eor      w11, w11, w17
    strb     w11, [x16, #5]
    ldrb     w11, [x0, #6]
    mov      w17, #0x54
    eor      w11, w11, w17
    strb     w11, [x16, #6]
    ldrb     w11, [x0, #7]
    eor      w11, w11, #4
    strb     w11, [x16, #7]
    ldrb     w11, [x0, #8]
    mov      w17, #0x96
    eor      w11, w11, w17
    strb     w11, [x16, #8]
    ldrb     w11, [x0, #9]
    eor      w11, w11, #0xffffffc1
    strb     w11, [x16, #9]
    ldrb     w11, [x0, #0xa]
    eor      w11, w11, w2
    strb     w11, [x16, #0xa]
    ldrb     w11, [x0, #0xb]
    eor      w11, w11, w13
    strb     w11, [x16, #0xb]
    ldrb     w11, [x0, #0xc]
    eor      w11, w11, #0xffffff83
    strb     w11, [x16, #0xc]
    ldrb     w13, [x0, #0xd]
    mov      w11, #0x2b
    eor      w13, w13, w11
    strb     w13, [x16, #0xd]
    ldrb     w13, [x0, #0xe]
    eor      w13, w13, w27
    strb     w13, [x16, #0xe]
    ldrb     w13, [x0, #0xf]
    mov      w17, #0x8c
    eor      w13, w13, w17
    strb     w13, [x16, #0xf]
    ldrb     w13, [x0, #0x10]
    eor      w13, w13, #0xffffff81
    strb     w13, [x16, #0x10]
    ldrb     w13, [x0, #0x11]
    eor      w13, w13, #4
    strb     w13, [x16, #0x11]
    ldrb     w13, [x0, #0x12]
    eor      w13, w13, w26
    strb     w13, [x16, #0x12]
    ldrb     w13, [x0, #0x13]
    eor      w10, w13, w10
    strb     w10, [x16, #0x13]
    ldrb     w10, [x0, #0x14]
    eor      w10, w10, w15
    strb     w10, [x16, #0x14]
    ldrb     w10, [x0, #0x15]
    eor      w10, w10, #0x78
    strb     w10, [x16, #0x15]
    ldrb     w10, [x0, #0x16]
    mov      w13, #0xae
    eor      w10, w10, w13
    strb     w10, [x16, #0x16]
    ldrb     w10, [x0, #0x17]
    mov      w24, #0xa4
    eor      w10, w10, w24
    strb     w10, [x16, #0x17]
    ldrb     w10, [x0, #0x18]
    eor      w10, w10, #0x20
    strb     w10, [x16, #0x18]
    ldrb     w10, [x0, #0x19]
    eor      w10, w10, #0x3c
    strb     w10, [x16, #0x19]
    ldrb     w10, [x0, #0x1a]
    eor      w10, w10, w23
    strb     w10, [x16, #0x1a]
    ldrb     w10, [x0, #0x1b]
    mov      w0, #0x6a
    eor      w10, w10, w0
    strb     w10, [x16, #0x1b]
    adrp     x13, #0x55b000
    add      x13, x13, #0x751
    ldrb     w10, [x13]
    mov      w16, #0xd4
    eor      w10, w10, w16
    adrp     x16, #0x55b000
    add      x16, x16, #0x75d
    strb     w10, [x16]
    ldrb     w10, [x13, #1]
    eor      w10, w10, w25
    strb     w10, [x16, #1]
    ldrb     w10, [x13, #2]
    mov      w25, #0x82
    eor      w10, w10, w25
    strb     w10, [x16, #2]
    ldrb     w10, [x13, #3]
    mov      w25, #0x75
    eor      w10, w10, w25
    strb     w10, [x16, #3]
    ldrb     w10, [x13, #4]
    mov      w25, #0x73
    eor      w10, w10, w25
    strb     w10, [x16, #4]
    ldrb     w10, [x13, #5]
    eor      w10, w10, w20
    strb     w10, [x16, #5]
    ldrb     w10, [x13, #6]
    mov      w20, #0x39
    eor      w10, w10, w20
    strb     w10, [x16, #6]
    ldrb     w10, [x13, #7]
    eor      w10, w10, w24
    strb     w10, [x16, #7]
    ldrb     w10, [x13, #8]
    eor      w10, w10, #0x1c
    strb     w10, [x16, #8]
    ldrb     w10, [x13, #9]
    eor      w10, w10, #0x38
    strb     w10, [x16, #9]
    ldrb     w20, [x13, #0xa]
    mov      w10, #0xe4
    eor      w20, w20, w10
    strb     w20, [x16, #0xa]
    ldrb     w13, [x13, #0xb]
    mov      w25, #0xa5
    eor      w13, w13, w25
    strb     w13, [x16, #0xb]
    adrp     x16, #0x55b000
    add      x16, x16, #0x620
    ldrb     w13, [x16]
    mov      w20, #0x69
    eor      w13, w13, w20
    adrp     x20, #0x55b000
    add      x20, x20, #0x640
    strb     w13, [x20]
    ldrb     w13, [x16, #1]
    eor      w13, w13, #0x38
    strb     w13, [x20, #1]
    ldrb     w13, [x16, #2]
    eor      w13, w13, #0xeeeeeeee
    strb     w13, [x20, #2]
    ldrb     w13, [x16, #3]
    eor      w13, w13, #0x40
    strb     w13, [x20, #3]
    ldrb     w13, [x16, #4]
    eor      w13, w13, w26
    strb     w13, [x20, #4]
    ldrb     w13, [x16, #5]
    eor      w13, w13, w6
    strb     w13, [x20, #5]
    ldrb     w2, [x16, #6]
    mov      w13, #0xa1
    eor      w2, w2, w13
    strb     w2, [x20, #6]
    ldrb     w2, [x16, #7]
    eor      w2, w2, #7
    strb     w2, [x20, #7]
    ldrb     w2, [x16, #8]
    eor      w2, w2, w5
    strb     w2, [x20, #8]
    ldrb     w2, [x16, #9]
    eor      w2, w2, w15
    strb     w2, [x20, #9]
    ldrb     w2, [x16, #0xa]
    mov      w5, #0x37
    eor      w2, w2, w5
    strb     w2, [x20, #0xa]
    ldrb     w2, [x16, #0xb]
    eor      w2, w2, #0xfe
    strb     w2, [x20, #0xb]
    ldrb     w2, [x16, #0xc]
    eor      w2, w2, #0xffffffc3
    strb     w2, [x20, #0xc]
    ldrb     w2, [x16, #0xd]
    mov      w5, #0x4a
    eor      w2, w2, w5
    strb     w2, [x20, #0xd]
    ldrb     w2, [x16, #0xe]
    eor      w2, w2, w17
    strb     w2, [x20, #0xe]
    ldrb     w2, [x16, #0xf]
    eor      w2, w2, w7
    strb     w2, [x20, #0xf]
    ldrb     w2, [x16, #0x10]
    eor      w9, w2, w9
    strb     w9, [x20, #0x10]
    ldrb     w9, [x16, #0x11]
    eor      w9, w9, #8
    strb     w9, [x20, #0x11]
    adrp     x9, #0x55b000
    add      x9, x9, #0x720
    ldrb     w16, [x9]
    eor      w16, w16, w19
    adrp     x2, #0x55b000
    add      x2, x2, #0x740
    strb     w16, [x2]
    ldrb     w16, [x9, #1]
    eor      w16, w16, w23
    strb     w16, [x2, #1]
    ldrb     w16, [x9, #2]
    eor      w16, w16, #0xfffffff9
    strb     w16, [x2, #2]
    ldrb     w16, [x9, #3]
    eor      w16, w16, #3
    strb     w16, [x2, #3]
    ldrb     w16, [x9, #4]
    eor      w16, w16, #0xffffff83
    strb     w16, [x2, #4]
    ldrb     w16, [x9, #5]
    eor      w16, w16, #0x60
    strb     w16, [x2, #5]
    ldrb     w16, [x9, #6]
    mvn      w16, w16
    strb     w16, [x2, #6]
    ldrb     w16, [x9, #7]
    mov      w7, #0xd5
    eor      w16, w16, w7
    strb     w16, [x2, #7]
    ldrb     w16, [x9, #8]
    eor      w16, w16, #0xf0
    strb     w16, [x2, #8]
    ldrb     w16, [x9, #9]
    eor      w16, w16, w21
    strb     w16, [x2, #9]
    ldrb     w16, [x9, #0xa]
    eor      w16, w16, #0x1f
    strb     w16, [x2, #0xa]
    ldrb     w16, [x9, #0xb]
    mov      w7, #0xe6
    eor      w16, w16, w7
    strb     w16, [x2, #0xb]
    ldrb     w16, [x9, #0xc]
    eor      w16, w16, #0x38
    strb     w16, [x2, #0xc]
    ldrb     w16, [x9, #0xd]
    eor      w16, w16, w4
    strb     w16, [x2, #0xd]
    ldrb     w16, [x9, #0xe]
    eor      w16, w16, #3
    strb     w16, [x2, #0xe]
    ldrb     w16, [x9, #0xf]
    eor      w11, w16, w11
    strb     w11, [x2, #0xf]
    ldrb     w9, [x9, #0x10]
    mov      w11, #0x12
    eor      w9, w9, w11
    strb     w9, [x2, #0x10]
    adrp     x9, #0x55b000
    add      x9, x9, #0x6e0
    ldrb     w11, [x9]
    eor      w11, w11, w28
    adrp     x16, #0x55b000
    add      x16, x16, #0x700
    strb     w11, [x16]
    ldrb     w11, [x9, #1]
    eor      w11, w11, #0xfffffff3
    strb     w11, [x16, #1]
    ldrb     w11, [x9, #2]
    eor      w11, w11, w30
    strb     w11, [x16, #2]
    ldrb     w11, [x9, #3]
    eor      w8, w11, w8
    strb     w8, [x16, #3]
    ldrb     w8, [x9, #4]
    eor      w8, w8, w27
    strb     w8, [x16, #4]
    ldrb     w8, [x9, #5]
    mov      w11, #0x43
    eor      w8, w8, w11
    strb     w8, [x16, #5]
    ldrb     w8, [x9, #6]
    mov      w11, #0x6e
    eor      w8, w8, w11
    strb     w8, [x16, #6]
    ldrb     w8, [x9, #7]
    mov      w27, #0x98
    eor      w8, w8, w27
    strb     w8, [x16, #7]
    ldrb     w8, [x9, #8]
    mov      w2, #0x8d
    eor      w8, w8, w2
    strb     w8, [x16, #8]
    ldrb     w8, [x9, #9]
    mov      w2, #0xb3
    eor      w8, w8, w2
    strb     w8, [x16, #9]
    ldrb     w8, [x9, #0xa]
    mov      w2, #0xb9
    eor      w8, w8, w2
    strb     w8, [x16, #0xa]
    ldrb     w8, [x9, #0xb]
    eor      w8, w8, #0xf
    strb     w8, [x16, #0xb]
    ldrb     w8, [x9, #0xc]
    eor      w8, w8, w25
    strb     w8, [x16, #0xc]
    ldrb     w8, [x9, #0xd]
    eor      w8, w8, #0xcccccccc
    strb     w8, [x16, #0xd]
    ldrb     w8, [x9, #0xe]
    eor      w8, w8, w12
    strb     w8, [x16, #0xe]
    ldrb     w8, [x9, #0xf]
    eor      w8, w8, #0x70
    strb     w8, [x16, #0xf]
    ldrb     w8, [x9, #0x10]
    mov      w12, #0xe9
    eor      w8, w8, w12
    strb     w8, [x16, #0x10]
    ldrb     w8, [x9, #0x11]
    mov      w12, #0xd1
    eor      w8, w8, w12
    strb     w8, [x16, #0x11]
    ldrb     w8, [x9, #0x12]
    eor      w8, w8, w12
    strb     w8, [x16, #0x12]
    ldrb     w8, [x9, #0x13]
    mov      w2, #0x15
    eor      w8, w8, w2
    strb     w8, [x16, #0x13]
    ldrb     w8, [x9, #0x14]
    mov      w2, #0xd8
    eor      w8, w8, w2
    strb     w8, [x16, #0x14]
    ldrb     w8, [x9, #0x15]
    eor      w8, w8, w1
    strb     w8, [x16, #0x15]
    ldrb     w8, [x9, #0x16]
    eor      w8, w8, #0xffffffe1
    strb     w8, [x16, #0x16]
    adrp     x1, #0x55b000
    add      x1, x1, #0x660
    ldrb     w9, [x1]
    mov      w8, #0x5e
    eor      w9, w9, w8
    adrp     x7, #0x55b000
    add      x7, x7, #0x680
    strb     w9, [x7]
    ldrb     w9, [x1, #1]
    eor      w9, w9, w22
    strb     w9, [x7, #1]
    ldrb     w9, [x1, #2]
    eor      w9, w9, #0xf0
    strb     w9, [x7, #2]
    ldrb     w9, [x1, #3]
    mov      w16, #0xe5
    eor      w9, w9, w16
    strb     w9, [x7, #3]
    ldrb     w9, [x1, #4]
    eor      w9, w9, #0x80
    strb     w9, [x7, #4]
    ldrb     w9, [x1, #5]
    mov      w19, #0x63
    eor      w9, w9, w19
    strb     w9, [x7, #5]
    ldrb     w9, [x1, #6]
    eor      w9, w9, #7
    strb     w9, [x7, #6]
    ldrb     w9, [x1, #7]
    mov      w16, #0xea
    eor      w9, w9, w16
    strb     w9, [x7, #7]
    ldrb     w9, [x1, #8]
    eor      w9, w9, #0x38
    strb     w9, [x7, #8]
    ldrb     w2, [x1, #9]
    mov      w9, #0x27
    eor      w2, w2, w9
    strb     w2, [x7, #9]
    ldrb     w2, [x1, #0xa]
    eor      w2, w2, #0x77777777
    strb     w2, [x7, #0xa]
    ldrb     w2, [x1, #0xb]
    mov      w20, #0xec
    eor      w2, w2, w20
    strb     w2, [x7, #0xb]
    ldrb     w2, [x1, #0xc]
    eor      w2, w2, #0xffffffcf
    strb     w2, [x7, #0xc]
    ldrb     w2, [x1, #0xd]
    eor      w2, w2, #0x3f
    strb     w2, [x7, #0xd]
    ldrb     w2, [x1, #0xe]
    eor      w2, w2, #0x60
    strb     w2, [x7, #0xe]
    ldrb     w2, [x1, #0xf]
    mov      w20, #0xc6
    eor      w2, w2, w20
    strb     w2, [x7, #0xf]
    ldrb     w2, [x1, #0x10]
    mov      w23, #0xdb
    eor      w2, w2, w23
    strb     w2, [x7, #0x10]
    ldrb     w2, [x1, #0x11]
    eor      w2, w2, w9
    strb     w2, [x7, #0x11]
    ldrb     w2, [x1, #0x12]
    eor      w17, w2, w17
    strb     w17, [x7, #0x12]
    ldrb     w17, [x1, #0x13]
    mov      w2, #0x93
    eor      w17, w17, w2
    strb     w17, [x7, #0x13]
    ldrb     w17, [x1, #0x14]
    mov      w2, #0x86
    eor      w17, w17, w2
    strb     w17, [x7, #0x14]
    ldrb     w17, [x1, #0x15]
    eor      w17, w17, w20
    strb     w17, [x7, #0x15]
    ldrb     w17, [x1, #0x16]
    eor      w17, w17, #0xffffffef
    strb     w17, [x7, #0x16]
    ldrb     w17, [x1, #0x17]
    mvn      w17, w17
    strb     w17, [x7, #0x17]
    adrp     x17, #0x55b000
    add      x17, x17, #0x5e0
    ldrb     w1, [x17]
    mov      w2, #0xb5
    eor      w1, w1, w2
    adrp     x2, #0x55b000
    add      x2, x2, #0x5f0
    strb     w1, [x2]
    ldrb     w1, [x17, #1]
    eor      w12, w1, w12
    strb     w12, [x2, #1]
    ldrb     w12, [x17, #2]
    mov      w7, #0x26
    eor      w12, w12, w7
    strb     w12, [x2, #2]
    ldrb     w12, [x17, #3]
    eor      w12, w12, w19
    strb     w12, [x2, #3]
    ldrb     w12, [x17, #4]
    eor      w12, w12, #0x70
    strb     w12, [x2, #4]
    ldrb     w12, [x17, #5]
    eor      w12, w12, w5
    strb     w12, [x2, #5]
    ldrb     w12, [x17, #6]
    mov      w1, #0x76
    eor      w12, w12, w1
    strb     w12, [x2, #6]
    ldrb     w12, [x17, #7]
    mov      w1, #0xaf
    eor      w12, w12, w1
    strb     w12, [x2, #7]
    ldrb     w12, [x17, #8]
    eor      w12, w12, w16
    strb     w12, [x2, #8]
    ldrb     w12, [x17, #9]
    eor      w11, w12, w11
    strb     w11, [x2, #9]
    ldrb     w11, [x17, #0xa]
    mov      w12, #0xb1
    eor      w11, w11, w12
    strb     w11, [x2, #0xa]
    ldrb     w11, [x17, #0xb]
    mov      w12, #0xcb
    eor      w11, w11, w12
    strb     w11, [x2, #0xb]
    ldrb     w11, [x17, #0xc]
    eor      w11, w11, w0
    strb     w11, [x2, #0xc]
    ldrb     w11, [x17, #0xd]
    mov      w12, #0x5f
    eor      w11, w11, w12
    strb     w11, [x2, #0xd]
    ldrb     w11, [x17, #0xe]
    eor      w11, w11, w26
    mov      x26, x14
    strb     w11, [x2, #0xe]
    ldrb     w11, [x17, #0xf]
    mov      w12, #0x21
    eor      w11, w11, w12
    strb     w11, [x2, #0xf]
    adrp     x11, #0x55b000
    add      x11, x11, #0x7d0
    ldrb     w16, [x11]
    mov      w17, #0x28
    adrp     x12, #0x55b000
    add      x12, x12, #0x7f0
    eor      w16, w16, w17
    strb     w16, [x12]
    ldrb     w16, [x11, #1]
    eor      w13, w16, w13
    strb     w13, [x12, #1]
    ldrb     w13, [x11, #2]
    eor      w13, w13, #0xfc
    strb     w13, [x12, #2]
    ldrb     w13, [x11, #3]
    eor      w13, w13, #0x66666666
    strb     w13, [x12, #3]
    ldrb     w13, [x11, #4]
    eor      w13, w13, w6
    strb     w13, [x12, #4]
    ldrb     w13, [x11, #5]
    mov      w16, #0x53
    eor      w13, w13, w16
    strb     w13, [x12, #5]
    ldrb     w13, [x11, #6]
    mov      w14, #0xd9
    eor      w13, w13, w14
    strb     w13, [x12, #6]
    ldrb     w13, [x11, #7]
    mov      w16, #0xb2
    eor      w13, w13, w16
    strb     w13, [x12, #7]
    ldrb     w13, [x11, #8]
    eor      w13, w13, #0xcccccccc
    strb     w13, [x12, #8]
    ldrb     w13, [x11, #9]
    mov      w16, #0xe2
    eor      w13, w13, w16
    strb     w13, [x12, #9]
    ldrb     w13, [x11, #0xa]
    eor      w13, w13, #0x20
    strb     w13, [x12, #0xa]
    ldrb     w13, [x11, #0xb]
    eor      w13, w13, #0x3e
    strb     w13, [x12, #0xb]
    ldrb     w13, [x11, #0xc]
    eor      w10, w13, w10
    strb     w10, [x12, #0xc]
    ldrb     w10, [x11, #0xd]
    mov      w13, #0x2f
    eor      w10, w10, w13
    strb     w10, [x12, #0xd]
    ldrb     w10, [x11, #0xe]
    eor      w10, w10, w27
    strb     w10, [x12, #0xe]
    ldrb     w10, [x11, #0xf]
    eor      w10, w10, #0x44444444
    strb     w10, [x12, #0xf]
    ldrb     w10, [x11, #0x10]
    eor      w10, w10, w21
    strb     w10, [x12, #0x10]
    ldrb     w10, [x11, #0x11]
    mov      w13, #0x50
    eor      w10, w10, w13
    strb     w10, [x12, #0x11]
    ldrb     w10, [x11, #0x12]
    eor      w10, w10, #0x70
    strb     w10, [x12, #0x12]
    ldrb     w10, [x11, #0x13]
    eor      w10, w10, #0x1f
    strb     w10, [x12, #0x13]
    ldrb     w10, [x11, #0x14]
    mov      w13, #0x64
    eor      w10, w10, w13
    strb     w10, [x12, #0x14]
    ldrb     w10, [x11, #0x15]
    eor      w10, w10, w15
    strb     w10, [x12, #0x15]
    adrp     x12, #0x55b000
    add      x12, x12, #0x6a0
    ldrb     w10, [x12]
    eor      w10, w10, w22
    adrp     x13, #0x55b000
    add      x13, x13, #0x6c0
    strb     w10, [x13]
    ldrb     w10, [x12, #1]
    mov      w11, #0xbd
    eor      w10, w10, w11
    strb     w10, [x13, #1]
    ldrb     w10, [x12, #2]
    mov      w15, #0xb6
    eor      w10, w10, w15
    strb     w10, [x13, #2]
    ldrb     w10, [x12, #3]
    eor      w10, w10, #0xfffffff3
    strb     w10, [x13, #3]
    ldrb     w10, [x12, #4]
    eor      w10, w10, #0x22222222
    strb     w10, [x13, #4]
    ldrb     w10, [x12, #5]
    eor      w10, w10, w1
    mov      w17, #0xaf
    strb     w10, [x13, #5]
    ldrb     w10, [x12, #6]
    eor      w10, w10, #0x3c
    strb     w10, [x13, #6]
    ldrb     w10, [x12, #7]
    eor      w10, w10, #0x3f
    strb     w10, [x13, #7]
    ldrb     w10, [x12, #8]
    mov      w14, #0x4c
    eor      w10, w10, w14
    strb     w10, [x13, #8]
    ldrb     w10, [x12, #9]
    mov      w15, #0x71
    eor      w10, w10, w15
    strb     w10, [x13, #9]
    ldrb     w10, [x12, #0xa]
    mov      w15, #0x97
    eor      w10, w10, w15
    strb     w10, [x13, #0xa]
    ldrb     w10, [x12, #0xb]
    eor      w10, w10, #0xfffffff9
    strb     w10, [x13, #0xb]
    mov      w10, #0xf6
    ldrb     w15, [x12, #0xc]
    eor      w15, w15, w4
    strb     w15, [x13, #0xc]
    ldrb     w15, [x12, #0xd]
    eor      w15, w15, w10
    strb     w15, [x13, #0xd]
    ldrb     w15, [x12, #0xe]
    eor      w15, w15, w24
    strb     w15, [x13, #0xe]
    ldrb     w15, [x12, #0xf]
    eor      w15, w15, #0xc0
    strb     w15, [x13, #0xf]
    ldrb     w15, [x12, #0x10]
    eor      w15, w15, #6
    strb     w15, [x13, #0x10]
    ldrb     w15, [x12, #0x11]
    eor      w15, w15, w7
    strb     w15, [x13, #0x11]
    ldrb     w12, [x12, #0x12]
    mov      w15, #0xde
    eor      w12, w12, w15
    strb     w12, [x13, #0x12]
    adrp     x12, #0x55b000
    add      x12, x12, #0x7ac
    ldrb     w13, [x12]
    eor      w15, w13, #0x78
    adrp     x13, #0x55b000
    add      x13, x13, #0x7bc
    strb     w15, [x13]
    ldrb     w15, [x12, #1]
    mov      w14, #0xad
    eor      w15, w15, w14
    strb     w15, [x13, #1]
    ldrb     w15, [x12, #2]
    mov      w14, #0x9c
    eor      w15, w15, w14
    strb     w15, [x13, #2]
    ldrb     w15, [x12, #3]
    mov      w16, #0x3a
    eor      w15, w15, w16
    strb     w15, [x13, #3]
    ldrb     w15, [x12, #4]
    mov      w14, #0xfa
    eor      w15, w15, w14
    strb     w15, [x13, #4]
    ldrb     w15, [x12, #5]
    eor      w15, w15, #0x33333333
    strb     w15, [x13, #5]
    ldrb     w15, [x12, #6]
    eor      w11, w15, w11
    strb     w11, [x13, #6]
    ldrb     w11, [x12, #7]
    mov      w15, #0xb4
    eor      w11, w11, w15
    strb     w11, [x13, #7]
    ldrb     w11, [x12, #8]
    eor      w11, w11, #0xaaaaaaaa
    strb     w11, [x13, #8]
    ldrb     w11, [x12, #9]
    eor      w11, w11, w25
    ldur     x25, [x29, #-0x80]
    strb     w11, [x13, #9]
    ldrb     w11, [x12, #0xa]
    mov      w15, #0xa3
    eor      w11, w11, w15
    strb     w11, [x13, #0xa]
    ldrb     w11, [x12, #0xb]
    eor      w11, w11, #0x38
    strb     w11, [x13, #0xb]
    ldrb     w11, [x12, #0xc]
    mov      w15, #0x16
    eor      w11, w11, w15
    strb     w11, [x13, #0xc]
    ldrb     w11, [x12, #0xd]
    eor      w11, w11, w4
    mov      w14, #0x65
    strb     w11, [x13, #0xd]
    ldrb     w11, [x12, #0xe]
    mov      w15, #0x31
    eor      w11, w11, w15
    strb     w11, [x13, #0xe]
    ldrb     w11, [x12, #0xf]
    eor      w11, w11, w17
    strb     w11, [x13, #0xf]
    adrp     x11, #0x55b000
    add      x11, x11, #0x600
    ldrb     w12, [x11]
    eor      w12, w12, w14
    adrp     x13, #0x55b000
    add      x13, x13, #0x60c
    strb     w12, [x13]
    ldrb     w12, [x11, #1]
    eor      w8, w12, w8
    mov      w12, #0x94
    strb     w8, [x13, #1]
    ldrb     w8, [x11, #2]
    eor      w8, w8, w10
    strb     w8, [x13, #2]
    ldrb     w8, [x11, #3]
    eor      w8, w8, w12
    strb     w8, [x13, #3]
    ldrb     w8, [x11, #4]
    eor      w8, w8, w9
    strb     w8, [x13, #4]
    ldrb     w8, [x11, #5]
    mov      w9, #0x72
    eor      w8, w8, w9
    strb     w8, [x13, #5]
    ldrb     w8, [x11, #6]
    mov      w9, #0x2e
    eor      w8, w8, w9
    strb     w8, [x13, #6]
    mov      w8, #0x5a
    ldrb     w9, [x11, #7]
    mov      w10, #0x52
    eor      w9, w9, w10
    strb     w9, [x13, #7]
    ldrb     w9, [x11, #8]
    eor      w8, w9, w8
    strb     w8, [x13, #8]
    ldrb     w8, [x11, #9]
    mov      w9, #0x13
    eor      w8, w8, w9
    strb     w8, [x13, #9]
    ldrb     w8, [x11, #0xa]
    mov      w9, #0x2c
    eor      w8, w8, w9
    strb     w8, [x13, #0xa]
    ldrb     w8, [x11, #0xb]
    eor      w8, w8, #0xeeeeeeee
    strb     w8, [x13, #0xb]
    mov      w8, #1
    stlr     w8, [x3]
    sub      x28, sp, #0x40
    mov      sp, x28
    sub      x8, sp, #0x80
    stur     x8, [x29, #-0x88]
    mov      sp, x8
    sub      x27, sp, #0x20
    mov      sp, x27
    sub      x24, sp, #0x40
    mov      sp, x24
    sub      x8, sp, #0x80
    stur     x8, [x29, #-0x98]
    mov      sp, x8
    sub      x22, sp, #0x20
    mov      sp, x22
    sub      x20, sp, #0x40
    mov      sp, x20
    sub      x23, sp, #0x80
    mov      sp, x23
    sub      x19, sp, #0x10
    mov      sp, x19
    sub      x8, sp, #0x30
    stur     x8, [x29, #-0x90]
    mov      sp, x8
    sub      x21, sp, #0x30
    mov      sp, x21
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x568]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x3cf918
    stur     x23, [x29, #-0xa0]
    stur     x22, [x29, #-0xc0]
    stur     x21, [x29, #-0xb0]
    adrp     x8, #0x4bf000
    ldr      x21, [x8, #0x110]
    mov      x0, x26
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    stur     x1, [x29, #-0xb8]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cmp      x23, x25
    b.ls     #0x3cf308
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x570]
    mov      x0, x26
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x518]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x438]
    mov      x0, x26
    stur     x25, [x29, #-0x80]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x488]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x22, [x8, #0xea8]
    mov      x0, x26
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    bl       #0x461c9c // _objc_release
    cbz      x23, #0x3cf110
    mov      x0, x26
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c4000
    ldr      x25, [x8, #0xa8]
    bl       #0x46145c // _CACurrentMediaTime
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x440]
    fadd     d0, d0, d1
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x498]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x1, #0x55a000
    add      x1, x1, #0xdc0
    mov      x0, x23
    mov      x2, x25
    mov      w3, #1
    bl       #0x461ce4 // _objc_setAssociatedObject
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f8]
    mov      x0, x26
    mov      w2, #0
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    bl       #0x3c79d0
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x26
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x26
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    stur     x22, [x29, #-0xa8]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    stur     x21, [x29, #-0xc8]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    stur     x23, [x29, #-0x70]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    movi     v0.16b, #0
    stp      q0, q0, [x20, #0x20]
    stp      q0, q0, [x20]
    adrp     x8, #0x55b000
    add      x8, x8, #0xb10
    adrp     x9, #0x55b000
    add      x9, x9, #0xa50
    stp      x8, x9, [x19]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    stur     x1, [x29, #-0xd8]
    mov      x2, x19
    mov      w3, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stur     x1, [x29, #-0x78]
    mov      x2, x20
    ldur     x3, [x29, #-0xa0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x26, [x29, #-0xd0]
    cbz      x0, #0x3cf358
    mov      x25, x0
    stur     x27, [x29, #-0xe0]
    ldr      x8, [x20, #0x10]
    ldr      x21, [x8]
    adrp     x8, #0x4be000
    adrp     x9, #0x4be000
    mov      x23, #0
    ldr      x27, [x8, #0x410]
    ldr      x26, [x9, #0x418]
    ldr      x8, [x20, #0x10]
    ldr      x8, [x8]
    cmp      x8, x21
    b.eq     #0x3cf240
    mov      x0, x22
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x20, #8]
    ldr      x0, [x8, x23, lsl #3]
    bl       #0x4617a4 // _NSSelectorFromString
    mov      x19, x0
    ldur     x0, [x29, #-0x70]
    mov      x1, x19
    mov      w2, #3
    bl       #0x3d4520
    cbz      w0, #0x3cf2ac
    ldur     x0, [x29, #-0x70]
    mov      x1, x19
    ldur     x2, [x29, #-0x80]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x3cf2fc
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    add      x23, x23, #1
    cmp      x25, x23
    b.ne     #0x3cf228
    b        #0x3cf2d0
    cmp      w1, #1
    b.ne     #0x3cf9b4
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    b        #0x3cf2ac
    mov      x0, x22
    ldur     x1, [x29, #-0x78]
    mov      x2, x20
    ldur     x3, [x29, #-0xa0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    adrp     x8, #0x4be000
    adrp     x9, #0x4be000
    cbnz     x0, #0x3cf21c
    mov      x19, #0
    ldur     x26, [x29, #-0xd0]
    ldur     x27, [x29, #-0xe0]
    b        #0x3cf35c
    ldur     x8, [x29, #-0x68]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x3cf954
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x4f8]
    mov      x0, x26
    mov      w2, #0
    mov      w3, #1
    sub      sp, x29, #0x60
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    ldp      d9, d8, [sp], #0x70
    b        #0x461c6c // _objc_msgSend
    mov      x19, #0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x25, [x29, #-0x70]
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldur     x23, [x29, #-0x80]
    ldur     x22, [x29, #-0xa8]
    cbnz     x19, #0x3cf3bc
    ldur     x19, [x29, #-0xc8]
    mov      x0, x19
    ldur     x1, [x29, #-0xb8]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, x23
    b.ls     #0x3cf3b8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x0, x19
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    b        #0x3cf3bc
    mov      x19, #0
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    adrp     x0, #0x55b000
    add      x0, x0, #0xc50
    bl       #0x4617a4 // _NSSelectorFromString
    mov      x20, x0
    mov      x0, x25
    mov      x1, x20
    mov      w2, #3
    bl       #0x3d4520
    cbz      w0, #0x3cf3f8
    mov      x0, x25
    mov      x1, x20
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    adrp     x0, #0x55b000
    add      x0, x0, #0xbd0
    bl       #0x4617a4 // _NSSelectorFromString
    mov      x20, x0
    mov      x0, x25
    mov      x1, x20
    mov      w2, #4
    bl       #0x3d4520
    cbz      w0, #0x3cf448
    mov      x0, x25
    mov      x1, x20
    mov      x2, x22
    mov      x3, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    cbz      x19, #0x3cf750
    adrp     x0, #0x55b000
    add      x0, x0, #0xb50
    bl       #0x4617a4 // _NSSelectorFromString
    mov      x1, x0
    mov      x0, x19
    bl       #0x3d45b0
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    cbnz     x0, #0x3cf4b0
    adrp     x0, #0x55b000
    add      x0, x0, #0xb90
    bl       #0x4617a4 // _NSSelectorFromString
    mov      x1, x0
    mov      x0, x19
    bl       #0x3d45b0
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    movi     v0.16b, #0
    stp      q0, q0, [x28, #0x20]
    adrp     x8, #0x55b000
    add      x8, x8, #0xad0
    stp      q0, q0, [x28]
    adrp     x9, #0x55b000
    add      x9, x9, #0xa90
    adrp     x10, #0x55b000
    add      x10, x10, #0xa10
    stp      x8, x9, [x27]
    adrp     x8, #0x55b000
    add      x8, x8, #0xc10
    stp      x10, x8, [x27, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    ldur     x1, [x29, #-0xd8]
    mov      x2, x27
    mov      w3, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x78]
    mov      x2, x28
    ldur     x3, [x29, #-0x88]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x3cf5f4
    mov      x25, x0
    ldr      x8, [x28, #0x10]
    ldr      x21, [x8]
    mov      x23, #0
    ldr      x8, [x28, #0x10]
    ldr      x8, [x8]
    cmp      x8, x21
    b.eq     #0x3cf548
    mov      x0, x22
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x28, #8]
    ldr      x26, [x8, x23, lsl #3]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x26
    bl       #0x4617a4 // _NSSelectorFromString
    mov      x27, x0
    mov      x0, x19
    mov      x1, x27
    mov      w2, #3
    bl       #0x3d4520
    cbz      w0, #0x3cf598
    mov      x0, x19
    mov      x1, x27
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    add      x23, x23, #1
    cmp      x25, x23
    b.ne     #0x3cf530
    b        #0x3cf5d4
    cmp      w1, #1
    b.ne     #0x3cf9b4
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    b        #0x3cf598
    mov      x0, x22
    ldur     x1, [x29, #-0x78]
    mov      x2, x28
    ldur     x3, [x29, #-0x88]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    cbnz     x0, #0x3cf52c
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    stp      q0, q0, [x24, #0x20]
    adrp     x8, #0x55b000
    add      x8, x8, #0x9d0
    stp      q0, q0, [x24]
    adrp     x9, #0x55b000
    add      x9, x9, #0x990
    adrp     x10, #0x55b000
    add      x10, x10, #0x910
    ldur     x2, [x29, #-0xc0]
    stp      x8, x9, [x2]
    adrp     x8, #0x55b000
    add      x8, x8, #0x950
    stp      x10, x8, [x2, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    ldur     x1, [x29, #-0xd8]
    mov      w3, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x78]
    mov      x2, x24
    ldur     x28, [x29, #-0x98]
    mov      x3, x28
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x3cf730
    mov      x25, x0
    ldr      x8, [x24, #0x10]
    ldr      x21, [x8]
    mov      x23, #0
    ldr      x8, [x24, #0x10]
    ldr      x8, [x8]
    cmp      x8, x21
    b.eq     #0x3cf698
    mov      x0, x22
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x24, #8]
    ldr      x26, [x8, x23, lsl #3]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    bl       #0x4617a4 // _NSSelectorFromString
    mov      x27, x0
    mov      x0, x19
    mov      x1, x27
    mov      w2, #2
    bl       #0x3d4520
    cbz      w0, #0x3cf6d8
    mov      x0, x19
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    add      x23, x23, #1
    cmp      x25, x23
    b.ne     #0x3cf680
    b        #0x3cf710
    cmp      w1, #1
    b.ne     #0x3cf9b4
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    ldur     x28, [x29, #-0x98]
    b        #0x3cf6d8
    mov      x0, x22
    ldur     x1, [x29, #-0x78]
    mov      x2, x24
    mov      x3, x28
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    cbnz     x0, #0x3cf67c
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x26, [x29, #-0xd0]
    ldur     x23, [x29, #-0x80]
    ldur     x25, [x29, #-0x70]
    ldur     x22, [x29, #-0xa8]
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cbz      x25, #0x3cf84c
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0xd88]
    mov      x0, x25
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldur     x1, [x29, #-0xb8]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cmp      x22, x23
    ldur     x22, [x29, #-0xa8]
    b.ls     #0x3cf84c
    mov      x0, x25
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cbz      x20, #0x3cf818
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x2e8]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461c9c // _objc_release
    cmp      x21, x20
    b.eq     #0x3cf818
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x5c8]
    mov      x0, x25
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x468]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, x23
    b.eq     #0x3cf844
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xd90]
    mov      x0, x25
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x19, [x29, #-0xc8]
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, #0
    mov      w1, #0x9500
    movk     w1, #0xaba, lsl #16
    bl       #0x461a2c // _dispatch_time
    adrp     x20, #0x4a0000
    ldr      x20, [x20, #0x748]
    ldur     x2, [x29, #-0x90]
    str      x20, [x2]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    adrp     x8, #0x3cf000
    add      x8, x8, #0x9b8
    str      d8, [x2, #8]
    adrp     x21, #0x4a1000
    add      x21, x21, #0xa00
    stp      x8, x21, [x2, #0x10]
    str      x26, [x2, #0x20]
    adrp     x19, #0x4a0000
    ldr      x19, [x19, #0x770]
    mov      x1, x19
    bl       #0x46196c // _dispatch_after
    mov      x0, #0
    mov      w1, #0x4900
    movk     w1, #0xf7f, lsl #16
    bl       #0x461a2c // _dispatch_time
    ldur     x2, [x29, #-0xb0]
    str      x20, [x2]
    str      d8, [x2, #8]
    adrp     x8, #0x3cf000
    add      x8, x8, #0xa08
    stp      x8, x21, [x2, #0x10]
    str      x26, [x2, #0x20]
    mov      x1, x19
    bl       #0x46196c // _dispatch_after
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x68]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x3cf954
    sub      sp, x29, #0x60
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    ldp      d9, d8, [sp], #0x70
    ret      
    bl       #0x4618b8 // ___stack_chk_fail
    cmp      w1, #1
    b.ne     #0x3cf9b4
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    ldur     x23, [x29, #-0x80]
    ldur     x25, [x29, #-0x70]
    ldur     x22, [x29, #-0xa8]
    b        #0x3cf448
    cmp      w1, #1
    b.ne     #0x3cf9b4
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    ldur     x23, [x29, #-0x80]
    ldur     x25, [x29, #-0x70]
    ldur     x22, [x29, #-0xa8]
    b        #0x3cf3f8
    cmp      w1, #1
    b.ne     #0x3cf9b4
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    ldur     x25, [x29, #-0x70]
    ldur     x22, [x29, #-0xa8]
    b        #0x3cf84c
    bl       #0x461894 // __Unwind_Resume

// -[WCLGSearchTabBarOverlay tabBar] IMP=0x3CFA1C bounds=0x3CFA1C-0x3CFA3C
loc_3CFA1C:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe24]
    add      x0, x0, x8
    bl       #0x461c60 // _objc_loadWeakRetained
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGSearchTabBarOverlay setTabBar:] IMP=0x3CFA3C bounds=0x3CFA3C-0x3CFA50
loc_3CFA3C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe24]
    add      x0, x0, x8
    b        #0x461d08 // _objc_storeWeak

// -[WCLGSearchTabBarOverlay items] IMP=0x3CFA50 bounds=0x3CFA50-0x3CFA60
loc_3CFA50:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe28]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setItems:] IMP=0x3CFA60 bounds=0x3CFA60-0x3CFA6C
loc_3CFA60:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xe28]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGSearchTabBarOverlay searchControl] IMP=0x3CFA6C bounds=0x3CFA6C-0x3CFA7C
loc_3CFA6C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe48]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setSearchControl:] IMP=0x3CFA7C bounds=0x3CFA7C-0x3CFA90
loc_3CFA7C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe48]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGSearchTabBarOverlay searchPanGesture] IMP=0x3CFA90 bounds=0x3CFA90-0x3CFAA0
loc_3CFA90:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe4c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setSearchPanGesture:] IMP=0x3CFAA0 bounds=0x3CFAA0-0x3CFAB4
loc_3CFAA0:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe4c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGSearchTabBarOverlay searchGlass] IMP=0x3CFAB4 bounds=0x3CFAB4-0x3CFAC4
loc_3CFAB4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe50]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setSearchGlass:] IMP=0x3CFAC4 bounds=0x3CFAC4-0x3CFAD8
loc_3CFAC4:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe50]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGSearchTabBarOverlay searchIconView] IMP=0x3CFAD8 bounds=0x3CFAD8-0x3CFAE8
loc_3CFAD8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe54]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setSearchIconView:] IMP=0x3CFAE8 bounds=0x3CFAE8-0x3CFAFC
loc_3CFAE8:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe54]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGSearchTabBarOverlay searchLabel] IMP=0x3CFAFC bounds=0x3CFAFC-0x3CFB0C
loc_3CFAFC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe58]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setSearchLabel:] IMP=0x3CFB0C bounds=0x3CFB0C-0x3CFB20
loc_3CFB0C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe58]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGSearchTabBarOverlay modeButton] IMP=0x3CFB20 bounds=0x3CFB20-0x3CFB30
loc_3CFB20:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe5c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setModeButton:] IMP=0x3CFB30 bounds=0x3CFB30-0x3CFB44
loc_3CFB30:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe5c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGSearchTabBarOverlay modeGlass] IMP=0x3CFB44 bounds=0x3CFB44-0x3CFB54
loc_3CFB44:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe60]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setModeGlass:] IMP=0x3CFB54 bounds=0x3CFB54-0x3CFB68
loc_3CFB54:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe60]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGSearchTabBarOverlay modeIconView] IMP=0x3CFB68 bounds=0x3CFB68-0x3CFB78
loc_3CFB68:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe64]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setModeIconView:] IMP=0x3CFB78 bounds=0x3CFB78-0x3CFB8C
loc_3CFB78:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe64]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGSearchTabBarOverlay modeBadgeDotView] IMP=0x3CFB8C bounds=0x3CFB8C-0x3CFB9C
loc_3CFB8C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe68]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setModeBadgeDotView:] IMP=0x3CFB9C bounds=0x3CFB9C-0x3CFBB0
loc_3CFB9C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe68]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGSearchTabBarOverlay modeBadgeLabel] IMP=0x3CFBB0 bounds=0x3CFBB0-0x3CFBC0
loc_3CFBB0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe6c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setModeBadgeLabel:] IMP=0x3CFBC0 bounds=0x3CFBC0-0x3CFBD4
loc_3CFBC0:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe6c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGSearchTabBarOverlay menuView] IMP=0x3CFBD4 bounds=0x3CFBD4-0x3CFBE4
loc_3CFBD4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe70]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setMenuView:] IMP=0x3CFBE4 bounds=0x3CFBE4-0x3CFBF8
loc_3CFBE4:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe70]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGSearchTabBarOverlay menuGlass] IMP=0x3CFBF8 bounds=0x3CFBF8-0x3CFC08
loc_3CFBF8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe74]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setMenuGlass:] IMP=0x3CFC08 bounds=0x3CFC08-0x3CFC1C
loc_3CFC08:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe74]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGSearchTabBarOverlay menuMaterialView] IMP=0x3CFC1C bounds=0x3CFC1C-0x3CFC2C
loc_3CFC1C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe78]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setMenuMaterialView:] IMP=0x3CFC2C bounds=0x3CFC2C-0x3CFC40
loc_3CFC2C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe78]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGSearchTabBarOverlay optionButtons] IMP=0x3CFC40 bounds=0x3CFC40-0x3CFC50
loc_3CFC40:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe7c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setOptionButtons:] IMP=0x3CFC50 bounds=0x3CFC50-0x3CFC64
loc_3CFC50:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe7c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGSearchTabBarOverlay highlightedIndex] IMP=0x3CFC64 bounds=0x3CFC64-0x3CFC74
loc_3CFC64:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe2c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setHighlightedIndex:] IMP=0x3CFC74 bounds=0x3CFC74-0x3CFC84
loc_3CFC74:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe2c]
    str      x2, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay menuVisible] IMP=0x3CFC84 bounds=0x3CFC84-0x3CFC94
loc_3CFC84:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe40]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setMenuVisible:] IMP=0x3CFC94 bounds=0x3CFC94-0x3CFCA4
loc_3CFC94:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe40]
    strb     w2, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay selectingIndex] IMP=0x3CFCA4 bounds=0x3CFCA4-0x3CFCB4
loc_3CFCA4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe80]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setSelectingIndex:] IMP=0x3CFCB4 bounds=0x3CFCB4-0x3CFCC4
loc_3CFCB4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe80]
    strb     w2, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay menuTouchActive] IMP=0x3CFCC4 bounds=0x3CFCC4-0x3CFCD4
loc_3CFCC4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe84]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setMenuTouchActive:] IMP=0x3CFCD4 bounds=0x3CFCD4-0x3CFCE4
loc_3CFCD4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe84]
    strb     w2, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay modePanActive] IMP=0x3CFCE4 bounds=0x3CFCE4-0x3CFCF4
loc_3CFCE4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe88]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setModePanActive:] IMP=0x3CFCF4 bounds=0x3CFCF4-0x3CFD04
loc_3CFCF4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe88]
    strb     w2, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay searchPanActive] IMP=0x3CFD04 bounds=0x3CFD04-0x3CFD14
loc_3CFD04:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe8c]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setSearchPanActive:] IMP=0x3CFD14 bounds=0x3CFD14-0x3CFD24
loc_3CFD14:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe8c]
    strb     w2, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay menuAnchoredToSearch] IMP=0x3CFD24 bounds=0x3CFD24-0x3CFD34
loc_3CFD24:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe90]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setMenuAnchoredToSearch:] IMP=0x3CFD34 bounds=0x3CFD34-0x3CFD44
loc_3CFD34:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe90]
    strb     w2, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay lastFeedbackHighlightedIndex] IMP=0x3CFD44 bounds=0x3CFD44-0x3CFD54
loc_3CFD44:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe30]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setLastFeedbackHighlightedIndex:] IMP=0x3CFD54 bounds=0x3CFD54-0x3CFD64
loc_3CFD54:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe30]
    str      x2, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay overlayDisplayed] IMP=0x3CFD64 bounds=0x3CFD64-0x3CFD74
loc_3CFD64:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe44]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setOverlayDisplayed:] IMP=0x3CFD74 bounds=0x3CFD74-0x3CFD84
loc_3CFD74:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe44]
    strb     w2, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay overlayInteractionsEnabled] IMP=0x3CFD84 bounds=0x3CFD84-0x3CFD94
loc_3CFD84:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe34]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setOverlayInteractionsEnabled:] IMP=0x3CFD94 bounds=0x3CFD94-0x3CFDA4
loc_3CFD94:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe34]
    strb     w2, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay hasStableTabFrame] IMP=0x3CFDA4 bounds=0x3CFDA4-0x3CFDB4
loc_3CFDA4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe38]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay setHasStableTabFrame:] IMP=0x3CFDB4 bounds=0x3CFDB4-0x3CFDC4
loc_3CFDB4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe38]
    strb     w2, [x0, x8]
    ret      

// -[WCLGSearchTabBarOverlay stableTabFrame] IMP=0x3CFDC4 bounds=0x3CFDC4-0x3CFDDC
loc_3CFDC4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe3c]
    add      x8, x0, x8
    ldp      d0, d1, [x8]
    ldp      d2, d3, [x8, #0x10]
    ret      

// -[WCLGSearchTabBarOverlay setStableTabFrame:] IMP=0x3CFDDC bounds=0x3CFDDC-0x3CFDF4
loc_3CFDDC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe3c]
    add      x8, x0, x8
    stp      d0, d1, [x8]
    stp      d2, d3, [x8, #0x10]
    ret      

// -[WCLGSearchTabBarOverlay .cxx_destruct] IMP=0x3CFDF4 bounds=0x3CFDF4-0x3CFF48
loc_3CFDF4:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe7c]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe78]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe74]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe70]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe6c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe68]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe64]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe60]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe5c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe58]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe54]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe50]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe4c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe48]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe28]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe24]
    add      x0, x19, x8
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c0c // _objc_destroyWeak
