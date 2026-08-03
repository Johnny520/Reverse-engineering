// Exact ARM64 listing for WCLGGlassStore

// +[WCLGGlassStore shared] IMP=0x2EE5A4 bounds=0x2EE5A4-0x2EE5D4
loc_2EE5A4:
    adrp     x8, #0x580000
    ldr      x8, [x8, #0x4b8]
    cmn      x8, #1
    b.ne     #0x2ee5c0
    adrp     x8, #0x580000
    ldr      x0, [x8, #0x4b0]
    b        #0x461cc0 // _objc_retainAutoreleaseReturnValue
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    bl       #0x460368
    ldp      x29, x30, [sp], #0x10
    b        #0x2ee5b4

// -[WCLGGlassStore apiPubKey] IMP=0x2EE608 bounds=0x2EE608-0x2EFDC8
loc_2EE608:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x27, x0
    adrp     x9, #0x580000
    add      x9, x9, #0x600
    ldar     w8, [x9]
    cbnz     w8, #0x2efd4c
    adrp     x9, #0x541000
    add      x9, x9, #0xc80
    ldrb     w8, [x9]
    mov      w10, #0xbe
    eor      w8, w8, w10
    adrp     x10, #0x541000
    add      x10, x10, #0xe30
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w11, #0xd6
    eor      w8, w8, w11
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    eor      w8, w8, #0xffffffc7
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    eor      w8, w8, #0x66666666
    strb     w8, [x10, #3]
    ldrb     w8, [x9, #4]
    mov      w11, #0x4f
    eor      w8, w8, w11
    mov      w24, #0x4f
    strb     w8, [x10, #4]
    ldrb     w8, [x9, #5]
    mov      w11, #0x95
    eor      w8, w8, w11
    mov      w28, #0x95
    strb     w8, [x10, #5]
    ldrb     w8, [x9, #6]
    eor      w8, w8, #0x88888888
    strb     w8, [x10, #6]
    ldrb     w11, [x9, #7]
    mov      w8, #0xac
    eor      w11, w11, w8
    strb     w11, [x10, #7]
    ldrb     w11, [x9, #8]
    mov      w17, #0x27
    eor      w11, w11, w17
    strb     w11, [x10, #8]
    ldrb     w11, [x9, #9]
    mov      w12, #0x53
    eor      w11, w11, w12
    mov      w1, #0x53
    strb     w11, [x10, #9]
    ldrb     w11, [x9, #0xa]
    mov      w12, #0xb3
    eor      w11, w11, w12
    strb     w11, [x10, #0xa]
    ldrb     w11, [x9, #0xb]
    mov      w12, #0x82
    eor      w11, w11, w12
    mov      w13, #0x82
    strb     w11, [x10, #0xb]
    ldrb     w11, [x9, #0xc]
    mov      w12, #0x23
    eor      w11, w11, w12
    mov      w6, #0x23
    strb     w11, [x10, #0xc]
    ldrb     w11, [x9, #0xd]
    mov      w12, #0x5c
    eor      w11, w11, w12
    strb     w11, [x10, #0xd]
    ldrb     w11, [x9, #0xe]
    eor      w11, w11, #0xffffffbf
    strb     w11, [x10, #0xe]
    ldrb     w11, [x9, #0xf]
    mov      w12, #0xde
    eor      w11, w11, w12
    strb     w11, [x10, #0xf]
    ldrb     w11, [x9, #0x10]
    mov      w12, #0x13
    eor      w11, w11, w12
    strb     w11, [x10, #0x10]
    ldrb     w12, [x9, #0x11]
    mov      w11, #0x97
    eor      w12, w12, w11
    strb     w12, [x10, #0x11]
    ldrb     w12, [x9, #0x12]
    mov      w14, #0xa2
    eor      w12, w12, w14
    strb     w12, [x10, #0x12]
    ldrb     w12, [x9, #0x13]
    mov      w14, #0xc8
    eor      w12, w12, w14
    strb     w12, [x10, #0x13]
    ldrb     w12, [x9, #0x14]
    eor      w12, w12, w13
    strb     w12, [x10, #0x14]
    ldrb     w12, [x9, #0x15]
    mov      w13, #0x92
    eor      w12, w12, w13
    strb     w12, [x10, #0x15]
    ldrb     w12, [x9, #0x16]
    mov      w15, #0x1a
    eor      w12, w12, w15
    strb     w12, [x10, #0x16]
    ldrb     w12, [x9, #0x17]
    mov      w13, #0x7b
    eor      w12, w12, w13
    strb     w12, [x10, #0x17]
    ldrb     w12, [x9, #0x18]
    mov      w13, #0xb
    eor      w12, w12, w13
    mov      w5, #0xb
    strb     w12, [x10, #0x18]
    ldrb     w13, [x9, #0x19]
    mov      w12, #0x36
    eor      w13, w13, w12
    strb     w13, [x10, #0x19]
    ldrb     w13, [x9, #0x1a]
    mov      w14, #0x42
    eor      w13, w13, w14
    strb     w13, [x10, #0x1a]
    ldrb     w13, [x9, #0x1b]
    eor      w13, w13, #8
    strb     w13, [x10, #0x1b]
    ldrb     w13, [x9, #0x1c]
    eor      w13, w13, w14
    strb     w13, [x10, #0x1c]
    ldrb     w13, [x9, #0x1d]
    mov      w14, #0x74
    eor      w13, w13, w14
    strb     w13, [x10, #0x1d]
    ldrb     w13, [x9, #0x1e]
    mov      w16, #0xa1
    eor      w13, w13, w16
    strb     w13, [x10, #0x1e]
    ldrb     w13, [x9, #0x1f]
    eor      w13, w13, #0xfffffff3
    strb     w13, [x10, #0x1f]
    ldrb     w13, [x9, #0x20]
    eor      w13, w13, #4
    strb     w13, [x10, #0x20]
    ldrb     w13, [x9, #0x21]
    mov      w16, #0x94
    eor      w13, w13, w16
    strb     w13, [x10, #0x21]
    ldrb     w13, [x9, #0x22]
    eor      w13, w13, #0xffffffc1
    strb     w13, [x10, #0x22]
    ldrb     w13, [x9, #0x23]
    mov      w16, #0x16
    eor      w13, w13, w16
    strb     w13, [x10, #0x23]
    ldrb     w13, [x9, #0x24]
    mov      w16, #0xa7
    eor      w13, w13, w16
    strb     w13, [x10, #0x24]
    ldrb     w13, [x9, #0x25]
    mov      w16, #0x26
    eor      w13, w13, w16
    mov      w0, #0x26
    strb     w13, [x10, #0x25]
    ldrb     w13, [x9, #0x26]
    eor      w13, w13, #0xffffffe7
    strb     w13, [x10, #0x26]
    ldrb     w13, [x9, #0x27]
    mov      w16, #0x86
    eor      w13, w13, w16
    mov      w19, #0x86
    strb     w13, [x10, #0x27]
    ldrb     w13, [x9, #0x28]
    eor      w13, w13, #0x66666666
    strb     w13, [x10, #0x28]
    ldrb     w13, [x9, #0x29]
    mov      w16, #0x61
    eor      w13, w13, w16
    mov      w20, #0x61
    strb     w13, [x10, #0x29]
    ldrb     w13, [x9, #0x2a]
    mov      w4, #0xa
    eor      w13, w13, w4
    strb     w13, [x10, #0x2a]
    ldrb     w13, [x9, #0x2b]
    mov      w16, #0x2a
    eor      w13, w13, w16
    strb     w13, [x10, #0x2b]
    ldrb     w13, [x9, #0x2c]
    mov      w16, #0x90
    eor      w13, w13, w16
    mov      w23, #0x90
    strb     w13, [x10, #0x2c]
    ldrb     w13, [x9, #0x2d]
    eor      w13, w13, w0
    strb     w13, [x10, #0x2d]
    ldrb     w13, [x9, #0x2e]
    eor      w13, w13, #0xffffffc7
    strb     w13, [x10, #0x2e]
    ldrb     w13, [x9, #0x2f]
    mov      w16, #0x5b
    eor      w13, w13, w16
    strb     w13, [x10, #0x2f]
    ldrb     w13, [x9, #0x30]
    eor      w13, w13, #0x55555555
    strb     w13, [x10, #0x30]
    ldrb     w13, [x9, #0x31]
    mov      w25, #0x2b
    eor      w13, w13, w25
    strb     w13, [x10, #0x31]
    ldrb     w13, [x9, #0x32]
    mov      w16, #0xbc
    eor      w13, w13, w16
    strb     w13, [x10, #0x32]
    ldrb     w13, [x9, #0x33]
    eor      w13, w13, #0x88888888
    strb     w13, [x10, #0x33]
    ldrb     w16, [x9, #0x34]
    mov      w13, #0x29
    eor      w16, w16, w13
    strb     w16, [x10, #0x34]
    ldrb     w16, [x9, #0x35]
    eor      w16, w16, #0xffffff9f
    strb     w16, [x10, #0x35]
    ldrb     w16, [x9, #0x36]
    eor      w16, w16, #0xffffffe7
    strb     w16, [x10, #0x36]
    ldrb     w16, [x9, #0x37]
    eor      w14, w16, w14
    strb     w14, [x10, #0x37]
    ldrb     w14, [x9, #0x38]
    eor      w14, w14, w1
    strb     w14, [x10, #0x38]
    ldrb     w14, [x9, #0x39]
    mov      w16, #0xa0
    eor      w14, w14, w16
    strb     w14, [x10, #0x39]
    ldrb     w14, [x9, #0x3a]
    mov      w16, #0x6a
    eor      w14, w14, w16
    strb     w14, [x10, #0x3a]
    ldrb     w14, [x9, #0x3b]
    mov      w7, #0x82
    eor      w14, w14, w7
    strb     w14, [x10, #0x3b]
    ldrb     w16, [x9, #0x3c]
    mov      w14, #0x4e
    eor      w16, w16, w14
    strb     w16, [x10, #0x3c]
    ldrb     w16, [x9, #0x3d]
    mov      w0, #0x5a
    eor      w16, w16, w0
    strb     w16, [x10, #0x3d]
    ldrb     w16, [x9, #0x3e]
    mov      w30, #0x85
    eor      w16, w16, w30
    strb     w16, [x10, #0x3e]
    ldrb     w16, [x9, #0x3f]
    eor      w16, w16, #1
    strb     w16, [x10, #0x3f]
    ldrb     w16, [x9, #0x40]
    eor      w16, w16, #0xfffffffd
    strb     w16, [x10, #0x40]
    ldrb     w16, [x9, #0x41]
    mov      w0, #0x39
    eor      w16, w16, w0
    strb     w16, [x10, #0x41]
    ldrb     w0, [x9, #0x42]
    mov      w16, #0xc2
    eor      w0, w0, w16
    strb     w0, [x10, #0x42]
    ldrb     w0, [x9, #0x43]
    mov      w1, #0xc9
    eor      w0, w0, w1
    strb     w0, [x10, #0x43]
    ldrb     w0, [x9, #0x44]
    mov      w1, #0xad
    eor      w0, w0, w1
    strb     w0, [x10, #0x44]
    ldrb     w0, [x9, #0x45]
    eor      w0, w0, w8
    strb     w0, [x10, #0x45]
    ldrb     w0, [x9, #0x46]
    eor      w0, w0, #0x99999999
    strb     w0, [x10, #0x46]
    ldrb     w0, [x9, #0x47]
    eor      w0, w0, #0x38
    strb     w0, [x10, #0x47]
    ldrb     w0, [x9, #0x48]
    eor      w0, w0, #0x18
    strb     w0, [x10, #0x48]
    ldrb     w0, [x9, #0x49]
    mov      w22, #0xec
    eor      w0, w0, w22
    strb     w0, [x10, #0x49]
    ldrb     w0, [x9, #0x4a]
    mov      w2, #0x35
    eor      w0, w0, w2
    strb     w0, [x10, #0x4a]
    ldrb     w1, [x9, #0x4b]
    mov      w0, #0xcd
    eor      w1, w1, w0
    strb     w1, [x10, #0x4b]
    ldrb     w1, [x9, #0x4c]
    eor      w1, w1, #0xffffffe7
    strb     w1, [x10, #0x4c]
    ldrb     w1, [x9, #0x4d]
    mov      w3, #0x59
    eor      w1, w1, w3
    strb     w1, [x10, #0x4d]
    ldrb     w1, [x9, #0x4e]
    mov      w3, #0x14
    eor      w1, w1, w3
    strb     w1, [x10, #0x4e]
    ldrb     w1, [x9, #0x4f]
    eor      w1, w1, w5
    strb     w1, [x10, #0x4f]
    ldrb     w1, [x9, #0x50]
    eor      w1, w1, #0x1f
    strb     w1, [x10, #0x50]
    ldrb     w1, [x9, #0x51]
    eor      w1, w1, w8
    strb     w1, [x10, #0x51]
    ldrb     w1, [x9, #0x52]
    eor      w1, w1, w20
    strb     w1, [x10, #0x52]
    ldrb     w1, [x9, #0x53]
    eor      w17, w1, w17
    strb     w17, [x10, #0x53]
    ldrb     w17, [x9, #0x54]
    mov      w1, #0x9d
    eor      w17, w17, w1
    strb     w17, [x10, #0x54]
    ldrb     w17, [x9, #0x55]
    mov      w1, #0x19
    eor      w17, w17, w1
    strb     w17, [x10, #0x55]
    ldrb     w1, [x9, #0x56]
    mov      w17, #0xf5
    eor      w1, w1, w17
    strb     w1, [x10, #0x56]
    ldrb     w1, [x9, #0x57]
    mov      w3, #0x34
    eor      w1, w1, w3
    strb     w1, [x10, #0x57]
    ldrb     w1, [x9, #0x58]
    mov      w3, #0x76
    eor      w1, w1, w3
    strb     w1, [x10, #0x58]
    ldrb     w1, [x9, #0x59]
    eor      w1, w1, w22
    strb     w1, [x10, #0x59]
    ldrb     w1, [x9, #0x5a]
    eor      w1, w1, #2
    strb     w1, [x10, #0x5a]
    ldrb     w1, [x9, #0x5b]
    mov      w3, #0xd
    eor      w1, w1, w3
    strb     w1, [x10, #0x5b]
    ldrb     w1, [x9, #0x5c]
    eor      w1, w1, w30
    strb     w1, [x10, #0x5c]
    ldrb     w1, [x9, #0x5d]
    eor      w1, w1, w30
    strb     w1, [x10, #0x5d]
    ldrb     w1, [x9, #0x5e]
    eor      w1, w1, #4
    strb     w1, [x10, #0x5e]
    ldrb     w1, [x9, #0x5f]
    mov      w5, #0xce
    eor      w1, w1, w5
    strb     w1, [x10, #0x5f]
    ldrb     w1, [x9, #0x60]
    mov      w3, #0x1b
    eor      w1, w1, w3
    strb     w1, [x10, #0x60]
    ldrb     w1, [x9, #0x61]
    eor      w1, w1, #0x1c
    strb     w1, [x10, #0x61]
    ldrb     w1, [x9, #0x62]
    mov      w3, #0xd1
    eor      w1, w1, w3
    strb     w1, [x10, #0x62]
    ldrb     w3, [x9, #0x63]
    mov      w1, #0x2e
    eor      w3, w3, w1
    strb     w3, [x10, #0x63]
    ldrb     w3, [x9, #0x64]
    eor      w3, w3, w6
    strb     w3, [x10, #0x64]
    ldrb     w6, [x9, #0x65]
    mov      w3, #0x47
    eor      w6, w6, w3
    strb     w6, [x10, #0x65]
    ldrb     w6, [x9, #0x66]
    eor      w6, w6, w7
    strb     w6, [x10, #0x66]
    ldrb     w6, [x9, #0x67]
    eor      w6, w6, #0xffffffbf
    strb     w6, [x10, #0x67]
    ldrb     w6, [x9, #0x68]
    eor      w0, w6, w0
    strb     w0, [x10, #0x68]
    ldrb     w0, [x9, #0x69]
    mov      w21, #0x5d
    eor      w0, w0, w21
    strb     w0, [x10, #0x69]
    ldrb     w0, [x9, #0x6a]
    eor      w8, w0, w8
    strb     w8, [x10, #0x6a]
    ldrb     w8, [x9, #0x6b]
    mov      w0, #0x2c
    eor      w8, w8, w0
    strb     w8, [x10, #0x6b]
    ldrb     w8, [x9, #0x6c]
    eor      w8, w8, w4
    strb     w8, [x10, #0x6c]
    ldrb     w8, [x9, #0x6d]
    mov      w4, #0x64
    eor      w8, w8, w4
    strb     w8, [x10, #0x6d]
    ldrb     w8, [x9, #0x6e]
    eor      w8, w8, w22
    strb     w8, [x10, #0x6e]
    ldrb     w8, [x9, #0x6f]
    eor      w8, w8, w30
    strb     w8, [x10, #0x6f]
    ldrb     w8, [x9, #0x70]
    eor      w8, w8, w15
    strb     w8, [x10, #0x70]
    ldrb     w8, [x9, #0x71]
    mov      w15, #0x17
    eor      w8, w8, w15
    strb     w8, [x10, #0x71]
    ldrb     w8, [x9, #0x72]
    eor      w8, w8, #0xf
    strb     w8, [x10, #0x72]
    ldrb     w8, [x9, #0x73]
    mov      w15, #0xcb
    eor      w8, w8, w15
    strb     w8, [x10, #0x73]
    ldrb     w8, [x9, #0x74]
    mov      w15, #0xe9
    eor      w8, w8, w15
    strb     w8, [x10, #0x74]
    ldrb     w8, [x9, #0x75]
    mov      w15, #0xd5
    eor      w8, w8, w15
    strb     w8, [x10, #0x75]
    ldrb     w15, [x9, #0x76]
    mov      w8, #0x3a
    eor      w15, w15, w8
    strb     w15, [x10, #0x76]
    ldrb     w15, [x9, #0x77]
    mov      w4, #0xd2
    eor      w15, w15, w4
    strb     w15, [x10, #0x77]
    ldrb     w15, [x9, #0x78]
    eor      w15, w15, #0xdddddddd
    strb     w15, [x10, #0x78]
    ldrb     w15, [x9, #0x79]
    mov      w4, #0xf4
    eor      w15, w15, w4
    strb     w15, [x10, #0x79]
    ldrb     w15, [x9, #0x7a]
    eor      w15, w15, w19
    strb     w15, [x10, #0x7a]
    ldrb     w15, [x9, #0x7b]
    eor      w15, w15, #0xfc
    strb     w15, [x10, #0x7b]
    ldrb     w15, [x9, #0x7c]
    eor      w15, w15, #0x40
    strb     w15, [x10, #0x7c]
    ldrb     w15, [x9, #0x7d]
    mov      w4, #0xd3
    eor      w15, w15, w4
    strb     w15, [x10, #0x7d]
    ldrb     w15, [x9, #0x7e]
    eor      w15, w15, #0xffffffbf
    strb     w15, [x10, #0x7e]
    ldrb     w15, [x9, #0x7f]
    mov      w6, #0xb7
    eor      w15, w15, w6
    strb     w15, [x10, #0x7f]
    ldrb     w15, [x9, #0x80]
    eor      w15, w15, #0xdddddddd
    strb     w15, [x10, #0x80]
    ldrb     w15, [x9, #0x81]
    mov      w26, #0x4c
    eor      w15, w15, w26
    strb     w15, [x10, #0x81]
    ldrb     w15, [x9, #0x82]
    eor      w15, w15, #0xbbbbbbbb
    strb     w15, [x10, #0x82]
    ldrb     w15, [x9, #0x83]
    eor      w15, w15, #0xffffffc7
    strb     w15, [x10, #0x83]
    ldrb     w15, [x9, #0x84]
    mov      w4, #0x1d
    eor      w15, w15, w4
    strb     w15, [x10, #0x84]
    ldrb     w15, [x9, #0x85]
    eor      w15, w15, w25
    strb     w15, [x10, #0x85]
    ldrb     w15, [x9, #0x86]
    mov      w20, #0xd8
    eor      w15, w15, w20
    strb     w15, [x10, #0x86]
    ldrb     w15, [x9, #0x87]
    eor      w15, w15, #0x40
    strb     w15, [x10, #0x87]
    ldrb     w15, [x9, #0x88]
    eor      w15, w15, #0xffffffe1
    strb     w15, [x10, #0x88]
    ldrb     w4, [x9, #0x89]
    mov      w15, #0x2d
    eor      w4, w4, w15
    strb     w4, [x10, #0x89]
    ldrb     w4, [x9, #0x8a]
    mov      w19, #0xb0
    eor      w4, w4, w19
    strb     w4, [x10, #0x8a]
    ldrb     w4, [x9, #0x8b]
    eor      w4, w4, w24
    strb     w4, [x10, #0x8b]
    ldrb     w4, [x9, #0x8c]
    mvn      w4, w4
    strb     w4, [x10, #0x8c]
    ldrb     w4, [x9, #0x8d]
    mov      w7, #0x62
    eor      w4, w4, w7
    strb     w4, [x10, #0x8d]
    ldrb     w4, [x9, #0x8e]
    mov      w24, #0xc5
    eor      w4, w4, w24
    strb     w4, [x10, #0x8e]
    ldrb     w4, [x9, #0x8f]
    mov      w19, #0x8c
    eor      w4, w4, w19
    strb     w4, [x10, #0x8f]
    ldrb     w4, [x9, #0x90]
    eor      w4, w4, #0x66666666
    strb     w4, [x10, #0x90]
    ldrb     w4, [x9, #0x91]
    eor      w17, w4, w17
    strb     w17, [x10, #0x91]
    ldrb     w17, [x9, #0x92]
    mov      w4, #0x68
    eor      w17, w17, w4
    strb     w17, [x10, #0x92]
    ldrb     w17, [x9, #0x93]
    mov      w19, #0xb1
    eor      w17, w17, w19
    strb     w17, [x10, #0x93]
    ldrb     w17, [x9, #0x94]
    mov      w4, #0x72
    eor      w17, w17, w4
    strb     w17, [x10, #0x94]
    ldrb     w17, [x9, #0x95]
    mov      w4, #0x71
    eor      w17, w17, w4
    strb     w17, [x10, #0x95]
    ldrb     w17, [x9, #0x96]
    eor      w11, w17, w11
    strb     w11, [x10, #0x96]
    ldrb     w11, [x9, #0x97]
    mov      w17, #0xea
    eor      w11, w11, w17
    strb     w11, [x10, #0x97]
    ldrb     w11, [x9, #0x98]
    eor      w11, w11, w28
    strb     w11, [x10, #0x98]
    ldrb     w11, [x9, #0x99]
    mov      w4, #0x58
    eor      w11, w11, w4
    strb     w11, [x10, #0x99]
    ldrb     w11, [x9, #0x9a]
    eor      w11, w11, #0x10
    strb     w11, [x10, #0x9a]
    ldrb     w11, [x9, #0x9b]
    eor      w11, w11, w23
    strb     w11, [x10, #0x9b]
    ldrb     w11, [x9, #0x9c]
    eor      w11, w11, w6
    strb     w11, [x10, #0x9c]
    ldrb     w11, [x9, #0x9d]
    eor      w11, w11, #0xf
    strb     w11, [x10, #0x9d]
    ldrb     w11, [x9, #0x9e]
    eor      w11, w11, #2
    strb     w11, [x10, #0x9e]
    ldrb     w11, [x9, #0x9f]
    mov      w28, #0xb8
    eor      w11, w11, w28
    strb     w11, [x10, #0x9f]
    ldrb     w11, [x9, #0xa0]
    eor      w11, w11, #0x44444444
    strb     w11, [x10, #0xa0]
    ldrb     w11, [x9, #0xa1]
    eor      w11, w11, w8
    strb     w11, [x10, #0xa1]
    ldrb     w11, [x9, #0xa2]
    mov      w17, #0x46
    eor      w11, w11, w17
    strb     w11, [x10, #0xa2]
    ldrb     w11, [x9, #0xa3]
    mov      w17, #0xba
    eor      w11, w11, w17
    strb     w11, [x10, #0xa3]
    ldrb     w11, [x9, #0xa4]
    eor      w11, w11, w2
    strb     w11, [x10, #0xa4]
    ldrb     w11, [x9, #0xa5]
    eor      w11, w11, #0x80
    strb     w11, [x10, #0xa5]
    ldrb     w11, [x9, #0xa6]
    mov      w2, #0x75
    eor      w11, w11, w2
    strb     w11, [x10, #0xa6]
    ldrb     w11, [x9, #0xa7]
    eor      w8, w11, w8
    strb     w8, [x10, #0xa7]
    ldrb     w8, [x9, #0xa8]
    mov      w11, #0xda
    eor      w8, w8, w11
    strb     w8, [x10, #0xa8]
    ldrb     w8, [x9, #0xa9]
    mov      w11, #0x73
    eor      w8, w8, w11
    strb     w8, [x10, #0xa9]
    ldrb     w8, [x9, #0xaa]
    mov      w11, #0x92
    eor      w8, w8, w11
    strb     w8, [x10, #0xaa]
    ldrb     w8, [x9, #0xab]
    mov      w2, #0x50
    eor      w8, w8, w2
    strb     w8, [x10, #0xab]
    ldrb     w8, [x9, #0xac]
    mov      w6, #0xe2
    eor      w8, w8, w6
    strb     w8, [x10, #0xac]
    ldrb     w8, [x9, #0xad]
    eor      w8, w8, w28
    strb     w8, [x10, #0xad]
    ldrb     w8, [x9, #0xae]
    eor      w8, w8, #0x11111111
    strb     w8, [x10, #0xae]
    ldrb     w8, [x9, #0xaf]
    eor      w8, w8, w16
    strb     w8, [x10, #0xaf]
    ldrb     w8, [x9, #0xb0]
    eor      w8, w8, #0x55555555
    strb     w8, [x10, #0xb0]
    ldrb     w8, [x9, #0xb1]
    eor      w8, w8, #0xffffffc7
    strb     w8, [x10, #0xb1]
    ldrb     w8, [x9, #0xb2]
    eor      w8, w8, #6
    strb     w8, [x10, #0xb2]
    ldrb     w8, [x9, #0xb3]
    eor      w8, w8, #0xffffffe3
    strb     w8, [x10, #0xb3]
    ldrb     w8, [x9, #0xb4]
    mov      w11, #0x76
    eor      w8, w8, w11
    strb     w8, [x10, #0xb4]
    ldrb     w8, [x9, #0xb5]
    mov      w16, #0x57
    eor      w8, w8, w16
    strb     w8, [x10, #0xb5]
    ldrb     w8, [x9, #0xb6]
    eor      w8, w8, w15
    strb     w8, [x10, #0xb6]
    ldrb     w8, [x9, #0xb7]
    eor      w8, w8, w13
    strb     w8, [x10, #0xb7]
    ldrb     w8, [x9, #0xb8]
    eor      w8, w8, #0xfc
    strb     w8, [x10, #0xb8]
    ldrb     w8, [x9, #0xb9]
    eor      w8, w8, #0xffffffe3
    strb     w8, [x10, #0xb9]
    ldrb     w8, [x9, #0xba]
    mov      w13, #0x52
    eor      w8, w8, w13
    strb     w8, [x10, #0xba]
    ldrb     w8, [x9, #0xbb]
    mov      w13, #0xb6
    eor      w8, w8, w13
    strb     w8, [x10, #0xbb]
    ldrb     w8, [x9, #0xbc]
    eor      w8, w8, w21
    strb     w8, [x10, #0xbc]
    ldrb     w8, [x9, #0xbd]
    mov      w13, #0xa5
    eor      w8, w8, w13
    strb     w8, [x10, #0xbd]
    ldrb     w8, [x9, #0xbe]
    eor      w8, w8, w12
    strb     w8, [x10, #0xbe]
    ldrb     w8, [x9, #0xbf]
    mov      w2, #0x4b
    eor      w8, w8, w2
    strb     w8, [x10, #0xbf]
    ldrb     w8, [x9, #0xc0]
    eor      w8, w8, w5
    strb     w8, [x10, #0xc0]
    ldrb     w8, [x9, #0xc1]
    eor      w8, w8, #0x77777777
    strb     w8, [x10, #0xc1]
    ldrb     w8, [x9, #0xc2]
    eor      w8, w8, #0x77777777
    strb     w8, [x10, #0xc2]
    ldrb     w8, [x9, #0xc3]
    mov      w13, #0x31
    eor      w8, w8, w13
    strb     w8, [x10, #0xc3]
    ldrb     w8, [x9, #0xc4]
    mov      w15, #0x79
    eor      w8, w8, w15
    strb     w8, [x10, #0xc4]
    ldrb     w8, [x9, #0xc5]
    mov      w13, #0x25
    eor      w8, w8, w13
    strb     w8, [x10, #0xc5]
    ldrb     w8, [x9, #0xc6]
    mov      w21, #0xc6
    eor      w8, w8, w21
    strb     w8, [x10, #0xc6]
    ldrb     w8, [x9, #0xc7]
    eor      w8, w8, #0xbbbbbbbb
    strb     w8, [x10, #0xc7]
    ldrb     w13, [x9, #0xc8]
    mov      w8, #0x48
    eor      w13, w13, w8
    strb     w13, [x10, #0xc8]
    ldrb     w13, [x9, #0xc9]
    eor      w13, w13, w19
    strb     w13, [x10, #0xc9]
    ldrb     w13, [x9, #0xca]
    eor      w13, w13, w6
    strb     w13, [x10, #0xca]
    ldrb     w13, [x9, #0xcb]
    eor      w13, w13, #0xfffffff9
    strb     w13, [x10, #0xcb]
    ldrb     w13, [x9, #0xcc]
    eor      w13, w13, #0xfffffffb
    strb     w13, [x10, #0xcc]
    ldrb     w13, [x9, #0xcd]
    mov      w16, #0x7d
    eor      w13, w13, w16
    strb     w13, [x10, #0xcd]
    ldrb     w13, [x9, #0xce]
    eor      w13, w13, #0xe0
    strb     w13, [x10, #0xce]
    ldrb     w13, [x9, #0xcf]
    eor      w13, w13, #0x10
    strb     w13, [x10, #0xcf]
    ldrb     w16, [x9, #0xd0]
    mov      w13, #0xae
    eor      w16, w16, w13
    strb     w16, [x10, #0xd0]
    ldrb     w16, [x9, #0xd1]
    eor      w16, w16, #0xfffffffd
    strb     w16, [x10, #0xd1]
    ldrb     w16, [x9, #0xd2]
    eor      w16, w16, w25
    strb     w16, [x10, #0xd2]
    ldrb     w19, [x9, #0xd3]
    mov      w7, #0xb9
    eor      w19, w19, w7
    strb     w19, [x10, #0xd3]
    ldrb     w19, [x9, #0xd4]
    eor      w19, w19, #0xffffffbf
    strb     w19, [x10, #0xd4]
    ldrb     w19, [x9, #0xd5]
    mov      w28, #0x49
    eor      w19, w19, w28
    strb     w19, [x10, #0xd5]
    ldrb     w19, [x9, #0xd6]
    mov      w13, #0xd
    eor      w19, w19, w13
    strb     w19, [x10, #0xd6]
    ldrb     w19, [x9, #0xd7]
    eor      w19, w19, #0x7e
    strb     w19, [x10, #0xd7]
    ldrb     w19, [x9, #0xd8]
    eor      w5, w19, w5
    strb     w5, [x10, #0xd8]
    ldrb     w5, [x9, #0xd9]
    mov      w19, #0x45
    eor      w5, w5, w19
    strb     w5, [x10, #0xd9]
    ldrb     w5, [x9, #0xda]
    mov      w19, #0xf2
    eor      w5, w5, w19
    strb     w5, [x10, #0xda]
    ldrb     w5, [x9, #0xdb]
    eor      w5, w5, #0x55555555
    strb     w5, [x10, #0xdb]
    ldrb     w5, [x9, #0xdc]
    eor      w5, w5, #0xe0
    strb     w5, [x10, #0xdc]
    ldrb     w5, [x9, #0xdd]
    mov      w23, #0xcb
    eor      w5, w5, w23
    strb     w5, [x10, #0xdd]
    ldrb     w5, [x9, #0xde]
    eor      w5, w5, #0xfffffff3
    strb     w5, [x10, #0xde]
    ldrb     w5, [x9, #0xdf]
    mov      w19, #0x7b
    eor      w5, w5, w19
    strb     w5, [x10, #0xdf]
    ldrb     w5, [x9, #0xe0]
    strb     w5, [x10, #0xe0]
    ldrb     w5, [x9, #0xe1]
    eor      w12, w5, w12
    strb     w12, [x10, #0xe1]
    ldrb     w12, [x9, #0xe2]
    strb     w12, [x10, #0xe2]
    ldrb     w12, [x9, #0xe3]
    mov      w25, #0x12
    eor      w12, w12, w25
    strb     w12, [x10, #0xe3]
    ldrb     w12, [x9, #0xe4]
    mov      w5, #0xca
    eor      w12, w12, w5
    strb     w12, [x10, #0xe4]
    ldrb     w12, [x9, #0xe5]
    eor      w12, w12, w19
    strb     w12, [x10, #0xe5]
    ldrb     w12, [x9, #0xe6]
    mov      w19, #0x5f
    eor      w12, w12, w19
    strb     w12, [x10, #0xe6]
    ldrb     w12, [x9, #0xe7]
    eor      w12, w12, w28
    strb     w12, [x10, #0xe7]
    ldrb     w12, [x9, #0xe8]
    eor      w12, w12, w11
    strb     w12, [x10, #0xe8]
    ldrb     w12, [x9, #0xe9]
    mov      w16, #0xb
    eor      w12, w12, w16
    strb     w12, [x10, #0xe9]
    ldrb     w12, [x9, #0xea]
    eor      w12, w12, w20
    strb     w12, [x10, #0xea]
    ldrb     w12, [x9, #0xeb]
    mov      w5, #0x98
    eor      w12, w12, w5
    strb     w12, [x10, #0xeb]
    ldrb     w12, [x9, #0xec]
    eor      w12, w12, w14
    strb     w12, [x10, #0xec]
    ldrb     w14, [x9, #0xed]
    mov      w12, #0x5e
    eor      w14, w14, w12
    strb     w14, [x10, #0xed]
    ldrb     w14, [x9, #0xee]
    eor      w14, w14, w1
    strb     w14, [x10, #0xee]
    ldrb     w14, [x9, #0xef]
    mov      w5, #0xb4
    eor      w14, w14, w5
    strb     w14, [x10, #0xef]
    ldrb     w14, [x9, #0xf0]
    eor      w14, w14, w0
    strb     w14, [x10, #0xf0]
    ldrb     w14, [x9, #0xf1]
    mov      w1, #0x8a
    eor      w14, w14, w1
    strb     w14, [x10, #0xf1]
    ldrb     w14, [x9, #0xf2]
    eor      w14, w14, w26
    strb     w14, [x10, #0xf2]
    ldrb     w14, [x9, #0xf3]
    eor      w14, w14, #0xfffffff3
    strb     w14, [x10, #0xf3]
    ldrb     w14, [x9, #0xf4]
    eor      w14, w14, w3
    strb     w14, [x10, #0xf4]
    ldrb     w14, [x9, #0xf5]
    mov      w13, #0x53
    eor      w14, w14, w13
    strb     w14, [x10, #0xf5]
    ldrb     w14, [x9, #0xf6]
    eor      w14, w14, #0x33333333
    strb     w14, [x10, #0xf6]
    ldrb     w14, [x9, #0xf7]
    eor      w14, w14, w17
    strb     w14, [x10, #0xf7]
    ldrb     w17, [x9, #0xf8]
    mov      w14, #0x6c
    eor      w17, w17, w14
    strb     w17, [x10, #0xf8]
    ldrb     w17, [x9, #0xf9]
    eor      w17, w17, w19
    strb     w17, [x10, #0xf9]
    ldrb     w17, [x9, #0xfa]
    eor      w17, w17, w26
    strb     w17, [x10, #0xfa]
    ldrb     w17, [x9, #0xfb]
    eor      w17, w17, w22
    strb     w17, [x10, #0xfb]
    ldrb     w17, [x9, #0xfc]
    eor      w17, w17, #0xe0
    strb     w17, [x10, #0xfc]
    ldrb     w17, [x9, #0xfd]
    eor      w17, w17, w6
    strb     w17, [x10, #0xfd]
    ldrb     w17, [x9, #0xfe]
    eor      w17, w17, w23
    mov      w28, #0xcb
    strb     w17, [x10, #0xfe]
    ldrb     w17, [x9, #0xff]
    eor      w17, w17, #0xf0
    strb     w17, [x10, #0xff]
    ldrb     w17, [x9, #0x100]
    eor      w17, w17, w8
    mov      w0, #0x2f
    strb     w17, [x10, #0x100]
    ldrb     w17, [x9, #0x101]
    eor      w17, w17, #0xfffffffb
    strb     w17, [x10, #0x101]
    ldrb     w17, [x9, #0x102]
    eor      w17, w17, w0
    strb     w17, [x10, #0x102]
    ldrb     w17, [x9, #0x103]
    mov      w11, #0x90
    eor      w17, w17, w11
    strb     w17, [x10, #0x103]
    ldrb     w17, [x9, #0x104]
    mov      w11, #0xf4
    eor      w17, w17, w11
    strb     w17, [x10, #0x104]
    ldrb     w17, [x9, #0x105]
    eor      w17, w17, w2
    strb     w17, [x10, #0x105]
    ldrb     w17, [x9, #0x106]
    eor      w17, w17, #0x10
    strb     w17, [x10, #0x106]
    ldrb     w17, [x9, #0x107]
    mov      w23, #0x62
    eor      w17, w17, w23
    strb     w17, [x10, #0x107]
    ldrb     w17, [x9, #0x108]
    mov      w3, #0xdb
    mov      w20, #0x4f
    eor      w17, w17, w20
    strb     w17, [x10, #0x108]
    ldrb     w17, [x9, #0x109]
    eor      w17, w17, #0x78
    strb     w17, [x10, #0x109]
    ldrb     w17, [x9, #0x10a]
    mov      w19, #0x4a
    eor      w17, w17, w19
    strb     w17, [x10, #0x10a]
    ldrb     w17, [x9, #0x10b]
    eor      w17, w17, w3
    strb     w17, [x10, #0x10b]
    ldrb     w17, [x9, #0x10c]
    mov      w11, #0x39
    eor      w17, w17, w11
    strb     w17, [x10, #0x10c]
    ldrb     w17, [x9, #0x10d]
    mov      w22, #0x26
    eor      w17, w17, w22
    strb     w17, [x10, #0x10d]
    ldrb     w17, [x9, #0x10e]
    eor      w17, w17, #1
    strb     w17, [x10, #0x10e]
    ldrb     w17, [x9, #0x10f]
    mov      w11, #0xa2
    eor      w17, w17, w11
    strb     w17, [x10, #0x10f]
    ldrb     w17, [x9, #0x110]
    eor      w17, w17, #0xffffff9f
    strb     w17, [x10, #0x110]
    ldrb     w17, [x9, #0x111]
    eor      w17, w17, #0xffffffe1
    strb     w17, [x10, #0x111]
    ldrb     w17, [x9, #0x112]
    eor      w17, w17, w5
    strb     w17, [x10, #0x112]
    ldrb     w17, [x9, #0x113]
    eor      w8, w17, w8
    strb     w8, [x10, #0x113]
    ldrb     w8, [x9, #0x114]
    eor      w8, w8, #0xfffffff1
    strb     w8, [x10, #0x114]
    ldrb     w8, [x9, #0x115]
    eor      w8, w8, #0x99999999
    strb     w8, [x10, #0x115]
    ldrb     w8, [x9, #0x116]
    mov      w5, #0xc8
    eor      w8, w8, w5
    strb     w8, [x10, #0x116]
    ldrb     w8, [x9, #0x117]
    eor      w8, w8, w12
    mov      w12, #0xe8
    strb     w8, [x10, #0x117]
    ldrb     w8, [x9, #0x118]
    eor      w8, w8, w6
    strb     w8, [x10, #0x118]
    ldrb     w8, [x9, #0x119]
    eor      w8, w8, w12
    strb     w8, [x10, #0x119]
    ldrb     w8, [x9, #0x11a]
    eor      w8, w8, w19
    strb     w8, [x10, #0x11a]
    ldrb     w8, [x9, #0x11b]
    eor      w8, w8, w2
    strb     w8, [x10, #0x11b]
    ldrb     w8, [x9, #0x11c]
    eor      w8, w8, w24
    strb     w8, [x10, #0x11c]
    ldrb     w8, [x9, #0x11d]
    eor      w8, w8, #0x77777777
    strb     w8, [x10, #0x11d]
    ldrb     w8, [x9, #0x11e]
    eor      w8, w8, w26
    strb     w8, [x10, #0x11e]
    ldrb     w8, [x9, #0x11f]
    eor      w8, w8, w28
    strb     w8, [x10, #0x11f]
    ldrb     w8, [x9, #0x120]
    mov      w12, #0xd1
    eor      w8, w8, w12
    strb     w8, [x10, #0x120]
    ldrb     w8, [x9, #0x121]
    mov      w12, #0xeb
    eor      w8, w8, w12
    strb     w8, [x10, #0x121]
    ldrb     w8, [x9, #0x122]
    eor      w8, w8, w21
    strb     w8, [x10, #0x122]
    mov      w8, #0x9e
    ldrb     w17, [x9, #0x123]
    mov      w3, #0xd9
    eor      w17, w17, w3
    strb     w17, [x10, #0x123]
    ldrb     w17, [x9, #0x124]
    eor      w8, w17, w8
    strb     w8, [x10, #0x124]
    ldrb     w8, [x9, #0x125]
    mov      w17, #0x67
    eor      w8, w8, w17
    strb     w8, [x10, #0x125]
    ldrb     w8, [x9, #0x126]
    eor      w8, w8, w4
    strb     w8, [x10, #0x126]
    ldrb     w8, [x9, #0x127]
    mov      w17, #0xa1
    eor      w8, w8, w17
    strb     w8, [x10, #0x127]
    ldrb     w8, [x9, #0x128]
    eor      w8, w8, w15
    strb     w8, [x10, #0x128]
    ldrb     w8, [x9, #0x129]
    eor      w8, w8, #0xdddddddd
    strb     w8, [x10, #0x129]
    ldrb     w8, [x9, #0x12a]
    eor      w8, w8, w5
    strb     w8, [x10, #0x12a]
    ldrb     w8, [x9, #0x12b]
    eor      w8, w8, #0x55555555
    strb     w8, [x10, #0x12b]
    ldrb     w8, [x9, #0x12c]
    eor      w8, w8, #0x1f
    strb     w8, [x10, #0x12c]
    ldrb     w15, [x9, #0x12d]
    mov      w8, #0x6f
    eor      w15, w15, w8
    mov      w17, #0xc4
    strb     w15, [x10, #0x12d]
    ldrb     w15, [x9, #0x12e]
    eor      w15, w15, w13
    strb     w15, [x10, #0x12e]
    ldrb     w15, [x9, #0x12f]
    eor      w15, w15, w17
    strb     w15, [x10, #0x12f]
    ldrb     w15, [x9, #0x130]
    eor      w15, w15, #0xaaaaaaaa
    strb     w15, [x10, #0x130]
    ldrb     w15, [x9, #0x131]
    mov      w5, #0x1d
    eor      w15, w15, w5
    strb     w15, [x10, #0x131]
    ldrb     w15, [x9, #0x132]
    mov      w17, #0xa7
    eor      w15, w15, w17
    strb     w15, [x10, #0x132]
    ldrb     w15, [x9, #0x133]
    eor      w15, w15, #0xbbbbbbbb
    strb     w15, [x10, #0x133]
    ldrb     w15, [x9, #0x134]
    eor      w15, w15, #0x99999999
    strb     w15, [x10, #0x134]
    ldrb     w15, [x9, #0x135]
    mov      w21, #0xd
    eor      w15, w15, w21
    strb     w15, [x10, #0x135]
    ldrb     w15, [x9, #0x136]
    mov      w13, #0x61
    eor      w15, w15, w13
    strb     w15, [x10, #0x136]
    ldrb     w15, [x9, #0x137]
    eor      w15, w15, #0x30
    strb     w15, [x10, #0x137]
    ldrb     w15, [x9, #0x138]
    eor      w15, w15, w11
    strb     w15, [x10, #0x138]
    ldrb     w15, [x9, #0x139]
    mov      w17, #0x37
    eor      w15, w15, w17
    strb     w15, [x10, #0x139]
    ldrb     w15, [x9, #0x13a]
    eor      w15, w15, #0x55555555
    strb     w15, [x10, #0x13a]
    ldrb     w15, [x9, #0x13b]
    mov      w11, #0x23
    eor      w15, w15, w11
    strb     w15, [x10, #0x13b]
    ldrb     w15, [x9, #0x13c]
    eor      w15, w15, #6
    strb     w15, [x10, #0x13c]
    mov      w15, #0xe4
    ldrb     w17, [x9, #0x13d]
    mov      w4, #0x92
    eor      w17, w17, w4
    strb     w17, [x10, #0x13d]
    ldrb     w17, [x9, #0x13e]
    eor      w17, w17, w15
    strb     w17, [x10, #0x13e]
    ldrb     w17, [x9, #0x13f]
    mov      w11, #0x86
    eor      w17, w17, w11
    strb     w17, [x10, #0x13f]
    ldrb     w17, [x9, #0x140]
    eor      w17, w17, w2
    strb     w17, [x10, #0x140]
    ldrb     w17, [x9, #0x141]
    eor      w17, w17, #0xffffffcf
    strb     w17, [x10, #0x141]
    ldrb     w17, [x9, #0x142]
    mov      w6, #0x72
    eor      w17, w17, w6
    strb     w17, [x10, #0x142]
    ldrb     w17, [x9, #0x143]
    eor      w17, w17, w24
    strb     w17, [x10, #0x143]
    ldrb     w17, [x9, #0x144]
    eor      w17, w17, #0xcccccccc
    strb     w17, [x10, #0x144]
    ldrb     w17, [x9, #0x145]
    mov      w3, #0xd4
    eor      w17, w17, w3
    strb     w17, [x10, #0x145]
    ldrb     w17, [x9, #0x146]
    eor      w17, w17, w23
    strb     w17, [x10, #0x146]
    ldrb     w17, [x9, #0x147]
    eor      w17, w17, w16
    strb     w17, [x10, #0x147]
    ldrb     w17, [x9, #0x148]
    mov      w3, #0x51
    eor      w17, w17, w3
    strb     w17, [x10, #0x148]
    ldrb     w17, [x9, #0x149]
    eor      w17, w17, w2
    strb     w17, [x10, #0x149]
    ldrb     w17, [x9, #0x14a]
    eor      w17, w17, w12
    strb     w17, [x10, #0x14a]
    ldrb     w17, [x9, #0x14b]
    eor      w17, w17, #6
    strb     w17, [x10, #0x14b]
    ldrb     w17, [x9, #0x14c]
    eor      w17, w17, #0x55555555
    strb     w17, [x10, #0x14c]
    ldrb     w17, [x9, #0x14d]
    eor      w17, w17, w1
    strb     w17, [x10, #0x14d]
    ldrb     w17, [x9, #0x14e]
    eor      w17, w17, #0x1f
    strb     w17, [x10, #0x14e]
    ldrb     w17, [x9, #0x14f]
    eor      w17, w17, #0xffffffcf
    strb     w17, [x10, #0x14f]
    ldrb     w17, [x9, #0x150]
    eor      w17, w17, #0xffffff81
    strb     w17, [x10, #0x150]
    ldrb     w17, [x9, #0x151]
    eor      w17, w17, w22
    strb     w17, [x10, #0x151]
    ldrb     w17, [x9, #0x152]
    eor      w16, w17, w7
    strb     w16, [x10, #0x152]
    ldrb     w16, [x9, #0x153]
    eor      w16, w16, w30
    strb     w16, [x10, #0x153]
    ldrb     w16, [x9, #0x154]
    mov      w17, #0x32
    eor      w16, w16, w17
    strb     w16, [x10, #0x154]
    ldrb     w16, [x9, #0x155]
    mov      w19, #0xf4
    eor      w16, w16, w19
    strb     w16, [x10, #0x155]
    ldrb     w16, [x9, #0x156]
    mov      w11, #0x46
    eor      w16, w16, w11
    strb     w16, [x10, #0x156]
    ldrb     w16, [x9, #0x157]
    mov      w11, #0xad
    eor      w16, w16, w11
    mov      w17, #9
    strb     w16, [x10, #0x157]
    ldrb     w16, [x9, #0x158]
    eor      w16, w16, w21
    strb     w16, [x10, #0x158]
    ldrb     w16, [x9, #0x159]
    eor      w16, w16, w17
    strb     w16, [x10, #0x159]
    ldrb     w16, [x9, #0x15a]
    mov      w3, #0xd2
    eor      w16, w16, w3
    strb     w16, [x10, #0x15a]
    ldrb     w16, [x9, #0x15b]
    mov      w17, #0xe5
    eor      w16, w16, w17
    strb     w16, [x10, #0x15b]
    ldrb     w16, [x9, #0x15c]
    eor      w16, w16, w4
    strb     w16, [x10, #0x15c]
    ldrb     w16, [x9, #0x15d]
    eor      w8, w16, w8
    strb     w8, [x10, #0x15d]
    ldrb     w8, [x9, #0x15e]
    mov      w16, #0x2a
    eor      w8, w8, w16
    strb     w8, [x10, #0x15e]
    ldrb     w8, [x9, #0x15f]
    mov      w16, #0x91
    eor      w8, w8, w16
    strb     w8, [x10, #0x15f]
    ldrb     w8, [x9, #0x160]
    eor      w8, w8, #0xffffff87
    strb     w8, [x10, #0x160]
    ldrb     w8, [x9, #0x161]
    mov      w16, #0x15
    eor      w8, w8, w16
    strb     w8, [x10, #0x161]
    ldrb     w8, [x9, #0x162]
    mov      w11, #0x19
    eor      w8, w8, w11
    strb     w8, [x10, #0x162]
    ldrb     w16, [x9, #0x163]
    mov      w8, #0xfa
    eor      w16, w16, w8
    strb     w16, [x10, #0x163]
    ldrb     w16, [x9, #0x164]
    eor      w16, w16, #0x7e
    strb     w16, [x10, #0x164]
    ldrb     w16, [x9, #0x165]
    mvn      w16, w16
    strb     w16, [x10, #0x165]
    ldrb     w16, [x9, #0x166]
    mov      w2, #0x6a
    eor      w16, w16, w2
    strb     w16, [x10, #0x166]
    ldrb     w16, [x9, #0x167]
    eor      w16, w16, w15
    strb     w16, [x10, #0x167]
    mov      w17, #0x41
    ldrb     w1, [x9, #0x168]
    mov      w16, #0x93
    eor      w1, w1, w16
    strb     w1, [x10, #0x168]
    ldrb     w1, [x9, #0x169]
    eor      w17, w1, w17
    strb     w17, [x10, #0x169]
    ldrb     w17, [x9, #0x16a]
    mov      w11, #0x82
    eor      w17, w17, w11
    strb     w17, [x10, #0x16a]
    ldrb     w17, [x9, #0x16b]
    eor      w17, w17, w12
    strb     w17, [x10, #0x16b]
    ldrb     w17, [x9, #0x16c]
    eor      w17, w17, #0x3c
    strb     w17, [x10, #0x16c]
    ldrb     w17, [x9, #0x16d]
    eor      w17, w17, #0x77777777
    strb     w17, [x10, #0x16d]
    ldrb     w17, [x9, #0x16e]
    eor      w17, w17, w14
    strb     w17, [x10, #0x16e]
    ldrb     w17, [x9, #0x16f]
    mov      w1, #0x23
    eor      w17, w17, w1
    strb     w17, [x10, #0x16f]
    ldrb     w17, [x9, #0x170]
    eor      w17, w17, #0xf
    strb     w17, [x10, #0x170]
    ldrb     w17, [x9, #0x171]
    eor      w17, w17, w0
    strb     w17, [x10, #0x171]
    ldrb     w17, [x9, #0x172]
    eor      w17, w17, w2
    strb     w17, [x10, #0x172]
    ldrb     w17, [x9, #0x173]
    eor      w15, w17, w15
    strb     w15, [x10, #0x173]
    ldrb     w15, [x9, #0x174]
    mov      w17, #0x95
    eor      w15, w15, w17
    strb     w15, [x10, #0x174]
    ldrb     w15, [x9, #0x175]
    eor      w15, w15, #0xffffffcf
    strb     w15, [x10, #0x175]
    ldrb     w15, [x9, #0x176]
    eor      w15, w15, #0x10
    strb     w15, [x10, #0x176]
    ldrb     w15, [x9, #0x177]
    eor      w15, w15, #0xfe
    strb     w15, [x10, #0x177]
    ldrb     w15, [x9, #0x178]
    eor      w15, w15, w19
    strb     w15, [x10, #0x178]
    ldrb     w15, [x9, #0x179]
    eor      w15, w15, #2
    strb     w15, [x10, #0x179]
    ldrb     w15, [x9, #0x17a]
    eor      w15, w15, w17
    strb     w15, [x10, #0x17a]
    ldrb     w15, [x9, #0x17b]
    mov      w11, #0x73
    eor      w15, w15, w11
    strb     w15, [x10, #0x17b]
    ldrb     w15, [x9, #0x17c]
    eor      w15, w15, w25
    strb     w15, [x10, #0x17c]
    ldrb     w15, [x9, #0x17d]
    mov      w13, #0x7b
    eor      w15, w15, w13
    strb     w15, [x10, #0x17d]
    ldrb     w15, [x9, #0x17e]
    eor      w11, w15, w11
    strb     w11, [x10, #0x17e]
    ldrb     w11, [x9, #0x17f]
    mov      w13, #0xae
    eor      w11, w11, w13
    strb     w11, [x10, #0x17f]
    ldrb     w11, [x9, #0x180]
    eor      w11, w11, #0xf0
    strb     w11, [x10, #0x180]
    ldrb     w11, [x9, #0x181]
    eor      w11, w11, #0xffffff9f
    strb     w11, [x10, #0x181]
    ldrb     w11, [x9, #0x182]
    mov      w13, #0x8b
    eor      w11, w11, w13
    strb     w11, [x10, #0x182]
    ldrb     w11, [x9, #0x183]
    mov      w13, #0x68
    eor      w11, w11, w13
    strb     w11, [x10, #0x183]
    ldrb     w11, [x9, #0x184]
    eor      w11, w11, w1
    strb     w11, [x10, #0x184]
    ldrb     w11, [x9, #0x185]
    mov      w13, #0xda
    eor      w11, w11, w13
    strb     w11, [x10, #0x185]
    ldrb     w11, [x9, #0x186]
    mov      w13, #0x75
    eor      w11, w11, w13
    strb     w11, [x10, #0x186]
    ldrb     w11, [x9, #0x187]
    eor      w11, w11, #0xf8
    strb     w11, [x10, #0x187]
    ldrb     w11, [x9, #0x188]
    eor      w11, w11, w20
    strb     w11, [x10, #0x188]
    ldrb     w11, [x9, #0x189]
    mov      w13, #0xa0
    eor      w11, w11, w13
    strb     w11, [x10, #0x189]
    ldrb     w11, [x9, #0x18a]
    mov      w13, #0x8d
    eor      w11, w11, w13
    mov      w13, #0x4d
    strb     w11, [x10, #0x18a]
    ldrb     w11, [x9, #0x18b]
    mov      w15, #0x76
    eor      w11, w11, w15
    strb     w11, [x10, #0x18b]
    ldrb     w11, [x9, #0x18c]
    eor      w11, w11, w13
    strb     w11, [x10, #0x18c]
    ldrb     w13, [x9, #0x18d]
    mov      w11, #0x3b
    eor      w13, w13, w11
    strb     w13, [x10, #0x18d]
    ldrb     w13, [x9, #0x18e]
    eor      w13, w13, #0xffffffc1
    strb     w13, [x10, #0x18e]
    ldrb     w13, [x9, #0x18f]
    eor      w13, w13, #0x7f
    strb     w13, [x10, #0x18f]
    ldrb     w13, [x9, #0x190]
    eor      w13, w13, #3
    strb     w13, [x10, #0x190]
    ldrb     w13, [x9, #0x191]
    eor      w13, w13, w14
    strb     w13, [x10, #0x191]
    ldrb     w13, [x9, #0x192]
    mov      w14, #0xb3
    eor      w13, w13, w14
    strb     w13, [x10, #0x192]
    ldrb     w13, [x9, #0x193]
    eor      w12, w13, w12
    strb     w12, [x10, #0x193]
    ldrb     w12, [x9, #0x194]
    mov      w13, #0x8e
    eor      w12, w12, w13
    strb     w12, [x10, #0x194]
    ldrb     w12, [x9, #0x195]
    mov      w13, #0xb6
    eor      w12, w12, w13
    strb     w12, [x10, #0x195]
    ldrb     w12, [x9, #0x196]
    eor      w12, w12, w5
    strb     w12, [x10, #0x196]
    ldrb     w12, [x9, #0x197]
    eor      w12, w12, w17
    strb     w12, [x10, #0x197]
    ldrb     w12, [x9, #0x198]
    eor      w12, w12, #0xbbbbbbbb
    strb     w12, [x10, #0x198]
    ldrb     w12, [x9, #0x199]
    eor      w12, w12, w16
    strb     w12, [x10, #0x199]
    ldrb     w12, [x9, #0x19a]
    eor      w12, w12, #0xe0
    strb     w12, [x10, #0x19a]
    ldrb     w12, [x9, #0x19b]
    eor      w12, w12, w28
    strb     w12, [x10, #0x19b]
    ldrb     w12, [x9, #0x19c]
    eor      w12, w12, #4
    strb     w12, [x10, #0x19c]
    ldrb     w12, [x9, #0x19d]
    eor      w12, w12, w6
    strb     w12, [x10, #0x19d]
    ldrb     w12, [x9, #0x19e]
    mov      w13, #0x5a
    eor      w12, w12, w13
    strb     w12, [x10, #0x19e]
    ldrb     w12, [x9, #0x19f]
    mov      w13, #0x42
    eor      w12, w12, w13
    strb     w12, [x10, #0x19f]
    ldrb     w12, [x9, #0x1a0]
    eor      w12, w12, w3
    strb     w12, [x10, #0x1a0]
    ldrb     w12, [x9, #0x1a1]
    eor      w8, w12, w8
    strb     w8, [x10, #0x1a1]
    ldrb     w8, [x9, #0x1a2]
    eor      w8, w8, w11
    strb     w8, [x10, #0x1a2]
    ldrb     w8, [x9, #0x1a3]
    eor      w8, w8, #0xffffffef
    strb     w8, [x10, #0x1a3]
    ldrb     w8, [x9, #0x1a4]
    eor      w8, w8, #0x1e
    strb     w8, [x10, #0x1a4]
    ldrb     w8, [x9, #0x1a5]
    adrp     x9, #0x580000
    add      x9, x9, #0x600
    mov      w11, #0xe9
    eor      w8, w8, w11
    strb     w8, [x10, #0x1a5]
    mov      w8, #1
    stlr     w8, [x9]
    ldr      x0, [x27, #8]
    cbnz     x0, #0x2efdac
    adrp     x0, #0x541000
    add      x0, x0, #0xe30
    mov      w1, #0x1a6
    bl       #0x2efdc8
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x2eff9c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x2efe5c
    str      x0, [x27, #8]
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x2f0118
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x27, #8]
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      

// -[WCLGGlassStore signPubKey] IMP=0x2F01A0 bounds=0x2F01A0-0x2F1934
loc_2F01A0:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x24, x0
    adrp     x9, #0x580000
    add      x9, x9, #0x614
    ldar     w8, [x9]
    cbnz     w8, #0x2f18b8
    adrp     x9, #0x541000
    add      x9, x9, #0xfe0
    ldrb     w8, [x9]
    mov      w11, #0xb
    adrp     x10, #0x542000
    add      x10, x10, #0x190
    eor      w8, w8, w11
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w11, #0x91
    eor      w8, w8, w11
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w11, #0xa0
    eor      w8, w8, w11
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    mov      w11, #0x23
    eor      w8, w8, w11
    strb     w8, [x10, #3]
    ldrb     w8, [x9, #4]
    eor      w8, w8, #0xdddddddd
    strb     w8, [x10, #4]
    ldrb     w8, [x9, #5]
    eor      w8, w8, #0x1c
    strb     w8, [x10, #5]
    ldrb     w8, [x9, #6]
    mov      w11, #0x4a
    eor      w8, w8, w11
    strb     w8, [x10, #6]
    ldrb     w8, [x9, #7]
    eor      w8, w8, #3
    strb     w8, [x10, #7]
    ldrb     w8, [x9, #8]
    mov      w11, #0x17
    eor      w8, w8, w11
    strb     w8, [x10, #8]
    ldrb     w8, [x9, #9]
    mov      w27, #0x2c
    eor      w8, w8, w27
    strb     w8, [x10, #9]
    ldrb     w11, [x9, #0xa]
    mov      w8, #0xda
    eor      w11, w11, w8
    strb     w11, [x10, #0xa]
    ldrb     w11, [x9, #0xb]
    eor      w11, w11, #0xffffffc3
    strb     w11, [x10, #0xb]
    ldrb     w11, [x9, #0xc]
    mov      w12, #0x6a
    eor      w11, w11, w12
    mov      w17, #0x6a
    strb     w11, [x10, #0xc]
    ldrb     w11, [x9, #0xd]
    eor      w11, w11, #8
    strb     w11, [x10, #0xd]
    ldrb     w11, [x9, #0xe]
    mov      w12, #0x26
    eor      w11, w11, w12
    strb     w11, [x10, #0xe]
    ldrb     w11, [x9, #0xf]
    eor      w11, w11, #0x3c
    strb     w11, [x10, #0xf]
    ldrb     w11, [x9, #0x10]
    mov      w13, #0x59
    eor      w11, w11, w13
    strb     w11, [x10, #0x10]
    ldrb     w11, [x9, #0x11]
    eor      w11, w11, #0x78
    strb     w11, [x10, #0x11]
    ldrb     w11, [x9, #0x12]
    mov      w12, #0x4e
    eor      w11, w11, w12
    mov      w1, #0x4e
    strb     w11, [x10, #0x12]
    ldrb     w11, [x9, #0x13]
    mov      w12, #0xb9
    eor      w11, w11, w12
    strb     w11, [x10, #0x13]
    ldrb     w11, [x9, #0x14]
    mov      w12, #0x6e
    eor      w11, w11, w12
    strb     w11, [x10, #0x14]
    ldrb     w11, [x9, #0x15]
    mov      w12, #0xdb
    eor      w11, w11, w12
    mov      w4, #0xdb
    strb     w11, [x10, #0x15]
    ldrb     w11, [x9, #0x16]
    mov      w12, #0xa
    eor      w11, w11, w12
    mov      w28, #0xa
    strb     w11, [x10, #0x16]
    ldrb     w11, [x9, #0x17]
    mov      w0, #0xf4
    eor      w11, w11, w0
    strb     w11, [x10, #0x17]
    ldrb     w11, [x9, #0x18]
    mov      w2, #0x39
    eor      w11, w11, w2
    strb     w11, [x10, #0x18]
    ldrb     w11, [x9, #0x19]
    mov      w7, #0x51
    eor      w11, w11, w7
    strb     w11, [x10, #0x19]
    ldrb     w11, [x9, #0x1a]
    mov      w15, #0x5f
    eor      w11, w11, w15
    strb     w11, [x10, #0x1a]
    ldrb     w11, [x9, #0x1b]
    eor      w11, w11, #0x80
    strb     w11, [x10, #0x1b]
    ldrb     w11, [x9, #0x1c]
    eor      w11, w11, #0xffffff9f
    strb     w11, [x10, #0x1c]
    ldrb     w11, [x9, #0x1d]
    eor      w11, w11, #0xfffffffb
    strb     w11, [x10, #0x1d]
    ldrb     w11, [x9, #0x1e]
    mov      w12, #0xd7
    eor      w11, w11, w12
    strb     w11, [x10, #0x1e]
    ldrb     w11, [x9, #0x1f]
    mov      w16, #0x35
    eor      w11, w11, w16
    strb     w11, [x10, #0x1f]
    ldrb     w11, [x9, #0x20]
    mov      w12, #0x12
    eor      w11, w11, w12
    strb     w11, [x10, #0x20]
    ldrb     w11, [x9, #0x21]
    eor      w11, w11, w2
    strb     w11, [x10, #0x21]
    ldrb     w11, [x9, #0x22]
    eor      w11, w11, #0xe
    strb     w11, [x10, #0x22]
    ldrb     w11, [x9, #0x23]
    mov      w12, #0xab
    eor      w11, w11, w12
    strb     w11, [x10, #0x23]
    ldrb     w11, [x9, #0x24]
    mov      w14, #5
    eor      w11, w11, w14
    strb     w11, [x10, #0x24]
    ldrb     w11, [x9, #0x25]
    mov      w12, #0x5c
    eor      w11, w11, w12
    strb     w11, [x10, #0x25]
    ldrb     w11, [x9, #0x26]
    eor      w11, w11, w2
    strb     w11, [x10, #0x26]
    ldrb     w11, [x9, #0x27]
    eor      w11, w11, w14
    strb     w11, [x10, #0x27]
    ldrb     w11, [x9, #0x28]
    eor      w11, w11, #0x60
    strb     w11, [x10, #0x28]
    ldrb     w11, [x9, #0x29]
    eor      w11, w11, #3
    strb     w11, [x10, #0x29]
    ldrb     w11, [x9, #0x2a]
    mov      w14, #0xf2
    eor      w11, w11, w14
    strb     w11, [x10, #0x2a]
    ldrb     w11, [x9, #0x2b]
    mov      w14, #0x7d
    eor      w11, w11, w14
    strb     w11, [x10, #0x2b]
    ldrb     w11, [x9, #0x2c]
    eor      w11, w11, #0x33333333
    strb     w11, [x10, #0x2c]
    ldrb     w11, [x9, #0x2d]
    mov      w3, #0x4a
    eor      w11, w11, w3
    strb     w11, [x10, #0x2d]
    ldrb     w11, [x9, #0x2e]
    mov      w14, #0x76
    eor      w11, w11, w14
    strb     w11, [x10, #0x2e]
    ldrb     w11, [x9, #0x2f]
    mov      w5, #0xc8
    eor      w11, w11, w5
    strb     w11, [x10, #0x2f]
    ldrb     w11, [x9, #0x30]
    mov      w14, #0xd6
    eor      w11, w11, w14
    strb     w11, [x10, #0x30]
    ldrb     w11, [x9, #0x31]
    mov      w14, #0xd8
    eor      w11, w11, w14
    strb     w11, [x10, #0x31]
    ldrb     w11, [x9, #0x32]
    eor      w11, w11, w17
    strb     w11, [x10, #0x32]
    ldrb     w11, [x9, #0x33]
    strb     w11, [x10, #0x33]
    ldrb     w11, [x9, #0x34]
    eor      w11, w11, #0x7e
    strb     w11, [x10, #0x34]
    ldrb     w11, [x9, #0x35]
    eor      w11, w11, #0x20
    strb     w11, [x10, #0x35]
    ldrb     w11, [x9, #0x36]
    mov      w14, #0xf5
    eor      w11, w11, w14
    strb     w11, [x10, #0x36]
    ldrb     w11, [x9, #0x37]
    eor      w11, w11, w1
    strb     w11, [x10, #0x37]
    ldrb     w11, [x9, #0x38]
    mov      w1, #0x3b
    eor      w11, w11, w1
    strb     w11, [x10, #0x38]
    ldrb     w11, [x9, #0x39]
    eor      w11, w11, #0x33333333
    strb     w11, [x10, #0x39]
    ldrb     w11, [x9, #0x3a]
    mov      w14, #0xc6
    eor      w11, w11, w14
    strb     w11, [x10, #0x3a]
    ldrb     w11, [x9, #0x3b]
    eor      w11, w11, #0xf8
    strb     w11, [x10, #0x3b]
    ldrb     w11, [x9, #0x3c]
    eor      w11, w11, w3
    strb     w11, [x10, #0x3c]
    ldrb     w11, [x9, #0x3d]
    eor      w11, w11, #0x80
    strb     w11, [x10, #0x3d]
    ldrb     w11, [x9, #0x3e]
    eor      w11, w11, #0xaaaaaaaa
    strb     w11, [x10, #0x3e]
    ldrb     w11, [x9, #0x3f]
    mov      w14, #0xbd
    eor      w11, w11, w14
    strb     w11, [x10, #0x3f]
    ldrb     w11, [x9, #0x40]
    mov      w14, #0xce
    eor      w11, w11, w14
    strb     w11, [x10, #0x40]
    ldrb     w11, [x9, #0x41]
    mov      w14, #0xe2
    eor      w11, w11, w14
    strb     w11, [x10, #0x41]
    ldrb     w11, [x9, #0x42]
    mov      w14, #0x8b
    eor      w11, w11, w14
    strb     w11, [x10, #0x42]
    ldrb     w11, [x9, #0x43]
    eor      w11, w11, #0x88888888
    strb     w11, [x10, #0x43]
    ldrb     w11, [x9, #0x44]
    mov      w14, #0x8d
    eor      w11, w11, w14
    strb     w11, [x10, #0x44]
    ldrb     w11, [x9, #0x45]
    mov      w14, #0xe9
    eor      w11, w11, w14
    strb     w11, [x10, #0x45]
    ldrb     w11, [x9, #0x46]
    strb     w11, [x10, #0x46]
    ldrb     w11, [x9, #0x47]
    eor      w11, w11, #0x60
    strb     w11, [x10, #0x47]
    ldrb     w11, [x9, #0x48]
    mov      w17, #0xd0
    eor      w11, w11, w17
    strb     w11, [x10, #0x48]
    ldrb     w11, [x9, #0x49]
    eor      w11, w11, #0xfffffff3
    strb     w11, [x10, #0x49]
    ldrb     w11, [x9, #0x4a]
    eor      w11, w11, #6
    strb     w11, [x10, #0x4a]
    ldrb     w11, [x9, #0x4b]
    mov      w14, #0xea
    eor      w11, w11, w14
    strb     w11, [x10, #0x4b]
    ldrb     w11, [x9, #0x4c]
    eor      w11, w11, #0x70
    strb     w11, [x10, #0x4c]
    ldrb     w11, [x9, #0x4d]
    eor      w11, w11, w4
    strb     w11, [x10, #0x4d]
    ldrb     w11, [x9, #0x4e]
    eor      w11, w11, #0x99999999
    strb     w11, [x10, #0x4e]
    ldrb     w11, [x9, #0x4f]
    mov      w14, #0xcb
    eor      w11, w11, w14
    strb     w11, [x10, #0x4f]
    ldrb     w11, [x9, #0x50]
    eor      w11, w11, #0xc
    strb     w11, [x10, #0x50]
    ldrb     w11, [x9, #0x51]
    mov      w14, #0x4c
    eor      w11, w11, w14
    mov      w6, #0x4c
    strb     w11, [x10, #0x51]
    ldrb     w11, [x9, #0x52]
    mov      w14, #0x74
    eor      w11, w11, w14
    strb     w11, [x10, #0x52]
    ldrb     w14, [x9, #0x53]
    mov      w11, #0xd4
    eor      w14, w14, w11
    strb     w14, [x10, #0x53]
    ldrb     w14, [x9, #0x54]
    eor      w14, w14, w12
    strb     w14, [x10, #0x54]
    ldrb     w14, [x9, #0x55]
    mov      w3, #0x58
    eor      w14, w14, w3
    strb     w14, [x10, #0x55]
    ldrb     w14, [x9, #0x56]
    eor      w14, w14, #0xffffffe1
    strb     w14, [x10, #0x56]
    ldrb     w14, [x9, #0x57]
    mov      w3, #0x86
    eor      w14, w14, w3
    strb     w14, [x10, #0x57]
    ldrb     w14, [x9, #0x58]
    strb     w14, [x10, #0x58]
    ldrb     w14, [x9, #0x59]
    mov      w3, #0xa7
    eor      w14, w14, w3
    strb     w14, [x10, #0x59]
    ldrb     w14, [x9, #0x5a]
    eor      w14, w14, #0xffffffdf
    strb     w14, [x10, #0x5a]
    ldrb     w3, [x9, #0x5b]
    mov      w14, #0x82
    eor      w3, w3, w14
    strb     w3, [x10, #0x5b]
    ldrb     w3, [x9, #0x5c]
    eor      w3, w3, #0xffffff81
    strb     w3, [x10, #0x5c]
    ldrb     w3, [x9, #0x5d]
    eor      w3, w3, #0xbbbbbbbb
    strb     w3, [x10, #0x5d]
    ldrb     w3, [x9, #0x5e]
    mov      w4, #0x71
    eor      w3, w3, w4
    strb     w3, [x10, #0x5e]
    ldrb     w3, [x9, #0x5f]
    eor      w3, w3, w6
    strb     w3, [x10, #0x5f]
    ldrb     w3, [x9, #0x60]
    eor      w16, w3, w16
    strb     w16, [x10, #0x60]
    ldrb     w16, [x9, #0x61]
    mov      w3, #0x47
    eor      w16, w16, w3
    strb     w16, [x10, #0x61]
    ldrb     w16, [x9, #0x62]
    eor      w16, w16, w1
    strb     w16, [x10, #0x62]
    ldrb     w16, [x9, #0x63]
    mov      w1, #0xa9
    eor      w16, w16, w1
    strb     w16, [x10, #0x63]
    ldrb     w16, [x9, #0x64]
    mov      w1, #0xd1
    eor      w16, w16, w1
    strb     w16, [x10, #0x64]
    ldrb     w16, [x9, #0x65]
    eor      w16, w16, #0xffffffbf
    strb     w16, [x10, #0x65]
    ldrb     w16, [x9, #0x66]
    mov      w1, #0x9e
    eor      w16, w16, w1
    strb     w16, [x10, #0x66]
    ldrb     w16, [x9, #0x67]
    mov      w22, #0x14
    eor      w16, w16, w22
    strb     w16, [x10, #0x67]
    ldrb     w16, [x9, #0x68]
    eor      w16, w16, w14
    strb     w16, [x10, #0x68]
    ldrb     w16, [x9, #0x69]
    mov      w1, #0xe8
    eor      w16, w16, w1
    strb     w16, [x10, #0x69]
    ldrb     w16, [x9, #0x6a]
    mov      w6, #0x7a
    eor      w16, w16, w6
    strb     w16, [x10, #0x6a]
    ldrb     w16, [x9, #0x6b]
    eor      w16, w16, w7
    strb     w16, [x10, #0x6b]
    ldrb     w16, [x9, #0x6c]
    eor      w16, w16, w1
    strb     w16, [x10, #0x6c]
    ldrb     w16, [x9, #0x6d]
    eor      w16, w16, #0xe0
    strb     w16, [x10, #0x6d]
    ldrb     w16, [x9, #0x6e]
    eor      w16, w16, #1
    strb     w16, [x10, #0x6e]
    ldrb     w16, [x9, #0x6f]
    mov      w21, #0x29
    eor      w16, w16, w21
    strb     w16, [x10, #0x6f]
    ldrb     w16, [x9, #0x70]
    mov      w1, #0x43
    eor      w16, w16, w1
    strb     w16, [x10, #0x70]
    ldrb     w16, [x9, #0x71]
    eor      w16, w16, #0xffffffbf
    strb     w16, [x10, #0x71]
    ldrb     w16, [x9, #0x72]
    mov      w3, #0xb3
    eor      w16, w16, w3
    strb     w16, [x10, #0x72]
    ldrb     w16, [x9, #0x73]
    eor      w16, w16, #0x99999999
    strb     w16, [x10, #0x73]
    ldrb     w16, [x9, #0x74]
    mov      w3, #0x75
    eor      w16, w16, w3
    strb     w16, [x10, #0x74]
    ldrb     w16, [x9, #0x75]
    eor      w16, w16, #6
    strb     w16, [x10, #0x75]
    ldrb     w16, [x9, #0x76]
    mov      w3, #0x8c
    eor      w16, w16, w3
    mov      w23, #0x8c
    strb     w16, [x10, #0x76]
    ldrb     w16, [x9, #0x77]
    eor      w13, w16, w13
    strb     w13, [x10, #0x77]
    ldrb     w13, [x9, #0x78]
    eor      w13, w13, #2
    strb     w13, [x10, #0x78]
    ldrb     w13, [x9, #0x79]
    mov      w16, #0x5b
    eor      w13, w13, w16
    strb     w13, [x10, #0x79]
    ldrb     w13, [x9, #0x7a]
    mov      w16, #0x2b
    eor      w13, w13, w16
    strb     w13, [x10, #0x7a]
    ldrb     w13, [x9, #0x7b]
    mov      w16, #0xbc
    eor      w13, w13, w16
    strb     w13, [x10, #0x7b]
    ldrb     w13, [x9, #0x7c]
    mov      w16, #0xa8
    eor      w13, w13, w16
    strb     w13, [x10, #0x7c]
    ldrb     w13, [x9, #0x7d]
    mov      w16, #0xd3
    eor      w13, w13, w16
    strb     w13, [x10, #0x7d]
    ldrb     w13, [x9, #0x7e]
    eor      w8, w13, w8
    strb     w8, [x10, #0x7e]
    ldrb     w8, [x9, #0x7f]
    mov      w13, #0x41
    eor      w8, w8, w13
    strb     w8, [x10, #0x7f]
    ldrb     w8, [x9, #0x80]
    eor      w8, w8, #0x20
    strb     w8, [x10, #0x80]
    ldrb     w8, [x9, #0x81]
    mov      w16, #0xa0
    eor      w8, w8, w16
    strb     w8, [x10, #0x81]
    ldrb     w8, [x9, #0x82]
    eor      w8, w8, w16
    strb     w8, [x10, #0x82]
    ldrb     w8, [x9, #0x83]
    eor      w8, w8, #0x33333333
    strb     w8, [x10, #0x83]
    ldrb     w8, [x9, #0x84]
    eor      w8, w8, w12
    strb     w8, [x10, #0x84]
    ldrb     w8, [x9, #0x85]
    mov      w3, #0x96
    eor      w8, w8, w3
    strb     w8, [x10, #0x85]
    ldrb     w8, [x9, #0x86]
    eor      w8, w8, #0xcccccccc
    strb     w8, [x10, #0x86]
    ldrb     w8, [x9, #0x87]
    eor      w8, w8, #6
    strb     w8, [x10, #0x87]
    ldrb     w8, [x9, #0x88]
    eor      w8, w8, #0x80
    strb     w8, [x10, #0x88]
    ldrb     w8, [x9, #0x89]
    eor      w8, w8, #0xfc
    strb     w8, [x10, #0x89]
    ldrb     w8, [x9, #0x8a]
    mov      w19, #0x6a
    eor      w8, w8, w19
    strb     w8, [x10, #0x8a]
    ldrb     w8, [x9, #0x8b]
    mov      w12, #0xa6
    eor      w8, w8, w12
    mov      w26, #0xa6
    strb     w8, [x10, #0x8b]
    ldrb     w8, [x9, #0x8c]
    eor      w8, w8, #0x44444444
    strb     w8, [x10, #0x8c]
    ldrb     w8, [x9, #0x8d]
    eor      w8, w8, w2
    strb     w8, [x10, #0x8d]
    ldrb     w8, [x9, #0x8e]
    mov      w12, #0x37
    eor      w8, w8, w12
    strb     w8, [x10, #0x8e]
    ldrb     w8, [x9, #0x8f]
    mov      w12, #0x42
    eor      w8, w8, w12
    strb     w8, [x10, #0x8f]
    ldrb     w8, [x9, #0x90]
    mov      w4, #0x1b
    eor      w8, w8, w4
    strb     w8, [x10, #0x90]
    ldrb     w8, [x9, #0x91]
    mov      w16, #0x24
    eor      w8, w8, w16
    strb     w8, [x10, #0x91]
    ldrb     w8, [x9, #0x92]
    eor      w8, w8, w15
    strb     w8, [x10, #0x92]
    ldrb     w8, [x9, #0x93]
    mov      w15, #0x4f
    eor      w8, w8, w15
    strb     w8, [x10, #0x93]
    ldrb     w8, [x9, #0x94]
    eor      w8, w8, #0x60
    strb     w8, [x10, #0x94]
    ldrb     w8, [x9, #0x95]
    eor      w8, w8, #0xdddddddd
    strb     w8, [x10, #0x95]
    ldrb     w8, [x9, #0x96]
    mov      w15, #0x90
    eor      w8, w8, w15
    strb     w8, [x10, #0x96]
    ldrb     w8, [x9, #0x97]
    mov      w25, #0xd
    eor      w8, w8, w25
    strb     w8, [x10, #0x97]
    ldrb     w8, [x9, #0x98]
    eor      w8, w8, w5
    strb     w8, [x10, #0x98]
    ldrb     w8, [x9, #0x99]
    eor      w8, w8, #0x55555555
    strb     w8, [x10, #0x99]
    ldrb     w8, [x9, #0x9a]
    mov      w15, #0xb7
    eor      w8, w8, w15
    strb     w8, [x10, #0x9a]
    ldrb     w8, [x9, #0x9b]
    mov      w20, #0x6f
    eor      w8, w8, w20
    strb     w8, [x10, #0x9b]
    ldrb     w8, [x9, #0x9c]
    eor      w8, w8, w23
    strb     w8, [x10, #0x9c]
    ldrb     w8, [x9, #0x9d]
    eor      w8, w8, #0xffffffc7
    strb     w8, [x10, #0x9d]
    ldrb     w8, [x9, #0x9e]
    eor      w8, w8, w6
    strb     w8, [x10, #0x9e]
    ldrb     w8, [x9, #0x9f]
    eor      w8, w8, #0xfffffff1
    strb     w8, [x10, #0x9f]
    ldrb     w8, [x9, #0xa0]
    mov      w16, #0x61
    eor      w8, w8, w16
    strb     w8, [x10, #0xa0]
    ldrb     w8, [x9, #0xa1]
    mov      w23, #0x73
    eor      w8, w8, w23
    strb     w8, [x10, #0xa1]
    ldrb     w8, [x9, #0xa2]
    eor      w8, w8, w22
    strb     w8, [x10, #0xa2]
    ldrb     w8, [x9, #0xa3]
    mov      w15, #0xe4
    eor      w8, w8, w15
    strb     w8, [x10, #0xa3]
    ldrb     w8, [x9, #0xa4]
    eor      w8, w8, #0x7c
    strb     w8, [x10, #0xa4]
    ldrb     w15, [x9, #0xa5]
    mov      w8, #0x32
    eor      w15, w15, w8
    strb     w15, [x10, #0xa5]
    ldrb     w15, [x9, #0xa6]
    eor      w11, w15, w11
    strb     w11, [x10, #0xa6]
    ldrb     w11, [x9, #0xa7]
    eor      w11, w11, w19
    strb     w11, [x10, #0xa7]
    ldrb     w11, [x9, #0xa8]
    mov      w15, #0x8a
    eor      w11, w11, w15
    strb     w11, [x10, #0xa8]
    ldrb     w11, [x9, #0xa9]
    mov      w15, #0xec
    eor      w11, w11, w15
    strb     w11, [x10, #0xa9]
    ldrb     w11, [x9, #0xaa]
    eor      w11, w11, w17
    strb     w11, [x10, #0xaa]
    ldrb     w11, [x9, #0xab]
    eor      w11, w11, #0xbbbbbbbb
    strb     w11, [x10, #0xab]
    ldrb     w11, [x9, #0xac]
    eor      w11, w11, #4
    strb     w11, [x10, #0xac]
    ldrb     w15, [x9, #0xad]
    mov      w11, #0xb0
    eor      w15, w15, w11
    strb     w15, [x10, #0xad]
    ldrb     w15, [x9, #0xae]
    mov      w17, #0x89
    eor      w15, w15, w17
    strb     w15, [x10, #0xae]
    ldrb     w15, [x9, #0xaf]
    eor      w15, w15, w6
    strb     w15, [x10, #0xaf]
    ldrb     w15, [x9, #0xb0]
    eor      w15, w15, w26
    strb     w15, [x10, #0xb0]
    ldrb     w15, [x9, #0xb1]
    strb     w15, [x10, #0xb1]
    ldrb     w15, [x9, #0xb2]
    eor      w15, w15, w22
    strb     w15, [x10, #0xb2]
    ldrb     w15, [x9, #0xb3]
    eor      w15, w15, #0xfffffff7
    strb     w15, [x10, #0xb3]
    ldrb     w15, [x9, #0xb4]
    mov      w17, #0xc2
    eor      w15, w15, w17
    strb     w15, [x10, #0xb4]
    ldrb     w15, [x9, #0xb5]
    mov      w17, #0x4b
    eor      w15, w15, w17
    strb     w15, [x10, #0xb5]
    ldrb     w15, [x9, #0xb6]
    mov      w17, #9
    eor      w15, w15, w17
    strb     w15, [x10, #0xb6]
    ldrb     w15, [x9, #0xb7]
    eor      w15, w15, #0xffffffe7
    strb     w15, [x10, #0xb7]
    ldrb     w15, [x9, #0xb8]
    eor      w15, w15, w28
    strb     w15, [x10, #0xb8]
    ldrb     w15, [x9, #0xb9]
    mov      w17, #0x2a
    eor      w15, w15, w17
    strb     w15, [x10, #0xb9]
    ldrb     w15, [x9, #0xba]
    eor      w15, w15, w0
    strb     w15, [x10, #0xba]
    ldrb     w15, [x9, #0xbb]
    eor      w15, w15, #0x3f
    strb     w15, [x10, #0xbb]
    ldrb     w15, [x9, #0xbc]
    eor      w15, w15, #0xfffffffd
    strb     w15, [x10, #0xbc]
    ldrb     w15, [x9, #0xbd]
    mov      w17, #0x56
    eor      w15, w15, w17
    strb     w15, [x10, #0xbd]
    ldrb     w15, [x9, #0xbe]
    mov      w0, #0x53
    eor      w15, w15, w0
    strb     w15, [x10, #0xbe]
    ldrb     w15, [x9, #0xbf]
    eor      w15, w15, w4
    strb     w15, [x10, #0xbf]
    ldrb     w0, [x9, #0xc0]
    mov      w15, #0x9b
    eor      w0, w0, w15
    strb     w0, [x10, #0xc0]
    ldrb     w0, [x9, #0xc1]
    eor      w0, w0, #0xffffffc1
    strb     w0, [x10, #0xc1]
    ldrb     w0, [x9, #0xc2]
    eor      w0, w0, #0xc
    strb     w0, [x10, #0xc2]
    ldrb     w0, [x9, #0xc3]
    mov      w19, #0x27
    eor      w0, w0, w19
    mov      w30, #0x27
    strb     w0, [x10, #0xc3]
    ldrb     w0, [x9, #0xc4]
    eor      w0, w0, #0x38
    strb     w0, [x10, #0xc4]
    ldrb     w0, [x9, #0xc5]
    eor      w0, w0, #0x20
    strb     w0, [x10, #0xc5]
    ldrb     w0, [x9, #0xc6]
    mov      w19, #0xa1
    eor      w0, w0, w19
    strb     w0, [x10, #0xc6]
    ldrb     w19, [x9, #0xc7]
    mov      w0, #0x6d
    eor      w19, w19, w0
    strb     w19, [x10, #0xc7]
    ldrb     w19, [x9, #0xc8]
    mov      w28, #0x34
    eor      w19, w19, w28
    strb     w19, [x10, #0xc8]
    ldrb     w19, [x9, #0xc9]
    eor      w19, w19, w5
    strb     w19, [x10, #0xc9]
    ldrb     w19, [x9, #0xca]
    eor      w19, w19, w25
    strb     w19, [x10, #0xca]
    ldrb     w19, [x9, #0xcb]
    eor      w19, w19, w27
    strb     w19, [x10, #0xcb]
    ldrb     w19, [x9, #0xcc]
    eor      w19, w19, w0
    strb     w19, [x10, #0xcc]
    ldrb     w19, [x9, #0xcd]
    eor      w19, w19, w20
    strb     w19, [x10, #0xcd]
    ldrb     w19, [x9, #0xce]
    mov      w26, #0x4d
    eor      w19, w19, w26
    strb     w19, [x10, #0xce]
    ldrb     w19, [x9, #0xcf]
    eor      w7, w19, w7
    strb     w7, [x10, #0xcf]
    ldrb     w7, [x9, #0xd0]
    eor      w7, w7, #0xeeeeeeee
    strb     w7, [x10, #0xd0]
    ldrb     w7, [x9, #0xd1]
    eor      w7, w7, #3
    strb     w7, [x10, #0xd1]
    ldrb     w7, [x9, #0xd2]
    eor      w7, w7, w3
    strb     w7, [x10, #0xd2]
    ldrb     w7, [x9, #0xd3]
    mov      w19, #0xeb
    eor      w7, w7, w19
    strb     w7, [x10, #0xd3]
    ldrb     w7, [x9, #0xd4]
    eor      w7, w7, #3
    strb     w7, [x10, #0xd4]
    ldrb     w7, [x9, #0xd5]
    mov      w19, #0xe8
    eor      w7, w7, w19
    strb     w7, [x10, #0xd5]
    ldrb     w7, [x9, #0xd6]
    eor      w7, w7, w28
    strb     w7, [x10, #0xd6]
    ldrb     w7, [x9, #0xd7]
    mov      w19, #0x91
    eor      w7, w7, w19
    strb     w7, [x10, #0xd7]
    ldrb     w7, [x9, #0xd8]
    mov      w19, #0x46
    eor      w7, w7, w19
    strb     w7, [x10, #0xd8]
    ldrb     w7, [x9, #0xd9]
    eor      w7, w7, w15
    strb     w7, [x10, #0xd9]
    ldrb     w7, [x9, #0xda]
    eor      w7, w7, #0x18
    strb     w7, [x10, #0xda]
    ldrb     w7, [x9, #0xdb]
    eor      w7, w7, w21
    strb     w7, [x10, #0xdb]
    ldrb     w7, [x9, #0xdc]
    mov      w21, #0xea
    eor      w7, w7, w21
    strb     w7, [x10, #0xdc]
    ldrb     w7, [x9, #0xdd]
    eor      w7, w7, w25
    strb     w7, [x10, #0xdd]
    ldrb     w7, [x9, #0xde]
    eor      w14, w7, w14
    strb     w14, [x10, #0xde]
    ldrb     w14, [x9, #0xdf]
    eor      w14, w14, #0xbbbbbbbb
    strb     w14, [x10, #0xdf]
    ldrb     w14, [x9, #0xe0]
    eor      w14, w14, w23
    strb     w14, [x10, #0xe0]
    ldrb     w14, [x9, #0xe1]
    mov      w7, #0x8e
    eor      w14, w14, w7
    strb     w14, [x10, #0xe1]
    ldrb     w14, [x9, #0xe2]
    eor      w14, w14, w26
    strb     w14, [x10, #0xe2]
    ldrb     w14, [x9, #0xe3]
    eor      w14, w14, w5
    strb     w14, [x10, #0xe3]
    ldrb     w14, [x9, #0xe4]
    mov      w5, #0x9d
    eor      w14, w14, w5
    strb     w14, [x10, #0xe4]
    ldrb     w14, [x9, #0xe5]
    eor      w14, w14, w7
    strb     w14, [x10, #0xe5]
    ldrb     w14, [x9, #0xe6]
    eor      w13, w14, w13
    strb     w13, [x10, #0xe6]
    ldrb     w13, [x9, #0xe7]
    eor      w13, w13, #0xffffffbf
    strb     w13, [x10, #0xe7]
    ldrb     w13, [x9, #0xe8]
    eor      w13, w13, #0x78
    strb     w13, [x10, #0xe8]
    ldrb     w14, [x9, #0xe9]
    mov      w13, #0xc9
    eor      w14, w14, w13
    strb     w14, [x10, #0xe9]
    ldrb     w14, [x9, #0xea]
    eor      w14, w14, #8
    strb     w14, [x10, #0xea]
    ldrb     w14, [x9, #0xeb]
    eor      w14, w14, w22
    strb     w14, [x10, #0xeb]
    ldrb     w14, [x9, #0xec]
    mov      w21, #0x6e
    eor      w14, w14, w21
    strb     w14, [x10, #0xec]
    ldrb     w14, [x9, #0xed]
    mov      w26, #0xb9
    eor      w14, w14, w26
    strb     w14, [x10, #0xed]
    ldrb     w14, [x9, #0xee]
    eor      w14, w14, w4
    strb     w14, [x10, #0xee]
    ldrb     w14, [x9, #0xef]
    eor      w14, w14, w4
    strb     w14, [x10, #0xef]
    ldrb     w14, [x9, #0xf0]
    eor      w14, w14, #0xfffffff9
    strb     w14, [x10, #0xf0]
    ldrb     w14, [x9, #0xf1]
    eor      w12, w14, w12
    strb     w12, [x10, #0xf1]
    ldrb     w12, [x9, #0xf2]
    mov      w14, #0xa0
    eor      w12, w12, w14
    strb     w12, [x10, #0xf2]
    ldrb     w12, [x9, #0xf3]
    eor      w8, w12, w8
    strb     w8, [x10, #0xf3]
    ldrb     w8, [x9, #0xf4]
    eor      w8, w8, w19
    strb     w8, [x10, #0xf4]
    ldrb     w8, [x9, #0xf5]
    mov      w12, #0xd9
    eor      w8, w8, w12
    strb     w8, [x10, #0xf5]
    ldrb     w14, [x9, #0xf6]
    mov      w8, #0x9c
    eor      w14, w14, w8
    strb     w14, [x10, #0xf6]
    ldrb     w14, [x9, #0xf7]
    eor      w14, w14, #2
    strb     w14, [x10, #0xf7]
    ldrb     w14, [x9, #0xf8]
    eor      w14, w14, w1
    strb     w14, [x10, #0xf8]
    ldrb     w14, [x9, #0xf9]
    mov      w5, #0x28
    eor      w14, w14, w5
    strb     w14, [x10, #0xf9]
    ldrb     w14, [x9, #0xfa]
    mov      w5, #0xa3
    eor      w14, w14, w5
    strb     w14, [x10, #0xfa]
    ldrb     w14, [x9, #0xfb]
    mov      w19, #0x65
    eor      w14, w14, w19
    strb     w14, [x10, #0xfb]
    ldrb     w14, [x9, #0xfc]
    mov      w19, #0x2e
    eor      w14, w14, w19
    strb     w14, [x10, #0xfc]
    ldrb     w14, [x9, #0xfd]
    eor      w14, w14, #0x66666666
    strb     w14, [x10, #0xfd]
    ldrb     w14, [x9, #0xfe]
    eor      w14, w14, #0x30
    strb     w14, [x10, #0xfe]
    ldrb     w14, [x9, #0xff]
    mov      w19, #0x5d
    eor      w14, w14, w19
    strb     w14, [x10, #0xff]
    ldrb     w14, [x9, #0x100]
    mov      w19, #0xb1
    eor      w14, w14, w19
    strb     w14, [x10, #0x100]
    ldrb     w14, [x9, #0x101]
    eor      w14, w14, w2
    strb     w14, [x10, #0x101]
    ldrb     w14, [x9, #0x102]
    mov      w2, #0x3d
    eor      w14, w14, w2
    strb     w14, [x10, #0x102]
    ldrb     w2, [x9, #0x103]
    mov      w14, #0x63
    eor      w2, w2, w14
    strb     w2, [x10, #0x103]
    ldrb     w2, [x9, #0x104]
    eor      w16, w2, w16
    strb     w16, [x10, #0x104]
    mov      w16, #0xf6
    ldrb     w2, [x9, #0x105]
    eor      w2, w2, #2
    strb     w2, [x10, #0x105]
    ldrb     w2, [x9, #0x106]
    eor      w2, w2, w16
    strb     w2, [x10, #0x106]
    ldrb     w2, [x9, #0x107]
    eor      w2, w2, #0x1f
    strb     w2, [x10, #0x107]
    ldrb     w2, [x9, #0x108]
    eor      w2, w2, #0xfffffff1
    strb     w2, [x10, #0x108]
    ldrb     w2, [x9, #0x109]
    mov      w27, #0xb3
    eor      w2, w2, w27
    strb     w2, [x10, #0x109]
    ldrb     w2, [x9, #0x10a]
    eor      w2, w2, #0xfffffffd
    strb     w2, [x10, #0x10a]
    ldrb     w2, [x9, #0x10b]
    eor      w11, w2, w11
    strb     w11, [x10, #0x10b]
    ldrb     w11, [x9, #0x10c]
    eor      w11, w11, #4
    strb     w11, [x10, #0x10c]
    ldrb     w11, [x9, #0x10d]
    mov      w2, #0x2b
    eor      w11, w11, w2
    strb     w11, [x10, #0x10d]
    ldrb     w11, [x9, #0x10e]
    eor      w11, w11, #0x55555555
    strb     w11, [x10, #0x10e]
    ldrb     w11, [x9, #0x10f]
    eor      w11, w11, #1
    strb     w11, [x10, #0x10f]
    ldrb     w11, [x9, #0x110]
    mov      w19, #0x8b
    eor      w11, w11, w19
    strb     w11, [x10, #0x110]
    ldrb     w11, [x9, #0x111]
    eor      w11, w11, #2
    strb     w11, [x10, #0x111]
    ldrb     w11, [x9, #0x112]
    eor      w11, w11, #0xe0
    strb     w11, [x10, #0x112]
    ldrb     w2, [x9, #0x113]
    mov      w11, #0x67
    eor      w2, w2, w11
    strb     w2, [x10, #0x113]
    ldrb     w2, [x9, #0x114]
    eor      w12, w2, w12
    strb     w12, [x10, #0x114]
    ldrb     w2, [x9, #0x115]
    mov      w12, #0x6b
    eor      w2, w2, w12
    strb     w2, [x10, #0x115]
    ldrb     w2, [x9, #0x116]
    eor      w2, w2, w26
    strb     w2, [x10, #0x116]
    ldrb     w2, [x9, #0x117]
    eor      w16, w2, w16
    strb     w16, [x10, #0x117]
    ldrb     w16, [x9, #0x118]
    mov      w2, #0x4c
    eor      w16, w16, w2
    strb     w16, [x10, #0x118]
    ldrb     w16, [x9, #0x119]
    mov      w2, #0xc6
    eor      w16, w16, w2
    strb     w16, [x10, #0x119]
    ldrb     w16, [x9, #0x11a]
    eor      w16, w16, w1
    strb     w16, [x10, #0x11a]
    ldrb     w16, [x9, #0x11b]
    eor      w16, w16, #0xffffffe1
    strb     w16, [x10, #0x11b]
    ldrb     w16, [x9, #0x11c]
    eor      w16, w16, #0xfffffff3
    strb     w16, [x10, #0x11c]
    ldrb     w16, [x9, #0x11d]
    eor      w16, w16, #0xffffff87
    strb     w16, [x10, #0x11d]
    mov      w16, #0x19
    ldrb     w1, [x9, #0x11e]
    eor      w1, w1, w30
    mov      w26, #0x27
    strb     w1, [x10, #0x11e]
    ldrb     w1, [x9, #0x11f]
    eor      w16, w1, w16
    strb     w16, [x10, #0x11f]
    ldrb     w16, [x9, #0x120]
    eor      w16, w16, w20
    strb     w16, [x10, #0x120]
    ldrb     w16, [x9, #0x121]
    eor      w16, w16, w3
    strb     w16, [x10, #0x121]
    ldrb     w16, [x9, #0x122]
    eor      w16, w16, w19
    strb     w16, [x10, #0x122]
    ldrb     w16, [x9, #0x123]
    eor      w16, w16, #0xffffffe1
    strb     w16, [x10, #0x123]
    ldrb     w16, [x9, #0x124]
    mov      w1, #0xaf
    eor      w16, w16, w1
    strb     w16, [x10, #0x124]
    ldrb     w16, [x9, #0x125]
    eor      w16, w16, #0x10
    strb     w16, [x10, #0x125]
    ldrb     w16, [x9, #0x126]
    mov      w2, #0x5a
    eor      w16, w16, w2
    strb     w16, [x10, #0x126]
    ldrb     w16, [x9, #0x127]
    mov      w2, #0x62
    eor      w16, w16, w2
    strb     w16, [x10, #0x127]
    ldrb     w16, [x9, #0x128]
    mov      w2, #0xd6
    eor      w16, w16, w2
    strb     w16, [x10, #0x128]
    ldrb     w16, [x9, #0x129]
    mov      w2, #0xfa
    eor      w16, w16, w2
    strb     w16, [x10, #0x129]
    ldrb     w16, [x9, #0x12a]
    eor      w16, w16, #0xeeeeeeee
    strb     w16, [x10, #0x12a]
    ldrb     w16, [x9, #0x12b]
    eor      w16, w16, #0xf8
    strb     w16, [x10, #0x12b]
    ldrb     w16, [x9, #0x12c]
    mov      w2, #0x12
    eor      w16, w16, w2
    strb     w16, [x10, #0x12c]
    ldrb     w16, [x9, #0x12d]
    eor      w16, w16, #0x1c
    strb     w16, [x10, #0x12d]
    ldrb     w16, [x9, #0x12e]
    eor      w16, w16, w22
    strb     w16, [x10, #0x12e]
    ldrb     w16, [x9, #0x12f]
    mov      w22, #0xbc
    eor      w16, w16, w22
    strb     w16, [x10, #0x12f]
    ldrb     w16, [x9, #0x130]
    eor      w16, w16, w15
    strb     w16, [x10, #0x130]
    ldrb     w16, [x9, #0x131]
    eor      w16, w16, #0x30
    strb     w16, [x10, #0x131]
    ldrb     w16, [x9, #0x132]
    mov      w2, #0x2f
    eor      w16, w16, w2
    strb     w16, [x10, #0x132]
    ldrb     w16, [x9, #0x133]
    mov      w28, #0x6a
    eor      w16, w16, w28
    strb     w16, [x10, #0x133]
    ldrb     w16, [x9, #0x134]
    mov      w19, #0x68
    eor      w16, w16, w19
    strb     w16, [x10, #0x134]
    ldrb     w16, [x9, #0x135]
    eor      w13, w16, w13
    mov      w16, #0x50
    strb     w13, [x10, #0x135]
    ldrb     w13, [x9, #0x136]
    eor      w13, w13, w17
    strb     w13, [x10, #0x136]
    ldrb     w13, [x9, #0x137]
    eor      w13, w13, w16
    strb     w13, [x10, #0x137]
    ldrb     w13, [x9, #0x138]
    mov      w17, #0xa7
    eor      w13, w13, w17
    strb     w13, [x10, #0x138]
    ldrb     w13, [x9, #0x139]
    mov      w17, #0x95
    eor      w13, w13, w17
    strb     w13, [x10, #0x139]
    ldrb     w13, [x9, #0x13a]
    eor      w13, w13, w27
    strb     w13, [x10, #0x13a]
    ldrb     w13, [x9, #0x13b]
    mov      w20, #0xbd
    eor      w13, w13, w20
    strb     w13, [x10, #0x13b]
    ldrb     w13, [x9, #0x13c]
    eor      w13, w13, #0x3e
    strb     w13, [x10, #0x13c]
    mov      w13, #0x1a
    ldrb     w17, [x9, #0x13d]
    mov      w19, #0xca
    eor      w17, w17, w19
    strb     w17, [x10, #0x13d]
    ldrb     w17, [x9, #0x13e]
    eor      w13, w17, w13
    strb     w13, [x10, #0x13e]
    ldrb     w13, [x9, #0x13f]
    eor      w13, w13, #7
    strb     w13, [x10, #0x13f]
    ldrb     w13, [x9, #0x140]
    eor      w13, w13, w6
    strb     w13, [x10, #0x140]
    ldrb     w13, [x9, #0x141]
    eor      w13, w13, w7
    strb     w13, [x10, #0x141]
    ldrb     w13, [x9, #0x142]
    mov      w17, #0x25
    eor      w13, w13, w17
    strb     w13, [x10, #0x142]
    ldrb     w13, [x9, #0x143]
    eor      w13, w13, #0xaaaaaaaa
    strb     w13, [x10, #0x143]
    ldrb     w13, [x9, #0x144]
    eor      w13, w13, w7
    strb     w13, [x10, #0x144]
    ldrb     w13, [x9, #0x145]
    eor      w13, w13, w2
    strb     w13, [x10, #0x145]
    ldrb     w13, [x9, #0x146]
    mov      w2, #0xa6
    eor      w13, w13, w2
    strb     w13, [x10, #0x146]
    ldrb     w13, [x9, #0x147]
    mov      w17, #0xe9
    eor      w13, w13, w17
    strb     w13, [x10, #0x147]
    ldrb     w13, [x9, #0x148]
    eor      w13, w13, w3
    strb     w13, [x10, #0x148]
    ldrb     w13, [x9, #0x149]
    mov      w17, #9
    eor      w13, w13, w17
    strb     w13, [x10, #0x149]
    ldrb     w13, [x9, #0x14a]
    eor      w13, w13, #0x7e
    strb     w13, [x10, #0x14a]
    ldrb     w13, [x9, #0x14b]
    eor      w13, w13, w15
    strb     w13, [x10, #0x14b]
    ldrb     w13, [x9, #0x14c]
    mov      w15, #0xba
    eor      w13, w13, w15
    strb     w13, [x10, #0x14c]
    ldrb     w13, [x9, #0x14d]
    mov      w15, #0x7d
    eor      w13, w13, w15
    strb     w13, [x10, #0x14d]
    ldrb     w13, [x9, #0x14e]
    eor      w13, w13, #0xdddddddd
    strb     w13, [x10, #0x14e]
    ldrb     w13, [x9, #0x14f]
    eor      w13, w13, w8
    strb     w13, [x10, #0x14f]
    ldrb     w13, [x9, #0x150]
    mov      w15, #0x45
    eor      w13, w13, w15
    strb     w13, [x10, #0x150]
    ldrb     w13, [x9, #0x151]
    eor      w12, w13, w12
    strb     w12, [x10, #0x151]
    ldrb     w12, [x9, #0x152]
    eor      w12, w12, w1
    strb     w12, [x10, #0x152]
    ldrb     w12, [x9, #0x153]
    eor      w8, w12, w8
    strb     w8, [x10, #0x153]
    ldrb     w8, [x9, #0x154]
    eor      w8, w8, #8
    strb     w8, [x10, #0x154]
    ldrb     w8, [x9, #0x155]
    eor      w8, w8, #0xc
    strb     w8, [x10, #0x155]
    ldrb     w8, [x9, #0x156]
    eor      w8, w8, w22
    mov      w13, #0xbc
    strb     w8, [x10, #0x156]
    ldrb     w8, [x9, #0x157]
    mov      w12, #0x57
    eor      w8, w8, w12
    strb     w8, [x10, #0x157]
    ldrb     w8, [x9, #0x158]
    eor      w8, w8, #0xbbbbbbbb
    strb     w8, [x10, #0x158]
    ldrb     w8, [x9, #0x159]
    mov      w17, #0x90
    eor      w8, w8, w17
    strb     w8, [x10, #0x159]
    ldrb     w8, [x9, #0x15a]
    mov      w12, #0xf5
    eor      w8, w8, w12
    strb     w8, [x10, #0x15a]
    ldrb     w8, [x9, #0x15b]
    mov      w12, #0xab
    eor      w8, w8, w12
    strb     w8, [x10, #0x15b]
    ldrb     w8, [x9, #0x15c]
    eor      w8, w8, w28
    mov      w1, #0x6a
    strb     w8, [x10, #0x15c]
    mov      w8, #0x72
    ldrb     w12, [x9, #0x15d]
    eor      w12, w12, #0x7c
    strb     w12, [x10, #0x15d]
    ldrb     w12, [x9, #0x15e]
    eor      w8, w12, w8
    strb     w8, [x10, #0x15e]
    ldrb     w8, [x9, #0x15f]
    mov      w12, #0xa8
    eor      w8, w8, w12
    strb     w8, [x10, #0x15f]
    ldrb     w8, [x9, #0x160]
    eor      w8, w8, #0x70
    strb     w8, [x10, #0x160]
    ldrb     w8, [x9, #0x161]
    mov      w12, #0x23
    eor      w8, w8, w12
    strb     w8, [x10, #0x161]
    ldrb     w8, [x9, #0x162]
    eor      w8, w8, #0x44444444
    strb     w8, [x10, #0x162]
    ldrb     w8, [x9, #0x163]
    eor      w8, w8, w0
    strb     w8, [x10, #0x163]
    ldrb     w8, [x9, #0x164]
    eor      w8, w8, w23
    strb     w8, [x10, #0x164]
    ldrb     w8, [x9, #0x165]
    eor      w8, w8, w11
    strb     w8, [x10, #0x165]
    ldrb     w8, [x9, #0x166]
    mov      w11, #0xdb
    eor      w8, w8, w11
    strb     w8, [x10, #0x166]
    ldrb     w8, [x9, #0x167]
    eor      w8, w8, w25
    strb     w8, [x10, #0x167]
    ldrb     w8, [x9, #0x168]
    strb     w8, [x10, #0x168]
    ldrb     w8, [x9, #0x169]
    eor      w8, w8, #0x7e
    strb     w8, [x10, #0x169]
    ldrb     w8, [x9, #0x16a]
    mov      w11, #0xa
    eor      w8, w8, w11
    strb     w8, [x10, #0x16a]
    mov      w8, #0x1d
    ldrb     w11, [x9, #0x16b]
    mov      w15, #0x4f
    eor      w11, w11, w15
    strb     w11, [x10, #0x16b]
    ldrb     w11, [x9, #0x16c]
    eor      w8, w11, w8
    strb     w8, [x10, #0x16c]
    ldrb     w8, [x9, #0x16d]
    eor      w8, w8, #0x30
    strb     w8, [x10, #0x16d]
    ldrb     w8, [x9, #0x16e]
    eor      w8, w8, w3
    strb     w8, [x10, #0x16e]
    ldrb     w8, [x9, #0x16f]
    mov      w11, #0x4a
    eor      w8, w8, w11
    strb     w8, [x10, #0x16f]
    ldrb     w8, [x9, #0x170]
    mov      w11, #0x9e
    eor      w8, w8, w11
    strb     w8, [x10, #0x170]
    ldrb     w8, [x9, #0x171]
    eor      w8, w8, w4
    strb     w8, [x10, #0x171]
    ldrb     w8, [x9, #0x172]
    eor      w8, w8, #0xfe
    strb     w8, [x10, #0x172]
    ldrb     w8, [x9, #0x173]
    mov      w11, #0xd8
    eor      w8, w8, w11
    strb     w8, [x10, #0x173]
    ldrb     w8, [x9, #0x174]
    eor      w8, w8, w23
    strb     w8, [x10, #0x174]
    ldrb     w8, [x9, #0x175]
    eor      w8, w8, w5
    strb     w8, [x10, #0x175]
    ldrb     w8, [x9, #0x176]
    eor      w8, w8, w13
    strb     w8, [x10, #0x176]
    ldrb     w8, [x9, #0x177]
    mov      w11, #0xe8
    eor      w8, w8, w11
    strb     w8, [x10, #0x177]
    ldrb     w8, [x9, #0x178]
    eor      w8, w8, #0xcccccccc
    strb     w8, [x10, #0x178]
    ldrb     w8, [x9, #0x179]
    mov      w11, #0x4e
    eor      w8, w8, w11
    strb     w8, [x10, #0x179]
    ldrb     w8, [x9, #0x17a]
    eor      w11, w8, #0x7c
    mov      w8, #0xae
    strb     w11, [x10, #0x17a]
    ldrb     w11, [x9, #0x17b]
    eor      w11, w11, w2
    strb     w11, [x10, #0x17b]
    ldrb     w11, [x9, #0x17c]
    eor      w11, w11, w8
    strb     w11, [x10, #0x17c]
    ldrb     w11, [x9, #0x17d]
    eor      w11, w11, #0x70
    strb     w11, [x10, #0x17d]
    ldrb     w11, [x9, #0x17e]
    mov      w12, #0x97
    eor      w11, w11, w12
    strb     w11, [x10, #0x17e]
    ldrb     w11, [x9, #0x17f]
    eor      w11, w11, #0xffffffef
    strb     w11, [x10, #0x17f]
    ldrb     w11, [x9, #0x180]
    eor      w11, w11, w20
    strb     w11, [x10, #0x180]
    ldrb     w11, [x9, #0x181]
    eor      w11, w11, #0x77777777
    strb     w11, [x10, #0x181]
    ldrb     w11, [x9, #0x182]
    eor      w11, w11, w14
    strb     w11, [x10, #0x182]
    ldrb     w11, [x9, #0x183]
    eor      w11, w11, #0xffffffc7
    strb     w11, [x10, #0x183]
    ldrb     w11, [x9, #0x184]
    mov      w12, #0xe5
    eor      w11, w11, w12
    strb     w11, [x10, #0x184]
    ldrb     w11, [x9, #0x185]
    eor      w11, w11, w15
    strb     w11, [x10, #0x185]
    ldrb     w11, [x9, #0x186]
    mov      w13, #0x8d
    eor      w11, w11, w13
    strb     w11, [x10, #0x186]
    ldrb     w11, [x9, #0x187]
    mov      w13, #0xb9
    eor      w11, w11, w13
    strb     w11, [x10, #0x187]
    ldrb     w11, [x9, #0x188]
    mov      w15, #0x8c
    eor      w11, w11, w15
    strb     w11, [x10, #0x188]
    ldrb     w11, [x9, #0x189]
    mov      w13, #0xb5
    mov      w14, #0xde
    eor      w11, w11, w13
    strb     w11, [x10, #0x189]
    ldrb     w11, [x9, #0x18a]
    eor      w11, w11, w26
    strb     w11, [x10, #0x18a]
    ldrb     w11, [x9, #0x18b]
    mov      w13, #0x92
    eor      w11, w11, w13
    strb     w11, [x10, #0x18b]
    ldrb     w11, [x9, #0x18c]
    eor      w11, w11, w14
    strb     w11, [x10, #0x18c]
    ldrb     w11, [x9, #0x18d]
    eor      w11, w11, #0xf8
    strb     w11, [x10, #0x18d]
    ldrb     w11, [x9, #0x18e]
    eor      w11, w11, w21
    strb     w11, [x10, #0x18e]
    ldrb     w11, [x9, #0x18f]
    mov      w13, #0xb2
    eor      w11, w11, w13
    strb     w11, [x10, #0x18f]
    ldrb     w11, [x9, #0x190]
    eor      w11, w11, w15
    strb     w11, [x10, #0x190]
    ldrb     w11, [x9, #0x191]
    mov      w13, #0xd2
    eor      w11, w11, w13
    strb     w11, [x10, #0x191]
    ldrb     w11, [x9, #0x192]
    eor      w11, w11, w12
    strb     w11, [x10, #0x192]
    ldrb     w11, [x9, #0x193]
    eor      w11, w11, #0xffffffe1
    strb     w11, [x10, #0x193]
    ldrb     w11, [x9, #0x194]
    eor      w11, w11, #0xfffffff7
    strb     w11, [x10, #0x194]
    ldrb     w11, [x9, #0x195]
    mov      w12, #0xb7
    eor      w11, w11, w12
    strb     w11, [x10, #0x195]
    ldrb     w11, [x9, #0x196]
    eor      w11, w11, w14
    strb     w11, [x10, #0x196]
    ldrb     w11, [x9, #0x197]
    eor      w11, w11, #0x7c
    strb     w11, [x10, #0x197]
    ldrb     w11, [x9, #0x198]
    eor      w8, w11, w8
    strb     w8, [x10, #0x198]
    ldrb     w8, [x9, #0x199]
    eor      w8, w8, #4
    strb     w8, [x10, #0x199]
    ldrb     w8, [x9, #0x19a]
    eor      w8, w8, w17
    strb     w8, [x10, #0x19a]
    ldrb     w8, [x9, #0x19b]
    mov      w11, #0xa9
    eor      w8, w8, w11
    strb     w8, [x10, #0x19b]
    ldrb     w8, [x9, #0x19c]
    eor      w8, w8, #0xfc
    strb     w8, [x10, #0x19c]
    ldrb     w8, [x9, #0x19d]
    eor      w8, w8, #0xffffff81
    strb     w8, [x10, #0x19d]
    ldrb     w8, [x9, #0x19e]
    eor      w8, w8, #0xffffff8f
    strb     w8, [x10, #0x19e]
    ldrb     w8, [x9, #0x19f]
    eor      w8, w8, w1
    strb     w8, [x10, #0x19f]
    ldrb     w8, [x9, #0x1a0]
    eor      w8, w8, #0x18
    strb     w8, [x10, #0x1a0]
    ldrb     w8, [x9, #0x1a1]
    eor      w8, w8, #0x1c
    strb     w8, [x10, #0x1a1]
    ldrb     w8, [x9, #0x1a2]
    eor      w8, w8, w16
    strb     w8, [x10, #0x1a2]
    ldrb     w8, [x9, #0x1a3]
    eor      w8, w8, #0xbbbbbbbb
    strb     w8, [x10, #0x1a3]
    ldrb     w8, [x9, #0x1a4]
    mov      w11, #0xad
    eor      w8, w8, w11
    strb     w8, [x10, #0x1a4]
    ldrb     w8, [x9, #0x1a5]
    adrp     x9, #0x580000
    add      x9, x9, #0x614
    mov      w11, #0x4d
    eor      w8, w8, w11
    strb     w8, [x10, #0x1a5]
    mov      w8, #1
    stlr     w8, [x9]
    ldr      x0, [x24, #0x10]
    cbnz     x0, #0x2f1918
    adrp     x0, #0x542000
    add      x0, x0, #0x190
    mov      w1, #0x1a6
    bl       #0x2efdc8
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    bl       #0x2eff9c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x2efe5c
    str      x0, [x24, #0x10]
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x2f0118
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x24, #0x10]
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      

// -[WCLGGlassStore currentWXID] IMP=0x2F1934 bounds=0x2F1934-0x2F198C
loc_2F1934:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    bl       #0xdfd2c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4a6000
    add      x8, x8, #0xd8
    cmp      x0, #0
    csel     x20, x8, x19, eq
    mov      x0, x20
    bl       #0x461cc0 // _objc_retainAutoreleaseReturnValue
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    ret      

// -[WCLGGlassStore buildRequest:requestKey:nonce:] IMP=0x2F198C bounds=0x2F198C-0x2F2B94
loc_2F198C:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x70
    mov      x26, x4
    stur     x3, [x29, #-0x68]
    mov      x21, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x580000
    add      x8, x8, #0x61c
    ldar     w9, [x8]
    cbnz     w9, #0x2f24a4
    adrp     x9, #0x542000
    add      x9, x9, #0x498
    ldrb     w10, [x9]
    mov      w12, #0x9e
    eor      w10, w10, w12
    adrp     x13, #0x542000
    add      x13, x13, #0x4a2
    strb     w10, [x13]
    ldrb     w10, [x9, #1]
    mov      w11, #0xa0
    eor      w10, w10, w11
    strb     w10, [x13, #1]
    ldrb     w10, [x9, #2]
    mov      w16, #0x67
    eor      w10, w10, w16
    strb     w10, [x13, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xc0
    strb     w10, [x13, #3]
    ldrb     w10, [x9, #4]
    mov      w14, #0xa2
    eor      w10, w10, w14
    strb     w10, [x13, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0xffffffc1
    strb     w10, [x13, #5]
    ldrb     w14, [x9, #6]
    mov      w10, #0xc6
    eor      w14, w14, w10
    strb     w14, [x13, #6]
    ldrb     w14, [x9, #7]
    mov      w1, #0x86
    eor      w14, w14, w1
    strb     w14, [x13, #7]
    ldrb     w14, [x9, #8]
    eor      w14, w14, #0xf
    strb     w14, [x13, #8]
    ldrb     w9, [x9, #9]
    mov      w0, #0x24
    eor      w9, w9, w0
    strb     w9, [x13, #9]
    adrp     x13, #0x542000
    add      x13, x13, #0x47c
    ldrb     w14, [x13]
    mov      w9, #0x52
    adrp     x15, #0x542000
    add      x15, x15, #0x47e
    eor      w14, w14, w9
    strb     w14, [x15]
    ldrb     w13, [x13, #1]
    mov      w14, #0xc8
    eor      w13, w13, w14
    strb     w13, [x15, #1]
    adrp     x3, #0x542000
    add      x3, x3, #0x420
    ldrb     w13, [x3]
    eor      w13, w13, #0xffffffe3
    adrp     x5, #0x542000
    add      x5, x5, #0x450
    strb     w13, [x5]
    ldrb     w14, [x3, #1]
    mov      w13, #0xa5
    eor      w14, w14, w13
    strb     w14, [x5, #1]
    ldrb     w14, [x3, #2]
    eor      w14, w14, #4
    strb     w14, [x5, #2]
    ldrb     w14, [x3, #3]
    mov      w19, #0xa
    eor      w14, w14, w19
    strb     w14, [x5, #3]
    ldrb     w14, [x3, #4]
    mov      w15, #0x15
    eor      w14, w14, w15
    strb     w14, [x5, #4]
    ldrb     w14, [x3, #5]
    mov      w15, #0xa8
    eor      w14, w14, w15
    strb     w14, [x5, #5]
    ldrb     w14, [x3, #6]
    mov      w24, #0xb5
    eor      w14, w14, w24
    strb     w14, [x5, #6]
    ldrb     w14, [x3, #7]
    mov      w7, #0xa6
    eor      w14, w14, w7
    strb     w14, [x5, #7]
    ldrb     w14, [x3, #8]
    mov      w15, #0x73
    eor      w14, w14, w15
    strb     w14, [x5, #8]
    ldrb     w14, [x3, #9]
    mov      w25, #0x58
    eor      w14, w14, w25
    strb     w14, [x5, #9]
    ldrb     w14, [x3, #0xa]
    mov      w15, #0xb8
    eor      w14, w14, w15
    strb     w14, [x5, #0xa]
    ldrb     w14, [x3, #0xb]
    eor      w14, w14, w13
    strb     w14, [x5, #0xb]
    ldrb     w14, [x3, #0xc]
    mov      w20, #0x57
    eor      w14, w14, w20
    strb     w14, [x5, #0xc]
    ldrb     w14, [x3, #0xd]
    eor      w14, w14, #0xdddddddd
    strb     w14, [x5, #0xd]
    ldrb     w15, [x3, #0xe]
    mov      w14, #0xd1
    eor      w15, w15, w14
    strb     w15, [x5, #0xe]
    ldrb     w15, [x3, #0xf]
    mov      w23, #0xe6
    eor      w15, w15, w23
    strb     w15, [x5, #0xf]
    ldrb     w15, [x3, #0x10]
    mov      w17, #0x7a
    eor      w15, w15, w17
    strb     w15, [x5, #0x10]
    ldrb     w15, [x3, #0x11]
    mov      w22, #0x62
    eor      w15, w15, w22
    strb     w15, [x5, #0x11]
    ldrb     w15, [x3, #0x12]
    mov      x28, x26
    mov      w26, #0xc5
    eor      w15, w15, w26
    strb     w15, [x5, #0x12]
    ldrb     w15, [x3, #0x13]
    eor      w15, w15, w13
    strb     w15, [x5, #0x13]
    ldrb     w15, [x3, #0x14]
    mov      w17, #0xd
    eor      w15, w15, w17
    strb     w15, [x5, #0x14]
    ldrb     w15, [x3, #0x15]
    eor      w15, w15, w20
    strb     w15, [x5, #0x15]
    ldrb     w15, [x3, #0x16]
    mov      w17, #0x4c
    eor      w15, w15, w17
    strb     w15, [x5, #0x16]
    ldrb     w15, [x3, #0x17]
    mov      w6, #0x84
    eor      w15, w15, w6
    strb     w15, [x5, #0x17]
    ldrb     w15, [x3, #0x18]
    mov      w27, #0x74
    eor      w15, w15, w27
    strb     w15, [x5, #0x18]
    ldrb     w15, [x3, #0x19]
    mov      w4, #0xd4
    eor      w15, w15, w4
    strb     w15, [x5, #0x19]
    ldrb     w15, [x3, #0x1a]
    eor      w15, w15, w27
    strb     w15, [x5, #0x1a]
    ldrb     w15, [x3, #0x1b]
    eor      w15, w15, #0x18
    strb     w15, [x5, #0x1b]
    ldrb     w15, [x3, #0x1c]
    eor      w15, w15, w26
    strb     w15, [x5, #0x1c]
    ldrb     w15, [x3, #0x1d]
    mov      w27, #0x29
    eor      w15, w15, w27
    strb     w15, [x5, #0x1d]
    ldrb     w15, [x3, #0x1e]
    mov      w27, #0x2d
    eor      w15, w15, w27
    strb     w15, [x5, #0x1e]
    ldrb     w15, [x3, #0x1f]
    mov      w27, #0xba
    eor      w15, w15, w27
    strb     w15, [x5, #0x1f]
    ldrb     w27, [x3, #0x20]
    mov      w15, #0xe2
    eor      w27, w27, w15
    strb     w27, [x5, #0x20]
    ldrb     w27, [x3, #0x21]
    eor      w24, w27, w24
    strb     w24, [x5, #0x21]
    ldrb     w24, [x3, #0x22]
    eor      w24, w24, w25
    strb     w24, [x5, #0x22]
    ldrb     w24, [x3, #0x23]
    eor      w24, w24, #0x88888888
    strb     w24, [x5, #0x23]
    ldrb     w24, [x3, #0x24]
    eor      w24, w24, #0xe0
    strb     w24, [x5, #0x24]
    ldrb     w24, [x3, #0x25]
    mov      w25, #0x34
    eor      w24, w24, w25
    strb     w24, [x5, #0x25]
    ldrb     w24, [x3, #0x26]
    eor      w24, w24, #0xffffffc3
    strb     w24, [x5, #0x26]
    ldrb     w24, [x3, #0x27]
    eor      w24, w24, #0x7c
    strb     w24, [x5, #0x27]
    ldrb     w24, [x3, #0x28]
    mov      w25, #0x5b
    eor      w24, w24, w25
    strb     w24, [x5, #0x28]
    ldrb     w24, [x3, #0x29]
    eor      w24, w24, w26
    strb     w24, [x5, #0x29]
    ldrb     w24, [x3, #0x2a]
    mov      w25, #0xde
    eor      w24, w24, w25
    strb     w24, [x5, #0x2a]
    ldrb     w3, [x3, #0x2b]
    eor      w3, w3, w7
    strb     w3, [x5, #0x2b]
    adrp     x3, #0x542000
    add      x3, x3, #0x410
    ldrb     w5, [x3]
    adrp     x7, #0x542000
    add      x7, x7, #0x417
    strb     w5, [x7]
    ldrb     w5, [x3, #1]
    eor      w5, w5, #0xfffffff3
    strb     w5, [x7, #1]
    ldrb     w5, [x3, #2]
    eor      w5, w5, #7
    strb     w5, [x7, #2]
    ldrb     w5, [x3, #3]
    mov      w24, #0x13
    eor      w5, w5, w24
    strb     w5, [x7, #3]
    ldrb     w5, [x3, #4]
    eor      w5, w5, #0x3e
    strb     w5, [x7, #4]
    ldrb     w5, [x3, #5]
    mov      w24, #0x85
    eor      w5, w5, w24
    strb     w5, [x7, #5]
    ldrb     w3, [x3, #6]
    eor      w3, w3, #0xffffffef
    strb     w3, [x7, #6]
    adrp     x3, #0x542000
    add      x3, x3, #0x3fc
    ldrb     w5, [x3]
    eor      w5, w5, w23
    adrp     x23, #0x542000
    add      x23, x23, #0x406
    strb     w5, [x23]
    ldrb     w5, [x3, #1]
    mov      w7, #0x69
    eor      w5, w5, w7
    strb     w5, [x23, #1]
    ldrb     w5, [x3, #2]
    mov      w7, #0xf6
    eor      w5, w5, w7
    strb     w5, [x23, #2]
    ldrb     w5, [x3, #3]
    eor      w5, w5, w10
    strb     w5, [x23, #3]
    ldrb     w5, [x3, #4]
    eor      w5, w5, #6
    strb     w5, [x23, #4]
    ldrb     w5, [x3, #5]
    mov      w7, #0xe8
    eor      w5, w5, w7
    strb     w5, [x23, #5]
    ldrb     w5, [x3, #6]
    eor      w5, w5, #0xffffffe7
    strb     w5, [x23, #6]
    ldrb     w5, [x3, #7]
    mov      w7, #0x71
    eor      w5, w5, w7
    strb     w5, [x23, #7]
    ldrb     w5, [x3, #8]
    eor      w5, w5, #0xe
    strb     w5, [x23, #8]
    ldrb     w3, [x3, #9]
    eor      w3, w3, w24
    adrp     x5, #0x542000
    add      x5, x5, #0x480
    strb     w3, [x23, #9]
    ldrb     w3, [x5]
    mov      w23, #0x43
    eor      w3, w3, w23
    adrp     x23, #0x542000
    add      x23, x23, #0x48c
    strb     w3, [x23]
    ldrb     w3, [x5, #1]
    mov      w24, #0x32
    eor      w3, w3, w24
    strb     w3, [x23, #1]
    ldrb     w3, [x5, #2]
    mov      w24, #0x8b
    eor      w3, w3, w24
    strb     w3, [x23, #2]
    ldrb     w3, [x5, #3]
    eor      w3, w3, #0xffffffef
    strb     w3, [x23, #3]
    ldrb     w24, [x5, #4]
    mov      w3, #0x6b
    eor      w24, w24, w3
    strb     w24, [x23, #4]
    ldrb     w24, [x5, #5]
    mov      w25, #0xac
    eor      w24, w24, w25
    strb     w24, [x23, #5]
    ldrb     w24, [x5, #6]
    eor      w24, w24, w11
    strb     w24, [x23, #6]
    ldrb     w24, [x5, #7]
    mov      w25, #0xd6
    eor      w24, w24, w25
    strb     w24, [x23, #7]
    ldrb     w24, [x5, #8]
    eor      w24, w24, w20
    strb     w24, [x23, #8]
    ldrb     w24, [x5, #9]
    mov      w25, #0x2e
    eor      w24, w24, w25
    strb     w24, [x23, #9]
    ldrb     w24, [x5, #0xa]
    eor      w24, w24, w25
    strb     w24, [x23, #0xa]
    ldrb     w5, [x5, #0xb]
    eor      w5, w5, #0x7c
    strb     w5, [x23, #0xb]
    adrp     x24, #0x542000
    add      x24, x24, #0x3f0
    ldrb     w23, [x24]
    mov      w5, #0xb2
    eor      w23, w23, w5
    adrp     x25, #0x542000
    add      x25, x25, #0x3f6
    strb     w23, [x25]
    ldrb     w26, [x24, #1]
    mov      w23, #0xfa
    eor      w26, w26, w23
    strb     w26, [x25, #1]
    ldrb     w26, [x24, #2]
    mov      w27, #0x4e
    eor      w26, w26, w27
    strb     w26, [x25, #2]
    ldrb     w26, [x24, #3]
    eor      w26, w26, #0xfffffffb
    strb     w26, [x25, #3]
    ldrb     w26, [x24, #4]
    eor      w26, w26, #0xffffffcf
    strb     w26, [x25, #4]
    ldrb     w24, [x24, #5]
    mvn      w24, w24
    adrp     x26, #0x542000
    add      x26, x26, #0x3b0
    strb     w24, [x25, #5]
    ldrb     w24, [x26]
    mov      w25, #0x93
    eor      w24, w24, w25
    adrp     x25, #0x542000
    add      x25, x25, #0x3b8
    strb     w24, [x25]
    ldrb     w24, [x26, #1]
    mov      w27, #0x72
    eor      w24, w24, w27
    strb     w24, [x25, #1]
    ldrb     w24, [x26, #2]
    eor      w22, w24, w22
    strb     w22, [x25, #2]
    ldrb     w22, [x26, #3]
    mov      w24, #0x50
    eor      w22, w22, w24
    strb     w22, [x25, #3]
    ldrb     w22, [x26, #4]
    mov      w24, #0x8e
    eor      w22, w22, w24
    strb     w22, [x25, #4]
    ldrb     w22, [x26, #5]
    eor      w22, w22, w7
    strb     w22, [x25, #5]
    ldrb     w22, [x26, #6]
    eor      w22, w22, #6
    strb     w22, [x25, #6]
    ldrb     w22, [x26, #7]
    mov      w26, #0xa9
    eor      w22, w22, w26
    mov      x26, x28
    strb     w22, [x25, #7]
    adrp     x22, #0x542000
    add      x22, x22, #0x3aa
    ldrb     w25, [x22]
    eor      w19, w25, w19
    adrp     x25, #0x542000
    add      x25, x25, #0x3ad
    strb     w19, [x25]
    ldrb     w19, [x22, #1]
    eor      w19, w19, w24
    strb     w19, [x25, #1]
    ldrb     w19, [x22, #2]
    eor      w19, w19, w20
    strb     w19, [x25, #2]
    adrp     x19, #0x542000
    add      x19, x19, #0x390
    ldrb     w20, [x19]
    mov      w22, #0xe9
    eor      w20, w20, w22
    adrp     x22, #0x542000
    add      x22, x22, #0x392
    strb     w20, [x22]
    ldrb     w19, [x19, #1]
    eor      w19, w19, #0xfffffff7
    strb     w19, [x22, #1]
    adrp     x20, #0x542000
    add      x20, x20, #0x3dc
    ldrb     w19, [x20]
    eor      w19, w19, w0
    adrp     x22, #0x542000
    add      x22, x22, #0x3e6
    strb     w19, [x22]
    ldrb     w19, [x20, #1]
    mov      w24, #0x6f
    eor      w19, w19, w24
    strb     w19, [x22, #1]
    ldrb     w24, [x20, #2]
    mov      w19, #0x12
    eor      w24, w24, w19
    strb     w24, [x22, #2]
    ldrb     w24, [x20, #3]
    eor      w24, w24, #1
    strb     w24, [x22, #3]
    ldrb     w24, [x20, #4]
    eor      w24, w24, #0xfffffff1
    strb     w24, [x22, #4]
    ldrb     w24, [x20, #5]
    eor      w24, w24, #0xbbbbbbbb
    strb     w24, [x22, #5]
    ldrb     w24, [x20, #6]
    eor      w24, w24, #0xffffff83
    strb     w24, [x22, #6]
    ldrb     w24, [x20, #7]
    mov      w25, #0xb4
    eor      w24, w24, w25
    strb     w24, [x22, #7]
    ldrb     w24, [x20, #8]
    eor      w1, w24, w1
    strb     w1, [x22, #8]
    ldrb     w1, [x20, #9]
    mov      w20, #0x6c
    eor      w1, w1, w20
    strb     w1, [x22, #9]
    adrp     x1, #0x542000
    add      x1, x1, #0x3c0
    ldrb     w20, [x1]
    eor      w0, w20, w0
    adrp     x20, #0x542000
    add      x20, x20, #0x3ce
    strb     w0, [x20]
    ldrb     w0, [x1, #1]
    mov      w22, #0xdc
    eor      w0, w0, w22
    strb     w0, [x20, #1]
    ldrb     w0, [x1, #2]
    eor      w0, w0, #0xfe
    strb     w0, [x20, #2]
    ldrb     w0, [x1, #3]
    eor      w0, w0, #8
    strb     w0, [x20, #3]
    ldrb     w0, [x1, #4]
    eor      w0, w0, #0xffffffe7
    strb     w0, [x20, #4]
    ldrb     w0, [x1, #5]
    mov      w24, #0xd9
    eor      w0, w0, w24
    strb     w0, [x20, #5]
    ldrb     w0, [x1, #6]
    mov      w24, #0x28
    eor      w0, w0, w24
    strb     w0, [x20, #6]
    ldrb     w0, [x1, #7]
    eor      w0, w0, #0x60
    strb     w0, [x20, #7]
    ldrb     w0, [x1, #8]
    eor      w16, w0, w16
    strb     w16, [x20, #8]
    ldrb     w16, [x1, #9]
    eor      w16, w16, w6
    strb     w16, [x20, #9]
    ldrb     w16, [x1, #0xa]
    eor      w16, w16, #0xffffffc7
    strb     w16, [x20, #0xa]
    ldrb     w16, [x1, #0xb]
    eor      w16, w16, w22
    strb     w16, [x20, #0xb]
    ldrb     w16, [x1, #0xc]
    mov      w0, #0x3d
    eor      w16, w16, w0
    strb     w16, [x20, #0xc]
    ldrb     w16, [x1, #0xd]
    eor      w16, w16, w4
    strb     w16, [x20, #0xd]
    adrp     x16, #0x542000
    add      x16, x16, #0x394
    ldrb     w0, [x16]
    eor      w0, w0, w23
    adrp     x1, #0x542000
    add      x1, x1, #0x39f
    strb     w0, [x1]
    ldrb     w0, [x16, #1]
    mov      w6, #0x4f
    eor      w0, w0, w6
    strb     w0, [x1, #1]
    ldrb     w0, [x16, #2]
    eor      w0, w0, w4
    strb     w0, [x1, #2]
    ldrb     w0, [x16, #3]
    mov      w4, #0x27
    eor      w0, w0, w4
    strb     w0, [x1, #3]
    ldrb     w0, [x16, #4]
    eor      w0, w0, w23
    strb     w0, [x1, #4]
    ldrb     w0, [x16, #5]
    mov      w4, #0xd5
    eor      w0, w0, w4
    strb     w0, [x1, #5]
    ldrb     w0, [x16, #6]
    eor      w0, w0, #0xfffffff7
    strb     w0, [x1, #6]
    ldrb     w0, [x16, #7]
    mov      w4, #0x9b
    eor      w0, w0, w4
    strb     w0, [x1, #7]
    ldrb     w0, [x16, #8]
    mov      w4, #0x92
    eor      w0, w0, w4
    strb     w0, [x1, #8]
    ldrb     w0, [x16, #9]
    eor      w0, w0, #0xeeeeeeee
    strb     w0, [x1, #9]
    ldrb     w16, [x16, #0xa]
    mov      w0, #0x3b
    eor      w16, w16, w0
    strb     w16, [x1, #0xa]
    adrp     x16, #0x542000
    add      x16, x16, #0x350
    ldrb     w0, [x16]
    mov      w1, #0x54
    eor      w1, w0, w1
    adrp     x0, #0x542000
    add      x0, x0, #0x370
    strb     w1, [x0]
    ldrb     w4, [x16, #1]
    mov      w1, #0x4b
    eor      w4, w4, w1
    strb     w4, [x0, #1]
    ldrb     w4, [x16, #2]
    eor      w12, w4, w12
    strb     w12, [x0, #2]
    ldrb     w12, [x16, #3]
    mov      w4, #0x3a
    eor      w12, w12, w4
    strb     w12, [x0, #3]
    ldrb     w12, [x16, #4]
    mov      w4, #0x48
    eor      w12, w12, w4
    strb     w12, [x0, #4]
    ldrb     w12, [x16, #5]
    eor      w12, w12, w17
    strb     w12, [x0, #5]
    ldrb     w12, [x16, #6]
    mov      w17, #0x1b
    eor      w12, w12, w17
    strb     w12, [x0, #6]
    ldrb     w12, [x16, #7]
    eor      w12, w12, #0x22222222
    strb     w12, [x0, #7]
    ldrb     w12, [x16, #8]
    mov      w17, #0x76
    eor      w12, w12, w17
    strb     w12, [x0, #8]
    ldrb     w12, [x16, #9]
    eor      w11, w12, w11
    strb     w11, [x0, #9]
    ldrb     w11, [x16, #0xa]
    mov      w12, #0xe5
    eor      w11, w11, w12
    strb     w11, [x0, #0xa]
    ldrb     w11, [x16, #0xb]
    eor      w11, w11, w13
    strb     w11, [x0, #0xb]
    ldrb     w11, [x16, #0xc]
    eor      w11, w11, #0x30
    strb     w11, [x0, #0xc]
    ldrb     w11, [x16, #0xd]
    eor      w11, w11, #0xffffffe1
    strb     w11, [x0, #0xd]
    ldrb     w11, [x16, #0xe]
    mov      w12, #0x7d
    eor      w11, w11, w12
    strb     w11, [x0, #0xe]
    ldrb     w11, [x16, #0xf]
    eor      w11, w11, #0x20
    strb     w11, [x0, #0xf]
    ldrb     w11, [x16, #0x10]
    eor      w11, w11, #0x30
    strb     w11, [x0, #0x10]
    ldrb     w11, [x16, #0x11]
    eor      w11, w11, #0x66666666
    strb     w11, [x0, #0x11]
    ldrb     w11, [x16, #0x12]
    eor      w11, w11, w7
    strb     w11, [x0, #0x12]
    ldrb     w11, [x16, #0x13]
    mov      w12, #0xed
    eor      w11, w11, w12
    strb     w11, [x0, #0x13]
    ldrb     w11, [x16, #0x14]
    eor      w10, w11, w10
    strb     w10, [x0, #0x14]
    ldrb     w10, [x16, #0x15]
    eor      w10, w10, #0xffffffe1
    strb     w10, [x0, #0x15]
    ldrb     w10, [x16, #0x16]
    mov      w11, #9
    eor      w10, w10, w11
    strb     w10, [x0, #0x16]
    ldrb     w10, [x16, #0x17]
    eor      w10, w10, w14
    strb     w10, [x0, #0x17]
    ldrb     w10, [x16, #0x18]
    mov      w11, #0x36
    eor      w10, w10, w11
    strb     w10, [x0, #0x18]
    ldrb     w10, [x16, #0x19]
    eor      w10, w10, #0x7e
    strb     w10, [x0, #0x19]
    ldrb     w10, [x16, #0x1a]
    mov      w11, #0x94
    eor      w10, w10, w11
    strb     w10, [x0, #0x1a]
    ldrb     w10, [x16, #0x1b]
    eor      w10, w10, #0x3f
    strb     w10, [x0, #0x1b]
    ldrb     w10, [x16, #0x1c]
    mov      w11, #0xb
    eor      w10, w10, w11
    strb     w10, [x0, #0x1c]
    ldrb     w10, [x16, #0x1d]
    eor      w10, w10, w15
    strb     w10, [x0, #0x1d]
    ldrb     w10, [x16, #0x1e]
    eor      w10, w10, w1
    strb     w10, [x0, #0x1e]
    ldrb     w10, [x16, #0x1f]
    eor      w9, w10, w9
    strb     w9, [x0, #0x1f]
    adrp     x9, #0x542000
    add      x9, x9, #0x336
    ldrb     w10, [x9]
    eor      w10, w10, w19
    adrp     x11, #0x542000
    add      x11, x11, #0x340
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x5f
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0x22222222
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xfffffff7
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0xffffff81
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, w5
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0x6e
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    eor      w10, w10, #2
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    eor      w10, w10, w3
    strb     w10, [x11, #8]
    ldrb     w9, [x9, #9]
    eor      w9, w9, #0x22222222
    strb     w9, [x11, #9]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x20, sp, #0x10
    mov      sp, x20
    sub      x27, sp, #0x50
    mov      sp, x27
    sub      x19, sp, #0x50
    mov      sp, x19
    sub      x28, sp, #0x50
    mov      sp, x28
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2e8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xa30]
    stur     x1, [x29, #-0x70]
    mov      x3, #0
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    mov      w0, #0x20
    bl       #0x2f2b94
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      w0, #0x10
    bl       #0x2f2b94
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      w0, #0x18
    bl       #0x2f2b94
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x60]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x6c0]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x338]
    mov      x0, x22
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2f2b18
    mov      x0, x23
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0x20
    b.ne     #0x2f2b18
    mov      x0, x24
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0x10
    b.ne     #0x2f2b18
    stur     x26, [x29, #-0x78]
    ldur     x0, [x29, #-0x60]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x26, #0
    cmp      x0, #0x18
    b.ne     #0x2f2b1c
    cbz      x25, #0x2f2b1c
    mov      x0, x22
    mov      x1, x23
    mov      x2, x24
    mov      w3, #0
    bl       #0x2f2c2c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    str      xzr, [x20]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x6b0]
    ldr      x1, [x8]
    mov      x0, x25
    mov      x2, x23
    mov      x3, x20
    bl       #0x4617d4 // _SecKeyCreateEncryptedData
    mov      x25, x0
    ldr      x0, [x20]
    cbz      x0, #0x2f25f8
    bl       #0x461510 // _CFRelease
    mov      x0, x26
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    stur     x26, [x29, #-0x80]
    cbz      x0, #0x2f2b78
    mov      x0, x25
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2f2b78
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1d0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x778]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x998]
    bl       #0x461c6c // _objc_msgSend
    fcvtms   x8, d0
    stur     x8, [x29, #-0x88]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x542000
    add      x8, x8, #0x590
    str      x8, [x19]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    mov      x26, x8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x628]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x98]
    adrp     x8, #0x542000
    add      x8, x8, #0x810
    adrp     x10, #0x542000
    add      x10, x10, #0x5d0
    adrp     x9, #0x542000
    add      x9, x9, #0x650
    stp      x0, x10, [x27]
    stp      x8, x9, [x19, #8]
    adrp     x8, #0x542000
    add      x8, x8, #0x790
    str      x8, [x27, #0x10]
    adrp     x8, #0x542000
    add      x8, x8, #0x750
    str      x8, [x19, #0x18]
    ldr      x0, [x26, #0xa8]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x4f0]
    mov      x1, x21
    stur     x21, [x29, #-0xa8]
    ldur     x20, [x29, #-0x88]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xa0]
    str      x0, [x27, #0x18]
    adrp     x8, #0x542000
    add      x8, x8, #0x7d0
    str      x8, [x19, #0x20]
    ldr      x0, [x26, #0xa8]
    add      x2, x20, #0x1e
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb0]
    str      x0, [x27, #0x20]
    adrp     x8, #0x542000
    add      x8, x8, #0x690
    str      x8, [x19, #0x28]
    ldur     x0, [x29, #-0x60]
    bl       #0x2f2e10
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb8]
    str      x0, [x27, #0x28]
    adrp     x8, #0x542000
    add      x8, x8, #0x710
    str      x8, [x19, #0x30]
    stur     x25, [x29, #-0x90]
    mov      x0, x25
    bl       #0x2f2e10
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    str      x0, [x27, #0x30]
    adrp     x8, #0x542000
    add      x8, x8, #0x610
    str      x8, [x19, #0x38]
    mov      x0, x24
    bl       #0x2f2e10
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    str      x0, [x27, #0x38]
    adrp     x8, #0x542000
    add      x8, x8, #0x6d0
    str      x8, [x19, #0x40]
    ldur     x0, [x29, #-0x80]
    bl       #0x2f2e10
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    str      x0, [x27, #0x40]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    mov      x2, x27
    mov      x3, x19
    mov      w4, #9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x360]
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x98]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x542000
    add      x9, x8, #0x550
    adrp     x8, #0x542000
    add      x8, x8, #0x5d0
    stp      x9, x8, [x28]
    adrp     x8, #0x542000
    add      x8, x8, #0x790
    str      x8, [x28, #0x10]
    adrp     x19, #0x4c4000
    ldr      x0, [x19, #0xa8]
    ldur     x21, [x29, #-0xa8]
    mov      x1, x21
    ldur     x25, [x29, #-0x88]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x98]
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x5b0]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xa0]
    str      x0, [x28, #0x18]
    ldr      x0, [x19, #0xa8]
    add      x2, x25, #0x1e
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x88]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xa8]
    str      x0, [x28, #0x20]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x528]
    mov      x0, x26
    mov      x1, x25
    adrp     x2, #0x542000
    add      x2, x2, #0x690
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    str      x0, [x28, #0x28]
    mov      x0, x26
    mov      x1, x25
    adrp     x2, #0x542000
    add      x2, x2, #0x710
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    str      x0, [x28, #0x30]
    mov      x0, x26
    mov      x1, x25
    adrp     x2, #0x542000
    add      x2, x2, #0x610
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    str      x0, [x28, #0x38]
    mov      x0, x26
    mov      x1, x25
    adrp     x2, #0x542000
    add      x2, x2, #0x6d0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    str      x0, [x28, #0x40]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    mov      x2, x28
    mov      w3, #9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xa68]
    adrp     x2, #0x542000
    add      x2, x2, #0x510
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x27, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x88]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x98]
    bl       #0x461c9c // _objc_release
    adrp     x0, #0x542000
    add      x0, x0, #0x370
    mov      w1, #0x20
    bl       #0x2efdc8
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xa38]
    mov      x0, x25
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x19
    mov      x1, x21
    bl       #0x2f3020
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x2f0118
    mov      x0, x20
    bl       #0x2f2e10
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x368]
    adrp     x3, #0x542000
    add      x3, x3, #0x4d0
    mov      x0, x26
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldur     x21, [x29, #-0x68]
    cbz      x21, #0x2f2aa8
    mov      x0, x23
    bl       #0x461cb4 // _objc_retainAutorelease
    str      x23, [x21]
    ldur     x21, [x29, #-0x78]
    cbz      x21, #0x2f2ac8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    ldur     x0, [x29, #-0x60]
    bl       #0x461c6c // _objc_msgSend
    bl       #0x461bc4 // _objc_autorelease
    str      x0, [x21]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2e8]
    ldur     x1, [x29, #-0x70]
    mov      x2, x27
    mov      x3, #0
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    ldur     x25, [x29, #-0x90]
    b        #0x2f2b7c
    mov      x26, #0
    ldur     x0, [x29, #-0x60]
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2f2b90
    mov      x0, x26
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    b        #0x461be8 // _objc_autoreleaseReturnValue
    mov      x26, #0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    b        #0x2f2b1c
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGGlassStore decryptResponse:requestKey:nonce:] IMP=0x2F3140 bounds=0x2F3140-0x2F4364
loc_2F3140:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    sub      sp, sp, #0x80
    mov      x21, x4
    mov      x20, x3
    mov      x19, x2
    mov      x23, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x68]
    adrp     x8, #0x580000
    add      x8, x8, #0x630
    ldar     w9, [x8]
    cbnz     w9, #0x2f3ba4
    adrp     x9, #0x542000
    add      x9, x9, #0xad4
    ldrb     w10, [x9]
    mov      w11, #0xb6
    adrp     x12, #0x542000
    add      x12, x12, #0xade
    eor      w10, w10, w11
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    mov      w13, #0x46
    eor      w10, w10, w13
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    mov      w11, #0xf6
    eor      w10, w10, w11
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xc
    strb     w10, [x12, #3]
    ldrb     w10, [x9, #4]
    mov      w14, #0xb2
    eor      w10, w10, w14
    strb     w10, [x12, #4]
    ldrb     w10, [x9, #5]
    mov      w14, #0xb5
    eor      w10, w10, w14
    strb     w10, [x12, #5]
    ldrb     w15, [x9, #6]
    mov      w10, #0xd9
    eor      w15, w15, w10
    strb     w15, [x12, #6]
    ldrb     w15, [x9, #7]
    mov      w16, #0x5d
    eor      w15, w15, w16
    strb     w15, [x12, #7]
    ldrb     w15, [x9, #8]
    eor      w13, w15, w13
    strb     w13, [x12, #8]
    ldrb     w9, [x9, #9]
    mov      w16, #0x3a
    eor      w9, w9, w16
    strb     w9, [x12, #9]
    adrp     x9, #0x542000
    add      x9, x9, #0xabc
    ldrb     w13, [x9]
    mov      w12, #0x56
    adrp     x15, #0x542000
    add      x15, x15, #0xac8
    eor      w13, w13, w12
    strb     w13, [x15]
    ldrb     w13, [x9, #1]
    eor      w13, w13, #0xfffffff1
    strb     w13, [x15, #1]
    ldrb     w13, [x9, #2]
    mov      w17, #0xaf
    eor      w13, w13, w17
    strb     w13, [x15, #2]
    ldrb     w13, [x9, #3]
    mov      w17, #0xc8
    eor      w13, w13, w17
    strb     w13, [x15, #3]
    ldrb     w13, [x9, #4]
    mov      w0, #0x93
    eor      w13, w13, w0
    strb     w13, [x15, #4]
    ldrb     w0, [x9, #5]
    mov      w13, #0xea
    eor      w0, w0, w13
    strb     w0, [x15, #5]
    ldrb     w0, [x9, #6]
    eor      w0, w0, #0xfe
    strb     w0, [x15, #6]
    ldrb     w0, [x9, #7]
    eor      w0, w0, #0x44444444
    strb     w0, [x15, #7]
    ldrb     w0, [x9, #8]
    eor      w0, w0, #0x1c
    strb     w0, [x15, #8]
    ldrb     w0, [x9, #9]
    eor      w0, w0, #0xfffffff7
    strb     w0, [x15, #9]
    ldrb     w0, [x9, #0xa]
    eor      w0, w0, #0xffffffc3
    strb     w0, [x15, #0xa]
    ldrb     w9, [x9, #0xb]
    mov      w0, #0xa4
    eor      w9, w9, w0
    strb     w9, [x15, #0xb]
    adrp     x15, #0x542000
    add      x15, x15, #0xa9c
    ldrb     w0, [x15]
    mov      w9, #0x45
    eor      w0, w0, w9
    adrp     x1, #0x542000
    add      x1, x1, #0xaaa
    strb     w0, [x1]
    ldrb     w0, [x15, #1]
    eor      w0, w0, #0x20
    strb     w0, [x1, #1]
    ldrb     w0, [x15, #2]
    eor      w17, w0, w17
    strb     w17, [x1, #2]
    ldrb     w17, [x15, #3]
    mov      w0, #0xca
    eor      w17, w17, w0
    strb     w17, [x1, #3]
    ldrb     w17, [x15, #4]
    eor      w17, w17, #0x3f
    strb     w17, [x1, #4]
    ldrb     w17, [x15, #5]
    mov      w2, #0x54
    eor      w17, w17, w2
    strb     w17, [x1, #5]
    ldrb     w17, [x15, #6]
    eor      w17, w17, #0xc
    strb     w17, [x1, #6]
    ldrb     w17, [x15, #7]
    eor      w12, w17, w12
    strb     w12, [x1, #7]
    ldrb     w12, [x15, #8]
    mov      w17, #0xe6
    eor      w12, w12, w17
    strb     w12, [x1, #8]
    ldrb     w12, [x15, #9]
    eor      w12, w12, #0x99999999
    strb     w12, [x1, #9]
    ldrb     w12, [x15, #0xa]
    mov      w17, #0x3b
    eor      w12, w12, w17
    strb     w12, [x1, #0xa]
    ldrb     w12, [x15, #0xb]
    mov      w17, #0x75
    eor      w12, w12, w17
    strb     w12, [x1, #0xb]
    ldrb     w12, [x15, #0xc]
    mov      w17, #0xac
    eor      w12, w12, w17
    strb     w12, [x1, #0xc]
    ldrb     w12, [x15, #0xd]
    mov      w15, #0x48
    eor      w12, w12, w15
    strb     w12, [x1, #0xd]
    adrp     x15, #0x542000
    add      x15, x15, #0xab8
    ldrb     w17, [x15]
    mov      w12, #0xad
    eor      w17, w17, w12
    adrp     x1, #0x542000
    add      x1, x1, #0xaba
    strb     w17, [x1]
    ldrb     w15, [x15, #1]
    mov      w17, #0xba
    eor      w15, w15, w17
    strb     w15, [x1, #1]
    adrp     x3, #0x542000
    add      x3, x3, #0xa40
    ldrb     w17, [x3]
    mov      w15, #0xb7
    eor      w17, w17, w15
    adrp     x4, #0x542000
    add      x4, x4, #0xa70
    strb     w17, [x4]
    ldrb     w17, [x3, #1]
    eor      w17, w17, w2
    strb     w17, [x4, #1]
    ldrb     w17, [x3, #2]
    mov      w1, #0x8a
    eor      w17, w17, w1
    strb     w17, [x4, #2]
    ldrb     w17, [x3, #3]
    eor      w17, w17, w11
    strb     w17, [x4, #3]
    ldrb     w17, [x3, #4]
    mov      w1, #0x16
    eor      w17, w17, w1
    strb     w17, [x4, #4]
    ldrb     w17, [x3, #5]
    mov      w1, #0x6c
    eor      w17, w17, w1
    strb     w17, [x4, #5]
    ldrb     w17, [x3, #6]
    mov      w1, #0xb9
    eor      w17, w17, w1
    strb     w17, [x4, #6]
    ldrb     w17, [x3, #7]
    mov      w1, #0x9b
    eor      w17, w17, w1
    strb     w17, [x4, #7]
    ldrb     w17, [x3, #8]
    mov      w1, #0x5e
    eor      w17, w17, w1
    strb     w17, [x4, #8]
    ldrb     w17, [x3, #9]
    mov      w2, #0xb3
    eor      w17, w17, w2
    strb     w17, [x4, #9]
    ldrb     w17, [x3, #0xa]
    eor      w17, w17, #0x11111111
    strb     w17, [x4, #0xa]
    ldrb     w17, [x3, #0xb]
    mov      w1, #0x29
    eor      w17, w17, w1
    strb     w17, [x4, #0xb]
    ldrb     w17, [x3, #0xc]
    eor      w14, w17, w14
    strb     w14, [x4, #0xc]
    ldrb     w14, [x3, #0xd]
    mov      w17, #0x23
    eor      w14, w14, w17
    strb     w14, [x4, #0xd]
    ldrb     w14, [x3, #0xe]
    mov      w1, #0xd
    eor      w14, w14, w1
    strb     w14, [x4, #0xe]
    ldrb     w14, [x3, #0xf]
    eor      w14, w14, w0
    strb     w14, [x4, #0xf]
    ldrb     w14, [x3, #0x10]
    mov      w1, #0xeb
    eor      w14, w14, w1
    strb     w14, [x4, #0x10]
    ldrb     w14, [x3, #0x11]
    mov      w5, #0x43
    eor      w14, w14, w5
    strb     w14, [x4, #0x11]
    ldrb     w14, [x3, #0x12]
    mov      w5, #0xa0
    eor      w14, w14, w5
    strb     w14, [x4, #0x12]
    ldrb     w14, [x3, #0x13]
    mov      w6, #0xe5
    eor      w14, w14, w6
    strb     w14, [x4, #0x13]
    ldrb     w14, [x3, #0x14]
    mov      w7, #0x91
    eor      w14, w14, w7
    strb     w14, [x4, #0x14]
    ldrb     w14, [x3, #0x15]
    mov      w6, #0x68
    eor      w14, w14, w6
    strb     w14, [x4, #0x15]
    ldrb     w14, [x3, #0x16]
    mov      w6, #0x95
    eor      w14, w14, w6
    strb     w14, [x4, #0x16]
    ldrb     w14, [x3, #0x17]
    mov      w6, #0x25
    eor      w14, w14, w6
    strb     w14, [x4, #0x17]
    ldrb     w14, [x3, #0x18]
    mov      w22, #0x71
    eor      w14, w14, w22
    strb     w14, [x4, #0x18]
    ldrb     w6, [x3, #0x19]
    mov      w14, #0x7d
    eor      w6, w6, w14
    strb     w6, [x4, #0x19]
    mov      x30, x23
    ldrb     w23, [x3, #0x1a]
    mov      w6, #0x8e
    eor      w23, w23, w6
    strb     w23, [x4, #0x1a]
    ldrb     w23, [x3, #0x1b]
    eor      w23, w23, #0xffffffe1
    strb     w23, [x4, #0x1b]
    ldrb     w23, [x3, #0x1c]
    mov      w24, #0xc6
    eor      w23, w23, w24
    strb     w23, [x4, #0x1c]
    ldrb     w23, [x3, #0x1d]
    eor      w2, w23, w2
    strb     w2, [x4, #0x1d]
    ldrb     w2, [x3, #0x1e]
    mov      w24, #0x36
    eor      w2, w2, w24
    strb     w2, [x4, #0x1e]
    ldrb     w2, [x3, #0x1f]
    mov      w23, #0x53
    eor      w2, w2, w23
    strb     w2, [x4, #0x1f]
    ldrb     w2, [x3, #0x20]
    eor      w2, w2, w13
    strb     w2, [x4, #0x20]
    ldrb     w2, [x3, #0x21]
    eor      w2, w2, #0xffffffc3
    strb     w2, [x4, #0x21]
    ldrb     w2, [x3, #0x22]
    eor      w2, w2, w22
    strb     w2, [x4, #0x22]
    ldrb     w2, [x3, #0x23]
    mov      w23, #0xa7
    eor      w2, w2, w23
    strb     w2, [x4, #0x23]
    ldrb     w2, [x3, #0x24]
    mov      w22, #0x57
    eor      w2, w2, w22
    strb     w2, [x4, #0x24]
    ldrb     w22, [x3, #0x25]
    mov      w2, #0xa8
    eor      w22, w22, w2
    strb     w22, [x4, #0x25]
    ldrb     w22, [x3, #0x26]
    mov      w25, #5
    eor      w22, w22, w25
    strb     w22, [x4, #0x26]
    ldrb     w22, [x3, #0x27]
    eor      w22, w22, #0xffffffbf
    strb     w22, [x4, #0x27]
    ldrb     w22, [x3, #0x28]
    mov      w25, #0x4e
    eor      w22, w22, w25
    strb     w22, [x4, #0x28]
    ldrb     w22, [x3, #0x29]
    eor      w22, w22, w24
    strb     w22, [x4, #0x29]
    ldrb     w22, [x3, #0x2a]
    mov      w24, #0x9a
    eor      w22, w22, w24
    strb     w22, [x4, #0x2a]
    ldrb     w3, [x3, #0x2b]
    mov      w22, #0x6b
    eor      w3, w3, w22
    strb     w3, [x4, #0x2b]
    adrp     x25, #0x542000
    add      x25, x25, #0xa00
    ldrb     w3, [x25]
    eor      w3, w3, #0x88888888
    adrp     x26, #0x542000
    add      x26, x26, #0xa20
    strb     w3, [x26]
    ldrb     w4, [x25, #1]
    mov      w3, #0xe8
    eor      w4, w4, w3
    strb     w4, [x26, #1]
    ldrb     w4, [x25, #2]
    eor      w4, w4, #0x78
    strb     w4, [x26, #2]
    ldrb     w4, [x25, #3]
    mov      w22, #0xd2
    eor      w4, w4, w22
    strb     w4, [x26, #3]
    ldrb     w4, [x25, #4]
    mov      w27, #0x2b
    eor      w4, w4, w27
    strb     w4, [x26, #4]
    ldrb     w4, [x25, #5]
    mov      w27, #0x8c
    eor      w4, w4, w27
    strb     w4, [x26, #5]
    ldrb     w4, [x25, #6]
    eor      w4, w4, w5
    strb     w4, [x26, #6]
    ldrb     w4, [x25, #7]
    mov      w5, #0x5b
    eor      w4, w4, w5
    strb     w4, [x26, #7]
    ldrb     w5, [x25, #8]
    mov      w4, #0x1b
    eor      w5, w5, w4
    strb     w5, [x26, #8]
    ldrb     w5, [x25, #9]
    mov      w27, #0xe4
    eor      w5, w5, w27
    strb     w5, [x26, #9]
    ldrb     w27, [x25, #0xa]
    mov      w5, #0xa9
    eor      w27, w27, w5
    strb     w27, [x26, #0xa]
    ldrb     w27, [x25, #0xb]
    mov      w28, #0x7b
    eor      w27, w27, w28
    strb     w27, [x26, #0xb]
    ldrb     w27, [x25, #0xc]
    mov      w28, #0x41
    eor      w27, w27, w28
    strb     w27, [x26, #0xc]
    ldrb     w27, [x25, #0xd]
    eor      w27, w27, #0xffffffcf
    strb     w27, [x26, #0xd]
    ldrb     w27, [x25, #0xe]
    eor      w16, w27, w16
    strb     w16, [x26, #0xe]
    ldrb     w16, [x25, #0xf]
    eor      w16, w16, #0x7e
    strb     w16, [x26, #0xf]
    ldrb     w16, [x25, #0x10]
    eor      w16, w16, #0xcccccccc
    strb     w16, [x26, #0x10]
    adrp     x25, #0x542000
    add      x25, x25, #0xae8
    ldrb     w16, [x25]
    eor      w16, w16, w24
    adrp     x24, #0x542000
    add      x24, x24, #0xaf0
    strb     w16, [x24]
    ldrb     w16, [x25, #1]
    eor      w16, w16, w3
    strb     w16, [x24, #1]
    ldrb     w16, [x25, #2]
    eor      w16, w16, w0
    strb     w16, [x24, #2]
    ldrb     w16, [x25, #3]
    eor      w16, w16, w23
    strb     w16, [x24, #3]
    ldrb     w0, [x25, #4]
    mov      w16, #0x59
    eor      w0, w0, w16
    strb     w0, [x24, #4]
    ldrb     w0, [x25, #5]
    eor      w0, w0, w7
    strb     w0, [x24, #5]
    ldrb     w0, [x25, #6]
    mov      w7, #0x63
    eor      w0, w0, w7
    strb     w0, [x24, #6]
    ldrb     w0, [x25, #7]
    mov      w23, #0x82
    eor      w0, w0, w23
    strb     w0, [x24, #7]
    adrp     x23, #0x542000
    add      x23, x23, #0x9e4
    ldrb     w24, [x23]
    mov      w0, #0x47
    eor      w24, w24, w0
    adrp     x25, #0x542000
    add      x25, x25, #0x9ee
    strb     w24, [x25]
    ldrb     w24, [x23, #1]
    eor      w7, w24, w7
    strb     w7, [x25, #1]
    ldrb     w7, [x23, #2]
    eor      w11, w7, w11
    strb     w11, [x25, #2]
    ldrb     w11, [x23, #3]
    mov      w7, #0xda
    eor      w11, w11, w7
    strb     w11, [x25, #3]
    ldrb     w11, [x23, #4]
    mov      w7, #0x6e
    eor      w11, w11, w7
    strb     w11, [x25, #4]
    ldrb     w11, [x23, #5]
    mov      w7, #0xd3
    eor      w11, w11, w7
    strb     w11, [x25, #5]
    ldrb     w11, [x23, #6]
    eor      w11, w11, w6
    strb     w11, [x25, #6]
    ldrb     w11, [x23, #7]
    eor      w11, w11, #4
    strb     w11, [x25, #7]
    ldrb     w11, [x23, #8]
    eor      w10, w11, w10
    strb     w10, [x25, #8]
    ldrb     w10, [x23, #9]
    mov      x23, x30
    eor      w10, w10, w3
    strb     w10, [x25, #9]
    adrp     x10, #0x542000
    add      x10, x10, #0xa31
    ldrb     w11, [x10]
    mov      w6, #0x72
    adrp     x7, #0x542000
    add      x7, x7, #0xa38
    eor      w11, w11, w6
    strb     w11, [x7]
    ldrb     w11, [x10, #1]
    mov      w6, #0xab
    eor      w11, w11, w6
    strb     w11, [x7, #1]
    ldrb     w11, [x10, #2]
    mov      w6, #0xa2
    eor      w11, w11, w6
    strb     w11, [x7, #2]
    ldrb     w11, [x10, #3]
    eor      w11, w11, w1
    strb     w11, [x7, #3]
    ldrb     w11, [x10, #4]
    eor      w11, w11, w13
    strb     w11, [x7, #4]
    ldrb     w11, [x10, #5]
    eor      w11, w11, w22
    strb     w11, [x7, #5]
    ldrb     w10, [x10, #6]
    eor      w10, w10, #0x18
    strb     w10, [x7, #6]
    adrp     x10, #0x542000
    add      x10, x10, #0x9d0
    ldrb     w11, [x10]
    mov      w13, #0x5a
    eor      w11, w11, w13
    adrp     x13, #0x542000
    add      x13, x13, #0x9da
    strb     w11, [x13]
    ldrb     w11, [x10, #1]
    eor      w11, w11, w1
    strb     w11, [x13, #1]
    ldrb     w11, [x10, #2]
    eor      w11, w11, #0x44444444
    strb     w11, [x13, #2]
    ldrb     w11, [x10, #3]
    eor      w11, w11, #0x66666666
    strb     w11, [x13, #3]
    ldrb     w11, [x10, #4]
    mov      w1, #0x32
    eor      w11, w11, w1
    strb     w11, [x13, #4]
    ldrb     w11, [x10, #5]
    eor      w11, w11, w15
    strb     w11, [x13, #5]
    ldrb     w11, [x10, #6]
    mov      w15, #0x50
    eor      w11, w11, w15
    strb     w11, [x13, #6]
    ldrb     w11, [x10, #7]
    eor      w11, w11, #0x70
    strb     w11, [x13, #7]
    ldrb     w11, [x10, #8]
    eor      w11, w11, #0x1f
    strb     w11, [x13, #8]
    ldrb     w10, [x10, #9]
    eor      w10, w10, w17
    adrp     x11, #0x542000
    add      x11, x11, #0x9cc
    strb     w10, [x13, #9]
    ldrb     w10, [x11]
    mov      w13, #0xc9
    eor      w10, w10, w13
    adrp     x13, #0x542000
    add      x13, x13, #0x9ce
    strb     w10, [x13]
    ldrb     w10, [x11, #1]
    eor      w10, w10, #0xf
    strb     w10, [x13, #1]
    adrp     x10, #0x542000
    add      x10, x10, #0x990
    ldrb     w11, [x10]
    mov      w13, #0x35
    eor      w11, w11, w13
    adrp     x13, #0x542000
    add      x13, x13, #0x9a0
    strb     w11, [x13]
    ldrb     w11, [x10, #1]
    eor      w11, w11, w2
    strb     w11, [x13, #1]
    ldrb     w11, [x10, #2]
    mov      w15, #0x73
    eor      w11, w11, w15
    strb     w11, [x13, #2]
    ldrb     w11, [x10, #3]
    eor      w11, w11, #0xffffffe1
    strb     w11, [x13, #3]
    ldrb     w11, [x10, #4]
    eor      w11, w11, w0
    strb     w11, [x13, #4]
    ldrb     w11, [x10, #5]
    eor      w11, w11, w3
    strb     w11, [x13, #5]
    ldrb     w11, [x10, #6]
    mov      w15, #0xc4
    eor      w11, w11, w15
    strb     w11, [x13, #6]
    ldrb     w11, [x10, #7]
    eor      w11, w11, w12
    strb     w11, [x13, #7]
    ldrb     w11, [x10, #8]
    eor      w11, w11, #0x30
    strb     w11, [x13, #8]
    ldrb     w11, [x10, #9]
    eor      w11, w11, w5
    strb     w11, [x13, #9]
    ldrb     w11, [x10, #0xa]
    eor      w11, w11, w4
    strb     w11, [x13, #0xa]
    ldrb     w11, [x10, #0xb]
    eor      w11, w11, w2
    strb     w11, [x13, #0xb]
    ldrb     w11, [x10, #0xc]
    mov      w12, #0x26
    eor      w11, w11, w12
    strb     w11, [x13, #0xc]
    ldrb     w11, [x10, #0xd]
    eor      w11, w11, w16
    strb     w11, [x13, #0xd]
    ldrb     w11, [x10, #0xe]
    eor      w11, w11, #0xfffffff9
    strb     w11, [x13, #0xe]
    ldrb     w10, [x10, #0xf]
    eor      w9, w10, w9
    strb     w9, [x13, #0xf]
    adrp     x9, #0x542000
    add      x9, x9, #0x9c6
    ldrb     w10, [x9]
    mov      w11, #0xd4
    adrp     x13, #0x542000
    add      x13, x13, #0x9c9
    eor      w10, w10, w11
    strb     w10, [x13]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x66666666
    strb     w10, [x13, #1]
    ldrb     w9, [x9, #2]
    eor      w9, w9, w12
    strb     w9, [x13, #2]
    adrp     x9, #0x542000
    add      x9, x9, #0x9b0
    ldrb     w10, [x9]
    eor      w10, w10, #0x38
    adrp     x11, #0x542000
    add      x11, x11, #0x9bb
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x89
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xe
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0x99999999
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0xc2
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x4c
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    eor      w10, w10, w14
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    eor      w10, w10, #0xfc
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    eor      w10, w10, #0x99999999
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    eor      w10, w10, #0x10
    strb     w10, [x11, #9]
    ldrb     w9, [x9, #0xa]
    eor      w9, w9, #0x10
    strb     w9, [x11, #0xa]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x28, sp, #0x40
    mov      sp, x28
    sub      x27, sp, #0x10
    mov      sp, x27
    sub      x26, sp, #0x10
    mov      sp, x26
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x338]
    mov      x0, x19
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2f4294
    mov      x0, x20
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0x20
    b.ne     #0x2f4294
    mov      x0, x21
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0x18
    b.ne     #0x2f4294
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2e8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xab8]
    stur     x1, [x29, #-0x88]
    mov      x2, x19
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
    stur     x1, [x29, #-0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x22
    stur     x1, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    stur     x22, [x29, #-0x78]
    csel     x24, x22, xzr, ne
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    stur     x24, [x29, #-0x70]
    cbz      x24, #0x2f4308
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x528]
    adrp     x2, #0x542000
    add      x2, x2, #0xbe0
    mov      x0, x24
    stur     x1, [x29, #-0x80]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4e8]
    stur     x1, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #2
    b.ne     #0x2f4300
    stur     x23, [x29, #-0xa8]
    adrp     x2, #0x542000
    add      x2, x2, #0xe20
    mov      x0, x24
    ldur     x1, [x29, #-0x80]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x910]
    adrp     x2, #0x542000
    add      x2, x2, #0xc20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x2f42f8
    adrp     x2, #0x542000
    add      x2, x2, #0xe60
    ldur     x0, [x29, #-0x70]
    ldur     x1, [x29, #-0x80]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x2, #0x542000
    add      x2, x2, #0xda0
    stur     x0, [x29, #-0xb0]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x2f42f0
    adrp     x2, #0x542000
    add      x2, x2, #0xc60
    ldur     x0, [x29, #-0x70]
    ldur     x1, [x29, #-0x80]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb8]
    mov      x0, x21
    bl       #0x2f2e10
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    ldur     x0, [x29, #-0xb8]
    mov      x1, x23
    mov      x23, x2
    bl       #0x461c6c // _objc_msgSend
    stur     w0, [x29, #-0xc0]
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     w8, [x29, #-0xc0]
    cbz      w8, #0x2f4308
    adrp     x2, #0x542000
    add      x2, x2, #0xd60
    ldur     x22, [x29, #-0x70]
    mov      x0, x22
    ldur     x24, [x29, #-0x80]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldur     x1, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xb0]
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x542000
    add      x2, x2, #0xde0
    mov      x0, x22
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldur     x1, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1d0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x778]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x998]
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldur     x2, [x29, #-0xb0]
    mov      x23, #0
    sub      x8, x24, x2
    cmp      x8, #0x1e
    b.ne     #0x2f430c
    fcvtms   x8, d8
    add      x9, x8, #5
    cmp      x2, x9
    b.gt     #0x2f430c
    add      x9, x24, #5
    cmp      x9, x8
    b.lt     #0x2f430c
    adrp     x8, #0x542000
    add      x9, x8, #0xce0
    adrp     x8, #0x542000
    add      x8, x8, #0xc20
    stp      x9, x8, [x28]
    adrp     x8, #0x542000
    add      x8, x8, #0xda0
    str      x8, [x28, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x4f0]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb0]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x5b0]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb8]
    str      x0, [x28, #0x18]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    mov      x1, x23
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xc0]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xc8]
    str      x0, [x28, #0x20]
    adrp     x2, #0x542000
    add      x2, x2, #0xc60
    ldur     x22, [x29, #-0x70]
    mov      x0, x22
    ldur     x23, [x29, #-0x80]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xd0]
    str      x0, [x28, #0x28]
    adrp     x2, #0x542000
    add      x2, x2, #0xca0
    mov      x0, x22
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xd8]
    str      x0, [x28, #0x30]
    adrp     x2, #0x542000
    add      x2, x2, #0xd20
    mov      x0, x22
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    str      x0, [x28, #0x38]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    mov      x2, x28
    mov      w3, #8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xa68]
    adrp     x2, #0x542000
    add      x2, x2, #0xba0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xa0]
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xd8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xd0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xc8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xc0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x542000
    add      x2, x2, #0xb60
    mov      x0, x22
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x2f4364
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x6c0]
    ldur     x0, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2f4320
    mov      x22, x0
    mov      x0, x28
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2f4320
    str      xzr, [x27]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x6b8]
    ldr      x24, [x8]
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0xa38]
    ldur     x0, [x29, #-0xa0]
    mov      x1, x23
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x22
    mov      x1, x24
    mov      x3, x28
    mov      x4, x27
    bl       #0x4617ec // _SecKeyVerifySignature
    mov      x22, x0
    ldr      x0, [x27]
    cbz      x0, #0x2f40e4
    bl       #0x461510 // _CFRelease
    cbz      w22, #0x2f4320
    mov      x0, x21
    mov      x1, x20
    bl       #0x2f3020
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x0, #0x542000
    add      x0, x0, #0xb20
    mov      x1, x23
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x360]
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      w8, #1
    strb     w8, [x26]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xad8]
    mov      x0, x27
    mov      x2, x26
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    stp      x27, x22, [x29, #-0xb0]
    mov      x0, x22
    mov      x1, x27
    bl       #0x2f3020
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x2, #0x542000
    add      x2, x2, #0xd20
    ldur     x27, [x29, #-0x70]
    mov      x0, x27
    ldur     x26, [x29, #-0x80]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    bl       #0x2f4364
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x2, #0x542000
    add      x2, x2, #0xca0
    mov      x0, x27
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    bl       #0x2f4364
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x22
    stur     x24, [x29, #-0x80]
    mov      x1, x24
    mov      x2, x27
    mov      w3, #1
    bl       #0x2f2c2c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2f4328
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2e8]
    ldur     x1, [x29, #-0x88]
    mov      x2, x24
    mov      x3, #0
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    ldur     x1, [x29, #-0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x22
    ldur     x1, [x29, #-0x98]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    csel     x23, x22, xzr, ne
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    b        #0x2f432c
    mov      x23, #0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x68]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2f4360
    mov      x0, x23
    sub      sp, x29, #0x60
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    ldp      d9, d8, [sp], #0x70
    b        #0x461be8 // _objc_autoreleaseReturnValue
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x23, #0
    ldur     x0, [x29, #-0x70]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x78]
    bl       #0x461c9c // _objc_release
    b        #0x2f4298
    mov      x23, #0
    b        #0x2f434c
    mov      x23, #0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa8]
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c9c // _objc_release
    b        #0x2f430c
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGGlassStore postPath:payload:completion:] IMP=0x2F45B4 bounds=0x2F45B4-0x2F4FAC
loc_2F45B4:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x20, x4
    mov      x22, x3
    mov      x19, x2
    mov      x21, x0
    adrp     x8, #0x580000
    add      x8, x8, #0x638
    ldar     w9, [x8]
    cbnz     w9, #0x2f4c9c
    adrp     x9, #0x543000
    add      x9, x9, #0xd6
    ldrh     w10, [x9]
    mov      w11, #0x4dbb
    eor      w10, w10, w11
    adrp     x11, #0x543000
    add      x11, x11, #0xe0
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x154
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x5e38
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xc0ee
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x59b9
    eor      w9, w9, w10
    adrp     x17, #0x543000
    add      x17, x17, #0x50
    strh     w9, [x11, #8]
    ldrb     w9, [x17]
    mov      w10, #0xfa
    eor      w9, w9, w10
    adrp     x0, #0x543000
    add      x0, x0, #0x70
    strb     w9, [x0]
    ldrb     w9, [x17, #1]
    mov      w10, #0xad
    eor      w9, w9, w10
    strb     w9, [x0, #1]
    ldrb     w9, [x17, #2]
    eor      w9, w9, #0xffffffe3
    strb     w9, [x0, #2]
    ldrb     w10, [x17, #3]
    mov      w9, #0x29
    eor      w10, w10, w9
    strb     w10, [x0, #3]
    ldrb     w10, [x17, #4]
    eor      w10, w10, #6
    strb     w10, [x0, #4]
    ldrb     w10, [x17, #5]
    mov      w11, #0x89
    eor      w10, w10, w11
    strb     w10, [x0, #5]
    ldrb     w10, [x17, #6]
    mov      w16, #0x6f
    eor      w10, w10, w16
    strb     w10, [x0, #6]
    ldrb     w10, [x17, #7]
    eor      w10, w10, #0xfffffff1
    strb     w10, [x0, #7]
    ldrb     w10, [x17, #8]
    mov      w12, #0x97
    eor      w10, w10, w12
    strb     w10, [x0, #8]
    ldrb     w10, [x17, #9]
    mov      w15, #0x28
    eor      w10, w10, w15
    strb     w10, [x0, #9]
    ldrb     w10, [x17, #0xa]
    mov      w11, #0x13
    eor      w10, w10, w11
    strb     w10, [x0, #0xa]
    ldrb     w10, [x17, #0xb]
    mov      w11, #0xb7
    eor      w10, w10, w11
    strb     w10, [x0, #0xb]
    ldrb     w10, [x17, #0xc]
    mov      w11, #0x85
    eor      w10, w10, w11
    strb     w10, [x0, #0xc]
    ldrb     w10, [x17, #0xd]
    mov      w13, #0xb9
    eor      w10, w10, w13
    strb     w10, [x0, #0xd]
    ldrb     w10, [x17, #0xe]
    mov      w14, #0x1d
    eor      w10, w10, w14
    strb     w10, [x0, #0xe]
    ldrb     w1, [x17, #0xf]
    mov      w10, #0xa6
    eor      w1, w1, w10
    strb     w1, [x0, #0xf]
    ldrb     w17, [x17, #0x10]
    eor      w17, w17, #0xe0
    strb     w17, [x0, #0x10]
    adrp     x17, #0x543000
    add      x17, x17, #0x93
    ldrb     w0, [x17]
    adrp     x1, #0x543000
    add      x1, x1, #0x98
    eor      w0, w0, #0xbbbbbbbb
    strb     w0, [x1]
    ldrb     w0, [x17, #1]
    mov      w2, #0x96
    eor      w0, w0, w2
    strb     w0, [x1, #1]
    ldrb     w0, [x17, #2]
    eor      w0, w0, #0x77777777
    strb     w0, [x1, #2]
    ldrb     w0, [x17, #3]
    mov      w2, #0xb1
    eor      w0, w0, w2
    strb     w0, [x1, #3]
    ldrb     w17, [x17, #4]
    mov      w0, #0xa0
    eor      w17, w17, w0
    adrp     x2, #0x543000
    add      x2, x2, #0x2e
    strb     w17, [x1, #4]
    ldrb     w17, [x2]
    mov      w0, #0x84
    eor      w17, w17, w0
    adrp     x3, #0x543000
    add      x3, x3, #0x3b
    strb     w17, [x3]
    ldrb     w17, [x2, #1]
    mov      w0, #0x65
    eor      w17, w17, w0
    strb     w17, [x3, #1]
    ldrb     w17, [x2, #2]
    eor      w17, w17, #0x7f
    strb     w17, [x3, #2]
    ldrb     w17, [x2, #3]
    eor      w17, w17, #0xcccccccc
    strb     w17, [x3, #3]
    ldrb     w17, [x2, #4]
    mov      w0, #0xd9
    eor      w17, w17, w0
    strb     w17, [x3, #4]
    ldrb     w17, [x2, #5]
    mov      w1, #0xa8
    eor      w17, w17, w1
    strb     w17, [x3, #5]
    ldrb     w17, [x2, #6]
    mov      w0, #0x2d
    eor      w17, w17, w0
    strb     w17, [x3, #6]
    ldrb     w17, [x2, #7]
    eor      w17, w17, #0xffffffcf
    strb     w17, [x3, #7]
    ldrb     w17, [x2, #8]
    eor      w15, w17, w15
    strb     w15, [x3, #8]
    ldrb     w15, [x2, #9]
    eor      w15, w15, #4
    strb     w15, [x3, #9]
    ldrb     w15, [x2, #0xa]
    mov      w0, #0xec
    eor      w15, w15, w0
    strb     w15, [x3, #0xa]
    ldrb     w15, [x2, #0xb]
    eor      w15, w15, #0x20
    strb     w15, [x3, #0xb]
    ldrb     w15, [x2, #0xc]
    eor      w15, w15, #0xfffffff9
    strb     w15, [x3, #0xc]
    adrp     x15, #0x543000
    add      x15, x15, #0x20
    ldrb     w17, [x15]
    mov      w2, #0x8c
    adrp     x3, #0x543000
    add      x3, x3, #0x27
    eor      w17, w17, w2
    strb     w17, [x3]
    ldrb     w17, [x15, #1]
    eor      w17, w17, #0xf8
    strb     w17, [x3, #1]
    ldrb     w17, [x15, #2]
    eor      w17, w17, #3
    strb     w17, [x3, #2]
    ldrb     w17, [x15, #3]
    eor      w17, w17, #0xfffffffb
    strb     w17, [x3, #3]
    ldrb     w17, [x15, #4]
    mov      w2, #0x43
    eor      w17, w17, w2
    strb     w17, [x3, #4]
    ldrb     w17, [x15, #5]
    mov      w2, #0x7b
    eor      w17, w17, w2
    strb     w17, [x3, #5]
    ldrb     w15, [x15, #6]
    mov      w17, #0x6c
    eor      w15, w15, w17
    adrp     x2, #0x543000
    add      x2, x2, #0
    strb     w15, [x3, #6]
    ldrb     w15, [x2]
    eor      w15, w15, #0x44444444
    adrp     x3, #0x543000
    add      x3, x3, #0x10
    strb     w15, [x3]
    ldrb     w15, [x2, #1]
    eor      w15, w15, #0x80
    strb     w15, [x3, #1]
    ldrb     w15, [x2, #2]
    mov      w4, #0x4a
    eor      w15, w15, w4
    strb     w15, [x3, #2]
    ldrb     w4, [x2, #3]
    mov      w15, #0xf5
    eor      w4, w4, w15
    strb     w4, [x3, #3]
    ldrb     w4, [x2, #4]
    mov      w5, #0x4c
    eor      w4, w4, w5
    strb     w4, [x3, #4]
    ldrb     w4, [x2, #5]
    mov      w5, #0x5f
    eor      w4, w4, w5
    strb     w4, [x3, #5]
    ldrb     w4, [x2, #6]
    mov      w5, #0x9c
    eor      w4, w4, w5
    strb     w4, [x3, #6]
    ldrb     w4, [x2, #7]
    eor      w4, w4, #0x33333333
    strb     w4, [x3, #7]
    ldrb     w4, [x2, #8]
    eor      w16, w4, w16
    strb     w16, [x3, #8]
    ldrb     w16, [x2, #9]
    eor      w16, w16, #0xffffff83
    strb     w16, [x3, #9]
    ldrb     w16, [x2, #0xa]
    eor      w16, w16, #6
    strb     w16, [x3, #0xa]
    ldrb     w4, [x2, #0xb]
    mov      w16, #0xae
    eor      w4, w4, w16
    strb     w4, [x3, #0xb]
    ldrb     w4, [x2, #0xc]
    mov      w5, #0x8a
    eor      w4, w4, w5
    strb     w4, [x3, #0xc]
    ldrb     w4, [x2, #0xd]
    mov      w5, #0x23
    eor      w4, w4, w5
    strb     w4, [x3, #0xd]
    ldrb     w4, [x2, #0xe]
    mov      w5, #0xb6
    eor      w4, w4, w5
    strb     w4, [x3, #0xe]
    ldrb     w2, [x2, #0xf]
    eor      w1, w2, w1
    strb     w1, [x3, #0xf]
    adrp     x1, #0x543000
    add      x1, x1, #0x81
    ldrb     w2, [x1]
    eor      w2, w2, #0xc
    adrp     x3, #0x543000
    add      x3, x3, #0x8a
    strb     w2, [x3]
    ldrb     w2, [x1, #1]
    mvn      w2, w2
    strb     w2, [x3, #1]
    ldrb     w2, [x1, #2]
    mov      w4, #0x31
    eor      w2, w2, w4
    strb     w2, [x3, #2]
    ldrb     w2, [x1, #3]
    eor      w2, w2, #2
    strb     w2, [x3, #3]
    ldrb     w2, [x1, #4]
    eor      w14, w2, w14
    strb     w14, [x3, #4]
    ldrb     w14, [x1, #5]
    eor      w14, w14, #0x80
    strb     w14, [x3, #5]
    ldrb     w14, [x1, #6]
    mov      w2, #0x8e
    eor      w14, w14, w2
    strb     w14, [x3, #6]
    ldrb     w14, [x1, #7]
    eor      w14, w14, #0x66666666
    strb     w14, [x3, #7]
    ldrb     w1, [x1, #8]
    mov      w14, #0xcb
    eor      w1, w1, w14
    strb     w1, [x3, #8]
    adrp     x1, #0x542000
    add      x1, x1, #0xffc
    ldrb     w2, [x1]
    mov      w3, #0x14
    eor      w2, w2, w3
    adrp     x3, #0x542000
    add      x3, x3, #0xffe
    strb     w2, [x3]
    ldrb     w1, [x1, #1]
    mov      w2, #0x32
    eor      w1, w1, w2
    strb     w1, [x3, #1]
    adrp     x1, #0x543000
    add      x1, x1, #0xa0
    ldrb     w2, [x1]
    mov      w3, #0x2a
    eor      w3, w2, w3
    adrp     x2, #0x543000
    add      x2, x2, #0xc0
    strb     w3, [x2]
    ldrb     w3, [x1, #1]
    eor      w3, w3, #0x7f
    strb     w3, [x2, #1]
    ldrb     w3, [x1, #2]
    eor      w13, w3, w13
    strb     w13, [x2, #2]
    ldrb     w13, [x1, #3]
    eor      w13, w13, w0
    strb     w13, [x2, #3]
    ldrb     w13, [x1, #4]
    mov      w0, #0xc4
    eor      w13, w13, w0
    strb     w13, [x2, #4]
    ldrb     w13, [x1, #5]
    mov      w0, #0x37
    eor      w13, w13, w0
    strb     w13, [x2, #5]
    ldrb     w13, [x1, #6]
    mov      w0, #0xc2
    eor      w13, w13, w0
    strb     w13, [x2, #6]
    ldrb     w13, [x1, #7]
    eor      w13, w13, w16
    strb     w13, [x2, #7]
    ldrb     w13, [x1, #8]
    eor      w13, w13, #0xffffffe3
    strb     w13, [x2, #8]
    ldrb     w13, [x1, #9]
    eor      w12, w13, w12
    strb     w12, [x2, #9]
    ldrb     w12, [x1, #0xa]
    eor      w12, w12, #0xcccccccc
    strb     w12, [x2, #0xa]
    ldrb     w12, [x1, #0xb]
    mov      w13, #0x76
    eor      w12, w12, w13
    strb     w12, [x2, #0xb]
    ldrb     w12, [x1, #0xc]
    eor      w12, w12, #0x70
    strb     w12, [x2, #0xc]
    ldrb     w12, [x1, #0xd]
    mov      w13, #0x21
    eor      w12, w12, w13
    strb     w12, [x2, #0xd]
    ldrb     w12, [x1, #0xe]
    mov      w16, #0x58
    eor      w12, w12, w16
    strb     w12, [x2, #0xe]
    ldrb     w12, [x1, #0xf]
    mov      w0, #0x5e
    eor      w12, w12, w0
    strb     w12, [x2, #0xf]
    ldrb     w12, [x1, #0x10]
    eor      w12, w12, w17
    strb     w12, [x2, #0x10]
    ldrb     w12, [x1, #0x11]
    mov      w17, #0xa4
    eor      w12, w12, w17
    strb     w12, [x2, #0x11]
    ldrb     w12, [x1, #0x12]
    eor      w12, w12, #0xbbbbbbbb
    strb     w12, [x2, #0x12]
    ldrb     w12, [x1, #0x13]
    eor      w9, w12, w9
    strb     w9, [x2, #0x13]
    ldrb     w9, [x1, #0x14]
    eor      w9, w9, w11
    strb     w9, [x2, #0x14]
    adrp     x9, #0x542000
    add      x9, x9, #0xfe0
    ldrb     w11, [x9]
    eor      w11, w11, w13
    adrp     x12, #0x542000
    add      x12, x12, #0xfee
    strb     w11, [x12]
    ldrb     w11, [x9, #1]
    mov      w13, #0xf6
    eor      w11, w11, w13
    strb     w11, [x12, #1]
    ldrb     w11, [x9, #2]
    eor      w11, w11, w16
    strb     w11, [x12, #2]
    ldrb     w11, [x9, #3]
    mov      w13, #0x16
    eor      w11, w11, w13
    strb     w11, [x12, #3]
    ldrb     w11, [x9, #4]
    eor      w11, w11, w15
    strb     w11, [x12, #4]
    ldrb     w11, [x9, #5]
    eor      w11, w11, w14
    strb     w11, [x12, #5]
    ldrb     w11, [x9, #6]
    eor      w11, w11, #0xfffffffb
    strb     w11, [x12, #6]
    ldrb     w11, [x9, #7]
    mov      w13, #0x91
    eor      w11, w11, w13
    strb     w11, [x12, #7]
    ldrb     w11, [x9, #8]
    mov      w13, #0xe6
    eor      w11, w11, w13
    strb     w11, [x12, #8]
    ldrb     w11, [x9, #9]
    eor      w10, w11, w10
    strb     w10, [x12, #9]
    ldrb     w10, [x9, #0xa]
    eor      w10, w10, #0x3c
    strb     w10, [x12, #0xa]
    ldrb     w10, [x9, #0xb]
    eor      w10, w10, w14
    strb     w10, [x12, #0xb]
    ldrb     w10, [x9, #0xc]
    mov      w11, #0x9d
    eor      w10, w10, w11
    strb     w10, [x12, #0xc]
    ldrb     w9, [x9, #0xd]
    mov      w10, #0x2b
    eor      w9, w9, w10
    strb     w9, [x12, #0xd]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x26, sp
    sub      x24, x26, #0x10
    mov      sp, x24
    mov      x27, sp
    sub      x25, x27, #0x10
    mov      sp, x25
    sub      x23, sp, #0x40
    mov      sp, x23
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    stur     xzr, [x26, #-0x10]
    stur     xzr, [x27, #-0x10]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x6c8]
    mov      x0, x21
    mov      x2, x22
    mov      x3, x24
    mov      x4, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldur     x22, [x26, #-0x10]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    ldur     x25, [x27, #-0x10]
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    cbz      x24, #0x2f4f4c
    adrp     x8, #0x4c4000
    ldr      x26, [x8, #0x2c8]
    adrp     x8, #0x4c4000
    ldr      x27, [x8, #0x2c0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x550]
    adrp     x0, #0x543000
    add      x0, x0, #0x2d0
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9a0]
    mov      x0, x27
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x638]
    mov      x0, x26
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x6d0]
    mov      x0, x26
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9b0]
    adrp     x2, #0x543000
    add      x2, x2, #0x210
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x27, [x8, #0x9c0]
    adrp     x28, #0x543000
    add      x28, x28, #0x250
    adrp     x3, #0x543000
    add      x3, x3, #0x310
    mov      x0, x26
    mov      x1, x27
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    adrp     x3, #0x543000
    add      x3, x3, #0x290
    mov      x0, x26
    mov      x1, x27
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    adrp     x2, #0x543000
    add      x2, x2, #0x190
    adrp     x3, #0x543000
    add      x3, x3, #0x1d0
    mov      x0, x26
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    adrp     x2, #0x543000
    add      x2, x2, #0x150
    adrp     x3, #0x543000
    add      x3, x3, #0x110
    mov      x0, x26
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9b8]
    mov      x0, x26
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x640]
    fmov     d0, #20.00000000
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2d0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9c8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x23]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x23, #8]
    adrp     x8, #0x2f4000
    add      x8, x8, #0xfac
    adrp     x9, #0x4a4000
    add      x9, x9, #0x4f8
    stp      x8, x9, [x23, #0x10]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    str      x20, [x23, #0x38]
    str      x21, [x23, #0x20]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    str      x22, [x23, #0x28]
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    str      x25, [x23, #0x30]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9d0]
    mov      x0, x27
    mov      x2, x26
    mov      x3, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9d8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, #0x38]
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    b        #0x2f4f64
    ldr      x8, [x20, #0x10]
    adrp     x2, #0x543000
    add      x2, x2, #0x350
    mov      x0, x20
    mov      x1, #0
    blr      x8
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x22
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

// -[WCLGGlassStore themeFromDict:] IMP=0x2F52D8 bounds=0x2F52D8-0x2F63FC
loc_2F52D8:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x40
    mov      x20, x2
    stur     x0, [x29, #-0x70]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x580000
    add      x8, x8, #0x658
    ldar     w9, [x8]
    cbnz     w9, #0x2f5d48
    adrp     x10, #0x543000
    add      x10, x10, #0x53e
    ldrb     w9, [x10]
    mov      w16, #0xb0
    eor      w9, w9, w16
    adrp     x11, #0x543000
    add      x11, x11, #0x548
    strb     w9, [x11]
    ldrb     w9, [x10, #1]
    mov      w12, #0x8b
    eor      w9, w9, w12
    strb     w9, [x11, #1]
    ldrb     w12, [x10, #2]
    mov      w9, #0x84
    eor      w12, w12, w9
    strb     w12, [x11, #2]
    ldrb     w12, [x10, #3]
    mov      w13, #0x23
    eor      w12, w12, w13
    strb     w12, [x11, #3]
    ldrb     w12, [x10, #4]
    eor      w12, w12, #0x7f
    strb     w12, [x11, #4]
    ldrb     w12, [x10, #5]
    eor      w12, w12, #0xfc
    strb     w12, [x11, #5]
    ldrb     w12, [x10, #6]
    eor      w12, w12, #0x7c
    strb     w12, [x11, #6]
    ldrb     w12, [x10, #7]
    mov      w0, #0xa
    eor      w12, w12, w0
    strb     w12, [x11, #7]
    ldrb     w12, [x10, #8]
    eor      w12, w12, #0xe0
    strb     w12, [x11, #8]
    ldrb     w12, [x10, #9]
    mov      w10, #0xb
    eor      w12, w12, w10
    strb     w12, [x11, #9]
    adrp     x13, #0x543000
    add      x13, x13, #0x52c
    ldrb     w11, [x13]
    mov      w12, #9
    eor      w11, w11, w12
    adrp     x15, #0x543000
    add      x15, x15, #0x535
    strb     w11, [x15]
    ldrb     w11, [x13, #1]
    mov      w14, #0xac
    eor      w11, w11, w14
    strb     w11, [x15, #1]
    ldrb     w11, [x13, #2]
    mov      w12, #0xb7
    eor      w11, w11, w12
    strb     w11, [x15, #2]
    ldrb     w11, [x13, #3]
    mov      w12, #0xed
    eor      w11, w11, w12
    strb     w11, [x15, #3]
    ldrb     w17, [x13, #4]
    mov      w11, #0x29
    eor      w17, w17, w11
    strb     w17, [x15, #4]
    ldrb     w17, [x13, #5]
    eor      w17, w17, #0xffffffe1
    strb     w17, [x15, #5]
    ldrb     w17, [x13, #6]
    eor      w17, w17, #0x66666666
    strb     w17, [x15, #6]
    ldrb     w17, [x13, #7]
    eor      w17, w17, #0x80
    strb     w17, [x15, #7]
    ldrb     w13, [x13, #8]
    eor      w13, w13, #0xfffffff7
    strb     w13, [x15, #8]
    adrp     x13, #0x543000
    add      x13, x13, #0x522
    ldrb     w15, [x13]
    mov      w17, #0xb6
    eor      w15, w15, w17
    adrp     x17, #0x543000
    add      x17, x17, #0x527
    strb     w15, [x17]
    ldrb     w15, [x13, #1]
    mov      w1, #0x9d
    eor      w15, w15, w1
    strb     w15, [x17, #1]
    ldrb     w15, [x13, #2]
    mov      w1, #0xae
    eor      w15, w15, w1
    strb     w15, [x17, #2]
    ldrb     w15, [x13, #3]
    mov      w2, #0x91
    eor      w15, w15, w2
    strb     w15, [x17, #3]
    ldrb     w13, [x13, #4]
    mov      w15, #0x8e
    eor      w13, w13, w15
    strb     w13, [x17, #4]
    adrp     x13, #0x543000
    add      x13, x13, #0x510
    ldrb     w15, [x13]
    eor      w15, w15, #0xffffffbf
    adrp     x17, #0x543000
    add      x17, x17, #0x519
    strb     w15, [x17]
    ldrb     w15, [x13, #1]
    eor      w15, w15, #0x10
    strb     w15, [x17, #1]
    ldrb     w1, [x13, #2]
    mov      w15, #0x61
    eor      w1, w1, w15
    strb     w1, [x17, #2]
    ldrb     w1, [x13, #3]
    eor      w1, w1, #0xffffffe3
    strb     w1, [x17, #3]
    ldrb     w1, [x13, #4]
    eor      w1, w1, #0xe
    strb     w1, [x17, #4]
    ldrb     w1, [x13, #5]
    mov      w3, #0xc9
    eor      w1, w1, w3
    strb     w1, [x17, #5]
    ldrb     w1, [x13, #6]
    eor      w1, w1, #0x70
    strb     w1, [x17, #6]
    ldrb     w1, [x13, #7]
    eor      w1, w1, #0xfffffff9
    strb     w1, [x17, #7]
    ldrb     w13, [x13, #8]
    mov      w3, #0x72
    eor      w13, w13, w3
    strb     w13, [x17, #8]
    adrp     x13, #0x543000
    add      x13, x13, #0x4fc
    ldrb     w17, [x13]
    eor      w17, w17, #0x1f
    adrp     x4, #0x543000
    add      x4, x4, #0x506
    strb     w17, [x4]
    ldrb     w17, [x13, #1]
    mov      w1, #0x13
    eor      w17, w17, w1
    strb     w17, [x4, #1]
    ldrb     w17, [x13, #2]
    eor      w17, w17, #0xf8
    strb     w17, [x4, #2]
    ldrb     w17, [x13, #3]
    eor      w17, w17, #0xffffff9f
    strb     w17, [x4, #3]
    ldrb     w17, [x13, #4]
    mov      w5, #0xc2
    eor      w17, w17, w5
    strb     w17, [x4, #4]
    ldrb     w17, [x13, #5]
    mov      w5, #0xec
    eor      w17, w17, w5
    strb     w17, [x4, #5]
    ldrb     w5, [x13, #6]
    mov      w17, #0x4e
    eor      w5, w5, w17
    strb     w5, [x4, #6]
    ldrb     w5, [x13, #7]
    mov      w6, #0x16
    eor      w5, w5, w6
    strb     w5, [x4, #7]
    ldrb     w5, [x13, #8]
    eor      w5, w5, #0xdddddddd
    strb     w5, [x4, #8]
    ldrb     w5, [x13, #9]
    mov      w13, #0x74
    eor      w5, w5, w13
    strb     w5, [x4, #9]
    adrp     x5, #0x543000
    add      x5, x5, #0x4aa
    ldrb     w4, [x5]
    mov      w6, #0xb2
    eor      w4, w4, w6
    adrp     x6, #0x543000
    add      x6, x6, #0x4b7
    strb     w4, [x6]
    ldrb     w7, [x5, #1]
    mov      w4, #0x2a
    eor      w7, w7, w4
    strb     w7, [x6, #1]
    ldrb     w7, [x5, #2]
    eor      w7, w7, #0x33333333
    strb     w7, [x6, #2]
    ldrb     w7, [x5, #3]
    mov      w19, #0x97
    eor      w7, w7, w19
    strb     w7, [x6, #3]
    ldrb     w7, [x5, #4]
    eor      w14, w7, w14
    strb     w14, [x6, #4]
    ldrb     w14, [x5, #5]
    eor      w14, w14, #0x22222222
    strb     w14, [x6, #5]
    ldrb     w14, [x5, #6]
    eor      w14, w14, #0x1f
    strb     w14, [x6, #6]
    ldrb     w14, [x5, #7]
    eor      w14, w14, w15
    strb     w14, [x6, #7]
    ldrb     w14, [x5, #8]
    mov      w15, #0x36
    eor      w14, w14, w15
    strb     w14, [x6, #8]
    ldrb     w14, [x5, #9]
    mov      w15, #0xad
    eor      w14, w14, w15
    strb     w14, [x6, #9]
    ldrb     w14, [x5, #0xa]
    eor      w14, w14, #0x1c
    strb     w14, [x6, #0xa]
    ldrb     w14, [x5, #0xb]
    mov      w15, #0xcb
    eor      w14, w14, w15
    strb     w14, [x6, #0xb]
    ldrb     w14, [x5, #0xc]
    eor      w14, w14, #0xffffffef
    adrp     x5, #0x543000
    add      x5, x5, #0x4dc
    strb     w14, [x6, #0xc]
    ldrb     w6, [x5]
    mov      w14, #0x54
    eor      w6, w6, w14
    adrp     x7, #0x543000
    add      x7, x7, #0x4e1
    strb     w6, [x7]
    ldrb     w6, [x5, #1]
    mov      w19, #0x62
    eor      w6, w6, w19
    strb     w6, [x7, #1]
    ldrb     w6, [x5, #2]
    mov      w19, #0x68
    eor      w6, w6, w19
    strb     w6, [x7, #2]
    ldrb     w6, [x5, #3]
    mov      w19, #0xb8
    eor      w6, w6, w19
    strb     w6, [x7, #3]
    ldrb     w5, [x5, #4]
    eor      w4, w5, w4
    strb     w4, [x7, #4]
    adrp     x4, #0x543000
    add      x4, x4, #0x56a
    ldrb     w5, [x4]
    mov      w6, #0xd7
    eor      w5, w5, w6
    adrp     x6, #0x543000
    add      x6, x6, #0x573
    strb     w5, [x6]
    ldrb     w5, [x4, #1]
    eor      w5, w5, #0x3c
    strb     w5, [x6, #1]
    ldrb     w5, [x4, #2]
    eor      w3, w5, w3
    strb     w3, [x6, #2]
    ldrb     w3, [x4, #3]
    mov      w5, #0x5b
    eor      w3, w3, w5
    strb     w3, [x6, #3]
    ldrb     w3, [x4, #4]
    mov      w5, #0x17
    eor      w3, w3, w5
    strb     w3, [x6, #4]
    ldrb     w3, [x4, #5]
    mov      w5, #0x57
    eor      w3, w3, w5
    strb     w3, [x6, #5]
    ldrb     w3, [x4, #6]
    eor      w3, w3, #0x22222222
    strb     w3, [x6, #6]
    ldrb     w3, [x4, #7]
    mov      w5, #0xc8
    eor      w3, w3, w5
    strb     w3, [x6, #7]
    ldrb     w3, [x4, #8]
    mov      w4, #0xa6
    eor      w3, w3, w4
    adrp     x4, #0x543000
    add      x4, x4, #0x480
    strb     w3, [x6, #8]
    ldrb     w3, [x4]
    eor      w3, w3, #0xfffffff7
    adrp     x5, #0x543000
    add      x5, x5, #0x48d
    strb     w3, [x5]
    ldrb     w6, [x4, #1]
    mov      w3, #0x14
    eor      w6, w6, w3
    strb     w6, [x5, #1]
    ldrb     w6, [x4, #2]
    eor      w6, w6, #0x3e
    strb     w6, [x5, #2]
    ldrb     w6, [x4, #3]
    mov      w7, #0x92
    eor      w6, w6, w7
    strb     w6, [x5, #3]
    ldrb     w6, [x4, #4]
    mov      w7, #0xbe
    eor      w6, w6, w7
    strb     w6, [x5, #4]
    ldrb     w6, [x4, #5]
    mov      w7, #0xfa
    eor      w6, w6, w7
    strb     w6, [x5, #5]
    ldrb     w6, [x4, #6]
    mov      w7, #0x53
    eor      w6, w6, w7
    strb     w6, [x5, #6]
    ldrb     w6, [x4, #7]
    mov      w7, #0x42
    eor      w6, w6, w7
    strb     w6, [x5, #7]
    ldrb     w6, [x4, #8]
    mov      w7, #0xd1
    eor      w6, w6, w7
    strb     w6, [x5, #8]
    ldrb     w6, [x4, #9]
    eor      w2, w6, w2
    strb     w2, [x5, #9]
    ldrb     w2, [x4, #0xa]
    eor      w0, w2, w0
    strb     w0, [x5, #0xa]
    ldrb     w0, [x4, #0xb]
    mov      w2, #0x76
    eor      w0, w0, w2
    strb     w0, [x5, #0xb]
    ldrb     w0, [x4, #0xc]
    eor      w0, w0, #0xffffffc1
    strb     w0, [x5, #0xc]
    adrp     x0, #0x543000
    add      x0, x0, #0x49a
    ldrb     w2, [x0]
    eor      w2, w2, #0x44444444
    adrp     x4, #0x543000
    add      x4, x4, #0x4a2
    strb     w2, [x4]
    ldrb     w2, [x0, #1]
    eor      w2, w2, #0x70
    strb     w2, [x4, #1]
    ldrb     w2, [x0, #2]
    mov      w5, #0xe9
    eor      w2, w2, w5
    strb     w2, [x4, #2]
    ldrb     w2, [x0, #3]
    eor      w2, w2, #0x1e
    strb     w2, [x4, #3]
    ldrb     w2, [x0, #4]
    mov      w5, #0xa5
    eor      w2, w2, w5
    strb     w2, [x4, #4]
    ldrb     w2, [x0, #5]
    mov      w6, #0x21
    eor      w2, w2, w6
    strb     w2, [x4, #5]
    ldrb     w2, [x0, #6]
    eor      w16, w2, w16
    strb     w16, [x4, #6]
    ldrb     w16, [x0, #7]
    eor      w16, w16, w5
    strb     w16, [x4, #7]
    adrp     x0, #0x543000
    add      x0, x0, #0x4c4
    ldrb     w16, [x0]
    mov      w2, #0x63
    eor      w16, w16, w2
    adrp     x2, #0x543000
    add      x2, x2, #0x4d0
    strb     w16, [x2]
    ldrb     w16, [x0, #1]
    mov      w4, #0x90
    eor      w16, w16, w4
    strb     w16, [x2, #1]
    ldrb     w16, [x0, #2]
    mov      w4, #0xab
    eor      w16, w16, w4
    strb     w16, [x2, #2]
    ldrb     w16, [x0, #3]
    mov      w4, #0xd3
    eor      w16, w16, w4
    strb     w16, [x2, #3]
    ldrb     w16, [x0, #4]
    mov      w4, #0xe2
    eor      w16, w16, w4
    strb     w16, [x2, #4]
    ldrb     w16, [x0, #5]
    mov      w4, #0xd5
    eor      w16, w16, w4
    strb     w16, [x2, #5]
    ldrb     w4, [x0, #6]
    mov      w16, #0x96
    eor      w4, w4, w16
    strb     w4, [x2, #6]
    ldrb     w4, [x0, #7]
    eor      w3, w4, w3
    strb     w3, [x2, #7]
    ldrb     w3, [x0, #8]
    eor      w3, w3, #0x3c
    strb     w3, [x2, #8]
    ldrb     w3, [x0, #9]
    eor      w1, w3, w1
    strb     w1, [x2, #9]
    ldrb     w1, [x0, #0xa]
    mov      w3, #0xb4
    eor      w1, w1, w3
    strb     w1, [x2, #0xa]
    ldrb     w0, [x0, #0xb]
    mov      w1, #0x9c
    eor      w0, w0, w1
    strb     w0, [x2, #0xb]
    adrp     x0, #0x543000
    add      x0, x0, #0x4e6
    ldrb     w1, [x0]
    mov      w2, #0x2c
    eor      w1, w1, w2
    adrp     x2, #0x543000
    add      x2, x2, #0x4f1
    strb     w1, [x2]
    ldrb     w1, [x0, #1]
    eor      w1, w1, #0xf8
    strb     w1, [x2, #1]
    ldrb     w1, [x0, #2]
    eor      w1, w1, #0xfe
    strb     w1, [x2, #2]
    ldrb     w1, [x0, #3]
    mov      w3, #0xce
    eor      w1, w1, w3
    strb     w1, [x2, #3]
    ldrb     w1, [x0, #4]
    mov      w3, #0x8a
    eor      w1, w1, w3
    strb     w1, [x2, #4]
    ldrb     w1, [x0, #5]
    eor      w1, w1, #0xf
    strb     w1, [x2, #5]
    ldrb     w1, [x0, #6]
    eor      w1, w1, #0x60
    strb     w1, [x2, #6]
    ldrb     w1, [x0, #7]
    eor      w1, w1, #0xfffffff3
    strb     w1, [x2, #7]
    ldrb     w1, [x0, #8]
    mov      w3, #0xf2
    eor      w1, w1, w3
    strb     w1, [x2, #8]
    ldrb     w1, [x0, #9]
    eor      w1, w1, #0xffffffc1
    strb     w1, [x2, #9]
    ldrb     w0, [x0, #0xa]
    eor      w0, w0, #0x1e
    strb     w0, [x2, #0xa]
    adrp     x0, #0x543000
    add      x0, x0, #0x46a
    ldrb     w1, [x0]
    mov      w2, #0xd9
    eor      w1, w1, w2
    adrp     x2, #0x543000
    add      x2, x2, #0x475
    strb     w1, [x2]
    ldrb     w1, [x0, #1]
    eor      w1, w1, #0xffffff9f
    strb     w1, [x2, #1]
    ldrb     w1, [x0, #2]
    mov      w3, #0x95
    eor      w1, w1, w3
    strb     w1, [x2, #2]
    ldrb     w1, [x0, #3]
    eor      w17, w1, w17
    strb     w17, [x2, #3]
    ldrb     w17, [x0, #4]
    mov      w1, #0x8d
    eor      w17, w17, w1
    strb     w17, [x2, #4]
    ldrb     w17, [x0, #5]
    mov      w1, #0x93
    eor      w17, w17, w1
    strb     w17, [x2, #5]
    ldrb     w17, [x0, #6]
    mov      w1, #0xd4
    eor      w17, w17, w1
    strb     w17, [x2, #6]
    ldrb     w17, [x0, #7]
    eor      w16, w17, w16
    strb     w16, [x2, #7]
    ldrb     w16, [x0, #8]
    eor      w16, w16, #0xffffff87
    strb     w16, [x2, #8]
    ldrb     w16, [x0, #9]
    eor      w16, w16, #4
    strb     w16, [x2, #9]
    ldrb     w16, [x0, #0xa]
    mov      w17, #0x39
    eor      w16, w16, w17
    strb     w16, [x2, #0xa]
    adrp     x16, #0x543000
    add      x16, x16, #0x552
    ldrb     w17, [x16]
    mov      w0, #0x73
    eor      w17, w17, w0
    adrp     x0, #0x543000
    add      x0, x0, #0x55e
    strb     w17, [x0]
    ldrb     w17, [x16, #1]
    mov      w1, #0xc4
    eor      w17, w17, w1
    strb     w17, [x0, #1]
    ldrb     w17, [x16, #2]
    mov      w1, #0x41
    eor      w17, w17, w1
    strb     w17, [x0, #2]
    ldrb     w17, [x16, #3]
    mov      w1, #0x4f
    eor      w17, w17, w1
    strb     w17, [x0, #3]
    ldrb     w17, [x16, #4]
    eor      w17, w17, #0x1f
    strb     w17, [x0, #4]
    ldrb     w17, [x16, #5]
    mov      w1, #0x1d
    eor      w17, w17, w1
    strb     w17, [x0, #5]
    ldrb     w17, [x16, #6]
    mov      w1, #0xf6
    eor      w17, w17, w1
    strb     w17, [x0, #6]
    ldrb     w17, [x16, #7]
    mov      w1, #0x89
    eor      w17, w17, w1
    strb     w17, [x0, #7]
    ldrb     w17, [x16, #8]
    eor      w17, w17, #0xffffffc7
    strb     w17, [x0, #8]
    ldrb     w17, [x16, #9]
    eor      w12, w17, w12
    strb     w12, [x0, #9]
    ldrb     w12, [x16, #0xa]
    eor      w9, w12, w9
    strb     w9, [x0, #0xa]
    ldrb     w9, [x16, #0xb]
    eor      w9, w9, #0xffffff9f
    strb     w9, [x0, #0xb]
    adrp     x9, #0x543000
    add      x9, x9, #0x44a
    ldrb     w12, [x9]
    eor      w12, w12, #0x3e
    adrp     x16, #0x543000
    add      x16, x16, #0x45a
    strb     w12, [x16]
    ldrb     w12, [x9, #1]
    eor      w10, w12, w10
    strb     w10, [x16, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x9b
    eor      w10, w10, w12
    strb     w10, [x16, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x32
    eor      w10, w10, w12
    strb     w10, [x16, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0xffffffc3
    strb     w10, [x16, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x1a
    eor      w10, w10, w12
    strb     w10, [x16, #5]
    ldrb     w10, [x9, #6]
    eor      w10, w10, #0xfffffffb
    strb     w10, [x16, #6]
    ldrb     w10, [x9, #7]
    eor      w10, w10, w11
    strb     w10, [x16, #7]
    ldrb     w10, [x9, #8]
    eor      w10, w10, #0x38
    strb     w10, [x16, #8]
    ldrb     w10, [x9, #9]
    eor      w10, w10, w15
    strb     w10, [x16, #9]
    ldrb     w10, [x9, #0xa]
    eor      w10, w10, #0xfffffff3
    strb     w10, [x16, #0xa]
    ldrb     w10, [x9, #0xb]
    mov      w11, #0xe5
    eor      w10, w10, w11
    strb     w10, [x16, #0xb]
    ldrb     w10, [x9, #0xc]
    eor      w10, w10, #0xffffff8f
    strb     w10, [x16, #0xc]
    ldrb     w10, [x9, #0xd]
    mov      w11, #0x2f
    eor      w10, w10, w11
    strb     w10, [x16, #0xd]
    ldrb     w10, [x9, #0xe]
    eor      w10, w10, #0xfffffffd
    strb     w10, [x16, #0xe]
    ldrb     w9, [x9, #0xf]
    eor      w9, w9, #0x7c
    strb     w9, [x16, #0xf]
    adrp     x9, #0x543000
    add      x9, x9, #0x430
    ldrb     w10, [x9]
    mov      w11, #0x35
    adrp     x12, #0x543000
    add      x12, x12, #0x43d
    eor      w10, w10, w11
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xf
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0x80
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    mov      w15, #0x1b
    eor      w10, w10, w15
    strb     w10, [x12, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, w14
    strb     w10, [x12, #4]
    ldrb     w10, [x9, #5]
    mov      w14, #0x7a
    eor      w10, w10, w14
    strb     w10, [x12, #5]
    ldrb     w10, [x9, #6]
    mov      w14, #0xd2
    eor      w10, w10, w14
    strb     w10, [x12, #6]
    ldrb     w10, [x9, #7]
    mov      w14, #0xa9
    eor      w10, w10, w14
    strb     w10, [x12, #7]
    ldrb     w10, [x9, #8]
    eor      w10, w10, #0xffffffe1
    strb     w10, [x12, #8]
    ldrb     w10, [x9, #9]
    eor      w10, w10, w13
    strb     w10, [x12, #9]
    ldrb     w10, [x9, #0xa]
    eor      w10, w10, #0x18
    strb     w10, [x12, #0xa]
    ldrb     w10, [x9, #0xb]
    eor      w10, w10, #0x88888888
    strb     w10, [x12, #0xb]
    ldrb     w9, [x9, #0xc]
    eor      w9, w9, w11
    strb     w9, [x12, #0xc]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x22, sp, #0x40
    mov      sp, x22
    sub      x8, sp, #0x80
    stur     x8, [x29, #-0x78]
    mov      sp, x8
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x4d0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x908]
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x528]
    adrp     x2, #0x543000
    add      x2, x2, #0x8e0
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x4e8]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x548]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x543000
    add      x2, x2, #0x920
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x23, #0x4a6000
    add      x23, x23, #0xd8
    cmp      x0, #0
    csel     x2, x23, x0, eq
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x550]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x543000
    add      x2, x2, #0x960
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cmp      x0, #0
    csel     x2, x23, x0, eq
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x808]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x543000
    add      x2, x2, #0x820
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cmp      x0, #0
    csel     x2, x23, x0, eq
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x558]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x543000
    add      x2, x2, #0x860
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cmp      x0, #0
    csel     x2, x23, x0, eq
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x6e0]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x543000
    add      x2, x2, #0x7e0
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cmp      x0, #0
    csel     x2, x23, x0, eq
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x6e8]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x543000
    add      x2, x2, #0x8a0
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cmp      x0, #0
    csel     x2, x23, x0, eq
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x560]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x543000
    add      x2, x2, #0x7a0
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x28, #0x4c4000
    ldr      x0, [x28, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    stur     x1, [x29, #-0x60]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x19
    stur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x2f5ff4
    adrp     x2, #0x543000
    add      x2, x2, #0x7a0
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x6f0]
    mov      x0, x25
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    b        #0x2f6010
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x2d8]
    ldr      x2, [x8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x6f0]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x543000
    add      x2, x2, #0x760
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cmp      x0, #0
    csel     x2, x23, x0, eq
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x568]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x543000
    add      x2, x2, #0x720
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x570]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x543000
    add      x2, x2, #0x6e0
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x6f8]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x543000
    add      x2, x2, #0x6a0
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cmp      x0, #0
    csel     x2, x23, x0, eq
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x700]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x543000
    add      x2, x2, #0x660
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x370]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x708]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x543000
    add      x2, x2, #0x620
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x710]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x543000
    add      x2, x2, #0x5e0
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x718]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x543000
    add      x2, x2, #0x5a0
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x0, [x28, #0x98]
    ldur     x1, [x29, #-0x60]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x19
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cbz      w21, #0x2f63b4
    stur     x25, [x29, #-0x90]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    movi     v0.16b, #0
    stp      q0, q0, [x22]
    stp      q0, q0, [x22, #0x20]
    adrp     x2, #0x543000
    add      x2, x2, #0x5a0
    stur     x20, [x29, #-0x88]
    mov      x0, x20
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stur     x1, [x29, #-0x80]
    mov      x2, x22
    ldur     x3, [x29, #-0x78]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2f6374
    mov      x19, x0
    ldr      x8, [x22, #0x10]
    ldr      x20, [x8]
    adrp     x25, #0x4c4000
    mov      x26, #0
    adrp     x8, #0x4c1000
    ldr      x23, [x8, #0x720]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x830]
    ldr      x8, [x22, #0x10]
    ldr      x8, [x8]
    cmp      x8, x20
    b.eq     #0x2f62f0
    mov      x0, x24
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x22, #8]
    ldr      x28, [x8, x26, lsl #3]
    ldr      x0, [x25, #0x208]
    ldur     x1, [x29, #-0x60]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x28
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2f634c
    ldur     x0, [x29, #-0x70]
    mov      x1, x23
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x0, x27
    mov      x1, x21
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    add      x26, x26, #1
    cmp      x19, x26
    b.ne     #0x2f62d8
    mov      x0, x24
    ldp      x1, x3, [x29, #-0x80]
    mov      x2, x22
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    cbnz     x0, #0x2f62c4
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    csel     x2, xzr, x27, eq
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x728]
    ldur     x25, [x29, #-0x90]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    ldur     x20, [x29, #-0x88]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2f63f8
    mov      x0, x25
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    b        #0x461be8 // _objc_autoreleaseReturnValue
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGGlassStore fetchCatalogWithCompletion:] IMP=0x2F63FC bounds=0x2F63FC-0x2F6A40
loc_2F63FC:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x10
    mov      x27, x2
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x580000
    add      x8, x8, #0x65c
    ldar     w9, [x8]
    cbnz     w9, #0x2f67e8
    adrp     x9, #0x543000
    add      x9, x9, #0xa1a
    ldrb     w10, [x9]
    mov      w11, #0x5e
    eor      w10, w10, w11
    adrp     x11, #0x543000
    add      x11, x11, #0xa24
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x88888888
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0x70
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x6f
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0x3f
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0xde
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    eor      w10, w10, #3
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0xc2
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w12, #0xb
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w9, [x9, #9]
    mov      w10, #0x89
    eor      w9, w9, w10
    adrp     x10, #0x543000
    add      x10, x10, #0xa10
    strb     w9, [x11, #9]
    ldrb     w9, [x10]
    mov      w11, #0x2b
    eor      w9, w9, w11
    adrp     x11, #0x543000
    add      x11, x11, #0xa15
    strb     w9, [x11]
    ldrb     w9, [x10, #1]
    eor      w9, w9, #0xffffffef
    strb     w9, [x11, #1]
    ldrb     w12, [x10, #2]
    mov      w9, #0x62
    eor      w12, w12, w9
    strb     w12, [x11, #2]
    ldrb     w12, [x10, #3]
    mov      w13, #0xb0
    eor      w12, w12, w13
    strb     w12, [x11, #3]
    ldrb     w10, [x10, #4]
    mov      w12, #0x2c
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    adrp     x10, #0x543000
    add      x10, x10, #0x9c0
    ldrh     w11, [x10]
    mov      w12, #0x2efb
    eor      w11, w11, w12
    adrp     x12, #0x543000
    add      x12, x12, #0x9e0
    strh     w11, [x12]
    ldrh     w11, [x10, #2]
    mov      w13, #0x7d17
    eor      w11, w11, w13
    strh     w11, [x12, #2]
    ldrh     w11, [x10, #4]
    mov      w13, #0x44
    eor      w11, w11, w13
    strh     w11, [x12, #4]
    ldrh     w11, [x10, #6]
    mov      w13, #0xb759
    eor      w11, w11, w13
    strh     w11, [x12, #6]
    ldrh     w11, [x10, #8]
    mov      w13, #0x54ec
    eor      w11, w11, w13
    strh     w11, [x12, #8]
    ldrh     w11, [x10, #0xa]
    mov      w13, #0x2292
    eor      w11, w11, w13
    strh     w11, [x12, #0xa]
    ldrh     w11, [x10, #0xc]
    mov      w13, #0xaf9e
    eor      w11, w11, w13
    strh     w11, [x12, #0xc]
    ldrh     w11, [x10, #0xe]
    mov      w13, #0xcc07
    eor      w11, w11, w13
    strh     w11, [x12, #0xe]
    ldrh     w11, [x10, #0x10]
    mov      w13, #0x7a3a
    eor      w11, w11, w13
    strh     w11, [x12, #0x10]
    ldrh     w11, [x10, #0x12]
    mov      w13, #0xa618
    eor      w11, w11, w13
    strh     w11, [x12, #0x12]
    ldrh     w11, [x10, #0x14]
    mov      w13, #0xf21d
    eor      w11, w11, w13
    strh     w11, [x12, #0x14]
    ldrh     w11, [x10, #0x16]
    mov      w13, #0x2b85
    eor      w11, w11, w13
    strh     w11, [x12, #0x16]
    ldrh     w11, [x10, #0x18]
    mov      w13, #0x2ab
    eor      w11, w11, w13
    strh     w11, [x12, #0x18]
    ldrh     w10, [x10, #0x1a]
    mov      w11, #0x549d
    eor      w10, w10, w11
    strh     w10, [x12, #0x1a]
    adrp     x10, #0x543000
    add      x10, x10, #0x9fc
    ldrb     w11, [x10]
    mov      w12, #0x75
    eor      w11, w11, w12
    adrp     x12, #0x543000
    add      x12, x12, #0xa06
    strb     w11, [x12]
    ldrb     w11, [x10, #1]
    mov      w13, #0x65
    eor      w11, w11, w13
    strb     w11, [x12, #1]
    ldrb     w11, [x10, #2]
    eor      w11, w11, #3
    strb     w11, [x12, #2]
    ldrb     w11, [x10, #3]
    mov      w13, #0x42
    eor      w11, w11, w13
    strb     w11, [x12, #3]
    ldrb     w11, [x10, #4]
    mov      w13, #0x15
    eor      w11, w11, w13
    strb     w11, [x12, #4]
    ldrb     w11, [x10, #5]
    eor      w11, w11, #0x77777777
    strb     w11, [x12, #5]
    ldrb     w11, [x10, #6]
    mov      w13, #0xc6
    eor      w11, w11, w13
    strb     w11, [x12, #6]
    ldrb     w11, [x10, #7]
    mov      w13, #0x64
    eor      w11, w11, w13
    strb     w11, [x12, #7]
    ldrb     w11, [x10, #8]
    mov      w13, #0xd0
    eor      w11, w11, w13
    strb     w11, [x12, #8]
    ldrb     w10, [x10, #9]
    eor      w10, w10, #0xf8
    strb     w10, [x12, #9]
    adrp     x10, #0x543000
    add      x10, x10, #0x980
    ldrb     w11, [x10]
    eor      w12, w11, #7
    adrp     x11, #0x543000
    add      x11, x11, #0x9a0
    strb     w12, [x11]
    ldrb     w12, [x10, #1]
    eor      w12, w12, #0xffffffef
    strb     w12, [x11, #1]
    ldrb     w12, [x10, #2]
    mov      w13, #0xd4
    eor      w12, w12, w13
    strb     w12, [x11, #2]
    ldrb     w12, [x10, #3]
    eor      w12, w12, #0x40
    strb     w12, [x11, #3]
    ldrb     w12, [x10, #4]
    eor      w12, w12, #0x18
    strb     w12, [x11, #4]
    ldrb     w12, [x10, #5]
    mov      w13, #0x19
    eor      w12, w12, w13
    strb     w12, [x11, #5]
    ldrb     w12, [x10, #6]
    eor      w12, w12, #0x44444444
    strb     w12, [x11, #6]
    ldrb     w12, [x10, #7]
    mov      w13, #0x49
    eor      w12, w12, w13
    strb     w12, [x11, #7]
    ldrb     w12, [x10, #8]
    mov      w13, #0x47
    eor      w12, w12, w13
    strb     w12, [x11, #8]
    ldrb     w12, [x10, #9]
    mov      w13, #0xd7
    eor      w12, w12, w13
    strb     w12, [x11, #9]
    ldrb     w12, [x10, #0xa]
    mov      w13, #0xd8
    eor      w12, w12, w13
    strb     w12, [x11, #0xa]
    ldrb     w12, [x10, #0xb]
    mov      w13, #0x3b
    eor      w12, w12, w13
    strb     w12, [x11, #0xb]
    ldrb     w12, [x10, #0xc]
    mov      w13, #0xe6
    eor      w12, w12, w13
    strb     w12, [x11, #0xc]
    ldrb     w12, [x10, #0xd]
    eor      w9, w12, w9
    strb     w9, [x11, #0xd]
    ldrb     w9, [x10, #0xe]
    mov      w12, #0xf5
    eor      w9, w9, w12
    strb     w9, [x11, #0xe]
    ldrb     w9, [x10, #0xf]
    eor      w9, w9, #0xf
    strb     w9, [x11, #0xf]
    ldrb     w9, [x10, #0x10]
    mov      w12, #0xfa
    eor      w9, w9, w12
    strb     w9, [x11, #0x10]
    ldrb     w9, [x10, #0x11]
    mov      w10, #0x23
    eor      w9, w9, w10
    strb     w9, [x11, #0x11]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x23, sp, #0x20
    mov      sp, x23
    sub      x25, sp, #0x20
    mov      sp, x25
    sub      x22, sp, #0x30
    mov      sp, x22
    mov      x0, x27
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf50]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2f69cc
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x538]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x730]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x60]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2f8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xa78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x27
    mov      x27, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xaa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xaa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4a6000
    add      x8, x8, #0xd8
    cmp      x0, #0
    csel     x26, x8, x0, eq
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x27, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x543000
    add      x8, x8, #0xb50
    adrp     x9, #0x543000
    add      x9, x9, #0xb10
    stp      x8, x9, [x25]
    adrp     x8, #0x543000
    add      x8, x8, #0xa90
    stp      x21, x26, [x23]
    str      x8, [x25, #0x10]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x2e0]
    ldr      x8, [x8]
    ldur     x24, [x29, #-0x60]
    cmp      x24, #0
    csel     x8, x8, x24, eq
    str      x8, [x23, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    mov      x2, x23
    mov      x3, x25
    mov      w4, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x22]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x22, #8]
    adrp     x8, #0x2f6000
    add      x8, x8, #0xa40
    adrp     x9, #0x4a4000
    add      x9, x9, #0x528
    stp      x8, x9, [x22, #0x10]
    mov      x0, x27
    bl       #0x461ca8 // _objc_retain
    stp      x19, x27, [x22, #0x20]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x738]
    adrp     x2, #0x543000
    add      x2, x2, #0xad0
    mov      x0, x19
    mov      x3, x20
    mov      x4, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [x22, #0x28]
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    b        #0x2f69f4
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x2d8]
    ldr      x2, [x8]
    ldr      x8, [x27, #0x10]
    adrp     x4, #0x543000
    add      x4, x4, #0xa50
    mov      x0, x27
    mov      w1, #0
    mov      x3, x2
    blr      x8
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2f6a3c
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGGlassStore fetchCardPreviewHTMLForTheme:completion:] IMP=0x2F706C bounds=0x2F706C-0x2F78CC
loc_2F706C:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    sub      sp, sp, #0x20
    mov      x20, x3
    mov      x19, x2
    mov      x27, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x68]
    adrp     x8, #0x580000
    add      x8, x8, #0x664
    ldar     w9, [x8]
    cbnz     w9, #0x2f7588
    adrp     x9, #0x543000
    add      x9, x9, #0xdc0
    ldrh     w10, [x9]
    mov      w11, #0xfe4
    eor      w10, w10, w11
    adrp     x11, #0x543000
    add      x11, x11, #0xde0
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xc490
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x81dd
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x1313
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x5d5b
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0x93cd
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0xc891
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w10, [x9, #0xe]
    mov      w12, #0xbe77
    eor      w10, w10, w12
    strh     w10, [x11, #0xe]
    ldrh     w10, [x9, #0x10]
    mov      w12, #0x6c7e
    eor      w10, w10, w12
    strh     w10, [x11, #0x10]
    ldrh     w10, [x9, #0x12]
    mov      w12, #0x9e54
    eor      w10, w10, w12
    strh     w10, [x11, #0x12]
    ldrh     w10, [x9, #0x14]
    mov      w12, #0xb7ff
    eor      w10, w10, w12
    strh     w10, [x11, #0x14]
    ldrh     w10, [x9, #0x16]
    mov      w12, #0x82f1
    eor      w10, w10, w12
    strh     w10, [x11, #0x16]
    ldrh     w10, [x9, #0x18]
    mov      w12, #0x796a
    eor      w10, w10, w12
    strh     w10, [x11, #0x18]
    ldrh     w9, [x9, #0x1a]
    mov      w10, #0x78b0
    eor      w9, w9, w10
    adrp     x12, #0x543000
    add      x12, x12, #0xd69
    strh     w9, [x11, #0x1a]
    ldrb     w9, [x12]
    eor      w9, w9, #0xeeeeeeee
    adrp     x11, #0x543000
    add      x11, x11, #0xd6e
    strb     w9, [x11]
    ldrb     w9, [x12, #1]
    mov      w10, #0xde
    eor      w9, w9, w10
    strb     w9, [x11, #1]
    ldrb     w13, [x12, #2]
    mov      w9, #0xd1
    eor      w13, w13, w9
    strb     w13, [x11, #2]
    ldrb     w13, [x12, #3]
    mov      w14, #0xbc
    eor      w13, w13, w14
    strb     w13, [x11, #3]
    ldrb     w12, [x12, #4]
    eor      w12, w12, #0x60
    strb     w12, [x11, #4]
    adrp     x11, #0x543000
    add      x11, x11, #0xd57
    ldrb     w12, [x11]
    mov      w13, #0x23
    eor      w12, w12, w13
    adrp     x14, #0x543000
    add      x14, x14, #0xd60
    strb     w12, [x14]
    ldrb     w12, [x11, #1]
    mov      w15, #0xe9
    eor      w12, w12, w15
    strb     w12, [x14, #1]
    ldrb     w12, [x11, #2]
    mov      w15, #0xc2
    eor      w12, w12, w15
    strb     w12, [x14, #2]
    ldrb     w12, [x11, #3]
    eor      w12, w12, #0xc0
    strb     w12, [x14, #3]
    ldrb     w12, [x11, #4]
    eor      w12, w12, w13
    strb     w12, [x14, #4]
    ldrb     w12, [x11, #5]
    mov      w13, #0x6e
    eor      w12, w12, w13
    strb     w12, [x14, #5]
    ldrb     w12, [x11, #6]
    eor      w12, w12, #0xfe
    strb     w12, [x14, #6]
    ldrb     w12, [x11, #7]
    eor      w12, w12, #0x3f
    strb     w12, [x14, #7]
    ldrb     w11, [x11, #8]
    eor      w11, w11, #0xffffff8f
    strb     w11, [x14, #8]
    adrp     x12, #0x543000
    add      x12, x12, #0xd4d
    ldrb     w11, [x12]
    eor      w11, w11, #0x80
    adrp     x13, #0x543000
    add      x13, x13, #0xd52
    strb     w11, [x13]
    ldrb     w11, [x12, #1]
    mov      w14, #0xfa
    eor      w11, w11, w14
    strb     w11, [x13, #1]
    ldrb     w11, [x12, #2]
    eor      w11, w11, #0x33333333
    strb     w11, [x13, #2]
    ldrb     w14, [x12, #3]
    mov      w11, #0x7d
    eor      w14, w14, w11
    strb     w14, [x13, #3]
    ldrb     w12, [x12, #4]
    eor      w12, w12, #0xc0
    adrp     x14, #0x543000
    add      x14, x14, #0xd80
    strb     w12, [x13, #4]
    ldrh     w12, [x14]
    mov      w13, #0x6344
    eor      w12, w12, w13
    adrp     x13, #0x543000
    add      x13, x13, #0xda0
    strh     w12, [x13]
    ldrh     w12, [x14, #2]
    mov      w15, #0xc507
    eor      w12, w12, w15
    strh     w12, [x13, #2]
    ldrh     w12, [x14, #4]
    mov      w15, #0x1318
    eor      w12, w12, w15
    strh     w12, [x13, #4]
    ldrh     w12, [x14, #6]
    mov      w15, #0x2a4d
    eor      w12, w12, w15
    strh     w12, [x13, #6]
    ldrh     w12, [x14, #8]
    mov      w15, #0xd081
    eor      w12, w12, w15
    strh     w12, [x13, #8]
    ldrh     w12, [x14, #0xa]
    mov      w15, #0x55db
    eor      w12, w12, w15
    strh     w12, [x13, #0xa]
    ldrh     w12, [x14, #0xc]
    mov      w15, #0x99a5
    eor      w12, w12, w15
    strh     w12, [x13, #0xc]
    ldrh     w12, [x14, #0xe]
    mov      w15, #0x9d9
    eor      w12, w12, w15
    strh     w12, [x13, #0xe]
    ldrh     w12, [x14, #0x10]
    mov      w14, #0xd87c
    eor      w12, w12, w14
    strh     w12, [x13, #0x10]
    adrp     x12, #0x543000
    add      x12, x12, #0xd37
    ldrb     w13, [x12]
    eor      w13, w13, #0x55555555
    adrp     x14, #0x543000
    add      x14, x14, #0xd42
    strb     w13, [x14]
    ldrb     w13, [x12, #1]
    mov      w15, #0xeb
    eor      w13, w13, w15
    strb     w13, [x14, #1]
    ldrb     w13, [x12, #2]
    mov      w15, #0xd2
    eor      w13, w13, w15
    strb     w13, [x14, #2]
    ldrb     w13, [x12, #3]
    eor      w13, w13, #0xffffff9f
    strb     w13, [x14, #3]
    ldrb     w13, [x12, #4]
    eor      w13, w13, #0xfffffffd
    strb     w13, [x14, #4]
    ldrb     w13, [x12, #5]
    eor      w11, w13, w11
    strb     w11, [x14, #5]
    ldrb     w11, [x12, #6]
    eor      w11, w11, #0x1e
    strb     w11, [x14, #6]
    ldrb     w11, [x12, #7]
    mov      w13, #0x25
    eor      w11, w11, w13
    strb     w11, [x14, #7]
    ldrb     w11, [x12, #8]
    eor      w11, w11, #0xffffffc3
    strb     w11, [x14, #8]
    ldrb     w11, [x12, #9]
    mov      w13, #0xcb
    eor      w11, w11, w13
    strb     w11, [x14, #9]
    ldrb     w11, [x12, #0xa]
    mov      w12, #0xab
    eor      w11, w11, w12
    strb     w11, [x14, #0xa]
    adrp     x11, #0x543000
    add      x11, x11, #0xd00
    ldrb     w12, [x11]
    eor      w12, w12, w10
    adrp     x10, #0x543000
    add      x10, x10, #0xd20
    strb     w12, [x10]
    ldrb     w12, [x11, #1]
    eor      w12, w12, #0x1f
    strb     w12, [x10, #1]
    ldrb     w12, [x11, #2]
    mov      w13, #0x4e
    eor      w12, w12, w13
    strb     w12, [x10, #2]
    ldrb     w12, [x11, #3]
    mov      w13, #0xf5
    eor      w12, w12, w13
    strb     w12, [x10, #3]
    ldrb     w12, [x11, #4]
    mov      w13, #0x5d
    eor      w12, w12, w13
    strb     w12, [x10, #4]
    ldrb     w12, [x11, #5]
    mov      w13, #0x54
    eor      w12, w12, w13
    strb     w12, [x10, #5]
    ldrb     w12, [x11, #6]
    mov      w13, #0x3d
    eor      w12, w12, w13
    strb     w12, [x10, #6]
    ldrb     w12, [x11, #7]
    mov      w13, #0x45
    eor      w12, w12, w13
    strb     w12, [x10, #7]
    ldrb     w12, [x11, #8]
    eor      w12, w12, #0x77777777
    strb     w12, [x10, #8]
    ldrb     w12, [x11, #9]
    mov      w13, #0x24
    eor      w12, w12, w13
    strb     w12, [x10, #9]
    ldrb     w12, [x11, #0xa]
    mvn      w12, w12
    strb     w12, [x10, #0xa]
    ldrb     w12, [x11, #0xb]
    eor      w12, w12, #0x3e
    strb     w12, [x10, #0xb]
    ldrb     w12, [x11, #0xc]
    mov      w13, #0x39
    eor      w12, w12, w13
    strb     w12, [x10, #0xc]
    ldrb     w12, [x11, #0xd]
    mov      w13, #0x12
    eor      w12, w12, w13
    strb     w12, [x10, #0xd]
    ldrb     w12, [x11, #0xe]
    mov      w13, #0x51
    eor      w12, w12, w13
    strb     w12, [x10, #0xe]
    ldrb     w12, [x11, #0xf]
    eor      w12, w12, #0xaaaaaaaa
    strb     w12, [x10, #0xf]
    ldrb     w12, [x11, #0x10]
    eor      w12, w12, #0xfc
    strb     w12, [x10, #0x10]
    ldrb     w12, [x11, #0x11]
    mov      w14, #0x16
    eor      w12, w12, w14
    strb     w12, [x10, #0x11]
    ldrb     w12, [x11, #0x12]
    mov      w14, #0x4d
    eor      w12, w12, w14
    strb     w12, [x10, #0x12]
    ldrb     w12, [x11, #0x13]
    mov      w14, #0xaf
    eor      w12, w12, w14
    strb     w12, [x10, #0x13]
    ldrb     w12, [x11, #0x14]
    eor      w9, w12, w9
    strb     w9, [x10, #0x14]
    ldrb     w9, [x11, #0x15]
    eor      w9, w9, w13
    strb     w9, [x10, #0x15]
    ldrb     w9, [x11, #0x16]
    mov      w11, #0xe6
    eor      w9, w9, w11
    strb     w9, [x10, #0x16]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x22, sp, #0x30
    mov      sp, x22
    sub      x25, sp, #0x20
    mov      sp, x25
    sub      x26, sp, #0x20
    mov      sp, x26
    sub      x24, sp, #0x40
    mov      sp, x24
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    cbz      x20, #0x2f7858
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x22]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    str      d8, [x22, #8]
    adrp     x8, #0x2f7000
    add      x8, x8, #0x8cc
    adrp     x9, #0x4a4000
    add      x9, x9, #0x588
    stp      x8, x9, [x22, #0x10]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    str      x20, [x22, #0x20]
    mov      x0, x22
    bl       #0x461cd8 // _objc_retainBlock
    mov      x23, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x4d0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2f7830
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xe70]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    adrp     x2, #0x543000
    add      x2, x2, #0xea0
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x2f7828
    adrp     x8, #0x4c1000
    ldr      x28, [x8, #0x578]
    mov      x0, x19
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    b.le     #0x2f7828
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x740]
    mov      x0, x19
    stp      x1, x28, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x27
    mov      x27, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cmp      x27, #0
    b.le     #0x2f7830
    mov      x27, x28
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf50]
    mov      x0, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2f78a4
    mov      x0, x19
    ldur     x1, [x29, #-0x70]
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    mov      x0, x19
    ldur     x1, [x29, #-0x78]
    bl       #0x461c6c // _objc_msgSend
    stur     x21, [x29, #-0x70]
    mov      x21, x0
    adrp     x8, #0x543000
    add      x8, x8, #0xf60
    ldur     x9, [x29, #-0x70]
    str      x9, [x25]
    adrp     x9, #0x543000
    add      x9, x9, #0xee0
    stp      x8, x9, [x26]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    stur     x27, [x29, #-0x80]
    ldr      x27, [x8, #0x4f0]
    mov      x1, x27
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x78]
    str      x0, [x25, #8]
    adrp     x8, #0x543000
    add      x8, x8, #0xe60
    str      x8, [x26, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    mov      x1, x27
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    str      x0, [x25, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    mov      x2, x25
    mov      x3, x26
    mov      w4, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x24]
    str      d8, [x24, #8]
    adrp     x8, #0x2f7000
    add      x8, x8, #0xa18
    adrp     x9, #0x4a4000
    add      x9, x9, #0x5b8
    stp      x8, x9, [x24, #0x10]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    stp      x23, x28, [x24, #0x20]
    str      x21, [x24, #0x30]
    ldur     x21, [x29, #-0x70]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x738]
    adrp     x2, #0x543000
    add      x2, x2, #0xe20
    ldur     x0, [x29, #-0x80]
    mov      x3, x25
    mov      x4, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x78]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x24, #0x20]
    bl       #0x461c9c // _objc_release
    b        #0x2f78bc
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x8, [x23, #0x10]
    adrp     x2, #0x543000
    add      x2, x2, #0xf20
    mov      x0, x23
    mov      x1, #0
    blr      x8
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x22, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x68]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2f78c8
    sub      sp, x29, #0x60
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    ldp      d9, d8, [sp], #0x70
    ret      
    ldr      x8, [x23, #0x10]
    adrp     x2, #0x543000
    add      x2, x2, #0xfa0
    mov      x0, x23
    mov      x1, #0
    blr      x8
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    b        #0x2f7848
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGGlassStore downloadAndImportTheme:completion:] IMP=0x2F9210 bounds=0x2F9210-0x2F9224
loc_2F9210:
    mov      x4, x3
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x748]
    mov      x3, #0
    b        #0x461c6c // _objc_msgSend

// -[WCLGGlassStore downloadAndImportTheme:progress:completion:] IMP=0x2F9224 bounds=0x2F9224-0x2F9888
loc_2F9224:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    sub      sp, sp, #0x30
    mov      x26, x4
    mov      x20, x3
    mov      x19, x2
    mov      x21, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x68]
    adrp     x8, #0x580000
    add      x8, x8, #0x67c
    ldar     w9, [x8]
    cbnz     w9, #0x2f95c8
    adrp     x9, #0x544000
    add      x9, x9, #0xb46
    ldrh     w10, [x9]
    mov      w11, #0x9d3e
    eor      w10, w10, w11
    adrp     x11, #0x544000
    add      x11, x11, #0xb56
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x6ed9
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xec84
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xb2c9
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0xb0ce
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0x3131
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0x6db1
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w9, [x9, #0xe]
    mov      w10, #0x8898
    eor      w9, w9, w10
    strh     w9, [x11, #0xe]
    adrp     x10, #0x544000
    add      x10, x10, #0xb29
    ldrb     w9, [x10]
    eor      w9, w9, #0xdddddddd
    adrp     x11, #0x544000
    add      x11, x11, #0xb32
    strb     w9, [x11]
    ldrb     w9, [x10, #1]
    mov      w12, #0x5d
    eor      w9, w9, w12
    strb     w9, [x11, #1]
    ldrb     w9, [x10, #2]
    mov      w12, #0x23
    eor      w9, w9, w12
    strb     w9, [x11, #2]
    ldrb     w9, [x10, #3]
    mov      w12, #0xce
    eor      w9, w9, w12
    strb     w9, [x11, #3]
    ldrb     w9, [x10, #4]
    mov      w12, #0xba
    eor      w9, w9, w12
    strb     w9, [x11, #4]
    ldrb     w9, [x10, #5]
    mov      w12, #0xae
    eor      w9, w9, w12
    strb     w9, [x11, #5]
    ldrb     w9, [x10, #6]
    mov      w13, #0x8b
    eor      w9, w9, w13
    strb     w9, [x11, #6]
    ldrb     w13, [x10, #7]
    mov      w9, #0x8a
    eor      w13, w13, w9
    strb     w13, [x11, #7]
    ldrb     w10, [x10, #8]
    mov      w13, #0xeb
    eor      w10, w10, w13
    strb     w10, [x11, #8]
    adrp     x10, #0x544000
    add      x10, x10, #0xb3b
    ldrb     w11, [x10]
    mov      w13, #0xa2
    eor      w11, w11, w13
    adrp     x13, #0x544000
    add      x13, x13, #0xb40
    strb     w11, [x13]
    ldrb     w11, [x10, #1]
    eor      w11, w11, w12
    strb     w11, [x13, #1]
    ldrb     w11, [x10, #2]
    eor      w11, w11, #0xc
    strb     w11, [x13, #2]
    ldrb     w11, [x10, #3]
    mov      w12, #0x9b
    eor      w11, w11, w12
    strb     w11, [x13, #3]
    ldrb     w10, [x10, #4]
    mov      w11, #0xd4
    eor      w10, w10, w11
    adrp     x11, #0x544000
    add      x11, x11, #0xb13
    strb     w10, [x13, #4]
    ldrb     w10, [x11]
    mov      w12, #0x27
    eor      w10, w10, w12
    adrp     x12, #0x544000
    add      x12, x12, #0xb1e
    strb     w10, [x12]
    ldrb     w10, [x11, #1]
    eor      w10, w10, #0x77777777
    strb     w10, [x12, #1]
    ldrb     w10, [x11, #2]
    mov      w13, #0xde
    eor      w10, w10, w13
    strb     w10, [x12, #2]
    ldrb     w10, [x11, #3]
    strb     w10, [x12, #3]
    ldrb     w10, [x11, #4]
    eor      w10, w10, #0x22222222
    strb     w10, [x12, #4]
    ldrb     w10, [x11, #5]
    mov      w13, #0xb3
    eor      w10, w10, w13
    strb     w10, [x12, #5]
    ldrb     w10, [x11, #6]
    eor      w10, w10, #0xc
    strb     w10, [x12, #6]
    ldrb     w10, [x11, #7]
    mov      w13, #0xb
    eor      w10, w10, w13
    strb     w10, [x12, #7]
    ldrb     w10, [x11, #8]
    mov      w13, #0xed
    eor      w10, w10, w13
    strb     w10, [x12, #8]
    ldrb     w10, [x11, #9]
    eor      w10, w10, #0xdddddddd
    strb     w10, [x12, #9]
    ldrb     w10, [x11, #0xa]
    eor      w10, w10, #0xffffffc7
    strb     w10, [x12, #0xa]
    adrp     x10, #0x544000
    add      x10, x10, #0xae0
    ldrb     w11, [x10]
    mov      w12, #0x74
    eor      w12, w11, w12
    adrp     x11, #0x544000
    add      x11, x11, #0xb00
    strb     w12, [x11]
    ldrb     w12, [x10, #1]
    eor      w12, w12, #0xf8
    strb     w12, [x11, #1]
    ldrb     w12, [x10, #2]
    mov      w13, #0x56
    eor      w12, w12, w13
    strb     w12, [x11, #2]
    ldrb     w12, [x10, #3]
    eor      w9, w12, w9
    strb     w9, [x11, #3]
    ldrb     w9, [x10, #4]
    eor      w9, w9, #0x10
    strb     w9, [x11, #4]
    ldrb     w9, [x10, #5]
    mov      w12, #0x7a
    eor      w9, w9, w12
    strb     w9, [x11, #5]
    ldrb     w9, [x10, #6]
    eor      w9, w9, #0x80
    strb     w9, [x11, #6]
    ldrb     w9, [x10, #7]
    mov      w12, #0xf6
    eor      w9, w9, w12
    strb     w9, [x11, #7]
    ldrb     w9, [x10, #8]
    mov      w12, #0x62
    eor      w9, w9, w12
    strb     w9, [x11, #8]
    ldrb     w9, [x10, #9]
    eor      w9, w9, #0x70
    strb     w9, [x11, #9]
    ldrb     w9, [x10, #0xa]
    mov      w12, #0x61
    eor      w9, w9, w12
    strb     w9, [x11, #0xa]
    ldrb     w9, [x10, #0xb]
    mov      w12, #0x6b
    eor      w9, w9, w12
    strb     w9, [x11, #0xb]
    ldrb     w9, [x10, #0xc]
    mov      w12, #0x25
    eor      w9, w9, w12
    strb     w9, [x11, #0xc]
    ldrb     w9, [x10, #0xd]
    mov      w12, #0x5e
    eor      w9, w9, w12
    strb     w9, [x11, #0xd]
    ldrb     w9, [x10, #0xe]
    mov      w12, #0xa7
    eor      w9, w9, w12
    strb     w9, [x11, #0xe]
    ldrb     w9, [x10, #0xf]
    eor      w9, w9, #0xffffffdf
    strb     w9, [x11, #0xf]
    ldrb     w9, [x10, #0x10]
    mov      w12, #0x3d
    eor      w9, w9, w12
    strb     w9, [x11, #0x10]
    ldrb     w9, [x10, #0x11]
    mov      w12, #0xd
    eor      w9, w9, w12
    strb     w9, [x11, #0x11]
    ldrb     w9, [x10, #0x12]
    mov      w10, #0x2f
    eor      w9, w9, w10
    strb     w9, [x11, #0x12]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x23, sp, #0x30
    mov      sp, x23
    sub      x27, sp, #0x20
    mov      sp, x27
    sub      x28, sp, #0x20
    mov      sp, x28
    sub      x25, sp, #0x50
    mov      sp, x25
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf50]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2f9810
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x23]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    str      d8, [x23, #8]
    adrp     x8, #0x2f9000
    add      x8, x8, #0x888
    adrp     x9, #0x4a4000
    add      x9, x9, #0x618
    stp      x8, x9, [x23, #0x10]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    str      x20, [x23, #0x20]
    mov      x0, x23
    bl       #0x461cd8 // _objc_retainBlock
    stur     x0, [x29, #-0x80]
    adrp     x8, #0x544000
    add      x8, x8, #0xc10
    str      x24, [x27]
    adrp     x9, #0x544000
    add      x9, x9, #0xbd0
    stp      x8, x9, [x28]
    adrp     x22, #0x4c4000
    stur     x20, [x29, #-0x70]
    ldr      x20, [x22, #0xa8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x578]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    stur     x21, [x29, #-0x88]
    ldr      x21, [x8, #0x4f0]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x78]
    str      x0, [x27, #8]
    adrp     x8, #0x544000
    add      x8, x8, #0xc50
    str      x8, [x28, #0x10]
    ldr      x20, [x22, #0xa8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x740]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    str      x0, [x27, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    mov      x2, x27
    mov      x3, x28
    mov      w4, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x25]
    str      d8, [x25, #8]
    adrp     x8, #0x2f9000
    add      x8, x8, #0x968
    adrp     x9, #0x4a4000
    add      x9, x9, #0x6d8
    stp      x8, x9, [x25, #0x10]
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    ldur     x22, [x29, #-0x80]
    stp      x26, x22, [x25, #0x38]
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    ldur     x28, [x29, #-0x88]
    stp      x24, x28, [x25, #0x20]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x25, #0x30]
    adrp     x8, #0x4c1000
    ldr      x27, [x8, #0x738]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    adrp     x2, #0x544000
    add      x2, x2, #0xb90
    mov      x0, x28
    mov      x1, x27
    mov      x3, x21
    mov      x4, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldur     x20, [x29, #-0x70]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x78]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x20]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x40]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x38]
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, #0x20]
    bl       #0x461c9c // _objc_release
    b        #0x2f9828
    ldr      x8, [x26, #0x10]
    adrp     x2, #0x544000
    add      x2, x2, #0xc90
    mov      x0, x26
    mov      w1, #0
    blr      x8
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x68]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2f9884
    sub      sp, x29, #0x60
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      x26, x25, [sp, #0x20]
    ldp      x28, x27, [sp, #0x10]
    ldp      d9, d8, [sp], #0x70
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGGlassStore glassSignKey] IMP=0x2FA730 bounds=0x2FA730-0x2FA73C
loc_2FA730:
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x770]
    b        #0x461c6c // _objc_msgSend

// -[WCLGGlassStore glassMasterKey] IMP=0x2FA73C bounds=0x2FA73C-0x2FA94C
loc_2FA73C:
    adrp     x8, #0x580000
    add      x8, x8, #0x6b4
    ldar     w9, [x8]
    cbnz     w9, #0x2fa934
    adrp     x10, #0x545000
    add      x10, x10, #0x10
    ldrb     w11, [x10]
    adrp     x9, #0x545000
    add      x9, x9, #0x30
    mov      w12, #0x42
    eor      w11, w11, w12
    strb     w11, [x9]
    ldrb     w11, [x10, #1]
    eor      w11, w11, #0x10
    strb     w11, [x9, #1]
    ldrb     w11, [x10, #2]
    mov      w12, #0x15
    eor      w11, w11, w12
    strb     w11, [x9, #2]
    ldrb     w11, [x10, #3]
    mov      w12, #0xc9
    eor      w11, w11, w12
    strb     w11, [x9, #3]
    ldrb     w11, [x10, #4]
    mov      w12, #0x34
    eor      w11, w11, w12
    strb     w11, [x9, #4]
    ldrb     w11, [x10, #5]
    mov      w12, #0xb
    eor      w11, w11, w12
    strb     w11, [x9, #5]
    ldrb     w11, [x10, #6]
    eor      w11, w11, #8
    strb     w11, [x9, #6]
    ldrb     w11, [x10, #7]
    mov      w12, #0xc8
    eor      w11, w11, w12
    strb     w11, [x9, #7]
    ldrb     w11, [x10, #8]
    mov      w12, #0xb6
    eor      w11, w11, w12
    strb     w11, [x9, #8]
    ldrb     w12, [x10, #9]
    mov      w11, #0x24
    eor      w12, w12, w11
    strb     w12, [x9, #9]
    ldrb     w12, [x10, #0xa]
    mov      w13, #0x46
    eor      w12, w12, w13
    strb     w12, [x9, #0xa]
    ldrb     w12, [x10, #0xb]
    eor      w12, w12, #0x7e
    strb     w12, [x9, #0xb]
    ldrb     w12, [x10, #0xc]
    eor      w12, w12, #6
    strb     w12, [x9, #0xc]
    ldrb     w12, [x10, #0xd]
    eor      w12, w12, #0xffffffcf
    strb     w12, [x9, #0xd]
    ldrb     w12, [x10, #0xe]
    mov      w13, #0x39
    eor      w12, w12, w13
    strb     w12, [x9, #0xe]
    ldrb     w12, [x10, #0xf]
    mov      w13, #0xed
    eor      w12, w12, w13
    strb     w12, [x9, #0xf]
    ldrb     w12, [x10, #0x10]
    eor      w12, w12, #0xe
    strb     w12, [x9, #0x10]
    ldrb     w12, [x10, #0x11]
    eor      w12, w12, #0x3c
    strb     w12, [x9, #0x11]
    ldrb     w12, [x10, #0x12]
    eor      w12, w12, #0xffffffe3
    strb     w12, [x9, #0x12]
    ldrb     w12, [x10, #0x13]
    mov      w13, #0x23
    eor      w12, w12, w13
    strb     w12, [x9, #0x13]
    ldrb     w12, [x10, #0x14]
    mov      w13, #0x69
    eor      w12, w12, w13
    strb     w12, [x9, #0x14]
    ldrb     w12, [x10, #0x15]
    mov      w13, #0xaf
    eor      w12, w12, w13
    strb     w12, [x9, #0x15]
    ldrb     w12, [x10, #0x16]
    eor      w12, w12, #0xffffff9f
    strb     w12, [x9, #0x16]
    ldrb     w12, [x10, #0x17]
    mov      w13, #0x9b
    eor      w12, w12, w13
    strb     w12, [x9, #0x17]
    ldrb     w12, [x10, #0x18]
    mov      w13, #0x4d
    eor      w12, w12, w13
    strb     w12, [x9, #0x18]
    ldrb     w12, [x10, #0x19]
    mov      w13, #0xba
    eor      w12, w12, w13
    strb     w12, [x9, #0x19]
    ldrb     w12, [x10, #0x1a]
    mov      w13, #0xce
    eor      w12, w12, w13
    strb     w12, [x9, #0x1a]
    ldrb     w12, [x10, #0x1b]
    eor      w11, w12, w11
    strb     w11, [x9, #0x1b]
    ldrb     w11, [x10, #0x1c]
    mov      w12, #0xe9
    eor      w11, w11, w12
    strb     w11, [x9, #0x1c]
    ldrb     w11, [x10, #0x1d]
    mov      w12, #0xa1
    eor      w11, w11, w12
    strb     w11, [x9, #0x1d]
    ldrb     w11, [x10, #0x1e]
    mov      w12, #0x8a
    eor      w11, w11, w12
    strb     w11, [x9, #0x1e]
    ldrb     w10, [x10, #0x1f]
    mov      w11, #0x6a
    eor      w10, w10, w11
    strb     w10, [x9, #0x1f]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x0, #0x545000
    add      x0, x0, #0x30
    mov      w1, #0x20
    b        #0x2efdc8

// -[WCLGGlassStore revokeTheme:completion:] IMP=0x2FA94C bounds=0x2FA94C-0x2FADB8
loc_2FA94C:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    sub      sp, sp, #0x10
    mov      x19, x3
    mov      x21, x2
    mov      x20, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x48]
    adrp     x8, #0x580000
    add      x8, x8, #0x6b8
    ldar     w9, [x8]
    cbnz     w9, #0x2fac24
    adrp     x9, #0x545000
    add      x9, x9, #0x9e
    ldrh     w10, [x9]
    mov      w11, #0xae4d
    eor      w10, w10, w11
    adrp     x11, #0x545000
    add      x11, x11, #0xae
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x9285
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x71f0
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xed0b
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0xe5cf
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0xe096
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0x3c3e
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w9, [x9, #0xe]
    mov      w10, #0x8be6
    eor      w9, w9, w10
    strh     w9, [x11, #0xe]
    adrp     x9, #0x545000
    add      x9, x9, #0x93
    ldrb     w10, [x9]
    mov      w11, #0xd9
    eor      w10, w10, w11
    adrp     x11, #0x545000
    add      x11, x11, #0x98
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x14
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xfa
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0xe9
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0xe4
    eor      w9, w9, w10
    strb     w9, [x11, #4]
    adrp     x9, #0x545000
    add      x9, x9, #0x81
    ldrb     w10, [x9]
    mov      w11, #0xa7
    eor      w10, w10, w11
    adrp     x11, #0x545000
    add      x11, x11, #0x8a
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x1f
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x29
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x4c
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0xca
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0xf8
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0x28
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0x2c
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w9, [x9, #8]
    eor      w10, w9, #0x99999999
    adrp     x9, #0x545000
    add      x9, x9, #0x50
    strb     w10, [x11, #8]
    ldrb     w10, [x9]
    mov      w11, #0x45
    eor      w11, w10, w11
    adrp     x10, #0x545000
    add      x10, x10, #0x70
    strb     w11, [x10]
    ldrb     w11, [x9, #1]
    mov      w12, #0x24
    eor      w11, w11, w12
    strb     w11, [x10, #1]
    ldrb     w11, [x9, #2]
    mov      w12, #0xbc
    eor      w11, w11, w12
    strb     w11, [x10, #2]
    ldrb     w11, [x9, #3]
    mov      w12, #0xb6
    eor      w11, w11, w12
    strb     w11, [x10, #3]
    ldrb     w11, [x9, #4]
    mov      w13, #0x16
    eor      w11, w11, w13
    strb     w11, [x10, #4]
    ldrb     w11, [x9, #5]
    eor      w11, w11, w12
    strb     w11, [x10, #5]
    ldrb     w11, [x9, #6]
    mov      w12, #0xb5
    eor      w11, w11, w12
    strb     w11, [x10, #6]
    ldrb     w11, [x9, #7]
    mov      w12, #0xa9
    eor      w11, w11, w12
    strb     w11, [x10, #7]
    ldrb     w11, [x9, #8]
    mov      w12, #0x91
    eor      w11, w11, w12
    strb     w11, [x10, #8]
    ldrb     w11, [x9, #9]
    eor      w11, w11, #0x1c
    strb     w11, [x10, #9]
    ldrb     w11, [x9, #0xa]
    mov      w12, #0xd
    eor      w11, w11, w12
    strb     w11, [x10, #0xa]
    ldrb     w11, [x9, #0xb]
    mov      w13, #0xb7
    eor      w11, w11, w13
    strb     w11, [x10, #0xb]
    ldrb     w11, [x9, #0xc]
    mov      w13, #0xf6
    eor      w11, w11, w13
    strb     w11, [x10, #0xc]
    ldrb     w11, [x9, #0xd]
    eor      w11, w11, w12
    strb     w11, [x10, #0xd]
    ldrb     w11, [x9, #0xe]
    mov      w12, #0x86
    eor      w11, w11, w12
    strb     w11, [x10, #0xe]
    ldrb     w11, [x9, #0xf]
    eor      w11, w11, #0xffffffdf
    strb     w11, [x10, #0xf]
    ldrb     w9, [x9, #0x10]
    eor      w9, w9, #8
    strb     w9, [x10, #0x10]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x24, sp, #0x10
    mov      sp, x24
    sub      x25, sp, #0x10
    mov      sp, x25
    sub      x23, sp, #0x30
    mov      sp, x23
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf50]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x2fad58
    adrp     x8, #0x545000
    add      x8, x8, #0x160
    str      x22, [x24]
    adrp     x9, #0x545000
    add      x9, x9, #0x120
    stp      x8, x9, [x25]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f0]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    str      x0, [x24, #8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    mov      x2, x24
    mov      x3, x25
    mov      w4, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x23]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x23, #8]
    adrp     x8, #0x2fa000
    add      x8, x8, #0xdb8
    adrp     x9, #0x4a4000
    add      x9, x9, #0x708
    stp      x8, x9, [x23, #0x10]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    str      x19, [x23, #0x20]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x738]
    adrp     x2, #0x545000
    add      x2, x2, #0xe0
    mov      x0, x20
    mov      x3, x24
    mov      x4, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, #0x20]
    bl       #0x461c9c // _objc_release
    b        #0x2fad70
    ldr      x8, [x19, #0x10]
    adrp     x2, #0x545000
    add      x2, x2, #0x1a0
    mov      x0, x19
    mov      w1, #0
    blr      x8
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x48]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x2fadb4
    sub      sp, x29, #0x40
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGGlassStore setApiPubKey:] IMP=0x2FAEC0 bounds=0x2FAEC0-0x2FAEC8
loc_2FAEC0:
    str      x2, [x0, #8]
    ret      

// -[WCLGGlassStore setSignPubKey:] IMP=0x2FAEC8 bounds=0x2FAEC8-0x2FAED0
loc_2FAEC8:
    str      x2, [x0, #0x10]
    ret      
