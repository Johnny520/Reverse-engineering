// Exact ARM64 listing for WCLGForegroundReaffirm

// +[WCLGForegroundReaffirm sharedInstance] IMP=0x3AA548 bounds=0x3AA548-0x3AA5BC
loc_3AA548:
    sub      sp, sp, #0x40
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x740]
    str      x8, [sp, #8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x398]
    str      d0, [sp, #0x10]
    adrp     x8, #0x3aa000
    add      x8, x8, #0x5bc
    adrp     x9, #0x4a0000
    add      x9, x9, #0xd88
    stp      x8, x9, [sp, #0x18]
    str      x0, [sp, #0x28]
    adrp     x8, #0x581000
    ldr      x8, [x8, #0xe48]
    cmn      x8, #1
    b.ne     #0x3aa5a8
    adrp     x8, #0x581000
    ldr      x0, [x8, #0xe40]
    ldp      x29, x30, [sp, #0x30]
    add      sp, sp, #0x40
    b        #0x461cc0 // _objc_retainAutoreleaseReturnValue
    adrp     x0, #0x581000
    add      x0, x0, #0xe48
    add      x1, sp, #8
    bl       #0x4619d8 // _dispatch_once
    b        #0x3aa594

// -[WCLGForegroundReaffirm appDidBecomeActive:] IMP=0x3AA5E4 bounds=0x3AA5E4-0x3AA924
loc_3AA5E4:
    sub      sp, sp, #0x170
    stp      d9, d8, [sp, #0x100]
    stp      x28, x27, [sp, #0x110]
    stp      x26, x25, [sp, #0x120]
    stp      x24, x23, [sp, #0x130]
    stp      x22, x21, [sp, #0x140]
    stp      x20, x19, [sp, #0x150]
    stp      x29, x30, [sp, #0x160]
    add      x29, sp, #0x160
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x70]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x310]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cbz      w20, #0x3aa8e4
    adrp     x0, #0x495000
    add      x0, x0, #0xa4d
    adrp     x19, #0x495000
    add      x19, x19, #0xa6e
    mov      x1, x19
    mov      w2, #1
    bl       #0x461da4 // _setenv
    adrp     x0, #0x495000
    add      x0, x0, #0xa70
    mov      x1, x19
    mov      w2, #1
    bl       #0x461da4 // _setenv
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x68]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x348]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x350]
    adrp     x3, #0x4a9000
    add      x3, x3, #0xdd8
    mov      x1, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x3, #0x4a9000
    add      x3, x3, #0xdf8
    mov      x0, x19
    mov      x1, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x3, #0x4a9000
    add      x3, x3, #0xe18
    mov      x0, x19
    mov      x1, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x25, #0x4c4000
    ldr      x0, [x25, #0xa8]
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x498]
    fmov     d0, xzr
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    stur     x0, [x29, #-0x98]
    ldr      x0, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x390]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    stur     x0, [x29, #-0x90]
    ldr      x0, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x660]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    stur     x0, [x29, #-0x88]
    ldr      x0, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0xa88]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    stur     x0, [x29, #-0x80]
    ldr      x0, [x25, #0xa8]
    fmov     d0, #3.00000000
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    stur     x0, [x29, #-0x78]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    sub      x2, x29, #0x98
    mov      w3, #5
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x20]
    stp      q0, q0, [sp]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x478]
    mov      x2, sp
    add      x3, sp, #0x48
    mov      x1, x21
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x3aa8cc
    mov      x22, x0
    ldr      x8, [sp, #0x10]
    ldr      x26, [x8]
    adrp     x27, #0x4be000
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x380]
    adrp     x23, #0x4a0000
    ldr      x23, [x23, #0x770]
    adrp     x24, #0x4a5000
    add      x24, x24, #0x800
    mov      x28, #0
    ldr      x25, [x27, #0x4a0]
    ldr      x8, [sp, #0x10]
    ldr      x8, [x8]
    cmp      x8, x26
    b.eq     #0x3aa874
    mov      x0, x20
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp, #8]
    ldr      x0, [x8, x28, lsl #3]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    fmul     d0, d0, d8
    fcvtzs   x1, d0
    mov      x0, #0
    bl       #0x461a2c // _dispatch_time
    mov      x1, x23
    mov      x2, x24
    bl       #0x46196c // _dispatch_after
    add      x28, x28, #1
    cmp      x22, x28
    b.ne     #0x3aa85c
    mov      x2, sp
    add      x3, sp, #0x48
    mov      x0, x20
    mov      x1, x21
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    cbnz     x0, #0x3aa854
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x70]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x3aa920
    ldp      x29, x30, [sp, #0x160]
    ldp      x20, x19, [sp, #0x150]
    ldp      x22, x21, [sp, #0x140]
    ldp      x24, x23, [sp, #0x130]
    ldp      x26, x25, [sp, #0x120]
    ldp      x28, x27, [sp, #0x110]
    ldp      d9, d8, [sp, #0x100]
    add      sp, sp, #0x170
    ret      
    bl       #0x4618b8 // ___stack_chk_fail
