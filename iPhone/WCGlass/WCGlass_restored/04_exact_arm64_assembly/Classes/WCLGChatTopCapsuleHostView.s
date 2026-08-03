// Exact ARM64 listing for WCLGChatTopCapsuleHostView

// -[WCLGChatTopCapsuleHostView initWithFrame:] IMP=0x225E8C bounds=0x225E8C-0x2263E8
loc_225E8C:
    adrp     x8, #0x57f000
    add      x8, x8, #0x384
    ldar     w9, [x8]
    cbnz     w9, #0x22605c
    adrp     x9, #0x51c000
    add      x9, x9, #0xfe0
    ldrb     w10, [x9]
    mov      w11, #0x6f
    eor      w11, w10, w11
    adrp     x10, #0x51d000
    add      x10, x10, #0
    strb     w11, [x10]
    ldrb     w11, [x9, #1]
    mov      w12, #0xda
    eor      w11, w11, w12
    strb     w11, [x10, #1]
    ldrb     w11, [x9, #2]
    eor      w11, w11, #0xcccccccc
    strb     w11, [x10, #2]
    ldrb     w11, [x9, #3]
    mov      w12, #0x42
    eor      w11, w11, w12
    strb     w11, [x10, #3]
    ldrb     w11, [x9, #4]
    mov      w12, #0x19
    eor      w11, w11, w12
    strb     w11, [x10, #4]
    ldrb     w11, [x9, #5]
    eor      w11, w11, #0xffffffdf
    strb     w11, [x10, #5]
    ldrb     w11, [x9, #6]
    mov      w12, #0x57
    eor      w11, w11, w12
    strb     w11, [x10, #6]
    ldrb     w11, [x9, #7]
    eor      w11, w11, #0x3f
    strb     w11, [x10, #7]
    ldrb     w11, [x9, #8]
    mov      w12, #0x65
    eor      w11, w11, w12
    strb     w11, [x10, #8]
    ldrb     w11, [x9, #9]
    eor      w11, w11, #0x1e
    strb     w11, [x10, #9]
    ldrb     w11, [x9, #0xa]
    eor      w11, w11, #0xffffffbf
    strb     w11, [x10, #0xa]
    ldrb     w11, [x9, #0xb]
    eor      w11, w11, #0x30
    strb     w11, [x10, #0xb]
    ldrb     w11, [x9, #0xc]
    mov      w12, #0xea
    eor      w11, w11, w12
    strb     w11, [x10, #0xc]
    ldrb     w11, [x9, #0xd]
    mov      w12, #0x95
    eor      w11, w11, w12
    strb     w11, [x10, #0xd]
    ldrb     w11, [x9, #0xe]
    eor      w11, w11, #0x80
    strb     w11, [x10, #0xe]
    ldrb     w11, [x9, #0xf]
    mov      w12, #0xd5
    eor      w11, w11, w12
    strb     w11, [x10, #0xf]
    ldrb     w11, [x9, #0x10]
    eor      w11, w11, #0xffffffef
    strb     w11, [x10, #0x10]
    ldrb     w11, [x9, #0x11]
    mov      w12, #0xc9
    eor      w11, w11, w12
    strb     w11, [x10, #0x11]
    ldrb     w11, [x9, #0x12]
    eor      w11, w11, #0x1e
    strb     w11, [x10, #0x12]
    ldrb     w11, [x9, #0x13]
    eor      w11, w11, #0x7c
    strb     w11, [x10, #0x13]
    ldrb     w11, [x9, #0x14]
    mov      w12, #0x46
    eor      w11, w11, w12
    strb     w11, [x10, #0x14]
    ldrb     w11, [x9, #0x15]
    eor      w11, w11, #3
    strb     w11, [x10, #0x15]
    ldrb     w11, [x9, #0x16]
    mov      w12, #0xad
    eor      w11, w11, w12
    strb     w11, [x10, #0x16]
    ldrb     w11, [x9, #0x17]
    mov      w12, #0x4f
    eor      w11, w11, w12
    strb     w11, [x10, #0x17]
    ldrb     w11, [x9, #0x18]
    mov      w12, #0x73
    eor      w11, w11, w12
    strb     w11, [x10, #0x18]
    ldrb     w9, [x9, #0x19]
    eor      w9, w9, #0x70
    strb     w9, [x10, #0x19]
    adrp     x9, #0x51c000
    add      x9, x9, #0xfc8
    ldrh     w10, [x9]
    mov      w11, #0xd91a
    eor      w10, w10, w11
    adrp     x11, #0x51c000
    add      x11, x11, #0xfce
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xbfab
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x76f4
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      w9, #1
    stlr     w9, [x8]
    mov      x9, sp
    sub      x8, x9, #0x10
    mov      sp, x8
    adrp     x10, #0x4c4000
    ldr      x10, [x10, #0x718]
    stp      x0, x10, [x9, #-0x10]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0xb38]
    mov      x0, x8
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x19, x0
    cbz      x0, #0x2263c4
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x348]
    adrp     x2, #0x51d000
    add      x2, x2, #0x80
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
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xeb0]
    adrp     x2, #0x51d000
    add      x2, x2, #0x40
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x26, #0x4c4000
    ldr      x0, [x26, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
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
    ldr      x1, [x8, #0x438]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x25, #0x4c4000
    ldr      x0, [x25, #0x158]
    bl       #0x461bac // _objc_alloc_init
    adrp     x8, #0x4c4000
    ldrsw    x21, [x8, #0x9b4]
    ldr      x8, [x19, x21]
    str      x0, [x19, x21]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x27, #0x4c4000
    ldr      x0, [x27, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x378]
    ldr      d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    fmov     d0, #15.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x19, x21]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xec8]
    mov      x1, x22
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x2f8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x19, x21]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xea8]
    mov      x1, x23
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x21]
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x440]
    mov      x1, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x21]
    adrp     x8, #0x4bf000
    ldr      x24, [x8, #0xef0]
    mov      x1, x24
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x21]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xb40]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x25, #0x158]
    bl       #0x461bac // _objc_alloc_init
    adrp     x8, #0x4c4000
    ldrsw    x28, [x8, #0x9b8]
    ldr      x8, [x19, x28]
    str      x0, [x19, x28]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x0, [x27, #0x218]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x800]
    fmov     d0, #12.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x0, [x19, x28]
    mov      x1, x22
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc18]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x0, [x19, x28]
    mov      x1, x23
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x28]
    mov      x1, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x28]
    mov      x1, x24
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x28]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461bac // _objc_alloc_init
    adrp     x8, #0x4c4000
    ldrsw    x22, [x8, #0x9bc]
    ldr      x8, [x19, x22]
    str      x0, [x19, x22]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x22]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x430]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x22]
    mov      x1, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x22]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x22]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x3f8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x3, [x8, #0x358]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x440]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x450]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      

// -[WCLGChatTopCapsuleHostView setAvatarView:] IMP=0x2263E8 bounds=0x2263E8-0x226484
loc_2263E8:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldrsw    x21, [x8, #0x9c0]
    ldr      x0, [x20, x21]
    cmp      x0, x19
    b.eq     #0x226470
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb30]
    bl       #0x461c6c // _objc_msgSend
    add      x0, x20, x21
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    cbz      x19, #0x226460
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGChatTopCapsuleHostView layoutSubviews] IMP=0x226484 bounds=0x226484-0x226918
loc_226484:
    sub      sp, sp, #0xb0
    stp      d13, d12, [sp, #0x30]
    stp      d11, d10, [sp, #0x40]
    stp      d9, d8, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    str      x8, [sp, #0x28]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x718]
    stp      x0, x8, [sp, #8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
    add      x0, sp, #8
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x4d8]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d2
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #1.00000000
    fcmp     d10, d0
    fccmp    d3, d0, #8, pl
    b.mi     #0x2268d4
    fmov     d8, d3
    fmov     d0, #-2.00000000
    fadd     d0, d3, d0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9c4]
    ldrb     w8, [x19, x8]
    frinta   d9, d0
    adrp     x9, #0x4c4000
    ldrsw    x21, [x9, #0x9c0]
    ldr      x0, [x19, x21]
    cmp      w8, #1
    b.ne     #0x2265d4
    cbz      x0, #0x226674
    fsub     d0, d8, d9
    fmov     d11, #0.50000000
    fmul     d0, d0, d11
    frinta   d1, d0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    fmov     d12, #1.00000000
    fmov     d0, #1.00000000
    fmov     d2, d9
    fmov     d3, d9
    bl       #0x461c6c // _objc_msgSend
    fmul     d11, d9, d11
    ldr      x0, [x19, x21]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x21]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, x21]
    cbz      x8, #0x226674
    fadd     d0, d9, d12
    fmov     d1, #6.00000000
    fadd     d9, d0, d1
    b        #0x226678
    cbz      x0, #0x226664
    fsub     d0, d10, d9
    fmov     d1, #-1.00000000
    fadd     d11, d0, d1
    fsub     d0, d8, d9
    fmov     d12, #0.50000000
    fmul     d0, d0, d12
    frinta   d1, d0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    fmov     d0, d11
    fmov     d2, d9
    fmov     d3, d9
    bl       #0x461c6c // _objc_msgSend
    fmul     d9, d9, d12
    ldr      x0, [x19, x21]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x21]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, x21]
    cmp      x8, #0
    fcsel    d10, d10, d11, eq
    fmov     d0, #-6.00000000
    fadd     d0, d10, d0
    fmov     d9, #12.00000000
    b        #0x226680
    fmov     d9, #12.00000000
    fmov     d0, #-10.00000000
    fadd     d0, d10, d0
    fsub     d0, d0, d9
    fmov     d11, #1.00000000
    fmaxnm   d10, d0, d11
    adrp     x8, #0x4c4000
    ldrsw    x26, [x8, #0x9b8]
    ldr      x0, [x19, x26]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x7a0]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldrsw    x25, [x8, #0x9bc]
    ldr      x0, [x19, x25]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb98]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    cmp      x0, #0
    cset     w24, eq
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x25]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x9b0]
    mov      x1, x21
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x26]
    cbnz     x23, #0x226764
    cbnz     x20, #0x226764
    mov      x1, x21
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #-20.00000000
    fadd     d0, d8, d0
    fmov     d1, #0.50000000
    fmul     d0, d0, d1
    frinta   d1, d0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9b4]
    ldr      x0, [x19, x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    fmov     d3, #20.00000000
    fmov     d0, d9
    fmov     d2, d10
    b        #0x2268d0
    cmp      x23, #0
    cset     w2, eq
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #-17.00000000
    fmov     d12, #0.50000000
    fmadd    d0, d8, d12, d0
    frinta   d1, d0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9b4]
    ldr      x0, [x19, x8]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x678]
    fmov     d3, #17.00000000
    mov      x1, x21
    fmov     d0, d9
    fmov     d2, d10
    bl       #0x461c6c // _objc_msgSend
    fmadd    d0, d8, d12, d11
    frinta   d8, d0
    cbz      x23, #0x2268a4
    ldr      x0, [x19, x26]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x308]
    ldr      x8, [x8]
    str      x8, [sp, #0x18]
    ldr      x0, [x19, x26]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xeb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    str      x0, [sp, #0x20]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    add      x2, sp, #0x20
    add      x3, sp, #0x18
    mov      w4, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x238]
    mov      x0, x22
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    frintp   d11, d0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cmp      x20, #0
    fmov     d0, #18.00000000
    fmov     d1, xzr
    fcsel    d0, d1, d0, eq
    fsub     d0, d10, d0
    fcmp     d11, d0
    fcsel    d10, d11, d0, mi
    ldr      x0, [x19, x26]
    fmov     d3, #14.00000000
    mov      x1, x21
    fmov     d0, d9
    fmov     d1, d8
    fmov     d2, d10
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #4.00000000
    fadd     d0, d10, d0
    cbnz     x20, #0x2268ac
    b        #0x2268d4
    fmov     d0, xzr
    cbz      x20, #0x2268d4
    fadd     d0, d9, d0
    frinta   d0, d0
    fmov     d1, xzr
    fadd     d1, d8, d1
    frinta   d1, d1
    ldr      x0, [x19, x25]
    fmov     d2, #14.00000000
    fmov     d3, #14.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x28]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x226914
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      d9, d8, [sp, #0x50]
    ldp      d11, d10, [sp, #0x40]
    ldp      d13, d12, [sp, #0x30]
    add      sp, sp, #0xb0
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGChatTopCapsuleHostView wclg_handleTap] IMP=0x226918 bounds=0x226918-0x226B04
loc_226918:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cbz      x0, #0x226ae8
    adrp     x8, #0x51c000
    ldr      x1, [x8, #0xfa0]
    mov      x0, x19
    bl       #0x461c3c // _objc_getAssociatedObject
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x328]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x410]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x418]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x226ae0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x330]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x226a08
    mov      x0, x21
    bl       #0x228454
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cbz      x0, #0x226a08
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xd88]
    mov      w2, #0x40
    bl       #0x461c6c // _objc_msgSend
    b        #0x226ad0
    adrp     x8, #0x4c0000
    ldr      x23, [x8, #0x360]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    cbz      x0, #0x226ad0
    adrp     x8, #0x4c0000
    ldr      x24, [x8, #0x368]
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x226ad0
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbz      w26, #0x226ad8
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x4a8]
    mov      x0, x22
    mov      x3, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    b        #0x461c9c // _objc_release

// -[WCLGChatTopCapsuleHostView cachedTitle] IMP=0x226B04 bounds=0x226B04-0x226B14
loc_226B04:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9c8]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGChatTopCapsuleHostView setCachedTitle:] IMP=0x226B14 bounds=0x226B14-0x226B20
loc_226B14:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0x9c8]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGChatTopCapsuleHostView titleLabel] IMP=0x226B20 bounds=0x226B20-0x226B30
loc_226B20:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9b4]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGChatTopCapsuleHostView setTitleLabel:] IMP=0x226B30 bounds=0x226B30-0x226B44
loc_226B30:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9b4]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGChatTopCapsuleHostView subtitleLabel] IMP=0x226B44 bounds=0x226B44-0x226B54
loc_226B44:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9b8]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGChatTopCapsuleHostView setSubtitleLabel:] IMP=0x226B54 bounds=0x226B54-0x226B68
loc_226B54:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9b8]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGChatTopCapsuleHostView subtitleIconView] IMP=0x226B68 bounds=0x226B68-0x226B78
loc_226B68:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9bc]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGChatTopCapsuleHostView setSubtitleIconView:] IMP=0x226B78 bounds=0x226B78-0x226B8C
loc_226B78:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9bc]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGChatTopCapsuleHostView avatarView] IMP=0x226B8C bounds=0x226B8C-0x226B9C
loc_226B8C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9c0]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGChatTopCapsuleHostView controller] IMP=0x226B9C bounds=0x226B9C-0x226BBC
loc_226B9C:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9cc]
    add      x0, x0, x8
    bl       #0x461c60 // _objc_loadWeakRetained
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGChatTopCapsuleHostView setController:] IMP=0x226BBC bounds=0x226BBC-0x226BD0
loc_226BBC:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9cc]
    add      x0, x0, x8
    b        #0x461d08 // _objc_storeWeak

// -[WCLGChatTopCapsuleHostView avatarOnLeft] IMP=0x226BD0 bounds=0x226BD0-0x226BE0
loc_226BD0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9c4]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGChatTopCapsuleHostView setAvatarOnLeft:] IMP=0x226BE0 bounds=0x226BE0-0x226BF0
loc_226BE0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9c4]
    strb     w2, [x0, x8]
    ret      

// -[WCLGChatTopCapsuleHostView .cxx_destruct] IMP=0x226BF0 bounds=0x226BF0-0x226C7C
loc_226BF0:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9cc]
    add      x0, x0, x8
    bl       #0x461c0c // _objc_destroyWeak
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9c0]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9bc]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9b8]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9b4]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9c8]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
