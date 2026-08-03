// Exact ARM64 listing for WCLGNativeProfileTitleTapTarget

// -[WCLGNativeProfileTitleTapTarget wclg_nativeProfileTitleTapped:] IMP=0x1DB8D0 bounds=0x1DB8D0-0x1DCF8C
loc_1DB8D0:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x50
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x17, #0x57e000
    add      x17, x17, #0xe50
    ldar     w8, [x17]
    cbnz     w8, #0x1dca64
    adrp     x8, #0x509000
    add      x8, x8, #0xab0
    ldrb     w9, [x8]
    mov      w10, #0xae
    eor      w10, w9, w10
    adrp     x9, #0x509000
    add      x9, x9, #0xad0
    strb     w10, [x9]
    ldrb     w10, [x8, #1]
    eor      w10, w10, #0xffffffe3
    strb     w10, [x9, #1]
    ldrb     w10, [x8, #2]
    eor      w10, w10, #0x66666666
    strb     w10, [x9, #2]
    ldrb     w10, [x8, #3]
    mov      w11, #0x15
    eor      w10, w10, w11
    strb     w10, [x9, #3]
    ldrb     w10, [x8, #4]
    mov      w11, #0x35
    eor      w10, w10, w11
    strb     w10, [x9, #4]
    ldrb     w10, [x8, #5]
    eor      w10, w10, #0xdddddddd
    strb     w10, [x9, #5]
    ldrb     w10, [x8, #6]
    mov      w11, #0x2d
    eor      w10, w10, w11
    mov      w4, #0x2d
    strb     w10, [x9, #6]
    ldrb     w10, [x8, #7]
    mov      w11, #0x6b
    eor      w10, w10, w11
    strb     w10, [x9, #7]
    ldrb     w10, [x8, #8]
    mov      w11, #0xad
    eor      w10, w10, w11
    strb     w10, [x9, #8]
    ldrb     w10, [x8, #9]
    mov      w26, #0x1a
    eor      w10, w10, w26
    strb     w10, [x9, #9]
    ldrb     w10, [x8, #0xa]
    mov      w25, #0xa8
    eor      w10, w10, w25
    strb     w10, [x9, #0xa]
    ldrb     w10, [x8, #0xb]
    eor      w10, w10, #0xfffffffd
    strb     w10, [x9, #0xb]
    ldrb     w10, [x8, #0xc]
    mov      w11, #0xb9
    eor      w10, w10, w11
    strb     w10, [x9, #0xc]
    ldrb     w10, [x8, #0xd]
    mov      w12, #0xa3
    eor      w10, w10, w12
    strb     w10, [x9, #0xd]
    ldrb     w10, [x8, #0xe]
    mov      w11, #0xed
    eor      w10, w10, w11
    strb     w10, [x9, #0xe]
    ldrb     w10, [x8, #0xf]
    eor      w10, w10, #0xffffffe1
    strb     w10, [x9, #0xf]
    ldrb     w10, [x8, #0x10]
    eor      w10, w10, #0x7e
    strb     w10, [x9, #0x10]
    ldrb     w8, [x8, #0x11]
    mov      w3, #0xec
    eor      w8, w8, w3
    strb     w8, [x9, #0x11]
    adrp     x8, #0x509000
    add      x8, x8, #0xa91
    ldrb     w9, [x8]
    mov      w10, #0xba
    eor      w9, w9, w10
    adrp     x10, #0x509000
    add      x10, x10, #0xa99
    strb     w9, [x10]
    ldrb     w9, [x8, #1]
    mov      w11, #0x8c
    eor      w9, w9, w11
    strb     w9, [x10, #1]
    ldrb     w11, [x8, #2]
    mov      w9, #0x5c
    eor      w11, w11, w9
    strb     w11, [x10, #2]
    ldrb     w11, [x8, #3]
    mov      w13, #0xb4
    eor      w11, w11, w13
    strb     w11, [x10, #3]
    ldrb     w11, [x8, #4]
    mov      w13, #0x82
    eor      w11, w11, w13
    strb     w11, [x10, #4]
    ldrb     w11, [x8, #5]
    mov      w13, #0x2e
    eor      w11, w11, w13
    strb     w11, [x10, #5]
    ldrb     w11, [x8, #6]
    mov      w14, #0x45
    eor      w11, w11, w14
    strb     w11, [x10, #6]
    ldrb     w8, [x8, #7]
    eor      w8, w8, #0x11111111
    strb     w8, [x10, #7]
    adrp     x8, #0x509000
    add      x8, x8, #0xa60
    ldrb     w10, [x8]
    mov      w0, #0xe5
    adrp     x13, #0x509000
    add      x13, x13, #0xa80
    eor      w10, w10, w0
    strb     w10, [x13]
    ldrb     w10, [x8, #1]
    eor      w10, w10, #0xfffffffb
    strb     w10, [x13, #1]
    ldrb     w10, [x8, #2]
    eor      w10, w10, #0xffffffbf
    strb     w10, [x13, #2]
    ldrb     w10, [x8, #3]
    mov      w11, #0xc9
    eor      w10, w10, w11
    strb     w10, [x13, #3]
    ldrb     w11, [x8, #4]
    mov      w10, #0x93
    eor      w11, w11, w10
    strb     w11, [x13, #4]
    ldrb     w11, [x8, #5]
    mov      w15, #0xb7
    eor      w11, w11, w15
    strb     w11, [x13, #5]
    ldrb     w11, [x8, #6]
    mov      w15, #0xab
    eor      w11, w11, w15
    strb     w11, [x13, #6]
    ldrb     w15, [x8, #7]
    mov      w11, #0x5a
    eor      w15, w15, w11
    strb     w15, [x13, #7]
    ldrb     w15, [x8, #8]
    mov      w16, #0x46
    eor      w15, w15, w16
    strb     w15, [x13, #8]
    ldrb     w15, [x8, #9]
    mov      w16, #0x25
    eor      w15, w15, w16
    strb     w15, [x13, #9]
    ldrb     w15, [x8, #0xa]
    mov      w30, #0x29
    eor      w15, w15, w30
    strb     w15, [x13, #0xa]
    ldrb     w15, [x8, #0xb]
    eor      w15, w15, #0x20
    strb     w15, [x13, #0xb]
    ldrb     w15, [x8, #0xc]
    mov      w16, #0x37
    eor      w15, w15, w16
    strb     w15, [x13, #0xc]
    ldrb     w15, [x8, #0xd]
    eor      w15, w15, #0xffffff8f
    strb     w15, [x13, #0xd]
    ldrb     w15, [x8, #0xe]
    mov      w16, #0x3b
    eor      w15, w15, w16
    strb     w15, [x13, #0xe]
    ldrb     w15, [x8, #0xf]
    mov      w16, #0xa9
    eor      w15, w15, w16
    strb     w15, [x13, #0xf]
    ldrb     w8, [x8, #0x10]
    eor      w8, w8, #0xe0
    strb     w8, [x13, #0x10]
    adrp     x2, #0x509000
    add      x2, x2, #0xa00
    ldrb     w8, [x2]
    adrp     x1, #0x509000
    add      x1, x1, #0xa20
    eor      w8, w8, #0xfffffff7
    strb     w8, [x1]
    ldrb     w8, [x2, #1]
    eor      w8, w8, #0x3c
    strb     w8, [x1, #1]
    ldrb     w8, [x2, #2]
    mov      w27, #0x50
    eor      w8, w8, w27
    strb     w8, [x1, #2]
    ldrb     w8, [x2, #3]
    mov      w13, #0x1d
    eor      w8, w8, w13
    mov      w7, #0x1d
    strb     w8, [x1, #3]
    ldrb     w8, [x2, #4]
    stur     x20, [x29, #-0x60]
    mov      w20, #0x7b
    eor      w8, w8, w20
    strb     w8, [x1, #4]
    ldrb     w8, [x2, #5]
    mov      w13, #0x6d
    eor      w8, w8, w13
    strb     w8, [x1, #5]
    ldrb     w8, [x2, #6]
    eor      w8, w8, #0x3c
    strb     w8, [x1, #6]
    ldrb     w8, [x2, #7]
    eor      w8, w8, #0x55555555
    strb     w8, [x1, #7]
    ldrb     w8, [x2, #8]
    mov      w16, #0x71
    eor      w8, w8, w16
    strb     w8, [x1, #8]
    ldrb     w13, [x2, #9]
    mov      w8, #0x23
    eor      w13, w13, w8
    strb     w13, [x1, #9]
    ldrb     w13, [x2, #0xa]
    eor      w12, w13, w12
    strb     w12, [x1, #0xa]
    ldrb     w12, [x2, #0xb]
    eor      w12, w12, w10
    strb     w12, [x1, #0xb]
    ldrb     w12, [x2, #0xc]
    mov      w13, #0x26
    eor      w12, w12, w13
    strb     w12, [x1, #0xc]
    ldrb     w12, [x2, #0xd]
    eor      w12, w12, #0xffffffdf
    strb     w12, [x1, #0xd]
    ldrb     w12, [x2, #0xe]
    eor      w12, w12, #0x1f
    strb     w12, [x1, #0xe]
    ldrb     w12, [x2, #0xf]
    mov      w15, #0x69
    eor      w12, w12, w15
    strb     w12, [x1, #0xf]
    ldrb     w12, [x2, #0x10]
    mov      w2, #0x49
    eor      w12, w12, w2
    adrp     x2, #0x509000
    add      x2, x2, #0x9a7
    strb     w12, [x1, #0x10]
    ldrb     w12, [x2]
    eor      w12, w12, w4
    adrp     x1, #0x509000
    add      x1, x1, #0x9b2
    strb     w12, [x1]
    ldrb     w12, [x2, #1]
    mov      w5, #0x36
    eor      w12, w12, w5
    strb     w12, [x1, #1]
    ldrb     w12, [x2, #2]
    eor      w12, w12, #0x40
    strb     w12, [x1, #2]
    ldrb     w12, [x2, #3]
    eor      w12, w12, #4
    strb     w12, [x1, #3]
    ldrb     w12, [x2, #4]
    eor      w12, w12, #0xffffffe3
    strb     w12, [x1, #4]
    ldrb     w12, [x2, #5]
    mvn      w12, w12
    strb     w12, [x1, #5]
    ldrb     w12, [x2, #6]
    mov      w5, #0xfa
    eor      w12, w12, w5
    strb     w12, [x1, #6]
    ldrb     w12, [x2, #7]
    eor      w12, w12, #0x18
    strb     w12, [x1, #7]
    ldrb     w12, [x2, #8]
    mov      w6, #0x53
    eor      w12, w12, w6
    strb     w12, [x1, #8]
    ldrb     w12, [x2, #9]
    eor      w12, w12, w5
    strb     w12, [x1, #9]
    ldrb     w12, [x2, #0xa]
    eor      w12, w12, w15
    strb     w12, [x1, #0xa]
    adrp     x12, #0x509000
    add      x12, x12, #0x989
    ldrb     w1, [x12]
    mov      w2, #0x4a
    eor      w1, w1, w2
    adrp     x2, #0x509000
    add      x2, x2, #0x998
    strb     w1, [x2]
    ldrb     w1, [x12, #1]
    mov      w24, #0x47
    eor      w1, w1, w24
    strb     w1, [x2, #1]
    ldrb     w1, [x12, #2]
    eor      w1, w1, w8
    strb     w1, [x2, #2]
    ldrb     w1, [x12, #3]
    eor      w1, w1, w13
    strb     w1, [x2, #3]
    ldrb     w1, [x12, #4]
    eor      w1, w1, #0x30
    strb     w1, [x2, #4]
    ldrb     w1, [x12, #5]
    eor      w14, w1, w14
    strb     w14, [x2, #5]
    ldrb     w14, [x12, #6]
    eor      w14, w14, #4
    strb     w14, [x2, #6]
    ldrb     w14, [x12, #7]
    mov      w1, #0x73
    eor      w14, w14, w1
    strb     w14, [x2, #7]
    ldrb     w14, [x12, #8]
    eor      w14, w14, w7
    strb     w14, [x2, #8]
    ldrb     w14, [x12, #9]
    mov      w21, #0xbe
    eor      w14, w14, w21
    strb     w14, [x2, #9]
    ldrb     w14, [x12, #0xa]
    eor      w14, w14, w3
    strb     w14, [x2, #0xa]
    ldrb     w14, [x12, #0xb]
    mov      w22, #0xd1
    eor      w14, w14, w22
    strb     w14, [x2, #0xb]
    ldrb     w14, [x12, #0xc]
    eor      w9, w14, w9
    strb     w9, [x2, #0xc]
    ldrb     w9, [x12, #0xd]
    eor      w9, w9, #0xeeeeeeee
    strb     w9, [x2, #0xd]
    ldrb     w9, [x12, #0xe]
    eor      w9, w9, w0
    strb     w9, [x2, #0xe]
    adrp     x12, #0x509000
    add      x12, x12, #0x8f0
    ldrb     w9, [x12]
    mov      w14, #0xd9
    eor      w9, w9, w14
    adrp     x14, #0x509000
    add      x14, x14, #0x910
    strb     w9, [x14]
    ldrb     w9, [x12, #1]
    eor      w9, w9, #0x22222222
    strb     w9, [x14, #1]
    ldrb     w9, [x12, #2]
    mov      w0, #0x6a
    eor      w9, w9, w0
    strb     w9, [x14, #2]
    ldrb     w9, [x12, #3]
    eor      w9, w9, w16
    strb     w9, [x14, #3]
    ldrb     w9, [x12, #4]
    mov      w1, #0x5e
    eor      w9, w9, w1
    strb     w9, [x14, #4]
    ldrb     w9, [x12, #5]
    mov      w28, #0x52
    eor      w9, w9, w28
    strb     w9, [x14, #5]
    ldrb     w9, [x12, #6]
    mov      w5, #0xa5
    eor      w9, w9, w5
    strb     w9, [x14, #6]
    ldrb     w1, [x12, #7]
    mov      w9, #0xc6
    eor      w1, w1, w9
    strb     w1, [x14, #7]
    ldrb     w1, [x12, #8]
    eor      w1, w1, w21
    strb     w1, [x14, #8]
    ldrb     w1, [x12, #9]
    eor      w1, w1, #0xfc
    strb     w1, [x14, #9]
    ldrb     w1, [x12, #0xa]
    eor      w1, w1, w5
    strb     w1, [x14, #0xa]
    ldrb     w1, [x12, #0xb]
    eor      w1, w1, #0xffffffdf
    strb     w1, [x14, #0xb]
    ldrb     w1, [x12, #0xc]
    eor      w1, w1, #0xffffffe3
    strb     w1, [x14, #0xc]
    ldrb     w1, [x12, #0xd]
    eor      w10, w1, w10
    strb     w10, [x14, #0xd]
    ldrb     w10, [x12, #0xe]
    mov      w6, #0xc5
    eor      w10, w10, w6
    strb     w10, [x14, #0xe]
    ldrb     w1, [x12, #0xf]
    mov      w10, #0xbc
    eor      w1, w1, w10
    strb     w1, [x14, #0xf]
    ldrb     w1, [x12, #0x10]
    eor      w1, w1, #0xffffffef
    strb     w1, [x14, #0x10]
    ldrb     w1, [x12, #0x11]
    eor      w1, w1, #0x11111111
    strb     w1, [x14, #0x11]
    ldrb     w12, [x12, #0x12]
    mov      w1, #0x9a
    eor      w12, w12, w1
    strb     w12, [x14, #0x12]
    adrp     x12, #0x509000
    add      x12, x12, #0x8dc
    ldrb     w14, [x12]
    mov      w1, #0x28
    eor      w14, w14, w1
    adrp     x1, #0x509000
    add      x1, x1, #0x8e2
    strb     w14, [x1]
    ldrb     w14, [x12, #1]
    mov      w2, #0x5d
    eor      w14, w14, w2
    strb     w14, [x1, #1]
    ldrb     w14, [x12, #2]
    mov      w2, #0xa
    eor      w14, w14, w2
    strb     w14, [x1, #2]
    ldrb     w14, [x12, #3]
    eor      w14, w14, w15
    strb     w14, [x1, #3]
    ldrb     w14, [x12, #4]
    eor      w14, w14, #0x77777777
    strb     w14, [x1, #4]
    ldrb     w12, [x12, #5]
    eor      w12, w12, #3
    strb     w12, [x1, #5]
    adrp     x14, #0x509000
    add      x14, x14, #0x8ca
    ldrb     w12, [x14]
    eor      w12, w12, #0x78
    adrp     x15, #0x509000
    add      x15, x15, #0x8d3
    strb     w12, [x15]
    ldrb     w12, [x14, #1]
    mov      w1, #0xa7
    eor      w12, w12, w1
    strb     w12, [x15, #1]
    ldrb     w12, [x14, #2]
    eor      w12, w12, #6
    strb     w12, [x15, #2]
    ldrb     w12, [x14, #3]
    mov      w1, #0x79
    eor      w12, w12, w1
    strb     w12, [x15, #3]
    ldrb     w12, [x14, #4]
    eor      w12, w12, #0x3e
    strb     w12, [x15, #4]
    ldrb     w12, [x14, #5]
    eor      w12, w12, w26
    strb     w12, [x15, #5]
    ldrb     w1, [x14, #6]
    mov      w12, #0xd4
    eor      w1, w1, w12
    strb     w1, [x15, #6]
    ldrb     w1, [x14, #7]
    eor      w1, w1, #3
    strb     w1, [x15, #7]
    ldrb     w14, [x14, #8]
    mov      w23, #0xb0
    eor      w14, w14, w23
    strb     w14, [x15, #8]
    adrp     x1, #0x509000
    add      x1, x1, #0x8aa
    ldrb     w14, [x1]
    adrp     x2, #0x509000
    add      x2, x2, #0x8ba
    mvn      w14, w14
    strb     w14, [x2]
    ldrb     w14, [x1, #1]
    eor      w14, w14, #0x99999999
    strb     w14, [x2, #1]
    ldrb     w14, [x1, #2]
    eor      w14, w14, w0
    strb     w14, [x2, #2]
    ldrb     w14, [x1, #3]
    mov      w15, #0xac
    eor      w14, w14, w15
    strb     w14, [x2, #3]
    ldrb     w14, [x1, #4]
    mov      w15, #0x3d
    eor      w14, w14, w15
    strb     w14, [x2, #4]
    ldrb     w15, [x1, #5]
    mov      w14, #0xcd
    eor      w15, w15, w14
    strb     w15, [x2, #5]
    ldrb     w15, [x1, #6]
    eor      w15, w15, w27
    strb     w15, [x2, #6]
    ldrb     w15, [x1, #7]
    mov      w27, #0x4e
    eor      w15, w15, w27
    strb     w15, [x2, #7]
    ldrb     w15, [x1, #8]
    eor      w15, w15, #0x1f
    strb     w15, [x2, #8]
    ldrb     w15, [x1, #9]
    mov      w26, #0x17
    eor      w15, w15, w26
    strb     w15, [x2, #9]
    ldrb     w15, [x1, #0xa]
    eor      w15, w15, #0xc
    strb     w15, [x2, #0xa]
    ldrb     w15, [x1, #0xb]
    eor      w15, w15, #0xffffffc1
    strb     w15, [x2, #0xb]
    ldrb     w15, [x1, #0xc]
    mov      w26, #0x63
    eor      w15, w15, w26
    strb     w15, [x2, #0xc]
    ldrb     w15, [x1, #0xd]
    eor      w15, w15, w12
    strb     w15, [x2, #0xd]
    ldrb     w26, [x1, #0xe]
    mov      w15, #0x9d
    eor      w26, w26, w15
    strb     w26, [x2, #0xe]
    ldrb     w1, [x1, #0xf]
    mov      w26, #0x62
    eor      w1, w1, w26
    strb     w1, [x2, #0xf]
    adrp     x1, #0x509000
    add      x1, x1, #0x870
    ldrb     w26, [x1]
    adrp     x2, #0x509000
    add      x2, x2, #0x890
    eor      w26, w26, #0xffffff87
    strb     w26, [x2]
    ldrb     w26, [x1, #1]
    eor      w26, w26, #0x1c
    strb     w26, [x2, #1]
    ldrb     w26, [x1, #2]
    eor      w26, w26, w6
    strb     w26, [x2, #2]
    ldrb     w26, [x1, #3]
    eor      w26, w26, #0xf8
    strb     w26, [x2, #3]
    ldrb     w26, [x1, #4]
    mov      w7, #0x89
    eor      w7, w26, w7
    strb     w7, [x2, #4]
    ldrb     w7, [x1, #5]
    mov      w26, #0x4c
    eor      w7, w7, w26
    strb     w7, [x2, #5]
    ldrb     w7, [x1, #6]
    mov      w26, #0x12
    eor      w7, w7, w26
    strb     w7, [x2, #6]
    ldrb     w7, [x1, #7]
    eor      w7, w7, w5
    strb     w7, [x2, #7]
    ldrb     w7, [x1, #8]
    eor      w8, w7, w8
    strb     w8, [x2, #8]
    ldrb     w7, [x1, #9]
    mov      w8, #0x31
    eor      w7, w7, w8
    strb     w7, [x2, #9]
    ldrb     w7, [x1, #0xa]
    eor      w7, w7, #0x55555555
    strb     w7, [x2, #0xa]
    ldrb     w7, [x1, #0xb]
    eor      w7, w7, w5
    strb     w7, [x2, #0xb]
    ldrb     w7, [x1, #0xc]
    eor      w7, w7, w25
    strb     w7, [x2, #0xc]
    ldrb     w7, [x1, #0xd]
    eor      w7, w7, #0xffffffe7
    strb     w7, [x2, #0xd]
    ldrb     w7, [x1, #0xe]
    mov      w25, #0x5b
    eor      w7, w7, w25
    strb     w7, [x2, #0xe]
    ldrb     w7, [x1, #0xf]
    mov      w25, #5
    eor      w7, w7, w25
    strb     w7, [x2, #0xf]
    ldrb     w7, [x1, #0x10]
    eor      w7, w7, w20
    strb     w7, [x2, #0x10]
    ldrb     w7, [x1, #0x11]
    mov      w26, #0x91
    eor      w7, w7, w26
    strb     w7, [x2, #0x11]
    ldrb     w7, [x1, #0x12]
    eor      w7, w7, #0xffffffe7
    strb     w7, [x2, #0x12]
    ldrb     w7, [x1, #0x13]
    mov      w25, #0xf2
    eor      w7, w7, w25
    strb     w7, [x2, #0x13]
    ldrb     w7, [x1, #0x14]
    mov      w20, #0x58
    eor      w7, w7, w20
    strb     w7, [x2, #0x14]
    ldrb     w7, [x1, #0x15]
    mov      x4, x19
    mov      w19, #0x2b
    eor      w7, w7, w19
    mov      x19, x4
    strb     w7, [x2, #0x15]
    ldrb     w7, [x1, #0x16]
    eor      w7, w7, w30
    strb     w7, [x2, #0x16]
    ldrb     w7, [x1, #0x17]
    eor      w7, w7, #0x11111111
    strb     w7, [x2, #0x17]
    ldrb     w7, [x1, #0x18]
    eor      w7, w7, #0xffffffe7
    strb     w7, [x2, #0x18]
    ldrb     w1, [x1, #0x19]
    mov      w7, #0x39
    eor      w1, w1, w7
    strb     w1, [x2, #0x19]
    adrp     x1, #0x509000
    add      x1, x1, #0x830
    ldrb     w2, [x1]
    eor      w2, w2, w12
    adrp     x12, #0x509000
    add      x12, x12, #0x850
    strb     w2, [x12]
    ldrb     w2, [x1, #1]
    eor      w2, w2, w25
    strb     w2, [x12, #1]
    ldrb     w2, [x1, #2]
    eor      w2, w2, #0xffffffc7
    strb     w2, [x12, #2]
    ldrb     w2, [x1, #3]
    eor      w2, w2, #0xfe
    strb     w2, [x12, #3]
    ldrb     w2, [x1, #4]
    eor      w2, w2, w24
    strb     w2, [x12, #4]
    ldrb     w2, [x1, #5]
    eor      w2, w2, #0xfe
    strb     w2, [x12, #5]
    ldrb     w2, [x1, #6]
    mov      w7, #0x85
    eor      w2, w2, w7
    strb     w2, [x12, #6]
    ldrb     w2, [x1, #7]
    mov      w7, #0xb2
    eor      w2, w2, w7
    strb     w2, [x12, #7]
    ldrb     w2, [x1, #8]
    mov      w30, #0xe9
    eor      w2, w2, w30
    strb     w2, [x12, #8]
    ldrb     w2, [x1, #9]
    eor      w2, w2, #0xfe
    strb     w2, [x12, #9]
    ldrb     w2, [x1, #0xa]
    eor      w2, w2, #0xfffffff1
    strb     w2, [x12, #0xa]
    ldrb     w2, [x1, #0xb]
    eor      w2, w2, #0xffffffbf
    strb     w2, [x12, #0xb]
    ldrb     w2, [x1, #0xc]
    eor      w2, w2, #0x3f
    strb     w2, [x12, #0xc]
    ldrb     w2, [x1, #0xd]
    eor      w2, w2, w20
    strb     w2, [x12, #0xd]
    ldrb     w2, [x1, #0xe]
    mov      w7, #0x86
    eor      w2, w2, w7
    strb     w2, [x12, #0xe]
    ldrb     w2, [x1, #0xf]
    eor      w11, w2, w11
    strb     w11, [x12, #0xf]
    ldrb     w11, [x1, #0x10]
    eor      w11, w11, #0xffffff9f
    strb     w11, [x12, #0x10]
    ldrb     w11, [x1, #0x11]
    eor      w11, w11, #0xffffff83
    strb     w11, [x12, #0x11]
    ldrb     w11, [x1, #0x12]
    mov      w20, #0xaf
    eor      w11, w11, w20
    strb     w11, [x12, #0x12]
    ldrb     w11, [x1, #0x13]
    eor      w11, w11, #0xf0
    strb     w11, [x12, #0x13]
    ldrb     w11, [x1, #0x14]
    mov      w2, #0x75
    eor      w11, w11, w2
    strb     w11, [x12, #0x14]
    ldrb     w11, [x1, #0x15]
    mov      w2, #0xed
    eor      w11, w11, w2
    strb     w11, [x12, #0x15]
    ldrb     w11, [x1, #0x16]
    mov      w2, #0x1b
    eor      w11, w11, w2
    strb     w11, [x12, #0x16]
    ldrb     w11, [x1, #0x17]
    eor      w11, w11, w14
    strb     w11, [x12, #0x17]
    ldrb     w11, [x1, #0x18]
    eor      w11, w11, w15
    strb     w11, [x12, #0x18]
    ldrb     w11, [x1, #0x19]
    mov      w14, #0x90
    eor      w11, w11, w14
    strb     w11, [x12, #0x19]
    ldrb     w11, [x1, #0x1a]
    eor      w11, w11, #0xffffffef
    strb     w11, [x12, #0x1a]
    ldrb     w11, [x1, #0x1b]
    mov      w14, #0x8a
    eor      w11, w11, w14
    strb     w11, [x12, #0x1b]
    ldrb     w11, [x1, #0x1c]
    eor      w11, w11, w23
    strb     w11, [x12, #0x1c]
    adrp     x1, #0x509000
    add      x1, x1, #0xa31
    ldrb     w11, [x1]
    eor      w11, w11, #0xffffff9f
    adrp     x7, #0x509000
    add      x7, x7, #0xa41
    strb     w11, [x7]
    ldrb     w11, [x1, #1]
    eor      w11, w11, #0xfffffff3
    strb     w11, [x7, #1]
    ldrb     w11, [x1, #2]
    eor      w11, w11, w15
    strb     w11, [x7, #2]
    ldrb     w11, [x1, #3]
    mov      w12, #0xdc
    eor      w11, w11, w12
    strb     w11, [x7, #3]
    ldrb     w12, [x1, #4]
    mov      w11, #0x59
    eor      w12, w12, w11
    strb     w12, [x7, #4]
    ldrb     w12, [x1, #5]
    eor      w12, w12, #0xffffffe7
    strb     w12, [x7, #5]
    ldrb     w12, [x1, #6]
    eor      w12, w12, #0x77777777
    strb     w12, [x7, #6]
    ldrb     w12, [x1, #7]
    eor      w12, w12, #3
    strb     w12, [x7, #7]
    ldrb     w12, [x1, #8]
    mov      w14, #0x9e
    eor      w12, w12, w14
    strb     w12, [x7, #8]
    ldrb     w14, [x1, #9]
    mov      w12, #0x42
    eor      w14, w14, w12
    strb     w14, [x7, #9]
    ldrb     w14, [x1, #0xa]
    eor      w14, w14, #0xffffffc7
    strb     w14, [x7, #0xa]
    ldrb     w14, [x1, #0xb]
    eor      w14, w14, #0x70
    strb     w14, [x7, #0xb]
    ldrb     w14, [x1, #0xc]
    mov      w15, #0x8b
    eor      w14, w14, w15
    strb     w14, [x7, #0xc]
    ldrb     w14, [x1, #0xd]
    eor      w14, w14, w3
    strb     w14, [x7, #0xd]
    ldrb     w15, [x1, #0xe]
    mov      w14, #0x2f
    eor      w15, w15, w14
    strb     w15, [x7, #0xe]
    ldrb     w15, [x1, #0xf]
    eor      w15, w15, #0xffffffe1
    strb     w15, [x7, #0xf]
    adrp     x15, #0x509000
    add      x15, x15, #0x9c0
    ldrb     w1, [x15]
    eor      w2, w1, w2
    adrp     x1, #0x509000
    add      x1, x1, #0x9e0
    strb     w2, [x1]
    ldrb     w2, [x15, #1]
    eor      w2, w2, #0x30
    strb     w2, [x1, #1]
    ldrb     w2, [x15, #2]
    mvn      w2, w2
    strb     w2, [x1, #2]
    ldrb     w2, [x15, #3]
    eor      w2, w2, #0x55555555
    strb     w2, [x1, #3]
    ldrb     w2, [x15, #4]
    eor      w2, w2, #0xfffffffb
    strb     w2, [x1, #4]
    ldrb     w2, [x15, #5]
    mov      w3, #0xca
    eor      w2, w2, w3
    strb     w2, [x1, #5]
    ldrb     w2, [x15, #6]
    eor      w2, w2, #0x18
    strb     w2, [x1, #6]
    ldrb     w2, [x15, #7]
    mov      w7, #0x9b
    eor      w2, w2, w7
    strb     w2, [x1, #7]
    ldrb     w2, [x15, #8]
    mov      w7, #0x32
    eor      w2, w2, w7
    strb     w2, [x1, #8]
    ldrb     w2, [x15, #9]
    mov      w4, #0xae
    eor      w2, w2, w4
    strb     w2, [x1, #9]
    ldrb     w2, [x15, #0xa]
    mov      w7, #0x64
    eor      w2, w2, w7
    strb     w2, [x1, #0xa]
    ldrb     w2, [x15, #0xb]
    eor      w9, w2, w9
    strb     w9, [x1, #0xb]
    ldrb     w9, [x15, #0xc]
    eor      w9, w9, w24
    strb     w9, [x1, #0xc]
    ldrb     w9, [x15, #0xd]
    eor      w9, w9, #0x80
    strb     w9, [x1, #0xd]
    ldrb     w9, [x15, #0xe]
    mov      w2, #0xab
    eor      w9, w9, w2
    strb     w9, [x1, #0xe]
    ldrb     w9, [x15, #0xf]
    mov      w2, #0x67
    eor      w9, w9, w2
    strb     w9, [x1, #0xf]
    ldrb     w9, [x15, #0x10]
    eor      w9, w9, w28
    strb     w9, [x1, #0x10]
    ldrb     w9, [x15, #0x11]
    mov      w2, #0x9c
    eor      w9, w9, w2
    strb     w9, [x1, #0x11]
    ldrb     w9, [x15, #0x12]
    mov      w2, #0x6d
    eor      w9, w9, w2
    strb     w9, [x1, #0x12]
    ldrb     w9, [x15, #0x13]
    eor      w9, w9, w14
    strb     w9, [x1, #0x13]
    ldrb     w9, [x15, #0x14]
    eor      w9, w9, w23
    strb     w9, [x1, #0x14]
    adrp     x14, #0x509000
    add      x14, x14, #0x930
    ldrb     w9, [x14]
    adrp     x15, #0x509000
    add      x15, x15, #0x960
    eor      w9, w9, #0xe
    strb     w9, [x15]
    ldrb     w9, [x14, #1]
    eor      w9, w9, w30
    strb     w9, [x15, #1]
    ldrb     w9, [x14, #2]
    mov      w1, #0x4f
    eor      w9, w9, w1
    strb     w9, [x15, #2]
    ldrb     w9, [x14, #3]
    eor      w9, w9, w16
    strb     w9, [x15, #3]
    ldrb     w9, [x14, #4]
    eor      w9, w9, #0xfffffff3
    strb     w9, [x15, #4]
    ldrb     w9, [x14, #5]
    eor      w9, w9, w10
    strb     w9, [x15, #5]
    ldrb     w9, [x14, #6]
    eor      w9, w9, w22
    strb     w9, [x15, #6]
    ldrb     w9, [x14, #7]
    eor      w9, w9, w27
    strb     w9, [x15, #7]
    ldrb     w9, [x14, #8]
    mov      w10, #0xa9
    eor      w9, w9, w10
    strb     w9, [x15, #8]
    ldrb     w9, [x14, #9]
    mov      w10, #0xb5
    eor      w9, w9, w10
    strb     w9, [x15, #9]
    ldrb     w9, [x14, #0xa]
    eor      w9, w9, w22
    strb     w9, [x15, #0xa]
    ldrb     w10, [x14, #0xb]
    mov      w9, #0x6e
    eor      w10, w10, w9
    strb     w10, [x15, #0xb]
    ldrb     w10, [x14, #0xc]
    eor      w10, w10, w21
    strb     w10, [x15, #0xc]
    ldrb     w10, [x14, #0xd]
    mov      w1, #0x7d
    eor      w10, w10, w1
    strb     w10, [x15, #0xd]
    ldrb     w10, [x14, #0xe]
    mov      w1, #0x37
    eor      w10, w10, w1
    strb     w10, [x15, #0xe]
    ldrb     w10, [x14, #0xf]
    eor      w10, w10, #0x18
    strb     w10, [x15, #0xf]
    ldrb     w10, [x14, #0x10]
    eor      w10, w10, w12
    strb     w10, [x15, #0x10]
    ldrb     w10, [x14, #0x11]
    eor      w10, w10, w20
    ldur     x20, [x29, #-0x60]
    strb     w10, [x15, #0x11]
    ldrb     w10, [x14, #0x12]
    eor      w8, w10, w8
    strb     w8, [x15, #0x12]
    ldrb     w8, [x14, #0x13]
    mov      w10, #0x8e
    eor      w8, w8, w10
    strb     w8, [x15, #0x13]
    ldrb     w8, [x14, #0x14]
    mov      w10, #0x65
    eor      w8, w8, w10
    strb     w8, [x15, #0x14]
    ldrb     w8, [x14, #0x15]
    mov      w10, #0x2e
    eor      w8, w8, w10
    strb     w8, [x15, #0x15]
    ldrb     w8, [x14, #0x16]
    eor      w8, w8, w3
    strb     w8, [x15, #0x16]
    ldrb     w8, [x14, #0x17]
    mov      w10, #0xb6
    eor      w8, w8, w10
    strb     w8, [x15, #0x17]
    ldrb     w8, [x14, #0x18]
    mov      w10, #0xa2
    eor      w8, w8, w10
    strb     w8, [x15, #0x18]
    ldrb     w8, [x14, #0x19]
    eor      w8, w8, #0x22222222
    strb     w8, [x15, #0x19]
    ldrb     w8, [x14, #0x1a]
    eor      w8, w8, #0x38
    strb     w8, [x15, #0x1a]
    ldrb     w8, [x14, #0x1b]
    mov      w10, #0x54
    eor      w8, w8, #0x33333333
    strb     w8, [x15, #0x1b]
    ldrb     w8, [x14, #0x1c]
    mov      w12, #0xba
    eor      w8, w8, w12
    strb     w8, [x15, #0x1c]
    ldrb     w8, [x14, #0x1d]
    mov      w12, #0xb1
    eor      w8, w8, w12
    strb     w8, [x15, #0x1d]
    ldrb     w8, [x14, #0x1e]
    eor      w8, w8, w10
    strb     w8, [x15, #0x1e]
    ldrb     w8, [x14, #0x1f]
    eor      w8, w8, w11
    strb     w8, [x15, #0x1f]
    ldrb     w8, [x14, #0x20]
    mov      w10, #0x1d
    eor      w8, w8, w10
    strb     w8, [x15, #0x20]
    ldrb     w8, [x14, #0x21]
    eor      w8, w8, #0xfffffff9
    strb     w8, [x15, #0x21]
    ldrb     w8, [x14, #0x22]
    eor      w8, w8, #0x66666666
    strb     w8, [x15, #0x22]
    ldrb     w8, [x14, #0x23]
    mov      w10, #0xb9
    eor      w8, w8, w10
    strb     w8, [x15, #0x23]
    ldrb     w8, [x14, #0x24]
    eor      w8, w8, #0x78
    strb     w8, [x15, #0x24]
    ldrb     w8, [x14, #0x25]
    mov      w10, #0x95
    eor      w8, w8, w10
    strb     w8, [x15, #0x25]
    ldrb     w8, [x14, #0x26]
    mov      w10, #0x98
    eor      w8, w8, w10
    strb     w8, [x15, #0x26]
    ldrb     w8, [x14, #0x27]
    eor      w8, w8, #0x22222222
    strb     w8, [x15, #0x27]
    ldrb     w8, [x14, #0x28]
    mov      w11, #0xa6
    eor      w8, w8, w11
    strb     w8, [x15, #0x28]
    adrp     x8, #0x509000
    add      x8, x8, #0x7f0
    ldrb     w10, [x8]
    mov      w12, #0x27
    eor      w12, w10, w12
    adrp     x10, #0x509000
    add      x10, x10, #0x810
    strb     w12, [x10]
    ldrb     w12, [x8, #1]
    eor      w12, w12, w16
    strb     w12, [x10, #1]
    ldrb     w12, [x8, #2]
    eor      w12, w12, w5
    strb     w12, [x10, #2]
    ldrb     w12, [x8, #3]
    eor      w12, w12, w26
    strb     w12, [x10, #3]
    ldrb     w12, [x8, #4]
    eor      w11, w12, w11
    strb     w11, [x10, #4]
    mov      w11, #0x94
    ldrb     w12, [x8, #5]
    eor      w12, w12, #0x77777777
    strb     w12, [x10, #5]
    ldrb     w12, [x8, #6]
    eor      w11, w12, w11
    strb     w11, [x10, #6]
    ldrb     w11, [x8, #7]
    eor      w11, w11, w6
    strb     w11, [x10, #7]
    ldrb     w11, [x8, #8]
    eor      w11, w11, #0x38
    mov      w12, #0xe4
    strb     w11, [x10, #8]
    ldrb     w11, [x8, #9]
    eor      w11, w11, w9
    strb     w11, [x10, #9]
    ldrb     w11, [x8, #0xa]
    eor      w11, w11, w12
    strb     w11, [x10, #0xa]
    ldrb     w11, [x8, #0xb]
    eor      w11, w11, w13
    strb     w11, [x10, #0xb]
    ldrb     w11, [x8, #0xc]
    eor      w11, w11, #0x44444444
    strb     w11, [x10, #0xc]
    ldrb     w11, [x8, #0xd]
    eor      w11, w11, #0x77777777
    strb     w11, [x10, #0xd]
    ldrb     w11, [x8, #0xe]
    eor      w9, w11, w9
    strb     w9, [x10, #0xe]
    ldrb     w9, [x8, #0xf]
    mov      w11, #0x3a
    eor      w9, w9, w11
    strb     w9, [x10, #0xf]
    mov      w9, #0x84
    ldrb     w11, [x8, #0x10]
    eor      w11, w11, #7
    strb     w11, [x10, #0x10]
    ldrb     w11, [x8, #0x11]
    eor      w9, w11, w9
    strb     w9, [x10, #0x11]
    ldrb     w9, [x8, #0x12]
    eor      w9, w9, #0xffffffc7
    strb     w9, [x10, #0x12]
    ldrb     w9, [x8, #0x13]
    eor      w9, w9, #0xffffffe1
    strb     w9, [x10, #0x13]
    ldrb     w9, [x8, #0x14]
    eor      w9, w9, w30
    strb     w9, [x10, #0x14]
    ldrb     w9, [x8, #0x15]
    eor      w9, w9, #0x20
    strb     w9, [x10, #0x15]
    ldrb     w9, [x8, #0x16]
    eor      w9, w9, w26
    strb     w9, [x10, #0x16]
    ldrb     w9, [x8, #0x17]
    mov      w11, #0x2d
    eor      w9, w9, w11
    mov      w11, #0xa4
    strb     w9, [x10, #0x17]
    ldrb     w9, [x8, #0x18]
    mvn      w9, w9
    strb     w9, [x10, #0x18]
    ldrb     w9, [x8, #0x19]
    eor      w9, w9, w11
    strb     w9, [x10, #0x19]
    ldrb     w9, [x8, #0x1a]
    mov      w11, #0x92
    eor      w9, w9, w11
    strb     w9, [x10, #0x1a]
    ldrb     w9, [x8, #0x1b]
    eor      w9, w9, w25
    strb     w9, [x10, #0x1b]
    ldrb     w9, [x8, #0x1c]
    eor      w9, w9, w0
    strb     w9, [x10, #0x1c]
    ldrb     w9, [x8, #0x1d]
    mov      w11, #0x2c
    eor      w9, w9, w11
    strb     w9, [x10, #0x1d]
    ldrb     w8, [x8, #0x1e]
    mov      w9, #0x46
    eor      w8, w8, w9
    strb     w8, [x10, #0x1e]
    mov      w8, #1
    stlr     w8, [x17]
    sub      x24, sp, #0x40
    mov      sp, x24
    sub      x28, sp, #0x40
    mov      sp, x28
    sub      x8, sp, #0x80
    stur     x8, [x29, #-0x60]
    mov      sp, x8
    sub      x8, sp, #0x40
    stur     x8, [x29, #-0x70]
    mov      sp, x8
    sub      x25, sp, #0x80
    mov      sp, x25
    sub      x23, sp, #0x10
    mov      sp, x23
    sub      x21, sp, #0x40
    mov      sp, x21
    sub      x22, sp, #0x80
    mov      sp, x22
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x3d0]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #3
    b.ne     #0x1dcf3c
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x68]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x461ca8 // _objc_retain
    cbz      x0, #0x1dcf2c
    stp      x25, x21, [x29, #-0x80]
    stp      x23, x22, [x29, #-0x98]
    stur     x19, [x29, #-0x88]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8d8]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x509000
    add      x8, x8, #0xb90
    adrp     x9, #0x509000
    add      x9, x9, #0xed0
    stp      x8, x9, [x24]
    adrp     x8, #0x509000
    add      x8, x8, #0xe10
    adrp     x9, #0x509000
    add      x9, x9, #0xd90
    stp      x8, x9, [x24, #0x10]
    adrp     x8, #0x509000
    add      x8, x8, #0xcd0
    adrp     x9, #0x509000
    add      x9, x9, #0xd50
    stp      x8, x9, [x24, #0x20]
    adrp     x8, #0x509000
    add      x8, x8, #0xd10
    adrp     x9, #0x509000
    add      x9, x9, #0xe50
    stp      x8, x9, [x24, #0x30]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    mov      x2, x24
    mov      w3, #8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    movi     v0.16b, #0
    stp      q0, q0, [x28]
    stp      q0, q0, [x28, #0x20]
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stur     x1, [x29, #-0x68]
    mov      x2, x28
    ldur     x3, [x29, #-0x60]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x1dcc80
    mov      x25, x0
    ldr      x8, [x28, #0x10]
    ldr      x24, [x8]
    mov      x19, #0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0xa08]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x830]
    ldr      x8, [x28, #0x10]
    ldr      x8, [x8]
    cmp      x8, x24
    b.eq     #0x1dcc0c
    mov      x0, x22
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x28, #8]
    ldr      x1, [x8, x19, lsl #3]
    mov      x0, x20
    bl       #0x1de510
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    cbz      x0, #0x1dcc50
    mov      x0, x23
    mov      x1, x27
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x1dcc50
    mov      x0, x23
    mov      x1, x21
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    add      x19, x19, #1
    cmp      x25, x19
    b.ne     #0x1dcbf4
    mov      x0, x22
    ldp      x1, x3, [x29, #-0x68]
    mov      x2, x28
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    cbnz     x0, #0x1dcbe0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x24, [x29, #-0x70]
    movi     v0.16b, #0
    stp      q0, q0, [x24, #0x20]
    stp      q0, q0, [x24]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    ldur     x1, [x29, #-0x68]
    mov      x2, x24
    ldur     x3, [x29, #-0x80]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x1dcdb8
    mov      x28, x0
    ldr      x8, [x24, #0x10]
    ldr      x25, [x8]
    adrp     x26, #0x4be000
    mov      x27, #0
    ldr      x22, [x26, #0x3e0]
    ldr      x8, [x24, #0x10]
    ldr      x8, [x8]
    cmp      x8, x25
    b.eq     #0x1dccf8
    mov      x0, x23
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x24, #8]
    ldr      x19, [x8, x27, lsl #3]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x0, #0x509000
    add      x0, x0, #0xc90
    bl       #0x4617a4 // _NSSelectorFromString
    cbz      x19, #0x1dcd5c
    mov      x21, x0
    mov      x0, x19
    mov      x1, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x1dcd5c
    mov      x0, x19
    mov      x1, x21
    mov      x2, #0
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    b        #0x1dcf0c
    cmp      w1, #1
    b.ne     #0x1dcf88
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    ldur     x24, [x29, #-0x70]
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    adrp     x1, #0x509000
    add      x1, x1, #0xc10
    bl       #0x1f8628
    tbnz     w0, #0, #0x1dcf7c
    mov      x0, x19
    adrp     x1, #0x509000
    add      x1, x1, #0xbd0
    bl       #0x1f8628
    tbnz     w0, #0, #0x1dcf7c
    add      x27, x27, #1
    cmp      x28, x27
    b.ne     #0x1dcce0
    mov      x0, x23
    ldur     x1, [x29, #-0x68]
    mov      x2, x24
    ldur     x3, [x29, #-0x80]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    cbnz     x0, #0x1dccd8
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldur     x21, [x29, #-0x98]
    str      xzr, [x21]
    mov      x0, x20
    mov      x1, x21
    bl       #0x1de5a4
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x25, [x21]
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    movi     v0.16b, #0
    ldur     x21, [x29, #-0x78]
    stp      q0, q0, [x21, #0x20]
    stp      q0, q0, [x21]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    ldur     x1, [x29, #-0x68]
    mov      x2, x21
    ldur     x3, [x29, #-0x90]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x1dcf00
    mov      x27, x0
    ldur     x8, [x29, #-0x78]
    ldr      x8, [x8, #0x10]
    adrp     x22, #0x509000
    add      x22, x22, #0xb50
    ldr      x28, [x8]
    adrp     x26, #0x509000
    add      x26, x26, #0xc50
    mov      x24, #0
    ldur     x21, [x29, #-0x78]
    ldr      x8, [x21, #0x10]
    ldr      x8, [x8]
    cmp      x8, x28
    b.eq     #0x1dce5c
    mov      x0, x23
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x21, #8]
    ldr      x21, [x8, x24, lsl #3]
    mov      x0, x21
    mov      x1, x22
    mov      x2, x19
    bl       #0x1f86c0
    tbnz     w0, #0, #0x1dcf00
    mov      x0, x21
    mov      x1, x26
    mov      x2, x19
    bl       #0x1f86c0
    tbnz     w0, #0, #0x1dcf00
    mov      x0, x21
    adrp     x1, #0x509000
    add      x1, x1, #0xdd0
    mov      x2, x19
    bl       #0x1f877c
    tbnz     w0, #0, #0x1dcf00
    mov      x0, x21
    adrp     x1, #0x509000
    add      x1, x1, #0xb10
    mov      x2, x19
    bl       #0x1f877c
    tbnz     w0, #0, #0x1dcf00
    mov      x0, x21
    adrp     x1, #0x509000
    add      x1, x1, #0xe90
    mov      x2, x19
    bl       #0x1f877c
    tbnz     w0, #0, #0x1dcf00
    add      x24, x24, #1
    cmp      x27, x24
    b.ne     #0x1dce40
    mov      x0, x23
    ldur     x1, [x29, #-0x68]
    ldur     x2, [x29, #-0x78]
    ldur     x3, [x29, #-0x90]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    cbnz     x0, #0x1dce3c
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    b        #0x1dcf10
    mov      x25, x23
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldur     x19, [x29, #-0x88]
    mov      x0, x20
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
    b.ne     #0x1dcf84
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    mov      x25, x23
    b        #0x1dcf18
    bl       #0x4618b8 // ___stack_chk_fail
    bl       #0x461894 // __Unwind_Resume

// -[WCLGNativeProfileTitleTapTarget controller] IMP=0x1DCF8C bounds=0x1DCF8C-0x1DCF94
loc_1DCF8C:
    ldr      x0, [x0, #8]
    ret      

// -[WCLGNativeProfileTitleTapTarget setController:] IMP=0x1DCF94 bounds=0x1DCF94-0x1DCF9C
loc_1DCF94:
    str      x2, [x0, #8]
    ret      
