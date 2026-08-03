// Exact ARM64 listing for WCLGChatBottomFadeOverlayHost

// -[WCLGChatBottomFadeOverlayHost initWithFrame:] IMP=0x22A43C bounds=0x22A43C-0x22A784
loc_22A43C:
    adrp     x8, #0x57f000
    add      x8, x8, #0x428
    ldar     w9, [x8]
    cbnz     w9, #0x22a5ac
    adrp     x9, #0x51d000
    add      x9, x9, #0x760
    ldrb     w10, [x9]
    mov      w11, #0xb7
    eor      w11, w10, w11
    adrp     x10, #0x51d000
    add      x10, x10, #0x780
    strb     w11, [x10]
    ldrb     w11, [x9, #1]
    eor      w11, w11, #0xffffffe1
    strb     w11, [x10, #1]
    ldrb     w11, [x9, #2]
    mov      w12, #0xd1
    eor      w11, w11, w12
    strb     w11, [x10, #2]
    ldrb     w11, [x9, #3]
    mov      w12, #0x8a
    eor      w11, w11, w12
    strb     w11, [x10, #3]
    ldrb     w11, [x9, #4]
    mov      w12, #0xb6
    eor      w11, w11, w12
    strb     w11, [x10, #4]
    ldrb     w11, [x9, #5]
    eor      w11, w11, #0xffffff81
    strb     w11, [x10, #5]
    ldrb     w11, [x9, #6]
    mov      w12, #0xf2
    eor      w11, w11, w12
    strb     w11, [x10, #6]
    ldrb     w11, [x9, #7]
    mov      w12, #0x7a
    eor      w11, w11, w12
    strb     w11, [x10, #7]
    ldrb     w11, [x9, #8]
    mov      w12, #0x95
    eor      w11, w11, w12
    strb     w11, [x10, #8]
    ldrb     w11, [x9, #9]
    mov      w12, #0x2d
    eor      w11, w11, w12
    strb     w11, [x10, #9]
    ldrb     w11, [x9, #0xa]
    mov      w12, #0x73
    eor      w11, w11, w12
    strb     w11, [x10, #0xa]
    ldrb     w11, [x9, #0xb]
    mov      w12, #0xcd
    eor      w11, w11, w12
    strb     w11, [x10, #0xb]
    ldrb     w11, [x9, #0xc]
    mov      w12, #0xa8
    eor      w11, w11, w12
    strb     w11, [x10, #0xc]
    ldrb     w11, [x9, #0xd]
    mov      w13, #0x93
    eor      w11, w11, w13
    strb     w11, [x10, #0xd]
    ldrb     w11, [x9, #0xe]
    mov      w13, #0x2f
    eor      w11, w11, w13
    strb     w11, [x10, #0xe]
    ldrb     w11, [x9, #0xf]
    mov      w13, #0x2b
    eor      w11, w11, w13
    strb     w11, [x10, #0xf]
    ldrb     w11, [x9, #0x10]
    mov      w13, #0xae
    eor      w11, w11, w13
    strb     w11, [x10, #0x10]
    ldrb     w11, [x9, #0x11]
    mov      w13, #0x21
    eor      w11, w11, w13
    strb     w11, [x10, #0x11]
    ldrb     w11, [x9, #0x12]
    eor      w11, w11, #0xffffff9f
    strb     w11, [x10, #0x12]
    ldrb     w11, [x9, #0x13]
    mov      w13, #0x6a
    eor      w11, w11, w13
    strb     w11, [x10, #0x13]
    ldrb     w11, [x9, #0x14]
    eor      w11, w11, w12
    strb     w11, [x10, #0x14]
    ldrb     w9, [x9, #0x15]
    mov      w11, #0x75
    eor      w9, w9, w11
    strb     w9, [x10, #0x15]
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      w9, #1
    stlr     w9, [x8]
    mov      x9, sp
    sub      x8, x9, #0x10
    mov      sp, x8
    adrp     x10, #0x4c4000
    ldr      x10, [x10, #0x728]
    stp      x0, x10, [x9, #-0x10]
    adrp     x9, #0x4be000
    ldr      x20, [x9, #0xb38]
    mov      x0, x8
    mov      x1, x20
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x19, x0
    cbz      x0, #0x22a76c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbb0]
    mov      x0, x19
    mov      w2, #1
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
    ldr      x21, [x8, #0xac8]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x2c8]
    fmov     d0, xzr
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x808]
    adrp     x2, #0x51d000
    add      x2, x2, #0x7c0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x7aa9c
    bl       #0x45593c
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9dc]
    str      d0, [x19, x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x418]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x608]
    ldp      d0, d1, [x8]
    ldp      d2, d3, [x8, #0x10]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x20, [x8, #0x9e0]
    ldr      x8, [x19, x20]
    str      x0, [x19, x20]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x20]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x3e0]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    sub      sp, x29, #0x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    ret      

// -[WCLGChatBottomFadeOverlayHost layoutSubviews] IMP=0x22A784 bounds=0x22A784-0x22A934
loc_22A784:
    sub      sp, sp, #0x80
    stp      d13, d12, [sp, #0x10]
    stp      d11, d10, [sp, #0x20]
    stp      d9, d8, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x728]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x4d8]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0x3e8]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x3f0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    cbz      x0, #0x22a908
    mov      x0, x20
    bl       #0x22a214
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616b4 // _CGRectGetHeight
    fmov     d1, #1.00000000
    fmaxnm   d8, d0, d1
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    fmov     d10, d1
    fmov     d11, d2
    fmov     d12, d3
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x408]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d6, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x400]
    fmov     d0, xzr
    mov      x0, x23
    mov      x2, x22
    mov      w3, #1
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    fmov     d4, d12
    mov      w4, #1
    fmov     d5, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      d9, d8, [sp, #0x30]
    ldp      d11, d10, [sp, #0x20]
    ldp      d13, d12, [sp, #0x10]
    add      sp, sp, #0x80
    ret      

// -[WCLGChatBottomFadeOverlayHost scrollView] IMP=0x22A934 bounds=0x22A934-0x22A954
loc_22A934:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9e4]
    add      x0, x0, x8
    bl       #0x461c60 // _objc_loadWeakRetained
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGChatBottomFadeOverlayHost setScrollView:] IMP=0x22A954 bounds=0x22A954-0x22A968
loc_22A954:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9e4]
    add      x0, x0, x8
    b        #0x461d08 // _objc_storeWeak

// -[WCLGChatBottomFadeOverlayHost edgeView] IMP=0x22A968 bounds=0x22A968-0x22A978
loc_22A968:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9e0]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGChatBottomFadeOverlayHost setEdgeView:] IMP=0x22A978 bounds=0x22A978-0x22A98C
loc_22A978:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9e0]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGChatBottomFadeOverlayHost configuredBlurRadius] IMP=0x22A98C bounds=0x22A98C-0x22A99C
loc_22A98C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9dc]
    ldr      d0, [x0, x8]
    ret      

// -[WCLGChatBottomFadeOverlayHost setConfiguredBlurRadius:] IMP=0x22A99C bounds=0x22A99C-0x22A9AC
loc_22A99C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9dc]
    str      d0, [x0, x8]
    ret      

// -[WCLGChatBottomFadeOverlayHost .cxx_destruct] IMP=0x22A9AC bounds=0x22A9AC-0x22A9E8
loc_22A9AC:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9e0]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9e4]
    add      x0, x19, x8
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c0c // _objc_destroyWeak
