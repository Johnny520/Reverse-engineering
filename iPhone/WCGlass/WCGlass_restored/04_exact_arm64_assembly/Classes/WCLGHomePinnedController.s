// Exact ARM64 listing for WCLGHomePinnedController

// -[WCLGHomePinnedController refreshUI] IMP=0x380CA4 bounds=0x380CA4-0x380CA8
loc_380CA4:
    b        #0x3912b8

// -[WCLGHomePinnedController onSlotTap:] IMP=0x380CA8 bounds=0x380CA8-0x380D08
loc_380CA8:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x0, x2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x551000
    ldr      x1, [x8, #0x4b0]
    bl       #0x461c3c // _objc_getAssociatedObject
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x3809bc
    mov      x0, x20
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c9c // _objc_release

// -[WCLGHomePinnedController onSlotLongPress:] IMP=0x380D08 bounds=0x380D08-0x380DDC
loc_380D08:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x3d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    b.ne     #0x380dc8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x551000
    ldr      x1, [x8, #0x4b0]
    bl       #0x461c3c // _objc_getAssociatedObject
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x380dc0
    bl       #0x380ddc
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x168]
    mov      x0, x20
    mov      x2, x21
    mov      x3, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGHomePinnedController presentActionsForUser:fromController:] IMP=0x3810E4 bounds=0x3810E4-0x381A9C
loc_3810E4:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    sub      sp, sp, #0x30
    mov      x22, x3
    mov      x19, x2
    mov      x25, x0
    adrp     x8, #0x581000
    add      x8, x8, #0x8c4
    ldar     w9, [x8]
    cbnz     w9, #0x3813d4
    adrp     x9, #0x552000
    add      x9, x9, #0x87c
    ldrh     w10, [x9]
    mov      w11, #0xd2f9
    eor      w10, w10, w11
    adrp     x11, #0x552000
    add      x11, x11, #0x886
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xd940
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x4304
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x65a3
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x951e
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x552000
    add      x9, x9, #0x864
    ldrh     w10, [x9]
    mov      w11, #0x838e
    eor      w10, w10, w11
    adrp     x11, #0x552000
    add      x11, x11, #0x870
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x27c6
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x2358
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xcae4
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0xf950
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w9, [x9, #0xa]
    mov      w10, #0x789f
    eor      w9, w9, w10
    strh     w9, [x11, #0xa]
    adrp     x9, #0x552000
    add      x9, x9, #0x848
    ldrh     w10, [x9]
    mov      w11, #0x7624
    adrp     x12, #0x552000
    add      x12, x12, #0x856
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0xbdf6
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x808f
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0xd70c
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0xaa08
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w10, [x9, #0xa]
    mov      w11, #0x4436
    eor      w10, w10, w11
    strh     w10, [x12, #0xa]
    ldrh     w9, [x9, #0xc]
    mov      w10, #0xe3ec
    eor      w9, w9, w10
    strh     w9, [x12, #0xc]
    adrp     x9, #0x552000
    add      x9, x9, #0x82c
    ldrh     w10, [x9]
    mov      w11, #0xb0d2
    eor      w10, w10, w11
    adrp     x11, #0x552000
    add      x11, x11, #0x83a
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x767b
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x1250
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xa20e
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x35ed
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0xdd6e
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w9, [x9, #0xc]
    mov      w10, #0x1808
    eor      w9, w9, w10
    strh     w9, [x11, #0xc]
    adrp     x9, #0x552000
    add      x9, x9, #0x820
    ldrh     w10, [x9]
    mov      w11, #0x3502
    eor      w10, w10, w11
    adrp     x11, #0x552000
    add      x11, x11, #0x826
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x26df
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x5d1d
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x552000
    add      x9, x9, #0x80c
    ldrh     w10, [x9]
    mov      w11, #0xa66
    eor      w10, w10, w11
    adrp     x11, #0x552000
    add      x11, x11, #0x816
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xb0b9
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xc6ea
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xebfc
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xadc8
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x552000
    add      x9, x9, #0x800
    ldrh     w10, [x9]
    mov      w11, #0xf1ba
    eor      w10, w10, w11
    adrp     x11, #0x552000
    add      x11, x11, #0x806
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x1b6b
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0xccbc
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x10
    stur     x8, [x29, #-0x68]
    mov      sp, x8
    sub      x23, sp, #0x30
    mov      sp, x23
    sub      x8, sp, #0x30
    stur     x8, [x29, #-0x70]
    mov      sp, x8
    sub      x21, sp, #0x30
    mov      sp, x21
    sub      x24, sp, #0x30
    mov      sp, x24
    sub      x28, sp, #0x30
    mov      sp, x28
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      x22, #0x381a00
    cbz      x0, #0x381a00
    mov      x0, x19
    bl       #0x37c1dc
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x88]
    mov      x1, x19
    bl       #0x37c4f0
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x310]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb00]
    stur     x2, [x29, #-0x90]
    mov      x3, #0
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    ldur     x26, [x29, #-0x68]
    mov      x0, x26
    mov      x1, x25
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c4000
    ldr      x20, [x8, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x23]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    str      d8, [x23, #8]
    adrp     x8, #0x381000
    add      x8, x8, #0xa9c
    adrp     x9, #0x4a2000
    add      x9, x9, #0xca8
    stp      x8, x9, [x23, #0x10]
    add      x0, x23, #0x28
    mov      x1, x26
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x23, #0x20]
    adrp     x8, #0x4bf000
    ldr      x25, [x8, #0xb08]
    adrp     x2, #0x552000
    add      x2, x2, #0xa30
    mov      x0, x20
    mov      x1, x25
    mov      x3, #0
    stur     x23, [x29, #-0x78]
    mov      x4, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x26, [x8, #0xb10]
    mov      x0, x27
    mov      x1, x26
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x20, [x8, #0x318]
    ldp      x23, x1, [x29, #-0x70]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x23]
    str      d8, [x23, #8]
    adrp     x8, #0x381000
    add      x9, x8, #0xb04
    adrp     x8, #0x4a2000
    add      x8, x8, #0xca8
    stp      x9, x8, [x23, #0x10]
    add      x0, x23, #0x28
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x23, #0x20]
    adrp     x2, #0x552000
    add      x2, x2, #0x9f0
    mov      x0, x20
    mov      x1, x25
    mov      x3, #0
    mov      x4, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x27
    mov      x1, x26
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    stur     x22, [x29, #-0x80]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    bl       #0x380060
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x528]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    cbz      x22, #0x381698
    adrp     x8, #0x4c4000
    ldr      x20, [x8, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x21]
    str      d8, [x21, #8]
    adrp     x8, #0x381000
    add      x9, x8, #0xb6c
    adrp     x8, #0x4a2000
    add      x8, x8, #0xca8
    stp      x9, x8, [x21, #0x10]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x21, #0x20]
    add      x0, x21, #0x28
    ldur     x1, [x29, #-0x68]
    bl       #0x461c00 // _objc_copyWeak
    adrp     x2, #0x552000
    add      x2, x2, #0x9b0
    mov      x0, x20
    mov      x1, x25
    mov      x3, #0
    mov      x4, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x27
    mov      x1, x26
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    add      x0, x21, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x21, #0x20]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x20, [x8, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x24]
    str      d8, [x24, #8]
    adrp     x8, #0x381000
    add      x9, x8, #0xbac
    adrp     x8, #0x4a2000
    add      x8, x8, #0xca8
    stp      x9, x8, [x24, #0x10]
    add      x0, x24, #0x28
    ldur     x1, [x29, #-0x68]
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x24, #0x20]
    adrp     x2, #0x552000
    add      x2, x2, #0x970
    mov      x0, x20
    mov      x1, x25
    mov      w3, #2
    mov      x4, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x27
    mov      x1, x26
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    bl       #0x37b0d0
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldur     x22, [x29, #-0x80]
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    cmp      x21, #4
    b.hi     #0x3817d0
    adrp     x8, #0x4c4000
    ldr      x20, [x8, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x28]
    str      d8, [x28, #8]
    adrp     x8, #0x381000
    add      x8, x8, #0xbe8
    adrp     x9, #0x4a2000
    add      x9, x9, #0xcd8
    stp      x8, x9, [x28, #0x10]
    add      x0, x28, #0x20
    ldur     x1, [x29, #-0x68]
    bl       #0x461c00 // _objc_copyWeak
    adrp     x2, #0x552000
    add      x2, x2, #0x930
    mov      x0, x20
    mov      x1, x25
    mov      x3, #0
    mov      x4, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x27
    mov      x1, x26
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    add      x0, x28, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x318]
    adrp     x2, #0x552000
    add      x2, x2, #0x8f0
    adrp     x4, #0x4a5000
    add      x4, x4, #0x3e8
    mov      x1, x25
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x27
    mov      x1, x26
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x318]
    adrp     x2, #0x552000
    add      x2, x2, #0x8b0
    mov      x1, x25
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x27
    mov      x1, x26
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x3d8]
    mov      x0, x22
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4bf000
    ldr      x21, [x8, #0xb58]
    mov      x0, x27
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb60]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x28, [x8, #0x4d8]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616d8 // _CGRectGetMidX
    fmov     d8, d0
    mov      x0, x22
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616e4 // _CGRectGetMidY
    fmov     d9, d0
    mov      x0, x27
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb68]
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    fmov     d0, d8
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb70]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x22
    mov      x2, x27
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x24, #0x20]
    bl       #0x461c9c // _objc_release
    add      x0, x24, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x23, #0x20]
    bl       #0x461c9c // _objc_release
    add      x0, x23, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldur     x20, [x29, #-0x78]
    ldr      x0, [x20, #0x20]
    bl       #0x461c9c // _objc_release
    add      x0, x20, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldur     x0, [x29, #-0x68]
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x90]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x88]
    bl       #0x461c9c // _objc_release
    mov      x0, x22
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
    add      x0, x28, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    b        #0x381a6c
    mov      x19, x0
    add      x0, x21, #0x28
    b        #0x381a70
    b        #0x381a68
    b        #0x381a58
    mov      x19, x0
    b        #0x381a74
    mov      x19, x0
    b        #0x381a80
    mov      x19, x0
    add      x0, x24, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldur     x8, [x29, #-0x70]
    add      x0, x8, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldur     x8, [x29, #-0x78]
    add      x0, x8, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldur     x0, [x29, #-0x68]
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGHomePinnedController replaceFriend:fromController:] IMP=0x381C44 bounds=0x381C44-0x381E24
loc_381C44:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x20, x3
    mov      x19, x2
    mov      x23, x0
    adrp     x8, #0x581000
    add      x8, x8, #0x8f0
    ldar     w9, [x8]
    cbnz     w9, #0x381cd8
    adrp     x9, #0x552000
    add      x9, x9, #0xa50
    ldrh     w10, [x9]
    mov      w11, #0x3e8f
    adrp     x12, #0x552000
    add      x12, x12, #0xa5a
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x7a7c
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x4b23
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x3072
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x7086
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
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    cbz      x20, #0x381ddc
    bl       #0x37b0d0
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
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c4000
    ldr      x23, [x8, #0x560]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x22]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x22, #8]
    adrp     x8, #0x381000
    add      x8, x8, #0xe24
    adrp     x9, #0x4a4000
    add      x9, x9, #0xb28
    stp      x8, x9, [x22, #0x10]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x22, #0x20]
    add      x0, x22, #0x28
    mov      x1, x21
    bl       #0x461c00 // _objc_copyWeak
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb10]
    adrp     x2, #0x552000
    add      x2, x2, #0xa90
    mov      x0, x23
    mov      x3, x24
    mov      x4, x20
    mov      x5, x22
    bl       #0x461c6c // _objc_msgSend
    add      x0, x22, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x22, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x20
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
    add      x0, x22, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x21
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGHomePinnedController replaceAvatar:fromController:] IMP=0x382228 bounds=0x382228-0x38230C
loc_382228:
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
    cbz      x20, #0x3822f0
    adrp     x22, #0x4c4000
    ldr      x0, [x22, #0x350]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb18]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3822f0
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

// -[WCLGHomePinnedController removeUser:] IMP=0x38230C bounds=0x38230C-0x3823FC
loc_38230C:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x21, x2
    mov      x19, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    bl       #0x37b0d0
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
    mov      x0, x21
    bl       #0x38081c
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x381f98
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cbnz     x0, #0x3823d8
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4a3000
    add      x8, x8, #0xd40
    ldr      x3, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x350]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x180]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGHomePinnedController addContactFromController:onChange:] IMP=0x3823FC bounds=0x3823FC-0x3825F8
loc_3823FC:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x20, x3
    mov      x19, x2
    mov      x23, x0
    adrp     x8, #0x581000
    add      x8, x8, #0x904
    ldar     w9, [x8]
    cbnz     w9, #0x3824a0
    adrp     x9, #0x552000
    add      x9, x9, #0xab0
    ldrh     w10, [x9]
    mov      w11, #0x8dd3
    eor      w10, w10, w11
    adrp     x11, #0x552000
    add      x11, x11, #0xabc
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xcaf5
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xe814
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x876c
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x8568
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w9, [x9, #0xa]
    mov      w10, #0x68a2
    eor      w9, w9, w10
    strh     w9, [x11, #0xa]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x21, sp, #0x10
    mov      sp, x21
    sub      x22, sp, #0x30
    mov      sp, x22
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    cbz      x19, #0x3825a8
    bl       #0x37b0d0
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    cmp      x25, #4
    b.hi     #0x3825a8
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c4000
    ldr      x24, [x8, #0x560]
    bl       #0x37b0d0
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x22]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x22, #8]
    adrp     x8, #0x382000
    add      x8, x8, #0x5f8
    adrp     x9, #0x4a5000
    add      x9, x9, #0x408
    stp      x8, x9, [x22, #0x10]
    add      x0, x22, #0x28
    mov      x1, x21
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    str      x20, [x22, #0x20]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb10]
    adrp     x2, #0x552000
    add      x2, x2, #0xaf0
    mov      x0, x24
    mov      x3, x23
    mov      x4, x19
    mov      x5, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x22, #0x20]
    bl       #0x461c9c // _objc_release
    add      x0, x22, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x21
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x20
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
    add      x0, x22, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    b        #0x3825e8
    mov      x19, x0
    mov      x0, x21
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGHomePinnedController presentMaskPickerFromController:] IMP=0x382724 bounds=0x382724-0x3830EC
loc_382724:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x19, x2
    mov      x24, x0
    adrp     x8, #0x581000
    add      x8, x8, #0x910
    ldar     w9, [x8]
    cbnz     w9, #0x382cfc
    adrp     x9, #0x552000
    add      x9, x9, #0xbe0
    ldrh     w11, [x9]
    mov      w12, #0xca66
    adrp     x10, #0x552000
    add      x10, x10, #0xc40
    eor      w11, w11, w12
    strh     w11, [x10]
    ldrh     w11, [x9, #2]
    mov      w12, #0x642d
    eor      w11, w11, w12
    strh     w11, [x10, #2]
    ldrh     w11, [x9, #4]
    mov      w12, #0x7745
    eor      w11, w11, w12
    strh     w11, [x10, #4]
    ldrh     w11, [x9, #6]
    mov      w12, #0xab17
    eor      w11, w11, w12
    strh     w11, [x10, #6]
    ldrh     w11, [x9, #8]
    mov      w12, #0x408a
    eor      w11, w11, w12
    strh     w11, [x10, #8]
    ldrh     w11, [x9, #0xa]
    mov      w12, #0x4358
    eor      w11, w11, w12
    strh     w11, [x10, #0xa]
    ldrh     w11, [x9, #0xc]
    mov      w12, #0x7fef
    eor      w11, w11, w12
    strh     w11, [x10, #0xc]
    ldrh     w11, [x9, #0xe]
    mov      w12, #0x16ac
    eor      w11, w11, w12
    strh     w11, [x10, #0xe]
    ldrh     w11, [x9, #0x10]
    mov      w12, #0x7a99
    eor      w11, w11, w12
    strh     w11, [x10, #0x10]
    ldrh     w11, [x9, #0x12]
    mov      w12, #0xe918
    eor      w11, w11, w12
    strh     w11, [x10, #0x12]
    ldrh     w11, [x9, #0x14]
    mov      w12, #0x325
    eor      w11, w11, w12
    strh     w11, [x10, #0x14]
    ldrh     w11, [x9, #0x16]
    mov      w12, #0xd6db
    eor      w11, w11, w12
    strh     w11, [x10, #0x16]
    ldrh     w11, [x9, #0x18]
    mov      w12, #0x9586
    eor      w11, w11, w12
    strh     w11, [x10, #0x18]
    ldrh     w11, [x9, #0x1a]
    mov      w12, #0x8f2d
    eor      w11, w11, w12
    strh     w11, [x10, #0x1a]
    ldrh     w11, [x9, #0x1c]
    mov      w12, #0x7258
    eor      w11, w11, w12
    strh     w11, [x10, #0x1c]
    ldrh     w11, [x9, #0x1e]
    mov      w12, #0x6093
    eor      w11, w11, w12
    strh     w11, [x10, #0x1e]
    ldrh     w11, [x9, #0x20]
    mov      w12, #0x136b
    eor      w11, w11, w12
    strh     w11, [x10, #0x20]
    ldrh     w11, [x9, #0x22]
    mov      w12, #0x3c83
    eor      w11, w11, w12
    strh     w11, [x10, #0x22]
    ldrh     w11, [x9, #0x24]
    mov      w12, #0xcaa3
    eor      w11, w11, w12
    strh     w11, [x10, #0x24]
    ldrh     w11, [x9, #0x26]
    mov      w12, #0x73ab
    eor      w11, w11, w12
    strh     w11, [x10, #0x26]
    ldrh     w11, [x9, #0x28]
    mov      w12, #0x3d0
    eor      w11, w11, w12
    strh     w11, [x10, #0x28]
    ldrh     w11, [x9, #0x2a]
    mov      w12, #0x2c0b
    eor      w11, w11, w12
    strh     w11, [x10, #0x2a]
    ldrh     w11, [x9, #0x2c]
    mov      w12, #0x2611
    eor      w11, w11, w12
    strh     w11, [x10, #0x2c]
    ldrh     w11, [x9, #0x2e]
    mov      w12, #0x5786
    eor      w11, w11, w12
    strh     w11, [x10, #0x2e]
    ldrh     w11, [x9, #0x30]
    mov      w12, #0x63ff
    eor      w11, w11, w12
    strh     w11, [x10, #0x30]
    ldrh     w11, [x9, #0x32]
    mov      w12, #0x949
    eor      w11, w11, w12
    strh     w11, [x10, #0x32]
    ldrh     w11, [x9, #0x34]
    mov      w12, #0xbdce
    eor      w11, w11, w12
    strh     w11, [x10, #0x34]
    ldrh     w11, [x9, #0x36]
    mov      w12, #0x6de6
    eor      w11, w11, w12
    strh     w11, [x10, #0x36]
    ldrh     w11, [x9, #0x38]
    mov      w12, #0xafb7
    eor      w11, w11, w12
    strh     w11, [x10, #0x38]
    ldrh     w11, [x9, #0x3a]
    mov      w12, #0x9a0d
    eor      w11, w11, w12
    strh     w11, [x10, #0x3a]
    ldrh     w11, [x9, #0x3c]
    mov      w12, #0xd1c1
    eor      w11, w11, w12
    strh     w11, [x10, #0x3c]
    ldrh     w11, [x9, #0x3e]
    mov      w12, #0x91b4
    eor      w11, w11, w12
    strh     w11, [x10, #0x3e]
    ldrh     w11, [x9, #0x40]
    mov      w12, #0xf954
    eor      w11, w11, w12
    strh     w11, [x10, #0x40]
    ldrh     w11, [x9, #0x42]
    mov      w12, #0x5a08
    eor      w11, w11, w12
    strh     w11, [x10, #0x42]
    ldrh     w11, [x9, #0x44]
    mov      w12, #0x6f5b
    eor      w11, w11, w12
    strh     w11, [x10, #0x44]
    ldrh     w11, [x9, #0x46]
    mov      w12, #0x3f92
    eor      w11, w11, w12
    strh     w11, [x10, #0x46]
    ldrh     w11, [x9, #0x48]
    mov      w12, #0x78ee
    eor      w11, w11, w12
    strh     w11, [x10, #0x48]
    ldrh     w11, [x9, #0x4a]
    mov      w12, #0xd71f
    eor      w11, w11, w12
    strh     w11, [x10, #0x4a]
    ldrh     w11, [x9, #0x4c]
    mov      w12, #0xa3a9
    eor      w11, w11, w12
    strh     w11, [x10, #0x4c]
    ldrh     w11, [x9, #0x4e]
    mov      w12, #0xeddd
    eor      w11, w11, w12
    strh     w11, [x10, #0x4e]
    ldrh     w9, [x9, #0x50]
    mov      w11, #0x9481
    eor      w9, w9, w11
    strh     w9, [x10, #0x50]
    adrp     x9, #0x552000
    add      x9, x9, #0xba0
    ldrh     w10, [x9]
    mov      w11, #0x4dcc
    adrp     x12, #0x552000
    add      x12, x12, #0xbc0
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x23ea
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0xefcb
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x6a55
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0x65b
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w10, [x9, #0xa]
    mov      w11, #0x8ff5
    eor      w10, w10, w11
    strh     w10, [x12, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w11, #0xf70b
    eor      w10, w10, w11
    strh     w10, [x12, #0xc]
    ldrh     w10, [x9, #0xe]
    mov      w11, #0xbca3
    eor      w10, w10, w11
    strh     w10, [x12, #0xe]
    ldrh     w10, [x9, #0x10]
    mov      w11, #0x148f
    eor      w10, w10, w11
    strh     w10, [x12, #0x10]
    ldrh     w9, [x9, #0x12]
    mov      w10, #0x4e08
    eor      w9, w9, w10
    strh     w9, [x12, #0x12]
    adrp     x9, #0x552000
    add      x9, x9, #0xb38
    ldrh     w10, [x9]
    mov      w11, #0xf3d4
    eor      w10, w10, w11
    adrp     x11, #0x552000
    add      x11, x11, #0xb46
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x2e95
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xf116
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x9bb1
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x2a4b
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0x94b9
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w9, [x9, #0xc]
    mov      w10, #0xb18
    eor      w9, w9, w10
    strh     w9, [x11, #0xc]
    adrp     x9, #0x552000
    add      x9, x9, #0xb60
    ldrh     w10, [x9]
    mov      w11, #0xae64
    eor      w10, w10, w11
    adrp     x11, #0x552000
    add      x11, x11, #0xb80
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x390b
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x557c
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xaaee
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x6e37
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0xd85f
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0x7f61
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w10, [x9, #0xe]
    mov      w12, #0x2f1f
    eor      w10, w10, w12
    strh     w10, [x11, #0xe]
    ldrh     w10, [x9, #0x10]
    mov      w12, #0x8e75
    eor      w10, w10, w12
    strh     w10, [x11, #0x10]
    ldrh     w9, [x9, #0x12]
    mov      w10, #0x550a
    eor      w9, w9, w10
    strh     w9, [x11, #0x12]
    adrp     x9, #0x552000
    add      x9, x9, #0xb1c
    ldrh     w10, [x9]
    mov      w11, #0xbdef
    adrp     x12, #0x552000
    add      x12, x12, #0xb2a
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x3ac5
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x8d03
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x235a
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0x2147
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w10, [x9, #0xa]
    mov      w11, #0x4db8
    eor      w10, w10, w11
    strh     w10, [x12, #0xa]
    ldrh     w9, [x9, #0xc]
    mov      w10, #0x3e92
    eor      w9, w9, w10
    strh     w9, [x12, #0xc]
    adrp     x9, #0x552000
    add      x9, x9, #0xc92
    ldrh     w10, [x9]
    mov      w11, #0x533f
    eor      w10, w10, w11
    adrp     x11, #0x552000
    add      x11, x11, #0xc9c
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xed40
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xd1b
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x7f48
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xe665
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x552000
    add      x9, x9, #0xb10
    ldrh     w10, [x9]
    mov      w11, #0x813c
    eor      w10, w10, w11
    adrp     x11, #0x552000
    add      x11, x11, #0xb16
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x2538
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x450e
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x20, sp, #0x10
    mov      sp, x20
    sub      x21, sp, #0x30
    mov      sp, x21
    sub      x22, sp, #0x30
    mov      sp, x22
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    cbz      x19, #0x38308c
    mov      x27, x19
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x310]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb00]
    adrp     x2, #0x552000
    add      x2, x2, #0xe50
    adrp     x3, #0x552000
    add      x3, x3, #0xe10
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c4000
    ldr      x25, [x8, #0x318]
    adrp     x28, #0x4a0000
    ldr      x28, [x28, #0x748]
    str      x28, [x21]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    str      d8, [x21, #8]
    adrp     x8, #0x383000
    add      x8, x8, #0xec
    adrp     x19, #0x4a2000
    add      x19, x19, #0xcd8
    stp      x8, x19, [x21, #0x10]
    add      x0, x21, #0x20
    mov      x1, x20
    bl       #0x461c00 // _objc_copyWeak
    adrp     x8, #0x4bf000
    ldr      x24, [x8, #0xb08]
    adrp     x2, #0x552000
    add      x2, x2, #0xd90
    mov      x0, x25
    mov      x1, x24
    mov      x3, #0
    mov      x4, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4bf000
    ldr      x25, [x8, #0xb10]
    mov      x0, x23
    mov      x1, x25
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x26, [x8, #0x318]
    str      x28, [x22]
    str      d8, [x22, #8]
    adrp     x8, #0x383000
    add      x8, x8, #0x144
    stp      x8, x19, [x22, #0x10]
    add      x0, x22, #0x20
    mov      x1, x20
    bl       #0x461c00 // _objc_copyWeak
    adrp     x2, #0x552000
    add      x2, x2, #0xdd0
    mov      x0, x26
    mov      x1, x24
    mov      x3, #0
    mov      x4, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x23
    mov      x1, x25
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      w0, #0
    bl       #0x37ae3c
    mov      x19, x27
    cbz      w0, #0x382ebc
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x318]
    adrp     x2, #0x552000
    add      x2, x2, #0xd50
    adrp     x4, #0x4a5000
    add      x4, x4, #0x438
    mov      x1, x24
    mov      w3, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x23
    mov      x1, x25
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      w0, #1
    bl       #0x37ae3c
    cbz      w0, #0x382f10
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x318]
    adrp     x2, #0x552000
    add      x2, x2, #0xd10
    adrp     x4, #0x4a5000
    add      x4, x4, #0x458
    mov      x1, x24
    mov      w3, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x23
    mov      x1, x25
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x318]
    adrp     x2, #0x552000
    add      x2, x2, #0xcd0
    mov      x1, x24
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x23
    mov      x1, x25
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb58]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    cbz      x0, #0x383048
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x3d8]
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb60]
    mov      x0, x24
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x4d8]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616d8 // _CGRectGetMidX
    fmov     d8, d0
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616e4 // _CGRectGetMidY
    fmov     d1, d0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb68]
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    mov      x0, x24
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb70]
    mov      x0, x24
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x19
    mov      x2, x23
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    add      x0, x22, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x21, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x23
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
    b        #0x3830c8
    mov      x19, x0
    b        #0x3830d4
    b        #0x3830c8
    mov      x19, x0
    add      x0, x22, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x21, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGHomePinnedController pickMaskForDark:fromController:] IMP=0x3831D4 bounds=0x3831D4-0x3832E8
loc_3831D4:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x3
    mov      x21, x2
    mov      x20, x0
    mov      x0, x3
    bl       #0x461ca8 // _objc_retain
    cbz      x19, #0x3832d4
    adrp     x22, #0x4c4000
    ldr      x0, [x22, #0x350]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb18]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3832d4
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb20]
    mov      x0, x20
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x198]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x22, #0x350]
    bl       #0x461bac // _objc_alloc_init
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc58]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc78]
    mov      x0, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb50]
    mov      x0, x21
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x19
    mov      x2, x21
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGHomePinnedController imagePickerController:didFinishPickingMediaWithInfo:] IMP=0x3832E8 bounds=0x3832E8-0x3834EC
loc_3832E8:
    sub      sp, sp, #0x90
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x20, x3
    mov      x19, x2
    mov      x24, x0
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
    cbz      x0, #0x383358
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    mov      x21, x22
    b        #0x38337c
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
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x1a0]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xb20]
    mov      x0, x24
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x198]
    mov      x0, x24
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    sub      x0, x29, #0x38
    mov      x1, x24
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp, #8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [sp, #0x10]
    adrp     x8, #0x383000
    add      x8, x8, #0x4ec
    adrp     x9, #0x4a4000
    add      x9, x9, #0x1c8
    stp      x8, x9, [sp, #0x18]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    str      x21, [sp, #0x28]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    str      x23, [sp, #0x30]
    add      x24, sp, #8
    add      x0, x24, #0x38
    sub      x1, x29, #0x38
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    str      x22, [sp, #0x38]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb38]
    add      x3, sp, #8
    mov      x0, x19
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x38]
    bl       #0x461c9c // _objc_release
    add      x0, x24, #0x38
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    sub      x0, x29, #0x38
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    add      sp, sp, #0x90
    ret      
    mov      x19, x0
    add      x0, x24, #0x38
    bl       #0x461c0c // _objc_destroyWeak
    sub      x0, x29, #0x38
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGHomePinnedController imagePickerControllerDidCancel:] IMP=0x38357C bounds=0x38357C-0x3835F4
loc_38357C:
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
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x198]
    mov      x0, x20
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

// -[WCLGHomePinnedController pendingAvatarUser] IMP=0x3835F4 bounds=0x3835F4-0x3835FC
loc_3835F4:
    ldr      x0, [x0, #8]
    ret      

// -[WCLGHomePinnedController setPendingAvatarUser:] IMP=0x3835FC bounds=0x3835FC-0x383604
loc_3835FC:
    mov      w3, #8
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGHomePinnedController pendingMaskDark] IMP=0x383604 bounds=0x383604-0x38360C
loc_383604:
    ldr      x0, [x0, #0x10]
    ret      

// -[WCLGHomePinnedController setPendingMaskDark:] IMP=0x38360C bounds=0x38360C-0x383618
loc_38360C:
    mov      x1, x2
    add      x0, x0, #0x10
    b        #0x461cfc // _objc_storeStrong

// -[WCLGHomePinnedController .cxx_destruct] IMP=0x383618 bounds=0x383618-0x383648
loc_383618:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    add      x0, x0, #0x10
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
