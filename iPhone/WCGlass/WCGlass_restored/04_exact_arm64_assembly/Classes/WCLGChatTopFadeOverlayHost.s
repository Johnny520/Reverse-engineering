// Exact ARM64 listing for WCLGChatTopFadeOverlayHost

// -[WCLGChatTopFadeOverlayHost initWithFrame:] IMP=0x229D60 bounds=0x229D60-0x22A064
loc_229D60:
    adrp     x8, #0x57f000
    add      x8, x8, #0x400
    ldar     w9, [x8]
    cbnz     w9, #0x229e98
    adrp     x9, #0x51d000
    add      x9, x9, #0x6e0
    ldrb     w10, [x9]
    mov      w11, #0xd1
    eor      w11, w10, w11
    adrp     x10, #0x51d000
    add      x10, x10, #0x700
    strb     w11, [x10]
    ldrb     w11, [x9, #1]
    mov      w12, #0x58
    eor      w11, w11, w12
    strb     w11, [x10, #1]
    ldrb     w11, [x9, #2]
    mov      w12, #0x39
    eor      w11, w11, w12
    strb     w11, [x10, #2]
    ldrb     w11, [x9, #3]
    mov      w12, #0x67
    eor      w11, w11, w12
    strb     w11, [x10, #3]
    ldrb     w11, [x9, #4]
    mov      w12, #5
    eor      w11, w11, w12
    strb     w11, [x10, #4]
    ldrb     w11, [x9, #5]
    eor      w11, w11, #0x10
    strb     w11, [x10, #5]
    ldrb     w11, [x9, #6]
    mov      w12, #0x47
    eor      w11, w11, w12
    strb     w11, [x10, #6]
    ldrb     w11, [x9, #7]
    eor      w11, w11, #0xfffffff9
    strb     w11, [x10, #7]
    ldrb     w11, [x9, #8]
    mov      w12, #0xab
    eor      w11, w11, w12
    strb     w11, [x10, #8]
    ldrb     w11, [x9, #9]
    eor      w11, w11, #0x80
    strb     w11, [x10, #9]
    ldrb     w11, [x9, #0xa]
    mov      w12, #0xa1
    eor      w11, w11, w12
    strb     w11, [x10, #0xa]
    ldrb     w11, [x9, #0xb]
    eor      w11, w11, #0x3f
    strb     w11, [x10, #0xb]
    ldrb     w11, [x9, #0xc]
    mov      w12, #0x28
    eor      w11, w11, w12
    strb     w11, [x10, #0xc]
    ldrb     w11, [x9, #0xd]
    mov      w12, #0x5c
    eor      w11, w11, w12
    strb     w11, [x10, #0xd]
    ldrb     w11, [x9, #0xe]
    eor      w11, w11, #8
    strb     w11, [x10, #0xe]
    ldrb     w11, [x9, #0xf]
    mov      w12, #0x1a
    eor      w11, w11, w12
    strb     w11, [x10, #0xf]
    ldrb     w11, [x9, #0x10]
    mov      w12, #0xa6
    eor      w11, w11, w12
    strb     w11, [x10, #0x10]
    ldrb     w11, [x9, #0x11]
    eor      w11, w11, #0x60
    strb     w11, [x10, #0x11]
    ldrb     w9, [x9, #0x12]
    mov      w11, #0xdb
    eor      w9, w9, w11
    strb     w9, [x10, #0x12]
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
    ldr      x10, [x10, #0x720]
    stp      x0, x10, [x9, #-0x10]
    adrp     x9, #0x4be000
    ldr      x20, [x9, #0xb38]
    mov      x0, x8
    mov      x1, x20
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x19, x0
    cbz      x0, #0x22a04c
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
    mov      x8, #0x4074000000000000
    fmov     d0, x8
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
    add      x2, x2, #0x740
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x7aa9c
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
    ldrsw    x20, [x8, #0x9d0]
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

// -[WCLGChatTopFadeOverlayHost layoutSubviews] IMP=0x22A064 bounds=0x22A064-0x22A214
loc_22A064:
    sub      sp, sp, #0xa0
    stp      d11, d10, [sp, #0x40]
    stp      d9, d8, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x720]
    stp      x0, x8, [sp, #0x30]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
    add      x0, sp, #0x30
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x4d8]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x3e8]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x3f0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    cbz      x0, #0x22a1ec
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x3f8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    add      x8, sp, #8
    bl       #0x4560ac
    mov      x0, x21
    bl       #0x22a214
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616b4 // _CGRectGetHeight
    fmov     d1, #1.00000000
    fmaxnm   d8, d0, d1
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, d0
    fmov     d5, d1
    fmov     d16, d2
    fmov     d7, d3
    ldr      d6, [sp, #0x28]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x400]
    fmov     d0, xzr
    mov      x0, x22
    mov      x2, x23
    mov      w3, #1
    fmov     d1, d4
    fmov     d2, d5
    fmov     d3, d16
    fmov     d4, d7
    mov      x4, #0
    fmov     d5, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      d9, d8, [sp, #0x50]
    ldp      d11, d10, [sp, #0x40]
    add      sp, sp, #0xa0
    ret      

// -[WCLGChatTopFadeOverlayHost scrollView] IMP=0x22A388 bounds=0x22A388-0x22A3A8
loc_22A388:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9d4]
    add      x0, x0, x8
    bl       #0x461c60 // _objc_loadWeakRetained
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGChatTopFadeOverlayHost setScrollView:] IMP=0x22A3A8 bounds=0x22A3A8-0x22A3BC
loc_22A3A8:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9d4]
    add      x0, x0, x8
    b        #0x461d08 // _objc_storeWeak

// -[WCLGChatTopFadeOverlayHost overlayMode] IMP=0x22A3BC bounds=0x22A3BC-0x22A3CC
loc_22A3BC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9d8]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGChatTopFadeOverlayHost setOverlayMode:] IMP=0x22A3CC bounds=0x22A3CC-0x22A3DC
loc_22A3CC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9d8]
    str      x2, [x0, x8]
    ret      

// -[WCLGChatTopFadeOverlayHost edgeView] IMP=0x22A3DC bounds=0x22A3DC-0x22A3EC
loc_22A3DC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9d0]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGChatTopFadeOverlayHost setEdgeView:] IMP=0x22A3EC bounds=0x22A3EC-0x22A400
loc_22A3EC:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9d0]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGChatTopFadeOverlayHost .cxx_destruct] IMP=0x22A400 bounds=0x22A400-0x22A43C
loc_22A400:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9d0]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9d4]
    add      x0, x19, x8
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c0c // _objc_destroyWeak
