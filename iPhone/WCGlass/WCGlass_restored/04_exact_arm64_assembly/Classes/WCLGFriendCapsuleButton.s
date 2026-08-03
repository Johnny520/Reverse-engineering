// Exact ARM64 listing for WCLGFriendCapsuleButton

// +[WCLGFriendCapsuleButton wclgCapsuleConfiguration] IMP=0x3130C0 bounds=0x3130C0-0x313348
loc_3130C0:
    adrp     x8, #0x580000
    add      x8, x8, #0xa88
    ldar     w9, [x8]
    cbnz     w9, #0x313244
    adrp     x9, #0x547000
    add      x9, x9, #0x530
    ldrb     w10, [x9]
    mov      w11, #0xc5
    eor      w11, w10, w11
    adrp     x10, #0x547000
    add      x10, x10, #0x550
    strb     w11, [x10]
    ldrb     w11, [x9, #1]
    mov      w12, #0xb8
    eor      w11, w11, w12
    strb     w11, [x10, #1]
    ldrb     w11, [x9, #2]
    mov      w12, #0xd3
    eor      w11, w11, w12
    strb     w11, [x10, #2]
    ldrb     w11, [x9, #3]
    eor      w11, w11, #4
    strb     w11, [x10, #3]
    ldrb     w11, [x9, #4]
    mov      w13, #0x52
    eor      w11, w11, w13
    strb     w11, [x10, #4]
    ldrb     w11, [x9, #5]
    eor      w11, w11, #0xdddddddd
    strb     w11, [x10, #5]
    ldrb     w11, [x9, #6]
    eor      w11, w11, #0xffffff83
    strb     w11, [x10, #6]
    ldrb     w11, [x9, #7]
    mov      w13, #0xda
    eor      w11, w11, w13
    strb     w11, [x10, #7]
    ldrb     w11, [x9, #8]
    eor      w11, w11, #4
    strb     w11, [x10, #8]
    ldrb     w11, [x9, #9]
    eor      w11, w11, #0x7c
    strb     w11, [x10, #9]
    ldrb     w11, [x9, #0xa]
    mov      w13, #0x53
    eor      w11, w11, w13
    strb     w11, [x10, #0xa]
    ldrb     w11, [x9, #0xb]
    mov      w13, #0xcd
    eor      w11, w11, w13
    strb     w11, [x10, #0xb]
    ldrb     w11, [x9, #0xc]
    eor      w11, w11, #0xffffffc7
    strb     w11, [x10, #0xc]
    ldrb     w11, [x9, #0xd]
    mov      w13, #0x36
    eor      w11, w11, w13
    strb     w11, [x10, #0xd]
    ldrb     w11, [x9, #0xe]
    mov      w13, #0x76
    eor      w11, w11, w13
    strb     w11, [x10, #0xe]
    ldrb     w11, [x9, #0xf]
    eor      w11, w11, #0xf
    strb     w11, [x10, #0xf]
    ldrb     w11, [x9, #0x10]
    eor      w11, w11, w12
    strb     w11, [x10, #0x10]
    ldrb     w11, [x9, #0x11]
    mov      w12, #0xb4
    eor      w11, w11, w12
    strb     w11, [x10, #0x11]
    ldrb     w11, [x9, #0x12]
    mov      w12, #0x57
    eor      w11, w11, w12
    strb     w11, [x10, #0x12]
    ldrb     w11, [x9, #0x13]
    mov      w12, #0xca
    eor      w11, w11, w12
    strb     w11, [x10, #0x13]
    ldrb     w11, [x9, #0x14]
    eor      w11, w11, #0xffffffc1
    strb     w11, [x10, #0x14]
    ldrb     w11, [x9, #0x15]
    eor      w11, w11, #3
    strb     w11, [x10, #0x15]
    ldrb     w11, [x9, #0x16]
    mov      w12, #0x1a
    eor      w11, w11, w12
    strb     w11, [x10, #0x16]
    ldrb     w11, [x9, #0x17]
    mov      w12, #0xb1
    eor      w11, w11, w12
    strb     w11, [x10, #0x17]
    ldrb     w9, [x9, #0x18]
    eor      w9, w9, #0x44444444
    strb     w9, [x10, #0x18]
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x21, #0x4c4000
    ldr      x0, [x21, #0x578]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    adrp     x0, #0x547000
    add      x0, x0, #0x590
    bl       #0x4617a4 // _NSSelectorFromString
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3132b8
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cbnz     x0, #0x3132d4
    ldr      x0, [x21, #0x578]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xa60]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xa68]
    mov      x0, x19
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x300]
    ldp      d0, d1, [x8]
    ldp      d2, d3, [x8, #0x10]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xa70]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb80]
    adrp     x2, #0x4a6000
    add      x2, x2, #0xd8
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGFriendCapsuleButton initWithFrame:] IMP=0x313348 bounds=0x313348-0x3138E4
loc_313348:
    sub      sp, sp, #0xb0
    stp      d13, d12, [sp, #0x20]
    stp      d11, d10, [sp, #0x30]
    stp      d9, d8, [sp, #0x40]
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7b8]
    stp      x0, x8, [sp, #0x10]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xb38]
    add      x0, sp, #0x10
    mov      x1, x21
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x19, x0
    cbz      x0, #0x3138b4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    mov      x0, x19
    str      x1, [sp, #8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xa78]
    mov      x0, x19
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x320]
    ldr      x2, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x2b0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      w0, #2
    mov      w1, #0xf
    mov      w2, #0
    mov      w3, #0
    bl       #0x45e7d8
    cbz      w0, #0x313454
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xa80]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x760]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x440]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xb40]
    b        #0x3134e4
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x180]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc30]
    mov      w2, #8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x148]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbb8]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x20, [x8, #0xd30]
    ldr      x8, [x19, x20]
    str      x0, [x19, x20]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x20]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x440]
    mov      x1, x23
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x20]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xb40]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x608]
    ldp      d8, d9, [x8]
    ldp      d10, d11, [x8, #0x10]
    mov      x1, x21
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x20, [x8, #0xd34]
    ldr      x8, [x19, x20]
    str      x0, [x19, x20]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    bl       #0x3138e4
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x0, [x19, x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    str      x1, [sp]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x20]
    mov      x1, x23
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x20]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x21
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x20, [x8, #0xd38]
    ldr      x8, [x19, x20]
    str      x0, [x19, x20]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x430]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x20]
    mov      x1, x23
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x20]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x28, #0x4c4000
    ldr      x0, [x28, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x21
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x24, [x8, #0xd3c]
    ldr      x8, [x19, x24]
    str      x0, [x19, x24]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x20, #0x4c4000
    ldr      x0, [x20, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d12, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    fmov     d0, #15.50000000
    fmov     d1, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x0, [x19, x24]
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0xec8]
    mov      x1, x26
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    bl       #0x3139b0
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    ldr      x0, [x19, x24]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xea8]
    mov      x1, x25
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x24]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xef0]
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x24]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x200]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x24]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x208]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3c0]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x24]
    mov      x1, x23
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x24]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x28, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x21
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x27, [x8, #0xd40]
    ldr      x8, [x19, x27]
    str      x0, [x19, x27]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x0, [x20, #0x218]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9e0]
    fmov     d0, #11.50000000
    fmov     d1, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x0, [x19, x27]
    mov      x1, x26
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x458]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x0, [x19, x27]
    mov      x1, x25
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    bl       #0x313a58
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x0, [x19, x27]
    ldr      x1, [sp]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x27]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1f8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x27]
    ldr      x1, [sp, #8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x27]
    mov      x1, x23
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x27]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x27]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x3, [x8, #0xa88]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    mov      x0, x19
    mov      x2, x19
    mov      w4, #0x40
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x400]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c1000
    ldr      x3, [x8, #0xa90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x440]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x308]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x400]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x450]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    ldp      d9, d8, [sp, #0x40]
    ldp      d11, d10, [sp, #0x30]
    ldp      d13, d12, [sp, #0x20]
    add      sp, sp, #0xb0
    ret      

// -[WCLGFriendCapsuleButton didMoveToWindow] IMP=0x313B00 bounds=0x313B00-0x313BE8
loc_313B00:
    sub      sp, sp, #0x30
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7b8]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6d8]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4a8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x461c9c // _objc_release
    cbz      x20, #0x313bbc
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    cbz      x19, #0x313bb4
    adrp     x8, #0x580000
    ldr      x8, [x8, #0x9f8]
    cmn      x8, #1
    b.ne     #0x313bcc
    adrp     x8, #0x580000
    ldr      x20, [x8, #0x9f0]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    bl       #0x461ca8 // _objc_retain
    bl       #0x461d14 // _objc_sync_enter
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x830]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461d20 // _objc_sync_exit
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    add      sp, sp, #0x30
    ret      
    bl       #0x4604ec
    b        #0x313b70
    mov      x19, x0
    mov      x0, x20
    bl       #0x461d20 // _objc_sync_exit
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGFriendCapsuleButton configureUsername:unread:] IMP=0x313BE8 bounds=0x313BE8-0x314040
loc_313BE8:
    sub      sp, sp, #0xa0
    stp      d9, d8, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      x20, x3
    mov      x19, x0
    adrp     x8, #0x4a6000
    add      x8, x8, #0xd8
    cmp      x2, #0
    csel     x2, x8, x2, eq
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xa98]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x22, [x8, #0xaa0]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    bl       #0x314040
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xe60]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    bl       #0x3139b0
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x19
    mov      x1, x21
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
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x460]
    mov      x0, x19
    mov      x1, x24
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    bl       #0x3138e4
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xaa8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x1, x24
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x4d8]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    fmov     d8, d0
    adrp     x8, #0x491000
    ldr      d0, [x8, #0xbd0]
    fcmp     d8, d0
    cset     w24, mi
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616b4 // _CGRectGetHeight
    fmov     d1, #-10.00000000
    fadd     d0, d0, d1
    fmov     d1, #24.00000000
    fmaxnm   d0, d0, d1
    adrp     x8, #0x492000
    add      x8, x8, #0x240
    ldr      d2, [x8, w24, uxtw #3]
    fmul     d2, d8, d2
    mov      x8, #0x404a000000000000
    fmov     d3, x8
    fcmp     d2, d3
    fcsel    d2, d3, d2, gt
    fmaxnm   d1, d2, d1
    fcmp     d0, d1
    fcsel    d8, d0, d1, mi
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461ca8 // _objc_retain
    fmov     d0, d8
    bl       #0x37d6f0
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xc8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb60]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x690]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xd0]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x698]
    fmov     d0, d8
    fmov     d1, d8
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x740]
    str      x8, [sp, #8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x398]
    str      d0, [sp, #0x10]
    adrp     x8, #0x31a000
    add      x8, x8, #0x284
    adrp     x9, #0x4a4000
    add      x9, x9, #0x9d8
    stp      x8, x9, [sp, #0x18]
    str      d8, [sp, #0x38]
    stp      x24, x22, [sp, #0x28]
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x6b8]
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    add      x2, sp, #8
    mov      x0, x25
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x3c0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      w0, #2
    mov      w1, #0xf
    mov      w2, #0
    mov      w3, #0
    bl       #0x45e7d8
    cbz      w0, #0x313fac
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xa80]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x760]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xab0]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x7a0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xeb0]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e8]
    mov      x0, x19
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      d9, d8, [sp, #0x40]
    add      sp, sp, #0xa0
    b        #0x461c6c // _objc_msgSend

// -[WCLGFriendCapsuleButton setUnreadCount:] IMP=0x3141C4 bounds=0x3141C4-0x314508
loc_3141C4:
    sub      sp, sp, #0x60
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x20, x2
    mov      x19, x0
    adrp     x8, #0x580000
    add      x8, x8, #0xaa8
    ldar     w9, [x8]
    cbnz     w9, #0x314338
    adrp     x9, #0x547000
    add      x9, x9, #0x5ec
    ldrb     w10, [x9]
    eor      w10, w10, #0xffffffe3
    adrp     x11, #0x547000
    add      x11, x11, #0x5f0
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xf8
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xd7
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w9, [x9, #3]
    mov      w10, #0xc6
    eor      w9, w9, w10
    strb     w9, [x11, #3]
    adrp     x9, #0x547000
    add      x9, x9, #0x5e4
    ldrb     w10, [x9]
    eor      w10, w10, #3
    adrp     x11, #0x547000
    add      x11, x11, #0x5e8
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xa1
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #2
    strb     w10, [x11, #2]
    ldrb     w9, [x9, #3]
    mov      w10, #0x89
    eor      w9, w9, w10
    strb     w9, [x11, #3]
    adrp     x9, #0x547000
    add      x9, x9, #0x5b0
    ldrh     w10, [x9]
    mov      w11, #0xf857
    eor      w10, w10, w11
    adrp     x11, #0x547000
    add      x11, x11, #0x5d0
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xffbe
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xa713
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x8d37
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x5b44
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0x5867
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0xe711
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w10, [x9, #0xe]
    mov      w12, #0xc93c
    eor      w10, w10, w12
    strh     w10, [x11, #0xe]
    ldrh     w10, [x9, #0x10]
    mov      w12, #0x46dc
    eor      w10, w10, w12
    strh     w10, [x11, #0x10]
    ldrh     w9, [x9, #0x12]
    mov      w10, #0xa06e
    eor      w9, w9, w10
    strh     w9, [x11, #0x12]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c1000
    ldr      x21, [x8, #0xab8]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    cmp      x20, #1
    b.lt     #0x3143b8
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x24, #0x4c4000
    adrp     x25, #0x4be000
    cmp      x20, #0x63
    b.hi     #0x314410
    ldr      x0, [x24, #0xb8]
    ldr      x1, [x25, #0x620]
    str      x20, [sp]
    adrp     x2, #0x547000
    add      x2, x2, #0x6a0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    b        #0x314418
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xac0]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    b        #0x3144e0
    adrp     x22, #0x547000
    add      x22, x22, #0x660
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cmp      x20, #0x63
    b.hi     #0x314458
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    bl       #0x313a58
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x24, #0xb8]
    ldr      x1, [x25, #0x620]
    str      x20, [sp]
    adrp     x2, #0x547000
    add      x2, x2, #0x620
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xac0]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e8]
    mov      x0, x19
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    add      sp, sp, #0x60
    b        #0x461c6c // _objc_msgSend

// -[WCLGFriendCapsuleButton layoutSubviews] IMP=0x314508 bounds=0x314508-0x314CA4
loc_314508:
    sub      sp, sp, #0xb0
    stp      d15, d14, [sp, #0x10]
    stp      d13, d12, [sp, #0x20]
    stp      d11, d10, [sp, #0x30]
    stp      d9, d8, [sp, #0x40]
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7b8]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x4d8]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    fmov     d9, d0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616b4 // _CGRectGetHeight
    fmov     d8, d0
    fmov     d15, #0.50000000
    fmul     d10, d0, d15
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xac8]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xb48]
    mov      x1, x23
    fmov     d0, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x628]
    ldr      x24, [x8]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0xb50]
    mov      x1, x26
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d11, d0
    fmov     d12, d1
    fmov     d13, d2
    fmov     d14, d3
    adrp     x8, #0x4c1000
    ldr      x25, [x8, #0xac8]
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x678]
    mov      x1, x20
    fmov     d0, d11
    fmov     d1, d12
    fmov     d2, d13
    fmov     d3, d14
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x1, x23
    fmov     d0, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x438]
    mov      x1, x25
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d11, d0
    fmov     d12, d1
    fmov     d13, d2
    fmov     d14, d3
    adrp     x8, #0x4c1000
    ldr      x21, [x8, #0xaa8]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x1, x20
    fmov     d0, d11
    fmov     d1, d12
    fmov     d2, d13
    fmov     d3, d14
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x1, x23
    fmov     d0, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x1, x26
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x1, x25
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x491000
    ldr      d14, [x8, #0xbd0]
    fcmp     d9, d14
    cset     w8, mi
    fmov     d0, #-10.00000000
    fadd     d0, d8, d0
    fmov     d1, #24.00000000
    fmaxnm   d0, d0, d1
    adrp     x9, #0x492000
    add      x9, x9, #0x240
    ldr      d2, [x9, w8, uxtw #3]
    fmul     d2, d9, d2
    fmov     d4, #5.00000000
    fmov     d3, #4.00000000
    fcsel    d10, d3, d4, mi
    fmov     d3, #12.00000000
    fmov     d4, #8.00000000
    fcsel    d13, d4, d3, mi
    mov      x8, #0x404a000000000000
    fmov     d3, x8
    fcmp     d2, d3
    fcsel    d2, d3, d2, gt
    fmaxnm   d1, d2, d1
    fcmp     d0, d1
    fcsel    d11, d0, d1, mi
    fsub     d0, d8, d11
    fmul     d12, d0, d15
    adrp     x8, #0x4c0000
    ldr      x24, [x8, #0x3c0]
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x20
    fmov     d0, d10
    fmov     d1, d12
    fmov     d2, d11
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    fmul     d10, d11, d15
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x1, x23
    fmov     d0, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x25
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x25, [x8, #0xab8]
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9a8]
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    tbnz     w27, #0, #0x314a94
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x378]
    fmul     d0, d8, d0
    fmov     d1, #17.00000000
    fmaxnm   d0, d0, d1
    fmov     d1, #20.00000000
    fcmp     d0, d1
    fcsel    d10, d1, d0, gt
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x248]
    mov      x8, #0x7fefffffffffffff
    fmov     d0, x8
    fmov     d1, d10
    bl       #0x461c6c // _objc_msgSend
    fmov     d11, d0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    fmov     d0, #9.00000000
    fadd     d0, d11, d0
    fcmp     d10, d0
    fcsel    d11, d0, d10, mi
    fsub     d0, d9, d13
    fsub     d12, d0, d11
    fsub     d0, d8, d10
    fmov     d1, #0.50000000
    fmov     d15, d9
    fmov     d9, d13
    fmul     d13, d0, d1
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x20
    fmov     d0, d12
    fmov     d1, d13
    fmov     d13, d9
    fmov     d9, d15
    fmov     d2, d11
    fmov     d3, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    fmov     d0, #0.50000000
    fmul     d10, d10, d0
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x1, x23
    fmov     d0, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    fcmp     d15, d14
    fmov     d0, #3.00000000
    fmov     d1, #8.00000000
    fcsel    d0, d0, d1, mi
    fadd     d0, d0, d11
    fadd     d13, d13, d0
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x770]
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616c0 // _CGRectGetMaxX
    fcmp     d9, d14
    fmov     d1, #9.00000000
    fmov     d2, #5.00000000
    fcsel    d1, d2, d1, mi
    fadd     d10, d1, d0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x8e0]
    fmul     d0, d9, d0
    fmov     d1, #11.00000000
    fmaxnm   d0, d0, d1
    fmov     d1, #15.50000000
    fcmp     d0, d1
    fcsel    d0, d1, d0, gt
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0xe60]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    fsub     d0, d9, d10
    fsub     d0, d0, d13
    fmov     d1, xzr
    fmaxnm   d9, d0, d1
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    fmov     d1, xzr
    mov      x1, x20
    fmov     d0, d10
    fmov     d2, d9
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x9d0]
    mov      x0, x19
    mov      x1, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    ldp      d9, d8, [sp, #0x40]
    ldp      d11, d10, [sp, #0x30]
    ldp      d13, d12, [sp, #0x20]
    ldp      d15, d14, [sp, #0x10]
    add      sp, sp, #0xb0
    ret      

// -[WCLGFriendCapsuleButton setHighlighted:] IMP=0x314CA4 bounds=0x314CA4-0x314D94
loc_314CA4:
    sub      sp, sp, #0x90
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7b8]
    stp      x0, x8, [x29, #-0x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x748]
    sub      x0, x29, #0x20
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      w0, #2
    mov      w1, #0xf
    mov      w2, #0
    mov      w3, #0
    bl       #0x45e7d8
    mov      x8, x0
    adrp     x9, #0x4c4000
    ldr      x0, [x9, #0x78]
    cbz      w8, #0x314d38
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp, #0x30]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    adrp     x8, #0x314000
    add      x8, x8, #0xd94
    adrp     x9, #0x4a4000
    add      x9, x9, #0xa18
    str      d0, [sp, #0x38]
    stp      x8, x9, [sp, #0x40]
    strb     w19, [sp, #0x58]
    str      x20, [sp, #0x50]
    add      x2, sp, #0x30
    b        #0x314d70
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    adrp     x8, #0x314000
    add      x8, x8, #0xe6c
    adrp     x9, #0x4a4000
    add      x9, x9, #0xa18
    str      d0, [sp, #8]
    stp      x8, x9, [sp, #0x10]
    str      x20, [sp, #0x20]
    strb     w19, [sp, #0x28]
    mov      x2, sp
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x7f0]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3b0]
    bl       #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    add      sp, sp, #0x90
    ret      

// -[WCLGFriendCapsuleButton wclgHandleTap] IMP=0x314F18 bounds=0x314F18-0x315030
loc_314F18:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x570]
    bl       #0x461bac // _objc_alloc_init
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xa10]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x20, [x8, #0xad0]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cbz      x0, #0x31501c
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x21, [x8, #0xaa0]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbz      x24, #0x31501c
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x8, [x20, #0x10]
    mov      x0, x20
    mov      x1, x19
    blr      x8
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    ret      

// -[WCLGFriendCapsuleButton wclgHandleLongPress:] IMP=0x315030 bounds=0x315030-0x315160
loc_315030:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x3d0]
    mov      x0, x2
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    b.ne     #0x315150
    adrp     x8, #0x4c1000
    ldr      x20, [x8, #0xaa0]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cbz      x22, #0x315150
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x238]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x478]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x480]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x21, [x8, #0xad8]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461c9c // _objc_release
    cbz      x22, #0x315150
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x8, [x21, #0x10]
    mov      x0, x21
    mov      x1, x19
    blr      x8
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    ret      

// -[WCLGFriendCapsuleButton username] IMP=0x315160 bounds=0x315160-0x315170
loc_315160:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd44]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGFriendCapsuleButton setUsername:] IMP=0x315170 bounds=0x315170-0x31517C
loc_315170:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xd44]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGFriendCapsuleButton avatarView] IMP=0x31517C bounds=0x31517C-0x31518C
loc_31517C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd38]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGFriendCapsuleButton setAvatarView:] IMP=0x31518C bounds=0x31518C-0x3151A0
loc_31518C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd38]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFriendCapsuleButton nameLabel] IMP=0x3151A0 bounds=0x3151A0-0x3151B0
loc_3151A0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd3c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGFriendCapsuleButton setNameLabel:] IMP=0x3151B0 bounds=0x3151B0-0x3151C4
loc_3151B0:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd3c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFriendCapsuleButton badgeLabel] IMP=0x3151C4 bounds=0x3151C4-0x3151D4
loc_3151C4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd40]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGFriendCapsuleButton setBadgeLabel:] IMP=0x3151D4 bounds=0x3151D4-0x3151E8
loc_3151D4:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd40]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFriendCapsuleButton fallbackGlassView] IMP=0x3151E8 bounds=0x3151E8-0x3151F8
loc_3151E8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd30]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGFriendCapsuleButton setFallbackGlassView:] IMP=0x3151F8 bounds=0x3151F8-0x31520C
loc_3151F8:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd30]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFriendCapsuleButton colorTintView] IMP=0x31520C bounds=0x31520C-0x31521C
loc_31520C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd34]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGFriendCapsuleButton setColorTintView:] IMP=0x31521C bounds=0x31521C-0x315230
loc_31521C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd34]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFriendCapsuleButton onTap] IMP=0x315230 bounds=0x315230-0x315240
loc_315230:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd48]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGFriendCapsuleButton setOnTap:] IMP=0x315240 bounds=0x315240-0x31524C
loc_315240:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xd48]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGFriendCapsuleButton onLongPress] IMP=0x31524C bounds=0x31524C-0x31525C
loc_31524C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd4c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGFriendCapsuleButton setOnLongPress:] IMP=0x31525C bounds=0x31525C-0x315268
loc_31525C:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xd4c]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGFriendCapsuleButton .cxx_destruct] IMP=0x315268 bounds=0x315268-0x315320
loc_315268:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd4c]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd48]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd34]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd30]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd40]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd3c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd38]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd44]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
