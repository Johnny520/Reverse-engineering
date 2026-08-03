// Exact ARM64 listing for WCLGVoiceHoldRecognizer

// -[WCLGVoiceHoldRecognizer wclgNoop] IMP=0x8202C bounds=0x8202C-0x82030
loc_8202C:
    ret      

// -[WCLGVoiceHoldRecognizer wclgCancelHoldBlock] IMP=0x82030 bounds=0x82030-0x820BC
loc_82030:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x20, [x8, #0x588]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461c9c // _objc_release
    cbz      x21, #0x820ac
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x461984 // _dispatch_block_cancel
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x590]
    mov      x0, x19
    mov      x2, #0
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    ret      

// -[WCLGVoiceHoldRecognizer wclgResolvedToolView] IMP=0x820BC bounds=0x820BC-0x822A8
loc_820BC:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x57d000
    add      x8, x8, #0x274
    ldar     w9, [x8]
    cbnz     w9, #0x821cc
    adrp     x9, #0x4d5000
    add      x9, x9, #0x358
    ldrb     w10, [x9]
    mov      w11, #0x8c
    eor      w10, w10, w11
    adrp     x11, #0x4d5000
    add      x11, x11, #0x368
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x3f
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0x38
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xffffffc7
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x45
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0xfffffffd
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0xea
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0x21
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w12, #0x71
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    eor      w10, w10, #1
    strb     w10, [x11, #9]
    ldrb     w10, [x9, #0xa]
    eor      w10, w10, #4
    strb     w10, [x11, #0xa]
    ldrb     w10, [x9, #0xb]
    eor      w10, w10, #0x1f
    strb     w10, [x11, #0xb]
    ldrb     w10, [x9, #0xc]
    mov      w12, #0xc4
    eor      w10, w10, w12
    strb     w10, [x11, #0xc]
    ldrb     w10, [x9, #0xd]
    eor      w10, w10, #0xc
    strb     w10, [x11, #0xd]
    ldrb     w10, [x9, #0xe]
    mov      w12, #0xdb
    eor      w10, w10, w12
    strb     w10, [x11, #0xe]
    ldrb     w9, [x9, #0xf]
    eor      w9, w9, #0xffffffef
    strb     w9, [x11, #0xf]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x598]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    cbnz     x0, #0x82274
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x3d8]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461c9c // _objc_release
    cbz      x22, #0x82270
    mov      x20, #0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x1, #0x4d5000
    add      x1, x1, #0x3a0
    bl       #0x260cd0
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x5a0]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    b        #0x82274
    mov      x20, #0
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461be8 // _objc_autoreleaseReturnValue
    mov      x19, x0
    b        #0x82298
    mov      x19, x0
    mov      x21, x20
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGVoiceHoldRecognizer wclgMountWaveViewOnToolView:] IMP=0x822A8 bounds=0x822A8-0x82D80
loc_822A8:
    stp      d11, d10, [sp, #-0x80]!
    stp      d9, d8, [sp, #0x10]
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    sub      sp, sp, #0x30
    mov      x19, x2
    stur     x0, [x29, #-0x80]
    adrp     x8, #0x57d000
    add      x8, x8, #0x278
    ldar     w9, [x8]
    cbnz     w9, #0x823b4
    adrp     x9, #0x4d5000
    add      x9, x9, #0x3c0
    ldrb     w10, [x9]
    eor      w10, w10, #0x40
    adrp     x11, #0x4d5000
    add      x11, x11, #0x3cd
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xd7
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xd5
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x64
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0xa0
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0xffffffbf
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0x47
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w12, #0xa2
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    eor      w10, w10, #0xf8
    strb     w10, [x11, #9]
    ldrb     w10, [x9, #0xa]
    mov      w12, #0xcd
    eor      w10, w10, w12
    strb     w10, [x11, #0xa]
    ldrb     w10, [x9, #0xb]
    mov      w12, #0x61
    eor      w10, w10, w12
    strb     w10, [x11, #0xb]
    ldrb     w9, [x9, #0xc]
    mov      w10, #0x42
    eor      w9, w9, w10
    strb     w9, [x11, #0xc]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x22, sp, #0x10
    mov      sp, x22
    sub      x24, sp, #0x10
    mov      sp, x24
    sub      x25, sp, #0x10
    mov      sp, x25
    sub      x27, sp, #0x10
    mov      sp, x27
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    cbz      x19, #0x82c08
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x5a8]
    ldur     x0, [x29, #-0x80]
    stur     x19, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cbnz     x0, #0x82450
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x248]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x608]
    ldp      d0, d1, [x8]
    ldp      d2, d3, [x8, #0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    mov      x19, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x5b0]
    mov      x19, x0
    ldur     x0, [x29, #-0x80]
    bl       #0x461c6c // _objc_msgSend
    stur     x19, [x29, #-0x88]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    ldur     x0, [x29, #-0x80]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3f0]
    stur     x0, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x8f8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x5f0]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x5f8]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x600]
    fmov     d3, #1.00000000
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x90]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x308]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4a3000
    add      x8, x8, #0x9e0
    ldr      x2, [x8]
    adrp     x8, #0x4bf000
    ldr      x28, [x8, #0x758]
    mov      x1, x28
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    adrp     x8, #0x4a3000
    add      x8, x8, #0x9e8
    ldr      x2, [x8]
    mov      x0, x20
    mov      x1, x28
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3f8]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #2
    csel     x19, x28, x19, eq
    cbz      x19, #0x825b0
    str      xzr, [x22]
    str      xzr, [x24]
    str      xzr, [x25]
    mov      x8, #0x3ff0000000000000
    str      x8, [x27]
    mov      x0, x19
    mov      x1, x22
    mov      x2, x24
    mov      x3, x25
    mov      x4, x27
    ldur     x28, [x29, #-0x88]
    bl       #0x260674
    tbnz     w0, #0, #0x8259c
    mov      x0, x19
    mov      x1, x22
    mov      x2, x24
    mov      x3, x25
    bl       #0x260854
    cbz      w0, #0x82618
    mov      x0, x19
    bl       #0x2605d8
    cbz      w0, #0x825c8
    ldr      d0, [x27]
    b        #0x825d4
    ldur     x19, [x29, #-0x90]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x22, x19
    ldur     x28, [x29, #-0x88]
    b        #0x82628
    mov      x0, x19
    bl       #0x260ad4
    str      d0, [x27]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    ldr      d4, [x22]
    ldr      d1, [x24]
    ldr      d2, [x25]
    fmov     d3, xzr
    fmaxnm   d0, d0, d3
    fmov     d3, #1.00000000
    fcmp     d0, d3
    fcsel    d3, d3, d0, gt
    mov      x1, x23
    fmov     d0, d4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    b        #0x82624
    ldur     x22, [x29, #-0x90]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    ldur     x19, [x29, #-0x90]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x98]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    mov      x1, x21
    ldur     x21, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x5b8]
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x5c0]
    ldur     x0, [x29, #-0x80]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x5c8]
    ldur     x0, [x29, #-0x80]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x5d0]
    mov      x0, x28
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x5d8]
    mov      x0, x28
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      w1, #0
    bl       #0x82d80
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    bl       #0x461ca8 // _objc_retain
    adrp     x28, #0x4be000
    mov      x19, x0
    cbz      x0, #0x8279c
    mov      x19, x23
    ldur     x8, [x29, #-0x78]
    cmp      x23, x8
    b.eq     #0x8279c
    ldr      x20, [x28, #0x410]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x998]
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x9a0]
    adrp     x25, #0x4d5000
    add      x25, x25, #0x400
    mov      x26, x23
    mov      x0, x26
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4617b0 // _NSStringFromClass
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x21
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    tbnz     w27, #0, #0x82928
    mov      x0, x26
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    cbz      x19, #0x8279c
    mov      x26, x19
    ldur     x8, [x29, #-0x78]
    cmp      x19, x8
    b.ne     #0x82730
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cbz      x23, #0x8282c
    adrp     x8, #0x4be000
    ldr      x19, [x8, #0x9a0]
    mov      x24, #0
    mov      x25, #0
    mov      x0, x23
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x461c9c // _objc_release
    cbz      x20, #0x8282c
    mov      x24, #0
    mov      x25, #0
    mov      x0, x23
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x770]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    fmov     d8, d1
    fmov     d11, d2
    fmov     d9, d3
    mov      x24, #0
    mov      w20, #0x2a
    mov      x26, x23
    mov      x25, x19
    b        #0x82958
    ldur     x25, [x29, #-0x78]
    mov      x0, x25
    bl       #0x1278d4
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    cbz      x0, #0x828ac
    adrp     x8, #0x4be000
    ldr      x19, [x8, #0x9a0]
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461c9c // _objc_release
    cbz      x21, #0x828ac
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x770]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    fmov     d8, d1
    fmov     d11, d2
    fmov     d9, d3
    b        #0x82910
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x19, [x8, #0x4d8]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d3
    mov      x0, x25
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d3
    mov      x0, x25
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x8, #0x4046000000000000
    fmov     d0, x8
    fminnm   d9, d8, d0
    fsub     d0, d10, d9
    fmov     d1, #-6.00000000
    fadd     d8, d0, d1
    fmov     d0, #-20.00000000
    fadd     d0, d2, d0
    fmov     d1, xzr
    fmaxnm   d11, d0, d1
    fmov     d10, #10.00000000
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x24, #0
    mov      w20, #0x2a
    mov      x26, x23
    b        #0x82958
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    fmov     d8, d1
    fmov     d11, d2
    fmov     d9, d3
    mov      w20, #0x12
    mov      x24, x26
    mov      x25, x26
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    ldur     x0, [x29, #-0x88]
    fmov     d0, d10
    fmov     d1, d8
    fmov     d2, d11
    fmov     d3, d9
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x448]
    ldur     x0, [x29, #-0x88]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0xab8]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    ldur     x20, [x29, #-0x88]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x0, x25
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9d0]
    mov      x0, x25
    ldur     x2, [x29, #-0x88]
    bl       #0x461c6c // _objc_msgSend
    cbz      x23, #0x82bb8
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x5e0]
    ldur     x0, [x29, #-0x80]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xf8]
    ldr      x19, [x28, #0x410]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x418]
    mov      x0, x23
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x82aac
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea0]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x5e8]
    ldur     x0, [x29, #-0x80]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x23
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    b        #0x82b38
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x100]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x23
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x82b40
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea0]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x5e8]
    ldur     x0, [x29, #-0x80]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x23
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1b0]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x5f0]
    ldur     x0, [x29, #-0x80]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc40]
    mov      x0, x23
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x1920ec
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x5f8]
    ldur     x0, [x29, #-0x88]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x600]
    ldp      x0, x3, [x29, #-0x80]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x88]
    bl       #0x461c9c // _objc_release
    ldur     x19, [x29, #-0x78]
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
    b        #0x82c98
    b        #0x82c98
    b        #0x82c58
    mov      x21, x0
    mov      x0, x26
    b        #0x82d30
    b        #0x82c58
    b        #0x82c58
    mov      x21, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    b        #0x82c88
    mov      x21, x0
    mov      x0, x19
    b        #0x82d54
    b        #0x82c98
    b        #0x82c98
    mov      x21, x0
    b        #0x82d58
    mov      x21, x0
    mov      x0, x20
    b        #0x82d54
    b        #0x82c98
    b        #0x82c98
    mov      x21, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    b        #0x82d3c
    b        #0x82d20
    mov      x21, x0
    mov      x0, x20
    b        #0x82d5c
    b        #0x82cf4
    b        #0x82cf4
    b        #0x82cf4
    mov      x21, x0
    b        #0x82d00
    mov      x21, x0
    b        #0x82d08
    mov      x21, x0
    b        #0x82d18
    b        #0x82cec
    mov      x21, x0
    b        #0x82d70
    stur     x19, [x29, #-0x88]
    mov      x21, x0
    b        #0x82d68
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x90]
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x98]
    b        #0x82d64
    mov      x21, x0
    b        #0x82d60
    mov      x21, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    b        #0x82d50
    mov      x21, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    b        #0x82d54
    mov      x21, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x88]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x78]
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461894 // __Unwind_Resume

// -[WCLGVoiceHoldRecognizer wclgMountHintAboveInputWithAnchor:toolView:] IMP=0x8309C bounds=0x8309C-0x83548
loc_8309C:
    sub      sp, sp, #0xa0
    stp      d15, d14, [sp, #0x10]
    stp      d13, d12, [sp, #0x20]
    stp      d11, d10, [sp, #0x30]
    stp      d9, d8, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      x20, x3
    mov      x19, x2
    mov      x23, x0
    adrp     x8, #0x57d000
    add      x8, x8, #0x280
    ldar     w9, [x8]
    cbnz     w9, #0x83154
    adrp     x9, #0x4d5000
    add      x9, x9, #0x470
    ldrh     w10, [x9]
    mov      w11, #0x2615
    eor      w10, w10, w11
    adrp     x11, #0x4d5000
    add      x11, x11, #0x47c
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x1720
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xbd88
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xf584
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x1c57
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w9, [x9, #0xa]
    mov      w10, #0x5310
    eor      w9, w9, w10
    strh     w9, [x11, #0xa]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x4a8]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    cbz      x0, #0x831b8
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    mov      x21, x24
    b        #0x831d0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbz      x19, #0x8346c
    cbz      x21, #0x8346c
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x608]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    cbnz     x0, #0x832b0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    mov      x24, #0
    bl       #0x461bac // _objc_alloc_init
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      x24, x0
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x378]
    ldr      d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    fmov     d0, #12.00000000
    mov      x24, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x0, x22
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1f8]
    mov      x24, x22
    mov      x0, x22
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x610]
    mov      x24, x22
    mov      x0, x23
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    adrp     x2, #0x4d5000
    add      x2, x2, #0x4b0
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x618]
    mov      x24, x22
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x620]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, #0
    mov      x1, x25
    bl       #0x83548
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x22
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x4d8]
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xae0]
    mov      x0, x19
    mov      x1, x25
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    str      d0, [sp, #8]
    bl       #0x4616fc // _CGRectGetMinY
    fmov     d12, d0
    mov      x0, x20
    mov      w1, #0
    bl       #0x8364c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    cbz      x0, #0x833e8
    mov      x0, x23
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    mov      x1, x25
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d13, d0
    fmov     d14, d1
    fmov     d15, d2
    fmov     d8, d3
    bl       #0x461744 // _CGRectIsEmpty
    tbnz     w0, #0, #0x833e8
    fmov     d0, d13
    fmov     d1, d14
    fmov     d2, d15
    fmov     d3, d8
    bl       #0x4616fc // _CGRectGetMinY
    fcmp     d12, d0
    fcsel    d12, d12, d0, mi
    ldr      d0, [sp, #8]
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616c0 // _CGRectGetMaxX
    mov      x8, #-0x3fa5000000000000
    fmov     d1, x8
    fadd     d0, d0, d1
    fmov     d1, #-6.00000000
    fadd     d1, d12, d1
    fmov     d2, #-18.00000000
    fadd     d1, d1, d2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    mov      x8, #0x405b000000000000
    fmov     d2, x8
    fmov     d3, #18.00000000
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9d0]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      d9, d8, [sp, #0x40]
    ldp      d11, d10, [sp, #0x30]
    ldp      d13, d12, [sp, #0x20]
    ldp      d15, d14, [sp, #0x10]
    add      sp, sp, #0xa0
    b        #0x461c9c // _objc_release
    b        #0x83514
    b        #0x834e8
    b        #0x834f4
    b        #0x83514
    b        #0x8350c
    b        #0x8350c
    mov      x24, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    b        #0x834ec
    b        #0x8350c
    mov      x24, x0
    b        #0x83528
    b        #0x83514
    b        #0x8350c
    mov      x24, x0
    mov      x0, x25
    b        #0x8351c
    mov      x24, x0
    mov      x0, x22
    b        #0x8352c
    mov      x24, x0
    b        #0x83530
    mov      x22, x24
    mov      x24, x0
    b        #0x83520
    mov      x24, x0
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
    mov      x0, x24
    bl       #0x461894 // __Unwind_Resume

// -[WCLGVoiceHoldRecognizer wclgTeardownWaveView] IMP=0x83910 bounds=0x83910-0x83C1C
loc_83910:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x0, #0x57d000
    add      x0, x0, #0x228
    bl       #0x461c60 // _objc_loadWeakRetained
    mov      x20, x0
    bl       #0x461c9c // _objc_release
    cbz      x20, #0x83974
    adrp     x0, #0x57d000
    add      x0, x0, #0x228
    bl       #0x461c60 // _objc_loadWeakRetained
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x0, #0x57d000
    add      x0, x0, #0x228
    mov      x1, #0
    bl       #0x461d08 // _objc_storeWeak
    adrp     x8, #0x4bf000
    ldr      x20, [x8, #0x608]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461c9c // _objc_release
    adrp     x22, #0x4be000
    cbz      x21, #0x839dc
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [x22, #0xb30]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x610]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x21, [x8, #0x5a8]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x461c9c // _objc_release
    cbz      x20, #0x83a6c
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x628]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [x22, #0xb30]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x5b0]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x630]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    cbz      x0, #0x83bcc
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xf8]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x410]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x418]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x83af4
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x638]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    b        #0x83b48
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x100]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x83b50
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x638]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x640]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc40]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x5e0]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x5e8]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x5f0]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x1920ec
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release
    b        #0x83be8
    b        #0x83be8
    mov      x19, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    b        #0x83c0c
    b        #0x83c08
    b        #0x83c08
    b        #0x83c08
    b        #0x83c08
    mov      x19, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGVoiceHoldRecognizer wclgUpdateWaveStatusForTouches:] IMP=0x83C1C bounds=0x83C1C-0x840B4
loc_83C1C:
    stp      d9, d8, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x57d000
    add      x8, x8, #0x290
    ldar     w9, [x8]
    cbnz     w9, #0x83db0
    adrp     x9, #0x4d5000
    add      x9, x9, #0x550
    ldrh     w10, [x9]
    mov      w11, #0xa62b
    eor      w10, w10, w11
    adrp     x11, #0x4d5000
    add      x11, x11, #0x55e
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xeebe
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xb6b7
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x949a
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x659d
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0x1283
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w9, [x9, #0xc]
    mov      w10, #0xcfec
    eor      w9, w9, w10
    strh     w9, [x11, #0xc]
    adrp     x9, #0x4d5000
    add      x9, x9, #0x538
    ldrh     w10, [x9]
    mov      w11, #0xc3b5
    eor      w10, w10, w11
    adrp     x11, #0x4d5000
    add      x11, x11, #0x544
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x951
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xf887
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xa3ea
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x7efd
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w9, [x9, #0xa]
    mov      w10, #0x56e2
    eor      w9, w9, w10
    strh     w9, [x11, #0xa]
    adrp     x9, #0x4d5000
    add      x9, x9, #0x520
    ldrh     w10, [x9]
    mov      w11, #0x289b
    eor      w10, w10, w11
    adrp     x11, #0x4d5000
    add      x11, x11, #0x52c
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x672e
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x5061
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x9e6a
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x2088
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w9, [x9, #0xa]
    mov      w10, #0x3cbb
    eor      w9, w9, w10
    strh     w9, [x11, #0xa]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x648]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x84000
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x5a8]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461c9c // _objc_release
    cbz      x21, #0x84000
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4a8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x650]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    cbz      x21, #0x83ff0
    cbz      x22, #0x83ff0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x458]
    mov      x0, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x658]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    fsub     d0, d1, d9
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x610]
    fcmp     d0, d1
    b.le     #0x83ec4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #0.50000000
    fmul     d0, d2, d0
    fcmp     d8, d0
    mov      w8, #2
    csinc    x24, x8, xzr, pl
    b        #0x83ec8
    mov      x24, #0
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x660]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4d5000
    add      x8, x8, #0x5d0
    adrp     x9, #0x4d5000
    add      x9, x9, #0x610
    cmp      x24, #2
    csel     x8, x9, x8, eq
    adrp     x9, #0x4d5000
    add      x9, x9, #0x590
    cmp      x24, #1
    csel     x23, x9, x8, eq
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x25, [x8, #0x608]
    mov      x0, x20
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x618]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x620]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x24
    mov      x1, x23
    bl       #0x83548
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x20
    mov      x1, x25
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
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      d9, d8, [sp], #0x60
    b        #0x461c9c // _objc_release
    b        #0x84070
    mov      x20, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    b        #0x84038
    mov      x20, x0
    mov      x0, x24
    b        #0x84048
    mov      x20, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    b        #0x84064
    b        #0x84060
    b        #0x84060
    b        #0x84070
    b        #0x84070
    mov      x20, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    b        #0x84074
    mov      x20, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    b        #0x840a4
    mov      x20, x0
    b        #0x8407c
    mov      x20, x0
    mov      x0, x22
    b        #0x84080
    b        #0x840a0
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461894 // __Unwind_Resume

// -[WCLGVoiceHoldRecognizer wclgBeginRecording] IMP=0x840B4 bounds=0x840B4-0x842F0
loc_840B4:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x590]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x668]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cbz      x0, #0x84208
    adrp     x8, #0x4bf000
    ldr      x24, [x8, #0x670]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    mov      x0, x19
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x84208
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x680]
    mov      x0, x20
    mov      x1, x23
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x22, [x8, #0x678]
    mov      x0, x20
    mov      x1, x22
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x238]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x478]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x480]
    bl       #0x461c6c // _objc_msgSend
    adrp     x27, #0x57d000
    mov      w8, #1
    strb     w8, [x27, #0x230]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x688]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x690]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x698]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x19
    mov      x1, x24
    mov      x2, x25
    mov      x3, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    b        #0x8421c
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x678]
    mov      x0, x20
    mov      w2, #5
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    b        #0x461c9c // _objc_release
    mov      x2, x26
    mov      x26, x1
    mov      x24, x0
    mov      x0, x2
    bl       #0x461c9c // _objc_release
    b        #0x8425c
    mov      x26, x1
    mov      x24, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    b        #0x84270
    mov      x26, x1
    mov      x24, x0
    cmp      w26, #1
    b.ne     #0x842cc
    mov      x0, x24
    bl       #0x461bf4 // _objc_begin_catch
    mov      x0, x20
    mov      x1, x23
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    strb     wzr, [x27, #0x230]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6a0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x22
    mov      w2, #5
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461c18 // _objc_end_catch
    b        #0x841fc
    mov      x24, x0
    bl       #0x461c18 // _objc_end_catch
    b        #0x842cc
    mov      x24, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    b        #0x842e0
    b        #0x842dc
    mov      x24, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461894 // __Unwind_Resume

// -[WCLGVoiceHoldRecognizer touchesBegan:withEvent:] IMP=0x842F0 bounds=0x842F0-0x846E4
loc_842F0:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      x20, x3
    mov      x19, x2
    mov      x23, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x6f8]
    stp      x23, x8, [sp, #0x30]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xe18]
    add      x0, sp, #0x30
    mov      x2, x19
    mov      x3, x20
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x582000
    add      x8, x8, #0xf88
    ldrb     w8, [x8]
    tbz      w8, #0, #0x844b0
    adrp     x8, #0x582000
    add      x8, x8, #0xf8b
    ldrb     w8, [x8]
    tbz      w8, #0, #0x844b0
    adrp     x8, #0x582000
    add      x8, x8, #0xfb0
    ldrb     w8, [x8]
    tbz      w8, #0, #0x844b0
    bl       #0x127040
    sub      x8, x0, #2
    cmp      x8, #3
    b.hs     #0x844b0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x668]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    cbz      x0, #0x844f4
    adrp     x8, #0x4bf000
    ldr      x2, [x8, #0x670]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x844f4
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x680]
    mov      x0, x23
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6a8]
    mov      x0, x23
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6b0]
    mov      x0, x23
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x650]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    cbz      x0, #0x8450c
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x3d8]
    mov      x0, x23
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x4a8]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    cbz      x0, #0x8450c
    mov      x0, x23
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x458]
    mov      x0, x22
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      w28, #1
    b        #0x84520
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x678]
    mov      x0, x23
    mov      w2, #5
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    ret      
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x678]
    mov      x0, x23
    mov      w2, #5
    bl       #0x461c6c // _objc_msgSend
    b        #0x84614
    mov      x25, #0
    mov      w28, #0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x568]
    ldp      d0, d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6b8]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      w28, #0x84544
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    cbz      x22, #0x84558
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6c0]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    add      x0, sp, #0x28
    mov      x1, x23
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    adrp     x8, #0x84000
    add      x8, x8, #0x6e4
    str      d0, [sp, #8]
    adrp     x9, #0x4a0000
    add      x9, x9, #0x920
    stp      x8, x9, [sp, #0x10]
    mov      x25, sp
    add      x0, x25, #0x20
    add      x1, sp, #0x28
    bl       #0x461c00 // _objc_copyWeak
    mov      x1, sp
    mov      x0, #0
    bl       #0x461990 // _dispatch_block_create
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x590]
    mov      x0, x23
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, #0
    mov      w1, #0xa300
    movk     w1, #0x11e1, lsl #16
    bl       #0x461a2c // _dispatch_time
    adrp     x1, #0x4a0000
    ldr      x1, [x1, #0x770]
    mov      x2, x24
    bl       #0x46196c // _dispatch_after
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    add      x0, x25, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, sp, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    b        #0x844c4
    mov      x23, x0
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    b        #0x84634
    mov      x23, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    b        #0x8468c
    mov      x23, x0
    b        #0x8468c
    mov      x23, x0
    b        #0x84694
    mov      x23, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    add      x0, x25, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, sp, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    b        #0x846a8
    mov      x23, x0
    cbz      w28, #0x84688
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    cbz      x22, #0x846a8
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    b        #0x846a8
    b        #0x846b8
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    b        #0x846bc
    b        #0x846c8
    mov      x23, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    b        #0x846cc
    mov      x23, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461894 // __Unwind_Resume

// -[WCLGVoiceHoldRecognizer touchesMoved:withEvent:] IMP=0x84734 bounds=0x84734-0x848B8
loc_84734:
    sub      sp, sp, #0x50
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x20, x3
    mov      x19, x2
    mov      x21, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x6f8]
    stp      x21, x8, [sp]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6d0]
    mov      x0, sp
    mov      x2, x19
    mov      x3, x20
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6a8]
    mov      x0, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6b0]
    mov      x0, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x648]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x84844
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x668]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x6d8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x84814
    mov      x0, x22
    mov      x1, x23
    mov      x2, x19
    mov      x3, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6e0]
    mov      x0, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x678]
    mov      x0, x21
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    add      sp, sp, #0x50
    ret      
    mov      x23, x0
    cmp      w1, #1
    b.ne     #0x84890
    mov      x0, x23
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    b        #0x84814
    b        #0x8489c
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    b        #0x848a0
    mov      x23, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461894 // __Unwind_Resume

// -[WCLGVoiceHoldRecognizer touchesEnded:withEvent:] IMP=0x848B8 bounds=0x848B8-0x84AAC
loc_848B8:
    sub      sp, sp, #0x50
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x20, x3
    mov      x19, x2
    mov      x21, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x6f8]
    stp      x21, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xe20]
    mov      x0, sp
    mov      x2, x19
    mov      x3, x20
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6c0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x648]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x849fc
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x668]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x6e8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x84980
    mov      x0, x22
    mov      x1, x23
    mov      x2, x19
    mov      x3, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x57d000
    mov      w9, #1
    strb     w9, [x8, #0x231]
    mov      x0, #0
    mov      w1, #0x9400
    movk     w1, #0x7735, lsl #16
    bl       #0x461a2c // _dispatch_time
    adrp     x1, #0x4a0000
    ldr      x1, [x1, #0x770]
    adrp     x2, #0x4a1000
    add      x2, x2, #0x1f8
    bl       #0x46196c // _dispatch_after
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x680]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x57d000
    strb     wzr, [x8, #0x230]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6a0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x678]
    mov      x0, x21
    mov      w2, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    b        #0x84a10
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x678]
    mov      x0, x21
    mov      w2, #5
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6a8]
    mov      x0, x21
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6b0]
    mov      x0, x21
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    add      sp, sp, #0x50
    ret      
    mov      x23, x0
    cmp      w1, #1
    b.ne     #0x84a84
    mov      x0, x23
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    b        #0x84980
    b        #0x84a90
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    b        #0x84a94
    mov      x23, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461894 // __Unwind_Resume

// -[WCLGVoiceHoldRecognizer touchesCancelled:withEvent:] IMP=0x84AB8 bounds=0x84AB8-0x84C7C
loc_84AB8:
    sub      sp, sp, #0x50
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x20, x3
    mov      x19, x2
    mov      x21, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x6f8]
    stp      x21, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xe28]
    mov      x0, sp
    mov      x2, x19
    mov      x3, x20
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6c0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x648]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x84bcc
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x668]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x6f0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x84b80
    mov      x0, x22
    mov      x1, x23
    mov      x2, x19
    mov      x3, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x680]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x57d000
    strb     wzr, [x8, #0x230]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6a0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x678]
    mov      x0, x21
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    b        #0x84be0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x678]
    mov      x0, x21
    mov      w2, #5
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6a8]
    mov      x0, x21
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6b0]
    mov      x0, x21
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    add      sp, sp, #0x50
    ret      
    mov      x23, x0
    cmp      w1, #1
    b.ne     #0x84c54
    mov      x0, x23
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    b        #0x84b80
    b        #0x84c60
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    b        #0x84c64
    mov      x23, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461894 // __Unwind_Resume

// -[WCLGVoiceHoldRecognizer reset] IMP=0x84C7C bounds=0x84C7C-0x84D58
loc_84C7C:
    sub      sp, sp, #0x30
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x6f8]
    stp      x0, x8, [sp]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6f8]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6c0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x648]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x84cf4
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x5a8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x461c9c // _objc_release
    cbz      x20, #0x84d20
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x680]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x57d000
    strb     wzr, [x8, #0x230]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6a0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6a8]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x6b0]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    add      sp, sp, #0x30
    ret      

// -[WCLGVoiceHoldRecognizer toolView] IMP=0x84D58 bounds=0x84D58-0x84D78
loc_84D58:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x868]
    add      x0, x0, x8
    bl       #0x461c60 // _objc_loadWeakRetained
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGVoiceHoldRecognizer setToolView:] IMP=0x84D78 bounds=0x84D78-0x84D8C
loc_84D78:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x868]
    add      x0, x0, x8
    b        #0x461d08 // _objc_storeWeak

// -[WCLGVoiceHoldRecognizer recording] IMP=0x84D8C bounds=0x84D8C-0x84D9C
loc_84D8C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x86c]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGVoiceHoldRecognizer setRecording:] IMP=0x84D9C bounds=0x84D9C-0x84DAC
loc_84D9C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x86c]
    strb     w2, [x0, x8]
    ret      

// -[WCLGVoiceHoldRecognizer pendingTouches] IMP=0x84DAC bounds=0x84DAC-0x84DBC
loc_84DAC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x870]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGVoiceHoldRecognizer setPendingTouches:] IMP=0x84DBC bounds=0x84DBC-0x84DD0
loc_84DBC:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x870]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGVoiceHoldRecognizer pendingEvent] IMP=0x84DD0 bounds=0x84DD0-0x84DE0
loc_84DD0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x874]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGVoiceHoldRecognizer setPendingEvent:] IMP=0x84DE0 bounds=0x84DE0-0x84DF4
loc_84DE0:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x874]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGVoiceHoldRecognizer holdBlock] IMP=0x84DF4 bounds=0x84DF4-0x84E04
loc_84DF4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x878]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGVoiceHoldRecognizer setHoldBlock:] IMP=0x84E04 bounds=0x84E04-0x84E10
loc_84E04:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0x878]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGVoiceHoldRecognizer waveView] IMP=0x84E10 bounds=0x84E10-0x84E20
loc_84E10:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x87c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGVoiceHoldRecognizer setWaveView:] IMP=0x84E20 bounds=0x84E20-0x84E34
loc_84E20:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x87c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGVoiceHoldRecognizer dimmedTextView] IMP=0x84E34 bounds=0x84E34-0x84E44
loc_84E34:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x880]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGVoiceHoldRecognizer setDimmedTextView:] IMP=0x84E44 bounds=0x84E44-0x84E58
loc_84E44:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x880]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGVoiceHoldRecognizer savedTextColor] IMP=0x84E58 bounds=0x84E58-0x84E68
loc_84E58:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x884]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGVoiceHoldRecognizer setSavedTextColor:] IMP=0x84E68 bounds=0x84E68-0x84E7C
loc_84E68:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x884]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGVoiceHoldRecognizer savedTintColor] IMP=0x84E7C bounds=0x84E7C-0x84E8C
loc_84E7C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x888]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGVoiceHoldRecognizer setSavedTintColor:] IMP=0x84E8C bounds=0x84E8C-0x84EA0
loc_84E8C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x888]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGVoiceHoldRecognizer hintFloatLabel] IMP=0x84EA0 bounds=0x84EA0-0x84EB0
loc_84EA0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x88c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGVoiceHoldRecognizer setHintFloatLabel:] IMP=0x84EB0 bounds=0x84EB0-0x84EC4
loc_84EB0:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x88c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGVoiceHoldRecognizer waveBaseColor] IMP=0x84EC4 bounds=0x84EC4-0x84ED4
loc_84EC4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x890]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGVoiceHoldRecognizer setWaveBaseColor:] IMP=0x84ED4 bounds=0x84ED4-0x84EE8
loc_84ED4:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x890]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGVoiceHoldRecognizer waveLockColor] IMP=0x84EE8 bounds=0x84EE8-0x84EF8
loc_84EE8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x894]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGVoiceHoldRecognizer setWaveLockColor:] IMP=0x84EF8 bounds=0x84EF8-0x84F08
loc_84EF8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x894]
    strb     w2, [x0, x8]
    ret      

// -[WCLGVoiceHoldRecognizer startLocationInWindow] IMP=0x84F08 bounds=0x84F08-0x84F1C
loc_84F08:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x898]
    add      x8, x0, x8
    ldp      d0, d1, [x8]
    ret      

// -[WCLGVoiceHoldRecognizer setStartLocationInWindow:] IMP=0x84F1C bounds=0x84F1C-0x84F30
loc_84F1C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x898]
    add      x8, x0, x8
    stp      d0, d1, [x8]
    ret      

// -[WCLGVoiceHoldRecognizer .cxx_destruct] IMP=0x84F30 bounds=0x84F30-0x8500C
loc_84F30:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x890]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x88c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x888]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x884]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x880]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x87c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x878]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x874]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x870]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0x868]
    add      x0, x19, x8
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c0c // _objc_destroyWeak
