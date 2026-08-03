// Exact ARM64 listing for WCLGVariableBlurHostView

// -[WCLGVariableBlurHostView initWithFrame:] IMP=0x29A6DC bounds=0x29A6DC-0x29A9DC
loc_29A6DC:
    adrp     x8, #0x57f000
    add      x8, x8, #0xfbc
    ldar     w9, [x8]
    cbnz     w9, #0x29a824
    adrp     x9, #0x530000
    add      x9, x9, #0x7a0
    ldrb     w11, [x9]
    mov      w12, #0x84
    adrp     x10, #0x530000
    add      x10, x10, #0x7c0
    eor      w11, w11, w12
    strb     w11, [x10]
    ldrb     w11, [x9, #1]
    mov      w12, #0x74
    eor      w11, w11, w12
    strb     w11, [x10, #1]
    ldrb     w11, [x9, #2]
    eor      w11, w11, #8
    strb     w11, [x10, #2]
    ldrb     w11, [x9, #3]
    eor      w11, w11, #0xaaaaaaaa
    strb     w11, [x10, #3]
    ldrb     w11, [x9, #4]
    eor      w11, w11, #0x66666666
    strb     w11, [x10, #4]
    ldrb     w11, [x9, #5]
    mov      w12, #0x9c
    eor      w11, w11, w12
    strb     w11, [x10, #5]
    ldrb     w11, [x9, #6]
    eor      w11, w11, #0x60
    strb     w11, [x10, #6]
    ldrb     w11, [x9, #7]
    mov      w12, #0x86
    eor      w11, w11, w12
    strb     w11, [x10, #7]
    ldrb     w11, [x9, #8]
    mov      w12, #0x7d
    eor      w11, w11, w12
    strb     w11, [x10, #8]
    ldrb     w11, [x9, #9]
    eor      w11, w11, #3
    strb     w11, [x10, #9]
    ldrb     w11, [x9, #0xa]
    mov      w12, #0x27
    eor      w11, w11, w12
    strb     w11, [x10, #0xa]
    ldrb     w11, [x9, #0xb]
    eor      w11, w11, #0x99999999
    strb     w11, [x10, #0xb]
    ldrb     w11, [x9, #0xc]
    mov      w12, #0xb9
    eor      w11, w11, w12
    strb     w11, [x10, #0xc]
    ldrb     w11, [x9, #0xd]
    eor      w11, w11, #0xf0
    strb     w11, [x10, #0xd]
    ldrb     w11, [x9, #0xe]
    mov      w12, #0x6e
    eor      w11, w11, w12
    strb     w11, [x10, #0xe]
    ldrb     w11, [x9, #0xf]
    mov      w12, #0xb1
    eor      w11, w11, w12
    strb     w11, [x10, #0xf]
    ldrb     w11, [x9, #0x10]
    eor      w11, w11, #0xffffffdf
    strb     w11, [x10, #0x10]
    ldrb     w11, [x9, #0x11]
    mov      w12, #0x2f
    eor      w11, w11, w12
    strb     w11, [x10, #0x11]
    ldrb     w11, [x9, #0x12]
    mov      w12, #0x2e
    eor      w11, w11, w12
    strb     w11, [x10, #0x12]
    ldrb     w11, [x9, #0x13]
    eor      w11, w11, #0x10
    strb     w11, [x10, #0x13]
    ldrb     w9, [x9, #0x14]
    eor      w9, w9, #0xffffffdf
    strb     w9, [x10, #0x14]
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
    ldr      x10, [x10, #0x788]
    stp      x0, x10, [x9, #-0x10]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0xb38]
    mov      x0, x8
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x19, x0
    cbz      x0, #0x29a9c4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x690]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0xac8]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x808]
    adrp     x2, #0x530000
    add      x2, x2, #0x800
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x7aa9c
    bl       #0x11defc
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c4000
    ldrsw    x21, [x8, #0xb90]
    ldr      x8, [x19, x21]
    str      x0, [x19, x21]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, x21]
    cbz      x8, #0x29a9c4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x21]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x21]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbf8]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, x21]
    fmov     d0, #0.50000000
    bl       #0x11dfe0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x2, [x19, x21]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x810]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    sub      sp, x29, #0x20
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    ret      

// -[WCLGVariableBlurHostView layoutSubviews] IMP=0x29A9DC bounds=0x29A9DC-0x29AA8C
loc_29A9DC:
    sub      sp, sp, #0x50
    stp      d11, d10, [sp, #0x10]
    stp      d9, d8, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x788]
    stp      x0, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x670]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    fmov     d10, d2
    fmov     d11, d3
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x10]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d10
    fmov     d3, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    ldp      d11, d10, [sp, #0x10]
    add      sp, sp, #0x50
    ret      

// -[WCLGVariableBlurHostView backdropLayer] IMP=0x29AA8C bounds=0x29AA8C-0x29AA9C
loc_29AA8C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb90]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGVariableBlurHostView setBackdropLayer:] IMP=0x29AA9C bounds=0x29AA9C-0x29AAB0
loc_29AA9C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb90]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGVariableBlurHostView gradientImage] IMP=0x29AAB0 bounds=0x29AAB0-0x29AAC0
loc_29AAB0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb94]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGVariableBlurHostView setGradientImage:] IMP=0x29AAC0 bounds=0x29AAC0-0x29AAD4
loc_29AAC0:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb94]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGVariableBlurHostView lastSize] IMP=0x29AAD4 bounds=0x29AAD4-0x29AAE8
loc_29AAD4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb98]
    add      x8, x0, x8
    ldp      d0, d1, [x8]
    ret      

// -[WCLGVariableBlurHostView setLastSize:] IMP=0x29AAE8 bounds=0x29AAE8-0x29AAFC
loc_29AAE8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb98]
    add      x8, x0, x8
    stp      d0, d1, [x8]
    ret      

// -[WCLGVariableBlurHostView lastConstantHeight] IMP=0x29AAFC bounds=0x29AAFC-0x29AB0C
loc_29AAFC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb9c]
    ldr      d0, [x0, x8]
    ret      

// -[WCLGVariableBlurHostView setLastConstantHeight:] IMP=0x29AB0C bounds=0x29AB0C-0x29AB1C
loc_29AB0C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb9c]
    str      d0, [x0, x8]
    ret      

// -[WCLGVariableBlurHostView lastInverted] IMP=0x29AB1C bounds=0x29AB1C-0x29AB2C
loc_29AB1C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xba0]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGVariableBlurHostView setLastInverted:] IMP=0x29AB2C bounds=0x29AB2C-0x29AB3C
loc_29AB2C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xba0]
    strb     w2, [x0, x8]
    ret      

// -[WCLGVariableBlurHostView lastGradientHeight] IMP=0x29AB3C bounds=0x29AB3C-0x29AB4C
loc_29AB3C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xba4]
    ldr      d0, [x0, x8]
    ret      

// -[WCLGVariableBlurHostView setLastGradientHeight:] IMP=0x29AB4C bounds=0x29AB4C-0x29AB5C
loc_29AB4C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xba4]
    str      d0, [x0, x8]
    ret      

// -[WCLGVariableBlurHostView .cxx_destruct] IMP=0x29AB5C bounds=0x29AB5C-0x29AB9C
loc_29AB5C:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb94]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xb90]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
