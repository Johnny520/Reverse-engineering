// Exact ARM64 listing for WCLGThemeManageCell

// -[WCLGThemeManageCell initWithStyle:reuseIdentifier:] IMP=0x44F094 bounds=0x44F094-0x450530
loc_44F094:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    sub      sp, sp, #0x230
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x70]
    adrp     x8, #0x582000
    add      x8, x8, #0xc0c
    ldar     w9, [x8]
    cbnz     w9, #0x44f1d0
    adrp     x9, #0x578000
    add      x9, x9, #0x992
    ldrh     w10, [x9]
    mov      w11, #0xfc27
    eor      w10, w10, w11
    adrp     x11, #0x578000
    add      x11, x11, #0x99c
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x740b
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x309a
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xef
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xd3e0
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x578000
    add      x9, x9, #0x980
    ldrb     w10, [x9]
    mov      w11, #0xa6
    eor      w10, w10, w11
    adrp     x11, #0x578000
    add      x11, x11, #0x989
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x2f
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x2b
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x21
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #8
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x84
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0xd4
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0x64
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w9, [x9, #8]
    eor      w9, w9, #0x7e
    strb     w9, [x11, #8]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x9, sp
    sub      x8, x9, #0x10
    mov      sp, x8
    sub      x20, sp, #0xb0
    mov      sp, x20
    adrp     x10, #0x4c4000
    ldr      x10, [x10, #0x840]
    stp      x0, x10, [x9, #-0x10]
    adrp     x9, #0x4c0000
    ldr      x1, [x9, #0x7e0]
    mov      x0, x8
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x19, x0
    cbz      x0, #0x4504ec
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x20, [x29, #-0xe8]
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x460]
    mov      x0, x19
    mov      x1, x22
    stur     x22, [x29, #-0x78]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xdd8]
    mov      x0, x19
    mov      w2, #3
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x908]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x480]
    mov      x24, x8
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9c8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x28
    mov      x1, x22
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0xac8]
    mov      x0, x28
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xb48]
    fmov     d0, #15.00000000
    mov      x1, x25
    stur     x25, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    mov      x1, x26
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
    ldr      x0, [x24, #0x480]
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
    mov      x1, x26
    stur     x26, [x29, #-0xb8]
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
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      x0, x28
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x24, [x8, #0xde8]
    mov      x0, x28
    mov      x1, x24
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xaf0]
    stur     x1, [x29, #-0x90]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xb40]
    mov      x1, x23
    mov      x2, x28
    stur     x28, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x20, [x8, #0xf44]
    ldr      x8, [x19, x20]
    str      x0, [x19, x20]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x430]
    stur     x1, [x29, #-0x98]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    stur     x1, [x29, #-0xa8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x20]
    mov      x21, x20
    stur     x20, [x29, #-0x80]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    fmov     d0, #12.00000000
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x480]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x40]
    stur     x1, [x29, #-0xc8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xed8]
    stur     x1, [x29, #-0xc0]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x530]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x0, [x19, x21]
    ldur     x1, [x29, #-0x78]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x21]
    mov      x1, x24
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x21]
    mov      x0, x28
    mov      x1, x23
    mov      x28, x23
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    mov      x26, x27
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0xf48]
    ldr      x8, [x19, x9]
    str      x0, [x19, x9]
    mov      x23, x9
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d8, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    stur     x1, [x29, #-0xd0]
    fmov     d0, #16.00000000
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x19, x23]
    mov      x25, x23
    stur     x23, [x29, #-0x100]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xec8]
    mov      x1, x23
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x21, #0x4c4000
    ldr      x0, [x21, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x2f8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x19, x25]
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0xea8]
    mov      x1, x27
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x25]
    mov      x1, x24
    mov      x22, x24
    stur     x24, [x29, #-0xd8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x25]
    ldur     x24, [x29, #-0xa0]
    mov      x0, x24
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x25, [x8, #0xf4c]
    ldr      x8, [x19, x25]
    str      x0, [x19, x25]
    stur     x25, [x29, #-0xf0]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x800]
    fmov     d0, #12.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x19, x25]
    mov      x1, x23
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x21, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc18]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x19, x25]
    mov      x1, x27
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x25]
    mov      x1, x22
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x25]
    mov      x0, x24
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x20, [x8, #0xf50]
    ldr      x8, [x19, x20]
    str      x0, [x19, x20]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x20]
    mov      x21, x20
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    adrp     x2, #0x578000
    add      x2, x2, #0xa10
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    fmov     d0, #11.00000000
    ldur     x1, [x29, #-0xd0]
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x19, x21]
    mov      x1, x23
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x22, #0x4c4000
    ldr      x0, [x22, #0x480]
    ldur     x23, [x29, #-0xc8]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x19, x21]
    mov      x1, x27
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x22, #0x480]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3b0]
    ldur     x1, [x29, #-0xc0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x0, [x19, x21]
    ldur     x1, [x29, #-0x78]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    stur     x21, [x29, #-0x88]
    ldr      x0, [x19, x21]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1f8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x21]
    ldur     x1, [x29, #-0xb8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    fmov     d0, #9.00000000
    ldur     x1, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x21]
    ldur     x1, [x29, #-0xa8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x21]
    ldur     x23, [x29, #-0xd8]
    mov      x1, x23
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x21]
    mov      x0, x24
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461ba0 // _objc_alloc
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x80]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1d8]
    adrp     x2, #0x578000
    add      x2, x2, #0x9d0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x428]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x25, [x8, #0xf54]
    ldr      x8, [x19, x25]
    str      x0, [x19, x25]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xdf0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x19, x25]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc40]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x25]
    ldur     x1, [x29, #-0x98]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x25]
    mov      x1, x23
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x25]
    mov      x0, x24
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x488]
    sub      x9, x29, #0x68
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4c0000
    ldr      x28, [x8, #0xdf8]
    mov      x0, x24
    mov      x20, x24
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    stur     x0, [x29, #-0xb0]
    mov      x0, x19
    ldur     x24, [x29, #-0x90]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xa8]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    stur     x0, [x29, #-0xb8]
    adrp     x8, #0x4c0000
    ldr      x26, [x8, #0xe00]
    fmov     d0, #14.00000000
    mov      x0, x22
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xc0]
    ldur     x22, [x29, #-0xe8]
    str      x0, [x22]
    adrp     x8, #0x4c0000
    ldr      x27, [x8, #0xe08]
    mov      x0, x20
    mov      x1, x27
    stur     x27, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    stur     x0, [x29, #-0xd0]
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xc8]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    stur     x0, [x29, #-0xd8]
    fmov     d0, #-14.00000000
    mov      x0, x23
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xe0]
    str      x0, [x22, #8]
    adrp     x8, #0x4c0000
    ldr      x27, [x8, #0xe10]
    mov      x0, x20
    mov      x1, x27
    sub      x8, x29, #0xc0
    stur     x27, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    sub      x8, x29, #8
    stur     x0, [x8, #-0x100]
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xf8]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x10
    stur     x0, [x8, #-0x100]
    fmov     d0, #5.00000000
    mov      x0, x23
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x18
    stur     x0, [x8, #-0x100]
    str      x0, [x22, #0x10]
    adrp     x8, #0x4c0000
    ldr      x27, [x8, #0xe18]
    mov      x0, x20
    mov      x23, x20
    mov      x1, x27
    sub      x8, x29, #0x108
    stur     x27, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    sub      x8, x29, #0x28
    stur     x0, [x8, #-0x100]
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x20
    stur     x0, [x8, #-0x100]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x30
    stur     x0, [x8, #-0x100]
    fmov     d0, #-5.00000000
    mov      x0, x20
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x38
    stur     x0, [x8, #-0x100]
    str      x0, [x22, #0x18]
    ldur     x20, [x29, #-0x80]
    ldr      x0, [x19, x20]
    sub      x8, x29, #0x168
    stur     x28, [x8, #-0x100]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    sub      x8, x29, #0x40
    stur     x0, [x8, #-0x100]
    mov      x0, x23
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x48
    stur     x0, [x8, #-0x100]
    fmov     d0, #11.00000000
    mov      x0, x24
    mov      x1, x26
    mov      x28, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x50
    stur     x0, [x8, #-0x100]
    str      x0, [x22, #0x20]
    ldr      x0, [x19, x20]
    mov      x27, x20
    adrp     x8, #0x4c0000
    ldr      x24, [x8, #0xe20]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    sub      x8, x29, #0x58
    stur     x0, [x8, #-0x100]
    mov      x0, x23
    mov      x26, x23
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x60
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe28]
    stur     x1, [x29, #-0x98]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x70
    stur     x0, [x8, #-0x100]
    str      x0, [x22, #0x28]
    ldr      x0, [x19, x27]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe30]
    stur     x1, [x29, #-0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x78
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0xe38]
    mov      x8, #0x4049000000000000
    fmov     d8, x8
    mov      x1, x23
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x80
    stur     x0, [x8, #-0x100]
    str      x0, [x22, #0x30]
    ldr      x0, [x19, x27]
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xe40]
    mov      x1, x21
    sub      x8, x29, #0x130
    stur     x21, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x88
    stur     x0, [x8, #-0x100]
    mov      x1, x23
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x90
    stur     x0, [x8, #-0x100]
    str      x0, [x22, #0x38]
    ldr      x0, [x19, x25]
    ldur     x27, [x29, #-0x78]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    sub      x8, x29, #0x98
    stur     x0, [x8, #-0x100]
    mov      x0, x26
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0xa0
    stur     x0, [x8, #-0x100]
    fmov     d0, #-13.00000000
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xa8
    stur     x0, [x8, #-0x100]
    str      x0, [x22, #0x40]
    ldr      x0, [x19, x25]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    sub      x8, x29, #0xb0
    stur     x0, [x8, #-0x100]
    mov      x0, x26
    mov      x1, x24
    mov      x26, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0xb8
    stur     x0, [x8, #-0x100]
    mov      x0, x20
    ldur     x27, [x29, #-0x98]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xc8
    stur     x0, [x8, #-0x100]
    str      x0, [x22, #0x48]
    ldr      x0, [x19, x25]
    ldur     x1, [x29, #-0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xd0
    stur     x0, [x8, #-0x100]
    fmov     d0, #18.00000000
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xd8
    stur     x0, [x8, #-0x100]
    str      x0, [x22, #0x50]
    ldr      x0, [x19, x25]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xe0
    stur     x0, [x8, #-0x100]
    fmov     d0, #18.00000000
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xe8
    stur     x0, [x8, #-0x100]
    str      x0, [x22, #0x58]
    ldur     x21, [x29, #-0x88]
    ldr      x0, [x19, x21]
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    sub      x8, x29, #0xf0
    stur     x0, [x8, #-0x100]
    ldr      x0, [x19, x25]
    sub      x8, x29, #0x168
    ldur     x24, [x8, #-0x100]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0xf8
    stur     x0, [x8, #-0x100]
    fmov     d0, #-8.00000000
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x100
    stur     x0, [x8, #-0x100]
    str      x0, [x22, #0x60]
    ldr      x0, [x19, x21]
    sub      x8, x29, #0x188
    stur     x26, [x8, #-0x100]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    sub      x8, x29, #0x110
    stur     x0, [x8, #-0x100]
    ldur     x25, [x29, #-0xa0]
    mov      x0, x25
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x118
    stur     x0, [x8, #-0x100]
    mov      x0, x20
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x120
    stur     x0, [x8, #-0x100]
    str      x0, [x22, #0x68]
    ldr      x0, [x19, x21]
    ldur     x1, [x29, #-0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x90]
    mov      x8, #0x404d000000000000
    fmov     d0, x8
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x128
    stur     x0, [x8, #-0x100]
    str      x0, [x22, #0x70]
    ldr      x0, [x19, x21]
    sub      x8, x29, #0x130
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x130
    stur     x0, [x8, #-0x100]
    fmov     d0, #20.00000000
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x138
    stur     x0, [x8, #-0x100]
    str      x0, [x22, #0x78]
    ldur     x20, [x29, #-0x100]
    ldr      x0, [x19, x20]
    mov      x27, x24
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    sub      x8, x29, #0x140
    stur     x0, [x8, #-0x100]
    ldp      x8, x23, [x29, #-0x80]
    ldr      x0, [x19, x8]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    stur     x0, [x29, #-0x80]
    fmov     d0, #12.00000000
    mov      x0, x24
    mov      x26, x28
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x148
    stur     x0, [x8, #-0x100]
    str      x0, [x22, #0x80]
    ldr      x0, [x19, x20]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    sub      x8, x29, #0x150
    stur     x0, [x8, #-0x100]
    ldr      x0, [x19, x21]
    mov      x1, x27
    mov      x28, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x158
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x4c0000
    ldr      x27, [x8, #0xe48]
    fmov     d0, #-8.00000000
    mov      x0, x23
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x160
    stur     x0, [x8, #-0x100]
    str      x0, [x22, #0x88]
    ldr      x0, [x19, x20]
    sub      x8, x29, #0x108
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    sub      x8, x29, #0x108
    stur     x0, [x8, #-0x100]
    mov      x0, x25
    sub      x8, x29, #0x188
    ldur     x24, [x8, #-0x100]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    sub      x8, x29, #0x170
    stur     x0, [x8, #-0x100]
    fmov     d0, #-2.00000000
    mov      x0, x23
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x178
    stur     x0, [x8, #-0x100]
    str      x0, [x22, #0x90]
    ldur     x23, [x29, #-0xf0]
    ldr      x0, [x19, x23]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    sub      x8, x29, #0x180
    stur     x0, [x8, #-0x100]
    ldr      x0, [x19, x20]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    stur     x0, [x29, #-0x100]
    mov      x0, x21
    ldur     x1, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x98]
    str      x0, [x22, #0x98]
    ldr      x0, [x19, x23]
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldur     x8, [x29, #-0x88]
    ldr      x0, [x19, x8]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    fmov     d0, #-8.00000000
    mov      x0, x20
    mov      x1, x27
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    str      x0, [x22, #0xa0]
    ldr      x0, [x19, x23]
    sub      x8, x29, #0xc0
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x25
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    fmov     d0, #3.00000000
    mov      x0, x23
    mov      x1, x26
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    str      x0, [x22, #0xa8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    mov      x2, x22
    mov      w3, #0x16
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe50]
    sub      x8, x29, #0x68
    ldur     x0, [x8, #-0x100]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x98]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x100]
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
    sub      x8, x29, #0x108
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
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x140
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x138
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x130
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x128
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x90]
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
    sub      x8, x29, #0x90
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
    sub      x8, x29, #0x60
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x58
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x50
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x48
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x40
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x38
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x30
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x20
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x28
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x18
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x10
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xf8]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xe0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xd8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xc8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xd0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xc0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x70]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x45052c
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

// -[WCLGThemeManageCell configureWithItem:active:] IMP=0x450530 bounds=0x450530-0x450A60
loc_450530:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    str      w3, [sp, #0x2c]
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xc10
    ldar     w9, [x8]
    cbnz     w9, #0x45074c
    adrp     x9, #0x578000
    add      x9, x9, #0xa92
    ldrb     w10, [x9]
    mov      w11, #0xa6
    adrp     x12, #0x578000
    add      x12, x12, #0xa99
    eor      w10, w10, w11
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    mov      w11, #0xb5
    eor      w10, w10, w11
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    mov      w11, #0xb3
    eor      w10, w10, w11
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    mov      w11, #0xb
    eor      w10, w10, w11
    strb     w10, [x12, #3]
    ldrb     w10, [x9, #4]
    mov      w11, #0x9d
    eor      w10, w10, w11
    strb     w10, [x12, #4]
    ldrb     w10, [x9, #5]
    mov      w11, #0xb9
    eor      w10, w10, w11
    strb     w10, [x12, #5]
    ldrb     w9, [x9, #6]
    mov      w10, #0xa4
    eor      w9, w9, w10
    strb     w9, [x12, #6]
    adrp     x9, #0x578000
    add      x9, x9, #0xa60
    ldrh     w10, [x9]
    mov      w11, #0x566a
    eor      w10, w10, w11
    adrp     x11, #0x578000
    add      x11, x11, #0xa80
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xa5a8
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xb41e
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xf7d2
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x823
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0x4ca4
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0x4b6c
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w10, [x9, #0xe]
    mov      w12, #0x2328
    eor      w10, w10, w12
    strh     w10, [x11, #0xe]
    ldrh     w9, [x9, #0x10]
    mov      w10, #0xf06a
    eor      w9, w9, w10
    strh     w9, [x11, #0x10]
    adrp     x9, #0x578000
    add      x9, x9, #0xa44
    ldrh     w10, [x9]
    mov      w11, #0x624
    adrp     x12, #0x578000
    add      x12, x12, #0xa4e
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0xa99e
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0xac
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x123c
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x4c1c
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    adrp     x9, #0x578000
    add      x9, x9, #0xa30
    ldrh     w10, [x9]
    mov      w11, #0x35b7
    adrp     x12, #0x578000
    add      x12, x12, #0xa3a
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x2fb5
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x49b3
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x4ce7
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xbaa3
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x308]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    str      x1, [sp, #0x18]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x310]
    mov      x0, x20
    str      x1, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x430]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe60]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x6f8]
    mov      x1, x26
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe70]
    mov      x0, x19
    str      x1, [sp, #0x10]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    adrp     x2, #0x578000
    add      x2, x2, #0xb80
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x578000
    add      x8, x8, #0xac0
    adrp     x9, #0x578000
    add      x9, x9, #0xb00
    cmp      w0, #0
    csel     x23, x9, x8, ne
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x22, [x8, #0xb8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe80]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4c0000
    ldr      x24, [x8, #0xe68]
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    cbz      x0, #0x4508f8
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    b        #0x4508fc
    mov      x24, x23
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    stp      x27, x24, [sp]
    adrp     x2, #0x578000
    add      x2, x2, #0xb40
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x318]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x1, x26
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbz      x21, #0x450968
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x320]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      w8, [sp, #0x2c]
    eor      w2, w8, #1
    ldr      x1, [sp, #0x18]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0x480]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe90]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x19
    ldr      x1, [sp, #0x10]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x20
    ldr      x1, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xea0]
    mov      x0, x21
    mov      x2, x22
    mov      x3, x24
    mov      x4, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    b        #0x461c9c // _objc_release

// -[WCLGThemeManageCell configureNoneForType:active:] IMP=0x450A60 bounds=0x450A60-0x451088
loc_450A60:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x20, x3
    mov      x21, x2
    mov      x19, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xc14
    ldar     w9, [x8]
    cbnz     w9, #0x450dfc
    adrp     x9, #0x578000
    add      x9, x9, #0xc10
    ldrh     w10, [x9]
    mov      w11, #0x483a
    eor      w10, w10, w11
    adrp     x11, #0x578000
    add      x11, x11, #0xc30
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x98e1
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x97dc
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xb344
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0xc0d3
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0x54b6
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0xe9f4
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w10, [x9, #0xe]
    mov      w12, #0xf22d
    eor      w10, w10, w12
    strh     w10, [x11, #0xe]
    ldrh     w10, [x9, #0x10]
    mov      w12, #0x8ef9
    eor      w10, w10, w12
    strh     w10, [x11, #0x10]
    ldrh     w9, [x9, #0x12]
    mov      w10, #0x6b74
    eor      w9, w9, w10
    adrp     x10, #0x578000
    add      x10, x10, #0xbd0
    strh     w9, [x11, #0x12]
    ldrh     w9, [x10]
    mov      w11, #0x7f98
    eor      w9, w9, w11
    adrp     x11, #0x578000
    add      x11, x11, #0xbf0
    strh     w9, [x11]
    ldrh     w9, [x10, #2]
    mov      w12, #0x338f
    eor      w9, w9, w12
    strh     w9, [x11, #2]
    ldrh     w9, [x10, #4]
    mov      w12, #0x6068
    eor      w9, w9, w12
    strh     w9, [x11, #4]
    ldrh     w9, [x10, #6]
    mov      w12, #0xa5e7
    eor      w9, w9, w12
    strh     w9, [x11, #6]
    ldrh     w9, [x10, #8]
    mov      w12, #0xc369
    eor      w9, w9, w12
    strh     w9, [x11, #8]
    ldrh     w9, [x10, #0xa]
    mov      w12, #0xe039
    eor      w9, w9, w12
    strh     w9, [x11, #0xa]
    ldrh     w9, [x10, #0xc]
    mov      w12, #0x1672
    eor      w9, w9, w12
    strh     w9, [x11, #0xc]
    ldrh     w9, [x10, #0xe]
    mov      w12, #0xb07c
    eor      w9, w9, w12
    strh     w9, [x11, #0xe]
    ldrh     w9, [x10, #0x10]
    mov      w12, #0xa9a7
    eor      w9, w9, w12
    strh     w9, [x11, #0x10]
    ldrh     w9, [x10, #0x12]
    mov      w10, #0x832d
    eor      w9, w9, w10
    strh     w9, [x11, #0x12]
    adrp     x10, #0x578000
    add      x10, x10, #0xc44
    ldrb     w9, [x10]
    adrp     x11, #0x578000
    add      x11, x11, #0xc4b
    eor      w9, w9, #0x44444444
    strb     w9, [x11]
    ldrb     w9, [x10, #1]
    eor      w9, w9, #0xf8
    strb     w9, [x11, #1]
    ldrb     w12, [x10, #2]
    mov      w9, #0x37
    eor      w12, w12, w9
    strb     w12, [x11, #2]
    ldrb     w12, [x10, #3]
    mov      w13, #0x7d
    eor      w12, w12, w13
    strb     w12, [x11, #3]
    ldrb     w12, [x10, #4]
    mov      w13, #0xbe
    eor      w12, w12, w13
    strb     w12, [x11, #4]
    ldrb     w12, [x10, #5]
    eor      w12, w12, #2
    strb     w12, [x11, #5]
    ldrb     w10, [x10, #6]
    mov      w12, #0x1d
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    adrp     x10, #0x578000
    add      x10, x10, #0xbba
    ldrb     w11, [x10]
    eor      w11, w11, #0xcccccccc
    adrp     x12, #0x578000
    add      x12, x12, #0xbc4
    strb     w11, [x12]
    ldrb     w11, [x10, #1]
    mov      w13, #0x6a
    eor      w11, w11, w13
    strb     w11, [x12, #1]
    ldrb     w11, [x10, #2]
    mov      w13, #0x69
    eor      w11, w11, w13
    strb     w11, [x12, #2]
    ldrb     w11, [x10, #3]
    mov      w13, #0xc6
    eor      w11, w11, w13
    strb     w11, [x12, #3]
    ldrb     w11, [x10, #4]
    eor      w11, w11, #0x3c
    strb     w11, [x12, #4]
    ldrb     w11, [x10, #5]
    mov      w13, #0xa
    eor      w11, w11, w13
    strb     w11, [x12, #5]
    ldrb     w11, [x10, #6]
    mov      w13, #0xca
    eor      w11, w11, w13
    strb     w11, [x12, #6]
    ldrb     w11, [x10, #7]
    eor      w11, w11, #6
    strb     w11, [x12, #7]
    ldrb     w11, [x10, #8]
    eor      w11, w11, #0x55555555
    strb     w11, [x12, #8]
    ldrb     w10, [x10, #9]
    mov      w11, #0xe8
    eor      w10, w10, w11
    strb     w10, [x12, #9]
    adrp     x10, #0x578000
    add      x10, x10, #0xc52
    ldrh     w11, [x10]
    mov      w12, #0x87b0
    eor      w11, w11, w12
    adrp     x12, #0x578000
    add      x12, x12, #0xc56
    strh     w11, [x12]
    ldrh     w10, [x10, #2]
    mov      w11, #0x7ead
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    adrp     x10, #0x578000
    add      x10, x10, #0xba0
    ldrb     w11, [x10]
    eor      w11, w11, #0xfffffff7
    adrp     x12, #0x578000
    add      x12, x12, #0xbad
    strb     w11, [x12]
    ldrb     w11, [x10, #1]
    eor      w11, w11, #0xffffff83
    strb     w11, [x12, #1]
    ldrb     w11, [x10, #2]
    mov      w13, #0x19
    eor      w11, w11, w13
    strb     w11, [x12, #2]
    ldrb     w11, [x10, #3]
    mov      w13, #0x6b
    eor      w11, w11, w13
    strb     w11, [x12, #3]
    ldrb     w11, [x10, #4]
    mov      w13, #0x86
    eor      w11, w11, w13
    strb     w11, [x12, #4]
    ldrb     w11, [x10, #5]
    mov      w13, #0x5f
    eor      w11, w11, w13
    strb     w11, [x12, #5]
    ldrb     w11, [x10, #6]
    eor      w11, w11, #0xc
    strb     w11, [x12, #6]
    ldrb     w11, [x10, #7]
    eor      w9, w11, w9
    strb     w9, [x12, #7]
    ldrb     w9, [x10, #8]
    eor      w9, w9, #1
    strb     w9, [x12, #8]
    ldrb     w9, [x10, #9]
    mov      w11, #0xa0
    eor      w9, w9, w11
    strb     w9, [x12, #9]
    ldrb     w9, [x10, #0xa]
    mov      w11, #0x34
    eor      w9, w9, w11
    strb     w9, [x12, #0xa]
    ldrb     w9, [x10, #0xb]
    eor      w9, w9, #0x44444444
    strb     w9, [x12, #0xb]
    ldrb     w9, [x10, #0xc]
    mov      w10, #0xf5
    eor      w9, w9, w10
    strb     w9, [x12, #0xc]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c3000
    ldr      x22, [x8, #0x308]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x9b0]
    mov      x1, x22
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe60]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x6f8]
    adrp     x2, #0x578000
    add      x2, x2, #0xdc0
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    adrp     x2, #0x578000
    add      x2, x2, #0xd80
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x578000
    add      x8, x8, #0xcc0
    adrp     x9, #0x578000
    add      x9, x9, #0xd00
    cmp      w23, #0
    csel     x21, x9, x8, ne
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x318]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x24
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x320]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    eor      w2, w20, #1
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x20, [x8, #0x310]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x348]
    adrp     x2, #0x578000
    add      x2, x2, #0xd40
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x430]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x480]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x40]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc40]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x210]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1c8]
    fmov     d0, #24.00000000
    mov      w2, #5
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x80]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1d0]
    adrp     x2, #0x578000
    add      x2, x2, #0xc80
    mov      x3, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461c9c // _objc_release

// -[WCLGThemeManageCell themeIconView] IMP=0x451088 bounds=0x451088-0x451098
loc_451088:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf44]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeManageCell setThemeIconView:] IMP=0x451098 bounds=0x451098-0x4510AC
loc_451098:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf44]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeManageCell nameLabel] IMP=0x4510AC bounds=0x4510AC-0x4510BC
loc_4510AC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf48]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeManageCell setNameLabel:] IMP=0x4510BC bounds=0x4510BC-0x4510D0
loc_4510BC:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf48]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeManageCell detailLabel] IMP=0x4510D0 bounds=0x4510D0-0x4510E0
loc_4510D0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf4c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeManageCell setDetailLabel:] IMP=0x4510E0 bounds=0x4510E0-0x4510F4
loc_4510E0:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf4c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeManageCell activeLabel] IMP=0x4510F4 bounds=0x4510F4-0x451104
loc_4510F4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf50]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeManageCell setActiveLabel:] IMP=0x451104 bounds=0x451104-0x451118
loc_451104:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf50]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeManageCell menuIconView] IMP=0x451118 bounds=0x451118-0x451128
loc_451118:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf54]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeManageCell setMenuIconView:] IMP=0x451128 bounds=0x451128-0x45113C
loc_451128:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf54]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeManageCell .cxx_destruct] IMP=0x45113C bounds=0x45113C-0x4511B8
loc_45113C:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf54]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf50]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf4c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf48]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf44]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
