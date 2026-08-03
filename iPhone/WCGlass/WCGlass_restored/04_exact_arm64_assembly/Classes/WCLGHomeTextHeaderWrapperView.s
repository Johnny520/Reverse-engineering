// Exact ARM64 listing for WCLGHomeTextHeaderWrapperView

// -[WCLGHomeTextHeaderWrapperView layoutSubviews] IMP=0x38E354 bounds=0x38E354-0x38E78C
loc_38E354:
    sub      sp, sp, #0x160
    stp      d9, d8, [sp, #0xf0]
    stp      x28, x27, [sp, #0x100]
    stp      x26, x25, [sp, #0x110]
    stp      x24, x23, [sp, #0x120]
    stp      x22, x21, [sp, #0x130]
    stp      x20, x19, [sp, #0x140]
    stp      x29, x30, [sp, #0x150]
    add      x29, sp, #0x150
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x70]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x808]
    stp      x0, x8, [sp, #0x50]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
    add      x0, sp, #0x50
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x19
    str      x1, [sp]
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    fcmp     d0, #0.0
    b.hi     #0x38e3dc
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x770]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x30]
    stp      q0, q0, [sp, #0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x7c0]
    str      x19, [sp, #8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x478]
    add      x2, sp, #0x10
    add      x3, sp, #0x60
    mov      x1, x22
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x38e4e8
    mov      x23, x0
    ldr      x8, [sp, #0x20]
    ldr      x20, [x8]
    fmov     d8, xzr
    adrp     x28, #0x4be000
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x3d8]
    mov      x19, #0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x9a8]
    ldr      x25, [x28, #0x9c0]
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x770]
    ldr      x8, [sp, #0x20]
    ldr      x8, [x8]
    cmp      x8, x20
    b.eq     #0x38e474
    mov      x0, x21
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp, #0x18]
    ldr      x27, [x8, x19, lsl #3]
    mov      x0, x27
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x38e4b8
    mov      x0, x27
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    fcmp     d0, d9
    b.mi     #0x38e4b8
    mov      x0, x27
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616cc // _CGRectGetMaxY
    fcmp     d8, d0
    fcsel    d8, d0, d8, mi
    add      x19, x19, #1
    cmp      x23, x19
    b.ne     #0x38e45c
    add      x2, sp, #0x10
    add      x3, sp, #0x60
    mov      x0, x21
    mov      x1, x22
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    cbnz     x0, #0x38e444
    b        #0x38e4ec
    fmov     d8, xzr
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    fmov     d0, #1.00000000
    fmaxnm   d9, d8, d0
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
    ldp      x1, x25, [sp]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616b4 // _CGRectGetHeight
    fmov     d1, #0.50000000
    fadd     d0, d0, d1
    fcmp     d8, d0
    b.ls     #0x38e74c
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    cbz      x25, #0x38e5e4
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x410]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x418]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x468]
    adrp     x19, #0x4c4000
    mov      x20, x25
    ldr      x0, [x19, #0xa0]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x38e644
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x20, x24
    cbnz     x24, #0x38e598
    b        #0x38e5e8
    mov      x20, #0
    mov      w19, #1
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x770]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    mov      x0, x25
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    tbnz     w19, #0, #0x38e73c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xf38]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    cmp      x0, x25
    b.eq     #0x38e68c
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    b        #0x38e73c
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x970]
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x38e73c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x978]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x38e73c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x980]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x38e73c
    mov      w19, #0
    b        #0x38e5ec
    adrp     x1, #0x554000
    add      x1, x1, #0x830
    mov      x0, x20
    bl       #0x461c3c // _objc_getAssociatedObject
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x370]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    tbnz     w23, #0, #0x38e73c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x22, #0x554000
    add      x22, x22, #0x830
    mov      x0, x20
    mov      x1, x22
    mov      x2, x21
    mov      w3, #1
    bl       #0x461ce4 // _objc_setAssociatedObject
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xd48]
    mov      x0, x20
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x22
    mov      x2, #0
    mov      x3, #0
    bl       #0x461ce4 // _objc_setAssociatedObject
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x70]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x38e788
    ldp      x29, x30, [sp, #0x150]
    ldp      x20, x19, [sp, #0x140]
    ldp      x22, x21, [sp, #0x130]
    ldp      x24, x23, [sp, #0x120]
    ldp      x26, x25, [sp, #0x110]
    ldp      x28, x27, [sp, #0x100]
    ldp      d9, d8, [sp, #0xf0]
    add      sp, sp, #0x160
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGHomeTextHeaderWrapperView hitTest:withEvent:] IMP=0x38E78C bounds=0x38E78C-0x38EA64
loc_38E78C:
    sub      sp, sp, #0x1a0
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
    mov      x19, x2
    fmov     d8, d1
    fmov     d9, d0
    mov      x21, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x90]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x808]
    stp      x21, x8, [sp, #0x70]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xa98]
    add      x0, sp, #0x70
    mov      x1, x22
    fmov     d0, d9
    fmov     d1, d8
    mov      x2, x19
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    cbz      x0, #0x38e82c
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x25, x20
    b        #0x38e9f8
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x9a8]
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x38e9f4
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x9c0]
    mov      x0, x21
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x491000
    ldr      d12, [x8, #0x3d8]
    fcmp     d0, d12
    b.mi     #0x38e9f4
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xdf0]
    mov      x0, x21
    str      x1, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x38e9f4
    str      x22, [sp, #0x10]
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x50]
    stp      q0, q0, [sp, #0x30]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x7c0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    add      x2, sp, #0x30
    add      x3, sp, #0x80
    mov      x0, x26
    str      x1, [sp, #8]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x38e9ec
    mov      x28, x0
    ldr      x8, [sp, #0x40]
    ldr      x27, [x8]
    mov      x22, #0
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0xa88]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xa90]
    stp      x8, x9, [sp, #0x18]
    ldr      x8, [sp, #0x40]
    ldr      x8, [x8]
    cmp      x8, x27
    b.eq     #0x38e92c
    mov      x0, x26
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp, #0x38]
    ldr      x25, [x8, x22, lsl #3]
    mov      x0, x25
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x38e9c0
    mov      x0, x25
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    fcmp     d0, d12
    b.mi     #0x38e9c0
    mov      x0, x25
    ldr      x1, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x38e9c0
    mov      x0, x21
    ldr      x1, [sp, #0x20]
    fmov     d0, d9
    fmov     d1, d8
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    fmov     d11, d1
    mov      x0, x25
    ldr      x1, [sp, #0x18]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x38e9c0
    mov      x0, x25
    ldr      x1, [sp, #0x10]
    fmov     d0, d10
    fmov     d1, d11
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cbnz     x0, #0x38ea50
    add      x22, x22, #1
    cmp      x28, x22
    b.ne     #0x38e914
    add      x2, sp, #0x30
    add      x3, sp, #0x80
    mov      x0, x26
    ldr      x1, [sp, #8]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    cbnz     x0, #0x38e8fc
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x25, #0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x90]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x38ea60
    mov      x0, x25
    ldp      x29, x30, [sp, #0x190]
    ldp      x20, x19, [sp, #0x180]
    ldp      x22, x21, [sp, #0x170]
    ldp      x24, x23, [sp, #0x160]
    ldp      x26, x25, [sp, #0x150]
    ldp      x28, x27, [sp, #0x140]
    ldp      d9, d8, [sp, #0x130]
    ldp      d11, d10, [sp, #0x120]
    ldp      d13, d12, [sp, #0x110]
    add      sp, sp, #0x1a0
    b        #0x461be8 // _objc_autoreleaseReturnValue
    mov      x25, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    b        #0x38e9f8
    bl       #0x4618b8 // ___stack_chk_fail
