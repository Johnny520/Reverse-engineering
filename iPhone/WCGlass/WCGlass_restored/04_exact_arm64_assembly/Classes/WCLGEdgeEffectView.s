// Exact ARM64 listing for WCLGEdgeEffectView

// -[WCLGEdgeEffectView initWithFrame:] IMP=0x29B1D4 bounds=0x29B1D4-0x29B548
loc_29B1D4:
    adrp     x8, #0x580000
    add      x8, x8, #0xc
    ldar     w9, [x8]
    cbnz     w9, #0x29b310
    adrp     x9, #0x530000
    add      x9, x9, #0x930
    ldrb     w10, [x9]
    mov      w11, #0x73
    eor      w11, w10, w11
    adrp     x10, #0x530000
    add      x10, x10, #0x950
    strb     w11, [x10]
    ldrb     w11, [x9, #1]
    mov      w12, #0x1d
    eor      w11, w11, w12
    strb     w11, [x10, #1]
    ldrb     w11, [x9, #2]
    mov      w12, #0xc4
    eor      w11, w11, w12
    strb     w11, [x10, #2]
    ldrb     w11, [x9, #3]
    eor      w11, w11, w12
    strb     w11, [x10, #3]
    ldrb     w11, [x9, #4]
    mov      w12, #0x28
    eor      w11, w11, w12
    strb     w11, [x10, #4]
    ldrb     w11, [x9, #5]
    mov      w12, #0xea
    eor      w11, w11, w12
    strb     w11, [x10, #5]
    ldrb     w11, [x9, #6]
    mov      w12, #0x96
    eor      w11, w11, w12
    strb     w11, [x10, #6]
    ldrb     w11, [x9, #7]
    mov      w12, #0x2c
    eor      w11, w11, w12
    strb     w11, [x10, #7]
    ldrb     w11, [x9, #8]
    mov      w12, #0x72
    eor      w11, w11, w12
    strb     w11, [x10, #8]
    ldrb     w11, [x9, #9]
    mov      w12, #0x56
    eor      w11, w11, w12
    strb     w11, [x10, #9]
    ldrb     w11, [x9, #0xa]
    eor      w11, w11, #0xfc
    strb     w11, [x10, #0xa]
    ldrb     w11, [x9, #0xb]
    eor      w11, w11, #0x77777777
    strb     w11, [x10, #0xb]
    ldrb     w11, [x9, #0xc]
    eor      w11, w11, #0x70
    strb     w11, [x10, #0xc]
    ldrb     w11, [x9, #0xd]
    mov      w12, #0x75
    eor      w11, w11, w12
    strb     w11, [x10, #0xd]
    ldrb     w11, [x9, #0xe]
    mov      w12, #0xd5
    eor      w11, w11, w12
    strb     w11, [x10, #0xe]
    ldrb     w11, [x9, #0xf]
    mov      w12, #0x92
    eor      w11, w11, w12
    strb     w11, [x10, #0xf]
    ldrb     w11, [x9, #0x10]
    mov      w12, #0x8c
    eor      w11, w11, w12
    strb     w11, [x10, #0x10]
    ldrb     w11, [x9, #0x11]
    mvn      w11, w11
    strb     w11, [x10, #0x11]
    ldrb     w9, [x9, #0x12]
    mov      w11, #0xed
    eor      w9, w9, w11
    strb     w9, [x10, #0x12]
    stp      d11, d10, [sp, #-0x50]!
    stp      d9, d8, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      w22, #1
    stlr     w22, [x8]
    mov      x9, sp
    sub      x8, x9, #0x10
    mov      sp, x8
    adrp     x10, #0x4c4000
    ldr      x10, [x10, #0x790]
    stp      x0, x10, [x9, #-0x10]
    adrp     x9, #0x4be000
    ldr      x20, [x9, #0xb38]
    mov      x0, x8
    mov      x1, x20
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x19, x0
    cbz      x0, #0x29b528
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x690]
    mov      x0, x19
    mov      w2, #0
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
    ldr      x1, [x8, #0x460]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x808]
    adrp     x2, #0x530000
    add      x2, x2, #0x990
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x7aa9c
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xba8]
    strb     w22, [x19, x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x4d8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x608]
    ldp      d8, d9, [x8]
    ldp      d10, d11, [x8, #0x10]
    mov      x1, x20
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x21, [x8, #0xbac]
    ldr      x8, [x19, x21]
    str      x0, [x19, x21]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x2, [x19, x21]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xb40]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x20
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x22, [x8, #0xbb0]
    ldr      x8, [x19, x22]
    str      x0, [x19, x22]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x20
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x20, [x8, #0xbb4]
    ldr      x8, [x19, x20]
    str      x0, [x19, x20]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x2, [x19, x20]
    ldr      x0, [x19, x22]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x18]
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x22]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    sub      sp, x29, #0x40
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      d9, d8, [sp, #0x10]
    ldp      d11, d10, [sp], #0x50
    ret      

// -[WCLGEdgeEffectView updateWithContentColor:blur:alpha:rect:edge:edgeSize:blurRadius:] IMP=0x29B548 bounds=0x29B548-0x29C588
loc_29B548:
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
    sub      sp, sp, #0x30
    mov      x21, x4
    mov      x22, x3
    fmov     d10, d6
    fmov     d14, d5
    fmov     d8, d4
    fmov     d9, d3
    fmov     d12, d2
    fmov     d13, d1
    fmov     d11, d0
    mov      x19, x2
    mov      x25, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x98]
    adrp     x8, #0x580000
    add      x8, x8, #0x10
    ldar     w9, [x8]
    cbnz     w9, #0x29b898
    adrp     x11, #0x530000
    add      x11, x11, #0xa02
    ldrb     w9, [x11]
    eor      w9, w9, #0xffffffdf
    adrp     x12, #0x530000
    add      x12, x12, #0xa0e
    strb     w9, [x12]
    ldrb     w9, [x11, #1]
    mov      w10, #0xbe
    eor      w9, w9, w10
    strb     w9, [x12, #1]
    ldrb     w10, [x11, #2]
    mov      w9, #0x58
    eor      w10, w10, w9
    strb     w10, [x12, #2]
    ldrb     w10, [x11, #3]
    mov      w13, #0x17
    eor      w10, w10, w13
    strb     w10, [x12, #3]
    ldrb     w10, [x11, #4]
    mov      w13, #0xca
    eor      w10, w10, w13
    strb     w10, [x12, #4]
    ldrb     w10, [x11, #5]
    mov      w13, #0xa4
    eor      w10, w10, w13
    strb     w10, [x12, #5]
    ldrb     w10, [x11, #6]
    eor      w10, w10, #0xffffff83
    strb     w10, [x12, #6]
    ldrb     w10, [x11, #7]
    mov      w13, #0x27
    eor      w10, w10, w13
    strb     w10, [x12, #7]
    ldrb     w10, [x11, #8]
    mov      w13, #0x9b
    eor      w10, w10, w13
    strb     w10, [x12, #8]
    ldrb     w10, [x11, #9]
    mov      w13, #0x26
    eor      w10, w10, w13
    strb     w10, [x12, #9]
    ldrb     w13, [x11, #0xa]
    mov      w10, #0xb2
    eor      w13, w13, w10
    strb     w13, [x12, #0xa]
    ldrb     w11, [x11, #0xb]
    mov      w13, #0xf5
    eor      w11, w11, w13
    strb     w11, [x12, #0xb]
    adrp     x11, #0x530000
    add      x11, x11, #0x9e4
    ldrb     w12, [x11]
    adrp     x13, #0x530000
    add      x13, x13, #0x9f3
    eor      w12, w12, #0xfffffff3
    strb     w12, [x13]
    ldrb     w12, [x11, #1]
    mov      w14, #0xa2
    eor      w12, w12, w14
    strb     w12, [x13, #1]
    ldrb     w12, [x11, #2]
    eor      w12, w12, #4
    strb     w12, [x13, #2]
    ldrb     w12, [x11, #3]
    mov      w14, #0xde
    eor      w12, w12, w14
    strb     w12, [x13, #3]
    ldrb     w12, [x11, #4]
    eor      w12, w12, #0x7c
    strb     w12, [x13, #4]
    ldrb     w12, [x11, #5]
    mov      w14, #0x16
    eor      w12, w12, w14
    strb     w12, [x13, #5]
    ldrb     w12, [x11, #6]
    mov      w14, #0x85
    eor      w12, w12, w14
    strb     w12, [x13, #6]
    ldrb     w12, [x11, #7]
    mov      w14, #0x2b
    eor      w12, w12, w14
    strb     w12, [x13, #7]
    ldrb     w12, [x11, #8]
    mov      w14, #0x21
    eor      w12, w12, w14
    strb     w12, [x13, #8]
    ldrb     w12, [x11, #9]
    eor      w12, w12, #0xffffffcf
    strb     w12, [x13, #9]
    ldrb     w12, [x11, #0xa]
    eor      w12, w12, #2
    strb     w12, [x13, #0xa]
    ldrb     w12, [x11, #0xb]
    eor      w12, w12, #0x1e
    strb     w12, [x13, #0xb]
    ldrb     w12, [x11, #0xc]
    eor      w12, w12, #0x3f
    strb     w12, [x13, #0xc]
    ldrb     w12, [x11, #0xd]
    mov      w14, #0x4c
    eor      w12, w12, w14
    strb     w12, [x13, #0xd]
    ldrb     w11, [x11, #0xe]
    strb     w11, [x13, #0xe]
    adrp     x11, #0x530000
    add      x11, x11, #0x9b0
    ldrb     w12, [x11]
    eor      w13, w12, #0xffffffe3
    adrp     x12, #0x530000
    add      x12, x12, #0x9d0
    strb     w13, [x12]
    ldrb     w13, [x11, #1]
    mov      w14, #0x6f
    eor      w13, w13, w14
    strb     w13, [x12, #1]
    ldrb     w13, [x11, #2]
    mov      w14, #0xb
    eor      w13, w13, w14
    strb     w13, [x12, #2]
    ldrb     w13, [x11, #3]
    eor      w13, w13, #0x30
    strb     w13, [x12, #3]
    ldrb     w13, [x11, #4]
    mov      w14, #0x50
    eor      w13, w13, w14
    strb     w13, [x12, #4]
    ldrb     w13, [x11, #5]
    mov      w14, #0xd0
    eor      w13, w13, w14
    strb     w13, [x12, #5]
    ldrb     w13, [x11, #6]
    mov      w14, #0x31
    eor      w13, w13, w14
    strb     w13, [x12, #6]
    ldrb     w13, [x11, #7]
    eor      w9, w13, w9
    strb     w9, [x12, #7]
    ldrb     w9, [x11, #8]
    eor      w9, w9, #0x22222222
    strb     w9, [x12, #8]
    ldrb     w9, [x11, #9]
    mov      w13, #0x1b
    eor      w9, w9, w13
    strb     w9, [x12, #9]
    ldrb     w9, [x11, #0xa]
    eor      w9, w9, w14
    strb     w9, [x12, #0xa]
    ldrb     w9, [x11, #0xb]
    mov      w13, #0x61
    eor      w9, w9, w13
    strb     w9, [x12, #0xb]
    ldrb     w9, [x11, #0xc]
    mov      w13, #0xd5
    eor      w9, w9, w13
    strb     w9, [x12, #0xc]
    ldrb     w9, [x11, #0xd]
    eor      w9, w9, w10
    strb     w9, [x12, #0xd]
    ldrb     w9, [x11, #0xe]
    mov      w10, #0x82
    eor      w9, w9, w10
    strb     w9, [x12, #0xe]
    ldrb     w9, [x11, #0xf]
    mov      w10, #0xe2
    eor      w9, w9, w10
    strb     w9, [x12, #0xf]
    ldrb     w9, [x11, #0x10]
    mov      w10, #0xb4
    eor      w9, w9, w10
    strb     w9, [x12, #0x10]
    ldrb     w9, [x11, #0x11]
    mov      w10, #0x8e
    eor      w9, w9, w10
    strb     w9, [x12, #0x11]
    ldrb     w9, [x11, #0x12]
    eor      w9, w9, #0x70
    strb     w9, [x12, #0x12]
    ldrb     w9, [x11, #0x13]
    eor      w9, w9, #6
    strb     w9, [x12, #0x13]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x26, sp, #0x10
    mov      sp, x26
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    cbz      x19, #0x29b8c4
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x27, x19
    b        #0x29b8e4
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x458]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    fmov     d0, xzr
    fmaxnm   d1, d11, d0
    fmov     d15, #1.00000000
    fcmp     d1, d15
    fcsel    d11, d15, d1, gt
    fmaxnm   d10, d10, d0
    stur     x19, [x29, #-0xa8]
    cbz      w22, #0x29b928
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x20]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3d8]
    fcmp     d10, d0
    ccmp     w0, #0, #4, gt
    b.ne     #0x29b934
    mov      w19, #0
    mov      w20, #0
    b        #0x29b950
    adrp     x8, #0x57f000
    ldr      x8, [x8, #0xfb0]
    cmn      x8, #1
    b.ne     #0x29c57c
    adrp     x8, #0x57f000
    ldrb     w20, [x8, #0xfb8]
    mov      w19, #1
    fmaxnm   d14, d14, d15
    adrp     x8, #0x4c1000
    ldr      x23, [x8, #0x28]
    mov      x0, x25
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cbz      x0, #0x29ba88
    mov      x22, x0
    mov      x0, x25
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x910]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x29ba78
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x30]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    eor      w8, w20, w0
    tbnz     w8, #0, #0x29ba78
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x38]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    fabd     d0, d0, d11
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3a0]
    fcmp     d0, d1
    b.pl     #0x29ba78
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x40]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, d13
    fmov     d5, d12
    fmov     d6, d9
    fmov     d7, d8
    bl       #0x4616a8 // _CGRectEqualToRect
    cbz      w0, #0x29ba78
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x48]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, x21
    b.ne     #0x29ba78
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x50]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    fabd     d0, d0, d14
    fmov     d1, #0.50000000
    fcmp     d0, d1
    b.pl     #0x29ba78
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x58]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    fabd     d15, d0, d10
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x370]
    fcmp     d15, d0
    b.pl     #0x29ba88
    b        #0x29c524
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    stur     w19, [x29, #-0xb0]
    stur     x26, [x29, #-0xb8]
    cmp      x21, #1
    cset     w22, eq
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x60]
    mov      x0, x25
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x68]
    and      w2, w20, #1
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x70]
    mov      x0, x25
    fmov     d0, d11
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x78]
    mov      x0, x25
    fmov     d0, d13
    fmov     d1, d12
    fmov     d2, d9
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x80]
    mov      x0, x25
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x88]
    mov      x0, x25
    fmov     d0, d14
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x90]
    mov      x0, x25
    fmov     d0, d10
    bl       #0x461c6c // _objc_msgSend
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
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0xaf0]
    mov      x0, x25
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x19, [x8, #0x678]
    fmov     d0, xzr
    fmov     d1, xzr
    mov      x1, x19
    fmov     d2, d9
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x28, [x8, #0x98]
    mov      x0, x25
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    fmov     d0, xzr
    fmov     d1, xzr
    mov      x24, x19
    mov      x1, x19
    fmov     d2, d9
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    stur     x27, [x29, #-0xa0]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x9c8]
    mov      x1, x27
    fmov     d0, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    fmov     d0, d14
    mov      x0, x22
    bl       #0x29af14
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    cbz      x0, #0x29bcc4
    mov      x0, x25
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb98]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x680]
    bl       #0x461c6c // _objc_msgSend
    fabd     d12, d1, d14
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    fmov     d0, #0.50000000
    fcmp     d12, d0
    b.le     #0x29bcf4
    mov      x0, x25
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    tbz      w20, #0, #0x29bec0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xa0]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x9b0]
    mov      x1, x23
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x19, [x8, #0xa8]
    mov      x0, x25
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x23
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    fmov     d0, xzr
    fmov     d1, xzr
    mov      x1, x24
    fmov     d2, d9
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c1000
    ldr      x26, [x8, #0x10]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461c9c // _objc_release
    ldur     x27, [x29, #-0xa0]
    cbz      x19, #0x29c468
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc8]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    fcmp     d0, d9
    cset     w8, ne
    fcmp     d1, d8
    csinc    w19, w8, wzr, eq
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd0]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    fabd     d0, d0, d8
    fmov     d11, #0.50000000
    fcmp     d0, d11
    b.gt     #0x29c0c8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd8]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    fabd     d0, d0, d8
    fcmp     d0, d11
    b.gt     #0x29c0c8
    cmp      x21, #1
    cset     w20, eq
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe0]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    eor      w8, w20, w0
    orr      w8, w19, w8
    tbnz     w8, #0, #0x29c0c8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe8]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461c9c // _objc_release
    cbz      x19, #0x29c0c8
    mov      x0, x25
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    fmov     d0, xzr
    fmov     d1, xzr
    mov      x1, x24
    fmov     d2, d9
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    b        #0x29c468
    adrp     x8, #0x4c1000
    ldr      x19, [x8, #0xa8]
    mov      x0, x25
    mov      x1, x19
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
    mov      x0, x25
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x10]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb0]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xa0]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldur     w8, [x29, #-0xb0]
    cbz      w8, #0x29c3fc
    cbnz     x21, #0x29c030
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x148]
    bl       #0x461ba0 // _objc_alloc
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x180]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc30]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbb8]
    mov      x0, x19
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x7aa9c
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb8]
    mov      x0, x25
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb58]
    mov      x0, x25
    mov      x2, x21
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x23
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, xzr
    fmov     d1, xzr
    mov      x0, x21
    mov      x1, x24
    fmov     d2, d9
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      x1, x27
    fmov     d0, d11
    bl       #0x461c6c // _objc_msgSend
    ldur     x27, [x29, #-0xa0]
    cbz      x22, #0x29c500
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x19, #0x4c4000
    ldr      x0, [x19, #0x88]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x29c478
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x4d8]
    b        #0x29c4cc
    cmp      x21, #1
    cset     w0, eq
    fmov     d0, #1.00000000
    fmaxnm   d0, d8, d0
    bl       #0x29af14
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    bl       #0x461ca8 // _objc_retain
    mov      x28, #0
    cbz      x0, #0x29c1f0
    fcmp     d9, #0.0
    b.ls     #0x29c1f0
    fcmp     d8, #0.0
    b.ls     #0x29c1f0
    fmov     d2, xzr
    fmov     d0, d9
    fmov     d1, d8
    mov      w0, #0
    bl       #0x461810 // _UIGraphicsBeginImageContextWithOptions
    bl       #0x461828 // _UIGraphicsGetCurrentContext
    mov      x28, x0
    cbz      x0, #0x29c1ec
    fmov     d13, xzr
    fmov     d0, xzr
    fmov     d1, xzr
    mov      x0, x28
    fmov     d2, d9
    fmov     d3, d8
    bl       #0x4615b8 // _CGContextClearRect
    fsub     d0, d8, d8
    cmp      x21, #1
    fmaxnm   d1, d0, d13
    fcsel    d11, d13, d8, ne
    fcsel    d12, d1, d1, ne
    fcsel    d13, d0, d13, ne
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x450]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac0]
    bl       #0x461c6c // _objc_msgSend
    mov      x1, x0
    mov      x0, x28
    bl       #0x461630 // _CGContextSetFillColorWithColor
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fmov     d0, xzr
    mov      x0, x28
    fmov     d1, d11
    fmov     d2, d9
    fmov     d3, d12
    bl       #0x4615f4 // _CGContextFillRect
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x118]
    fmov     d0, xzr
    fmov     d4, #1.00000000
    mov      x0, x27
    fmov     d1, d13
    fmov     d2, d9
    fmov     d3, d8
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461834 // _UIGraphicsGetImageFromCurrentImageContext
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    bl       #0x46181c // _UIGraphicsEndImageContext
    cmp      x21, #1
    cset     w19, eq
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf0]
    mov      x0, x25
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf8]
    mov      x0, x25
    fmov     d0, d9
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x100]
    mov      x0, x25
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x108]
    mov      x0, x25
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x110]
    mov      x0, x25
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    bl       #0x29ac28
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    cbz      x0, #0x29c41c
    mov      x0, x28
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xef8]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x29c41c
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3d8]
    fcmp     d10, d0
    fmov     d0, #1.00000000
    fcsel    d0, d10, d0, gt
    adrp     x20, #0x4c4000
    ldr      x0, [x20, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x498]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4bf000
    stur     x24, [x29, #-0xb0]
    mov      x24, x26
    ldr      x26, [x8, #0x2b8]
    adrp     x3, #0x530000
    add      x3, x3, #0xac0
    mov      x0, x21
    mov      x1, x26
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x3, #0x530000
    add      x3, x3, #0xa80
    mov      x0, x21
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x20, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x3, #0x530000
    add      x3, x3, #0xa40
    mov      x0, x21
    mov      x1, x26
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x2, [x29, #-0xb8]
    str      x21, [x2]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x25
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    fmov     d0, xzr
    fmov     d1, xzr
    ldur     x1, [x29, #-0xb0]
    fmov     d2, d9
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    b        #0x29c444
    mov      x0, x21
    mov      x1, x23
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldur     x27, [x29, #-0xa0]
    b        #0x29c508
    mov      x0, x25
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb0]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    ldur     x27, [x29, #-0xa0]
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    b        #0x29c504
    ldr      x0, [x19, #0x88]
    bl       #0x461ba0 // _objc_alloc
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x4d8]
    mov      x0, x21
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x18]
    mov      x0, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x19
    mov      x0, x21
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    mov      x0, x23
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x328]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa8]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x98]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x29c584
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
    bl       #0x46026c
    b        #0x29b944
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGEdgeEffectView isBlurEnabled] IMP=0x29C588 bounds=0x29C588-0x29C598
loc_29C588:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xba8]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGEdgeEffectView setBlurEnabled:] IMP=0x29C598 bounds=0x29C598-0x29C5A8
loc_29C598:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xba8]
    strb     w2, [x0, x8]
    ret      

// -[WCLGEdgeEffectView contentView] IMP=0x29C5A8 bounds=0x29C5A8-0x29C5B8
loc_29C5A8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbb0]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGEdgeEffectView setContentView:] IMP=0x29C5B8 bounds=0x29C5B8-0x29C5CC
loc_29C5B8:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbb0]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGEdgeEffectView contentMaskView] IMP=0x29C5CC bounds=0x29C5CC-0x29C5DC
loc_29C5CC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbb4]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGEdgeEffectView setContentMaskView:] IMP=0x29C5DC bounds=0x29C5DC-0x29C5F0
loc_29C5DC:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbb4]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGEdgeEffectView blurHostView] IMP=0x29C5F0 bounds=0x29C5F0-0x29C600
loc_29C5F0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbac]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGEdgeEffectView setBlurHostView:] IMP=0x29C600 bounds=0x29C600-0x29C614
loc_29C600:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbac]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGEdgeEffectView fallbackBlurView] IMP=0x29C614 bounds=0x29C614-0x29C624
loc_29C614:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbb8]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGEdgeEffectView setFallbackBlurView:] IMP=0x29C624 bounds=0x29C624-0x29C638
loc_29C624:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbb8]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGEdgeEffectView lastContentColor] IMP=0x29C638 bounds=0x29C638-0x29C648
loc_29C638:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbbc]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGEdgeEffectView setLastContentColor:] IMP=0x29C648 bounds=0x29C648-0x29C65C
loc_29C648:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbbc]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGEdgeEffectView lastBlur] IMP=0x29C65C bounds=0x29C65C-0x29C66C
loc_29C65C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbc0]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGEdgeEffectView setLastBlur:] IMP=0x29C66C bounds=0x29C66C-0x29C67C
loc_29C66C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbc0]
    strb     w2, [x0, x8]
    ret      

// -[WCLGEdgeEffectView lastAlpha] IMP=0x29C67C bounds=0x29C67C-0x29C68C
loc_29C67C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbc4]
    ldr      d0, [x0, x8]
    ret      

// -[WCLGEdgeEffectView setLastAlpha:] IMP=0x29C68C bounds=0x29C68C-0x29C69C
loc_29C68C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbc4]
    str      d0, [x0, x8]
    ret      

// -[WCLGEdgeEffectView lastRect] IMP=0x29C69C bounds=0x29C69C-0x29C6B4
loc_29C69C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbc8]
    add      x8, x0, x8
    ldp      d0, d1, [x8]
    ldp      d2, d3, [x8, #0x10]
    ret      

// -[WCLGEdgeEffectView setLastRect:] IMP=0x29C6B4 bounds=0x29C6B4-0x29C6CC
loc_29C6B4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbc8]
    add      x8, x0, x8
    stp      d0, d1, [x8]
    stp      d2, d3, [x8, #0x10]
    ret      

// -[WCLGEdgeEffectView lastEdge] IMP=0x29C6CC bounds=0x29C6CC-0x29C6DC
loc_29C6CC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbcc]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGEdgeEffectView setLastEdge:] IMP=0x29C6DC bounds=0x29C6DC-0x29C6EC
loc_29C6DC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbcc]
    str      x2, [x0, x8]
    ret      

// -[WCLGEdgeEffectView lastEdgeSize] IMP=0x29C6EC bounds=0x29C6EC-0x29C6FC
loc_29C6EC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbd0]
    ldr      d0, [x0, x8]
    ret      

// -[WCLGEdgeEffectView setLastEdgeSize:] IMP=0x29C6FC bounds=0x29C6FC-0x29C70C
loc_29C6FC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbd0]
    str      d0, [x0, x8]
    ret      

// -[WCLGEdgeEffectView lastBlurRadius] IMP=0x29C70C bounds=0x29C70C-0x29C71C
loc_29C70C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbd4]
    ldr      d0, [x0, x8]
    ret      

// -[WCLGEdgeEffectView setLastBlurRadius:] IMP=0x29C71C bounds=0x29C71C-0x29C72C
loc_29C71C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbd4]
    str      d0, [x0, x8]
    ret      

// -[WCLGEdgeEffectView .cxx_destruct] IMP=0x29C72C bounds=0x29C72C-0x29C7A8
loc_29C72C:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbbc]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbb8]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbac]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbb4]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xbb0]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
