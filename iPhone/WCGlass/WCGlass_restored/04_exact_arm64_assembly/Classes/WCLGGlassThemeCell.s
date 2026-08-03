// Exact ARM64 listing for WCLGGlassThemeCell

// -[WCLGGlassThemeCell initWithStyle:reuseIdentifier:] IMP=0x29606C bounds=0x29606C-0x297720
loc_29606C:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    sub      sp, sp, #0x290
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x70]
    adrp     x8, #0x57f000
    add      x8, x8, #0xec8
    ldar     w9, [x8]
    cbnz     w9, #0x296194
    adrp     x9, #0x52f000
    add      x9, x9, #0xff0
    ldrb     w10, [x9]
    eor      w10, w10, #0x7e
    adrp     x11, #0x52f000
    add      x11, x11, #0xffe
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x4e
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xffffff81
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0xbd
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0xe9
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x29
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0x68
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0xc4
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w12, #0xab
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    mov      w12, #0xd0
    eor      w10, w10, w12
    strb     w10, [x11, #9]
    ldrb     w10, [x9, #0xa]
    mov      w12, #0x59
    eor      w10, w10, w12
    strb     w10, [x11, #0xa]
    ldrb     w10, [x9, #0xb]
    mov      w12, #0x8e
    eor      w10, w10, w12
    strb     w10, [x11, #0xb]
    ldrb     w10, [x9, #0xc]
    mov      w12, #0x6f
    eor      w10, w10, w12
    strb     w10, [x11, #0xc]
    ldrb     w9, [x9, #0xd]
    eor      w9, w9, #0xfffffff1
    strb     w9, [x11, #0xd]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x9, sp
    sub      x8, x9, #0x10
    mov      sp, x8
    sub      x20, sp, #0xd0
    mov      sp, x20
    adrp     x10, #0x4c4000
    ldr      x10, [x10, #0x778]
    stp      x0, x10, [x9, #-0x10]
    adrp     x9, #0x4c0000
    ldr      x1, [x9, #0x7e0]
    mov      x0, x8
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x19, x0
    cbz      x0, #0x2976dc
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x48
    stur     x20, [x8, #-0x100]
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x460]
    mov      x0, x19
    mov      x1, x27
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xdd8]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461bac // _objc_alloc_init
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc30]
    mov      x28, x0
    mov      w2, #0x63
    bl       #0x461c6c // _objc_msgSend
    adrp     x21, #0x4c4000
    ldr      x0, [x21, #0x480]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9c8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x28
    mov      x1, x27
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xac8]
    mov      x0, x28
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0xb48]
    fmov     d0, #16.00000000
    mov      x1, x26
    stur     x26, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb10]
    fmov     d0, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x21, #0x480]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xde0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac0]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x28
    mov      x1, x25
    stur     x25, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb18]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xde8]
    mov      x0, x28
    mov      x24, x1
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xaf0]
    stur     x1, [x29, #-0xa8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xb40]
    mov      x1, x21
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461bac // _objc_alloc_init
    adrp     x8, #0x4c4000
    ldrsw    x20, [x8, #0xb50]
    ldr      x8, [x19, x20]
    str      x0, [x19, x20]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x430]
    stur     x1, [x29, #-0x78]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    stur     x1, [x29, #-0x90]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x20]
    mov      x22, x20
    stur     x20, [x29, #-0x88]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    fmov     d0, #12.00000000
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x23, #0x4c4000
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf0]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x3f8]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x4e8]
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x19, x22]
    mov      x1, x27
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x22]
    mov      x1, x24
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x22]
    mov      x0, x28
    stur     x28, [x29, #-0x80]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x908]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0xb54]
    ldr      x8, [x19, x9]
    str      x0, [x19, x9]
    mov      x22, x9
    sub      x10, x29, #0x38
    stur     x9, [x10, #-0x100]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d9, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    stur     x1, [x29, #-0xb8]
    fmov     d0, #16.00000000
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x19, x22]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xec8]
    mov      x1, x25
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x2f8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x19, x22]
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0xea8]
    mov      x1, x26
    stur     x26, [x29, #-0xa0]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x22]
    mov      x1, x24
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x22]
    mov      x0, x28
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x23, [x8, #0xb58]
    ldr      x8, [x19, x23]
    str      x0, [x19, x23]
    sub      x9, x29, #0x30
    stur     x23, [x9, #-0x100]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4bf000
    ldr      x20, [x8, #0x800]
    fmov     d0, #12.00000000
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x0, [x19, x23]
    mov      x1, x25
    mov      x28, x25
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc18]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x0, [x19, x23]
    mov      x1, x26
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x23]
    mov      x1, x24
    mov      x25, x24
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x23]
    ldur     x26, [x29, #-0x80]
    mov      x0, x26
    mov      x1, x21
    mov      x24, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0xb5c]
    ldr      x8, [x19, x9]
    str      x0, [x19, x9]
    mov      x22, x9
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    fmov     d0, #11.00000000
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x19, x22]
    mov      x23, x22
    sub      x8, x29, #0x20
    stur     x22, [x8, #-0x100]
    mov      x22, x28
    mov      x1, x28
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4c0000
    ldr      x28, [x8, #0xdf0]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x19, x23]
    ldur     x1, [x29, #-0xa0]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x23]
    mov      x1, x25
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x23]
    mov      x0, x26
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0xb60]
    ldr      x8, [x19, x9]
    str      x0, [x19, x9]
    mov      x23, x9
    stur     x9, [x29, #-0xa0]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    fmov     d0, #11.00000000
    ldur     x1, [x29, #-0xb8]
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x19, x23]
    mov      x1, x22
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x23]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1f8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x23]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x7f8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x23]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x200]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x23]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x208]
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x23]
    ldur     x1, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    fmov     d0, #10.00000000
    ldur     x1, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x23]
    ldur     x1, [x29, #-0x90]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x23]
    mov      x1, x25
    mov      x21, x25
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x23]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x23]
    mov      x23, x26
    mov      x0, x26
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461ba0 // _objc_alloc
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x80]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1d8]
    adrp     x2, #0x530000
    add      x2, x2, #0x30
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x428]
    mov      x0, x20
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x26, [x8, #0xb64]
    ldr      x8, [x19, x26]
    str      x0, [x19, x26]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x19, x26]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc40]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x26]
    ldur     x1, [x29, #-0x78]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x26]
    mov      x1, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x26]
    mov      x0, x23
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x488]
    sub      x9, x29, #0x90
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4c0000
    ldr      x27, [x8, #0xdf8]
    mov      x0, x23
    mov      x20, x23
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    stur     x0, [x29, #-0xb8]
    mov      x0, x19
    ldur     x24, [x29, #-0xa8]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb0]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    stur     x0, [x29, #-0xc0]
    adrp     x8, #0x4c0000
    ldr      x25, [x8, #0xe00]
    fmov     d0, #14.00000000
    mov      x0, x21
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xc8]
    sub      x8, x29, #0x48
    ldur     x21, [x8, #-0x100]
    str      x0, [x21]
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0xe08]
    mov      x0, x20
    mov      x1, x23
    stur     x23, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    stur     x0, [x29, #-0xd8]
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xd0]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    stur     x0, [x29, #-0xe0]
    fmov     d0, #-14.00000000
    mov      x0, x22
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xe8]
    str      x0, [x21, #8]
    adrp     x8, #0x4c0000
    ldr      x28, [x8, #0xe10]
    mov      x0, x20
    mov      x1, x28
    stur     x28, [x29, #-0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    stur     x0, [x29, #-0xf8]
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xf0]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    stur     x0, [x29, #-0x100]
    fmov     d0, #5.00000000
    mov      x0, x22
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #8
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0x10]
    adrp     x8, #0x4c0000
    ldr      x28, [x8, #0xe18]
    mov      x0, x20
    mov      x22, x20
    mov      x1, x28
    sub      x8, x29, #0x138
    stur     x28, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    sub      x8, x29, #0x18
    stur     x0, [x8, #-0x100]
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x10
    stur     x0, [x8, #-0x100]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x28
    stur     x0, [x8, #-0x100]
    fmov     d0, #-5.00000000
    mov      x0, x20
    mov      x1, x25
    mov      x28, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x40
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0x18]
    ldur     x20, [x29, #-0x88]
    ldr      x0, [x19, x20]
    mov      x25, x27
    stur     x27, [x29, #-0x98]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    sub      x8, x29, #0x50
    stur     x0, [x8, #-0x100]
    mov      x0, x22
    mov      x24, x22
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x58
    stur     x0, [x8, #-0x100]
    fmov     d0, #12.00000000
    mov      x0, x27
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x60
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0x20]
    ldr      x0, [x19, x20]
    mov      x25, x20
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0xe20]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    sub      x8, x29, #0x68
    stur     x0, [x8, #-0x100]
    mov      x0, x24
    mov      x20, x24
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x70
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe28]
    stur     x1, [x29, #-0xa8]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x78
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0x28]
    ldr      x0, [x19, x25]
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0xe30]
    mov      x1, x23
    sub      x8, x29, #0x140
    stur     x23, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x80
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x4c0000
    ldr      x27, [x8, #0xe38]
    mov      x8, #0x404a000000000000
    fmov     d8, x8
    mov      x1, x27
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x88
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0x30]
    ldr      x0, [x19, x25]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe40]
    sub      x8, x29, #0x128
    stur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x98
    stur     x0, [x8, #-0x100]
    mov      x1, x27
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xa0
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0x38]
    ldr      x0, [x19, x26]
    ldur     x24, [x29, #-0x78]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    sub      x8, x29, #0xa8
    stur     x0, [x8, #-0x100]
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0xb0
    stur     x0, [x8, #-0x100]
    fmov     d0, #-14.00000000
    mov      x0, x25
    mov      x24, x28
    sub      x8, x29, #0x1e8
    stur     x28, [x8, #-0x100]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xb8
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0x40]
    ldr      x0, [x19, x26]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    sub      x8, x29, #0xc0
    stur     x0, [x8, #-0x100]
    mov      x0, x20
    mov      x1, x22
    mov      x20, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0xc8
    stur     x0, [x8, #-0x100]
    mov      x0, x25
    ldur     x28, [x29, #-0xa8]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xd0
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0x48]
    ldr      x0, [x19, x26]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xd8
    stur     x0, [x8, #-0x100]
    fmov     d0, #9.00000000
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xe0
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0x50]
    ldr      x0, [x19, x26]
    sub      x8, x29, #0x128
    ldur     x22, [x8, #-0x100]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xe8
    stur     x0, [x8, #-0x100]
    fmov     d0, #14.00000000
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xf0
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0x58]
    ldur     x23, [x29, #-0xa0]
    ldr      x0, [x19, x23]
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    sub      x8, x29, #0xf8
    stur     x0, [x8, #-0x100]
    ldr      x0, [x19, x26]
    ldur     x1, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x100
    stur     x0, [x8, #-0x100]
    fmov     d0, #-10.00000000
    mov      x0, x25
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x108
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0x60]
    ldr      x0, [x19, x23]
    mov      x24, x23
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    sub      x8, x29, #0x110
    stur     x0, [x8, #-0x100]
    ldur     x25, [x29, #-0x80]
    mov      x0, x25
    mov      x1, x20
    mov      x23, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x118
    stur     x0, [x8, #-0x100]
    mov      x0, x26
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x120
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0x68]
    ldr      x0, [x19, x24]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x128
    stur     x0, [x8, #-0x100]
    fmov     d0, #20.00000000
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x130
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0x70]
    ldr      x0, [x19, x24]
    mov      x22, x24
    sub      x8, x29, #0x140
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x140
    stur     x0, [x8, #-0x100]
    mov      x8, #0x404d000000000000
    fmov     d0, x8
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x148
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0x78]
    sub      x8, x29, #0x38
    ldur     x20, [x8, #-0x100]
    ldr      x0, [x19, x20]
    ldur     x28, [x29, #-0x98]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    sub      x8, x29, #0x150
    stur     x0, [x8, #-0x100]
    ldur     x8, [x29, #-0x88]
    ldr      x0, [x19, x8]
    ldur     x26, [x29, #-0x78]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x158
    stur     x0, [x8, #-0x100]
    fmov     d0, #12.00000000
    mov      x0, x24
    sub      x8, x29, #0x1e8
    ldur     x24, [x8, #-0x100]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x160
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0x80]
    ldr      x0, [x19, x20]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    sub      x8, x29, #0x168
    stur     x0, [x8, #-0x100]
    mov      x0, x25
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x170
    stur     x0, [x8, #-0x100]
    fmov     d0, #-18.00000000
    mov      x0, x27
    mov      x1, x24
    mov      x25, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x178
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0x88]
    ldr      x0, [x19, x20]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    sub      x8, x29, #0x180
    stur     x0, [x8, #-0x100]
    mov      x26, x22
    ldr      x0, [x19, x22]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x188
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe48]
    stur     x1, [x29, #-0x88]
    fmov     d0, #-8.00000000
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x190
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0x90]
    sub      x8, x29, #0x30
    ldur     x24, [x8, #-0x100]
    ldr      x0, [x19, x24]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    sub      x8, x29, #0x198
    stur     x0, [x8, #-0x100]
    ldr      x0, [x19, x20]
    mov      x1, x28
    mov      x22, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x1a0
    stur     x0, [x8, #-0x100]
    mov      x0, x23
    ldur     x23, [x29, #-0xa8]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x1a8
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0x98]
    ldr      x0, [x19, x24]
    ldur     x1, [x29, #-0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    sub      x8, x29, #0x1b0
    stur     x0, [x8, #-0x100]
    ldr      x0, [x19, x20]
    sub      x8, x29, #0x138
    ldur     x27, [x8, #-0x100]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x1b8
    stur     x0, [x8, #-0x100]
    fmov     d0, #3.00000000
    mov      x0, x28
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x1c0
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0xa0]
    ldr      x0, [x19, x24]
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    sub      x8, x29, #0x1c8
    stur     x0, [x8, #-0x100]
    ldr      x0, [x19, x26]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x1d0
    stur     x0, [x8, #-0x100]
    fmov     d0, #-8.00000000
    mov      x0, x28
    ldur     x1, [x29, #-0x88]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x1d8
    stur     x0, [x8, #-0x100]
    str      x0, [x21, #0xa8]
    sub      x8, x29, #0x20
    ldur     x26, [x8, #-0x100]
    ldr      x0, [x19, x26]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    sub      x8, x29, #0x1e0
    stur     x0, [x8, #-0x100]
    ldr      x0, [x19, x20]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x38
    stur     x0, [x8, #-0x100]
    mov      x0, x28
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xa8]
    str      x0, [x21, #0xb0]
    ldr      x0, [x19, x26]
    mov      x20, x26
    ldur     x1, [x29, #-0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    ldr      x0, [x19, x24]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    fmov     d0, #3.00000000
    mov      x0, x26
    mov      x1, x25
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    str      x0, [x21, #0xb8]
    ldr      x0, [x19, x20]
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldur     x8, [x29, #-0xa0]
    ldr      x0, [x19, x8]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    fmov     d0, #-8.00000000
    mov      x0, x20
    ldur     x1, [x29, #-0x88]
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    str      x0, [x21, #0xc0]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    mov      x2, x21
    mov      w3, #0x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe50]
    sub      x8, x29, #0x90
    ldur     x0, [x8, #-0x100]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa8]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x38
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x1e0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x1d8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x1d0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x1c8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x1c0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x1b8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x1b0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x1a8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x1a0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x198
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x190
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x188
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x180
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x178
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x170
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x168
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x160
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x158
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x150
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x148
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x140
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x130
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x128
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x120
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x118
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x110
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x108
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x100
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xf8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xf0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xe8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xe0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xd8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xd0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xc8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xc0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xb8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xb0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xa8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xa0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x98
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x88
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x80
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x78
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x70
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x68
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x60
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x58
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x50
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x40
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x28
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x10
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x18
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x100]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xf0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xf8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xe8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xe0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xd0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xd8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xc8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xc0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x70]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x29771c
    mov      x0, x19
    sub      sp, x29, #0x60
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    ldp      d9, d8, [sp], #0x70
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGGlassThemeCell configure:] IMP=0x297720 bounds=0x297720-0x297FB4
loc_297720:
    sub      sp, sp, #0x70
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x57f000
    add      x8, x8, #0xecc
    ldar     w9, [x8]
    cbnz     w9, #0x297a4c
    adrp     x9, #0x530000
    add      x9, x9, #0xe2
    ldrb     w10, [x9]
    eor      w10, w10, #7
    adrp     x11, #0x530000
    add      x11, x11, #0xe9
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xdb
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xf
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x13
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0x78
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x5f
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w9, [x9, #6]
    mov      w10, #0x48
    eor      w9, w9, w10
    strb     w9, [x11, #6]
    adrp     x9, #0x530000
    add      x9, x9, #0xbe
    ldrh     w10, [x9]
    mov      w11, #0x41df
    eor      w10, w10, w11
    adrp     x11, #0x530000
    add      x11, x11, #0xc6
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x92b1
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x7f15
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w9, [x9, #6]
    mov      w10, #0xdb5b
    eor      w9, w9, w10
    strh     w9, [x11, #6]
    adrp     x9, #0x530000
    add      x9, x9, #0xae
    ldrh     w10, [x9]
    mov      w11, #0xf293
    eor      w10, w10, w11
    adrp     x11, #0x530000
    add      x11, x11, #0xb6
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x9d52
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xbbc6
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w9, [x9, #6]
    mov      w10, #0x23aa
    eor      w9, w9, w10
    strh     w9, [x11, #6]
    adrp     x9, #0x530000
    add      x9, x9, #0xa2
    ldrh     w10, [x9]
    mov      w11, #0x508c
    adrp     x12, #0x530000
    add      x12, x12, #0xa8
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0xded7
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x47fa
    eor      w9, w9, w10
    strh     w9, [x12, #4]
    adrp     x9, #0x530000
    add      x9, x9, #0x50
    ldrh     w10, [x9]
    mov      w11, #0xcdb6
    eor      w10, w10, w11
    adrp     x11, #0x530000
    add      x11, x11, #0x70
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xd90
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x7e29
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xe2bc
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x2d43
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0xee19
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0x9c67
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w10, [x9, #0xe]
    mov      w12, #0x8c42
    eor      w10, w10, w12
    strh     w10, [x11, #0xe]
    ldrh     w9, [x9, #0x10]
    mov      w10, #0x8ccf
    eor      w9, w9, w10
    strh     w9, [x11, #0x10]
    adrp     x9, #0x530000
    add      x9, x9, #0x8e
    ldrh     w10, [x9]
    mov      w11, #0x8e36
    eor      w10, w10, w11
    adrp     x11, #0x530000
    add      x11, x11, #0x98
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xf4f0
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xb21a
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x450e
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x91a5
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x530000
    add      x9, x9, #0xce
    ldrh     w10, [x9]
    mov      w11, #0xa6fe
    eor      w10, w10, w11
    adrp     x11, #0x530000
    add      x11, x11, #0xd8
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x342c
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x69cc
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x3aaa
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x2104
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x530000
    add      x9, x9, #0x82
    ldrh     w10, [x9]
    mov      w11, #0x8b4a
    eor      w10, w10, w11
    adrp     x11, #0x530000
    add      x11, x11, #0x88
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xb13
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x11a7
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe58]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe60]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x6f8]
    mov      x1, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0xe68]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    adrp     x27, #0x4c0000
    adrp     x26, #0x4be000
    cbz      x0, #0x297b24
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x24, x0
    b        #0x297b64
    ldr      x1, [x27, #0xe70]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x26, #0x358]
    adrp     x2, #0x530000
    add      x2, x2, #0x2d0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x530000
    add      x8, x8, #0x210
    adrp     x9, #0x530000
    add      x9, x9, #0x290
    cmp      w0, #0
    csel     x24, x9, x8, ne
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe78]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x1, x21
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x24, [x8, #0xb8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe80]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x22, [x27, #0xe70]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x1, [x26, #0x358]
    adrp     x2, #0x530000
    add      x2, x2, #0x2d0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x530000
    add      x8, x8, #0x1d0
    adrp     x9, #0x530000
    add      x9, x9, #0x250
    cmp      w0, #0
    csel     x8, x9, x8, ne
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0x620]
    stp      x23, x8, [sp]
    adrp     x2, #0x530000
    add      x2, x2, #0x190
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe88]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x21
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x23, [x8, #0x480]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe90]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe98]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xea0]
    mov      x0, x23
    mov      x2, x24
    mov      x3, x22
    mov      x4, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xea8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x297e20
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0xeb0]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x2, #0x530000
    add      x2, x2, #0x150
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x25, #0x4c4000
    ldr      x0, [x25, #0x90]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x8f8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x900]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x440]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x370]
    fmov     d3, #1.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x90]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3c0]
    adrp     x8, #0x491000
    ldr      d3, [x8, #0x4b8]
    fmov     d0, #1.00000000
    fmov     d2, #0.25000000
    mov      x1, x21
    b        #0x297f3c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xeb8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0xeb0]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    cbz      w24, #0x297f80
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x2, #0x530000
    add      x2, x2, #0x110
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x25, #0x4c4000
    ldr      x0, [x25, #0x90]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x8f8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x530]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x438]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x3e0]
    fmov     d3, #1.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x90]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x648]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x440]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x390]
    mov      x1, x21
    fmov     d3, d0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    b        #0x297f88
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    add      sp, sp, #0x70
    b        #0x461c9c // _objc_release

// -[WCLGGlassThemeCell thumb] IMP=0x297FB4 bounds=0x297FB4-0x297FC4
loc_297FB4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb50]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGGlassThemeCell setThumb:] IMP=0x297FC4 bounds=0x297FC4-0x297FD8
loc_297FC4:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb50]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGGlassThemeCell nameLabel] IMP=0x297FD8 bounds=0x297FD8-0x297FE8
loc_297FD8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb54]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGGlassThemeCell setNameLabel:] IMP=0x297FE8 bounds=0x297FE8-0x297FFC
loc_297FE8:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb54]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGGlassThemeCell subLabel] IMP=0x297FFC bounds=0x297FFC-0x29800C
loc_297FFC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb58]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGGlassThemeCell setSubLabel:] IMP=0x29800C bounds=0x29800C-0x298020
loc_29800C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb58]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGGlassThemeCell verLabel] IMP=0x298020 bounds=0x298020-0x298030
loc_298020:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb5c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGGlassThemeCell setVerLabel:] IMP=0x298030 bounds=0x298030-0x298044
loc_298030:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb5c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGGlassThemeCell statusChip] IMP=0x298044 bounds=0x298044-0x298054
loc_298044:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb60]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGGlassThemeCell setStatusChip:] IMP=0x298054 bounds=0x298054-0x298068
loc_298054:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb60]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGGlassThemeCell chevron] IMP=0x298068 bounds=0x298068-0x298078
loc_298068:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb64]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGGlassThemeCell setChevron:] IMP=0x298078 bounds=0x298078-0x29808C
loc_298078:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb64]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGGlassThemeCell theme] IMP=0x29808C bounds=0x29808C-0x29809C
loc_29808C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb68]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGGlassThemeCell setTheme:] IMP=0x29809C bounds=0x29809C-0x2980B0
loc_29809C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb68]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGGlassThemeCell .cxx_destruct] IMP=0x2980B0 bounds=0x2980B0-0x298154
loc_2980B0:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb68]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb64]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb60]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb5c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb58]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb54]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb50]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
