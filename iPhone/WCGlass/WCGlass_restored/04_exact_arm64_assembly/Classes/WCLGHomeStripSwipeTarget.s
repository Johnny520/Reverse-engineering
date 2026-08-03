// Exact ARM64 listing for WCLGHomeStripSwipeTarget

// +[WCLGHomeStripSwipeTarget shared] IMP=0x3715EC bounds=0x3715EC-0x37161C
loc_3715EC:
    adrp     x8, #0x581000
    ldr      x8, [x8, #0x448]
    cmn      x8, #1
    b.ne     #0x371608
    adrp     x8, #0x581000
    ldr      x0, [x8, #0x440]
    b        #0x461cc0 // _objc_retainAutoreleaseReturnValue
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    bl       #0x460af4
    ldp      x29, x30, [sp], #0x10
    b        #0x3715fc

// -[WCLGHomeStripSwipeTarget handleSwipe:] IMP=0x371650 bounds=0x371650-0x371844
loc_371650:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x2
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    bl       #0x3445a0
    mov      x20, x0
    bl       #0x332cd8
    tbnz     w20, #0, #0x371684
    cbz      w0, #0x37182c
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x3d8]
    mov      x0, x19
    mov      x1, x20
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
    cbz      w0, #0x371820
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cbz      x20, #0x37182c
    mov      x0, x20
    bl       #0x36a3ac
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    cbz      x0, #0x371814
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x198]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xcd8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xce0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    cmp      x23, #2
    b.lt     #0x37180c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xce8]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    tbz      x0, #0x3f, #0x371788
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe08]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    bic      x24, x0, x0, asr #63
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x4a0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    sub      x8, x24, #1
    cmp      x0, #2
    csinc    x8, x8, x24, ne
    bic      x9, x8, x8, asr #63
    sub      x10, x23, #1
    cmp      x8, x23
    csel     x1, x9, x10, lt
    cmp      x1, x24
    b.eq     #0x37180c
    mov      x0, x21
    bl       #0x36e534
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x238]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x478]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xde0]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x480]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    b        #0x371824
    mov      x20, x21
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461c9c // _objc_release

// -[WCLGHomeStripSwipeTarget gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:] IMP=0x371844 bounds=0x371844-0x37184C
loc_371844:
    mov      w0, #1
    ret      

// -[WCLGHomeStripSwipeTarget gestureRecognizer:shouldReceiveTouch:] IMP=0x37184C bounds=0x37184C-0x37199C
loc_37184C:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x3
    mov      x0, x3
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x3d8]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x31fa44
    cbz      w0, #0x3718b4
    bl       #0x31af7c
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    tbnz     w22, #0, #0x3718bc
    mov      w21, #0
    b        #0x371978
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cbz      x0, #0x371954
    mov      x20, x0
    mov      x25, #0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x410]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x418]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x9a0]
    adrp     x26, #0x4c4000
    ldr      x0, [x26, #0x5d0]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x37196c
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    cbz      x24, #0x371958
    add      x8, x25, #1
    mov      x20, x24
    cmp      x25, #0xb
    mov      x25, x8
    b.lo     #0x3718f8
    b        #0x371958
    mov      x24, #0
    mov      x0, x19
    bl       #0x337034
    eor      w21, w0, #1
    mov      x20, x24
    b        #0x371970
    mov      w21, #0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    ret      
