// Exact ARM64 listing for WCLGGlassPackage

// +[WCLGGlassPackage supportDir] IMP=0x2E2628 bounds=0x2E2628-0x2E282C
loc_2E2628:
    adrp     x8, #0x580000
    add      x8, x8, #0x40c
    ldar     w9, [x8]
    cbnz     w9, #0x2e2754
    adrp     x9, #0x53e000
    add      x9, x9, #0xe80
    ldrb     w10, [x9]
    mov      w11, #0x3d
    eor      w11, w10, w11
    adrp     x10, #0x53e000
    add      x10, x10, #0xea0
    strb     w11, [x10]
    ldrb     w11, [x9, #1]
    eor      w11, w11, #0xfffffff1
    strb     w11, [x10, #1]
    ldrb     w11, [x9, #2]
    mov      w12, #0xe2
    eor      w11, w11, w12
    strb     w11, [x10, #2]
    ldrb     w11, [x9, #3]
    mov      w12, #0x9e
    eor      w11, w11, w12
    strb     w11, [x10, #3]
    ldrb     w11, [x9, #4]
    eor      w11, w11, #0x11111111
    strb     w11, [x10, #4]
    ldrb     w11, [x9, #5]
    eor      w11, w11, #0xffffffcf
    strb     w11, [x10, #5]
    ldrb     w11, [x9, #6]
    mov      w12, #0x8c
    eor      w11, w11, w12
    strb     w11, [x10, #6]
    ldrb     w11, [x9, #7]
    mov      w12, #0xea
    eor      w11, w11, w12
    strb     w11, [x10, #7]
    ldrb     w11, [x9, #8]
    mov      w12, #0xab
    eor      w11, w11, w12
    strb     w11, [x10, #8]
    ldrb     w11, [x9, #9]
    eor      w11, w11, #0x78
    strb     w11, [x10, #9]
    ldrb     w11, [x9, #0xa]
    eor      w11, w11, #0x3f
    strb     w11, [x10, #0xa]
    ldrb     w11, [x9, #0xb]
    mov      w12, #0x74
    eor      w11, w11, w12
    strb     w11, [x10, #0xb]
    ldrb     w11, [x9, #0xc]
    mov      w12, #0x8a
    eor      w11, w11, w12
    strb     w11, [x10, #0xc]
    ldrb     w11, [x9, #0xd]
    mov      w12, #0xd
    eor      w11, w11, w12
    strb     w11, [x10, #0xd]
    ldrb     w11, [x9, #0xe]
    mov      w12, #0x2f
    eor      w11, w11, w12
    strb     w11, [x10, #0xe]
    ldrb     w11, [x9, #0xf]
    mov      w12, #0xc2
    eor      w11, w11, w12
    strb     w11, [x10, #0xf]
    ldrb     w11, [x9, #0x10]
    mov      w12, #0x76
    eor      w11, w11, w12
    strb     w11, [x10, #0x10]
    ldrb     w9, [x9, #0x11]
    mov      w11, #0xd6
    eor      w9, w9, w11
    strb     w9, [x10, #0x11]
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      w9, #1
    stlr     w9, [x8]
    mov      w0, #0xe
    mov      w1, #1
    mov      w2, #1
    bl       #0x461798 // _NSSearchPathForDirectoriesInDomains
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x918]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x820]
    adrp     x2, #0x53e000
    add      x2, x2, #0xee0
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x108]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x800]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x920]
    mov      x2, x19
    mov      w3, #1
    mov      x4, #0
    mov      x5, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461be8 // _objc_autoreleaseReturnValue

// +[WCLGGlassPackage vaultDir] IMP=0x2E282C bounds=0x2E282C-0x2E2990
loc_2E282C:
    adrp     x8, #0x580000
    add      x8, x8, #0x410
    ldar     w9, [x8]
    cbnz     w9, #0x2e28e8
    adrp     x9, #0x53e000
    add      x9, x9, #0xf00
    ldrb     w10, [x9]
    eor      w10, w10, #0x22222222
    adrp     x11, #0x53e000
    add      x11, x11, #0xf0b
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xcb
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x68
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x4c
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0xfffffff3
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x2e
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    eor      w10, w10, #0x33333333
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0xa8
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    eor      w10, w10, #0xffffff87
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    mov      w12, #0x63
    eor      w10, w10, w12
    strb     w10, [x11, #9]
    ldrb     w9, [x9, #0xa]
    eor      w9, w9, #0xffffffef
    strb     w9, [x11, #0xa]
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4d0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x820]
    adrp     x2, #0x53e000
    add      x2, x2, #0xf40
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x108]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x800]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x920]
    mov      x2, x20
    mov      w3, #1
    mov      x4, #0
    mov      x5, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461be8 // _objc_autoreleaseReturnValue

// +[WCLGGlassPackage vaultPathForTheme:] IMP=0x2E2990 bounds=0x2E2990-0x2E2AE4
loc_2E2990:
    sub      sp, sp, #0x40
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x2
    adrp     x8, #0x580000
    add      x8, x8, #0x414
    ldar     w9, [x8]
    cbnz     w9, #0x2e2a50
    adrp     x9, #0x53e000
    add      x9, x9, #0xf60
    ldrb     w10, [x9]
    eor      w10, w10, #0x77777777
    adrp     x11, #0x53e000
    add      x11, x11, #0xf6a
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x40
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x7b
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xffffffef
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x45
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0xfffffff9
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0xd6
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    eor      w10, w10, #0xffffff9f
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w12, #0xf5
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w9, [x9, #9]
    eor      w9, w9, #0x7e
    strb     w9, [x11, #9]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4d8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    str      x19, [sp]
    adrp     x2, #0x53e000
    add      x2, x2, #0xfa0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x820]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    add      sp, sp, #0x40
    b        #0x461be8 // _objc_autoreleaseReturnValue

// +[WCLGGlassPackage indexPath] IMP=0x2E2AE4 bounds=0x2E2AE4-0x2E2C50
loc_2E2AE4:
    adrp     x8, #0x580000
    add      x8, x8, #0x418
    ldar     w9, [x8]
    cbnz     w9, #0x2e2bec
    adrp     x9, #0x53e000
    add      x9, x9, #0xfc0
    ldrb     w10, [x9]
    mov      w11, #0xd5
    eor      w10, w10, w11
    adrp     x11, #0x53e000
    add      x11, x11, #0xfcf
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xfa
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x68
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0xc8
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0xb9
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0xffffffef
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0x9e
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0xde
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w12, #0x9b
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    mov      w12, #0x71
    eor      w10, w10, w12
    strb     w10, [x11, #9]
    ldrb     w10, [x9, #0xa]
    mov      w12, #0x2f
    eor      w10, w10, w12
    strb     w10, [x11, #0xa]
    ldrb     w10, [x9, #0xb]
    mov      w12, #0xa6
    eor      w10, w10, w12
    strb     w10, [x11, #0xb]
    ldrb     w10, [x9, #0xc]
    eor      w10, w10, #0xffffff87
    strb     w10, [x11, #0xc]
    ldrb     w10, [x9, #0xd]
    mov      w12, #0x4b
    eor      w10, w10, w12
    strb     w10, [x11, #0xd]
    ldrb     w9, [x9, #0xe]
    mov      w10, #0x26
    eor      w9, w9, w10
    strb     w9, [x11, #0xe]
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4d0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x820]
    adrp     x2, #0x53f000
    add      x2, x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461be8 // _objc_autoreleaseReturnValue

// +[WCLGGlassPackage performConfidentialityMigrationIfNeeded] IMP=0x2E2C50 bounds=0x2E2C50-0x2E4C10
loc_2E2C50:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x100
    mov      x20, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x60]
    adrp     x2, #0x580000
    add      x2, x2, #0x41c
    ldar     w8, [x2]
    cbnz     w8, #0x2e3af8
    adrp     x8, #0x53f000
    add      x8, x8, #0x1f0
    ldrb     w9, [x8]
    mov      w15, #0x5f
    eor      w9, w9, w15
    adrp     x10, #0x53f000
    add      x10, x10, #0x1ff
    strb     w9, [x10]
    ldrb     w9, [x8, #1]
    eor      w9, w9, #0xffffffc1
    strb     w9, [x10, #1]
    ldrb     w9, [x8, #2]
    mov      w6, #0xba
    eor      w9, w9, w6
    strb     w9, [x10, #2]
    ldrb     w9, [x8, #3]
    eor      w9, w9, #0x55555555
    strb     w9, [x10, #3]
    ldrb     w9, [x8, #4]
    eor      w9, w9, #0x7e
    strb     w9, [x10, #4]
    ldrb     w9, [x8, #5]
    eor      w9, w9, #7
    strb     w9, [x10, #5]
    ldrb     w9, [x8, #6]
    mov      w11, #0xa7
    eor      w9, w9, w11
    strb     w9, [x10, #6]
    ldrb     w9, [x8, #7]
    mov      w11, #0x21
    eor      w9, w9, w11
    strb     w9, [x10, #7]
    ldrb     w9, [x8, #8]
    mov      w11, #0x9d
    eor      w9, w9, w11
    strb     w9, [x10, #8]
    ldrb     w9, [x8, #9]
    eor      w9, w9, #0x55555555
    strb     w9, [x10, #9]
    ldrb     w9, [x8, #0xa]
    mov      w11, #0xc9
    eor      w9, w9, w11
    strb     w9, [x10, #0xa]
    ldrb     w9, [x8, #0xb]
    mov      w19, #0xf2
    eor      w9, w9, w19
    strb     w9, [x10, #0xb]
    ldrb     w9, [x8, #0xc]
    eor      w9, w9, #0xc
    strb     w9, [x10, #0xc]
    ldrb     w9, [x8, #0xd]
    mov      w14, #0x8c
    eor      w9, w9, w14
    strb     w9, [x10, #0xd]
    ldrb     w8, [x8, #0xe]
    mov      w9, #0x14
    eor      w8, w8, w9
    strb     w8, [x10, #0xe]
    adrp     x10, #0x53f000
    add      x10, x10, #0x1ce
    ldrb     w8, [x10]
    mov      w9, #0x63
    eor      w8, w8, w9
    adrp     x11, #0x53f000
    add      x11, x11, #0x1da
    strb     w8, [x11]
    ldrb     w8, [x10, #1]
    eor      w8, w8, #0xeeeeeeee
    strb     w8, [x11, #1]
    ldrb     w8, [x10, #2]
    eor      w8, w8, #0x70
    strb     w8, [x11, #2]
    ldrb     w8, [x10, #3]
    eor      w8, w8, #0xeeeeeeee
    strb     w8, [x11, #3]
    ldrb     w8, [x10, #4]
    eor      w8, w8, w9
    strb     w8, [x11, #4]
    ldrb     w8, [x10, #5]
    mov      w12, #0xa4
    eor      w8, w8, w12
    strb     w8, [x11, #5]
    ldrb     w12, [x10, #6]
    mov      w8, #0xd8
    eor      w12, w12, w8
    strb     w12, [x11, #6]
    ldrb     w12, [x10, #7]
    eor      w12, w12, #0xffffffc3
    strb     w12, [x11, #7]
    ldrb     w12, [x10, #8]
    mov      w13, #0xb6
    eor      w12, w12, w13
    strb     w12, [x11, #8]
    ldrb     w12, [x10, #9]
    mov      w13, #0xe5
    eor      w12, w12, w13
    strb     w12, [x11, #9]
    ldrb     w12, [x10, #0xa]
    mov      w17, #0x12
    eor      w12, w12, w17
    strb     w12, [x11, #0xa]
    ldrb     w10, [x10, #0xb]
    eor      w10, w10, #0x3c
    strb     w10, [x11, #0xb]
    adrp     x10, #0x53f000
    add      x10, x10, #0x1a2
    ldrb     w11, [x10]
    mov      w25, #0x41
    adrp     x12, #0x53f000
    add      x12, x12, #0x1af
    eor      w11, w11, w25
    strb     w11, [x12]
    ldrb     w11, [x10, #1]
    eor      w11, w11, #0xc
    strb     w11, [x12, #1]
    ldrb     w11, [x10, #2]
    eor      w11, w11, #0xe
    strb     w11, [x12, #2]
    ldrb     w11, [x10, #3]
    mov      w13, #0x61
    eor      w11, w11, w13
    strb     w11, [x12, #3]
    ldrb     w11, [x10, #4]
    mov      w9, #0x45
    eor      w11, w11, w9
    strb     w11, [x12, #4]
    ldrb     w11, [x10, #5]
    mov      w13, #0x34
    eor      w11, w11, w13
    strb     w11, [x12, #5]
    ldrb     w11, [x10, #6]
    mov      w7, #0xbc
    eor      w11, w11, w7
    strb     w11, [x12, #6]
    ldrb     w11, [x10, #7]
    mov      w13, #0x7a
    eor      w11, w11, w13
    strb     w11, [x12, #7]
    ldrb     w11, [x10, #8]
    mov      w13, #0x5e
    eor      w11, w11, w13
    strb     w11, [x12, #8]
    ldrb     w11, [x10, #9]
    eor      w11, w11, #0x77777777
    strb     w11, [x12, #9]
    ldrb     w11, [x10, #0xa]
    eor      w11, w11, w14
    strb     w11, [x12, #0xa]
    ldrb     w11, [x10, #0xb]
    mov      w13, #0x71
    eor      w11, w11, w13
    strb     w11, [x12, #0xb]
    ldrb     w10, [x10, #0xc]
    mov      w11, #0x47
    eor      w10, w10, w11
    strb     w10, [x12, #0xc]
    adrp     x10, #0x53f000
    add      x10, x10, #0x170
    ldrb     w11, [x10]
    mov      w12, #0xa0
    eor      w12, w11, w12
    adrp     x11, #0x53f000
    add      x11, x11, #0x190
    strb     w12, [x11]
    ldrb     w12, [x10, #1]
    eor      w12, w12, w15
    strb     w12, [x11, #1]
    ldrb     w12, [x10, #2]
    mov      w13, #0x3a
    eor      w12, w12, w13
    strb     w12, [x11, #2]
    ldrb     w12, [x10, #3]
    mov      w0, #0x73
    eor      w12, w12, w0
    strb     w12, [x11, #3]
    ldrb     w12, [x10, #4]
    mov      w0, #0x90
    eor      w12, w12, w0
    strb     w12, [x11, #4]
    ldrb     w12, [x10, #5]
    mov      w0, #0xca
    eor      w12, w12, w0
    strb     w12, [x11, #5]
    ldrb     w12, [x10, #6]
    mov      w0, #0xcb
    eor      w12, w12, w0
    strb     w12, [x11, #6]
    ldrb     w0, [x10, #7]
    mov      w3, #0xb2
    eor      w0, w0, w3
    strb     w0, [x11, #7]
    ldrb     w0, [x10, #8]
    mov      w28, #0x75
    eor      w0, w0, w28
    strb     w0, [x11, #8]
    ldrb     w0, [x10, #9]
    eor      w0, w0, #0xffffffef
    strb     w0, [x11, #9]
    ldrb     w0, [x10, #0xa]
    eor      w13, w0, w13
    strb     w13, [x11, #0xa]
    ldrb     w0, [x10, #0xb]
    mov      w13, #0xc6
    eor      w0, w0, w13
    strb     w0, [x11, #0xb]
    ldrb     w0, [x10, #0xc]
    mov      w1, #0xd5
    eor      w0, w0, w1
    strb     w0, [x11, #0xc]
    ldrb     w1, [x10, #0xd]
    mov      w12, #0xd7
    eor      w1, w1, w12
    strb     w1, [x11, #0xd]
    ldrb     w1, [x10, #0xe]
    mov      w4, #0xbd
    eor      w1, w1, w4
    strb     w1, [x11, #0xe]
    ldrb     w1, [x10, #0xf]
    eor      w1, w1, w8
    strb     w1, [x11, #0xf]
    ldrb     w1, [x10, #0x10]
    mov      w4, #0xd0
    eor      w1, w1, w4
    strb     w1, [x11, #0x10]
    ldrb     w10, [x10, #0x11]
    eor      w10, w10, #0xfffffffb
    strb     w10, [x11, #0x11]
    adrp     x10, #0x53f000
    add      x10, x10, #0x100
    ldrb     w11, [x10]
    mov      w1, #0xc4
    eor      w1, w11, w1
    adrp     x11, #0x53f000
    add      x11, x11, #0x120
    strb     w1, [x11]
    ldrb     w1, [x10, #1]
    eor      w1, w1, #0xe
    strb     w1, [x11, #1]
    ldrb     w1, [x10, #2]
    mov      w4, #0x36
    eor      w1, w1, w4
    strb     w1, [x11, #2]
    ldrb     w1, [x10, #3]
    eor      w1, w1, w17
    strb     w1, [x11, #3]
    ldrb     w1, [x10, #4]
    eor      w1, w1, #0x70
    strb     w1, [x11, #4]
    ldrb     w1, [x10, #5]
    eor      w1, w1, #0xffffffcf
    strb     w1, [x11, #5]
    ldrb     w1, [x10, #6]
    mov      w12, #0x76
    eor      w1, w1, w12
    strb     w1, [x11, #6]
    ldrb     w1, [x10, #7]
    mov      w5, #0x27
    eor      w1, w1, w5
    strb     w1, [x11, #7]
    ldrb     w1, [x10, #8]
    mov      w5, #0x23
    eor      w1, w1, w5
    strb     w1, [x11, #8]
    ldrb     w1, [x10, #9]
    eor      w1, w1, #0x77777777
    strb     w1, [x11, #9]
    ldrb     w1, [x10, #0xa]
    mov      w5, #0x3d
    eor      w1, w1, w5
    strb     w1, [x11, #0xa]
    ldrb     w1, [x10, #0xb]
    mov      w5, #0x6a
    eor      w1, w1, w5
    strb     w1, [x11, #0xb]
    ldrb     w1, [x10, #0xc]
    mov      w30, #0xed
    eor      w1, w1, w30
    strb     w1, [x11, #0xc]
    ldrb     w1, [x10, #0xd]
    mov      w27, #0x29
    eor      w1, w1, w27
    strb     w1, [x11, #0xd]
    ldrb     w1, [x10, #0xe]
    mov      w5, #0x4c
    eor      w1, w1, w5
    strb     w1, [x11, #0xe]
    ldrb     w1, [x10, #0xf]
    mov      w22, #0x4d
    eor      w1, w1, w22
    strb     w1, [x11, #0xf]
    ldrb     w10, [x10, #0x10]
    eor      w8, w10, w8
    strb     w8, [x11, #0x10]
    adrp     x8, #0x53f000
    add      x8, x8, #0xd9
    ldrb     w10, [x8]
    mov      w11, #0xb
    eor      w10, w10, w11
    adrp     x11, #0x53f000
    add      x11, x11, #0xe7
    strb     w10, [x11]
    ldrb     w10, [x8, #1]
    mov      w12, #0x2f
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w5, [x8, #2]
    mov      w10, #0x43
    eor      w5, w5, w10
    strb     w5, [x11, #2]
    ldrb     w5, [x8, #3]
    eor      w5, w5, #0xffffff83
    strb     w5, [x11, #3]
    ldrb     w5, [x8, #4]
    mov      w21, #0xd1
    eor      w5, w5, w21
    strb     w5, [x11, #4]
    ldrb     w5, [x8, #5]
    mov      w21, #0x2b
    eor      w5, w5, w21
    strb     w5, [x11, #5]
    ldrb     w5, [x8, #6]
    mov      w21, #0x86
    eor      w5, w5, w21
    strb     w5, [x11, #6]
    ldrb     w5, [x8, #7]
    mov      w21, #0xc2
    eor      w5, w5, w21
    strb     w5, [x11, #7]
    ldrb     w5, [x8, #8]
    mov      w21, #0x6c
    eor      w5, w5, w21
    strb     w5, [x11, #8]
    ldrb     w5, [x8, #9]
    mov      w21, #0xb9
    eor      w5, w5, w21
    strb     w5, [x11, #9]
    ldrb     w21, [x8, #0xa]
    mov      w5, #0x4b
    eor      w21, w21, w5
    strb     w21, [x11, #0xa]
    ldrb     w21, [x8, #0xb]
    mov      w23, #0x19
    eor      w21, w21, w23
    strb     w21, [x11, #0xb]
    ldrb     w21, [x8, #0xc]
    mov      w26, #0x89
    eor      w21, w21, w26
    strb     w21, [x11, #0xc]
    ldrb     w8, [x8, #0xd]
    eor      w8, w8, #0x7e
    strb     w8, [x11, #0xd]
    adrp     x8, #0x53f000
    add      x8, x8, #0xcf
    ldrb     w11, [x8]
    mov      w23, #9
    eor      w11, w11, w23
    adrp     x21, #0x53f000
    add      x21, x21, #0xd4
    strb     w11, [x21]
    ldrb     w11, [x8, #1]
    mov      w24, #0xa8
    eor      w11, w11, w24
    strb     w11, [x21, #1]
    ldrb     w11, [x8, #2]
    eor      w11, w11, #0xfffffffd
    strb     w11, [x21, #2]
    ldrb     w11, [x8, #3]
    mov      w24, #0x5b
    eor      w11, w11, w24
    strb     w11, [x21, #3]
    ldrb     w8, [x8, #4]
    eor      w8, w8, #0x33333333
    adrp     x11, #0x53f000
    add      x11, x11, #0x3e
    strb     w8, [x21, #4]
    ldrb     w8, [x11]
    eor      w8, w8, #0x7f
    adrp     x21, #0x53f000
    add      x21, x21, #0x4a
    strb     w8, [x21]
    ldrb     w8, [x11, #1]
    mov      w24, #0x1d
    eor      w8, w8, w24
    strb     w8, [x21, #1]
    ldrb     w8, [x11, #2]
    eor      w8, w8, w7
    strb     w8, [x21, #2]
    ldrb     w8, [x11, #3]
    mov      w7, #0x35
    eor      w8, w8, w7
    strb     w8, [x21, #3]
    ldrb     w8, [x11, #4]
    mov      w24, #0x2d
    eor      w8, w8, w24
    strb     w8, [x21, #4]
    ldrb     w8, [x11, #5]
    eor      w8, w8, #0xfffffff9
    strb     w8, [x21, #5]
    ldrb     w8, [x11, #6]
    eor      w8, w8, #0x66666666
    strb     w8, [x21, #6]
    ldrb     w16, [x11, #7]
    mov      w8, #0xe2
    eor      w16, w16, w8
    strb     w16, [x21, #7]
    ldrb     w16, [x11, #8]
    eor      w16, w16, #0x1c
    strb     w16, [x21, #8]
    ldrb     w16, [x11, #9]
    mov      w0, #0xd9
    eor      w16, w16, w0
    strb     w16, [x21, #9]
    ldrb     w16, [x11, #0xa]
    eor      w16, w16, w17
    strb     w16, [x21, #0xa]
    ldrb     w11, [x11, #0xb]
    mov      w16, #0xb0
    eor      w11, w11, w16
    strb     w11, [x21, #0xb]
    adrp     x11, #0x53f000
    add      x11, x11, #0x9b
    ldrb     w16, [x11]
    mov      w21, #0x8e
    eor      w16, w16, w21
    adrp     x0, #0x53f000
    add      x0, x0, #0xa0
    strb     w16, [x0]
    ldrb     w16, [x11, #1]
    eor      w16, w16, w22
    strb     w16, [x0, #1]
    ldrb     w16, [x11, #2]
    eor      w16, w16, w26
    strb     w16, [x0, #2]
    ldrb     w16, [x11, #3]
    eor      w16, w16, #0x1f
    strb     w16, [x0, #3]
    ldrb     w11, [x11, #4]
    eor      w11, w11, #0x3e
    adrp     x16, #0x53f000
    add      x16, x16, #0x1bc
    strb     w11, [x0, #4]
    ldrb     w11, [x16]
    eor      w11, w11, w8
    adrp     x0, #0x53f000
    add      x0, x0, #0x1c5
    strb     w11, [x0]
    ldrb     w11, [x16, #1]
    eor      w11, w11, #0x30
    strb     w11, [x0, #1]
    ldrb     w11, [x16, #2]
    mov      w26, #0xde
    eor      w11, w11, w26
    strb     w11, [x0, #2]
    ldrb     w11, [x16, #3]
    mov      w26, #0x79
    eor      w11, w11, w26
    strb     w11, [x0, #3]
    ldrb     w11, [x16, #4]
    eor      w11, w11, #0x7f
    strb     w11, [x0, #4]
    ldrb     w11, [x16, #5]
    mov      w26, #0xac
    eor      w11, w11, w26
    strb     w11, [x0, #5]
    ldrb     w11, [x16, #6]
    mov      w26, #0x2c
    eor      w11, w11, w26
    strb     w11, [x0, #6]
    ldrb     w11, [x16, #7]
    eor      w11, w11, #0xc
    strb     w11, [x0, #7]
    ldrb     w11, [x16, #8]
    eor      w10, w11, w10
    strb     w10, [x0, #8]
    adrp     x10, #0x53f000
    add      x10, x10, #0xa5
    ldrb     w11, [x10]
    mov      w16, #0x52
    eor      w11, w11, w16
    adrp     x0, #0x53f000
    add      x0, x0, #0xb2
    strb     w11, [x0]
    ldrb     w11, [x10, #1]
    mov      w1, #0xaf
    eor      w11, w11, w1
    strb     w11, [x0, #1]
    ldrb     w11, [x10, #2]
    eor      w11, w11, #0x38
    strb     w11, [x0, #2]
    ldrb     w11, [x10, #3]
    mov      w1, #0xec
    eor      w11, w11, w1
    strb     w11, [x0, #3]
    ldrb     w11, [x10, #4]
    eor      w11, w11, #0xaaaaaaaa
    strb     w11, [x0, #4]
    ldrb     w11, [x10, #5]
    eor      w11, w11, w6
    strb     w11, [x0, #5]
    ldrb     w11, [x10, #6]
    eor      w11, w11, w28
    strb     w11, [x0, #6]
    ldrb     w11, [x10, #7]
    mov      w1, #0x53
    eor      w11, w11, w1
    strb     w11, [x0, #7]
    ldrb     w11, [x10, #8]
    eor      w11, w11, #0x1e
    strb     w11, [x0, #8]
    ldrb     w11, [x10, #9]
    eor      w11, w11, w1
    strb     w11, [x0, #9]
    ldrb     w11, [x10, #0xa]
    eor      w11, w11, #0xfffffffd
    strb     w11, [x0, #0xa]
    ldrb     w11, [x10, #0xb]
    mov      w1, #0x4f
    eor      w11, w11, w1
    strb     w11, [x0, #0xb]
    ldrb     w10, [x10, #0xc]
    eor      w10, w10, w19
    strb     w10, [x0, #0xc]
    adrp     x10, #0x53f000
    add      x10, x10, #0x153
    ldrb     w11, [x10]
    eor      w11, w11, #0xbbbbbbbb
    adrp     x0, #0x53f000
    add      x0, x0, #0x15f
    strb     w11, [x0]
    ldrb     w11, [x10, #1]
    eor      w11, w11, w16
    strb     w11, [x0, #1]
    ldrb     w11, [x10, #2]
    eor      w11, w11, #4
    strb     w11, [x0, #2]
    ldrb     w11, [x10, #3]
    eor      w11, w11, w25
    strb     w11, [x0, #3]
    ldrb     w11, [x10, #4]
    eor      w11, w11, #8
    strb     w11, [x0, #4]
    ldrb     w11, [x10, #5]
    mov      w16, #0x74
    eor      w11, w11, w16
    strb     w11, [x0, #5]
    ldrb     w11, [x10, #6]
    mov      w6, #0xa5
    eor      w11, w11, w6
    strb     w11, [x0, #6]
    ldrb     w11, [x10, #7]
    eor      w11, w11, w30
    strb     w11, [x0, #7]
    ldrb     w11, [x10, #8]
    eor      w11, w11, #8
    strb     w11, [x0, #8]
    ldrb     w11, [x10, #9]
    mov      w16, #0x48
    eor      w11, w11, w16
    strb     w11, [x0, #9]
    ldrb     w11, [x10, #0xa]
    mov      w16, #0x58
    eor      w11, w11, w16
    strb     w11, [x0, #0xa]
    ldrb     w10, [x10, #0xb]
    mov      w11, #0xa1
    eor      w10, w10, w11
    strb     w10, [x0, #0xb]
    adrp     x10, #0x53f000
    add      x10, x10, #0x141
    ldrb     w11, [x10]
    mov      w16, #0x5a
    eor      w11, w11, w16
    adrp     x16, #0x53f000
    add      x16, x16, #0x14a
    strb     w11, [x16]
    ldrb     w11, [x10, #1]
    eor      w11, w11, #0xe
    strb     w11, [x16, #1]
    ldrb     w11, [x10, #2]
    eor      w11, w11, #0xffffffe3
    strb     w11, [x16, #2]
    ldrb     w11, [x10, #3]
    eor      w11, w11, #0x80
    strb     w11, [x16, #3]
    ldrb     w11, [x10, #4]
    mov      w0, #0xc5
    eor      w11, w11, w0
    strb     w11, [x16, #4]
    ldrb     w11, [x10, #5]
    mov      w0, #0x6e
    eor      w11, w11, w0
    strb     w11, [x16, #5]
    ldrb     w11, [x10, #6]
    mov      w0, #0xc8
    eor      w11, w11, w0
    strb     w11, [x16, #6]
    ldrb     w11, [x10, #7]
    mov      w28, #0xf4
    eor      w11, w11, w28
    strb     w11, [x16, #7]
    ldrb     w10, [x10, #8]
    mov      w25, #0xa3
    eor      w10, w10, w25
    strb     w10, [x16, #8]
    adrp     x30, #0x53f000
    add      x30, x30, #0x210
    ldrb     w10, [x30]
    eor      w10, w10, w27
    adrp     x11, #0x53f000
    add      x11, x11, #0x230
    strb     w10, [x11]
    ldrb     w10, [x30, #1]
    mov      w16, #0xa
    eor      w10, w10, w16
    strb     w10, [x11, #1]
    ldrb     w10, [x30, #2]
    mov      w16, #0xe6
    eor      w10, w10, w16
    strb     w10, [x11, #2]
    ldrb     w10, [x30, #3]
    mov      w19, #0x7d
    eor      w10, w10, w19
    strb     w10, [x11, #3]
    ldrb     w10, [x30, #4]
    mov      w16, #0x16
    eor      w10, w10, w16
    strb     w10, [x11, #4]
    ldrb     w16, [x30, #5]
    mov      w10, #0x54
    eor      w16, w16, w10
    strb     w16, [x11, #5]
    ldrb     w16, [x30, #6]
    mov      w27, #0xb7
    eor      w16, w16, w27
    strb     w16, [x11, #6]
    ldrb     w16, [x30, #7]
    eor      w16, w16, #0x44444444
    strb     w16, [x11, #7]
    ldrb     w16, [x30, #8]
    eor      w8, w16, w8
    strb     w8, [x11, #8]
    ldrb     w8, [x30, #9]
    mov      w16, #0xe9
    eor      w8, w8, w16
    strb     w8, [x11, #9]
    ldrb     w8, [x30, #0xa]
    mov      w16, #0xb5
    eor      w8, w8, w16
    strb     w8, [x11, #0xa]
    ldrb     w8, [x30, #0xb]
    eor      w8, w8, w27
    strb     w8, [x11, #0xb]
    ldrb     w8, [x30, #0xc]
    mov      w16, #0x4e
    eor      w8, w8, w16
    strb     w8, [x11, #0xc]
    ldrb     w8, [x30, #0xd]
    mov      w16, #0x42
    eor      w8, w8, w16
    strb     w8, [x11, #0xd]
    ldrb     w8, [x30, #0xe]
    eor      w8, w8, w15
    strb     w8, [x11, #0xe]
    ldrb     w8, [x30, #0xf]
    mov      w15, #0x26
    eor      w8, w8, w15
    strb     w8, [x11, #0xf]
    ldrb     w8, [x30, #0x10]
    mov      w15, #0x6b
    eor      w8, w8, w15
    strb     w8, [x11, #0x10]
    ldrb     w8, [x30, #0x11]
    eor      w8, w8, #0x60
    strb     w8, [x11, #0x11]
    ldrb     w8, [x30, #0x12]
    eor      w8, w8, w17
    strb     w8, [x11, #0x12]
    ldrb     w8, [x30, #0x13]
    eor      w8, w8, w9
    strb     w8, [x11, #0x13]
    ldrb     w8, [x30, #0x14]
    eor      w8, w8, #0x7f
    strb     w8, [x11, #0x14]
    adrp     x9, #0x53f000
    add      x9, x9, #0x1e6
    ldrb     w11, [x9]
    mov      w8, #0xab
    eor      w11, w11, w8
    adrp     x15, #0x53f000
    add      x15, x15, #0x1eb
    strb     w11, [x15]
    ldrb     w11, [x9, #1]
    mov      w16, #0xa0
    eor      w11, w11, w16
    strb     w11, [x15, #1]
    ldrb     w11, [x9, #2]
    eor      w11, w11, w27
    strb     w11, [x15, #2]
    ldrb     w11, [x9, #3]
    mov      w16, #0x5c
    eor      w11, w11, w16
    strb     w11, [x15, #3]
    ldrb     w9, [x9, #4]
    mov      w11, #0x59
    eor      w9, w9, w11
    strb     w9, [x15, #4]
    adrp     x9, #0x53f000
    add      x9, x9, #0xbf
    ldrb     w11, [x9]
    adrp     x15, #0x53f000
    add      x15, x15, #0xc7
    eor      w11, w11, w17
    strb     w11, [x15]
    ldrb     w11, [x9, #1]
    eor      w11, w11, w14
    strb     w11, [x15, #1]
    ldrb     w11, [x9, #2]
    mov      w14, #0xce
    eor      w11, w11, w14
    strb     w11, [x15, #2]
    ldrb     w11, [x9, #3]
    mov      w14, #0xf6
    eor      w11, w11, w14
    strb     w11, [x15, #3]
    ldrb     w11, [x9, #4]
    eor      w11, w11, w3
    strb     w11, [x15, #4]
    ldrb     w11, [x9, #5]
    mov      w14, #0x69
    eor      w11, w11, w14
    strb     w11, [x15, #5]
    ldrb     w11, [x9, #6]
    eor      w11, w11, #6
    strb     w11, [x15, #6]
    ldrb     w9, [x9, #7]
    eor      w9, w9, w13
    strb     w9, [x15, #7]
    adrp     x14, #0x53f000
    add      x14, x14, #0x60
    ldrb     w9, [x14]
    mov      w11, #0x28
    eor      w9, w9, w11
    adrp     x15, #0x53f000
    add      x15, x15, #0x80
    strb     w9, [x15]
    ldrb     w9, [x14, #1]
    mov      w11, #0x85
    eor      w9, w9, w11
    strb     w9, [x15, #1]
    ldrb     w9, [x14, #2]
    eor      w9, w9, w22
    strb     w9, [x15, #2]
    ldrb     w9, [x14, #3]
    eor      w9, w9, w28
    strb     w9, [x15, #3]
    ldrb     w9, [x14, #4]
    eor      w9, w9, w27
    strb     w9, [x15, #4]
    ldrb     w9, [x14, #5]
    eor      w9, w9, #0x60
    strb     w9, [x15, #5]
    ldrb     w9, [x14, #6]
    mvn      w9, w9
    strb     w9, [x15, #6]
    ldrb     w9, [x14, #7]
    eor      w9, w9, #0xffffffe3
    strb     w9, [x15, #7]
    ldrb     w9, [x14, #8]
    eor      w9, w9, w4
    strb     w9, [x15, #8]
    ldrb     w9, [x14, #9]
    eor      w9, w9, #0xffffffe1
    strb     w9, [x15, #9]
    ldrb     w9, [x14, #0xa]
    eor      w9, w9, w7
    strb     w9, [x15, #0xa]
    ldrb     w9, [x14, #0xb]
    eor      w9, w9, w7
    strb     w9, [x15, #0xb]
    ldrb     w9, [x14, #0xc]
    eor      w9, w9, w12
    strb     w9, [x15, #0xc]
    ldrb     w9, [x14, #0xd]
    mov      w11, #0x39
    eor      w9, w9, w11
    strb     w9, [x15, #0xd]
    ldrb     w9, [x14, #0xe]
    eor      w9, w9, w10
    strb     w9, [x15, #0xe]
    ldrb     w9, [x14, #0xf]
    mov      w10, #0x8b
    eor      w9, w9, w10
    strb     w9, [x15, #0xf]
    ldrb     w9, [x14, #0x10]
    mov      w10, #0xa6
    eor      w9, w9, w10
    strb     w9, [x15, #0x10]
    ldrb     w9, [x14, #0x11]
    mov      w10, #0x6f
    eor      w9, w9, w10
    strb     w9, [x15, #0x11]
    ldrb     w9, [x14, #0x12]
    eor      w9, w9, w23
    strb     w9, [x15, #0x12]
    ldrb     w9, [x14, #0x13]
    eor      w9, w9, #0xe
    strb     w9, [x15, #0x13]
    ldrb     w9, [x14, #0x14]
    eor      w9, w9, #0xffffffe1
    strb     w9, [x15, #0x14]
    ldrb     w9, [x14, #0x15]
    mov      w10, #0xd2
    eor      w9, w9, w10
    strb     w9, [x15, #0x15]
    ldrb     w9, [x14, #0x16]
    mov      w10, #0x37
    eor      w9, w9, w10
    strb     w9, [x15, #0x16]
    ldrb     w9, [x14, #0x17]
    eor      w9, w9, #0xffffffc1
    strb     w9, [x15, #0x17]
    ldrb     w9, [x14, #0x18]
    mov      w10, #0xd7
    eor      w9, w9, w10
    strb     w9, [x15, #0x18]
    ldrb     w9, [x14, #0x19]
    mov      w10, #0x34
    eor      w9, w9, w10
    strb     w9, [x15, #0x19]
    ldrb     w9, [x14, #0x1a]
    eor      w9, w9, w24
    adrp     x10, #0x53f000
    add      x10, x10, #0x131
    strb     w9, [x15, #0x1a]
    ldrb     w9, [x10]
    mov      w11, #0x1b
    eor      w9, w9, w11
    adrp     x11, #0x53f000
    add      x11, x11, #0x139
    strb     w9, [x11]
    ldrb     w9, [x10, #1]
    eor      w9, w9, w25
    strb     w9, [x11, #1]
    ldrb     w9, [x10, #2]
    eor      w8, w9, w8
    strb     w8, [x11, #2]
    ldrb     w8, [x10, #3]
    eor      w8, w8, w6
    strb     w8, [x11, #3]
    ldrb     w8, [x10, #4]
    mov      w9, #0x63
    eor      w8, w8, w9
    strb     w8, [x11, #4]
    ldrb     w8, [x10, #5]
    mov      w9, #0x7a
    eor      w8, w8, w9
    strb     w8, [x11, #5]
    ldrb     w8, [x10, #6]
    mov      w9, #0xb8
    eor      w8, w8, w9
    strb     w8, [x11, #6]
    ldrb     w8, [x10, #7]
    eor      w8, w8, w5
    adrp     x9, #0x53f000
    add      x9, x9, #0x20
    strb     w8, [x11, #7]
    ldrb     w8, [x9]
    eor      w8, w8, w19
    adrp     x10, #0x53f000
    add      x10, x10, #0x2f
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w11, #5
    eor      w8, w8, w11
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w11, #0x76
    eor      w8, w8, w11
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    eor      w8, w8, w7
    strb     w8, [x10, #3]
    ldrb     w8, [x9, #4]
    eor      w8, w8, w13
    strb     w8, [x10, #4]
    ldrb     w8, [x9, #5]
    eor      w8, w8, w3
    strb     w8, [x10, #5]
    ldrb     w8, [x9, #6]
    mov      w11, #0x56
    eor      w8, w8, w11
    strb     w8, [x10, #6]
    ldrb     w8, [x9, #7]
    eor      w8, w8, w26
    strb     w8, [x10, #7]
    ldrb     w8, [x9, #8]
    mov      w11, #0x46
    eor      w8, w8, w11
    strb     w8, [x10, #8]
    ldrb     w8, [x9, #9]
    eor      w8, w8, w21
    strb     w8, [x10, #9]
    ldrb     w8, [x9, #0xa]
    mov      w11, #0xa9
    eor      w8, w8, w11
    strb     w8, [x10, #0xa]
    ldrb     w8, [x9, #0xb]
    eor      w8, w8, #0xffffffef
    strb     w8, [x10, #0xb]
    ldrb     w8, [x9, #0xc]
    mov      w11, #0xb
    eor      w8, w8, w11
    strb     w8, [x10, #0xc]
    ldrb     w8, [x9, #0xd]
    mov      w11, #0xd4
    eor      w8, w8, w11
    strb     w8, [x10, #0xd]
    ldrb     w8, [x9, #0xe]
    mov      w9, #0x84
    eor      w8, w8, w9
    strb     w8, [x10, #0xe]
    mov      w8, #1
    stlr     w8, [x2]
    sub      x22, sp, #0x20
    mov      sp, x22
    sub      x26, sp, #0x40
    mov      sp, x26
    sub      x8, sp, #0x80
    stur     x8, [x29, #-0x80]
    mov      sp, x8
    sub      x8, sp, #0x30
    stur     x8, [x29, #-0x98]
    mov      sp, x8
    sub      x19, sp, #0x40
    mov      sp, x19
    sub      x8, sp, #0x80
    stur     x8, [x29, #-0x88]
    mov      sp, x8
    sub      x8, sp, #0x40
    stur     x8, [x29, #-0x70]
    mov      sp, x8
    sub      x8, sp, #0x80
    stur     x8, [x29, #-0xe0]
    mov      sp, x8
    sub      x8, sp, #0x40
    stur     x8, [x29, #-0xc8]
    mov      sp, x8
    sub      x8, sp, #0x80
    stur     x8, [x29, #-0x100]
    mov      sp, x8
    sub      x25, sp, #0x40
    mov      sp, x25
    sub      x8, sp, #0x80
    sub      x9, x29, #0x20
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    stur     x20, [x29, #-0xe8]
    bl       #0x461d14 // _objc_sync_enter
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x68]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x348]
    sub      x8, x29, #0x10
    stur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x328]
    adrp     x2, #0x53f000
    add      x2, x2, #0x630
    ldur     x0, [x29, #-0x90]
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x2e407c
    mov      w0, #9
    mov      w1, #1
    mov      w2, #1
    bl       #0x461798 // _NSSearchPathForDirectoriesInDomains
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x918]
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
    cbz      x0, #0x2e4074
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x550]
    adrp     x0, #0x53f000
    add      x0, x0, #0x6f0
    adrp     x2, #0x53f000
    add      x2, x2, #0x5b0
    stur     x1, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x820]
    mov      x0, x20
    mov      x1, x21
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x78]
    ldur     x8, [x29, #-0x78]
    str      x8, [x22]
    adrp     x0, #0x53f000
    add      x0, x0, #0x6f0
    adrp     x2, #0x53f000
    add      x2, x2, #0x570
    ldur     x1, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x20
    mov      x1, x21
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    str      x0, [x22, #8]
    adrp     x0, #0x53f000
    add      x0, x0, #0x530
    adrp     x2, #0x53f000
    add      x2, x2, #0x670
    ldur     x1, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x0, x20
    mov      x1, x21
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    str      x0, [x22, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    stur     x1, [x29, #-0xa8]
    mov      x2, x22
    mov      w3, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x68]
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x78]
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x108]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x800]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    movi     v0.16b, #0
    stp      q0, q0, [x26, #0x20]
    stp      q0, q0, [x26]
    ldur     x0, [x29, #-0x68]
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stur     x1, [x29, #-0x78]
    mov      x2, x26
    ldur     x3, [x29, #-0x80]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    stur     x20, [x29, #-0xb0]
    stur     x25, [x29, #-0xf8]
    cbz      x0, #0x2e3e5c
    ldr      x8, [x26, #0x10]
    ldr      x25, [x8]
    mov      w22, #1
    mov      x20, #0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x850]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x960]
    ldr      x8, [x26, #0x10]
    ldr      x8, [x8]
    cmp      x8, x25
    b.eq     #0x2e3dfc
    ldur     x0, [x29, #-0x68]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x26, #8]
    ldr      x27, [x8, x20, lsl #3]
    mov      x0, x28
    mov      x1, x23
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e3e30
    mov      x0, x28
    mov      x1, x21
    mov      x2, x27
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    and      w22, w0, w22
    add      x20, x20, #1
    cmp      x24, x20
    b.ne     #0x2e3de4
    ldur     x0, [x29, #-0x68]
    ldp      x3, x1, [x29, #-0x80]
    mov      x2, x26
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    cbnz     x0, #0x2e3dd0
    b        #0x2e3e60
    mov      w22, #1
    ldur     x0, [x29, #-0x68]
    bl       #0x461c9c // _objc_release
    adrp     x0, #0x53f000
    add      x0, x0, #0x4f0
    adrp     x2, #0x53f000
    add      x2, x2, #0x4b0
    ldur     x1, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldp      x1, x8, [x29, #-0xa0]
    str      x0, [x8]
    adrp     x0, #0x53f000
    add      x0, x0, #0x4f0
    adrp     x2, #0x53f000
    add      x2, x2, #0x430
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    ldp      x1, x8, [x29, #-0xa0]
    str      x0, [x8, #8]
    adrp     x0, #0x53f000
    add      x0, x0, #0x4f0
    adrp     x2, #0x53f000
    add      x2, x2, #0x370
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldp      x1, x8, [x29, #-0xa0]
    str      x0, [x8, #0x10]
    adrp     x0, #0x53f000
    add      x0, x0, #0x4f0
    adrp     x2, #0x53f000
    add      x2, x2, #0x470
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    ldp      x1, x8, [x29, #-0xa0]
    str      x0, [x8, #0x18]
    adrp     x0, #0x53f000
    add      x0, x0, #0x4f0
    adrp     x2, #0x53f000
    add      x2, x2, #0x5f0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldur     x2, [x29, #-0x98]
    str      x0, [x2, #0x20]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    ldur     x1, [x29, #-0xa8]
    mov      w3, #5
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    stp      q0, q0, [x19, #0x20]
    stp      q0, q0, [x19]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    ldur     x1, [x29, #-0x78]
    mov      x2, x19
    ldur     x3, [x29, #-0x88]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    ldur     x27, [x29, #-0x90]
    cbz      x0, #0x2e401c
    ldr      x8, [x19, #0x10]
    ldr      x20, [x8]
    adrp     x25, #0x4be000
    mov      x26, #0
    ldr      x24, [x25, #0xe08]
    ldr      x8, [x19, #0x10]
    ldr      x8, [x8]
    cmp      x8, x20
    b.eq     #0x2e3fdc
    mov      x0, x23
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x19, #8]
    ldr      x2, [x8, x26, lsl #3]
    mov      x0, x27
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    add      x26, x26, #1
    cmp      x21, x26
    b.ne     #0x2e3fc4
    mov      x0, x23
    ldur     x1, [x29, #-0x78]
    mov      x2, x19
    ldur     x3, [x29, #-0x88]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    cbnz     x0, #0x2e3fbc
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldur     x25, [x29, #-0xf8]
    ldur     x20, [x29, #-0xb0]
    tbz      w22, #0, #0x2e404c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x350]
    adrp     x3, #0x53f000
    add      x3, x3, #0x630
    ldur     x0, [x29, #-0x90]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xdc8]
    ldur     x0, [x29, #-0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x68]
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x90]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x580000
    ldrb     w8, [x8, #0x398]
    tbnz     w8, #0, #0x2e4b28
    mov      w0, #9
    mov      w1, #1
    mov      w2, #1
    bl       #0x461798 // _NSSearchPathForDirectoriesInDomains
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x918]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x20
    stur     x1, [x29, #-0x88]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2e4b20
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x108]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x800]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #8
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x4be000
    ldr      x19, [x8, #0x820]
    adrp     x2, #0x53f000
    add      x2, x2, #0x3f0
    sub      x8, x29, #0x28
    stur     x20, [x8, #-0x100]
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x2, #0x53f000
    add      x2, x2, #0x330
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x18
    stur     x0, [x8, #-0x100]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x21, #0x580000
    ldrb     w8, [x21, #0x399]
    tbnz     w8, #0, #0x2e41d4
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x850]
    sub      x8, x29, #8
    ldur     x0, [x8, #-0x100]
    mov      x1, x20
    sub      x8, x29, #0x18
    ldur     x2, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e41b0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x960]
    sub      x8, x29, #8
    ldur     x0, [x8, #-0x100]
    sub      x8, x29, #0x18
    ldur     x2, [x8, #-0x100]
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    sub      x8, x29, #8
    ldur     x0, [x8, #-0x100]
    mov      x1, x20
    sub      x8, x29, #0x18
    ldur     x2, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    eor      w8, w0, #1
    strb     w8, [x21, #0x399]
    tbnz     w0, #0, #0x2e4b00
    adrp     x2, #0x53f000
    add      x2, x2, #0x6f0
    sub      x8, x29, #0x28
    ldur     x0, [x8, #-0x100]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x2, #0x53f000
    add      x2, x2, #0x3b0
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x2, #0x53f000
    add      x2, x2, #0x6b0
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x130]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xa18]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldur     x1, [x29, #-0x88]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2e4388
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2e8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xab8]
    mov      x2, x21
    mov      x3, #0
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x80]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    stur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    ldur     x0, [x29, #-0x80]
    stur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x2e4ae8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x360]
    ldur     x0, [x29, #-0x80]
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xa8]
    sub      x8, x29, #0x40
    stur     x21, [x8, #-0x100]
    sub      x8, x29, #0x38
    stur     x19, [x8, #-0x100]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4a3000
    add      x8, x8, #0xe88
    ldr      x2, [x8]
    adrp     x8, #0x4be000
    ldr      x19, [x8, #0x330]
    stur     x0, [x29, #-0xa0]
    mov      x1, x19
    stur     x2, [x29, #-0xd0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x21
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e4398
    ldur     x0, [x29, #-0xa0]
    mov      x1, x19
    ldur     x2, [x29, #-0xd0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x30
    stur     x0, [x8, #-0x100]
    b        #0x2e43a8
    mov      w8, #1
    adrp     x9, #0x580000
    strb     w8, [x9, #0x398]
    b        #0x2e4af0
    adrp     x8, #0x4a6000
    add      x8, x8, #0xd8
    sub      x9, x29, #0x30
    stur     x8, [x9, #-0x100]
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a3000
    add      x8, x8, #0xea8
    ldr      x2, [x8]
    ldur     x0, [x29, #-0xa0]
    mov      x1, x19
    stur     x2, [x29, #-0xd8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x21
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e441c
    ldur     x0, [x29, #-0xa0]
    mov      x1, x19
    ldur     x2, [x29, #-0xd8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    b        #0x2e4424
    adrp     x19, #0x4a6000
    add      x19, x19, #0xd8
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x30
    ldur     x0, [x8, #-0x100]
    bl       #0x240504
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb0]
    sub      x8, x29, #0x48
    stur     x19, [x8, #-0x100]
    mov      x0, x19
    bl       #0x240504
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb8]
    movi     v0.16b, #0
    ldur     x19, [x29, #-0x70]
    stp      q0, q0, [x19, #0x20]
    stp      q0, q0, [x19]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x788]
    ldur     x0, [x29, #-0x80]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stur     x1, [x29, #-0xf0]
    mov      x2, x19
    ldur     x3, [x29, #-0xe0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    cbz      x0, #0x2e47f8
    stur     x25, [x29, #-0xf8]
    stur     xzr, [x29, #-0xc0]
    ldur     x8, [x29, #-0x70]
    ldr      x8, [x8, #0x10]
    ldr      x27, [x8]
    mov      x26, #0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x528]
    adrp     x8, #0x4be000
    ldr      x19, [x8, #0x358]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x9e8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xe08]
    stp      x8, x9, [x29, #-0x98]
    ldur     x8, [x29, #-0x70]
    ldr      x8, [x8, #0x10]
    ldr      x8, [x8]
    cmp      x8, x27
    b.eq     #0x2e4508
    mov      x0, x20
    bl       #0x461c24 // _objc_enumerationMutation
    ldur     x8, [x29, #-0x70]
    ldr      x8, [x8, #8]
    ldr      x21, [x8, x26, lsl #3]
    ldur     x0, [x29, #-0x80]
    mov      x1, x25
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x24
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e4574
    ldur     x0, [x29, #-0x80]
    mov      x1, x25
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    b        #0x2e4578
    mov      x28, #0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    mov      x1, x25
    adrp     x2, #0x53f000
    add      x2, x2, #0x2f0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x1, x19
    adrp     x2, #0x53f000
    add      x2, x2, #0x2b0
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    tbz      w24, #0, #0x2e46d8
    mov      x0, x28
    mov      x1, x25
    adrp     x2, #0x53f000
    add      x2, x2, #0x270
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x22
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    adrp     x24, #0x4a6000
    add      x24, x24, #0xd8
    cbz      w0, #0x2e462c
    mov      x0, x28
    mov      x1, x25
    adrp     x2, #0x53f000
    add      x2, x2, #0x270
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    ldur     x1, [x29, #-0x88]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2e46d0
    mov      x0, x24
    bl       #0x2423dc
    cbz      w0, #0x2e46d0
    mov      x0, x24
    mov      x1, x19
    ldur     x2, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e4684
    ldur     x0, [x29, #-0xa0]
    ldur     x1, [x29, #-0x90]
    adrp     x2, #0x4a6000
    add      x2, x2, #0xd8
    ldur     x3, [x29, #-0xd0]
    bl       #0x461c6c // _objc_msgSend
    mov      w8, #1
    stur     w8, [x29, #-0xbc]
    mov      x0, x24
    mov      x1, x19
    ldur     x2, [x29, #-0xb8]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e46b8
    ldur     x0, [x29, #-0xa0]
    ldur     x1, [x29, #-0x90]
    adrp     x2, #0x4a6000
    add      x2, x2, #0xd8
    ldur     x3, [x29, #-0xd8]
    bl       #0x461c6c // _objc_msgSend
    mov      w8, #1
    stur     w8, [x29, #-0xbc]
    ldur     x0, [x29, #-0xa8]
    ldur     x1, [x29, #-0x98]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      w8, #1
    stur     w8, [x29, #-0xc0]
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    add      x26, x26, #1
    cmp      x23, x26
    b.ne     #0x2e44ec
    mov      x0, x20
    ldur     x1, [x29, #-0xf0]
    ldur     x2, [x29, #-0x70]
    ldur     x3, [x29, #-0xe0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    cbnz     x0, #0x2e44c4
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x22, [x29, #-0xf8]
    adrp     x23, #0x4c4000
    ldur     w8, [x29, #-0xbc]
    tbz      w8, #0, #0x2e4770
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xaf0]
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x68]
    sub      x8, x29, #0x10
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xdc8]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    tbz      w21, #0, #0x2e4aa0
    ldur     w8, [x29, #-0xc0]
    tbz      w8, #0, #0x2e4800
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    ldur     x0, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    sub      x8, x29, #0x38
    ldur     x19, [x8, #-0x100]
    cbz      x0, #0x2e4928
    ldr      x0, [x23, #0x2e8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xa30]
    ldur     x2, [x29, #-0xa8]
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0x88]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2e4b74
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc68]
    mov      x0, x19
    sub      x8, x29, #0x38
    ldur     x2, [x8, #-0x100]
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cbnz     w21, #0x2e4960
    b        #0x2e4aa0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    ldur     x21, [x29, #-0xc8]
    stp      q0, q0, [x21, #0x20]
    stp      q0, q0, [x21]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4e0]
    ldur     x0, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0xf0]
    mov      x2, x21
    ldur     x3, [x29, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    cbz      x0, #0x2e4a84
    ldr      x8, [x21, #0x10]
    ldr      x26, [x8]
    adrp     x20, #0x53f000
    add      x20, x20, #0x2f0
    adrp     x22, #0x53f000
    add      x22, x22, #0x2b0
    mov      x21, #0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x528]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x358]
    ldur     x8, [x29, #-0xc8]
    ldr      x8, [x8, #0x10]
    ldr      x8, [x8]
    cmp      x8, x26
    b.eq     #0x2e4890
    mov      x0, x19
    bl       #0x461c24 // _objc_enumerationMutation
    ldur     x8, [x29, #-0xc8]
    ldr      x8, [x8, #8]
    ldr      x27, [x8, x21, lsl #3]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x27
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e48f8
    mov      x0, x27
    mov      x1, x24
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x1, x25
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    tbnz     w28, #0, #0x2e4a8c
    add      x21, x21, #1
    cmp      x23, x21
    b.ne     #0x2e4874
    mov      x0, x19
    ldur     x1, [x29, #-0xf0]
    ldur     x2, [x29, #-0xc8]
    ldur     x3, [x29, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    cbnz     x0, #0x2e4860
    b        #0x2e4a84
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x960]
    sub      x8, x29, #8
    ldur     x0, [x8, #-0x100]
    mov      x2, x19
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x850]
    sub      x8, x29, #8
    ldur     x0, [x8, #-0x100]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x2e4aa0
    movi     v0.16b, #0
    stp      q0, q0, [x22, #0x20]
    stp      q0, q0, [x22]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4e0]
    ldur     x0, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0xf0]
    mov      x2, x22
    sub      x8, x29, #0x20
    ldur     x3, [x8, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    cbz      x0, #0x2e4a84
    ldr      x8, [x22, #0x10]
    ldr      x26, [x8]
    adrp     x20, #0x53f000
    add      x20, x20, #0x2f0
    adrp     x22, #0x53f000
    add      x22, x22, #0x2b0
    mov      x21, #0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x528]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x358]
    ldur     x8, [x29, #-0xf8]
    ldr      x8, [x8, #0x10]
    ldr      x8, [x8]
    cmp      x8, x26
    b.eq     #0x2e49f0
    mov      x0, x19
    bl       #0x461c24 // _objc_enumerationMutation
    ldur     x8, [x29, #-0xf8]
    ldr      x8, [x8, #8]
    ldr      x27, [x8, x21, lsl #3]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x27
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e4a58
    mov      x0, x27
    mov      x1, x24
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x1, x25
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    tbnz     w28, #0, #0x2e4a8c
    add      x21, x21, #1
    cmp      x23, x21
    b.ne     #0x2e49d4
    mov      x0, x19
    ldp      x2, x1, [x29, #-0xf8]
    sub      x8, x29, #0x20
    ldur     x3, [x8, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    cbnz     x0, #0x2e49c0
    mov      w20, #1
    b        #0x2e4a90
    mov      w20, #0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x580000
    strb     w20, [x8, #0x398]
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x48
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x30
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa8]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x38
    ldur     x19, [x8, #-0x100]
    sub      x8, x29, #0x40
    ldur     x21, [x8, #-0x100]
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x18
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x28
    ldur     x20, [x8, #-0x100]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x19, [x29, #-0xe8]
    mov      x0, x19
    bl       #0x461d20 // _objc_sync_exit
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2e4b80
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    b        #0x2e4aa0
    bl       #0x4618b8 // ___stack_chk_fail
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    b        #0x2e4bfc
    mov      x19, x0
    ldur     x0, [x29, #-0xe8]
    bl       #0x461d20 // _objc_sync_exit
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// +[WCLGGlassPackage loadIndex] IMP=0x2E4C10 bounds=0x2E4C10-0x2E4D54
loc_2E4C10:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4e8]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x20, [x8, #0x130]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4f0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xa18]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cbz      x19, #0x2e4cec
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2e8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xab8]
    mov      x2, x19
    mov      x3, #0
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x2e4d10
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x360]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    b        #0x2e4d2c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    b        #0x2e4d38
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461be8 // _objc_autoreleaseReturnValue

// +[WCLGGlassPackage saveIndex:] IMP=0x2E4D54 bounds=0x2E4D54-0x2E4DD8
loc_2E4D54:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2e8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xa30]
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4f0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc68]
    mov      x0, x20
    mov      x2, x19
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c9c // _objc_release

// +[WCLGGlassPackage decryptContainer:themeId:wxid:signKey:glassMaster:error:] IMP=0x2E4DD8 bounds=0x2E4DD8-0x2E59AC
loc_2E4DD8:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x50
    mov      x22, x7
    mov      x21, x6
    mov      x24, x5
    mov      x20, x4
    mov      x27, x3
    mov      x19, x2
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x580000
    add      x8, x8, #0x428
    ldar     w9, [x8]
    cbnz     w9, #0x2e544c
    adrp     x10, #0x53f000
    add      x10, x10, #0x82e
    ldrb     w9, [x10]
    mov      w11, #0xb2
    eor      w9, w9, w11
    adrp     x11, #0x53f000
    add      x11, x11, #0x833
    strb     w9, [x11]
    ldrb     w12, [x10, #1]
    mov      w9, #0xa6
    eor      w12, w12, w9
    strb     w12, [x11, #1]
    ldrb     w12, [x10, #2]
    mov      w13, #5
    eor      w12, w12, w13
    strb     w12, [x11, #2]
    ldrb     w12, [x10, #3]
    eor      w12, w12, #0x7e
    strb     w12, [x11, #3]
    ldrb     w10, [x10, #4]
    mov      w12, #0x91
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    adrp     x10, #0x53f000
    add      x10, x10, #0x7f0
    ldrh     w11, [x10]
    mov      w12, #0xd2fc
    eor      w11, w11, w12
    adrp     x12, #0x53f000
    add      x12, x12, #0x810
    strh     w11, [x12]
    ldrh     w11, [x10, #2]
    mov      w13, #0x63e2
    eor      w11, w11, w13
    strh     w11, [x12, #2]
    ldrh     w11, [x10, #4]
    mov      w13, #0xd549
    eor      w11, w11, w13
    strh     w11, [x12, #4]
    ldrh     w11, [x10, #6]
    mov      w13, #0xa13b
    eor      w11, w11, w13
    strh     w11, [x12, #6]
    ldrh     w11, [x10, #8]
    mov      w13, #0x9107
    eor      w11, w11, w13
    strh     w11, [x12, #8]
    ldrh     w11, [x10, #0xa]
    mov      w13, #0x7495
    eor      w11, w11, w13
    strh     w11, [x12, #0xa]
    ldrh     w11, [x10, #0xc]
    mov      w13, #0x8f1e
    eor      w11, w11, w13
    strh     w11, [x12, #0xc]
    ldrh     w11, [x10, #0xe]
    mov      w13, #0x783f
    eor      w11, w11, w13
    strh     w11, [x12, #0xe]
    ldrh     w11, [x10, #0x10]
    mov      w13, #0x9a0d
    eor      w11, w11, w13
    strh     w11, [x12, #0x10]
    ldrh     w11, [x10, #0x12]
    mov      w13, #0xfbc8
    eor      w11, w11, w13
    strh     w11, [x12, #0x12]
    ldrh     w11, [x10, #0x14]
    mov      w13, #0x4393
    eor      w11, w11, w13
    strh     w11, [x12, #0x14]
    ldrh     w11, [x10, #0x16]
    mov      w13, #0x102d
    eor      w11, w11, w13
    strh     w11, [x12, #0x16]
    ldrh     w11, [x10, #0x18]
    mov      w13, #0x9590
    eor      w11, w11, w13
    strh     w11, [x12, #0x18]
    ldrh     w11, [x10, #0x1a]
    mov      w13, #0x52be
    eor      w11, w11, w13
    strh     w11, [x12, #0x1a]
    ldrh     w10, [x10, #0x1c]
    mov      w11, #0x1ad
    eor      w10, w10, w11
    strh     w10, [x12, #0x1c]
    adrp     x10, #0x53f000
    add      x10, x10, #0x7c8
    ldrh     w11, [x10]
    mov      w12, #0x1d0
    eor      w11, w11, w12
    adrp     x12, #0x53f000
    add      x12, x12, #0x7d8
    strh     w11, [x12]
    ldrh     w11, [x10, #2]
    mov      w13, #0x265e
    eor      w11, w11, w13
    strh     w11, [x12, #2]
    ldrh     w11, [x10, #4]
    mov      w13, #0x6942
    eor      w11, w11, w13
    strh     w11, [x12, #4]
    ldrh     w11, [x10, #6]
    mov      w13, #0xe695
    eor      w11, w11, w13
    strh     w11, [x12, #6]
    ldrh     w11, [x10, #8]
    mov      w13, #0x8097
    eor      w11, w11, w13
    strh     w11, [x12, #8]
    ldrh     w11, [x10, #0xa]
    mov      w13, #0xae00
    eor      w11, w11, w13
    strh     w11, [x12, #0xa]
    ldrh     w11, [x10, #0xc]
    mov      w13, #0x936c
    eor      w11, w11, w13
    strh     w11, [x12, #0xc]
    ldrh     w10, [x10, #0xe]
    mov      w11, #0x4f08
    eor      w10, w10, w11
    strh     w10, [x12, #0xe]
    adrp     x10, #0x53f000
    add      x10, x10, #0x7b0
    ldrh     w11, [x10]
    mov      w12, #0xc135
    eor      w11, w11, w12
    adrp     x12, #0x53f000
    add      x12, x12, #0x7bc
    strh     w11, [x12]
    ldrh     w11, [x10, #2]
    mov      w13, #0xb30d
    eor      w11, w11, w13
    strh     w11, [x12, #2]
    ldrh     w11, [x10, #4]
    mov      w13, #0xcc54
    eor      w11, w11, w13
    strh     w11, [x12, #4]
    ldrh     w11, [x10, #6]
    mov      w13, #0x5c21
    eor      w11, w11, w13
    strh     w11, [x12, #6]
    ldrh     w11, [x10, #8]
    mov      w13, #0x39ad
    eor      w11, w11, w13
    strh     w11, [x12, #8]
    ldrh     w10, [x10, #0xa]
    mov      w11, #0x987a
    eor      w10, w10, w11
    strh     w10, [x12, #0xa]
    adrp     x10, #0x53f000
    add      x10, x10, #0x790
    ldrh     w11, [x10]
    mov      w12, #0x3bd7
    adrp     x13, #0x53f000
    add      x13, x13, #0x7a0
    eor      w11, w11, w12
    strh     w11, [x13]
    ldrh     w11, [x10, #2]
    mov      w12, #0x720
    eor      w11, w11, w12
    strh     w11, [x13, #2]
    ldrh     w11, [x10, #4]
    mov      w12, #0x3049
    eor      w11, w11, w12
    strh     w11, [x13, #4]
    ldrh     w11, [x10, #6]
    mov      w12, #0xa6cf
    eor      w11, w11, w12
    strh     w11, [x13, #6]
    ldrh     w11, [x10, #8]
    mov      w12, #0xd20a
    eor      w11, w11, w12
    strh     w11, [x13, #8]
    ldrh     w11, [x10, #0xa]
    mov      w12, #0xbee9
    eor      w11, w11, w12
    strh     w11, [x13, #0xa]
    ldrh     w11, [x10, #0xc]
    mov      w12, #0x5346
    eor      w11, w11, w12
    strh     w11, [x13, #0xc]
    ldrh     w10, [x10, #0xe]
    mov      w11, #0xf48
    eor      w10, w10, w11
    strh     w10, [x13, #0xe]
    adrp     x10, #0x53f000
    add      x10, x10, #0x84c
    ldrh     w11, [x10]
    mov      w12, #0xb309
    adrp     x13, #0x53f000
    add      x13, x13, #0x856
    eor      w11, w11, w12
    strh     w11, [x13]
    ldrh     w11, [x10, #2]
    mov      w12, #0x64d1
    eor      w11, w11, w12
    strh     w11, [x13, #2]
    ldrh     w11, [x10, #4]
    mov      w12, #0x5c63
    eor      w11, w11, w12
    strh     w11, [x13, #4]
    ldrh     w11, [x10, #6]
    mov      w12, #0xd44
    eor      w11, w11, w12
    strh     w11, [x13, #6]
    ldrh     w10, [x10, #8]
    mov      w11, #0x7be3
    eor      w10, w10, w11
    strh     w10, [x13, #8]
    adrp     x10, #0x53f000
    add      x10, x10, #0x78a
    ldrb     w11, [x10]
    mov      w12, #0x32
    adrp     x13, #0x53f000
    add      x13, x13, #0x78d
    eor      w11, w11, w12
    strb     w11, [x13]
    ldrb     w11, [x10, #1]
    eor      w11, w11, #0x40
    strb     w11, [x13, #1]
    ldrb     w10, [x10, #2]
    eor      w10, w10, #0xffffffbf
    strb     w10, [x13, #2]
    adrp     x10, #0x53f000
    add      x10, x10, #0x838
    ldrb     w11, [x10]
    eor      w11, w11, #0xffffffc1
    adrp     x13, #0x53f000
    add      x13, x13, #0x842
    strb     w11, [x13]
    ldrb     w11, [x10, #1]
    mov      w14, #0xd2
    eor      w11, w11, w14
    strb     w11, [x13, #1]
    ldrb     w11, [x10, #2]
    mov      w14, #0x16
    eor      w11, w11, w14
    strb     w11, [x13, #2]
    ldrb     w11, [x10, #3]
    mov      w14, #0xa5
    eor      w11, w11, w14
    strb     w11, [x13, #3]
    ldrb     w11, [x10, #4]
    eor      w9, w11, w9
    strb     w9, [x13, #4]
    ldrb     w9, [x10, #5]
    eor      w9, w9, w12
    strb     w9, [x13, #5]
    ldrb     w9, [x10, #6]
    mov      w11, #0x7a
    eor      w9, w9, w11
    strb     w9, [x13, #6]
    ldrb     w9, [x10, #7]
    mov      w11, #0x58
    eor      w9, w9, w11
    strb     w9, [x13, #7]
    ldrb     w9, [x10, #8]
    mov      w11, #0xed
    eor      w9, w9, w11
    strb     w9, [x13, #8]
    ldrb     w9, [x10, #9]
    eor      w9, w9, #0xffffff8f
    strb     w9, [x13, #9]
    adrp     x9, #0x53f000
    add      x9, x9, #0x782
    ldrb     w10, [x9]
    mov      w11, #0x34
    adrp     x12, #0x53f000
    add      x12, x12, #0x786
    eor      w10, w10, w11
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    mov      w11, #0x49
    eor      w10, w10, w11
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xf8
    strb     w10, [x12, #2]
    ldrb     w9, [x9, #3]
    mov      w10, #0x5c
    eor      w9, w9, w10
    strb     w9, [x12, #3]
    adrp     x9, #0x53f000
    add      x9, x9, #0x762
    ldrh     w10, [x9]
    mov      w11, #0x22b4
    eor      w10, w10, w11
    adrp     x11, #0x53f000
    add      x11, x11, #0x772
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x3963
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x56ba
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x584f
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x9604
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0xafb4
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w13, #0x6c4a
    eor      w10, w10, w13
    strh     w10, [x11, #0xc]
    ldrh     w9, [x9, #0xe]
    mov      w10, #0xcbe6
    eor      w9, w9, w10
    strh     w9, [x11, #0xe]
    adrp     x9, #0x53f000
    add      x9, x9, #0x710
    ldrh     w10, [x9]
    mov      w11, #0xa506
    eor      w11, w10, w11
    adrp     x10, #0x53f000
    add      x10, x10, #0x740
    strh     w11, [x10]
    ldrh     w11, [x9, #2]
    mov      w13, #0xd27e
    eor      w11, w11, w13
    strh     w11, [x10, #2]
    ldrh     w11, [x9, #4]
    mov      w13, #0xa2dd
    eor      w11, w11, w13
    strh     w11, [x10, #4]
    ldrh     w11, [x9, #6]
    mov      w13, #0x4a8f
    eor      w11, w11, w13
    strh     w11, [x10, #6]
    ldrh     w11, [x9, #8]
    mov      w13, #0xb190
    eor      w11, w11, w13
    strh     w11, [x10, #8]
    ldrh     w11, [x9, #0xa]
    mov      w13, #0x914f
    eor      w11, w11, w13
    strh     w11, [x10, #0xa]
    ldrh     w11, [x9, #0xc]
    mov      w13, #0x9d3e
    eor      w11, w11, w13
    strh     w11, [x10, #0xc]
    ldrh     w11, [x9, #0xe]
    eor      w11, w11, w12
    strh     w11, [x10, #0xe]
    ldrh     w11, [x9, #0x10]
    mov      w12, #0xc34c
    eor      w11, w11, w12
    strh     w11, [x10, #0x10]
    ldrh     w11, [x9, #0x12]
    mov      w12, #0x3590
    eor      w11, w11, w12
    strh     w11, [x10, #0x12]
    ldrh     w11, [x9, #0x14]
    mov      w12, #0xce8
    eor      w11, w11, w12
    strh     w11, [x10, #0x14]
    ldrh     w11, [x9, #0x16]
    mov      w12, #0xd760
    eor      w11, w11, w12
    strh     w11, [x10, #0x16]
    ldrh     w11, [x9, #0x18]
    mov      w12, #0x8c76
    eor      w11, w11, w12
    strh     w11, [x10, #0x18]
    ldrh     w11, [x9, #0x1a]
    mov      w12, #0xa031
    eor      w11, w11, w12
    strh     w11, [x10, #0x1a]
    ldrh     w11, [x9, #0x1c]
    mov      w12, #0x171b
    eor      w11, w11, w12
    strh     w11, [x10, #0x1c]
    ldrh     w11, [x9, #0x1e]
    mov      w12, #0x5153
    eor      w11, w11, w12
    strh     w11, [x10, #0x1e]
    ldrh     w9, [x9, #0x20]
    mov      w11, #0x85ed
    eor      w9, w9, w11
    strh     w9, [x10, #0x20]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x25, sp, #0x20
    mov      sp, x25
    sub      x23, sp, #0x70
    mov      sp, x23
    sub      x26, sp, #0x10
    mov      sp, x26
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x28, [x8, #0x338]
    mov      x0, x19
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #5
    b.hi     #0x2e54b4
    cbz      x22, #0x2e5544
    mov      x23, #0
    adrp     x8, #0x53f000
    add      x8, x8, #0xac0
    b        #0x2e54f8
    stur     x24, [x29, #-0x60]
    mov      x0, x19
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4bf000
    ldr      x24, [x8, #0xa50]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    ldr      w8, [x0]
    adrp     x9, #0x53f000
    add      x9, x9, #0x833
    ldr      w9, [x9]
    cmp      w8, w9
    b.eq     #0x2e5500
    cbz      x22, #0x2e5544
    mov      x23, #0
    adrp     x8, #0x53f000
    add      x8, x8, #0x9c0
    str      x8, [x22]
    b        #0x2e5954
    stur     x27, [x29, #-0x78]
    stur     x22, [x29, #-0x68]
    ldrh     w8, [x0, #4]
    rev16    w22, w8
    add      x27, x22, #6
    mov      x0, x19
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    cmp      x27, x0
    b.ls     #0x2e554c
    ldur     x9, [x29, #-0x68]
    cbz      x9, #0x2e5544
    mov      x23, #0
    adrp     x8, #0x53f000
    add      x8, x8, #0x940
    str      x8, [x9]
    b        #0x2e5954
    mov      x23, #0
    b        #0x2e5954
    stur     x21, [x29, #-0x88]
    stur     x20, [x29, #-0x70]
    adrp     x8, #0x4c1000
    ldr      x20, [x8, #0x4f8]
    mov      x0, x19
    mov      x1, x20
    mov      w2, #6
    mov      x3, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x19
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    sub      x8, x0, x22
    sub      x3, x8, #6
    mov      x0, x19
    mov      x1, x20
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2e8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xab8]
    stur     x21, [x29, #-0x80]
    mov      x2, x21
    mov      x3, #0
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ccmp     x27, #0, #4, ne
    b.ne     #0x2e5634
    ldur     x9, [x29, #-0x68]
    ldur     x21, [x29, #-0x88]
    mov      x23, #0
    cbz      x9, #0x2e562c
    adrp     x8, #0x53f000
    add      x8, x8, #0x900
    str      x8, [x9]
    ldur     x20, [x29, #-0x70]
    b        #0x2e593c
    stur     x22, [x29, #-0x98]
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x528]
    mov      x0, x27
    bl       #0x461ca8 // _objc_retain
    adrp     x2, #0x53f000
    add      x2, x2, #0x980
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x2e59ac
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x53f000
    add      x2, x2, #0xa80
    mov      x0, x27
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x2e59ac
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    stur     x21, [x29, #-0x90]
    mov      x0, x21
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0x10
    ldur     x21, [x29, #-0x88]
    stur     x22, [x29, #-0xa0]
    b.ne     #0x2e58ac
    mov      x0, x22
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2e58ac
    ldur     x0, [x29, #-0x70]
    ldur     x8, [x29, #-0x60]
    cbz      x8, #0x2e5800
    movi     v0.16b, #0
    stp      q0, q0, [x25]
    mov      x0, x23
    bl       #0x461498 // _CC_SHA256_Init
    adrp     x1, #0x53f000
    add      x1, x1, #0x833
    mov      x0, x23
    mov      w2, #4
    bl       #0x4614a4 // _CC_SHA256_Update
    ldur     x22, [x29, #-0x90]
    mov      x0, x22
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x22
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x23
    mov      x1, x20
    bl       #0x4614a4 // _CC_SHA256_Update
    ldur     x22, [x29, #-0x98]
    mov      x0, x22
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x22
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x23
    mov      x1, x20
    bl       #0x4614a4 // _CC_SHA256_Update
    mov      x0, x25
    mov      x1, x23
    bl       #0x46148c // _CC_SHA256_Final
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x130]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xa70]
    mov      x2, x25
    mov      w3, #0x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    str      xzr, [x26]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x6b8]
    ldr      x1, [x8]
    ldur     x0, [x29, #-0x60]
    mov      x2, x23
    ldur     x3, [x29, #-0xa0]
    mov      x4, x26
    bl       #0x4617ec // _SecKeyVerifySignature
    mov      x22, x0
    ldr      x0, [x26]
    cbz      x0, #0x2e57f0
    bl       #0x461510 // _CFRelease
    cbz      w22, #0x2e58e4
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x70]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xa38]
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    ldur     x8, [x29, #-0x78]
    str      x8, [sp, #-0x10]!
    adrp     x2, #0x53f000
    add      x2, x2, #0x8c0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    add      sp, sp, #0x10
    mov      x20, x0
    mov      x0, x21
    mov      x1, x24
    mov      x2, x20
    bl       #0x2e5c04
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldp      x22, x2, [x29, #-0x98]
    mov      x0, x22
    mov      x1, x25
    bl       #0x2e5ce8
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2e58c8
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    mov      x23, x26
    b        #0x2e5910
    ldp      x20, x9, [x29, #-0x70]
    cbz      x9, #0x2e5900
    mov      x23, #0
    adrp     x8, #0x53f000
    add      x8, x8, #0xa40
    str      x8, [x9]
    b        #0x2e5904
    ldur     x9, [x29, #-0x68]
    cbz      x9, #0x2e590c
    mov      x23, #0
    adrp     x8, #0x53f000
    add      x8, x8, #0x880
    str      x8, [x9]
    b        #0x2e5910
    ldp      x20, x9, [x29, #-0x70]
    cbz      x9, #0x2e58f8
    adrp     x8, #0x53f000
    add      x8, x8, #0xa00
    str      x8, [x9]
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x23, #0
    ldur     x22, [x29, #-0x98]
    b        #0x2e592c
    mov      x23, #0
    ldur     x20, [x29, #-0x70]
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x90]
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2e59a8
    mov      x0, x23
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    b        #0x461be8 // _objc_autoreleaseReturnValue
    bl       #0x4618b8 // ___stack_chk_fail

// +[WCLGGlassPackage importGlassData:wxid:signKey:glassMaster:iconURL:error:] IMP=0x2E5ECC bounds=0x2E5ECC-0x2E7228
loc_2E5ECC:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x90
    mov      x24, x7
    mov      x22, x6
    mov      x21, x5
    stp      x4, x0, [x29, #-0x68]
    mov      x20, x3
    mov      x19, x2
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x580000
    add      x8, x8, #0x438
    ldar     w9, [x8]
    cbnz     w9, #0x2e696c
    adrp     x9, #0x53f000
    add      x9, x9, #0xdec
    ldrb     w10, [x9]
    eor      w10, w10, #0xbbbbbbbb
    adrp     x11, #0x53f000
    add      x11, x11, #0xdf1
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x7b
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xeeeeeeee
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x26
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    eor      w9, w9, #0xffffffc1
    adrp     x10, #0x53f000
    add      x10, x10, #0xdd4
    strb     w9, [x11, #4]
    ldrh     w9, [x10]
    mov      w11, #0x775a
    eor      w9, w9, w11
    adrp     x11, #0x53f000
    add      x11, x11, #0xde0
    strh     w9, [x11]
    ldrh     w9, [x10, #2]
    mov      w12, #0xeccf
    eor      w9, w9, w12
    strh     w9, [x11, #2]
    ldrh     w9, [x10, #4]
    mov      w12, #0xbb63
    eor      w9, w9, w12
    strh     w9, [x11, #4]
    ldrh     w9, [x10, #6]
    mov      w12, #0xd0b9
    eor      w9, w9, w12
    strh     w9, [x11, #6]
    ldrh     w9, [x10, #8]
    mov      w12, #0xfd03
    eor      w9, w9, w12
    strh     w9, [x11, #8]
    ldrh     w9, [x10, #0xa]
    mov      w10, #0xa36e
    eor      w9, w9, w10
    strh     w9, [x11, #0xa]
    adrp     x11, #0x53f000
    add      x11, x11, #0xdc2
    ldrb     w10, [x11]
    mov      w9, #0x8c
    eor      w10, w10, w9
    adrp     x12, #0x53f000
    add      x12, x12, #0xdcb
    strb     w10, [x12]
    ldrb     w10, [x11, #1]
    eor      w10, w10, #0x1f
    strb     w10, [x12, #1]
    ldrb     w10, [x11, #2]
    mov      w13, #0xa6
    eor      w10, w10, w13
    strb     w10, [x12, #2]
    ldrb     w10, [x11, #3]
    mov      w13, #0xa5
    eor      w10, w10, w13
    strb     w10, [x12, #3]
    ldrb     w10, [x11, #4]
    eor      w10, w10, #0xffffffbf
    strb     w10, [x12, #4]
    ldrb     w10, [x11, #5]
    mov      w13, #0xc8
    eor      w10, w10, w13
    strb     w10, [x12, #5]
    ldrb     w13, [x11, #6]
    mov      w10, #0x84
    eor      w13, w13, w10
    strb     w13, [x12, #6]
    ldrb     w13, [x11, #7]
    mov      w14, #0x34
    eor      w13, w13, w14
    strb     w13, [x12, #7]
    ldrb     w11, [x11, #8]
    mov      w13, #9
    eor      w11, w11, w13
    adrp     x13, #0x53f000
    add      x13, x13, #0xd70
    strb     w11, [x12, #8]
    ldrh     w11, [x13]
    mov      w12, #0xe5e4
    eor      w11, w11, w12
    adrp     x12, #0x53f000
    add      x12, x12, #0xd90
    strh     w11, [x12]
    ldrh     w11, [x13, #2]
    mov      w14, #0xbf07
    eor      w11, w11, w14
    strh     w11, [x12, #2]
    ldrh     w11, [x13, #4]
    mov      w14, #0x8bf8
    eor      w11, w11, w14
    strh     w11, [x12, #4]
    ldrh     w11, [x13, #6]
    mov      w14, #0xe414
    eor      w11, w11, w14
    strh     w11, [x12, #6]
    ldrh     w11, [x13, #8]
    mov      w14, #0xff48
    eor      w11, w11, w14
    strh     w11, [x12, #8]
    ldrh     w11, [x13, #0xa]
    mov      w14, #0x9da5
    eor      w11, w11, w14
    strh     w11, [x12, #0xa]
    ldrh     w11, [x13, #0xc]
    mov      w14, #0x6302
    eor      w11, w11, w14
    strh     w11, [x12, #0xc]
    ldrh     w11, [x13, #0xe]
    mov      w14, #0xa4c6
    eor      w11, w11, w14
    strh     w11, [x12, #0xe]
    ldrh     w11, [x13, #0x10]
    mov      w13, #0xd60
    eor      w11, w11, w13
    strh     w11, [x12, #0x10]
    adrp     x11, #0x53f000
    add      x11, x11, #0xd4e
    ldrh     w12, [x11]
    mov      w13, #0x3fd8
    eor      w12, w12, w13
    adrp     x13, #0x53f000
    add      x13, x13, #0xd5c
    strh     w12, [x13]
    ldrh     w12, [x11, #2]
    mov      w14, #0xbbd1
    eor      w12, w12, w14
    strh     w12, [x13, #2]
    ldrh     w12, [x11, #4]
    mov      w14, #0xad1d
    eor      w12, w12, w14
    strh     w12, [x13, #4]
    ldrh     w12, [x11, #6]
    mov      w14, #0x4e92
    eor      w12, w12, w14
    strh     w12, [x13, #6]
    ldrh     w12, [x11, #8]
    mov      w14, #0x533
    eor      w12, w12, w14
    strh     w12, [x13, #8]
    ldrh     w12, [x11, #0xa]
    mov      w14, #0x7f06
    eor      w12, w12, w14
    strh     w12, [x13, #0xa]
    ldrh     w11, [x11, #0xc]
    mov      w12, #0xb3f7
    eor      w11, w11, w12
    adrp     x12, #0x53f000
    add      x12, x12, #0xd36
    strh     w11, [x13, #0xc]
    ldrh     w11, [x12]
    mov      w13, #0x9558
    eor      w11, w11, w13
    adrp     x13, #0x53f000
    add      x13, x13, #0xd42
    strh     w11, [x13]
    ldrh     w11, [x12, #2]
    mov      w14, #0x8450
    eor      w11, w11, w14
    strh     w11, [x13, #2]
    ldrh     w11, [x12, #4]
    mov      w14, #0x6b69
    eor      w11, w11, w14
    strh     w11, [x13, #4]
    ldrh     w11, [x12, #6]
    mov      w14, #0x8962
    eor      w11, w11, w14
    strh     w11, [x13, #6]
    ldrh     w11, [x12, #8]
    mov      w14, #0xf621
    eor      w11, w11, w14
    strh     w11, [x13, #8]
    ldrh     w11, [x12, #0xa]
    mov      w12, #0x72ce
    eor      w11, w11, w12
    strh     w11, [x13, #0xa]
    adrp     x12, #0x53f000
    add      x12, x12, #0xd2c
    ldrb     w13, [x12]
    mov      w11, #0x59
    eor      w13, w13, w11
    adrp     x14, #0x53f000
    add      x14, x14, #0xd31
    strb     w13, [x14]
    ldrb     w13, [x12, #1]
    mov      w15, #0xfa
    eor      w13, w13, w15
    strb     w13, [x14, #1]
    ldrb     w13, [x12, #2]
    eor      w13, w13, #0xfffffff1
    strb     w13, [x14, #2]
    ldrb     w13, [x12, #3]
    mov      w15, #0xb3
    eor      w13, w13, w15
    strb     w13, [x14, #3]
    ldrb     w12, [x12, #4]
    eor      w10, w12, w10
    strb     w10, [x14, #4]
    adrp     x10, #0x53f000
    add      x10, x10, #0xd0c
    ldrh     w12, [x10]
    mov      w13, #0xd992
    eor      w12, w12, w13
    adrp     x13, #0x53f000
    add      x13, x13, #0xd1c
    strh     w12, [x13]
    ldrh     w12, [x10, #2]
    mov      w14, #0xc7ae
    eor      w12, w12, w14
    strh     w12, [x13, #2]
    ldrh     w12, [x10, #4]
    mov      w14, #0xd687
    eor      w12, w12, w14
    strh     w12, [x13, #4]
    ldrh     w12, [x10, #6]
    mov      w14, #0xf7b6
    eor      w12, w12, w14
    strh     w12, [x13, #6]
    ldrh     w12, [x10, #8]
    mov      w14, #0x8579
    eor      w12, w12, w14
    strh     w12, [x13, #8]
    ldrh     w12, [x10, #0xa]
    mov      w14, #0x2b4
    eor      w12, w12, w14
    strh     w12, [x13, #0xa]
    ldrh     w12, [x10, #0xc]
    mov      w14, #0x5db9
    eor      w12, w12, w14
    strh     w12, [x13, #0xc]
    ldrh     w10, [x10, #0xe]
    mov      w12, #0xd6b3
    eor      w10, w10, w12
    strh     w10, [x13, #0xe]
    adrp     x13, #0x53f000
    add      x13, x13, #0xcfa
    ldrb     w10, [x13]
    adrp     x14, #0x53f000
    add      x14, x14, #0xd03
    eor      w10, w10, #0x38
    strb     w10, [x14]
    ldrb     w10, [x13, #1]
    eor      w10, w10, #0x22222222
    strb     w10, [x14, #1]
    ldrb     w10, [x13, #2]
    eor      w10, w10, #0xcccccccc
    strb     w10, [x14, #2]
    ldrb     w10, [x13, #3]
    mov      w12, #0xed
    eor      w10, w10, w12
    strb     w10, [x14, #3]
    ldrb     w12, [x13, #4]
    mov      w10, #0x5d
    eor      w12, w12, w10
    strb     w12, [x14, #4]
    ldrb     w15, [x13, #5]
    mov      w12, #0x6b
    eor      w15, w15, w12
    strb     w15, [x14, #5]
    ldrb     w15, [x13, #6]
    eor      w15, w15, #0x7c
    strb     w15, [x14, #6]
    ldrb     w15, [x13, #7]
    eor      w15, w15, #0x10
    strb     w15, [x14, #7]
    ldrb     w13, [x13, #8]
    eor      w13, w13, #0xe
    adrp     x15, #0x53f000
    add      x15, x15, #0xcdc
    strb     w13, [x14, #8]
    ldrb     w13, [x15]
    eor      w13, w13, #0x55555555
    adrp     x14, #0x53f000
    add      x14, x14, #0xce1
    strb     w13, [x14]
    ldrb     w13, [x15, #1]
    eor      w13, w13, #0xffffffe3
    strb     w13, [x14, #1]
    ldrb     w13, [x15, #2]
    mov      w16, #0x65
    eor      w13, w13, w16
    strb     w13, [x14, #2]
    ldrb     w13, [x15, #3]
    mvn      w13, w13
    strb     w13, [x14, #3]
    ldrb     w13, [x15, #4]
    mov      w15, #0x35
    eor      w13, w13, w15
    strb     w13, [x14, #4]
    adrp     x13, #0x53f000
    add      x13, x13, #0xda2
    ldrh     w14, [x13]
    mov      w15, #0x6744
    eor      w14, w14, w15
    adrp     x15, #0x53f000
    add      x15, x15, #0xdb2
    strh     w14, [x15]
    ldrh     w14, [x13, #2]
    mov      w16, #0xfbbb
    eor      w14, w14, w16
    strh     w14, [x15, #2]
    ldrh     w14, [x13, #4]
    mov      w16, #0x740b
    eor      w14, w14, w16
    strh     w14, [x15, #4]
    ldrh     w14, [x13, #6]
    mov      w16, #0xf7eb
    eor      w14, w14, w16
    strh     w14, [x15, #6]
    ldrh     w14, [x13, #8]
    mov      w16, #0xca1a
    eor      w14, w14, w16
    strh     w14, [x15, #8]
    ldrh     w14, [x13, #0xa]
    mov      w16, #0x7d31
    eor      w14, w14, w16
    strh     w14, [x15, #0xa]
    ldrh     w14, [x13, #0xc]
    mov      w16, #0x5a87
    eor      w14, w14, w16
    strh     w14, [x15, #0xc]
    ldrh     w13, [x13, #0xe]
    mov      w14, #0xdc3a
    eor      w13, w13, w14
    strh     w13, [x15, #0xe]
    adrp     x13, #0x53f000
    add      x13, x13, #0xce6
    ldrh     w14, [x13]
    mov      w15, #0x6da1
    eor      w14, w14, w15
    adrp     x15, #0x53f000
    add      x15, x15, #0xcf0
    strh     w14, [x15]
    ldrh     w14, [x13, #2]
    mov      w16, #0x15c9
    eor      w14, w14, w16
    strh     w14, [x15, #2]
    ldrh     w14, [x13, #4]
    mov      w16, #0xa026
    eor      w14, w14, w16
    strh     w14, [x15, #4]
    ldrh     w14, [x13, #6]
    mov      w16, #0x90aa
    eor      w14, w14, w16
    strh     w14, [x15, #6]
    ldrh     w13, [x13, #8]
    mov      w14, #0x67d7
    eor      w13, w13, w14
    strh     w13, [x15, #8]
    adrp     x14, #0x53f000
    add      x14, x14, #0xc40
    ldrb     w13, [x14]
    mov      w15, #0xd3
    eor      w13, w13, w15
    adrp     x15, #0x53f000
    add      x15, x15, #0xc4c
    strb     w13, [x15]
    ldrb     w13, [x14, #1]
    eor      w13, w13, #0x88888888
    strb     w13, [x15, #1]
    ldrb     w13, [x14, #2]
    mov      w16, #0xec
    eor      w13, w13, w16
    strb     w13, [x15, #2]
    ldrb     w13, [x14, #3]
    eor      w12, w13, w12
    strb     w12, [x15, #3]
    ldrb     w12, [x14, #4]
    eor      w12, w12, #0x60
    strb     w12, [x15, #4]
    ldrb     w12, [x14, #5]
    mov      w13, #0x1a
    eor      w12, w12, w13
    strb     w12, [x15, #5]
    ldrb     w12, [x14, #6]
    mov      w16, #0x85
    eor      w12, w12, w16
    strb     w12, [x15, #6]
    ldrb     w12, [x14, #7]
    eor      w12, w12, #0xffffffc7
    strb     w12, [x15, #7]
    ldrb     w12, [x14, #8]
    eor      w12, w12, #0xffffff9f
    strb     w12, [x15, #8]
    ldrb     w12, [x14, #9]
    mov      w17, #0x97
    eor      w12, w12, w17
    strb     w12, [x15, #9]
    ldrb     w12, [x14, #0xa]
    mov      w17, #0x89
    eor      w12, w12, w17
    strb     w12, [x15, #0xa]
    ldrb     w12, [x14, #0xb]
    mov      w14, #0x12
    eor      w12, w12, w14
    strb     w12, [x15, #0xb]
    adrp     x14, #0x53f000
    add      x14, x14, #0xcc0
    ldrb     w12, [x14]
    mov      w15, #0x75
    eor      w12, w12, w15
    adrp     x15, #0x53f000
    add      x15, x15, #0xcc9
    strb     w12, [x15]
    ldrb     w12, [x14, #1]
    eor      w12, w12, w16
    strb     w12, [x15, #1]
    ldrb     w12, [x14, #2]
    mov      w16, #0xea
    eor      w12, w12, w16
    strb     w12, [x15, #2]
    ldrb     w12, [x14, #3]
    mov      w16, #0x2f
    eor      w12, w12, w16
    strb     w12, [x15, #3]
    ldrb     w12, [x14, #4]
    mov      w16, #0xa9
    eor      w12, w12, w16
    strb     w12, [x15, #4]
    ldrb     w16, [x14, #5]
    mov      w12, #0x47
    eor      w16, w16, w12
    strb     w16, [x15, #5]
    ldrb     w16, [x14, #6]
    mov      w17, #0x27
    eor      w16, w16, w17
    strb     w16, [x15, #6]
    ldrb     w16, [x14, #7]
    mov      w17, #0xb9
    eor      w16, w16, w17
    strb     w16, [x15, #7]
    ldrb     w14, [x14, #8]
    mov      w16, #0xf5
    eor      w14, w14, w16
    strb     w14, [x15, #8]
    adrp     x14, #0x53f000
    add      x14, x14, #0xc7a
    ldrb     w15, [x14]
    mov      w16, #0xb
    eor      w15, w15, w16
    adrp     x16, #0x53f000
    add      x16, x16, #0xc81
    strb     w15, [x16]
    ldrb     w15, [x14, #1]
    mov      w17, #0x31
    eor      w15, w15, w17
    strb     w15, [x16, #1]
    ldrb     w15, [x14, #2]
    mov      w17, #0xc9
    eor      w15, w15, w17
    strb     w15, [x16, #2]
    ldrb     w15, [x14, #3]
    eor      w15, w15, w13
    strb     w15, [x16, #3]
    ldrb     w15, [x14, #4]
    mov      w17, #0x63
    eor      w15, w15, w17
    strb     w15, [x16, #4]
    ldrb     w15, [x14, #5]
    eor      w13, w15, w13
    strb     w13, [x16, #5]
    ldrb     w13, [x14, #6]
    eor      w13, w13, #0x20
    strb     w13, [x16, #6]
    adrp     x14, #0x53f000
    add      x14, x14, #0xc92
    ldrb     w13, [x14]
    mov      w15, #0xd0
    eor      w13, w13, w15
    adrp     x15, #0x53f000
    add      x15, x15, #0xc9f
    strb     w13, [x15]
    ldrb     w13, [x14, #1]
    eor      w9, w13, w9
    strb     w9, [x15, #1]
    ldrb     w9, [x14, #2]
    mov      w13, #0x2c
    eor      w9, w9, w13
    strb     w9, [x15, #2]
    ldrb     w9, [x14, #3]
    eor      w9, w9, #0x40
    strb     w9, [x15, #3]
    ldrb     w9, [x14, #4]
    eor      w9, w9, #0xfffffff7
    strb     w9, [x15, #4]
    ldrb     w9, [x14, #5]
    eor      w9, w9, #0xfffffff3
    strb     w9, [x15, #5]
    ldrb     w9, [x14, #6]
    mov      w13, #0x5f
    eor      w9, w9, w13
    strb     w9, [x15, #6]
    ldrb     w9, [x14, #7]
    mvn      w9, w9
    strb     w9, [x15, #7]
    ldrb     w9, [x14, #8]
    eor      w9, w9, #0xbbbbbbbb
    strb     w9, [x15, #8]
    ldrb     w16, [x14, #9]
    mov      w9, #0xd5
    eor      w16, w16, w9
    strb     w16, [x15, #9]
    ldrb     w16, [x14, #0xa]
    mov      w17, #0xad
    eor      w16, w16, w17
    strb     w16, [x15, #0xa]
    ldrb     w16, [x14, #0xb]
    eor      w16, w16, #0xc0
    strb     w16, [x15, #0xb]
    ldrb     w14, [x14, #0xc]
    mov      w16, #0xde
    eor      w14, w14, w16
    strb     w14, [x15, #0xc]
    adrp     x14, #0x53f000
    add      x14, x14, #0xc88
    ldrb     w15, [x14]
    eor      w15, w15, #0xffffffc1
    adrp     x16, #0x53f000
    add      x16, x16, #0xc8d
    strb     w15, [x16]
    ldrb     w15, [x14, #1]
    eor      w15, w15, #0x7c
    strb     w15, [x16, #1]
    ldrb     w15, [x14, #2]
    mov      w17, #0x9c
    eor      w15, w15, w17
    strb     w15, [x16, #2]
    ldrb     w15, [x14, #3]
    eor      w11, w15, w11
    strb     w11, [x16, #3]
    ldrb     w11, [x14, #4]
    eor      w11, w11, #0x88888888
    strb     w11, [x16, #4]
    adrp     x11, #0x53f000
    add      x11, x11, #0xcac
    ldrh     w14, [x11]
    mov      w15, #0x444d
    adrp     x16, #0x53f000
    add      x16, x16, #0xcb6
    eor      w14, w14, w15
    strh     w14, [x16]
    ldrh     w14, [x11, #2]
    mov      w15, #0x4009
    eor      w14, w14, w15
    strh     w14, [x16, #2]
    ldrh     w14, [x11, #4]
    mov      w15, #0x532e
    eor      w14, w14, w15
    strh     w14, [x16, #4]
    ldrh     w14, [x11, #6]
    mov      w15, #0xc968
    eor      w14, w14, w15
    strh     w14, [x16, #6]
    ldrh     w11, [x11, #8]
    mov      w14, #0xc2d1
    eor      w11, w11, w14
    strh     w11, [x16, #8]
    adrp     x11, #0x53f000
    add      x11, x11, #0xc68
    ldrb     w14, [x11]
    mov      w15, #0x7a
    adrp     x16, #0x53f000
    add      x16, x16, #0xc71
    eor      w14, w14, w15
    strb     w14, [x16]
    ldrb     w14, [x11, #1]
    eor      w14, w14, #3
    strb     w14, [x16, #1]
    ldrb     w14, [x11, #2]
    eor      w14, w14, #0x18
    strb     w14, [x16, #2]
    ldrb     w14, [x11, #3]
    mov      w15, #0x69
    eor      w14, w14, w15
    strb     w14, [x16, #3]
    ldrb     w14, [x11, #4]
    mov      w15, #0x4e
    eor      w14, w14, w15
    strb     w14, [x16, #4]
    ldrb     w14, [x11, #5]
    eor      w14, w14, #6
    strb     w14, [x16, #5]
    ldrb     w14, [x11, #6]
    mov      w15, #0xf6
    eor      w14, w14, w15
    strb     w14, [x16, #6]
    ldrb     w14, [x11, #7]
    eor      w14, w14, #4
    strb     w14, [x16, #7]
    ldrb     w11, [x11, #8]
    mov      w14, #0x15
    eor      w11, w11, w14
    strb     w11, [x16, #8]
    adrp     x11, #0x53f000
    add      x11, x11, #0xcd2
    ldrb     w14, [x11]
    mov      w15, #0xd8
    adrp     x16, #0x53f000
    add      x16, x16, #0xcd7
    eor      w14, w14, w15
    strb     w14, [x16]
    ldrb     w14, [x11, #1]
    eor      w10, w14, w10
    strb     w10, [x16, #1]
    ldrb     w10, [x11, #2]
    eor      w10, w10, #0xbbbbbbbb
    strb     w10, [x16, #2]
    ldrb     w10, [x11, #3]
    eor      w10, w10, w13
    strb     w10, [x16, #3]
    ldrb     w10, [x11, #4]
    mov      w11, #0xe4
    eor      w10, w10, w11
    strb     w10, [x16, #4]
    adrp     x10, #0x53f000
    add      x10, x10, #0xc58
    ldrb     w11, [x10]
    eor      w11, w11, w12
    adrp     x12, #0x53f000
    add      x12, x12, #0xc60
    strb     w11, [x12]
    ldrb     w11, [x10, #1]
    eor      w9, w11, w9
    strb     w9, [x12, #1]
    ldrb     w9, [x10, #2]
    mov      w11, #0x9b
    eor      w9, w9, w11
    strb     w9, [x12, #2]
    ldrb     w9, [x10, #3]
    mov      w11, #0x6f
    eor      w9, w9, w11
    strb     w9, [x12, #3]
    ldrb     w9, [x10, #4]
    mov      w11, #0x64
    eor      w9, w9, w11
    strb     w9, [x12, #4]
    ldrb     w9, [x10, #5]
    mov      w11, #0xd
    eor      w9, w9, w11
    strb     w9, [x12, #5]
    ldrb     w9, [x10, #6]
    mov      w11, #5
    eor      w9, w9, w11
    strb     w9, [x12, #6]
    ldrb     w9, [x10, #7]
    eor      w9, w9, #0xfffffffd
    strb     w9, [x12, #7]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x26, sp, #0x10
    mov      sp, x26
    sub      x28, sp, #0x40
    mov      sp, x28
    sub      x27, sp, #0x40
    mov      sp, x27
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x338]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #6
    b.lo     #0x2e69f8
    mov      x0, x19
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4bf000
    ldr      x25, [x8, #0xa50]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    ldr      w8, [x0]
    adrp     x9, #0x53f000
    add      x9, x9, #0xdf1
    ldr      w9, [x9]
    cmp      w8, w9
    b.eq     #0x2e6a68
    mov      w23, #0
    cbz      x24, #0x2e6a0c
    adrp     x8, #0x540000
    add      x8, x8, #0x2e0
    str      x8, [x24]
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2e7224
    mov      x0, x23
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    stur     x21, [x29, #-0x70]
    mov      x21, x22
    mov      x0, x19
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    ldrh     w8, [x0, #4]
    rev16    w25, w8
    add      x22, x25, #6
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    cmp      x22, x0
    b.ls     #0x2e6ac0
    mov      w23, #0
    cbz      x24, #0x2e6ab4
    adrp     x8, #0x53f000
    add      x8, x8, #0xfa0
    str      x8, [x24]
    mov      x22, x21
    ldur     x21, [x29, #-0x70]
    b        #0x2e6a0c
    adrp     x8, #0x4c4000
    ldr      x23, [x8, #0x2e8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4f8]
    mov      x0, x19
    mov      w2, #6
    mov      x3, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xab8]
    mov      x0, x23
    stur     x1, [x29, #-0x78]
    mov      x2, x25
    mov      x3, #0
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x410]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x418]
    mov      x0, x22
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      x0, x22
    ccmp     x22, #0, #4, ne
    b.ne     #0x2e6b80
    mov      x22, x21
    mov      w23, #0
    cbz      x24, #0x2e6b78
    adrp     x8, #0x540000
    add      x8, x8, #0xe0
    str      x8, [x24]
    ldur     x21, [x29, #-0x70]
    b        #0x2e721c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x528]
    adrp     x2, #0x540000
    add      x2, x2, #0x1a0
    stur     x0, [x29, #-0x80]
    stp      x25, x1, [x29, #-0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4e8]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    str      xzr, [x26]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x500]
    ldp      x5, x0, [x29, #-0x68]
    mov      x2, x19
    stur     x22, [x29, #-0xa8]
    mov      x3, x22
    mov      x4, x20
    ldur     x6, [x29, #-0x70]
    mov      x7, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldr      x26, [x26]
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    mov      x22, x21
    cbz      x25, #0x2e6db4
    stur     x26, [x29, #-0x68]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2e8]
    ldur     x1, [x29, #-0x78]
    stur     x25, [x29, #-0x78]
    mov      x2, x25
    mov      x3, #0
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    ldur     x26, [x29, #-0x90]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    stur     x21, [x29, #-0x98]
    csel     x21, x21, xzr, ne
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    adrp     x2, #0x540000
    add      x2, x2, #0x260
    ldur     x1, [x29, #-0x88]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x25
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    stur     x21, [x29, #-0xa0]
    tbz      w0, #0, #0x2e6dd8
    adrp     x2, #0x540000
    add      x2, x2, #0x260
    mov      x0, x21
    ldur     x23, [x29, #-0x88]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x8, x21
    ldp      x21, x26, [x29, #-0x70]
    cbz      x8, #0x2e6df8
    adrp     x2, #0x540000
    add      x2, x2, #0x1e0
    mov      x0, x8
    stur     x8, [x29, #-0x90]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x23
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    stur     x1, [x29, #-0xb8]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    tbz      w25, #0, #0x2e6e00
    adrp     x2, #0x540000
    add      x2, x2, #0x60
    ldur     x25, [x29, #-0x90]
    mov      x0, x25
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4a6000
    add      x8, x8, #0xd8
    cmp      x0, #0
    csel     x0, x8, x0, eq
    stur     x0, [x29, #-0xb0]
    bl       #0x461ca8 // _objc_retain
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x540000
    add      x2, x2, #0x20
    mov      x0, x25
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    cbz      x0, #0x2e6e24
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    mov      x26, x23
    b        #0x2e6e58
    cbz      x24, #0x2e6dec
    adrp     x8, #0x540000
    add      x8, x8, #0x160
    cmp      x26, #0
    csel     x0, x8, x26, eq
    bl       #0x461cb4 // _objc_retainAutorelease
    mov      w23, #0
    str      x0, [x24]
    b        #0x2e6df0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, #0
    ldp      x21, x26, [x29, #-0x70]
    b        #0x2e6e08
    mov      w23, #0
    ldur     x21, [x29, #-0x70]
    b        #0x2e7208
    mov      x0, #0
    b        #0x2e6e08
    ldur     x26, [x29, #-0x68]
    ldur     x0, [x29, #-0x90]
    ldur     x25, [x29, #-0x78]
    mov      w23, #0
    cbz      x24, #0x2e71f4
    adrp     x8, #0x53f000
    add      x8, x8, #0xfe0
    str      x8, [x24]
    b        #0x2e71f4
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    ldur     x8, [x29, #-0xa8]
    str      x8, [sp, #-0x10]!
    adrp     x2, #0x540000
    add      x2, x2, #0x220
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    add      sp, sp, #0x10
    mov      x26, x0
    ldur     x25, [x29, #-0x60]
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x53f000
    add      x2, x2, #0xf20
    ldp      x23, x0, [x29, #-0xb8]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    stur     x26, [x29, #-0xc0]
    tbnz     w0, #0, #0x2e6e98
    adrp     x2, #0x53f000
    add      x2, x2, #0xee0
    ldur     x0, [x29, #-0xb0]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x2e71bc
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x508]
    mov      x0, x25
    ldur     x2, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc68]
    mov      x0, x19
    mov      x2, x23
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x25
    mov      x25, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    tbz      w25, #0, #0x2e71a8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x510]
    mov      x0, x26
    ldur     x24, [x29, #-0xa8]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x2, #0x53f000
    add      x2, x2, #0xf20
    ldp      x1, x0, [x29, #-0xb8]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e6f14
    bl       #0x197d8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x518]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb8]
    adrp     x8, #0x540000
    add      x8, x8, #0x1a0
    str      x8, [x27]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f0]
    stur     x1, [x29, #-0xe0]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xc8]
    ldur     x8, [x29, #-0xb0]
    stp      x0, x8, [x28]
    adrp     x8, #0x540000
    add      x9, x8, #0x60
    adrp     x8, #0x540000
    add      x8, x8, #0x20
    stp      x9, x8, [x27, #8]
    ldur     x8, [x29, #-0xc0]
    str      x8, [x28, #0x10]
    adrp     x2, #0x53f000
    add      x2, x2, #0xe60
    str      x2, [x27, #0x18]
    ldp      x23, x24, [x29, #-0x90]
    mov      x0, x23
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cmp      x0, #0
    adrp     x26, #0x4a6000
    add      x26, x26, #0xd8
    stur     x0, [x29, #-0xd0]
    csel     x8, x26, x0, eq
    adrp     x9, #0x540000
    add      x9, x9, #0xa0
    cmp      x22, #0
    csel     x10, x26, x22, eq
    stp      x8, x10, [x28, #0x18]
    adrp     x2, #0x53f000
    add      x2, x2, #0xf60
    stp      x9, x2, [x27, #0x20]
    mov      x0, x23
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cmp      x0, #0
    stur     x0, [x29, #-0xd8]
    csel     x8, x26, x0, eq
    str      x8, [x28, #0x28]
    adrp     x2, #0x540000
    add      x2, x2, #0x120
    str      x2, [x27, #0x30]
    mov      x0, x23
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    cbnz     x0, #0x2e704c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x628]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x88]
    str      x0, [x28, #0x30]
    adrp     x8, #0x53f000
    add      x8, x8, #0xe20
    str      x8, [x27, #0x38]
    adrp     x24, #0x4c4000
    ldr      x23, [x24, #0xa8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1d0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x778]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x998]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x498]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    str      x0, [x28, #0x38]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    mov      x2, x28
    mov      x3, x27
    mov      w4, #8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    ldr      x0, [x24, #0xa8]
    ldur     x1, [x29, #-0xe0]
    ldur     x2, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5b0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x368]
    ldur     x0, [x29, #-0xb8]
    mov      x2, x27
    mov      x3, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    cbnz     x26, #0x2e7160
    ldur     x0, [x29, #-0x88]
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xd8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xd0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xc8]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x520]
    ldur     x0, [x29, #-0x60]
    ldur     x23, [x29, #-0xb8]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      w23, #1
    b        #0x2e71d8
    cbz      x24, #0x2e71d4
    mov      w23, #0
    adrp     x8, #0x53f000
    add      x8, x8, #0xea0
    b        #0x2e71cc
    cbz      x24, #0x2e71d4
    mov      w23, #0
    adrp     x8, #0x540000
    add      x8, x8, #0x2a0
    str      x8, [x24]
    b        #0x2e71d8
    mov      w23, #0
    ldur     x26, [x29, #-0x68]
    ldur     x25, [x29, #-0x78]
    ldur     x0, [x29, #-0xc0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x90]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x98]
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    b        #0x2e6a0c
    bl       #0x4618b8 // ___stack_chk_fail

// +[WCLGGlassPackage invalidateMemoryCacheForTheme:] IMP=0x2E7228 bounds=0x2E7228-0x2E727C
loc_2E7228:
    adrp     x8, #0x580000
    ldr      x9, [x8, #0x3b8]
    cmp      x9, x2
    b.ne     #0x2e7278
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    str      xzr, [x8, #0x3b8]
    adrp     x8, #0x580000
    ldr      x0, [x8, #0x3a0]
    str      xzr, [x8, #0x3a0]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x580000
    ldr      x0, [x8, #0x3a8]
    str      xzr, [x8, #0x3a8]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x580000
    ldr      x0, [x8, #0x3b0]
    str      xzr, [x8, #0x3b0]
    ldp      x29, x30, [sp], #0x10
    b        #0x461c9c // _objc_release
    ret      

// +[WCLGGlassPackage decryptedPayloadForTheme:error:] IMP=0x2E727C bounds=0x2E727C-0x2E75A4
loc_2E727C:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x20, x3
    mov      x21, x2
    mov      x22, x0
    adrp     x8, #0x580000
    add      x8, x8, #0x440
    ldar     w9, [x8]
    cbnz     w9, #0x2e73b0
    adrp     x9, #0x540000
    add      x9, x9, #0x320
    ldrh     w10, [x9]
    mov      w11, #0x50f0
    eor      w10, w10, w11
    adrp     x11, #0x540000
    add      x11, x11, #0x32c
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x2fb8
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x5a82
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x1ab1
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x29f2
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w9, [x9, #0xa]
    mov      w10, #0x3b65
    eor      w9, w9, w10
    strh     w9, [x11, #0xa]
    adrp     x9, #0x540000
    add      x9, x9, #0x300
    ldrh     w10, [x9]
    mov      w11, #0xc5a3
    adrp     x12, #0x540000
    add      x12, x12, #0x310
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0xbf7f
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0xb1a4
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0xbdb0
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0x8183
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w10, [x9, #0xa]
    mov      w11, #0xfb6
    eor      w10, w10, w11
    strh     w10, [x12, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w11, #0xdb16
    eor      w10, w10, w11
    strh     w10, [x12, #0xc]
    ldrh     w9, [x9, #0xe]
    mov      w10, #0x9d50
    eor      w9, w9, w10
    strh     w9, [x12, #0xe]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x19, [x8, #0x130]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x508]
    mov      x0, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xa18]
    mov      x0, x19
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cbz      x19, #0x2e7534
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x4b0]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf50]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2e754c
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x528]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x530]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x500]
    mov      x0, x22
    mov      x2, x19
    mov      x3, x21
    mov      x4, x24
    mov      x5, x25
    mov      x6, x26
    mov      x7, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    cbz      x20, #0x2e7564
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2e8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xab8]
    mov      x2, x20
    mov      x3, #0
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    csel     x21, x22, xzr, ne
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    b        #0x2e7568
    mov      x21, #0
    cbz      x20, #0x2e7580
    adrp     x8, #0x540000
    add      x8, x8, #0x3a0
    str      x8, [x20]
    b        #0x2e7580
    mov      x21, #0
    cbz      x20, #0x2e7570
    adrp     x8, #0x540000
    add      x8, x8, #0x360
    str      x8, [x20]
    b        #0x2e7570
    mov      x21, #0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    b        #0x461be8 // _objc_autoreleaseReturnValue

// +[WCLGGlassPackage filesForTheme:] IMP=0x2E75A4 bounds=0x2E75A4-0x2E7A30
loc_2E75A4:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x50
    mov      x19, x2
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x580000
    add      x8, x8, #0x444
    ldar     w9, [x8]
    cbnz     w9, #0x2e76e8
    adrp     x9, #0x540000
    add      x9, x9, #0x3d2
    ldrb     w10, [x9]
    mov      w11, #0xb2
    eor      w10, w10, w11
    adrp     x11, #0x540000
    add      x11, x11, #0x3d8
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xaaaaaaaa
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xae
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0x55555555
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0xe8
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w9, [x9, #5]
    mov      w10, #0x53
    eor      w9, w9, w10
    strb     w9, [x11, #5]
    adrp     x9, #0x540000
    add      x9, x9, #0x3c0
    ldrb     w10, [x9]
    mov      w11, #0xb
    eor      w10, w10, w11
    adrp     x11, #0x540000
    add      x11, x11, #0x3c9
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x58
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #1
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x47
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x98
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #8
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0x5a
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0xf6
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w9, [x9, #8]
    mov      w10, #0x32
    eor      w9, w9, w10
    strb     w9, [x11, #8]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x24, sp, #0x40
    mov      sp, x24
    sub      x8, sp, #0x80
    stur     x8, [x29, #-0x70]
    mov      sp, x8
    adrp     x8, #0x580000
    ldr      x8, [x8, #0x3b8]
    adrp     x9, #0x580000
    ldr      x20, [x9, #0x3a0]
    cmp      x8, x19
    ccmp     x20, #0, #4, eq
    b.ne     #0x2e79d0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x538]
    mov      x2, x19
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x28, [x8, #0x528]
    adrp     x2, #0x540000
    add      x2, x2, #0x440
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x410]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x418]
    mov      x0, x20
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x2e79dc
    adrp     x2, #0x540000
    add      x2, x2, #0x440
    mov      x0, x21
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    cbz      x23, #0x2e79e4
    stp      x25, x22, [x29, #-0x98]
    stp      x21, x19, [x29, #-0x88]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x68]
    movi     v0.16b, #0
    stp      q0, q0, [x24]
    stp      q0, q0, [x24, #0x20]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stur     x1, [x29, #-0x78]
    mov      x2, x24
    ldur     x3, [x29, #-0x70]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2e7904
    mov      x26, x0
    ldr      x8, [x24, #0x10]
    ldr      x22, [x8]
    mov      x21, #0
    adrp     x8, #0x4bf000
    ldr      x27, [x8, #0xac8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x368]
    stur     x8, [x29, #-0x60]
    ldr      x8, [x24, #0x10]
    ldr      x8, [x8]
    cmp      x8, x22
    b.eq     #0x2e785c
    mov      x0, x23
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x24, #8]
    ldr      x19, [x8, x21, lsl #3]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x130]
    bl       #0x461ba0 // _objc_alloc
    mov      x25, x0
    mov      x20, x23
    mov      x0, x23
    mov      x23, x28
    mov      x1, x28
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x0, x25
    mov      x1, x27
    mov      x2, x28
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    cbz      x25, #0x2e78cc
    ldp      x0, x1, [x29, #-0x68]
    mov      x2, x25
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    add      x21, x21, #1
    cmp      x26, x21
    mov      x28, x23
    mov      x23, x20
    b.ne     #0x2e7844
    mov      x0, x23
    ldp      x1, x3, [x29, #-0x78]
    mov      x2, x24
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    cbnz     x0, #0x2e782c
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x80]
    adrp     x9, #0x580000
    str      x8, [x9, #0x3b8]
    adrp     x0, #0x580000
    add      x0, x0, #0x3a0
    ldur     x20, [x29, #-0x68]
    mov      x1, x20
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x580000
    ldr      x0, [x8, #0x3a8]
    str      xzr, [x8, #0x3a8]
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x540000
    add      x2, x2, #0x400
    ldur     x21, [x29, #-0x88]
    mov      x0, x21
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    ldur     x1, [x29, #-0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x19
    ldur     x1, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    mov      x0, #0
    cbz      w8, #0x2e79a8
    adrp     x2, #0x540000
    add      x2, x2, #0x400
    mov      x0, x21
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x9, #0x580000
    ldr      x8, [x9, #0x3b0]
    str      x0, [x9, #0x3b0]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    b        #0x2e79e8
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    b        #0x2e79f0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x20, #0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2e7a2c
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

// +[WCLGGlassPackage manifestForTheme:] IMP=0x2E7A30 bounds=0x2E7A30-0x2E7AA0
loc_2E7A30:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x8, x0
    adrp     x20, #0x580000
    ldr      x9, [x20, #0x3b8]
    adrp     x21, #0x580000
    ldr      x0, [x21, #0x3b0]
    cmp      x9, x2
    ccmp     x0, #0, #4, eq
    b.ne     #0x2e7a8c
    mov      x19, x2
    adrp     x9, #0x4c1000
    ldr      x1, [x9, #0x540]
    mov      x0, x8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461d38 // _objc_unsafeClaimAutoreleasedReturnValue
    ldr      x8, [x20, #0x3b8]
    ldr      x9, [x21, #0x3b0]
    cmp      x8, x19
    csel     x0, x9, xzr, eq
    bl       #0x461ca8 // _objc_retain
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x461be8 // _objc_autoreleaseReturnValue

// +[WCLGGlassPackage cardHTMLForTheme:] IMP=0x2E7AA0 bounds=0x2E7AA0-0x2E7E40
loc_2E7AA0:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x30
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x580000
    add      x8, x8, #0x44c
    ldar     w9, [x8]
    cbnz     w9, #0x2e7be0
    adrp     x9, #0x540000
    add      x9, x9, #0x46a
    ldrb     w10, [x9]
    eor      w10, w10, #0x78
    adrp     x11, #0x540000
    add      x11, x11, #0x475
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x98
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0x7f
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xffffffbf
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x16
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0x60
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0x50
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0xb0
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w12, #0x6d
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    mov      w12, #0xb1
    eor      w10, w10, w12
    strb     w10, [x11, #9]
    ldrb     w9, [x9, #0xa]
    eor      w9, w9, #1
    strb     w9, [x11, #0xa]
    adrp     x9, #0x540000
    add      x9, x9, #0x460
    ldrb     w10, [x9]
    eor      w10, w10, #0xf8
    adrp     x11, #0x540000
    add      x11, x11, #0x465
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x24
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0x88888888
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0x60
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0x32
    eor      w9, w9, w10
    strb     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x20, sp, #0x40
    mov      sp, x20
    sub      x25, sp, #0x80
    mov      sp, x25
    adrp     x8, #0x580000
    ldr      x8, [x8, #0x3b8]
    adrp     x21, #0x580000
    ldr      x22, [x21, #0x3a8]
    cmp      x8, x2
    ccmp     x22, #0, #4, eq
    b.ne     #0x2e7ca0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x540]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x528]
    adrp     x2, #0x540000
    add      x2, x2, #0x4e0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    cbz      x0, #0x2e7ce4
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7c8]
    mov      x2, x23
    mov      w3, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x0, [x21, #0x3a8]
    str      x22, [x21, #0x3a8]
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    b        #0x2e7ca8
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2e7e3c
    mov      x0, x22
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    b        #0x461be8 // _objc_autoreleaseReturnValue
    movi     v0.16b, #0
    stp      q0, q0, [x20, #0x20]
    stp      q0, q0, [x20]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stur     x1, [x29, #-0x70]
    mov      x2, x20
    mov      x3, x25
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2e7df8
    mov      x24, x0
    stp      x25, x22, [x29, #-0x80]
    ldr      x8, [x20, #0x10]
    ldr      x8, [x8]
    stp      x19, x8, [x29, #-0x68]
    adrp     x8, #0x4be000
    adrp     x9, #0x4be000
    adrp     x10, #0x4be000
    mov      x25, #0
    ldr      x26, [x8, #0x930]
    ldr      x27, [x9, #0x5d0]
    ldr      x28, [x10, #0x358]
    ldr      x8, [x20, #0x10]
    ldr      x8, [x8]
    ldur     x9, [x29, #-0x60]
    cmp      x8, x9
    b.eq     #0x2e7d64
    ldur     x0, [x29, #-0x68]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x20, #8]
    ldr      x23, [x8, x25, lsl #3]
    mov      x0, x23
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x28
    adrp     x2, #0x540000
    add      x2, x2, #0x4a0
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    tbnz     w19, #0, #0x2e7e04
    add      x25, x25, #1
    cmp      x24, x25
    b.ne     #0x2e7d48
    ldp      x1, x19, [x29, #-0x70]
    mov      x0, x19
    mov      x2, x20
    ldur     x3, [x29, #-0x80]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    adrp     x8, #0x4be000
    adrp     x9, #0x4be000
    adrp     x10, #0x4be000
    cbnz     x0, #0x2e7d38
    mov      x22, #0
    mov      x23, x19
    b        #0x2e7c8c
    ldur     x19, [x29, #-0x68]
    mov      x0, x19
    ldur     x1, [x29, #-0x78]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x21, #0x580000
    cbnz     x23, #0x2e7c54
    mov      x22, #0
    b        #0x2e7c94
    bl       #0x4618b8 // ___stack_chk_fail

// +[WCLGGlassPackage installedVersionMap] IMP=0x2E7E40 bounds=0x2E7E40-0x2E8160
loc_2E7E40:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x40
    mov      x22, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x580000
    add      x8, x8, #0x450
    ldar     w9, [x8]
    cbnz     w9, #0x2e7f54
    adrp     x9, #0x540000
    add      x9, x9, #0x500
    ldrb     w10, [x9]
    eor      w10, w10, #0xffffffe7
    adrp     x11, #0x540000
    add      x11, x11, #0x50d
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x88888888
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xb5
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x29
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0xcd
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x75
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    eor      w10, w10, #0xfffffffd
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w12, #0xf2
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    mov      w12, #0xa
    eor      w10, w10, w12
    strb     w10, [x11, #9]
    ldrb     w10, [x9, #0xa]
    mov      w12, #0xd2
    eor      w10, w10, w12
    strb     w10, [x11, #0xa]
    ldrb     w10, [x9, #0xb]
    mov      w12, #0xda
    eor      w10, w10, w12
    strb     w10, [x11, #0xb]
    ldrb     w9, [x9, #0xc]
    mov      w10, #0x6d
    eor      w9, w9, w10
    strb     w9, [x11, #0xc]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x20, sp
    sub      x19, x20, #0x40
    mov      sp, x19
    sub      x21, sp, #0x80
    mov      sp, x21
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x68]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x518]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    movi     v0.16b, #0
    stp      q0, q0, [x20, #-0x40]
    stp      q0, q0, [x20, #-0x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stp      x1, x21, [x29, #-0x88]
    mov      x2, x19
    mov      x3, x21
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2e8118
    mov      x24, x0
    ldr      x8, [x19, #0x10]
    ldr      x28, [x8]
    adrp     x27, #0x540000
    add      x27, x27, #0x540
    mov      x21, #0
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x528]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x368]
    stur     x8, [x29, #-0x60]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x628]
    stp      x8, x26, [x29, #-0x78]
    ldr      x8, [x19, #0x10]
    ldr      x8, [x8]
    cmp      x8, x28
    b.eq     #0x2e8028
    mov      x0, x22
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x19, #8]
    ldr      x23, [x8, x21, lsl #3]
    mov      x0, x22
    mov      x1, x26
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x26
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    cbz      x0, #0x2e807c
    ldp      x0, x1, [x29, #-0x68]
    mov      x2, x25
    mov      x3, x23
    bl       #0x461c6c // _objc_msgSend
    b        #0x2e80e0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    ldur     x1, [x29, #-0x78]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x19
    mov      x19, x27
    mov      x27, x22
    mov      x22, x24
    mov      x24, x28
    mov      x28, x0
    ldp      x0, x1, [x29, #-0x68]
    mov      x2, x28
    mov      x3, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    mov      x28, x24
    mov      x24, x22
    mov      x22, x27
    mov      x27, x19
    mov      x19, x26
    ldur     x26, [x29, #-0x70]
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    add      x21, x21, #1
    cmp      x24, x21
    b.ne     #0x2e8010
    mov      x0, x22
    ldp      x1, x3, [x29, #-0x88]
    mov      x2, x19
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    cbnz     x0, #0x2e7fec
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2e815c
    ldur     x0, [x29, #-0x68]
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    b        #0x461be8 // _objc_autoreleaseReturnValue
    bl       #0x4618b8 // ___stack_chk_fail

// +[WCLGGlassPackage installedItems] IMP=0x2E8160 bounds=0x2E8160-0x2E8B28
loc_2E8160:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0xa0
    mov      x22, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x60]
    adrp     x8, #0x580000
    add      x8, x8, #0x454
    ldar     w9, [x8]
    cbnz     w9, #0x2e86b0
    adrp     x11, #0x540000
    add      x11, x11, #0x5b8
    ldrb     w9, [x11]
    mov      w12, #0x3b
    eor      w9, w9, w12
    adrp     x15, #0x540000
    add      x15, x15, #0x5c5
    strb     w9, [x15]
    ldrb     w9, [x11, #1]
    eor      w9, w9, #0xe0
    strb     w9, [x15, #1]
    ldrb     w9, [x11, #2]
    eor      w9, w9, #0x70
    strb     w9, [x15, #2]
    ldrb     w9, [x11, #3]
    mov      w10, #0x7b
    eor      w9, w9, w10
    strb     w9, [x15, #3]
    ldrb     w10, [x11, #4]
    mov      w9, #0xd1
    eor      w10, w10, w9
    strb     w10, [x15, #4]
    ldrb     w10, [x11, #5]
    mov      w13, #0x6c
    eor      w10, w10, w13
    strb     w10, [x15, #5]
    ldrb     w10, [x11, #6]
    eor      w10, w10, #1
    strb     w10, [x15, #6]
    ldrb     w10, [x11, #7]
    mov      w13, #0xb
    eor      w10, w10, w13
    strb     w10, [x15, #7]
    ldrb     w10, [x11, #8]
    eor      w10, w10, #0xffffffdf
    strb     w10, [x15, #8]
    ldrb     w13, [x11, #9]
    mov      w10, #9
    eor      w13, w13, w10
    strb     w13, [x15, #9]
    ldrb     w13, [x11, #0xa]
    mov      w14, #0x5c
    eor      w13, w13, w14
    strb     w13, [x15, #0xa]
    ldrb     w16, [x11, #0xb]
    mov      w13, #0xca
    eor      w16, w16, w13
    strb     w16, [x15, #0xb]
    ldrb     w11, [x11, #0xc]
    mov      w16, #0xa5
    eor      w11, w11, w16
    adrp     x16, #0x540000
    add      x16, x16, #0x596
    strb     w11, [x15, #0xc]
    ldrb     w11, [x16]
    mov      w15, #0x62
    eor      w11, w11, w15
    adrp     x15, #0x540000
    add      x15, x15, #0x5a2
    strb     w11, [x15]
    ldrb     w11, [x16, #1]
    mov      w17, #0xbe
    eor      w11, w11, w17
    strb     w11, [x15, #1]
    ldrb     w11, [x16, #2]
    eor      w11, w11, #0x60
    strb     w11, [x15, #2]
    ldrb     w11, [x16, #3]
    eor      w11, w11, #0x20
    strb     w11, [x15, #3]
    ldrb     w17, [x16, #4]
    mov      w11, #0x63
    eor      w17, w17, w11
    strb     w17, [x15, #4]
    ldrb     w17, [x16, #5]
    eor      w12, w17, w12
    strb     w12, [x15, #5]
    ldrb     w12, [x16, #6]
    mov      w17, #0xda
    eor      w12, w12, w17
    strb     w12, [x15, #6]
    ldrb     w12, [x16, #7]
    mov      w17, #0xd7
    eor      w12, w12, w17
    strb     w12, [x15, #7]
    ldrb     w12, [x16, #8]
    mov      w17, #0x32
    eor      w12, w12, w17
    strb     w12, [x15, #8]
    ldrb     w12, [x16, #9]
    mov      w17, #0x91
    eor      w12, w12, w17
    strb     w12, [x15, #9]
    ldrb     w12, [x16, #0xa]
    eor      w12, w12, #0xfffffff3
    strb     w12, [x15, #0xa]
    ldrb     w12, [x16, #0xb]
    mov      w16, #0xa8
    eor      w12, w12, w16
    adrp     x17, #0x540000
    add      x17, x17, #0x5ae
    strb     w12, [x15, #0xb]
    ldrb     w12, [x17]
    mov      w16, #0xbc
    eor      w12, w12, w16
    adrp     x15, #0x540000
    add      x15, x15, #0x5b3
    strb     w12, [x15]
    ldrb     w12, [x17, #1]
    eor      w12, w12, #0xffffffc3
    strb     w12, [x15, #1]
    ldrb     w12, [x17, #2]
    mov      w0, #0xba
    eor      w12, w12, w0
    strb     w12, [x15, #2]
    ldrb     w12, [x17, #3]
    mov      w0, #0xd0
    eor      w12, w12, w0
    strb     w12, [x15, #3]
    ldrb     w12, [x17, #4]
    mov      w17, #0xa
    eor      w12, w12, w17
    strb     w12, [x15, #4]
    adrp     x0, #0x540000
    add      x0, x0, #0x584
    ldrb     w12, [x0]
    eor      w12, w12, #0x99999999
    adrp     x1, #0x540000
    add      x1, x1, #0x58d
    strb     w12, [x1]
    ldrb     w12, [x0, #1]
    mov      w15, #0x9e
    eor      w12, w12, w15
    strb     w12, [x1, #1]
    ldrb     w12, [x0, #2]
    mov      w15, #0x9b
    eor      w12, w12, w15
    strb     w12, [x1, #2]
    ldrb     w12, [x0, #3]
    mov      w2, #0x43
    eor      w12, w12, w2
    strb     w12, [x1, #3]
    ldrb     w12, [x0, #4]
    mov      w2, #0xa2
    eor      w12, w12, w2
    strb     w12, [x1, #4]
    ldrb     w12, [x0, #5]
    eor      w12, w12, #0xfc
    strb     w12, [x1, #5]
    ldrb     w12, [x0, #6]
    eor      w12, w12, #0xffffffc1
    strb     w12, [x1, #6]
    ldrb     w2, [x0, #7]
    mov      w12, #0xb2
    eor      w2, w2, w12
    strb     w2, [x1, #7]
    ldrb     w0, [x0, #8]
    mov      w2, #0x92
    eor      w0, w0, w2
    adrp     x2, #0x540000
    add      x2, x2, #0x5e4
    strb     w0, [x1, #8]
    ldrb     w0, [x2]
    mov      w1, #0x3a
    eor      w0, w0, w1
    adrp     x1, #0x540000
    add      x1, x1, #0x5e9
    strb     w0, [x1]
    ldrb     w0, [x2, #1]
    eor      w14, w0, w14
    strb     w14, [x1, #1]
    ldrb     w14, [x2, #2]
    mov      w0, #0x50
    eor      w14, w14, w0
    strb     w14, [x1, #2]
    ldrb     w14, [x2, #3]
    mov      w0, #0x59
    eor      w14, w14, w0
    strb     w14, [x1, #3]
    ldrb     w14, [x2, #4]
    eor      w14, w14, #3
    strb     w14, [x1, #4]
    adrp     x14, #0x540000
    add      x14, x14, #0x574
    ldrb     w0, [x14]
    mov      w1, #0x2c
    eor      w0, w0, w1
    adrp     x1, #0x540000
    add      x1, x1, #0x57c
    strb     w0, [x1]
    ldrb     w0, [x14, #1]
    eor      w17, w0, w17
    strb     w17, [x1, #1]
    ldrb     w17, [x14, #2]
    eor      w13, w17, w13
    strb     w13, [x1, #2]
    ldrb     w13, [x14, #3]
    mov      w17, #0xa0
    eor      w13, w13, w17
    strb     w13, [x1, #3]
    ldrb     w13, [x14, #4]
    mov      w17, #0x28
    eor      w13, w13, w17
    strb     w13, [x1, #4]
    ldrb     w13, [x14, #5]
    mvn      w13, w13
    strb     w13, [x1, #5]
    ldrb     w13, [x14, #6]
    eor      w13, w13, w16
    strb     w13, [x1, #6]
    ldrb     w13, [x14, #7]
    mov      w14, #0x23
    eor      w13, w13, w14
    adrp     x14, #0x540000
    add      x14, x14, #0x5ee
    strb     w13, [x1, #7]
    ldrb     w13, [x14]
    eor      w13, w13, #0xfffffff1
    adrp     x16, #0x540000
    add      x16, x16, #0x5f7
    strb     w13, [x16]
    ldrb     w13, [x14, #1]
    eor      w13, w13, #0xeeeeeeee
    strb     w13, [x16, #1]
    ldrb     w13, [x14, #2]
    eor      w13, w13, #3
    strb     w13, [x16, #2]
    ldrb     w13, [x14, #3]
    mov      w17, #0x14
    eor      w13, w13, w17
    strb     w13, [x16, #3]
    ldrb     w13, [x14, #4]
    mov      w17, #0x46
    eor      w13, w13, w17
    strb     w13, [x16, #4]
    ldrb     w13, [x14, #5]
    eor      w11, w13, w11
    strb     w11, [x16, #5]
    ldrb     w11, [x14, #6]
    eor      w11, w11, w15
    strb     w11, [x16, #6]
    ldrb     w11, [x14, #7]
    eor      w11, w11, #3
    strb     w11, [x16, #7]
    ldrb     w11, [x14, #8]
    mov      w13, #0x2f
    eor      w11, w11, w13
    strb     w11, [x16, #8]
    adrp     x11, #0x540000
    add      x11, x11, #0x5d2
    ldrb     w13, [x11]
    eor      w10, w13, w10
    adrp     x13, #0x540000
    add      x13, x13, #0x5db
    strb     w10, [x13]
    ldrb     w10, [x11, #1]
    eor      w9, w10, w9
    strb     w9, [x13, #1]
    ldrb     w9, [x11, #2]
    mov      w10, #0x6f
    eor      w9, w9, w10
    strb     w9, [x13, #2]
    ldrb     w9, [x11, #3]
    mov      w10, #0x4c
    eor      w9, w9, w10
    strb     w9, [x13, #3]
    ldrb     w9, [x11, #4]
    mov      w10, #0x5e
    eor      w9, w9, w10
    strb     w9, [x13, #4]
    ldrb     w9, [x11, #5]
    eor      w9, w9, #0xffffff8f
    strb     w9, [x13, #5]
    ldrb     w9, [x11, #6]
    mov      w10, #0x45
    eor      w9, w9, w10
    strb     w9, [x13, #6]
    ldrb     w9, [x11, #7]
    eor      w9, w9, #0x66666666
    strb     w9, [x13, #7]
    ldrb     w9, [x11, #8]
    mov      w10, #0x76
    eor      w9, w9, w10
    strb     w9, [x13, #8]
    adrp     x9, #0x540000
    add      x9, x9, #0x560
    ldrb     w10, [x9]
    mov      w11, #0x68
    eor      w10, w10, w11
    adrp     x11, #0x540000
    add      x11, x11, #0x56a
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x38
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w13, #0x4e
    eor      w10, w10, w13
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0x40
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w13, #0xb8
    eor      w10, w10, w13
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0xffffffbf
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0x2a
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w12, #0x15
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w9, [x9, #9]
    eor      w9, w9, #0x22222222
    strb     w9, [x11, #9]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x19, sp
    sub      x20, x19, #0x40
    mov      sp, x20
    sub      x21, sp, #0x80
    mov      sp, x21
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xd8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x518]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    movi     v0.16b, #0
    stp      q0, q0, [x19, #-0x40]
    stp      q0, q0, [x19, #-0x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stp      x1, x21, [x29, #-0xf0]
    mov      x2, x20
    mov      x3, x21
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0x68]
    cbz      x0, #0x2e8ac4
    ldr      x8, [x20, #0x10]
    ldr      x8, [x8]
    stur     x8, [x29, #-0xe0]
    adrp     x24, #0x4a6000
    add      x24, x24, #0xd8
    mov      x21, #0
    adrp     x8, #0x4be000
    ldr      x28, [x8, #0x528]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x908]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x4e8]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x548]
    stp      x8, x9, [x29, #-0x78]
    adrp     x8, #0x4c1000
    ldr      x9, [x8, #0x550]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0x808]
    stp      x8, x9, [x29, #-0x88]
    adrp     x8, #0x4c1000
    ldr      x9, [x8, #0x558]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x560]
    stp      x8, x9, [x29, #-0x98]
    adrp     x8, #0x4c1000
    ldr      x9, [x8, #0x568]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x570]
    stp      x8, x9, [x29, #-0xa8]
    adrp     x8, #0x4c1000
    ldr      x9, [x8, #0x578]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x620]
    stp      x8, x9, [x29, #-0xb8]
    adrp     x8, #0x4c1000
    ldr      x9, [x8, #0x580]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x4a0]
    stp      x8, x9, [x29, #-0xc8]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x588]
    stur     x8, [x29, #-0xd0]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x830]
    ldr      x8, [x20, #0x10]
    ldr      x8, [x8]
    ldur     x9, [x29, #-0xe0]
    cmp      x8, x9
    b.eq     #0x2e8808
    mov      x0, x22
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x20, #8]
    ldr      x2, [x8, x21, lsl #3]
    mov      x0, x22
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x530]
    ldur     x1, [x29, #-0x70]
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    mov      x0, x26
    mov      x1, x28
    adrp     x2, #0x540000
    add      x2, x2, #0x820
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x27
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x28
    adrp     x2, #0x540000
    add      x2, x2, #0x7a0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cmp      x0, #0
    csel     x2, x24, x0, eq
    mov      x0, x27
    ldur     x1, [x29, #-0x80]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x28
    adrp     x2, #0x540000
    add      x2, x2, #0x760
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cmp      x0, #0
    csel     x2, x24, x0, eq
    mov      x0, x27
    ldur     x1, [x29, #-0x88]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x28
    adrp     x2, #0x540000
    add      x2, x2, #0x720
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cmp      x0, #0
    csel     x2, x24, x0, eq
    mov      x0, x27
    ldur     x1, [x29, #-0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x28
    adrp     x2, #0x540000
    add      x2, x2, #0x6a0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cmp      x0, #0
    csel     x2, x24, x0, eq
    mov      x0, x27
    ldur     x1, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x28
    adrp     x2, #0x540000
    add      x2, x2, #0x7e0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cmp      x0, #0
    csel     x2, x24, x0, eq
    mov      x0, x27
    ldur     x1, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x28
    adrp     x2, #0x540000
    add      x2, x2, #0x6e0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x27
    ldur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x19, [x8, #0xb8]
    mov      x0, x27
    ldur     x1, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #-0x10]!
    mov      x0, x19
    ldur     x1, [x29, #-0xb8]
    adrp     x2, #0x540000
    add      x2, x2, #0x660
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    add      sp, sp, #0x10
    mov      x19, x0
    mov      x0, x27
    ldur     x1, [x29, #-0xc0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x28
    adrp     x2, #0x540000
    add      x2, x2, #0x620
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0xc8]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    ldur     x1, [x29, #-0xd0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xd8]
    mov      x1, x25
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    add      x21, x21, #1
    ldur     x8, [x29, #-0x68]
    cmp      x8, x21
    b.ne     #0x2e87ec
    mov      x0, x22
    ldp      x1, x3, [x29, #-0xf0]
    mov      x2, x20
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0x68]
    cbnz     x0, #0x2e874c
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xee0]
    adrp     x2, #0x4a4000
    add      x2, x2, #0x3d8
    ldur     x19, [x29, #-0xd8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2e8b24
    mov      x0, x19
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    b        #0x461be8 // _objc_autoreleaseReturnValue
    bl       #0x4618b8 // ___stack_chk_fail

// +[WCLGGlassPackage nameForTheme:] IMP=0x2E8B9C bounds=0x2E8B9C-0x2E8DB4
loc_2E8B9C:
    sub      sp, sp, #0x50
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    adrp     x8, #0x580000
    add      x8, x8, #0x45c
    ldar     w9, [x8]
    cbnz     w9, #0x2e8c90
    adrp     x9, #0x540000
    add      x9, x9, #0x858
    ldrb     w10, [x9]
    eor      w10, w10, #0xaaaaaaaa
    adrp     x11, #0x540000
    add      x11, x11, #0x85d
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x1c
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x74
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x51
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0x8e
    eor      w9, w9, w10
    strb     w9, [x11, #4]
    adrp     x9, #0x540000
    add      x9, x9, #0x840
    ldrh     w10, [x9]
    mov      w11, #0xdfea
    eor      w10, w10, w11
    adrp     x11, #0x540000
    add      x11, x11, #0x84c
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xfa86
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x70e4
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xa0fc
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x7853
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w9, [x9, #0xa]
    mov      w10, #0xff4f
    eor      w9, w9, w10
    strh     w9, [x11, #0xa]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x518]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5b0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x528]
    mov      x0, x21
    mov      x1, x24
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x540000
    add      x2, x2, #0x8d0
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    cbz      x0, #0x2e8d5c
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x19, x21
    b        #0x2e8d88
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    str      x19, [sp]
    adrp     x2, #0x540000
    add      x2, x2, #0x890
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    add      sp, sp, #0x50
    b        #0x461be8 // _objc_autoreleaseReturnValue

// +[WCLGGlassPackage typeForTheme:] IMP=0x2E8DB4 bounds=0x2E8DB4-0x2E8F30
loc_2E8DB4:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x2
    adrp     x8, #0x580000
    add      x8, x8, #0x460
    ldar     w9, [x8]
    cbnz     w9, #0x2e8e38
    adrp     x9, #0x540000
    add      x9, x9, #0x8f0
    ldrb     w10, [x9]
    mov      w11, #0xb1
    eor      w10, w10, w11
    adrp     x11, #0x540000
    add      x11, x11, #0x8f5
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xdc
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x2d
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x7a
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    eor      w9, w9, #0x3e
    strb     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x518]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5b0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x528]
    mov      x0, x20
    mov      x1, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x540000
    add      x2, x2, #0x920
    mov      x0, x23
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4a6000
    add      x8, x8, #0xd8
    cmp      x0, #0
    csel     x20, x8, x0, eq
    mov      x0, x20
    bl       #0x461cc0 // _objc_retainAutoreleaseReturnValue
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    ret      

// +[WCLGGlassPackage activeInstalledThemeIdForType:] IMP=0x2E8F30 bounds=0x2E8F30-0x2E9610
loc_2E8F30:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x580000
    add      x8, x8, #0x464
    ldar     w9, [x8]
    cbnz     w9, #0x2e935c
    adrp     x11, #0x540000
    add      x11, x11, #0x9e5
    ldrb     w10, [x11]
    mov      w9, #0x56
    eor      w10, w10, w9
    adrp     x12, #0x540000
    add      x12, x12, #0x9ec
    strb     w10, [x12]
    ldrb     w10, [x11, #1]
    mov      w13, #0xf2
    eor      w10, w10, w13
    strb     w10, [x12, #1]
    ldrb     w13, [x11, #2]
    mov      w10, #0x59
    eor      w13, w13, w10
    strb     w13, [x12, #2]
    ldrb     w13, [x11, #3]
    mov      w14, #0xab
    eor      w13, w13, w14
    strb     w13, [x12, #3]
    ldrb     w13, [x11, #4]
    mov      w14, #0xd0
    eor      w13, w13, w14
    strb     w13, [x12, #4]
    ldrb     w13, [x11, #5]
    mov      w14, #0x82
    eor      w13, w13, w14
    strb     w13, [x12, #5]
    ldrb     w11, [x11, #6]
    mov      w13, #0xd8
    eor      w11, w11, w13
    strb     w11, [x12, #6]
    adrp     x11, #0x540000
    add      x11, x11, #0x9b0
    ldrb     w12, [x11]
    eor      w13, w12, #0xeeeeeeee
    adrp     x12, #0x540000
    add      x12, x12, #0x9d0
    strb     w13, [x12]
    ldrb     w13, [x11, #1]
    mov      w14, #0xba
    eor      w13, w13, w14
    strb     w13, [x12, #1]
    ldrb     w13, [x11, #2]
    eor      w13, w13, #0x30
    strb     w13, [x12, #2]
    ldrb     w13, [x11, #3]
    mov      w15, #0x8b
    eor      w13, w13, w15
    strb     w13, [x12, #3]
    ldrb     w13, [x11, #4]
    mov      w15, #0xf4
    eor      w13, w13, w15
    strb     w13, [x12, #4]
    ldrb     w13, [x11, #5]
    mov      w15, #0x97
    eor      w13, w13, w15
    strb     w13, [x12, #5]
    ldrb     w13, [x11, #6]
    eor      w13, w13, #0xfffffff9
    strb     w13, [x12, #6]
    ldrb     w13, [x11, #7]
    mov      w16, #0xa3
    eor      w13, w13, w16
    strb     w13, [x12, #7]
    ldrb     w13, [x11, #8]
    mov      w16, #0xa0
    eor      w13, w13, w16
    strb     w13, [x12, #8]
    ldrb     w13, [x11, #9]
    mov      w16, #0x74
    eor      w13, w13, w16
    strb     w13, [x12, #9]
    ldrb     w13, [x11, #0xa]
    eor      w13, w13, w14
    strb     w13, [x12, #0xa]
    ldrb     w13, [x11, #0xb]
    eor      w13, w13, #0x38
    strb     w13, [x12, #0xb]
    ldrb     w13, [x11, #0xc]
    mov      w14, #0x6d
    eor      w13, w13, w14
    strb     w13, [x12, #0xc]
    ldrb     w13, [x11, #0xd]
    mov      w14, #0xac
    eor      w13, w13, w14
    strb     w13, [x12, #0xd]
    ldrb     w13, [x11, #0xe]
    mov      w14, #0xb7
    eor      w13, w13, w14
    strb     w13, [x12, #0xe]
    ldrb     w13, [x11, #0xf]
    mov      w14, #0xf5
    eor      w13, w13, w14
    strb     w13, [x12, #0xf]
    ldrb     w13, [x11, #0x10]
    mov      w14, #0x96
    eor      w13, w13, w14
    strb     w13, [x12, #0x10]
    ldrb     w13, [x11, #0x11]
    eor      w13, w13, #0x7f
    strb     w13, [x12, #0x11]
    ldrb     w13, [x11, #0x12]
    mov      w14, #0x65
    eor      w13, w13, w14
    strb     w13, [x12, #0x12]
    ldrb     w13, [x11, #0x13]
    eor      w13, w13, w15
    strb     w13, [x12, #0x13]
    ldrb     w11, [x11, #0x14]
    mov      w13, #0x12
    eor      w11, w11, w13
    strb     w11, [x12, #0x14]
    adrp     x11, #0x540000
    add      x11, x11, #0x970
    ldrb     w12, [x11]
    mov      w13, #0x21
    eor      w12, w12, w13
    adrp     x13, #0x540000
    add      x13, x13, #0x990
    strb     w12, [x13]
    ldrb     w12, [x11, #1]
    mov      w14, #0xeb
    eor      w12, w12, w14
    strb     w12, [x13, #1]
    ldrb     w12, [x11, #2]
    eor      w12, w12, #0x44444444
    strb     w12, [x13, #2]
    ldrb     w12, [x11, #3]
    eor      w12, w12, #0xfffffff7
    strb     w12, [x13, #3]
    ldrb     w12, [x11, #4]
    eor      w10, w12, w10
    strb     w10, [x13, #4]
    ldrb     w10, [x11, #5]
    mov      w12, #0xd1
    eor      w10, w10, w12
    strb     w10, [x13, #5]
    ldrb     w10, [x11, #6]
    mov      w12, #0xb6
    eor      w10, w10, w12
    strb     w10, [x13, #6]
    ldrb     w10, [x11, #7]
    eor      w9, w10, w9
    strb     w9, [x13, #7]
    ldrb     w9, [x11, #8]
    eor      w9, w9, #0xffffffdf
    strb     w9, [x13, #8]
    ldrb     w9, [x11, #9]
    mov      w10, #0x54
    eor      w9, w9, w10
    strb     w9, [x13, #9]
    ldrb     w9, [x11, #0xa]
    mov      w10, #0x5d
    eor      w9, w9, w10
    strb     w9, [x13, #0xa]
    ldrb     w9, [x11, #0xb]
    eor      w9, w9, #0x80
    strb     w9, [x13, #0xb]
    ldrb     w9, [x11, #0xc]
    mov      w10, #0xb9
    eor      w9, w9, w10
    strb     w9, [x13, #0xc]
    ldrb     w9, [x11, #0xd]
    mov      w10, #0xa1
    eor      w9, w9, w10
    strb     w9, [x13, #0xd]
    ldrb     w9, [x11, #0xe]
    eor      w9, w9, #0xe0
    strb     w9, [x13, #0xe]
    ldrb     w9, [x11, #0xf]
    mov      w10, #0x53
    eor      w9, w9, w10
    strb     w9, [x13, #0xf]
    ldrb     w9, [x11, #0x10]
    eor      w9, w9, #0xfffffff3
    strb     w9, [x13, #0x10]
    adrp     x9, #0x540000
    add      x9, x9, #0x954
    ldrb     w10, [x9]
    mov      w11, #0xe8
    eor      w10, w10, w11
    adrp     x11, #0x540000
    add      x11, x11, #0x95b
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x84
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xfffffff1
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x3b
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x2e
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x5f
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w9, [x9, #6]
    mov      w10, #0x6b
    eor      w9, w9, w10
    strb     w9, [x11, #6]
    adrp     x9, #0x540000
    add      x9, x9, #0x94a
    ldrb     w10, [x9]
    mov      w11, #0xa
    eor      w10, w10, w11
    adrp     x12, #0x540000
    add      x12, x12, #0x94f
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xfc
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    mov      w13, #0xc6
    eor      w10, w10, w13
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    mov      w13, #0x34
    eor      w10, w10, w13
    strb     w10, [x12, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0x2c
    eor      w9, w9, w10
    strb     w9, [x12, #4]
    adrp     x9, #0x540000
    add      x9, x9, #0x940
    ldrb     w10, [x9]
    mov      w12, #0x48
    eor      w10, w10, w12
    adrp     x12, #0x540000
    add      x12, x12, #0x945
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    mov      w13, #0x5c
    eor      w10, w10, w13
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    mov      w13, #0x75
    eor      w10, w10, w13
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, w11
    strb     w10, [x12, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0xe4
    eor      w9, w9, w10
    strb     w9, [x12, #4]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x358]
    adrp     x2, #0x540000
    add      x2, x2, #0xb60
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x2e93a0
    adrp     x2, #0x540000
    add      x2, x2, #0xb20
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e95cc
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x2, #0x540000
    add      x2, x2, #0xb60
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x480]
    cbz      w0, #0x2e94ac
    adrp     x8, #0x4a3000
    add      x8, x8, #0xba0
    ldr      x2, [x8]
    mov      x0, x21
    mov      w3, #0
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e95c4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    adrp     x2, #0x540000
    add      x2, x2, #0xaa0
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e95d4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x818]
    adrp     x2, #0x540000
    add      x2, x2, #0xa60
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e95d4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x548]
    mov      x0, x23
    mov      w2, #6
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4e8]
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    b        #0x2e94e8
    adrp     x8, #0x4a3000
    add      x8, x8, #0xe78
    ldr      x2, [x8]
    mov      x0, x21
    mov      w3, #0
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2e95c4
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x758]
    adrp     x2, #0x540000
    add      x2, x2, #0xae0
    mov      x0, x21
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    cmp      x24, #1
    b.lt     #0x2e95c4
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x518]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f0]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5b0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x528]
    mov      x0, x20
    mov      x1, x27
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x540000
    add      x2, x2, #0xa20
    mov      x0, x23
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x1, x22
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    csel     x20, x24, xzr, ne
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    b        #0x2e95d8
    mov      x20, #0
    b        #0x2e95e0
    mov      x20, #0
    b        #0x2e95e8
    mov      x20, #0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      

// +[WCLGGlassPackage applyInstalled:] IMP=0x2E9610 bounds=0x2E9610-0x2EA4FC
loc_2E9610:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x10
    mov      x19, x2
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x580000
    add      x8, x8, #0x468
    ldar     w9, [x8]
    cbnz     w9, #0x2ea15c
    adrp     x9, #0x540000
    add      x9, x9, #0xd2e
    ldrb     w10, [x9]
    mov      w11, #0xd1
    eor      w10, w10, w11
    adrp     x11, #0x540000
    add      x11, x11, #0xd33
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xfc
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0x38
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #1
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0x5b
    eor      w9, w9, w10
    adrp     x10, #0x540000
    add      x10, x10, #0xcd5
    strb     w9, [x11, #4]
    ldrb     w9, [x10]
    mov      w11, #0x8a
    eor      w9, w9, w11
    adrp     x11, #0x540000
    add      x11, x11, #0xcdc
    strb     w9, [x11]
    ldrb     w9, [x10, #1]
    mov      w12, #0xe6
    eor      w9, w9, w12
    strb     w9, [x11, #1]
    ldrb     w9, [x10, #2]
    mov      w12, #0x98
    eor      w9, w9, w12
    strb     w9, [x11, #2]
    ldrb     w9, [x10, #3]
    mov      w12, #0x6e
    eor      w9, w9, w12
    strb     w9, [x11, #3]
    ldrb     w9, [x10, #4]
    eor      w9, w9, #0xcccccccc
    strb     w9, [x11, #4]
    ldrb     w9, [x10, #5]
    mov      w12, #0x57
    eor      w9, w9, w12
    strb     w9, [x11, #5]
    ldrb     w9, [x10, #6]
    mov      w16, #0x67
    eor      w9, w9, w16
    strb     w9, [x11, #6]
    adrp     x10, #0x540000
    add      x10, x10, #0xc50
    ldrb     w9, [x10]
    mov      w11, #0x32
    adrp     x12, #0x540000
    add      x12, x12, #0xc70
    eor      w9, w9, w11
    strb     w9, [x12]
    ldrb     w9, [x10, #1]
    mov      w11, #0xda
    eor      w9, w9, w11
    strb     w9, [x12, #1]
    ldrb     w9, [x10, #2]
    mov      w13, #0xba
    eor      w9, w9, w13
    strb     w9, [x12, #2]
    ldrb     w9, [x10, #3]
    mov      w14, #0xc6
    eor      w9, w9, w14
    strb     w9, [x12, #3]
    ldrb     w9, [x10, #4]
    mov      w11, #0xca
    eor      w9, w9, w11
    strb     w9, [x12, #4]
    ldrb     w9, [x10, #5]
    eor      w9, w9, #0x33333333
    strb     w9, [x12, #5]
    ldrb     w9, [x10, #6]
    eor      w9, w9, #0x78
    strb     w9, [x12, #6]
    ldrb     w9, [x10, #7]
    eor      w9, w9, #0xe
    strb     w9, [x12, #7]
    ldrb     w9, [x10, #8]
    mov      w15, #0xf6
    eor      w9, w9, w15
    strb     w9, [x12, #8]
    ldrb     w9, [x10, #9]
    mov      w11, #0xf2
    eor      w9, w9, w11
    strb     w9, [x12, #9]
    ldrb     w9, [x10, #0xa]
    mvn      w9, w9
    strb     w9, [x12, #0xa]
    ldrb     w9, [x10, #0xb]
    mov      w11, #0x92
    eor      w9, w9, w11
    strb     w9, [x12, #0xb]
    ldrb     w9, [x10, #0xc]
    mov      w1, #0x3b
    eor      w9, w9, w1
    strb     w9, [x12, #0xc]
    ldrb     w9, [x10, #0xd]
    eor      w9, w9, w15
    strb     w9, [x12, #0xd]
    ldrb     w9, [x10, #0xe]
    eor      w9, w9, #0x22222222
    strb     w9, [x12, #0xe]
    ldrb     w9, [x10, #0xf]
    mov      w15, #0xa0
    eor      w9, w9, w15
    strb     w9, [x12, #0xf]
    ldrb     w9, [x10, #0x10]
    mov      w17, #0x58
    eor      w9, w9, w17
    strb     w9, [x12, #0x10]
    ldrb     w9, [x10, #0x11]
    mov      w15, #0xa3
    eor      w9, w9, w15
    strb     w9, [x12, #0x11]
    ldrb     w9, [x10, #0x12]
    eor      w9, w9, w13
    strb     w9, [x12, #0x12]
    ldrb     w13, [x10, #0x13]
    mov      w9, #0x86
    eor      w13, w13, w9
    strb     w13, [x12, #0x13]
    ldrb     w13, [x10, #0x14]
    eor      w13, w13, #4
    strb     w13, [x12, #0x14]
    ldrb     w13, [x10, #0x15]
    mov      w15, #0x2e
    eor      w13, w13, w15
    strb     w13, [x12, #0x15]
    ldrb     w13, [x10, #0x16]
    mov      w15, #0x97
    eor      w13, w13, w15
    strb     w13, [x12, #0x16]
    ldrb     w13, [x10, #0x17]
    mov      w15, #0x6b
    eor      w13, w13, w15
    strb     w13, [x12, #0x17]
    ldrb     w13, [x10, #0x18]
    eor      w13, w13, #0x22222222
    strb     w13, [x12, #0x18]
    ldrb     w13, [x10, #0x19]
    eor      w13, w13, #7
    strb     w13, [x12, #0x19]
    ldrb     w13, [x10, #0x1a]
    mov      w15, #0x73
    eor      w13, w13, w15
    strb     w13, [x12, #0x1a]
    ldrb     w13, [x10, #0x1b]
    eor      w13, w13, #0xffffffdf
    strb     w13, [x12, #0x1b]
    ldrb     w10, [x10, #0x1c]
    eor      w10, w10, #7
    strb     w10, [x12, #0x1c]
    adrp     x3, #0x540000
    add      x3, x3, #0xc10
    ldrb     w10, [x3]
    mov      w12, #0x5f
    adrp     x4, #0x540000
    add      x4, x4, #0xc30
    eor      w10, w10, w12
    strb     w10, [x4]
    ldrb     w10, [x3, #1]
    mov      w12, #0xdc
    eor      w10, w10, w12
    strb     w10, [x4, #1]
    ldrb     w10, [x3, #2]
    mov      w15, #0xbc
    eor      w10, w10, w15
    strb     w10, [x4, #2]
    ldrb     w10, [x3, #3]
    mov      w5, #0x52
    eor      w10, w10, w5
    strb     w10, [x4, #3]
    ldrb     w10, [x3, #4]
    eor      w10, w10, #0xeeeeeeee
    strb     w10, [x4, #4]
    ldrb     w10, [x3, #5]
    mov      w2, #0x7a
    eor      w10, w10, w2
    strb     w10, [x4, #5]
    ldrb     w10, [x3, #6]
    mov      w12, #0x4d
    eor      w10, w10, w12
    strb     w10, [x4, #6]
    ldrb     w10, [x3, #7]
    eor      w10, w10, #0x7f
    strb     w10, [x4, #7]
    ldrb     w10, [x3, #8]
    mov      w12, #0xf4
    eor      w10, w10, w12
    strb     w10, [x4, #8]
    ldrb     w10, [x3, #9]
    mov      w6, #0xde
    eor      w10, w10, w6
    strb     w10, [x4, #9]
    ldrb     w10, [x3, #0xa]
    mov      w12, #0xbd
    eor      w10, w10, w12
    strb     w10, [x4, #0xa]
    ldrb     w10, [x3, #0xb]
    mov      w13, #0xad
    eor      w10, w10, w13
    strb     w10, [x4, #0xb]
    ldrb     w10, [x3, #0xc]
    mov      w7, #0x2b
    eor      w10, w10, w7
    strb     w10, [x4, #0xc]
    ldrb     w10, [x3, #0xd]
    mov      w7, #0x94
    eor      w10, w10, w7
    strb     w10, [x4, #0xd]
    ldrb     w10, [x3, #0xe]
    mov      w7, #0xb6
    eor      w10, w10, w7
    strb     w10, [x4, #0xe]
    ldrb     w10, [x3, #0xf]
    eor      w10, w10, #2
    strb     w10, [x4, #0xf]
    ldrb     w10, [x3, #0x10]
    eor      w10, w10, w6
    strb     w10, [x4, #0x10]
    ldrb     w6, [x3, #0x11]
    mov      w10, #0xcd
    eor      w6, w6, w10
    strb     w6, [x4, #0x11]
    ldrb     w6, [x3, #0x12]
    eor      w17, w6, w17
    strb     w17, [x4, #0x12]
    ldrb     w6, [x3, #0x13]
    mov      w17, #0x9c
    eor      w6, w6, w17
    strb     w6, [x4, #0x13]
    ldrb     w6, [x3, #0x14]
    eor      w1, w6, w1
    strb     w1, [x4, #0x14]
    ldrb     w1, [x3, #0x15]
    mov      w6, #0x2a
    eor      w1, w1, w6
    strb     w1, [x4, #0x15]
    ldrb     w1, [x3, #0x16]
    eor      w1, w1, w15
    strb     w1, [x4, #0x16]
    ldrb     w1, [x3, #0x17]
    eor      w1, w1, #0xf0
    strb     w1, [x4, #0x17]
    ldrb     w1, [x3, #0x18]
    eor      w1, w1, #0xeeeeeeee
    strb     w1, [x4, #0x18]
    ldrb     w1, [x3, #0x19]
    mov      w6, #0xd0
    eor      w1, w1, w6
    strb     w1, [x4, #0x19]
    ldrb     w1, [x3, #0x1a]
    mov      w6, #0x19
    eor      w1, w1, w6
    strb     w1, [x4, #0x1a]
    ldrb     w1, [x3, #0x1b]
    eor      w1, w1, w5
    strb     w1, [x4, #0x1b]
    ldrb     w1, [x3, #0x1c]
    eor      w16, w1, w16
    strb     w16, [x4, #0x1c]
    ldrb     w16, [x3, #0x1d]
    mov      w1, #0xd9
    eor      w16, w16, w1
    strb     w16, [x4, #0x1d]
    ldrb     w16, [x3, #0x1e]
    mov      w5, #0x27
    eor      w16, w16, w5
    strb     w16, [x4, #0x1e]
    ldrb     w16, [x3, #0x1f]
    eor      w16, w16, #0xfffffffb
    strb     w16, [x4, #0x1f]
    adrp     x16, #0x540000
    add      x16, x16, #0xcc1
    ldrb     w3, [x16]
    eor      w3, w3, #0x88888888
    adrp     x4, #0x540000
    add      x4, x4, #0xccb
    strb     w3, [x4]
    ldrb     w3, [x16, #1]
    mov      w5, #0xb0
    eor      w3, w3, w5
    strb     w3, [x4, #1]
    ldrb     w3, [x16, #2]
    mvn      w3, w3
    strb     w3, [x4, #2]
    ldrb     w3, [x16, #3]
    eor      w1, w3, w1
    strb     w1, [x4, #3]
    ldrb     w1, [x16, #4]
    mov      w3, #0x13
    eor      w1, w1, w3
    strb     w1, [x4, #4]
    ldrb     w1, [x16, #5]
    mov      w3, #0xa7
    eor      w1, w1, w3
    strb     w1, [x4, #5]
    ldrb     w1, [x16, #6]
    eor      w1, w1, #8
    strb     w1, [x4, #6]
    ldrb     w1, [x16, #7]
    mov      w3, #0x36
    eor      w1, w1, w3
    strb     w1, [x4, #7]
    ldrb     w1, [x16, #8]
    mov      w3, #0xaf
    eor      w1, w1, w3
    strb     w1, [x4, #8]
    ldrb     w16, [x16, #9]
    mov      w1, #0x3a
    eor      w16, w16, w1
    strb     w16, [x4, #9]
    adrp     x16, #0x540000
    add      x16, x16, #0xc90
    ldrb     w3, [x16]
    mov      w1, #0x62
    eor      w3, w3, w1
    adrp     x4, #0x540000
    add      x4, x4, #0xcb0
    strb     w3, [x4]
    ldrb     w3, [x16, #1]
    mov      w5, #0x6d
    eor      w3, w3, w5
    strb     w3, [x4, #1]
    ldrb     w3, [x16, #2]
    eor      w3, w3, #0xaaaaaaaa
    strb     w3, [x4, #2]
    ldrb     w3, [x16, #3]
    eor      w2, w3, w2
    strb     w2, [x4, #3]
    ldrb     w2, [x16, #4]
    eor      w2, w2, #0x1e
    strb     w2, [x4, #4]
    ldrb     w2, [x16, #5]
    mov      w3, #0x2f
    eor      w2, w2, w3
    strb     w2, [x4, #5]
    ldrb     w2, [x16, #6]
    mov      w3, #0x4e
    eor      w2, w2, w3
    strb     w2, [x4, #6]
    ldrb     w2, [x16, #7]
    mov      w3, #0x3d
    eor      w2, w2, w3
    strb     w2, [x4, #7]
    ldrb     w2, [x16, #8]
    eor      w2, w2, #0xfffffff3
    strb     w2, [x4, #8]
    ldrb     w2, [x16, #9]
    eor      w14, w2, w14
    strb     w14, [x4, #9]
    ldrb     w14, [x16, #0xa]
    eor      w14, w14, w13
    strb     w14, [x4, #0xa]
    ldrb     w14, [x16, #0xb]
    eor      w14, w14, #0x7f
    strb     w14, [x4, #0xb]
    ldrb     w2, [x16, #0xc]
    mov      w14, #0xb
    eor      w2, w2, w14
    strb     w2, [x4, #0xc]
    ldrb     w3, [x16, #0xd]
    mov      w2, #0x42
    eor      w3, w3, w2
    strb     w3, [x4, #0xd]
    ldrb     w3, [x16, #0xe]
    eor      w3, w3, #0xaaaaaaaa
    strb     w3, [x4, #0xe]
    ldrb     w3, [x16, #0xf]
    eor      w3, w3, #0xffffff8f
    strb     w3, [x4, #0xf]
    ldrb     w16, [x16, #0x10]
    mov      w3, #0x71
    eor      w16, w16, w3
    strb     w16, [x4, #0x10]
    adrp     x4, #0x540000
    add      x4, x4, #0xbd0
    ldrb     w16, [x4]
    adrp     x5, #0x540000
    add      x5, x5, #0xbf0
    eor      w16, w16, #0x30
    strb     w16, [x5]
    ldrb     w16, [x4, #1]
    mov      w3, #0xdb
    eor      w16, w16, w3
    strb     w16, [x5, #1]
    ldrb     w16, [x4, #2]
    eor      w16, w16, #0x77777777
    strb     w16, [x5, #2]
    ldrb     w16, [x4, #3]
    mov      w3, #0xe8
    eor      w16, w16, w3
    strb     w16, [x5, #3]
    ldrb     w16, [x4, #4]
    mov      w3, #0x9b
    eor      w16, w16, w3
    strb     w16, [x5, #4]
    ldrb     w16, [x4, #5]
    mov      w3, #0xae
    eor      w16, w16, w3
    strb     w16, [x5, #5]
    ldrb     w16, [x4, #6]
    mov      w3, #0xc8
    eor      w16, w16, w3
    strb     w16, [x5, #6]
    ldrb     w16, [x4, #7]
    mov      w6, #0xb1
    eor      w16, w16, w6
    strb     w16, [x5, #7]
    ldrb     w16, [x4, #8]
    mov      w3, #0xab
    eor      w16, w16, w3
    strb     w16, [x5, #8]
    ldrb     w16, [x4, #9]
    eor      w16, w16, #0x3e
    strb     w16, [x5, #9]
    ldrb     w16, [x4, #0xa]
    eor      w16, w16, #4
    strb     w16, [x5, #0xa]
    ldrb     w3, [x4, #0xb]
    mov      w16, #0x72
    eor      w3, w3, w16
    strb     w3, [x5, #0xb]
    ldrb     w3, [x4, #0xc]
    eor      w17, w3, w17
    strb     w17, [x5, #0xc]
    ldrb     w17, [x4, #0xd]
    eor      w15, w17, w15
    strb     w15, [x5, #0xd]
    ldrb     w15, [x4, #0xe]
    mov      w17, #0x1a
    eor      w15, w15, w17
    strb     w15, [x5, #0xe]
    ldrb     w15, [x4, #0xf]
    eor      w15, w15, #0x20
    strb     w15, [x5, #0xf]
    ldrb     w15, [x4, #0x10]
    eor      w15, w15, #0xffffffcf
    strb     w15, [x5, #0x10]
    ldrb     w15, [x4, #0x11]
    mov      w17, #0x6a
    eor      w15, w15, w17
    strb     w15, [x5, #0x11]
    ldrb     w15, [x4, #0x12]
    mov      w17, #0xe2
    eor      w15, w15, w17
    strb     w15, [x5, #0x12]
    ldrb     w15, [x4, #0x13]
    mov      w3, #0x4a
    eor      w15, w15, w3
    strb     w15, [x5, #0x13]
    ldrb     w15, [x4, #0x14]
    mov      w3, #0xd
    eor      w15, w15, w3
    strb     w15, [x5, #0x14]
    ldrb     w15, [x4, #0x15]
    mov      w3, #0x47
    eor      w15, w15, w3
    strb     w15, [x5, #0x15]
    ldrb     w3, [x4, #0x16]
    mov      w15, #0xa
    eor      w3, w3, w15
    strb     w3, [x5, #0x16]
    ldrb     w3, [x4, #0x17]
    eor      w3, w3, w16
    strb     w3, [x5, #0x17]
    ldrb     w3, [x4, #0x18]
    eor      w3, w3, #7
    strb     w3, [x5, #0x18]
    ldrb     w3, [x4, #0x19]
    eor      w3, w3, #0xe0
    strb     w3, [x5, #0x19]
    ldrb     w3, [x4, #0x1a]
    eor      w3, w3, #0xfffffffb
    strb     w3, [x5, #0x1a]
    ldrb     w3, [x4, #0x1b]
    eor      w3, w3, #0xffffffef
    strb     w3, [x5, #0x1b]
    ldrb     w7, [x4, #0x1c]
    mov      w3, #0x89
    eor      w7, w7, w3
    strb     w7, [x5, #0x1c]
    ldrb     w7, [x4, #0x1d]
    mov      w20, #0x8b
    eor      w7, w7, w20
    strb     w7, [x5, #0x1d]
    ldrb     w4, [x4, #0x1e]
    mov      w7, #0x25
    eor      w4, w4, w7
    strb     w4, [x5, #0x1e]
    adrp     x4, #0x540000
    add      x4, x4, #0xb90
    ldrb     w5, [x4]
    mov      w7, #0x65
    eor      w7, w5, w7
    adrp     x5, #0x540000
    add      x5, x5, #0xbb0
    strb     w7, [x5]
    ldrb     w7, [x4, #1]
    eor      w6, w7, w6
    strb     w6, [x5, #1]
    ldrb     w6, [x4, #2]
    eor      w6, w6, #0xffffffc1
    strb     w6, [x5, #2]
    ldrb     w6, [x4, #3]
    eor      w2, w6, w2
    strb     w2, [x5, #3]
    ldrb     w2, [x4, #4]
    eor      w1, w2, w1
    strb     w1, [x5, #4]
    ldrb     w1, [x4, #5]
    mov      w2, #0xb8
    eor      w1, w1, w2
    strb     w1, [x5, #5]
    ldrb     w1, [x4, #6]
    eor      w1, w1, #0xf0
    strb     w1, [x5, #6]
    ldrb     w1, [x4, #7]
    eor      w11, w1, w11
    strb     w11, [x5, #7]
    ldrb     w11, [x4, #8]
    eor      w11, w11, w10
    strb     w11, [x5, #8]
    ldrb     w11, [x4, #9]
    mov      w1, #0x14
    eor      w11, w11, w1
    strb     w11, [x5, #9]
    ldrb     w11, [x4, #0xa]
    mov      w1, #0x8c
    eor      w11, w11, w1
    strb     w11, [x5, #0xa]
    ldrb     w11, [x4, #0xb]
    eor      w11, w11, w15
    strb     w11, [x5, #0xb]
    ldrb     w11, [x4, #0xc]
    mov      w1, #0x4c
    eor      w11, w11, w1
    strb     w11, [x5, #0xc]
    ldrb     w11, [x4, #0xd]
    eor      w11, w11, #0x44444444
    strb     w11, [x5, #0xd]
    ldrb     w11, [x4, #0xe]
    mov      w1, #0x31
    eor      w11, w11, w1
    strb     w11, [x5, #0xe]
    ldrb     w11, [x4, #0xf]
    mov      w1, #0x12
    eor      w11, w11, w1
    strb     w11, [x5, #0xf]
    ldrb     w11, [x4, #0x10]
    mov      w1, #0xeb
    eor      w11, w11, w1
    strb     w11, [x5, #0x10]
    ldrb     w11, [x4, #0x11]
    mov      w1, #0x64
    eor      w11, w11, w1
    strb     w11, [x5, #0x11]
    ldrb     w11, [x4, #0x12]
    mov      w1, #0xc5
    eor      w11, w11, w1
    strb     w11, [x5, #0x12]
    ldrb     w11, [x4, #0x13]
    eor      w11, w11, w13
    strb     w11, [x5, #0x13]
    ldrb     w11, [x4, #0x14]
    eor      w11, w11, #0x3e
    strb     w11, [x5, #0x14]
    adrp     x11, #0x540000
    add      x11, x11, #0xcf0
    ldrb     w1, [x11]
    adrp     x13, #0x540000
    add      x13, x13, #0xd10
    eor      w1, w1, #0x1c
    strb     w1, [x13]
    ldrb     w1, [x11, #1]
    mov      w2, #0x4f
    eor      w1, w1, w2
    strb     w1, [x13, #1]
    ldrb     w1, [x11, #2]
    mov      w2, #0x1b
    eor      w1, w1, w2
    strb     w1, [x13, #2]
    ldrb     w1, [x11, #3]
    eor      w12, w1, w12
    strb     w12, [x13, #3]
    ldrb     w12, [x11, #4]
    eor      w12, w12, w17
    strb     w12, [x13, #4]
    ldrb     w12, [x11, #5]
    eor      w9, w12, w9
    strb     w9, [x13, #5]
    ldrb     w9, [x11, #6]
    mov      w12, #0x29
    eor      w9, w9, w12
    strb     w9, [x13, #6]
    ldrb     w9, [x11, #7]
    mov      w12, #0x5c
    eor      w9, w9, w12
    strb     w9, [x13, #7]
    ldrb     w9, [x11, #8]
    mov      w12, #0x37
    eor      w9, w9, w12
    strb     w9, [x13, #8]
    ldrb     w9, [x11, #9]
    eor      w9, w9, #0xf8
    strb     w9, [x13, #9]
    ldrb     w9, [x11, #0xa]
    eor      w9, w9, w3
    strb     w9, [x13, #0xa]
    ldrb     w9, [x11, #0xb]
    mov      w12, #0x43
    eor      w9, w9, w12
    strb     w9, [x13, #0xb]
    ldrb     w9, [x11, #0xc]
    mov      w12, #0xc4
    eor      w9, w9, w12
    strb     w9, [x13, #0xc]
    ldrb     w9, [x11, #0xd]
    mov      w12, #0xa1
    eor      w9, w9, w12
    strb     w9, [x13, #0xd]
    ldrb     w9, [x11, #0xe]
    mov      w12, #0xce
    eor      w9, w9, w12
    strb     w9, [x13, #0xe]
    ldrb     w9, [x11, #0xf]
    mov      w12, #0xcb
    eor      w9, w9, w12
    strb     w9, [x13, #0xf]
    ldrb     w9, [x11, #0x10]
    eor      w9, w9, #0x3c
    strb     w9, [x13, #0x10]
    ldrb     w9, [x11, #0x11]
    eor      w9, w9, w15
    strb     w9, [x13, #0x11]
    ldrb     w9, [x11, #0x12]
    eor      w9, w9, #0xf
    strb     w9, [x13, #0x12]
    ldrb     w9, [x11, #0x13]
    mov      w12, #0xac
    eor      w9, w9, w12
    strb     w9, [x13, #0x13]
    ldrb     w9, [x11, #0x14]
    eor      w9, w9, w16
    strb     w9, [x13, #0x14]
    ldrb     w9, [x11, #0x15]
    mov      w12, #0xb5
    eor      w9, w9, w12
    strb     w9, [x13, #0x15]
    ldrb     w9, [x11, #0x16]
    mov      w12, #0xa5
    eor      w9, w9, w12
    strb     w9, [x13, #0x16]
    ldrb     w9, [x11, #0x17]
    mov      w12, #0x82
    eor      w9, w9, w12
    strb     w9, [x13, #0x17]
    ldrb     w9, [x11, #0x18]
    eor      w9, w9, #6
    strb     w9, [x13, #0x18]
    ldrb     w9, [x11, #0x19]
    eor      w9, w9, #0xfffffff3
    strb     w9, [x13, #0x19]
    ldrb     w9, [x11, #0x1a]
    eor      w9, w9, w14
    strb     w9, [x13, #0x1a]
    ldrb     w9, [x11, #0x1b]
    eor      w9, w9, #0xf8
    strb     w9, [x13, #0x1b]
    ldrb     w9, [x11, #0x1c]
    eor      w9, w9, #0xe
    strb     w9, [x13, #0x1c]
    ldrb     w9, [x11, #0x1d]
    mov      w11, #0x5e
    eor      w9, w9, w11
    strb     w9, [x13, #0x1d]
    adrp     x9, #0x540000
    add      x9, x9, #0xb80
    ldrb     w11, [x9]
    mov      w12, #0x48
    eor      w11, w11, w12
    adrp     x12, #0x540000
    add      x12, x12, #0xb85
    strb     w11, [x12]
    ldrb     w11, [x9, #1]
    eor      w11, w11, #0xffffffc1
    strb     w11, [x12, #1]
    ldrb     w11, [x9, #2]
    eor      w10, w11, w10
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    mov      w11, #0x2c
    eor      w10, w10, w11
    strb     w10, [x12, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0x75
    eor      w9, w9, w10
    strb     w9, [x12, #4]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x22, sp, #0x40
    mov      sp, x22
    sub      x23, sp, #0x80
    mov      sp, x23
    sub      x24, sp, #0x20
    mov      sp, x24
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x518]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5b0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x528]
    mov      x0, x21
    mov      x1, x25
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cbz      x20, #0x2ea3fc
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x2, #0x540000
    add      x2, x2, #0xfa0
    mov      x0, x20
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x358]
    adrp     x2, #0x540000
    add      x2, x2, #0xee0
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    cbz      w28, #0x2ea404
    stur     x20, [x29, #-0x60]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    str      x19, [sp, #-0x10]!
    adrp     x2, #0x540000
    add      x2, x2, #0xea0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    add      sp, sp, #0x10
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x19, [x8, #0x9e8]
    adrp     x3, #0x540000
    add      x3, x3, #0xf60
    mov      x0, x21
    mov      x1, x19
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    stp      q0, q0, [x22, #0x20]
    stp      q0, q0, [x22]
    adrp     x8, #0x540000
    add      x8, x8, #0xe60
    adrp     x9, #0x540000
    add      x9, x9, #0xde0
    stp      x8, x9, [x24]
    adrp     x8, #0x540000
    add      x8, x8, #0xf20
    adrp     x9, #0x540000
    add      x9, x9, #0xd60
    stp      x8, x9, [x24, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    mov      x2, x24
    mov      w3, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x478]
    mov      x1, x25
    mov      x2, x22
    mov      x3, x23
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2ea3c4
    mov      x27, x0
    ldr      x8, [x22, #0x10]
    ldr      x28, [x8]
    adrp     x26, #0x4a6000
    add      x26, x26, #0xd8
    mov      x20, #0
    ldr      x8, [x22, #0x10]
    ldr      x8, [x8]
    cmp      x8, x28
    b.eq     #0x2ea380
    mov      x0, x24
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x22, #8]
    ldr      x3, [x8, x20, lsl #3]
    mov      x0, x21
    mov      x1, x19
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    add      x20, x20, #1
    cmp      x27, x20
    b.ne     #0x2ea368
    mov      x0, x24
    mov      x1, x25
    mov      x2, x22
    mov      x3, x23
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    cbnz     x0, #0x2ea364
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a3000
    add      x8, x8, #0xba0
    ldr      x3, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x350]
    mov      w19, #1
    mov      x0, x21
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    bl       #0x197d8
    ldur     x20, [x29, #-0x60]
    b        #0x2ea4ac
    mov      w19, #0
    b        #0x2ea4b4
    adrp     x2, #0x540000
    add      x2, x2, #0xfa0
    mov      x0, x20
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x2, #0x540000
    add      x2, x2, #0xda0
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    cbz      w23, #0x2ea4a8
    adrp     x8, #0x4a3000
    add      x8, x8, #0xe80
    ldr      x3, [x8]
    adrp     x8, #0x4bf000
    ldr      x22, [x8, #0x908]
    mov      x0, x21
    mov      x1, x22
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x3, #0x540000
    add      x3, x3, #0xe20
    mov      x0, x21
    mov      x1, x22
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4a3000
    add      x8, x8, #0xe78
    ldr      x3, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x350]
    mov      w19, #1
    mov      x0, x21
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    b        #0x2ea4ac
    mov      w19, #0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2ea4f8
    mov      x0, x19
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// +[WCLGGlassPackage deactivateInstalledThemeForType:] IMP=0x2EA4FC bounds=0x2EA4FC-0x2EA7D0
loc_2EA4FC:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    adrp     x8, #0x580000
    add      x8, x8, #0x46c
    ldar     w9, [x8]
    cbnz     w9, #0x2ea6ec
    adrp     x9, #0x541000
    add      x9, x9, #1
    ldrb     w10, [x9]
    mov      w11, #0xce
    eor      w10, w10, w11
    adrp     x12, #0x541000
    add      x12, x12, #8
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    mov      w13, #0x67
    eor      w10, w10, w13
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    mov      w13, #0x4a
    eor      w10, w10, w13
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    mov      w13, #0x41
    eor      w10, w10, w13
    strb     w10, [x12, #3]
    ldrb     w10, [x9, #4]
    mov      w13, #0x8c
    eor      w10, w10, w13
    strb     w10, [x12, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0xffffffe1
    strb     w10, [x12, #5]
    ldrb     w9, [x9, #6]
    eor      w10, w9, #0xffffffbf
    adrp     x9, #0x540000
    add      x9, x9, #0xfd0
    strb     w10, [x12, #6]
    ldrb     w10, [x9]
    eor      w10, w10, #0xc0
    adrp     x12, #0x540000
    add      x12, x12, #0xff0
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    mov      w13, #0xd0
    eor      w10, w10, w13
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0x88888888
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, w11
    strb     w10, [x12, #3]
    ldrb     w10, [x9, #4]
    mov      w11, #0x9c
    eor      w10, w10, w11
    strb     w10, [x12, #4]
    ldrb     w10, [x9, #5]
    mov      w11, #0x61
    eor      w10, w10, w11
    strb     w10, [x12, #5]
    ldrb     w10, [x9, #6]
    mov      w11, #0x3d
    eor      w10, w10, w11
    strb     w10, [x12, #6]
    ldrb     w10, [x9, #7]
    mov      w11, #0x64
    eor      w10, w10, w11
    strb     w10, [x12, #7]
    ldrb     w10, [x9, #8]
    mov      w11, #0x46
    eor      w10, w10, w11
    strb     w10, [x12, #8]
    ldrb     w10, [x9, #9]
    mov      w11, #0xac
    eor      w10, w10, w11
    strb     w10, [x12, #9]
    ldrb     w10, [x9, #0xa]
    mov      w11, #0x37
    eor      w10, w10, w11
    strb     w10, [x12, #0xa]
    ldrb     w10, [x9, #0xb]
    eor      w10, w10, #0xffffffe7
    strb     w10, [x12, #0xb]
    ldrb     w10, [x9, #0xc]
    mov      w11, #0x50
    eor      w10, w10, w11
    strb     w10, [x12, #0xc]
    ldrb     w10, [x9, #0xd]
    eor      w10, w10, #0x1e
    strb     w10, [x12, #0xd]
    ldrb     w10, [x9, #0xe]
    eor      w10, w10, #0xffffffdf
    strb     w10, [x12, #0xe]
    ldrb     w10, [x9, #0xf]
    mov      w11, #0x2d
    eor      w10, w10, w11
    strb     w10, [x12, #0xf]
    ldrb     w9, [x9, #0x10]
    strb     w9, [x12, #0x10]
    adrp     x9, #0x540000
    add      x9, x9, #0xfc0
    ldrb     w10, [x9]
    mov      w11, #0xba
    eor      w10, w10, w11
    adrp     x11, #0x540000
    add      x11, x11, #0xfc5
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xc5
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xffffff9f
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0x88888888
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    eor      w9, w9, #0xbbbbbbbb
    strb     w9, [x11, #4]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x358]
    adrp     x2, #0x541000
    add      x2, x2, #0xb0
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2ea784
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    adrp     x2, #0x4a6000
    add      x2, x2, #0xd8
    adrp     x3, #0x541000
    add      x3, x3, #0x70
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4a3000
    add      x8, x8, #0xba0
    ldr      x3, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x350]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    bl       #0x197d8
    b        #0x2ea7a0
    adrp     x2, #0x541000
    add      x2, x2, #0x30
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2ea7a8
    bl       #0x2ea7d0
    mov      w21, #1
    b        #0x2ea7ac
    mov      w21, #0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    ret      

// +[WCLGGlassPackage removeInstalled:] IMP=0x2EA9F8 bounds=0x2EA9F8-0x2EB1BC
loc_2EA9F8:
    sub      sp, sp, #0x70
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x20, x2
    mov      x19, x0
    adrp     x8, #0x580000
    add      x8, x8, #0x474
    ldar     w9, [x8]
    cbnz     w9, #0x2eae48
    adrp     x9, #0x541000
    add      x9, x9, #0x1f3
    ldrb     w10, [x9]
    eor      w10, w10, #0xc
    adrp     x11, #0x541000
    add      x11, x11, #0x1f8
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x47
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x13
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0xeb
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    eor      w9, w9, #0xffffff8f
    strb     w9, [x11, #4]
    adrp     x9, #0x541000
    add      x9, x9, #0x150
    ldrb     w10, [x9]
    eor      w10, w10, #4
    adrp     x11, #0x541000
    add      x11, x11, #0x155
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xffffff83
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xc4
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0xe4
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w9, #0xda
    eor      w10, w10, w9
    strb     w10, [x11, #4]
    adrp     x12, #0x541000
    add      x12, x12, #0x1e5
    ldrb     w10, [x12]
    mov      w11, #0xb4
    eor      w10, w10, w11
    adrp     x13, #0x541000
    add      x13, x13, #0x1ec
    strb     w10, [x13]
    ldrb     w10, [x12, #1]
    eor      w10, w10, #0xf0
    strb     w10, [x13, #1]
    ldrb     w10, [x12, #2]
    mov      w11, #0xba
    eor      w10, w10, w11
    strb     w10, [x13, #2]
    ldrb     w14, [x12, #3]
    mov      w10, #0x8d
    eor      w14, w14, w10
    strb     w14, [x13, #3]
    ldrb     w14, [x12, #4]
    mov      w15, #0xa2
    eor      w14, w14, w15
    strb     w14, [x13, #4]
    ldrb     w14, [x12, #5]
    mov      w15, #0x26
    eor      w14, w14, w15
    strb     w14, [x13, #5]
    ldrb     w12, [x12, #6]
    eor      w12, w12, #0x40
    strb     w12, [x13, #6]
    adrp     x12, #0x541000
    add      x12, x12, #0x1d1
    ldrb     w13, [x12]
    mov      w14, #0xd8
    eor      w13, w13, w14
    adrp     x14, #0x541000
    add      x14, x14, #0x1db
    strb     w13, [x14]
    ldrb     w13, [x12, #1]
    mov      w15, #0x1d
    eor      w13, w13, w15
    strb     w13, [x14, #1]
    ldrb     w13, [x12, #2]
    eor      w13, w13, #0xffffffe7
    strb     w13, [x14, #2]
    ldrb     w13, [x12, #3]
    mov      w15, #0xae
    eor      w13, w13, w15
    strb     w13, [x14, #3]
    ldrb     w13, [x12, #4]
    mov      w15, #0xb2
    eor      w13, w13, w15
    strb     w13, [x14, #4]
    ldrb     w13, [x12, #5]
    mov      w15, #0x23
    eor      w13, w13, w15
    strb     w13, [x14, #5]
    ldrb     w13, [x12, #6]
    mov      w15, #0xc5
    eor      w13, w13, w15
    strb     w13, [x14, #6]
    ldrb     w13, [x12, #7]
    mov      w15, #0x90
    eor      w13, w13, w15
    strb     w13, [x14, #7]
    ldrb     w13, [x12, #8]
    mov      w15, #0x3b
    eor      w13, w13, w15
    strb     w13, [x14, #8]
    ldrb     w12, [x12, #9]
    mov      w13, #0x3d
    eor      w12, w12, w13
    adrp     x13, #0x541000
    add      x13, x13, #0x160
    strb     w12, [x14, #9]
    ldrb     w12, [x13]
    mov      w14, #0x50
    eor      w12, w12, w14
    adrp     x14, #0x541000
    add      x14, x14, #0x180
    strb     w12, [x14]
    ldrb     w12, [x13, #1]
    mov      w15, #0x9c
    eor      w12, w12, w15
    strb     w12, [x14, #1]
    ldrb     w12, [x13, #2]
    eor      w12, w12, #0xffffff8f
    strb     w12, [x14, #2]
    ldrb     w12, [x13, #3]
    eor      w12, w12, #0xfffffff9
    strb     w12, [x14, #3]
    ldrb     w15, [x13, #4]
    mov      w12, #0xcd
    eor      w15, w15, w12
    strb     w15, [x14, #4]
    ldrb     w15, [x13, #5]
    mov      w16, #0x68
    eor      w15, w15, w16
    strb     w15, [x14, #5]
    ldrb     w15, [x13, #6]
    mov      w16, #0x8e
    eor      w15, w15, w16
    strb     w15, [x14, #6]
    ldrb     w15, [x13, #7]
    eor      w15, w15, #0x1c
    strb     w15, [x14, #7]
    ldrb     w15, [x13, #8]
    mov      w16, #0xfa
    eor      w15, w15, w16
    strb     w15, [x14, #8]
    ldrb     w15, [x13, #9]
    mov      w16, #0x31
    eor      w15, w15, w16
    strb     w15, [x14, #9]
    ldrb     w15, [x13, #0xa]
    mov      w16, #0x5b
    eor      w15, w15, w16
    strb     w15, [x14, #0xa]
    ldrb     w15, [x13, #0xb]
    mov      w16, #0x24
    eor      w15, w15, w16
    strb     w15, [x14, #0xb]
    ldrb     w15, [x13, #0xc]
    eor      w15, w15, #0x78
    strb     w15, [x14, #0xc]
    ldrb     w15, [x13, #0xd]
    eor      w15, w15, #0x70
    strb     w15, [x14, #0xd]
    ldrb     w15, [x13, #0xe]
    mov      w16, #0xca
    eor      w15, w15, w16
    strb     w15, [x14, #0xe]
    ldrb     w15, [x13, #0xf]
    mov      w16, #0x46
    eor      w15, w15, w16
    strb     w15, [x14, #0xf]
    ldrb     w15, [x13, #0x10]
    mov      w16, #0x76
    eor      w15, w15, w16
    strb     w15, [x14, #0x10]
    ldrb     w15, [x13, #0x11]
    eor      w15, w15, #0xffffffc1
    strb     w15, [x14, #0x11]
    ldrb     w15, [x13, #0x12]
    mov      w16, #0x36
    eor      w15, w15, w16
    strb     w15, [x14, #0x12]
    ldrb     w15, [x13, #0x13]
    mov      w16, #0x16
    eor      w15, w15, w16
    strb     w15, [x14, #0x13]
    ldrb     w13, [x13, #0x14]
    mov      w15, #0xd9
    eor      w13, w13, w15
    strb     w13, [x14, #0x14]
    adrp     x13, #0x541000
    add      x13, x13, #0x1a0
    ldrb     w14, [x13]
    eor      w11, w14, w11
    adrp     x14, #0x541000
    add      x14, x14, #0x1c0
    strb     w11, [x14]
    ldrb     w11, [x13, #1]
    eor      w11, w11, #0xfffffffb
    strb     w11, [x14, #1]
    ldrb     w11, [x13, #2]
    eor      w11, w11, #8
    strb     w11, [x14, #2]
    ldrb     w11, [x13, #3]
    mov      w15, #9
    eor      w11, w11, w15
    strb     w11, [x14, #3]
    ldrb     w11, [x13, #4]
    mov      w15, #0xb3
    eor      w11, w11, w15
    strb     w11, [x14, #4]
    ldrb     w11, [x13, #5]
    eor      w10, w11, w10
    strb     w10, [x14, #5]
    ldrb     w10, [x13, #6]
    mov      w11, #0xe5
    eor      w10, w10, w11
    strb     w10, [x14, #6]
    ldrb     w10, [x13, #7]
    eor      w9, w10, w9
    strb     w9, [x14, #7]
    ldrb     w9, [x13, #8]
    mov      w10, #0xf2
    eor      w9, w9, w10
    strb     w9, [x14, #8]
    ldrb     w9, [x13, #9]
    eor      w9, w9, #0x77777777
    strb     w9, [x14, #9]
    ldrb     w9, [x13, #0xa]
    eor      w9, w9, #0xf
    strb     w9, [x14, #0xa]
    ldrb     w9, [x13, #0xb]
    mov      w10, #0xd6
    eor      w9, w9, w10
    strb     w9, [x14, #0xb]
    ldrb     w9, [x13, #0xc]
    mov      w10, #0x17
    eor      w9, w9, w10
    strb     w9, [x14, #0xc]
    ldrb     w9, [x13, #0xd]
    eor      w9, w9, #0xffffffe7
    strb     w9, [x14, #0xd]
    ldrb     w9, [x13, #0xe]
    eor      w9, w9, w12
    strb     w9, [x14, #0xe]
    ldrb     w9, [x13, #0xf]
    mov      w10, #0x5a
    eor      w9, w9, w10
    strb     w9, [x14, #0xf]
    ldrb     w9, [x13, #0x10]
    mov      w10, #0xd1
    eor      w9, w9, w10
    strb     w9, [x14, #0x10]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x518]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x4f0]
    mov      x1, x23
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x5b0]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x528]
    mov      x0, x21
    mov      x1, x26
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    cbz      x22, #0x2eb180
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x108]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x800]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x508]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x960]
    mov      x0, x25
    mov      x2, x27
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x510]
    str      x19, [sp, #8]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x2, #0x541000
    add      x2, x2, #0x2e0
    mov      x0, x22
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x358]
    adrp     x2, #0x541000
    add      x2, x2, #0x320
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    cbz      w19, #0x2eb09c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    adrp     x2, #0x541000
    add      x2, x2, #0x360
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x19, #0x4c4000
    ldr      x0, [x19, #0xb8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2eb088
    ldr      x0, [x19, #0xb8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    str      x20, [sp]
    adrp     x2, #0x541000
    add      x2, x2, #0x2a0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x26
    mov      x1, x27
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cbz      w27, #0x2eb088
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    adrp     x2, #0x4a6000
    add      x2, x2, #0xd8
    adrp     x3, #0x541000
    add      x3, x3, #0x360
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    bl       #0x197d8
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    adrp     x19, #0x4c4000
    b        #0x2eb110
    adrp     x2, #0x541000
    add      x2, x2, #0x2e0
    mov      x0, x22
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x2, #0x541000
    add      x2, x2, #0x220
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x19, #0x4c4000
    cbz      w26, #0x2eb110
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x758]
    adrp     x2, #0x541000
    add      x2, x2, #0x260
    mov      x0, x25
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, x20
    b.ne     #0x2eb108
    bl       #0x2ea7d0
    mov      x0, x20
    bl       #0x2da364
    ldr      x0, [x19, #0xa8]
    mov      x1, x23
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xe08]
    mov      x0, x21
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x520]
    ldr      x0, [sp, #8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    cmp      x22, #0
    cset     w19, ne
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    add      sp, sp, #0x70
    ret      
