// Exact ARM64 listing for WCLGKeyboardObserver

// +[WCLGKeyboardObserver sharedObserver] IMP=0x3A9C18 bounds=0x3A9C18-0x3A9C8C
loc_3A9C18:
    sub      sp, sp, #0x40
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x740]
    str      x8, [sp, #8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x398]
    str      d0, [sp, #0x10]
    adrp     x8, #0x3a9000
    add      x8, x8, #0xc8c
    adrp     x9, #0x4a0000
    add      x9, x9, #0xd88
    stp      x8, x9, [sp, #0x18]
    str      x0, [sp, #0x28]
    adrp     x8, #0x581000
    ldr      x8, [x8, #0xe00]
    cmn      x8, #1
    b.ne     #0x3a9c78
    adrp     x8, #0x581000
    ldr      x0, [x8, #0xdf8]
    ldp      x29, x30, [sp, #0x30]
    add      sp, sp, #0x40
    b        #0x461cc0 // _objc_retainAutoreleaseReturnValue
    adrp     x0, #0x581000
    add      x0, x0, #0xe00
    add      x1, sp, #8
    bl       #0x4619d8 // _dispatch_once
    b        #0x3a9c64

// -[WCLGKeyboardObserver updateFromNote:visibleHint:] IMP=0x3A9CB4 bounds=0x3A9CB4-0x3AA13C
loc_3A9CB4:
    sub      sp, sp, #0xe0
    stp      d15, d14, [sp, #0x40]
    stp      d13, d12, [sp, #0x50]
    stp      d11, d10, [sp, #0x60]
    stp      d9, d8, [sp, #0x70]
    stp      x28, x27, [sp, #0x80]
    stp      x26, x25, [sp, #0x90]
    stp      x24, x23, [sp, #0xa0]
    stp      x22, x21, [sp, #0xb0]
    stp      x20, x19, [sp, #0xc0]
    stp      x29, x30, [sp, #0xd0]
    add      x29, sp, #0xd0
    mov      x24, x3
    mov      x19, x2
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    str      x8, [sp, #0x38]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x22, [x8, #0x988]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x418]
    ldr      x2, [x8]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x528]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x26, #0x4a0000
    ldr      x26, [x26, #0x608]
    cbz      x20, #0x3a9d84
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x778]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d13, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    b        #0x3a9d8c
    ldp      d13, d9, [x26]
    ldp      d10, d11, [x26, #0x10]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x428]
    ldr      x2, [x8]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x358]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x3a9de4
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x408]
    ldr      x2, [x8]
    mov      x0, x21
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x3a9ff0
    mov      w25, #1
    adrp     x0, #0x581000
    add      x0, x0, #0xe08
    bl       #0x461d68 // _os_unfair_lock_lock
    mov      w24, #0
    adrp     x8, #0x581000
    add      x8, x8, #0xe10
    ldp      q0, q1, [x26]
    stp      q0, q1, [x8]
    adrp     x0, #0x581000
    add      x0, x0, #0xe08
    bl       #0x461d74 // _os_unfair_lock_unlock
    adrp     x8, #0x581000
    strb     w24, [x8, #0xe30]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x3f8]
    ldr      x2, [x8]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x4a0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    mov      x0, x22
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, #0.25000000
    cbz      w0, #0x3a9e90
    mov      x0, x22
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbz      w25, #0x3a9eec
    fmov     d0, #1.00000000
    fcmp     d8, d0
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x3d8]
    fccmp    d8, d0, #8, le
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x850]
    fadd     d0, d8, d0
    adrp     x8, #0x492000
    ldr      d1, [x8, #0x320]
    fcsel    d0, d1, d0, mi
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x490]
    fcmp     d0, d1
    fcsel    d0, d1, d0, mi
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x4e8]
    fminnm   d0, d0, d1
    mov      w8, #4
    b        #0x3a9ef8
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x418]
    mov      w8, #3
    mov      x25, #0
    adrp     x9, #0x492000
    ldr      q1, [x9, #0x330]
    str      q1, [sp, #0x10]
    mov      x9, #0x147b
    movk     x9, #0x47ae, lsl #16
    movk     x9, #0x7ae1, lsl #32
    movk     x9, #0x3fc4, lsl #48
    str      x9, [sp, #0x20]
    str      d0, [sp, #0x28]
    lsl      x26, x8, #3
    add      x27, sp, #0x10
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x3a0]
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x380]
    adrp     x22, #0x4a0000
    ldr      x22, [x22, #0x770]
    adrp     x23, #0x4a5000
    add      x23, x23, #0x7c0
    adrp     x24, #0x4a5000
    add      x24, x24, #0x7a0
    ldr      d0, [x27, x25]
    fcmp     d0, d8
    b.ls     #0x3a9f7c
    fmul     d0, d0, d9
    fcvtzs   x1, d0
    mov      x0, #0
    bl       #0x461a2c // _dispatch_time
    mov      x1, x22
    mov      x2, x23
    bl       #0x46196c // _dispatch_after
    b        #0x3a9f88
    mov      x0, x22
    mov      x1, x24
    bl       #0x461978 // _dispatch_async
    add      x25, x25, #8
    cmp      x26, x25
    b.ne     #0x3a9f50
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x38]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x3aa138
    mov      x0, x19
    ldp      x29, x30, [sp, #0xd0]
    ldp      x20, x19, [sp, #0xc0]
    ldp      x22, x21, [sp, #0xb0]
    ldp      x24, x23, [sp, #0xa0]
    ldp      x26, x25, [sp, #0x90]
    ldp      x28, x27, [sp, #0x80]
    ldp      d9, d8, [sp, #0x70]
    ldp      d11, d10, [sp, #0x60]
    ldp      d13, d12, [sp, #0x50]
    ldp      d15, d14, [sp, #0x40]
    add      sp, sp, #0xe0
    b        #0x461c9c // _objc_release
    fmov     d0, d13
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461744 // _CGRectIsEmpty
    tbz      w0, #0, #0x3aa020
    adrp     x0, #0x581000
    add      x0, x0, #0xe08
    bl       #0x461d68 // _os_unfair_lock_lock
    cbnz     w24, #0x3aa11c
    mov      w25, #0
    b        #0x3a9df4
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x128]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    bl       #0x461c6c // _objc_msgSend
    fmov     d12, d0
    str      d13, [sp, #8]
    fmov     d13, d1
    fmov     d14, d2
    fmov     d15, d3
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    fmov     d0, d12
    fmov     d1, d13
    fmov     d2, d14
    fmov     d3, d15
    bl       #0x461708 // _CGRectGetWidth
    fmov     d8, d0
    fmov     d0, d12
    fmov     d1, d13
    ldr      d13, [sp, #8]
    fmov     d2, d14
    fmov     d3, d15
    bl       #0x4616b4 // _CGRectGetHeight
    fcmp     d8, d0
    fcsel    d12, d0, d8, mi
    fmov     d0, d13
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616fc // _CGRectGetMinY
    fmov     d8, d0
    fmov     d0, d13
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616cc // _CGRectGetMaxY
    fcmp     d8, d0
    fcsel    d8, d8, d0, mi
    fmov     d0, d13
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x4616b4 // _CGRectGetHeight
    mov      x8, #-0x3fbc000000000000
    fmov     d1, x8
    fadd     d1, d12, d1
    mov      x8, #0x4054000000000000
    fmov     d2, x8
    fcmp     d0, d2
    fccmp    d8, d1, #0, ge
    b.mi     #0x3aa110
    mov      w25, #0
    b        #0x3a9de8
    adrp     x0, #0x581000
    add      x0, x0, #0xe08
    bl       #0x461d68 // _os_unfair_lock_lock
    mov      w25, #0
    adrp     x8, #0x581000
    add      x8, x8, #0xe10
    stp      d13, d9, [x8]
    stp      d10, d11, [x8, #0x10]
    mov      w24, #1
    b        #0x3a9e08
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGKeyboardObserver keyboardWillShow:] IMP=0x3AA13C bounds=0x3AA13C-0x3AA14C
loc_3AA13C:
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x2c8]
    mov      w3, #1
    b        #0x461c6c // _objc_msgSend

// -[WCLGKeyboardObserver keyboardWillHide:] IMP=0x3AA14C bounds=0x3AA14C-0x3AA15C
loc_3AA14C:
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x2c8]
    mov      w3, #0
    b        #0x461c6c // _objc_msgSend

// -[WCLGKeyboardObserver keyboardDidShow:] IMP=0x3AA15C bounds=0x3AA15C-0x3AA16C
loc_3AA15C:
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x2c8]
    mov      w3, #1
    b        #0x461c6c // _objc_msgSend

// -[WCLGKeyboardObserver keyboardDidHide:] IMP=0x3AA16C bounds=0x3AA16C-0x3AA17C
loc_3AA16C:
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x2c8]
    mov      w3, #0
    b        #0x461c6c // _objc_msgSend

// -[WCLGKeyboardObserver keyboardWillChangeFrame:] IMP=0x3AA17C bounds=0x3AA17C-0x3AA194
loc_3AA17C:
    adrp     x8, #0x581000
    ldrb     w8, [x8, #0xe30]
    adrp     x9, #0x4c2000
    ldr      x1, [x9, #0x2c8]
    and      w3, w8, #1
    b        #0x461c6c // _objc_msgSend

// -[WCLGKeyboardObserver keyboardDidChangeFrame:] IMP=0x3AA194 bounds=0x3AA194-0x3AA1AC
loc_3AA194:
    adrp     x8, #0x581000
    ldrb     w8, [x8, #0xe30]
    adrp     x9, #0x4c2000
    ldr      x1, [x9, #0x2c8]
    and      w3, w8, #1
    b        #0x461c6c // _objc_msgSend
