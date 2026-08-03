// Exact ARM64 listing for WCLGChatTopMorphHostView

// -[WCLGChatTopMorphHostView initWithFrame:] IMP=0x2344CC bounds=0x2344CC-0x2348A8
loc_2344CC:
    adrp     x8, #0x57f000
    add      x8, x8, #0x580
    ldar     w9, [x8]
    cbnz     w9, #0x234608
    adrp     x9, #0x51e000
    add      x9, x9, #0x980
    ldrb     w10, [x9]
    mov      w11, #0xd1
    eor      w11, w10, w11
    adrp     x10, #0x51e000
    add      x10, x10, #0x9a0
    strb     w11, [x10]
    ldrb     w11, [x9, #1]
    mov      w12, #0x1b
    eor      w11, w11, w12
    strb     w11, [x10, #1]
    ldrb     w11, [x9, #2]
    eor      w11, w11, #0x1e
    strb     w11, [x10, #2]
    ldrb     w11, [x9, #3]
    eor      w11, w11, #0x38
    strb     w11, [x10, #3]
    ldrb     w11, [x9, #4]
    mov      w13, #0xc9
    eor      w11, w11, w13
    strb     w11, [x10, #4]
    ldrb     w11, [x9, #5]
    mov      w13, #0x32
    eor      w11, w11, w13
    strb     w11, [x10, #5]
    ldrb     w11, [x9, #6]
    mov      w13, #0xb
    eor      w11, w11, w13
    strb     w11, [x10, #6]
    ldrb     w11, [x9, #7]
    eor      w11, w11, #0x99999999
    strb     w11, [x10, #7]
    ldrb     w11, [x9, #8]
    mov      w13, #0xa3
    eor      w11, w11, w13
    strb     w11, [x10, #8]
    ldrb     w11, [x9, #9]
    mov      w13, #0xda
    eor      w11, w11, w13
    strb     w11, [x10, #9]
    ldrb     w11, [x9, #0xa]
    mov      w13, #0x94
    eor      w11, w11, w13
    strb     w11, [x10, #0xa]
    ldrb     w11, [x9, #0xb]
    eor      w11, w11, #0xe
    strb     w11, [x10, #0xb]
    ldrb     w11, [x9, #0xc]
    mov      w13, #0xd4
    eor      w11, w11, w13
    strb     w11, [x10, #0xc]
    ldrb     w11, [x9, #0xd]
    eor      w11, w11, #2
    strb     w11, [x10, #0xd]
    ldrb     w11, [x9, #0xe]
    eor      w11, w11, w12
    strb     w11, [x10, #0xe]
    ldrb     w11, [x9, #0xf]
    eor      w11, w11, #0xfffffff7
    strb     w11, [x10, #0xf]
    ldrb     w11, [x9, #0x10]
    eor      w11, w11, #0xc
    strb     w11, [x10, #0x10]
    ldrb     w11, [x9, #0x11]
    mov      w12, #0x50
    eor      w11, w11, w12
    strb     w11, [x10, #0x11]
    ldrb     w11, [x9, #0x12]
    mov      w12, #0xa7
    eor      w11, w11, w12
    strb     w11, [x10, #0x12]
    ldrb     w9, [x9, #0x13]
    eor      w9, w9, #0xffffffef
    strb     w9, [x10, #0x13]
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      w9, #1
    stlr     w9, [x8]
    mov      x9, sp
    sub      x8, x9, #0x10
    mov      sp, x8
    adrp     x10, #0x4c4000
    ldr      x10, [x10, #0x740]
    stp      x0, x10, [x9, #-0x10]
    adrp     x9, #0x4be000
    ldr      x22, [x9, #0xb38]
    mov      x0, x8
    mov      x1, x22
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x19, x0
    cbz      x0, #0x23488c
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x348]
    adrp     x2, #0x51e000
    add      x2, x2, #0x9e0
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x350]
    mov      x0, x19
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x320]
    ldr      x2, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x2b0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x24, #0x4c4000
    ldr      x0, [x24, #0x90]
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0xab8]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x460]
    mov      x0, x19
    mov      x1, x21
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x690]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461ba0 // _objc_alloc
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, #4.50000000
    fmov     d5, #4.50000000
    bl       #0x461714 // _CGRectInset
    mov      x0, x23
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x23, [x8, #0xa00]
    ldr      x8, [x19, x23]
    str      x0, [x19, x23]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x23]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x430]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x24, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x2f8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x0, [x19, x23]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc40]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x24, #0x90]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x19, x23]
    mov      x1, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x2, [x19, x23]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x3f8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x3, [x8, #0x480]
    adrp     x8, #0x4bf000
    ldr      x20, [x8, #0x440]
    mov      x1, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x22, [x8, #0x450]
    mov      x0, x19
    mov      x1, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x400]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x3, [x8, #0x300]
    mov      x1, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x308]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x488]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x488]
    mov      x8, #0x4054000000000000
    fmov     d0, x8
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    mov      x1, x22
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    sub      sp, x29, #0x30
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    ret      

// -[WCLGChatTopMorphHostView updateChrome] IMP=0x2348A8 bounds=0x2348A8-0x234F14
loc_2348A8:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x0
    adrp     x8, #0x57f000
    add      x8, x8, #0x584
    ldar     w9, [x8]
    cbnz     w9, #0x234a50
    adrp     x9, #0x51e000
    add      x9, x9, #0xa00
    ldrh     w10, [x9]
    mov      w11, #0xfe7b
    adrp     x12, #0x51e000
    add      x12, x12, #0xa06
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0xdd59
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0xa16a
    eor      w9, w9, w10
    strh     w9, [x12, #4]
    adrp     x9, #0x51e000
    add      x9, x9, #0x1e0
    ldrh     w10, [x9]
    mov      w11, #0x9675
    eor      w10, w10, w11
    adrp     x11, #0x51e000
    add      x11, x11, #0x1ee
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x3d21
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x8aab
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x5fb9
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0xf75
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0x1053
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w9, [x9, #0xc]
    mov      w10, #0x3c1c
    eor      w9, w9, w10
    strh     w9, [x11, #0xc]
    adrp     x9, #0x51e000
    add      x9, x9, #0x1fc
    ldrh     w10, [x9]
    mov      w11, #0xde95
    adrp     x12, #0x51e000
    add      x12, x12, #0x206
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x1584
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x88b1
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0xe468
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xd5e6
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    adrp     x9, #0x51e000
    add      x9, x9, #0x210
    ldrh     w10, [x9]
    mov      w11, #0xef32
    adrp     x12, #0x51e000
    add      x12, x12, #0x21a
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x218a
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x573c
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x8c5b
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xe36b
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x490]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x234ae4
    adrp     x8, #0x583000
    add      x8, x8, #0x60
    ldr      x8, [x8]
    mov      w9, #0x4240
    movk     w9, #0xf, lsl #16
    adrp     x10, #0x57f000
    ldr      x10, [x10, #0x508]
    madd     x21, x8, x9, x10
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x498]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    cbz      x0, #0x234c64
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4a0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, x21
    b.ne     #0x234c64
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    b        #0x234c98
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x2f8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x20, [x8, #0x4b8]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc40]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0x4c0]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #25.00000000
    mov      w1, #1
    bl       #0x233754
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x430]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #2
    mov      w8, #2
    csel     x8, x0, x8, lo
    cmp      x0, #0
    csel     x8, xzr, x8, lt
    adrp     x9, #0x4a2000
    add      x9, x9, #0xbb0
    ldr      x2, [x9, x8, lsl #3]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xeb0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e8]
    mov      x0, x19
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x68]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    bl       #0x234f14
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cbz      x20, #0x234db4
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461c9c // _objc_release
    cmp      x20, x22
    b.eq     #0x234cf0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4a8]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4b0]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0x4b8]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x430]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc40]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    b        #0x234ecc
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x2f8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0x4b8]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc40]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4c0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #25.00000000
    mov      w1, #1
    bl       #0x233754
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x430]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xeb0]
    adrp     x2, #0x51e000
    add      x2, x2, #0xa30
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461c9c // _objc_release

// -[WCLGChatTopMorphHostView layoutSubviews] IMP=0x235148 bounds=0x235148-0x23544C
loc_235148:
    sub      sp, sp, #0x70
    stp      d11, d10, [sp, #0x10]
    stp      d9, d8, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x740]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x490]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x20, [x8, #0x4b8]
    cbz      w0, #0x235354
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb98]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cbz      x0, #0x23534c
    mov      x22, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc60]
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cbz      w24, #0x235354
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x4d8]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d2
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fcmp     d8, d3
    fcsel    d0, d8, d3, mi
    adrp     x8, #0x523000
    add      x8, x8, #0x258
    ldr      x8, [x8]
    scvtf    d1, x8
    mov      x8, #0x4059000000000000
    fmov     d2, x8
    fdiv     d1, d1, d2
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x3e8]
    fmul     d1, d1, d2
    fmov     d2, #1.00000000
    fminnm   d1, d1, d2
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x3e0]
    fmaxnm   d1, d1, d2
    fmul     d0, d0, d1
    frinta   d8, d0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fsub     d0, d2, d8
    fmov     d11, #0.50000000
    fmul     d0, d0, d11
    frinta   d9, d0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fsub     d0, d3, d8
    fmul     d0, d0, d11
    frinta   d10, d0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    fmov     d0, d9
    fmov     d1, d10
    fmov     d2, d8
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    fmul     d8, d8, d11
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
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
    b        #0x235424
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, xzr
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4c0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    fmov     d0, #2.00000000
    fmov     d1, #4.50000000
    fcsel    d8, d1, d0, gt
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, d8
    fmov     d5, d8
    bl       #0x461714 // _CGRectInset
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    ldp      d11, d10, [sp, #0x10]
    add      sp, sp, #0x70
    ret      

// -[WCLGChatTopMorphHostView traitCollectionDidChange:] IMP=0x23544C bounds=0x23544C-0x2354FC
loc_23544C:
    sub      sp, sp, #0x40
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x20, x2
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x740]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x398]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, sp
    mov      x1, x21
    mov      x2, x20
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3f0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x408]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cbz      w22, #0x2354e8
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4c8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    add      sp, sp, #0x40
    ret      

// -[WCLGChatTopMorphHostView handleTap:] IMP=0x2354FC bounds=0x2354FC-0x2355EC
loc_2354FC:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x3d0]
    mov      x0, x2
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #3
    b.ne     #0x2355dc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x2355dc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x2355dc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x490]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x2355dc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4e0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2355dc
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x68]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4c0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x450]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x2355ec
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    ret      

// -[WCLGChatTopMorphHostView menuContainerView] IMP=0x235AB8 bounds=0x235AB8-0x235B98
loc_235AB8:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x68]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x3d8]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4a8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    cbz      x0, #0x235b34
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x22, x21
    b        #0x235b68
    mov      x0, x22
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGChatTopMorphHostView showMenuFromHost] IMP=0x235B98 bounds=0x235B98-0x235F80
loc_235B98:
    sub      sp, sp, #0x140
    stp      d13, d12, [sp, #0xc0]
    stp      d11, d10, [sp, #0xd0]
    stp      d9, d8, [sp, #0xe0]
    stp      x26, x25, [sp, #0xf0]
    stp      x24, x23, [sp, #0x100]
    stp      x22, x21, [sp, #0x110]
    stp      x20, x19, [sp, #0x120]
    stp      x29, x30, [sp, #0x130]
    add      x29, sp, #0x130
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4d0]
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x235f38
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4e8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cbz      x0, #0x235f30
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xae0]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0x450]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    bl       #0x23287c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    ucvtf    d0, x0
    mov      x8, #0x4046000000000000
    fmov     d1, x8
    fmul     d12, d0, d1
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616c0 // _CGRectGetMaxX
    adrp     x8, #0x491000
    ldr      d1, [x8, #0xb50]
    fadd     d13, d0, d1
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616cc // _CGRectGetMaxY
    fmov     d1, #6.00000000
    fadd     d8, d0, d1
    fmov     d0, #8.00000000
    fcmp     d13, d0
    fcsel    d9, d0, d13, mi
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x430]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0xa68]
    fmov     d0, d9
    fmov     d1, d8
    fmov     d3, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x22, [x8, #0x68]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x2c0]
    mov      x0, x21
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4f0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    sub      x0, x29, #0x78
    mov      x1, x20
    bl       #0x461c54 // _objc_initWeak
    adrp     x25, #0x4a0000
    ldr      x25, [x25, #0x748]
    str      x25, [sp, #0x90]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    adrp     x8, #0x235000
    add      x8, x8, #0xf80
    str      d8, [sp, #0x98]
    adrp     x9, #0x4a2000
    add      x9, x9, #0xad8
    stp      x8, x9, [sp, #0xa0]
    add      x24, sp, #0x90
    add      x0, x24, #0x20
    sub      x1, x29, #0x78
    bl       #0x461c00 // _objc_copyWeak
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x500]
    add      x2, sp, #0x90
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x508]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9c8]
    fmov     d0, xzr
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x4d8]
    add      x8, sp, #0x60
    fmov     d1, d0
    bl       #0x461540 // _CGAffineTransformMakeScale
    ldp      q0, q1, [sp, #0x60]
    stp      q0, q1, [sp, #0x30]
    ldr      q0, [sp, #0x80]
    str      q0, [sp, #0x50]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6c8]
    add      x2, sp, #0x30
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x2c8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x588]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9d0]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x510]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x518]
    mov      x0, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x51e000
    ldr      x1, [x8, #0x180]
    mov      x2, x21
    mov      w3, #1
    bl       #0x461ce4 // _objc_setAssociatedObject
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x20, [x8, #0x78]
    str      x25, [sp, #8]
    str      d8, [sp, #0x10]
    adrp     x8, #0x236000
    add      x8, x8, #0x28
    adrp     x9, #0x4a1000
    add      x9, x9, #0xa00
    stp      x8, x9, [sp, #0x18]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    str      x21, [sp, #0x28]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xe60]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x418]
    fmov     d1, xzr
    add      x3, sp, #8
    mov      x0, x20
    mov      w2, #0x20000
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    add      x0, x24, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    sub      x0, x29, #0x78
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x130]
    ldp      x20, x19, [sp, #0x120]
    ldp      x22, x21, [sp, #0x110]
    ldp      x24, x23, [sp, #0x100]
    ldp      x26, x25, [sp, #0xf0]
    ldp      d9, d8, [sp, #0xe0]
    ldp      d11, d10, [sp, #0xd0]
    ldp      d13, d12, [sp, #0xc0]
    add      sp, sp, #0x140
    ret      
    b        #0x235f64
    mov      x19, x0
    add      x0, x24, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    sub      x0, x29, #0x78
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGChatTopMorphHostView hideMenu] IMP=0x23608C bounds=0x23608C-0x2361EC
loc_23608C:
    sub      sp, sp, #0x90
    stp      d9, d8, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x520]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cbz      x0, #0x2361cc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x518]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x528]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x510]
    mov      x0, x20
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x68]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x51e000
    ldr      x1, [x8, #0x180]
    mov      x2, #0
    mov      x3, #0
    bl       #0x461ce4 // _objc_setAssociatedObject
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x20, [x8, #0x78]
    adrp     x21, #0x4a0000
    ldr      x21, [x21, #0x748]
    str      x21, [sp, #0x28]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    str      d8, [sp, #0x30]
    adrp     x8, #0x236000
    add      x8, x8, #0x1ec
    adrp     x9, #0x4a1000
    add      x9, x9, #0xa00
    stp      x8, x9, [sp, #0x38]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [sp, #0x48]
    str      x21, [sp]
    str      d8, [sp, #8]
    adrp     x8, #0x236000
    add      x8, x8, #0x25c
    adrp     x9, #0x4a2000
    add      x9, x9, #0xd0
    stp      x8, x9, [sp, #0x10]
    bl       #0x461ca8 // _objc_retain
    str      x19, [sp, #0x20]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x530]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3b0]
    add      x2, sp, #0x28
    mov      x3, sp
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x48]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      d9, d8, [sp, #0x50]
    add      sp, sp, #0x90
    ret      

// -[WCLGChatTopMorphHostView handleLongPress:] IMP=0x23626C bounds=0x23626C-0x2364C4
loc_23626C:
    stp      d9, d8, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x490]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x2364a8
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x3d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #3
    b.gt     #0x236334
    cmp      x0, #1
    b.eq     #0x236354
    cmp      x0, #2
    b.eq     #0x236378
    cmp      x0, #3
    b.ne     #0x2364a8
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0x520]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x24, #0x7fffffffffffffff
    cbz      x0, #0x236440
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x468]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    b        #0x236444
    sub      x8, x0, #4
    cmp      x8, #2
    b.hs     #0x2364a8
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4f8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    b        #0x2364a8
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x528]
    mov      x0, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x538]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0x520]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461c9c // _objc_release
    cbz      x22, #0x2364a8
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x458]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x470]
    fmov     d0, d8
    fmov     d1, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x438]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    b        #0x2364a0
    mov      x21, #0x7fffffffffffffff
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x4f8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cmp      x21, x24
    b.eq     #0x2364a8
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x68]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x450]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x22
    mov      x1, x21
    bl       #0x2355ec
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      d9, d8, [sp], #0x50
    b        #0x461c9c // _objc_release

// -[WCLGChatTopMorphHostView controller] IMP=0x2364C4 bounds=0x2364C4-0x2364E4
loc_2364C4:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa04]
    add      x0, x0, x8
    bl       #0x461c60 // _objc_loadWeakRetained
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGChatTopMorphHostView setController:] IMP=0x2364E4 bounds=0x2364E4-0x2364F8
loc_2364E4:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa04]
    add      x0, x0, x8
    b        #0x461d08 // _objc_storeWeak

// -[WCLGChatTopMorphHostView avatarOnlyMode] IMP=0x2364F8 bounds=0x2364F8-0x236508
loc_2364F8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa08]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGChatTopMorphHostView setAvatarOnlyMode:] IMP=0x236508 bounds=0x236508-0x236518
loc_236508:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa08]
    strb     w2, [x0, x8]
    ret      

// -[WCLGChatTopMorphHostView cachedAvatarImage] IMP=0x236518 bounds=0x236518-0x236528
loc_236518:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa0c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGChatTopMorphHostView setCachedAvatarImage:] IMP=0x236528 bounds=0x236528-0x23653C
loc_236528:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa0c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGChatTopMorphHostView cachedAvatarToken] IMP=0x23653C bounds=0x23653C-0x23654C
loc_23653C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa10]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGChatTopMorphHostView setCachedAvatarToken:] IMP=0x23654C bounds=0x23654C-0x23655C
loc_23654C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa10]
    str      x2, [x0, x8]
    ret      

// -[WCLGChatTopMorphHostView isGroup] IMP=0x23655C bounds=0x23655C-0x23656C
loc_23655C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa14]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGChatTopMorphHostView setIsGroup:] IMP=0x23656C bounds=0x23656C-0x23657C
loc_23656C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa14]
    strb     w2, [x0, x8]
    ret      

// -[WCLGChatTopMorphHostView defaultAction] IMP=0x23657C bounds=0x23657C-0x23658C
loc_23657C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa18]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGChatTopMorphHostView setDefaultAction:] IMP=0x23658C bounds=0x23658C-0x23659C
loc_23658C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa18]
    str      x2, [x0, x8]
    ret      

// -[WCLGChatTopMorphHostView ready] IMP=0x23659C bounds=0x23659C-0x2365AC
loc_23659C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa1c]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGChatTopMorphHostView setReady:] IMP=0x2365AC bounds=0x2365AC-0x2365BC
loc_2365AC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa1c]
    strb     w2, [x0, x8]
    ret      

// -[WCLGChatTopMorphHostView iconView] IMP=0x2365BC bounds=0x2365BC-0x2365CC
loc_2365BC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa00]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGChatTopMorphHostView setIconView:] IMP=0x2365CC bounds=0x2365CC-0x2365E0
loc_2365CC:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa00]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGChatTopMorphHostView menuView] IMP=0x2365E0 bounds=0x2365E0-0x2365F0
loc_2365E0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa20]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGChatTopMorphHostView setMenuView:] IMP=0x2365F0 bounds=0x2365F0-0x236604
loc_2365F0:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa20]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGChatTopMorphHostView menuVisible] IMP=0x236604 bounds=0x236604-0x236614
loc_236604:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa24]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGChatTopMorphHostView setMenuVisible:] IMP=0x236614 bounds=0x236614-0x236624
loc_236614:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa24]
    strb     w2, [x0, x8]
    ret      

// -[WCLGChatTopMorphHostView longPressActive] IMP=0x236624 bounds=0x236624-0x236634
loc_236624:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa28]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGChatTopMorphHostView setLongPressActive:] IMP=0x236634 bounds=0x236634-0x236644
loc_236634:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa28]
    strb     w2, [x0, x8]
    ret      

// -[WCLGChatTopMorphHostView .cxx_destruct] IMP=0x236644 bounds=0x236644-0x2366A8
loc_236644:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa20]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa00]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa0c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xa04]
    add      x0, x19, x8
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c0c // _objc_destroyWeak
