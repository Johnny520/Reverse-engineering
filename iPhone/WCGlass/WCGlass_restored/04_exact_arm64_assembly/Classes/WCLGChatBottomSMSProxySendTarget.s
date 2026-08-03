// Exact ARM64 listing for WCLGChatBottomSMSProxySendTarget

// -[WCLGChatBottomSMSProxySendTarget wclg_smsSendTapped:] IMP=0x12A9DC bounds=0x12A9DC-0x12B6A8
loc_12A9DC:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x90
    mov      x25, x2
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x57e000
    add      x8, x8, #0x358
    ldar     w9, [x8]
    cbnz     w9, #0x12b138
    adrp     x15, #0x4f0000
    add      x15, x15, #0xa10
    ldrb     w9, [x15]
    mov      w10, #0xb6
    eor      w9, w9, w10
    adrp     x12, #0x4f0000
    add      x12, x12, #0xa30
    strb     w9, [x12]
    ldrb     w9, [x15, #1]
    mov      w10, #0x58
    eor      w9, w9, w10
    strb     w9, [x12, #1]
    ldrb     w9, [x15, #2]
    mov      w10, #0x5b
    eor      w9, w9, w10
    strb     w9, [x12, #2]
    ldrb     w9, [x15, #3]
    mov      w10, #0x47
    eor      w9, w9, w10
    strb     w9, [x12, #3]
    ldrb     w10, [x15, #4]
    mov      w9, #0xf4
    eor      w10, w10, w9
    strb     w10, [x12, #4]
    ldrb     w10, [x15, #5]
    mov      w14, #0xd3
    eor      w10, w10, w14
    strb     w10, [x12, #5]
    ldrb     w10, [x15, #6]
    eor      w10, w10, #0xffffffe1
    strb     w10, [x12, #6]
    ldrb     w10, [x15, #7]
    mov      w13, #0x27
    eor      w10, w10, w13
    strb     w10, [x12, #7]
    ldrb     w10, [x15, #8]
    mov      w16, #0xe6
    eor      w10, w10, w16
    strb     w10, [x12, #8]
    ldrb     w10, [x15, #9]
    mov      w11, #0x90
    eor      w10, w10, w11
    strb     w10, [x12, #9]
    ldrb     w10, [x15, #0xa]
    mov      w11, #0xe4
    eor      w10, w10, w11
    strb     w10, [x12, #0xa]
    ldrb     w10, [x15, #0xb]
    mov      w11, #0x3a
    eor      w10, w10, w11
    strb     w10, [x12, #0xb]
    ldrb     w10, [x15, #0xc]
    mov      w11, #0x16
    eor      w10, w10, w11
    strb     w10, [x12, #0xc]
    ldrb     w10, [x15, #0xd]
    eor      w10, w10, #0x3f
    strb     w10, [x12, #0xd]
    ldrb     w10, [x15, #0xe]
    mov      w17, #0x73
    eor      w10, w10, w17
    strb     w10, [x12, #0xe]
    ldrb     w10, [x15, #0xf]
    mov      w0, #0xd1
    eor      w10, w10, w0
    strb     w10, [x12, #0xf]
    ldrb     w10, [x15, #0x10]
    eor      w10, w10, #0x10
    strb     w10, [x12, #0x10]
    ldrb     w10, [x15, #0x11]
    mov      w0, #0xca
    eor      w10, w10, w0
    strb     w10, [x12, #0x11]
    ldrb     w10, [x15, #0x12]
    mov      w0, #0xd6
    eor      w10, w10, w0
    strb     w10, [x12, #0x12]
    ldrb     w0, [x15, #0x13]
    mov      w10, #0xb0
    eor      w0, w0, w10
    strb     w0, [x12, #0x13]
    ldrb     w0, [x15, #0x14]
    eor      w0, w0, #0x44444444
    strb     w0, [x12, #0x14]
    ldrb     w0, [x15, #0x15]
    mov      w1, #0x6f
    eor      w0, w0, w1
    strb     w0, [x12, #0x15]
    ldrb     w0, [x15, #0x16]
    mov      w1, #0x98
    eor      w0, w0, w1
    strb     w0, [x12, #0x16]
    ldrb     w0, [x15, #0x17]
    eor      w16, w0, w16
    strb     w16, [x12, #0x17]
    ldrb     w15, [x15, #0x18]
    mov      w16, #0xa8
    eor      w15, w15, w16
    adrp     x1, #0x4f0000
    add      x1, x1, #0x950
    strb     w15, [x12, #0x18]
    ldrb     w12, [x1]
    mov      w15, #0xa0
    eor      w12, w12, w15
    adrp     x2, #0x4f0000
    add      x2, x2, #0x970
    strb     w12, [x2]
    ldrb     w12, [x1, #1]
    eor      w12, w12, #0x7e
    strb     w12, [x2, #1]
    ldrb     w12, [x1, #2]
    eor      w12, w12, #0xfffffff3
    strb     w12, [x2, #2]
    ldrb     w12, [x1, #3]
    eor      w12, w12, #0xdddddddd
    strb     w12, [x2, #3]
    ldrb     w15, [x1, #4]
    mov      w12, #0x71
    eor      w15, w15, w12
    strb     w15, [x2, #4]
    ldrb     w15, [x1, #5]
    mov      w16, #0xb
    eor      w15, w15, w16
    strb     w15, [x2, #5]
    ldrb     w15, [x1, #6]
    mov      w16, #0xc8
    eor      w15, w15, w16
    strb     w15, [x2, #6]
    ldrb     w15, [x1, #7]
    mov      w0, #0x97
    eor      w15, w15, w0
    strb     w15, [x2, #7]
    ldrb     w15, [x1, #8]
    mov      w4, #0x57
    eor      w15, w15, w4
    strb     w15, [x2, #8]
    ldrb     w15, [x1, #9]
    mov      w0, #0x65
    eor      w15, w15, w0
    strb     w15, [x2, #9]
    ldrb     w15, [x1, #0xa]
    eor      w15, w15, #0x11111111
    strb     w15, [x2, #0xa]
    ldrb     w15, [x1, #0xb]
    mov      w3, #0x51
    eor      w15, w15, w3
    strb     w15, [x2, #0xb]
    ldrb     w15, [x1, #0xc]
    mov      w3, #0xda
    eor      w15, w15, w3
    strb     w15, [x2, #0xc]
    ldrb     w15, [x1, #0xd]
    eor      w15, w15, w17
    strb     w15, [x2, #0xd]
    ldrb     w15, [x1, #0xe]
    mov      w3, #0x79
    eor      w15, w15, w3
    strb     w15, [x2, #0xe]
    ldrb     w15, [x1, #0xf]
    eor      w15, w15, #0xbbbbbbbb
    strb     w15, [x2, #0xf]
    ldrb     w15, [x1, #0x10]
    eor      w15, w15, w14
    strb     w15, [x2, #0x10]
    ldrb     w3, [x1, #0x11]
    mov      w15, #0x9c
    eor      w3, w3, w15
    strb     w3, [x2, #0x11]
    ldrb     w3, [x1, #0x12]
    mov      w5, #0x95
    eor      w3, w3, w5
    strb     w3, [x2, #0x12]
    ldrb     w3, [x1, #0x13]
    eor      w3, w3, #0x3e
    strb     w3, [x2, #0x13]
    ldrb     w1, [x1, #0x14]
    mov      w3, #0xcb
    eor      w1, w1, w3
    strb     w1, [x2, #0x14]
    adrp     x2, #0x4f0000
    add      x2, x2, #0x910
    ldrb     w1, [x2]
    adrp     x3, #0x4f0000
    add      x3, x3, #0x930
    eor      w17, w1, w17
    strb     w17, [x3]
    ldrb     w17, [x2, #1]
    mov      w1, #0x52
    eor      w17, w17, w1
    strb     w17, [x3, #1]
    ldrb     w17, [x2, #2]
    eor      w17, w17, w4
    strb     w17, [x3, #2]
    ldrb     w17, [x2, #3]
    eor      w17, w17, #0xbbbbbbbb
    strb     w17, [x3, #3]
    ldrb     w17, [x2, #4]
    eor      w17, w17, #0xffffff83
    strb     w17, [x3, #4]
    ldrb     w17, [x2, #5]
    mov      w1, #0x29
    eor      w17, w17, w1
    strb     w17, [x3, #5]
    ldrb     w17, [x2, #6]
    eor      w17, w17, w9
    strb     w17, [x3, #6]
    ldrb     w17, [x2, #7]
    mov      w1, #0xcd
    eor      w17, w17, w1
    strb     w17, [x3, #7]
    ldrb     w17, [x2, #8]
    mov      w4, #0x7a
    eor      w17, w17, w4
    strb     w17, [x3, #8]
    ldrb     w17, [x2, #9]
    eor      w14, w17, w14
    strb     w14, [x3, #9]
    ldrb     w14, [x2, #0xa]
    mov      w17, #0xab
    eor      w14, w14, w17
    strb     w14, [x3, #0xa]
    ldrb     w14, [x2, #0xb]
    mov      w17, #0x42
    eor      w14, w14, w17
    strb     w14, [x3, #0xb]
    ldrb     w14, [x2, #0xc]
    mov      w1, #0x53
    eor      w14, w14, w1
    strb     w14, [x3, #0xc]
    ldrb     w17, [x2, #0xd]
    mov      w14, #0x56
    eor      w17, w17, w14
    strb     w17, [x3, #0xd]
    ldrb     w17, [x2, #0xe]
    eor      w17, w17, w4
    strb     w17, [x3, #0xe]
    ldrb     w17, [x2, #0xf]
    eor      w17, w17, w15
    strb     w17, [x3, #0xf]
    ldrb     w17, [x2, #0x10]
    mov      w4, #0x68
    eor      w17, w17, w4
    strb     w17, [x3, #0x10]
    ldrb     w17, [x2, #0x11]
    mvn      w17, w17
    strb     w17, [x3, #0x11]
    ldrb     w17, [x2, #0x12]
    eor      w17, w17, w0
    strb     w17, [x3, #0x12]
    ldrb     w17, [x2, #0x13]
    mov      w0, #0x91
    eor      w17, w17, w0
    strb     w17, [x3, #0x13]
    adrp     x0, #0x4f0000
    add      x0, x0, #0x9d0
    ldrb     w17, [x0]
    eor      w17, w17, #0x77777777
    adrp     x2, #0x4f0000
    add      x2, x2, #0x9f0
    strb     w17, [x2]
    ldrb     w17, [x0, #1]
    mov      w3, #0xb8
    eor      w17, w17, w3
    strb     w17, [x2, #1]
    ldrb     w4, [x0, #2]
    mov      w17, #0xb7
    eor      w4, w4, w17
    strb     w4, [x2, #2]
    ldrb     w4, [x0, #3]
    eor      w4, w4, #0xfc
    strb     w4, [x2, #3]
    ldrb     w4, [x0, #4]
    eor      w13, w4, w13
    strb     w13, [x2, #4]
    ldrb     w13, [x0, #5]
    mov      w4, #0xae
    eor      w13, w13, w4
    strb     w13, [x2, #5]
    ldrb     w13, [x0, #6]
    mov      w4, #0x41
    eor      w13, w13, w4
    strb     w13, [x2, #6]
    ldrb     w13, [x0, #7]
    eor      w13, w13, #0x7c
    strb     w13, [x2, #7]
    ldrb     w13, [x0, #8]
    mov      w5, #0x3d
    eor      w13, w13, w5
    strb     w13, [x2, #8]
    ldrb     w13, [x0, #9]
    mov      w5, #0x36
    eor      w13, w13, w5
    strb     w13, [x2, #9]
    ldrb     w13, [x0, #0xa]
    mov      w5, #0x69
    eor      w13, w13, w5
    strb     w13, [x2, #0xa]
    ldrb     w13, [x0, #0xb]
    eor      w13, w13, #0xc
    strb     w13, [x2, #0xb]
    ldrb     w5, [x0, #0xc]
    mov      w13, #0x1a
    eor      w5, w5, w13
    strb     w5, [x2, #0xc]
    ldrb     w5, [x0, #0xd]
    mov      w6, #0x96
    eor      w5, w5, w6
    strb     w5, [x2, #0xd]
    ldrb     w5, [x0, #0xe]
    eor      w3, w5, w3
    strb     w3, [x2, #0xe]
    ldrb     w3, [x0, #0xf]
    eor      w16, w3, w16
    strb     w16, [x2, #0xf]
    ldrb     w16, [x0, #0x10]
    eor      w16, w16, #8
    strb     w16, [x2, #0x10]
    adrp     x16, #0x4f0000
    add      x16, x16, #0x990
    ldrb     w0, [x16]
    adrp     x2, #0x4f0000
    add      x2, x2, #0x9b0
    eor      w0, w0, #3
    strb     w0, [x2]
    ldrb     w0, [x16, #1]
    eor      w0, w0, w4
    strb     w0, [x2, #1]
    ldrb     w0, [x16, #2]
    eor      w0, w0, #0xffffffe7
    strb     w0, [x2, #2]
    ldrb     w0, [x16, #3]
    eor      w0, w0, #0x18
    strb     w0, [x2, #3]
    ldrb     w0, [x16, #4]
    eor      w0, w0, #0x10
    strb     w0, [x2, #4]
    ldrb     w0, [x16, #5]
    eor      w0, w0, w1
    strb     w0, [x2, #5]
    ldrb     w0, [x16, #6]
    mov      w1, #0x2d
    eor      w0, w0, w1
    strb     w0, [x2, #6]
    ldrb     w0, [x16, #7]
    eor      w0, w0, w9
    strb     w0, [x2, #7]
    ldrb     w0, [x16, #8]
    mov      w1, #0xdc
    eor      w0, w0, w1
    strb     w0, [x2, #8]
    ldrb     w0, [x16, #9]
    mov      w1, #0x13
    eor      w0, w0, w1
    strb     w0, [x2, #9]
    ldrb     w0, [x16, #0xa]
    mov      w1, #0xd7
    eor      w0, w0, w1
    strb     w0, [x2, #0xa]
    ldrb     w0, [x16, #0xb]
    eor      w0, w0, #0x7c
    strb     w0, [x2, #0xb]
    ldrb     w0, [x16, #0xc]
    mov      w1, #0xea
    eor      w0, w0, w1
    strb     w0, [x2, #0xc]
    ldrb     w0, [x16, #0xd]
    mov      w1, #0xb4
    eor      w0, w0, w1
    strb     w0, [x2, #0xd]
    ldrb     w0, [x16, #0xe]
    eor      w0, w0, #0xfffffff3
    strb     w0, [x2, #0xe]
    ldrb     w0, [x16, #0xf]
    eor      w15, w0, w15
    strb     w15, [x2, #0xf]
    ldrb     w15, [x16, #0x10]
    mov      w16, #0xa3
    eor      w15, w15, w16
    strb     w15, [x2, #0x10]
    adrp     x15, #0x4f0000
    add      x15, x15, #0x8d0
    ldrb     w16, [x15]
    mov      w0, #0xa6
    eor      w0, w16, w0
    adrp     x16, #0x4f0000
    add      x16, x16, #0x8f0
    strb     w0, [x16]
    ldrb     w0, [x15, #1]
    mov      w1, #0x59
    eor      w0, w0, w1
    strb     w0, [x16, #1]
    ldrb     w0, [x15, #2]
    eor      w11, w0, w11
    strb     w11, [x16, #2]
    ldrb     w11, [x15, #3]
    eor      w11, w11, #0x3c
    strb     w11, [x16, #3]
    ldrb     w11, [x15, #4]
    eor      w11, w11, w12
    strb     w11, [x16, #4]
    ldrb     w11, [x15, #5]
    eor      w11, w11, w13
    strb     w11, [x16, #5]
    ldrb     w11, [x15, #6]
    eor      w11, w11, #0xe
    strb     w11, [x16, #6]
    ldrb     w11, [x15, #7]
    mov      w12, #0x8a
    eor      w11, w11, w12
    strb     w11, [x16, #7]
    ldrb     w11, [x15, #8]
    mov      w12, #0x9d
    eor      w11, w11, w12
    strb     w11, [x16, #8]
    ldrb     w11, [x15, #9]
    eor      w11, w11, #7
    strb     w11, [x16, #9]
    ldrb     w11, [x15, #0xa]
    mov      w12, #0x26
    eor      w11, w11, w12
    strb     w11, [x16, #0xa]
    ldrb     w11, [x15, #0xb]
    eor      w9, w11, w9
    strb     w9, [x16, #0xb]
    ldrb     w9, [x15, #0xc]
    mov      w11, #0xe9
    eor      w9, w9, w11
    strb     w9, [x16, #0xc]
    ldrb     w9, [x15, #0xd]
    mov      w11, #0x4d
    eor      w9, w9, w11
    strb     w9, [x16, #0xd]
    ldrb     w9, [x15, #0xe]
    eor      w9, w9, #0xffffff87
    strb     w9, [x16, #0xe]
    ldrb     w9, [x15, #0xf]
    eor      w9, w9, w10
    strb     w9, [x16, #0xf]
    ldrb     w9, [x15, #0x10]
    eor      w9, w9, #0xffffffcf
    strb     w9, [x16, #0x10]
    ldrb     w9, [x15, #0x11]
    eor      w9, w9, w14
    strb     w9, [x16, #0x11]
    ldrb     w9, [x15, #0x12]
    eor      w9, w9, w17
    strb     w9, [x16, #0x12]
    ldrb     w9, [x15, #0x13]
    eor      w9, w9, #0xffffffcf
    strb     w9, [x16, #0x13]
    ldrb     w9, [x15, #0x14]
    mov      w10, #0xd9
    eor      w9, w9, w10
    strb     w9, [x16, #0x14]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x21, sp, #0x30
    mov      sp, x21
    sub      x19, sp, #0x40
    mov      sp, x19
    sub      x20, sp, #0x80
    mov      sp, x20
    sub      x24, sp, #0x40
    mov      sp, x24
    sub      x22, sp, #0x80
    mov      sp, x22
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    bl       #0x461ca8 // _objc_retain
    cbz      x25, #0x12b658
    adrp     x1, #0x4ef000
    add      x1, x1, #0xf58
    mov      x0, x25
    bl       #0x461c3c // _objc_getAssociatedObject
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x1, #0x4ef000
    add      x1, x1, #0xe68
    mov      x0, x25
    bl       #0x461c3c // _objc_getAssociatedObject
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    cbz      x23, #0x12b648
    mov      x0, x23
    bl       #0x14edec
    cbz      x0, #0x12b648
    stp      x19, x22, [x29, #-0x98]
    stur     x20, [x29, #-0xa0]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x23
    mov      x1, #0
    bl       #0x12911c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x1, x0
    mov      x0, x26
    stur     x1, [x29, #-0xb8]
    bl       #0x14ee80
    mov      x0, x26
    mov      x1, x23
    bl       #0x14ee80
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x9a0]
    mov      x0, x23
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x26
    mov      x1, x22
    bl       #0x14ee80
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x27
    bl       #0x14ee80
    mov      x0, x23
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    cbz      x0, #0x12b2bc
    mov      x19, #0
    mov      x22, x28
    mov      x0, x26
    mov      x1, x28
    bl       #0x14ee80
    mov      x0, x28
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbz      x28, #0x12b2bc
    add      x8, x19, #1
    cmp      x19, #7
    mov      x19, x8
    b.lo     #0x12b278
    stp      x27, x23, [x29, #-0xb0]
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x468]
    mov      x0, x23
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    cbz      x0, #0x12b32c
    mov      x19, #0
    mov      x22, x27
    mov      x0, x26
    mov      x1, x27
    bl       #0x14ee80
    mov      x0, x27
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbz      x27, #0x12b32c
    add      x8, x19, #1
    cmp      x19, #7
    mov      x19, x8
    b.lo     #0x12b2e8
    adrp     x8, #0x4f0000
    add      x8, x8, #0xbb0
    adrp     x9, #0x4f0000
    add      x9, x9, #0xb70
    stp      x8, x9, [x21]
    adrp     x8, #0x4f0000
    add      x8, x8, #0xb30
    adrp     x9, #0x4f0000
    add      x9, x9, #0xab0
    stp      x8, x9, [x21, #0x10]
    adrp     x8, #0x4f0000
    add      x8, x8, #0xa70
    adrp     x9, #0x4f0000
    add      x9, x9, #0xaf0
    stp      x8, x9, [x21, #0x20]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    mov      x2, x21
    mov      w3, #6
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x70]
    movi     v0.16b, #0
    ldur     x19, [x29, #-0x98]
    stp      q0, q0, [x19]
    stp      q0, q0, [x19, #0x20]
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x478]
    mov      x1, x20
    mov      x2, x19
    ldur     x3, [x29, #-0xa0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x12b614
    ldr      x8, [x19, #0x10]
    ldr      x21, [x8]
    stp      x21, x20, [x29, #-0xe0]
    mov      x22, #0
    stur     x0, [x29, #-0xd0]
    ldr      x8, [x19, #0x10]
    ldr      x8, [x8]
    cmp      x8, x21
    b.eq     #0x12b3f4
    mov      x0, x26
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x19, #8]
    stur     x22, [x29, #-0xc8]
    ldr      x23, [x8, x22, lsl #3]
    movi     v0.16b, #0
    stp      q0, q0, [x24]
    stp      q0, q0, [x24, #0x20]
    ldur     x0, [x29, #-0x70]
    bl       #0x461ca8 // _objc_retain
    mov      x1, x20
    mov      x2, x24
    ldur     x3, [x29, #-0x90]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0x68]
    cbz      x0, #0x12b5b4
    ldr      x8, [x24, #0x10]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x60]
    mov      x19, #0
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x338]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x3e0]
    stp      x8, x9, [x29, #-0x80]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x5a0]
    stur     x8, [x29, #-0x88]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0xde0]
    stur     x8, [x29, #-0xc0]
    ldr      x8, [x24, #0x10]
    ldr      x8, [x8]
    ldur     x9, [x29, #-0x60]
    cmp      x8, x9
    b.eq     #0x12b488
    ldur     x0, [x29, #-0x70]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x24, #8]
    ldr      x21, [x8, x19, lsl #3]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    cbz      x23, #0x12b544
    mov      x0, x21
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x12b544
    mov      x0, x21
    bl       #0x4617a4 // _NSSelectorFromString
    mov      x22, x0
    mov      x0, x23
    ldur     x1, [x29, #-0x80]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x12b544
    mov      x0, x23
    ldur     x1, [x29, #-0x88]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    cbz      x0, #0x12b544
    mov      x0, x20
    ldur     x1, [x29, #-0xc0]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #3
    b.eq     #0x12b528
    cmp      x0, #2
    b.ne     #0x12b53c
    mov      x0, x23
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    b        #0x12b5ec
    mov      x0, x23
    mov      x1, x22
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    b        #0x12b5ec
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    add      x19, x19, #1
    ldur     x8, [x29, #-0x68]
    cmp      x8, x19
    b.ne     #0x12b46c
    b        #0x12b588
    b        #0x12b574
    cmp      w1, #1
    b.ne     #0x12b6a4
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    b        #0x12b544
    ldur     x0, [x29, #-0x70]
    ldur     x20, [x29, #-0xd8]
    mov      x1, x20
    mov      x2, x24
    ldur     x3, [x29, #-0x90]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    ldur     x19, [x29, #-0x98]
    ldur     x21, [x29, #-0xe0]
    stur     x0, [x29, #-0x68]
    cbnz     x0, #0x12b43c
    ldur     x0, [x29, #-0x70]
    bl       #0x461c9c // _objc_release
    ldp      x0, x22, [x29, #-0xd0]
    add      x22, x22, #1
    cmp      x22, x0
    b.ne     #0x12b3dc
    mov      x0, x26
    mov      x1, x20
    mov      x2, x19
    ldur     x3, [x29, #-0xa0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbnz     x0, #0x12b3d4
    b        #0x12b614
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x70]
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x70]
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldp      x27, x23, [x29, #-0xb0]
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x12b6a0
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail
    bl       #0x461894 // __Unwind_Resume

// -[WCLGChatBottomSMSProxySendTarget wclg_smsMoreTapped:] IMP=0x12B6A8 bounds=0x12B6A8-0x12B7B4
loc_12B6A8:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x1, #0x4ef000
    add      x1, x1, #0xe68
    mov      x0, x19
    bl       #0x461c3c // _objc_getAssociatedObject
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    cbz      x0, #0x12b734
    mov      x0, x20
    bl       #0x1facf8
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xd80]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    cbz      x21, #0x12b728
    mov      w1, #1
    bl       #0x1fe08c
    mov      x0, x19
    bl       #0x1f90b0
    b        #0x12b798
    mov      x1, x19
    bl       #0x1fc698
    tbnz     w0, #0, #0x12b798
    adrp     x1, #0x4ef000
    add      x1, x1, #0xe70
    mov      x0, x19
    bl       #0x461c3c // _objc_getAssociatedObject
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x150]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x12b790
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xd88]
    mov      x0, x21
    mov      w2, #0x40
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGChatBottomSMSProxySendTarget wclg_smsEmojiTapped:] IMP=0x12B7B4 bounds=0x12B7B4-0x12B7F0
loc_12B7B4:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x0, x2
    adrp     x1, #0x4ef000
    add      x1, x1, #0xe78
    bl       #0x461c3c // _objc_getAssociatedObject
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x12b7f0
    mov      x0, x19
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c9c // _objc_release

// -[WCLGChatBottomSMSProxySendTarget wclg_smsVoiceTapped:] IMP=0x12B838 bounds=0x12B838-0x12B874
loc_12B838:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x0, x2
    adrp     x1, #0x4ef000
    add      x1, x1, #0xe80
    bl       #0x461c3c // _objc_getAssociatedObject
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x12b7f0
    mov      x0, x19
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c9c // _objc_release
