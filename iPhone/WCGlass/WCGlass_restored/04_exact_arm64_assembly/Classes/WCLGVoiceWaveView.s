// Exact ARM64 listing for WCLGVoiceWaveView

// -[WCLGVoiceWaveView initWithFrame:] IMP=0x4596F0 bounds=0x4596F0-0x459AF0
loc_4596F0:
    adrp     x8, #0x582000
    add      x8, x8, #0xe38
    ldar     w9, [x8]
    cbnz     w9, #0x45975c
    adrp     x9, #0x57a000
    add      x9, x9, #0x620
    ldrb     w10, [x9]
    mov      w11, #0x6d
    eor      w10, w10, w11
    adrp     x11, #0x57a000
    add      x11, x11, #0x625
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x8a
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xa8
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x15
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    eor      w9, w9, #0xfffffffb
    strb     w9, [x11, #4]
    stp      d11, d10, [sp, #-0x80]!
    stp      d9, d8, [sp, #0x10]
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    sub      sp, sp, #0x10
    mov      w9, #1
    stlr     w9, [x8]
    mov      x9, sp
    sub      x8, x9, #0x10
    mov      sp, x8
    adrp     x10, #0x4c4000
    ldr      x10, [x10, #0x850]
    stp      x0, x10, [x9, #-0x10]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0xb38]
    mov      x0, x8
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x19, x0
    cbz      x0, #0x459ac4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x0, x19
    stur     x1, [x29, #-0x80]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x60]
    mov      w20, #0x14
    mov      w2, #0x14
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c4000
    ldrsw    x21, [x8, #0xf84]
    ldr      x8, [x19, x21]
    str      x0, [x19, x21]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xac8]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xb48]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x8f8]
    stur     x8, [x29, #-0x78]
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0xac0]
    adrp     x8, #0x4bf000
    ldr      x25, [x8, #0x810]
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x830]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x5f0]
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x5f8]
    adrp     x8, #0x491000
    ldr      d10, [x8, #0x600]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x280]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    fmov     d0, #1.50000000
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    fmov     d3, #1.00000000
    ldur     x1, [x29, #-0x78]
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x27
    ldur     x1, [x29, #-0x80]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x1, x25
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x21]
    mov      x1, x26
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    subs     x20, x20, #1
    b.ne     #0x4598ac
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461bac // _objc_alloc_init
    adrp     x8, #0x4c4000
    ldrsw    x20, [x8, #0xf88]
    ldr      x8, [x19, x20]
    str      x0, [x19, x20]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d1, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9e0]
    fmov     d0, #11.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x0, [x19, x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x22, #0x4c4000
    ldr      x0, [x22, #0x90]
    fmov     d3, #1.00000000
    ldur     x23, [x29, #-0x78]
    mov      x1, x23
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x0, [x19, x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, x20]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1f8]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    adrp     x2, #0x57a000
    add      x2, x2, #0x650
    bl       #0x461c6c // _objc_msgSend
    ldr      x2, [x19, x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf8c]
    str      xzr, [x19, x8]
    ldr      x0, [x22, #0x90]
    fmov     d3, #1.00000000
    mov      x1, x23
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0xf90]
    ldr      x8, [x19, x9]
    str      x0, [x19, x9]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf94]
    mov      x9, #-1
    str      x9, [x19, x8]
    mov      x0, x19
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

// -[WCLGVoiceWaveView wclgColorForStatus:] IMP=0x459B80 bounds=0x459B80-0x459C60
loc_459B80:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x3f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    cbz      x0, #0x459bc4
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    mov      x21, x22
    b        #0x459c00
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8f8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x5f0]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x5f8]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x600]
    fmov     d3, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x3f8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      x19, #0x459c38
    cbnz     w0, #0x459c38
    mov      x0, x19
    bl       #0x459af0
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    b        #0x459c44
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x19, x21
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGVoiceWaveView wclgApplyColors] IMP=0x459C60 bounds=0x459C60-0x459E50
loc_459C60:
    sub      sp, sp, #0x130
    stp      x28, x27, [sp, #0xd0]
    stp      x26, x25, [sp, #0xe0]
    stp      x24, x23, [sp, #0xf0]
    stp      x22, x21, [sp, #0x100]
    stp      x20, x19, [sp, #0x110]
    stp      x29, x30, [sp, #0x120]
    add      x29, sp, #0x120
    mov      x20, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x60]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x400]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x408]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x410]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x21, #0x4c4000
    ldr      x0, [x21, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x318]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x21, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x320]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x20]
    stp      q0, q0, [sp]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x418]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x478]
    mov      x2, sp
    add      x3, sp, #0x40
    mov      x1, x21
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x459df0
    mov      x22, x0
    ldr      x8, [sp, #0x10]
    ldr      x27, [x8]
    adrp     x26, #0x4be000
    mov      x28, #0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xac0]
    ldr      x24, [x26, #0x460]
    ldr      x8, [sp, #0x10]
    ldr      x8, [x8]
    cmp      x8, x27
    b.eq     #0x459d9c
    mov      x0, x20
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp, #8]
    ldr      x25, [x8, x28, lsl #3]
    mov      x0, x19
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x25
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    add      x28, x28, #1
    cmp      x22, x28
    b.ne     #0x459d84
    mov      x2, sp
    add      x3, sp, #0x40
    mov      x0, x20
    mov      x1, x21
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    cbnz     x0, #0x459d74
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x328]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x459e4c
    ldp      x29, x30, [sp, #0x120]
    ldp      x20, x19, [sp, #0x110]
    ldp      x22, x21, [sp, #0x100]
    ldp      x24, x23, [sp, #0xf0]
    ldp      x26, x25, [sp, #0xe0]
    ldp      x28, x27, [sp, #0xd0]
    add      sp, sp, #0x130
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGVoiceWaveView dealloc] IMP=0x459E50 bounds=0x459E50-0x459EB4
loc_459E50:
    sub      sp, sp, #0x30
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x20, [x8, #0xf98]
    ldr      x0, [x0, x20]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x6b0]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x20]
    str      xzr, [x19, x20]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x850]
    stp      x19, x8, [sp]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd88]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    add      sp, sp, #0x30
    ret      

// -[WCLGVoiceWaveView wclgBarsArea] IMP=0x459EB4 bounds=0x459EB4-0x459F20
loc_459EB4:
    stp      d9, d8, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x4d8]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d2
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x8, #-0x3fb4000000000000
    fmov     d0, x8
    fadd     d0, d8, d0
    adrp     x8, #0x492000
    ldr      d1, [x8, #0x6e8]
    fadd     d0, d0, d1
    fmov     d1, xzr
    fmaxnm   d2, d0, d1
    mov      x8, #0x404c000000000000
    fmov     d0, x8
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      d9, d8, [sp], #0x30
    ret      

// -[WCLGVoiceWaveView layoutSubviews] IMP=0x459F20 bounds=0x459F20-0x459FFC
loc_459F20:
    sub      sp, sp, #0x40
    stp      d9, d8, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x850]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d3
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x410]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    mov      x8, #0x4044000000000000
    fmov     d2, x8
    fmov     d0, #10.00000000
    fmov     d1, xzr
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x68]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x461c9c // _objc_release
    cbnz     x20, #0x459fe8
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x420]
    adrp     x2, #0x4a6000
    add      x2, x2, #0x38
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      d9, d8, [sp, #0x10]
    add      sp, sp, #0x40
    ret      

// -[WCLGVoiceWaveView wclgLayoutBarsWithProvider:] IMP=0x45A004 bounds=0x45A004-0x45A20C
loc_45A004:
    stp      d13, d12, [sp, #-0x90]!
    stp      d11, d10, [sp, #0x10]
    stp      d9, d8, [sp, #0x20]
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x428]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    fcmp     d2, #0.0
    b.ls     #0x45a1e0
    fcmp     d3, #0.0
    b.ls     #0x45a1e0
    fmov     d9, d0
    fmov     d10, d2
    bl       #0x4616e4 // _CGRectGetMidY
    fmov     d8, d0
    adrp     x28, #0x4c4000
    ldr      x0, [x28, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x318]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x28, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x320]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c3000
    ldr      x21, [x8, #0x418]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x25, #0x4be000
    ldr      x1, [x25, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cmp      x23, #1
    b.lt     #0x45a1d0
    mov      x22, #0
    adrp     x8, #0x492000
    ldr      d0, [x8, #0x6f0]
    fadd     d0, d10, d0
    fmov     d1, #0.50000000
    fmul     d0, d0, d1
    fmov     d1, xzr
    fmaxnm   d0, d0, d1
    fadd     d9, d9, d0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x608]
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x678]
    ldr      x25, [x25, #0x600]
    fmov     d10, #3.00000000
    fmov     d11, #6.00000000
    fmov     d12, #-0.50000000
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x1, x23
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    fmov     d0, #3.00000000
    cbz      x19, #0x45a168
    ldr      x8, [x19, #0x10]
    mov      x0, x19
    mov      x1, x22
    blr      x8
    fcmp     d0, d10
    fcsel    d3, d10, d0, mi
    ucvtf    d0, x22
    fmadd    d0, d0, d11, d9
    fmul     d1, d3, d12
    fadd     d1, d8, d1
    fmov     d2, #3.00000000
    mov      x0, x26
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    add      x22, x22, #1
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    cmp      x22, x27
    b.lt     #0x45a118
    ldr      x0, [x28, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x328]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    ldp      d11, d10, [sp, #0x10]
    ldp      d13, d12, [sp], #0x90
    b        #0x461c9c // _objc_release

// -[WCLGVoiceWaveView setStatus:] IMP=0x45A20C bounds=0x45A20C-0x45A234
loc_45A20C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf8c]
    ldr      x9, [x0, x8]
    cmp      x9, x2
    b.ne     #0x45a224
    ret      
    str      x2, [x0, x8]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x430]
    b        #0x461c6c // _objc_msgSend

// -[WCLGVoiceWaveView setBaseColor:] IMP=0x45A234 bounds=0x45A234-0x45A284
loc_45A234:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf90]
    add      x0, x0, x8
    mov      x1, x2
    bl       #0x461cfc // _objc_storeStrong
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x430]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c9c // _objc_release

// -[WCLGVoiceWaveView setLockColor:] IMP=0x45A284 bounds=0x45A284-0x45A29C
loc_45A284:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf9c]
    strb     w2, [x0, x8]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x430]
    b        #0x461c6c // _objc_msgSend

// -[WCLGVoiceWaveView startRecording] IMP=0x45A29C bounds=0x45A29C-0x45A4B8
loc_45A29C:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xe68
    ldar     w9, [x8]
    cbnz     w9, #0x45a318
    adrp     x9, #0x57a000
    add      x9, x9, #0x670
    ldrb     w10, [x9]
    eor      w10, w10, #0xffffffc7
    adrp     x11, #0x57a000
    add      x11, x11, #0x675
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x4e
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x6c
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xfffffff7
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0x48
    eor      w9, w9, w10
    strb     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x660]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x410]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    adrp     x2, #0x57a000
    add      x2, x2, #0x6a0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x438]
    mov      x0, x19
    mov      x2, #-1
    bl       #0x461c6c // _objc_msgSend
    bl       #0x46145c // _CACurrentMediaTime
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x440]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x20, [x8, #0x68]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461c9c // _objc_release
    cbnz     x21, #0x45a46c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x3b0]
    adrp     x8, #0x4c3000
    ldr      x3, [x8, #0x448]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x78]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x80]
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
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x3b8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x88]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x2b8]
    ldr      x3, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x90]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x98]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e8]
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c6c // _objc_msgSend

// -[WCLGVoiceWaveView stopRecording] IMP=0x45A4B8 bounds=0x45A4B8-0x45A510
loc_45A4B8:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x6b0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x80]
    mov      x0, x19
    mov      x2, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c6c // _objc_msgSend

// -[WCLGVoiceWaveView wclgTick:] IMP=0x45A510 bounds=0x45A510-0x45A770
loc_45A510:
    stp      d9, d8, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x0
    adrp     x8, #0x582000
    add      x8, x8, #0xe70
    ldar     w9, [x8]
    cbnz     w9, #0x45a5e0
    adrp     x9, #0x57a000
    add      x9, x9, #0x6c0
    ldrb     w10, [x9]
    mov      w11, #0xe9
    adrp     x12, #0x57a000
    add      x12, x12, #0x6ca
    eor      w10, w10, w11
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    mov      w11, #0x95
    eor      w10, w10, w11
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    mov      w11, #0xb1
    eor      w10, w10, w11
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0x7f
    strb     w10, [x12, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0xfffffffb
    strb     w10, [x12, #4]
    ldrb     w10, [x9, #5]
    mov      w11, #0x2f
    eor      w10, w10, w11
    strb     w10, [x12, #5]
    ldrb     w10, [x9, #6]
    mov      w11, #0xb6
    eor      w10, w10, w11
    strb     w10, [x12, #6]
    ldrb     w10, [x9, #7]
    mov      w11, #0xa8
    eor      w10, w10, w11
    strb     w10, [x12, #7]
    ldrb     w10, [x9, #8]
    mov      w11, #0x62
    eor      w10, w10, w11
    strb     w10, [x12, #8]
    ldrb     w9, [x9, #9]
    mov      w10, #0x47
    eor      w9, w9, w10
    strb     w9, [x12, #9]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x20, sp, #0x40
    mov      sp, x20
    bl       #0x46145c // _CACurrentMediaTime
    fmov     d8, d0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x450]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fsub     d8, d8, d0
    fcvtzs   x21, d8
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x458]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, x21
    b.eq     #0x45a6c8
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x438]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    mov      x8, #-0x7777777777777778
    movk     x8, #0x8889
    smulh    x8, x21, x8
    add      x8, x8, x21
    asr      x9, x8, #5
    add      x8, x9, x8, lsr #63
    mov      w9, #0x3c
    msub     x9, x8, x9, x21
    adrp     x10, #0x4be000
    ldr      x1, [x10, #0x620]
    stp      x8, x9, [sp, #-0x10]!
    adrp     x2, #0x57a000
    add      x2, x2, #0x700
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    add      sp, sp, #0x10
    mov      x21, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x410]
    mov      x0, x19
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
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x428]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x438]
    fmul     d0, d3, d0
    fmov     d1, #7.00000000
    fmaxnm   d9, d0, d1
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3f8]
    fmul     d0, d8, d0
    bl       #0x461db0 // _sin
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x4e8]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x400]
    fmadd    d0, d0, d2, d1
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x20]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x4a0]
    str      d1, [x20, #8]
    adrp     x8, #0x45a000
    add      x8, x8, #0x770
    adrp     x9, #0x4a6000
    add      x9, x9, #0x58
    stp      x8, x9, [x20, #0x10]
    stp      d8, d0, [x20, #0x20]
    str      d9, [x20, #0x30]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x420]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    sub      sp, x29, #0x30
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      d9, d8, [sp], #0x40
    ret      

// -[WCLGVoiceWaveView status] IMP=0x45A81C bounds=0x45A81C-0x45A82C
loc_45A81C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf8c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGVoiceWaveView baseColor] IMP=0x45A82C bounds=0x45A82C-0x45A83C
loc_45A82C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf90]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGVoiceWaveView lockColor] IMP=0x45A83C bounds=0x45A83C-0x45A84C
loc_45A83C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf9c]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGVoiceWaveView bars] IMP=0x45A84C bounds=0x45A84C-0x45A85C
loc_45A84C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf84]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGVoiceWaveView setBars:] IMP=0x45A85C bounds=0x45A85C-0x45A870
loc_45A85C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf84]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGVoiceWaveView timeLabel] IMP=0x45A870 bounds=0x45A870-0x45A880
loc_45A870:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf88]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGVoiceWaveView setTimeLabel:] IMP=0x45A880 bounds=0x45A880-0x45A894
loc_45A880:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf88]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGVoiceWaveView link] IMP=0x45A894 bounds=0x45A894-0x45A8A4
loc_45A894:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf98]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGVoiceWaveView setLink:] IMP=0x45A8A4 bounds=0x45A8A4-0x45A8B8
loc_45A8A4:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf98]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGVoiceWaveView startTime] IMP=0x45A8B8 bounds=0x45A8B8-0x45A8C8
loc_45A8B8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xfa0]
    ldr      d0, [x0, x8]
    ret      

// -[WCLGVoiceWaveView setStartTime:] IMP=0x45A8C8 bounds=0x45A8C8-0x45A8D8
loc_45A8C8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xfa0]
    str      d0, [x0, x8]
    ret      

// -[WCLGVoiceWaveView lastWholeSecond] IMP=0x45A8D8 bounds=0x45A8D8-0x45A8E8
loc_45A8D8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf94]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGVoiceWaveView setLastWholeSecond:] IMP=0x45A8E8 bounds=0x45A8E8-0x45A8F8
loc_45A8E8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf94]
    str      x2, [x0, x8]
    ret      

// -[WCLGVoiceWaveView .cxx_destruct] IMP=0x45A8F8 bounds=0x45A8F8-0x45A960
loc_45A8F8:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf98]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf88]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf84]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xf90]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
