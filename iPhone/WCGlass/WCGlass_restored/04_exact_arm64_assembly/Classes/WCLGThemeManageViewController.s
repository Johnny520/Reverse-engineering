// Exact ARM64 listing for WCLGThemeManageViewController

// -[WCLGThemeManageViewController viewDidLoad] IMP=0x4511B8 bounds=0x4511B8-0x451E2C
loc_4511B8:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x30
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x582000
    add      x8, x8, #0xc44
    ldar     w9, [x8]
    cbnz     w9, #0x4514f4
    adrp     x9, #0x578000
    add      x9, x9, #0xe6e
    ldrh     w10, [x9]
    mov      w11, #0xfee3
    eor      w10, w10, w11
    adrp     x11, #0x578000
    add      x11, x11, #0xe74
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x9beb
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x362f
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x578000
    add      x9, x9, #0xe62
    ldrb     w10, [x9]
    eor      w10, w10, #8
    adrp     x11, #0x578000
    add      x11, x11, #0xe68
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x33333333
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0x1e
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xc0
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0xffffffc1
    strb     w10, [x11, #4]
    ldrb     w9, [x9, #5]
    mov      w10, #0x6d
    eor      w9, w9, w10
    adrp     x10, #0x578000
    add      x10, x10, #0xe56
    strb     w9, [x11, #5]
    ldrh     w9, [x10]
    mov      w11, #0x99
    eor      w9, w9, w11
    adrp     x11, #0x578000
    add      x11, x11, #0xe5c
    strh     w9, [x11]
    ldrh     w9, [x10, #2]
    mov      w12, #0xd873
    eor      w9, w9, w12
    strh     w9, [x11, #2]
    ldrh     w9, [x10, #4]
    mov      w10, #0xb9b6
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x578000
    add      x9, x9, #0xe7a
    ldrh     w10, [x9]
    mov      w11, #0xce77
    eor      w10, w10, w11
    adrp     x11, #0x578000
    add      x11, x11, #0xe84
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x39f0
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x78de
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x1e68
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xba2
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x578000
    add      x9, x9, #0xde0
    ldrh     w10, [x9]
    mov      w11, #0x839f
    eor      w11, w10, w11
    adrp     x10, #0x578000
    add      x10, x10, #0xe20
    strh     w11, [x10]
    ldrh     w11, [x9, #2]
    mov      w12, #0xca5c
    eor      w11, w11, w12
    strh     w11, [x10, #2]
    ldrh     w11, [x9, #4]
    eor      w11, w11, #0x7e
    strh     w11, [x10, #4]
    ldrh     w11, [x9, #6]
    mov      w12, #0x7605
    eor      w11, w11, w12
    strh     w11, [x10, #6]
    ldrh     w11, [x9, #8]
    mov      w12, #0x1e61
    eor      w11, w11, w12
    strh     w11, [x10, #8]
    ldrh     w11, [x9, #0xa]
    mov      w12, #0x20d9
    eor      w11, w11, w12
    strh     w11, [x10, #0xa]
    ldrh     w11, [x9, #0xc]
    mov      w12, #0x94d7
    eor      w11, w11, w12
    strh     w11, [x10, #0xc]
    ldrh     w11, [x9, #0xe]
    mov      w12, #0x575a
    eor      w11, w11, w12
    strh     w11, [x10, #0xe]
    ldrh     w11, [x9, #0x10]
    mov      w12, #0x9aa7
    eor      w11, w11, w12
    strh     w11, [x10, #0x10]
    ldrh     w11, [x9, #0x12]
    mov      w12, #0x935a
    eor      w11, w11, w12
    strh     w11, [x10, #0x12]
    ldrh     w11, [x9, #0x14]
    mov      w12, #0x9461
    eor      w11, w11, w12
    strh     w11, [x10, #0x14]
    ldrh     w11, [x9, #0x16]
    mov      w12, #0xc345
    eor      w11, w11, w12
    strh     w11, [x10, #0x16]
    ldrh     w11, [x9, #0x18]
    mov      w12, #0x1793
    eor      w11, w11, w12
    strh     w11, [x10, #0x18]
    ldrh     w11, [x9, #0x1a]
    mov      w12, #0xa630
    eor      w11, w11, w12
    strh     w11, [x10, #0x1a]
    ldrh     w11, [x9, #0x1c]
    mov      w12, #0x9436
    eor      w11, w11, w12
    strh     w11, [x10, #0x1c]
    ldrh     w11, [x9, #0x1e]
    mov      w12, #0xad1
    eor      w11, w11, w12
    strh     w11, [x10, #0x1e]
    ldrh     w11, [x9, #0x20]
    mov      w12, #0xfcb7
    eor      w11, w11, w12
    strh     w11, [x10, #0x20]
    ldrh     w11, [x9, #0x22]
    mov      w12, #0x171c
    eor      w11, w11, w12
    strh     w11, [x10, #0x22]
    ldrh     w11, [x9, #0x24]
    mov      w12, #0x8f94
    eor      w11, w11, w12
    strh     w11, [x10, #0x24]
    ldrh     w11, [x9, #0x26]
    mov      w12, #0x39e9
    eor      w11, w11, w12
    strh     w11, [x10, #0x26]
    ldrh     w11, [x9, #0x28]
    mov      w12, #0xb840
    eor      w11, w11, w12
    strh     w11, [x10, #0x28]
    ldrh     w11, [x9, #0x2a]
    mov      w12, #0x5c56
    eor      w11, w11, w12
    strh     w11, [x10, #0x2a]
    ldrh     w11, [x9, #0x2c]
    mov      w12, #0xe23d
    eor      w11, w11, w12
    strh     w11, [x10, #0x2c]
    ldrh     w11, [x9, #0x2e]
    mov      w12, #0xcd92
    eor      w11, w11, w12
    strh     w11, [x10, #0x2e]
    ldrh     w11, [x9, #0x30]
    mov      w12, #0x18ee
    eor      w11, w11, w12
    strh     w11, [x10, #0x30]
    ldrh     w11, [x9, #0x32]
    mov      w12, #0xc8a1
    eor      w11, w11, w12
    strh     w11, [x10, #0x32]
    ldrh     w9, [x9, #0x34]
    mov      w11, #0xf738
    eor      w9, w9, w11
    strh     w9, [x10, #0x34]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x8, sp
    sub      x0, x8, #0x10
    mov      sp, x0
    mov      x27, sp
    sub      x24, x27, #0x10
    mov      sp, x24
    adrp     x9, #0x4c4000
    ldr      x9, [x9, #0x848]
    stp      x19, x9, [x8, #-0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc80]
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb80]
    adrp     x2, #0x578000
    add      x2, x2, #0xfb0
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x25, #0x4c4000
    ldr      x0, [x25, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    stur     x1, [x29, #-0x60]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x3d8]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    stur     x1, [x29, #-0x68]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x490]
    bl       #0x461ba0 // _objc_alloc
    mov      x21, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    stur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xec0]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xec8]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x448]
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
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
    ldr      x1, [x8, #0xe90]
    mov      x0, x22
    mov      x2, x21
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461bac // _objc_alloc_init
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xee0]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0xee8]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xb40]
    mov      x0, x23
    mov      x1, x21
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x468]
    bl       #0x461ba0 // _objc_alloc
    mov      x23, x0
    adrp     x8, #0x578000
    add      x8, x8, #0xf30
    adrp     x9, #0x578000
    add      x9, x9, #0xef0
    stp      x8, x9, [x27, #-0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    mov      x2, x24
    mov      w3, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa10]
    mov      x0, x23
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xef0]
    mov      x0, x19
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0xef8]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa28]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c0000
    ldr      x3, [x8, #0xf00]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    mov      x2, x19
    mov      w4, #0x1000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x24
    mov      x1, x21
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461bac // _objc_alloc_init
    mov      x23, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x328]
    mov      x0, x19
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x378]
    ldr      d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    fmov     d0, #13.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4c3000
    ldr      x23, [x8, #0x330]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    stur     x1, [x29, #-0x70]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x90]
    adrp     x8, #0x4bf000
    ldr      x26, [x8, #0xc18]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0xea8]
    mov      x1, x27
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x28, [x8, #0x1f8]
    mov      x1, x28
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x22
    mov      x1, x21
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa0]
    bl       #0x461ba0 // _objc_alloc
    mov      x22, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf08]
    mov      x0, x22
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf10]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x90]
    ldur     x1, [x29, #-0x60]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x628]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldur     x1, [x29, #-0x68]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf18]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x638]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x9a8]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbf0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc78]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x6d8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf20]
    adrp     x3, #0x578000
    add      x3, x3, #0xeb0
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x23
    mov      x1, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461bac // _objc_alloc_init
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc08]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x22, [x8, #0xc10]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    adrp     x2, #0x578000
    add      x2, x2, #0xf70
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x7f8]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x28
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x90]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x1, x27
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x800]
    fmov     d0, #14.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldur     x1, [x29, #-0x70]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xed0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x451e28
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGThemeManageViewController viewWillAppear:] IMP=0x451E2C bounds=0x451E2C-0x451E7C
loc_451E2C:
    sub      sp, sp, #0x30
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x848]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x378]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xed0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    add      sp, sp, #0x30
    ret      

// -[WCLGThemeManageViewController viewDidLayoutSubviews] IMP=0x451E7C bounds=0x451E7C-0x452100
loc_451E7C:
    sub      sp, sp, #0x80
    stp      d15, d14, [sp, #0x10]
    stp      d13, d12, [sp, #0x20]
    stp      d11, d10, [sp, #0x30]
    stp      d9, d8, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x848]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x390]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x3d8]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x190]
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    mov      x0, x21
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
    fmov     d9, d2
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    fmov     d11, d3
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xee8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x678]
    adrp     x8, #0x491000
    ldr      d12, [x8, #0x5b8]
    fmov     d0, xzr
    mov      x1, x20
    fmov     d1, d8
    fmov     d2, d9
    fmov     d3, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x8, #-0x3fbc000000000000
    fmov     d0, x8
    fadd     d10, d9, d0
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x518]
    fcmp     d10, d0
    fcsel    d13, d0, d10, gt
    fsub     d0, d9, d13
    fmov     d1, #0.50000000
    fmul     d14, d0, d1
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xef8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x8, #0x4040000000000000
    fmov     d3, x8
    fmov     d1, #4.00000000
    mov      x1, x20
    fmov     d0, d14
    fmov     d2, d13
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x330]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x491000
    ldr      d1, [x8, #0xbb8]
    fmov     d0, #20.00000000
    fmov     d3, #22.00000000
    mov      x1, x20
    fmov     d2, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    fadd     d8, d8, d12
    fsub     d11, d11, d8
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x628]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    fmov     d0, xzr
    mov      x1, x20
    fmov     d1, d8
    fmov     d2, d9
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x8, #0x404e000000000000
    fmov     d0, x8
    fadd     d8, d8, d0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc10]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x8, #0x4054000000000000
    fmov     d3, x8
    fmov     d0, #20.00000000
    mov      x1, x20
    fmov     d1, d8
    fmov     d2, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      d9, d8, [sp, #0x40]
    ldp      d11, d10, [sp, #0x30]
    ldp      d13, d12, [sp, #0x20]
    ldp      d15, d14, [sp, #0x10]
    add      sp, sp, #0x80
    ret      

// -[WCLGThemeManageViewController reload] IMP=0x452100 bounds=0x452100-0x452580
loc_452100:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x80
    mov      x26, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x582000
    add      x8, x8, #0xc50
    ldar     w9, [x8]
    cbnz     w9, #0x4521c0
    adrp     x9, #0x578000
    add      x9, x9, #0xfd0
    ldrb     w10, [x9]
    mov      w11, #0x52
    eor      w10, w10, w11
    adrp     x11, #0x578000
    add      x11, x11, #0xfd7
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x8d
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x2b
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x65
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0xc0
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x6b
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w9, [x9, #6]
    mov      w10, #0xdb
    eor      w9, w9, w10
    strb     w9, [x11, #6]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x20, sp
    sub      x22, x20, #0x40
    mov      sp, x22
    sub      x23, sp, #0x80
    mov      sp, x23
    adrp     x21, #0x4c4000
    ldr      x0, [x21, #0x110]
    adrp     x8, #0x4be000
    ldr      x19, [x8, #0x808]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xc0]
    ldr      x0, [x21, #0x110]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x80]
    movi     v0.16b, #0
    stp      q0, q0, [x20, #-0x40]
    stp      q0, q0, [x20, #-0x20]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x538]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x5a0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stur     x0, [x29, #-0x90]
    stp      x1, x23, [x29, #-0xd0]
    mov      x2, x22
    mov      x3, x23
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0x60]
    mov      w24, #0
    cbz      x0, #0x452488
    ldr      x8, [x22, #0x10]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x88]
    ldur     x19, [x29, #-0xc0]
    mov      x25, #0
    adrp     x8, #0x4c0000
    ldr      x28, [x8, #0xe90]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x338]
    adrp     x8, #0x4c3000
    ldr      x9, [x8, #0x338]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x578]
    stp      x8, x9, [x29, #-0xa0]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x4f0]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x528]
    stp      x8, x9, [x29, #-0xb0]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x560]
    stur     x8, [x29, #-0xb8]
    adrp     x8, #0x4c0000
    ldr      x9, [x8, #0xe70]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x358]
    stp      x8, x9, [x29, #-0x70]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x830]
    stur     x8, [x29, #-0x78]
    ldr      x8, [x22, #0x10]
    ldr      x8, [x8]
    ldur     x9, [x29, #-0x88]
    cmp      x8, x9
    b.eq     #0x452300
    ldur     x0, [x29, #-0x90]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x22, #8]
    ldr      x27, [x8, x25, lsl #3]
    mov      x0, x27
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    cbnz     x21, #0x4523dc
    mov      x0, x26
    ldur     x1, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0xa8]
    mov      x0, x27
    ldur     x1, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x21
    ldur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    ldur     x1, [x29, #-0xb0]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x26
    mov      x26, x0
    cmp      x0, #0
    adrp     x8, #0x4a6000
    add      x8, x8, #0xd8
    csel     x2, x8, x0, eq
    mov      x0, x27
    ldur     x1, [x29, #-0xb8]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x26, x19
    ldur     x19, [x29, #-0xc0]
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    cset     w21, eq
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    orr      w24, w21, w24
    mov      x0, x27
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldur     x1, [x29, #-0x70]
    adrp     x2, #0x579000
    add      x2, x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    cmp      w21, #0
    ldp      x8, x1, [x29, #-0x80]
    csel     x0, x19, x8, ne
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    add      x25, x25, #1
    ldur     x8, [x29, #-0x60]
    cmp      x8, x25
    b.ne     #0x4522e4
    ldur     x0, [x29, #-0x90]
    ldp      x1, x3, [x29, #-0xd0]
    mov      x2, x22
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0x60]
    cbnz     x0, #0x45227c
    b        #0x45248c
    ldur     x19, [x29, #-0xc0]
    ldur     x0, [x29, #-0x90]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf98]
    mov      x0, x26
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xfa0]
    mov      x0, x26
    ldur     x2, [x29, #-0x80]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x628]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x488]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x340]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf48]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    tbz      w24, #0, #0x452534
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x348]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x452534
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x350]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xc0]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x45257c
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGThemeManageViewController loadCatalogIconsIfNeeded] IMP=0x452580 bounds=0x452580-0x452680
loc_452580:
    sub      sp, sp, #0x50
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x358]
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x45264c
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x360]
    mov      x0, x19
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    sub      x0, x29, #0x18
    mov      x1, x19
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x4b0]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    adrp     x8, #0x452000
    add      x8, x8, #0x680
    str      d0, [sp, #8]
    adrp     x9, #0x4a5000
    add      x9, x9, #0xf98
    stp      x8, x9, [sp, #0x10]
    mov      x20, sp
    add      x0, x20, #0x20
    sub      x1, x29, #0x18
    bl       #0x461c00 // _objc_copyWeak
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xfb0]
    mov      x2, sp
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    add      x0, x20, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    sub      x0, x29, #0x18
    bl       #0x461c0c // _objc_destroyWeak
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    add      sp, sp, #0x50
    ret      
    mov      x19, x0
    add      x0, x20, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    b        #0x452670
    mov      x19, x0
    sub      x0, x29, #0x18
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGThemeManageViewController segChanged] IMP=0x452A94 bounds=0x452A94-0x452AF8
loc_452A94:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x628]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x488]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x340]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf48]
    mov      x0, x19
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c6c // _objc_msgSend

// -[WCLGThemeManageViewController current] IMP=0x452AF8 bounds=0x452AF8-0x452B74
loc_452AF8:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xef8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd08]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    add      x8, x8, #0xfb8
    adrp     x9, #0x4c0000
    add      x9, x9, #0xfc0
    cmp      x0, #0
    csel     x8, x8, x9, eq
    ldr      x1, [x8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGThemeManageViewController currentType] IMP=0x452B74 bounds=0x452B74-0x452CC4
loc_452B74:
    adrp     x8, #0x582000
    add      x8, x8, #0xc78
    ldar     w9, [x8]
    cbnz     w9, #0x452c54
    adrp     x9, #0x579000
    add      x9, x9, #0x2a
    ldrb     w10, [x9]
    mov      w11, #0x2e
    eor      w10, w10, w11
    adrp     x11, #0x579000
    add      x11, x11, #0x31
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x94
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xd
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x97
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0xfffffff1
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0x38
    strb     w10, [x11, #5]
    ldrb     w9, [x9, #6]
    mov      w10, #0x8d
    eor      w9, w9, w10
    strb     w9, [x11, #6]
    adrp     x9, #0x579000
    add      x9, x9, #0x20
    ldrb     w10, [x9]
    mov      w11, #0xdb
    eor      w10, w10, w11
    adrp     x11, #0x579000
    add      x11, x11, #0x25
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xffffffe1
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x4c
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0x78
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0x4f
    eor      w9, w9, w10
    strb     w9, [x11, #4]
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xef8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd08]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x579000
    add      x8, x8, #0x60
    adrp     x9, #0x579000
    add      x9, x9, #0xa0
    cmp      x0, #0
    csel     x20, x9, x8, eq
    mov      x0, x20
    bl       #0x461cc0 // _objc_retainAutoreleaseReturnValue
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    ret      

// -[WCLGThemeManageViewController activeThemeId] IMP=0x452CC4 bounds=0x452CC4-0x452D20
loc_452CC4:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    adrp     x8, #0x4c4000
    ldr      x19, [x8, #0x538]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x378]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x380]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    ret      

// -[WCLGThemeManageViewController isActiveItem:] IMP=0x452D20 bounds=0x452D20-0x452DA8
loc_452D20:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c1000
    ldr      x21, [x8, #0x578]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    b.lt     #0x452d88
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x388]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cmp      x21, x0
    cset     w20, eq
    b        #0x452d8c
    mov      w20, #0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    ret      

// -[WCLGThemeManageViewController updateCurrentStatus] IMP=0x452DA8 bounds=0x452DA8-0x4530B0
loc_452DA8:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x10
    mov      x26, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x582000
    add      x8, x8, #0xc84
    ldar     w9, [x8]
    cbnz     w9, #0x452eac
    adrp     x9, #0x579000
    add      x9, x9, #0xe0
    ldrh     w10, [x9]
    mov      w11, #0xe7c4
    adrp     x12, #0x579000
    add      x12, x12, #0xe4
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w9, [x9, #2]
    mov      w10, #0x3ae6
    eor      w9, w9, w10
    strh     w9, [x12, #2]
    adrp     x9, #0x579000
    add      x9, x9, #0xc0
    ldrh     w10, [x9]
    mov      w11, #0x9206
    adrp     x12, #0x579000
    add      x12, x12, #0xd0
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x3599
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x2b03
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0xa67e
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0x8610
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w10, [x9, #0xa]
    mov      w11, #0x2fde
    eor      w10, w10, w11
    strh     w10, [x12, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w11, #0xe4f0
    eor      w10, w10, w11
    strh     w10, [x12, #0xc]
    ldrh     w9, [x9, #0xe]
    mov      w10, #0x7bf1
    eor      w9, w9, w10
    strh     w9, [x12, #0xe]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x19, sp
    sub      x20, x19, #0x40
    mov      sp, x20
    sub      x22, sp, #0x80
    mov      sp, x22
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x388]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    movi     v0.16b, #0
    stp      q0, q0, [x19, #-0x40]
    stp      q0, q0, [x19, #-0x20]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xfc8]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x478]
    mov      x1, x24
    mov      x2, x20
    mov      x3, x22
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x452fd0
    mov      x25, x0
    stur     x26, [x29, #-0x60]
    ldr      x8, [x20, #0x10]
    ldr      x28, [x8]
    adrp     x8, #0x4c1000
    mov      x19, #0
    ldr      x26, [x8, #0x578]
    ldr      x8, [x20, #0x10]
    ldr      x8, [x8]
    cmp      x8, x28
    b.eq     #0x452f58
    mov      x0, x21
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x20, #8]
    ldr      x27, [x8, x19, lsl #3]
    mov      x0, x27
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, x23
    b.eq     #0x452fac
    add      x19, x19, #1
    cmp      x25, x19
    b.ne     #0x452f40
    mov      x0, x21
    mov      x1, x24
    mov      x2, x20
    mov      x3, x22
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    adrp     x8, #0x4c1000
    cbnz     x0, #0x452f38
    mov      x20, #0
    b        #0x452fc8
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8d0]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldur     x26, [x29, #-0x60]
    b        #0x452fd4
    mov      x20, #0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0xb8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x579000
    add      x8, x8, #0x150
    cmp      x0, #0
    csel     x8, x8, x20, eq
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0x620]
    str      x8, [sp, #-0x10]!
    adrp     x2, #0x579000
    add      x2, x2, #0x110
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    add      sp, sp, #0x10
    mov      x21, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x330]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x4530ac
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGThemeManageViewController updateEmpty] IMP=0x4530B0 bounds=0x4530B0-0x453134
loc_4530B0:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc10]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x9b0]
    mov      x1, x21
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x628]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGThemeManageViewController tableView:numberOfRowsInSection:] IMP=0x453134 bounds=0x453134-0x453180
loc_453134:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xfc8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    add      x0, x20, #1
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    ret      

// -[WCLGThemeManageViewController tableView:cellForRowAtIndexPath:] IMP=0x453180 bounds=0x453180-0x45334C
loc_453180:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x3
    mov      x21, x2
    mov      x20, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xc90
    ldar     w9, [x8]
    cbnz     w9, #0x453218
    adrp     x9, #0x579000
    add      x9, x9, #0x170
    ldrb     w10, [x9]
    mov      w11, #0x89
    eor      w10, w10, w11
    adrp     x11, #0x579000
    add      x11, x11, #0x176
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xffffffe7
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xeb
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xfffffff9
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0xec
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w9, [x9, #5]
    mov      w10, #0x6a
    eor      w9, w9, w10
    strb     w9, [x11, #5]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xfd0]
    adrp     x2, #0x579000
    add      x2, x2, #0x1a0
    mov      x0, x21
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x5f0]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x4532dc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xfc8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    sub      x2, x0, #1
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x398]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x3, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x3a0]
    b        #0x453318
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x378]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x388]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    cset     w3, eq
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x390]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGThemeManageViewController tableView:didSelectRowAtIndexPath:] IMP=0x45334C bounds=0x45334C-0x4534A0
loc_45334C:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x20, x3
    mov      x19, x2
    mov      x21, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x738]
    mov      x0, x19
    mov      x2, x20
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x5f0]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x453470
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xfc8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    subs     x23, x0, #1
    b.lt     #0x453464
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    cmp      x24, x0
    b.gt     #0x453464
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x68]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x0, x22
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    cmp      x24, #0
    csel     x3, x19, x24, eq
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x3b0]
    mov      x0, x21
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    b        #0x453480
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x3a8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461c9c // _objc_release

// -[WCLGThemeManageViewController deactivateCurrentTheme] IMP=0x4534A0 bounds=0x4534A0-0x453850
loc_4534A0:
    sub      sp, sp, #0x50
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xc98
    ldar     w9, [x8]
    cbnz     w9, #0x453720
    adrp     x9, #0x579000
    add      x9, x9, #0x22a
    ldrh     w10, [x9]
    mov      w11, #0x6e6a
    eor      w10, w10, w11
    adrp     x11, #0x579000
    add      x11, x11, #0x230
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xdc01
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x16cb
    eor      w9, w9, w10
    adrp     x10, #0x579000
    add      x10, x10, #0x21e
    strh     w9, [x11, #4]
    ldrh     w9, [x10]
    mov      w11, #0x7462
    eor      w9, w9, w11
    adrp     x11, #0x579000
    add      x11, x11, #0x224
    strh     w9, [x11]
    ldrh     w9, [x10, #2]
    mov      w12, #0xd03f
    eor      w9, w9, w12
    strh     w9, [x11, #2]
    ldrh     w9, [x10, #4]
    mov      w10, #0xa3ed
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x579000
    add      x9, x9, #0x1e0
    ldrh     w10, [x9]
    mov      w11, #0x58dd
    eor      w10, w10, w11
    adrp     x11, #0x579000
    add      x11, x11, #0x200
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xed0d
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xfb5b
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xb452
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x3642
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0xcfdd
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0x1c52
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w10, [x9, #0xe]
    mov      w12, #0x6632
    eor      w10, w10, w12
    strh     w10, [x11, #0xe]
    ldrh     w10, [x9, #0x10]
    mov      w12, #0x70c8
    eor      w10, w10, w12
    strh     w10, [x11, #0x10]
    ldrh     w10, [x9, #0x12]
    mov      w12, #0x662d
    eor      w10, w10, w12
    strh     w10, [x11, #0x12]
    ldrh     w10, [x9, #0x14]
    mov      w12, #0x81fd
    eor      w10, w10, w12
    strh     w10, [x11, #0x14]
    ldrh     w10, [x9, #0x16]
    mov      w12, #0xb58
    eor      w10, w10, w12
    strh     w10, [x11, #0x16]
    ldrh     w10, [x9, #0x18]
    mov      w12, #0x3a6d
    eor      w10, w10, w12
    strh     w10, [x11, #0x18]
    ldrh     w10, [x9, #0x1a]
    mov      w12, #0xe5ea
    eor      w10, w10, w12
    strh     w10, [x11, #0x1a]
    ldrh     w9, [x9, #0x1c]
    mov      w10, #0xdf25
    eor      w9, w9, w10
    strh     w9, [x11, #0x1c]
    adrp     x9, #0x579000
    add      x9, x9, #0x236
    ldrb     w10, [x9]
    adrp     x11, #0x579000
    add      x11, x11, #0x23d
    eor      w10, w10, #0xfffffff9
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x65
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xf0
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x6f
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x7a
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x62
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w9, [x9, #6]
    eor      w9, w9, #0xbbbbbbbb
    strb     w9, [x11, #6]
    adrp     x9, #0x579000
    add      x9, x9, #0x1c0
    ldrh     w10, [x9]
    mov      w11, #0xdfa4
    adrp     x12, #0x579000
    add      x12, x12, #0x1ca
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x3361
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x979f
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x9e18
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xc47d
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x378]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x538]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x3b8]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    cbz      w0, #0x453774
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xed0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    adrp     x2, #0x579000
    add      x2, x2, #0x370
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x579000
    add      x8, x8, #0x2f0
    adrp     x9, #0x579000
    add      x9, x9, #0x330
    cmp      w0, #0
    csel     x21, x9, x8, ne
    tbz      w22, #0, #0x453808
    adrp     x8, #0x4c4000
    ldr      x22, [x8, #0xb8]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x620]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    str      x21, [sp]
    adrp     x2, #0x579000
    add      x2, x2, #0x270
    mov      x0, x22
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf58]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x21, x22
    b        #0x45382c
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0xf58]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    adrp     x2, #0x579000
    add      x2, x2, #0x2b0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    add      sp, sp, #0x50
    b        #0x461c9c // _objc_release

// -[WCLGThemeManageViewController presentActionsForTheme:sourceView:] IMP=0x453850 bounds=0x453850-0x453E60
loc_453850:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    sub      sp, sp, #0x10
    mov      x20, x3
    mov      x19, x2
    stur     x0, [x29, #-0x68]
    adrp     x8, #0x582000
    add      x8, x8, #0xc9c
    ldar     w9, [x8]
    cbnz     w9, #0x453a30
    adrp     x9, #0x579000
    add      x9, x9, #0x3c4
    ldrh     w10, [x9]
    mov      w11, #0xa387
    eor      w10, w10, w11
    adrp     x11, #0x579000
    add      x11, x11, #0x3ca
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xe892
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x7443
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x579000
    add      x9, x9, #0x3b8
    ldrh     w10, [x9]
    mov      w11, #0x8cb9
    eor      w10, w10, w11
    adrp     x11, #0x579000
    add      x11, x11, #0x3be
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xe7df
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0xb2ee
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x579000
    add      x9, x9, #0x3a4
    ldrh     w10, [x9]
    mov      w11, #0x58b
    adrp     x12, #0x579000
    add      x12, x12, #0x3ae
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0xf6d6
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0xa1cc
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0xbf44
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xf33c
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    adrp     x9, #0x579000
    add      x9, x9, #0x3d0
    ldrh     w10, [x9]
    mov      w11, #0xd2f6
    adrp     x12, #0x579000
    add      x12, x12, #0x3da
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0xb2c6
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x5120
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0xcc17
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x3bb7
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    adrp     x9, #0x579000
    add      x9, x9, #0x390
    ldrh     w10, [x9]
    mov      w11, #0xce60
    adrp     x12, #0x579000
    add      x12, x12, #0x39a
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x5d69
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0xdeff
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x3b51
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xb02d
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x22, sp, #0x10
    mov      sp, x22
    sub      x23, sp, #0x30
    mov      sp, x23
    sub      x24, sp, #0x30
    mov      sp, x24
    sub      x25, sp, #0x30
    mov      sp, x25
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    cbz      x19, #0x453de4
    stur     x20, [x29, #-0x70]
    adrp     x8, #0x4c4000
    ldr      x26, [x8, #0x310]
    adrp     x8, #0x4bf000
    ldr      x21, [x8, #0x8d0]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    cbz      x0, #0x453ac8
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    b        #0x453ad0
    adrp     x21, #0x579000
    add      x21, x21, #0x510
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb00]
    mov      x0, x26
    mov      x2, x21
    mov      x3, #0
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    cbz      x28, #0x453b04
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldur     x1, [x29, #-0x68]
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x23]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    str      d8, [x23, #8]
    adrp     x8, #0x453000
    add      x8, x8, #0xe60
    adrp     x20, #0x4a2000
    add      x20, x20, #0xca8
    stp      x8, x20, [x23, #0x10]
    add      x0, x23, #0x28
    mov      x1, x22
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x23, #0x20]
    adrp     x8, #0x4bf000
    ldr      x27, [x8, #0xb08]
    adrp     x2, #0x579000
    add      x2, x2, #0x4d0
    mov      x0, x21
    mov      x1, x27
    mov      x3, #0
    mov      x4, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x28, [x8, #0xb10]
    mov      x0, x26
    mov      x1, x28
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x24]
    str      d8, [x24, #8]
    adrp     x8, #0x453000
    add      x8, x8, #0xe9c
    stp      x8, x20, [x24, #0x10]
    add      x0, x24, #0x28
    mov      x1, x22
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x24, #0x20]
    adrp     x2, #0x579000
    add      x2, x2, #0x490
    mov      x0, x21
    mov      x1, x27
    mov      w3, #2
    mov      x4, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x26
    mov      x1, x28
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x25]
    str      d8, [x25, #8]
    adrp     x8, #0x453000
    add      x8, x8, #0xed8
    stp      x8, x20, [x25, #0x10]
    add      x0, x25, #0x28
    mov      x1, x22
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x25, #0x20]
    adrp     x2, #0x579000
    add      x2, x2, #0x450
    mov      x0, x21
    mov      x1, x27
    mov      w3, #2
    mov      x4, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x26
    mov      x1, x28
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x318]
    adrp     x2, #0x579000
    add      x2, x2, #0x410
    mov      x1, x27
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x26
    mov      x1, x28
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb58]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldur     x20, [x29, #-0x70]
    mov      x27, x0
    cbz      x0, #0x453d80
    cbz      x20, #0x453d28
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x28, x20
    b        #0x453d44
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x628]
    ldur     x0, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb60]
    mov      x0, x27
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x28
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb68]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    ldur     x0, [x29, #-0x68]
    mov      x2, x26
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x20]
    bl       #0x461c9c // _objc_release
    add      x0, x25, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x24, #0x20]
    bl       #0x461c9c // _objc_release
    add      x0, x24, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x23, #0x20]
    bl       #0x461c9c // _objc_release
    add      x0, x23, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x22
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    sub      sp, x29, #0x60
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    ldp      d9, d8, [sp], #0x70
    ret      
    b        #0x453e34
    b        #0x453e34
    b        #0x453e34
    mov      x19, x0
    b        #0x453e40
    mov      x19, x0
    b        #0x453e48
    mov      x19, x0
    add      x0, x25, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x24, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x23, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x22
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGThemeManageViewController confirmRevoke:] IMP=0x453FA0 bounds=0x453FA0-0x45466C
loc_453FA0:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xcb8
    ldar     w9, [x8]
    cbnz     w9, #0x454404
    adrp     x9, #0x579000
    add      x9, x9, #0x612
    ldrh     w10, [x9]
    mov      w11, #0xaf69
    eor      w10, w10, w11
    adrp     x11, #0x579000
    add      x11, x11, #0x620
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x1c1b
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x2ad0
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xdbfe
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x4386
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0xf4e7
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w9, [x9, #0xc]
    mov      w10, #0x1680
    eor      w9, w9, w10
    strh     w9, [x11, #0xc]
    adrp     x9, #0x579000
    add      x9, x9, #0x550
    ldrh     w10, [x9]
    mov      w11, #0xde70
    eor      w11, w10, w11
    adrp     x10, #0x579000
    add      x10, x10, #0x5b0
    strh     w11, [x10]
    ldrh     w11, [x9, #2]
    mov      w12, #0xd86a
    eor      w11, w11, w12
    strh     w11, [x10, #2]
    ldrh     w11, [x9, #4]
    mov      w12, #0x697c
    eor      w11, w11, w12
    strh     w11, [x10, #4]
    ldrh     w11, [x9, #6]
    mov      w12, #0xb470
    eor      w11, w11, w12
    strh     w11, [x10, #6]
    ldrh     w11, [x9, #8]
    mov      w12, #0x3ce8
    eor      w11, w11, w12
    strh     w11, [x10, #8]
    ldrh     w11, [x9, #0xa]
    mov      w12, #0x89d4
    eor      w11, w11, w12
    strh     w11, [x10, #0xa]
    ldrh     w11, [x9, #0xc]
    mov      w12, #0x994e
    eor      w11, w11, w12
    strh     w11, [x10, #0xc]
    ldrh     w11, [x9, #0xe]
    mov      w12, #0xc93c
    eor      w11, w11, w12
    strh     w11, [x10, #0xe]
    ldrh     w11, [x9, #0x10]
    mov      w12, #0x3184
    eor      w11, w11, w12
    strh     w11, [x10, #0x10]
    ldrh     w11, [x9, #0x12]
    mov      w12, #0x4cb2
    eor      w11, w11, w12
    strh     w11, [x10, #0x12]
    ldrh     w11, [x9, #0x14]
    mov      w12, #0x674d
    eor      w11, w11, w12
    strh     w11, [x10, #0x14]
    ldrh     w11, [x9, #0x16]
    mov      w12, #0xd76a
    eor      w11, w11, w12
    strh     w11, [x10, #0x16]
    ldrh     w11, [x9, #0x18]
    mov      w12, #0xe8bc
    eor      w11, w11, w12
    strh     w11, [x10, #0x18]
    ldrh     w11, [x9, #0x1a]
    mov      w12, #0xc143
    eor      w11, w11, w12
    strh     w11, [x10, #0x1a]
    ldrh     w11, [x9, #0x1c]
    mov      w12, #0xbef5
    eor      w11, w11, w12
    strh     w11, [x10, #0x1c]
    ldrh     w11, [x9, #0x1e]
    mov      w12, #0xd75e
    eor      w11, w11, w12
    strh     w11, [x10, #0x1e]
    ldrh     w11, [x9, #0x20]
    mov      w12, #0x21e7
    eor      w11, w11, w12
    strh     w11, [x10, #0x20]
    ldrh     w11, [x9, #0x22]
    mov      w12, #0x140d
    eor      w11, w11, w12
    strh     w11, [x10, #0x22]
    ldrh     w11, [x9, #0x24]
    mov      w12, #0xbf01
    eor      w11, w11, w12
    strh     w11, [x10, #0x24]
    ldrh     w11, [x9, #0x26]
    mov      w12, #0xdc6c
    eor      w11, w11, w12
    strh     w11, [x10, #0x26]
    ldrh     w11, [x9, #0x28]
    mov      w12, #0xc754
    eor      w11, w11, w12
    strh     w11, [x10, #0x28]
    ldrh     w11, [x9, #0x2a]
    mov      w12, #0x9ec4
    eor      w11, w11, w12
    strh     w11, [x10, #0x2a]
    ldrh     w11, [x9, #0x2c]
    mov      w12, #0x8ef
    eor      w11, w11, w12
    strh     w11, [x10, #0x2c]
    ldrh     w11, [x9, #0x2e]
    mov      w12, #0x2674
    eor      w11, w11, w12
    strh     w11, [x10, #0x2e]
    ldrh     w11, [x9, #0x30]
    mov      w12, #0x5616
    eor      w11, w11, w12
    strh     w11, [x10, #0x30]
    ldrh     w11, [x9, #0x32]
    mov      w12, #0xe5f7
    eor      w11, w11, w12
    strh     w11, [x10, #0x32]
    ldrh     w11, [x9, #0x34]
    mov      w12, #0xa522
    eor      w11, w11, w12
    strh     w11, [x10, #0x34]
    ldrh     w11, [x9, #0x36]
    mov      w12, #0x8985
    eor      w11, w11, w12
    strh     w11, [x10, #0x36]
    ldrh     w11, [x9, #0x38]
    mov      w12, #0xfe27
    eor      w11, w11, w12
    strh     w11, [x10, #0x38]
    ldrh     w11, [x9, #0x3a]
    mov      w12, #0x739d
    eor      w11, w11, w12
    strh     w11, [x10, #0x3a]
    ldrh     w11, [x9, #0x3c]
    mov      w12, #0x1021
    eor      w11, w11, w12
    strh     w11, [x10, #0x3c]
    ldrh     w11, [x9, #0x3e]
    mov      w12, #0x6450
    eor      w11, w11, w12
    strh     w11, [x10, #0x3e]
    ldrh     w11, [x9, #0x40]
    mov      w12, #0x4e4b
    eor      w11, w11, w12
    strh     w11, [x10, #0x40]
    ldrh     w11, [x9, #0x42]
    mov      w12, #0x9ba
    eor      w11, w11, w12
    strh     w11, [x10, #0x42]
    ldrh     w11, [x9, #0x44]
    mov      w12, #0xb205
    eor      w11, w11, w12
    strh     w11, [x10, #0x44]
    ldrh     w11, [x9, #0x46]
    mov      w12, #0xfd1a
    eor      w11, w11, w12
    strh     w11, [x10, #0x46]
    ldrh     w11, [x9, #0x48]
    mov      w12, #0xcfbb
    eor      w11, w11, w12
    strh     w11, [x10, #0x48]
    ldrh     w11, [x9, #0x4a]
    mov      w12, #0xf69c
    eor      w11, w11, w12
    strh     w11, [x10, #0x4a]
    ldrh     w11, [x9, #0x4c]
    mov      w12, #0x35aa
    eor      w11, w11, w12
    strh     w11, [x10, #0x4c]
    ldrh     w11, [x9, #0x4e]
    mov      w12, #0xd9b4
    eor      w11, w11, w12
    strh     w11, [x10, #0x4e]
    ldrh     w11, [x9, #0x50]
    mov      w12, #0xb404
    eor      w11, w11, w12
    strh     w11, [x10, #0x50]
    ldrh     w11, [x9, #0x52]
    mov      w12, #0x96e2
    eor      w11, w11, w12
    strh     w11, [x10, #0x52]
    ldrh     w9, [x9, #0x54]
    mov      w11, #0x46c3
    eor      w9, w9, w11
    strh     w9, [x10, #0x54]
    adrp     x9, #0x579000
    add      x9, x9, #0x62e
    ldrh     w10, [x9]
    mov      w11, #0x736e
    adrp     x12, #0x579000
    add      x12, x12, #0x636
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x6fa7
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x456
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w9, [x9, #6]
    mov      w10, #0xb407
    eor      w9, w9, w10
    strh     w9, [x12, #6]
    adrp     x9, #0x579000
    add      x9, x9, #0x606
    ldrh     w10, [x9]
    mov      w11, #0x4bd
    eor      w10, w10, w11
    adrp     x11, #0x579000
    add      x11, x11, #0x60c
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x94a9
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x748d
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x579000
    add      x9, x9, #0x530
    ldrh     w10, [x9]
    mov      w11, #0x12ee
    adrp     x12, #0x579000
    add      x12, x12, #0x53a
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x992c
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0xec5a
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0xe132
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xa692
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x21, sp, #0x10
    mov      sp, x21
    sub      x22, sp, #0x30
    mov      sp, x22
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    cbz      x19, #0x454624
    adrp     x8, #0x4c4000
    ldr      x23, [x8, #0xb8]
    adrp     x8, #0x4bf000
    ldr      x26, [x8, #0x8d0]
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    cbz      x0, #0x454480
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    b        #0x454488
    adrp     x26, #0x579000
    add      x26, x26, #0x760
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    str      x26, [sp, #-0x10]!
    adrp     x2, #0x579000
    add      x2, x2, #0x720
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    add      sp, sp, #0x10
    mov      x23, x0
    cbz      x25, #0x4544c0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x310]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb00]
    adrp     x2, #0x579000
    add      x2, x2, #0x6a0
    mov      x3, x23
    mov      w4, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x28, #0x4c4000
    ldr      x0, [x28, #0x318]
    adrp     x8, #0x4bf000
    ldr      x26, [x8, #0xb08]
    adrp     x2, #0x579000
    add      x2, x2, #0x6e0
    mov      x1, x26
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4bf000
    ldr      x25, [x8, #0xb10]
    mov      x0, x24
    mov      x1, x25
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x20
    bl       #0x461c54 // _objc_initWeak
    ldr      x27, [x28, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x22]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x22, #8]
    adrp     x8, #0x454000
    add      x8, x8, #0x66c
    adrp     x9, #0x4a2000
    add      x9, x9, #0xca8
    stp      x8, x9, [x22, #0x10]
    add      x0, x22, #0x28
    mov      x1, x21
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x22, #0x20]
    adrp     x2, #0x579000
    add      x2, x2, #0x660
    mov      x0, x27
    mov      x1, x26
    mov      w3, #2
    mov      x4, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x24
    mov      x1, x25
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x20
    mov      x2, x24
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x22, #0x20]
    bl       #0x461c9c // _objc_release
    add      x0, x22, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x21
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    b        #0x454650
    mov      x19, x0
    add      x0, x22, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x21
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGThemeManageViewController applyTheme:] IMP=0x4546A8 bounds=0x4546A8-0x4549A0
loc_4546A8:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xcc0
    ldar     w9, [x8]
    cbnz     w9, #0x4548c4
    adrp     x9, #0x579000
    add      x9, x9, #0x7ce
    ldrh     w10, [x9]
    mov      w11, #0xec14
    eor      w10, w10, w11
    adrp     x11, #0x579000
    add      x11, x11, #0x7d8
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x8be9
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x918e
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xe977
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x2d1c
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x579000
    add      x9, x9, #0x7c0
    ldrb     w10, [x9]
    mov      w11, #0x32
    eor      w10, w10, w11
    adrp     x11, #0x579000
    add      x11, x11, #0x7c7
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xfffffffb
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0x3c
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xffffffe7
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x94
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0xb9
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w9, [x9, #6]
    mov      w10, #0xbc
    eor      w9, w9, w10
    strb     w9, [x11, #6]
    adrp     x9, #0x579000
    add      x9, x9, #0x7a0
    ldrh     w10, [x9]
    mov      w11, #0xf741
    adrp     x12, #0x579000
    add      x12, x12, #0x7b0
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x3707
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0xa712
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x738b
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0xb925
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w10, [x9, #0xa]
    mov      w11, #0xbd34
    eor      w10, w10, w11
    strh     w10, [x12, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w11, #0x96c2
    eor      w10, w10, w11
    strh     w10, [x12, #0xc]
    ldrh     w9, [x9, #0xe]
    mov      w10, #0x78f9
    eor      w9, w9, w10
    strh     w9, [x12, #0xe]
    adrp     x9, #0x579000
    add      x9, x9, #0x780
    ldrh     w10, [x9]
    mov      w11, #0x782b
    adrp     x12, #0x579000
    add      x12, x12, #0x790
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0xdb1a
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0xf6cf
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0xfdf0
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0x8f01
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w10, [x9, #0xa]
    mov      w11, #0xe21e
    eor      w10, w10, w11
    strh     w10, [x12, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w11, #0xe219
    eor      w10, w10, w11
    strh     w10, [x12, #0xc]
    ldrh     w9, [x9, #0xe]
    mov      w10, #0x775c
    eor      w9, w9, w10
    strh     w9, [x12, #0xe]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0x538]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x578]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x300]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x454974
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xed0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe70]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    adrp     x2, #0x579000
    add      x2, x2, #0x850
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x579000
    add      x8, x8, #0x890
    adrp     x9, #0x579000
    add      x9, x9, #0x810
    cmp      w0, #0
    csel     x2, x9, x8, ne
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf58]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    b        #0x45498c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf58]
    adrp     x2, #0x579000
    add      x2, x2, #0x8d0
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGThemeManageViewController removeLocal:] IMP=0x4549A0 bounds=0x4549A0-0x454B04
loc_4549A0:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xcc4
    ldar     w9, [x8]
    cbnz     w9, #0x454a90
    adrp     x9, #0x579000
    add      x9, x9, #0x904
    ldrh     w10, [x9]
    mov      w11, #0xafce
    eor      w10, w10, w11
    adrp     x11, #0x579000
    add      x11, x11, #0x910
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x63de
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x1bf
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xb8c5
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x2e4a
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w9, [x9, #0xa]
    mov      w10, #0xf213
    eor      w9, w9, w10
    strh     w9, [x11, #0xa]
    adrp     x9, #0x579000
    add      x9, x9, #0x8f0
    ldrh     w10, [x9]
    mov      w11, #0xc363
    adrp     x12, #0x579000
    add      x12, x12, #0x8fa
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x4787
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0xda00
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x25b4
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x86b6
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x20, [x8, #0x538]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x578]
    mov      x0, x2
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x3e0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x454ae4
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xed0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x2, #0x579000
    add      x2, x2, #0x980
    b        #0x454aec
    adrp     x2, #0x579000
    add      x2, x2, #0x940
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf58]
    mov      x0, x19
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c6c // _objc_msgSend

// -[WCLGThemeManageViewController revoke:] IMP=0x454B04 bounds=0x454B04-0x454CAC
loc_454B04:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xcc8
    ldar     w9, [x8]
    cbnz     w9, #0x454bc0
    adrp     x9, #0x579000
    add      x9, x9, #0x9a0
    ldrh     w10, [x9]
    mov      w11, #0x6ee2
    adrp     x12, #0x579000
    add      x12, x12, #0x9b0
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x9dda
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x2e17
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x9d1
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0xcd31
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w10, [x9, #0xa]
    mov      w11, #0x397c
    eor      w10, w10, w11
    strh     w10, [x12, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w11, #0x876d
    eor      w10, w10, w11
    strh     w10, [x12, #0xc]
    ldrh     w9, [x9, #0xe]
    mov      w10, #0x4e16
    eor      w9, w9, w10
    strh     w9, [x12, #0xe]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x24, sp
    sub      x21, x24, #0x30
    mov      sp, x21
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf58]
    adrp     x2, #0x579000
    add      x2, x2, #0x9e0
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x4b0]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x578]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    stur     x8, [x24, #-0x30]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    stur     d0, [x24, #-0x28]
    adrp     x8, #0x454000
    add      x8, x8, #0xcac
    adrp     x9, #0x4a5000
    add      x9, x9, #0xfc8
    stp      x8, x9, [x24, #-0x20]
    stp      x19, x20, [x24, #-0x10]
    adrp     x8, #0x4c3000
    ldr      x20, [x8, #0x3e8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    mov      x1, x20
    mov      x2, x23
    mov      x3, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x0, [x24, #-0x10]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    sub      sp, x29, #0x30
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    ret      

// -[WCLGThemeManageViewController toast:] IMP=0x454E24 bounds=0x454E24-0x454EA0
loc_454E24:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0x480]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x3d8]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xff0]
    mov      x0, x21
    mov      x2, x19
    mov      x3, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGThemeManageViewController dismissSelf] IMP=0x454EA0 bounds=0x454EA0-0x454EB4
loc_454EA0:
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb38]
    mov      w2, #1
    mov      x3, #0
    b        #0x461c6c // _objc_msgSend

// -[WCLGThemeManageViewController seg] IMP=0x454EB4 bounds=0x454EB4-0x454EC4
loc_454EB4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf58]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeManageViewController setSeg:] IMP=0x454EC4 bounds=0x454EC4-0x454ED8
loc_454EC4:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf58]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeManageViewController segBar] IMP=0x454ED8 bounds=0x454ED8-0x454EE8
loc_454ED8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf5c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeManageViewController setSegBar:] IMP=0x454EE8 bounds=0x454EE8-0x454EFC
loc_454EE8:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf5c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeManageViewController currentLabel] IMP=0x454EFC bounds=0x454EFC-0x454F0C
loc_454EFC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf60]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeManageViewController setCurrentLabel:] IMP=0x454F0C bounds=0x454F0C-0x454F20
loc_454F0C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf60]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeManageViewController bg] IMP=0x454F20 bounds=0x454F20-0x454F30
loc_454F20:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf64]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeManageViewController setBg:] IMP=0x454F30 bounds=0x454F30-0x454F44
loc_454F30:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf64]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeManageViewController tableView] IMP=0x454F44 bounds=0x454F44-0x454F54
loc_454F44:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf68]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeManageViewController setTableView:] IMP=0x454F54 bounds=0x454F54-0x454F68
loc_454F54:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf68]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeManageViewController emptyLabel] IMP=0x454F68 bounds=0x454F68-0x454F78
loc_454F68:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf6c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeManageViewController setEmptyLabel:] IMP=0x454F78 bounds=0x454F78-0x454F8C
loc_454F78:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf6c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeManageViewController bubbles] IMP=0x454F8C bounds=0x454F8C-0x454F9C
loc_454F8C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf70]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeManageViewController setBubbles:] IMP=0x454F9C bounds=0x454F9C-0x454FB0
loc_454F9C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf70]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeManageViewController cards] IMP=0x454FB0 bounds=0x454FB0-0x454FC0
loc_454FB0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf74]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeManageViewController setCards:] IMP=0x454FC0 bounds=0x454FC0-0x454FD4
loc_454FC0:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf74]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGThemeManageViewController catalogIconURLs] IMP=0x454FD4 bounds=0x454FD4-0x454FE4
loc_454FD4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf78]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGThemeManageViewController setCatalogIconURLs:] IMP=0x454FE4 bounds=0x454FE4-0x454FF0
loc_454FE4:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xf78]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGThemeManageViewController loadingCatalogIcons] IMP=0x454FF0 bounds=0x454FF0-0x455000
loc_454FF0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf7c]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGThemeManageViewController setLoadingCatalogIcons:] IMP=0x455000 bounds=0x455000-0x455010
loc_455000:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf7c]
    strb     w2, [x0, x8]
    ret      

// -[WCLGThemeManageViewController catalogIconsLoaded] IMP=0x455010 bounds=0x455010-0x455020
loc_455010:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf80]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGThemeManageViewController setCatalogIconsLoaded:] IMP=0x455020 bounds=0x455020-0x455030
loc_455020:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf80]
    strb     w2, [x0, x8]
    ret      

// -[WCLGThemeManageViewController .cxx_destruct] IMP=0x455030 bounds=0x455030-0x4550FC
loc_455030:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf78]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf74]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf70]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf6c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf68]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf64]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf60]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf5c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf58]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
