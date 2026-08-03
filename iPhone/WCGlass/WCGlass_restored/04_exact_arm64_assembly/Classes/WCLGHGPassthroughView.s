// Exact ARM64 listing for WCLGHGPassthroughView

// -[WCLGHGPassthroughView hitTest:withEvent:] IMP=0x337404 bounds=0x337404-0x33746C
loc_337404:
    sub      sp, sp, #0x30
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7e8]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xa98]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    cmp      x0, x19
    csel     x19, xzr, x0, eq
    mov      x0, x19
    bl       #0x461cc0 // _objc_retainAutoreleaseReturnValue
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    add      sp, sp, #0x30
    ret      
