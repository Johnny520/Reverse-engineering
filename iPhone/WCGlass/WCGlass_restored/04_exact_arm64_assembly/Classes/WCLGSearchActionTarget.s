// Exact ARM64 listing for WCLGSearchActionTarget

// +[WCLGSearchActionTarget sharedTarget] IMP=0x3B5BCC bounds=0x3B5BCC-0x3B5CD8
loc_3B5BCC:
    sub      sp, sp, #0x80
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    adrp     x8, #0x4a0000
    ldr      x10, [x8, #0x740]
    mov      w20, #0x3431
    movk     w20, #0xa771, lsl #16
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x398]
    adrp     x8, #0x3b5000
    add      x8, x8, #0xcd8
    str      d0, [sp, #0x20]
    adrp     x9, #0x4a0000
    add      x9, x9, #0xd88
    stp      x8, x9, [sp, #0x28]
    str      x0, [sp, #0x38]
    adrp     x8, #0x581000
    ldr      x8, [x8, #0xed8]
    stp      x8, x10, [sp, #0x10]
    mov      w21, #0xe768
    movk     w21, #0xccc2, lsl #16
    str      w21, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w22, #0xf80
    movk     w22, #0xd9bc, lsl #16
    mov      w23, #0xbd06
    movk     w23, #0xe5a, lsl #16
    mov      w24, #0xf81
    movk     w24, #0xd9bc, lsl #16
    adrp     x19, #0x581000
    add      x19, x19, #0xed8
    ldr      w8, [sp, #0xc]
    cmp      w8, w22
    b.le     #0x3b5c84
    cmp      w8, w24
    b.eq     #0x3b5ca4
    cmp      w8, w23
    b.ne     #0x3b5c58
    add      x1, sp, #0x18
    mov      x0, x19
    bl       #0x4619d8 // _dispatch_once
    b        #0x3b5ca4
    cmp      w8, w21
    b.ne     #0x3b5cb0
    ldr      x8, [sp, #0x10]
    cmn      x8, #1
    csel     w8, w24, w23, eq
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x3b5c58
    ldr      x8, [sp]
    str      w20, [x8]
    b        #0x3b5c58
    cmp      w8, w20
    b.ne     #0x3b5c58
    adrp     x8, #0x581000
    ldr      x0, [x8, #0xed0]
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    add      sp, sp, #0x80
    b        #0x461cc0 // _objc_retainAutoreleaseReturnValue

// -[WCLGSearchActionTarget searchTapped:] IMP=0x3B5E60 bounds=0x3B5E60-0x3B5F30
loc_3B5E60:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    mov      w20, #0xa592
    movk     w20, #0x9e5e, lsl #16
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      w0, #0
    bl       #0x3ac0fc
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x18]
    cmp      x0, x19
    cset     w8, eq
    strb     w8, [sp, #0x17]
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      w19, #0x6ad1
    movk     w19, #0x97d4, lsl #16
    str      w19, [sp, #0x10]
    add      x8, sp, #0x10
    str      x8, [sp, #8]
    mov      w21, #0xed31
    movk     w21, #0xb5a5, lsl #16
    ldr      w8, [sp, #0x10]
    cmp      w8, w19
    b.eq     #0x3b5efc
    cmp      w8, w21
    b.eq     #0x3b5eec
    cmp      w8, w20
    b.ne     #0x3b5ecc
    b        #0x3b5f1c
    bl       #0x3b40e0
    ldr      x8, [sp, #8]
    str      w20, [x8]
    b        #0x3b5ecc
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    ldrb     w8, [sp, #0x17]
    cmp      w8, #0
    csel     w8, w20, w21, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x3b5ecc
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    ret      
