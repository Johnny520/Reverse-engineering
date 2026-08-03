// Exact ARM64 listing for WCLGGroupPill

// +[WCLGGroupPill pillConfigurationExpanded:] IMP=0x324614 bounds=0x324614-0x324B74
loc_324614:
    sub      sp, sp, #0xb0
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      w22, #0x1091
    movk     w22, #0x33a7, lsl #16
    adrp     x8, #0x580000
    add      x8, x8, #0xe24
    ldar     w8, [x8]
    str      w8, [sp, #0x4c]
    mov      w8, #0xf5ec
    movk     w8, #0xa937, lsl #16
    str      w8, [sp, #0xc]
    add      x8, sp, #0xc
    mov      w25, #0x1090
    movk     w25, #0x33a7, lsl #16
    str      x8, [sp]
    mov      w26, #0x3ab
    movk     w26, #0x257, lsl #16
    mov      w20, #0x183a
    movk     w20, #0x21cc, lsl #16
    adrp     x23, #0x549000
    add      x23, x23, #0x2a0
    adrp     x21, #0x549000
    add      x21, x21, #0x2c0
    adrp     x24, #0x549000
    add      x24, x24, #0x2c4
    adrp     x28, #0x549000
    add      x28, x28, #0x2a5
    mov      w19, #0x90fe
    movk     w19, #0x533c, lsl #16
    mov      w27, #0xf822
    movk     w27, #0x7a38, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w25
    b.gt     #0x324700
    cmp      w8, w26
    b.le     #0x324744
    cmp      w8, w20
    b.gt     #0x324838
    mov      w9, #0x3ac
    movk     w9, #0x257, lsl #16
    cmp      w8, w9
    b.eq     #0x324a3c
    mov      w9, #0xa9d0
    movk     w9, #0x1911, lsl #16
    cmp      w8, w9
    b.ne     #0x3246a8
    ldr      x8, [sp]
    mov      w9, #0xfc97
    movk     w9, #0x8d34, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x18]
    str      x8, [sp, #0x10]
    b        #0x3246a8
    cmp      w8, w19
    b.le     #0x3247a4
    cmp      w8, w27
    b.gt     #0x3247f0
    mov      w9, #0x90ff
    movk     w9, #0x533c, lsl #16
    cmp      w8, w9
    b.eq     #0x3249d8
    mov      w9, #0xe35d
    movk     w9, #0x6dde, lsl #16
    cmp      w8, w9
    b.ne     #0x3246a8
    ldr      x8, [sp]
    mov      w9, #0xa9d0
    movk     w9, #0x1911, lsl #16
    str      w9, [x8]
    b        #0x3246a8
    mov      w9, #0xf5eb
    movk     w9, #0xa937, lsl #16
    cmp      w8, w9
    b.le     #0x324994
    mov      w9, #0xf5ec
    movk     w9, #0xa937, lsl #16
    cmp      w8, w9
    b.eq     #0x324ae4
    mov      w9, #0xd71b
    movk     w9, #0xed5d, lsl #16
    cmp      w8, w9
    b.ne     #0x3246a8
    ldrb     w8, [sp, #0x27]
    cmp      w8, #0
    mov      w8, #0xfc97
    movk     w8, #0x8d34, lsl #16
    mov      w9, #0xafa3
    movk     w9, #0x8af0, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp]
    str      w8, [x9]
    ldr      x8, [sp, #0x28]
    str      x8, [sp, #0x10]
    b        #0x3246a8
    cmp      w8, w22
    b.eq     #0x324ab4
    mov      w9, #0xdc74
    movk     w9, #0x4492, lsl #16
    cmp      w8, w9
    b.eq     #0x324b08
    mov      w9, #0x6704
    movk     w9, #0x4788, lsl #16
    cmp      w8, w9
    b.ne     #0x3246a8
    ldr      x8, [sp, #0x28]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [sp, #0x27]
    ldr      x8, [sp]
    mov      w9, #0xd71b
    movk     w9, #0xed5d, lsl #16
    str      w9, [x8]
    b        #0x3246a8
    mov      w9, #0xf823
    movk     w9, #0x7a38, lsl #16
    cmp      w8, w9
    b.eq     #0x324a18
    mov      w9, #0xf51a
    movk     w9, #0x7db1, lsl #16
    cmp      w8, w9
    b.ne     #0x3246a8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    ldr      x0, [sp, #0x40]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x38]
    ldr      x8, [sp]
    mov      w9, #0x90ff
    movk     w9, #0x533c, lsl #16
    str      w9, [x8]
    b        #0x3246a8
    mov      w9, #0x183b
    movk     w9, #0x21cc, lsl #16
    cmp      w8, w9
    b.eq     #0x324a64
    mov      w9, #0x6212
    movk     w9, #0x2f23, lsl #16
    cmp      w8, w9
    b.ne     #0x3246a8
    ldrb     w8, [sp, #0x4a]
    mov      w9, #0xbc
    eor      w8, w8, w9
    strb     w8, [x24]
    ldrb     w8, [x28]
    mov      w9, #0xf6
    eor      w8, w8, w9
    strb     w8, [x24, #1]
    ldrb     w8, [x28, #1]
    mov      w9, #0xd0
    eor      w8, w8, w9
    strb     w8, [x24, #2]
    ldrb     w8, [x28, #2]
    mov      w9, #0xa2
    eor      w8, w8, w9
    strb     w8, [x24, #3]
    ldrb     w8, [x28, #3]
    eor      w8, w8, #0xffffffc1
    strb     w8, [x24, #4]
    ldrb     w8, [x28, #4]
    mov      w9, #0x32
    eor      w8, w8, w9
    strb     w8, [x24, #5]
    ldrb     w8, [x28, #5]
    mov      w9, #0x15
    eor      w8, w8, w9
    strb     w8, [x24, #6]
    ldrb     w8, [x28, #6]
    mov      w9, #0xd6
    eor      w8, w8, w9
    strb     w8, [x24, #7]
    ldrb     w8, [x28, #7]
    eor      w8, w8, #0x7e
    strb     w8, [x24, #8]
    ldrb     w8, [x28, #8]
    mov      w9, #0xb0
    eor      w8, w8, w9
    strb     w8, [x24, #9]
    ldrb     w8, [x28, #9]
    mov      w9, #0x6a
    eor      w8, w8, w9
    strb     w8, [x24, #0xa]
    ldrb     w8, [x28, #0xa]
    mov      w9, #0xe4
    eor      w8, w8, w9
    strb     w8, [x24, #0xb]
    ldrb     w8, [x28, #0xb]
    eor      w8, w8, #0xdddddddd
    strb     w8, [x24, #0xc]
    ldrb     w8, [x28, #0xc]
    eor      w8, w8, #0xfc
    strb     w8, [x24, #0xd]
    ldrb     w8, [x28, #0xd]
    mov      w9, #0x76
    eor      w8, w8, w9
    strb     w8, [x24, #0xe]
    ldrb     w8, [x28, #0xe]
    eor      w8, w8, #0xfffffff3
    strb     w8, [x24, #0xf]
    ldrb     w8, [x28, #0xf]
    mov      w9, #0xec
    eor      w8, w8, w9
    strb     w8, [x24, #0x10]
    ldrb     w8, [x28, #0x10]
    eor      w8, w8, #8
    strb     w8, [x24, #0x11]
    ldrb     w8, [x28, #0x11]
    mov      w9, #0x9a
    eor      w8, w8, w9
    strb     w8, [x24, #0x12]
    ldrb     w8, [x28, #0x12]
    mov      w9, #0x57
    eor      w8, w8, w9
    strb     w8, [x24, #0x13]
    ldr      x8, [sp]
    mov      w9, #0xf823
    movk     w9, #0x7a38, lsl #16
    str      w9, [x8]
    b        #0x3246a8
    mov      w9, #0xafa3
    movk     w9, #0x8af0, lsl #16
    cmp      w8, w9
    b.ne     #0x324b28
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x578]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xa60]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x18]
    ldr      x8, [sp]
    mov      w9, #0xe35d
    movk     w9, #0x6dde, lsl #16
    str      w9, [x8]
    b        #0x3246a8
    adrp     x0, #0x549000
    add      x0, x0, #0x300
    bl       #0x4617a4 // _NSSelectorFromString
    mov      x2, x0
    str      x0, [sp, #0x30]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    ldr      x0, [sp, #0x38]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #0xafa3
    movk     w8, #0x8af0, lsl #16
    mov      w9, #0x3ac
    movk     w9, #0x257, lsl #16
    csel     w8, w9, w8, ne
    b        #0x324b1c
    adrp     x8, #0x549000
    ldrb     w8, [x8, #0x2b8]
    mov      w9, #0x3a
    eor      w8, w8, w9
    adrp     x9, #0x549000
    strb     w8, [x9, #0x2d8]
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x3246a8
    ldp      x1, x0, [sp, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    ldr      x8, [sp]
    mov      w9, #0x6704
    movk     w9, #0x4788, lsl #16
    str      w9, [x8]
    b        #0x3246a8
    ldrb     w8, [x23]
    eor      w8, w8, #0x1c
    strb     w8, [x21]
    ldrb     w8, [x23, #1]
    strb     w8, [x21, #1]
    ldrb     w8, [x23, #2]
    mov      w9, #0xa
    eor      w8, w8, w9
    strb     w8, [x21, #2]
    ldrb     w8, [x23, #3]
    mov      w9, #0xe9
    eor      w8, w8, w9
    strb     w8, [x21, #3]
    ldrb     w8, [x23, #4]
    strb     w8, [sp, #0x4a]
    ldr      x8, [sp]
    mov      w9, #0x6212
    movk     w9, #0x2f23, lsl #16
    str      w9, [x8]
    b        #0x3246a8
    adrp     x8, #0x580000
    add      x8, x8, #0xe24
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x578]
    str      x8, [sp, #0x40]
    ldr      x8, [sp]
    mov      w9, #0xf51a
    movk     w9, #0x7db1, lsl #16
    str      w9, [x8]
    b        #0x3246a8
    ldr      w8, [sp, #0x4c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x4b]
    ldr      x8, [sp]
    mov      w9, #0xdc74
    movk     w9, #0x4492, lsl #16
    str      w9, [x8]
    b        #0x3246a8
    ldrb     w8, [sp, #0x4b]
    cmp      w8, #0
    mov      w8, #0x183b
    movk     w8, #0x21cc, lsl #16
    csel     w8, w8, w22, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x3246a8
    mov      w9, #0xfc97
    movk     w9, #0x8d34, lsl #16
    cmp      w8, w9
    b.ne     #0x3246a8
    ldr      x19, [sp, #0x10]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xa68]
    mov      x0, x19
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    add      sp, sp, #0xb0
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGGroupPill initWithFrame:] IMP=0x324B74 bounds=0x324B74-0x325064
loc_324B74:
    sub      sp, sp, #0x120
    stp      d13, d12, [sp, #0x90]
    stp      d11, d10, [sp, #0xa0]
    stp      d9, d8, [sp, #0xb0]
    stp      x28, x27, [sp, #0xc0]
    stp      x26, x25, [sp, #0xd0]
    stp      x24, x23, [sp, #0xe0]
    stp      x22, x21, [sp, #0xf0]
    stp      x20, x19, [sp, #0x100]
    stp      x29, x30, [sp, #0x110]
    add      x29, sp, #0x110
    fmov     d8, d3
    fmov     d9, d2
    fmov     d10, d1
    fmov     d11, d0
    str      x0, [sp, #8]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    str      x8, [sp, #0x80]
    mov      w19, #0x3fd1
    movk     w19, #0x3255, lsl #16
    mov      w20, #0x9408
    movk     w20, #0x82d3, lsl #16
    str      w20, [sp, #0x4c]
    add      x8, sp, #0x4c
    str      x8, [sp, #0x40]
    mov      w21, #0x63fa
    movk     w21, #0xfd81, lsl #16
    mov      w22, #0x46dd
    movk     w22, #0x96ca, lsl #16
    mov      w23, #0x55ec
    movk     w23, #0x93d4, lsl #16
    adrp     x28, #0x4c4000
    mov      w24, #0x63fb
    movk     w24, #0xfd81, lsl #16
    mov      w25, #0x549
    movk     w25, #0x4e69, lsl #16
    adrp     x8, #0x491000
    ldr      d12, [x8, #0x440]
    ldr      w8, [sp, #0x4c]
    cmp      w8, w21
    b.gt     #0x324c50
    cmp      w8, w20
    b.eq     #0x324c78
    cmp      w8, w23
    b.eq     #0x324cc8
    cmp      w8, w22
    b.ne     #0x324c14
    ldrb     w8, [sp, #0x2f]
    cmp      w8, #0
    csel     w8, w19, w25, ne
    ldr      x9, [sp, #0x40]
    str      w8, [x9]
    b        #0x324c14
    cmp      w8, w24
    b.eq     #0x324d1c
    cmp      w8, w25
    b.ne     #0x325010
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x438]
    str      x8, [sp, #0x20]
    ldr      x8, [sp, #0x40]
    str      w23, [x8]
    b        #0x324c14
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7d0]
    ldr      x9, [sp, #8]
    stp      x9, x8, [sp, #0x50]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    str      x1, [sp, #0x38]
    add      x0, sp, #0x50
    fmov     d0, d11
    fmov     d1, d10
    fmov     d2, d9
    fmov     d3, d8
    bl       #0x461c84 // _objc_msgSendSuper2
    str      x0, [sp, #0x30]
    cmp      x0, #0
    cset     w8, eq
    strb     w8, [sp, #0x2f]
    ldr      x8, [sp, #0x40]
    str      w22, [x8]
    b        #0x324c14
    ldr      x0, [sp, #0x30]
    ldr      x1, [sp, #0x20]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x28, #0x158]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x608]
    ldp      d0, d1, [x8]
    ldp      d2, d3, [x8, #0x10]
    stp      d0, d1, [sp, #0x60]
    stp      d2, d3, [sp, #0x70]
    ldr      x1, [sp, #0x38]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x18]
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd5c]
    str      w8, [sp, #0x14]
    ldr      x8, [sp, #0x40]
    str      w24, [x8]
    b        #0x324c14
    ldrsw    x26, [sp, #0x14]
    ldr      x27, [sp, #0x30]
    ldr      x0, [x27, x26]
    ldr      x8, [sp, #0x18]
    str      x8, [x27, x26]
    bl       #0x461c9c // _objc_release
    bl       #0x323f48
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x27, x26]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x458]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x27, x26]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xea8]
    mov      x1, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x20, [x8, #0x230]
    fmov     d0, #12.50000000
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x0, [x27, x26]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xec8]
    mov      x1, x22
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x27, x26]
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x1f8]
    mov      x1, x23
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x27, x26]
    ldr      x1, [sp, #0x20]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x27, x26]
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x440]
    mov      x1, x24
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x27, x26]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x9b0]
    mov      x1, x25
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x27, x26]
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0xb40]
    ldr      x0, [sp, #0x30]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x28, #0x158]
    bl       #0x461ba0 // _objc_alloc
    ldr      x1, [sp, #0x38]
    ldp      d0, d1, [sp, #0x60]
    ldp      d2, d3, [sp, #0x70]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x19, [x8, #0xd60]
    ldr      x28, [sp, #0x30]
    ldr      x8, [x28, x19]
    str      x0, [x28, x19]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc18]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    ldr      x0, [x28, x19]
    mov      x1, x21
    mov      w21, #0x63fa
    movk     w21, #0xfd81, lsl #16
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x378]
    ldr      d1, [x8]
    fmov     d0, #14.00000000
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x28, x19]
    mov      x1, x22
    mov      w22, #0x46dd
    movk     w22, #0x96ca, lsl #16
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x28, x19]
    mov      x1, x23
    mov      w23, #0x55ec
    movk     w23, #0x93d4, lsl #16
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x28, x19]
    mov      x1, x24
    mov      w24, #0x63fb
    movk     w24, #0xfd81, lsl #16
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x28, x19]
    mov      x1, x25
    mov      w25, #0x549
    movk     w25, #0x4e69, lsl #16
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x28, x19]
    adrp     x28, #0x4c4000
    mov      w19, #0x3fd1
    movk     w19, #0x3255, lsl #16
    ldr      x0, [sp, #0x30]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x3, [x8, #0xc18]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    ldr      x0, [sp, #0x30]
    mov      x2, x0
    mov      w4, #0x40
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x400]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x3, [x8, #0x300]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x440]
    ldr      x2, [sp, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x308]
    fmov     d0, d12
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x450]
    ldr      x0, [sp, #0x30]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      w20, #0x9408
    movk     w20, #0x82d3, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x40]
    str      w19, [x8]
    b        #0x324c14
    cmp      w8, w19
    b.ne     #0x324c14
    ldr      x0, [sp, #0x30]
    ldr      x8, [sp, #0x80]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x325060
    ldp      x29, x30, [sp, #0x110]
    ldp      x20, x19, [sp, #0x100]
    ldp      x22, x21, [sp, #0xf0]
    ldp      x24, x23, [sp, #0xe0]
    ldp      x26, x25, [sp, #0xd0]
    ldp      x28, x27, [sp, #0xc0]
    ldp      d9, d8, [sp, #0xb0]
    ldp      d11, d10, [sp, #0xa0]
    ldp      d13, d12, [sp, #0x90]
    add      sp, sp, #0x120
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGGroupPill applyBadgeText] IMP=0x325064 bounds=0x325064-0x325654
loc_325064:
    sub      sp, sp, #0x110
    stp      x28, x27, [sp, #0xb0]
    stp      x26, x25, [sp, #0xc0]
    stp      x24, x23, [sp, #0xd0]
    stp      x22, x21, [sp, #0xe0]
    stp      x20, x19, [sp, #0xf0]
    stp      x29, x30, [sp, #0x100]
    add      x29, sp, #0x100
    mov      x19, x0
    adrp     x8, #0x580000
    add      x8, x8, #0xe2c
    ldar     w8, [x8]
    stur     w8, [x29, #-0x5c]
    mov      w8, #0xbb44
    movk     w8, #0x1c78, lsl #16
    str      w8, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w26, #0x2a7
    movk     w26, #0xfdf0, lsl #16
    mov      w27, #0x3062
    movk     w27, #0xe1aa, lsl #16
    mov      w28, #0xf636
    movk     w28, #0xc9b4, lsl #16
    mov      w23, #0xf637
    movk     w23, #0xc9b4, lsl #16
    mov      w21, #0x8d27
    movk     w21, #0xf790, lsl #16
    mov      w24, #0x62c6
    movk     w24, #0x4adf, lsl #16
    mov      w22, #0xbb43
    movk     w22, #0x1c78, lsl #16
    mov      w25, #0xe4c4
    movk     w25, #0x675e, lsl #16
    mov      w20, #0xe4c3
    movk     w20, #0x675e, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w26
    b.gt     #0x325168
    cmp      w8, w27
    b.gt     #0x32524c
    cmp      w8, w28
    b.le     #0x3252a0
    cmp      w8, w23
    b.eq     #0x3255b0
    mov      w9, #0x6e3a
    movk     w9, #0xce7c, lsl #16
    cmp      w8, w9
    b.eq     #0x325428
    mov      w9, #0x46e6
    movk     w9, #0xd09e, lsl #16
    cmp      w8, w9
    b.ne     #0x3250f4
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0xb8]
    str      x8, [sp, #0x78]
    ldur     x1, [x29, #-0x68]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x70]
    ldr      x8, [sp, #8]
    mov      w9, #0xe61e
    movk     w9, #0x379a, lsl #16
    str      w9, [x8]
    b        #0x3250f4
    cmp      w8, w24
    b.gt     #0x3251cc
    cmp      w8, w22
    b.le     #0x3252e8
    mov      w9, #0xbb44
    movk     w9, #0x1c78, lsl #16
    cmp      w8, w9
    b.eq     #0x325488
    mov      w9, #0xe61e
    movk     w9, #0x379a, lsl #16
    cmp      w8, w9
    b.eq     #0x3253bc
    mov      w9, #0x94c2
    movk     w9, #0x464f, lsl #16
    cmp      w8, w9
    b.ne     #0x3250f4
    ldrsw    x8, [sp, #0x54]
    str      x8, [sp, #0x48]
    add      x8, x19, x8
    str      x8, [sp, #0x40]
    ldr      x8, [sp, #8]
    mov      w9, #0x3063
    movk     w9, #0xe1aa, lsl #16
    str      w9, [x8]
    b        #0x3250f4
    cmp      w8, w20
    b.le     #0x32533c
    cmp      w8, w25
    b.eq     #0x3254ac
    mov      w9, #0xa3c4
    movk     w9, #0x6a57, lsl #16
    cmp      w8, w9
    b.eq     #0x3253d4
    mov      w9, #0x1e51
    movk     w9, #0x700e, lsl #16
    cmp      w8, w9
    b.ne     #0x3250f4
    ldp      x2, x8, [sp, #0x30]
    str      x8, [sp, #0x18]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd5c]
    add      x9, x19, x8
    stp      x9, x8, [sp, #0x58]
    ldr      x0, [x19, x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    bl       #0x461c6c // _objc_msgSend
    ldurb    w8, [x29, #-0x79]
    cmp      w8, #0
    mov      w8, #0xe01f
    movk     w8, #0x809e, lsl #16
    mov      w9, #0x6e3a
    movk     w9, #0xce7c, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x325420
    cmp      w8, w21
    b.le     #0x325380
    mov      w9, #0x8d28
    movk     w9, #0xf790, lsl #16
    cmp      w8, w9
    b.eq     #0x325500
    mov      w9, #0x246c
    movk     w9, #0xfd90, lsl #16
    cmp      w8, w9
    b.eq     #0x325410
    mov      w9, #0x8efd
    movk     w9, #0xfdd8, lsl #16
    cmp      w8, w9
    b.ne     #0x3250f4
    ldurb    w8, [x29, #-0x69]
    cmp      w8, #0
    mov      w8, #0x8a27
    movk     w8, #0x56ff, lsl #16
    mov      w9, #0x2a8
    movk     w9, #0xfdf0, lsl #16
    b        #0x3252d8
    mov      w9, #0x1514
    movk     w9, #0x9212, lsl #16
    cmp      w8, w9
    b.eq     #0x325534
    mov      w9, #0x49a
    movk     w9, #0xbbf5, lsl #16
    cmp      w8, w9
    b.ne     #0x3255e4
    ldurb    w8, [x29, #-0x5d]
    cmp      w8, #0
    mov      w8, #0x960a
    movk     w8, #0xe880, lsl #16
    mov      w9, #0x8d28
    movk     w9, #0xf790, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x3250f4
    mov      w9, #0x2a8
    movk     w9, #0xfdf0, lsl #16
    cmp      w8, w9
    b.eq     #0x325444
    mov      w9, #0xe01e
    movk     w9, #0x1308, lsl #16
    cmp      w8, w9
    b.ne     #0x3250f4
    ldurb    w8, [x29, #-0x79]
    cmp      w8, #0
    mov      w8, #0x1e51
    movk     w8, #0x700e, lsl #16
    mov      w9, #0x46e6
    movk     w9, #0xd09e, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    adrp     x8, #0x549000
    add      x8, x8, #0x350
    str      x8, [sp, #0x30]
    b        #0x3250f4
    mov      w9, #0x62c7
    movk     w9, #0x4adf, lsl #16
    cmp      w8, w9
    b.eq     #0x325464
    mov      w9, #0x8a27
    movk     w9, #0x56ff, lsl #16
    cmp      w8, w9
    b.ne     #0x3250f4
    ldur     x1, [x29, #-0x68]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0x78]
    ldr      x8, [sp, #8]
    mov      w9, #0x62c7
    movk     w9, #0x4adf, lsl #16
    str      w9, [x8]
    b        #0x3250f4
    mov      w9, #0x3063
    movk     w9, #0xe1aa, lsl #16
    cmp      w8, w9
    b.eq     #0x3254e4
    mov      w9, #0x960a
    movk     w9, #0xe880, lsl #16
    cmp      w8, w9
    b.ne     #0x3250f4
    adrp     x8, #0x580000
    add      x8, x8, #0xe2c
    mov      w9, #1
    stlr     w9, [x8]
    ldr      x8, [sp, #8]
    str      w23, [x8]
    b        #0x3250f4
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x620]
    str      x8, [sp, #0x68]
    ldr      x8, [sp, #8]
    str      w25, [x8]
    b        #0x3250f4
    adrp     x9, #0x549000
    add      x9, x9, #0x322
    ldrb     w8, [x9]
    eor      w8, w8, #0xffffff8f
    adrp     x10, #0x549000
    add      x10, x10, #0x326
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    eor      w8, w8, #0x1f
    strb     w8, [x10, #1]
    ldr      x8, [sp, #8]
    mov      w9, #0x960a
    movk     w9, #0xe880, lsl #16
    str      w9, [x8]
    b        #0x3250f4
    ldr      x8, [sp, #8]
    mov      w9, #0xe01f
    movk     w9, #0x809e, lsl #16
    str      w9, [x8]
    ldp      x9, x8, [sp, #0x58]
    b        #0x3254f8
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0x246c
    movk     w9, #0xfd90, lsl #16
    str      w9, [x8]
    b        #0x3250f4
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd5c]
    str      w8, [sp, #0x54]
    ldr      x8, [sp, #8]
    mov      w9, #0x94c2
    movk     w9, #0x464f, lsl #16
    str      w9, [x8]
    b        #0x3250f4
    ldur     x8, [x29, #-0x78]
    cmp      x8, #0x64
    cset     w8, lt
    sturb    w8, [x29, #-0x79]
    ldr      x8, [sp, #8]
    mov      w9, #0xe01e
    movk     w9, #0x1308, lsl #16
    str      w9, [x8]
    b        #0x3250f4
    ldur     w8, [x29, #-0x5c]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x5d]
    ldr      x8, [sp, #8]
    mov      w9, #0x49a
    movk     w9, #0xbbf5, lsl #16
    str      w9, [x8]
    b        #0x3250f4
    ldp      x8, x0, [sp, #0x70]
    ldr      x1, [sp, #0x68]
    str      x8, [sp]
    adrp     x2, #0x549000
    add      x2, x2, #0x390
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldr      x8, [sp, #8]
    mov      w9, #0x1e51
    movk     w9, #0x700e, lsl #16
    str      w9, [x8]
    stp      x0, x0, [sp, #0x30]
    b        #0x3250f4
    ldr      x8, [sp, #8]
    mov      w9, #0xe01f
    movk     w9, #0x809e, lsl #16
    str      w9, [x8]
    ldp      x9, x8, [sp, #0x40]
    stp      x8, x9, [sp, #0x20]
    b        #0x3250f4
    adrp     x9, #0x549000
    add      x9, x9, #0x328
    ldrb     w8, [x9]
    eor      w8, w8, #0xfffffff7
    adrp     x10, #0x549000
    strb     w8, [x10, #0x32c]
    ldrb     w8, [x9, #1]
    sturb    w8, [x29, #-0x5e]
    ldr      x8, [sp, #8]
    mov      w9, #0x1514
    movk     w9, #0x9212, lsl #16
    str      w9, [x8]
    b        #0x3250f4
    ldurb    w8, [x29, #-0x5e]
    eor      w8, w8, #3
    adrp     x9, #0x549000
    add      x9, x9, #0x32d
    strb     w8, [x9]
    adrp     x10, #0x549000
    add      x10, x10, #0x32a
    ldrb     w8, [x10]
    mov      w11, #0xd2
    eor      w8, w8, w11
    strb     w8, [x9, #1]
    ldrb     w8, [x10, #1]
    mov      w10, #0x5a
    eor      w8, w8, w10
    strb     w8, [x9, #2]
    adrp     x9, #0x549000
    add      x9, x9, #0x320
    ldrb     w8, [x9]
    eor      w8, w8, #0x30
    adrp     x10, #0x549000
    add      x10, x10, #0x324
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w9, #0x92
    eor      w8, w8, w9
    strb     w8, [x10, #1]
    ldr      x8, [sp, #8]
    mov      w9, #0xa3c4
    movk     w9, #0x6a57, lsl #16
    str      w9, [x8]
    b        #0x3250f4
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc20]
    stur     x1, [x29, #-0x68]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    cset     w8, lt
    sturb    w8, [x29, #-0x69]
    ldr      x8, [sp, #8]
    mov      w9, #0x8efd
    movk     w9, #0xfdd8, lsl #16
    str      w9, [x8]
    b        #0x3250f4
    mov      w9, #0xe01f
    movk     w9, #0x809e, lsl #16
    cmp      w8, w9
    b.ne     #0x3250f4
    ldp      x21, x8, [sp, #0x20]
    ldr      x0, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    ldurb    w2, [x29, #-0x69]
    bl       #0x461c6c // _objc_msgSend
    bl       #0x323f48
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x19, x21]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    ldp      x29, x30, [sp, #0x100]
    ldp      x20, x19, [sp, #0xf0]
    ldp      x22, x21, [sp, #0xe0]
    ldp      x24, x23, [sp, #0xd0]
    ldp      x26, x25, [sp, #0xc0]
    ldp      x28, x27, [sp, #0xb0]
    add      sp, sp, #0x110
    b        #0x461c9c // _objc_release

// -[WCLGGroupPill applyMemberText] IMP=0x325654 bounds=0x325654-0x325A78
loc_325654:
    sub      sp, sp, #0xd0
    stp      x28, x27, [sp, #0x70]
    stp      x26, x25, [sp, #0x80]
    stp      x24, x23, [sp, #0x90]
    stp      x22, x21, [sp, #0xa0]
    stp      x20, x19, [sp, #0xb0]
    stp      x29, x30, [sp, #0xc0]
    add      x29, sp, #0xc0
    mov      x19, x0
    mov      w21, #0x6cb7
    movk     w21, #0x7ab0, lsl #16
    adrp     x8, #0x580000
    add      x8, x8, #0xe30
    mov      w24, #0xa149
    movk     w24, #0x5d94, lsl #16
    ldar     w8, [x8]
    stur     w8, [x29, #-0x54]
    mov      w8, #0x2aab
    movk     w8, #0x1090, lsl #16
    str      w8, [sp, #0x1c]
    add      x8, sp, #0x1c
    mov      w26, #0x3367
    movk     w26, #0x422e, lsl #16
    str      x8, [sp, #0x10]
    mov      w27, #0x17cd
    movk     w27, #0xda78, lsl #16
    mov      w28, #0x1e43
    movk     w28, #0x9761, lsl #16
    mov      w23, #0x2aaa
    movk     w23, #0x1090, lsl #16
    mov      w22, #0xa148
    movk     w22, #0x5d94, lsl #16
    mov      w25, #0x474e
    movk     w25, #0x5946, lsl #16
    mov      w20, #0xa8ab
    movk     w20, #0x7740, lsl #16
    ldr      w8, [sp, #0x1c]
    cmp      w8, w26
    b.le     #0x325758
    cmp      w8, w22
    b.gt     #0x32579c
    cmp      w8, w25
    b.gt     #0x3258b4
    mov      w9, #0x3368
    movk     w9, #0x422e, lsl #16
    cmp      w8, w9
    b.eq     #0x3259ac
    mov      w9, #0x7b53
    movk     w9, #0x583c, lsl #16
    cmp      w8, w9
    b.ne     #0x3256e4
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0xb8]
    str      x8, [sp, #0x50]
    ldr      x1, [sp, #0x60]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x620]
    stp      x8, x0, [sp, #0x40]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x3316
    movk     w9, #0x5c17, lsl #16
    str      w9, [x8]
    b        #0x3256e4
    cmp      w8, w27
    b.le     #0x3257f0
    cmp      w8, w23
    b.gt     #0x325844
    mov      w9, #0x17ce
    movk     w9, #0xda78, lsl #16
    cmp      w8, w9
    b.eq     #0x325970
    mov      w9, #0x137b
    movk     w9, #0xa57, lsl #16
    cmp      w8, w9
    b.ne     #0x3256e4
    ldr      x8, [sp, #0x10]
    str      w21, [x8]
    ldr      x8, [sp, #0x38]
    str      x8, [sp, #0x20]
    b        #0x3256e4
    cmp      w8, w20
    b.gt     #0x325940
    cmp      w8, w24
    b.eq     #0x325a00
    mov      w9, #0x2ebc
    movk     w9, #0x5e6e, lsl #16
    cmp      w8, w9
    b.ne     #0x3256e4
    ldurb    w8, [x29, #-0x56]
    adrp     x9, #0x549000
    add      x9, x9, #0x3b6
    strb     w8, [x9]
    adrp     x8, #0x549000
    ldrb     w8, [x8, #0x3b3]
    eor      w8, w8, #0xffffffc3
    strb     w8, [x9, #1]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x4a93
    movk     w9, #0xb8fa, lsl #16
    str      w9, [x8]
    b        #0x3256e4
    cmp      w8, w28
    b.eq     #0x3259e0
    mov      w9, #0x4a93
    movk     w9, #0xb8fa, lsl #16
    cmp      w8, w9
    b.eq     #0x325a30
    mov      w9, #0xef9
    movk     w9, #0xceb0, lsl #16
    cmp      w8, w9
    b.ne     #0x3256e4
    ldr      x1, [sp, #0x60]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    cset     w8, lt
    strb     w8, [sp, #0x5f]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x17ce
    movk     w9, #0xda78, lsl #16
    str      w9, [x8]
    b        #0x3256e4
    mov      w9, #0x2aab
    movk     w9, #0x1090, lsl #16
    cmp      w8, w9
    b.eq     #0x325990
    mov      w9, #0xd535
    movk     w9, #0x24cb, lsl #16
    cmp      w8, w9
    b.ne     #0x3256e4
    adrp     x9, #0x549000
    add      x9, x9, #0x3b0
    ldrb     w8, [x9]
    mov      w10, #0x5b
    eor      w8, w8, w10
    adrp     x10, #0x549000
    add      x10, x10, #0x3b4
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mvn      w8, w8
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w9, #0xa7
    eor      w8, w8, w9
    sturb    w8, [x29, #-0x56]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x2ebc
    movk     w9, #0x5e6e, lsl #16
    str      w9, [x8]
    b        #0x3256e4
    mov      w9, #0x474f
    movk     w9, #0x5946, lsl #16
    cmp      w8, w9
    b.eq     #0x3259cc
    mov      w9, #0x3316
    movk     w9, #0x5c17, lsl #16
    cmp      w8, w9
    b.ne     #0x3256e4
    ldp      x8, x0, [sp, #0x48]
    ldr      x1, [sp, #0x40]
    str      x8, [sp]
    adrp     x2, #0x549000
    add      x2, x2, #0x3e0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd60]
    add      x9, x19, x8
    str      x9, [sp, #0x38]
    ldr      x0, [x19, x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      w21, #0x6cb7
    movk     w21, #0x7ab0, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    mov      w9, #0x137b
    movk     w9, #0xa57, lsl #16
    str      w9, [x8]
    b        #0x3256e4
    mov      w9, #0xa8ac
    movk     w9, #0x7740, lsl #16
    cmp      w8, w9
    b.ne     #0x325a3c
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd60]
    str      x8, [sp, #0x30]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x3368
    movk     w9, #0x422e, lsl #16
    str      w9, [x8]
    b        #0x3256e4
    ldrb     w8, [sp, #0x5f]
    cmp      w8, #0
    mov      w8, #0x7b53
    movk     w8, #0x583c, lsl #16
    mov      w9, #0xa8ac
    movk     w9, #0x7740, lsl #16
    csel     w8, w9, w8, ne
    b        #0x3259f4
    ldur     w8, [x29, #-0x54]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x55]
    ldr      x8, [sp, #0x10]
    str      w28, [x8]
    b        #0x3256e4
    ldr      x8, [sp, #0x30]
    add      x8, x19, x8
    str      x8, [sp, #0x28]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x474f
    movk     w9, #0x5946, lsl #16
    str      w9, [x8]
    b        #0x3256e4
    ldr      x8, [sp, #0x10]
    str      w21, [x8]
    ldr      x8, [sp, #0x28]
    str      x8, [sp, #0x20]
    b        #0x3256e4
    ldurb    w8, [x29, #-0x55]
    cmp      w8, #0
    mov      w8, #0xd535
    movk     w8, #0x24cb, lsl #16
    csel     w8, w8, w24, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x3256e4
    adrp     x8, #0x580000
    add      x8, x8, #0xe30
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xc28]
    str      x8, [sp, #0x60]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xef9
    movk     w9, #0xceb0, lsl #16
    str      w9, [x8]
    b        #0x3256e4
    ldr      x8, [sp, #0x10]
    str      w24, [x8]
    b        #0x3256e4
    cmp      w8, w21
    b.ne     #0x3256e4
    ldr      x8, [sp, #0x20]
    ldr      x0, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    ldrb     w2, [sp, #0x5f]
    ldp      x29, x30, [sp, #0xc0]
    ldp      x20, x19, [sp, #0xb0]
    ldp      x22, x21, [sp, #0xa0]
    ldp      x24, x23, [sp, #0x90]
    ldp      x26, x25, [sp, #0x80]
    ldp      x28, x27, [sp, #0x70]
    add      sp, sp, #0xd0
    b        #0x461c6c // _objc_msgSend

// -[WCLGGroupPill applyVisualStateExpanded:newButton:title:] IMP=0x325A78 bounds=0x325A78-0x327500
loc_325A78:
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
    sub      sp, sp, #0x270
    mov      x19, sp
    mov      x28, x4
    mov      x22, x3
    mov      x21, x2
    mov      x27, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0xa0]
    mov      w23, #0xe69
    movk     w23, #0xc1f3, lsl #16
    adrp     x8, #0x580000
    add      x8, x8, #0xe34
    ldar     w8, [x8]
    str      w8, [x19, #0x1fc]
    mov      w8, #0xc659
    movk     w8, #0xf898, lsl #16
    str      w8, [x19, #0x20]
    add      x8, x19, #0x20
    str      x8, [x19, #0x18]
    mov      w20, #0xaccf
    movk     w20, #0xf8e0, lsl #16
    mov      w26, #0x922b
    movk     w26, #0xcb43, lsl #16
    mov      w25, #0x1022
    movk     w25, #0xa755, lsl #16
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x4e8]
    fmov     d9, #8.00000000
    fmov     d10, #4.00000000
    fmov     d11, #6.00000000
    fmov     d12, #12.00000000
    fmov     d13, #14.00000000
    fmov     d14, #18.00000000
    mov      w24, #0x55ab
    movk     w24, #0xdfd8, lsl #16
    str      x0, [x19, #0x10]
    ldr      w8, [x19, #0x20]
    cmp      w8, w20
    b.le     #0x325bdc
    mov      w9, #0xdf03
    movk     w9, #0x4462, lsl #16
    cmp      w8, w9
    b.gt     #0x325c5c
    mov      w9, #0x95a6
    movk     w9, #0x1df0, lsl #16
    cmp      w8, w9
    b.gt     #0x325d80
    mov      w9, #0x85e
    movk     w9, #0x85b, lsl #16
    cmp      w8, w9
    b.gt     #0x325f88
    mov      w9, #0x4fbf
    movk     w9, #0xff1e, lsl #16
    cmp      w8, w9
    b.le     #0x326438
    mov      w9, #0x4fc0
    movk     w9, #0xff1e, lsl #16
    cmp      w8, w9
    b.eq     #0x326c20
    mov      w9, #0x9b0c
    movk     w9, #0xffd9, lsl #16
    cmp      w8, w9
    b.eq     #0x326f68
    mov      w9, #0x83d2
    movk     w9, #0x129, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldr      x0, [x19, #0x198]
    ldr      x1, [x19, #0x170]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #0x18]
    mov      w9, #0x445c
    movk     w9, #0xeb0a, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    cmp      w8, w26
    b.le     #0x325cd0
    cmp      w8, w24
    b.gt     #0x325de0
    mov      w9, #0x63c4
    movk     w9, #0xd46a, lsl #16
    cmp      w8, w9
    b.gt     #0x32618c
    mov      w9, #0x9d94
    movk     w9, #0xd135, lsl #16
    cmp      w8, w9
    b.le     #0x326920
    mov      w9, #0x9d95
    movk     w9, #0xd135, lsl #16
    cmp      w8, w9
    b.eq     #0x32700c
    mov      w9, #0x783b
    movk     w9, #0xd308, lsl #16
    cmp      w8, w9
    b.eq     #0x327200
    mov      w9, #0xee21
    movk     w9, #0xd3f0, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xed0]
    str      x8, [x19, #0xf0]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x39dc
    movk     w9, #0x962d, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0xaf92
    movk     w9, #0x6090, lsl #16
    cmp      w8, w9
    b.gt     #0x325e70
    mov      w9, #0xfd98
    movk     w9, #0x4ccc, lsl #16
    cmp      w8, w9
    b.gt     #0x32609c
    mov      w9, #0x86a5
    movk     w9, #0x4612, lsl #16
    cmp      w8, w9
    b.le     #0x32669c
    mov      w9, #0x86a6
    movk     w9, #0x4612, lsl #16
    cmp      w8, w9
    b.eq     #0x326e28
    mov      w9, #0xdac1
    movk     w9, #0x4699, lsl #16
    cmp      w8, w9
    b.eq     #0x3271a8
    mov      w9, #0x687d
    movk     w9, #0x4c7c, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldr      x8, [x19, #0x18]
    mov      w9, #0xfd99
    movk     w9, #0x4ccc, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    cmp      w8, w25
    b.le     #0x325ef0
    mov      w9, #0xb7a1
    movk     w9, #0xbbe4, lsl #16
    cmp      w8, w9
    b.gt     #0x32603c
    mov      w9, #0x30ad
    movk     w9, #0xaf8d, lsl #16
    cmp      w8, w9
    b.le     #0x326578
    mov      w9, #0x30ae
    movk     w9, #0xaf8d, lsl #16
    cmp      w8, w9
    b.eq     #0x326d88
    mov      w9, #0x8d90
    movk     w9, #0xb369, lsl #16
    cmp      w8, w9
    b.eq     #0x327160
    mov      w9, #0x4f06
    movk     w9, #0xb9fb, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    adrp     x8, #0x580000
    add      x8, x8, #0xe34
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x10
    mov      sp, x8
    str      x8, [x19, #0x1f0]
    sub      x8, sp, #0x10
    mov      sp, x8
    str      x8, [x19, #0x1e8]
    mov      x0, x28
    bl       #0x461ca8 // _objc_retain
    cmp      x28, #0
    adrp     x8, #0x4a6000
    add      x8, x8, #0xd8
    csel     x8, x8, x28, eq
    str      x8, [x19, #0x1e0]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xa275
    movk     w9, #0xe77f, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0xbc24
    movk     w9, #0x2ea4, lsl #16
    cmp      w8, w9
    b.gt     #0x325fe4
    mov      w9, #0x8817
    movk     w9, #0x216d, lsl #16
    cmp      w8, w9
    b.le     #0x326488
    mov      w9, #0x8818
    movk     w9, #0x216d, lsl #16
    cmp      w8, w9
    b.eq     #0x327400
    mov      w9, #0xba77
    movk     w9, #0x2234, lsl #16
    cmp      w8, w9
    b.eq     #0x326f84
    mov      w9, #0x2342
    movk     w9, #0x2a9e, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldp      x1, x0, [x19, #0x190]
    ldp      d2, d3, [x29, #-0xd0]
    ldp      d0, d1, [x29, #-0xe0]
    b        #0x3271f0
    mov      w9, #0x445b
    movk     w9, #0xeb0a, lsl #16
    cmp      w8, w9
    b.gt     #0x326280
    mov      w9, #0x7798
    movk     w9, #0xe7d6, lsl #16
    cmp      w8, w9
    b.le     #0x3269c8
    mov      w9, #0x7799
    movk     w9, #0xe7d6, lsl #16
    cmp      w8, w9
    b.eq     #0x32706c
    mov      w9, #0x2f86
    movk     w9, #0xe985, lsl #16
    cmp      w8, w9
    b.eq     #0x32722c
    mov      w9, #0x33c3
    movk     w9, #0xe987, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldrb     w8, [x19, #0x77]
    strb     w8, [x19, #0x37]
    ldr      x0, [x19, #0x1c8]
    bl       #0x461c9c // _objc_release
    mov      w0, #2
    mov      w1, #0xf
    mov      w2, #0
    mov      w3, #0
    bl       #0x45e7d8
    cmp      w0, #0
    mov      w8, #0x1023
    movk     w8, #0xa755, lsl #16
    mov      w9, #0x55ac
    movk     w9, #0xdfd8, lsl #16
    csel     w8, w8, w9, eq
    b        #0x3270b8
    mov      w9, #0xf68c
    movk     w9, #0x6a8c, lsl #16
    cmp      w8, w9
    b.le     #0x3262e4
    mov      w9, #0xf4e9
    movk     w9, #0x7913, lsl #16
    cmp      w8, w9
    b.le     #0x326b5c
    mov      w9, #0xf4ea
    movk     w9, #0x7913, lsl #16
    cmp      w8, w9
    b.eq     #0x327434
    mov      w9, #0x43c
    movk     w9, #0x7aaf, lsl #16
    cmp      w8, w9
    b.eq     #0x32747c
    mov      w9, #0x1455
    movk     w9, #0x7ffc, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldur     d0, [x29, #-0xb0]
    sub      x8, x29, #0xe0
    ldr      q1, [x8, #0x20]
    str      q1, [x8]
    stur     d0, [x29, #-0xd0]
    mov      x8, #0x402c000000000000
    stur     x8, [x29, #-0xc8]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x2342
    movk     w9, #0x2a9e, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0x6f03
    movk     w9, #0x9844, lsl #16
    cmp      w8, w9
    b.le     #0x326350
    mov      w9, #0xb943
    movk     w9, #0x9d5c, lsl #16
    cmp      w8, w9
    b.le     #0x3263e8
    mov      w9, #0xb944
    movk     w9, #0x9d5c, lsl #16
    cmp      w8, w9
    b.eq     #0x326c04
    mov      w9, #0x7b0d
    movk     w9, #0xa2f1, lsl #16
    cmp      w8, w9
    b.eq     #0x326ed4
    mov      w9, #0xf5cb
    movk     w9, #0xa595, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldp      x1, x0, [x19, #0x150]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x148]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xdf0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x140]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x85f
    movk     w9, #0x85b, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0x30d4
    movk     w9, #0xe75, lsl #16
    cmp      w8, w9
    b.le     #0x3264c4
    mov      w9, #0x30d5
    movk     w9, #0xe75, lsl #16
    cmp      w8, w9
    b.eq     #0x326c38
    mov      w9, #0x9650
    movk     w9, #0x10c6, lsl #16
    cmp      w8, w9
    b.eq     #0x326fac
    mov      w9, #0xc220
    movk     w9, #0x1583, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldr      x0, [x19, #0x1e0]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x18]
    mov      w9, #0x63c5
    movk     w9, #0xd46a, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0x8328
    movk     w9, #0x3522, lsl #16
    cmp      w8, w9
    b.le     #0x326504
    mov      w9, #0x8329
    movk     w9, #0x3522, lsl #16
    cmp      w8, w9
    b.eq     #0x326c68
    mov      w9, #0xb1ef
    movk     w9, #0x3681, lsl #16
    cmp      w8, w9
    b.eq     #0x326fcc
    mov      w9, #0xd40c
    movk     w9, #0x37cb, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    cmp      w22, #0
    mov      w8, #0x33ae
    movk     w8, #0x951b, lsl #16
    mov      w9, #0xdac1
    movk     w9, #0x4699, lsl #16
    b        #0x327004
    mov      w9, #0x8570
    movk     w9, #0xc047, lsl #16
    cmp      w8, w9
    b.le     #0x3265b4
    mov      w9, #0x8571
    movk     w9, #0xc047, lsl #16
    cmp      w8, w9
    b.eq     #0x326db8
    cmp      w8, w23
    b.eq     #0x32717c
    mov      w9, #0xdf48
    movk     w9, #0xc3fa, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldr      x2, [x19, #0x1e0]
    ldr      x1, [x19, #0x108]
    mov      x0, x27
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #0x18]
    mov      w9, #0x4fc0
    movk     w9, #0xff1e, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0x8c27
    movk     w9, #0x563d, lsl #16
    cmp      w8, w9
    b.le     #0x326710
    mov      w9, #0x8c28
    movk     w9, #0x563d, lsl #16
    cmp      w8, w9
    b.eq     #0x326e48
    mov      w9, #0xbfa4
    movk     w9, #0x590d, lsl #16
    cmp      w8, w9
    b.eq     #0x3271e0
    mov      w9, #0x7b0b
    movk     w9, #0x6066, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldr      x8, [x19, #0x38]
    adrp     x25, #0x4c4000
    ldr      x0, [x25, #0x90]
    ldr      x1, [x8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc40]
    mov      x0, x27
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x90]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xed8]
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x0, x27
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    mov      w25, #0x1022
    movk     w25, #0xa755, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      w24, #0x55ab
    movk     w24, #0xdfd8, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x110]
    b        #0x326908
    mov      w9, #0xb238
    movk     w9, #0xd7b4, lsl #16
    cmp      w8, w9
    b.le     #0x326a10
    mov      w9, #0xb239
    movk     w9, #0xd7b4, lsl #16
    cmp      w8, w9
    b.eq     #0x32708c
    mov      w9, #0xe6b7
    movk     w9, #0xdb7c, lsl #16
    cmp      w8, w9
    b.eq     #0x3273e0
    mov      w9, #0x887b
    movk     w9, #0xdcd3, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldr      d0, [x19, #0x68]
    str      d0, [x19, #0x28]
    ldrb     w8, [x19, #0x76]
    strb     w8, [x19, #0x27]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x198]
    ldr      x1, [x19, #0x1d0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x1, [x19, #0x1c0]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [x19, #0x1a6]
    eor      w23, w22, #1
    and      w8, w0, w23
    strb     w8, [x19, #0x1a5]
    mov      x0, x24
    mov      w24, #0x55ab
    movk     w24, #0xdfd8, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc40]
    and      w2, w23, w21
    mov      w23, #0xe69
    movk     w23, #0xc1f3, lsl #16
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x198]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc48]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    ldrb     w8, [x19, #0x1a5]
    cmp      w8, #0
    mov      w8, #0x40e5
    movk     w8, #0x8f20, lsl #16
    mov      w9, #0xc30d
    movk     w9, #0xd61a, lsl #16
    b        #0x327004
    mov      w9, #0x6afa
    movk     w9, #0xee39, lsl #16
    cmp      w8, w9
    b.le     #0x326a68
    mov      w9, #0x6afb
    movk     w9, #0xee39, lsl #16
    cmp      w8, w9
    b.eq     #0x3270c4
    mov      w9, #0x1e2e
    movk     w9, #0xf010, lsl #16
    cmp      w8, w9
    b.eq     #0x327414
    mov      w9, #0xc659
    movk     w9, #0xf898, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldr      w8, [x19, #0x1fc]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [x19, #0x1fb]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x9b0c
    movk     w9, #0xffd9, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0xc6c0
    movk     w9, #0x6455, lsl #16
    cmp      w8, w9
    b.le     #0x326544
    mov      w9, #0xdd6a
    movk     w9, #0x64e3, lsl #16
    cmp      w8, w9
    b.eq     #0x326be0
    mov      w9, #0xad95
    movk     w9, #0x6838, lsl #16
    cmp      w8, w9
    b.ne     #0x3274a4
    ldp      x0, x2, [x19, #0xc0]
    ldr      x1, [x19, #0xb8]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, #0xc0]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0xc8]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0xd0]
    bl       #0x461c9c // _objc_release
    cmp      w22, #0
    mov      w8, #0x5c15
    movk     w8, #0xf938, lsl #16
    mov      w9, #0xdb5c
    movk     w9, #0xdda, lsl #16
    b        #0x3270b4
    mov      w9, #0x33ad
    movk     w9, #0x951b, lsl #16
    cmp      w8, w9
    b.gt     #0x3263a0
    mov      w9, #0xf054
    movk     w9, #0x8c82, lsl #16
    cmp      w8, w9
    b.eq     #0x326ba4
    mov      w9, #0x40e5
    movk     w9, #0x8f20, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xa70]
    str      x8, [x19, #0x188]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x8571
    movk     w9, #0xc047, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0x33ae
    movk     w9, #0x951b, lsl #16
    cmp      w8, w9
    b.eq     #0x326bc4
    mov      w9, #0x39dc
    movk     w9, #0x962d, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldr      x2, [x19, #0x110]
    ldr      x1, [x19, #0xf0]
    mov      x0, x27
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #0x18]
    mov      w9, #0x8818
    movk     w9, #0x216d, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0x6f04
    movk     w9, #0x9844, lsl #16
    cmp      w8, w9
    b.eq     #0x326c88
    mov      w9, #0x15f6
    movk     w9, #0x9b61, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    ldr      x1, [x19, #0x128]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x118]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xf68d
    movk     w9, #0x6a8c, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0xacd0
    movk     w9, #0xf8e0, lsl #16
    cmp      w8, w9
    b.eq     #0x326ca8
    mov      w9, #0x5c15
    movk     w9, #0xf938, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    cmp      w21, #0
    adrp     x8, #0x549000
    add      x8, x8, #0x4a0
    adrp     x9, #0x549000
    add      x9, x9, #0x4e0
    csel     x8, x9, x8, ne
    str      x8, [x19, #0x98]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xef48
    movk     w9, #0xbe1c, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0x95a7
    movk     w9, #0x1df0, lsl #16
    cmp      w8, w9
    b.eq     #0x326ce4
    mov      w9, #0xbbbe
    movk     w9, #0x1ecb, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldr      x8, [x19, #0x18]
    mov      w9, #0x33c3
    movk     w9, #0xe987, lsl #16
    str      w9, [x8]
    ldrb     w8, [x19, #0x1be]
    strb     w8, [x19, #0x77]
    b        #0x325b3c
    mov      w9, #0x85f
    movk     w9, #0x85b, lsl #16
    cmp      w8, w9
    b.eq     #0x326d18
    mov      w9, #0xdb5c
    movk     w9, #0xdda, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x198]
    str      x8, [x19, #0xb0]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x783b
    movk     w9, #0xd308, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0xbc25
    movk     w9, #0x2ea4, lsl #16
    cmp      w8, w9
    b.eq     #0x326d34
    mov      w9, #0x5b2d
    movk     w9, #0x34b4, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xc50]
    str      x8, [x19, #0x178]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xb239
    movk     w9, #0xd7b4, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0xaf93
    movk     w9, #0x6090, lsl #16
    cmp      w8, w9
    b.eq     #0x326d64
    mov      w9, #0xd8af
    movk     w9, #0x60e8, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldr      x8, [x19, #0x18]
    mov      w9, #0xd40c
    movk     w9, #0x37cb, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0x1023
    movk     w9, #0xa755, lsl #16
    cmp      w8, w9
    b.eq     #0x326de0
    mov      w9, #0x3f5d
    movk     w9, #0xab40, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldrb     w8, [x19, #0x37]
    cmp      w8, #0
    mov      w8, #0x7799
    movk     w8, #0xe7d6, lsl #16
    mov      w9, #0xee21
    movk     w9, #0xd3f0, lsl #16
    b        #0x327004
    mov      w9, #0xb7a2
    movk     w9, #0xbbe4, lsl #16
    cmp      w8, w9
    b.eq     #0x326e0c
    mov      w9, #0xef48
    movk     w9, #0xbe1c, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldr      x8, [x19, #0x98]
    cmp      w22, #0
    adrp     x9, #0x549000
    add      x9, x9, #0x460
    csel     x24, x9, x8, ne
    adrp     x8, #0x4c4000
    ldr      x25, [x8, #0x210]
    adrp     x8, #0x4bf000
    ldr      x26, [x8, #0x1c8]
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    fmov     d0, #13.00000000
    mov      x0, x25
    mov      w25, #0x1022
    movk     w25, #0xa755, lsl #16
    mov      x1, x26
    mov      w26, #0x922b
    movk     w26, #0xcb43, lsl #16
    mov      w2, #6
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x3, x0
    str      x0, [x19, #0x90]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x80]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1d0]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x88]
    mov      x0, x24
    mov      w24, #0x55ab
    movk     w24, #0xdfd8, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x88]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xef0]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x80]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x9d95
    movk     w9, #0xd135, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0xdf04
    movk     w9, #0x4462, lsl #16
    cmp      w8, w9
    b.eq     #0x326e68
    mov      w9, #0x1f1
    movk     w9, #0x44ba, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xcd8]
    str      x1, [x19, #0x1d0]
    ldr      x0, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc30]
    stp      x1, x0, [x19, #0x1c0]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [x19, #0x18]
    mov      w9, #0x33c3
    movk     w9, #0xe987, lsl #16
    mov      w10, #0xb944
    movk     w10, #0x9d5c, lsl #16
    csel     w9, w10, w9, ne
    str      w9, [x8]
    strb     wzr, [x19, #0x77]
    b        #0x325b3c
    mov      w9, #0xfd99
    movk     w9, #0x4ccc, lsl #16
    cmp      w8, w9
    b.eq     #0x326ea0
    mov      w9, #0xc12c
    movk     w9, #0x4ddc, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldr      x24, [x19, #0x40]
    ldrb     w8, [x19, #0x4f]
    str      w8, [x19, #0xc]
    ldr      x25, [x19, #0x50]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc58]
    ldr      x0, [x19, #0x198]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xf0]
    bl       #0x461ba0 // _objc_alloc
    mov      x26, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x308]
    ldr      x8, [x8]
    ldr      x9, [x19, #0x1e8]
    str      x8, [x9]
    adrp     x8, #0x4c4000
    ldr      x27, [x8, #0x218]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x198]
    ldr      x1, [x19, #0x1d0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc60]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    ldp      x3, x2, [x19, #0x1e8]
    str      x0, [x2]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x310]
    ldr      x8, [x8]
    str      x8, [x3, #8]
    str      x24, [x2, #8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    mov      w4, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x21
    mov      x21, x22
    mov      x22, x28
    mov      x28, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xd68]
    ldr      x2, [x19, #0x1e0]
    mov      x0, x26
    mov      x3, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc68]
    ldr      x0, [x19, #0x198]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      w26, #0x922b
    movk     w26, #0xcb43, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    mov      x28, x22
    mov      x22, x21
    mov      x21, x23
    mov      w23, #0xe69
    movk     w23, #0xc1f3, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    ldr      x27, [x19, #0x10]
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      w25, #0x1022
    movk     w25, #0xa755, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc70]
    ldr      x0, [x19, #0x198]
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x760]
    ldr      x2, [x19, #0x198]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    ldrb     w8, [x19, #0x1a5]
    ldr      w9, [x19, #0xc]
    orr      w8, w9, w8
    tst      w8, #1
    mov      w8, #4
    csel     x2, xzr, x8, ne
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1a0]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    mov      w24, #0x55ab
    movk     w24, #0xdfd8, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x160]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x198]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x18]
    mov      w9, #0xc220
    movk     w9, #0x1583, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0x922c
    movk     w9, #0xcb43, lsl #16
    cmp      w8, w9
    b.eq     #0x3270f4
    mov      w9, #0x13e
    movk     w9, #0xcdf3, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x198]
    ldr      x1, [x19, #0x1d0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0xd0]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc60]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    ldr      x0, [x19, #0xd8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0xc8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xee0]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xec8]
    stp      x8, x0, [x19, #0xb8]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xad95
    movk     w9, #0x6838, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0x55ac
    movk     w9, #0xdfd8, lsl #16
    cmp      w8, w9
    b.eq     #0x327114
    mov      w9, #0xa275
    movk     w9, #0xe77f, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldr      x0, [x19, #0x1e0]
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x198]
    str      x8, [x19, #0x1d8]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x1f1
    movk     w9, #0x44ba, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0x63c5
    movk     w9, #0xd46a, lsl #16
    cmp      w8, w9
    b.eq     #0x327144
    mov      w9, #0xc30d
    movk     w9, #0xd61a, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldrb     w8, [x19, #0x27]
    cmp      w8, #0
    fcsel    d0, d13, d12, ne
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xa70]
    str      x8, [x19, #0x190]
    stur     xzr, [x29, #-0xc0]
    stur     xzr, [x29, #-0xb0]
    stur     d0, [x29, #-0xb8]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x1455
    movk     w9, #0x7ffc, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0x445c
    movk     w9, #0xeb0a, lsl #16
    cmp      w8, w9
    b.eq     #0x326b48
    mov      w9, #0xf2d6
    movk     w9, #0xedd4, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldr      x24, [x19, #0x58]
    ldr      d0, [x19, #0x60]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x210]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1c8]
    mov      w2, #6
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x80]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1d0]
    mov      x2, x24
    mov      x3, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xef0]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    ldr      x0, [x19, #0x198]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    ldr      x27, [x19, #0x10]
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      w26, #0x922b
    movk     w26, #0xcb43, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      w25, #0x1022
    movk     w25, #0xa755, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      w24, #0x55ab
    movk     w24, #0xdfd8, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x18]
    mov      w9, #0xaf93
    movk     w9, #0x6090, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0xf68d
    movk     w9, #0x6a8c, lsl #16
    cmp      w8, w9
    b.eq     #0x327454
    mov      w9, #0x1b9b
    movk     w9, #0x75ee, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldr      x0, [x19, #0x160]
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x90]
    str      x8, [x19, #0x138]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x1e2e
    movk     w9, #0xf010, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x218]
    str      x8, [x19, #0xd8]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x13e
    movk     w9, #0xcdf3, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    ldrb     w8, [x19, #0x37]
    cmp      w8, #0
    mov      w8, #0x43c
    movk     w8, #0x7aaf, lsl #16
    mov      w9, #0x1b9b
    movk     w9, #0x75ee, lsl #16
    b        #0x327004
    adrp     x8, #0x549000
    ldrb     w8, [x8, #0x426]
    eor      w8, w8, #0xf
    strb     w8, [x19, #0x1fa]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x7b0d
    movk     w9, #0xa2f1, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    eor      w8, w22, #1
    strb     w8, [x19, #0x1bf]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x8c28
    movk     w9, #0x563d, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    cmp      w22, #0
    mov      w8, #0x3f5d
    movk     w8, #0xab40, lsl #16
    mov      w9, #0x9650
    movk     w9, #0x10c6, lsl #16
    b        #0x327004
    cmp      w21, #0
    adrp     x8, #0x549000
    add      x8, x8, #0x4a0
    adrp     x9, #0x549000
    add      x9, x9, #0x4e0
    csel     x8, x9, x8, ne
    str      x8, [x19, #0x168]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x8d90
    movk     w9, #0xb369, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x198]
    str      x8, [x19, #0x1b0]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xacd0
    movk     w9, #0xf8e0, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    ldr      x8, [x19, #0x18]
    mov      w9, #0xf2d6
    movk     w9, #0xedd4, lsl #16
    str      w9, [x8]
    ldr      x8, [x19, #0x168]
    mov      x9, #0x4029000000000000
    stp      x8, x9, [x19, #0x58]
    b        #0x325b3c
    ldr      x1, [x19, #0x1d0]
    ldr      x0, [x19, #0x1b0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x1a8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc38]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [x19, #0x1a7]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xdf04
    movk     w9, #0x4462, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    cmp      w22, #0
    ldr      x8, [x19, #0x18]
    mov      w9, #0xf2d6
    movk     w9, #0xedd4, lsl #16
    mov      w10, #0x30d5
    movk     w10, #0xe75, lsl #16
    csel     w9, w9, w10, ne
    str      w9, [x8]
    mov      x9, #0x402e000000000000
    adrp     x8, #0x549000
    add      x8, x8, #0x460
    stp      x8, x9, [x19, #0x58]
    b        #0x325b3c
    ldr      x8, [x19, #0x18]
    mov      w9, #0xc12c
    movk     w9, #0x4ddc, lsl #16
    str      w9, [x8]
    ldp      x9, x8, [x19, #0x140]
    str      x9, [x19, #0x50]
    b        #0x3270ec
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x820]
    ldr      x0, [x19, #0xe8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0xe0]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x86a6
    movk     w9, #0x4612, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    bl       #0x327500
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x160]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xd8af
    movk     w9, #0x60e8, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x2f8]
    ldr      x0, [x19, #0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0xf8]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xe6b7
    movk     w9, #0xdb7c, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    ldr      d0, [x19, #0x28]
    mov      x8, #0x4032000000000000
    stp      xzr, x8, [x29, #-0x100]
    stur     xzr, [x29, #-0xf0]
    stur     d0, [x29, #-0xe8]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xbfa4
    movk     w9, #0x590d, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    bl       #0x327500
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0x2a0]
    stp      x8, x0, [x19, #0x108]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xdf48
    movk     w9, #0xc3fa, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    ldr      x8, [x19, #0x18]
    mov      w9, #0x7b0b
    movk     w9, #0x6066, lsl #16
    str      w9, [x8]
    ldr      x8, [x19, #0x78]
    str      x8, [x19, #0x38]
    b        #0x325b3c
    ldr      x2, [x19, #0xe0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xed0]
    mov      x0, x27
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, #0xe0]
    b        #0x3273fc
    ldrb     w8, [x19, #0x1bf]
    and      w8, w8, w21
    strb     w8, [x19, #0x1be]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xbbbe
    movk     w9, #0x1ecb, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    ldr      x0, [x19, #0x1a8]
    bl       #0x461c9c // _objc_release
    ldrb     w8, [x19, #0x1a7]
    cmp      w8, #0
    mov      x9, #0x404b000000000000
    fmov     d0, x9
    fcsel    d0, d14, d0, ne
    ldr      x9, [x19, #0x18]
    mov      w10, #0x887b
    movk     w10, #0xdcd3, lsl #16
    str      w10, [x9]
    strb     w8, [x19, #0x76]
    str      d0, [x19, #0x68]
    b        #0x325b3c
    ldrb     w8, [x19, #0x37]
    cmp      w8, #0
    adrp     x8, #0x4c0000
    add      x8, x8, #0x820
    adrp     x9, #0x4c0000
    add      x9, x9, #0xdf0
    csel     x8, x8, x9, ne
    str      x8, [x19, #0x78]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xb7a2
    movk     w9, #0xbbe4, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    ldrb     w8, [x19, #0x1fa]
    adrp     x9, #0x549000
    add      x9, x9, #0x433
    strb     w8, [x9]
    adrp     x10, #0x549000
    add      x10, x10, #0x427
    ldrb     w8, [x10]
    mov      w11, #0x25
    eor      w8, w8, w11
    strb     w8, [x9, #1]
    ldrb     w8, [x10, #1]
    eor      w8, w8, #0x78
    strb     w8, [x9, #2]
    ldrb     w8, [x10, #2]
    mov      w11, #0x5a
    eor      w8, w8, w11
    strb     w8, [x9, #3]
    ldrb     w8, [x10, #3]
    eor      w8, w8, #0x7f
    strb     w8, [x9, #4]
    ldrb     w8, [x10, #4]
    mov      w11, #0xc5
    eor      w8, w8, w11
    strb     w8, [x9, #5]
    ldrb     w8, [x10, #5]
    mov      w11, #0x46
    eor      w8, w8, w11
    strb     w8, [x9, #6]
    ldrb     w8, [x10, #6]
    mov      w10, #0x58
    eor      w8, w8, w10
    strb     w8, [x9, #7]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x2f86
    movk     w9, #0xe985, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    ldrb     w8, [x19, #0x1fb]
    cmp      w8, #0
    mov      w8, #0x4f06
    movk     w8, #0xb9fb, lsl #16
    mov      w9, #0xdd6a
    movk     w9, #0x64e3, lsl #16
    b        #0x327004
    ldr      x1, [x19, #0xa0]
    mov      x0, x27
    mov      x2, #0
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #0x18]
    mov      w9, #0x687d
    movk     w9, #0x4c7c, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x90]
    str      x8, [x19, #0xe8]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xbc25
    movk     w9, #0x2ea4, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc38]
    ldr      x0, [x19, #0xa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    ldr      x0, [x19, #0xa8]
    bl       #0x461c9c // _objc_release
    cmp      w24, #0
    mov      w24, #0x55ab
    movk     w24, #0xdfd8, lsl #16
    mov      w8, #0x5c15
    movk     w8, #0xf938, lsl #16
    mov      w9, #0xf4ea
    movk     w9, #0x7913, lsl #16
    csel     w8, w9, w8, ne
    b        #0x3270b8
    ldr      x2, [x19, #0x80]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xee8]
    mov      x0, x27
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, #0x80]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x88]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x90]
    bl       #0x461c9c // _objc_release
    cmp      w22, #0
    ldr      x8, [x19, #0x18]
    mov      w9, #0x7b0b
    movk     w9, #0x6066, lsl #16
    mov      w10, #0xfd99
    movk     w10, #0x4ccc, lsl #16
    csel     w9, w9, w10, ne
    str      w9, [x8]
    adrp     x8, #0x4c0000
    add      x8, x8, #0x820
    str      x8, [x19, #0x38]
    b        #0x325b3c
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x90]
    str      x8, [x19, #0x100]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x30ae
    movk     w9, #0xaf8d, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    ldr      x0, [x19, #0x198]
    ldr      d0, [x19, #0x180]
    ldr      x1, [x19, #0x178]
    bl       #0x461c6c // _objc_msgSend
    ldrb     w8, [x19, #0x27]
    cmp      w8, #0
    mov      w8, #0x922c
    movk     w8, #0xcb43, lsl #16
    mov      w9, #0x95a7
    movk     w9, #0x1df0, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [x19, #0x18]
    str      w8, [x9]
    b        #0x325b3c
    ldp      x1, x0, [x19, #0x130]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldr      x8, [x19, #0x18]
    mov      w9, #0xc12c
    movk     w9, #0x4ddc, lsl #16
    str      w9, [x8]
    ldr      x8, [x19, #0x160]
    str      x0, [x19, #0x50]
    ldrb     w9, [x19, #0x27]
    b        #0x327470
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x8e0]
    str      x8, [x19, #0x170]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x83d2
    movk     w9, #0x129, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    cmp      w22, #0
    ldr      x8, [x19, #0x18]
    mov      w9, #0x887b
    movk     w9, #0xdcd3, lsl #16
    mov      w10, #0x8329
    movk     w10, #0x3522, lsl #16
    csel     w9, w9, w10, ne
    str      w9, [x8]
    strb     wzr, [x19, #0x76]
    mov      x8, #0x4032000000000000
    str      x8, [x19, #0x68]
    b        #0x325b3c
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x18]
    mov      w9, #0xc6c1
    movk     w9, #0x6455, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    ldr      x0, [x19, #0x168]
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [x19, #0x18]
    mov      w9, #0x6f04
    movk     w9, #0x9844, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    ldrb     w8, [x19, #0x1a6]
    cmp      w8, #0
    fcsel    d0, d10, d9, ne
    cmp      w22, #0
    fcsel    d0, d11, d0, ne
    str      d0, [x19, #0x180]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x5b2d
    movk     w9, #0x34b4, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x820]
    str      x1, [x19, #0x128]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x120]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x15f6
    movk     w9, #0x9b61, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    ldr      x0, [x19, #0x198]
    ldr      x1, [x19, #0x188]
    ldp      d2, d3, [x29, #-0xf0]
    ldp      d0, d1, [x29, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #0x18]
    str      w23, [x8]
    b        #0x325b3c
    ldr      x1, [x19, #0x1d0]
    ldr      x0, [x19, #0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0xa8]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xb1ef
    movk     w9, #0x3681, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    adrp     x9, #0x549000
    add      x9, x9, #0x42e
    ldrb     w8, [x9]
    mov      w10, #0xdb
    eor      w8, w8, w10
    adrp     x10, #0x549000
    add      x10, x10, #0x43b
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w11, #0x6a
    eor      w8, w8, w11
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    eor      w8, w8, #2
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    mov      w11, #0xe5
    eor      w8, w8, w11
    strb     w8, [x10, #3]
    ldrb     w8, [x9, #4]
    mov      w9, #0x37
    eor      w8, w8, w9
    strb     w8, [x10, #4]
    adrp     x9, #0x549000
    add      x9, x9, #0x41c
    ldrb     w8, [x9]
    mov      w10, #0x21
    eor      w8, w8, w10
    adrp     x10, #0x549000
    add      x10, x10, #0x421
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w11, #0x95
    eor      w8, w8, w11
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w11, #0x23
    eor      w8, w8, w11
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    mov      w11, #0x50
    eor      w8, w8, w11
    strb     w8, [x10, #3]
    ldrb     w8, [x9, #4]
    mov      w9, #0x26
    eor      w8, w8, w9
    strb     w8, [x10, #4]
    adrp     x9, #0x549000
    add      x9, x9, #0x400
    ldrb     w8, [x9]
    eor      w8, w8, #0x99999999
    adrp     x10, #0x549000
    add      x10, x10, #0x40e
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w11, #0x14
    eor      w8, w8, w11
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w11, #0xe4
    eor      w8, w8, w11
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    mov      w11, #0xac
    eor      w8, w8, w11
    strb     w8, [x10, #3]
    ldrb     w8, [x9, #4]
    mov      w11, #0xa2
    eor      w8, w8, w11
    strb     w8, [x10, #4]
    ldrb     w8, [x9, #5]
    mov      w11, #0x39
    eor      w8, w8, w11
    strb     w8, [x10, #5]
    ldrb     w8, [x9, #6]
    mov      w11, #0xe8
    eor      w8, w8, w11
    strb     w8, [x10, #6]
    ldrb     w8, [x9, #7]
    mov      w11, #0xa0
    eor      w8, w8, w11
    strb     w8, [x10, #7]
    ldrb     w8, [x9, #8]
    eor      w8, w8, #0x78
    strb     w8, [x10, #8]
    ldrb     w8, [x9, #9]
    mov      w11, #0x31
    eor      w8, w8, w11
    strb     w8, [x10, #9]
    ldrb     w8, [x9, #0xa]
    mov      w11, #0xba
    eor      w8, w8, w11
    strb     w8, [x10, #0xa]
    ldrb     w8, [x9, #0xb]
    mov      w11, #0x3b
    eor      w8, w8, w11
    strb     w8, [x10, #0xb]
    ldrb     w8, [x9, #0xc]
    eor      w8, w8, #3
    strb     w8, [x10, #0xc]
    ldrb     w8, [x9, #0xd]
    mov      w9, #0xd8
    eor      w8, w8, w9
    strb     w8, [x10, #0xd]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x4f06
    movk     w9, #0xb9fb, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xed0]
    ldr      x2, [x19, #0xf8]
    mov      x0, x27
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, #0xf8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x18]
    mov      w9, #0xf054
    movk     w9, #0x8c82, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0x820]
    str      x8, [x19, #0x130]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x6afb
    movk     w9, #0xee39, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xee8]
    str      x8, [x19, #0xa0]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xba77
    movk     w9, #0x2234, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    ldr      x8, [x19, #0x18]
    mov      w9, #0xc12c
    movk     w9, #0x4ddc, lsl #16
    str      w9, [x8]
    ldp      x9, x8, [x19, #0x118]
    str      x9, [x19, #0x50]
    mov      w9, #1
    strb     w9, [x19, #0x4f]
    str      x8, [x19, #0x40]
    b        #0x325b3c
    adrp     x8, #0x4c4000
    ldr      x9, [x8, #0x90]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0x2f8]
    stp      x8, x9, [x19, #0x150]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xf5cb
    movk     w9, #0xa595, lsl #16
    str      w9, [x8]
    b        #0x325b3c
    mov      w9, #0xc6c1
    movk     w9, #0x6455, lsl #16
    cmp      w8, w9
    b.ne     #0x325b3c
    ldur     x8, [x29, #-0xa0]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x3274fc
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

// -[WCLGGroupPill setPillExpanded:] IMP=0x3277B4 bounds=0x3277B4-0x3279F4
loc_3277B4:
    sub      sp, sp, #0xc0
    stp      x28, x27, [sp, #0x60]
    stp      x26, x25, [sp, #0x70]
    stp      x24, x23, [sp, #0x80]
    stp      x22, x21, [sp, #0x90]
    stp      x20, x19, [sp, #0xa0]
    stp      x29, x30, [sp, #0xb0]
    add      x29, sp, #0xb0
    mov      x20, x0
    mov      w21, #0x178a
    movk     w21, #0x4c24, lsl #16
    str      w2, [sp, #4]
    sturb    w2, [x29, #-0x51]
    mov      w8, #0x7826
    movk     w8, #0x6370, lsl #16
    str      w8, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w24, #0x1789
    movk     w24, #0x4c24, lsl #16
    mov      w25, #0xceee
    movk     w25, #0xfb4, lsl #16
    mov      w26, #0xc385
    movk     w26, #0xcf28, lsl #16
    mov      w27, #0xb3a8
    movk     w27, #0xd1d3, lsl #16
    mov      w28, #0x78d2
    movk     w28, #0x3e41, lsl #16
    mov      w23, #0x7825
    movk     w23, #0x6370, lsl #16
    mov      w19, #0x6bd6
    movk     w19, #0x7980, lsl #16
    mov      w22, #0xb6cb
    movk     w22, #0x5fbc, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w24
    b.le     #0x327870
    cmp      w8, w23
    b.gt     #0x3278a8
    cmp      w8, w21
    b.eq     #0x327950
    cmp      w8, w22
    b.ne     #0x32783c
    ldrb     w8, [sp, #0x4f]
    cmp      w8, #0
    csel     w8, w26, w21, ne
    b        #0x32789c
    cmp      w8, w25
    b.gt     #0x3278fc
    cmp      w8, w26
    b.eq     #0x327934
    cmp      w8, w27
    b.ne     #0x32783c
    ldrb     w8, [sp, #0x3f]
    cmp      w8, #0
    mov      w8, #0xceef
    movk     w8, #0xfb4, lsl #16
    csel     w8, w21, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x32783c
    cmp      w8, w19
    b.eq     #0x327984
    mov      w9, #0x7826
    movk     w9, #0x6370, lsl #16
    cmp      w8, w9
    b.ne     #0x32783c
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd64]
    add      x8, x20, x8
    str      x8, [sp, #0x50]
    ldrb     w8, [x8]
    ldurb    w9, [x29, #-0x51]
    cmp      w8, w9
    cset     w8, eq
    strb     w8, [sp, #0x4f]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xc80]
    str      x8, [sp, #0x40]
    ldr      x8, [sp, #8]
    str      w22, [x8]
    b        #0x32783c
    cmp      w8, w28
    b.ne     #0x3279c4
    ldrb     w3, [sp, #0x3e]
    ldp      x1, x4, [sp, #0x18]
    mov      x0, x20
    ldr      w2, [sp, #4]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0xceef
    movk     w9, #0xfb4, lsl #16
    str      w9, [x8]
    b        #0x32783c
    ldr      x1, [sp, #0x40]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x3f]
    ldr      x8, [sp, #8]
    str      w27, [x8]
    b        #0x32783c
    ldurb    w8, [x29, #-0x51]
    ldr      x9, [sp, #0x50]
    strb     w8, [x9]
    ldr      x1, [sp, #0x40]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x3e]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xc88]
    str      x8, [sp, #0x30]
    ldr      x8, [sp, #8]
    str      w19, [x8]
    b        #0x32783c
    ldr      x1, [sp, #0x30]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cmp      x0, #0
    adrp     x8, #0x4a6000
    add      x8, x8, #0xd8
    csel     x8, x8, x0, eq
    stp      x8, x0, [sp, #0x20]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xc90]
    str      x8, [sp, #0x18]
    ldr      x8, [sp, #8]
    str      w28, [x8]
    b        #0x32783c
    mov      w9, #0xceef
    movk     w9, #0xfb4, lsl #16
    cmp      w8, w9
    b.ne     #0x32783c
    ldp      x29, x30, [sp, #0xb0]
    ldp      x20, x19, [sp, #0xa0]
    ldp      x22, x21, [sp, #0x90]
    ldp      x24, x23, [sp, #0x80]
    ldp      x26, x25, [sp, #0x70]
    ldp      x28, x27, [sp, #0x60]
    add      sp, sp, #0xc0
    ret      

// -[WCLGGroupPill configureWithTitle:memberCount:badgeCount:expanded:newButton:textColor:] IMP=0x3279F4 bounds=0x3279F4-0x327F40
loc_3279F4:
    sub      sp, sp, #0xf0
    stp      x28, x27, [sp, #0x90]
    stp      x26, x25, [sp, #0xa0]
    stp      x24, x23, [sp, #0xb0]
    stp      x22, x21, [sp, #0xc0]
    stp      x20, x19, [sp, #0xd0]
    stp      x29, x30, [sp, #0xe0]
    add      x29, sp, #0xe0
    mov      x19, x6
    mov      x20, x5
    stp      x3, x4, [sp, #0x10]
    mov      x21, x2
    mov      x24, x0
    mov      w25, #0x1a2
    movk     w25, #0xcbaa, lsl #16
    mov      w28, #0xad4d
    movk     w28, #0xb0b0, lsl #16
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4a6000
    add      x8, x8, #0xd8
    cmp      x21, #0
    str      x21, [sp, #8]
    csel     x8, x8, x21, eq
    stur     x8, [x29, #-0x58]
    mov      w8, #0x2353
    movk     w8, #0xb455, lsl #16
    str      w8, [sp, #0x28]
    add      x8, sp, #0x28
    str      x8, [sp, #0x20]
    mov      w21, #0xe8a6
    movk     w21, #0xf921, lsl #16
    mov      w22, #0x1a1
    movk     w22, #0xcbaa, lsl #16
    mov      w26, #0x35b8
    movk     w26, #0x304c, lsl #16
    mov      w23, #0x786
    movk     w23, #0x4b69, lsl #16
    mov      w27, #0x787
    movk     w27, #0x4b69, lsl #16
    ldr      w8, [sp, #0x28]
    cmp      w8, w21
    b.le     #0x327b00
    cmp      w8, w26
    b.le     #0x327b60
    cmp      w8, w23
    b.le     #0x327cf4
    cmp      w8, w27
    b.eq     #0x327e3c
    mov      w9, #0x401
    movk     w9, #0x4e14, lsl #16
    cmp      w8, w9
    b.eq     #0x327ed4
    mov      w9, #0x28ab
    movk     w9, #0x53d6, lsl #16
    cmp      w8, w9
    b.ne     #0x327a94
    ldp      x1, x4, [sp, #0x38]
    mov      x0, x24
    mov      x2, x20
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x40]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x20]
    str      w25, [x8]
    b        #0x327a94
    cmp      w8, w22
    b.gt     #0x327bbc
    mov      w9, #0xc62d
    movk     w9, #0xb438, lsl #16
    cmp      w8, w9
    b.gt     #0x327ca0
    mov      w9, #0xed42
    movk     w9, #0xa237, lsl #16
    cmp      w8, w9
    b.eq     #0x327dd8
    cmp      w8, w28
    b.ne     #0x327f10
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc88]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x40]
    ldr      x8, [sp, #0x20]
    mov      w9, #0xc62e
    movk     w9, #0xb438, lsl #16
    str      w9, [x8]
    b        #0x327a94
    mov      w9, #0x2535
    movk     w9, #0x2052, lsl #16
    cmp      w8, w9
    b.gt     #0x327c20
    mov      w9, #0xe8a7
    movk     w9, #0xf921, lsl #16
    cmp      w8, w9
    b.eq     #0x327dfc
    mov      w9, #0xc203
    movk     w9, #0x6f7, lsl #16
    cmp      w8, w9
    b.ne     #0x327a94
    ldrb     w8, [sp, #0x6f]
    ldrb     w9, [sp, #0x6e]
    cmp      w8, w9
    mov      w8, #0xebcf
    movk     w8, #0x3494, lsl #16
    mov      w9, #0x401
    movk     w9, #0x4e14, lsl #16
    csel     w8, w9, w8, eq
    ldr      x9, [sp, #0x20]
    str      w8, [x9]
    b        #0x327ea8
    mov      w9, #0xf9e3
    movk     w9, #0xdcff, lsl #16
    cmp      w8, w9
    b.gt     #0x327c5c
    cmp      w8, w25
    b.eq     #0x327e5c
    mov      w9, #0x40b1
    movk     w9, #0xd62f, lsl #16
    cmp      w8, w9
    b.ne     #0x327a94
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x2e0]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x50]
    cmp      x0, #0
    cset     w8, eq
    strb     w8, [sp, #0x4f]
    ldr      x8, [sp, #0x20]
    mov      w9, #0xb400
    movk     w9, #0x2a9e, lsl #16
    str      w9, [x8]
    b        #0x327a94
    mov      w9, #0x2536
    movk     w9, #0x2052, lsl #16
    cmp      w8, w9
    b.eq     #0x327e24
    mov      w9, #0xb400
    movk     w9, #0x2a9e, lsl #16
    cmp      w8, w9
    b.ne     #0x327a94
    ldr      x0, [sp, #0x50]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x20]
    mov      w9, #0x2536
    movk     w9, #0x2052, lsl #16
    str      w9, [x8]
    b        #0x327a94
    mov      w9, #0xf9e4
    movk     w9, #0xdcff, lsl #16
    cmp      w8, w9
    b.eq     #0x327e7c
    mov      w9, #0xb073
    movk     w9, #0xdf78, lsl #16
    cmp      w8, w9
    b.ne     #0x327a94
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd64]
    add      x8, x24, x8
    str      x8, [sp, #0x70]
    ldr      x8, [sp, #0x20]
    mov      w9, #0x35b9
    movk     w9, #0x304c, lsl #16
    str      w9, [x8]
    b        #0x327a94
    mov      w9, #0xc62e
    movk     w9, #0xb438, lsl #16
    cmp      w8, w9
    b.eq     #0x327eb4
    mov      w9, #0x2353
    movk     w9, #0xb455, lsl #16
    cmp      w8, w9
    b.ne     #0x327a94
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd68]
    ldr      x9, [x24, x8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x358]
    stp      x8, x9, [x29, #-0x68]
    ldur     x0, [x29, #-0x58]
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp, #0x20]
    mov      w9, #0xf9e4
    movk     w9, #0xdcff, lsl #16
    str      w9, [x8]
    b        #0x327a94
    mov      w9, #0x35b9
    movk     w9, #0x304c, lsl #16
    cmp      w8, w9
    b.eq     #0x327eec
    mov      w9, #0xebcf
    movk     w9, #0x3494, lsl #16
    cmp      w8, w9
    b.ne     #0x327a94
    ldrb     w28, [sp, #0x2f]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc98]
    ldur     x2, [x29, #-0x58]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    ldur     x0, [x29, #-0x58]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xca0]
    mov      x0, x24
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xca8]
    mov      x0, x24
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      w19, #0
    ldr      x8, [sp, #0x18]
    csel     x2, xzr, x8, ne
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xcb0]
    ldr      x8, [sp, #0x10]
    csel     x25, xzr, x8, ne
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xcb8]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xcc0]
    mov      x0, x24
    mov      x2, x25
    mov      w25, #0x1a2
    movk     w25, #0xcbaa, lsl #16
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xcc8]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    cmp      w28, #0
    mov      w28, #0xad4d
    movk     w28, #0xb0b0, lsl #16
    mov      w8, #0x40b1
    movk     w8, #0xd62f, lsl #16
    csel     w8, w28, w8, ne
    b        #0x327e30
    ldrb     w8, [sp, #0x5f]
    cmp      w8, w19
    cset     w8, ne
    ldr      x9, [sp, #0x20]
    mov      w10, #0xebcf
    movk     w10, #0x3494, lsl #16
    str      w10, [x9]
    strb     w8, [sp, #0x2f]
    b        #0x327a94
    ldr      x1, [sp, #0x30]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x20]
    mov      w9, #0x4862
    movk     w9, #0xa2e8, lsl #16
    str      w9, [x8]
    b        #0x327a94
    ldrb     w8, [sp, #0x4f]
    cmp      w8, #0
    csel     w8, w28, w25, ne
    ldr      x9, [sp, #0x20]
    str      w8, [x9]
    b        #0x327a94
    ldr      x8, [sp, #0x60]
    ldrb     w8, [x24, x8]
    strb     w8, [sp, #0x5f]
    ldr      x8, [sp, #0x20]
    mov      w9, #0xed42
    movk     w9, #0xa237, lsl #16
    str      w9, [x8]
    b        #0x327a94
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x3e8]
    str      x8, [sp, #0x30]
    ldr      x8, [sp, #0x20]
    mov      w9, #0xe8a7
    movk     w9, #0xf921, lsl #16
    str      w9, [x8]
    b        #0x327a94
    ldp      x0, x2, [x29, #-0x60]
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp, #0x20]
    mov      w9, #0xebcf
    movk     w9, #0x3494, lsl #16
    mov      w10, #0xb073
    movk     w10, #0xdf78, lsl #16
    csel     w9, w10, w9, ne
    str      w9, [x8]
    mov      w8, #1
    strb     w8, [sp, #0x2f]
    b        #0x327a94
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xc90]
    str      x8, [sp, #0x38]
    ldr      x8, [sp, #0x20]
    mov      w9, #0x28ab
    movk     w9, #0x53d6, lsl #16
    str      w9, [x8]
    b        #0x327a94
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd6c]
    str      x8, [sp, #0x60]
    ldr      x8, [sp, #0x20]
    str      w27, [x8]
    b        #0x327a94
    ldr      x8, [sp, #0x70]
    ldrb     w8, [x8]
    strb     w8, [sp, #0x6f]
    strb     w20, [sp, #0x6e]
    ldr      x8, [sp, #0x20]
    mov      w9, #0xc203
    movk     w9, #0x6f7, lsl #16
    str      w9, [x8]
    b        #0x327a94
    mov      w9, #0x4862
    movk     w9, #0xa2e8, lsl #16
    cmp      w8, w9
    b.ne     #0x327a94
    ldp      x29, x30, [sp, #0xe0]
    ldp      x20, x19, [sp, #0xd0]
    ldp      x22, x21, [sp, #0xc0]
    ldp      x24, x23, [sp, #0xb0]
    ldp      x26, x25, [sp, #0xa0]
    ldp      x28, x27, [sp, #0x90]
    add      sp, sp, #0xf0
    ret      

// -[WCLGGroupPill refreshBadgeCount:memberCount:] IMP=0x327F40 bounds=0x327F40-0x3282E0
loc_327F40:
    sub      sp, sp, #0xb0
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      x19, x3
    mov      x20, x2
    mov      x21, x0
    mov      w24, #0xeb2
    movk     w24, #0x2a92, lsl #16
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc20]
    bl       #0x461c6c // _objc_msgSend
    mov      w9, #0x77b7
    movk     w9, #0xe1f5, lsl #16
    str      x0, [sp, #0x48]
    add      x8, sp, #0x14
    mov      w26, #0x9ef0
    movk     w26, #0x553, lsl #16
    str      w9, [sp, #0x14]
    mov      w27, #0x5edc
    movk     w27, #0xd294, lsl #16
    mov      w28, #0xaa69
    movk     w28, #0x8cd8, lsl #16
    str      x8, [sp, #8]
    mov      w25, #0x439d
    movk     w25, #0x4496, lsl #16
    mov      w23, #0x9ef1
    movk     w23, #0x553, lsl #16
    mov      w22, #0x3c4b
    movk     w22, #0x5025, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w26
    b.gt     #0x328024
    cmp      w8, w27
    b.gt     #0x32807c
    cmp      w8, w28
    b.gt     #0x32815c
    mov      w9, #0xade
    movk     w9, #0x805e, lsl #16
    cmp      w8, w9
    b.eq     #0x328204
    mov      w9, #0x7f4e
    movk     w9, #0x8543, lsl #16
    cmp      w8, w9
    b.ne     #0x327fc8
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xc28]
    str      x8, [sp, #0x38]
    ldr      x8, [sp, #8]
    mov      w9, #0xade
    movk     w9, #0x805e, lsl #16
    str      w9, [x8]
    b        #0x327fc8
    cmp      w8, w25
    b.le     #0x3280e4
    cmp      w8, w22
    b.gt     #0x328124
    mov      w9, #0x439e
    movk     w9, #0x4496, lsl #16
    cmp      w8, w9
    b.eq     #0x3281c0
    mov      w9, #0x4794
    movk     w9, #0x4975, lsl #16
    cmp      w8, w9
    b.ne     #0x327fc8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc28]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x30]
    ldr      x8, [sp, #8]
    mov      w9, #0x439e
    movk     w9, #0x4496, lsl #16
    str      w9, [x8]
    b        #0x327fc8
    mov      w9, #0x77b6
    movk     w9, #0xe1f5, lsl #16
    cmp      w8, w9
    b.le     #0x32819c
    mov      w9, #0x77b7
    movk     w9, #0xe1f5, lsl #16
    cmp      w8, w9
    b.eq     #0x328264
    mov      w9, #0xc201
    movk     w9, #0xf7e9, lsl #16
    cmp      w8, w9
    b.ne     #0x327fc8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xcb0]
    mov      x0, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xcb8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    mov      w9, #0x7f4e
    movk     w9, #0x8543, lsl #16
    str      w9, [x8]
    b        #0x327fc8
    cmp      w8, w23
    b.eq     #0x328244
    cmp      w8, w24
    b.eq     #0x328288
    mov      w9, #0xc116
    movk     w9, #0x3308, lsl #16
    cmp      w8, w9
    b.ne     #0x327fc8
    ldrb     w8, [sp, #0x47]
    cmp      w8, #0
    mov      w8, #0xc201
    movk     w8, #0xf7e9, lsl #16
    mov      w9, #0x4794
    movk     w9, #0x4975, lsl #16
    csel     w8, w9, w8, ne
    b        #0x328238
    mov      w9, #0x3c4c
    movk     w9, #0x5025, lsl #16
    cmp      w8, w9
    b.eq     #0x3281e4
    mov      w9, #0xb50f
    movk     w9, #0x777a, lsl #16
    cmp      w8, w9
    b.ne     #0x327fc8
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xcc8]
    str      x8, [sp, #0x20]
    ldr      x8, [sp, #8]
    str      w23, [x8]
    b        #0x327fc8
    mov      w9, #0xaa6a
    movk     w9, #0x8cd8, lsl #16
    cmp      w8, w9
    b.eq     #0x328224
    mov      w9, #0xb27d
    movk     w9, #0xc529, lsl #16
    cmp      w8, w9
    b.ne     #0x327fc8
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x3e8]
    str      x8, [sp, #0x18]
    ldr      x8, [sp, #8]
    mov      w9, #0x3c4c
    movk     w9, #0x5025, lsl #16
    str      w9, [x8]
    b        #0x327fc8
    mov      w9, #0x5edd
    movk     w9, #0xd294, lsl #16
    cmp      w8, w9
    b.ne     #0x3282b0
    ldr      x8, [sp, #8]
    mov      w9, #0xf13c
    movk     w9, #0xd7fe, lsl #16
    str      w9, [x8]
    b        #0x327fc8
    ldr      x8, [sp, #0x30]
    cmp      x8, x19
    cset     w8, eq
    strb     w8, [sp, #0x2f]
    ldr      x8, [sp, #8]
    mov      w9, #0xaa6a
    movk     w9, #0x8cd8, lsl #16
    str      w9, [x8]
    b        #0x327fc8
    ldr      x1, [sp, #0x18]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    mov      w9, #0x5edd
    movk     w9, #0xd294, lsl #16
    str      w9, [x8]
    b        #0x327fc8
    ldr      x1, [sp, #0x38]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, x19
    mov      w8, #0xb27d
    movk     w8, #0xc529, lsl #16
    csel     w8, w8, w24, eq
    b        #0x328238
    ldrb     w8, [sp, #0x2f]
    cmp      w8, #0
    mov      w8, #0xf13c
    movk     w8, #0xd7fe, lsl #16
    csel     w8, w8, w24, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x327fc8
    ldr      x1, [sp, #0x20]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    mov      w9, #0xb27d
    movk     w9, #0xc529, lsl #16
    str      w9, [x8]
    b        #0x327fc8
    ldr      x8, [sp, #0x48]
    cmp      x8, x20
    cset     w8, eq
    strb     w8, [sp, #0x47]
    ldr      x8, [sp, #8]
    mov      w9, #0xc116
    movk     w9, #0x3308, lsl #16
    str      w9, [x8]
    b        #0x327fc8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xcc0]
    mov      x0, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    mov      w9, #0xb50f
    movk     w9, #0x777a, lsl #16
    str      w9, [x8]
    b        #0x327fc8
    mov      w9, #0xf13c
    movk     w9, #0xd7fe, lsl #16
    cmp      w8, w9
    b.ne     #0x327fc8
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    add      sp, sp, #0xb0
    ret      

// -[WCLGGroupPill layoutSubviews] IMP=0x3282E0 bounds=0x3282E0-0x328B88
loc_3282E0:
    sub      sp, sp, #0x1d0
    stp      d15, d14, [sp, #0x130]
    stp      d13, d12, [sp, #0x140]
    stp      d11, d10, [sp, #0x150]
    stp      d9, d8, [sp, #0x160]
    stp      x28, x27, [sp, #0x170]
    stp      x26, x25, [sp, #0x180]
    stp      x24, x23, [sp, #0x190]
    stp      x22, x21, [sp, #0x1a0]
    stp      x20, x19, [sp, #0x1b0]
    stp      x29, x30, [sp, #0x1c0]
    add      x29, sp, #0x1c0
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0xa0]
    mov      w26, #0x72e1
    movk     w26, #0x56ad, lsl #16
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7d0]
    sub      x9, x29, #0xd0
    add      x9, x9, #8
    stp      x8, x0, [x29, #-0xd8]
    mov      w10, #0xf1fb
    movk     w10, #0x4f14, lsl #16
    add      x8, sp, #0xc
    str      x9, [sp, #0xe0]
    mov      w28, #0x92d9
    movk     w28, #0x1113, lsl #16
    mov      w27, #0xadc8
    movk     w27, #0xb7a9, lsl #16
    str      w10, [sp, #0xc]
    mov      w24, #0x7d26
    movk     w24, #0xaa58, lsl #16
    str      x8, [sp]
    fmov     d9, #20.00000000
    mov      w21, #0x8219
    movk     w21, #0xe79e, lsl #16
    fmov     d10, #-20.00000000
    fmov     d11, #0.50000000
    fmov     d12, #6.00000000
    fmov     d13, #-16.00000000
    fmov     d14, #8.00000000
    fmov     d15, #12.00000000
    mov      w23, #0x72e0
    movk     w23, #0x56ad, lsl #16
    mov      w25, #0x2371
    movk     w25, #0x4abe, lsl #16
    mov      w22, #0x1c74
    movk     w22, #0x6541, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w28
    b.le     #0x328458
    cmp      w8, w23
    b.le     #0x3284b8
    cmp      w8, w22
    b.le     #0x32875c
    mov      w9, #0x9824
    movk     w9, #0x6dcd, lsl #16
    cmp      w8, w9
    b.gt     #0x3287ac
    mov      w9, #0x1c75
    movk     w9, #0x6541, lsl #16
    cmp      w8, w9
    b.eq     #0x328874
    mov      w9, #0xb9cb
    movk     w9, #0x6d7c, lsl #16
    cmp      w8, w9
    b.ne     #0x3283ac
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    ldr      d0, [sp, #0x50]
    ldr      d1, [sp, #0x40]
    ldr      d2, [sp, #0x10]
    ldr      x0, [sp, #0x38]
    fmov     d3, #20.00000000
    bl       #0x461c6c // _objc_msgSend
    ldr      d0, [sp, #0x10]
    fadd     d0, d0, d14
    ldr      d1, [sp, #0xb8]
    fsub     d8, d1, d0
    ldr      x8, [sp, #0xa0]
    ldr      x2, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp]
    mov      w9, #0x9dd3
    movk     w9, #0xa5e3, lsl #16
    str      w9, [x8]
    str      d8, [sp, #0x28]
    b        #0x3283ac
    cmp      w8, w27
    b.gt     #0x328540
    cmp      w8, w24
    b.gt     #0x3285e4
    mov      w9, #0xb8a6
    movk     w9, #0x9bc6, lsl #16
    cmp      w8, w9
    b.gt     #0x3287ec
    mov      w9, #0x781d
    movk     w9, #0x899f, lsl #16
    cmp      w8, w9
    b.eq     #0x328844
    mov      w9, #0xdf22
    movk     w9, #0x9a28, lsl #16
    cmp      w8, w9
    b.ne     #0x3283ac
    ldrb     w8, [sp, #0x7f]
    cmp      w8, #0
    mov      w8, #0xd781
    movk     w8, #0xf955, lsl #16
    mov      w9, #0x2582
    movk     w9, #0x471e, lsl #16
    csel     w8, w8, w9, ne
    b        #0x328b20
    cmp      w8, w25
    b.gt     #0x32864c
    mov      w9, #0x92da
    movk     w9, #0x1113, lsl #16
    cmp      w8, w9
    b.eq     #0x3289e4
    mov      w9, #0x6f99
    movk     w9, #0x37c2, lsl #16
    cmp      w8, w9
    b.eq     #0x328918
    mov      w9, #0x2582
    movk     w9, #0x471e, lsl #16
    cmp      w8, w9
    b.ne     #0x3283ac
    ldr      d0, [sp, #0xc0]
    ldr      d1, [sp, #0x10]
    fsub     d0, d0, d1
    fadd     d0, d0, d12
    ldr      x8, [sp, #0xa0]
    ldr      x9, [x8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x678]
    stp      x8, x9, [sp, #0x68]
    mov      x8, #-0x3fe8000000000000
    stur     x8, [x29, #-0xb8]
    stur     d1, [x29, #-0xb0]
    mov      x8, #0x4034000000000000
    stur     x8, [x29, #-0xa8]
    stur     d0, [x29, #-0xc0]
    ldr      x8, [sp]
    mov      w9, #0x23b6
    movk     w9, #0x5375, lsl #16
    str      w9, [x8]
    b        #0x3283ac
    cmp      w8, w21
    b.gt     #0x3286b8
    mov      w9, #0xadc9
    movk     w9, #0xb7a9, lsl #16
    cmp      w8, w9
    b.eq     #0x328a78
    mov      w9, #0xa7e8
    movk     w9, #0xbf45, lsl #16
    cmp      w8, w9
    b.eq     #0x328980
    mov      w9, #0xb9ef
    movk     w9, #0xe5c3, lsl #16
    cmp      w8, w9
    b.ne     #0x3283ac
    ldr      d8, [sp, #0x18]
    ldr      x20, [sp, #0x20]
    ldr      x0, [x20]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x248]
    ldr      d1, [sp, #0xc8]
    mov      x8, #0x7fefffffffffffff
    fmov     d0, x8
    bl       #0x461c6c // _objc_msgSend
    fmov     d2, d0
    fsub     d0, d8, d0
    ldr      x0, [x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    ldr      d3, [sp, #0xc8]
    fmov     d1, xzr
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp]
    mov      w9, #0xb8a7
    movk     w9, #0x9bc6, lsl #16
    str      w9, [x8]
    b        #0x3283ac
    mov      w9, #0x7d27
    movk     w9, #0xaa58, lsl #16
    cmp      w8, w9
    b.eq     #0x3289d0
    mov      w9, #0x555a
    movk     w9, #0xabed, lsl #16
    cmp      w8, w9
    b.eq     #0x328904
    mov      w9, #0x9098
    movk     w9, #0xad80, lsl #16
    cmp      w8, w9
    b.ne     #0x3283ac
    ldr      x8, [sp, #0xa0]
    ldr      x0, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x248]
    mov      x8, #0x7fefffffffffffff
    fmov     d0, x8
    fmov     d1, #20.00000000
    bl       #0x461c6c // _objc_msgSend
    stp      d0, d1, [sp, #0x88]
    ldr      x8, [sp]
    mov      w9, #0x9825
    movk     w9, #0x6dcd, lsl #16
    str      w9, [x8]
    b        #0x3283ac
    mov      w9, #0x2372
    movk     w9, #0x4abe, lsl #16
    cmp      w8, w9
    b.eq     #0x328a3c
    mov      w9, #0xf1fb
    movk     w9, #0x4f14, lsl #16
    cmp      w8, w9
    b.eq     #0x328950
    mov      w9, #0x23b6
    movk     w9, #0x5375, lsl #16
    cmp      w8, w9
    b.ne     #0x3283ac
    ldp      x1, x0, [sp, #0x68]
    ldp      d2, d3, [x29, #-0xb0]
    ldp      d0, d1, [x29, #-0xc0]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0xa0]
    ldr      x2, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp]
    mov      w9, #0x7d27
    movk     w9, #0xaa58, lsl #16
    str      w9, [x8]
    b        #0x3283ac
    mov      w9, #0x821a
    movk     w9, #0xe79e, lsl #16
    cmp      w8, w9
    b.eq     #0x328aa4
    mov      w9, #0xd781
    movk     w9, #0xf955, lsl #16
    cmp      w8, w9
    b.eq     #0x3289ac
    mov      w9, #0xaba9
    movk     w9, #0x185, lsl #16
    cmp      w8, w9
    b.ne     #0x3283ac
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xcd8]
    ldr      x0, [sp, #0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc30]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0xaf]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd5c]
    add      x9, x19, x8
    ldr      x0, [x19, x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9a8]
    stp      x1, x9, [sp, #0x98]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp]
    mov      w9, #0x9098
    movk     w9, #0xad80, lsl #16
    csel     w9, w26, w9, ne
    str      w9, [x8]
    str      xzr, [sp, #0x30]
    b        #0x3283ac
    cmp      w8, w26
    b.eq     #0x328aec
    mov      w9, #0x12b9
    movk     w9, #0x57be, lsl #16
    cmp      w8, w9
    b.eq     #0x328ac8
    mov      w9, #0xe896
    movk     w9, #0x5cb2, lsl #16
    cmp      w8, w9
    b.ne     #0x3283ac
    ldr      x8, [sp, #0x60]
    ldr      x0, [x8]
    ldr      x1, [sp, #0x98]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x5f]
    ldr      x8, [sp]
    mov      w9, #0x6f99
    movk     w9, #0x37c2, lsl #16
    str      w9, [x8]
    b        #0x3283ac
    mov      w9, #0x9825
    movk     w9, #0x6dcd, lsl #16
    cmp      w8, w9
    b.eq     #0x3288a8
    mov      w9, #0xb778
    movk     w9, #0x6dd9, lsl #16
    cmp      w8, w9
    b.ne     #0x3283ac
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x438]
    str      x8, [sp, #0xd0]
    ldr      x8, [sp]
    mov      w9, #0x12b9
    movk     w9, #0x57be, lsl #16
    str      w9, [x8]
    b        #0x3283ac
    mov      w9, #0x9dd3
    movk     w9, #0xa5e3, lsl #16
    cmp      w8, w9
    b.ne     #0x328b2c
    ldr      d8, [sp, #0x28]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd60]
    add      x20, x19, x8
    ldr      x0, [x20]
    ldr      x1, [sp, #0x98]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp]
    mov      w9, #0xb9ef
    movk     w9, #0xe5c3, lsl #16
    mov      w10, #0xb8a7
    movk     w10, #0x9bc6, lsl #16
    csel     w9, w10, w9, ne
    str      w9, [x8]
    str      x20, [sp, #0x20]
    str      d8, [sp, #0x18]
    b        #0x3283ac
    ldrb     w8, [sp, #0x7f]
    cmp      w8, #0
    mov      w8, #0x9dd3
    movk     w8, #0xa5e3, lsl #16
    mov      w9, #0xadc9
    movk     w9, #0xb7a9, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [sp]
    str      w8, [x9]
    ldr      d0, [sp, #0xb8]
    str      d0, [sp, #0x28]
    b        #0x3283ac
    ldr      x1, [sp, #0xd8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fadd     d0, d2, d13
    stp      d0, d2, [sp, #0xb8]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x198]
    str      x8, [sp, #0xb0]
    ldr      x8, [sp]
    mov      w9, #0xaba9
    movk     w9, #0x185, lsl #16
    str      w9, [x8]
    b        #0x3283ac
    ldr      d0, [sp, #0x88]
    fadd     d0, d0, d15
    fmaxnm   d0, d0, d9
    str      d0, [sp, #0x80]
    ldr      x8, [sp, #0xa0]
    ldr      x0, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, #10.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    mov      w9, #0x555a
    movk     w9, #0xabed, lsl #16
    str      w9, [x8]
    b        #0x3283ac
    ldr      x8, [sp]
    str      w26, [x8]
    ldr      d0, [sp, #0x80]
    str      d0, [sp, #0x30]
    b        #0x3283ac
    ldrb     w8, [sp, #0x5f]
    cmp      w8, #0
    mov      w8, #0xb9ef
    movk     w8, #0xe5c3, lsl #16
    mov      w9, #0xb8a7
    movk     w9, #0x9bc6, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp]
    str      w8, [x9]
    ldr      d0, [sp, #0xb8]
    ldr      x8, [sp, #0x60]
    str      x8, [sp, #0x20]
    str      d0, [sp, #0x18]
    b        #0x3283ac
    ldur     x8, [x29, #-0xd8]
    ldr      x9, [sp, #0xe0]
    str      x8, [x9]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
    sub      x0, x29, #0xd0
    bl       #0x461c84 // _objc_msgSendSuper2
    ldr      x8, [sp]
    mov      w9, #0x2372
    movk     w9, #0x4abe, lsl #16
    str      w9, [x8]
    b        #0x3283ac
    ldr      d0, [sp, #0x48]
    fmul     d0, d0, d11
    str      d0, [sp, #0x40]
    ldr      x8, [sp, #0xa0]
    ldr      x8, [x8]
    str      x8, [sp, #0x38]
    ldr      x8, [sp]
    mov      w9, #0xb9cb
    movk     w9, #0x6d7c, lsl #16
    str      w9, [x8]
    b        #0x3283ac
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd60]
    add      x8, x19, x8
    str      x8, [sp, #0x60]
    ldr      x8, [sp]
    mov      w9, #0xe896
    movk     w9, #0x5cb2, lsl #16
    str      w9, [x8]
    b        #0x3283ac
    ldr      x8, [sp]
    mov      w9, #0xd781
    movk     w9, #0xf955, lsl #16
    str      w9, [x8]
    b        #0x3283ac
    ldr      x1, [sp, #0xd8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmul     d8, d3, d11
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    mov      w9, #0xb778
    movk     w9, #0x6dd9, lsl #16
    str      w9, [x8]
    b        #0x3283ac
    mov      w0, #2
    mov      w1, #0xf
    mov      w2, #0
    mov      w3, #0
    bl       #0x45e7d8
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x4d8]
    str      x8, [sp, #0xd8]
    cmp      w0, #0
    mov      w8, #0x821a
    movk     w8, #0xe79e, lsl #16
    mov      w9, #0x92da
    movk     w9, #0x1113, lsl #16
    csel     w8, w9, w8, eq
    b        #0x328b20
    ldr      d0, [sp, #0xb8]
    ldr      d1, [sp, #0x10]
    fsub     d2, d0, d1
    ldr      d0, [sp, #0xc8]
    fadd     d0, d0, d10
    stp      d0, d2, [sp, #0x48]
    ldr      x8, [sp]
    mov      w9, #0xa7e8
    movk     w9, #0xbf45, lsl #16
    str      w9, [x8]
    b        #0x3283ac
    ldr      x1, [sp, #0xd8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    str      d3, [sp, #0xc8]
    ldr      x8, [sp]
    mov      w9, #0x1c75
    movk     w9, #0x6541, lsl #16
    str      w9, [x8]
    b        #0x3283ac
    ldr      x1, [sp, #0xd0]
    mov      x0, x19
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp]
    mov      w9, #0x821a
    movk     w9, #0xe79e, lsl #16
    str      w9, [x8]
    b        #0x3283ac
    ldr      d0, [sp, #0x30]
    str      d0, [sp, #0x10]
    ldp      x1, x8, [sp, #0x98]
    ldr      x0, [x8]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x7f]
    ldrb     w8, [sp, #0xaf]
    cmp      w8, #0
    mov      w8, #0x781d
    movk     w8, #0x899f, lsl #16
    mov      w9, #0xdf22
    movk     w9, #0x9a28, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x3283ac
    mov      w9, #0xb8a7
    movk     w9, #0x9bc6, lsl #16
    cmp      w8, w9
    b.ne     #0x3283ac
    ldur     x8, [x29, #-0xa0]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x328b84
    ldp      x29, x30, [sp, #0x1c0]
    ldp      x20, x19, [sp, #0x1b0]
    ldp      x22, x21, [sp, #0x1a0]
    ldp      x24, x23, [sp, #0x190]
    ldp      x26, x25, [sp, #0x180]
    ldp      x28, x27, [sp, #0x170]
    ldp      d9, d8, [sp, #0x160]
    ldp      d11, d10, [sp, #0x150]
    ldp      d13, d12, [sp, #0x140]
    ldp      d15, d14, [sp, #0x130]
    add      sp, sp, #0x1d0
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGGroupPill handleTap] IMP=0x328B88 bounds=0x328B88-0x328E78
loc_328B88:
    sub      sp, sp, #0xc0
    stp      x28, x27, [sp, #0x60]
    stp      x26, x25, [sp, #0x70]
    stp      x24, x23, [sp, #0x80]
    stp      x22, x21, [sp, #0x90]
    stp      x20, x19, [sp, #0xa0]
    stp      x29, x30, [sp, #0xb0]
    add      x29, sp, #0xb0
    mov      x19, x0
    mov      w21, #0x60cc
    movk     w21, #0x599f, lsl #16
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x198]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xcd8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c1000
    mov      w10, #0x35c5
    movk     w10, #0x46f, lsl #16
    add      x9, sp, #0x14
    ldr      x8, [x8, #0xcd0]
    mov      w24, #0x35c4
    movk     w24, #0x46f, lsl #16
    mov      w25, #0x1fc6
    movk     w25, #0xc0ee, lsl #16
    stp      x8, x0, [sp, #0x50]
    mov      w26, #0x31e4
    movk     w26, #0x8a82, lsl #16
    str      w10, [sp, #0x14]
    mov      w28, #0x6222
    movk     w28, #0xe083, lsl #16
    str      x9, [sp, #8]
    mov      w22, #0x1fc7
    movk     w22, #0xc0ee, lsl #16
    mov      w23, #0xba0
    movk     w23, #0x669, lsl #16
    mov      w27, #0x56bc
    movk     w27, #0x41e6, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w24
    b.gt     #0x328c78
    cmp      w8, w25
    b.gt     #0x328cd4
    cmp      w8, w26
    b.eq     #0x328d6c
    mov      w9, #0x1569
    movk     w9, #0x9389, lsl #16
    cmp      w8, w9
    b.eq     #0x328df8
    mov      w9, #0x6a5d
    movk     w9, #0xc001, lsl #16
    cmp      w8, w9
    b.ne     #0x328c28
    ldr      x8, [sp, #8]
    mov      w9, #0x65fa
    movk     w9, #0x6116, lsl #16
    str      w9, [x8]
    b        #0x328c28
    cmp      w8, w27
    b.gt     #0x328d0c
    mov      w9, #0x35c5
    movk     w9, #0x46f, lsl #16
    cmp      w8, w9
    b.eq     #0x328d4c
    cmp      w8, w23
    b.eq     #0x328dd8
    mov      w9, #0x2eed
    movk     w9, #0x238a, lsl #16
    cmp      w8, w9
    b.ne     #0x328c28
    ldr      x0, [sp, #0x40]
    bl       #0x461bac // _objc_alloc_init
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xa10]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w22, [x8]
    b        #0x328c28
    cmp      w8, w22
    b.eq     #0x328d98
    cmp      w8, w28
    b.eq     #0x328e20
    mov      w9, #0x6c47
    movk     w9, #0xfb68, lsl #16
    cmp      w8, w9
    b.ne     #0x328c28
    ldr      x0, [sp, #0x58]
    bl       #0x461c9c // _objc_release
    ldrb     w8, [sp, #0x4f]
    cmp      w8, #0
    csel     w8, w23, w21, ne
    b        #0x328d40
    cmp      w8, w21
    b.eq     #0x328da4
    mov      w9, #0x65fa
    movk     w9, #0x6116, lsl #16
    cmp      w8, w9
    b.ne     #0x328e48
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x30]
    cmp      x8, #0
    mov      w8, #0x56bd
    movk     w8, #0x41e6, lsl #16
    csel     w8, w8, w26, eq
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x328c28
    ldp      x1, x0, [sp, #0x50]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x4f]
    ldr      x8, [sp, #8]
    mov      w9, #0x6c47
    movk     w9, #0xfb68, lsl #16
    str      w9, [x8]
    b        #0x328c28
    ldr      x1, [sp, #0x38]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    ldr      x8, [sp, #8]
    mov      w9, #0x1569
    movk     w9, #0x9389, lsl #16
    str      w9, [x8]
    b        #0x328c28
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x328c28
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xad0]
    str      x1, [sp, #0x38]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    ldr      x8, [sp, #8]
    mov      w9, #0x6a5d
    movk     w9, #0xc001, lsl #16
    str      w9, [x8]
    b        #0x328c28
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x570]
    str      x8, [sp, #0x40]
    ldr      x8, [sp, #8]
    mov      w9, #0x2eed
    movk     w9, #0x238a, lsl #16
    str      w9, [x8]
    b        #0x328c28
    ldr      x20, [sp, #0x28]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xcd8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x20, #0x10]
    stp      x8, x0, [sp, #0x18]
    ldr      x8, [sp, #8]
    str      w28, [x8]
    b        #0x328c28
    ldp      x1, x0, [sp, #0x20]
    ldr      x8, [sp, #0x18]
    blr      x8
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0x56bd
    movk     w9, #0x41e6, lsl #16
    str      w9, [x8]
    b        #0x328c28
    mov      w9, #0x56bd
    movk     w9, #0x41e6, lsl #16
    cmp      w8, w9
    b.ne     #0x328c28
    ldp      x29, x30, [sp, #0xb0]
    ldp      x20, x19, [sp, #0xa0]
    ldp      x22, x21, [sp, #0x90]
    ldp      x24, x23, [sp, #0x80]
    ldp      x26, x25, [sp, #0x70]
    ldp      x28, x27, [sp, #0x60]
    add      sp, sp, #0xc0
    ret      

// -[WCLGGroupPill handleLongPress:] IMP=0x328E78 bounds=0x328E78-0x3290D8
loc_328E78:
    sub      sp, sp, #0xb0
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      x20, x0
    mov      w22, #0xd033
    movk     w22, #0x643b, lsl #16
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0x3d0]
    str      x8, [sp, #0x48]
    mov      w9, #0x3f92
    movk     w9, #0x4c23, lsl #16
    add      x8, sp, #0x1c
    str      w9, [sp, #0x1c]
    mov      w24, #0xa2bf
    movk     w24, #0xdde4, lsl #16
    mov      w25, #0x690e
    movk     w25, #0x99b7, lsl #16
    stp      x2, x8, [sp, #8]
    mov      w26, #0x8fab
    movk     w26, #0x88b3, lsl #16
    mov      w21, #0x86a2
    movk     w21, #0x9085, lsl #16
    mov      w28, #0x770d
    movk     w28, #0x8e1, lsl #16
    mov      w23, #0x690f
    movk     w23, #0x99b7, lsl #16
    mov      w27, #0x770c
    movk     w27, #0x8e1, lsl #16
    mov      w19, #0xa2c0
    movk     w19, #0xdde4, lsl #16
    ldr      w8, [sp, #0x1c]
    cmp      w8, w24
    b.le     #0x328f54
    cmp      w8, w27
    b.le     #0x328f84
    cmp      w8, w28
    b.eq     #0x32907c
    mov      w9, #0x3f92
    movk     w9, #0x4c23, lsl #16
    cmp      w8, w9
    b.ne     #0x3290b0
    ldr      x1, [sp, #0x48]
    ldr      x0, [sp, #8]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x40]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x5b03
    movk     w9, #0xe6df, lsl #16
    str      w9, [x8]
    b        #0x328f04
    cmp      w8, w25
    b.gt     #0x328fac
    cmp      w8, w26
    b.eq     #0x329018
    cmp      w8, w21
    b.ne     #0x328f04
    ldr      x8, [sp, #0x28]
    add      x8, x8, #0x10
    str      x8, [sp, #0x20]
    ldr      x8, [sp, #0x10]
    str      w28, [x8]
    b        #0x328f04
    cmp      w8, w19
    b.eq     #0x328fd8
    mov      w9, #0x5b03
    movk     w9, #0xe6df, lsl #16
    cmp      w8, w9
    b.ne     #0x328f04
    ldr      x8, [sp, #0x40]
    cmp      x8, #1
    csel     w8, w19, w22, eq
    b        #0x329070
    cmp      w8, w23
    b.eq     #0x32903c
    mov      w9, #0x2ff4
    movk     w9, #0xab2c, lsl #16
    cmp      w8, w9
    b.ne     #0x328f04
    ldr      x0, [sp, #0x38]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    str      w23, [x8]
    b        #0x328f04
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x238]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x478]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x38]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x480]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x10]
    mov      w9, #0x2ff4
    movk     w9, #0xab2c, lsl #16
    str      w9, [x8]
    b        #0x328f04
    ldr      x1, [sp, #0x30]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    ldr      x8, [sp, #0x10]
    str      w21, [x8]
    b        #0x328f04
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xad8]
    str      x1, [sp, #0x30]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461c9c // _objc_release
    cmp      x21, #0
    mov      w21, #0x86a2
    movk     w21, #0x9085, lsl #16
    csel     w8, w22, w26, eq
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x328f04
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xcd8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x1, x0
    ldp      x8, x0, [sp, #0x20]
    ldr      x8, [x8]
    blr      x8
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    str      w22, [x8]
    b        #0x328f04
    cmp      w8, w22
    b.ne     #0x328f04
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    add      sp, sp, #0xb0
    ret      

// -[WCLGGroupPill displayIndex] IMP=0x3290D8 bounds=0x3290D8-0x329144
loc_3290D8:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd70]
    str      w8, [sp, #0x1c]
    mov      w8, #0xb048
    movk     w8, #0x409b, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0xfb50
    movk     w9, #0x18ce, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x32911c
    cmp      w10, w9
    b.ne     #0x329104
    b        #0x329134
    ldrsw    x10, [sp, #0x1c]
    add      x10, x0, x10
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x329104
    ldr      x8, [sp, #0x10]
    ldr      x0, [x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupPill setDisplayIndex:] IMP=0x329144 bounds=0x329144-0x3291B0
loc_329144:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd70]
    str      w8, [sp, #0x1c]
    mov      w8, #0xa994
    movk     w8, #0xf0d8, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x6f1f
    movk     w9, #0xf419, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x329188
    cmp      w10, w9
    b.ne     #0x329170
    b        #0x3291a0
    ldrsw    x10, [sp, #0x1c]
    add      x10, x0, x10
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x329170
    ldr      x8, [sp, #0x10]
    str      x2, [x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupPill onTap] IMP=0x3291B0 bounds=0x3291B0-0x32921C
loc_3291B0:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd74]
    add      x8, x0, x8
    str      x8, [sp, #0x18]
    mov      w8, #0x5e26
    movk     w8, #0x2a9d, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0xe67d
    movk     w9, #0xacac, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x3291f8
    cmp      w10, w9
    b.ne     #0x3291e0
    b        #0x329210
    ldr      x10, [sp, #0x18]
    ldr      x10, [x10]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x3291e0
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupPill setOnTap:] IMP=0x32921C bounds=0x32921C-0x3292B4
loc_32921C:
    sub      sp, sp, #0x50
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    mov      x20, x1
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd74]
    mov      w22, #0x4a9
    movk     w22, #0x73f0, lsl #16
    stp      w22, w8, [sp, #8]
    add      x8, sp, #8
    str      x8, [sp]
    mov      w23, #0x8330
    movk     w23, #0x4dee, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w22
    b.eq     #0x32927c
    cmp      w8, w23
    b.ne     #0x329264
    b        #0x32929c
    ldrsw    x3, [sp, #0xc]
    mov      x0, x21
    mov      x1, x20
    mov      x2, x19
    bl       #0x461cf0 // _objc_setProperty_nonatomic_copy
    ldr      x8, [sp]
    str      w23, [x8]
    b        #0x329264
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    add      sp, sp, #0x50
    ret      

// -[WCLGGroupPill onLongPress] IMP=0x3292B4 bounds=0x3292B4-0x329320
loc_3292B4:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd78]
    str      x8, [sp, #0x18]
    mov      w8, #0xd948
    movk     w8, #0xe225, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x2c27
    movk     w9, #0xd482, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x3292f8
    cmp      w10, w9
    b.ne     #0x3292e0
    b        #0x329310
    ldr      x10, [sp, #0x18]
    add      x10, x0, x10
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x3292e0
    ldr      x8, [sp, #0x10]
    ldr      x0, [x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupPill setOnLongPress:] IMP=0x329320 bounds=0x329320-0x3293B8
loc_329320:
    sub      sp, sp, #0x50
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    mov      x20, x1
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd78]
    mov      w22, #0x9b11
    movk     w22, #0xb64c, lsl #16
    stp      w22, w8, [sp, #8]
    add      x8, sp, #8
    str      x8, [sp]
    mov      w23, #0x6554
    movk     w23, #0x5c85, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w22
    b.eq     #0x329380
    cmp      w8, w23
    b.ne     #0x329368
    b        #0x3293a0
    ldrsw    x3, [sp, #0xc]
    mov      x0, x21
    mov      x1, x20
    mov      x2, x19
    bl       #0x461cf0 // _objc_setProperty_nonatomic_copy
    ldr      x8, [sp]
    str      w23, [x8]
    b        #0x329368
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    add      sp, sp, #0x50
    ret      

// -[WCLGGroupPill badge] IMP=0x3293B8 bounds=0x3293B8-0x329424
loc_3293B8:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd5c]
    str      x8, [sp, #0x18]
    mov      w8, #0xa58e
    movk     w8, #0xfe7e, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0xc94a
    movk     w9, #0xe56b, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x3293fc
    cmp      w10, w9
    b.ne     #0x3293e4
    b        #0x329414
    ldr      x10, [sp, #0x18]
    add      x10, x0, x10
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x3293e4
    ldr      x8, [sp, #0x10]
    ldr      x0, [x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupPill setBadge:] IMP=0x329424 bounds=0x329424-0x3294B8
loc_329424:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd5c]
    add      x8, x0, x8
    str      x8, [sp, #0x18]
    mov      w20, #0x3a2f
    movk     w20, #0x8c86, lsl #16
    str      w20, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w21, #0xda86
    movk     w21, #0x6beb, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w20
    b.eq     #0x329480
    cmp      w8, w21
    b.ne     #0x329468
    b        #0x3294a4
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp, #0x18]
    ldr      x0, [x8]
    str      x19, [x8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x329468
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    ret      

// -[WCLGGroupPill badgeCount] IMP=0x3294B8 bounds=0x3294B8-0x329524
loc_3294B8:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd7c]
    add      x8, x0, x8
    str      x8, [sp, #0x18]
    mov      w8, #0x38e
    movk     w8, #0x4238, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x19a2
    movk     w9, #0xc52a, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x329500
    cmp      w10, w9
    b.ne     #0x3294e8
    b        #0x329518
    ldr      x10, [sp, #0x18]
    ldr      x10, [x10]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x3294e8
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupPill setBadgeCount:] IMP=0x329524 bounds=0x329524-0x329590
loc_329524:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd7c]
    str      w8, [sp, #0x1c]
    mov      w8, #0x65f7
    movk     w8, #0xbf0f, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x34c9
    movk     w9, #0x511a, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x329568
    cmp      w10, w9
    b.ne     #0x329550
    b        #0x329580
    ldrsw    x10, [sp, #0x1c]
    add      x10, x0, x10
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x329550
    ldr      x8, [sp, #0x10]
    str      x2, [x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupPill countLabel] IMP=0x329590 bounds=0x329590-0x3295F8
loc_329590:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd60]
    str      w8, [sp, #0x1c]
    mov      w8, #0x88ec
    movk     w8, #0x9e06, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x2614
    movk     w9, #0x2721, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x3295d4
    cmp      w10, w9
    b.ne     #0x3295bc
    b        #0x3295e8
    ldrsw    x10, [sp, #0x1c]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x3295bc
    ldr      x8, [sp, #0x10]
    ldr      x0, [x0, x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupPill setCountLabel:] IMP=0x3295F8 bounds=0x3295F8-0x32969C
loc_3295F8:
    sub      sp, sp, #0x60
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd60]
    stur     w8, [x29, #-0x24]
    mov      w21, #0x99cb
    movk     w21, #0x669d, lsl #16
    str      w21, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w22, #0x3efe
    movk     w22, #0x9c70, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w21
    b.eq     #0x329654
    cmp      w8, w22
    b.ne     #0x32963c
    b        #0x329680
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
    b        #0x32963c
    ldp      x0, x8, [sp, #0x18]
    str      x19, [x8]
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    add      sp, sp, #0x60
    b        #0x461c9c // _objc_release

// -[WCLGGroupPill memberCount] IMP=0x32969C bounds=0x32969C-0x329708
loc_32969C:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd80]
    add      x8, x0, x8
    str      x8, [sp, #0x18]
    mov      w8, #0xf335
    movk     w8, #0xe135, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0xfe20
    movk     w9, #0x8858, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x3296e4
    cmp      w10, w9
    b.ne     #0x3296cc
    b        #0x3296fc
    ldr      x10, [sp, #0x18]
    ldr      x10, [x10]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x3296cc
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupPill setMemberCount:] IMP=0x329708 bounds=0x329708-0x32976C
loc_329708:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd80]
    add      x8, x0, x8
    str      x8, [sp, #0x18]
    mov      w8, #0x6633
    movk     w8, #0x35e3, lsl #16
    str      w8, [sp, #0x14]
    add      x9, sp, #0x14
    str      x9, [sp, #8]
    mov      w9, #0xf3b
    movk     w9, #0xaaf8, lsl #16
    ldr      w10, [sp, #0x14]
    cmp      w10, w8
    b.eq     #0x329750
    cmp      w10, w9
    b.ne     #0x329738
    b        #0x329764
    ldr      x10, [sp, #0x18]
    str      x2, [x10]
    ldr      x10, [sp, #8]
    str      w9, [x10]
    b        #0x329738
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupPill wclgExpanded] IMP=0x32976C bounds=0x32976C-0x3297D8
loc_32976C:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd64]
    str      x8, [sp, #0x18]
    mov      w8, #0x1dd6
    movk     w8, #0x51f2, lsl #16
    str      w8, [sp, #0x10]
    add      x9, sp, #0x10
    str      x9, [sp, #8]
    mov      w9, #0x21a6
    movk     w9, #0xd495, lsl #16
    ldr      w10, [sp, #0x10]
    cmp      w10, w8
    b.eq     #0x3297b0
    cmp      w10, w9
    b.ne     #0x329798
    b        #0x3297c8
    ldr      x10, [sp, #0x18]
    ldrb     w10, [x0, x10]
    strb     w10, [sp, #0x17]
    ldr      x10, [sp, #8]
    str      w9, [x10]
    b        #0x329798
    ldrb     w8, [sp, #0x17]
    and      w0, w8, #1
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupPill setWclgExpanded:] IMP=0x3297D8 bounds=0x3297D8-0x329840
loc_3297D8:
    sub      sp, sp, #0x20
    strb     w2, [sp, #0x1f]
    mov      w8, #0x8775
    movk     w8, #0xf00b, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    adrp     x9, #0x4c4000
    mov      w10, #0xcb0
    movk     w10, #0x3950, lsl #16
    ldr      w11, [sp, #0xc]
    cmp      w11, w8
    b.eq     #0x329818
    cmp      w11, w10
    b.ne     #0x329800
    b        #0x32982c
    ldrsw    x11, [x9, #0xd64]
    str      x11, [sp, #0x10]
    ldr      x11, [sp]
    str      w10, [x11]
    b        #0x329800
    ldr      x8, [sp, #0x10]
    ldrb     w9, [sp, #0x1f]
    strb     w9, [x0, x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupPill wclgNewButton] IMP=0x329840 bounds=0x329840-0x3298A8
loc_329840:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd6c]
    str      x8, [sp, #0x18]
    mov      w8, #0x3a7b
    movk     w8, #0x51dc, lsl #16
    str      w8, [sp, #0x10]
    add      x9, sp, #0x10
    str      x9, [sp, #8]
    mov      w9, #0x2e00
    movk     w9, #0xbd1b, lsl #16
    ldr      w10, [sp, #0x10]
    cmp      w10, w8
    b.eq     #0x329884
    cmp      w10, w9
    b.ne     #0x32986c
    b        #0x32989c
    ldr      x10, [sp, #0x18]
    ldrb     w10, [x0, x10]
    strb     w10, [sp, #0x17]
    ldr      x10, [sp, #8]
    str      w9, [x10]
    b        #0x32986c
    ldrb     w0, [sp, #0x17]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupPill setWclgNewButton:] IMP=0x3298A8 bounds=0x3298A8-0x329910
loc_3298A8:
    sub      sp, sp, #0x20
    strb     w2, [sp, #0x1f]
    mov      w8, #0xf2bb
    movk     w8, #0xe4b2, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    adrp     x9, #0x4c4000
    mov      w10, #0x9200
    movk     w10, #0x2eb1, lsl #16
    ldr      w11, [sp, #0xc]
    cmp      w11, w8
    b.eq     #0x3298e8
    cmp      w11, w10
    b.ne     #0x3298d0
    b        #0x3298fc
    ldrsw    x11, [x9, #0xd6c]
    str      x11, [sp, #0x10]
    ldr      x11, [sp]
    str      w10, [x11]
    b        #0x3298d0
    ldr      x8, [sp, #0x10]
    ldrb     w9, [sp, #0x1f]
    strb     w9, [x0, x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupPill wclgTitle] IMP=0x329910 bounds=0x329910-0x329978
loc_329910:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd68]
    str      x8, [sp, #0x18]
    mov      w8, #0x3589
    movk     w8, #0x5a5c, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x62ef
    movk     w9, #0xb059, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x329954
    cmp      w10, w9
    b.ne     #0x32993c
    b        #0x32996c
    ldr      x10, [sp, #0x18]
    ldr      x10, [x0, x10]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x32993c
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupPill setWclgTitle:] IMP=0x329978 bounds=0x329978-0x3299DC
loc_329978:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd68]
    str      w8, [sp, #0x1c]
    mov      w8, #0x7bff
    movk     w8, #0x7828, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x339
    movk     w9, #0x2794, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x3299bc
    cmp      w10, w9
    b.ne     #0x3299a4
    b        #0x3299d0
    ldrsw    x10, [sp, #0x1c]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x3299a4
    ldr      x3, [sp, #0x10]
    add      sp, sp, #0x20
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGroupPill .cxx_destruct] IMP=0x3299DC bounds=0x3299DC-0x329AA8
loc_3299DC:
    sub      sp, sp, #0x40
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd68]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd60]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd5c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd78]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    mov      w8, #0xabc5
    movk     w8, #0x942, lsl #16
    str      w8, [sp, #0x14]
    add      x9, sp, #0x14
    str      x9, [sp, #8]
    adrp     x9, #0x4c4000
    mov      w10, #0x7e85
    movk     w10, #0xf496, lsl #16
    ldr      w11, [sp, #0x14]
    cmp      w11, w8
    b.eq     #0x329a78
    cmp      w11, w10
    b.ne     #0x329a60
    b        #0x329a90
    ldrsw    x11, [x9, #0xd74]
    add      x11, x19, x11
    str      x11, [sp, #0x18]
    ldr      x11, [sp, #8]
    str      w10, [x11]
    b        #0x329a60
    ldr      x0, [sp, #0x18]
    mov      x1, #0
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    add      sp, sp, #0x40
    b        #0x461cfc // _objc_storeStrong
