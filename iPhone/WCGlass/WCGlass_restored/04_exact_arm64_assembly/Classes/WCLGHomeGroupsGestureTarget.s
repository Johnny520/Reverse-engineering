// Exact ARM64 listing for WCLGHomeGroupsGestureTarget

// -[WCLGHomeGroupsGestureTarget gestureRecognizerShouldBegin:] IMP=0x36F244 bounds=0x36F244-0x36F248
loc_36F244:
    b        #0x36a330

// -[WCLGHomeGroupsGestureTarget gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:] IMP=0x36F248 bounds=0x36F248-0x36F250
loc_36F248:
    mov      w0, #1
    ret      

// -[WCLGHomeGroupsGestureTarget wclgHandleLongPress:] IMP=0x36F250 bounds=0x36F250-0x3703A4
loc_36F250:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    sub      sp, sp, #0xb0
    mov      x19, x2
    adrp     x8, #0x581000
    add      x8, x8, #0x610
    ldar     w9, [x8]
    cbnz     w9, #0x36f5a8
    adrp     x9, #0x54f000
    add      x9, x9, #0xc84
    ldrh     w10, [x9]
    mov      w11, #0xf595
    eor      w10, w10, w11
    adrp     x11, #0x54f000
    add      x11, x11, #0xc8c
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x4814
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xb6ce
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w9, [x9, #6]
    mov      w10, #0x6049
    eor      w9, w9, w10
    strh     w9, [x11, #6]
    adrp     x9, #0x54f000
    add      x9, x9, #0xc4c
    ldrh     w10, [x9]
    mov      w11, #0x7618
    adrp     x12, #0x54f000
    add      x12, x12, #0xc56
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x3d60
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0xee87
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0xd0e8
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x46c6
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    adrp     x9, #0x54f000
    add      x9, x9, #0xc6c
    ldrh     w10, [x9]
    mov      w11, #0x9029
    adrp     x12, #0x54f000
    add      x12, x12, #0xc78
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0xa812
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0xd702
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x536d
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0x79d8
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w9, [x9, #0xa]
    mov      w10, #0x800c
    eor      w9, w9, w10
    strh     w9, [x12, #0xa]
    adrp     x9, #0x54f000
    add      x9, x9, #0xc60
    ldrh     w10, [x9]
    mov      w11, #0xede1
    eor      w10, w10, w11
    adrp     x11, #0x54f000
    add      x11, x11, #0xc66
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x17ec
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0xa049
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    adrp     x9, #0x54f000
    add      x9, x9, #0xc24
    ldrh     w10, [x9]
    mov      w11, #0x6f76
    eor      w10, w10, w11
    adrp     x11, #0x54f000
    add      x11, x11, #0xc2e
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x21e6
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xd076
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x7163
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x6633
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x54f000
    add      x9, x9, #0xc38
    ldrh     w10, [x9]
    mov      w11, #0xcf8
    eor      w10, w10, w11
    adrp     x11, #0x54f000
    add      x11, x11, #0xc42
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xc80f
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xbf59
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x28fb
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x29a6
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x54f000
    add      x9, x9, #0xc10
    ldrh     w10, [x9]
    mov      w11, #0x7137
    eor      w10, w10, w11
    adrp     x11, #0x54f000
    add      x11, x11, #0xc1a
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x3494
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x6730
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x1b5
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x3aa8
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x54f000
    add      x9, x9, #0xbfc
    ldrh     w10, [x9]
    mov      w11, #0xb1fb
    eor      w10, w10, w11
    adrp     x11, #0x54f000
    add      x11, x11, #0xc06
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xb04c
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xcf0d
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x1866
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x7956
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x54f000
    add      x9, x9, #0xbf0
    ldrh     w10, [x9]
    mov      w11, #0xcd2c
    eor      w10, w10, w11
    adrp     x11, #0x54f000
    add      x11, x11, #0xbf6
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x6f92
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x8bca
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x20, sp, #0x40
    mov      sp, x20
    sub      x22, sp, #0x40
    mov      sp, x22
    sub      x24, sp, #0x30
    mov      sp, x24
    sub      x23, sp, #0x30
    mov      sp, x23
    sub      x25, sp, #0x40
    mov      sp, x25
    sub      x27, sp, #0x30
    mov      sp, x27
    sub      x28, sp, #0x40
    mov      sp, x28
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x3d0]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    b.ne     #0x37031c
    bl       #0x36a330
    cbz      w0, #0x37031c
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x3d8]
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x370314
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x8, x0
    mov      x0, x21
    mov      x21, x8
    bl       #0x461c9c // _objc_release
    cbz      x21, #0x37031c
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x458]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x58]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cbz      x0, #0x370310
    stp      x22, x20, [x29, #-0xb8]
    stur     x26, [x29, #-0xc8]
    mov      x22, x21
    mov      x21, x0
    mov      x0, x22
    bl       #0x36a3ac
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x70]
    bl       #0x368c4c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    bl       #0x344340
    mov      x26, x21
    stp      x21, x22, [x29, #-0x88]
    stur     x20, [x29, #-0x78]
    cbz      w0, #0x36f7d8
    ldur     x0, [x29, #-0x70]
    bl       #0x365c80
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x5e0]
    mov      x0, x21
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, x20
    b.ge     #0x36f730
    mov      x26, x21
    b        #0x3702f0
    bl       #0x3446e4
    cbz      w0, #0x36f77c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x198]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xcd8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xce8]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldur     x21, [x29, #-0x88]
    tbz      x20, #0x3f, #0x36f790
    b        #0x36f728
    ldur     x21, [x29, #-0x88]
    mov      x0, x21
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    sub      x20, x0, x20
    adrp     x8, #0x4c4000
    ldr      x26, [x8, #0x1a0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5f0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xcf0]
    mov      x0, x26
    mov      x3, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldur     x20, [x29, #-0x78]
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    mov      x21, #0
    cbz      x20, #0x36f82c
    mov      x20, x26
    cbz      x26, #0x36f938
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    bl       #0x344340
    cbz      w0, #0x36f834
    ldur     x22, [x29, #-0x78]
    mov      x0, x22
    mov      x1, x26
    bl       #0x36d858
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    b        #0x36f84c
    mov      x20, x26
    b        #0x36f938
    ldur     x22, [x29, #-0x78]
    mov      x0, x22
    mov      x1, x26
    bl       #0x36cf70
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    cmp      x0, #0
    csel     x20, x26, x0, eq
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xcc0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    mov      x0, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    stur     x20, [x29, #-0x90]
    cbz      w0, #0x36f928
    adrp     x8, #0x54e000
    ldr      x8, [x8, #0xf88]
    stur     x8, [x29, #-0x98]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x26, [x29, #-0xa8]
    mov      x26, x0
    mov      x0, x22
    ldur     x1, [x29, #-0x98]
    mov      x2, x26
    mov      w3, #1
    bl       #0x461ce4 // _objc_setAssociatedObject
    mov      x0, x26
    ldur     x26, [x29, #-0xa8]
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    adrp     x22, #0x54e000
    mov      x1, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldr      x1, [x22, #0xf88]
    ldur     x0, [x29, #-0x78]
    mov      x2, #0
    mov      x3, #0
    bl       #0x461ce4 // _objc_setAssociatedObject
    b        #0x36f92c
    mov      x21, #0
    ldur     x20, [x29, #-0x90]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x78]
    bl       #0x461c9c // _objc_release
    stur     x20, [x29, #-0x90]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x33cd84
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x338]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x3702d8
    stur     x20, [x29, #-0x98]
    mov      x0, x21
    bl       #0x33f4b4
    stur     x0, [x29, #-0xe0]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x198]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xcd8]
    stur     x1, [x29, #-0xe8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x344340
    stur     x26, [x29, #-0xa8]
    stp      x21, x22, [x29, #-0xd8]
    cbz      w0, #0x36f9f8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5e0]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf60]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    b        #0x36fa18
    bl       #0x343bc0
    cbz      w0, #0x36fa6c
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x60]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    cbz      x0, #0x36fa70
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd00]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x36fa70
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xdd0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xa0]
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    b        #0x36fa74
    mov      x21, #0
    stur     xzr, [x29, #-0xa0]
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
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
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x68]
    ldp      x2, x22, [x29, #-0x88]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    ldur     x20, [x29, #-0x98]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    ldur     x21, [x29, #-0x70]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    stur     x26, [x29, #-0xc0]
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    ldur     x0, [x29, #-0xa0]
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    ldur     x1, [x29, #-0xd0]
    bl       #0x461c6c // _objc_msgSend
    cbz      x21, #0x37028c
    cbz      x0, #0x37028c
    ldur     x0, [x29, #-0x70]
    bl       #0x372dfc
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xdb8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461c9c // _objc_release
    cbnz     x21, #0x370284
    stur     x26, [x29, #-0x100]
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
    stur     x0, [x29, #-0xf0]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x318]
    sub      x9, x29, #8
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x54f000
    add      x8, x8, #0xe80
    adrp     x9, #0x54f000
    add      x9, x9, #0xec0
    ldur     x22, [x29, #-0xe0]
    cmp      x22, #0
    csel     x8, x9, x8, gt
    sub      x9, x29, #0x10
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    ldur     x20, [x29, #-0xb0]
    str      x8, [x20]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    str      d8, [x20, #8]
    adrp     x8, #0x374000
    add      x8, x8, #0x954
    adrp     x9, #0x4a5000
    add      x9, x9, #0x220
    stp      x8, x9, [x20, #0x10]
    ldur     x21, [x29, #-0x98]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    str      x21, [x20, #0x20]
    str      x22, [x20, #0x30]
    ldur     x26, [x29, #-0x70]
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    str      x26, [x20, #0x28]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb08]
    stur     x1, [x29, #-0xf8]
    sub      x8, x29, #8
    ldur     x0, [x8, #-0x100]
    sub      x8, x29, #0x10
    ldur     x2, [x8, #-0x100]
    mov      x3, #0
    mov      x4, x20
    mov      x20, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb10]
    stur     x1, [x29, #-0xe0]
    ldur     x0, [x29, #-0xf0]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0x318]
    ldur     x22, [x29, #-0xb8]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x22]
    str      d8, [x22, #8]
    adrp     x8, #0x374000
    add      x8, x8, #0xd24
    adrp     x9, #0x4a5000
    add      x9, x9, #0x250
    stp      x8, x9, [x22, #0x10]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    str      x20, [x22, #0x20]
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    str      x26, [x22, #0x28]
    ldur     x0, [x29, #-0x80]
    bl       #0x461ca8 // _objc_retain
    str      x0, [x22, #0x30]
    ldur     x26, [x29, #-0xf8]
    adrp     x2, #0x54f000
    add      x2, x2, #0xd00
    mov      x0, x21
    mov      x1, x26
    mov      x3, #0
    mov      x4, x22
    ldur     x22, [x29, #-0xe0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldur     x0, [x29, #-0xf0]
    mov      x1, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x374ef0
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461c9c // _objc_release
    adrp     x9, #0x4a5000
    add      x9, x9, #0xc0
    cbz      x21, #0x36fdb8
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x24]
    str      d8, [x24, #8]
    adrp     x8, #0x375000
    add      x8, x8, #0x2f0
    stp      x8, x9, [x24, #0x10]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    str      x20, [x24, #0x20]
    ldur     x0, [x29, #-0x70]
    bl       #0x461ca8 // _objc_retain
    str      x0, [x24, #0x28]
    adrp     x2, #0x54f000
    add      x2, x2, #0xdc0
    mov      x0, x21
    mov      x1, x26
    mov      x3, #0
    mov      x4, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldur     x0, [x29, #-0xf0]
    mov      x1, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x24, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x24, #0x20]
    bl       #0x461c9c // _objc_release
    adrp     x9, #0x4a5000
    add      x9, x9, #0xc0
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x23]
    str      d8, [x23, #8]
    adrp     x8, #0x375000
    add      x8, x8, #0x7d8
    stp      x8, x9, [x23, #0x10]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    str      x20, [x23, #0x20]
    ldur     x24, [x29, #-0xc0]
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    str      x24, [x23, #0x28]
    adrp     x2, #0x54f000
    add      x2, x2, #0xd80
    mov      x0, x21
    mov      x1, x26
    mov      x3, #0
    mov      x4, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldur     x26, [x29, #-0xf0]
    mov      x0, x26
    mov      x1, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0x318]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x25]
    str      d8, [x25, #8]
    adrp     x8, #0x375000
    add      x9, x8, #0x7e8
    adrp     x8, #0x4a5000
    add      x8, x8, #0x250
    stp      x9, x8, [x25, #0x10]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    str      x20, [x25, #0x20]
    ldur     x0, [x29, #-0x70]
    bl       #0x461ca8 // _objc_retain
    str      x0, [x25, #0x28]
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    str      x24, [x25, #0x30]
    adrp     x2, #0x54f000
    add      x2, x2, #0xe40
    mov      x0, x21
    ldur     x24, [x29, #-0xf8]
    mov      x1, x24
    mov      x3, #0
    mov      x4, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x26
    mov      x1, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa0]
    ldur     x1, [x29, #-0xd0]
    bl       #0x461c6c // _objc_msgSend
    adrp     x20, #0x4a0000
    ldr      x20, [x20, #0x748]
    cbz      x0, #0x370034
    mov      x22, x24
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x198]
    ldur     x1, [x29, #-0xe8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf58]
    ldur     x2, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cbz      x24, #0x370028
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd00]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x370028
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd10]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xa08]
    ldur     x2, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cbz      w26, #0x370028
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x26, [x8, #0x318]
    str      x20, [x27]
    str      d8, [x27, #8]
    adrp     x8, #0x376000
    add      x9, x8, #0x2c
    adrp     x8, #0x4a5000
    add      x8, x8, #0xc0
    stp      x9, x8, [x27, #0x10]
    str      x0, [x27, #0x20]
    ldur     x0, [x29, #-0x98]
    bl       #0x461ca8 // _objc_retain
    str      x0, [x27, #0x28]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    adrp     x2, #0x54f000
    add      x2, x2, #0xcc0
    mov      x0, x26
    mov      x1, x22
    mov      x3, #0
    mov      x4, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    ldur     x0, [x29, #-0xf0]
    ldur     x1, [x29, #-0xe0]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldr      x0, [x27, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x27, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x24, x22
    adrp     x22, #0x4c4000
    ldr      x21, [x22, #0x318]
    str      x20, [x28]
    str      d8, [x28, #8]
    adrp     x8, #0x376000
    add      x8, x8, #0x168
    adrp     x9, #0x4a5000
    add      x9, x9, #0x280
    stp      x8, x9, [x28, #0x10]
    ldur     x0, [x29, #-0x70]
    bl       #0x461ca8 // _objc_retain
    str      x0, [x28, #0x20]
    ldur     x0, [x29, #-0x98]
    bl       #0x461ca8 // _objc_retain
    str      x0, [x28, #0x28]
    ldur     x0, [x29, #-0x80]
    bl       #0x461ca8 // _objc_retain
    str      x0, [x28, #0x30]
    ldur     x26, [x29, #-0xc0]
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    str      x26, [x28, #0x38]
    adrp     x2, #0x54f000
    add      x2, x2, #0xd40
    mov      x0, x21
    mov      x1, x24
    mov      w3, #2
    mov      x4, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x20, x22
    ldur     x22, [x29, #-0xf0]
    mov      x0, x22
    ldur     x27, [x29, #-0xe0]
    mov      x1, x27
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x20, #0x318]
    adrp     x2, #0x54f000
    add      x2, x2, #0xe00
    mov      x1, x24
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x22
    mov      x1, x27
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb58]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    cbz      x0, #0x3701dc
    cbz      x26, #0x370148
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    b        #0x370160
    ldur     x0, [x29, #-0x100]
    ldur     x1, [x29, #-0xc8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb60]
    mov      x0, x24
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x4d8]
    mov      x0, x26
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616d8 // _CGRectGetMidX
    fmov     d8, d0
    mov      x0, x26
    mov      x1, x21
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
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb70]
    mov      x0, x24
    mov      w2, #0xf
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    ldur     x26, [x29, #-0x100]
    mov      x0, x26
    mov      x2, x22
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldr      x0, [x28, #0x38]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x28, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x28, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x28, #0x20]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x20]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, #0x20]
    bl       #0x461c9c // _objc_release
    ldur     x20, [x29, #-0xb8]
    ldr      x0, [x20, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x20, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x20, #0x20]
    bl       #0x461c9c // _objc_release
    ldur     x20, [x29, #-0xb0]
    ldr      x0, [x20, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x20, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldur     x21, [x29, #-0xa0]
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldur     x22, [x29, #-0xc0]
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x70]
    bl       #0x461c9c // _objc_release
    ldur     x20, [x29, #-0x98]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldur     x21, [x29, #-0xd8]
    ldur     x26, [x29, #-0xa8]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x90]
    bl       #0x461c9c // _objc_release
    ldur     x21, [x29, #-0x80]
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x78]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x70]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x88]
    bl       #0x461c9c // _objc_release
    mov      x0, x21
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
    mov      x20, x0
    cmp      w1, #1
    b.ne     #0x37039c
    mov      x0, x20
    bl       #0x461bf4 // _objc_begin_catch
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [x22, #0xf88]
    ldur     x0, [x29, #-0x78]
    mov      x2, #0
    mov      x3, #0
    bl       #0x461ce4 // _objc_setAssociatedObject
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    bl       #0x461c18 // _objc_end_catch
    mov      x21, #0
    ldur     x26, [x29, #-0xa8]
    b        #0x36f92c
    mov      x20, x0
    bl       #0x461c18 // _objc_end_catch
    mov      x0, x20
    bl       #0x461894 // __Unwind_Resume
