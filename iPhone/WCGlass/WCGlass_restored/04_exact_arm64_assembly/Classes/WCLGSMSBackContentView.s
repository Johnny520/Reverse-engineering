// Exact ARM64 listing for WCLGSMSBackContentView

// -[WCLGSMSBackContentView initWithFrame:] IMP=0x645E4 bounds=0x645E4-0x649DC
loc_645E4:
    sub      sp, sp, #0x80
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x6f0]
    stp      x0, x8, [sp, #0x10]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xb38]
    mov      x19, #0
    add      x0, sp, #0x10
    mov      x1, x21
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x23, x0
    cbz      x0, #0x64968
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    mov      x19, x23
    str      x1, [sp]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x0, x23
    str      x1, [sp, #8]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x440]
    mov      x19, x23
    mov      x0, x23
    mov      x1, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x438]
    mov      x19, x23
    mov      x0, x23
    mov      x1, x25
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    mov      x19, x23
    bl       #0x461ba0 // _objc_alloc
    adrp     x22, #0x4a0000
    ldr      x22, [x22, #0x608]
    ldp      d0, d1, [x22]
    ldp      d2, d3, [x22, #0x10]
    mov      x19, x23
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x24, [x8, #0x858]
    ldr      x8, [x23, x24]
    str      x0, [x23, x24]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, x24]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x430]
    mov      x19, x23
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x23, x24]
    mov      x19, x23
    mov      x1, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x23, x24]
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0xb40]
    mov      x19, x23
    mov      x0, x23
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    mov      x19, x23
    bl       #0x461ba0 // _objc_alloc
    ldp      d0, d1, [x22]
    ldp      d2, d3, [x22, #0x10]
    mov      x19, x23
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x28, [x8, #0x85c]
    ldr      x8, [x23, x28]
    str      x0, [x23, x28]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4bf000
    ldr      x26, [x8, #0x130]
    adrp     x2, #0x4a0000
    add      x2, x2, #0xfd8
    mov      x19, x23
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    ldr      x0, [x23, x28]
    ldr      x1, [sp, #8]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, x28]
    mov      x19, x23
    mov      x1, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x23, x28]
    mov      x19, x23
    mov      x1, x25
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x23, x28]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    mov      x19, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x628]
    ldr      x2, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb50]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldr      x2, [x23, x28]
    mov      x19, x23
    mov      x0, x23
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    mov      x19, x23
    bl       #0x461ba0 // _objc_alloc
    ldp      d0, d1, [x22]
    ldp      d2, d3, [x22, #0x10]
    mov      x19, x23
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x22, [x8, #0x860]
    ldr      x8, [x23, x22]
    str      x0, [x23, x22]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    mov      x19, x23
    ldr      x1, [sp]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x0, [x23, x22]
    ldr      x1, [sp, #8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x2, #0x4a0000
    add      x2, x2, #0xff8
    mov      x19, x23
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x0, [x23, x22]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, x22]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1f8]
    mov      x19, x23
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x23, x22]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x200]
    mov      x19, x23
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x23, x22]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x208]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x430]
    mov      x19, x23
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x23, x22]
    mov      x19, x23
    mov      x1, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x23, x28]
    ldr      x2, [x23, x22]
    mov      x19, x23
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    add      sp, sp, #0x80
    ret      
    b        #0x64990
    mov      x20, x0
    mov      x0, x21
    b        #0x649bc
    mov      x20, x0
    mov      x0, x25
    b        #0x649bc
    mov      x20, x0
    mov      x0, x27
    b        #0x649bc
    mov      x20, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    b        #0x649cc
    mov      x20, x0
    mov      x23, x19
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461894 // __Unwind_Resume

// -[WCLGSMSBackContentView updateChevron:count:] IMP=0x64B14 bounds=0x64B14-0x64C70
loc_64B14:
    stp      x24, x23, [sp, #-0x40]!
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
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x210]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a6000
    add      x8, x8, #0xd8
    cmp      x20, #0
    csel     x2, x8, x20, eq
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x218]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x220]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x228]
    mov      x0, x21
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
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4b0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461c9c // _objc_release
    mov      x21, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    b        #0x64c48
    b        #0x64c44
    mov      x21, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    b        #0x64c58
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461894 // __Unwind_Resume

// -[WCLGSMSBackContentView layoutSubviews] IMP=0x64C70 bounds=0x64C70-0x65268
loc_64C70:
    sub      sp, sp, #0xb0
    stp      d13, d12, [sp, #0x30]
    stp      d11, d10, [sp, #0x40]
    stp      d9, d8, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      x20, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    str      x8, [sp, #0x28]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x6f0]
    stp      x0, x8, [sp, #8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
    add      x0, sp, #8
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x4d8]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    fmov     d9, d0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616b4 // _CGRectGetHeight
    mov      x8, #0x404f000000000000
    fmov     d1, x8
    fcmp     d0, d1
    mov      x8, #0x4041000000000000
    fmov     d1, x8
    fccmp    d0, d1, #8, le
    mov      x8, #0x4046000000000000
    fmov     d1, x8
    fcsel    d8, d1, d0, mi
    fmov     d0, #1.00000000
    fcmp     d9, d0
    fcsel    d9, d8, d9, mi
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x220]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x558]
    fmul     d0, d8, d0
    fmov     d1, #24.00000000
    fcmp     d0, d1
    fcsel    d0, d1, d0, mi
    fmov     d1, #30.00000000
    fminnm   d0, d0, d1
    bl       #0x65268
    fmov     d10, d0
    adrp     x8, #0x582000
    add      x8, x8, #0xfe0
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x380]
    ldr      x8, [x8]
    adrp     x10, #0x4a0000
    ldr      x10, [x10, #0x388]
    cmp      x8, #1
    csel     x8, x9, x10, eq
    ldr      d1, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x378]
    fmul     d0, d8, d0
    fmov     d2, #15.00000000
    fcmp     d0, d2
    fcsel    d0, d2, d0, mi
    fmov     d2, #17.00000000
    fminnm   d0, d0, d2
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cbz      x22, #0x64e70
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x308]
    ldr      x8, [x8]
    stp      x8, x19, [sp, #0x18]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    add      x2, sp, #0x20
    add      x3, sp, #0x18
    mov      w4, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x238]
    mov      x0, x23
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    frintp   d12, d0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    b        #0x64e74
    fmov     d12, xzr
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x560]
    fmul     d0, d8, d0
    fmov     d1, #0.50000000
    fmul     d1, d9, d1
    cmp      x22, #0
    fcsel    d11, d1, d0, eq
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x210]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xaa0]
    fmov     d0, xzr
    fmov     d1, xzr
    fmov     d2, d10
    fmov     d3, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    fmov     d0, d11
    bl       #0x65268
    fmov     d10, d0
    fmov     d0, xzr
    fmov     d1, xzr
    fmov     d2, d9
    fmov     d3, d8
    bl       #0x4616e4 // _CGRectGetMidY
    bl       #0x65268
    fmov     d11, d0
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xe0]
    fmov     d0, d10
    fmov     d1, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x240]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    cmp      x22, #0
    cset     w2, eq
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    cmp      x22, #0
    fmov     d0, #1.00000000
    fmov     d1, xzr
    fcsel    d0, d1, d0, eq
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9c8]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    cbz      x22, #0x65180
    fmov     d0, #0.50000000
    fmul     d0, d8, d0
    fmov     d1, #20.00000000
    fcmp     d0, d1
    fcsel    d0, d1, d0, mi
    fmov     d1, #23.00000000
    fminnm   d0, d0, d1
    bl       #0x65268
    fmov     d10, d0
    adrp     x8, #0x4bf000
    ldr      x22, [x8, #0x228]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    fmov     d0, #15.00000000
    fadd     d0, d12, d0
    mov      x8, #0x4040000000000000
    fmov     d1, x8
    fcmp     d0, d1
    fcsel    d0, d1, d0, mi
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x568]
    fmadd    d2, d8, d2, d9
    fmaxnm   d1, d2, d1
    fcmp     d0, d1
    fcsel    d0, d0, d1, mi
    bl       #0x65268
    fmov     d11, d0
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x4b8]
    fmul     d0, d8, d0
    fmov     d1, #12.00000000
    fmaxnm   d0, d0, d1
    bl       #0x65268
    fsub     d0, d9, d0
    fsub     d0, d0, d11
    bl       #0x65268
    fmov     d9, d0
    fsub     d0, d8, d10
    fmov     d1, #0.50000000
    fmul     d0, d0, d1
    bl       #0x65268
    fmov     d8, d0
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x678]
    mov      x1, x24
    fmov     d0, d9
    fmov     d1, d8
    fmov     d2, d11
    fmov     d3, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    fmov     d0, #0.50000000
    fmul     d0, d10, d0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x24
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x28]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x651c8
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      d9, d8, [sp, #0x50]
    ldp      d11, d10, [sp, #0x40]
    ldp      d13, d12, [sp, #0x30]
    add      sp, sp, #0xb0
    ret      
    bl       #0x4618b8 // ___stack_chk_fail
    mov      x20, x0
    mov      x0, x21
    b        #0x65210
    mov      x20, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    b        #0x651f0
    b        #0x651ec
    mov      x20, x0
    mov      x0, x25
    b        #0x65244
    b        #0x65254
    b        #0x65254
    b        #0x65254
    b        #0x6522c
    mov      x20, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    b        #0x65240
    b        #0x6523c
    b        #0x65254
    b        #0x6522c
    b        #0x6522c
    b        #0x6523c
    mov      x20, x0
    mov      x0, x24
    b        #0x65244
    b        #0x65254
    mov      x20, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    b        #0x65258
    b        #0x65254
    b        #0x65254
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461894 // __Unwind_Resume

// -[WCLGSMSBackContentView chevronView] IMP=0x652F0 bounds=0x652F0-0x65300
loc_652F0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x858]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSMSBackContentView setChevronView:] IMP=0x65300 bounds=0x65300-0x65314
loc_65300:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x858]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGSMSBackContentView badgeView] IMP=0x65314 bounds=0x65314-0x65324
loc_65314:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x85c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSMSBackContentView setBadgeView:] IMP=0x65324 bounds=0x65324-0x65338
loc_65324:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x85c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGSMSBackContentView countLabel] IMP=0x65338 bounds=0x65338-0x65348
loc_65338:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x860]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSMSBackContentView setCountLabel:] IMP=0x65348 bounds=0x65348-0x6535C
loc_65348:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x860]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGSMSBackContentView countText] IMP=0x6535C bounds=0x6535C-0x6536C
loc_6535C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x864]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGSMSBackContentView setCountText:] IMP=0x6536C bounds=0x6536C-0x65378
loc_6536C:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0x864]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGSMSBackContentView .cxx_destruct] IMP=0x65378 bounds=0x65378-0x653E0
loc_65378:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x864]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x860]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x85c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x858]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
