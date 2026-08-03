// Exact ARM64 listing for WCLGCapsulePinnedContainerView

// -[WCLGCapsulePinnedContainerView pointInside:withEvent:] IMP=0x318464 bounds=0x318464-0x31869C
loc_318464:
    sub      sp, sp, #0x180
    stp      d11, d10, [sp, #0x100]
    stp      d9, d8, [sp, #0x110]
    stp      x28, x27, [sp, #0x120]
    stp      x26, x25, [sp, #0x130]
    stp      x24, x23, [sp, #0x140]
    stp      x22, x21, [sp, #0x150]
    stp      x20, x19, [sp, #0x160]
    stp      x29, x30, [sp, #0x170]
    add      x29, sp, #0x170
    mov      x19, x2
    fmov     d8, d1
    fmov     d9, d0
    mov      x21, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x80]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7c0]
    stp      x21, x8, [sp, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xa90]
    add      x0, sp, #0x60
    stp      x1, x19, [sp, #0x10]
    fmov     d0, d9
    fmov     d1, d8
    mov      x2, x19
    bl       #0x461c84 // _objc_msgSendSuper2
    tbz      w0, #0, #0x3184ec
    mov      w20, #1
    b        #0x31864c
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x40]
    stp      q0, q0, [sp, #0x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x7c0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    add      x2, sp, #0x20
    add      x3, sp, #0x70
    mov      x0, x22
    str      x1, [sp, #8]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x318638
    mov      x24, x0
    ldr      x8, [sp, #0x30]
    ldr      x19, [x8]
    adrp     x8, #0x491000
    ldr      d10, [x8, #0x3d8]
    mov      x20, #0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x9a8]
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x9c0]
    adrp     x8, #0x4bf000
    ldr      x27, [x8, #0xdf0]
    adrp     x8, #0x4be000
    ldr      x28, [x8, #0xa88]
    ldr      x8, [sp, #0x30]
    ldr      x8, [x8]
    cmp      x8, x19
    b.eq     #0x3185a8
    mov      x0, x22
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp, #0x28]
    ldr      x23, [x8, x20, lsl #3]
    mov      x0, x23
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x31860c
    mov      x0, x23
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    fcmp     d0, d10
    b.mi     #0x31860c
    mov      x0, x23
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x31860c
    mov      x0, x21
    mov      x1, x28
    fmov     d0, d9
    fmov     d1, d8
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    ldp      x1, x2, [sp, #0x10]
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x318640
    add      x20, x20, #1
    cmp      x24, x20
    b.ne     #0x318590
    add      x2, sp, #0x20
    add      x3, sp, #0x70
    mov      x0, x22
    ldr      x1, [sp, #8]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    cbnz     x0, #0x31856c
    mov      w20, #0
    b        #0x318644
    mov      w20, #1
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x80]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x318698
    mov      x0, x20
    ldp      x29, x30, [sp, #0x170]
    ldp      x20, x19, [sp, #0x160]
    ldp      x22, x21, [sp, #0x150]
    ldp      x24, x23, [sp, #0x140]
    ldp      x26, x25, [sp, #0x130]
    ldp      x28, x27, [sp, #0x120]
    ldp      d9, d8, [sp, #0x110]
    ldp      d11, d10, [sp, #0x100]
    add      sp, sp, #0x180
    ret      
    bl       #0x4618b8 // ___stack_chk_fail
