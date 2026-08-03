// Exact ARM64 listing for WCLGHGFullscreenGestureTarget

// +[WCLGHGFullscreenGestureTarget shared] IMP=0x336658 bounds=0x336658-0x3366CC
loc_336658:
    sub      sp, sp, #0x40
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x740]
    str      x8, [sp, #8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x398]
    str      d0, [sp, #0x10]
    adrp     x8, #0x336000
    add      x8, x8, #0x6cc
    adrp     x9, #0x4a0000
    add      x9, x9, #0xd88
    stp      x8, x9, [sp, #0x18]
    str      x0, [sp, #0x28]
    adrp     x8, #0x580000
    ldr      x8, [x8, #0xf98]
    cmn      x8, #1
    b.ne     #0x3366b8
    adrp     x8, #0x580000
    ldr      x0, [x8, #0xf90]
    ldp      x29, x30, [sp, #0x30]
    add      sp, sp, #0x40
    b        #0x461cc0 // _objc_retainAutoreleaseReturnValue
    adrp     x0, #0x580000
    add      x0, x0, #0xf98
    add      x1, sp, #8
    bl       #0x4619d8 // _dispatch_once
    b        #0x3366a4

// -[WCLGHGFullscreenGestureTarget handleEdgePan:] IMP=0x3366F4 bounds=0x3366F4-0x336944
loc_3366F4:
    stp      d9, d8, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    bl       #0x332cd8
    tbz      w0, #0, #0x3367d0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4a8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    cbz      x0, #0x336918
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x3d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #3
    b.gt     #0x3367f4
    cmp      x0, #1
    b.eq     #0x336824
    cmp      x0, #2
    b.eq     #0x3368c4
    cmp      x0, #3
    b.ne     #0x336918
    adrp     x0, #0x580000
    add      x0, x0, #0xf88
    bl       #0x461c60 // _objc_loadWeakRetained
    cbz      x0, #0x336918
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x458]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe70]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe78]
    b        #0x336908
    adrp     x0, #0x580000
    add      x0, x0, #0xf88
    bl       #0x461c60 // _objc_loadWeakRetained
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe30]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    b        #0x336920
    sub      x8, x0, #4
    cmp      x8, #2
    b.hs     #0x336918
    adrp     x0, #0x580000
    add      x0, x0, #0xf88
    bl       #0x461c60 // _objc_loadWeakRetained
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe30]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    b        #0x336910
    adrp     x0, #0x580000
    add      x0, x0, #0xf88
    bl       #0x461c60 // _objc_loadWeakRetained
    mov      x22, x0
    bl       #0x461c9c // _objc_release
    cbnz     x22, #0x336918
    mov      x0, x20
    bl       #0x336944
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cbz      x0, #0x336918
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xfe0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ubfx     x23, x0, #1, #1
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x458]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d1
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x5d8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe60]
    mov      x2, x22
    mov      x3, x23
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe68]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    b        #0x336910
    adrp     x0, #0x580000
    add      x0, x0, #0xf88
    bl       #0x461c60 // _objc_loadWeakRetained
    cbz      x0, #0x336918
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x458]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe70]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x438]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      d9, d8, [sp], #0x50
    b        #0x461c9c // _objc_release

// -[WCLGHGFullscreenGestureTarget gestureRecognizer:shouldReceiveTouch:] IMP=0x336A18 bounds=0x336A18-0x336A60
loc_336A18:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x0, x3
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x31fa44
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    eor      w0, w20, #1
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    ret      

// -[WCLGHGFullscreenGestureTarget gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:] IMP=0x336A60 bounds=0x336A60-0x336A68
loc_336A60:
    mov      w0, #1
    ret      
