// Exact ARM64 listing for WCLGDownloadCenterViewController

// -[WCLGDownloadCenterViewController viewDidLoad] IMP=0x298154 bounds=0x298154-0x298F30
loc_298154:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x57f000
    add      x8, x8, #0xf0c
    ldar     w9, [x8]
    cbnz     w9, #0x2984e0
    adrp     x9, #0x530000
    add      x9, x9, #0x390
    ldrh     w10, [x9]
    mov      w11, #0xf33c
    adrp     x12, #0x530000
    add      x12, x12, #0x396
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0xbd9e
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x6501
    eor      w9, w9, w10
    strh     w9, [x12, #4]
    adrp     x9, #0x530000
    add      x9, x9, #0x2f0
    ldrb     w10, [x9]
    eor      w10, w10, #0xf
    adrp     x11, #0x530000
    add      x11, x11, #0x2f5
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x64
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x93
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0x1f
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0x8b
    eor      w9, w9, w10
    strb     w9, [x11, #4]
    adrp     x9, #0x530000
    add      x9, x9, #0x37c
    ldrh     w10, [x9]
    mov      w11, #0x5cd9
    eor      w10, w10, w11
    adrp     x11, #0x530000
    add      x11, x11, #0x386
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x76f0
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x980f
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x428a
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x6fcc
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x530000
    add      x9, x9, #0x320
    ldrh     w10, [x9]
    mov      w11, #0xe026
    eor      w11, w10, w11
    adrp     x10, #0x530000
    add      x10, x10, #0x350
    strh     w11, [x10]
    ldrh     w11, [x9, #2]
    mov      w12, #0x80f3
    eor      w11, w11, w12
    strh     w11, [x10, #2]
    ldrh     w11, [x9, #4]
    mov      w12, #0xe591
    eor      w11, w11, w12
    strh     w11, [x10, #4]
    ldrh     w11, [x9, #6]
    mov      w12, #0x94f
    eor      w11, w11, w12
    strh     w11, [x10, #6]
    ldrh     w11, [x9, #8]
    mov      w12, #0xbd58
    eor      w11, w11, w12
    strh     w11, [x10, #8]
    ldrh     w11, [x9, #0xa]
    mov      w12, #0x4354
    eor      w11, w11, w12
    strh     w11, [x10, #0xa]
    ldrh     w11, [x9, #0xc]
    mov      w12, #0x1d68
    eor      w11, w11, w12
    strh     w11, [x10, #0xc]
    ldrh     w11, [x9, #0xe]
    mov      w12, #0x28b0
    eor      w11, w11, w12
    strh     w11, [x10, #0xe]
    ldrh     w11, [x9, #0x10]
    mov      w12, #0xb15d
    eor      w11, w11, w12
    strh     w11, [x10, #0x10]
    ldrh     w11, [x9, #0x12]
    mov      w12, #0x8eb5
    eor      w11, w11, w12
    strh     w11, [x10, #0x12]
    ldrh     w11, [x9, #0x14]
    mov      w12, #0x900c
    eor      w11, w11, w12
    strh     w11, [x10, #0x14]
    ldrh     w11, [x9, #0x16]
    mov      w12, #0xa4bd
    eor      w11, w11, w12
    strh     w11, [x10, #0x16]
    ldrh     w11, [x9, #0x18]
    mov      w12, #0xeacd
    eor      w11, w11, w12
    strh     w11, [x10, #0x18]
    ldrh     w11, [x9, #0x1a]
    mov      w12, #0xdc60
    eor      w11, w11, w12
    strh     w11, [x10, #0x1a]
    ldrh     w11, [x9, #0x1c]
    mov      w12, #0xb94b
    eor      w11, w11, w12
    strh     w11, [x10, #0x1c]
    ldrh     w11, [x9, #0x1e]
    mov      w12, #0xbf77
    eor      w11, w11, w12
    strh     w11, [x10, #0x1e]
    ldrh     w11, [x9, #0x20]
    mov      w12, #0x6fbe
    eor      w11, w11, w12
    strh     w11, [x10, #0x20]
    ldrh     w11, [x9, #0x22]
    mov      w12, #0xff49
    eor      w11, w11, w12
    strh     w11, [x10, #0x22]
    ldrh     w11, [x9, #0x24]
    mov      w12, #0x9ca8
    eor      w11, w11, w12
    strh     w11, [x10, #0x24]
    ldrh     w11, [x9, #0x26]
    mov      w12, #0xe50e
    eor      w11, w11, w12
    strh     w11, [x10, #0x26]
    ldrh     w11, [x9, #0x28]
    mov      w12, #0xeba7
    eor      w11, w11, w12
    strh     w11, [x10, #0x28]
    ldrh     w9, [x9, #0x2a]
    mov      w11, #0x6671
    eor      w9, w9, w11
    strh     w9, [x10, #0x2a]
    adrp     x9, #0x530000
    add      x9, x9, #0x306
    ldrh     w10, [x9]
    mov      w11, #0x7c42
    eor      w10, w10, w11
    adrp     x11, #0x530000
    add      x11, x11, #0x30c
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x9f71
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x929a
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x530000
    add      x9, x9, #0x39c
    ldrh     w10, [x9]
    mov      w11, #0x5218
    eor      w10, w10, w11
    adrp     x11, #0x530000
    add      x11, x11, #0x3a6
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xe0bf
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x3bfb
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xc344
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xbad0
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x530000
    add      x9, x9, #0x2fa
    ldrh     w10, [x9]
    mov      w11, #0x2701
    eor      w10, w10, w11
    adrp     x11, #0x530000
    add      x11, x11, #0x300
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x9c57
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0xa540
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x8, sp
    sub      x0, x8, #0x10
    mov      sp, x0
    mov      x23, sp
    sub      x24, x23, #0x10
    mov      sp, x24
    mov      x25, sp
    sub      x9, x25, #0x10
    stur     x9, [x29, #-0x80]
    mov      sp, x9
    adrp     x9, #0x4c4000
    ldr      x9, [x9, #0x780]
    stp      x19, x9, [x8, #-0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc80]
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb80]
    adrp     x2, #0x530000
    add      x2, x2, #0x410
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0xab8]
    mov      x1, x27
    stur     x27, [x29, #-0x88]
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
    ldr      x28, [x8, #0x460]
    mov      x1, x28
    stur     x28, [x29, #-0x90]
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
    adrp     x21, #0x4c4000
    ldr      x0, [x21, #0x328]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x4, [x8, #0xed0]
    stur     x4, [x29, #-0x70]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xba8]
    mov      w2, #0xd
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    stur     x0, [x29, #-0x60]
    ldr      x0, [x21, #0x328]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x5, [x8, #0xed8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x650]
    adrp     x2, #0x530000
    add      x2, x2, #0x510
    mov      x3, #0
    mov      x4, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    stur     x0, [x29, #-0x68]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xeb0]
    adrp     x2, #0x530000
    add      x2, x2, #0x550
    bl       #0x461c6c // _objc_msgSend
    stp      x22, x21, [x23, #-0x10]
    adrp     x26, #0x4c4000
    ldr      x0, [x26, #0x98]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x470]
    mov      x1, x21
    mov      x2, x24
    mov      w3, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbb0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x380]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461bac // _objc_alloc_init
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xee0]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0xee8]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x28
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x24
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
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0xb40]
    mov      x0, x23
    mov      x1, x24
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x468]
    bl       #0x461ba0 // _objc_alloc
    mov      x23, x0
    adrp     x8, #0x530000
    add      x8, x8, #0x490
    adrp     x9, #0x530000
    add      x9, x9, #0x450
    stp      x8, x9, [x25, #-0x10]
    ldr      x0, [x26, #0x98]
    mov      x1, x21
    ldur     x2, [x29, #-0x80]
    mov      w3, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa10]
    mov      x0, x23
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xef0]
    mov      x0, x19
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0xef8]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa28]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x3, [x8, #0xf00]
    adrp     x8, #0x4bf000
    ldr      x28, [x8, #0xec8]
    mov      x1, x28
    mov      x2, x19
    mov      w4, #0x1000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
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
    mov      x0, x22
    mov      x1, x24
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa0]
    bl       #0x461ba0 // _objc_alloc
    mov      x21, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf08]
    mov      x0, x21
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf10]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    ldur     x1, [x29, #-0x88]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x27, [x8, #0x628]
    mov      x0, x19
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x90]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf18]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbf0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc78]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x638]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x9a8]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x498]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf20]
    adrp     x3, #0x530000
    add      x3, x3, #0x4d0
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x4a0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x908]
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    mov      x1, x28
    mov      x2, x19
    ldur     x23, [x29, #-0x70]
    mov      x3, x23
    mov      w4, #0x1000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf28]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x19
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x21
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x4a8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf30]
    mov      w2, #0x64
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf38]
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
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf40]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x21
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461bac // _objc_alloc_init
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc08]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x26, [x8, #0xc10]
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    adrp     x2, #0x530000
    add      x2, x2, #0x3d0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x7f8]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1f8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc18]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x800]
    fmov     d0, #14.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    mov      x1, x24
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x68]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x60]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x298f2c
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGDownloadCenterViewController viewDidLayoutSubviews] IMP=0x298F30 bounds=0x298F30-0x2991B8
loc_298F30:
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
    ldr      x8, [x8, #0x780]
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
    fmov     d10, d0
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
    fmov     d8, d2
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
    mov      x8, #0x404a000000000000
    fmov     d12, x8
    fmov     d0, xzr
    mov      x1, x20
    fmov     d1, d10
    fmov     d2, d8
    fmov     d3, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x8, #-0x3fbc000000000000
    fmov     d0, x8
    fadd     d9, d8, d0
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x518]
    fcmp     d9, d0
    fcsel    d13, d0, d9, gt
    fsub     d0, d8, d13
    fmov     d15, #0.50000000
    fmul     d14, d0, d15
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xef8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x8, #0x4040000000000000
    fmov     d3, x8
    fmov     d1, #10.00000000
    mov      x1, x20
    fmov     d0, d14
    fmov     d2, d13
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    fadd     d10, d10, d12
    fsub     d11, d11, d10
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x628]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    fmov     d0, xzr
    mov      x1, x20
    fmov     d1, d10
    fmov     d2, d8
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    fmul     d8, d8, d15
    fmul     d0, d11, d15
    fadd     d11, d10, d0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf40]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xe0]
    fmov     d0, d8
    fmov     d1, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x8, #0x404e000000000000
    fmov     d0, x8
    fadd     d8, d10, d0
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
    fmov     d2, d9
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

// -[WCLGDownloadCenterViewController segChanged] IMP=0x2991B8 bounds=0x2991B8-0x29920C
loc_2991B8:
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
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf48]
    mov      x0, x19
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c6c // _objc_msgSend

// -[WCLGDownloadCenterViewController openRedeemCenter] IMP=0x29920C bounds=0x29920C-0x29964C
loc_29920C:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x57f000
    add      x8, x8, #0xf18
    ldar     w9, [x8]
    cbnz     w9, #0x299570
    adrp     x9, #0x530000
    add      x9, x9, #0x5f0
    ldrb     w10, [x9]
    mov      w11, #0xd1
    eor      w11, w10, w11
    adrp     x10, #0x530000
    add      x10, x10, #0x610
    strb     w11, [x10]
    ldrb     w11, [x9, #1]
    mov      w12, #0xb6
    eor      w11, w11, w12
    strb     w11, [x10, #1]
    ldrb     w11, [x9, #2]
    mov      w12, #0x5a
    eor      w11, w11, w12
    strb     w11, [x10, #2]
    ldrb     w11, [x9, #3]
    mov      w12, #0x47
    eor      w11, w11, w12
    strb     w11, [x10, #3]
    ldrb     w11, [x9, #4]
    mov      w12, #0x36
    eor      w11, w11, w12
    strb     w11, [x10, #4]
    ldrb     w11, [x9, #5]
    mov      w12, #0x61
    eor      w11, w11, w12
    strb     w11, [x10, #5]
    ldrb     w11, [x9, #6]
    eor      w11, w11, #0xfffffff1
    strb     w11, [x10, #6]
    ldrb     w11, [x9, #7]
    mov      w12, #0xbc
    eor      w11, w11, w12
    strb     w11, [x10, #7]
    ldrb     w11, [x9, #8]
    mov      w12, #0x3b
    eor      w11, w11, w12
    strb     w11, [x10, #8]
    ldrb     w11, [x9, #9]
    eor      w11, w11, #0xfc
    strb     w11, [x10, #9]
    ldrb     w11, [x9, #0xa]
    mov      w12, #0xbd
    eor      w11, w11, w12
    strb     w11, [x10, #0xa]
    ldrb     w11, [x9, #0xb]
    mov      w12, #0xfa
    eor      w11, w11, w12
    strb     w11, [x10, #0xb]
    ldrb     w11, [x9, #0xc]
    mov      w12, #0xd7
    eor      w11, w11, w12
    strb     w11, [x10, #0xc]
    ldrb     w11, [x9, #0xd]
    mov      w12, #0x45
    eor      w11, w11, w12
    strb     w11, [x10, #0xd]
    ldrb     w11, [x9, #0xe]
    mov      w12, #0xc9
    eor      w11, w11, w12
    strb     w11, [x10, #0xe]
    ldrb     w11, [x9, #0xf]
    mov      w12, #0x35
    eor      w11, w11, w12
    strb     w11, [x10, #0xf]
    ldrb     w11, [x9, #0x10]
    mov      w12, #0xd5
    eor      w11, w11, w12
    strb     w11, [x10, #0x10]
    ldrb     w11, [x9, #0x11]
    eor      w11, w11, #0xf
    strb     w11, [x10, #0x11]
    ldrb     w11, [x9, #0x12]
    mov      w12, #0x93
    eor      w11, w11, w12
    strb     w11, [x10, #0x12]
    ldrb     w11, [x9, #0x13]
    mov      w12, #0xa5
    eor      w11, w11, w12
    strb     w11, [x10, #0x13]
    ldrb     w11, [x9, #0x14]
    eor      w11, w11, #0xffffffc3
    strb     w11, [x10, #0x14]
    ldrb     w11, [x9, #0x15]
    mov      w12, #0x1b
    eor      w11, w11, w12
    strb     w11, [x10, #0x15]
    ldrb     w11, [x9, #0x16]
    mov      w12, #0xb3
    eor      w11, w11, w12
    strb     w11, [x10, #0x16]
    ldrb     w9, [x9, #0x17]
    mov      w11, #0xa9
    eor      w9, w9, w11
    strb     w9, [x10, #0x17]
    adrp     x9, #0x530000
    add      x9, x9, #0x5b0
    ldrh     w10, [x9]
    mov      w11, #0x9d60
    eor      w11, w10, w11
    adrp     x10, #0x530000
    add      x10, x10, #0x5d0
    strh     w11, [x10]
    ldrh     w11, [x9, #2]
    mov      w12, #0x5910
    eor      w11, w11, w12
    strh     w11, [x10, #2]
    ldrh     w11, [x9, #4]
    mov      w12, #0x477f
    eor      w11, w11, w12
    strh     w11, [x10, #4]
    ldrh     w11, [x9, #6]
    mov      w12, #0xd872
    eor      w11, w11, w12
    strh     w11, [x10, #6]
    ldrh     w11, [x9, #8]
    mov      w12, #0xad2f
    eor      w11, w11, w12
    strh     w11, [x10, #8]
    ldrh     w11, [x9, #0xa]
    mov      w12, #0xe58d
    eor      w11, w11, w12
    strh     w11, [x10, #0xa]
    ldrh     w11, [x9, #0xc]
    mov      w12, #0xc88d
    eor      w11, w11, w12
    strh     w11, [x10, #0xc]
    ldrh     w11, [x9, #0xe]
    mov      w12, #0x4529
    eor      w11, w11, w12
    strh     w11, [x10, #0xe]
    ldrh     w11, [x9, #0x10]
    mov      w12, #0x35e8
    eor      w11, w11, w12
    strh     w11, [x10, #0x10]
    ldrh     w11, [x9, #0x12]
    mov      w12, #0x1862
    eor      w11, w11, w12
    strh     w11, [x10, #0x12]
    ldrh     w11, [x9, #0x14]
    mov      w12, #0xe9f9
    eor      w11, w11, w12
    strh     w11, [x10, #0x14]
    ldrh     w11, [x9, #0x16]
    mov      w12, #0x7195
    eor      w11, w11, w12
    strh     w11, [x10, #0x16]
    ldrh     w11, [x9, #0x18]
    mov      w12, #0x17c
    eor      w11, w11, w12
    strh     w11, [x10, #0x18]
    ldrh     w11, [x9, #0x1a]
    mov      w12, #0xad2a
    eor      w11, w11, w12
    strh     w11, [x10, #0x1a]
    ldrh     w11, [x9, #0x1c]
    mov      w12, #0x8072
    eor      w11, w11, w12
    strh     w11, [x10, #0x1c]
    ldrh     w9, [x9, #0x1e]
    mov      w11, #0x842b
    eor      w9, w9, w11
    strh     w9, [x10, #0x1e]
    adrp     x9, #0x530000
    add      x9, x9, #0x570
    ldrh     w10, [x9]
    mov      w11, #0xfb05
    eor      w10, w10, w11
    adrp     x11, #0x530000
    add      x11, x11, #0x590
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xa599
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x10de
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x7f52
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x13d7
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0x5717
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0x8723
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w10, [x9, #0xe]
    mov      w12, #0x3dbc
    eor      w10, w10, w12
    strh     w10, [x11, #0xe]
    ldrh     w10, [x9, #0x10]
    mov      w12, #0x1ff7
    eor      w10, w10, w12
    strh     w10, [x11, #0x10]
    ldrh     w9, [x9, #0x12]
    mov      w10, #0x790
    eor      w9, w9, w10
    strh     w9, [x11, #0x12]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x4b0]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf50]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x299620
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2e0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xa00]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xa08]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x0, #0x530000
    add      x0, x0, #0x6d0
    bl       #0xce348
    tbnz     w0, #0, #0x299638
    adrp     x2, #0x530000
    add      x2, x2, #0x650
    b        #0x299628
    adrp     x2, #0x530000
    add      x2, x2, #0x690
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf58]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGDownloadCenterViewController reload] IMP=0x29964C bounds=0x29964C-0x299788
loc_29964C:
    sub      sp, sp, #0x70
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf60]
    bl       #0x461c6c // _objc_msgSend
    add      x19, x0, #1
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf68]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf40]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf70]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    sub      x0, x29, #0x28
    mov      x1, x20
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x4b0]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp, #8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    adrp     x8, #0x299000
    add      x8, x8, #0x788
    str      d0, [sp, #0x10]
    adrp     x9, #0x4a4000
    add      x9, x9, #0xe8
    stp      x8, x9, [sp, #0x18]
    add      x21, sp, #8
    add      x0, x21, #0x20
    sub      x1, x29, #0x28
    bl       #0x461c00 // _objc_copyWeak
    str      x19, [sp, #0x30]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xfb0]
    add      x2, sp, #8
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    add      x0, x21, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    sub      x0, x29, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    add      sp, sp, #0x70
    ret      
    mov      x19, x0
    add      x0, x21, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    b        #0x299778
    mov      x19, x0
    sub      x0, x29, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGDownloadCenterViewController current] IMP=0x299DD4 bounds=0x299DD4-0x299E50
loc_299DD4:
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

// -[WCLGDownloadCenterViewController updateEmpty] IMP=0x299E50 bounds=0x299E50-0x299ED8
loc_299E50:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xfc8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    cset     w21, ne
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc10]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGDownloadCenterViewController tableView:numberOfRowsInSection:] IMP=0x299ED8 bounds=0x299ED8-0x299F24
loc_299ED8:
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
    mov      x0, x20
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    ret      

// -[WCLGDownloadCenterViewController tableView:cellForRowAtIndexPath:] IMP=0x299F24 bounds=0x299F24-0x29A078
loc_299F24:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x3
    mov      x21, x2
    mov      x20, x0
    adrp     x8, #0x57f000
    add      x8, x8, #0xf44
    ldar     w9, [x8]
    cbnz     w9, #0x299fac
    adrp     x9, #0x530000
    add      x9, x9, #0x750
    ldrb     w10, [x9]
    mov      w11, #0x24
    eor      w10, w10, w11
    adrp     x11, #0x530000
    add      x11, x11, #0x755
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xffffffc1
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x91
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x61
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0x39
    eor      w9, w9, w10
    strb     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0xfd0]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x2, #0x530000
    add      x2, x2, #0x780
    mov      x0, x21
    mov      x1, x22
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xfc8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5f0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xfd8]
    mov      x0, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGDownloadCenterViewController tableView:didSelectRowAtIndexPath:] IMP=0x29A078 bounds=0x29A078-0x29A140
loc_29A078:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x3
    mov      x20, x2
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x738]
    mov      x0, x3
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x22
    mov      x2, x19
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xfc8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5f0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xfe0]
    mov      x0, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGDownloadCenterViewController showDetail:] IMP=0x29A140 bounds=0x29A140-0x29A2B8
loc_29A140:
    sub      sp, sp, #0x70
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    add      x0, sp, #0x28
    mov      x1, x20
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x4b8]
    bl       #0x461ba0 // _objc_alloc
    mov      x21, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    adrp     x8, #0x29a000
    add      x8, x8, #0x2b8
    str      d0, [sp, #8]
    adrp     x9, #0x4a4000
    add      x9, x9, #0x118
    stp      x8, x9, [sp, #0x10]
    mov      x24, sp
    add      x0, x24, #0x20
    add      x1, sp, #0x28
    bl       #0x461c00 // _objc_copyWeak
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xfe8]
    mov      x3, sp
    mov      x0, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xb20]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    bl       #0x461c9c // _objc_release
    cbz      x23, #0x29a23c
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xe38]
    mov      x2, x21
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    b        #0x29a258
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x20
    mov      x2, x21
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    add      x0, x24, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, sp, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    add      sp, sp, #0x70
    ret      
    b        #0x29a29c
    mov      x19, x0
    b        #0x29a2a8
    mov      x19, x0
    add      x0, x24, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, sp, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGDownloadCenterViewController dismissSelf] IMP=0x29A2EC bounds=0x29A2EC-0x29A300
loc_29A2EC:
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb38]
    mov      w2, #1
    mov      x3, #0
    b        #0x461c6c // _objc_msgSend

// -[WCLGDownloadCenterViewController toast:] IMP=0x29A300 bounds=0x29A300-0x29A37C
loc_29A300:
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

// -[WCLGDownloadCenterViewController seg] IMP=0x29A37C bounds=0x29A37C-0x29A38C
loc_29A37C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb6c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGDownloadCenterViewController setSeg:] IMP=0x29A38C bounds=0x29A38C-0x29A3A0
loc_29A38C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb6c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGDownloadCenterViewController segBar] IMP=0x29A3A0 bounds=0x29A3A0-0x29A3B0
loc_29A3A0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb70]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGDownloadCenterViewController setSegBar:] IMP=0x29A3B0 bounds=0x29A3B0-0x29A3C4
loc_29A3B0:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb70]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGDownloadCenterViewController bg] IMP=0x29A3C4 bounds=0x29A3C4-0x29A3D4
loc_29A3C4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb74]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGDownloadCenterViewController setBg:] IMP=0x29A3D4 bounds=0x29A3D4-0x29A3E8
loc_29A3D4:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb74]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGDownloadCenterViewController tableView] IMP=0x29A3E8 bounds=0x29A3E8-0x29A3F8
loc_29A3E8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb78]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGDownloadCenterViewController setTableView:] IMP=0x29A3F8 bounds=0x29A3F8-0x29A40C
loc_29A3F8:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb78]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGDownloadCenterViewController spinner] IMP=0x29A40C bounds=0x29A40C-0x29A41C
loc_29A40C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb7c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGDownloadCenterViewController setSpinner:] IMP=0x29A41C bounds=0x29A41C-0x29A430
loc_29A41C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb7c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGDownloadCenterViewController emptyLabel] IMP=0x29A430 bounds=0x29A430-0x29A440
loc_29A430:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb80]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGDownloadCenterViewController setEmptyLabel:] IMP=0x29A440 bounds=0x29A440-0x29A454
loc_29A440:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb80]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGDownloadCenterViewController bubbles] IMP=0x29A454 bounds=0x29A454-0x29A464
loc_29A454:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb84]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGDownloadCenterViewController setBubbles:] IMP=0x29A464 bounds=0x29A464-0x29A478
loc_29A464:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb84]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGDownloadCenterViewController cards] IMP=0x29A478 bounds=0x29A478-0x29A488
loc_29A478:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb88]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGDownloadCenterViewController setCards:] IMP=0x29A488 bounds=0x29A488-0x29A49C
loc_29A488:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb88]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGDownloadCenterViewController reloadGeneration] IMP=0x29A49C bounds=0x29A49C-0x29A4AC
loc_29A49C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb8c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGDownloadCenterViewController setReloadGeneration:] IMP=0x29A4AC bounds=0x29A4AC-0x29A4BC
loc_29A4AC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb8c]
    str      x2, [x0, x8]
    ret      

// -[WCLGDownloadCenterViewController .cxx_destruct] IMP=0x29A4BC bounds=0x29A4BC-0x29A574
loc_29A4BC:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb88]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb84]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb80]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb7c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb78]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb74]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb70]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb6c]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
