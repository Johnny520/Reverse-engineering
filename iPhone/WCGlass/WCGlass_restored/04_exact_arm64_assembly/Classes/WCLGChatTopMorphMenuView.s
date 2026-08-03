// Exact ARM64 listing for WCLGChatTopMorphMenuView

// -[WCLGChatTopMorphMenuView initWithFrame:] IMP=0x231770 bounds=0x231770-0x231EC0
loc_231770:
    adrp     x8, #0x57f000
    add      x8, x8, #0x51c
    ldar     w9, [x8]
    cbnz     w9, #0x2319d8
    adrp     x9, #0x51e000
    add      x9, x9, #0x310
    ldrb     w10, [x9]
    eor      w11, w10, #6
    adrp     x10, #0x51e000
    add      x10, x10, #0x330
    strb     w11, [x10]
    ldrb     w11, [x9, #1]
    mov      w12, #0x21
    eor      w11, w11, w12
    strb     w11, [x10, #1]
    ldrb     w11, [x9, #2]
    mov      w12, #0xc2
    eor      w11, w11, w12
    strb     w11, [x10, #2]
    ldrb     w11, [x9, #3]
    mov      w12, #0x43
    eor      w11, w11, w12
    strb     w11, [x10, #3]
    ldrb     w11, [x9, #4]
    eor      w11, w11, #0xe
    strb     w11, [x10, #4]
    ldrb     w11, [x9, #5]
    eor      w11, w11, #0xfffffffd
    strb     w11, [x10, #5]
    ldrb     w11, [x9, #6]
    mov      w12, #0x67
    eor      w11, w11, w12
    strb     w11, [x10, #6]
    ldrb     w11, [x9, #7]
    eor      w11, w11, w12
    strb     w11, [x10, #7]
    ldrb     w11, [x9, #8]
    mov      w13, #0xe6
    eor      w11, w11, w13
    strb     w11, [x10, #8]
    ldrb     w11, [x9, #9]
    eor      w11, w11, #0x1c
    strb     w11, [x10, #9]
    ldrb     w11, [x9, #0xa]
    mov      w13, #0x2b
    eor      w11, w11, w13
    strb     w11, [x10, #0xa]
    ldrb     w11, [x9, #0xb]
    mov      w13, #0x8c
    eor      w11, w11, w13
    strb     w11, [x10, #0xb]
    ldrb     w11, [x9, #0xc]
    eor      w11, w11, #0xffffffef
    strb     w11, [x10, #0xc]
    ldrb     w11, [x9, #0xd]
    eor      w11, w11, #0x66666666
    strb     w11, [x10, #0xd]
    ldrb     w11, [x9, #0xe]
    mov      w14, #0xba
    eor      w11, w11, w14
    strb     w11, [x10, #0xe]
    ldrb     w11, [x9, #0xf]
    mov      w14, #0x76
    eor      w11, w11, w14
    strb     w11, [x10, #0xf]
    ldrb     w11, [x9, #0x10]
    mov      w14, #0x2f
    eor      w11, w11, w14
    strb     w11, [x10, #0x10]
    ldrb     w11, [x9, #0x11]
    eor      w11, w11, #0xfffffffb
    strb     w11, [x10, #0x11]
    ldrb     w11, [x9, #0x12]
    eor      w11, w11, #0xfffffff9
    strb     w11, [x10, #0x12]
    ldrb     w11, [x9, #0x13]
    mov      w14, #0x39
    eor      w11, w11, w14
    strb     w11, [x10, #0x13]
    ldrb     w11, [x9, #0x14]
    eor      w11, w11, w13
    strb     w11, [x10, #0x14]
    ldrb     w11, [x9, #0x15]
    eor      w11, w11, #0xcccccccc
    strb     w11, [x10, #0x15]
    ldrb     w11, [x9, #0x16]
    eor      w11, w11, w12
    strb     w11, [x10, #0x16]
    ldrb     w11, [x9, #0x17]
    mov      w12, #0xa5
    eor      w11, w11, w12
    strb     w11, [x10, #0x17]
    ldrb     w9, [x9, #0x18]
    eor      w9, w9, #0x11111111
    strb     w9, [x10, #0x18]
    adrp     x9, #0x51e000
    add      x9, x9, #0x2f0
    ldrb     w10, [x9]
    mov      w11, #0xc5
    eor      w10, w10, w11
    adrp     x11, #0x51e000
    add      x11, x11, #0x2fe
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x32
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x45
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x84
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0xd7
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x4b
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0x4c
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0x3d
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w12, #0x49
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    eor      w10, w10, #0xffffffcf
    strb     w10, [x11, #9]
    ldrb     w10, [x9, #0xa]
    mov      w12, #0x19
    eor      w10, w10, w12
    strb     w10, [x11, #0xa]
    ldrb     w10, [x9, #0xb]
    mov      w12, #0x9e
    eor      w10, w10, w12
    strb     w10, [x11, #0xb]
    ldrb     w10, [x9, #0xc]
    mov      w12, #0xd8
    eor      w10, w10, w12
    strb     w10, [x11, #0xc]
    ldrb     w9, [x9, #0xd]
    mov      w10, #0xb
    eor      w9, w9, w10
    strb     w9, [x11, #0xd]
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
    ldr      x10, [x10, #0x730]
    stp      x0, x10, [x9, #-0x10]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0xb38]
    mov      x0, x8
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x19, x0
    cbz      x0, #0x231e9c
    adrp     x28, #0x4c4000
    ldr      x0, [x28, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x460]
    mov      x0, x19
    mov      x1, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xac8]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xb48]
    fmov     d0, #16.00000000
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x628]
    ldr      x22, [x8]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0xb50]
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldr      x0, [x28, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x450]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac0]
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbc0]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb08]
    adrp     x8, #0x491000
    ldr      s0, [x8, #0xa10]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbc8]
    fmov     d0, #16.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbd0]
    fmov     d0, xzr
    fmov     d1, #8.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x438]
    mov      x0, x19
    mov      x2, #0x7fffffffffffffff
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x348]
    adrp     x2, #0x51e000
    add      x2, x2, #0x3b0
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x148]
    bl       #0x461ba0 // _objc_alloc
    mov      x25, x0
    adrp     x0, #0x51e000
    add      x0, x0, #0x370
    bl       #0x461780 // _NSClassFromString
    cbz      x0, #0x231c9c
    bl       #0x461bac // _objc_alloc_init
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0xc38]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x231cc0
    mov      x0, x26
    mov      x1, x27
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    b        #0x231cc0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x180]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc30]
    mov      w2, #0xd
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbb8]
    mov      x0, x25
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x27, [x8, #0x9e8]
    ldr      x8, [x19, x27]
    str      x0, [x19, x27]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x27]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x27]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x448]
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x27]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    fmov     d0, #16.00000000
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x27]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x27]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3f0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3f8]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x28, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf0]
    cmp      x22, #2
    b.ne     #0x231df0
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3b0]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x430]
    b        #0x231dfc
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x428]
    fmov     d0, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x0, [x19, x27]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xaf0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x1, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x2, [x19, x27]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x3f8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x3, [x8, #0x440]
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

// -[WCLGChatTopMorphMenuView layoutSubviews] IMP=0x231EC0 bounds=0x231EC0-0x231F90
loc_231EC0:
    sub      sp, sp, #0x40
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x730]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4c4000
    ldr      x20, [x8, #0xd8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbd8]
    fmov     d4, #16.00000000
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbe0]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbe8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    add      sp, sp, #0x40
    ret      

// -[WCLGChatTopMorphMenuView reloadRows] IMP=0x231F90 bounds=0x231F90-0x23287C
loc_231F90:
    stp      d15, d14, [sp, #-0xa0]!
    stp      d13, d12, [sp, #0x10]
    stp      d11, d10, [sp, #0x20]
    stp      d9, d8, [sp, #0x30]
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    sub      sp, sp, #0x110
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0xa0]
    adrp     x8, #0x57f000
    add      x8, x8, #0x524
    ldar     w9, [x8]
    cbnz     w9, #0x232124
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
    mov      x8, sp
    sub      x21, x8, #0x40
    mov      sp, x21
    sub      x22, sp, #0x80
    mov      sp, x22
    sub      x28, sp, #0x40
    mov      sp, x28
    sub      x9, sp, #0x80
    sub      x10, x29, #0x98
    stur     x9, [x10, #-0x100]
    mov      sp, x9
    movi     v0.16b, #0
    stp      q0, q0, [x8, #-0x20]
    stp      q0, q0, [x8, #-0x40]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x448]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    sub      x8, x29, #0x90
    stur     x1, [x8, #-0x100]
    mov      x2, x21
    mov      x3, x22
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x232214
    mov      x24, x0
    ldr      x8, [x21, #0x10]
    ldr      x20, [x8]
    adrp     x26, #0x4be000
    mov      x27, #0
    ldr      x25, [x26, #0xb30]
    ldr      x8, [x21, #0x10]
    ldr      x8, [x8]
    cmp      x8, x20
    b.eq     #0x2321d4
    mov      x0, x23
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x21, #8]
    ldr      x0, [x8, x27, lsl #3]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    add      x27, x27, #1
    cmp      x24, x27
    b.ne     #0x2321bc
    mov      x0, x23
    sub      x8, x29, #0x90
    ldur     x1, [x8, #-0x100]
    mov      x2, x21
    mov      x3, x22
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    cbnz     x0, #0x2321b4
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x58
    stur     x0, [x8, #-0x100]
    movi     v0.16b, #0
    stp      q0, q0, [x28]
    stp      q0, q0, [x28, #0x20]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x450]
    mov      x0, x19
    sub      x8, x29, #0x70
    stur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    bl       #0x23287c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x78
    stur     x0, [x8, #-0x100]
    sub      x8, x29, #0x90
    ldur     x1, [x8, #-0x100]
    mov      x2, x28
    sub      x8, x29, #0x98
    ldur     x3, [x8, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xb0]
    cbz      x0, #0x2327dc
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x378]
    ldr      x9, [x28, #0x10]
    ldr      x9, [x9]
    sub      x10, x29, #0x68
    stur     x9, [x10, #-0x100]
    ldr      d8, [x8]
    fmov     d9, xzr
    mov      x8, #0x4046000000000000
    fmov     d10, x8
    adrp     x8, #0x491000
    ldr      d12, [x8, #0x508]
    fmov     d13, #1.00000000
    mov      x8, #-0x3fb5000000000000
    fmov     d14, x8
    mov      x8, #0x4047000000000000
    fmov     d11, x8
    sub      x8, x29, #0x60
    stur     x28, [x8, #-0x100]
    mov      x20, #0
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x4e8]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0x68]
    stp      x8, x9, [x29, #-0xc0]
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0x568]
    sub      x9, x29, #0x80
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x3e0]
    sub      x9, x29, #0x88
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x4d8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xb38]
    stp      x8, x9, [x29, #-0xd0]
    adrp     x8, #0x4bf000
    ldr      x9, [x8, #0xc30]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x9c8]
    stp      x8, x9, [x29, #-0xe0]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x440]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x428]
    stp      x8, x9, [x29, #-0xf0]
    adrp     x8, #0x4bf000
    ldr      x9, [x8, #0x2f8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xc40]
    stp      x8, x9, [x29, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x430]
    sub      x9, x29, #8
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x678]
    sub      x9, x29, #0x10
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xb40]
    sub      x9, x29, #0x18
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0x230]
    sub      x9, x29, #0x20
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xec8]
    sub      x9, x29, #0x28
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xea8]
    sub      x9, x29, #0x30
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x6f8]
    sub      x9, x29, #0x38
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0x458]
    sub      x9, x29, #0x40
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xaf0]
    sub      x9, x29, #0x48
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x830]
    sub      x9, x29, #0x50
    stur     x8, [x9, #-0x100]
    ldr      x8, [x28, #0x10]
    ldr      x8, [x8]
    sub      x9, x29, #0x68
    ldur     x9, [x9, #-0x100]
    cmp      x8, x9
    b.eq     #0x232434
    sub      x8, x29, #0x78
    ldur     x0, [x8, #-0x100]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x28, #8]
    ldr      x0, [x8, x20, lsl #3]
    ldur     x1, [x29, #-0xb8]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #2
    mov      w8, #2
    csel     x8, x0, x8, lo
    cmp      x0, #0
    csel     x24, xzr, x8, lt
    mov      x0, x19
    ldur     x1, [x29, #-0xc0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    cmp      x24, #1
    stur     x20, [x29, #-0xa8]
    b.eq     #0x2324a0
    cbnz     x24, #0x2324bc
    mov      x0, x19
    sub      x8, x29, #0x70
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x1, x0
    mov      x0, x26
    bl       #0x2329d8
    b        #0x2324e0
    mov      x0, x19
    sub      x8, x29, #0x70
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x2324c8
    mov      w25, #0
    b        #0x2324e4
    mov      x0, x26
    bl       #0x232d18
    b        #0x2324e0
    mov      x0, x26
    sub      x8, x29, #0x88
    ldur     x1, [x8, #-0x100]
    sub      x8, x29, #0x80
    ldur     x2, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    mov      x26, x0
    mov      x0, x19
    ldur     x27, [x29, #-0xc8]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, xzr
    mov      x0, x26
    mov      x23, x19
    ldur     x19, [x29, #-0xd0]
    mov      x1, x19
    fmov     d1, d9
    fmov     d3, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    ldur     x1, [x29, #-0xd8]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    cmp      w25, #0
    fcsel    d0, d13, d12, ne
    mov      x0, x26
    ldur     x1, [x29, #-0xe0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    ldur     x1, [x29, #-0xe8]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461ba0 // _objc_alloc
    mov      x25, x0
    fmov     d0, #19.00000000
    mov      x0, x24
    mov      w1, #0
    bl       #0x233754
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x25
    ldur     x1, [x29, #-0xf0]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x22, #0x4c4000
    ldr      x0, [x22, #0x90]
    ldur     x22, [x29, #-0xf8]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x28
    ldur     x1, [x29, #-0x100]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    sub      x8, x29, #8
    ldur     x1, [x8, #-0x100]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #14.00000000
    fmov     d1, #11.00000000
    fmov     d2, #22.00000000
    fmov     d3, #22.00000000
    mov      x0, x28
    sub      x8, x29, #0x10
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    sub      x8, x29, #0x18
    ldur     x21, [x8, #-0x100]
    mov      x1, x21
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x20, x0
    mov      x0, x23
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    fadd     d2, d2, d14
    fmov     d1, xzr
    mov      x0, x20
    mov      x1, x19
    mov      x19, x23
    fmov     d0, d11
    fmov     d3, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    fmov     d0, #15.00000000
    sub      x8, x29, #0x20
    ldur     x1, [x8, #-0x100]
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x25
    sub      x8, x29, #0x28
    ldur     x1, [x8, #-0x100]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x25
    sub      x8, x29, #0x30
    ldur     x1, [x8, #-0x100]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a2000
    add      x8, x8, #0xbb0
    ldr      x2, [x8, x24, lsl #3]
    mov      x0, x25
    sub      x8, x29, #0x38
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x1, x21
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    sub      x8, x29, #0x40
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    sub      x8, x29, #0x48
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x1, x21
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x58
    ldur     x0, [x8, #-0x100]
    sub      x8, x29, #0x50
    ldur     x1, [x8, #-0x100]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    fadd     d9, d9, d10
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldp      x8, x20, [x29, #-0xb0]
    add      x20, x20, #1
    cmp      x8, x20
    sub      x8, x29, #0x60
    ldur     x28, [x8, #-0x100]
    b.ne     #0x232410
    sub      x8, x29, #0x78
    ldur     x0, [x8, #-0x100]
    sub      x8, x29, #0x90
    ldur     x1, [x8, #-0x100]
    mov      x2, x28
    sub      x8, x29, #0x98
    ldur     x3, [x8, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xb0]
    cbnz     x0, #0x2322e8
    sub      x8, x29, #0x78
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x460]
    mov      x0, x19
    sub      x8, x29, #0x58
    ldur     x20, [x8, #-0x100]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x468]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x438]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0xa0]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x232878
    sub      sp, x29, #0x90
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    ldp      d9, d8, [sp, #0x30]
    ldp      d11, d10, [sp, #0x20]
    ldp      d13, d12, [sp, #0x10]
    ldp      d15, d14, [sp], #0xa0
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGChatTopMorphMenuView handleMenuTap:] IMP=0x233BF8 bounds=0x233BF8-0x233CD4
loc_233BF8:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x3d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #3
    b.ne     #0x233cbc
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x458]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x470]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x8, #0x7fffffffffffffff
    cmp      x0, x8
    b.eq     #0x233cbc
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x478]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    bl       #0x461c9c // _objc_release
    cbz      x23, #0x233cbc
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x8, [x0, #0x10]
    mov      x1, x21
    blr      x8
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461c9c // _objc_release

// -[WCLGChatTopMorphMenuView setHighlightedIndex:] IMP=0x233CD4 bounds=0x233CD4-0x233F60
loc_233CD4:
    sub      sp, sp, #0x180
    stp      d9, d8, [sp, #0x110]
    stp      x28, x27, [sp, #0x120]
    stp      x26, x25, [sp, #0x130]
    stp      x24, x23, [sp, #0x140]
    stp      x22, x21, [sp, #0x150]
    stp      x20, x19, [sp, #0x160]
    stp      x29, x30, [sp, #0x170]
    add      x29, sp, #0x170
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x70]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9ec]
    str      x2, [sp, #0x38]
    str      x2, [x0, x8]
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x40]
    stp      q0, q0, [sp, #0x60]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x448]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    add      x2, sp, #0x40
    add      x3, sp, #0x80
    str      x0, [sp, #0x20]
    str      x1, [sp]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x233f18
    mov      x23, x0
    ldr      x8, [sp, #0x50]
    ldr      x8, [x8]
    str      x8, [sp, #0x30]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x628]
    ldr      x8, [x8]
    str      x8, [sp, #0x28]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x530]
    mov      x22, #0
    adrp     x8, #0x4bf000
    ldr      x24, [x8, #0x470]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0xab8]
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x460]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0x2f8]
    stp      x8, x9, [sp, #0x10]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xed8]
    str      x8, [sp, #8]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xac8]
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0xb48]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xb50]
    ldr      x8, [sp, #0x50]
    ldr      x8, [x8]
    ldr      x9, [sp, #0x30]
    cmp      x8, x9
    b.eq     #0x233dec
    ldr      x0, [sp, #0x20]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp, #0x48]
    ldr      x27, [x8, x22, lsl #3]
    mov      x0, x27
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    adrp     x9, #0x4c4000
    ldr      x0, [x9, #0x90]
    ldr      x9, [sp, #0x38]
    cmp      x8, x9
    b.ne     #0x233e64
    ldr      x1, [sp, #0x10]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    ldr      x1, [sp, #8]
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x27
    mov      x1, x26
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    fmov     d9, #10.00000000
    b        #0x233e8c
    ldr      x1, [sp, #0x18]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x0, x27
    mov      x1, x26
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, xzr
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x20
    fmov     d0, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x25
    ldr      x2, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    add      x22, x22, #1
    cmp      x23, x22
    b.ne     #0x233dd0
    add      x2, sp, #0x40
    add      x3, sp, #0x80
    ldr      x0, [sp, #0x20]
    ldr      x1, [sp]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    cbnz     x0, #0x233d84
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x70]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x233f5c
    ldp      x29, x30, [sp, #0x170]
    ldp      x20, x19, [sp, #0x160]
    ldp      x22, x21, [sp, #0x150]
    ldp      x24, x23, [sp, #0x140]
    ldp      x26, x25, [sp, #0x130]
    ldp      x28, x27, [sp, #0x120]
    ldp      d9, d8, [sp, #0x110]
    add      sp, sp, #0x180
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGChatTopMorphMenuView indexForPoint:] IMP=0x233F60 bounds=0x233F60-0x23408C
loc_233F60:
    stp      d9, d8, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    fmov     d8, d1
    fmov     d9, d0
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, d9
    fmov     d5, d8
    bl       #0x46169c // _CGRectContainsPoint
    cbz      w0, #0x23405c
    mov      x8, #0x4046000000000000
    fmov     d0, x8
    fdiv     d0, d8, d0
    fcvtzs   x20, d0
    tbnz     x20, #0x3f, #0x23405c
    adrp     x8, #0x4c0000
    ldr      x21, [x8, #0x448]
    mov      x0, x19
    mov      x1, x21
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
    cmp      x23, x20
    b.le     #0x23405c
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
    mov      x19, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xdf0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x23407c
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x470]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    b        #0x234080
    mov      x20, #0x7fffffffffffffff
    mov      x0, x20
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      d9, d8, [sp], #0x50
    ret      
    mov      x20, #0x7fffffffffffffff
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    b        #0x234060

// -[WCLGChatTopMorphMenuView controller] IMP=0x23408C bounds=0x23408C-0x2340AC
loc_23408C:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9f0]
    add      x0, x0, x8
    bl       #0x461c60 // _objc_loadWeakRetained
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGChatTopMorphMenuView setController:] IMP=0x2340AC bounds=0x2340AC-0x2340C0
loc_2340AC:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9f0]
    add      x0, x0, x8
    b        #0x461d08 // _objc_storeWeak

// -[WCLGChatTopMorphMenuView isGroup] IMP=0x2340C0 bounds=0x2340C0-0x2340D0
loc_2340C0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9f4]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGChatTopMorphMenuView setIsGroup:] IMP=0x2340D0 bounds=0x2340D0-0x2340E0
loc_2340D0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9f4]
    strb     w2, [x0, x8]
    ret      

// -[WCLGChatTopMorphMenuView highlightedIndex] IMP=0x2340E0 bounds=0x2340E0-0x2340F0
loc_2340E0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9ec]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGChatTopMorphMenuView selectionHandler] IMP=0x2340F0 bounds=0x2340F0-0x234100
loc_2340F0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9f8]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGChatTopMorphMenuView setSelectionHandler:] IMP=0x234100 bounds=0x234100-0x23410C
loc_234100:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0x9f8]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGChatTopMorphMenuView effectView] IMP=0x23410C bounds=0x23410C-0x23411C
loc_23410C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9e8]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGChatTopMorphMenuView setEffectView:] IMP=0x23411C bounds=0x23411C-0x234130
loc_23411C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9e8]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGChatTopMorphMenuView rowViews] IMP=0x234130 bounds=0x234130-0x234140
loc_234130:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9fc]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGChatTopMorphMenuView setRowViews:] IMP=0x234140 bounds=0x234140-0x234154
loc_234140:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9fc]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGChatTopMorphMenuView .cxx_destruct] IMP=0x234154 bounds=0x234154-0x2341B8
loc_234154:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9fc]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9e8]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9f8]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x9f0]
    add      x0, x19, x8
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c0c // _objc_destroyWeak
