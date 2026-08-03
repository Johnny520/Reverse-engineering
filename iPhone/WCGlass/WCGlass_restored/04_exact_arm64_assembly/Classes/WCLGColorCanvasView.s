// Exact ARM64 listing for WCLGColorCanvasView

// -[WCLGColorCanvasView initWithFrame:] IMP=0x24A0D4 bounds=0x24A0D4-0x24A570
loc_24A0D4:
    sub      sp, sp, #0xe0
    stp      x28, x27, [sp, #0x80]
    stp      x26, x25, [sp, #0x90]
    stp      x24, x23, [sp, #0xa0]
    stp      x22, x21, [sp, #0xb0]
    stp      x20, x19, [sp, #0xc0]
    stp      x29, x30, [sp, #0xd0]
    add      x29, sp, #0xd0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    mov      w19, #0x44a7
    movk     w19, #0xd7c0, lsl #16
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x758]
    stp      x0, x8, [sp, #0x48]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    add      x0, sp, #0x48
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      w10, #0xd5cf
    movk     w10, #0xc8b6, lsl #16
    str      x0, [sp, #0x40]
    add      x8, sp, #0x3c
    mov      w11, #0xd8bc
    movk     w11, #0xf8de, lsl #16
    str      w10, [sp, #0x3c]
    str      x8, [sp, #0x30]
    ldr      w8, [sp, #0x3c]
    cmp      w8, w10
    b.eq     #0x24a518
    cmp      w8, w11
    b.eq     #0x24a168
    cmp      w8, w19
    b.ne     #0x24a148
    b        #0x24a530
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa64]
    ldr      x9, [sp, #0x40]
    str      xzr, [x9, x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x280]
    adrp     x8, #0x4be000
    ldr      x19, [x8, #0xac8]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0xa68]
    ldr      x10, [sp, #0x40]
    stp      x9, x10, [sp, #0x20]
    ldr      x8, [x10, x9]
    str      x0, [x10, x9]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x20, #0x4c4000
    ldr      x0, [x20, #0x290]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c4000
    ldrsw    x25, [x8, #0xa6c]
    ldr      x23, [sp, #0x40]
    ldr      x8, [x23, x25]
    str      x0, [x23, x25]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x0, [x20, #0x290]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0xa70]
    str      x9, [sp, #0x18]
    ldr      x24, [sp, #0x40]
    ldr      x8, [x24, x9]
    str      x0, [x24, x9]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, x25]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x850]
    str      x1, [sp, #0x10]
    fmov     d0, xzr
    fmov     d1, #0.50000000
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x23, x25]
    adrp     x8, #0x4bf000
    ldr      x22, [x8, #0x858]
    fmov     d0, #1.00000000
    fmov     d1, #0.50000000
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    mov      x27, x8
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0xbf0]
    fmov     d0, #1.00000000
    fmov     d1, #1.00000000
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xac0]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x68]
    ldr      x0, [x27, #0x90]
    fmov     d0, #1.00000000
    fmov     d1, xzr
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x70]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    str      x1, [sp, #8]
    add      x2, sp, #0x68
    mov      w3, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    ldr      x0, [x23, x25]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x868]
    str      x1, [sp]
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldp      x1, x26, [sp, #0x10]
    ldr      x0, [x24, x26]
    fmov     d0, #0.50000000
    fmov     d1, xzr
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x24, x26]
    fmov     d0, #0.50000000
    fmov     d1, #1.00000000
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x27, #0x4c4000
    ldr      x0, [x27, #0x90]
    fmov     d0, xzr
    fmov     d1, xzr
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x58]
    ldr      x0, [x27, #0x90]
    fmov     d0, xzr
    fmov     d1, #1.00000000
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x60]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    add      x2, sp, #0x58
    ldr      x1, [sp, #8]
    mov      w3, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x0, [x24, x26]
    ldr      x1, [sp]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x40]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldp      x9, x8, [sp, #0x20]
    ldr      x2, [x8, x9]
    adrp     x8, #0x4bf000
    ldr      x21, [x8, #0x810]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x40]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x2, [x23, x25]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x40]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x2, [x24, x26]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x40]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, #16.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x40]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    mov      w19, #0x44a7
    movk     w19, #0xd7c0, lsl #16
    bl       #0x461c9c // _objc_release
    mov      w11, #0xd8bc
    movk     w11, #0xf8de, lsl #16
    mov      w10, #0xd5cf
    movk     w10, #0xc8b6, lsl #16
    ldr      x8, [sp, #0x30]
    str      w19, [x8]
    b        #0x24a148
    ldr      x8, [sp, #0x40]
    cmp      x8, #0
    csel     w8, w19, w11, eq
    ldr      x9, [sp, #0x30]
    str      w8, [x9]
    b        #0x24a148
    ldr      x0, [sp, #0x40]
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x24a56c
    ldp      x29, x30, [sp, #0xd0]
    ldp      x20, x19, [sp, #0xc0]
    ldp      x22, x21, [sp, #0xb0]
    ldp      x24, x23, [sp, #0xa0]
    ldp      x26, x25, [sp, #0x90]
    ldp      x28, x27, [sp, #0x80]
    add      sp, sp, #0xe0
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGColorCanvasView setHue:] IMP=0x24A570 bounds=0x24A570-0x24A628
loc_24A570:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    fmov     d1, xzr
    fmaxnm   d0, d0, d1
    fmov     d1, #1.00000000
    fcmp     d0, d1
    fcsel    d0, d1, d0, gt
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa64]
    str      d0, [x0, x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x860]
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac0]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x868]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGColorCanvasView layoutSubviews] IMP=0x24A628 bounds=0x24A628-0x24A9E8
loc_24A628:
    stp      d11, d10, [sp, #-0x80]!
    stp      d9, d8, [sp, #0x10]
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    sub      sp, sp, #0x10
    mov      x19, x0
    mov      w23, #0x83fb
    movk     w23, #0xa95d, lsl #16
    mov      w24, #0x4904
    movk     w24, #0x93f6, lsl #16
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xae0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xae4]
    mov      w10, #0xa625
    movk     w10, #0x32d5, lsl #16
    madd     w8, w8, w9, w10
    mov      w9, #0x37cb
    movk     w9, #0x846b, lsl #16
    eor      w8, w8, w9
    stur     w8, [x29, #-0x74]
    mov      w8, #0x5f45
    movk     w8, #0xfd54, lsl #16
    stur     w8, [x29, #-0x78]
    sub      x8, x29, #0x78
    stur     x8, [x29, #-0x80]
    mov      w26, #0x83fa
    movk     w26, #0xa95d, lsl #16
    adrp     x25, #0x4c0000
    adrp     x28, #0x4c0000
    ldur     w8, [x29, #-0x78]
    cmp      w8, w26
    b.le     #0x24a6f0
    cmp      w8, w23
    b.eq     #0x24a870
    mov      w9, #0x5f45
    movk     w9, #0xfd54, lsl #16
    cmp      w8, w9
    b.ne     #0x24a6b4
    ldur     w8, [x29, #-0x74]
    mov      w9, #0x6478
    movk     w9, #0xdc49, lsl #16
    cmp      w8, w9
    csel     w8, w23, w24, hi
    b        #0x24a864
    cmp      w8, w24
    b.ne     #0x24a9b0
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xae8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xaec]
    orr      w8, w8, w9
    mov      w9, #0xd55f
    movk     w9, #0x3160, lsl #16
    mul      w27, w8, w9
    mov      x8, sp
    sub      x0, x8, #0x10
    mov      sp, x0
    adrp     x9, #0x4c4000
    ldr      x9, [x9, #0x758]
    stp      x19, x9, [x8, #-0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
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
    ldr      x1, [x8, #0x868]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x678]
    mov      x1, x21
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    ldr      x1, [x25, #0x870]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x1, x21
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    ldr      x1, [x28, #0x878]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x21
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      w8, #0xd100
    movk     w8, #0xf0c1, lsl #16
    cmp      w27, w8
    mov      w8, #0x2c23
    movk     w8, #0x8595, lsl #16
    csel     w8, w23, w8, eq
    ldur     x9, [x29, #-0x80]
    str      w8, [x9]
    b        #0x24a6b4
    mov      x8, sp
    sub      x0, x8, #0x10
    mov      sp, x0
    adrp     x9, #0x4c4000
    ldr      x9, [x9, #0x758]
    stp      x19, x9, [x8, #-0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
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
    ldr      x1, [x8, #0x868]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x678]
    mov      x1, x21
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    ldr      x1, [x25, #0x870]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x1, x21
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    ldr      x1, [x28, #0x878]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x21
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x80]
    str      w24, [x8]
    b        #0x24a6b4
    mov      w9, #0x2c23
    movk     w9, #0x8595, lsl #16
    cmp      w8, w9
    b.ne     #0x24a6b4
    sub      sp, x29, #0x70
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    ldp      d9, d8, [sp, #0x10]
    ldp      d11, d10, [sp], #0x80
    ret      

// -[WCLGColorCanvasView hueLayer] IMP=0x24A9E8 bounds=0x24A9E8-0x24A9F8
loc_24A9E8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa68]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorCanvasView setHueLayer:] IMP=0x24A9F8 bounds=0x24A9F8-0x24AA0C
loc_24A9F8:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa68]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGColorCanvasView whiteLayer] IMP=0x24AA0C bounds=0x24AA0C-0x24AB3C
loc_24AA0C:
    sub      sp, sp, #0x20
    mov      w8, #0xac8a
    movk     w8, #0x2a18, lsl #16
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xaf0]
    adrp     x10, #0x522000
    ldr      w10, [x10, #0xaf4]
    and      w9, w9, w10
    mov      w10, #0xc78d
    movk     w10, #0x474c, lsl #16
    mov      w11, #0x5512
    movk     w11, #0xa1bb, lsl #16
    madd     w9, w9, w10, w11
    mov      w10, #0xdffe
    movk     w10, #0x8380, lsl #16
    and      w9, w9, w10
    str      w9, [sp, #0x1c]
    mov      w9, #0x18
    movk     w9, #0x4b51, lsl #16
    str      w9, [sp, #0xc]
    add      x10, sp, #0xc
    str      x10, [sp]
    mov      w10, #0x96e7
    movk     w10, #0x434e, lsl #16
    mov      w11, #0xe834
    movk     w11, #0x282f, lsl #16
    adrp     x12, #0x522000
    adrp     x13, #0x522000
    mov      w14, #0x7672
    movk     w14, #0x30d3, lsl #16
    mov      w15, #0xfcb4
    movk     w15, #0x342d, lsl #16
    mov      w16, #0x4933
    movk     w16, #0x5d2a, lsl #16
    adrp     x17, #0x4c4000
    mov      w1, #0xa33d
    movk     w1, #0x8938, lsl #16
    mov      w2, #0x96e8
    movk     w2, #0x434e, lsl #16
    mov      w3, #0x1582
    movk     w3, #0xe22f, lsl #16
    ldr      w4, [sp, #0xc]
    cmp      w4, w10
    b.gt     #0x24aafc
    cmp      w4, w11
    b.eq     #0x24ab1c
    cmp      w4, w8
    b.ne     #0x24aab0
    ldr      w4, [x12, #0xaf8]
    ldr      w5, [x13, #0xafc]
    and      w4, w4, w5
    add      w4, w4, w14
    orr      w4, w4, w15
    ldrsw    x5, [x17, #0xa6c]
    ldr      x5, [x0, x5]
    add      w4, w4, w16
    str      x5, [sp, #0x10]
    cmp      w4, w1
    csel     w4, w2, w8, hi
    b        #0x24ab10
    cmp      w4, w9
    b.ne     #0x24ab28
    ldr      w4, [sp, #0x1c]
    cmp      w4, w3
    csel     w4, w11, w8, hi
    ldr      x5, [sp]
    str      w4, [x5]
    b        #0x24aab0
    ldr      x4, [sp]
    str      w8, [x4]
    b        #0x24aab0
    cmp      w4, w2
    b.ne     #0x24aab0
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGColorCanvasView setWhiteLayer:] IMP=0x24AB3C bounds=0x24AB3C-0x24AB50
loc_24AB3C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa6c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGColorCanvasView blackLayer] IMP=0x24AB50 bounds=0x24AB50-0x24AB60
loc_24AB50:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa70]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorCanvasView setBlackLayer:] IMP=0x24AB60 bounds=0x24AB60-0x24AB74
loc_24AB60:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa70]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGColorCanvasView hue] IMP=0x24AB74 bounds=0x24AB74-0x24AB84
loc_24AB74:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa64]
    ldr      d0, [x0, x8]
    ret      

// -[WCLGColorCanvasView .cxx_destruct] IMP=0x24AB84 bounds=0x24AB84-0x24ABD8
loc_24AB84:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa70]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa6c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa68]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
