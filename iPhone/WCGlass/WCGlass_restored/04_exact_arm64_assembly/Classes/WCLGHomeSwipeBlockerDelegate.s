// Exact ARM64 listing for WCLGHomeSwipeBlockerDelegate

// -[WCLGHomeSwipeBlockerDelegate gestureRecognizer:shouldReceiveTouch:] IMP=0x370A18 bounds=0x370A18-0x370B58
loc_370A18:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
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
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    tbz      w22, #0, #0x370a7c
    mov      w20, #0
    b        #0x370b30
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cbz      x0, #0x370b18
    mov      x21, x0
    mov      x26, #0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x410]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x418]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x9a0]
    adrp     x27, #0x4c4000
    ldr      x0, [x27, #0x5d0]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x21
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    tbnz     w0, #0, #0x370b20
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cbz      x25, #0x370b24
    add      x8, x26, #1
    mov      x21, x25
    cmp      x26, #0xb
    mov      x26, x8
    b.lo     #0x370ab8
    b        #0x370b24
    mov      w20, #1
    b        #0x370b30
    mov      x25, x21
    eor      w20, w24, #1
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      

// -[WCLGHomeSwipeBlockerDelegate gestureRecognizerShouldBegin:] IMP=0x370B58 bounds=0x370B58-0x370D08
loc_370B58:
    stp      d9, d8, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x600]
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x410]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x418]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x370c94
    bl       #0x36a330
    cbz      w0, #0x370c94
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x3d8]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa0]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x21
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x370c9c
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cbz      x20, #0x370ca8
    mov      x0, x20
    mov      x1, #0
    bl       #0x370d08
    cbz      w0, #0x370ca8
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x460]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4b0]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d2, #1.25000000
    mov      x8, #-0x3fac000000000000
    fmov     d3, x8
    fcmp     d8, d3
    b.pl     #0x370cb0
    fabs     d3, d8
    fabs     d4, d9
    fmul     d4, d4, d2
    fcmp     d3, d4
    b.le     #0x370cb0
    mov      w22, #1
    b        #0x370cd0
    mov      w22, #0
    b        #0x370ce4
    mov      x20, #0
    mov      w22, #0
    b        #0x370cd4
    mov      w22, #0
    b        #0x370cdc
    fmov     d3, #-8.00000000
    fcmp     d0, d3
    cset     w8, mi
    fabs     d0, d0
    fabs     d1, d1
    fmul     d1, d1, d2
    fcmp     d0, d1
    csel     w22, wzr, w8, le
    mov      x21, x19
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      d9, d8, [sp], #0x50
    ret      

// -[WCLGHomeSwipeBlockerDelegate gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:] IMP=0x37120C bounds=0x37120C-0x371364
loc_37120C:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x20, x3
    mov      x19, x2
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x24, #0x4c4000
    ldr      x0, [x24, #0x600]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x410]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x418]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x19
    tbnz     w0, #0, #0x371298
    ldr      x0, [x24, #0x600]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x20
    cbz      w0, #0x371328
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    cbz      x21, #0x37132c
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x3d8]
    mov      x0, x21
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa0]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x25
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    cbz      w22, #0x37132c
    mov      x0, x21
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x1, #0
    bl       #0x371364
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    eor      w22, w23, #1
    b        #0x371330
    mov      x21, #0
    mov      w22, #1
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    ret      
