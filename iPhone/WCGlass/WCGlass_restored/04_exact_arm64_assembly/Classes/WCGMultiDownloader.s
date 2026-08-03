// Exact ARM64 listing for WCGMultiDownloader

// -[WCGMultiDownloader start] IMP=0x2ED4A4 bounds=0x2ED4A4-0x2ED928
loc_2ED4A4:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x580000
    add      x8, x8, #0x544
    ldar     w9, [x8]
    cbnz     w9, #0x2ed59c
    adrp     x9, #0x541000
    add      x9, x9, #0xbc0
    ldrb     w10, [x9]
    adrp     x11, #0x541000
    add      x11, x11, #0xbcc
    eor      w10, w10, #0x10
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x5e
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x21
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0x7f
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0xd1
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0xffffff87
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0xb4
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    eor      w10, w10, #0x18
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    eor      w10, w10, #0xfffffff3
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    eor      w10, w10, #4
    strb     w10, [x11, #9]
    ldrb     w10, [x9, #0xa]
    mov      w12, #0x52
    eor      w10, w10, w12
    strb     w10, [x11, #0xa]
    ldrb     w9, [x9, #0xb]
    eor      w9, w9, #0x7c
    strb     w9, [x11, #0xb]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x30
    stur     x8, [x29, #-0x68]
    mov      sp, x8
    sub      x20, sp, #0x40
    mov      sp, x20
    sub      x8, sp, #0x80
    stur     x8, [x29, #-0x60]
    mov      sp, x8
    adrp     x8, #0x4c4000
    ldr      x22, [x8, #0x2f0]
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x680]
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xa40]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x5b8]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x0, #0x541000
    add      x0, x0, #0xbcc
    mov      x1, #0
    bl       #0x4619f0 // _dispatch_queue_create
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x5c0]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    bl       #0x46145c // _CACurrentMediaTime
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x5c8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x5d0]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x5d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    csinc    x23, x0, xzr, gt
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    b.lt     #0x2ed760
    mov      x21, #0
    mov      x25, #0
    add      x8, x23, x26
    sub      x8, x8, #1
    adrp     x9, #0x4c1000
    ldr      x26, [x9, #0x5e0]
    adrp     x9, #0x4be000
    ldr      x27, [x9, #0x830]
    sdiv     x23, x8, x23
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    add      x8, x0, x21
    cmp      x23, x8
    csel     x3, x23, x8, lt
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xe8]
    mov      x1, x26
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x0, x22
    mov      x1, x27
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    add      x25, x25, x23
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    sub      x21, x21, x23
    cmp      x25, x0
    b.lt     #0x2ed6f4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x5e8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    ldur     x1, [x29, #-0x68]
    str      x8, [x1]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    adrp     x8, #0x2ed000
    add      x8, x8, #0x928
    str      d0, [x1, #8]
    adrp     x9, #0x4a1000
    add      x9, x9, #0xa00
    stp      x8, x9, [x1, #0x10]
    str      x19, [x1, #0x20]
    adrp     x0, #0x4a0000
    ldr      x0, [x0, #0x770]
    bl       #0x461978 // _dispatch_async
    adrp     x8, #0x4c4000
    ldr      x23, [x8, #0x2d0]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x548]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x608]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x610]
    mov      x0, x23
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    stp      q0, q0, [x20, #0x20]
    stp      q0, q0, [x20]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x478]
    mov      x1, x24
    mov      x2, x20
    ldur     x3, [x29, #-0x60]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2ed8d4
    mov      x25, x0
    ldr      x8, [x20, #0x10]
    ldr      x28, [x8]
    mov      x21, #0
    adrp     x8, #0x4c1000
    ldr      x26, [x8, #0x618]
    adrp     x8, #0x4c1000
    ldr      x27, [x8, #0x620]
    ldr      x8, [x20, #0x10]
    ldr      x8, [x8]
    cmp      x8, x28
    b.eq     #0x2ed880
    mov      x0, x22
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x20, #8]
    ldr      x0, [x8, x21, lsl #3]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x3, x1
    mov      x0, x19
    mov      x1, x27
    mov      x4, x23
    bl       #0x461c6c // _objc_msgSend
    add      x21, x21, #1
    cmp      x25, x21
    b.ne     #0x2ed868
    mov      x0, x22
    mov      x1, x24
    mov      x2, x20
    ldur     x3, [x29, #-0x60]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    cbnz     x0, #0x2ed854
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2ed924
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCGMultiDownloader fetchRange:session:] IMP=0x2ED9DC bounds=0x2ED9DC-0x2EDE68
loc_2ED9DC:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x4
    mov      x20, x3
    mov      x21, x2
    mov      x22, x0
    adrp     x8, #0x580000
    add      x8, x8, #0x558
    ldar     w9, [x8]
    cbnz     w9, #0x2edcb0
    adrp     x9, #0x541000
    add      x9, x9, #0xbe0
    ldrb     w10, [x9]
    mov      w11, #0x19
    eor      w12, w10, w11
    adrp     x10, #0x541000
    add      x10, x10, #0xc10
    strb     w12, [x10]
    ldrb     w12, [x9, #1]
    mov      w13, #0x4f
    eor      w12, w12, w13
    strb     w12, [x10, #1]
    ldrb     w12, [x9, #2]
    eor      w12, w12, #0xffffffdf
    strb     w12, [x10, #2]
    ldrb     w12, [x9, #3]
    mov      w13, #0xa0
    eor      w12, w12, w13
    strb     w12, [x10, #3]
    ldrb     w12, [x9, #4]
    eor      w12, w12, #6
    strb     w12, [x10, #4]
    ldrb     w12, [x9, #5]
    eor      w12, w12, #0x7e
    strb     w12, [x10, #5]
    ldrb     w12, [x9, #6]
    mov      w13, #0x43
    eor      w12, w12, w13
    strb     w12, [x10, #6]
    ldrb     w12, [x9, #7]
    mov      w14, #0xca
    eor      w12, w12, w14
    strb     w12, [x10, #7]
    ldrb     w12, [x9, #8]
    mov      w14, #0x24
    eor      w12, w12, w14
    strb     w12, [x10, #8]
    ldrb     w12, [x9, #9]
    mov      w14, #0xf6
    eor      w12, w12, w14
    strb     w12, [x10, #9]
    ldrb     w12, [x9, #0xa]
    mov      w14, #0x4d
    eor      w12, w12, w14
    strb     w12, [x10, #0xa]
    ldrb     w12, [x9, #0xb]
    mov      w14, #0x3b
    eor      w12, w12, w14
    strb     w12, [x10, #0xb]
    ldrb     w12, [x9, #0xc]
    eor      w12, w12, #0xdddddddd
    strb     w12, [x10, #0xc]
    ldrb     w12, [x9, #0xd]
    eor      w12, w12, #0x3e
    strb     w12, [x10, #0xd]
    ldrb     w12, [x9, #0xe]
    mov      w14, #0x7a
    eor      w12, w12, w14
    strb     w12, [x10, #0xe]
    ldrb     w12, [x9, #0xf]
    mov      w14, #0x41
    eor      w12, w12, w14
    strb     w12, [x10, #0xf]
    ldrb     w12, [x9, #0x10]
    eor      w12, w12, #3
    strb     w12, [x10, #0x10]
    ldrb     w12, [x9, #0x11]
    eor      w12, w12, w13
    strb     w12, [x10, #0x11]
    ldrb     w12, [x9, #0x12]
    mov      w13, #0xed
    eor      w12, w12, w13
    strb     w12, [x10, #0x12]
    ldrb     w12, [x9, #0x13]
    mov      w13, #0x15
    eor      w12, w12, w13
    strb     w12, [x10, #0x13]
    ldrb     w12, [x9, #0x14]
    eor      w12, w12, #0x10
    strb     w12, [x10, #0x14]
    ldrb     w12, [x9, #0x15]
    mov      w13, #0xe8
    eor      w12, w12, w13
    strb     w12, [x10, #0x15]
    ldrb     w12, [x9, #0x16]
    mov      w13, #0x8a
    eor      w12, w12, w13
    strb     w12, [x10, #0x16]
    ldrb     w12, [x9, #0x17]
    mov      w13, #0x5f
    eor      w12, w12, w13
    strb     w12, [x10, #0x17]
    ldrb     w12, [x9, #0x18]
    mov      w13, #0x31
    eor      w12, w12, w13
    strb     w12, [x10, #0x18]
    ldrb     w12, [x9, #0x19]
    mov      w13, #0x92
    eor      w12, w12, w13
    strb     w12, [x10, #0x19]
    ldrb     w12, [x9, #0x1a]
    mov      w13, #0x51
    eor      w12, w12, w13
    strb     w12, [x10, #0x1a]
    ldrb     w12, [x9, #0x1b]
    mov      w13, #0x48
    eor      w12, w12, w13
    strb     w12, [x10, #0x1b]
    ldrb     w12, [x9, #0x1c]
    mov      w13, #0x61
    eor      w12, w12, w13
    strb     w12, [x10, #0x1c]
    ldrb     w12, [x9, #0x1d]
    eor      w12, w12, #0xbbbbbbbb
    strb     w12, [x10, #0x1d]
    ldrb     w12, [x9, #0x1e]
    eor      w12, w12, #0xf8
    strb     w12, [x10, #0x1e]
    ldrb     w12, [x9, #0x1f]
    eor      w11, w12, w11
    strb     w11, [x10, #0x1f]
    ldrb     w11, [x9, #0x20]
    mov      w12, #0xc6
    eor      w11, w11, w12
    strb     w11, [x10, #0x20]
    ldrb     w11, [x9, #0x21]
    eor      w11, w11, #0xfffffff9
    strb     w11, [x10, #0x21]
    ldrb     w11, [x9, #0x22]
    eor      w11, w11, #0xffffff83
    strb     w11, [x10, #0x22]
    ldrb     w11, [x9, #0x23]
    mov      w12, #0xd1
    eor      w11, w11, w12
    strb     w11, [x10, #0x23]
    ldrb     w11, [x9, #0x24]
    eor      w11, w11, #1
    strb     w11, [x10, #0x24]
    ldrb     w11, [x9, #0x25]
    eor      w11, w11, #0xcccccccc
    strb     w11, [x10, #0x25]
    ldrb     w11, [x9, #0x26]
    mov      w12, #0xbe
    eor      w11, w11, w12
    strb     w11, [x10, #0x26]
    ldrb     w11, [x9, #0x27]
    eor      w11, w11, #0xfffffffd
    strb     w11, [x10, #0x27]
    ldrb     w11, [x9, #0x28]
    eor      w11, w11, #0x1c
    strb     w11, [x10, #0x28]
    ldrb     w11, [x9, #0x29]
    mov      w12, #0x69
    eor      w11, w11, w12
    strb     w11, [x10, #0x29]
    ldrb     w11, [x9, #0x2a]
    mov      w12, #0x8d
    eor      w11, w11, w12
    strb     w11, [x10, #0x2a]
    ldrb     w11, [x9, #0x2b]
    eor      w11, w11, #0xffffff9f
    strb     w11, [x10, #0x2b]
    ldrb     w9, [x9, #0x2c]
    mov      w11, #0xbd
    eor      w9, w9, w11
    strb     w9, [x10, #0x2c]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x27, sp
    sub      x23, x27, #0x40
    mov      sp, x23
    adrp     x8, #0x4c4000
    ldr      x24, [x8, #0xb8]
    adrp     x8, #0x4c1000
    ldr      x25, [x8, #0x628]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x630]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    sub      sp, sp, #0x20
    stp      x21, x20, [sp, #0x10]
    stp      x25, x0, [sp]
    adrp     x2, #0x541000
    add      x2, x2, #0xc60
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    add      sp, sp, #0x20
    mov      x24, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x25, [x8, #0x2c8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2c0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9a0]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x638]
    mov      x0, x25
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x640]
    mov      x8, #0x404e000000000000
    fmov     d0, x8
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    stur     x8, [x27, #-0x40]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    stur     d0, [x27, #-0x38]
    adrp     x8, #0x2ed000
    add      x8, x8, #0xe68
    adrp     x9, #0x4a4000
    add      x9, x9, #0x458
    stp      x8, x9, [x27, #-0x30]
    stp      x22, x21, [x27, #-0x20]
    stur     x20, [x27, #-0x10]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9d0]
    mov      x0, x19
    mov      x2, x25
    mov      x3, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9d8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      

// -[WCGMultiDownloader emit] IMP=0x2EE110 bounds=0x2EE110-0x2EE2C8
loc_2EE110:
    sub      sp, sp, #0x90
    stp      d11, d10, [sp, #0x40]
    stp      d9, d8, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x20, [x8, #0x690]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461c9c // _objc_release
    cbz      x21, #0x2ee2ac
    bl       #0x46145c // _CACurrentMediaTime
    fmov     d8, d0
    str      xzr, [sp, #0x38]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x648]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x740]
    str      x8, [sp, #8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x398]
    adrp     x8, #0x2ee000
    add      x8, x8, #0x2c8
    adrp     x9, #0x4a4000
    add      x9, x9, #0x488
    str      d0, [sp, #0x10]
    stp      x8, x9, [sp, #0x18]
    add      x8, sp, #0x38
    stp      x19, x8, [sp, #0x28]
    add      x1, sp, #8
    bl       #0x461a20 // _dispatch_sync
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x698]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fsub     d11, d8, d0
    fmov     d9, xzr
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3d8]
    fcmp     d11, d0
    fmov     d10, xzr
    b.le     #0x2ee20c
    ldr      x21, [sp, #0x38]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x6a0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    sub      x8, x21, x0
    scvtf    d0, x8
    fdiv     d10, d0, d11
    ldr      x2, [sp, #0x38]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x5d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x5c8]
    mov      x0, x19
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x680]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    b.lt     #0x2ee26c
    ldr      d0, [sp, #0x38]
    scvtf    d8, d0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    scvtf    d0, x0
    fdiv     d9, d8, d0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x448]
    fcmp     d9, d0
    fcsel    d0, d0, d9, gt
    fmov     d1, xzr
    fmaxnm   d1, d10, d1
    ldr      x8, [x0, #0x10]
    blr      x8
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      d9, d8, [sp, #0x50]
    ldp      d11, d10, [sp, #0x40]
    add      sp, sp, #0x90
    ret      

// -[WCGMultiDownloader finishOnMain:] IMP=0x2EE2FC bounds=0x2EE2FC-0x2EE384
loc_2EE2FC:
    sub      sp, sp, #0x50
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [sp, #8]
    adrp     x8, #0x2ee000
    add      x8, x8, #0x384
    adrp     x9, #0x4a4000
    add      x9, x9, #0x198
    stp      x8, x9, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x0, #0x4a0000
    ldr      x0, [x0, #0x770]
    mov      x1, sp
    bl       #0x461978 // _dispatch_async
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    add      sp, sp, #0x50
    ret      

// -[WCGMultiDownloader base] IMP=0x2EE44C bounds=0x2EE44C-0x2EE454
loc_2EE44C:
    ldr      x0, [x0, #0x10]
    ret      

// -[WCGMultiDownloader setBase:] IMP=0x2EE454 bounds=0x2EE454-0x2EE45C
loc_2EE454:
    mov      w3, #0x10
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCGMultiDownloader token] IMP=0x2EE45C bounds=0x2EE45C-0x2EE464
loc_2EE45C:
    ldr      x0, [x0, #0x18]
    ret      

// -[WCGMultiDownloader setToken:] IMP=0x2EE464 bounds=0x2EE464-0x2EE46C
loc_2EE464:
    mov      w3, #0x18
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCGMultiDownloader size] IMP=0x2EE46C bounds=0x2EE46C-0x2EE474
loc_2EE46C:
    ldr      x0, [x0, #0x20]
    ret      

// -[WCGMultiDownloader setSize:] IMP=0x2EE474 bounds=0x2EE474-0x2EE47C
loc_2EE474:
    str      x2, [x0, #0x20]
    ret      

// -[WCGMultiDownloader threads] IMP=0x2EE47C bounds=0x2EE47C-0x2EE484
loc_2EE47C:
    ldr      x0, [x0, #0x28]
    ret      

// -[WCGMultiDownloader setThreads:] IMP=0x2EE484 bounds=0x2EE484-0x2EE48C
loc_2EE484:
    str      x2, [x0, #0x28]
    ret      

// -[WCGMultiDownloader buffer] IMP=0x2EE48C bounds=0x2EE48C-0x2EE494
loc_2EE48C:
    ldr      x0, [x0, #0x30]
    ret      

// -[WCGMultiDownloader setBuffer:] IMP=0x2EE494 bounds=0x2EE494-0x2EE4A0
loc_2EE494:
    mov      x1, x2
    add      x0, x0, #0x30
    b        #0x461cfc // _objc_storeStrong

// -[WCGMultiDownloader received] IMP=0x2EE4A0 bounds=0x2EE4A0-0x2EE4A8
loc_2EE4A0:
    ldr      x0, [x0, #0x38]
    ret      

// -[WCGMultiDownloader setReceived:] IMP=0x2EE4A8 bounds=0x2EE4A8-0x2EE4B0
loc_2EE4A8:
    str      x2, [x0, #0x38]
    ret      

// -[WCGMultiDownloader pending] IMP=0x2EE4B0 bounds=0x2EE4B0-0x2EE4B8
loc_2EE4B0:
    ldr      x0, [x0, #0x40]
    ret      

// -[WCGMultiDownloader setPending:] IMP=0x2EE4B8 bounds=0x2EE4B8-0x2EE4C0
loc_2EE4B8:
    str      x2, [x0, #0x40]
    ret      

// -[WCGMultiDownloader failed] IMP=0x2EE4C0 bounds=0x2EE4C0-0x2EE4C8
loc_2EE4C0:
    ldrb     w0, [x0, #8]
    ret      

// -[WCGMultiDownloader setFailed:] IMP=0x2EE4C8 bounds=0x2EE4C8-0x2EE4D0
loc_2EE4C8:
    strb     w2, [x0, #8]
    ret      

// -[WCGMultiDownloader lock] IMP=0x2EE4D0 bounds=0x2EE4D0-0x2EE4D8
loc_2EE4D0:
    ldr      x0, [x0, #0x48]
    ret      

// -[WCGMultiDownloader setLock:] IMP=0x2EE4D8 bounds=0x2EE4D8-0x2EE4E4
loc_2EE4D8:
    mov      x1, x2
    add      x0, x0, #0x48
    b        #0x461cfc // _objc_storeStrong

// -[WCGMultiDownloader speedTimer] IMP=0x2EE4E4 bounds=0x2EE4E4-0x2EE4EC
loc_2EE4E4:
    ldr      x0, [x0, #0x50]
    ret      

// -[WCGMultiDownloader setSpeedTimer:] IMP=0x2EE4EC bounds=0x2EE4EC-0x2EE4F8
loc_2EE4EC:
    mov      x1, x2
    add      x0, x0, #0x50
    b        #0x461cfc // _objc_storeStrong

// -[WCGMultiDownloader lastSampleBytes] IMP=0x2EE4F8 bounds=0x2EE4F8-0x2EE500
loc_2EE4F8:
    ldr      x0, [x0, #0x58]
    ret      

// -[WCGMultiDownloader setLastSampleBytes:] IMP=0x2EE500 bounds=0x2EE500-0x2EE508
loc_2EE500:
    str      x2, [x0, #0x58]
    ret      

// -[WCGMultiDownloader lastSampleTime] IMP=0x2EE508 bounds=0x2EE508-0x2EE510
loc_2EE508:
    ldr      d0, [x0, #0x60]
    ret      

// -[WCGMultiDownloader setLastSampleTime:] IMP=0x2EE510 bounds=0x2EE510-0x2EE518
loc_2EE510:
    str      d0, [x0, #0x60]
    ret      

// -[WCGMultiDownloader progress] IMP=0x2EE518 bounds=0x2EE518-0x2EE520
loc_2EE518:
    ldr      x0, [x0, #0x68]
    ret      

// -[WCGMultiDownloader setProgress:] IMP=0x2EE520 bounds=0x2EE520-0x2EE528
loc_2EE520:
    mov      w3, #0x68
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCGMultiDownloader done] IMP=0x2EE528 bounds=0x2EE528-0x2EE530
loc_2EE528:
    ldr      x0, [x0, #0x70]
    ret      

// -[WCGMultiDownloader setDone:] IMP=0x2EE530 bounds=0x2EE530-0x2EE538
loc_2EE530:
    mov      w3, #0x70
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCGMultiDownloader .cxx_destruct] IMP=0x2EE538 bounds=0x2EE538-0x2EE5A4
loc_2EE538:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    add      x0, x0, #0x70
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x68
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x50
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x48
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x30
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x18
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x10
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
