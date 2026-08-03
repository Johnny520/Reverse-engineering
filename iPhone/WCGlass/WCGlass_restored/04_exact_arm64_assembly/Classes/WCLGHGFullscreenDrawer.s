// Exact ARM64 listing for WCLGHGFullscreenDrawer

// -[WCLGHGFullscreenDrawer initWithController:fromLeft:anchorY:] IMP=0x3339E0 bounds=0x3339E0-0x333DF8
loc_3339E0:
    sub      sp, sp, #0xa0
    stp      d13, d12, [sp, #0x10]
    stp      d11, d10, [sp, #0x20]
    stp      d9, d8, [sp, #0x30]
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    fmov     d8, d0
    mov      x23, x3
    mov      x19, x2
    mov      x21, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4a8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbz      x20, #0x333a8c
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x4d8]
    mov      x0, x20
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    fmov     d10, d1
    fmov     d11, d2
    fmov     d12, d3
    b        #0x333ad4
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x128]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x4d8]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    fmov     d10, d1
    fmov     d11, d2
    fmov     d12, d3
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7e0]
    stp      x21, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xb38]
    mov      x0, sp
    mov      x1, x22
    fmov     d0, d9
    fmov     d1, d10
    fmov     d2, d11
    fmov     d3, d12
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x21, x0
    cbz      x0, #0x333db0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd98]
    add      x0, x21, x8
    mov      x1, x19
    bl       #0x461d08 // _objc_storeWeak
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd9c]
    strb     w23, [x21, x8]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xda0]
    str      d8, [x21, x8]
    adrp     x27, #0x4c4000
    ldr      x0, [x27, #0x90]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xab8]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x460]
    mov      x0, x21
    mov      x1, x24
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x238]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x478]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xde0]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xda4]
    ldr      x0, [x21, x8]
    str      x26, [x21, x8]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x198]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xcd8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc60]
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    fmov     d0, #30.00000000
    fcmp     d8, d0
    fmov     d0, #11.00000000
    fccmp    d8, d0, #8, le
    adrp     x8, #0x492000
    ldr      d0, [x8, #0x258]
    fcsel    d8, d0, d8, mi
    fmov     d0, d9
    fmov     d1, d10
    fmov     d2, d11
    fmov     d3, d12
    bl       #0x461708 // _CGRectGetWidth
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x458]
    fmul     d0, d0, d1
    frinta   d0, d0
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x8e8]
    fmaxnm   d0, d0, d1
    mov      x8, #0x406e000000000000
    fmov     d1, x8
    fcmp     d0, d1
    fcsel    d0, d1, d0, gt
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xda8]
    str      d0, [x21, x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x150]
    bl       #0x461ba0 // _objc_alloc
    mov      x26, x0
    mov      x0, x21
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x26, [x8, #0xdac]
    ldr      x8, [x21, x26]
    str      x0, [x21, x26]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x0, [x21, x26]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x448]
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x27, #0x90]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x0, [x21, x26]
    mov      x1, x24
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldr      x0, [x21, x26]
    adrp     x8, #0x4c1000
    ldr      x3, [x8, #0xde8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    mov      x2, x21
    mov      w4, #0x40
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x21, x26]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xb40]
    mov      x0, x21
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x608]
    ldp      d0, d1, [x8]
    ldp      d2, d3, [x8, #0x10]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x26, [x8, #0xdb0]
    ldr      x8, [x21, x26]
    str      x0, [x21, x26]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x0, [x27, #0x90]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x0, [x21, x26]
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x2, [x21, x26]
    mov      x0, x21
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xdf0]
    mov      x0, x21
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    ldp      d9, d8, [sp, #0x30]
    ldp      d11, d10, [sp, #0x20]
    ldp      d13, d12, [sp, #0x10]
    add      sp, sp, #0xa0
    ret      

// -[WCLGHGFullscreenDrawer buildPillsWithFontSize:] IMP=0x333DF8 bounds=0x333DF8-0x3351B8
loc_333DF8:
    stp      d15, d14, [sp, #-0xa0]!
    stp      d13, d12, [sp, #0x10]
    stp      d11, d10, [sp, #0x20]
    stp      d9, d8, [sp, #0x30]
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    sub      sp, sp, #0x1b0
    fmov     d8, d0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0xa0]
    adrp     x8, #0x580000
    add      x8, x8, #0xfcc
    ldar     w9, [x8]
    cbnz     w9, #0x33403c
    adrp     x9, #0x549000
    add      x9, x9, #0x9f8
    ldrb     w10, [x9]
    mov      w11, #0x3b
    eor      w10, w10, w11
    adrp     x11, #0x549000
    add      x11, x11, #0xa06
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x13
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x12
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #4
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x8c
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x25
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    eor      w10, w10, #0xffffffbf
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0x4e
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w12, #0x16
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    mov      w12, #0x49
    eor      w10, w10, w12
    strb     w10, [x11, #9]
    ldrb     w10, [x9, #0xa]
    mov      w12, #0x5d
    eor      w10, w10, w12
    strb     w10, [x11, #0xa]
    ldrb     w10, [x9, #0xb]
    eor      w10, w10, #0x38
    strb     w10, [x11, #0xb]
    ldrb     w10, [x9, #0xc]
    eor      w10, w10, #0x22222222
    strb     w10, [x11, #0xc]
    ldrb     w9, [x9, #0xd]
    mov      w10, #0xf5
    eor      w9, w9, w10
    strb     w9, [x11, #0xd]
    adrp     x9, #0x549000
    add      x9, x9, #0x9f0
    ldrb     w10, [x9]
    mov      w11, #0x8d
    eor      w10, w10, w11
    adrp     x11, #0x549000
    add      x11, x11, #0x9f4
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x53
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xbd
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w9, [x9, #3]
    mov      w10, #0x2b
    eor      w9, w9, w10
    strb     w9, [x11, #3]
    adrp     x9, #0x549000
    add      x9, x9, #0x9d8
    ldrh     w10, [x9]
    mov      w11, #0xa658
    adrp     x12, #0x549000
    add      x12, x12, #0x9e4
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x8f37
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x201b
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x79d3
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0x6a2d
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w9, [x9, #0xa]
    mov      w10, #0x8499
    eor      w9, w9, w10
    strh     w9, [x12, #0xa]
    adrp     x9, #0x549000
    add      x9, x9, #0x9d0
    ldrb     w10, [x9]
    mov      w11, #0x8e
    eor      w10, w10, w11
    adrp     x11, #0x549000
    add      x11, x11, #0x9d4
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x6b
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xec
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w9, [x9, #3]
    mov      w10, #0x90
    eor      w9, w9, w10
    strb     w9, [x11, #3]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x10
    stur     x8, [x29, #-0xa8]
    mov      sp, x8
    sub      x8, sp, #0x10
    stur     x8, [x29, #-0xb0]
    mov      sp, x8
    sub      x8, sp, #0x10
    stur     x8, [x29, #-0xb8]
    mov      sp, x8
    sub      x23, sp, #0x10
    mov      sp, x23
    mov      x8, sp
    sub      x24, x8, #0x40
    mov      sp, x24
    sub      x25, sp, #0x80
    mov      sp, x25
    movi     v0.16b, #0
    stp      q0, q0, [x8, #-0x20]
    stp      q0, q0, [x8, #-0x40]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xdf8]
    sub      x8, x29, #8
    stur     x0, [x8, #-0x100]
    sub      x8, x29, #0x10
    stur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x7c0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x19, [x8, #0x478]
    mov      x0, x26
    mov      x1, x19
    mov      x2, x24
    mov      x3, x25
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x334180
    mov      x27, x0
    ldr      x8, [x24, #0x10]
    ldr      x20, [x8]
    adrp     x21, #0x4be000
    mov      x22, #0
    ldr      x28, [x21, #0xb30]
    ldr      x8, [x24, #0x10]
    ldr      x8, [x8]
    cmp      x8, x20
    b.eq     #0x334144
    mov      x0, x26
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x24, #8]
    ldr      x0, [x8, x22, lsl #3]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    add      x22, x22, #1
    cmp      x27, x22
    b.ne     #0x33412c
    mov      x0, x26
    mov      x1, x19
    mov      x2, x24
    mov      x3, x25
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    cbnz     x0, #0x334124
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe00]
    sub      x8, x29, #8
    ldur     x20, [x8, #-0x100]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x438]
    mov      x0, x20
    mov      x2, #0x7fffffffffffffff
    bl       #0x461c6c // _objc_msgSend
    adrp     x27, #0x4c4000
    ldr      x0, [x27, #0x198]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xcd8]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xce0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe08]
    sub      x8, x29, #0xf8
    stur     x19, [x8, #-0x100]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    sub      x8, x29, #0x38
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x4bf000
    ldr      x24, [x8, #0x68]
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4a8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x22, #0x4be000
    cbz      x20, #0x3342e0
    ldr      x1, [x22, #0x4d8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    fmov     d11, d1
    fmov     d12, d2
    fmov     d13, d3
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x190]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    sub      x8, x29, #0x130
    stur     d0, [x8, #-0x100]
    fmov     d9, d2
    b        #0x334338
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x128]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x1, [x22, #0x4d8]
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    fmov     d11, d1
    fmov     d12, d2
    fmov     d13, d3
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x350]
    ldr      d0, [x8]
    sub      x9, x29, #0x130
    stur     d0, [x9, #-0x100]
    ldr      d9, [x8, #0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3f0]
    sub      x8, x29, #8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3f8]
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [x27, #0x198]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe98]
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x128
    stur     d9, [x8, #-0x100]
    cbz      x19, #0x334420
    ldp      x25, x22, [x29, #-0xb0]
    str      xzr, [x22]
    str      xzr, [x25]
    ldur     x26, [x29, #-0xb8]
    str      xzr, [x26]
    mov      x8, #0x3ff0000000000000
    str      x8, [x23]
    mov      x0, x19
    mov      x1, x22
    mov      x2, x25
    mov      x3, x26
    mov      x4, x23
    bl       #0x260674
    cbz      w0, #0x334420
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    ldr      d0, [x22]
    ldr      d1, [x25]
    ldr      d2, [x26]
    ldr      d3, [x23]
    fcmp     d3, #0.0
    fmov     d4, #1.00000000
    fcsel    d3, d4, d3, ls
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8f8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    b        #0x334450
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    cmp      x28, #2
    b.ne     #0x33443c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x458]
    b        #0x334444
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x450]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x20
    stur     x0, [x8, #-0x100]
    sub      x8, x29, #8
    ldur     x27, [x8, #-0x100]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe10]
    mov      x0, x27
    sub      x8, x29, #0x140
    stur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    mov      x0, x27
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x3351b8
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3344ec
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    sub      x8, x29, #0xc0
    stur     x22, [x8, #-0x100]
    b        #0x3344f4
    sub      x8, x29, #0xc0
    stur     xzr, [x8, #-0x100]
    sub      x8, x29, #0x138
    stur     x22, [x8, #-0x100]
    sub      x8, x29, #0x120
    stur     d13, [x8, #-0x100]
    sub      x8, x29, #0x118
    stur     d12, [x8, #-0x100]
    sub      x8, x29, #0x110
    stur     d11, [x8, #-0x100]
    sub      x8, x29, #0x108
    stur     d10, [x8, #-0x100]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd50]
    sub      x8, x29, #0xf8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    sub      x8, x29, #0x3c
    stur     w0, [x8, #-0x100]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    mov      x0, x21
    sub      x8, x29, #0x28
    stur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x26, [x8, #0xcf0]
    adrp     x22, #0x4be000
    adrp     x14, #0x4be000
    cmp      x0, #1
    sub      x8, x29, #0x18
    stur     x21, [x8, #-0x100]
    sub      x8, x29, #0x100
    stur     x20, [x8, #-0x100]
    b.lt     #0x334e4c
    sub      x8, x29, #0x30
    stur     x26, [x8, #-0x100]
    mov      x26, #0
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xb38]
    stur     x8, [x29, #-0xd0]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0xc30]
    sub      x9, x29, #0x48
    stur     x8, [x9, #-0x100]
    fmov     d0, #-28.00000000
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xac8]
    fadd     d15, d9, d0
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xb48]
    stur     x8, [x29, #-0xb0]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x628]
    ldr      x8, [x8]
    stur     x8, [x29, #-0xd8]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0xb50]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x438]
    stp      x8, x9, [x29, #-0xc0]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xe18]
    sub      x9, x29, #0x50
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0xec8]
    sub      x9, x29, #0x58
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xc38]
    sub      x9, x29, #0xa0
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x3e0]
    sub      x9, x29, #0xa8
    stur     x8, [x9, #-0x100]
    cmp      x28, #2
    mov      w8, #0xd
    mov      w9, #0x12
    csel     x8, x9, x8, eq
    sub      x9, x29, #0xb0
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xc30]
    sub      x9, x29, #0xb8
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xbb8]
    sub      x9, x29, #0x60
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x4d8]
    sub      x9, x29, #0x68
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x448]
    sub      x9, x29, #0x70
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x440]
    stur     x8, [x29, #-0xc8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xb40]
    stur     x8, [x29, #-0xa8]
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x70]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x338]
    sub      x9, x29, #0x80
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x6f8]
    stur     x8, [x29, #-0xe0]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d13, [x8]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x378]
    adrp     x9, #0x4bf000
    ldr      d10, [x8]
    adrp     x8, #0x4be000
    adrp     x10, #0x4be000
    ldr      x9, [x9, #0x230]
    stur     x9, [x29, #-0xe8]
    adrp     x9, #0x4be000
    adrp     x11, #0x4be000
    ldr      x8, [x8, #0xec8]
    stur     x8, [x29, #-0xf0]
    adrp     x8, #0x4be000
    adrp     x12, #0x4bf000
    ldr      x10, [x10, #0xea8]
    stur     x10, [x29, #-0xf8]
    adrp     x10, #0x4be000
    mov      x13, #0x4049000000000000
    ldr      x9, [x9, #0xaf0]
    sub      x15, x29, #0x88
    stur     x9, [x15, #-0x100]
    fmov     d14, x13
    mov      x9, #0x404e000000000000
    ldr      x11, [x11, #0x460]
    sub      x13, x29, #0xc8
    stur     x11, [x13, #-0x100]
    fmov     d11, x9
    adrp     x9, #0x4bf000
    fmov     d9, xzr
    fmov     d12, #5.00000000
    ldr      x8, [x8, #0x458]
    sub      x11, x29, #0xd0
    stur     x8, [x11, #-0x100]
    ldr      x8, [x12, #0x1f8]
    sub      x11, x29, #0xd8
    stur     x8, [x11, #-0x100]
    ldr      x8, [x10, #0x620]
    sub      x10, x29, #0xf0
    stur     x8, [x10, #-0x100]
    ldr      x8, [x9, #0x248]
    sub      x9, x29, #0xe0
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x620]
    ldr      x8, [x8]
    sub      x9, x29, #0xe8
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x830]
    sub      x9, x29, #0x90
    stur     x8, [x9, #-0x100]
    ldr      x8, [x22, #0x608]
    sub      x9, x29, #0x98
    stur     x8, [x9, #-0x100]
    ldr      x8, [x14, #0x678]
    stur     x8, [x29, #-0x100]
    sub      x8, x29, #0x78
    stur     x23, [x8, #-0x100]
    mov      x0, x21
    sub      x8, x29, #0x98
    ldur     x1, [x8, #-0x100]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x150]
    bl       #0x461ba0 // _objc_alloc
    fmov     d0, #14.00000000
    ldur     x1, [x29, #-0xd0]
    fmov     d1, d9
    fmov     d2, d15
    fmov     d3, d14
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    sub      x8, x29, #0x48
    ldur     x1, [x8, #-0x100]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    fmov     d0, #25.00000000
    ldur     x1, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0xb8]
    ldur     x2, [x29, #-0xd8]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    ldur     x1, [x29, #-0xc0]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    sub      x8, x29, #0x58
    ldur     x1, [x8, #-0x100]
    mov      x2, x27
    sub      x8, x29, #0x50
    ldur     x3, [x8, #-0x100]
    mov      w4, #0x40
    bl       #0x461c6c // _objc_msgSend
    adrp     x0, #0x549000
    add      x0, x0, #0xb00
    bl       #0x461780 // _NSClassFromString
    cbz      x0, #0x3348d0
    bl       #0x461bac // _objc_alloc_init
    mov      x20, x0
    sub      x8, x29, #0xa8
    ldur     x1, [x8, #-0x100]
    sub      x8, x29, #0xa0
    ldur     x2, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3348cc
    mov      x0, x20
    sub      x8, x29, #0xa0
    ldur     x1, [x8, #-0x100]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    cbnz     x20, #0x3348f8
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x180]
    sub      x8, x29, #0xb8
    ldur     x1, [x8, #-0x100]
    sub      x8, x29, #0xb0
    ldur     x2, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x148]
    bl       #0x461ba0 // _objc_alloc
    sub      x8, x29, #0x60
    ldur     x1, [x8, #-0x100]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x24
    sub      x8, x29, #0x68
    ldur     x21, [x8, #-0x100]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    ldur     x1, [x29, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    sub      x8, x29, #0x70
    ldur     x23, [x8, #-0x100]
    mov      x1, x23
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    ldur     x1, [x29, #-0xc8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    fmov     d0, #25.00000000
    ldur     x1, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0xb8]
    ldur     x2, [x29, #-0xd8]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldur     x1, [x29, #-0xc0]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    ldur     x1, [x29, #-0xa8]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x19, x0
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, #18.00000000
    fmov     d5, xzr
    bl       #0x461714 // _CGRectInset
    mov      x0, x19
    ldur     x1, [x29, #-0xd0]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x1, x23
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    sub      x8, x29, #0x78
    ldur     x23, [x8, #-0x100]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    sub      x8, x29, #0x80
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x334a88
    mov      x0, x28
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x21
    ldur     x1, [x29, #-0xe0]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    sub      x8, x29, #8
    ldur     x27, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    b        #0x334a9c
    mov      x0, x21
    ldur     x1, [x29, #-0xe0]
    adrp     x2, #0x549000
    add      x2, x2, #0xac0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    cmp      x8, x26
    fcsel    d1, d13, d10, eq
    ldur     x1, [x29, #-0xe8]
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x21
    ldur     x1, [x29, #-0xf0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldur     x1, [x29, #-0xf8]
    sub      x8, x29, #0x20
    ldur     x2, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    ldur     x1, [x29, #-0xc8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    sub      x8, x29, #0x88
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0xa8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x3c
    ldur     w8, [x8, #-0x100]
    cbz      w8, #0x334d78
    sub      x8, x29, #0xc0
    ldur     x0, [x8, #-0x100]
    mov      x1, x26
    bl       #0x36dae4
    cmp      x0, #1
    b.lt     #0x334d78
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461bac // _objc_alloc_init
    mov      x27, x0
    bl       #0x323f48
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x27
    sub      x8, x29, #0xc8
    ldur     x1, [x8, #-0x100]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    sub      x8, x29, #0xd0
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x27
    ldur     x1, [x29, #-0xf8]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    fmov     d0, #12.50000000
    ldur     x1, [x29, #-0xe8]
    fmov     d1, d13
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x27
    ldur     x1, [x29, #-0xf0]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    sub      x8, x29, #0xd8
    ldur     x1, [x8, #-0x100]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    cmp      x19, #0x64
    b.hs     #0x334c80
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    str      x19, [sp, #-0x10]!
    sub      x8, x29, #0xf0
    ldur     x1, [x8, #-0x100]
    adrp     x2, #0x549000
    add      x2, x2, #0xa40
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    add      sp, sp, #0x10
    mov      x19, x0
    mov      x0, x27
    ldur     x1, [x29, #-0xe0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    b        #0x334c94
    mov      x0, x27
    ldur     x1, [x29, #-0xe0]
    adrp     x2, #0x549000
    add      x2, x2, #0xa80
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    ldur     x1, [x29, #-0xc0]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    ldur     x1, [x29, #-0xc8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x8, #0x7fefffffffffffff
    fmov     d0, x8
    fmov     d1, #19.00000000
    mov      x0, x27
    sub      x8, x29, #0xe0
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    fmov     d1, #10.00000000
    fadd     d0, d0, d1
    fmov     d1, #19.00000000
    fmaxnm   d2, d0, d1
    fsub     d0, d15, d2
    fadd     d0, d0, d12
    fmov     d1, #-5.00000000
    fmov     d3, #19.00000000
    mov      x0, x27
    ldur     x1, [x29, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    fmov     d0, #9.50000000
    ldur     x1, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0xb8]
    sub      x8, x29, #0xe8
    ldur     x2, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    ldur     x1, [x29, #-0xa8]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #8
    ldur     x27, [x8, #-0x100]
    mov      x0, x27
    sub      x8, x29, #0x10
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0xa8]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    sub      x8, x29, #0x30
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    sub      x8, x29, #0x90
    ldur     x1, [x8, #-0x100]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fadd     d9, d9, d11
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    add      x26, x26, #1
    sub      x8, x29, #0x18
    ldur     x21, [x8, #-0x100]
    mov      x0, x21
    sub      x8, x29, #0x28
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    cmp      x26, x0
    b.lt     #0x3347a8
    fmov     d0, #-10.00000000
    fadd     d0, d9, d0
    sub      x8, x29, #0x28
    ldur     x28, [x8, #-0x100]
    sub      x8, x29, #0x30
    ldur     x26, [x8, #-0x100]
    adrp     x22, #0x4be000
    b        #0x334e58
    fmov     d0, #-10.00000000
    sub      x8, x29, #0x28
    ldur     x28, [x8, #-0x100]
    fmov     d1, xzr
    fmaxnm   d1, d0, d1
    fmov     d0, #0.50000000
    stur     d1, [x29, #-0xa8]
    fmul     d10, d1, d0
    mov      x0, x27
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cmp      x20, #1
    b.lt     #0x334fb8
    mov      x20, #0
    fmov     d0, #1.00000000
    fmaxnm   d12, d10, d0
    ldr      x21, [x22, #0x608]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x770]
    adrp     x8, #0x4c1000
    ldr      x23, [x8, #0xe20]
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x678]
    fmov     d15, #18.00000000
    mov      x0, x27
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616e4 // _CGRectGetMidY
    fsub     d0, d0, d10
    fdiv     d0, d0, d12
    fmov     d1, #1.00000000
    fmsub    d11, d0, d0, d1
    fmul     d8, d11, d15
    mov      x0, x25
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d1
    fmov     d13, d2
    fmov     d14, d3
    mov      x0, x27
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    fnmul    d0, d11, d15
    cmp      w0, #0
    fcsel    d0, d8, d0, ne
    fmov     d1, #14.00000000
    fadd     d0, d0, d1
    mov      x0, x25
    mov      x1, x24
    fmov     d1, d9
    fmov     d2, d13
    fmov     d3, d14
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    add      x20, x20, #1
    mov      x0, x27
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cmp      x20, x25
    b.lt     #0x334ecc
    fmov     d0, #20.00000000
    sub      x8, x29, #0x130
    ldur     d1, [x8, #-0x100]
    fadd     d9, d1, d0
    sub      x8, x29, #0x108
    ldur     d11, [x8, #-0x100]
    fmov     d0, d11
    sub      x8, x29, #0x110
    ldur     d12, [x8, #-0x100]
    fmov     d1, d12
    sub      x8, x29, #0x118
    ldur     d14, [x8, #-0x100]
    fmov     d2, d14
    sub      x8, x29, #0x120
    ldur     d15, [x8, #-0x100]
    fmov     d3, d15
    bl       #0x4616b4 // _CGRectGetHeight
    sub      x8, x29, #0x128
    ldur     d1, [x8, #-0x100]
    fsub     d0, d0, d1
    fmov     d1, #-20.00000000
    fadd     d0, d0, d1
    ldur     d1, [x29, #-0xa8]
    fsub     d8, d0, d1
    fcmp     d8, d9
    b.pl     #0x335050
    sub      x8, x29, #0x10
    ldur     x19, [x8, #-0x100]
    sub      x8, x29, #0x18
    ldur     x20, [x8, #-0x100]
    sub      x8, x29, #0x100
    ldur     x21, [x8, #-0x100]
    sub      x8, x29, #0x138
    ldur     x22, [x8, #-0x100]
    sub      x8, x29, #0x140
    ldur     x23, [x8, #-0x100]
    adrp     x24, #0x4be000
    b        #0x3350a8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe28]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    fsub     d0, d0, d10
    frinta   d0, d0
    fcmp     d0, d9
    fcsel    d9, d9, d0, mi
    fcmp     d9, d8
    sub      x8, x29, #0x10
    ldur     x19, [x8, #-0x100]
    sub      x8, x29, #0x18
    ldur     x20, [x8, #-0x100]
    sub      x8, x29, #0x100
    ldur     x21, [x8, #-0x100]
    sub      x8, x29, #0x138
    ldur     x22, [x8, #-0x100]
    sub      x8, x29, #0x140
    ldur     x23, [x8, #-0x100]
    adrp     x24, #0x4be000
    b.le     #0x3350a8
    fmov     d9, d8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe20]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    fmov     d13, xzr
    tbnz     w0, #0, #0x3350e8
    fmov     d0, d11
    fmov     d1, d12
    fmov     d2, d14
    fmov     d3, d15
    bl       #0x461708 // _CGRectGetWidth
    fmov     d10, d0
    mov      x0, x27
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    fsub     d13, d10, d0
    mov      x0, x27
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    mov      x0, x27
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x1, [x24, #0x678]
    fmov     d0, d13
    fmov     d1, d9
    fmov     d2, d10
    ldur     d3, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xc0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x20
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xf8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0xa0]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x3351b4
    sub      sp, x29, #0x90
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    ldp      d9, d8, [sp, #0x30]
    ldp      d11, d10, [sp, #0x20]
    ldp      d13, d12, [sp, #0x10]
    ldp      d15, d14, [sp], #0xa0
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGHGFullscreenDrawer handleBackdrop] IMP=0x3354B0 bounds=0x3354B0-0x3354C0
loc_3354B0:
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe30]
    mov      w2, #1
    b        #0x461c6c // _objc_msgSend

// -[WCLGHGFullscreenDrawer handlePill:] IMP=0x3354C0 bounds=0x3354C0-0x335538
loc_3354C0:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x470]
    mov      x0, x2
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x68]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe30]
    mov      x0, x19
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      x1, x20
    bl       #0x36e534
    mov      x0, x21
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGHGFullscreenDrawer pillIndexAtWindowPoint:] IMP=0x335538 bounds=0x335538-0x3356E8
loc_335538:
    stp      d11, d10, [sp, #-0x70]!
    stp      d9, d8, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xff8]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d1
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xdf8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x770]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d1
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x21, [x8, #0xcf0]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x24, #0x4be000
    ldr      x1, [x24, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cmp      x23, #1
    b.lt     #0x3356b4
    mov      x22, #0
    fsub     d8, d8, d9
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x608]
    ldr      x24, [x24, #0x600]
    fmov     d9, #-5.00000000
    fmov     d10, #5.00000000
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x23
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616fc // _CGRectGetMinY
    fadd     d0, d0, d9
    fcmp     d8, d0
    b.lt     #0x335674
    mov      x0, x25
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616cc // _CGRectGetMaxY
    fadd     d0, d0, d10
    fcmp     d8, d0
    b.ls     #0x3356bc
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    add      x22, x22, #1
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    cmp      x22, x26
    b.lt     #0x335604
    mov      x22, #0x7fffffffffffffff
    b        #0x3356c4
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      d9, d8, [sp, #0x10]
    ldp      d11, d10, [sp], #0x70
    ret      

// -[WCLGHGFullscreenDrawer setHighlightedIndex:] IMP=0x3356E8 bounds=0x3356E8-0x335820
loc_3356E8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xdb4]
    ldr      x9, [x0, x8]
    cmp      x9, x2
    b.eq     #0x33581c
    sub      sp, sp, #0x60
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x2
    mov      x20, x0
    str      x2, [x0, x8]
    mov      x8, #0x7ffffffffffffffe
    cmp      x2, x8
    b.hi     #0x3357a4
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xcf0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cmp      x22, x19
    b.le     #0x3357a4
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe38]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x480]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xde0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [sp, #8]
    adrp     x8, #0x335000
    add      x8, x8, #0x820
    adrp     x9, #0x4a1000
    add      x9, x9, #0xa30
    stp      x8, x9, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xe98]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x418]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x3c0]
    fmov     d1, xzr
    fmov     d3, xzr
    mov      x3, sp
    mov      w2, #4
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    add      sp, sp, #0x60
    ret      

// -[WCLGHGFullscreenDrawer commitSelection:] IMP=0x33599C bounds=0x33599C-0x335A6C
loc_33599C:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x20, x0
    mov      x8, #0x7ffffffffffffffe
    cmp      x2, x8
    b.hi     #0x335a4c
    mov      x19, x2
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xcf0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cmp      x22, x19
    b.le     #0x335a4c
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x68]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe30]
    mov      x0, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      x1, x19
    bl       #0x36e534
    mov      x0, x21
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe30]
    mov      x0, x20
    mov      w2, #1
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c6c // _objc_msgSend

// -[WCLGHGFullscreenDrawer presentInWindow:] IMP=0x335A6C bounds=0x335A6C-0x336094
loc_335A6C:
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
    sub      sp, sp, #0x1a0
    mov      x21, x2
    mov      x20, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x98]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    cbz      x21, #0x336044
    add      x19, sp, #0xd8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x0, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9d0]
    str      x21, [sp, #8]
    mov      x0, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x0, #0x580000
    add      x0, x0, #0xf88
    mov      x1, x20
    bl       #0x461d08 // _objc_storeWeak
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x68]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x3351b8
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbz      x21, #0x335b90
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe40]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x335b90
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe48]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xbd0]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    str      x21, [sp]
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x9c8]
    fmov     d0, #1.00000000
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe20]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    fmov     d0, #26.00000000
    fmov     d1, #-26.00000000
    fcsel    d0, d1, d0, ne
    add      x8, sp, #0xd8
    fmov     d1, xzr
    bl       #0x46154c // _CGAffineTransformMakeTranslation
    adrp     x8, #0x4c1000
    ldr      x22, [x8, #0xdf8]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldp      q0, q1, [x19]
    stp      q0, q1, [sp, #0xa0]
    ldr      q0, [x19, #0x20]
    str      q0, [sp, #0xc0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6c8]
    add      x2, sp, #0xa0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf0]
    fmov     d0, xzr
    fmov     d1, xzr
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe50]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe28]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x770]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d1
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x22, [x8, #0xcf0]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x21, #0x4be000
    ldr      x23, [x21, #0x600]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    cmp      x27, #1
    b.lt     #0x335dc8
    mov      x19, #0
    mov      x26, #0
    fsub     d8, d8, d9
    ldr      x27, [x8, #0x608]
    ldr      x23, [x21, #0x600]
    mov      x8, #0x7fefffffffffffff
    fmov     d9, x8
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x1, x27
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616e4 // _CGRectGetMidY
    fabd     d10, d0, d8
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    fcmp     d10, d9
    fcsel    d9, d10, d9, mi
    csel     x19, x26, x19, mi
    add      x26, x26, #1
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cmp      x26, x28
    b.lt     #0x335d30
    b        #0x335dcc
    mov      x19, #0
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x80]
    stp      q0, q0, [sp, #0x60]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x478]
    add      x2, sp, #0x60
    add      x3, sp, #0x108
    mov      x1, x26
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x335e78
    mov      x27, x0
    ldr      x8, [sp, #0x70]
    ldr      x21, [x8]
    mov      x28, #0
    ldr      x8, [sp, #0x70]
    ldr      x8, [x8]
    cmp      x8, x21
    b.eq     #0x335e38
    mov      x0, x25
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp, #0x68]
    ldr      x0, [x8, x28, lsl #3]
    fmov     d0, xzr
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    add      x28, x28, #1
    cmp      x27, x28
    b.ne     #0x335e20
    add      x2, sp, #0x60
    add      x3, sp, #0x108
    mov      x0, x25
    mov      x1, x26
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    cbnz     x0, #0x335e1c
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp, #0x38]
    adrp     x8, #0x491000
    ldr      d12, [x8, #0x388]
    adrp     x8, #0x336000
    add      x8, x8, #0x94
    adrp     x9, #0x4a1000
    add      x9, x9, #0xa00
    str      d12, [sp, #0x40]
    stp      x8, x9, [sp, #0x48]
    str      x20, [sp, #0x58]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xe60]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x9f8]
    fmov     d1, xzr
    add      x3, sp, #0x38
    mov      w2, #0x20000
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cmp      x24, #1
    b.lt     #0x336038
    mov      x24, #0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x608]
    adrp     x8, #0x4bf000
    ldr      x26, [x8, #0xe98]
    neg      x19, x19
    adrp     x8, #0x491000
    ldr      d13, [x8, #0x478]
    adrp     x28, #0x336000
    add      x28, x28, #0x16c
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x488]
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x660]
    adrp     x8, #0x491000
    ldr      d10, [x8, #0x3e0]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x25
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adds     x8, x19, x24
    cneg     x8, x8, mi
    adrp     x9, #0x4c4000
    ldr      x21, [x9, #0x78]
    ucvtf    d0, x8
    fmul     d11, d0, d13
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp, #0x10]
    str      d12, [sp, #0x18]
    adrp     x8, #0x4a1000
    add      x8, x8, #0xa00
    stp      x28, x8, [sp, #0x20]
    str      x27, [sp, #0x30]
    mov      x0, x27
    bl       #0x461ca8 // _objc_retain
    add      x3, sp, #0x10
    mov      x0, x21
    mov      x1, x26
    fmov     d0, d8
    fmov     d1, d11
    fmov     d2, d9
    fmov     d3, d10
    mov      w2, #0x20000
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    add      x24, x24, #1
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cmp      x24, x27
    b.lt     #0x335f50
    ldr      x0, [sp]
    bl       #0x461c9c // _objc_release
    ldr      x21, [sp, #8]
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x98]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x336090
    add      sp, sp, #0x1a0
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

// -[WCLGHGFullscreenDrawer dismissAnimated:] IMP=0x336180 bounds=0x336180-0x336340
loc_336180:
    sub      sp, sp, #0xb0
    stp      d9, d8, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      x20, x2
    mov      x19, x0
    adrp     x0, #0x580000
    add      x0, x0, #0xf88
    bl       #0x461c60 // _objc_loadWeakRetained
    mov      x21, x0
    bl       #0x461c9c // _objc_release
    cmp      x21, x19
    b.ne     #0x3361d0
    adrp     x0, #0x580000
    add      x0, x0, #0xf88
    mov      x1, #0
    bl       #0x461d08 // _objc_storeWeak
    adrp     x8, #0x4c1000
    ldr      x21, [x8, #0xe58]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461c9c // _objc_release
    cbz      x22, #0x33623c
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xbd0]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe48]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe10]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    adrp     x23, #0x4a0000
    ldr      x23, [x23, #0x748]
    str      x23, [sp, #0x38]
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x388]
    adrp     x8, #0x336000
    add      x8, x8, #0x340
    str      d9, [sp, #0x40]
    adrp     x9, #0x4a2000
    add      x9, x9, #0xd0
    stp      x8, x9, [sp, #0x48]
    str      x19, [sp, #0x58]
    add      x0, sp, #0x38
    bl       #0x461cd8 // _objc_retainBlock
    mov      x21, x0
    tbz      w20, #0, #0x33630c
    fmov     d0, #24.00000000
    fadd     d0, d8, d0
    fneg     d1, d0
    cmp      w22, #0
    fcsel    d0, d1, d0, ne
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    str      x23, [sp, #8]
    str      d9, [sp, #0x10]
    adrp     x8, #0x336000
    add      x8, x8, #0x350
    adrp     x9, #0x4a1000
    add      x9, x9, #0xa30
    stp      x8, x9, [sp, #0x18]
    str      x19, [sp, #0x28]
    str      d0, [sp, #0x30]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xe60]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x4b8]
    fmov     d1, xzr
    add      x3, sp, #8
    mov      w2, #0x10000
    mov      x4, x21
    bl       #0x461c6c // _objc_msgSend
    b        #0x33631c
    ldr      x8, [x21, #0x10]
    mov      x0, x21
    mov      w1, #1
    blr      x8
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      d9, d8, [sp, #0x60]
    add      sp, sp, #0xb0
    ret      

// -[WCLGHGFullscreenDrawer controller] IMP=0x336468 bounds=0x336468-0x336488
loc_336468:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd98]
    add      x0, x0, x8
    bl       #0x461c60 // _objc_loadWeakRetained
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGHGFullscreenDrawer setController:] IMP=0x336488 bounds=0x336488-0x33649C
loc_336488:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd98]
    add      x0, x0, x8
    b        #0x461d08 // _objc_storeWeak

// -[WCLGHGFullscreenDrawer backdrop] IMP=0x33649C bounds=0x33649C-0x3364AC
loc_33649C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xdac]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGHGFullscreenDrawer setBackdrop:] IMP=0x3364AC bounds=0x3364AC-0x3364C0
loc_3364AC:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xdac]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGHGFullscreenDrawer column] IMP=0x3364C0 bounds=0x3364C0-0x3364D0
loc_3364C0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xdb0]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGHGFullscreenDrawer setColumn:] IMP=0x3364D0 bounds=0x3364D0-0x3364E4
loc_3364D0:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xdb0]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGHGFullscreenDrawer fromLeft] IMP=0x3364E4 bounds=0x3364E4-0x3364F4
loc_3364E4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd9c]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGHGFullscreenDrawer setFromLeft:] IMP=0x3364F4 bounds=0x3364F4-0x336504
loc_3364F4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd9c]
    strb     w2, [x0, x8]
    ret      

// -[WCLGHGFullscreenDrawer columnWidth] IMP=0x336504 bounds=0x336504-0x336514
loc_336504:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xda8]
    ldr      d0, [x0, x8]
    ret      

// -[WCLGHGFullscreenDrawer setColumnWidth:] IMP=0x336514 bounds=0x336514-0x336524
loc_336514:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xda8]
    str      d0, [x0, x8]
    ret      

// -[WCLGHGFullscreenDrawer anchorY] IMP=0x336524 bounds=0x336524-0x336534
loc_336524:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xda0]
    ldr      d0, [x0, x8]
    ret      

// -[WCLGHGFullscreenDrawer setAnchorY:] IMP=0x336534 bounds=0x336534-0x336544
loc_336534:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xda0]
    str      d0, [x0, x8]
    ret      

// -[WCLGHGFullscreenDrawer pills] IMP=0x336544 bounds=0x336544-0x336554
loc_336544:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xdb8]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGHGFullscreenDrawer setPills:] IMP=0x336554 bounds=0x336554-0x336568
loc_336554:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xdb8]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGHGFullscreenDrawer highlightedIndex] IMP=0x336568 bounds=0x336568-0x336578
loc_336568:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xdb4]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGHGFullscreenDrawer lockedScroll] IMP=0x336578 bounds=0x336578-0x336598
loc_336578:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xdbc]
    add      x0, x0, x8
    bl       #0x461c60 // _objc_loadWeakRetained
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGHGFullscreenDrawer setLockedScroll:] IMP=0x336598 bounds=0x336598-0x3365AC
loc_336598:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xdbc]
    add      x0, x0, x8
    b        #0x461d08 // _objc_storeWeak

// -[WCLGHGFullscreenDrawer hapticGenerator] IMP=0x3365AC bounds=0x3365AC-0x3365BC
loc_3365AC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xda4]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGHGFullscreenDrawer setHapticGenerator:] IMP=0x3365BC bounds=0x3365BC-0x3365D0
loc_3365BC:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xda4]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGHGFullscreenDrawer .cxx_destruct] IMP=0x3365D0 bounds=0x3365D0-0x336658
loc_3365D0:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xda4]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xdbc]
    add      x0, x19, x8
    bl       #0x461c0c // _objc_destroyWeak
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xdb8]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xdb0]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xdac]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd98]
    add      x0, x19, x8
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c0c // _objc_destroyWeak
