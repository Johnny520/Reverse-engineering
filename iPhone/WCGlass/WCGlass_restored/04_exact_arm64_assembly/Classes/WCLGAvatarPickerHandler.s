// Exact ARM64 listing for WCLGAvatarPickerHandler

// -[WCLGAvatarPickerHandler imagePickerController:didFinishPickingMediaWithInfo:] IMP=0x11A280 bounds=0x11A280-0x11A4A8
loc_11A280:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x20, x3
    mov      x19, x2
    mov      x21, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x3e0]
    ldr      x2, [x8]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x528]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x27, #0x4c4000
    ldr      x0, [x27, #0x80]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x410]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x418]
    mov      x0, x22
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x11a348
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x3e8]
    ldr      x2, [x8]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x22, x23
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb28]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb30]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x0, [x27, #0x80]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x22
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x11a3e8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x11a3e8
    mov      x0, x22
    mov      x1, x23
    bl       #0x11c5c4
    cbz      w0, #0x11a3e8
    adrp     x8, #0x4a5000
    add      x8, x8, #0x640
    ldr      x0, [x8]
    mov      x1, x22
    bl       #0x39cc5c
    mov      x29, x29
    bl       #0x461d38 // _objc_unsafeClaimAutoreleasedReturnValue
    mov      w8, #1
    b        #0x11a3ec
    mov      w8, #0
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x748]
    str      x9, [sp]
    adrp     x9, #0x491000
    ldr      d0, [x9, #0x388]
    str      d0, [sp, #8]
    adrp     x9, #0x11a000
    add      x9, x9, #0x4a8
    adrp     x10, #0x4a1000
    add      x10, x10, #0xb10
    stp      x9, x10, [sp, #0x10]
    strb     w8, [sp, #0x28]
    str      x24, [sp, #0x20]
    adrp     x8, #0x4bf000
    ldr      x25, [x8, #0xb38]
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    mov      x3, sp
    mov      x0, x19
    mov      x1, x25
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb40]
    mov      x0, x21
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    ret      

// -[WCLGAvatarPickerHandler imagePickerControllerDidCancel:] IMP=0x11A50C bounds=0x11A50C-0x11A550
loc_11A50C:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb38]
    mov      x0, x2
    mov      w2, #1
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb40]
    mov      x0, x19
    mov      x2, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c6c // _objc_msgSend

// -[WCLGAvatarPickerHandler wxid] IMP=0x11A550 bounds=0x11A550-0x11A558
loc_11A550:
    ldr      x0, [x0, #8]
    ret      

// -[WCLGAvatarPickerHandler setWxid:] IMP=0x11A558 bounds=0x11A558-0x11A560
loc_11A558:
    mov      w3, #8
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGAvatarPickerHandler onDone] IMP=0x11A560 bounds=0x11A560-0x11A568
loc_11A560:
    ldr      x0, [x0, #0x10]
    ret      

// -[WCLGAvatarPickerHandler setOnDone:] IMP=0x11A568 bounds=0x11A568-0x11A570
loc_11A568:
    mov      w3, #0x10
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGAvatarPickerHandler retainSelf] IMP=0x11A570 bounds=0x11A570-0x11A578
loc_11A570:
    ldr      x0, [x0, #0x18]
    ret      

// -[WCLGAvatarPickerHandler setRetainSelf:] IMP=0x11A578 bounds=0x11A578-0x11A584
loc_11A578:
    mov      x1, x2
    add      x0, x0, #0x18
    b        #0x461cfc // _objc_storeStrong

// -[WCLGAvatarPickerHandler .cxx_destruct] IMP=0x11A584 bounds=0x11A584-0x11A5C0
loc_11A584:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    add      x0, x0, #0x18
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x10
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
