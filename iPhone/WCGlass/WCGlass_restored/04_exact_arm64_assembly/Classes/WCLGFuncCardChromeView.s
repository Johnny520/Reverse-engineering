// Exact ARM64 listing for WCLGFuncCardChromeView

// -[WCLGFuncCardChromeView traitCollectionDidChange:] IMP=0x31D90C bounds=0x31D90C-0x31D9B4
loc_31D90C:
    sub      sp, sp, #0x40
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x20, x2
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7c8]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x398]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, sp
    mov      x1, x21
    mov      x2, x20
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3f0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x408]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cbz      w22, #0x31d9a0
    mov      x0, x19
    bl       #0x31d5d0
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    add      sp, sp, #0x40
    ret      
