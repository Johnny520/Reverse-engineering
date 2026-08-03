// Exact ARM64 listing for WCLGGetButton

// -[WCLGGetButton initWithFrame:] IMP=0x4454F4 bounds=0x4454F4-0x445E00
loc_4454F4:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x828]
    stp      x0, x8, [sp, #0x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    add      x0, sp, #0x20
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x19, x0
    cbz      x0, #0x445ddc
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x480]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x40]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461bac // _objc_alloc_init
    mov      x21, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x48]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    mov      x23, x8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf0]
    str      x1, [sp, #0x10]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x490]
    fmov     d0, #0.50000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c3000
    ldr      x22, [x8, #0x50]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    str      x1, [sp, #0x18]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0xb40]
    mov      x0, x19
    mov      x1, x24
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461bac // _objc_alloc_init
    mov      x21, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x58]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x21, [x8, #0x60]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc40]
    mov      x2, x20
    str      x20, [sp, #8]
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
    ldr      x1, [x8, #0x430]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x25
    mov      x1, x24
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461bac // _objc_alloc_init
    mov      x21, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x68]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x360]
    ldr      d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    fmov     d0, #15.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c3000
    ldr      x21, [x8, #0x70]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
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
    ldr      x1, [x8, #0xea8]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1f8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x22
    mov      x1, x24
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x288]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xac8]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x78]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x20, x23
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0xab8]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0xac0]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    adrp     x8, #0x4c3000
    ldr      x25, [x8, #0x80]
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x27, [x8, #0x820]
    mov      x1, x27
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x20, #0x90]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3e0]
    fmov     d0, #0.50000000
    ldr      x1, [sp, #0x10]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x28, [x8, #0x828]
    mov      x1, x28
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x21, [x8, #0x368]
    fmov     d0, #3.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9b0]
    str      x1, [sp, #0x10]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x810]
    str      x1, [sp]
    mov      x0, x20
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x288]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x88]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4c3000
    ldr      x26, [x8, #0x90]
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x1, x27
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #8]
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x25, x0
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x28
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    fmov     d0, #3.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x650]
    ldr      x20, [x8]
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x830]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x98]
    fmov     d0, xzr
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x27, [sp, #0x10]
    mov      x1, x27
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    ldr      x26, [sp]
    mov      x1, x26
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x280]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0xa0]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c3000
    ldr      x21, [x8, #0xa8]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldr      x1, [sp, #0x18]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, #2.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x27
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    mov      x1, x26
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x3, [x8, #0xb0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    mov      x0, x19
    mov      x2, x19
    mov      w4, #0x40
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    ret      

// -[WCLGGetButton setIdleTitle:icon:] IMP=0x445E00 bounds=0x445E00-0x445F00
loc_445E00:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x20, x3
    mov      x21, x2
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x22, [x8, #0x80]
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x1d8]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    mov      x1, x23
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x60]
    mov      x0, x19
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
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x70]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0xb8]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e8]
    mov      x0, x19
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461c6c // _objc_msgSend

// -[WCLGGetButton setDownloading:] IMP=0x445F00 bounds=0x445F00-0x446050
loc_445F00:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x20, x2
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xed0]
    strb     w2, [x0, x8]
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x50]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x9b0]
    mov      x1, x22
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    eor      w21, w20, #1
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x80]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x20, [x8, #0x90]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0xa8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    tbnz     w21, #0, #0x44603c
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x98]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x408]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    ret      

// -[WCLGGetButton setProgress:] IMP=0x446050 bounds=0x446050-0x4460F8
loc_446050:
    stp      d9, d8, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    fmov     d8, d0
    mov      x19, x0
    adrp     x20, #0x4c4000
    ldr      x0, [x20, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x318]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x20, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x320]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #1.00000000
    fcmp     d8, d0
    fcsel    d0, d0, d8, gt
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x408]
    fmaxnm   d8, d0, d1
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x90]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x98]
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [x20, #0x228]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x328]
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      d9, d8, [sp], #0x30
    b        #0x461c6c // _objc_msgSend

// -[WCLGGetButton layoutSubviews] IMP=0x4460F8 bounds=0x4460F8-0x446480
loc_4460F8:
    sub      sp, sp, #0x90
    stp      d13, d12, [sp, #0x10]
    stp      d11, d10, [sp, #0x20]
    stp      d9, d8, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x828]
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
    ldr      x21, [x8, #0x70]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x248]
    mov      x8, #0x4069000000000000
    fmov     d0, x8
    mov      x8, #0x4044000000000000
    fmov     d1, x8
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x8, #0x4041000000000000
    fmov     d10, x8
    fadd     d0, d9, d10
    fmov     d1, #14.00000000
    fadd     d11, d0, d1
    adrp     x8, #0x4c3000
    ldr      x22, [x8, #0x50]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x678]
    fmov     d0, xzr
    fmov     d1, xzr
    mov      x1, x20
    fmov     d2, d11
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    fmov     d12, #0.50000000
    fmul     d11, d8, d12
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    fmov     d0, #-17.00000000
    fadd     d0, d8, d0
    fmul     d11, d0, d12
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x60]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    fmov     d0, #14.00000000
    fmov     d2, #17.00000000
    fmov     d3, #17.00000000
    mov      x1, x20
    fmov     d1, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    fmov     d1, xzr
    mov      x1, x20
    fmov     d0, d10
    fmov     d2, d9
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    fmov     d0, #-30.00000000
    fadd     d0, d8, d0
    fmul     d8, d0, d12
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0xd8]
    fmov     d0, #1.50000000
    fmov     d2, #30.00000000
    fmov     d3, #30.00000000
    fmov     d1, d8
    bl       #0x4616d8 // _CGRectGetMidX
    fmov     d9, d0
    fmov     d0, #1.50000000
    fmov     d2, #30.00000000
    fmov     d3, #30.00000000
    fmov     d1, d8
    bl       #0x4616e4 // _CGRectGetMidY
    fmov     d1, d0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0xc0]
    adrp     x8, #0x492000
    ldr      d3, [x8, #0x5b8]
    adrp     x8, #0x492000
    ldr      d4, [x8, #0x5c0]
    fmov     d2, #15.00000000
    mov      x0, x21
    fmov     d0, d9
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xbe0]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x80]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x25, [x8, #0x818]
    mov      x1, x25
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0x90]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x25
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    fmov     d0, #1.50000000
    fmov     d2, #30.00000000
    fmov     d3, #30.00000000
    fmov     d1, d8
    bl       #0x4616d8 // _CGRectGetMidX
    fmov     d10, #-5.00000000
    fadd     d9, d0, d10
    fmov     d0, #1.50000000
    fmov     d2, #30.00000000
    fmov     d3, #30.00000000
    fmov     d1, d8
    bl       #0x4616e4 // _CGRectGetMidY
    fadd     d8, d0, d10
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0xa8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    fmov     d2, #10.00000000
    fmov     d3, #10.00000000
    mov      x1, x20
    fmov     d0, d9
    fmov     d1, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      d9, d8, [sp, #0x30]
    ldp      d11, d10, [sp, #0x20]
    ldp      d13, d12, [sp, #0x10]
    add      sp, sp, #0x90
    ret      

// -[WCLGGetButton tapped] IMP=0x446480 bounds=0x446480-0x446510
loc_446480:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c3000
    ldr      x1, [x8, #0xc8]
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x446500
    adrp     x8, #0x4c1000
    ldr      x20, [x8, #0xad0]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461c9c // _objc_release
    cbz      x21, #0x446500
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x8, [x0, #0x10]
    blr      x8
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    ret      

// -[WCLGGetButton onTap] IMP=0x446510 bounds=0x446510-0x446520
loc_446510:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xed4]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGGetButton setOnTap:] IMP=0x446520 bounds=0x446520-0x44652C
loc_446520:
    adrp     x8, #0x4c4000
    ldrsw    x3, [x8, #0xed4]
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGetButton pill] IMP=0x44652C bounds=0x44652C-0x44653C
loc_44652C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xed8]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGGetButton setPill:] IMP=0x44653C bounds=0x44653C-0x446550
loc_44653C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xed8]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGGetButton pillIcon] IMP=0x446550 bounds=0x446550-0x446560
loc_446550:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xedc]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGGetButton setPillIcon:] IMP=0x446560 bounds=0x446560-0x446574
loc_446560:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xedc]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGGetButton pillLabel] IMP=0x446574 bounds=0x446574-0x446584
loc_446574:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xee0]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGGetButton setPillLabel:] IMP=0x446584 bounds=0x446584-0x446598
loc_446584:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xee0]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGGetButton track] IMP=0x446598 bounds=0x446598-0x4465A8
loc_446598:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xee4]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGGetButton setTrack:] IMP=0x4465A8 bounds=0x4465A8-0x4465BC
loc_4465A8:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xee4]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGGetButton ring] IMP=0x4465BC bounds=0x4465BC-0x4465CC
loc_4465BC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xee8]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGGetButton setRing:] IMP=0x4465CC bounds=0x4465CC-0x4465E0
loc_4465CC:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xee8]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGGetButton stopSquare] IMP=0x4465E0 bounds=0x4465E0-0x4465F0
loc_4465E0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xeec]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGGetButton setStopSquare:] IMP=0x4465F0 bounds=0x4465F0-0x446604
loc_4465F0:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xeec]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGGetButton downloading] IMP=0x446604 bounds=0x446604-0x446614
loc_446604:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xed0]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGGetButton .cxx_destruct] IMP=0x446614 bounds=0x446614-0x4466B8
loc_446614:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xeec]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xee8]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xee4]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xee0]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xedc]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xed8]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xed4]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
