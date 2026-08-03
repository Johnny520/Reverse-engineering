// Exact ARM64 listing for WCLGGlassUI

// +[WCLGGlassUI cardColor] IMP=0x2FBF1C bounds=0x2FBF1C-0x2FBF38
loc_2FBF1C:
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x130]
    adrp     x2, #0x4a4000
    add      x2, x2, #0x738
    b        #0x461c6c // _objc_msgSend

// +[WCLGGlassUI cardBorderColor] IMP=0x2FBF8C bounds=0x2FBF8C-0x2FBFA8
loc_2FBF8C:
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x130]
    adrp     x2, #0x4a4000
    add      x2, x2, #0x758
    b        #0x461c6c // _objc_msgSend

// +[WCLGGlassUI accentColor] IMP=0x2FBFFC bounds=0x2FBFFC-0x2FC028
loc_2FBFFC:
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8f8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x668]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x378]
    fmov     d2, #1.00000000
    fmov     d3, #1.00000000
    b        #0x461c6c // _objc_msgSend

// +[WCLGGlassUI themePlaceholderImageForType:] IMP=0x2FC028 bounds=0x2FC028-0x2FC164
loc_2FC028:
    mov      x0, x2
    adrp     x8, #0x580000
    add      x8, x8, #0x778
    ldar     w9, [x8]
    cbnz     w9, #0x2fc098
    adrp     x9, #0x545000
    add      x9, x9, #0x270
    ldrb     w10, [x9]
    adrp     x11, #0x545000
    add      x11, x11, #0x275
    eor      w10, w10, #0xffffff81
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x93
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x50
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x2b
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0x9a
    eor      w9, w9, w10
    strb     w9, [x11, #4]
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      w9, #1
    stlr     w9, [x8]
    mov      x21, sp
    sub      x19, x21, #0x30
    mov      sp, x19
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    adrp     x2, #0x545000
    add      x2, x2, #0x2a0
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    adrp     x9, #0x580000
    add      x9, x9, #0x6e0
    adrp     x10, #0x580000
    add      x10, x10, #0x6e8
    cmp      w0, #0
    adrp     x11, #0x580000
    add      x11, x11, #0x6d0
    adrp     x12, #0x580000
    add      x12, x12, #0x6d8
    csel     x0, x10, x9, ne
    csel     x20, x12, x11, ne
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x740]
    stur     x9, [x21, #-0x30]
    adrp     x9, #0x491000
    ldr      d0, [x9, #0x398]
    stur     d0, [x21, #-0x28]
    adrp     x9, #0x2fc000
    add      x9, x9, #0x164
    adrp     x10, #0x4a1000
    add      x10, x10, #0x9e0
    stp      x9, x10, [x21, #-0x20]
    stur     x20, [x21, #-0x10]
    sturb    w8, [x21, #-8]
    ldr      x8, [x0]
    cmn      x8, #1
    b.ne     #0x2fc158
    ldr      x0, [x20]
    sub      sp, x29, #0x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461cc0 // _objc_retainAutoreleaseReturnValue
    mov      x1, x19
    bl       #0x4619d8 // _dispatch_once
    b        #0x2fc140

// +[WCLGGlassUI showToast:inView:] IMP=0x2FC878 bounds=0x2FC878-0x2FCE94
loc_2FC878:
    sub      sp, sp, #0x190
    stp      d13, d12, [sp, #0x100]
    stp      d11, d10, [sp, #0x110]
    stp      d9, d8, [sp, #0x120]
    stp      x28, x27, [sp, #0x130]
    stp      x26, x25, [sp, #0x140]
    stp      x24, x23, [sp, #0x150]
    stp      x22, x21, [sp, #0x160]
    stp      x20, x19, [sp, #0x170]
    stp      x29, x30, [sp, #0x180]
    add      x29, sp, #0x180
    mov      x20, x3
    mov      x19, x2
    mov      x21, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    cbz      x20, #0x2fce58
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2fce58
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1a8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xd58]
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x2fcdec
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4a8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    cmp      x0, #0
    csel     x21, x20, x0, eq
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc28]
    mov      x0, x21
    mov      w2, #0x4754
    movk     w2, #0x5743, lsl #16
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb30]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461bac // _objc_alloc_init
    mov      x22, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    fmov     d0, #14.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x0, x22
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x458]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x22
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1f8]
    mov      x0, x22
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x7f8]
    mov      x0, x22
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x0, x22
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x4d8]
    mov      x0, x21
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    mov      x8, #-0x3fb8000000000000
    fmov     d1, x8
    fadd     d0, d0, d1
    mov      x8, #0x405e000000000000
    fmov     d1, x8
    fmaxnm   d0, d0, d1
    mov      x8, #0x4074000000000000
    fmov     d2, x8
    fcmp     d0, d2
    fcsel    d8, d2, d0, gt
    mov      x8, #-0x3fc0000000000000
    fmov     d0, x8
    fadd     d0, d8, d0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x248]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    frintp   d0, d0
    mov      x8, #0x4040000000000000
    fmov     d2, x8
    fadd     d0, d0, d2
    mov      x8, #0x405c000000000000
    fmov     d2, x8
    fmaxnm   d0, d0, d2
    fcmp     d8, d0
    fcsel    d8, d8, d0, mi
    frintp   d0, d1
    fmov     d1, #20.00000000
    fadd     d0, d0, d1
    mov      x8, #0x4045000000000000
    fmov     d1, x8
    fmaxnm   d9, d0, d1
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x190]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d2
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x180]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc30]
    mov      w2, #0x14
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x148]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbb8]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc30]
    mov      w2, #0x4754
    movk     w2, #0x5743, lsl #16
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      x0, x24
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    mov      x0, x24
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    fmov     d12, #0.50000000
    fmul     d0, d9, d12
    fmov     d1, #18.00000000
    fcmp     d0, d1
    fcsel    d11, d1, d0, gt
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0xac8]
    mov      x0, x24
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x628]
    ldr      x27, [x8]
    mov      x0, x24
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb50]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461708 // _CGRectGetWidth
    fsub     d0, d0, d8
    fmul     d11, d0, d12
    mov      x0, x21
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616b4 // _CGRectGetHeight
    fsub     d0, d0, d10
    fsub     d0, d0, d9
    mov      x8, #-0x3fae000000000000
    fmov     d1, x8
    fadd     d1, d0, d1
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x678]
    mov      x0, x24
    mov      x1, x26
    fmov     d0, d11
    fmov     d2, d8
    fmov     d3, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, #16.00000000
    fmov     d5, #8.00000000
    bl       #0x461714 // _CGRectInset
    mov      x0, x22
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xaf0]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0xb40]
    mov      x1, x26
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x26
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9c8]
    fmov     d0, xzr
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    add      x8, sp, #0x98
    fmov     d0, xzr
    fmov     d1, #8.00000000
    bl       #0x46154c // _CGAffineTransformMakeTranslation
    ldur     q0, [sp, #0x98]
    ldur     q1, [sp, #0xa8]
    stp      q0, q1, [sp, #0x60]
    ldur     q0, [sp, #0xb8]
    str      q0, [sp, #0x80]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6c8]
    add      x2, sp, #0x60
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x25, [x8, #0x78]
    adrp     x27, #0x4a0000
    ldr      x27, [x27, #0x748]
    str      x27, [sp, #0x38]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    adrp     x8, #0x2fc000
    add      x8, x8, #0xeac
    adrp     x9, #0x4a1000
    add      x9, x9, #0xa00
    str      d8, [sp, #0x40]
    stp      x8, x9, [sp, #0x48]
    str      x24, [sp, #0x58]
    adrp     x8, #0x4c1000
    ldr      x26, [x8, #0x7f0]
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x390]
    add      x2, sp, #0x38
    mov      x0, x25
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    add      x0, sp, #0x30
    mov      x1, x24
    bl       #0x461c54 // _objc_initWeak
    mov      x0, #0
    mov      w1, #0x1000
    movk     w1, #0x5f5e, lsl #16
    bl       #0x461a2c // _dispatch_time
    mov      x25, x0
    str      x27, [sp, #8]
    adrp     x8, #0x2fc000
    add      x8, x8, #0xf10
    str      d8, [sp, #0x10]
    adrp     x9, #0x4a1000
    add      x9, x9, #0xdf0
    stp      x8, x9, [sp, #0x18]
    add      x26, sp, #8
    add      x0, x26, #0x20
    add      x1, sp, #0x30
    bl       #0x461c00 // _objc_copyWeak
    adrp     x1, #0x4a0000
    ldr      x1, [x1, #0x770]
    add      x2, sp, #8
    mov      x0, x25
    bl       #0x46196c // _dispatch_after
    add      x0, x26, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, sp, #0x30
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [sp, #0x58]
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    b        #0x2fce50
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    stur     x8, [x29, #-0xb8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    adrp     x8, #0x2fc000
    add      x8, x8, #0xe94
    stur     d0, [x29, #-0xb0]
    adrp     x9, #0x4a1000
    add      x9, x9, #0x6a8
    stp      x8, x9, [x29, #-0xa8]
    stur     x21, [x29, #-0x88]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    stur     x19, [x29, #-0x98]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    stur     x20, [x29, #-0x90]
    adrp     x0, #0x4a0000
    ldr      x0, [x0, #0x770]
    sub      x1, x29, #0xb8
    bl       #0x461978 // _dispatch_async
    ldur     x0, [x29, #-0x90]
    bl       #0x461c9c // _objc_release
    ldur     x22, [x29, #-0x98]
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x180]
    ldp      x20, x19, [sp, #0x170]
    ldp      x22, x21, [sp, #0x160]
    ldp      x24, x23, [sp, #0x150]
    ldp      x26, x25, [sp, #0x140]
    ldp      x28, x27, [sp, #0x130]
    ldp      d9, d8, [sp, #0x120]
    ldp      d11, d10, [sp, #0x110]
    ldp      d13, d12, [sp, #0x100]
    add      sp, sp, #0x190
    ret      

// +[WCLGGlassUI imageCache] IMP=0x2FD084 bounds=0x2FD084-0x2FD0B4
loc_2FD084:
    adrp     x8, #0x580000
    ldr      x8, [x8, #0x6f8]
    cmn      x8, #1
    b.ne     #0x2fd0a0
    adrp     x8, #0x580000
    ldr      x0, [x8, #0x6f0]
    b        #0x461cc0 // _objc_retainAutoreleaseReturnValue
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    bl       #0x46037c
    ldp      x29, x30, [sp], #0x10
    b        #0x2fd094

// +[WCLGGlassUI imageCacheQueue] IMP=0x2FD118 bounds=0x2FD118-0x2FD148
loc_2FD118:
    adrp     x8, #0x580000
    ldr      x8, [x8, #0x708]
    cmn      x8, #1
    b.ne     #0x2fd134
    adrp     x8, #0x580000
    ldr      x0, [x8, #0x700]
    b        #0x461cc0 // _objc_retainAutoreleaseReturnValue
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    bl       #0x460390
    ldp      x29, x30, [sp], #0x10
    b        #0x2fd128

// +[WCLGGlassUI imageInflightRequests] IMP=0x2FD3C4 bounds=0x2FD3C4-0x2FD3F4
loc_2FD3C4:
    adrp     x8, #0x580000
    ldr      x8, [x8, #0x718]
    cmn      x8, #1
    b.ne     #0x2fd3e0
    adrp     x8, #0x580000
    ldr      x0, [x8, #0x710]
    b        #0x461cc0 // _objc_retainAutoreleaseReturnValue
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    bl       #0x4603a4
    ldp      x29, x30, [sp], #0x10
    b        #0x2fd3d4

// +[WCLGGlassUI normalizedImageURLString:] IMP=0x2FD430 bounds=0x2FD430-0x2FD6A8
loc_2FD430:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x2
    adrp     x8, #0x580000
    add      x8, x8, #0x7cc
    ldar     w9, [x8]
    cbnz     w9, #0x2fd510
    adrp     x9, #0x545000
    add      x9, x9, #0x3ff
    ldrb     w10, [x9]
    mov      w11, #0x19
    eor      w10, w10, w11
    adrp     x11, #0x545000
    add      x11, x11, #0x405
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xe8
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x67
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0xd2
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0xfffffff7
    strb     w10, [x11, #4]
    ldrb     w9, [x9, #5]
    eor      w9, w9, #0xfffffff1
    strb     w9, [x11, #5]
    adrp     x9, #0x545000
    add      x9, x9, #0x3f5
    ldrb     w10, [x9]
    mov      w11, #0x6c
    eor      w10, w10, w11
    adrp     x11, #0x545000
    add      x11, x11, #0x3fa
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xfffffffd
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xe
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0x78
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    mvn      w9, w9
    strb     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2fd650
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xc0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5b8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5c0]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2fd65c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2c0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9a0]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x1e0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5d0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cbz      x21, #0x2fd668
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x358]
    adrp     x2, #0x545000
    add      x2, x2, #0x470
    mov      x0, x22
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x2fd640
    adrp     x2, #0x545000
    add      x2, x2, #0x430
    mov      x0, x22
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2fd668
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x23, x20
    b        #0x2fd670
    adrp     x23, #0x4a6000
    add      x23, x23, #0xd8
    b        #0x2fd688
    adrp     x23, #0x4a6000
    add      x23, x23, #0xd8
    b        #0x2fd680
    adrp     x23, #0x4a6000
    add      x23, x23, #0xd8
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461be8 // _objc_autoreleaseReturnValue

// +[WCLGGlassUI themeIconCacheDirectory] IMP=0x2FD6A8 bounds=0x2FD6A8-0x2FD6D8
loc_2FD6A8:
    adrp     x8, #0x580000
    ldr      x8, [x8, #0x728]
    cmn      x8, #1
    b.ne     #0x2fd6c4
    adrp     x8, #0x580000
    ldr      x0, [x8, #0x720]
    b        #0x461cc0 // _objc_retainAutoreleaseReturnValue
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    bl       #0x4603b8
    ldp      x29, x30, [sp], #0x10
    b        #0x2fd6b8

// +[WCLGGlassUI themeIconCachePathForURL:] IMP=0x2FDA7C bounds=0x2FDA7C-0x2FDCF8
loc_2FDA7C:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    sub      sp, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x48]
    adrp     x8, #0x580000
    add      x8, x8, #0x7d8
    ldar     w9, [x8]
    cbnz     w9, #0x2fdb50
    adrp     x9, #0x545000
    add      x9, x9, #0x5ca
    ldrb     w10, [x9]
    eor      w10, w10, #0xffffff8f
    adrp     x11, #0x545000
    add      x11, x11, #0x5ce
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x1d
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    strb     w10, [x11, #2]
    ldrb     w9, [x9, #3]
    eor      w9, w9, #0xfe
    strb     w9, [x11, #3]
    adrp     x9, #0x545000
    add      x9, x9, #0x5c0
    ldrb     w10, [x9]
    eor      w10, w10, #0x20
    adrp     x11, #0x545000
    add      x11, x11, #0x5c5
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x11111111
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x3b
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0xc9
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    eor      w9, w9, #0xffffff83
    strb     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x21, sp, #0x20
    mov      sp, x21
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xa38]
    mov      x0, x2
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x338]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2fdcac
    movi     v0.16b, #0
    stp      q0, q0, [x21]
    mov      x0, x20
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xa50]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x1, x0
    mov      x0, x23
    mov      x2, x21
    bl       #0x461480 // _CC_SHA256
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2a0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8b8]
    mov      w2, #0x40
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x25, #0
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x8c0]
    adrp     x24, #0x545000
    add      x24, x24, #0x600
    ldrb     w8, [x21, x25]
    str      x8, [sp, #-0x10]!
    mov      x0, x22
    mov      x1, x23
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    add      sp, sp, #0x10
    add      x25, x25, #1
    cmp      x25, #0x20
    b.ne     #0x2fdc08
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x800]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x270]
    adrp     x2, #0x545000
    add      x2, x2, #0x640
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x820]
    mov      x0, x21
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    b        #0x2fdcb4
    adrp     x19, #0x4a6000
    add      x19, x19, #0xd8
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x48]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2fdcf4
    mov      x0, x19
    sub      sp, x29, #0x40
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    b        #0x461be8 // _objc_autoreleaseReturnValue
    bl       #0x4618b8 // ___stack_chk_fail

// +[WCLGGlassUI memoryCostForImage:fallback:] IMP=0x2FDCF8 bounds=0x2FDCF8-0x2FDD68
loc_2FDCF8:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x3
    mov      x0, x2
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xef8]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2fdd54
    mov      x21, x0
    bl       #0x461660 // _CGImageGetBytesPerRow
    mov      x20, x0
    mov      x0, x21
    bl       #0x46166c // _CGImageGetHeight
    cmp      x20, #0
    ccmp     x0, #0, #4, ne
    b.eq     #0x2fdd54
    umulh    x8, x20, x0
    cmp      xzr, x8
    mul      x8, x0, x20
    csel     x19, x19, x8, ne
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    ret      

// +[WCLGGlassUI decodedImageFromData:] IMP=0x2FDD68 bounds=0x2FDD68-0x2FDE6C
loc_2FDD68:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x338]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2fddb0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0x800, lsl #12
    b.ls     #0x2fddb8
    mov      x21, #0
    b        #0x2fde50
    adrp     x21, #0x4c4000
    ldr      x0, [x21, #0x80]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x808]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x21, #0x80]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2fde3c
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x680]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fcmp     d0, #0.0
    b.le     #0x2fde3c
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fcmp     d1, #0.0
    b.le     #0x2fde3c
    mov      x21, x20
    b        #0x2fde40
    mov      x21, #0
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461be8 // _objc_autoreleaseReturnValue

// +[WCLGGlassUI themeIconImageFromDiskForURL:] IMP=0x2FDE6C bounds=0x2FDE6C-0x2FE150
loc_2FDE6C:
    sub      sp, sp, #0x80
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    mov      x19, x2
    mov      x23, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    str      x8, [sp, #0x18]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x810]
    mov      x0, x23
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x338]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2fdf74
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x108]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x800]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x948]
    mov      x2, x20
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x4e8]
    bl       #0x461c6c // _objc_msgSend
    mov      x8, #-0x800001
    add      x9, x0, x8
    cmp      x9, x8
    b.hi     #0x2fdf7c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x850]
    mov      x0, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2fdf6c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x960]
    mov      x0, x21
    mov      x2, x20
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x24, #0
    b        #0x2fe0f0
    mov      x24, #0
    b        #0x2fe100
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x130]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x818]
    mov      x2, x20
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x820]
    mov      x0, x23
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    cbz      x0, #0x2fe0c8
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x200]
    ldr      x8, [x8]
    str      x8, [sp, #8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1d0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x778]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    str      x0, [sp, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    add      x2, sp, #0x10
    add      x3, sp, #8
    mov      w4, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x300]
    mov      x0, x21
    mov      x2, x28
    mov      x3, x20
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x828]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x26
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x3, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x830]
    mov      x0, x23
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x4, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x838]
    mov      x0, x27
    mov      x2, x24
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    b        #0x2fe0e0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x960]
    mov      x0, x21
    mov      x2, x20
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x18]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2fe14c
    mov      x0, x24
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    add      sp, sp, #0x80
    b        #0x461be8 // _objc_autoreleaseReturnValue
    bl       #0x4618b8 // ___stack_chk_fail

// +[WCLGGlassUI trimThemeIconDiskCacheIfNeeded] IMP=0x2FE150 bounds=0x2FE150-0x2FE8B8
loc_2FE150:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0xe0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x60]
    adrp     x8, #0x580000
    add      x8, x8, #0x7e8
    ldar     w9, [x8]
    cbnz     w9, #0x2fe2a4
    adrp     x9, #0x545000
    add      x9, x9, #0x674
    ldrb     w10, [x9]
    mov      w11, #0x52
    eor      w10, w10, w11
    adrp     x11, #0x545000
    add      x11, x11, #0x679
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x5c
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x57
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x2f
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    eor      w9, w9, #0xffffff81
    strb     w9, [x11, #4]
    adrp     x9, #0x545000
    add      x9, x9, #0x66a
    ldrb     w10, [x9]
    mov      w11, #0x5a
    eor      w10, w10, w11
    adrp     x11, #0x545000
    add      x11, x11, #0x66f
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xc6
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x6c
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xffffff8f
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0x6a
    eor      w9, w9, w10
    strb     w9, [x11, #4]
    adrp     x9, #0x545000
    add      x9, x9, #0x660
    ldrb     w10, [x9]
    adrp     x11, #0x545000
    add      x11, x11, #0x665
    eor      w10, w10, #0x44444444
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x48
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xd5
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x24
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0x98
    eor      w9, w9, w10
    strb     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x20, sp
    sub      x26, x20, #0x40
    mov      sp, x26
    sub      x23, sp, #0x80
    mov      sp, x23
    sub      x8, sp, #0x20
    stur     x8, [x29, #-0xe0]
    mov      sp, x8
    sub      x21, sp, #0x20
    mov      sp, x21
    sub      x8, sp, #0x40
    sub      x9, x29, #0x18
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    sub      x8, sp, #0x80
    sub      x9, x29, #0x28
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x800]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x108]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x800]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x810]
    stur     x0, [x29, #-0x88]
    mov      x2, x24
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x2d8]
    ldr      x8, [x8]
    cmp      x0, #0
    csel     x22, x8, x0, eq
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x19, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    mov      x0, x22
    sub      x8, x29, #0x20
    stur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x60]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xd8]
    movi     v0.16b, #0
    stp      q0, q0, [x20, #-0x40]
    stp      q0, q0, [x20, #-0x20]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stur     x22, [x29, #-0xa0]
    sub      x8, x29, #8
    stur     x1, [x8, #-0x100]
    mov      x2, x26
    sub      x8, x29, #0x10
    stur     x23, [x8, #-0x100]
    mov      x3, x23
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2fe680
    mov      x28, x0
    stur     x21, [x29, #-0xe8]
    stur     xzr, [x29, #-0x90]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x230]
    ldr      x9, [x26, #0x10]
    ldr      x21, [x9]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x98]
    ldur     x19, [x29, #-0xe0]
    stur     x21, [x29, #-0xf0]
    mov      x22, #0
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x820]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x948]
    stp      x8, x9, [x29, #-0x70]
    adrp     x8, #0x4bf000
    ldr      x9, [x8, #0x4e0]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x358]
    stp      x8, x9, [x29, #-0x80]
    adrp     x8, #0x4bf000
    ldr      x9, [x8, #0x4e8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x790]
    stp      x8, x9, [x29, #-0xb8]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x950]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0xc70]
    stur     x8, [x29, #-0x100]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0x108]
    stp      x8, x9, [x29, #-0xc8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x830]
    stur     x8, [x29, #-0xd0]
    stur     x28, [x29, #-0xa8]
    ldr      x8, [x26, #0x10]
    ldr      x8, [x8]
    cmp      x8, x21
    b.eq     #0x2fe4a8
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x26, #8]
    ldr      x2, [x8, x22, lsl #3]
    mov      x0, x24
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    ldur     x0, [x29, #-0x88]
    ldur     x1, [x29, #-0x70]
    mov      x2, x27
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldur     x1, [x29, #-0x80]
    ldur     x2, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    cbz      w23, #0x2fe638
    mov      x28, x26
    mov      x26, x24
    mov      x0, x25
    ldur     x1, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    str      x27, [x19]
    ldur     x21, [x29, #-0xe8]
    adrp     x8, #0x545000
    add      x9, x8, #0x720
    adrp     x8, #0x545000
    add      x8, x8, #0x6e0
    stp      x9, x8, [x21]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    ldur     x1, [x29, #-0xb8]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    str      x0, [x19, #8]
    adrp     x8, #0x545000
    add      x8, x8, #0x6a0
    str      x8, [x21, #0x10]
    mov      x0, x25
    ldur     x1, [x29, #-0xc0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x8, x0
    cbnz     x0, #0x2fe5bc
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1d0]
    ldur     x1, [x29, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xf8]
    mov      x8, x0
    str      x8, [x19, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    ldur     x1, [x29, #-0xc8]
    mov      x2, x19
    mov      x3, x21
    mov      w4, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldp      x0, x1, [x29, #-0xd8]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cbnz     x24, #0x2fe608
    ldur     x0, [x29, #-0xf8]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x90]
    add      x8, x20, x8
    stur     x8, [x29, #-0x90]
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x24, x26
    mov      x26, x28
    ldur     x19, [x29, #-0xe0]
    ldur     x28, [x29, #-0xa8]
    ldur     x21, [x29, #-0xf0]
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    add      x22, x22, #1
    cmp      x28, x22
    b.ne     #0x2fe490
    ldur     x0, [x29, #-0xa0]
    sub      x8, x29, #8
    ldur     x1, [x8, #-0x100]
    mov      x2, x26
    sub      x8, x29, #0x10
    ldur     x3, [x8, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    cbnz     x0, #0x2fe420
    b        #0x2fe684
    stur     xzr, [x29, #-0x90]
    mov      w20, #1
    movk     w20, #0x280, lsl #16
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xd8]
    sub      x8, x29, #0x20
    ldur     x19, [x8, #-0x100]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0x100
    ldur     x28, [x29, #-0x90]
    b.hi     #0x2fe6bc
    cmp      x28, x20
    b.lo     #0x2fe85c
    stur     x24, [x29, #-0x70]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xee0]
    adrp     x2, #0x4a4000
    add      x2, x2, #0x818
    ldur     x20, [x29, #-0xd8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    movi     v0.16b, #0
    sub      x8, x29, #0x18
    ldur     x26, [x8, #-0x100]
    stp      q0, q0, [x26]
    stp      q0, q0, [x26, #0x20]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    sub      x8, x29, #8
    ldur     x1, [x8, #-0x100]
    mov      x2, x26
    sub      x8, x29, #0x28
    ldur     x3, [x8, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2fe850
    mov      x20, x0
    ldr      x8, [x26, #0x10]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x68]
    mov      x22, #0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x528]
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x780]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x960]
    ldr      x8, [x26, #0x10]
    ldr      x8, [x8]
    ldur     x9, [x29, #-0x68]
    cmp      x8, x9
    b.eq     #0x2fe770
    ldur     x0, [x29, #-0xd8]
    bl       #0x461c24 // _objc_enumerationMutation
    cmp      x19, #0x100
    b.hi     #0x2fe788
    mov      w8, #1
    movk     w8, #0x280, lsl #16
    cmp      x28, x8
    b.lo     #0x2fe850
    ldr      x8, [x26, #8]
    ldr      x26, [x8, x22, lsl #3]
    mov      x0, x26
    mov      x1, x23
    adrp     x2, #0x545000
    add      x2, x2, #0x720
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x26
    mov      x1, x23
    adrp     x2, #0x545000
    add      x2, x2, #0x6e0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x88]
    mov      x1, x25
    mov      x2, x27
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    subs     x8, x28, x21
    csel     x8, xzr, x8, lo
    sub      x19, x19, w0, uxtw
    cmp      w0, #0
    csel     x28, x8, x28, ne
    mov      x0, x27
    sub      x8, x29, #0x18
    ldur     x26, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    add      x22, x22, #1
    cmp      x20, x22
    b.ne     #0x2fe754
    ldur     x0, [x29, #-0xd8]
    sub      x8, x29, #8
    ldur     x1, [x8, #-0x100]
    mov      x2, x26
    sub      x8, x29, #0x28
    ldur     x3, [x8, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    cbnz     x0, #0x2fe738
    ldur     x0, [x29, #-0xd8]
    bl       #0x461c9c // _objc_release
    ldur     x24, [x29, #-0x70]
    ldur     x0, [x29, #-0xd8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x88]
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2fe8b4
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// +[WCLGGlassUI registerImageRequestForKey:completion:] IMP=0x2FE9D0 bounds=0x2FE9D0-0x2FEB60
loc_2FE9D0:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x20, x3
    mov      x19, x2
    mov      x21, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      w22, #0
    cbz      x20, #0x2feb20
    cbz      x0, #0x2feb20
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x840]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461ca8 // _objc_retain
    bl       #0x461d14 // _objc_sync_enter
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x528]
    mov      x0, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    cmp      x0, #0
    cset     w22, eq
    cbz      x0, #0x2fea9c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x830]
    mov      x0, x23
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    b        #0x2feaf8
    adrp     x8, #0x4c4000
    ldr      x25, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8d8]
    mov      x0, x25
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x368]
    mov      x0, x21
    mov      x2, x25
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461d20 // _objc_sync_exit
    mov      x0, x21
    bl       #0x461c9c // _objc_release
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
    mov      x19, x0
    mov      x0, x21
    bl       #0x461d20 // _objc_sync_exit
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// +[WCLGGlassUI finishImageRequestForKey:image:] IMP=0x2FEB60 bounds=0x2FEB60-0x2FECD8
loc_2FEB60:
    sub      sp, sp, #0x70
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x20, x3
    mov      x19, x2
    mov      x21, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x840]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461ca8 // _objc_retain
    bl       #0x461d14 // _objc_sync_enter
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x528]
    mov      x0, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xe08]
    mov      x0, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461d20 // _objc_sync_exit
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2fec8c
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [sp, #8]
    adrp     x8, #0x2fe000
    add      x8, x8, #0xcd8
    adrp     x9, #0x4a4000
    add      x9, x9, #0x198
    stp      x8, x9, [sp, #0x10]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    str      x22, [sp, #0x20]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    str      x20, [sp, #0x28]
    adrp     x0, #0x4a0000
    ldr      x0, [x0, #0x770]
    mov      x1, sp
    bl       #0x461978 // _dispatch_async
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    add      sp, sp, #0x70
    ret      
    mov      x19, x0
    mov      x0, x21
    bl       #0x461d20 // _objc_sync_exit
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// +[WCLGGlassUI requestImageAtURLString:persistToDisk:completion:] IMP=0x2FEDE8 bounds=0x2FEDE8-0x2FF158
loc_2FEDE8:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x20, x4
    mov      x21, x3
    mov      x19, x2
    mov      x22, x0
    adrp     x8, #0x580000
    add      x8, x8, #0x7fc
    ldar     w9, [x8]
    cbnz     w9, #0x2fef5c
    adrp     x9, #0x545000
    add      x9, x9, #0x7aa
    ldrb     w10, [x9]
    mov      w11, #0x3b
    eor      w10, w10, w11
    adrp     x11, #0x545000
    add      x11, x11, #0x7af
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x24
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xbc
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0xe6
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    eor      w9, w9, #0x38
    strb     w9, [x11, #4]
    adrp     x9, #0x545000
    add      x9, x9, #0x79c
    ldrb     w10, [x9]
    mov      w11, #0x2c
    eor      w10, w10, w11
    adrp     x11, #0x545000
    add      x11, x11, #0x7a3
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x35
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x76
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0xdb
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x28
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0xcccccccc
    strb     w10, [x11, #5]
    ldrb     w9, [x9, #6]
    eor      w9, w9, #0x88888888
    strb     w9, [x11, #6]
    adrp     x9, #0x545000
    add      x9, x9, #0x790
    ldrb     w10, [x9]
    mov      w11, #0x29
    eor      w10, w10, w11
    adrp     x11, #0x545000
    add      x11, x11, #0x796
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xf4
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0x80
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0xa4
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #1
    strb     w10, [x11, #4]
    ldrb     w9, [x9, #5]
    mov      w10, #0xc9
    eor      w9, w9, w10
    strb     w9, [x11, #5]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x25, sp, #0x30
    mov      sp, x25
    sub      x24, sp, #0x40
    mov      sp, x24
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x828]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    cbz      x23, #0x2ff02c
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x25]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x25, #8]
    adrp     x8, #0x2ff000
    add      x8, x8, #0x158
    adrp     x9, #0x4a1000
    add      x9, x9, #0xba0
    stp      x8, x9, [x25, #0x10]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    str      x20, [x25, #0x28]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    str      x23, [x25, #0x20]
    adrp     x0, #0x4a0000
    ldr      x0, [x0, #0x770]
    mov      x1, x25
    bl       #0x461978 // _dispatch_async
    ldr      x0, [x25, #0x20]
    bl       #0x461c9c // _objc_release
    ldr      x25, [x25, #0x28]
    b        #0x2ff11c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    adrp     x8, #0x545000
    add      x8, x8, #0x820
    adrp     x9, #0x545000
    add      x9, x9, #0x860
    cmp      w21, #0
    csel     x8, x9, x8, ne
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0x620]
    stp      x8, x19, [sp, #-0x10]!
    adrp     x2, #0x545000
    add      x2, x2, #0x7e0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    add      sp, sp, #0x10
    mov      x25, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x848]
    mov      x0, x22
    mov      x2, x25
    mov      x3, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2ff11c
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x850]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x24]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x24, #8]
    adrp     x8, #0x2ff000
    add      x8, x8, #0x168
    adrp     x9, #0x4a4000
    add      x9, x9, #0x898
    stp      x8, x9, [x24, #0x10]
    strb     w21, [x24, #0x38]
    str      x22, [x24, #0x30]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x24, #0x20]
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    str      x25, [x24, #0x28]
    mov      x0, x26
    mov      x1, x24
    bl       #0x461978 // _dispatch_async
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldr      x0, [x24, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x24, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    sub      sp, x29, #0x40
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    ret      

// +[WCLGGlassUI prewarmThemeIconCacheForURLs:completion:] IMP=0x2FF77C bounds=0x2FF77C-0x2FFA24
loc_2FF77C:
    sub      sp, sp, #0x180
    stp      x28, x27, [sp, #0x120]
    stp      x26, x25, [sp, #0x130]
    stp      x24, x23, [sp, #0x140]
    stp      x22, x21, [sp, #0x150]
    stp      x20, x19, [sp, #0x160]
    stp      x29, x30, [sp, #0x170]
    add      x29, sp, #0x170
    mov      x20, x3
    mov      x19, x2
    mov      x22, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x60]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    str      x20, [sp]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x4c8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x50]
    stp      q0, q0, [sp, #0x70]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x2d8]
    ldr      x8, [x8]
    cmp      x19, #0
    str      x19, [sp, #8]
    csel     x23, x8, x19, eq
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    add      x2, sp, #0x50
    add      x3, sp, #0x90
    str      x1, [sp, #0x10]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2ff8e8
    mov      x25, x0
    ldr      x8, [sp, #0x60]
    ldr      x19, [x8]
    mov      x24, #0
    adrp     x8, #0x4c1000
    ldr      x26, [x8, #0x870]
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x338]
    adrp     x8, #0x4be000
    ldr      x28, [x8, #0x830]
    ldr      x8, [sp, #0x60]
    ldr      x8, [x8]
    cmp      x8, x19
    b.eq     #0x2ff878
    mov      x0, x23
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp, #0x58]
    ldr      x2, [x8, x24, lsl #3]
    mov      x0, x22
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2ff8b4
    mov      x0, x21
    mov      x1, x28
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    add      x24, x24, #1
    cmp      x25, x24
    b.ne     #0x2ff860
    add      x2, sp, #0x50
    add      x3, sp, #0x90
    mov      x0, x23
    ldr      x1, [sp, #0x10]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    cbnz     x0, #0x2ff844
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2ff9b8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x850]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp, #0x18]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [sp, #0x20]
    adrp     x8, #0x2ff000
    add      x8, x8, #0xa24
    adrp     x9, #0x4a4000
    add      x9, x9, #0x8c8
    stp      x8, x9, [sp, #0x28]
    str      x20, [sp, #0x38]
    str      x22, [sp, #0x48]
    ldr      x19, [sp]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [sp, #0x40]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    add      x1, sp, #0x18
    mov      x0, x23
    bl       #0x461978 // _dispatch_async
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x40]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x38]
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    b        #0x2ff9d0
    ldr      x19, [sp]
    cbz      x19, #0x2ff9d0
    adrp     x0, #0x4a0000
    ldr      x0, [x0, #0x770]
    mov      x1, x19
    bl       #0x461978 // _dispatch_async
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #8]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2ffa20
    ldp      x29, x30, [sp, #0x170]
    ldp      x20, x19, [sp, #0x160]
    ldp      x22, x21, [sp, #0x150]
    ldp      x24, x23, [sp, #0x140]
    ldp      x26, x25, [sp, #0x130]
    ldp      x28, x27, [sp, #0x120]
    add      sp, sp, #0x180
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// +[WCLGGlassUI loadImage:into:] IMP=0x2FFBCC bounds=0x2FFBCC-0x2FFBE0
loc_2FFBCC:
    mov      x4, x3
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xea0]
    mov      x3, #0
    b        #0x461c6c // _objc_msgSend

// +[WCLGGlassUI loadImage:themeType:into:] IMP=0x2FFBE0 bounds=0x2FFBE0-0x2FFF6C
loc_2FFBE0:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x21, x4
    mov      x20, x3
    mov      x19, x2
    mov      x22, x0
    adrp     x8, #0x580000
    add      x8, x8, #0x828
    ldar     w9, [x8]
    cbnz     w9, #0x2ffcf4
    adrp     x9, #0x545000
    add      x9, x9, #0x92a
    ldrb     w10, [x9]
    mov      w11, #0xca
    adrp     x12, #0x545000
    add      x12, x12, #0x931
    eor      w10, w10, w11
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #4
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    mov      w11, #0x7d
    eor      w10, w10, w11
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0x30
    strb     w10, [x12, #3]
    ldrb     w10, [x9, #4]
    mov      w11, #0xe4
    eor      w10, w10, w11
    strb     w10, [x12, #4]
    ldrb     w10, [x9, #5]
    mov      w11, #0xd8
    eor      w10, w10, w11
    strb     w10, [x12, #5]
    ldrb     w9, [x9, #6]
    mov      w10, #0x5e
    eor      w9, w9, w10
    strb     w9, [x12, #6]
    adrp     x9, #0x545000
    add      x9, x9, #0x920
    ldrb     w10, [x9]
    mov      w11, #0x71
    adrp     x12, #0x545000
    add      x12, x12, #0x925
    eor      w10, w10, w11
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    mov      w11, #0xc5
    eor      w10, w10, w11
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    mov      w11, #0x2f
    eor      w10, w10, w11
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    mov      w11, #0x79
    eor      w10, w10, w11
    strb     w10, [x12, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0x8b
    eor      w9, w9, w10
    strb     w9, [x12, #4]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x23, sp, #0x10
    mov      sp, x23
    sub      x24, sp, #0x40
    mov      sp, x24
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x338]
    mov      x0, x20
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2ffd60
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x878]
    mov      x0, x22
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    b        #0x2ffd64
    mov      x25, #0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x870]
    mov      x0, x22
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x545000
    ldr      x1, [x8, #0x210]
    mov      x0, x21
    mov      x2, x26
    mov      w3, #3
    bl       #0x461ce4 // _objc_setAssociatedObject
    mov      x0, x26
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2ffe08
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x828]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    mov      x0, x21
    cbz      x27, #0x2ffe20
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    b        #0x2fff00
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    mov      x0, x21
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    b        #0x2fff08
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x28, [x8, #0x358]
    adrp     x2, #0x545000
    add      x2, x2, #0x9a0
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x2ffe50
    mov      w28, #1
    b        #0x2ffe68
    adrp     x2, #0x545000
    add      x2, x2, #0x960
    mov      x0, x20
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    mov      x0, x23
    mov      x1, x21
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x24]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x24, #8]
    adrp     x8, #0x2ff000
    add      x8, x8, #0xf6c
    adrp     x9, #0x4a4000
    add      x9, x9, #0x8f8
    stp      x8, x9, [x24, #0x10]
    add      x0, x24, #0x30
    mov      x1, x23
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    str      x26, [x24, #0x20]
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    str      x25, [x24, #0x28]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x880]
    mov      x0, x22
    mov      x2, x26
    mov      x3, x28
    mov      x4, x24
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x24, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x24, #0x20]
    bl       #0x461c9c // _objc_release
    add      x0, x24, #0x30
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x23
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    mov      x19, x0
    add      x0, x24, #0x30
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x23
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume
