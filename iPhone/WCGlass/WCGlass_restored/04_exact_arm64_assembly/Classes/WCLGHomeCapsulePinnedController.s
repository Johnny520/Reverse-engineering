// Exact ARM64 listing for WCLGHomeCapsulePinnedController

// -[WCLGHomeCapsulePinnedController refresh] IMP=0x315320 bounds=0x315320-0x315324
loc_315320:
    b        #0x3912b8

// -[WCLGHomeCapsulePinnedController presentActionsForUser:] IMP=0x315324 bounds=0x315324-0x315CFC
loc_315324:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    sub      sp, sp, #0x10
    mov      x19, x2
    mov      x27, x0
    adrp     x8, #0x580000
    add      x8, x8, #0xb14
    ldar     w9, [x8]
    cbnz     w9, #0x315660
    adrp     x9, #0x547000
    add      x9, x9, #0x714
    ldrh     w10, [x9]
    mov      w11, #0x10e
    adrp     x12, #0x547000
    add      x12, x12, #0x722
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0xe72c
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x4d14
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x326b
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0xcc0a
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w10, [x9, #0xa]
    mov      w11, #0x4edd
    eor      w10, w10, w11
    strh     w10, [x12, #0xa]
    ldrh     w9, [x9, #0xc]
    mov      w10, #0x7098
    eor      w9, w9, w10
    strh     w9, [x12, #0xc]
    adrp     x9, #0x547000
    add      x9, x9, #0x6e0
    ldrh     w10, [x9]
    mov      w11, #0x61dd
    eor      w10, w10, w11
    adrp     x11, #0x547000
    add      x11, x11, #0x6ea
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x193
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x8b0d
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x7672
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xa3dd
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x547000
    add      x9, x9, #0x708
    ldrh     w10, [x9]
    mov      w11, #0xfbcf
    eor      w10, w10, w11
    adrp     x11, #0x547000
    add      x11, x11, #0x70e
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x79da
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0xb064
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x547000
    add      x9, x9, #0x744
    ldrh     w10, [x9]
    mov      w11, #0x3b26
    adrp     x12, #0x547000
    add      x12, x12, #0x752
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x5129
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0xdd5f
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x60aa
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0x6afb
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w10, [x9, #0xa]
    mov      w11, #0xfb7d
    eor      w10, w10, w11
    strh     w10, [x12, #0xa]
    ldrh     w9, [x9, #0xc]
    mov      w10, #0x4d26
    eor      w9, w9, w10
    strh     w9, [x12, #0xc]
    adrp     x9, #0x547000
    add      x9, x9, #0x730
    ldrh     w10, [x9]
    mov      w11, #0xb5b4
    eor      w10, w10, w11
    adrp     x11, #0x547000
    add      x11, x11, #0x73a
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x7eda
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x232d
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x78ef
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x2199
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x547000
    add      x9, x9, #0x6f4
    ldrh     w10, [x9]
    mov      w11, #0xd017
    eor      w10, w10, w11
    adrp     x11, #0x547000
    add      x11, x11, #0x6fe
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xc80b
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x58fa
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x8307
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x4b49
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x547000
    add      x9, x9, #0x6cc
    ldrh     w10, [x9]
    mov      w11, #0xa6d1
    eor      w10, w10, w11
    adrp     x11, #0x547000
    add      x11, x11, #0x6d6
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x427a
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x196a
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x4e90
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x23d2
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x547000
    add      x9, x9, #0x6c0
    ldrh     w10, [x9]
    mov      w11, #0x62a7
    eor      w10, w10, w11
    adrp     x11, #0x547000
    add      x11, x11, #0x6c6
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x25c9
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x3a50
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x10
    stur     x8, [x29, #-0x68]
    mov      sp, x8
    sub      x21, sp, #0x30
    mov      sp, x21
    sub      x22, sp, #0x30
    mov      sp, x22
    sub      x23, sp, #0x30
    mov      sp, x23
    sub      x20, sp, #0x30
    mov      sp, x20
    sub      x25, sp, #0x30
    mov      sp, x25
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    bl       #0x315cfc
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    cbz      x0, #0x315c64
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x315c64
    stur     x24, [x29, #-0x70]
    adrp     x8, #0x4c4000
    ldr      x24, [x8, #0x310]
    mov      x0, x19
    bl       #0x314040
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb00]
    mov      x0, x24
    mov      x2, x28
    mov      x3, #0
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    ldur     x28, [x29, #-0x68]
    mov      x0, x28
    mov      x1, x27
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c4000
    ldr      x24, [x8, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x21]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    str      d8, [x21, #8]
    adrp     x8, #0x316000
    add      x8, x8, #0x70
    adrp     x9, #0x4a2000
    add      x9, x9, #0xca8
    stp      x8, x9, [x21, #0x10]
    add      x0, x21, #0x28
    mov      x1, x28
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x21, #0x20]
    adrp     x8, #0x4bf000
    ldr      x27, [x8, #0xb08]
    adrp     x2, #0x547000
    add      x2, x2, #0x940
    mov      x0, x24
    mov      x1, x27
    mov      x3, #0
    mov      x4, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x28, [x8, #0xb10]
    mov      x0, x26
    mov      x1, x28
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x24, [x8, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x22]
    str      d8, [x22, #8]
    adrp     x8, #0x316000
    add      x9, x8, #0x158
    adrp     x8, #0x4a2000
    add      x8, x8, #0xca8
    stp      x9, x8, [x22, #0x10]
    add      x0, x22, #0x28
    ldur     x1, [x29, #-0x68]
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x22, #0x20]
    adrp     x2, #0x547000
    add      x2, x2, #0x840
    mov      x0, x24
    mov      x1, x27
    mov      x3, #0
    mov      x4, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x26
    mov      x1, x28
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x24, [x8, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x23]
    str      d8, [x23, #8]
    adrp     x8, #0x316000
    add      x9, x8, #0x240
    adrp     x8, #0x4a2000
    add      x8, x8, #0xca8
    stp      x9, x8, [x23, #0x10]
    add      x0, x23, #0x28
    ldur     x1, [x29, #-0x68]
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x23, #0x20]
    adrp     x2, #0x547000
    add      x2, x2, #0x900
    mov      x0, x24
    mov      x1, x27
    mov      x3, #0
    mov      x4, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x26
    mov      x1, x28
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x37ff8c
    cbz      w0, #0x315970
    adrp     x8, #0x4c4000
    ldr      x24, [x8, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x20]
    str      d8, [x20, #8]
    adrp     x8, #0x316000
    add      x9, x8, #0x328
    adrp     x8, #0x4a2000
    add      x8, x8, #0xca8
    stp      x9, x8, [x20, #0x10]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x20, #0x20]
    add      x0, x20, #0x28
    ldur     x1, [x29, #-0x68]
    bl       #0x461c00 // _objc_copyWeak
    adrp     x2, #0x547000
    add      x2, x2, #0x800
    mov      x0, x24
    mov      x1, x27
    mov      x3, #0
    mov      x4, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x26
    mov      x1, x28
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    add      x0, x20, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x20, #0x20]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x20, [x8, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x25]
    str      d8, [x25, #8]
    adrp     x8, #0x316000
    add      x9, x8, #0x368
    adrp     x8, #0x4a2000
    add      x8, x8, #0xca8
    stp      x9, x8, [x25, #0x10]
    add      x0, x25, #0x28
    ldur     x1, [x29, #-0x68]
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x25, #0x20]
    adrp     x2, #0x547000
    add      x2, x2, #0x8c0
    mov      x0, x20
    mov      x1, x27
    mov      w3, #2
    mov      x4, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x26
    mov      x1, x28
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    bl       #0x31247c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    cmp      x24, #0x17
    b.hi     #0x315a6c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x318]
    adrp     x2, #0x547000
    add      x2, x2, #0x7c0
    adrp     x4, #0x4a4000
    add      x4, x4, #0xa48
    mov      x1, x27
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x26
    mov      x1, x28
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x318]
    adrp     x2, #0x547000
    add      x2, x2, #0x880
    adrp     x4, #0x4a4000
    add      x4, x4, #0xa88
    mov      x1, x27
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x26
    mov      x1, x28
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x318]
    adrp     x2, #0x547000
    add      x2, x2, #0x780
    mov      x1, x27
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x26
    mov      x1, x28
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb58]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    cbz      x0, #0x315bec
    adrp     x8, #0x4be000
    ldr      x28, [x8, #0x3d8]
    ldur     x0, [x29, #-0x70]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb60]
    mov      x0, x20
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x70]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x4d8]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616d8 // _CGRectGetMidX
    fmov     d8, d0
    ldur     x0, [x29, #-0x70]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616e4 // _CGRectGetMidY
    fmov     d1, d0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb68]
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x0, x20
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb70]
    mov      x0, x20
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    ldur     x0, [x29, #-0x70]
    mov      x2, x26
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x20]
    bl       #0x461c9c // _objc_release
    add      x0, x25, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x23, #0x20]
    bl       #0x461c9c // _objc_release
    add      x0, x23, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x22, #0x20]
    bl       #0x461c9c // _objc_release
    add      x0, x22, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x21, #0x20]
    bl       #0x461c9c // _objc_release
    add      x0, x21, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldur     x0, [x29, #-0x68]
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldur     x24, [x29, #-0x70]
    mov      x0, x24
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
    mov      x19, x0
    add      x0, x20, #0x28
    b        #0x315cd0
    b        #0x315cac
    b        #0x315cc8
    mov      x19, x0
    b        #0x315cd4
    mov      x19, x0
    b        #0x315cdc
    mov      x19, x0
    b        #0x315ce4
    b        #0x315cc8
    mov      x19, x0
    add      x0, x25, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x23, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x22, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x21, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldur     x0, [x29, #-0x68]
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGHomeCapsulePinnedController presentNicknameEditorForUser:] IMP=0x316600 bounds=0x316600-0x316C1C
loc_316600:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    sub      sp, sp, #0x20
    mov      x19, x2
    mov      x26, x0
    adrp     x8, #0x580000
    add      x8, x8, #0xb58
    ldar     w9, [x8]
    cbnz     w9, #0x31690c
    adrp     x9, #0x547000
    add      x9, x9, #0x9cc
    ldrh     w10, [x9]
    mov      w11, #0xa890
    adrp     x12, #0x547000
    add      x12, x12, #0x9d2
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0xa41f
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0xcc38
    eor      w9, w9, w10
    strh     w9, [x12, #4]
    adrp     x9, #0x547000
    add      x9, x9, #0xa5c
    ldrh     w10, [x9]
    mov      w11, #0x69c6
    eor      w10, w10, w11
    adrp     x11, #0x547000
    add      x11, x11, #0xa66
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xba15
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xfbc2
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x2488
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x3b84
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x547000
    add      x9, x9, #0x9e0
    ldrh     w10, [x9]
    mov      w11, #0x45f
    eor      w11, w10, w11
    adrp     x10, #0x547000
    add      x10, x10, #0xa20
    strh     w11, [x10]
    ldrh     w11, [x9, #2]
    mov      w12, #0xaecc
    eor      w11, w11, w12
    strh     w11, [x10, #2]
    ldrh     w11, [x9, #4]
    mov      w12, #0x1772
    eor      w11, w11, w12
    strh     w11, [x10, #4]
    ldrh     w11, [x9, #6]
    mov      w12, #0x95c2
    eor      w11, w11, w12
    strh     w11, [x10, #6]
    ldrh     w11, [x9, #8]
    mov      w12, #0xc665
    eor      w11, w11, w12
    strh     w11, [x10, #8]
    ldrh     w11, [x9, #0xa]
    mov      w12, #0xed42
    eor      w11, w11, w12
    strh     w11, [x10, #0xa]
    ldrh     w11, [x9, #0xc]
    mov      w12, #0xa502
    eor      w11, w11, w12
    strh     w11, [x10, #0xc]
    ldrh     w11, [x9, #0xe]
    mov      w12, #0xd9a2
    eor      w11, w11, w12
    strh     w11, [x10, #0xe]
    ldrh     w11, [x9, #0x10]
    mov      w12, #0x4981
    eor      w11, w11, w12
    strh     w11, [x10, #0x10]
    ldrh     w11, [x9, #0x12]
    mov      w12, #0xb2a2
    eor      w11, w11, w12
    strh     w11, [x10, #0x12]
    ldrh     w11, [x9, #0x14]
    mov      w12, #0x68f
    eor      w11, w11, w12
    strh     w11, [x10, #0x14]
    ldrh     w11, [x9, #0x16]
    mov      w12, #0xf4b0
    eor      w11, w11, w12
    strh     w11, [x10, #0x16]
    ldrh     w11, [x9, #0x18]
    mov      w12, #0x633d
    eor      w11, w11, w12
    strh     w11, [x10, #0x18]
    ldrh     w11, [x9, #0x1a]
    mov      w12, #0xb60a
    eor      w11, w11, w12
    strh     w11, [x10, #0x1a]
    ldrh     w11, [x9, #0x1c]
    mov      w12, #0xe7ca
    eor      w11, w11, w12
    strh     w11, [x10, #0x1c]
    ldrh     w11, [x9, #0x1e]
    mov      w12, #0x1dba
    eor      w11, w11, w12
    strh     w11, [x10, #0x1e]
    ldrh     w11, [x9, #0x20]
    mov      w12, #0x3877
    eor      w11, w11, w12
    strh     w11, [x10, #0x20]
    ldrh     w11, [x9, #0x22]
    mov      w12, #0x6962
    eor      w11, w11, w12
    strh     w11, [x10, #0x22]
    ldrh     w11, [x9, #0x24]
    mov      w12, #0x47fb
    eor      w11, w11, w12
    strh     w11, [x10, #0x24]
    ldrh     w11, [x9, #0x26]
    mov      w12, #0x108f
    eor      w11, w11, w12
    strh     w11, [x10, #0x26]
    ldrh     w11, [x9, #0x28]
    mov      w12, #0x8cde
    eor      w11, w11, w12
    strh     w11, [x10, #0x28]
    ldrh     w11, [x9, #0x2a]
    mov      w12, #0xa8a9
    eor      w11, w11, w12
    strh     w11, [x10, #0x2a]
    ldrh     w11, [x9, #0x2c]
    mov      w12, #0x6c20
    eor      w11, w11, w12
    strh     w11, [x10, #0x2c]
    ldrh     w11, [x9, #0x2e]
    mov      w12, #0xa638
    eor      w11, w11, w12
    strh     w11, [x10, #0x2e]
    ldrh     w11, [x9, #0x30]
    mov      w12, #0x43a6
    eor      w11, w11, w12
    strh     w11, [x10, #0x30]
    ldrh     w11, [x9, #0x32]
    mov      w12, #0x2929
    eor      w11, w11, w12
    strh     w11, [x10, #0x32]
    ldrh     w11, [x9, #0x34]
    mov      w12, #0x46b4
    eor      w11, w11, w12
    strh     w11, [x10, #0x34]
    ldrh     w11, [x9, #0x36]
    mov      w12, #0x3708
    eor      w11, w11, w12
    strh     w11, [x10, #0x36]
    ldrh     w11, [x9, #0x38]
    mov      w12, #0x9500
    eor      w11, w11, w12
    strh     w11, [x10, #0x38]
    ldrh     w9, [x9, #0x3a]
    mov      w11, #0xdcec
    eor      w9, w9, w11
    strh     w9, [x10, #0x3a]
    adrp     x9, #0x547000
    add      x9, x9, #0x9c0
    ldrh     w10, [x9]
    mov      w11, #0xadaf
    eor      w10, w10, w11
    adrp     x11, #0x547000
    add      x11, x11, #0x9c6
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x7742
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x8470
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x23, sp, #0x30
    mov      sp, x23
    sub      x21, sp, #0x10
    mov      sp, x21
    sub      x22, sp, #0x10
    mov      sp, x22
    sub      x25, sp, #0x40
    mov      sp, x25
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    bl       #0x315cfc
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    cbz      x0, #0x316bb8
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x338]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x316bb8
    mov      x0, x19
    bl       #0x316c1c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x19
    bl       #0x37fef4
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    stur     x26, [x29, #-0x68]
    cbz      x0, #0x3169a8
    mov      x20, x28
    b        #0x3169bc
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x20, x19
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x310]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb00]
    adrp     x2, #0x547000
    add      x2, x2, #0xb50
    adrp     x3, #0x547000
    add      x3, x3, #0xb10
    mov      w4, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x23]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    str      d8, [x23, #8]
    adrp     x8, #0x316000
    add      x8, x8, #0xc9c
    adrp     x9, #0x4a4000
    add      x9, x9, #0xac8
    stp      x8, x9, [x23, #0x10]
    mov      x0, x27
    bl       #0x461ca8 // _objc_retain
    stur     x27, [x29, #-0x70]
    str      x27, [x23, #0x20]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    stur     x20, [x29, #-0x78]
    str      x20, [x23, #0x28]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x770]
    mov      x0, x28
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x318]
    adrp     x8, #0x4bf000
    ldr      x26, [x8, #0xb08]
    adrp     x2, #0x547000
    add      x2, x2, #0xad0
    mov      x1, x26
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4bf000
    ldr      x20, [x8, #0xb10]
    mov      x0, x28
    mov      x1, x20
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldur     x1, [x29, #-0x68]
    bl       #0x461c54 // _objc_initWeak
    mov      x0, x22
    mov      x1, x28
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c4000
    ldr      x27, [x8, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x25]
    str      d8, [x25, #8]
    adrp     x8, #0x316000
    add      x8, x8, #0xd48
    adrp     x9, #0x4a4000
    add      x9, x9, #0xaf8
    stp      x8, x9, [x25, #0x10]
    add      x0, x25, #0x28
    mov      x1, x22
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x25, #0x20]
    add      x0, x25, #0x30
    mov      x1, x21
    bl       #0x461c00 // _objc_copyWeak
    adrp     x2, #0x547000
    add      x2, x2, #0xa90
    mov      x0, x27
    mov      x1, x26
    mov      x3, #0
    mov      x4, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x28
    mov      x1, x20
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x24
    mov      x2, x28
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    add      x0, x25, #0x30
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x25, #0x20]
    bl       #0x461c9c // _objc_release
    add      x0, x25, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x22
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x21
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x23, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x78]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x70]
    bl       #0x461c9c // _objc_release
    mov      x0, x24
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
    b        #0x316bf0
    mov      x19, x0
    add      x0, x25, #0x30
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x25, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x22
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x21
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGHomeCapsulePinnedController replaceFriend:] IMP=0x316FFC bounds=0x316FFC-0x3171F4
loc_316FFC:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    mov      x23, x0
    adrp     x8, #0x580000
    add      x8, x8, #0xb7c
    ldar     w9, [x8]
    cbnz     w9, #0x31708c
    adrp     x9, #0x547000
    add      x9, x9, #0xb70
    ldrh     w10, [x9]
    mov      w11, #0xa6a8
    adrp     x12, #0x547000
    add      x12, x12, #0xb7a
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x3e2b
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0xd3f7
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x9f32
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x5ffb
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x20, sp, #0x10
    mov      sp, x20
    sub      x21, sp, #0x30
    mov      sp, x21
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    bl       #0x315cfc
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    cbz      x0, #0x3171ac
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x3171ac
    bl       #0x31247c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x360]
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc58]
    mov      x0, x24
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c4000
    ldr      x23, [x8, #0x560]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x21]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x21, #8]
    adrp     x8, #0x317000
    add      x8, x8, #0x1f4
    adrp     x9, #0x4a4000
    add      x9, x9, #0xb28
    stp      x8, x9, [x21, #0x10]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x21, #0x20]
    add      x0, x21, #0x28
    mov      x1, x20
    bl       #0x461c00 // _objc_copyWeak
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb10]
    adrp     x2, #0x547000
    add      x2, x2, #0xbb0
    mov      x0, x23
    mov      x3, x24
    mov      x4, x22
    mov      x5, x21
    bl       #0x461c6c // _objc_msgSend
    add      x0, x21, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x21, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    sub      sp, x29, #0x40
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    ret      
    mov      x19, x0
    add      x0, x21, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGHomeCapsulePinnedController replaceAvatar:] IMP=0x3175BC bounds=0x3175BC-0x3176B8
loc_3175BC:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    mov      x21, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    bl       #0x315cfc
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    cbz      x0, #0x31769c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x31769c
    adrp     x22, #0x4c4000
    ldr      x0, [x22, #0x350]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb18]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x31769c
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb20]
    mov      x0, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x22, #0x350]
    bl       #0x461bac // _objc_alloc_init
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc58]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc78]
    mov      x0, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb50]
    mov      x0, x22
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x20
    mov      x2, x22
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGHomeCapsulePinnedController removeUser:] IMP=0x3176B8 bounds=0x3176B8-0x3177B0
loc_3176B8:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x21, x2
    mov      x19, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    bl       #0x31247c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x360]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc58]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x31732c
    adrp     x1, #0x4a6000
    add      x1, x1, #0xd8
    mov      x0, x21
    bl       #0x316e30
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cbnz     x0, #0x31778c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4a3000
    add      x8, x8, #0xde8
    ldr      x3, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x350]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xaf8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGHomeCapsulePinnedController imagePickerController:didFinishPickingMediaWithInfo:] IMP=0x3177B0 bounds=0x3177B0-0x317968
loc_3177B0:
    sub      sp, sp, #0x80
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    mov      x20, x3
    mov      x19, x2
    mov      x23, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x3e0]
    ldr      x2, [x8]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x528]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    cbz      x0, #0x317820
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    mov      x21, x22
    b        #0x317844
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x3e8]
    ldr      x2, [x8]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb28]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb20]
    mov      x0, x23
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    add      x0, sp, #0x38
    mov      x1, x23
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [sp, #8]
    adrp     x8, #0x317000
    add      x8, x8, #0x968
    adrp     x9, #0x4a4000
    add      x9, x9, #0x1f8
    stp      x8, x9, [sp, #0x10]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    str      x21, [sp, #0x20]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    str      x22, [sp, #0x28]
    mov      x23, sp
    add      x0, x23, #0x30
    add      x1, sp, #0x38
    bl       #0x461c00 // _objc_copyWeak
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb38]
    mov      x3, sp
    mov      x0, x19
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    add      x0, x23, #0x30
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    add      x0, sp, #0x38
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    add      sp, sp, #0x80
    ret      
    mov      x19, x0
    add      x0, x23, #0x30
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, sp, #0x38
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGHomeCapsulePinnedController imagePickerControllerDidCancel:] IMP=0x3179D0 bounds=0x3179D0-0x317A34
loc_3179D0:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x21, [x8, #0xb20]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x21
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb38]
    mov      x0, x19
    mov      w2, #1
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGHomeCapsulePinnedController pendingAvatarUser] IMP=0x317A34 bounds=0x317A34-0x317A3C
loc_317A34:
    ldr      x0, [x0, #8]
    ret      

// -[WCLGHomeCapsulePinnedController setPendingAvatarUser:] IMP=0x317A3C bounds=0x317A3C-0x317A44
loc_317A3C:
    mov      w3, #8
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGHomeCapsulePinnedController .cxx_destruct] IMP=0x317A44 bounds=0x317A44-0x317A50
loc_317A44:
    add      x0, x0, #8
    mov      x1, #0
    b        #0x461cfc // _objc_storeStrong
