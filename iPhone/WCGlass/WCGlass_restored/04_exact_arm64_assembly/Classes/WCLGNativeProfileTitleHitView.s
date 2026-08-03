// Exact ARM64 listing for WCLGNativeProfileTitleHitView

// -[WCLGNativeProfileTitleHitView initWithFrame:] IMP=0x1DB6C0 bounds=0x1DB6C0-0x1DB720
loc_1DB6C0:
    sub      sp, sp, #0x20
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x710]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    cbz      x0, #0x1db714
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9a8]
    add      x8, x0, x8
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x5f0]
    ldp      q0, q1, [x9]
    stp      q0, q1, [x8]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9ac]
    strb     wzr, [x0, x8]
    ldp      x29, x30, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGNativeProfileTitleHitView pointInside:withEvent:] IMP=0x1DB720 bounds=0x1DB720-0x1DB880
loc_1DB720:
    sub      sp, sp, #0x70
    stp      d15, d14, [sp, #0x10]
    stp      d13, d12, [sp, #0x20]
    stp      d11, d10, [sp, #0x30]
    stp      d9, d8, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    fmov     d8, d1
    fmov     d9, d0
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x20, [x8, #0x238]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461750 // _CGRectIsNull
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x4d8]
    cmp      w0, #0
    csel     x1, x8, x20, ne
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    fmov     d11, d1
    fmov     d12, d2
    fmov     d13, d3
    bl       #0x461744 // _CGRectIsEmpty
    tbz      w0, #0, #0x1db798
    mov      w0, #0
    b        #0x1db860
    fmov     d0, d10
    fmov     d1, d11
    fmov     d2, d12
    fmov     d3, d13
    fmov     d4, d9
    fmov     d5, d8
    bl       #0x46169c // _CGRectContainsPoint
    cbz      w0, #0x1db860
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x240]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x1db85c
    fmov     d0, d10
    fmov     d1, d11
    fmov     d2, d12
    fmov     d3, d13
    bl       #0x4616d8 // _CGRectGetMidX
    str      d0, [sp, #8]
    fmov     d0, d10
    fmov     d1, d11
    fmov     d2, d12
    fmov     d3, d13
    bl       #0x4616e4 // _CGRectGetMidY
    fmov     d15, d0
    fmov     d0, d10
    fmov     d1, d11
    fmov     d2, d12
    fmov     d3, d13
    bl       #0x461708 // _CGRectGetWidth
    fmov     d14, d0
    fmov     d0, d10
    fmov     d1, d11
    fmov     d2, d12
    fmov     d3, d13
    bl       #0x4616b4 // _CGRectGetHeight
    fcmp     d14, d0
    fcsel    d0, d14, d0, mi
    fmov     d1, #0.50000000
    fmul     d0, d0, d1
    ldr      d1, [sp, #8]
    fsub     d1, d9, d1
    fsub     d2, d8, d15
    fmul     d2, d2, d2
    fmadd    d1, d1, d1, d2
    fmul     d0, d0, d0
    fcmp     d1, d0
    cset     w0, ls
    b        #0x1db860
    mov      w0, #1
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      d9, d8, [sp, #0x40]
    ldp      d11, d10, [sp, #0x30]
    ldp      d13, d12, [sp, #0x20]
    ldp      d15, d14, [sp, #0x10]
    add      sp, sp, #0x70
    ret      

// -[WCLGNativeProfileTitleHitView wclgHitRect] IMP=0x1DB880 bounds=0x1DB880-0x1DB898
loc_1DB880:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9a8]
    add      x8, x0, x8
    ldp      d0, d1, [x8]
    ldp      d2, d3, [x8, #0x10]
    ret      

// -[WCLGNativeProfileTitleHitView setWclgHitRect:] IMP=0x1DB898 bounds=0x1DB898-0x1DB8B0
loc_1DB898:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9a8]
    add      x8, x0, x8
    stp      d0, d1, [x8]
    stp      d2, d3, [x8, #0x10]
    ret      

// -[WCLGNativeProfileTitleHitView wclgCircularHitTest] IMP=0x1DB8B0 bounds=0x1DB8B0-0x1DB8C0
loc_1DB8B0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9ac]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGNativeProfileTitleHitView setWclgCircularHitTest:] IMP=0x1DB8C0 bounds=0x1DB8C0-0x1DB8D0
loc_1DB8C0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9ac]
    strb     w2, [x0, x8]
    ret      
