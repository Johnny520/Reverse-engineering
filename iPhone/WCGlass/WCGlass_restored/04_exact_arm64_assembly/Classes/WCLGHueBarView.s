// Exact ARM64 listing for WCLGHueBarView

// +[WCLGHueBarView layerClass] IMP=0x24ABD8 bounds=0x24ABD8-0x24AD58
loc_24ABD8:
    sub      sp, sp, #0x80
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    mov      w19, #0x6873
    movk     w19, #0x63b2, lsl #16
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb00]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb04]
    add      w8, w8, w9
    mov      w9, #0x6dc
    movk     w9, #0xb8e1, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x57e2
    movk     w9, #0x982f, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x657b
    movk     w9, #0x5cd2, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3e
    str      w8, [sp, #0x1c]
    mov      w20, #0xf935
    movk     w20, #0xb4e1, lsl #16
    str      w20, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w21, #0x9ac5
    movk     w21, #0x28fd, lsl #16
    mov      w23, #0x9ac6
    movk     w23, #0x28fd, lsl #16
    mov      w24, #0xc0b8
    movk     w24, #0x9397, lsl #16
    adrp     x25, #0x4c4000
    adrp     x26, #0x4be000
    mov      w28, #0x4b18
    movk     w28, #0x2335, lsl #16
    mov      w22, #0x951e
    movk     w22, #0xf45b, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w21
    b.le     #0x24acec
    cmp      w8, w23
    b.eq     #0x24ad14
    cmp      w8, w19
    b.ne     #0x24ac84
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb08]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb0c]
    add      w8, w8, w9
    mov      w9, #0x452
    movk     w9, #0x30cc, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x2d52
    movk     w9, #0x38ce, lsl #16
    and      w8, w8, w9
    add      w27, w8, w28
    ldr      x0, [x25, #0x290]
    ldr      x1, [x26, #0x410]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x10]
    cmp      w27, w22
    csel     w8, w24, w19, lo
    b        #0x24ad08
    cmp      w8, w20
    b.ne     #0x24ad2c
    ldr      w8, [sp, #0x1c]
    mov      w9, #0xb73a
    movk     w9, #0xa153, lsl #16
    cmp      w8, w9
    csel     w8, w19, w23, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x24ac84
    ldr      x0, [x25, #0x290]
    ldr      x1, [x26, #0x410]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp]
    str      w19, [x8]
    b        #0x24ac84
    cmp      w8, w24
    b.ne     #0x24ac84
    ldr      x0, [sp, #0x10]
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    add      sp, sp, #0x80
    ret      

// -[WCLGHueBarView initWithFrame:] IMP=0x24AD58 bounds=0x24AD58-0x24AFF0
loc_24AD58:
    stp      d11, d10, [sp, #-0x80]!
    stp      d9, d8, [sp, #0x10]
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    sub      sp, sp, #0x20
    fmov     d8, d3
    fmov     d9, d2
    fmov     d10, d1
    fmov     d11, d0
    mov      x19, x0
    mov      w22, #0xf7ce
    movk     w22, #0xfdc6, lsl #16
    mov      w23, #0x90b0
    movk     w23, #0x1bf6, lsl #16
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb10]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb14]
    add      w8, w8, w9
    mov      w9, #0xf195
    movk     w9, #0x5962, lsl #16
    add      w8, w8, w9
    mov      w9, #0xad7e
    movk     w9, #0xb563, lsl #16
    orr      w8, w8, w9
    stur     w8, [x29, #-0x74]
    mov      w24, #0xcde4
    movk     w24, #0x6ee, lsl #16
    stur     w24, [x29, #-0x88]
    sub      x8, x29, #0x88
    stur     x8, [x29, #-0x90]
    mov      w25, #0xcde3
    movk     w25, #0x6ee, lsl #16
    mov      w26, #0x1fbb
    movk     w26, #0xbff4, lsl #16
    adrp     x21, #0x4c4000
    mov      w27, #0x79a1
    movk     w27, #0xf58e, lsl #16
    mov      w28, #0x9496
    movk     w28, #0x11d5, lsl #16
    ldur     w8, [x29, #-0x88]
    cmp      w8, w25
    b.gt     #0x24aebc
    cmp      w8, w26
    b.eq     #0x24aedc
    cmp      w8, w27
    b.eq     #0x24af18
    cmp      w8, w22
    b.ne     #0x24ae0c
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb18]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb1c]
    orr      w8, w8, w9
    mov      w9, #0xe39
    movk     w9, #0x13d, lsl #16
    and      w8, w8, w9
    mov      w9, #0xd8a4
    movk     w9, #0x2fa3, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x6931
    movk     w9, #0x689d, lsl #16
    eor      w20, w8, w9
    mov      x8, sp
    sub      x0, x8, #0x10
    mov      sp, x0
    ldr      x9, [x21, #0x760]
    stp      x19, x9, [x8, #-0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    fmov     d0, d11
    fmov     d1, d10
    fmov     d2, d9
    fmov     d3, d8
    bl       #0x461c84 // _objc_msgSendSuper2
    stur     x0, [x29, #-0x80]
    cmp      x0, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x81]
    mov      w8, #0xdc7b
    movk     w8, #0xa953, lsl #16
    cmp      w20, w8
    csel     w8, w28, w22, hi
    b        #0x24afb0
    cmp      w8, w24
    b.eq     #0x24af9c
    cmp      w8, w28
    b.ne     #0x24afbc
    ldurb    w8, [x29, #-0x81]
    cmp      w8, #0
    csel     w8, w23, w27, ne
    b        #0x24afb0
    mov      x8, sp
    sub      x0, x8, #0x10
    mov      sp, x0
    ldr      x9, [x21, #0x760]
    stp      x19, x9, [x8, #-0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    fmov     d0, d11
    fmov     d1, d10
    fmov     d2, d9
    fmov     d3, d8
    bl       #0x461c84 // _objc_msgSendSuper2
    ldur     x8, [x29, #-0x90]
    str      w22, [x8]
    b        #0x24ae0c
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0xac8]
    ldur     x0, [x29, #-0x80]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x21
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, #11.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      x21, x23
    mov      w23, #0x90b0
    movk     w23, #0x1bf6, lsl #16
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x80]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x90]
    str      w23, [x8]
    b        #0x24ae0c
    ldur     w8, [x29, #-0x74]
    mov      w9, #0xfcd4
    movk     w9, #0x1c65, lsl #16
    cmp      w8, w9
    csel     w8, w26, w22, eq
    ldur     x9, [x29, #-0x90]
    str      w8, [x9]
    b        #0x24ae0c
    cmp      w8, w23
    b.ne     #0x24ae0c
    ldur     x0, [x29, #-0x80]
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

// -[WCLGHueBarView layoutSubviews] IMP=0x24AFF0 bounds=0x24AFF0-0x24B840
loc_24AFF0:
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
    sub      sp, sp, #0x50
    stur     x0, [x29, #-0xa0]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x88]
    mov      w11, #0x630f
    movk     w11, #0x36d8, lsl #16
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb20]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb24]
    mov      w10, #0x2750
    movk     w10, #0x24c, lsl #16
    madd     w8, w8, w9, w10
    mov      w9, #0xa874
    movk     w9, #0xf650, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x2389
    movk     w9, #0x5785, lsl #16
    mul      w10, w8, w9
    mov      w9, #0x42cc
    movk     w9, #0x21a6, lsl #16
    sub      x8, x29, #0x90
    stp      w9, w10, [x29, #-0x90]
    mov      w10, #0x630e
    movk     w10, #0x36d8, lsl #16
    stur     x8, [x29, #-0x98]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x3b0]
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x490]
    adrp     x8, #0x491000
    ldr      d10, [x8, #0xb78]
    adrp     x8, #0x491000
    ldr      d11, [x8, #0x750]
    adrp     x8, #0x491000
    ldr      d12, [x8, #0x648]
    adrp     x8, #0x491000
    ldr      d13, [x8, #0x3f8]
    ldur     w8, [x29, #-0x90]
    cmp      w8, w10
    b.gt     #0x24b104
    mov      w9, #0xfc11
    movk     w9, #0x836e, lsl #16
    cmp      w8, w9
    b.eq     #0x24b4a4
    mov      w9, #0x42cc
    movk     w9, #0x21a6, lsl #16
    cmp      w8, w9
    b.ne     #0x24b0b8
    ldur     w8, [x29, #-0x8c]
    mov      w9, #0x6dbe
    movk     w9, #0x2ed4, lsl #16
    cmp      w8, w9
    mov      w8, #0xfc11
    movk     w8, #0x836e, lsl #16
    csel     w8, w11, w8, ne
    b        #0x24b498
    cmp      w8, w11
    b.ne     #0x24b7e8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb28]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb2c]
    udiv     w8, w8, w9
    mov      w9, #0x5173
    movk     w9, #0x3a9d, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x3fb
    movk     w9, #0xc268, lsl #16
    mov      w10, #0xb5eb
    movk     w10, #0x1022, lsl #16
    madd     w8, w8, w9, w10
    stur     w8, [x29, #-0xa8]
    mov      x8, sp
    sub      x0, x8, #0x10
    mov      sp, x0
    mov      x20, sp
    sub      x9, x20, #0x50
    stur     x9, [x29, #-0xb0]
    mov      sp, x9
    adrp     x9, #0x4c4000
    ldr      x9, [x9, #0x760]
    ldur     x19, [x29, #-0xa0]
    stp      x19, x9, [x8, #-0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    stur     x0, [x29, #-0xc0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x850]
    fmov     d0, #0.50000000
    fmov     d1, xzr
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x858]
    fmov     d0, #0.50000000
    fmov     d1, #1.00000000
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x23, #0x4c4000
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x4c0000
    ldr      x24, [x8, #0x860]
    fmov     d0, xzr
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb8]
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0xac0]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x20, #-0x50]
    ldr      x0, [x23, #0x90]
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x24
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xc8]
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x20, #-0x48]
    ldr      x0, [x23, #0x90]
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x24
    fmov     d0, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x20, #-0x40]
    ldr      x0, [x23, #0x90]
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x24
    fmov     d0, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x20, #-0x38]
    ldr      x0, [x23, #0x90]
    fmov     d0, #0.50000000
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x20, #-0x30]
    ldr      x0, [x23, #0x90]
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x24
    fmov     d0, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x20, #-0x28]
    ldr      x0, [x23, #0x90]
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x24
    fmov     d0, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x20, #-0x20]
    ldr      x0, [x23, #0x90]
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x24
    fmov     d0, d13
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x20, #-0x18]
    ldr      x0, [x23, #0x90]
    fmov     d0, #1.00000000
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x20, #-0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    ldur     x2, [x29, #-0xb0]
    mov      w3, #9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x868]
    ldur     x20, [x29, #-0xc0]
    mov      x0, x20
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xc8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      w10, #0x630e
    movk     w10, #0x36d8, lsl #16
    mov      w11, #0x630f
    movk     w11, #0x36d8, lsl #16
    mov      w8, #0x44a
    movk     w8, #0xc81, lsl #16
    ldur     w9, [x29, #-0xa8]
    cmp      w9, w8
    mov      w8, #0xfa4c
    movk     w8, #0x6de7, lsl #16
    csel     w8, w11, w8, lo
    ldur     x9, [x29, #-0x98]
    str      w8, [x9]
    b        #0x24b0b8
    mov      x8, sp
    sub      x0, x8, #0x10
    mov      sp, x0
    mov      x20, sp
    sub      x9, x20, #0x50
    stur     x9, [x29, #-0xa8]
    mov      sp, x9
    adrp     x9, #0x4c4000
    ldr      x9, [x9, #0x760]
    ldur     x19, [x29, #-0xa0]
    stp      x19, x9, [x8, #-0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    stur     x0, [x29, #-0xb8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x850]
    fmov     d0, #0.50000000
    fmov     d1, xzr
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x858]
    fmov     d0, #0.50000000
    fmov     d1, #1.00000000
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x23, #0x4c4000
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x4c0000
    ldr      x24, [x8, #0x860]
    fmov     d0, xzr
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb0]
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0xac0]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x20, #-0x50]
    ldr      x0, [x23, #0x90]
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x24
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xc0]
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x20, #-0x48]
    ldr      x0, [x23, #0x90]
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x24
    fmov     d0, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x20, #-0x40]
    ldr      x0, [x23, #0x90]
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x24
    fmov     d0, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x20, #-0x38]
    ldr      x0, [x23, #0x90]
    fmov     d0, #0.50000000
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x20, #-0x30]
    ldr      x0, [x23, #0x90]
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x24
    fmov     d0, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x20, #-0x28]
    ldr      x0, [x23, #0x90]
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x24
    fmov     d0, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x20, #-0x20]
    ldr      x0, [x23, #0x90]
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x24
    fmov     d0, d13
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x20, #-0x18]
    ldr      x0, [x23, #0x90]
    fmov     d0, #1.00000000
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x20, #-0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    ldur     x2, [x29, #-0xa8]
    mov      w3, #9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x868]
    ldur     x20, [x29, #-0xb8]
    mov      x0, x20
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xc0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      w10, #0x630e
    movk     w10, #0x36d8, lsl #16
    mov      w11, #0x630f
    movk     w11, #0x36d8, lsl #16
    ldur     x8, [x29, #-0x98]
    str      w11, [x8]
    b        #0x24b0b8
    mov      w9, #0xfa4c
    movk     w9, #0x6de7, lsl #16
    cmp      w8, w9
    b.ne     #0x24b0b8
    ldur     x8, [x29, #-0x88]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x24b83c
    sub      sp, x29, #0x80
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
