// Exact ARM64 listing for WCLGImageZoom

// -[WCLGImageZoom initWithImage:] IMP=0x4466B8 bounds=0x4466B8-0x446740
loc_4466B8:
    sub      sp, sp, #0x30
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x830]
    stp      x20, x8, [sp]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb78]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x20, x0
    cbz      x0, #0x446724
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xef0]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb50]
    mov      x0, x20
    mov      w2, #5
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    add      sp, sp, #0x30
    ret      

// -[WCLGImageZoom viewDidLoad] IMP=0x446740 bounds=0x446740-0x446C50
loc_446740:
    sub      sp, sp, #0x70
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x830]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc80]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf0]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3e8]
    fmov     d0, xzr
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x3d8]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x188]
    bl       #0x461ba0 // _objc_alloc
    mov      x21, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x4d8]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xb38]
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0xd0]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x21, [x8, #0xd38]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x448]
    mov      x1, x24
    mov      w2, #0x12
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
    ldr      x1, [x8, #0xc78]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0xd8]
    fmov     d0, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0xe0]
    fmov     d0, #4.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xbe8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x3b8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xb40]
    mov      x0, x26
    mov      x1, x25
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461ba0 // _objc_alloc
    mov      x26, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0xe8]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xb90]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x24
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x430]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb98]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x23
    mov      x1, x25
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x25, #0x4c4000
    ldr      x0, [x25, #0x3f8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x3, [x8, #0xff8]
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x440]
    mov      x1, x23
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x24, [x8, #0x450]
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x3f8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c3000
    ldr      x3, [x8, #0xf0]
    mov      x1, x23
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0xf8]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x24
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x100]
    mov      x0, x22
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    add      sp, sp, #0x70
    ret      

// -[WCLGImageZoom viewForZoomingInScrollView:] IMP=0x446C50 bounds=0x446C50-0x446C5C
loc_446C50:
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb90]
    b        #0x461c6c // _objc_msgSend

// -[WCLGImageZoom doubleTap:] IMP=0x446C5C bounds=0x446C5C-0x446CF0
loc_446C5C:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x20, [x8, #0xd38]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x108]
    bl       #0x461c6c // _objc_msgSend
    fmov     d1, #1.00000000
    fcmp     d0, d1
    fmov     d0, #2.50000000
    fcsel    d0, d1, d0, gt
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x110]
    mov      x0, x21
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGImageZoom dismissSelf] IMP=0x446CF0 bounds=0x446CF0-0x446D04
loc_446CF0:
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb38]
    mov      w2, #1
    mov      x3, #0
    b        #0x461c6c // _objc_msgSend

// -[WCLGImageZoom image] IMP=0x446D04 bounds=0x446D04-0x446D14
loc_446D04:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xef0]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGImageZoom setImage:] IMP=0x446D14 bounds=0x446D14-0x446D28
loc_446D14:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xef0]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGImageZoom scroll] IMP=0x446D28 bounds=0x446D28-0x446D38
loc_446D28:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xef4]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGImageZoom setScroll:] IMP=0x446D38 bounds=0x446D38-0x446D4C
loc_446D38:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xef4]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGImageZoom imageView] IMP=0x446D4C bounds=0x446D4C-0x446D5C
loc_446D4C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xef8]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGImageZoom setImageView:] IMP=0x446D5C bounds=0x446D5C-0x446D70
loc_446D5C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xef8]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGImageZoom .cxx_destruct] IMP=0x446D70 bounds=0x446D70-0x446DC4
loc_446D70:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xef8]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xef4]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xef0]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
