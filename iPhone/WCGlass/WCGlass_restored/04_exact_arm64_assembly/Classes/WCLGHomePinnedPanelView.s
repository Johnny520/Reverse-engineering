// Exact ARM64 listing for WCLGHomePinnedPanelView

// +[WCLGHomePinnedPanelView rowDefinitions] IMP=0x3874DC bounds=0x3874DC-0x389868
loc_3874DC:
    stp      d11, d10, [sp, #-0x80]!
    stp      d9, d8, [sp, #0x10]
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    sub      sp, sp, #0x240
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x80]
    adrp     x8, #0x581000
    add      x8, x8, #0x9c0
    ldar     w9, [x8]
    cbnz     w9, #0x388284
    adrp     x10, #0x553000
    add      x10, x10, #0x5fc
    ldrb     w9, [x10]
    mov      w11, #0x29
    eor      w9, w9, w11
    adrp     x11, #0x553000
    add      x11, x11, #0x602
    strb     w9, [x11]
    ldrb     w12, [x10, #1]
    mov      w9, #0x9a
    eor      w12, w12, w9
    strb     w12, [x11, #1]
    ldrb     w12, [x10, #2]
    eor      w12, w12, #6
    strb     w12, [x11, #2]
    ldrb     w12, [x10, #3]
    mov      w13, #0xae
    eor      w12, w12, w13
    strb     w12, [x11, #3]
    ldrb     w12, [x10, #4]
    mov      w13, #0x9e
    eor      w12, w12, w13
    strb     w12, [x11, #4]
    ldrb     w10, [x10, #5]
    mov      w12, #0xcd
    eor      w10, w10, w12
    adrp     x12, #0x553000
    add      x12, x12, #0x5e2
    strb     w10, [x11, #5]
    ldrb     w10, [x12]
    eor      w10, w10, #0xf
    adrp     x11, #0x553000
    add      x11, x11, #0x5e8
    strb     w10, [x11]
    ldrb     w10, [x12, #1]
    mov      w13, #0x58
    eor      w10, w10, w13
    strb     w10, [x11, #1]
    ldrb     w10, [x12, #2]
    mov      w13, #0x73
    eor      w10, w10, w13
    strb     w10, [x11, #2]
    ldrb     w10, [x12, #3]
    eor      w10, w10, #0xfffffffb
    strb     w10, [x11, #3]
    ldrb     w10, [x12, #4]
    mov      w13, #0xec
    eor      w10, w10, w13
    strb     w10, [x11, #4]
    ldrb     w10, [x12, #5]
    mov      w12, #0x1a
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    adrp     x10, #0x553000
    add      x10, x10, #0x5ba
    ldrh     w11, [x10]
    mov      w12, #0x60e7
    eor      w11, w11, w12
    adrp     x12, #0x553000
    add      x12, x12, #0x5c8
    strh     w11, [x12]
    ldrh     w11, [x10, #2]
    mov      w13, #0x5645
    eor      w11, w11, w13
    strh     w11, [x12, #2]
    ldrh     w11, [x10, #4]
    mov      w13, #0xd3e1
    eor      w11, w11, w13
    strh     w11, [x12, #4]
    ldrh     w11, [x10, #6]
    mov      w13, #0x13aa
    eor      w11, w11, w13
    strh     w11, [x12, #6]
    ldrh     w11, [x10, #8]
    mov      w13, #0x9dc9
    eor      w11, w11, w13
    strh     w11, [x12, #8]
    ldrh     w11, [x10, #0xa]
    mov      w13, #0x76fa
    eor      w11, w11, w13
    strh     w11, [x12, #0xa]
    ldrh     w10, [x10, #0xc]
    mov      w11, #0x900c
    eor      w10, w10, w11
    strh     w10, [x12, #0xc]
    adrp     x10, #0x553000
    add      x10, x10, #0x5a8
    ldrb     w11, [x10]
    mov      w12, #0x86
    eor      w11, w11, w12
    adrp     x12, #0x553000
    add      x12, x12, #0x5b1
    strb     w11, [x12]
    ldrb     w11, [x10, #1]
    mov      w13, #0x39
    eor      w11, w11, w13
    strb     w11, [x12, #1]
    ldrb     w11, [x10, #2]
    eor      w11, w11, #0x44444444
    strb     w11, [x12, #2]
    ldrb     w11, [x10, #3]
    mov      w13, #0xde
    eor      w11, w11, w13
    strb     w11, [x12, #3]
    ldrb     w11, [x10, #4]
    mov      w13, #0x8e
    eor      w11, w11, w13
    strb     w11, [x12, #4]
    ldrb     w11, [x10, #5]
    mov      w13, #0x52
    eor      w11, w11, w13
    strb     w11, [x12, #5]
    ldrb     w11, [x10, #6]
    mov      w13, #0xa6
    eor      w11, w11, w13
    strb     w11, [x12, #6]
    ldrb     w11, [x10, #7]
    mov      w13, #0x96
    eor      w11, w11, w13
    strb     w11, [x12, #7]
    ldrb     w10, [x10, #8]
    mov      w11, #0xea
    eor      w10, w10, w11
    strb     w10, [x12, #8]
    adrp     x10, #0x553000
    add      x10, x10, #0x59e
    ldrb     w11, [x10]
    eor      w11, w11, #0xffffffc3
    adrp     x12, #0x553000
    add      x12, x12, #0x5a3
    strb     w11, [x12]
    ldrb     w11, [x10, #1]
    eor      w11, w11, #0x44444444
    strb     w11, [x12, #1]
    ldrb     w11, [x10, #2]
    mov      w13, #0xa5
    eor      w11, w11, w13
    strb     w11, [x12, #2]
    ldrb     w11, [x10, #3]
    mov      w13, #0x6c
    eor      w11, w11, w13
    strb     w11, [x12, #3]
    ldrb     w10, [x10, #4]
    mov      w11, #0xe9
    eor      w10, w10, w11
    strb     w10, [x12, #4]
    adrp     x11, #0x553000
    add      x11, x11, #0x590
    ldrb     w10, [x11]
    mov      w12, #0x9c
    eor      w10, w10, w12
    adrp     x12, #0x553000
    add      x12, x12, #0x597
    strb     w10, [x12]
    ldrb     w10, [x11, #1]
    mov      w14, #0xdc
    eor      w10, w10, w14
    strb     w10, [x12, #1]
    ldrb     w10, [x11, #2]
    eor      w10, w10, w13
    strb     w10, [x12, #2]
    ldrb     w13, [x11, #3]
    mov      w10, #0x67
    eor      w13, w13, w10
    strb     w13, [x12, #3]
    ldrb     w13, [x11, #4]
    eor      w13, w13, #0x3f
    strb     w13, [x12, #4]
    ldrb     w13, [x11, #5]
    mov      w14, #0xd
    eor      w13, w13, w14
    strb     w13, [x12, #5]
    ldrb     w11, [x11, #6]
    mov      w13, #0xb7
    eor      w11, w11, w13
    strb     w11, [x12, #6]
    adrp     x11, #0x553000
    add      x11, x11, #0x568
    ldrh     w12, [x11]
    mov      w13, #0xd837
    eor      w12, w12, w13
    adrp     x13, #0x553000
    add      x13, x13, #0x572
    strh     w12, [x13]
    ldrh     w12, [x11, #2]
    mov      w14, #0x53a0
    eor      w12, w12, w14
    strh     w12, [x13, #2]
    ldrh     w12, [x11, #4]
    mov      w14, #0xee78
    eor      w12, w12, w14
    strh     w12, [x13, #4]
    ldrh     w12, [x11, #6]
    mov      w14, #0xc676
    eor      w12, w12, w14
    strh     w12, [x13, #6]
    ldrh     w11, [x11, #8]
    mov      w12, #0x6077
    eor      w11, w11, w12
    strh     w11, [x13, #8]
    adrp     x11, #0x553000
    add      x11, x11, #0x558
    ldrb     w12, [x11]
    mov      w13, #5
    eor      w12, w12, w13
    adrp     x13, #0x553000
    add      x13, x13, #0x55c
    strb     w12, [x13]
    ldrb     w12, [x11, #1]
    eor      w12, w12, #0x1e
    strb     w12, [x13, #1]
    ldrb     w12, [x11, #2]
    mov      w14, #0x15
    eor      w12, w12, w14
    strb     w12, [x13, #2]
    ldrb     w11, [x11, #3]
    eor      w11, w11, #0xfffffffb
    strb     w11, [x13, #3]
    adrp     x12, #0x553000
    add      x12, x12, #0x5ee
    ldrb     w11, [x12]
    mov      w13, #0xcb
    eor      w11, w11, w13
    adrp     x13, #0x553000
    add      x13, x13, #0x5f5
    strb     w11, [x13]
    ldrb     w11, [x12, #1]
    mov      w14, #9
    eor      w11, w11, w14
    strb     w11, [x13, #1]
    ldrb     w11, [x12, #2]
    mov      w14, #0x5f
    eor      w11, w11, w14
    strb     w11, [x13, #2]
    ldrb     w11, [x12, #3]
    mov      w14, #0x4a
    eor      w11, w11, w14
    strb     w11, [x13, #3]
    ldrb     w11, [x12, #4]
    eor      w11, w11, #0x3e
    strb     w11, [x13, #4]
    ldrb     w14, [x12, #5]
    mov      w11, #0x13
    eor      w14, w14, w11
    strb     w14, [x13, #5]
    ldrb     w12, [x12, #6]
    mov      w14, #0x2e
    eor      w12, w12, w14
    adrp     x14, #0x553000
    add      x14, x14, #0x538
    strb     w12, [x13, #6]
    ldrh     w12, [x14]
    mov      w13, #0xb3ad
    eor      w12, w12, w13
    adrp     x13, #0x553000
    add      x13, x13, #0x548
    strh     w12, [x13]
    ldrh     w12, [x14, #2]
    mov      w15, #0x9ac7
    eor      w12, w12, w15
    strh     w12, [x13, #2]
    ldrh     w12, [x14, #4]
    mov      w15, #0x803c
    eor      w12, w12, w15
    strh     w12, [x13, #4]
    ldrh     w12, [x14, #6]
    mov      w15, #0xf98b
    eor      w12, w12, w15
    strh     w12, [x13, #6]
    ldrh     w12, [x14, #8]
    mov      w15, #0xa7
    eor      w12, w12, w15
    strh     w12, [x13, #8]
    ldrh     w12, [x14, #0xa]
    mov      w15, #0xcfb7
    eor      w12, w12, w15
    strh     w12, [x13, #0xa]
    ldrh     w12, [x14, #0xc]
    mov      w15, #0x9788
    eor      w12, w12, w15
    strh     w12, [x13, #0xc]
    ldrh     w12, [x14, #0xe]
    mov      w14, #0x539f
    eor      w12, w12, w14
    adrp     x14, #0x553000
    add      x14, x14, #0x528
    strh     w12, [x13, #0xe]
    ldrh     w12, [x14]
    mov      w13, #0xa664
    eor      w12, w12, w13
    adrp     x13, #0x553000
    add      x13, x13, #0x530
    strh     w12, [x13]
    ldrh     w12, [x14, #2]
    mov      w15, #0x8367
    eor      w12, w12, w15
    strh     w12, [x13, #2]
    ldrh     w12, [x14, #4]
    mov      w15, #0x6826
    eor      w12, w12, w15
    strh     w12, [x13, #4]
    ldrh     w12, [x14, #6]
    mov      w14, #0xf4c2
    eor      w12, w12, w14
    strh     w12, [x13, #6]
    adrp     x13, #0x553000
    add      x13, x13, #0x434
    ldrb     w14, [x13]
    mov      w12, #0x4d
    eor      w14, w14, w12
    adrp     x15, #0x553000
    add      x15, x15, #0x439
    strb     w14, [x15]
    ldrb     w14, [x13, #1]
    eor      w14, w14, #0xffffffe7
    strb     w14, [x15, #1]
    ldrb     w14, [x13, #2]
    eor      w14, w14, #0xffffffef
    strb     w14, [x15, #2]
    ldrb     w14, [x13, #3]
    eor      w14, w14, #0x40
    strb     w14, [x15, #3]
    ldrb     w13, [x13, #4]
    mov      w14, #0x6f
    eor      w13, w13, w14
    strb     w13, [x15, #4]
    adrp     x13, #0x553000
    add      x13, x13, #0x4f0
    ldrb     w14, [x13]
    mov      w15, #0x56
    eor      w14, w14, w15
    adrp     x15, #0x553000
    add      x15, x15, #0x4f3
    strb     w14, [x15]
    ldrb     w14, [x13, #1]
    mov      w16, #0x7b
    eor      w14, w14, w16
    strb     w14, [x15, #1]
    ldrb     w13, [x13, #2]
    eor      w13, w13, #0xffffffc3
    strb     w13, [x15, #2]
    adrp     x13, #0x553000
    add      x13, x13, #0x50a
    ldrb     w14, [x13]
    adrp     x15, #0x553000
    add      x15, x15, #0x50f
    eor      w11, w14, w11
    strb     w11, [x15]
    ldrb     w11, [x13, #1]
    mov      w14, #0xca
    eor      w11, w11, w14
    strb     w11, [x15, #1]
    ldrb     w11, [x13, #2]
    mov      w14, #0x92
    eor      w11, w11, w14
    strb     w11, [x15, #2]
    ldrb     w11, [x13, #3]
    mov      w14, #0x48
    eor      w11, w11, w14
    strb     w11, [x15, #3]
    ldrb     w11, [x13, #4]
    eor      w11, w11, #0xffffffcf
    adrp     x13, #0x553000
    add      x13, x13, #0x514
    strb     w11, [x15, #4]
    ldrh     w11, [x13]
    mov      w14, #0xcc5b
    eor      w11, w11, w14
    adrp     x14, #0x553000
    add      x14, x14, #0x51e
    strh     w11, [x14]
    ldrh     w11, [x13, #2]
    mov      w15, #0xb1b6
    eor      w11, w11, w15
    strh     w11, [x14, #2]
    ldrh     w11, [x13, #4]
    mov      w15, #0x21eb
    eor      w11, w11, w15
    strh     w11, [x14, #4]
    ldrh     w11, [x13, #6]
    mov      w15, #0xa8d2
    eor      w11, w11, w15
    strh     w11, [x14, #6]
    ldrh     w11, [x13, #8]
    mov      w13, #0xd278
    eor      w11, w11, w13
    adrp     x13, #0x553000
    add      x13, x13, #0x502
    strh     w11, [x14, #8]
    ldrb     w11, [x13]
    eor      w11, w11, #0xffffffdf
    adrp     x14, #0x553000
    add      x14, x14, #0x506
    strb     w11, [x14]
    ldrb     w11, [x13, #1]
    eor      w9, w11, w9
    strb     w9, [x14, #1]
    ldrb     w9, [x13, #2]
    mov      w11, #0xc5
    eor      w9, w9, w11
    strb     w9, [x14, #2]
    ldrb     w9, [x13, #3]
    eor      w9, w9, w12
    strb     w9, [x14, #3]
    adrp     x9, #0x553000
    add      x9, x9, #0x5d6
    ldrh     w11, [x9]
    mov      w12, #0x749a
    eor      w11, w11, w12
    adrp     x12, #0x553000
    add      x12, x12, #0x5dc
    strh     w11, [x12]
    ldrh     w11, [x9, #2]
    mov      w13, #0xb28
    eor      w11, w11, w13
    strh     w11, [x12, #2]
    ldrh     w9, [x9, #4]
    mov      w11, #0x12d8
    eor      w9, w9, w11
    strh     w9, [x12, #4]
    adrp     x9, #0x553000
    add      x9, x9, #0x43e
    ldrb     w11, [x9]
    mov      w12, #0x61
    eor      w11, w11, w12
    adrp     x12, #0x553000
    add      x12, x12, #0x445
    strb     w11, [x12]
    ldrb     w11, [x9, #1]
    mov      w13, #0xc4
    eor      w11, w11, w13
    strb     w11, [x12, #1]
    ldrb     w11, [x9, #2]
    mov      w13, #0x31
    eor      w11, w11, w13
    strb     w11, [x12, #2]
    ldrb     w11, [x9, #3]
    mov      w13, #0x47
    eor      w11, w11, w13
    strb     w11, [x12, #3]
    ldrb     w11, [x9, #4]
    eor      w11, w11, #0x77777777
    strb     w11, [x12, #4]
    ldrb     w11, [x9, #5]
    mov      w13, #0x4c
    eor      w11, w11, w13
    strb     w11, [x12, #5]
    ldrb     w9, [x9, #6]
    eor      w9, w9, #0xffffff87
    strb     w9, [x12, #6]
    adrp     x9, #0x553000
    add      x9, x9, #0x4f6
    ldrb     w11, [x9]
    mov      w12, #0x43
    eor      w11, w11, w12
    adrp     x12, #0x553000
    add      x12, x12, #0x4fc
    strb     w11, [x12]
    ldrb     w11, [x9, #1]
    eor      w11, w11, #0xfffffff9
    strb     w11, [x12, #1]
    ldrb     w11, [x9, #2]
    eor      w10, w11, w10
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0x3c
    strb     w10, [x12, #3]
    ldrb     w10, [x9, #4]
    mov      w11, #0xf2
    eor      w10, w10, w11
    strb     w10, [x12, #4]
    ldrb     w9, [x9, #5]
    eor      w9, w9, #0xffffff87
    strb     w9, [x12, #5]
    adrp     x9, #0x553000
    add      x9, x9, #0x57c
    ldrh     w10, [x9]
    mov      w11, #0x7947
    eor      w10, w10, w11
    adrp     x11, #0x553000
    add      x11, x11, #0x586
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x393c
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xa180
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xd315
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x1895
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x553000
    add      x9, x9, #0x4d0
    ldrh     w10, [x9]
    mov      w11, #0x7c43
    eor      w10, w10, w11
    adrp     x11, #0x553000
    add      x11, x11, #0x4e0
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x2258
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x2654
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x76e7
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x7f0b
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0x1005
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0x5bd1
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w9, [x9, #0xe]
    mov      w10, #0xda30
    eor      w9, w9, w10
    strh     w9, [x11, #0xe]
    adrp     x9, #0x553000
    add      x9, x9, #0x49c
    ldrh     w10, [x9]
    mov      w11, #0x6090
    eor      w10, w10, w11
    adrp     x11, #0x553000
    add      x11, x11, #0x4a6
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xf41e
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x6974
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xcf
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0xe490
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x553000
    add      x9, x9, #0x488
    ldrh     w10, [x9]
    mov      w11, #0xbd22
    eor      w10, w10, w11
    adrp     x11, #0x553000
    add      x11, x11, #0x492
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x901c
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x109d
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xb4ba
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x8251
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x553000
    add      x9, x9, #0x474
    ldrh     w10, [x9]
    mov      w11, #0xb6bd
    eor      w10, w10, w11
    adrp     x11, #0x553000
    add      x11, x11, #0x47e
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x8e9f
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x68f8
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x28f5
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x9d58
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x553000
    add      x9, x9, #0x400
    ldrh     w10, [x9]
    mov      w11, #0x9cd1
    eor      w10, w10, w11
    adrp     x11, #0x553000
    add      x11, x11, #0x410
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x93a0
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x994
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xa76e
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x448c
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0x9f64
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w10, [x9, #0xc]
    mov      w12, #0x3f2d
    eor      w10, w10, w12
    strh     w10, [x11, #0xc]
    ldrh     w9, [x9, #0xe]
    mov      w10, #0x5ca2
    eor      w9, w9, w10
    strh     w9, [x11, #0xe]
    adrp     x9, #0x553000
    add      x9, x9, #0x3ec
    ldrh     w10, [x9]
    mov      w11, #0x5cb5
    eor      w10, w10, w11
    adrp     x11, #0x553000
    add      x11, x11, #0x3f6
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xf10a
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xdfa2
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x75db
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x9870
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x553000
    add      x9, x9, #0x420
    ldrh     w10, [x9]
    mov      w11, #0x7dde
    eor      w10, w10, w11
    adrp     x11, #0x553000
    add      x11, x11, #0x42a
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x9508
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xd234
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xbfc4
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x15c2
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x553000
    add      x9, x9, #0x4b0
    ldrh     w10, [x9]
    mov      w11, #0xd4c
    eor      w10, w10, w11
    adrp     x11, #0x553000
    add      x11, x11, #0x4ba
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xb911
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xbb8f
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xba2d
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x9d7f
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x553000
    add      x9, x9, #0x44c
    ldrh     w10, [x9]
    mov      w11, #0x9ffe
    eor      w10, w10, w11
    adrp     x11, #0x553000
    add      x11, x11, #0x456
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x7b3d
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x350e
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x21ec
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x6264
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x553000
    add      x9, x9, #0x3d8
    ldrh     w10, [x9]
    mov      w11, #0x2970
    eor      w10, w10, w11
    adrp     x11, #0x553000
    add      x11, x11, #0x3e2
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x7c82
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x2c73
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xbed9
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x875c
    eor      w9, w9, w10
    strh     w9, [x11, #8]
    adrp     x9, #0x553000
    add      x9, x9, #0x560
    ldrb     w10, [x9]
    mov      w11, #0x24
    eor      w10, w10, w11
    adrp     x11, #0x553000
    add      x11, x11, #0x564
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x94
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x2c
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w9, [x9, #3]
    mov      w10, #0x65
    eor      w9, w9, w10
    strb     w9, [x11, #3]
    adrp     x9, #0x553000
    add      x9, x9, #0x3d0
    ldrb     w10, [x9]
    mov      w11, #0xad
    eor      w10, w10, w11
    adrp     x11, #0x553000
    add      x11, x11, #0x3d4
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xc0
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xffffffe1
    strb     w10, [x11, #2]
    ldrb     w9, [x9, #3]
    mov      w10, #0x4f
    eor      w9, w9, w10
    strb     w9, [x11, #3]
    adrp     x9, #0x553000
    add      x9, x9, #0x4c8
    ldrb     w10, [x9]
    mov      w11, #0xc2
    eor      w10, w10, w11
    adrp     x11, #0x553000
    add      x11, x11, #0x4cc
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x6d
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xd1
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w9, [x9, #3]
    mov      w10, #0xc8
    eor      w9, w9, w10
    strb     w9, [x11, #3]
    adrp     x9, #0x553000
    add      x9, x9, #0x4c4
    ldrb     w10, [x9]
    mov      w11, #0x49
    adrp     x12, #0x553000
    add      x12, x12, #0x4c6
    eor      w10, w10, w11
    strb     w10, [x12]
    ldrb     w9, [x9, #1]
    mov      w10, #0xb6
    eor      w9, w9, w10
    strb     w9, [x12, #1]
    adrp     x9, #0x553000
    add      x9, x9, #0x460
    ldrh     w10, [x9]
    mov      w11, #0x961b
    adrp     x12, #0x553000
    add      x12, x12, #0x46a
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x37a
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0xdb9c
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0xfb15
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w9, [x9, #8]
    mov      w10, #0x1a36
    eor      w9, w9, w10
    strh     w9, [x12, #8]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x8, sp
    sub      x9, x29, #0x1b0
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x80
    stur     x8, [x29, #-0xa0]
    mov      sp, x8
    mov      x19, sp
    sub      x8, x19, #0x20
    stur     x8, [x29, #-0x90]
    mov      sp, x8
    mov      x26, sp
    sub      x8, x26, #0x20
    stur     x8, [x29, #-0x98]
    mov      sp, x8
    mov      x27, sp
    sub      x8, x27, #0x40
    stur     x8, [x29, #-0xc0]
    mov      sp, x8
    mov      x25, sp
    sub      x8, x25, #0x40
    stur     x8, [x29, #-0xc8]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x28
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x20
    stur     x8, [x29, #-0xd8]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #8
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x20
    stur     x8, [x29, #-0xe0]
    mov      sp, x8
    mov      x8, sp
    stur     x8, [x29, #-0xe8]
    sub      x8, x8, #0x10
    stur     x8, [x29, #-0xd0]
    mov      sp, x8
    mov      x21, sp
    sub      x8, x21, #0x40
    sub      x9, x29, #0x30
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x24, sp
    sub      x8, x24, #0x40
    sub      x9, x29, #0x38
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x1a0
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x40
    sub      x9, x29, #0x90
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x1a8
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x40
    sub      x9, x29, #0xa8
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x190
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x20
    sub      x9, x29, #0xb0
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x198
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x20
    sub      x9, x29, #0xc8
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x158
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x20
    sub      x9, x29, #0xe0
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x188
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x20
    sub      x9, x29, #0xe8
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x120
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x10
    sub      x9, x29, #0x100
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x130
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x10
    sub      x9, x29, #0x118
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x178
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x40
    sub      x9, x29, #0x160
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x180
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x40
    sub      x9, x29, #0x168
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x150
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x20
    sub      x9, x29, #0x138
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x170
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x20
    sub      x9, x29, #0x140
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x128
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x40
    sub      x9, x29, #0xf8
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x148
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x40
    sub      x9, x29, #0x108
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0xf0
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x40
    sub      x9, x29, #0xc0
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x110
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x40
    sub      x9, x29, #0xd0
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0xb8
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x40
    sub      x9, x29, #0x80
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0xd8
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x40
    sub      x9, x29, #0x88
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x78
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x40
    sub      x9, x29, #0x48
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x98
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x40
    sub      x9, x29, #0x50
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x40
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x40
    sub      x9, x29, #0x10
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x58
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x40
    sub      x9, x29, #0x18
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    mov      x8, sp
    stur     x8, [x29, #-0x100]
    sub      x8, x8, #0x20
    stur     x8, [x29, #-0xf0]
    mov      sp, x8
    mov      x8, sp
    sub      x9, x29, #0x20
    stur     x8, [x9, #-0x100]
    sub      x8, x8, #0x20
    stur     x8, [x29, #-0xf8]
    mov      sp, x8
    adrp     x8, #0x553000
    add      x8, x8, #0xa30
    stur     x8, [x26, #-0x20]
    adrp     x20, #0x4c4000
    ldr      x0, [x20, #0xa8]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x4f0]
    mov      x1, x23
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x88]
    adrp     x28, #0x553000
    add      x28, x28, #0xcf0
    adrp     x8, #0x553000
    add      x8, x8, #0xeb0
    stp      x0, x8, [x19, #-0x20]
    adrp     x10, #0x553000
    add      x10, x10, #0xcb0
    adrp     x8, #0x553000
    add      x8, x8, #0xe30
    stp      x28, x10, [x26, #-0x18]
    stur     x8, [x19, #-0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x22, [x8, #0x108]
    mov      x1, x22
    ldp      x3, x2, [x29, #-0x98]
    mov      w4, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x90]
    sub      x8, x29, #0x1b0
    ldur     x19, [x8, #-0x100]
    stur     x0, [x19, #-0x80]
    adrp     x8, #0x553000
    add      x8, x8, #0xa30
    stur     x8, [x25, #-0x40]
    ldr      x0, [x20, #0xa8]
    mov      x1, x23
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x98]
    adrp     x8, #0x553000
    add      x8, x8, #0xdb0
    stp      x0, x8, [x27, #-0x40]
    adrp     x8, #0x553000
    add      x8, x8, #0xbf0
    stp      x28, x8, [x25, #-0x38]
    adrp     x8, #0x4a3000
    add      x8, x8, #0xd58
    ldr      x8, [x8]
    stur     x8, [x27, #-0x30]
    adrp     x8, #0x553000
    add      x8, x8, #0xd30
    stur     x8, [x25, #-0x28]
    ldr      x0, [x20, #0xa8]
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x498]
    mov      x8, #0x4042000000000000
    fmov     d0, x8
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xa8]
    stur     x0, [x27, #-0x28]
    adrp     x8, #0x553000
    add      x8, x8, #0xab0
    stur     x8, [x25, #-0x20]
    ldr      x0, [x20, #0xa8]
    mov      x8, #0x4058000000000000
    fmov     d0, x8
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb0]
    stur     x0, [x27, #-0x20]
    adrp     x8, #0x553000
    add      x8, x8, #0xaf0
    stur     x8, [x25, #-0x18]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #2.00000000
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb8]
    adrp     x8, #0x553000
    add      x8, x8, #0xbb0
    stur     x8, [x25, #-0x10]
    adrp     x8, #0x553000
    add      x8, x8, #0xa70
    stp      x0, x8, [x27, #-0x18]
    adrp     x27, #0x4c4000
    ldr      x0, [x27, #0x208]
    mov      x1, x22
    ldp      x3, x2, [x29, #-0xc8]
    mov      w4, #7
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xc0]
    mov      x25, x19
    stur     x0, [x19, #-0x78]
    adrp     x8, #0x553000
    add      x8, x8, #0xa30
    sub      x9, x29, #8
    ldur     x19, [x9, #-0x100]
    stur     x8, [x19, #-0x20]
    ldr      x0, [x20, #0xa8]
    mov      x28, x23
    mov      x1, x23
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xc8]
    adrp     x8, #0x553000
    add      x8, x8, #0x9f0
    sub      x9, x29, #0x28
    ldur     x23, [x9, #-0x100]
    stp      x0, x8, [x23, #-0x20]
    adrp     x8, #0x553000
    add      x8, x8, #0xd70
    adrp     x10, #0x553000
    add      x10, x10, #0xcf0
    stp      x10, x8, [x19, #-0x18]
    adrp     x8, #0x553000
    add      x8, x8, #0x9b0
    adrp     x9, #0x553000
    add      x9, x9, #0xdf0
    ldur     x10, [x29, #-0xe8]
    stp      x8, x9, [x10, #-0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    sub      x8, x29, #0xa0
    stur     x1, [x8, #-0x100]
    ldur     x2, [x29, #-0xd0]
    mov      w3, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xd0]
    stur     x0, [x23, #-0x10]
    ldr      x0, [x27, #0x208]
    mov      x1, x22
    ldp      x3, x2, [x29, #-0xe0]
    mov      w4, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xd8]
    stur     x0, [x25, #-0x70]
    adrp     x8, #0x553000
    add      x8, x8, #0xa30
    stur     x8, [x24, #-0x40]
    ldr      x0, [x20, #0xa8]
    mov      x1, x28
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xe0]
    adrp     x8, #0x553000
    add      x8, x8, #0xc30
    stp      x0, x8, [x21, #-0x40]
    adrp     x8, #0x553000
    add      x8, x8, #0xcf0
    adrp     x27, #0x553000
    add      x27, x27, #0xbf0
    stp      x8, x27, [x24, #-0x38]
    adrp     x8, #0x4a3000
    add      x8, x8, #0xdd8
    ldr      x8, [x8]
    stur     x8, [x21, #-0x30]
    adrp     x8, #0x553000
    add      x8, x8, #0xd30
    stur     x8, [x24, #-0x28]
    ldr      x0, [x20, #0xa8]
    adrp     x8, #0x492000
    ldr      d0, [x8, #0x280]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xe8]
    stur     x0, [x21, #-0x28]
    adrp     x8, #0x553000
    add      x8, x8, #0xab0
    stur     x8, [x24, #-0x20]
    ldr      x0, [x20, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x690]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #8
    stur     x0, [x8, #-0x100]
    stur     x0, [x21, #-0x20]
    adrp     x23, #0x553000
    add      x23, x23, #0xaf0
    stur     x23, [x24, #-0x18]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #2.00000000
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x28
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0xbb0
    stur     x8, [x24, #-0x10]
    adrp     x24, #0x553000
    add      x24, x24, #0xa70
    stp      x0, x24, [x21, #-0x18]
    adrp     x21, #0x4c4000
    ldr      x0, [x21, #0x208]
    mov      x1, x22
    sub      x8, x29, #0x30
    ldur     x2, [x8, #-0x100]
    sub      x8, x29, #0x38
    ldur     x3, [x8, #-0x100]
    mov      w4, #7
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x30
    stur     x0, [x8, #-0x100]
    stur     x0, [x25, #-0x68]
    sub      x8, x29, #0x1a8
    ldur     x19, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0xa30
    stur     x8, [x19, #-0x40]
    ldr      x0, [x20, #0xa8]
    mov      x1, x28
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x38
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0x970
    sub      x9, x29, #0x1a0
    ldur     x9, [x9, #-0x100]
    stp      x0, x8, [x9, #-0x40]
    adrp     x8, #0x553000
    add      x8, x8, #0xcf0
    stp      x8, x27, [x19, #-0x38]
    adrp     x8, #0x4a3000
    add      x8, x8, #0xde0
    ldr      x8, [x8]
    stur     x8, [x9, #-0x30]
    mov      x27, x9
    adrp     x8, #0x553000
    add      x8, x8, #0xd30
    stur     x8, [x19, #-0x28]
    ldr      x0, [x20, #0xa8]
    adrp     x8, #0x492000
    ldr      d8, [x8, #0x1a8]
    mov      x1, x26
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x60
    stur     x0, [x8, #-0x100]
    stur     x0, [x27, #-0x28]
    adrp     x8, #0x553000
    add      x8, x8, #0xab0
    stur     x8, [x19, #-0x20]
    ldr      x0, [x20, #0xa8]
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x8d0]
    mov      x1, x26
    fmov     d0, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x68
    stur     x0, [x8, #-0x100]
    stur     x0, [x27, #-0x20]
    stur     x23, [x19, #-0x18]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #2.00000000
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x70
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0xbb0
    stur     x8, [x19, #-0x10]
    stp      x0, x24, [x27, #-0x18]
    ldr      x0, [x21, #0x208]
    mov      x19, x22
    mov      x1, x22
    sub      x8, x29, #0x90
    ldur     x2, [x8, #-0x100]
    sub      x8, x29, #0xa8
    ldur     x3, [x8, #-0x100]
    mov      w4, #7
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x90
    stur     x0, [x8, #-0x100]
    mov      x24, x25
    stur     x0, [x25, #-0x60]
    sub      x8, x29, #0x198
    ldur     x23, [x8, #-0x100]
    adrp     x27, #0x553000
    add      x27, x27, #0xa30
    stur     x27, [x23, #-0x20]
    ldr      x0, [x20, #0xa8]
    mov      x1, x28
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xa8
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0x830
    sub      x9, x29, #0x190
    ldur     x9, [x9, #-0x100]
    stp      x0, x8, [x9, #-0x20]
    mov      x8, x23
    adrp     x25, #0x553000
    add      x25, x25, #0xcf0
    stur     x25, [x23, #-0x18]
    adrp     x23, #0x553000
    add      x23, x23, #0xcb0
    stur     x23, [x8, #-0x10]
    adrp     x8, #0x553000
    add      x8, x8, #0x8f0
    stur     x8, [x9, #-0x10]
    ldr      x0, [x21, #0x208]
    mov      x22, x21
    mov      x1, x19
    sub      x8, x29, #0xb0
    ldur     x2, [x8, #-0x100]
    sub      x8, x29, #0xc8
    ldur     x3, [x8, #-0x100]
    mov      w4, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xb0
    stur     x0, [x8, #-0x100]
    stur     x0, [x24, #-0x58]
    sub      x8, x29, #0x188
    ldur     x21, [x8, #-0x100]
    stur     x27, [x21, #-0x20]
    ldr      x0, [x20, #0xa8]
    mov      x1, x28
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xc8
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0x8b0
    sub      x9, x29, #0x158
    ldur     x9, [x9, #-0x100]
    stp      x0, x8, [x9, #-0x20]
    stp      x25, x23, [x21, #-0x18]
    adrp     x8, #0x553000
    add      x8, x8, #0x870
    stur     x8, [x9, #-0x10]
    ldr      x0, [x22, #0x208]
    mov      x1, x19
    sub      x8, x29, #0xe0
    ldur     x2, [x8, #-0x100]
    sub      x8, x29, #0xe8
    ldur     x3, [x8, #-0x100]
    mov      w4, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xe0
    stur     x0, [x8, #-0x100]
    stur     x0, [x24, #-0x50]
    sub      x8, x29, #0x130
    ldur     x21, [x8, #-0x100]
    stur     x27, [x21, #-0x10]
    ldr      x0, [x20, #0xa8]
    mov      x1, x28
    mov      w2, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xe8
    stur     x0, [x8, #-0x100]
    stur     x25, [x21, #-8]
    mov      x23, x25
    adrp     x8, #0x553000
    add      x8, x8, #0xe70
    sub      x9, x29, #0x120
    ldur     x9, [x9, #-0x100]
    stp      x0, x8, [x9, #-0x10]
    ldr      x0, [x22, #0x208]
    mov      x1, x19
    mov      x25, x19
    sub      x8, x29, #0x100
    ldur     x2, [x8, #-0x100]
    sub      x8, x29, #0x118
    ldur     x3, [x8, #-0x100]
    mov      w4, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x100
    stur     x0, [x8, #-0x100]
    stur     x0, [x24, #-0x48]
    mov      x19, x24
    sub      x8, x29, #0x180
    ldur     x21, [x8, #-0x100]
    stur     x27, [x21, #-0x40]
    ldr      x0, [x20, #0xa8]
    mov      x1, x28
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x118
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0x7f0
    sub      x9, x29, #0x178
    ldur     x9, [x9, #-0x100]
    stp      x0, x8, [x9, #-0x40]
    mov      x10, x21
    adrp     x27, #0x553000
    add      x27, x27, #0xbf0
    stp      x23, x27, [x21, #-0x38]
    adrp     x8, #0x4a3000
    add      x8, x8, #0xd90
    ldr      x8, [x8]
    stur     x8, [x9, #-0x30]
    mov      x21, x9
    adrp     x8, #0x553000
    add      x8, x8, #0xd30
    stur     x8, [x10, #-0x28]
    mov      x24, x10
    ldr      x0, [x20, #0xa8]
    fmov     d0, xzr
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x120
    stur     x0, [x8, #-0x100]
    stur     x0, [x21, #-0x28]
    adrp     x8, #0x553000
    add      x8, x8, #0xab0
    stur     x8, [x24, #-0x20]
    ldr      x0, [x20, #0xa8]
    mov      x8, #0x4059000000000000
    fmov     d0, x8
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x130
    stur     x0, [x8, #-0x100]
    stur     x0, [x21, #-0x20]
    adrp     x8, #0x553000
    add      x8, x8, #0xaf0
    stur     x8, [x24, #-0x18]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #5.00000000
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x158
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0xbb0
    stur     x8, [x24, #-0x10]
    adrp     x8, #0x4a6000
    add      x8, x8, #0xd8
    stp      x0, x8, [x21, #-0x18]
    mov      x24, x22
    ldr      x0, [x22, #0x208]
    mov      x1, x25
    sub      x8, x29, #0x160
    ldur     x2, [x8, #-0x100]
    sub      x8, x29, #0x168
    ldur     x3, [x8, #-0x100]
    mov      w4, #7
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x160
    stur     x0, [x8, #-0x100]
    stur     x0, [x19, #-0x40]
    sub      x8, x29, #0x170
    ldur     x21, [x8, #-0x100]
    adrp     x22, #0x553000
    add      x22, x22, #0xa30
    stur     x22, [x21, #-0x20]
    ldr      x0, [x20, #0xa8]
    mov      x1, x28
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x168
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0x7b0
    sub      x9, x29, #0x150
    ldur     x9, [x9, #-0x100]
    stp      x0, x8, [x9, #-0x20]
    adrp     x10, #0x553000
    add      x10, x10, #0x770
    stp      x23, x10, [x21, #-0x18]
    adrp     x8, #0x553000
    add      x8, x8, #0x6f0
    stur     x8, [x9, #-0x10]
    ldr      x0, [x24, #0x208]
    mov      x1, x25
    sub      x8, x29, #0x138
    ldur     x2, [x8, #-0x100]
    sub      x8, x29, #0x140
    ldur     x3, [x8, #-0x100]
    mov      w4, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x138
    stur     x0, [x8, #-0x100]
    stur     x0, [x19, #-0x38]
    sub      x8, x29, #0x148
    ldur     x21, [x8, #-0x100]
    stur     x22, [x21, #-0x40]
    ldr      x0, [x20, #0xa8]
    mov      x1, x28
    mov      x22, x28
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x140
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0x730
    sub      x9, x29, #0x128
    ldur     x24, [x9, #-0x100]
    stp      x0, x8, [x24, #-0x40]
    stp      x23, x27, [x21, #-0x38]
    adrp     x8, #0x4a3000
    add      x8, x8, #0xda8
    ldr      x8, [x8]
    stur     x8, [x24, #-0x30]
    adrp     x8, #0x553000
    add      x8, x8, #0xd30
    stur     x8, [x21, #-0x28]
    ldr      x0, [x20, #0xa8]
    mov      x8, #0x4054000000000000
    fmov     d10, x8
    mov      x1, x26
    fmov     d0, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x150
    stur     x0, [x8, #-0x100]
    stur     x0, [x24, #-0x28]
    adrp     x8, #0x553000
    add      x8, x8, #0xab0
    stur     x8, [x21, #-0x20]
    ldr      x0, [x20, #0xa8]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x550]
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x170
    stur     x0, [x8, #-0x100]
    stur     x0, [x24, #-0x20]
    adrp     x8, #0x553000
    add      x8, x8, #0xaf0
    stur     x8, [x21, #-0x18]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #2.00000000
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x178
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0xbb0
    stur     x8, [x21, #-0x10]
    adrp     x8, #0x553000
    add      x8, x8, #0xb70
    stp      x0, x8, [x24, #-0x18]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    mov      x1, x25
    sub      x8, x29, #0xf8
    ldur     x2, [x8, #-0x100]
    sub      x8, x29, #0x108
    ldur     x3, [x8, #-0x100]
    mov      w4, #7
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xf8
    stur     x0, [x8, #-0x100]
    stur     x0, [x19, #-0x30]
    mov      x27, x19
    sub      x8, x29, #0x110
    ldur     x21, [x8, #-0x100]
    adrp     x28, #0x553000
    add      x28, x28, #0xa30
    stur     x28, [x21, #-0x40]
    ldr      x0, [x20, #0xa8]
    mov      x19, x22
    mov      x1, x22
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x108
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0xb30
    sub      x9, x29, #0xf0
    ldur     x9, [x9, #-0x100]
    stp      x0, x8, [x9, #-0x40]
    mov      x10, x21
    adrp     x8, #0x553000
    add      x8, x8, #0xbf0
    stp      x23, x8, [x21, #-0x38]
    adrp     x8, #0x4a3000
    add      x8, x8, #0xdb0
    ldr      x8, [x8]
    stur     x8, [x9, #-0x30]
    mov      x21, x9
    adrp     x8, #0x553000
    add      x8, x8, #0xd30
    stur     x8, [x10, #-0x28]
    mov      x22, x10
    ldr      x0, [x20, #0xa8]
    mov      x8, #-0x3fac000000000000
    fmov     d11, x8
    mov      x1, x26
    fmov     d0, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x128
    stur     x0, [x8, #-0x100]
    stur     x0, [x21, #-0x28]
    adrp     x8, #0x553000
    add      x8, x8, #0xab0
    stur     x8, [x22, #-0x20]
    ldr      x0, [x20, #0xa8]
    mov      x1, x26
    fmov     d0, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x148
    stur     x0, [x8, #-0x100]
    stur     x0, [x21, #-0x20]
    adrp     x8, #0x553000
    add      x8, x8, #0xaf0
    stur     x8, [x22, #-0x18]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #1.00000000
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x180
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0xbb0
    stur     x8, [x22, #-0x10]
    adrp     x24, #0x553000
    add      x24, x24, #0xa70
    stp      x0, x24, [x21, #-0x18]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    mov      x1, x25
    sub      x8, x29, #0xc0
    ldur     x2, [x8, #-0x100]
    sub      x8, x29, #0xd0
    ldur     x3, [x8, #-0x100]
    mov      w4, #7
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xc0
    stur     x0, [x8, #-0x100]
    stur     x0, [x27, #-0x28]
    sub      x8, x29, #0xd8
    ldur     x21, [x8, #-0x100]
    stur     x28, [x21, #-0x40]
    ldr      x0, [x20, #0xa8]
    mov      x1, x19
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xd0
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0x6b0
    sub      x9, x29, #0xb8
    ldur     x9, [x9, #-0x100]
    stp      x0, x8, [x9, #-0x40]
    mov      x10, x21
    adrp     x8, #0x553000
    add      x11, x8, #0xcf0
    adrp     x8, #0x553000
    add      x8, x8, #0xbf0
    stp      x11, x8, [x21, #-0x38]
    adrp     x8, #0x4a3000
    add      x8, x8, #0xdb8
    ldr      x8, [x8]
    stur     x8, [x9, #-0x30]
    mov      x21, x9
    adrp     x23, #0x553000
    add      x23, x23, #0xd30
    stur     x23, [x10, #-0x28]
    mov      x22, x10
    ldr      x0, [x20, #0xa8]
    mov      x1, x26
    fmov     d0, d11
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xf0
    stur     x0, [x8, #-0x100]
    stur     x0, [x21, #-0x28]
    adrp     x28, #0x553000
    add      x28, x28, #0xab0
    stur     x28, [x22, #-0x20]
    ldr      x0, [x20, #0xa8]
    mov      x1, x26
    fmov     d0, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x110
    stur     x0, [x8, #-0x100]
    stur     x0, [x21, #-0x20]
    adrp     x8, #0x553000
    add      x8, x8, #0xaf0
    stur     x8, [x22, #-0x18]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #1.00000000
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x188
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0xbb0
    stur     x8, [x22, #-0x10]
    stp      x0, x24, [x21, #-0x18]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    mov      x24, x25
    mov      x1, x25
    sub      x8, x29, #0x80
    ldur     x2, [x8, #-0x100]
    sub      x8, x29, #0x88
    ldur     x3, [x8, #-0x100]
    mov      w4, #7
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x80
    stur     x0, [x8, #-0x100]
    stur     x0, [x27, #-0x20]
    mov      x25, x27
    sub      x8, x29, #0x98
    ldur     x21, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0xa30
    stur     x8, [x21, #-0x40]
    ldr      x0, [x20, #0xa8]
    mov      x28, x19
    mov      x1, x19
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x88
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0x670
    sub      x9, x29, #0x78
    ldur     x9, [x9, #-0x100]
    stp      x0, x8, [x9, #-0x40]
    mov      x10, x21
    adrp     x19, #0x553000
    add      x19, x19, #0xcf0
    adrp     x8, #0x553000
    add      x8, x8, #0xbf0
    stp      x19, x8, [x21, #-0x38]
    adrp     x8, #0x4a3000
    add      x8, x8, #0xdc0
    ldr      x8, [x8]
    stur     x8, [x9, #-0x30]
    mov      x21, x9
    stur     x23, [x10, #-0x28]
    mov      x22, x10
    ldr      x0, [x20, #0xa8]
    mov      x1, x26
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xb8
    stur     x0, [x8, #-0x100]
    stur     x0, [x21, #-0x28]
    adrp     x8, #0x553000
    add      x8, x8, #0xab0
    stur     x8, [x22, #-0x20]
    ldr      x0, [x20, #0xa8]
    mov      x1, x26
    fmov     d0, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0xd8
    stur     x0, [x8, #-0x100]
    stur     x0, [x21, #-0x20]
    adrp     x8, #0x553000
    add      x8, x8, #0xaf0
    stur     x8, [x22, #-0x18]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #2.00000000
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x190
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0xbb0
    stur     x8, [x22, #-0x10]
    adrp     x8, #0x553000
    add      x8, x8, #0xa70
    stp      x0, x8, [x21, #-0x18]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    mov      x1, x24
    mov      x23, x24
    sub      x8, x29, #0x48
    ldur     x2, [x8, #-0x100]
    sub      x8, x29, #0x50
    ldur     x3, [x8, #-0x100]
    mov      w4, #7
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x48
    stur     x0, [x8, #-0x100]
    stur     x0, [x27, #-0x18]
    sub      x8, x29, #0x58
    ldur     x21, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0xa30
    stur     x8, [x21, #-0x40]
    ldr      x0, [x20, #0xa8]
    mov      x1, x28
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x50
    stur     x0, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0x630
    sub      x9, x29, #0x40
    ldur     x9, [x9, #-0x100]
    stp      x0, x8, [x9, #-0x40]
    adrp     x8, #0x553000
    add      x8, x8, #0xbf0
    stp      x19, x8, [x21, #-0x38]
    adrp     x8, #0x4a3000
    add      x8, x8, #0xdc8
    ldr      x8, [x8]
    stur     x8, [x9, #-0x30]
    mov      x22, x9
    adrp     x8, #0x553000
    add      x8, x8, #0xd30
    stur     x8, [x21, #-0x28]
    mov      x27, x21
    ldr      x0, [x20, #0xa8]
    mov      x1, x26
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    stur     x0, [x22, #-0x28]
    adrp     x8, #0x553000
    add      x8, x8, #0xab0
    stur     x8, [x21, #-0x20]
    ldr      x0, [x20, #0xa8]
    mov      x1, x26
    fmov     d0, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    stur     x0, [x22, #-0x20]
    adrp     x8, #0x553000
    add      x8, x8, #0xaf0
    stur     x8, [x27, #-0x18]
    ldr      x0, [x20, #0xa8]
    fmov     d0, #2.00000000
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x553000
    add      x8, x8, #0xbb0
    stur     x8, [x27, #-0x10]
    adrp     x8, #0x553000
    add      x8, x8, #0xa70
    stp      x0, x8, [x22, #-0x18]
    adrp     x19, #0x4c4000
    ldr      x0, [x19, #0x208]
    mov      x1, x23
    sub      x8, x29, #0x10
    ldur     x2, [x8, #-0x100]
    sub      x8, x29, #0x18
    ldur     x3, [x8, #-0x100]
    mov      w4, #7
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    stur     x0, [x25, #-0x10]
    sub      x8, x29, #0x20
    ldur     x27, [x8, #-0x100]
    adrp     x8, #0x553000
    add      x8, x8, #0xa30
    stur     x8, [x27, #-0x20]
    ldr      x0, [x20, #0xa8]
    mov      x1, x28
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    adrp     x8, #0x553000
    add      x8, x8, #0xc70
    ldp      x9, x3, [x29, #-0x100]
    stp      x0, x8, [x9, #-0x20]
    adrp     x10, #0x553000
    add      x8, x10, #0xcf0
    adrp     x10, #0x553000
    add      x10, x10, #0x770
    stp      x8, x10, [x27, #-0x18]
    adrp     x8, #0x553000
    add      x8, x8, #0x930
    stur     x8, [x9, #-0x10]
    ldr      x0, [x19, #0x208]
    mov      x1, x23
    ldur     x2, [x29, #-0xf0]
    mov      w4, #3
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    stur     x0, [x25, #-8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    sub      x8, x29, #0xa0
    ldur     x1, [x8, #-0x100]
    ldur     x2, [x29, #-0xa0]
    mov      w3, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x50
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x48
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x190
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xd8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xb8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x88
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x80
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x188
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x110
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xf0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xd0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xc0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x180
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x148
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x128
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x108
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xf8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x178
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x170
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x150
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x140
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x138
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x168
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x160
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x158
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x130
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x120
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x118
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x100
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xe8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xe0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xc8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xb0
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0xa8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x90
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x70
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x68
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x60
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x38
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x30
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x28
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #8
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xe8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xe0]
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
    ldur     x0, [x29, #-0xa8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x98]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x90]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x88]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x80]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x389864
    mov      x0, x20
    sub      sp, x29, #0x70
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    ldp      d9, d8, [sp, #0x10]
    ldp      d11, d10, [sp], #0x80
    b        #0x461be8 // _objc_autoreleaseReturnValue
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGHomePinnedPanelView initForWindow:] IMP=0x389868 bounds=0x389868-0x389CA0
loc_389868:
    sub      sp, sp, #0x70
    stp      d11, d10, [sp, #0x10]
    stp      d9, d8, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d11, d2
    fmov     d10, d3
    mov      x8, #-0x3fbe000000000000
    fmov     d0, x8
    fadd     d0, d2, d0
    adrp     x8, #0x492000
    ldr      d1, [x8, #0x288]
    fcmp     d0, d1
    fcsel    d9, d1, d0, gt
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x650]
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x1d0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x1d8]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x1e0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    ucvtf    d0, x0
    mov      x8, #0x4047000000000000
    fmov     d1, x8
    fmul     d8, d0, d1
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x492000
    ldr      d0, [x8, #0x290]
    fmul     d0, d10, d0
    mov      x8, #0x4044000000000000
    fmov     d1, x8
    fadd     d1, d8, d1
    fmov     d2, #8.00000000
    fadd     d1, d1, d2
    fcmp     d1, d0
    fcsel    d3, d1, d0, mi
    fsub     d0, d11, d9
    fmov     d1, #0.50000000
    fmul     d0, d0, d1
    frintm   d0, d0
    fsub     d2, d10, d3
    fmul     d1, d2, d1
    frintm   d1, d1
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x800]
    stp      x20, x8, [sp]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    mov      x0, sp
    fmov     d2, d9
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x20, x0
    cbz      x0, #0x389c6c
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x3f0]
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x3f8]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    cbnz     x23, #0x389a44
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x128]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    cmp      x23, #2
    cset     w2, eq
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9b0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x8f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x360]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x23, #0x4c4000
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xac8]
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, #18.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x450]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac0]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbc0]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8c0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    adrp     x8, #0x492000
    ldr      s0, [x8, #0x1c8]
    adrp     x8, #0x492000
    ldr      s1, [x8, #0x1cc]
    fcsel    s9, s1, s0, ne
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb08]
    fmov     s0, s9
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbc8]
    fmov     d0, #22.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xbd0]
    fmov     d0, xzr
    fmov     d1, #10.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x1e8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x378]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x380]
    mov      x0, x20
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    ldp      d11, d10, [sp, #0x10]
    add      sp, sp, #0x70
    ret      

// -[WCLGHomePinnedPanelView primaryTextColor] IMP=0x389CA0 bounds=0x389CA0-0x389CFC
loc_389CA0:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8c0]
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    adrp     x9, #0x4c4000
    ldr      x0, [x9, #0x90]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0xbf0]
    tbz      w8, #0, #0x389cdc
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3e8]
    fmov     d0, #1.00000000
    b        #0x389ce8
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x9d0]
    fmov     d1, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGHomePinnedPanelView secondaryTextColor] IMP=0x389CFC bounds=0x389CFC-0x389D58
loc_389CFC:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8c0]
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    adrp     x9, #0x4c4000
    ldr      x0, [x9, #0x90]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0xbf0]
    tbz      w8, #0, #0x389d38
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x8b0]
    fmov     d0, #1.00000000
    b        #0x389d44
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x728]
    fmov     d0, xzr
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGHomePinnedPanelView separatorColor] IMP=0x389D58 bounds=0x389D58-0x389DB4
loc_389D58:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x8c0]
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    adrp     x9, #0x4c4000
    ldr      x0, [x9, #0x90]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0xbf0]
    tbz      w8, #0, #0x389d94
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x530]
    fmov     d0, #1.00000000
    b        #0x389da0
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x460]
    fmov     d0, xzr
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGHomePinnedPanelView buildBackground] IMP=0x389DB4 bounds=0x389DB4-0x38A01C
loc_389DB4:
    stp      x26, x25, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x448]
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x8c0]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    adrp     x26, #0x4c4000
    ldr      x0, [x26, #0x90]
    adrp     x9, #0x4be000
    ldr      x21, [x9, #0xbf0]
    tbz      w8, #0, #0x389e54
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x8e0]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3e8]
    b        #0x389e60
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x4d8]
    fmov     d0, #1.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x0, x20
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xac8]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, #18.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    mov      x0, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x628]
    ldr      x24, [x8]
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb50]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb10]
    fmov     d0, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x26, #0x90]
    cmp      w0, #0
    adrp     x9, #0x491000
    ldr      d0, [x9, #0x540]
    adrp     x9, #0x491000
    ldr      d1, [x9, #0x490]
    fcsel    d1, d1, d0, ne
    fmov     d0, #1.00000000
    mov      x0, x8
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac0]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x20
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb18]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x390]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      x26, x25, [sp], #0x50
    b        #0x461c9c // _objc_release

// -[WCLGHomePinnedPanelView buildHeader] IMP=0x38A01C bounds=0x38A01C-0x38A704
loc_38A01C:
    sub      sp, sp, #0x80
    stp      d9, d8, [sp, #0x10]
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    mov      x19, x0
    adrp     x8, #0x581000
    add      x8, x8, #0x9d8
    ldar     w9, [x8]
    cbnz     w9, #0x38a1ec
    adrp     x9, #0x553000
    add      x9, x9, #0xf02
    ldrh     w10, [x9]
    mov      w11, #0xaef7
    adrp     x12, #0x553000
    add      x12, x12, #0xf10
    eor      w10, w10, w11
    strh     w10, [x12]
    ldrh     w10, [x9, #2]
    mov      w11, #0x7232
    eor      w10, w10, w11
    strh     w10, [x12, #2]
    ldrh     w10, [x9, #4]
    mov      w11, #0x7323
    eor      w10, w10, w11
    strh     w10, [x12, #4]
    ldrh     w10, [x9, #6]
    mov      w11, #0x6471
    eor      w10, w10, w11
    strh     w10, [x12, #6]
    ldrh     w10, [x9, #8]
    mov      w11, #0x490d
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    ldrh     w10, [x9, #0xa]
    mov      w11, #0x2e35
    eor      w10, w10, w11
    strh     w10, [x12, #0xa]
    ldrh     w9, [x9, #0xc]
    mov      w10, #0x93c9
    eor      w9, w9, w10
    strh     w9, [x12, #0xc]
    adrp     x9, #0x553000
    add      x9, x9, #0xed0
    ldrb     w10, [x9]
    eor      w11, w10, #0x66666666
    adrp     x10, #0x553000
    add      x10, x10, #0xef0
    strb     w11, [x10]
    ldrb     w11, [x9, #1]
    mov      w12, #0xc2
    eor      w11, w11, w12
    strb     w11, [x10, #1]
    ldrb     w11, [x9, #2]
    mov      w12, #0xb7
    eor      w11, w11, w12
    strb     w11, [x10, #2]
    ldrb     w11, [x9, #3]
    mov      w12, #0x5a
    eor      w11, w11, w12
    strb     w11, [x10, #3]
    ldrb     w11, [x9, #4]
    mov      w12, #0x89
    eor      w11, w11, w12
    strb     w11, [x10, #4]
    ldrb     w11, [x9, #5]
    mov      w12, #0xd1
    eor      w11, w11, w12
    strb     w11, [x10, #5]
    ldrb     w11, [x9, #6]
    mov      w12, #0xbe
    eor      w11, w11, w12
    strb     w11, [x10, #6]
    ldrb     w11, [x9, #7]
    eor      w11, w11, #0xaaaaaaaa
    strb     w11, [x10, #7]
    ldrb     w11, [x9, #8]
    mov      w12, #0x2c
    eor      w11, w11, w12
    strb     w11, [x10, #8]
    ldrb     w11, [x9, #9]
    mov      w12, #0xc4
    eor      w11, w11, w12
    strb     w11, [x10, #9]
    ldrb     w11, [x9, #0xa]
    eor      w11, w11, #0xffffffbf
    strb     w11, [x10, #0xa]
    ldrb     w11, [x9, #0xb]
    eor      w11, w11, #0xdddddddd
    strb     w11, [x10, #0xb]
    ldrb     w11, [x9, #0xc]
    eor      w11, w11, #0x80
    strb     w11, [x10, #0xc]
    ldrb     w11, [x9, #0xd]
    mov      w12, #0xe2
    eor      w11, w11, w12
    strb     w11, [x10, #0xd]
    ldrb     w11, [x9, #0xe]
    mov      w12, #0x13
    eor      w11, w11, w12
    strb     w11, [x10, #0xe]
    ldrb     w11, [x9, #0xf]
    mov      w12, #0x23
    eor      w11, w11, w12
    strb     w11, [x10, #0xf]
    ldrb     w11, [x9, #0x10]
    eor      w11, w11, #0x33333333
    strb     w11, [x10, #0x10]
    ldrb     w9, [x9, #0x11]
    mov      w11, #0xba
    eor      w9, w9, w11
    strb     w9, [x10, #0x11]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d2
    adrp     x23, #0x4c4000
    ldr      x0, [x23, #0x78]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xb38]
    mov      x8, #0x4044000000000000
    fmov     d3, x8
    fmov     d0, xzr
    fmov     d1, xzr
    mov      x1, x21
    fmov     d2, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x27, #0x4c4000
    ldr      x0, [x27, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x460]
    mov      x0, x20
    mov      x1, x26
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x448]
    mov      x0, x20
    mov      x1, x24
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x398]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xb40]
    mov      x1, x25
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x0, [x23, #0x78]
    bl       #0x461ba0 // _objc_alloc
    mov      x8, #-0x3fbe000000000000
    fmov     d0, x8
    fadd     d0, d8, d0
    fmov     d1, #0.50000000
    fmul     d0, d0, d1
    mov      x8, #0x4042000000000000
    fmov     d2, x8
    fmov     d1, #5.00000000
    fmov     d3, #4.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x28, [x8, #0x8c0]
    mov      x0, x19
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    ldr      x0, [x27, #0x90]
    adrp     x9, #0x4be000
    ldr      x1, [x9, #0xbf0]
    str      x1, [sp]
    tbz      w8, #0, #0x38a340
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x3e0]
    fmov     d0, #1.00000000
    b        #0x38a34c
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x4b8]
    fmov     d0, xzr
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x22
    str      x26, [sp, #8]
    mov      x1, x26
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, #2.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    mov      x1, x24
    mov      w2, #5
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x25
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x8, #-0x3fae000000000000
    fmov     d0, x8
    fadd     d2, d8, d0
    fmov     d0, #16.00000000
    fmov     d1, #10.00000000
    fmov     d3, #24.00000000
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    adrp     x2, #0x553000
    add      x2, x2, #0xf80
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x388]
    ldr      d1, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x230]
    fmov     d0, #15.50000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x0, x26
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9e8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x26
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    mov      x1, x24
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x25
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x168]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x170]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x8, #-0x3fbd000000000000
    fmov     d0, x8
    fadd     d0, d8, d0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    fmov     d1, #5.00000000
    fmov     d2, #30.00000000
    fmov     d3, #30.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    mov      x1, x24
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x80]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1d8]
    adrp     x2, #0x553000
    add      x2, x2, #0xf40
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xee8]
    mov      x0, x23
    mov      x2, x27
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x8, x0
    adrp     x9, #0x4c4000
    ldr      x0, [x9, #0x90]
    tbz      w8, #0, #0x38a57c
    fmov     d0, #1.00000000
    fmov     d1, #0.50000000
    b        #0x38a588
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x508]
    fmov     d0, xzr
    ldr      x1, [sp]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc40]
    mov      x0, x23
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x3, [x8, #0xba0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    mov      x0, x23
    mov      x2, x19
    mov      w4, #0x40
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x25
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x492000
    ldr      d1, [x8, #0x1b8]
    fmov     d0, xzr
    fmov     d3, #0.50000000
    mov      x1, x21
    fmov     d2, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x3a8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x21
    ldr      x1, [sp, #8]
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x24
    mov      w2, #0xa
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    mov      x1, x25
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1d8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c1000
    ldr      x3, [x8, #0x3b0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x440]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc78]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x450]
    mov      x0, x20
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    ldp      d9, d8, [sp, #0x10]
    add      sp, sp, #0x80
    b        #0x461c9c // _objc_release

// -[WCLGHomePinnedPanelView buildScrollContent:] IMP=0x38A704 bounds=0x38A704-0x38ABCC
loc_38A704:
    sub      sp, sp, #0xe0
    stp      d11, d10, [sp, #0x60]
    stp      d9, d8, [sp, #0x70]
    stp      x28, x27, [sp, #0x80]
    stp      x26, x25, [sp, #0x90]
    stp      x24, x23, [sp, #0xa0]
    stp      x22, x21, [sp, #0xb0]
    stp      x20, x19, [sp, #0xc0]
    stp      x29, x30, [sp, #0xd0]
    add      x29, sp, #0xd0
    fmov     d8, d0
    mov      x19, x0
    adrp     x8, #0x581000
    add      x8, x8, #0x9dc
    ldar     w9, [x8]
    cbnz     w9, #0x38a80c
    adrp     x9, #0x553000
    add      x9, x9, #0xfac
    ldrb     w10, [x9]
    mov      w11, #0xd7
    eor      w10, w10, w11
    adrp     x11, #0x553000
    add      x11, x11, #0xfb1
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x2f
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x41
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x85
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0x25
    eor      w9, w9, w10
    strb     w9, [x11, #4]
    adrp     x9, #0x553000
    add      x9, x9, #0xfa0
    ldrb     w10, [x9]
    mov      w11, #0xbc
    eor      w10, w10, w11
    adrp     x11, #0x553000
    add      x11, x11, #0xfa6
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #9
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xe4
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xcccccccc
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0x33333333
    strb     w10, [x11, #4]
    ldrb     w9, [x9, #5]
    mov      w10, #0x8d
    eor      w9, w9, w10
    strb     w9, [x11, #5]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x4d8]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d9, d2
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x8, #-0x3fbc000000000000
    fmov     d0, x8
    fadd     d10, d3, d0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x188]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    mov      x8, #0x4044000000000000
    fmov     d1, x8
    fmov     d0, xzr
    fmov     d2, d9
    fmov     d3, d10
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x448]
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #6.00000000
    fadd     d1, d8, d0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x730]
    mov      x0, x21
    fmov     d0, d9
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x3b8]
    mov      x0, x21
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbf8]
    mov      x0, x21
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x398]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    str      x1, [sp, #0x50]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x410]
    mov      x0, x19
    str      x21, [sp, #0x58]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x22, [x8, #0x1e0]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x24, #0x4be000
    ldr      x28, [x24, #0x600]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    cmp      x21, #1
    b.lt     #0x38aba0
    mov      x23, #0
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x608]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x528]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x4e8]
    stp      x8, x9, [sp, #0x40]
    adrp     x8, #0x4c2000
    ldr      x9, [x8, #0x1f0]
    adrp     x8, #0x4c2000
    ldr      x8, [x8, #0x1f8]
    stp      x8, x9, [sp, #0x30]
    adrp     x8, #0x4c2000
    ldr      x9, [x8, #0x220]
    adrp     x8, #0x4c2000
    ldr      x8, [x8, #0x218]
    stp      x8, x9, [sp, #0x20]
    adrp     x8, #0x4c2000
    ldr      x10, [x8, #0x210]
    adrp     x8, #0x4c2000
    adrp     x9, #0x4c2000
    ldr      x8, [x8, #0x208]
    stp      x8, x10, [sp, #0x10]
    ldr      x8, [x9, #0x200]
    str      x8, [sp, #8]
    ldr      x21, [x24, #0x600]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0x48]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    sub      x8, x0, #1
    cmp      x23, x8
    cset     w28, eq
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x1, x25
    adrp     x2, #0x554000
    add      x2, x2, #0x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x1, [sp, #0x40]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    sub      x26, x20, #5
    mov      x0, x27
    mov      x1, x25
    adrp     x2, #0x553000
    add      x2, x2, #0xfe0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    cmn      x26, #2
    ldp      x9, x8, [sp, #0x30]
    csel     x1, x9, x8, lo
    mov      x0, x19
    mov      x2, x23
    mov      x3, x24
    mov      x4, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x28, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    cmp      x20, #1
    b.le     #0x38aaf4
    cmp      x20, #2
    b.eq     #0x38ab0c
    cmp      x20, #3
    b.eq     #0x38ab18
    cmp      x20, #4
    b.ne     #0x38ab48
    mov      x0, x19
    ldr      x1, [sp, #0x28]
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    b        #0x38ab48
    cbz      x20, #0x38ab30
    cmp      x20, #1
    b.ne     #0x38ab48
    mov      x0, x19
    ldr      x1, [sp, #0x10]
    b        #0x38ab38
    mov      x0, x19
    ldr      x1, [sp, #0x18]
    b        #0x38ab38
    mov      x0, x19
    ldr      x1, [sp, #0x20]
    mov      x2, x28
    mov      x3, x23
    bl       #0x461c6c // _objc_msgSend
    b        #0x38ab48
    mov      x0, x19
    ldr      x1, [sp, #8]
    mov      x2, x28
    mov      x3, x27
    mov      x4, x23
    bl       #0x461c6c // _objc_msgSend
    ldp      x1, x0, [sp, #0x50]
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    add      x23, x23, #1
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x28, x21
    cmp      x23, x24
    b.lt     #0x38a9c8
    ldr      x0, [sp, #0x58]
    ldp      x29, x30, [sp, #0xd0]
    ldp      x20, x19, [sp, #0xc0]
    ldp      x22, x21, [sp, #0xb0]
    ldp      x24, x23, [sp, #0xa0]
    ldp      x26, x25, [sp, #0x90]
    ldp      x28, x27, [sp, #0x80]
    ldp      d9, d8, [sp, #0x70]
    ldp      d11, d10, [sp, #0x60]
    add      sp, sp, #0xe0
    b        #0x461c9c // _objc_release

// -[WCLGHomePinnedPanelView makePlainRowAtIndex:title:lastRow:] IMP=0x38ABCC bounds=0x38ABCC-0x38ACDC
loc_38ABCC:
    stp      d9, d8, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x20, x4
    mov      x19, x3
    mov      x22, x2
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x4d8]
    mov      x0, x3
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d2
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    scvtf    d0, x22
    mov      x8, #0x4047000000000000
    fmov     d3, x8
    fmul     d1, d0, d3
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    fmov     d0, xzr
    fmov     d2, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x0, x22
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x448]
    mov      x0, x22
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x228]
    eor      w3, w20, #1
    mov      x0, x21
    mov      x2, x19
    mov      x4, x22
    mov      w5, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      d9, d8, [sp], #0x50
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGHomePinnedPanelView makeTappableRowAtIndex:title:lastRow:] IMP=0x38ACDC bounds=0x38ACDC-0x38B01C
loc_38ACDC:
    stp      d9, d8, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x22, x4
    mov      x21, x3
    mov      x23, x2
    mov      x19, x0
    adrp     x8, #0x581000
    add      x8, x8, #0x9e4
    ldar     w9, [x8]
    cbnz     w9, #0x38adf0
    adrp     x9, #0x554000
    add      x9, x9, #0x40
    ldrb     w10, [x9]
    eor      w10, w10, #0xffffff81
    adrp     x11, #0x554000
    add      x11, x11, #0x4e
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x26
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x91
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w13, #0x1a
    eor      w10, w10, w13
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w13, #0xd3
    eor      w10, w10, w13
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0xffffffdf
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w13, #0xdc
    eor      w10, w10, w13
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    eor      w10, w10, #3
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    mov      w13, #0x48
    eor      w10, w10, w13
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    mov      w13, #0xb
    eor      w10, w10, w13
    strb     w10, [x11, #9]
    ldrb     w10, [x9, #0xa]
    eor      w10, w10, #0xffffffef
    strb     w10, [x11, #0xa]
    ldrb     w10, [x9, #0xb]
    mov      w13, #0xab
    eor      w10, w10, w13
    strb     w10, [x11, #0xb]
    ldrb     w10, [x9, #0xc]
    eor      w10, w10, #0x20
    strb     w10, [x11, #0xc]
    ldrb     w9, [x9, #0xd]
    eor      w9, w9, w12
    strb     w9, [x11, #0xd]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x4d8]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d2
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x150]
    bl       #0x461ba0 // _objc_alloc
    scvtf    d0, x23
    mov      x8, #0x4047000000000000
    fmov     d3, x8
    fmul     d1, d0, d3
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xb38]
    fmov     d0, xzr
    mov      x1, x25
    fmov     d2, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xab8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x0, x20
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x448]
    mov      x0, x20
    mov      x1, x24
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc30]
    mov      x0, x20
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x3, [x8, #0x230]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    mov      x0, x20
    mov      x2, x19
    mov      w4, #0x40
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x228]
    eor      w3, w22, #1
    mov      x0, x19
    mov      x2, x21
    mov      x4, x20
    mov      w5, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x88]
    bl       #0x461ba0 // _objc_alloc
    fmov     d0, #-24.00000000
    fadd     d0, d8, d0
    fmov     d1, #16.00000000
    fmov     d2, #8.00000000
    fmov     d3, #14.00000000
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x80]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1d8]
    adrp     x2, #0x554000
    add      x2, x2, #0x80
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc40]
    mov      x0, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x430]
    mov      x0, x21
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      x1, x24
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      d9, d8, [sp], #0x60
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGHomePinnedPanelView addLabel:separator:toRow:interactive:] IMP=0x38B01C bounds=0x38B01C-0x38B240
loc_38B01C:
    stp      d9, d8, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x24, x5
    mov      x19, x4
    mov      x22, x3
    mov      x25, x2
    mov      x20, x0
    mov      x0, x4
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x4d8]
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d2
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x491000
    ldr      d0, [x8, #0xbf0]
    fadd     d2, d8, d0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0xb38]
    mov      x8, #0x4047000000000000
    fmov     d3, x8
    fmov     d0, #18.00000000
    fmov     d1, xzr
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x800]
    fmov     d0, #15.50000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x0, x21
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9e8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x21
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      x0, x21
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x448]
    mov      x0, x21
    mov      x1, x24
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0xb40]
    mov      x0, x19
    mov      x1, x25
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w22, #0x38b218
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    fmov     d0, #-18.00000000
    fadd     d2, d8, d0
    adrp     x8, #0x492000
    ldr      d1, [x8, #0x298]
    fmov     d0, #18.00000000
    fmov     d3, #0.50000000
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x3a8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x0, x22
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    mov      x1, x24
    mov      w2, #0xa
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    mov      x1, x25
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      d9, d8, [sp], #0x60
    b        #0x461c9c // _objc_release

// -[WCLGHomePinnedPanelView placeAccessory:inRow:] IMP=0x38B240 bounds=0x38B240-0x38B330
loc_38B240:
    stp      d9, d8, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x20, x3
    mov      x19, x2
    mov      x22, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x4d8]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d2
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fcmp     d2, #0.0
    b.hi     #0x38b2b8
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x7f0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #-16.00000000
    fadd     d0, d8, d0
    fsub     d0, d0, d2
    mov      x8, #0x4047000000000000
    fmov     d1, x8
    fsub     d1, d1, d3
    fmov     d4, #0.50000000
    fmul     d1, d1, d4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x448]
    mov      x0, x19
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      d9, d8, [sp], #0x40
    b        #0x461c9c // _objc_release

// -[WCLGHomePinnedPanelView switchOnFor:] IMP=0x38B330 bounds=0x38B330-0x38B554
loc_38B330:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x2
    adrp     x8, #0x581000
    add      x8, x8, #0x9f0
    ldar     w9, [x8]
    cbnz     w9, #0x38b4c0
    adrp     x9, #0x554000
    add      x9, x9, #0xbe
    ldrb     w10, [x9]
    mov      w11, #0x21
    eor      w10, w10, w11
    adrp     x11, #0x554000
    add      x11, x11, #0xc5
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xb8
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w13, #0x6f
    eor      w10, w10, w13
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xffffffef
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #2
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w13, #0x26
    eor      w10, w10, w13
    strb     w10, [x11, #5]
    ldrb     w9, [x9, #6]
    eor      w9, w9, #0xfe
    strb     w9, [x11, #6]
    adrp     x9, #0x554000
    add      x9, x9, #0xac
    ldrb     w10, [x9]
    mov      w11, #0xec
    eor      w10, w10, w11
    adrp     x11, #0x554000
    add      x11, x11, #0xb5
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w13, #0x6c
    eor      w10, w10, w13
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w13, #0x72
    eor      w10, w10, w13
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x91
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w12, #0x53
    eor      w10, w10, w12
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w12, #0x3a
    eor      w10, w10, w12
    strb     w10, [x11, #7]
    ldrb     w9, [x9, #8]
    eor      w9, w9, #0x99999999
    strb     w9, [x11, #8]
    adrp     x9, #0x554000
    add      x9, x9, #0xa0
    ldrb     w10, [x9]
    eor      w10, w10, #0xffffff8f
    adrp     x11, #0x554000
    add      x11, x11, #0xa6
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x61
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x24
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0xd5
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x5d
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w9, [x9, #5]
    eor      w9, w9, #0xcccccccc
    strb     w9, [x11, #5]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x358]
    adrp     x2, #0x554000
    add      x2, x2, #0x170
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x38b4f4
    bl       #0x37a73c
    b        #0x38b530
    adrp     x2, #0x554000
    add      x2, x2, #0x130
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x38b514
    bl       #0x37abd8
    b        #0x38b530
    adrp     x2, #0x554000
    add      x2, x2, #0xf0
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x38b54c
    bl       #0x37ac3c
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    ret      
    mov      w20, #0
    b        #0x38b534

// -[WCLGHomePinnedPanelView addSwitchToRow:def:index:] IMP=0x38B554 bounds=0x38B554-0x38B6B0
loc_38B554:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x23, x4
    mov      x22, x3
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x581000
    add      x8, x8, #0x9f4
    ldar     w9, [x8]
    cbnz     w9, #0x38b5c0
    adrp     x9, #0x554000
    add      x9, x9, #0x190
    ldrb     w10, [x9]
    eor      w10, w10, #0x18
    adrp     x11, #0x554000
    add      x11, x11, #0x193
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #4
    strb     w10, [x11, #1]
    ldrb     w9, [x9, #2]
    mov      w10, #0x36
    eor      w9, w9, w10
    strb     w9, [x11, #2]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0x510]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    bl       #0x461bac // _objc_alloc_init
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc30]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x528]
    adrp     x2, #0x554000
    add      x2, x2, #0x1c0
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x238]
    mov      x0, x20
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x3d8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x3, [x8, #0x240]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    mov      x0, x21
    mov      x2, x20
    mov      w4, #0x1000
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x248]
    mov      x0, x20
    mov      x2, x21
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461c9c // _objc_release

// -[WCLGHomePinnedPanelView addSegmentToRow:def:index:] IMP=0x38B6B0 bounds=0x38B6B0-0x38B854
loc_38B6B0:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x21, x4
    mov      x22, x3
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x581000
    add      x8, x8, #0x9f8
    ldar     w9, [x8]
    cbnz     w9, #0x38b748
    adrp     x9, #0x554000
    add      x9, x9, #0x1e0
    ldrb     w10, [x9]
    eor      w10, w10, #0x10
    adrp     x11, #0x554000
    add      x11, x11, #0x1e6
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xe0
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x24
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #1
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x68
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w9, [x9, #5]
    mov      w10, #0xf2
    eor      w9, w9, w10
    strb     w9, [x11, #5]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x23, [x8, #0x468]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x23
    bl       #0x461ba0 // _objc_alloc
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x528]
    adrp     x2, #0x554000
    add      x2, x2, #0x210
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa10]
    mov      x0, x23
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc30]
    mov      x0, x22
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    bl       #0x37aa40
    mov      x2, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa28]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x3, [x8, #0x250]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    mov      x0, x22
    mov      x2, x20
    mov      w4, #0x1000
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x7f0]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x248]
    mov      x0, x20
    mov      x2, x22
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461c9c // _objc_release

// -[WCLGHomePinnedPanelView addStepperToRow:def:index:] IMP=0x38B854 bounds=0x38B854-0x38BE9C
loc_38B854:
    sub      sp, sp, #0x90
    stp      d11, d10, [sp, #0x10]
    stp      d9, d8, [sp, #0x20]
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    str      x4, [sp, #8]
    mov      x25, x3
    mov      x21, x2
    mov      x20, x0
    adrp     x8, #0x581000
    add      x8, x8, #0x9fc
    ldar     w9, [x8]
    cbnz     w9, #0x38ba40
    adrp     x9, #0x554000
    add      x9, x9, #0x258
    ldrb     w10, [x9]
    eor      w10, w10, #0xaaaaaaaa
    adrp     x11, #0x554000
    add      x11, x11, #0x25c
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xfe
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x9a
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w9, [x9, #3]
    mov      w10, #0x15
    eor      w9, w9, w10
    strb     w9, [x11, #3]
    adrp     x9, #0x554000
    add      x9, x9, #0x242
    ldrb     w10, [x9]
    mov      w11, #0x6d
    eor      w10, w10, w11
    adrp     x12, #0x554000
    add      x12, x12, #0x246
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    mvn      w10, w10
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    mov      w13, #0xe4
    eor      w10, w10, w13
    strb     w10, [x12, #2]
    ldrb     w9, [x9, #3]
    eor      w9, w9, #8
    strb     w9, [x12, #3]
    adrp     x9, #0x554000
    add      x9, x9, #0x238
    ldrb     w10, [x9]
    eor      w10, w10, w11
    adrp     x11, #0x554000
    add      x11, x11, #0x23d
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0x9b
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0x3c
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xf
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0x8a
    eor      w9, w9, w10
    strb     w9, [x11, #4]
    adrp     x9, #0x554000
    add      x9, x9, #0x24a
    ldrb     w10, [x9]
    eor      w10, w10, #0x7f
    adrp     x11, #0x554000
    add      x11, x11, #0x251
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x80
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xfe
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x4e
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x59
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x1a
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w9, [x9, #6]
    mov      w10, #0xeb
    eor      w9, w9, w10
    adrp     x10, #0x554000
    add      x10, x10, #0x230
    strb     w9, [x11, #6]
    ldrb     w9, [x10]
    mov      w11, #0x23
    eor      w9, w9, w11
    adrp     x11, #0x554000
    add      x11, x11, #0x234
    strb     w9, [x11]
    ldrb     w9, [x10, #1]
    eor      w9, w9, #0xffffffc1
    strb     w9, [x11, #1]
    ldrb     w9, [x10, #2]
    mov      w12, #0xd2
    eor      w9, w9, w12
    strb     w9, [x11, #2]
    ldrb     w9, [x10, #3]
    mov      w10, #0x82
    eor      w9, w9, w10
    strb     w9, [x11, #3]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x4d8]
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d2
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x528]
    adrp     x2, #0x554000
    add      x2, x2, #0x380
    mov      x0, x25
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x2, #0x554000
    add      x2, x2, #0x340
    mov      x0, x25
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x22
    bl       #0x38be9c
    fmov     d9, d0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x518]
    bl       #0x461bac // _objc_alloc_init
    mov      x24, x0
    adrp     x2, #0x554000
    add      x2, x2, #0x300
    mov      x0, x25
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x28, [x8, #0x4a0]
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xb60]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x554000
    add      x2, x2, #0x2c0
    mov      x0, x25
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xb68]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x2, #0x554000
    add      x2, x2, #0x280
    mov      x0, x25
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x28
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x448]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x450]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    fmov     d10, d0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x458]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    fcmp     d0, d9
    fcsel    d0, d9, d0, mi
    fcmp     d10, d0
    fcsel    d0, d10, d0, mi
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xce0]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc30]
    mov      x0, x24
    ldr      x28, [sp, #8]
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x7f0]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    mov      x1, x26
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #-16.00000000
    fadd     d0, d8, d0
    fsub     d0, d0, d2
    mov      x8, #0x4047000000000000
    fmov     d8, x8
    fsub     d1, d8, d3
    fmov     d4, #0.50000000
    fmul     d1, d1, d4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x678]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x448]
    mov      x0, x24
    mov      x1, x25
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x3, [x8, #0x460]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    mov      x0, x24
    mov      x2, x20
    mov      w4, #0x1000
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0xb40]
    mov      x0, x21
    mov      x1, x26
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x158]
    bl       #0x461ba0 // _objc_alloc
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x770]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    bl       #0x4616f0 // _CGRectGetMinX
    mov      x8, #-0x3fb0000000000000
    fmov     d1, x8
    fadd     d0, d0, d1
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    mov      x8, #0x404d000000000000
    fmov     d2, x8
    fmov     d1, xzr
    mov      x0, x19
    fmov     d3, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x1f8]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x218]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x378]
    ldr      d1, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9e0]
    fmov     d0, #14.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xec8]
    mov      x0, x27
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x9d0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xea8]
    mov      x0, x27
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd20]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x38c020
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x0, x27
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    mov      x1, x25
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      x1, x26
    mov      x2, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x468]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f0]
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x368]
    mov      x0, x19
    mov      x2, x27
    mov      x3, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    ldp      d11, d10, [sp, #0x10]
    add      sp, sp, #0x90
    b        #0x461c9c // _objc_release

// -[WCLGHomePinnedPanelView addColorAccessoryToRow:index:] IMP=0x38C1C8 bounds=0x38C1C8-0x38C3A0
loc_38C1C8:
    stp      d9, d8, [sp, #-0x50]!
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x20, x2
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x4d8]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d2
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x78]
    bl       #0x461ba0 // _objc_alloc
    fmov     d0, #-24.00000000
    fadd     d0, d8, d0
    fmov     d1, #-12.00000000
    fadd     d0, d0, d1
    mov      x8, #-0x3fbf000000000000
    fmov     d1, x8
    fadd     d0, d0, d1
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb38]
    mov      x8, #0x4041000000000000
    fmov     d2, x8
    fmov     d1, #12.00000000
    fmov     d3, #22.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0xac8]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, #6.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb10]
    fmov     d0, #1.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x3a8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    bl       #0x461cb4 // _objc_retainAutorelease
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac0]
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x21
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb18]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x448]
    mov      x0, x21
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x258]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x260]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    ldp      d9, d8, [sp], #0x50
    b        #0x461c9c // _objc_release

// -[WCLGHomePinnedPanelView addActionAccessoryToRow:] IMP=0x38C3A0 bounds=0x38C3A0-0x38C3A4
loc_38C3A0:
    ret      

// -[WCLGHomePinnedPanelView refreshBadgeSwatch] IMP=0x38C3A4 bounds=0x38C3A4-0x38C4C4
loc_38C3A4:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    bl       #0x37aca0
    cbz      x0, #0x38c420
    stp      xzr, xzr, [sp, #0x10]
    mov      x8, #0x3ff0000000000000
    stp      x8, xzr, [sp]
    add      x1, sp, #0x18
    add      x2, sp, #0x10
    add      x3, sp, #8
    mov      x4, sp
    bl       #0x260674
    mov      x20, #0
    cbz      w0, #0x38c440
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    ldp      d1, d0, [sp, #0x10]
    ldp      d3, d2, [sp]
    fcmp     d3, #0.0
    fmov     d4, #1.00000000
    fcsel    d3, d4, d3, ls
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8f8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    b        #0x38c43c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6a0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x21, x20
    cbnz     x20, #0x38c468
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x6a0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x268]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cbnz     x20, #0x38c4a8
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    ret      

// -[WCLGHomePinnedPanelView closeTapped] IMP=0x38C4C4 bounds=0x38C4C4-0x38C4C8
loc_38C4C4:
    b        #0x38c4c8

// -[WCLGHomePinnedPanelView switchChanged:] IMP=0x38C5F4 bounds=0x38C5F4-0x38CA58
loc_38C5F4:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x581000
    add      x8, x8, #0xa1c
    ldar     w9, [x8]
    cbnz     w9, #0x38c7cc
    adrp     x9, #0x554000
    add      x9, x9, #0x45a
    ldrb     w10, [x9]
    mov      w11, #0x92
    eor      w10, w10, w11
    adrp     x11, #0x554000
    add      x11, x11, #0x463
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xffffffcf
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0xffffffc1
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x86
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w13, #0xea
    eor      w10, w10, w13
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0xc
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w13, #0x17
    eor      w10, w10, w13
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    eor      w10, w10, #0xffffffe3
    strb     w10, [x11, #7]
    ldrb     w9, [x9, #8]
    mov      w10, #0x93
    eor      w9, w9, w10
    strb     w9, [x11, #8]
    adrp     x9, #0x554000
    add      x9, x9, #0x44c
    ldrb     w10, [x9]
    eor      w10, w10, #0xffffff83
    adrp     x11, #0x554000
    add      x11, x11, #0x453
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w13, #0xbd
    eor      w10, w10, w13
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xffffff8f
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0xffffffcf
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    eor      w10, w10, #0xbbbbbbbb
    strb     w10, [x11, #5]
    ldrb     w9, [x9, #6]
    mov      w10, #0x39
    eor      w9, w9, w10
    strb     w9, [x11, #6]
    adrp     x9, #0x554000
    add      x9, x9, #0x46c
    ldrb     w10, [x9]
    mov      w11, #0x13
    adrp     x12, #0x554000
    add      x12, x12, #0x46f
    eor      w10, w10, w11
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    mov      w11, #0x63
    eor      w10, w10, w11
    strb     w10, [x12, #1]
    ldrb     w9, [x9, #2]
    mov      w10, #0xd6
    eor      w9, w9, w10
    strb     w9, [x12, #2]
    adrp     x9, #0x554000
    add      x9, x9, #0x440
    ldrb     w10, [x9]
    mov      w11, #5
    eor      w10, w10, w11
    adrp     x11, #0x554000
    add      x11, x11, #0x446
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0x10
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x5a
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x9b
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    eor      w10, w10, #0xffffffcf
    strb     w10, [x11, #4]
    ldrb     w9, [x9, #5]
    mov      w10, #0x67
    eor      w9, w9, w10
    strb     w9, [x11, #5]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x22, sp, #0x10
    mov      sp, x22
    sub      x24, sp, #0x10
    mov      sp, x24
    sub      x26, sp, #0x30
    mov      sp, x26
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x1e0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x470]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x528]
    adrp     x2, #0x554000
    add      x2, x2, #0x560
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x358]
    adrp     x2, #0x554000
    add      x2, x2, #0x520
    mov      x0, x23
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x38c964
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x470]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x38c988
    mov      x0, x22
    mov      x1, x20
    bl       #0x461c54 // _objc_initWeak
    mov      x0, x24
    mov      x1, x19
    bl       #0x461c54 // _objc_initWeak
    bl       #0x38ca58
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x26]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x26, #8]
    adrp     x8, #0x38c000
    add      x8, x8, #0xb64
    adrp     x9, #0x4a5000
    add      x9, x9, #0x4b8
    stp      x8, x9, [x26, #0x10]
    add      x0, x26, #0x20
    mov      x1, x24
    bl       #0x461c00 // _objc_copyWeak
    add      x0, x26, #0x28
    mov      x1, x22
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, x20
    mov      x1, x26
    bl       #0x385f40
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    add      x0, x26, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x26, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x24
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x22
    bl       #0x461c0c // _objc_destroyWeak
    b        #0x38c9e4
    adrp     x2, #0x554000
    add      x2, x2, #0x4e0
    mov      x0, x23
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x38c998
    adrp     x20, #0x4a3000
    add      x20, x20, #0xd70
    b        #0x38c9b8
    mov      w2, #0
    adrp     x20, #0x4a3000
    add      x20, x20, #0xd40
    b        #0x38c9cc
    adrp     x2, #0x554000
    add      x2, x2, #0x4a0
    mov      x0, x23
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x38c9e0
    adrp     x20, #0x4a3000
    add      x20, x20, #0xd78
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x470]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    ldr      x3, [x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x350]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    bl       #0x3912b8
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x21
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
    add      x0, x26, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x26, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    b        #0x38ca40
    mov      x19, x0
    mov      x0, x24
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x22
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGHomePinnedPanelView segmentChanged:] IMP=0x38CBD0 bounds=0x38CBD0-0x38CC6C
loc_38CBD0:
    stp      x22, x21, [sp, #-0x30]!
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x19, x2
    adrp     x8, #0x4c4000
    ldr      x20, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x308]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd08]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cmp      x21, #1
    cset     w2, eq
    adrp     x8, #0x4a3000
    add      x8, x8, #0xdd0
    ldr      x3, [x8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x908]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    ldp      x22, x21, [sp], #0x30
    b        #0x3912b8

// -[WCLGHomePinnedPanelView stepperChanged:] IMP=0x38CC6C bounds=0x38CC6C-0x38D018
loc_38CC6C:
    stp      d9, d8, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x581000
    add      x8, x8, #0xa34
    ldar     w9, [x8]
    cbnz     w9, #0x38cd68
    adrp     x9, #0x554000
    add      x9, x9, #0x58e
    ldrb     w10, [x9]
    mov      w11, #0xd8
    eor      w10, w10, w11
    adrp     x11, #0x554000
    add      x11, x11, #0x592
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xffffffe1
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0xd6
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w9, [x9, #3]
    mov      w10, #0xa7
    eor      w9, w9, w10
    adrp     x10, #0x554000
    add      x10, x10, #0x580
    strb     w9, [x11, #3]
    ldrb     w9, [x10]
    mov      w11, #0x5b
    eor      w9, w9, w11
    adrp     x11, #0x554000
    add      x11, x11, #0x587
    strb     w9, [x11]
    ldrb     w9, [x10, #1]
    eor      w9, w9, #0xcccccccc
    strb     w9, [x11, #1]
    ldrb     w9, [x10, #2]
    mov      w12, #0xba
    eor      w9, w9, w12
    strb     w9, [x11, #2]
    ldrb     w9, [x10, #3]
    mov      w12, #0xd5
    eor      w9, w9, w12
    strb     w9, [x11, #3]
    ldrb     w9, [x10, #4]
    mov      w12, #0x3b
    eor      w9, w9, w12
    strb     w9, [x11, #4]
    ldrb     w9, [x10, #5]
    mov      w12, #0xa4
    eor      w9, w9, w12
    strb     w9, [x11, #5]
    ldrb     w9, [x10, #6]
    mov      w10, #0xeb
    eor      w9, w9, w10
    strb     w9, [x11, #6]
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x1e0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x24, [x8, #0x470]
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x528]
    adrp     x2, #0x554000
    add      x2, x2, #0x600
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4a3000
    add      x8, x8, #0xd90
    ldr      x2, [x8]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x358]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x38ce40
    fcvtzs   x0, d8
    bl       #0x37d684
    b        #0x38cef4
    adrp     x8, #0x4a3000
    add      x8, x8, #0xda8
    ldr      x2, [x8]
    mov      x0, x22
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x38ce68
    fcvtzs   x0, d8
    bl       #0x37d510
    b        #0x38cef4
    adrp     x8, #0x4a3000
    add      x8, x8, #0xdb0
    ldr      x2, [x8]
    mov      x0, x22
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x38ce90
    fmov     d0, d8
    bl       #0x37d584
    b        #0x38cef4
    adrp     x8, #0x4a3000
    add      x8, x8, #0xdb8
    ldr      x2, [x8]
    mov      x0, x22
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x38ceb8
    fmov     d0, d8
    bl       #0x37d604
    b        #0x38cef4
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xae8]
    fmov     d0, d8
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x468]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x25, [x8, #0xa8]
    mov      x0, x19
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f0]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x20
    mov      x1, x23
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x38be9c
    fmov     d8, d0
    adrp     x2, #0x554000
    add      x2, x2, #0x5c0
    mov      x0, x21
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    fmov     d0, d8
    bl       #0x38c020
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    mov      x0, x25
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    bl       #0x3912b8
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      d9, d8, [sp], #0x60
    b        #0x461c9c // _objc_release

// -[WCLGHomePinnedPanelView rowTapped:] IMP=0x38D018 bounds=0x38D018-0x38D340
loc_38D018:
    stp      x24, x23, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x20, x2
    mov      x19, x0
    adrp     x8, #0x581000
    add      x8, x8, #0xa38
    ldar     w9, [x8]
    cbnz     w9, #0x38d1bc
    adrp     x9, #0x554000
    add      x9, x9, #0x632
    ldrb     w10, [x9]
    mov      w11, #0xc9
    eor      w10, w10, w11
    adrp     x11, #0x554000
    add      x11, x11, #0x639
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xce
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x1a
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0x18
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0xa3
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x7a
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w9, [x9, #6]
    eor      w9, w9, #0xffffffdf
    strb     w9, [x11, #6]
    adrp     x9, #0x554000
    add      x9, x9, #0x628
    ldrb     w10, [x9]
    mov      w11, #0xb3
    eor      w10, w10, w11
    adrp     x11, #0x554000
    add      x11, x11, #0x62d
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    mov      w12, #0xca
    eor      w10, w10, w12
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    mov      w12, #0x6b
    eor      w10, w10, w12
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    eor      w10, w10, #0xffffffbf
    strb     w10, [x11, #3]
    ldrb     w9, [x9, #4]
    eor      w9, w9, #0xdddddddd
    strb     w9, [x11, #4]
    adrp     x9, #0x554000
    add      x9, x9, #0x640
    ldrb     w10, [x9]
    mov      w11, #0xd
    adrp     x12, #0x554000
    add      x12, x12, #0x645
    eor      w10, w10, w11
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    mov      w11, #0xcd
    eor      w10, w10, w11
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    mov      w11, #0x57
    eor      w10, w10, w11
    strb     w10, [x12, #2]
    ldrb     w10, [x9, #3]
    mov      w11, #0xc5
    eor      w10, w10, w11
    strb     w10, [x12, #3]
    ldrb     w9, [x9, #4]
    mov      w10, #0x4f
    eor      w9, w9, w10
    strb     w9, [x12, #4]
    adrp     x9, #0x554000
    add      x9, x9, #0x620
    ldrb     w10, [x9]
    mov      w11, #0x12
    adrp     x12, #0x554000
    add      x12, x12, #0x624
    eor      w10, w10, w11
    strb     w10, [x12]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xeeeeeeee
    strb     w10, [x12, #1]
    ldrb     w10, [x9, #2]
    mov      w11, #0xa7
    eor      w10, w10, w11
    strb     w10, [x12, #2]
    ldrb     w9, [x9, #3]
    eor      w9, w9, #0x7e
    strb     w9, [x12, #3]
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c2000
    ldr      x21, [x8, #0x1e0]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x470]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x528]
    adrp     x2, #0x554000
    add      x2, x2, #0x730
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4e8]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cmp      x22, #4
    b.eq     #0x38d294
    cmp      x22, #3
    b.ne     #0x38d328
    adrp     x8, #0x4c2000
    ldr      x1, [x8, #0x270]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    b        #0x38d328
    adrp     x2, #0x554000
    add      x2, x2, #0x6f0
    mov      x0, x20
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x358]
    adrp     x2, #0x554000
    add      x2, x2, #0x6b0
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x38d2e8
    bl       #0x38ca58
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    bl       #0x386364
    b        #0x38d318
    adrp     x2, #0x554000
    add      x2, x2, #0x670
    mov      x0, x19
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x38d320
    bl       #0x38ca58
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x1, #0
    bl       #0x3862c0
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      x24, x23, [sp], #0x40
    b        #0x461c9c // _objc_release

// -[WCLGHomePinnedPanelView badgeColorTapped] IMP=0x38D340 bounds=0x38D340-0x38D5D8
loc_38D340:
    stp      d9, d8, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x22, x0
    adrp     x8, #0x581000
    add      x8, x8, #0xa3c
    ldar     w9, [x8]
    cbnz     w9, #0x38d3f0
    adrp     x9, #0x554000
    add      x9, x9, #0x750
    ldrh     w10, [x9]
    mov      w11, #0x40f1
    eor      w10, w10, w11
    adrp     x11, #0x554000
    add      x11, x11, #0x75e
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0xe57f
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0xa050
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0x2075
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0xbaa5
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0x505c
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w9, [x9, #0xc]
    mov      w10, #0x7b66
    eor      w9, w9, w10
    strh     w9, [x11, #0xc]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x19, sp, #0x10
    mov      sp, x19
    sub      x20, sp, #0x30
    mov      sp, x20
    sub      x21, sp, #0x30
    mov      sp, x21
    bl       #0x37aca0
    mov      x23, x0
    cbnz     x0, #0x38d43c
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x650]
    adrp     x8, #0x491000
    ldr      d2, [x8, #0x658]
    fmov     d0, #1.00000000
    fmov     d3, #1.00000000
    bl       #0x2605e8
    mov      x23, x0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x528]
    bl       #0x461ba0 // _objc_alloc
    mov      x22, x0
    adrp     x25, #0x4a0000
    ldr      x25, [x25, #0x748]
    str      x25, [x20]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    str      d8, [x20, #8]
    adrp     x8, #0x38d000
    add      x8, x8, #0x5d8
    adrp     x9, #0x4a2000
    add      x9, x9, #0xad8
    stp      x8, x9, [x20, #0x10]
    add      x0, x20, #0x20
    mov      x1, x19
    bl       #0x461c00 // _objc_copyWeak
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x488]
    adrp     x2, #0x554000
    add      x2, x2, #0x790
    mov      x0, x22
    mov      x3, x23
    mov      x4, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1b8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f0]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb50]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    bl       #0x38ca58
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    str      x25, [x21]
    str      d8, [x21, #8]
    adrp     x8, #0x38d000
    add      x8, x8, #0x664
    adrp     x9, #0x4a1000
    add      x9, x9, #0x628
    stp      x8, x9, [x21, #0x10]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    str      x22, [x21, #0x20]
    add      x0, x21, #0x28
    mov      x1, x19
    bl       #0x461c00 // _objc_copyWeak
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x24
    mov      x2, x23
    mov      w3, #1
    mov      x4, x21
    bl       #0x461c6c // _objc_msgSend
    add      x0, x21, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    ldr      x0, [x21, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    add      x0, x20, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461c0c // _objc_destroyWeak
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      d9, d8, [sp], #0x60
    ret      
    mov      x22, x0
    add      x0, x21, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    b        #0x38d5c0
    b        #0x38d5bc
    b        #0x38d5bc
    mov      x22, x0
    b        #0x38d5c8
    mov      x22, x0
    add      x0, x20, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x22
    bl       #0x461894 // __Unwind_Resume

// -[WCLGHomePinnedPanelView dismissTopModal] IMP=0x38D708 bounds=0x38D708-0x38D748
loc_38D708:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    bl       #0x38ca58
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb38]
    mov      w2, #1
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c9c // _objc_release

// -[WCLGHomePinnedPanelView handlePan:] IMP=0x38D748 bounds=0x38D748-0x38D880
loc_38D748:
    stp      d9, d8, [sp, #-0x40]!
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9a0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    cbz      x0, #0x38d860
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x3d0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    b.ne     #0x38d7c4
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x338]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4a8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4b0]
    mov      x0, x19
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d8, d0
    fmov     d9, d1
    adrp     x8, #0x4c1000
    ldr      x22, [x8, #0x4b8]
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    fadd     d8, d8, d0
    mov      x0, x20
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    fadd     d9, d9, d1
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    fmov     d4, d0
    fmov     d5, d1
    fmov     d6, d2
    fmov     d7, d3
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x4c0]
    mov      x0, x20
    fmov     d0, d8
    fmov     d1, d9
    fmov     d2, d4
    fmov     d3, d5
    fmov     d4, d6
    fmov     d5, d7
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xe0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    ldp      d9, d8, [sp], #0x40
    b        #0x461c9c // _objc_release

// -[WCLGHomePinnedPanelView clampedCenter:inBounds:] IMP=0x38D880 bounds=0x38D880-0x38D948
loc_38D880:
    stp      d13, d12, [sp, #-0x50]!
    stp      d11, d10, [sp, #0x10]
    stp      d9, d8, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    fmov     d8, d5
    fmov     d9, d4
    fmov     d10, d1
    fmov     d11, d0
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x4d8]
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d12, #0.50000000
    fmul     d13, d2, d12
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    fmov     d0, #8.00000000
    fadd     d0, d13, d0
    fmov     d1, #-8.00000000
    fadd     d2, d9, d1
    fsub     d2, d2, d13
    fmul     d4, d9, d12
    fcmp     d0, d11
    fcsel    d5, d11, d0, mi
    fcmp     d2, d5
    fcsel    d5, d2, d5, mi
    fcmp     d0, d2
    fcsel    d0, d4, d5, hi
    fmul     d2, d3, d12
    mov      x8, #0x4049000000000000
    fmov     d3, x8
    fadd     d3, d2, d3
    fadd     d1, d8, d1
    fsub     d1, d1, d2
    fcmp     d3, d10
    fcsel    d2, d10, d3, mi
    fcmp     d1, d2
    fcsel    d2, d1, d2, mi
    fcmp     d3, d1
    fcsel    d1, d3, d2, hi
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    ldp      d11, d10, [sp, #0x10]
    ldp      d13, d12, [sp], #0x50
    ret      

// -[WCLGHomePinnedPanelView gestureRecognizer:shouldReceiveTouch:] IMP=0x38D948 bounds=0x38D948-0x38D9B4
loc_38D948:
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
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x150]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    eor      w0, w20, #1
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    ret      

// -[WCLGHomePinnedPanelView panelBG] IMP=0x38D9B4 bounds=0x38D9B4-0x38D9C4
loc_38D9B4:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe08]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGHomePinnedPanelView setPanelBG:] IMP=0x38D9C4 bounds=0x38D9C4-0x38D9D8
loc_38D9C4:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe08]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGHomePinnedPanelView scrollView] IMP=0x38D9D8 bounds=0x38D9D8-0x38D9E8
loc_38D9D8:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe0c]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGHomePinnedPanelView setScrollView:] IMP=0x38D9E8 bounds=0x38D9E8-0x38D9FC
loc_38D9E8:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe0c]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGHomePinnedPanelView rows] IMP=0x38D9FC bounds=0x38D9FC-0x38DA0C
loc_38D9FC:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe10]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGHomePinnedPanelView setRows:] IMP=0x38DA0C bounds=0x38DA0C-0x38DA20
loc_38DA0C:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe10]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGHomePinnedPanelView valueLabels] IMP=0x38DA20 bounds=0x38DA20-0x38DA30
loc_38DA20:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe14]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGHomePinnedPanelView setValueLabels:] IMP=0x38DA30 bounds=0x38DA30-0x38DA44
loc_38DA30:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe14]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGHomePinnedPanelView badgeSwatch] IMP=0x38DA44 bounds=0x38DA44-0x38DA54
loc_38DA44:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe18]
    ldr      x0, [x0, x8]
    ret      

// -[WCLGHomePinnedPanelView setBadgeSwatch:] IMP=0x38DA54 bounds=0x38DA54-0x38DA68
loc_38DA54:
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe18]
    add      x0, x0, x8
    b        #0x461cfc // _objc_storeStrong

// -[WCLGHomePinnedPanelView dragStartCenter] IMP=0x38DA68 bounds=0x38DA68-0x38DA7C
loc_38DA68:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe1c]
    add      x8, x0, x8
    ldp      d0, d1, [x8]
    ret      

// -[WCLGHomePinnedPanelView setDragStartCenter:] IMP=0x38DA7C bounds=0x38DA7C-0x38DA90
loc_38DA7C:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe1c]
    add      x8, x0, x8
    stp      d0, d1, [x8]
    ret      

// -[WCLGHomePinnedPanelView darkMode] IMP=0x38DA90 bounds=0x38DA90-0x38DAA0
loc_38DA90:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe20]
    ldrb     w0, [x0, x8]
    ret      

// -[WCLGHomePinnedPanelView setDarkMode:] IMP=0x38DAA0 bounds=0x38DAA0-0x38DAB0
loc_38DAA0:
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe20]
    strb     w2, [x0, x8]
    ret      

// -[WCLGHomePinnedPanelView .cxx_destruct] IMP=0x38DAB0 bounds=0x38DAB0-0x38DB2C
loc_38DAB0:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe18]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe14]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe10]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe0c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xe08]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
