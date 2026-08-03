// Exact ARM64 listing for WCLGChatPinnedHitCatcher

// -[WCLGChatPinnedHitCatcher hitTest:withEvent:] IMP=0x2984C bounds=0x2984C-0x29D84
loc_2984C:
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
    sub      sp, sp, #0x1d0
    fmov     d8, d1
    fmov     d9, d0
    str      x0, [sp, #0x38]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x90]
    str      x2, [sp, #0x30]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x582000
    add      x8, x8, #0xf88
    ldrb     w8, [x8]
    tbz      w8, #0, #0x29c40
    adrp     x8, #0x582000
    add      x8, x8, #0xfc5
    ldrb     w8, [x8]
    tbz      w8, #0, #0x29c40
    adrp     x8, #0x523000
    add      x8, x8, #0x1b3
    ldrb     w8, [x8]
    tbz      w8, #0, #0x29c40
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0xa0]
    stp      q0, q0, [sp, #0x80]
    adrp     x8, #0x57b000
    ldr      x8, [x8, #0xea0]
    cmn      x8, #1
    b.ne     #0x29ce0
    adrp     x8, #0x57b000
    ldr      x0, [x8, #0xe98]
    adrp     x8, #0x4be000
    ldr      x19, [x8, #0xa80]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    str      x19, [sp, #8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    add      x2, sp, #0x80
    add      x3, sp, #0x140
    str      x1, [sp, #0x18]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    cbz      x0, #0x29aa4
    ldr      x8, [sp, #0x90]
    ldr      x23, [x8]
    adrp     x8, #0x491000
    ldr      d12, [x8, #0x3d8]
    mov      x20, #0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x9a8]
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x9c0]
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x4a8]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0xa88]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xa90]
    stp      x8, x9, [sp, #0x20]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xa98]
    str      x8, [sp, #0x10]
    ldr      x8, [sp, #0x90]
    ldr      x8, [x8]
    cmp      x8, x23
    b.eq     #0x2999c
    mov      x0, x22
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp, #0x88]
    ldr      x19, [x8, x20, lsl #3]
    cbz      x19, #0x29a78
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x29a78
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    fcmp     d0, d12
    b.mi     #0x29a78
    mov      x0, x19
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x0, [sp, #0x38]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cmp      x21, x28
    b.ne     #0x29a78
    mov      x0, x19
    bl       #0x29d84
    cbz      w0, #0x29a78
    ldr      x0, [sp, #0x38]
    ldr      x1, [sp, #0x28]
    fmov     d0, d9
    fmov     d1, d8
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    fmov     d11, d1
    mov      x0, x19
    ldr      x1, [sp, #0x20]
    ldr      x2, [sp, #0x30]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x29a78
    mov      x0, x19
    ldr      x1, [sp, #0x10]
    fmov     d0, d10
    fmov     d1, d11
    ldr      x2, [sp, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cbnz     x0, #0x29cd4
    add      x20, x20, #1
    cmp      x24, x20
    b.ne     #0x29984
    add      x2, sp, #0x80
    add      x3, sp, #0x140
    mov      x0, x22
    ldr      x1, [sp, #0x18]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    cbnz     x0, #0x29948
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x60]
    stp      q0, q0, [sp, #0x40]
    adrp     x8, #0x57b000
    ldr      x8, [x8, #0xea0]
    cmn      x8, #1
    b.ne     #0x29ce8
    ldr      x1, [sp, #8]
    adrp     x8, #0x57b000
    ldr      x0, [x8, #0xe98]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    add      x2, sp, #0x40
    add      x3, sp, #0xc0
    ldr      x1, [sp, #0x18]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    cbz      x0, #0x29c38
    ldr      x8, [sp, #0x50]
    ldr      x27, [x8]
    adrp     x8, #0x491000
    ldr      d12, [x8, #0x3d8]
    mov      x20, #0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x9a8]
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x9c0]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x4a8]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0xa88]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xa90]
    stp      x8, x9, [sp, #0x20]
    ldr      x8, [sp, #0x50]
    ldr      x8, [x8]
    cmp      x8, x27
    b.eq     #0x29b58
    mov      x0, x22
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp, #0x48]
    ldr      x28, [x8, x20, lsl #3]
    cbz      x28, #0x29c0c
    mov      x0, x28
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x29c0c
    mov      x0, x28
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    fcmp     d0, d12
    b.mi     #0x29c0c
    mov      x0, x28
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x0, [sp, #0x38]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cmp      x19, x26
    b.ne     #0x29c0c
    mov      x0, x28
    bl       #0x29d84
    tbnz     w0, #0, #0x29c0c
    ldr      x0, [sp, #0x38]
    ldr      x1, [sp, #0x28]
    fmov     d0, d9
    fmov     d1, d8
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    fmov     d11, d1
    mov      x0, x28
    ldr      x1, [sp, #0x20]
    ldr      x2, [sp, #0x30]
    bl       #0x461c6c // _objc_msgSend
    cbnz     w0, #0x29c94
    add      x20, x20, #1
    cmp      x23, x20
    b.ne     #0x29b40
    add      x2, sp, #0x40
    add      x3, sp, #0xc0
    mov      x0, x22
    ldr      x1, [sp, #0x18]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    cbnz     x0, #0x29b10
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x19, #0
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x90]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x29cf0
    mov      x0, x19
    add      sp, sp, #0x1d0
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    ldp      d11, d10, [sp, #0x10]
    ldp      d13, d12, [sp], #0x90
    b        #0x461be8 // _objc_autoreleaseReturnValue
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xa98]
    mov      x0, x28
    fmov     d0, d10
    fmov     d1, d11
    ldr      x2, [sp, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    cmp      x0, #0
    csel     x19, x28, x0, eq
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    b        #0x29c44
    bl       #0x45ed98
    b        #0x298ec
    bl       #0x45edac
    b        #0x29ac8
    bl       #0x4618b8 // ___stack_chk_fail
    b        #0x29d4c
    b        #0x29d4c
    b        #0x29d04
    b        #0x29d4c
    mov      x20, x1
    mov      x23, x0
    b        #0x29d5c
    b        #0x29d4c
    b        #0x29d4c
    b        #0x29d4c
    b        #0x29d4c
    b        #0x29d4c
    mov      x20, x1
    mov      x23, x0
    mov      x0, x19
    b        #0x29d40
    mov      x20, x1
    mov      x23, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    b        #0x29d54
    b        #0x29d4c
    mov      x20, x1
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cmp      w20, #1
    b.ne     #0x29d74
    mov      x0, x23
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    b        #0x29c40
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461894 // __Unwind_Resume
