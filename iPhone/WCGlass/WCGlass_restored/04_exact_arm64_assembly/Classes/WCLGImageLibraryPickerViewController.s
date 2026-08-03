// Exact ARM64 listing for WCLGImageLibraryPickerViewController

// -[WCLGImageLibraryPickerViewController initWithCategory:title:onPick:] IMP=0x11B3D0 bounds=0x11B3D0-0x11B558
loc_11B3D0:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x21, x4
    mov      x20, x3
    mov      x19, x2
    mov      x22, x0
    adrp     x8, #0x57d000
    add      x8, x8, #0xf18
    ldar     w9, [x8]
    cbnz     w9, #0x11b454
    adrp     x9, #0x4ed000
    add      x9, x9, #0x7f0
    ldrh     w10, [x9]
    mov      w11, #0x554e
    eor      w10, w10, w11
    adrp     x11, #0x4ed000
    add      x11, x11, #0x7f8
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xe70e
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x4af8
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w9, [x9, #6]
    mov      w10, #0xac1e
    eor      w9, w9, w10
    strh     w9, [x11, #6]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x24, sp
    sub      x23, x24, #0x10
    mov      sp, x23
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x700]
    stp      x22, x8, [x24, #-0x10]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb78]
    mov      x0, x23
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x22, x0
    cbz      x0, #0x11b524
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x900]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0x8f8]
    ldr      x8, [x22, x9]
    str      x0, [x22, x9]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0x8fc]
    ldr      x8, [x22, x9]
    str      x0, [x22, x9]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4ed000
    add      x8, x8, #0x820
    cmp      x0, #0
    csel     x2, x8, x20, eq
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb80]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    sub      sp, x29, #0x30
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    ret      

// -[WCLGImageLibraryPickerViewController viewDidLoad] IMP=0x11B558 bounds=0x11B558-0x11BE80
loc_11B558:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x0
    adrp     x8, #0x57d000
    add      x8, x8, #0xf1c
    ldar     w9, [x8]
    cbnz     w9, #0x11b7ec
    adrp     x9, #0x4ed000
    add      x9, x9, #0x8c0
    ldrb     w10, [x9]
    eor      w10, w10, #0xbbbbbbbb
    adrp     x11, #0x4ed000
    add      x11, x11, #0x8c5
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xd2
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xe5
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xffffffbf
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    eor      w9, w9, #0x88888888
    strb     w9, [x11, #4]
    adrp     x9, #0x4ed000
    add      x9, x9, #0x840
    ldrh     w11, [x9]
    mov      w12, #0x12f7
    adrp     x10, #0x4ed000
    add      x10, x10, #0x880
    eor      w11, w11, w12
    strh     w11, [x10]
    ldrh     w11, [x9, #2]
    mov      w12, #0xf96f
    eor      w11, w11, w12
    strh     w11, [x10, #2]
    ldrh     w11, [x9, #4]
    mov      w12, #0x7b72
    eor      w11, w11, w12
    strh     w11, [x10, #4]
    ldrh     w11, [x9, #6]
    mov      w12, #0x617a
    eor      w11, w11, w12
    strh     w11, [x10, #6]
    ldrh     w11, [x9, #8]
    mov      w12, #0xfafd
    eor      w11, w11, w12
    strh     w11, [x10, #8]
    ldrh     w11, [x9, #0xa]
    mov      w12, #0x9963
    eor      w11, w11, w12
    strh     w11, [x10, #0xa]
    ldrh     w11, [x9, #0xc]
    mov      w12, #0x8865
    eor      w11, w11, w12
    strh     w11, [x10, #0xc]
    ldrh     w11, [x9, #0xe]
    mov      w12, #0xac46
    eor      w11, w11, w12
    strh     w11, [x10, #0xe]
    ldrh     w11, [x9, #0x10]
    mov      w12, #0xb49e
    eor      w11, w11, w12
    strh     w11, [x10, #0x10]
    ldrh     w11, [x9, #0x12]
    mov      w12, #0x6633
    eor      w11, w11, w12
    strh     w11, [x10, #0x12]
    ldrh     w11, [x9, #0x14]
    mov      w12, #0x7ffa
    eor      w11, w11, w12
    strh     w11, [x10, #0x14]
    ldrh     w11, [x9, #0x16]
    mov      w12, #0x965b
    eor      w11, w11, w12
    strh     w11, [x10, #0x16]
    ldrh     w11, [x9, #0x18]
    mov      w12, #0x23ad
    eor      w11, w11, w12
    strh     w11, [x10, #0x18]
    ldrh     w11, [x9, #0x1a]
    mov      w12, #0xbf2f
    eor      w11, w11, w12
    strh     w11, [x10, #0x1a]
    ldrh     w11, [x9, #0x1c]
    mov      w12, #0xd219
    eor      w11, w11, w12
    strh     w11, [x10, #0x1c]
    ldrh     w11, [x9, #0x1e]
    mov      w12, #0x1b5f
    eor      w11, w11, w12
    strh     w11, [x10, #0x1e]
    ldrh     w11, [x9, #0x20]
    mov      w12, #0x2e64
    eor      w11, w11, w12
    strh     w11, [x10, #0x20]
    ldrh     w11, [x9, #0x22]
    mov      w12, #0xe25
    eor      w11, w11, w12
    strh     w11, [x10, #0x22]
    ldrh     w11, [x9, #0x24]
    mov      w12, #0x72a1
    eor      w11, w11, w12
    strh     w11, [x10, #0x24]
    ldrh     w11, [x9, #0x26]
    mov      w12, #0x915c
    eor      w11, w11, w12
    strh     w11, [x10, #0x26]
    ldrh     w11, [x9, #0x28]
    mov      w12, #0x9515
    eor      w11, w11, w12
    strh     w11, [x10, #0x28]
    ldrh     w11, [x9, #0x2a]
    mov      w12, #0xdd25
    eor      w11, w11, w12
    strh     w11, [x10, #0x2a]
    ldrh     w11, [x9, #0x2c]
    mov      w12, #0xd7e5
    eor      w11, w11, w12
    strh     w11, [x10, #0x2c]
    ldrh     w11, [x9, #0x2e]
    mov      w12, #0x3da6
    eor      w11, w11, w12
    strh     w11, [x10, #0x2e]
    ldrh     w11, [x9, #0x30]
    mov      w12, #0x6962
    eor      w11, w11, w12
    strh     w11, [x10, #0x30]
    ldrh     w11, [x9, #0x32]
    mov      w12, #0x2621
    eor      w11, w11, w12
    strh     w11, [x10, #0x32]
    ldrh     w11, [x9, #0x34]
    mov      w12, #0xc5d9
    eor      w11, w11, w12
    strh     w11, [x10, #0x34]
    ldrh     w11, [x9, #0x36]
    mov      w12, #0xf08b
    eor      w11, w11, w12
    strh     w11, [x10, #0x36]
    ldrh     w11, [x9, #0x38]
    mov      w12, #0x2ad1
    eor      w11, w11, w12
    strh     w11, [x10, #0x38]
    ldrh     w11, [x9, #0x3a]
    mov      w12, #0x7d12
    eor      w11, w11, w12
    strh     w11, [x10, #0x3a]
    ldrh     w11, [x9, #0x3c]
    mov      w12, #0x1f83
    eor      w11, w11, w12
    strh     w11, [x10, #0x3c]
    ldrh     w9, [x9, #0x3e]
    mov      w11, #0x88a7
    eor      w9, w9, w11
    strh     w9, [x10, #0x3e]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x8, sp
    sub      x0, x8, #0x10
    mov      sp, x0
    adrp     x9, #0x4c4000
    ldr      x9, [x9, #0x700]
    stp      x19, x9, [x8, #-0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc80]
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x28, #0x4c4000
    ldr      x0, [x28, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb88]
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
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x460]
    mov      x1, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb90]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x39d784
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb98]
    mov      x0, x19
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x328]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4bf000
    ldr      x4, [x8, #0xba0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xba8]
    mov      w2, #0x18
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbb0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbb8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x330]
    bl       #0x461bac // _objc_alloc_init
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbc0]
    fmov     d0, #10.00000000
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbc8]
    fmov     d0, #10.00000000
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbd0]
    fmov     d0, #14.00000000
    fmov     d1, #14.00000000
    fmov     d2, #14.00000000
    fmov     d3, #14.00000000
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x338]
    bl       #0x461ba0 // _objc_alloc
    mov      x24, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x4d8]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbd8]
    mov      x0, x24
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbe0]
    mov      x0, x19
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x25, [x8, #0xbe8]
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x448]
    mov      x1, x24
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldr      x0, [x28, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x1, x22
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbf0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc78]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbf8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x340]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc00]
    adrp     x3, #0x4ed000
    add      x3, x3, #0x930
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xb40]
    mov      x0, x26
    mov      x1, x22
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x25, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc08]
    mov      x0, x19
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0xc10]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x1, x24
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    adrp     x2, #0x4ed000
    add      x2, x2, #0x8f0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x7f8]
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
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1f8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x800]
    fmov     d0, #14.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldr      x0, [x28, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc18]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x20
    mov      x1, x22
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x110]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    cset     w22, ne
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      

// -[WCLGImageLibraryPickerViewController closeTapped] IMP=0x11BE80 bounds=0x11BE80-0x11BE94
loc_11BE80:
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb38]
    mov      w2, #1
    mov      x3, #0
    b        #0x461c6c // _objc_msgSend

// -[WCLGImageLibraryPickerViewController collectionView:numberOfItemsInSection:] IMP=0x11BE94 bounds=0x11BE94-0x11BEE0
loc_11BE94:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x110]
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

// -[WCLGImageLibraryPickerViewController collectionView:layout:sizeForItemAtIndexPath:] IMP=0x11BEE0 bounds=0x11BEE0-0x11BF58
loc_11BEE0:
    stp      d9, d8, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbe8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    mov      x8, #-0x3fb8000000000000
    fmov     d1, x8
    fadd     d0, d0, d1
    fmov     d1, #3.00000000
    fdiv     d0, d0, d1
    frintm   d8, d0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x8, #0x404e000000000000
    fmov     d0, x8
    fmaxnm   d0, d8, d0
    fmov     d1, d0
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      d9, d8, [sp], #0x30
    ret      

// -[WCLGImageLibraryPickerViewController collectionView:cellForItemAtIndexPath:] IMP=0x11BF58 bounds=0x11BF58-0x11C2C8
loc_11BF58:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x3
    mov      x20, x2
    mov      x21, x0
    adrp     x8, #0x57d000
    add      x8, x8, #0xf2c
    ldar     w9, [x8]
    cbnz     w9, #0x11bfe4
    adrp     x9, #0x4ed000
    add      x9, x9, #0x950
    ldrb     w10, [x9]
    mov      w11, #0xed
    eor      w10, w10, w11
    adrp     x11, #0x4ed000
    add      x11, x11, #0x955
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xeeeeeeee
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xffffffcf
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x45
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    eor      w9, w9, #0xfe
    strb     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc20]
    adrp     x2, #0x4ed000
    add      x2, x2, #0x980
    mov      x0, x20
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xaf0]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc28]
    mov      w2, #0x1e6c
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x24, #0x4c4000
    ldr      x0, [x24, #0x88]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x11c194
    ldr      x0, [x24, #0x88]
    bl       #0x461ba0 // _objc_alloc
    mov      x24, x0
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc30]
    mov      x0, x24
    mov      w2, #0x1e6c
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x448]
    mov      x0, x24
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x430]
    mov      x0, x24
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    mov      x0, x24
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    mov      x0, x24
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
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x22, x24
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x168]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    adrp     x8, #0x4bf000
    ldr      x24, [x8, #0x110]
    mov      x0, x21
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    cmp      x25, x27
    b.ge     #0x11c298
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb90]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x21
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x25
    mov      x1, x23
    bl       #0x39dd70
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    mov      x0, x22
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGImageLibraryPickerViewController collectionView:didSelectItemAtIndexPath:] IMP=0x11C2C8 bounds=0x11C2C8-0x11C490
loc_11C2C8:
    sub      sp, sp, #0x80
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    mov      x19, x3
    mov      x20, x0
    mov      x0, x3
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x21, [x8, #0x168]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x22, [x8, #0x110]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    cmp      x23, x25
    b.ge     #0x11c46c
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb90]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x21
    bl       #0x39dd00
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc38]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [sp, #8]
    adrp     x8, #0x11c000
    add      x8, x8, #0x490
    adrp     x9, #0x4a1000
    add      x9, x9, #0xba0
    stp      x8, x9, [sp, #0x10]
    stp      x22, x0, [sp, #0x20]
    adrp     x8, #0x4bf000
    ldr      x24, [x8, #0xb38]
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    mov      x3, sp
    mov      x0, x20
    mov      x1, x24
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    add      sp, sp, #0x80
    ret      

// -[WCLGImageLibraryPickerViewController category] IMP=0x11C4AC bounds=0x11C4AC-0x11C4BC
loc_11C4AC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x8f8]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGImageLibraryPickerViewController setCategory:] IMP=0x11C4BC bounds=0x11C4BC-0x11C4C8
loc_11C4BC:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0x8f8]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGImageLibraryPickerViewController onPick] IMP=0x11C4C8 bounds=0x11C4C8-0x11C4D8
loc_11C4C8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x8fc]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGImageLibraryPickerViewController setOnPick:] IMP=0x11C4D8 bounds=0x11C4D8-0x11C4E4
loc_11C4D8:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0x8fc]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGImageLibraryPickerViewController items] IMP=0x11C4E4 bounds=0x11C4E4-0x11C4F4
loc_11C4E4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x900]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGImageLibraryPickerViewController setItems:] IMP=0x11C4F4 bounds=0x11C4F4-0x11C500
loc_11C4F4:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0x900]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGImageLibraryPickerViewController collectionView] IMP=0x11C500 bounds=0x11C500-0x11C510
loc_11C500:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x904]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGImageLibraryPickerViewController setCollectionView:] IMP=0x11C510 bounds=0x11C510-0x11C524
loc_11C510:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x904]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGImageLibraryPickerViewController emptyLabel] IMP=0x11C524 bounds=0x11C524-0x11C534
loc_11C524:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x908]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGImageLibraryPickerViewController setEmptyLabel:] IMP=0x11C534 bounds=0x11C534-0x11C548
loc_11C534:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x908]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGImageLibraryPickerViewController .cxx_destruct] IMP=0x11C548 bounds=0x11C548-0x11C5C4
loc_11C548:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x908]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x904]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x900]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x8fc]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x8f8]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
