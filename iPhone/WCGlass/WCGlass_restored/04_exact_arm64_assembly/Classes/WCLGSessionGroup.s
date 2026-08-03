// Exact ARM64 listing for WCLGSessionGroup

// +[WCLGSessionGroup groupWithDictionary:] IMP=0x3493A0 bounds=0x3493A0-0x34A3CC
loc_3493A0:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x1a0
    mov      x19, sp
    mov      x20, x2
    mov      w26, #0x1034
    movk     w26, #0xf4d9, lsl #16
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x60]
    adrp     x8, #0x581000
    add      x8, x8, #0x23c
    ldar     w8, [x8]
    stur     w8, [x29, #-0x64]
    mov      w8, #0xa333
    movk     w8, #0xcbfe, lsl #16
    str      w8, [x19, #0x14]
    add      x8, x19, #0x14
    str      x8, [x19, #8]
    mov      w22, #0xb93e
    movk     w22, #0xf67, lsl #16
    mov      w27, #0x8f03
    movk     w27, #0xc893, lsl #16
    mov      w23, #0x4c81
    movk     w23, #0xa81c, lsl #16
    mov      w28, #0x20
    movk     w28, #0xf47d, lsl #16
    mov      w21, #0x545
    movk     w21, #0x5716, lsl #16
    mov      w25, #0xe7e5
    movk     w25, #0x267a, lsl #16
    mov      w24, #0xce38
    movk     w24, #0x6f32, lsl #16
    ldr      w8, [x19, #0x14]
    cmp      w8, w22
    b.gt     #0x3494fc
    cmp      w8, w27
    b.gt     #0x349578
    cmp      w8, w23
    b.gt     #0x349668
    mov      w9, #0x35d1
    movk     w9, #0x92bc, lsl #16
    cmp      w8, w9
    b.le     #0x3498ac
    mov      w9, #0x3d75
    movk     w9, #0x9c91, lsl #16
    cmp      w8, w9
    b.gt     #0x349b30
    mov      w9, #0x35d2
    movk     w9, #0x92bc, lsl #16
    cmp      w8, w9
    b.eq     #0x349d8c
    mov      w9, #0x3763
    movk     w9, #0x9c14, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    ldur     x0, [x29, #-0xe8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xf0]
    ldur     x1, [x29, #-0xa0]
    mov      x0, x20
    adrp     x2, #0x54b000
    add      x2, x2, #0xe10
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0xf8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    ldur     x1, [x29, #-0x88]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0xf0]
    ldr      x8, [x19, #8]
    mov      w9, #0xca1
    movk     w9, #0xdba3, lsl #16
    str      w9, [x8]
    b        #0x34943c
    cmp      w8, w21
    b.gt     #0x3495fc
    cmp      w8, w25
    b.gt     #0x349710
    mov      w9, #0xc6c8
    movk     w9, #0x14f8, lsl #16
    cmp      w8, w9
    b.le     #0x349a80
    mov      w9, #0x8abf
    movk     w9, #0x1b7e, lsl #16
    cmp      w8, w9
    b.gt     #0x349c74
    mov      w9, #0xc6c9
    movk     w9, #0x14f8, lsl #16
    cmp      w8, w9
    b.eq     #0x349f78
    mov      w9, #0xdde4
    movk     w9, #0x1889, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldp      x3, x2, [x29, #-0x78]
    ldp      x1, x0, [x19, #0xe0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0xd8]
    cmp      x0, #0
    mov      w8, #0x1c2b
    movk     w8, #0x68ef, lsl #16
    mov      w9, #0x14f1
    movk     w9, #0x8581, lsl #16
    b        #0x34a360
    cmp      w8, w28
    b.gt     #0x3496c4
    mov      w9, #0xca0
    movk     w9, #0xdba3, lsl #16
    cmp      w8, w9
    b.le     #0x349904
    mov      w9, #0x693f
    movk     w9, #0xee72, lsl #16
    cmp      w8, w9
    b.gt     #0x349b70
    mov      w9, #0xca1
    movk     w9, #0xdba3, lsl #16
    cmp      w8, w9
    b.eq     #0x349db4
    mov      w9, #0xd9dd
    movk     w9, #0xe1dc, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    ldur     x0, [x29, #-0xf0]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    str      x0, [x19, #0x68]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xee8]
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #8]
    mov      w9, #0x9d27
    movk     w9, #0x681a, lsl #16
    str      w9, [x8]
    b        #0x34943c
    cmp      w8, w24
    b.le     #0x349850
    mov      w9, #0xb05
    movk     w9, #0x793c, lsl #16
    cmp      w8, w9
    b.le     #0x3499e4
    mov      w9, #0x78d6
    movk     w9, #0x7d0f, lsl #16
    cmp      w8, w9
    b.gt     #0x349c28
    mov      w9, #0xb06
    movk     w9, #0x793c, lsl #16
    cmp      w8, w9
    b.eq     #0x349f2c
    mov      w9, #0x647e
    movk     w9, #0x7a95, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldur     x0, [x29, #-0xf0]
    ldr      x1, [x19, #0xa8]
    ldr      x2, [x19, #0x90]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #8]
    mov      w9, #0x443a
    movk     w9, #0x76d7, lsl #16
    str      w9, [x8]
    b        #0x34943c
    mov      w9, #0x633
    movk     w9, #0xb2b7, lsl #16
    cmp      w8, w9
    b.le     #0x349950
    mov      w9, #0x9fc2
    movk     w9, #0xc7aa, lsl #16
    cmp      w8, w9
    b.gt     #0x349ba4
    mov      w9, #0x634
    movk     w9, #0xb2b7, lsl #16
    cmp      w8, w9
    b.eq     #0x349dec
    mov      w9, #0xda89
    movk     w9, #0xc44e, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldr      x8, [x19, #8]
    mov      w9, #0xce39
    movk     w9, #0x6f32, lsl #16
    str      w9, [x8]
    ldr      x8, [x19, #0x50]
    str      x8, [x19, #0x38]
    b        #0x34943c
    mov      w9, #0xfd68
    movk     w9, #0x419, lsl #16
    cmp      w8, w9
    b.le     #0x3499a0
    mov      w9, #0xfff7
    movk     w9, #0xaf5, lsl #16
    cmp      w8, w9
    b.gt     #0x349be0
    mov      w9, #0xfd69
    movk     w9, #0x419, lsl #16
    cmp      w8, w9
    b.eq     #0x349e00
    mov      w9, #0x8bf6
    movk     w9, #0x60e, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldr      x8, [x19, #8]
    str      w26, [x8]
    b        #0x34943c
    mov      w9, #0x2fdb
    movk     w9, #0x4d14, lsl #16
    cmp      w8, w9
    b.le     #0x349adc
    mov      w9, #0x2b8f
    movk     w9, #0x5186, lsl #16
    cmp      w8, w9
    b.gt     #0x349cb4
    mov      w9, #0x2fdc
    movk     w9, #0x4d14, lsl #16
    cmp      w8, w9
    b.eq     #0x349fa4
    mov      w9, #0x9c90
    movk     w9, #0x4fce, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    adrp     x9, #0x54b000
    add      x9, x9, #0xda6
    ldrb     w8, [x9]
    eor      w8, w8, #0xffffffe1
    adrp     x10, #0x54b000
    add      x10, x10, #0xda9
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w11, #0xc5
    eor      w8, w8, w11
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w9, #0xf4
    eor      w8, w8, w9
    strb     w8, [x10, #2]
    adrp     x9, #0x54b000
    add      x9, x9, #0xd9a
    ldrb     w8, [x9]
    mov      w10, #0x4b
    eor      w8, w8, w10
    adrp     x10, #0x54b000
    add      x10, x10, #0xda0
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w11, #0x89
    eor      w8, w8, w11
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    eor      w8, w8, #0x77777777
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    mov      w11, #0x8c
    eor      w8, w8, w11
    strb     w8, [x10, #3]
    ldrb     w8, [x9, #4]
    mov      w11, #0x4c
    eor      w8, w8, w11
    strb     w8, [x10, #4]
    ldrb     w8, [x9, #5]
    eor      w8, w8, #0xffffff83
    strb     w8, [x10, #5]
    adrp     x9, #0x54b000
    add      x9, x9, #0xd8a
    ldrb     w8, [x9]
    mov      w10, #0xa6
    eor      w8, w8, w10
    adrp     x10, #0x54b000
    add      x10, x10, #0xd92
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    eor      w8, w8, #0xf8
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w11, #0xb
    eor      w8, w8, w11
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    eor      w8, w8, #0xffffffe3
    strb     w8, [x10, #3]
    ldr      x8, [x19, #8]
    mov      w9, #0xfd69
    movk     w9, #0x419, lsl #16
    str      w9, [x8]
    b        #0x34943c
    mov      w9, #0xcd70
    movk     w9, #0x63b6, lsl #16
    cmp      w8, w9
    b.le     #0x349a28
    mov      w9, #0x9d26
    movk     w9, #0x681a, lsl #16
    cmp      w8, w9
    b.le     #0x349d04
    mov      w9, #0x9d27
    movk     w9, #0x681a, lsl #16
    cmp      w8, w9
    b.eq     #0x349d48
    mov      w9, #0x1c2b
    movk     w9, #0x68ef, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldr      x0, [x19, #0xe8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #8]
    mov      w9, #0x634
    movk     w9, #0xb2b7, lsl #16
    str      w9, [x8]
    b        #0x34943c
    mov      w9, #0x912f
    movk     w9, #0x81f7, lsl #16
    cmp      w8, w9
    b.eq     #0x34a118
    mov      w9, #0x14f1
    movk     w9, #0x8581, lsl #16
    cmp      w8, w9
    b.eq     #0x34a014
    mov      w9, #0x7dfd
    movk     w9, #0x86bc, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldur     x8, [x29, #-0x70]
    add      x8, x8, #8
    str      x8, [x19, #0xb8]
    ldr      x8, [x19, #8]
    mov      w9, #0xc5d6
    movk     w9, #0x63d2, lsl #16
    str      w9, [x8]
    ldr      x8, [x19, #0xd8]
    str      x8, [x19, #0x48]
    b        #0x34943c
    mov      w9, #0x8f04
    movk     w9, #0xc893, lsl #16
    cmp      w8, w9
    b.eq     #0x349b90
    mov      w9, #0xa333
    movk     w9, #0xcbfe, lsl #16
    cmp      w8, w9
    b.eq     #0x34a034
    mov      w9, #0x9125
    movk     w9, #0xd0f3, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldr      x0, [x19, #0xe8]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x19, #8]
    mov      w9, #0x8bf6
    movk     w9, #0x60e, lsl #16
    str      w9, [x8]
    b        #0x34943c
    mov      w9, #0x4c82
    movk     w9, #0xa81c, lsl #16
    cmp      w8, w9
    b.eq     #0x34a178
    mov      w9, #0x3027
    movk     w9, #0xa993, lsl #16
    cmp      w8, w9
    b.eq     #0x34a058
    mov      w9, #0x8a8d
    movk     w9, #0xaf64, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldr      x8, [x19, #0xa0]
    ldr      x8, [x8]
    str      x8, [x19, #0x98]
    ldr      x8, [x19, #8]
    mov      w9, #0xe7e6
    movk     w9, #0x267a, lsl #16
    str      w9, [x8]
    b        #0x34943c
    mov      w9, #0x21
    movk     w9, #0xf47d, lsl #16
    cmp      w8, w9
    b.eq     #0x34a1dc
    cmp      w8, w26
    b.eq     #0x34a0a0
    mov      w9, #0xa763
    movk     w9, #0xf80d, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldurb    w8, [x29, #-0xc9]
    cmp      w8, #0
    mov      w8, #0x3027
    movk     w8, #0xa993, lsl #16
    mov      w9, #0x8ac0
    movk     w9, #0x1b7e, lsl #16
    b        #0x34a330
    mov      w9, #0xce39
    movk     w9, #0x6f32, lsl #16
    cmp      w8, w9
    b.eq     #0x34a22c
    mov      w9, #0x1325
    movk     w9, #0x746e, lsl #16
    cmp      w8, w9
    b.eq     #0x34a0c8
    mov      w9, #0x443a
    movk     w9, #0x76d7, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldr      x8, [x19, #8]
    mov      w9, #0x6940
    movk     w9, #0xee72, lsl #16
    str      w9, [x8]
    b        #0x34943c
    mov      w9, #0x546
    movk     w9, #0x5716, lsl #16
    cmp      w8, w9
    b.eq     #0x34a2e0
    mov      w9, #0x1954
    movk     w9, #0x5a69, lsl #16
    cmp      w8, w9
    b.eq     #0x34a20c
    mov      w9, #0xde96
    movk     w9, #0x5dd4, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldur     x0, [x29, #-0xb8]
    ldur     x1, [x29, #-0xd8]
    adrp     x2, #0x4a6000
    add      x2, x2, #0xd8
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #8]
    mov      w9, #0xea57
    movk     w9, #0xf2ad, lsl #16
    str      w9, [x8]
    b        #0x34943c
    mov      w9, #0xb93f
    movk     w9, #0xf67, lsl #16
    cmp      w8, w9
    b.eq     #0x34a318
    mov      w9, #0x4f85
    movk     w9, #0x1168, lsl #16
    cmp      w8, w9
    b.eq     #0x34a26c
    mov      w9, #0x6a56
    movk     w9, #0x1254, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldr      x8, [x19, #0x40]
    str      x8, [x19, #0x18]
    ldr      x8, [x19, #0xd0]
    ldr      x8, [x8]
    ldr      x8, [x8]
    ldr      x9, [x19, #0xc0]
    cmp      x8, x9
    mov      w8, #0x9125
    movk     w8, #0xd0f3, lsl #16
    csel     w8, w26, w8, eq
    b        #0x34a364
    mov      w9, #0xe7e6
    movk     w9, #0x267a, lsl #16
    cmp      w8, w9
    b.eq     #0x34a338
    mov      w9, #0x5c5a
    movk     w9, #0x28cd, lsl #16
    cmp      w8, w9
    b.eq     #0x34a2ac
    mov      w9, #0x20c1
    movk     w9, #0x3266, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldr      x8, [x19, #0x78]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [x19, #0x77]
    ldr      x8, [x19, #8]
    mov      w9, #0x85bd
    movk     w9, #0x519d, lsl #16
    str      w9, [x8]
    b        #0x34943c
    mov      w9, #0x3d76
    movk     w9, #0x9c91, lsl #16
    cmp      w8, w9
    b.eq     #0x349e74
    mov      w9, #0xe51e
    movk     w9, #0xa571, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldr      x8, [x19, #0x18]
    add      x8, x8, #1
    str      x8, [x19, #0x80]
    ldr      x8, [x19, #8]
    mov      w9, #0x21
    movk     w9, #0xf47d, lsl #16
    str      w9, [x8]
    b        #0x34943c
    mov      w9, #0x6940
    movk     w9, #0xee72, lsl #16
    cmp      w8, w9
    b.eq     #0x349eb0
    mov      w9, #0xea57
    movk     w9, #0xf2ad, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldr      x8, [x19, #8]
    mov      w9, #0x2fdc
    movk     w9, #0x4d14, lsl #16
    str      w9, [x8]
    b        #0x34943c
    mov      w9, #0x9fc3
    movk     w9, #0xc7aa, lsl #16
    cmp      w8, w9
    b.eq     #0x349ecc
    mov      w9, #0x572b
    movk     w9, #0xc82a, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldur     x0, [x29, #-0xe0]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #8]
    mov      w9, #0x8f04
    movk     w9, #0xc893, lsl #16
    str      w9, [x8]
    b        #0x34943c
    mov      w9, #0xfff8
    movk     w9, #0xaf5, lsl #16
    cmp      w8, w9
    b.eq     #0x349ef0
    mov      w9, #0x373d
    movk     w9, #0xee4, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldur     x0, [x29, #-0xf0]
    ldr      x1, [x19, #0xb0]
    ldr      x2, [x19, #0x90]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [x19, #0x8f]
    ldr      x8, [x19, #8]
    mov      w9, #0xb93f
    movk     w9, #0xf67, lsl #16
    str      w9, [x8]
    b        #0x34943c
    mov      w9, #0x78d7
    movk     w9, #0x7d0f, lsl #16
    cmp      w8, w9
    b.eq     #0x349f4c
    mov      w9, #0x6e44
    movk     w9, #0x7e69, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x5f8]
    bl       #0x461bac // _objc_alloc_init
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x888]
    stp      x8, x0, [x29, #-0xc0]
    ldr      x8, [x19, #8]
    mov      w9, #0x4c82
    movk     w9, #0xa81c, lsl #16
    str      w9, [x8]
    b        #0x34943c
    mov      w9, #0x8ac0
    movk     w9, #0x1b7e, lsl #16
    cmp      w8, w9
    b.eq     #0x349fcc
    mov      w9, #0xa40
    movk     w9, #0x1dd2, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldr      x8, [x19, #0xc8]
    ldr      x8, [x8]
    str      x8, [x19, #0xc0]
    ldr      x8, [x19, #8]
    mov      w9, #0x7dfd
    movk     w9, #0x86bc, lsl #16
    str      w9, [x8]
    b        #0x34943c
    mov      w9, #0x2b90
    movk     w9, #0x5186, lsl #16
    cmp      w8, w9
    b.eq     #0x349fec
    mov      w9, #0x85bd
    movk     w9, #0x519d, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldrb     w8, [x19, #0x77]
    cmp      w8, #0
    mov      w8, #0x1c2b
    movk     w8, #0x68ef, lsl #16
    mov      w9, #0xc5d6
    movk     w9, #0x63d2, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [x19, #8]
    str      w8, [x9]
    ldr      x8, [x19, #0x78]
    str      x8, [x19, #0x48]
    b        #0x34943c
    mov      w9, #0xc5d6
    movk     w9, #0x63d2, lsl #16
    cmp      w8, w9
    b.ne     #0x34a370
    ldr      x8, [x19, #0x48]
    str      x8, [x19, #0x20]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0xa08]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x830]
    stp      x8, x9, [x19, #0xa8]
    ldr      x8, [x19, #8]
    mov      w9, #0x6a56
    movk     w9, #0x1254, lsl #16
    str      w9, [x8]
    str      xzr, [x19, #0x40]
    b        #0x34943c
    ldr      x0, [x19, #0x68]
    bl       #0x461c9c // _objc_release
    ldur     x1, [x29, #-0xa0]
    mov      x0, x20
    adrp     x2, #0x54b000
    add      x2, x2, #0xdd0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x4e8]
    stp      x8, x0, [x19, #0x58]
    ldr      x8, [x19, #8]
    mov      w9, #0x546
    movk     w9, #0x5716, lsl #16
    str      w9, [x8]
    b        #0x34943c
    ldur     x0, [x29, #-0xa8]
    bl       #0x347364
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb0]
    ldr      x8, [x19, #8]
    mov      w9, #0x5c5a
    movk     w9, #0x28cd, lsl #16
    str      w9, [x8]
    b        #0x34943c
    ldur     x1, [x29, #-0x98]
    ldp      x2, x0, [x19, #0xf0]
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    ldr      x0, [x19, #0xf8]
    bl       #0x461c9c // _objc_release
    cmp      w26, #0
    mov      w26, #0x1034
    movk     w26, #0xf4d9, lsl #16
    mov      w8, #0xd9dd
    movk     w8, #0xe1dc, lsl #16
    mov      w9, #0x9fc3
    movk     w9, #0xc7aa, lsl #16
    b        #0x34a224
    ldr      x8, [x19, #8]
    mov      w9, #0xd9dd
    movk     w9, #0xe1dc, lsl #16
    str      w9, [x8]
    b        #0x34943c
    adrp     x9, #0x54b000
    add      x9, x9, #0xd8e
    ldrb     w8, [x9]
    mov      w10, #0x4a
    eor      w8, w8, w10
    adrp     x10, #0x54b000
    add      x10, x10, #0xd96
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w11, #0x6b
    eor      w8, w8, w11
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w11, #0xa0
    eor      w8, w8, w11
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    eor      w8, w8, #4
    strb     w8, [x10, #3]
    adrp     x8, #0x54b000
    ldrb     w8, [x8, #0xd80]
    eor      w8, w8, #0xffffffbf
    adrp     x9, #0x54b000
    strb     w8, [x9, #0xd85]
    ldr      x8, [x19, #8]
    mov      w9, #0x912f
    movk     w9, #0x81f7, lsl #16
    str      w9, [x8]
    b        #0x34943c
    ldur     x1, [x29, #-0xa0]
    mov      x0, x20
    adrp     x2, #0x54b000
    add      x2, x2, #0xe10
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x478]
    stp      x8, x0, [x19, #0xe0]
    ldr      x8, [x19, #8]
    mov      w9, #0xdde4
    movk     w9, #0x1889, lsl #16
    str      w9, [x8]
    b        #0x34943c
    ldr      x0, [x19, #0x90]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #8]
    mov      w9, #0xe51e
    movk     w9, #0xa571, lsl #16
    str      w9, [x8]
    b        #0x34943c
    ldur     x8, [x29, #-0x70]
    movi     v0.16b, #0
    stp      q0, q0, [x8]
    stp      q0, q0, [x8, #0x20]
    ldr      x8, [x19, #8]
    mov      w9, #0x3d76
    movk     w9, #0x9c91, lsl #16
    str      w9, [x8]
    b        #0x34943c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x528]
    stur     x1, [x29, #-0xa0]
    mov      x0, x20
    adrp     x2, #0x54b000
    add      x2, x2, #0xe90
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xa8]
    ldr      x8, [x19, #8]
    mov      w9, #0x35d2
    movk     w9, #0x92bc, lsl #16
    str      w9, [x8]
    b        #0x34943c
    ldp      x1, x0, [x19, #0x58]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x50]
    ldr      x8, [x19, #8]
    mov      w9, #0xda89
    movk     w9, #0xc44e, lsl #16
    str      w9, [x8]
    b        #0x34943c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    stur     x1, [x29, #-0x88]
    ldur     x0, [x29, #-0x80]
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0x90]
    ldr      x8, [x19, #8]
    mov      w9, #0x4f85
    movk     w9, #0x1168, lsl #16
    str      w9, [x8]
    b        #0x34943c
    ldr      x26, [x19, #0x30]
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #8]
    mov      w9, #0xcd71
    movk     w9, #0x63b6, lsl #16
    str      w9, [x8]
    str      x26, [x19, #0x28]
    mov      w26, #0x1034
    movk     w26, #0xf4d9, lsl #16
    b        #0x34943c
    ldur     x0, [x29, #-0xc8]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x110]
    stur     x8, [x29, #-0xe8]
    ldr      x8, [x19, #8]
    mov      w9, #0x3763
    movk     w9, #0x9c14, lsl #16
    str      w9, [x8]
    b        #0x34943c
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0xb80]
    stur     x8, [x29, #-0xd8]
    ldr      x8, [x19, #8]
    mov      w9, #0xde96
    movk     w9, #0x5dd4, lsl #16
    str      w9, [x8]
    b        #0x34943c
    ldp      x3, x2, [x29, #-0x78]
    ldp      x1, x0, [x19, #0xe0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x78]
    ldr      x8, [x19, #8]
    mov      w9, #0x20c1
    movk     w9, #0x3266, lsl #16
    str      w9, [x8]
    b        #0x34943c
    ldur     x8, [x29, #-0x70]
    ldr      x9, [x8, #0x10]!
    stp      x9, x8, [x19, #0xc8]
    ldr      x8, [x19, #8]
    mov      w9, #0xa40
    movk     w9, #0x1dd2, lsl #16
    str      w9, [x8]
    b        #0x34943c
    ldur     w8, [x29, #-0x64]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x65]
    ldr      x8, [x19, #8]
    mov      w9, #0x1954
    movk     w9, #0x5a69, lsl #16
    str      w9, [x8]
    b        #0x34943c
    ldur     x1, [x29, #-0xa0]
    mov      x0, x20
    adrp     x2, #0x54b000
    add      x2, x2, #0xe50
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    stur     x0, [x29, #-0xe0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb80]
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #8]
    mov      w9, #0x572b
    movk     w9, #0xc82a, lsl #16
    str      w9, [x8]
    b        #0x34943c
    ldr      x8, [x19, #0xb8]
    ldr      x8, [x8]
    ldr      x9, [x19, #0x18]
    add      x8, x8, x9, lsl #3
    str      x8, [x19, #0xa0]
    ldr      x8, [x19, #8]
    mov      w9, #0x8a8d
    movk     w9, #0xaf64, lsl #16
    str      w9, [x8]
    b        #0x34943c
    adrp     x8, #0x581000
    add      x8, x8, #0x23c
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x40
    mov      sp, x8
    stur     x8, [x29, #-0x70]
    sub      x8, sp, #0x80
    mov      sp, x8
    stur     x8, [x29, #-0x78]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x208]
    stur     x8, [x29, #-0x80]
    ldr      x8, [x19, #8]
    mov      w9, #0x78d7
    movk     w9, #0x7d0f, lsl #16
    str      w9, [x8]
    b        #0x34943c
    adrp     x9, #0x54b000
    add      x9, x9, #0xd81
    ldrb     w8, [x9]
    mov      w10, #0x96
    eor      w8, w8, w10
    adrp     x10, #0x54b000
    add      x10, x10, #0xd86
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    eor      w8, w8, #0xe
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w11, #0x29
    eor      w8, w8, w11
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    mov      w9, #0x85
    eor      w8, w8, w9
    strb     w8, [x10, #3]
    ldr      x8, [x19, #8]
    mov      w9, #0x1325
    movk     w9, #0x746e, lsl #16
    str      w9, [x8]
    b        #0x34943c
    ldp      x0, x2, [x29, #-0xb8]
    ldur     x1, [x29, #-0xc0]
    bl       #0x461c6c // _objc_msgSend
    ldur     x1, [x29, #-0xa0]
    mov      x0, x20
    adrp     x2, #0x54b000
    add      x2, x2, #0xe50
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xc8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    ldur     x1, [x29, #-0x88]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    ldur     x1, [x29, #-0x98]
    ldur     x0, [x29, #-0xc8]
    bl       #0x461c6c // _objc_msgSend
    sturb    w0, [x29, #-0xc9]
    ldr      x8, [x19, #8]
    mov      w9, #0xa763
    movk     w9, #0xf80d, lsl #16
    str      w9, [x8]
    b        #0x34943c
    ldr      x8, [x19, #0x80]
    ldr      x9, [x19, #0x20]
    cmp      x8, x9
    mov      w9, #0x6a56
    movk     w9, #0x1254, lsl #16
    mov      w10, #0x2b90
    movk     w10, #0x5186, lsl #16
    csel     w9, w10, w9, eq
    ldr      x10, [x19, #8]
    str      w9, [x10]
    str      x8, [x19, #0x40]
    b        #0x34943c
    ldurb    w8, [x29, #-0x65]
    cmp      w8, #0
    mov      w8, #0x1325
    movk     w8, #0x746e, lsl #16
    mov      w9, #0x9c90
    movk     w9, #0x4fce, lsl #16
    csel     w8, w9, w8, ne
    b        #0x34a364
    ldr      x2, [x19, #0x38]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xef0]
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, #0x60]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xf0]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #8]
    mov      w9, #0xc6c9
    movk     w9, #0x14f8, lsl #16
    str      w9, [x8]
    ldur     x8, [x29, #-0xb8]
    str      x8, [x19, #0x30]
    b        #0x34943c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    stur     x1, [x29, #-0x98]
    ldur     x2, [x29, #-0x90]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [x19, #8]
    mov      w9, #0xcd71
    movk     w9, #0x63b6, lsl #16
    mov      w10, #0xfff8
    movk     w10, #0xaf5, lsl #16
    csel     w9, w10, w9, ne
    str      w9, [x8]
    str      xzr, [x19, #0x28]
    b        #0x34943c
    ldur     x0, [x29, #-0xa8]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0xb0]
    cmp      x8, #0
    mov      w8, #0xc6c9
    movk     w8, #0x14f8, lsl #16
    mov      w9, #0x6e44
    movk     w9, #0x7e69, lsl #16
    csel     w8, w8, w9, eq
    ldr      x9, [x19, #8]
    str      w8, [x9]
    str      xzr, [x19, #0x30]
    b        #0x34943c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    ldp      x2, x0, [x19, #0x58]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [x19, #8]
    mov      w9, #0xce39
    movk     w9, #0x6f32, lsl #16
    mov      w10, #0xb06
    movk     w10, #0x793c, lsl #16
    csel     w9, w10, w9, ne
    str      w9, [x8]
    str      xzr, [x19, #0x38]
    b        #0x34943c
    ldrb     w8, [x19, #0x8f]
    cmp      w8, #0
    mov      w8, #0x6940
    movk     w8, #0xee72, lsl #16
    mov      w9, #0x647e
    movk     w9, #0x7a95, lsl #16
    csel     w8, w8, w9, ne
    b        #0x34a364
    ldr      x0, [x19, #0x98]
    bl       #0x347364
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x90]
    cmp      x0, #0
    mov      w8, #0x6940
    movk     w8, #0xee72, lsl #16
    mov      w9, #0x373d
    movk     w9, #0xee4, lsl #16
    csel     w8, w8, w9, eq
    ldr      x9, [x19, #8]
    str      w8, [x9]
    b        #0x34943c
    mov      w9, #0xcd71
    movk     w9, #0x63b6, lsl #16
    cmp      w8, w9
    b.ne     #0x34943c
    ldr      x21, [x19, #0x28]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x34a3c8
    mov      x0, x21
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    b        #0x461be8 // _objc_autoreleaseReturnValue
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGSessionGroup init] IMP=0x346474 bounds=0x346474-0x34663C
loc_346474:
    sub      sp, sp, #0xb0
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      w19, #0x95d4
    movk     w19, #0xf3d5, lsl #16
    str      x0, [sp, #0x40]
    mov      w20, #0x66e1
    movk     w20, #0x82a6, lsl #16
    str      w20, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w21, #0x95d3
    movk     w21, #0xf3d5, lsl #16
    mov      w23, #0xa17d
    movk     w23, #0xa60e, lsl #16
    mov      w25, #0xc3cd
    movk     w25, #0x891, lsl #16
    mov      w26, #0x1cb4
    movk     w26, #0xc375, lsl #16
    mov      w24, #0xff8f
    movk     w24, #0x689c, lsl #16
    adrp     x27, #0x4a0000
    ldr      x27, [x27, #0x2d8]
    adrp     x28, #0x4a6000
    add      x28, x28, #0xd8
    ldr      w8, [sp, #0x14]
    cmp      w8, w21
    b.gt     #0x346524
    cmp      w8, w20
    b.eq     #0x346584
    cmp      w8, w23
    b.eq     #0x34659c
    cmp      w8, w26
    b.ne     #0x3464ec
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w19, [x8]
    b        #0x3464ec
    cmp      w8, w25
    b.eq     #0x3465cc
    cmp      w8, w24
    b.ne     #0x346610
    ldr      x8, [sp, #0x20]
    ldr      x9, [sp, #0x30]
    ldr      x0, [x9, #8]
    str      x8, [x9, #8]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x30]
    ldr      x0, [x8, #0x10]
    str      x28, [x8, #0x10]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x27]
    ldr      x22, [sp, #0x30]
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [x22, #0x18]
    str      x8, [sp, #0x18]
    str      x0, [x22, #0x18]
    ldr      x8, [sp, #8]
    str      w26, [x8]
    b        #0x3464ec
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7f0]
    str      x8, [sp, #0x38]
    ldr      x8, [sp, #8]
    str      w23, [x8]
    b        #0x3464ec
    ldr      x8, [sp, #0x38]
    str      x8, [sp, #0x48]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb78]
    add      x0, sp, #0x40
    bl       #0x461c84 // _objc_msgSendSuper2
    str      x0, [sp, #0x30]
    cmp      x0, #0
    csel     w8, w19, w25, eq
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x3464ec
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x300]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xa98]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xaa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x20]
    ldr      x8, [sp, #8]
    str      w24, [x8]
    b        #0x3464ec
    cmp      w8, w19
    b.ne     #0x3464ec
    ldr      x0, [sp, #0x30]
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    add      sp, sp, #0xb0
    ret      

// -[WCLGSessionGroup isAllGroup] IMP=0x34663C bounds=0x34663C-0x3468F0
loc_34663C:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    mov      w8, #0xbc73
    movk     w8, #0xdf3c, lsl #16
    adrp     x9, #0x581000
    add      x9, x9, #0x21c
    ldar     w9, [x9]
    str      w9, [sp, #0x2c]
    mov      w10, #0xe53e
    movk     w10, #0xa728, lsl #16
    add      x9, sp, #0xc
    str      w10, [sp, #0xc]
    mov      w11, #0xbc72
    movk     w11, #0xdf3c, lsl #16
    mov      w12, #0xe53d
    movk     w12, #0xa728, lsl #16
    str      x9, [sp]
    adrp     x13, #0x54b000
    add      x13, x13, #0x866
    mov      w14, #0x6def
    movk     w14, #0x8958, lsl #16
    adrp     x15, #0x54b000
    add      x15, x15, #0x873
    mov      w1, #0x9c0f
    movk     w1, #0x1ca6, lsl #16
    mov      w2, #0xcec
    movk     w2, #0x9e40, lsl #16
    mov      w3, #0x48d8
    movk     w3, #0x2f6d, lsl #16
    mov      w4, #0x19b3
    movk     w4, #0xb8cf, lsl #16
    adrp     x5, #0x54b000
    add      x5, x5, #0x860
    adrp     x7, #0x54b000
    add      x7, x7, #0x86d
    mov      w19, #0x8a
    mov      w20, #0xa2
    mov      w21, #0xba
    mov      w22, #0x9c
    mov      w23, #0x48d7
    movk     w23, #0x2f6d, lsl #16
    mov      w24, #1
    add      x0, x0, #8
    mov      w25, #0x9765
    movk     w25, #0x3c47, lsl #16
    adrp     x26, #0x54b000
    add      x26, x26, #0x876
    mov      w27, #0xa8
    mov      w28, #0x54
    mov      w30, #0xd4
    adrp     x9, #0x4be000
    adrp     x16, #0x54b000
    add      x16, x16, #0x86a
    ldr      w17, [sp, #0xc]
    cmp      w17, w11
    b.le     #0x346784
    cmp      w17, w23
    b.gt     #0x3467f4
    cmp      w17, w8
    b.eq     #0x346888
    cmp      w17, w1
    b.ne     #0x346724
    ldrb     w17, [sp, #0x2a]
    eor      w17, w17, w27
    strb     w17, [x26]
    ldrb     w17, [x16]
    eor      w17, w17, w20
    strb     w17, [x26, #1]
    ldrb     w17, [x16, #1]
    eor      w17, w17, w28
    strb     w17, [x26, #2]
    ldrb     w17, [x16, #2]
    eor      w17, w17, w30
    strb     w17, [x26, #3]
    ldr      x17, [sp]
    str      w8, [x17]
    b        #0x346724
    cmp      w17, w12
    b.le     #0x346824
    cmp      w17, w10
    b.eq     #0x34686c
    cmp      w17, w4
    b.ne     #0x346724
    ldrb     w17, [x5]
    mov      w6, #0x1b
    eor      w17, w17, w6
    strb     w17, [x7]
    ldrb     w17, [x5, #1]
    eor      w17, w17, w19
    strb     w17, [x7, #1]
    ldrb     w17, [x5, #2]
    eor      w17, w17, w20
    strb     w17, [x7, #2]
    ldrb     w17, [x5, #3]
    eor      w17, w17, #0x38
    strb     w17, [x7, #3]
    ldrb     w17, [x5, #4]
    eor      w17, w17, w21
    strb     w17, [x7, #4]
    ldrb     w17, [x5, #5]
    eor      w17, w17, w22
    strb     w17, [x7, #5]
    ldr      x17, [sp]
    str      w14, [x17]
    b        #0x346724
    cmp      w17, w3
    b.eq     #0x3468a4
    cmp      w17, w25
    b.ne     #0x346724
    ldr      x17, [sp, #0x20]
    ldr      x17, [x17]
    str      x17, [sp, #0x18]
    ldr      x17, [x9, #0x358]
    str      x17, [sp, #0x10]
    ldr      x17, [sp]
    str      w2, [x17]
    b        #0x346724
    cmp      w17, w14
    b.ne     #0x3468bc
    ldrb     w17, [x13]
    mvn      w17, w17
    strb     w17, [x15]
    ldrb     w17, [x13, #1]
    mov      w6, #0x19
    eor      w17, w17, w6
    strb     w17, [x15, #1]
    ldrb     w17, [x13, #2]
    mov      w6, #0xc6
    eor      w17, w17, w6
    strb     w17, [x15, #2]
    ldrb     w17, [x13, #3]
    strb     w17, [sp, #0x2a]
    ldr      x17, [sp]
    str      w1, [x17]
    b        #0x346724
    ldr      w17, [sp, #0x2c]
    cmp      w17, #0
    cset     w17, eq
    strb     w17, [sp, #0x2b]
    ldr      x17, [sp]
    str      w3, [x17]
    b        #0x346724
    adrp     x17, #0x581000
    add      x17, x17, #0x21c
    stlr     w24, [x17]
    str      x0, [sp, #0x20]
    ldr      x17, [sp]
    str      w25, [x17]
    b        #0x346724
    ldrb     w17, [sp, #0x2b]
    cmp      w17, #0
    csel     w17, w4, w8, ne
    ldr      x6, [sp]
    str      w17, [x6]
    b        #0x346724
    cmp      w17, w2
    b.ne     #0x346724
    ldp      x1, x0, [sp, #0x10]
    adrp     x2, #0x54b000
    add      x2, x2, #0x8a0
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    b        #0x461c6c // _objc_msgSend

// -[WCLGSessionGroup containsSessionUsername:] IMP=0x3468F0 bounds=0x3468F0-0x347364
loc_3468F0:
    sub      sp, sp, #0xe0
    stp      x28, x27, [sp, #0x80]
    stp      x26, x25, [sp, #0x90]
    stp      x24, x23, [sp, #0xa0]
    stp      x22, x21, [sp, #0xb0]
    stp      x20, x19, [sp, #0xc0]
    stp      x29, x30, [sp, #0xd0]
    add      x29, sp, #0xd0
    stp      x2, x0, [sp]
    mov      w25, #0x6280
    movk     w25, #0x1975, lsl #16
    mov      w26, #0xc6f0
    movk     w26, #0x9b2, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x220
    ldar     w8, [x8]
    stur     w8, [x29, #-0x54]
    mov      w8, #0x1083
    movk     w8, #0x35f3, lsl #16
    str      w8, [sp, #0x1c]
    add      x8, sp, #0x1c
    str      x8, [sp, #0x10]
    mov      w27, #0xebb3
    movk     w27, #0x256, lsl #16
    mov      w21, #0x839a
    movk     w21, #0xb95b, lsl #16
    mov      w22, #0xb4ae
    movk     w22, #0xaa85, lsl #16
    mov      w24, #0x1082
    movk     w24, #0x35f3, lsl #16
    mov      w23, #0xca6d
    movk     w23, #0x15e6, lsl #16
    adrp     x20, #0x54b000
    add      x20, x20, #0x8c0
    adrp     x19, #0x54b000
    add      x19, x19, #0x8e0
    mov      w28, #0x3b8d
    movk     w28, #0x43a7, lsl #16
    ldr      w8, [sp, #0x1c]
    cmp      w8, w27
    b.le     #0x3469f8
    cmp      w8, w24
    b.gt     #0x346a6c
    cmp      w8, w23
    b.gt     #0x346bb8
    mov      w9, #0x25d3
    movk     w9, #0x759, lsl #16
    cmp      w8, w9
    b.le     #0x346ed4
    mov      w9, #0x25d4
    movk     w9, #0x759, lsl #16
    cmp      w8, w9
    b.eq     #0x347184
    cmp      w8, w26
    b.eq     #0x34728c
    mov      w9, #0xdbcb
    movk     w9, #0xcc0, lsl #16
    cmp      w8, w9
    b.ne     #0x346988
    ldurb    w8, [x29, #-0x55]
    cmp      w8, #0
    mov      w8, #0x7c6a
    movk     w8, #0x4a05, lsl #16
    mov      w9, #0xc59e
    movk     w9, #0x9173, lsl #16
    b        #0x34722c
    cmp      w8, w21
    b.gt     #0x346ae8
    cmp      w8, w22
    b.gt     #0x346b58
    mov      w9, #0xcdb0
    movk     w9, #0x8e78, lsl #16
    cmp      w8, w9
    b.le     #0x346e6c
    mov      w9, #0xcdb1
    movk     w9, #0x8e78, lsl #16
    cmp      w8, w9
    b.eq     #0x34713c
    mov      w9, #0xc59e
    movk     w9, #0x9173, lsl #16
    cmp      w8, w9
    b.eq     #0x347234
    mov      w9, #0x8cf
    movk     w9, #0x9e8a, lsl #16
    cmp      w8, w9
    b.ne     #0x346988
    ldr      x8, [sp, #0x68]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [sp, #0x67]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x73b8
    movk     w9, #0x26ef, lsl #16
    str      w9, [x8]
    b        #0x346988
    cmp      w8, w28
    b.gt     #0x346d5c
    mov      w9, #0x93d0
    movk     w9, #0x373e, lsl #16
    cmp      w8, w9
    b.le     #0x346f10
    mov      w9, #0x93d1
    movk     w9, #0x373e, lsl #16
    cmp      w8, w9
    b.eq     #0x347198
    mov      w9, #0xd103
    movk     w9, #0x38a7, lsl #16
    cmp      w8, w9
    b.eq     #0x3472b0
    mov      w9, #0xa09f
    movk     w9, #0x3b59, lsl #16
    cmp      w8, w9
    b.ne     #0x346988
    ldurb    w8, [x29, #-0x56]
    adrp     x9, #0x54b000
    add      x9, x9, #0x8ef
    strb     w8, [x9]
    adrp     x8, #0x54b000
    ldrb     w8, [x8, #0x8d0]
    eor      w8, w8, #0xaaaaaaaa
    strb     w8, [x9, #1]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x7c6a
    movk     w9, #0x4a05, lsl #16
    str      w9, [x8]
    b        #0x346988
    mov      w9, #0x22cd
    movk     w9, #0xd04e, lsl #16
    cmp      w8, w9
    b.le     #0x346dd4
    mov      w9, #0xa1b0
    movk     w9, #0xdb72, lsl #16
    cmp      w8, w9
    b.le     #0x346e24
    mov      w9, #0xa1b1
    movk     w9, #0xdb72, lsl #16
    cmp      w8, w9
    b.eq     #0x34711c
    mov      w9, #0x665c
    movk     w9, #0xf46d, lsl #16
    cmp      w8, w9
    b.eq     #0x347214
    mov      w9, #0x6503
    movk     w9, #0xf7ad, lsl #16
    cmp      w8, w9
    b.ne     #0x346988
    ldr      x8, [sp, #8]
    add      x8, x8, #0x20
    str      x8, [sp, #0x58]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xd103
    movk     w9, #0x38a7, lsl #16
    str      w9, [x8]
    b        #0x346988
    mov      w9, #0x8052
    movk     w9, #0xaf1e, lsl #16
    cmp      w8, w9
    b.le     #0x346ea0
    mov      w9, #0x8053
    movk     w9, #0xaf1e, lsl #16
    cmp      w8, w9
    b.eq     #0x347164
    mov      w9, #0x6f7e
    movk     w9, #0xb548, lsl #16
    cmp      w8, w9
    b.eq     #0x347260
    mov      w9, #0x1337
    movk     w9, #0xb6c5, lsl #16
    cmp      w8, w9
    b.ne     #0x346988
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x5d8]
    str      x8, [sp, #0x28]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x6c23
    movk     w9, #0x74ea, lsl #16
    str      w9, [x8]
    b        #0x346988
    mov      w9, #0x627f
    movk     w9, #0x1975, lsl #16
    cmp      w8, w9
    b.le     #0x346f44
    cmp      w8, w25
    b.eq     #0x3471b8
    mov      w9, #0x73b8
    movk     w9, #0x26ef, lsl #16
    cmp      w8, w9
    b.eq     #0x3472d8
    mov      w9, #0x456b
    movk     w9, #0x2fc3, lsl #16
    cmp      w8, w9
    b.ne     #0x346988
    adrp     x9, #0x54b000
    add      x9, x9, #0x8f2
    ldrb     w8, [x9]
    eor      w8, w8, #0xc0
    adrp     x10, #0x54b000
    add      x10, x10, #0x8fa
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w11, #0x6e
    eor      w8, w8, w11
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w11, #0xd8
    eor      w8, w8, w11
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    eor      w8, w8, #0xffffffc7
    strb     w8, [x10, #3]
    ldrb     w8, [x9, #4]
    mov      w11, #0x52
    eor      w8, w8, w11
    strb     w8, [x10, #4]
    ldrb     w8, [x9, #5]
    eor      w8, w8, #0xdddddddd
    strb     w8, [x10, #5]
    ldrb     w8, [x9, #6]
    eor      w8, w8, #0x77777777
    strb     w8, [x10, #6]
    ldrb     w8, [x20]
    mov      w9, #0x98
    eor      w8, w8, w9
    strb     w8, [x19]
    ldrb     w8, [x20, #1]
    mov      w9, #0xa4
    eor      w8, w8, w9
    strb     w8, [x19, #1]
    ldrb     w8, [x20, #2]
    mov      w9, #0xde
    eor      w8, w8, w9
    strb     w8, [x19, #2]
    ldrb     w8, [x20, #3]
    eor      w8, w8, #0x99999999
    strb     w8, [x19, #3]
    ldrb     w8, [x20, #4]
    mov      w9, #0x6f
    eor      w8, w8, w9
    strb     w8, [x19, #4]
    ldrb     w8, [x20, #5]
    mov      w9, #0xb1
    eor      w8, w8, w9
    strb     w8, [x19, #5]
    ldrb     w8, [x20, #6]
    mov      w9, #0x19
    eor      w8, w8, w9
    strb     w8, [x19, #6]
    ldrb     w8, [x20, #7]
    mov      w9, #0xda
    eor      w8, w8, w9
    strb     w8, [x19, #7]
    ldrb     w8, [x20, #8]
    eor      w8, w8, #0x80
    strb     w8, [x19, #8]
    ldrb     w8, [x20, #9]
    eor      w8, w8, #0xfffffffd
    strb     w8, [x19, #9]
    ldrb     w8, [x20, #0xa]
    mov      w9, #0x2d
    eor      w8, w8, w9
    strb     w8, [x19, #0xa]
    ldrb     w8, [x20, #0xb]
    eor      w8, w8, #0xffffffdf
    strb     w8, [x19, #0xb]
    ldrb     w8, [x20, #0xc]
    mov      w9, #0x43
    eor      w8, w8, w9
    strb     w8, [x19, #0xc]
    ldrb     w8, [x20, #0xd]
    eor      w8, w8, #0xf0
    strb     w8, [x19, #0xd]
    ldrb     w8, [x20, #0xe]
    mov      w9, #0x37
    eor      w8, w8, w9
    strb     w8, [x19, #0xe]
    ldrb     w8, [x20, #0xf]
    eor      w8, w8, #0x78
    sturb    w8, [x29, #-0x56]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xa09f
    movk     w9, #0x3b59, lsl #16
    str      w9, [x8]
    b        #0x346988
    mov      w9, #0x1269
    movk     w9, #0x58d1, lsl #16
    cmp      w8, w9
    b.le     #0x346f7c
    mov      w9, #0x126a
    movk     w9, #0x58d1, lsl #16
    cmp      w8, w9
    b.eq     #0x3471e4
    mov      w9, #0x173d
    movk     w9, #0x5b81, lsl #16
    cmp      w8, w9
    b.eq     #0x3472fc
    mov      w9, #0x6c23
    movk     w9, #0x74ea, lsl #16
    cmp      w8, w9
    b.ne     #0x346988
    ldr      x0, [sp, #0x68]
    ldr      x1, [sp, #0x28]
    adrp     x2, #0x54b000
    add      x2, x2, #0x970
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp, #0x10]
    mov      w9, #0x6f7e
    movk     w9, #0xb548, lsl #16
    csel     w9, w26, w9, ne
    str      w9, [x8]
    mov      w8, #1
    strb     w8, [sp, #0x25]
    b        #0x346988
    mov      w9, #0x219b
    movk     w9, #0xc82a, lsl #16
    cmp      w8, w9
    b.le     #0x346fc8
    mov      w9, #0x219c
    movk     w9, #0xc82a, lsl #16
    cmp      w8, w9
    b.eq     #0x347008
    mov      w9, #0xdb1d
    movk     w9, #0xcda4, lsl #16
    cmp      w8, w9
    b.ne     #0x347324
    ldr      x0, [sp, #0x68]
    bl       #0x347534
    strb     w0, [sp, #0x56]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xb4af
    movk     w9, #0xaa85, lsl #16
    str      w9, [x8]
    b        #0x346988
    mov      w9, #0x22ce
    movk     w9, #0xd04e, lsl #16
    cmp      w8, w9
    b.eq     #0x347040
    mov      w9, #0x4a90
    movk     w9, #0xd5bb, lsl #16
    cmp      w8, w9
    b.ne     #0x346988
    ldrb     w8, [sp, #0x47]
    cmp      w8, #0
    mov      w8, #0x3783
    movk     w8, #0xc6b7, lsl #16
    csel     w8, w25, w8, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    mov      w8, #1
    strb     w8, [sp, #0x24]
    b        #0x346988
    mov      w9, #0x79fa
    movk     w9, #0x8221, lsl #16
    cmp      w8, w9
    b.eq     #0x347060
    mov      w9, #0xf14c
    movk     w9, #0x83a2, lsl #16
    cmp      w8, w9
    b.ne     #0x346988
    ldr      x8, [sp, #0x38]
    cmp      x8, #1
    mov      w8, #0xa1b1
    movk     w8, #0xdb72, lsl #16
    b        #0x346f74
    mov      w9, #0xb4af
    movk     w9, #0xaa85, lsl #16
    cmp      w8, w9
    b.eq     #0x347080
    mov      w9, #0xd629
    movk     w9, #0xae0a, lsl #16
    cmp      w8, w9
    b.ne     #0x346988
    ldr      x8, [sp, #0x10]
    str      w25, [x8]
    ldrb     w8, [sp, #0x36]
    strb     w8, [sp, #0x24]
    b        #0x346988
    mov      w9, #0xebb4
    movk     w9, #0x256, lsl #16
    cmp      w8, w9
    b.eq     #0x347094
    mov      w9, #0xf665
    movk     w9, #0x332, lsl #16
    cmp      w8, w9
    b.ne     #0x346988
    ldr      x8, [sp, #0x38]
    cmp      x8, #3
    mov      w8, #0x79fa
    movk     w8, #0x8221, lsl #16
    mov      w9, #0x173d
    movk     w9, #0x5b81, lsl #16
    b        #0x347314
    mov      w9, #0x1083
    movk     w9, #0x35f3, lsl #16
    cmp      w8, w9
    b.eq     #0x3470a8
    mov      w9, #0xea21
    movk     w9, #0x3642, lsl #16
    cmp      w8, w9
    b.ne     #0x346988
    ldr      x8, [sp, #0x10]
    mov      w9, #0xf665
    movk     w9, #0x332, lsl #16
    str      w9, [x8]
    b        #0x346988
    mov      w9, #0xca6e
    movk     w9, #0x15e6, lsl #16
    cmp      w8, w9
    b.eq     #0x3470cc
    mov      w9, #0x3902
    movk     w9, #0x18bd, lsl #16
    cmp      w8, w9
    b.ne     #0x346988
    ldr      x8, [sp, #0x38]
    cmp      x8, #4
    mov      w8, #0x22ce
    movk     w8, #0xd04e, lsl #16
    csel     w8, w8, w25, eq
    b        #0x3472ec
    mov      w9, #0x3b8e
    movk     w9, #0x43a7, lsl #16
    cmp      w8, w9
    b.eq     #0x3470fc
    mov      w9, #0x7c6a
    movk     w9, #0x4a05, lsl #16
    cmp      w8, w9
    b.ne     #0x346988
    adrp     x8, #0x581000
    add      x8, x8, #0x220
    mov      w9, #1
    stlr     w9, [x8]
    ldr      x0, [sp]
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp, #0x10]
    mov      w9, #0x3b8e
    movk     w9, #0x43a7, lsl #16
    str      w9, [x8]
    b        #0x346988
    mov      w9, #0x839b
    movk     w9, #0xb95b, lsl #16
    cmp      w8, w9
    b.eq     #0x3471f8
    mov      w9, #0x3783
    movk     w9, #0xc6b7, lsl #16
    cmp      w8, w9
    b.ne     #0x346988
    ldr      x8, [sp, #0x58]
    ldr      x8, [x8]
    str      x8, [sp, #0x38]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xea21
    movk     w9, #0x3642, lsl #16
    str      w9, [x8]
    b        #0x346988
    ldur     x1, [x29, #-0x60]
    ldr      x0, [sp, #8]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp, #0x10]
    mov      w9, #0x14a8
    movk     w9, #0xce3f, lsl #16
    mov      w10, #0xcdb1
    movk     w10, #0x8e78, lsl #16
    csel     w9, w9, w10, ne
    str      w9, [x8]
    mov      w8, #1
    strb     w8, [sp, #0x23]
    b        #0x346988
    ldr      x0, [sp, #0x68]
    bl       #0x347534
    strb     w0, [sp, #0x26]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xebb4
    movk     w9, #0x256, lsl #16
    str      w9, [x8]
    b        #0x346988
    ldr      x8, [sp, #0x38]
    cmp      x8, #2
    mov      w8, #0x93d1
    movk     w8, #0x373e, lsl #16
    mov      w9, #0xf14c
    movk     w9, #0x83a2, lsl #16
    csel     w8, w9, w8, lt
    b        #0x347318
    ldr      x8, [sp, #0x10]
    str      w25, [x8]
    ldrb     w8, [sp, #0x56]
    strb     w8, [sp, #0x24]
    b        #0x346988
    ldr      x8, [sp, #0x10]
    str      w25, [x8]
    ldrb     w8, [sp, #0x26]
    strb     w8, [sp, #0x24]
    b        #0x346988
    ldur     w8, [x29, #-0x54]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x55]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xdbcb
    movk     w9, #0xcc0, lsl #16
    str      w9, [x8]
    b        #0x346988
    ldr      x8, [sp, #0x48]
    ldr      x0, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xa08]
    ldr      x2, [sp, #0x68]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x47]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x4a90
    movk     w9, #0xd5bb, lsl #16
    str      w9, [x8]
    b        #0x346988
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xd00]
    stur     x8, [x29, #-0x60]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x219c
    movk     w9, #0xc82a, lsl #16
    str      w9, [x8]
    b        #0x346988
    ldr      x0, [sp, #0x68]
    bl       #0x347b80
    strb     w0, [sp, #0x37]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x25d4
    movk     w9, #0x759, lsl #16
    str      w9, [x8]
    b        #0x346988
    ldr      x0, [sp]
    bl       #0x347364
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x68]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x8cf
    movk     w9, #0x9e8a, lsl #16
    str      w9, [x8]
    b        #0x346988
    ldr      x8, [sp, #8]
    add      x8, x8, #0x18
    str      x8, [sp, #0x48]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xca6e
    movk     w9, #0x15e6, lsl #16
    str      w9, [x8]
    b        #0x346988
    ldr      x8, [sp, #0x10]
    str      w25, [x8]
    ldrb     w8, [sp, #0x37]
    strb     w8, [sp, #0x24]
    b        #0x346988
    ldr      x0, [sp, #0x68]
    bl       #0x3483cc
    strb     w0, [sp, #0x36]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xd629
    movk     w9, #0xae0a, lsl #16
    str      w9, [x8]
    b        #0x346988
    ldrb     w26, [sp, #0x24]
    ldr      x0, [sp, #0x68]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    mov      w9, #0x14a8
    movk     w9, #0xce3f, lsl #16
    str      w9, [x8]
    strb     w26, [sp, #0x23]
    mov      w26, #0xc6f0
    movk     w26, #0x9b2, lsl #16
    b        #0x346988
    ldr      x8, [sp, #0x10]
    str      w26, [x8]
    ldrb     w8, [sp, #0x27]
    strb     w8, [sp, #0x25]
    b        #0x346988
    ldr      x0, [sp, #0x68]
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp, #0x10]
    mov      w9, #0x1337
    movk     w9, #0xb6c5, lsl #16
    str      w9, [x8]
    b        #0x346988
    ldrb     w8, [sp, #0x57]
    cmp      w8, #0
    mov      w8, #0x8053
    movk     w8, #0xaf1e, lsl #16
    mov      w9, #0xdb1d
    movk     w9, #0xcda4, lsl #16
    csel     w8, w9, w8, ne
    b        #0x347318
    adrp     x8, #0x54b000
    ldrb     w8, [x8, #0x8f1]
    mov      w9, #0x75
    eor      w8, w8, w9
    adrp     x9, #0x54b000
    strb     w8, [x9, #0x8f9]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x456b
    movk     w9, #0x2fc3, lsl #16
    str      w9, [x8]
    b        #0x346988
    ldr      x0, [sp, #0x68]
    ldr      x1, [sp, #0x28]
    adrp     x2, #0x54b000
    add      x2, x2, #0x930
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x27]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x126a
    movk     w9, #0x58d1, lsl #16
    str      w9, [x8]
    b        #0x346988
    ldrb     w26, [sp, #0x25]
    ldr      x0, [sp, #0x68]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    str      w25, [x8]
    strb     w26, [sp, #0x24]
    mov      w26, #0xc6f0
    movk     w26, #0x9b2, lsl #16
    b        #0x346988
    ldr      x8, [sp, #0x58]
    ldr      x8, [x8]
    cmp      x8, #4
    cset     w8, eq
    strb     w8, [sp, #0x57]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x665c
    movk     w9, #0xf46d, lsl #16
    str      w9, [x8]
    b        #0x346988
    ldrb     w8, [sp, #0x67]
    cmp      w8, #0
    mov      w8, #0x6503
    movk     w8, #0xf7ad, lsl #16
    csel     w8, w25, w8, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    strb     wzr, [sp, #0x24]
    b        #0x346988
    ldr      x8, [sp, #0x38]
    cmp      x8, #4
    mov      w8, #0x839b
    movk     w8, #0xb95b, lsl #16
    mov      w9, #0x3902
    movk     w9, #0x18bd, lsl #16
    csel     w8, w8, w9, lt
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x346988
    mov      w9, #0x14a8
    movk     w9, #0xce3f, lsl #16
    cmp      w8, w9
    b.ne     #0x346988
    ldrb     w20, [sp, #0x23]
    ldr      x0, [sp]
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0xd0]
    ldp      x20, x19, [sp, #0xc0]
    ldp      x22, x21, [sp, #0xb0]
    ldp      x24, x23, [sp, #0xa0]
    ldp      x26, x25, [sp, #0x90]
    ldp      x28, x27, [sp, #0x80]
    add      sp, sp, #0xe0
    ret      

// -[WCLGSessionGroup containsSessionUsername:unreadCount:muted:showMutedUnread:] IMP=0x348844 bounds=0x348844-0x348CF8
loc_348844:
    sub      sp, sp, #0xd0
    stp      x28, x27, [sp, #0x70]
    stp      x26, x25, [sp, #0x80]
    stp      x24, x23, [sp, #0x90]
    stp      x22, x21, [sp, #0xa0]
    stp      x20, x19, [sp, #0xb0]
    stp      x29, x30, [sp, #0xc0]
    add      x29, sp, #0xc0
    mov      x19, x5
    mov      x20, x4
    str      x3, [sp, #0x10]
    mov      x23, x2
    mov      x21, x0
    mov      w24, #0x2657
    movk     w24, #0xf214, lsl #16
    mov      w26, #0xe88b
    movk     w26, #0xee40, lsl #16
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      w9, #0xc921
    movk     w9, #0xaad5, lsl #16
    add      x8, sp, #0x20
    str      w9, [sp, #0x20]
    mov      w28, #0x5153
    movk     w28, #0xeff1, lsl #16
    mov      w22, #0xc8f9
    movk     w22, #0xc019, lsl #16
    str      x8, [sp, #0x18]
    mov      w27, #0xbae6
    movk     w27, #0xd0d6, lsl #16
    orn      w8, w19, w20
    and      w8, w8, #1
    str      w8, [sp, #0xc]
    mov      w25, #0xe318
    movk     w25, #0x1c3e, lsl #16
    mov      w20, #0x2656
    movk     w20, #0xf214, lsl #16
    mov      w19, #0x2bf5
    movk     w19, #0x429c, lsl #16
    ldr      w8, [sp, #0x20]
    cmp      w8, w28
    b.le     #0x348940
    cmp      w8, w25
    b.gt     #0x3489ac
    cmp      w8, w20
    b.le     #0x348b20
    cmp      w8, w24
    b.eq     #0x348c74
    mov      w9, #0x15dc
    movk     w9, #0x806, lsl #16
    cmp      w8, w9
    b.eq     #0x348c58
    mov      w9, #0xec23
    movk     w9, #0x110c, lsl #16
    cmp      w8, w9
    b.ne     #0x3488e0
    ldr      x8, [sp, #0x18]
    mov      w9, #0xe319
    movk     w9, #0x1c3e, lsl #16
    str      w9, [x8]
    ldrb     w8, [sp, #0x4f]
    strb     w8, [sp, #0x24]
    b        #0x3488e0
    cmp      w8, w22
    b.le     #0x3489f4
    cmp      w8, w27
    b.le     #0x348ad8
    mov      w9, #0xbae7
    movk     w9, #0xd0d6, lsl #16
    cmp      w8, w9
    b.eq     #0x348bf4
    mov      w9, #0x6c9d
    movk     w9, #0xd580, lsl #16
    cmp      w8, w9
    b.eq     #0x348bac
    cmp      w8, w26
    b.ne     #0x3488e0
    mov      x26, x23
    ldrb     w23, [sp, #0x25]
    ldr      x0, [sp, #0x40]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x18]
    mov      w9, #0xe319
    movk     w9, #0x1c3e, lsl #16
    str      w9, [x8]
    strb     w23, [sp, #0x24]
    mov      x23, x26
    mov      w26, #0xe88b
    movk     w26, #0xee40, lsl #16
    b        #0x3488e0
    cmp      w8, w19
    b.gt     #0x348a90
    mov      w9, #0xda55
    movk     w9, #0x26ce, lsl #16
    cmp      w8, w9
    b.eq     #0x348c38
    mov      w9, #0xce6d
    movk     w9, #0x3a8f, lsl #16
    cmp      w8, w9
    b.ne     #0x348cb8
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xee0]
    str      x8, [sp, #0x50]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x9364
    movk     w9, #0xceef, lsl #16
    str      w9, [x8]
    b        #0x3488e0
    mov      w9, #0x2975
    movk     w9, #0xa5da, lsl #16
    cmp      w8, w9
    b.gt     #0x348a48
    mov      w9, #0x8ad2
    movk     w9, #0x8770, lsl #16
    cmp      w8, w9
    b.eq     #0x348b70
    mov      w9, #0xa085
    movk     w9, #0x9a39, lsl #16
    cmp      w8, w9
    b.ne     #0x3488e0
    ldr      x8, [sp, #0x40]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3f]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x5154
    movk     w9, #0xeff1, lsl #16
    str      w9, [x8]
    b        #0x3488e0
    mov      w9, #0x2976
    movk     w9, #0xa5da, lsl #16
    cmp      w8, w9
    b.eq     #0x348b8c
    mov      w9, #0xc921
    movk     w9, #0xaad5, lsl #16
    cmp      w8, w9
    b.ne     #0x3488e0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd00]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    sturb    w0, [x29, #-0x51]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x9556
    movk     w9, #0xf058, lsl #16
    str      w9, [x8]
    b        #0x3488e0
    mov      w9, #0x2bf6
    movk     w9, #0x429c, lsl #16
    cmp      w8, w9
    b.eq     #0x348bd4
    mov      w9, #0x3f1b
    movk     w9, #0x6814, lsl #16
    cmp      w8, w9
    b.ne     #0x3488e0
    mov      x0, x23
    bl       #0x347364
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x40]
    ldr      x8, [sp, #0x18]
    mov      w9, #0xa085
    movk     w9, #0x9a39, lsl #16
    str      w9, [x8]
    b        #0x3488e0
    mov      w9, #0xc8fa
    movk     w9, #0xc019, lsl #16
    cmp      w8, w9
    b.eq     #0x348c10
    mov      w9, #0x9364
    movk     w9, #0xceef, lsl #16
    cmp      w8, w9
    b.ne     #0x3488e0
    ldr      x1, [sp, #0x50]
    mov      x0, x21
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x4f]
    ldr      x8, [sp, #0x18]
    mov      w9, #0xec23
    movk     w9, #0x110c, lsl #16
    str      w9, [x8]
    b        #0x3488e0
    mov      w9, #0x5154
    movk     w9, #0xeff1, lsl #16
    cmp      w8, w9
    b.eq     #0x348c98
    mov      w9, #0x9556
    movk     w9, #0xf058, lsl #16
    cmp      w8, w9
    b.ne     #0x3488e0
    ldurb    w8, [x29, #-0x51]
    cmp      w8, #0
    mov      w8, #0xe319
    movk     w8, #0x1c3e, lsl #16
    mov      w9, #0x15dc
    movk     w9, #0x806, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [sp, #0x18]
    str      w8, [x9]
    mov      w8, #1
    strb     w8, [sp, #0x24]
    b        #0x3488e0
    ldr      x8, [x21, #0x18]
    str      x8, [sp, #0x30]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x2976
    movk     w9, #0xa5da, lsl #16
    str      w9, [x8]
    b        #0x3488e0
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xa08]
    str      x8, [sp, #0x28]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x6c9d
    movk     w9, #0xd580, lsl #16
    str      w9, [x8]
    b        #0x3488e0
    ldr      x2, [sp, #0x40]
    ldp      x1, x0, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp, #0x18]
    csel     w9, w26, w24, ne
    str      w9, [x8]
    mov      w8, #1
    strb     w8, [sp, #0x25]
    b        #0x3488e0
    ldrb     w8, [sp, #0x27]
    ldrb     w9, [sp, #0x26]
    and      w8, w8, w9
    ldr      x9, [sp, #0x18]
    str      w26, [x9]
    and      w8, w8, #1
    strb     w8, [sp, #0x25]
    b        #0x3488e0
    ldr      w8, [sp, #0xc]
    strb     w8, [sp, #0x26]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x2bf6
    movk     w9, #0x429c, lsl #16
    str      w9, [x8]
    b        #0x3488e0
    ldr      x8, [sp, #0x60]
    ldr      x8, [x8]
    cmp      x8, #5
    cset     w8, eq
    strb     w8, [sp, #0x5f]
    ldr      x8, [sp, #0x18]
    mov      w9, #0xda55
    movk     w9, #0x26ce, lsl #16
    str      w9, [x8]
    b        #0x3488e0
    ldrb     w8, [sp, #0x5f]
    cmp      w8, #0
    mov      w8, #0xce6d
    movk     w8, #0x3a8f, lsl #16
    mov      w9, #0x3f1b
    movk     w9, #0x6814, lsl #16
    csel     w8, w9, w8, ne
    b        #0x348cac
    add      x8, x21, #0x20
    str      x8, [sp, #0x60]
    ldr      x8, [sp, #0x18]
    mov      w9, #0xc8fa
    movk     w9, #0xc019, lsl #16
    str      w9, [x8]
    b        #0x3488e0
    ldr      x8, [sp, #0x10]
    cmp      x8, #0
    cset     w8, gt
    strb     w8, [sp, #0x27]
    ldr      x8, [sp, #0x18]
    mov      w9, #0xbae7
    movk     w9, #0xd0d6, lsl #16
    str      w9, [x8]
    b        #0x3488e0
    ldrb     w8, [sp, #0x3f]
    cmp      w8, #0
    mov      w8, #0x8ad2
    movk     w8, #0x8770, lsl #16
    csel     w8, w24, w8, ne
    ldr      x9, [sp, #0x18]
    str      w8, [x9]
    b        #0x3488e0
    mov      w9, #0xe319
    movk     w9, #0x1c3e, lsl #16
    cmp      w8, w9
    b.ne     #0x3488e0
    ldrb     w20, [sp, #0x24]
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0xc0]
    ldp      x20, x19, [sp, #0xb0]
    ldp      x22, x21, [sp, #0xa0]
    ldp      x24, x23, [sp, #0x90]
    ldp      x26, x25, [sp, #0x80]
    ldp      x28, x27, [sp, #0x70]
    add      sp, sp, #0xd0
    ret      

// -[WCLGSessionGroup dictionaryRepresentation] IMP=0x348CF8 bounds=0x348CF8-0x3493A0
loc_348CF8:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x90
    mov      x19, x0
    mov      w20, #0x71f
    movk     w20, #0xf921, lsl #16
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    mov      w28, #0xc497
    movk     w28, #0xe5c3, lsl #16
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x581000
    add      x8, x8, #0x238
    ldar     w8, [x8]
    mov      w10, #0x5b33
    movk     w10, #0x36fb, lsl #16
    sub      x9, x29, #0xd4
    stur     w8, [x29, #-0x5c]
    mov      w26, #0xcd88
    movk     w26, #0xef1b, lsl #16
    mov      w27, #0xcc33
    movk     w27, #0xc57d, lsl #16
    stur     w10, [x29, #-0xd4]
    stur     x9, [x29, #-0xe0]
    mov      w21, #0x5217
    movk     w21, #0x45ea, lsl #16
    adrp     x24, #0x54b000
    add      x24, x24, #0xc6a
    adrp     x25, #0x54b000
    add      x25, x25, #0xc70
    adrp     x22, #0x54b000
    add      x22, x22, #0xc5a
    adrp     x23, #0x54b000
    add      x23, x23, #0xc62
    ldur     w8, [x29, #-0xd4]
    cmp      w8, w26
    b.le     #0x348e00
    cmp      w8, w21
    b.gt     #0x348ea8
    mov      w9, #0xc9c7
    movk     w9, #0x60b, lsl #16
    cmp      w8, w9
    b.le     #0x348f00
    mov      w9, #0xc9c8
    movk     w9, #0x60b, lsl #16
    cmp      w8, w9
    b.eq     #0x349134
    mov      w9, #0x5b33
    movk     w9, #0x36fb, lsl #16
    cmp      w8, w9
    b.ne     #0x349350
    ldur     w8, [x29, #-0x5c]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x5d]
    ldur     x8, [x29, #-0xe0]
    mov      w9, #0x9dc
    movk     w9, #0x8859, lsl #16
    str      w9, [x8]
    b        #0x348d98
    cmp      w8, w27
    b.gt     #0x348e44
    mov      w9, #0xa3a1
    movk     w9, #0xa47a, lsl #16
    cmp      w8, w9
    b.gt     #0x348f6c
    mov      w9, #0x9dc
    movk     w9, #0x8859, lsl #16
    cmp      w8, w9
    b.eq     #0x34917c
    mov      w9, #0xbd6f
    movk     w9, #0x998c, lsl #16
    cmp      w8, w9
    b.ne     #0x348d98
    ldur     x8, [x29, #-0xe0]
    str      w28, [x8]
    b        #0x348d98
    mov      w9, #0xc496
    movk     w9, #0xe5c3, lsl #16
    cmp      w8, w9
    b.gt     #0x348fc4
    mov      w9, #0xcc34
    movk     w9, #0xc57d, lsl #16
    cmp      w8, w9
    b.eq     #0x349194
    mov      w9, #0x214b
    movk     w9, #0xe1ba, lsl #16
    cmp      w8, w9
    b.ne     #0x348d98
    ldur     x8, [x29, #-0x80]
    cmp      x8, #0
    cset     w9, eq
    sturb    w9, [x29, #-0x81]
    mov      w9, #0xcc34
    movk     w9, #0xc57d, lsl #16
    mov      w10, #0xa125
    movk     w10, #0x53e3, lsl #16
    csel     w9, w10, w9, eq
    ldur     x10, [x29, #-0xe0]
    str      w9, [x10]
    stur     x8, [x29, #-0xc0]
    b        #0x348d98
    mov      w9, #0x767f
    movk     w9, #0x7543, lsl #16
    cmp      w8, w9
    b.gt     #0x348ff8
    mov      w9, #0x5218
    movk     w9, #0x45ea, lsl #16
    cmp      w8, w9
    b.eq     #0x3492d0
    mov      w9, #0xa125
    movk     w9, #0x53e3, lsl #16
    cmp      w8, w9
    b.ne     #0x348d98
    adrp     x8, #0x4c4000
    ldr      x9, [x8, #0x300]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0xa98]
    stp      x8, x9, [x29, #-0x98]
    ldur     x8, [x29, #-0xe0]
    mov      w9, #0xc9c8
    movk     w9, #0x60b, lsl #16
    str      w9, [x8]
    b        #0x348d98
    mov      w9, #0xcd89
    movk     w9, #0xef1b, lsl #16
    cmp      w8, w9
    b.eq     #0x34915c
    cmp      w8, w20
    b.ne     #0x348d98
    adrp     x8, #0x581000
    add      x8, x8, #0x238
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x20
    mov      sp, x8
    stur     x8, [x29, #-0x68]
    mov      x8, sp
    sub      x9, x8, #0x20
    mov      sp, x9
    stur     x9, [x29, #-0x70]
    adrp     x9, #0x54b000
    add      x9, x9, #0xd60
    stur     x9, [x8, #-0x20]
    add      x8, x19, #8
    stur     x8, [x29, #-0x78]
    ldur     x8, [x29, #-0xe0]
    mov      w9, #0xcd89
    movk     w9, #0xef1b, lsl #16
    str      w9, [x8]
    b        #0x348d98
    mov      w9, #0xa3a2
    movk     w9, #0xa47a, lsl #16
    cmp      w8, w9
    b.eq     #0x34928c
    mov      w9, #0xf8e7
    movk     w9, #0xabbf, lsl #16
    cmp      w8, w9
    b.ne     #0x348d98
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xaa0]
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldur     x8, [x29, #-0xe0]
    mov      w9, #0xcc34
    movk     w9, #0xc57d, lsl #16
    str      w9, [x8]
    ldur     x8, [x29, #-0xa0]
    stp      x0, x8, [x29, #-0xb8]
    stur     x0, [x29, #-0xc0]
    b        #0x348d98
    cmp      w8, w28
    b.eq     #0x3492b4
    mov      w9, #0x5979
    movk     w9, #0xe91d, lsl #16
    cmp      w8, w9
    b.ne     #0x348d98
    ldur     x0, [x29, #-0xd0]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0xe0]
    mov      w9, #0xbd6f
    movk     w9, #0x998c, lsl #16
    str      w9, [x8]
    b        #0x348d98
    mov      w9, #0x7680
    movk     w9, #0x7543, lsl #16
    cmp      w8, w9
    b.eq     #0x3492ec
    mov      w9, #0xf2d2
    movk     w9, #0x7f87, lsl #16
    cmp      w8, w9
    b.ne     #0x348d98
    adrp     x9, #0x54b000
    add      x9, x9, #0xc76
    ldrb     w8, [x9]
    mov      w10, #0x97
    eor      w8, w8, w10
    adrp     x10, #0x54b000
    add      x10, x10, #0xc79
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    eor      w8, w8, #1
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w9, #0x7b
    eor      w8, w8, w9
    strb     w8, [x10, #2]
    ldrb     w8, [x24]
    mov      w9, #0xf2
    eor      w8, w8, w9
    strb     w8, [x25]
    ldrb     w8, [x24, #1]
    eor      w8, w8, #0xffffffc7
    strb     w8, [x25, #1]
    ldrb     w8, [x24, #2]
    eor      w8, w8, #0xffffffdf
    strb     w8, [x25, #2]
    ldrb     w8, [x24, #3]
    mov      w9, #0x71
    eor      w8, w8, w9
    strb     w8, [x25, #3]
    ldrb     w8, [x24, #4]
    mov      w9, #0x5f
    eor      w8, w8, w9
    strb     w8, [x25, #4]
    ldrb     w8, [x24, #5]
    mov      w9, #0x67
    eor      w8, w8, w9
    strb     w8, [x25, #5]
    ldrb     w8, [x22]
    mov      w9, #0x2c
    eor      w8, w8, w9
    strb     w8, [x23]
    ldrb     w8, [x22, #1]
    eor      w8, w8, #0x78
    strb     w8, [x23, #1]
    ldrb     w8, [x22, #2]
    mov      w9, #0x9d
    eor      w8, w8, w9
    strb     w8, [x23, #2]
    ldrb     w8, [x22, #3]
    mov      w9, #0xa
    eor      w8, w8, w9
    strb     w8, [x23, #3]
    ldrb     w8, [x22, #4]
    mov      w9, #0xc6
    eor      w8, w8, w9
    strb     w8, [x23, #4]
    ldrb     w8, [x22, #5]
    mov      w9, #0xf4
    eor      w8, w8, w9
    strb     w8, [x23, #5]
    ldrb     w8, [x22, #6]
    mov      w9, #0xb8
    eor      w8, w8, w9
    strb     w8, [x23, #6]
    ldrb     w8, [x22, #7]
    sturb    w8, [x29, #-0x5e]
    ldur     x8, [x29, #-0xe0]
    mov      w9, #0xa3a2
    movk     w9, #0xa47a, lsl #16
    str      w9, [x8]
    b        #0x348d98
    ldp      x1, x0, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xa0]
    ldur     x8, [x29, #-0xe0]
    mov      w9, #0xf8e7
    movk     w9, #0xabbf, lsl #16
    str      w9, [x8]
    b        #0x348d98
    ldur     x8, [x29, #-0x78]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x80]
    ldur     x8, [x29, #-0xe0]
    mov      w9, #0x214b
    movk     w9, #0xe1ba, lsl #16
    str      w9, [x8]
    b        #0x348d98
    ldurb    w8, [x29, #-0x5d]
    cmp      w8, #0
    mov      w8, #0xf2d2
    movk     w8, #0x7f87, lsl #16
    csel     w8, w8, w20, ne
    b        #0x349280
    ldp      x8, x10, [x29, #-0xc0]
    ldur     x9, [x29, #-0xb0]
    stp      x9, x10, [x29, #-0xd0]
    ldur     x28, [x29, #-0x68]
    str      x8, [x28]
    ldur     x8, [x29, #-0x70]
    adrp     x9, #0x54b000
    add      x9, x9, #0xd20
    str      x9, [x8, #8]
    ldr      x9, [x19, #0x10]
    cmp      x9, #0
    adrp     x10, #0x4a6000
    add      x10, x10, #0xd8
    csel     x9, x10, x9, eq
    str      x9, [x28, #8]
    adrp     x9, #0x54b000
    add      x9, x9, #0xce0
    str      x9, [x8, #0x10]
    ldr      x9, [x19, #0x18]
    adrp     x10, #0x4a0000
    ldr      x10, [x10, #0x2d8]
    ldr      x10, [x10]
    cmp      x9, #0
    csel     x9, x10, x9, eq
    str      x9, [x28, #0x10]
    adrp     x9, #0x54b000
    add      x9, x9, #0xca0
    str      x9, [x8, #0x18]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    ldr      x2, [x19, #0x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    str      x0, [x28, #0x18]
    mov      w28, #0xc497
    movk     w28, #0xe5c3, lsl #16
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    ldp      x3, x2, [x29, #-0x70]
    mov      w4, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xa8]
    mov      x0, x20
    mov      w20, #0x71f
    movk     w20, #0xf921, lsl #16
    bl       #0x461c9c // _objc_release
    ldurb    w8, [x29, #-0x81]
    cmp      w8, #0
    mov      w8, #0x5218
    movk     w8, #0x45ea, lsl #16
    csel     w8, w8, w28, ne
    ldur     x9, [x29, #-0xe0]
    str      w8, [x9]
    b        #0x348d98
    ldurb    w8, [x29, #-0x5e]
    mov      w9, #0x94
    eor      w8, w8, w9
    adrp     x9, #0x54b000
    strb     w8, [x9, #0xc69]
    ldur     x8, [x29, #-0xe0]
    mov      w9, #0x7680
    movk     w9, #0x7543, lsl #16
    str      w9, [x8]
    b        #0x348d98
    ldur     x0, [x29, #-0xa8]
    bl       #0x461be8 // _objc_autoreleaseReturnValue
    ldur     x8, [x29, #-0xe0]
    mov      w9, #0xdece
    movk     w9, #0x20a0, lsl #16
    str      w9, [x8]
    b        #0x348d98
    ldur     x0, [x29, #-0xc8]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0xe0]
    mov      w9, #0x5979
    movk     w9, #0xe91d, lsl #16
    str      w9, [x8]
    b        #0x348d98
    adrp     x9, #0x54b000
    add      x9, x9, #0xc50
    ldrb     w8, [x9]
    mov      w10, #0x1b
    eor      w8, w8, w10
    adrp     x10, #0x54b000
    add      x10, x10, #0xc55
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w11, #0x65
    eor      w8, w8, w11
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    eor      w8, w8, #0xf8
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    mov      w11, #0x61
    eor      w8, w8, w11
    strb     w8, [x10, #3]
    ldrb     w8, [x9, #4]
    eor      w8, w8, #0x3e
    strb     w8, [x10, #4]
    ldur     x8, [x29, #-0xe0]
    str      w20, [x8]
    b        #0x348d98
    mov      w9, #0xdece
    movk     w9, #0x20a0, lsl #16
    cmp      w8, w9
    b.ne     #0x348d98
    ldur     x0, [x29, #-0xa8]
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x34939c
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGSessionGroup groupID] IMP=0x34A3CC bounds=0x34A3CC-0x34A430
loc_34A3CC:
    sub      sp, sp, #0x20
    add      x8, x0, #8
    str      x8, [sp, #0x18]
    mov      w8, #0x2b1
    movk     w8, #0x34b1, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x448e
    movk     w9, #0x4edc, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x34a40c
    cmp      w10, w9
    b.ne     #0x34a3f4
    b        #0x34a424
    ldr      x10, [sp, #0x18]
    ldr      x10, [x10]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x34a3f4
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGSessionGroup setGroupID:] IMP=0x34A430 bounds=0x34A430-0x34A478
loc_34A430:
    sub      sp, sp, #0x30
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      w19, #0xbc69
    movk     w19, #0x6542, lsl #16
    mov      w3, #8
    bl       #0x461cf0 // _objc_setProperty_nonatomic_copy
    str      w19, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w8, w19
    cmp      w8, w19
    b.ne     #0x34a460
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    add      sp, sp, #0x30
    ret      

// -[WCLGSessionGroup title] IMP=0x34A478 bounds=0x34A478-0x34A4DC
loc_34A478:
    sub      sp, sp, #0x20
    add      x8, x0, #0x10
    str      x8, [sp, #0x18]
    mov      w8, #0xe5a
    movk     w8, #0x7741, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0xdb26
    movk     w9, #0xa8b8, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x34a4b8
    cmp      w10, w9
    b.ne     #0x34a4a0
    b        #0x34a4d0
    ldr      x10, [sp, #0x18]
    ldr      x10, [x10]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x34a4a0
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGSessionGroup setTitle:] IMP=0x34A4DC bounds=0x34A4DC-0x34A524
loc_34A4DC:
    sub      sp, sp, #0x30
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      w19, #0x3fe3
    movk     w19, #0xebde, lsl #16
    mov      w3, #0x10
    bl       #0x461cf0 // _objc_setProperty_nonatomic_copy
    str      w19, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w8, w19
    cmp      w8, w19
    b.ne     #0x34a50c
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    add      sp, sp, #0x30
    ret      

// -[WCLGSessionGroup members] IMP=0x34A524 bounds=0x34A524-0x34A588
loc_34A524:
    sub      sp, sp, #0x20
    add      x8, x0, #0x18
    str      x8, [sp, #0x18]
    mov      w8, #0x6f1d
    movk     w8, #0x45a8, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0xe579
    movk     w9, #0xff97, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x34a564
    cmp      w10, w9
    b.ne     #0x34a54c
    b        #0x34a57c
    ldr      x10, [sp, #0x18]
    ldr      x10, [x10]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x34a54c
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGSessionGroup setMembers:] IMP=0x34A588 bounds=0x34A588-0x34A5D0
loc_34A588:
    sub      sp, sp, #0x30
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      w19, #0xc0bf
    movk     w19, #0x75f7, lsl #16
    mov      w3, #0x18
    bl       #0x461cf0 // _objc_setProperty_nonatomic_copy
    str      w19, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w8, w19
    cmp      w8, w19
    b.ne     #0x34a5b8
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    add      sp, sp, #0x30
    ret      

// -[WCLGSessionGroup rule] IMP=0x34A5D0 bounds=0x34A5D0-0x34A634
loc_34A5D0:
    sub      sp, sp, #0x20
    add      x8, x0, #0x20
    str      x8, [sp, #0x18]
    mov      w8, #0x1bc5
    movk     w8, #0x6407, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x6fb5
    movk     w9, #0x5aaf, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x34a610
    cmp      w10, w9
    b.ne     #0x34a5f8
    b        #0x34a628
    ldr      x10, [sp, #0x18]
    ldr      x10, [x10]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x34a5f8
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGSessionGroup setRule:] IMP=0x34A634 bounds=0x34A634-0x34A690
loc_34A634:
    sub      sp, sp, #0x20
    add      x8, x0, #0x20
    str      x8, [sp, #0x18]
    mov      w8, #0xd3f4
    movk     w8, #0xf0a4, lsl #16
    str      w8, [sp, #0x14]
    add      x9, sp, #0x14
    str      x9, [sp, #8]
    mov      w9, #0x5bf5
    movk     w9, #0x7752, lsl #16
    ldr      w10, [sp, #0x14]
    cmp      w10, w8
    b.eq     #0x34a674
    cmp      w10, w9
    b.ne     #0x34a65c
    b        #0x34a688
    ldr      x10, [sp, #0x18]
    str      x2, [x10]
    ldr      x10, [sp, #8]
    str      w9, [x10]
    b        #0x34a65c
    add      sp, sp, #0x20
    ret      

// -[WCLGSessionGroup .cxx_destruct] IMP=0x34A690 bounds=0x34A690-0x34A724
loc_34A690:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    add      x8, x0, #0x18
    str      x8, [sp, #0x18]
    mov      w20, #0xe0ca
    movk     w20, #0xfa2f, lsl #16
    str      w20, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w21, #0xa3d0
    movk     w21, #0x7788, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w20
    b.eq     #0x34a6e4
    cmp      w8, w21
    b.ne     #0x34a6cc
    b        #0x34a6fc
    ldr      x0, [sp, #0x18]
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x34a6cc
    add      x0, x19, #0x10
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    b        #0x461cfc // _objc_storeStrong
