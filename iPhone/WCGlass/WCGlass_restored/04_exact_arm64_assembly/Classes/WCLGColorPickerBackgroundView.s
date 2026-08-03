// Exact ARM64 listing for WCLGColorPickerBackgroundView

// +[WCLGColorPickerBackgroundView layerClass] IMP=0x249B1C bounds=0x249B1C-0x249C8C
loc_249B1C:
    sub      sp, sp, #0x80
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    mov      w19, #0xf056
    movk     w19, #0xddf4, lsl #16
    mov      w20, #0x48e4
    movk     w20, #0x811d, lsl #16
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xad0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xad4]
    mul      w8, w8, w9
    mov      w9, #0xcfa2
    movk     w9, #0x6ad8, lsl #16
    mov      w10, #0x8074
    movk     w10, #0x3270, lsl #16
    madd     w8, w8, w9, w10
    mov      w9, #0xb3ed
    movk     w9, #0xe0d4, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3d
    str      w8, [sp, #0x1c]
    mov      w21, #0x7a99
    movk     w21, #0x70cd, lsl #16
    str      w21, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w22, #0x7a98
    movk     w22, #0x70cd, lsl #16
    adrp     x23, #0x4c4000
    adrp     x24, #0x4be000
    mov      w25, #0xcfe1
    movk     w25, #0x5cec, lsl #16
    mov      w26, #0x7f26
    movk     w26, #0x7ac1, lsl #16
    mov      w27, #0x506b
    movk     w27, #0x801d, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w22
    b.gt     #0x249c28
    cmp      w8, w20
    b.eq     #0x249c48
    cmp      w8, w19
    b.ne     #0x249bc4
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xad8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xadc]
    udiv     w8, w8, w9
    mov      w9, #0xfa3
    movk     w9, #0xd190, lsl #16
    add      w8, w8, w9
    mov      w9, #0xcf52
    movk     w9, #0x5de2, lsl #16
    orr      w28, w8, w9
    ldr      x0, [x23, #0x290]
    ldr      x1, [x24, #0x410]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x10]
    cmp      w28, w25
    csel     w8, w26, w20, hi
    b        #0x249c3c
    cmp      w8, w21
    b.ne     #0x249c60
    ldr      w8, [sp, #0x1c]
    cmp      w8, w27
    csel     w8, w20, w19, hi
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x249bc4
    ldr      x0, [x23, #0x290]
    ldr      x1, [x24, #0x410]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp]
    str      w19, [x8]
    b        #0x249bc4
    cmp      w8, w26
    b.ne     #0x249bc4
    ldr      x0, [sp, #0x10]
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    add      sp, sp, #0x80
    ret      

// -[WCLGColorPickerBackgroundView layoutSubviews] IMP=0x249C8C bounds=0x249C8C-0x24A0D4
loc_249C8C:
    sub      sp, sp, #0x180
    stp      d15, d14, [sp, #0xe0]
    stp      d13, d12, [sp, #0xf0]
    stp      d11, d10, [sp, #0x100]
    stp      d9, d8, [sp, #0x110]
    stp      x28, x27, [sp, #0x120]
    stp      x26, x25, [sp, #0x130]
    stp      x24, x23, [sp, #0x140]
    stp      x22, x21, [sp, #0x150]
    stp      x20, x19, [sp, #0x160]
    stp      x29, x30, [sp, #0x170]
    add      x29, sp, #0x170
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0xa0]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x750]
    stp      x0, x8, [sp, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
    add      x0, sp, #0x90
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3f0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3f8]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #2
    cset     w8, eq
    strb     w8, [sp, #0x8f]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x80]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x850]
    fmov     d0, xzr
    fmov     d1, xzr
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x858]
    ldr      x0, [sp, #0x80]
    fmov     d0, #1.00000000
    fmov     d1, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    adrp     x24, #0x4c4000
    ldr      x8, [x24, #0x90]
    str      x8, [sp, #0x78]
    mov      w9, #0x6b80
    movk     w9, #0x7449, lsl #16
    add      x8, sp, #0x4c
    str      x8, [sp, #0x40]
    mov      w26, #0x6b7f
    movk     w26, #0x7449, lsl #16
    mov      w27, #0xecbf
    movk     w27, #0xa3ae, lsl #16
    adrp     x8, #0x491000
    ldr      d0, [x8, #0xb70]
    str      d0, [sp, #0x38]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x918]
    str      d0, [sp, #0x30]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x448]
    str      d0, [sp, #0x28]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0xaa8]
    str      d0, [sp, #0x20]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3e8]
    str      d0, [sp, #0x18]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x5c8]
    str      d0, [sp, #0x10]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x910]
    str      d0, [sp, #8]
    adrp     x25, #0x4c4000
    adrp     x23, #0x4be000
    mov      w28, #0x2260
    movk     w28, #0xc0eb, lsl #16
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x370]
    str      d0, [sp]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x530]
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x490]
    adrp     x8, #0x491000
    ldr      d10, [x8, #0x538]
    adrp     x8, #0x491000
    ldr      d11, [x8, #0x460]
    adrp     x8, #0x491000
    ldr      d12, [x8, #0x4b8]
    adrp     x8, #0x491000
    ldr      d13, [x8, #0x850]
    adrp     x8, #0x491000
    ldr      d14, [x8, #0xb68]
    adrp     x8, #0x491000
    ldr      d15, [x8, #0x418]
    str      w9, [sp, #0x4c]
    ldr      w8, [sp, #0x4c]
    cmp      w8, w26
    b.gt     #0x249f28
    cmp      w8, w27
    b.eq     #0x249f5c
    cmp      w8, w28
    b.ne     #0x249e50
    ldp      x1, x0, [sp, #0x70]
    fmov     d3, #1.00000000
    ldr      d0, [sp]
    fmov     d1, d8
    fmov     d2, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0xac0]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0xb8]
    ldr      x0, [x24, #0x90]
    ldr      x1, [sp, #0x70]
    fmov     d3, #1.00000000
    fmov     d0, d10
    fmov     d1, d11
    fmov     d2, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0xc0]
    ldr      x0, [x24, #0x90]
    ldr      x1, [sp, #0x70]
    fmov     d3, #1.00000000
    fmov     d0, d13
    fmov     d1, d14
    fmov     d2, d15
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0xc8]
    ldr      x0, [x25, #0x98]
    ldr      x1, [x23, #0x470]
    add      x2, sp, #0xb8
    b        #0x24a008
    mov      w9, #0x6b80
    movk     w9, #0x7449, lsl #16
    cmp      w8, w9
    b.ne     #0x24a034
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x8f8]
    str      x8, [sp, #0x70]
    ldrb     w8, [sp, #0x8f]
    cmp      w8, #0
    csel     w8, w28, w27, ne
    ldr      x9, [sp, #0x40]
    str      w8, [x9]
    b        #0x249e50
    ldp      x1, x0, [sp, #0x70]
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    ldp      d1, d0, [sp, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0xac0]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0xa0]
    ldr      x0, [x24, #0x90]
    ldr      x1, [sp, #0x70]
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    ldp      d1, d0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0xa8]
    ldr      x0, [x24, #0x90]
    ldr      x1, [sp, #0x70]
    fmov     d3, #1.00000000
    ldp      d1, d0, [sp, #0x10]
    ldr      d2, [sp, #8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0xb0]
    ldr      x0, [x25, #0x98]
    ldr      x1, [x23, #0x470]
    add      x2, sp, #0xa0
    mov      w3, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldr      x8, [sp, #0x40]
    mov      w9, #0xd339
    movk     w9, #0x74f3, lsl #16
    str      w9, [x8]
    stp      x22, x0, [sp, #0x60]
    stp      x19, x21, [sp, #0x50]
    b        #0x249e50
    mov      w9, #0xd339
    movk     w9, #0x74f3, lsl #16
    cmp      w8, w9
    b.ne     #0x249e50
    ldp      x19, x20, [sp, #0x50]
    ldp      x21, x22, [sp, #0x60]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x868]
    ldr      x0, [sp, #0x80]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x80]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0xa0]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x24a0d0
    ldp      x29, x30, [sp, #0x170]
    ldp      x20, x19, [sp, #0x160]
    ldp      x22, x21, [sp, #0x150]
    ldp      x24, x23, [sp, #0x140]
    ldp      x26, x25, [sp, #0x130]
    ldp      x28, x27, [sp, #0x120]
    ldp      d9, d8, [sp, #0x110]
    ldp      d11, d10, [sp, #0x100]
    ldp      d13, d12, [sp, #0xf0]
    ldp      d15, d14, [sp, #0xe0]
    add      sp, sp, #0x180
    ret      
    bl       #0x4618b8 // ___stack_chk_fail
