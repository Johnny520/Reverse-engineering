// Exact ARM64 listing for WCLGFuncCardPanelView

// +[WCLGFuncCardPanelView metricDefinitions] IMP=0x2DC240 bounds=0x2DC240-0x2DD6F8
loc_2DC240:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    sub      sp, sp, #0x180
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x70]
    adrp     x8, #0x580000
    add      x8, x8, #0x280
    ldar     w9, [x8]
    cbnz     w9, #0x2dc8b0
    adrp     x10, #0x53e000
    add      x10, x10, #0x160
    ldrb     w11, [x10]
    mov      w9, #0xa3
    eor      w11, w11, w9
    adrp     x12, #0x53e000
    add      x12, x12, #0x164
    strb     w11, [x12]
    ldrb     w11, [x10, #1]
    eor      w11, w11, #0x88888888
    strb     w11, [x12, #1]
    ldrb     w11, [x10, #2]
    mov      w13, #0x3b
    eor      w11, w11, w13
    strb     w11, [x12, #2]
    ldrb     w10, [x10, #3]
    mov      w11, #0xac
    eor      w10, w10, w11
    strb     w10, [x12, #3]
    adrp     x10, #0x53e000
    add      x10, x10, #0x154
    ldrb     w11, [x10]
    eor      w11, w11, #0x1c
    adrp     x12, #0x53e000
    add      x12, x12, #0x15a
    strb     w11, [x12]
    ldrb     w11, [x10, #1]
    mov      w13, #0x17
    eor      w11, w11, w13
    strb     w11, [x12, #1]
    ldrb     w11, [x10, #2]
    mov      w13, #0x53
    eor      w11, w11, w13
    strb     w11, [x12, #2]
    ldrb     w11, [x10, #3]
    mov      w13, #0x8d
    eor      w11, w11, w13
    strb     w11, [x12, #3]
    ldrb     w11, [x10, #4]
    eor      w11, w11, #0xc0
    strb     w11, [x12, #4]
    ldrb     w10, [x10, #5]
    eor      w10, w10, #0xcccccccc
    strb     w10, [x12, #5]
    adrp     x10, #0x53e000
    add      x10, x10, #0x14a
    ldrb     w11, [x10]
    mov      w12, #0xec
    eor      w11, w11, w12
    adrp     x12, #0x53e000
    add      x12, x12, #0x14f
    strb     w11, [x12]
    ldrb     w11, [x10, #1]
    eor      w11, w11, #0xfffffff1
    strb     w11, [x12, #1]
    ldrb     w11, [x10, #2]
    eor      w11, w11, #0xffffffe3
    strb     w11, [x12, #2]
    ldrb     w11, [x10, #3]
    mov      w13, #0xf2
    eor      w11, w11, w13
    strb     w11, [x12, #3]
    ldrb     w10, [x10, #4]
    mov      w11, #0x57
    eor      w10, w10, w11
    strb     w10, [x12, #4]
    adrp     x10, #0x53e000
    add      x10, x10, #0x13a
    ldrb     w11, [x10]
    mov      w12, #0x3d
    eor      w11, w11, w12
    adrp     x12, #0x53e000
    add      x12, x12, #0x13e
    strb     w11, [x12]
    ldrb     w11, [x10, #1]
    eor      w11, w11, #0xfc
    strb     w11, [x12, #1]
    ldrb     w11, [x10, #2]
    mov      w13, #0xba
    eor      w11, w11, w13
    strb     w11, [x12, #2]
    ldrb     w10, [x10, #3]
    eor      w10, w10, #0x33333333
    strb     w10, [x12, #3]
    adrp     x10, #0x53e000
    add      x10, x10, #0x118
    ldrb     w11, [x10]
    mov      w12, #0x46
    eor      w11, w11, w12
    adrp     x12, #0x53e000
    add      x12, x12, #0x11f
    strb     w11, [x12]
    ldrb     w11, [x10, #1]
    mov      w13, #0x21
    eor      w11, w11, w13
    strb     w11, [x12, #1]
    ldrb     w11, [x10, #2]
    mov      w13, #0xf6
    eor      w11, w11, w13
    strb     w11, [x12, #2]
    ldrb     w11, [x10, #3]
    mov      w13, #0xc5
    eor      w11, w11, w13
    strb     w11, [x12, #3]
    ldrb     w11, [x10, #4]
    mov      w13, #0x7a
    eor      w11, w11, w13
    strb     w11, [x12, #4]
    ldrb     w11, [x10, #5]
    eor      w11, w11, #0xfffffffd
    strb     w11, [x12, #5]
    ldrb     w10, [x10, #6]
    eor      w10, w10, #0xe0
    strb     w10, [x12, #6]
    adrp     x10, #0x53e000
    add      x10, x10, #0x126
    ldrh     w11, [x10]
    mov      w12, #0x7db4
    eor      w11, w11, w12
    adrp     x12, #0x53e000
    add      x12, x12, #0x130
    strh     w11, [x12]
    ldrh     w11, [x10, #2]
    mov      w13, #0x8fce
    eor      w11, w11, w13
    strh     w11, [x12, #2]
    ldrh     w11, [x10, #4]
    mov      w13, #0x5bfc
    eor      w11, w11, w13
    strh     w11, [x12, #4]
    ldrh     w11, [x10, #6]
    mov      w13, #0x7076
    eor      w11, w11, w13
    strh     w11, [x12, #6]
    ldrh     w10, [x10, #8]
    mov      w11, #0x1107
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    adrp     x10, #0x53e000
    add      x10, x10, #0x104
    ldrh     w11, [x10]
    mov      w12, #0x48d0
    eor      w11, w11, w12
    adrp     x12, #0x53e000
    add      x12, x12, #0x10e
    strh     w11, [x12]
    ldrh     w11, [x10, #2]
    mov      w13, #0xafe2
    eor      w11, w11, w13
    strh     w11, [x12, #2]
    ldrh     w11, [x10, #4]
    mov      w13, #0xf42c
    eor      w11, w11, w13
    strh     w11, [x12, #4]
    ldrh     w11, [x10, #6]
    mov      w13, #0xd52e
    eor      w11, w11, w13
    strh     w11, [x12, #6]
    ldrh     w10, [x10, #8]
    mov      w11, #0x9a35
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    adrp     x10, #0x53e000
    add      x10, x10, #0xf0
    ldrh     w11, [x10]
    mov      w12, #0x387e
    eor      w11, w11, w12
    adrp     x12, #0x53e000
    add      x12, x12, #0xfa
    strh     w11, [x12]
    ldrh     w11, [x10, #2]
    mov      w13, #0xd4ca
    eor      w11, w11, w13
    strh     w11, [x12, #2]
    ldrh     w11, [x10, #4]
    mov      w13, #0x63d1
    eor      w11, w11, w13
    strh     w11, [x12, #4]
    ldrh     w11, [x10, #6]
    mov      w13, #0x8e8b
    eor      w11, w11, w13
    strh     w11, [x12, #6]
    ldrh     w10, [x10, #8]
    mov      w11, #0x6a5b
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    adrp     x10, #0x53e000
    add      x10, x10, #0xdc
    ldrh     w11, [x10]
    mov      w12, #0x28a5
    eor      w11, w11, w12
    adrp     x12, #0x53e000
    add      x12, x12, #0xe6
    strh     w11, [x12]
    ldrh     w11, [x10, #2]
    mov      w13, #0x841
    eor      w11, w11, w13
    strh     w11, [x12, #2]
    ldrh     w11, [x10, #4]
    mov      w13, #0x90b8
    eor      w11, w11, w13
    strh     w11, [x12, #4]
    ldrh     w11, [x10, #6]
    mov      w13, #0x6999
    eor      w11, w11, w13
    strh     w11, [x12, #6]
    ldrh     w10, [x10, #8]
    mov      w11, #0x2d6a
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    adrp     x10, #0x53e000
    add      x10, x10, #0x60
    ldrh     w11, [x10]
    mov      w12, #0x3a97
    eor      w11, w11, w12
    adrp     x12, #0x53e000
    add      x12, x12, #0x66
    strh     w11, [x12]
    ldrh     w11, [x10, #2]
    mov      w13, #0x4e67
    eor      w11, w11, w13
    strh     w11, [x12, #2]
    ldrh     w10, [x10, #4]
    mov      w11, #0x435a
    eor      w10, w10, w11
    adrp     x11, #0x53e000
    add      x11, x11, #0xd0
    strh     w10, [x12, #4]
    ldrb     w10, [x11]
    eor      w9, w10, w9
    adrp     x10, #0x53e000
    add      x10, x10, #0xd4
    strb     w9, [x10]
    ldrb     w9, [x11, #1]
    strb     w9, [x10, #1]
    ldrb     w9, [x11, #2]
    mov      w12, #0x85
    eor      w9, w9, w12
    strb     w9, [x10, #2]
    ldrb     w9, [x11, #3]
    mov      w11, #0x8e
    eor      w9, w9, w11
    strb     w9, [x10, #3]
    adrp     x9, #0x53e000
    add      x9, x9, #0x6c
    ldrh     w10, [x9]
    mov      w11, #0x6567
    eor      w10, w10, w11
    adrp     x11, #0x53e000
    add      x11, x11, #0x76
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xce78
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xa9fe
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x3cd4
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xfd5d
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x53e000
    add      x9, x9, #0xa8
    ldrh     w10, [x9]
    mov      w11, #0xbd00
    eor      w10, w10, w11
    adrp     x11, #0x53e000
    add      x11, x11, #0xb2
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x6ba9
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xf4f1
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xbbd
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x3ec3
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x53e000
    add      x9, x9, #0x142
    ldrb     w10, [x9]
    mov      w11, #0x2c
    eor      w10, w10, w11
    adrp     x11, #0x53e000
    add      x11, x11, #0x146
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x67
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x1d
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w9, [x9, #3]
    mov      w10, #0xb1
    eor      w9, w9, w10
    strb     w9, [x11, #3]
    adrp     x9, #0x53e000
    add      x9, x9, #0xd8
    ldrb     w10, [x9]
    mov      w11, #0x5a
    adrp     x12, #0x53e000
    add      x12, x12, #0xda
    eor      w10, w10, w11
    strb     w10, [x12]
    ldrb     w9, [x9, #1]
    mov      w10, #0xd0
    eor      w9, w9, w10
    strb     w9, [x12, #1]
    adrp     x9, #0x53e000
    add      x9, x9, #0xbc
    ldrh     w10, [x9]
    mov      w11, #0x603e
    adrp     x12, #0x53e000
    add      x12, x12, #0xc6
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x22c0
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0xaf28
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0xbfb0
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xfaeb
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    adrp     x9, #0x53e000
    add      x9, x9, #0x94
    ldrh     w10, [x9]
    mov      w11, #0xc49c
    adrp     x12, #0x53e000
    add      x12, x12, #0x9e
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x9017
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x7557
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x4004
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xb618
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    adrp     x9, #0x53e000
    add      x9, x9, #0x80
    ldrh     w10, [x9]
    mov      w11, #0x36e6
    adrp     x12, #0x53e000
    add      x12, x12, #0x8a
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x8f15
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x4112
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0xc210
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xfd03
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x8, sp
    sub      x9, x29, #0xd8
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x50
    stur     x8, [x29, #-0x88]
    mov      sp, x8
    mov      x24, sp
    sub      x8, x24, #0x30
    stur     x8, [x29, #-0x98]
    mov      sp, x8
    mov      x25, sp
    sub      x23, x25, #0x30
    mov      sp, x23
    mov      x28, sp
    sub      x8, x28, #0x30
    stur     x8, [x29, #-0xb8]
    mov      sp, x8
    mov      x27, sp
    sub      x8, x27, #0x30
    stur     x8, [x29, #-0xd0]
    mov      sp, x8
    mov      x26, sp
    sub      x8, x26, #0x30
    sub      x9, x29, #8
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x19, sp
    sub      x8, x19, #0x30
    sub      x9, x29, #0x18
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x78
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x30
    sub      x9, x29, #0x50
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x21, sp
    sub      x8, x21, #0x30
    sub      x9, x29, #0x70
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0xc8
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x30
    sub      x9, x29, #0xa8
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0xd0
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x30
    sub      x9, x29, #0xb8
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0xb0
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x30
    sub      x9, x29, #0x88
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0xc0
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x30
    sub      x9, x29, #0x90
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x80
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x30
    sub      x9, x29, #0x58
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x98
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x30
    sub      x9, x29, #0x60
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x48
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x30
    sub      x9, x29, #0x20
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x68
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x30
    sub      x9, x29, #0x28
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x10
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x30
    stur     x8, [x29, #-0xe8]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x30
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x30
    stur     x8, [x29, #-0xf0]
    mov      sp, x8
    mov      x8, sp
    stur     x8, [x29, #-0xe0]
    sub      x8, x8, #0x30
    stur     x8, [x29, #-0xc0]
    mov      sp, x8
    mov      x8, sp
    stur     x8, [x29, #-0xf8]
    sub      x8, x8, #0x30
    stur     x8, [x29, #-0xc8]
    mov      sp, x8
    adrp     x9, #0x53e000
    add      x9, x9, #0x5d0
    adrp     x8, #0x4a3000
    add      x8, x8, #0xef0
    ldr      x8, [x8]
    adrp     x10, #0x53e000
    add      x10, x10, #0x590
    stp      x9, x10, [x25, #-0x30]
    adrp     x9, #0x53e000
    add      x9, x9, #0x4d0
    adrp     x10, #0x53e000
    add      x10, x10, #0x450
    stp      x8, x9, [x24, #-0x30]
    stur     x10, [x25, #-0x20]
    adrp     x20, #0x4c4000
    ldr      x0, [x20, #0xa8]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x498]
    mov      x8, #0x4044000000000000
    fmov     d0, x8
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x78]
    stur     x0, [x24, #-0x20]
    adrp     x8, #0x53e000
    add      x8, x8, #0x3d0
    stur     x8, [x25, #-0x18]
    ldr      x0, [x20, #0xa8]
    mov      x8, #0x4059000000000000
    fmov     d0, x8
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x80]
    stur     x0, [x24, #-0x18]
    adrp     x8, #0x53e000
    add      x8, x8, #0x510
    stur     x8, [x25, #-0x10]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #5.00000000
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x90]
    adrp     x8, #0x53e000
    add      x8, x8, #0x390
    stur     x8, [x25, #-8]
    adrp     x8, #0x53e000
    add      x8, x8, #0x490
    stp      x0, x8, [x24, #-0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x24, [x8, #0x108]
    mov      x1, x24
    ldur     x2, [x29, #-0x98]
    mov      x3, x23
    mov      w4, #6
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x98]
    sub      x8, x29, #0xd8
    ldur     x23, [x8, #-0x100]
    stur     x0, [x23, #-0x50]
    adrp     x8, #0x4a3000
    add      x8, x8, #0xef8
    ldr      x8, [x8]
    adrp     x9, #0x53e000
    add      x10, x9, #0x5d0
    adrp     x9, #0x53e000
    add      x9, x9, #0x590
    stp      x10, x9, [x27, #-0x30]
    adrp     x9, #0x53e000
    add      x9, x9, #0x410
    stp      x8, x9, [x28, #-0x30]
    adrp     x8, #0x53e000
    add      x8, x8, #0x450
    stur     x8, [x27, #-0x20]
    ldr      x0, [x20, #0xa8]
    mov      x8, #-0x3fa2000000000000
    fmov     d0, x8
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xa0]
    stur     x0, [x28, #-0x20]
    adrp     x25, #0x53e000
    add      x25, x25, #0x3d0
    stur     x25, [x27, #-0x18]
    ldr      x0, [x20, #0xa8]
    mov      x8, #0x405e000000000000
    fmov     d0, x8
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xa8]
    stur     x0, [x28, #-0x18]
    adrp     x8, #0x53e000
    add      x8, x8, #0x510
    stur     x8, [x27, #-0x10]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #4.00000000
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb0]
    adrp     x8, #0x53e000
    add      x8, x8, #0x390
    stur     x8, [x27, #-8]
    adrp     x8, #0x53e000
    add      x8, x8, #0x310
    stp      x0, x8, [x28, #-0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    mov      x28, x24
    mov      x1, x24
    ldur     x2, [x29, #-0xb8]
    ldur     x3, [x29, #-0xd0]
    mov      w4, #6
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb8]
    stur     x0, [x23, #-0x48]
    adrp     x8, #0x4a3000
    add      x8, x8, #0xf00
    ldr      x8, [x8]
    adrp     x27, #0x53e000
    add      x27, x27, #0x5d0
    adrp     x24, #0x53e000
    add      x24, x24, #0x590
    stp      x27, x24, [x19, #-0x30]
    adrp     x9, #0x53e000
    add      x9, x9, #0x550
    stp      x8, x9, [x26, #-0x30]
    adrp     x8, #0x53e000
    add      x8, x8, #0x450
    stur     x8, [x19, #-0x20]
    ldr      x0, [x20, #0xa8]
    mov      x8, #0x404e000000000000
    fmov     d0, x8
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xd0]
    stur     x0, [x26, #-0x20]
    stur     x25, [x19, #-0x18]
    ldr      x0, [x20, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x958]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xd8]
    stur     x0, [x26, #-0x18]
    adrp     x8, #0x53e000
    add      x8, x8, #0x510
    stur     x8, [x19, #-0x10]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #10.00000000
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x100]
    adrp     x8, #0x53e000
    add      x8, x8, #0x390
    stur     x8, [x19, #-8]
    adrp     x8, #0x53e000
    add      x8, x8, #0x310
    stp      x0, x8, [x26, #-0x10]
    adrp     x19, #0x4c4000
    ldr      x0, [x19, #0x208]
    mov      x1, x28
    sub      x8, x29, #8
    ldur     x2, [x8, #-0x100]
    sub      x8, x29, #0x18
    ldur     x3, [x8, #-0x100]
    mov      w4, #6
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #8
    stur     x0, [x8, #-0x100]
    stur     x0, [x23, #-0x40]
    mov      x25, x23
    adrp     x8, #0x4a3000
    add      x8, x8, #0xf08
    ldr      x8, [x8]
    stp      x27, x24, [x21, #-0x30]
    adrp     x9, #0x53e000
    add      x9, x9, #0x350
    sub      x10, x29, #0x78
    ldur     x10, [x10, #-0x100]
    stp      x8, x9, [x10, #-0x30]
    mov      x27, x10
    adrp     x24, #0x53e000
    add      x24, x24, #0x450
    stur     x24, [x21, #-0x20]
    ldr      x0, [x20, #0xa8]
    mov      x8, #-0x3f9c000000000000
    fmov     d0, x8
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x18
    stur     x0, [x8, #-0x100]
    stur     x0, [x27, #-0x20]
    adrp     x26, #0x53e000
    add      x26, x26, #0x3d0
    stur     x26, [x21, #-0x18]
    ldr      x0, [x20, #0xa8]
    mov      x8, #0x4064000000000000
    fmov     d0, x8
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x38
    stur     x0, [x8, #-0x100]
    stur     x0, [x27, #-0x18]
    adrp     x8, #0x53e000
    add      x8, x8, #0x510
    stur     x8, [x21, #-0x10]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #4.00000000
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x40
    stur     x0, [x8, #-0x100]
    adrp     x23, #0x53e000
    add      x23, x23, #0x390
    stur     x23, [x21, #-8]
    adrp     x8, #0x53e000
    add      x8, x8, #0x310
    stp      x0, x8, [x27, #-0x10]
    ldr      x0, [x19, #0x208]
    mov      x21, x28
    mov      x1, x28
    sub      x8, x29, #0x50
    ldur     x2, [x8, #-0x100]
    sub      x8, x29, #0x70
    ldur     x3, [x8, #-0x100]
    mov      w4, #6
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x50
    stur     x0, [x8, #-0x100]
    stur     x0, [x25, #-0x38]
    adrp     x8, #0x4a3000
    add      x8, x8, #0xf10
    ldr      x8, [x8]
    sub      x9, x29, #0xd0
    ldur     x27, [x9, #-0x100]
    adrp     x9, #0x53e000
    add      x10, x9, #0x5d0
    adrp     x9, #0x53e000
    add      x9, x9, #0x590
    stp      x10, x9, [x27, #-0x30]
    adrp     x9, #0x53e000
    add      x9, x9, #0x2d0
    sub      x10, x29, #0xc8
    ldur     x10, [x10, #-0x100]
    stp      x8, x9, [x10, #-0x30]
    mov      x28, x10
    stur     x24, [x27, #-0x20]
    ldr      x0, [x20, #0xa8]
    mov      x8, #0x4049000000000000
    fmov     d0, x8
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x70
    stur     x0, [x8, #-0x100]
    stur     x0, [x28, #-0x20]
    stur     x26, [x27, #-0x18]
    mov      x24, x26
    ldr      x0, [x20, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x8e8]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x78
    stur     x0, [x8, #-0x100]
    stur     x0, [x28, #-0x18]
    adrp     x8, #0x53e000
    add      x8, x8, #0x510
    stur     x8, [x27, #-0x10]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #5.00000000
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xa0
    stur     x0, [x8, #-0x100]
    stur     x23, [x27, #-8]
    adrp     x8, #0x53e000
    add      x8, x8, #0x490
    stp      x0, x8, [x28, #-0x10]
    ldr      x0, [x19, #0x208]
    mov      x1, x21
    sub      x8, x29, #0xa8
    ldur     x2, [x8, #-0x100]
    sub      x8, x29, #0xb8
    ldur     x3, [x8, #-0x100]
    mov      w4, #6
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xa8
    stur     x0, [x8, #-0x100]
    stur     x0, [x25, #-0x30]
    adrp     x8, #0x4a3000
    add      x8, x8, #0xf18
    ldr      x8, [x8]
    sub      x9, x29, #0xc0
    ldur     x11, [x9, #-0x100]
    adrp     x26, #0x53e000
    add      x26, x26, #0x5d0
    adrp     x27, #0x53e000
    add      x27, x27, #0x590
    stp      x26, x27, [x11, #-0x30]
    adrp     x9, #0x53e000
    add      x9, x9, #0x290
    sub      x10, x29, #0xb0
    ldur     x10, [x10, #-0x100]
    stp      x8, x9, [x10, #-0x30]
    mov      x19, x10
    adrp     x28, #0x53e000
    add      x28, x28, #0x450
    stur     x28, [x11, #-0x20]
    mov      x23, x11
    ldr      x0, [x20, #0xa8]
    fmov     d0, xzr
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xb8
    stur     x0, [x8, #-0x100]
    stur     x0, [x19, #-0x20]
    stur     x24, [x23, #-0x18]
    ldr      x0, [x20, #0xa8]
    mov      x8, #0x4045000000000000
    fmov     d0, x8
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xc8
    stur     x0, [x8, #-0x100]
    stur     x0, [x19, #-0x18]
    adrp     x24, #0x53e000
    add      x24, x24, #0x510
    stur     x24, [x23, #-0x10]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #1.00000000
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xd0
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x53e000
    add      x8, x8, #0x390
    stur     x8, [x23, #-8]
    adrp     x8, #0x53e000
    add      x8, x8, #0x310
    stp      x0, x8, [x19, #-0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    mov      x1, x21
    sub      x8, x29, #0x88
    ldur     x2, [x8, #-0x100]
    sub      x8, x29, #0x90
    ldur     x3, [x8, #-0x100]
    mov      w4, #6
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x88
    stur     x0, [x8, #-0x100]
    stur     x0, [x25, #-0x28]
    adrp     x8, #0x4a3000
    add      x8, x8, #0xf20
    ldr      x8, [x8]
    sub      x9, x29, #0x98
    ldur     x11, [x9, #-0x100]
    stp      x26, x27, [x11, #-0x30]
    adrp     x9, #0x53e000
    add      x9, x9, #0x210
    sub      x10, x29, #0x80
    ldur     x10, [x10, #-0x100]
    stp      x8, x9, [x10, #-0x30]
    mov      x19, x10
    stur     x28, [x11, #-0x20]
    mov      x23, x11
    ldr      x0, [x20, #0xa8]
    fmov     d0, xzr
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x90
    stur     x0, [x8, #-0x100]
    stur     x0, [x19, #-0x20]
    adrp     x27, #0x53e000
    add      x27, x27, #0x3d0
    stur     x27, [x23, #-0x18]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #8.00000000
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xb0
    stur     x0, [x8, #-0x100]
    stur     x0, [x19, #-0x18]
    stur     x24, [x23, #-0x10]
    ldr      x0, [x20, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x390]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xc0
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x53e000
    add      x8, x8, #0x390
    stur     x8, [x23, #-8]
    adrp     x8, #0x53e000
    add      x8, x8, #0x310
    stp      x0, x8, [x19, #-0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    mov      x1, x21
    sub      x8, x29, #0x58
    ldur     x2, [x8, #-0x100]
    sub      x8, x29, #0x60
    ldur     x3, [x8, #-0x100]
    mov      w4, #6
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x58
    stur     x0, [x8, #-0x100]
    stur     x0, [x25, #-0x20]
    adrp     x8, #0x4a3000
    add      x8, x8, #0xf38
    ldr      x8, [x8]
    sub      x9, x29, #0x68
    ldur     x11, [x9, #-0x100]
    adrp     x9, #0x53e000
    add      x9, x9, #0x590
    stp      x26, x9, [x11, #-0x30]
    adrp     x9, #0x53e000
    add      x9, x9, #0x1d0
    sub      x10, x29, #0x48
    ldur     x10, [x10, #-0x100]
    stp      x8, x9, [x10, #-0x30]
    mov      x19, x10
    stur     x28, [x11, #-0x20]
    mov      x23, x11
    ldr      x0, [x20, #0xa8]
    fmov     d0, xzr
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x60
    stur     x0, [x8, #-0x100]
    stur     x0, [x19, #-0x20]
    stur     x27, [x23, #-0x18]
    ldr      x0, [x20, #0xa8]
    mov      x8, #0x4048000000000000
    fmov     d0, x8
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x80
    stur     x0, [x8, #-0x100]
    stur     x0, [x19, #-0x18]
    stur     x24, [x23, #-0x10]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #2.00000000
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x98
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x53e000
    add      x8, x8, #0x390
    stur     x8, [x23, #-8]
    adrp     x8, #0x53e000
    add      x8, x8, #0x310
    stp      x0, x8, [x19, #-0x10]
    mov      x27, x8
    adrp     x19, #0x4c4000
    ldr      x0, [x19, #0x208]
    mov      x1, x21
    sub      x8, x29, #0x20
    ldur     x2, [x8, #-0x100]
    sub      x8, x29, #0x28
    ldur     x3, [x8, #-0x100]
    mov      w4, #6
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x20
    stur     x0, [x8, #-0x100]
    mov      x28, x25
    stur     x0, [x25, #-0x18]
    adrp     x8, #0x4a3000
    add      x8, x8, #0xf40
    ldr      x8, [x8]
    sub      x9, x29, #0x30
    ldur     x11, [x9, #-0x100]
    adrp     x9, #0x53e000
    add      x9, x9, #0x590
    stp      x26, x9, [x11, #-0x30]
    adrp     x9, #0x53e000
    add      x9, x9, #0x190
    sub      x10, x29, #0x10
    ldur     x10, [x10, #-0x100]
    stp      x8, x9, [x10, #-0x30]
    mov      x24, x10
    adrp     x8, #0x53e000
    add      x8, x8, #0x450
    stur     x8, [x11, #-0x20]
    mov      x25, x11
    ldr      x0, [x20, #0xa8]
    adrp     x8, #0x492000
    ldr      d8, [x8, #0x1a8]
    mov      x1, x22
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x28
    stur     x0, [x8, #-0x100]
    stur     x0, [x24, #-0x20]
    adrp     x26, #0x53e000
    add      x26, x26, #0x3d0
    stur     x26, [x25, #-0x18]
    ldr      x0, [x20, #0xa8]
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x8d0]
    mov      x1, x22
    fmov     d0, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x48
    stur     x0, [x8, #-0x100]
    stur     x0, [x24, #-0x18]
    adrp     x8, #0x53e000
    add      x8, x8, #0x510
    stur     x8, [x25, #-0x10]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #2.00000000
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x53e000
    add      x8, x8, #0x390
    stur     x8, [x25, #-8]
    stp      x0, x27, [x24, #-0x10]
    ldr      x0, [x19, #0x208]
    mov      x1, x21
    ldp      x3, x2, [x29, #-0xf0]
    mov      w4, #6
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    stur     x0, [x28, #-0x10]
    mov      x19, x28
    adrp     x8, #0x4a3000
    add      x8, x8, #0xf48
    ldr      x8, [x8]
    ldur     x11, [x29, #-0xf8]
    adrp     x9, #0x53e000
    add      x10, x9, #0x5d0
    adrp     x9, #0x53e000
    add      x9, x9, #0x590
    stp      x10, x9, [x11, #-0x30]
    adrp     x9, #0x53e000
    add      x9, x9, #0x250
    ldur     x10, [x29, #-0xe0]
    stp      x8, x9, [x10, #-0x30]
    mov      x27, x10
    adrp     x8, #0x53e000
    add      x8, x8, #0x450
    stur     x8, [x11, #-0x20]
    mov      x28, x11
    ldr      x0, [x20, #0xa8]
    mov      x1, x22
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    stur     x0, [x27, #-0x20]
    stur     x26, [x28, #-0x18]
    ldr      x0, [x20, #0xa8]
    mov      x1, x22
    fmov     d0, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    stur     x0, [x27, #-0x18]
    adrp     x8, #0x53e000
    add      x8, x8, #0x510
    stur     x8, [x28, #-0x10]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #2.00000000
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x53e000
    add      x8, x8, #0x390
    stur     x8, [x28, #-8]
    adrp     x8, #0x53e000
    add      x8, x8, #0x310
    stp      x0, x8, [x27, #-0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    mov      x1, x21
    ldp      x3, x2, [x29, #-0xc8]
    mov      w4, #6
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    stur     x0, [x19, #-8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    ldur     x2, [x29, #-0x88]
    mov      w3, #0xa
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x48
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x28
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x20
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x98
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x80
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x60
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x58
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xc0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xb0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x90
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x88
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
    sub      x8, x29, #0xa8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xa0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x78
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x70
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x50
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x40
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x38
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
    ldur     x0, [x29, #-0xd8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xd0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x98]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x90]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x78]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x70]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2dd6f4
    mov      x0, x19
    sub      sp, x29, #0x60
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    ldp      d9, d8, [sp], #0x70
    b        #0x461be8 // _objc_autoreleaseReturnValue
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGFuncCardPanelView initForWindow:] IMP=0x2DD6F8 bounds=0x2DD6F8-0x2DDB4C
loc_2DD6F8:
    sub      sp, sp, #0x80
    stp      d11, d10, [sp, #0x10]
    stp      d9, d8, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d2
    fmov     d10, d3
    mov      x8, #-0x3fbe000000000000
    fmov     d0, x8
    fadd     d0, d2, d0
    adrp     x8, #0x492000
    ldr      d1, [x8, #0x1b0]
    fcmp     d0, d1
    fcsel    d11, d1, d0, gt
    adrp     x26, #0x4c4000
    ldr      x0, [x26, #0x508]
    adrp     x8, #0x4c1000
    ldr      x21, [x8, #0x358]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    add      x23, x0, #6
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    scvtf    d0, x23
    mov      x8, #0x4043000000000000
    fmov     d1, x8
    fmul     d8, d0, d1
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x428]
    fmul     d0, d10, d0
    mov      x8, #0x4044000000000000
    fmov     d1, x8
    fadd     d1, d8, d1
    fmov     d2, #8.00000000
    fadd     d1, d1, d2
    fcmp     d1, d0
    fcsel    d3, d1, d0, mi
    fsub     d0, d9, d11
    fmov     d1, #0.50000000
    fmul     d0, d0, d1
    frintm   d0, d0
    fsub     d2, d10, d3
    fmul     d1, d2, d1
    frintm   d1, d1
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7a0]
    stp      x20, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    mov      x0, sp
    fmov     d2, d11
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x20, x0
    cbz      x0, #0x2ddb14
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x3f0]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x3f8]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    cbnz     x24, #0x2dd8a8
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x128]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    cmp      x24, #2
    cset     w2, eq
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9b0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x360]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x508]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x368]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x23, #0x4c4000
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xac8]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, #18.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x450]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac0]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbc0]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8c0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    adrp     x8, #0x492000
    ldr      s0, [x8, #0x1c8]
    adrp     x8, #0x492000
    ldr      s1, [x8, #0x1cc]
    fcsel    s9, s1, s0, ne
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb08]
    fmov     s0, s9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbc8]
    fmov     d0, #22.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbd0]
    fmov     d0, xzr
    fmov     d1, #10.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x370]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x378]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x380]
    mov      x0, x20
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x388]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    ldp      d11, d10, [sp, #0x10]
    add      sp, sp, #0x80
    ret      

// -[WCLGFuncCardPanelView primaryTextColor] IMP=0x2DDB4C bounds=0x2DDB4C-0x2DDBA8
loc_2DDB4C:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8c0]
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    adrp     x9, #0x4c4000
    ldr      x0, [x9, #0x90]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0xbf0]
    tbz      w8, #0, #0x2ddb88
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3e8]
    fmov     d0, #1.00000000
    b        #0x2ddb94
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x9d0]
    fmov     d1, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGFuncCardPanelView secondaryTextColor] IMP=0x2DDBA8 bounds=0x2DDBA8-0x2DDC04
loc_2DDBA8:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8c0]
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    adrp     x9, #0x4c4000
    ldr      x0, [x9, #0x90]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0xbf0]
    tbz      w8, #0, #0x2ddbe4
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x8b0]
    fmov     d0, #1.00000000
    b        #0x2ddbf0
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x728]
    fmov     d0, xzr
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGFuncCardPanelView separatorColor] IMP=0x2DDC04 bounds=0x2DDC04-0x2DDC60
loc_2DDC04:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8c0]
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    adrp     x9, #0x4c4000
    ldr      x0, [x9, #0x90]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0xbf0]
    tbz      w8, #0, #0x2ddc40
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x530]
    fmov     d0, #1.00000000
    b        #0x2ddc4c
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x460]
    fmov     d0, xzr
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGFuncCardPanelView buildBlurBackground] IMP=0x2DDC60 bounds=0x2DDC60-0x2DDEC8
loc_2DDC60:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x448]
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x8c0]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    adrp     x26, #0x4c4000
    ldr      x0, [x26, #0x90]
    adrp     x9, #0x4be000
    ldr      x21, [x9, #0xbf0]
    tbz      w8, #0, #0x2ddd00
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x8e0]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x438]
    b        #0x2ddd0c
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3f0]
    fmov     d0, #1.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x0, x20
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xac8]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, #18.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    mov      x0, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x628]
    ldr      x24, [x8]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb50]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb10]
    fmov     d0, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x26, #0x90]
    cmp      w0, #0
    adrp     x9, #0x491000
    ldr      d0, [x9, #0x540]
    adrp     x9, #0x491000
    ldr      d1, [x9, #0x490]
    fcsel    d1, d1, d0, ne
    fmov     d0, #1.00000000
    mov      x0, x8
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac0]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x20
    mov      x1, x23
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
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x390]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    b        #0x461c9c // _objc_release

// -[WCLGFuncCardPanelView contentHost] IMP=0x2DDEC8 bounds=0x2DDEC8-0x2DDED4
loc_2DDEC8:
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x398]
    b        #0x461c6c // _objc_msgSend

// -[WCLGFuncCardPanelView buildHeader] IMP=0x2DDED4 bounds=0x2DDED4-0x2DE5A4
loc_2DDED4:
    sub      sp, sp, #0x80
    stp      d9, d8, [sp, #0x10]
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    mov      x19, x0
    adrp     x8, #0x580000
    add      x8, x8, #0x29c
    ldar     w9, [x8]
    cbnz     w9, #0x2de08c
    adrp     x9, #0x53e000
    add      x9, x9, #0x622
    ldrh     w10, [x9]
    mov      w11, #0x75ba
    adrp     x12, #0x53e000
    add      x12, x12, #0x62c
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0xac8e
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x444d
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x835b
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x5ac8
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    adrp     x9, #0x53e000
    add      x9, x9, #0x5f0
    ldrb     w10, [x9]
    mvn      w11, w10
    adrp     x10, #0x53e000
    add      x10, x10, #0x610
    strb     w11, [x10]
    ldrb     w11, [x9, #1]
    mov      w12, #0xb4
    eor      w11, w11, w12
    strb     w11, [x10, #1]
    ldrb     w11, [x9, #2]
    mov      w12, #0xf2
    eor      w11, w11, w12
    strb     w11, [x10, #2]
    ldrb     w11, [x9, #3]
    eor      w11, w11, #0xfc
    strb     w11, [x10, #3]
    ldrb     w11, [x9, #4]
    mov      w12, #0x1d
    eor      w11, w11, w12
    strb     w11, [x10, #4]
    ldrb     w11, [x9, #5]
    mov      w12, #0x4c
    eor      w11, w11, w12
    strb     w11, [x10, #5]
    ldrb     w11, [x9, #6]
    eor      w11, w11, #0xffffffe3
    strb     w11, [x10, #6]
    ldrb     w11, [x9, #7]
    mov      w12, #0x74
    eor      w11, w11, w12
    strb     w11, [x10, #7]
    ldrb     w11, [x9, #8]
    mov      w12, #0xb3
    eor      w11, w11, w12
    strb     w11, [x10, #8]
    ldrb     w11, [x9, #9]
    mov      w12, #0xc4
    eor      w11, w11, w12
    strb     w11, [x10, #9]
    ldrb     w11, [x9, #0xa]
    mov      w12, #0x7a
    eor      w11, w11, w12
    strb     w11, [x10, #0xa]
    ldrb     w11, [x9, #0xb]
    mov      w12, #0x91
    eor      w11, w11, w12
    strb     w11, [x10, #0xb]
    ldrb     w11, [x9, #0xc]
    mov      w12, #0xb8
    eor      w11, w11, w12
    strb     w11, [x10, #0xc]
    ldrb     w11, [x9, #0xd]
    mov      w12, #0x4a
    eor      w11, w11, w12
    strb     w11, [x10, #0xd]
    ldrb     w11, [x9, #0xe]
    mov      w12, #0xdb
    eor      w11, w11, w12
    strb     w11, [x10, #0xe]
    ldrb     w11, [x9, #0xf]
    eor      w11, w11, #0x22222222
    strb     w11, [x10, #0xf]
    ldrb     w11, [x9, #0x10]
    mov      w12, #0x72
    eor      w11, w11, w12
    strb     w11, [x10, #0x10]
    ldrb     w9, [x9, #0x11]
    mov      w11, #0x6e
    eor      w9, w9, w11
    strb     w9, [x10, #0x11]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d2
    adrp     x23, #0x4c4000
    ldr      x0, [x23, #0x78]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xb38]
    mov      x8, #0x4044000000000000
    fmov     d3, x8
    fmov     d0, xzr
    fmov     d1, xzr
    mov      x1, x21
    fmov     d2, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x27, #0x4c4000
    ldr      x0, [x27, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x460]
    mov      x0, x20
    mov      x1, x26
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x448]
    mov      x0, x20
    mov      x1, x24
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x3a0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xb40]
    mov      x1, x25
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, #0x78]
    bl       #0x461ba0 // _objc_alloc
    mov      x8, #-0x3fbe000000000000
    fmov     d0, x8
    fadd     d0, d8, d0
    fmov     d1, #0.50000000
    fmul     d0, d0, d1
    mov      x8, #0x4042000000000000
    fmov     d2, x8
    fmov     d1, #5.00000000
    fmov     d3, #4.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x28, [x8, #0x8c0]
    mov      x0, x19
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    ldr      x0, [x27, #0x90]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0xbf0]
    str      x1, [sp]
    tbz      w8, #0, #0x2de1e0
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3e0]
    fmov     d0, #1.00000000
    b        #0x2de1ec
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x4b8]
    fmov     d0, xzr
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x22
    str      x26, [sp, #8]
    mov      x1, x26
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, #2.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    mov      x1, x24
    mov      w2, #5
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x25
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x8, #-0x3fae000000000000
    fmov     d0, x8
    fadd     d2, d8, d0
    fmov     d0, #16.00000000
    fmov     d1, #10.00000000
    fmov     d3, #24.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    adrp     x2, #0x53e000
    add      x2, x2, #0x6a0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    fmov     d0, #15.50000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x0, x26
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9e8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x26
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x24
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x25
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x168]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x170]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x8, #-0x3fbd000000000000
    fmov     d0, x8
    fadd     d0, d8, d0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    fmov     d1, #5.00000000
    fmov     d2, #30.00000000
    fmov     d3, #30.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    mov      x1, x24
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x80]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1d8]
    adrp     x2, #0x53e000
    add      x2, x2, #0x660
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xee8]
    mov      x0, x23
    mov      x2, x27
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    adrp     x9, #0x4c4000
    ldr      x0, [x9, #0x90]
    tbz      w8, #0, #0x2de414
    fmov     d0, #1.00000000
    fmov     d1, #0.50000000
    b        #0x2de420
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x508]
    fmov     d0, xzr
    ldr      x1, [sp]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc40]
    mov      x0, x23
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x3, [x8, #0xba0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    mov      x0, x23
    mov      x2, x19
    mov      w4, #0x40
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x25
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x492000
    ldr      d1, [x8, #0x1b8]
    fmov     d0, xzr
    fmov     d3, #0.50000000
    mov      x1, x21
    fmov     d2, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x3a8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x21
    ldr      x1, [sp, #8]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x24
    mov      w2, #0xa
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x25
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1d8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c1000
    ldr      x3, [x8, #0x3b0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x440]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc78]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x450]
    mov      x0, x20
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    ldp      d9, d8, [sp, #0x10]
    add      sp, sp, #0x80
    b        #0x461c9c // _objc_release

// -[WCLGFuncCardPanelView buildScrollContent:] IMP=0x2DE5A4 bounds=0x2DE5A4-0x2DF440
loc_2DE5A4:
    stp      d11, d10, [sp, #-0x80]!
    stp      d9, d8, [sp, #0x10]
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    sub      sp, sp, #0x60
    fmov     d8, d0
    mov      x25, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x78]
    adrp     x8, #0x580000
    add      x8, x8, #0x2a0
    ldar     w9, [x8]
    cbnz     w9, #0x2dea48
    adrp     x9, #0x53e000
    add      x9, x9, #0x7a6
    ldrh     w10, [x9]
    mov      w11, #0x25f9
    eor      w10, w10, w11
    adrp     x11, #0x53e000
    add      x11, x11, #0x7b6
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x5daf
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xb17f
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x4da0
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x1d9b
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0x2de1
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0x47d1
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w9, [x9, #0xe]
    mov      w10, #0x2e46
    eor      w9, w9, w10
    adrp     x10, #0x53e000
    add      x10, x10, #0x770
    strh     w9, [x11, #0xe]
    ldrh     w9, [x10]
    mov      w11, #0xa621
    eor      w9, w9, w11
    adrp     x11, #0x53e000
    add      x11, x11, #0x790
    strh     w9, [x11]
    ldrh     w9, [x10, #2]
    mov      w12, #0x2584
    eor      w9, w9, w12
    strh     w9, [x11, #2]
    ldrh     w9, [x10, #4]
    mov      w12, #0x2ae2
    eor      w9, w9, w12
    strh     w9, [x11, #4]
    ldrh     w9, [x10, #6]
    mov      w12, #0xbad0
    eor      w9, w9, w12
    strh     w9, [x11, #6]
    ldrh     w9, [x10, #8]
    mov      w12, #0x5f7e
    eor      w9, w9, w12
    strh     w9, [x11, #8]
    ldrh     w9, [x10, #0xa]
    mov      w12, #0x96f0
    eor      w9, w9, w12
    strh     w9, [x11, #0xa]
    ldrh     w9, [x10, #0xc]
    mov      w12, #0x5abf
    eor      w9, w9, w12
    strh     w9, [x11, #0xc]
    ldrh     w9, [x10, #0xe]
    mov      w12, #0xdea6
    eor      w9, w9, w12
    strh     w9, [x11, #0xe]
    ldrh     w9, [x10, #0x10]
    mov      w12, #0xc0ba
    eor      w9, w9, w12
    strh     w9, [x11, #0x10]
    ldrh     w9, [x10, #0x12]
    mov      w12, #0x50a2
    eor      w9, w9, w12
    strh     w9, [x11, #0x12]
    ldrh     w9, [x10, #0x14]
    mov      w10, #0x3925
    eor      w9, w9, w10
    adrp     x10, #0x53e000
    add      x10, x10, #0x74e
    strh     w9, [x11, #0x14]
    ldrh     w9, [x10]
    mov      w11, #0x32d4
    eor      w9, w9, w11
    adrp     x11, #0x53e000
    add      x11, x11, #0x758
    strh     w9, [x11]
    ldrh     w9, [x10, #2]
    mov      w12, #0xb5a6
    eor      w9, w9, w12
    strh     w9, [x11, #2]
    ldrh     w9, [x10, #4]
    mov      w12, #0xadba
    eor      w9, w9, w12
    strh     w9, [x11, #4]
    ldrh     w9, [x10, #6]
    mov      w12, #0x935c
    eor      w9, w9, w12
    strh     w9, [x11, #6]
    ldrh     w9, [x10, #8]
    mov      w10, #0x59cb
    eor      w9, w9, w10
    adrp     x10, #0x53e000
    add      x10, x10, #0x742
    strh     w9, [x11, #8]
    ldrh     w9, [x10]
    mov      w11, #0x6b45
    eor      w9, w9, w11
    adrp     x11, #0x53e000
    add      x11, x11, #0x748
    strh     w9, [x11]
    ldrh     w9, [x10, #2]
    mov      w12, #0x2a1e
    eor      w9, w9, w12
    strh     w9, [x11, #2]
    ldrh     w9, [x10, #4]
    mov      w10, #0xa202
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x53e000
    add      x9, x9, #0x736
    ldrh     w10, [x9]
    mov      w11, #0xa4f1
    eor      w10, w10, w11
    adrp     x11, #0x53e000
    add      x11, x11, #0x73c
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xc770
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0xbe3
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x53e000
    add      x9, x9, #0x72a
    ldrb     w10, [x9]
    adrp     x11, #0x53e000
    add      x11, x11, #0x730
    mvn      w10, w10
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xa6
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0x44444444
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x84
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0x7e
    strb     w10, [x11, #4]
    ldrb     w9, [x9, #5]
    mov      w10, #0xce
    eor      w9, w9, w10
    strb     w9, [x11, #5]
    adrp     x9, #0x53e000
    add      x9, x9, #0x71e
    ldrh     w10, [x9]
    mov      w11, #0x1af7
    eor      w10, w10, w11
    adrp     x11, #0x53e000
    add      x11, x11, #0x724
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xbc01
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x818
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x53e000
    add      x9, x9, #0x70a
    ldrh     w10, [x9]
    mov      w11, #0x4d93
    adrp     x12, #0x53e000
    add      x12, x12, #0x714
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x597a
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x5598
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x4b40
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x5259
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    adrp     x9, #0x53e000
    add      x9, x9, #0x6f6
    ldrh     w10, [x9]
    mov      w11, #0x7cfb
    adrp     x12, #0x53e000
    add      x12, x12, #0x700
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x9d96
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x2879
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x84a5
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x3748
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    adrp     x9, #0x53e000
    add      x9, x9, #0x6c0
    ldrh     w10, [x9]
    mov      w11, #0x2b0c
    adrp     x12, #0x53e000
    add      x12, x12, #0x6e0
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x7340
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x384a
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x8654
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0x3040
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w10, [x9, #0xa]
    mov      w11, #0x4454
    eor      w10, w10, w11
    strh     w10, [x12, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w11, #0x32ee
    eor      w10, w10, w11
    strh     w10, [x12, #0xc]
    ldrh     w10, [x9, #0xe]
    mov      w11, #0x5b85
    eor      w10, w10, w11
    strh     w10, [x12, #0xe]
    ldrh     w10, [x9, #0x10]
    mov      w11, #0x56b2
    eor      w10, w10, w11
    strh     w10, [x12, #0x10]
    ldrh     w10, [x9, #0x12]
    mov      w11, #0x286
    eor      w10, w10, w11
    strh     w10, [x12, #0x12]
    ldrh     w9, [x9, #0x14]
    mov      w10, #0xce81
    eor      w9, w9, w10
    strh     w9, [x12, #0x14]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x20
    stur     x8, [x29, #-0x98]
    mov      sp, x8
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x4d8]
    mov      x0, x25
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d2
    mov      x0, x25
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x8, #-0x3fbc000000000000
    fmov     d0, x8
    fadd     d10, d3, d0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x188]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    mov      x8, #0x4044000000000000
    fmov     d1, x8
    fmov     d0, xzr
    fmov     d2, d9
    fmov     d3, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x448]
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #6.00000000
    fadd     d1, d8, d0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x730]
    mov      x0, x26
    fmov     d0, d9
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x3b8]
    mov      x0, x26
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbf8]
    mov      x0, x26
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x3a0]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0xb40]
    mov      x1, x27
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x410]
    mov      x0, x25
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x28, [x8, #0x3c0]
    adrp     x3, #0x53e000
    add      x3, x3, #0xa30
    mov      x0, x25
    mov      x1, x28
    mov      x2, #0
    mov      w4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x510]
    bl       #0x461bac // _objc_alloc_init
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x3c8]
    mov      x0, x25
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4a3000
    add      x8, x8, #0xe78
    ldr      x2, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x328]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x23, [x8, #0x3d0]
    mov      x0, x25
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c1000
    ldr      x22, [x8, #0x3d8]
    mov      x1, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    mov      x21, x26
    stur     x26, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x3, [x8, #0x3e0]
    adrp     x8, #0x4bf000
    ldr      x24, [x8, #0xec8]
    mov      x1, x24
    mov      x2, x25
    mov      w4, #0x1000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x26, [x8, #0x3e8]
    mov      x0, x25
    mov      x1, x26
    mov      x2, x20
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x27
    stur     x19, [x29, #-0xa0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x3, #0x53e000
    add      x3, x3, #0x9b0
    mov      x0, x25
    mov      x1, x28
    mov      w2, #1
    mov      w4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x510]
    bl       #0x461bac // _objc_alloc_init
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x3f0]
    mov      x0, x25
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    bl       #0x31af7c
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x21, [x8, #0x3f8]
    mov      x0, x25
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x22
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x3, [x8, #0x400]
    stur     x24, [x29, #-0xb8]
    mov      x1, x24
    ldur     x24, [x29, #-0x80]
    mov      x2, x25
    mov      w4, #0x1000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x25
    stur     x26, [x29, #-0xb0]
    mov      x1, x26
    mov      x2, x20
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    stur     x27, [x29, #-0x88]
    mov      x1, x27
    stur     x19, [x29, #-0xa8]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x3, #0x53e000
    add      x3, x3, #0x970
    mov      x0, x25
    stur     x28, [x29, #-0x90]
    mov      x1, x28
    mov      w2, #2
    mov      w4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x7c0]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x918]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x28, #0x4be000
    tbz      w0, #0, #0x2def00
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x770]
    cbz      x23, #0x2def18
    mov      x0, x23
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x28, #0x678]
    mov      x8, #0x4057000000000000
    fmov     d2, x8
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    b        #0x2def18
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x770]
    ldur     x21, [x29, #-0x98]
    ldp      x26, x27, [x29, #-0xb8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x468]
    bl       #0x461ba0 // _objc_alloc
    mov      x20, x0
    adrp     x8, #0x53e000
    add      x8, x8, #0x8f0
    adrp     x9, #0x53e000
    add      x9, x9, #0x870
    adrp     x10, #0x53e000
    add      x10, x10, #0x930
    stp      x8, x9, [x21]
    str      x10, [x21, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    mov      x2, x21
    mov      w3, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa10]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa18]
    mov      x0, x25
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    bl       #0x31afe0
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0xa20]
    mov      x0, x25
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa28]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x3, [x8, #0x408]
    mov      x1, x26
    mov      x2, x25
    mov      w4, #0x1000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x7f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d3
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [x28, #0x678]
    mov      x8, #0x4066000000000000
    fmov     d2, x8
    fmov     d0, d8
    fmov     d1, d9
    fmov     d3, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x25
    mov      x1, x27
    mov      x2, x20
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    ldur     x21, [x29, #-0x88]
    mov      x1, x21
    stur     x19, [x29, #-0xb0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x410]
    adrp     x3, #0x53e000
    add      x3, x3, #0x8b0
    mov      x0, x25
    mov      w2, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x3, [x8, #0x418]
    mov      x1, x26
    mov      x2, x25
    mov      w4, #0x40
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    mov      x1, x21
    stur     x19, [x29, #-0xb8]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc08]
    adrp     x9, #0x4c1000
    ldr      x20, [x9, #0x420]
    adrp     x3, #0x53e000
    add      x3, x3, #0x830
    add      x4, x25, x8
    mov      x0, x25
    mov      x1, x20
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x3, [x8, #0x428]
    mov      x1, x26
    mov      x2, x25
    mov      w4, #0x40
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    mov      x1, x21
    stur     x19, [x29, #-0xc0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc0c]
    adrp     x3, #0x53e000
    add      x3, x3, #0x7f0
    add      x4, x25, x8
    mov      x0, x25
    mov      x1, x20
    mov      w2, #5
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x3, [x8, #0x430]
    mov      x1, x26
    mov      x2, x25
    mov      w4, #0x40
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    mov      x1, x21
    stur     x19, [x29, #-0xc8]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x26, [x8, #0x438]
    mov      x0, x25
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x19, #0x4be000
    ldr      x28, [x19, #0x600]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    cmp      x21, #1
    b.lt     #0x2df3c4
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x608]
    stur     x8, [x29, #-0x98]
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x528]
    adrp     x8, #0x4c1000
    ldr      x27, [x8, #0x440]
    ldr      x21, [x19, #0x600]
    mov      w23, #6
    sub      x22, x23, #6
    mov      x0, x25
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0x98]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    sub      x8, x0, #1
    cmp      x22, x8
    cset     w28, eq
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x24
    adrp     x2, #0x53e000
    add      x2, x2, #0x9f0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x25
    ldur     x1, [x29, #-0x90]
    mov      x2, x23
    mov      x3, x19
    mov      x4, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x27
    mov      x2, x20
    mov      x3, x22
    mov      x4, x28
    bl       #0x461c6c // _objc_msgSend
    ldp      x1, x0, [x29, #-0x88]
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    add      x22, x23, #1
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    sub      x8, x23, #5
    mov      x28, x21
    mov      x23, x22
    cmp      x8, x20
    b.lt     #0x2df290
    ldur     x0, [x29, #-0xc8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xc0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x78]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2df43c
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
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGFuncCardPanelView makeRowAtIndex:title:lastRow:] IMP=0x2DF440 bounds=0x2DF440-0x2DF6F0
loc_2DF440:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x21, x4
    mov      x26, x3
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x4d8]
    mov      x0, x3
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d2
    adrp     x27, #0x4c4000
    ldr      x0, [x27, #0x78]
    bl       #0x461ba0 // _objc_alloc
    scvtf    d0, x19
    mov      x8, #0x4043000000000000
    fmov     d9, x8
    fmul     d1, d0, d9
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xb38]
    fmov     d0, xzr
    mov      x1, x22
    fmov     d2, d8
    fmov     d3, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x460]
    mov      x0, x19
    mov      x1, x23
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x448]
    mov      x0, x19
    mov      x1, x24
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x491000
    ldr      d0, [x8, #0xbf0]
    fadd     d2, d8, d0
    fmov     d0, #18.00000000
    fmov     d1, xzr
    mov      x1, x22
    fmov     d3, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x800]
    fmov     d0, #15.50000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x0, x25
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9e8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x25
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x200]
    mov      x0, x25
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x208]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x430]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    mov      x1, x24
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0xb40]
    mov      x0, x19
    mov      x1, x26
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    tbnz     w21, #0, #0x2df6c4
    ldr      x0, [x27, #0x78]
    bl       #0x461ba0 // _objc_alloc
    fmov     d0, #-18.00000000
    fadd     d2, d8, d0
    adrp     x8, #0x492000
    ldr      d1, [x8, #0x1c0]
    fmov     d0, #18.00000000
    fmov     d3, #0.50000000
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x3a8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    mov      x1, x23
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x24
    mov      w2, #0xa
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    mov      x1, x26
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    ldp      d9, d8, [sp], #0x70
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGFuncCardPanelView makeColorRowAtIndex:title:swatchOut:] IMP=0x2DF6F0 bounds=0x2DF6F0-0x2DFCE0
loc_2DF6F0:
    sub      sp, sp, #0xa0
    stp      d9, d8, [sp, #0x30]
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    str      x4, [sp, #0x28]
    mov      x20, x3
    mov      x21, x2
    mov      x22, x0
    adrp     x8, #0x580000
    add      x8, x8, #0x2a8
    ldar     w9, [x8]
    cbnz     w9, #0x2df80c
    adrp     x9, #0x53e000
    add      x9, x9, #0xa50
    ldrb     w10, [x9]
    eor      w10, w10, #0xeeeeeeee
    adrp     x11, #0x53e000
    add      x11, x11, #0xa5e
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x40
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x94
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w13, #0x5c
    eor      w10, w10, w13
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w13, #0x15
    eor      w10, w10, w13
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w13, #0x2a
    eor      w10, w10, w13
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w13, #0xd3
    eor      w10, w10, w13
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w14, #0xf6
    eor      w10, w10, w14
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w14, #0x23
    eor      w10, w10, w14
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    eor      w10, w10, w13
    strb     w10, [x11, #9]
    ldrb     w10, [x9, #0xa]
    eor      w10, w10, #7
    strb     w10, [x11, #0xa]
    ldrb     w10, [x9, #0xb]
    mov      w13, #0xd7
    eor      w10, w10, w13
    strb     w10, [x11, #0xb]
    ldrb     w10, [x9, #0xc]
    eor      w10, w10, w12
    strb     w10, [x11, #0xc]
    ldrb     w9, [x9, #0xd]
    eor      w9, w9, #0x33333333
    strb     w9, [x11, #0xd]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4be000
    ldr      x19, [x8, #0x4d8]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d2
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x150]
    bl       #0x461ba0 // _objc_alloc
    scvtf    d0, x21
    mov      x8, #0x4043000000000000
    fmov     d9, x8
    fmul     d1, d0, d9
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xb38]
    fmov     d0, xzr
    mov      x1, x23
    fmov     d2, d8
    fmov     d3, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x0, x21
    str      x1, [sp, #0x18]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x448]
    mov      x0, x21
    mov      x24, x1
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x491000
    ldr      d0, [x8, #0xbf0]
    fadd     d2, d8, d0
    fmov     d0, #18.00000000
    fmov     d1, xzr
    mov      x1, x23
    fmov     d3, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x800]
    fmov     d0, #15.50000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x0, x25
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9e8]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x25
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x440]
    mov      x0, x25
    mov      x1, x20
    str      x20, [sp, #0x10]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    str      x24, [sp, #8]
    mov      x1, x24
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0xb40]
    mov      x0, x21
    mov      x1, x26
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461ba0 // _objc_alloc
    fmov     d0, #-24.00000000
    fadd     d9, d8, d0
    fmov     d1, #12.00000000
    fmov     d2, #8.00000000
    fmov     d3, #14.00000000
    mov      x1, x23
    fmov     d0, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x80]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1d8]
    adrp     x2, #0x53e000
    add      x2, x2, #0xa90
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    mov      x0, x27
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9d0]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc40]
    mov      x0, x27
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x430]
    mov      x0, x27
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    mov      x1, x24
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    mov      x1, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      x1, x26
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    fmov     d0, #-12.00000000
    fadd     d0, d9, d0
    mov      x8, #-0x3fbf000000000000
    fmov     d1, x8
    fadd     d0, d0, d1
    mov      x8, #0x4041000000000000
    fmov     d2, x8
    fmov     d1, #8.00000000
    fmov     d3, #22.00000000
    str      x23, [sp, #0x20]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x19, [x8, #0xac8]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, #6.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb10]
    fmov     d0, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x23, [x8, #0x3a8]
    mov      x28, x22
    mov      x0, x22
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac0]
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb18]
    mov      x2, x24
    ldr      x24, [sp, #8]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldr      x1, [sp, #0x10]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x24
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      x1, x26
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x28]
    cbz      x0, #0x2dfc18
    mov      x1, x20
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    fmov     d0, #-18.00000000
    fadd     d2, d8, d0
    adrp     x8, #0x492000
    ldr      d1, [x8, #0x1c0]
    fmov     d0, #18.00000000
    fmov     d3, #0.50000000
    ldr      x1, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    mov      x0, x28
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x19
    ldr      x1, [sp, #0x18]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x24
    mov      w2, #0xa
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      x1, x26
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    ldp      d9, d8, [sp, #0x30]
    add      sp, sp, #0xa0
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGFuncCardPanelView makeDisclosureRowAtIndex:title:] IMP=0x2DFCE0 bounds=0x2DFCE0-0x2E016C
loc_2DFCE0:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x25, x3
    mov      x20, x2
    mov      x19, x0
    adrp     x8, #0x580000
    add      x8, x8, #0x2ac
    ldar     w9, [x8]
    cbnz     w9, #0x2dfe04
    adrp     x9, #0x53e000
    add      x9, x9, #0xab0
    ldrb     w10, [x9]
    mov      w11, #0xdb
    eor      w10, w10, w11
    adrp     x11, #0x53e000
    add      x11, x11, #0xabe
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xed
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xe6
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0x18
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x58
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x37
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0x45
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0xd0
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w12, #0xeb
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    mov      w12, #0x3d
    eor      w10, w10, w12
    strb     w10, [x11, #9]
    ldrb     w10, [x9, #0xa]
    mov      w12, #0xd4
    eor      w10, w10, w12
    strb     w10, [x11, #0xa]
    ldrb     w10, [x9, #0xb]
    mov      w13, #0x8c
    eor      w10, w10, w13
    strb     w10, [x11, #0xb]
    ldrb     w10, [x9, #0xc]
    eor      w10, w10, w12
    strb     w10, [x11, #0xc]
    ldrb     w9, [x9, #0xd]
    mov      w10, #0x98
    eor      w9, w9, w10
    strb     w9, [x11, #0xd]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x4d8]
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d2
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x150]
    bl       #0x461ba0 // _objc_alloc
    scvtf    d0, x20
    mov      x8, #0x4043000000000000
    fmov     d9, x8
    fmul     d1, d0, d9
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xb38]
    fmov     d0, xzr
    mov      x1, x21
    fmov     d2, d8
    fmov     d3, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x460]
    mov      x0, x20
    mov      x1, x22
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x448]
    mov      x0, x20
    mov      x1, x23
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x8, #-0x3fb2000000000000
    fmov     d0, x8
    fadd     d2, d8, d0
    fmov     d0, #18.00000000
    fmov     d1, xzr
    mov      x1, x21
    fmov     d3, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x800]
    fmov     d0, #15.50000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x0, x24
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9e8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x24
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x440]
    mov      x0, x24
    mov      x1, x27
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    mov      x1, x23
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xb40]
    mov      x0, x20
    mov      x1, x25
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461ba0 // _objc_alloc
    fmov     d0, #-24.00000000
    fadd     d0, d8, d0
    fmov     d1, #12.00000000
    fmov     d2, #8.00000000
    fmov     d3, #14.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x80]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1d8]
    adrp     x2, #0x53e000
    add      x2, x2, #0xaf0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    mov      x0, x26
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc40]
    mov      x0, x26
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x430]
    mov      x0, x26
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x1, x23
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x1, x27
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x25
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    fmov     d0, #-18.00000000
    fadd     d2, d8, d0
    adrp     x8, #0x492000
    ldr      d1, [x8, #0x1c0]
    fmov     d0, #18.00000000
    fmov     d3, #0.50000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x3a8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x21
    mov      x1, x22
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x23
    mov      w2, #0xa
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x25
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    ldp      d9, d8, [sp], #0x70
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGFuncCardPanelView placeAccessoryControl:inRow:] IMP=0x2E016C bounds=0x2E016C-0x2E025C
loc_2E016C:
    stp      d9, d8, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x20, x3
    mov      x19, x2
    mov      x22, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x4d8]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d2
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fcmp     d2, #0.0
    b.hi     #0x2e01e4
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x7f0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #-16.00000000
    fadd     d0, d8, d0
    fsub     d0, d0, d2
    mov      x8, #0x4043000000000000
    fmov     d1, x8
    fsub     d1, d1, d3
    fmov     d4, #0.50000000
    fmul     d1, d1, d4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x448]
    mov      x0, x19
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      d9, d8, [sp], #0x40
    b        #0x461c9c // _objc_release

// -[WCLGFuncCardPanelView addStepperForMetric:index:inRow:] IMP=0x2E025C bounds=0x2E025C-0x2E0A30
loc_2E025C:
    stp      d11, d10, [sp, #-0x80]!
    stp      d9, d8, [sp, #0x10]
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    mov      x21, x4
    mov      x23, x3
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x580000
    add      x8, x8, #0x2b4
    ldar     w9, [x8]
    cbnz     w9, #0x2e0458
    adrp     x9, #0x53e000
    add      x9, x9, #0xb32
    ldrb     w10, [x9]
    mov      w11, #0xd3
    eor      w10, w10, w11
    adrp     x11, #0x53e000
    add      x11, x11, #0xb39
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x5a
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0x1e
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w13, #0x56
    eor      w10, w10, w13
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w13, #0x1a
    eor      w10, w10, w13
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w13, #0x24
    eor      w10, w10, w13
    strb     w10, [x11, #5]
    ldrb     w9, [x9, #6]
    mov      w10, #0x2f
    eor      w9, w9, w10
    adrp     x10, #0x53e000
    add      x10, x10, #0xb2a
    strb     w9, [x11, #6]
    ldrb     w9, [x10]
    mov      w11, #0x4a
    eor      w9, w9, w11
    adrp     x11, #0x53e000
    add      x11, x11, #0xb2e
    strb     w9, [x11]
    ldrb     w9, [x10, #1]
    mov      w13, #0x96
    eor      w9, w9, w13
    strb     w9, [x11, #1]
    ldrb     w9, [x10, #2]
    eor      w9, w9, #0x99999999
    strb     w9, [x11, #2]
    ldrb     w9, [x10, #3]
    eor      w9, w9, w12
    adrp     x10, #0x53e000
    add      x10, x10, #0xb1a
    strb     w9, [x11, #3]
    ldrb     w9, [x10]
    mov      w11, #0x53
    eor      w9, w9, w11
    adrp     x11, #0x53e000
    add      x11, x11, #0xb1e
    strb     w9, [x11]
    ldrb     w9, [x10, #1]
    eor      w9, w9, #0x40
    strb     w9, [x11, #1]
    ldrb     w9, [x10, #2]
    mov      w12, #0x7a
    eor      w9, w9, w12
    strb     w9, [x11, #2]
    ldrb     w9, [x10, #3]
    mov      w10, #0xea
    eor      w9, w9, w10
    strb     w9, [x11, #3]
    adrp     x9, #0x53e000
    add      x9, x9, #0xb22
    ldrb     w10, [x9]
    mov      w11, #0xb5
    adrp     x12, #0x53e000
    add      x12, x12, #0xb26
    eor      w10, w10, w11
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    mov      w11, #0xba
    eor      w10, w10, w11
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    mov      w11, #0xb
    eor      w10, w10, w11
    strb     w10, [x12, #2]
    ldrb     w9, [x9, #3]
    eor      w9, w9, #3
    strb     w9, [x12, #3]
    adrp     x9, #0x53e000
    add      x9, x9, #0xb10
    ldrb     w10, [x9]
    mov      w11, #0x23
    eor      w10, w10, w11
    adrp     x11, #0x53e000
    add      x11, x11, #0xb15
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xd6
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xe
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x47
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0x39
    eor      w9, w9, w10
    strb     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x4d8]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d2
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x528]
    adrp     x2, #0x53e000
    add      x2, x2, #0xc60
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x2, #0x53e000
    add      x2, x2, #0xc20
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4a3000
    add      x8, x8, #0xef0
    ldr      x2, [x8]
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x358]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e04fc
    bl       #0x31d290
    b        #0x2e0640
    adrp     x8, #0x4a3000
    add      x8, x8, #0xef8
    ldr      x2, [x8]
    mov      x0, x25
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e0520
    bl       #0x31d3a8
    b        #0x2e0640
    adrp     x8, #0x4a3000
    add      x8, x8, #0xf00
    ldr      x2, [x8]
    mov      x0, x25
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e0544
    bl       #0x31d3cc
    b        #0x2e0640
    adrp     x8, #0x4a3000
    add      x8, x8, #0xf08
    ldr      x2, [x8]
    mov      x0, x25
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e0568
    bl       #0x31d3f4
    b        #0x2e0640
    adrp     x8, #0x4a3000
    add      x8, x8, #0xf10
    ldr      x2, [x8]
    mov      x0, x25
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e058c
    bl       #0x31d418
    b        #0x2e0640
    adrp     x8, #0x4a3000
    add      x8, x8, #0xf18
    ldr      x2, [x8]
    mov      x0, x25
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e05b0
    bl       #0x31d440
    b        #0x2e0640
    adrp     x8, #0x4a3000
    add      x8, x8, #0xf20
    ldr      x2, [x8]
    mov      x0, x25
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e05d4
    bl       #0x31d460
    b        #0x2e0640
    adrp     x8, #0x4a3000
    add      x8, x8, #0xf38
    ldr      x2, [x8]
    mov      x0, x25
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e05f8
    bl       #0x31d47c
    b        #0x2e0640
    adrp     x8, #0x4a3000
    add      x8, x8, #0xf40
    ldr      x2, [x8]
    mov      x0, x25
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e061c
    bl       #0x31d49c
    b        #0x2e0640
    adrp     x8, #0x4a3000
    add      x8, x8, #0xf48
    ldr      x2, [x8]
    mov      x0, x25
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, xzr
    cbz      w0, #0x2e0644
    bl       #0x31d4c0
    fmov     d9, d0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x518]
    bl       #0x461bac // _objc_alloc_init
    mov      x25, x0
    adrp     x2, #0x53e000
    add      x2, x2, #0xbe0
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x28, [x8, #0x4a0]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xb60]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x53e000
    add      x2, x2, #0xb60
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xb68]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x53e000
    add      x2, x2, #0xba0
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x448]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x450]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x458]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    fcmp     d0, d9
    fcsel    d0, d9, d0, mi
    fcmp     d10, d0
    fcsel    d0, d10, d0, mi
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xce0]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      w8, #0x1bbc
    adrp     x9, #0x4bf000
    ldr      x1, [x9, #0xc30]
    add      x2, x23, x8
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x7f0]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #-16.00000000
    fadd     d0, d8, d0
    fsub     d0, d0, d2
    mov      x8, #0x4043000000000000
    fmov     d8, x8
    fsub     d1, d8, d3
    fmov     d4, #0.50000000
    fmul     d1, d1, d4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x448]
    mov      x0, x25
    mov      x1, x23
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x3, [x8, #0x460]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    mov      x0, x25
    mov      x2, x20
    mov      w4, #0x1000
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0xb40]
    mov      x0, x21
    mov      x1, x26
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x770]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616f0 // _CGRectGetMinX
    mov      x8, #-0x3fb0000000000000
    fmov     d1, x8
    fadd     d0, d0, d1
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    mov      x8, #0x404d000000000000
    fmov     d2, x8
    fmov     d1, xzr
    mov      x0, x24
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1f8]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x378]
    ldr      d1, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9e0]
    fmov     d0, #14.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x0, x24
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9d0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x24
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd20]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x2e0a30
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x0, x24
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x23
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      x1, x26
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x468]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0xa8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x470]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x368]
    mov      x0, x20
    mov      x2, x24
    mov      x3, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    ldp      d9, d8, [sp, #0x10]
    ldp      d11, d10, [sp], #0x80
    b        #0x461c9c // _objc_release

// -[WCLGFuncCardPanelView closeTapped] IMP=0x2E0BDC bounds=0x2E0BDC-0x2E0BE0
loc_2E0BDC:
    b        #0x2e0be0

// -[WCLGFuncCardPanelView enableSwitchChanged:] IMP=0x2E0D0C bounds=0x2E0D0C-0x2E0DA4
loc_2E0D0C:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    adrp     x8, #0x4c4000
    ldr      x20, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x308]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x470]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a3000
    add      x8, x8, #0xe78
    ldr      x3, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x350]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x3912b8

// -[WCLGFuncCardPanelView swipeFollowSwitchChanged:] IMP=0x2E0DA4 bounds=0x2E0DA4-0x2E0E38
loc_2E0DA4:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    adrp     x8, #0x4c4000
    ldr      x20, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x308]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x470]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a3000
    add      x8, x8, #0xed0
    ldr      x3, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x350]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGFuncCardPanelView appearanceControlChanged:] IMP=0x2E0E38 bounds=0x2E0E38-0x2E0EE4
loc_2E0E38:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd08]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    cmp      x0, #3
    b.lo     #0x2e0e88
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa28]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x20, #0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4a3000
    add      x8, x8, #0xed8
    ldr      x3, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x908]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    bl       #0x3912b8
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGFuncCardPanelView stepperChanged:] IMP=0x2E0EE4 bounds=0x2E0EE4-0x2E1230
loc_2E0EE4:
    stp      d9, d8, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x580000
    add      x8, x8, #0x2d0
    ldar     w9, [x8]
    cbnz     w9, #0x2e0fe0
    adrp     x9, #0x53e000
    add      x9, x9, #0xd2e
    ldrb     w10, [x9]
    eor      w10, w10, #0xaaaaaaaa
    adrp     x11, #0x53e000
    add      x11, x11, #0xd32
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x6f
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xa0
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w9, [x9, #3]
    mov      w10, #0x35
    eor      w9, w9, w10
    adrp     x10, #0x53e000
    add      x10, x10, #0xd20
    strb     w9, [x11, #3]
    ldrb     w9, [x10]
    mov      w11, #0xcb
    eor      w9, w9, w11
    adrp     x11, #0x53e000
    add      x11, x11, #0xd27
    strb     w9, [x11]
    ldrb     w9, [x10, #1]
    mov      w12, #0xe6
    eor      w9, w9, w12
    strb     w9, [x11, #1]
    ldrb     w9, [x10, #2]
    mov      w12, #0x5f
    eor      w9, w9, w12
    strb     w9, [x11, #2]
    ldrb     w9, [x10, #3]
    mov      w13, #0x1a
    eor      w9, w9, w13
    strb     w9, [x11, #3]
    ldrb     w9, [x10, #4]
    mov      w13, #0x92
    eor      w9, w9, w13
    strb     w9, [x11, #4]
    ldrb     w9, [x10, #5]
    mov      w13, #0xd2
    eor      w9, w9, w13
    strb     w9, [x11, #5]
    ldrb     w9, [x10, #6]
    eor      w9, w9, w12
    strb     w9, [x11, #6]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x22, [x8, #0x470]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      w8, #0x1bbc
    cmp      x0, x8
    b.lt     #0x2e1210
    mov      x8, #-0x1bbc
    add      x21, x0, x8
    adrp     x8, #0x4c1000
    ldr      x23, [x8, #0x438]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    cmp      x21, x25
    b.ge     #0x2e1210
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0xd20]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x528]
    adrp     x2, #0x53e000
    add      x2, x2, #0xda0
    mov      x0, x21
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xae8]
    mov      x0, x25
    fmov     d0, d8
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x468]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x25, [x8, #0xa8]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f0]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    adrp     x2, #0x53e000
    add      x2, x2, #0xd60
    mov      x0, x21
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    fmov     d0, d8
    bl       #0x2e0a30
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x0, x25
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    bl       #0x3912b8
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      d9, d8, [sp], #0x60
    b        #0x461c9c // _objc_release

// -[WCLGFuncCardPanelView bgColorTapped] IMP=0x2E1230 bounds=0x2E1230-0x2E12C8
loc_2E1230:
    adrp     x8, #0x580000
    add      x8, x8, #0x2d4
    ldar     w9, [x8]
    cbnz     w9, #0x2e12a0
    adrp     x9, #0x53e000
    add      x9, x9, #0xdc0
    ldrh     w10, [x9]
    mov      w11, #0x1eb6
    adrp     x12, #0x53e000
    add      x12, x12, #0xdca
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x3ada
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x115d
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x3cb8
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xf015
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4a3000
    add      x8, x8, #0xee0
    ldr      x2, [x8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x478]
    adrp     x3, #0x53e000
    add      x3, x3, #0xe00
    b        #0x461c6c // _objc_msgSend

// -[WCLGFuncCardPanelView borderColorTapped] IMP=0x2E12C8 bounds=0x2E12C8-0x2E1360
loc_2E12C8:
    adrp     x8, #0x580000
    add      x8, x8, #0x2d8
    ldar     w9, [x8]
    cbnz     w9, #0x2e1338
    adrp     x9, #0x53e000
    add      x9, x9, #0xe20
    ldrh     w10, [x9]
    mov      w11, #0x16ac
    adrp     x12, #0x53e000
    add      x12, x12, #0xe2a
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x5799
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x7b52
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0xa229
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x36a5
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4a3000
    add      x8, x8, #0xf28
    ldr      x2, [x8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x478]
    adrp     x3, #0x53e000
    add      x3, x3, #0xe60
    b        #0x461c6c // _objc_msgSend

// -[WCLGFuncCardPanelView codeLibraryTapped] IMP=0x2E1360 bounds=0x2E1360-0x2E1414
loc_2E1360:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x520]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x480]
    adrp     x2, #0x4a4000
    add      x2, x2, #0x328
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1b8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb50]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    bl       #0x2e142c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x2, x20
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGFuncCardPanelView presentColorPickerKey:title:] IMP=0x2E1538 bounds=0x2E1538-0x2E1778
loc_2E1538:
    sub      sp, sp, #0xd0
    stp      d9, d8, [sp, #0x70]
    stp      x26, x25, [sp, #0x80]
    stp      x24, x23, [sp, #0x90]
    stp      x22, x21, [sp, #0xa0]
    stp      x20, x19, [sp, #0xb0]
    stp      x29, x30, [sp, #0xc0]
    add      x29, sp, #0xc0
    mov      x20, x3
    mov      x19, x2
    mov      x23, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x758]
    mov      x2, x19
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    sub      x0, x29, #0x58
    mov      x1, x23
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x528]
    bl       #0x461ba0 // _objc_alloc
    mov      x23, x0
    adrp     x26, #0x4a0000
    ldr      x26, [x26, #0x748]
    str      x26, [sp, #0x38]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    str      d8, [sp, #0x40]
    adrp     x8, #0x2e1000
    add      x8, x8, #0x778
    adrp     x9, #0x4a4000
    add      x9, x9, #0x348
    stp      x8, x9, [sp, #0x48]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [sp, #0x58]
    add      x25, sp, #0x38
    add      x0, x25, #0x28
    sub      x1, x29, #0x58
    bl       #0x461c00 // _objc_copyWeak
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x488]
    add      x4, sp, #0x38
    mov      x0, x23
    mov      x2, x20
    mov      x3, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1b8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f0]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb50]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    bl       #0x2e142c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    str      x26, [sp, #8]
    str      d8, [sp, #0x10]
    adrp     x8, #0x2e1000
    add      x8, x8, #0x7fc
    adrp     x9, #0x4a1000
    add      x9, x9, #0x628
    stp      x8, x9, [sp, #0x18]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    str      x22, [sp, #0x28]
    add      x26, sp, #8
    add      x0, x26, #0x28
    sub      x1, x29, #0x58
    bl       #0x461c00 // _objc_copyWeak
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    add      x4, sp, #8
    mov      x0, x24
    mov      x2, x23
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    add      x0, x26, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    add      x0, x25, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [sp, #0x58]
    bl       #0x461c9c // _objc_release
    sub      x0, x29, #0x58
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0xc0]
    ldp      x20, x19, [sp, #0xb0]
    ldp      x22, x21, [sp, #0xa0]
    ldp      x24, x23, [sp, #0x90]
    ldp      x26, x25, [sp, #0x80]
    ldp      d9, d8, [sp, #0x70]
    add      sp, sp, #0xd0
    ret      
    mov      x19, x0
    add      x0, x26, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    b        #0x2e1760
    b        #0x2e175c
    b        #0x2e175c
    mov      x19, x0
    b        #0x2e1768
    mov      x19, x0
    add      x0, x25, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    sub      x0, x29, #0x58
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGFuncCardPanelView dismissTopModal] IMP=0x2E18A0 bounds=0x2E18A0-0x2E18E0
loc_2E18A0:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    bl       #0x2e142c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb38]
    mov      w2, #1
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c9c // _objc_release

// -[WCLGFuncCardPanelView refreshColorSwatches] IMP=0x2E18E0 bounds=0x2E18E0-0x2E1A10
loc_2E18E0:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8c0]
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    adrp     x9, #0x4c4000
    ldr      x0, [x9, #0x90]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0xbf0]
    tbz      w8, #0, #0x2e192c
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x880]
    fmov     d0, #1.00000000
    b        #0x2e1938
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x850]
    fmov     d0, xzr
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x31d18c
    bl       #0x2e1a10
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    cmp      x0, #0
    csel     x22, x20, x0, eq
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x498]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x460]
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    bl       #0x31d210
    bl       #0x2e1a10
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    cmp      x0, #0
    csel     x23, x20, x0, eq
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4a0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x24
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461c9c // _objc_release

// -[WCLGFuncCardPanelView handlePan:] IMP=0x2E1AD8 bounds=0x2E1AD8-0x2E1C10
loc_2E1AD8:
    stp      d9, d8, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9a0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    cbz      x0, #0x2e1bf0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x3d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    b.ne     #0x2e1b54
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x338]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4a8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4b0]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    adrp     x8, #0x4c1000
    ldr      x22, [x8, #0x4b8]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    fadd     d8, d8, d0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    fadd     d9, d9, d1
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, d0
    fmov     d5, d1
    fmov     d6, d2
    fmov     d7, d3
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4c0]
    mov      x0, x20
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d4
    fmov     d3, d5
    fmov     d4, d6
    fmov     d5, d7
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xe0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      d9, d8, [sp], #0x40
    b        #0x461c9c // _objc_release

// -[WCLGFuncCardPanelView clampedCenter:inBounds:] IMP=0x2E1C10 bounds=0x2E1C10-0x2E1CD8
loc_2E1C10:
    stp      d13, d12, [sp, #-0x50]!
    stp      d11, d10, [sp, #0x10]
    stp      d9, d8, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    fmov     d8, d5
    fmov     d9, d4
    fmov     d10, d1
    fmov     d11, d0
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x4d8]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d12, #0.50000000
    fmul     d13, d2, d12
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #8.00000000
    fadd     d0, d13, d0
    fmov     d1, #-8.00000000
    fadd     d2, d9, d1
    fsub     d2, d2, d13
    fmul     d4, d9, d12
    fcmp     d0, d11
    fcsel    d5, d11, d0, mi
    fcmp     d2, d5
    fcsel    d5, d2, d5, mi
    fcmp     d0, d2
    fcsel    d0, d4, d5, hi
    fmul     d2, d3, d12
    mov      x8, #0x4049000000000000
    fmov     d3, x8
    fadd     d3, d2, d3
    fadd     d1, d8, d1
    fsub     d1, d1, d2
    fcmp     d3, d10
    fcsel    d2, d10, d3, mi
    fcmp     d1, d2
    fcsel    d2, d1, d2, mi
    fcmp     d3, d1
    fcsel    d1, d3, d2, hi
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    ldp      d11, d10, [sp, #0x10]
    ldp      d13, d12, [sp], #0x50
    ret      

// -[WCLGFuncCardPanelView gestureRecognizer:shouldReceiveTouch:] IMP=0x2E1CD8 bounds=0x2E1CD8-0x2E1D44
loc_2E1CD8:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x0, x3
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x150]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    eor      w0, w20, #1
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    ret      

// -[WCLGFuncCardPanelView panelBG] IMP=0x2E1D44 bounds=0x2E1D44-0x2E1D54
loc_2E1D44:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc10]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGFuncCardPanelView setPanelBG:] IMP=0x2E1D54 bounds=0x2E1D54-0x2E1D68
loc_2E1D54:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc10]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFuncCardPanelView scrollView] IMP=0x2E1D68 bounds=0x2E1D68-0x2E1D78
loc_2E1D68:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc14]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGFuncCardPanelView setScrollView:] IMP=0x2E1D78 bounds=0x2E1D78-0x2E1D8C
loc_2E1D78:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc14]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFuncCardPanelView enableSwitch] IMP=0x2E1D8C bounds=0x2E1D8C-0x2E1D9C
loc_2E1D8C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc18]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGFuncCardPanelView setEnableSwitch:] IMP=0x2E1D9C bounds=0x2E1D9C-0x2E1DB0
loc_2E1D9C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc18]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFuncCardPanelView swipeFollowSwitch] IMP=0x2E1DB0 bounds=0x2E1DB0-0x2E1DC0
loc_2E1DB0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc1c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGFuncCardPanelView setSwipeFollowSwitch:] IMP=0x2E1DC0 bounds=0x2E1DC0-0x2E1DD4
loc_2E1DC0:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc1c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFuncCardPanelView appearanceControl] IMP=0x2E1DD4 bounds=0x2E1DD4-0x2E1DE4
loc_2E1DD4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc20]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGFuncCardPanelView setAppearanceControl:] IMP=0x2E1DE4 bounds=0x2E1DE4-0x2E1DF8
loc_2E1DE4:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc20]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFuncCardPanelView bgSwatch] IMP=0x2E1DF8 bounds=0x2E1DF8-0x2E1E08
loc_2E1DF8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc08]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGFuncCardPanelView setBgSwatch:] IMP=0x2E1E08 bounds=0x2E1E08-0x2E1E1C
loc_2E1E08:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc08]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFuncCardPanelView borderSwatch] IMP=0x2E1E1C bounds=0x2E1E1C-0x2E1E2C
loc_2E1E1C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc0c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGFuncCardPanelView setBorderSwatch:] IMP=0x2E1E2C bounds=0x2E1E2C-0x2E1E40
loc_2E1E2C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc0c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFuncCardPanelView valueLabels] IMP=0x2E1E40 bounds=0x2E1E40-0x2E1E50
loc_2E1E40:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc24]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGFuncCardPanelView setValueLabels:] IMP=0x2E1E50 bounds=0x2E1E50-0x2E1E64
loc_2E1E50:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc24]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFuncCardPanelView metrics] IMP=0x2E1E64 bounds=0x2E1E64-0x2E1E74
loc_2E1E64:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc28]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGFuncCardPanelView setMetrics:] IMP=0x2E1E74 bounds=0x2E1E74-0x2E1E88
loc_2E1E74:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc28]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFuncCardPanelView dragStartCenter] IMP=0x2E1E88 bounds=0x2E1E88-0x2E1E9C
loc_2E1E88:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc2c]
    add      x8, x0, x8
    ldp      d0, d1, [x8]
    ret      

// -[WCLGFuncCardPanelView setDragStartCenter:] IMP=0x2E1E9C bounds=0x2E1E9C-0x2E1EB0
loc_2E1E9C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc2c]
    add      x8, x0, x8
    stp      d0, d1, [x8]
    ret      

// -[WCLGFuncCardPanelView darkMode] IMP=0x2E1EB0 bounds=0x2E1EB0-0x2E1EC0
loc_2E1EB0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc30]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGFuncCardPanelView setDarkMode:] IMP=0x2E1EC0 bounds=0x2E1EC0-0x2E1ED0
loc_2E1EC0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc30]
    strb     w2, [x0, x8]
    ret      

// -[WCLGFuncCardPanelView .cxx_destruct] IMP=0x2E1ED0 bounds=0x2E1ED0-0x2E1F9C
loc_2E1ED0:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc28]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc24]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc0c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc08]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc20]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc1c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc18]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc14]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xc10]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
