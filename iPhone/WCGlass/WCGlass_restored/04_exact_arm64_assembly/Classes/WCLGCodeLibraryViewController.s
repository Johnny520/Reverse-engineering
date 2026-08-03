// Exact ARM64 listing for WCLGCodeLibraryViewController

// +[WCLGCodeLibraryViewController dateFormatter] IMP=0x244E5C bounds=0x244E5C-0x244E8C
loc_244E5C:
    adrp     x8, #0x57f000
    ldr      x8, [x8, #0x820]
    cmn      x8, #1
    b.ne     #0x244e78
    adrp     x8, #0x57f000
    ldr      x0, [x8, #0x818]
    b        #0x461cc0 // _objc_retainAutoreleaseReturnValue
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    bl       #0x4601e0
    ldp      x29, x30, [sp], #0x10
    b        #0x244e6c

// -[WCLGCodeLibraryViewController initWithApplyHandler:onChange:] IMP=0x243770 bounds=0x243770-0x243874
loc_243770:
    sub      sp, sp, #0x40
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
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x748]
    stp      x21, x8, [sp]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x478]
    mov      x0, sp
    mov      w2, #2
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x21, x0
    cbz      x0, #0x24384c
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x900]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0xa3c]
    ldr      x8, [x21, x9]
    str      x0, [x21, x9]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0xa40]
    ldr      x8, [x21, x9]
    str      x0, [x21, x9]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0xa44]
    ldr      x8, [x21, x9]
    str      x0, [x21, x9]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    add      sp, sp, #0x40
    ret      

// -[WCLGCodeLibraryViewController viewDidLoad] IMP=0x243874 bounds=0x243874-0x244308
loc_243874:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    sub      sp, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x68]
    adrp     x8, #0x57f000
    add      x8, x8, #0x82c
    ldar     w9, [x8]
    cbnz     w9, #0x243c7c
    adrp     x9, #0x520000
    add      x9, x9, #0xb78
    ldrh     w10, [x9]
    mov      w11, #0xcc42
    adrp     x12, #0x520000
    add      x12, x12, #0xb80
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x513d
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x8d6e
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w9, [x9, #6]
    mov      w10, #0x94b5
    eor      w9, w9, w10
    strh     w9, [x12, #6]
    adrp     x9, #0x520000
    add      x9, x9, #0xb6c
    ldrh     w10, [x9]
    mov      w11, #0xfd5b
    eor      w10, w10, w11
    adrp     x11, #0x520000
    add      x11, x11, #0xb72
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xa9b3
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x18f2
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x520000
    add      x9, x9, #0xad0
    ldrh     w11, [x9]
    mov      w12, #0x2b30
    adrp     x10, #0x520000
    add      x10, x10, #0xb20
    eor      w11, w11, w12
    strh     w11, [x10]
    ldrh     w11, [x9, #2]
    mov      w12, #0xdc39
    eor      w11, w11, w12
    strh     w11, [x10, #2]
    ldrh     w11, [x9, #4]
    mov      w12, #0x363f
    eor      w11, w11, w12
    strh     w11, [x10, #4]
    ldrh     w11, [x9, #6]
    mov      w12, #0xe78b
    eor      w11, w11, w12
    strh     w11, [x10, #6]
    ldrh     w11, [x9, #8]
    mov      w12, #0xecbb
    eor      w11, w11, w12
    strh     w11, [x10, #8]
    ldrh     w11, [x9, #0xa]
    mov      w12, #0x8ae6
    eor      w11, w11, w12
    strh     w11, [x10, #0xa]
    ldrh     w11, [x9, #0xc]
    mov      w12, #0x229b
    eor      w11, w11, w12
    strh     w11, [x10, #0xc]
    ldrh     w11, [x9, #0xe]
    mov      w12, #0x849
    eor      w11, w11, w12
    strh     w11, [x10, #0xe]
    ldrh     w11, [x9, #0x10]
    mov      w12, #0x2f0c
    eor      w11, w11, w12
    strh     w11, [x10, #0x10]
    ldrh     w11, [x9, #0x12]
    mov      w12, #0x2e95
    eor      w11, w11, w12
    strh     w11, [x10, #0x12]
    ldrh     w11, [x9, #0x14]
    mov      w12, #0xf34f
    eor      w11, w11, w12
    strh     w11, [x10, #0x14]
    ldrh     w11, [x9, #0x16]
    mov      w12, #0xd43c
    eor      w11, w11, w12
    strh     w11, [x10, #0x16]
    ldrh     w11, [x9, #0x18]
    mov      w12, #0x3099
    eor      w11, w11, w12
    strh     w11, [x10, #0x18]
    ldrh     w11, [x9, #0x1a]
    mov      w12, #0x72fd
    eor      w11, w11, w12
    strh     w11, [x10, #0x1a]
    ldrh     w11, [x9, #0x1c]
    mov      w12, #0xcfc3
    eor      w11, w11, w12
    strh     w11, [x10, #0x1c]
    ldrh     w11, [x9, #0x1e]
    mov      w12, #0x6ec8
    eor      w11, w11, w12
    strh     w11, [x10, #0x1e]
    ldrh     w11, [x9, #0x20]
    mov      w12, #0xc456
    eor      w11, w11, w12
    strh     w11, [x10, #0x20]
    ldrh     w11, [x9, #0x22]
    mov      w12, #0xb6b8
    eor      w11, w11, w12
    strh     w11, [x10, #0x22]
    ldrh     w11, [x9, #0x24]
    mov      w12, #0x589c
    eor      w11, w11, w12
    strh     w11, [x10, #0x24]
    ldrh     w11, [x9, #0x26]
    mov      w12, #0xa1a9
    eor      w11, w11, w12
    strh     w11, [x10, #0x26]
    ldrh     w11, [x9, #0x28]
    mov      w12, #0xd287
    eor      w11, w11, w12
    strh     w11, [x10, #0x28]
    ldrh     w11, [x9, #0x2a]
    mov      w12, #0x7153
    eor      w11, w11, w12
    strh     w11, [x10, #0x2a]
    ldrh     w11, [x9, #0x2c]
    mov      w12, #0x1bdb
    eor      w11, w11, w12
    strh     w11, [x10, #0x2c]
    ldrh     w11, [x9, #0x2e]
    mov      w12, #0x713
    eor      w11, w11, w12
    strh     w11, [x10, #0x2e]
    ldrh     w11, [x9, #0x30]
    mov      w12, #0xbad9
    eor      w11, w11, w12
    strh     w11, [x10, #0x30]
    ldrh     w11, [x9, #0x32]
    mov      w12, #0xc0df
    eor      w11, w11, w12
    strh     w11, [x10, #0x32]
    ldrh     w11, [x9, #0x34]
    mov      w12, #0xd71c
    eor      w11, w11, w12
    strh     w11, [x10, #0x34]
    ldrh     w11, [x9, #0x36]
    mov      w12, #0x20c
    eor      w11, w11, w12
    strh     w11, [x10, #0x36]
    ldrh     w11, [x9, #0x38]
    mov      w12, #0xd19e
    eor      w11, w11, w12
    strh     w11, [x10, #0x38]
    ldrh     w11, [x9, #0x3a]
    mov      w12, #0x6a4
    eor      w11, w11, w12
    strh     w11, [x10, #0x3a]
    ldrh     w11, [x9, #0x3c]
    mov      w12, #0xffa2
    eor      w11, w11, w12
    strh     w11, [x10, #0x3c]
    ldrh     w11, [x9, #0x3e]
    mov      w12, #0x1220
    eor      w11, w11, w12
    strh     w11, [x10, #0x3e]
    ldrh     w11, [x9, #0x40]
    mov      w12, #0x3ca4
    eor      w11, w11, w12
    strh     w11, [x10, #0x40]
    ldrh     w11, [x9, #0x42]
    mov      w12, #0x7363
    eor      w11, w11, w12
    strh     w11, [x10, #0x42]
    ldrh     w11, [x9, #0x44]
    mov      w12, #0x3c6c
    eor      w11, w11, w12
    strh     w11, [x10, #0x44]
    ldrh     w11, [x9, #0x46]
    mov      w12, #0xeb91
    eor      w11, w11, w12
    strh     w11, [x10, #0x46]
    ldrh     w11, [x9, #0x48]
    mov      w12, #0x227f
    eor      w11, w11, w12
    strh     w11, [x10, #0x48]
    ldrh     w9, [x9, #0x4a]
    mov      w11, #0x8c17
    eor      w9, w9, w11
    strh     w9, [x10, #0x4a]
    adrp     x9, #0x520000
    add      x9, x9, #0xab8
    ldrh     w10, [x9]
    mov      w11, #0xb036
    adrp     x12, #0x520000
    add      x12, x12, #0xabe
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x4263
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x5d94
    eor      w9, w9, w10
    strh     w9, [x12, #4]
    adrp     x9, #0x520000
    add      x9, x9, #0xaac
    ldrh     w10, [x9]
    mov      w11, #0x28a4
    eor      w10, w10, w11
    adrp     x11, #0x520000
    add      x11, x11, #0xab2
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x36c4
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x849c
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x520000
    add      x9, x9, #0xaa0
    ldrh     w10, [x9]
    mov      w11, #0x4e4f
    eor      w10, w10, w11
    adrp     x11, #0x520000
    add      x11, x11, #0xaa6
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xeeb3
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0xd591
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x8, sp
    sub      x0, x8, #0x10
    mov      sp, x0
    mov      x27, sp
    sub      x24, x27, #0x10
    mov      sp, x24
    mov      x20, sp
    sub      x9, x20, #0x30
    stur     x9, [x29, #-0x70]
    mov      sp, x9
    adrp     x9, #0x4c4000
    ldr      x9, [x9, #0x748]
    stp      x19, x9, [x8, #-0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc80]
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb80]
    adrp     x2, #0x520000
    add      x2, x2, #0xcf0
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x620]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0x628]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x630]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x448]
    ldr      d8, [x8]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x638]
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x640]
    mov      x8, #0x404e000000000000
    fmov     d0, x8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x28, #0x4c4000
    ldr      x0, [x28, #0x328]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x5, [x8, #0x648]
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0x650]
    adrp     x2, #0x520000
    add      x2, x2, #0xcb0
    mov      x1, x23
    mov      x3, #0
    mov      x4, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x658]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x28, #0x328]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x4, [x8, #0x660]
    adrp     x8, #0x4bf000
    ldr      x21, [x8, #0xba8]
    mov      x1, x21
    mov      w2, #4
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x668]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x670]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    stur     x0, [x27, #-0x10]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x678]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    stur     x0, [x27, #-8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    stur     x1, [x29, #-0x78]
    mov      x2, x24
    mov      w3, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbb0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x380]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldr      x0, [x28, #0x328]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x5, [x8, #0x680]
    adrp     x2, #0x520000
    add      x2, x2, #0xc30
    mov      x1, x23
    mov      x3, #0
    mov      x4, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x688]
    mov      x0, x19
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldr      x0, [x28, #0x328]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x5, [x8, #0x690]
    adrp     x2, #0x520000
    add      x2, x2, #0xbf0
    mov      x1, x23
    mov      x3, #0
    mov      x4, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x698]
    mov      x0, x19
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x22, #0x4c4000
    ldr      x0, [x22, #0x90]
    adrp     x8, #0x4c0000
    ldr      x25, [x8, #0x6a0]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4c0000
    ldr      x24, [x8, #0x6a8]
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0xc40]
    mov      x1, x26
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x28, #0x4c4000
    ldr      x0, [x28, #0x328]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x5, [x8, #0x6b0]
    adrp     x2, #0x520000
    add      x2, x2, #0xc70
    mov      x1, x23
    mov      x3, #0
    mov      x4, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6b8]
    mov      x0, x19
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x22, #0x90]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x25, [x8, #0x6c0]
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x1, x26
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x28, #0x328]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x21
    mov      w2, #5
    mov      x3, #0
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    ldr      x0, [x28, #0x328]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x21
    mov      w2, #5
    mov      x3, #0
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6c8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    stp      x0, x23, [x20, #-0x30]
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    stp      x0, x21, [x20, #-0x20]
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    stur     x0, [x20, #-0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    ldp      x1, x2, [x29, #-0x78]
    mov      w3, #5
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6d0]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
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
    ldr      x1, [x8, #0x7f8]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1f8]
    mov      x0, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x800]
    fmov     d0, #15.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc18]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    adrp     x2, #0x520000
    add      x2, x2, #0xbb0
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc08]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x68]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x244304
    sub      sp, x29, #0x60
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    ldp      d9, d8, [sp], #0x70
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGCodeLibraryViewController viewWillAppear:] IMP=0x244308 bounds=0x244308-0x2444C8
loc_244308:
    sub      sp, sp, #0x60
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x748]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x378]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cbz      x0, #0x244444
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xd88]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x918]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    cmp      x0, x19
    b.eq     #0x2443dc
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    b        #0x244444
    adrp     x8, #0x4bf000
    ldr      x22, [x8, #0xbb0]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x320]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    cbz      x26, #0x244470
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6e0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    add      sp, sp, #0x60
    ret      
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
    mov      x20, x0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbb8]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    b        #0x2443c8

// -[WCLGCodeLibraryViewController viewWillDisappear:] IMP=0x2444C8 bounds=0x2444C8-0x24453C
loc_2444C8:
    sub      sp, sp, #0x30
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x748]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xaa8]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6e8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    add      sp, sp, #0x30
    ret      

// -[WCLGCodeLibraryViewController reloadEntries] IMP=0x24453C bounds=0x24453C-0x244DE0
loc_24453C:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x57f000
    add      x8, x8, #0x838
    ldar     w9, [x8]
    cbnz     w9, #0x244ad8
    adrp     x9, #0x520000
    add      x9, x9, #0xdd0
    ldrh     w11, [x9]
    mov      w12, #0x3b55
    adrp     x10, #0x520000
    add      x10, x10, #0xe20
    eor      w11, w11, w12
    strh     w11, [x10]
    ldrh     w11, [x9, #2]
    mov      w12, #0x508
    eor      w11, w11, w12
    strh     w11, [x10, #2]
    ldrh     w11, [x9, #4]
    mov      w12, #0x3c8f
    eor      w11, w11, w12
    strh     w11, [x10, #4]
    ldrh     w11, [x9, #6]
    mov      w12, #0x42b8
    eor      w11, w11, w12
    strh     w11, [x10, #6]
    ldrh     w11, [x9, #8]
    mov      w12, #0x8aeb
    eor      w11, w11, w12
    strh     w11, [x10, #8]
    ldrh     w11, [x9, #0xa]
    mov      w12, #0x55a1
    eor      w11, w11, w12
    strh     w11, [x10, #0xa]
    ldrh     w11, [x9, #0xc]
    mov      w12, #0x5fa8
    eor      w11, w11, w12
    strh     w11, [x10, #0xc]
    ldrh     w11, [x9, #0xe]
    mov      w12, #0xd480
    eor      w11, w11, w12
    strh     w11, [x10, #0xe]
    ldrh     w11, [x9, #0x10]
    mov      w12, #0x2a2a
    eor      w11, w11, w12
    strh     w11, [x10, #0x10]
    ldrh     w11, [x9, #0x12]
    mov      w12, #0x26a0
    eor      w11, w11, w12
    strh     w11, [x10, #0x12]
    ldrh     w11, [x9, #0x14]
    mov      w12, #0x501a
    eor      w11, w11, w12
    strh     w11, [x10, #0x14]
    ldrh     w11, [x9, #0x16]
    mov      w12, #0x1e58
    eor      w11, w11, w12
    strh     w11, [x10, #0x16]
    ldrh     w11, [x9, #0x18]
    mov      w12, #0xfb10
    eor      w11, w11, w12
    strh     w11, [x10, #0x18]
    ldrh     w11, [x9, #0x1a]
    mov      w12, #0xfba8
    eor      w11, w11, w12
    strh     w11, [x10, #0x1a]
    ldrh     w11, [x9, #0x1c]
    mov      w12, #0xc5c
    eor      w11, w11, w12
    strh     w11, [x10, #0x1c]
    ldrh     w11, [x9, #0x1e]
    mov      w12, #0x9931
    eor      w11, w11, w12
    strh     w11, [x10, #0x1e]
    ldrh     w11, [x9, #0x20]
    mov      w12, #0x9c61
    eor      w11, w11, w12
    strh     w11, [x10, #0x20]
    ldrh     w11, [x9, #0x22]
    mov      w12, #0x2e4a
    eor      w11, w11, w12
    strh     w11, [x10, #0x22]
    ldrh     w11, [x9, #0x24]
    mov      w12, #0xa3be
    eor      w11, w11, w12
    strh     w11, [x10, #0x24]
    ldrh     w11, [x9, #0x26]
    mov      w12, #0x59a
    eor      w11, w11, w12
    strh     w11, [x10, #0x26]
    ldrh     w11, [x9, #0x28]
    mov      w12, #0x6850
    eor      w11, w11, w12
    strh     w11, [x10, #0x28]
    ldrh     w11, [x9, #0x2a]
    mov      w12, #0x6b44
    eor      w11, w11, w12
    strh     w11, [x10, #0x2a]
    ldrh     w11, [x9, #0x2c]
    mov      w12, #0x6791
    eor      w11, w11, w12
    strh     w11, [x10, #0x2c]
    ldrh     w11, [x9, #0x2e]
    mov      w12, #0xa5d3
    eor      w11, w11, w12
    strh     w11, [x10, #0x2e]
    ldrh     w11, [x9, #0x30]
    mov      w12, #0x6627
    eor      w11, w11, w12
    strh     w11, [x10, #0x30]
    ldrh     w11, [x9, #0x32]
    mov      w12, #0xf73a
    eor      w11, w11, w12
    strh     w11, [x10, #0x32]
    ldrh     w11, [x9, #0x34]
    mov      w12, #0xebb7
    eor      w11, w11, w12
    strh     w11, [x10, #0x34]
    ldrh     w11, [x9, #0x36]
    mov      w12, #0xf484
    eor      w11, w11, w12
    strh     w11, [x10, #0x36]
    ldrh     w11, [x9, #0x38]
    mov      w12, #0xa3d7
    eor      w11, w11, w12
    strh     w11, [x10, #0x38]
    ldrh     w11, [x9, #0x3a]
    mov      w12, #0xdb2b
    eor      w11, w11, w12
    strh     w11, [x10, #0x3a]
    ldrh     w11, [x9, #0x3c]
    mov      w12, #0x1d4b
    eor      w11, w11, w12
    strh     w11, [x10, #0x3c]
    ldrh     w11, [x9, #0x3e]
    mov      w12, #0xc0ea
    eor      w11, w11, w12
    strh     w11, [x10, #0x3e]
    ldrh     w11, [x9, #0x40]
    mov      w12, #0xb9a1
    eor      w11, w11, w12
    strh     w11, [x10, #0x40]
    ldrh     w11, [x9, #0x42]
    mov      w12, #0xe024
    eor      w11, w11, w12
    strh     w11, [x10, #0x42]
    ldrh     w11, [x9, #0x44]
    mov      w12, #0x490
    eor      w11, w11, w12
    strh     w11, [x10, #0x44]
    ldrh     w11, [x9, #0x46]
    mov      w12, #0xa1ca
    eor      w11, w11, w12
    strh     w11, [x10, #0x46]
    ldrh     w11, [x9, #0x48]
    mov      w12, #0xcc38
    eor      w11, w11, w12
    strh     w11, [x10, #0x48]
    ldrh     w9, [x9, #0x4a]
    mov      w11, #0x610c
    eor      w9, w9, w11
    strh     w9, [x10, #0x4a]
    adrp     x9, #0x520000
    add      x9, x9, #0xd10
    ldrh     w11, [x9]
    mov      w12, #0x8cb
    adrp     x10, #0x520000
    add      x10, x10, #0xd70
    eor      w11, w11, w12
    strh     w11, [x10]
    ldrh     w11, [x9, #2]
    mov      w12, #0x99e8
    eor      w11, w11, w12
    strh     w11, [x10, #2]
    ldrh     w11, [x9, #4]
    mov      w12, #0x9d8a
    eor      w11, w11, w12
    strh     w11, [x10, #4]
    ldrh     w11, [x9, #6]
    mov      w12, #0xc9a2
    eor      w11, w11, w12
    strh     w11, [x10, #6]
    ldrh     w11, [x9, #8]
    mov      w12, #0x3ead
    eor      w11, w11, w12
    strh     w11, [x10, #8]
    ldrh     w11, [x9, #0xa]
    mov      w12, #0x2167
    eor      w11, w11, w12
    strh     w11, [x10, #0xa]
    ldrh     w11, [x9, #0xc]
    mov      w12, #0x9941
    eor      w11, w11, w12
    strh     w11, [x10, #0xc]
    ldrh     w11, [x9, #0xe]
    mov      w12, #0xf39e
    eor      w11, w11, w12
    strh     w11, [x10, #0xe]
    ldrh     w11, [x9, #0x10]
    mov      w12, #0xefa9
    eor      w11, w11, w12
    strh     w11, [x10, #0x10]
    ldrh     w11, [x9, #0x12]
    mov      w12, #0x77c1
    eor      w11, w11, w12
    strh     w11, [x10, #0x12]
    ldrh     w11, [x9, #0x14]
    mov      w12, #0x9e91
    eor      w11, w11, w12
    strh     w11, [x10, #0x14]
    ldrh     w11, [x9, #0x16]
    mov      w12, #0x2e0f
    eor      w11, w11, w12
    strh     w11, [x10, #0x16]
    ldrh     w11, [x9, #0x18]
    mov      w12, #0x62fd
    eor      w11, w11, w12
    strh     w11, [x10, #0x18]
    ldrh     w11, [x9, #0x1a]
    mov      w12, #0x8314
    eor      w11, w11, w12
    strh     w11, [x10, #0x1a]
    ldrh     w11, [x9, #0x1c]
    mov      w12, #0x7f31
    eor      w11, w11, w12
    strh     w11, [x10, #0x1c]
    ldrh     w11, [x9, #0x1e]
    mov      w12, #0x4c8d
    eor      w11, w11, w12
    strh     w11, [x10, #0x1e]
    ldrh     w11, [x9, #0x20]
    mov      w12, #0x172d
    eor      w11, w11, w12
    strh     w11, [x10, #0x20]
    ldrh     w11, [x9, #0x22]
    mov      w12, #0xd8d8
    eor      w11, w11, w12
    strh     w11, [x10, #0x22]
    ldrh     w11, [x9, #0x24]
    mov      w12, #0x7848
    eor      w11, w11, w12
    strh     w11, [x10, #0x24]
    ldrh     w11, [x9, #0x26]
    mov      w12, #0x2a44
    eor      w11, w11, w12
    strh     w11, [x10, #0x26]
    ldrh     w11, [x9, #0x28]
    mov      w12, #0xacab
    eor      w11, w11, w12
    strh     w11, [x10, #0x28]
    ldrh     w11, [x9, #0x2a]
    mov      w12, #0x40f
    eor      w11, w11, w12
    strh     w11, [x10, #0x2a]
    ldrh     w11, [x9, #0x2c]
    mov      w12, #0xcc4f
    eor      w11, w11, w12
    strh     w11, [x10, #0x2c]
    ldrh     w11, [x9, #0x2e]
    mov      w12, #0x39ac
    eor      w11, w11, w12
    strh     w11, [x10, #0x2e]
    ldrh     w11, [x9, #0x30]
    mov      w12, #0xc99c
    eor      w11, w11, w12
    strh     w11, [x10, #0x30]
    ldrh     w11, [x9, #0x32]
    mov      w12, #0x4270
    eor      w11, w11, w12
    strh     w11, [x10, #0x32]
    ldrh     w11, [x9, #0x34]
    mov      w12, #0xd19
    eor      w11, w11, w12
    strh     w11, [x10, #0x34]
    ldrh     w11, [x9, #0x36]
    mov      w12, #0x71d7
    eor      w11, w11, w12
    strh     w11, [x10, #0x36]
    ldrh     w11, [x9, #0x38]
    mov      w12, #0x1289
    eor      w11, w11, w12
    strh     w11, [x10, #0x38]
    ldrh     w11, [x9, #0x3a]
    mov      w12, #0x116f
    eor      w11, w11, w12
    strh     w11, [x10, #0x3a]
    ldrh     w11, [x9, #0x3c]
    mov      w12, #0x253
    eor      w11, w11, w12
    strh     w11, [x10, #0x3c]
    ldrh     w11, [x9, #0x3e]
    mov      w12, #0xa010
    eor      w11, w11, w12
    strh     w11, [x10, #0x3e]
    ldrh     w11, [x9, #0x40]
    mov      w12, #0xbc8b
    eor      w11, w11, w12
    strh     w11, [x10, #0x40]
    ldrh     w11, [x9, #0x42]
    mov      w12, #0x3814
    eor      w11, w11, w12
    strh     w11, [x10, #0x42]
    ldrh     w11, [x9, #0x44]
    mov      w12, #0xf37b
    eor      w11, w11, w12
    strh     w11, [x10, #0x44]
    ldrh     w11, [x9, #0x46]
    mov      w12, #0xbe6a
    eor      w11, w11, w12
    strh     w11, [x10, #0x46]
    ldrh     w11, [x9, #0x48]
    mov      w12, #0xaf79
    eor      w11, w11, w12
    strh     w11, [x10, #0x48]
    ldrh     w11, [x9, #0x4a]
    mov      w12, #0x6b59
    eor      w11, w11, w12
    strh     w11, [x10, #0x4a]
    ldrh     w11, [x9, #0x4c]
    mov      w12, #0xf57
    eor      w11, w11, w12
    strh     w11, [x10, #0x4c]
    ldrh     w11, [x9, #0x4e]
    mov      w12, #0xcc33
    eor      w11, w11, w12
    strh     w11, [x10, #0x4e]
    ldrh     w11, [x9, #0x50]
    mov      w12, #0xabcd
    eor      w11, w11, w12
    strh     w11, [x10, #0x50]
    ldrh     w11, [x9, #0x52]
    mov      w12, #0x3e53
    eor      w11, w11, w12
    strh     w11, [x10, #0x52]
    ldrh     w11, [x9, #0x54]
    mov      w12, #0xeeb8
    eor      w11, w11, w12
    strh     w11, [x10, #0x54]
    ldrh     w11, [x9, #0x56]
    mov      w12, #0x4db3
    eor      w11, w11, w12
    strh     w11, [x10, #0x56]
    ldrh     w11, [x9, #0x58]
    mov      w12, #0x4e1f
    eor      w11, w11, w12
    strh     w11, [x10, #0x58]
    ldrh     w11, [x9, #0x5a]
    mov      w12, #0x2157
    eor      w11, w11, w12
    strh     w11, [x10, #0x5a]
    ldrh     w9, [x9, #0x5c]
    mov      w11, #0xe3cd
    eor      w9, w9, w11
    strh     w9, [x10, #0x5c]
    mov      w9, #1
    stlr     w9, [x8]
    bl       #0x23f610
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x360]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    cbz      x0, #0x244b1c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6f0]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    b        #0x244b58
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6f0]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    bl       #0x2ecad8
    cbz      w0, #0x244b90
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6f8]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x21, #0x520000
    add      x21, x21, #0xe90
    b        #0x244bdc
    bl       #0x31ac58
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x240504
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6f8]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x21, #0x520000
    add      x21, x21, #0xed0
    adrp     x8, #0x4bf000
    ldr      x20, [x8, #0xc10]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0x700]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x600]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    cbz      x0, #0x244c54
    mov      x25, #0
    b        #0x244c6c
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c0000
    ldr      x20, [x8, #0x628]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xd60]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    cbnz     x24, #0x244cb0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    cset     w24, ne
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x670]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xfb0]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x244d4c
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    b        #0x244da0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x708]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cbz      w23, #0x244da0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x710]
    mov      x0, x19
    mov      w2, #0
    mov      w3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x488]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    b        #0x461c9c // _objc_release

// -[WCLGCodeLibraryViewController notifyChange] IMP=0x244DE0 bounds=0x244DE0-0x244E5C
loc_244DE0:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x20, [x8, #0x718]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461c9c // _objc_release
    cbz      x21, #0x244e4c
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x8, [x0, #0x10]
    blr      x8
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    ret      

// -[WCLGCodeLibraryViewController toggleEditingTapped] IMP=0x2450A8 bounds=0x2450A8-0x245104
loc_2450A8:
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
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x708]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x710]
    eor      w2, w0, #1
    mov      x0, x19
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c9c // _objc_release

// -[WCLGCodeLibraryViewController setEditing:animated:] IMP=0x245104 bounds=0x245104-0x2452FC
loc_245104:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x21, x3
    mov      x20, x2
    mov      x19, x0
    adrp     x8, #0x57f000
    add      x8, x8, #0x84c
    ldar     w9, [x8]
    cbnz     w9, #0x2451b4
    adrp     x9, #0x520000
    add      x9, x9, #0xfac
    ldrh     w10, [x9]
    mov      w11, #0xf7a2
    eor      w10, w10, w11
    adrp     x11, #0x520000
    add      x11, x11, #0xfb2
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x2730
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x7031
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x520000
    add      x9, x9, #0xfa0
    ldrh     w10, [x9]
    mov      w11, #0x1636
    eor      w10, w10, w11
    adrp     x11, #0x520000
    add      x11, x11, #0xfa6
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xa90b
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x7409
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x8, sp
    sub      x0, x8, #0x10
    mov      sp, x0
    adrp     x9, #0x4c4000
    ldr      x9, [x9, #0x748]
    stp      x19, x9, [x8, #-0x10]
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x710]
    mov      x1, x22
    mov      x2, x20
    mov      x3, x21
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x628]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x22
    mov      x2, x20
    mov      x3, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x520000
    add      x8, x8, #0xfe0
    adrp     x9, #0x521000
    add      x9, x9, #0x20
    cmp      w20, #0
    csel     x21, x9, x8, ne
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x670]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb80]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x678]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xfb0]
    eor      w2, w20, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6e8]
    eor      w2, w20, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x720]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    sub      sp, x29, #0x30
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    ret      

// -[WCLGCodeLibraryViewController updateToolbarState] IMP=0x2452FC bounds=0x2452FC-0x245684
loc_2452FC:
    sub      sp, sp, #0x60
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x0
    adrp     x8, #0x57f000
    add      x8, x8, #0x850
    ldar     w9, [x8]
    cbnz     w9, #0x245498
    adrp     x9, #0x521000
    add      x9, x9, #0x78
    ldrh     w10, [x9]
    mov      w11, #0xfa73
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x82
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x3ab3
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xba2b
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x3975
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xb9e6
    eor      w9, w9, w10
    adrp     x10, #0x521000
    add      x10, x10, #0x58
    strh     w9, [x11, #8]
    ldrh     w9, [x10]
    mov      w11, #0x6b44
    eor      w9, w9, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x68
    strh     w9, [x11]
    ldrh     w9, [x10, #2]
    mov      w12, #0xd0de
    eor      w9, w9, w12
    strh     w9, [x11, #2]
    ldrh     w9, [x10, #4]
    mov      w12, #0xa284
    eor      w9, w9, w12
    strh     w9, [x11, #4]
    ldrh     w9, [x10, #6]
    mov      w12, #0x64eb
    eor      w9, w9, w12
    strh     w9, [x11, #6]
    ldrh     w9, [x10, #8]
    mov      w12, #0xfb1a
    eor      w9, w9, w12
    strh     w9, [x11, #8]
    ldrh     w9, [x10, #0xa]
    mov      w12, #0x3fbb
    eor      w9, w9, w12
    strh     w9, [x11, #0xa]
    ldrh     w9, [x10, #0xc]
    mov      w12, #0xbdf7
    eor      w9, w9, w12
    strh     w9, [x11, #0xc]
    ldrh     w9, [x10, #0xe]
    mov      w10, #0x25d1
    eor      w9, w9, w10
    adrp     x10, #0x521000
    add      x10, x10, #0x4c
    strh     w9, [x11, #0xe]
    ldrh     w9, [x10]
    mov      w11, #0xc055
    eor      w9, w9, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x52
    strh     w9, [x11]
    ldrh     w9, [x10, #2]
    mov      w12, #0x1f89
    eor      w9, w9, w12
    strh     w9, [x11, #2]
    ldrh     w9, [x10, #4]
    mov      w10, #0x94c4
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x521000
    add      x9, x9, #0x40
    ldrh     w10, [x9]
    mov      w11, #0x48df
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x46
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    eor      w10, w10, #0x44444444
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x8570
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x700]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x600]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x628]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x728]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    sub      x8, x20, #1
    adrp     x9, #0x521000
    add      x9, x9, #0x130
    adrp     x10, #0x521000
    add      x10, x10, #0x170
    cmp      x8, x21
    csel     x23, x10, x9, lo
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6c8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x22, [x8, #0xb80]
    mov      x1, x22
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    cbz      x21, #0x2455b0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    str      x21, [sp]
    adrp     x2, #0x521000
    add      x2, x2, #0xf0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    b        #0x2455b8
    adrp     x23, #0x521000
    add      x23, x23, #0xb0
    adrp     x8, #0x4c0000
    ldr      x24, [x8, #0x6c0]
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x1, x22
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    cbz      x21, #0x2455f8
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cmp      x21, #0
    cset     w21, ne
    cmp      x20, #0
    cset     w20, ne
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xfb0]
    mov      x1, x23
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6a8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x23
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    add      sp, sp, #0x60
    b        #0x461c9c // _objc_release

// -[WCLGCodeLibraryViewController selectAllTapped] IMP=0x245684 bounds=0x245684-0x24580C
loc_245684:
    sub      sp, sp, #0x70
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x700]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x600]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0x628]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x728]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    subs     x25, x20, #1
    b.lt     #0x2457e0
    mov      x23, #0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0xcf0]
    adrp     x8, #0x4c0000
    ldr      x9, [x8, #0x730]
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0x738]
    stp      x8, x9, [sp]
    adrp     x26, #0x4c4000
    ldr      x0, [x26, #0x1a0]
    mov      x1, x24
    mov      x2, x23
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    cmp      x25, x22
    b.hs     #0x2457b0
    ldr      x1, [sp]
    mov      x2, x27
    mov      w3, #0
    bl       #0x461c6c // _objc_msgSend
    b        #0x2457c4
    ldr      x1, [sp, #8]
    mov      x2, x27
    mov      w3, #0
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    add      x23, x23, #1
    cmp      x20, x23
    b.ne     #0x24575c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x720]
    mov      x0, x19
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    add      sp, sp, #0x70
    b        #0x461c6c // _objc_msgSend

// -[WCLGCodeLibraryViewController deleteSelectedTapped] IMP=0x24580C bounds=0x24580C-0x245E50
loc_24580C:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x60
    mov      x27, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x57f000
    add      x8, x8, #0x858
    ldar     w9, [x8]
    cbnz     w9, #0x2459f0
    adrp     x9, #0x521000
    add      x9, x9, #0x1b0
    ldrh     w10, [x9]
    mov      w11, #0xf6fc
    eor      w11, w10, w11
    adrp     x10, #0x521000
    add      x10, x10, #0x1e0
    strh     w11, [x10]
    ldrh     w11, [x9, #2]
    mov      w12, #0xa9dd
    eor      w11, w11, w12
    strh     w11, [x10, #2]
    ldrh     w11, [x9, #4]
    mov      w12, #0x48fe
    eor      w11, w11, w12
    strh     w11, [x10, #4]
    ldrh     w11, [x9, #6]
    mov      w12, #0xff69
    eor      w11, w11, w12
    strh     w11, [x10, #6]
    ldrh     w11, [x9, #8]
    mov      w12, #0x3a1c
    eor      w11, w11, w12
    strh     w11, [x10, #8]
    ldrh     w11, [x9, #0xa]
    mov      w12, #0x31ac
    eor      w11, w11, w12
    strh     w11, [x10, #0xa]
    ldrh     w11, [x9, #0xc]
    mov      w12, #0x84c
    eor      w11, w11, w12
    strh     w11, [x10, #0xc]
    ldrh     w11, [x9, #0xe]
    mov      w12, #0x455
    eor      w11, w11, w12
    strh     w11, [x10, #0xe]
    ldrh     w11, [x9, #0x10]
    mov      w12, #0x9ff4
    eor      w11, w11, w12
    strh     w11, [x10, #0x10]
    ldrh     w11, [x9, #0x12]
    mov      w12, #0xdff
    eor      w11, w11, w12
    strh     w11, [x10, #0x12]
    ldrh     w11, [x9, #0x14]
    mov      w12, #0x4669
    eor      w11, w11, w12
    strh     w11, [x10, #0x14]
    ldrh     w11, [x9, #0x16]
    mov      w12, #0x24
    eor      w11, w11, w12
    strh     w11, [x10, #0x16]
    ldrh     w11, [x9, #0x18]
    mov      w12, #0x9d10
    eor      w11, w11, w12
    strh     w11, [x10, #0x18]
    ldrh     w11, [x9, #0x1a]
    mov      w12, #0xe60b
    eor      w11, w11, w12
    strh     w11, [x10, #0x1a]
    ldrh     w11, [x9, #0x1c]
    mov      w12, #0x89c1
    eor      w11, w11, w12
    strh     w11, [x10, #0x1c]
    ldrh     w11, [x9, #0x1e]
    mov      w12, #0x3277
    eor      w11, w11, w12
    strh     w11, [x10, #0x1e]
    ldrh     w9, [x9, #0x20]
    mov      w11, #0x5e32
    eor      w9, w9, w11
    strh     w9, [x10, #0x20]
    adrp     x9, #0x521000
    add      x9, x9, #0x19c
    ldrh     w10, [x9]
    mov      w11, #0x4db1
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x1a2
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x48ed
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x8ce
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x521000
    add      x9, x9, #0x190
    ldrh     w10, [x9]
    mov      w11, #0xe5fa
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x196
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x4ace
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x41a1
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x24, sp, #0x40
    mov      sp, x24
    sub      x22, sp, #0x80
    mov      sp, x22
    sub      x19, sp, #0x10
    mov      sp, x19
    sub      x21, sp, #0x30
    mov      sp, x21
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x628]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x728]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    mov      x0, x26
    stur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x245de4
    stp      x21, x19, [x29, #-0xb0]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x90]
    movi     v0.16b, #0
    stp      q0, q0, [x24]
    stp      q0, q0, [x24, #0x20]
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stur     x1, [x29, #-0x98]
    mov      x2, x24
    mov      x3, x22
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x245c34
    mov      x28, x0
    ldr      x8, [x24, #0x10]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x60]
    stur     x26, [x29, #-0x70]
    stur     x22, [x29, #-0xa0]
    mov      x26, #0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x5f0]
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0x700]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x608]
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0x740]
    stp      x8, x9, [x29, #-0x80]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x830]
    stur     x8, [x29, #-0x88]
    ldr      x8, [x24, #0x10]
    ldr      x8, [x8]
    ldur     x9, [x29, #-0x60]
    cmp      x8, x9
    b.eq     #0x245b2c
    ldur     x0, [x29, #-0x70]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x24, #8]
    ldr      x22, [x8, x26, lsl #3]
    mov      x0, x22
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    tbnz     x0, #0x3f, #0x245c08
    mov      x0, x22
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    mov      x0, x27
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x27
    mov      x27, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    cmp      x19, x27
    mov      x27, x23
    b.ge     #0x245c08
    mov      x0, x27
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x22
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x19
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x1, [x29, #-0x80]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldp      x0, x1, [x29, #-0x90]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    add      x26, x26, #1
    cmp      x28, x26
    b.ne     #0x245b10
    ldur     x26, [x29, #-0x70]
    mov      x0, x26
    ldp      x3, x1, [x29, #-0xa0]
    mov      x2, x24
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    cbnz     x0, #0x245adc
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x19, [x8, #0xb8]
    ldur     x0, [x29, #-0x90]
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    str      x0, [sp, #-0x10]!
    adrp     x2, #0x521000
    add      x2, x2, #0x2b0
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    add      sp, sp, #0x10
    mov      x24, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x310]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb00]
    mov      x2, #0
    mov      x3, x24
    mov      w4, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldur     x23, [x29, #-0xa8]
    mov      x0, x23
    mov      x1, x27
    bl       #0x461c54 // _objc_initWeak
    adrp     x19, #0x4c4000
    ldr      x0, [x19, #0x318]
    adrp     x8, #0x4bf000
    ldr      x20, [x8, #0xb08]
    adrp     x2, #0x521000
    add      x2, x2, #0x270
    mov      x1, x20
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x21, [x8, #0xb10]
    mov      x0, x25
    mov      x1, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x19, [x19, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    ldur     x22, [x29, #-0xb0]
    str      x8, [x22]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x22, #8]
    adrp     x8, #0x245000
    add      x8, x8, #0xe50
    adrp     x9, #0x4a2000
    add      x9, x9, #0xca8
    stp      x8, x9, [x22, #0x10]
    ldur     x0, [x29, #-0x90]
    bl       #0x461ca8 // _objc_retain
    str      x0, [x22, #0x20]
    add      x0, x22, #0x28
    mov      x1, x23
    bl       #0x461c00 // _objc_copyWeak
    adrp     x2, #0x521000
    add      x2, x2, #0x230
    mov      x0, x19
    mov      x1, x20
    mov      w3, #2
    mov      x4, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x25
    mov      x1, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x27
    mov      x2, x25
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    add      x0, x22, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x22, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x90]
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x245e24
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail
    b        #0x245e2c
    mov      x19, x0
    add      x0, x22, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    b        #0x245e40
    mov      x19, x0
    ldur     x0, [x29, #-0xa8]
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGCodeLibraryViewController clearAllTapped] IMP=0x245ED0 bounds=0x245ED0-0x2462E0
loc_245ED0:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x57f000
    add      x8, x8, #0x868
    ldar     w9, [x8]
    cbnz     w9, #0x246108
    adrp     x9, #0x521000
    add      x9, x9, #0x332
    ldrh     w10, [x9]
    mov      w11, #0xb1bd
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x33e
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x217e
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xb4e0
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x22bc
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0xbeea
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w9, [x9, #0xa]
    mov      w10, #0xf869
    eor      w9, w9, w10
    adrp     x10, #0x521000
    add      x10, x10, #0x31e
    strh     w9, [x11, #0xa]
    ldrh     w9, [x10]
    mov      w11, #0x1d21
    eor      w9, w9, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x328
    strh     w9, [x11]
    ldrh     w9, [x10, #2]
    mov      w12, #0xb4dd
    eor      w9, w9, w12
    strh     w9, [x11, #2]
    ldrh     w9, [x10, #4]
    mov      w12, #0xa3aa
    eor      w9, w9, w12
    strh     w9, [x11, #4]
    ldrh     w9, [x10, #6]
    mov      w12, #0x9481
    eor      w9, w9, w12
    strh     w9, [x11, #6]
    ldrh     w9, [x10, #8]
    mov      w10, #0xa2be
    eor      w9, w9, w10
    adrp     x10, #0x521000
    add      x10, x10, #0x2e0
    strh     w9, [x11, #8]
    ldrh     w9, [x10]
    mov      w11, #0x2805
    eor      w9, w9, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x300
    strh     w9, [x11]
    ldrh     w9, [x10, #2]
    mov      w12, #0xa4cb
    eor      w9, w9, w12
    strh     w9, [x11, #2]
    ldrh     w9, [x10, #4]
    mov      w12, #0xfe2d
    eor      w9, w9, w12
    strh     w9, [x11, #4]
    ldrh     w9, [x10, #6]
    mov      w12, #0x6fbe
    eor      w9, w9, w12
    strh     w9, [x11, #6]
    ldrh     w9, [x10, #8]
    mov      w12, #0x14c7
    eor      w9, w9, w12
    strh     w9, [x11, #8]
    ldrh     w9, [x10, #0xa]
    mov      w12, #0x17f8
    eor      w9, w9, w12
    strh     w9, [x11, #0xa]
    ldrh     w9, [x10, #0xc]
    mov      w12, #0x8b42
    eor      w9, w9, w12
    strh     w9, [x11, #0xc]
    ldrh     w9, [x10, #0xe]
    mov      w12, #0xe4f0
    eor      w9, w9, w12
    strh     w9, [x11, #0xe]
    ldrh     w9, [x10, #0x10]
    mov      w12, #0x874f
    eor      w9, w9, w12
    strh     w9, [x11, #0x10]
    ldrh     w9, [x10, #0x12]
    eor      w9, w9, #0xfffff7ff
    strh     w9, [x11, #0x12]
    ldrh     w9, [x10, #0x14]
    mov      w12, #0xefe8
    eor      w9, w9, w12
    strh     w9, [x11, #0x14]
    ldrh     w9, [x10, #0x16]
    mov      w12, #0xe458
    eor      w9, w9, w12
    strh     w9, [x11, #0x16]
    ldrh     w9, [x10, #0x18]
    mov      w12, #0xf0cd
    eor      w9, w9, w12
    strh     w9, [x11, #0x18]
    ldrh     w9, [x10, #0x1a]
    mov      w12, #0xefe2
    eor      w9, w9, w12
    strh     w9, [x11, #0x1a]
    ldrh     w9, [x10, #0x1c]
    mov      w10, #0x774e
    eor      w9, w9, w10
    strh     w9, [x11, #0x1c]
    adrp     x9, #0x521000
    add      x9, x9, #0x2d0
    ldrh     w10, [x9]
    mov      w11, #0xaa64
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x2d6
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x6960
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x4a88
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x20, sp, #0x10
    mov      sp, x20
    sub      x21, sp, #0x30
    mov      sp, x21
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x700]
    mov      x0, x19
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
    cbz      x23, #0x24629c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x310]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb00]
    adrp     x2, #0x521000
    add      x2, x2, #0x430
    adrp     x3, #0x521000
    add      x3, x3, #0x3b0
    mov      w4, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c54 // _objc_initWeak
    adrp     x26, #0x4c4000
    ldr      x0, [x26, #0x318]
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0xb08]
    adrp     x2, #0x521000
    add      x2, x2, #0x370
    mov      x1, x23
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4bf000
    ldr      x24, [x8, #0xb10]
    mov      x0, x22
    mov      x1, x24
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldr      x25, [x26, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x21]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x21, #8]
    adrp     x8, #0x246000
    add      x8, x8, #0x2e0
    adrp     x9, #0x4a2000
    add      x9, x9, #0xcd8
    stp      x8, x9, [x21, #0x10]
    add      x0, x21, #0x20
    mov      x1, x20
    bl       #0x461c00 // _objc_copyWeak
    adrp     x2, #0x521000
    add      x2, x2, #0x3f0
    mov      x0, x25
    mov      x1, x23
    mov      w3, #2
    mov      x4, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x22
    mov      x1, x24
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x19
    mov      x2, x22
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    add      x0, x21, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    sub      sp, x29, #0x40
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    ret      
    b        #0x2462bc
    mov      x19, x0
    add      x0, x21, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    b        #0x2462d0
    mov      x19, x0
    mov      x0, x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGCodeLibraryViewController closeTapped] IMP=0x2463B4 bounds=0x2463B4-0x2463C8
loc_2463B4:
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb38]
    mov      w2, #1
    mov      x3, #0
    b        #0x461c6c // _objc_msgSend

// -[WCLGCodeLibraryViewController applyEntryAtRow:] IMP=0x2463C8 bounds=0x2463C8-0x2466D0
loc_2463C8:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    tbnz     x2, #0x3f, #0x2465e8
    mov      x20, x2
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0x700]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x600]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cmp      x24, x20
    b.le     #0x2465e8
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x740]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    bl       #0x2400e0
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x246604
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0x750]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    bl       #0x461c9c // _objc_release
    cbz      x24, #0x246534
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8d0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x8, [x23, #0x10]
    mov      x0, x23
    mov      x1, x21
    mov      x2, x24
    blr      x8
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xb20]
    cbz      x0, #0x246618
    mov      x25, x0
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0xd88]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x918]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    cmp      x28, x19
    b.ne     #0x246620
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb38]
    mov      x0, x19
    mov      w2, #1
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    b        #0x2466a8
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6e0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    b        #0x2466a8
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0xd88]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    cmp      x22, #2
    b.lo     #0x2466a8
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x758]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461d38 // _objc_unsafeClaimAutoreleasedReturnValue
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    b        #0x461c9c // _objc_release

// -[WCLGCodeLibraryViewController presentRenameForRow:] IMP=0x2466D0 bounds=0x2466D0-0x246A80
loc_2466D0:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x23, x2
    mov      x19, x0
    adrp     x8, #0x57f000
    add      x8, x8, #0x880
    ldar     w9, [x8]
    cbnz     w9, #0x2467d8
    adrp     x9, #0x521000
    add      x9, x9, #0x468
    ldrh     w10, [x9]
    mov      w11, #0xe873
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x470
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x221c
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x5423
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w9, [x9, #6]
    mov      w10, #0x4556
    eor      w9, w9, w10
    strh     w9, [x11, #6]
    adrp     x9, #0x521000
    add      x9, x9, #0x45c
    ldrh     w10, [x9]
    mov      w11, #0x7c93
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x462
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x62c
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x9e4f
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x521000
    add      x9, x9, #0x450
    ldrh     w10, [x9]
    mov      w11, #0x237d
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x456
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x358d
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x8651
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x21, sp, #0x30
    mov      sp, x21
    sub      x20, sp, #0x10
    mov      sp, x20
    sub      x22, sp, #0x40
    mov      sp, x22
    tbnz     x23, #0x3f, #0x246a34
    adrp     x8, #0x4c0000
    ldr      x24, [x8, #0x700]
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    cmp      x26, x23
    b.le     #0x246a34
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x310]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb00]
    adrp     x2, #0x521000
    add      x2, x2, #0x520
    mov      x3, #0
    mov      w4, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x21]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    str      d8, [x21, #8]
    adrp     x8, #0x246000
    add      x8, x8, #0xa80
    adrp     x9, #0x4a2000
    add      x9, x9, #0xd08
    stp      x8, x9, [x21, #0x10]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    str      x23, [x21, #0x20]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x770]
    mov      x0, x24
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c54 // _objc_initWeak
    adrp     x28, #0x4c4000
    ldr      x0, [x28, #0x318]
    adrp     x8, #0x4bf000
    ldr      x25, [x8, #0xb08]
    adrp     x2, #0x521000
    add      x2, x2, #0x4e0
    mov      x1, x25
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4bf000
    ldr      x26, [x8, #0xb10]
    mov      x0, x24
    mov      x1, x26
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    ldr      x27, [x28, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x22]
    str      d8, [x22, #8]
    adrp     x8, #0x246000
    add      x8, x8, #0xb18
    adrp     x9, #0x4a2000
    add      x9, x9, #0xd38
    stp      x8, x9, [x22, #0x10]
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    str      x24, [x22, #0x20]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    str      x23, [x22, #0x28]
    add      x0, x22, #0x30
    mov      x1, x20
    bl       #0x461c00 // _objc_copyWeak
    adrp     x2, #0x521000
    add      x2, x2, #0x4a0
    mov      x0, x27
    mov      x1, x25
    mov      x3, #0
    mov      x4, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x24
    mov      x1, x26
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x19
    mov      x2, x24
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    add      x0, x22, #0x30
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x22, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x22, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x21, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
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
    b        #0x246a5c
    mov      x19, x0
    add      x0, x22, #0x30
    bl       #0x461c0c // _objc_destroyWeak
    b        #0x246a70
    mov      x19, x0
    mov      x0, x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGCodeLibraryViewController deleteEntryAtRow:] IMP=0x246C70 bounds=0x246C70-0x247104
loc_246C70:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x22, x2
    mov      x19, x0
    adrp     x8, #0x57f000
    add      x8, x8, #0x89c
    ldar     w9, [x8]
    cbnz     w9, #0x246e24
    adrp     x9, #0x521000
    add      x9, x9, #0x54c
    ldrh     w10, [x9]
    mov      w11, #0xbcf8
    adrp     x12, #0x521000
    add      x12, x12, #0x552
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0xee68
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x471d
    eor      w9, w9, w10
    strh     w9, [x12, #4]
    adrp     x9, #0x521000
    add      x9, x9, #0x594
    ldrh     w10, [x9]
    mov      w11, #0x8311
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x59c
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xdd86
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xc029
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w9, [x9, #6]
    mov      w10, #0xd403
    eor      w9, w9, w10
    strh     w9, [x11, #6]
    adrp     x9, #0x521000
    add      x9, x9, #0x560
    ldrh     w10, [x9]
    mov      w11, #0x6c44
    adrp     x12, #0x521000
    add      x12, x12, #0x580
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x2814
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x43b3
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x583c
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0xdbfc
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w10, [x9, #0xa]
    mov      w11, #0xedbd
    eor      w10, w10, w11
    strh     w10, [x12, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w11, #0xe2c2
    eor      w10, w10, w11
    strh     w10, [x12, #0xc]
    ldrh     w10, [x9, #0xe]
    mov      w11, #0x48c2
    eor      w10, w10, w11
    strh     w10, [x12, #0xe]
    ldrh     w10, [x9, #0x10]
    mov      w11, #0xfd45
    eor      w10, w10, w11
    strh     w10, [x12, #0x10]
    ldrh     w9, [x9, #0x12]
    mov      w10, #0xe7a8
    eor      w9, w9, w10
    strh     w9, [x12, #0x12]
    adrp     x9, #0x521000
    add      x9, x9, #0x540
    ldrh     w10, [x9]
    mov      w11, #0xc99
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x546
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xeccc
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x4ee4
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x20, sp, #0x10
    mov      sp, x20
    sub      x21, sp, #0x30
    mov      sp, x21
    tbnz     x22, #0x3f, #0x2470bc
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0x700]
    mov      x0, x19
    mov      x1, x23
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
    cmp      x25, x22
    b.le     #0x2470bc
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x23, [x8, #0xb8]
    adrp     x8, #0x4bf000
    ldr      x26, [x8, #0x8d0]
    mov      x0, x22
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    cbz      x0, #0x246f14
    mov      x0, x22
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    b        #0x246f1c
    adrp     x26, #0x521000
    add      x26, x26, #0x690
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    str      x26, [sp, #-0x10]!
    adrp     x2, #0x521000
    add      x2, x2, #0x650
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    add      sp, sp, #0x10
    mov      x23, x0
    cbz      x25, #0x246f54
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x310]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb00]
    mov      x2, #0
    mov      x3, x23
    mov      w4, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c54 // _objc_initWeak
    adrp     x28, #0x4c4000
    ldr      x0, [x28, #0x318]
    adrp     x8, #0x4bf000
    ldr      x25, [x8, #0xb08]
    adrp     x2, #0x521000
    add      x2, x2, #0x610
    mov      x1, x25
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4bf000
    ldr      x26, [x8, #0xb10]
    mov      x0, x24
    mov      x1, x26
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    ldr      x27, [x28, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x21]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x21, #8]
    adrp     x8, #0x247000
    add      x8, x8, #0x104
    adrp     x9, #0x4a2000
    add      x9, x9, #0xca8
    stp      x8, x9, [x21, #0x10]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    str      x22, [x21, #0x20]
    add      x0, x21, #0x28
    mov      x1, x20
    bl       #0x461c00 // _objc_copyWeak
    adrp     x2, #0x521000
    add      x2, x2, #0x5d0
    mov      x0, x27
    mov      x1, x25
    mov      w3, #2
    mov      x4, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x24
    mov      x1, x26
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x19
    mov      x2, x24
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    add      x0, x21, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x21, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    b        #0x2470e0
    mov      x19, x0
    add      x0, x21, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    b        #0x2470f4
    mov      x19, x0
    mov      x0, x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGCodeLibraryViewController addTapped] IMP=0x247184 bounds=0x247184-0x24758C
loc_247184:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x57f000
    add      x8, x8, #0x8a4
    ldar     w9, [x8]
    cbnz     w9, #0x2472e8
    adrp     x9, #0x521000
    add      x9, x9, #0x6d4
    ldrh     w10, [x9]
    mov      w11, #0x5c4e
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x6e2
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xef4b
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xc4e
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xbe31
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x7f77
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0xb8de
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w9, [x9, #0xc]
    mov      w10, #0x4f6f
    eor      w9, w9, w10
    strh     w9, [x11, #0xc]
    adrp     x9, #0x521000
    add      x9, x9, #0x6bc
    ldrh     w10, [x9]
    mov      w11, #0x5ab6
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x6c8
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x687c
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xd1da
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x8acb
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x6b7b
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w9, [x9, #0xa]
    mov      w10, #0x739a
    eor      w9, w9, w10
    strh     w9, [x11, #0xa]
    adrp     x9, #0x521000
    add      x9, x9, #0x6b0
    ldrh     w10, [x9]
    mov      w11, #0xcb87
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x6b6
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x44e1
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x8439
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x20, sp, #0x10
    mov      sp, x20
    sub      x23, sp, #0x30
    mov      sp, x23
    sub      x21, sp, #0x30
    mov      sp, x21
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x310]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb00]
    mov      x2, #0
    mov      x3, #0
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c54 // _objc_initWeak
    bl       #0x2ecad8
    stur     x19, [x29, #-0x58]
    adrp     x9, #0x4c4000
    adrp     x27, #0x4a0000
    ldr      x27, [x27, #0x748]
    adrp     x19, #0x491000
    adrp     x28, #0x4bf000
    adrp     x10, #0x4a2000
    add      x10, x10, #0xcd8
    cbz      w0, #0x247374
    adrp     x8, #0x4bf000
    ldr      x24, [x8, #0xb08]
    b        #0x2473f8
    ldr      x25, [x9, #0x318]
    str      x27, [x23]
    ldr      d0, [x19, #0x388]
    str      d0, [x23, #8]
    adrp     x8, #0x247000
    add      x8, x8, #0x58c
    stp      x8, x10, [x23, #0x10]
    mov      x26, x10
    add      x0, x23, #0x20
    mov      x1, x20
    bl       #0x461c00 // _objc_copyWeak
    adrp     x8, #0x4bf000
    ldr      x24, [x8, #0xb08]
    adrp     x2, #0x521000
    add      x2, x2, #0x790
    mov      x0, x25
    mov      x1, x24
    mov      x3, #0
    mov      x4, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x1, [x28, #0xb10]
    mov      x0, x22
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    add      x0, x23, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    adrp     x9, #0x4c4000
    mov      x10, x26
    mov      x26, x9
    ldr      x23, [x9, #0x318]
    str      x27, [x21]
    ldr      d0, [x19, #0x388]
    str      d0, [x21, #8]
    adrp     x8, #0x247000
    add      x8, x8, #0x5c0
    stp      x8, x10, [x21, #0x10]
    add      x0, x21, #0x20
    mov      x1, x20
    bl       #0x461c00 // _objc_copyWeak
    adrp     x2, #0x521000
    add      x2, x2, #0x750
    mov      x0, x23
    mov      x1, x24
    mov      x3, #0
    mov      x4, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x23, [x28, #0xb10]
    mov      x0, x22
    mov      x1, x23
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x318]
    adrp     x2, #0x521000
    add      x2, x2, #0x710
    mov      x1, x24
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldur     x19, [x29, #-0x58]
    mov      x24, x0
    mov      x0, x22
    mov      x1, x23
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x678]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb58]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x790]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x19
    mov      x2, x22
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    add      x0, x21, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    mov      x19, x0
    add      x0, x23, #0x20
    b        #0x247578
    mov      x19, x0
    b        #0x24757c
    b        #0x247570
    mov      x19, x0
    add      x0, x21, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGCodeLibraryViewController saveCurrentInUse] IMP=0x2475F4 bounds=0x2475F4-0x247BF4
loc_2475F4:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x57f000
    add      x8, x8, #0x8b0
    ldar     w9, [x8]
    cbnz     w9, #0x247a38
    adrp     x9, #0x521000
    add      x9, x9, #0x8a0
    ldrh     w10, [x9]
    mov      w11, #0x5f75
    adrp     x12, #0x521000
    add      x12, x12, #0x8ac
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x13c0
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x53ba
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0xa72a
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0x1b15
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w9, [x9, #0xa]
    mov      w10, #0xb638
    eor      w9, w9, w10
    strh     w9, [x12, #0xa]
    adrp     x9, #0x521000
    add      x9, x9, #0x890
    ldrh     w10, [x9]
    mov      w11, #0xf328
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x898
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xc484
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x1ec9
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w9, [x9, #6]
    mov      w10, #0xfb98
    eor      w9, w9, w10
    strh     w9, [x11, #6]
    adrp     x9, #0x521000
    add      x9, x9, #0x810
    ldrh     w11, [x9]
    mov      w12, #0x2300
    adrp     x10, #0x521000
    add      x10, x10, #0x850
    eor      w11, w11, w12
    strh     w11, [x10]
    ldrh     w11, [x9, #2]
    mov      w12, #0x7c83
    eor      w11, w11, w12
    strh     w11, [x10, #2]
    ldrh     w11, [x9, #4]
    mov      w12, #0x2c0
    eor      w11, w11, w12
    strh     w11, [x10, #4]
    ldrh     w11, [x9, #6]
    mov      w12, #0xb01f
    eor      w11, w11, w12
    strh     w11, [x10, #6]
    ldrh     w11, [x9, #8]
    mov      w12, #0xee65
    eor      w11, w11, w12
    strh     w11, [x10, #8]
    ldrh     w11, [x9, #0xa]
    mov      w12, #0x6534
    eor      w11, w11, w12
    strh     w11, [x10, #0xa]
    ldrh     w11, [x9, #0xc]
    mov      w12, #0x56fb
    eor      w11, w11, w12
    strh     w11, [x10, #0xc]
    ldrh     w11, [x9, #0xe]
    mov      w12, #0x28b1
    eor      w11, w11, w12
    strh     w11, [x10, #0xe]
    ldrh     w11, [x9, #0x10]
    mov      w12, #0x654e
    eor      w11, w11, w12
    strh     w11, [x10, #0x10]
    ldrh     w11, [x9, #0x12]
    mov      w12, #0x515c
    eor      w11, w11, w12
    strh     w11, [x10, #0x12]
    ldrh     w11, [x9, #0x14]
    mov      w12, #0x6fb9
    eor      w11, w11, w12
    strh     w11, [x10, #0x14]
    ldrh     w11, [x9, #0x16]
    mov      w12, #0x33db
    eor      w11, w11, w12
    strh     w11, [x10, #0x16]
    ldrh     w11, [x9, #0x18]
    mov      w12, #0x4bb9
    eor      w11, w11, w12
    strh     w11, [x10, #0x18]
    ldrh     w11, [x9, #0x1a]
    mov      w12, #0xaf0a
    eor      w11, w11, w12
    strh     w11, [x10, #0x1a]
    ldrh     w11, [x9, #0x1c]
    mov      w12, #0x1375
    eor      w11, w11, w12
    strh     w11, [x10, #0x1c]
    ldrh     w11, [x9, #0x1e]
    mov      w12, #0x6cfe
    eor      w11, w11, w12
    strh     w11, [x10, #0x1e]
    ldrh     w11, [x9, #0x20]
    mov      w12, #0x9980
    eor      w11, w11, w12
    strh     w11, [x10, #0x20]
    ldrh     w11, [x9, #0x22]
    mov      w12, #0x2998
    eor      w11, w11, w12
    strh     w11, [x10, #0x22]
    ldrh     w11, [x9, #0x24]
    mov      w12, #0x6474
    eor      w11, w11, w12
    strh     w11, [x10, #0x24]
    ldrh     w11, [x9, #0x26]
    mov      w12, #0x97bb
    eor      w11, w11, w12
    strh     w11, [x10, #0x26]
    ldrh     w11, [x9, #0x28]
    mov      w12, #0x5d33
    eor      w11, w11, w12
    strh     w11, [x10, #0x28]
    ldrh     w11, [x9, #0x2a]
    mov      w12, #0x792a
    eor      w11, w11, w12
    strh     w11, [x10, #0x2a]
    ldrh     w11, [x9, #0x2c]
    mov      w12, #0x18dd
    eor      w11, w11, w12
    strh     w11, [x10, #0x2c]
    ldrh     w11, [x9, #0x2e]
    mov      w12, #0xd5f
    eor      w11, w11, w12
    strh     w11, [x10, #0x2e]
    ldrh     w11, [x9, #0x30]
    mov      w12, #0x6ee1
    eor      w11, w11, w12
    strh     w11, [x10, #0x30]
    ldrh     w11, [x9, #0x32]
    mov      w12, #0xcf2c
    eor      w11, w11, w12
    strh     w11, [x10, #0x32]
    ldrh     w11, [x9, #0x34]
    mov      w12, #0xf1a3
    eor      w11, w11, w12
    strh     w11, [x10, #0x34]
    ldrh     w11, [x9, #0x36]
    mov      w12, #0xa9f1
    eor      w11, w11, w12
    strh     w11, [x10, #0x36]
    ldrh     w11, [x9, #0x38]
    mov      w12, #0x1d97
    eor      w11, w11, w12
    strh     w11, [x10, #0x38]
    ldrh     w11, [x9, #0x3a]
    mov      w12, #0xb61d
    eor      w11, w11, w12
    strh     w11, [x10, #0x3a]
    ldrh     w11, [x9, #0x3c]
    mov      w12, #0x9305
    eor      w11, w11, w12
    strh     w11, [x10, #0x3c]
    ldrh     w9, [x9, #0x3e]
    mov      w11, #0x21f4
    eor      w9, w9, w11
    strh     w9, [x10, #0x3e]
    adrp     x9, #0x521000
    add      x9, x9, #0x7b0
    ldrh     w11, [x9]
    mov      w12, #0x9def
    adrp     x10, #0x521000
    add      x10, x10, #0x7e0
    eor      w11, w11, w12
    strh     w11, [x10]
    ldrh     w11, [x9, #2]
    mov      w12, #0x3f36
    eor      w11, w11, w12
    strh     w11, [x10, #2]
    ldrh     w11, [x9, #4]
    mov      w12, #0xd920
    eor      w11, w11, w12
    strh     w11, [x10, #4]
    ldrh     w11, [x9, #6]
    mov      w12, #0x5ad0
    eor      w11, w11, w12
    strh     w11, [x10, #6]
    ldrh     w11, [x9, #8]
    mov      w12, #0x31c3
    eor      w11, w11, w12
    strh     w11, [x10, #8]
    ldrh     w11, [x9, #0xa]
    mov      w12, #0x3e4c
    eor      w11, w11, w12
    strh     w11, [x10, #0xa]
    ldrh     w11, [x9, #0xc]
    mov      w12, #0x1216
    eor      w11, w11, w12
    strh     w11, [x10, #0xc]
    ldrh     w11, [x9, #0xe]
    mov      w12, #0xb934
    eor      w11, w11, w12
    strh     w11, [x10, #0xe]
    ldrh     w11, [x9, #0x10]
    mov      w12, #0x8b
    eor      w11, w11, w12
    strh     w11, [x10, #0x10]
    ldrh     w11, [x9, #0x12]
    mov      w12, #0x5996
    eor      w11, w11, w12
    strh     w11, [x10, #0x12]
    ldrh     w11, [x9, #0x14]
    mov      w12, #0x6069
    eor      w11, w11, w12
    strh     w11, [x10, #0x14]
    ldrh     w11, [x9, #0x16]
    mov      w12, #0xfecf
    eor      w11, w11, w12
    strh     w11, [x10, #0x16]
    ldrh     w11, [x9, #0x18]
    mov      w12, #0x6fb1
    eor      w11, w11, w12
    strh     w11, [x10, #0x18]
    ldrh     w11, [x9, #0x1a]
    mov      w12, #0x8c0c
    eor      w11, w11, w12
    strh     w11, [x10, #0x1a]
    ldrh     w11, [x9, #0x1c]
    mov      w12, #0x35db
    eor      w11, w11, w12
    strh     w11, [x10, #0x1c]
    ldrh     w11, [x9, #0x1e]
    mov      w12, #0x3b64
    eor      w11, w11, w12
    strh     w11, [x10, #0x1e]
    ldrh     w11, [x9, #0x20]
    mov      w12, #0x27a0
    eor      w11, w11, w12
    strh     w11, [x10, #0x20]
    ldrh     w11, [x9, #0x22]
    mov      w12, #0x8bf7
    eor      w11, w11, w12
    strh     w11, [x10, #0x22]
    ldrh     w11, [x9, #0x24]
    mov      w12, #0xe615
    eor      w11, w11, w12
    strh     w11, [x10, #0x24]
    ldrh     w9, [x9, #0x26]
    mov      w11, #0x9119
    eor      w9, w9, w11
    strh     w9, [x10, #0x26]
    mov      w9, #1
    stlr     w9, [x8]
    bl       #0x2ecad8
    cbz      w0, #0x247ae8
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x310]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb00]
    adrp     x2, #0x521000
    add      x2, x2, #0x9a0
    adrp     x3, #0x521000
    add      x3, x3, #0x920
    mov      w4, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x318]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb08]
    adrp     x2, #0x521000
    add      x2, x2, #0x8e0
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb10]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x19
    mov      x2, x20
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    b        #0x247be0
    bl       #0x31ac58
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x247b40
    mov      x0, x20
    mov      x1, #0
    bl       #0x240770
    mov      x29, x29
    bl       #0x461d38 // _objc_unsafeClaimAutoreleasedReturnValue
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x748]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6e0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    b        #0x247be0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x310]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb00]
    adrp     x3, #0x521000
    add      x3, x3, #0x960
    mov      x2, #0
    mov      w4, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x318]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb08]
    adrp     x2, #0x521000
    add      x2, x2, #0x8e0
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb10]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x19
    mov      x2, x21
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGCodeLibraryViewController importFromFiles] IMP=0x247BF4 bounds=0x247BF4-0x247CE8
loc_247BF4:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x6d8]
    ldr      x2, [x8]
    adrp     x21, #0x4be000
    cbz      x2, #0x247c48
    ldr      x1, [x21, #0x830]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x6e0]
    ldr      x2, [x8]
    cbz      x2, #0x247c64
    ldr      x1, [x21, #0x830]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x458]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x798]
    mov      x2, x20
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc78]
    mov      x0, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7a8]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x19
    mov      x2, x21
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGCodeLibraryViewController documentPicker:didPickDocumentsAtURLs:] IMP=0x247CE8 bounds=0x247CE8-0x2482A0
loc_247CE8:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x57f000
    add      x8, x8, #0x8b8
    ldar     w9, [x8]
    cbnz     w9, #0x248034
    adrp     x9, #0x521000
    add      x9, x9, #0xa48
    ldrh     w10, [x9]
    mov      w11, #0xed6b
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0xa52
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xbe0f
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x6384
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xf9f8
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x5ca7
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x521000
    add      x9, x9, #0x9d0
    ldrh     w10, [x9]
    mov      w11, #0x3fda
    eor      w11, w10, w11
    adrp     x10, #0x521000
    add      x10, x10, #0xa10
    strh     w11, [x10]
    ldrh     w11, [x9, #2]
    mov      w12, #0xc96f
    eor      w11, w11, w12
    strh     w11, [x10, #2]
    ldrh     w11, [x9, #4]
    mov      w12, #0xb553
    eor      w11, w11, w12
    strh     w11, [x10, #4]
    ldrh     w11, [x9, #6]
    mov      w12, #0x92ed
    eor      w11, w11, w12
    strh     w11, [x10, #6]
    ldrh     w11, [x9, #8]
    mov      w12, #0xb39e
    eor      w11, w11, w12
    strh     w11, [x10, #8]
    ldrh     w11, [x9, #0xa]
    mov      w12, #0x7cca
    eor      w11, w11, w12
    strh     w11, [x10, #0xa]
    ldrh     w11, [x9, #0xc]
    mov      w12, #0x81e3
    eor      w11, w11, w12
    strh     w11, [x10, #0xc]
    ldrh     w11, [x9, #0xe]
    mov      w12, #0x5410
    eor      w11, w11, w12
    strh     w11, [x10, #0xe]
    ldrh     w11, [x9, #0x10]
    mov      w12, #0x18a2
    eor      w11, w11, w12
    strh     w11, [x10, #0x10]
    ldrh     w11, [x9, #0x12]
    mov      w12, #0x2523
    eor      w11, w11, w12
    strh     w11, [x10, #0x12]
    ldrh     w11, [x9, #0x14]
    mov      w12, #0x28b9
    eor      w11, w11, w12
    strh     w11, [x10, #0x14]
    ldrh     w11, [x9, #0x16]
    mov      w12, #0xbe1f
    eor      w11, w11, w12
    strh     w11, [x10, #0x16]
    ldrh     w11, [x9, #0x18]
    mov      w12, #0x946f
    eor      w11, w11, w12
    strh     w11, [x10, #0x18]
    ldrh     w11, [x9, #0x1a]
    mov      w12, #0x5b1c
    eor      w11, w11, w12
    strh     w11, [x10, #0x1a]
    ldrh     w11, [x9, #0x1c]
    mov      w12, #0x1271
    eor      w11, w11, w12
    strh     w11, [x10, #0x1c]
    ldrh     w11, [x9, #0x1e]
    mov      w12, #0x82c4
    eor      w11, w11, w12
    strh     w11, [x10, #0x1e]
    ldrh     w11, [x9, #0x20]
    mov      w12, #0x62e0
    eor      w11, w11, w12
    strh     w11, [x10, #0x20]
    ldrh     w11, [x9, #0x22]
    mov      w12, #0x40a8
    eor      w11, w11, w12
    strh     w11, [x10, #0x22]
    ldrh     w11, [x9, #0x24]
    mov      w12, #0x816f
    eor      w11, w11, w12
    strh     w11, [x10, #0x24]
    ldrh     w11, [x9, #0x26]
    mov      w12, #0x47ca
    eor      w11, w11, w12
    strh     w11, [x10, #0x26]
    ldrh     w11, [x9, #0x28]
    mov      w12, #0x4a2c
    eor      w11, w11, w12
    strh     w11, [x10, #0x28]
    ldrh     w11, [x9, #0x2a]
    mov      w12, #0xae27
    eor      w11, w11, w12
    strh     w11, [x10, #0x2a]
    ldrh     w11, [x9, #0x2c]
    mov      w12, #0x4b0
    eor      w11, w11, w12
    strh     w11, [x10, #0x2c]
    ldrh     w11, [x9, #0x2e]
    mov      w12, #0xf99
    eor      w11, w11, w12
    strh     w11, [x10, #0x2e]
    ldrh     w11, [x9, #0x30]
    mov      w12, #0x34a
    eor      w11, w11, w12
    strh     w11, [x10, #0x30]
    ldrh     w11, [x9, #0x32]
    mov      w12, #0xef5a
    eor      w11, w11, w12
    strh     w11, [x10, #0x32]
    ldrh     w11, [x9, #0x34]
    mov      w12, #0x7dbd
    eor      w11, w11, w12
    strh     w11, [x10, #0x34]
    ldrh     w9, [x9, #0x36]
    mov      w11, #0x5535
    eor      w9, w9, w11
    strh     w9, [x10, #0x36]
    adrp     x9, #0x521000
    add      x9, x9, #0xa5c
    ldrb     w10, [x9]
    mvn      w10, w10
    adrp     x11, #0x521000
    add      x11, x11, #0xa66
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x73
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x9e
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0xac
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0xffffffc3
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0x22222222
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0xb1
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0xc6
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    eor      w10, w10, #0xffffffef
    strb     w10, [x11, #8]
    ldrb     w9, [x9, #9]
    mov      w10, #0x72
    eor      w9, w9, w10
    strb     w9, [x11, #9]
    adrp     x9, #0x521000
    add      x9, x9, #0x9c0
    ldrh     w10, [x9]
    mov      w11, #0xbefa
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0x9c8
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xac9d
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xfe33
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w9, [x9, #6]
    mov      w10, #0x5374
    eor      w9, w9, w10
    strh     w9, [x11, #6]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x918]
    mov      x0, x3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    cbz      x0, #0x248284
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7b0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x420]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x338]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2480c0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    b        #0x2480c8
    adrp     x21, #0x521000
    add      x21, x21, #0xb50
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x26, #0x4c4000
    ldr      x0, [x26, #0xb8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7b8]
    mov      x2, x20
    mov      w3, #4
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x248164
    cbz      w24, #0x24811c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7d0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2481d0
    mov      x0, x22
    mov      x1, x21
    bl       #0x240770
    mov      x29, x29
    bl       #0x461d38 // _objc_unsafeClaimAutoreleasedReturnValue
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x748]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6e0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    b        #0x248274
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x130]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7c0]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2481c0
    ldr      x0, [x26, #0xb8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7c8]
    mov      x2, x25
    mov      w3, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x22, x26
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    cbnz     w24, #0x24810c
    b        #0x24811c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x310]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb00]
    adrp     x2, #0x521000
    add      x2, x2, #0xb10
    adrp     x3, #0x521000
    add      x3, x3, #0xa90
    mov      w4, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x318]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb08]
    adrp     x2, #0x521000
    add      x2, x2, #0xad0
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb10]
    mov      x0, x23
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x19
    mov      x2, x23
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    b        #0x461c9c // _objc_release

// -[WCLGCodeLibraryViewController tableView:numberOfRowsInSection:] IMP=0x2482A0 bounds=0x2482A0-0x2482EC
loc_2482A0:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x700]
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

// -[WCLGCodeLibraryViewController tableView:cellForRowAtIndexPath:] IMP=0x2482EC bounds=0x2482EC-0x248ABC
loc_2482EC:
    sub      sp, sp, #0x70
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x20, x3
    mov      x19, x2
    mov      x22, x0
    adrp     x8, #0x57f000
    add      x8, x8, #0x8c0
    ldar     w9, [x8]
    cbnz     w9, #0x248584
    adrp     x9, #0x521000
    add      x9, x9, #0xba4
    ldrh     w10, [x9]
    mov      w11, #0x4fd2
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0xbb0
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x503d
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xcf96
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xab69
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x2bb2
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w9, [x9, #0xa]
    mov      w10, #0xbbd7
    eor      w9, w9, w10
    strh     w9, [x11, #0xa]
    adrp     x9, #0x521000
    add      x9, x9, #0xb88
    ldrh     w10, [x9]
    mov      w11, #0x930
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0xb96
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xa40d
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x610a
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xc398
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0xb670
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0x8ce9
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w9, [x9, #0xc]
    mov      w10, #0x847f
    eor      w9, w9, w10
    adrp     x10, #0x521000
    add      x10, x10, #0xbbc
    strh     w9, [x11, #0xc]
    ldrb     w9, [x10]
    eor      w9, w9, #0x80
    adrp     x11, #0x521000
    add      x11, x11, #0xbcc
    strb     w9, [x11]
    ldrb     w9, [x10, #1]
    mov      w12, #0xec
    eor      w9, w9, w12
    strb     w9, [x11, #1]
    ldrb     w9, [x10, #2]
    mov      w12, #0x98
    eor      w9, w9, w12
    strb     w9, [x11, #2]
    ldrb     w9, [x10, #3]
    mov      w12, #0x5b
    eor      w9, w9, w12
    strb     w9, [x11, #3]
    ldrb     w9, [x10, #4]
    mov      w12, #0xc9
    eor      w9, w9, w12
    strb     w9, [x11, #4]
    ldrb     w9, [x10, #5]
    mov      w12, #0xae
    eor      w9, w9, w12
    strb     w9, [x11, #5]
    ldrb     w9, [x10, #6]
    mov      w12, #0xa1
    eor      w9, w9, w12
    strb     w9, [x11, #6]
    ldrb     w9, [x10, #7]
    mov      w12, #0xb8
    eor      w9, w9, w12
    strb     w9, [x11, #7]
    ldrb     w9, [x10, #8]
    mov      w12, #0x4d
    eor      w9, w9, w12
    strb     w9, [x11, #8]
    ldrb     w9, [x10, #9]
    eor      w9, w9, #0x78
    strb     w9, [x11, #9]
    ldrb     w9, [x10, #0xa]
    eor      w9, w9, #0x60
    strb     w9, [x11, #0xa]
    ldrb     w9, [x10, #0xb]
    mov      w12, #0x94
    eor      w9, w9, w12
    strb     w9, [x11, #0xb]
    ldrb     w9, [x10, #0xc]
    eor      w9, w9, #0x77777777
    strb     w9, [x11, #0xc]
    ldrb     w9, [x10, #0xd]
    eor      w9, w9, #0x3c
    strb     w9, [x11, #0xd]
    ldrb     w9, [x10, #0xe]
    mov      w12, #0xea
    eor      w9, w9, w12
    strb     w9, [x11, #0xe]
    ldrb     w9, [x10, #0xf]
    mov      w10, #0xe6
    eor      w9, w9, w10
    strb     w9, [x11, #0xf]
    adrp     x9, #0x521000
    add      x9, x9, #0xb70
    ldrh     w10, [x9]
    mov      w11, #0x221c
    eor      w10, w10, w11
    adrp     x11, #0x521000
    add      x11, x11, #0xb7c
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xf47c
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xcd42
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x95da
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x8b8b
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w9, [x9, #0xa]
    mov      w10, #0xe06f
    eor      w9, w9, w10
    strh     w9, [x11, #0xa]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7d8]
    adrp     x2, #0x521000
    add      x2, x2, #0xcc0
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    cbnz     x0, #0x2485ec
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2b8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7e0]
    adrp     x3, #0x521000
    add      x3, x3, #0xcc0
    mov      w2, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x5f0]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    tbnz     x0, #0x3f, #0x248a88
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    adrp     x8, #0x4c0000
    ldr      x24, [x8, #0x700]
    mov      x0, x22
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
    b.ge     #0x248a88
    mov      x0, x22
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x24, [x8, #0x740]
    mov      x0, x23
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x248730
    mov      x0, x23
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7e8]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    mov      x0, x26
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    b        #0x248734
    mov      w24, #0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8d0]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4c0000
    ldr      x26, [x8, #0x7f0]
    mov      x0, x21
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x6f8]
    mov      x1, x25
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x388]
    adrp     x10, #0x4a0000
    ldr      x10, [x10, #0x380]
    ldr      x0, [x8, #0x218]
    tst      w24, #1
    csel     x8, x9, x10, ne
    ldr      d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    fmov     d0, #16.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x21
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x7f8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xef0]
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x26, [x8, #0x2a0]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7f8]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    str      x0, [sp]
    adrp     x2, #0x521000
    add      x2, x2, #0xc40
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4c0000
    ldr      x27, [x8, #0x800]
    mov      x0, x23
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    bl       #0x461c9c // _objc_release
    cbz      x28, #0x248970
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x23
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x7e0]
    mov      x0, x22
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8c0]
    str      x0, [sp]
    adrp     x2, #0x521000
    add      x2, x2, #0xc80
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    tbz      w24, #0, #0x24898c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x810]
    adrp     x2, #0x521000
    add      x2, x2, #0xc00
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x818]
    mov      x0, x21
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x1, x25
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    tbz      w24, #0, #0x2489d8
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x820]
    b        #0x2489e0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc18]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x21
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    tbz      w24, #0, #0x248a4c
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x708]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #3
    csel     x2, xzr, x8, ne
    b        #0x248a54
    bl       #0x461c9c // _objc_release
    mov      x2, #0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x828]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x830]
    mov      x0, x21
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    add      sp, sp, #0x70
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGCodeLibraryViewController tableView:didSelectRowAtIndexPath:] IMP=0x248ABC bounds=0x248ABC-0x248B68
loc_248ABC:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x20, x3
    mov      x19, x2
    mov      x21, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x708]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x248b10
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x720]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    b        #0x248b4c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x738]
    mov      x0, x19
    mov      x2, x20
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5f0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x838]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGCodeLibraryViewController tableView:didDeselectRowAtIndexPath:] IMP=0x248B68 bounds=0x248B68-0x248BB0
loc_248B68:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x708]
    mov      x0, x2
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x248ba4
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x720]
    mov      x0, x19
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    ret      

// -[WCLGCodeLibraryViewController tableView:editingStyleForRowAtIndexPath:] IMP=0x248BB0 bounds=0x248BB0-0x248BB8
loc_248BB0:
    mov      x0, #0
    ret      

// -[WCLGCodeLibraryViewController tableView:canEditRowAtIndexPath:] IMP=0x248BB8 bounds=0x248BB8-0x248BC0
loc_248BB8:
    mov      w0, #1
    ret      

// -[WCLGCodeLibraryViewController tableView:canMoveRowAtIndexPath:] IMP=0x248BC0 bounds=0x248BC0-0x248BC8
loc_248BC0:
    mov      w0, #1
    ret      

// -[WCLGCodeLibraryViewController tableView:moveRowAtIndexPath:toIndexPath:] IMP=0x248BC8 bounds=0x248BC8-0x248EDC
loc_248BC8:
    sub      sp, sp, #0x150
    stp      x28, x27, [sp, #0xf0]
    stp      x26, x25, [sp, #0x100]
    stp      x24, x23, [sp, #0x110]
    stp      x22, x21, [sp, #0x120]
    stp      x20, x19, [sp, #0x130]
    stp      x29, x30, [sp, #0x140]
    add      x29, sp, #0x140
    mov      x19, x4
    mov      x21, x3
    mov      x20, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x60]
    mov      x0, x4
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x5f0]
    mov      x0, x21
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    tbnz     x24, #0x3f, #0x248e98
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x700]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x600]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cmp      x24, x0
    b.ge     #0x248e90
    tbnz     x23, #0x3f, #0x248e90
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cmp      x23, x25
    b.ge     #0x248e98
    str      x19, [sp, #0x18]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x840]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x5f0]
    str      x19, [sp, #8]
    mov      x2, x19
    mov      x3, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x20]
    stp      q0, q0, [sp, #0x40]
    str      x20, [sp, #0x10]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x478]
    add      x2, sp, #0x20
    add      x3, sp, #0x60
    mov      x1, x24
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x248e58
    mov      x25, x0
    ldr      x8, [sp, #0x30]
    ldr      x21, [x8]
    adrp     x19, #0x4be000
    mov      x20, #0
    adrp     x8, #0x4c0000
    ldr      x26, [x8, #0x740]
    ldr      x27, [x19, #0x830]
    ldr      x8, [sp, #0x30]
    ldr      x8, [x8]
    cmp      x8, x21
    b.eq     #0x248df8
    mov      x0, x22
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp, #0x28]
    ldr      x0, [x8, x20, lsl #3]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x0, x23
    mov      x1, x27
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    add      x20, x20, #1
    cmp      x25, x20
    b.ne     #0x248de0
    add      x2, sp, #0x20
    add      x3, sp, #0x60
    mov      x0, x22
    mov      x1, x24
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    cbnz     x0, #0x248dd0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x24283c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x748]
    ldr      x0, [sp, #0x10]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #8]
    bl       #0x461c9c // _objc_release
    ldr      x19, [sp, #0x18]
    b        #0x248e98
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x248ed8
    ldp      x29, x30, [sp, #0x140]
    ldp      x20, x19, [sp, #0x130]
    ldp      x22, x21, [sp, #0x120]
    ldp      x24, x23, [sp, #0x110]
    ldp      x26, x25, [sp, #0x100]
    ldp      x28, x27, [sp, #0xf0]
    add      sp, sp, #0x150
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGCodeLibraryViewController tableView:contextMenuConfigurationForRowAtIndexPath:point:] IMP=0x248EDC bounds=0x248EDC-0x24907C
loc_248EDC:
    sub      sp, sp, #0x90
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x20, x3
    mov      x19, x2
    mov      x21, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x708]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x24902c
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x5f0]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    tbnz     x0, #0x3f, #0x24902c
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x700]
    mov      x0, x21
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
    b.ge     #0x24902c
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    add      x0, sp, #0x38
    mov      x1, x21
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c4000
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x748]
    ldr      x21, [x8, #0x360]
    str      x9, [sp, #8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    adrp     x8, #0x249000
    add      x8, x8, #0x7c
    str      d0, [sp, #0x10]
    adrp     x9, #0x4a2000
    add      x9, x9, #0xdd8
    stp      x8, x9, [sp, #0x18]
    add      x23, sp, #8
    add      x0, x23, #0x20
    add      x1, sp, #0x38
    bl       #0x461c00 // _objc_copyWeak
    str      x22, [sp, #0x30]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xcd0]
    add      x4, sp, #8
    mov      x0, x21
    mov      x2, #0
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    add      x0, x23, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, sp, #0x38
    bl       #0x461c0c // _objc_destroyWeak
    b        #0x249030
    mov      x21, #0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    add      sp, sp, #0x90
    b        #0x461be8 // _objc_autoreleaseReturnValue
    mov      x19, x0
    add      x0, x23, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, sp, #0x38
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGCodeLibraryViewController tableView:titleForFooterInSection:] IMP=0x2495A4 bounds=0x2495A4-0x2498EC
loc_2495A4:
    adrp     x8, #0x57f000
    add      x8, x8, #0x8f0
    ldar     w9, [x8]
    cbnz     w9, #0x24988c
    adrp     x9, #0x521000
    add      x9, x9, #0xe60
    ldrh     w10, [x9]
    mov      w11, #0x51ed
    eor      w11, w10, w11
    adrp     x10, #0x521000
    add      x10, x10, #0xec0
    strh     w11, [x10]
    ldrh     w11, [x9, #2]
    mov      w12, #0x484a
    eor      w11, w11, w12
    strh     w11, [x10, #2]
    ldrh     w11, [x9, #4]
    mov      w12, #0x6fc2
    eor      w11, w11, w12
    strh     w11, [x10, #4]
    ldrh     w11, [x9, #6]
    mov      w12, #0xf62b
    eor      w11, w11, w12
    strh     w11, [x10, #6]
    ldrh     w11, [x9, #8]
    eor      w11, w11, #0xffff81ff
    strh     w11, [x10, #8]
    ldrh     w11, [x9, #0xa]
    mov      w12, #0x7b1b
    eor      w11, w11, w12
    strh     w11, [x10, #0xa]
    ldrh     w11, [x9, #0xc]
    mov      w12, #0xf13f
    eor      w11, w11, w12
    strh     w11, [x10, #0xc]
    ldrh     w11, [x9, #0xe]
    mov      w12, #0xef35
    eor      w11, w11, w12
    strh     w11, [x10, #0xe]
    ldrh     w11, [x9, #0x10]
    mov      w12, #0xb984
    eor      w11, w11, w12
    strh     w11, [x10, #0x10]
    ldrh     w11, [x9, #0x12]
    mov      w12, #0x150c
    eor      w11, w11, w12
    strh     w11, [x10, #0x12]
    ldrh     w11, [x9, #0x14]
    mov      w12, #0x5b45
    eor      w11, w11, w12
    strh     w11, [x10, #0x14]
    ldrh     w11, [x9, #0x16]
    mov      w12, #0x893c
    eor      w11, w11, w12
    strh     w11, [x10, #0x16]
    ldrh     w11, [x9, #0x18]
    mov      w12, #0x6ff8
    eor      w11, w11, w12
    strh     w11, [x10, #0x18]
    ldrh     w11, [x9, #0x1a]
    mov      w12, #0xf7a5
    eor      w11, w11, w12
    strh     w11, [x10, #0x1a]
    ldrh     w11, [x9, #0x1c]
    mov      w12, #0x7d13
    eor      w11, w11, w12
    strh     w11, [x10, #0x1c]
    ldrh     w11, [x9, #0x1e]
    mov      w12, #0x41c7
    eor      w11, w11, w12
    strh     w11, [x10, #0x1e]
    ldrh     w11, [x9, #0x20]
    mov      w12, #0xc08c
    eor      w11, w11, w12
    strh     w11, [x10, #0x20]
    ldrh     w11, [x9, #0x22]
    mov      w12, #0x81ee
    eor      w11, w11, w12
    strh     w11, [x10, #0x22]
    ldrh     w11, [x9, #0x24]
    mov      w12, #0xbb78
    eor      w11, w11, w12
    strh     w11, [x10, #0x24]
    ldrh     w11, [x9, #0x26]
    mov      w12, #0x3436
    eor      w11, w11, w12
    strh     w11, [x10, #0x26]
    ldrh     w11, [x9, #0x28]
    mov      w12, #0x91b1
    eor      w11, w11, w12
    strh     w11, [x10, #0x28]
    ldrh     w11, [x9, #0x2a]
    mov      w12, #0x893e
    eor      w11, w11, w12
    strh     w11, [x10, #0x2a]
    ldrh     w11, [x9, #0x2c]
    mov      w12, #0x35a0
    eor      w11, w11, w12
    strh     w11, [x10, #0x2c]
    ldrh     w11, [x9, #0x2e]
    mov      w12, #0x66f8
    eor      w11, w11, w12
    strh     w11, [x10, #0x2e]
    ldrh     w11, [x9, #0x30]
    mov      w12, #0x5b4c
    eor      w11, w11, w12
    strh     w11, [x10, #0x30]
    ldrh     w11, [x9, #0x32]
    mov      w12, #0x1b50
    eor      w11, w11, w12
    strh     w11, [x10, #0x32]
    ldrh     w11, [x9, #0x34]
    eor      w11, w11, #0x400
    strh     w11, [x10, #0x34]
    ldrh     w11, [x9, #0x36]
    mov      w12, #0x27be
    eor      w11, w11, w12
    strh     w11, [x10, #0x36]
    ldrh     w11, [x9, #0x38]
    mov      w12, #0x618c
    eor      w11, w11, w12
    strh     w11, [x10, #0x38]
    ldrh     w11, [x9, #0x3a]
    mov      w12, #0xa066
    eor      w11, w11, w12
    strh     w11, [x10, #0x3a]
    ldrh     w11, [x9, #0x3c]
    mov      w12, #0xc995
    eor      w11, w11, w12
    strh     w11, [x10, #0x3c]
    ldrh     w11, [x9, #0x3e]
    mov      w12, #0xb3dd
    eor      w11, w11, w12
    strh     w11, [x10, #0x3e]
    ldrh     w11, [x9, #0x40]
    mov      w12, #0x9f8b
    eor      w11, w11, w12
    strh     w11, [x10, #0x40]
    ldrh     w11, [x9, #0x42]
    mov      w12, #0xb217
    eor      w11, w11, w12
    strh     w11, [x10, #0x42]
    ldrh     w11, [x9, #0x44]
    mov      w12, #0xee1c
    eor      w11, w11, w12
    strh     w11, [x10, #0x44]
    ldrh     w11, [x9, #0x46]
    mov      w12, #0x247b
    eor      w11, w11, w12
    strh     w11, [x10, #0x46]
    ldrh     w11, [x9, #0x48]
    mov      w12, #0x80f6
    eor      w11, w11, w12
    strh     w11, [x10, #0x48]
    ldrh     w11, [x9, #0x4a]
    mov      w12, #0xdeb7
    eor      w11, w11, w12
    strh     w11, [x10, #0x4a]
    ldrh     w11, [x9, #0x4c]
    mov      w12, #0x9b6b
    eor      w11, w11, w12
    strh     w11, [x10, #0x4c]
    ldrh     w11, [x9, #0x4e]
    mov      w12, #0x551b
    eor      w11, w11, w12
    strh     w11, [x10, #0x4e]
    ldrh     w11, [x9, #0x50]
    mov      w12, #0xe516
    eor      w11, w11, w12
    strh     w11, [x10, #0x50]
    ldrh     w11, [x9, #0x52]
    mov      w12, #0xddbe
    eor      w11, w11, w12
    strh     w11, [x10, #0x52]
    ldrh     w11, [x9, #0x54]
    mov      w12, #0x9e4c
    eor      w11, w11, w12
    strh     w11, [x10, #0x54]
    ldrh     w11, [x9, #0x56]
    mov      w12, #0x99d2
    eor      w11, w11, w12
    strh     w11, [x10, #0x56]
    ldrh     w9, [x9, #0x58]
    mov      w11, #0x968f
    eor      w9, w9, w11
    strh     w9, [x10, #0x58]
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x700]
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
    adrp     x8, #0x521000
    add      x8, x8, #0xf40
    cmp      x20, #0
    csel     x0, xzr, x8, eq
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    ret      

// -[WCLGCodeLibraryViewController onApply] IMP=0x2498EC bounds=0x2498EC-0x2498FC
loc_2498EC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa3c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGCodeLibraryViewController setOnApply:] IMP=0x2498FC bounds=0x2498FC-0x249908
loc_2498FC:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xa3c]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGCodeLibraryViewController onChange] IMP=0x249908 bounds=0x249908-0x249918
loc_249908:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa40]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGCodeLibraryViewController setOnChange:] IMP=0x249918 bounds=0x249918-0x249924
loc_249918:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xa40]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGCodeLibraryViewController entries] IMP=0x249924 bounds=0x249924-0x249934
loc_249924:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa44]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGCodeLibraryViewController setEntries:] IMP=0x249934 bounds=0x249934-0x249948
loc_249934:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa44]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGCodeLibraryViewController activeEntryId] IMP=0x249948 bounds=0x249948-0x249958
loc_249948:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa48]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGCodeLibraryViewController setActiveEntryId:] IMP=0x249958 bounds=0x249958-0x249964
loc_249958:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xa48]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGCodeLibraryViewController addButton] IMP=0x249964 bounds=0x249964-0x249974
loc_249964:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa4c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGCodeLibraryViewController setAddButton:] IMP=0x249974 bounds=0x249974-0x249988
loc_249974:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa4c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGCodeLibraryViewController selectButton] IMP=0x249988 bounds=0x249988-0x249998
loc_249988:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa50]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGCodeLibraryViewController setSelectButton:] IMP=0x249998 bounds=0x249998-0x2499AC
loc_249998:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa50]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGCodeLibraryViewController selectAllButton] IMP=0x2499AC bounds=0x2499AC-0x2499BC
loc_2499AC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa54]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGCodeLibraryViewController setSelectAllButton:] IMP=0x2499BC bounds=0x2499BC-0x2499D0
loc_2499BC:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa54]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGCodeLibraryViewController clearAllButton] IMP=0x2499D0 bounds=0x2499D0-0x2499E0
loc_2499D0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa58]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGCodeLibraryViewController setClearAllButton:] IMP=0x2499E0 bounds=0x2499E0-0x2499F4
loc_2499E0:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa58]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGCodeLibraryViewController deleteButton] IMP=0x2499F4 bounds=0x2499F4-0x249A04
loc_2499F4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa5c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGCodeLibraryViewController setDeleteButton:] IMP=0x249A04 bounds=0x249A04-0x249A18
loc_249A04:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa5c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGCodeLibraryViewController emptyLabel] IMP=0x249A18 bounds=0x249A18-0x249A28
loc_249A18:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa60]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGCodeLibraryViewController setEmptyLabel:] IMP=0x249A28 bounds=0x249A28-0x249A3C
loc_249A28:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa60]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGCodeLibraryViewController .cxx_destruct] IMP=0x249A3C bounds=0x249A3C-0x249B1C
loc_249A3C:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa60]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa5c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa58]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa54]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa50]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa4c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa48]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa44]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa40]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa3c]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
