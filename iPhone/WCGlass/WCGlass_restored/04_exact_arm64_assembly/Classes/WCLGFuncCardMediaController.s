// Exact ARM64 listing for WCLGFuncCardMediaController

// -[WCLGFuncCardMediaController init] IMP=0x29C7A8 bounds=0x29C7A8-0x29CC28
loc_29C7A8:
    adrp     x8, #0x580000
    add      x8, x8, #0xc8
    ldar     w9, [x8]
    cbnz     w9, #0x29cb04
    adrp     x11, #0x530000
    add      x11, x11, #0xc40
    ldrb     w9, [x11]
    adrp     x12, #0x530000
    add      x12, x12, #0xc60
    mov      w10, #0x6e
    eor      w9, w9, w10
    strb     w9, [x12]
    ldrb     w9, [x11, #1]
    mov      w10, #0xac
    eor      w9, w9, w10
    strb     w9, [x12, #1]
    ldrb     w10, [x11, #2]
    adrp     x9, #0x530000
    add      x9, x9, #0xc20
    eor      w10, w10, #0xfffffff3
    strb     w10, [x12, #2]
    ldrb     w10, [x11, #3]
    mov      w13, #0xa0
    eor      w10, w10, w13
    strb     w10, [x12, #3]
    ldrb     w10, [x11, #4]
    mov      w13, #0x16
    eor      w10, w10, w13
    strb     w10, [x12, #4]
    ldrb     w10, [x11, #5]
    eor      w10, w10, #0xffffff8f
    strb     w10, [x12, #5]
    ldrb     w10, [x11, #6]
    eor      w10, w10, #0x3c
    strb     w10, [x12, #6]
    ldrb     w10, [x11, #7]
    mov      w13, #5
    eor      w10, w10, w13
    strb     w10, [x12, #7]
    ldrb     w10, [x11, #8]
    eor      w10, w10, #0x99999999
    strb     w10, [x12, #8]
    ldrb     w10, [x11, #9]
    mov      w14, #0x68
    eor      w10, w10, w14
    strb     w10, [x12, #9]
    ldrb     w10, [x11, #0xa]
    mov      w14, #0xca
    eor      w10, w10, w14
    strb     w10, [x12, #0xa]
    ldrb     w10, [x11, #0xb]
    mov      w14, #0xa5
    eor      w10, w10, w14
    strb     w10, [x12, #0xb]
    ldrb     w10, [x11, #0xc]
    mov      w14, #0x29
    eor      w10, w10, w14
    strb     w10, [x12, #0xc]
    ldrb     w10, [x11, #0xd]
    mov      w14, #0x6b
    eor      w10, w10, w14
    strb     w10, [x12, #0xd]
    ldrb     w10, [x11, #0xe]
    eor      w10, w10, #0xffffffe3
    strb     w10, [x12, #0xe]
    ldrb     w10, [x11, #0xf]
    mov      w14, #0xf2
    eor      w10, w10, w14
    strb     w10, [x12, #0xf]
    ldrb     w10, [x11, #0x10]
    mov      w14, #0xbc
    eor      w10, w10, w14
    strb     w10, [x12, #0x10]
    ldrb     w10, [x11, #0x11]
    mov      w14, #0xd0
    eor      w10, w10, w14
    strb     w10, [x12, #0x11]
    ldrb     w14, [x11, #0x12]
    mov      w10, #0xda
    eor      w14, w14, w10
    strb     w14, [x12, #0x12]
    ldrb     w14, [x11, #0x13]
    mov      w15, #0x15
    eor      w14, w14, w15
    strb     w14, [x12, #0x13]
    ldrb     w14, [x11, #0x14]
    mov      w15, #0x1d
    eor      w14, w14, w15
    strb     w14, [x12, #0x14]
    ldrb     w14, [x11, #0x15]
    eor      w13, w14, w13
    strb     w13, [x12, #0x15]
    ldrb     w13, [x11, #0x16]
    mov      w14, #0xf4
    eor      w13, w13, w14
    strb     w13, [x12, #0x16]
    ldrb     w13, [x11, #0x17]
    mov      w15, #0xb7
    eor      w13, w13, w15
    strb     w13, [x12, #0x17]
    ldrb     w11, [x11, #0x18]
    eor      w11, w11, #0xffffff8f
    strb     w11, [x12, #0x18]
    adrp     x11, #0x530000
    add      x11, x11, #0xc00
    ldrb     w12, [x11]
    eor      w12, w12, #0x40
    strb     w12, [x9]
    ldrb     w12, [x11, #1]
    eor      w12, w12, #0x3f
    strb     w12, [x9, #1]
    ldrb     w12, [x11, #2]
    mov      w13, #0xde
    eor      w12, w12, w13
    strb     w12, [x9, #2]
    ldrb     w12, [x11, #3]
    mov      w13, #0xa4
    eor      w12, w12, w13
    strb     w12, [x9, #3]
    ldrb     w12, [x11, #4]
    eor      w12, w12, #4
    strb     w12, [x9, #4]
    ldrb     w12, [x11, #5]
    eor      w12, w12, #0x38
    strb     w12, [x9, #5]
    ldrb     w12, [x11, #6]
    mov      w13, #9
    eor      w12, w12, w13
    strb     w12, [x9, #6]
    ldrb     w12, [x11, #7]
    mov      w13, #0xe5
    eor      w12, w12, w13
    strb     w12, [x9, #7]
    ldrb     w12, [x11, #8]
    eor      w12, w12, #0xe0
    strb     w12, [x9, #8]
    ldrb     w12, [x11, #9]
    mvn      w12, w12
    strb     w12, [x9, #9]
    ldrb     w12, [x11, #0xa]
    eor      w12, w12, w14
    strb     w12, [x9, #0xa]
    ldrb     w12, [x11, #0xb]
    mov      w13, #0x62
    eor      w12, w12, w13
    strb     w12, [x9, #0xb]
    ldrb     w12, [x11, #0xc]
    mov      w13, #0x13
    eor      w12, w12, w13
    strb     w12, [x9, #0xc]
    ldrb     w12, [x11, #0xd]
    mov      w13, #0x9a
    eor      w12, w12, w13
    strb     w12, [x9, #0xd]
    ldrb     w12, [x11, #0xe]
    eor      w12, w12, w10
    strb     w12, [x9, #0xe]
    ldrb     w12, [x11, #0xf]
    mov      w13, #0x12
    eor      w12, w12, w13
    strb     w12, [x9, #0xf]
    ldrb     w12, [x11, #0x10]
    eor      w12, w12, #0xf
    strb     w12, [x9, #0x10]
    ldrb     w12, [x11, #0x11]
    mov      w13, #0xc9
    eor      w12, w12, w13
    strb     w12, [x9, #0x11]
    ldrb     w12, [x11, #0x12]
    eor      w12, w12, #0xe
    strb     w12, [x9, #0x12]
    ldrb     w12, [x11, #0x13]
    mov      w13, #0x64
    eor      w12, w12, w13
    strb     w12, [x9, #0x13]
    ldrb     w12, [x11, #0x14]
    mov      w13, #0xb0
    eor      w12, w12, w13
    strb     w12, [x9, #0x14]
    ldrb     w12, [x11, #0x15]
    mov      w13, #0xb4
    eor      w12, w12, w13
    strb     w12, [x9, #0x15]
    ldrb     w12, [x11, #0x16]
    eor      w12, w12, #0xffffffc3
    strb     w12, [x9, #0x16]
    ldrb     w12, [x11, #0x17]
    mov      w13, #0xb8
    eor      w12, w12, w13
    strb     w12, [x9, #0x17]
    ldrb     w12, [x11, #0x18]
    mov      w13, #0x61
    eor      w12, w12, w13
    strb     w12, [x9, #0x18]
    ldrb     w12, [x11, #0x19]
    mov      w13, #0x5f
    eor      w12, w12, w13
    strb     w12, [x9, #0x19]
    ldrb     w12, [x11, #0x1a]
    eor      w12, w12, #0xf
    strb     w12, [x9, #0x1a]
    ldrb     w12, [x11, #0x1b]
    eor      w12, w12, #0x60
    strb     w12, [x9, #0x1b]
    ldrb     w12, [x11, #0x1c]
    eor      w10, w12, w10
    strb     w10, [x9, #0x1c]
    ldrb     w10, [x11, #0x1d]
    mov      w12, #0xed
    eor      w10, w10, w12
    strb     w10, [x9, #0x1d]
    ldrb     w10, [x11, #0x1e]
    mov      w11, #0x6d
    eor      w10, w10, w11
    strb     w10, [x9, #0x1e]
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      w9, #1
    stlr     w9, [x8]
    mov      x9, sp
    sub      x8, x9, #0x10
    mov      sp, x8
    adrp     x10, #0x4c4000
    ldr      x10, [x10, #0x798]
    stp      x0, x10, [x9, #-0x10]
    adrp     x9, #0x4bf000
    ldr      x1, [x9, #0xb78]
    mov      x0, x8
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x19, x0
    cbz      x0, #0x29cc10
    adrp     x0, #0x530000
    add      x0, x0, #0xc60
    adrp     x1, #0x4a0000
    ldr      x1, [x1, #0x778]
    bl       #0x4619f0 // _dispatch_queue_create
    ldr      x8, [x19, #0x18]
    str      x0, [x19, #0x18]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x0, #0x530000
    add      x0, x0, #0xc20
    mov      x1, #0
    bl       #0x4619f0 // _dispatch_queue_create
    ldr      x8, [x19, #0x20]
    str      x0, [x19, #0x20]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x21, #0x4c4000
    ldr      x0, [x21, #0x170]
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0xb78]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldr      x8, [x19, #0x28]
    str      x0, [x19, #0x28]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x0, [x21, #0x170]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldr      x8, [x19, #0x30]
    str      x0, [x19, #0x30]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldr      x8, [x19, #0x38]
    str      x0, [x19, #0x38]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    sub      sp, x29, #0x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    ret      

// -[WCLGFuncCardMediaController keyForSchemeTask:] IMP=0x29CC28 bounds=0x29CC28-0x29CC3C
loc_29CC28:
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xe8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x60]
    b        #0x461c6c // _objc_msgSend

// -[WCLGFuncCardMediaController isSchemeTaskCancelled:] IMP=0x29CC3C bounds=0x29CC3C-0x29CD28
loc_29CC3C:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x2
    mov      x22, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c1000
    ldr      x21, [x8, #0x120]
    mov      x0, x22
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x461d14 // _objc_sync_enter
    mov      x0, x22
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x128]
    mov      x0, x22
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xa08]
    mov      x0, x21
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461d20 // _objc_sync_exit
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    ret      
    mov      x19, x0
    mov      x0, x20
    bl       #0x461d20 // _objc_sync_exit
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGFuncCardMediaController finishSchemeTask:] IMP=0x29CD28 bounds=0x29CD28-0x29CE40
loc_29CD28:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    mov      x21, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c1000
    ldr      x23, [x8, #0x120]
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x461d14 // _objc_sync_enter
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x128]
    mov      x0, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x130]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0xc58]
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461d20 // _objc_sync_exit
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    b        #0x461c9c // _objc_release
    mov      x19, x0
    mov      x0, x20
    bl       #0x461d20 // _objc_sync_exit
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGFuncCardMediaController performSchemeTaskCallback:block:] IMP=0x29CE40 bounds=0x29CE40-0x29CF8C
loc_29CE40:
    sub      sp, sp, #0x90
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
    cbz      x20, #0x29cf08
    add      x22, sp, #0x40
    stp      xzr, x22, [sp, #0x40]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x878]
    str      d0, [sp, #0x50]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    strb     wzr, [sp, #0x58]
    str      x8, [sp]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    adrp     x8, #0x29c000
    add      x8, x8, #0xf8c
    str      d0, [sp, #8]
    adrp     x9, #0x4a4000
    add      x9, x9, #0x168
    stp      x8, x9, [sp, #0x10]
    str      x21, [sp, #0x20]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [sp, #0x28]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    stp      x20, x22, [sp, #0x30]
    mov      x0, sp
    bl       #0x461cd8 // _objc_retainBlock
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1a8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xd58]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x29cf10
    ldr      x8, [x21, #0x10]
    mov      x0, x21
    blr      x8
    b        #0x29cf20
    mov      w22, #0
    b        #0x29cf4c
    adrp     x0, #0x4a0000
    ldr      x0, [x0, #0x770]
    mov      x1, x21
    bl       #0x461a20 // _dispatch_sync
    ldr      x8, [sp, #0x48]
    ldrb     w22, [x8, #0x18]
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    add      x0, sp, #0x40
    mov      w1, #8
    bl       #0x461888 // __Block_object_dispose
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    and      w0, w22, #1
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    add      sp, sp, #0x90
    ret      
    mov      x19, x0
    add      x0, sp, #0x40
    mov      w1, #8
    bl       #0x461888 // __Block_object_dispose
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGFuncCardMediaController failSchemeTask:code:] IMP=0x29D074 bounds=0x29D074-0x29D2EC
loc_29D074:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x21, x3
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x580000
    add      x8, x8, #0xe8
    ldar     w9, [x8]
    cbnz     w9, #0x29d1cc
    adrp     x9, #0x530000
    add      x9, x9, #0xc80
    ldrb     w10, [x9]
    mov      w11, #5
    eor      w11, w10, w11
    adrp     x10, #0x530000
    add      x10, x10, #0xca0
    strb     w11, [x10]
    ldrb     w11, [x9, #1]
    mov      w12, #0x8c
    eor      w11, w11, w12
    strb     w11, [x10, #1]
    ldrb     w11, [x9, #2]
    mvn      w11, w11
    strb     w11, [x10, #2]
    ldrb     w11, [x9, #3]
    mov      w12, #0xb4
    eor      w11, w11, w12
    strb     w11, [x10, #3]
    ldrb     w11, [x9, #4]
    mov      w12, #0xe8
    eor      w11, w11, w12
    strb     w11, [x10, #4]
    ldrb     w11, [x9, #5]
    mov      w12, #0x85
    eor      w11, w11, w12
    strb     w11, [x10, #5]
    ldrb     w11, [x9, #6]
    mov      w12, #0x71
    eor      w11, w11, w12
    strb     w11, [x10, #6]
    ldrb     w11, [x9, #7]
    mov      w12, #0xdb
    eor      w11, w11, w12
    strb     w11, [x10, #7]
    ldrb     w11, [x9, #8]
    mov      w12, #0xba
    eor      w11, w11, w12
    strb     w11, [x10, #8]
    ldrb     w11, [x9, #9]
    mov      w12, #0xf6
    eor      w11, w11, w12
    strb     w11, [x10, #9]
    ldrb     w11, [x9, #0xa]
    mov      w12, #0xcb
    eor      w11, w11, w12
    strb     w11, [x10, #0xa]
    ldrb     w11, [x9, #0xb]
    mov      w12, #0xa5
    eor      w11, w11, w12
    strb     w11, [x10, #0xb]
    ldrb     w11, [x9, #0xc]
    mov      w12, #0xe2
    eor      w11, w11, w12
    strb     w11, [x10, #0xc]
    ldrb     w11, [x9, #0xd]
    eor      w11, w11, #0xbbbbbbbb
    strb     w11, [x10, #0xd]
    ldrb     w11, [x9, #0xe]
    mov      w12, #0x86
    eor      w11, w11, w12
    strb     w11, [x10, #0xe]
    ldrb     w11, [x9, #0xf]
    mov      w12, #0xb3
    eor      w11, w11, w12
    strb     w11, [x10, #0xf]
    ldrb     w11, [x9, #0x10]
    mov      w12, #0xae
    eor      w11, w11, w12
    strb     w11, [x10, #0x10]
    ldrb     w9, [x9, #0x11]
    mov      w11, #0xea
    eor      w9, w9, w11
    strb     w9, [x10, #0x11]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x22, sp, #0x30
    mov      sp, x22
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x138]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x29d214
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x140]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    b        #0x29d2cc
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x4e0]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x148]
    adrp     x2, #0x530000
    add      x2, x2, #0xce0
    mov      x3, x21
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x22]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x22, #8]
    adrp     x8, #0x29d000
    add      x8, x8, #0x2ec
    adrp     x9, #0x4a4000
    add      x9, x9, #0x198
    stp      x8, x9, [x22, #0x10]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    stp      x19, x21, [x22, #0x20]
    adrp     x8, #0x4c1000
    ldr      x23, [x8, #0x158]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x23
    mov      x2, x19
    mov      x3, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x140]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x22, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x22, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    sub      sp, x29, #0x30
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    ret      

// -[WCLGFuncCardMediaController userContentController:didReceiveScriptMessage:] IMP=0x29D300 bounds=0x29D300-0x29EFB4
loc_29D300:
    stp      d11, d10, [sp, #-0x80]!
    stp      d9, d8, [sp, #0x10]
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    sub      sp, sp, #0xa0
    mov      x21, x3
    mov      x19, x2
    mov      x22, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x80]
    adrp     x8, #0x580000
    add      x8, x8, #0xf8
    ldar     w9, [x8]
    cbnz     w9, #0x29dd94
    adrp     x10, #0x530000
    add      x10, x10, #0xe26
    ldrb     w11, [x10]
    mov      w9, #0x92
    adrp     x12, #0x530000
    add      x12, x12, #0xe34
    eor      w11, w11, w9
    strb     w11, [x12]
    ldrb     w11, [x10, #1]
    mov      w13, #0x41
    eor      w11, w11, w13
    strb     w11, [x12, #1]
    ldrb     w11, [x10, #2]
    mov      w13, #0x84
    eor      w11, w11, w13
    strb     w11, [x12, #2]
    ldrb     w11, [x10, #3]
    mov      w13, #0x6c
    eor      w11, w11, w13
    strb     w11, [x12, #3]
    ldrb     w11, [x10, #4]
    mov      w14, #0xd
    eor      w11, w11, w14
    strb     w11, [x12, #4]
    ldrb     w11, [x10, #5]
    mov      w14, #0xb8
    eor      w11, w11, w14
    strb     w11, [x12, #5]
    ldrb     w11, [x10, #6]
    mov      w15, #0xa7
    eor      w11, w11, w15
    strb     w11, [x12, #6]
    ldrb     w11, [x10, #7]
    mov      w17, #0x96
    eor      w11, w11, w17
    strb     w11, [x12, #7]
    ldrb     w11, [x10, #8]
    eor      w11, w11, #0xe
    strb     w11, [x12, #8]
    ldrb     w11, [x10, #9]
    eor      w11, w11, #0xfe
    strb     w11, [x12, #9]
    ldrb     w11, [x10, #0xa]
    eor      w11, w11, #0xffffff8f
    strb     w11, [x12, #0xa]
    ldrb     w11, [x10, #0xb]
    mov      w14, #0x46
    eor      w11, w11, w14
    strb     w11, [x12, #0xb]
    ldrb     w11, [x10, #0xc]
    mov      w14, #0xaf
    eor      w11, w11, w14
    strb     w11, [x12, #0xc]
    ldrb     w10, [x10, #0xd]
    mov      w16, #0x25
    eor      w10, w10, w16
    strb     w10, [x12, #0xd]
    adrp     x10, #0x530000
    add      x10, x10, #0xe18
    ldrb     w11, [x10]
    mov      w12, #0xc8
    eor      w11, w11, w12
    adrp     x14, #0x530000
    add      x14, x14, #0xe1f
    strb     w11, [x14]
    ldrb     w11, [x10, #1]
    mov      w0, #0x68
    eor      w11, w11, w0
    strb     w11, [x14, #1]
    ldrb     w11, [x10, #2]
    mov      w0, #0xb
    eor      w11, w11, w0
    strb     w11, [x14, #2]
    ldrb     w1, [x10, #3]
    mov      w11, #0x9b
    eor      w1, w1, w11
    strb     w1, [x14, #3]
    ldrb     w1, [x10, #4]
    eor      w1, w1, #0x20
    strb     w1, [x14, #4]
    ldrb     w1, [x10, #5]
    mov      w2, #9
    eor      w1, w1, w2
    strb     w1, [x14, #5]
    ldrb     w10, [x10, #6]
    eor      w10, w10, #0x3c
    strb     w10, [x14, #6]
    adrp     x3, #0x530000
    add      x3, x3, #0xdea
    ldrb     w10, [x3]
    eor      w10, w10, #0xf
    adrp     x4, #0x530000
    add      x4, x4, #0xdf4
    strb     w10, [x4]
    ldrb     w10, [x3, #1]
    mov      w14, #0x14
    eor      w10, w10, w14
    strb     w10, [x4, #1]
    ldrb     w10, [x3, #2]
    eor      w10, w10, #0xfffffff3
    strb     w10, [x4, #2]
    ldrb     w10, [x3, #3]
    eor      w10, w10, #0x10
    strb     w10, [x4, #3]
    ldrb     w10, [x3, #4]
    mov      w1, #0x6d
    eor      w10, w10, w1
    strb     w10, [x4, #4]
    ldrb     w10, [x3, #5]
    mov      w2, #0x8e
    eor      w10, w10, w2
    strb     w10, [x4, #5]
    ldrb     w2, [x3, #6]
    mov      w10, #0x82
    eor      w2, w2, w10
    strb     w2, [x4, #6]
    ldrb     w2, [x3, #7]
    mvn      w2, w2
    strb     w2, [x4, #7]
    ldrb     w5, [x3, #8]
    mov      w2, #0x2e
    eor      w5, w5, w2
    strb     w5, [x4, #8]
    ldrb     w3, [x3, #9]
    eor      w3, w3, w12
    strb     w3, [x4, #9]
    adrp     x3, #0x530000
    add      x3, x3, #0xddc
    ldrb     w4, [x3]
    eor      w4, w4, #0xc0
    adrp     x5, #0x530000
    add      x5, x5, #0xde3
    strb     w4, [x5]
    ldrb     w4, [x3, #1]
    eor      w4, w4, #0xf0
    strb     w4, [x5, #1]
    ldrb     w4, [x3, #2]
    eor      w4, w4, #0x80
    strb     w4, [x5, #2]
    ldrb     w4, [x3, #3]
    mov      w6, #0xd9
    eor      w4, w4, w6
    strb     w4, [x5, #3]
    ldrb     w4, [x3, #4]
    eor      w16, w4, w16
    strb     w16, [x5, #4]
    ldrb     w16, [x3, #5]
    eor      w13, w16, w13
    strb     w13, [x5, #5]
    ldrb     w13, [x3, #6]
    mov      w16, #0xcd
    eor      w13, w13, w16
    strb     w13, [x5, #6]
    adrp     x16, #0x530000
    add      x16, x16, #0xdd0
    ldrb     w13, [x16]
    mov      w3, #0x37
    eor      w13, w13, w3
    adrp     x3, #0x530000
    add      x3, x3, #0xdd6
    strb     w13, [x3]
    ldrb     w13, [x16, #1]
    mov      w4, #0x74
    eor      w13, w13, w4
    strb     w13, [x3, #1]
    ldrb     w4, [x16, #2]
    mov      w13, #5
    eor      w4, w4, w13
    strb     w4, [x3, #2]
    ldrb     w4, [x16, #3]
    eor      w4, w4, #0xcccccccc
    strb     w4, [x3, #3]
    ldrb     w4, [x16, #4]
    eor      w4, w4, #0xcccccccc
    strb     w4, [x3, #4]
    ldrb     w16, [x16, #5]
    eor      w15, w16, w15
    strb     w15, [x3, #5]
    adrp     x15, #0x530000
    add      x15, x15, #0xdc2
    ldrb     w16, [x15]
    eor      w16, w16, w1
    adrp     x3, #0x530000
    add      x3, x3, #0xdc9
    strb     w16, [x3]
    ldrb     w16, [x15, #1]
    mov      w1, #0x52
    eor      w16, w16, w1
    strb     w16, [x3, #1]
    ldrb     w16, [x15, #2]
    eor      w16, w16, #0xdddddddd
    strb     w16, [x3, #2]
    ldrb     w16, [x15, #3]
    mov      w1, #0x21
    eor      w16, w16, w1
    strb     w16, [x3, #3]
    ldrb     w16, [x15, #4]
    mov      w4, #0x31
    eor      w16, w16, w4
    strb     w16, [x3, #4]
    ldrb     w16, [x15, #5]
    mov      w4, #0xa8
    eor      w16, w16, w4
    strb     w16, [x3, #5]
    ldrb     w16, [x15, #6]
    mov      w15, #0x6e
    eor      w16, w16, w15
    strb     w16, [x3, #6]
    adrp     x3, #0x530000
    add      x3, x3, #0xd2a
    ldrb     w4, [x3]
    mov      w16, #0x16
    eor      w4, w4, w16
    adrp     x5, #0x530000
    add      x5, x5, #0xd3a
    strb     w4, [x5]
    ldrb     w4, [x3, #1]
    mov      w6, #0x54
    eor      w4, w4, w6
    strb     w4, [x5, #1]
    ldrb     w4, [x3, #2]
    eor      w4, w4, #0xaaaaaaaa
    strb     w4, [x5, #2]
    ldrb     w4, [x3, #3]
    mov      w6, #0xe8
    eor      w4, w4, w6
    strb     w4, [x5, #3]
    ldrb     w4, [x3, #4]
    mov      w6, #0x69
    eor      w4, w4, w6
    strb     w4, [x5, #4]
    ldrb     w4, [x3, #5]
    mov      w6, #0xcb
    eor      w4, w4, w6
    strb     w4, [x5, #5]
    ldrb     w4, [x3, #6]
    mov      w6, #0x86
    eor      w4, w4, w6
    strb     w4, [x5, #6]
    ldrb     w4, [x3, #7]
    mov      w6, #0x5a
    eor      w4, w4, w6
    strb     w4, [x5, #7]
    ldrb     w4, [x3, #8]
    mov      w6, #0x45
    eor      w4, w4, w6
    strb     w4, [x5, #8]
    ldrb     w4, [x3, #9]
    mov      w6, #0x47
    eor      w4, w4, w6
    strb     w4, [x5, #9]
    ldrb     w4, [x3, #0xa]
    mov      w6, #0xda
    eor      w4, w4, w6
    strb     w4, [x5, #0xa]
    ldrb     w4, [x3, #0xb]
    eor      w4, w4, #0x30
    strb     w4, [x5, #0xb]
    ldrb     w4, [x3, #0xc]
    mov      w6, #0xd4
    eor      w4, w4, w6
    strb     w4, [x5, #0xc]
    ldrb     w4, [x3, #0xd]
    mov      w6, #0x91
    eor      w4, w4, w6
    strb     w4, [x5, #0xd]
    ldrb     w4, [x3, #0xe]
    eor      w4, w4, #0xffffffbf
    strb     w4, [x5, #0xe]
    ldrb     w3, [x3, #0xf]
    eor      w3, w3, #0xffffffc7
    strb     w3, [x5, #0xf]
    adrp     x3, #0x530000
    add      x3, x3, #0xd88
    ldrb     w4, [x3]
    eor      w4, w4, #0x40
    adrp     x5, #0x530000
    add      x5, x5, #0xd92
    strb     w4, [x5]
    ldrb     w4, [x3, #1]
    eor      w4, w4, #0xf
    strb     w4, [x5, #1]
    ldrb     w4, [x3, #2]
    mov      w6, #0x65
    eor      w4, w4, w6
    strb     w4, [x5, #2]
    ldrb     w4, [x3, #3]
    mov      w6, #0x6a
    eor      w4, w4, w6
    strb     w4, [x5, #3]
    ldrb     w4, [x3, #4]
    eor      w16, w4, w16
    strb     w16, [x5, #4]
    ldrb     w4, [x3, #5]
    mov      w16, #0x1d
    eor      w4, w4, w16
    strb     w4, [x5, #5]
    ldrb     w4, [x3, #6]
    eor      w4, w4, w14
    strb     w4, [x5, #6]
    ldrb     w4, [x3, #7]
    mov      w6, #0xab
    eor      w4, w4, w6
    strb     w4, [x5, #7]
    ldrb     w4, [x3, #8]
    mov      w6, #0x89
    eor      w4, w4, w6
    strb     w4, [x5, #8]
    ldrb     w3, [x3, #9]
    mov      w4, #0x29
    eor      w3, w3, w4
    strb     w3, [x5, #9]
    adrp     x3, #0x530000
    add      x3, x3, #0xd4a
    ldrb     w4, [x3]
    eor      w17, w4, w17
    adrp     x4, #0x530000
    add      x4, x4, #0xd50
    strb     w17, [x4]
    ldrb     w17, [x3, #1]
    eor      w17, w17, w14
    strb     w17, [x4, #1]
    ldrb     w17, [x3, #2]
    eor      w17, w17, #0xffffffc3
    strb     w17, [x4, #2]
    ldrb     w17, [x3, #3]
    eor      w17, w17, w0
    strb     w17, [x4, #3]
    ldrb     w17, [x3, #4]
    eor      w17, w17, #0x88888888
    strb     w17, [x4, #4]
    ldrb     w17, [x3, #5]
    mov      w0, #0x5d
    eor      w17, w17, w0
    adrp     x0, #0x530000
    add      x0, x0, #0xd64
    strb     w17, [x4, #5]
    ldrb     w17, [x0]
    eor      w17, w17, w2
    adrp     x4, #0x530000
    add      x4, x4, #0xd6d
    strb     w17, [x4]
    ldrb     w17, [x0, #1]
    mov      w2, #0xce
    eor      w17, w17, w2
    strb     w17, [x4, #1]
    ldrb     w17, [x0, #2]
    mov      w2, #0x7b
    eor      w17, w17, w2
    strb     w17, [x4, #2]
    ldrb     w17, [x0, #3]
    mov      w3, #0xa9
    eor      w17, w17, w3
    strb     w17, [x4, #3]
    ldrb     w17, [x0, #4]
    mov      w3, #0x27
    eor      w17, w17, w3
    strb     w17, [x4, #4]
    ldrb     w17, [x0, #5]
    mov      w5, #0x5f
    eor      w17, w17, w5
    strb     w17, [x4, #5]
    ldrb     w5, [x0, #6]
    mov      w17, #0xae
    eor      w5, w5, w17
    strb     w5, [x4, #6]
    ldrb     w5, [x0, #7]
    eor      w5, w5, #0x22222222
    strb     w5, [x4, #7]
    ldrb     w0, [x0, #8]
    mov      w5, #0xa4
    eor      w0, w0, w5
    strb     w0, [x4, #8]
    adrp     x0, #0x530000
    add      x0, x0, #0xdb6
    ldrb     w4, [x0]
    mov      w5, #0x2b
    eor      w4, w4, w5
    adrp     x5, #0x530000
    add      x5, x5, #0xdbc
    strb     w4, [x5]
    ldrb     w4, [x0, #1]
    mov      w6, #0xd0
    eor      w4, w4, w6
    strb     w4, [x5, #1]
    ldrb     w4, [x0, #2]
    eor      w4, w4, #0xffffffbf
    strb     w4, [x5, #2]
    ldrb     w4, [x0, #3]
    mov      w6, #0x4b
    eor      w4, w4, w6
    strb     w4, [x5, #3]
    ldrb     w4, [x0, #4]
    eor      w4, w4, #0xffffffe1
    strb     w4, [x5, #4]
    ldrb     w0, [x0, #5]
    mov      w4, #0x56
    eor      w0, w0, w4
    strb     w0, [x5, #5]
    adrp     x4, #0x530000
    add      x4, x4, #0xd56
    ldrb     w5, [x4]
    mov      w0, #0xa0
    eor      w5, w5, w0
    adrp     x6, #0x530000
    add      x6, x6, #0xd5d
    strb     w5, [x6]
    ldrb     w5, [x4, #1]
    mov      w7, #0x9d
    eor      w5, w5, w7
    strb     w5, [x6, #1]
    ldrb     w5, [x4, #2]
    eor      w5, w5, #0x70
    strb     w5, [x6, #2]
    ldrb     w5, [x4, #3]
    mov      w7, #0xc5
    eor      w5, w5, w7
    strb     w5, [x6, #3]
    ldrb     w5, [x4, #4]
    mov      w7, #0xa1
    eor      w5, w5, w7
    strb     w5, [x6, #4]
    ldrb     w5, [x4, #5]
    eor      w5, w5, w16
    strb     w5, [x6, #5]
    ldrb     w4, [x4, #6]
    eor      w14, w4, w14
    strb     w14, [x6, #6]
    adrp     x14, #0x530000
    add      x14, x14, #0xd76
    ldrb     w4, [x14]
    mov      w5, #0x51
    eor      w4, w4, w5
    adrp     x5, #0x530000
    add      x5, x5, #0xd7b
    strb     w4, [x5]
    ldrb     w4, [x14, #1]
    eor      w1, w4, w1
    strb     w1, [x5, #1]
    ldrb     w4, [x14, #2]
    mov      w1, #0x61
    eor      w4, w4, w1
    strb     w4, [x5, #2]
    ldrb     w4, [x14, #3]
    mov      w6, #0xb5
    eor      w4, w4, w6
    strb     w4, [x5, #3]
    ldrb     w14, [x14, #4]
    eor      w14, w14, #0x1c
    strb     w14, [x5, #4]
    adrp     x4, #0x530000
    add      x4, x4, #0xe12
    ldrb     w5, [x4]
    mov      w14, #0x5b
    adrp     x6, #0x530000
    add      x6, x6, #0xe15
    eor      w5, w5, w14
    strb     w5, [x6]
    ldrb     w5, [x4, #1]
    eor      w5, w5, #0xfffffff3
    strb     w5, [x6, #1]
    ldrb     w4, [x4, #2]
    mov      w5, #0x53
    eor      w4, w4, w5
    strb     w4, [x6, #2]
    adrp     x5, #0x530000
    add      x5, x5, #0xdfe
    ldrb     w4, [x5]
    eor      w4, w4, #0xdddddddd
    adrp     x6, #0x530000
    add      x6, x6, #0xe08
    strb     w4, [x6]
    ldrb     w7, [x5, #1]
    mov      w4, #0xd3
    eor      w7, w7, w4
    strb     w7, [x6, #1]
    ldrb     w7, [x5, #2]
    eor      w7, w7, #0xf8
    strb     w7, [x6, #2]
    ldrb     w7, [x5, #3]
    mov      x20, x19
    mov      w19, #0xf6
    eor      w7, w7, w19
    mov      x19, x20
    strb     w7, [x6, #3]
    ldrb     w7, [x5, #4]
    eor      w12, w7, w12
    strb     w12, [x6, #4]
    ldrb     w12, [x5, #5]
    mov      w7, #0xb6
    eor      w12, w12, w7
    strb     w12, [x6, #5]
    ldrb     w12, [x5, #6]
    eor      w12, w12, #0x99999999
    strb     w12, [x6, #6]
    ldrb     w12, [x5, #7]
    eor      w12, w12, #0xffffffc3
    strb     w12, [x6, #7]
    ldrb     w12, [x5, #8]
    eor      w9, w12, w9
    strb     w9, [x6, #8]
    ldrb     w9, [x5, #9]
    eor      w9, w9, #0xffffff87
    strb     w9, [x6, #9]
    adrp     x12, #0x530000
    add      x12, x12, #0xd0a
    ldrb     w9, [x12]
    eor      w9, w9, w2
    adrp     x2, #0x530000
    add      x2, x2, #0xd11
    strb     w9, [x2]
    ldrb     w9, [x12, #1]
    mov      w5, #0x8d
    eor      w9, w9, w5
    strb     w9, [x2, #1]
    ldrb     w9, [x12, #2]
    eor      w9, w9, w3
    strb     w9, [x2, #2]
    ldrb     w9, [x12, #3]
    mov      w3, #0xbe
    eor      w9, w9, w3
    strb     w9, [x2, #3]
    ldrb     w9, [x12, #4]
    eor      w9, w9, #8
    strb     w9, [x2, #4]
    ldrb     w3, [x12, #5]
    mov      w9, #0xd2
    eor      w3, w3, w9
    strb     w3, [x2, #5]
    ldrb     w12, [x12, #6]
    eor      w12, w12, #0xffffffc7
    strb     w12, [x2, #6]
    adrp     x12, #0x530000
    add      x12, x12, #0xd9c
    ldrb     w2, [x12]
    eor      w2, w2, #0x38
    adrp     x3, #0x530000
    add      x3, x3, #0xda1
    strb     w2, [x3]
    ldrb     w2, [x12, #1]
    eor      w15, w2, w15
    strb     w15, [x3, #1]
    ldrb     w15, [x12, #2]
    mov      w2, #0xb9
    eor      w15, w15, w2
    strb     w15, [x3, #2]
    ldrb     w15, [x12, #3]
    eor      w11, w15, w11
    strb     w11, [x3, #3]
    ldrb     w11, [x12, #4]
    eor      w11, w11, w10
    strb     w11, [x3, #4]
    adrp     x11, #0x530000
    add      x11, x11, #0xd80
    ldrb     w12, [x11]
    eor      w12, w12, w2
    adrp     x15, #0x530000
    add      x15, x15, #0xd84
    strb     w12, [x15]
    ldrb     w12, [x11, #1]
    eor      w12, w12, w13
    strb     w12, [x15, #1]
    ldrb     w12, [x11, #2]
    eor      w12, w12, #4
    strb     w12, [x15, #2]
    ldrb     w11, [x11, #3]
    mov      w12, #0x3d
    eor      w11, w11, w12
    strb     w11, [x15, #3]
    adrp     x11, #0x530000
    add      x11, x11, #0xda6
    ldrb     w12, [x11]
    mov      w13, #0x75
    eor      w12, w12, w13
    adrp     x13, #0x530000
    add      x13, x13, #0xdae
    strb     w12, [x13]
    ldrb     w12, [x11, #1]
    mov      w15, #0x19
    eor      w12, w12, w15
    strb     w12, [x13, #1]
    ldrb     w12, [x11, #2]
    eor      w12, w12, #7
    strb     w12, [x13, #2]
    ldrb     w12, [x11, #3]
    mov      w15, #0xd6
    eor      w12, w12, w15
    strb     w12, [x13, #3]
    ldrb     w12, [x11, #4]
    mov      w15, #0x58
    eor      w12, w12, w15
    strb     w12, [x13, #4]
    ldrb     w12, [x11, #5]
    eor      w10, w12, w10
    strb     w10, [x13, #5]
    ldrb     w10, [x11, #6]
    eor      w10, w10, w16
    strb     w10, [x13, #6]
    ldrb     w10, [x11, #7]
    eor      w10, w10, w1
    adrp     x11, #0x530000
    add      x11, x11, #0xd18
    strb     w10, [x13, #7]
    ldrb     w10, [x11]
    mov      w12, #0xca
    eor      w10, w10, w12
    adrp     x12, #0x530000
    add      x12, x12, #0xd21
    strb     w10, [x12]
    ldrb     w10, [x11, #1]
    eor      w10, w10, w4
    strb     w10, [x12, #1]
    ldrb     w10, [x11, #2]
    eor      w10, w10, #0xfffffff7
    strb     w10, [x12, #2]
    ldrb     w10, [x11, #3]
    mov      w13, #0x24
    eor      w10, w10, w13
    strb     w10, [x12, #3]
    ldrb     w10, [x11, #4]
    mov      w13, #0x8a
    eor      w10, w10, w13
    strb     w10, [x12, #4]
    ldrb     w10, [x11, #5]
    eor      w10, w10, w14
    strb     w10, [x12, #5]
    ldrb     w10, [x11, #6]
    eor      w10, w10, #0xffffffe1
    strb     w10, [x12, #6]
    ldrb     w10, [x11, #7]
    eor      w10, w10, w17
    strb     w10, [x12, #7]
    ldrb     w10, [x11, #8]
    eor      w10, w10, w17
    strb     w10, [x12, #8]
    adrp     x10, #0x530000
    add      x10, x10, #0xd00
    ldrb     w11, [x10]
    eor      w11, w11, #0x7f
    adrp     x12, #0x530000
    add      x12, x12, #0xd05
    strb     w11, [x12]
    ldrb     w11, [x10, #1]
    eor      w9, w11, w9
    strb     w9, [x12, #1]
    ldrb     w9, [x10, #2]
    mov      w11, #0x62
    eor      w9, w9, w11
    strb     w9, [x12, #2]
    ldrb     w9, [x10, #3]
    eor      w9, w9, w0
    strb     w9, [x12, #3]
    ldrb     w9, [x10, #4]
    mov      w10, #0xfa
    eor      w9, w9, w10
    strb     w9, [x12, #4]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x20, sp, #0x10
    mov      sp, x20
    sub      x28, sp, #0x40
    mov      sp, x28
    sub      x8, sp, #0x30
    stur     x8, [x29, #-0x98]
    mov      sp, x8
    sub      x8, sp, #0x30
    stur     x8, [x29, #-0xa0]
    mov      sp, x8
    sub      x8, sp, #0x30
    stur     x8, [x29, #-0xb8]
    mov      sp, x8
    sub      x8, sp, #0x30
    stur     x8, [x29, #-0xc0]
    mov      sp, x8
    sub      x25, sp, #0x10
    mov      sp, x25
    sub      x27, sp, #0x30
    mov      sp, x27
    sub      x8, sp, #0x30
    stur     x8, [x29, #-0xa8]
    mov      sp, x8
    sub      x8, sp, #0x30
    stur     x8, [x29, #-0xb0]
    mov      sp, x8
    sub      x24, sp, #0x40
    mov      sp, x24
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x160]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x88]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8d0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x358]
    adrp     x2, #0x531000
    add      x2, x2, #0x130
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x29df74
    stp      x27, x25, [x29, #-0xe8]
    stur     x24, [x29, #-0xd8]
    stur     x22, [x29, #-0xc8]
    adrp     x8, #0x4c1000
    ldr      x22, [x8, #0x168]
    mov      x0, x21
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x19, [x29, #-0x90]
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x410]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x418]
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    mov      x0, x19
    ldur     x19, [x29, #-0x90]
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cbz      w27, #0x29ef30
    stur     x21, [x29, #-0xf0]
    mov      x0, x21
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x528]
    adrp     x2, #0x531000
    add      x2, x2, #0x370
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x27, #0x4c4000
    ldr      x0, [x27, #0xb8]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x22
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x29df80
    adrp     x2, #0x531000
    add      x2, x2, #0x370
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xd0]
    b        #0x29df8c
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    b        #0x29ef30
    adrp     x8, #0x4a6000
    add      x8, x8, #0xd8
    stur     x8, [x29, #-0xd0]
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x531000
    add      x2, x2, #0x270
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x0, [x27, #0xb8]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x22
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    stur     x23, [x29, #-0xf8]
    cbz      w0, #0x29dffc
    adrp     x2, #0x531000
    add      x2, x2, #0x270
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    b        #0x29e004
    adrp     x23, #0x4a6000
    add      x23, x23, #0xd8
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x338]
    mov      x0, x23
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    ldur     x27, [x29, #-0xd0]
    cbz      x0, #0x29ef14
    mov      x0, x23
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0xa0
    b.hi     #0x29ef14
    sub      x8, x29, #8
    stur     x22, [x8, #-0x100]
    stur     x23, [x29, #-0x100]
    adrp     x2, #0x531000
    add      x2, x2, #0x230
    mov      x22, x27
    mov      x0, x27
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x29e200
    mov      x28, x21
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x170]
    ldur     x27, [x29, #-0xc8]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    sub      x8, x29, #8
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x29e1e8
    adrp     x8, #0x4c1000
    ldr      x20, [x8, #0x178]
    mov      x0, x27
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x368]
    mov      x2, x19
    ldur     x3, [x29, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x24, #0x4be000
    ldr      x1, [x24, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cmp      x22, #0x19
    b.lo     #0x29e1e8
    adrp     x8, #0x4bf000
    ldr      x21, [x8, #0x788]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x918]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xe08]
    ldr      x24, [x24, #0x600]
    mov      x0, x27
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x27
    ldur     x27, [x29, #-0xc8]
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    cbz      x25, #0x29e1e8
    mov      x0, x27
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x23
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    cmp      x26, #0x18
    b.hi     #0x29e128
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x19, [x29, #-0x90]
    mov      x21, x28
    ldur     x27, [x29, #-0xd0]
    b        #0x29ef10
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x178]
    ldur     x0, [x29, #-0xc8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldp      x2, x1, [x29, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    sub      x8, x29, #8
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    ldur     x19, [x29, #-0x90]
    cbz      x0, #0x29ef04
    adrp     x2, #0x531000
    add      x2, x2, #0x1f0
    mov      x0, x22
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x29e2dc
    adrp     x2, #0x531000
    add      x2, x2, #0x170
    mov      x0, x21
    ldur     x27, [x29, #-0xf8]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x21
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x21
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x29e364
    adrp     x2, #0x531000
    add      x2, x2, #0x170
    mov      x22, x19
    mov      x0, x19
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    b        #0x29e370
    adrp     x28, #0x531000
    add      x28, x28, #0x330
    mov      x0, x22
    mov      x1, x26
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x29e46c
    adrp     x2, #0x531000
    add      x2, x2, #0x2b0
    mov      x0, x21
    ldur     x27, [x29, #-0xf8]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x29e4f4
    adrp     x2, #0x531000
    add      x2, x2, #0x2b0
    mov      x0, x21
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    b        #0x29e4fc
    mov      x22, x19
    adrp     x19, #0x4a6000
    add      x19, x19, #0xd8
    ldur     x24, [x29, #-0xc8]
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    sub      x8, x29, #8
    ldur     x21, [x8, #-0x100]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x29e454
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0x1f4
    b.hi     #0x29e454
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x180]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x28]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x28, #8]
    adrp     x8, #0x29e000
    add      x8, x8, #0xfb4
    adrp     x9, #0x4a4000
    add      x9, x9, #0x1f8
    stp      x8, x9, [x28, #0x10]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    str      x23, [x28, #0x20]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x28, #0x28]
    add      x0, x28, #0x30
    mov      x1, x20
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x21
    mov      x1, x28
    bl       #0x461978 // _dispatch_async
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    add      x0, x28, #0x30
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x28, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x28, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x19, [x29, #-0x90]
    mov      x21, x22
    ldur     x22, [x29, #-0xd0]
    b        #0x29ef04
    adrp     x2, #0x530000
    add      x2, x2, #0xfb0
    mov      x0, x22
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x29ef04
    adrp     x2, #0x530000
    add      x2, x2, #0xf70
    mov      x0, x21
    ldur     x19, [x29, #-0xf8]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x29e738
    adrp     x2, #0x530000
    add      x2, x2, #0xf70
    mov      x28, x21
    mov      x0, x21
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    b        #0x29e744
    adrp     x26, #0x4a6000
    add      x26, x26, #0xd8
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x531000
    add      x2, x2, #0x170
    mov      x0, x21
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x22
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x29e56c
    adrp     x2, #0x531000
    add      x2, x2, #0x170
    mov      x0, x21
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    b        #0x29e574
    adrp     x20, #0x4a6000
    add      x20, x20, #0xd8
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x531000
    add      x2, x2, #0x2f0
    mov      x0, x21
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x22
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    sub      x8, x29, #0x10
    stur     x21, [x8, #-0x100]
    cbz      w0, #0x29e5f0
    adrp     x2, #0x531000
    add      x2, x2, #0x2f0
    mov      x0, x21
    mov      x24, x27
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    b        #0x29e5fc
    mov      x24, x27
    adrp     x25, #0x4a6000
    add      x25, x25, #0xd8
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    sub      x8, x29, #8
    ldur     x21, [x8, #-0x100]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    ldp      x22, x27, [x29, #-0xd0]
    cbz      x0, #0x29eee4
    mov      x0, x26
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0xc8
    b.hi     #0x29eee4
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x29eee4
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0x1f4
    b.hi     #0x29eee4
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x190]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461c9c // _objc_release
    cbz      x19, #0x29ec3c
    adrp     x8, #0x531000
    add      x8, x8, #0xf0
    ldur     x19, [x29, #-0xa0]
    str      x8, [x19]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x531000
    add      x9, x8, #0xb0
    ldur     x2, [x29, #-0x98]
    stp      x0, x28, [x2]
    adrp     x8, #0x531000
    add      x8, x8, #0x2b0
    stp      x9, x8, [x19, #8]
    stp      x26, x20, [x2, #0x10]
    adrp     x8, #0x531000
    add      x8, x8, #0x70
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x2d8]
    adrp     x10, #0x531000
    add      x10, x10, #0x170
    stp      x10, x8, [x19, #0x18]
    ldr      x8, [x9]
    str      x8, [x2, #0x20]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    mov      x3, x19
    mov      w4, #5
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x188]
    mov      x0, x27
    mov      x2, x19
    mov      x3, x23
    bl       #0x461c6c // _objc_msgSend
    b        #0x29eed0
    mov      x28, x21
    adrp     x19, #0x4a6000
    add      x19, x19, #0xd8
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2c0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9a0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x1e0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5d0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x2, #0x530000
    add      x2, x2, #0xf30
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x29ec08
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #3
    b.ne     #0x29ec08
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x608]
    mov      x0, x21
    mov      x1, x25
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x23
    mov      x23, x0
    mov      x1, x26
    stur     x2, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x29ebfc
    mov      x0, x21
    mov      x1, x25
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    bl       #0x29fb5c
    mov      x26, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x23, [x29, #-0x98]
    cbz      w26, #0x29ec18
    adrp     x2, #0x530000
    add      x2, x2, #0xef0
    mov      x22, x28
    mov      x0, x28
    ldur     x26, [x29, #-0xf8]
    mov      x1, x26
    mov      x28, x2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x4a0]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    stur     d0, [x29, #-0xa0]
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x531000
    add      x2, x2, #0x30
    mov      x0, x22
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d0
    stur     d0, [x29, #-0xb8]
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x531000
    add      x2, x2, #0x1b0
    mov      x0, x22
    sub      x8, x29, #0x10
    stur     x22, [x8, #-0x100]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    fmov     x23, d10
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldur     x27, [x29, #-0xb0]
    str      x28, [x27]
    adrp     x28, #0x4c4000
    ldr      x0, [x28, #0xa8]
    ldur     x8, [x29, #-0xa0]
    and      x8, x8, #0x7fffffffffffffff
    fmov     d11, xzr
    fmaxnm   d0, d8, d11
    mov      x9, #0x7ff0000000000000
    cmp      x8, x9
    fcsel    d0, d0, d11, lt
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x498]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xa0]
    ldur     x24, [x29, #-0xa8]
    str      x0, [x24]
    adrp     x8, #0x531000
    add      x8, x8, #0x30
    str      x8, [x27, #8]
    ldr      x0, [x28, #0xa8]
    ldur     x8, [x29, #-0xb8]
    and      x8, x8, #0x7fffffffffffffff
    fmaxnm   d0, d9, d11
    fmov     d8, #1.00000000
    fcmp     d0, d8
    mov      x9, #0x7fefffffffffffff
    ccmp     x8, x9, #0, le
    fcsel    d0, d8, d0, gt
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb8]
    str      x0, [x24, #8]
    adrp     x8, #0x531000
    add      x8, x8, #0x1b0
    str      x8, [x27, #0x10]
    ldr      x0, [x28, #0xa8]
    and      x8, x23, #0x7fffffffffffffff
    fmov     d0, #0.25000000
    fmaxnm   d0, d10, d0
    fmov     d1, #4.00000000
    fcmp     d0, d1
    fcsel    d0, d1, d0, gt
    mov      x9, #0x7ff0000000000000
    cmp      x8, x9
    fcsel    d0, d0, d8, lt
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xc0]
    str      x0, [x24, #0x10]
    adrp     x2, #0x530000
    add      x2, x2, #0xeb0
    str      x2, [x27, #0x18]
    ldr      x23, [x28, #0xa8]
    mov      x0, x22
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x370]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f8]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    str      x0, [x24, #0x18]
    adrp     x8, #0x530000
    add      x8, x8, #0xe70
    str      x8, [x27, #0x20]
    adrp     x8, #0x4c4000
    ldr      x23, [x8, #0xa8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1d0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x778]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x998]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    str      x0, [x24, #0x20]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    mov      x2, x24
    mov      x3, x27
    mov      w4, #5
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xc0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x1e8]
    ldur     x0, [x29, #-0xc8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    ldur     x24, [x29, #-0xd8]
    str      x8, [x24]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x24, #8]
    adrp     x8, #0x29f000
    add      x8, x8, #0xce0
    adrp     x9, #0x4a2000
    add      x9, x9, #0x100
    stp      x8, x9, [x24, #0x10]
    ldur     x0, [x29, #-0x98]
    bl       #0x461ca8 // _objc_retain
    ldur     x8, [x29, #-0x98]
    stp      x8, x21, [x24, #0x20]
    str      x23, [x24, #0x30]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    mov      x1, x24
    bl       #0x461978 // _dispatch_async
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x24, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x24, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x24, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    ldur     x23, [x29, #-0x98]
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    sub      x8, x29, #0x10
    ldur     x21, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x19, [x29, #-0x90]
    b        #0x29e464
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldur     x23, [x29, #-0x98]
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x19, [x29, #-0x90]
    mov      x21, x28
    b        #0x29e464
    stur     x23, [x29, #-0x98]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x198]
    mov      x0, x27
    ldur     x2, [x29, #-0x88]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xa0]
    cbz      x0, #0x29ee0c
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x1a0]
    mov      x0, x27
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x458]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x798]
    mov      x2, x19
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc78]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    adrp     x2, #0x530000
    add      x2, x2, #0xff0
    sub      x8, x29, #0x10
    ldur     x0, [x8, #-0x100]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x370]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7a8]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x1a8]
    mov      x0, x27
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x1b0]
    mov      x0, x27
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x1b8]
    mov      x0, x27
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x1c0]
    mov      x0, x27
    ldur     x22, [x29, #-0x98]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x29f9fc
    mov      x2, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x1c8]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    ldur     x22, [x29, #-0xe0]
    mov      x0, x22
    mov      x1, x27
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    ldur     x24, [x29, #-0xe8]
    str      x8, [x24]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x24, #8]
    adrp     x8, #0x29f000
    add      x8, x8, #0xafc
    adrp     x9, #0x4a1000
    add      x9, x9, #0x628
    stp      x8, x9, [x24, #0x10]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    str      x23, [x24, #0x20]
    add      x0, x24, #0x28
    mov      x1, x22
    bl       #0x461c00 // _objc_copyWeak
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x21
    mov      x2, x23
    mov      w3, #1
    mov      x4, x24
    bl       #0x461c6c // _objc_msgSend
    add      x0, x24, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x24, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c0c // _objc_destroyWeak
    ldur     x22, [x29, #-0xd0]
    b        #0x29eec4
    adrp     x8, #0x531000
    add      x8, x8, #0xf0
    ldur     x23, [x29, #-0xc0]
    str      x8, [x23]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x531000
    add      x9, x8, #0xb0
    ldur     x2, [x29, #-0xb8]
    stp      x0, x28, [x2]
    adrp     x8, #0x531000
    add      x8, x8, #0x2b0
    stp      x9, x8, [x23, #8]
    stp      x26, x20, [x2, #0x10]
    adrp     x8, #0x531000
    add      x8, x8, #0x70
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x2d8]
    adrp     x10, #0x531000
    add      x10, x10, #0x170
    stp      x10, x8, [x23, #0x18]
    ldr      x8, [x9]
    str      x8, [x2, #0x20]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    mov      x3, x23
    mov      w4, #5
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x188]
    mov      x0, x27
    mov      x2, x23
    ldur     x3, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldp      x21, x23, [x29, #-0xa0]
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldur     x19, [x29, #-0x90]
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x10
    ldur     x21, [x8, #-0x100]
    mov      x27, x22
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldur     x23, [x29, #-0x100]
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldur     x21, [x29, #-0xf0]
    ldur     x0, [x29, #-0x88]
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x80]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x29ef88
    sub      sp, x29, #0x70
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    ldp      d9, d8, [sp, #0x10]
    ldp      d11, d10, [sp], #0x80
    ret      
    bl       #0x4618b8 // ___stack_chk_fail
    mov      x19, x0
    add      x0, x24, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x22
    b        #0x29efa8
    mov      x19, x0
    mov      x0, x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGFuncCardMediaController contentTypesForAccept:] IMP=0x2A03D8 bounds=0x2A03D8-0x2A090C
loc_2A03D8:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x90
    mov      x20, x2
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x580000
    add      x8, x8, #0x134
    ldar     w9, [x8]
    cbnz     w9, #0x2a054c
    adrp     x9, #0x531000
    add      x9, x9, #0x746
    ldrb     w10, [x9]
    mov      w11, #0x9e
    eor      w10, w10, w11
    adrp     x11, #0x531000
    add      x11, x11, #0x749
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xffffff87
    strb     w10, [x11, #1]
    ldrb     w9, [x9, #2]
    mov      w10, #0x5b
    eor      w9, w9, w10
    adrp     x10, #0x531000
    add      x10, x10, #0x74c
    strb     w9, [x11, #2]
    ldrb     w9, [x10]
    eor      w9, w9, #0xffffffdf
    adrp     x11, #0x531000
    add      x11, x11, #0x74e
    strb     w9, [x11]
    ldrb     w9, [x10, #1]
    mov      w10, #0xb4
    eor      w9, w9, w10
    strb     w9, [x11, #1]
    adrp     x9, #0x531000
    add      x9, x9, #0x742
    ldrb     w10, [x9]
    mov      w11, #0x7a
    eor      w10, w10, w11
    adrp     x12, #0x531000
    add      x12, x12, #0x744
    strb     w10, [x12]
    ldrb     w9, [x9, #1]
    mov      w10, #0xbe
    eor      w9, w9, w10
    strb     w9, [x12, #1]
    adrp     x9, #0x531000
    add      x9, x9, #0x73e
    ldrb     w10, [x9]
    eor      w10, w10, #0x44444444
    adrp     x12, #0x531000
    add      x12, x12, #0x740
    strb     w10, [x12]
    ldrb     w9, [x9, #1]
    eor      w9, w9, #0xc
    strb     w9, [x12, #1]
    adrp     x9, #0x531000
    add      x9, x9, #0x730
    ldrb     w10, [x9]
    mov      w12, #0xa1
    eor      w10, w10, w12
    adrp     x12, #0x531000
    add      x12, x12, #0x737
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    mov      w13, #0x12
    eor      w10, w10, w13
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xf0
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xc0
    strb     w10, [x12, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, w11
    strb     w10, [x12, #4]
    ldrb     w10, [x9, #5]
    mov      w11, #0xca
    eor      w10, w10, w11
    strb     w10, [x12, #5]
    ldrb     w9, [x9, #6]
    eor      w9, w9, #8
    strb     w9, [x12, #6]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x19, sp
    sub      x21, x19, #0x40
    mov      sp, x21
    sub      x22, sp, #0x80
    mov      sp, x22
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x3, x0
    movi     v0.16b, #0
    stp      q0, q0, [x19, #-0x40]
    stp      q0, q0, [x19, #-0x20]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xae0]
    adrp     x2, #0x531000
    add      x2, x2, #0x870
    stur     x20, [x29, #-0xd8]
    mov      x0, x20
    mov      x20, x3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stp      x1, x22, [x29, #-0xd0]
    mov      x2, x21
    mov      x3, x22
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2a088c
    mov      x19, x0
    ldr      x8, [x21, #0x10]
    ldr      x22, [x8]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x6c8]
    ldr      x8, [x8]
    stur     x8, [x29, #-0xa0]
    adrp     x28, #0x4c4000
    mov      x25, #0
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x5b8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x5c0]
    stp      x8, x9, [x29, #-0x70]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x5d0]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x818]
    stur     x8, [x29, #-0x60]
    adrp     x8, #0x4be000
    ldr      x10, [x8, #0x338]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x998]
    stp      x8, x9, [x29, #-0x80]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x5d8]
    stur     x8, [x29, #-0x98]
    adrp     x8, #0x4c1000
    ldr      x9, [x8, #0x1f8]
    adrp     x8, #0x4be000
    ldr      x11, [x8, #0x548]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x1f0]
    stp      x8, x11, [x29, #-0xb0]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xa08]
    stp      x8, x10, [x29, #-0x90]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x830]
    stp      x9, x8, [x29, #-0xc0]
    ldr      x8, [x21, #0x10]
    ldr      x8, [x8]
    cmp      x8, x22
    b.eq     #0x2a06a0
    mov      x0, x24
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x21, #8]
    ldr      x26, [x8, x25, lsl #3]
    ldr      x0, [x28, #0xc0]
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x26
    ldur     x1, [x29, #-0x70]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    ldur     x1, [x29, #-0x60]
    adrp     x2, #0x531000
    add      x2, x2, #0x830
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2a07a8
    mov      x0, x26
    ldur     x1, [x29, #-0x88]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #2
    b.lo     #0x2a07a8
    adrp     x8, #0x4c4000
    ldr      x23, [x8, #0x4e8]
    mov      x0, x26
    ldur     x1, [x29, #-0xa8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x21
    mov      x21, x22
    mov      x22, x19
    mov      x19, x24
    mov      x24, x20
    mov      x20, x0
    mov      x0, x23
    ldur     x1, [x29, #-0xb0]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x20
    mov      x20, x24
    mov      x24, x19
    mov      x19, x22
    mov      x22, x21
    mov      x21, x28
    adrp     x28, #0x4c4000
    bl       #0x461c9c // _objc_release
    cbnz     x27, #0x2a0830
    b        #0x2a0854
    mov      x0, x26
    ldur     x1, [x29, #-0x80]
    adrp     x2, #0x531000
    add      x2, x2, #0x7f0
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2a07d8
    mov      x0, x26
    ldur     x1, [x29, #-0x98]
    adrp     x2, #0x531000
    add      x2, x2, #0x7b0
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x2a080c
    mov      x0, x26
    ldur     x1, [x29, #-0x60]
    adrp     x2, #0x531000
    add      x2, x2, #0x770
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2a0804
    ldur     x27, [x29, #-0xa0]
    mov      x0, x27
    bl       #0x461ca8 // _objc_retain
    cbnz     x27, #0x2a0830
    b        #0x2a0854
    mov      x27, #0
    b        #0x2a0854
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x4e8]
    ldur     x1, [x29, #-0xc0]
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    cbz      x27, #0x2a0854
    mov      x0, x20
    ldur     x1, [x29, #-0x90]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x2a0854
    mov      x0, x20
    ldur     x1, [x29, #-0xb8]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    add      x25, x25, #1
    cmp      x19, x25
    b.ne     #0x2a0688
    mov      x0, x24
    ldp      x1, x3, [x29, #-0xd0]
    mov      x2, x21
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    cbnz     x0, #0x2a0608
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cbnz     x0, #0x2a08c4
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x6c8]
    ldr      x2, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x830]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldur     x0, [x29, #-0xd8]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2a0908
    mov      x0, x20
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    b        #0x461be8 // _objc_autoreleaseReturnValue
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGFuncCardMediaController presenterForWebView:] IMP=0x2A090C bounds=0x2A090C-0x2A0C74
loc_2A090C:
    sub      sp, sp, #0x140
    stp      x28, x27, [sp, #0xe0]
    stp      x26, x25, [sp, #0xf0]
    stp      x24, x23, [sp, #0x100]
    stp      x22, x21, [sp, #0x110]
    stp      x20, x19, [sp, #0x120]
    stp      x29, x30, [sp, #0x130]
    add      x29, sp, #0x130
    mov      x24, x2
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x60]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x468]
    adrp     x25, #0x4be000
    ldr      x21, [x25, #0x410]
    adrp     x27, #0x4be000
    ldr      x22, [x27, #0x418]
    adrp     x19, #0x4c4000
    mov      x26, x24
    str      x24, [sp, #8]
    mov      x23, x26
    mov      x0, x26
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cbz      x26, #0x2a09c8
    ldr      x0, [x19, #0xe0]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x26
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2a0974
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    b        #0x2a0b28
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4a8]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    cbnz     x0, #0x2a0af8
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0x30]
    stp      q0, q0, [sp, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1b0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xd98]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xda0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x478]
    add      x2, sp, #0x10
    add      x3, sp, #0x50
    mov      x0, x20
    mov      x1, x21
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2a0aec
    mov      x22, x0
    ldr      x8, [sp, #0x20]
    ldr      x19, [x8]
    adrp     x8, #0x4bf000
    mov      x28, #0
    mov      x26, x8
    ldr      x24, [x8, #0x9e8]
    ldr      x8, [sp, #0x20]
    ldr      x8, [x8]
    cmp      x8, x19
    b.eq     #0x2a0a8c
    mov      x0, x20
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp, #0x18]
    ldr      x23, [x8, x28, lsl #3]
    mov      x0, x23
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    cbnz     w0, #0x2a0adc
    add      x28, x28, #1
    cmp      x22, x28
    b.ne     #0x2a0a74
    add      x2, sp, #0x10
    add      x3, sp, #0x50
    mov      x0, x20
    mov      x1, x21
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x8, x26
    cbnz     x0, #0x2a0a68
    mov      x23, #0
    b        #0x2a0ae4
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    ldr      x24, [sp, #8]
    b        #0x2a0af0
    mov      x23, #0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xda8]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, #0
    mov      x22, #0
    cbz      x26, #0x2a0c28
    str      x0, [sp]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xdb8]
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0xc40]
    ldr      x24, [x25, #0x410]
    ldr      x25, [x27, #0x418]
    adrp     x8, #0x4bf000
    ldr      x20, [x8, #0x2e8]
    adrp     x8, #0x4bf000
    ldr      x19, [x8, #0x2d8]
    mov      x22, x26
    mov      x0, x26
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cbz      x0, #0x2a0bb0
    mov      x26, x0
    mov      x0, x22
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x1, x21
    cbz      w28, #0x2a0c00
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1b8]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x22
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x1, x19
    tbnz     w0, #0, #0x2a0c00
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1c0]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x22
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x1, x20
    cbz      w0, #0x2a0c24
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbnz     x26, #0x2a0b54
    mov      x22, x26
    ldp      x0, x24, [sp]
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2a0c70
    mov      x0, x22
    ldp      x29, x30, [sp, #0x130]
    ldp      x20, x19, [sp, #0x120]
    ldp      x22, x21, [sp, #0x110]
    ldp      x24, x23, [sp, #0x100]
    ldp      x26, x25, [sp, #0xf0]
    ldp      x28, x27, [sp, #0xe0]
    add      sp, sp, #0x140
    b        #0x461be8 // _objc_autoreleaseReturnValue
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGFuncCardMediaController deliver:expectedScope:] IMP=0x2A0C74 bounds=0x2A0C74-0x2A1208
loc_2A0C74:
    sub      sp, sp, #0x60
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x21, x3
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x580000
    add      x8, x8, #0x13c
    ldar     w9, [x8]
    cbnz     w9, #0x2a1070
    adrp     x9, #0x531000
    add      x9, x9, #0x890
    ldrb     w10, [x9]
    mov      w11, #0xb9
    eor      w11, w10, w11
    adrp     x10, #0x531000
    add      x10, x10, #0x8e0
    strb     w11, [x10]
    ldrb     w11, [x9, #1]
    mov      w12, #0x75
    eor      w11, w11, w12
    strb     w11, [x10, #1]
    ldrb     w11, [x9, #2]
    mov      w12, #0xf4
    eor      w11, w11, w12
    strb     w11, [x10, #2]
    ldrb     w11, [x9, #3]
    mov      w13, #0x34
    eor      w11, w11, w13
    strb     w11, [x10, #3]
    ldrb     w11, [x9, #4]
    mov      w14, #0x63
    eor      w11, w11, w14
    strb     w11, [x10, #4]
    ldrb     w11, [x9, #5]
    eor      w11, w11, w13
    strb     w11, [x10, #5]
    ldrb     w11, [x9, #6]
    mov      w13, #0x53
    eor      w11, w11, w13
    strb     w11, [x10, #6]
    ldrb     w11, [x9, #7]
    mov      w13, #0x72
    eor      w11, w11, w13
    strb     w11, [x10, #7]
    ldrb     w13, [x9, #8]
    mov      w11, #0xb7
    eor      w13, w13, w11
    strb     w13, [x10, #8]
    ldrb     w13, [x9, #9]
    eor      w13, w13, #0xfffffff9
    strb     w13, [x10, #9]
    ldrb     w13, [x9, #0xa]
    eor      w12, w13, w12
    strb     w12, [x10, #0xa]
    ldrb     w12, [x9, #0xb]
    mov      w13, #0xaf
    eor      w12, w12, w13
    strb     w12, [x10, #0xb]
    ldrb     w12, [x9, #0xc]
    mov      w13, #0xec
    eor      w12, w12, w13
    strb     w12, [x10, #0xc]
    ldrb     w12, [x9, #0xd]
    mov      w13, #0xda
    eor      w12, w12, w13
    strb     w12, [x10, #0xd]
    ldrb     w12, [x9, #0xe]
    mov      w13, #0xa8
    eor      w12, w12, w13
    strb     w12, [x10, #0xe]
    ldrb     w12, [x9, #0xf]
    mov      w13, #0x4b
    eor      w12, w12, w13
    strb     w12, [x10, #0xf]
    ldrb     w12, [x9, #0x10]
    mov      w13, #0xba
    eor      w12, w12, w13
    strb     w12, [x10, #0x10]
    ldrb     w12, [x9, #0x11]
    eor      w12, w12, #0xffffffef
    strb     w12, [x10, #0x11]
    ldrb     w12, [x9, #0x12]
    mov      w13, #0x3d
    eor      w12, w12, w13
    strb     w12, [x10, #0x12]
    ldrb     w12, [x9, #0x13]
    mov      w13, #0x89
    eor      w12, w12, w13
    strb     w12, [x10, #0x13]
    ldrb     w12, [x9, #0x14]
    eor      w12, w12, #0xf0
    strb     w12, [x10, #0x14]
    ldrb     w13, [x9, #0x15]
    mov      w12, #0xb0
    eor      w13, w13, w12
    strb     w13, [x10, #0x15]
    ldrb     w13, [x9, #0x16]
    mov      w14, #0x91
    eor      w13, w13, w14
    strb     w13, [x10, #0x16]
    ldrb     w13, [x9, #0x17]
    eor      w13, w13, #0xc
    strb     w13, [x10, #0x17]
    ldrb     w13, [x9, #0x18]
    mov      w14, #0xc4
    eor      w13, w13, w14
    strb     w13, [x10, #0x18]
    ldrb     w13, [x9, #0x19]
    eor      w13, w13, #0xfffffffd
    strb     w13, [x10, #0x19]
    ldrb     w13, [x9, #0x1a]
    mov      w14, #0x90
    eor      w13, w13, w14
    strb     w13, [x10, #0x1a]
    ldrb     w13, [x9, #0x1b]
    mov      w14, #0x1a
    eor      w13, w13, w14
    strb     w13, [x10, #0x1b]
    ldrb     w13, [x9, #0x1c]
    eor      w13, w13, #7
    strb     w13, [x10, #0x1c]
    ldrb     w13, [x9, #0x1d]
    mov      w14, #0x9e
    eor      w13, w13, w14
    strb     w13, [x10, #0x1d]
    ldrb     w13, [x9, #0x1e]
    eor      w13, w13, #0x66666666
    strb     w13, [x10, #0x1e]
    ldrb     w13, [x9, #0x1f]
    mov      w14, #0xf5
    eor      w13, w13, w14
    strb     w13, [x10, #0x1f]
    ldrb     w13, [x9, #0x20]
    eor      w13, w13, #0x66666666
    strb     w13, [x10, #0x20]
    ldrb     w13, [x9, #0x21]
    eor      w13, w13, #0x33333333
    strb     w13, [x10, #0x21]
    ldrb     w13, [x9, #0x22]
    mov      w14, #0x51
    eor      w13, w13, w14
    strb     w13, [x10, #0x22]
    ldrb     w13, [x9, #0x23]
    mov      w15, #0x85
    eor      w13, w13, w15
    strb     w13, [x10, #0x23]
    ldrb     w13, [x9, #0x24]
    mov      w15, #0xac
    eor      w13, w13, w15
    strb     w13, [x10, #0x24]
    ldrb     w13, [x9, #0x25]
    eor      w13, w13, #0x30
    strb     w13, [x10, #0x25]
    ldrb     w13, [x9, #0x26]
    mov      w15, #0xcd
    eor      w13, w13, w15
    strb     w13, [x10, #0x26]
    ldrb     w13, [x9, #0x27]
    eor      w13, w13, #0x1c
    strb     w13, [x10, #0x27]
    ldrb     w13, [x9, #0x28]
    eor      w13, w13, #0x11111111
    strb     w13, [x10, #0x28]
    ldrb     w13, [x9, #0x29]
    eor      w13, w13, w14
    strb     w13, [x10, #0x29]
    ldrb     w13, [x9, #0x2a]
    mov      w14, #0xc5
    eor      w13, w13, w14
    strb     w13, [x10, #0x2a]
    ldrb     w13, [x9, #0x2b]
    mov      w14, #0xc9
    eor      w13, w13, w14
    strb     w13, [x10, #0x2b]
    ldrb     w13, [x9, #0x2c]
    mov      w14, #0xdb
    eor      w13, w13, w14
    strb     w13, [x10, #0x2c]
    ldrb     w13, [x9, #0x2d]
    eor      w13, w13, #0x18
    strb     w13, [x10, #0x2d]
    ldrb     w13, [x9, #0x2e]
    mov      w14, #0xbc
    eor      w13, w13, w14
    strb     w13, [x10, #0x2e]
    ldrb     w13, [x9, #0x2f]
    mov      w14, #0xf2
    eor      w13, w13, w14
    strb     w13, [x10, #0x2f]
    ldrb     w13, [x9, #0x30]
    eor      w13, w13, #0xffffff83
    strb     w13, [x10, #0x30]
    ldrb     w13, [x9, #0x31]
    eor      w11, w13, w11
    strb     w11, [x10, #0x31]
    ldrb     w11, [x9, #0x32]
    eor      w11, w11, w15
    strb     w11, [x10, #0x32]
    ldrb     w11, [x9, #0x33]
    eor      w11, w11, #0x3e
    strb     w11, [x10, #0x33]
    ldrb     w11, [x9, #0x34]
    mov      w13, #0x1d
    eor      w11, w11, w13
    strb     w11, [x10, #0x34]
    ldrb     w11, [x9, #0x35]
    mov      w13, #0x57
    eor      w11, w11, w13
    strb     w11, [x10, #0x35]
    ldrb     w11, [x9, #0x36]
    mov      w14, #0x9d
    eor      w11, w11, w14
    strb     w11, [x10, #0x36]
    ldrb     w11, [x9, #0x37]
    mov      w14, #0x3b
    eor      w11, w11, w14
    strb     w11, [x10, #0x37]
    ldrb     w11, [x9, #0x38]
    mov      w14, #0xd7
    eor      w11, w11, w14
    strb     w11, [x10, #0x38]
    ldrb     w11, [x9, #0x39]
    eor      w11, w11, #0x33333333
    strb     w11, [x10, #0x39]
    ldrb     w11, [x9, #0x3a]
    eor      w11, w11, #0xf8
    strb     w11, [x10, #0x3a]
    ldrb     w11, [x9, #0x3b]
    eor      w11, w11, #0xc0
    strb     w11, [x10, #0x3b]
    ldrb     w11, [x9, #0x3c]
    mov      w14, #0x5c
    eor      w11, w11, w14
    strb     w11, [x10, #0x3c]
    ldrb     w11, [x9, #0x3d]
    eor      w11, w11, #0x7e
    strb     w11, [x10, #0x3d]
    ldrb     w11, [x9, #0x3e]
    eor      w11, w11, w13
    strb     w11, [x10, #0x3e]
    ldrb     w11, [x9, #0x3f]
    eor      w11, w11, w12
    strb     w11, [x10, #0x3f]
    ldrb     w11, [x9, #0x40]
    mov      w12, #0xde
    eor      w11, w11, w12
    strb     w11, [x10, #0x40]
    ldrb     w9, [x9, #0x41]
    eor      w9, w9, #0xfffffff3
    strb     w9, [x10, #0x41]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c1000
    ldr      x22, [x8, #0x170]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cbz      w23, #0x2a11e0
    adrp     x8, #0x4c1000
    ldr      x21, [x8, #0x160]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbz      x23, #0x2a11e8
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2e8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xa30]
    mov      x2, x19
    mov      x3, #0
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x338]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x25, #0x4c4000
    cbz      x0, #0x2a1160
    ldr      x0, [x25, #0xb8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7c8]
    mov      x2, x22
    mov      w3, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    b        #0x2a1164
    mov      x23, #0
    mov      x0, x23
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2a11d8
    ldr      x0, [x25, #0xb8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    str      x23, [sp]
    adrp     x2, #0x531000
    add      x2, x2, #0x950
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x200]
    mov      x2, x24
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    add      sp, sp, #0x60
    b        #0x461c9c // _objc_release

// -[WCLGFuncCardMediaController clearPendingPicker] IMP=0x2A1208 bounds=0x2A1208-0x2A1318
loc_2A1208:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x20, [x8, #0x190]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x1d0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xc78]
    mov      x1, x23
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x23
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x1a8]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x1b0]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x1b8]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x1c0]
    mov      x0, x19
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x1c8]
    mov      x0, x19
    mov      x2, #0
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461c6c // _objc_msgSend

// -[WCLGFuncCardMediaController updateScope:] IMP=0x2A1318 bounds=0x2A1318-0x2A1444
loc_2A1318:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x19
    bl       #0x29fb5c
    cbz      w0, #0x2a1360
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    b        #0x2a1368
    adrp     x21, #0x4a6000
    add      x21, x21, #0xd8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x170]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    tbnz     w23, #0, #0x2a1424
    adrp     x8, #0x4c1000
    ldr      x22, [x8, #0x190]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    bl       #0x461c9c // _objc_release
    cbz      x23, #0x2a1410
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb38]
    mov      w2, #0
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x208]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x210]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461c9c // _objc_release

// -[WCLGFuncCardMediaController documentPicker:didPickDocumentsAtURLs:] IMP=0x2A1444 bounds=0x2A1444-0x2A16E0
loc_2A1444:
    sub      sp, sp, #0xb0
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      x20, x3
    mov      x19, x2
    mov      x24, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x218]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x26, #0x4a6000
    add      x26, x26, #0xd8
    cmp      x0, #0
    csel     x21, x26, x0, eq
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x220]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    cmp      x0, #0
    csel     x22, x26, x0, eq
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x228]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    cmp      x0, #0
    csel     x23, x26, x0, eq
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x230]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x208]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2a1688
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x338]
    mov      x0, x21
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2a1688
    mov      x0, x22
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2a1688
    mov      x0, x23
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2a1688
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    sub      x0, x29, #0x48
    mov      x1, x24
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x180]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp, #8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    adrp     x8, #0x2a1000
    add      x8, x8, #0x6e0
    str      d0, [sp, #0x10]
    adrp     x9, #0x4a4000
    add      x9, x9, #0x228
    stp      x8, x9, [sp, #0x18]
    str      x26, [sp, #0x28]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    str      x23, [sp, #0x30]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    str      x22, [sp, #0x38]
    str      x25, [sp, #0x50]
    add      x25, sp, #8
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    add      x0, x25, #0x40
    sub      x1, x29, #0x48
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    str      x21, [sp, #0x40]
    add      x1, sp, #8
    mov      x0, x24
    bl       #0x461978 // _dispatch_async
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x40]
    bl       #0x461c9c // _objc_release
    add      x0, x25, #0x40
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [sp, #0x38]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    sub      x0, x29, #0x48
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    add      sp, sp, #0xb0
    ret      
    mov      x19, x0
    sub      x0, x29, #0x48
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGFuncCardMediaController documentPickerWasCancelled:] IMP=0x2A3240 bounds=0x2A3240-0x2A3714
loc_2A3240:
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
    add      x8, x8, #0x15c
    ldar     w9, [x8]
    cbnz     w9, #0x2a34f4
    adrp     x9, #0x531000
    add      x9, x9, #0xda2
    ldrb     w10, [x9]
    mov      w11, #0xb6
    eor      w10, w10, w11
    adrp     x11, #0x531000
    add      x11, x11, #0xda5
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x47
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w9, [x9, #2]
    mov      w10, #0x9d
    eor      w9, w9, w10
    strb     w9, [x11, #2]
    adrp     x9, #0x531000
    add      x9, x9, #0xd8c
    ldrb     w11, [x9]
    eor      w10, w11, w10
    adrp     x11, #0x531000
    add      x11, x11, #0xd92
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x54
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x6c
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x8b
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x4f
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w9, [x9, #5]
    mov      w10, #0xd1
    eor      w9, w9, w10
    strb     w9, [x11, #5]
    adrp     x9, #0x531000
    add      x9, x9, #0xd98
    ldrb     w10, [x9]
    mov      w11, #0x37
    adrp     x12, #0x531000
    add      x12, x12, #0xd9d
    eor      w10, w10, w11
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    mov      w11, #0x8c
    eor      w10, w10, w11
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    mov      w11, #0xf6
    eor      w10, w10, w11
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    mov      w11, #0x6f
    eor      w10, w10, w11
    strb     w10, [x12, #3]
    ldrb     w9, [x9, #4]
    eor      w9, w9, #0xffffff81
    adrp     x10, #0x531000
    add      x10, x10, #0xd82
    strb     w9, [x12, #4]
    ldrb     w9, [x10]
    mov      w11, #0xd7
    eor      w9, w9, w11
    adrp     x11, #0x531000
    add      x11, x11, #0xd87
    strb     w9, [x11]
    ldrb     w9, [x10, #1]
    eor      w9, w9, #0xffffffc3
    strb     w9, [x11, #1]
    ldrb     w9, [x10, #2]
    mov      w12, #0x41
    eor      w9, w9, w12
    strb     w9, [x11, #2]
    ldrb     w9, [x10, #3]
    eor      w9, w9, #0xffffffc1
    strb     w9, [x11, #3]
    ldrb     w9, [x10, #4]
    mov      w10, #0x68
    eor      w9, w9, w10
    strb     w9, [x11, #4]
    adrp     x9, #0x531000
    add      x9, x9, #0xd6e
    ldrb     w10, [x9]
    mov      w11, #0x36
    eor      w10, w10, w11
    adrp     x11, #0x531000
    add      x11, x11, #0xd78
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x4b
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0x78
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0x7e
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0x1e
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0x7c
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0x26
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0x65
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    eor      w10, w10, #0x7f
    strb     w10, [x11, #8]
    ldrb     w9, [x9, #9]
    mov      w10, #0x98
    eor      w9, w9, w10
    strb     w9, [x11, #9]
    adrp     x9, #0x531000
    add      x9, x9, #0xd60
    ldrb     w10, [x9]
    mov      w11, #0x9c
    adrp     x12, #0x531000
    add      x12, x12, #0xd67
    eor      w10, w10, w11
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x88888888
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    mov      w11, #0xb4
    eor      w10, w10, w11
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    mov      w11, #0x5c
    eor      w10, w10, w11
    strb     w10, [x12, #3]
    ldrb     w10, [x9, #4]
    mov      w11, #0x2e
    eor      w10, w10, w11
    strb     w10, [x12, #4]
    ldrb     w10, [x9, #5]
    mov      w11, #0xb3
    eor      w10, w10, w11
    strb     w10, [x12, #5]
    ldrb     w9, [x9, #6]
    eor      w9, w9, #0xe0
    strb     w9, [x12, #6]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x21, sp, #0x30
    mov      sp, x21
    sub      x22, sp, #0x30
    mov      sp, x22
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x218]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x26, #0x4a6000
    add      x26, x26, #0xd8
    cmp      x0, #0
    csel     x20, x26, x0, eq
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x220]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    cmp      x0, #0
    csel     x23, x26, x0, eq
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x228]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    cmp      x0, #0
    csel     x24, x26, x0, eq
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x208]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x338]
    mov      x0, x20
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2a36c4
    mov      x0, x23
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2a36c4
    mov      x0, x24
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2a36c4
    adrp     x8, #0x531000
    add      x8, x8, #0xf10
    str      x8, [x22]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x531000
    add      x8, x8, #0xe90
    adrp     x9, #0x531000
    add      x9, x9, #0xed0
    stp      x0, x9, [x21]
    adrp     x9, #0x531000
    add      x9, x9, #0xe50
    stp      x8, x9, [x22, #8]
    adrp     x8, #0x531000
    add      x8, x8, #0xe10
    stp      x20, x23, [x21, #0x10]
    adrp     x9, #0x531000
    add      x9, x9, #0xdd0
    stp      x8, x9, [x22, #0x18]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x2d8]
    ldr      x8, [x8]
    str      x8, [x21, #0x20]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    mov      x2, x21
    mov      x3, x22
    mov      w4, #5
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x188]
    mov      x0, x19
    mov      x2, x21
    mov      x3, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x48]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2a3710
    sub      sp, x29, #0x40
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGFuncCardMediaController presentationControllerDidDismiss:] IMP=0x2A3714 bounds=0x2A3714-0x2A3C28
loc_2A3714:
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
    add      x8, x8, #0x160
    ldar     w9, [x8]
    cbnz     w9, #0x2a39bc
    adrp     x10, #0x531000
    add      x10, x10, #0xf72
    ldrb     w9, [x10]
    mov      w11, #0xd5
    eor      w9, w9, w11
    adrp     x11, #0x531000
    add      x11, x11, #0xf75
    strb     w9, [x11]
    ldrb     w12, [x10, #1]
    mov      w9, #0xf6
    eor      w12, w12, w9
    strb     w12, [x11, #1]
    ldrb     w10, [x10, #2]
    mov      w12, #0x74
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    adrp     x10, #0x531000
    add      x10, x10, #0xf5c
    ldrb     w11, [x10]
    eor      w11, w11, #0x3c
    adrp     x12, #0x531000
    add      x12, x12, #0xf62
    strb     w11, [x12]
    ldrb     w11, [x10, #1]
    mov      w13, #0x4f
    eor      w11, w11, w13
    strb     w11, [x12, #1]
    ldrb     w11, [x10, #2]
    mov      w13, #0x31
    eor      w11, w11, w13
    strb     w11, [x12, #2]
    ldrb     w11, [x10, #3]
    mov      w13, #0x7d
    eor      w11, w11, w13
    strb     w11, [x12, #3]
    ldrb     w11, [x10, #4]
    mov      w13, #0x3a
    eor      w11, w11, w13
    strb     w11, [x12, #4]
    ldrb     w10, [x10, #5]
    mov      w11, #0xdb
    eor      w10, w10, w11
    strb     w10, [x12, #5]
    adrp     x10, #0x531000
    add      x10, x10, #0xf52
    ldrb     w11, [x10]
    eor      w11, w11, #0xfffffff9
    adrp     x12, #0x531000
    add      x12, x12, #0xf57
    strb     w11, [x12]
    ldrb     w11, [x10, #1]
    eor      w11, w11, #0x11111111
    strb     w11, [x12, #1]
    ldrb     w11, [x10, #2]
    mov      w14, #0x85
    eor      w11, w11, w14
    strb     w11, [x12, #2]
    ldrb     w11, [x10, #3]
    eor      w11, w11, #0xffffffc3
    strb     w11, [x12, #3]
    ldrb     w10, [x10, #4]
    eor      w10, w10, #0x1c
    adrp     x11, #0x531000
    add      x11, x11, #0xf3e
    strb     w10, [x12, #4]
    ldrb     w10, [x11]
    eor      w10, w10, w13
    adrp     x12, #0x531000
    add      x12, x12, #0xf48
    strb     w10, [x12]
    ldrb     w10, [x11, #1]
    mov      w13, #0x2e
    eor      w10, w10, w13
    strb     w10, [x12, #1]
    ldrb     w10, [x11, #2]
    eor      w10, w10, #0xffffffc3
    strb     w10, [x12, #2]
    ldrb     w10, [x11, #3]
    mvn      w10, w10
    strb     w10, [x12, #3]
    ldrb     w10, [x11, #4]
    mov      w13, #0x4a
    eor      w10, w10, w13
    strb     w10, [x12, #4]
    ldrb     w10, [x11, #5]
    mov      w13, #0x5a
    eor      w10, w10, w13
    strb     w10, [x12, #5]
    ldrb     w10, [x11, #6]
    eor      w10, w10, #0xfffffff1
    strb     w10, [x12, #6]
    ldrb     w10, [x11, #7]
    mov      w13, #0x61
    eor      w10, w10, w13
    strb     w10, [x12, #7]
    ldrb     w10, [x11, #8]
    mov      w13, #0x41
    eor      w10, w10, w13
    strb     w10, [x12, #8]
    ldrb     w10, [x11, #9]
    mov      w11, #0x57
    eor      w10, w10, w11
    strb     w10, [x12, #9]
    adrp     x10, #0x531000
    add      x10, x10, #0xf68
    ldrb     w12, [x10]
    mov      w13, #0xb9
    eor      w12, w12, w13
    adrp     x13, #0x531000
    add      x13, x13, #0xf6d
    strb     w12, [x13]
    ldrb     w12, [x10, #1]
    mov      w14, #0x16
    eor      w12, w12, w14
    strb     w12, [x13, #1]
    ldrb     w12, [x10, #2]
    eor      w9, w12, w9
    strb     w9, [x13, #2]
    ldrb     w9, [x10, #3]
    mov      w12, #0xda
    eor      w9, w9, w12
    strb     w9, [x13, #3]
    ldrb     w9, [x10, #4]
    eor      w9, w9, #0xeeeeeeee
    strb     w9, [x13, #4]
    adrp     x9, #0x531000
    add      x9, x9, #0xf30
    ldrb     w10, [x9]
    mov      w12, #0x3d
    eor      w10, w10, w12
    adrp     x12, #0x531000
    add      x12, x12, #0xf37
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    mov      w13, #0xc5
    eor      w10, w10, w13
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xffffff87
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, w11
    strb     w10, [x12, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0xffffffe1
    strb     w10, [x12, #4]
    ldrb     w10, [x9, #5]
    mov      w11, #0xa4
    eor      w10, w10, w11
    strb     w10, [x12, #5]
    ldrb     w9, [x9, #6]
    mov      w10, #0xab
    eor      w9, w9, w10
    strb     w9, [x12, #6]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x20, sp, #0x30
    mov      sp, x20
    sub      x21, sp, #0x30
    mov      sp, x21
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xdb8]
    mov      x0, x2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x190]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cmp      x22, x23
    b.ne     #0x2a3bf0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x218]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x26, #0x4a6000
    add      x26, x26, #0xd8
    cmp      x0, #0
    csel     x22, x26, x0, eq
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x220]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    cmp      x0, #0
    csel     x23, x26, x0, eq
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x228]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    cmp      x0, #0
    csel     x24, x26, x0, eq
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x208]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x338]
    mov      x0, x22
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2a3bd8
    mov      x0, x23
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2a3bd8
    mov      x0, x24
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2a3bd8
    adrp     x8, #0x532000
    add      x8, x8, #0xe0
    str      x8, [x21]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f8]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x532000
    add      x8, x8, #0x60
    adrp     x9, #0x532000
    add      x9, x9, #0xa0
    stp      x0, x9, [x20]
    adrp     x9, #0x532000
    add      x9, x9, #0x20
    stp      x8, x9, [x21, #8]
    adrp     x8, #0x531000
    add      x8, x8, #0xfe0
    stp      x22, x23, [x20, #0x10]
    adrp     x9, #0x531000
    add      x9, x9, #0xfa0
    stp      x8, x9, [x21, #0x18]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x2d8]
    ldr      x8, [x8]
    str      x8, [x20, #0x20]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    mov      x2, x20
    mov      x3, x21
    mov      w4, #5
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x188]
    mov      x0, x19
    mov      x2, x20
    mov      x3, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x48]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2a3c24
    sub      sp, x29, #0x40
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGFuncCardMediaController webView:startURLSchemeTask:] IMP=0x2A3C28 bounds=0x2A3C28-0x2A4214
loc_2A3C28:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x30
    mov      x20, x3
    mov      x21, x0
    adrp     x8, #0x580000
    add      x8, x8, #0x164
    ldar     w9, [x8]
    cbnz     w9, #0x2a3dcc
    adrp     x9, #0x532000
    add      x9, x9, #0x10c
    ldrb     w10, [x9]
    mov      w11, #0xd6
    eor      w10, w10, w11
    adrp     x11, #0x532000
    add      x11, x11, #0x11c
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x56
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xaf
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xfffffffd
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w13, #0xb5
    eor      w10, w10, w13
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0x40
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w13, #0xce
    eor      w10, w10, w13
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w13, #0xb2
    eor      w10, w10, w13
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w13, #0x64
    eor      w10, w10, w13
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    mov      w13, #0xea
    eor      w10, w10, w13
    strb     w10, [x11, #9]
    ldrb     w10, [x9, #0xa]
    mov      w13, #0x7b
    eor      w10, w10, w13
    strb     w10, [x11, #0xa]
    ldrb     w10, [x9, #0xb]
    mov      w13, #0xb
    eor      w10, w10, w13
    strb     w10, [x11, #0xb]
    ldrb     w10, [x9, #0xc]
    mov      w13, #0x74
    eor      w10, w10, w13
    strb     w10, [x11, #0xc]
    ldrb     w10, [x9, #0xd]
    eor      w10, w10, #0x30
    strb     w10, [x11, #0xd]
    ldrb     w10, [x9, #0xe]
    eor      w10, w10, w12
    strb     w10, [x11, #0xe]
    ldrb     w9, [x9, #0xf]
    mov      w10, #0x2a
    eor      w9, w9, w10
    strb     w9, [x11, #0xf]
    adrp     x9, #0x532000
    add      x9, x9, #0x100
    ldrb     w10, [x9]
    mov      w11, #0xae
    eor      w10, w10, w11
    adrp     x11, #0x532000
    add      x11, x11, #0x106
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x69
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x5c
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0x3e
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0xc9
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w9, [x9, #5]
    mov      w10, #0x6d
    eor      w9, w9, w10
    strb     w9, [x11, #5]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x50
    stur     x8, [x29, #-0x68]
    mov      sp, x8
    stur     x2, [x29, #-0x58]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x120]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    bl       #0x461d14 // _objc_sync_enter
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x130]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x128]
    mov      x0, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x830]
    mov      x0, x22
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461d20 // _objc_sync_exit
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x238]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x240]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x1d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x170]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x1e0]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x5d0]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x358]
    adrp     x2, #0x532000
    add      x2, x2, #0x190
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2a4188
    stur     x19, [x29, #-0x60]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x280]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x2, #0x532000
    add      x2, x2, #0x150
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2a4174
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #3
    b.ne     #0x2a4174
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x0, x25
    stur     x1, [x29, #-0x78]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x70]
    mov      x1, x26
    ldur     x2, [x29, #-0x60]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2a416c
    mov      x0, x25
    ldur     x1, [x29, #-0x78]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    bl       #0x29fb5c
    stur     w0, [x29, #-0x7c]
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x70]
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    ldur     x19, [x29, #-0x60]
    ldur     w8, [x29, #-0x7c]
    tbz      w8, #0, #0x2a4198
    mov      x0, x19
    mov      w1, #0
    bl       #0x2a4214
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x25
    ldur     x1, [x29, #-0x78]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x820]
    mov      x0, x27
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x180]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    ldur     x26, [x29, #-0x68]
    str      x8, [x26]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x26, #8]
    adrp     x8, #0x2a4000
    add      x8, x8, #0x3ec
    adrp     x9, #0x4a4000
    add      x9, x9, #0x258
    stp      x8, x9, [x26, #0x10]
    stp      x19, x21, [x26, #0x20]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    str      x20, [x26, #0x30]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    str      x23, [x26, #0x38]
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    str      x24, [x26, #0x40]
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    str      x25, [x26, #0x48]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    mov      x1, x26
    bl       #0x461978 // _dispatch_async
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x48]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x40]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x38]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldur     x19, [x29, #-0x60]
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    b        #0x2a41b0
    ldur     x0, [x29, #-0x70]
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x19, [x29, #-0x60]
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x248]
    mov      x0, x21
    mov      x2, x20
    mov      w3, #0x194
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x58]
    bl       #0x461c9c // _objc_release
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    mov      x20, x0
    mov      x0, x19
    bl       #0x461d20 // _objc_sync_exit
    mov      x0, x20
    bl       #0x461894 // __Unwind_Resume

// -[WCLGFuncCardMediaController webView:stopURLSchemeTask:] IMP=0x2A7904 bounds=0x2A7904-0x2A7A38
loc_2A7904:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x20, x3
    mov      x19, x2
    mov      x22, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c1000
    ldr      x24, [x8, #0x120]
    mov      x0, x22
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461d14 // _objc_sync_enter
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x128]
    mov      x0, x22
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x130]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xa08]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    cbz      w26, #0x2a79e8
    mov      x0, x22
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x830]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461d20 // _objc_sync_exit
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    b        #0x461c9c // _objc_release
    mov      x19, x0
    mov      x0, x21
    bl       #0x461d20 // _objc_sync_exit
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGFuncCardMediaController webView] IMP=0x2A7A38 bounds=0x2A7A38-0x2A7A50
loc_2A7A38:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    add      x0, x0, #8
    bl       #0x461c60 // _objc_loadWeakRetained
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGFuncCardMediaController setWebView:] IMP=0x2A7A50 bounds=0x2A7A50-0x2A7A5C
loc_2A7A50:
    mov      x1, x2
    add      x0, x0, #8
    b        #0x461d08 // _objc_storeWeak

// -[WCLGFuncCardMediaController scope] IMP=0x2A7A5C bounds=0x2A7A5C-0x2A7A64
loc_2A7A5C:
    ldr      x0, [x0, #0x10]
    ret      

// -[WCLGFuncCardMediaController setScope:] IMP=0x2A7A64 bounds=0x2A7A64-0x2A7A6C
loc_2A7A64:
    mov      w3, #0x10
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGFuncCardMediaController ioQueue] IMP=0x2A7A6C bounds=0x2A7A6C-0x2A7A74
loc_2A7A6C:
    ldr      x0, [x0, #0x18]
    ret      

// -[WCLGFuncCardMediaController setIoQueue:] IMP=0x2A7A74 bounds=0x2A7A74-0x2A7A80
loc_2A7A74:
    mov      x1, x2
    add      x0, x0, #0x18
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFuncCardMediaController stateQueue] IMP=0x2A7A80 bounds=0x2A7A80-0x2A7A88
loc_2A7A80:
    ldr      x0, [x0, #0x20]
    ret      

// -[WCLGFuncCardMediaController setStateQueue:] IMP=0x2A7A88 bounds=0x2A7A88-0x2A7A94
loc_2A7A88:
    mov      x1, x2
    add      x0, x0, #0x20
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFuncCardMediaController activeTasks] IMP=0x2A7A94 bounds=0x2A7A94-0x2A7A9C
loc_2A7A94:
    ldr      x0, [x0, #0x28]
    ret      

// -[WCLGFuncCardMediaController setActiveTasks:] IMP=0x2A7A9C bounds=0x2A7A9C-0x2A7AA8
loc_2A7A9C:
    mov      x1, x2
    add      x0, x0, #0x28
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFuncCardMediaController cancelledTasks] IMP=0x2A7AA8 bounds=0x2A7AA8-0x2A7AB0
loc_2A7AA8:
    ldr      x0, [x0, #0x30]
    ret      

// -[WCLGFuncCardMediaController setCancelledTasks:] IMP=0x2A7AB0 bounds=0x2A7AB0-0x2A7ABC
loc_2A7AB0:
    mov      x1, x2
    add      x0, x0, #0x30
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFuncCardMediaController pageScopes] IMP=0x2A7ABC bounds=0x2A7ABC-0x2A7AC4
loc_2A7ABC:
    ldr      x0, [x0, #0x38]
    ret      

// -[WCLGFuncCardMediaController setPageScopes:] IMP=0x2A7AC4 bounds=0x2A7AC4-0x2A7AD0
loc_2A7AC4:
    mov      x1, x2
    add      x0, x0, #0x38
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFuncCardMediaController pendingPicker] IMP=0x2A7AD0 bounds=0x2A7AD0-0x2A7AD8
loc_2A7AD0:
    ldr      x0, [x0, #0x40]
    ret      

// -[WCLGFuncCardMediaController setPendingPicker:] IMP=0x2A7AD8 bounds=0x2A7AD8-0x2A7AE4
loc_2A7AD8:
    mov      x1, x2
    add      x0, x0, #0x40
    b        #0x461cfc // _objc_storeStrong

// -[WCLGFuncCardMediaController pendingRequestId] IMP=0x2A7AE4 bounds=0x2A7AE4-0x2A7AEC
loc_2A7AE4:
    ldr      x0, [x0, #0x48]
    ret      

// -[WCLGFuncCardMediaController setPendingRequestId:] IMP=0x2A7AEC bounds=0x2A7AEC-0x2A7AF4
loc_2A7AEC:
    mov      w3, #0x48
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGFuncCardMediaController pendingToken] IMP=0x2A7AF4 bounds=0x2A7AF4-0x2A7AFC
loc_2A7AF4:
    ldr      x0, [x0, #0x50]
    ret      

// -[WCLGFuncCardMediaController setPendingToken:] IMP=0x2A7AFC bounds=0x2A7AFC-0x2A7B04
loc_2A7AFC:
    mov      w3, #0x50
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGFuncCardMediaController pendingScope] IMP=0x2A7B04 bounds=0x2A7B04-0x2A7B0C
loc_2A7B04:
    ldr      x0, [x0, #0x58]
    ret      

// -[WCLGFuncCardMediaController setPendingScope:] IMP=0x2A7B0C bounds=0x2A7B0C-0x2A7B14
loc_2A7B0C:
    mov      w3, #0x58
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGFuncCardMediaController pendingStorageGeneration] IMP=0x2A7B14 bounds=0x2A7B14-0x2A7B1C
loc_2A7B14:
    ldr      x0, [x0, #0x60]
    ret      

// -[WCLGFuncCardMediaController setPendingStorageGeneration:] IMP=0x2A7B1C bounds=0x2A7B1C-0x2A7B24
loc_2A7B1C:
    str      x2, [x0, #0x60]
    ret      

// -[WCLGFuncCardMediaController .cxx_destruct] IMP=0x2A7B24 bounds=0x2A7B24-0x2A7BBC
loc_2A7B24:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    add      x0, x0, #0x58
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x50
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x48
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x40
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x38
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x30
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x28
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x20
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x18
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x10
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #8
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c0c // _objc_destroyWeak
