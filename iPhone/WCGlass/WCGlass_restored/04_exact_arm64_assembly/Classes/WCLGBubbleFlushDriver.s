// Exact ARM64 listing for WCLGBubbleFlushDriver

// +[WCLGBubbleFlushDriver shared] IMP=0x1A99B4 bounds=0x1A99B4-0x1A99E4
loc_1A99B4:
    adrp     x8, #0x57e000
    ldr      x8, [x8, #0x848]
    cmn      x8, #1
    b.ne     #0x1a99d0
    adrp     x8, #0x57e000
    ldr      x0, [x8, #0x840]
    b        #0x461cc0 // _objc_retainAutoreleaseReturnValue
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    bl       #0x45fba4
    ldp      x29, x30, [sp], #0x10
    b        #0x1a99c4

// -[WCLGBubbleFlushDriver kick] IMP=0x1A9A18 bounds=0x1A9A18-0x1A9B3C
loc_1A9A18:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x20, [x8, #0x68]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461c9c // _objc_release
    cbnz     x21, #0x1a9b00
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x3b0]
    adrp     x8, #0x4c0000
    ldr      x3, [x8, #0x70]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x78]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x80]
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
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x3b8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x88]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x2b8]
    ldr      x3, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x90]
    mov      x0, x21
    mov      x2, x22
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
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x98]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGBubbleFlushDriver tick:] IMP=0x1A9B3C bounds=0x1A9B3C-0x1AA19C
loc_1A9B3C:
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
    sub      sp, sp, #0x260
    mov      x0, x2
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x90]
    str      x2, [sp, #0x10]
    bl       #0x461ca8 // _objc_retain
    adrp     x24, #0x57e000
    ldr      x0, [x24, #0x838]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xa80]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x80]
    stp      q0, q0, [sp, #0xa0]
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    add      x2, sp, #0x80
    add      x3, sp, #0x138
    str      x1, [sp, #0x70]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x1aa0ec
    mov      x23, x0
    mov      x28, #0
    add      x22, sp, #0xc0
    ldr      x8, [sp, #0x90]
    ldr      x19, [x8]
    adrp     x20, #0x4c4000
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x370]
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x418]
    adrp     x8, #0x491000
    ldr      d10, [x8, #0x598]
    adrp     x8, #0x491000
    ldr      d11, [x8, #0x380]
    adrp     x8, #0x491000
    ldr      d12, [x8, #0x388]
    adrp     x26, #0x4a0000
    ldr      x26, [x26, #0x770]
    str      x19, [sp, #0x38]
    str      x27, [sp]
    mov      x21, #0
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0xc58]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x410]
    stp      x8, x9, [sp, #0x60]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x418]
    str      x8, [sp, #0x58]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x370]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x4a8]
    stp      x8, x9, [sp, #0x40]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x4f8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x498]
    stp      x23, x8, [sp, #0x28]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x470]
    stp      x8, x9, [sp, #0x18]
    ldr      x8, [sp, #0x90]
    ldr      x8, [x8]
    cmp      x8, x19
    b.eq     #0x1a9c94
    mov      x0, x27
    bl       #0x461c24 // _objc_enumerationMutation
    cmp      x28, #5
    b.hi     #0x1aa0ec
    ldr      x8, [sp, #0x88]
    ldr      x25, [x8, x21, lsl #3]
    ldr      x0, [x24, #0x838]
    ldr      x1, [sp, #0x68]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x20, #0x78]
    ldr      x1, [sp, #0x60]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x25
    ldr      x1, [sp, #0x58]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x1aa0c0
    str      x21, [sp, #0x50]
    mov      x0, x25
    adrp     x1, #0x500000
    add      x1, x1, #0x5f8
    mov      x2, #0
    mov      x3, #0
    bl       #0x461ce4 // _objc_setAssociatedObject
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    adrp     x1, #0x500000
    add      x1, x1, #0x5d0
    bl       #0x461c3c // _objc_getAssociatedObject
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    str      x25, [sp, #0x78]
    cbz      x0, #0x1a9d20
    mov      w19, #1
    b        #0x1a9da8
    mov      x0, x25
    adrp     x1, #0x500000
    add      x1, x1, #0x5c0
    bl       #0x461c3c // _objc_getAssociatedObject
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    cbz      x0, #0x1a9d48
    mov      w19, #1
    b        #0x1a9da0
    mov      x0, x25
    adrp     x1, #0x500000
    add      x1, x1, #0x5a0
    bl       #0x461c3c // _objc_getAssociatedObject
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    cbz      x0, #0x1a9d70
    mov      w19, #1
    b        #0x1a9d94
    mov      x0, x25
    adrp     x1, #0x500000
    add      x1, x1, #0x5a8
    bl       #0x461c3c // _objc_getAssociatedObject
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cmp      x0, #0
    cset     w19, ne
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x23, [sp, #0x28]
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x25, [sp, #0x78]
    mov      x0, x25
    adrp     x1, #0x500000
    add      x1, x1, #0x598
    bl       #0x461c3c // _objc_getAssociatedObject
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x48]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    ldr      x1, [sp, #0x40]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cbnz     x0, #0x1a9e0c
    tbnz     w19, #0, #0x1a9e0c
    ldr      x19, [sp, #0x78]
    tbnz     w20, #0, #0x1a9e14
    b        #0x1aa0a8
    bl       #0x461c9c // _objc_release
    ldr      x19, [sp, #0x78]
    mov      x0, x19
    bl       #0x19c0b8
    mov      x0, x19
    bl       #0x1a1658
    cbz      w0, #0x1aa0a8
    mov      x0, x19
    bl       #0x1a9824
    cbz      w0, #0x1aa0a8
    mov      x0, x19
    adrp     x1, #0x500000
    add      x1, x1, #0x748
    bl       #0x461c3c // _objc_getAssociatedObject
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0x48]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    tbnz     w21, #0, #0x1aa0a8
    mov      x21, x19
    adrp     x19, #0x4c4000
    ldr      x0, [x19, #0xa8]
    ldr      x1, [sp, #0x20]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    adrp     x1, #0x500000
    add      x1, x1, #0x748
    mov      x2, x20
    mov      w3, #1
    bl       #0x461ce4 // _objc_setAssociatedObject
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    add      x0, sp, #0x130
    mov      x1, x21
    bl       #0x461c54 // _objc_initWeak
    ldr      x0, [x19, #0xa8]
    ldr      x1, [sp, #0x30]
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    stur     x0, [x29, #-0xa8]
    ldr      x0, [x19, #0xa8]
    ldr      x1, [sp, #0x30]
    fmov     d0, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    stur     x0, [x29, #-0xa0]
    ldr      x0, [x19, #0xa8]
    ldr      x1, [sp, #0x30]
    fmov     d0, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    stur     x0, [x29, #-0x98]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    sub      x2, x29, #0xa8
    ldr      x1, [sp, #0x18]
    mov      w3, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    str      x28, [sp, #8]
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x110]
    stp      q0, q0, [sp, #0xf0]
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    add      x2, sp, #0xf0
    add      x3, sp, #0x1b8
    ldr      x1, [sp, #0x70]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    cbz      x0, #0x1aa080
    ldr      x8, [sp, #0x100]
    ldr      x28, [x8]
    mov      x19, #0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x7a8]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x4a0]
    ldr      x8, [sp, #0x100]
    ldr      x8, [x8]
    cmp      x8, x28
    b.eq     #0x1a9fbc
    mov      x0, x24
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp, #0xf8]
    ldr      x27, [x8, x19, lsl #3]
    mov      x0, x24
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x27, x25
    cset     w27, eq
    fmul     d0, d0, d11
    fcvtzs   x1, d0
    mov      x0, #0
    bl       #0x461a2c // _dispatch_time
    mov      x25, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp, #0xc0]
    str      d12, [sp, #0xc8]
    adrp     x8, #0x1da000
    add      x9, x8, #0xc9c
    adrp     x8, #0x4a2000
    add      x8, x8, #0x4d8
    stp      x9, x8, [sp, #0xd0]
    add      x0, x22, #0x20
    add      x1, sp, #0x130
    bl       #0x461c00 // _objc_copyWeak
    strb     w27, [sp, #0xe8]
    add      x2, sp, #0xc0
    mov      x0, x25
    mov      x1, x26
    bl       #0x46196c // _dispatch_after
    add      x0, x22, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    add      x19, x19, #1
    cmp      x20, x19
    b.ne     #0x1a9fa4
    add      x2, sp, #0xf0
    add      x3, sp, #0x1b8
    mov      x0, x24
    ldr      x1, [sp, #0x70]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    cbnz     x0, #0x1a9f90
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    add      x0, sp, #0x130
    bl       #0x461c0c // _objc_destroyWeak
    adrp     x24, #0x57e000
    ldp      x27, x28, [sp]
    ldr      x23, [sp, #0x28]
    ldr      x19, [sp, #0x78]
    add      x28, x28, #1
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x19, [sp, #0x38]
    adrp     x20, #0x4c4000
    ldr      x21, [sp, #0x50]
    add      x21, x21, #1
    cmp      x21, x23
    b.ne     #0x1a9c7c
    add      x2, sp, #0x80
    add      x3, sp, #0x138
    mov      x0, x27
    ldr      x1, [sp, #0x70]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    cbnz     x0, #0x1a9c24
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    ldr      x0, [x24, #0x838]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    ldr      x19, [sp, #0x10]
    cbnz     x0, #0x1aa128
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x98]
    mov      x0, x19
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x90]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x1aa174
    add      sp, sp, #0x260
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    ldp      d11, d10, [sp, #0x10]
    ldp      d13, d12, [sp], #0x90
    ret      
    bl       #0x4618b8 // ___stack_chk_fail
    b        #0x1aa188
    b        #0x1aa188
    b        #0x1aa188
    b        #0x1aa188
    mov      x19, x0
    add      x0, sp, #0x130
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGBubbleFlushDriver link] IMP=0x1AA19C bounds=0x1AA19C-0x1AA1A4
loc_1AA19C:
    ldr      x0, [x0, #8]
    ret      

// -[WCLGBubbleFlushDriver setLink:] IMP=0x1AA1A4 bounds=0x1AA1A4-0x1AA1B0
loc_1AA1A4:
    mov      x1, x2
    add      x0, x0, #8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGBubbleFlushDriver .cxx_destruct] IMP=0x1AA1B0 bounds=0x1AA1B0-0x1AA1BC
loc_1AA1B0:
    add      x0, x0, #8
    mov      x1, #0
    b        #0x461cfc // _objc_storeStrong
