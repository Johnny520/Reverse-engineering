// Exact ARM64 listing for WCLGTextEditorViewController

// -[WCLGTextEditorViewController dealloc] IMP=0x3D5A34 bounds=0x3D5A34-0x3D5AAC
loc_3D5A34:
    sub      sp, sp, #0x30
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1f0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x28]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd80]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x818]
    stp      x19, x8, [sp]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd88]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    add      sp, sp, #0x30
    ret      

// -[WCLGTextEditorViewController initWithTitle:text:placeholder:handler:] IMP=0x3D5AAC bounds=0x3D5AAC-0x3D5C08
loc_3D5AAC:
    sub      sp, sp, #0x60
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x22, x5
    mov      x21, x4
    mov      x20, x3
    mov      x19, x2
    mov      x23, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x818]
    stp      x23, x8, [sp]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb78]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x23, x0
    cbz      x0, #0x3d5bc8
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb80]
    mov      x0, x23
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x900]
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    adrp     x26, #0x4a6000
    add      x26, x26, #0xd8
    cmp      x0, #0
    csel     x1, x26, x0, eq
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe94]
    add      x0, x23, x8
    bl       #0x461cfc // _objc_storeStrong
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    cmp      x0, #0
    csel     x1, x26, x0, eq
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe98]
    add      x0, x23, x8
    bl       #0x461cfc // _objc_storeStrong
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldrsw    x9, [x8, #0xe9c]
    ldr      x8, [x23, x9]
    str      x0, [x23, x9]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    add      sp, sp, #0x60
    ret      

// -[WCLGTextEditorViewController viewDidLoad] IMP=0x3D5C08 bounds=0x3D5C08-0x3D629C
loc_3D5C08:
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
    sub      sp, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x582000
    add      x8, x8, #0x234
    ldar     w9, [x8]
    cbnz     w9, #0x3d5c88
    adrp     x9, #0x55c000
    add      x9, x9, #0x9a8
    ldrh     w10, [x9]
    mov      w11, #0x8e61
    eor      w10, w10, w11
    adrp     x11, #0x55c000
    add      x11, x11, #0x9ae
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x36db
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w9, [x9, #4]
    mov      w10, #0x576a
    eor      w9, w9, w10
    strh     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x8, sp
    sub      x0, x8, #0x10
    mov      sp, x0
    adrp     x9, #0x4c4000
    ldr      x9, [x9, #0x818]
    stp      x19, x9, [x8, #-0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc80]
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x620]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    mov      x0, x19
    stur     x1, [x29, #-0x88]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x460]
    mov      x1, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x328]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c2000
    ldr      x5, [x8, #0x5d8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x650]
    adrp     x2, #0x55c000
    add      x2, x2, #0x9e0
    mov      w3, #2
    mov      x4, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbb0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x378]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x26, #0x4c4000
    ldr      x0, [x26, #0x1f0]
    adrp     x8, #0x4bf000
    ldr      x21, [x8, #0x28]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c2000
    ldr      x24, [x8, #0x5e0]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x420]
    ldr      x4, [x8]
    adrp     x8, #0x4c0000
    ldr      x25, [x8, #0xd78]
    mov      x1, x25
    mov      x2, x19
    mov      x3, x24
    mov      x5, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x1f0]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x428]
    ldr      x4, [x8]
    mov      x1, x25
    mov      x2, x19
    mov      x3, x24
    mov      x5, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xf8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0xb38]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x608]
    ldp      d8, d9, [x8]
    ldp      d10, d11, [x8, #0x10]
    mov      x1, x24
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c2000
    ldr      x23, [x8, #0x5e8]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x3d5edc
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x0, x21
    stur     x1, [x29, #-0x90]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x8, [x8, #0x5f0]
    stur     x8, [x29, #-0x98]
    b        #0x3d5f1c
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x5f0]
    mov      x0, x19
    stur     x1, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x0, x21
    stur     x1, [x29, #-0x90]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x380]
    ldr      d12, [x8]
    adrp     x8, #0x4bf000
    ldr      x26, [x8, #0x230]
    fmov     d0, #17.00000000
    mov      x1, x26
    fmov     d1, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0xec8]
    mov      x0, x21
    mov      x1, x27
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    adrp     x20, #0x4c4000
    ldr      x0, [x20, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x458]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x0, x21
    mov      x1, x22
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x28, [x8, #0xac8]
    mov      x0, x21
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, #14.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xe80]
    fmov     d0, #14.00000000
    fmov     d1, #12.00000000
    fmov     d2, #14.00000000
    fmov     d3, #12.00000000
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbf8]
    mov      x0, x21
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x20, #0x90]
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x160]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x21
    mov      x1, x22
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldr      x0, [x20, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x2f8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xea8]
    mov      x0, x21
    mov      x1, x22
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x628]
    ldr      x25, [x8]
    mov      x0, x21
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb50]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldur     x23, [x29, #-0x88]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x28, [x8, #0xb40]
    mov      x1, x28
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x5f8]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x1, x24
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x7f8]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    fmov     d0, #13.00000000
    mov      x1, x26
    fmov     d1, d12
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x24
    mov      x1, x27
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldr      x0, [x20, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc18]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x24
    mov      x1, x22
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldur     x1, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x24
    ldur     x1, [x29, #-0x90]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x28
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x600]
    mov      x0, x19
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    sub      sp, x29, #0x80
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    ldp      d11, d10, [sp, #0x10]
    ldp      d13, d12, [sp], #0x90
    ret      

// -[WCLGTextEditorViewController viewDidLayoutSubviews] IMP=0x3D629C bounds=0x3D629C-0x3D62EC
loc_3D629C:
    sub      sp, sp, #0x30
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x818]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x390]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x608]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    add      sp, sp, #0x30
    ret      

// -[WCLGTextEditorViewController layoutTextEditorViews] IMP=0x3D62EC bounds=0x3D62EC-0x3D6548
loc_3D62EC:
    stp      d13, d12, [sp, #-0x70]!
    stp      d11, d10, [sp, #0x10]
    stp      d9, d8, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x3d8]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x190]
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    fmov     d10, d2
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x4d8]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    fmov     d8, d0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    fmov     d0, #18.00000000
    fadd     d9, d9, d0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616b4 // _CGRectGetHeight
    fsub     d10, d0, d10
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x610]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fsub     d0, d10, d0
    mov      x8, #-0x3fa9000000000000
    fmov     d1, x8
    fadd     d10, d0, d1
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    fsub     d0, d10, d9
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x8e8]
    fmaxnm   d0, d0, d1
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x510]
    fcmp     d0, d1
    fcsel    d10, d1, d0, gt
    mov      x8, #-0x3fc0000000000000
    fmov     d0, x8
    fadd     d0, d8, d0
    fmov     d12, #1.00000000
    fmaxnm   d11, d0, d12
    adrp     x8, #0x4c2000
    ldr      x22, [x8, #0x618]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x678]
    fmov     d0, #16.00000000
    mov      x1, x20
    fmov     d1, d9
    fmov     d2, d11
    fmov     d3, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x21, [x8, #0x620]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x8, #-0x3fbc000000000000
    fmov     d0, x8
    fadd     d0, d8, d0
    fmaxnm   d8, d0, d12
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x248]
    mov      x8, #0x7fefffffffffffff
    fmov     d1, x8
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d1
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x770]
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616cc // _CGRectGetMaxY
    fmov     d1, #10.00000000
    fadd     d10, d0, d1
    frintp   d0, d9
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x5b8]
    fcmp     d0, d1
    fcsel    d9, d1, d0, gt
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    fmov     d0, #20.00000000
    mov      x1, x20
    fmov     d1, d10
    fmov     d2, d8
    fmov     d3, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    ldp      d11, d10, [sp, #0x10]
    ldp      d13, d12, [sp], #0x70
    b        #0x461c9c // _objc_release

// -[WCLGTextEditorViewController viewDidAppear:] IMP=0x3D6548 bounds=0x3D6548-0x3D65B8
loc_3D6548:
    sub      sp, sp, #0x30
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x818]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x380]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x618]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    add      sp, sp, #0x30
    ret      

// -[WCLGTextEditorViewController keyboardFrameChanged:] IMP=0x3D65B8 bounds=0x3D65B8-0x3D6860
loc_3D65B8:
    sub      sp, sp, #0xa0
    stp      d13, d12, [sp, #0x30]
    stp      d11, d10, [sp, #0x40]
    stp      d9, d8, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      x20, x2
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x21, [x8, #0x988]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x418]
    ldr      x2, [x8]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x528]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x778]
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x3d8]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xf0]
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616b4 // _CGRectGetHeight
    fmov     d12, d0
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616fc // _CGRectGetMinY
    fsub     d8, d12, d0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    fmov     d0, xzr
    fmaxnm   d8, d8, d0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x3f8]
    ldr      x2, [x8]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4a0]
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x3f0]
    ldr      x2, [x8]
    mov      x0, x21
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4e8]
    bl       #0x461c6c // _objc_msgSend
    lsl      x22, x0, #0x10
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x628]
    mov      x0, x19
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    fcmp     d9, #0.0
    fmov     d0, #0.25000000
    fcsel    d0, d9, d0, gt
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp, #8]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x388]
    adrp     x8, #0x3d6000
    add      x8, x8, #0x860
    adrp     x9, #0x4a1000
    add      x9, x9, #0xa00
    str      d1, [sp, #0x10]
    stp      x8, x9, [sp, #0x18]
    str      x19, [sp, #0x28]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xe60]
    fmov     d1, xzr
    add      x3, sp, #8
    mov      x2, x22
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      d9, d8, [sp, #0x50]
    ldp      d11, d10, [sp, #0x40]
    ldp      d13, d12, [sp, #0x30]
    add      sp, sp, #0xa0
    ret      

// -[WCLGTextEditorViewController saveTapped] IMP=0x3D6870 bounds=0x3D6870-0x3D6970
loc_3D6870:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c2000
    ldr      x20, [x8, #0x630]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461c9c // _objc_release
    cbz      x21, #0x3d6928
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x618]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x7a0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4a6000
    add      x8, x8, #0xd8
    cmp      x0, #0
    csel     x1, x8, x0, eq
    ldr      x8, [x20, #0x10]
    mov      x0, x20
    blr      x8
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x758]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461d38 // _objc_unsafeClaimAutoreleasedReturnValue
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release

// -[WCLGTextEditorViewController initialText] IMP=0x3D6970 bounds=0x3D6970-0x3D6980
loc_3D6970:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe94]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGTextEditorViewController setInitialText:] IMP=0x3D6980 bounds=0x3D6980-0x3D698C
loc_3D6980:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xe94]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGTextEditorViewController placeholderText] IMP=0x3D698C bounds=0x3D698C-0x3D699C
loc_3D698C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe98]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGTextEditorViewController setPlaceholderText:] IMP=0x3D699C bounds=0x3D699C-0x3D69A8
loc_3D699C:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xe98]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGTextEditorViewController saveHandler] IMP=0x3D69A8 bounds=0x3D69A8-0x3D69B8
loc_3D69A8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe9c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGTextEditorViewController setSaveHandler:] IMP=0x3D69B8 bounds=0x3D69B8-0x3D69C4
loc_3D69B8:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xe9c]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGTextEditorViewController textView] IMP=0x3D69C4 bounds=0x3D69C4-0x3D69D4
loc_3D69C4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xea0]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGTextEditorViewController setTextView:] IMP=0x3D69D4 bounds=0x3D69D4-0x3D69E8
loc_3D69D4:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xea0]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGTextEditorViewController hintLabel] IMP=0x3D69E8 bounds=0x3D69E8-0x3D69F8
loc_3D69E8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xea4]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGTextEditorViewController setHintLabel:] IMP=0x3D69F8 bounds=0x3D69F8-0x3D6A0C
loc_3D69F8:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xea4]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGTextEditorViewController keyboardOverlap] IMP=0x3D6A0C bounds=0x3D6A0C-0x3D6A1C
loc_3D6A0C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xea8]
    ldr      d0, [x0, x8]
    ret      

// -[WCLGTextEditorViewController setKeyboardOverlap:] IMP=0x3D6A1C bounds=0x3D6A1C-0x3D6A2C
loc_3D6A1C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xea8]
    str      d0, [x0, x8]
    ret      

// -[WCLGTextEditorViewController .cxx_destruct] IMP=0x3D6A2C bounds=0x3D6A2C-0x3D6AA8
loc_3D6A2C:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xea4]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xea0]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe9c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe98]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe94]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
