// Exact ARM64 listing for WCLGColorPickerViewController

// -[WCLGColorPickerViewController initOutgoing:handler:] IMP=0x24B840 bounds=0x24B840-0x24B850
loc_24B840:
    eor      w2, w2, #1
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x880]
    b        #0x461c6c // _objc_msgSend

// -[WCLGColorPickerViewController initPurpose:handler:] IMP=0x24B850 bounds=0x24B850-0x24B988
loc_24B850:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x19, x3
    mov      x20, x2
    mov      x21, x0
    mov      w22, #0x6328
    movk     w22, #0x66be, lsl #16
    mov      x0, x3
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x768]
    stp      x21, x8, [sp, #0x20]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb78]
    add      x0, sp, #0x20
    bl       #0x461c84 // _objc_msgSendSuper2
    str      x0, [sp, #0x18]
    mov      w21, #0x1055
    movk     w21, #0xa317, lsl #16
    add      x8, sp, #0x14
    mov      w23, #0xc23d
    movk     w23, #0x68e4, lsl #16
    str      w21, [sp, #0x14]
    str      x8, [sp, #8]
    adrp     x24, #0x4c4000
    adrp     x25, #0x4c4000
    adrp     x26, #0x4be000
    adrp     x27, #0x4c4000
    ldr      w8, [sp, #0x14]
    cmp      w8, w21
    b.eq     #0x24b944
    cmp      w8, w23
    b.eq     #0x24b8f8
    cmp      w8, w22
    b.ne     #0x24b8d8
    b        #0x24b95c
    ldrsw    x8, [x24, #0xa74]
    ldr      x9, [sp, #0x18]
    str      x20, [x9, x8]
    cmp      x20, #0
    cset     w8, eq
    ldrsw    x10, [x25, #0xa78]
    strb     w8, [x9, x10]
    ldr      x1, [x26, #0x900]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldrsw    x9, [x27, #0xa7c]
    ldr      x10, [sp, #0x18]
    ldr      x8, [x10, x9]
    str      x0, [x10, x9]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w22, [x8]
    b        #0x24b8d8
    ldr      x8, [sp, #0x18]
    cmp      x8, #0
    csel     w8, w22, w23, eq
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x24b8d8
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x18]
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    ret      

// -[WCLGColorPickerViewController initPurpose:lightMode:darkMode:handler:] IMP=0x24B988 bounds=0x24B988-0x24BBE0
loc_24B988:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x19, x5
    str      x4, [sp]
    mov      x21, x3
    mov      x22, x2
    mov      x23, x0
    mov      w24, #0x17bc
    movk     w24, #0x2aca, lsl #16
    mov      w25, #0x18a3
    movk     w25, #0x267b, lsl #16
    mov      x0, x5
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x768]
    stp      x23, x8, [sp, #0x20]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb78]
    add      x0, sp, #0x20
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      w23, #0xf3f5
    movk     w23, #0xd36b, lsl #16
    str      x0, [sp, #0x18]
    add      x8, sp, #0x14
    mov      w26, #0x17bb
    movk     w26, #0x2aca, lsl #16
    str      w23, [sp, #0x14]
    mov      w27, #0x73a2
    movk     w27, #0x71ec, lsl #16
    mov      w28, #0x4e9d
    movk     w28, #0xeae1, lsl #16
    str      x8, [sp, #8]
    ldr      w8, [sp, #0x14]
    cmp      w8, w26
    b.gt     #0x24ba9c
    cmp      w8, w23
    b.eq     #0x24bb40
    cmp      w8, w28
    b.eq     #0x24bb50
    cmp      w8, w25
    b.ne     #0x24ba20
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb38]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb3c]
    eor      w8, w8, w9
    mov      w9, #0x2000
    movk     w9, #0x409, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x8c
    eor      w8, w8, w9
    mov      w9, #0x21ac
    movk     w9, #0xd4d, lsl #16
    and      w20, w8, w9
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      w8, #0xb903
    movk     w8, #0x4438, lsl #16
    cmp      w20, w8
    mov      w8, #0xa7fc
    movk     w8, #0x437b, lsl #16
    csel     w8, w8, w25, lo
    b        #0x24bba0
    cmp      w8, w24
    b.eq     #0x24bb64
    cmp      w8, w27
    b.ne     #0x24bbac
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa74]
    ldr      x9, [sp, #0x18]
    str      x22, [x9, x8]
    cmp      x22, #0
    cset     w8, eq
    adrp     x10, #0x4c4000
    ldrsw    x10, [x10, #0xa78]
    strb     w8, [x9, x10]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa80]
    str      x21, [x9, x8]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa84]
    ldr      x10, [sp]
    str      x10, [x9, x8]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa88]
    mov      w10, #1
    strb     w10, [x9, x8]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa8c]
    strb     wzr, [x9, x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0xa90]
    ldr      x10, [sp, #0x18]
    ldr      x8, [x10, x9]
    str      x0, [x10, x9]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w24, [x8]
    b        #0x24ba20
    ldr      x8, [sp, #0x18]
    cmp      x8, #0
    csel     w8, w24, w27, eq
    b        #0x24bba0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w25, [x8]
    b        #0x24ba20
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb30]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb34]
    udiv     w8, w8, w9
    mov      w9, #0x7eb3
    movk     w9, #0xb73f, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x7ff7
    movk     w9, #0xb77f, lsl #16
    and      w8, w8, w9
    mov      w9, #0xe0a4
    movk     w9, #0xe06b, lsl #16
    cmp      w8, w9
    csel     w8, w25, w28, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x24ba20
    mov      w9, #0xa7fc
    movk     w9, #0x437b, lsl #16
    cmp      w8, w9
    b.ne     #0x24ba20
    ldr      x0, [sp, #0x18]
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    ret      

// -[WCLGColorPickerViewController initSMSBottomBarIconLightMode:darkMode:handler:] IMP=0x24BBE0 bounds=0x24BBE0-0x24BBFC
loc_24BBE0:
    mov      x5, x4
    mov      x4, x3
    mov      x3, x2
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x888]
    mov      w2, #0xa
    b        #0x461c6c // _objc_msgSend

// -[WCLGColorPickerViewController initTitle:initialMode:handler:] IMP=0x24BBFC bounds=0x24BBFC-0x24BD8C
loc_24BBFC:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x20, x4
    mov      x21, x3
    mov      x19, x2
    mov      x22, x0
    mov      w23, #0xa209
    movk     w23, #0xa436, lsl #16
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x768]
    stp      x22, x8, [sp, #0x20]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb78]
    add      x0, sp, #0x20
    bl       #0x461c84 // _objc_msgSendSuper2
    str      x0, [sp, #0x18]
    mov      w24, #0x5da8
    movk     w24, #0xd90e, lsl #16
    add      x8, sp, #0x14
    mov      w25, #0xa324
    movk     w25, #0xedac, lsl #16
    str      w24, [sp, #0x14]
    str      x8, [sp, #8]
    mov      w28, #1
    adrp     x26, #0x4c4000
    adrp     x27, #0x4c4000
    ldr      w8, [sp, #0x14]
    cmp      w8, w24
    b.eq     #0x24bd40
    cmp      w8, w25
    b.eq     #0x24bcac
    cmp      w8, w23
    b.ne     #0x24bc8c
    b        #0x24bd58
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa74]
    ldr      x9, [sp, #0x18]
    str      xzr, [x9, x8]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa78]
    strb     wzr, [x9, x8]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x900]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0xa94]
    ldr      x10, [sp, #0x18]
    ldr      x8, [x10, x9]
    str      x0, [x10, x9]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa98]
    ldr      x9, [sp, #0x18]
    strb     w28, [x9, x8]
    ldrsw    x8, [x26, #0xa9c]
    str      x21, [x9, x8]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    ldrsw    x9, [x27, #0xa7c]
    ldr      x10, [sp, #0x18]
    ldr      x8, [x10, x9]
    str      x0, [x10, x9]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w23, [x8]
    b        #0x24bc8c
    ldr      x8, [sp, #0x18]
    cmp      x8, #0
    csel     w8, w23, w25, eq
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x24bc8c
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x18]
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    ret      

// -[WCLGColorPickerViewController initTitle:lightMode:darkMode:handler:] IMP=0x24BD8C bounds=0x24BD8C-0x24BF38
loc_24BD8C:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x20, x5
    mov      x21, x4
    mov      x22, x3
    mov      x19, x2
    mov      x23, x0
    mov      w24, #0x9a7a
    movk     w24, #0x6dc0, lsl #16
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x768]
    stp      x23, x8, [sp, #0x20]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb78]
    add      x0, sp, #0x20
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      w25, #0x6172
    movk     w25, #0x77e, lsl #16
    str      x0, [sp, #0x18]
    add      x8, sp, #0x14
    mov      w26, #0x7769
    movk     w26, #0x2c0e, lsl #16
    str      w25, [sp, #0x14]
    str      x8, [sp, #8]
    adrp     x27, #0x4c4000
    adrp     x28, #0x4c4000
    ldr      w8, [sp, #0x14]
    cmp      w8, w25
    b.eq     #0x24beec
    cmp      w8, w26
    b.eq     #0x24be3c
    cmp      w8, w24
    b.ne     #0x24be1c
    b        #0x24bf04
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa74]
    ldr      x9, [sp, #0x18]
    str      xzr, [x9, x8]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa78]
    strb     wzr, [x9, x8]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x900]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0xa94]
    ldr      x10, [sp, #0x18]
    ldr      x8, [x10, x9]
    str      x0, [x10, x9]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa80]
    ldr      x9, [sp, #0x18]
    str      x22, [x9, x8]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa84]
    str      x21, [x9, x8]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa88]
    mov      w10, #1
    strb     w10, [x9, x8]
    ldrsw    x8, [x27, #0xa8c]
    strb     wzr, [x9, x8]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    ldrsw    x9, [x28, #0xa90]
    ldr      x10, [sp, #0x18]
    ldr      x8, [x10, x9]
    str      x0, [x10, x9]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w24, [x8]
    b        #0x24be1c
    ldr      x8, [sp, #0x18]
    cmp      x8, #0
    csel     w8, w24, w26, eq
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x24be1c
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x18]
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    ret      

// -[WCLGColorPickerViewController isDarkMode] IMP=0x24BF38 bounds=0x24BF38-0x24BF88
loc_24BF38:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3f8]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #2
    cset     w20, eq
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    ret      

// -[WCLGColorPickerViewController titleForPurpose] IMP=0x24BF88 bounds=0x24BF88-0x24CEB0
loc_24BF88:
    sub      sp, sp, #0xb0
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      x21, x0
    mov      w23, #0xeeb0
    movk     w23, #0xfade, lsl #16
    mov      w20, #0x232
    movk     w20, #0xd594, lsl #16
    mov      w25, #0x64d4
    movk     w25, #0xc48e, lsl #16
    adrp     x8, #0x57f000
    add      x8, x8, #0x9a8
    ldar     w8, [x8]
    str      w8, [sp, #0x4c]
    mov      w8, #0x4a73
    movk     w8, #0x528b, lsl #16
    str      w8, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w26, #0xb82
    movk     w26, #0xff42, lsl #16
    mov      w22, #0x9dd2
    movk     w22, #0xd145, lsl #16
    mov      w24, #0xc0d6
    movk     w24, #0xe4fa, lsl #16
    mov      w27, #0x7fce
    movk     w27, #0x481e, lsl #16
    mov      w28, #0x907e
    movk     w28, #0x1f56, lsl #16
    mov      w19, #0xf3ff
    movk     w19, #0x64e4, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w26
    b.gt     #0x24c080
    cmp      w8, w22
    b.gt     #0x24c0ec
    mov      w9, #0x3fa7
    movk     w9, #0xb1cc, lsl #16
    cmp      w8, w9
    b.le     #0x24c314
    mov      w9, #0x64d3
    movk     w9, #0xc48e, lsl #16
    cmp      w8, w9
    b.le     #0x24c9c0
    mov      w9, #0x6ea
    movk     w9, #0xc87a, lsl #16
    cmp      w8, w9
    b.le     #0x24ca24
    mov      w9, #0x6eb
    movk     w9, #0xc87a, lsl #16
    cmp      w8, w9
    b.eq     #0x24ca58
    mov      w9, #0xd52f
    movk     w9, #0xcbd8, lsl #16
    cmp      w8, w9
    b.eq     #0x24ca0c
    b        #0x24c018
    cmp      w8, w27
    b.gt     #0x24c14c
    cmp      w8, w28
    b.gt     #0x24c264
    mov      w9, #0x558e
    movk     w9, #0xcf9, lsl #16
    cmp      w8, w9
    b.gt     #0x24c3e0
    mov      w9, #0xb83
    movk     w9, #0xff42, lsl #16
    cmp      w8, w9
    b.eq     #0x24cacc
    mov      w9, #0xa1f0
    movk     w9, #0x587, lsl #16
    cmp      w8, w9
    b.eq     #0x24ccd8
    mov      w9, #0xb9c6
    movk     w9, #0x603, lsl #16
    cmp      w8, w9
    b.ne     #0x24c018
    ldr      x8, [sp, #0x28]
    cmp      x8, #2
    mov      w8, #0x19b3
    movk     w8, #0x79a5, lsl #16
    mov      w9, #0x7f7a
    movk     w9, #0x55d8, lsl #16
    b        #0x24ce54
    cmp      w8, w24
    b.gt     #0x24c20c
    mov      w9, #0x231
    movk     w9, #0xd594, lsl #16
    cmp      w8, w9
    b.gt     #0x24c370
    mov      w9, #0x9dd3
    movk     w9, #0xd145, lsl #16
    cmp      w8, w9
    b.eq     #0x24c24c
    mov      w9, #0x74a5
    movk     w9, #0xd2c9, lsl #16
    cmp      w8, w9
    b.eq     #0x24cc50
    mov      w9, #0x2bf4
    movk     w9, #0xd428, lsl #16
    cmp      w8, w9
    b.ne     #0x24c018
    ldr      x8, [sp, #8]
    str      w25, [x8]
    adrp     x8, #0x522000
    add      x8, x8, #0x2c0
    str      x8, [sp, #0x18]
    b        #0x24c018
    cmp      w8, w19
    b.gt     #0x24c2b8
    mov      w9, #0x4a72
    movk     w9, #0x528b, lsl #16
    cmp      w8, w9
    b.gt     #0x24c874
    mov      w9, #0x7fcf
    movk     w9, #0x481e, lsl #16
    cmp      w8, w9
    b.eq     #0x24cae8
    mov      w9, #0x67c4
    movk     w9, #0x4c38, lsl #16
    cmp      w8, w9
    b.eq     #0x24ccf0
    mov      w9, #0x7ca5
    movk     w9, #0x4e41, lsl #16
    cmp      w8, w9
    b.ne     #0x24c018
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb48]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb4c]
    eor      w8, w8, w9
    mov      w9, #0x1410
    movk     w9, #0xa909, lsl #16
    and      w8, w8, w9
    mov      w9, #0x8430
    movk     w9, #0x2109, lsl #16
    eor      w20, w8, w9
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x898]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x3f]
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0x8a0]
    str      x8, [sp, #0x30]
    mov      w8, #0xb6e
    movk     w8, #0xd72b, lsl #16
    cmp      w20, w8
    mov      w20, #0x232
    movk     w20, #0xd594, lsl #16
    mov      w8, #0x131
    movk     w8, #0x3ce3, lsl #16
    mov      w9, #0x675c
    movk     w9, #0xa8be, lsl #16
    csel     w8, w9, w8, lo
    b        #0x24ce78
    mov      w9, #0xd3a6
    movk     w9, #0xf195, lsl #16
    cmp      w8, w9
    b.gt     #0x24c3a4
    mov      w9, #0xc0d7
    movk     w9, #0xe4fa, lsl #16
    cmp      w8, w9
    b.eq     #0x24ca74
    mov      w9, #0x228e
    movk     w9, #0xe6ca, lsl #16
    cmp      w8, w9
    b.eq     #0x24cc7c
    mov      w9, #0x11b7
    movk     w9, #0xe8ec, lsl #16
    cmp      w8, w9
    b.ne     #0x24c018
    ldr      x8, [sp, #8]
    str      w25, [x8]
    adrp     x8, #0x522000
    add      x8, x8, #0x280
    str      x8, [sp, #0x18]
    b        #0x24c018
    mov      w9, #0x84e9
    movk     w9, #0x39ba, lsl #16
    cmp      w8, w9
    b.gt     #0x24c8bc
    mov      w9, #0x907f
    movk     w9, #0x1f56, lsl #16
    cmp      w8, w9
    b.eq     #0x24cb14
    mov      w9, #0xbf65
    movk     w9, #0x26b8, lsl #16
    cmp      w8, w9
    b.eq     #0x24cd0c
    mov      w9, #0xb3e1
    movk     w9, #0x3481, lsl #16
    cmp      w8, w9
    b.ne     #0x24c018
    ldr      x8, [sp, #8]
    mov      w9, #0xcf1d
    movk     w9, #0x75b5, lsl #16
    str      w9, [x8]
    b        #0x24c018
    mov      w9, #0xcf1c
    movk     w9, #0x75b5, lsl #16
    cmp      w8, w9
    b.gt     #0x24c928
    mov      w9, #0xf400
    movk     w9, #0x64e4, lsl #16
    cmp      w8, w9
    b.eq     #0x24cb30
    mov      w9, #0xb256
    movk     w9, #0x6987, lsl #16
    cmp      w8, w9
    b.eq     #0x24cd88
    mov      w9, #0xd83a
    movk     w9, #0x6fb3, lsl #16
    cmp      w8, w9
    b.ne     #0x24c018
    ldr      x8, [sp, #0x28]
    cmp      x8, #5
    mov      w8, #0x30ff
    movk     w8, #0x9f12, lsl #16
    mov      w9, #0x19b3
    movk     w9, #0x79a5, lsl #16
    b        #0x24cd80
    mov      w9, #0x30fe
    movk     w9, #0x9f12, lsl #16
    cmp      w8, w9
    b.gt     #0x24c974
    mov      w9, #0xb365
    movk     w9, #0x85bf, lsl #16
    cmp      w8, w9
    b.eq     #0x24cc3c
    mov      w9, #0x39c6
    movk     w9, #0x8a33, lsl #16
    cmp      w8, w9
    b.eq     #0x24ce0c
    mov      w9, #0xcaa6
    movk     w9, #0x8eea, lsl #16
    cmp      w8, w9
    b.ne     #0x24c018
    ldr      x8, [sp, #0x20]
    cmp      x8, #8
    mov      w8, #0x5516
    movk     w8, #0x5845, lsl #16
    mov      w9, #0xa1f0
    movk     w9, #0x587, lsl #16
    b        #0x24ccd0
    cmp      w8, w20
    b.eq     #0x24ca90
    mov      w9, #0x84c2
    movk     w9, #0xd6df, lsl #16
    cmp      w8, w9
    b.eq     #0x24cc88
    mov      w9, #0x2073
    movk     w9, #0xdf36, lsl #16
    cmp      w8, w9
    b.ne     #0x24c018
    adrp     x8, #0x4a2000
    add      x8, x8, #0xf58
    b        #0x24ca98
    mov      w9, #0xd3a7
    movk     w9, #0xf195, lsl #16
    cmp      w8, w9
    b.eq     #0x24cab0
    mov      w9, #0x51fe
    movk     w9, #0xfa1f, lsl #16
    cmp      w8, w9
    b.eq     #0x24cca0
    cmp      w8, w23
    b.ne     #0x24c018
    ldr      x8, [sp, #8]
    mov      w9, #0x84ea
    movk     w9, #0x39ba, lsl #16
    str      w9, [x8]
    b        #0x24c018
    mov      w9, #0x558f
    movk     w9, #0xcf9, lsl #16
    cmp      w8, w9
    b.eq     #0x24cb4c
    mov      w9, #0x90c6
    movk     w9, #0x1053, lsl #16
    cmp      w8, w9
    b.eq     #0x24cda4
    mov      w9, #0x642f
    movk     w9, #0x129f, lsl #16
    cmp      w8, w9
    b.ne     #0x24c018
    adrp     x9, #0x522000
    add      x9, x9, #0xe0
    ldrh     w8, [x9]
    mov      w10, #0xabb1
    eor      w8, w8, w10
    adrp     x10, #0x522000
    add      x10, x10, #0x100
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0xea0e
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0xae1
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w11, #0x1a1d
    eor      w8, w8, w11
    strh     w8, [x10, #6]
    ldrh     w8, [x9, #8]
    mov      w11, #0x2953
    eor      w8, w8, w11
    strh     w8, [x10, #8]
    ldrh     w8, [x9, #0xa]
    mov      w11, #0x1486
    eor      w8, w8, w11
    strh     w8, [x10, #0xa]
    ldrh     w8, [x9, #0xc]
    mov      w11, #0xa8f4
    eor      w8, w8, w11
    strh     w8, [x10, #0xc]
    ldrh     w8, [x9, #0xe]
    mov      w11, #0x431d
    eor      w8, w8, w11
    strh     w8, [x10, #0xe]
    ldrh     w8, [x9, #0x10]
    mov      w11, #0x5faa
    eor      w8, w8, w11
    strh     w8, [x10, #0x10]
    ldrh     w8, [x9, #0x12]
    mov      w11, #0x7f2f
    eor      w8, w8, w11
    strh     w8, [x10, #0x12]
    ldrh     w8, [x9, #0x14]
    mov      w9, #0x3fb8
    eor      w8, w8, w9
    strh     w8, [x10, #0x14]
    adrp     x9, #0x522000
    add      x9, x9, #0xc2
    ldrh     w8, [x9]
    mov      w10, #0x1c9d
    eor      w8, w8, w10
    adrp     x10, #0x522000
    add      x10, x10, #0xce
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0x8188
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0x5317
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w11, #0x4a09
    eor      w8, w8, w11
    strh     w8, [x10, #6]
    ldrh     w8, [x9, #8]
    mov      w11, #0x958b
    eor      w8, w8, w11
    strh     w8, [x10, #8]
    ldrh     w8, [x9, #0xa]
    mov      w9, #0xb90f
    eor      w8, w8, w9
    strh     w8, [x10, #0xa]
    adrp     x9, #0x522000
    add      x9, x9, #0x90
    ldrh     w8, [x9]
    mov      w10, #0xd99a
    eor      w8, w8, w10
    adrp     x10, #0x522000
    add      x10, x10, #0xb0
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0xdbef
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0xb6d6
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w11, #0xe051
    eor      w8, w8, w11
    strh     w8, [x10, #6]
    ldrh     w8, [x9, #8]
    mov      w11, #0xeb3f
    eor      w8, w8, w11
    strh     w8, [x10, #8]
    ldrh     w8, [x9, #0xa]
    mov      w11, #0xdcd9
    eor      w8, w8, w11
    strh     w8, [x10, #0xa]
    ldrh     w8, [x9, #0xc]
    mov      w11, #0x8ba9
    eor      w8, w8, w11
    strh     w8, [x10, #0xc]
    ldrh     w8, [x9, #0xe]
    mov      w11, #0x8da0
    eor      w8, w8, w11
    strh     w8, [x10, #0xe]
    ldrh     w8, [x9, #0x10]
    mov      w9, #0x3c9e
    eor      w8, w8, w9
    strh     w8, [x10, #0x10]
    adrp     x9, #0x522000
    add      x9, x9, #0x50
    ldrh     w8, [x9]
    mov      w10, #0x51ea
    eor      w8, w8, w10
    adrp     x10, #0x522000
    add      x10, x10, #0x70
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0x6368
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0xa28e
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w11, #0x2c2b
    eor      w8, w8, w11
    strh     w8, [x10, #6]
    ldrh     w8, [x9, #8]
    mov      w11, #0x7c07
    eor      w8, w8, w11
    strh     w8, [x10, #8]
    ldrh     w8, [x9, #0xa]
    mov      w11, #0x1a68
    eor      w8, w8, w11
    strh     w8, [x10, #0xa]
    ldrh     w8, [x9, #0xc]
    mov      w11, #0x4bdc
    eor      w8, w8, w11
    strh     w8, [x10, #0xc]
    ldrh     w8, [x9, #0xe]
    mov      w11, #0xca2a
    eor      w8, w8, w11
    strh     w8, [x10, #0xe]
    ldrh     w8, [x9, #0x10]
    mov      w11, #0x10ff
    eor      w8, w8, w11
    strh     w8, [x10, #0x10]
    ldrh     w8, [x9, #0x12]
    mov      w11, #0x98d
    eor      w8, w8, w11
    strh     w8, [x10, #0x12]
    ldrh     w8, [x9, #0x14]
    mov      w9, #0xa6ab
    eor      w8, w8, w9
    strh     w8, [x10, #0x14]
    adrp     x9, #0x522000
    add      x9, x9, #0x10
    ldrh     w8, [x9]
    mov      w10, #0xfd04
    eor      w8, w8, w10
    adrp     x10, #0x522000
    add      x10, x10, #0x30
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0x9c56
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0xcad1
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w11, #0x301f
    eor      w8, w8, w11
    strh     w8, [x10, #6]
    ldrh     w8, [x9, #8]
    mov      w11, #0x52fd
    eor      w8, w8, w11
    strh     w8, [x10, #8]
    ldrh     w8, [x9, #0xa]
    mov      w11, #0xa1d6
    eor      w8, w8, w11
    strh     w8, [x10, #0xa]
    ldrh     w8, [x9, #0xc]
    mov      w11, #0x327c
    eor      w8, w8, w11
    strh     w8, [x10, #0xc]
    ldrh     w8, [x9, #0xe]
    mov      w11, #0x32c
    eor      w8, w8, w11
    strh     w8, [x10, #0xe]
    ldrh     w8, [x9, #0x10]
    mov      w9, #0x398d
    eor      w8, w8, w9
    strh     w8, [x10, #0x10]
    adrp     x9, #0x521000
    add      x9, x9, #0xff2
    ldrh     w8, [x9]
    mov      w10, #0xf11c
    eor      w8, w8, w10
    adrp     x10, #0x522000
    add      x10, x10, #0
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0x1928
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0x33bf
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w11, #0xcbb9
    eor      w8, w8, w11
    strh     w8, [x10, #6]
    ldrh     w8, [x9, #8]
    mov      w11, #0x9a7b
    eor      w8, w8, w11
    strh     w8, [x10, #8]
    ldrh     w8, [x9, #0xa]
    mov      w11, #0x57cc
    eor      w8, w8, w11
    strh     w8, [x10, #0xa]
    ldrh     w8, [x9, #0xc]
    mov      w9, #0x995e
    eor      w8, w8, w9
    strh     w8, [x10, #0xc]
    adrp     x9, #0x521000
    add      x9, x9, #0xfc0
    ldrh     w8, [x9]
    mov      w10, #0xbc97
    eor      w8, w8, w10
    adrp     x10, #0x521000
    add      x10, x10, #0xfe0
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0xeb5e
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0xe6a3
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w11, #0x3ced
    eor      w8, w8, w11
    strh     w8, [x10, #6]
    ldrh     w8, [x9, #8]
    mov      w11, #0xf3ad
    eor      w8, w8, w11
    strh     w8, [x10, #8]
    ldrh     w8, [x9, #0xa]
    mov      w11, #0x8487
    eor      w8, w8, w11
    strh     w8, [x10, #0xa]
    ldrh     w8, [x9, #0xc]
    mov      w11, #0x280
    eor      w8, w8, w11
    strh     w8, [x10, #0xc]
    ldrh     w8, [x9, #0xe]
    mov      w11, #0xc290
    eor      w8, w8, w11
    strh     w8, [x10, #0xe]
    ldrh     w8, [x9, #0x10]
    mov      w9, #0xd114
    eor      w8, w8, w9
    strh     w8, [x10, #0x10]
    ldr      x8, [sp, #8]
    mov      w9, #0xbf65
    movk     w9, #0x26b8, lsl #16
    str      w9, [x8]
    b        #0x24c018
    mov      w9, #0x4a73
    movk     w9, #0x528b, lsl #16
    cmp      w8, w9
    b.eq     #0x24cbac
    mov      w9, #0x7f7a
    movk     w9, #0x55d8, lsl #16
    cmp      w8, w9
    b.eq     #0x24ca0c
    mov      w9, #0x5516
    movk     w9, #0x5845, lsl #16
    cmp      w8, w9
    b.ne     #0x24c018
    ldr      x8, [sp, #8]
    str      w25, [x8]
    adrp     x8, #0x522000
    add      x8, x8, #0x240
    str      x8, [sp, #0x18]
    b        #0x24c018
    mov      w9, #0x84ea
    movk     w9, #0x39ba, lsl #16
    cmp      w8, w9
    b.eq     #0x24cbc8
    mov      w9, #0x131
    movk     w9, #0x3ce3, lsl #16
    cmp      w8, w9
    b.eq     #0x24cdc4
    mov      w9, #0x2822
    movk     w9, #0x43e9, lsl #16
    cmp      w8, w9
    b.ne     #0x24c018
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb60]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb64]
    and      w8, w8, w9
    mov      w9, #0xfa06
    movk     w9, #0x41c, lsl #16
    add      w8, w8, w9
    mov      w9, #0xe12e
    movk     w9, #0x4b53, lsl #16
    cmp      w8, w9
    mov      w8, #0x228e
    movk     w8, #0xe6ca, lsl #16
    csel     w8, w23, w8, lo
    b        #0x24ce78
    mov      w9, #0xcf1d
    movk     w9, #0x75b5, lsl #16
    cmp      w8, w9
    b.eq     #0x24cbe0
    mov      w9, #0x19b3
    movk     w9, #0x79a5, lsl #16
    cmp      w8, w9
    b.eq     #0x24cde8
    mov      w9, #0xc385
    movk     w9, #0x7c2f, lsl #16
    cmp      w8, w9
    b.ne     #0x24c018
    ldr      x8, [sp, #0x20]
    cmp      x8, #4
    mov      w8, #0x5fbb
    movk     w8, #0xb8de, lsl #16
    mov      w9, #0xb256
    movk     w9, #0x6987, lsl #16
    b        #0x24cdbc
    mov      w9, #0x30ff
    movk     w9, #0x9f12, lsl #16
    cmp      w8, w9
    b.eq     #0x24ca18
    mov      w9, #0x675c
    movk     w9, #0xa8be, lsl #16
    cmp      w8, w9
    b.eq     #0x24ce5c
    mov      w9, #0x19bc
    movk     w9, #0xae29, lsl #16
    cmp      w8, w9
    b.ne     #0x24c018
    ldr      x8, [sp, #0x28]
    cmp      x8, #9
    mov      w8, #0x6eb
    movk     w8, #0xc87a, lsl #16
    mov      w9, #0xd83a
    movk     w9, #0x6fb3, lsl #16
    b        #0x24ccd0
    mov      w9, #0x3fa8
    movk     w9, #0xb1cc, lsl #16
    cmp      w8, w9
    b.eq     #0x24ccb8
    mov      w9, #0x5fbb
    movk     w9, #0xb8de, lsl #16
    cmp      w8, w9
    b.eq     #0x24ca18
    mov      w9, #0x63b2
    movk     w9, #0xc260, lsl #16
    cmp      w8, w9
    b.ne     #0x24c018
    ldr      x8, [sp, #0x20]
    cmp      x8, #3
    mov      w8, #0xc385
    movk     w8, #0x7c2f, lsl #16
    mov      w9, #0xd3a7
    movk     w9, #0xf195, lsl #16
    b        #0x24ccd0
    adrp     x8, #0x4a2000
    add      x8, x8, #0xf60
    b        #0x24ca98
    adrp     x8, #0x4a2000
    add      x8, x8, #0xf68
    b        #0x24ca98
    mov      w9, #0x5fa0
    movk     w9, #0xc509, lsl #16
    cmp      w8, w9
    b.ne     #0x24ce84
    ldr      x1, [sp, #0x30]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x28]
    ldr      x8, [sp, #8]
    mov      w9, #0x3fa8
    movk     w9, #0xb1cc, lsl #16
    str      w9, [x8]
    b        #0x24c018
    ldr      x8, [sp, #0x28]
    cmp      x8, #0xa
    mov      w8, #0x7fcf
    movk     w8, #0x481e, lsl #16
    mov      w9, #0x9dd3
    movk     w9, #0xd145, lsl #16
    b        #0x24ccd0
    ldr      x8, [sp, #0x20]
    cmp      x8, #9
    mov      w8, #0x74a5
    movk     w8, #0xd2c9, lsl #16
    mov      w9, #0x907f
    movk     w9, #0x1f56, lsl #16
    b        #0x24cdbc
    adrp     x8, #0x4a2000
    add      x8, x8, #0xf50
    ldr      x0, [x8]
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp, #8]
    str      w25, [x8]
    str      x0, [sp, #0x18]
    b        #0x24c018
    ldr      x8, [sp, #0x20]
    cmp      x8, #2
    mov      w8, #0xd52f
    movk     w8, #0xcbd8, lsl #16
    mov      w9, #0x51fe
    movk     w9, #0xfa1f, lsl #16
    b        #0x24ccd0
    ldr      x8, [sp, #0x20]
    cmp      x8, #6
    mov      w8, #0x63b2
    movk     w8, #0xc260, lsl #16
    mov      w9, #0xc0d7
    movk     w9, #0xe4fa, lsl #16
    b        #0x24cdbc
    ldr      x8, [sp, #0x28]
    cmp      x8, #0xc
    mov      w8, #0x19b3
    movk     w8, #0x79a5, lsl #16
    csel     w8, w25, w8, lt
    ldr      x9, [sp, #8]
    str      w8, [x9]
    adrp     x8, #0x522000
    add      x8, x8, #0x180
    str      x8, [sp, #0x18]
    b        #0x24c018
    ldr      x8, [sp, #0x20]
    cmp      x8, #0xa
    mov      w8, #0x558f
    movk     w8, #0xcf9, lsl #16
    mov      w9, #0xf400
    movk     w9, #0x64e4, lsl #16
    b        #0x24cdbc
    ldr      x8, [sp, #0x20]
    cmp      x8, #0xb
    mov      w8, #0xb365
    movk     w8, #0x85bf, lsl #16
    mov      w9, #0x2822
    movk     w9, #0x43e9, lsl #16
    b        #0x24ccd0
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb50]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb54]
    and      w8, w8, w9
    mov      w9, #0x1e
    movk     w9, #0xdd6, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x4821
    movk     w9, #0xe58b, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3e
    mov      w9, #0xe6d6
    movk     w9, #0x672d, lsl #16
    add      w8, w8, w9
    mov      w9, #0x7ca9
    movk     w9, #0x80e1, lsl #16
    cmp      w8, w9
    mov      w8, #0xcf1d
    movk     w8, #0x75b5, lsl #16
    mov      w9, #0xb3e1
    movk     w9, #0x3481, lsl #16
    csel     w8, w9, w8, hi
    b        #0x24ce78
    ldr      w8, [sp, #0x4c]
    cmp      w8, #0
    mov      w8, #0xbf65
    movk     w8, #0x26b8, lsl #16
    mov      w9, #0x642f
    movk     w9, #0x129f, lsl #16
    b        #0x24ce54
    ldr      x8, [sp, #8]
    str      w25, [x8]
    adrp     x8, #0x522000
    add      x8, x8, #0x1c0
    str      x8, [sp, #0x18]
    b        #0x24c018
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb58]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb5c]
    mul      w8, w8, w9
    mov      w9, #0x99e6
    movk     w9, #0x163f, lsl #16
    mov      w10, #0xf5f8
    movk     w10, #0x3b3f, lsl #16
    madd     w8, w8, w9, w10
    mov      w9, #0xfae1
    movk     w9, #0x9a56, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3f
    mov      w9, #0xc920
    movk     w9, #0xb2c1, lsl #16
    cmp      w8, w9
    mov      w8, #0xcf1d
    movk     w8, #0x75b5, lsl #16
    mov      w9, #0x11b7
    movk     w9, #0xe8ec, lsl #16
    csel     w8, w8, w9, hi
    b        #0x24ce78
    ldr      x8, [sp, #0x20]
    cmp      x8, #0xb
    mov      w8, #0x2bf4
    movk     w8, #0xd428, lsl #16
    b        #0x24ccb0
    ldr      x8, [sp, #0x20]
    cmp      x8, #7
    mov      w8, #0xcaa6
    movk     w8, #0x8eea, lsl #16
    csel     w8, w25, w8, lt
    ldr      x9, [sp, #8]
    str      w8, [x9]
    adrp     x8, #0x522000
    add      x8, x8, #0x140
    str      x8, [sp, #0x18]
    b        #0x24c018
    ldr      x8, [sp, #8]
    str      w23, [x8]
    b        #0x24c018
    ldr      x1, [sp, #0x40]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    b        #0x24caa0
    ldr      x8, [sp, #0x20]
    cmp      x8, #1
    mov      w8, #0x2073
    movk     w8, #0xdf36, lsl #16
    csel     w8, w8, w20, eq
    b        #0x24ce78
    ldr      x8, [sp, #0x28]
    cmp      x8, #5
    mov      w8, #0x19bc
    movk     w8, #0xae29, lsl #16
    mov      w9, #0x90c6
    movk     w9, #0x1053, lsl #16
    csel     w8, w9, w8, lt
    b        #0x24ce78
    ldr      x8, [sp, #8]
    str      w25, [x8]
    adrp     x8, #0x522000
    add      x8, x8, #0x200
    str      x8, [sp, #0x18]
    b        #0x24c018
    ldr      x8, [sp, #0x28]
    cmp      x8, #4
    mov      w8, #0x30ff
    movk     w8, #0x9f12, lsl #16
    mov      w9, #0x7f7a
    movk     w9, #0x55d8, lsl #16
    b        #0x24cdbc
    adrp     x8, #0x57f000
    add      x8, x8, #0x9a8
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x890]
    str      x1, [sp, #0x40]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x21
    mov      x21, x0
    mov      x0, x20
    mov      w20, #0x232
    movk     w20, #0xd594, lsl #16
    bl       #0x461c9c // _objc_release
    cmp      x21, #0
    mov      x21, x23
    mov      w23, #0xeeb0
    movk     w23, #0xfade, lsl #16
    mov      w8, #0x39c6
    movk     w8, #0x8a33, lsl #16
    mov      w9, #0x84c2
    movk     w9, #0xd6df, lsl #16
    csel     w8, w8, w9, eq
    b        #0x24ce78
    ldr      x8, [sp, #0x20]
    cmp      x8, #5
    mov      w8, #0xd52f
    movk     w8, #0xcbd8, lsl #16
    mov      w9, #0x5fbb
    movk     w9, #0xb8de, lsl #16
    b        #0x24cdbc
    ldr      x8, [sp, #0x28]
    cmp      x8, #3
    mov      w8, #0xb9c6
    movk     w8, #0x603, lsl #16
    mov      w9, #0x67c4
    movk     w9, #0x4c38, lsl #16
    csel     w8, w8, w9, lt
    b        #0x24ce78
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x898]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    mov      w9, #0x7ca5
    movk     w9, #0x4e41, lsl #16
    str      w9, [x8]
    b        #0x24c018
    ldr      x1, [sp, #0x30]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x20]
    ldr      x8, [sp, #8]
    mov      w9, #0xb83
    movk     w9, #0xff42, lsl #16
    str      w9, [x8]
    b        #0x24c018
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb40]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb44]
    sub      w8, w8, w9
    mov      w9, #0x382f
    movk     w9, #0xf045, lsl #16
    add      w8, w8, w9
    mov      w9, #0x9a
    movk     w9, #0x420a, lsl #16
    and      w8, w8, w9
    mov      w9, #0x7e85
    movk     w9, #0xf5c2, lsl #16
    cmp      w8, w9
    mov      w8, #0x7ca5
    movk     w8, #0x4e41, lsl #16
    mov      w9, #0x131
    movk     w9, #0x3ce3, lsl #16
    csel     w8, w9, w8, eq
    b        #0x24ce78
    ldrb     w8, [sp, #0x3f]
    cmp      w8, #0
    mov      w8, #0x19b3
    movk     w8, #0x79a5, lsl #16
    mov      w9, #0x5fa0
    movk     w9, #0xc509, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x24c018
    cmp      w8, w25
    b.ne     #0x24c018
    ldr      x0, [sp, #0x18]
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    add      sp, sp, #0xb0
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGColorPickerViewController currentMode] IMP=0x24CEB0 bounds=0x24CEB0-0x24DB20
loc_24CEB0:
    sub      sp, sp, #0xc0
    stp      x28, x27, [sp, #0x60]
    stp      x26, x25, [sp, #0x70]
    stp      x24, x23, [sp, #0x80]
    stp      x22, x21, [sp, #0x90]
    stp      x20, x19, [sp, #0xa0]
    stp      x29, x30, [sp, #0xb0]
    add      x29, sp, #0xb0
    mov      x19, x0
    mov      w21, #0xc20d
    movk     w21, #0xffab, lsl #16
    mov      w20, #0xb654
    movk     w20, #0x40e2, lsl #16
    mov      w27, #0xc37a
    movk     w27, #0x2d16, lsl #16
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0x8a8]
    str      x8, [sp, #0x58]
    mov      w8, #0x3519
    movk     w8, #0xe007, lsl #16
    str      w8, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w24, #0xc20c
    movk     w24, #0xffab, lsl #16
    mov      w28, #0xa5cf
    movk     w28, #0xd0fb, lsl #16
    mov      w25, #0x9ad4
    movk     w25, #0xe177, lsl #16
    mov      w23, #0xc379
    movk     w23, #0x2d16, lsl #16
    mov      w22, #0xbfd6
    movk     w22, #0x1da0, lsl #16
    mov      w26, #0xf330
    movk     w26, #0x45ae, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w24
    b.gt     #0x24cfac
    cmp      w8, w28
    b.gt     #0x24d008
    mov      w9, #0x2319
    movk     w9, #0xae93, lsl #16
    cmp      w8, w9
    b.gt     #0x24d114
    mov      w9, #0x4505
    movk     w9, #0xa012, lsl #16
    cmp      w8, w9
    b.gt     #0x24d340
    mov      w9, #0xd12e
    movk     w9, #0x842e, lsl #16
    cmp      w8, w9
    b.eq     #0x24d7fc
    mov      w9, #0x9dbc
    movk     w9, #0x8b65, lsl #16
    cmp      w8, w9
    b.eq     #0x24d6c4
    mov      w9, #0x70d2
    movk     w9, #0x944f, lsl #16
    cmp      w8, w9
    b.ne     #0x24cf3c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8b0]
    b        #0x24d6cc
    cmp      w8, w23
    b.le     #0x24d05c
    cmp      w8, w26
    b.gt     #0x24d0b8
    mov      w9, #0xd584
    movk     w9, #0x3b1a, lsl #16
    cmp      w8, w9
    b.gt     #0x24d29c
    cmp      w8, w27
    b.eq     #0x24d618
    mov      w9, #0xa4c7
    movk     w9, #0x3174, lsl #16
    cmp      w8, w9
    b.eq     #0x24d548
    mov      w9, #0xbf94
    movk     w9, #0x3255, lsl #16
    cmp      w8, w9
    b.ne     #0x24cf3c
    adrp     x8, #0x4a3000
    add      x8, x8, #0xcf8
    ldr      x20, [x8]
    bl       #0x38edc0
    b        #0x24d694
    cmp      w8, w25
    b.gt     #0x24d168
    mov      w9, #0x3fad
    movk     w9, #0xdc9c, lsl #16
    cmp      w8, w9
    b.gt     #0x24d394
    mov      w9, #0xa5d0
    movk     w9, #0xd0fb, lsl #16
    cmp      w8, w9
    b.eq     #0x24d868
    mov      w9, #0xd37b
    movk     w9, #0xd830, lsl #16
    cmp      w8, w9
    b.eq     #0x24d6ec
    mov      w9, #0x6712
    movk     w9, #0xd960, lsl #16
    cmp      w8, w9
    b.ne     #0x24cf3c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8e0]
    b        #0x24d88c
    cmp      w8, w22
    b.gt     #0x24d240
    mov      w9, #0x7076
    movk     w9, #0x6da, lsl #16
    cmp      w8, w9
    b.gt     #0x24d47c
    cmp      w8, w21
    b.eq     #0x24da40
    mov      w9, #0x581f
    movk     w9, #0xffef, lsl #16
    cmp      w8, w9
    b.eq     #0x24d9cc
    mov      w9, #0xf698
    movk     w9, #0x130, lsl #16
    cmp      w8, w9
    b.ne     #0x24cf3c
    ldr      x8, [sp, #0x48]
    cmp      x8, #3
    mov      w8, #0x4506
    movk     w8, #0xa012, lsl #16
    mov      w9, #0xbfd7
    movk     w9, #0x1da0, lsl #16
    b        #0x24d960
    mov      w9, #0xaa5
    movk     w9, #0x6bd2, lsl #16
    cmp      w8, w9
    b.gt     #0x24d2d8
    mov      w9, #0xf331
    movk     w9, #0x45ae, lsl #16
    cmp      w8, w9
    b.eq     #0x24d664
    mov      w9, #0x90d8
    movk     w9, #0x4c6d, lsl #16
    cmp      w8, w9
    b.eq     #0x24d564
    mov      w9, #0xe9d3
    movk     w9, #0x5f61, lsl #16
    cmp      w8, w9
    b.ne     #0x24cf3c
    ldr      x8, [sp, #0x48]
    cmp      x8, #6
    mov      w8, #0x601
    movk     w8, #0xba0d, lsl #16
    mov      w9, #0xf698
    movk     w9, #0x130, lsl #16
    b        #0x24d960
    mov      w9, #0x600
    movk     w9, #0xba0d, lsl #16
    cmp      w8, w9
    b.gt     #0x24d3e8
    mov      w9, #0x231a
    movk     w9, #0xae93, lsl #16
    cmp      w8, w9
    b.eq     #0x24d884
    mov      w9, #0xc669
    movk     w9, #0xaf65, lsl #16
    cmp      w8, w9
    b.eq     #0x24d6f8
    mov      w9, #0x8c2e
    movk     w9, #0xb322, lsl #16
    cmp      w8, w9
    b.ne     #0x24cf3c
    ldr      x8, [sp, #8]
    str      w27, [x8]
    ldr      x8, [sp, #0x38]
    str      x8, [sp, #0x28]
    b        #0x24cf3c
    mov      w9, #0x5a80
    movk     w9, #0xe798, lsl #16
    cmp      w8, w9
    b.gt     #0x24d440
    mov      w9, #0x9ad5
    movk     w9, #0xe177, lsl #16
    cmp      w8, w9
    b.eq     #0x24d8a4
    mov      w9, #0x4be3
    movk     w9, #0xe39e, lsl #16
    cmp      w8, w9
    b.eq     #0x24d74c
    mov      w9, #0xef49
    movk     w9, #0xe720, lsl #16
    cmp      w8, w9
    b.ne     #0x24cf3c
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb98]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb9c]
    and      w8, w8, w9
    mov      w9, #0x17b
    movk     w9, #0x6328, lsl #16
    umull    x9, w8, w9
    lsr      x9, x9, #0x20
    sub      w8, w8, w9
    add      w8, w9, w8, lsr #1
    mov      w9, #0x4ca9
    movk     w9, #0xecfd, lsl #16
    add      w8, w9, w8, lsr #31
    mov      w9, #0x1c84
    movk     w9, #0xff3d, lsl #16
    eor      w21, w8, w9
    adrp     x8, #0x4a3000
    add      x8, x8, #0xcf0
    ldr      x20, [x8]
    bl       #0x38ed9c
    mov      x3, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x758]
    ldr      x0, [sp, #0x50]
    mov      x2, x20
    mov      w20, #0xb654
    movk     w20, #0x40e2, lsl #16
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x38]
    mov      w8, #0xff3a
    movk     w8, #0x4de3, lsl #16
    cmp      w21, w8
    mov      w21, #0xc20d
    movk     w21, #0xffab, lsl #16
    mov      w8, #0x8c2e
    movk     w8, #0xb322, lsl #16
    b        #0x24d744
    mov      w9, #0xbb26
    movk     w9, #0x2501, lsl #16
    cmp      w8, w9
    b.gt     #0x24d4c8
    mov      w9, #0xbfd7
    movk     w9, #0x1da0, lsl #16
    cmp      w8, w9
    b.eq     #0x24d52c
    mov      w9, #0xae39
    movk     w9, #0x1f2f, lsl #16
    cmp      w8, w9
    b.eq     #0x24d510
    mov      w9, #0x257d
    movk     w9, #0x22d9, lsl #16
    cmp      w8, w9
    b.ne     #0x24cf3c
    ldr      x8, [sp, #0x48]
    cmp      x8, #0xb
    mov      w8, #0xfd57
    movk     w8, #0xa897, lsl #16
    mov      w9, #0x90d8
    movk     w9, #0x4c6d, lsl #16
    b        #0x24d67c
    mov      w9, #0xd585
    movk     w9, #0x3b1a, lsl #16
    cmp      w8, w9
    b.eq     #0x24d684
    cmp      w8, w20
    b.eq     #0x24d570
    mov      w9, #0x31f7
    movk     w9, #0x423c, lsl #16
    cmp      w8, w9
    b.ne     #0x24cf3c
    ldr      x8, [sp, #8]
    mov      w9, #0xe9d3
    movk     w9, #0x5f61, lsl #16
    str      w9, [x8]
    b        #0x24cf3c
    mov      w9, #0xaa6
    movk     w9, #0x6bd2, lsl #16
    cmp      w8, w9
    b.eq     #0x24d6b8
    mov      w9, #0x929d
    movk     w9, #0x6c95, lsl #16
    cmp      w8, w9
    b.eq     #0x24d5f4
    mov      w9, #0xe827
    movk     w9, #0x6cae, lsl #16
    cmp      w8, w9
    b.ne     #0x24cf3c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8a0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    str      w20, [x8]
    b        #0x24cf3c
    mov      w9, #0x4506
    movk     w9, #0xa012, lsl #16
    cmp      w8, w9
    b.eq     #0x24d8c4
    mov      w9, #0xfd57
    movk     w9, #0xa897, lsl #16
    cmp      w8, w9
    b.eq     #0x24d768
    mov      w9, #0x30e3
    movk     w9, #0xacd7, lsl #16
    cmp      w8, w9
    b.ne     #0x24cf3c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x910]
    ldr      x0, [sp, #0x50]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    mov      w9, #0x3fae
    movk     w9, #0xdc9c, lsl #16
    str      w9, [x8]
    b        #0x24cf3c
    mov      w9, #0x3fae
    movk     w9, #0xdc9c, lsl #16
    cmp      w8, w9
    b.eq     #0x24d8e0
    mov      w9, #0x4a75
    movk     w9, #0xdcfa, lsl #16
    cmp      w8, w9
    b.eq     #0x24d7b4
    mov      w9, #0x3519
    movk     w9, #0xe007, lsl #16
    cmp      w8, w9
    b.ne     #0x24cf3c
    ldr      x1, [sp, #0x58]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #0x70d2
    movk     w8, #0x944f, lsl #16
    mov      w9, #0x3615
    movk     w9, #0xc78d, lsl #16
    b        #0x24d65c
    mov      w9, #0x601
    movk     w9, #0xba0d, lsl #16
    cmp      w8, w9
    b.eq     #0x24d948
    mov      w9, #0x4cd8
    movk     w9, #0xbad3, lsl #16
    cmp      w8, w9
    b.eq     #0x24d7c8
    mov      w9, #0x3615
    movk     w9, #0xc78d, lsl #16
    cmp      w8, w9
    b.ne     #0x24cf3c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x898]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #0x4cd8
    movk     w8, #0xbad3, lsl #16
    mov      w9, #0x99fa
    movk     w9, #0xc2a, lsl #16
    b        #0x24d65c
    mov      w9, #0x5a81
    movk     w9, #0xe798, lsl #16
    cmp      w8, w9
    b.eq     #0x24d968
    mov      w9, #0xfe8c
    movk     w9, #0xf0df, lsl #16
    cmp      w8, w9
    b.eq     #0x24d7f0
    mov      w9, #0xf5b
    movk     w9, #0xf4dd, lsl #16
    cmp      w8, w9
    b.ne     #0x24cf3c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8d8]
    b        #0x24d88c
    mov      w9, #0x7077
    movk     w9, #0x6da, lsl #16
    cmp      w8, w9
    b.eq     #0x24da84
    mov      w9, #0x99fa
    movk     w9, #0xc2a, lsl #16
    cmp      w8, w9
    b.eq     #0x24d9e0
    mov      w9, #0xf7eb
    movk     w9, #0xcbd, lsl #16
    cmp      w8, w9
    b.ne     #0x24cf3c
    ldr      x0, [sp, #0x50]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0x7077
    movk     w9, #0x6da, lsl #16
    str      w9, [x8]
    b        #0x24cf3c
    mov      w9, #0xb60f
    movk     w9, #0x278c, lsl #16
    cmp      w8, w9
    b.eq     #0x24d4f4
    mov      w9, #0x6815
    movk     w9, #0x295c, lsl #16
    cmp      w8, w9
    b.ne     #0x24daec
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8c0]
    b        #0x24d6cc
    ldr      x8, [sp, #8]
    mov      w9, #0xbb27
    movk     w9, #0x2501, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x18]
    str      x8, [sp, #0x20]
    b        #0x24cf3c
    ldr      x8, [sp, #0x48]
    cmp      x8, #0xb
    mov      w8, #0x257d
    movk     w8, #0x22d9, lsl #16
    mov      w9, #0xaa6
    movk     w9, #0x6bd2, lsl #16
    b        #0x24d960
    ldr      x8, [sp, #0x48]
    cmp      x8, #2
    mov      w8, #0xd37b
    movk     w8, #0xd830, lsl #16
    mov      w9, #0xf331
    movk     w9, #0x45ae, lsl #16
    b        #0x24d960
    ldr      x8, [sp, #0x48]
    cmp      x8, #0xa
    mov      w8, #0x231a
    movk     w8, #0xae93, lsl #16
    mov      w9, #0xae39
    movk     w9, #0x1f2f, lsl #16
    b        #0x24d8bc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x900]
    b        #0x24d88c
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb78]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb7c]
    mul      w8, w8, w9
    mov      w9, #0x86dd
    movk     w9, #0xc320, lsl #16
    orr      w8, w8, w9
    mov      w9, #0xb60f
    movk     w9, #0x86aa, lsl #16
    mul      w20, w8, w9
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x50]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8a0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x48]
    mov      w8, #0xa47
    movk     w8, #0x98c, lsl #16
    cmp      w20, w8
    mov      w20, #0xb654
    movk     w20, #0x40e2, lsl #16
    mov      w8, #0x31f7
    movk     w8, #0x423c, lsl #16
    csel     w8, w20, w8, eq
    b        #0x24dae0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8e8]
    ldr      x0, [sp, #0x50]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    mov      w9, #0xd12e
    movk     w9, #0x842e, lsl #16
    str      w9, [x8]
    b        #0x24cf3c
    ldr      x8, [sp, #0x28]
    str      x8, [sp, #0x18]
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xbb0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xbb4]
    sub      w8, w8, w9
    mov      w9, #0x87c7
    movk     w9, #0x6e3b, lsl #16
    and      w8, w8, w9
    mov      w9, #0xbe52
    movk     w9, #0xd6d, lsl #16
    cmp      w8, w9
    mov      w8, #0x7077
    movk     w8, #0x6da, lsl #16
    mov      w9, #0xf7eb
    movk     w9, #0xcbd, lsl #16
    csel     w8, w8, w9, ne
    b        #0x24dae0
    ldr      x8, [sp, #0x48]
    cmp      x8, #1
    mov      w8, #0xfd57
    movk     w8, #0xa897, lsl #16
    mov      w9, #0xfe8c
    movk     w9, #0xf0df, lsl #16
    csel     w8, w9, w8, eq
    b        #0x24dae0
    adrp     x8, #0x4a3000
    add      x8, x8, #0xce8
    ldr      x20, [x8]
    bl       #0x38ed84
    mov      x3, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x758]
    ldr      x0, [sp, #0x50]
    mov      x2, x20
    mov      w20, #0xb654
    movk     w20, #0x40e2, lsl #16
    bl       #0x461c6c // _objc_msgSend
    b        #0x24d894
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8f8]
    b        #0x24d88c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8c8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    mov      w9, #0xbb27
    movk     w9, #0x2501, lsl #16
    str      w9, [x8]
    str      x0, [sp, #0x20]
    b        #0x24cf3c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8d0]
    b        #0x24d88c
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb90]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb94]
    sub      w8, w8, w9
    mov      w9, #0xf09
    movk     w9, #0xe567, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x2398
    movk     w9, #0x168d, lsl #16
    add      w8, w8, w9
    mov      w9, #0x9438
    movk     w9, #0x7f4, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x9f88
    movk     w9, #0x39c6, lsl #16
    cmp      w8, w9
    mov      w8, #0xef49
    movk     w8, #0xe720, lsl #16
    csel     w8, w21, w8, hi
    b        #0x24dae0
    ldr      x8, [sp, #0x48]
    cmp      x8, #8
    mov      w8, #0xc669
    movk     w8, #0xaf65, lsl #16
    mov      w9, #0xbf94
    movk     w9, #0x3255, lsl #16
    b        #0x24d8bc
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xba0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xba4]
    orr      w8, w8, w9
    mov      w9, #0x4045
    movk     w9, #0xf432, lsl #16
    eor      w8, w8, w9
    mov      w9, #0xdcdf
    movk     w9, #0x66f8, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x4500
    movk     w9, #0x75b2, lsl #16
    cmp      w8, w9
    mov      w8, #0x3fae
    movk     w8, #0xdc9c, lsl #16
    mov      w9, #0x30e3
    movk     w9, #0xacd7, lsl #16
    b        #0x24dadc
    ldr      x8, [sp, #8]
    str      w27, [x8]
    ldr      x8, [sp, #0x40]
    str      x8, [sp, #0x28]
    b        #0x24cf3c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8b8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #0x9dbc
    movk     w8, #0x8b65, lsl #16
    mov      w9, #0x6815
    movk     w9, #0x295c, lsl #16
    b        #0x24d860
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x908]
    b        #0x24d88c
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb88]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb8c]
    add      w8, w8, w9
    mov      w9, #0x5330
    movk     w9, #0xdbe0, lsl #16
    mul      w8, w8, w9
    mov      w9, #0xdfde
    movk     w9, #0xcff7, lsl #16
    orr      w20, w8, w9
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8e8]
    ldr      x0, [sp, #0x50]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x40]
    mov      w8, #0x9859
    movk     w8, #0x53c9, lsl #16
    cmp      w20, w8
    mov      w20, #0xb654
    movk     w20, #0x40e2, lsl #16
    mov      w8, #0xd12e
    movk     w8, #0x842e, lsl #16
    mov      w9, #0x4a75
    movk     w9, #0xdcfa, lsl #16
    csel     w8, w9, w8, ne
    b        #0x24dae0
    ldr      x8, [sp, #0x48]
    cmp      x8, #7
    mov      w8, #0x4be3
    movk     w8, #0xe39e, lsl #16
    mov      w9, #0xd585
    movk     w9, #0x3b1a, lsl #16
    b        #0x24d960
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8f0]
    ldr      x0, [sp, #0x50]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    str      w27, [x8]
    str      x0, [sp, #0x28]
    b        #0x24cf3c
    ldr      x8, [sp, #0x48]
    cmp      x8, #5
    mov      w8, #0x6712
    movk     w8, #0xd960, lsl #16
    mov      w9, #0x5a81
    movk     w9, #0xe798, lsl #16
    csel     w8, w8, w9, lt
    b        #0x24dae0
    ldr      x8, [sp, #0x48]
    cmp      x8, #4
    mov      w8, #0x9ad5
    movk     w8, #0xe177, lsl #16
    mov      w9, #0xf5b
    movk     w9, #0xf4dd, lsl #16
    b        #0x24d960
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xba8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xbac]
    udiv     w8, w8, w9
    mov      w9, #0x4b5a
    movk     w9, #0x488a, lsl #16
    mov      w10, #0xce77
    movk     w10, #0xcada, lsl #16
    madd     w20, w8, w9, w10
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x910]
    ldr      x0, [sp, #0x50]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x30]
    mov      w8, #0x9640
    movk     w8, #0x2f41, lsl #16
    cmp      w20, w8
    mov      w20, #0xb654
    movk     w20, #0x40e2, lsl #16
    mov      w8, #0x3fae
    movk     w8, #0xdc9c, lsl #16
    mov      w9, #0x581f
    movk     w9, #0xffef, lsl #16
    csel     w8, w8, w9, lo
    b        #0x24dae0
    ldr      x8, [sp, #0x48]
    cmp      x8, #9
    mov      w8, #0xa4c7
    movk     w8, #0x3174, lsl #16
    mov      w9, #0xa5d0
    movk     w9, #0xd0fb, lsl #16
    csel     w8, w9, w8, lt
    b        #0x24dae0
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb80]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb84]
    and      w8, w8, w9
    mov      w9, #0x7b5e
    movk     w9, #0x39e3, lsl #16
    add      w8, w8, w9
    lsr      w8, w8, #1
    mov      w9, #0x2885
    movk     w9, #0x4db1, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3d
    mov      w9, #0xee4f
    movk     w9, #0xfe59, lsl #16
    add      w8, w8, w9
    mov      w9, #0x142e
    movk     w9, #0x2392, lsl #16
    cmp      w8, w9
    mov      w8, #0xd12e
    movk     w8, #0x842e, lsl #16
    mov      w9, #0x929d
    movk     w9, #0x6c95, lsl #16
    csel     w8, w9, w8, lo
    b        #0x24dae0
    ldr      x8, [sp, #8]
    str      w27, [x8]
    ldr      x8, [sp, #0x30]
    str      x8, [sp, #0x28]
    b        #0x24cf3c
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xb70]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xb74]
    eor      w8, w8, w9
    mov      w9, #0xcb9f
    movk     w9, #0x1708, lsl #16
    umull    x9, w8, w9
    lsr      x9, x9, #0x20
    sub      w8, w8, w9
    add      w8, w9, w8, lsr #1
    mov      w9, #0x1110
    movk     w9, #0xcbe5, lsl #16
    eor      w8, w9, w8, lsr #27
    mov      w9, #0x2808
    movk     w9, #0x984f, lsl #16
    add      w8, w8, w9
    mov      w9, #0xb942
    movk     w9, #0x3819, lsl #16
    cmp      w8, w9
    mov      w8, #0xe827
    movk     w8, #0x6cae, lsl #16
    csel     w8, w8, w20, lo
    b        #0x24dae0
    adrp     x8, #0x4a3000
    add      x8, x8, #0xcf0
    ldr      x20, [x8]
    bl       #0x38ed9c
    mov      x3, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x758]
    ldr      x0, [sp, #0x50]
    mov      x2, x20
    mov      w20, #0xb654
    movk     w20, #0x40e2, lsl #16
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    mov      w9, #0xef49
    movk     w9, #0xe720, lsl #16
    str      w9, [x8]
    b        #0x24cf3c
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xbb8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xbbc]
    eor      w8, w8, w9
    mov      w9, #0xa6bb
    movk     w9, #0x7ee3, lsl #16
    orr      w8, w8, w9
    mov      w9, #0xf0b
    movk     w9, #0x3dc0, lsl #16
    add      w20, w8, w9
    ldr      x0, [sp, #0x50]
    bl       #0x461c9c // _objc_release
    mov      w8, #0xea54
    movk     w8, #0xdb81, lsl #16
    cmp      w20, w8
    mov      w20, #0xb654
    movk     w20, #0x40e2, lsl #16
    mov      w8, #0x7077
    movk     w8, #0x6da, lsl #16
    mov      w9, #0xb60f
    movk     w9, #0x278c, lsl #16
    csel     w8, w8, w9, hi
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x24cf3c
    mov      w9, #0xbb27
    movk     w9, #0x2501, lsl #16
    cmp      w8, w9
    b.ne     #0x24cf3c
    ldr      x0, [sp, #0x20]
    ldp      x29, x30, [sp, #0xb0]
    ldp      x20, x19, [sp, #0xa0]
    ldp      x22, x21, [sp, #0x90]
    ldp      x24, x23, [sp, #0x80]
    ldp      x26, x25, [sp, #0x70]
    ldp      x28, x27, [sp, #0x60]
    add      sp, sp, #0xc0
    ret      

// -[WCLGColorPickerViewController componentsForMode:red:green:blue:alpha:] IMP=0x24DB20 bounds=0x24DB20-0x24F324
loc_24DB20:
    sub      sp, sp, #0xd0
    stp      x28, x27, [sp, #0x70]
    stp      x26, x25, [sp, #0x80]
    stp      x24, x23, [sp, #0x90]
    stp      x22, x21, [sp, #0xa0]
    stp      x20, x19, [sp, #0xb0]
    stp      x29, x30, [sp, #0xc0]
    add      x29, sp, #0xc0
    stp      x6, x4, [sp, #0x10]
    mov      x20, x5
    mov      x22, x3
    mov      x24, x0
    stur     xzr, [x29, #-0x58]
    stp      xzr, xzr, [sp, #0x58]
    str      x2, [sp, #8]
    mov      x0, x2
    bl       #0x260ad4
    mov      w11, #0xf826
    movk     w11, #0x552e, lsl #16
    mov      w10, #0xaad2
    movk     w10, #0x6bb2, lsl #16
    mov      w9, #0x67fa
    movk     w9, #0x6e0b, lsl #16
    str      d0, [sp, #0x50]
    add      x8, sp, #0x2c
    mov      w27, #0xf8b6
    movk     w27, #0xe6dd, lsl #16
    str      w9, [sp, #0x2c]
    mov      w25, #0x6323
    movk     w25, #0xbeba, lsl #16
    mov      w26, #0xe865
    movk     w26, #0x9c08, lsl #16
    str      x8, [sp, #0x20]
    mov      w23, #0x9f5a
    movk     w23, #0xc9d5, lsl #16
    mov      w19, #0xbaf
    movk     w19, #0x4357, lsl #16
    mov      w28, #0xe892
    movk     w28, #0x1f3, lsl #16
    mov      w21, #0x57df
    movk     w21, #0x5887, lsl #16
    str      x20, [sp]
    ldr      w8, [sp, #0x2c]
    cmp      w8, w27
    b.gt     #0x24dc50
    cmp      w8, w25
    b.le     #0x24dccc
    cmp      w8, w23
    b.le     #0x24de00
    mov      w9, #0x7907
    movk     w9, #0xd3ae, lsl #16
    cmp      w8, w9
    b.le     #0x24e09c
    mov      w9, #0xcf30
    movk     w9, #0xdddd, lsl #16
    cmp      w8, w9
    b.gt     #0x24e360
    mov      w9, #0x7908
    movk     w9, #0xd3ae, lsl #16
    cmp      w8, w9
    b.eq     #0x24ee04
    mov      w9, #0x4f52
    movk     w9, #0xd75e, lsl #16
    cmp      w8, w9
    b.eq     #0x24f07c
    mov      w9, #0x9981
    movk     w9, #0xdb42, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    ldrb     w8, [sp, #0x4f]
    cmp      w8, #0
    mov      w8, #0xa55d
    movk     w8, #0xdf56, lsl #16
    mov      w9, #0x882b
    movk     w9, #0xf3c2, lsl #16
    b        #0x24ed10
    cmp      w8, w19
    b.gt     #0x24dd8c
    cmp      w8, w28
    b.le     #0x24dec8
    mov      w9, #0xb46
    movk     w9, #0x2471, lsl #16
    cmp      w8, w9
    b.le     #0x24e248
    mov      w9, #0xf269
    movk     w9, #0x36ac, lsl #16
    cmp      w8, w9
    b.gt     #0x24e3a8
    mov      w9, #0xb47
    movk     w9, #0x2471, lsl #16
    cmp      w8, w9
    b.eq     #0x24f138
    mov      w9, #0xf138
    movk     w9, #0x351a, lsl #16
    cmp      w8, w9
    b.eq     #0x24f250
    mov      w9, #0xcec9
    movk     w9, #0x35da, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    ldr      d0, [sp, #0x58]
    str      d0, [x20]
    ldr      x8, [sp, #0x20]
    mov      w9, #0x57e0
    movk     w9, #0x5887, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    cmp      w8, w26
    b.le     #0x24de64
    mov      w9, #0xf46c
    movk     w9, #0xac9e, lsl #16
    cmp      w8, w9
    b.le     #0x24dff8
    mov      w9, #0x40c4
    movk     w9, #0xb260, lsl #16
    cmp      w8, w9
    b.gt     #0x24e31c
    mov      w9, #0xf46d
    movk     w9, #0xac9e, lsl #16
    cmp      w8, w9
    b.eq     #0x24ed94
    mov      w9, #0x771d
    movk     w9, #0xaed3, lsl #16
    cmp      w8, w9
    b.eq     #0x24f018
    mov      w9, #0x1696
    movk     w9, #0xaf40, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc38]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc3c]
    and      w8, w8, w9
    mov      w9, #0x18bb
    movk     w9, #0x4ecd, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3d
    mov      w9, #0x71e4
    movk     w9, #0xb826, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x46d5
    movk     w9, #0xd621, lsl #16
    mul      w8, w8, w9
    cmp      x20, #0
    cset     w9, eq
    strb     w9, [sp, #0x3d]
    mov      w9, #0xaa55
    movk     w9, #0x720f, lsl #16
    cmp      w8, w9
    mov      w8, #0x1696
    movk     w8, #0xaf40, lsl #16
    mov      w9, #0x66ce
    movk     w9, #0x752c, lsl #16
    b        #0x24f2bc
    cmp      w8, w21
    b.le     #0x24df34
    mov      w9, #0x22f1
    movk     w9, #0x7338, lsl #16
    cmp      w8, w9
    b.le     #0x24e2a4
    mov      w9, #0x7518
    movk     w9, #0x792a, lsl #16
    cmp      w8, w9
    b.gt     #0x24e3f4
    mov      w9, #0x22f2
    movk     w9, #0x7338, lsl #16
    cmp      w8, w9
    b.eq     #0x24f1c0
    mov      w9, #0xbdf4
    movk     w9, #0x7506, lsl #16
    cmp      w8, w9
    b.eq     #0x24f26c
    mov      w9, #0x66ce
    movk     w9, #0x752c, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    ldrb     w8, [sp, #0x3d]
    cmp      w8, #0
    mov      w8, #0xd3de
    movk     w8, #0x4eb5, lsl #16
    mov      w9, #0x8e9
    movk     w9, #0x19b8, lsl #16
    b        #0x24ed10
    mov      w9, #0x38d9
    movk     w9, #0xc1d9, lsl #16
    cmp      w8, w9
    b.le     #0x24e044
    mov      w9, #0x7e1e
    movk     w9, #0xc5f9, lsl #16
    cmp      w8, w9
    b.gt     #0x24e45c
    mov      w9, #0x38da
    movk     w9, #0xc1d9, lsl #16
    cmp      w8, w9
    b.eq     #0x24e860
    mov      w9, #0x7224
    movk     w9, #0xc442, lsl #16
    cmp      w8, w9
    b.eq     #0x24e8e4
    mov      w9, #0x803e
    movk     w9, #0xc582, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    ldr      x8, [sp, #0x20]
    mov      w9, #0xd3de
    movk     w9, #0x4eb5, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    mov      w9, #0x6e3b
    movk     w9, #0x8864, lsl #16
    cmp      w8, w9
    b.gt     #0x24dfa0
    mov      w9, #0xb1a3
    movk     w9, #0x8519, lsl #16
    cmp      w8, w9
    b.le     #0x24e4a8
    mov      w9, #0xb1a4
    movk     w9, #0x8519, lsl #16
    cmp      w8, w9
    b.eq     #0x24e87c
    mov      w9, #0x9471
    movk     w9, #0x875b, lsl #16
    cmp      w8, w9
    b.eq     #0x24ea18
    mov      w9, #0x633b
    movk     w9, #0x87ee, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    ldr      x8, [sp, #0x20]
    mov      w9, #0xedab
    movk     w9, #0xed21, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    mov      w9, #0x882a
    movk     w9, #0xf3c2, lsl #16
    cmp      w8, w9
    b.gt     #0x24e12c
    mov      w9, #0xedaa
    movk     w9, #0xed21, lsl #16
    cmp      w8, w9
    b.le     #0x24e60c
    mov      w9, #0xedab
    movk     w9, #0xed21, lsl #16
    cmp      w8, w9
    b.eq     #0x24eabc
    mov      w9, #0xd23b
    movk     w9, #0xede6, lsl #16
    cmp      w8, w9
    b.eq     #0x24ee54
    mov      w9, #0xf569
    movk     w9, #0xf347, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    ldr      d0, [sp, #0x60]
    ldp      x9, x8, [sp, #0x18]
    str      d0, [x9]
    mov      w9, #0x7167
    movk     w9, #0x98f6, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    mov      w9, #0xd009
    movk     w9, #0x4f94, lsl #16
    cmp      w8, w9
    b.gt     #0x24e18c
    mov      w9, #0xe07f
    movk     w9, #0x4b01, lsl #16
    cmp      w8, w9
    b.le     #0x24e688
    mov      w9, #0xe080
    movk     w9, #0x4b01, lsl #16
    cmp      w8, w9
    b.eq     #0x24eb10
    mov      w9, #0x57ca
    movk     w9, #0x4b04, lsl #16
    cmp      w8, w9
    b.eq     #0x24eeb4
    mov      w9, #0xd3de
    movk     w9, #0x4eb5, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    ldr      x8, [sp, #0x10]
    cmp      x8, #0
    mov      w8, #0x2212
    movk     w8, #0xc671, lsl #16
    mov      w9, #0x6f45
    movk     w9, #0xfe27, lsl #16
    b        #0x24f240
    mov      w9, #0x6500
    movk     w9, #0x8f2c, lsl #16
    cmp      w8, w9
    b.le     #0x24e4e0
    mov      w9, #0x6501
    movk     w9, #0x8f2c, lsl #16
    cmp      w8, w9
    b.eq     #0x24e898
    mov      w9, #0xf7c0
    movk     w9, #0x94db, lsl #16
    cmp      w8, w9
    b.eq     #0x24e844
    mov      w9, #0x7167
    movk     w9, #0x98f6, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    cmp      x20, #0
    mov      w8, #0x40c5
    movk     w8, #0xb260, lsl #16
    mov      w9, #0xacbf
    movk     w9, #0xfe26, lsl #16
    b        #0x24f240
    mov      w9, #0x86a8
    movk     w9, #0x9f07, lsl #16
    cmp      w8, w9
    b.le     #0x24e518
    mov      w9, #0x86a9
    movk     w9, #0x9f07, lsl #16
    cmp      w8, w9
    b.eq     #0x24e8cc
    mov      w9, #0xf07
    movk     w9, #0xa168, lsl #16
    cmp      w8, w9
    b.eq     #0x24ea30
    mov      w9, #0xb777
    movk     w9, #0xaa7d, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    ldr      x8, [sp, #0x20]
    str      w10, [x8]
    b        #0x24dbc8
    mov      w9, #0x58c9
    movk     w9, #0xbf33, lsl #16
    cmp      w8, w9
    b.le     #0x24e53c
    mov      w9, #0x58ca
    movk     w9, #0xbf33, lsl #16
    cmp      w8, w9
    b.eq     #0x24e97c
    mov      w9, #0x30ed
    movk     w9, #0xc05b, lsl #16
    cmp      w8, w9
    b.eq     #0x24ea4c
    mov      w9, #0xcae0
    movk     w9, #0xc171, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    sub      x1, x29, #0x58
    add      x2, sp, #0x60
    add      x3, sp, #0x58
    ldr      x0, [sp, #8]
    bl       #0x260a24
    b        #0x24ec78
    mov      w9, #0x7bdb
    movk     w9, #0xcc6b, lsl #16
    cmp      w8, w9
    b.le     #0x24e578
    mov      w9, #0x7bdc
    movk     w9, #0xcc6b, lsl #16
    cmp      w8, w9
    b.eq     #0x24e824
    mov      w9, #0xbb4f
    movk     w9, #0xccca, lsl #16
    cmp      w8, w9
    b.eq     #0x24eaa4
    mov      w9, #0x3cf6
    movk     w9, #0xd31d, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xbf8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xbfc]
    sub      w8, w8, w9
    mov      w9, #0x3a00
    movk     w9, #0x5a34, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x3a82
    movk     w9, #0x5a3c, lsl #16
    and      w8, w8, w9
    str      xzr, [x22]
    mov      w9, #0x9e74
    movk     w9, #0x2d7d, lsl #16
    cmp      w8, w9
    mov      w8, #0x3cf6
    movk     w8, #0xd31d, lsl #16
    mov      w9, #0x8204
    movk     w9, #0x7c5c, lsl #16
    b        #0x24f1b8
    mov      w9, #0xacbe
    movk     w9, #0xfe26, lsl #16
    cmp      w8, w9
    b.le     #0x24e6c0
    mov      w9, #0xacbf
    movk     w9, #0xfe26, lsl #16
    cmp      w8, w9
    b.eq     #0x24eb48
    mov      w9, #0x6f45
    movk     w9, #0xfe27, lsl #16
    cmp      w8, w9
    b.eq     #0x24e844
    mov      w9, #0x96d
    movk     w9, #0xca, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    ldr      d0, [sp, #0x30]
    ldr      x8, [sp, #0x10]
    str      d0, [x8]
    ldr      x8, [sp, #0x20]
    mov      w9, #0x2212
    movk     w9, #0xc671, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    mov      w9, #0xc993
    movk     w9, #0x5241, lsl #16
    cmp      w8, w9
    b.le     #0x24e714
    mov      w9, #0xc994
    movk     w9, #0x5241, lsl #16
    cmp      w8, w9
    b.eq     #0x24e824
    cmp      w8, w11
    b.eq     #0x24ef04
    mov      w9, #0x44cb
    movk     w9, #0x56db, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc58]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc5c]
    mul      w8, w8, w9
    mov      w9, #0x90ab
    movk     w9, #0xfdd1, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x295
    movk     w9, #0xff69, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x15a1
    movk     w9, #0x19b9, lsl #16
    add      w20, w8, w9
    ldr      x1, [sp, #0x40]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      w11, #0xf826
    movk     w11, #0x552e, lsl #16
    mov      w10, #0xaad2
    movk     w10, #0x6bb2, lsl #16
    cmp      x0, #0xb
    cset     w8, eq
    strb     w8, [sp, #0x3c]
    mov      w8, #0xe565
    movk     w8, #0xf950, lsl #16
    cmp      w20, w8
    ldr      x20, [sp]
    mov      w8, #0x44cb
    movk     w8, #0x56db, lsl #16
    mov      w9, #0x1718
    movk     w9, #0x80bf, lsl #16
    b        #0x24efac
    mov      w9, #0x662a
    movk     w9, #0x8cc, lsl #16
    cmp      w8, w9
    b.le     #0x24e790
    mov      w9, #0x662b
    movk     w9, #0x8cc, lsl #16
    cmp      w8, w9
    b.eq     #0x24eb64
    mov      w9, #0x8e9
    movk     w9, #0x19b8, lsl #16
    cmp      w8, w9
    b.eq     #0x24ef58
    mov      w9, #0xe263
    movk     w9, #0x1bd3, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    ldur     d0, [x29, #-0x58]
    str      d0, [x22]
    ldr      x8, [sp, #0x20]
    mov      w9, #0xf46d
    movk     w9, #0xac9e, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    mov      w9, #0x2d50
    movk     w9, #0x630a, lsl #16
    cmp      w8, w9
    b.le     #0x24e7e8
    mov      w9, #0x2d51
    movk     w9, #0x630a, lsl #16
    cmp      w8, w9
    b.eq     #0x24ebf8
    cmp      w8, w10
    b.eq     #0x24efb4
    mov      w9, #0x67fa
    movk     w9, #0x6e0b, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    sub      x1, x29, #0x58
    add      x2, sp, #0x60
    add      x3, sp, #0x58
    add      x4, sp, #0x50
    ldr      x0, [sp, #8]
    bl       #0x260674
    mov      w11, #0xf826
    movk     w11, #0x552e, lsl #16
    mov      w10, #0xaad2
    movk     w10, #0x6bb2, lsl #16
    cmp      w0, #0
    mov      w8, #0x9471
    movk     w8, #0x875b, lsl #16
    mov      w9, #0x6437
    movk     w9, #0xbeea, lsl #16
    b        #0x24ed10
    mov      w9, #0x40c5
    movk     w9, #0xb260, lsl #16
    cmp      w8, w9
    b.eq     #0x24edd4
    mov      w9, #0x333a
    movk     w9, #0xbb73, lsl #16
    cmp      w8, w9
    b.eq     #0x24f02c
    mov      w9, #0x7741
    movk     w9, #0xbc28, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    ldr      x8, [sp, #0x20]
    mov      w9, #0x38da
    movk     w9, #0xc1d9, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    mov      w9, #0xcf31
    movk     w9, #0xdddd, lsl #16
    cmp      w8, w9
    b.eq     #0x24ee20
    mov      w9, #0x1ab9
    movk     w9, #0xdec1, lsl #16
    cmp      w8, w9
    b.eq     #0x24f0d8
    mov      w9, #0xa55d
    movk     w9, #0xdf56, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    cmp      x20, #0
    mov      w8, #0x38da
    movk     w8, #0xc1d9, lsl #16
    mov      w9, #0x3949
    movk     w9, #0xec9c, lsl #16
    b        #0x24f240
    mov      w9, #0xf26a
    movk     w9, #0x36ac, lsl #16
    cmp      w8, w9
    b.eq     #0x24f1dc
    mov      w9, #0x202b
    movk     w9, #0x37b5, lsl #16
    cmp      w8, w9
    b.eq     #0x24f2c4
    mov      w9, #0x5abe
    movk     w9, #0x3f88, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    ldr      d0, [sp, #0x58]
    str      d0, [x20]
    ldr      x8, [sp, #0x20]
    mov      w9, #0xd23b
    movk     w9, #0xede6, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    mov      w9, #0x7519
    movk     w9, #0x792a, lsl #16
    cmp      w8, w9
    b.eq     #0x24f1f0
    mov      w9, #0x8204
    movk     w9, #0x7c5c, lsl #16
    cmp      w8, w9
    b.eq     #0x24f2dc
    mov      w9, #0xddfb
    movk     w9, #0x7d5b, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x898]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      w11, #0xf826
    movk     w11, #0x552e, lsl #16
    mov      w10, #0xaad2
    movk     w10, #0x6bb2, lsl #16
    cmp      w0, #0
    mov      w8, #0xe893
    movk     w8, #0x1f3, lsl #16
    mov      w9, #0x1f38
    movk     w9, #0x215, lsl #16
    b        #0x24edcc
    mov      w9, #0x7e1f
    movk     w9, #0xc5f9, lsl #16
    cmp      w8, w9
    b.eq     #0x24ed7c
    mov      w9, #0x4858
    movk     w9, #0xc935, lsl #16
    cmp      w8, w9
    b.ne     #0x24f2f0
    ldr      x8, [sp, #0x10]
    cmp      x8, #0
    ldr      x8, [sp, #0x20]
    mov      w9, #0x2212
    movk     w9, #0xc671, lsl #16
    mov      w12, #0x96d
    movk     w12, #0xca, lsl #16
    csel     w9, w9, w12, eq
    str      w9, [x8]
    str      xzr, [sp, #0x30]
    b        #0x24dbc8
    mov      w9, #0x1718
    movk     w9, #0x80bf, lsl #16
    cmp      w8, w9
    b.eq     #0x24e900
    mov      w9, #0x2aa8
    movk     w9, #0x8483, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    cmp      x20, #0
    mov      w8, #0x4858
    movk     w8, #0xc935, lsl #16
    mov      w9, #0x7e1f
    movk     w9, #0xc5f9, lsl #16
    b        #0x24f240
    mov      w9, #0x6e3c
    movk     w9, #0x8864, lsl #16
    cmp      w8, w9
    b.eq     #0x24e91c
    mov      w9, #0x28e8
    movk     w9, #0x8ea5, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    sub      x1, x29, #0x58
    add      x2, sp, #0x60
    add      x3, sp, #0x58
    ldr      x0, [sp, #8]
    bl       #0x260a7c
    b        #0x24ec78
    mov      w9, #0xe866
    movk     w9, #0x9c08, lsl #16
    cmp      w8, w9
    b.eq     #0x24e94c
    mov      w9, #0x5b73
    movk     w9, #0x9c9c, lsl #16
    cmp      w8, w9
    b.eq     #0x24e830
    b        #0x24dbc8
    mov      w9, #0x6324
    movk     w9, #0xbeba, lsl #16
    cmp      w8, w9
    b.eq     #0x24e998
    mov      w9, #0x6437
    movk     w9, #0xbeea, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    ldr      x8, [sp, #8]
    cmp      x8, #0x11
    mov      w8, #0x1ab9
    movk     w8, #0xdec1, lsl #16
    mov      w9, #0x2d51
    movk     w9, #0x630a, lsl #16
    b        #0x24eb40
    mov      w9, #0x9f5b
    movk     w9, #0xc9d5, lsl #16
    cmp      w8, w9
    b.eq     #0x24e9e4
    mov      w9, #0xcad7
    movk     w9, #0xcb75, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc08]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc0c]
    orr      w8, w8, w9
    mov      w9, #0xd8c1
    movk     w9, #0x15b5, lsl #16
    mul      w20, w8, w9
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8a0]
    str      x1, [sp, #0x40]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      w11, #0xf826
    movk     w11, #0x552e, lsl #16
    mov      w10, #0xaad2
    movk     w10, #0x6bb2, lsl #16
    cmp      x0, #1
    cset     w8, eq
    strb     w8, [sp, #0x3f]
    mov      w8, #0xed0
    movk     w8, #0xc166, lsl #16
    cmp      w20, w8
    ldr      x20, [sp]
    mov      w8, #0xcad7
    movk     w8, #0xcb75, lsl #16
    mov      w9, #0x58ca
    movk     w9, #0xbf33, lsl #16
    b        #0x24edcc
    mov      w9, #0xf8b7
    movk     w9, #0xe6dd, lsl #16
    cmp      w8, w9
    b.eq     #0x24ec10
    mov      w9, #0x3949
    movk     w9, #0xec9c, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xbe0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xbe4]
    mul      w8, w8, w9
    mov      w9, #0xe440
    movk     w9, #0xc110, lsl #16
    and      w8, w8, w9
    mov      w9, #0x1aaf
    movk     w9, #0x3c86, lsl #16
    orr      w8, w8, w9
    mov      w9, #0xce17
    movk     w9, #0xb35d, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3f
    mov      w9, #0xe3d4
    movk     w9, #0xa827, lsl #16
    cmp      w8, w9
    mov      w8, #0xd23b
    movk     w8, #0xede6, lsl #16
    mov      w9, #0x5abe
    movk     w9, #0x3f88, lsl #16
    b        #0x24f1b8
    mov      w9, #0xbb0
    movk     w9, #0x4357, lsl #16
    cmp      w8, w9
    b.eq     #0x24ec64
    mov      w9, #0x2143
    movk     w9, #0x4470, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    cmp      x22, #0
    mov      w8, #0xb1a4
    movk     w8, #0x8519, lsl #16
    mov      w9, #0x22f2
    movk     w9, #0x7338, lsl #16
    b        #0x24f240
    mov      w9, #0x882b
    movk     w9, #0xf3c2, lsl #16
    cmp      w8, w9
    b.eq     #0x24eca0
    mov      w9, #0xe382
    movk     w9, #0xf3da, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    ldr      x1, [sp, #0x40]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      w11, #0xf826
    movk     w11, #0x552e, lsl #16
    mov      w10, #0xaad2
    movk     w10, #0x6bb2, lsl #16
    cmp      x0, #0xa
    mov      w8, #0xddfb
    movk     w8, #0x7d5b, lsl #16
    mov      w9, #0x6501
    movk     w9, #0x8f2c, lsl #16
    b        #0x24f240
    mov      w9, #0xd00a
    movk     w9, #0x4f94, lsl #16
    cmp      w8, w9
    b.eq     #0x24ecbc
    mov      w9, #0x45a0
    movk     w9, #0x507d, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xbc0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xbc4]
    eor      w8, w8, w9
    mov      w9, #0x9ef8
    movk     w9, #0xedae, lsl #16
    and      w8, w8, w9
    mov      w9, #0x7a33
    movk     w9, #0x79fa, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3e
    mov      w9, #0x7b5f
    movk     w9, #0xa1fd, lsl #16
    add      w8, w8, w9
    mov      w9, #0x41dc
    movk     w9, #0x4538, lsl #16
    cmp      w8, w9
    mov      w8, #0xf46d
    movk     w8, #0xac9e, lsl #16
    mov      w9, #0xe263
    movk     w9, #0x1bd3, lsl #16
    b        #0x24efac
    mov      w9, #0xe893
    movk     w9, #0x1f3, lsl #16
    cmp      w8, w9
    b.eq     #0x24ecc8
    mov      w9, #0x1f38
    movk     w9, #0x215, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8b8]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      w11, #0xf826
    movk     w11, #0x552e, lsl #16
    mov      w10, #0xaad2
    movk     w10, #0x6bb2, lsl #16
    cmp      w0, #0
    mov      w8, #0xc994
    movk     w8, #0x5241, lsl #16
    mov      w9, #0xe893
    movk     w9, #0x1f3, lsl #16
    b        #0x24ed10
    mov      w9, #0x57e0
    movk     w9, #0x5887, lsl #16
    cmp      w8, w9
    b.eq     #0x24ed18
    mov      w9, #0x221
    movk     w9, #0x5fa5, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    ldr      x8, [sp, #0x18]
    cmp      x8, #0
    mov      w8, #0x2aa8
    movk     w8, #0x8483, lsl #16
    mov      w9, #0xbb4f
    movk     w9, #0xccca, lsl #16
    b        #0x24f240
    mov      x8, #0x3ff0000000000000
    stp      x8, x8, [sp, #0x58]
    stur     x8, [x29, #-0x58]
    ldr      x8, [sp, #0x20]
    mov      w9, #0x2143
    movk     w9, #0x4470, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    ldr      d0, [sp, #0x50]
    ldr      x8, [sp, #0x20]
    mov      w9, #0x96d
    movk     w9, #0xca, lsl #16
    str      w9, [x8]
    str      d0, [sp, #0x30]
    b        #0x24dbc8
    ldr      x8, [sp, #0x10]
    cmp      x8, #0
    mov      w8, #0x2212
    movk     w8, #0xc671, lsl #16
    mov      w9, #0xf7c0
    movk     w9, #0x94db, lsl #16
    b        #0x24f240
    ldr      x8, [sp, #0x18]
    cmp      x8, #0
    mov      w8, #0x7167
    movk     w8, #0x98f6, lsl #16
    mov      w9, #0xf569
    movk     w9, #0xf347, lsl #16
    b        #0x24f240
    ldr      x1, [sp, #0x40]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      w11, #0xf826
    movk     w11, #0x552e, lsl #16
    mov      w10, #0xaad2
    movk     w10, #0x6bb2, lsl #16
    cmp      x0, #0xb
    mov      w8, #0xddfb
    movk     w8, #0x7d5b, lsl #16
    mov      w9, #0xe893
    movk     w9, #0x1f3, lsl #16
    b        #0x24f240
    cmp      x22, #0
    mov      w8, #0xf8b7
    movk     w8, #0xe6dd, lsl #16
    mov      w9, #0x4f52
    movk     w9, #0xd75e, lsl #16
    b        #0x24f240
    ldrb     w8, [sp, #0x3e]
    cmp      w8, #0
    mov      w8, #0xbdf4
    movk     w8, #0x7506, lsl #16
    mov      w9, #0x7908
    movk     w9, #0xd3ae, lsl #16
    b        #0x24ed10
    ldrb     w8, [sp, #0x3c]
    cmp      w8, #0
    mov      w8, #0xc994
    movk     w8, #0x5241, lsl #16
    mov      w9, #0xe382
    movk     w9, #0xf3da, lsl #16
    b        #0x24ed10
    ldr      x1, [sp, #0x40]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      w11, #0xf826
    movk     w11, #0x552e, lsl #16
    mov      w10, #0xaad2
    movk     w10, #0x6bb2, lsl #16
    ldr      x8, [sp, #0x20]
    mov      w9, #0x44cb
    movk     w9, #0x56db, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    ldr      x1, [sp, #0x40]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      w11, #0xf826
    movk     w11, #0x552e, lsl #16
    mov      w10, #0xaad2
    movk     w10, #0x6bb2, lsl #16
    ldr      x8, [sp, #0x20]
    mov      w9, #0xb47
    movk     w9, #0x2471, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    ldrb     w8, [sp, #0x3f]
    cmp      w8, #0
    mov      w8, #0x28e8
    movk     w8, #0x8ea5, lsl #16
    mov      w9, #0x9f5b
    movk     w9, #0xc9d5, lsl #16
    b        #0x24ed10
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc50]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc54]
    udiv     w8, w8, w9
    mov      w9, #0x26b3
    movk     w9, #0x7d72, lsl #16
    add      w8, w8, w9
    mov      w9, #0xef8f
    movk     w9, #0x3995, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x1087
    movk     w9, #0x5b27, lsl #16
    cmp      w8, w9
    mov      w8, #0x44cb
    movk     w8, #0x56db, lsl #16
    mov      w9, #0x6e3c
    movk     w9, #0x8864, lsl #16
    b        #0x24ed10
    ldr      x1, [sp, #0x40]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      w11, #0xf826
    movk     w11, #0x552e, lsl #16
    mov      w10, #0xaad2
    movk     w10, #0x6bb2, lsl #16
    cmp      x0, #0
    mov      w8, #0xcae0
    movk     w8, #0xc171, lsl #16
    mov      w9, #0xbb0
    movk     w9, #0x4357, lsl #16
    b        #0x24f240
    cmp      x22, #0
    mov      w8, #0xedab
    movk     w8, #0xed21, lsl #16
    mov      w9, #0x45a0
    movk     w9, #0x507d, lsl #16
    b        #0x24f240
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    mov      w8, #0xe080
    movk     w8, #0x4b01, lsl #16
    mov      w9, #0x57ca
    movk     w9, #0x4b04, lsl #16
    b        #0x24edcc
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xbf0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xbf4]
    orr      w8, w8, w9
    mov      w9, #0x73ee
    movk     w9, #0x4539, lsl #16
    add      w8, w8, w9
    mov      w9, #0xd1d0
    movk     w9, #0x4162, lsl #16
    eor      w8, w8, w9
    mov      w9, #0xf916
    movk     w9, #0xdec8, lsl #16
    add      w8, w8, w9
    mov      w9, #0x6be7
    movk     w9, #0x377f, lsl #16
    cmp      w8, w9
    mov      w8, #0x3cf6
    movk     w8, #0xd31d, lsl #16
    mov      w9, #0x202b
    movk     w9, #0x37b5, lsl #16
    b        #0x24f2bc
    ldp      x9, x8, [sp, #0x18]
    str      xzr, [x9]
    mov      w9, #0x2aa8
    movk     w9, #0x8483, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xbd0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xbd4]
    mul      w8, w8, w9
    mov      w9, #0x1f15
    movk     w9, #0xb1a8, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x82e5
    movk     w9, #0x3689, lsl #16
    orr      w8, w8, w9
    mov      w9, #0xc12e
    movk     w9, #0x40bb, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x2d36
    movk     w9, #0x963f, lsl #16
    cmp      w8, w9
    mov      w8, #0xb777
    movk     w8, #0xaa7d, lsl #16
    csel     w8, w10, w8, hi
    b        #0x24f244
    ldr      x1, [sp, #0x40]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      w11, #0xf826
    movk     w11, #0x552e, lsl #16
    mov      w10, #0xaad2
    movk     w10, #0x6bb2, lsl #16
    cmp      x0, #1
    mov      w8, #0x2143
    movk     w8, #0x4470, lsl #16
    mov      w9, #0x7bdc
    movk     w9, #0xcc6b, lsl #16
    csel     w8, w9, w8, eq
    b        #0x24f244
    ldr      d0, [sp, #0x58]
    str      d0, [x20]
    ldr      x8, [sp, #0x20]
    mov      w9, #0x40c5
    movk     w9, #0xb260, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc78]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc7c]
    eor      w8, w8, w9
    mov      w9, #0x8532
    movk     w9, #0xe523, lsl #16
    add      w8, w8, w9
    mov      w9, #0x150d
    movk     w9, #0xd51, lsl #16
    eor      w8, w8, w9
    mov      w9, #0xf1d5
    movk     w9, #0x590e, lsl #16
    mul      w8, w8, w9
    mov      x9, #0xd70a
    movk     x9, #0x70a3, lsl #16
    movk     x9, #0xa3d, lsl #32
    movk     x9, #0x3fc7, lsl #48
    stur     x9, [x29, #-0x58]
    mov      x9, #0xa3d
    movk     x9, #0xa3d7, lsl #16
    movk     x9, #0x3d70, lsl #32
    movk     x9, #0x3fea, lsl #48
    str      x9, [sp, #0x60]
    mov      x9, #0xd70a
    movk     x9, #0x70a3, lsl #16
    movk     x9, #0xa3d, lsl #32
    movk     x9, #0x3fd7, lsl #48
    str      x9, [sp, #0x58]
    mov      w9, #0xd037
    movk     w9, #0x8e7d, lsl #16
    cmp      w8, w9
    mov      w8, #0x662b
    movk     w8, #0x8cc, lsl #16
    mov      w9, #0x5b73
    movk     w9, #0x9c9c, lsl #16
    b        #0x24f0d0
    cmp      x22, #0
    mov      w8, #0x221
    movk     w8, #0x5fa5, lsl #16
    mov      w9, #0x30ed
    movk     w9, #0xc05b, lsl #16
    b        #0x24f240
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc20]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc24]
    udiv     w8, w8, w9
    mov      w9, #0x4361
    movk     w9, #0x2281, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x8202
    movk     w9, #0x280c, lsl #16
    orr      w8, w8, w9
    mov      w9, #0xeb12
    movk     w9, #0x797c, lsl #16
    and      w8, w8, w9
    mov      w9, #0x4ef0
    movk     w9, #0x1ee8, lsl #16
    cmp      w8, w9
    mov      w8, #0xd00a
    movk     w8, #0x4f94, lsl #16
    csel     w8, w11, w8, hi
    b        #0x24f244
    sub      x1, x29, #0x58
    add      x2, sp, #0x60
    add      x3, sp, #0x58
    ldr      x0, [sp, #8]
    bl       #0x260854
    mov      w11, #0xf826
    movk     w11, #0x552e, lsl #16
    mov      w10, #0xaad2
    movk     w10, #0x6bb2, lsl #16
    cmp      w0, #0
    mov      w8, #0x6324
    movk     w8, #0xbeba, lsl #16
    mov      w9, #0x86a9
    movk     w9, #0x9f07, lsl #16
    b        #0x24edcc
    ldr      d0, [sp, #0x60]
    ldp      x9, x8, [sp, #0x18]
    str      d0, [x9]
    mov      w9, #0xa55d
    movk     w9, #0xdf56, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    ldr      x8, [sp, #0x20]
    str      w11, [x8]
    b        #0x24dbc8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc60]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc64]
    orr      w8, w8, w9
    mov      w9, #0xbd4e
    movk     w9, #0xb3b9, lsl #16
    add      w8, w8, w9
    mov      w9, #0x5a
    movk     w9, #0x9002, lsl #16
    and      w8, w8, w9
    mov      w9, #0x5c9b
    movk     w9, #0xb8d2, lsl #16
    cmp      w8, w9
    mov      w8, #0xb47
    movk     w8, #0x2471, lsl #16
    mov      w9, #0xe866
    movk     w9, #0x9c08, lsl #16
    csel     w8, w8, w9, ne
    b        #0x24f244
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc48]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc4c]
    udiv     w8, w8, w9
    mov      w9, #0x12e
    movk     w9, #0x82d2, lsl #16
    and      w8, w8, w9
    mov      w9, #0xade7
    movk     w9, #0x85b, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x38
    mov      w9, #0x461c
    movk     w9, #0x4976, lsl #16
    add      w8, w8, w9
    ldr      d0, [sp, #0x58]
    str      d0, [x20]
    mov      w9, #0x9087
    movk     w9, #0xb305, lsl #16
    cmp      w8, w9
    mov      w8, #0xcec9
    movk     w8, #0x35da, lsl #16
    mov      w9, #0x803e
    movk     w9, #0xc582, lsl #16
    b        #0x24efac
    str      xzr, [x20]
    ldr      x8, [sp, #0x20]
    mov      w9, #0x4858
    movk     w9, #0xc935, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xbc8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xbcc]
    add      w8, w8, w9
    ldur     d0, [x29, #-0x58]
    str      d0, [x22]
    mov      w9, #0x69d4
    movk     w9, #0x7be3, lsl #16
    cmp      w8, w9
    mov      w8, #0xe263
    movk     w8, #0x1bd3, lsl #16
    mov      w9, #0x633b
    movk     w9, #0x87ee, lsl #16
    csel     w8, w9, w8, ne
    b        #0x24f244
    ldr      x8, [sp, #0x10]
    cmp      x8, #0
    ldr      x8, [sp, #0x20]
    mov      w9, #0x2212
    movk     w9, #0xc671, lsl #16
    mov      w12, #0x96d
    movk     w12, #0xca, lsl #16
    csel     w9, w9, w12, eq
    str      w9, [x8]
    mov      x8, #0x3ff0000000000000
    str      x8, [sp, #0x30]
    b        #0x24dbc8
    ldr      d0, [sp, #0x60]
    ldp      x9, x8, [sp, #0x18]
    str      d0, [x9]
    mov      w9, #0xbdf4
    movk     w9, #0x7506, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8a0]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      w11, #0xf826
    movk     w11, #0x552e, lsl #16
    mov      w10, #0xaad2
    movk     w10, #0x6bb2, lsl #16
    ldr      x8, [sp, #0x20]
    mov      w9, #0xcad7
    movk     w9, #0xcb75, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xbe8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xbec]
    udiv     w8, w8, w9
    mov      w9, #0x6561
    movk     w9, #0x8a10, lsl #16
    and      w8, w8, w9
    mov      w9, #0xe9da
    movk     w9, #0x20d1, lsl #16
    add      w8, w8, w9
    mov      w9, #0xcbfb
    movk     w9, #0x7154, lsl #16
    orr      w8, w8, w9
    ldr      d0, [sp, #0x58]
    str      d0, [x20]
    mov      w9, #0xd3aa
    movk     w9, #0x568c, lsl #16
    cmp      w8, w9
    mov      w8, #0x5abe
    movk     w8, #0x3f88, lsl #16
    mov      w9, #0x7741
    movk     w9, #0xbc28, lsl #16
    b        #0x24f240
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc70]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc74]
    sub      w8, w8, w9
    mov      w9, #0x7904
    movk     w9, #0xe0ac, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x5679
    movk     w9, #0xda53, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3f
    mov      w9, #0x27dd
    movk     w9, #0x1f7, lsl #16
    cmp      w8, w9
    mov      w8, #0x662b
    movk     w8, #0x8cc, lsl #16
    mov      w9, #0x333a
    movk     w9, #0xbb73, lsl #16
    b        #0x24f1b8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc28]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc2c]
    mov      w12, #0x25be
    movk     w12, #0x8cb4, lsl #16
    madd     w8, w8, w9, w12
    mov      w9, #0xd112
    movk     w9, #0xa13e, lsl #16
    and      w8, w8, w9
    ldr      x9, [sp, #0x18]
    cmp      x9, #0
    cset     w9, eq
    strb     w9, [sp, #0x3e]
    mov      w9, #0xb21f
    movk     w9, #0x57d3, lsl #16
    cmp      w8, w9
    mov      w8, #0x7224
    movk     w8, #0xc442, lsl #16
    csel     w8, w8, w11, ne
    b        #0x24f244
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc40]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc44]
    sub      w8, w8, w9
    mov      w9, #0x2ce1
    movk     w9, #0x8ab4, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x927e
    movk     w9, #0xa8a0, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x3a16
    movk     w9, #0x8c24, lsl #16
    add      w8, w8, w9
    mov      w9, #0x2ebf
    movk     w9, #0x213c, lsl #16
    cmp      w8, w9
    mov      w8, #0x57e0
    movk     w8, #0x5887, lsl #16
    mov      w9, #0xcec9
    movk     w9, #0x35da, lsl #16
    csel     w8, w9, w8, lo
    b        #0x24f244
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xbd8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xbdc]
    mul      w8, w8, w9
    mov      w9, #0x7f34
    movk     w9, #0x85d7, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x6915
    movk     w9, #0x2bab, lsl #16
    umull    x9, w8, w9
    lsr      x9, x9, #0x20
    sub      w8, w8, w9
    add      w8, w9, w8, lsr #1
    ldr      x9, [sp, #0x18]
    cmp      x9, #0
    cset     w9, eq
    strb     w9, [sp, #0x4f]
    mov      w9, #0xa6f6
    movk     w9, #0x8441, lsl #16
    cmp      w9, w8, lsr #29
    mov      w8, #0x9981
    movk     w8, #0xdb42, lsl #16
    csel     w8, w8, w10, hi
    b        #0x24f244
    ldr      x8, [sp, #0x20]
    mov      w9, #0x1696
    movk     w9, #0xaf40, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    mov      x8, #0xd70a
    movk     x8, #0x70a3, lsl #16
    movk     x8, #0xa3d, lsl #32
    movk     x8, #0x3fc7, lsl #48
    stur     x8, [x29, #-0x58]
    mov      x8, #0xa3d
    movk     x8, #0xa3d7, lsl #16
    movk     x8, #0x3d70, lsl #32
    movk     x8, #0x3fea, lsl #48
    str      x8, [sp, #0x60]
    mov      x8, #0xd70a
    movk     x8, #0x70a3, lsl #16
    movk     x8, #0xa3d, lsl #32
    movk     x8, #0x3fd7, lsl #48
    str      x8, [sp, #0x58]
    ldr      x8, [sp, #0x20]
    mov      w9, #0x662b
    movk     w9, #0x8cc, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc10]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc14]
    and      w8, w8, w9
    mov      w9, #0x78be
    movk     w9, #0x7ef4, lsl #16
    add      w8, w8, w9
    mov      w9, #0x911
    movk     w9, #0x10ea, lsl #16
    eor      w8, w8, w9
    mov      w9, #0xf624
    movk     w9, #0x6e15, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x5437
    movk     w9, #0x47f1, lsl #16
    cmp      w8, w9
    mov      w8, #0x7519
    movk     w8, #0x792a, lsl #16
    mov      w9, #0xf138
    movk     w9, #0x351a, lsl #16
    csel     w8, w8, w9, hi
    b        #0x24f244
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc00]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc04]
    sub      w8, w8, w9
    mov      w9, #0x6ecf
    movk     w9, #0x3955, lsl #16
    add      w8, w8, w9
    lsr      w8, w8, #1
    mov      w9, #0x584b
    movk     w9, #0x9c41, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3d
    mov      w9, #0x7abe
    movk     w9, #0x6c71, lsl #16
    add      w8, w8, w9
    mov      w9, #0x7ad4
    movk     w9, #0xc0ee, lsl #16
    cmp      w8, w9
    mov      w8, #0xcad7
    movk     w8, #0xcb75, lsl #16
    mov      w9, #0xcf31
    movk     w9, #0xdddd, lsl #16
    b        #0x24f1b8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc68]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc6c]
    udiv     w8, w8, w9
    mov      w9, #0x1753
    movk     w9, #0x112d, lsl #16
    add      w8, w8, w9
    mov      w9, #0xfeb3
    movk     w9, #0xd04c, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x7159
    movk     w9, #0xfca, lsl #16
    eor      w20, w8, w9
    ldr      x1, [sp, #0x40]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      w11, #0xf826
    movk     w11, #0x552e, lsl #16
    mov      w10, #0xaad2
    movk     w10, #0x6bb2, lsl #16
    cmp      x0, #9
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    mov      w8, #0xf4e7
    movk     w8, #0x5977, lsl #16
    cmp      w20, w8
    ldr      x20, [sp]
    mov      w8, #0xb47
    movk     w8, #0x2471, lsl #16
    mov      w9, #0xf07
    movk     w9, #0xa168, lsl #16
    csel     w8, w9, w8, hi
    b        #0x24f244
    ldur     d0, [x29, #-0x58]
    str      d0, [x22]
    ldr      x8, [sp, #0x20]
    mov      w9, #0xb1a4
    movk     w9, #0x8519, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    ldr      x8, [sp, #0x20]
    mov      w9, #0xf8b7
    movk     w9, #0xe6dd, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc18]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc1c]
    and      w8, w8, w9
    mov      w9, #4
    movk     w9, #0x95, lsl #16
    eor      w8, w8, w9
    mov      w9, #0xae93
    movk     w9, #0x3f48, lsl #16
    orr      w8, w8, w9
    ldur     d0, [x29, #-0x58]
    str      d0, [x22]
    mov      w9, #0x4c79
    movk     w9, #0xf2b3, lsl #16
    cmp      w8, w9
    mov      w8, #0xf138
    movk     w8, #0x351a, lsl #16
    mov      w9, #0xf26a
    movk     w9, #0x36ac, lsl #16
    csel     w8, w8, w9, eq
    ldr      x9, [sp, #0x20]
    str      w8, [x9]
    b        #0x24dbc8
    ldur     d0, [x29, #-0x58]
    str      d0, [x22]
    ldr      x8, [sp, #0x20]
    mov      w9, #0x7519
    movk     w9, #0x792a, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc30]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc34]
    mov      w12, #0xfe18
    movk     w12, #0xeaf9, lsl #16
    madd     w8, w8, w9, w12
    mov      w9, #0x8619
    movk     w9, #0xb53a, lsl #16
    orr      w8, w8, w9
    mov      w9, #0xfea8
    movk     w9, #0x48de, lsl #16
    add      w8, w8, w9
    mov      w9, #0x7200
    movk     w9, #0xb491, lsl #16
    cmp      w8, w9
    mov      w8, #0x1696
    movk     w8, #0xaf40, lsl #16
    mov      w9, #0x771d
    movk     w9, #0xaed3, lsl #16
    csel     w8, w8, w9, lo
    b        #0x24f244
    str      xzr, [x22]
    ldr      x8, [sp, #0x20]
    mov      w9, #0x3cf6
    movk     w9, #0xd31d, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    ldr      x8, [sp, #0x20]
    mov      w9, #0x221
    movk     w9, #0x5fa5, lsl #16
    str      w9, [x8]
    b        #0x24dbc8
    mov      w9, #0x2212
    movk     w9, #0xc671, lsl #16
    cmp      w8, w9
    b.ne     #0x24dbc8
    mov      w0, #1
    ldp      x29, x30, [sp, #0xc0]
    ldp      x20, x19, [sp, #0xb0]
    ldp      x22, x21, [sp, #0xa0]
    ldp      x24, x23, [sp, #0x90]
    ldp      x26, x25, [sp, #0x80]
    ldp      x28, x27, [sp, #0x70]
    add      sp, sp, #0xd0
    ret      

// -[WCLGColorPickerViewController loadCurrentColor] IMP=0x24F324 bounds=0x24F324-0x24F584
loc_24F324:
    sub      sp, sp, #0x70
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x19, x0
    mov      w20, #0x2874
    movk     w20, #0xb43c, lsl #16
    mov      w21, #0x19e8
    movk     w21, #0xaae3, lsl #16
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc80]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc84]
    orr      w8, w8, w9
    mov      w9, #0x4877
    movk     w9, #0xa123, lsl #16
    and      w8, w8, w9
    mov      w9, #0xfccb
    movk     w9, #0x1da0, lsl #16
    add      w8, w8, w9
    str      w8, [sp, #0xc]
    mov      w8, #0x81ff
    movk     w8, #0x57b1, lsl #16
    str      w8, [sp, #8]
    add      x8, sp, #8
    str      x8, [sp]
    mov      w23, #0x87ff
    movk     w23, #0x3ba9, lsl #16
    adrp     x28, #0x4c4000
    adrp     x22, #0x4c4000
    adrp     x24, #0x4c4000
    adrp     x25, #0x4c0000
    adrp     x26, #0x4c0000
    ldr      w8, [sp, #8]
    cmp      w8, w23
    b.gt     #0x24f458
    cmp      w8, w21
    b.eq     #0x24f480
    cmp      w8, w20
    b.ne     #0x24f3b8
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x918]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x920]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x928]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaa0]
    ldrsw    x9, [x28, #0xaa4]
    ldrsw    x10, [x22, #0xaa8]
    ldrsw    x11, [x24, #0xaac]
    ldr      x1, [x25, #0x930]
    add      x3, x19, x8
    add      x4, x19, x9
    add      x5, x19, x10
    add      x6, x19, x11
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x26, #0x938]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x24f3b8
    mov      w9, #0x81ff
    movk     w9, #0x57b1, lsl #16
    cmp      w8, w9
    b.ne     #0x24f554
    ldr      w8, [sp, #0xc]
    mov      w9, #0x9292
    movk     w9, #0xbae4, lsl #16
    cmp      w8, w9
    csel     w8, w20, w21, hi
    b        #0x24f548
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc88]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc8c]
    sub      w8, w8, w9
    mov      w9, #0x10c9
    movk     w9, #0x8199, lsl #16
    add      w8, w8, w9
    mov      w9, #0x2ae7
    movk     w9, #0x9efd, lsl #16
    eor      w8, w8, w9
    mov      w9, #0xe2
    movk     w9, #0x1923, lsl #16
    add      w27, w8, w9
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x918]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x920]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x928]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaa0]
    ldrsw    x9, [x28, #0xaa4]
    ldrsw    x10, [x22, #0xaa8]
    ldrsw    x11, [x24, #0xaac]
    ldr      x1, [x25, #0x930]
    add      x3, x19, x8
    add      x4, x19, x9
    add      x5, x19, x10
    add      x6, x19, x11
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x26, #0x938]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      w8, #0xf90b
    movk     w8, #0x30fc, lsl #16
    cmp      w27, w8
    mov      w8, #0x8800
    movk     w8, #0x3ba9, lsl #16
    csel     w8, w20, w8, lo
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x24f3b8
    mov      w9, #0x8800
    movk     w9, #0x3ba9, lsl #16
    cmp      w8, w9
    b.ne     #0x24f3b8
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    add      sp, sp, #0x70
    ret      

// -[WCLGColorPickerViewController updateHSVFromRGBPreservingHue:] IMP=0x24F584 bounds=0x24F584-0x24F9A4
loc_24F584:
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
    stur     w2, [x29, #-0xcc]
    mov      x19, x0
    mov      w20, #0x8c02
    movk     w20, #0xe280, lsl #16
    mov      w23, #0x796f
    movk     w23, #0x7770, lsl #16
    mov      w27, #0xb051
    movk     w27, #0x14a3, lsl #16
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc90]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc94]
    mul      w8, w8, w9
    mov      w9, #0xf5fe
    movk     w9, #0xd7f7, lsl #16
    orr      w8, w8, w9
    mov      w9, #0xfffe
    movk     w9, #0xd7ff, lsl #16
    and      w8, w8, w9
    stur     w8, [x29, #-0x84]
    mov      w8, #0x8b3c
    movk     w8, #0xae22, lsl #16
    stur     w8, [x29, #-0xbc]
    sub      x8, x29, #0xbc
    stur     x8, [x29, #-0xc8]
    mov      w28, #0xb050
    movk     w28, #0x14a3, lsl #16
    mov      w24, #0xf125
    movk     w24, #0x84d6, lsl #16
    fmov     d10, xzr
    fmov     d11, #1.00000000
    adrp     x26, #0x4c4000
    adrp     x25, #0x4c0000
    adrp     x8, #0x491000
    ldr      d12, [x8, #0x3a0]
    ldur     w8, [x29, #-0xbc]
    cmp      w8, w28
    b.le     #0x24f78c
    cmp      w8, w27
    b.eq     #0x24f7c4
    mov      w9, #0xbad6
    movk     w9, #0x5b1e, lsl #16
    cmp      w8, w9
    b.eq     #0x24f8c8
    cmp      w8, w23
    b.ne     #0x24f63c
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xc98]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xc9c]
    eor      w8, w8, w9
    mov      w9, #0xd6e4
    movk     w9, #0x357e, lsl #16
    add      w22, w8, w9
    sub      x8, sp, #0x10
    mov      sp, x8
    stur     x8, [x29, #-0x90]
    sub      x8, sp, #0x10
    mov      sp, x8
    stur     x8, [x29, #-0x98]
    sub      x8, sp, #0x10
    mov      sp, x8
    stur     x8, [x29, #-0xa0]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x940]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldp      x8, x9, [x29, #-0x98]
    str      d0, [x9]
    str      xzr, [x8]
    ldur     x8, [x29, #-0xa0]
    str      xzr, [x8]
    ldr      x21, [x26, #0x90]
    ldr      x1, [x25, #0x948]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x950]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x958]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d2, d0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8f8]
    fmov     d3, #1.00000000
    mov      x0, x21
    fmov     d0, d8
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x960]
    ldp      x3, x2, [x29, #-0x98]
    ldur     x4, [x29, #-0xa0]
    mov      x5, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x98]
    ldr      d0, [x8]
    stur     d0, [x29, #-0xa8]
    fcmp     d0, d12
    ldur     w8, [x29, #-0xcc]
    csel     w8, wzr, w8, gt
    sturb    w8, [x29, #-0xa9]
    mov      w8, #0x9811
    movk     w8, #0xf91, lsl #16
    cmp      w22, w8
    mov      w8, #0xbad6
    movk     w8, #0x5b1e, lsl #16
    csel     w8, w8, w27, hi
    b        #0x24f7b8
    cmp      w8, w24
    b.eq     #0x24f8e8
    mov      w9, #0x8b3c
    movk     w9, #0xae22, lsl #16
    cmp      w8, w9
    b.ne     #0x24f924
    ldur     w8, [x29, #-0x84]
    mov      w9, #0xb3ed
    movk     w9, #0x2420, lsl #16
    cmp      w8, w9
    csel     w8, w23, w27, hi
    ldur     x9, [x29, #-0xc8]
    str      w8, [x9]
    b        #0x24f63c
    mov      x24, sp
    sub      x21, x24, #0x10
    mov      sp, x21
    mov      x27, x25
    mov      x25, x26
    mov      x26, sp
    sub      x22, x26, #0x10
    mov      sp, x22
    mov      x20, sp
    sub      x23, x20, #0x10
    mov      sp, x23
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x940]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    stur     d0, [x24, #-0x10]
    stur     xzr, [x26, #-0x10]
    mov      x26, x25
    mov      x25, x27
    mov      w27, #0xb051
    movk     w27, #0x14a3, lsl #16
    stur     xzr, [x20, #-0x10]
    mov      w20, #0x8c02
    movk     w20, #0xe280, lsl #16
    ldr      x24, [x26, #0x90]
    ldr      x1, [x25, #0x948]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x950]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x958]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d2, d0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8f8]
    fmov     d3, #1.00000000
    mov      x0, x24
    fmov     d0, d8
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x960]
    mov      x2, x21
    mov      x3, x22
    mov      x4, x23
    mov      w23, #0x796f
    movk     w23, #0x7770, lsl #16
    mov      x5, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    mov      w24, #0xf125
    movk     w24, #0x84d6, lsl #16
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0xc8]
    str      w23, [x8]
    b        #0x24f63c
    ldurb    w8, [x29, #-0xa9]
    cmp      w8, #0
    csel     w8, w20, w24, ne
    ldur     x9, [x29, #-0xc8]
    str      w8, [x9]
    ldur     d0, [x29, #-0xa8]
    stur     d0, [x29, #-0xb8]
    b        #0x24f63c
    ldur     x8, [x29, #-0x90]
    ldr      d0, [x8]
    fmaxnm   d0, d0, d10
    fcmp     d0, d11
    fcsel    d0, d11, d0, gt
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x968]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldur     x8, [x29, #-0x98]
    ldr      d0, [x8]
    ldur     x8, [x29, #-0xc8]
    str      w20, [x8]
    stur     d0, [x29, #-0xb8]
    b        #0x24f63c
    cmp      w8, w20
    b.ne     #0x24f63c
    ldur     d0, [x29, #-0xb8]
    fmov     d8, xzr
    fmaxnm   d0, d0, d8
    fmov     d9, #1.00000000
    fcmp     d0, d9
    fcsel    d0, d9, d0, gt
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x970]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldur     x8, [x29, #-0xa0]
    ldr      d0, [x8]
    fmaxnm   d0, d0, d8
    fcmp     d0, d9
    fcsel    d0, d9, d0, gt
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x978]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
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

// -[WCLGColorPickerViewController updateRGBFromHSV] IMP=0x24F9A4 bounds=0x24F9A4-0x24FDE0
loc_24F9A4:
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
    sub      sp, sp, #0x20
    mov      x19, x0
    mov      w10, #0xc7f8
    movk     w10, #0x6dbf, lsl #16
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xca0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xca4]
    sub      w8, w8, w9
    mov      w9, #0x94a2
    movk     w9, #0x9610, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x235d
    movk     w9, #0x40a8, lsl #16
    orr      w8, w8, w9
    stur     w8, [x29, #-0x84]
    mov      w8, #0x6779
    movk     w8, #0x35f2, lsl #16
    stur     w8, [x29, #-0x88]
    sub      x8, x29, #0x88
    stur     x8, [x29, #-0x90]
    mov      w11, #0x6778
    movk     w11, #0x35f2, lsl #16
    fmov     d11, xzr
    fmov     d12, #1.00000000
    ldur     w8, [x29, #-0x88]
    cmp      w8, w11
    b.le     #0x24fa74
    cmp      w8, w10
    b.eq     #0x24fbe8
    mov      w9, #0x6779
    movk     w9, #0x35f2, lsl #16
    cmp      w8, w9
    b.ne     #0x24fa30
    ldur     w8, [x29, #-0x84]
    mov      w9, #0x75d6
    movk     w9, #0x4e5e, lsl #16
    cmp      w8, w9
    mov      w8, #0xad26
    movk     w8, #0xc6d9, lsl #16
    csel     w8, w10, w8, ne
    b        #0x24fd98
    mov      w9, #0xad26
    movk     w9, #0xc6d9, lsl #16
    cmp      w8, w9
    b.ne     #0x24fda4
    mov      x27, sp
    sub      x20, x27, #0x10
    mov      sp, x20
    mov      x28, sp
    sub      x21, x28, #0x10
    mov      sp, x21
    mov      x26, sp
    sub      x22, x26, #0x10
    mov      sp, x22
    mov      x25, sp
    sub      x23, x25, #0x10
    mov      sp, x23
    adrp     x8, #0x4c4000
    ldr      x24, [x8, #0x90]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x940]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x980]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x988]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9c0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d3, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x860]
    mov      x0, x24
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    stur     xzr, [x27, #-0x10]
    stur     xzr, [x28, #-0x10]
    stur     xzr, [x26, #-0x10]
    mov      x8, #0x3ff0000000000000
    stur     x8, [x25, #-0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x7e8]
    mov      x2, x20
    mov      x3, x21
    mov      x4, x22
    mov      x5, x23
    bl       #0x461c6c // _objc_msgSend
    ldur     d0, [x27, #-0x10]
    fmaxnm   d0, d0, d11
    fcmp     d0, d12
    fcsel    d0, d12, d0, gt
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x990]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldur     d0, [x28, #-0x10]
    fmaxnm   d0, d0, d11
    fcmp     d0, d12
    fcsel    d0, d12, d0, gt
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x998]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldur     d0, [x26, #-0x10]
    fmaxnm   d0, d0, d11
    fcmp     d0, d12
    fcsel    d0, d12, d0, gt
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9a0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      w11, #0x6778
    movk     w11, #0x35f2, lsl #16
    mov      w10, #0xc7f8
    movk     w10, #0x6dbf, lsl #16
    ldur     x8, [x29, #-0x90]
    str      w10, [x8]
    b        #0x24fa30
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xca8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xcac]
    orr      w8, w8, w9
    mov      w9, #0x8869
    movk     w9, #0xc0f, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x2c82
    movk     w9, #0x3fcf, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x550c
    movk     w9, #0x2a3f, lsl #16
    orr      w8, w8, w9
    stur     w8, [x29, #-0x94]
    mov      x25, sp
    sub      x20, x25, #0x10
    mov      sp, x20
    mov      x27, sp
    sub      x21, x27, #0x10
    mov      sp, x21
    mov      x28, sp
    sub      x22, x28, #0x10
    mov      sp, x22
    mov      x26, sp
    sub      x23, x26, #0x10
    mov      sp, x23
    adrp     x8, #0x4c4000
    ldr      x24, [x8, #0x90]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x940]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x980]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x988]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9c0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d3, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x860]
    mov      x0, x24
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    stur     xzr, [x25, #-0x10]
    stur     xzr, [x27, #-0x10]
    stur     xzr, [x28, #-0x10]
    mov      x8, #0x3ff0000000000000
    stur     x8, [x26, #-0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x7e8]
    mov      x2, x20
    mov      x3, x21
    mov      x4, x22
    mov      x5, x23
    bl       #0x461c6c // _objc_msgSend
    ldur     d0, [x25, #-0x10]
    fmaxnm   d0, d0, d11
    fcmp     d0, d12
    fcsel    d0, d12, d0, gt
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x990]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldur     d0, [x27, #-0x10]
    fmaxnm   d0, d0, d11
    fcmp     d0, d12
    fcsel    d0, d12, d0, gt
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x998]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldur     d0, [x28, #-0x10]
    fmaxnm   d0, d0, d11
    fcmp     d0, d12
    fcsel    d0, d12, d0, gt
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9a0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      w11, #0x6778
    movk     w11, #0x35f2, lsl #16
    mov      w10, #0xc7f8
    movk     w10, #0x6dbf, lsl #16
    mov      w8, #0x76fa
    movk     w8, #0x60a2, lsl #16
    ldur     w9, [x29, #-0x94]
    cmp      w9, w8
    mov      w8, #0xd3aa
    movk     w8, #0xbf3a, lsl #16
    csel     w8, w10, w8, lo
    ldur     x9, [x29, #-0x90]
    str      w8, [x9]
    b        #0x24fa30
    mov      w9, #0xd3aa
    movk     w9, #0xbf3a, lsl #16
    cmp      w8, w9
    b.ne     #0x24fa30
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

// -[WCLGColorPickerViewController markCustomMode] IMP=0x24FDE0 bounds=0x24FDE0-0x250028
loc_24FDE0:
    sub      sp, sp, #0x90
    stp      d11, d10, [sp, #0x10]
    stp      d9, d8, [sp, #0x20]
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x19, x0
    mov      w20, #0xff00
    movk     w20, #0x4187, lsl #16
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xcb0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xcb4]
    eor      w8, w8, w9
    mov      w9, #0xc9c8
    movk     w9, #0xb70c, lsl #16
    add      w8, w8, w9
    mov      w9, #0xc305
    movk     w9, #0xcd8b, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x36aa
    movk     w9, #0x44d3, lsl #16
    add      w8, w8, w9
    str      w8, [sp, #0xc]
    mov      w8, #0x8001
    movk     w8, #0xa518, lsl #16
    str      w8, [sp, #8]
    add      x8, sp, #8
    str      x8, [sp]
    mov      w22, #0x95ac
    movk     w22, #0xfbed, lsl #16
    mov      w24, #0x95ad
    movk     w24, #0xfbed, lsl #16
    adrp     x26, #0x4c0000
    adrp     x27, #0x4c0000
    adrp     x28, #0x4c0000
    adrp     x23, #0x4be000
    adrp     x21, #0x4c0000
    ldr      w8, [sp, #8]
    cmp      w8, w22
    b.le     #0x24ff54
    cmp      w8, w24
    b.eq     #0x24ff84
    cmp      w8, w20
    b.ne     #0x24fe88
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xcb8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xcbc]
    sub      w8, w8, w9
    mov      w9, #0xd331
    movk     w9, #0x7ca9, lsl #16
    and      w8, w8, w9
    mov      w9, #0xe502
    movk     w9, #0x69d9, lsl #16
    mov      w10, #0x1726
    movk     w10, #0xb9b8, lsl #16
    madd     w25, w8, w9, w10
    ldr      x1, [x26, #0x948]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    ldr      x1, [x27, #0x950]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    ldr      x1, [x28, #0x958]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    ldr      x1, [x23, #0x9c0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d3, d0
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    bl       #0x2605e8
    mov      x2, x0
    ldr      x1, [x21, #0x920]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      w8, #0x3679
    movk     w8, #0x447a, lsl #16
    cmp      w25, w8
    mov      w8, #0x8b2
    movk     w8, #0x80df, lsl #16
    csel     w8, w8, w20, lo
    b        #0x24ff78
    mov      w9, #0x8001
    movk     w9, #0xa518, lsl #16
    cmp      w8, w9
    b.ne     #0x24fff0
    ldr      w8, [sp, #0xc]
    mov      w9, #0xc081
    movk     w9, #0xa232, lsl #16
    cmp      w8, w9
    csel     w8, w24, w20, eq
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x24fe88
    ldr      x1, [x26, #0x948]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    ldr      x1, [x27, #0x950]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    ldr      x1, [x28, #0x958]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    ldr      x1, [x23, #0x9c0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d3, d0
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    bl       #0x2605e8
    mov      x2, x0
    ldr      x1, [x21, #0x920]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp]
    str      w20, [x8]
    b        #0x24fe88
    mov      w9, #0x8b2
    movk     w9, #0x80df, lsl #16
    cmp      w8, w9
    b.ne     #0x24fe88
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    ldp      d11, d10, [sp, #0x10]
    add      sp, sp, #0x90
    ret      

// -[WCLGColorPickerViewController storeCurrentModeForActiveAppearance] IMP=0x250028 bounds=0x250028-0x25026C
loc_250028:
    sub      sp, sp, #0x80
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    mov      x19, x0
    mov      w21, #0x35e1
    movk     w21, #0xb74e, lsl #16
    mov      w22, #0x2dda
    movk     w22, #0x8af2, lsl #16
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9a8]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    mov      w10, #0xbce5
    movk     w10, #0x90, lsl #16
    ldr      x8, [x8, #0x898]
    add      x9, sp, #0x14
    mov      w24, #0xbce4
    movk     w24, #0x90, lsl #16
    str      x8, [sp, #0x18]
    str      w10, [sp, #0x14]
    str      x9, [sp, #8]
    adrp     x28, #0x4c0000
    add      x28, x28, #0x9b8
    mov      w23, #0x1cf7
    movk     w23, #0xa4c8, lsl #16
    mov      w25, #0x9ac8
    movk     w25, #0x2e6c, lsl #16
    mov      w26, #0x2710
    movk     w26, #0x219f, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w24
    b.le     #0x2500f4
    cmp      w8, w25
    b.eq     #0x250110
    cmp      w8, w26
    b.eq     #0x250160
    mov      w9, #0xbce5
    movk     w9, #0x90, lsl #16
    cmp      w8, w9
    b.ne     #0x2500b0
    ldr      x1, [sp, #0x18]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    csel     w8, w26, w21, ne
    b        #0x250238
    cmp      w8, w22
    b.eq     #0x2501b4
    cmp      w8, w23
    b.ne     #0x250244
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x2500b0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8b8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x928]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    cmp      w20, #0
    adrp     x8, #0x4c0000
    add      x8, x8, #0x9b0
    csel     x8, x8, x28, ne
    ldr      x1, [x8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    str      w22, [x8]
    b        #0x2500b0
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xcc0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xcc4]
    udiv     w8, w8, w9
    mov      w9, #0x7ed3
    movk     w9, #0xc182, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3e
    mov      w9, #0x677d
    movk     w9, #0xd750, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x4f1
    movk     w9, #0x8bca, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3e
    mov      w9, #0x8d8d
    movk     w9, #0xf8dd, lsl #16
    cmp      w8, w9
    csel     w8, w25, w22, eq
    b        #0x250238
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xcc8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xccc]
    orr      w8, w8, w9
    eor      w8, w8, #0xfffff00f
    mov      w9, #0x931b
    movk     w9, #0x180f, lsl #16
    and      w8, w8, w9
    mov      w9, #0xfe56
    movk     w9, #0xc969, lsl #16
    eor      w27, w8, w9
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8b8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x928]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    cmp      w20, #0
    adrp     x8, #0x4c0000
    add      x8, x8, #0x9b0
    csel     x8, x8, x28, ne
    ldr      x1, [x8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      w8, #0x195a
    movk     w8, #0xd66, lsl #16
    cmp      w27, w8
    csel     w8, w23, w22, hi
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x2500b0
    cmp      w8, w21
    b.ne     #0x2500b0
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    add      sp, sp, #0x80
    ret      

// -[WCLGColorPickerViewController currentHexString] IMP=0x25026C bounds=0x25026C-0x2509A8
loc_25026C:
    sub      sp, sp, #0x100
    stp      d11, d10, [sp, #0x80]
    stp      d9, d8, [sp, #0x90]
    stp      x28, x27, [sp, #0xa0]
    stp      x26, x25, [sp, #0xb0]
    stp      x24, x23, [sp, #0xc0]
    stp      x22, x21, [sp, #0xd0]
    stp      x20, x19, [sp, #0xe0]
    stp      x29, x30, [sp, #0xf0]
    add      x29, sp, #0xf0
    mov      x19, x0
    mov      w22, #0xa79e
    movk     w22, #0xb1c4, lsl #16
    mov      w25, #0xbcb9
    movk     w25, #0x46c9, lsl #16
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xcd0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xcd4]
    add      w8, w8, w9
    mov      w9, #0x119c
    movk     w9, #0x2912, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x539e
    movk     w9, #0x6f12, lsl #16
    and      w8, w8, w9
    mov      w9, #0x7b7a
    movk     w9, #0x8c45, lsl #16
    add      w8, w8, w9
    str      w8, [sp, #0x74]
    mov      w8, #0x772a
    movk     w8, #0x60d6, lsl #16
    str      w8, [sp, #0x2c]
    add      x8, sp, #0x2c
    str      x8, [sp, #0x20]
    mov      w28, #0xf8bb
    movk     w28, #0x2757, lsl #16
    mov      w20, #0xb1cd
    movk     w20, #0xa464, lsl #16
    mov      w21, #0xbcb8
    movk     w21, #0x46c9, lsl #16
    adrp     x24, #0x522000
    add      x24, x24, #0x320
    adrp     x26, #0x522000
    add      x26, x26, #0x340
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x4d0]
    fmov     d9, xzr
    fmov     d10, #1.00000000
    adrp     x27, #0x522000
    add      x27, x27, #0x2e0
    adrp     x23, #0x522000
    add      x23, x23, #0x300
    ldr      w8, [sp, #0x2c]
    cmp      w8, w28
    b.le     #0x2504b8
    cmp      w8, w21
    b.gt     #0x250500
    mov      w9, #0xf8bc
    movk     w9, #0x2757, lsl #16
    cmp      w8, w9
    b.eq     #0x2505c8
    mov      w9, #0x6e7a
    movk     w9, #0x36b1, lsl #16
    cmp      w8, w9
    b.eq     #0x2508e0
    mov      w9, #0xbcad
    movk     w9, #0x3a39, lsl #16
    cmp      w8, w9
    b.ne     #0x250340
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xce8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xcec]
    sub      w8, w8, w9
    mov      w9, #0x3ae2
    movk     w9, #0x67e4, lsl #16
    mov      w10, #0xab58
    movk     w10, #0x872b, lsl #16
    madd     w22, w8, w9, w10
    adrp     x8, #0x57f000
    add      x8, x8, #0x9c8
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x948]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmaxnm   d0, d0, d9
    fcmp     d0, d10
    fcsel    d0, d10, d0, gt
    fmul     d0, d0, d8
    frintx   d0, d0
    fcvtzs   x8, d0
    str      x8, [sp, #0x68]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x950]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmaxnm   d0, d0, d9
    fcmp     d0, d10
    fcsel    d0, d10, d0, gt
    fmul     d0, d0, d8
    frintx   d0, d0
    fcvtzs   x8, d0
    str      x8, [sp, #0x60]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x958]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmaxnm   d0, d0, d9
    fcmp     d0, d10
    fcsel    d0, d10, d0, gt
    fmul     d0, d0, d8
    frintx   d0, d0
    fcvtzs   x8, d0
    str      x8, [sp, #0x58]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9c0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmaxnm   d0, d0, d9
    fcmp     d0, d10
    fcsel    d0, d10, d0, gt
    fmul     d0, d0, d8
    frintx   d0, d0
    fcvtzs   x8, d0
    str      x8, [sp, #0x50]
    cmp      x8, #0xfe
    cset     w8, gt
    strb     w8, [sp, #0x4f]
    adrp     x8, #0x4c4000
    ldr      x9, [x8, #0xb8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x620]
    stp      x8, x9, [sp, #0x38]
    mov      w8, #0xc37
    movk     w8, #0x8bd8, lsl #16
    cmp      w22, w8
    mov      w22, #0xa79e
    movk     w22, #0xb1c4, lsl #16
    mov      w8, #0xef9a
    movk     w8, #0x5cea, lsl #16
    mov      w9, #0x6e7a
    movk     w9, #0x36b1, lsl #16
    csel     w8, w8, w9, lo
    b        #0x2508fc
    cmp      w8, w20
    b.le     #0x250548
    mov      w9, #0xb1ce
    movk     w9, #0xa464, lsl #16
    cmp      w8, w9
    b.eq     #0x250588
    cmp      w8, w22
    b.eq     #0x250870
    mov      w9, #0x2bac
    movk     w9, #0xb72e, lsl #16
    cmp      w8, w9
    b.ne     #0x250340
    adrp     x8, #0x57f000
    add      x8, x8, #0x9c8
    ldar     wzr, [x8]
    ldr      x8, [sp, #0x20]
    str      w22, [x8]
    b        #0x250340
    cmp      w8, w25
    b.eq     #0x250814
    mov      w9, #0xef9a
    movk     w9, #0x5cea, lsl #16
    cmp      w8, w9
    b.eq     #0x250908
    mov      w9, #0x772a
    movk     w9, #0x60d6, lsl #16
    cmp      w8, w9
    b.ne     #0x250340
    ldr      w8, [sp, #0x74]
    mov      w9, #0x1665
    movk     w9, #0x9873, lsl #16
    cmp      w8, w9
    mov      w8, #0x2bac
    movk     w8, #0xb72e, lsl #16
    csel     w8, w8, w22, eq
    b        #0x2508fc
    mov      w9, #0xc73a
    movk     w9, #0x859e, lsl #16
    cmp      w8, w9
    b.eq     #0x250858
    mov      w9, #0xe830
    movk     w9, #0x952c, lsl #16
    cmp      w8, w9
    b.ne     #0x25096c
    ldp      x9, x8, [sp, #0x60]
    ldr      x10, [sp, #0x58]
    ldp      x1, x0, [sp, #0x38]
    stp      x9, x10, [sp, #8]
    str      x8, [sp]
    adrp     x2, #0x522000
    add      x2, x2, #0x3c0
    b        #0x2505a4
    ldp      x9, x8, [sp, #0x60]
    ldp      x11, x10, [sp, #0x50]
    ldp      x1, x0, [sp, #0x38]
    stp      x10, x11, [sp, #0x10]
    stp      x8, x9, [sp]
    adrp     x2, #0x522000
    add      x2, x2, #0x380
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldr      x8, [sp, #0x20]
    mov      w9, #0x81ca
    movk     w9, #0x8eff, lsl #16
    str      w9, [x8]
    str      x0, [sp, #0x30]
    b        #0x250340
    ldrb     w8, [x24]
    mov      w9, #0x6a
    eor      w8, w8, w9
    strb     w8, [x26]
    ldrb     w8, [x24, #1]
    mov      w10, #0xd7
    eor      w8, w8, w10
    strb     w8, [x26, #1]
    ldrb     w8, [x24, #2]
    mov      w10, #0x4a
    eor      w8, w8, w10
    strb     w8, [x26, #2]
    ldrb     w8, [x24, #3]
    mov      w10, #0x72
    eor      w8, w8, w10
    strb     w8, [x26, #3]
    ldrb     w8, [x24, #4]
    mov      w10, #0x29
    eor      w8, w8, w10
    strb     w8, [x26, #4]
    ldrb     w8, [x24, #5]
    mov      w10, #0x56
    eor      w8, w8, w10
    strb     w8, [x26, #5]
    ldrb     w8, [x24, #6]
    mov      w10, #0x6c
    eor      w8, w8, w10
    strb     w8, [x26, #6]
    ldrb     w8, [x24, #7]
    mov      w10, #0xa0
    eor      w8, w8, w10
    strb     w8, [x26, #7]
    ldrb     w8, [x24, #8]
    mov      w10, #0x73
    eor      w8, w8, w10
    strb     w8, [x26, #8]
    ldrb     w8, [x24, #9]
    mov      w10, #0x79
    eor      w8, w8, w10
    strb     w8, [x26, #9]
    ldrb     w8, [x24, #0xa]
    eor      w8, w8, #0xffffffc7
    strb     w8, [x26, #0xa]
    ldrb     w8, [x24, #0xb]
    eor      w8, w8, #0xfe
    strb     w8, [x26, #0xb]
    ldrb     w8, [x24, #0xc]
    mov      w10, #0x90
    eor      w8, w8, w10
    strb     w8, [x26, #0xc]
    ldrb     w8, [x24, #0xd]
    mov      w10, #0x21
    eor      w8, w8, w10
    strb     w8, [x26, #0xd]
    ldrb     w8, [x24, #0xe]
    mov      w10, #0xa6
    eor      w8, w8, w10
    strb     w8, [x26, #0xe]
    ldrb     w8, [x24, #0xf]
    eor      w8, w8, w9
    strb     w8, [x26, #0xf]
    ldrb     w8, [x24, #0x10]
    mov      w9, #0x5f
    eor      w8, w8, w9
    strb     w8, [x26, #0x10]
    ldrb     w8, [x27]
    eor      w8, w8, #2
    strb     w8, [x23]
    ldrb     w8, [x27, #1]
    eor      w8, w8, #0xffffffe7
    strb     w8, [x23, #1]
    ldrb     w8, [x27, #2]
    eor      w8, w8, #4
    strb     w8, [x23, #2]
    ldrb     w8, [x27, #3]
    mov      w10, #0xc9
    eor      w8, w8, w10
    strb     w8, [x23, #3]
    ldrb     w8, [x27, #4]
    eor      w8, w8, #0x20
    strb     w8, [x23, #4]
    ldrb     w8, [x27, #5]
    mov      w10, #0xb8
    eor      w8, w8, w10
    strb     w8, [x23, #5]
    ldrb     w8, [x27, #6]
    mov      w10, #0x12
    eor      w8, w8, w10
    strb     w8, [x23, #6]
    ldrb     w8, [x27, #7]
    mov      w10, #0xd2
    eor      w8, w8, w10
    strb     w8, [x23, #7]
    ldrb     w8, [x27, #8]
    mvn      w8, w8
    strb     w8, [x23, #8]
    ldrb     w8, [x27, #9]
    mov      w10, #0xe6
    eor      w8, w8, w10
    strb     w8, [x23, #9]
    ldrb     w8, [x27, #0xa]
    mov      w10, #0xd9
    eor      w8, w8, w10
    strb     w8, [x23, #0xa]
    ldrb     w8, [x27, #0xb]
    mov      w10, #0x8d
    eor      w8, w8, w10
    strb     w8, [x23, #0xb]
    ldrb     w8, [x27, #0xc]
    mov      w10, #0x85
    eor      w8, w8, w10
    strb     w8, [x23, #0xc]
    ldrb     w8, [x27, #0xd]
    eor      w8, w8, #0x22222222
    strb     w8, [x23, #0xd]
    ldrb     w8, [x27, #0xe]
    mov      w10, #0x2f
    eor      w8, w8, w10
    strb     w8, [x23, #0xe]
    ldrb     w8, [x27, #0xf]
    eor      w8, w8, #0xffffff9f
    strb     w8, [x23, #0xf]
    ldrb     w8, [x27, #0x10]
    eor      w8, w8, #0xffffffc1
    strb     w8, [x23, #0x10]
    ldrb     w8, [x27, #0x11]
    eor      w8, w8, w9
    strb     w8, [x23, #0x11]
    ldrb     w8, [x27, #0x12]
    mov      w9, #0xb5
    eor      w8, w8, w9
    strb     w8, [x23, #0x12]
    ldrb     w8, [x27, #0x13]
    mov      w9, #0xed
    eor      w8, w8, w9
    strb     w8, [x23, #0x13]
    ldrb     w8, [x27, #0x14]
    mov      w9, #0xa7
    eor      w8, w8, w9
    strb     w8, [x23, #0x14]
    ldrb     w8, [x27, #0x15]
    mov      w9, #0xa5
    eor      w8, w8, w9
    strb     w8, [x23, #0x15]
    ldr      x8, [sp, #0x20]
    str      w25, [x8]
    b        #0x250340
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xce0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xce4]
    eor      w8, w8, w9
    mov      w9, #0x6865
    movk     w9, #0xf16a, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x4d0c
    movk     w9, #0xd331, lsl #16
    cmp      w8, w9
    mov      w8, #0xef9a
    movk     w8, #0x5cea, lsl #16
    mov      w9, #0xbcad
    movk     w9, #0x3a39, lsl #16
    csel     w8, w8, w9, hi
    b        #0x2508fc
    ldrb     w8, [sp, #0x73]
    cmp      w8, #0
    mov      w8, #0xf8bc
    movk     w8, #0x2757, lsl #16
    csel     w8, w8, w25, ne
    b        #0x2508fc
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xcd8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xcdc]
    eor      w8, w8, w9
    mov      w9, #0x12b6
    movk     w9, #0x195e, lsl #16
    add      w8, w8, w9
    mov      w9, #0x2587
    movk     w9, #0x1b08, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3c
    mov      w9, #0xb6f7
    movk     w9, #0xd5c1, lsl #16
    add      w8, w8, w9
    adrp     x9, #0x57f000
    add      x9, x9, #0x9c8
    ldar     w9, [x9]
    cmp      w9, #0
    cset     w9, eq
    strb     w9, [sp, #0x73]
    mov      w9, #0xb65a
    movk     w9, #0xc92b, lsl #16
    cmp      w8, w9
    mov      w8, #0xc73a
    movk     w8, #0x859e, lsl #16
    csel     w8, w8, w22, hi
    b        #0x2508fc
    ldrb     w8, [sp, #0x4f]
    cmp      w8, #0
    mov      w8, #0xe830
    movk     w8, #0x952c, lsl #16
    mov      w9, #0xb1ce
    movk     w9, #0xa464, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [sp, #0x20]
    str      w8, [x9]
    b        #0x250340
    adrp     x8, #0x57f000
    add      x8, x8, #0x9c8
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x948]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x950]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x958]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9c0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x20]
    mov      w9, #0xbcad
    movk     w9, #0x3a39, lsl #16
    str      w9, [x8]
    b        #0x250340
    mov      w9, #0x81ca
    movk     w9, #0x8eff, lsl #16
    cmp      w8, w9
    b.ne     #0x250340
    ldr      x0, [sp, #0x30]
    ldp      x29, x30, [sp, #0xf0]
    ldp      x20, x19, [sp, #0xe0]
    ldp      x22, x21, [sp, #0xd0]
    ldp      x24, x23, [sp, #0xc0]
    ldp      x26, x25, [sp, #0xb0]
    ldp      x28, x27, [sp, #0xa0]
    ldp      d9, d8, [sp, #0x90]
    ldp      d11, d10, [sp, #0x80]
    add      sp, sp, #0x100
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGColorPickerViewController primaryTextColor] IMP=0x2509A8 bounds=0x2509A8-0x250BB4
loc_2509A8:
    sub      sp, sp, #0xa0
    stp      d9, d8, [sp, #0x30]
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      w19, #0xb943
    movk     w19, #0xbce8, lsl #16
    mov      w20, #0xeb67
    movk     w20, #0xb3e4, lsl #16
    mov      w21, #0x8263
    movk     w21, #0xa07c, lsl #16
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9c0]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x2f]
    mov      w22, #0x4c45
    movk     w22, #0x7d58, lsl #16
    str      w22, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w23, #0xdf21
    movk     w23, #0x1f92, lsl #16
    mov      w24, #0xb942
    movk     w24, #0xbce8, lsl #16
    adrp     x25, #0x4be000
    adrp     x8, #0x491000
    mov      w26, #0xe1a9
    movk     w26, #0x7a48, lsl #16
    ldr      d8, [x8, #0x3f8]
    mov      w27, #0x9981
    movk     w27, #0x1b49, lsl #16
    mov      w28, #0xdf22
    movk     w28, #0x1f92, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w23
    b.gt     #0x250a88
    cmp      w8, w24
    b.le     #0x250abc
    cmp      w8, w19
    b.eq     #0x250af0
    cmp      w8, w27
    b.ne     #0x250a3c
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x2f8]
    ldr      x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldr      x8, [sp]
    str      w21, [x8]
    str      x0, [sp, #0x10]
    b        #0x250a3c
    cmp      w8, w28
    b.eq     #0x250b18
    cmp      w8, w26
    b.eq     #0x250b70
    cmp      w8, w22
    b.ne     #0x250a3c
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x90]
    str      x8, [sp, #0x20]
    ldrb     w8, [sp, #0x2f]
    cmp      w8, #0
    csel     w8, w28, w27, ne
    b        #0x250b64
    cmp      w8, w20
    b.ne     #0x250b84
    ldr      x1, [x25, #0xbf0]
    ldr      x0, [sp, #0x20]
    fmov     d0, #1.00000000
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x18]
    ldr      x8, [sp]
    str      w26, [x8]
    b        #0x250a3c
    ldr      x1, [x25, #0xbf0]
    ldr      x0, [sp, #0x20]
    fmov     d0, #1.00000000
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldr      x8, [sp]
    str      w20, [x8]
    b        #0x250a3c
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xcf0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xcf4]
    add      w8, w8, w9
    mov      w9, #0xcf2e
    movk     w9, #0xc784, lsl #16
    add      w8, w8, w9
    mov      w9, #0x23c0
    movk     w9, #0x74a6, lsl #16
    and      w8, w8, w9
    mov      w9, #0xef7
    movk     w9, #0x5c6, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x35
    mov      w9, #0x20d0
    movk     w9, #0xfaed, lsl #16
    cmp      w8, w9
    csel     w8, w19, w20, hi
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x250a3c
    ldr      x8, [sp]
    str      w21, [x8]
    ldr      x8, [sp, #0x18]
    str      x8, [sp, #0x10]
    b        #0x250a3c
    cmp      w8, w21
    b.ne     #0x250a3c
    ldr      x0, [sp, #0x10]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    ldp      d9, d8, [sp, #0x30]
    add      sp, sp, #0xa0
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGColorPickerViewController secondaryTextColor] IMP=0x250BB4 bounds=0x250BB4-0x250CE0
loc_250BB4:
    sub      sp, sp, #0x90
    stp      d9, d8, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      w19, #0x1e2d
    movk     w19, #0x55, lsl #16
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9c0]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x2f]
    mov      w20, #0xf45b
    movk     w20, #0xced6, lsl #16
    str      w20, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w21, #0x7a21
    movk     w21, #0x3efd, lsl #16
    adrp     x22, #0x4c4000
    mov      w23, #0x7a22
    movk     w23, #0x3efd, lsl #16
    mov      w24, #0x3f5a
    movk     w24, #0x45fc, lsl #16
    adrp     x25, #0x4bf000
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x8b0]
    adrp     x26, #0x4be000
    ldr      w8, [sp, #0x14]
    cmp      w8, w21
    b.le     #0x250c68
    cmp      w8, w23
    b.eq     #0x250c90
    cmp      w8, w24
    b.ne     #0x250c2c
    ldr      x1, [x26, #0xbf0]
    ldr      x0, [sp, #0x20]
    fmov     d0, #1.00000000
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    b        #0x250ca4
    cmp      w8, w20
    b.ne     #0x250cb4
    ldr      x8, [x22, #0x90]
    str      x8, [sp, #0x20]
    ldrb     w8, [sp, #0x2f]
    cmp      w8, #0
    csel     w8, w24, w23, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x250c2c
    ldr      x1, [x25, #0xc18]
    ldr      x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldr      x8, [sp, #8]
    str      w19, [x8]
    str      x0, [sp, #0x18]
    b        #0x250c2c
    cmp      w8, w19
    b.ne     #0x250c2c
    ldr      x0, [sp, #0x18]
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      d9, d8, [sp, #0x30]
    add      sp, sp, #0x90
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGColorPickerViewController cardColor] IMP=0x250CE0 bounds=0x250CE0-0x250D38
loc_250CE0:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9c0]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x90]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0xbf0]
    cmp      w0, #0
    adrp     x9, #0x491000
    ldr      d0, [x9, #0x430]
    adrp     x9, #0x491000
    ldr      d1, [x9, #0xb80]
    fcsel    d1, d1, d0, ne
    fmov     d0, #1.00000000
    mov      x0, x8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGColorPickerViewController makeCard] IMP=0x250D38 bounds=0x250D38-0x250F64
loc_250D38:
    stp      d9, d8, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x608]
    ldp      d0, d1, [x8]
    ldp      d2, d3, [x8, #0x10]
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9c8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0xac8]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, #28.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
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
    mov      x0, x19
    mov      x1, x20
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
    ldr      x1, [x8, #0x9c0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    adrp     x8, #0x491000
    ldr      s0, [x8, #0x498]
    adrp     x8, #0x491000
    ldr      s1, [x8, #0xbe0]
    fcsel    s8, s1, s0, ne
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb08]
    fmov     s0, s8
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
    ldr      x1, [x8, #0xbc8]
    fmov     d0, #16.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbd0]
    fmov     d0, xzr
    fmov     d1, #8.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      d9, d8, [sp], #0x50
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGColorPickerViewController sectionLabelWithText:] IMP=0x250F64 bounds=0x250F64-0x251064
loc_250F64:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x21, x2
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x20, [x8, #0x158]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x608]
    ldp      d0, d1, [x8]
    ldp      d2, d3, [x8, #0x10]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    fmov     d0, #18.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGColorPickerViewController numberFieldWithTag:] IMP=0x251064 bounds=0x251064-0x251280
loc_251064:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x21, x2
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x100]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x608]
    ldp      d0, d1, [x8]
    ldp      d2, d3, [x8, #0x10]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc30]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc78]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9d8]
    mov      x0, x20
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1f8]
    mov      x0, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d1, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9e0]
    fmov     d0, #17.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9e8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9c0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x90]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0xbf0]
    cmp      w0, #0
    adrp     x9, #0x491000
    ldr      d0, [x9, #0x428]
    adrp     x9, #0x491000
    ldr      d1, [x9, #0x530]
    fcsel    d1, d1, d0, ne
    fmov     d0, #1.00000000
    mov      x0, x8
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
    fmov     d0, #12.00000000
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
    ldr      x1, [x8, #0xbf8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x3, [x8, #0x9f0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    mov      x0, x20
    mov      x2, x19
    mov      w4, #0x40000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGColorPickerViewController swatchImageForColor:diameter:] IMP=0x251280 bounds=0x251280-0x2513B4
loc_251280:
    stp      d9, d8, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    fmov     d8, d0
    mov      x20, x2
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    fmov     d2, xzr
    fmov     d0, d8
    fmov     d1, d8
    mov      w0, #0
    bl       #0x461810 // _UIGraphicsBeginImageContextWithOptions
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x568]
    ldp      d0, d1, [x8]
    adrp     x8, #0x4c4000
    ldr      x19, [x8, #0xd8]
    fmov     d4, #2.00000000
    fmov     d5, #2.00000000
    fmov     d2, d8
    fmov     d3, d8
    bl       #0x461714 // _CGRectInset
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6a0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x150]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xe10]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf0]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x648]
    fmov     d0, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x390]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x368]
    fmov     d0, #1.50000000
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x398]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461834 // _UIGraphicsGetImageFromCurrentImageContext
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x46181c // _UIGraphicsEndImageContext
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      d9, d8, [sp], #0x30
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGColorPickerViewController defaultPaletteModes] IMP=0x2513B4 bounds=0x2513B4-0x251B4C
loc_2513B4:
    sub      sp, sp, #0x1f0
    stp      d15, d14, [sp, #0x150]
    stp      d13, d12, [sp, #0x160]
    stp      d11, d10, [sp, #0x170]
    stp      d9, d8, [sp, #0x180]
    stp      x28, x27, [sp, #0x190]
    stp      x26, x25, [sp, #0x1a0]
    stp      x24, x23, [sp, #0x1b0]
    stp      x22, x21, [sp, #0x1c0]
    stp      x20, x19, [sp, #0x1d0]
    stp      x29, x30, [sp, #0x1e0]
    add      x29, sp, #0x1e0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0xa0]
    adrp     x25, #0x4c4000
    ldr      x19, [x25, #0xa8]
    fmov     d0, #1.00000000
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    bl       #0x2605e8
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x4f0]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stp      x0, x0, [sp, #0x78]
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d10, [x8, #0x3f8]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0xaa8]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x910]
    fmov     d3, #1.00000000
    fmov     d0, d10
    fmov     d2, d8
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x70]
    str      x0, [sp, #0x88]
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x9b8]
    adrp     x8, #0x491000
    ldr      d12, [x8, #0x720]
    fmov     d3, #1.00000000
    fmov     d1, d8
    fmov     d2, d12
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x68]
    str      x0, [sp, #0x90]
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x428]
    fmov     d3, #1.00000000
    fmov     d0, d10
    fmov     d1, d9
    fmov     d2, d8
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x60]
    str      x0, [sp, #0x98]
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d10, [x8, #0x648]
    fmov     d3, #1.00000000
    fmov     d0, d8
    fmov     d1, d10
    fmov     d2, d9
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x58]
    str      x0, [sp, #0xa0]
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x448]
    str      d0, [sp, #0x10]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x540]
    fmov     d3, #1.00000000
    fmov     d1, d12
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x50]
    str      x0, [sp, #0xa8]
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0xb68]
    adrp     x8, #0x491000
    ldr      d12, [x8, #0x3f0]
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    fmov     d1, d12
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x48]
    str      x0, [sp, #0xb0]
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x668]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3e0]
    adrp     x8, #0x491000
    ldr      d11, [x8, #0x590]
    fmov     d3, #1.00000000
    fmov     d2, d11
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x40]
    str      x0, [sp, #0xb8]
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x598]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x410]
    fmov     d3, #1.00000000
    fmov     d0, d11
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x38]
    str      x0, [sp, #0xc0]
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x408]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x430]
    fmov     d3, #1.00000000
    fmov     d2, d10
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    str      x0, [sp, #0xc8]
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x370]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x880]
    fmov     d3, #1.00000000
    fmov     d1, d0
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    str      x0, [sp, #0xd0]
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x440]
    fmov     d3, #1.00000000
    fmov     d1, d0
    fmov     d2, d0
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x20]
    str      x0, [sp, #0xd8]
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x4f8]
    adrp     x8, #0x491000
    ldr      d13, [x8, #0x4b8]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x4e8]
    fmov     d3, #1.00000000
    fmov     d1, d13
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x18]
    str      x0, [sp, #0xe0]
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3c0]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x750]
    fmov     d3, #1.00000000
    fmov     d1, d13
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #8]
    str      x0, [sp, #0xe8]
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d14, [x8, #0x530]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x508]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x660]
    fmov     d3, #1.00000000
    fmov     d0, d14
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp]
    str      x0, [sp, #0xf0]
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x850]
    adrp     x8, #0x491000
    ldr      d15, [x8, #0x438]
    fmov     d3, #1.00000000
    fmov     d1, d15
    fmov     d2, d13
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    str      x0, [sp, #0xf8]
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3b8]
    adrp     x8, #0x491000
    ldr      d11, [x8, #0x488]
    fmov     d0, #1.00000000
    fmov     d3, #1.00000000
    fmov     d2, d11
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    str      x0, [sp, #0x100]
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x418]
    fmov     d0, #1.00000000
    fmov     d3, #1.00000000
    fmov     d1, d12
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    str      x0, [sp, #0x108]
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0xb88]
    fmov     d3, #1.00000000
    ldr      d0, [sp, #0x10]
    fmov     d2, d13
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    str      x0, [sp, #0x110]
    ldr      x20, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x560]
    fmov     d3, #1.00000000
    fmov     d1, d9
    fmov     d2, d11
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    str      x0, [sp, #0x118]
    ldr      x21, [x25, #0xa8]
    fmov     d3, #1.00000000
    fmov     d0, d14
    fmov     d1, d10
    fmov     d2, d15
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    str      x0, [sp, #0x120]
    ldr      x22, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3b0]
    adrp     x8, #0x491000
    ldr      d10, [x8, #0x3e8]
    fmov     d3, #1.00000000
    fmov     d1, d9
    fmov     d2, d10
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x22
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    str      x0, [sp, #0x128]
    ldr      x24, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x390]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x378]
    fmov     d3, #1.00000000
    fmov     d2, d8
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x24
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    str      x0, [sp, #0x130]
    ldr      x25, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0xaa0]
    fmov     d3, #1.00000000
    fmov     d1, d13
    fmov     d2, d10
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x25
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    str      x0, [sp, #0x138]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    add      x2, sp, #0x80
    mov      w3, #0x18
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #8]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x38]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x40]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x48]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x50]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x58]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x60]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x68]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x70]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x78]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0xa0]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x251b48
    mov      x0, x23
    ldp      x29, x30, [sp, #0x1e0]
    ldp      x20, x19, [sp, #0x1d0]
    ldp      x22, x21, [sp, #0x1c0]
    ldp      x24, x23, [sp, #0x1b0]
    ldp      x26, x25, [sp, #0x1a0]
    ldp      x28, x27, [sp, #0x190]
    ldp      d9, d8, [sp, #0x180]
    ldp      d11, d10, [sp, #0x170]
    ldp      d13, d12, [sp, #0x160]
    ldp      d15, d14, [sp, #0x150]
    add      sp, sp, #0x1f0
    b        #0x461be8 // _objc_autoreleaseReturnValue
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGColorPickerViewController commonColorModes] IMP=0x251B4C bounds=0x251B4C-0x251D8C
loc_251B4C:
    sub      sp, sp, #0xa0
    stp      d9, d8, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    str      x8, [sp, #0x38]
    adrp     x25, #0x4c4000
    ldr      x19, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x668]
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x3e0]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x590]
    fmov     d3, #1.00000000
    fmov     d0, d8
    fmov     d1, d9
    bl       #0x2605e8
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x4f0]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    str      x0, [sp, #8]
    ldr      x20, [x25, #0xa8]
    fmov     d0, xzr
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    fmov     d1, d8
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    str      x0, [sp, #0x10]
    ldr      x22, [x25, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x8b8]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x648]
    fmov     d3, #1.00000000
    fmov     d2, d9
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x22
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    str      x0, [sp, #0x18]
    ldr      x23, [x25, #0xa8]
    fmov     d0, xzr
    fmov     d1, xzr
    fmov     d2, xzr
    fmov     d3, #1.00000000
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x23
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    str      x0, [sp, #0x20]
    ldr      x24, [x25, #0xa8]
    fmov     d0, #1.00000000
    fmov     d1, #1.00000000
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    str      x0, [sp, #0x28]
    ldr      x25, [x25, #0xa8]
    fmov     d0, xzr
    fmov     d1, xzr
    fmov     d2, xzr
    fmov     d3, xzr
    bl       #0x2605e8
    mov      x2, x0
    mov      x0, x25
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    str      x0, [sp, #0x30]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    add      x2, sp, #8
    mov      w3, #6
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x38]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x251d88
    mov      x0, x21
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      d9, d8, [sp, #0x40]
    add      sp, sp, #0xa0
    b        #0x461be8 // _objc_autoreleaseReturnValue
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGColorPickerViewController commonColorNames] IMP=0x251D8C bounds=0x251D8C-0x2523B8
loc_251D8C:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x20
    mov      w8, #0x9cbb
    movk     w8, #0xde16, lsl #16
    mov      w9, #0x4db8
    movk     w9, #0xc3d6, lsl #16
    adrp     x11, #0x4a0000
    ldr      x11, [x11, #0x760]
    ldr      x11, [x11]
    mov      w10, #0xa4a0
    movk     w10, #0x6ea9, lsl #16
    stur     x11, [x29, #-0x58]
    adrp     x11, #0x57f000
    add      x11, x11, #0x9f0
    mov      w15, #0xd73c
    movk     w15, #0xeb5f, lsl #16
    ldar     w11, [x11]
    sub      x12, x29, #0x60
    mov      w13, #0xd73b
    movk     w13, #0xeb5f, lsl #16
    stp      w15, w11, [x29, #-0x60]
    adrp     x14, #0x522000
    add      x14, x14, #0x420
    stur     x12, [x29, #-0x68]
    adrp     x16, #0x522000
    add      x16, x16, #0x440
    mov      w0, #0x8f09
    mov      w1, #0xd5ca
    mov      w3, #0xb70a
    mov      w5, #0x102f
    adrp     x20, #0x522000
    add      x20, x20, #0x408
    mov      w7, #0xd2a2
    adrp     x22, #0x522000
    add      x22, x22, #0x40e
    mov      w19, #0x576c
    adrp     x25, #0x522000
    add      x25, x25, #0x3f8
    adrp     x27, #0x522000
    add      x27, x27, #0x400
    mov      w21, #0x3900
    mov      w23, #0x8a52
    adrp     x12, #0x522000
    add      x12, x12, #0x3ec
    adrp     x17, #0x522000
    add      x17, x17, #0x3f2
    mov      w24, #0xcff9
    adrp     x2, #0x522000
    add      x2, x2, #0x456
    adrp     x4, #0x522000
    add      x4, x4, #0x45c
    mov      w26, #0x27b8
    adrp     x6, #0x522000
    add      x6, x6, #0x3e0
    adrp     x28, #0x522000
    add      x28, x28, #0x3e6
    ldur     w30, [x29, #-0x60]
    cmp      w30, w13
    b.le     #0x251ed8
    cmp      w30, w10
    b.eq     #0x251efc
    mov      w11, #0x1c36
    movk     w11, #0x14c, lsl #16
    cmp      w30, w11
    b.eq     #0x252120
    mov      w11, #0xd73c
    movk     w11, #0xeb5f, lsl #16
    cmp      w30, w11
    b.ne     #0x251e84
    ldur     w30, [x29, #-0x5c]
    cmp      w30, #0
    mov      w11, #0x1c36
    movk     w11, #0x14c, lsl #16
    csel     w30, w11, w9, eq
    ldur     x11, [x29, #-0x68]
    str      w30, [x11]
    b        #0x251e84
    cmp      w30, w8
    b.eq     #0x252168
    mov      w11, #0x3395
    movk     w11, #0xea77, lsl #16
    cmp      w30, w11
    b.ne     #0x2522fc
    ldur     x11, [x29, #-0x68]
    str      w9, [x11]
    b        #0x251e84
    adrp     x8, #0x522000
    ldr      w11, [x8, #0xd08]
    adrp     x8, #0x522000
    ldr      w30, [x8, #0xd0c]
    add      w11, w11, w30
    mov      w8, #0x12e3
    movk     w8, #0x7d3, lsl #16
    add      w11, w11, w8
    mov      w8, #0xef33
    movk     w8, #0x15f1, lsl #16
    umull    x11, w11, w8
    lsr      x30, x11, #0x3c
    ldrh     w11, [x14]
    mov      w15, #0x4c9a
    eor      w11, w11, w15
    mov      w8, #0x4b57
    strh     w11, [x16]
    ldrh     w11, [x14, #2]
    eor      w11, w11, w8
    strh     w11, [x16, #2]
    ldrh     w11, [x14, #4]
    mov      w0, #0x5df0
    eor      w11, w11, w0
    mov      w0, #0x8f09
    strh     w11, [x16, #4]
    ldrh     w11, [x14, #6]
    eor      w11, w11, w0
    strh     w11, [x16, #6]
    ldrh     w11, [x14, #8]
    mov      w1, #0x79fc
    eor      w11, w11, w1
    mov      w1, #0xd5ca
    strh     w11, [x16, #8]
    ldrh     w11, [x14, #0xa]
    eor      w11, w11, w1
    strh     w11, [x16, #0xa]
    ldrh     w11, [x14, #0xc]
    mov      w3, #0x76de
    eor      w11, w11, w3
    mov      w3, #0xb70a
    strh     w11, [x16, #0xc]
    ldrh     w11, [x14, #0xe]
    eor      w11, w11, w3
    strh     w11, [x16, #0xe]
    ldrh     w11, [x14, #0x10]
    mov      w5, #0x29d3
    eor      w11, w11, w5
    mov      w5, #0x102f
    strh     w11, [x16, #0x10]
    ldrh     w11, [x14, #0x12]
    eor      w11, w11, w5
    strh     w11, [x16, #0x12]
    ldrh     w11, [x14, #0x14]
    mov      w7, #0x2eee
    eor      w11, w11, w7
    mov      w7, #0xd2a2
    strh     w11, [x16, #0x14]
    ldrh     w11, [x20]
    eor      w11, w11, w7
    strh     w11, [x22]
    ldrh     w11, [x20, #2]
    mov      w19, #0xd0a8
    eor      w11, w11, w19
    mov      w19, #0x576c
    strh     w11, [x22, #2]
    ldrh     w11, [x20, #4]
    eor      w11, w11, w19
    strh     w11, [x22, #4]
    ldrh     w11, [x25]
    mov      w21, #0x923e
    eor      w11, w11, w21
    mov      w21, #0x3900
    strh     w11, [x27]
    ldrh     w11, [x25, #2]
    eor      w11, w11, w21
    strh     w11, [x27, #2]
    ldrh     w11, [x25, #4]
    mov      w23, #0xeed9
    eor      w11, w11, w23
    mov      w23, #0x8a52
    strh     w11, [x27, #4]
    ldrh     w11, [x25, #6]
    eor      w11, w11, w23
    strh     w11, [x27, #6]
    ldrh     w11, [x12]
    mov      w9, #0xc86c
    eor      w11, w11, w9
    mov      w9, #0x4db8
    movk     w9, #0xc3d6, lsl #16
    strh     w11, [x17]
    ldrh     w11, [x12, #2]
    mov      w24, #0x4b1d
    eor      w11, w11, w24
    mov      w24, #0xcff9
    strh     w11, [x17, #2]
    ldrh     w11, [x12, #4]
    eor      w11, w11, w24
    strh     w11, [x17, #4]
    ldrh     w11, [x2]
    mov      w26, #0xf3a3
    eor      w11, w11, w26
    mov      w26, #0x27b8
    strh     w11, [x4]
    ldrh     w11, [x2, #2]
    eor      w11, w11, w26
    strh     w11, [x4, #2]
    ldrh     w11, [x2, #4]
    mov      w8, #0xf36e
    eor      w11, w11, w8
    mov      w8, #0x9cbb
    movk     w8, #0xde16, lsl #16
    strh     w11, [x4, #4]
    ldrh     w11, [x6]
    mov      w10, #0x7f87
    eor      w11, w11, w10
    mov      w10, #0xa4a0
    movk     w10, #0x6ea9, lsl #16
    strh     w11, [x28]
    ldrh     w11, [x6, #2]
    mov      w13, #0xd290
    eor      w11, w11, w13
    mov      w13, #0xd73b
    movk     w13, #0xeb5f, lsl #16
    strh     w11, [x28, #2]
    ldrh     w11, [x6, #4]
    mov      x15, x20
    mov      w20, #0xe23f
    eor      w11, w11, w20
    mov      x20, x15
    strh     w11, [x28, #4]
    mov      w11, #0x128
    movk     w11, #0x454c, lsl #16
    cmp      w30, w11
    mov      w11, #0x3395
    movk     w11, #0xea77, lsl #16
    csel     w11, w8, w11, eq
    b        #0x25215c
    adrp     x11, #0x522000
    ldr      w11, [x11, #0xd00]
    adrp     x15, #0x522000
    ldr      w30, [x15, #0xd04]
    eor      w11, w11, w30
    mov      w15, #0x81db
    movk     w15, #0x78e5, lsl #16
    eor      w11, w11, w15
    mov      w15, #0xd7a0
    movk     w15, #0xf6f9, lsl #16
    add      w11, w11, w15
    mov      w15, #0x70f3
    movk     w15, #0x16f2, lsl #16
    cmp      w11, w15
    csel     w11, w8, w10, lo
    ldur     x30, [x29, #-0x68]
    str      w11, [x30]
    b        #0x251e84
    ldrh     w11, [x14]
    mov      w30, #0x4c9a
    eor      w11, w11, w30
    strh     w11, [x16]
    ldrh     w11, [x14, #2]
    mov      w15, #0x4b57
    eor      w11, w11, w15
    strh     w11, [x16, #2]
    ldrh     w11, [x14, #4]
    mov      w30, #0x5df0
    eor      w11, w11, w30
    strh     w11, [x16, #4]
    ldrh     w11, [x14, #6]
    eor      w11, w11, w0
    strh     w11, [x16, #6]
    ldrh     w11, [x14, #8]
    mov      w30, #0x79fc
    eor      w11, w11, w30
    strh     w11, [x16, #8]
    ldrh     w11, [x14, #0xa]
    eor      w11, w11, w1
    strh     w11, [x16, #0xa]
    ldrh     w11, [x14, #0xc]
    mov      w30, #0x76de
    eor      w11, w11, w30
    strh     w11, [x16, #0xc]
    ldrh     w11, [x14, #0xe]
    eor      w11, w11, w3
    strh     w11, [x16, #0xe]
    ldrh     w11, [x14, #0x10]
    mov      w30, #0x29d3
    eor      w11, w11, w30
    strh     w11, [x16, #0x10]
    ldrh     w11, [x14, #0x12]
    eor      w11, w11, w5
    strh     w11, [x16, #0x12]
    ldrh     w11, [x14, #0x14]
    mov      w30, #0x2eee
    eor      w11, w11, w30
    strh     w11, [x16, #0x14]
    ldrh     w11, [x20]
    eor      w11, w11, w7
    strh     w11, [x22]
    ldrh     w11, [x20, #2]
    mov      w30, #0xd0a8
    eor      w11, w11, w30
    strh     w11, [x22, #2]
    ldrh     w11, [x20, #4]
    eor      w11, w11, w19
    strh     w11, [x22, #4]
    ldrh     w11, [x25]
    mov      w30, #0x923e
    eor      w11, w11, w30
    strh     w11, [x27]
    ldrh     w11, [x25, #2]
    eor      w11, w11, w21
    strh     w11, [x27, #2]
    ldrh     w11, [x25, #4]
    mov      w30, #0xeed9
    eor      w11, w11, w30
    strh     w11, [x27, #4]
    ldrh     w11, [x25, #6]
    eor      w11, w11, w23
    strh     w11, [x27, #6]
    ldrh     w11, [x12]
    mov      w30, #0xc86c
    eor      w11, w11, w30
    strh     w11, [x17]
    ldrh     w11, [x12, #2]
    mov      w30, #0x4b1d
    eor      w11, w11, w30
    strh     w11, [x17, #2]
    ldrh     w11, [x12, #4]
    eor      w11, w11, w24
    strh     w11, [x17, #4]
    ldrh     w11, [x2]
    mov      w30, #0xf3a3
    eor      w11, w11, w30
    strh     w11, [x4]
    ldrh     w11, [x2, #2]
    eor      w11, w11, w26
    strh     w11, [x4, #2]
    ldrh     w11, [x2, #4]
    mov      w30, #0xf36e
    eor      w11, w11, w30
    strh     w11, [x4, #4]
    ldrh     w11, [x6]
    mov      w30, #0x7f87
    eor      w11, w11, w30
    strh     w11, [x28]
    ldrh     w11, [x6, #2]
    mov      w30, #0xd290
    eor      w11, w11, w30
    strh     w11, [x28, #2]
    ldrh     w11, [x6, #4]
    mov      w30, #0xe23f
    eor      w11, w11, w30
    strh     w11, [x28, #4]
    ldur     x11, [x29, #-0x68]
    str      w10, [x11]
    b        #0x251e84
    cmp      w30, w9
    b.ne     #0x251e84
    mov      w8, #1
    adrp     x9, #0x57f000
    add      x9, x9, #0x9f0
    stlr     w8, [x9]
    mov      x8, sp
    sub      x2, x8, #0x30
    mov      sp, x2
    adrp     x9, #0x522000
    add      x9, x9, #0x5d0
    adrp     x10, #0x522000
    add      x10, x10, #0x590
    stp      x9, x10, [x8, #-0x30]
    adrp     x9, #0x522000
    add      x9, x9, #0x4d0
    adrp     x10, #0x522000
    add      x10, x10, #0x550
    stp      x9, x10, [x8, #-0x20]
    adrp     x9, #0x522000
    add      x9, x9, #0x510
    adrp     x10, #0x522000
    add      x10, x10, #0x490
    stp      x9, x10, [x8, #-0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    mov      w3, #6
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2523b4
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    b        #0x461be8 // _objc_autoreleaseReturnValue
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGColorPickerViewController colorForMode:] IMP=0x2523B8 bounds=0x2523B8-0x252424
loc_2523B8:
    sub      sp, sp, #0x30
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    stur     xzr, [x29, #-8]
    stp      xzr, xzr, [sp, #8]
    mov      x8, #0x3ff0000000000000
    str      x8, [sp]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x930]
    sub      x3, x29, #8
    add      x4, sp, #0x10
    add      x5, sp, #8
    mov      x6, sp
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    ldur     d0, [x29, #-8]
    ldp      d2, d1, [sp, #8]
    ldr      d3, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8f8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldp      x29, x30, [sp, #0x20]
    add      sp, sp, #0x30
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGColorPickerViewController viewDidLoad] IMP=0x252424 bounds=0x252424-0x255DE0
loc_252424:
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
    sub      sp, sp, #0x2c0
    mov      x19, sp
    mov      x20, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0xa0]
    mov      w25, #0x5677
    movk     w25, #0x61e4, lsl #16
    adrp     x8, #0x57f000
    add      x8, x8, #0x9f8
    ldar     w8, [x8]
    stur     w8, [x29, #-0xc4]
    mov      w8, #0x2cc5
    movk     w8, #0xe9af, lsl #16
    str      w8, [x19, #0x24]
    add      x8, x19, #0x24
    str      x8, [x19, #0x18]
    mov      w24, #0x9bb0
    movk     w24, #0x42d4, lsl #16
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x648]
    adrp     x8, #0x491000
    ldr      s0, [x8, #0xbe4]
    str      s0, [x19, #0x14]
    adrp     x8, #0x491000
    ldr      d10, [x8, #0x3f0]
    adrp     x8, #0x491000
    ldr      d11, [x8, #0x3b0]
    adrp     x8, #0x491000
    ldr      s0, [x8, #0x894]
    str      s0, [x19, #0x10]
    adrp     x8, #0x491000
    ldr      s0, [x8, #0xbe8]
    str      s0, [x19, #0xc]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x590]
    str      d0, [x19]
    adrp     x8, #0x491000
    ldr      d15, [x8, #0x490]
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x4b8]
    adrp     x8, #0x491000
    ldr      d12, [x8, #0x598]
    adrp     x8, #0x491000
    ldr      d13, [x8, #0xb68]
    adrp     x8, #0x491000
    ldr      d14, [x8, #0x950]
    mov      w26, #0x5ac8
    movk     w26, #0x7b68, lsl #16
    ldr      w8, [x19, #0x24]
    cmp      w8, w24
    b.le     #0x2526e0
    cmp      w8, w26
    b.gt     #0x252df4
    mov      w9, #0x50f5
    movk     w9, #0x4e93, lsl #16
    cmp      w8, w9
    b.le     #0x254e78
    mov      w9, #0x50f6
    movk     w9, #0x4e93, lsl #16
    cmp      w8, w9
    b.eq     #0x255adc
    cmp      w8, w25
    b.eq     #0x255904
    mov      w9, #0x3941
    movk     w9, #0x74f1, lsl #16
    cmp      w8, w9
    mov      w24, #0x9bb0
    movk     w24, #0x42d4, lsl #16
    b.ne     #0x252518
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x468]
    bl       #0x461ba0 // _objc_alloc
    mov      x21, x0
    ldur     x2, [x29, #-0xd0]
    adrp     x8, #0x522000
    add      x9, x8, #0x810
    adrp     x8, #0x522000
    add      x8, x8, #0x9d0
    stp      x9, x8, [x2]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    mov      w3, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa10]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa18]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8b8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      w21, w0
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0xa20]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa28]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x3, [x8, #0xa30]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    mov      x2, x20
    mov      w4, #0x1000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x248]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x18]
    mov      w9, #0x8e77
    movk     w9, #0xc93d, lsl #16
    str      w9, [x8]
    b        #0x252518
    mov      w9, #0x8e76
    movk     w9, #0xc93d, lsl #16
    cmp      w8, w9
    b.le     #0x254580
    mov      w9, #0x1912
    movk     w9, #0xdfbd, lsl #16
    cmp      w8, w9
    b.le     #0x254d84
    mov      w9, #0x1913
    movk     w9, #0xdfbd, lsl #16
    cmp      w8, w9
    b.eq     #0x255488
    mov      w9, #0x2cc5
    movk     w9, #0xe9af, lsl #16
    cmp      w8, w9
    b.eq     #0x255438
    mov      w9, #0x8bdd
    movk     w9, #0x3b59, lsl #16
    cmp      w8, w9
    b.ne     #0x252518
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xb88]
    ldr      x2, [x19, #0x158]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xb90]
    ldr      x2, [x19, #0x150]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xb98]
    ldr      x2, [x19, #0x148]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    ldur     x1, [x29, #-0xf8]
    ldp      d0, d1, [x29, #-0xc0]
    ldp      d2, d3, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xba0]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xba8]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x1d0]
    fmov     d0, #15.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x1c0]
    fmov     d0, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x27, #0x4c4000
    ldr      x0, [x27, #0x90]
    ldr      x1, [x19, #0x1e0]
    fmov     d0, #1.00000000
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    ldr      x1, [x19, #0x1b8]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x1, [x19, #0x1b0]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    mov      w25, #0x5677
    movk     w25, #0x61e4, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      w24, #0x9bb0
    movk     w24, #0x42d4, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x240]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x28, #0x4c4000
    ldr      x0, [x28, #0x158]
    bl       #0x461ba0 // _objc_alloc
    ldur     x1, [x29, #-0xf8]
    ldp      d0, d1, [x29, #-0xc0]
    ldp      d2, d3, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbb0]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xbb8]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [x19, #0x228]
    adrp     x2, #0x522000
    add      x2, x2, #0x710
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x26, #0x4c4000
    ldr      x0, [x26, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d1, [x8]
    str      d1, [x19, #0xf0]
    ldr      x1, [x19, #0x218]
    fmov     d0, #18.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x210]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x208]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x200]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x240]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x28, #0x158]
    bl       #0x461ba0 // _objc_alloc
    ldur     x1, [x29, #-0xf8]
    ldp      d0, d1, [x29, #-0xc0]
    ldp      d2, d3, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbc0]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x218]
    mov      w26, #0x5ac8
    movk     w26, #0x7b68, lsl #16
    ldr      d1, [x19, #0x1f0]
    ldr      x1, [x19, #0x1e8]
    fmov     d0, #17.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xbc8]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x210]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x1f8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x200]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1f8]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x240]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x188]
    bl       #0x461ba0 // _objc_alloc
    ldur     x1, [x29, #-0xf8]
    ldp      d0, d1, [x29, #-0xc0]
    ldp      d2, d3, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbd0]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x27, #0x90]
    ldur     x1, [x29, #-0xe8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbd8]
    str      x1, [x19, #0xe8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0xf0]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0xe8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbe0]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0xe8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbe8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x238]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [x19, #0xe8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbf0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbf8]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    ldr      x1, [x19, #0x160]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc00]
    stp      x1, x0, [x19, #0xd8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x600]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cmp      x23, #0
    ldr      x8, [x19, #0x18]
    mov      w9, #0x47b7
    movk     w9, #0xccca, lsl #16
    mov      w10, #0x39fb
    movk     w10, #0x7ccf, lsl #16
    csel     w9, w10, w9, gt
    str      w9, [x8]
    str      x22, [x19, #0x48]
    b        #0x252518
    mov      w9, #0x39fa
    movk     w9, #0x7ccf, lsl #16
    cmp      w8, w9
    b.le     #0x254b0c
    mov      w9, #0x39fb
    movk     w9, #0x7ccf, lsl #16
    cmp      w8, w9
    b.eq     #0x2558c0
    mov      w9, #0xefec
    movk     w9, #0x7fea, lsl #16
    cmp      w8, w9
    b.ne     #0x255cdc
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xa38]
    mov      x0, x20
    mov      x1, x21
    adrp     x2, #0x522000
    add      x2, x2, #0x990
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa40]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    adrp     x2, #0x522000
    add      x2, x2, #0x790
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa48]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    adrp     x2, #0x522000
    add      x2, x2, #0x850
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa50]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x248]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa58]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x248]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa60]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x248]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa68]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xa70]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa78]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa80]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa88]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x248]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa90]
    str      x1, [x19, #0x240]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x248]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa98]
    str      x1, [x19, #0x238]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x248]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xaa0]
    str      x1, [x19, #0x230]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x24, #0x4c4000
    ldr      x0, [x24, #0x158]
    bl       #0x461ba0 // _objc_alloc
    ldur     x1, [x29, #-0xf8]
    ldp      d0, d1, [x29, #-0xc0]
    ldp      d2, d3, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xaa8]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xab0]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    str      x1, [x19, #0x228]
    adrp     x2, #0x522000
    add      x2, x2, #0x7d0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x25, #0x4c4000
    ldr      x0, [x25, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x360]
    ldr      d1, [x8]
    str      d1, [x19, #0x220]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    str      x1, [x19, #0x218]
    fmov     d0, #20.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    str      x1, [x19, #0x210]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9e8]
    str      x1, [x19, #0x208]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    str      x1, [x19, #0x200]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x240]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x24, #0x158]
    bl       #0x461ba0 // _objc_alloc
    ldur     x1, [x29, #-0xf8]
    ldp      d0, d1, [x29, #-0xc0]
    ldp      d2, d3, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xab8]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xac0]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [x19, #0x228]
    adrp     x2, #0x522000
    add      x2, x2, #0xa10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x380]
    ldr      d1, [x8]
    ldr      x1, [x19, #0x218]
    fmov     d0, #12.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x210]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9d0]
    str      x1, [x19, #0x1f8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x200]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x240]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x100]
    bl       #0x461ba0 // _objc_alloc
    ldur     x1, [x29, #-0xf8]
    ldp      d0, d1, [x29, #-0xc0]
    ldp      d2, d3, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xac8]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x28, [x8, #0xad0]
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc78]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xad8]
    mov      w2, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x768]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x760]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xae0]
    mov      w2, #9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x378]
    ldr      d1, [x8]
    str      d1, [x19, #0x1f0]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9e0]
    str      x1, [x19, #0x1e8]
    fmov     d0, #19.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [x19, #0x210]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x208]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [x19, #0x200]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9c0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x27, #0x4c4000
    ldr      x8, [x27, #0x90]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0xbf0]
    str      x1, [x19, #0x1e0]
    cmp      w0, #0
    fcsel    d1, d11, d10, ne
    fmov     d0, #1.00000000
    mov      x0, x8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0xf0]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    str      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    str      x1, [x19, #0x1d0]
    fmov     d0, #15.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    mov      x23, x8
    bl       #0x461ba0 // _objc_alloc
    ldur     x1, [x29, #-0xf8]
    fmov     d0, xzr
    fmov     d1, xzr
    fmov     d2, #14.00000000
    fmov     d3, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xae8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xaf0]
    mov      w2, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x3, [x8, #0xaf8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    str      x1, [x19, #0x1c8]
    mov      x2, x20
    mov      w4, #0x40000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x240]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, #0x78]
    bl       #0x461ba0 // _objc_alloc
    ldur     x1, [x29, #-0xf8]
    ldp      d0, d1, [x29, #-0xc0]
    ldp      d2, d3, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xb00]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xb08]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x1d0]
    fmov     d0, #25.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb10]
    str      x1, [x19, #0x1c0]
    fmov     d0, #1.50000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x27, #0x90]
    ldr      x1, [x19, #0x1e0]
    fmov     d0, xzr
    fmov     d1, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac0]
    str      x1, [x19, #0x1b8]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb18]
    str      x1, [x19, #0x1b0]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x240]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x470]
    bl       #0x461ba0 // _objc_alloc
    ldur     x1, [x29, #-0xf8]
    ldp      d0, d1, [x29, #-0xc0]
    ldp      d2, d3, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xb10]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x240]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0xb18]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x25, #0x4c4000
    ldr      x0, [x25, #0x3f8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xb20]
    adrp     x8, #0x4bf000
    ldr      x22, [x8, #0x440]
    mov      x1, x22
    mov      x2, x20
    mov      x3, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x1a8]
    adrp     x26, #0x4c4000
    ldr      x0, [x26, #0x1d8]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x22
    mov      x2, x20
    mov      x3, x21
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x1a0]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x21, [x8, #0x450]
    ldr      x2, [x19, #0x1a8]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x2, [x19, #0x1a0]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x478]
    bl       #0x461ba0 // _objc_alloc
    ldur     x1, [x29, #-0xf8]
    ldp      d0, d1, [x29, #-0xc0]
    ldp      d2, d3, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xb28]
    mov      x0, x20
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x240]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0xb30]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x24
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x3f8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x24, [x8, #0xb38]
    mov      x1, x22
    mov      x2, x20
    mov      x3, x24
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x198]
    ldr      x0, [x26, #0x1d8]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x22
    mov      x2, x20
    mov      x3, x24
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x190]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x2, [x19, #0x198]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x2, [x19, #0x190]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    ldur     x1, [x29, #-0xf8]
    ldp      d0, d1, [x29, #-0xc0]
    ldp      d2, d3, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xb40]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0xb48]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x28, [x8, #0x440]
    mov      x1, x28
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x27, #0x90]
    ldur     x1, [x29, #-0xe8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldur     x1, [x29, #-0xf0]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x1c0]
    fmov     d0, #3.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x27, #0x90]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x458]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    ldr      x1, [x19, #0x1b8]
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    ldr      x1, [x19, #0x1b0]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x27, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x450]
    str      x1, [x19, #0x188]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    ldr      x1, [x19, #0x1b8]
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbc0]
    str      x1, [x19, #0x180]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb08]
    str      x1, [x19, #0x178]
    ldr      s0, [x19, #0x10]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbc8]
    str      x1, [x19, #0x170]
    fmov     d0, #5.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbd0]
    str      x1, [x19, #0x168]
    fmov     d0, xzr
    fmov     d1, #2.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x240]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x23
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    ldur     x1, [x29, #-0xf8]
    ldp      d0, d1, [x29, #-0xc0]
    ldp      d2, d3, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xb50]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0xb58]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x28
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x27, #0x90]
    ldur     x1, [x29, #-0xe8]
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
    ldur     x1, [x29, #-0xf0]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x1, [x19, #0x1c0]
    fmov     d0, #3.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x27, #0x90]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    ldr      x1, [x19, #0x1b8]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x1, [x19, #0x1b0]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x27, #0x90]
    ldr      x1, [x19, #0x188]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    ldr      x1, [x19, #0x1b8]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x1, [x19, #0x180]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x178]
    ldr      s0, [x19, #0xc]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x170]
    fmov     d0, #4.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [x19, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x168]
    fmov     d0, xzr
    fmov     d1, #2.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x240]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x21, #0x4c4000
    ldr      x0, [x21, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    str      x1, [x19, #0x160]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x158]
    ldr      x0, [x21, #0x110]
    ldr      x1, [x19, #0x160]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x150]
    ldr      x0, [x21, #0x110]
    ldr      x1, [x19, #0x160]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x148]
    ldur     x2, [x29, #-0xd8]
    adrp     x8, #0x522000
    add      x9, x8, #0x950
    adrp     x8, #0x522000
    add      x8, x8, #0x8d0
    stp      x9, x8, [x2]
    adrp     x8, #0x522000
    add      x9, x8, #0x890
    adrp     x8, #0x522000
    add      x8, x8, #0x750
    stp      x9, x8, [x2, #0x10]
    adrp     x28, #0x4c4000
    ldr      x0, [x28, #0x98]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x470]
    mov      x1, x21
    mov      w3, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x140]
    ldr      x0, [x27, #0x90]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x8f8]
    fmov     d3, #1.00000000
    mov      x1, x23
    ldr      d0, [x19]
    fmov     d1, d15
    fmov     d2, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x25, [x29, #-0xe0]
    str      x0, [x25]
    ldr      x0, [x27, #0x90]
    fmov     d3, #1.00000000
    mov      x1, x23
    fmov     d0, d15
    fmov     d1, d8
    fmov     d2, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    str      x0, [x25, #8]
    ldur     x25, [x29, #-0xe0]
    ldr      x0, [x27, #0x90]
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x1, x23
    fmov     d0, d13
    fmov     d1, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    str      x0, [x25, #0x10]
    ldur     x26, [x29, #-0xe0]
    ldr      x0, [x27, #0x90]
    ldr      x1, [x19, #0x1e0]
    fmov     d1, #1.00000000
    fmov     d0, d14
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    str      x0, [x26, #0x18]
    mov      w26, #0x1913
    movk     w26, #0xdfbd, lsl #16
    ldr      x0, [x28, #0x98]
    ldur     x2, [x29, #-0xe0]
    mov      x1, x21
    mov      w3, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x138]
    mov      x0, x25
    mov      w25, #0x5677
    movk     w25, #0x61e4, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      w24, #0x9bb0
    movk     w24, #0x42d4, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x608]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x830]
    stp      x8, x9, [x19, #0x128]
    adrp     x8, #0x4c0000
    ldr      x9, [x8, #0xb60]
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0xb68]
    stp      x8, x9, [x19, #0x118]
    adrp     x8, #0x4bf000
    ldr      x9, [x8, #0xc30]
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0xb70]
    stp      x8, x9, [x19, #0x108]
    adrp     x8, #0x4c0000
    ldr      x9, [x8, #0xb78]
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0xb80]
    stp      x8, x9, [x19, #0xf8]
    ldr      x8, [x19, #0x18]
    str      w26, [x8]
    mov      w26, #0x5ac8
    movk     w26, #0x7b68, lsl #16
    str      xzr, [x19, #0x50]
    b        #0x252518
    mov      w9, #0xc7b4
    movk     w9, #0x9ba6, lsl #16
    cmp      w8, w9
    b.gt     #0x254a8c
    mov      w9, #0xd829
    movk     w9, #0x8626, lsl #16
    cmp      w8, w9
    b.eq     #0x254eec
    mov      w9, #0xb5e3
    movk     w9, #0x8d59, lsl #16
    cmp      w8, w9
    b.ne     #0x252518
    adrp     x8, #0x57f000
    add      x8, x8, #0x9f8
    mov      w9, #1
    stlr     w9, [x8]
    mov      x8, sp
    sub      x0, x8, #0x10
    mov      sp, x0
    sub      x9, sp, #0x10
    mov      sp, x9
    stur     x9, [x29, #-0xd0]
    sub      x9, sp, #0x20
    mov      sp, x9
    stur     x9, [x29, #-0xd8]
    sub      x9, sp, #0x20
    mov      sp, x9
    stur     x9, [x29, #-0xe0]
    adrp     x9, #0x4c4000
    ldr      x9, [x9, #0x768]
    stp      x20, x9, [x8, #-0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc80]
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb80]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x328]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x5, [x8, #0xa00]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x650]
    adrp     x2, #0x522000
    add      x2, x2, #0x910
    mov      w3, #2
    mov      x4, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbb0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x378]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x27, #0x4c4000
    ldr      x0, [x27, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    stur     x1, [x29, #-0xe8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x3d8]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    stur     x1, [x29, #-0xf0]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x460]
    bl       #0x461ba0 // _objc_alloc
    mov      x23, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x4d8]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    stur     x1, [x29, #-0xf8]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xd60]
    mov      x0, x20
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x28, [x8, #0xf30]
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x448]
    mov      x1, x23
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    stur     x1, [x29, #-0x100]
    mov      x0, x24
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x188]
    bl       #0x461ba0 // _objc_alloc
    mov      x24, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    ldur     x1, [x29, #-0xf8]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x410]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x3f0]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x1, x23
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbf8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa08]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x27, #0x90]
    ldur     x1, [x29, #-0xe8]
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
    ldur     x1, [x29, #-0xf0]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    mov      w24, #0x9bb0
    movk     w24, #0x42d4, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x21
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x608]
    ldp      d0, d1, [x8]
    ldp      d2, d3, [x8, #0x10]
    stp      d0, d1, [x29, #-0xc0]
    stp      d2, d3, [x29, #-0xb0]
    ldur     x1, [x29, #-0xf8]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x40]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xaf0]
    str      x1, [x19, #0x248]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x898]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #0xefec
    movk     w8, #0x7fea, lsl #16
    mov      w9, #0xc7bb
    movk     w9, #0xb524, lsl #16
    csel     w8, w9, w8, ne
    b        #0x2558b4
    mov      w9, #0xc7b5
    movk     w9, #0x9ba6, lsl #16
    cmp      w8, w9
    b.eq     #0x254f40
    mov      w9, #0xc7bb
    movk     w9, #0xb524, lsl #16
    cmp      w8, w9
    b.ne     #0x252518
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xd10]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xd14]
    add      w8, w8, w9
    mov      w9, #0xa0c5
    movk     w9, #0x131d, lsl #16
    mov      w10, #0xe801
    movk     w10, #0xb780, lsl #16
    madd     w8, w8, w9, w10
    mov      w9, #0xdd0b
    movk     w9, #0xd6, lsl #16
    umull    x9, w8, w9
    lsr      x9, x9, #0x20
    sub      w8, w8, w9
    add      w8, w9, w8, lsr #1
    mov      w9, #0x4c4b
    movk     w9, #0x1dd3, lsl #16
    cmp      w9, w8, lsr #31
    mov      w8, #0x3941
    movk     w8, #0x74f1, lsl #16
    mov      w9, #0x8e77
    movk     w9, #0xc93d, lsl #16
    b        #0x2558b0
    mov      w9, #0x5ac9
    movk     w9, #0x7b68, lsl #16
    cmp      w8, w9
    b.eq     #0x255458
    mov      w9, #0x5498
    movk     w9, #0x7bb3, lsl #16
    cmp      w8, w9
    b.ne     #0x252518
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xd28]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xd2c]
    sub      w8, w8, w9
    mov      w9, #0x9ae4
    movk     w9, #0x9ce, lsl #16
    orr      w8, w8, w9
    mov      w9, #0xfe74
    movk     w9, #0x99fd, lsl #16
    add      w8, w8, w9
    mov      w9, #0xba03
    movk     w9, #0x335c, lsl #16
    and      w25, w8, w9
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x168]
    ldr      x1, [x19, #0x90]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [x19, #0x88]
    ldr      x2, [x19, #0x28]
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x19, #0x1c8]
    ldr      x3, [x19, #0x80]
    mov      x0, x21
    mov      x2, x20
    mov      w4, #0x40
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x19, #0x230]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x100]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0xa8]
    ldr      x1, [x19, #0x78]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    ldur     x1, [x29, #-0xf8]
    ldp      d0, d1, [x29, #-0xc0]
    ldp      d2, d3, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    ldr      x1, [x19, #0x70]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x68]
    ldr      x2, [x19, #0x28]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x1, [x19, #0x228]
    mov      x0, x22
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    mov      w24, #0x9bb0
    movk     w24, #0x42d4, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    ldr      x1, [x19, #0x218]
    ldr      d1, [x19, #0xf0]
    fmov     d0, #16.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x210]
    mov      x0, x22
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x208]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x200]
    mov      x0, x22
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x230]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldur     x1, [x29, #-0x100]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0xa0]
    ldr      x1, [x19, #0x78]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x28]
    add      x8, x8, #1
    str      x8, [x19, #0x60]
    ldr      x1, [x19, #0x98]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [x19, #0x30]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #0x60]
    cmp      x8, x0
    cset     w8, lt
    strb     w8, [x19, #0x5f]
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      w8, #0x2e23
    movk     w8, #0x67f9, lsl #16
    cmp      w25, w8
    mov      w25, #0x5677
    movk     w25, #0x61e4, lsl #16
    mov      w8, #0x5498
    movk     w8, #0x7bb3, lsl #16
    mov      w9, #0x5ac9
    movk     w9, #0x7b68, lsl #16
    csel     w8, w9, w8, lo
    b        #0x2558b4
    mov      w9, #0x8e77
    movk     w9, #0xc93d, lsl #16
    cmp      w8, w9
    b.eq     #0x255700
    mov      w9, #0x47b7
    movk     w9, #0xccca, lsl #16
    cmp      w8, w9
    b.ne     #0x252518
    ldr      x8, [x19, #0x48]
    str      x8, [x19, #0x30]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc10]
    ldr      x2, [x19, #0xe0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc18]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc20]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x21, #0x4c4000
    ldr      x0, [x21, #0x110]
    ldr      x1, [x19, #0x160]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0xa8]
    ldr      x0, [x21, #0x110]
    ldr      x1, [x19, #0x160]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc28]
    stp      x1, x0, [x19, #0x98]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [x19, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cmp      x22, #0
    mov      w8, #0xba7d
    movk     w8, #0x7fa3, lsl #16
    mov      w9, #0xd829
    movk     w9, #0x8626, lsl #16
    csel     w8, w9, w8, gt
    b        #0x2558b4
    mov      w9, #0x9bb1
    movk     w9, #0x42d4, lsl #16
    cmp      w8, w9
    b.eq     #0x255cc8
    mov      w9, #0xd0c
    movk     w9, #0x45c2, lsl #16
    cmp      w8, w9
    b.ne     #0x252518
    ldr      x8, [x19, #0x38]
    str      x8, [x19, #0x28]
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xd20]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xd24]
    orr      w8, w8, w9
    mov      w9, #0x1de2
    movk     w9, #0xaed4, lsl #16
    add      w8, w8, w9
    mov      w9, #0x280
    movk     w9, #0xf36b, lsl #16
    and      w8, w8, w9
    mov      w9, #0x34b1
    movk     w9, #0xc333, lsl #16
    cmp      w8, w9
    mov      w8, #0x5498
    movk     w8, #0x7bb3, lsl #16
    mov      w9, #0x50f6
    movk     w9, #0x4e93, lsl #16
    b        #0x255450
    adrp     x8, #0x4bf000
    ldr      x9, [x8, #0x170]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0xc30]
    stp      x8, x9, [x19, #0x88]
    adrp     x8, #0x4c0000
    ldr      x9, [x8, #0xc30]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x830]
    stp      x8, x9, [x19, #0x78]
    adrp     x8, #0x4c0000
    ldr      x9, [x8, #0xc38]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x608]
    stp      x8, x9, [x19, #0x68]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xd0c
    movk     w9, #0x45c2, lsl #16
    str      w9, [x8]
    str      xzr, [x19, #0x38]
    b        #0x252518
    adrp     x9, #0x522000
    add      x9, x9, #0x670
    ldrh     w8, [x9]
    mov      w10, #0xadc0
    eor      w8, w8, w10
    adrp     x10, #0x522000
    add      x10, x10, #0x6a0
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0x839a
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0xbbe4
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w11, #0x42a9
    eor      w8, w8, w11
    strh     w8, [x10, #6]
    ldrh     w8, [x9, #8]
    mov      w11, #0x1ec
    eor      w8, w8, w11
    strh     w8, [x10, #8]
    ldrh     w8, [x9, #0xa]
    mov      w11, #0x90ef
    eor      w8, w8, w11
    strh     w8, [x10, #0xa]
    ldrh     w8, [x9, #0xc]
    mov      w11, #0xbd9c
    eor      w8, w8, w11
    strh     w8, [x10, #0xc]
    ldrh     w8, [x9, #0xe]
    mov      w11, #0xc4f0
    eor      w8, w8, w11
    strh     w8, [x10, #0xe]
    ldrh     w8, [x9, #0x10]
    mov      w11, #0xe467
    eor      w8, w8, w11
    strh     w8, [x10, #0x10]
    ldrh     w8, [x9, #0x12]
    mov      w11, #0xd759
    eor      w8, w8, w11
    strh     w8, [x10, #0x12]
    ldrh     w8, [x9, #0x14]
    mov      w11, #0xd2de
    eor      w8, w8, w11
    strh     w8, [x10, #0x14]
    ldrh     w8, [x9, #0x16]
    mov      w11, #0xe7fd
    eor      w8, w8, w11
    strh     w8, [x10, #0x16]
    ldrh     w8, [x9, #0x18]
    mov      w11, #0x41ad
    eor      w8, w8, w11
    strh     w8, [x10, #0x18]
    ldrh     w8, [x9, #0x1a]
    mov      w11, #0x6274
    eor      w8, w8, w11
    strh     w8, [x10, #0x1a]
    ldrh     w8, [x9, #0x1c]
    mov      w11, #0x55c6
    eor      w8, w8, w11
    strh     w8, [x10, #0x1c]
    ldrh     w8, [x9, #0x1e]
    mov      w11, #0x7b40
    eor      w8, w8, w11
    strh     w8, [x10, #0x1e]
    ldrh     w8, [x9, #0x20]
    mov      w11, #0xd1a
    eor      w8, w8, w11
    strh     w8, [x10, #0x20]
    ldrh     w8, [x9, #0x22]
    mov      w11, #0x459d
    eor      w8, w8, w11
    strh     w8, [x10, #0x22]
    ldrh     w8, [x9, #0x24]
    mov      w11, #0xcb3
    eor      w8, w8, w11
    strh     w8, [x10, #0x24]
    ldrh     w8, [x9, #0x26]
    mov      w11, #0x88e8
    eor      w8, w8, w11
    strh     w8, [x10, #0x26]
    ldrh     w8, [x9, #0x28]
    mov      w11, #0xb101
    eor      w8, w8, w11
    strh     w8, [x10, #0x28]
    ldrh     w8, [x9, #0x2a]
    mov      w11, #0xe77f
    eor      w8, w8, w11
    strh     w8, [x10, #0x2a]
    ldrh     w8, [x9, #0x2c]
    mov      w9, #0x17f8
    eor      w8, w8, w9
    strh     w8, [x10, #0x2c]
    adrp     x9, #0x522000
    add      x9, x9, #0x648
    ldrh     w8, [x9]
    mov      w10, #0x4fc7
    eor      w8, w8, w10
    adrp     x10, #0x522000
    add      x10, x10, #0x652
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0x540f
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0xa87
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w11, #0x60bc
    eor      w8, w8, w11
    strh     w8, [x10, #6]
    ldrh     w8, [x9, #8]
    mov      w9, #0x79ec
    eor      w8, w8, w9
    strh     w8, [x10, #8]
    adrp     x9, #0x522000
    add      x9, x9, #0x6ce
    ldrh     w8, [x9]
    mov      w10, #0x29bc
    eor      w8, w8, w10
    adrp     x10, #0x522000
    add      x10, x10, #0x6da
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0x5644
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0x7e61
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w11, #0x9a36
    eor      w8, w8, w11
    strh     w8, [x10, #6]
    ldrh     w8, [x9, #8]
    mov      w11, #0x6062
    eor      w8, w8, w11
    strh     w8, [x10, #8]
    ldrh     w8, [x9, #0xa]
    mov      w9, #0xdf20
    eor      w8, w8, w9
    strh     w8, [x10, #0xa]
    adrp     x9, #0x522000
    add      x9, x9, #0x61c
    ldrb     w8, [x9]
    eor      w8, w8, #6
    adrp     x10, #0x522000
    add      x10, x10, #0x61e
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w9, #0x41
    eor      w8, w8, w9
    strb     w8, [x10, #1]
    adrp     x9, #0x522000
    add      x9, x9, #0x63c
    ldrh     w8, [x9]
    mov      w10, #0x6aae
    eor      w8, w8, w10
    adrp     x10, #0x522000
    add      x10, x10, #0x642
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0xcce7
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w9, #0xcf9b
    eor      w8, w8, w9
    strh     w8, [x10, #4]
    adrp     x9, #0x522000
    add      x9, x9, #0x630
    ldrb     w8, [x9]
    eor      w8, w8, #0xfffffff9
    adrp     x10, #0x522000
    add      x10, x10, #0x632
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w9, #0x67
    eor      w8, w8, w9
    strb     w8, [x10, #1]
    adrp     x9, #0x522000
    add      x9, x9, #0x65c
    ldrh     w8, [x9]
    mov      w10, #0x4c4c
    eor      w8, w8, w10
    adrp     x10, #0x522000
    add      x10, x10, #0x664
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0xde9d
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0xa9cb
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w9, #0x8e94
    eor      w8, w8, w9
    strh     w8, [x10, #6]
    adrp     x9, #0x522000
    add      x9, x9, #0x624
    ldrh     w8, [x9]
    mov      w10, #0x1d6f
    eor      w8, w8, w10
    adrp     x10, #0x522000
    add      x10, x10, #0x62a
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0xe451
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w9, #0xa193
    eor      w8, w8, w9
    strh     w8, [x10, #4]
    adrp     x9, #0x522000
    add      x9, x9, #0x618
    ldrb     w8, [x9]
    mov      w10, #0x6b
    eor      w8, w8, w10
    adrp     x10, #0x522000
    add      x10, x10, #0x61a
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w9, #0xa6
    eor      w8, w8, w9
    strb     w8, [x10, #1]
    adrp     x9, #0x522000
    add      x9, x9, #0x620
    ldrb     w8, [x9]
    eor      w8, w8, #0x38
    adrp     x10, #0x522000
    add      x10, x10, #0x622
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w9, #0xa2
    eor      w8, w8, w9
    strb     w8, [x10, #1]
    adrp     x9, #0x522000
    add      x9, x9, #0x604
    ldrh     w8, [x9]
    mov      w10, #0xe66
    eor      w8, w8, w10
    adrp     x10, #0x522000
    add      x10, x10, #0x60e
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0x7a5a
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0x3a5d
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w11, #0xb0f1
    eor      w8, w8, w11
    strh     w8, [x10, #6]
    ldrh     w8, [x9, #8]
    mov      w9, #0x140d
    eor      w8, w8, w9
    strh     w8, [x10, #8]
    adrp     x9, #0x522000
    add      x9, x9, #0x634
    ldrb     w8, [x9]
    mov      w10, #0x2c
    eor      w8, w8, w10
    adrp     x10, #0x522000
    add      x10, x10, #0x638
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w11, #0xbc
    eor      w8, w8, w11
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w11, #0x28
    eor      w8, w8, w11
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    mov      w9, #5
    eor      w8, w8, w9
    strb     w8, [x10, #3]
    adrp     x9, #0x522000
    add      x9, x9, #0x5f0
    ldrh     w8, [x9]
    mov      w10, #0x35c0
    eor      w8, w8, w10
    adrp     x10, #0x522000
    add      x10, x10, #0x5fa
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0x7a40
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0x1df3
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w11, #0xc4e1
    eor      w8, w8, w11
    strh     w8, [x10, #6]
    ldrh     w8, [x9, #8]
    mov      w9, #0xab6
    eor      w8, w8, w9
    strh     w8, [x10, #8]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xb5e3
    movk     w9, #0x8d59, lsl #16
    str      w9, [x8]
    b        #0x252518
    ldur     w8, [x29, #-0xc4]
    cmp      w8, #0
    mov      w8, #0xb5e3
    movk     w8, #0x8d59, lsl #16
    mov      w9, #0xc7b5
    movk     w9, #0x9ba6, lsl #16
    csel     w8, w9, w8, eq
    b        #0x2558b4
    ldrb     w8, [x19, #0x5f]
    cmp      w8, #0
    mov      w8, #0xba7d
    movk     w8, #0x7fa3, lsl #16
    mov      w9, #0xd0c
    movk     w9, #0x45c2, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [x19, #0x18]
    str      w8, [x9]
    ldr      x8, [x19, #0x60]
    str      x8, [x19, #0x38]
    b        #0x252518
    ldr      x22, [x19, #0x50]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    ldur     x1, [x29, #-0xf8]
    ldp      d0, d1, [x29, #-0xc0]
    ldp      d2, d3, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    ldr      x0, [x19, #0x140]
    ldr      x1, [x19, #0x130]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x228]
    mov      x0, x21
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    ldr      d1, [x19, #0x220]
    ldr      x1, [x19, #0x218]
    fmov     d0, #18.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x210]
    mov      x0, x21
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x208]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x200]
    mov      x0, x21
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x240]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldur     x1, [x29, #-0x100]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x158]
    ldr      x1, [x19, #0x128]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x230]
    bl       #0x461ba0 // _objc_alloc
    ldur     x1, [x29, #-0xf8]
    ldp      d0, d1, [x29, #-0xc0]
    ldp      d2, d3, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    ldr      x1, [x19, #0x120]
    fmov     s0, wzr
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x19, #0x118]
    mov      w8, #0x437f0000
    fmov     s0, w8
    mov      x0, x28
    bl       #0x461c6c // _objc_msgSend
    add      x23, x22, #1
    ldr      x1, [x19, #0x110]
    mov      x0, x28
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    ldp      x1, x0, [x19, #0x130]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [x19, #0x108]
    mov      x0, x28
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x1c8]
    ldr      x3, [x19, #0x100]
    mov      x0, x28
    mov      x2, x20
    mov      w4, #0x1000
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x19, #0x240]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x100]
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x150]
    ldr      x1, [x19, #0x128]
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x19, #0xf8]
    mov      x0, x20
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [x19, #0x240]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldur     x1, [x29, #-0x100]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    mov      w24, #0x9bb0
    movk     w24, #0x42d4, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x148]
    ldr      x1, [x19, #0x128]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cmp      x23, #4
    ldr      x8, [x19, #0x18]
    mov      w9, #0x1913
    movk     w9, #0xdfbd, lsl #16
    mov      w10, #0x8bdd
    movk     w10, #0x3b59, lsl #16
    csel     w9, w10, w9, eq
    str      w9, [x8]
    str      x23, [x19, #0x50]
    b        #0x252518
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xd18]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xd1c]
    udiv     w8, w8, w9
    mov      w9, #0xb547
    movk     w9, #0x509c, lsl #16
    add      w8, w8, w9
    mov      w9, #0x844a
    movk     w9, #0xbba1, lsl #16
    and      w24, w8, w9
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x468]
    bl       #0x461ba0 // _objc_alloc
    mov      x21, x0
    ldur     x2, [x29, #-0xd0]
    adrp     x8, #0x522000
    add      x9, x8, #0x810
    adrp     x8, #0x522000
    add      x8, x8, #0x9d0
    stp      x9, x8, [x2]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    mov      w3, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa10]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa18]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8b8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      w21, w0
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0xa20]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa28]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x3, [x8, #0xa30]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    mov      x2, x20
    mov      w4, #0x1000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x248]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x100]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      w8, #0x322b
    movk     w8, #0x5f2a, lsl #16
    cmp      w24, w8
    mov      w24, #0x9bb0
    movk     w24, #0x42d4, lsl #16
    mov      w8, #0x8e77
    movk     w8, #0xc93d, lsl #16
    mov      w9, #0x9bb1
    movk     w9, #0x42d4, lsl #16
    csel     w8, w8, w9, eq
    ldr      x9, [x19, #0x18]
    str      w8, [x9]
    b        #0x252518
    adrp     x8, #0x4bf000
    ldr      x9, [x8, #0x170]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0xc30]
    stp      x8, x9, [x19, #0xc8]
    adrp     x8, #0x4c0000
    ldr      x9, [x8, #0xc08]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x830]
    stp      x8, x9, [x19, #0xb8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x600]
    str      x8, [x19, #0xb0]
    ldr      x8, [x19, #0x18]
    str      w25, [x8]
    str      xzr, [x19, #0x40]
    b        #0x252518
    ldr      x21, [x19, #0x40]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x168]
    ldr      x1, [x19, #0xd0]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [x19, #0xc8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    ldr      x1, [x19, #0x188]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    ldr      x1, [x19, #0x1b8]
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    ldr      x1, [x19, #0x1d8]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x1, [x19, #0x180]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    mov      w25, #0x5677
    movk     w25, #0x61e4, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x1d8]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x178]
    ldr      s0, [x19, #0x14]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x1d8]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x170]
    fmov     d0, #7.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x1d8]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x168]
    fmov     d0, xzr
    fmov     d1, #3.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x1c8]
    ldr      x3, [x19, #0xc0]
    mov      x0, x22
    mov      x2, x20
    mov      w4, #0x40
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x19, #0xe8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldur     x1, [x29, #-0x100]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0xe0]
    ldr      x1, [x19, #0xb8]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    add      x23, x21, #1
    ldr      x1, [x19, #0xd8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [x19, #0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cmp      x23, x22
    mov      w8, #0x47b7
    movk     w8, #0xccca, lsl #16
    csel     w8, w25, w8, lt
    ldr      x9, [x19, #0x18]
    str      w8, [x9]
    ldr      x8, [x19, #0xb0]
    stp      x23, x8, [x19, #0x40]
    mov      w24, #0x9bb0
    movk     w24, #0x42d4, lsl #16
    b        #0x252518
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x168]
    ldr      x1, [x19, #0x90]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [x19, #0x88]
    ldr      x2, [x19, #0x28]
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x19, #0x1c8]
    ldr      x3, [x19, #0x80]
    mov      x0, x21
    mov      x2, x20
    mov      w4, #0x40
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x19, #0x230]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x100]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0xa8]
    ldr      x1, [x19, #0x78]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    ldur     x1, [x29, #-0xf8]
    ldp      d0, d1, [x29, #-0xc0]
    ldp      d2, d3, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    ldr      x1, [x19, #0x70]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x68]
    ldr      x2, [x19, #0x28]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x1, [x19, #0x228]
    mov      x0, x22
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    ldr      x1, [x19, #0x218]
    ldr      d1, [x19, #0xf0]
    fmov     d0, #16.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x210]
    mov      x0, x22
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x208]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x200]
    mov      x0, x22
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x230]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldur     x1, [x29, #-0x100]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0xa0]
    ldr      x1, [x19, #0x78]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x98]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [x19, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x18]
    mov      w9, #0x5498
    movk     w9, #0x7bb3, lsl #16
    str      w9, [x8]
    mov      w24, #0x9bb0
    movk     w24, #0x42d4, lsl #16
    b        #0x252518
    ldr      x8, [x19, #0x18]
    mov      w9, #0xefec
    movk     w9, #0x7fea, lsl #16
    str      w9, [x8]
    b        #0x252518
    mov      w9, #0xba7d
    movk     w9, #0x7fa3, lsl #16
    cmp      w8, w9
    b.ne     #0x252518
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc40]
    ldr      x2, [x19, #0xa8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc48]
    ldr      x2, [x19, #0xa0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc50]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc58]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, #0xa0]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0xa8]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0xe0]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x138]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x140]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x148]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x150]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x158]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x190]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x198]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x1a0]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x1a8]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0xa0]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x255ddc
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

// -[WCLGColorPickerViewController viewDidAppear:] IMP=0x255DE0 bounds=0x255DE0-0x255EA4
loc_255DE0:
    sub      sp, sp, #0x40
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x768]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x380]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xfa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xfd8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc60]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xfb0]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    add      sp, sp, #0x40
    ret      

// -[WCLGColorPickerViewController viewWillDisappear:] IMP=0x255EA4 bounds=0x255EA4-0x2560D8
loc_255EA4:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x10
    mov      x19, x2
    mov      x20, x0
    mov      w23, #0x3ffc
    movk     w23, #0xb15f, lsl #16
    mov      w24, #0x1392
    movk     w24, #0x540f, lsl #16
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xd30]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xd34]
    orr      w8, w8, w9
    mov      w9, #0x178f
    movk     w9, #0xbb0b, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x7c65
    movk     w9, #0x3e7a, lsl #16
    add      w8, w8, w9
    stur     w8, [x29, #-0x54]
    mov      w8, #0x2ca9
    movk     w8, #0xd1ee, lsl #16
    stur     w8, [x29, #-0x58]
    sub      x8, x29, #0x58
    stur     x8, [x29, #-0x60]
    mov      w26, #0x1391
    movk     w26, #0x540f, lsl #16
    adrp     x27, #0x4be000
    adrp     x28, #0x4c0000
    adrp     x25, #0x4be000
    ldur     w8, [x29, #-0x58]
    cmp      w8, w26
    b.gt     #0x255f78
    cmp      w8, w23
    b.eq     #0x256010
    mov      w9, #0x2ca9
    movk     w9, #0xd1ee, lsl #16
    cmp      w8, w9
    b.ne     #0x255f34
    ldur     w8, [x29, #-0x54]
    mov      w9, #0x9b87
    movk     w9, #0x4bc5, lsl #16
    cmp      w8, w9
    csel     w8, w23, w24, hi
    ldur     x9, [x29, #-0x60]
    str      w8, [x9]
    b        #0x255f34
    cmp      w8, w24
    b.ne     #0x2560a8
    mov      x8, sp
    sub      x0, x8, #0x10
    mov      sp, x0
    adrp     x9, #0x4c4000
    ldr      x9, [x9, #0x768]
    stp      x20, x9, [x8, #-0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xaa8]
    mov      x2, x19
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb20]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [x27, #0xfa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [x28, #0xc68]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    ldr      x1, [x25, #0xfb0]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x60]
    str      w23, [x8]
    b        #0x255f34
    mov      x8, sp
    sub      x0, x8, #0x10
    mov      sp, x0
    adrp     x9, #0x4c4000
    ldr      x9, [x9, #0x768]
    stp      x20, x9, [x8, #-0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xaa8]
    mov      x2, x19
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb20]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [x27, #0xfa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [x28, #0xc68]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    ldr      x1, [x25, #0xfb0]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x60]
    mov      w9, #0x2ea0
    movk     w9, #0x7ea6, lsl #16
    str      w9, [x8]
    b        #0x255f34
    mov      w9, #0x2ea0
    movk     w9, #0x7ea6, lsl #16
    cmp      w8, w9
    b.ne     #0x255f34
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      

// -[WCLGColorPickerViewController viewDidLayoutSubviews] IMP=0x2560D8 bounds=0x2560D8-0x2562A8
loc_2560D8:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x10
    mov      x19, x0
    mov      w20, #0xaef9
    movk     w20, #0xe79e, lsl #16
    mov      w21, #0x7eed
    movk     w21, #0x9002, lsl #16
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xd40]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xd44]
    eor      w8, w8, w9
    mov      w9, #0xc81b
    movk     w9, #0x525a, lsl #16
    add      w8, w8, w9
    mov      w9, #0x4b05
    movk     w9, #0x48f, lsl #16
    eor      w8, w8, w9
    stur     w8, [x29, #-0x54]
    mov      w8, #0x2131
    movk     w8, #0x3370, lsl #16
    stur     w8, [x29, #-0x58]
    sub      x8, x29, #0x58
    stur     x8, [x29, #-0x60]
    mov      w23, #0x2130
    movk     w23, #0x3370, lsl #16
    adrp     x24, #0x4c4000
    adrp     x25, #0x4be000
    adrp     x26, #0x4c0000
    adrp     x27, #0x4c0000
    mov      w28, #0xf356
    movk     w28, #0x3eca, lsl #16
    ldur     w8, [x29, #-0x58]
    cmp      w8, w23
    b.gt     #0x256210
    cmp      w8, w21
    b.eq     #0x256240
    cmp      w8, w20
    b.ne     #0x256170
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xd48]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xd4c]
    and      w8, w8, w9
    mov      w9, #0xfdb5
    movk     w9, #0x8ed2, lsl #16
    add      w8, w8, w9
    mov      w9, #0x5b0a
    movk     w9, #0x31b1, lsl #16
    and      w8, w8, w9
    mov      w9, #0x39df
    movk     w9, #0x1208, lsl #16
    umull    x8, w8, w9
    lsr      x22, x8, #0x39
    mov      x8, sp
    sub      x0, x8, #0x10
    mov      sp, x0
    ldr      x9, [x24, #0x768]
    stp      x19, x9, [x8, #-0x10]
    ldr      x1, [x25, #0x390]
    bl       #0x461c84 // _objc_msgSendSuper2
    ldr      x1, [x26, #0xc70]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x27, #0xc78]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      w8, #0x451
    movk     w8, #0x2a39, lsl #16
    cmp      w22, w8
    csel     w8, w21, w28, eq
    b        #0x256234
    mov      w9, #0x2131
    movk     w9, #0x3370, lsl #16
    cmp      w8, w9
    b.ne     #0x256280
    ldur     w8, [x29, #-0x54]
    mov      w9, #0xce45
    movk     w9, #0x7692, lsl #16
    cmp      w8, w9
    csel     w8, w21, w20, lo
    ldur     x9, [x29, #-0x60]
    str      w8, [x9]
    b        #0x256170
    mov      x8, sp
    sub      x0, x8, #0x10
    mov      sp, x0
    ldr      x9, [x24, #0x768]
    stp      x19, x9, [x8, #-0x10]
    ldr      x1, [x25, #0x390]
    bl       #0x461c84 // _objc_msgSendSuper2
    ldr      x1, [x26, #0xc70]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x27, #0xc78]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldur     x8, [x29, #-0x60]
    str      w20, [x8]
    b        #0x256170
    cmp      w8, w28
    b.ne     #0x256170
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      

// -[WCLGColorPickerViewController traitCollectionDidChange:] IMP=0x2562A8 bounds=0x2562A8-0x256338
loc_2562A8:
    sub      sp, sp, #0x30
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x768]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x398]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xf30]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e8]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc80]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc58]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    add      sp, sp, #0x30
    ret      

// -[WCLGColorPickerViewController refreshThemeColors] IMP=0x256338 bounds=0x256338-0x257D18
loc_256338:
    stp      d11, d10, [sp, #-0x80]!
    stp      d9, d8, [sp, #0x10]
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    sub      sp, sp, #0x4c0
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x80]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9d0]
    str      x1, [sp, #0x188]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa58]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    str      x1, [sp, #0x180]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x1, [sp, #0x188]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa60]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x180]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x1, [sp, #0x188]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa68]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x180]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x270]
    stp      q0, q0, [sp, #0x250]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa90]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    str      x0, [sp, #0x418]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa98]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    str      x0, [sp, #0x420]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xaa0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    str      x0, [sp, #0x428]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    add      x2, sp, #0x418
    mov      w3, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x178]
    mov      x0, x22
    mov      w22, #0xa2d5
    movk     w22, #0xb8c2, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      w21, #0x82f8
    movk     w21, #0x9269, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      w20, #0x278f
    movk     w20, #0x20bb, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    str      x1, [sp, #0x170]
    ldr      x0, [sp, #0x178]
    add      x2, sp, #0x250
    sub      x3, x29, #0x100
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      w9, #0x467e
    movk     w9, #0x5c38, lsl #16
    str      x0, [sp, #0x168]
    add      x8, sp, #0xc
    mov      w23, #0x4ce4
    movk     w23, #0xfeb4, lsl #16
    str      w9, [sp, #0xc]
    mov      w25, #0x3753
    movk     w25, #0xbcbe, lsl #16
    str      x8, [sp]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x3f0]
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x3b0]
    adrp     x8, #0x491000
    ldr      d10, [x8, #0x428]
    adrp     x8, #0x491000
    ldr      d11, [x8, #0x530]
    mov      w27, #0x109f
    movk     w27, #0xce3d, lsl #16
    mov      w26, #0xad10
    movk     w26, #0x3dfe, lsl #16
    mov      w24, #0x278e
    movk     w24, #0x20bb, lsl #16
    mov      w28, #0x807c
    movk     w28, #0x58f6, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w23
    b.le     #0x256634
    cmp      w8, w26
    b.le     #0x256698
    cmp      w8, w28
    b.le     #0x256aec
    mov      w9, #0x81de
    movk     w9, #0x67c1, lsl #16
    cmp      w8, w9
    b.gt     #0x256bd0
    mov      w9, #0x6428
    movk     w9, #0x61fe, lsl #16
    cmp      w8, w9
    b.gt     #0x2572f8
    mov      w9, #0x807d
    movk     w9, #0x58f6, lsl #16
    cmp      w8, w9
    b.eq     #0x2578fc
    mov      w9, #0x467e
    movk     w9, #0x5c38, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    ldr      x8, [sp, #0x168]
    cmp      x8, #0
    mov      w8, #0x2e55
    movk     w8, #0x29cf, lsl #16
    mov      w9, #0x1277
    movk     w9, #0xc427, lsl #16
    b        #0x257ca0
    cmp      w8, w25
    b.le     #0x2568d4
    cmp      w8, w27
    b.le     #0x256a1c
    mov      w9, #0xcbc7
    movk     w9, #0xeb56, lsl #16
    cmp      w8, w9
    b.gt     #0x256b40
    mov      w9, #0x9b0
    movk     w9, #0xd72e, lsl #16
    cmp      w8, w9
    b.gt     #0x257198
    mov      w9, #0x10a0
    movk     w9, #0xce3d, lsl #16
    cmp      w8, w9
    b.eq     #0x2577b8
    mov      w9, #0x6c5e
    movk     w9, #0xd19d, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    ldr      x8, [sp]
    mov      w9, #0x2761
    movk     w9, #0x83ec, lsl #16
    str      w9, [x8]
    b        #0x2565bc
    cmp      w8, w24
    b.le     #0x256978
    mov      w9, #0x7e2c
    movk     w9, #0x2775, lsl #16
    cmp      w8, w9
    b.le     #0x256c5c
    mov      w9, #0xa2bc
    movk     w9, #0x2dcb, lsl #16
    cmp      w8, w9
    b.gt     #0x257118
    mov      w9, #0x7e2d
    movk     w9, #0x2775, lsl #16
    cmp      w8, w9
    b.eq     #0x257724
    mov      w9, #0x2e55
    movk     w9, #0x29cf, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    ldr      x0, [sp, #0x178]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9e8]
    str      x1, [sp, #0x138]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xab0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x180]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x1, [sp, #0x188]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xac0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x180]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x1, [sp, #0x138]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xad0]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [sp, #0x180]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    mov      w22, #0xa2d5
    movk     w22, #0xb8c2, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9c0]
    str      x1, [sp, #0x130]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x90]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0xbf0]
    cmp      w0, #0
    fcsel    d1, d9, d8, ne
    fmov     d0, #1.00000000
    mov      x0, x8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    str      x1, [sp, #0x128]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      w21, #0x82f8
    movk     w21, #0x9269, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      w20, #0x278f
    movk     w20, #0x20bb, lsl #16
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x230]
    stp      q0, q0, [sp, #0x210]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc88]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x120]
    ldr      x1, [sp, #0x170]
    add      x2, sp, #0x210
    add      x3, sp, #0x398
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x118]
    cmp      x0, #0
    mov      w8, #0xcf53
    movk     w8, #0x26bf, lsl #16
    mov      w9, #0x7e2d
    movk     w9, #0x2775, lsl #16
    b        #0x257ca0
    mov      w9, #0x5ac4
    movk     w9, #0xa24a, lsl #16
    cmp      w8, w9
    b.gt     #0x256a94
    mov      w9, #0xd68e
    movk     w9, #0x88a0, lsl #16
    cmp      w8, w9
    b.le     #0x256db4
    mov      w9, #0x82f7
    movk     w9, #0x9269, lsl #16
    cmp      w8, w9
    b.gt     #0x256f94
    mov      w9, #0xd68f
    movk     w9, #0x88a0, lsl #16
    cmp      w8, w9
    b.eq     #0x257588
    mov      w9, #0xe0b
    movk     w9, #0x8f31, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    ldr      x0, [sp, #0x120]
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x1f0]
    stp      q0, q0, [sp, #0x1d0]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc90]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldr      x1, [sp, #0x170]
    add      x2, sp, #0x1d0
    add      x3, sp, #0x318
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp]
    mov      w9, #0xee48
    movk     w9, #0xf703, lsl #16
    str      w9, [x8]
    b        #0x2565bc
    mov      w9, #0x54f5
    movk     w9, #0xf0c, lsl #16
    cmp      w8, w9
    b.le     #0x256ce4
    mov      w9, #0x1ed2
    movk     w9, #0x14fa, lsl #16
    cmp      w8, w9
    b.gt     #0x256ee4
    mov      w9, #0x54f6
    movk     w9, #0xf0c, lsl #16
    cmp      w8, w9
    b.eq     #0x2573e4
    mov      w9, #0xcf34
    movk     w9, #0x10de, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xd90]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xd94]
    add      w8, w8, w9
    mov      w9, #0xf14a
    movk     w9, #0xa0ea, lsl #16
    and      w8, w8, w9
    mov      w9, #0x9e6e
    movk     w9, #0xd8d7, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x1447
    movk     w9, #0x3224, lsl #16
    umull    x9, w8, w9
    lsr      x9, x9, #0x20
    sub      w8, w8, w9
    add      w8, w9, w8, lsr #1
    mov      w9, #0x193f
    movk     w9, #0xa431, lsl #16
    cmp      w9, w8, lsr #29
    mov      w8, #0x826e
    movk     w8, #0xf5d7, lsl #16
    mov      w9, #0x7c22
    movk     w9, #0x3623, lsl #16
    b        #0x257218
    mov      w9, #0xa094
    movk     w9, #0xc3f6, lsl #16
    cmp      w8, w9
    b.le     #0x256d28
    mov      w9, #0xac7b
    movk     w9, #0xc68c, lsl #16
    cmp      w8, w9
    b.gt     #0x256f20
    mov      w9, #0xa095
    movk     w9, #0xc3f6, lsl #16
    cmp      w8, w9
    b.eq     #0x257410
    mov      w9, #0x1277
    movk     w9, #0xc427, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    add      x9, sp, #0x250
    add      x10, x9, #0x10
    ldr      x8, [sp, #0x260]
    ldr      x8, [x8]
    stp      x8, x10, [sp, #0x158]
    orr      x8, x9, #8
    str      x8, [sp, #0x150]
    ldr      x8, [sp]
    mov      w9, #0x4260
    movk     w9, #0x445d, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x168]
    str      x8, [sp, #0x88]
    b        #0x2565bc
    mov      w9, #0x46a3
    movk     w9, #0xb29e, lsl #16
    cmp      w8, w9
    b.le     #0x256e20
    mov      w9, #0xa2d4
    movk     w9, #0xb8c2, lsl #16
    cmp      w8, w9
    b.gt     #0x256fd8
    mov      w9, #0x46a4
    movk     w9, #0xb29e, lsl #16
    cmp      w8, w9
    b.eq     #0x25759c
    mov      w9, #0x9bd8
    movk     w9, #0xb6f1, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    ldr      x8, [sp]
    mov      w9, #0x5ac5
    movk     w9, #0xa24a, lsl #16
    str      w9, [x8]
    str      xzr, [sp, #0x50]
    b        #0x2565bc
    mov      w9, #0x425f
    movk     w9, #0x445d, lsl #16
    cmp      w8, w9
    b.le     #0x256e54
    mov      w9, #0x1db0
    movk     w9, #0x4efb, lsl #16
    cmp      w8, w9
    b.gt     #0x257028
    mov      w9, #0x4260
    movk     w9, #0x445d, lsl #16
    cmp      w8, w9
    b.eq     #0x257690
    mov      w9, #0x53fc
    movk     w9, #0x4cfb, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    ldr      x8, [sp]
    mov      w9, #0x7e35
    movk     w9, #0xc00b, lsl #16
    str      w9, [x8]
    b        #0x2565bc
    mov      w9, #0x826d
    movk     w9, #0xf5d7, lsl #16
    cmp      w8, w9
    b.gt     #0x257220
    mov      w9, #0xcbc8
    movk     w9, #0xeb56, lsl #16
    cmp      w8, w9
    b.eq     #0x257818
    mov      w9, #0x751a
    movk     w9, #0xf26e, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xd58]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xd5c]
    add      w8, w8, w9
    mov      w9, #0x5325
    movk     w9, #0xf7f3, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x48d
    movk     w9, #0x25cc, lsl #16
    mul      w8, w8, w9
    adrp     x9, #0x4c0000
    ldr      x10, [x9, #0x9c8]
    adrp     x9, #0x4be000
    ldr      x9, [x9, #0x460]
    stp      x9, x10, [sp, #0x140]
    mov      w9, #0x6b01
    movk     w9, #0xf2f6, lsl #16
    cmp      w8, w9
    mov      w8, #0xad11
    movk     w8, #0x3dfe, lsl #16
    mov      w9, #0x6429
    movk     w9, #0x61fe, lsl #16
    b        #0x257ca0
    mov      w9, #0xc4ad
    movk     w9, #0x705f, lsl #16
    cmp      w8, w9
    b.gt     #0x257334
    mov      w9, #0x81df
    movk     w9, #0x67c1, lsl #16
    cmp      w8, w9
    b.eq     #0x257910
    mov      w9, #0x6913
    movk     w9, #0x67c4, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    ldr      x8, [sp, #0x58]
    str      x8, [sp, #0x18]
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xdc0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xdc4]
    udiv     w8, w8, w9
    mov      w9, #0x9d95
    movk     w9, #0xe5a, lsl #16
    mul      w8, w8, w9
    mov      w9, #0xc557
    movk     w9, #0xa789, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x9996
    movk     w9, #0xdbd8, lsl #16
    add      w8, w8, w9
    mov      w9, #0x4a41
    movk     w9, #0x4cec, lsl #16
    cmp      w8, w9
    mov      w8, #0x54f6
    movk     w8, #0xf0c, lsl #16
    csel     w8, w8, w20, lo
    b        #0x257ca4
    mov      w9, #0x7498
    movk     w9, #0x26bc, lsl #16
    cmp      w8, w9
    b.le     #0x257370
    mov      w9, #0x7499
    movk     w9, #0x26bc, lsl #16
    cmp      w8, w9
    b.eq     #0x2573d0
    mov      w9, #0xcf53
    movk     w9, #0x26bf, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xd70]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xd74]
    mul      w8, w8, w9
    mov      w9, #0x1b43
    movk     w9, #0xdb40, lsl #16
    and      w8, w8, w9
    mov      w9, #0x686e
    movk     w9, #0xf555, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x2556
    movk     w9, #0x7f8, lsl #16
    add      w8, w8, w9
    mov      w9, #0xe603
    movk     w9, #0x3ee4, lsl #16
    cmp      w8, w9
    mov      w8, #0xee48
    movk     w8, #0xf703, lsl #16
    mov      w9, #0xe0b
    movk     w9, #0x8f31, lsl #16
    b        #0x2579b4
    mov      w9, #0x4ce5
    movk     w9, #0xfeb4, lsl #16
    cmp      w8, w9
    b.eq     #0x257b9c
    mov      w9, #0x40bb
    movk     w9, #0xff3c, lsl #16
    cmp      w8, w9
    b.eq     #0x2579bc
    mov      w9, #0xdb8f
    movk     w9, #0x496, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    ldr      x0, [sp, #0xb8]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x2565bc
    mov      w9, #0x3754
    movk     w9, #0xbcbe, lsl #16
    cmp      w8, w9
    b.eq     #0x257bbc
    mov      w9, #0xb4fa
    movk     w9, #0xbeda, lsl #16
    cmp      w8, w9
    b.eq     #0x257ac0
    mov      w9, #0x7e35
    movk     w9, #0xc00b, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xdb8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xdbc]
    add      w8, w8, w9
    mov      w9, #0xdbf6
    movk     w9, #0xf7b5, lsl #16
    mul      w8, w8, w9
    add      x10, sp, #0x190
    add      x11, x10, #0x10
    ldr      x9, [sp, #0x1a0]
    ldr      x9, [x9]
    stp      x9, x11, [sp, #0x98]
    orr      x9, x10, #8
    str      x9, [sp, #0x90]
    mov      w9, #0xb620
    movk     w9, #0x29f4, lsl #16
    cmp      w8, w9
    mov      w8, #0x53fc
    movk     w8, #0x4cfb, lsl #16
    mov      w9, #0xdd7e
    movk     w9, #0x18f2, lsl #16
    b        #0x257ca0
    mov      w9, #0x2761
    movk     w9, #0x83ec, lsl #16
    cmp      w8, w9
    b.eq     #0x257bf8
    mov      w9, #0x9f08
    movk     w9, #0x84c3, lsl #16
    cmp      w8, w9
    b.eq     #0x257b00
    mov      w9, #0x3272
    movk     w9, #0x85e3, lsl #16
    cmp      w8, w9
    mov      w21, #0x82f8
    movk     w21, #0x9269, lsl #16
    mov      w20, #0x278f
    movk     w20, #0x20bb, lsl #16
    b.ne     #0x2565bc
    ldr      x8, [sp, #0x70]
    str      x8, [sp, #0x30]
    ldp      x9, x8, [sp, #0x108]
    ldr      x8, [x8]
    ldr      x8, [x8]
    cmp      x8, x9
    mov      w8, #0x2761
    movk     w8, #0x83ec, lsl #16
    mov      w9, #0xded5
    movk     w9, #0x4458, lsl #16
    b        #0x257ca0
    mov      w9, #0x5ac5
    movk     w9, #0xa24a, lsl #16
    cmp      w8, w9
    b.eq     #0x257c78
    mov      w9, #0x9546
    movk     w9, #0xaa51, lsl #16
    cmp      w8, w9
    b.eq     #0x257b6c
    mov      w9, #0x17c3
    movk     w9, #0xaa75, lsl #16
    cmp      w8, w9
    b.eq     #0x257aac
    b        #0x2565bc
    mov      w9, #0xad11
    movk     w9, #0x3dfe, lsl #16
    cmp      w8, w9
    b.eq     #0x257cb0
    mov      w9, #0x1003
    movk     w9, #0x4163, lsl #16
    cmp      w8, w9
    b.eq     #0x257b80
    mov      w9, #0xded5
    movk     w9, #0x4458, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xd60]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xd64]
    udiv     w8, w8, w9
    mov      w9, #0x5571
    movk     w9, #0x9a0d, lsl #16
    and      w8, w8, w9
    mov      w9, #0x2a73
    movk     w9, #0xabe3, lsl #16
    add      w8, w8, w9
    mov      w9, #0xd775
    movk     w9, #0x9400, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3f
    mov      w9, #0x90a4
    movk     w9, #0x4f8f, lsl #16
    cmp      w8, w9
    mov      w8, #0xa095
    movk     w8, #0xc3f6, lsl #16
    mov      w9, #0xc4ae
    movk     w9, #0x705f, lsl #16
    csel     w8, w9, w8, ne
    b        #0x257ca4
    mov      w9, #0x1ed3
    movk     w9, #0x14fa, lsl #16
    cmp      w8, w9
    b.eq     #0x2573f0
    mov      w9, #0xdd7e
    movk     w9, #0x18f2, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    ldr      x8, [sp]
    mov      w9, #0x6913
    movk     w9, #0x67c4, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0xb0]
    str      x8, [sp, #0x58]
    b        #0x2565bc
    mov      w9, #0xac7c
    movk     w9, #0xc68c, lsl #16
    cmp      w8, w9
    b.eq     #0x25742c
    mov      w9, #0x7719
    movk     w9, #0xcca3, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xdd0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xdd4]
    mov      w10, #0x36
    movk     w10, #0xc735, lsl #16
    madd     w8, w8, w9, w10
    mov      w9, #0x53fc
    movk     w9, #0x4cfb, lsl #16
    sub      w9, w9, #0x747
    mul      w8, w8, w9
    mov      w9, #0x8e54
    movk     w9, #0xaac4, lsl #16
    and      w8, w8, w9
    mov      w9, #0xa315
    movk     w9, #0x1afa, lsl #16
    cmp      w8, w9
    mov      w8, #0xdb8f
    movk     w8, #0x496, lsl #16
    csel     w8, w21, w8, hi
    b        #0x257ca4
    cmp      w8, w21
    b.eq     #0x2575c8
    mov      w9, #0x6668
    movk     w9, #0x9e78, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    ldr      x8, [sp, #0x80]
    str      x8, [sp, #0x40]
    ldp      x9, x8, [sp, #0x158]
    ldr      x8, [x8]
    ldr      x8, [x8]
    cmp      x8, x9
    mov      w8, #0x9f08
    movk     w8, #0x84c3, lsl #16
    mov      w9, #0x718f
    movk     w9, #0x7a48, lsl #16
    b        #0x257ca0
    cmp      w8, w22
    b.eq     #0x25762c
    mov      w9, #0x29fa
    movk     w9, #0xbae7, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    add      x9, sp, #0x1d0
    add      x10, x9, #0x10
    ldr      x8, [sp, #0x1e0]
    ldr      x8, [x8]
    stp      x8, x10, [sp, #0xd8]
    orr      x8, x9, #8
    str      x8, [sp, #0xd0]
    ldr      x8, [sp]
    mov      w9, #0x46a4
    movk     w9, #0xb29e, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0xf0]
    str      x8, [sp, #0x68]
    b        #0x2565bc
    mov      w9, #0x1db1
    movk     w9, #0x4efb, lsl #16
    cmp      w8, w9
    b.eq     #0x2576e4
    mov      w9, #0xaf44
    movk     w9, #0x4fb1, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    ldr      x8, [sp, #0xd0]
    ldr      x8, [x8]
    ldr      x9, [sp, #0x20]
    ldr      x20, [x8, x9, lsl #3]
    ldr      x1, [sp, #0x138]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x180]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [sp, #0x130]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x90]
    cmp      w0, #0
    fcsel    d1, d11, d10, ne
    ldr      x1, [sp, #0xc8]
    fmov     d0, #1.00000000
    mov      x0, x8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x128]
    mov      x0, x20
    mov      w20, #0x278f
    movk     w20, #0x20bb, lsl #16
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      w21, #0x82f8
    movk     w21, #0x9269, lsl #16
    bl       #0x461c9c // _objc_release
    ldp      x8, x9, [sp, #0x20]
    add      x8, x8, #1
    cmp      x8, x9
    mov      w9, #0x10a0
    movk     w9, #0xce3d, lsl #16
    mov      w10, #0xb4fa
    movk     w10, #0xbeda, lsl #16
    csel     w9, w10, w9, eq
    ldr      x10, [sp]
    str      w9, [x10]
    str      x8, [sp, #0x60]
    b        #0x2565bc
    mov      w9, #0xa2bd
    movk     w9, #0x2dcb, lsl #16
    cmp      w8, w9
    b.eq     #0x25775c
    mov      w9, #0x7c22
    movk     w9, #0x3623, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xd98]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xd9c]
    add      w8, w8, w9
    mov      w9, #0xa7b1
    movk     w9, #0xae32, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3f
    mov      w9, #0xea36
    movk     w9, #0xd1ed, lsl #16
    orr      w20, w8, w9
    ldr      x0, [sp, #0xf8]
    bl       #0x461c24 // _objc_enumerationMutation
    mov      w8, #0x4679
    movk     w8, #0xd0cb, lsl #16
    cmp      w20, w8
    mov      w20, #0x278f
    movk     w20, #0x20bb, lsl #16
    mov      w8, #0x826e
    movk     w8, #0xf5d7, lsl #16
    mov      w9, #0xd68f
    movk     w9, #0x88a0, lsl #16
    b        #0x257810
    mov      w9, #0x9b1
    movk     w9, #0xd72e, lsl #16
    cmp      w8, w9
    b.eq     #0x257860
    mov      w9, #0xd395
    movk     w9, #0xd85d, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xd88]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xd8c]
    and      w8, w8, w9
    mov      w9, #0x8404
    movk     w9, #0x8008, lsl #16
    and      w8, w8, w9
    mov      w9, #0xd5da
    movk     w9, #0xff6b, lsl #16
    add      w8, w8, w9
    ldp      x10, x9, [sp, #0xd8]
    ldr      x9, [x9]
    ldr      x9, [x9]
    cmp      x9, x10
    cset     w9, eq
    strb     w9, [sp, #0xc7]
    mov      w9, #0x2ed6
    movk     w9, #0x3489, lsl #16
    cmp      w8, w9
    mov      w8, #0x807d
    movk     w8, #0x58f6, lsl #16
    mov      w9, #0x3817
    movk     w9, #0x6582, lsl #16
    csel     w8, w9, w8, hi
    b        #0x257ca4
    mov      w9, #0x826e
    movk     w9, #0xf5d7, lsl #16
    cmp      w8, w9
    b.eq     #0x2578e0
    mov      w9, #0xee48
    movk     w9, #0xf703, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xd78]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xd7c]
    orr      w8, w8, w9
    mov      w9, #0xdbb5
    movk     w9, #0xc63b, lsl #16
    add      w8, w8, w9
    mov      w9, #0x82b3
    movk     w9, #0x44fc, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3d
    mov      w9, #0x6cdc
    movk     w9, #0x274a, lsl #16
    orr      w20, w8, w9
    ldr      x0, [sp, #0x120]
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x1f0]
    stp      q0, q0, [sp, #0x1d0]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc90]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0xf8]
    ldr      x1, [sp, #0x170]
    add      x2, sp, #0x1d0
    add      x3, sp, #0x318
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0xf0]
    cmp      x0, #0
    cset     w8, eq
    strb     w8, [sp, #0xef]
    mov      w8, #0xd9c6
    movk     w8, #0x3ee1, lsl #16
    cmp      w20, w8
    mov      w20, #0x278f
    movk     w20, #0x20bb, lsl #16
    mov      w8, #0xee48
    movk     w8, #0xf703, lsl #16
    mov      w9, #0x4ce5
    movk     w9, #0xfeb4, lsl #16
    b        #0x2579b4
    mov      w9, #0x6429
    movk     w9, #0x61fe, lsl #16
    cmp      w8, w9
    b.eq     #0x257950
    mov      w9, #0x3817
    movk     w9, #0x6582, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    ldrb     w8, [sp, #0xc7]
    cmp      w8, #0
    mov      w8, #0xaf44
    movk     w8, #0x4fb1, lsl #16
    mov      w9, #0xcf34
    movk     w9, #0x10de, lsl #16
    b        #0x257bb4
    mov      w9, #0xc4ae
    movk     w9, #0x705f, lsl #16
    cmp      w8, w9
    b.eq     #0x257968
    mov      w9, #0x718f
    movk     w9, #0x7a48, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    ldr      x0, [sp, #0x178]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp]
    mov      w9, #0x9f08
    movk     w9, #0x84c3, lsl #16
    str      w9, [x8]
    b        #0x2565bc
    cmp      w8, w20
    b.ne     #0x257cc4
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xdc8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xdcc]
    orr      w8, w8, w9
    mov      w9, #0xd5a2
    movk     w9, #0xfc99, lsl #16
    add      w8, w8, w9
    mov      w9, #0x2927
    movk     w9, #0x8298, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3d
    mov      w9, #0xfb65
    movk     w9, #0xffcd, lsl #16
    add      w8, w8, w9
    mov      w9, #0x17c8
    movk     w9, #0xc4c7, lsl #16
    cmp      w8, w9
    mov      w8, #0x9bd8
    movk     w8, #0xb6f1, lsl #16
    csel     w8, w8, w20, hi
    b        #0x257ca4
    ldr      x0, [sp, #0xb8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x2565bc
    ldr      x8, [sp]
    str      w20, [x8]
    b        #0x2565bc
    ldr      x8, [sp, #0x78]
    str      x8, [sp, #0x38]
    ldr      x8, [sp]
    mov      w9, #0x3272
    movk     w9, #0x85e3, lsl #16
    str      w9, [x8]
    str      xzr, [sp, #0x70]
    b        #0x2565bc
    ldr      x0, [sp, #0x120]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp]
    mov      w9, #0xc4ae
    movk     w9, #0x705f, lsl #16
    str      w9, [x8]
    b        #0x2565bc
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xda8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xdac]
    eor      w8, w8, w9
    mov      w9, #0xb1cf
    movk     w9, #0x8e57, lsl #16
    add      w8, w8, w9
    mov      w9, #0x661f
    movk     w9, #0x1295, lsl #16
    umull    x8, w8, w9
    lsr      x22, x8, #0x3c
    ldr      x0, [sp, #0xf8]
    bl       #0x461c9c // _objc_release
    ldr      x1, [sp, #0x138]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbb8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x180]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x1, [sp, #0x188]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbc8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x180]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      w21, #0x82f8
    movk     w21, #0x9269, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      w20, #0x278f
    movk     w20, #0x20bb, lsl #16
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x1b0]
    stp      q0, q0, [sp, #0x190]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc98]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0xb8]
    ldr      x1, [sp, #0x170]
    add      x2, sp, #0x190
    add      x3, sp, #0x298
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0xb0]
    cmp      x0, #0
    cset     w8, eq
    strb     w8, [sp, #0xaf]
    mov      w8, #0x1839
    movk     w8, #0xae94, lsl #16
    cmp      w22, w8
    mov      w22, #0xa2d5
    movk     w22, #0xb8c2, lsl #16
    mov      w8, #0x40bb
    movk     w8, #0xff3c, lsl #16
    mov      w9, #0x1003
    movk     w9, #0x4163, lsl #16
    b        #0x257ca0
    ldr      x8, [sp]
    mov      w9, #0xaf44
    movk     w9, #0x4fb1, lsl #16
    str      w9, [x8]
    b        #0x2565bc
    ldr      x8, [sp, #0x68]
    str      x8, [sp, #0x28]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xbf0]
    str      x8, [sp, #0xc8]
    ldr      x8, [sp]
    mov      w9, #0x10a0
    movk     w9, #0xce3d, lsl #16
    str      w9, [x8]
    str      xzr, [sp, #0x60]
    b        #0x2565bc
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xdd8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xddc]
    orr      w8, w8, w9
    mov      w9, #0xb9f0
    movk     w9, #0xf3e6, lsl #16
    add      w8, w8, w9
    mov      w9, #0x5fa1
    movk     w9, #0x42c9, lsl #16
    and      w8, w8, w9
    mov      w9, #0xe2da
    movk     w9, #0xa388, lsl #16
    mul      w20, w8, w9
    ldr      x0, [sp, #0xb8]
    bl       #0x461c24 // _objc_enumerationMutation
    mov      w8, #0x9d5a
    movk     w8, #0xe2aa, lsl #16
    cmp      w20, w8
    mov      w20, #0x278f
    movk     w20, #0x20bb, lsl #16
    mov      w8, #0x9546
    movk     w8, #0xaa51, lsl #16
    csel     w8, w8, w21, lo
    b        #0x257ca4
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xde8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xdec]
    orr      w8, w8, w9
    mov      w9, #0xdd7b
    movk     w9, #0x361b, lsl #16
    mul      w8, w8, w9
    mov      w9, #0xf102
    movk     w9, #0x1636, lsl #16
    orr      w8, w8, w9
    mov      w9, #0xfb22
    movk     w9, #0xc2e5, lsl #16
    mul      w20, w8, w9
    ldr      x0, [sp, #0xb8]
    bl       #0x461c9c // _objc_release
    mov      w8, #0x64c8
    movk     w8, #0xdd2d, lsl #16
    cmp      w20, w8
    mov      w20, #0x278f
    movk     w20, #0x20bb, lsl #16
    mov      w8, #0xcf85
    movk     w8, #0x2262, lsl #16
    csel     w8, w8, w22, ne
    b        #0x257ca4
    ldr      x8, [sp, #0x88]
    str      x8, [sp, #0x48]
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xd50]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xd54]
    add      w8, w8, w9
    mov      w9, #0x4221
    movk     w9, #0x2122, lsl #16
    eor      w8, w8, w9
    mov      w9, #0xb5e5
    movk     w9, #0xe4c1, lsl #16
    mul      w8, w8, w9
    mov      w9, #0xd99e
    movk     w9, #0xc312, lsl #16
    cmp      w8, w9
    mov      w8, #0x751a
    movk     w8, #0xf26e, lsl #16
    mov      w9, #0xad11
    movk     w9, #0x3dfe, lsl #16
    b        #0x257bb4
    ldr      x1, [sp, #0x170]
    ldr      x0, [sp, #0x120]
    add      x2, sp, #0x210
    add      x3, sp, #0x398
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    ldr      x8, [sp]
    mov      w9, #0xcf53
    movk     w9, #0x26bf, lsl #16
    mov      w10, #0x1ed3
    movk     w10, #0x14fa, lsl #16
    csel     w9, w9, w10, eq
    str      w9, [x8]
    str      x0, [sp, #0x78]
    b        #0x2565bc
    add      x9, sp, #0x210
    add      x10, x9, #0x10
    ldr      x8, [sp, #0x220]
    ldr      x8, [x8]
    stp      x8, x10, [sp, #0x108]
    add      x8, x9, #8
    str      x8, [sp, #0x100]
    ldr      x8, [sp]
    mov      w9, #0x1ed3
    movk     w9, #0x14fa, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x118]
    str      x8, [sp, #0x78]
    b        #0x2565bc
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xdb0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xdb4]
    sub      w8, w8, w9
    mov      w9, #0x4a44
    movk     w9, #0x1781, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x3588
    movk     w9, #0xe00e, lsl #16
    orr      w8, w8, w9
    mov      w9, #0xdcd
    movk     w9, #0xdcd0, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x3e84
    movk     w9, #0x54b6, lsl #16
    cmp      w8, w9
    mov      w8, #0x7e35
    movk     w8, #0xc00b, lsl #16
    mov      w9, #0x53fc
    movk     w9, #0x4cfb, lsl #16
    csel     w8, w9, w8, lo
    b        #0x257ca4
    ldr      x8, [sp, #0x60]
    str      x8, [sp, #0x20]
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xd80]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xd84]
    and      w8, w8, w9
    mov      w9, #0x5efc
    movk     w9, #0xe1e6, lsl #16
    add      w8, w8, w9
    lsr      w8, w8, #1
    mov      w9, #0x7c3
    movk     w9, #0x4863, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3d
    mov      w9, #0x32ad
    movk     w9, #0x2434, lsl #16
    cmp      w8, w9
    mov      w8, #0xd395
    movk     w8, #0xd85d, lsl #16
    mov      w9, #0x807d
    movk     w9, #0x58f6, lsl #16
    csel     w8, w8, w9, lo
    b        #0x257ca4
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xde0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xde4]
    eor      w8, w8, w9
    mov      w9, #0x38e8
    movk     w9, #0x4096, lsl #16
    add      w8, w8, w9
    mov      w9, #0x717d
    movk     w9, #0xeae7, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x24d7
    movk     w9, #0x43f5, lsl #16
    cmp      w8, w9
    mov      w8, #0x7499
    movk     w8, #0x26bc, lsl #16
    csel     w8, w22, w8, hi
    b        #0x257ca4
    ldr      x8, [sp, #0x90]
    ldr      x8, [x8]
    ldr      x9, [sp, #0x10]
    ldr      x20, [x8, x9, lsl #3]
    ldr      x1, [sp, #0x138]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x180]
    mov      x0, x20
    mov      w20, #0x278f
    movk     w20, #0x20bb, lsl #16
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      w21, #0x82f8
    movk     w21, #0x9269, lsl #16
    bl       #0x461c9c // _objc_release
    ldp      x8, x9, [sp, #0x10]
    add      x8, x8, #1
    cmp      x8, x9
    mov      w9, #0x5ac5
    movk     w9, #0xa24a, lsl #16
    mov      w10, #0x81df
    movk     w10, #0x67c1, lsl #16
    csel     w9, w10, w9, eq
    ldr      x10, [sp]
    str      w9, [x10]
    str      x8, [sp, #0x50]
    b        #0x2565bc
    ldr      x0, [sp, #0xf8]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp]
    mov      w9, #0x7c22
    movk     w9, #0x3623, lsl #16
    str      w9, [x8]
    b        #0x2565bc
    ldr      x8, [sp]
    mov      w9, #0xd395
    movk     w9, #0xd85d, lsl #16
    str      w9, [x8]
    b        #0x2565bc
    ldr      x1, [sp, #0x170]
    ldr      x0, [sp, #0xb8]
    add      x2, sp, #0x190
    add      x3, sp, #0x298
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    ldr      x8, [sp]
    mov      w9, #0xcbc8
    movk     w9, #0xeb56, lsl #16
    mov      w10, #0x6913
    movk     w10, #0x67c4, lsl #16
    csel     w9, w9, w10, eq
    str      w9, [x8]
    str      x0, [sp, #0x58]
    b        #0x2565bc
    ldr      x8, [sp]
    mov      w9, #0x6668
    movk     w9, #0x9e78, lsl #16
    str      w9, [x8]
    str      xzr, [sp, #0x80]
    b        #0x2565bc
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xd68]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xd6c]
    eor      w8, w8, w9
    mov      w9, #0xf98d
    movk     w9, #0xb63d, lsl #16
    add      w20, w8, w9
    ldr      x0, [sp, #0x120]
    bl       #0x461c24 // _objc_enumerationMutation
    mov      w8, #0x166
    movk     w8, #0x847e, lsl #16
    cmp      w20, w8
    mov      w20, #0x278f
    movk     w20, #0x20bb, lsl #16
    mov      w8, #0xa095
    movk     w8, #0xc3f6, lsl #16
    mov      w9, #0x6c5e
    movk     w9, #0xd19d, lsl #16
    csel     w8, w8, w9, hi
    b        #0x257ca4
    ldr      x0, [sp, #0xf8]
    bl       #0x461c9c // _objc_release
    ldr      x1, [sp, #0x138]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbb8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x180]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x1, [sp, #0x188]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbc8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x180]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      w21, #0x82f8
    movk     w21, #0x9269, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      w20, #0x278f
    movk     w20, #0x20bb, lsl #16
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x1b0]
    stp      q0, q0, [sp, #0x190]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc98]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldr      x1, [sp, #0x170]
    add      x2, sp, #0x190
    add      x3, sp, #0x298
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp]
    mov      w9, #0xac7c
    movk     w9, #0xc68c, lsl #16
    str      w9, [x8]
    b        #0x2565bc
    ldr      x1, [sp, #0x170]
    ldr      x0, [sp, #0xf8]
    add      x2, sp, #0x1d0
    add      x3, sp, #0x318
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    ldr      x8, [sp]
    mov      w9, #0x46a4
    movk     w9, #0xb29e, lsl #16
    mov      w10, #0x17c3
    movk     w10, #0xaa75, lsl #16
    csel     w9, w10, w9, eq
    str      w9, [x8]
    str      x0, [sp, #0x68]
    b        #0x2565bc
    ldp      x1, x8, [sp, #0x148]
    ldr      x8, [x8]
    ldr      x9, [sp, #0x40]
    ldr      x20, [x8, x9, lsl #3]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x140]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldp      x8, x9, [sp, #0x40]
    add      x8, x8, #1
    cmp      x8, x9
    mov      w9, #0x6668
    movk     w9, #0x9e78, lsl #16
    mov      w10, #0x3754
    movk     w10, #0xbcbe, lsl #16
    csel     w9, w10, w9, eq
    ldr      x10, [sp]
    str      w9, [x10]
    str      x8, [sp, #0x80]
    b        #0x257c64
    ldr      x8, [sp]
    mov      w9, #0x9b1
    movk     w9, #0xd72e, lsl #16
    str      w9, [x8]
    b        #0x2565bc
    ldrb     w8, [sp, #0xaf]
    cmp      w8, #0
    mov      w8, #0xcbc8
    movk     w8, #0xeb56, lsl #16
    mov      w9, #0xa2bd
    movk     w9, #0x2dcb, lsl #16
    b        #0x257bb4
    ldrb     w8, [sp, #0xef]
    cmp      w8, #0
    mov      w8, #0x17c3
    movk     w8, #0xaa75, lsl #16
    mov      w9, #0x29fa
    movk     w9, #0xbae7, lsl #16
    csel     w8, w8, w9, ne
    b        #0x257ca4
    ldp      x1, x0, [sp, #0x170]
    add      x2, sp, #0x250
    sub      x3, x29, #0x100
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    ldr      x8, [sp]
    mov      w9, #0x4260
    movk     w9, #0x445d, lsl #16
    mov      w10, #0x2e55
    movk     w10, #0x29cf, lsl #16
    csel     w9, w10, w9, eq
    str      w9, [x8]
    str      x0, [sp, #0x88]
    b        #0x2565bc
    ldr      x8, [sp, #0x100]
    ldr      x8, [x8]
    ldr      x9, [sp, #0x30]
    ldr      x20, [x8, x9, lsl #3]
    ldr      x1, [sp, #0x138]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x180]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldp      x8, x9, [sp, #0x30]
    add      x8, x8, #1
    cmp      x8, x9
    mov      w9, #0x3272
    movk     w9, #0x85e3, lsl #16
    mov      w10, #0x1db1
    movk     w10, #0x4efb, lsl #16
    csel     w9, w10, w9, eq
    ldr      x10, [sp]
    str      w9, [x10]
    str      x8, [sp, #0x70]
    mov      w21, #0x82f8
    movk     w21, #0x9269, lsl #16
    mov      w20, #0x278f
    movk     w20, #0x20bb, lsl #16
    b        #0x2565bc
    ldr      x8, [sp, #0x50]
    str      x8, [sp, #0x10]
    ldp      x9, x8, [sp, #0x98]
    ldr      x8, [x8]
    ldr      x8, [x8]
    cmp      x8, x9
    mov      w8, #0x9b1
    movk     w8, #0xd72e, lsl #16
    mov      w9, #0x7719
    movk     w9, #0xcca3, lsl #16
    csel     w8, w8, w9, eq
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x2565bc
    ldr      x8, [sp]
    mov      w9, #0x751a
    movk     w9, #0xf26e, lsl #16
    str      w9, [x8]
    b        #0x2565bc
    mov      w9, #0xcf85
    movk     w9, #0x2262, lsl #16
    cmp      w8, w9
    b.ne     #0x2565bc
    ldur     x8, [x29, #-0x80]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x257d14
    add      sp, sp, #0x4c0
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

// -[WCLGColorPickerViewController layoutPickerViews] IMP=0x257D18 bounds=0x257D18-0x258BEC
loc_257D18:
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
    sub      sp, sp, #0x160
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0xa0]
    mov      w23, #0x333
    movk     w23, #0xe43a, lsl #16
    mov      w24, #0x9875
    movk     w24, #0x4f6b, lsl #16
    mov      w22, #0xcff4
    movk     w22, #0x4e1f, lsl #16
    mov      w26, #0x3fdc
    movk     w26, #0x3230, lsl #16
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x3d8]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x190]
    bl       #0x461c6c // _objc_msgSend
    stp      d0, d1, [sp, #0xf0]
    stp      d2, d3, [sp, #0x100]
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    str      x1, [sp, #0xe8]
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xf30]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    str      x1, [sp, #0xe0]
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x3f0]
    str      x1, [sp, #0xd8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0xe0]
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461708 // _CGRectGetWidth
    mov      x8, #0x4074000000000000
    fmov     d1, x8
    fmaxnm   d0, d0, d1
    str      d0, [sp, #0xd0]
    mov      x8, #-0x3fbc000000000000
    fmov     d1, x8
    fadd     d0, d0, d1
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x518]
    fmaxnm   d0, d0, d1
    str      d0, [sp, #0xc8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xaf0]
    str      x1, [sp, #0xc0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      d2, [sp, #0xd0]
    stp      xzr, xzr, [x29, #-0xc0]
    stur     d2, [x29, #-0xb0]
    ldr      x1, [sp, #0xe0]
    fmov     d0, xzr
    fmov     d1, xzr
    fmov     d3, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    mov      w10, #0x30ff
    movk     w10, #0x847d, lsl #16
    ldr      x8, [x8, #0x898]
    add      x9, sp, #0x4c
    mov      w28, #0x3fdb
    movk     w28, #0x3230, lsl #16
    str      x8, [sp, #0xb8]
    mov      w27, #0x332
    movk     w27, #0xe43a, lsl #16
    str      w10, [sp, #0x4c]
    str      x9, [sp, #0x40]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0xba0]
    str      d0, [sp, #0x38]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x500]
    str      d0, [sp, #0x30]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3f0]
    str      d0, [sp, #0x28]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0xba8]
    str      d0, [sp, #0x20]
    adrp     x8, #0x491000
    adrp     x9, #0x491000
    ldr      d9, [x8, #0xbb0]
    ldr      d8, [x9, #0x710]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x420]
    str      d0, [sp, #0x18]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0xbb8]
    str      d0, [sp, #0x10]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x430]
    str      d0, [sp, #8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0xbc0]
    str      d0, [sp]
    adrp     x8, #0x491000
    ldr      d10, [x8, #0xbc8]
    adrp     x8, #0x491000
    ldr      d11, [x8, #0xbd0]
    mov      w25, #0x9874
    movk     w25, #0x4f6b, lsl #16
    ldr      w8, [sp, #0x4c]
    cmp      w8, w28
    b.le     #0x258158
    cmp      w8, w25
    b.gt     #0x2581b8
    cmp      w8, w26
    b.eq     #0x258674
    cmp      w8, w22
    b.ne     #0x257fb8
    ldr      x20, [sp, #0x50]
    ucvtf    d0, x20
    ldr      d1, [sp, #0xa8]
    mov      x8, #0x4049000000000000
    fmov     d2, x8
    fmadd    d13, d0, d2, d1
    fmov     d0, #8.00000000
    fadd     d12, d13, d0
    ldr      x1, [sp, #0x78]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x70]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [sp, #0xe0]
    mov      x8, #0x4044000000000000
    fmov     d2, x8
    mov      x8, #0x4041000000000000
    fmov     d3, x8
    fmov     d0, #22.00000000
    fmov     d1, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    fmov     d0, #9.00000000
    fadd     d12, d13, d0
    ldr      x1, [sp, #0x68]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x70]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      d2, [sp, #0x80]
    ldr      x1, [sp, #0xe0]
    mov      x8, #0x4053000000000000
    fmov     d0, x8
    mov      x8, #0x4040000000000000
    fmov     d3, x8
    fmov     d1, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    fmov     d0, #3.00000000
    fadd     d12, d13, d0
    ldr      x1, [sp, #0x60]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x70]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     d0, [x29, #-0xe0]
    ldr      x1, [sp, #0xe0]
    mov      x8, #0x404d000000000000
    fmov     d2, x8
    mov      x8, #0x4045000000000000
    fmov     d3, x8
    fmov     d1, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    mov      w22, #0xcff4
    movk     w22, #0x4e1f, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    add      x8, x20, #1
    cmp      x8, #4
    ldr      x9, [sp, #0x40]
    mov      w10, #0xd564
    movk     w10, #0xcacb, lsl #16
    csel     w10, w10, w22, eq
    str      w10, [x9]
    str      x8, [sp, #0x50]
    b        #0x257fb8
    cmp      w8, w27
    b.le     #0x2581e4
    cmp      w8, w23
    b.eq     #0x258224
    mov      w9, #0x6448
    movk     w9, #0x17fc, lsl #16
    cmp      w8, w9
    b.ne     #0x257fb8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xdf0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xdf4]
    and      w8, w8, w9
    mov      w9, #0xbfbe
    movk     w9, #0x3de7, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x87bc
    movk     w9, #0xe7e1, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x9960
    movk     w9, #0x3b0f, lsl #16
    cmp      w8, w9
    csel     w8, w26, w24, lo
    b        #0x258754
    cmp      w8, w24
    b.eq     #0x2586c0
    mov      w9, #0x47e4
    movk     w9, #0x5c9a, lsl #16
    cmp      w8, w9
    b.ne     #0x257fb8
    ldr      x8, [sp, #0x40]
    str      w23, [x8]
    mov      x8, #0x4053000000000000
    str      x8, [sp, #0x58]
    b        #0x257fb8
    mov      w9, #0x30ff
    movk     w9, #0x847d, lsl #16
    cmp      w8, w9
    b.ne     #0x258760
    ldr      x1, [sp, #0xb8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp, #0x40]
    mov      w9, #0x6448
    movk     w9, #0x17fc, lsl #16
    csel     w9, w9, w23, ne
    str      w9, [x8]
    mov      x8, #0x4032000000000000
    str      x8, [sp, #0x58]
    b        #0x257fb8
    ldr      d12, [sp, #0x58]
    ldr      d0, [sp, #0xc8]
    mov      x8, #-0x3fbe000000000000
    fmov     d1, x8
    fadd     d0, d0, d1
    str      d0, [sp, #0xb0]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa58]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      d2, [sp, #0xb0]
    ldr      x1, [sp, #0xe0]
    mov      x8, #0x4043000000000000
    fmov     d0, x8
    fmov     d3, #28.00000000
    fmov     d1, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x8, #0x4045000000000000
    fmov     d0, x8
    fadd     d14, d12, d0
    ldr      d0, [sp, #0xc8]
    ldp      d1, d4, [sp, #0x30]
    fadd     d0, d0, d4
    fmaxnm   d13, d0, d1
    ldp      d1, d0, [sp, #0x20]
    fmul     d0, d13, d0
    fmaxnm   d0, d0, d1
    fcmp     d0, d9
    fcsel    d12, d9, d0, gt
    fadd     d0, d12, d8
    fmov     d1, #24.00000000
    fadd     d0, d0, d1
    str      d0, [sp, #0xa8]
    mov      x8, #0x4069000000000000
    fmov     d1, x8
    fadd     d0, d0, d1
    str      d0, [sp, #0xa0]
    mov      x8, #0x404e000000000000
    fmov     d1, x8
    fadd     d15, d0, d1
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa90]
    str      x1, [sp, #0x98]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      d2, [sp, #0xc8]
    ldr      x1, [sp, #0xe0]
    fmov     d0, #20.00000000
    fmov     d1, d14
    fmov     d3, d15
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xab0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0xe0]
    fmov     d0, #20.00000000
    fmov     d1, #18.00000000
    fmov     d3, #28.00000000
    ldr      d2, [sp, #0x18]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x20, [x8, #0xac0]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0xe0]
    mov      x8, #0x4055000000000000
    fmov     d2, x8
    fmov     d0, #20.00000000
    fmov     d3, #18.00000000
    ldr      d1, [sp, #0x10]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x200]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x208]
    ldr      d0, [sp, #8]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xef0]
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      d0, [sp, #0xc8]
    ldr      d1, [sp]
    fadd     d0, d0, d1
    mov      x8, #0x405c000000000000
    fmov     d1, x8
    fmaxnm   d14, d0, d1
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xad0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0xe0]
    mov      x8, #0x405d000000000000
    fmov     d0, x8
    mov      x8, #0x4047000000000000
    fmov     d3, x8
    fmov     d1, #18.00000000
    fmov     d2, d14
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      d0, [sp, #0xc8]
    fadd     d14, d0, d10
    adrp     x8, #0x4c0000
    ldr      x20, [x8, #0xb08]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0xe0]
    mov      x8, #0x4049000000000000
    fmov     d2, x8
    fmov     d1, #16.00000000
    fmov     d0, d14
    fmov     d3, d2
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    str      x1, [sp, #0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    str      x1, [sp, #0x88]
    fmov     d0, #25.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xb18]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0xe0]
    fmov     d0, #20.00000000
    fmov     d1, d8
    fmov     d2, d13
    fmov     d3, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      d0, [sp, #0xc8]
    mov      x8, #-0x3fb9000000000000
    fmov     d1, x8
    fadd     d13, d0, d1
    adrp     x8, #0x4c0000
    ldr      x20, [x8, #0xb30]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0xe0]
    fmov     d2, #24.00000000
    fmov     d0, d13
    fmov     d1, d8
    fmov     d3, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x88]
    fmov     d0, #12.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      d0, [sp, #0xc8]
    mov      x8, #-0x3fad000000000000
    fmov     d1, x8
    fadd     d1, d0, d1
    mov      x8, #-0x3fb3000000000000
    fmov     d2, x8
    fadd     d1, d1, d2
    mov      x8, #-0x3fc0000000000000
    fmov     d3, x8
    fadd     d1, d1, d3
    fmaxnm   d1, d1, d11
    str      d1, [sp, #0x80]
    adrp     x8, #0x4c0000
    ldr      x9, [x8, #0xc88]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x608]
    stp      x8, x9, [sp, #0x70]
    adrp     x8, #0x4c0000
    ldr      x9, [x8, #0xca0]
    fadd     d0, d0, d2
    fmov     d1, #-20.00000000
    fadd     d0, d0, d1
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0xc90]
    stp      x8, x9, [sp, #0x60]
    stur     d0, [x29, #-0xe0]
    ldr      x8, [sp, #0x40]
    str      w22, [x8]
    str      xzr, [sp, #0x50]
    b        #0x257fb8
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      d2, [sp, #0xc8]
    ldr      x1, [sp, #0xe0]
    mov      x8, #0x4042000000000000
    fmov     d3, x8
    fmov     d0, #20.00000000
    fmov     d1, #18.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x40]
    str      w24, [x8]
    b        #0x257fb8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xdf8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xdfc]
    orr      w8, w8, w9
    mov      w9, #0x567e
    movk     w9, #0x2335, lsl #16
    add      w8, w8, w9
    mov      w9, #0x2fbf
    movk     w9, #0xc134, lsl #16
    and      w8, w8, w9
    mov      w9, #0x6a7
    movk     w9, #0xdbb2, lsl #16
    umull    x8, w8, w9
    lsr      x21, x8, #0x3c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      d2, [sp, #0xc8]
    ldr      x1, [sp, #0xe0]
    mov      x8, #0x4042000000000000
    fmov     d3, x8
    fmov     d0, #20.00000000
    fmov     d1, #18.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      w8, #0x4ad3
    movk     w8, #0x3d8d, lsl #16
    cmp      w21, w8
    mov      w8, #0x47e4
    movk     w8, #0x5c9a, lsl #16
    csel     w8, w8, w26, ne
    ldr      x9, [sp, #0x40]
    str      w8, [x9]
    b        #0x257fb8
    mov      w9, #0xd564
    movk     w9, #0xcacb, lsl #16
    cmp      w8, w9
    b.ne     #0x257fb8
    ldr      d13, [sp, #0x100]
    ldr      d0, [sp, #0xa0]
    fmov     d1, #12.00000000
    fadd     d9, d0, d1
    fmov     d0, #4.00000000
    fadd     d8, d9, d0
    adrp     x8, #0x4c0000
    ldr      x20, [x8, #0xba8]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0xe0]
    fmov     d0, #22.00000000
    fmov     d2, #30.00000000
    fmov     d3, #30.00000000
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x88]
    fmov     d0, #15.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbb8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0xe0]
    mov      x8, #0x4051000000000000
    fmov     d0, x8
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x8d0]
    mov      x8, #0x4043000000000000
    fmov     d8, x8
    fmov     d1, d9
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      d0, [sp, #0xc8]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0xb90]
    fadd     d10, d0, d1
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbc8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0xe0]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x8e8]
    fmov     d0, d10
    fmov     d1, d9
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x1, [sp, #0x98]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x770]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616cc // _CGRectGetMaxY
    mov      x8, #0x4041000000000000
    fmov     d15, x8
    fadd     d9, d0, d15
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa60]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      d2, [sp, #0xb0]
    ldr      x1, [sp, #0xe0]
    fmov     d3, #28.00000000
    fmov     d0, d8
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x8, #0x4045000000000000
    fmov     d14, x8
    fadd     d9, d9, d14
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xa98]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      d2, [sp, #0xc8]
    ldr      x1, [sp, #0xe0]
    adrp     x8, #0x491000
    ldr      d3, [x8, #0x550]
    fmov     d0, #20.00000000
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [sp, #0xe8]
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    fmov     d10, d1
    fmov     d11, d2
    fmov     d12, d3
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbd8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [sp, #0xe0]
    fmov     d0, d9
    fmov     d1, d10
    fmov     d2, d11
    fmov     d3, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xca8]
    ldr      d0, [sp, #0xc8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616cc // _CGRectGetMaxY
    fadd     d9, d0, d15
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa68]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      d2, [sp, #0xb0]
    ldr      x1, [sp, #0xe0]
    fmov     d3, #28.00000000
    fmov     d0, d8
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    fadd     d8, d9, d14
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xaa0]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      d2, [sp, #0xc8]
    ldr      x1, [sp, #0xe0]
    adrp     x8, #0x491000
    ldr      d3, [x8, #0xb98]
    fmov     d0, #20.00000000
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xcb0]
    ldr      d0, [sp, #0xc8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616cc // _CGRectGetMaxY
    fmov     d1, #28.00000000
    fadd     d8, d0, d1
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [sp, #0xc0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldp      d0, d1, [x29, #-0xc0]
    ldur     d2, [x29, #-0xb0]
    ldr      x1, [sp, #0xe0]
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    fadd     d8, d13, d8
    ldr      x1, [sp, #0xd8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x730]
    ldr      d0, [sp, #0xd0]
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x1, [sp, #0xd8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xcb8]
    fmov     d0, xzr
    fmov     d1, xzr
    fmov     d2, #18.00000000
    fmov     d3, xzr
    bl       #0x461c6c // _objc_msgSend
    ldur     x8, [x29, #-0xa0]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x258be8
    mov      x0, x19
    add      sp, sp, #0x160
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
    b        #0x461c9c // _objc_release
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGColorPickerViewController layoutPaletteButtonsWithWidth:] IMP=0x258BEC bounds=0x258BEC-0x2590F4
loc_258BEC:
    sub      sp, sp, #0x110
    stp      d11, d10, [sp, #0x90]
    stp      d9, d8, [sp, #0xa0]
    stp      x28, x27, [sp, #0xb0]
    stp      x26, x25, [sp, #0xc0]
    stp      x24, x23, [sp, #0xd0]
    stp      x22, x21, [sp, #0xe0]
    stp      x20, x19, [sp, #0xf0]
    stp      x29, x30, [sp, #0x100]
    add      x29, sp, #0x100
    fmov     d8, d0
    mov      x19, x0
    mov      w27, #0xa44b
    movk     w27, #0xb339, lsl #16
    mov      w24, #0xb12a
    movk     w24, #0x6f38, lsl #16
    mov      w25, #0x929e
    movk     w25, #0x2d3b, lsl #16
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xcc0]
    str      x1, [sp, #0x80]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    stp      x1, x0, [sp, #0x70]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    cset     w8, gt
    strb     w8, [sp, #0x6f]
    mov      w8, #0x290
    movk     w8, #0x2dc4, lsl #16
    str      w8, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w28, #0x929d
    movk     w28, #0x2d3b, lsl #16
    mov      w26, #0x2271
    movk     w26, #0xddf4, lsl #16
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x5b8]
    fmov     d10, #22.00000000
    ldr      w8, [sp, #0x14]
    cmp      w8, w28
    b.gt     #0x258cec
    cmp      w8, w26
    b.le     #0x258d3c
    mov      w9, #0x2272
    movk     w9, #0xddf4, lsl #16
    cmp      w8, w9
    b.eq     #0x258e6c
    mov      w9, #0xdd77
    movk     w9, #0xf3dd, lsl #16
    cmp      w8, w9
    b.ne     #0x258c98
    ldrb     w8, [sp, #0x37]
    cmp      w8, #0
    csel     w8, w25, w27, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    ldp      x9, x8, [sp, #0x38]
    stp      x9, x8, [sp, #0x20]
    b        #0x258c98
    cmp      w8, w25
    b.eq     #0x258eb0
    cmp      w8, w24
    b.eq     #0x258f20
    mov      w9, #0x290
    movk     w9, #0x2dc4, lsl #16
    cmp      w8, w9
    b.ne     #0x258c98
    ldr      x0, [sp, #0x78]
    bl       #0x461c9c // _objc_release
    ldrb     w8, [sp, #0x6f]
    cmp      w8, #0
    mov      w8, #0x2272
    movk     w8, #0xddf4, lsl #16
    csel     w8, w8, w27, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    ldr      x8, [sp, #0x70]
    str      x8, [sp, #0x28]
    b        #0x258c98
    mov      w9, #0x92f6
    movk     w9, #0x9d4f, lsl #16
    cmp      w8, w9
    b.ne     #0x259004
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xe08]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xe0c]
    and      w27, w8, w9
    ldr      x8, [sp, #0x18]
    lsr      x23, x8, #2
    and      x22, x8, #3
    ldr      x1, [sp, #0x80]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0x60]
    ldr      x2, [sp, #0x18]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ucvtf    d0, x23
    fmadd    d0, d0, d9, d10
    ucvtf    d1, x22
    mov      x8, #0x404e000000000000
    fmov     d2, x8
    fmadd    d1, d1, d2, d10
    ldr      x1, [sp, #0x58]
    mov      x8, #0x4045000000000000
    fmov     d2, x8
    mov      x0, x21
    fmov     d3, d2
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [sp, #0x50]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0x48]
    fmov     d0, #21.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x18]
    add      x8, x8, #1
    str      x8, [sp, #0x38]
    ldr      x1, [sp, #0x80]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0x40]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x38]
    cmp      x8, x0
    cset     w8, lt
    strb     w8, [sp, #0x37]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      w8, #0x122e
    movk     w8, #0xfc69, lsl #16
    cmp      w27, w8
    mov      w27, #0xa44b
    movk     w27, #0xb339, lsl #16
    mov      w8, #0xdd77
    movk     w8, #0xf3dd, lsl #16
    b        #0x258f10
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x608]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x678]
    stp      x8, x9, [sp, #0x58]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0xac8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xb48]
    stp      x8, x9, [sp, #0x48]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x600]
    str      x8, [sp, #0x40]
    ldr      x8, [sp, #8]
    str      w25, [x8]
    str      xzr, [sp, #0x20]
    b        #0x258c98
    ldr      x8, [sp, #0x20]
    str      x8, [sp, #0x18]
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xe00]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xe04]
    sub      w8, w8, w9
    mov      w9, #0x3c4
    movk     w9, #0xc370, lsl #16
    add      w8, w8, w9
    mov      w9, #0xf77d
    movk     w9, #0x6aa2, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x381b
    movk     w9, #0xba9, lsl #16
    umull    x9, w8, w9
    lsr      x9, x9, #0x20
    sub      w8, w8, w9
    add      w8, w9, w8, lsr #1
    mov      w9, #0x7c1e
    movk     w9, #0x7479, lsl #16
    cmp      w9, w8, lsr #22
    mov      w8, #0x92f6
    movk     w8, #0x9d4f, lsl #16
    csel     w8, w24, w8, eq
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x258c98
    ldr      x8, [sp, #0x18]
    lsr      x22, x8, #2
    and      x23, x8, #3
    ldr      x1, [sp, #0x80]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0x60]
    ldr      x2, [sp, #0x18]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ucvtf    d0, x22
    fmadd    d0, d0, d9, d10
    ucvtf    d1, x23
    mov      x8, #0x404e000000000000
    fmov     d2, x8
    fmadd    d1, d1, d2, d10
    ldr      x1, [sp, #0x58]
    mov      x8, #0x4045000000000000
    fmov     d2, x8
    mov      x0, x21
    fmov     d3, d2
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [sp, #0x50]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0x48]
    fmov     d0, #21.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x1, [sp, #0x80]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0x40]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0x92f6
    movk     w9, #0x9d4f, lsl #16
    str      w9, [x8]
    b        #0x258c98
    cmp      w8, w27
    b.ne     #0x258c98
    ldr      x20, [sp, #0x28]
    ldr      x1, [sp, #0x80]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    adds     x8, x0, #3
    add      x9, x0, #6
    csel     x8, x9, x8, lt
    asr      x20, x8, #2
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    scvtf    d0, x20
    mov      x8, #0x4045000000000000
    fmov     d1, x8
    fmul     d0, d0, d1
    mov      x8, #0x4046000000000000
    fmov     d1, x8
    fadd     d0, d0, d1
    cmp      x20, #1
    csinc    x8, x20, xzr, gt
    sub      x8, x8, #1
    ucvtf    d1, x8
    mov      x8, #0x4042000000000000
    fmov     d2, x8
    fmadd    d0, d1, d2, d0
    mov      x8, #0x4052000000000000
    fmov     d1, x8
    fadd     d1, d8, d1
    fcmp     d1, d0
    fcsel    d8, d0, d1, mi
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbd8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x730]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x550]
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x100]
    ldp      x20, x19, [sp, #0xf0]
    ldp      x22, x21, [sp, #0xe0]
    ldp      x24, x23, [sp, #0xd0]
    ldp      x26, x25, [sp, #0xc0]
    ldp      x28, x27, [sp, #0xb0]
    ldp      d9, d8, [sp, #0xa0]
    ldp      d11, d10, [sp, #0x90]
    add      sp, sp, #0x110
    b        #0x461c9c // _objc_release

// -[WCLGColorPickerViewController layoutCommonRowsWithWidth:] IMP=0x2590F4 bounds=0x2590F4-0x2593B4
loc_2590F4:
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
    fmov     d8, d0
    mov      x19, x0
    mov      w24, #0xf5a5
    movk     w24, #0x95e3, lsl #16
    mov      w25, #0x3c9e
    movk     w25, #0x4417, lsl #16
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xcc8]
    str      x1, [sp, #0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    cset     w8, gt
    strb     w8, [sp, #0x5f]
    mov      w27, #0x12a6
    movk     w27, #0x43d3, lsl #16
    str      w27, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w28, #0x12a5
    movk     w28, #0x43d3, lsl #16
    mov      w26, #0x6a9a
    movk     w26, #0xa33f, lsl #16
    adrp     x8, #0x491000
    ldr      d0, [x8, #0xbd8]
    fadd     d10, d8, d0
    fmov     d11, #3.00000000
    ldr      w8, [sp, #0xc]
    cmp      w8, w28
    b.le     #0x2591d8
    cmp      w8, w25
    b.eq     #0x259238
    cmp      w8, w27
    b.ne     #0x25919c
    ldr      x0, [sp, #0x60]
    bl       #0x461c9c // _objc_release
    ldrb     w8, [sp, #0x5f]
    cmp      w8, #0
    csel     w8, w26, w24, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x25919c
    cmp      w8, w26
    b.ne     #0x259384
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x608]
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0xc98]
    stp      x8, x9, [sp, #0x48]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x678]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xac8]
    stp      x8, x9, [sp, #0x38]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xb48]
    str      x8, [sp, #0x30]
    str      d10, [sp, #0x28]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x600]
    ldr      x8, [sp]
    str      w25, [x8]
    mov      x8, #0x4036000000000000
    stp      x8, x9, [sp, #0x18]
    str      xzr, [sp, #0x10]
    b        #0x25919c
    ldr      x20, [sp, #0x10]
    ldr      d8, [sp, #0x18]
    ldr      x1, [sp, #0x68]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [sp, #0x50]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x1, [sp, #0x48]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [sp, #0x50]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    fadd     d1, d8, d11
    ldr      x1, [sp, #0x40]
    mov      x8, #0x4041000000000000
    fmov     d2, x8
    fmov     d0, #22.00000000
    mov      x0, x21
    fmov     d3, d2
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [sp, #0x38]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [sp, #0x30]
    fmov     d0, #17.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      d2, [sp, #0x28]
    ldr      x1, [sp, #0x40]
    mov      x8, #0x4053000000000000
    fmov     d0, x8
    mov      x8, #0x4046000000000000
    fmov     d9, x8
    mov      x0, x23
    fmov     d1, d8
    fmov     d3, d9
    bl       #0x461c6c // _objc_msgSend
    fadd     d8, d8, d9
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    add      x22, x20, #1
    ldr      x1, [sp, #0x68]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    cmp      x22, x21
    ldr      x8, [sp]
    csel     w9, w25, w24, lt
    str      w9, [x8]
    str      d8, [sp, #0x18]
    str      x22, [sp, #0x10]
    b        #0x25919c
    cmp      w8, w24
    b.ne     #0x25919c
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

// -[WCLGColorPickerViewController updateUI] IMP=0x2593B4 bounds=0x2593B4-0x25A334
loc_2593B4:
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
    sub      sp, sp, #0x180
    mov      x19, sp
    mov      x20, x0
    mov      w26, #0x8d3a
    movk     w26, #0xe011, lsl #16
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    mov      w27, #0x2432
    movk     w27, #0x8151, lsl #16
    stur     x8, [x29, #-0xa0]
    mov      w25, #0xea4f
    movk     w25, #0x6399, lsl #16
    mov      w24, #0x6b0c
    movk     w24, #0x4329, lsl #16
    adrp     x8, #0x57f000
    add      x8, x8, #0xa1c
    ldar     w8, [x8]
    stur     w8, [x29, #-0xa4]
    mov      w8, #0xa463
    movk     w8, #0x239c, lsl #16
    str      w8, [x19, #0x14]
    add      x8, x19, #0x14
    str      x8, [x19, #8]
    mov      w28, #0xa462
    movk     w28, #0x239c, lsl #16
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x4e0]
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x428]
    fmov     d13, #1.00000000
    adrp     x8, #0x491000
    ldr      d14, [x8, #0x4d0]
    fmov     d15, xzr
    mov      w21, #0xea4e
    movk     w21, #0x6399, lsl #16
    ldr      w8, [x19, #0x14]
    cmp      w8, w28
    b.gt     #0x2594dc
    mov      w9, #0x8d39
    movk     w9, #0xe011, lsl #16
    cmp      w8, w9
    b.gt     #0x259590
    mov      w9, #0x46b3
    movk     w9, #0xc637, lsl #16
    cmp      w8, w9
    b.le     #0x259adc
    mov      w9, #0x46b4
    movk     w9, #0xc637, lsl #16
    cmp      w8, w9
    b.eq     #0x25a020
    mov      w9, #0x1ca9
    movk     w9, #0xce42, lsl #16
    cmp      w8, w9
    b.eq     #0x259fc4
    mov      w9, #0x1ffc
    movk     w9, #0xd009, lsl #16
    cmp      w8, w9
    b.ne     #0x259470
    ldr      x8, [x19, #8]
    str      w26, [x8]
    str      xzr, [x19, #0x28]
    b        #0x259470
    cmp      w8, w21
    b.le     #0x2595d0
    mov      w9, #0xca99
    movk     w9, #0x6a16, lsl #16
    cmp      w8, w9
    b.le     #0x25986c
    mov      w9, #0xca9a
    movk     w9, #0x6a16, lsl #16
    cmp      w8, w9
    b.eq     #0x259e3c
    mov      w9, #0x2e45
    movk     w9, #0x7c08, lsl #16
    cmp      w8, w9
    b.eq     #0x259c64
    mov      w9, #0x92ae
    movk     w9, #0x7f5f, lsl #16
    cmp      w8, w9
    b.ne     #0x259470
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xcc0]
    str      x1, [x19, #0xe0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x600]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cmp      x24, #0
    mov      w24, #0x6b0c
    movk     w24, #0x4329, lsl #16
    ldr      x8, [x19, #8]
    mov      w9, #0x5c4e
    movk     w9, #0x6064, lsl #16
    mov      w10, #0x778b
    movk     w10, #0xef18, lsl #16
    csel     w9, w10, w9, gt
    str      w9, [x8]
    str      x23, [x19, #0x30]
    b        #0x259470
    mov      w9, #0x7121
    movk     w9, #0x2f3, lsl #16
    cmp      w8, w9
    b.le     #0x259858
    mov      w9, #0x7122
    movk     w9, #0x2f3, lsl #16
    cmp      w8, w9
    b.eq     #0x259f64
    mov      w9, #0x3e24
    movk     w9, #0x2235, lsl #16
    cmp      w8, w9
    b.ne     #0x25a2a8
    ldr      x8, [x19, #8]
    str      w27, [x8]
    str      xzr, [x19, #0x20]
    b        #0x259470
    mov      w9, #0x6b0b
    movk     w9, #0x4329, lsl #16
    cmp      w8, w9
    b.gt     #0x2597e8
    mov      w9, #0xa463
    movk     w9, #0x239c, lsl #16
    cmp      w8, w9
    b.eq     #0x259b08
    mov      w9, #0x959
    movk     w9, #0x40ef, lsl #16
    cmp      w8, w9
    b.ne     #0x259470
    adrp     x21, #0x4c4000
    ldr      x22, [x21, #0xa8]
    ldur     x1, [x29, #-0xc0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    fmaxnm   d0, d0, d15
    fcmp     d0, d13
    fcsel    d0, d13, d0, gt
    fmul     d0, d0, d14
    frintx   d0, d0
    fcvtzs   x2, d0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x4f0]
    mov      x0, x22
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x25, [x29, #-0xb0]
    str      x0, [x25]
    ldr      x24, [x21, #0xa8]
    ldur     x1, [x29, #-0xc8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    fmaxnm   d0, d0, d15
    fcmp     d0, d13
    fcsel    d0, d13, d0, gt
    fmul     d0, d0, d14
    frintx   d0, d0
    fcvtzs   x2, d0
    mov      x0, x24
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    str      x0, [x25, #8]
    ldur     x26, [x29, #-0xb0]
    ldr      x25, [x21, #0xa8]
    ldur     x1, [x29, #-0xd0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    fmaxnm   d0, d0, d15
    fcmp     d0, d13
    fcsel    d0, d13, d0, gt
    fmul     d0, d0, d14
    frintx   d0, d0
    fcvtzs   x2, d0
    mov      x0, x25
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    str      x0, [x26, #0x10]
    ldur     x27, [x29, #-0xb0]
    ldr      x26, [x21, #0xa8]
    mov      w21, #0xea4e
    movk     w21, #0x6399, lsl #16
    ldur     x1, [x29, #-0xd8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    fmaxnm   d0, d0, d15
    fcmp     d0, d13
    fcsel    d0, d13, d0, gt
    fmul     d0, d0, d14
    frintx   d0, d0
    fcvtzs   x2, d0
    mov      x0, x26
    mov      w26, #0x8d3a
    movk     w26, #0xe011, lsl #16
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    str      x0, [x27, #0x18]
    mov      w27, #0x2432
    movk     w27, #0x8151, lsl #16
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    ldur     x2, [x29, #-0xb0]
    mov      w3, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xf8]
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      w25, #0xea4f
    movk     w25, #0x6399, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      w24, #0x6b0c
    movk     w24, #0x4329, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x608]
    stur     x8, [x29, #-0x100]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0xfa0]
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0xca0]
    stp      x8, x9, [x19, #0x100]
    adrp     x8, #0x4c0000
    ldr      x9, [x8, #0xce0]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x620]
    stp      x8, x9, [x19, #0xf0]
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0xc90]
    str      x8, [x19, #0xe8]
    ldr      x8, [x19, #8]
    str      w24, [x8]
    str      xzr, [x19, #0x38]
    b        #0x259470
    cmp      w8, w24
    b.eq     #0x259b28
    mov      w9, #0x5c4e
    movk     w9, #0x6064, lsl #16
    cmp      w8, w9
    b.ne     #0x259470
    ldr      x8, [x19, #0x30]
    str      x8, [x19, #0x18]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xcc8]
    str      x1, [x19, #0x88]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [x19, #0x18]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cmp      x23, #0
    mov      w8, #0xaece
    movk     w8, #0x582, lsl #16
    mov      w9, #0x46b4
    movk     w9, #0xc637, lsl #16
    csel     w8, w9, w8, gt
    b        #0x25a064
    cmp      w8, w26
    b.eq     #0x259c70
    mov      w9, #0x778b
    movk     w9, #0xef18, lsl #16
    b        #0x259aec
    cmp      w8, w25
    b.eq     #0x259eb4
    mov      w9, #0xf139
    movk     w9, #0x6672, lsl #16
    cmp      w8, w9
    b.ne     #0x259470
    adrp     x8, #0x57f000
    add      x8, x8, #0xa1c
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x20
    mov      sp, x8
    stur     x8, [x29, #-0xb0]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xcd0]
    stur     x1, [x29, #-0xb8]
    mov      x0, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x22, [x8, #0x90]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x948]
    stur     x1, [x29, #-0xc0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x950]
    stur     x1, [x29, #-0xc8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d11, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x958]
    stur     x1, [x29, #-0xd0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d12, d0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9c0]
    stur     x1, [x29, #-0xd8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d3, d0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8f8]
    mov      x0, x22
    fmov     d0, d10
    fmov     d1, d11
    fmov     d2, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xe0]
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0xcd8]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xad0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    stur     x1, [x29, #-0xe8]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    mov      w24, #0x6b0c
    movk     w24, #0x4329, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xb08]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    stur     x1, [x29, #-0xf0]
    ldur     x2, [x29, #-0xe0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xba8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldur     x2, [x29, #-0xe0]
    ldur     x1, [x29, #-0xf0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbc8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldur     x1, [x29, #-0xe8]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x940]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xb18]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x968]
    fmov     d0, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x898]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #0x959
    movk     w8, #0x40ef, lsl #16
    mov      w9, #0x1ca9
    movk     w9, #0xce42, lsl #16
    csel     w8, w9, w8, ne
    b        #0x25a064
    cmp      w8, w27
    b.eq     #0x25a070
    mov      w9, #0x3b4b
    movk     w9, #0xa914, lsl #16
    cmp      w8, w9
    b.ne     #0x259470
    ldr      x8, [x19, #8]
    mov      w9, #0xca9a
    movk     w9, #0x6a16, lsl #16
    str      w9, [x8]
    b        #0x259470
    ldur     w8, [x29, #-0xa4]
    cmp      w8, #0
    mov      w8, #0xf139
    movk     w8, #0x6672, lsl #16
    mov      w9, #0x7122
    movk     w9, #0x2f3, lsl #16
    csel     w8, w9, w8, eq
    b        #0x25a064
    ldr      x22, [x19, #0x38]
    ldp      x1, x0, [x29, #-0x100]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x108]
    bl       #0x461c6c // _objc_msgSend
    fmov     s10, s0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x100]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldur     x1, [x29, #-0x100]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x1, [x19, #0xf8]
    fmov     s0, s10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    fcvt     d0, s10
    frintx   d0, d0
    fcvtzs   x8, d0
    ldr      x1, [x19, #0xf0]
    str      x8, [sp, #-0x10]!
    adrp     x2, #0x522000
    add      x2, x2, #0xa60
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    add      sp, sp, #0x10
    mov      x23, x0
    ldr      x1, [x19, #0xe8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldur     x1, [x29, #-0x100]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldur     x1, [x29, #-0xe8]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    mov      w25, #0xea4f
    movk     w25, #0x6399, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      w24, #0x6b0c
    movk     w24, #0x4329, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    add      x8, x22, #1
    cmp      x8, #4
    ldr      x9, [x19, #8]
    mov      w10, #0x92ae
    movk     w10, #0x7f5f, lsl #16
    csel     w10, w10, w24, eq
    str      w10, [x9]
    str      x8, [x19, #0x38]
    b        #0x259470
    ldr      x8, [x19, #8]
    str      w25, [x8]
    b        #0x259470
    ldr      x22, [x19, #0x28]
    ldr      x1, [x19, #0xd8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0xd0]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x1, [x19, #0xc8]
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0xc0]
    mov      x0, x20
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0xe0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x1, [x19, #0xd0]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldur     x1, [x29, #-0xf0]
    mov      x0, x24
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x19, #0xb8]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x1, [x19, #0xb0]
    fmov     d0, #1.50000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    ldr      x1, [x19, #0xa8]
    fmov     d0, #1.00000000
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    ldr      x1, [x19, #0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    ldr      x1, [x19, #0xb8]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    ldr      x1, [x19, #0x98]
    mov      x2, x26
    mov      w26, #0x8d3a
    movk     w26, #0xe011, lsl #16
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    mov      w27, #0x2432
    movk     w27, #0x8151, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      w25, #0xea4f
    movk     w25, #0x6399, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    add      x24, x22, #1
    ldr      x1, [x19, #0xe0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [x19, #0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cmp      x24, x23
    mov      w8, #0x5c4e
    movk     w8, #0x6064, lsl #16
    csel     w8, w26, w8, lt
    ldr      x9, [x19, #8]
    str      w8, [x9]
    ldr      x8, [x19, #0x90]
    stp      x24, x8, [x19, #0x28]
    mov      w24, #0x6b0c
    movk     w24, #0x4329, lsl #16
    b        #0x259470
    adrp     x8, #0x4c0000
    ldr      x9, [x8, #0xc00]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x608]
    stp      x8, x9, [x19, #0xd0]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x4e8]
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0xce8]
    stp      x8, x9, [x19, #0xc0]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0xac8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xb10]
    stp      x8, x9, [x19, #0xb0]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0xbf0]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xac0]
    stp      x8, x9, [x19, #0xa0]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0xb18]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x600]
    stp      x8, x9, [x19, #0x90]
    ldr      x8, [x19, #8]
    mov      w9, #0x1ffc
    movk     w9, #0xd009, lsl #16
    str      w9, [x8]
    b        #0x259470
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xe28]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xe2c]
    eor      w8, w8, w9
    mov      w9, #0x21f5
    movk     w9, #0x2ab9, lsl #16
    mov      w10, #0xbd27
    movk     w10, #0xfa6a, lsl #16
    madd     w8, w8, w9, w10
    adrp     x9, #0x4c0000
    ldr      x10, [x9, #0xc28]
    mov      w9, #0x1785
    movk     w9, #0x1dfe, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3c
    adrp     x9, #0x4be000
    ldr      x9, [x9, #0x608]
    stp      x9, x10, [x19, #0x78]
    adrp     x9, #0x4be000
    ldr      x10, [x9, #0x4e8]
    adrp     x9, #0x4c0000
    ldr      x9, [x9, #0xce8]
    stp      x9, x10, [x19, #0x68]
    adrp     x9, #0x4be000
    ldr      x10, [x9, #0xac8]
    adrp     x9, #0x4be000
    ldr      x9, [x9, #0xb10]
    stp      x9, x10, [x19, #0x58]
    adrp     x9, #0x4be000
    ldr      x10, [x9, #0xbf0]
    adrp     x9, #0x4be000
    ldr      x9, [x9, #0xac0]
    stp      x9, x10, [x19, #0x48]
    adrp     x9, #0x4be000
    ldr      x9, [x9, #0xb18]
    str      x9, [x19, #0x40]
    mov      w9, #0x48b
    movk     w9, #0xf795, lsl #16
    cmp      w8, w9
    mov      w8, #0x3e24
    movk     w8, #0x2235, lsl #16
    csel     w8, w25, w8, eq
    b        #0x25a064
    adrp     x9, #0x522000
    add      x9, x9, #0xa30
    ldrb     w8, [x9]
    mov      w10, #0x19
    eor      w8, w8, w10
    adrp     x10, #0x522000
    add      x10, x10, #0xa34
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    eor      w8, w8, #0xc0
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w11, #0x51
    eor      w8, w8, w11
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    mov      w9, #0x6a
    eor      w8, w8, w9
    strb     w8, [x10, #3]
    ldr      x8, [x19, #8]
    mov      w9, #0xf139
    movk     w9, #0x6672, lsl #16
    str      w9, [x8]
    b        #0x259470
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8b8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      w22, w0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa20]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa28]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #8]
    mov      w9, #0x959
    movk     w9, #0x40ef, lsl #16
    str      w9, [x8]
    b        #0x259470
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xe20]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xe24]
    add      w8, w8, w9
    mov      w9, #0x585c
    movk     w9, #0xde36, lsl #16
    add      w8, w8, w9
    mov      w9, #0x3e55
    movk     w9, #0x388a, lsl #16
    and      w8, w8, w9
    mov      w9, #0x9e60
    movk     w9, #0x5aeb, lsl #16
    cmp      w8, w9
    mov      w8, #0x2e45
    movk     w8, #0x7c08, lsl #16
    csel     w8, w25, w8, ne
    ldr      x9, [x19, #8]
    str      w8, [x9]
    b        #0x259470
    ldr      x22, [x19, #0x20]
    ldr      x1, [x19, #0x80]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x78]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x1, [x19, #0x70]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    ldr      x1, [x19, #0x68]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x1, [x19, #0x88]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    ldr      x1, [x19, #0x78]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    ldur     x1, [x29, #-0xf0]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x1, [x19, #0x88]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [x19, #0x78]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x1, [x19, #0x60]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x1, [x19, #0x58]
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    ldr      x1, [x19, #0x50]
    fmov     d0, #1.00000000
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    ldr      x1, [x19, #0x48]
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    ldr      x1, [x19, #0x88]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x1, [x19, #0x78]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    ldr      x1, [x19, #0x60]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    ldr      x1, [x19, #0x40]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    mov      w27, #0x2432
    movk     w27, #0x8151, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      w26, #0x8d3a
    movk     w26, #0xe011, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      w25, #0xea4f
    movk     w25, #0x6399, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    add      x24, x22, #1
    ldr      x1, [x19, #0x88]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [x19, #0x18]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cmp      x24, x23
    ldr      x8, [x19, #8]
    mov      w9, #0xaece
    movk     w9, #0x582, lsl #16
    csel     w9, w27, w9, lt
    str      w9, [x8]
    str      x24, [x19, #0x20]
    mov      w24, #0x6b0c
    movk     w24, #0x4329, lsl #16
    b        #0x259470
    mov      w9, #0xaece
    movk     w9, #0x582, lsl #16
    cmp      w8, w9
    b.ne     #0x259470
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc78]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldur     x1, [x29, #-0xb8]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldur     x0, [x29, #-0xf8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xe0]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0xa0]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x25a330
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

// -[WCLGColorPickerViewController updateKnobFrames] IMP=0x25A334 bounds=0x25A334-0x25AB88
loc_25A334:
    sub      sp, sp, #0x110
    stp      d15, d14, [sp, #0x70]
    stp      d13, d12, [sp, #0x80]
    stp      d11, d10, [sp, #0x90]
    stp      d9, d8, [sp, #0xa0]
    stp      x28, x27, [sp, #0xb0]
    stp      x26, x25, [sp, #0xc0]
    stp      x24, x23, [sp, #0xd0]
    stp      x22, x21, [sp, #0xe0]
    stp      x20, x19, [sp, #0xf0]
    stp      x29, x30, [sp, #0x100]
    add      x29, sp, #0x100
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    str      x8, [sp, #0x60]
    mov      w25, #0x706
    movk     w25, #0xa217, lsl #16
    mov      w26, #0x47c3
    movk     w26, #0x60ec, lsl #16
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xb18]
    str      x1, [sp, #0x38]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x770]
    stp      x1, x0, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    stp      d0, d1, [sp, #0x40]
    mov      w9, #0xacbe
    movk     w9, #0x4dec, lsl #16
    add      x8, sp, #0xc
    mov      w27, #0x580d
    movk     w27, #0x4725, lsl #16
    stp      d2, d3, [sp, #0x50]
    str      w9, [sp, #0xc]
    str      x8, [sp]
    fmov     d15, #-13.00000000
    mov      w28, #0x47c2
    movk     w28, #0x60ec, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w27
    b.le     #0x25a444
    cmp      w8, w28
    b.gt     #0x25a71c
    mov      w9, #0x580e
    movk     w9, #0x4725, lsl #16
    cmp      w8, w9
    b.eq     #0x25a804
    mov      w9, #0xacbe
    movk     w9, #0x4dec, lsl #16
    cmp      w8, w9
    b.ne     #0x25a3e0
    ldp      d2, d3, [sp, #0x50]
    ldp      d0, d1, [sp, #0x40]
    bl       #0x461744 // _CGRectIsEmpty
    cmp      w0, #0
    mov      w8, #0xcaef
    movk     w8, #0x3322, lsl #16
    csel     w8, w25, w8, ne
    ldr      x9, [sp]
    str      w8, [x9]
    ldr      x8, [sp, #0x30]
    str      x8, [sp, #0x10]
    b        #0x25a3e0
    mov      w9, #0xcaee
    movk     w9, #0x3322, lsl #16
    cmp      w8, w9
    b.gt     #0x25a77c
    cmp      w8, w25
    b.eq     #0x25a7e8
    mov      w9, #0x6610
    movk     w9, #0x2197, lsl #16
    cmp      w8, w9
    b.ne     #0x25a3e0
    ldr      x1, [sp, #0x38]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616f0 // _CGRectGetMinX
    fmov     d12, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x980]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d13, d0
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461708 // _CGRectGetWidth
    fmadd    d13, d13, d0, d12
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616fc // _CGRectGetMinY
    fmov     d12, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x988]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d1, #1.00000000
    fsub     d14, d1, d0
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616b4 // _CGRectGetHeight
    fmadd    d0, d14, d0, d12
    fadd     d8, d13, d15
    fadd     d9, d0, d15
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xb48]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x678]
    fmov     d2, #26.00000000
    fmov     d3, #26.00000000
    mov      x1, x20
    fmov     d0, d8
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xac8]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xb48]
    fmov     d0, #13.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x1, [sp, #0x20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616fc // _CGRectGetMinY
    fmov     d12, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x940]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d13, d0
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616b4 // _CGRectGetHeight
    fmadd    d13, d13, d0, d12
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616f0 // _CGRectGetMinX
    fmov     d1, #-5.00000000
    fadd     d12, d0, d1
    fmov     d0, #-7.00000000
    fadd     d13, d13, d0
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461708 // _CGRectGetWidth
    fmov     d1, #10.00000000
    fadd     d8, d0, d1
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0xb58]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    fmov     d3, #14.00000000
    mov      x1, x20
    fmov     d0, d12
    fmov     d1, d13
    fmov     d2, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    fmov     d0, #7.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    str      w26, [x8]
    b        #0x25a3e0
    cmp      w8, w26
    b.eq     #0x25a818
    mov      w9, #0x8c38
    movk     w9, #0x6635, lsl #16
    cmp      w8, w9
    b.ne     #0x25a3e0
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xe30]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xe34]
    udiv     w8, w8, w9
    mov      w9, #0xa035
    movk     w9, #0xfaf, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x97f5
    movk     w9, #0x8ff0, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x2898
    movk     w9, #0x1680, lsl #16
    cmp      w8, w9
    mov      w8, #0x6610
    movk     w8, #0x2197, lsl #16
    csel     w8, w8, w26, eq
    b        #0x25ab20
    mov      w9, #0xcaef
    movk     w9, #0x3322, lsl #16
    cmp      w8, w9
    b.ne     #0x25ab2c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xb30]
    str      x1, [sp, #0x20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461744 // _CGRectIsEmpty
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    cmp      w21, #0
    mov      w8, #0xc46a
    movk     w8, #0x437d, lsl #16
    mov      w9, #0x8c38
    movk     w9, #0x6635, lsl #16
    csel     w8, w8, w9, ne
    b        #0x25ab20
    ldr      x0, [sp, #0x10]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    mov      w9, #0xc46a
    movk     w9, #0x437d, lsl #16
    str      w9, [x8]
    b        #0x25a3e0
    ldr      x8, [sp]
    str      w25, [x8]
    ldr      x8, [sp, #0x18]
    str      x8, [sp, #0x10]
    b        #0x25a3e0
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xe38]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xe3c]
    udiv     w8, w8, w9
    mov      w9, #0xd1d0
    movk     w9, #0xcf, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x2002
    movk     w9, #0xc1bc, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x183f
    movk     w9, #0x17fb, lsl #16
    orr      w25, w8, w9
    ldr      x1, [sp, #0x38]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616f0 // _CGRectGetMinX
    fmov     d12, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x980]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d13, d0
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461708 // _CGRectGetWidth
    fmadd    d13, d13, d0, d12
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616fc // _CGRectGetMinY
    fmov     d12, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x988]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d1, #1.00000000
    fsub     d14, d1, d0
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616b4 // _CGRectGetHeight
    fmadd    d0, d14, d0, d12
    fadd     d8, d13, d15
    fadd     d9, d0, d15
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xb48]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x678]
    fmov     d2, #26.00000000
    fmov     d3, #26.00000000
    mov      x1, x20
    fmov     d0, d8
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xac8]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xb48]
    fmov     d0, #13.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x1, [sp, #0x20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616fc // _CGRectGetMinY
    fmov     d12, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x940]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d13, d0
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616b4 // _CGRectGetHeight
    fmadd    d13, d13, d0, d12
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616f0 // _CGRectGetMinX
    fmov     d1, #-5.00000000
    fadd     d12, d0, d1
    fmov     d0, #-7.00000000
    fadd     d13, d13, d0
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461708 // _CGRectGetWidth
    fmov     d1, #10.00000000
    fadd     d8, d0, d1
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0xb58]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    fmov     d3, #14.00000000
    mov      x1, x20
    fmov     d0, d12
    fmov     d1, d13
    fmov     d2, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x18]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    fmov     d0, #7.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      w8, #0x9904
    movk     w8, #0x5d20, lsl #16
    cmp      w25, w8
    mov      w25, #0x706
    movk     w25, #0xa217, lsl #16
    mov      w8, #0x6610
    movk     w8, #0x2197, lsl #16
    mov      w9, #0x580e
    movk     w9, #0x4725, lsl #16
    csel     w8, w9, w8, hi
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x25a3e0
    mov      w9, #0xc46a
    movk     w9, #0x437d, lsl #16
    cmp      w8, w9
    b.ne     #0x25a3e0
    ldr      x8, [sp, #0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x25ab84
    ldp      x29, x30, [sp, #0x100]
    ldp      x20, x19, [sp, #0xf0]
    ldp      x22, x21, [sp, #0xe0]
    ldp      x24, x23, [sp, #0xd0]
    ldp      x26, x25, [sp, #0xc0]
    ldp      x28, x27, [sp, #0xb0]
    ldp      d9, d8, [sp, #0xa0]
    ldp      d11, d10, [sp, #0x90]
    ldp      d13, d12, [sp, #0x80]
    ldp      d15, d14, [sp, #0x70]
    add      sp, sp, #0x110
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGColorPickerViewController confirmColor] IMP=0x25AB88 bounds=0x25AB88-0x25B2DC
loc_25AB88:
    sub      sp, sp, #0xc0
    stp      x28, x27, [sp, #0x60]
    stp      x26, x25, [sp, #0x70]
    stp      x24, x23, [sp, #0x80]
    stp      x22, x21, [sp, #0x90]
    stp      x20, x19, [sp, #0xa0]
    stp      x29, x30, [sp, #0xb0]
    add      x29, sp, #0xb0
    mov      x19, x0
    mov      w21, #0xefb6
    movk     w21, #0xea2b, lsl #16
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xcf0]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xcf8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    mov      w10, #0xa6cd
    movk     w10, #0xcfe2, lsl #16
    ldr      x8, [x8, #0x898]
    add      x9, sp, #0x14
    mov      w27, #0xc09d
    movk     w27, #0xe5b7, lsl #16
    str      x8, [sp, #0x58]
    mov      w28, #0x1d0d
    movk     w28, #0xd40f, lsl #16
    mov      w23, #0xa4f9
    movk     w23, #0x9fcb, lsl #16
    str      w10, [sp, #0x14]
    str      x9, [sp, #8]
    mov      w22, #0x3d03
    movk     w22, #0xd9a8, lsl #16
    mov      w26, #0x6449
    movk     w26, #0x4180, lsl #16
    mov      w25, #0x8a7b
    movk     w25, #0x2564, lsl #16
    mov      w24, #0x48c2
    movk     w24, #0x572c, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w27
    b.le     #0x25ac94
    cmp      w8, w26
    b.gt     #0x25ad6c
    cmp      w8, w25
    b.gt     #0x25ae5c
    mov      w9, #0xc09e
    movk     w9, #0xe5b7, lsl #16
    cmp      w8, w9
    b.eq     #0x25b284
    cmp      w8, w21
    b.eq     #0x25b098
    mov      w9, #0x5e36
    movk     w9, #0xf0c3, lsl #16
    cmp      w8, w9
    b.eq     #0x25b084
    b        #0x25ac4c
    cmp      w8, w28
    b.gt     #0x25acf8
    cmp      w8, w23
    b.le     #0x25aeb8
    mov      w9, #0xa4fa
    movk     w9, #0x9fcb, lsl #16
    cmp      w8, w9
    b.eq     #0x25aff8
    mov      w9, #0xd9d8
    movk     w9, #0xc0d0, lsl #16
    cmp      w8, w9
    b.eq     #0x25b00c
    mov      w9, #0xa6cd
    movk     w9, #0xcfe2, lsl #16
    cmp      w8, w9
    b.ne     #0x25ac4c
    ldr      x1, [sp, #0x58]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #0x78eb
    movk     w8, #0xe1db, lsl #16
    mov      w9, #0x9c68
    movk     w9, #0x8fe7, lsl #16
    b        #0x25b29c
    cmp      w8, w22
    b.le     #0x25af64
    mov      w9, #0x3d04
    movk     w9, #0xd9a8, lsl #16
    cmp      w8, w9
    b.eq     #0x25b13c
    mov      w9, #0x8c81
    movk     w9, #0xe0ea, lsl #16
    cmp      w8, w9
    b.eq     #0x25b030
    mov      w9, #0x78eb
    movk     w9, #0xe1db, lsl #16
    cmp      w8, w9
    b.ne     #0x25ac4c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x478]
    str      x1, [sp, #0x48]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x461c9c // _objc_release
    cmp      x20, #0
    mov      w8, #0x9af2
    movk     w8, #0x34db, lsl #16
    mov      w9, #0xf4d1
    movk     w9, #0x3c3d, lsl #16
    b        #0x25b134
    cmp      w8, w24
    b.le     #0x25afa0
    mov      w9, #0x48c3
    movk     w9, #0x572c, lsl #16
    cmp      w8, w9
    b.eq     #0x25b200
    mov      w9, #0x78d1
    movk     w9, #0x6832, lsl #16
    cmp      w8, w9
    b.eq     #0x25b050
    mov      w9, #0xbf71
    movk     w9, #0x6dda, lsl #16
    cmp      w8, w9
    b.ne     #0x25ac4c
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xe48]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xe4c]
    mul      w8, w8, w9
    mov      w9, #0x780a
    movk     w9, #0x6d5, lsl #16
    and      w8, w8, w9
    mov      w9, #0x196d
    movk     w9, #0x5e9, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x333c
    movk     w9, #0x4146, lsl #16
    mul      w20, w8, w9
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb20]
    str      x1, [sp, #0x40]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x38]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xd88]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x918]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    cmp      x0, x19
    cset     w8, eq
    strb     w8, [sp, #0x27]
    mov      w8, #0xd1f9
    movk     w8, #0x1d88, lsl #16
    cmp      w20, w8
    mov      w8, #0x3d04
    movk     w8, #0xd9a8, lsl #16
    mov      w9, #0xc09e
    movk     w9, #0xe5b7, lsl #16
    csel     w8, w8, w9, hi
    b        #0x25b2a0
    mov      w9, #0x9af2
    movk     w9, #0x34db, lsl #16
    cmp      w8, w9
    b.eq     #0x25b22c
    mov      w9, #0xf4d1
    movk     w9, #0x3c3d, lsl #16
    cmp      w8, w9
    b.ne     #0x25b2ac
    ldr      x1, [sp, #0x48]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x928]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x1, x0
    ldr      x8, [x20, #0x10]
    mov      x0, x20
    blr      x8
    b        #0x25b1e8
    mov      w9, #0x9c68
    movk     w9, #0x8fe7, lsl #16
    cmp      w8, w9
    b.eq     #0x25b0fc
    mov      w9, #0x69f3
    movk     w9, #0x94de, lsl #16
    cmp      w8, w9
    b.ne     #0x25ac4c
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xe58]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xe5c]
    udiv     w8, w8, w9
    mov      w9, #0xd6fc
    movk     w9, #0x8915, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x7f94
    movk     w9, #0x831c, lsl #16
    and      w20, w8, w9
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cmp      x0, #0
    cset     w8, eq
    strb     w8, [sp, #0x26]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x38]
    bl       #0x461c9c // _objc_release
    mov      w8, #0x423b
    movk     w8, #0xe5f6, lsl #16
    cmp      w20, w8
    mov      w8, #0x78d1
    movk     w8, #0x6832, lsl #16
    mov      w9, #0x8c81
    movk     w9, #0xe0ea, lsl #16
    b        #0x25b134
    mov      w9, #0x1d0e
    movk     w9, #0xd40f, lsl #16
    cmp      w8, w9
    b.eq     #0x25b024
    mov      w9, #0xb85c
    movk     w9, #0xd95e, lsl #16
    cmp      w8, w9
    b.ne     #0x25ac4c
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0x9af2
    movk     w9, #0x34db, lsl #16
    str      w9, [x8]
    b        #0x25ac4c
    mov      w9, #0x644a
    movk     w9, #0x4180, lsl #16
    cmp      w8, w9
    b.eq     #0x25b190
    mov      w9, #0x9ac1
    movk     w9, #0x41ad, lsl #16
    cmp      w8, w9
    b.ne     #0x25ac4c
    ldr      x1, [sp, #0x40]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x758]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461d38 // _objc_unsafeClaimAutoreleasedReturnValue
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0x8a7c
    movk     w9, #0x2564, lsl #16
    str      w9, [x8]
    b        #0x25ac4c
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb38]
    mov      x0, x19
    mov      w2, #1
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x25ac4c
    ldrb     w8, [sp, #0x26]
    cmp      w8, #0
    mov      w8, #0x9ac1
    movk     w8, #0x41ad, lsl #16
    mov      w9, #0x1d0e
    movk     w9, #0xd40f, lsl #16
    csel     w8, w8, w9, ne
    b        #0x25b2a0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x38]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0x69f3
    movk     w9, #0x94de, lsl #16
    str      w9, [x8]
    b        #0x25ac4c
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xe68]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xe6c]
    add      w8, w8, w9
    lsr      w8, w8, #2
    mov      w9, #0x977f
    movk     w9, #0x40e8, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x39
    and      w20, w8, #6
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb38]
    mov      x0, x19
    mov      w2, #1
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      w8, #0x27bb
    movk     w8, #0x2f75, lsl #16
    cmp      w20, w8
    mov      w8, #0xd9d8
    movk     w8, #0xc0d0, lsl #16
    mov      w9, #0xa4fa
    movk     w9, #0x9fcb, lsl #16
    b        #0x25b29c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd00]
    str      x1, [sp, #0x50]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x461c9c // _objc_release
    cmp      x20, #0
    mov      w8, #0x78eb
    movk     w8, #0xe1db, lsl #16
    mov      w9, #0x644a
    movk     w9, #0x4180, lsl #16
    csel     w8, w8, w9, eq
    b        #0x25b2a0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xd88]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x918]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldr      x8, [sp, #8]
    mov      w9, #0xbf71
    movk     w9, #0x6dda, lsl #16
    str      w9, [x8]
    b        #0x25ac4c
    ldr      x1, [sp, #0x50]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8c8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8c0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    ldr      x8, [x20, #0x10]
    mov      x0, x20
    mov      x1, x21
    mov      w21, #0xefb6
    movk     w21, #0xea2b, lsl #16
    blr      x8
    ldr      x8, [sp, #8]
    mov      w9, #0xb85c
    movk     w9, #0xd95e, lsl #16
    str      w9, [x8]
    str      x20, [sp, #0x18]
    b        #0x25ac4c
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x38]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0x9ac1
    movk     w9, #0x41ad, lsl #16
    str      w9, [x8]
    b        #0x25ac4c
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xe40]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xe44]
    and      w8, w8, w9
    mov      w9, #0x10
    movk     w9, #0x1028, lsl #16
    eor      w8, w8, w9
    mov      w9, #0xc5cf
    movk     w9, #0xd94, lsl #16
    orr      w8, w8, w9
    mov      w9, #0xcdff
    movk     w9, #0x9dfc, lsl #16
    and      w8, w8, w9
    mov      w9, #0xa56b
    movk     w9, #0x9699, lsl #16
    cmp      w8, w9
    mov      w8, #0x3d04
    movk     w8, #0xd9a8, lsl #16
    mov      w9, #0xbf71
    movk     w9, #0x6dda, lsl #16
    b        #0x25b29c
    ldrb     w8, [sp, #0x27]
    cmp      w8, #0
    mov      w8, #0x48c3
    movk     w8, #0x572c, lsl #16
    mov      w9, #0x5e36
    movk     w9, #0xf0c3, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x25ac4c
    mov      w9, #0x8a7c
    movk     w9, #0x2564, lsl #16
    cmp      w8, w9
    b.ne     #0x25ac4c
    ldp      x29, x30, [sp, #0xb0]
    ldp      x20, x19, [sp, #0xa0]
    ldp      x22, x21, [sp, #0x90]
    ldp      x24, x23, [sp, #0x80]
    ldp      x26, x25, [sp, #0x70]
    ldp      x28, x27, [sp, #0x60]
    add      sp, sp, #0xc0
    ret      

// -[WCLGColorPickerViewController appearanceSegmentChanged:] IMP=0x25B2DC bounds=0x25B2DC-0x25B580
loc_25B2DC:
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
    mov      w22, #0xc770
    movk     w22, #0x722e, lsl #16
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xe70]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xe74]
    and      w8, w8, w9
    mov      w9, #0x857b
    movk     w9, #0x7e54, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3c
    mov      w9, #0xdcb1
    movk     w9, #0x3336, lsl #16
    add      w8, w8, w9
    str      w8, [sp, #0xc]
    mov      w8, #0xfdd5
    movk     w8, #0x9672, lsl #16
    str      w8, [sp, #8]
    add      x8, sp, #8
    str      x8, [sp]
    mov      w24, #0x735d
    movk     w24, #0x2917, lsl #16
    mov      w26, #0x735e
    movk     w26, #0x2917, lsl #16
    adrp     x28, #0x4c0000
    adrp     x25, #0x4c0000
    adrp     x23, #0x4c0000
    ldr      w8, [sp, #8]
    cmp      w8, w24
    b.le     #0x25b47c
    cmp      w8, w26
    b.eq     #0x25b4ac
    cmp      w8, w22
    b.ne     #0x25b370
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xe78]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xe7c]
    add      w8, w8, w9
    mov      w9, #0x5576
    movk     w9, #0xd45b, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x544e
    movk     w9, #0x2675, lsl #16
    add      w8, w8, w9
    mov      w9, #0xf9
    movk     w9, #0x46ba, lsl #16
    umull    x8, w8, w9
    lsr      x27, x8, #0x3c
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x3d8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xcf0]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xcf8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd08]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cmp      x21, #1
    cset     w2, eq
    ldr      x1, [x28, #0xd10]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x25, #0xc50]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x23, #0xc58]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      w8, #0x103b
    movk     w8, #0x780c, lsl #16
    cmp      w27, w8
    mov      w8, #0x2b54
    movk     w8, #0xd6f1, lsl #16
    csel     w8, w22, w8, eq
    b        #0x25b4a0
    mov      w9, #0xfdd5
    movk     w9, #0x9672, lsl #16
    cmp      w8, w9
    b.ne     #0x25b550
    ldr      w8, [sp, #0xc]
    mov      w9, #0x512
    movk     w9, #0x5f75, lsl #16
    cmp      w8, w9
    csel     w8, w22, w26, lo
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x25b370
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x3d8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xcf0]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xcf8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd08]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cmp      x21, #1
    cset     w2, eq
    ldr      x1, [x28, #0xd10]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x25, #0xc50]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x23, #0xc58]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x25b370
    mov      w9, #0x2b54
    movk     w9, #0xd6f1, lsl #16
    cmp      w8, w9
    b.ne     #0x25b370
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    add      sp, sp, #0x70
    ret      

// -[WCLGColorPickerViewController applyMode:] IMP=0x25B580 bounds=0x25B580-0x25B620
loc_25B580:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x920]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaa0]
    adrp     x9, #0x4c4000
    ldrsw    x9, [x9, #0xaa4]
    adrp     x10, #0x4c4000
    ldrsw    x10, [x10, #0xaa8]
    adrp     x11, #0x4c4000
    ldrsw    x11, [x11, #0xaac]
    adrp     x12, #0x4c0000
    ldr      x1, [x12, #0x930]
    add      x3, x20, x8
    add      x4, x20, x9
    add      x5, x20, x10
    add      x6, x20, x11
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x938]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9a8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc58]
    mov      x0, x20
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c6c // _objc_msgSend

// -[WCLGColorPickerViewController channelSliderChanged:] IMP=0x25B620 bounds=0x25B620-0x25B91C
loc_25B620:
    sub      sp, sp, #0xb0
    stp      d11, d10, [sp, #0x30]
    stp      d9, d8, [sp, #0x40]
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      x19, x2
    mov      x20, x0
    mov      w21, #0x6105
    movk     w21, #0x8559, lsl #16
    mov      w28, #0xd662
    movk     w28, #0x6687, lsl #16
    mov      w23, #0x46c7
    movk     w23, #0x119, lsl #16
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c0000
    mov      w10, #0x80d5
    movk     w10, #0xb6f4, lsl #16
    ldr      x8, [x8, #0xd18]
    add      x9, sp, #0x14
    mov      w25, #0xd661
    movk     w25, #0x6687, lsl #16
    str      x8, [sp, #0x28]
    mov      w26, #0x80d4
    movk     w26, #0xb6f4, lsl #16
    str      w10, [sp, #0x14]
    str      x9, [sp, #8]
    mov      w22, #0x78a
    movk     w22, #0x7c44, lsl #16
    mov      w24, #0x117c
    movk     w24, #0x6f18, lsl #16
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x4d0]
    mov      w27, #0x117d
    movk     w27, #0x6f18, lsl #16
    fmov     d9, xzr
    fmov     d10, #1.00000000
    ldr      w8, [sp, #0x14]
    cmp      w8, w25
    b.gt     #0x25b700
    cmp      w8, w26
    b.gt     #0x25b758
    cmp      w8, w21
    b.eq     #0x25b834
    mov      w9, #0xe759
    movk     w9, #0x9981, lsl #16
    cmp      w8, w9
    b.ne     #0x25b6c8
    ldr      x8, [sp, #8]
    str      w28, [x8]
    b        #0x25b6c8
    cmp      w8, w24
    b.le     #0x25b7ac
    cmp      w8, w27
    b.eq     #0x25b7f4
    cmp      w8, w22
    b.ne     #0x25b6c8
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x938]
    mov      x0, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9a8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc58]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x25b6c8
    mov      w9, #0x80d5
    movk     w9, #0xb6f4, lsl #16
    cmp      w8, w9
    b.eq     #0x25b8c0
    cmp      w8, w23
    b.ne     #0x25b6c8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xe80]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xe84]
    and      w8, w8, w9
    mov      w9, #0xd978
    movk     w9, #0xd8e8, lsl #16
    mov      w10, #0xb443
    movk     w10, #0x2bf5, lsl #16
    madd     w8, w8, w9, w10
    mov      w9, #0x8268
    movk     w9, #0xdfa, lsl #16
    cmp      w8, w9
    csel     w8, w22, w21, lo
    b        #0x25b8dc
    mov      w9, #0xb8e6
    movk     w9, #0x678d, lsl #16
    cmp      w8, w9
    b.ne     #0x25b8e8
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    str      s0, [sp, #0x24]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x470]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    sub      x8, x0, #1
    str      x8, [sp, #0x18]
    cmp      x8, #4
    csel     w8, w27, w23, lo
    b        #0x25b8dc
    ldr      s0, [sp, #0x24]
    fcvt     d0, s0
    fdiv     d0, d0, d8
    fmaxnm   d0, d0, d9
    fcmp     d0, d10
    fcsel    d0, d10, d0, gt
    ldr      x8, [sp, #0x18]
    adrp     x9, #0x4a2000
    add      x9, x9, #0xe08
    ldr      x8, [x9, x8, lsl #3]
    ldr      x1, [x8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    str      w23, [x8]
    b        #0x25b6c8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xe88]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xe8c]
    mov      w10, #0xb4eb
    movk     w10, #0x38e0, lsl #16
    madd     w8, w8, w9, w10
    mov      w9, #0x50a1
    movk     w9, #0x532, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x6f68
    movk     w9, #0x11cb, lsl #16
    mul      w28, w8, w9
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x938]
    mov      x0, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9a8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc58]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      w8, #0x241b
    movk     w8, #0xd90a, lsl #16
    cmp      w28, w8
    mov      w28, #0xd662
    movk     w28, #0x6687, lsl #16
    mov      w8, #0xe759
    movk     w8, #0x9981, lsl #16
    csel     w8, w21, w8, hi
    b        #0x25b8dc
    ldr      x1, [sp, #0x28]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #0xb8e6
    movk     w8, #0x678d, lsl #16
    csel     w8, w28, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x25b6c8
    cmp      w8, w28
    b.ne     #0x25b6c8
    mov      x0, x19
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    ldp      d9, d8, [sp, #0x40]
    ldp      d11, d10, [sp, #0x30]
    add      sp, sp, #0xb0
    b        #0x461c9c // _objc_release

// -[WCLGColorPickerViewController canvasGestureChanged:] IMP=0x25B91C bounds=0x25B91C-0x25BA98
loc_25B91C:
    stp      d13, d12, [sp, #-0x60]!
    stp      d11, d10, [sp, #0x10]
    stp      d9, d8, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x21, x2
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x20, [x8, #0xb18]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x458]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    fmov     d8, d1
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x4d8]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    fmov     d10, d0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    fmov     d11, #1.00000000
    fmaxnm   d12, d10, d11
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616b4 // _CGRectGetHeight
    fmov     d10, d0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    fmaxnm   d10, d10, d11
    fdiv     d0, d9, d12
    fmov     d9, xzr
    fmaxnm   d0, d0, d9
    fcmp     d0, d11
    fcsel    d0, d11, d0, gt
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x970]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fdiv     d0, d8, d10
    fsub     d0, d11, d0
    fmaxnm   d0, d0, d9
    fcmp     d0, d11
    fcsel    d0, d11, d0, gt
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x978]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd28]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9a8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc58]
    mov      x0, x19
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    ldp      d11, d10, [sp, #0x10]
    ldp      d13, d12, [sp], #0x60
    b        #0x461c6c // _objc_msgSend

// -[WCLGColorPickerViewController hueGestureChanged:] IMP=0x25BA98 bounds=0x25BA98-0x25BBA4
loc_25BA98:
    stp      d9, d8, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x20, x2
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xb30]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x458]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d1
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616b4 // _CGRectGetHeight
    fmov     d9, d0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    fmov     d0, #1.00000000
    fmaxnm   d1, d9, d0
    fdiv     d1, d8, d1
    fmov     d2, xzr
    fmaxnm   d1, d1, d2
    fcmp     d1, d0
    fcsel    d0, d0, d1, gt
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x968]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd28]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9a8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc58]
    mov      x0, x19
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      d9, d8, [sp], #0x40
    b        #0x461c6c // _objc_msgSend

// -[WCLGColorPickerViewController paletteButtonTapped:] IMP=0x25BBA4 bounds=0x25BBA4-0x25BFD0
loc_25BBA4:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x19, x2
    mov      x20, x0
    mov      w23, #0xc8a5
    movk     w23, #0xf5b3, lsl #16
    mov      w26, #0x12d9
    movk     w26, #0xe1a3, lsl #16
    mov      w27, #0x1a30
    movk     w27, #0x6e71, lsl #16
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x470]
    str      x1, [sp, #0x28]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      w9, #0xfc61
    movk     w9, #0x6122, lsl #16
    str      x0, [sp, #0x20]
    add      x8, sp, #0x14
    mov      w25, #0xc8a4
    movk     w25, #0xf5b3, lsl #16
    str      w9, [sp, #0x14]
    mov      w24, #0xe50d
    movk     w24, #0xaf46, lsl #16
    str      x8, [sp, #8]
    mov      w28, #0xfc60
    movk     w28, #0x6122, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w25
    b.le     #0x25bc84
    cmp      w8, w28
    b.le     #0x25bcf4
    cmp      w8, w27
    b.eq     #0x25be84
    mov      w9, #0xbaee
    movk     w9, #0x6e4e, lsl #16
    cmp      w8, w9
    b.eq     #0x25be1c
    mov      w9, #0xfc61
    movk     w9, #0x6122, lsl #16
    cmp      w8, w9
    b.ne     #0x25bc30
    ldr      x8, [sp, #0x20]
    cmp      x8, #0
    mov      w8, #0x6490
    movk     w8, #0xa00d, lsl #16
    csel     w8, w8, w26, ge
    b        #0x25bf94
    cmp      w8, w24
    b.le     #0x25bd18
    cmp      w8, w26
    b.eq     #0x25bf3c
    mov      w9, #0xdf56
    movk     w9, #0xea14, lsl #16
    cmp      w8, w9
    b.ne     #0x25bfa0
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xea8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xeac]
    mul      w8, w8, w9
    mov      w9, #0x1a2
    movk     w9, #0xc121, lsl #16
    mov      w10, #0x2ba2
    movk     w10, #0x933b, lsl #16
    madd     w21, w8, w9, w10
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      w8, #0x10b
    movk     w8, #0xa083, lsl #16
    cmp      w21, w8
    mov      w8, #0xbaee
    movk     w8, #0x6e4e, lsl #16
    mov      w9, #0xe50e
    movk     w9, #0xaf46, lsl #16
    b        #0x25bf90
    cmp      w8, w23
    b.eq     #0x25bd9c
    mov      w9, #0x1d47
    movk     w9, #0x4fc3, lsl #16
    cmp      w8, w9
    b.ne     #0x25bc30
    ldr      x8, [sp, #8]
    str      w26, [x8]
    b        #0x25bc30
    mov      w9, #0x30d7
    movk     w9, #0x94b3, lsl #16
    cmp      w8, w9
    b.eq     #0x25be38
    mov      w9, #0x6490
    movk     w9, #0xa00d, lsl #16
    cmp      w8, w9
    b.ne     #0x25bc30
    ldr      x1, [sp, #0x28]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc00]
    str      x1, [sp, #0x18]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cmp      x21, x23
    mov      w23, #0xc8a5
    movk     w23, #0xf5b3, lsl #16
    mov      w8, #0x30d7
    movk     w8, #0x94b3, lsl #16
    csel     w8, w8, w26, lt
    b        #0x25bf94
    ldr      x1, [sp, #0x18]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x28]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4e8]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd30]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w27, [x8]
    b        #0x25bc30
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0xdf56
    movk     w9, #0xea14, lsl #16
    str      w9, [x8]
    b        #0x25bc30
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xe90]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xe94]
    add      w8, w8, w9
    mov      w9, #0x2229
    movk     w9, #0xf526, lsl #16
    orr      w8, w8, w9
    mov      w9, #0xc8c0
    movk     w9, #0xf8a5, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x4dbd
    movk     w9, #0xdec2, lsl #16
    add      w8, w8, w9
    mov      w9, #0x1039
    movk     w9, #0x1944, lsl #16
    cmp      w8, w9
    csel     w8, w23, w27, lo
    b        #0x25bf94
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xe98]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xe9c]
    add      w8, w8, w9
    mov      w9, #0x5d5b
    movk     w9, #0x6ca8, lsl #16
    add      w23, w8, w9
    ldr      x1, [sp, #0x18]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x28]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4e8]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd30]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      w8, #0x75ce
    movk     w8, #0x30b2, lsl #16
    cmp      w23, w8
    mov      w23, #0xc8a5
    movk     w23, #0xf5b3, lsl #16
    mov      w8, #0x1d47
    movk     w8, #0x4fc3, lsl #16
    csel     w8, w8, w23, lo
    b        #0x25bf94
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xea0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xea4]
    mul      w8, w8, w9
    mov      w9, #0x1084
    movk     w9, #0x40, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x4041
    movk     w9, #0x4000, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x54cd
    movk     w9, #0x50c4, lsl #16
    and      w8, w8, w9
    mov      w9, #0xe341
    movk     w9, #0x1aa2, lsl #16
    cmp      w8, w9
    mov      w8, #0xdf56
    movk     w8, #0xea14, lsl #16
    mov      w9, #0xbaee
    movk     w9, #0x6e4e, lsl #16
    csel     w8, w9, w8, lo
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x25bc30
    mov      w9, #0xe50e
    movk     w9, #0xaf46, lsl #16
    cmp      w8, w9
    b.ne     #0x25bc30
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    ret      

// -[WCLGColorPickerViewController commonButtonTapped:] IMP=0x25BFD0 bounds=0x25BFD0-0x25C188
loc_25BFD0:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x19, x2
    mov      x20, x0
    mov      w24, #0x5532
    movk     w24, #0x1ecd, lsl #16
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x470]
    str      x1, [sp, #0x28]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      w25, #0xa5bf
    movk     w25, #0xe418, lsl #16
    str      x0, [sp, #0x20]
    add      x8, sp, #0x14
    str      w25, [sp, #0x14]
    mov      w26, #0xc7d8
    movk     w26, #0x1ca0, lsl #16
    mov      w27, #0xa9d5
    movk     w27, #0xf0c9, lsl #16
    str      x8, [sp, #8]
    mov      w28, #0xc7d9
    movk     w28, #0x1ca0, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w26
    b.gt     #0x25c0bc
    cmp      w8, w25
    b.eq     #0x25c144
    cmp      w8, w27
    b.ne     #0x25c04c
    ldr      x1, [sp, #0x28]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc28]
    str      x1, [sp, #0x18]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cmp      x21, x23
    csel     w8, w28, w24, lt
    b        #0x25c150
    cmp      w8, w28
    b.ne     #0x25c15c
    ldr      x1, [sp, #0x18]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [sp, #0x28]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4e8]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd30]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w24, [x8]
    b        #0x25c04c
    ldr      x8, [sp, #0x20]
    cmp      x8, #0
    csel     w8, w27, w24, ge
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x25c04c
    cmp      w8, w24
    b.ne     #0x25c04c
    mov      x0, x19
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    b        #0x461c9c // _objc_release

// -[WCLGColorPickerViewController parseHexString:red:green:blue:alpha:] IMP=0x25C188 bounds=0x25C188-0x25D2EC
loc_25C188:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    sub      sp, sp, #0xb0
    mov      x26, x6
    mov      x27, x5
    stp      x3, x4, [x29, #-0xf8]
    sub      x8, x29, #0x10
    stur     x2, [x8, #-0x100]
    mov      w19, #0x1374
    movk     w19, #0xfbbd, lsl #16
    adrp     x8, #0x57f000
    add      x8, x8, #0xa44
    ldar     w8, [x8]
    stur     w8, [x29, #-0x6c]
    sub      x8, x29, #0xdc
    stur     x8, [x29, #-0xe8]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x4d0]
    mov      w8, #0x1e7c
    movk     w8, #0x8680, lsl #16
    stur     w8, [x29, #-0xdc]
    mov      w28, #0x99bd
    movk     w28, #0xf3d8, lsl #16
    mov      w24, #0x36cb
    movk     w24, #0xc460, lsl #16
    mov      w25, #0x14b1
    movk     w25, #0x9e52, lsl #16
    mov      w20, #0xab20
    movk     w20, #0xd29d, lsl #16
    mov      w22, #0xb9c4
    movk     w22, #0x39ef, lsl #16
    mov      w21, #0x815f
    movk     w21, #0x865, lsl #16
    mov      w23, #0xb17a
    movk     w23, #0x59ba, lsl #16
    stur     x6, [x29, #-0x100]
    sub      x8, x29, #8
    stur     x5, [x8, #-0x100]
    ldur     w8, [x29, #-0xdc]
    cmp      w8, w28
    b.le     #0x25c2c0
    cmp      w8, w22
    b.le     #0x25c36c
    cmp      w8, w23
    b.gt     #0x25c47c
    mov      w9, #0x9242
    movk     w9, #0x46cf, lsl #16
    cmp      w8, w9
    b.le     #0x25c704
    mov      w9, #0x89e2
    movk     w9, #0x5025, lsl #16
    cmp      w8, w9
    b.gt     #0x25c910
    mov      w9, #0x9243
    movk     w9, #0x46cf, lsl #16
    cmp      w8, w9
    b.eq     #0x25cad4
    mov      w9, #0x204f
    movk     w9, #0x49b3, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    ldur     x8, [x29, #-0x78]
    ldrb     w8, [x8, #2]
    ucvtf    d0, x8
    fdiv     d0, d0, d8
    ldur     x8, [x29, #-0xf8]
    str      d0, [x8]
    ldur     x8, [x29, #-0xe8]
    mov      w9, #0x527f
    movk     w9, #0x43e0, lsl #16
    str      w9, [x8]
    b        #0x25c238
    cmp      w8, w24
    b.gt     #0x25c40c
    cmp      w8, w25
    b.le     #0x25c5b8
    mov      w9, #0x9b01
    movk     w9, #0xa48a, lsl #16
    cmp      w8, w9
    b.le     #0x25c7c4
    mov      w9, #0x8c4d
    movk     w9, #0xb26f, lsl #16
    cmp      w8, w9
    b.gt     #0x25c978
    mov      w9, #0x9b02
    movk     w9, #0xa48a, lsl #16
    cmp      w8, w9
    b.eq     #0x25cb8c
    mov      w9, #0xf1ce
    movk     w9, #0xad57, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    ldur     x8, [x29, #-0x78]
    str      xzr, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x260]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x798]
    ldur     x2, [x29, #-0xd0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xa0]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd38]
    ldur     x2, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    sturb    w0, [x29, #-0xa1]
    cmp      w0, #0
    mov      w8, #0xc160
    movk     w8, #0x15d9, lsl #16
    mov      w9, #0xf206
    movk     w9, #0xc2b9, lsl #16
    csel     w8, w9, w8, ne
    b        #0x25d280
    cmp      w8, w21
    b.le     #0x25c52c
    mov      w9, #0xa0a6
    movk     w9, #0x1e73, lsl #16
    cmp      w8, w9
    b.le     #0x25c6c0
    mov      w9, #0x57f3
    movk     w9, #0x26a0, lsl #16
    cmp      w8, w9
    b.gt     #0x25c8dc
    mov      w9, #0xa0a7
    movk     w9, #0x1e73, lsl #16
    cmp      w8, w9
    b.eq     #0x25ca48
    mov      w9, #0xed6f
    movk     w9, #0x1e7e, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xec0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xec4]
    eor      w8, w8, w9
    mov      w9, #0xa546
    movk     w9, #0x1ee3, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x6134
    movk     w9, #0xde1, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x78e4
    movk     w9, #0xd186, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x2178
    movk     w9, #0x171b, lsl #16
    cmp      w8, w9
    mov      w8, #0xb17b
    movk     w8, #0x59ba, lsl #16
    mov      w9, #0x2472
    movk     w9, #0x31, lsl #16
    b        #0x25d1c8
    cmp      w8, w20
    b.le     #0x25c614
    mov      w9, #0x858
    movk     w9, #0xe0d6, lsl #16
    cmp      w8, w9
    b.le     #0x25c80c
    mov      w9, #0xed6b
    movk     w9, #0xeeae, lsl #16
    cmp      w8, w9
    b.gt     #0x25c9d0
    mov      w9, #0x859
    movk     w9, #0xe0d6, lsl #16
    cmp      w8, w9
    b.eq     #0x25cbe8
    mov      w9, #0xbd94
    movk     w9, #0xebde, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    ldur     x8, [x29, #-0x78]
    ldrb     w8, [x8, #1]
    ucvtf    d0, x8
    fdiv     d0, d0, d8
    ldp      x9, x8, [x29, #-0xf0]
    str      d0, [x9]
    mov      w9, #0x3435
    movk     w9, #0xf457, lsl #16
    str      w9, [x8]
    b        #0x25c238
    mov      w9, #0xc121
    movk     w9, #0x72e3, lsl #16
    cmp      w8, w9
    b.le     #0x25c674
    mov      w9, #0xd844
    movk     w9, #0x76a9, lsl #16
    cmp      w8, w9
    b.gt     #0x25ca08
    mov      w9, #0xc122
    movk     w9, #0x72e3, lsl #16
    cmp      w8, w9
    b.eq     #0x25ca34
    mov      w9, #0x4c80
    movk     w9, #0x73fd, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xf28]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xf2c]
    orr      w8, w8, w9
    mov      w9, #0xf3ce
    movk     w9, #0x96cc, lsl #16
    orr      w8, w8, w9
    mov      w9, #0xe1c2
    movk     w9, #0xe8e0, lsl #16
    add      w8, w8, w9
    mov      w9, #0xe211
    movk     w9, #0x9def, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3b
    ldur     x9, [x29, #-0x78]
    ldrb     w9, [x9]
    ucvtf    d0, x9
    fdiv     d0, d0, d8
    stur     d0, [x29, #-0xb0]
    mov      w9, #0x3b8
    movk     w9, #0xeb7, lsl #16
    cmp      w8, w9
    mov      w8, #0x4c80
    movk     w8, #0x73fd, lsl #16
    mov      w9, #0xc221
    movk     w9, #0x7d41, lsl #16
    b        #0x25cdb0
    mov      w9, #0x6a3c
    movk     w9, #0x13, lsl #16
    cmp      w8, w9
    b.gt     #0x25c764
    mov      w9, #0x99be
    movk     w9, #0xf3d8, lsl #16
    cmp      w8, w9
    b.eq     #0x25ce2c
    mov      w9, #0x3435
    movk     w9, #0xf457, lsl #16
    cmp      w8, w9
    b.eq     #0x25d028
    cmp      w8, w19
    b.ne     #0x25c238
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xef8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xefc]
    and      w8, w8, w9
    mov      w9, #0x2080
    movk     w9, #0x4001, lsl #16
    and      w8, w8, w9
    mov      w9, #0x2fa6
    movk     w9, #0x391f, lsl #16
    mul      w8, w8, w9
    ldur     x9, [x29, #-0xf0]
    cmp      x9, #0
    cset     w9, eq
    sturb    w9, [x29, #-0xa3]
    mov      w9, #0x6fd4
    movk     w9, #0x4adb, lsl #16
    cmp      w8, w9
    mov      w8, #0x14b2
    movk     w8, #0x9e52, lsl #16
    b        #0x25cf34
    mov      w9, #0xc164
    movk     w9, #0x8cb4, lsl #16
    cmp      w8, w9
    b.gt     #0x25c840
    mov      w9, #0xc65d
    movk     w9, #0x83e0, lsl #16
    cmp      w8, w9
    b.eq     #0x25cf3c
    mov      w9, #0xa48e
    movk     w9, #0x8537, lsl #16
    cmp      w8, w9
    b.eq     #0x25d1d0
    mov      w9, #0x1e7c
    movk     w9, #0x8680, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    ldur     w8, [x29, #-0x6c]
    cmp      w8, #0
    mov      w8, #0xed6f
    movk     w8, #0x1e7e, lsl #16
    mov      w9, #0xd98f
    movk     w9, #0xde5e, lsl #16
    b        #0x25c9c8
    mov      w9, #0x2d56
    movk     w9, #0xca05, lsl #16
    cmp      w8, w9
    b.gt     #0x25c898
    mov      w9, #0x36cc
    movk     w9, #0xc460, lsl #16
    cmp      w8, w9
    b.eq     #0x25cfb4
    mov      w9, #0x5ba1
    movk     w9, #0xc6f6, lsl #16
    cmp      w8, w9
    b.eq     #0x25d240
    mov      w9, #0x4864
    movk     w9, #0xc71b, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    ldur     x1, [x29, #-0x90]
    ldur     x0, [x29, #-0xd0]
    bl       #0x461c6c // _objc_msgSend
    ldur     x8, [x29, #-0xe8]
    mov      w9, #0xa48e
    movk     w9, #0x8537, lsl #16
    str      w9, [x8]
    b        #0x25c238
    mov      w9, #0xb17b
    movk     w9, #0x59ba, lsl #16
    cmp      w8, w9
    b.eq     #0x25cc7c
    mov      w9, #0xddec
    movk     w9, #0x5d3d, lsl #16
    cmp      w8, w9
    b.eq     #0x25c6f0
    mov      w9, #0xc301
    movk     w9, #0x6dea, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    ldur     x8, [x29, #-0xf0]
    cmp      x8, #0
    mov      w8, #0xcaaf
    movk     w8, #0xa2aa, lsl #16
    mov      w9, #0xbdfa
    movk     w9, #0x9e0c, lsl #16
    b        #0x25d27c
    mov      w9, #0x8160
    movk     w9, #0x865, lsl #16
    cmp      w8, w9
    b.eq     #0x25cdb8
    mov      w9, #0xc160
    movk     w9, #0x15d9, lsl #16
    cmp      w8, w9
    b.eq     #0x25cec0
    mov      w9, #0x9cee
    movk     w9, #0x1d63, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    ldur     x8, [x29, #-0xe8]
    mov      w9, #0xb9c5
    movk     w9, #0x39ef, lsl #16
    str      w9, [x8]
    b        #0x25c238
    mov      w9, #0xb9c5
    movk     w9, #0x39ef, lsl #16
    cmp      w8, w9
    b.eq     #0x25cde0
    mov      w9, #0x527f
    movk     w9, #0x43e0, lsl #16
    cmp      w8, w9
    b.eq     #0x25cee4
    mov      w9, #0x8a14
    movk     w9, #0x447c, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    ldurb    w8, [x29, #-0x81]
    cmp      w8, #0
    mov      w8, #0xb6f3
    movk     w8, #0x421, lsl #16
    mov      w9, #0x96bd
    movk     w9, #0x5602, lsl #16
    csel     w8, w9, w8, ne
    ldur     x9, [x29, #-0xe8]
    str      w8, [x9]
    ldur     x8, [x29, #-0x80]
    stur     x8, [x29, #-0xb8]
    b        #0x25c238
    mov      w9, #0x6a3d
    movk     w9, #0x13, lsl #16
    cmp      w8, w9
    b.eq     #0x25ce6c
    mov      w9, #0x2472
    movk     w9, #0x31, lsl #16
    cmp      w8, w9
    b.eq     #0x25d03c
    mov      w9, #0xb6f3
    movk     w9, #0x421, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    ldur     x0, [x29, #-0xb8]
    stur     x0, [x29, #-0xd0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    stur     x1, [x29, #-0x90]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #6
    mov      w8, #0xf1ce
    movk     w8, #0xad57, lsl #16
    mov      w9, #0x859
    movk     w9, #0xe0d6, lsl #16
    b        #0x25d27c
    mov      w9, #0x14b2
    movk     w9, #0x9e52, lsl #16
    cmp      w8, w9
    b.eq     #0x25ce78
    mov      w9, #0xe9d7
    movk     w9, #0xa190, lsl #16
    cmp      w8, w9
    b.eq     #0x25d128
    mov      w9, #0xcaaf
    movk     w9, #0xa2aa, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    cmp      x27, #0
    mov      w8, #0x3bd2
    movk     w8, #0xf1dd, lsl #16
    mov      w9, #0x8160
    movk     w9, #0x865, lsl #16
    b        #0x25d27c
    mov      w9, #0xab21
    movk     w9, #0xd29d, lsl #16
    cmp      w8, w9
    b.eq     #0x25ce94
    mov      w9, #0xbfd2
    movk     w9, #0xd685, lsl #16
    cmp      w8, w9
    b.eq     #0x25d18c
    mov      w9, #0xd98f
    movk     w9, #0xde5e, lsl #16
    cmp      w8, w9
    b.eq     #0x25ce58
    b        #0x25c238
    mov      w9, #0xc165
    movk     w9, #0x8cb4, lsl #16
    cmp      w8, w9
    b.eq     #0x25cfd4
    mov      w9, #0x9b99
    movk     w9, #0x94a5, lsl #16
    cmp      w8, w9
    b.eq     #0x25d268
    mov      w9, #0xbdfa
    movk     w9, #0x9e0c, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    ldur     x8, [x29, #-0x78]
    ldrb     w8, [x8, #2]
    ucvtf    d0, x8
    fdiv     d0, d0, d8
    ldp      x9, x8, [x29, #-0xf0]
    str      d0, [x9]
    mov      w9, #0xcaaf
    movk     w9, #0xa2aa, lsl #16
    str      w9, [x8]
    b        #0x25c238
    mov      w9, #0x2d57
    movk     w9, #0xca05, lsl #16
    cmp      w8, w9
    b.eq     #0x25cffc
    mov      w9, #0xd208
    movk     w9, #0xcf27, lsl #16
    cmp      w8, w9
    b.eq     #0x25d28c
    mov      w9, #0x4753
    movk     w9, #0xd28f, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    ldur     x8, [x29, #-0xe8]
    mov      w9, #0xc160
    movk     w9, #0x15d9, lsl #16
    str      w9, [x8]
    b        #0x25c238
    mov      w9, #0x57f4
    movk     w9, #0x26a0, lsl #16
    cmp      w8, w9
    b.eq     #0x25ca74
    mov      w9, #0xd1d8
    movk     w9, #0x3259, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    ldur     x8, [x29, #-0xe8]
    mov      w9, #0xc301
    movk     w9, #0x6dea, lsl #16
    str      w9, [x8]
    b        #0x25c238
    mov      w9, #0x89e3
    movk     w9, #0x5025, lsl #16
    cmp      w8, w9
    b.eq     #0x25cb20
    mov      w9, #0x96bd
    movk     w9, #0x5602, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x548]
    ldur     x0, [x29, #-0x80]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0xe8]
    mov      w9, #0xb6f3
    movk     w9, #0x421, lsl #16
    str      w9, [x8]
    stur     x25, [x29, #-0xb8]
    mov      w25, #0x14b1
    movk     w25, #0x9e52, lsl #16
    b        #0x25c238
    mov      w9, #0x8c4e
    movk     w9, #0xb26f, lsl #16
    cmp      w8, w9
    b.eq     #0x25cc4c
    mov      w9, #0xf206
    movk     w9, #0xc2b9, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    ldur     x1, [x29, #-0x90]
    ldur     x0, [x29, #-0xd0]
    bl       #0x461c6c // _objc_msgSend
    ldur     x8, [x29, #-0xf8]
    cmp      x8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0xa2]
    cmp      x0, #6
    mov      w8, #0xed6c
    movk     w8, #0xeeae, lsl #16
    mov      w9, #0x9cee
    movk     w9, #0x1d63, lsl #16
    csel     w8, w9, w8, eq
    b        #0x25d280
    mov      w9, #0xed6c
    movk     w9, #0xeeae, lsl #16
    cmp      w8, w9
    b.eq     #0x25cc60
    mov      w9, #0x3bd2
    movk     w9, #0xf1dd, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    cmp      x26, #0
    mov      w8, #0xc160
    movk     w8, #0x15d9, lsl #16
    mov      w9, #0xbfd2
    movk     w9, #0xd685, lsl #16
    b        #0x25d27c
    mov      w9, #0xc221
    movk     w9, #0x7d41, lsl #16
    cmp      w8, w9
    b.ne     #0x25d2a8
    ldur     x8, [x29, #-0xe8]
    mov      w9, #0xe9d7
    movk     w9, #0xa190, lsl #16
    str      w9, [x8]
    ldur     d0, [x29, #-0xb0]
    stur     d0, [x29, #-0xc0]
    b        #0x25c238
    ldur     x8, [x29, #-0xe8]
    mov      w9, #0xed6f
    movk     w9, #0x1e7e, lsl #16
    str      w9, [x8]
    b        #0x25c238
    ldurb    w8, [x29, #-0x91]
    cmp      w8, #0
    mov      w8, #0xf1ce
    movk     w8, #0xad57, lsl #16
    mov      w9, #0xd845
    movk     w9, #0x76a9, lsl #16
    csel     w8, w8, w9, ne
    ldur     x9, [x29, #-0xe8]
    str      w8, [x9]
    sturb    wzr, [x29, #-0xc1]
    b        #0x25c238
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xf38]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xf3c]
    mul      w8, w8, w9
    mov      w9, #0x1a21
    movk     w9, #0x88d0, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x2096
    movk     w9, #0x670d, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x45fc
    movk     w9, #0xd94d, lsl #16
    add      w8, w8, w9
    ldur     d0, [x29, #-0xd8]
    str      d0, [x26]
    mov      w9, #0x1822
    movk     w9, #0xfcf5, lsl #16
    cmp      w8, w9
    mov      w8, #0xd208
    movk     w8, #0xcf27, lsl #16
    mov      w9, #0x4753
    movk     w9, #0xd28f, lsl #16
    b        #0x25cdb0
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xf10]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xf14]
    sub      w8, w8, w9
    mov      w9, #0xe9fa
    movk     w9, #0x5945, lsl #16
    orr      w8, w8, w9
    mov      w9, #0xfdfa
    movk     w9, #0x5b5d, lsl #16
    and      w8, w8, w9
    mov      w9, #0x7775
    movk     w9, #0x4e14, lsl #16
    cmp      w8, w9
    mov      w8, #0x2d57
    movk     w8, #0xca05, lsl #16
    mov      w9, #0x89e3
    movk     w9, #0x5025, lsl #16
    b        #0x25d27c
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xf18]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xf1c]
    add      w8, w8, w9
    mov      w9, #0x7807
    movk     w9, #0x3be3, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x61d4
    movk     w9, #0x68e6, lsl #16
    mov      w10, #0x2680
    movk     w10, #0x2cc9, lsl #16
    madd     w8, w8, w9, w10
    ldur     x9, [x29, #-0x78]
    ldrb     w9, [x9, #3]
    ucvtf    d0, x9
    fdiv     d0, d0, d8
    ldur     x9, [x29, #-0xf8]
    str      d0, [x9]
    mov      w9, #0x2577
    movk     w9, #0x7dae, lsl #16
    cmp      w8, w9
    mov      w8, #0x2d57
    movk     w8, #0xca05, lsl #16
    mov      w9, #0xd1d8
    movk     w9, #0x3259, lsl #16
    b        #0x25d184
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xf00]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xf04]
    sub      w8, w8, w9
    mov      w9, #0xbe7f
    movk     w9, #0x76a2, lsl #16
    add      w8, w8, w9
    mov      w9, #0x16fc
    movk     w9, #0x646b, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x1cbb
    movk     w9, #0x6cd3, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3e
    mov      w9, #0x7d89
    movk     w9, #0x6560, lsl #16
    cmp      w8, w9
    mov      w8, #0xbd94
    movk     w8, #0xebde, lsl #16
    mov      w9, #0xc165
    movk     w9, #0x8cb4, lsl #16
    b        #0x25cfcc
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xed0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xed4]
    and      w8, w8, w9
    mov      w9, #0x5e8d
    movk     w9, #0x8ce2, lsl #16
    umull    x9, w8, w9
    lsr      x9, x9, #0x20
    sub      w8, w8, w9
    add      w8, w9, w8, lsr #1
    mov      w9, #0xb3f0
    movk     w9, #0x4cf3, lsl #16
    bfxil    w9, w8, #0x1e, #2
    mov      w8, #0x1b76
    movk     w8, #0x7e79, lsl #16
    eor      w8, w9, w8
    mov      w9, #0x4e30
    movk     w9, #0xfb3f, lsl #16
    cmp      w8, w9
    mov      w8, #0x4864
    movk     w8, #0xc71b, lsl #16
    mov      w9, #0xa48e
    movk     w9, #0x8537, lsl #16
    b        #0x25d184
    ldur     x8, [x29, #-0xe8]
    mov      w9, #0x4c80
    movk     w9, #0x73fd, lsl #16
    str      w9, [x8]
    b        #0x25c238
    ldurb    w8, [x29, #-0xa2]
    cmp      w8, #0
    mov      w8, #0xc301
    movk     w8, #0x6dea, lsl #16
    mov      w9, #0x9243
    movk     w9, #0x46cf, lsl #16
    b        #0x25cfcc
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xec8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xecc]
    udiv     w8, w8, w9
    mov      w9, #0x8bc3
    movk     w9, #0x1dbf, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x326d
    movk     w9, #0x7d61, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x9c92
    movk     w9, #0xa294, lsl #16
    eor      w27, w8, w9
    adrp     x8, #0x57f000
    add      x8, x8, #0xa44
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x10
    mov      sp, x8
    stur     x8, [x29, #-0x78]
    adrp     x8, #0x4c4000
    ldr      x25, [x8, #0xc0]
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x5b8]
    sub      x8, x29, #0x10
    ldur     x19, [x8, #-0x100]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x25
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5c0]
    mov      x0, x19
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x19
    mov      w19, #0x1374
    movk     w19, #0xfbbd, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x540]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x80]
    mov      x0, x26
    ldur     x26, [x29, #-0x100]
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      w25, #0x14b1
    movk     w25, #0x9e52, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x818]
    ldur     x0, [x29, #-0x80]
    adrp     x2, #0x522000
    add      x2, x2, #0xab0
    bl       #0x461c6c // _objc_msgSend
    sturb    w0, [x29, #-0x81]
    mov      w8, #0x637c
    movk     w8, #0xf635, lsl #16
    cmp      w27, w8
    sub      x8, x29, #8
    ldur     x27, [x8, #-0x100]
    mov      w8, #0x2472
    movk     w8, #0x31, lsl #16
    mov      w9, #0x8a14
    movk     w9, #0x447c, lsl #16
    csel     w8, w9, w8, lo
    b        #0x25d280
    ldur     x8, [x29, #-0x78]
    ldrb     w8, [x8, #1]
    ucvtf    d0, x8
    fdiv     d0, d0, d8
    str      d0, [x27]
    ldur     x8, [x29, #-0xe8]
    mov      w9, #0x3bd2
    movk     w9, #0xf1dd, lsl #16
    str      w9, [x8]
    b        #0x25c238
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xee8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xeec]
    eor      w8, w8, w9
    mov      w9, #0x45c4
    movk     w9, #0xb524, lsl #16
    and      w8, w8, w9
    mov      w9, #0x5bd1
    movk     w9, #0x2f89, lsl #16
    add      w8, w8, w9
    mov      w9, #0x3684
    movk     w9, #0xe685, lsl #16
    cmp      w8, w9
    mov      w8, #0xb9c5
    movk     w8, #0x39ef, lsl #16
    mov      w9, #0x36cc
    movk     w9, #0xc460, lsl #16
    b        #0x25d184
    adrp     x9, #0x522000
    add      x9, x9, #0xa80
    ldrb     w8, [x9]
    eor      w8, w8, #0x18
    adrp     x10, #0x522000
    add      x10, x10, #0xa82
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w9, #0x2f
    eor      w8, w8, w9
    strb     w8, [x10, #1]
    ldur     x8, [x29, #-0xe8]
    mov      w9, #0xc65d
    movk     w9, #0x83e0, lsl #16
    str      w9, [x8]
    b        #0x25c238
    ldur     x8, [x29, #-0xe8]
    str      w19, [x8]
    b        #0x25c238
    ldurb    w8, [x29, #-0xa3]
    cmp      w8, #0
    mov      w8, #0x9b99
    movk     w8, #0x94a5, lsl #16
    mov      w9, #0x9b02
    movk     w9, #0xa48a, lsl #16
    b        #0x25cfcc
    cmp      x26, #0
    ldur     x8, [x29, #-0xe8]
    mov      w9, #0xe9d7
    movk     w9, #0xa190, lsl #16
    mov      w10, #0xc160
    movk     w10, #0x15d9, lsl #16
    csel     w9, w10, w9, eq
    str      w9, [x8]
    mov      x8, #0x3ff0000000000000
    stur     x8, [x29, #-0xc0]
    b        #0x25c238
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0xe8]
    mov      w9, #0xd845
    movk     w9, #0x76a9, lsl #16
    str      w9, [x8]
    ldurb    w8, [x29, #-0xa1]
    sturb    w8, [x29, #-0xc1]
    b        #0x25c238
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xef0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xef4]
    orr      w8, w8, w9
    mov      w9, #0x5481
    movk     w9, #0x4c19, lsl #16
    add      w8, w8, w9
    mov      w9, #0x5953
    movk     w9, #0x2731, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x8643
    movk     w9, #0xbbb4, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3b
    mov      w9, #0x254
    movk     w9, #0xc274, lsl #16
    cmp      w8, w9
    mov      w8, #0x6a3d
    movk     w8, #0x13, lsl #16
    csel     w8, w19, w8, lo
    b        #0x25d280
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xeb8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xebc]
    orr      w8, w8, w9
    mov      w9, #0x6104
    movk     w9, #0x816, lsl #16
    and      w8, w8, w9
    mov      w9, #0x85cf
    movk     w9, #0xf102, lsl #16
    add      w8, w8, w9
    adrp     x10, #0x522000
    add      x10, x10, #0xa80
    ldrb     w9, [x10]
    eor      w9, w9, #0x18
    adrp     x11, #0x522000
    add      x11, x11, #0xa82
    strb     w9, [x11]
    ldrb     w9, [x10, #1]
    mov      w10, #0x2f
    eor      w9, w9, w10
    strb     w9, [x11, #1]
    mov      w9, #0x44b4
    movk     w9, #0x714c, lsl #16
    cmp      w8, w9
    mov      w8, #0xc65d
    movk     w8, #0x83e0, lsl #16
    mov      w9, #0xc122
    movk     w9, #0x72e3, lsl #16
    b        #0x25d1c8
    ldurb    w8, [x29, #-0xa2]
    cmp      w8, #0
    mov      w8, #0x527f
    movk     w8, #0x43e0, lsl #16
    mov      w9, #0x204f
    movk     w9, #0x49b3, lsl #16
    csel     w8, w8, w9, ne
    b        #0x25d280
    ldur     x8, [x29, #-0x78]
    ldrb     w8, [x8, #1]
    ucvtf    d0, x8
    fdiv     d0, d0, d8
    ldp      x9, x8, [x29, #-0xf0]
    str      d0, [x9]
    mov      w9, #0xbd94
    movk     w9, #0xebde, lsl #16
    str      w9, [x8]
    b        #0x25c238
    ldur     x8, [x29, #-0x78]
    ldrb     w8, [x8, #3]
    ucvtf    d0, x8
    fdiv     d0, d0, d8
    ldur     x8, [x29, #-0xf8]
    str      d0, [x8]
    ldur     x8, [x29, #-0xe8]
    mov      w9, #0x89e3
    movk     w9, #0x5025, lsl #16
    str      w9, [x8]
    b        #0x25c238
    ldur     x8, [x29, #-0xe8]
    mov      w9, #0x9b99
    movk     w9, #0x94a5, lsl #16
    str      w9, [x8]
    b        #0x25c238
    adrp     x8, #0x57f000
    add      x8, x8, #0xa44
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x10
    mov      sp, x8
    adrp     x8, #0x4c4000
    ldr      x25, [x8, #0xc0]
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x5b8]
    sub      x8, x29, #0x10
    ldur     x19, [x8, #-0x100]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x25
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5c0]
    mov      x0, x19
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x19
    mov      w19, #0x1374
    movk     w19, #0xfbbd, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x540]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x26
    ldur     x26, [x29, #-0x100]
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      w25, #0x14b1
    movk     w25, #0x9e52, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x818]
    mov      x0, x27
    sub      x8, x29, #8
    ldur     x27, [x8, #-0x100]
    adrp     x2, #0x522000
    add      x2, x2, #0xab0
    bl       #0x461c6c // _objc_msgSend
    ldur     x8, [x29, #-0xe8]
    mov      w9, #0xb17b
    movk     w9, #0x59ba, lsl #16
    str      w9, [x8]
    b        #0x25c238
    ldur     d0, [x29, #-0xc0]
    stur     d0, [x29, #-0xd8]
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xf30]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xf34]
    mul      w8, w8, w9
    mov      w9, #0x4304
    movk     w9, #0x15b7, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x868
    movk     w9, #0x5ae2, lsl #16
    mul      w8, w8, w9
    mov      w9, #0xd14f
    movk     w9, #0xb813, lsl #16
    eor      w8, w8, w9
    mov      w9, #0xdf0b
    movk     w9, #0x8e1d, lsl #16
    cmp      w8, w9
    mov      w8, #0xd208
    movk     w8, #0xcf27, lsl #16
    mov      w9, #0x57f4
    movk     w9, #0x26a0, lsl #16
    csel     w8, w8, w9, hi
    b        #0x25d280
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xf20]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xf24]
    eor      w8, w8, w9
    mov      w9, #0x22e6
    movk     w9, #0x8ba9, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x2a5c
    movk     w9, #0x8ce2, lsl #16
    cmp      w8, w9
    mov      w8, #0x4c80
    movk     w8, #0x73fd, lsl #16
    mov      w9, #0x8c4e
    movk     w9, #0xb26f, lsl #16
    csel     w8, w9, w8, hi
    b        #0x25d280
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xed8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xedc]
    orr      w8, w8, w9
    mov      w9, #0xb48
    orr      w8, w8, w9
    eor      w8, w8, #0x3fe00000
    mov      w9, #0x2f48
    movk     w9, #0xd024, lsl #16
    and      w25, w8, w9
    ldur     x1, [x29, #-0x90]
    ldur     x0, [x29, #-0xd0]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #8
    cset     w8, eq
    sturb    w8, [x29, #-0x91]
    mov      w8, #0x6243
    movk     w8, #0x7d56, lsl #16
    cmp      w25, w8
    mov      w25, #0x14b1
    movk     w25, #0x9e52, lsl #16
    mov      w8, #0x4864
    movk     w8, #0xc71b, lsl #16
    mov      w9, #0xa0a7
    movk     w9, #0x1e73, lsl #16
    csel     w8, w8, w9, lo
    b        #0x25d280
    ldur     x8, [x29, #-0x78]
    ldrb     w8, [x8]
    ucvtf    d0, x8
    fdiv     d0, d0, d8
    str      d0, [x27]
    ldur     x8, [x29, #-0xe8]
    mov      w9, #0xab21
    movk     w9, #0xd29d, lsl #16
    str      w9, [x8]
    b        #0x25c238
    cmp      x27, #0
    mov      w8, #0xab21
    movk     w8, #0xd29d, lsl #16
    mov      w9, #0x5ba1
    movk     w9, #0xc6f6, lsl #16
    csel     w8, w8, w9, eq
    ldur     x9, [x29, #-0xe8]
    str      w8, [x9]
    b        #0x25c238
    ldur     d0, [x29, #-0xd8]
    str      d0, [x26]
    ldur     x8, [x29, #-0xe8]
    mov      w9, #0x57f4
    movk     w9, #0x26a0, lsl #16
    str      w9, [x8]
    b        #0x25c238
    mov      w9, #0xd845
    movk     w9, #0x76a9, lsl #16
    cmp      w8, w9
    b.ne     #0x25c238
    ldurb    w19, [x29, #-0xc1]
    ldur     x0, [x29, #-0xd0]
    bl       #0x461c9c // _objc_release
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

// -[WCLGColorPickerViewController hexEditingDidEnd:] IMP=0x25D2EC bounds=0x25D2EC-0x25D474
loc_25D2EC:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      x19, x0
    mov      w20, #0xa7f
    movk     w20, #0xfc3e, lsl #16
    stp      xzr, xzr, [sp, #0x30]
    mov      x8, #0x3ff0000000000000
    stp      x8, xzr, [sp, #0x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x7a0]
    mov      x0, x2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    str      x0, [sp, #0x18]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd40]
    add      x3, sp, #0x38
    add      x4, sp, #0x30
    add      x5, sp, #0x28
    add      x6, sp, #0x20
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      w21, #0x877c
    movk     w21, #0xc481, lsl #16
    strb     w0, [sp, #0x17]
    str      w21, [sp, #0x10]
    add      x8, sp, #0x10
    mov      w22, #0x86b9
    movk     w22, #0xb636, lsl #16
    adrp     x23, #0x4c0000
    adrp     x24, #0x4c0000
    str      x8, [sp, #8]
    adrp     x25, #0x4c0000
    adrp     x26, #0x4be000
    adrp     x27, #0x4c0000
    adrp     x28, #0x4c0000
    ldr      w8, [sp, #0x10]
    cmp      w8, w22
    b.eq     #0x25d3dc
    cmp      w8, w21
    b.eq     #0x25d3bc
    cmp      w8, w20
    b.ne     #0x25d39c
    b        #0x25d444
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    ldrb     w8, [sp, #0x17]
    cmp      w8, #0
    csel     w8, w22, w20, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x25d39c
    ldr      d0, [sp, #0x38]
    ldr      x1, [x23, #0x990]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      d0, [sp, #0x30]
    ldr      x1, [x24, #0x998]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      d0, [sp, #0x28]
    ldr      x1, [x25, #0x9a0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      d0, [sp, #0x20]
    ldr      x1, [x26, #0x9c8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x27, #0x938]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [x28, #0x9a8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    str      w20, [x8]
    b        #0x25d39c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc58]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    ret      

// -[WCLGColorPickerViewController numberFieldEditingDidEnd:] IMP=0x25D474 bounds=0x25D474-0x25D860
loc_25D474:
    sub      sp, sp, #0xa0
    stp      d9, d8, [sp, #0x30]
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      x20, x2
    mov      x19, x0
    mov      w22, #0x691
    movk     w22, #0x6dbc, lsl #16
    mov      w25, #0x47bb
    movk     w25, #0x5ec7, lsl #16
    mov      w24, #0xbb63
    movk     w24, #0x2e62, lsl #16
    str      wzr, [sp, #0x2c]
    mov      w8, #0x3f45
    movk     w8, #0x4094, lsl #16
    str      w8, [sp, #0x10]
    add      x8, sp, #0x10
    str      x8, [sp, #8]
    mov      w26, #0xa7bb
    movk     w26, #0xf6f, lsl #16
    mov      w27, #0x305c
    movk     w27, #0xbda8, lsl #16
    mov      w23, #0xa7bc
    movk     w23, #0xf6f, lsl #16
    mov      w28, #0x3f44
    movk     w28, #0x4094, lsl #16
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x4d0]
    ldr      w8, [sp, #0x10]
    cmp      w8, w26
    b.le     #0x25d5ac
    cmp      w8, w28
    b.le     #0x25d5ec
    mov      w9, #0x3f45
    movk     w9, #0x4094, lsl #16
    cmp      w8, w9
    b.eq     #0x25d7dc
    cmp      w8, w22
    b.ne     #0x25d804
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xf58]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xf5c]
    mul      w8, w8, w9
    lsr      w8, w8, #5
    mov      w9, #0xf4d3
    movk     w9, #0x819, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x36
    ldr      x9, [sp, #0x20]
    bic      x9, x9, x9, asr #63
    cmp      x9, #0xff
    mov      w10, #0xff
    csel     x9, x9, x10, lt
    ucvtf    d0, x9
    mov      w9, #0xc4b8
    movk     w9, #0x7704, lsl #16
    orr      w21, w8, w9
    fdiv     d0, d0, d8
    ldr      x8, [sp, #0x18]
    adrp     x9, #0x4a2000
    add      x9, x9, #0xe08
    ldr      x8, [x9, x8, lsl #3]
    ldr      x1, [x8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      w8, #0xc1d4
    movk     w8, #0x1cc0, lsl #16
    cmp      w21, w8
    mov      w8, #0x30ba
    movk     w8, #0xce1f, lsl #16
    csel     w8, w8, w22, hi
    b        #0x25d7f8
    cmp      w8, w27
    b.gt     #0x25d6c4
    mov      w9, #0x3b13
    movk     w9, #0xa383, lsl #16
    cmp      w8, w9
    b.eq     #0x25d734
    mov      w9, #0x3bcd
    movk     w9, #0xb2f7, lsl #16
    cmp      w8, w9
    b.ne     #0x25d4f8
    ldrb     w8, [sp, #0x17]
    cmp      w8, #0
    mov      w8, #0x305d
    movk     w8, #0xbda8, lsl #16
    csel     w8, w8, w25, ne
    b        #0x25d7f8
    cmp      w8, w23
    b.eq     #0x25d6f0
    cmp      w8, w24
    b.ne     #0x25d4f8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xf48]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xf4c]
    orr      w8, w8, w9
    mov      w9, #0xf9f2
    movk     w9, #0xa676, lsl #16
    add      w8, w8, w9
    mov      w9, #0xeb77
    movk     w9, #0x752b, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x9efd
    movk     w9, #0x4414, lsl #16
    add      w25, w8, w9
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x7a0]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4e8]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x20]
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x470]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    sub      x8, x21, #1
    str      x8, [sp, #0x18]
    cmp      x8, #4
    cset     w8, lo
    strb     w8, [sp, #0x17]
    mov      w8, #0x831c
    movk     w8, #0x9cd6, lsl #16
    cmp      w25, w8
    mov      w25, #0x47bb
    movk     w25, #0x5ec7, lsl #16
    mov      w8, #0x3bcd
    movk     w8, #0xb2f7, lsl #16
    csel     w8, w24, w8, hi
    b        #0x25d7f8
    mov      w9, #0x305d
    movk     w9, #0xbda8, lsl #16
    cmp      w8, w9
    b.eq     #0x25d790
    mov      w9, #0x30ba
    movk     w9, #0xce1f, lsl #16
    cmp      w8, w9
    b.ne     #0x25d4f8
    ldr      x8, [sp, #8]
    str      w25, [x8]
    b        #0x25d4f8
    ldr      x8, [sp, #0x20]
    bic      x8, x8, x8, asr #63
    cmp      x8, #0xff
    mov      w9, #0xff
    csel     x8, x8, x9, lt
    ucvtf    d0, x8
    fdiv     d0, d0, d8
    ldr      x8, [sp, #0x18]
    adrp     x9, #0x4a2000
    add      x9, x9, #0xe08
    ldr      x8, [x9, x8, lsl #3]
    ldr      x1, [x8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    str      w22, [x8]
    b        #0x25d4f8
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x7a0]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4e8]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x470]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w24, [x8]
    b        #0x25d4f8
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xf50]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xf54]
    mul      w8, w8, w9
    mov      w9, #0xa209
    movk     w9, #0x61b, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x672
    movk     w9, #0xaf44, lsl #16
    add      w8, w8, w9
    mov      w9, #0x93fa
    movk     w9, #0xb09a, lsl #16
    and      w8, w8, w9
    mov      w9, #0x803
    movk     w9, #0x5438, lsl #16
    cmp      w8, w9
    csel     w8, w23, w22, eq
    b        #0x25d7f8
    ldr      w8, [sp, #0x2c]
    mov      w9, #0x8f1f
    movk     w9, #0xade9, lsl #16
    cmp      w8, w9
    mov      w8, #0x3b13
    movk     w8, #0xa383, lsl #16
    csel     w8, w8, w24, hi
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x25d4f8
    cmp      w8, w25
    b.ne     #0x25d4f8
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x938]
    mov      x0, x19
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9a8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xc58]
    mov      x0, x19
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    ldp      d9, d8, [sp, #0x30]
    add      sp, sp, #0xa0
    b        #0x461c6c // _objc_msgSend

// -[WCLGColorPickerViewController textFieldShouldReturn:] IMP=0x25D860 bounds=0x25D860-0x25D884
loc_25D860:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    mov      x0, x2
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd48]
    bl       #0x461c6c // _objc_msgSend
    mov      w0, #1
    ldp      x29, x30, [sp], #0x10
    ret      

// -[WCLGColorPickerViewController outgoing] IMP=0x25D884 bounds=0x25D884-0x25D894
loc_25D884:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa78]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setOutgoing:] IMP=0x25D894 bounds=0x25D894-0x25D9B8
loc_25D894:
    sub      sp, sp, #0x10
    mov      w8, #0x705a
    movk     w8, #0xa374, lsl #16
    mov      w9, #0xc2da
    movk     w9, #0x9688, lsl #16
    adrp     x10, #0x522000
    ldr      w10, [x10, #0xf60]
    adrp     x11, #0x522000
    ldr      w11, [x11, #0xf64]
    add      w10, w10, w11
    mov      w11, #0x80df
    movk     w11, #0x132d, lsl #16
    and      w10, w10, w11
    mov      w11, #0x78c8
    movk     w11, #0xfdb6, lsl #16
    mov      w12, #0x82e1
    movk     w12, #0xc0a4, lsl #16
    madd     w10, w10, w11, w12
    str      w10, [sp, #0xc]
    mov      w10, #0x9c42
    movk     w10, #0x90b, lsl #16
    str      w10, [sp, #8]
    add      x11, sp, #8
    str      x11, [sp]
    mov      w11, #0x253d
    movk     w11, #0x80d, lsl #16
    adrp     x12, #0x4c4000
    adrp     x13, #0x522000
    adrp     x14, #0x522000
    mov      w15, #0xe92d
    movk     w15, #0x262a, lsl #16
    mov      w16, #0xffb3
    movk     w16, #0xfff6, lsl #16
    mov      w17, #0xc1e6
    movk     w17, #0x945, lsl #16
    mov      w1, #0x253e
    movk     w1, #0x80d, lsl #16
    mov      w3, #0x962d
    movk     w3, #0x88ed, lsl #16
    ldr      w4, [sp, #8]
    cmp      w4, w11
    b.gt     #0x25d974
    cmp      w4, w9
    b.eq     #0x25d994
    cmp      w4, w8
    b.ne     #0x25d930
    ldr      w4, [x13, #0xf68]
    ldr      w5, [x14, #0xf6c]
    and      w4, w4, w5
    add      w4, w4, w15
    orr      w4, w4, w16
    ldrsw    x5, [x12, #0xa78]
    strb     w2, [x0, x5]
    cmp      w4, w17
    csel     w4, w1, w9, hi
    b        #0x25d988
    cmp      w4, w10
    b.ne     #0x25d9a8
    ldr      w4, [sp, #0xc]
    cmp      w4, w3
    csel     w4, w9, w8, eq
    ldr      x5, [sp]
    str      w4, [x5]
    b        #0x25d930
    ldrsw    x4, [x12, #0xa78]
    strb     w2, [x0, x4]
    ldr      x4, [sp]
    str      w8, [x4]
    b        #0x25d930
    cmp      w4, w1
    b.ne     #0x25d930
    add      sp, sp, #0x10
    ret      

// -[WCLGColorPickerViewController purpose] IMP=0x25D9B8 bounds=0x25D9B8-0x25D9C8
loc_25D9B8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa74]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setPurpose:] IMP=0x25D9C8 bounds=0x25D9C8-0x25DAEC
loc_25D9C8:
    sub      sp, sp, #0x10
    mov      w8, #0x6de5
    movk     w8, #0x716e, lsl #16
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xf70]
    adrp     x10, #0x522000
    ldr      w10, [x10, #0xf74]
    orr      w9, w9, w10
    mov      w10, #0x3aed
    movk     w10, #0xa421, lsl #16
    add      w9, w9, w10
    mov      w10, #0x8c5d
    movk     w10, #0x6304, lsl #16
    orr      w9, w9, w10
    mov      w10, #0xefd2
    movk     w10, #0x7889, lsl #16
    mul      w11, w9, w10
    mov      w9, #0xd895
    movk     w9, #0x51b0, lsl #16
    stp      w9, w11, [sp, #8]
    add      x10, sp, #8
    str      x10, [sp]
    mov      w10, #0x6de4
    movk     w10, #0x716e, lsl #16
    mov      w11, #0x4bbf
    movk     w11, #0x47ff, lsl #16
    mov      w12, #0x8747
    movk     w12, #0x730b, lsl #16
    mov      w13, #0x84d6
    movk     w13, #0xe483, lsl #16
    adrp     x14, #0x522000
    adrp     x15, #0x522000
    mov      w16, #0xd8c8
    movk     w16, #0xe5e2, lsl #16
    mov      w17, #0x86
    movk     w17, #0x420, lsl #16
    adrp     x1, #0x4c4000
    mov      w3, #0xcd94
    movk     w3, #0xb848, lsl #16
    ldr      w4, [sp, #8]
    cmp      w4, w10
    b.le     #0x25da94
    cmp      w4, w8
    b.eq     #0x25daac
    cmp      w4, w12
    b.ne     #0x25da64
    ldrsw    x4, [x1, #0xa74]
    str      x2, [x0, x4]
    ldr      x4, [sp]
    str      w8, [x4]
    b        #0x25da64
    cmp      w4, w9
    b.ne     #0x25dadc
    ldr      w4, [sp, #0xc]
    cmp      w4, w11
    csel     w4, w12, w8, lo
    b        #0x25dad0
    ldr      w4, [x14, #0xf78]
    ldr      w5, [x15, #0xf7c]
    orr      w4, w4, w5
    add      w4, w4, w16
    and      w4, w4, w17
    ldrsw    x5, [x1, #0xa74]
    str      x2, [x0, x5]
    cmp      w4, w3
    csel     w4, w8, w13, hi
    ldr      x5, [sp]
    str      w4, [x5]
    b        #0x25da64
    cmp      w4, w13
    b.ne     #0x25da64
    add      sp, sp, #0x10
    ret      

// -[WCLGColorPickerViewController selectionHandler] IMP=0x25DAEC bounds=0x25DAEC-0x25DBF8
loc_25DAEC:
    sub      sp, sp, #0x20
    mov      w8, #0xc2ac
    movk     w8, #0xe0a5, lsl #16
    mov      w9, #0xbe4f
    movk     w9, #0xa03, lsl #16
    mov      w10, #0x7339
    movk     w10, #0x3e75, lsl #16
    str      w10, [sp, #0x1c]
    mov      w10, #0xa05c
    movk     w10, #0x498f, lsl #16
    str      w10, [sp, #0xc]
    add      x11, sp, #0xc
    str      x11, [sp]
    mov      w11, #0xbe4e
    movk     w11, #0xa03, lsl #16
    adrp     x12, #0x522000
    adrp     x13, #0x522000
    mov      w14, #0x9df8
    movk     w14, #0xfc0a, lsl #16
    mov      w15, #0xaa75
    movk     w15, #0xad72, lsl #16
    mov      w16, #0xbff2
    movk     w16, #0xb6c2, lsl #16
    adrp     x17, #0x4c4000
    mov      w1, #0xd0a1
    movk     w1, #0x3a7e, lsl #16
    mov      w2, #0x1ef3
    movk     w2, #0xaf69, lsl #16
    mov      w3, #0x3f66
    movk     w3, #0x5c30, lsl #16
    ldr      w4, [sp, #0xc]
    cmp      w4, w11
    b.le     #0x25db90
    cmp      w4, w9
    b.eq     #0x25dbd8
    cmp      w4, w10
    b.ne     #0x25db64
    ldr      w4, [sp, #0x1c]
    cmp      w4, w3
    csel     w4, w9, w8, eq
    b        #0x25dbcc
    cmp      w4, w8
    b.ne     #0x25dbe4
    ldr      w4, [x12, #0xf88]
    ldr      w5, [x13, #0xf8c]
    orr      w4, w4, w5
    add      w4, w4, w14
    lsr      w4, w4, #1
    umull    x4, w4, w15
    lsr      x4, x4, #0x3e
    ldrsw    x5, [x17, #0xa7c]
    ldr      x5, [x0, x5]
    orr      w4, w4, w16
    str      x5, [sp, #0x10]
    cmp      w4, w1
    csel     w4, w2, w9, hi
    ldr      x5, [sp]
    str      w4, [x5]
    b        #0x25db64
    ldr      x4, [sp]
    str      w8, [x4]
    b        #0x25db64
    cmp      w4, w2
    b.ne     #0x25db64
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGColorPickerViewController setSelectionHandler:] IMP=0x25DBF8 bounds=0x25DBF8-0x25DC04
loc_25DBF8:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xa7c]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGColorPickerViewController dualSelectionHandler] IMP=0x25DC04 bounds=0x25DC04-0x25DC14
loc_25DC04:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa90]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setDualSelectionHandler:] IMP=0x25DC14 bounds=0x25DC14-0x25DC20
loc_25DC14:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xa90]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGColorPickerViewController backgroundView] IMP=0x25DC20 bounds=0x25DC20-0x25DD54
loc_25DC20:
    sub      sp, sp, #0x20
    mov      w8, #0xbdf1
    movk     w8, #0x6338, lsl #16
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xf90]
    adrp     x10, #0x522000
    ldr      w10, [x10, #0xf94]
    orr      w9, w9, w10
    mov      w10, #0xf78f
    movk     w10, #0xd92f, lsl #16
    mul      w9, w9, w10
    mov      w10, #0x21010000
    eor      w9, w9, w10
    mov      w10, #0xc382
    movk     w10, #0x6f07, lsl #16
    and      w9, w9, w10
    str      w9, [sp, #0x1c]
    mov      w9, #0x7c7a
    movk     w9, #0x43af, lsl #16
    str      w9, [sp, #0xc]
    add      x10, sp, #0xc
    str      x10, [sp]
    mov      w10, #0x7c79
    movk     w10, #0x43af, lsl #16
    mov      w11, #0xe5f3
    movk     w11, #0x83b9, lsl #16
    mov      w12, #0xe12f
    movk     w12, #0x15f4, lsl #16
    adrp     x13, #0x522000
    adrp     x14, #0x522000
    mov      w15, #0x5cff
    movk     w15, #0x1976, lsl #16
    mov      w16, #0x8beb
    movk     w16, #0x59, lsl #16
    mov      w17, #0x1c2f
    movk     w17, #0x146c, lsl #16
    adrp     x1, #0x4c4000
    mov      w2, #0xfb0f
    movk     w2, #0x2416, lsl #16
    mov      w3, #0xec2b
    movk     w3, #0x2950, lsl #16
    ldr      w4, [sp, #0xc]
    cmp      w4, w10
    b.le     #0x25dcf0
    cmp      w4, w8
    b.eq     #0x25dd04
    cmp      w4, w9
    b.ne     #0x25dcc4
    ldr      w4, [sp, #0x1c]
    cmp      w4, w3
    csel     w4, w11, w8, hi
    b        #0x25dd34
    cmp      w4, w11
    b.ne     #0x25dd40
    ldr      x4, [sp]
    str      w8, [x4]
    b        #0x25dcc4
    ldr      w4, [x13, #0xf98]
    ldr      w5, [x14, #0xf9c]
    and      w4, w4, w5
    umull    x4, w4, w15
    lsr      x4, x4, #0x3a
    add      w4, w4, w16
    ldrsw    x5, [x1, #0xab0]
    ldr      x5, [x0, x5]
    eor      w4, w4, w17
    str      x5, [sp, #0x10]
    cmp      w4, w2
    csel     w4, w12, w8, lo
    ldr      x5, [sp]
    str      w4, [x5]
    b        #0x25dcc4
    cmp      w4, w12
    b.ne     #0x25dcc4
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGColorPickerViewController setBackgroundView:] IMP=0x25DD54 bounds=0x25DD54-0x25DD68
loc_25DD54:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xab0]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGColorPickerViewController scrollView] IMP=0x25DD68 bounds=0x25DD68-0x25DD78
loc_25DD68:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xab4]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setScrollView:] IMP=0x25DD78 bounds=0x25DD78-0x25DD8C
loc_25DD78:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xab4]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGColorPickerViewController contentView] IMP=0x25DD8C bounds=0x25DD8C-0x25DD9C
loc_25DD8C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xab8]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setContentView:] IMP=0x25DD9C bounds=0x25DD9C-0x25DF04
loc_25DD9C:
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
    mov      w21, #0x1341
    movk     w21, #0x7787, lsl #16
    mov      w22, #0x7cb3
    movk     w22, #0x6c3a, lsl #16
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xfa0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xfa4]
    sub      w8, w8, w9
    mov      w9, #0x6d64
    movk     w9, #0x9e61, lsl #16
    mov      w10, #0x1edc
    movk     w10, #0x827c, lsl #16
    madd     w8, w8, w9, w10
    mov      w23, #0x7229
    movk     w23, #0xbbc7, lsl #16
    stp      w23, w8, [sp, #8]
    add      x8, sp, #8
    str      x8, [sp]
    mov      w24, #0x7cb2
    movk     w24, #0x6c3a, lsl #16
    mov      w26, #0x3eb4
    movk     w26, #0x1e41, lsl #16
    adrp     x27, #0x4c4000
    mov      w25, #0x8105
    movk     w25, #0x2af9, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w24
    b.le     #0x25de98
    cmp      w8, w22
    b.eq     #0x25dec0
    cmp      w8, w21
    b.ne     #0x25de2c
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xfa8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xfac]
    orr      w8, w8, w9
    mov      w9, #0xee53
    movk     w9, #0x7b1a, lsl #16
    and      w8, w8, w9
    mov      w9, #0x12ef
    movk     w9, #0xed43, lsl #16
    mov      w10, #0x66b3
    movk     w10, #0xb5d9, lsl #16
    madd     w28, w8, w9, w10
    ldrsw    x8, [x27, #0xab8]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    cmp      w28, w25
    csel     w8, w22, w26, lo
    b        #0x25deb4
    cmp      w8, w23
    b.ne     #0x25dedc
    ldr      w8, [sp, #0xc]
    mov      w9, #0x4c6d
    movk     w9, #0xc05f, lsl #16
    cmp      w8, w9
    csel     w8, w21, w22, hi
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x25de2c
    ldrsw    x8, [x27, #0xab8]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x25de2c
    cmp      w8, w26
    b.ne     #0x25de2c
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    add      sp, sp, #0x70
    ret      

// -[WCLGColorPickerViewController pickerHeaderLabel] IMP=0x25DF04 bounds=0x25DF04-0x25DF14
loc_25DF04:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xabc]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setPickerHeaderLabel:] IMP=0x25DF14 bounds=0x25DF14-0x25DF28
loc_25DF14:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xabc]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGColorPickerViewController paletteHeaderLabel] IMP=0x25DF28 bounds=0x25DF28-0x25E028
loc_25DF28:
    sub      sp, sp, #0x20
    mov      w8, #0x9996
    movk     w8, #0xcb2e, lsl #16
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xfb0]
    adrp     x10, #0x522000
    ldr      w10, [x10, #0xfb4]
    udiv     w9, w9, w10
    mov      w10, #0x9d11
    movk     w10, #0x599, lsl #16
    mov      w11, #0x4400
    movk     w11, #0x1bbc, lsl #16
    madd     w10, w9, w10, w11
    mov      w9, #0x5f87
    movk     w9, #0xdd6d, lsl #16
    add      x14, sp, #0xc
    str      w10, [sp, #0x1c]
    mov      w10, #0x5a2d
    movk     w10, #0x10a9, lsl #16
    adrp     x11, #0x522000
    adrp     x12, #0x522000
    adrp     x13, #0x4c4000
    str      w9, [sp, #0xc]
    str      x14, [sp]
    mov      w14, #0x6fa7
    movk     w14, #0xd437, lsl #16
    mov      w15, #0xa49d
    movk     w15, #0x197e, lsl #16
    mov      w16, #0x7258
    movk     w16, #0x1555, lsl #16
    mov      w17, #0x5a2e
    movk     w17, #0x10a9, lsl #16
    ldr      w1, [sp, #0xc]
    cmp      w1, w10
    b.gt     #0x25dfd4
    cmp      w1, w8
    b.eq     #0x25dfe8
    cmp      w1, w9
    b.ne     #0x25dfa8
    ldr      w1, [sp, #0x1c]
    cmp      w1, w16
    csel     w1, w17, w8, eq
    b        #0x25e008
    cmp      w1, w17
    b.ne     #0x25e014
    ldr      x1, [sp]
    str      w8, [x1]
    b        #0x25dfa8
    ldr      w1, [x11, #0xfb8]
    ldr      w2, [x12, #0xfbc]
    ldrsw    x3, [x13, #0xac0]
    ldr      x3, [x0, x3]
    eor      w1, w1, w2
    str      x3, [sp, #0x10]
    cmp      w1, w14
    csel     w1, w8, w15, eq
    ldr      x2, [sp]
    str      w1, [x2]
    b        #0x25dfa8
    cmp      w1, w15
    b.ne     #0x25dfa8
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGColorPickerViewController setPaletteHeaderLabel:] IMP=0x25E028 bounds=0x25E028-0x25E1A8
loc_25E028:
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
    mov      w21, #0x4f6e
    movk     w21, #0xd112, lsl #16
    mov      w22, #0x9d73
    movk     w22, #0x78e7, lsl #16
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xfc0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xfc4]
    udiv     w8, w8, w9
    mov      w9, #0xc029
    movk     w9, #0xf04, lsl #16
    umull    x9, w8, w9
    lsr      x9, x9, #0x20
    sub      w8, w8, w9
    add      w8, w9, w8, lsr #1
    mov      w9, #0xda20
    movk     w9, #0xd699, lsl #16
    bfxil    w9, w8, #0x1f, #1
    mov      w8, #0xdd43
    movk     w8, #0xf45b, lsl #16
    umull    x8, w9, w8
    lsr      x8, x8, #0x3e
    mov      w23, #0x55a2
    movk     w23, #0xe705, lsl #16
    add      x9, sp, #8
    mov      w24, #0x55a1
    movk     w24, #0xe705, lsl #16
    stp      w23, w8, [sp, #8]
    str      x9, [sp]
    adrp     x25, #0x4c4000
    mov      w27, #0x59f1
    movk     w27, #0x9809, lsl #16
    mov      w28, #0x2261
    movk     w28, #0x38e3, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w24
    b.le     #0x25e104
    cmp      w8, w22
    b.eq     #0x25e164
    cmp      w8, w23
    b.ne     #0x25e0d8
    ldr      w8, [sp, #0xc]
    cmp      w8, w28
    csel     w8, w21, w22, lo
    b        #0x25e158
    cmp      w8, w21
    b.ne     #0x25e180
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xfc8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xfcc]
    mul      w8, w8, w9
    mov      w9, #0x292d
    movk     w9, #0x573e, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3e
    mov      w9, #-0xe
    orr      w26, w8, w9
    ldrsw    x8, [x25, #0xac0]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    mov      w8, #0x614a
    movk     w8, #0xfe9a, lsl #16
    cmp      w26, w8
    csel     w8, w22, w27, lo
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x25e0d8
    ldrsw    x8, [x25, #0xac0]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x25e0d8
    cmp      w8, w27
    b.ne     #0x25e0d8
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    add      sp, sp, #0x70
    ret      

// -[WCLGColorPickerViewController commonHeaderLabel] IMP=0x25E1A8 bounds=0x25E1A8-0x25E2B4
loc_25E1A8:
    sub      sp, sp, #0x20
    mov      w8, #0xd400
    movk     w8, #0x1bae, lsl #16
    mov      w9, #0xe369
    movk     w9, #0xf1d, lsl #16
    adrp     x10, #0x522000
    ldr      w10, [x10, #0xfd0]
    adrp     x11, #0x522000
    ldr      w11, [x11, #0xfd4]
    mov      w12, #0xfb04
    movk     w12, #0x8c12, lsl #16
    madd     w10, w10, w11, w12
    mov      w11, #0x2020
    movk     w11, #0x4628, lsl #16
    orr      w10, w10, w11
    mov      w11, #0x3220
    movk     w11, #0xd628, lsl #16
    and      w10, w10, w11
    str      w10, [sp, #0x1c]
    mov      w10, #0xe7b8
    movk     w10, #0xead2, lsl #16
    str      w10, [sp, #0xc]
    add      x11, sp, #0xc
    str      x11, [sp]
    mov      w11, #0xd3ff
    movk     w11, #0x1bae, lsl #16
    mov      w12, #0x3039
    movk     w12, #0x6647, lsl #16
    adrp     x13, #0x522000
    adrp     x14, #0x522000
    adrp     x15, #0x4c4000
    mov      w16, #0x31e5
    movk     w16, #0x733d, lsl #16
    mov      w17, #0x3326
    movk     w17, #0x7b70, lsl #16
    ldr      w1, [sp, #0xc]
    cmp      w1, w11
    b.gt     #0x25e274
    cmp      w1, w10
    b.eq     #0x25e288
    cmp      w1, w9
    b.ne     #0x25e234
    ldr      w1, [x13, #0xfd8]
    ldr      w2, [x14, #0xfdc]
    ldrsw    x3, [x15, #0xac4]
    ldr      x3, [x0, x3]
    mul      w1, w1, w2
    str      x3, [sp, #0x10]
    cmp      w1, w16
    csel     w1, w8, w17, eq
    b        #0x25e294
    cmp      w1, w8
    b.ne     #0x25e2a0
    ldr      x1, [sp]
    str      w9, [x1]
    b        #0x25e234
    ldr      w1, [sp, #0x1c]
    cmp      w1, w12
    csel     w1, w9, w8, lo
    ldr      x2, [sp]
    str      w1, [x2]
    b        #0x25e234
    cmp      w1, w17
    b.ne     #0x25e234
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGColorPickerViewController setCommonHeaderLabel:] IMP=0x25E2B4 bounds=0x25E2B4-0x25E2C8
loc_25E2B4:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xac4]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGColorPickerViewController controlCard] IMP=0x25E2C8 bounds=0x25E2C8-0x25E2D8
loc_25E2C8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xac8]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setControlCard:] IMP=0x25E2D8 bounds=0x25E2D8-0x25E2EC
loc_25E2D8:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xac8]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGColorPickerViewController paletteCard] IMP=0x25E2EC bounds=0x25E2EC-0x25E2FC
loc_25E2EC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xacc]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setPaletteCard:] IMP=0x25E2FC bounds=0x25E2FC-0x25E47C
loc_25E2FC:
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
    mov      w21, #0x6716
    movk     w21, #0x13dc, lsl #16
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xfe0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xfe4]
    eor      w8, w8, w9
    mov      w9, #0xe6ac
    movk     w9, #0x65c6, lsl #16
    eor      w8, w8, w9
    mov      w9, #0xc5a7
    movk     w9, #0x7d6e, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3e
    mov      w9, #0x6233
    movk     w9, #0x8ab9, lsl #16
    add      w8, w8, w9
    mov      w22, #0xdc24
    movk     w22, #0xc0cf, lsl #16
    stp      w22, w8, [sp, #8]
    add      x8, sp, #8
    str      x8, [sp]
    mov      w23, #0x6715
    movk     w23, #0x13dc, lsl #16
    mov      w25, #0x5c59
    movk     w25, #0x6a49, lsl #16
    mov      w26, #0x8dab
    movk     w26, #0xb917, lsl #16
    adrp     x24, #0x4c4000
    mov      w27, #0xbad3
    movk     w27, #0xf460, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w23
    b.le     #0x25e3d8
    cmp      w8, w21
    b.eq     #0x25e3f8
    cmp      w8, w25
    b.ne     #0x25e3a0
    ldrsw    x8, [x24, #0xacc]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x25e3a0
    cmp      w8, w22
    b.ne     #0x25e454
    ldr      w8, [sp, #0xc]
    mov      w9, #0x496e
    movk     w9, #0x2942, lsl #16
    cmp      w8, w9
    csel     w8, w21, w25, hi
    b        #0x25e448
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xfe8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xfec]
    orr      w8, w8, w9
    mov      w9, #0x80c4
    movk     w9, #0x9001, lsl #16
    orr      w8, w8, w9
    mov      w9, #0xe3c7
    movk     w9, #0x9a23, lsl #16
    and      w8, w8, w9
    mov      w9, #0x2964
    movk     w9, #0xdc48, lsl #16
    eor      w28, w8, w9
    ldrsw    x8, [x24, #0xacc]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    cmp      w28, w27
    csel     w8, w21, w26, hi
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x25e3a0
    cmp      w8, w26
    b.ne     #0x25e3a0
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    add      sp, sp, #0x70
    ret      

// -[WCLGColorPickerViewController commonCard] IMP=0x25E47C bounds=0x25E47C-0x25E48C
loc_25E47C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xad0]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setCommonCard:] IMP=0x25E48C bounds=0x25E48C-0x25E5F4
loc_25E48C:
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
    mov      w21, #0x261b
    movk     w21, #0x2d84, lsl #16
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xff0]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xff4]
    orr      w8, w8, w9
    mov      w9, #0x815
    movk     w9, #0xf35a, lsl #16
    add      w8, w8, w9
    mov      w9, #0x80f1
    movk     w9, #0x2c86, lsl #16
    and      w8, w8, w9
    mov      w22, #0xfbd3
    movk     w22, #0x1c7, lsl #16
    stp      w22, w8, [sp, #8]
    add      x8, sp, #8
    str      x8, [sp]
    mov      w23, #0xfbd2
    movk     w23, #0x1c7, lsl #16
    mov      w24, #0x6d92
    movk     w24, #0x8c8c, lsl #16
    adrp     x25, #0x4c4000
    mov      w26, #0x2cd
    movk     w26, #0xa283, lsl #16
    mov      w28, #0x8ab9
    movk     w28, #0x1644, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w23
    b.le     #0x25e54c
    cmp      w8, w21
    b.eq     #0x25e570
    cmp      w8, w22
    b.ne     #0x25e520
    ldr      w8, [sp, #0xc]
    cmp      w8, w28
    csel     w8, w21, w24, ne
    b        #0x25e5c0
    cmp      w8, w24
    b.ne     #0x25e5cc
    ldrsw    x8, [x25, #0xad0]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x25e520
    adrp     x8, #0x522000
    ldr      w8, [x8, #0xff8]
    adrp     x9, #0x522000
    ldr      w9, [x9, #0xffc]
    and      w8, w8, w9
    eor      w8, w8, #0xffff0003
    mov      w9, #0xf123
    movk     w9, #0x7008, lsl #16
    orr      w8, w8, w9
    mov      w9, #0xf127
    movk     w9, #0x7099, lsl #16
    and      w27, w8, w9
    ldrsw    x8, [x25, #0xad0]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    mov      w8, #0xe9c9
    movk     w8, #0x947a, lsl #16
    cmp      w27, w8
    csel     w8, w26, w21, lo
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x25e520
    cmp      w8, w26
    b.ne     #0x25e520
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    add      sp, sp, #0x70
    ret      

// -[WCLGColorPickerViewController hexLabel] IMP=0x25E5F4 bounds=0x25E5F4-0x25E604
loc_25E5F4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xad4]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setHexLabel:] IMP=0x25E604 bounds=0x25E604-0x25E77C
loc_25E604:
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
    mov      w21, #0xbc97
    movk     w21, #0x2d1d, lsl #16
    mov      w22, #0xfba1
    movk     w22, #0x148b, lsl #16
    adrp     x8, #0x523000
    ldr      w8, [x8]
    adrp     x9, #0x523000
    ldr      w9, [x9, #4]
    udiv     w8, w8, w9
    mov      w9, #0x9d36
    movk     w9, #0x2390, lsl #16
    add      w8, w8, w9
    mov      w9, #0x2594
    movk     w9, #0x83f1, lsl #16
    and      w8, w8, w9
    mov      w9, #0x1039
    movk     w9, #0x7fc1, lsl #16
    eor      w8, w8, w9
    mov      w23, #0xda0f
    movk     w23, #0x70c6, lsl #16
    add      x9, sp, #8
    mov      w24, #0x6a26
    movk     w24, #0x3504, lsl #16
    stp      w23, w8, [sp, #8]
    str      x9, [sp]
    adrp     x26, #0x4c4000
    mov      w28, #0x6a27
    movk     w28, #0x3504, lsl #16
    mov      w25, #0x3392
    movk     w25, #0xb498, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w24
    b.gt     #0x25e6dc
    cmp      w8, w22
    b.eq     #0x25e6f4
    cmp      w8, w21
    b.ne     #0x25e6a4
    ldrsw    x8, [x26, #0xad4]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x25e6a4
    cmp      w8, w23
    b.ne     #0x25e754
    ldr      w8, [sp, #0xc]
    cmp      w8, w25
    csel     w8, w22, w21, lo
    b        #0x25e748
    adrp     x8, #0x523000
    ldr      w8, [x8, #8]
    adrp     x9, #0x523000
    ldr      w9, [x9, #0xc]
    mov      w10, #0xb73d
    movk     w10, #0x9f47, lsl #16
    madd     w8, w8, w9, w10
    mov      w9, #0xd8c7
    movk     w9, #0x55d6, lsl #16
    eor      w8, w8, w9
    mov      w9, #0xd8f6
    movk     w9, #0x16a1, lsl #16
    mul      w27, w8, w9
    ldrsw    x8, [x26, #0xad4]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    mov      w8, #0xe17b
    movk     w8, #0x7fb4, lsl #16
    cmp      w27, w8
    csel     w8, w28, w21, lo
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x25e6a4
    cmp      w8, w28
    b.ne     #0x25e6a4
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    add      sp, sp, #0x70
    ret      

// -[WCLGColorPickerViewController hexHintLabel] IMP=0x25E77C bounds=0x25E77C-0x25E78C
loc_25E77C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xad8]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setHexHintLabel:] IMP=0x25E78C bounds=0x25E78C-0x25E90C
loc_25E78C:
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
    mov      w21, #0x6fd7
    movk     w21, #0xe9e9, lsl #16
    mov      w22, #0x1eb
    movk     w22, #0x7686, lsl #16
    adrp     x8, #0x523000
    ldr      w8, [x8, #0x10]
    adrp     x9, #0x523000
    ldr      w9, [x9, #0x14]
    orr      w8, w8, w9
    mov      w9, #0x10f5
    movk     w9, #0x60bc, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3e
    mov      w9, #0x7060
    movk     w9, #0x9136, lsl #16
    orr      w8, w8, w9
    mov      w23, #0xfe10
    movk     w23, #0x6846, lsl #16
    stp      w23, w8, [sp, #8]
    add      x8, sp, #8
    str      x8, [sp]
    mov      w24, #0xfe0f
    movk     w24, #0x6846, lsl #16
    adrp     x26, #0x4c4000
    mov      w28, #0xb140
    movk     w28, #0x5f37, lsl #16
    mov      w25, #0x21d3
    movk     w25, #0xf2f5, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w24
    b.le     #0x25e850
    cmp      w8, w22
    b.eq     #0x25e8c8
    cmp      w8, w23
    b.ne     #0x25e824
    ldr      w8, [sp, #0xc]
    cmp      w8, w25
    csel     w8, w22, w21, hi
    b        #0x25e8bc
    cmp      w8, w21
    b.ne     #0x25e8e4
    adrp     x8, #0x523000
    ldr      w8, [x8, #0x18]
    adrp     x9, #0x523000
    ldr      w9, [x9, #0x1c]
    eor      w8, w8, w9
    mov      w9, #0xc29b
    movk     w9, #0x2196, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x66e1
    movk     w9, #0x3ac1, lsl #16
    umull    x9, w8, w9
    lsr      x9, x9, #0x20
    sub      w8, w8, w9
    add      w8, w9, w8, lsr #1
    mov      w9, #0xb555
    movk     w9, #0x5b7a, lsl #16
    orr      w27, w9, w8, lsr #30
    ldrsw    x8, [x26, #0xad8]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    mov      w8, #0x8713
    movk     w8, #0x87b5, lsl #16
    cmp      w27, w8
    csel     w8, w22, w28, eq
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x25e824
    ldrsw    x8, [x26, #0xad8]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x25e824
    cmp      w8, w28
    b.ne     #0x25e824
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    add      sp, sp, #0x70
    ret      

// -[WCLGColorPickerViewController hexField] IMP=0x25E90C bounds=0x25E90C-0x25E91C
loc_25E90C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xadc]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setHexField:] IMP=0x25E91C bounds=0x25E91C-0x25E930
loc_25E91C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xadc]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGColorPickerViewController previewView] IMP=0x25E930 bounds=0x25E930-0x25EA64
loc_25E930:
    sub      sp, sp, #0x20
    mov      w8, #0xc557
    movk     w8, #0xd15a, lsl #16
    mov      w9, #0x7c4a
    movk     w9, #0x4be3, lsl #16
    adrp     x10, #0x523000
    ldr      w10, [x10, #0x20]
    adrp     x11, #0x523000
    ldr      w11, [x11, #0x24]
    sub      w10, w10, w11
    mov      w11, #0xa91f
    movk     w11, #0x6670, lsl #16
    umull    x10, w10, w11
    lsr      x10, x10, #0x3e
    mov      w11, #0x7efa
    movk     w11, #0xb96b, lsl #16
    orr      w10, w10, w11
    str      w10, [sp, #0x1c]
    mov      w10, #0xf2b
    movk     w10, #0xc561, lsl #16
    str      w10, [sp, #0xc]
    add      x11, sp, #0xc
    str      x11, [sp]
    mov      w11, #0x2cf1
    movk     w11, #0x46d6, lsl #16
    mov      w12, #0x78eb
    movk     w12, #0x3379, lsl #16
    adrp     x13, #0x523000
    adrp     x14, #0x523000
    mov      w15, #0x4fd1
    movk     w15, #0x76eb, lsl #16
    mov      w16, #0x2ab8
    movk     w16, #0xb27e, lsl #16
    mov      w17, #0x6f53
    movk     w17, #0xe772, lsl #16
    adrp     x1, #0x4c4000
    mov      w2, #0x5828
    movk     w2, #0xccba, lsl #16
    mov      w3, #0x2cf2
    movk     w3, #0x46d6, lsl #16
    ldr      w4, [sp, #0xc]
    cmp      w4, w11
    b.gt     #0x25ea24
    cmp      w4, w10
    b.eq     #0x25ea38
    cmp      w4, w8
    b.ne     #0x25e9d0
    ldr      w4, [x13, #0x28]
    ldr      w5, [x14, #0x2c]
    add      w4, w4, w5
    umull    x4, w4, w15
    lsr      x4, x4, #0x3e
    mul      w4, w4, w16
    umull    x4, w4, w17
    ldrsw    x5, [x1, #0xae0]
    ldr      x5, [x0, x5]
    lsr      x4, x4, #0x3e
    str      x5, [sp, #0x10]
    cmp      w4, w2
    csel     w4, w9, w3, hi
    b        #0x25ea44
    cmp      w4, w9
    b.ne     #0x25ea50
    ldr      x4, [sp]
    str      w8, [x4]
    b        #0x25e9d0
    ldr      w4, [sp, #0x1c]
    cmp      w4, w12
    csel     w4, w9, w8, lo
    ldr      x5, [sp]
    str      w4, [x5]
    b        #0x25e9d0
    cmp      w4, w3
    b.ne     #0x25e9d0
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGColorPickerViewController setPreviewView:] IMP=0x25EA64 bounds=0x25EA64-0x25EA78
loc_25EA64:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xae0]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGColorPickerViewController canvasView] IMP=0x25EA78 bounds=0x25EA78-0x25EBBC
loc_25EA78:
    sub      sp, sp, #0x20
    mov      w8, #0xa066
    movk     w8, #0x4de3, lsl #16
    adrp     x9, #0x523000
    ldr      w9, [x9, #0x30]
    adrp     x10, #0x523000
    ldr      w10, [x10, #0x34]
    orr      w9, w9, w10
    mov      w10, #0x38c1
    movk     w10, #0x45b4, lsl #16
    orr      w9, w9, w10
    mov      w10, #0x3687
    movk     w10, #0xadaa, lsl #16
    umull    x9, w9, w10
    lsr      x9, x9, #0x3f
    mov      w10, #0x6822
    movk     w10, #0x3e6f, lsl #16
    orr      w9, w9, w10
    str      w9, [sp, #0x1c]
    mov      w9, #0xc965
    movk     w9, #0x9f75, lsl #16
    str      w9, [sp, #0xc]
    add      x10, sp, #0xc
    str      x10, [sp]
    mov      w10, #0x92eb
    movk     w10, #0xccff, lsl #16
    mov      w11, #0x5769
    movk     w11, #0x1723, lsl #16
    mov      w12, #0x967a
    movk     w12, #0xb899, lsl #16
    adrp     x13, #0x523000
    adrp     x14, #0x523000
    mov      w15, #0xd8bf
    movk     w15, #0x577b, lsl #16
    mov      w16, #0x27a8
    movk     w16, #0xed59, lsl #16
    mov      w17, #0x3ddc
    movk     w17, #0xbdf7, lsl #16
    adrp     x1, #0x4c4000
    mov      w2, #0xb18c
    movk     w2, #0x30d5, lsl #16
    mov      w3, #0x92ec
    movk     w3, #0xccff, lsl #16
    ldr      w4, [sp, #0xc]
    cmp      w4, w10
    b.gt     #0x25eb4c
    cmp      w4, w9
    b.eq     #0x25eb90
    cmp      w4, w12
    b.ne     #0x25eb24
    ldr      x4, [sp]
    str      w8, [x4]
    b        #0x25eb24
    cmp      w4, w8
    b.ne     #0x25eba8
    ldr      w4, [x13, #0x38]
    ldr      w5, [x14, #0x3c]
    eor      w4, w4, w5
    umull    x5, w4, w15
    lsr      x5, x5, #0x20
    sub      w4, w4, w5
    add      w4, w5, w4, lsr #1
    lsr      w4, w4, #0x1d
    ldrsw    x5, [x1, #0xae4]
    ldr      x5, [x0, x5]
    madd     w4, w4, w16, w17
    str      x5, [sp, #0x10]
    cmp      w4, w2
    csel     w4, w8, w3, lo
    b        #0x25eb9c
    ldr      w4, [sp, #0x1c]
    cmp      w4, w11
    csel     w4, w12, w8, lo
    ldr      x5, [sp]
    str      w4, [x5]
    b        #0x25eb24
    cmp      w4, w3
    b.ne     #0x25eb24
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGColorPickerViewController setCanvasView:] IMP=0x25EBBC bounds=0x25EBBC-0x25ED3C
loc_25EBBC:
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
    mov      w21, #0x5440
    movk     w21, #0x55cd, lsl #16
    mov      w22, #0xbc01
    movk     w22, #0x3557, lsl #16
    adrp     x8, #0x523000
    ldr      w8, [x8, #0x40]
    adrp     x9, #0x523000
    ldr      w9, [x9, #0x44]
    sub      w8, w8, w9
    mov      w9, #0xd28d
    movk     w9, #0xc652, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x86d1
    movk     w9, #0xfdf2, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x2bc3
    movk     w9, #0x8711, lsl #16
    add      w8, w8, w9
    mov      w23, #0xdfe8
    movk     w23, #0xc002, lsl #16
    stp      w23, w8, [sp, #8]
    add      x8, sp, #8
    str      x8, [sp]
    mov      w24, #0xbc00
    movk     w24, #0x3557, lsl #16
    mov      w26, #0xb19d
    movk     w26, #0xb67c, lsl #16
    adrp     x25, #0x4c4000
    mov      w27, #0xd7fd
    movk     w27, #0xb580, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w24
    b.le     #0x25ec94
    cmp      w8, w22
    b.eq     #0x25ecb4
    cmp      w8, w21
    b.ne     #0x25ec5c
    ldrsw    x8, [x25, #0xae4]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x25ec5c
    cmp      w8, w23
    b.ne     #0x25ed14
    ldr      w8, [sp, #0xc]
    mov      w9, #0x674a
    movk     w9, #0x20ae, lsl #16
    cmp      w8, w9
    csel     w8, w22, w21, hi
    b        #0x25ed08
    adrp     x8, #0x523000
    ldr      w8, [x8, #0x48]
    adrp     x9, #0x523000
    ldr      w9, [x9, #0x4c]
    add      w8, w8, w9
    mov      w9, #0xbb0b
    movk     w9, #0x3319, lsl #16
    eor      w8, w8, w9
    mov      w9, #0xade1
    movk     w9, #0xb2ae, lsl #16
    umull    x8, w8, w9
    lsr      x8, x8, #0x3e
    mov      w9, #0x9d63
    movk     w9, #0xf218, lsl #16
    add      w28, w8, w9
    ldrsw    x8, [x25, #0xae4]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    cmp      w28, w27
    csel     w8, w26, w21, hi
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x25ec5c
    cmp      w8, w26
    b.ne     #0x25ec5c
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    add      sp, sp, #0x70
    ret      

// -[WCLGColorPickerViewController hueBarView] IMP=0x25ED3C bounds=0x25ED3C-0x25EE60
loc_25ED3C:
    sub      sp, sp, #0x20
    mov      w8, #0xfbd8
    movk     w8, #0xf3a9, lsl #16
    mov      w9, #0xef52
    movk     w9, #0x8d41, lsl #16
    adrp     x10, #0x523000
    ldr      w10, [x10, #0x50]
    adrp     x11, #0x523000
    ldr      w11, [x11, #0x54]
    add      w10, w10, w11
    mov      w11, #0x4800
    movk     w11, #0x2000, lsl #16
    eor      w10, w10, w11
    mov      w11, #0xb6ef
    movk     w11, #0xcffb, lsl #16
    orr      w10, w10, w11
    str      w10, [sp, #0x1c]
    mov      w10, #0x6519
    movk     w10, #0x321d, lsl #16
    str      w10, [sp, #0xc]
    add      x11, sp, #0xc
    str      x11, [sp]
    mov      w11, #0xfbd7
    movk     w11, #0xf3a9, lsl #16
    adrp     x12, #0x523000
    adrp     x13, #0x523000
    mov      w14, #0x30bf
    movk     w14, #0xa1a7, lsl #16
    mov      w15, #0xf991
    movk     w15, #0x1cf4, lsl #16
    mov      w16, #0xc482
    movk     w16, #0xd681, lsl #16
    adrp     x17, #0x4c4000
    mov      w1, #0xdd2
    movk     w1, #0xa478, lsl #16
    mov      w2, #0xa495
    movk     w2, #0x8858, lsl #16
    mov      w3, #0x4628
    movk     w3, #0xf4d4, lsl #16
    ldr      w4, [sp, #0xc]
    cmp      w4, w11
    b.le     #0x25ee04
    cmp      w4, w8
    b.eq     #0x25ee40
    cmp      w4, w10
    b.ne     #0x25edd8
    ldr      w4, [sp, #0x1c]
    cmp      w4, w3
    csel     w4, w9, w8, lo
    b        #0x25ee34
    cmp      w4, w9
    b.ne     #0x25ee4c
    ldr      w4, [x12, #0x58]
    ldr      w5, [x13, #0x5c]
    mul      w4, w4, w5
    and      w4, w4, w14
    ldrsw    x5, [x17, #0xae8]
    ldr      x5, [x0, x5]
    madd     w4, w4, w15, w16
    str      x5, [sp, #0x10]
    cmp      w4, w1
    csel     w4, w2, w8, lo
    ldr      x5, [sp]
    str      w4, [x5]
    b        #0x25edd8
    ldr      x4, [sp]
    str      w9, [x4]
    b        #0x25edd8
    cmp      w4, w2
    b.ne     #0x25edd8
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGColorPickerViewController setHueBarView:] IMP=0x25EE60 bounds=0x25EE60-0x25EE74
loc_25EE60:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xae8]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGColorPickerViewController canvasKnob] IMP=0x25EE74 bounds=0x25EE74-0x25EE84
loc_25EE74:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaec]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setCanvasKnob:] IMP=0x25EE84 bounds=0x25EE84-0x25EFF4
loc_25EE84:
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
    mov      w21, #0x4e7d
    movk     w21, #0xcb62, lsl #16
    adrp     x8, #0x523000
    ldr      w8, [x8, #0x60]
    adrp     x9, #0x523000
    ldr      w9, [x9, #0x64]
    eor      w8, w8, w9
    mov      w9, #0xf310
    movk     w9, #0x829a, lsl #16
    mov      w10, #0x2b9f
    movk     w10, #0xe1f2, lsl #16
    madd     w8, w8, w9, w10
    mov      w22, #0x912d
    movk     w22, #0x997c, lsl #16
    stp      w22, w8, [sp, #8]
    add      x8, sp, #8
    str      x8, [sp]
    mov      w23, #0x8158
    movk     w23, #0xe365, lsl #16
    mov      w25, #0x4040
    movk     w25, #0x7873, lsl #16
    adrp     x27, #0x4c4000
    mov      w28, #0x2bd2
    movk     w28, #0xef2c, lsl #16
    mov      w24, #0x8159
    movk     w24, #0xe365, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w23
    b.gt     #0x25ef88
    cmp      w8, w22
    b.eq     #0x25efac
    cmp      w8, w21
    b.ne     #0x25ef14
    adrp     x8, #0x523000
    ldr      w8, [x8, #0x68]
    adrp     x9, #0x523000
    ldr      w9, [x9, #0x6c]
    sub      w8, w8, w9
    mov      w9, #0x799
    movk     w9, #0xc06, lsl #16
    add      w8, w8, w9
    mov      w9, #0x9a81
    movk     w9, #0x746e, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x2f7f
    movk     w9, #0xc71a, lsl #16
    umull    x8, w8, w9
    lsr      x26, x8, #0x3e
    ldrsw    x8, [x27, #0xaec]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    cmp      w26, w28
    csel     w8, w21, w24, eq
    b        #0x25efc0
    cmp      w8, w25
    b.ne     #0x25efcc
    ldrsw    x8, [x27, #0xaec]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x25ef14
    ldr      w8, [sp, #0xc]
    mov      w9, #0xe519
    movk     w9, #0x7907, lsl #16
    cmp      w8, w9
    csel     w8, w25, w21, hi
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x25ef14
    cmp      w8, w24
    b.ne     #0x25ef14
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    add      sp, sp, #0x70
    ret      

// -[WCLGColorPickerViewController hueKnob] IMP=0x25EFF4 bounds=0x25EFF4-0x25F004
loc_25EFF4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaf0]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setHueKnob:] IMP=0x25F004 bounds=0x25F004-0x25F018
loc_25F004:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaf0]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGColorPickerViewController channelLabels] IMP=0x25F018 bounds=0x25F018-0x25F028
loc_25F018:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaf4]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setChannelLabels:] IMP=0x25F028 bounds=0x25F028-0x25F170
loc_25F028:
    sub      sp, sp, #0x70
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x19, x2
    mov      x20, x1
    mov      x21, x0
    mov      w22, #0x2210
    movk     w22, #0xd633, lsl #16
    adrp     x8, #0x523000
    ldr      w8, [x8, #0x70]
    adrp     x9, #0x523000
    ldr      w9, [x9, #0x74]
    and      w8, w8, w9
    mov      w9, #0xbf0c
    movk     w9, #0x1367, lsl #16
    orr      w8, w8, w9
    mov      w9, #0xdce2
    movk     w9, #0xb22, lsl #16
    eor      w8, w8, w9
    mov      w9, #0x77a4
    movk     w9, #0x921, lsl #16
    mul      w8, w8, w9
    mov      w23, #0xaa9c
    movk     w23, #0x4905, lsl #16
    stp      w23, w8, [sp, #8]
    add      x8, sp, #8
    str      x8, [sp]
    mov      w24, #0xaa9b
    movk     w24, #0x4905, lsl #16
    adrp     x25, #0x4c4000
    mov      w26, #0xeac3
    movk     w26, #0x7a0d, lsl #16
    mov      w27, #0x6bab
    movk     w27, #0xdccb, lsl #16
    mov      w28, #0x911e
    movk     w28, #0xe575, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w24
    b.gt     #0x25f108
    cmp      w8, w22
    b.eq     #0x25f128
    cmp      w8, w27
    b.ne     #0x25f0cc
    ldrsw    x3, [x25, #0xaf4]
    mov      x0, x21
    mov      x1, x20
    mov      x2, x19
    bl       #0x461cf0 // _objc_setProperty_nonatomic_copy
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x25f0cc
    cmp      w8, w23
    b.ne     #0x25f148
    ldr      w8, [sp, #0xc]
    cmp      w8, w28
    csel     w8, w22, w27, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x25f0cc
    ldrsw    x3, [x25, #0xaf4]
    mov      x0, x21
    mov      x1, x20
    mov      x2, x19
    bl       #0x461cf0 // _objc_setProperty_nonatomic_copy
    ldr      x8, [sp]
    str      w26, [x8]
    b        #0x25f0cc
    cmp      w8, w26
    b.ne     #0x25f0cc
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    add      sp, sp, #0x70
    ret      

// -[WCLGColorPickerViewController channelSliders] IMP=0x25F170 bounds=0x25F170-0x25F180
loc_25F170:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaf8]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setChannelSliders:] IMP=0x25F180 bounds=0x25F180-0x25F18C
loc_25F180:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xaf8]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGColorPickerViewController channelFields] IMP=0x25F18C bounds=0x25F18C-0x25F268
loc_25F18C:
    sub      sp, sp, #0x20
    mov      w8, #0xcb46
    movk     w8, #0xe27d, lsl #16
    adrp     x9, #0x523000
    ldr      w9, [x9, #0x80]
    adrp     x10, #0x523000
    ldr      w10, [x10, #0x84]
    eor      w9, w9, w10
    mov      w10, #0x7f49
    movk     w10, #0x14c9, lsl #16
    add      w9, w9, w10
    str      w9, [sp, #0x1c]
    mov      w9, #0xeef7
    movk     w9, #0x8a64, lsl #16
    str      w9, [sp, #0xc]
    add      x11, sp, #0xc
    mov      w10, #0xcb45
    movk     w10, #0xe27d, lsl #16
    str      x11, [sp]
    mov      w11, #0x39ee
    movk     w11, #0x8294, lsl #16
    mov      w12, #0x17f5
    movk     w12, #0x3639, lsl #16
    mov      w13, #0x71bf
    movk     w13, #0xbf86, lsl #16
    adrp     x14, #0x4c4000
    ldr      w15, [sp, #0xc]
    cmp      w15, w10
    b.le     #0x25f21c
    cmp      w15, w8
    b.eq     #0x25f23c
    cmp      w15, w12
    b.ne     #0x25f1f4
    ldr      x15, [sp]
    str      w8, [x15]
    b        #0x25f1f4
    cmp      w15, w9
    b.ne     #0x25f254
    ldr      w15, [sp, #0x1c]
    cmp      w15, w11
    csel     w15, w12, w8, hi
    ldr      x16, [sp]
    str      w15, [x16]
    b        #0x25f1f4
    ldrsw    x15, [x14, #0xafc]
    ldr      x15, [x0, x15]
    str      x15, [sp, #0x10]
    ldr      x15, [sp]
    str      w13, [x15]
    b        #0x25f1f4
    cmp      w15, w13
    b.ne     #0x25f1f4
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGColorPickerViewController setChannelFields:] IMP=0x25F268 bounds=0x25F268-0x25F274
loc_25F268:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xafc]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGColorPickerViewController paletteScrollView] IMP=0x25F274 bounds=0x25F274-0x25F284
loc_25F274:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb00]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setPaletteScrollView:] IMP=0x25F284 bounds=0x25F284-0x25F3F4
loc_25F284:
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
    mov      w21, #0x70b5
    movk     w21, #0xf5a0, lsl #16
    mov      w22, #0x6579
    movk     w22, #0xed07, lsl #16
    adrp     x8, #0x523000
    ldr      w8, [x8, #0x90]
    adrp     x9, #0x523000
    ldr      w9, [x9, #0x94]
    orr      w8, w8, w9
    mov      w9, #0x6394
    movk     w9, #0x474e, lsl #16
    orr      w8, w8, w9
    mov      w9, #0x1534
    movk     w9, #0x4eb0, lsl #16
    eor      w8, w8, w9
    mov      w9, #0xa232
    movk     w9, #0xb994, lsl #16
    mul      w8, w8, w9
    mov      w23, #0x47c1
    movk     w23, #0xf901, lsl #16
    stp      w23, w8, [sp, #8]
    add      x8, sp, #8
    str      x8, [sp]
    mov      w24, #0xf242
    movk     w24, #0xf6ae, lsl #16
    adrp     x25, #0x4c4000
    mov      w27, #0xf243
    movk     w27, #0xf6ae, lsl #16
    mov      w28, #0x1ef3
    movk     w28, #0xde21, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w24
    b.gt     #0x25f35c
    cmp      w8, w22
    b.eq     #0x25f374
    cmp      w8, w21
    b.ne     #0x25f324
    ldrsw    x8, [x25, #0xb00]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x25f324
    cmp      w8, w23
    b.ne     #0x25f3cc
    ldr      w8, [sp, #0xc]
    cmp      w8, w28
    csel     w8, w22, w21, lo
    b        #0x25f3c0
    adrp     x8, #0x523000
    ldr      w8, [x8, #0x98]
    adrp     x9, #0x523000
    ldr      w9, [x9, #0x9c]
    eor      w8, w8, w9
    mov      w9, #0x1f05
    movk     w9, #0xef6f, lsl #16
    mul      w8, w8, w9
    mov      w9, #0x10c1
    movk     w9, #0xd064, lsl #16
    and      w26, w8, w9
    ldrsw    x8, [x25, #0xb00]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    mov      w8, #0xdff0
    movk     w8, #0x3cfb, lsl #16
    cmp      w26, w8
    csel     w8, w21, w27, eq
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x25f324
    cmp      w8, w27
    b.ne     #0x25f324
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    add      sp, sp, #0x70
    ret      

// -[WCLGColorPickerViewController paletteButtons] IMP=0x25F3F4 bounds=0x25F3F4-0x25F404
loc_25F3F4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb04]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setPaletteButtons:] IMP=0x25F404 bounds=0x25F404-0x25F410
loc_25F404:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xb04]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGColorPickerViewController paletteModes] IMP=0x25F410 bounds=0x25F410-0x25F420
loc_25F410:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb08]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setPaletteModes:] IMP=0x25F420 bounds=0x25F420-0x25F42C
loc_25F420:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xb08]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGColorPickerViewController commonButtons] IMP=0x25F42C bounds=0x25F42C-0x25F43C
loc_25F42C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb0c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setCommonButtons:] IMP=0x25F43C bounds=0x25F43C-0x25F448
loc_25F43C:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xb0c]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGColorPickerViewController commonLabels] IMP=0x25F448 bounds=0x25F448-0x25F458
loc_25F448:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb10]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setCommonLabels:] IMP=0x25F458 bounds=0x25F458-0x25F464
loc_25F458:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xb10]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGColorPickerViewController commonModes] IMP=0x25F464 bounds=0x25F464-0x25F558
loc_25F464:
    sub      sp, sp, #0x20
    mov      w8, #0x9de8
    movk     w8, #0x62ee, lsl #16
    mov      w9, #0xacc7
    movk     w9, #0x48c, lsl #16
    adrp     x10, #0x523000
    ldr      w10, [x10, #0xa0]
    adrp     x11, #0x523000
    ldr      w11, [x11, #0xa4]
    add      w10, w10, w11
    mov      w11, #0x765b
    movk     w11, #0x6481, lsl #16
    orr      w10, w10, w11
    mov      w11, #0xff66
    movk     w11, #0xee44, lsl #16
    eor      w10, w10, w11
    mov      w11, #0x1437
    movk     w11, #0xafcc, lsl #16
    add      w10, w10, w11
    str      w10, [sp, #0x1c]
    mov      w10, #0xafb9
    movk     w10, #0x36fa, lsl #16
    str      w10, [sp, #0xc]
    add      x11, sp, #0xc
    str      x11, [sp]
    mov      w11, #0x2303
    movk     w11, #0x3d55, lsl #16
    mov      w12, #0xab64
    movk     w12, #0x3bba, lsl #16
    adrp     x13, #0x4c4000
    mov      w14, #0x2304
    movk     w14, #0x3d55, lsl #16
    ldr      w15, [sp, #0xc]
    cmp      w15, w11
    b.gt     #0x25f518
    cmp      w15, w9
    b.eq     #0x25f538
    cmp      w15, w10
    b.ne     #0x25f4e4
    ldr      w15, [sp, #0x1c]
    cmp      w15, w12
    csel     w15, w9, w8, eq
    ldr      x16, [sp]
    str      w15, [x16]
    b        #0x25f4e4
    cmp      w15, w8
    b.ne     #0x25f544
    ldrsw    x15, [x13, #0xb14]
    ldr      x15, [x0, x15]
    str      x15, [sp, #0x10]
    ldr      x15, [sp]
    str      w14, [x15]
    b        #0x25f4e4
    ldr      x15, [sp]
    str      w8, [x15]
    b        #0x25f4e4
    cmp      w15, w14
    b.ne     #0x25f4e4
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGColorPickerViewController setCommonModes:] IMP=0x25F558 bounds=0x25F558-0x25F564
loc_25F558:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xb14]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGColorPickerViewController appearanceControl] IMP=0x25F564 bounds=0x25F564-0x25F574
loc_25F564:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb18]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setAppearanceControl:] IMP=0x25F574 bounds=0x25F574-0x25F588
loc_25F574:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb18]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGColorPickerViewController currentTitleLabel] IMP=0x25F588 bounds=0x25F588-0x25F6BC
loc_25F588:
    sub      sp, sp, #0x20
    mov      w8, #0xca40
    movk     w8, #0x384e, lsl #16
    mov      w9, #0xc523
    movk     w9, #0x2771, lsl #16
    adrp     x10, #0x523000
    ldr      w10, [x10, #0xb0]
    adrp     x11, #0x523000
    ldr      w11, [x11, #0xb4]
    sub      w10, w10, w11
    mov      w11, #0x4aeb
    movk     w11, #0x739b, lsl #16
    mul      w10, w10, w11
    mov      w11, #0x29a8
    movk     w11, #0xbaf6, lsl #16
    orr      w10, w10, w11
    mov      w11, #0x44bc
    movk     w11, #0xd256, lsl #16
    eor      w10, w10, w11
    str      w10, [sp, #0x1c]
    mov      w10, #0xf4
    movk     w10, #0x6094, lsl #16
    str      w10, [sp, #0xc]
    add      x11, sp, #0xc
    str      x11, [sp]
    mov      w11, #0xf08f
    movk     w11, #0x3c3a, lsl #16
    adrp     x12, #0x523000
    adrp     x13, #0x523000
    mov      w14, #0xbf66
    movk     w14, #0xcc53, lsl #16
    mov      w15, #0x6925
    movk     w15, #0x8198, lsl #16
    mov      w16, #0x92d8
    movk     w16, #0x7c41, lsl #16
    adrp     x17, #0x4c4000
    mov      w1, #0xc9c9
    movk     w1, #0x3836, lsl #16
    mov      w2, #0xf090
    movk     w2, #0x3c3a, lsl #16
    mov      w3, #0xd980
    movk     w3, #0xaaa6, lsl #16
    ldr      w4, [sp, #0xc]
    cmp      w4, w11
    b.gt     #0x25f658
    cmp      w4, w9
    b.eq     #0x25f670
    cmp      w4, w8
    b.ne     #0x25f630
    ldr      x4, [sp]
    str      w9, [x4]
    b        #0x25f630
    cmp      w4, w10
    b.ne     #0x25f6a8
    ldr      w4, [sp, #0x1c]
    cmp      w4, w3
    csel     w4, w9, w8, lo
    b        #0x25f69c
    ldr      w4, [x12, #0xb8]
    ldr      w5, [x13, #0xbc]
    add      w4, w4, w5
    add      w4, w4, w14
    eor      w4, w4, w15
    ldrsw    x5, [x17, #0xb1c]
    ldr      x5, [x0, x5]
    orr      w4, w4, w16
    str      x5, [sp, #0x10]
    cmp      w4, w1
    csel     w4, w2, w8, ne
    ldr      x5, [sp]
    str      w4, [x5]
    b        #0x25f630
    cmp      w4, w2
    b.ne     #0x25f630
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGColorPickerViewController setCurrentTitleLabel:] IMP=0x25F6BC bounds=0x25F6BC-0x25F6D0
loc_25F6BC:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb1c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGColorPickerViewController currentHexLabel] IMP=0x25F6D0 bounds=0x25F6D0-0x25F6E0
loc_25F6D0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb20]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setCurrentHexLabel:] IMP=0x25F6E0 bounds=0x25F6E0-0x25F6F4
loc_25F6E0:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb20]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGColorPickerViewController currentDot] IMP=0x25F6F4 bounds=0x25F6F4-0x25F704
loc_25F6F4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb24]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setCurrentDot:] IMP=0x25F704 bounds=0x25F704-0x25F718
loc_25F704:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb24]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGColorPickerViewController red] IMP=0x25F718 bounds=0x25F718-0x25F728
loc_25F718:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaa0]
    ldr      d0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setRed:] IMP=0x25F728 bounds=0x25F728-0x25F738
loc_25F728:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaa0]
    str      d0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController green] IMP=0x25F738 bounds=0x25F738-0x25F748
loc_25F738:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaa4]
    ldr      d0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setGreen:] IMP=0x25F748 bounds=0x25F748-0x25F87C
loc_25F748:
    sub      sp, sp, #0x10
    mov      w8, #0x9f61
    movk     w8, #0xb0c5, lsl #16
    mov      w9, #0x3fa5
    movk     w9, #0x5dbb, lsl #16
    adrp     x10, #0x523000
    ldr      w10, [x10, #0xc0]
    adrp     x11, #0x523000
    ldr      w11, [x11, #0xc4]
    mov      w12, #0xf29f
    movk     w12, #0xf8c1, lsl #16
    madd     w10, w10, w11, w12
    mov      w11, #0x2709
    movk     w11, #0x881e, lsl #16
    umull    x10, w10, w11
    lsr      x10, x10, #0x3d
    mov      w11, #0x92f3
    movk     w11, #0x32aa, lsl #16
    add      w10, w10, w11
    str      w10, [sp, #0xc]
    mov      w10, #0xb8ef
    movk     w10, #0xfde3, lsl #16
    str      w10, [sp, #8]
    add      x11, sp, #8
    str      x11, [sp]
    mov      w11, #0x3fa4
    movk     w11, #0x5dbb, lsl #16
    adrp     x12, #0x523000
    adrp     x13, #0x523000
    mov      w14, #0x9204
    movk     w14, #0x601e, lsl #16
    mov      w15, #0xc141
    movk     w15, #0x4990, lsl #16
    mov      w16, #0x89a
    movk     w16, #0x9261, lsl #16
    adrp     x17, #0x4c4000
    mov      w1, #0x5299
    movk     w1, #0x650c, lsl #16
    mov      w2, #0x9e20
    movk     w2, #0x7760, lsl #16
    mov      w3, #0x6ced
    movk     w3, #0x4b9, lsl #16
    ldr      w4, [sp, #8]
    cmp      w4, w11
    b.gt     #0x25f81c
    cmp      w4, w8
    b.eq     #0x25f838
    cmp      w4, w10
    b.ne     #0x25f7f0
    ldr      w4, [sp, #0xc]
    cmp      w4, w3
    csel     w4, w8, w9, ne
    b        #0x25f860
    cmp      w4, w9
    b.ne     #0x25f86c
    ldrsw    x4, [x17, #0xaa4]
    str      d0, [x0, x4]
    ldr      x4, [sp]
    str      w8, [x4]
    b        #0x25f7f0
    ldr      w4, [x12, #0xc8]
    ldr      w5, [x13, #0xcc]
    eor      w4, w4, w5
    orr      w4, w4, w14
    eor      w4, w4, w15
    orr      w4, w4, w16
    ldrsw    x5, [x17, #0xaa4]
    str      d0, [x0, x5]
    cmp      w4, w1
    csel     w4, w2, w9, ne
    ldr      x5, [sp]
    str      w4, [x5]
    b        #0x25f7f0
    cmp      w4, w2
    b.ne     #0x25f7f0
    add      sp, sp, #0x10
    ret      

// -[WCLGColorPickerViewController blue] IMP=0x25F87C bounds=0x25F87C-0x25F88C
loc_25F87C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaa8]
    ldr      d0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setBlue:] IMP=0x25F88C bounds=0x25F88C-0x25F89C
loc_25F88C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaa8]
    str      d0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController alpha] IMP=0x25F89C bounds=0x25F89C-0x25F8AC
loc_25F89C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaac]
    ldr      d0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setAlpha:] IMP=0x25F8AC bounds=0x25F8AC-0x25F8BC
loc_25F8AC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaac]
    str      d0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController hue] IMP=0x25F8BC bounds=0x25F8BC-0x25F8CC
loc_25F8BC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb28]
    ldr      d0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setHue:] IMP=0x25F8CC bounds=0x25F8CC-0x25F8DC
loc_25F8CC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb28]
    str      d0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController saturation] IMP=0x25F8DC bounds=0x25F8DC-0x25F8EC
loc_25F8DC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb2c]
    ldr      d0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setSaturation:] IMP=0x25F8EC bounds=0x25F8EC-0x25F8FC
loc_25F8EC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb2c]
    str      d0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController brightness] IMP=0x25F8FC bounds=0x25F8FC-0x25FA24
loc_25F8FC:
    sub      sp, sp, #0x20
    mov      w8, #0xf2d0
    movk     w8, #0xe57e, lsl #16
    mov      w9, #0x4b88
    movk     w9, #0xbafa, lsl #16
    adrp     x10, #0x523000
    ldr      w10, [x10, #0xd0]
    adrp     x11, #0x523000
    ldr      w11, [x11, #0xd4]
    mul      w10, w10, w11
    mov      w11, #0xff64
    movk     w11, #0xa293, lsl #16
    mov      w12, #0xe10
    movk     w12, #0xe4f3, lsl #16
    madd     w10, w10, w11, w12
    str      w10, [sp, #0x1c]
    mov      w10, #0x831
    movk     w10, #0xb336, lsl #16
    str      w10, [sp, #0xc]
    add      x11, sp, #0xc
    str      x11, [sp]
    mov      w11, #0x4b87
    movk     w11, #0xbafa, lsl #16
    mov      w12, #0x5d4d
    movk     w12, #0xde2d, lsl #16
    mov      w13, #0x5ed5
    movk     w13, #0x8ae7, lsl #16
    adrp     x14, #0x523000
    adrp     x15, #0x523000
    mov      w16, #0x67d5
    movk     w16, #0x512e, lsl #16
    mov      w17, #0xcf08
    movk     w17, #0xb4b7, lsl #16
    mov      w1, #0x2440
    movk     w1, #0x8a79, lsl #16
    adrp     x2, #0x4c4000
    mov      w3, #0x70f3
    movk     w3, #0x1e04, lsl #16
    ldr      w4, [sp, #0xc]
    cmp      w4, w11
    b.le     #0x25f9e4
    cmp      w4, w9
    b.eq     #0x25fa04
    cmp      w4, w8
    b.ne     #0x25f994
    ldr      w4, [x14, #0xd8]
    ldr      w5, [x15, #0xdc]
    add      w4, w4, w5
    umull    x4, w4, w16
    lsr      x4, x4, #0x3b
    mul      w4, w4, w17
    ldrsw    x5, [x2, #0xb30]
    ldr      d0, [x0, x5]
    and      w4, w4, w1
    str      d0, [sp, #0x10]
    cmp      w4, w3
    csel     w4, w9, w13, lo
    b        #0x25f9f8
    cmp      w4, w10
    b.ne     #0x25fa10
    ldr      w4, [sp, #0x1c]
    cmp      w4, w12
    csel     w4, w9, w8, lo
    ldr      x5, [sp]
    str      w4, [x5]
    b        #0x25f994
    ldr      x4, [sp]
    str      w8, [x4]
    b        #0x25f994
    cmp      w4, w13
    b.ne     #0x25f994
    ldr      d0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGColorPickerViewController setBrightness:] IMP=0x25FA24 bounds=0x25FA24-0x25FB58
loc_25FA24:
    sub      sp, sp, #0x10
    mov      w8, #0xef0
    movk     w8, #0x1474, lsl #16
    adrp     x9, #0x523000
    ldr      w9, [x9, #0xe0]
    adrp     x10, #0x523000
    ldr      w10, [x10, #0xe4]
    eor      w9, w9, w10
    mov      w10, #0x7b1a
    movk     w10, #0xd5a4, lsl #16
    add      w9, w9, w10
    mov      w10, #0xdcb7
    movk     w10, #0x5fd7, lsl #16
    orr      w9, w9, w10
    mov      w10, #0x642b
    movk     w10, #0x53ae, lsl #16
    eor      w9, w9, w10
    str      w9, [sp, #0xc]
    mov      w9, #0x20a7
    movk     w9, #0x5944, lsl #16
    str      w9, [sp, #8]
    add      x10, sp, #8
    str      x10, [sp]
    mov      w10, #0x1b85
    movk     w10, #0x2596, lsl #16
    mov      w11, #0x1e70
    movk     w11, #0xd5aa, lsl #16
    adrp     x12, #0x4c4000
    adrp     x13, #0x523000
    adrp     x14, #0x523000
    mov      w15, #0xf4de
    movk     w15, #0x153, lsl #16
    mov      w16, #0x4820
    movk     w16, #0x460e, lsl #16
    mov      w17, #0x918f
    movk     w17, #0x8951, lsl #16
    mov      w1, #0xbbc7
    movk     w1, #0x8e16, lsl #16
    mov      w2, #0x1b86
    movk     w2, #0x2596, lsl #16
    mov      w3, #0x9b94
    movk     w3, #0x2699, lsl #16
    ldr      w4, [sp, #8]
    cmp      w4, w10
    b.gt     #0x25fb14
    cmp      w4, w11
    b.eq     #0x25fb34
    cmp      w4, w8
    b.ne     #0x25facc
    ldr      w4, [x13, #0xe8]
    ldr      w5, [x14, #0xec]
    sub      w4, w4, w5
    add      w4, w4, w15
    eor      w4, w4, w16
    orr      w4, w4, w17
    ldrsw    x5, [x12, #0xb30]
    str      d0, [x0, x5]
    cmp      w4, w1
    csel     w4, w8, w2, lo
    b        #0x25fb28
    cmp      w4, w9
    b.ne     #0x25fb48
    ldr      w4, [sp, #0xc]
    cmp      w4, w3
    csel     w4, w8, w11, hi
    ldr      x5, [sp]
    str      w4, [x5]
    b        #0x25facc
    ldrsw    x4, [x12, #0xb30]
    str      d0, [x0, x4]
    ldr      x4, [sp]
    str      w8, [x4]
    b        #0x25facc
    cmp      w4, w2
    b.ne     #0x25facc
    add      sp, sp, #0x10
    ret      

// -[WCLGColorPickerViewController pendingMode] IMP=0x25FB58 bounds=0x25FB58-0x25FB68
loc_25FB58:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb34]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setPendingMode:] IMP=0x25FB68 bounds=0x25FB68-0x25FB78
loc_25FB68:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb34]
    str      x2, [x0, x8]
    ret      

// -[WCLGColorPickerViewController lightMode] IMP=0x25FB78 bounds=0x25FB78-0x25FB88
loc_25FB78:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa80]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setLightMode:] IMP=0x25FB88 bounds=0x25FB88-0x25FB98
loc_25FB88:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa80]
    str      x2, [x0, x8]
    ret      

// -[WCLGColorPickerViewController darkMode] IMP=0x25FB98 bounds=0x25FB98-0x25FBA8
loc_25FB98:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa84]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setDarkMode:] IMP=0x25FBA8 bounds=0x25FBA8-0x25FBB8
loc_25FBA8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa84]
    str      x2, [x0, x8]
    ret      

// -[WCLGColorPickerViewController dualAppearanceMode] IMP=0x25FBB8 bounds=0x25FBB8-0x25FCE0
loc_25FBB8:
    sub      sp, sp, #0x20
    mov      w8, #0x1501
    movk     w8, #0x8eed, lsl #16
    adrp     x9, #0x523000
    ldr      w9, [x9, #0xf0]
    adrp     x10, #0x523000
    ldr      w10, [x10, #0xf4]
    sub      w9, w9, w10
    mov      w10, #0x30e1
    movk     w10, #0x17ba, lsl #16
    add      w9, w9, w10
    mov      w10, #0x4200
    movk     w10, #0x470, lsl #16
    and      w9, w9, w10
    str      w9, [sp, #0x1c]
    mov      w9, #0xec83
    movk     w9, #0xbf87, lsl #16
    str      w9, [sp, #0x14]
    add      x10, sp, #0x14
    str      x10, [sp, #8]
    mov      w10, #0xec82
    movk     w10, #0xbf87, lsl #16
    adrp     x11, #0x523000
    adrp     x12, #0x523000
    mov      w13, #0x3a81
    movk     w13, #0x8d48, lsl #16
    mov      w14, #0x4f7
    movk     w14, #0x4c5d, lsl #16
    mov      w15, #0x2727
    movk     w15, #0xdc41, lsl #16
    adrp     x16, #0x4c4000
    mov      w17, #0x98a2
    movk     w17, #0xe992, lsl #16
    mov      w1, #0xe62d
    movk     w1, #0xb455, lsl #16
    mov      w2, #0x770c
    movk     w2, #0x764b, lsl #16
    mov      w3, #0x38d9
    movk     w3, #0x6f41, lsl #16
    ldr      w4, [sp, #0x14]
    cmp      w4, w10
    b.le     #0x25fc80
    cmp      w4, w2
    b.eq     #0x25fcc0
    cmp      w4, w9
    b.ne     #0x25fc54
    ldr      w4, [sp, #0x1c]
    cmp      w4, w3
    csel     w4, w8, w2, lo
    b        #0x25fcb4
    cmp      w4, w8
    b.ne     #0x25fccc
    ldr      w4, [x11, #0xf8]
    ldr      w5, [x12, #0xfc]
    sub      w4, w4, w5
    and      w4, w4, w13
    add      w4, w4, w14
    ldrsw    x5, [x16, #0xa88]
    ldrb     w5, [x0, x5]
    and      w4, w4, w15
    strb     w5, [sp, #0x1b]
    cmp      w4, w17
    csel     w4, w8, w1, eq
    ldr      x5, [sp, #8]
    str      w4, [x5]
    b        #0x25fc54
    ldr      x4, [sp, #8]
    str      w8, [x4]
    b        #0x25fc54
    cmp      w4, w1
    b.ne     #0x25fc54
    ldrb     w0, [sp, #0x1b]
    add      sp, sp, #0x20
    ret      

// -[WCLGColorPickerViewController setDualAppearanceMode:] IMP=0x25FCE0 bounds=0x25FCE0-0x25FE0C
loc_25FCE0:
    sub      sp, sp, #0x10
    mov      w8, #0xa955
    movk     w8, #0x6974, lsl #16
    adrp     x9, #0x523000
    ldr      w9, [x9, #0x100]
    adrp     x10, #0x523000
    ldr      w10, [x10, #0x104]
    add      w9, w9, w10
    mov      w10, #0x90bf
    movk     w10, #0x1042, lsl #16
    mul      w9, w9, w10
    mov      w10, #0x400
    movk     w10, #0x8849, lsl #16
    and      w9, w9, w10
    str      w9, [sp, #0xc]
    mov      w9, #0x4842
    movk     w9, #0x3ffb, lsl #16
    str      w9, [sp, #8]
    add      x10, sp, #8
    str      x10, [sp]
    mov      w10, #0xa954
    movk     w10, #0x6974, lsl #16
    mov      w11, #0xe2f7
    movk     w11, #0x2ef6, lsl #16
    mov      w12, #0xef6b
    movk     w12, #0x7a07, lsl #16
    mov      w13, #0x5cde
    movk     w13, #0x5cef, lsl #16
    adrp     x14, #0x523000
    adrp     x15, #0x523000
    mov      w16, #0x1d4d
    movk     w16, #0x6cb6, lsl #16
    mov      w17, #0xb21
    movk     w17, #0x7519, lsl #16
    mov      w1, #0x89f1
    movk     w1, #0x7a46, lsl #16
    adrp     x3, #0x4c4000
    mov      w4, #0xe817
    movk     w4, #0x83cd, lsl #16
    ldr      w5, [sp, #8]
    cmp      w5, w10
    b.le     #0x25fdac
    cmp      w5, w8
    b.eq     #0x25fdc4
    cmp      w5, w12
    b.ne     #0x25fd7c
    ldrsw    x5, [x3, #0xa88]
    strb     w2, [x0, x5]
    ldr      x5, [sp]
    str      w8, [x5]
    b        #0x25fd7c
    cmp      w5, w9
    b.ne     #0x25fdfc
    ldr      w5, [sp, #0xc]
    cmp      w5, w11
    csel     w5, w8, w12, ne
    b        #0x25fdf0
    ldr      w5, [x14, #0x108]
    ldr      w6, [x15, #0x10c]
    orr      w5, w5, w6
    orr      w5, w5, w16
    eor      w5, w5, w17
    umull    x5, w5, w1
    lsr      x5, x5, #0x3e
    ldrsw    x6, [x3, #0xa88]
    strb     w2, [x0, x6]
    cmp      w5, w4
    csel     w5, w8, w13, hi
    ldr      x6, [sp]
    str      w5, [x6]
    b        #0x25fd7c
    cmp      w5, w13
    b.ne     #0x25fd7c
    add      sp, sp, #0x10
    ret      

// -[WCLGColorPickerViewController editingDarkAppearance] IMP=0x25FE0C bounds=0x25FE0C-0x25FE1C
loc_25FE0C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa8c]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setEditingDarkAppearance:] IMP=0x25FE1C bounds=0x25FE1C-0x25FE2C
loc_25FE1C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa8c]
    strb     w2, [x0, x8]
    ret      

// -[WCLGColorPickerViewController updatingUI] IMP=0x25FE2C bounds=0x25FE2C-0x25FE3C
loc_25FE2C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb38]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setUpdatingUI:] IMP=0x25FE3C bounds=0x25FE3C-0x25FE4C
loc_25FE3C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb38]
    strb     w2, [x0, x8]
    ret      

// -[WCLGColorPickerViewController savedPopGestureEnabled] IMP=0x25FE4C bounds=0x25FE4C-0x25FF3C
loc_25FE4C:
    sub      sp, sp, #0x20
    mov      w8, #0xae76
    movk     w8, #0x28, lsl #16
    adrp     x9, #0x523000
    ldr      w9, [x9, #0x110]
    adrp     x10, #0x523000
    ldr      w10, [x10, #0x114]
    add      w9, w9, w10
    mov      w10, #0x53f4
    movk     w10, #0x4845, lsl #16
    mov      w11, #0x6bf1
    movk     w11, #0x286c, lsl #16
    madd     w9, w9, w10, w11
    mov      w10, #0x537d
    movk     w10, #0xc6bc, lsl #16
    eor      w9, w9, w10
    str      w9, [sp, #0x1c]
    mov      w9, #0x965e
    movk     w9, #0x12df, lsl #16
    str      w9, [sp, #0x14]
    add      x10, sp, #0x14
    str      x10, [sp, #8]
    mov      w10, #0xe990
    movk     w10, #0x29b, lsl #16
    mov      w11, #0xabf8
    movk     w11, #0xf964, lsl #16
    adrp     x12, #0x4c4000
    mov      w13, #0xe991
    movk     w13, #0x29b, lsl #16
    mov      w14, #0xd493
    movk     w14, #0xd391, lsl #16
    ldr      w15, [sp, #0x14]
    cmp      w15, w10
    b.gt     #0x25fefc
    cmp      w15, w11
    b.eq     #0x25ff1c
    cmp      w15, w8
    b.ne     #0x25fec8
    ldrsw    x15, [x12, #0xb3c]
    ldrb     w15, [x0, x15]
    strb     w15, [sp, #0x1b]
    ldr      x15, [sp, #8]
    str      w13, [x15]
    b        #0x25fec8
    cmp      w15, w9
    b.ne     #0x25ff28
    ldr      w15, [sp, #0x1c]
    cmp      w15, w14
    csel     w15, w11, w8, lo
    ldr      x16, [sp, #8]
    str      w15, [x16]
    b        #0x25fec8
    ldr      x15, [sp, #8]
    str      w8, [x15]
    b        #0x25fec8
    cmp      w15, w13
    b.ne     #0x25fec8
    ldrb     w0, [sp, #0x1b]
    add      sp, sp, #0x20
    ret      

// -[WCLGColorPickerViewController setSavedPopGestureEnabled:] IMP=0x25FF3C bounds=0x25FF3C-0x260064
loc_25FF3C:
    sub      sp, sp, #0x10
    mov      w8, #0x27cf
    movk     w8, #0x84ba, lsl #16
    adrp     x9, #0x523000
    ldr      w9, [x9, #0x120]
    adrp     x10, #0x523000
    ldr      w10, [x10, #0x124]
    and      w9, w9, w10
    mov      w10, #0x880
    movk     w10, #0x40c4, lsl #16
    and      w9, w9, w10
    mov      w10, #0x182
    movk     w10, #0xc820, lsl #16
    eor      w9, w9, w10
    str      w9, [sp, #0xc]
    mov      w9, #0x63dc
    movk     w9, #0xc4cb, lsl #16
    str      w9, [sp, #8]
    add      x10, sp, #8
    str      x10, [sp]
    mov      w10, #0x63db
    movk     w10, #0xc4cb, lsl #16
    adrp     x11, #0x523000
    adrp     x12, #0x523000
    mov      w13, #6
    movk     w13, #0x8804, lsl #16
    mov      w14, #0xb826
    movk     w14, #0x9915, lsl #16
    mov      w15, #0xf7c4
    movk     w15, #0x6658, lsl #16
    adrp     x16, #0x4c4000
    mov      w17, #0x8327
    movk     w17, #0xef5, lsl #16
    mov      w1, #0x8cdf
    movk     w1, #0x89ad, lsl #16
    mov      w3, #0xebef
    movk     w3, #0xdd5e, lsl #16
    mov      w4, #0x6660
    movk     w4, #0x14b8, lsl #16
    ldr      w5, [sp, #8]
    cmp      w5, w10
    b.le     #0x260004
    cmp      w5, w3
    b.eq     #0x260040
    cmp      w5, w9
    b.ne     #0x25ffd8
    ldr      w5, [sp, #0xc]
    cmp      w5, w4
    csel     w5, w8, w3, hi
    b        #0x260034
    cmp      w5, w8
    b.ne     #0x260054
    ldr      w5, [x11, #0x128]
    ldr      w6, [x12, #0x12c]
    mul      w5, w5, w6
    eor      w5, w5, w13
    and      w5, w5, w14
    add      w5, w5, w15
    ldrsw    x6, [x16, #0xb3c]
    strb     w2, [x0, x6]
    cmp      w5, w17
    csel     w5, w1, w8, hi
    ldr      x6, [sp]
    str      w5, [x6]
    b        #0x25ffd8
    ldrsw    x5, [x16, #0xb3c]
    strb     w2, [x0, x5]
    ldr      x5, [sp]
    str      w8, [x5]
    b        #0x25ffd8
    cmp      w5, w1
    b.ne     #0x25ffd8
    add      sp, sp, #0x10
    ret      

// -[WCLGColorPickerViewController explicitTitle] IMP=0x260064 bounds=0x260064-0x260074
loc_260064:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa94]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setExplicitTitle:] IMP=0x260074 bounds=0x260074-0x2601D8
loc_260074:
    sub      sp, sp, #0x70
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x19, x2
    mov      x20, x1
    mov      x21, x0
    mov      w22, #0xa072
    movk     w22, #0x8077, lsl #16
    mov      w23, #0x5d80
    movk     w23, #0x3061, lsl #16
    adrp     x8, #0x523000
    ldr      w8, [x8, #0x130]
    adrp     x9, #0x523000
    ldr      w9, [x9, #0x134]
    sub      w8, w8, w9
    mov      w9, #0x1a48
    movk     w9, #0xfb06, lsl #16
    add      w8, w8, w9
    mov      w9, #0x636e
    movk     w9, #0x57c9, lsl #16
    and      w8, w8, w9
    mov      w9, #0xa794
    movk     w9, #0xcbef, lsl #16
    add      w8, w8, w9
    mov      w24, #0x50ee
    movk     w24, #0xc219, lsl #16
    stp      w24, w8, [sp, #8]
    add      x8, sp, #8
    str      x8, [sp]
    mov      w25, #0x50ed
    movk     w25, #0xc219, lsl #16
    adrp     x28, #0x4c4000
    mov      w27, #0x7443
    movk     w27, #0xa648, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w25
    b.le     #0x260144
    cmp      w8, w23
    b.eq     #0x260190
    cmp      w8, w24
    b.ne     #0x260110
    ldr      w8, [sp, #0xc]
    mov      w9, #0xb8e2
    movk     w9, #0x228e, lsl #16
    cmp      w8, w9
    csel     w8, w22, w23, ne
    b        #0x260184
    cmp      w8, w22
    b.ne     #0x2601b0
    adrp     x8, #0x523000
    ldr      w8, [x8, #0x138]
    adrp     x9, #0x523000
    ldr      w9, [x9, #0x13c]
    mul      w26, w8, w9
    ldrsw    x3, [x28, #0xa94]
    mov      x0, x21
    mov      x1, x20
    mov      x2, x19
    bl       #0x461cf0 // _objc_setProperty_nonatomic_copy
    mov      w8, #0x6944
    movk     w8, #0x1c83, lsl #16
    cmp      w26, w8
    csel     w8, w27, w23, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x260110
    ldrsw    x3, [x28, #0xa94]
    mov      x0, x21
    mov      x1, x20
    mov      x2, x19
    bl       #0x461cf0 // _objc_setProperty_nonatomic_copy
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x260110
    cmp      w8, w27
    b.ne     #0x260110
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    add      sp, sp, #0x70
    ret      

// -[WCLGColorPickerViewController hasExplicitInitialMode] IMP=0x2601D8 bounds=0x2601D8-0x2601E8
loc_2601D8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa98]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setHasExplicitInitialMode:] IMP=0x2601E8 bounds=0x2601E8-0x2601F8
loc_2601E8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa98]
    strb     w2, [x0, x8]
    ret      

// -[WCLGColorPickerViewController explicitInitialMode] IMP=0x2601F8 bounds=0x2601F8-0x260208
loc_2601F8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa9c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGColorPickerViewController setExplicitInitialMode:] IMP=0x260208 bounds=0x260208-0x26032C
loc_260208:
    sub      sp, sp, #0x10
    mov      w8, #0x203f
    movk     w8, #0x1a4e, lsl #16
    adrp     x9, #0x523000
    ldr      w9, [x9, #0x140]
    adrp     x10, #0x523000
    ldr      w10, [x10, #0x144]
    eor      w9, w9, w10
    add      w9, w9, #0x36c, lsl #12
    add      w9, w9, #0xe1a
    mov      w10, #0xdac1
    movk     w10, #0xebd2, lsl #16
    and      w9, w9, w10
    mov      w10, #0x1127
    movk     w10, #0xf7b8, lsl #16
    add      w9, w9, w10
    str      w9, [sp, #0xc]
    mov      w9, #0x81dd
    movk     w9, #0xedd2, lsl #16
    str      w9, [sp, #8]
    add      x10, sp, #8
    str      x10, [sp]
    mov      w10, #0x203e
    movk     w10, #0x1a4e, lsl #16
    mov      w11, #0x7d51
    movk     w11, #0xfe4d, lsl #16
    mov      w12, #0xf582
    movk     w12, #0x5bab, lsl #16
    mov      w13, #0x1f85
    movk     w13, #0xfa67, lsl #16
    adrp     x14, #0x523000
    adrp     x15, #0x523000
    mov      w16, #0x4fdd
    movk     w16, #0xdc9e, lsl #16
    mov      w17, #0xe409
    movk     w17, #0x4155, lsl #16
    adrp     x1, #0x4c4000
    mov      w3, #0x8994
    movk     w3, #0x4410, lsl #16
    ldr      w4, [sp, #8]
    cmp      w4, w10
    b.le     #0x2602d4
    cmp      w4, w8
    b.eq     #0x2602ec
    cmp      w4, w12
    b.ne     #0x2602a4
    ldrsw    x4, [x1, #0xa9c]
    str      x2, [x0, x4]
    ldr      x4, [sp]
    str      w8, [x4]
    b        #0x2602a4
    cmp      w4, w9
    b.ne     #0x26031c
    ldr      w4, [sp, #0xc]
    cmp      w4, w11
    csel     w4, w8, w12, ne
    b        #0x260310
    ldr      w4, [x14, #0x148]
    ldr      w5, [x15, #0x14c]
    orr      w4, w4, w5
    orr      w4, w4, w16
    add      w4, w4, w17
    ldrsw    x5, [x1, #0xa9c]
    str      x2, [x0, x5]
    cmp      w4, w3
    csel     w4, w8, w13, hi
    ldr      x5, [sp]
    str      w4, [x5]
    b        #0x2602a4
    cmp      w4, w13
    b.ne     #0x2602a4
    add      sp, sp, #0x10
    ret      

// -[WCLGColorPickerViewController .cxx_destruct] IMP=0x26032C bounds=0x26032C-0x2605D8
loc_26032C:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa94]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb24]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb20]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb1c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb18]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb14]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb10]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb0c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb08]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb04]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb00]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xafc]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaf8]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaf4]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaf0]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xaec]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xae8]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xae4]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xae0]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xadc]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xad8]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xad4]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xad0]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xacc]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xac8]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xac4]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xac0]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xabc]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xab8]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xab4]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xab0]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa90]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa7c]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
