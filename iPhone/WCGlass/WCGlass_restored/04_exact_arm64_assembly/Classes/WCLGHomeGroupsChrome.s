// Exact ARM64 listing for WCLGHomeGroupsChrome

// -[WCLGHomeGroupsChrome homeGroupBar:didToggleDisplayIndex:] IMP=0x3691E8 bounds=0x3691E8-0x369228
loc_3691E8:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x3
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x19
    bl       #0x36eae0
    mov      x0, x20
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c9c // _objc_release

// -[WCLGHomeGroupsChrome homeGroupBar:didRequestManageDisplayIndex:sourceView:] IMP=0x369228 bounds=0x369228-0x369F88
loc_369228:
    stp      d11, d10, [sp, #-0x80]!
    stp      d9, d8, [sp, #0x10]
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    sub      sp, sp, #0x70
    mov      x19, x4
    stur     x3, [x29, #-0x78]
    mov      x21, x0
    adrp     x8, #0x581000
    add      x8, x8, #0x520
    ldar     w9, [x8]
    cbnz     w9, #0x36968c
    adrp     x9, #0x54f000
    add      x9, x9, #0x5a2
    ldrh     w10, [x9]
    mov      w11, #0x57c1
    adrp     x12, #0x54f000
    add      x12, x12, #0x5ae
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x4705
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x45ac
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0xacf6
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0xd33c
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w9, [x9, #0xa]
    mov      w10, #0xdf9
    eor      w9, w9, w10
    strh     w9, [x12, #0xa]
    adrp     x9, #0x54f000
    add      x9, x9, #0x592
    ldrh     w10, [x9]
    mov      w11, #0x89f6
    eor      w10, w10, w11
    adrp     x11, #0x54f000
    add      x11, x11, #0x59a
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x697b
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x2993
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w9, [x9, #6]
    mov      w10, #0x2a83
    eor      w9, w9, w10
    strh     w9, [x11, #6]
    adrp     x9, #0x54f000
    add      x9, x9, #0x57a
    ldrh     w10, [x9]
    mov      w11, #0xa049
    adrp     x12, #0x54f000
    add      x12, x12, #0x580
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x52f9
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x7432
    eor      w9, w9, w10
    strh     w9, [x12, #4]
    adrp     x9, #0x54f000
    add      x9, x9, #0x56e
    ldrh     w10, [x9]
    mov      w11, #0x3aca
    eor      w10, w10, w11
    adrp     x11, #0x54f000
    add      x11, x11, #0x574
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xc4b6
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0xb903
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x54f000
    add      x9, x9, #0x55a
    ldrh     w10, [x9]
    mov      w11, #0x15b0
    eor      w10, w10, w11
    adrp     x11, #0x54f000
    add      x11, x11, #0x564
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xecdd
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x329b
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x9494
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x21ae
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x54f000
    add      x9, x9, #0x546
    ldrh     w10, [x9]
    mov      w11, #0xfa82
    eor      w10, w10, w11
    adrp     x11, #0x54f000
    add      x11, x11, #0x550
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x7816
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x4b7
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xc564
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x9ca1
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x54f000
    add      x9, x9, #0x532
    ldrh     w10, [x9]
    mov      w11, #0x432
    eor      w10, w10, w11
    adrp     x11, #0x54f000
    add      x11, x11, #0x53c
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xd8d7
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xc59d
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x5bf9
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x41c5
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x54f000
    add      x9, x9, #0x586
    ldrh     w10, [x9]
    mov      w11, #0xf75b
    eor      w10, w10, w11
    adrp     x11, #0x54f000
    add      x11, x11, #0x58c
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xba10
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x3f2
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x54f000
    add      x9, x9, #0x502
    ldrh     w10, [x9]
    mov      w11, #0x60d1
    adrp     x12, #0x54f000
    add      x12, x12, #0x510
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x747
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x993f
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x483d
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0xa7e7
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w10, [x9, #0xa]
    mov      w11, #0x7be8
    eor      w10, w10, w11
    strh     w10, [x12, #0xa]
    ldrh     w9, [x9, #0xc]
    mov      w10, #0xe5c4
    eor      w9, w9, w10
    strh     w9, [x12, #0xc]
    adrp     x9, #0x54f000
    add      x9, x9, #0x51e
    ldrh     w10, [x9]
    mov      w11, #0x64b3
    eor      w10, w10, w11
    adrp     x11, #0x54f000
    add      x11, x11, #0x528
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x8914
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x2dcd
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xec31
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x6603
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x54f000
    add      x9, x9, #0x4d0
    ldrh     w10, [x9]
    mov      w11, #0x2860
    eor      w10, w10, w11
    adrp     x11, #0x54f000
    add      x11, x11, #0x4f0
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xe2fd
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x905d
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xcbe9
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x3c47
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0xa04
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0x9fb
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w10, [x9, #0xe]
    mov      w12, #0xad29
    eor      w10, w10, w12
    strh     w10, [x11, #0xe]
    ldrh     w9, [x9, #0x10]
    mov      w10, #0x35f8
    eor      w9, w9, w10
    strh     w9, [x11, #0x10]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x26, sp, #0x30
    mov      sp, x26
    sub      x20, sp, #0x30
    mov      sp, x20
    sub      x28, sp, #0x30
    mov      sp, x28
    sub      x25, sp, #0x30
    mov      sp, x25
    sub      x22, sp, #0x30
    mov      sp, x22
    sub      x23, sp, #0x30
    mov      sp, x23
    sub      x27, sp, #0x30
    mov      sp, x27
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x68]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461ca8 // _objc_retain
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    cbz      x21, #0x369f40
    stp      x23, x20, [x29, #-0x98]
    stur     x22, [x29, #-0x88]
    adrp     x23, #0x4c4000
    ldr      x0, [x23, #0x198]
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0xcd8]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf60]
    ldur     x2, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    stur     x20, [x29, #-0x80]
    cbz      x20, #0x369f38
    mov      x0, x21
    bl       #0x372dfc
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xdb8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461c9c // _objc_release
    cbnz     x22, #0x369f30
    stp      x27, x19, [x29, #-0xe0]
    stur     x20, [x29, #-0xc8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xdd0]
    ldur     x20, [x29, #-0x80]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd00]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    ldr      x0, [x23, #0x198]
    mov      x23, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xce0]
    stur     x0, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xd0]
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x22, [x8, #0x310]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x70]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb00]
    mov      x0, x22
    mov      x2, x24
    mov      x3, #0
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xc0]
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x24, #0x4c4000
    adrp     x20, #0x4a0000
    ldr      x20, [x20, #0x748]
    adrp     x11, #0x491000
    adrp     x10, #0x4a5000
    add      x10, x10, #0xc0
    stur     w27, [x29, #-0xac]
    cbz      w27, #0x36989c
    adrp     x8, #0x4bf000
    ldr      x27, [x8, #0xb08]
    adrp     x8, #0x4bf000
    ldr      x19, [x8, #0xb10]
    b        #0x36993c
    ldr      x22, [x24, #0x318]
    str      x20, [x26]
    ldr      d0, [x11, #0x388]
    str      d0, [x26, #8]
    adrp     x8, #0x372000
    add      x8, x8, #0xef4
    stp      x8, x10, [x26, #0x10]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    str      x21, [x26, #0x20]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    str      x23, [x26, #0x28]
    adrp     x8, #0x4bf000
    ldr      x27, [x8, #0xb08]
    adrp     x2, #0x54f000
    add      x2, x2, #0x860
    mov      x0, x22
    mov      x1, x27
    mov      x3, #0
    mov      x4, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x19, [x8, #0xb10]
    ldur     x0, [x29, #-0xc0]
    mov      x1, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x20]
    bl       #0x461c9c // _objc_release
    adrp     x11, #0x491000
    adrp     x10, #0x4a5000
    add      x10, x10, #0xc0
    ldur     x9, [x29, #-0x90]
    ldr      x22, [x24, #0x318]
    str      x20, [x9]
    ldr      d8, [x11, #0x388]
    str      d8, [x9, #8]
    adrp     x8, #0x373000
    add      x8, x8, #0x6c
    stp      x8, x10, [x9, #0x10]
    mov      x0, x21
    mov      x24, x9
    bl       #0x461ca8 // _objc_retain
    str      x21, [x24, #0x20]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    str      x23, [x24, #0x28]
    adrp     x2, #0x54f000
    add      x2, x2, #0x7a0
    mov      x0, x22
    stur     x27, [x29, #-0xa8]
    mov      x1, x27
    mov      x3, #0
    mov      x4, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x0, [x29, #-0xc0]
    mov      x26, x0
    mov      x1, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x27, x19
    ldur     w8, [x29, #-0xac]
    cbz      w8, #0x369a28
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x90]
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x369a28
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x318]
    adrp     x2, #0x54f000
    add      x2, x2, #0x720
    adrp     x4, #0x4a5000
    add      x4, x4, #0xf0
    ldur     x1, [x29, #-0xa8]
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x26
    mov      x1, x27
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x24, #0x491000
    adrp     x23, #0x4a5000
    add      x23, x23, #0x110
    ldur     x9, [x29, #-0x78]
    cmp      x9, #1
    ldur     x19, [x29, #-0xd8]
    b.lt     #0x369aa8
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x318]
    str      x20, [x28]
    ldr      d0, [x24, #0x4a0]
    str      d0, [x28, #8]
    adrp     x8, #0x373000
    add      x8, x8, #0x968
    stp      x8, x23, [x28, #0x10]
    str      x9, [x28, #0x20]
    adrp     x2, #0x54f000
    add      x2, x2, #0x7e0
    ldur     x1, [x29, #-0xa8]
    mov      x3, #0
    mov      x4, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x26
    mov      x1, x27
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x9, [x29, #-0x78]
    add      x8, x9, #1
    ldur     x10, [x29, #-0xd0]
    cmp      x8, x10
    b.ge     #0x369b18
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x318]
    str      x20, [x25]
    ldr      d0, [x24, #0x4a0]
    str      d0, [x25, #8]
    adrp     x8, #0x373000
    add      x8, x8, #0x9c0
    stp      x8, x23, [x25, #0x10]
    str      x9, [x25, #0x20]
    adrp     x2, #0x54f000
    add      x2, x2, #0x6e0
    ldur     x1, [x29, #-0xa8]
    mov      x3, #0
    mov      x4, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x26
    mov      x1, x27
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x24, #0x4c4000
    ldr      x22, [x24, #0x318]
    ldur     x28, [x29, #-0x88]
    str      x20, [x28]
    str      d8, [x28, #8]
    adrp     x8, #0x373000
    add      x8, x8, #0xa18
    adrp     x23, #0x4a5000
    add      x23, x23, #0x130
    stp      x8, x23, [x28, #0x10]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    str      x21, [x28, #0x20]
    adrp     x2, #0x54f000
    add      x2, x2, #0x6a0
    mov      x0, x22
    mov      x25, x27
    ldur     x27, [x29, #-0xa8]
    mov      x1, x27
    mov      x3, #0
    mov      x4, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x28, x26
    mov      x26, x24
    mov      x0, x28
    mov      x1, x25
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x22, [x24, #0x318]
    ldur     x24, [x29, #-0x98]
    str      x20, [x24]
    str      d8, [x24, #8]
    adrp     x8, #0x373000
    add      x8, x8, #0xa20
    stp      x8, x23, [x24, #0x10]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    str      x21, [x24, #0x20]
    adrp     x2, #0x54f000
    add      x2, x2, #0x620
    mov      x0, x22
    mov      x1, x27
    mov      x3, #0
    mov      x4, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x28
    mov      x1, x25
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf40]
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x54f000
    add      x8, x8, #0x5e0
    adrp     x9, #0x54f000
    add      x9, x9, #0x760
    cmp      w0, #0
    csel     x2, x9, x8, ne
    ldr      x0, [x26, #0x318]
    adrp     x4, #0x4a5000
    add      x4, x4, #0x160
    mov      x1, x27
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x28
    mov      x1, x25
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     w8, [x29, #-0xac]
    tbnz     w8, #0, #0x369cec
    ldr      x22, [x26, #0x318]
    ldur     x26, [x29, #-0xe0]
    str      x20, [x26]
    str      d8, [x26, #8]
    adrp     x8, #0x373000
    add      x9, x8, #0xbec
    adrp     x8, #0x4a5000
    add      x8, x8, #0x130
    stp      x9, x8, [x26, #0x10]
    ldur     x0, [x29, #-0xb8]
    bl       #0x461ca8 // _objc_retain
    str      x0, [x26, #0x20]
    adrp     x2, #0x54f000
    add      x2, x2, #0x820
    mov      x0, x22
    mov      x1, x27
    mov      w3, #2
    mov      x4, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x28
    mov      x1, x25
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x20]
    adrp     x26, #0x4c4000
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x318]
    adrp     x2, #0x54f000
    add      x2, x2, #0x660
    mov      x1, x27
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x28
    mov      x1, x25
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x25, [x8, #0xb58]
    mov      x0, x28
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461c9c // _objc_release
    cbz      x22, #0x369ecc
    cbz      x19, #0x369db8
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x28
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb60]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d10, d1
    fmov     d9, d2
    fmov     d11, d3
    mov      x26, x19
    b        #0x369e4c
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x3d8]
    ldur     x27, [x29, #-0xc8]
    mov      x0, x27
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x28
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb60]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    ldur     x24, [x29, #-0x98]
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616d8 // _CGRectGetMidX
    fmov     d8, d0
    fmov     d9, #1.00000000
    mov      x8, #0x405e000000000000
    fmov     d10, x8
    fmov     d11, #1.00000000
    mov      x0, x28
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb68]
    fmov     d0, d8
    fmov     d1, d10
    fmov     d2, d9
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbnz     x19, #0x369e94
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb70]
    mov      w2, #0xf
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    ldur     x22, [x29, #-0xc8]
    mov      x0, x22
    mov      x2, x28
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x24, #0x20]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x88]
    ldr      x0, [x8, #0x20]
    bl       #0x461c9c // _objc_release
    ldur     x20, [x29, #-0x90]
    ldr      x0, [x20, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x20, #0x20]
    mov      x20, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    sub      sp, x29, #0x70
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    ldp      d9, d8, [sp, #0x10]
    ldp      d11, d10, [sp], #0x80
    ret      

// -[WCLGHomeGroupsChrome homeGroupBarDidRequestCreateGroup:] IMP=0x369F88 bounds=0x369F88-0x369FC0
loc_369F88:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x369fc0
    mov      x0, x19
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c9c // _objc_release

// -[WCLGHomeGroupsChrome controller] IMP=0x36A304 bounds=0x36A304-0x36A31C
loc_36A304:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    add      x0, x0, #8
    bl       #0x461c60 // _objc_loadWeakRetained
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGHomeGroupsChrome setController:] IMP=0x36A31C bounds=0x36A31C-0x36A328
loc_36A31C:
    mov      x1, x2
    add      x0, x0, #8
    b        #0x461d08 // _objc_storeWeak

// -[WCLGHomeGroupsChrome .cxx_destruct] IMP=0x36A328 bounds=0x36A328-0x36A330
loc_36A328:
    add      x0, x0, #8
    b        #0x461c0c // _objc_destroyWeak
