// Exact ARM64 listing for WCLGChatTopAvatarOverlayView

// -[WCLGChatTopAvatarOverlayView layoutSubviews] IMP=0x2343D4 bounds=0x2343D4-0x2344CC
loc_2343D4:
    sub      sp, sp, #0x50
    stp      d9, d8, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x738]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x4d8]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d2
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fcmp     d8, d3
    fcsel    d0, d8, d3, mi
    fmov     d1, #0.50000000
    fmul     d8, d0, d1
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0xac8]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x628]
    ldr      x21, [x8]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb50]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      d9, d8, [sp, #0x10]
    add      sp, sp, #0x50
    ret      
