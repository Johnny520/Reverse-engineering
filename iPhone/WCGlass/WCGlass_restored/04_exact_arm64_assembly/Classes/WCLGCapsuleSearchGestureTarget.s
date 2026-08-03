// Exact ARM64 listing for WCLGCapsuleSearchGestureTarget

// +[WCLGCapsuleSearchGestureTarget shared] IMP=0x21651C bounds=0x21651C-0x216590
loc_21651C:
    sub      sp, sp, #0x40
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x740]
    str      x8, [sp, #8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x398]
    str      d0, [sp, #0x10]
    adrp     x8, #0x216000
    add      x8, x8, #0x590
    adrp     x9, #0x4a0000
    add      x9, x9, #0xd88
    stp      x8, x9, [sp, #0x18]
    str      x0, [sp, #0x28]
    adrp     x8, #0x57f000
    ldr      x8, [x8, #0x240]
    cmn      x8, #1
    b.ne     #0x21657c
    adrp     x8, #0x57f000
    ldr      x0, [x8, #0x238]
    ldp      x29, x30, [sp, #0x30]
    add      sp, sp, #0x40
    b        #0x461cc0 // _objc_retainAutoreleaseReturnValue
    adrp     x0, #0x57f000
    add      x0, x0, #0x240
    add      x1, sp, #8
    bl       #0x4619d8 // _dispatch_once
    b        #0x216568

// -[WCLGCapsuleSearchGestureTarget handleLongPress:] IMP=0x2165B8 bounds=0x2165B8-0x21678C
loc_2165B8:
    stp      d13, d12, [sp, #-0x60]!
    stp      d11, d10, [sp, #0x10]
    stp      d9, d8, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x2
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x3d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    b.ne     #0x21676c
    adrp     x8, #0x582000
    add      x8, x8, #0xf88
    ldrb     w8, [x8]
    tbz      w8, #0, #0x21676c
    adrp     x8, #0x582000
    add      x8, x8, #0xfc3
    ldrb     w8, [x8]
    tbz      w8, #0, #0x21676c
    adrp     x8, #0x582000
    add      x8, x8, #0xfc4
    ldrb     w8, [x8]
    tbz      w8, #0, #0x21676c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1c8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x216764
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x458]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    mov      x0, x20
    mov      x1, x20
    mov      x2, #0
    bl       #0x21678c
    fmov     d10, d0
    fmov     d11, d1
    fmov     d12, d2
    fmov     d13, d3
    bl       #0x461750 // _CGRectIsNull
    tbnz     w0, #0, #0x2166cc
    fmov     d0, d10
    fmov     d1, d11
    fmov     d2, d12
    fmov     d3, d13
    bl       #0x461744 // _CGRectIsEmpty
    tbz      w0, #0, #0x216724
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x4d8]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    fmov     d1, #1.00000000
    fcmp     d0, d1
    fcsel    d0, d1, d0, mi
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3b8]
    fmul     d10, d0, d1
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x8b0]
    fmul     d11, d0, d1
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616b4 // _CGRectGetHeight
    fmov     d3, d0
    fmov     d1, xzr
    b        #0x216748
    fmov     d4, #-24.00000000
    fmov     d5, #-10.00000000
    fmov     d0, d10
    fmov     d1, d11
    fmov     d2, d12
    fmov     d3, d13
    bl       #0x461714 // _CGRectInset
    fmov     d10, d0
    fmov     d11, d2
    fmov     d0, d10
    fmov     d2, d11
    fmov     d4, d8
    fmov     d5, d9
    bl       #0x46169c // _CGRectContainsPoint
    cbz      w0, #0x216764
    bl       #0x238e64
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    ldp      d11, d10, [sp, #0x10]
    ldp      d13, d12, [sp], #0x60
    b        #0x461c9c // _objc_release
