// Exact ARM64 listing for WCLGHomeGroupBar

// +[WCLGHomeGroupBar preferredHeight] IMP=0x329AA8 bounds=0x329AA8-0x329B68
loc_329AA8:
    sub      sp, sp, #0x60
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    adrp     x8, #0x4c4000
    ldr      x9, [x8, #0x198]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xcd8]
    stp      x8, x9, [sp, #0x20]
    mov      w19, #0x1725
    movk     w19, #0x8811, lsl #16
    str      w19, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    adrp     x20, #0x4c1000
    mov      w21, #0x194e
    movk     w21, #0x8234, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w19
    b.eq     #0x329b08
    cmp      w8, w21
    b.ne     #0x329af0
    b        #0x329b2c
    ldp      x1, x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldr      x8, [x20, #0xc30]
    stp      x8, x0, [sp, #0x10]
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x329af0
    ldp      x1, x0, [sp, #0x10]
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    cmp      w19, #0
    mov      x8, #0x4050000000000000
    fmov     d0, x8
    fmov     d1, xzr
    fcsel    d0, d0, d1, ne
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    add      sp, sp, #0x60
    ret      

// -[WCLGHomeGroupBar initWithFrame:] IMP=0x329B68 bounds=0x329B68-0x329ED0
loc_329B68:
    sub      sp, sp, #0xf0
    stp      d11, d10, [sp, #0x70]
    stp      d9, d8, [sp, #0x80]
    stp      x28, x27, [sp, #0x90]
    stp      x26, x25, [sp, #0xa0]
    stp      x24, x23, [sp, #0xb0]
    stp      x22, x21, [sp, #0xc0]
    stp      x20, x19, [sp, #0xd0]
    stp      x29, x30, [sp, #0xe0]
    add      x29, sp, #0xe0
    fmov     d8, d3
    fmov     d9, d2
    fmov     d10, d1
    fmov     d11, d0
    mov      w20, #0xd656
    movk     w20, #0x8a6f, lsl #16
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7d8]
    stp      x0, x8, [sp, #0x60]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xb38]
    mov      w21, #0xde52
    movk     w21, #0xe54c, lsl #16
    add      x9, sp, #0x14
    str      x8, [sp, #0x58]
    mov      w22, #0xde51
    movk     w22, #0xe54c, lsl #16
    mov      w23, #0xe46c
    movk     w23, #0x92cf, lsl #16
    str      w21, [sp, #0x14]
    adrp     x24, #0x4c4000
    str      x9, [sp, #8]
    mov      w27, #0x9741
    movk     w27, #0x28eb, lsl #16
    mov      w28, #0xbe88
    movk     w28, #0xd5a7, lsl #16
    mov      w25, #0x5f7b
    movk     w25, #0x6150, lsl #16
    adrp     x26, #0x4a0000
    ldr      x26, [x26, #0x608]
    ldr      w8, [sp, #0x14]
    cmp      w8, w22
    b.le     #0x329c64
    cmp      w8, w25
    b.eq     #0x329d50
    cmp      w8, w27
    b.eq     #0x329d68
    cmp      w8, w21
    b.ne     #0x329c08
    ldr      x1, [sp, #0x58]
    add      x0, sp, #0x60
    fmov     d0, d11
    fmov     d1, d10
    fmov     d2, d9
    fmov     d3, d8
    bl       #0x461c84 // _objc_msgSendSuper2
    str      x0, [sp, #0x50]
    cmp      x0, #0
    cset     w8, eq
    strb     w8, [sp, #0x4f]
    ldr      x8, [sp, #8]
    str      w25, [x8]
    b        #0x329c08
    cmp      w8, w23
    b.eq     #0x329e68
    cmp      w8, w28
    b.ne     #0x329e9c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbe0]
    ldr      x0, [sp, #0x18]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldp      x8, x1, [sp, #0x20]
    ldr      x0, [x8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x24, #0x90]
    ldr      x1, [sp, #0x40]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x8, [sp, #0x20]
    ldr      x0, [x8]
    ldr      x1, [sp, #0x30]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x20]
    ldr      x2, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    ldr      x0, [sp, #0x50]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xce0]
    ldr      x0, [sp, #0x50]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1f0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x28]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x3, [x8, #0xce8]
    adrp     x8, #0x4a4000
    add      x8, x8, #0xea8
    ldr      x4, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd78]
    ldr      x2, [sp, #0x50]
    mov      x5, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w20, [x8]
    b        #0x329c08
    ldrb     w8, [sp, #0x4f]
    cmp      w8, #0
    csel     w8, w20, w23, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x329c08
    ldr      x0, [sp, #0x50]
    ldp      x1, x2, [sp, #0x30]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x38]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    str      x1, [sp, #0x28]
    ldr      x0, [sp, #0x50]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0xd84]
    ldr      x10, [sp, #0x50]
    ldr      x8, [x10, x9]
    str      x0, [x10, x9]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd88]
    ldr      x9, [sp, #0x50]
    mov      x10, #0x7fffffffffffffff
    str      x10, [x9, x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x188]
    bl       #0x461ba0 // _objc_alloc
    ldp      d0, d1, [x26]
    ldp      d2, d3, [x26, #0x10]
    ldr      x1, [sp, #0x58]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0xd8c]
    ldr      x10, [sp, #0x50]
    add      x8, x10, x9
    str      x8, [sp, #0x20]
    ldr      x8, [x10, x9]
    str      x0, [x10, x9]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x20]
    ldr      x0, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbe8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x20]
    ldr      x0, [x8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x3b8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x20]
    ldr      x8, [x8]
    str      x8, [sp, #0x18]
    ldr      x8, [sp, #8]
    str      w28, [x8]
    b        #0x329c08
    ldr      x0, [x24, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    str      x1, [sp, #0x40]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x460]
    stp      x8, x0, [sp, #0x30]
    ldr      x8, [sp, #8]
    str      w27, [x8]
    b        #0x329c08
    cmp      w8, w20
    b.ne     #0x329c08
    ldr      x0, [sp, #0x50]
    ldp      x29, x30, [sp, #0xe0]
    ldp      x20, x19, [sp, #0xd0]
    ldp      x22, x21, [sp, #0xc0]
    ldp      x24, x23, [sp, #0xb0]
    ldp      x26, x25, [sp, #0xa0]
    ldp      x28, x27, [sp, #0x90]
    ldp      d9, d8, [sp, #0x80]
    ldp      d11, d10, [sp, #0x70]
    add      sp, sp, #0xf0
    ret      

// -[WCLGHomeGroupBar dealloc] IMP=0x329ED0 bounds=0x329ED0-0x329F90
loc_329ED0:
    sub      sp, sp, #0x60
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1f0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x28]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x18]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd80]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      w20, #0x4529
    movk     w20, #0x446a, lsl #16
    str      w20, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    adrp     x21, #0x4c4000
    mov      w22, #0xa72d
    movk     w22, #0x6d33, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w20
    b.eq     #0x329f50
    cmp      w8, w22
    b.ne     #0x329f38
    b        #0x329f6c
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x21, #0x7d8]
    stp      x19, x8, [sp, #0x20]
    ldr      x8, [sp, #8]
    str      w22, [x8]
    b        #0x329f38
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd88]
    add      x0, sp, #0x20
    bl       #0x461c84 // _objc_msgSendSuper2
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    add      sp, sp, #0x60
    ret      

// -[WCLGHomeGroupBar handleGroupsChanged] IMP=0x329F90 bounds=0x329F90-0x32A014
loc_329F90:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xce0]
    str      x8, [sp, #0x18]
    mov      w20, #0x7cb6
    movk     w20, #0x3cc, lsl #16
    str      w20, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w21, #0x44b1
    movk     w21, #0x2699, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w20
    b.eq     #0x329fe8
    cmp      w8, w21
    b.ne     #0x329fd0
    b        #0x32a000
    ldr      x1, [sp, #0x18]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x329fd0
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    ret      

// -[WCLGHomeGroupBar reloadGroups] IMP=0x32A014 bounds=0x32A014-0x32A6A8
loc_32A014:
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
    sub      sp, sp, #0xc0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x90]
    adrp     x8, #0x580000
    add      x8, x8, #0xeb8
    ldar     w9, [x8]
    cbnz     w9, #0x32a0a0
    adrp     x9, #0x549000
    add      x9, x9, #0x500
    ldrh     w10, [x9]
    mov      w11, #0x3d0
    eor      w10, w10, w11
    adrp     x11, #0x549000
    add      x11, x11, #0x506
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x2490
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x7773
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x8, sp
    sub      x19, x8, #0x40
    mov      sp, x19
    sub      x24, sp, #0x80
    mov      sp, x24
    sub      x9, sp, #0x10
    sub      x10, x29, #0x38
    stur     x9, [x10, #-0x100]
    mov      sp, x9
    sub      x21, sp, #0x30
    mov      sp, x21
    sub      x9, sp, #0x10
    stp      x9, x0, [x29, #-0xa0]
    mov      sp, x9
    sub      x23, sp, #0x30
    mov      sp, x23
    movi     v0.16b, #0
    stp      q0, q0, [x8, #-0x20]
    stp      q0, q0, [x8, #-0x40]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xcf0]
    stur     x1, [x29, #-0xb8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x478]
    mov      x1, x26
    mov      x2, x19
    mov      x3, x24
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x32a19c
    mov      x20, x0
    ldr      x8, [x19, #0x10]
    ldr      x28, [x8]
    mov      x22, #0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0xb30]
    ldr      x8, [x19, #0x10]
    ldr      x8, [x8]
    cmp      x8, x28
    b.eq     #0x32a160
    mov      x0, x25
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x19, #8]
    ldr      x0, [x8, x22, lsl #3]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    add      x22, x22, #1
    cmp      x20, x22
    b.ne     #0x32a148
    mov      x0, x25
    mov      x1, x26
    mov      x2, x19
    mov      x3, x24
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    cbnz     x0, #0x32a13c
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldur     x20, [x29, #-0x98]
    mov      x0, x20
    ldur     x1, [x29, #-0xb8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x7f8]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x198]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xcd8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xce0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xce8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xe8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xcf8]
    sub      x8, x29, #0x40
    stur     x19, [x8, #-0x100]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    stur     w0, [x29, #-0xcc]
    sub      x8, x29, #0x38
    ldur     x28, [x8, #-0x100]
    mov      x0, x28
    mov      x1, x20
    bl       #0x461c54 // _objc_initWeak
    mov      x25, #0
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x600]
    adrp     x8, #0x4be000
    ldr      x10, [x8, #0x608]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0x70]
    stp      x9, x8, [x29, #-0xb0]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x338]
    stp      x8, x10, [x29, #-0xc8]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xd00]
    sub      x9, x29, #0x20
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xd08]
    sub      x9, x29, #0x28
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xd10]
    sub      x9, x29, #0x30
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xb38]
    stur     x8, [x29, #-0xd8]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x608]
    ldp      d8, d9, [x8]
    adrp     x9, #0x4c1000
    ldp      d10, d11, [x8, #0x10]
    adrp     x8, #0x4c1000
    adrp     x10, #0x4c1000
    ldr      x9, [x9, #0xd18]
    stur     x9, [x29, #-0xe0]
    adrp     x9, #0x4c1000
    adrp     x11, #0x4c1000
    adrp     x12, #0x4be000
    ldr      x8, [x8, #0xd20]
    stur     x8, [x29, #-0xf0]
    ldr      x8, [x10, #0xb48]
    stur     x8, [x29, #-0xf8]
    adrp     x8, #0x4be000
    ldr      x9, [x9, #0xb58]
    stur     x9, [x29, #-0x100]
    ldr      x9, [x11, #0xd38]
    sub      x10, x29, #8
    stur     x9, [x10, #-0x100]
    ldr      x9, [x12, #0xb40]
    sub      x10, x29, #0x10
    stur     x9, [x10, #-0x100]
    ldr      x8, [x8, #0x830]
    sub      x9, x29, #0x18
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x491000
    ldr      d12, [x8, #0x388]
    mov      x0, x26
    ldur     x1, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    cmp      x25, x0
    b.ge     #0x32a5a8
    mov      x0, x26
    ldur     x1, [x29, #-0xc0]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    ldur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0xc8]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x32a39c
    mov      x0, x27
    ldur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    b        #0x32a3a4
    adrp     x24, #0x549000
    add      x24, x24, #0x530
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     w8, [x29, #-0xcc]
    cbz      w8, #0x32a3dc
    mov      x0, x27
    sub      x8, x29, #0x20
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x32a3dc
    mov      x0, x27
    sub      x8, x29, #0x28
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x32a574
    mov      x20, #0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x5c8]
    bl       #0x461ba0 // _objc_alloc
    ldur     x1, [x29, #-0xd8]
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    ldur     x1, [x29, #-0xe0]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    ldp      x1, x8, [x29, #-0xf0]
    cmp      x8, x25
    cset     w5, eq
    mov      x0, x19
    mov      x2, x24
    mov      x3, x20
    mov      x4, #0
    mov      w6, #0
    mov      x7, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x22, #0x4a0000
    ldr      x22, [x22, #0x748]
    str      x22, [x21]
    str      d12, [x21, #8]
    adrp     x8, #0x32a000
    add      x9, x8, #0x6a8
    adrp     x8, #0x4a2000
    add      x8, x8, #0xad8
    stp      x9, x8, [x21, #0x10]
    add      x0, x21, #0x20
    mov      x1, x28
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x19
    ldur     x1, [x29, #-0xf8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    ldur     x20, [x29, #-0xa0]
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c54 // _objc_initWeak
    str      x22, [x23]
    str      d12, [x23, #8]
    adrp     x8, #0x32a000
    add      x9, x8, #0x908
    adrp     x8, #0x4a4000
    add      x8, x8, #0xd78
    stp      x9, x8, [x23, #0x10]
    add      x0, x23, #0x20
    mov      x1, x28
    bl       #0x461c00 // _objc_copyWeak
    add      x0, x23, #0x28
    mov      x1, x20
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x19
    ldur     x1, [x29, #-0x100]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    ldur     x0, [x29, #-0x98]
    sub      x8, x29, #8
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    sub      x8, x29, #0x10
    ldur     x1, [x8, #-0x100]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x98]
    ldur     x1, [x29, #-0xb8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    sub      x8, x29, #0x18
    ldur     x1, [x8, #-0x100]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    add      x0, x23, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x23, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x21, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    add      x25, x25, #1
    b        #0x32a330
    mov      x0, x27
    sub      x8, x29, #0x30
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    b        #0x32a3e0
    bl       #0x32ab8c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldur     x20, [x29, #-0x98]
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd40]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x40
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x90]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x32a648
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
    b        #0x32a694
    b        #0x32a694
    b        #0x32a694
    b        #0x32a66c
    mov      x19, x0
    b        #0x32a688
    b        #0x32a694
    b        #0x32a694
    mov      x19, x0
    add      x0, x23, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x23, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x21, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    b        #0x32a698
    mov      x19, x0
    mov      x0, x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGHomeGroupBar reloadGroupsIfNeeded] IMP=0x32B504 bounds=0x32B504-0x32B890
loc_32B504:
    sub      sp, sp, #0xb0
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      x19, x0
    mov      w20, #0x3907
    movk     w20, #0xc142, lsl #16
    mov      w22, #0x6a35
    movk     w22, #0x6fc, lsl #16
    bl       #0x32ab8c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x48]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xcf0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      w9, #0x1018
    movk     w9, #0x7e9e, lsl #16
    str      x0, [sp, #0x40]
    add      x8, sp, #0xc
    mov      w24, #0x6a34
    movk     w24, #0x6fc, lsl #16
    str      w9, [sp, #0xc]
    mov      w25, #0xc0c4
    movk     w25, #0x9fa7, lsl #16
    str      x8, [sp]
    mov      w23, #0x3906
    movk     w23, #0xc142, lsl #16
    mov      w27, #0xe0b4
    movk     w27, #0x262f, lsl #16
    mov      w28, #0xec37
    movk     w28, #0xe60, lsl #16
    mov      w26, #0x5a00
    movk     w26, #0x6750, lsl #16
    mov      w21, #0x5a01
    movk     w21, #0x6750, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w24
    b.gt     #0x32b5f8
    cmp      w8, w25
    b.le     #0x32b634
    cmp      w8, w23
    b.gt     #0x32b70c
    mov      w9, #0xc0c5
    movk     w9, #0x9fa7, lsl #16
    cmp      w8, w9
    b.eq     #0x32b7c4
    mov      w9, #0x49b3
    movk     w9, #0xa7a7, lsl #16
    cmp      w8, w9
    b.ne     #0x32b5b0
    ldr      x8, [sp]
    str      w20, [x8]
    b        #0x32b5b0
    cmp      w8, w27
    b.le     #0x32b690
    cmp      w8, w26
    b.gt     #0x32b6dc
    mov      w9, #0xe0b5
    movk     w9, #0x262f, lsl #16
    cmp      w8, w9
    b.eq     #0x32b794
    mov      w9, #0x6ba3
    movk     w9, #0x53b6, lsl #16
    cmp      w8, w9
    b.ne     #0x32b5b0
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x32b5b0
    mov      w9, #0x85d4
    movk     w9, #0x95d3, lsl #16
    cmp      w8, w9
    b.gt     #0x32b768
    mov      w9, #0xe18
    movk     w9, #0x82c0, lsl #16
    cmp      w8, w9
    b.eq     #0x32b818
    mov      w9, #0x7588
    movk     w9, #0x8d81, lsl #16
    cmp      w8, w9
    b.ne     #0x32b5b0
    ldr      x1, [sp, #0x30]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x20]
    ldr      x8, [sp]
    mov      w9, #0x4e54
    movk     w9, #0xf0f3, lsl #16
    str      w9, [x8]
    b        #0x32b5b0
    cmp      w8, w22
    b.eq     #0x32b800
    cmp      w8, w28
    b.eq     #0x32b840
    mov      w9, #0xfa85
    movk     w9, #0x161e, lsl #16
    cmp      w8, w9
    b.ne     #0x32b5b0
    ldr      x1, [sp, #0x30]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    ldr      x8, [sp]
    mov      w9, #0xe18
    movk     w9, #0x82c0, lsl #16
    str      w9, [x8]
    b        #0x32b5b0
    cmp      w8, w21
    b.eq     #0x32b7a4
    mov      w9, #0x1018
    movk     w9, #0x7e9e, lsl #16
    cmp      w8, w9
    b.ne     #0x32b5b0
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x600]
    str      x8, [sp, #0x38]
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x32b5b0
    cmp      w8, w20
    b.eq     #0x32b7e4
    mov      w9, #0x4e54
    movk     w9, #0xf0f3, lsl #16
    cmp      w8, w9
    b.ne     #0x32b5b0
    ldr      x2, [sp, #0x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    ldr      x0, [sp, #0x48]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x1f]
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x40]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    mov      w9, #0xe0b5
    movk     w9, #0x262f, lsl #16
    str      w9, [x8]
    b        #0x32b5b0
    mov      w9, #0x3320
    movk     w9, #0x9c3b, lsl #16
    cmp      w8, w9
    b.ne     #0x32b860
    ldr      x0, [sp, #0x40]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    mov      w9, #0x6ba3
    movk     w9, #0x53b6, lsl #16
    str      w9, [x8]
    b        #0x32b5b0
    ldrb     w8, [sp, #0x1f]
    cmp      w8, #0
    csel     w8, w20, w22, ne
    b        #0x32b834
    ldp      x1, x0, [sp, #0x38]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    mov      w8, #0x3320
    movk     w8, #0x9c3b, lsl #16
    mov      w9, #0xc0c5
    movk     w9, #0x9fa7, lsl #16
    b        #0x32b830
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xd48]
    str      x8, [sp, #0x30]
    ldr      x8, [sp]
    mov      w9, #0xfa85
    movk     w9, #0x161e, lsl #16
    str      w9, [x8]
    b        #0x32b5b0
    ldr      x0, [sp, #0x48]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    mov      w9, #0x85d5
    movk     w9, #0x95d3, lsl #16
    str      w9, [x8]
    b        #0x32b5b0
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xce0]
    str      x8, [sp, #0x10]
    ldr      x8, [sp]
    str      w28, [x8]
    b        #0x32b5b0
    ldr      x8, [sp, #0x28]
    cmp      x8, #0
    mov      w8, #0x3320
    movk     w8, #0x9c3b, lsl #16
    mov      w9, #0x7588
    movk     w9, #0x8d81, lsl #16
    csel     w8, w8, w9, eq
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x32b5b0
    ldr      x1, [sp, #0x10]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp]
    mov      w9, #0x49b3
    movk     w9, #0xa7a7, lsl #16
    str      w9, [x8]
    b        #0x32b5b0
    mov      w9, #0x85d5
    movk     w9, #0x95d3, lsl #16
    cmp      w8, w9
    b.ne     #0x32b5b0
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    add      sp, sp, #0xb0
    ret      

// -[WCLGHomeGroupBar setSelectedDisplayIndex:animated:] IMP=0x32B890 bounds=0x32B890-0x32B914
loc_32B890:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xce0]
    str      x8, [sp, #0x18]
    mov      w20, #0x6c19
    movk     w20, #0x907c, lsl #16
    str      w20, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w21, #0xdd41
    movk     w21, #0x6e4d, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w20
    b.eq     #0x32b8e8
    cmp      w8, w21
    b.ne     #0x32b8d0
    b        #0x32b900
    ldr      x1, [sp, #0x18]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x32b8d0
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    ret      

// -[WCLGHomeGroupBar refreshBadgesWithTable:] IMP=0x32B914 bounds=0x32B914-0x32C388
loc_32B914:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x230
    mov      x19, x2
    str      x0, [sp, #8]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x60]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x198]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xcd8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x158]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd50]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x157]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xcf8]
    ldr      x0, [sp, #0x158]
    bl       #0x461c6c // _objc_msgSend
    mov      w9, #0x5b49
    movk     w9, #0x2b1e, lsl #16
    strb     w0, [sp, #0x156]
    add      x8, sp, #0x1c
    mov      w20, #0xa666
    movk     w20, #0xc721, lsl #16
    str      w9, [sp, #0x1c]
    mov      w28, #0x8af5
    movk     w28, #0xa276, lsl #16
    mov      w21, #0xb015
    movk     w21, #0x9ba0, lsl #16
    str      x8, [sp, #0x10]
    add      x8, sp, #0x160
    add      x8, x8, #8
    str      x8, [sp]
    mov      w22, #0x2478
    movk     w22, #0xb37e, lsl #16
    mov      w27, #0x5b48
    movk     w27, #0x2b1e, lsl #16
    mov      w26, #0xa17d
    movk     w26, #0xed67, lsl #16
    mov      w25, #0x296a
    movk     w25, #0x59ba, lsl #16
    mov      w23, #0xa651
    movk     w23, #0x519f, lsl #16
    mov      w24, #0x584c
    movk     w24, #0x630f, lsl #16
    ldr      w8, [sp, #0x1c]
    cmp      w8, w20
    b.le     #0x32ba74
    cmp      w8, w27
    b.le     #0x32baf4
    cmp      w8, w25
    b.gt     #0x32bbc8
    cmp      w8, w23
    b.le     #0x32bd78
    mov      w9, #0xa652
    movk     w9, #0x519f, lsl #16
    cmp      w8, w9
    b.eq     #0x32c168
    mov      w9, #0x4966
    movk     w9, #0x54f2, lsl #16
    cmp      w8, w9
    b.eq     #0x32bf90
    mov      w9, #0xb348
    movk     w9, #0x54f6, lsl #16
    cmp      w8, w9
    b.ne     #0x32ba00
    ldrb     w8, [sp, #0xc7]
    cmp      w8, #0
    mov      w8, #0x6b51
    movk     w8, #0x63a9, lsl #16
    mov      w9, #0xbdb
    movk     w9, #0x9f24, lsl #16
    csel     w8, w8, w9, ne
    b        #0x32c098
    cmp      w8, w28
    b.le     #0x32bb6c
    cmp      w8, w22
    b.gt     #0x32bc24
    mov      w9, #0xd625
    movk     w9, #0xa8d8, lsl #16
    cmp      w8, w9
    b.le     #0x32beb4
    mov      w9, #0xd626
    movk     w9, #0xa8d8, lsl #16
    cmp      w8, w9
    b.eq     #0x32c280
    mov      w9, #0xb46
    movk     w9, #0xacb5, lsl #16
    cmp      w8, w9
    b.eq     #0x32c05c
    mov      w9, #0xed56
    movk     w9, #0xace4, lsl #16
    cmp      w8, w9
    b.ne     #0x32ba00
    ldrb     w8, [sp, #0x5f]
    cmp      w8, #0
    mov      w8, #0xdfab
    movk     w8, #0xcc4f, lsl #16
    mov      w9, #0x296b
    movk     w9, #0x59ba, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    ldr      x8, [sp, #0x60]
    str      x8, [sp, #0x50]
    b        #0x32ba00
    cmp      w8, w26
    b.le     #0x32bc84
    mov      w9, #0x5797
    movk     w9, #0x24d, lsl #16
    cmp      w8, w9
    b.le     #0x32bf50
    mov      w9, #0x5798
    movk     w9, #0x24d, lsl #16
    cmp      w8, w9
    b.eq     #0x32c30c
    mov      w9, #0xc260
    movk     w9, #0x3c5, lsl #16
    cmp      w8, w9
    b.eq     #0x32c13c
    mov      w9, #0xcb0
    movk     w9, #0x16b4, lsl #16
    cmp      w8, w9
    b.ne     #0x32ba00
    ldrb     w8, [sp, #0x157]
    ldrb     w9, [sp, #0x117]
    and      w8, w9, w8
    and      w8, w8, #1
    strb     w8, [sp, #0x116]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xdfab
    movk     w9, #0xcc4f, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x130]
    str      x8, [sp, #0x50]
    b        #0x32ba00
    cmp      w8, w21
    b.le     #0x32bcdc
    mov      w9, #0xbda
    movk     w9, #0x9f24, lsl #16
    cmp      w8, w9
    b.le     #0x32bdf0
    mov      w9, #0xbdb
    movk     w9, #0x9f24, lsl #16
    cmp      w8, w9
    b.eq     #0x32c1e8
    mov      w9, #0x58b3
    movk     w9, #0xa067, lsl #16
    cmp      w8, w9
    b.eq     #0x32bfd4
    mov      w9, #0x1179
    movk     w9, #0xa244, lsl #16
    cmp      w8, w9
    b.ne     #0x32ba00
    ldr      x8, [sp, #0x10]
    mov      w9, #0xc260
    movk     w9, #0x3c5, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    cmp      w8, w24
    b.le     #0x32bdac
    mov      w9, #0x584d
    movk     w9, #0x630f, lsl #16
    cmp      w8, w9
    b.eq     #0x32c190
    mov      w9, #0x6b51
    movk     w9, #0x63a9, lsl #16
    cmp      w8, w9
    b.eq     #0x32bfb4
    mov      w9, #0x6353
    movk     w9, #0x73c8, lsl #16
    cmp      w8, w9
    b.ne     #0x32ba00
    ldr      x1, [sp, #0xf0]
    ldr      x0, [sp, #0xa8]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x9f]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xb46
    movk     w9, #0xacb5, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    mov      w9, #0x7c57
    movk     w9, #0xc104, lsl #16
    cmp      w8, w9
    b.le     #0x32bf04
    mov      w9, #0x7c58
    movk     w9, #0xc104, lsl #16
    cmp      w8, w9
    b.eq     #0x32c2b0
    mov      w9, #0x7bb6
    movk     w9, #0xc122, lsl #16
    cmp      w8, w9
    b.eq     #0x32c07c
    mov      w9, #0xb791
    movk     w9, #0xc592, lsl #16
    cmp      w8, w9
    b.ne     #0x32ba00
    add      x8, sp, #0x160
    add      x8, x8, #0x10
    str      x8, [sp, #0x128]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xb016
    movk     w9, #0x9ba0, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    mov      w9, #0x4753
    movk     w9, #0xd1a5, lsl #16
    cmp      w8, w9
    b.le     #0x32be2c
    mov      w9, #0x4754
    movk     w9, #0xd1a5, lsl #16
    cmp      w8, w9
    b.eq     #0x32c040
    mov      w9, #0x4048
    movk     w9, #0xde06, lsl #16
    cmp      w8, w9
    b.ne     #0x32c33c
    ldr      x8, [sp, #0x70]
    ldr      x9, [sp, #0x30]
    cmp      x8, x9
    cset     w8, eq
    strb     w8, [sp, #0x6f]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x5798
    movk     w9, #0x24d, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    mov      w9, #0x7828
    movk     w9, #0x9a4c, lsl #16
    cmp      w8, w9
    b.gt     #0x32bd34
    mov      w9, #0xefd
    movk     w9, #0x865f, lsl #16
    cmp      w8, w9
    b.eq     #0x32c000
    mov      w9, #0xb7b2
    movk     w9, #0x89f3, lsl #16
    cmp      w8, w9
    b.ne     #0x32ba00
    ldr      x8, [sp, #0xc8]
    ldr      x9, [sp, #0xb8]
    cmp      x8, x9
    cset     w8, lt
    strb     w8, [sp, #0xb7]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x7bb6
    movk     w9, #0xc122, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    mov      w9, #0x7829
    movk     w9, #0x9a4c, lsl #16
    cmp      w8, w9
    b.eq     #0x32c01c
    mov      w9, #0xe1fd
    movk     w9, #0x9b4f, lsl #16
    cmp      w8, w9
    b.ne     #0x32ba00
    ldr      x1, [sp, #0xc8]
    mov      x0, x19
    bl       #0x36dae4
    str      x0, [sp, #0xa0]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x53cc
    movk     w9, #0x9d77, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    mov      w9, #0x5b49
    movk     w9, #0x2b1e, lsl #16
    cmp      w8, w9
    b.eq     #0x32c0a4
    mov      w9, #0xed50
    movk     w9, #0x49aa, lsl #16
    cmp      w8, w9
    b.ne     #0x32ba00
    ldr      x8, [sp, #0x10]
    mov      w9, #0xa652
    movk     w9, #0x519f, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    mov      w9, #0x296b
    movk     w9, #0x59ba, lsl #16
    cmp      w8, w9
    b.eq     #0x32c118
    mov      w9, #0xb1b7
    movk     w9, #0x6153, lsl #16
    cmp      w8, w9
    b.ne     #0x32ba00
    ldr      x0, [sp, #0x158]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    mov      w9, #0x75cb
    movk     w9, #0xd2eb, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    mov      w9, #0xb016
    movk     w9, #0x9ba0, lsl #16
    cmp      w8, w9
    b.eq     #0x32c1b4
    mov      w9, #0x53cc
    movk     w9, #0x9d77, lsl #16
    cmp      w8, w9
    b.ne     #0x32ba00
    ldr      x8, [sp, #0x10]
    mov      w9, #0x584d
    movk     w9, #0x630f, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0xa0]
    str      x8, [sp, #0x40]
    b        #0x32ba00
    mov      w9, #0xa667
    movk     w9, #0xc721, lsl #16
    cmp      w8, w9
    b.eq     #0x32c20c
    mov      w9, #0xdfab
    movk     w9, #0xcc4f, lsl #16
    cmp      w8, w9
    b.ne     #0x32ba00
    ldr      x8, [sp, #0x50]
    str      x8, [sp, #0x30]
    adrp     x8, #0x4c1000
    ldr      x9, [x8, #0xcd8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x600]
    stp      x8, x9, [sp, #0x100]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x608]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xd00]
    stp      x8, x9, [sp, #0xf0]
    adrp     x8, #0x4c1000
    ldr      x9, [x8, #0xd08]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xd10]
    stp      x8, x9, [sp, #0xe0]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xd58]
    str      x8, [sp, #0xd8]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xdc5
    movk     w9, #0xb399, lsl #16
    str      w9, [x8]
    str      xzr, [sp, #0x48]
    b        #0x32ba00
    mov      w9, #0x8af6
    movk     w9, #0xa276, lsl #16
    cmp      w8, w9
    b.eq     #0x32c228
    mov      w9, #0x6c0b
    movk     w9, #0xa4bf, lsl #16
    cmp      w8, w9
    b.ne     #0x32ba00
    ldr      x0, [sp, #0x148]
    ldr      x1, [sp, #0xf8]
    ldr      x2, [sp, #0xc8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0xa8]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x1179
    movk     w9, #0xa244, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    mov      w9, #0x2479
    movk     w9, #0xb37e, lsl #16
    cmp      w8, w9
    b.eq     #0x32c254
    mov      w9, #0xdc5
    movk     w9, #0xb399, lsl #16
    cmp      w8, w9
    b.ne     #0x32ba00
    ldr      x8, [sp, #0x48]
    str      x8, [sp, #0x28]
    ldp      x9, x8, [sp, #0x120]
    ldr      x8, [x8]
    ldr      x8, [x8]
    cmp      x8, x9
    mov      w8, #0xa652
    movk     w8, #0x519f, lsl #16
    mov      w9, #0xa667
    movk     w9, #0xc721, lsl #16
    b        #0x32bf88
    mov      w9, #0xa17e
    movk     w9, #0xed67, lsl #16
    cmp      w8, w9
    b.eq     #0x32c2e8
    mov      w9, #0x7ba6
    movk     w9, #0x225, lsl #16
    cmp      w8, w9
    b.ne     #0x32ba00
    ldr      x8, [sp, #0x130]
    cmp      x8, #0
    mov      w8, #0x296b
    movk     w8, #0x59ba, lsl #16
    mov      w9, #0xb791
    movk     w9, #0xc592, lsl #16
    csel     w8, w8, w9, eq
    b        #0x32c098
    ldr      x1, [sp, #0xe8]
    ldr      x0, [sp, #0xa8]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x90]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x7829
    movk     w9, #0x9a4c, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    ldr      x8, [sp, #0x28]
    add      x8, x8, #1
    str      x8, [sp, #0x70]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x4048
    movk     w9, #0xde06, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    ldr      x3, [sp, #0x38]
    ldp      x0, x1, [sp, #0xd0]
    ldr      x2, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0xa8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    mov      w9, #0x6b51
    movk     w9, #0x63a9, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    ldr      x0, [sp, #0x80]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    mov      w9, #0x4754
    movk     w9, #0xd1a5, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    ldr      x8, [sp, #0x90]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [sp, #0x8f]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x8af6
    movk     w9, #0xa276, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    ldr      x8, [sp, #0x10]
    mov      w9, #0x58b3
    movk     w9, #0xa067, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x78]
    str      x8, [sp, #0x38]
    b        #0x32ba00
    ldrb     w8, [sp, #0x9f]
    cmp      w8, #0
    mov      w8, #0x58b3
    movk     w8, #0xa067, lsl #16
    mov      w9, #0x4966
    movk     w9, #0x54f2, lsl #16
    csel     w8, w8, w9, ne
    b        #0x32c244
    ldrb     w8, [sp, #0xb7]
    cmp      w8, #0
    mov      w8, #0x6b51
    movk     w8, #0x63a9, lsl #16
    mov      w9, #0x6c0b
    movk     w9, #0xa4bf, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x32ba00
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xce0]
    ldr      x0, [sp, #0x158]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x148]
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x160]
    stp      q0, q0, [sp, #0x180]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xcf0]
    ldr      x0, [sp, #8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stp      x1, x0, [sp, #0x138]
    add      x2, sp, #0x160
    sub      x3, x29, #0xe0
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x130]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x7ba6
    movk     w9, #0x225, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    ldr      x0, [sp, #0x140]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x148]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    mov      w9, #0xb1b7
    movk     w9, #0x6153, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    ldrb     w8, [sp, #0x116]
    cmp      w8, #0
    mov      w8, #0x584d
    movk     w8, #0x630f, lsl #16
    mov      w9, #0xe1fd
    movk     w9, #0x9b4f, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    str      xzr, [sp, #0x40]
    b        #0x32ba00
    ldr      x8, [sp, #0x118]
    ldr      x8, [x8]
    ldr      x9, [sp, #0x28]
    ldr      x8, [x8, x9, lsl #3]
    str      x8, [sp, #0xd0]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xd626
    movk     w9, #0xa8d8, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    ldr      x8, [sp, #0x40]
    str      x8, [sp, #0x20]
    ldrb     w8, [sp, #0x156]
    cmp      w8, #0
    mov      w8, #0x58b3
    movk     w8, #0xa067, lsl #16
    mov      w9, #0x6353
    movk     w9, #0x73c8, lsl #16
    b        #0x32c240
    ldr      x8, [sp, #0x128]
    ldr      x8, [x8]
    ldr      x9, [x8]
    ldr      x8, [sp]
    stp      x8, x9, [sp, #0x118]
    cmp      x19, #0
    cset     w8, ne
    strb     w8, [sp, #0x117]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xcb0
    movk     w9, #0x16b4, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    ldr      x0, [sp, #0x148]
    ldr      x1, [sp, #0x100]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0xb8]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xb7b2
    movk     w9, #0x89f3, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    ldr      x0, [sp, #0x140]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp, #0x10]
    mov      w9, #0xed50
    movk     w9, #0x49aa, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    ldrb     w8, [sp, #0x8f]
    cmp      w8, #0
    mov      w8, #0x58b3
    movk     w8, #0xa067, lsl #16
    mov      w9, #0x7c58
    movk     w9, #0xc104, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    str      xzr, [sp, #0x38]
    b        #0x32ba00
    ldp      x1, x0, [sp, #0x138]
    add      x2, sp, #0x160
    sub      x3, x29, #0xe0
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x60]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xa17e
    movk     w9, #0xed67, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    ldr      x1, [sp, #0x108]
    ldr      x0, [sp, #0xd0]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0xc8]
    cmp      x0, #0
    cset     w8, lt
    strb     w8, [sp, #0xc7]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xb348
    movk     w9, #0x54f6, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    ldr      x1, [sp, #0xe0]
    ldr      x0, [sp, #0xa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x80]
    ldr      x1, [sp, #0x100]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x78]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xefd
    movk     w9, #0x865f, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    ldr      x8, [sp, #0x60]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [sp, #0x5f]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xed56
    movk     w9, #0xace4, lsl #16
    str      w9, [x8]
    b        #0x32ba00
    ldrb     w8, [sp, #0x6f]
    cmp      w8, #0
    mov      w8, #0xdc5
    movk     w8, #0xb399, lsl #16
    mov      w9, #0x2479
    movk     w9, #0xb37e, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    ldr      x8, [sp, #0x70]
    str      x8, [sp, #0x48]
    b        #0x32ba00
    mov      w9, #0x75cb
    movk     w9, #0xd2eb, lsl #16
    cmp      w8, w9
    b.ne     #0x32ba00
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x32c384
    add      sp, sp, #0x230
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGHomeGroupBar layoutSubviews] IMP=0x32C388 bounds=0x32C388-0x32CE8C
loc_32C388:
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
    sub      sp, sp, #0x290
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0xa0]
    mov      w21, #0x76b2
    movk     w21, #0xfc95, lsl #16
    mov      w20, #0x3025
    movk     w20, #0xf413, lsl #16
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7d8]
    stp      x0, x8, [sp, #0x1d0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
    add      x0, sp, #0x1d0
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    str      x1, [sp, #0x188]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    stp      d0, d1, [sp, #0x168]
    mov      w9, #0x82b2
    movk     w9, #0x5f91, lsl #16
    add      x8, sp, #0xc
    mov      w22, #0x5a26
    movk     w22, #0xe933, lsl #16
    mov      w25, #0xc87e
    movk     w25, #0xb979, lsl #16
    stp      d2, d3, [sp, #0x178]
    mov      w27, #0x8b9c
    movk     w27, #0x94b6, lsl #16
    stp      d0, d1, [sp, #0x158]
    str      w9, [sp, #0xc]
    str      x8, [sp]
    mov      w28, #0x967d
    movk     w28, #0xd88b, lsl #16
    fmov     d12, #8.00000000
    fmov     d13, #0.50000000
    fmov     d14, xzr
    mov      w23, #0x5416
    movk     w23, #0x2dec, lsl #16
    mov      w26, #0x3024
    movk     w26, #0xf413, lsl #16
    mov      w24, #0x82b1
    movk     w24, #0x5f91, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w22
    b.gt     #0x32c4ec
    cmp      w8, w25
    b.gt     #0x32c554
    cmp      w8, w27
    b.gt     #0x32c5ec
    mov      w9, #0xd1e0
    movk     w9, #0x8e5a, lsl #16
    cmp      w8, w9
    b.gt     #0x32c7b8
    mov      w9, #0xfb2f
    movk     w9, #0x859a, lsl #16
    cmp      w8, w9
    b.eq     #0x32c9c4
    mov      w9, #0x149b
    movk     w9, #0x87f8, lsl #16
    cmp      w8, w9
    b.ne     #0x32c470
    ldr      x8, [sp, #0xe8]
    ldr      x8, [x8]
    ldr      x9, [sp, #0x28]
    ldr      x8, [x8, x9, lsl #3]
    str      x8, [sp, #0xd8]
    ldr      d0, [sp, #0x20]
    str      d0, [sp, #0x1e0]
    ldr      x8, [sp]
    mov      w9, #0x967e
    movk     w9, #0xd88b, lsl #16
    str      w9, [x8]
    b        #0x32c470
    cmp      w8, w23
    b.le     #0x32c5a8
    cmp      w8, w24
    b.gt     #0x32c658
    mov      w9, #0x6833
    movk     w9, #0x3c58, lsl #16
    cmp      w8, w9
    b.gt     #0x32c8e0
    mov      w9, #0x5417
    movk     w9, #0x2dec, lsl #16
    cmp      w8, w9
    b.eq     #0x32cb5c
    mov      w9, #0xac7
    movk     w9, #0x36fb, lsl #16
    cmp      w8, w9
    b.ne     #0x32c470
    ldr      x8, [sp, #0x68]
    str      x8, [sp, #0x30]
    ldr      d0, [sp, #0x70]
    ldr      x8, [sp]
    mov      w9, #0x64a6
    movk     w9, #0xa7d, lsl #16
    str      w9, [x8]
    str      d0, [sp, #0x60]
    str      xzr, [sp, #0x58]
    b        #0x32c470
    cmp      w8, w28
    b.le     #0x32c6bc
    mov      w9, #0x3254
    movk     w9, #0xe091, lsl #16
    cmp      w8, w9
    b.gt     #0x32c85c
    mov      w9, #0x967e
    movk     w9, #0xd88b, lsl #16
    cmp      w8, w9
    b.eq     #0x32ca6c
    mov      w9, #0x1ff0
    movk     w9, #0xd91d, lsl #16
    cmp      w8, w9
    b.ne     #0x32c470
    ldr      x8, [sp, #0xa8]
    cmp      x8, #0
    mov      w8, #0x4004
    movk     w8, #0xbd2a, lsl #16
    mov      w9, #0xeaa6
    movk     w9, #0x1d7b, lsl #16
    b        #0x32cb54
    cmp      w8, w26
    b.le     #0x32c764
    mov      w9, #0x64a5
    movk     w9, #0xa7d, lsl #16
    cmp      w8, w9
    b.gt     #0x32c8a0
    cmp      w8, w20
    b.eq     #0x32cae0
    cmp      w8, w21
    b.ne     #0x32c470
    ldr      x0, [sp, #0x38]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    mov      w9, #0x4004
    movk     w9, #0xbd2a, lsl #16
    str      w9, [x8]
    b        #0x32c470
    mov      w9, #0xf7be
    movk     w9, #0xb2dc, lsl #16
    cmp      w8, w9
    b.gt     #0x32c810
    mov      w9, #0x8b9d
    movk     w9, #0x94b6, lsl #16
    cmp      w8, w9
    b.eq     #0x32ca08
    mov      w9, #0x46d8
    movk     w9, #0xac0a, lsl #16
    cmp      w8, w9
    b.ne     #0x32c470
    ldrb     w8, [sp, #0xbf]
    cmp      w8, #0
    mov      w8, #0x2338
    movk     w8, #0x6695, lsl #16
    mov      w9, #0xac7
    movk     w9, #0x36fb, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [sp]
    str      w8, [x9]
    ldr      d0, [sp, #0xd0]
    ldr      x8, [sp, #0xc0]
    str      d0, [sp, #0x70]
    str      x8, [sp, #0x68]
    str      d0, [sp, #0x50]
    b        #0x32c470
    mov      w9, #0x2337
    movk     w9, #0x6695, lsl #16
    cmp      w8, w9
    b.gt     #0x32c92c
    mov      w9, #0x82b2
    movk     w9, #0x5f91, lsl #16
    cmp      w8, w9
    b.eq     #0x32cb78
    mov      w9, #0x1ed0
    movk     w9, #0x5ff5, lsl #16
    cmp      w8, w9
    b.ne     #0x32c470
    ldr      x0, [sp, #0x18]
    bl       #0x461ca8 // _objc_retain
    ldr      x1, [sp, #0x78]
    ldr      x2, [sp, #0x18]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    mov      w9, #0xc49
    movk     w9, #0xe96a, lsl #16
    str      w9, [x8]
    b        #0x32c470
    mov      w9, #0x4003
    movk     w9, #0xbd2a, lsl #16
    cmp      w8, w9
    b.gt     #0x32c96c
    mov      w9, #0xc87f
    movk     w9, #0xb979, lsl #16
    cmp      w8, w9
    b.eq     #0x32c990
    mov      w9, #0xe782
    movk     w9, #0xbb46, lsl #16
    cmp      w8, w9
    b.ne     #0x32c470
    ldr      x0, [sp, #0x120]
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x1b0]
    stp      q0, q0, [sp, #0x190]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xcf0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stp      x1, x0, [sp, #0x108]
    add      x2, sp, #0x190
    add      x3, sp, #0x200
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x100]
    cmp      x0, #0
    mov      w8, #0x2338
    movk     w8, #0x6695, lsl #16
    mov      w9, #0xf7bf
    movk     w9, #0xb2dc, lsl #16
    csel     w8, w8, w9, eq
    ldr      x9, [sp]
    str      w8, [x9]
    ldr      d0, [sp, #0x138]
    str      d0, [sp, #0x50]
    b        #0x32c470
    mov      w9, #0x5a27
    movk     w9, #0xe933, lsl #16
    cmp      w8, w9
    b.eq     #0x32ce04
    mov      w9, #0xc49
    movk     w9, #0xe96a, lsl #16
    cmp      w8, w9
    b.eq     #0x32cdf0
    mov      w9, #0x1272
    movk     w9, #0xea3f, lsl #16
    cmp      w8, w9
    b.ne     #0x32c470
    ldr      x8, [sp, #0xc0]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [sp, #0xbf]
    ldr      x8, [sp]
    mov      w9, #0x46d8
    movk     w9, #0xac0a, lsl #16
    str      w9, [x8]
    b        #0x32c470
    mov      w9, #0xd1e1
    movk     w9, #0x8e5a, lsl #16
    cmp      w8, w9
    b.eq     #0x32ca28
    mov      w9, #0xc893
    movk     w9, #0x9196, lsl #16
    cmp      w8, w9
    b.ne     #0x32c470
    ldr      x8, [sp, #0xc8]
    ldr      x9, [sp, #0x30]
    cmp      x8, x9
    mov      w9, #0x64a6
    movk     w9, #0xa7d, lsl #16
    mov      w10, #0x5a27
    movk     w10, #0xe933, lsl #16
    csel     w9, w10, w9, eq
    ldr      x10, [sp]
    str      w9, [x10]
    ldr      d0, [sp, #0xd0]
    str      d0, [sp, #0x60]
    str      x8, [sp, #0x58]
    b        #0x32c470
    mov      w9, #0xf7bf
    movk     w9, #0xb2dc, lsl #16
    cmp      w8, w9
    b.eq     #0x32ca3c
    mov      w9, #0xbb0f
    movk     w9, #0xb47d, lsl #16
    cmp      w8, w9
    b.ne     #0x32c470
    ldrb     w8, [sp, #0x87]
    ldrb     w9, [sp, #0x86]
    and      w8, w8, w9
    tst      w8, #1
    csel     w8, w20, w21, ne
    ldr      x9, [sp]
    str      w8, [x9]
    ldp      x9, x8, [sp, #0x88]
    stp      x8, x9, [sp, #0x40]
    str      x8, [sp, #0x38]
    b        #0x32c470
    mov      w9, #0x3255
    movk     w9, #0xe091, lsl #16
    cmp      w8, w9
    b.eq     #0x32cabc
    mov      w9, #0xf62e
    movk     w9, #0xe29e, lsl #16
    cmp      w8, w9
    b.ne     #0x32c470
    ldr      d0, [sp, #0x130]
    ldr      d1, [sp, #0x118]
    fadd     d0, d0, d1
    str      d0, [sp, #0xe0]
    ldr      x8, [sp]
    mov      w9, #0x3255
    movk     w9, #0xe091, lsl #16
    str      w9, [x8]
    b        #0x32c470
    mov      w9, #0x64a6
    movk     w9, #0xa7d, lsl #16
    cmp      w8, w9
    b.eq     #0x32cb24
    mov      w9, #0xeaa6
    movk     w9, #0x1d7b, lsl #16
    cmp      w8, w9
    b.ne     #0x32c470
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x410]
    str      x8, [sp, #0xa0]
    ldr      x8, [sp]
    mov      w9, #0x40b7
    movk     w9, #0x6a79, lsl #16
    str      w9, [x8]
    b        #0x32c470
    mov      w9, #0x6834
    movk     w9, #0x3c58, lsl #16
    cmp      w8, w9
    b.eq     #0x32cce8
    mov      w9, #0xbce2
    movk     w9, #0x5886, lsl #16
    cmp      w8, w9
    b.ne     #0x32c470
    ldr      x1, [sp, #0xb0]
    ldr      x0, [sp, #0x18]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x90]
    ldr      x8, [sp]
    mov      w9, #0xfb2f
    movk     w9, #0x859a, lsl #16
    str      w9, [x8]
    b        #0x32c470
    mov      w9, #0x2338
    movk     w9, #0x6695, lsl #16
    cmp      w8, w9
    b.eq     #0x32ccfc
    mov      w9, #0x40b7
    movk     w9, #0x6a79, lsl #16
    cmp      w8, w9
    b.ne     #0x32c470
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x418]
    str      x8, [sp, #0x98]
    ldr      x8, [sp]
    mov      w9, #0x4c65
    movk     w9, #0xce2b, lsl #16
    str      w9, [x8]
    b        #0x32c470
    mov      w9, #0x4c65
    movk     w9, #0xce2b, lsl #16
    cmp      w8, w9
    b.ne     #0x32ce30
    ldr      x8, [sp]
    str      w20, [x8]
    ldr      x8, [sp, #0xa8]
    stp      x8, xzr, [sp, #0x40]
    b        #0x32c470
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9a0]
    str      x1, [sp, #0xb0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0xa8]
    ldr      x8, [sp]
    mov      w9, #0xd1e1
    movk     w9, #0x8e5a, lsl #16
    str      w9, [x8]
    b        #0x32c470
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    add      x9, x8, #1
    str      x9, [sp, #0x88]
    ldr      x9, [sp, #0x90]
    cmp      x9, #0
    cset     w9, ne
    strb     w9, [sp, #0x87]
    cmp      x8, #5
    cset     w8, lo
    strb     w8, [sp, #0x86]
    ldr      x8, [sp]
    mov      w9, #0xbb0f
    movk     w9, #0xb47d, lsl #16
    str      w9, [x8]
    b        #0x32c470
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xd88]
    str      x8, [sp, #0x78]
    ldr      x8, [sp]
    mov      w9, #0x1ed0
    movk     w9, #0x5ff5, lsl #16
    str      w9, [x8]
    b        #0x32c470
    ldr      x8, [sp]
    mov      w9, #0x1ff0
    movk     w9, #0xd91d, lsl #16
    str      w9, [x8]
    b        #0x32c470
    add      x9, sp, #0x190
    add      x10, x9, #0x10
    ldr      x8, [sp, #0x1a0]
    ldr      x8, [x8]
    stp      x8, x10, [sp, #0xf0]
    add      x8, x9, #8
    str      x8, [sp, #0xe8]
    ldr      x8, [sp]
    mov      w9, #0xf62e
    movk     w9, #0xe29e, lsl #16
    str      w9, [x8]
    b        #0x32c470
    ldr      d1, [sp, #0x128]
    ldr      d0, [sp, #0x1e0]
    ldr      d2, [sp, #0x118]
    ldr      x1, [sp, #0x148]
    ldr      x0, [sp, #0xd8]
    mov      x8, #0x4049000000000000
    fmov     d3, x8
    bl       #0x461c6c // _objc_msgSend
    ldr      d0, [sp, #0xe0]
    ldr      d1, [sp, #0x20]
    fadd     d0, d0, d1
    str      d0, [sp, #0xd0]
    ldr      x8, [sp, #0x28]
    add      x8, x8, #1
    str      x8, [sp, #0xc8]
    ldr      x8, [sp]
    mov      w9, #0xc893
    movk     w9, #0x9196, lsl #16
    str      w9, [x8]
    b        #0x32c470
    ldr      x8, [sp]
    mov      w9, #0xac7
    movk     w9, #0x36fb, lsl #16
    str      w9, [x8]
    ldr      d0, [sp, #0x138]
    ldr      x8, [sp, #0x100]
    str      d0, [sp, #0x70]
    str      x8, [sp, #0x68]
    b        #0x32c470
    ldp      x9, x8, [sp, #0x40]
    stp      x8, x9, [sp, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa0]
    ldr      x1, [sp, #0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    ldr      x1, [sp, #0x98]
    ldr      x0, [sp, #0x18]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #0x8b9d
    movk     w8, #0x94b6, lsl #16
    mov      w9, #0xbce2
    movk     w9, #0x5886, lsl #16
    csel     w8, w8, w9, ne
    b        #0x32cde4
    ldr      x8, [sp, #0x58]
    str      x8, [sp, #0x28]
    ldr      d0, [sp, #0x60]
    str      d0, [sp, #0x20]
    ldp      x9, x8, [sp, #0xf0]
    ldr      x8, [x8]
    ldr      x8, [x8]
    cmp      x8, x9
    mov      w8, #0x149b
    movk     w8, #0x87f8, lsl #16
    mov      w9, #0x5417
    movk     w9, #0x2dec, lsl #16
    csel     w8, w8, w9, eq
    b        #0x32cde4
    ldr      x0, [sp, #0x110]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp]
    mov      w9, #0x6834
    movk     w9, #0x3c58, lsl #16
    str      w9, [x8]
    b        #0x32c470
    ldp      d9, d8, [sp, #0x158]
    ldp      d11, d10, [sp, #0x178]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd38]
    str      x1, [sp, #0x150]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    str      x1, [sp, #0x148]
    fmov     d0, d9
    fmov     d1, d8
    fmov     d2, d11
    fmov     d3, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x28, #0x4c4000
    ldr      x0, [x28, #0x198]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xcd8]
    str      x1, [sp, #0x140]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xdd8]
    bl       #0x461c6c // _objc_msgSend
    str      d0, [sp, #0x138]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x28, #0x198]
    ldr      x1, [sp, #0x140]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd60]
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    fcmp     d8, #0.0
    fcsel    d0, d8, d12, hi
    str      d0, [sp, #0x130]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x5d0]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd68]
    bl       #0x461c6c // _objc_msgSend
    mov      x8, #-0x3fb7000000000000
    fmov     d1, x8
    fadd     d0, d0, d1
    fmul     d0, d0, d13
    fmaxnm   d8, d0, d14
    ldr      x0, [x28, #0x198]
    ldr      x1, [sp, #0x140]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd70]
    bl       #0x461c6c // _objc_msgSend
    fadd     d0, d8, d0
    str      d0, [sp, #0x128]
    mov      x0, x20
    mov      w20, #0x3025
    movk     w20, #0xf413, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x0, [x28, #0x198]
    mov      w28, #0x967d
    movk     w28, #0xd88b, lsl #16
    ldr      x1, [sp, #0x140]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x120]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd78]
    bl       #0x461c6c // _objc_msgSend
    str      d0, [sp, #0x118]
    ldr      x8, [sp]
    mov      w9, #0xe782
    movk     w9, #0xbb46, lsl #16
    str      w9, [x8]
    b        #0x32c470
    ldr      x8, [sp]
    mov      w9, #0x149b
    movk     w9, #0x87f8, lsl #16
    str      w9, [x8]
    b        #0x32c470
    ldr      d8, [sp, #0x50]
    ldr      x0, [sp, #0x110]
    bl       #0x461c9c // _objc_release
    ldp      d0, d1, [sp, #0x130]
    fsub     d0, d8, d0
    fadd     d8, d1, d0
    ldr      x1, [sp, #0x188]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    fcmp     d8, d0
    fcsel    d8, d0, d8, mi
    ldr      x1, [sp, #0x188]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616b4 // _CGRectGetHeight
    fmov     d9, d0
    ldr      x1, [sp, #0x150]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x730]
    fmov     d0, d8
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd80]
    mov      x0, x19
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x198]
    ldr      x1, [sp, #0x140]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc30]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x20
    mov      w20, #0x3025
    movk     w20, #0xf413, lsl #16
    bl       #0x461c9c // _objc_release
    cmp      w21, #0
    mov      w21, #0x76b2
    movk     w21, #0xfc95, lsl #16
    mov      w8, #0x4004
    movk     w8, #0xbd2a, lsl #16
    mov      w9, #0xc87f
    movk     w9, #0xb979, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x32c470
    ldr      x8, [sp]
    str      w21, [x8]
    ldr      x8, [sp, #0x18]
    str      x8, [sp, #0x38]
    b        #0x32c470
    ldp      x1, x0, [sp, #0x108]
    add      x2, sp, #0x190
    add      x3, sp, #0x200
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0xc0]
    ldr      x8, [sp]
    mov      w9, #0x1272
    movk     w9, #0xea3f, lsl #16
    str      w9, [x8]
    b        #0x32c470
    mov      w9, #0x4004
    movk     w9, #0xbd2a, lsl #16
    cmp      w8, w9
    b.ne     #0x32c470
    ldur     x8, [x29, #-0xa0]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x32ce88
    add      sp, sp, #0x290
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

// -[WCLGHomeGroupBar scrollSelectedPillToVisibleIfNeededAnimated:] IMP=0x32CE8C bounds=0x32CE8C-0x32DAA8
loc_32CE8C:
    stp      d11, d10, [sp, #-0x80]!
    stp      d9, d8, [sp, #0x10]
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    sub      sp, sp, #0x290
    str      w2, [sp, #4]
    mov      x20, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    mov      w21, #0x6521
    movk     w21, #0xe402, lsl #16
    stur     x8, [x29, #-0x88]
    mov      w8, #0x9030
    movk     w8, #0xf253, lsl #16
    str      w8, [sp, #0x16c]
    add      x8, sp, #0x16c
    str      x8, [sp, #0x160]
    mov      w24, #0x6392
    movk     w24, #0xcd2, lsl #16
    mov      w19, #0x5e7d
    movk     w19, #0xcb4f, lsl #16
    mov      w23, #0x726
    movk     w23, #0xb0b4, lsl #16
    mov      w28, #0x902f
    movk     w28, #0xf253, lsl #16
    mov      w25, #0x2607
    movk     w25, #0x4f7c, lsl #16
    mov      w27, #0x8250
    movk     w27, #0x3008, lsl #16
    mov      w26, #0x7236
    movk     w26, #0x670b, lsl #16
    mov      w22, #0x17b6
    movk     w22, #0x759f, lsl #16
    ldr      w8, [sp, #0x16c]
    cmp      w8, w24
    b.gt     #0x32cfbc
    cmp      w8, w19
    b.gt     #0x32d04c
    cmp      w8, w23
    b.gt     #0x32d184
    mov      w9, #0x245b
    movk     w9, #0x9925, lsl #16
    cmp      w8, w9
    b.gt     #0x32d3dc
    mov      w9, #0x3c01
    movk     w9, #0x8cd7, lsl #16
    cmp      w8, w9
    b.eq     #0x32d8b4
    mov      w9, #0x81
    movk     w9, #0x926b, lsl #16
    cmp      w8, w9
    b.eq     #0x32d784
    mov      w9, #0x697
    movk     w9, #0x9724, lsl #16
    cmp      w8, w9
    b.ne     #0x32cf28
    ldr      x0, [sp, #0xe0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    str      x1, [sp, #0xd8]
    add      x2, sp, #0x170
    add      x3, sp, #0x1f8
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0xd0]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x2bb0
    movk     w9, #0x2609, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    cmp      w8, w25
    b.le     #0x32d0b8
    cmp      w8, w26
    b.gt     #0x32d124
    mov      w9, #0x6ea2
    movk     w9, #0x5d1e, lsl #16
    cmp      w8, w9
    b.gt     #0x32d32c
    mov      w9, #0x2608
    movk     w9, #0x4f7c, lsl #16
    cmp      w8, w9
    b.eq     #0x32d6b4
    mov      w9, #0x8641
    movk     w9, #0x5637, lsl #16
    cmp      w8, w9
    b.eq     #0x32d660
    mov      w9, #0x3304
    movk     w9, #0x5cee, lsl #16
    cmp      w8, w9
    b.ne     #0x32cf28
    add      x8, sp, #0x170
    movi     v0.16b, #0
    stp      q0, q0, [x8, #0x20]
    stp      q0, q0, [x8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xcf0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0xe0]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x697
    movk     w9, #0x9724, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    cmp      w8, w28
    b.gt     #0x32d1f4
    mov      w9, #0x6d5b
    movk     w9, #0xda95, lsl #16
    cmp      w8, w9
    b.gt     #0x32d468
    mov      w9, #0x5e7e
    movk     w9, #0xcb4f, lsl #16
    cmp      w8, w9
    b.eq     #0x32d8d4
    mov      w9, #0xf610
    movk     w9, #0xce90, lsl #16
    cmp      w8, w9
    b.eq     #0x32d7a0
    mov      w9, #0x55e5
    movk     w9, #0xd0ac, lsl #16
    cmp      w8, w9
    b.ne     #0x32cf28
    ldr      x0, [sp, #0xa8]
    bl       #0x461ca8 // _objc_retain
    ldr      x0, [sp, #0xe0]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x160]
    mov      w9, #0x7e53
    movk     w9, #0x7bb3, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    cmp      w8, w27
    b.le     #0x32d2c8
    mov      w9, #0x3552
    movk     w9, #0x459d, lsl #16
    cmp      w8, w9
    b.gt     #0x32d568
    mov      w9, #0x8251
    movk     w9, #0x3008, lsl #16
    cmp      w8, w9
    b.eq     #0x32da10
    mov      w9, #0x11c4
    movk     w9, #0x38d1, lsl #16
    cmp      w8, w9
    b.eq     #0x32d9c8
    mov      w9, #0xfd03
    movk     w9, #0x3ce2, lsl #16
    cmp      w8, w9
    b.ne     #0x32cf28
    ldr      x0, [sp, #0x128]
    bl       #0x461c9c // _objc_release
    ldrb     w8, [sp, #0xef]
    cmp      w8, #0
    mov      w8, #0x23f6
    movk     w8, #0x22c0, lsl #16
    mov      w9, #0x3304
    movk     w9, #0x5cee, lsl #16
    b        #0x32d374
    cmp      w8, w22
    b.gt     #0x32d37c
    mov      w9, #0x7237
    movk     w9, #0x670b, lsl #16
    cmp      w8, w9
    b.eq     #0x32d6dc
    mov      w9, #0xc35f
    movk     w9, #0x672f, lsl #16
    cmp      w8, w9
    b.eq     #0x32d67c
    mov      w9, #0x3600
    movk     w9, #0x746b, lsl #16
    cmp      w8, w9
    b.ne     #0x32cf28
    ldr      x8, [sp, #0x98]
    ldr      x9, [sp, #0x10]
    cmp      x8, x9
    cset     w8, eq
    strb     w8, [sp, #0x97]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x3401
    movk     w9, #0x7fb3, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    mov      w9, #0xf667
    movk     w9, #0xba6a, lsl #16
    cmp      w8, w9
    b.gt     #0x32d4b8
    mov      w9, #0x727
    movk     w9, #0xb0b4, lsl #16
    cmp      w8, w9
    b.eq     #0x32d8fc
    mov      w9, #0xd3c
    movk     w9, #0xb0be, lsl #16
    cmp      w8, w9
    b.eq     #0x32d7cc
    mov      w9, #0xd3ac
    movk     w9, #0xb1bb, lsl #16
    cmp      w8, w9
    b.ne     #0x32cf28
    ldr      x8, [sp, #0x20]
    str      x8, [sp, #8]
    ldp      x9, x8, [sp, #0xc0]
    ldr      x8, [x8]
    ldr      x8, [x8]
    cmp      x8, x9
    mov      w8, #0x2608
    movk     w8, #0x4f7c, lsl #16
    mov      w9, #0x81
    movk     w9, #0x926b, lsl #16
    csel     w8, w8, w9, eq
    b        #0x32d810
    mov      w9, #0xad6
    movk     w9, #0xf7de, lsl #16
    cmp      w8, w9
    b.gt     #0x32d514
    mov      w9, #0x9030
    movk     w9, #0xf253, lsl #16
    cmp      w8, w9
    b.eq     #0x32d918
    mov      w9, #0x1fe7
    movk     w9, #0xf46c, lsl #16
    cmp      w8, w9
    b.eq     #0x32d7f4
    mov      w9, #0x6d96
    movk     w9, #0xf5b1, lsl #16
    cmp      w8, w9
    b.ne     #0x32cf28
    ldp      d2, d3, [sp, #0x1c8]
    ldp      d0, d1, [sp, #0x1b8]
    fmov     d4, #-16.00000000
    fmov     d5, xzr
    bl       #0x461714 // _CGRectInset
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    ldr      x1, [sp, #0x130]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xda0]
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    ldr      w2, [sp, #4]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      w21, #0x6521
    movk     w21, #0xe402, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd90]
    ldr      x2, [sp, #0x150]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x160]
    mov      w9, #0x8641
    movk     w9, #0x5637, lsl #16
    str      w9, [x8]
    b        #0x32d700
    mov      w9, #0x2baf
    movk     w9, #0x2609, lsl #16
    cmp      w8, w9
    b.le     #0x32d5d4
    mov      w9, #0x2bb0
    movk     w9, #0x2609, lsl #16
    cmp      w8, w9
    b.eq     #0x32d648
    mov      w9, #0x6461
    movk     w9, #0x2773, lsl #16
    cmp      w8, w9
    b.eq     #0x32d624
    mov      w9, #0x22e
    movk     w9, #0x2ee8, lsl #16
    cmp      w8, w9
    b.ne     #0x32cf28
    ldr      x1, [sp, #0x148]
    mov      x0, x20
    mov      x2, #0x7fffffffffffffff
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x160]
    mov      w9, #0x794e
    movk     w9, #0x63cc, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    mov      w9, #0x6ea3
    movk     w9, #0x5d1e, lsl #16
    cmp      w8, w9
    b.eq     #0x32d70c
    mov      w9, #0x794e
    movk     w9, #0x63cc, lsl #16
    cmp      w8, w9
    b.eq     #0x32d668
    mov      w9, #0x3af9
    movk     w9, #0x653c, lsl #16
    cmp      w8, w9
    b.ne     #0x32cf28
    ldrb     w8, [sp, #0x10f]
    cmp      w8, #0
    mov      w8, #0x3166
    movk     w8, #0xbf1c, lsl #16
    mov      w9, #0x6306
    movk     w9, #0x4cb6, lsl #16
    csel     w8, w9, w8, ne
    b        #0x32d810
    mov      w9, #0x17b7
    movk     w9, #0x759f, lsl #16
    cmp      w8, w9
    b.eq     #0x32d738
    mov      w9, #0x7e53
    movk     w9, #0x7bb3, lsl #16
    cmp      w8, w9
    b.eq     #0x32d690
    mov      w9, #0x3401
    movk     w9, #0x7fb3, lsl #16
    cmp      w8, w9
    b.ne     #0x32cf28
    ldrb     w8, [sp, #0x97]
    cmp      w8, #0
    mov      w8, #0xd3ac
    movk     w8, #0xb1bb, lsl #16
    mov      w9, #0x8251
    movk     w9, #0x3008, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #0x160]
    str      w8, [x9]
    ldr      x8, [sp, #0x98]
    str      x8, [sp, #0x20]
    b        #0x32cf28
    mov      w9, #0x245c
    movk     w9, #0x9925, lsl #16
    cmp      w8, w9
    b.eq     #0x32d938
    mov      w9, #0x86ec
    movk     w9, #0x9b3b, lsl #16
    cmp      w8, w9
    b.eq     #0x32d81c
    mov      w9, #0x3929
    movk     w9, #0xa488, lsl #16
    cmp      w8, w9
    b.ne     #0x32cf28
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xcd8]
    ldr      x0, [sp, #0x158]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xce8]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x150]
    mov      x0, x21
    mov      w21, #0x6521
    movk     w21, #0xe402, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x150]
    cmp      x8, #0
    mov      w8, #0xd3c
    movk     w8, #0xb0be, lsl #16
    mov      w9, #0xf668
    movk     w9, #0xba6a, lsl #16
    csel     w8, w9, w8, lt
    b        #0x32d810
    mov      w9, #0x6d5c
    movk     w9, #0xda95, lsl #16
    cmp      w8, w9
    b.eq     #0x32d964
    cmp      w8, w21
    b.eq     #0x32d84c
    mov      w9, #0x1bac
    movk     w9, #0xf091, lsl #16
    cmp      w8, w9
    b.ne     #0x32cf28
    ldp      d1, d0, [sp, #0x40]
    ldr      q2, [sp, #0x30]
    add      x8, sp, #0xb9
    stur     q2, [x8, #0xff]
    stp      d1, d0, [sp, #0x1c8]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x6d96
    movk     w9, #0xf5b1, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    mov      w9, #0xf668
    movk     w9, #0xba6a, lsl #16
    cmp      w8, w9
    b.eq     #0x32d990
    mov      w9, #0x3166
    movk     w9, #0xbf1c, lsl #16
    cmp      w8, w9
    b.eq     #0x32d868
    mov      w9, #0x6881
    movk     w9, #0xc0a6, lsl #16
    cmp      w8, w9
    b.ne     #0x32cf28
    ldrb     w8, [sp, #0x86]
    cmp      w8, #0
    mov      w8, #0x8641
    movk     w8, #0x5637, lsl #16
    mov      w9, #0x86ec
    movk     w9, #0x9b3b, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [sp, #0x160]
    str      w8, [x9]
    str      xzr, [sp, #0x18]
    b        #0x32cf28
    mov      w9, #0xad7
    movk     w9, #0xf7de, lsl #16
    cmp      w8, w9
    b.eq     #0x32d9b0
    mov      w9, #0x3565
    movk     w9, #0xfe47, lsl #16
    cmp      w8, w9
    b.eq     #0x32d884
    mov      w9, #0x79f
    movk     w9, #0x532, lsl #16
    cmp      w8, w9
    b.ne     #0x32cf28
    ldp      d1, d0, [sp, #0x68]
    ldp      d3, d2, [sp, #0x58]
    bl       #0x461744 // _CGRectIsEmpty
    strb     w0, [sp, #0x57]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x7237
    movk     w9, #0x670b, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    mov      w9, #0x3553
    movk     w9, #0x459d, lsl #16
    cmp      w8, w9
    b.eq     #0x32da3c
    mov      w9, #0xe99e
    movk     w9, #0x45a1, lsl #16
    cmp      w8, w9
    b.eq     #0x32d9f0
    mov      w9, #0x6306
    movk     w9, #0x4cb6, lsl #16
    cmp      w8, w9
    b.ne     #0x32cf28
    ldr      x1, [sp, #0x130]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x100]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d0]
    bl       #0x461c6c // _objc_msgSend
    stp      d0, d1, [sp, #0xf0]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x6ea3
    movk     w9, #0x5d1e, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    mov      w9, #0x6393
    movk     w9, #0xcd2, lsl #16
    cmp      w8, w9
    b.eq     #0x32d608
    mov      w9, #0x8cf
    movk     w9, #0x15ac, lsl #16
    cmp      w8, w9
    b.eq     #0x32d668
    mov      w9, #0x23f6
    movk     w9, #0x22c0, lsl #16
    cmp      w8, w9
    b.ne     #0x32cf28
    b        #0x32da64
    ldrb     w8, [sp, #0x13f]
    cmp      w8, #0
    mov      w8, #0x23f6
    movk     w8, #0x22c0, lsl #16
    mov      w9, #0x17b7
    movk     w9, #0x759f, lsl #16
    b        #0x32d80c
    ldr      x8, [sp, #0x88]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [sp, #0x87]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x5e7e
    movk     w9, #0xcb4f, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    ldr      x8, [sp, #0xd0]
    cmp      x8, #0
    mov      w8, #0x3c01
    movk     w8, #0x8cd7, lsl #16
    csel     w8, w21, w8, eq
    b        #0x32d810
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x160]
    mov      w9, #0x23f6
    movk     w9, #0x22c0, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    ldr      x8, [sp, #0x160]
    mov      w9, #0x2608
    movk     w9, #0x4f7c, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    ldr      x8, [sp, #0xa8]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [sp, #0x86]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x6881
    movk     w9, #0xc0a6, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    ldr      x8, [sp, #0xb8]
    ldr      x8, [x8]
    ldr      x9, [sp, #8]
    ldr      x8, [x8, x9, lsl #3]
    str      x8, [sp, #0xa8]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x6d5c
    movk     w9, #0xda95, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    ldrb     w8, [sp, #0x57]
    cmp      w8, #0
    mov      w8, #0x8641
    movk     w8, #0x5637, lsl #16
    mov      w9, #0x11c4
    movk     w9, #0x38d1, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [sp, #0x160]
    str      w8, [x9]
    ldr      x8, [sp, #0xa8]
    str      x8, [sp, #0x18]
    b        #0x32cf28
    ldr      d0, [sp, #0xf0]
    fcmp     d0, #0.0
    cset     w8, hi
    strb     w8, [sp, #0xef]
    ldr      x0, [sp, #0x100]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x160]
    mov      w9, #0xfd03
    movk     w9, #0x3ce2, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd38]
    str      x1, [sp, #0x130]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x128]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    bl       #0x461c6c // _objc_msgSend
    stp      d2, d1, [sp, #0x118]
    str      d3, [sp, #0x110]
    str      d0, [sp, #0x1d8]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x3565
    movk     w9, #0xfe47, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    ldr      x0, [sp, #0xe0]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp, #0x160]
    mov      w9, #0xc35f
    movk     w9, #0x672f, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    ldr      x8, [sp, #0xc8]
    ldr      x8, [x8]
    ldr      x9, [x8]
    add      x8, sp, #0x170
    add      x8, x8, #8
    stp      x8, x9, [sp, #0xb8]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x727
    movk     w9, #0xb0b4, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd98]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x140]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x3553
    movk     w9, #0x459d, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    ldrb     w8, [sp, #0xa7]
    cmp      w8, #0
    mov      w8, #0x55e5
    movk     w8, #0xd0ac, lsl #16
    mov      w9, #0xe99e
    movk     w9, #0x45a1, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [sp, #0x160]
    str      w8, [x9]
    b        #0x32cf28
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x770]
    str      x1, [sp, #0x78]
    ldr      x0, [sp, #0xa8]
    bl       #0x461c6c // _objc_msgSend
    stp      d1, d0, [sp, #0x68]
    stp      d3, d2, [sp, #0x58]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x79f
    movk     w9, #0x532, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    ldr      x0, [sp, #0xe0]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x160]
    mov      w9, #0xad7
    movk     w9, #0xf7de, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    ldr      x0, [sp, #0x128]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x160]
    mov      w9, #0x8cf
    movk     w9, #0x15ac, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    ldp      d2, d1, [sp, #0x118]
    ldr      d0, [sp, #0x1d8]
    ldr      d3, [sp, #0x110]
    bl       #0x461708 // _CGRectGetWidth
    fcmp     d0, #0.0
    cset     w8, hi
    strb     w8, [sp, #0x10f]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x3af9
    movk     w9, #0x653c, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    add      x8, sp, #0x170
    add      x8, x8, #0x10
    str      x8, [sp, #0xc8]
    ldr      x8, [sp, #0x160]
    mov      w9, #0xf610
    movk     w9, #0xce90, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    ldrb     w8, [sp, #0x87]
    cmp      w8, #0
    mov      w8, #0x245c
    movk     w8, #0x9925, lsl #16
    csel     w8, w21, w8, ne
    ldr      x9, [sp, #0x160]
    str      w8, [x9]
    ldr      x8, [sp, #0x88]
    str      x8, [sp, #0x28]
    b        #0x32cf28
    ldr      x8, [sp, #0x160]
    mov      w9, #0x245c
    movk     w9, #0x9925, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0xd0]
    str      x8, [sp, #0x28]
    b        #0x32cf28
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x198]
    str      x8, [sp, #0x158]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x3929
    movk     w9, #0xa488, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    ldr      x8, [sp, #0x28]
    str      x8, [sp, #0x10]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xcd8]
    str      x8, [sp, #0xb0]
    ldr      x8, [sp, #0x160]
    mov      w9, #0xd3ac
    movk     w9, #0xb1bb, lsl #16
    str      w9, [x8]
    str      xzr, [sp, #0x20]
    b        #0x32cf28
    ldp      x0, x1, [sp, #0xa8]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x150]
    cmp      x0, x8
    cset     w8, eq
    strb     w8, [sp, #0xa7]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x1fe7
    movk     w9, #0xf46c, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xd90]
    str      x8, [sp, #0x148]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x22e
    movk     w9, #0x2ee8, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    ldr      x8, [sp, #0x160]
    mov      w9, #0x8641
    movk     w9, #0x5637, lsl #16
    str      w9, [x8]
    str      xzr, [sp, #0x18]
    b        #0x32cf28
    ldr      x0, [sp, #0xa8]
    ldr      x1, [sp, #0x78]
    bl       #0x461c6c // _objc_msgSend
    stp      d0, d1, [sp, #0x30]
    stp      d2, d3, [sp, #0x40]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x1bac
    movk     w9, #0xf091, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    ldr      x8, [sp, #8]
    add      x8, x8, #1
    str      x8, [sp, #0x98]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x3600
    movk     w9, #0x746b, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    ldp      x1, x0, [sp, #0xd8]
    add      x2, sp, #0x170
    add      x3, sp, #0x1f8
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x88]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x6461
    movk     w9, #0x2773, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    ldr      x8, [sp, #0x150]
    ldr      x9, [sp, #0x140]
    cmp      x8, x9
    cset     w8, eq
    strb     w8, [sp, #0x13f]
    ldr      x8, [sp, #0x160]
    mov      w9, #0x6393
    movk     w9, #0xcd2, lsl #16
    str      w9, [x8]
    b        #0x32cf28
    ldur     x8, [x29, #-0x88]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x32daa4
    add      sp, sp, #0x290
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

// -[WCLGHomeGroupBar traitCollectionDidChange:] IMP=0x32DAA8 bounds=0x32DAA8-0x32DC44
loc_32DAA8:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      x19, x2
    mov      x20, x0
    mov      w22, #0xa1c3
    movk     w22, #0x7d94, lsl #16
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7d8]
    stp      x0, x8, [sp, #0x30]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x398]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    add      x0, sp, #0x30
    mov      x1, x21
    mov      x2, x19
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    mov      w23, #0x1757
    movk     w23, #0xf6c6, lsl #16
    ldr      x8, [x8, #0x3f0]
    str      x8, [sp, #0x28]
    add      x8, sp, #0xc
    mov      w24, #0x5a89
    movk     w24, #0x258e, lsl #16
    mov      w25, #0x3cc
    movk     w25, #0xd0b0, lsl #16
    mov      w26, #0x5a8a
    movk     w26, #0x258e, lsl #16
    str      w23, [sp, #0xc]
    str      x8, [sp]
    mov      w28, #0x91dd
    movk     w28, #0x530, lsl #16
    mov      w27, #0x7969
    movk     w27, #0x2bb8, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w24
    b.gt     #0x32db7c
    cmp      w8, w25
    b.eq     #0x32dba4
    cmp      w8, w23
    b.eq     #0x32dbd8
    cmp      w8, w28
    b.ne     #0x32db4c
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x32db4c
    cmp      w8, w26
    b.eq     #0x32dc04
    cmp      w8, w27
    b.ne     #0x32dc1c
    ldr      x1, [sp, #0x10]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp]
    str      w28, [x8]
    b        #0x32db4c
    ldp      x1, x0, [sp, #0x18]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    cmp      w21, #0
    csel     w8, w26, w22, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x32db4c
    ldr      x1, [sp, #0x28]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x408]
    stp      x8, x0, [sp, #0x18]
    ldr      x8, [sp]
    str      w25, [x8]
    b        #0x32db4c
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xce0]
    str      x8, [sp, #0x10]
    ldr      x8, [sp]
    str      w27, [x8]
    b        #0x32db4c
    cmp      w8, w22
    b.ne     #0x32db4c
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    ret      

// -[WCLGHomeGroupBar delegate] IMP=0x32DC44 bounds=0x32DC44-0x32DCD8
loc_32DC44:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd90]
    str      w8, [sp, #0x1c]
    mov      w20, #0xdc38
    movk     w20, #0x4f28, lsl #16
    str      w20, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w21, #0xf125
    movk     w21, #0x67da, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w20
    b.eq     #0x32dc9c
    cmp      w8, w21
    b.ne     #0x32dc84
    b        #0x32dcb8
    ldrsw    x8, [sp, #0x1c]
    add      x0, x19, x8
    bl       #0x461c60 // _objc_loadWeakRetained
    str      x0, [sp, #0x10]
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x32dc84
    ldr      x0, [sp, #0x10]
    bl       #0x461be8 // _objc_autoreleaseReturnValue
    ldr      x0, [sp, #0x10]
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    ret      

// -[WCLGHomeGroupBar setDelegate:] IMP=0x32DCD8 bounds=0x32DCD8-0x32DD44
loc_32DCD8:
    sub      sp, sp, #0x20
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd90]
    str      w8, [sp, #0x1c]
    mov      w8, #0x41df
    movk     w8, #0x416d, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0xd177
    movk     w9, #0x5e79, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x32dd20
    cmp      w10, w9
    b.ne     #0x32dd08
    b        #0x32dd38
    ldrsw    x10, [sp, #0x1c]
    add      x10, x0, x10
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x32dd08
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    b        #0x461d08 // _objc_storeWeak

// -[WCLGHomeGroupBar pills] IMP=0x32DD44 bounds=0x32DD44-0x32DDAC
loc_32DD44:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd84]
    str      w8, [sp, #0x1c]
    mov      w8, #0xf2f5
    movk     w8, #0xa2b2, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x21a8
    movk     w9, #0x5983, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x32dd88
    cmp      w10, w9
    b.ne     #0x32dd70
    b        #0x32dda0
    ldrsw    x10, [sp, #0x1c]
    ldr      x10, [x0, x10]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x32dd70
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGHomeGroupBar setPills:] IMP=0x32DDAC bounds=0x32DDAC-0x32DE48
loc_32DDAC:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd84]
    str      x8, [sp, #0x18]
    mov      w21, #0x6ea2
    movk     w21, #0x113d, lsl #16
    str      w21, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w22, #0xc2f0
    movk     w22, #0xa06c, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w21
    b.eq     #0x32de08
    cmp      w8, w22
    b.ne     #0x32ddf0
    b        #0x32de28
    ldr      x8, [sp, #0x18]
    add      x8, x20, x8
    str      x8, [sp, #0x10]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x32ddf0
    ldr      x8, [sp, #0x10]
    ldr      x0, [x8]
    str      x19, [x8]
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    b        #0x461c9c // _objc_release

// -[WCLGHomeGroupBar scroll] IMP=0x32DE48 bounds=0x32DE48-0x32DEB4
loc_32DE48:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd8c]
    str      w8, [sp, #0x1c]
    mov      w8, #0x877f
    movk     w8, #0xe5dd, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x5e65
    movk     w9, #0x5674, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x32de8c
    cmp      w10, w9
    b.ne     #0x32de74
    b        #0x32dea4
    ldrsw    x10, [sp, #0x1c]
    add      x10, x0, x10
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x32de74
    ldr      x8, [sp, #0x10]
    ldr      x0, [x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGHomeGroupBar setScroll:] IMP=0x32DEB4 bounds=0x32DEB4-0x32DF58
loc_32DEB4:
    sub      sp, sp, #0x60
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd8c]
    stur     w8, [x29, #-0x24]
    mov      w21, #0x92e7
    movk     w21, #0xc17e, lsl #16
    str      w21, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w22, #0x6f1d
    movk     w22, #0xd09b, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w21
    b.eq     #0x32df10
    cmp      w8, w22
    b.ne     #0x32def8
    b        #0x32df3c
    ldursw   x8, [x29, #-0x24]
    add      x8, x20, x8
    str      x8, [sp, #0x20]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp, #0x20]
    ldr      x8, [x8]
    str      x8, [sp, #0x18]
    ldr      x8, [sp, #8]
    str      w22, [x8]
    b        #0x32def8
    ldp      x0, x8, [sp, #0x18]
    str      x19, [x8]
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    add      sp, sp, #0x60
    b        #0x461c9c // _objc_release

// -[WCLGHomeGroupBar lastScrolledExpandedIndex] IMP=0x32DF58 bounds=0x32DF58-0x32DFC4
loc_32DF58:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd88]
    add      x8, x0, x8
    str      x8, [sp, #0x18]
    mov      w8, #0x2b1a
    movk     w8, #0xc39a, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0xe991
    movk     w9, #0x2820, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x32dfa0
    cmp      w10, w9
    b.ne     #0x32df88
    b        #0x32dfb8
    ldr      x10, [sp, #0x18]
    ldr      x10, [x10]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x32df88
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGHomeGroupBar setLastScrolledExpandedIndex:] IMP=0x32DFC4 bounds=0x32DFC4-0x32E028
loc_32DFC4:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd88]
    add      x8, x0, x8
    str      x8, [sp, #0x18]
    mov      w8, #0x5760
    movk     w8, #0xa2cc, lsl #16
    str      w8, [sp, #0x14]
    add      x9, sp, #0x14
    str      x9, [sp, #8]
    mov      w9, #0x3751
    movk     w9, #0x7eab, lsl #16
    ldr      w10, [sp, #0x14]
    cmp      w10, w8
    b.eq     #0x32e00c
    cmp      w10, w9
    b.ne     #0x32dff4
    b        #0x32e020
    ldr      x10, [sp, #0x18]
    str      x2, [x10]
    ldr      x10, [sp, #8]
    str      w9, [x10]
    b        #0x32dff4
    add      sp, sp, #0x20
    ret      

// -[WCLGHomeGroupBar wclgStructureToken] IMP=0x32E028 bounds=0x32E028-0x32E094
loc_32E028:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd94]
    add      x8, x0, x8
    str      x8, [sp, #0x18]
    mov      w8, #0xe7cb
    movk     w8, #0x24ab, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x4616
    movk     w9, #0x983a, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x32e070
    cmp      w10, w9
    b.ne     #0x32e058
    b        #0x32e088
    ldr      x10, [sp, #0x18]
    ldr      x10, [x10]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x32e058
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGHomeGroupBar setWclgStructureToken:] IMP=0x32E094 bounds=0x32E094-0x32E0F8
loc_32E094:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd94]
    str      w8, [sp, #0x1c]
    mov      w8, #0xd984
    movk     w8, #0xf735, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x7759
    movk     w9, #0x20d3, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x32e0d8
    cmp      w10, w9
    b.ne     #0x32e0c0
    b        #0x32e0ec
    ldrsw    x10, [sp, #0x1c]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x32e0c0
    ldr      x3, [sp, #0x10]
    add      sp, sp, #0x20
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGHomeGroupBar .cxx_destruct] IMP=0x32E0F8 bounds=0x32E0F8-0x32E1BC
loc_32E0F8:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd94]
    add      x8, x0, x8
    str      x8, [sp, #0x18]
    mov      w20, #0x5a6c
    movk     w20, #0xa685, lsl #16
    str      w20, [sp, #0x10]
    add      x8, sp, #0x10
    str      x8, [sp, #8]
    adrp     x21, #0x4c4000
    mov      w22, #0x221b
    movk     w22, #0xd201, lsl #16
    ldr      w8, [sp, #0x10]
    cmp      w8, w20
    b.eq     #0x32e158
    cmp      w8, w22
    b.ne     #0x32e140
    b        #0x32e178
    ldr      x0, [sp, #0x18]
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    ldr      w8, [x21, #0xd8c]
    str      w8, [sp, #0x14]
    ldr      x8, [sp, #8]
    str      w22, [x8]
    b        #0x32e140
    ldrsw    x8, [sp, #0x14]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd84]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd90]
    add      x0, x19, x8
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    b        #0x461c0c // _objc_destroyWeak
