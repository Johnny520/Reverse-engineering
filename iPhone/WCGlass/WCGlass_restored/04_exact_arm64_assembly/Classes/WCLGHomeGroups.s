// Exact ARM64 listing for WCLGHomeGroups

// +[WCLGHomeGroups sharedManager] IMP=0x34A724 bounds=0x34A724-0x34A940
loc_34A724:
    sub      sp, sp, #0xd0
    stp      d9, d8, [sp, #0x60]
    stp      x28, x27, [sp, #0x70]
    stp      x26, x25, [sp, #0x80]
    stp      x24, x23, [sp, #0x90]
    stp      x22, x21, [sp, #0xa0]
    stp      x20, x19, [sp, #0xb0]
    stp      x29, x30, [sp, #0xc0]
    add      x29, sp, #0xc0
    str      x0, [sp, #8]
    mov      w21, #0x71a2
    movk     w21, #0x90c9, lsl #16
    mov      w8, #0xc438
    movk     w8, #0xc0fc, lsl #16
    str      w8, [sp, #0x34]
    add      x8, sp, #0x34
    str      x8, [sp, #0x28]
    mov      w23, #0x6eb1
    movk     w23, #0xdf0b, lsl #16
    mov      w24, #0x71a1
    movk     w24, #0x90c9, lsl #16
    mov      w25, #0xe512
    movk     w25, #0x84bb, lsl #16
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x398]
    mov      w26, #0x7edc
    movk     w26, #0xf50e, lsl #16
    mov      w27, #0x6eb2
    movk     w27, #0xdf0b, lsl #16
    mov      w20, #0x443
    movk     w20, #0x877e, lsl #16
    mov      w22, #0xb299
    movk     w22, #0x5991, lsl #16
    add      x8, sp, #0x38
    add      x8, x8, #8
    str      x8, [sp]
    mov      w28, #0xb298
    movk     w28, #0x5991, lsl #16
    mov      w19, #0xf611
    movk     w19, #0x604a, lsl #16
    ldr      w8, [sp, #0x34]
    cmp      w8, w23
    b.le     #0x34a7fc
    cmp      w8, w28
    b.le     #0x34a820
    cmp      w8, w22
    b.eq     #0x34a8ec
    cmp      w8, w19
    b.eq     #0x34a814
    mov      w9, #0x8804
    movk     w9, #0x6123, lsl #16
    cmp      w8, w9
    b.ne     #0x34a7c4
    b        #0x34a910
    cmp      w8, w24
    b.gt     #0x34a84c
    cmp      w8, w25
    b.eq     #0x34a890
    cmp      w8, w20
    b.ne     #0x34a7c4
    ldr      x8, [sp, #0x28]
    str      w21, [x8]
    b        #0x34a7c4
    cmp      w8, w27
    b.eq     #0x34a884
    cmp      w8, w26
    b.ne     #0x34a7c4
    add      x1, sp, #0x38
    adrp     x0, #0x581000
    add      x0, x0, #0x1a8
    bl       #0x4619d8 // _dispatch_once
    ldr      x8, [sp, #0x28]
    str      w20, [x8]
    b        #0x34a7c4
    cmp      w8, w21
    b.eq     #0x34a8cc
    mov      w9, #0xc438
    movk     w9, #0xc0fc, lsl #16
    cmp      w8, w9
    b.ne     #0x34a7c4
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x740]
    str      x8, [sp, #0x38]
    ldr      x8, [sp]
    str      x8, [sp, #0x20]
    ldr      x8, [sp, #0x28]
    str      w25, [x8]
    b        #0x34a7c4
    ldr      x8, [sp, #0x28]
    str      w19, [x8]
    b        #0x34a7c4
    ldp      x8, x9, [sp, #0x20]
    str      d8, [x8]
    adrp     x8, #0x34a000
    add      x10, x8, #0x940
    adrp     x8, #0x4a0000
    add      x8, x8, #0xd88
    stp      x10, x8, [sp, #0x48]
    ldr      x8, [sp, #8]
    str      x8, [sp, #0x58]
    adrp     x8, #0x581000
    ldr      x8, [x8, #0x1a8]
    cmn      x8, #1
    csel     w8, w27, w26, eq
    str      w8, [x9]
    b        #0x34a7c4
    adrp     x8, #0x581000
    ldr      x8, [x8, #0x1a8]
    cmn      x8, #1
    cset     w8, eq
    strb     w8, [sp, #0x1f]
    ldr      x8, [sp, #0x28]
    str      w22, [x8]
    b        #0x34a7c4
    adrp     x8, #0x581000
    ldr      x0, [x8, #0x1a0]
    str      x0, [sp, #0x10]
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp, #0x28]
    mov      w9, #0x8804
    movk     w9, #0x6123, lsl #16
    str      w9, [x8]
    b        #0x34a7c4
    ldr      x0, [sp, #0x10]
    bl       #0x461be8 // _objc_autoreleaseReturnValue
    ldr      x0, [sp, #0x10]
    ldp      x29, x30, [sp, #0xc0]
    ldp      x20, x19, [sp, #0xb0]
    ldp      x22, x21, [sp, #0xa0]
    ldp      x24, x23, [sp, #0x90]
    ldp      x26, x25, [sp, #0x80]
    ldp      x28, x27, [sp, #0x70]
    ldp      d9, d8, [sp, #0x60]
    add      sp, sp, #0xd0
    ret      

// -[WCLGHomeGroups init] IMP=0x34A9D0 bounds=0x34A9D0-0x34AB94
loc_34A9D0:
    sub      sp, sp, #0xb0
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      w19, #0x6dc0
    movk     w19, #0x69dc, lsl #16
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7f8]
    mov      w20, #0x2e31
    movk     w20, #0xc7f5, lsl #16
    add      x9, sp, #0xc
    mov      w21, #0xa3be
    movk     w21, #0x2f1f, lsl #16
    stp      x8, x0, [sp, #0x38]
    add      x8, sp, #0x40
    str      w20, [sp, #0xc]
    add      x22, x8, #8
    mov      w23, #0xa3bf
    movk     w23, #0x2f1f, lsl #16
    mov      w24, #0x1835
    movk     w24, #0xfc44, lsl #16
    str      x9, [sp]
    mov      w27, #0xf171
    movk     w27, #0xe9a, lsl #16
    mov      w28, #0x3946
    movk     w28, #0x6802, lsl #16
    adrp     x25, #0x4c4000
    adrp     x26, #0x4be000
    ldr      w8, [sp, #0xc]
    cmp      w8, w21
    b.gt     #0x34aab0
    cmp      w8, w20
    b.eq     #0x34aae0
    cmp      w8, w24
    b.eq     #0x34aaf0
    cmp      w8, w27
    b.ne     #0x34aa50
    ldr      x0, [sp, #0x28]
    ldr      x1, [sp, #0x10]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf00]
    ldr      x0, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf08]
    ldr      x0, [sp, #0x28]
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp]
    str      w19, [x8]
    b        #0x34aa50
    cmp      w8, w23
    b.eq     #0x34ab38
    cmp      w8, w28
    b.ne     #0x34ab68
    ldr      x8, [sp, #0x28]
    str      wzr, [x8, #8]
    ldr      x9, [x25, #0x110]
    ldr      x8, [x26, #0x808]
    stp      x8, x9, [sp, #0x18]
    ldr      x8, [sp]
    str      w24, [x8]
    b        #0x34aa50
    str      x22, [sp, #0x30]
    ldr      x8, [sp]
    str      w23, [x8]
    b        #0x34aa50
    ldp      x1, x0, [sp, #0x18]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldr      x9, [sp, #0x28]
    ldr      x8, [x9, #0x10]
    str      x0, [x9, #0x10]
    mov      x0, x8
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x28]
    mov      w9, #1
    strb     w9, [x8, #0x20]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xef8]
    str      x8, [sp, #0x10]
    ldr      x8, [sp]
    str      w27, [x8]
    b        #0x34aa50
    ldp      x9, x8, [sp, #0x30]
    str      x8, [x9]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb78]
    add      x0, sp, #0x40
    bl       #0x461c84 // _objc_msgSendSuper2
    str      x0, [sp, #0x28]
    cmp      x0, #0
    csel     w8, w19, w28, eq
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x34aa50
    cmp      w8, w19
    b.ne     #0x34aa50
    ldr      x0, [sp, #0x28]
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    add      sp, sp, #0xb0
    ret      

// -[WCLGHomeGroups loadFromDisk] IMP=0x34AB94 bounds=0x34AB94-0x34B920
loc_34AB94:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x130
    mov      x19, sp
    mov      x23, x0
    mov      w27, #0x33a9
    movk     w27, #0xc568, lsl #16
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x60]
    adrp     x8, #0x581000
    add      x8, x8, #0x270
    ldar     w8, [x8]
    stur     w8, [x29, #-0x64]
    mov      w8, #0xd062
    movk     w8, #0x4a99, lsl #16
    str      w8, [x19, #0xc]
    add      x8, x19, #0xc
    str      x8, [x19]
    mov      w25, #0x8cda
    movk     w25, #0x4c, lsl #16
    mov      w26, #0xc157
    movk     w26, #0xc251, lsl #16
    adrp     x28, #0x54b000
    add      x28, x28, #0xf10
    adrp     x24, #0x54b000
    add      x24, x24, #0xf30
    adrp     x21, #0x54b000
    add      x21, x21, #0xed0
    adrp     x20, #0x54b000
    add      x20, x20, #0xef0
    mov      w22, #0xd061
    movk     w22, #0x4a99, lsl #16
    ldr      w8, [x19, #0xc]
    cmp      w8, w25
    b.gt     #0x34acb0
    cmp      w8, w26
    b.gt     #0x34ad38
    mov      w9, #0x44da
    movk     w9, #0x9bf6, lsl #16
    cmp      w8, w9
    b.le     #0x34ae14
    mov      w9, #0x898c
    movk     w9, #0xb305, lsl #16
    cmp      w8, w9
    b.le     #0x34b0d0
    mov      w9, #0x898d
    movk     w9, #0xb305, lsl #16
    cmp      w8, w9
    b.eq     #0x34b84c
    mov      w9, #0x3db5
    movk     w9, #0xb498, lsl #16
    cmp      w8, w9
    b.eq     #0x34b744
    mov      w9, #0xf041
    movk     w9, #0xbe9e, lsl #16
    cmp      w8, w9
    b.ne     #0x34ac30
    ldur     x0, [x29, #-0x90]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x19]
    mov      w9, #0xd09e
    movk     w9, #0x7415, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    cmp      w8, w22
    b.gt     #0x34ada4
    mov      w9, #0x88cc
    movk     w9, #0xad3, lsl #16
    cmp      w8, w9
    b.le     #0x34af5c
    mov      w9, #0xc097
    movk     w9, #0x1f4b, lsl #16
    cmp      w8, w9
    b.le     #0x34b388
    mov      w9, #0xc098
    movk     w9, #0x1f4b, lsl #16
    cmp      w8, w9
    b.eq     #0x34b894
    mov      w9, #0x8803
    movk     w9, #0x3820, lsl #16
    cmp      w8, w9
    b.eq     #0x34b7ac
    mov      w9, #0x6dd3
    movk     w9, #0x3e24, lsl #16
    cmp      w8, w9
    b.ne     #0x34ac30
    ldr      x1, [x19, #0xa8]
    ldp      x0, x2, [x19, #0x80]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x78]
    cmp      x0, #0
    mov      w8, #0x8cdb
    movk     w8, #0x4c, lsl #16
    mov      w9, #0x898d
    movk     w9, #0xb305, lsl #16
    b        #0x34ae0c
    mov      w9, #0xc36a
    movk     w9, #0xca41, lsl #16
    cmp      w8, w9
    b.le     #0x34ae80
    mov      w9, #0xf37
    movk     w9, #0xe259, lsl #16
    cmp      w8, w9
    b.le     #0x34b110
    mov      w9, #0xf38
    movk     w9, #0xe259, lsl #16
    cmp      w8, w9
    b.eq     #0x34b870
    mov      w9, #0x8e6d
    movk     w9, #0xf241, lsl #16
    cmp      w8, w9
    b.eq     #0x34b768
    mov      w9, #0xc280
    movk     w9, #0xfee9, lsl #16
    cmp      w8, w9
    b.ne     #0x34ac30
    ldrb     w8, [x19, #0x77]
    cmp      w8, #0
    mov      w8, #0x8cdb
    movk     w8, #0x4c, lsl #16
    mov      w9, #0x3db5
    movk     w9, #0xb498, lsl #16
    b        #0x34b7a4
    mov      w9, #0x72a7
    movk     w9, #0x6cb7, lsl #16
    cmp      w8, w9
    b.le     #0x34afb4
    mov      w9, #0xd09d
    movk     w9, #0x7415, lsl #16
    cmp      w8, w9
    b.gt     #0x34b3e0
    mov      w9, #0x72a8
    movk     w9, #0x6cb7, lsl #16
    cmp      w8, w9
    b.eq     #0x34b78c
    mov      w9, #0xa3a2
    movk     w9, #0x723b, lsl #16
    cmp      w8, w9
    b.ne     #0x34b8bc
    ldr      x8, [x19, #0x20]
    str      x8, [x19, #0x10]
    ldp      x9, x8, [x19, #0xb8]
    ldr      x8, [x8]
    ldr      x8, [x8]
    cmp      x8, x9
    mov      w8, #0xd839
    movk     w8, #0x1ed, lsl #16
    mov      w9, #0xf041
    movk     w9, #0xbe9e, lsl #16
    csel     w8, w8, w9, eq
    b        #0x34b8b0
    mov      w9, #0xaa80
    movk     w9, #0x898c, lsl #16
    cmp      w8, w9
    b.gt     #0x34b014
    mov      w9, #0x4431
    movk     w9, #0x87ff, lsl #16
    cmp      w8, w9
    b.eq     #0x34b42c
    mov      w9, #0x6d5a
    movk     w9, #0x88cf, lsl #16
    cmp      w8, w9
    b.ne     #0x34ac30
    ldr      x8, [x19, #0x28]
    stp      x8, xzr, [x19, #0x18]
    adrp     x8, #0x4c1000
    ldr      x9, [x8, #0xf10]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xd00]
    stp      x8, x9, [x19, #0xa0]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x830]
    str      x8, [x19, #0x98]
    ldr      x8, [x19]
    mov      w9, #0xa3a2
    movk     w9, #0x723b, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    mov      w9, #0x33a8
    movk     w9, #0xc568, lsl #16
    cmp      w8, w9
    b.gt     #0x34b048
    mov      w9, #0xc158
    movk     w9, #0xc251, lsl #16
    cmp      w8, w9
    b.eq     #0x34b444
    mov      w9, #0xb598
    movk     w9, #0xc266, lsl #16
    cmp      w8, w9
    b.ne     #0x34ac30
    ldur     x0, [x29, #-0x98]
    ldr      x8, [x19, #0x40]
    str      x0, [x8]
    bl       #0x461ca8 // _objc_retain
    ldr      x0, [x19, #0x38]
    bl       #0x461c9c // _objc_release
    ldp      x1, x0, [x29, #-0x88]
    adrp     x2, #0x54b000
    add      x2, x2, #0xf70
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x23
    mov      x23, x0
    bl       #0x347364
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x30]
    mov      x0, x23
    mov      x23, x27
    mov      w27, #0x33a9
    movk     w27, #0xc568, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x30]
    cmp      x8, #0
    adrp     x9, #0x54b000
    add      x9, x9, #0xfb0
    csel     x1, x9, x8, eq
    add      x0, x23, #0x18
    bl       #0x461cfc // _objc_storeStrong
    ldr      x0, [x19, #0x48]
    bl       #0x461d74 // _os_unfair_lock_unlock
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf18]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    ldur     x0, [x29, #-0x98]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19]
    mov      w9, #0xc355
    movk     w9, #0x6d0a, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    mov      w9, #0x3ec8
    movk     w9, #0x241, lsl #16
    cmp      w8, w9
    b.gt     #0x34b088
    mov      w9, #0x8cdb
    movk     w9, #0x4c, lsl #16
    cmp      w8, w9
    b.eq     #0x34b54c
    mov      w9, #0xd839
    movk     w9, #0x1ed, lsl #16
    cmp      w8, w9
    b.ne     #0x34ac30
    ldr      x8, [x19, #0xb0]
    ldr      x8, [x8]
    ldr      x9, [x19, #0x10]
    add      x8, x8, x9, lsl #3
    str      x8, [x19, #0x90]
    ldr      x8, [x19]
    mov      w9, #0xe476
    movk     w9, #0x9e5, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    mov      w9, #0x82e9
    movk     w9, #0x5ea5, lsl #16
    cmp      w8, w9
    b.gt     #0x34b354
    mov      w9, #0xd062
    movk     w9, #0x4a99, lsl #16
    cmp      w8, w9
    b.eq     #0x34b6b8
    mov      w9, #0x57d5
    movk     w9, #0x5575, lsl #16
    cmp      w8, w9
    b.ne     #0x34ac30
    ldrb     w8, [x19, #0x57]
    cmp      w8, #0
    mov      w8, #0x6d5a
    movk     w8, #0x88cf, lsl #16
    mov      w9, #0x88cd
    movk     w9, #0xad3, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [x19]
    str      w8, [x9]
    ldr      x8, [x19, #0x58]
    str      x8, [x19, #0x28]
    b        #0x34ac30
    mov      w9, #0xaa81
    movk     w9, #0x898c, lsl #16
    cmp      w8, w9
    b.eq     #0x34b46c
    mov      w9, #0x242d
    movk     w9, #0x932a, lsl #16
    cmp      w8, w9
    b.ne     #0x34ac30
    ldr      x8, [x19]
    mov      w9, #0x8cdb
    movk     w9, #0x4c, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    cmp      w8, w27
    b.eq     #0x34b510
    mov      w9, #0xa81c
    movk     w9, #0xc97a, lsl #16
    cmp      w8, w9
    b.ne     #0x34ac30
    ldur     x8, [x29, #-0x70]
    add      x8, x8, #8
    str      x8, [x19, #0xb0]
    ldr      x8, [x19]
    mov      w9, #0x6d5a
    movk     w9, #0x88cf, lsl #16
    str      w9, [x8]
    ldur     x8, [x29, #-0xb0]
    str      x8, [x19, #0x28]
    b        #0x34ac30
    mov      w9, #0x3ec9
    movk     w9, #0x241, lsl #16
    cmp      w8, w9
    b.eq     #0x34b574
    mov      w9, #0xe476
    movk     w9, #0x9e5, lsl #16
    cmp      w8, w9
    b.ne     #0x34ac30
    ldr      x8, [x19, #0x90]
    ldr      x9, [x8]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x5f8]
    stp      x8, x9, [x19, #0x80]
    ldr      x8, [x19]
    mov      w9, #0x6dd3
    movk     w9, #0x3e24, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    mov      w9, #0x44db
    movk     w9, #0x9bf6, lsl #16
    cmp      w8, w9
    b.eq     #0x34b5a4
    mov      w9, #0x2857
    movk     w9, #0xaf51, lsl #16
    cmp      w8, w9
    b.ne     #0x34ac30
    ldur     x8, [x29, #-0x70]
    add      x8, x8, #0x10
    str      x8, [x19, #0xc0]
    ldr      x8, [x19]
    mov      w9, #0x8e6d
    movk     w9, #0xf241, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    mov      w9, #0xc36b
    movk     w9, #0xca41, lsl #16
    cmp      w8, w9
    b.eq     #0x34b68c
    mov      w9, #0xe53e
    movk     w9, #0xcc89, lsl #16
    cmp      w8, w9
    b.ne     #0x34ac30
    ldrb     w8, [x28]
    mov      w9, #0xab
    eor      w8, w8, w9
    strb     w8, [x24]
    ldrb     w8, [x28, #1]
    mov      w9, #0x62
    eor      w8, w8, w9
    strb     w8, [x24, #1]
    ldrb     w8, [x28, #2]
    mov      w9, #0x96
    eor      w8, w8, w9
    strb     w8, [x24, #2]
    ldrb     w8, [x28, #3]
    eor      w8, w8, #0xfc
    strb     w8, [x24, #3]
    ldrb     w8, [x28, #4]
    mov      w9, #0x90
    eor      w8, w8, w9
    strb     w8, [x24, #4]
    ldrb     w8, [x28, #5]
    mov      w9, #0xa6
    eor      w8, w8, w9
    strb     w8, [x24, #5]
    ldrb     w8, [x28, #6]
    mov      w9, #0x9c
    eor      w8, w8, w9
    strb     w8, [x24, #6]
    ldrb     w8, [x28, #7]
    eor      w8, w8, #0x1c
    strb     w8, [x24, #7]
    ldrb     w8, [x28, #8]
    mov      w9, #0xfa
    eor      w8, w8, w9
    strb     w8, [x24, #8]
    ldrb     w8, [x28, #9]
    mov      w9, #0x35
    eor      w8, w8, w9
    strb     w8, [x24, #9]
    ldrb     w8, [x28, #0xa]
    mov      w9, #0xc9
    eor      w8, w8, w9
    strb     w8, [x24, #0xa]
    ldrb     w8, [x28, #0xb]
    mov      w9, #0xd3
    eor      w8, w8, w9
    strb     w8, [x24, #0xb]
    ldrb     w8, [x28, #0xc]
    mov      w9, #0xb4
    eor      w8, w8, w9
    strb     w8, [x24, #0xc]
    ldrb     w8, [x28, #0xd]
    mov      w9, #0xd
    eor      w8, w8, w9
    strb     w8, [x24, #0xd]
    ldrb     w8, [x28, #0xe]
    mov      w9, #0x46
    eor      w8, w8, w9
    strb     w8, [x24, #0xe]
    ldrb     w8, [x28, #0xf]
    mov      w9, #0x4f
    eor      w8, w8, w9
    strb     w8, [x24, #0xf]
    ldrb     w8, [x28, #0x10]
    mov      w9, #0x43
    eor      w8, w8, w9
    strb     w8, [x24, #0x10]
    ldrb     w8, [x28, #0x11]
    mov      w9, #0xd4
    eor      w8, w8, w9
    strb     w8, [x24, #0x11]
    ldrb     w8, [x28, #0x12]
    mov      w9, #9
    eor      w8, w8, w9
    strb     w8, [x24, #0x12]
    ldrb     w8, [x21]
    mov      w9, #0x5e
    eor      w8, w8, w9
    strb     w8, [x20]
    ldrb     w8, [x21, #1]
    mov      w9, #0x63
    eor      w8, w8, w9
    strb     w8, [x20, #1]
    ldrb     w8, [x21, #2]
    eor      w8, w8, #7
    strb     w8, [x20, #2]
    ldrb     w8, [x21, #3]
    mov      w9, #0x6b
    eor      w8, w8, w9
    strb     w8, [x20, #3]
    ldrb     w8, [x21, #4]
    eor      w8, w8, #0xc
    strb     w8, [x20, #4]
    ldrb     w8, [x21, #5]
    mov      w9, #0x71
    eor      w8, w8, w9
    strb     w8, [x20, #5]
    ldrb     w8, [x21, #6]
    eor      w8, w8, #0xffffff9f
    strb     w8, [x20, #6]
    ldrb     w8, [x21, #7]
    eor      w8, w8, #0xf
    strb     w8, [x20, #7]
    ldrb     w8, [x21, #8]
    mov      w9, #0x3a
    eor      w8, w8, w9
    strb     w8, [x20, #8]
    ldrb     w8, [x21, #9]
    mov      w9, #0xec
    eor      w8, w8, w9
    strb     w8, [x20, #9]
    ldrb     w8, [x21, #0xa]
    mov      w9, #0x8d
    eor      w8, w8, w9
    strb     w8, [x20, #0xa]
    ldrb     w8, [x21, #0xb]
    mov      w9, #0x4b
    eor      w8, w8, w9
    strb     w8, [x20, #0xb]
    ldrb     w8, [x21, #0xc]
    mov      w9, #0xc4
    eor      w8, w8, w9
    strb     w8, [x20, #0xc]
    ldrb     w8, [x21, #0xd]
    mov      w9, #0x85
    eor      w8, w8, w9
    strb     w8, [x20, #0xd]
    ldrb     w8, [x21, #0xe]
    mov      w9, #0x51
    eor      w8, w8, w9
    strb     w8, [x20, #0xe]
    ldrb     w8, [x21, #0xf]
    sturb    w8, [x29, #-0x66]
    ldr      x8, [x19]
    mov      w9, #0xaa81
    movk     w9, #0x898c, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    mov      w9, #0x82ea
    movk     w9, #0x5ea5, lsl #16
    cmp      w8, w9
    b.eq     #0x34b6dc
    mov      w9, #0x6cf2
    movk     w9, #0x684f, lsl #16
    cmp      w8, w9
    b.ne     #0x34ac30
    ldr      x8, [x19]
    mov      w9, #0x6876
    movk     w9, #0x789b, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    mov      w9, #0x88cd
    movk     w9, #0xad3, lsl #16
    cmp      w8, w9
    b.eq     #0x34b714
    mov      w9, #0x631
    movk     w9, #0x1c9d, lsl #16
    cmp      w8, w9
    b.ne     #0x34ac30
    ldur     x8, [x29, #-0x70]
    movi     v0.16b, #0
    stp      q0, q0, [x8]
    stp      q0, q0, [x8, #0x20]
    ldur     x0, [x29, #-0x90]
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x478]
    stur     x8, [x29, #-0xa8]
    ldr      x8, [x19]
    mov      w9, #0x82ea
    movk     w9, #0x5ea5, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    mov      w9, #0xd09e
    movk     w9, #0x7415, lsl #16
    cmp      w8, w9
    b.eq     #0x34b730
    mov      w9, #0x6876
    movk     w9, #0x789b, lsl #16
    cmp      w8, w9
    b.ne     #0x34ac30
    add      x0, x23, #8
    str      x0, [x19, #0x48]
    bl       #0x461d68 // _os_unfair_lock_lock
    mov      x8, x23
    ldr      x9, [x8, #0x10]!
    stp      x9, x8, [x19, #0x38]
    ldr      x8, [x19]
    mov      w9, #0xb598
    movk     w9, #0xc266, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    ldurb    w8, [x29, #-0x65]
    cmp      w8, #0
    mov      w8, #0xe53e
    movk     w8, #0xcc89, lsl #16
    csel     w8, w8, w27, ne
    b        #0x34b8b0
    ldr      x8, [x19, #0x68]
    ldr      x9, [x19, #0x18]
    cmp      x8, x9
    cset     w8, eq
    strb     w8, [x19, #0x67]
    ldr      x8, [x19]
    mov      w9, #0x3ec9
    movk     w9, #0x241, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    ldurb    w8, [x29, #-0x66]
    mov      w9, #0xb9
    eor      w8, w8, w9
    adrp     x9, #0x54b000
    add      x9, x9, #0xeff
    strb     w8, [x9]
    adrp     x10, #0x54b000
    add      x10, x10, #0xee0
    ldrb     w8, [x10]
    eor      w8, w8, #0x18
    strb     w8, [x9, #1]
    ldrb     w8, [x10, #1]
    eor      w8, w8, #0x3e
    strb     w8, [x9, #2]
    ldrb     w8, [x10, #2]
    mov      w11, #0x6c
    eor      w8, w8, w11
    strb     w8, [x9, #3]
    ldrb     w8, [x10, #3]
    mov      w11, #0x26
    eor      w8, w8, w11
    strb     w8, [x9, #4]
    ldrb     w8, [x10, #4]
    mov      w11, #0xa2
    eor      w8, w8, w11
    strb     w8, [x9, #5]
    ldrb     w8, [x10, #5]
    eor      w8, w8, #0x88888888
    strb     w8, [x9, #6]
    ldrb     w8, [x10, #6]
    eor      w8, w8, #0xffffffe7
    strb     w8, [x9, #7]
    ldrb     w8, [x10, #7]
    mov      w10, #0x68
    eor      w8, w8, w10
    strb     w8, [x9, #8]
    ldr      x8, [x19]
    mov      w9, #0x44db
    movk     w9, #0x9bf6, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    adrp     x8, #0x581000
    add      x8, x8, #0x270
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x40
    mov      sp, x8
    stur     x8, [x29, #-0x70]
    sub      x8, sp, #0x80
    mov      sp, x8
    stur     x8, [x29, #-0x78]
    ldr      x8, [x19]
    mov      w9, #0x8803
    movk     w9, #0x3820, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    ldr      x0, [x19, #0x78]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x10]
    add      x8, x8, #1
    str      x8, [x19, #0x68]
    ldr      x8, [x19]
    mov      w9, #0xc158
    movk     w9, #0xc251, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    ldrb     w8, [x19, #0x67]
    cmp      w8, #0
    mov      w8, #0xa3a2
    movk     w8, #0x723b, lsl #16
    mov      w9, #0xc36b
    movk     w9, #0xca41, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [x19]
    str      w8, [x9]
    ldr      x8, [x19, #0x68]
    str      x8, [x19, #0x20]
    b        #0x34ac30
    adrp     x9, #0x54b000
    add      x9, x9, #0xeb0
    ldrb     w8, [x9]
    mov      w10, #0xd4
    eor      w8, w8, w10
    adrp     x10, #0x54b000
    add      x10, x10, #0xebd
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w11, #0xd5
    eor      w8, w8, w11
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    eor      w8, w8, #0x7e
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    mov      w11, #0x23
    eor      w8, w8, w11
    strb     w8, [x10, #3]
    ldrb     w8, [x9, #4]
    mov      w11, #0x9d
    eor      w8, w8, w11
    strb     w8, [x10, #4]
    ldrb     w8, [x9, #5]
    mov      w11, #0xeb
    eor      w8, w8, w11
    strb     w8, [x10, #5]
    ldrb     w8, [x9, #6]
    mov      w11, #0x52
    eor      w8, w8, w11
    strb     w8, [x10, #6]
    ldrb     w8, [x9, #7]
    mov      w11, #0x36
    eor      w8, w8, w11
    strb     w8, [x10, #7]
    ldrb     w8, [x9, #8]
    mov      w11, #0xe4
    eor      w8, w8, w11
    strb     w8, [x10, #8]
    ldrb     w8, [x9, #9]
    mov      w11, #0xfa
    eor      w8, w8, w11
    strb     w8, [x10, #9]
    ldrb     w8, [x9, #0xa]
    mov      w11, #0xc8
    eor      w8, w8, w11
    strb     w8, [x10, #0xa]
    ldrb     w8, [x9, #0xb]
    mov      w11, #0x29
    eor      w8, w8, w11
    strb     w8, [x10, #0xb]
    ldrb     w8, [x9, #0xc]
    mov      w9, #0x76
    eor      w8, w8, w9
    strb     w8, [x10, #0xc]
    ldr      x8, [x19]
    str      w27, [x8]
    b        #0x34ac30
    ldp      x3, x2, [x29, #-0x78]
    ldur     x0, [x29, #-0x90]
    ldur     x1, [x29, #-0xa8]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x58]
    ldr      x8, [x19]
    mov      w9, #0xf38
    movk     w9, #0xe259, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    ldur     w8, [x29, #-0x64]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x65]
    ldr      x8, [x19]
    mov      w9, #0x4431
    movk     w9, #0x87ff, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    ldp      x3, x2, [x29, #-0x78]
    ldur     x0, [x29, #-0x90]
    ldur     x1, [x29, #-0xa8]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xb0]
    cmp      x0, #0
    cset     w8, eq
    sturb    w8, [x29, #-0xb1]
    ldr      x8, [x19]
    mov      w9, #0x72a8
    movk     w9, #0x6cb7, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    ldur     x0, [x29, #-0x90]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19]
    mov      w9, #0x6cf2
    movk     w9, #0x684f, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    ldr      x8, [x19]
    mov      w9, #0xd839
    movk     w9, #0x1ed, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    ldur     x0, [x29, #-0x98]
    ldr      x1, [x19, #0x98]
    ldr      x2, [x19, #0x78]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19]
    mov      w9, #0x242d
    movk     w9, #0x932a, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    ldr      x8, [x19, #0xc0]
    ldr      x8, [x8]
    ldr      x8, [x8]
    str      x8, [x19, #0xb8]
    ldr      x8, [x19]
    mov      w9, #0xa81c
    movk     w9, #0xc97a, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    ldurb    w8, [x29, #-0xb1]
    cmp      w8, #0
    mov      w8, #0x88cd
    movk     w8, #0xad3, lsl #16
    mov      w9, #0x2857
    movk     w9, #0xaf51, lsl #16
    csel     w8, w8, w9, ne
    b        #0x34b8b0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    stp      x1, x0, [x29, #-0x88]
    adrp     x2, #0x54b000
    add      x2, x2, #0xff0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x90]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x98]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    ldur     x0, [x29, #-0x90]
    bl       #0x461c6c // _objc_msgSend
    sturb    w0, [x29, #-0x99]
    ldr      x8, [x19]
    mov      w9, #0xc098
    movk     w9, #0x1f4b, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    ldr      x1, [x19, #0xa0]
    ldr      x0, [x19, #0x78]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [x19, #0x77]
    ldr      x8, [x19]
    mov      w9, #0xc280
    movk     w9, #0xfee9, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    ldr      x8, [x19, #0x58]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [x19, #0x57]
    ldr      x8, [x19]
    mov      w9, #0x57d5
    movk     w9, #0x5575, lsl #16
    str      w9, [x8]
    b        #0x34ac30
    ldurb    w8, [x29, #-0x99]
    cmp      w8, #0
    mov      w8, #0x6876
    movk     w8, #0x789b, lsl #16
    mov      w9, #0x631
    movk     w9, #0x1c9d, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [x19]
    str      w8, [x9]
    b        #0x34ac30
    mov      w9, #0xc355
    movk     w9, #0x6d0a, lsl #16
    cmp      w8, w9
    b.ne     #0x34ac30
    ldr      x0, [x19, #0x30]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x90]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x34b91c
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGHomeGroups seedDefaultGroupsIfNeeded] IMP=0x34B920 bounds=0x34B920-0x34C254
loc_34B920:
    sub      sp, sp, #0x100
    stp      x28, x27, [sp, #0xa0]
    stp      x26, x25, [sp, #0xb0]
    stp      x24, x23, [sp, #0xc0]
    stp      x22, x21, [sp, #0xd0]
    stp      x20, x19, [sp, #0xe0]
    stp      x29, x30, [sp, #0xf0]
    add      x29, sp, #0xf0
    mov      x19, x0
    mov      w26, #0x3acd
    movk     w26, #0xd16e, lsl #16
    mov      w27, #0x3115
    movk     w27, #0x8bc0, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x274
    ldar     w8, [x8]
    stur     w8, [x29, #-0x5c]
    mov      w8, #0x3001
    movk     w8, #0xf6aa, lsl #16
    str      w8, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w22, #0x6a91
    movk     w22, #0xfc09, lsl #16
    mov      w23, #0xfc4d
    movk     w23, #0xe367, lsl #16
    adrp     x20, #0x54c000
    add      x20, x20, #0x81
    adrp     x28, #0x54c000
    add      x28, x28, #0x62
    mov      w24, #0xebbb
    movk     w24, #0x4237, lsl #16
    mov      w21, #0xbe76
    movk     w21, #0x1db5, lsl #16
    adrp     x25, #0x4c4000
    ldr      w8, [sp, #0xc]
    cmp      w8, w22
    b.le     #0x34ba34
    cmp      w8, w24
    b.gt     #0x34baa0
    cmp      w8, w21
    b.le     #0x34bc9c
    mov      w9, #0xbe77
    movk     w9, #0x1db5, lsl #16
    cmp      w8, w9
    b.eq     #0x34c1e4
    mov      w9, #0x4dee
    movk     w9, #0x201d, lsl #16
    cmp      w8, w9
    b.eq     #0x34c1b4
    mov      w9, #0x817b
    movk     w9, #0x2381, lsl #16
    cmp      w8, w9
    b.ne     #0x34b9ac
    add      x0, x19, #8
    str      x0, [sp, #0x68]
    bl       #0x461d68 // _os_unfair_lock_lock
    mov      x8, x19
    ldr      x0, [x8, #0x10]!
    str      x8, [sp, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x58]
    ldr      x8, [sp]
    mov      w9, #0x6a92
    movk     w9, #0xfc09, lsl #16
    str      w9, [x8]
    b        #0x34b9ac
    cmp      w8, w23
    b.le     #0x34bb44
    mov      w9, #0x65c7
    movk     w9, #0xeda3, lsl #16
    cmp      w8, w9
    b.le     #0x34bc64
    mov      w9, #0x65c8
    movk     w9, #0xeda3, lsl #16
    cmp      w8, w9
    b.eq     #0x34bf38
    mov      w9, #0x50a5
    movk     w9, #0xf304, lsl #16
    cmp      w8, w9
    b.eq     #0x34bdf4
    mov      w9, #0x3001
    movk     w9, #0xf6aa, lsl #16
    cmp      w8, w9
    b.ne     #0x34b9ac
    ldur     w8, [x29, #-0x5c]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x5d]
    ldr      x8, [sp]
    mov      w9, #0x7185
    movk     w9, #0xe7b1, lsl #16
    str      w9, [x8]
    b        #0x34b9ac
    mov      w9, #0x787e
    movk     w9, #0x7656, lsl #16
    cmp      w8, w9
    b.gt     #0x34bc18
    mov      w9, #0x720b
    movk     w9, #0x4cc4, lsl #16
    cmp      w8, w9
    b.eq     #0x34c140
    mov      w9, #0x7d9e
    movk     w9, #0x5236, lsl #16
    cmp      w8, w9
    b.ne     #0x34c224
    ldr      x0, [x25, #0x5f8]
    bl       #0x461bac // _objc_alloc_init
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb80]
    stp      x1, x0, [sp, #0x40]
    adrp     x2, #0x54c000
    add      x2, x2, #0x1c0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xef0]
    str      x1, [sp, #0x38]
    ldr      x0, [sp, #0x48]
    mov      w2, #4
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x25, #0x5f8]
    bl       #0x461bac // _objc_alloc_init
    str      x0, [sp, #0x30]
    ldr      x1, [sp, #0x40]
    adrp     x2, #0x54c000
    add      x2, x2, #0x180
    bl       #0x461c6c // _objc_msgSend
    ldp      x0, x1, [sp, #0x30]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp]
    mov      w9, #0x720b
    movk     w9, #0x4cc4, lsl #16
    str      w9, [x8]
    b        #0x34b9ac
    mov      w9, #0xa106
    movk     w9, #0xbe49, lsl #16
    cmp      w8, w9
    b.gt     #0x34bbd8
    cmp      w8, w27
    b.eq     #0x34bda8
    mov      w9, #0x4f36
    movk     w9, #0x91e8, lsl #16
    cmp      w8, w9
    b.ne     #0x34b9ac
    adrp     x9, #0x54c000
    add      x9, x9, #0x20
    ldrh     w8, [x9]
    mov      w10, #0x3d73
    eor      w8, w8, w10
    adrp     x10, #0x54c000
    add      x10, x10, #0x28
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w9, #0x1a24
    eor      w8, w8, w9
    strh     w8, [x10, #2]
    adrp     x9, #0x54c000
    add      x9, x9, #0x60
    ldrb     w8, [x9]
    eor      w8, w8, #0xc
    adrp     x10, #0x54c000
    strb     w8, [x10, #0x80]
    ldrb     w8, [x9, #1]
    mov      w9, #0x71
    eor      w8, w8, w9
    sturb    w8, [x29, #-0x5e]
    ldr      x8, [sp]
    mov      w9, #0x65c8
    movk     w9, #0xeda3, lsl #16
    str      w9, [x8]
    b        #0x34b9ac
    mov      w9, #0xa107
    movk     w9, #0xbe49, lsl #16
    cmp      w8, w9
    b.eq     #0x34bde0
    cmp      w8, w26
    b.ne     #0x34b9ac
    ldr      x0, [sp, #0x68]
    bl       #0x461d74 // _os_unfair_lock_unlock
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x350]
    str      x8, [sp, #0x10]
    ldr      x8, [sp]
    mov      w9, #0xd948
    movk     w9, #0x7686, lsl #16
    str      w9, [x8]
    b        #0x34b9ac
    mov      w9, #0x787f
    movk     w9, #0x7656, lsl #16
    cmp      w8, w9
    b.eq     #0x34bf08
    mov      w9, #0xd948
    movk     w9, #0x7686, lsl #16
    cmp      w8, w9
    b.ne     #0x34b9ac
    ldr      x0, [sp, #0x78]
    ldr      x1, [sp, #0x10]
    mov      w2, #1
    adrp     x3, #0x54c000
    add      x3, x3, #0x100
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp]
    mov      w9, #0xa107
    movk     w9, #0xbe49, lsl #16
    str      w9, [x8]
    b        #0x34b9ac
    mov      w9, #0xfc4e
    movk     w9, #0xe367, lsl #16
    cmp      w8, w9
    b.eq     #0x34c120
    mov      w9, #0x7185
    movk     w9, #0xe7b1, lsl #16
    cmp      w8, w9
    b.ne     #0x34b9ac
    ldurb    w8, [x29, #-0x5d]
    cmp      w8, #0
    mov      w8, #0x50a5
    movk     w8, #0xf304, lsl #16
    csel     w8, w8, w27, ne
    b        #0x34c134
    mov      w9, #0x6a92
    movk     w9, #0xfc09, lsl #16
    cmp      w8, w9
    b.eq     #0x34c200
    mov      w9, #0x84c5
    movk     w9, #0xfcfe, lsl #16
    cmp      w8, w9
    b.ne     #0x34b9ac
    ldr      x0, [sp, #0x18]
    bl       #0x461bac // _objc_alloc_init
    mov      x26, x0
    ldr      x1, [sp, #0x40]
    adrp     x2, #0x54c000
    add      x2, x2, #0xc0
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [sp, #0x38]
    mov      x0, x26
    mov      w2, #5
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x60]
    ldr      x0, [x8]
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x830]
    ldr      x2, [sp, #0x48]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x60]
    ldr      x0, [x8]
    ldr      x2, [sp, #0x30]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x60]
    ldr      x0, [x8]
    ldr      x2, [sp, #0x28]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x60]
    ldr      x0, [x8]
    ldr      x2, [sp, #0x20]
    mov      x1, x27
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x60]
    ldr      x0, [x8]
    mov      x1, x27
    mov      w27, #0x3115
    movk     w27, #0x8bc0, lsl #16
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      w26, #0x3acd
    movk     w26, #0xd16e, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x48]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    str      w26, [x8]
    b        #0x34b9ac
    adrp     x8, #0x581000
    add      x8, x8, #0x274
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x10, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x308]
    stp      x8, x10, [x29, #-0x70]
    ldr      x8, [sp]
    mov      w9, #0x4dee
    movk     w9, #0x201d, lsl #16
    str      w9, [x8]
    b        #0x34b9ac
    ldr      x8, [sp]
    mov      w9, #0xbe77
    movk     w9, #0x1db5, lsl #16
    str      w9, [x8]
    b        #0x34b9ac
    adrp     x9, #0x54c000
    add      x9, x9, #0x48
    ldrh     w8, [x9]
    mov      w10, #0x57cc
    eor      w8, w8, w10
    adrp     x10, #0x54c000
    add      x10, x10, #0x4e
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0xd1e4
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w9, #0x3d2c
    eor      w8, w8, w9
    strh     w8, [x10, #4]
    adrp     x9, #0x54c000
    add      x9, x9, #0x3c
    ldrh     w8, [x9]
    mov      w10, #0x8c18
    eor      w8, w8, w10
    adrp     x10, #0x54c000
    add      x10, x10, #0x42
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0xd654
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w9, #0x5af4
    eor      w8, w8, w9
    strh     w8, [x10, #4]
    adrp     x9, #0x54c000
    add      x9, x9, #0x2c
    ldrh     w8, [x9]
    mov      w10, #0xb82b
    eor      w8, w8, w10
    adrp     x10, #0x54c000
    add      x10, x10, #0x34
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0x3568
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0x566f
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w9, #0x901a
    eor      w8, w8, w9
    strh     w8, [x10, #6]
    adrp     x9, #0x54c000
    add      x9, x9, #0x1c
    ldrh     w8, [x9]
    mov      w10, #0x3d60
    eor      w8, w8, w10
    adrp     x10, #0x54c000
    add      x10, x10, #0x24
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w9, #0xd547
    eor      w8, w8, w9
    strh     w8, [x10, #2]
    ldr      x8, [sp]
    mov      w9, #0x4f36
    movk     w9, #0x91e8, lsl #16
    str      w9, [x8]
    b        #0x34b9ac
    ldp      x1, x0, [sp, #0x70]
    adrp     x2, #0x54c000
    add      x2, x2, #0x100
    mov      w3, #0
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #0xbe77
    movk     w8, #0x1db5, lsl #16
    mov      w9, #0x817b
    movk     w9, #0x2381, lsl #16
    csel     w8, w8, w9, ne
    b        #0x34c134
    ldurb    w8, [x29, #-0x5e]
    strb     w8, [x20]
    ldrb     w8, [x28]
    mov      w9, #0x37
    eor      w8, w8, w9
    strb     w8, [x20, #1]
    ldrb     w8, [x28, #1]
    eor      w8, w8, #0x99999999
    strb     w8, [x20, #2]
    ldrb     w8, [x28, #2]
    mov      w9, #0xe5
    eor      w8, w8, w9
    strb     w8, [x20, #3]
    ldrb     w8, [x28, #3]
    mov      w9, #0x42
    eor      w8, w8, w9
    strb     w8, [x20, #4]
    ldrb     w8, [x28, #4]
    eor      w8, w8, #0xffffffe3
    strb     w8, [x20, #5]
    ldrb     w8, [x28, #5]
    mov      w9, #0x54
    eor      w8, w8, w9
    strb     w8, [x20, #6]
    ldrb     w8, [x28, #6]
    mov      w9, #0x5a
    eor      w8, w8, w9
    strb     w8, [x20, #7]
    ldrb     w8, [x28, #7]
    mov      w9, #0xb4
    eor      w8, w8, w9
    strb     w8, [x20, #8]
    ldrb     w8, [x28, #8]
    eor      w8, w8, #0x1e
    strb     w8, [x20, #9]
    ldrb     w8, [x28, #9]
    mov      w9, #0x1a
    eor      w8, w8, w9
    strb     w8, [x20, #0xa]
    ldrb     w8, [x28, #0xa]
    eor      w8, w8, #0x55555555
    strb     w8, [x20, #0xb]
    ldrb     w8, [x28, #0xb]
    mov      w9, #0x3b
    eor      w8, w8, w9
    strb     w8, [x20, #0xc]
    ldrb     w8, [x28, #0xc]
    mov      w10, #0xa6
    eor      w8, w8, w10
    strb     w8, [x20, #0xd]
    ldrb     w8, [x28, #0xd]
    mov      w10, #0x45
    eor      w8, w8, w10
    strb     w8, [x20, #0xe]
    ldrb     w8, [x28, #0xe]
    mov      w10, #0xe8
    eor      w8, w8, w10
    strb     w8, [x20, #0xf]
    ldrb     w8, [x28, #0xf]
    mov      w10, #0x23
    eor      w8, w8, w10
    strb     w8, [x20, #0x10]
    ldrb     w8, [x28, #0x10]
    eor      w8, w8, #4
    strb     w8, [x20, #0x11]
    ldrb     w8, [x28, #0x11]
    mov      w10, #0x27
    eor      w8, w8, w10
    strb     w8, [x20, #0x12]
    ldrb     w8, [x28, #0x12]
    mov      w10, #0x9c
    eor      w8, w8, w10
    strb     w8, [x20, #0x13]
    ldrb     w8, [x28, #0x13]
    mov      w10, #0x9a
    eor      w8, w8, w10
    strb     w8, [x20, #0x14]
    ldrb     w8, [x28, #0x14]
    mov      w10, #0xf2
    eor      w8, w8, w10
    strb     w8, [x20, #0x15]
    ldrb     w8, [x28, #0x15]
    eor      w8, w8, w9
    strb     w8, [x20, #0x16]
    ldrb     w8, [x28, #0x16]
    mov      w9, #0x35
    eor      w8, w8, w9
    strb     w8, [x20, #0x17]
    ldrb     w8, [x28, #0x17]
    mov      w9, #0xd2
    eor      w8, w8, w9
    strb     w8, [x20, #0x18]
    ldrb     w8, [x28, #0x18]
    mov      w9, #0xb9
    eor      w8, w8, w9
    strb     w8, [x20, #0x19]
    ldrb     w8, [x28, #0x19]
    mov      w9, #0xab
    eor      w8, w8, w9
    strb     w8, [x20, #0x1a]
    ldrb     w8, [x28, #0x1a]
    eor      w8, w8, #6
    strb     w8, [x20, #0x1b]
    adrp     x9, #0x54c000
    add      x9, x9, #0x10
    ldrh     w8, [x9]
    mov      w10, #0x6ad7
    eor      w8, w8, w10
    adrp     x10, #0x54c000
    add      x10, x10, #0x16
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0xe5c4
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w9, #0x9aad
    eor      w8, w8, w9
    strh     w8, [x10, #4]
    ldr      x8, [sp]
    str      w27, [x8]
    b        #0x34b9ac
    ldrb     w8, [sp, #0x57]
    cmp      w8, #0
    mov      w8, #0x7d9e
    movk     w8, #0x5236, lsl #16
    csel     w8, w8, w26, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x34b9ac
    ldr      x0, [x25, #0x5f8]
    bl       #0x461bac // _objc_alloc_init
    str      x0, [sp, #0x28]
    ldr      x1, [sp, #0x40]
    adrp     x2, #0x54c000
    add      x2, x2, #0x200
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [sp, #0x38]
    ldr      x0, [sp, #0x28]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x25, #0x5f8]
    bl       #0x461bac // _objc_alloc_init
    str      x0, [sp, #0x20]
    ldr      x1, [sp, #0x40]
    adrp     x2, #0x54c000
    add      x2, x2, #0x140
    bl       #0x461c6c // _objc_msgSend
    ldr      x1, [sp, #0x38]
    ldr      x0, [sp, #0x20]
    mov      w2, #3
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x25, #0x5f8]
    str      x8, [sp, #0x18]
    ldr      x8, [sp]
    mov      w9, #0x84c5
    movk     w9, #0xfcfe, lsl #16
    str      w9, [x8]
    b        #0x34b9ac
    ldp      x1, x0, [x29, #-0x70]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x480]
    stp      x8, x0, [sp, #0x70]
    ldr      x8, [sp]
    mov      w9, #0x787f
    movk     w9, #0x7656, lsl #16
    str      w9, [x8]
    b        #0x34b9ac
    ldr      x0, [sp, #0x78]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    mov      w9, #0xebbc
    movk     w9, #0x4237, lsl #16
    str      w9, [x8]
    b        #0x34b9ac
    ldr      x8, [sp, #0x58]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [sp, #0x57]
    ldr      x8, [sp]
    mov      w9, #0xfc4e
    movk     w9, #0xe367, lsl #16
    str      w9, [x8]
    b        #0x34b9ac
    mov      w9, #0xebbc
    movk     w9, #0x4237, lsl #16
    cmp      w8, w9
    b.ne     #0x34b9ac
    ldp      x29, x30, [sp, #0xf0]
    ldp      x20, x19, [sp, #0xe0]
    ldp      x22, x21, [sp, #0xd0]
    ldp      x24, x23, [sp, #0xc0]
    ldp      x26, x25, [sp, #0xb0]
    ldp      x28, x27, [sp, #0xa0]
    add      sp, sp, #0x100
    ret      

// -[WCLGHomeGroups persistGroupsLocked] IMP=0x34C254 bounds=0x34C254-0x34CA90
loc_34C254:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0xd0
    mov      w20, #0x8f00
    movk     w20, #0xac38, lsl #16
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    mov      w21, #0x5877
    movk     w21, #0x43a4, lsl #16
    stur     x8, [x29, #-0x60]
    adrp     x8, #0x581000
    add      x8, x8, #0x278
    ldar     w8, [x8]
    stur     w8, [x29, #-0x64]
    mov      w9, #0x17c6
    movk     w9, #0x80b8, lsl #16
    sub      x8, x29, #0x10c
    sub      x10, x29, #0xc
    stur     w9, [x10, #-0x100]
    mov      w27, #0x2f01
    movk     w27, #0x28e5, lsl #16
    mov      w19, #0xa304
    movk     w19, #0x4c1, lsl #16
    sub      x9, x29, #0x18
    stur     x8, [x9, #-0x100]
    add      x8, x0, #0x10
    sub      x9, x29, #0x20
    stur     x8, [x9, #-0x100]
    mov      w25, #0xa135
    movk     w25, #0x4fa8, lsl #16
    adrp     x22, #0x54c000
    add      x22, x22, #0x220
    adrp     x26, #0x54c000
    add      x26, x26, #0x240
    mov      w23, #0x58cd
    movk     w23, #0x57c4, lsl #16
    adrp     x24, #0x54c000
    add      x24, x24, #0x247
    adrp     x28, #0x54c000
    add      x28, x28, #0x228
    sub      x8, x29, #0xc
    ldur     w8, [x8, #-0x100]
    cmp      w8, w27
    b.gt     #0x34c3c8
    cmp      w8, w19
    b.gt     #0x34c434
    mov      w9, #0x8eff
    movk     w9, #0xac38, lsl #16
    cmp      w8, w9
    b.gt     #0x34c4f4
    mov      w9, #0x17c6
    movk     w9, #0x80b8, lsl #16
    cmp      w8, w9
    b.eq     #0x34c7c8
    mov      w9, #0x4010
    movk     w9, #0x85f0, lsl #16
    cmp      w8, w9
    b.eq     #0x34c950
    mov      w9, #0x1944
    movk     w9, #0x9be8, lsl #16
    cmp      w8, w9
    b.ne     #0x34c30c
    adrp     x9, #0x54c000
    add      x9, x9, #0x22f
    ldrb     w8, [x9]
    mov      w10, #0xb8
    eor      w8, w8, w10
    adrp     x10, #0x54c000
    add      x10, x10, #0x24f
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    eor      w8, w8, #0x99999999
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w11, #0x15
    eor      w8, w8, w11
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    mov      w9, #5
    eor      w8, w8, w9
    strb     w8, [x10, #3]
    sub      x8, x29, #0x18
    ldur     x8, [x8, #-0x100]
    mov      w9, #0xa305
    movk     w9, #0x4c1, lsl #16
    str      w9, [x8]
    b        #0x34c30c
    cmp      w8, w25
    b.le     #0x34c484
    cmp      w8, w23
    b.gt     #0x34c5bc
    mov      w9, #0xa136
    movk     w9, #0x4fa8, lsl #16
    cmp      w8, w9
    b.eq     #0x34c908
    mov      w9, #0x3d63
    movk     w9, #0x51eb, lsl #16
    cmp      w8, w9
    b.eq     #0x34c9fc
    mov      w9, #0x47b9
    movk     w9, #0x5669, lsl #16
    cmp      w8, w9
    b.ne     #0x34c30c
    ldp      x3, x2, [x29, #-0x78]
    ldp      x1, x0, [x29, #-0x98]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xe0]
    sub      x8, x29, #0x18
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x42cb
    movk     w9, #0x679d, lsl #16
    str      w9, [x8]
    b        #0x34c30c
    mov      w9, #0xe9de
    movk     w9, #0x702, lsl #16
    cmp      w8, w9
    b.gt     #0x34c53c
    mov      w9, #0xa305
    movk     w9, #0x4c1, lsl #16
    cmp      w8, w9
    b.eq     #0x34c7f0
    mov      w9, #0xda78
    movk     w9, #0x5c7, lsl #16
    cmp      w8, w9
    b.eq     #0x34c97c
    mov      w9, #0xaaa1
    movk     w9, #0x66d, lsl #16
    cmp      w8, w9
    b.ne     #0x34c30c
    sub      x8, x29, #0x18
    ldur     x8, [x8, #-0x100]
    str      w21, [x8]
    b        #0x34c30c
    mov      w9, #0x5876
    movk     w9, #0x43a4, lsl #16
    cmp      w8, w9
    b.gt     #0x34c670
    mov      w9, #0x2f02
    movk     w9, #0x28e5, lsl #16
    cmp      w8, w9
    b.eq     #0x34c6a8
    mov      w9, #0x9b5e
    movk     w9, #0x3026, lsl #16
    cmp      w8, w9
    b.eq     #0x34c738
    mov      w9, #0xc4a2
    movk     w9, #0x3744, lsl #16
    cmp      w8, w9
    b.ne     #0x34c30c
    ldur     x8, [x29, #-0xf8]
    sub      x9, x29, #8
    stur     x8, [x9, #-0x100]
    ldur     x8, [x29, #-0xa8]
    ldr      x8, [x8]
    ldr      x8, [x8]
    ldur     x9, [x29, #-0xb8]
    cmp      x8, x9
    mov      w8, #0xd4e5
    movk     w8, #0xc2fb, lsl #16
    csel     w8, w21, w8, eq
    b        #0x34c8ac
    cmp      w8, w20
    b.eq     #0x34c830
    mov      w9, #0xd4e5
    movk     w9, #0xc2fb, lsl #16
    cmp      w8, w9
    b.eq     #0x34c9b8
    mov      w9, #0x1de3
    movk     w9, #0xf47f, lsl #16
    cmp      w8, w9
    b.ne     #0x34c30c
    ldurb    w8, [x29, #-0x65]
    cmp      w8, #0
    mov      w8, #0xa305
    movk     w8, #0x4c1, lsl #16
    mov      w9, #0x2f02
    movk     w9, #0x28e5, lsl #16
    csel     w8, w9, w8, ne
    b        #0x34c8ac
    mov      w9, #0xe9df
    movk     w9, #0x702, lsl #16
    cmp      w8, w9
    b.eq     #0x34c864
    mov      w9, #0x3852
    movk     w9, #0xb67, lsl #16
    cmp      w8, w9
    b.eq     #0x34c9d8
    mov      w9, #0x8e50
    movk     w9, #0x1e9d, lsl #16
    cmp      w8, w9
    b.ne     #0x34c30c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    ldur     x8, [x29, #-0x70]
    movi     v0.16b, #0
    stp      q0, q0, [x8]
    stp      q0, q0, [x8, #0x20]
    sub      x8, x29, #0x20
    ldur     x8, [x8, #-0x100]
    stp      x8, x0, [x29, #-0x88]
    sub      x8, x29, #0x18
    ldur     x8, [x8, #-0x100]
    mov      w9, #0xe9df
    movk     w9, #0x702, lsl #16
    str      w9, [x8]
    b        #0x34c30c
    mov      w9, #0x58ce
    movk     w9, #0x57c4, lsl #16
    cmp      w8, w9
    b.eq     #0x34c92c
    mov      w9, #0x42cb
    movk     w9, #0x679d, lsl #16
    cmp      w8, w9
    b.eq     #0x34ca1c
    mov      w9, #0x39e4
    movk     w9, #0x716f, lsl #16
    cmp      w8, w9
    b.ne     #0x34c30c
    ldurb    w8, [x29, #-0x66]
    strb     w8, [x24]
    ldrb     w8, [x28]
    eor      w8, w8, #0x20
    strb     w8, [x24, #1]
    ldrb     w8, [x28, #1]
    mov      w9, #0x51
    eor      w8, w8, w9
    strb     w8, [x24, #2]
    ldrb     w8, [x28, #2]
    mov      w9, #0xd9
    eor      w8, w8, w9
    strb     w8, [x24, #3]
    ldrb     w8, [x28, #3]
    eor      w8, w8, #0x7f
    strb     w8, [x24, #4]
    ldrb     w8, [x28, #4]
    mov      w9, #9
    eor      w8, w8, w9
    strb     w8, [x24, #5]
    ldrb     w8, [x28, #5]
    mov      w9, #0x2e
    eor      w8, w8, w9
    strb     w8, [x24, #6]
    ldrb     w8, [x28, #6]
    eor      w8, w8, #1
    strb     w8, [x24, #7]
    sub      x8, x29, #0x18
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x1944
    movk     w9, #0x9be8, lsl #16
    str      w9, [x8]
    b        #0x34c30c
    cmp      w8, w21
    b.eq     #0x34c8bc
    mov      w9, #0xee8f
    movk     w9, #0x4dd6, lsl #16
    cmp      w8, w9
    b.ne     #0x34ca44
    ldur     x0, [x29, #-0xd8]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x18
    ldur     x8, [x8, #-0x100]
    mov      w9, #0xda78
    movk     w9, #0x5c7, lsl #16
    str      w9, [x8]
    b        #0x34c30c
    ldrb     w8, [x22]
    mov      w9, #0x54
    eor      w8, w8, w9
    strb     w8, [x26]
    ldrb     w8, [x22, #1]
    mov      w9, #0x27
    eor      w8, w8, w9
    strb     w8, [x26, #1]
    ldrb     w8, [x22, #2]
    mov      w9, #0x58
    eor      w8, w8, w9
    strb     w8, [x26, #2]
    ldrb     w8, [x22, #3]
    mov      w9, #0x16
    eor      w8, w8, w9
    strb     w8, [x26, #3]
    ldrb     w8, [x22, #4]
    eor      w8, w8, #0x78
    strb     w8, [x26, #4]
    ldrb     w8, [x22, #5]
    mov      w9, #0xa6
    eor      w8, w8, w9
    strb     w8, [x26, #5]
    ldrb     w8, [x22, #6]
    mov      w9, #0x79
    eor      w8, w8, w9
    strb     w8, [x26, #6]
    ldrb     w8, [x22, #7]
    eor      w8, w8, #0x33333333
    sturb    w8, [x29, #-0x66]
    sub      x8, x29, #0x18
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x39e4
    movk     w9, #0x716f, lsl #16
    str      w9, [x8]
    b        #0x34c30c
    ldur     x0, [x29, #-0x90]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    ldur     x0, [x29, #-0x80]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    mov      x0, x20
    mov      x2, x21
    adrp     x3, #0x54c000
    add      x3, x3, #0x280
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      w21, #0x5877
    movk     w21, #0x43a4, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      w20, #0x8f00
    movk     w20, #0xac38, lsl #16
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x18
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x3d63
    movk     w9, #0x51eb, lsl #16
    str      w9, [x8]
    b        #0x34c30c
    ldur     w8, [x29, #-0x64]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x65]
    sub      x8, x29, #0x18
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x1de3
    movk     w9, #0xf47f, lsl #16
    str      w9, [x8]
    b        #0x34c30c
    adrp     x8, #0x581000
    add      x8, x8, #0x278
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x40
    mov      sp, x8
    stur     x8, [x29, #-0x70]
    sub      x8, sp, #0x80
    mov      sp, x8
    stur     x8, [x29, #-0x78]
    sub      x8, x29, #0x18
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x8e50
    movk     w9, #0x1e9d, lsl #16
    str      w9, [x8]
    b        #0x34c30c
    ldur     x8, [x29, #-0xf0]
    stp      x8, xzr, [x29, #-0x100]
    adrp     x8, #0x4bf000
    ldr      x9, [x8, #0x780]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x830]
    stp      x8, x9, [x29, #-0xd0]
    sub      x8, x29, #0x18
    ldur     x8, [x8, #-0x100]
    mov      w9, #0xc4a2
    movk     w9, #0x3744, lsl #16
    str      w9, [x8]
    b        #0x34c30c
    ldur     x8, [x29, #-0x88]
    ldr      x0, [x8]
    stur     x0, [x29, #-0x90]
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stur     x1, [x29, #-0x98]
    ldp      x3, x2, [x29, #-0x78]
    ldur     x0, [x29, #-0x90]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xa0]
    cmp      x0, #0
    mov      w8, #0x9b5e
    movk     w8, #0x3026, lsl #16
    mov      w9, #0x58ce
    movk     w9, #0x57c4, lsl #16
    csel     w8, w8, w9, eq
    sub      x9, x29, #0x18
    ldur     x9, [x9, #-0x100]
    str      w8, [x9]
    b        #0x34c30c
    ldp      x1, x8, [x29, #-0xc8]
    ldr      x8, [x8]
    sub      x9, x29, #8
    ldur     x9, [x9, #-0x100]
    ldr      x0, [x8, x9, lsl #3]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    stur     x0, [x29, #-0xd8]
    ldur     x0, [x29, #-0x80]
    ldur     x1, [x29, #-0xd0]
    bl       #0x461c6c // _objc_msgSend
    sub      x8, x29, #0x18
    ldur     x8, [x8, #-0x100]
    mov      w9, #0xee8f
    movk     w9, #0x4dd6, lsl #16
    str      w9, [x8]
    b        #0x34c30c
    ldur     x8, [x29, #-0x70]
    add      x8, x8, #8
    stur     x8, [x29, #-0xc0]
    sub      x8, x29, #0x18
    ldur     x8, [x8, #-0x100]
    str      w20, [x8]
    ldur     x8, [x29, #-0xa0]
    stur     x8, [x29, #-0xf0]
    b        #0x34c30c
    ldur     x8, [x29, #-0x70]
    ldr      x9, [x8, #0x10]!
    stp      x9, x8, [x29, #-0xb0]
    sub      x8, x29, #0x18
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x3852
    movk     w9, #0xb67, lsl #16
    str      w9, [x8]
    b        #0x34c30c
    ldurb    w8, [x29, #-0xe1]
    cmp      w8, #0
    mov      w8, #0x9b5e
    movk     w8, #0x3026, lsl #16
    csel     w8, w8, w20, ne
    sub      x9, x29, #0x18
    ldur     x9, [x9, #-0x100]
    str      w8, [x9]
    ldur     x8, [x29, #-0xe0]
    stur     x8, [x29, #-0xf0]
    b        #0x34c30c
    sub      x8, x29, #8
    ldur     x8, [x8, #-0x100]
    add      x8, x8, #1
    ldur     x9, [x29, #-0x100]
    cmp      x8, x9
    mov      w9, #0xc4a2
    movk     w9, #0x3744, lsl #16
    mov      w10, #0x47b9
    movk     w10, #0x5669, lsl #16
    csel     w9, w10, w9, eq
    sub      x10, x29, #0x18
    ldur     x10, [x10, #-0x100]
    str      w9, [x10]
    stur     x8, [x29, #-0xf8]
    b        #0x34c30c
    ldur     x0, [x29, #-0x90]
    bl       #0x461c24 // _objc_enumerationMutation
    sub      x8, x29, #0x18
    ldur     x8, [x8, #-0x100]
    mov      w9, #0xaaa1
    movk     w9, #0x66d, lsl #16
    str      w9, [x8]
    b        #0x34c30c
    ldur     x8, [x29, #-0xb0]
    ldr      x8, [x8]
    stur     x8, [x29, #-0xb8]
    sub      x8, x29, #0x18
    ldur     x8, [x8, #-0x100]
    mov      w9, #0xa136
    movk     w9, #0x4fa8, lsl #16
    str      w9, [x8]
    b        #0x34c30c
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x18
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x2a3b
    movk     w9, #0x4e36, lsl #16
    str      w9, [x8]
    b        #0x34c30c
    ldur     x8, [x29, #-0xe0]
    cmp      x8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0xe1]
    sub      x8, x29, #0x18
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x4010
    movk     w9, #0x85f0, lsl #16
    str      w9, [x8]
    b        #0x34c30c
    mov      w9, #0x2a3b
    movk     w9, #0x4e36, lsl #16
    cmp      w8, w9
    b.ne     #0x34c30c
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x34ca8c
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGHomeGroups enabled] IMP=0x34CA90 bounds=0x34CA90-0x34CE30
loc_34CA90:
    sub      sp, sp, #0x80
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    adrp     x8, #0x581000
    add      x8, x8, #0x27c
    ldar     w8, [x8]
    mov      w9, #0xc123
    movk     w9, #0x5773, lsl #16
    str      w8, [sp, #0x1c]
    add      x8, sp, #8
    mov      w23, #0x4a8f
    movk     w23, #0xcc8a, lsl #16
    str      w9, [sp, #8]
    mov      w24, #0xcf22
    movk     w24, #0xaba3, lsl #16
    str      x8, [sp]
    mov      w28, #0xcf23
    movk     w28, #0xaba3, lsl #16
    adrp     x20, #0x54c000
    add      x20, x20, #0x2cc
    adrp     x19, #0x54c000
    add      x19, x19, #0x2ad
    adrp     x27, #0x54c000
    add      x27, x27, #0x2d1
    adrp     x22, #0x54c000
    add      x22, x22, #0x2b2
    mov      w21, #0x8169
    movk     w21, #0x432d, lsl #16
    adrp     x25, #0x54c000
    add      x25, x25, #0x2a0
    adrp     x26, #0x54c000
    add      x26, x26, #0x2c0
    ldr      w8, [sp, #8]
    cmp      w8, w23
    b.gt     #0x34cb9c
    cmp      w8, w24
    b.gt     #0x34cbe8
    mov      w9, #0x46e6
    movk     w9, #0xa1dd, lsl #16
    cmp      w8, w9
    b.eq     #0x34cd60
    mov      w9, #0x2c8a
    movk     w9, #0xa567, lsl #16
    cmp      w8, w9
    b.ne     #0x34cb24
    adrp     x8, #0x581000
    add      x8, x8, #0x27c
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x10]
    ldr      x8, [sp]
    mov      w9, #0x6860
    movk     w9, #0xee2, lsl #16
    str      w9, [x8]
    b        #0x34cb24
    cmp      w8, w21
    b.le     #0x34cc5c
    mov      w9, #0x816a
    movk     w9, #0x432d, lsl #16
    cmp      w8, w9
    b.eq     #0x34cca0
    mov      w9, #0xc123
    movk     w9, #0x5773, lsl #16
    cmp      w8, w9
    b.ne     #0x34cb24
    ldr      w8, [sp, #0x1c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x1b]
    ldr      x8, [sp]
    mov      w9, #0x46e6
    movk     w9, #0xa1dd, lsl #16
    str      w9, [x8]
    b        #0x34cb24
    cmp      w8, w28
    b.eq     #0x34cd88
    mov      w9, #0xb831
    movk     w9, #0xbe28, lsl #16
    cmp      w8, w9
    b.ne     #0x34cb24
    ldrb     w8, [sp, #0x19]
    strb     w8, [x27]
    ldrb     w8, [x22]
    mov      w9, #0x4e
    eor      w8, w8, w9
    strb     w8, [x27, #1]
    ldrb     w8, [x22, #1]
    mov      w9, #0xa2
    eor      w8, w8, w9
    strb     w8, [x27, #2]
    ldrb     w8, [x22, #2]
    mov      w9, #0x26
    eor      w8, w8, w9
    strb     w8, [x27, #3]
    ldrb     w8, [x22, #3]
    mov      w9, #0x43
    eor      w8, w8, w9
    strb     w8, [x27, #4]
    ldr      x8, [sp]
    mov      w9, #0x2c8a
    movk     w9, #0xa567, lsl #16
    str      w9, [x8]
    b        #0x34cb24
    mov      w9, #0x6860
    movk     w9, #0xee2, lsl #16
    cmp      w8, w9
    b.ne     #0x34cdf4
    ldr      x0, [sp, #0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x480]
    adrp     x2, #0x54c000
    add      x2, x2, #0x300
    mov      w3, #0
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0xf]
    ldr      x8, [sp]
    mov      w9, #0x4a90
    movk     w9, #0xcc8a, lsl #16
    str      w9, [x8]
    b        #0x34cb24
    ldrb     w8, [x25]
    mov      w9, #0x25
    eor      w8, w8, w9
    strb     w8, [x26]
    ldrb     w8, [x25, #1]
    eor      w8, w8, #0xaaaaaaaa
    strb     w8, [x26, #1]
    ldrb     w8, [x25, #2]
    eor      w8, w8, #0x7f
    strb     w8, [x26, #2]
    ldrb     w8, [x25, #3]
    mov      w9, #0x47
    eor      w8, w8, w9
    strb     w8, [x26, #3]
    ldrb     w8, [x25, #4]
    eor      w8, w8, #0x7f
    strb     w8, [x26, #4]
    ldrb     w8, [x25, #5]
    mov      w9, #0x50
    eor      w8, w8, w9
    strb     w8, [x26, #5]
    ldrb     w8, [x25, #6]
    mov      w9, #0xc4
    eor      w8, w8, w9
    strb     w8, [x26, #6]
    ldrb     w8, [x25, #7]
    eor      w8, w8, #0xc
    strb     w8, [x26, #7]
    ldrb     w8, [x25, #8]
    eor      w8, w8, #0xdddddddd
    strb     w8, [x26, #8]
    ldrb     w8, [x25, #9]
    mov      w9, #0xde
    eor      w8, w8, w9
    strb     w8, [x26, #9]
    ldrb     w8, [x25, #0xa]
    mov      w9, #0x1a
    eor      w8, w8, w9
    strb     w8, [x26, #0xa]
    ldrb     w8, [x25, #0xb]
    mov      w9, #0x52
    eor      w8, w8, w9
    strb     w8, [x26, #0xb]
    ldrb     w8, [x25, #0xc]
    strb     w8, [sp, #0x1a]
    ldr      x8, [sp]
    str      w28, [x8]
    b        #0x34cb24
    ldrb     w8, [sp, #0x1b]
    cmp      w8, #0
    mov      w8, #0x2c8a
    movk     w8, #0xa567, lsl #16
    mov      w9, #0x816a
    movk     w9, #0x432d, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x34cb24
    ldrb     w8, [sp, #0x1a]
    eor      w8, w8, #0x70
    strb     w8, [x20]
    ldrb     w8, [x19]
    eor      w8, w8, #0x40
    strb     w8, [x20, #1]
    ldrb     w8, [x19, #1]
    mov      w9, #0xd3
    eor      w8, w8, w9
    strb     w8, [x20, #2]
    ldrb     w8, [x19, #2]
    mov      w9, #0xa2
    eor      w8, w8, w9
    strb     w8, [x20, #3]
    ldrb     w8, [x19, #3]
    mov      w9, #0xa7
    eor      w8, w8, w9
    strb     w8, [x20, #4]
    ldrb     w8, [x19, #4]
    mov      w9, #0xbd
    eor      w8, w8, w9
    strb     w8, [sp, #0x19]
    ldr      x8, [sp]
    mov      w9, #0xb831
    movk     w9, #0xbe28, lsl #16
    str      w9, [x8]
    b        #0x34cb24
    mov      w9, #0x4a90
    movk     w9, #0xcc8a, lsl #16
    cmp      w8, w9
    b.ne     #0x34cb24
    ldr      x0, [sp, #0x10]
    bl       #0x461c9c // _objc_release
    ldrb     w0, [sp, #0xf]
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    add      sp, sp, #0x80
    ret      

// -[WCLGHomeGroups setEnabled:] IMP=0x34CE30 bounds=0x34CE30-0x34D1C4
loc_34CE30:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    str      w2, [sp, #0x14]
    str      x0, [sp, #8]
    mov      w22, #0x73b8
    movk     w22, #0xd236, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x280
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w8, #0x31f1
    movk     w8, #0x9ba2, lsl #16
    str      w8, [sp, #0x24]
    add      x8, sp, #0x24
    mov      w25, #0x3776
    movk     w25, #0x29e4, lsl #16
    str      x8, [sp, #0x18]
    mov      w26, #0x73b7
    movk     w26, #0xd236, lsl #16
    adrp     x21, #0x54c000
    add      x21, x21, #0x349
    mov      w20, #0x3777
    movk     w20, #0x29e4, lsl #16
    mov      w28, #0xca0b
    movk     w28, #0x56d4, lsl #16
    adrp     x19, #0x54c000
    add      x19, x19, #0x32d
    adrp     x23, #0x54c000
    add      x23, x23, #0x34d
    adrp     x24, #0x54c000
    add      x24, x24, #0x320
    adrp     x27, #0x54c000
    add      x27, x27, #0x340
    ldr      w8, [sp, #0x24]
    cmp      w8, w25
    b.gt     #0x34cf24
    cmp      w8, w26
    b.gt     #0x34cf6c
    mov      w9, #0xdc4c
    movk     w9, #0x88cf, lsl #16
    cmp      w8, w9
    b.eq     #0x34d114
    mov      w9, #0x31f1
    movk     w9, #0x9ba2, lsl #16
    cmp      w8, w9
    b.ne     #0x34cecc
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp, #0x18]
    mov      w9, #0xdc4c
    movk     w9, #0x88cf, lsl #16
    str      w9, [x8]
    b        #0x34cecc
    cmp      w8, w28
    b.gt     #0x34cfd0
    cmp      w8, w20
    b.eq     #0x34d084
    mov      w9, #0x104c
    movk     w9, #0x3152, lsl #16
    cmp      w8, w9
    b.ne     #0x34cecc
    ldp      x1, x0, [sp, #0x28]
    ldr      w2, [sp, #0x14]
    adrp     x3, #0x54c000
    add      x3, x3, #0x380
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x18]
    mov      w9, #0x4d16
    movk     w9, #0x5e82, lsl #16
    str      w9, [x8]
    b        #0x34cecc
    cmp      w8, w22
    b.eq     #0x34d134
    mov      w9, #0x222d
    movk     w9, #0xd2a9, lsl #16
    cmp      w8, w9
    b.ne     #0x34cecc
    ldrb     w8, [sp, #0x3a]
    eor      w8, w8, #0x78
    strb     w8, [x21]
    adrp     x9, #0x54c000
    add      x9, x9, #0x32a
    ldrb     w8, [x9]
    mov      w10, #0x52
    eor      w8, w8, w10
    strb     w8, [x21, #1]
    ldrb     w8, [x9, #1]
    mov      w10, #0x95
    eor      w8, w8, w10
    strb     w8, [x21, #2]
    ldrb     w8, [x9, #2]
    eor      w8, w8, #0xffffffe3
    strb     w8, [x21, #3]
    ldr      x8, [sp, #0x18]
    str      w20, [x8]
    b        #0x34cecc
    mov      w9, #0xca0c
    movk     w9, #0x56d4, lsl #16
    cmp      w8, w9
    b.ne     #0x34d180
    ldrb     w8, [x24]
    mov      w9, #0x73
    eor      w8, w8, w9
    strb     w8, [x27]
    ldrb     w8, [x24, #1]
    mov      w9, #0xc5
    eor      w8, w8, w9
    strb     w8, [x27, #1]
    ldrb     w8, [x24, #2]
    eor      w8, w8, #0xc
    strb     w8, [x27, #2]
    ldrb     w8, [x24, #3]
    mov      w9, #0x69
    eor      w8, w8, w9
    strb     w8, [x27, #3]
    ldrb     w8, [x24, #4]
    eor      w8, w8, #0xffffffef
    strb     w8, [x27, #4]
    ldrb     w8, [x24, #5]
    mov      w9, #0xf2
    eor      w8, w8, w9
    strb     w8, [x27, #5]
    ldrb     w8, [x24, #6]
    mov      w9, #0x3d
    eor      w8, w8, w9
    strb     w8, [x27, #6]
    ldrb     w8, [x24, #7]
    mov      w9, #0xc6
    eor      w8, w8, w9
    strb     w8, [x27, #7]
    ldrb     w8, [x24, #8]
    mov      w9, #0xa7
    eor      w8, w8, w9
    strb     w8, [x27, #8]
    ldrb     w8, [x24, #9]
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x222d
    movk     w9, #0xd2a9, lsl #16
    str      w9, [x8]
    b        #0x34cecc
    ldrb     w8, [x19]
    eor      w8, w8, #0xc0
    strb     w8, [x23]
    ldrb     w8, [x19, #1]
    eor      w8, w8, #0xffffffe1
    strb     w8, [x23, #1]
    ldrb     w8, [x19, #2]
    mov      w9, #0x1a
    eor      w8, w8, w9
    strb     w8, [x23, #2]
    ldrb     w8, [x19, #3]
    mov      w9, #0xb3
    eor      w8, w8, w9
    strb     w8, [x23, #3]
    ldrb     w8, [x19, #4]
    mov      w9, #0xac
    eor      w8, w8, w9
    strb     w8, [x23, #4]
    ldrb     w8, [x19, #5]
    mov      w9, #0xfa
    eor      w8, w8, w9
    strb     w8, [x23, #5]
    ldrb     w8, [x19, #6]
    eor      w8, w8, #0x88888888
    strb     w8, [x23, #6]
    ldrb     w8, [x19, #7]
    mov      w9, #0xa4
    eor      w8, w8, w9
    strb     w8, [x23, #7]
    ldrb     w8, [x19, #8]
    mov      w9, #0x6b
    eor      w8, w8, w9
    strb     w8, [x23, #8]
    ldr      x8, [sp, #0x18]
    str      w22, [x8]
    b        #0x34cecc
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    mov      w8, #0xca0c
    movk     w8, #0x56d4, lsl #16
    csel     w8, w8, w22, ne
    ldr      x9, [sp, #0x18]
    str      w8, [x9]
    b        #0x34cecc
    adrp     x8, #0x581000
    add      x8, x8, #0x280
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x350]
    stp      x8, x0, [sp, #0x28]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x104c
    movk     w9, #0x3152, lsl #16
    str      w9, [x8]
    b        #0x34cecc
    mov      w9, #0x4d16
    movk     w9, #0x5e82, lsl #16
    cmp      w8, w9
    b.ne     #0x34cecc
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xaf8]
    ldr      x0, [sp, #8]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups tgMode] IMP=0x34D1C4 bounds=0x34D1C4-0x34D55C
loc_34D1C4:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      w19, #0x9161
    movk     w19, #0x9305, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x284
    ldar     w8, [x8]
    mov      w9, #0x9983
    movk     w9, #0x3545, lsl #16
    str      w8, [sp, #0x2c]
    add      x8, sp, #0x14
    mov      w22, #0x63da
    movk     w22, #0x2aa0, lsl #16
    str      w9, [sp, #0x14]
    mov      w23, #0xcd71
    movk     w23, #0xbaae, lsl #16
    str      x8, [sp, #8]
    mov      w10, #0xcd72
    movk     w10, #0xbaae, lsl #16
    mov      w11, #0x7341
    movk     w11, #0xa42a, lsl #16
    adrp     x28, #0x54c000
    add      x28, x28, #0x3a0
    adrp     x24, #0x54c000
    add      x24, x24, #0x3c0
    mov      w12, #0x4bf9
    movk     w12, #0xe6a1, lsl #16
    adrp     x20, #0x54c000
    add      x20, x20, #0x3aa
    mov      w14, #0x9a1e
    movk     w14, #0x5545, lsl #16
    mov      w25, #0x9a1d
    movk     w25, #0x5545, lsl #16
    mov      w27, #0x63db
    movk     w27, #0x2aa0, lsl #16
    adrp     x21, #0x54c000
    add      x21, x21, #0x3cc
    adrp     x26, #0x54c000
    add      x26, x26, #0x3ad
    ldr      w8, [sp, #0x14]
    cmp      w8, w22
    b.gt     #0x34d344
    cmp      w8, w23
    b.gt     #0x34d380
    cmp      w8, w19
    b.eq     #0x34d488
    cmp      w8, w11
    b.ne     #0x34d278
    ldrb     w8, [x28]
    mov      w9, #0x74
    eor      w8, w8, w9
    strb     w8, [x24]
    ldrb     w8, [x28, #1]
    mov      w9, #0xba
    eor      w8, w8, w9
    strb     w8, [x24, #1]
    ldrb     w8, [x28, #2]
    mov      w9, #0x9b
    eor      w8, w8, w9
    strb     w8, [x24, #2]
    ldrb     w8, [x28, #3]
    eor      w8, w8, #0xffffffbf
    strb     w8, [x24, #3]
    ldrb     w8, [x28, #4]
    mov      w9, #0x72
    eor      w8, w8, w9
    strb     w8, [x24, #4]
    ldrb     w8, [x28, #5]
    mov      w9, #0xaf
    eor      w8, w8, w9
    strb     w8, [x24, #5]
    ldrb     w8, [x28, #6]
    mov      w9, #0xf2
    eor      w8, w8, w9
    strb     w8, [x24, #6]
    ldrb     w8, [x28, #7]
    mov      w9, #0xcd
    eor      w8, w8, w9
    strb     w8, [x24, #7]
    ldrb     w8, [x28, #8]
    mov      w9, #0xb5
    eor      w8, w8, w9
    strb     w8, [x24, #8]
    ldrb     w8, [x28, #9]
    mov      w9, #0x27
    eor      w8, w8, w9
    strb     w8, [sp, #0x2a]
    ldr      x8, [sp, #8]
    str      w12, [x8]
    b        #0x34d278
    cmp      w8, w25
    b.gt     #0x34d3d8
    cmp      w8, w27
    b.eq     #0x34d470
    mov      w9, #0x9983
    movk     w9, #0x3545, lsl #16
    cmp      w8, w9
    b.ne     #0x34d278
    ldr      w8, [sp, #0x2c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x2b]
    ldr      x8, [sp, #8]
    str      w27, [x8]
    b        #0x34d278
    cmp      w8, w10
    b.eq     #0x34d4b0
    cmp      w8, w12
    b.ne     #0x34d278
    ldrb     w8, [sp, #0x2a]
    adrp     x9, #0x54c000
    add      x9, x9, #0x3c9
    strb     w8, [x9]
    ldrb     w8, [x20]
    mov      w13, #0xb9
    eor      w8, w8, w13
    strb     w8, [x9, #1]
    ldrb     w8, [x20, #1]
    eor      w8, w8, #0xffffffbf
    strb     w8, [x9, #2]
    ldrb     w8, [x20, #2]
    mov      w9, #0x4d
    eor      w8, w8, w9
    strb     w8, [sp, #0x29]
    ldr      x8, [sp, #8]
    str      w14, [x8]
    b        #0x34d278
    cmp      w8, w14
    b.ne     #0x34d500
    ldrb     w8, [sp, #0x29]
    strb     w8, [x21]
    ldrb     w8, [x26]
    mov      w9, #0x17
    eor      w8, w8, w9
    strb     w8, [x21, #1]
    ldrb     w8, [x26, #1]
    mov      w9, #0x3d
    eor      w8, w8, w9
    strb     w8, [x21, #2]
    ldrb     w8, [x26, #2]
    eor      w8, w8, #0xffffff8f
    strb     w8, [x21, #3]
    ldrb     w8, [x26, #3]
    mov      w9, #0xa4
    eor      w8, w8, w9
    strb     w8, [x21, #4]
    ldrb     w8, [x26, #4]
    mov      w9, #0x4e
    eor      w8, w8, w9
    strb     w8, [x21, #5]
    ldrb     w8, [x26, #5]
    mov      w9, #0xea
    eor      w8, w8, w9
    strb     w8, [x21, #6]
    ldrb     w8, [x26, #6]
    mov      w9, #0x23
    eor      w8, w8, w9
    strb     w8, [x21, #7]
    ldrb     w8, [x26, #7]
    mov      w9, #0x57
    eor      w8, w8, w9
    strb     w8, [x21, #8]
    ldr      x8, [sp, #8]
    str      w19, [x8]
    b        #0x34d278
    ldrb     w8, [sp, #0x2b]
    cmp      w8, #0
    csel     w8, w11, w19, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x34d278
    adrp     x8, #0x581000
    add      x8, x8, #0x284
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x60]
    str      x8, [sp, #0x20]
    ldr      x8, [sp, #8]
    str      w10, [x8]
    b        #0x34d278
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    ldr      x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      w14, #0x9a1e
    movk     w14, #0x5545, lsl #16
    mov      w12, #0x4bf9
    movk     w12, #0xe6a1, lsl #16
    mov      w11, #0x7341
    movk     w11, #0xa42a, lsl #16
    mov      w10, #0xcd72
    movk     w10, #0xbaae, lsl #16
    str      x0, [sp, #0x18]
    ldr      x8, [sp, #8]
    mov      w9, #0xae8e
    movk     w9, #0x58d7, lsl #16
    str      w9, [x8]
    b        #0x34d278
    mov      w9, #0xae8e
    movk     w9, #0x58d7, lsl #16
    cmp      w8, w9
    b.ne     #0x34d278
    ldr      x0, [sp, #0x18]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x480]
    adrp     x2, #0x54c000
    add      x2, x2, #0x400
    mov      w3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    ret      

// -[WCLGHomeGroups setTgMode:] IMP=0x34D55C bounds=0x34D55C-0x34D8E0
loc_34D55C:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    str      w2, [sp, #0x14]
    str      x0, [sp, #8]
    mov      w22, #0xe955
    movk     w22, #0xcad6, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x288
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w8, #0x400d
    movk     w8, #0xe9d3, lsl #16
    str      w8, [sp, #0x24]
    add      x8, sp, #0x24
    mov      w25, #0x400c
    movk     w25, #0xe9d3, lsl #16
    str      x8, [sp, #0x18]
    mov      w26, #0xe954
    movk     w26, #0xcad6, lsl #16
    mov      w27, #0xd976
    movk     w27, #0x9cf5, lsl #16
    mov      w28, #0xcd56
    movk     w28, #0x6600, lsl #16
    adrp     x20, #0x54c000
    add      x20, x20, #0x44d
    mov      w24, #0xb510
    movk     w24, #0x24f4, lsl #16
    adrp     x19, #0x54c000
    add      x19, x19, #0x42e
    adrp     x23, #0x54c000
    add      x23, x23, #0x421
    adrp     x21, #0x54c000
    add      x21, x21, #0x441
    ldr      w8, [sp, #0x24]
    cmp      w8, w25
    b.gt     #0x34d644
    cmp      w8, w26
    b.gt     #0x34d6e8
    cmp      w8, w27
    b.eq     #0x34d830
    mov      w9, #0xe630
    movk     w9, #0xa73c, lsl #16
    cmp      w8, w9
    b.ne     #0x34d5f8
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    mov      w8, #0x955e
    movk     w8, #0xd307, lsl #16
    csel     w8, w8, w22, ne
    ldr      x9, [sp, #0x18]
    str      w8, [x9]
    b        #0x34d5f8
    cmp      w8, w28
    b.gt     #0x34d72c
    mov      w9, #0x400d
    movk     w9, #0xe9d3, lsl #16
    cmp      w8, w9
    b.eq     #0x34d80c
    cmp      w8, w24
    b.ne     #0x34d5f8
    ldrb     w8, [sp, #0x3a]
    strb     w8, [x20]
    ldrb     w8, [x19]
    mov      w9, #0x7b
    eor      w8, w8, w9
    strb     w8, [x20, #1]
    ldrb     w8, [x19, #1]
    mov      w9, #0x1a
    eor      w8, w8, w9
    strb     w8, [x20, #2]
    ldrb     w8, [x19, #2]
    mov      w9, #0xed
    eor      w8, w8, w9
    strb     w8, [x20, #3]
    ldrb     w8, [x19, #3]
    mov      w9, #0x47
    eor      w8, w8, w9
    strb     w8, [x20, #4]
    ldrb     w8, [x19, #4]
    mov      w9, #0xea
    eor      w8, w8, w9
    strb     w8, [x20, #5]
    ldrb     w8, [x19, #5]
    mov      w9, #0x73
    eor      w8, w8, w9
    strb     w8, [x20, #6]
    ldrb     w8, [x19, #6]
    mov      w9, #0x71
    eor      w8, w8, w9
    strb     w8, [x20, #7]
    ldr      x8, [sp, #0x18]
    str      w22, [x8]
    b        #0x34d5f8
    cmp      w8, w22
    b.eq     #0x34d860
    mov      w9, #0x955e
    movk     w9, #0xd307, lsl #16
    cmp      w8, w9
    b.ne     #0x34d5f8
    adrp     x8, #0x54c000
    ldrb     w8, [x8, #0x420]
    mov      w9, #0xdc
    eor      w8, w8, w9
    adrp     x9, #0x54c000
    strb     w8, [x9, #0x440]
    ldr      x8, [sp, #0x18]
    mov      w9, #0xcd57
    movk     w9, #0x6600, lsl #16
    str      w9, [x8]
    b        #0x34d5f8
    mov      w9, #0xcd57
    movk     w9, #0x6600, lsl #16
    cmp      w8, w9
    b.ne     #0x34d8a4
    ldrb     w8, [x23]
    mov      w9, #0x51
    eor      w8, w8, w9
    strb     w8, [x21]
    ldrb     w8, [x23, #1]
    mov      w9, #0x54
    eor      w8, w8, w9
    strb     w8, [x21, #1]
    ldrb     w8, [x23, #2]
    eor      w8, w8, #0x3f
    strb     w8, [x21, #2]
    ldrb     w8, [x23, #3]
    mov      w9, #0xc9
    eor      w8, w8, w9
    strb     w8, [x21, #3]
    ldrb     w8, [x23, #4]
    mov      w10, #0xe6
    eor      w8, w8, w10
    strb     w8, [x21, #4]
    ldrb     w8, [x23, #5]
    mov      w10, #0x6e
    eor      w8, w8, w10
    strb     w8, [x21, #5]
    ldrb     w8, [x23, #6]
    mov      w10, #0x76
    eor      w8, w8, w10
    strb     w8, [x21, #6]
    ldrb     w8, [x23, #7]
    mov      w10, #0xa9
    eor      w8, w8, w10
    strb     w8, [x21, #7]
    ldrb     w8, [x23, #8]
    eor      w8, w8, #0x7e
    strb     w8, [x21, #8]
    ldrb     w8, [x23, #9]
    mov      w10, #0x16
    eor      w8, w8, w10
    strb     w8, [x21, #9]
    ldrb     w8, [x23, #0xa]
    mov      w10, #0x53
    eor      w8, w8, w10
    strb     w8, [x21, #0xa]
    ldrb     w8, [x23, #0xb]
    eor      w8, w8, w9
    strb     w8, [x21, #0xb]
    ldrb     w8, [x23, #0xc]
    mov      w9, #0x4e
    eor      w8, w8, w9
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp, #0x18]
    str      w24, [x8]
    b        #0x34d5f8
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp, #0x18]
    mov      w9, #0xe630
    movk     w9, #0xa73c, lsl #16
    str      w9, [x8]
    b        #0x34d5f8
    ldp      x1, x0, [sp, #0x28]
    ldr      w2, [sp, #0x14]
    adrp     x3, #0x54c000
    add      x3, x3, #0x480
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x18]
    mov      w9, #0x7694
    movk     w9, #0x68a5, lsl #16
    str      w9, [x8]
    b        #0x34d5f8
    adrp     x8, #0x581000
    add      x8, x8, #0x288
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x350]
    stp      x8, x0, [sp, #0x28]
    ldr      x8, [sp, #0x18]
    str      w27, [x8]
    b        #0x34d5f8
    mov      w9, #0x7694
    movk     w9, #0x68a5, lsl #16
    cmp      w8, w9
    b.ne     #0x34d5f8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xaf8]
    ldr      x0, [sp, #8]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups hideGroupArrow] IMP=0x34D8E0 bounds=0x34D8E0-0x34DC4C
loc_34D8E0:
    sub      sp, sp, #0x80
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    mov      w19, #0xc295
    movk     w19, #0x175, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x28c
    ldar     w8, [x8]
    mov      w9, #0xc998
    movk     w9, #0x8c93, lsl #16
    str      w8, [sp, #0x1c]
    add      x8, sp, #0xc
    mov      w22, #0xc294
    movk     w22, #0x175, lsl #16
    str      w9, [sp, #0xc]
    mov      w23, #0xa26e
    movk     w23, #0xa1bc, lsl #16
    mov      w24, #0x7334
    movk     w24, #0x81f8, lsl #16
    str      x8, [sp]
    mov      w10, #0x336b
    movk     w10, #0x7d9f, lsl #16
    mov      w26, #0x1f2e
    movk     w26, #0xf72f, lsl #16
    mov      w28, #0x6e22
    movk     w28, #0x7ca5, lsl #16
    mov      w20, #0x6e23
    movk     w20, #0x7ca5, lsl #16
    mov      w21, #0x5dfb
    movk     w21, #0x79a, lsl #16
    adrp     x27, #0x54c000
    add      x27, x27, #0x4c1
    adrp     x25, #0x54c000
    add      x25, x25, #0x4a2
    ldr      w8, [sp, #0xc]
    cmp      w8, w22
    b.le     #0x34daf0
    cmp      w8, w28
    b.gt     #0x34db2c
    cmp      w8, w19
    b.eq     #0x34db98
    cmp      w8, w21
    b.ne     #0x34d97c
    ldrb     w8, [sp, #0x1a]
    strb     w8, [x27]
    ldrb     w8, [x25]
    mov      w9, #0x7b
    eor      w8, w8, w9
    strb     w8, [x27, #1]
    ldrb     w8, [x25, #1]
    mov      w9, #0x19
    eor      w8, w8, w9
    strb     w8, [x27, #2]
    ldrb     w8, [x25, #2]
    eor      w8, w8, #3
    strb     w8, [x27, #3]
    ldrb     w8, [x25, #3]
    eor      w8, w8, #0xfffffff1
    strb     w8, [x27, #4]
    ldrb     w8, [x25, #4]
    eor      w8, w8, #0xf8
    strb     w8, [x27, #5]
    ldrb     w8, [x25, #5]
    eor      w8, w8, #0x40
    strb     w8, [x27, #6]
    ldrb     w8, [x25, #6]
    mov      w9, #0x6c
    eor      w8, w8, w9
    strb     w8, [x27, #7]
    ldrb     w8, [x25, #7]
    mov      w9, #0xf2
    eor      w8, w8, w9
    strb     w8, [x27, #8]
    ldrb     w8, [x25, #8]
    eor      w8, w8, #0x10
    strb     w8, [x27, #9]
    ldrb     w8, [x25, #9]
    mov      w9, #0x24
    eor      w8, w8, w9
    strb     w8, [x27, #0xa]
    ldrb     w8, [x25, #0xa]
    eor      w8, w8, #0xfffffff1
    strb     w8, [x27, #0xb]
    ldrb     w8, [x25, #0xb]
    mov      w9, #0xd2
    eor      w8, w8, w9
    strb     w8, [x27, #0xc]
    ldrb     w8, [x25, #0xc]
    mov      w9, #0xb8
    eor      w8, w8, w9
    strb     w8, [x27, #0xd]
    ldrb     w8, [x25, #0xd]
    mov      w9, #0x6f
    eor      w8, w8, w9
    strb     w8, [x27, #0xe]
    ldrb     w8, [x25, #0xe]
    mov      w9, #0x9e
    eor      w8, w8, w9
    strb     w8, [x27, #0xf]
    ldrb     w8, [x25, #0xf]
    eor      w8, w8, #0x70
    strb     w8, [x27, #0x10]
    ldrb     w8, [x25, #0x10]
    eor      w8, w8, #0xf0
    strb     w8, [x27, #0x11]
    ldrb     w8, [x25, #0x11]
    mov      w9, #0x37
    eor      w8, w8, w9
    strb     w8, [x27, #0x12]
    ldrb     w8, [x25, #0x12]
    mov      w9, #0x48
    eor      w8, w8, w9
    strb     w8, [x27, #0x13]
    ldrb     w8, [x25, #0x13]
    mov      w9, #0xa4
    eor      w8, w8, w9
    strb     w8, [x27, #0x14]
    ldrb     w8, [x25, #0x14]
    eor      w8, w8, #0x38
    strb     w8, [x27, #0x15]
    ldrb     w8, [x25, #0x15]
    mov      w9, #0xf5
    eor      w8, w8, w9
    strb     w8, [x27, #0x16]
    ldr      x8, [sp]
    str      w26, [x8]
    b        #0x34d97c
    cmp      w8, w23
    b.gt     #0x34db6c
    cmp      w8, w24
    b.eq     #0x34db80
    mov      w9, #0xc998
    movk     w9, #0x8c93, lsl #16
    cmp      w8, w9
    b.ne     #0x34d97c
    ldr      w8, [sp, #0x1c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x1b]
    ldr      x8, [sp]
    str      w24, [x8]
    b        #0x34d97c
    cmp      w8, w20
    b.eq     #0x34dbb4
    cmp      w8, w10
    b.ne     #0x34d97c
    adrp     x11, #0x54c000
    add      x11, x11, #0x4a0
    ldrb     w8, [x11]
    eor      w8, w8, #0x1e
    adrp     x9, #0x54c000
    strb     w8, [x9, #0x4c0]
    ldrb     w8, [x11, #1]
    mvn      w8, w8
    strb     w8, [sp, #0x1a]
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x34d97c
    cmp      w8, w26
    b.ne     #0x34dbf0
    ldr      x8, [sp]
    str      w19, [x8]
    b        #0x34d97c
    ldrb     w8, [sp, #0x1b]
    cmp      w8, #0
    csel     w8, w10, w19, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x34d97c
    adrp     x8, #0x581000
    add      x8, x8, #0x28c
    mov      w9, #1
    stlr     w9, [x8]
    ldr      x8, [sp]
    str      w20, [x8]
    b        #0x34d97c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      w10, #0x336b
    movk     w10, #0x7d9f, lsl #16
    str      x0, [sp, #0x10]
    ldr      x8, [sp]
    mov      w9, #0xa26f
    movk     w9, #0xa1bc, lsl #16
    str      w9, [x8]
    b        #0x34d97c
    mov      w9, #0xa26f
    movk     w9, #0xa1bc, lsl #16
    cmp      w8, w9
    b.ne     #0x34d97c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x480]
    ldr      x0, [sp, #0x10]
    adrp     x2, #0x54c000
    add      x2, x2, #0x500
    mov      w3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    ldr      x0, [sp, #0x10]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    add      sp, sp, #0x80
    ret      

// -[WCLGHomeGroups setHideGroupArrow:] IMP=0x34DC4C bounds=0x34DC4C-0x34E014
loc_34DC4C:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    str      w2, [sp, #0x14]
    str      x0, [sp, #8]
    adrp     x8, #0x581000
    add      x8, x8, #0x290
    mov      w23, #0x90ec
    movk     w23, #0xa7f6, lsl #16
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w8, #0x9590
    movk     w8, #0x6f90, lsl #16
    str      w8, [sp, #0x24]
    add      x8, sp, #0x24
    mov      w25, #0x6e07
    movk     w25, #0x194c, lsl #16
    str      x8, [sp, #0x18]
    mov      w26, #0x6546
    movk     w26, #0xf512, lsl #16
    adrp     x21, #0x54c000
    add      x21, x21, #0x547
    adrp     x24, #0x54c000
    add      x24, x24, #0x528
    adrp     x27, #0x54c000
    add      x27, x27, #0x520
    adrp     x22, #0x54c000
    add      x22, x22, #0x540
    mov      w19, #0xe283
    movk     w19, #0x631e, lsl #16
    adrp     x28, #0x54c000
    add      x28, x28, #0x530
    adrp     x20, #0x54c000
    add      x20, x20, #0x550
    ldr      w8, [sp, #0x24]
    cmp      w8, w25
    b.gt     #0x34ddb0
    cmp      w8, w26
    b.gt     #0x34de5c
    cmp      w8, w23
    b.eq     #0x34df58
    mov      w9, #0xc6e8
    movk     w9, #0xbc4f, lsl #16
    cmp      w8, w9
    b.ne     #0x34dce8
    ldrb     w8, [sp, #0x3a]
    mov      w9, #0x3b
    eor      w8, w8, w9
    strb     w8, [x21]
    ldrb     w8, [x24]
    mov      w10, #0xac
    eor      w8, w8, w10
    strb     w8, [x21, #1]
    ldrb     w8, [x24, #1]
    mov      w10, #0x53
    eor      w8, w8, w10
    strb     w8, [x21, #2]
    ldrb     w8, [x24, #2]
    mov      w10, #0x73
    eor      w8, w8, w10
    strb     w8, [x21, #3]
    ldrb     w8, [x24, #3]
    eor      w8, w8, #0xfe
    strb     w8, [x21, #4]
    ldrb     w8, [x24, #4]
    mov      w10, #0xd2
    eor      w8, w8, w10
    strb     w8, [x21, #5]
    ldrb     w8, [x24, #5]
    mov      w10, #0x2b
    eor      w8, w8, w10
    strb     w8, [x21, #6]
    ldrb     w8, [x24, #6]
    eor      w8, w8, w9
    strb     w8, [x21, #7]
    ldrb     w8, [x24, #7]
    mov      w9, #0xba
    eor      w8, w8, w9
    strb     w8, [x21, #8]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x5bd1
    movk     w9, #0x34a3, lsl #16
    str      w9, [x8]
    b        #0x34dce8
    cmp      w8, w19
    b.gt     #0x34df04
    mov      w9, #0x6e08
    movk     w9, #0x194c, lsl #16
    cmp      w8, w9
    b.eq     #0x34df38
    mov      w9, #0x5bd1
    movk     w9, #0x34a3, lsl #16
    cmp      w8, w9
    b.ne     #0x34dce8
    ldrb     w8, [x28]
    mov      w9, #0xd9
    eor      w8, w8, w9
    strb     w8, [x20]
    ldrb     w8, [x28, #1]
    mov      w9, #0x71
    eor      w8, w8, w9
    strb     w8, [x20, #1]
    ldrb     w8, [x28, #2]
    eor      w8, w8, #0xf0
    strb     w8, [x20, #2]
    ldrb     w8, [x28, #3]
    mov      w9, #0x39
    eor      w8, w8, w9
    strb     w8, [x20, #3]
    ldrb     w8, [x28, #4]
    mov      w9, #0xf6
    eor      w8, w8, w9
    strb     w8, [x20, #4]
    ldrb     w8, [x28, #5]
    eor      w8, w8, #0x60
    strb     w8, [x20, #5]
    ldrb     w8, [x28, #6]
    mov      w9, #0x8e
    eor      w8, w8, w9
    strb     w8, [x20, #6]
    ldrb     w8, [x28, #7]
    mov      w9, #0xca
    eor      w8, w8, w9
    strb     w8, [x20, #7]
    ldr      x8, [sp, #0x18]
    str      w23, [x8]
    b        #0x34dce8
    mov      w9, #0x6547
    movk     w9, #0xf512, lsl #16
    cmp      w8, w9
    b.eq     #0x34dfa4
    mov      w9, #0x3989
    movk     w9, #0xa0c, lsl #16
    cmp      w8, w9
    b.ne     #0x34dce8
    ldrb     w8, [x27]
    mov      w9, #0xb1
    eor      w8, w8, w9
    strb     w8, [x22]
    ldrb     w8, [x27, #1]
    mov      w9, #0x13
    eor      w8, w8, w9
    strb     w8, [x22, #1]
    ldrb     w8, [x27, #2]
    mov      w9, #0x9e
    eor      w8, w8, w9
    strb     w8, [x22, #2]
    ldrb     w8, [x27, #3]
    eor      w8, w8, #0x18
    strb     w8, [x22, #3]
    ldrb     w8, [x27, #4]
    mov      w9, #0x5e
    eor      w8, w8, w9
    strb     w8, [x22, #4]
    ldrb     w8, [x27, #5]
    mov      w9, #0x85
    eor      w8, w8, w9
    strb     w8, [x22, #5]
    ldrb     w8, [x27, #6]
    mov      w9, #0xc9
    eor      w8, w8, w9
    strb     w8, [x22, #6]
    ldrb     w8, [x27, #7]
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp, #0x18]
    mov      w9, #0xc6e8
    movk     w9, #0xbc4f, lsl #16
    str      w9, [x8]
    b        #0x34dce8
    mov      w9, #0x9590
    movk     w9, #0x6f90, lsl #16
    cmp      w8, w9
    b.ne     #0x34dfe4
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x6e08
    movk     w9, #0x194c, lsl #16
    str      w9, [x8]
    b        #0x34dce8
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    mov      w8, #0x3989
    movk     w8, #0xa0c, lsl #16
    csel     w8, w8, w23, ne
    ldr      x9, [sp, #0x18]
    str      w8, [x9]
    b        #0x34dce8
    adrp     x8, #0x581000
    add      x8, x8, #0x290
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x350]
    stp      x8, x0, [sp, #0x28]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x6547
    movk     w9, #0xf512, lsl #16
    str      w9, [x8]
    b        #0x34dce8
    ldp      x1, x0, [sp, #0x28]
    ldr      w2, [sp, #0x14]
    adrp     x3, #0x54c000
    add      x3, x3, #0x580
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp, #8]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x18]
    mov      w9, #0xe284
    movk     w9, #0x631e, lsl #16
    str      w9, [x8]
    b        #0x34dce8
    mov      w9, #0xe284
    movk     w9, #0x631e, lsl #16
    cmp      w8, w9
    b.ne     #0x34dce8
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    ret      

// -[WCLGHomeGroups stripPillFontSize] IMP=0x34E014 bounds=0x34E014-0x34E464
loc_34E014:
    sub      sp, sp, #0xb0
    stp      d9, d8, [sp, #0x40]
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      w21, #0x9176
    movk     w21, #0xbd6c, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x294
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w9, #0xf950
    movk     w9, #0x3c5b, lsl #16
    add      x8, sp, #0xc
    str      w9, [sp, #0xc]
    mov      w24, #0x83c0
    movk     w24, #0x22fa, lsl #16
    mov      w25, #0x8e05
    movk     w25, #0xe3f6, lsl #16
    str      x8, [sp]
    mov      w26, #0x4b4f
    movk     w26, #0x8cac, lsl #16
    mov      w27, #0x3df4
    movk     w27, #0x383e, lsl #16
    mov      w19, #0xf0d4
    movk     w19, #0x984, lsl #16
    mov      w28, #0x3df3
    movk     w28, #0x383e, lsl #16
    adrp     x22, #0x54c000
    add      x22, x22, #0x5a0
    adrp     x20, #0x54c000
    add      x20, x20, #0x5c0
    mov      w23, #0xb641
    movk     w23, #0x525a, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w24
    b.gt     #0x34e12c
    cmp      w8, w25
    b.gt     #0x34e170
    cmp      w8, w26
    b.eq     #0x34e3d8
    cmp      w8, w21
    b.eq     #0x34e370
    mov      w9, #0x2861
    movk     w9, #0xbe22, lsl #16
    cmp      w8, w9
    b.ne     #0x34e0ac
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x2, [x8, #0x4a0]
    str      x2, [sp, #0x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    ldr      x0, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp]
    mov      w9, #0x8e06
    movk     w9, #0xe3f6, lsl #16
    csel     w9, w27, w9, ne
    str      w9, [x8]
    mov      x8, #0x800000000000
    movk     x8, #0x4030, lsl #48
    str      x8, [sp, #0x10]
    b        #0x34e0ac
    cmp      w8, w28
    b.le     #0x34e1a0
    cmp      w8, w27
    b.eq     #0x34e3f4
    cmp      w8, w23
    b.eq     #0x34e394
    mov      w9, #0xf950
    movk     w9, #0x3c5b, lsl #16
    cmp      w8, w9
    b.ne     #0x34e0ac
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp]
    str      w19, [x8]
    b        #0x34e0ac
    cmp      w8, w19
    b.eq     #0x34e3b8
    mov      w9, #0x530e
    movk     w9, #0x1d25, lsl #16
    cmp      w8, w9
    b.ne     #0x34e40c
    ldrb     w8, [sp, #0x39]
    adrp     x9, #0x54c000
    strb     w8, [x9, #0x5d7]
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x34e0ac
    mov      w9, #0x83c1
    movk     w9, #0x22fa, lsl #16
    cmp      w8, w9
    b.eq     #0x34e214
    mov      w9, #0xb159
    movk     w9, #0x2cd3, lsl #16
    cmp      w8, w9
    b.ne     #0x34e0ac
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    adrp     x2, #0x54c000
    add      x2, x2, #0x600
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    ldr      x8, [sp]
    mov      w9, #0x2861
    movk     w9, #0xbe22, lsl #16
    str      w9, [x8]
    b        #0x34e0ac
    ldrb     w8, [x22]
    eor      w8, w8, #0xcccccccc
    strb     w8, [x20]
    ldrb     w8, [x22, #1]
    mov      w9, #0xd2
    eor      w8, w8, w9
    strb     w8, [x20, #1]
    ldrb     w8, [x22, #2]
    mov      w10, #0x8b
    eor      w8, w8, w10
    strb     w8, [x20, #2]
    ldrb     w8, [x22, #3]
    eor      w8, w8, #0xffffffbf
    strb     w8, [x20, #3]
    ldrb     w8, [x22, #4]
    mov      w10, #0x89
    eor      w8, w8, w10
    strb     w8, [x20, #4]
    ldrb     w8, [x22, #5]
    mov      w10, #0x92
    eor      w8, w8, w10
    strb     w8, [x20, #5]
    ldrb     w8, [x22, #6]
    mov      w10, #0x5a
    eor      w8, w8, w10
    strb     w8, [x20, #6]
    ldrb     w8, [x22, #7]
    mov      w10, #0x57
    eor      w8, w8, w10
    strb     w8, [x20, #7]
    ldrb     w8, [x22, #8]
    mov      w10, #0xcd
    eor      w8, w8, w10
    strb     w8, [x20, #8]
    ldrb     w8, [x22, #9]
    mov      w10, #0x71
    eor      w8, w8, w10
    strb     w8, [x20, #9]
    ldrb     w8, [x22, #0xa]
    mov      w10, #0x14
    eor      w8, w8, w10
    strb     w8, [x20, #0xa]
    ldrb     w8, [x22, #0xb]
    eor      w8, w8, #0x99999999
    strb     w8, [x20, #0xb]
    ldrb     w8, [x22, #0xc]
    eor      w8, w8, #0xc0
    strb     w8, [x20, #0xc]
    ldrb     w8, [x22, #0xd]
    eor      w8, w8, #0xffffff87
    strb     w8, [x20, #0xd]
    ldrb     w8, [x22, #0xe]
    eor      w8, w8, #0x33333333
    strb     w8, [x20, #0xe]
    ldrb     w8, [x22, #0xf]
    eor      w8, w8, #0x1c
    strb     w8, [x20, #0xf]
    ldrb     w8, [x22, #0x10]
    mov      w10, #0x75
    eor      w8, w8, w10
    strb     w8, [x20, #0x10]
    ldrb     w8, [x22, #0x11]
    mov      w10, #0x43
    eor      w8, w8, w10
    strb     w8, [x20, #0x11]
    ldrb     w8, [x22, #0x12]
    eor      w8, w8, w9
    strb     w8, [x20, #0x12]
    ldrb     w8, [x22, #0x13]
    eor      w8, w8, #0xe0
    strb     w8, [x20, #0x13]
    ldrb     w8, [x22, #0x14]
    eor      w8, w8, #0xf0
    strb     w8, [x20, #0x14]
    ldrb     w8, [x22, #0x15]
    mov      w9, #0xe8
    eor      w8, w8, w9
    strb     w8, [x20, #0x15]
    ldrb     w8, [x22, #0x16]
    mov      w9, #0x53
    eor      w8, w8, w9
    strb     w8, [x20, #0x16]
    ldrb     w8, [x22, #0x17]
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp]
    str      w23, [x8]
    b        #0x34e0ac
    adrp     x8, #0x581000
    add      x8, x8, #0x294
    mov      w9, #1
    stlr     w9, [x8]
    ldr      x8, [sp]
    mov      w9, #0xb159
    movk     w9, #0x2cd3, lsl #16
    str      w9, [x8]
    b        #0x34e0ac
    ldrb     w8, [sp, #0x3a]
    mov      w9, #0xe8
    eor      w8, w8, w9
    strb     w8, [sp, #0x39]
    ldr      x8, [sp]
    mov      w9, #0x530e
    movk     w9, #0x1d25, lsl #16
    str      w9, [x8]
    b        #0x34e0ac
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    mov      w8, #0x83c1
    movk     w8, #0x22fa, lsl #16
    csel     w8, w8, w21, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x34e0ac
    ldr      x8, [sp]
    mov      w9, #0x8e06
    movk     w9, #0xe3f6, lsl #16
    str      w9, [x8]
    ldr      d0, [sp, #0x18]
    str      d0, [sp, #0x10]
    b        #0x34e0ac
    ldp      x1, x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    str      d0, [sp, #0x18]
    ldr      x8, [sp]
    str      w26, [x8]
    b        #0x34e0ac
    mov      w9, #0x8e06
    movk     w9, #0xe3f6, lsl #16
    cmp      w8, w9
    b.ne     #0x34e0ac
    ldr      d0, [sp, #0x10]
    fmov     d1, #22.00000000
    fcmp     d0, d1
    fcsel    d0, d1, d0, gt
    fmov     d1, #11.00000000
    fmaxnm   d8, d0, d1
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    fmov     d0, d8
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    ldp      d9, d8, [sp, #0x40]
    add      sp, sp, #0xb0
    ret      

// -[WCLGHomeGroups setStripPillFontSize:] IMP=0x34E464 bounds=0x34E464-0x34E85C
loc_34E464:
    sub      sp, sp, #0xa0
    stp      d9, d8, [sp, #0x30]
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    fmov     d8, d0
    mov      w10, #0xc7c9
    movk     w10, #0x5d9e, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x298
    ldar     w8, [x8]
    str      w8, [sp, #0x2c]
    mov      w11, #0xd9b5
    movk     w11, #0xe4ec, lsl #16
    str      w11, [sp, #0x14]
    add      x8, sp, #0x14
    mov      w23, #0xd9b4
    movk     w23, #0xe4ec, lsl #16
    stp      x0, x8, [sp]
    mov      w24, #0x2f09
    movk     w24, #0xa62e, lsl #16
    mov      w12, #0x54ca
    movk     w12, #0x8aed, lsl #16
    mov      w13, #0xee1e
    movk     w13, #0x9331, lsl #16
    adrp     x19, #0x54c000
    add      x19, x19, #0x62c
    adrp     x21, #0x54c000
    add      x21, x21, #0x64c
    mov      w14, #0xdb
    mov      w27, #0x2f0a
    movk     w27, #0xa62e, lsl #16
    adrp     x26, #0x54c000
    add      x26, x26, #0x650
    adrp     x22, #0x54c000
    add      x22, x22, #0x631
    mov      w15, #0xa1eb
    movk     w15, #0xcddf, lsl #16
    adrp     x28, #0x54c000
    add      x28, x28, #0x620
    mov      w20, #0xd1e2
    movk     w20, #0x6637, lsl #16
    mov      w16, #0xc5b
    movk     w16, #0x752a, lsl #16
    adrp     x25, #0x54c000
    add      x25, x25, #0x640
    ldr      w8, [sp, #0x14]
    cmp      w8, w23
    b.gt     #0x34e59c
    cmp      w8, w24
    b.gt     #0x34e624
    cmp      w8, w12
    b.eq     #0x34e720
    cmp      w8, w13
    b.ne     #0x34e52c
    ldrb     w8, [x19]
    eor      w8, w8, #0xfffffff1
    strb     w8, [x21]
    ldrb     w8, [x19, #1]
    mov      w9, #0x43
    eor      w8, w8, w9
    strb     w8, [x21, #1]
    ldrb     w8, [x19, #2]
    eor      w8, w8, w14
    strb     w8, [x21, #2]
    ldrb     w8, [x19, #3]
    mov      w9, #0xea
    eor      w8, w8, w9
    strb     w8, [x21, #3]
    ldrb     w8, [x19, #4]
    strb     w8, [sp, #0x2a]
    ldr      x8, [sp, #8]
    str      w27, [x8]
    b        #0x34e52c
    cmp      w8, w20
    b.gt     #0x34e6e4
    cmp      w8, w11
    b.eq     #0x34e704
    cmp      w8, w10
    b.ne     #0x34e52c
    adrp     x8, #0x581000
    add      x8, x8, #0x298
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      w16, #0xc5b
    movk     w16, #0x752a, lsl #16
    mov      w15, #0xa1eb
    movk     w15, #0xcddf, lsl #16
    mov      w14, #0xdb
    mov      w13, #0xee1e
    movk     w13, #0x9331, lsl #16
    mov      w12, #0x54ca
    movk     w12, #0x8aed, lsl #16
    mov      w11, #0xd9b5
    movk     w11, #0xe4ec, lsl #16
    mov      w10, #0xc7c9
    movk     w10, #0x5d9e, lsl #16
    str      x0, [sp, #0x20]
    ldr      x8, [sp, #8]
    str      w12, [x8]
    b        #0x34e52c
    cmp      w8, w27
    b.eq     #0x34e740
    cmp      w8, w15
    b.ne     #0x34e52c
    ldrb     w8, [x28]
    eor      w8, w8, #0xfffffff1
    strb     w8, [x25]
    ldrb     w8, [x28, #1]
    eor      w8, w8, #0x78
    strb     w8, [x25, #1]
    ldrb     w8, [x28, #2]
    eor      w8, w8, w14
    strb     w8, [x25, #2]
    ldrb     w8, [x28, #3]
    eor      w8, w8, #0x80
    strb     w8, [x25, #3]
    ldrb     w8, [x28, #4]
    mov      w9, #0x26
    eor      w8, w8, w9
    strb     w8, [x25, #4]
    ldrb     w8, [x28, #5]
    mov      w9, #0xe4
    eor      w8, w8, w9
    strb     w8, [x25, #5]
    ldrb     w8, [x28, #6]
    eor      w8, w8, #0xc0
    strb     w8, [x25, #6]
    ldrb     w8, [x28, #7]
    eor      w8, w8, #0xfffffffb
    strb     w8, [x25, #7]
    ldrb     w8, [x28, #8]
    mov      w9, #0xf5
    eor      w8, w8, w9
    strb     w8, [x25, #8]
    ldrb     w8, [x28, #9]
    mov      w9, #0xd2
    eor      w8, w8, w9
    strb     w8, [x25, #9]
    ldrb     w8, [x28, #0xa]
    eor      w8, w8, #0xffffff87
    strb     w8, [x25, #0xa]
    ldrb     w8, [x28, #0xb]
    mov      w9, #9
    eor      w8, w8, w9
    strb     w8, [x25, #0xb]
    ldr      x8, [sp, #8]
    str      w13, [x8]
    b        #0x34e52c
    cmp      w8, w16
    b.ne     #0x34e7c0
    ldrb     w8, [sp, #0x2b]
    cmp      w8, #0
    csel     w8, w15, w10, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x34e52c
    ldr      w8, [sp, #0x2c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x2b]
    ldr      x8, [sp, #8]
    str      w16, [x8]
    b        #0x34e52c
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0xa8]
    str      x8, [sp, #0x18]
    ldr      x8, [sp, #8]
    mov      w9, #0xd1e3
    movk     w9, #0x6637, lsl #16
    str      w9, [x8]
    b        #0x34e52c
    ldrb     w8, [sp, #0x2a]
    mov      w9, #0xe6
    eor      w8, w8, w9
    strb     w8, [x26]
    ldrb     w8, [x22]
    mov      w9, #0xeb
    eor      w8, w8, w9
    strb     w8, [x26, #1]
    ldrb     w8, [x22, #1]
    mov      w9, #0x6e
    eor      w8, w8, w9
    strb     w8, [x26, #2]
    ldrb     w8, [x22, #2]
    mov      w9, #0xa
    eor      w8, w8, w9
    strb     w8, [x26, #3]
    ldrb     w8, [x22, #3]
    eor      w8, w8, #8
    strb     w8, [x26, #4]
    ldrb     w8, [x22, #4]
    eor      w8, w8, #0x7c
    strb     w8, [x26, #5]
    ldrb     w8, [x22, #5]
    eor      w8, w8, #0x22222222
    strb     w8, [x26, #6]
    ldrb     w8, [x22, #6]
    mov      w9, #0x73
    eor      w8, w8, w9
    strb     w8, [x26, #7]
    ldr      x8, [sp, #8]
    str      w10, [x8]
    b        #0x34e52c
    mov      w9, #0xd1e3
    movk     w9, #0x6637, lsl #16
    cmp      w8, w9
    b.ne     #0x34e52c
    fmov     d0, #22.00000000
    fcmp     d8, d0
    fcsel    d0, d0, d8, gt
    fmov     d1, #11.00000000
    fmaxnm   d0, d0, d1
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x498]
    ldr      x0, [sp, #0x18]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    ldr      x0, [sp, #0x20]
    adrp     x3, #0x54c000
    add      x3, x3, #0x680
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    ldp      d9, d8, [sp, #0x30]
    add      sp, sp, #0xa0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups stripPillWidth] IMP=0x34E85C bounds=0x34E85C-0x34ED0C
loc_34E85C:
    sub      sp, sp, #0xc0
    stp      d9, d8, [sp, #0x50]
    stp      x28, x27, [sp, #0x60]
    stp      x26, x25, [sp, #0x70]
    stp      x24, x23, [sp, #0x80]
    stp      x22, x21, [sp, #0x90]
    stp      x20, x19, [sp, #0xa0]
    stp      x29, x30, [sp, #0xb0]
    add      x29, sp, #0xb0
    adrp     x8, #0x581000
    add      x8, x8, #0x29c
    ldar     w8, [x8]
    str      w8, [sp, #0x4c]
    mov      w9, #0x9196
    movk     w9, #0x61c1, lsl #16
    add      x8, sp, #0x14
    str      w9, [sp, #0x14]
    mov      w24, #0xd3e2
    movk     w24, #0x1061, lsl #16
    mov      w25, #0x4661
    movk     w25, #0xac39, lsl #16
    str      x8, [sp, #8]
    adrp     x22, #0x54c000
    add      x22, x22, #0x6a6
    adrp     x23, #0x54c000
    add      x23, x23, #0x6c6
    mov      w20, #0x98c3
    movk     w20, #0x3990, lsl #16
    mov      w21, #0x98c2
    movk     w21, #0x3990, lsl #16
    adrp     x28, #0x54c000
    add      x28, x28, #0x6af
    adrp     x27, #0x54c000
    add      x27, x27, #0x6cf
    adrp     x19, #0x54c000
    add      x19, x19, #0x6a0
    adrp     x26, #0x54c000
    add      x26, x26, #0x6c0
    ldr      w8, [sp, #0x14]
    cmp      w8, w24
    b.gt     #0x34e97c
    cmp      w8, w25
    b.gt     #0x34e9d0
    mov      w9, #0xe170
    movk     w9, #0x8047, lsl #16
    cmp      w8, w9
    b.eq     #0x34ec6c
    mov      w9, #0x81f
    movk     w9, #0x8227, lsl #16
    cmp      w8, w9
    b.eq     #0x34eb54
    mov      w9, #0x835f
    movk     w9, #0x904f, lsl #16
    cmp      w8, w9
    b.ne     #0x34e8f4
    adrp     x8, #0x581000
    add      x8, x8, #0x29c
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x40]
    ldr      x8, [sp, #8]
    mov      w9, #0xe170
    movk     w9, #0x8047, lsl #16
    str      w9, [x8]
    b        #0x34e8f4
    cmp      w8, w21
    b.le     #0x34ea18
    cmp      w8, w20
    b.eq     #0x34ec8c
    mov      w9, #0x5818
    movk     w9, #0x5f28, lsl #16
    cmp      w8, w9
    b.eq     #0x34ebec
    mov      w9, #0x9196
    movk     w9, #0x61c1, lsl #16
    cmp      w8, w9
    b.ne     #0x34e8f4
    ldr      w8, [sp, #0x4c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x4b]
    ldr      x8, [sp, #8]
    mov      w9, #0x137e
    movk     w9, #0xeca3, lsl #16
    str      w9, [x8]
    b        #0x34e8f4
    mov      w9, #0xf29b
    movk     w9, #0xc7d0, lsl #16
    cmp      w8, w9
    b.eq     #0x34ec08
    mov      w9, #0x137e
    movk     w9, #0xeca3, lsl #16
    cmp      w8, w9
    b.ne     #0x34ecac
    ldrb     w8, [sp, #0x4b]
    cmp      w8, #0
    mov      w8, #0x835f
    movk     w8, #0x904f, lsl #16
    mov      w9, #0x2dab
    movk     w9, #0x3910, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x34e8f4
    mov      w9, #0xd3e3
    movk     w9, #0x1061, lsl #16
    cmp      w8, w9
    b.eq     #0x34eaac
    mov      w9, #0x2dab
    movk     w9, #0x3910, lsl #16
    cmp      w8, w9
    b.ne     #0x34e8f4
    ldrb     w8, [x19]
    mov      w9, #0xdb
    eor      w8, w8, w9
    strb     w8, [x26]
    ldrb     w8, [x19, #1]
    mov      w9, #0xbe
    eor      w8, w8, w9
    strb     w8, [x26, #1]
    ldrb     w8, [x19, #2]
    mov      w9, #0x9a
    eor      w8, w8, w9
    strb     w8, [x26, #2]
    ldrb     w8, [x19, #3]
    mov      w9, #0x1b
    eor      w8, w8, w9
    strb     w8, [x26, #3]
    ldrb     w8, [x19, #4]
    mov      w9, #0x6d
    eor      w8, w8, w9
    strb     w8, [x26, #4]
    ldrb     w8, [x19, #5]
    mov      w9, #0x8c
    eor      w8, w8, w9
    strb     w8, [x26, #5]
    ldr      x8, [sp, #8]
    mov      w9, #0x81f
    movk     w9, #0x8227, lsl #16
    str      w9, [x8]
    b        #0x34e8f4
    ldrb     w8, [x28]
    eor      w8, w8, #0xfffffff1
    strb     w8, [x27]
    ldrb     w8, [x28, #1]
    mov      w9, #0x58
    eor      w8, w8, w9
    strb     w8, [x27, #1]
    ldrb     w8, [x28, #2]
    eor      w8, w8, #0xfffffff9
    strb     w8, [x27, #2]
    ldrb     w8, [x28, #3]
    mov      w9, #0xed
    eor      w8, w8, w9
    strb     w8, [x27, #3]
    ldrb     w8, [x28, #4]
    mov      w9, #0x29
    eor      w8, w8, w9
    strb     w8, [x27, #4]
    ldrb     w8, [x28, #5]
    mov      w9, #0xdb
    eor      w8, w8, w9
    strb     w8, [x27, #5]
    ldrb     w8, [x28, #6]
    eor      w8, w8, #0x88888888
    strb     w8, [x27, #6]
    ldrb     w8, [x28, #7]
    mov      w9, #0xb1
    eor      w8, w8, w9
    strb     w8, [x27, #7]
    ldrb     w8, [x28, #8]
    mov      w9, #0x9b
    eor      w8, w8, w9
    strb     w8, [x27, #8]
    ldrb     w8, [x28, #9]
    mov      w9, #0x90
    eor      w8, w8, w9
    strb     w8, [x27, #9]
    ldr      x8, [sp, #8]
    mov      w9, #0x835f
    movk     w9, #0x904f, lsl #16
    str      w9, [x8]
    b        #0x34e8f4
    ldrb     w8, [x22]
    mov      w9, #0x29
    eor      w8, w8, w9
    strb     w8, [x23]
    ldrb     w8, [x22, #1]
    eor      w8, w8, #0xffffff8f
    strb     w8, [x23, #1]
    ldrb     w8, [x22, #2]
    eor      w8, w8, #0x11111111
    strb     w8, [x23, #2]
    ldrb     w8, [x22, #3]
    mov      w9, #0x43
    eor      w8, w8, w9
    strb     w8, [x23, #3]
    ldrb     w8, [x22, #4]
    mov      w9, #0xd5
    eor      w8, w8, w9
    strb     w8, [x23, #4]
    ldrb     w8, [x22, #5]
    mov      w9, #0xea
    eor      w8, w8, w9
    strb     w8, [x23, #5]
    ldrb     w8, [x22, #6]
    mov      w9, #0x74
    eor      w8, w8, w9
    strb     w8, [x23, #6]
    ldrb     w8, [x22, #7]
    eor      w8, w8, #0x38
    strb     w8, [x23, #7]
    ldrb     w8, [x22, #8]
    mov      w9, #0x1a
    eor      w8, w8, w9
    strb     w8, [x23, #8]
    ldr      x8, [sp, #8]
    mov      w9, #0xd3e3
    movk     w9, #0x1061, lsl #16
    str      w9, [x8]
    b        #0x34e8f4
    ldr      x8, [sp, #8]
    mov      w9, #0x4662
    movk     w9, #0xac39, lsl #16
    str      w9, [x8]
    ldr      d0, [sp, #0x20]
    str      d0, [sp, #0x18]
    b        #0x34e8f4
    ldp      x1, x0, [sp, #0x38]
    adrp     x2, #0x54c000
    add      x2, x2, #0x700
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    ldr      x0, [sp, #0x40]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x2, [x8, #0x4a0]
    str      x2, [sp, #0x28]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    ldr      x0, [sp, #0x30]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp, #8]
    mov      w9, #0x4662
    movk     w9, #0xac39, lsl #16
    csel     w9, w20, w9, ne
    str      w9, [x8]
    mov      x8, #0x405a000000000000
    str      x8, [sp, #0x18]
    b        #0x34e8f4
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x330]
    str      x8, [sp, #0x38]
    ldr      x8, [sp, #8]
    mov      w9, #0xf29b
    movk     w9, #0xc7d0, lsl #16
    str      w9, [x8]
    b        #0x34e8f4
    ldp      x1, x0, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    str      d0, [sp, #0x20]
    ldr      x8, [sp, #8]
    mov      w9, #0x5818
    movk     w9, #0x5f28, lsl #16
    str      w9, [x8]
    b        #0x34e8f4
    mov      w9, #0x4662
    movk     w9, #0xac39, lsl #16
    cmp      w8, w9
    b.ne     #0x34e8f4
    ldr      d0, [sp, #0x18]
    adrp     x8, #0x491000
    ldr      d1, [x8, #0x500]
    fcmp     d0, d1
    fcsel    d0, d1, d0, gt
    mov      x8, #0x4050000000000000
    fmov     d1, x8
    fmaxnm   d8, d0, d1
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    fmov     d0, d8
    ldp      x29, x30, [sp, #0xb0]
    ldp      x20, x19, [sp, #0xa0]
    ldp      x22, x21, [sp, #0x90]
    ldp      x24, x23, [sp, #0x80]
    ldp      x26, x25, [sp, #0x70]
    ldp      x28, x27, [sp, #0x60]
    ldp      d9, d8, [sp, #0x50]
    add      sp, sp, #0xc0
    ret      

// -[WCLGHomeGroups setStripPillWidth:] IMP=0x34ED0C bounds=0x34ED0C-0x34F100
loc_34ED0C:
    sub      sp, sp, #0x90
    stp      d9, d8, [sp, #0x20]
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    fmov     d8, d0
    mov      w10, #0xc74b
    movk     w10, #0xd8bc, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x2a0
    ldar     w8, [x8]
    str      w8, [sp, #0x1c]
    mov      w11, #0xd918
    movk     w11, #0x516c, lsl #16
    str      w11, [sp, #0x14]
    add      x8, sp, #0x14
    mov      w26, #0xd917
    movk     w26, #0x516c, lsl #16
    stp      x0, x8, [sp]
    mov      w27, #0xc74a
    movk     w27, #0xd8bc, lsl #16
    mov      w28, #0x5786
    movk     w28, #0x8d09, lsl #16
    adrp     x19, #0x54c000
    add      x19, x19, #0x724
    adrp     x20, #0x54c000
    add      x20, x20, #0x744
    mov      w13, #0x6608
    movk     w13, #0xc471, lsl #16
    adrp     x25, #0x54c000
    add      x25, x25, #0x740
    mov      w23, #0xb28
    movk     w23, #0x6305, lsl #16
    adrp     x8, #0x491000
    ldr      d9, [x8, #0x500]
    mov      w24, #0xb27
    movk     w24, #0x6305, lsl #16
    mov      w14, #0xcaff
    movk     w14, #0x5f41, lsl #16
    mov      w15, #0x98fe
    movk     w15, #0x650e, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w26
    b.le     #0x34edfc
    cmp      w8, w24
    b.gt     #0x34ee68
    cmp      w8, w11
    b.eq     #0x34efe8
    cmp      w8, w14
    b.ne     #0x34edc0
    ldrb     w8, [sp, #0x1b]
    cmp      w8, #0
    csel     w8, w15, w10, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x34edc0
    cmp      w8, w27
    b.gt     #0x34ee90
    cmp      w8, w28
    b.eq     #0x34eeb4
    cmp      w8, w13
    b.ne     #0x34edc0
    ldrb     w8, [sp, #0x1a]
    mov      w9, #0xe9
    eor      w8, w8, w9
    strb     w8, [x25]
    adrp     x9, #0x54c000
    add      x9, x9, #0x721
    ldrb     w8, [x9]
    mov      w12, #0x2f
    eor      w8, w8, w12
    strb     w8, [x25, #1]
    ldrb     w8, [x9, #1]
    mov      w12, #0xb
    eor      w8, w8, w12
    strb     w8, [x25, #2]
    ldrb     w8, [x9, #2]
    mov      w9, #0x23
    eor      w8, w8, w9
    strb     w8, [x25, #3]
    ldr      x8, [sp, #8]
    str      w28, [x8]
    b        #0x34edc0
    cmp      w8, w23
    b.eq     #0x34f004
    cmp      w8, w15
    b.ne     #0x34edc0
    adrp     x8, #0x54c000
    ldrb     w8, [x8, #0x720]
    strb     w8, [sp, #0x1a]
    ldr      x8, [sp, #8]
    str      w13, [x8]
    b        #0x34edc0
    cmp      w8, w10
    b.ne     #0x34f0c0
    adrp     x8, #0x581000
    add      x8, x8, #0x2a0
    mov      w9, #1
    stlr     w9, [x8]
    ldr      x8, [sp, #8]
    str      w23, [x8]
    b        #0x34edc0
    ldrb     w8, [x19]
    mov      w9, #0xa1
    eor      w8, w8, w9
    strb     w8, [x20]
    ldrb     w8, [x19, #1]
    strb     w8, [x20, #1]
    ldrb     w8, [x19, #2]
    eor      w8, w8, #0xfffffff7
    strb     w8, [x20, #2]
    ldrb     w8, [x19, #3]
    eor      w8, w8, #0xfffffffd
    strb     w8, [x20, #3]
    ldrb     w8, [x19, #4]
    mov      w12, #0xb9
    eor      w8, w8, w12
    strb     w8, [x20, #4]
    ldrb     w8, [x19, #5]
    mov      w12, #0xe8
    eor      w8, w8, w12
    strb     w8, [x20, #5]
    ldrb     w8, [x19, #6]
    mov      w12, #0x92
    eor      w8, w8, w12
    strb     w8, [x20, #6]
    ldrb     w8, [x19, #7]
    eor      w8, w8, #0xffffffbf
    strb     w8, [x20, #7]
    ldrb     w8, [x19, #8]
    eor      w8, w8, w9
    strb     w8, [x20, #8]
    ldrb     w8, [x19, #9]
    mov      w9, #0x28
    eor      w8, w8, w9
    strb     w8, [x20, #9]
    ldrb     w8, [x19, #0xa]
    mov      w9, #0x36
    eor      w8, w8, w9
    strb     w8, [x20, #0xa]
    ldrb     w8, [x19, #0xb]
    mov      w9, #0x57
    eor      w8, w8, w9
    strb     w8, [x20, #0xb]
    ldrb     w8, [x19, #0xc]
    eor      w8, w8, #0xffffff81
    strb     w8, [x20, #0xc]
    ldrb     w8, [x19, #0xd]
    eor      w8, w8, #0x7f
    strb     w8, [x20, #0xd]
    ldrb     w8, [x19, #0xe]
    eor      w8, w8, #0x3c
    strb     w8, [x20, #0xe]
    ldrb     w8, [x19, #0xf]
    mov      w9, #0x19
    eor      w8, w8, w9
    strb     w8, [x20, #0xf]
    ldrb     w8, [x19, #0x10]
    mov      w9, #0xea
    eor      w8, w8, w9
    strb     w8, [x20, #0x10]
    ldrb     w8, [x19, #0x11]
    mov      w9, #0xaf
    eor      w8, w8, w9
    strb     w8, [x20, #0x11]
    ldrb     w8, [x19, #0x12]
    mov      w9, #0xdb
    eor      w8, w8, w9
    strb     w8, [x20, #0x12]
    ldrb     w8, [x19, #0x13]
    mov      w9, #0x72
    eor      w8, w8, w9
    strb     w8, [x20, #0x13]
    ldrb     w8, [x19, #0x14]
    eor      w8, w8, #0xf8
    strb     w8, [x20, #0x14]
    ldr      x8, [sp, #8]
    str      w10, [x8]
    b        #0x34edc0
    ldr      w8, [sp, #0x1c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x1b]
    ldr      x8, [sp, #8]
    str      w14, [x8]
    b        #0x34edc0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    fcmp     d8, d9
    fcsel    d0, d9, d8, gt
    mov      x8, #0x4050000000000000
    fmov     d1, x8
    fmaxnm   d0, d0, d1
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x498]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    mov      x0, x21
    mov      x2, x22
    adrp     x3, #0x54c000
    add      x3, x3, #0x780
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      w15, #0x98fe
    movk     w15, #0x650e, lsl #16
    mov      w14, #0xcaff
    movk     w14, #0x5f41, lsl #16
    mov      w13, #0x6608
    movk     w13, #0xc471, lsl #16
    mov      w11, #0xd918
    movk     w11, #0x516c, lsl #16
    mov      w10, #0xc74b
    movk     w10, #0xd8bc, lsl #16
    ldr      x8, [sp, #8]
    mov      w9, #0xcae8
    movk     w9, #0xf26e, lsl #16
    str      w9, [x8]
    b        #0x34edc0
    mov      w9, #0xcae8
    movk     w9, #0xf26e, lsl #16
    cmp      w8, w9
    b.ne     #0x34edc0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp]
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    ldp      d9, d8, [sp, #0x20]
    add      sp, sp, #0x90
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups stripVerticalOffset] IMP=0x34F100 bounds=0x34F100-0x34F660
loc_34F100:
    sub      sp, sp, #0xd0
    stp      d9, d8, [sp, #0x60]
    stp      x28, x27, [sp, #0x70]
    stp      x26, x25, [sp, #0x80]
    stp      x24, x23, [sp, #0x90]
    stp      x22, x21, [sp, #0xa0]
    stp      x20, x19, [sp, #0xb0]
    stp      x29, x30, [sp, #0xc0]
    add      x29, sp, #0xc0
    adrp     x8, #0x581000
    add      x8, x8, #0x2a4
    ldar     w8, [x8]
    str      w8, [sp, #0x5c]
    mov      w9, #0xc7c8
    movk     w9, #0xf36a, lsl #16
    add      x8, sp, #0x14
    str      w9, [sp, #0x14]
    mov      w24, #0x9669
    movk     w24, #0xeca7, lsl #16
    mov      w25, #0x5872
    movk     w25, #0x8f53, lsl #16
    str      x8, [sp, #8]
    adrp     x27, #0x54c000
    add      x27, x27, #0x7a0
    adrp     x22, #0x54c000
    add      x22, x22, #0x7d0
    mov      w21, #0x5873
    movk     w21, #0x8f53, lsl #16
    mov      w28, #0xe782
    movk     w28, #0x1dc, lsl #16
    mov      w20, #0xe781
    movk     w20, #0x1dc, lsl #16
    mov      w26, #0x966a
    movk     w26, #0xeca7, lsl #16
    adrp     x23, #0x54c000
    add      x23, x23, #0x7eb
    adrp     x19, #0x54c000
    add      x19, x19, #0x7bc
    ldr      w8, [sp, #0x14]
    cmp      w8, w24
    b.le     #0x34f218
    cmp      w8, w20
    b.gt     #0x34f278
    cmp      w8, w26
    b.eq     #0x34f378
    mov      w9, #0xc7c8
    movk     w9, #0xf36a, lsl #16
    cmp      w8, w9
    b.eq     #0x34f5d8
    mov      w9, #0xdcaa
    movk     w9, #0xf729, lsl #16
    cmp      w8, w9
    b.ne     #0x34f198
    ldp      x1, x0, [sp, #0x38]
    bl       #0x461c6c // _objc_msgSend
    mov      x8, #0x405e000000000000
    fmov     d1, x8
    fcmp     d0, d1
    fcsel    d0, d1, d0, gt
    str      d0, [sp, #0x30]
    mov      x8, #-0x3fbc000000000000
    fmov     d1, x8
    fcmp     d0, d1
    cset     w8, gt
    strb     w8, [sp, #0x2f]
    ldr      x8, [sp, #8]
    mov      w9, #0xeb17
    movk     w9, #0x9280, lsl #16
    str      w9, [x8]
    b        #0x34f198
    cmp      w8, w25
    b.le     #0x34f31c
    cmp      w8, w21
    b.eq     #0x34f350
    mov      w9, #0xeb17
    movk     w9, #0x9280, lsl #16
    cmp      w8, w9
    b.eq     #0x34f5b0
    mov      w9, #0xf43a
    movk     w9, #0xac55, lsl #16
    cmp      w8, w9
    b.ne     #0x34f198
    adrp     x8, #0x581000
    add      x8, x8, #0x2a4
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x60]
    str      x8, [sp, #0x50]
    ldr      x8, [sp, #8]
    mov      w9, #0x4c87
    movk     w9, #0x3c67, lsl #16
    str      w9, [x8]
    b        #0x34f198
    cmp      w8, w28
    b.eq     #0x34f3e8
    mov      w9, #0x4c87
    movk     w9, #0x3c67, lsl #16
    cmp      w8, w9
    b.eq     #0x34f5f4
    mov      w9, #0x7ce4
    movk     w9, #0x3c6a, lsl #16
    cmp      w8, w9
    b.ne     #0x34f198
    ldrb     w8, [sp, #0x5a]
    strb     w8, [x23]
    ldrb     w8, [x19]
    mov      w9, #0x90
    eor      w8, w8, w9
    strb     w8, [x23, #1]
    ldrb     w8, [x19, #1]
    mov      w9, #0x39
    eor      w8, w8, w9
    strb     w8, [x23, #2]
    ldrb     w8, [x19, #2]
    mov      w9, #0x6d
    eor      w8, w8, w9
    strb     w8, [x23, #3]
    ldrb     w8, [x19, #3]
    mov      w9, #0xab
    eor      w8, w8, w9
    strb     w8, [x23, #4]
    ldrb     w8, [x19, #4]
    mov      w9, #0x12
    eor      w8, w8, w9
    strb     w8, [x23, #5]
    ldrb     w8, [x19, #5]
    mov      w9, #0x28
    eor      w8, w8, w9
    strb     w8, [x23, #6]
    ldr      x8, [sp, #8]
    mov      w9, #0x8c09
    movk     w9, #0x8dc4, lsl #16
    str      w9, [x8]
    b        #0x34f198
    mov      w9, #0x99
    movk     w9, #0x866a, lsl #16
    cmp      w8, w9
    b.eq     #0x34f404
    mov      w9, #0x8c09
    movk     w9, #0x8dc4, lsl #16
    cmp      w8, w9
    b.ne     #0x34f61c
    ldr      x8, [sp, #8]
    mov      w9, #0xf43a
    movk     w9, #0xac55, lsl #16
    str      w9, [x8]
    b        #0x34f198
    ldrb     w8, [sp, #0x5b]
    cmp      w8, #0
    mov      w8, #0xf43a
    movk     w8, #0xac55, lsl #16
    mov      w9, #0x99
    movk     w9, #0x866a, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x34f198
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    ldr      x0, [sp, #0x48]
    adrp     x2, #0x54c000
    add      x2, x2, #0x820
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x40]
    ldr      x0, [sp, #0x48]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x2, [x8, #0x4a0]
    str      x2, [sp, #0x38]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    ldr      x0, [sp, #0x40]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp, #8]
    mov      w9, #0xdcdc
    movk     w9, #0x84cf, lsl #16
    mov      w10, #0xdcaa
    movk     w10, #0xf729, lsl #16
    csel     w9, w10, w9, ne
    str      w9, [x8]
    str      xzr, [sp, #0x18]
    b        #0x34f198
    ldr      x8, [sp, #8]
    mov      w9, #0xdcdc
    movk     w9, #0x84cf, lsl #16
    str      w9, [x8]
    ldr      d0, [sp, #0x20]
    str      d0, [sp, #0x18]
    b        #0x34f198
    ldrb     w8, [x27]
    mov      w9, #0xb8
    eor      w8, w8, w9
    strb     w8, [x22]
    ldrb     w8, [x27, #1]
    eor      w8, w8, #0x80
    strb     w8, [x22, #1]
    ldrb     w8, [x27, #2]
    eor      w8, w8, #0x1c
    strb     w8, [x22, #2]
    ldrb     w8, [x27, #3]
    mov      w9, #0x91
    eor      w8, w8, w9
    strb     w8, [x22, #3]
    ldrb     w8, [x27, #4]
    eor      w8, w8, #0x3c
    strb     w8, [x22, #4]
    ldrb     w8, [x27, #5]
    eor      w8, w8, #0x3e
    strb     w8, [x22, #5]
    ldrb     w8, [x27, #6]
    mov      w9, #0x45
    eor      w8, w8, w9
    strb     w8, [x22, #6]
    ldrb     w8, [x27, #7]
    mov      w9, #0x72
    eor      w8, w8, w9
    strb     w8, [x22, #7]
    ldrb     w8, [x27, #8]
    mov      w9, #0x4b
    eor      w8, w8, w9
    strb     w8, [x22, #8]
    ldrb     w8, [x27, #9]
    eor      w8, w8, #0xfc
    strb     w8, [x22, #9]
    ldrb     w8, [x27, #0xa]
    mov      w9, #0xcb
    eor      w8, w8, w9
    strb     w8, [x22, #0xa]
    ldrb     w8, [x27, #0xb]
    mov      w9, #0xeb
    eor      w8, w8, w9
    strb     w8, [x22, #0xb]
    ldrb     w8, [x27, #0xc]
    eor      w8, w8, #0xc
    strb     w8, [x22, #0xc]
    ldrb     w8, [x27, #0xd]
    eor      w8, w8, #0xffffffe7
    strb     w8, [x22, #0xd]
    ldrb     w8, [x27, #0xe]
    mov      w9, #0x2b
    eor      w8, w8, w9
    strb     w8, [x22, #0xe]
    ldrb     w8, [x27, #0xf]
    mov      w9, #0xf5
    eor      w8, w8, w9
    strb     w8, [x22, #0xf]
    ldrb     w8, [x27, #0x10]
    eor      w8, w8, #0xffffffe1
    strb     w8, [x22, #0x10]
    ldrb     w8, [x27, #0x11]
    eor      w8, w8, #0xc
    strb     w8, [x22, #0x11]
    ldrb     w8, [x27, #0x12]
    mov      w9, #0xae
    eor      w8, w8, w9
    strb     w8, [x22, #0x12]
    ldrb     w8, [x27, #0x13]
    mov      w9, #0xac
    eor      w8, w8, w9
    strb     w8, [x22, #0x13]
    ldrb     w8, [x27, #0x14]
    mov      w9, #0xb
    eor      w8, w8, w9
    strb     w8, [x22, #0x14]
    ldrb     w8, [x27, #0x15]
    mov      w9, #0xce
    eor      w8, w8, w9
    strb     w8, [x22, #0x15]
    ldrb     w8, [x27, #0x16]
    mov      w9, #0xa4
    eor      w8, w8, w9
    strb     w8, [x22, #0x16]
    ldrb     w8, [x27, #0x17]
    mov      w9, #0x9d
    eor      w8, w8, w9
    strb     w8, [x22, #0x17]
    ldrb     w8, [x27, #0x18]
    mov      w9, #0x4c
    eor      w8, w8, w9
    strb     w8, [x22, #0x18]
    ldrb     w8, [x27, #0x19]
    eor      w8, w8, #4
    strb     w8, [x22, #0x19]
    ldrb     w8, [x27, #0x1a]
    mov      w9, #0x82
    eor      w8, w8, w9
    strb     w8, [x22, #0x1a]
    ldrb     w8, [x27, #0x1b]
    mov      w9, #0xbc
    eor      w8, w8, w9
    strb     w8, [sp, #0x5a]
    ldr      x8, [sp, #8]
    mov      w9, #0x7ce4
    movk     w9, #0x3c6a, lsl #16
    str      w9, [x8]
    b        #0x34f198
    ldr      d0, [sp, #0x30]
    ldrb     w8, [sp, #0x2f]
    cmp      w8, #0
    mov      x8, #-0x3fbc000000000000
    fmov     d1, x8
    fcsel    d0, d0, d1, ne
    str      d0, [sp, #0x20]
    ldr      x8, [sp, #8]
    str      w28, [x8]
    b        #0x34f198
    ldr      w8, [sp, #0x5c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x5b]
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x34f198
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    ldr      x0, [sp, #0x50]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x48]
    ldr      x8, [sp, #8]
    str      w26, [x8]
    b        #0x34f198
    mov      w9, #0xdcdc
    movk     w9, #0x84cf, lsl #16
    cmp      w8, w9
    b.ne     #0x34f198
    ldr      d8, [sp, #0x18]
    ldr      x0, [sp, #0x40]
    bl       #0x461c9c // _objc_release
    fmov     d0, d8
    ldp      x29, x30, [sp, #0xc0]
    ldp      x20, x19, [sp, #0xb0]
    ldp      x22, x21, [sp, #0xa0]
    ldp      x24, x23, [sp, #0x90]
    ldp      x26, x25, [sp, #0x80]
    ldp      x28, x27, [sp, #0x70]
    ldp      d9, d8, [sp, #0x60]
    add      sp, sp, #0xd0
    ret      

// -[WCLGHomeGroups setStripVerticalOffset:] IMP=0x34F660 bounds=0x34F660-0x34FAF4
loc_34F660:
    sub      sp, sp, #0xb0
    stp      d9, d8, [sp, #0x40]
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    fmov     d8, d0
    mov      w21, #0x52a3
    movk     w21, #0x22ec, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x2a8
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w8, #0x37a6
    movk     w8, #0xd320, lsl #16
    str      w8, [sp, #0x1c]
    add      x8, sp, #0x1c
    mov      w24, #0x974a
    movk     w24, #0x1162, lsl #16
    stp      x0, x8, [sp, #8]
    mov      w25, #0x37a5
    movk     w25, #0xd320, lsl #16
    mov      w26, #0x713f
    movk     w26, #0xc8f7, lsl #16
    adrp     x22, #0x54c000
    add      x22, x22, #0x840
    adrp     x27, #0x54c000
    add      x27, x27, #0x870
    mov      w28, #0x974b
    movk     w28, #0x1162, lsl #16
    mov      w19, #0x3a61
    movk     w19, #0x61e0, lsl #16
    adrp     x23, #0x54c000
    add      x23, x23, #0x87f
    adrp     x20, #0x54c000
    add      x20, x20, #0x850
    ldr      w8, [sp, #0x1c]
    cmp      w8, w24
    b.gt     #0x34f828
    cmp      w8, w25
    b.gt     #0x34f8d8
    cmp      w8, w26
    b.eq     #0x34fa6c
    mov      w9, #0xd245
    movk     w9, #0xcb04, lsl #16
    cmp      w8, w9
    b.ne     #0x34f6fc
    ldrb     w8, [x22]
    mov      w9, #0x5e
    eor      w8, w8, w9
    strb     w8, [x27]
    ldrb     w8, [x22, #1]
    eor      w8, w8, #0x30
    strb     w8, [x27, #1]
    ldrb     w8, [x22, #2]
    mov      w9, #0xe4
    eor      w8, w8, w9
    strb     w8, [x27, #2]
    ldrb     w8, [x22, #3]
    mov      w9, #0xd6
    eor      w8, w8, w9
    strb     w8, [x27, #3]
    ldrb     w8, [x22, #4]
    mov      w9, #0x5f
    eor      w8, w8, w9
    strb     w8, [x27, #4]
    ldrb     w8, [x22, #5]
    eor      w8, w8, #0x40
    strb     w8, [x27, #5]
    ldrb     w8, [x22, #6]
    mov      w9, #0xb9
    eor      w8, w8, w9
    strb     w8, [x27, #6]
    ldrb     w8, [x22, #7]
    mov      w9, #0x54
    eor      w8, w8, w9
    strb     w8, [x27, #7]
    ldrb     w8, [x22, #8]
    mov      w9, #0x6f
    eor      w8, w8, w9
    strb     w8, [x27, #8]
    ldrb     w8, [x22, #9]
    mov      w9, #0xb7
    eor      w8, w8, w9
    strb     w8, [x27, #9]
    ldrb     w8, [x22, #0xa]
    mov      w9, #0x68
    eor      w8, w8, w9
    strb     w8, [x27, #0xa]
    ldrb     w8, [x22, #0xb]
    eor      w8, w8, #0x77777777
    strb     w8, [x27, #0xb]
    ldrb     w8, [x22, #0xc]
    mov      w9, #0xed
    eor      w8, w8, w9
    strb     w8, [x27, #0xc]
    ldrb     w8, [x22, #0xd]
    mov      w9, #0x50
    eor      w8, w8, w9
    strb     w8, [x27, #0xd]
    ldrb     w8, [x22, #0xe]
    mov      w9, #0x17
    eor      w8, w8, w9
    strb     w8, [x27, #0xe]
    ldrb     w8, [x22, #0xf]
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x3a62
    movk     w9, #0x61e0, lsl #16
    str      w9, [x8]
    b        #0x34f6fc
    cmp      w8, w19
    b.gt     #0x34f928
    cmp      w8, w28
    b.eq     #0x34fa4c
    cmp      w8, w21
    b.ne     #0x34f6fc
    adrp     x8, #0x581000
    add      x8, x8, #0x2a8
    mov      w9, #1
    stlr     w9, [x8]
    mov      x8, #0x405e000000000000
    fmov     d0, x8
    fcmp     d8, d0
    fcsel    d0, d0, d8, gt
    mov      x8, #-0x3fbc000000000000
    fmov     d1, x8
    fmaxnm   d9, d0, d1
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x498]
    fmov     d0, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    str      x0, [sp, #0x28]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    ldr      x0, [sp, #0x30]
    adrp     x3, #0x54c000
    add      x3, x3, #0x8c0
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x10]
    str      w26, [x8]
    b        #0x34f6fc
    mov      w9, #0x37a6
    movk     w9, #0xd320, lsl #16
    cmp      w8, w9
    b.eq     #0x34fa9c
    mov      w9, #0xe18e
    movk     w9, #0xe89c, lsl #16
    cmp      w8, w9
    b.ne     #0x34f6fc
    ldrb     w8, [sp, #0x39]
    adrp     x9, #0x54c000
    add      x9, x9, #0x890
    strb     w8, [x9]
    adrp     x8, #0x54c000
    ldrb     w8, [x8, #0x861]
    mov      w10, #0x31
    eor      w8, w8, w10
    strb     w8, [x9, #1]
    ldr      x8, [sp, #0x10]
    str      w21, [x8]
    b        #0x34f6fc
    mov      w9, #0x3a62
    movk     w9, #0x61e0, lsl #16
    cmp      w8, w9
    b.ne     #0x34fab8
    ldrb     w8, [sp, #0x3a]
    mov      w9, #0x48
    eor      w8, w8, w9
    strb     w8, [x23]
    ldrb     w8, [x20]
    eor      w8, w8, #0xf0
    strb     w8, [x23, #1]
    ldrb     w8, [x20, #1]
    mov      w10, #0x74
    eor      w8, w8, w10
    strb     w8, [x23, #2]
    ldrb     w8, [x20, #2]
    mov      w10, #0x42
    eor      w8, w8, w10
    strb     w8, [x23, #3]
    ldrb     w8, [x20, #3]
    mov      w10, #0x69
    eor      w8, w8, w10
    strb     w8, [x23, #4]
    ldrb     w8, [x20, #4]
    mov      w10, #0xbe
    eor      w8, w8, w10
    strb     w8, [x23, #5]
    ldrb     w8, [x20, #5]
    mvn      w8, w8
    strb     w8, [x23, #6]
    ldrb     w8, [x20, #6]
    mov      w10, #0x5d
    eor      w8, w8, w10
    strb     w8, [x23, #7]
    ldrb     w8, [x20, #7]
    eor      w8, w8, #0xffffffe3
    strb     w8, [x23, #8]
    ldrb     w8, [x20, #8]
    mov      w10, #0x4f
    eor      w8, w8, w10
    strb     w8, [x23, #9]
    ldrb     w8, [x20, #9]
    eor      w8, w8, #0xaaaaaaaa
    strb     w8, [x23, #0xa]
    ldrb     w8, [x20, #0xa]
    eor      w8, w8, #1
    strb     w8, [x23, #0xb]
    ldrb     w8, [x20, #0xb]
    mov      w10, #0x2d
    eor      w8, w8, w10
    strb     w8, [x23, #0xc]
    ldrb     w8, [x20, #0xc]
    mov      w10, #0xa
    eor      w8, w8, w10
    strb     w8, [x23, #0xd]
    ldrb     w8, [x20, #0xd]
    eor      w8, w8, #0xffffffbf
    strb     w8, [x23, #0xe]
    ldrb     w8, [x20, #0xe]
    eor      w8, w8, w9
    strb     w8, [x23, #0xf]
    ldrb     w8, [x20, #0xf]
    mov      w9, #0x62
    eor      w8, w8, w9
    strb     w8, [x23, #0x10]
    ldrb     w8, [x20, #0x10]
    eor      w8, w8, #0xffffff9f
    strb     w8, [sp, #0x39]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xe18e
    movk     w9, #0xe89c, lsl #16
    str      w9, [x8]
    b        #0x34f6fc
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    mov      w8, #0xd245
    movk     w8, #0xcb04, lsl #16
    csel     w8, w8, w21, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x34f6fc
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xf28]
    str      x8, [sp, #0x20]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x98e8
    movk     w9, #0x78b1, lsl #16
    str      w9, [x8]
    b        #0x34f6fc
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp, #0x10]
    str      w28, [x8]
    b        #0x34f6fc
    mov      w9, #0x98e8
    movk     w9, #0x78b1, lsl #16
    cmp      w8, w9
    b.ne     #0x34f6fc
    ldr      x1, [sp, #0x20]
    ldr      x0, [sp, #8]
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    ldp      d9, d8, [sp, #0x40]
    add      sp, sp, #0xb0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups defaultExpandedGroupID] IMP=0x34FAF4 bounds=0x34FAF4-0x34FFDC
loc_34FAF4:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      w21, #0x2906
    movk     w21, #0x1fd6, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x2ac
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w9, #0x3c08
    movk     w9, #0x82a7, lsl #16
    add      x8, sp, #0xc
    str      w9, [sp, #0xc]
    mov      w24, #0x8a96
    movk     w24, #0xe7f2, lsl #16
    mov      w25, #0xd77d
    movk     w25, #0x9971, lsl #16
    str      x8, [sp]
    mov      w22, #0x8a97
    movk     w22, #0xe7f2, lsl #16
    adrp     x26, #0x54c000
    add      x26, x26, #0x8e2
    adrp     x20, #0x54c000
    add      x20, x20, #0x902
    mov      w23, #0x90b3
    movk     w23, #0x69, lsl #16
    mov      w27, #0x2905
    movk     w27, #0x1fd6, lsl #16
    adrp     x28, #0x54c000
    add      x28, x28, #0x90e
    adrp     x19, #0x54c000
    add      x19, x19, #0x8ef
    ldr      w8, [sp, #0xc]
    cmp      w8, w24
    b.le     #0x34fbd0
    cmp      w8, w27
    b.gt     #0x34fc28
    cmp      w8, w22
    b.eq     #0x34fd80
    cmp      w8, w23
    b.eq     #0x34fe7c
    mov      w9, #0x2081
    movk     w9, #0x14c3, lsl #16
    cmp      w8, w9
    b.ne     #0x34fb88
    ldr      x8, [sp]
    mov      w9, #0xd77e
    movk     w9, #0x9971, lsl #16
    str      w9, [x8]
    b        #0x34fb88
    cmp      w8, w25
    b.gt     #0x34fc78
    mov      w9, #0x3c08
    movk     w9, #0x82a7, lsl #16
    cmp      w8, w9
    b.eq     #0x34fd5c
    mov      w9, #0x86f2
    movk     w9, #0x86b2, lsl #16
    cmp      w8, w9
    b.eq     #0x34fe64
    mov      w9, #0xc8d0
    movk     w9, #0x9592, lsl #16
    cmp      w8, w9
    b.ne     #0x34fb88
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    mov      w8, #0x94e2
    movk     w8, #0x6ebf, lsl #16
    csel     w8, w8, w21, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x34fb88
    cmp      w8, w21
    b.eq     #0x34fda8
    mov      w9, #0x94e2
    movk     w9, #0x6ebf, lsl #16
    cmp      w8, w9
    b.eq     #0x34ff58
    mov      w9, #0x5ff
    movk     w9, #0x74b8, lsl #16
    cmp      w8, w9
    b.ne     #0x34fb88
    ldr      x8, [sp, #0x28]
    ldrb     w9, [sp, #0x1f]
    cmp      w9, #0
    csel     x8, xzr, x8, ne
    ldr      x9, [sp]
    mov      w10, #0xb7ba
    movk     w10, #0xab0c, lsl #16
    str      w10, [x9]
    str      x8, [sp, #0x10]
    b        #0x34fb88
    mov      w9, #0xd77e
    movk     w9, #0x9971, lsl #16
    cmp      w8, w9
    b.eq     #0x34fe0c
    mov      w9, #0xbcf0
    movk     w9, #0xbf48, lsl #16
    cmp      w8, w9
    b.ne     #0x34ff94
    ldrb     w8, [x26]
    eor      w8, w8, #0xffffffe7
    strb     w8, [x20]
    ldrb     w8, [x26, #1]
    eor      w8, w8, #0xffffffe3
    strb     w8, [x20, #1]
    ldrb     w8, [x26, #2]
    mov      w9, #5
    eor      w8, w8, w9
    strb     w8, [x20, #2]
    ldrb     w8, [x26, #3]
    mov      w9, #0xd3
    eor      w8, w8, w9
    strb     w8, [x20, #3]
    ldrb     w8, [x26, #4]
    mov      w9, #0xf2
    eor      w8, w8, w9
    strb     w8, [x20, #4]
    ldrb     w8, [x26, #5]
    mov      w9, #0xc6
    eor      w8, w8, w9
    strb     w8, [x20, #5]
    ldrb     w8, [x26, #6]
    eor      w8, w8, #0xffffffef
    strb     w8, [x20, #6]
    ldrb     w8, [x26, #7]
    mov      w9, #0xb0
    eor      w8, w8, w9
    strb     w8, [x20, #7]
    ldrb     w8, [x26, #8]
    eor      w8, w8, #0xfe
    strb     w8, [x20, #8]
    ldrb     w8, [x26, #9]
    mov      w9, #0x14
    eor      w8, w8, w9
    strb     w8, [x20, #9]
    ldrb     w8, [x26, #0xa]
    mov      w9, #0xd2
    eor      w8, w8, w9
    strb     w8, [x20, #0xa]
    ldrb     w8, [x26, #0xb]
    mov      w9, #0xa7
    eor      w8, w8, w9
    strb     w8, [x20, #0xb]
    ldrb     w8, [x26, #0xc]
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp]
    str      w23, [x8]
    b        #0x34fb88
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp]
    mov      w9, #0xc8d0
    movk     w9, #0x9592, lsl #16
    str      w9, [x8]
    b        #0x34fb88
    ldp      x1, x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    cset     w8, eq
    strb     w8, [sp, #0x1f]
    ldr      x8, [sp]
    mov      w9, #0x5ff
    movk     w9, #0x74b8, lsl #16
    str      w9, [x8]
    b        #0x34fb88
    adrp     x8, #0x581000
    add      x8, x8, #0x2ac
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    adrp     x2, #0x54c000
    add      x2, x2, #0x940
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    ldr      x8, [sp]
    mov      w9, #0x2081
    movk     w9, #0x14c3, lsl #16
    str      w9, [x8]
    b        #0x34fb88
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    ldr      x0, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp]
    mov      w9, #0xb7ba
    movk     w9, #0xab0c, lsl #16
    mov      w10, #0x86f2
    movk     w10, #0x86b2, lsl #16
    csel     w9, w10, w9, ne
    str      w9, [x8]
    str      xzr, [sp, #0x10]
    b        #0x34fb88
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x338]
    str      x8, [sp, #0x20]
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x34fb88
    ldrb     w8, [sp, #0x3a]
    eor      w8, w8, #0x7f
    strb     w8, [x28]
    ldrb     w8, [x19]
    mov      w9, #0xbc
    eor      w8, w8, w9
    strb     w8, [x28, #1]
    ldrb     w8, [x19, #1]
    mov      w9, #0x67
    eor      w8, w8, w9
    strb     w8, [x28, #2]
    ldrb     w8, [x19, #2]
    eor      w8, w8, #0x44444444
    strb     w8, [x28, #3]
    ldrb     w8, [x19, #3]
    eor      w8, w8, #0xfffffff3
    strb     w8, [x28, #4]
    ldrb     w8, [x19, #4]
    eor      w8, w8, #0xcccccccc
    strb     w8, [x28, #5]
    ldrb     w8, [x19, #5]
    mov      w9, #0xc9
    eor      w8, w8, w9
    strb     w8, [x28, #6]
    ldrb     w8, [x19, #6]
    mov      w9, #0xad
    eor      w8, w8, w9
    strb     w8, [x28, #7]
    ldrb     w8, [x19, #7]
    mov      w9, #0x41
    eor      w8, w8, w9
    strb     w8, [x28, #8]
    ldrb     w8, [x19, #8]
    mov      w9, #0x28
    eor      w8, w8, w9
    strb     w8, [x28, #9]
    ldrb     w8, [x19, #9]
    mov      w9, #0xd0
    eor      w8, w8, w9
    strb     w8, [x28, #0xa]
    ldrb     w8, [x19, #0xa]
    mov      w9, #0x2e
    eor      w8, w8, w9
    strb     w8, [x28, #0xb]
    ldrb     w8, [x19, #0xb]
    mov      w9, #0xcb
    eor      w8, w8, w9
    strb     w8, [x28, #0xc]
    ldrb     w8, [x19, #0xc]
    mov      w9, #0x6a
    eor      w8, w8, w9
    strb     w8, [x28, #0xd]
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x34fb88
    adrp     x9, #0x54c000
    add      x9, x9, #0x8e0
    ldrb     w8, [x9]
    eor      w8, w8, #0x78
    adrp     x10, #0x54c000
    add      x10, x10, #0x900
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    eor      w8, w8, #0xfe
    strb     w8, [x10, #1]
    ldr      x8, [sp]
    mov      w9, #0xbcf0
    movk     w9, #0xbf48, lsl #16
    str      w9, [x8]
    b        #0x34fb88
    mov      w9, #0xb7ba
    movk     w9, #0xab0c, lsl #16
    cmp      w8, w9
    b.ne     #0x34fb88
    ldr      x19, [sp, #0x10]
    mov      x0, x19
    bl       #0x461cc0 // _objc_retainAutoreleaseReturnValue
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    ret      

// -[WCLGHomeGroups setDefaultExpandedGroupID:] IMP=0x34FFDC bounds=0x34FFDC-0x350418
loc_34FFDC:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    stp      x0, x2, [sp]
    mov      w21, #0x56d4
    movk     w21, #0x1aea, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x2b0
    ldar     w8, [x8]
    str      w8, [sp, #0x2c]
    mov      w22, #0xfd34
    movk     w22, #0xe10b, lsl #16
    str      w22, [sp, #0x18]
    add      x8, sp, #0x18
    mov      w26, #0x2a83
    movk     w26, #0x554, lsl #16
    str      x8, [sp, #0x10]
    adrp     x28, #0x54c000
    add      x28, x28, #0x98a
    adrp     x24, #0x54c000
    add      x24, x24, #0x96b
    adrp     x25, #0x54c000
    add      x25, x25, #0x98f
    adrp     x19, #0x54c000
    add      x19, x19, #0x970
    mov      w27, #0x56d3
    movk     w27, #0x1aea, lsl #16
    adrp     x20, #0x54c000
    add      x20, x20, #0x960
    adrp     x23, #0x54c000
    add      x23, x23, #0x980
    ldr      w8, [sp, #0x18]
    cmp      w8, w26
    b.le     #0x350150
    cmp      w8, w27
    b.gt     #0x350234
    mov      w9, #0x2a84
    movk     w9, #0x554, lsl #16
    cmp      w8, w9
    b.eq     #0x350318
    mov      w9, #0xc3cd
    movk     w9, #0x13f0, lsl #16
    cmp      w8, w9
    b.ne     #0x35006c
    ldrb     w8, [x20]
    mov      w9, #0xd5
    eor      w8, w8, w9
    strb     w8, [x23]
    ldrb     w8, [x20, #1]
    mov      w9, #0x2d
    eor      w8, w8, w9
    strb     w8, [x23, #1]
    ldrb     w8, [x20, #2]
    eor      w8, w8, #0x3f
    strb     w8, [x23, #2]
    ldrb     w8, [x20, #3]
    eor      w8, w8, #0x3f
    strb     w8, [x23, #3]
    ldrb     w8, [x20, #4]
    mov      w9, #0x64
    eor      w8, w8, w9
    strb     w8, [x23, #4]
    ldrb     w8, [x20, #5]
    mov      w9, #0x62
    eor      w8, w8, w9
    strb     w8, [x23, #5]
    ldrb     w8, [x20, #6]
    mvn      w8, w8
    strb     w8, [x23, #6]
    ldrb     w8, [x20, #7]
    mov      w9, #0xbd
    eor      w8, w8, w9
    strb     w8, [x23, #7]
    ldrb     w8, [x20, #8]
    eor      w8, w8, #0xf0
    strb     w8, [x23, #8]
    ldrb     w8, [x20, #9]
    eor      w8, w8, #0x22222222
    strb     w8, [x23, #9]
    ldrb     w8, [x20, #0xa]
    mov      w9, #0xac
    eor      w8, w8, w9
    strb     w8, [sp, #0x2a]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xc549
    movk     w9, #0xb24e, lsl #16
    str      w9, [x8]
    b        #0x35006c
    mov      w9, #0xfd33
    movk     w9, #0xe10b, lsl #16
    cmp      w8, w9
    b.le     #0x35027c
    cmp      w8, w22
    b.eq     #0x3502f4
    mov      w9, #0xa107
    movk     w9, #0xe939, lsl #16
    cmp      w8, w9
    b.ne     #0x35006c
    ldrb     w8, [sp, #0x29]
    strb     w8, [x25]
    ldrb     w8, [x19]
    mov      w9, #0x93
    eor      w8, w8, w9
    strb     w8, [x25, #1]
    ldrb     w8, [x19, #1]
    eor      w8, w8, #0x77777777
    strb     w8, [x25, #2]
    ldrb     w8, [x19, #2]
    eor      w8, w8, #0xbbbbbbbb
    strb     w8, [x25, #3]
    ldrb     w8, [x19, #3]
    strb     w8, [x25, #4]
    ldrb     w8, [x19, #4]
    mov      w9, #0x15
    eor      w8, w8, w9
    strb     w8, [x25, #5]
    ldrb     w8, [x19, #5]
    mov      w9, #0xb8
    eor      w8, w8, w9
    strb     w8, [x25, #6]
    ldrb     w8, [x19, #6]
    mov      w9, #0x4e
    eor      w8, w8, w9
    strb     w8, [x25, #7]
    ldrb     w8, [x19, #7]
    eor      w8, w8, #7
    strb     w8, [x25, #8]
    ldrb     w8, [x19, #8]
    eor      w8, w8, #0x77777777
    strb     w8, [x25, #9]
    ldrb     w8, [x19, #9]
    mov      w9, #0x2b
    eor      w8, w8, w9
    strb     w8, [x25, #0xa]
    ldrb     w8, [x19, #0xa]
    mov      w9, #0x2d
    eor      w8, w8, w9
    strb     w8, [x25, #0xb]
    ldrb     w8, [x19, #0xb]
    mov      w9, #0x37
    eor      w8, w8, w9
    strb     w8, [x25, #0xc]
    ldr      x8, [sp, #0x10]
    str      w21, [x8]
    b        #0x35006c
    cmp      w8, w21
    b.eq     #0x350338
    mov      w9, #0xab51
    movk     w9, #0x4e40, lsl #16
    cmp      w8, w9
    b.ne     #0x35006c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    ldr      x0, [sp, #8]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    cset     w8, eq
    strb     w8, [sp, #0x1f]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x71f5
    movk     w9, #0xb023, lsl #16
    str      w9, [x8]
    b        #0x35006c
    mov      w9, #0xc549
    movk     w9, #0xb24e, lsl #16
    cmp      w8, w9
    b.ne     #0x35039c
    ldrb     w8, [sp, #0x2a]
    strb     w8, [x28]
    ldrb     w8, [x24]
    mov      w9, #0x93
    eor      w8, w8, w9
    strb     w8, [x28, #1]
    ldrb     w8, [x24, #1]
    mov      w9, #0x76
    eor      w8, w8, w9
    strb     w8, [x28, #2]
    ldrb     w8, [x24, #2]
    mov      w9, #0xbc
    eor      w8, w8, w9
    strb     w8, [x28, #3]
    ldrb     w8, [x24, #3]
    eor      w8, w8, #0x99999999
    strb     w8, [x28, #4]
    ldrb     w8, [x24, #4]
    mov      w9, #0x79
    eor      w8, w8, w9
    strb     w8, [sp, #0x29]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xa107
    movk     w9, #0xe939, lsl #16
    str      w9, [x8]
    b        #0x35006c
    ldr      w8, [sp, #0x2c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x2b]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x2a84
    movk     w9, #0x554, lsl #16
    str      w9, [x8]
    b        #0x35006c
    ldrb     w8, [sp, #0x2b]
    cmp      w8, #0
    mov      w8, #0xc3cd
    movk     w8, #0x13f0, lsl #16
    csel     w8, w8, w21, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x35006c
    adrp     x8, #0x581000
    add      x8, x8, #0x2b0
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x308]
    ldr      x0, [sp, #8]
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    mov      w21, #0x56d4
    movk     w21, #0x1aea, lsl #16
    mov      x1, x22
    mov      w22, #0xfd34
    movk     w22, #0xe10b, lsl #16
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x20]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xab51
    movk     w9, #0x4e40, lsl #16
    str      w9, [x8]
    b        #0x35006c
    mov      w9, #0x71f5
    movk     w9, #0xb023, lsl #16
    cmp      w8, w9
    b.ne     #0x35006c
    adrp     x8, #0x4a6000
    add      x8, x8, #0xd8
    ldrb     w9, [sp, #0x1f]
    cmp      w9, #0
    ldr      x19, [sp, #8]
    csel     x2, x8, x19, ne
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    ldr      x0, [sp, #0x20]
    adrp     x3, #0x54c000
    add      x3, x3, #0x9c0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp]
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups unreadGroupShowMuted] IMP=0x350418 bounds=0x350418-0x350824
loc_350418:
    sub      sp, sp, #0x80
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    adrp     x8, #0x581000
    add      x8, x8, #0x2b4
    ldar     w8, [x8]
    mov      w9, #0x9874
    movk     w9, #0x634c, lsl #16
    str      w8, [sp, #0x1c]
    add      x8, sp, #8
    mov      w23, #0x8ade
    movk     w23, #0x4b5, lsl #16
    str      w9, [sp, #8]
    mov      w24, #0xb685
    movk     w24, #0xce7d, lsl #16
    str      x8, [sp]
    adrp     x21, #0x54c000
    add      x21, x21, #0x9e0
    adrp     x19, #0x54c000
    add      x19, x19, #0xa00
    adrp     x22, #0x54c000
    add      x22, x22, #0xa08
    adrp     x27, #0x54c000
    add      x27, x27, #0x9e9
    mov      w28, #0x8adf
    movk     w28, #0x4b5, lsl #16
    mov      w20, #0x8fcd
    movk     w20, #0x4cac, lsl #16
    adrp     x25, #0x54c000
    add      x25, x25, #0x9ed
    adrp     x26, #0x54c000
    add      x26, x26, #0xa0d
    ldr      w8, [sp, #8]
    cmp      w8, w23
    b.gt     #0x350568
    cmp      w8, w24
    b.gt     #0x3505b0
    mov      w9, #0xbee1
    movk     w9, #0xa70f, lsl #16
    cmp      w8, w9
    b.eq     #0x35075c
    mov      w9, #0x2a03
    movk     w9, #0xb950, lsl #16
    cmp      w8, w9
    b.ne     #0x3504ac
    ldrb     w8, [x21]
    mov      w9, #0xa2
    eor      w8, w8, w9
    strb     w8, [x19]
    ldrb     w8, [x21, #1]
    eor      w8, w8, #3
    strb     w8, [x19, #1]
    ldrb     w8, [x21, #2]
    eor      w8, w8, #0xffffffe3
    strb     w8, [x19, #2]
    ldrb     w8, [x21, #3]
    eor      w8, w8, #0xfffffff9
    strb     w8, [x19, #3]
    ldrb     w8, [x21, #4]
    eor      w8, w8, #1
    strb     w8, [x19, #4]
    ldrb     w8, [x21, #5]
    mov      w9, #0x93
    eor      w8, w8, w9
    strb     w8, [x19, #5]
    ldrb     w8, [x21, #6]
    mov      w9, #0x7b
    eor      w8, w8, w9
    strb     w8, [x19, #6]
    ldrb     w8, [x21, #7]
    eor      w8, w8, #0xfe
    strb     w8, [x19, #7]
    ldrb     w8, [x21, #8]
    strb     w8, [sp, #0x1a]
    ldr      x8, [sp]
    mov      w9, #0xb686
    movk     w9, #0xce7d, lsl #16
    str      w9, [x8]
    b        #0x3504ac
    cmp      w8, w20
    b.gt     #0x350614
    cmp      w8, w28
    b.eq     #0x350648
    mov      w9, #0xbd52
    movk     w9, #0x1529, lsl #16
    cmp      w8, w9
    b.ne     #0x3504ac
    ldrb     w8, [sp, #0x1b]
    cmp      w8, #0
    mov      w8, #0x675d
    movk     w8, #0xda18, lsl #16
    mov      w9, #0x2a03
    movk     w9, #0xb950, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x3504ac
    mov      w9, #0xb686
    movk     w9, #0xce7d, lsl #16
    cmp      w8, w9
    b.eq     #0x350790
    mov      w9, #0x675d
    movk     w9, #0xda18, lsl #16
    cmp      w8, w9
    b.ne     #0x3504ac
    adrp     x8, #0x581000
    add      x8, x8, #0x2b4
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x10]
    ldr      x8, [sp]
    mov      w9, #0xbee1
    movk     w9, #0xa70f, lsl #16
    str      w9, [x8]
    b        #0x3504ac
    mov      w9, #0x9874
    movk     w9, #0x634c, lsl #16
    cmp      w8, w9
    b.ne     #0x3507e8
    ldr      w8, [sp, #0x1c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x1b]
    ldr      x8, [sp]
    mov      w9, #0xbd52
    movk     w9, #0x1529, lsl #16
    str      w9, [x8]
    b        #0x3504ac
    ldrb     w8, [x25]
    eor      w8, w8, #0xf8
    strb     w8, [x26]
    ldrb     w8, [x25, #1]
    mov      w9, #0x6a
    eor      w8, w8, w9
    strb     w8, [x26, #1]
    ldrb     w8, [x25, #2]
    mov      w9, #0xe6
    eor      w8, w8, w9
    strb     w8, [x26, #2]
    ldrb     w8, [x25, #3]
    mov      w9, #0x26
    eor      w8, w8, w9
    strb     w8, [x26, #3]
    ldrb     w8, [x25, #4]
    mov      w9, #0x2d
    eor      w8, w8, w9
    strb     w8, [x26, #4]
    ldrb     w8, [x25, #5]
    mov      w9, #0xf5
    eor      w8, w8, w9
    strb     w8, [x26, #5]
    ldrb     w8, [x25, #6]
    mov      w9, #0x2f
    eor      w8, w8, w9
    strb     w8, [x26, #6]
    ldrb     w8, [x25, #7]
    mov      w9, #0xce
    eor      w8, w8, w9
    strb     w8, [x26, #7]
    ldrb     w8, [x25, #8]
    mov      w9, #0x6b
    eor      w8, w8, w9
    strb     w8, [x26, #8]
    ldrb     w8, [x25, #9]
    eor      w8, w8, #0xfffffff7
    strb     w8, [x26, #9]
    ldrb     w8, [x25, #0xa]
    mov      w9, #0x47
    eor      w8, w8, w9
    strb     w8, [x26, #0xa]
    ldrb     w8, [x25, #0xb]
    mov      w9, #0x28
    eor      w8, w8, w9
    strb     w8, [x26, #0xb]
    ldrb     w8, [x25, #0xc]
    eor      w8, w8, #0xffffff9f
    strb     w8, [x26, #0xc]
    ldrb     w8, [x25, #0xd]
    mov      w9, #0x8b
    eor      w8, w8, w9
    strb     w8, [x26, #0xd]
    ldrb     w8, [x25, #0xe]
    mov      w9, #0xe8
    eor      w8, w8, w9
    strb     w8, [x26, #0xe]
    ldrb     w8, [x25, #0xf]
    mov      w9, #0x7d
    eor      w8, w8, w9
    strb     w8, [x26, #0xf]
    ldrb     w8, [x25, #0x10]
    eor      w8, w8, #7
    strb     w8, [x26, #0x10]
    ldr      x8, [sp]
    mov      w9, #0x675d
    movk     w9, #0xda18, lsl #16
    str      w9, [x8]
    b        #0x3504ac
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x480]
    ldr      x0, [sp, #0x10]
    adrp     x2, #0x54c000
    add      x2, x2, #0xa40
    mov      w3, #0
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0xf]
    ldr      x8, [sp]
    mov      w9, #0x8fce
    movk     w9, #0x4cac, lsl #16
    str      w9, [x8]
    b        #0x3504ac
    ldrb     w8, [sp, #0x1a]
    mov      w9, #0x24
    eor      w8, w8, w9
    strb     w8, [x22]
    ldrb     w8, [x27]
    mov      w9, #0xe5
    eor      w8, w8, w9
    strb     w8, [x22, #1]
    ldrb     w8, [x27, #1]
    mov      w9, #0x95
    eor      w8, w8, w9
    strb     w8, [x22, #2]
    ldrb     w8, [x27, #2]
    eor      w8, w8, #0x44444444
    strb     w8, [x22, #3]
    ldrb     w8, [x27, #3]
    mov      w9, #0x26
    eor      w8, w8, w9
    strb     w8, [x22, #4]
    ldr      x8, [sp]
    str      w28, [x8]
    b        #0x3504ac
    mov      w9, #0x8fce
    movk     w9, #0x4cac, lsl #16
    cmp      w8, w9
    b.ne     #0x3504ac
    ldr      x0, [sp, #0x10]
    bl       #0x461c9c // _objc_release
    ldrb     w0, [sp, #0xf]
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    add      sp, sp, #0x80
    ret      

// -[WCLGHomeGroups setUnreadGroupShowMuted:] IMP=0x350824 bounds=0x350824-0x350C40
loc_350824:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    str      w2, [sp, #0xc]
    str      x0, [sp]
    adrp     x8, #0x581000
    add      x8, x8, #0x2b8
    ldar     w8, [x8]
    str      w8, [sp, #0x2c]
    mov      w8, #0xe6e9
    movk     w8, #0x169e, lsl #16
    str      w8, [sp, #0x1c]
    add      x8, sp, #0x1c
    mov      w25, #0x2d61
    movk     w25, #0x19a0, lsl #16
    str      x8, [sp, #0x10]
    mov      w26, #0xc8ec
    movk     w26, #0xe8b8, lsl #16
    adrp     x28, #0x54c000
    add      x28, x28, #0xa98
    adrp     x19, #0x54c000
    add      x19, x19, #0xa79
    mov      w21, #0xc8ed
    movk     w21, #0xe8b8, lsl #16
    mov      w23, #0x52a9
    movk     w23, #0x55a3, lsl #16
    mov      w27, #0x2d62
    movk     w27, #0x19a0, lsl #16
    mov      w24, #0x52aa
    movk     w24, #0x55a3, lsl #16
    adrp     x22, #0x54c000
    add      x22, x22, #0xa82
    adrp     x20, #0x54c000
    add      x20, x20, #0xa63
    ldr      w8, [sp, #0x1c]
    cmp      w8, w25
    b.le     #0x350928
    cmp      w8, w23
    b.gt     #0x35096c
    cmp      w8, w27
    b.eq     #0x350a4c
    mov      w9, #0xfb02
    movk     w9, #0x2ca1, lsl #16
    cmp      w8, w9
    b.ne     #0x3508c0
    adrp     x8, #0x581000
    add      x8, x8, #0x2b8
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x20]
    ldr      x8, [sp, #0x10]
    str      w21, [x8]
    b        #0x3508c0
    cmp      w8, w26
    b.le     #0x3509a4
    cmp      w8, w21
    b.eq     #0x350a1c
    mov      w9, #0xe6e9
    movk     w9, #0x169e, lsl #16
    cmp      w8, w9
    b.ne     #0x3508c0
    ldr      w8, [sp, #0x2c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x2b]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xbb07
    movk     w9, #0x7a9a, lsl #16
    str      w9, [x8]
    b        #0x3508c0
    cmp      w8, w24
    b.eq     #0x350a8c
    mov      w9, #0xbb07
    movk     w9, #0x7a9a, lsl #16
    cmp      w8, w9
    b.ne     #0x3508c0
    ldrb     w8, [sp, #0x2b]
    cmp      w8, #0
    mov      w8, #0xfb02
    movk     w8, #0x2ca1, lsl #16
    csel     w8, w27, w8, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x3508c0
    mov      w9, #0x2575
    movk     w9, #0xc378, lsl #16
    cmp      w8, w9
    b.ne     #0x350bfc
    ldrb     w8, [sp, #0x29]
    strb     w8, [x28]
    ldrb     w8, [x19]
    mov      w9, #0x59
    eor      w8, w8, w9
    strb     w8, [x28, #1]
    ldrb     w8, [x19, #1]
    mov      w9, #0xd3
    eor      w8, w8, w9
    strb     w8, [x28, #2]
    ldrb     w8, [x19, #2]
    eor      w8, w8, #0xfffffffb
    strb     w8, [x28, #3]
    ldrb     w8, [x19, #3]
    mov      w9, #0x1a
    eor      w8, w8, w9
    strb     w8, [x28, #4]
    ldrb     w8, [x19, #4]
    mov      w9, #0xd8
    eor      w8, w8, w9
    strb     w8, [x28, #5]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xfb02
    movk     w9, #0x2ca1, lsl #16
    str      w9, [x8]
    b        #0x3508c0
    ldr      x0, [sp, #0x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x350]
    ldr      w2, [sp, #0xc]
    adrp     x3, #0x54c000
    add      x3, x3, #0xac0
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x10]
    mov      w9, #0x7420
    movk     w9, #0xd4d2, lsl #16
    str      w9, [x8]
    b        #0x3508c0
    adrp     x9, #0x54c000
    add      x9, x9, #0xa60
    ldrb     w8, [x9]
    mov      w10, #0x42
    eor      w8, w8, w10
    adrp     x10, #0x54c000
    add      x10, x10, #0xa80
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    eor      w8, w8, #0x88888888
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    strb     w8, [sp, #0x2a]
    ldr      x8, [sp, #0x10]
    str      w24, [x8]
    b        #0x3508c0
    ldrb     w8, [sp, #0x2a]
    mov      w9, #0xa5
    eor      w8, w8, w9
    strb     w8, [x22]
    ldrb     w8, [x20]
    mov      w9, #0xad
    eor      w8, w8, w9
    strb     w8, [x22, #1]
    ldrb     w8, [x20, #1]
    mov      w9, #0xa3
    eor      w8, w8, w9
    strb     w8, [x22, #2]
    ldrb     w8, [x20, #2]
    mov      w9, #0x2d
    eor      w8, w8, w9
    strb     w8, [x22, #3]
    ldrb     w8, [x20, #3]
    mov      w9, #0x85
    eor      w8, w8, w9
    strb     w8, [x22, #4]
    ldrb     w8, [x20, #4]
    mov      w9, #0x63
    eor      w8, w8, w9
    strb     w8, [x22, #5]
    ldrb     w8, [x20, #5]
    mov      w9, #0xca
    eor      w8, w8, w9
    strb     w8, [x22, #6]
    ldrb     w8, [x20, #6]
    mov      w9, #0xed
    eor      w8, w8, w9
    strb     w8, [x22, #7]
    ldrb     w8, [x20, #7]
    mov      w9, #0xaf
    eor      w8, w8, w9
    strb     w8, [x22, #8]
    ldrb     w8, [x20, #8]
    mov      w9, #0xae
    eor      w8, w8, w9
    strb     w8, [x22, #9]
    ldrb     w8, [x20, #9]
    eor      w8, w8, #0x20
    strb     w8, [x22, #0xa]
    ldrb     w8, [x20, #0xa]
    mov      w9, #0x3a
    eor      w8, w8, w9
    strb     w8, [x22, #0xb]
    ldrb     w8, [x20, #0xb]
    mov      w9, #0xa8
    eor      w8, w8, w9
    strb     w8, [x22, #0xc]
    ldrb     w8, [x20, #0xc]
    mov      w9, #0xbc
    eor      w8, w8, w9
    strb     w8, [x22, #0xd]
    ldrb     w8, [x20, #0xd]
    mov      w9, #0x5c
    eor      w8, w8, w9
    strb     w8, [x22, #0xe]
    ldrb     w8, [x20, #0xe]
    mov      w9, #0xba
    eor      w8, w8, w9
    strb     w8, [x22, #0xf]
    ldrb     w8, [x20, #0xf]
    eor      w8, w8, #0x1e
    strb     w8, [x22, #0x10]
    ldrb     w8, [x20, #0x10]
    eor      w8, w8, #0x78
    strb     w8, [x22, #0x11]
    ldrb     w8, [x20, #0x11]
    mov      w9, #0x46
    eor      w8, w8, w9
    strb     w8, [x22, #0x12]
    ldrb     w8, [x20, #0x12]
    eor      w8, w8, #0x3f
    strb     w8, [x22, #0x13]
    ldrb     w8, [x20, #0x13]
    mov      w9, #0xa4
    eor      w8, w8, w9
    strb     w8, [x22, #0x14]
    ldrb     w8, [x20, #0x14]
    mov      w10, #0xb0
    eor      w8, w8, w10
    strb     w8, [x22, #0x15]
    ldrb     w8, [x20, #0x15]
    eor      w8, w8, w9
    strb     w8, [sp, #0x29]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x2575
    movk     w9, #0xc378, lsl #16
    str      w9, [x8]
    b        #0x3508c0
    mov      w9, #0x7420
    movk     w9, #0xd4d2, lsl #16
    cmp      w8, w9
    b.ne     #0x3508c0
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp]
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups swipeEnabled] IMP=0x350C40 bounds=0x350C40-0x351010
loc_350C40:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    adrp     x8, #0x581000
    add      x8, x8, #0x2bc
    mov      w10, #0x18f5
    movk     w10, #0x7d7a, lsl #16
    ldar     w8, [x8]
    mov      w9, #0xc28a
    movk     w9, #0xa53d, lsl #16
    str      w8, [sp, #0x2c]
    add      x8, sp, #0x14
    mov      w22, #0xdcfd
    movk     w22, #0x71a, lsl #16
    str      w9, [sp, #0x14]
    mov      w23, #0x5c93
    movk     w23, #0xcd25, lsl #16
    mov      w11, #0x8754
    movk     w11, #0x91f4, lsl #16
    str      x8, [sp, #8]
    adrp     x25, #0x54c000
    add      x25, x25, #0xaf1
    adrp     x27, #0x54c000
    add      x27, x27, #0xb11
    mov      w12, #0xdcfe
    movk     w12, #0x71a, lsl #16
    mov      w13, #0xd8c
    movk     w13, #0xf56b, lsl #16
    adrp     x19, #0x54c000
    add      x19, x19, #0xae6
    adrp     x21, #0x54c000
    add      x21, x21, #0xb06
    mov      w14, #0xbd
    mov      w28, #0x6d09
    movk     w28, #0x5b7b, lsl #16
    mov      w15, #0x1b32
    movk     w15, #0x34dc, lsl #16
    adrp     x20, #0x54c000
    add      x20, x20, #0xae0
    mov      w24, #0x6d0a
    movk     w24, #0x5b7b, lsl #16
    adrp     x26, #0x54c000
    add      x26, x26, #0xb00
    ldr      w8, [sp, #0x14]
    cmp      w8, w22
    b.le     #0x350d84
    cmp      w8, w28
    b.gt     #0x350dc0
    cmp      w8, w12
    b.eq     #0x350f84
    cmp      w8, w15
    b.ne     #0x350d00
    ldrb     w8, [x20]
    eor      w8, w8, #0x1e
    strb     w8, [x26]
    ldrb     w8, [x20, #1]
    eor      w8, w8, w14
    strb     w8, [x26, #1]
    ldrb     w8, [x20, #2]
    mov      w9, #0x9b
    eor      w8, w8, w9
    strb     w8, [x26, #2]
    ldrb     w8, [x20, #3]
    mov      w9, #0x86
    eor      w8, w8, w9
    strb     w8, [x26, #3]
    ldrb     w8, [x20, #4]
    eor      w8, w8, #0x40
    strb     w8, [x26, #4]
    ldrb     w8, [x20, #5]
    mov      w9, #0x71
    eor      w8, w8, w9
    strb     w8, [x26, #5]
    ldr      x8, [sp, #8]
    str      w13, [x8]
    b        #0x350d00
    cmp      w8, w23
    b.gt     #0x350e38
    cmp      w8, w11
    b.eq     #0x350ee8
    mov      w9, #0xc28a
    movk     w9, #0xa53d, lsl #16
    cmp      w8, w9
    b.ne     #0x350d00
    ldr      w8, [sp, #0x2c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x2b]
    ldr      x8, [sp, #8]
    str      w12, [x8]
    b        #0x350d00
    cmp      w8, w24
    b.eq     #0x350f9c
    cmp      w8, w10
    b.ne     #0x350d00
    adrp     x8, #0x581000
    add      x8, x8, #0x2bc
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      w15, #0x1b32
    movk     w15, #0x34dc, lsl #16
    mov      w14, #0xbd
    mov      w13, #0xd8c
    movk     w13, #0xf56b, lsl #16
    mov      w12, #0xdcfe
    movk     w12, #0x71a, lsl #16
    mov      w11, #0x8754
    movk     w11, #0x91f4, lsl #16
    mov      w10, #0x18f5
    movk     w10, #0x7d7a, lsl #16
    str      x0, [sp, #0x20]
    ldr      x8, [sp, #8]
    str      w24, [x8]
    b        #0x350d00
    cmp      w8, w13
    b.ne     #0x350fbc
    ldrb     w8, [x19]
    eor      w8, w8, #0x3c
    strb     w8, [x21]
    ldrb     w8, [x19, #1]
    mov      w9, #0x68
    eor      w8, w8, w9
    strb     w8, [x21, #1]
    ldrb     w8, [x19, #2]
    mov      w9, #0x24
    eor      w8, w8, w9
    strb     w8, [x21, #2]
    ldrb     w8, [x19, #3]
    eor      w8, w8, #0xc0
    strb     w8, [x21, #3]
    ldrb     w8, [x19, #4]
    mov      w9, #0x76
    eor      w8, w8, w9
    strb     w8, [x21, #4]
    ldrb     w8, [x19, #5]
    eor      w8, w8, w14
    strb     w8, [x21, #5]
    ldrb     w8, [x19, #6]
    mov      w9, #0x27
    eor      w8, w8, w9
    strb     w8, [x21, #6]
    ldrb     w8, [x19, #7]
    mov      w9, #0x4d
    eor      w8, w8, w9
    strb     w8, [x21, #7]
    ldrb     w8, [x19, #8]
    mov      w9, #0x45
    eor      w8, w8, w9
    strb     w8, [x21, #8]
    ldrb     w8, [x19, #9]
    eor      w8, w8, #0xf8
    strb     w8, [x21, #9]
    ldrb     w8, [x19, #0xa]
    eor      w8, w8, #0xffffff81
    strb     w8, [x21, #0xa]
    ldr      x8, [sp, #8]
    str      w11, [x8]
    b        #0x350d00
    ldrb     w8, [x25]
    mov      w9, #0x1d
    eor      w8, w8, w9
    strb     w8, [x27]
    ldrb     w8, [x25, #1]
    eor      w8, w8, #0xdddddddd
    strb     w8, [x27, #1]
    ldrb     w8, [x25, #2]
    eor      w8, w8, #0xbbbbbbbb
    strb     w8, [x27, #2]
    ldrb     w8, [x25, #3]
    mov      w9, #0x37
    eor      w8, w8, w9
    strb     w8, [x27, #3]
    ldrb     w8, [x25, #4]
    mov      w9, #0xec
    eor      w8, w8, w9
    strb     w8, [x27, #4]
    ldrb     w8, [x25, #5]
    mov      w9, #0xa0
    eor      w8, w8, w9
    strb     w8, [x27, #5]
    ldrb     w8, [x25, #6]
    mov      w9, #0x34
    eor      w8, w8, w9
    strb     w8, [x27, #6]
    ldrb     w8, [x25, #7]
    eor      w8, w8, #0x38
    strb     w8, [x27, #7]
    ldrb     w8, [x25, #8]
    eor      w8, w8, #0x78
    strb     w8, [x27, #8]
    ldrb     w8, [x25, #9]
    mov      w9, #0x2b
    eor      w8, w8, w9
    strb     w8, [x27, #9]
    ldr      x8, [sp, #8]
    str      w10, [x8]
    b        #0x350d00
    ldrb     w8, [sp, #0x2b]
    cmp      w8, #0
    csel     w8, w15, w10, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x350d00
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x480]
    str      x8, [sp, #0x18]
    ldr      x8, [sp, #8]
    mov      w9, #0x5c94
    movk     w9, #0xcd25, lsl #16
    str      w9, [x8]
    b        #0x350d00
    mov      w9, #0x5c94
    movk     w9, #0xcd25, lsl #16
    cmp      w8, w9
    b.ne     #0x350d00
    ldp      x1, x0, [sp, #0x18]
    adrp     x2, #0x54c000
    add      x2, x2, #0xb40
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    ret      

// -[WCLGHomeGroups setSwipeEnabled:] IMP=0x351010 bounds=0x351010-0x351408
loc_351010:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    str      w2, [sp, #0x14]
    str      x0, [sp, #8]
    mov      w10, #0x8f9a
    movk     w10, #0x77a2, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x2c0
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w8, #0x9101
    movk     w8, #0xbe3b, lsl #16
    str      w8, [sp, #0x24]
    add      x8, sp, #0x24
    mov      w26, #0x7030
    movk     w26, #0x12e0, lsl #16
    str      x8, [sp, #0x18]
    mov      w27, #0x9100
    movk     w27, #0xbe3b, lsl #16
    adrp     x28, #0x54c000
    add      x28, x28, #0xb96
    mov      w11, #0x727a
    movk     w11, #0xa7e6, lsl #16
    adrp     x21, #0x54c000
    add      x21, x21, #0xb77
    mov      w12, #0x3dc8
    movk     w12, #0xacf6, lsl #16
    adrp     x19, #0x54c000
    add      x19, x19, #0xb60
    mov      w13, #0x97
    mov      w15, #0x7031
    movk     w15, #0x12e0, lsl #16
    mov      w23, #0xe355
    movk     w23, #0x5121, lsl #16
    adrp     x20, #0x54c000
    add      x20, x20, #0xb83
    mov      w24, #0xe354
    movk     w24, #0x5121, lsl #16
    adrp     x25, #0x54c000
    add      x25, x25, #0xb64
    mov      w16, #0xedba
    movk     w16, #0x352b, lsl #16
    ldr      w8, [sp, #0x24]
    cmp      w8, w26
    b.le     #0x351178
    cmp      w8, w24
    b.gt     #0x3511d8
    cmp      w8, w15
    b.eq     #0x351290
    cmp      w8, w16
    b.ne     #0x3510d0
    ldp      x1, x0, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x350]
    ldr      w2, [sp, #0x14]
    adrp     x3, #0x54c000
    add      x3, x3, #0xbc0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp, #8]
    bl       #0x461c6c // _objc_msgSend
    mov      w16, #0xedba
    movk     w16, #0x352b, lsl #16
    mov      w15, #0x7031
    movk     w15, #0x12e0, lsl #16
    mov      w13, #0x97
    mov      w12, #0x3dc8
    movk     w12, #0xacf6, lsl #16
    mov      w11, #0x727a
    movk     w11, #0xa7e6, lsl #16
    mov      w10, #0x8f9a
    movk     w10, #0x77a2, lsl #16
    ldr      x8, [sp, #0x18]
    mov      w9, #0xd32f
    movk     w9, #0x83f, lsl #16
    str      w9, [x8]
    b        #0x3510d0
    cmp      w8, w27
    b.gt     #0x351218
    cmp      w8, w11
    b.eq     #0x351244
    cmp      w8, w12
    b.ne     #0x3510d0
    ldrb     w8, [x19]
    mov      w9, #0x4c
    eor      w8, w8, w9
    adrp     x9, #0x54c000
    add      x9, x9, #0xb80
    strb     w8, [x9]
    ldrb     w8, [x19, #1]
    eor      w8, w8, w13
    strb     w8, [x9, #1]
    ldrb     w8, [x19, #2]
    mov      w14, #0xd6
    eor      w8, w8, w14
    strb     w8, [x9, #2]
    ldrb     w8, [x19, #3]
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp, #0x18]
    str      w15, [x8]
    b        #0x3510d0
    cmp      w8, w23
    b.eq     #0x3513c0
    cmp      w8, w10
    b.ne     #0x3510d0
    adrp     x8, #0x581000
    add      x8, x8, #0x2c0
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x9, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x308]
    stp      x8, x9, [sp, #0x28]
    ldr      x8, [sp, #0x18]
    str      w16, [x8]
    b        #0x3510d0
    mov      w9, #0x9101
    movk     w9, #0xbe3b, lsl #16
    cmp      w8, w9
    b.ne     #0x3513d8
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp, #0x18]
    str      w23, [x8]
    b        #0x3510d0
    ldrb     w8, [sp, #0x39]
    strb     w8, [x28]
    ldrb     w8, [x21]
    mov      w9, #0xb8
    eor      w8, w8, w9
    strb     w8, [x28, #1]
    ldrb     w8, [x21, #1]
    mov      w9, #0xa8
    eor      w8, w8, w9
    strb     w8, [x28, #2]
    ldrb     w8, [x21, #2]
    eor      w8, w8, #0xf
    strb     w8, [x28, #3]
    ldrb     w8, [x21, #3]
    eor      w8, w8, #0x80
    strb     w8, [x28, #4]
    ldr      x8, [sp, #0x18]
    str      w10, [x8]
    b        #0x3510d0
    ldrb     w8, [sp, #0x3a]
    mvn      w8, w8
    strb     w8, [x20]
    ldrb     w8, [x25]
    mov      w9, #0x21
    eor      w8, w8, w9
    strb     w8, [x20, #1]
    ldrb     w8, [x25, #1]
    eor      w8, w8, #0x1c
    strb     w8, [x20, #2]
    ldrb     w8, [x25, #2]
    mov      w14, #0xfa
    eor      w8, w8, w14
    strb     w8, [x20, #3]
    ldrb     w8, [x25, #3]
    eor      w8, w8, w9
    strb     w8, [x20, #4]
    ldrb     w8, [x25, #4]
    eor      w8, w8, w13
    strb     w8, [x20, #5]
    ldrb     w8, [x25, #5]
    mov      w9, #0x2a
    eor      w8, w8, w9
    strb     w8, [x20, #6]
    ldrb     w8, [x25, #6]
    mov      w9, #0xb4
    eor      w8, w8, w9
    strb     w8, [x20, #7]
    ldrb     w8, [x25, #7]
    mov      w9, #0x5b
    eor      w8, w8, w9
    strb     w8, [x20, #8]
    ldrb     w8, [x25, #8]
    mov      w9, #0x5d
    eor      w8, w8, w9
    strb     w8, [x20, #9]
    ldrb     w8, [x25, #9]
    mov      w9, #0x7a
    eor      w8, w8, w9
    strb     w8, [x20, #0xa]
    ldrb     w8, [x25, #0xa]
    mov      w9, #0x2c
    eor      w8, w8, w9
    strb     w8, [x20, #0xb]
    ldrb     w8, [x25, #0xb]
    eor      w8, w8, #0x18
    strb     w8, [x20, #0xc]
    ldrb     w8, [x25, #0xc]
    mov      w9, #0x68
    eor      w8, w8, w9
    strb     w8, [x20, #0xd]
    ldrb     w8, [x25, #0xd]
    mov      w9, #0x36
    eor      w8, w8, w9
    strb     w8, [x20, #0xe]
    ldrb     w8, [x25, #0xe]
    eor      w8, w8, #0xffffffe3
    strb     w8, [x20, #0xf]
    ldrb     w8, [x25, #0xf]
    eor      w8, w8, #0xffffffef
    strb     w8, [x20, #0x10]
    ldrb     w8, [x25, #0x10]
    mov      w9, #0xe4
    eor      w8, w8, w9
    strb     w8, [x20, #0x11]
    ldrb     w8, [x25, #0x11]
    mov      w9, #0x8c
    eor      w8, w8, w9
    strb     w8, [x20, #0x12]
    ldrb     w8, [x25, #0x12]
    mov      w9, #0x4d
    eor      w8, w8, w9
    strb     w8, [sp, #0x39]
    ldr      x8, [sp, #0x18]
    str      w11, [x8]
    b        #0x3510d0
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    csel     w8, w12, w10, ne
    ldr      x9, [sp, #0x18]
    str      w8, [x9]
    b        #0x3510d0
    mov      w9, #0xd32f
    movk     w9, #0x83f, lsl #16
    cmp      w8, w9
    b.ne     #0x3510d0
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    ret      

// -[WCLGHomeGroups animationEnabled] IMP=0x351408 bounds=0x351408-0x351800
loc_351408:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      w19, #0x3fd8
    movk     w19, #0xbd38, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x2c4
    ldar     w8, [x8]
    mov      w9, #0x43a3
    movk     w9, #0xa4c8, lsl #16
    str      w8, [sp, #0x2c]
    add      x8, sp, #0x14
    mov      w22, #0xe8bf
    movk     w22, #0xfc1, lsl #16
    str      w9, [sp, #0x14]
    mov      w23, #0x3fd7
    movk     w23, #0xbd38, lsl #16
    mov      w24, #0x503
    movk     w24, #0xa173, lsl #16
    str      x8, [sp, #8]
    mov      w10, #0x9a7a
    movk     w10, #0x3059, lsl #16
    mov      w11, #0x96cb
    movk     w11, #0xd947, lsl #16
    mov      w20, #0x9a79
    movk     w20, #0x3059, lsl #16
    adrp     x26, #0x54c000
    add      x26, x26, #0xc04
    mov      w21, #0xe8c0
    movk     w21, #0xfc1, lsl #16
    adrp     x28, #0x54c000
    add      x28, x28, #0xbe5
    mov      w12, #0x38bd
    movk     w12, #0x20dc, lsl #16
    adrp     x25, #0x54c000
    add      x25, x25, #0xbe0
    adrp     x27, #0x54c000
    add      x27, x27, #0xc00
    ldr      w8, [sp, #0x14]
    cmp      w8, w22
    b.gt     #0x3514fc
    cmp      w8, w23
    b.gt     #0x351560
    cmp      w8, w24
    b.eq     #0x351784
    mov      w9, #0x43a3
    movk     w9, #0xa4c8, lsl #16
    cmp      w8, w9
    b.ne     #0x3514b4
    ldr      w8, [sp, #0x2c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x2b]
    ldr      x8, [sp, #8]
    str      w10, [x8]
    b        #0x3514b4
    cmp      w8, w20
    b.gt     #0x3515c4
    cmp      w8, w21
    b.eq     #0x3515e4
    cmp      w8, w12
    b.ne     #0x3514b4
    ldrb     w8, [x25]
    mov      w9, #5
    eor      w8, w8, w9
    strb     w8, [x27]
    ldrb     w8, [x25, #1]
    eor      w8, w8, #0xe0
    strb     w8, [x27, #1]
    ldrb     w8, [x25, #2]
    mov      w9, #0x4f
    eor      w8, w8, w9
    strb     w8, [x27, #2]
    ldrb     w8, [x25, #3]
    eor      w8, w8, #0xe0
    strb     w8, [x27, #3]
    ldrb     w8, [x25, #4]
    strb     w8, [sp, #0x2a]
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x3514b4
    cmp      w8, w19
    b.eq     #0x351790
    cmp      w8, w11
    b.ne     #0x3514b4
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      w12, #0x38bd
    movk     w12, #0x20dc, lsl #16
    mov      w11, #0x96cb
    movk     w11, #0xd947, lsl #16
    mov      w10, #0x9a7a
    movk     w10, #0x3059, lsl #16
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x480]
    stp      x8, x0, [sp, #0x18]
    ldr      x8, [sp, #8]
    mov      w9, #0xd989
    movk     w9, #0x40e5, lsl #16
    str      w9, [x8]
    b        #0x3514b4
    cmp      w8, w10
    b.ne     #0x3517ac
    ldrb     w8, [sp, #0x2b]
    cmp      w8, #0
    csel     w8, w12, w19, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x3514b4
    ldrb     w8, [sp, #0x2a]
    eor      w8, w8, #0xffffff9f
    strb     w8, [x26]
    ldrb     w8, [x28]
    mov      w9, #0x6d
    eor      w8, w8, w9
    strb     w8, [x26, #1]
    ldrb     w8, [x28, #1]
    eor      w8, w8, #0x11111111
    strb     w8, [x26, #2]
    ldrb     w8, [x28, #2]
    eor      w8, w8, #0x11111111
    strb     w8, [x26, #3]
    ldrb     w8, [x28, #3]
    mov      w9, #0xe9
    eor      w8, w8, w9
    strb     w8, [x26, #4]
    ldrb     w8, [x28, #4]
    mov      w9, #0xb
    eor      w8, w8, w9
    strb     w8, [x26, #5]
    ldrb     w8, [x28, #5]
    mov      w9, #0x85
    eor      w8, w8, w9
    strb     w8, [x26, #6]
    ldrb     w8, [x28, #6]
    eor      w8, w8, #0xaaaaaaaa
    strb     w8, [x26, #7]
    ldrb     w8, [x28, #7]
    mov      w9, #0x6e
    eor      w8, w8, w9
    strb     w8, [x26, #8]
    ldrb     w8, [x28, #8]
    mov      w9, #0x5d
    eor      w8, w8, w9
    strb     w8, [x26, #9]
    ldrb     w8, [x28, #9]
    mov      w9, #0x63
    eor      w8, w8, w9
    strb     w8, [x26, #0xa]
    ldrb     w8, [x28, #0xa]
    mov      w9, #0x5f
    eor      w8, w8, w9
    strb     w8, [x26, #0xb]
    ldrb     w8, [x28, #0xb]
    mov      w9, #0x74
    eor      w8, w8, w9
    strb     w8, [x26, #0xc]
    ldrb     w8, [x28, #0xc]
    mov      w9, #0xb5
    eor      w8, w8, w9
    strb     w8, [x26, #0xd]
    ldrb     w8, [x28, #0xd]
    mov      w9, #0x4b
    eor      w8, w8, w9
    strb     w8, [x26, #0xe]
    ldrb     w8, [x28, #0xe]
    mov      w9, #0x86
    eor      w8, w8, w9
    strb     w8, [x26, #0xf]
    ldrb     w8, [x28, #0xf]
    mov      w9, #0x2d
    eor      w8, w8, w9
    strb     w8, [x26, #0x10]
    ldrb     w8, [x28, #0x10]
    eor      w8, w8, #0x30
    strb     w8, [x26, #0x11]
    ldrb     w8, [x28, #0x11]
    mov      w9, #0x82
    eor      w8, w8, w9
    strb     w8, [x26, #0x12]
    ldrb     w8, [x28, #0x12]
    mov      w9, #0xaf
    eor      w8, w8, w9
    strb     w8, [x26, #0x13]
    ldrb     w8, [x28, #0x13]
    mov      w9, #0x17
    eor      w8, w8, w9
    strb     w8, [x26, #0x14]
    ldrb     w8, [x28, #0x14]
    eor      w8, w8, #0xffffffe3
    strb     w8, [x26, #0x15]
    ldrb     w8, [x28, #0x15]
    mov      w9, #0x8e
    eor      w8, w8, w9
    strb     w8, [x26, #0x16]
    ldrb     w8, [x28, #0x16]
    mov      w9, #0xa0
    eor      w8, w8, w9
    strb     w8, [x26, #0x17]
    ldrb     w8, [x28, #0x17]
    eor      w8, w8, #0xffffffc3
    strb     w8, [x26, #0x18]
    ldrb     w8, [x28, #0x18]
    mov      w9, #0x7d
    eor      w8, w8, w9
    strb     w8, [x26, #0x19]
    ldrb     w8, [x28, #0x19]
    mov      w9, #0xa9
    eor      w8, w8, w9
    strb     w8, [x26, #0x1a]
    ldr      x8, [sp, #8]
    str      w24, [x8]
    b        #0x3514b4
    ldr      x8, [sp, #8]
    str      w19, [x8]
    b        #0x3514b4
    adrp     x8, #0x581000
    add      x8, x8, #0x2c4
    mov      w9, #1
    stlr     w9, [x8]
    ldr      x8, [sp, #8]
    str      w11, [x8]
    b        #0x3514b4
    mov      w9, #0xd989
    movk     w9, #0x40e5, lsl #16
    cmp      w8, w9
    b.ne     #0x3514b4
    ldp      x1, x0, [sp, #0x18]
    adrp     x2, #0x54c000
    add      x2, x2, #0xc40
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    ret      

// -[WCLGHomeGroups setAnimationEnabled:] IMP=0x351800 bounds=0x351800-0x351C1C
loc_351800:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    str      w2, [sp, #0xc]
    mov      w21, #0x7e76
    movk     w21, #0xd032, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x2c8
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w8, #0xad23
    movk     w8, #0x7dee, lsl #16
    str      w8, [sp, #0x24]
    add      x8, sp, #0x24
    mov      w24, #0xd013
    movk     w24, #0x645, lsl #16
    stp      x0, x8, [sp, #0x10]
    mov      w25, #0x7e75
    movk     w25, #0xd032, lsl #16
    mov      w10, #0xa07c
    movk     w10, #0xb51b, lsl #16
    mov      w11, #0x6a8a
    movk     w11, #0xff00, lsl #16
    adrp     x20, #0x54c000
    add      x20, x20, #0xc81
    adrp     x22, #0x54c000
    add      x22, x22, #0xc62
    mov      w12, #0xb0
    mov      w13, #0x4a
    mov      w28, #0x44e8
    movk     w28, #0x7fba, lsl #16
    mov      w19, #0xad22
    movk     w19, #0x7dee, lsl #16
    mov      w23, #0xd014
    movk     w23, #0x645, lsl #16
    mov      w15, #0x423
    movk     w15, #0x5fb3, lsl #16
    adrp     x27, #0x54c000
    add      x27, x27, #0xc92
    adrp     x26, #0x54c000
    add      x26, x26, #0xc73
    ldr      w8, [sp, #0x24]
    cmp      w8, w24
    b.le     #0x3518f4
    cmp      w8, w19
    b.gt     #0x351a1c
    cmp      w8, w23
    b.eq     #0x351ad4
    cmp      w8, w15
    b.ne     #0x3518b8
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    csel     w8, w23, w21, ne
    ldr      x9, [sp, #0x18]
    str      w8, [x9]
    b        #0x3518b8
    cmp      w8, w25
    b.le     #0x351a50
    cmp      w8, w21
    b.eq     #0x351a78
    cmp      w8, w11
    b.ne     #0x3518b8
    ldrb     w8, [sp, #0x3a]
    mov      w9, #0x23
    eor      w8, w8, w9
    strb     w8, [x20]
    ldrb     w8, [x22]
    mov      w9, #0xa9
    eor      w8, w8, w9
    strb     w8, [x20, #1]
    ldrb     w8, [x22, #1]
    mov      w9, #0xc9
    eor      w8, w8, w9
    strb     w8, [x20, #2]
    ldrb     w8, [x22, #2]
    mov      w9, #0xa1
    eor      w8, w8, w9
    strb     w8, [x20, #3]
    ldrb     w8, [x22, #3]
    eor      w8, w8, w12
    strb     w8, [x20, #4]
    ldrb     w8, [x22, #4]
    mov      w9, #0x29
    eor      w8, w8, w9
    strb     w8, [x20, #5]
    ldrb     w8, [x22, #5]
    mov      w9, #0x25
    eor      w8, w8, w9
    strb     w8, [x20, #6]
    ldrb     w8, [x22, #6]
    mov      w9, #0x89
    eor      w8, w8, w9
    strb     w8, [x20, #7]
    ldrb     w8, [x22, #7]
    mov      w9, #0x91
    eor      w8, w8, w9
    strb     w8, [x20, #8]
    ldrb     w8, [x22, #8]
    eor      w8, w8, #0x88888888
    strb     w8, [x20, #9]
    ldrb     w8, [x22, #9]
    eor      w8, w8, #0xffffff87
    strb     w8, [x20, #0xa]
    ldrb     w8, [x22, #0xa]
    mov      w9, #0x96
    eor      w8, w8, w9
    strb     w8, [x20, #0xb]
    ldrb     w8, [x22, #0xb]
    mov      w9, #0xdb
    eor      w8, w8, w9
    strb     w8, [x20, #0xc]
    ldrb     w8, [x22, #0xc]
    eor      w8, w8, #0xffffffc1
    strb     w8, [x20, #0xd]
    ldrb     w8, [x22, #0xd]
    mvn      w8, w8
    strb     w8, [x20, #0xe]
    ldrb     w8, [x22, #0xe]
    mov      w9, #0xfa
    eor      w8, w8, w9
    strb     w8, [x20, #0xf]
    ldrb     w8, [x22, #0xf]
    eor      w8, w8, w13
    strb     w8, [x20, #0x10]
    ldrb     w8, [x22, #0x10]
    eor      w8, w8, #0x7c
    strb     w8, [sp, #0x39]
    ldr      x8, [sp, #0x18]
    str      w28, [x8]
    b        #0x3518b8
    cmp      w8, w28
    b.eq     #0x351b00
    mov      w9, #0xad23
    movk     w9, #0x7dee, lsl #16
    cmp      w8, w9
    b.ne     #0x3518b8
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp, #0x18]
    str      w15, [x8]
    b        #0x3518b8
    cmp      w8, w10
    b.ne     #0x351bc4
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x350]
    str      x8, [sp, #0x28]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x10a7
    movk     w9, #0x84fe, lsl #16
    str      w9, [x8]
    b        #0x3518b8
    adrp     x8, #0x581000
    add      x8, x8, #0x2c8
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      w15, #0x423
    movk     w15, #0x5fb3, lsl #16
    mov      w13, #0x4a
    mov      w12, #0xb0
    mov      w11, #0x6a8a
    movk     w11, #0xff00, lsl #16
    mov      w10, #0xa07c
    movk     w10, #0xb51b, lsl #16
    str      x0, [sp, #0x30]
    ldr      x8, [sp, #0x18]
    str      w10, [x8]
    b        #0x3518b8
    adrp     x9, #0x54c000
    add      x9, x9, #0xc60
    ldrb     w8, [x9]
    eor      w8, w8, w13
    adrp     x14, #0x54c000
    strb     w8, [x14, #0xc80]
    ldrb     w8, [x9, #1]
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp, #0x18]
    str      w11, [x8]
    b        #0x3518b8
    ldrb     w8, [sp, #0x39]
    strb     w8, [x27]
    ldrb     w8, [x26]
    mov      w9, #0x14
    eor      w8, w8, w9
    strb     w8, [x27, #1]
    ldrb     w8, [x26, #1]
    mov      w9, #0x2e
    eor      w8, w8, w9
    strb     w8, [x27, #2]
    ldrb     w8, [x26, #2]
    eor      w8, w8, w12
    strb     w8, [x27, #3]
    ldrb     w8, [x26, #3]
    mov      w9, #0x4e
    eor      w8, w8, w9
    strb     w8, [x27, #4]
    ldrb     w8, [x26, #4]
    eor      w8, w8, #0xffffff8f
    strb     w8, [x27, #5]
    ldrb     w8, [x26, #5]
    eor      w8, w8, #0x77777777
    strb     w8, [x27, #6]
    ldrb     w8, [x26, #6]
    mov      w9, #0x2b
    eor      w8, w8, w9
    strb     w8, [x27, #7]
    ldrb     w8, [x26, #7]
    eor      w8, w8, #0xe0
    strb     w8, [x27, #8]
    ldrb     w8, [x26, #8]
    mov      w9, #0x5a
    eor      w8, w8, w9
    strb     w8, [x27, #9]
    ldrb     w8, [x26, #9]
    mov      w9, #0x62
    eor      w8, w8, w9
    strb     w8, [x27, #0xa]
    ldrb     w8, [x26, #0xa]
    mov      w9, #0xf4
    eor      w8, w8, w9
    strb     w8, [x27, #0xb]
    ldrb     w8, [x26, #0xb]
    mov      w9, #0xa8
    eor      w8, w8, w9
    strb     w8, [x27, #0xc]
    ldr      x8, [sp, #0x18]
    str      w21, [x8]
    b        #0x3518b8
    mov      w9, #0x10a7
    movk     w9, #0x84fe, lsl #16
    cmp      w8, w9
    b.ne     #0x3518b8
    ldp      x1, x0, [sp, #0x28]
    adrp     x3, #0x54c000
    add      x3, x3, #0xcc0
    ldr      w2, [sp, #0xc]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp, #0x10]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups filterPinned] IMP=0x351C1C bounds=0x351C1C-0x351FEC
loc_351C1C:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      w20, #0x2f71
    movk     w20, #0x532e, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x2cc
    ldar     w8, [x8]
    mov      w10, #0xb81e
    movk     w10, #0xc1d6, lsl #16
    str      w8, [sp, #0x2c]
    add      x8, sp, #0x10
    mov      w23, #0xe6ae
    movk     w23, #0xe99f, lsl #16
    str      w10, [sp, #0x10]
    mov      w24, #0xb81d
    movk     w24, #0xc1d6, lsl #16
    mov      w25, #0x9d3b
    movk     w25, #0x95a6, lsl #16
    str      x8, [sp, #8]
    mov      w11, #0xe6af
    movk     w11, #0xe99f, lsl #16
    mov      w12, #0x6dab
    movk     w12, #0xb2c1, lsl #16
    adrp     x27, #0x54c000
    add      x27, x27, #0xce0
    adrp     x28, #0x54c000
    add      x28, x28, #0xd00
    mov      w13, #0xa5
    mov      w14, #0x4087
    movk     w14, #0xdeba, lsl #16
    mov      w22, #0x7c89
    movk     w22, #0x483b, lsl #16
    adrp     x26, #0x54c000
    add      x26, x26, #0xd09
    adrp     x21, #0x54c000
    add      x21, x21, #0xcea
    mov      w19, #0x7c8a
    movk     w19, #0x483b, lsl #16
    ldr      w8, [sp, #0x10]
    cmp      w8, w23
    b.gt     #0x351d80
    cmp      w8, w24
    b.gt     #0x351dc0
    cmp      w8, w25
    b.eq     #0x351f68
    cmp      w8, w12
    b.ne     #0x351ccc
    ldrb     w8, [x27]
    mov      w9, #0xad
    eor      w8, w8, w9
    strb     w8, [x28]
    ldrb     w8, [x27, #1]
    eor      w8, w8, #0xaaaaaaaa
    strb     w8, [x28, #1]
    ldrb     w8, [x27, #2]
    eor      w8, w8, w13
    strb     w8, [x28, #2]
    ldrb     w8, [x27, #3]
    mov      w9, #0x4f
    eor      w8, w8, w9
    strb     w8, [x28, #3]
    ldrb     w8, [x27, #4]
    eor      w8, w8, #0xe
    strb     w8, [x28, #4]
    ldrb     w8, [x27, #5]
    mov      w9, #0x5c
    eor      w8, w8, w9
    strb     w8, [x28, #5]
    ldrb     w8, [x27, #6]
    mov      w9, #0x49
    eor      w8, w8, w9
    strb     w8, [x28, #6]
    ldrb     w8, [x27, #7]
    mov      w9, #0x41
    eor      w8, w8, w9
    strb     w8, [x28, #7]
    ldrb     w8, [x27, #8]
    mov      w9, #0x4b
    eor      w8, w8, w9
    strb     w8, [sp, #0x2a]
    ldr      x8, [sp, #8]
    str      w25, [x8]
    b        #0x351ccc
    cmp      w8, w22
    b.le     #0x351de8
    cmp      w8, w19
    b.eq     #0x351ef8
    cmp      w8, w20
    b.ne     #0x351ccc
    adrp     x8, #0x581000
    add      x8, x8, #0x2cc
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x60]
    str      x8, [sp, #0x20]
    ldr      x8, [sp, #8]
    str      w19, [x8]
    b        #0x351ccc
    cmp      w8, w10
    b.eq     #0x351f94
    cmp      w8, w14
    b.ne     #0x351ccc
    ldrb     w8, [sp, #0x2b]
    cmp      w8, #0
    csel     w8, w12, w20, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x351ccc
    cmp      w8, w11
    b.ne     #0x351fb0
    ldrb     w8, [sp, #0x29]
    strb     w8, [x26]
    ldrb     w8, [x21]
    eor      w8, w8, #0xffffffe1
    strb     w8, [x26, #1]
    ldrb     w8, [x21, #1]
    mov      w9, #0x36
    eor      w8, w8, w9
    strb     w8, [x26, #2]
    ldrb     w8, [x21, #2]
    mov      w9, #0xa0
    eor      w8, w8, w9
    strb     w8, [x26, #3]
    ldrb     w8, [x21, #3]
    eor      w8, w8, #0xfffffff3
    strb     w8, [x26, #4]
    ldrb     w8, [x21, #4]
    eor      w8, w8, #0x80
    strb     w8, [x26, #5]
    ldrb     w8, [x21, #5]
    mov      w9, #0x3a
    eor      w8, w8, w9
    strb     w8, [x26, #6]
    ldrb     w8, [x21, #6]
    eor      w8, w8, #3
    strb     w8, [x26, #7]
    ldrb     w8, [x21, #7]
    mov      w9, #0x34
    eor      w8, w8, w9
    strb     w8, [x26, #8]
    ldrb     w8, [x21, #8]
    eor      w8, w8, #0xffffff81
    strb     w8, [x26, #9]
    ldrb     w8, [x21, #9]
    mov      w9, #0x57
    eor      w8, w8, w9
    strb     w8, [x26, #0xa]
    ldrb     w8, [x21, #0xa]
    eor      w8, w8, w13
    strb     w8, [x26, #0xb]
    ldrb     w8, [x21, #0xb]
    mov      w9, #0x93
    eor      w8, w8, w9
    strb     w8, [x26, #0xc]
    ldrb     w8, [x21, #0xc]
    mov      w9, #0xbc
    eor      w8, w8, w9
    strb     w8, [x26, #0xd]
    ldrb     w8, [x21, #0xd]
    mov      w9, #0xe2
    eor      w8, w8, w9
    strb     w8, [x26, #0xe]
    ldrb     w8, [x21, #0xe]
    mov      w9, #0xda
    eor      w8, w8, w9
    strb     w8, [x26, #0xf]
    ldrb     w8, [x21, #0xf]
    eor      w8, w8, #0xeeeeeeee
    strb     w8, [x26, #0x10]
    ldrb     w8, [x21, #0x10]
    mov      w9, #0x51
    eor      w8, w8, w9
    strb     w8, [x26, #0x11]
    ldr      x8, [sp, #8]
    str      w20, [x8]
    b        #0x351ccc
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    ldr      x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x18]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x480]
    adrp     x2, #0x54c000
    add      x2, x2, #0xd40
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      w14, #0x4087
    movk     w14, #0xdeba, lsl #16
    mov      w13, #0xa5
    mov      w12, #0x6dab
    movk     w12, #0xb2c1, lsl #16
    mov      w11, #0xe6af
    movk     w11, #0xe99f, lsl #16
    mov      w10, #0xb81e
    movk     w10, #0xc1d6, lsl #16
    strb     w0, [sp, #0x17]
    ldr      x8, [sp, #8]
    mov      w9, #0xd84e
    movk     w9, #0xfd45, lsl #16
    str      w9, [x8]
    b        #0x351ccc
    ldrb     w8, [sp, #0x2a]
    adrp     x9, #0x54c000
    strb     w8, [x9, #0xd08]
    adrp     x8, #0x54c000
    ldrb     w8, [x8, #0xce9]
    mov      w9, #0xd7
    eor      w8, w8, w9
    strb     w8, [sp, #0x29]
    ldr      x8, [sp, #8]
    str      w11, [x8]
    b        #0x351ccc
    ldr      w8, [sp, #0x2c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x2b]
    ldr      x8, [sp, #8]
    str      w14, [x8]
    b        #0x351ccc
    mov      w9, #0xd84e
    movk     w9, #0xfd45, lsl #16
    cmp      w8, w9
    b.ne     #0x351ccc
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    ldrb     w0, [sp, #0x17]
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    ret      

// -[WCLGHomeGroups setFilterPinned:] IMP=0x351FEC bounds=0x351FEC-0x3523DC
loc_351FEC:
    sub      sp, sp, #0x80
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    mov      x19, x2
    adrp     x8, #0x581000
    add      x8, x8, #0x2d0
    mov      w24, #0xedb4
    movk     w24, #0x8960, lsl #16
    ldar     w8, [x8]
    str      w8, [sp, #0x1c]
    mov      w22, #0x990a
    movk     w22, #0xfc5f, lsl #16
    str      w22, [sp, #0x14]
    add      x8, sp, #0x14
    mov      w26, #0x9909
    movk     w26, #0xfc5f, lsl #16
    stp      x0, x8, [sp]
    mov      w27, #0x3eb7
    movk     w27, #0xab45, lsl #16
    adrp     x21, #0x54c000
    add      x21, x21, #0xd61
    adrp     x20, #0x54c000
    add      x20, x20, #0xd81
    mov      w25, #0x62f0
    movk     w25, #0x52e0, lsl #16
    adrp     x28, #0x54c000
    add      x28, x28, #0xd87
    adrp     x23, #0x54c000
    add      x23, x23, #0xd68
    ldr      w8, [sp, #0x14]
    cmp      w8, w26
    b.le     #0x3521d4
    cmp      w8, w25
    b.gt     #0x352274
    cmp      w8, w22
    b.eq     #0x352364
    mov      w9, #0xafae
    movk     w9, #0xb97, lsl #16
    cmp      w8, w9
    b.ne     #0x352074
    ldrb     w8, [sp, #0x1a]
    strb     w8, [x28]
    ldrb     w8, [x23]
    mov      w9, #0x8d
    eor      w8, w8, w9
    strb     w8, [x28, #1]
    ldrb     w8, [x23, #1]
    mov      w9, #0x27
    eor      w8, w8, w9
    strb     w8, [x28, #2]
    ldrb     w8, [x23, #2]
    eor      w8, w8, #0x1c
    strb     w8, [x28, #3]
    ldrb     w8, [x23, #3]
    eor      w8, w8, #7
    strb     w8, [x28, #4]
    ldrb     w8, [x23, #4]
    mov      w9, #0xa5
    eor      w8, w8, w9
    strb     w8, [x28, #5]
    ldrb     w8, [x23, #5]
    mov      w9, #0x5d
    eor      w8, w8, w9
    strb     w8, [x28, #6]
    ldrb     w8, [x23, #6]
    mov      w9, #0x5e
    eor      w8, w8, w9
    strb     w8, [x28, #7]
    ldrb     w8, [x23, #7]
    mov      w9, #0x91
    eor      w8, w8, w9
    strb     w8, [x28, #8]
    ldrb     w8, [x23, #8]
    mov      w9, #0x51
    eor      w8, w8, w9
    strb     w8, [x28, #9]
    ldrb     w8, [x23, #9]
    mov      w9, #0xea
    eor      w8, w8, w9
    strb     w8, [x28, #0xa]
    ldrb     w8, [x23, #0xa]
    mov      w9, #0x34
    eor      w8, w8, w9
    strb     w8, [x28, #0xb]
    ldrb     w8, [x23, #0xb]
    mov      w9, #0x7a
    eor      w8, w8, w9
    strb     w8, [x28, #0xc]
    ldrb     w8, [x23, #0xc]
    eor      w8, w8, #0xffffffe1
    strb     w8, [x28, #0xd]
    ldrb     w8, [x23, #0xd]
    mov      w9, #0x45
    eor      w8, w8, w9
    strb     w8, [x28, #0xe]
    ldrb     w8, [x23, #0xe]
    mov      w9, #0x50
    eor      w8, w8, w9
    strb     w8, [x28, #0xf]
    ldrb     w8, [x23, #0xf]
    mov      w9, #0x46
    eor      w8, w8, w9
    strb     w8, [x28, #0x10]
    ldrb     w8, [x23, #0x10]
    eor      w8, w8, #0x18
    strb     w8, [x28, #0x11]
    ldrb     w8, [x23, #0x11]
    mov      w9, #0x79
    eor      w8, w8, w9
    strb     w8, [x28, #0x12]
    ldrb     w8, [x23, #0x12]
    mov      w9, #0xfa
    eor      w8, w8, w9
    strb     w8, [x28, #0x13]
    ldr      x8, [sp, #8]
    str      w24, [x8]
    b        #0x352074
    cmp      w8, w27
    b.gt     #0x3522b4
    cmp      w8, w24
    b.eq     #0x3522f0
    mov      w9, #0xcb59
    movk     w9, #0x9317, lsl #16
    cmp      w8, w9
    b.ne     #0x352074
    ldrb     w8, [x21]
    mov      w9, #0x49
    eor      w8, w8, w9
    strb     w8, [x20]
    ldrb     w8, [x21, #1]
    mov      w9, #0x8b
    eor      w8, w8, w9
    strb     w8, [x20, #1]
    ldrb     w8, [x21, #2]
    mov      w9, #0xfa
    eor      w8, w8, w9
    strb     w8, [x20, #2]
    ldrb     w8, [x21, #3]
    mov      w9, #0xa
    eor      w8, w8, w9
    strb     w8, [x20, #3]
    ldrb     w8, [x21, #4]
    eor      w8, w8, #0xf0
    strb     w8, [x20, #4]
    ldrb     w8, [x21, #5]
    mov      w9, #0x34
    eor      w8, w8, w9
    strb     w8, [x20, #5]
    ldrb     w8, [x21, #6]
    mov      w9, #0x8c
    eor      w8, w8, w9
    strb     w8, [sp, #0x1a]
    ldr      x8, [sp, #8]
    mov      w9, #0xafae
    movk     w9, #0xb97, lsl #16
    str      w9, [x8]
    b        #0x352074
    mov      w9, #0x62f1
    movk     w9, #0x52e0, lsl #16
    cmp      w8, w9
    b.eq     #0x352388
    mov      w9, #0x443
    movk     w9, #0x6240, lsl #16
    cmp      w8, w9
    b.ne     #0x352074
    ldrb     w8, [sp, #0x1b]
    cmp      w8, #0
    mov      w8, #0x3eb8
    movk     w8, #0xab45, lsl #16
    csel     w8, w8, w24, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x352074
    mov      w9, #0x3eb8
    movk     w9, #0xab45, lsl #16
    cmp      w8, w9
    b.ne     #0x3523ac
    adrp     x8, #0x54c000
    ldrb     w8, [x8, #0xd60]
    mov      w9, #0x57
    eor      w8, w8, w9
    adrp     x9, #0x54c000
    strb     w8, [x9, #0xd80]
    ldr      x8, [sp, #8]
    mov      w9, #0xcb59
    movk     w9, #0x9317, lsl #16
    str      w9, [x8]
    b        #0x352074
    adrp     x8, #0x581000
    add      x8, x8, #0x2d0
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x350]
    mov      x2, x19
    adrp     x3, #0x54c000
    add      x3, x3, #0xdc0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    mov      w22, #0x990a
    movk     w22, #0xfc5f, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x54a000
    strb     w19, [x8, #0x4e0]
    ldr      x8, [sp, #8]
    mov      w9, #0x62f1
    movk     w9, #0x52e0, lsl #16
    str      w9, [x8]
    b        #0x352074
    ldr      w8, [sp, #0x1c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x1b]
    ldr      x8, [sp, #8]
    mov      w9, #0x443
    movk     w9, #0x6240, lsl #16
    str      w9, [x8]
    b        #0x352074
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    mov      w9, #0xfd39
    movk     w9, #0xacc7, lsl #16
    str      w9, [x8]
    b        #0x352074
    mov      w9, #0xfd39
    movk     w9, #0xacc7, lsl #16
    cmp      w8, w9
    b.ne     #0x352074
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    add      sp, sp, #0x80
    ret      

// -[WCLGHomeGroups showBadge] IMP=0x3523DC bounds=0x3523DC-0x352788
loc_3523DC:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      w19, #0x3f72
    movk     w19, #0xac36, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x2d4
    ldar     w8, [x8]
    mov      w9, #0x3a4a
    movk     w9, #0xc993, lsl #16
    str      w8, [sp, #0x2c]
    add      x8, sp, #0x14
    mov      w22, #0x9f51
    movk     w22, #0x2546, lsl #16
    str      w9, [sp, #0x14]
    mov      w23, #0x9edb
    movk     w23, #0xd1dc, lsl #16
    str      x8, [sp, #8]
    mov      w10, #0x4fdc
    movk     w10, #0x4b68, lsl #16
    mov      w26, #0x9f52
    movk     w26, #0x2546, lsl #16
    mov      w28, #0x9edc
    movk     w28, #0xd1dc, lsl #16
    mov      w12, #0xe8c4
    movk     w12, #0xfb99, lsl #16
    adrp     x24, #0x54c000
    add      x24, x24, #0xde0
    adrp     x21, #0x54c000
    add      x21, x21, #0xe00
    mov      w13, #0x199d
    movk     w13, #0x2de9, lsl #16
    mov      w25, #0x3088
    movk     w25, #0x4910, lsl #16
    adrp     x20, #0x54c000
    add      x20, x20, #0xe0c
    adrp     x27, #0x54c000
    add      x27, x27, #0xded
    ldr      w8, [sp, #0x14]
    cmp      w8, w22
    b.gt     #0x3524d0
    cmp      w8, w23
    b.gt     #0x3525a0
    cmp      w8, w19
    b.eq     #0x3526e8
    mov      w9, #0x3a4a
    movk     w9, #0xc993, lsl #16
    cmp      w8, w9
    b.ne     #0x352488
    ldr      w8, [sp, #0x2c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x2b]
    ldr      x8, [sp, #8]
    str      w26, [x8]
    b        #0x352488
    cmp      w8, w25
    b.gt     #0x352674
    cmp      w8, w26
    b.eq     #0x3526d0
    cmp      w8, w13
    b.ne     #0x352488
    ldrb     w8, [sp, #0x2a]
    mov      w9, #0x5b
    eor      w8, w8, w9
    strb     w8, [x20]
    ldrb     w8, [x27]
    mov      w9, #0x13
    eor      w8, w8, w9
    strb     w8, [x20, #1]
    ldrb     w8, [x27, #1]
    mov      w9, #0xa7
    eor      w8, w8, w9
    strb     w8, [x20, #2]
    ldrb     w8, [x27, #2]
    mov      w9, #0xa6
    eor      w8, w8, w9
    strb     w8, [x20, #3]
    ldrb     w8, [x27, #3]
    eor      w8, w8, #0xbbbbbbbb
    strb     w8, [x20, #4]
    ldrb     w8, [x27, #4]
    mov      w9, #0x32
    eor      w8, w8, w9
    strb     w8, [x20, #5]
    ldrb     w8, [x27, #5]
    mov      w9, #0x36
    eor      w8, w8, w9
    strb     w8, [x20, #6]
    ldrb     w8, [x27, #6]
    mov      w9, #0x8e
    eor      w8, w8, w9
    strb     w8, [x20, #7]
    ldrb     w8, [x27, #7]
    mov      w9, #0x75
    eor      w8, w8, w9
    strb     w8, [x20, #8]
    ldrb     w8, [x27, #8]
    mov      w9, #0x27
    eor      w8, w8, w9
    strb     w8, [x20, #9]
    ldrb     w8, [x27, #9]
    mov      w9, #0x4a
    eor      w8, w8, w9
    strb     w8, [sp, #0x29]
    ldr      x8, [sp, #8]
    str      w28, [x8]
    b        #0x352488
    cmp      w8, w28
    b.eq     #0x352704
    cmp      w8, w12
    b.ne     #0x352488
    ldrb     w8, [x24]
    mov      w9, #0x2e
    eor      w8, w8, w9
    strb     w8, [x21]
    ldrb     w8, [x24, #1]
    mov      w9, #0xdb
    eor      w8, w8, w9
    strb     w8, [x21, #1]
    ldrb     w8, [x24, #2]
    mov      w9, #0x94
    eor      w8, w8, w9
    strb     w8, [x21, #2]
    ldrb     w8, [x24, #3]
    mov      w11, #0x95
    eor      w8, w8, w11
    strb     w8, [x21, #3]
    ldrb     w8, [x24, #4]
    eor      w8, w8, w9
    strb     w8, [x21, #4]
    ldrb     w8, [x24, #5]
    mov      w9, #0x23
    eor      w8, w8, w9
    strb     w8, [x21, #5]
    ldrb     w8, [x24, #6]
    eor      w8, w8, #0xfe
    strb     w8, [x21, #6]
    ldrb     w8, [x24, #7]
    eor      w8, w8, #0xffffffc3
    strb     w8, [x21, #7]
    ldrb     w8, [x24, #8]
    mov      w9, #0x42
    eor      w8, w8, w9
    strb     w8, [x21, #8]
    ldrb     w8, [x24, #9]
    mov      w9, #0x98
    eor      w8, w8, w9
    strb     w8, [x21, #9]
    ldrb     w8, [x24, #0xa]
    eor      w8, w8, #0xf
    strb     w8, [x21, #0xa]
    ldrb     w8, [x24, #0xb]
    mov      w9, #0x21
    eor      w8, w8, w9
    strb     w8, [x21, #0xb]
    ldrb     w8, [x24, #0xc]
    strb     w8, [sp, #0x2a]
    ldr      x8, [sp, #8]
    str      w13, [x8]
    b        #0x352488
    cmp      w8, w10
    b.ne     #0x352734
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      w13, #0x199d
    movk     w13, #0x2de9, lsl #16
    mov      w12, #0xe8c4
    movk     w12, #0xfb99, lsl #16
    mov      w10, #0x4fdc
    movk     w10, #0x4b68, lsl #16
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x480]
    stp      x8, x0, [sp, #0x18]
    ldr      x8, [sp, #8]
    mov      w9, #0x3089
    movk     w9, #0x4910, lsl #16
    str      w9, [x8]
    b        #0x352488
    ldrb     w8, [sp, #0x2b]
    cmp      w8, #0
    csel     w8, w12, w19, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x352488
    adrp     x8, #0x581000
    add      x8, x8, #0x2d4
    mov      w9, #1
    stlr     w9, [x8]
    ldr      x8, [sp, #8]
    str      w10, [x8]
    b        #0x352488
    ldrb     w8, [sp, #0x29]
    adrp     x9, #0x54c000
    add      x9, x9, #0xe16
    strb     w8, [x9]
    adrp     x8, #0x54c000
    ldrb     w8, [x8, #0xdf7]
    mov      w11, #0xcb
    eor      w8, w8, w11
    strb     w8, [x9, #1]
    ldr      x8, [sp, #8]
    str      w19, [x8]
    b        #0x352488
    mov      w9, #0x3089
    movk     w9, #0x4910, lsl #16
    cmp      w8, w9
    b.ne     #0x352488
    ldp      x1, x0, [sp, #0x18]
    adrp     x2, #0x54c000
    add      x2, x2, #0xe40
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    ret      

// -[WCLGHomeGroups setShowBadge:] IMP=0x352788 bounds=0x352788-0x352B4C
loc_352788:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    str      w2, [sp, #0x14]
    str      x0, [sp, #8]
    adrp     x8, #0x581000
    add      x8, x8, #0x2d8
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w8, #0x8b58
    movk     w8, #0xb4a4, lsl #16
    str      w8, [sp, #0x24]
    add      x8, sp, #0x24
    mov      w25, #0xd492
    movk     w25, #0xf757, lsl #16
    str      x8, [sp, #0x18]
    mov      w26, #0x9fdd
    movk     w26, #0xbea6, lsl #16
    adrp     x28, #0x54c000
    add      x28, x28, #0xe60
    adrp     x23, #0x54c000
    add      x23, x23, #0xe80
    adrp     x20, #0x54c000
    add      x20, x20, #0xe91
    adrp     x21, #0x54c000
    add      x21, x21, #0xe72
    mov      w24, #0x3c5d
    movk     w24, #0x49c5, lsl #16
    adrp     x22, #0x54c000
    add      x22, x22, #0xe68
    adrp     x27, #0x54c000
    add      x27, x27, #0xe88
    mov      w19, #0x3c5e
    movk     w19, #0x49c5, lsl #16
    ldr      w8, [sp, #0x24]
    cmp      w8, w25
    b.le     #0x352880
    cmp      w8, w24
    b.gt     #0x3528cc
    mov      w9, #0xd493
    movk     w9, #0xf757, lsl #16
    cmp      w8, w9
    b.eq     #0x352a38
    mov      w9, #0xb6f7
    movk     w9, #0x3a75, lsl #16
    cmp      w8, w9
    b.ne     #0x352824
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    mov      w8, #0x47c4
    movk     w8, #0x66d6, lsl #16
    mov      w9, #0x736
    movk     w9, #0x9af2, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #0x18]
    str      w8, [x9]
    b        #0x352824
    cmp      w8, w26
    b.gt     #0x352928
    mov      w9, #0x736
    movk     w9, #0x9af2, lsl #16
    cmp      w8, w9
    b.eq     #0x3529ac
    mov      w9, #0x8b58
    movk     w9, #0xb4a4, lsl #16
    cmp      w8, w9
    b.ne     #0x352824
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp, #0x18]
    mov      w9, #0xb6f7
    movk     w9, #0x3a75, lsl #16
    str      w9, [x8]
    b        #0x352824
    cmp      w8, w19
    b.eq     #0x352ae0
    mov      w9, #0x47c4
    movk     w9, #0x66d6, lsl #16
    cmp      w8, w9
    b.ne     #0x352824
    adrp     x8, #0x581000
    add      x8, x8, #0x2d8
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x350]
    stp      x8, x0, [sp, #0x28]
    ldr      x8, [sp, #0x18]
    str      w19, [x8]
    b        #0x352824
    mov      w9, #0x9fde
    movk     w9, #0xbea6, lsl #16
    cmp      w8, w9
    b.ne     #0x352b10
    ldrb     w8, [sp, #0x3a]
    strb     w8, [x20]
    ldrb     w8, [x21]
    mov      w9, #0x12
    eor      w8, w8, w9
    strb     w8, [x20, #1]
    ldrb     w8, [x21, #1]
    mov      w9, #0x5d
    eor      w8, w8, w9
    strb     w8, [x20, #2]
    ldrb     w8, [x21, #2]
    mov      w9, #0x31
    eor      w8, w8, w9
    strb     w8, [x20, #3]
    ldrb     w8, [x21, #3]
    mov      w9, #0x75
    eor      w8, w8, w9
    strb     w8, [x20, #4]
    ldrb     w8, [x21, #4]
    strb     w8, [x20, #5]
    ldrb     w8, [x21, #5]
    mov      w9, #0xb4
    eor      w8, w8, w9
    strb     w8, [x20, #6]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x47c4
    movk     w9, #0x66d6, lsl #16
    str      w9, [x8]
    b        #0x352824
    ldrb     w8, [x28]
    mov      w9, #0x27
    eor      w8, w8, w9
    strb     w8, [x23]
    ldrb     w8, [x28, #1]
    mov      w9, #0x95
    eor      w8, w8, w9
    strb     w8, [x23, #1]
    ldrb     w8, [x28, #2]
    mov      w9, #0xbe
    eor      w8, w8, w9
    strb     w8, [x23, #2]
    ldrb     w8, [x28, #3]
    eor      w8, w8, #4
    strb     w8, [x23, #3]
    ldrb     w8, [x28, #4]
    mov      w9, #0x49
    eor      w8, w8, w9
    strb     w8, [x23, #4]
    ldrb     w8, [x28, #5]
    eor      w8, w8, #0xffffff83
    strb     w8, [x23, #5]
    ldrb     w8, [x28, #6]
    mov      w9, #0x98
    eor      w8, w8, w9
    strb     w8, [x23, #6]
    ldrb     w8, [x28, #7]
    mov      w9, #0xcd
    eor      w8, w8, w9
    strb     w8, [x23, #7]
    ldr      x8, [sp, #0x18]
    mov      w9, #0xd493
    movk     w9, #0xf757, lsl #16
    str      w9, [x8]
    b        #0x352824
    ldrb     w8, [x22]
    mov      w9, #0xe9
    eor      w8, w8, w9
    strb     w8, [x27]
    ldrb     w8, [x22, #1]
    eor      w8, w8, #0x38
    strb     w8, [x27, #1]
    ldrb     w8, [x22, #2]
    mov      w9, #0x1a
    eor      w8, w8, w9
    strb     w8, [x27, #2]
    ldrb     w8, [x22, #3]
    eor      w8, w8, #0xfffffffd
    strb     w8, [x27, #3]
    ldrb     w8, [x22, #4]
    eor      w8, w8, #0x7c
    strb     w8, [x27, #4]
    ldrb     w8, [x22, #5]
    mov      w9, #0xa9
    eor      w8, w8, w9
    strb     w8, [x27, #5]
    ldrb     w8, [x22, #6]
    mov      w9, #0xad
    eor      w8, w8, w9
    strb     w8, [x27, #6]
    ldrb     w8, [x22, #7]
    mov      w9, #0xb2
    eor      w8, w8, w9
    strb     w8, [x27, #7]
    ldrb     w8, [x22, #8]
    mov      w9, #0x73
    eor      w8, w8, w9
    strb     w8, [x27, #8]
    ldrb     w8, [x22, #9]
    mov      w9, #0x8a
    eor      w8, w8, w9
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x9fde
    movk     w9, #0xbea6, lsl #16
    str      w9, [x8]
    b        #0x352824
    ldp      x1, x0, [sp, #0x28]
    ldr      w2, [sp, #0x14]
    adrp     x3, #0x54c000
    add      x3, x3, #0xec0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x18]
    mov      w9, #0xd303
    movk     w9, #0xcc91, lsl #16
    str      w9, [x8]
    b        #0x352824
    mov      w9, #0xd303
    movk     w9, #0xcc91, lsl #16
    cmp      w8, w9
    b.ne     #0x352824
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp, #8]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups showUnreadBadge] IMP=0x352B4C bounds=0x352B4C-0x352F34
loc_352B4C:
    sub      sp, sp, #0x80
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    mov      w19, #0xea47
    movk     w19, #0x31, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x2dc
    ldar     w8, [x8]
    mov      w9, #0x5df3
    movk     w9, #0xe09f, lsl #16
    str      w8, [sp, #0x1c]
    add      x8, sp, #0xc
    mov      w22, #0xea46
    movk     w22, #0x31, lsl #16
    str      w9, [sp, #0xc]
    mov      w23, #0xaff
    movk     w23, #0xe59e, lsl #16
    mov      w24, #0x6c75
    movk     w24, #0xa9f4, lsl #16
    str      x8, [sp]
    adrp     x25, #0x54c000
    add      x25, x25, #0xee0
    adrp     x26, #0x54c000
    add      x26, x26, #0xf00
    mov      w10, #0xff12
    movk     w10, #0x5ff9, lsl #16
    mov      w11, #0x9708
    movk     w11, #0xec7e, lsl #16
    mov      w21, #0xe13b
    movk     w21, #0x4a1b, lsl #16
    mov      w20, #0xe13c
    movk     w20, #0x4a1b, lsl #16
    mov      w12, #0xff6a
    movk     w12, #0x11f, lsl #16
    adrp     x28, #0x54c000
    add      x28, x28, #0xef6
    adrp     x27, #0x54c000
    add      x27, x27, #0xf16
    ldr      w8, [sp, #0xc]
    cmp      w8, w22
    b.le     #0x352c54
    cmp      w8, w21
    b.gt     #0x352c90
    cmp      w8, w19
    b.eq     #0x352e70
    cmp      w8, w12
    b.ne     #0x352bf8
    adrp     x9, #0x54c000
    add      x9, x9, #0xefc
    ldrb     w8, [x9]
    eor      w8, w8, #0x40
    adrp     x13, #0x54c000
    add      x13, x13, #0xf1c
    strb     w8, [x13]
    ldrb     w8, [x9, #1]
    mov      w9, #0x3b
    eor      w8, w8, w9
    strb     w8, [x13, #1]
    ldr      x8, [sp]
    str      w19, [x8]
    b        #0x352bf8
    cmp      w8, w23
    b.gt     #0x352d00
    cmp      w8, w24
    b.eq     #0x352d20
    mov      w9, #0x5df3
    movk     w9, #0xe09f, lsl #16
    cmp      w8, w9
    b.ne     #0x352bf8
    ldr      w8, [sp, #0x1c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x1b]
    ldr      x8, [sp]
    str      w11, [x8]
    b        #0x352bf8
    cmp      w8, w20
    b.eq     #0x352e8c
    cmp      w8, w10
    b.ne     #0x352bf8
    ldrb     w8, [x28]
    mov      w9, #0x34
    eor      w8, w8, w9
    strb     w8, [x27]
    ldrb     w8, [x28, #1]
    eor      w8, w8, #0xffffffc3
    strb     w8, [x27, #1]
    ldrb     w8, [x28, #2]
    mov      w9, #0x65
    eor      w8, w8, w9
    strb     w8, [x27, #2]
    ldrb     w8, [x28, #3]
    mov      w9, #0xe5
    eor      w8, w8, w9
    strb     w8, [x27, #3]
    ldrb     w8, [x28, #4]
    eor      w8, w8, #0xffffff83
    strb     w8, [x27, #4]
    ldrb     w8, [x28, #5]
    eor      w8, w8, #0x1e
    strb     w8, [x27, #5]
    ldr      x8, [sp]
    str      w12, [x8]
    b        #0x352bf8
    cmp      w8, w11
    b.ne     #0x352ed8
    ldrb     w8, [sp, #0x1b]
    cmp      w8, #0
    csel     w8, w24, w19, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x352bf8
    ldrb     w8, [x25]
    mov      w9, #0x61
    eor      w8, w8, w9
    strb     w8, [x26]
    ldrb     w8, [x25, #1]
    mov      w9, #0x50
    eor      w8, w8, w9
    strb     w8, [x26, #1]
    ldrb     w8, [x25, #2]
    mov      w9, #0x46
    eor      w8, w8, w9
    strb     w8, [x26, #2]
    ldrb     w8, [x25, #3]
    eor      w8, w8, #8
    strb     w8, [x26, #3]
    ldrb     w8, [x25, #4]
    eor      w8, w8, #0xffffffc7
    strb     w8, [x26, #4]
    ldrb     w8, [x25, #5]
    mov      w9, #0xbe
    eor      w8, w8, w9
    strb     w8, [x26, #5]
    ldrb     w8, [x25, #6]
    mov      w9, #0xc5
    eor      w8, w8, w9
    strb     w8, [x26, #6]
    ldrb     w8, [x25, #7]
    mov      w9, #0x9d
    eor      w8, w8, w9
    strb     w8, [x26, #7]
    ldrb     w8, [x25, #8]
    mov      w9, #0x5d
    eor      w8, w8, w9
    strb     w8, [x26, #8]
    ldrb     w8, [x25, #9]
    mov      w9, #0xd6
    eor      w8, w8, w9
    strb     w8, [x26, #9]
    ldrb     w8, [x25, #0xa]
    eor      w8, w8, #0xffffffc1
    strb     w8, [x26, #0xa]
    ldrb     w8, [x25, #0xb]
    mov      w9, #0x23
    eor      w8, w8, w9
    strb     w8, [x26, #0xb]
    ldrb     w8, [x25, #0xc]
    mov      w9, #0x57
    eor      w8, w8, w9
    strb     w8, [x26, #0xc]
    ldrb     w8, [x25, #0xd]
    eor      w8, w8, #0xf
    strb     w8, [x26, #0xd]
    ldrb     w8, [x25, #0xe]
    eor      w8, w8, #0xc
    strb     w8, [x26, #0xe]
    ldrb     w8, [x25, #0xf]
    mov      w9, #0x21
    eor      w8, w8, w9
    strb     w8, [x26, #0xf]
    ldrb     w8, [x25, #0x10]
    mov      w9, #0xd1
    eor      w8, w8, w9
    strb     w8, [x26, #0x10]
    ldrb     w8, [x25, #0x11]
    mov      w9, #0x3d
    eor      w8, w8, w9
    strb     w8, [x26, #0x11]
    ldrb     w8, [x25, #0x12]
    eor      w8, w8, #0xffffffc1
    strb     w8, [x26, #0x12]
    ldrb     w8, [x25, #0x13]
    mov      w9, #0x95
    eor      w8, w8, w9
    strb     w8, [x26, #0x13]
    ldrb     w8, [x25, #0x14]
    eor      w8, w8, #6
    strb     w8, [x26, #0x14]
    ldrb     w8, [x25, #0x15]
    mov      w9, #0x8b
    eor      w8, w8, w9
    strb     w8, [x26, #0x15]
    ldr      x8, [sp]
    str      w10, [x8]
    b        #0x352bf8
    adrp     x8, #0x581000
    add      x8, x8, #0x2dc
    mov      w9, #1
    stlr     w9, [x8]
    ldr      x8, [sp]
    str      w20, [x8]
    b        #0x352bf8
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      w12, #0xff6a
    movk     w12, #0x11f, lsl #16
    mov      w11, #0x9708
    movk     w11, #0xec7e, lsl #16
    mov      w10, #0xff12
    movk     w10, #0x5ff9, lsl #16
    str      x0, [sp, #0x10]
    ldr      x8, [sp]
    mov      w9, #0xb00
    movk     w9, #0xe59e, lsl #16
    str      w9, [x8]
    b        #0x352bf8
    mov      w9, #0xb00
    movk     w9, #0xe59e, lsl #16
    cmp      w8, w9
    b.ne     #0x352bf8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x480]
    ldr      x0, [sp, #0x10]
    adrp     x2, #0x54c000
    add      x2, x2, #0xf40
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    ldr      x0, [sp, #0x10]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    add      sp, sp, #0x80
    ret      

// -[WCLGHomeGroups setShowUnreadBadge:] IMP=0x352F34 bounds=0x352F34-0x353368
loc_352F34:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    str      w2, [sp, #0x14]
    str      x0, [sp, #8]
    adrp     x8, #0x581000
    add      x8, x8, #0x2e0
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w8, #0x8914
    movk     w8, #0x8cbf, lsl #16
    str      w8, [sp, #0x24]
    add      x8, sp, #0x24
    mov      w25, #0xf3fb
    movk     w25, #0xe32b, lsl #16
    str      x8, [sp, #0x18]
    mov      w26, #0x3ec9
    movk     w26, #0xa674, lsl #16
    mov      w23, #0xc7c0
    movk     w23, #0x40da, lsl #16
    adrp     x21, #0x54c000
    add      x21, x21, #0xf94
    adrp     x24, #0x54c000
    add      x24, x24, #0xf75
    mov      w20, #0xc7c1
    movk     w20, #0x40da, lsl #16
    adrp     x27, #0x54c000
    add      x27, x27, #0xf60
    adrp     x22, #0x54c000
    add      x22, x22, #0xf80
    adrp     x19, #0x54c000
    add      x19, x19, #0xf88
    adrp     x28, #0x54c000
    add      x28, x28, #0xf69
    ldr      w8, [sp, #0x24]
    cmp      w8, w25
    b.le     #0x353024
    cmp      w8, w23
    b.gt     #0x353098
    mov      w9, #0xf3fc
    movk     w9, #0xe32b, lsl #16
    cmp      w8, w9
    b.eq     #0x3531e4
    mov      w9, #0x613f
    movk     w9, #0x3d68, lsl #16
    cmp      w8, w9
    b.ne     #0x352fd0
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    mov      w8, #0x165
    movk     w8, #0xd2c5, lsl #16
    csel     w8, w20, w8, ne
    ldr      x9, [sp, #0x18]
    str      w8, [x9]
    b        #0x352fd0
    cmp      w8, w26
    b.le     #0x353188
    mov      w9, #0x3eca
    movk     w9, #0xa674, lsl #16
    cmp      w8, w9
    b.eq     #0x3531bc
    mov      w9, #0x165
    movk     w9, #0xd2c5, lsl #16
    cmp      w8, w9
    b.ne     #0x352fd0
    adrp     x8, #0x581000
    add      x8, x8, #0x2e0
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x350]
    stp      x8, x0, [sp, #0x28]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x3eca
    movk     w9, #0xa674, lsl #16
    str      w9, [x8]
    b        #0x352fd0
    cmp      w8, w20
    b.eq     #0x353288
    mov      w9, #0x5920
    movk     w9, #0x5f7d, lsl #16
    cmp      w8, w9
    b.ne     #0x352fd0
    ldrb     w8, [sp, #0x3a]
    strb     w8, [x19]
    ldrb     w8, [x28]
    mov      w9, #0xb1
    eor      w8, w8, w9
    strb     w8, [x19, #1]
    ldrb     w8, [x28, #1]
    mov      w9, #0x6b
    eor      w8, w8, w9
    strb     w8, [x19, #2]
    ldrb     w8, [x28, #2]
    mov      w9, #0x2c
    eor      w8, w8, w9
    strb     w8, [x19, #3]
    ldrb     w8, [x28, #3]
    mov      w9, #0xd5
    eor      w8, w8, w9
    strb     w8, [x19, #4]
    ldrb     w8, [x28, #4]
    mov      w9, #0xd7
    eor      w8, w8, w9
    strb     w8, [x19, #5]
    ldrb     w8, [x28, #5]
    mov      w9, #0xa8
    eor      w8, w8, w9
    strb     w8, [x19, #6]
    ldrb     w8, [x28, #6]
    mov      w9, #0x56
    eor      w8, w8, w9
    strb     w8, [x19, #7]
    ldrb     w8, [x28, #7]
    mov      w9, #0xd8
    eor      w8, w8, w9
    strb     w8, [x19, #8]
    ldrb     w8, [x28, #8]
    eor      w8, w8, #0xf0
    strb     w8, [x19, #9]
    ldrb     w8, [x28, #9]
    mov      w9, #0x9a
    eor      w8, w8, w9
    strb     w8, [x19, #0xa]
    ldrb     w8, [x28, #0xa]
    mov      w9, #0xa1
    eor      w8, w8, w9
    strb     w8, [x19, #0xb]
    ldrb     w8, [x28, #0xb]
    mov      w9, #0xb7
    eor      w8, w8, w9
    strb     w8, [sp, #0x39]
    ldr      x8, [sp, #0x18]
    mov      w9, #0xf3fc
    movk     w9, #0xe32b, lsl #16
    str      w9, [x8]
    b        #0x352fd0
    mov      w9, #0x8914
    movk     w9, #0x8cbf, lsl #16
    cmp      w8, w9
    b.ne     #0x353324
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x613f
    movk     w9, #0x3d68, lsl #16
    str      w9, [x8]
    b        #0x352fd0
    ldp      x1, x0, [sp, #0x28]
    ldr      w2, [sp, #0x14]
    adrp     x3, #0x54c000
    add      x3, x3, #0xfc0
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x18]
    mov      w9, #0x6175
    movk     w9, #0x8199, lsl #16
    str      w9, [x8]
    b        #0x352fd0
    ldrb     w8, [sp, #0x39]
    strb     w8, [x21]
    ldrb     w8, [x24]
    mov      w9, #0x68
    eor      w8, w8, w9
    strb     w8, [x21, #1]
    ldrb     w8, [x24, #1]
    mov      w9, #0x95
    eor      w8, w8, w9
    strb     w8, [x21, #2]
    ldrb     w8, [x24, #2]
    mov      w9, #0xce
    eor      w8, w8, w9
    strb     w8, [x21, #3]
    ldrb     w8, [x24, #3]
    mov      w9, #0x86
    eor      w8, w8, w9
    strb     w8, [x21, #4]
    ldrb     w8, [x24, #4]
    eor      w8, w8, #0xffffffe7
    strb     w8, [x21, #5]
    ldrb     w8, [x24, #5]
    eor      w8, w8, #0xfffffff1
    strb     w8, [x21, #6]
    ldrb     w8, [x24, #6]
    mov      w9, #0x45
    eor      w8, w8, w9
    strb     w8, [x21, #7]
    ldrb     w8, [x24, #7]
    mov      w9, #0xeb
    eor      w8, w8, w9
    strb     w8, [x21, #8]
    ldrb     w8, [x24, #8]
    mov      w9, #0xab
    eor      w8, w8, w9
    strb     w8, [x21, #9]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x165
    movk     w9, #0xd2c5, lsl #16
    str      w9, [x8]
    b        #0x352fd0
    ldrb     w8, [x27]
    mov      w9, #0x91
    eor      w8, w8, w9
    strb     w8, [x22]
    ldrb     w8, [x27, #1]
    mov      w9, #0x1b
    eor      w8, w8, w9
    strb     w8, [x22, #1]
    ldrb     w8, [x27, #2]
    eor      w8, w8, #0xfffffff7
    strb     w8, [x22, #2]
    ldrb     w8, [x27, #3]
    mvn      w8, w8
    strb     w8, [x22, #3]
    ldrb     w8, [x27, #4]
    mov      w9, #0xd3
    eor      w8, w8, w9
    strb     w8, [x22, #4]
    ldrb     w8, [x27, #5]
    mov      w9, #0x8d
    eor      w8, w8, w9
    strb     w8, [x22, #5]
    ldrb     w8, [x27, #6]
    mov      w9, #0xa4
    eor      w8, w8, w9
    strb     w8, [x22, #6]
    ldrb     w8, [x27, #7]
    mov      w9, #0xb3
    eor      w8, w8, w9
    strb     w8, [x22, #7]
    ldrb     w8, [x27, #8]
    mov      w9, #0x9b
    eor      w8, w8, w9
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x5920
    movk     w9, #0x5f7d, lsl #16
    str      w9, [x8]
    b        #0x352fd0
    mov      w9, #0x6175
    movk     w9, #0x8199, lsl #16
    cmp      w8, w9
    b.ne     #0x352fd0
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp, #8]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups groupTapHapticEnabled] IMP=0x353368 bounds=0x353368-0x3536F4
loc_353368:
    sub      sp, sp, #0x80
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    mov      w21, #0xe61c
    movk     w21, #0x95f, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x2e4
    ldar     w8, [x8]
    mov      w9, #0x1974
    movk     w9, #0xc4ed, lsl #16
    str      w8, [sp, #0x1c]
    add      x8, sp, #8
    mov      w24, #0xe61b
    movk     w24, #0x95f, lsl #16
    str      w9, [sp, #8]
    mov      w25, #0xbc72
    movk     w25, #0xc61b, lsl #16
    mov      w10, #0x9d48
    movk     w10, #0x3385, lsl #16
    str      x8, [sp]
    mov      w28, #0xbc73
    movk     w28, #0xc61b, lsl #16
    mov      w11, #0x9d
    adrp     x19, #0x54d000
    add      x19, x19, #1
    adrp     x23, #0x54c000
    add      x23, x23, #0xfe2
    mov      w12, #0xa78b
    movk     w12, #0x2b92, lsl #16
    mov      w13, #0x5ba7
    movk     w13, #0xee8d, lsl #16
    mov      w27, #0x9d47
    movk     w27, #0x3385, lsl #16
    adrp     x22, #0x54d000
    add      x22, x22, #8
    adrp     x26, #0x54c000
    add      x26, x26, #0xfe9
    mov      w14, #0xe1ad
    movk     w14, #0x4b25, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w24
    b.le     #0x353510
    cmp      w8, w27
    b.gt     #0x3535a0
    cmp      w8, w21
    b.eq     #0x353680
    cmp      w8, w12
    b.ne     #0x353418
    ldrb     w8, [sp, #0x19]
    mov      w9, #0xe9
    eor      w8, w8, w9
    strb     w8, [x22]
    ldrb     w8, [x26]
    mov      w9, #0x42
    eor      w8, w8, w9
    strb     w8, [x22, #1]
    ldrb     w8, [x26, #1]
    eor      w8, w8, #0x1c
    strb     w8, [x22, #2]
    ldrb     w8, [x26, #2]
    eor      w8, w8, w11
    strb     w8, [x22, #3]
    ldrb     w8, [x26, #3]
    eor      w8, w8, #2
    strb     w8, [x22, #4]
    ldrb     w8, [x26, #4]
    eor      w8, w8, #0x1f
    strb     w8, [x22, #5]
    ldrb     w8, [x26, #5]
    mov      w9, #0xaf
    eor      w8, w8, w9
    strb     w8, [x22, #6]
    ldrb     w8, [x26, #6]
    eor      w8, w8, #8
    strb     w8, [x22, #7]
    ldrb     w8, [x26, #7]
    mov      w9, #0x2a
    eor      w8, w8, w9
    strb     w8, [x22, #8]
    ldrb     w8, [x26, #8]
    eor      w8, w8, #0xffffffe7
    strb     w8, [x22, #9]
    ldrb     w8, [x26, #9]
    eor      w8, w8, #0xeeeeeeee
    strb     w8, [x22, #0xa]
    ldrb     w8, [x26, #0xa]
    eor      w8, w8, #0x30
    strb     w8, [x22, #0xb]
    ldrb     w8, [x26, #0xb]
    eor      w8, w8, #8
    strb     w8, [x22, #0xc]
    ldrb     w8, [x26, #0xc]
    eor      w8, w8, #0x7f
    strb     w8, [x22, #0xd]
    ldrb     w8, [x26, #0xd]
    mov      w9, #9
    eor      w8, w8, w9
    strb     w8, [x22, #0xe]
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x353418
    cmp      w8, w25
    b.le     #0x3535e0
    cmp      w8, w28
    b.eq     #0x35360c
    cmp      w8, w13
    b.ne     #0x353418
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    ldr      x0, [sp, #0x10]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x480]
    adrp     x2, #0x54d000
    add      x2, x2, #0x40
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0xf]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      w14, #0xe1ad
    movk     w14, #0x4b25, lsl #16
    mov      w13, #0x5ba7
    movk     w13, #0xee8d, lsl #16
    mov      w12, #0xa78b
    movk     w12, #0x2b92, lsl #16
    mov      w11, #0x9d
    mov      w10, #0x9d48
    movk     w10, #0x3385, lsl #16
    ldr      x8, [sp]
    mov      w9, #0xdcef
    movk     w9, #0xa6ed, lsl #16
    str      w9, [x8]
    b        #0x353418
    cmp      w8, w10
    b.eq     #0x3536a8
    cmp      w8, w14
    b.ne     #0x353418
    adrp     x15, #0x54c000
    add      x15, x15, #0xfe0
    ldrb     w8, [x15]
    mov      w9, #0x82
    eor      w8, w8, w9
    adrp     x9, #0x54d000
    strb     w8, [x9]
    ldrb     w8, [x15, #1]
    strb     w8, [sp, #0x1a]
    ldr      x8, [sp]
    str      w28, [x8]
    b        #0x353418
    mov      w9, #0x1974
    movk     w9, #0xc4ed, lsl #16
    cmp      w8, w9
    b.ne     #0x3536c0
    ldr      w8, [sp, #0x1c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x1b]
    ldr      x8, [sp]
    str      w10, [x8]
    b        #0x353418
    ldrb     w8, [sp, #0x1a]
    eor      w8, w8, w11
    strb     w8, [x19]
    ldrb     w8, [x23]
    mov      w9, #0xac
    eor      w8, w8, w9
    strb     w8, [x19, #1]
    ldrb     w8, [x23, #1]
    mov      w9, #0x73
    eor      w8, w8, w9
    strb     w8, [x19, #2]
    ldrb     w8, [x23, #2]
    mov      w9, #0xa
    eor      w8, w8, w9
    strb     w8, [x19, #3]
    ldrb     w8, [x23, #3]
    eor      w8, w8, #0x3f
    strb     w8, [x19, #4]
    ldrb     w8, [x23, #4]
    eor      w8, w8, #0x30
    strb     w8, [x19, #5]
    ldrb     w8, [x23, #5]
    eor      w8, w8, #0xffffffcf
    strb     w8, [x19, #6]
    ldrb     w8, [x23, #6]
    strb     w8, [sp, #0x19]
    ldr      x8, [sp]
    str      w12, [x8]
    b        #0x353418
    adrp     x8, #0x581000
    add      x8, x8, #0x2e4
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x60]
    str      x8, [sp, #0x10]
    ldr      x8, [sp]
    str      w13, [x8]
    b        #0x353418
    ldrb     w8, [sp, #0x1b]
    cmp      w8, #0
    csel     w8, w14, w21, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x353418
    mov      w9, #0xdcef
    movk     w9, #0xa6ed, lsl #16
    cmp      w8, w9
    b.ne     #0x353418
    ldrb     w0, [sp, #0xf]
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    add      sp, sp, #0x80
    ret      

// -[WCLGHomeGroups setGroupTapHapticEnabled:] IMP=0x3536F4 bounds=0x3536F4-0x353A98
loc_3536F4:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    str      w2, [sp, #0x14]
    str      x0, [sp, #8]
    mov      w10, #0x4d1c
    movk     w10, #0x56b3, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x2e8
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w8, #0xfb1a
    movk     w8, #0x9de8, lsl #16
    str      w8, [sp, #0x24]
    add      x8, sp, #0x24
    mov      w25, #0xc364
    movk     w25, #0x2b9a, lsl #16
    str      x8, [sp, #0x18]
    mov      w26, #0xf6a9
    movk     w26, #0xf25b, lsl #16
    mov      w27, #0x8bba
    movk     w27, #0x8e6e, lsl #16
    mov      w19, #0xc365
    movk     w19, #0x2b9a, lsl #16
    mov      w12, #0x4d94
    movk     w12, #0x2194, lsl #16
    mov      w24, #0xfeb0
    movk     w24, #0x699f, lsl #16
    adrp     x20, #0x54d000
    add      x20, x20, #0x62
    adrp     x28, #0x54d000
    add      x28, x28, #0x82
    mov      w13, #0x46
    mov      w14, #0x1afb
    movk     w14, #0x7ead, lsl #16
    mov      w21, #0xfeb1
    movk     w21, #0x699f, lsl #16
    adrp     x23, #0x54d000
    add      x23, x23, #0x6a
    adrp     x22, #0x54d000
    add      x22, x22, #0x8a
    ldr      w8, [sp, #0x24]
    cmp      w8, w25
    b.le     #0x3537f8
    cmp      w8, w24
    b.gt     #0x353834
    cmp      w8, w19
    b.eq     #0x35396c
    cmp      w8, w10
    b.ne     #0x3537ac
    adrp     x8, #0x581000
    add      x8, x8, #0x2e8
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x60]
    str      x8, [sp, #0x30]
    ldr      x8, [sp, #0x18]
    str      w21, [x8]
    b        #0x3537ac
    cmp      w8, w26
    b.gt     #0x353910
    cmp      w8, w27
    b.eq     #0x353930
    mov      w9, #0xfb1a
    movk     w9, #0x9de8, lsl #16
    cmp      w8, w9
    b.ne     #0x3537ac
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp, #0x18]
    str      w12, [x8]
    b        #0x3537ac
    cmp      w8, w21
    b.eq     #0x3539f0
    cmp      w8, w14
    b.ne     #0x3537ac
    ldrb     w8, [x23]
    mov      w9, #0x4b
    eor      w8, w8, w9
    strb     w8, [x22]
    ldrb     w8, [x23, #1]
    mov      w9, #0x92
    eor      w8, w8, w9
    strb     w8, [x22, #1]
    ldrb     w8, [x23, #2]
    mov      w9, #0x1b
    eor      w8, w8, w9
    strb     w8, [x22, #2]
    ldrb     w8, [x23, #3]
    mov      w9, #0x4d
    eor      w8, w8, w9
    strb     w8, [x22, #3]
    ldrb     w8, [x23, #4]
    eor      w8, w8, #0x78
    strb     w8, [x22, #4]
    ldrb     w8, [x23, #5]
    mov      w9, #0x6e
    eor      w8, w8, w9
    strb     w8, [x22, #5]
    ldrb     w8, [x23, #6]
    mov      w9, #0x71
    eor      w8, w8, w9
    strb     w8, [x22, #6]
    ldrb     w8, [x23, #7]
    mov      w9, #0x97
    eor      w8, w8, w9
    strb     w8, [x22, #7]
    ldrb     w8, [x23, #8]
    eor      w8, w8, #0xffffff83
    strb     w8, [x22, #8]
    ldrb     w8, [x23, #9]
    eor      w8, w8, w13
    strb     w8, [x22, #9]
    ldrb     w8, [x23, #0xa]
    eor      w8, w8, #0x40
    strb     w8, [x22, #0xa]
    ldrb     w8, [x23, #0xb]
    mov      w9, #0xbd
    eor      w8, w8, w9
    strb     w8, [x22, #0xb]
    ldrb     w8, [x23, #0xc]
    mov      w9, #0x95
    eor      w8, w8, w9
    strb     w8, [x22, #0xc]
    ldr      x8, [sp, #0x18]
    str      w10, [x8]
    b        #0x3537ac
    cmp      w8, w12
    b.ne     #0x353a54
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    csel     w8, w27, w10, ne
    ldr      x9, [sp, #0x18]
    str      w8, [x9]
    b        #0x3537ac
    adrp     x9, #0x54d000
    add      x9, x9, #0x60
    ldrb     w8, [x9]
    mov      w11, #0x51
    eor      w8, w8, w11
    adrp     x11, #0x54d000
    add      x11, x11, #0x80
    strb     w8, [x11]
    ldrb     w8, [x9, #1]
    mov      w9, #0x89
    eor      w8, w8, w9
    strb     w8, [x11, #1]
    ldr      x8, [sp, #0x18]
    str      w19, [x8]
    b        #0x3537ac
    ldrb     w8, [x20]
    mov      w9, #0xa3
    eor      w8, w8, w9
    strb     w8, [x28]
    ldrb     w8, [x20, #1]
    mov      w9, #0xa0
    eor      w8, w8, w9
    strb     w8, [x28, #1]
    ldrb     w8, [x20, #2]
    eor      w8, w8, #0xfffffff9
    strb     w8, [x28, #2]
    ldrb     w8, [x20, #3]
    mov      w9, #0x29
    eor      w8, w8, w9
    strb     w8, [x28, #3]
    ldrb     w8, [x20, #4]
    mov      w9, #0xb1
    eor      w8, w8, w9
    strb     w8, [x28, #4]
    ldrb     w8, [x20, #5]
    mov      w9, #0x4e
    eor      w8, w8, w9
    strb     w8, [x28, #5]
    ldrb     w8, [x20, #6]
    mov      w9, #0xb0
    eor      w8, w8, w9
    strb     w8, [x28, #6]
    ldrb     w8, [x20, #7]
    eor      w8, w8, w13
    strb     w8, [x28, #7]
    ldr      x8, [sp, #0x18]
    str      w14, [x8]
    b        #0x3537ac
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    ldr      x0, [sp, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x350]
    ldr      w2, [sp, #0x14]
    adrp     x3, #0x54d000
    add      x3, x3, #0xc0
    bl       #0x461c6c // _objc_msgSend
    mov      w14, #0x1afb
    movk     w14, #0x7ead, lsl #16
    mov      w13, #0x46
    mov      w12, #0x4d94
    movk     w12, #0x2194, lsl #16
    mov      w10, #0x4d1c
    movk     w10, #0x56b3, lsl #16
    ldr      x8, [sp, #0x18]
    mov      w9, #0xf6aa
    movk     w9, #0xf25b, lsl #16
    str      w9, [x8]
    b        #0x3537ac
    mov      w9, #0xf6aa
    movk     w9, #0xf25b, lsl #16
    cmp      w8, w9
    b.ne     #0x3537ac
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp, #8]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups textColorMode] IMP=0x353A98 bounds=0x353A98-0x353F3C
loc_353A98:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      w20, #0x39ef
    movk     w20, #0x7efb, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x2ec
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w9, #0x1d58
    movk     w9, #0xe2e3, lsl #16
    add      x8, sp, #0xc
    str      w9, [sp, #0xc]
    mov      w25, #0xa6ee
    movk     w25, #0xe37b, lsl #16
    mov      w26, #0x2676
    movk     w26, #0xad05, lsl #16
    str      x8, [sp]
    adrp     x24, #0x54d000
    add      x24, x24, #0xe2
    adrp     x28, #0x54d000
    add      x28, x28, #0x102
    mov      w22, #0x2677
    movk     w22, #0xad05, lsl #16
    adrp     x19, #0x54d000
    add      x19, x19, #0x110
    adrp     x21, #0x54d000
    add      x21, x21, #0xf1
    mov      w27, #0x7963
    movk     w27, #0x532c, lsl #16
    mov      w23, #0xa6ef
    movk     w23, #0xe37b, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w25
    b.le     #0x353bd8
    cmp      w8, w27
    b.gt     #0x353c24
    cmp      w8, w23
    b.eq     #0x353ea8
    mov      w9, #0xb927
    movk     w9, #0x3037, lsl #16
    cmp      w8, w9
    b.eq     #0x353db4
    mov      w9, #0x6faf
    movk     w9, #0x4184, lsl #16
    cmp      w8, w9
    b.ne     #0x353b2c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    adrp     x2, #0x54d000
    add      x2, x2, #0x140
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    mov      x0, x20
    mov      w20, #0x39ef
    movk     w20, #0x7efb, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x4e8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x3e0]
    stp      x8, x9, [sp, #0x20]
    ldr      x8, [sp]
    str      w23, [x8]
    b        #0x353b2c
    cmp      w8, w26
    b.le     #0x353c60
    cmp      w8, w22
    b.eq     #0x353edc
    mov      w9, #0x4f2b
    movk     w9, #0xd07e, lsl #16
    cmp      w8, w9
    b.eq     #0x353dd4
    mov      w9, #0x1d58
    movk     w9, #0xe2e3, lsl #16
    cmp      w8, w9
    b.ne     #0x353b2c
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x353b2c
    mov      w9, #0x7964
    movk     w9, #0x532c, lsl #16
    cmp      w8, w9
    b.eq     #0x353e8c
    cmp      w8, w20
    b.ne     #0x353efc
    adrp     x8, #0x581000
    add      x8, x8, #0x2ec
    mov      w9, #1
    stlr     w9, [x8]
    ldr      x8, [sp]
    mov      w9, #0x6faf
    movk     w9, #0x4184, lsl #16
    str      w9, [x8]
    b        #0x353b2c
    mov      w9, #0xb8c
    movk     w9, #0x9b4d, lsl #16
    cmp      w8, w9
    b.eq     #0x353d74
    mov      w9, #0xe501
    movk     w9, #0xa569, lsl #16
    cmp      w8, w9
    b.ne     #0x353b2c
    ldrb     w8, [x24]
    mov      w9, #0xd3
    eor      w8, w8, w9
    strb     w8, [x28]
    ldrb     w8, [x24, #1]
    mov      w9, #0x3b
    eor      w8, w8, w9
    strb     w8, [x28, #1]
    ldrb     w8, [x24, #2]
    eor      w8, w8, #0xfe
    strb     w8, [x28, #2]
    ldrb     w8, [x24, #3]
    mov      w9, #0xb1
    eor      w8, w8, w9
    strb     w8, [x28, #3]
    ldrb     w8, [x24, #4]
    eor      w8, w8, #0x66666666
    strb     w8, [x28, #4]
    ldrb     w8, [x24, #5]
    eor      w8, w8, #0xfc
    strb     w8, [x28, #5]
    ldrb     w8, [x24, #6]
    mov      w9, #0xec
    eor      w8, w8, w9
    strb     w8, [x28, #6]
    ldrb     w8, [x24, #7]
    mov      w9, #0xb7
    eor      w8, w8, w9
    strb     w8, [x28, #7]
    ldrb     w8, [x24, #8]
    mov      w9, #0x65
    eor      w8, w8, w9
    strb     w8, [x28, #8]
    ldrb     w8, [x24, #9]
    mov      w9, #0xca
    eor      w8, w8, w9
    strb     w8, [x28, #9]
    ldrb     w8, [x24, #0xa]
    mov      w9, #0x1d
    eor      w8, w8, w9
    strb     w8, [x28, #0xa]
    ldrb     w8, [x24, #0xb]
    mov      w9, #0x17
    eor      w8, w8, w9
    strb     w8, [x28, #0xb]
    ldrb     w8, [x24, #0xc]
    mov      w9, #0x76
    eor      w8, w8, w9
    strb     w8, [x28, #0xc]
    ldrb     w8, [x24, #0xd]
    eor      w8, w8, #0xffffffe3
    strb     w8, [x28, #0xd]
    ldrb     w8, [x24, #0xe]
    mov      w9, #0x5e
    eor      w8, w8, w9
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp]
    mov      w9, #0x4f2b
    movk     w9, #0xd07e, lsl #16
    str      w9, [x8]
    b        #0x353b2c
    adrp     x9, #0x54d000
    add      x9, x9, #0xe0
    ldrb     w8, [x9]
    mov      w10, #0xbd
    eor      w8, w8, w10
    adrp     x10, #0x54d000
    add      x10, x10, #0x100
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    eor      w8, w8, #0x70
    strb     w8, [x10, #1]
    ldr      x8, [sp]
    mov      w9, #0xe501
    movk     w9, #0xa569, lsl #16
    str      w9, [x8]
    b        #0x353b2c
    ldp      x1, x0, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x18]
    ldr      x8, [sp]
    mov      w9, #0x7964
    movk     w9, #0x532c, lsl #16
    str      w9, [x8]
    b        #0x353b2c
    ldrb     w8, [sp, #0x3a]
    strb     w8, [x19]
    ldrb     w8, [x21]
    mov      w9, #0xe6
    eor      w8, w8, w9
    strb     w8, [x19, #1]
    ldrb     w8, [x21, #1]
    mov      w9, #0xe8
    eor      w8, w8, w9
    strb     w8, [x19, #2]
    ldrb     w8, [x21, #2]
    eor      w8, w8, #0xffffffbf
    strb     w8, [x19, #3]
    ldrb     w8, [x21, #3]
    eor      w8, w8, #0x7f
    strb     w8, [x19, #4]
    ldrb     w8, [x21, #4]
    mov      w9, #0x58
    eor      w8, w8, w9
    strb     w8, [x19, #5]
    ldrb     w8, [x21, #5]
    mov      w9, #0x64
    eor      w8, w8, w9
    strb     w8, [x19, #6]
    ldrb     w8, [x21, #6]
    mov      w9, #0x21
    eor      w8, w8, w9
    strb     w8, [x19, #7]
    ldrb     w8, [x21, #7]
    mov      w9, #0x3d
    eor      w8, w8, w9
    strb     w8, [x19, #8]
    ldrb     w8, [x21, #8]
    mov      w9, #0x12
    eor      w8, w8, w9
    strb     w8, [x19, #9]
    ldrb     w8, [x21, #9]
    mov      w9, #0x76
    eor      w8, w8, w9
    strb     w8, [x19, #0xa]
    ldrb     w8, [x21, #0xa]
    eor      w8, w8, #0xc
    strb     w8, [x19, #0xb]
    ldr      x8, [sp]
    str      w20, [x8]
    b        #0x353b2c
    ldr      x8, [sp]
    mov      w9, #0xb64b
    movk     w9, #0x60ad, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x18]
    str      x8, [sp, #0x10]
    b        #0x353b2c
    ldp      x2, x0, [sp, #0x28]
    ldr      x1, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp]
    mov      w9, #0xb64b
    movk     w9, #0x60ad, lsl #16
    mov      w10, #0xb927
    movk     w10, #0x3037, lsl #16
    csel     w9, w10, w9, ne
    str      w9, [x8]
    str      xzr, [sp, #0x10]
    b        #0x353b2c
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    mov      w8, #0xb8c
    movk     w8, #0x9b4d, lsl #16
    csel     w8, w8, w20, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x353b2c
    mov      w9, #0xb64b
    movk     w9, #0x60ad, lsl #16
    cmp      w8, w9
    b.ne     #0x353b2c
    ldr      x19, [sp, #0x10]
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    ret      

// -[WCLGHomeGroups setTextColorMode:] IMP=0x353F3C bounds=0x353F3C-0x354340
loc_353F3C:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    stp      x0, x2, [sp, #8]
    adrp     x8, #0x581000
    add      x8, x8, #0x2f0
    mov      w23, #0xbde3
    movk     w23, #0xa61d, lsl #16
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w8, #0x186c
    movk     w8, #0xe7b2, lsl #16
    str      w8, [sp, #0x24]
    add      x8, sp, #0x24
    mov      w25, #0xed33
    movk     w25, #0x2751, lsl #16
    str      x8, [sp, #0x18]
    mov      w26, #0xbde2
    movk     w26, #0xa61d, lsl #16
    mov      w27, #0x20b8
    movk     w27, #0x84cc, lsl #16
    adrp     x28, #0x54d000
    add      x28, x28, #0x198
    adrp     x19, #0x54d000
    add      x19, x19, #0x179
    mov      w24, #0xd8d7
    movk     w24, #0x6da7, lsl #16
    mov      w22, #0xd8d6
    movk     w22, #0x6da7, lsl #16
    adrp     x21, #0x54d000
    add      x21, x21, #0x160
    adrp     x20, #0x54d000
    add      x20, x20, #0x180
    ldr      w8, [sp, #0x24]
    cmp      w8, w25
    b.gt     #0x35402c
    cmp      w8, w26
    b.gt     #0x3541b8
    cmp      w8, w27
    b.eq     #0x354260
    mov      w9, #0xd26e
    movk     w9, #0x9787, lsl #16
    cmp      w8, w9
    b.ne     #0x353fd4
    adrp     x9, #0x54d000
    add      x9, x9, #0x177
    ldrb     w8, [x9]
    eor      w8, w8, #0xffffffe3
    adrp     x10, #0x54d000
    strb     w8, [x10, #0x197]
    ldrb     w8, [x9, #1]
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp, #0x18]
    str      w27, [x8]
    b        #0x353fd4
    cmp      w8, w22
    b.le     #0x3541f4
    cmp      w8, w24
    b.eq     #0x354224
    mov      w9, #0xf47a
    movk     w9, #0x7e20, lsl #16
    cmp      w8, w9
    b.ne     #0x353fd4
    ldrb     w8, [x21]
    eor      w8, w8, #0x66666666
    strb     w8, [x20]
    ldrb     w8, [x21, #1]
    mov      w9, #0x6b
    eor      w8, w8, w9
    strb     w8, [x20, #1]
    ldrb     w8, [x21, #2]
    mov      w9, #0x4d
    eor      w8, w8, w9
    strb     w8, [x20, #2]
    ldrb     w8, [x21, #3]
    eor      w8, w8, #0xf
    strb     w8, [x20, #3]
    ldrb     w8, [x21, #4]
    mov      w9, #0x31
    eor      w8, w8, w9
    strb     w8, [x20, #4]
    ldrb     w8, [x21, #5]
    mov      w9, #9
    eor      w8, w8, w9
    strb     w8, [x20, #5]
    ldrb     w8, [x21, #6]
    eor      w8, w8, #0x60
    strb     w8, [x20, #6]
    ldrb     w8, [x21, #7]
    mov      w9, #0xb9
    eor      w8, w8, w9
    strb     w8, [x20, #7]
    ldrb     w8, [x21, #8]
    mov      w9, #0x50
    eor      w8, w8, w9
    strb     w8, [x20, #8]
    ldrb     w8, [x21, #9]
    mov      w9, #0x67
    eor      w8, w8, w9
    strb     w8, [x20, #9]
    ldrb     w8, [x21, #0xa]
    mov      w9, #0xa9
    eor      w8, w8, w9
    strb     w8, [x20, #0xa]
    ldrb     w8, [x21, #0xb]
    mov      w9, #0xb2
    eor      w8, w8, w9
    strb     w8, [x20, #0xb]
    ldrb     w8, [x21, #0xc]
    mov      w9, #0xb7
    eor      w8, w8, w9
    strb     w8, [x20, #0xc]
    ldrb     w8, [x21, #0xd]
    mov      w9, #0xb4
    eor      w8, w8, w9
    strb     w8, [x20, #0xd]
    ldrb     w8, [x21, #0xe]
    eor      w8, w8, #1
    strb     w8, [x20, #0xe]
    ldrb     w8, [x21, #0xf]
    mov      w9, #0xd6
    eor      w8, w8, w9
    strb     w8, [x20, #0xf]
    ldrb     w8, [x21, #0x10]
    eor      w8, w8, #0x70
    strb     w8, [x20, #0x10]
    ldrb     w8, [x21, #0x11]
    mov      w9, #0xf6
    eor      w8, w8, w9
    strb     w8, [x20, #0x11]
    ldrb     w8, [x21, #0x12]
    mov      w9, #0x47
    eor      w8, w8, w9
    strb     w8, [x20, #0x12]
    ldrb     w8, [x21, #0x13]
    mov      w9, #0x35
    eor      w8, w8, w9
    strb     w8, [x20, #0x13]
    ldrb     w8, [x21, #0x14]
    eor      w8, w8, #0x77777777
    strb     w8, [x20, #0x14]
    ldrb     w8, [x21, #0x15]
    mov      w9, #0x25
    eor      w8, w8, w9
    strb     w8, [x20, #0x15]
    ldrb     w8, [x21, #0x16]
    mov      w9, #0xa7
    eor      w8, w8, w9
    strb     w8, [x20, #0x16]
    ldr      x8, [sp, #0x18]
    mov      w9, #0xd26e
    movk     w9, #0x9787, lsl #16
    str      w9, [x8]
    b        #0x353fd4
    cmp      w8, w23
    b.eq     #0x3542a4
    mov      w9, #0x186c
    movk     w9, #0xe7b2, lsl #16
    cmp      w8, w9
    b.ne     #0x353fd4
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp, #0x18]
    mov      w9, #0xed34
    movk     w9, #0x2751, lsl #16
    str      w9, [x8]
    b        #0x353fd4
    mov      w9, #0xed34
    movk     w9, #0x2751, lsl #16
    cmp      w8, w9
    b.ne     #0x354304
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    mov      w8, #0xf47a
    movk     w8, #0x7e20, lsl #16
    csel     w8, w8, w23, ne
    ldr      x9, [sp, #0x18]
    str      w8, [x9]
    b        #0x353fd4
    ldp      x2, x0, [sp, #0x28]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    adrp     x3, #0x54d000
    add      x3, x3, #0x1c0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x18]
    mov      w9, #0x8c2
    movk     w9, #0x65ea, lsl #16
    str      w9, [x8]
    b        #0x353fd4
    ldrb     w8, [sp, #0x3a]
    eor      w8, w8, #0xf
    strb     w8, [x28]
    ldrb     w8, [x19]
    mov      w9, #0x19
    eor      w8, w8, w9
    strb     w8, [x28, #1]
    ldrb     w8, [x19, #1]
    eor      w8, w8, #0xfffffffb
    strb     w8, [x28, #2]
    ldrb     w8, [x19, #2]
    mov      w9, #0x9c
    eor      w8, w8, w9
    strb     w8, [x28, #3]
    ldr      x8, [sp, #0x18]
    str      w23, [x8]
    b        #0x353fd4
    adrp     x8, #0x581000
    add      x8, x8, #0x2f0
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f0]
    ldr      x2, [sp, #0x10]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    ldr      x8, [sp, #0x18]
    str      w24, [x8]
    b        #0x353fd4
    mov      w9, #0x8c2
    movk     w9, #0x65ea, lsl #16
    cmp      w8, w9
    b.ne     #0x353fd4
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp, #8]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups pillColorMode] IMP=0x354340 bounds=0x354340-0x3547DC
loc_354340:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      w20, #0x6f48
    movk     w20, #0xd2aa, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x2f4
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w9, #0xeaa4
    movk     w9, #0x12e0, lsl #16
    add      x8, sp, #0xc
    str      w9, [sp, #0xc]
    mov      w24, #0x4e3b
    movk     w24, #0xfffa, lsl #16
    mov      w25, #0x6f47
    movk     w25, #0xd2aa, lsl #16
    str      x8, [sp]
    adrp     x27, #0x54d000
    add      x27, x27, #0x206
    adrp     x28, #0x54d000
    add      x28, x28, #0x1e7
    mov      w22, #0xdfea
    movk     w22, #0x22cb, lsl #16
    adrp     x23, #0x54d000
    add      x23, x23, #0x1e0
    mov      w26, #0xdfeb
    movk     w26, #0x22cb, lsl #16
    mov      w19, #0x423
    movk     w19, #0x282c, lsl #16
    adrp     x21, #0x54d000
    add      x21, x21, #0x200
    ldr      w8, [sp, #0xc]
    cmp      w8, w24
    b.gt     #0x35445c
    cmp      w8, w25
    b.le     #0x3544bc
    cmp      w8, w20
    b.eq     #0x35471c
    mov      w9, #0x39f5
    movk     w9, #0xe6ab, lsl #16
    cmp      w8, w9
    b.eq     #0x354590
    mov      w9, #0xddbb
    movk     w9, #0xf390, lsl #16
    cmp      w8, w9
    b.ne     #0x3543d4
    ldr      x0, [sp, #0x30]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    adrp     x2, #0x54d000
    add      x2, x2, #0x240
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x4e8]
    str      x8, [sp, #0x20]
    ldr      x8, [sp]
    mov      w9, #0xdd02
    movk     w9, #0x3ece, lsl #16
    str      w9, [x8]
    b        #0x3543d4
    cmp      w8, w22
    b.le     #0x3544fc
    cmp      w8, w26
    b.eq     #0x354760
    cmp      w8, w19
    b.eq     #0x3545ac
    mov      w9, #0xdd02
    movk     w9, #0x3ece, lsl #16
    cmp      w8, w9
    b.ne     #0x3543d4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    ldp      x2, x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp]
    mov      w9, #0xcfda
    movk     w9, #0xc127, lsl #16
    mov      w10, #0x513a
    movk     w10, #0x9f30, lsl #16
    csel     w9, w10, w9, ne
    str      w9, [x8]
    str      xzr, [sp, #0x10]
    b        #0x3543d4
    mov      w9, #0xa9cf
    movk     w9, #0x8f3e, lsl #16
    cmp      w8, w9
    b.eq     #0x3545cc
    mov      w9, #0x513a
    movk     w9, #0x9f30, lsl #16
    cmp      w8, w9
    b.ne     #0x35479c
    ldp      x1, x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x18]
    ldr      x8, [sp]
    mov      w9, #0x39f5
    movk     w9, #0xe6ab, lsl #16
    str      w9, [x8]
    b        #0x3543d4
    mov      w9, #0x4e3c
    movk     w9, #0xfffa, lsl #16
    cmp      w8, w9
    b.eq     #0x354538
    mov      w9, #0xeaa4
    movk     w9, #0x12e0, lsl #16
    cmp      w8, w9
    b.ne     #0x3543d4
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp]
    str      w19, [x8]
    b        #0x3543d4
    ldrb     w8, [x23]
    eor      w8, w8, #0xfffffffb
    strb     w8, [x21]
    ldrb     w8, [x23, #1]
    mov      w9, #0x8a
    eor      w8, w8, w9
    strb     w8, [x21, #1]
    ldrb     w8, [x23, #2]
    eor      w8, w8, #0xfffffffb
    strb     w8, [x21, #2]
    ldrb     w8, [x23, #3]
    eor      w8, w8, #0x20
    strb     w8, [x21, #3]
    ldrb     w8, [x23, #4]
    mov      w9, #0x49
    eor      w8, w8, w9
    strb     w8, [x21, #4]
    ldrb     w8, [x23, #5]
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp]
    str      w26, [x8]
    b        #0x3543d4
    ldr      x8, [sp]
    mov      w9, #0xcfda
    movk     w9, #0xc127, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x18]
    str      x8, [sp, #0x10]
    b        #0x3543d4
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    mov      w8, #0x4e3c
    movk     w8, #0xfffa, lsl #16
    csel     w8, w8, w20, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x3543d4
    ldrb     w8, [sp, #0x39]
    strb     w8, [x27]
    ldrb     w8, [x28]
    eor      w8, w8, #0x80
    strb     w8, [x27, #1]
    ldrb     w8, [x28, #1]
    mov      w9, #0xaf
    eor      w8, w8, w9
    strb     w8, [x27, #2]
    ldrb     w8, [x28, #2]
    mov      w9, #0x24
    eor      w8, w8, w9
    strb     w8, [x27, #3]
    ldrb     w8, [x28, #3]
    mov      w9, #0x36
    eor      w8, w8, w9
    strb     w8, [x27, #4]
    ldrb     w8, [x28, #4]
    mov      w9, #0x8e
    eor      w8, w8, w9
    strb     w8, [x27, #5]
    ldrb     w8, [x28, #5]
    eor      w8, w8, #0xffffffcf
    strb     w8, [x27, #6]
    ldrb     w8, [x28, #6]
    mov      w9, #0x12
    eor      w8, w8, w9
    strb     w8, [x27, #7]
    ldrb     w8, [x28, #7]
    mov      w9, #0xb9
    eor      w8, w8, w9
    strb     w8, [x27, #8]
    ldrb     w8, [x28, #8]
    mov      w9, #0xe4
    eor      w8, w8, w9
    strb     w8, [x27, #9]
    ldrb     w8, [x28, #9]
    mov      w9, #0x92
    eor      w8, w8, w9
    strb     w8, [x27, #0xa]
    ldrb     w8, [x28, #0xa]
    mov      w9, #0x9b
    eor      w8, w8, w9
    strb     w8, [x27, #0xb]
    ldrb     w8, [x28, #0xb]
    mov      w9, #0x57
    eor      w8, w8, w9
    strb     w8, [x27, #0xc]
    ldrb     w8, [x28, #0xc]
    mov      w9, #0x4c
    eor      w8, w8, w9
    strb     w8, [x27, #0xd]
    ldrb     w8, [x28, #0xd]
    mov      w9, #0x68
    eor      w8, w8, w9
    strb     w8, [x27, #0xe]
    ldrb     w8, [x28, #0xe]
    eor      w8, w8, #0xfffffff1
    strb     w8, [x27, #0xf]
    ldrb     w8, [x28, #0xf]
    mov      w9, #0x2a
    eor      w8, w8, w9
    strb     w8, [x27, #0x10]
    ldrb     w8, [x28, #0x10]
    eor      w8, w8, #0xfc
    strb     w8, [x27, #0x11]
    ldrb     w8, [x28, #0x11]
    mov      w9, #0x8b
    eor      w8, w8, w9
    strb     w8, [x27, #0x12]
    ldrb     w8, [x28, #0x12]
    mov      w9, #0x6d
    eor      w8, w8, w9
    strb     w8, [x27, #0x13]
    ldrb     w8, [x28, #0x13]
    eor      w8, w8, #0xffffffe3
    strb     w8, [x27, #0x14]
    ldrb     w8, [x28, #0x14]
    mov      w9, #0x4e
    eor      w8, w8, w9
    strb     w8, [x27, #0x15]
    ldr      x8, [sp]
    str      w20, [x8]
    b        #0x3543d4
    adrp     x8, #0x581000
    add      x8, x8, #0x2f4
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    ldr      x8, [sp]
    mov      w9, #0xddbb
    movk     w9, #0xf390, lsl #16
    str      w9, [x8]
    b        #0x3543d4
    ldrb     w8, [sp, #0x3a]
    mov      w9, #0xa6
    eor      w8, w8, w9
    adrp     x9, #0x54d000
    strb     w8, [x9, #0x205]
    adrp     x8, #0x54d000
    ldrb     w8, [x8, #0x1e6]
    mov      w9, #0x82
    eor      w8, w8, w9
    strb     w8, [sp, #0x39]
    ldr      x8, [sp]
    mov      w9, #0xa9cf
    movk     w9, #0x8f3e, lsl #16
    str      w9, [x8]
    b        #0x3543d4
    mov      w9, #0xcfda
    movk     w9, #0xc127, lsl #16
    cmp      w8, w9
    b.ne     #0x3543d4
    ldr      x19, [sp, #0x10]
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    ret      

// -[WCLGHomeGroups setPillColorMode:] IMP=0x3547DC bounds=0x3547DC-0x354BE4
loc_3547DC:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    stp      x0, x2, [sp]
    adrp     x8, #0x581000
    add      x8, x8, #0x2f8
    mov      w23, #0x7c42
    movk     w23, #0xff55, lsl #16
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w8, #0x8294
    movk     w8, #0x1623, lsl #16
    str      w8, [sp, #0x1c]
    add      x8, sp, #0x1c
    mov      w25, #0x8293
    movk     w25, #0x1623, lsl #16
    str      x8, [sp, #0x10]
    mov      w26, #0x7c41
    movk     w26, #0xff55, lsl #16
    mov      w27, #0x1d6d
    movk     w27, #0x902d, lsl #16
    adrp     x28, #0x54d000
    add      x28, x28, #0x260
    adrp     x22, #0x54d000
    add      x22, x22, #0x280
    mov      w24, #0xb5ab
    movk     w24, #0x30a1, lsl #16
    mov      w20, #0xb5aa
    movk     w20, #0x30a1, lsl #16
    adrp     x21, #0x54d000
    add      x21, x21, #0x26d
    adrp     x19, #0x54d000
    add      x19, x19, #0x28d
    ldr      w8, [sp, #0x1c]
    cmp      w8, w25
    b.gt     #0x3548c8
    cmp      w8, w26
    b.gt     #0x354900
    cmp      w8, w27
    b.eq     #0x354a58
    mov      w9, #0x5909
    movk     w9, #0xf9a7, lsl #16
    cmp      w8, w9
    b.ne     #0x354874
    ldp      x2, x0, [sp, #0x28]
    ldr      x1, [sp, #0x20]
    adrp     x3, #0x54d000
    add      x3, x3, #0x2c0
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x10]
    mov      w9, #0xa628
    movk     w9, #0x2f82, lsl #16
    str      w9, [x8]
    b        #0x354874
    cmp      w8, w20
    b.le     #0x354938
    cmp      w8, w24
    b.eq     #0x35496c
    mov      w9, #0xac0c
    movk     w9, #0x5203, lsl #16
    cmp      w8, w9
    b.ne     #0x354874
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    csel     w8, w27, w23, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x354874
    cmp      w8, w23
    b.eq     #0x354b28
    mov      w9, #0xa50c
    movk     w9, #0x5b2, lsl #16
    cmp      w8, w9
    b.ne     #0x354874
    ldrb     w8, [sp, #0x3a]
    mov      w9, #0xd1
    eor      w8, w8, w9
    adrp     x9, #0x54d000
    strb     w8, [x9, #0x28c]
    ldr      x8, [sp, #0x10]
    str      w24, [x8]
    b        #0x354874
    mov      w9, #0x8294
    movk     w9, #0x1623, lsl #16
    cmp      w8, w9
    b.ne     #0x354b98
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xac0c
    movk     w9, #0x5203, lsl #16
    str      w9, [x8]
    b        #0x354874
    ldrb     w8, [x21]
    mov      w9, #0xcd
    eor      w8, w8, w9
    strb     w8, [x19]
    ldrb     w8, [x21, #1]
    mov      w9, #0x84
    eor      w8, w8, w9
    strb     w8, [x19, #1]
    ldrb     w8, [x21, #2]
    eor      w8, w8, #0x40
    strb     w8, [x19, #2]
    ldrb     w8, [x21, #3]
    mov      w9, #0xae
    eor      w8, w8, w9
    strb     w8, [x19, #3]
    ldrb     w8, [x21, #4]
    eor      w8, w8, #0x44444444
    strb     w8, [x19, #4]
    ldrb     w8, [x21, #5]
    mov      w9, #0x29
    eor      w8, w8, w9
    strb     w8, [x19, #5]
    ldrb     w8, [x21, #6]
    mov      w9, #0xc4
    eor      w8, w8, w9
    strb     w8, [x19, #6]
    ldrb     w8, [x21, #7]
    mov      w9, #0x62
    eor      w8, w8, w9
    strb     w8, [x19, #7]
    ldrb     w8, [x21, #8]
    mov      w9, #0xeb
    eor      w8, w8, w9
    strb     w8, [x19, #8]
    ldrb     w8, [x21, #9]
    mov      w9, #0x6b
    eor      w8, w8, w9
    strb     w8, [x19, #9]
    ldrb     w8, [x21, #0xa]
    eor      w8, w8, #0x66666666
    strb     w8, [x19, #0xa]
    ldrb     w8, [x21, #0xb]
    mov      w9, #0xb9
    eor      w8, w8, w9
    strb     w8, [x19, #0xb]
    ldrb     w8, [x21, #0xc]
    mov      w9, #0x98
    eor      w8, w8, w9
    strb     w8, [x19, #0xc]
    ldrb     w8, [x21, #0xd]
    eor      w8, w8, #0xbbbbbbbb
    strb     w8, [x19, #0xd]
    ldrb     w8, [x21, #0xe]
    mov      w9, #0xe8
    eor      w8, w8, w9
    strb     w8, [x19, #0xe]
    ldr      x8, [sp, #0x10]
    str      w23, [x8]
    b        #0x354874
    ldrb     w8, [x28]
    mov      w9, #0xa
    eor      w8, w8, w9
    strb     w8, [x22]
    ldrb     w8, [x28, #1]
    mov      w9, #0x93
    eor      w8, w8, w9
    strb     w8, [x22, #1]
    ldrb     w8, [x28, #2]
    mov      w9, #0xda
    eor      w8, w8, w9
    strb     w8, [x22, #2]
    ldrb     w8, [x28, #3]
    eor      w8, w8, #0xf
    strb     w8, [x22, #3]
    ldrb     w8, [x28, #4]
    mov      w9, #0xb6
    eor      w8, w8, w9
    strb     w8, [x22, #4]
    ldrb     w8, [x28, #5]
    eor      w8, w8, #0xcccccccc
    strb     w8, [x22, #5]
    ldrb     w8, [x28, #6]
    mov      w9, #0xe2
    eor      w8, w8, w9
    strb     w8, [x22, #6]
    ldrb     w8, [x28, #7]
    mov      w9, #0x41
    eor      w8, w8, w9
    strb     w8, [x22, #7]
    ldrb     w8, [x28, #8]
    mov      w9, #0x6c
    eor      w8, w8, w9
    strb     w8, [x22, #8]
    ldrb     w8, [x28, #9]
    eor      w8, w8, #0xffffff8f
    strb     w8, [x22, #9]
    ldrb     w8, [x28, #0xa]
    mov      w9, #0xa7
    eor      w8, w8, w9
    strb     w8, [x22, #0xa]
    ldrb     w8, [x28, #0xb]
    mov      w9, #0x59
    eor      w8, w8, w9
    strb     w8, [x22, #0xb]
    ldrb     w8, [x28, #0xc]
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xa50c
    movk     w9, #0x5b2, lsl #16
    str      w9, [x8]
    b        #0x354874
    adrp     x8, #0x581000
    add      x8, x8, #0x2f8
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f0]
    ldr      x2, [sp, #8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x9e8]
    stp      x8, x0, [sp, #0x20]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x5909
    movk     w9, #0xf9a7, lsl #16
    str      w9, [x8]
    b        #0x354874
    mov      w9, #0xa628
    movk     w9, #0x2f82, lsl #16
    cmp      w8, w9
    b.ne     #0x354874
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups pillSelectedColorMode] IMP=0x354BE4 bounds=0x354BE4-0x355114
loc_354BE4:
    sub      sp, sp, #0xb0
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      w20, #0x44cb
    movk     w20, #0x9c2b, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x2fc
    ldar     w8, [x8]
    str      w8, [sp, #0x4c]
    mov      w9, #0xcecf
    movk     w9, #0xb783, lsl #16
    add      x8, sp, #0x14
    str      w9, [sp, #0x14]
    mov      w25, #0x5ccc
    movk     w25, #0xcf3, lsl #16
    mov      w26, #0x7ed6
    movk     w26, #0xb8f5, lsl #16
    str      x8, [sp, #8]
    adrp     x24, #0x54d000
    add      x24, x24, #0x2e6
    adrp     x21, #0x54d000
    add      x21, x21, #0x316
    mov      w28, #0x6919
    movk     w28, #0x4509, lsl #16
    adrp     x27, #0x54d000
    add      x27, x27, #0x32c
    adrp     x23, #0x54d000
    add      x23, x23, #0x2fd
    adrp     x19, #0x54d000
    add      x19, x19, #0x2e0
    adrp     x22, #0x54d000
    add      x22, x22, #0x310
    ldr      w8, [sp, #0x14]
    cmp      w8, w25
    b.gt     #0x354e28
    cmp      w8, w26
    b.le     #0x354ee8
    mov      w9, #0x7ed7
    movk     w9, #0xb8f5, lsl #16
    cmp      w8, w9
    b.eq     #0x355048
    mov      w9, #0xe44a
    movk     w9, #0xc07d, lsl #16
    cmp      w8, w9
    b.eq     #0x354f98
    mov      w9, #0x9d0c
    movk     w9, #0xce67, lsl #16
    cmp      w8, w9
    b.ne     #0x354c78
    ldrb     w8, [x24]
    mov      w9, #0xd6
    eor      w8, w8, w9
    strb     w8, [x21]
    ldrb     w8, [x24, #1]
    mov      w9, #0x89
    eor      w8, w8, w9
    strb     w8, [x21, #1]
    ldrb     w8, [x24, #2]
    eor      w8, w8, #0xcccccccc
    strb     w8, [x21, #2]
    ldrb     w8, [x24, #3]
    mov      w9, #0x49
    eor      w8, w8, w9
    strb     w8, [x21, #3]
    ldrb     w8, [x24, #4]
    mov      w9, #0xb3
    eor      w8, w8, w9
    strb     w8, [x21, #4]
    ldrb     w8, [x24, #5]
    mov      w9, #0xbe
    eor      w8, w8, w9
    strb     w8, [x21, #5]
    ldrb     w8, [x24, #6]
    mov      w9, #0xa7
    eor      w8, w8, w9
    strb     w8, [x21, #6]
    ldrb     w8, [x24, #7]
    mov      w9, #0x26
    eor      w8, w8, w9
    strb     w8, [x21, #7]
    ldrb     w8, [x24, #8]
    eor      w8, w8, #0x99999999
    strb     w8, [x21, #8]
    ldrb     w8, [x24, #9]
    mov      w9, #0xd2
    eor      w8, w8, w9
    strb     w8, [x21, #9]
    ldrb     w8, [x24, #0xa]
    mov      w9, #0xa
    eor      w8, w8, w9
    strb     w8, [x21, #0xa]
    ldrb     w8, [x24, #0xb]
    mov      w9, #0x12
    eor      w8, w8, w9
    strb     w8, [x21, #0xb]
    ldrb     w8, [x24, #0xc]
    mov      w9, #0x7b
    eor      w8, w8, w9
    strb     w8, [x21, #0xc]
    ldrb     w8, [x24, #0xd]
    mov      w9, #0x19
    eor      w8, w8, w9
    strb     w8, [x21, #0xd]
    ldrb     w8, [x24, #0xe]
    eor      w8, w8, #0xffffffe3
    strb     w8, [x21, #0xe]
    ldrb     w8, [x24, #0xf]
    mov      w9, #0x9a
    eor      w8, w8, w9
    strb     w8, [x21, #0xf]
    ldrb     w8, [x24, #0x10]
    eor      w8, w8, #0x60
    strb     w8, [x21, #0x10]
    ldrb     w8, [x24, #0x11]
    mov      w9, #0x4e
    eor      w8, w8, w9
    strb     w8, [x21, #0x11]
    ldrb     w8, [x24, #0x12]
    eor      w8, w8, #0x77777777
    strb     w8, [x21, #0x12]
    ldrb     w8, [x24, #0x13]
    mov      w9, #0xb2
    eor      w8, w8, w9
    strb     w8, [x21, #0x13]
    ldrb     w8, [x24, #0x14]
    eor      w8, w8, #0x3e
    strb     w8, [x21, #0x14]
    ldrb     w8, [x24, #0x15]
    mov      w9, #0xe2
    eor      w8, w8, w9
    strb     w8, [x21, #0x15]
    ldrb     w8, [x24, #0x16]
    mov      w9, #0xe5
    eor      w8, w8, w9
    strb     w8, [sp, #0x4a]
    ldr      x8, [sp, #8]
    mov      w9, #0x691a
    movk     w9, #0x4509, lsl #16
    str      w9, [x8]
    b        #0x354c78
    cmp      w8, w28
    b.le     #0x354f2c
    mov      w9, #0x691a
    movk     w9, #0x4509, lsl #16
    cmp      w8, w9
    b.eq     #0x35505c
    mov      w9, #0xc02b
    movk     w9, #0x6e95, lsl #16
    cmp      w8, w9
    b.eq     #0x354fb8
    mov      w9, #0x87c8
    movk     w9, #0x7af2, lsl #16
    cmp      w8, w9
    b.ne     #0x354c78
    adrp     x8, #0x581000
    add      x8, x8, #0x2fc
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    adrp     x2, #0x54d000
    add      x2, x2, #0x360
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x40]
    mov      x0, x20
    mov      w20, #0x44cb
    movk     w20, #0x9c2b, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x4e8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x3e0]
    stp      x8, x9, [sp, #0x30]
    ldr      x8, [sp, #8]
    mov      w9, #0x5d26
    movk     w9, #0x43b7, lsl #16
    str      w9, [x8]
    b        #0x354c78
    mov      w9, #0xbdbc
    movk     w9, #0x93b1, lsl #16
    cmp      w8, w9
    b.eq     #0x355024
    mov      w9, #0xcecf
    movk     w9, #0xb783, lsl #16
    cmp      w8, w9
    b.ne     #0x3550dc
    ldr      w8, [sp, #0x4c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x4b]
    ldr      x8, [sp, #8]
    mov      w9, #0x5ccd
    movk     w9, #0xcf3, lsl #16
    str      w9, [x8]
    b        #0x354c78
    mov      w9, #0x5ccd
    movk     w9, #0xcf3, lsl #16
    cmp      w8, w9
    b.eq     #0x354f70
    mov      w9, #0x5d26
    movk     w9, #0x43b7, lsl #16
    cmp      w8, w9
    b.ne     #0x354c78
    ldp      x2, x0, [sp, #0x38]
    ldr      x1, [sp, #0x30]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x2f]
    ldr      x8, [sp, #8]
    mov      w9, #0xbdbc
    movk     w9, #0x93b1, lsl #16
    str      w9, [x8]
    b        #0x354c78
    ldrb     w8, [sp, #0x4b]
    cmp      w8, #0
    mov      w8, #0x87c8
    movk     w8, #0x7af2, lsl #16
    mov      w9, #0xc02b
    movk     w9, #0x6e95, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x354c78
    ldp      x1, x0, [sp, #0x38]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x20]
    ldr      x8, [sp, #8]
    mov      w9, #0x7ed7
    movk     w9, #0xb8f5, lsl #16
    str      w9, [x8]
    b        #0x354c78
    ldrb     w8, [x19]
    eor      w8, w8, #0xffffffe3
    strb     w8, [x22]
    ldrb     w8, [x19, #1]
    mov      w9, #0xfa
    eor      w8, w8, w9
    strb     w8, [x22, #1]
    ldrb     w8, [x19, #2]
    mov      w9, #0x59
    eor      w8, w8, w9
    strb     w8, [x22, #2]
    ldrb     w8, [x19, #3]
    mov      w9, #0x1a
    eor      w8, w8, w9
    strb     w8, [x22, #3]
    ldrb     w8, [x19, #4]
    mov      w9, #0x5e
    eor      w8, w8, w9
    strb     w8, [x22, #4]
    ldrb     w8, [x19, #5]
    eor      w8, w8, #0x3f
    strb     w8, [x22, #5]
    ldr      x8, [sp, #8]
    mov      w9, #0x9d0c
    movk     w9, #0xce67, lsl #16
    str      w9, [x8]
    b        #0x354c78
    ldrb     w8, [sp, #0x2f]
    cmp      w8, #0
    mov      w8, #0xe44a
    movk     w8, #0xc07d, lsl #16
    csel     w8, w8, w20, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    str      xzr, [sp, #0x18]
    b        #0x354c78
    ldr      x8, [sp, #8]
    str      w20, [x8]
    ldr      x8, [sp, #0x20]
    str      x8, [sp, #0x18]
    b        #0x354c78
    ldrb     w8, [sp, #0x4a]
    strb     w8, [x27]
    ldrb     w8, [x23]
    mov      w9, #0xd1
    eor      w8, w8, w9
    strb     w8, [x27, #1]
    ldrb     w8, [x23, #1]
    mov      w9, #0x7d
    eor      w8, w8, w9
    strb     w8, [x27, #2]
    ldrb     w8, [x23, #2]
    eor      w8, w8, #0xfffffffb
    strb     w8, [x27, #3]
    ldrb     w8, [x23, #3]
    mov      w9, #0xba
    eor      w8, w8, w9
    strb     w8, [x27, #4]
    ldrb     w8, [x23, #4]
    mov      w9, #0x1d
    eor      w8, w8, w9
    strb     w8, [x27, #5]
    ldrb     w8, [x23, #5]
    eor      w8, w8, #0x70
    strb     w8, [x27, #6]
    ldrb     w8, [x23, #6]
    eor      w8, w8, #0xc0
    strb     w8, [x27, #7]
    ldr      x8, [sp, #8]
    mov      w9, #0x87c8
    movk     w9, #0x7af2, lsl #16
    str      w9, [x8]
    b        #0x354c78
    cmp      w8, w20
    b.ne     #0x354c78
    ldr      x19, [sp, #0x18]
    ldr      x0, [sp, #0x40]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    add      sp, sp, #0xb0
    ret      

// -[WCLGHomeGroups setPillSelectedColorMode:] IMP=0x355114 bounds=0x355114-0x3555A4
loc_355114:
    sub      sp, sp, #0xb0
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    stp      x0, x2, [sp]
    mov      w21, #0x5b40
    movk     w21, #0xd8e7, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x300
    ldar     w8, [x8]
    str      w8, [sp, #0x4c]
    mov      w10, #0xf708
    movk     w10, #0xb08d, lsl #16
    str      w10, [sp, #0x1c]
    add      x8, sp, #0x1c
    mov      w24, #0x36ae
    movk     w24, #0x3f57, lsl #16
    str      x8, [sp, #0x10]
    mov      w25, #0x5b3f
    movk     w25, #0xd8e7, lsl #16
    mov      w11, #0x57cd
    movk     w11, #0x5fe3, lsl #16
    mov      w12, #0x82a6
    movk     w12, #0xcc89, lsl #16
    mov      w28, #0xa78b
    movk     w28, #0x5163, lsl #16
    mov      w13, #0x476a
    movk     w13, #0xf04c, lsl #16
    adrp     x22, #0x54d000
    add      x22, x22, #0x380
    adrp     x20, #0x54d000
    add      x20, x20, #0x3b0
    mov      w15, #0xd3
    mov      w26, #0x36af
    movk     w26, #0x3f57, lsl #16
    adrp     x23, #0x54d000
    add      x23, x23, #0x3cb
    mov      w27, #0xa78a
    movk     w27, #0x5163, lsl #16
    adrp     x19, #0x54d000
    add      x19, x19, #0x39c
    ldr      w8, [sp, #0x1c]
    cmp      w8, w24
    b.gt     #0x355210
    cmp      w8, w25
    b.gt     #0x355240
    cmp      w8, w10
    b.eq     #0x3554f8
    cmp      w8, w12
    b.ne     #0x3551c8
    adrp     x8, #0x54d000
    ldrb     w8, [x8, #0x3a3]
    mov      w9, #0x5c
    eor      w8, w8, w9
    adrp     x9, #0x54d000
    strb     w8, [x9, #0x3d3]
    ldr      x8, [sp, #0x10]
    str      w21, [x8]
    b        #0x3551c8
    cmp      w8, w27
    b.le     #0x3553fc
    cmp      w8, w28
    b.eq     #0x355480
    cmp      w8, w11
    b.ne     #0x3551c8
    ldrb     w8, [sp, #0x4b]
    cmp      w8, #0
    csel     w8, w13, w21, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x3551c8
    cmp      w8, w21
    b.eq     #0x355514
    cmp      w8, w13
    b.ne     #0x3551c8
    ldrb     w8, [x22]
    mov      w9, #0x2b
    eor      w8, w8, w9
    strb     w8, [x20]
    ldrb     w8, [x22, #1]
    mov      w9, #0x61
    eor      w8, w8, w9
    strb     w8, [x20, #1]
    ldrb     w8, [x22, #2]
    eor      w8, w8, #0x66666666
    strb     w8, [x20, #2]
    ldrb     w8, [x22, #3]
    mov      w9, #0x31
    eor      w8, w8, w9
    strb     w8, [x20, #3]
    ldrb     w8, [x22, #4]
    mov      w9, #0xab
    eor      w8, w8, w9
    strb     w8, [x20, #4]
    ldrb     w8, [x22, #5]
    mov      w9, #0x27
    eor      w8, w8, w9
    strb     w8, [x20, #5]
    ldrb     w8, [x22, #6]
    mov      w9, #0xd
    eor      w8, w8, w9
    strb     w8, [x20, #6]
    ldrb     w8, [x22, #7]
    mov      w14, #0x7d
    eor      w8, w8, w14
    strb     w8, [x20, #7]
    ldrb     w8, [x22, #8]
    eor      w8, w8, #0x1e
    strb     w8, [x20, #8]
    ldrb     w8, [x22, #9]
    mov      w14, #0x36
    eor      w8, w8, w14
    strb     w8, [x20, #9]
    ldrb     w8, [x22, #0xa]
    mov      w14, #0xda
    eor      w8, w8, w14
    strb     w8, [x20, #0xa]
    ldrb     w8, [x22, #0xb]
    mov      w14, #0xb6
    eor      w8, w8, w14
    strb     w8, [x20, #0xb]
    ldrb     w8, [x22, #0xc]
    eor      w8, w8, #0xdddddddd
    strb     w8, [x20, #0xc]
    ldrb     w8, [x22, #0xd]
    eor      w8, w8, #0x30
    strb     w8, [x20, #0xd]
    ldrb     w8, [x22, #0xe]
    mov      w14, #0x92
    eor      w8, w8, w14
    strb     w8, [x20, #0xe]
    ldrb     w8, [x22, #0xf]
    mov      w14, #0xd2
    eor      w8, w8, w14
    strb     w8, [x20, #0xf]
    ldrb     w8, [x22, #0x10]
    mov      w14, #0xa7
    eor      w8, w8, w14
    strb     w8, [x20, #0x10]
    ldrb     w8, [x22, #0x11]
    mov      w14, #0xf2
    eor      w8, w8, w14
    strb     w8, [x20, #0x11]
    ldrb     w8, [x22, #0x12]
    mov      w14, #0x91
    eor      w8, w8, w14
    strb     w8, [x20, #0x12]
    ldrb     w8, [x22, #0x13]
    eor      w8, w8, w9
    strb     w8, [x20, #0x13]
    ldrb     w8, [x22, #0x14]
    eor      w8, w8, #0x38
    strb     w8, [x20, #0x14]
    ldrb     w8, [x22, #0x15]
    mov      w9, #0x9a
    eor      w8, w8, w9
    strb     w8, [x20, #0x15]
    ldrb     w8, [x22, #0x16]
    mov      w9, #0x12
    eor      w8, w8, w9
    strb     w8, [x20, #0x16]
    ldrb     w8, [x22, #0x17]
    mov      w9, #0x37
    eor      w8, w8, w9
    strb     w8, [x20, #0x17]
    ldrb     w8, [x22, #0x18]
    eor      w8, w8, #0xdddddddd
    strb     w8, [x20, #0x18]
    ldrb     w8, [x22, #0x19]
    mov      w9, #0x62
    eor      w8, w8, w9
    strb     w8, [x20, #0x19]
    ldrb     w8, [x22, #0x1a]
    eor      w8, w8, w15
    strb     w8, [x20, #0x1a]
    ldrb     w8, [x22, #0x1b]
    mov      w9, #0x5e
    eor      w8, w8, w9
    strb     w8, [sp, #0x4a]
    ldr      x8, [sp, #0x10]
    str      w26, [x8]
    b        #0x3551c8
    cmp      w8, w26
    b.ne     #0x355544
    ldrb     w8, [sp, #0x4a]
    strb     w8, [x23]
    ldrb     w8, [x19]
    mov      w9, #0xf4
    eor      w8, w8, w9
    strb     w8, [x23, #1]
    ldrb     w8, [x19, #1]
    eor      w8, w8, w15
    strb     w8, [x23, #2]
    ldrb     w8, [x19, #2]
    eor      w8, w8, #0x78
    strb     w8, [x23, #3]
    ldrb     w8, [x19, #3]
    mov      w9, #0xb0
    eor      w8, w8, w9
    strb     w8, [x23, #4]
    ldrb     w8, [x19, #4]
    mov      w9, #0x41
    eor      w8, w8, w9
    strb     w8, [x23, #5]
    ldrb     w8, [x19, #5]
    mov      w9, #0xeb
    eor      w8, w8, w9
    strb     w8, [x23, #6]
    ldrb     w8, [x19, #6]
    mov      w9, #0x49
    eor      w8, w8, w9
    strb     w8, [x23, #7]
    ldr      x8, [sp, #0x10]
    str      w12, [x8]
    b        #0x3551c8
    ldp      x1, x0, [sp, #0x38]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f0]
    ldr      x2, [sp, #8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      w15, #0xd3
    mov      w13, #0x476a
    movk     w13, #0xf04c, lsl #16
    mov      w12, #0x82a6
    movk     w12, #0xcc89, lsl #16
    mov      w11, #0x57cd
    movk     w11, #0x5fe3, lsl #16
    mov      w10, #0xf708
    movk     w10, #0xb08d, lsl #16
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x9e8]
    stp      x8, x0, [sp, #0x20]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x5ace
    movk     w9, #0x4ce1, lsl #16
    str      w9, [x8]
    b        #0x3551c8
    ldr      w8, [sp, #0x4c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x4b]
    ldr      x8, [sp, #0x10]
    str      w11, [x8]
    b        #0x3551c8
    adrp     x8, #0x581000
    add      x8, x8, #0x300
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x9, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x308]
    stp      x8, x9, [sp, #0x38]
    ldr      x8, [sp, #0x10]
    str      w28, [x8]
    b        #0x3551c8
    mov      w9, #0x5ace
    movk     w9, #0x4ce1, lsl #16
    cmp      w8, w9
    b.ne     #0x3551c8
    ldp      x2, x0, [sp, #0x28]
    ldr      x1, [sp, #0x20]
    adrp     x3, #0x54d000
    add      x3, x3, #0x400
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp]
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    add      sp, sp, #0xb0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups badgeColorMode] IMP=0x3555A4 bounds=0x3555A4-0x355A70
loc_3555A4:
    sub      sp, sp, #0xc0
    stp      x28, x27, [sp, #0x60]
    stp      x26, x25, [sp, #0x70]
    stp      x24, x23, [sp, #0x80]
    stp      x22, x21, [sp, #0x90]
    stp      x20, x19, [sp, #0xa0]
    stp      x29, x30, [sp, #0xb0]
    add      x29, sp, #0xb0
    mov      w21, #0xb639
    movk     w21, #0x224b, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x304
    ldar     w8, [x8]
    stur     w8, [x29, #-0x54]
    mov      w9, #0x7b6c
    movk     w9, #0xc05b, lsl #16
    add      x8, sp, #0x14
    str      w9, [sp, #0x14]
    mov      w24, #0x7039
    movk     w24, #0xeebd, lsl #16
    mov      w25, #0x190b
    movk     w25, #0xc20f, lsl #16
    str      x8, [sp, #8]
    mov      w27, #0x190c
    movk     w27, #0xc20f, lsl #16
    adrp     x22, #0x54d000
    add      x22, x22, #0x44d
    adrp     x19, #0x54d000
    add      x19, x19, #0x42e
    adrp     x26, #0x54d000
    add      x26, x26, #0x459
    mov      w23, #0xb638
    movk     w23, #0x224b, lsl #16
    adrp     x20, #0x54d000
    add      x20, x20, #0x420
    adrp     x28, #0x54d000
    add      x28, x28, #0x440
    ldr      w8, [sp, #0x14]
    cmp      w8, w24
    b.gt     #0x3556a4
    cmp      w8, w25
    b.le     #0x3557b8
    cmp      w8, w27
    b.eq     #0x3559dc
    mov      w9, #0x28d9
    movk     w9, #0xd1fa, lsl #16
    cmp      w8, w9
    b.eq     #0x355884
    mov      w9, #0x8d90
    movk     w9, #0xdbc8, lsl #16
    cmp      w8, w9
    b.ne     #0x355638
    ldp      x1, x0, [sp, #0x48]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x330]
    stp      x8, x0, [sp, #0x38]
    ldr      x8, [sp, #8]
    mov      w9, #0x9836
    movk     w9, #0x3005, lsl #16
    str      w9, [x8]
    b        #0x355638
    cmp      w8, w23
    b.le     #0x3557fc
    cmp      w8, w21
    b.eq     #0x3559f8
    mov      w9, #0x9836
    movk     w9, #0x3005, lsl #16
    cmp      w8, w9
    b.eq     #0x35595c
    mov      w9, #0x1279
    movk     w9, #0x6b9d, lsl #16
    cmp      w8, w9
    b.ne     #0x355638
    ldrb     w8, [x20]
    eor      w8, w8, #0x3f
    strb     w8, [x28]
    ldrb     w8, [x20, #1]
    eor      w8, w8, #0xfffffffd
    strb     w8, [x28, #1]
    ldrb     w8, [x20, #2]
    eor      w8, w8, #0x3e
    strb     w8, [x28, #2]
    ldrb     w8, [x20, #3]
    mov      w9, #0x17
    eor      w8, w8, w9
    strb     w8, [x28, #3]
    ldrb     w8, [x20, #4]
    mov      w9, #0xa
    eor      w8, w8, w9
    strb     w8, [x28, #4]
    ldrb     w8, [x20, #5]
    eor      w8, w8, #0xffffffe1
    strb     w8, [x28, #5]
    ldrb     w8, [x20, #6]
    mov      w9, #0x28
    eor      w8, w8, w9
    strb     w8, [x28, #6]
    ldrb     w8, [x20, #7]
    mov      w9, #0xd5
    eor      w8, w8, w9
    strb     w8, [x28, #7]
    ldrb     w8, [x20, #8]
    mov      w9, #0x86
    eor      w8, w8, w9
    strb     w8, [x28, #8]
    ldrb     w8, [x20, #9]
    mov      w9, #0xbe
    eor      w8, w8, w9
    strb     w8, [x28, #9]
    ldrb     w8, [x20, #0xa]
    mov      w9, #0xd
    eor      w8, w8, w9
    strb     w8, [x28, #0xa]
    ldrb     w8, [x20, #0xb]
    mov      w9, #0xb
    eor      w8, w8, w9
    strb     w8, [x28, #0xb]
    ldrb     w8, [x20, #0xc]
    mov      w9, #0xd0
    eor      w8, w8, w9
    strb     w8, [x28, #0xc]
    ldrb     w8, [x20, #0xd]
    mov      w9, #0x5b
    eor      w8, w8, w9
    sturb    w8, [x29, #-0x56]
    ldr      x8, [sp, #8]
    mov      w9, #0x28d9
    movk     w9, #0xd1fa, lsl #16
    str      w9, [x8]
    b        #0x355638
    mov      w9, #0xeee0
    movk     w9, #0xb4f1, lsl #16
    cmp      w8, w9
    b.eq     #0x3559c4
    mov      w9, #0x7b6c
    movk     w9, #0xc05b, lsl #16
    cmp      w8, w9
    b.ne     #0x355a30
    ldur     w8, [x29, #-0x54]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x55]
    ldr      x8, [sp, #8]
    mov      w9, #0x2da7
    movk     w9, #0xf3f5, lsl #16
    str      w9, [x8]
    b        #0x355638
    mov      w9, #0x703a
    movk     w9, #0xeebd, lsl #16
    cmp      w8, w9
    b.eq     #0x35583c
    mov      w9, #0x2da7
    movk     w9, #0xf3f5, lsl #16
    cmp      w8, w9
    b.ne     #0x355638
    ldurb    w8, [x29, #-0x55]
    cmp      w8, #0
    mov      w8, #0x1279
    movk     w8, #0x6b9d, lsl #16
    csel     w8, w8, w21, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x355638
    ldurb    w8, [x29, #-0x57]
    strb     w8, [x26]
    adrp     x10, #0x54d000
    add      x10, x10, #0x43a
    ldrb     w8, [x10]
    mov      w9, #0x3d
    eor      w8, w8, w9
    strb     w8, [x26, #1]
    ldrb     w8, [x10, #1]
    mov      w9, #0xa3
    eor      w8, w8, w9
    strb     w8, [x26, #2]
    ldrb     w8, [x10, #2]
    eor      w8, w8, #0x1c
    strb     w8, [x26, #3]
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x355638
    ldurb    w8, [x29, #-0x56]
    strb     w8, [x22]
    ldrb     w8, [x19]
    mov      w9, #0x93
    eor      w8, w8, w9
    strb     w8, [x22, #1]
    ldrb     w8, [x19, #1]
    mov      w9, #0xd0
    eor      w8, w8, w9
    strb     w8, [x22, #2]
    ldrb     w8, [x19, #2]
    mov      w9, #0x31
    eor      w8, w8, w9
    strb     w8, [x22, #3]
    ldrb     w8, [x19, #3]
    eor      w8, w8, #0x78
    strb     w8, [x22, #4]
    ldrb     w8, [x19, #4]
    mov      w9, #0x42
    eor      w8, w8, w9
    strb     w8, [x22, #5]
    ldrb     w8, [x19, #5]
    mov      w9, #0x64
    eor      w8, w8, w9
    strb     w8, [x22, #6]
    ldrb     w8, [x19, #6]
    mov      w9, #0xd9
    eor      w8, w8, w9
    strb     w8, [x22, #7]
    ldrb     w8, [x19, #7]
    mov      w9, #0x86
    eor      w8, w8, w9
    strb     w8, [x22, #8]
    ldrb     w8, [x19, #8]
    mov      w9, #0x2c
    eor      w8, w8, w9
    strb     w8, [x22, #9]
    ldrb     w8, [x19, #9]
    mov      w9, #0xa3
    eor      w8, w8, w9
    strb     w8, [x22, #0xa]
    ldrb     w8, [x19, #0xa]
    mov      w9, #0xad
    eor      w8, w8, w9
    strb     w8, [x22, #0xb]
    ldrb     w8, [x19, #0xb]
    mov      w9, #0xcd
    eor      w8, w8, w9
    sturb    w8, [x29, #-0x57]
    ldr      x8, [sp, #8]
    mov      w9, #0x703a
    movk     w9, #0xeebd, lsl #16
    str      w9, [x8]
    b        #0x355638
    ldp      x1, x0, [sp, #0x38]
    adrp     x2, #0x54d000
    add      x2, x2, #0x480
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    ldr      x0, [sp, #0x40]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x2, [x8, #0x4e8]
    str      x2, [sp, #0x28]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    ldr      x0, [sp, #0x30]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp, #8]
    mov      w9, #0x198b
    movk     w9, #0xa5d8, lsl #16
    mov      w10, #0xeee0
    movk     w10, #0xb4f1, lsl #16
    csel     w9, w10, w9, ne
    str      w9, [x8]
    str      xzr, [sp, #0x18]
    b        #0x355638
    ldp      x1, x0, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x20]
    ldr      x8, [sp, #8]
    str      w27, [x8]
    b        #0x355638
    ldr      x8, [sp, #8]
    mov      w9, #0x198b
    movk     w9, #0xa5d8, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x20]
    str      x8, [sp, #0x18]
    b        #0x355638
    adrp     x8, #0x581000
    add      x8, x8, #0x304
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x9, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x308]
    stp      x8, x9, [sp, #0x48]
    ldr      x8, [sp, #8]
    mov      w9, #0x8d90
    movk     w9, #0xdbc8, lsl #16
    str      w9, [x8]
    b        #0x355638
    mov      w9, #0x198b
    movk     w9, #0xa5d8, lsl #16
    cmp      w8, w9
    b.ne     #0x355638
    ldr      x19, [sp, #0x18]
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0xb0]
    ldp      x20, x19, [sp, #0xa0]
    ldp      x22, x21, [sp, #0x90]
    ldp      x24, x23, [sp, #0x80]
    ldp      x26, x25, [sp, #0x70]
    ldp      x28, x27, [sp, #0x60]
    add      sp, sp, #0xc0
    ret      

// -[WCLGHomeGroups setBadgeColorMode:] IMP=0x355A70 bounds=0x355A70-0x355EAC
loc_355A70:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    stp      x0, x2, [sp]
    mov      w23, #0x5eaf
    movk     w23, #0x91ac, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x308
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w8, #0x9f93
    movk     w8, #0x7846, lsl #16
    str      w8, [sp, #0x1c]
    add      x8, sp, #0x1c
    mov      w26, #0x5162
    movk     w26, #0x2f9a, lsl #16
    str      x8, [sp, #0x10]
    mov      w27, #0xae89
    movk     w27, #0x99f9, lsl #16
    mov      w10, #0x1305
    movk     w10, #0x9363, lsl #16
    mov      w11, #0xae8a
    movk     w11, #0x99f9, lsl #16
    adrp     x21, #0x54d000
    add      x21, x21, #0x4c3
    adrp     x25, #0x54d000
    add      x25, x25, #0x4a4
    mov      w13, #0x5dbf
    movk     w13, #0xbf3e, lsl #16
    adrp     x24, #0x54d000
    add      x24, x24, #0x4d3
    adrp     x28, #0x54d000
    add      x28, x28, #0x4b4
    mov      w20, #0x9f92
    movk     w20, #0x7846, lsl #16
    mov      w14, #0x5163
    movk     w14, #0x2f9a, lsl #16
    mov      w15, #0xa68b
    movk     w15, #0x4f3a, lsl #16
    adrp     x19, #0x54d000
    add      x19, x19, #0x4a0
    ldr      w8, [sp, #0x1c]
    cmp      w8, w26
    b.gt     #0x355be4
    cmp      w8, w27
    b.gt     #0x355c48
    cmp      w8, w23
    b.eq     #0x355d3c
    cmp      w8, w10
    b.ne     #0x355b28
    ldp      x1, x0, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x20]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f0]
    ldr      x2, [sp, #8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    ldr      x0, [sp, #0x20]
    mov      x2, x22
    adrp     x3, #0x54d000
    add      x3, x3, #0x500
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      w15, #0xa68b
    movk     w15, #0x4f3a, lsl #16
    mov      w14, #0x5163
    movk     w14, #0x2f9a, lsl #16
    mov      w13, #0x5dbf
    movk     w13, #0xbf3e, lsl #16
    mov      w11, #0xae8a
    movk     w11, #0x99f9, lsl #16
    mov      w10, #0x1305
    movk     w10, #0x9363, lsl #16
    ldr      x8, [sp, #0x10]
    mov      w9, #0xffb8
    movk     w9, #0x798f, lsl #16
    str      w9, [x8]
    b        #0x355b28
    cmp      w8, w20
    b.gt     #0x355cf8
    cmp      w8, w14
    b.eq     #0x355d24
    cmp      w8, w15
    b.ne     #0x355b28
    ldrb     w8, [x19]
    eor      w8, w8, #0xcccccccc
    adrp     x12, #0x54d000
    add      x12, x12, #0x4c0
    strb     w8, [x12]
    ldrb     w8, [x19, #1]
    mov      w9, #0xe4
    eor      w8, w8, w9
    strb     w8, [x12, #1]
    ldrb     w8, [x19, #2]
    eor      w8, w8, w9
    strb     w8, [x12, #2]
    ldrb     w8, [x19, #3]
    mov      w9, #0x61
    eor      w8, w8, w9
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp, #0x10]
    str      w11, [x8]
    b        #0x355b28
    cmp      w8, w11
    b.eq     #0x355d6c
    cmp      w8, w13
    b.ne     #0x355b28
    ldrb     w8, [sp, #0x39]
    mov      w9, #0x5f
    eor      w8, w8, w9
    strb     w8, [x24]
    ldrb     w8, [x28]
    mov      w9, #0xba
    eor      w8, w8, w9
    strb     w8, [x24, #1]
    ldrb     w8, [x28, #1]
    mov      w9, #0x15
    eor      w8, w8, w9
    strb     w8, [x24, #2]
    ldrb     w8, [x28, #2]
    eor      w8, w8, #0x88888888
    strb     w8, [x24, #3]
    ldrb     w8, [x28, #3]
    eor      w8, w8, #0xffffffe7
    strb     w8, [x24, #4]
    ldrb     w8, [x28, #4]
    mov      w9, #0xbc
    eor      w8, w8, w9
    strb     w8, [x24, #5]
    ldrb     w8, [x28, #5]
    mov      w9, #0x56
    eor      w8, w8, w9
    strb     w8, [x24, #6]
    ldrb     w8, [x28, #6]
    mov      w9, #0x6e
    eor      w8, w8, w9
    strb     w8, [x24, #7]
    ldrb     w8, [x28, #7]
    mov      w9, #0x41
    eor      w8, w8, w9
    strb     w8, [x24, #8]
    ldrb     w8, [x28, #8]
    eor      w8, w8, #0xc0
    strb     w8, [x24, #9]
    ldr      x8, [sp, #0x10]
    str      w23, [x8]
    b        #0x355b28
    mov      w9, #0x9f93
    movk     w9, #0x7846, lsl #16
    cmp      w8, w9
    b.ne     #0x355e68
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp, #0x10]
    str      w14, [x8]
    b        #0x355b28
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    csel     w8, w15, w23, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x355b28
    adrp     x8, #0x581000
    add      x8, x8, #0x308
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x9, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x308]
    stp      x8, x9, [sp, #0x28]
    ldr      x8, [sp, #0x10]
    str      w10, [x8]
    b        #0x355b28
    ldrb     w8, [sp, #0x3a]
    strb     w8, [x21]
    ldrb     w8, [x25]
    mov      w9, #0xb2
    eor      w8, w8, w9
    strb     w8, [x21, #1]
    ldrb     w8, [x25, #1]
    mov      w12, #0xad
    eor      w8, w8, w12
    strb     w8, [x21, #2]
    ldrb     w8, [x25, #2]
    eor      w8, w8, #0xffffff83
    strb     w8, [x21, #3]
    ldrb     w8, [x25, #3]
    mov      w12, #0xac
    eor      w8, w8, w12
    strb     w8, [x21, #4]
    ldrb     w8, [x25, #4]
    eor      w8, w8, w9
    strb     w8, [x21, #5]
    ldrb     w8, [x25, #5]
    eor      w8, w8, #0x20
    strb     w8, [x21, #6]
    ldrb     w8, [x25, #6]
    mov      w9, #0x16
    eor      w8, w8, w9
    strb     w8, [x21, #7]
    ldrb     w8, [x25, #7]
    mov      w9, #0x1d
    eor      w8, w8, w9
    strb     w8, [x21, #8]
    ldrb     w8, [x25, #8]
    mov      w9, #0xdb
    eor      w8, w8, w9
    strb     w8, [x21, #9]
    ldrb     w8, [x25, #9]
    eor      w8, w8, #0xfffffffb
    strb     w8, [x21, #0xa]
    ldrb     w8, [x25, #0xa]
    mov      w9, #0x53
    eor      w8, w8, w9
    strb     w8, [x21, #0xb]
    ldrb     w8, [x25, #0xb]
    mov      w9, #0x42
    eor      w8, w8, w9
    strb     w8, [x21, #0xc]
    ldrb     w8, [x25, #0xc]
    mov      w9, #0x90
    eor      w8, w8, w9
    strb     w8, [x21, #0xd]
    ldrb     w8, [x25, #0xd]
    mov      w9, #0x9c
    eor      w8, w8, w9
    strb     w8, [x21, #0xe]
    ldrb     w8, [x25, #0xe]
    mov      w9, #0x9a
    eor      w8, w8, w9
    strb     w8, [x21, #0xf]
    ldrb     w8, [x25, #0xf]
    strb     w8, [sp, #0x39]
    ldr      x8, [sp, #0x10]
    str      w13, [x8]
    b        #0x355b28
    mov      w9, #0xffb8
    movk     w9, #0x798f, lsl #16
    cmp      w8, w9
    b.ne     #0x355b28
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups badgeColorDarkMode] IMP=0x355EAC bounds=0x355EAC-0x35637C
loc_355EAC:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    adrp     x8, #0x581000
    add      x8, x8, #0x30c
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w9, #0x3686
    movk     w9, #0x3f38, lsl #16
    add      x8, sp, #0xc
    str      w9, [sp, #0xc]
    mov      w24, #0x5f7c
    movk     w24, #0x2185, lsl #16
    mov      w25, #0x4f53
    movk     w25, #0xb853, lsl #16
    str      x8, [sp]
    mov      w28, #0x4f54
    movk     w28, #0xb853, lsl #16
    adrp     x19, #0x54d000
    add      x19, x19, #0x52b
    mov      w23, #0xfa6
    movk     w23, #0xbac9, lsl #16
    adrp     x22, #0x54d000
    add      x22, x22, #0x55b
    mov      w20, #0xe5b8
    movk     w20, #0x3fd6, lsl #16
    mov      w26, #0xe5b9
    movk     w26, #0x3fd6, lsl #16
    adrp     x27, #0x54d000
    add      x27, x27, #0x520
    adrp     x21, #0x54d000
    add      x21, x21, #0x550
    ldr      w8, [sp, #0xc]
    cmp      w8, w24
    b.le     #0x355f94
    cmp      w8, w20
    b.le     #0x356000
    cmp      w8, w26
    b.eq     #0x3562dc
    mov      w9, #0xb157
    movk     w9, #0x4dca, lsl #16
    cmp      w8, w9
    b.eq     #0x3560d0
    mov      w9, #0xb1c3
    movk     w9, #0x5f6b, lsl #16
    cmp      w8, w9
    b.ne     #0x355f40
    ldp      x1, x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x18]
    ldr      x8, [sp]
    str      w28, [x8]
    b        #0x355f40
    cmp      w8, w25
    b.le     #0x356044
    cmp      w8, w28
    b.eq     #0x356320
    cmp      w8, w23
    b.eq     #0x356160
    mov      w9, #0x6ce0
    movk     w9, #0x97c, lsl #16
    cmp      w8, w9
    b.ne     #0x355f40
    ldrb     w8, [sp, #0x3a]
    adrp     x9, #0x54d000
    add      x9, x9, #0x558
    strb     w8, [x9]
    adrp     x10, #0x54d000
    add      x10, x10, #0x529
    ldrb     w8, [x10]
    mov      w11, #0x4b
    eor      w8, w8, w11
    strb     w8, [x9, #1]
    ldrb     w8, [x10, #1]
    mov      w10, #0xa4
    eor      w8, w8, w10
    strb     w8, [x9, #2]
    ldr      x8, [sp]
    str      w23, [x8]
    b        #0x355f40
    mov      w9, #0x65fe
    movk     w9, #0x33a3, lsl #16
    cmp      w8, w9
    b.eq     #0x3562a4
    mov      w9, #0x3686
    movk     w9, #0x3f38, lsl #16
    cmp      w8, w9
    b.ne     #0x35633c
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp]
    mov      w9, #0x94fa
    movk     w9, #0x8a61, lsl #16
    str      w9, [x8]
    b        #0x355f40
    mov      w9, #0x94fa
    movk     w9, #0x8a61, lsl #16
    cmp      w8, w9
    b.eq     #0x3560a8
    mov      w9, #0xced1
    movk     w9, #0xab23, lsl #16
    cmp      w8, w9
    b.ne     #0x355f40
    adrp     x8, #0x581000
    add      x8, x8, #0x30c
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    ldr      x8, [sp]
    mov      w9, #0x65fe
    movk     w9, #0x33a3, lsl #16
    str      w9, [x8]
    b        #0x355f40
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    mov      w8, #0xced1
    movk     w8, #0xab23, lsl #16
    mov      w9, #0xb157
    movk     w9, #0x4dca, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x355f40
    ldrb     w8, [x27]
    mov      w9, #0x64
    eor      w8, w8, w9
    strb     w8, [x21]
    ldrb     w8, [x27, #1]
    eor      w8, w8, #0xc
    strb     w8, [x21, #1]
    ldrb     w8, [x27, #2]
    mov      w9, #0xf5
    eor      w8, w8, w9
    strb     w8, [x21, #2]
    ldrb     w8, [x27, #3]
    eor      w8, w8, #0xc
    strb     w8, [x21, #3]
    ldrb     w8, [x27, #4]
    eor      w8, w8, #2
    strb     w8, [x21, #4]
    ldrb     w8, [x27, #5]
    eor      w8, w8, #0x30
    strb     w8, [x21, #5]
    ldrb     w8, [x27, #6]
    mov      w9, #0x9b
    eor      w8, w8, w9
    strb     w8, [x21, #6]
    ldrb     w8, [x27, #7]
    mov      w9, #0x9d
    eor      w8, w8, w9
    strb     w8, [x21, #7]
    ldrb     w8, [x27, #8]
    eor      w8, w8, #0xe0
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp]
    mov      w9, #0x6ce0
    movk     w9, #0x97c, lsl #16
    str      w9, [x8]
    b        #0x355f40
    ldrb     w8, [x19]
    eor      w8, w8, #0x33333333
    strb     w8, [x22]
    ldrb     w8, [x19, #1]
    mov      w9, #0x96
    eor      w8, w8, w9
    strb     w8, [x22, #1]
    ldrb     w8, [x19, #2]
    mov      w9, #0xd4
    eor      w8, w8, w9
    strb     w8, [x22, #2]
    ldrb     w8, [x19, #3]
    eor      w8, w8, #0x44444444
    strb     w8, [x22, #3]
    ldrb     w8, [x19, #4]
    eor      w8, w8, #0x3e
    strb     w8, [x22, #4]
    ldrb     w8, [x19, #5]
    eor      w8, w8, #3
    strb     w8, [x22, #5]
    ldrb     w8, [x19, #6]
    strb     w8, [x22, #6]
    ldrb     w8, [x19, #7]
    mov      w9, #0x8a
    eor      w8, w8, w9
    strb     w8, [x22, #7]
    ldrb     w8, [x19, #8]
    mov      w9, #0x4f
    eor      w8, w8, w9
    strb     w8, [x22, #8]
    ldrb     w8, [x19, #9]
    eor      w8, w8, #0xffffffcf
    strb     w8, [x22, #9]
    ldrb     w8, [x19, #0xa]
    mov      w9, #0x8c
    eor      w8, w8, w9
    strb     w8, [x22, #0xa]
    ldrb     w8, [x19, #0xb]
    eor      w8, w8, #0x70
    strb     w8, [x22, #0xb]
    ldrb     w8, [x19, #0xc]
    mov      w9, #0xd3
    eor      w8, w8, w9
    strb     w8, [x22, #0xc]
    ldrb     w8, [x19, #0xd]
    eor      w8, w8, #0xfffffffd
    strb     w8, [x22, #0xd]
    ldrb     w8, [x19, #0xe]
    mov      w9, #0xb4
    eor      w8, w8, w9
    strb     w8, [x22, #0xe]
    ldrb     w8, [x19, #0xf]
    eor      w8, w8, #0x3e
    strb     w8, [x22, #0xf]
    ldrb     w8, [x19, #0x10]
    eor      w8, w8, #8
    strb     w8, [x22, #0x10]
    ldrb     w8, [x19, #0x11]
    mov      w9, #0xcb
    eor      w8, w8, w9
    strb     w8, [x22, #0x11]
    ldrb     w8, [x19, #0x12]
    mov      w9, #0x2b
    eor      w8, w8, w9
    strb     w8, [x22, #0x12]
    ldrb     w8, [x19, #0x13]
    mov      w9, #0x61
    eor      w8, w8, w9
    strb     w8, [x22, #0x13]
    ldrb     w8, [x19, #0x14]
    mov      w9, #0x64
    eor      w8, w8, w9
    strb     w8, [x22, #0x14]
    ldrb     w8, [x19, #0x15]
    eor      w8, w8, #7
    strb     w8, [x22, #0x15]
    ldr      x8, [sp]
    mov      w9, #0xced1
    movk     w9, #0xab23, lsl #16
    str      w9, [x8]
    b        #0x355f40
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    ldr      x0, [sp, #0x30]
    adrp     x2, #0x54d000
    add      x2, x2, #0x5a0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    str      w26, [x8]
    b        #0x355f40
    adrp     x8, #0x4be000
    ldr      x2, [x8, #0x4e8]
    str      x2, [sp, #0x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    ldr      x0, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp]
    mov      w9, #0x5f7d
    movk     w9, #0x2185, lsl #16
    mov      w10, #0xb1c3
    movk     w10, #0x5f6b, lsl #16
    csel     w9, w10, w9, ne
    str      w9, [x8]
    str      xzr, [sp, #0x10]
    b        #0x355f40
    ldr      x8, [sp]
    mov      w9, #0x5f7d
    movk     w9, #0x2185, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x18]
    str      x8, [sp, #0x10]
    b        #0x355f40
    mov      w9, #0x5f7d
    movk     w9, #0x2185, lsl #16
    cmp      w8, w9
    b.ne     #0x355f40
    ldr      x19, [sp, #0x10]
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    ret      

// -[WCLGHomeGroups setBadgeColorDarkMode:] IMP=0x35637C bounds=0x35637C-0x3567F0
loc_35637C:
    sub      sp, sp, #0xb0
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    stp      x0, x2, [sp, #8]
    mov      w21, #0x666d
    movk     w21, #0xf196, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x310
    ldar     w8, [x8]
    str      w8, [sp, #0x4c]
    mov      w8, #0xb1b3
    movk     w8, #0xffcc, lsl #16
    str      w8, [sp, #0x24]
    add      x8, sp, #0x24
    mov      w24, #0x666c
    movk     w24, #0xf196, lsl #16
    str      x8, [sp, #0x18]
    adrp     x26, #0x54d000
    add      x26, x26, #0x60c
    adrp     x28, #0x54d000
    add      x28, x28, #0x5dd
    adrp     x23, #0x54d000
    add      x23, x23, #0x5c0
    adrp     x19, #0x54d000
    add      x19, x19, #0x5f0
    mov      w20, #0x302a
    movk     w20, #0x1503, lsl #16
    mov      w27, #0x302b
    movk     w27, #0x1503, lsl #16
    adrp     x22, #0x54d000
    add      x22, x22, #0x5f7
    adrp     x25, #0x54d000
    add      x25, x25, #0x5c8
    ldr      w8, [sp, #0x24]
    cmp      w8, w24
    b.le     #0x356464
    cmp      w8, w20
    b.gt     #0x3564b4
    cmp      w8, w21
    b.eq     #0x356710
    mov      w9, #0xb1b3
    movk     w9, #0xffcc, lsl #16
    cmp      w8, w9
    b.ne     #0x356414
    ldr      w8, [sp, #0x4c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x4b]
    ldr      x8, [sp, #0x18]
    mov      w9, #0xd119
    movk     w9, #0xd0cc, lsl #16
    str      w9, [x8]
    b        #0x356414
    mov      w9, #0x5b87
    movk     w9, #0xcd01, lsl #16
    cmp      w8, w9
    b.le     #0x356620
    mov      w9, #0x5b88
    movk     w9, #0xcd01, lsl #16
    cmp      w8, w9
    b.eq     #0x356688
    mov      w9, #0xd119
    movk     w9, #0xd0cc, lsl #16
    cmp      w8, w9
    b.ne     #0x356414
    ldrb     w8, [sp, #0x4b]
    cmp      w8, #0
    mov      w8, #0x5b88
    movk     w8, #0xcd01, lsl #16
    csel     w8, w8, w21, ne
    ldr      x9, [sp, #0x18]
    str      w8, [x9]
    b        #0x356414
    cmp      w8, w27
    b.eq     #0x356754
    mov      w9, #0xe690
    movk     w9, #0x1cdc, lsl #16
    cmp      w8, w9
    b.ne     #0x356414
    ldrb     w8, [sp, #0x4a]
    mov      w9, #9
    eor      w8, w8, w9
    strb     w8, [x22]
    ldrb     w8, [x25]
    mov      w9, #0xb3
    eor      w8, w8, w9
    strb     w8, [x22, #1]
    ldrb     w8, [x25, #1]
    mov      w9, #0xb9
    eor      w8, w8, w9
    strb     w8, [x22, #2]
    ldrb     w8, [x25, #2]
    eor      w8, w8, #0x3c
    strb     w8, [x22, #3]
    ldrb     w8, [x25, #3]
    mov      w9, #0xbd
    eor      w8, w8, w9
    strb     w8, [x22, #4]
    ldrb     w8, [x25, #4]
    mov      w9, #0x8a
    eor      w8, w8, w9
    strb     w8, [x22, #5]
    ldrb     w8, [x25, #5]
    mov      w9, #0x41
    eor      w8, w8, w9
    strb     w8, [x22, #6]
    ldrb     w8, [x25, #6]
    mov      w9, #0xb
    eor      w8, w8, w9
    strb     w8, [x22, #7]
    ldrb     w8, [x25, #7]
    mov      w9, #0x5c
    eor      w8, w8, w9
    strb     w8, [x22, #8]
    ldrb     w8, [x25, #8]
    eor      w8, w8, #0x30
    strb     w8, [x22, #9]
    ldrb     w8, [x25, #9]
    eor      w8, w8, #0xeeeeeeee
    strb     w8, [x22, #0xa]
    ldrb     w8, [x25, #0xa]
    mov      w10, #0x9a
    eor      w8, w8, w10
    strb     w8, [x22, #0xb]
    ldrb     w8, [x25, #0xb]
    eor      w8, w8, w9
    strb     w8, [x22, #0xc]
    ldrb     w8, [x25, #0xc]
    mov      w9, #0x85
    eor      w8, w8, w9
    strb     w8, [x22, #0xd]
    ldrb     w8, [x25, #0xd]
    mov      w9, #0xa7
    eor      w8, w8, w9
    strb     w8, [x22, #0xe]
    ldrb     w8, [x25, #0xe]
    mov      w9, #0x76
    eor      w8, w8, w9
    strb     w8, [x22, #0xf]
    ldrb     w8, [x25, #0xf]
    eor      w8, w8, #0xeeeeeeee
    strb     w8, [x22, #0x10]
    ldrb     w8, [x25, #0x10]
    mov      w9, #0xca
    eor      w8, w8, w9
    strb     w8, [x22, #0x11]
    ldrb     w8, [x25, #0x11]
    mov      w9, #0x1d
    eor      w8, w8, w9
    strb     w8, [x22, #0x12]
    ldrb     w8, [x25, #0x12]
    eor      w8, w8, #0xffffffef
    strb     w8, [x22, #0x13]
    ldrb     w8, [x25, #0x13]
    mov      w9, #0xb2
    eor      w8, w8, w9
    strb     w8, [x22, #0x14]
    ldrb     w8, [x25, #0x14]
    strb     w8, [sp, #0x49]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x3087
    movk     w9, #0xba71, lsl #16
    str      w9, [x8]
    b        #0x356414
    mov      w9, #0x3087
    movk     w9, #0xba71, lsl #16
    cmp      w8, w9
    b.ne     #0x356790
    ldrb     w8, [sp, #0x49]
    eor      w8, w8, #0xfffffff1
    strb     w8, [x26]
    ldrb     w8, [x28]
    mov      w9, #0xe2
    eor      w8, w8, w9
    strb     w8, [x26, #1]
    ldrb     w8, [x28, #1]
    mov      w9, #0x24
    eor      w8, w8, w9
    strb     w8, [x26, #2]
    ldrb     w8, [x28, #2]
    mov      w9, #0xe4
    eor      w8, w8, w9
    strb     w8, [x26, #3]
    ldrb     w8, [x28, #3]
    mov      w9, #0xd1
    eor      w8, w8, w9
    strb     w8, [x26, #4]
    ldr      x8, [sp, #0x18]
    str      w21, [x8]
    b        #0x356414
    ldrb     w8, [x23]
    mov      w9, #0xc6
    eor      w8, w8, w9
    strb     w8, [x19]
    ldrb     w8, [x23, #1]
    mov      w9, #0x2c
    eor      w8, w8, w9
    strb     w8, [x19, #1]
    ldrb     w8, [x23, #2]
    mov      w9, #0x6b
    eor      w8, w8, w9
    strb     w8, [x19, #2]
    ldrb     w8, [x23, #3]
    eor      w8, w8, #0x3f
    strb     w8, [x19, #3]
    ldrb     w8, [x23, #4]
    mov      w9, #0xbe
    eor      w8, w8, w9
    strb     w8, [x19, #4]
    ldrb     w8, [x23, #5]
    mov      w9, #0x31
    eor      w8, w8, w9
    strb     w8, [x19, #5]
    ldrb     w8, [x23, #6]
    mov      w9, #0x2e
    eor      w8, w8, w9
    strb     w8, [x19, #6]
    ldrb     w8, [x23, #7]
    strb     w8, [sp, #0x4a]
    ldr      x8, [sp, #0x18]
    mov      w9, #0xe690
    movk     w9, #0x1cdc, lsl #16
    str      w9, [x8]
    b        #0x356414
    adrp     x8, #0x581000
    add      x8, x8, #0x310
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0xa8]
    stp      x8, x0, [sp, #0x38]
    ldr      x8, [sp, #0x18]
    str      w27, [x8]
    b        #0x356414
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f0]
    ldr      x0, [sp, #0x38]
    ldr      x2, [sp, #0x10]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x9e8]
    stp      x8, x0, [sp, #0x28]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x7de2
    movk     w9, #0xa45f, lsl #16
    str      w9, [x8]
    b        #0x356414
    mov      w9, #0x7de2
    movk     w9, #0xa45f, lsl #16
    cmp      w8, w9
    b.ne     #0x356414
    ldr      x0, [sp, #0x40]
    ldp      x1, x2, [sp, #0x28]
    adrp     x3, #0x54d000
    add      x3, x3, #0x640
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x40]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp, #8]
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    add      sp, sp, #0xb0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups stripSelectedColorMode] IMP=0x3567F0 bounds=0x3567F0-0x356D1C
loc_3567F0:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    adrp     x8, #0x581000
    add      x8, x8, #0x314
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w9, #0xda75
    movk     w9, #0xcf58, lsl #16
    add      x8, sp, #0xc
    str      w9, [sp, #0xc]
    mov      w24, #0x9653
    movk     w24, #0x19c1, lsl #16
    mov      w25, #0xda74
    movk     w25, #0xcf58, lsl #16
    str      x8, [sp]
    adrp     x28, #0x54d000
    add      x28, x28, #0x660
    adrp     x22, #0x54d000
    add      x22, x22, #0x690
    adrp     x20, #0x54d000
    add      x20, x20, #0x69d
    adrp     x27, #0x54d000
    add      x27, x27, #0x66e
    mov      w23, #0x880
    movk     w23, #0x44c2, lsl #16
    mov      w19, #0x881
    movk     w19, #0x44c2, lsl #16
    adrp     x21, #0x54d000
    add      x21, x21, #0x67d
    adrp     x26, #0x54d000
    add      x26, x26, #0x6ad
    ldr      w8, [sp, #0xc]
    cmp      w8, w24
    b.gt     #0x3569c0
    cmp      w8, w25
    b.le     #0x356a54
    mov      w9, #0xda75
    movk     w9, #0xcf58, lsl #16
    cmp      w8, w9
    b.eq     #0x356c80
    mov      w9, #0x6dc4
    movk     w9, #0xe7fa, lsl #16
    cmp      w8, w9
    b.eq     #0x356bbc
    mov      w9, #0x5cea
    movk     w9, #0x185a, lsl #16
    cmp      w8, w9
    b.ne     #0x356884
    ldrb     w8, [sp, #0x3a]
    strb     w8, [x20]
    ldrb     w8, [x27]
    mov      w9, #0xdc
    eor      w8, w8, w9
    strb     w8, [x20, #1]
    ldrb     w8, [x27, #1]
    mov      w9, #0x69
    eor      w8, w8, w9
    strb     w8, [x20, #2]
    ldrb     w8, [x27, #2]
    eor      w8, w8, #0xc
    strb     w8, [x20, #3]
    ldrb     w8, [x27, #3]
    eor      w8, w8, #0xffffffef
    strb     w8, [x20, #4]
    ldrb     w8, [x27, #4]
    eor      w8, w8, #0xf8
    strb     w8, [x20, #5]
    ldrb     w8, [x27, #5]
    mov      w9, #0x8c
    eor      w8, w8, w9
    strb     w8, [x20, #6]
    ldrb     w8, [x27, #6]
    mov      w9, #0xa7
    eor      w8, w8, w9
    strb     w8, [x20, #7]
    ldrb     w8, [x27, #7]
    mov      w9, #0xcd
    eor      w8, w8, w9
    strb     w8, [x20, #8]
    ldrb     w8, [x27, #8]
    mov      w9, #0x9b
    eor      w8, w8, w9
    strb     w8, [x20, #9]
    ldrb     w8, [x27, #9]
    eor      w8, w8, #0x7c
    strb     w8, [x20, #0xa]
    ldrb     w8, [x27, #0xa]
    eor      w8, w8, #0x7f
    strb     w8, [x20, #0xb]
    ldrb     w8, [x27, #0xb]
    mov      w9, #0xb6
    eor      w8, w8, w9
    strb     w8, [x20, #0xc]
    ldrb     w8, [x27, #0xc]
    mov      w9, #0x54
    eor      w8, w8, w9
    strb     w8, [x20, #0xd]
    ldrb     w8, [x27, #0xd]
    mov      w9, #0x3d
    eor      w8, w8, w9
    strb     w8, [x20, #0xe]
    ldrb     w8, [x27, #0xe]
    mov      w9, #0x27
    eor      w8, w8, w9
    strb     w8, [x20, #0xf]
    ldr      x8, [sp]
    mov      w9, #0x5f43
    movk     w9, #0x5282, lsl #16
    str      w9, [x8]
    b        #0x356884
    cmp      w8, w23
    b.le     #0x356b5c
    cmp      w8, w19
    b.eq     #0x356ca4
    mov      w9, #0x5f43
    movk     w9, #0x5282, lsl #16
    cmp      w8, w9
    b.eq     #0x356bd8
    mov      w9, #0xa706
    movk     w9, #0x52f9, lsl #16
    cmp      w8, w9
    b.ne     #0x356884
    adrp     x8, #0x581000
    add      x8, x8, #0x314
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    adrp     x2, #0x54d000
    add      x2, x2, #0x6e0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    ldr      x8, [sp]
    mov      w9, #0x9654
    movk     w9, #0x19c1, lsl #16
    str      w9, [x8]
    b        #0x356884
    mov      w9, #0xe210
    movk     w9, #0xb5d8, lsl #16
    cmp      w8, w9
    b.eq     #0x356c58
    mov      w9, #0x14e0
    movk     w9, #0xbf70, lsl #16
    cmp      w8, w9
    b.ne     #0x356cdc
    ldrb     w8, [x28]
    mov      w9, #0x3a
    eor      w8, w8, w9
    strb     w8, [x22]
    ldrb     w8, [x28, #1]
    mov      w9, #0xde
    eor      w8, w8, w9
    strb     w8, [x22, #1]
    ldrb     w8, [x28, #2]
    mov      w9, #0xa
    eor      w8, w8, w9
    strb     w8, [x22, #2]
    ldrb     w8, [x28, #3]
    mov      w9, #0xec
    eor      w8, w8, w9
    strb     w8, [x22, #3]
    ldrb     w8, [x28, #4]
    mov      w9, #0x75
    eor      w8, w8, w9
    strb     w8, [x22, #4]
    ldrb     w8, [x28, #5]
    eor      w8, w8, w9
    strb     w8, [x22, #5]
    ldrb     w8, [x28, #6]
    mov      w9, #0x34
    eor      w8, w8, w9
    strb     w8, [x22, #6]
    ldrb     w8, [x28, #7]
    mov      w9, #0x41
    eor      w8, w8, w9
    strb     w8, [x22, #7]
    ldrb     w8, [x28, #8]
    mov      w9, #0x6f
    eor      w8, w8, w9
    strb     w8, [x22, #8]
    ldrb     w8, [x28, #9]
    eor      w8, w8, #0x3f
    strb     w8, [x22, #9]
    ldrb     w8, [x28, #0xa]
    mov      w9, #0xa9
    eor      w8, w8, w9
    strb     w8, [x22, #0xa]
    ldrb     w8, [x28, #0xb]
    mov      w9, #0x89
    eor      w8, w8, w9
    strb     w8, [x22, #0xb]
    ldrb     w8, [x28, #0xc]
    mov      w9, #0xfa
    eor      w8, w8, w9
    strb     w8, [x22, #0xc]
    ldrb     w8, [x28, #0xd]
    eor      w8, w8, #3
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp]
    mov      w9, #0x5cea
    movk     w9, #0x185a, lsl #16
    str      w9, [x8]
    b        #0x356884
    mov      w9, #0x9654
    movk     w9, #0x19c1, lsl #16
    cmp      w8, w9
    b.eq     #0x356b9c
    mov      w9, #0x3194
    movk     w9, #0x2e42, lsl #16
    cmp      w8, w9
    b.ne     #0x356884
    ldp      x1, x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x18]
    ldr      x8, [sp]
    mov      w9, #0x6dc4
    movk     w9, #0xe7fa, lsl #16
    str      w9, [x8]
    b        #0x356884
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x4e8]
    str      x8, [sp, #0x20]
    ldr      x8, [sp]
    str      w19, [x8]
    b        #0x356884
    ldr      x8, [sp]
    mov      w9, #0xfbf6
    movk     w9, #0xb95b, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x18]
    str      x8, [sp, #0x10]
    b        #0x356884
    ldrb     w8, [x21]
    eor      w8, w8, #0x22222222
    strb     w8, [x26]
    ldrb     w8, [x21, #1]
    eor      w8, w8, #0x78
    strb     w8, [x26, #1]
    ldrb     w8, [x21, #2]
    mov      w9, #0x41
    eor      w8, w8, w9
    strb     w8, [x26, #2]
    ldrb     w8, [x21, #3]
    eor      w8, w8, #0xffffff8f
    strb     w8, [x26, #3]
    ldrb     w8, [x21, #4]
    mov      w9, #0x16
    eor      w8, w8, w9
    strb     w8, [x26, #4]
    ldrb     w8, [x21, #5]
    mov      w9, #0x8a
    eor      w8, w8, w9
    strb     w8, [x26, #5]
    ldrb     w8, [x21, #6]
    eor      w8, w8, #0xc
    strb     w8, [x26, #6]
    ldrb     w8, [x21, #7]
    eor      w8, w8, #2
    strb     w8, [x26, #7]
    ldr      x8, [sp]
    mov      w9, #0xa706
    movk     w9, #0x52f9, lsl #16
    str      w9, [x8]
    b        #0x356884
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    mov      w8, #0xa706
    movk     w8, #0x52f9, lsl #16
    mov      w9, #0x14e0
    movk     w9, #0xbf70, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x356884
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp]
    mov      w9, #0xe210
    movk     w9, #0xb5d8, lsl #16
    str      w9, [x8]
    b        #0x356884
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    ldp      x2, x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp]
    mov      w9, #0xfbf6
    movk     w9, #0xb95b, lsl #16
    mov      w10, #0x3194
    movk     w10, #0x2e42, lsl #16
    csel     w9, w10, w9, ne
    str      w9, [x8]
    str      xzr, [sp, #0x10]
    b        #0x356884
    mov      w9, #0xfbf6
    movk     w9, #0xb95b, lsl #16
    cmp      w8, w9
    b.ne     #0x356884
    ldr      x19, [sp, #0x10]
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    ret      

// -[WCLGHomeGroups setStripSelectedColorMode:] IMP=0x356D1C bounds=0x356D1C-0x3571B8
loc_356D1C:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    stp      x0, x2, [sp, #8]
    adrp     x8, #0x581000
    add      x8, x8, #0x318
    mov      w22, #0x1e86
    movk     w22, #0x49d3, lsl #16
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w8, #0xb96a
    movk     w8, #0x934f, lsl #16
    str      w8, [sp, #0x24]
    add      x8, sp, #0x24
    mov      w24, #0xcad
    movk     w24, #0x6fe, lsl #16
    str      x8, [sp, #0x18]
    mov      w25, #0xe53b
    movk     w25, #0xcb2a, lsl #16
    mov      w26, #0xe53c
    movk     w26, #0xcb2a, lsl #16
    mov      w19, #0xcae
    movk     w19, #0x6fe, lsl #16
    mov      w28, #0x23cb
    movk     w28, #0x30da, lsl #16
    adrp     x20, #0x54d000
    add      x20, x20, #0x730
    adrp     x23, #0x54d000
    add      x23, x23, #0x701
    adrp     x21, #0x54d000
    add      x21, x21, #0x748
    adrp     x27, #0x54d000
    add      x27, x27, #0x719
    ldr      w8, [sp, #0x24]
    cmp      w8, w24
    b.gt     #0x356e00
    cmp      w8, w25
    b.gt     #0x356ef4
    mov      w9, #0xb96a
    movk     w9, #0x934f, lsl #16
    cmp      w8, w9
    b.eq     #0x357118
    mov      w9, #0x539f
    movk     w9, #0x94fe, lsl #16
    cmp      w8, w9
    b.ne     #0x356db4
    adrp     x8, #0x54d000
    ldrb     w8, [x8, #0x700]
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp, #0x18]
    str      w19, [x8]
    b        #0x356db4
    cmp      w8, w28
    b.gt     #0x356f44
    cmp      w8, w19
    b.eq     #0x356f90
    mov      w9, #0x6c9e
    movk     w9, #0x1335, lsl #16
    cmp      w8, w9
    b.ne     #0x356db4
    ldrb     w8, [sp, #0x39]
    eor      w8, w8, #0xfffffff1
    strb     w8, [x21]
    ldrb     w8, [x27]
    mov      w9, #0xd1
    eor      w8, w8, w9
    strb     w8, [x21, #1]
    ldrb     w8, [x27, #1]
    mov      w9, #0x1d
    eor      w8, w8, w9
    strb     w8, [x21, #2]
    ldrb     w8, [x27, #2]
    eor      w8, w8, #0xffffff81
    strb     w8, [x21, #3]
    ldrb     w8, [x27, #3]
    mov      w9, #0x8c
    eor      w8, w8, w9
    strb     w8, [x21, #4]
    ldrb     w8, [x27, #4]
    mov      w9, #0x9a
    eor      w8, w8, w9
    strb     w8, [x21, #5]
    ldrb     w8, [x27, #5]
    mov      w9, #0x6f
    eor      w8, w8, w9
    strb     w8, [x21, #6]
    ldrb     w8, [x27, #6]
    mov      w9, #0xb7
    eor      w8, w8, w9
    strb     w8, [x21, #7]
    ldrb     w8, [x27, #7]
    mov      w9, #0x9c
    eor      w8, w8, w9
    strb     w8, [x21, #8]
    ldrb     w8, [x27, #8]
    mov      w9, #0x2e
    eor      w8, w8, w9
    strb     w8, [x21, #9]
    ldrb     w8, [x27, #9]
    mov      w9, #0xb3
    eor      w8, w8, w9
    strb     w8, [x21, #0xa]
    ldrb     w8, [x27, #0xa]
    mov      w9, #0x15
    eor      w8, w8, w9
    strb     w8, [x21, #0xb]
    ldrb     w8, [x27, #0xb]
    mov      w9, #0x3d
    eor      w8, w8, w9
    strb     w8, [x21, #0xc]
    ldr      x8, [sp, #0x18]
    str      w22, [x8]
    b        #0x356db4
    cmp      w8, w26
    b.eq     #0x357134
    mov      w9, #0x270a
    movk     w9, #0xdf5f, lsl #16
    cmp      w8, w9
    b.ne     #0x356db4
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f0]
    ldr      x2, [sp, #0x10]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x23cc
    movk     w9, #0x30da, lsl #16
    str      w9, [x8]
    b        #0x356db4
    cmp      w8, w22
    b.ne     #0x357154
    adrp     x8, #0x581000
    add      x8, x8, #0x318
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x270a
    movk     w9, #0xdf5f, lsl #16
    str      w9, [x8]
    b        #0x356db4
    ldrb     w8, [sp, #0x3a]
    mov      w9, #0xa2
    eor      w8, w8, w9
    strb     w8, [x20]
    ldrb     w8, [x23]
    mov      w9, #0xb
    eor      w8, w8, w9
    strb     w8, [x20, #1]
    ldrb     w8, [x23, #1]
    mov      w9, #0xbe
    eor      w8, w8, w9
    strb     w8, [x20, #2]
    ldrb     w8, [x23, #2]
    eor      w8, w8, #0xc
    strb     w8, [x20, #3]
    ldrb     w8, [x23, #3]
    eor      w8, w8, #0xffffff9f
    strb     w8, [x20, #4]
    ldrb     w8, [x23, #4]
    mov      w9, #0xec
    eor      w8, w8, w9
    strb     w8, [x20, #5]
    ldrb     w8, [x23, #5]
    eor      w8, w8, #2
    strb     w8, [x20, #6]
    ldrb     w8, [x23, #6]
    mov      w9, #0x8a
    eor      w8, w8, w9
    strb     w8, [x20, #7]
    ldrb     w8, [x23, #7]
    mov      w9, #0xab
    eor      w8, w8, w9
    strb     w8, [x20, #8]
    ldrb     w8, [x23, #8]
    mov      w9, #0xe4
    eor      w8, w8, w9
    strb     w8, [x20, #9]
    ldrb     w8, [x23, #9]
    mov      w9, #0x57
    eor      w8, w8, w9
    strb     w8, [x20, #0xa]
    ldrb     w8, [x23, #0xa]
    mov      w9, #0x1b
    eor      w8, w8, w9
    strb     w8, [x20, #0xb]
    ldrb     w8, [x23, #0xb]
    mov      w9, #0x45
    eor      w8, w8, w9
    strb     w8, [x20, #0xc]
    ldrb     w8, [x23, #0xc]
    mov      w9, #0x6e
    eor      w8, w8, w9
    strb     w8, [x20, #0xd]
    ldrb     w8, [x23, #0xd]
    mov      w9, #0x46
    eor      w8, w8, w9
    strb     w8, [x20, #0xe]
    ldrb     w8, [x23, #0xe]
    mov      w9, #0xe6
    eor      w8, w8, w9
    strb     w8, [x20, #0xf]
    ldrb     w8, [x23, #0xf]
    mov      w9, #0xa1
    eor      w8, w8, w9
    strb     w8, [x20, #0x10]
    ldrb     w8, [x23, #0x10]
    eor      w8, w8, #0x1f
    strb     w8, [x20, #0x11]
    ldrb     w8, [x23, #0x11]
    mov      w9, #0x17
    eor      w8, w8, w9
    strb     w8, [x20, #0x12]
    ldrb     w8, [x23, #0x12]
    mov      w9, #0x6d
    eor      w8, w8, w9
    strb     w8, [x20, #0x13]
    ldrb     w8, [x23, #0x13]
    mov      w9, #0x95
    eor      w8, w8, w9
    strb     w8, [x20, #0x14]
    ldrb     w8, [x23, #0x14]
    eor      w8, w8, #0xffffffef
    strb     w8, [x20, #0x15]
    ldrb     w8, [x23, #0x15]
    mov      w9, #0xac
    eor      w8, w8, w9
    strb     w8, [x20, #0x16]
    ldrb     w8, [x23, #0x16]
    mov      w9, #0xf5
    eor      w8, w8, w9
    strb     w8, [x20, #0x17]
    ldrb     w8, [x23, #0x17]
    strb     w8, [sp, #0x39]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x6c9e
    movk     w9, #0x1335, lsl #16
    str      w9, [x8]
    b        #0x356db4
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp, #0x18]
    str      w26, [x8]
    b        #0x356db4
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    mov      w8, #0x539f
    movk     w8, #0x94fe, lsl #16
    csel     w8, w8, w22, ne
    ldr      x9, [sp, #0x18]
    str      w8, [x9]
    b        #0x356db4
    mov      w9, #0x23cc
    movk     w9, #0x30da, lsl #16
    cmp      w8, w9
    b.ne     #0x356db4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    ldp      x2, x0, [sp, #0x28]
    adrp     x3, #0x54d000
    add      x3, x3, #0x780
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp, #8]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups stripSelectedColorDarkMode] IMP=0x3571B8 bounds=0x3571B8-0x357708
loc_3571B8:
    sub      sp, sp, #0xb0
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      w20, #0x6dcd
    movk     w20, #0xc4b8, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x31c
    ldar     w8, [x8]
    str      w8, [sp, #0x4c]
    mov      w9, #0x466f
    movk     w9, #0xe7e8, lsl #16
    add      x8, sp, #0xc
    str      w9, [sp, #0xc]
    mov      w24, #0x8de5
    movk     w24, #0x40ac, lsl #16
    mov      w25, #0x6dcc
    movk     w25, #0xc4b8, lsl #16
    str      x8, [sp]
    adrp     x22, #0x54d000
    add      x22, x22, #0x7b5
    adrp     x19, #0x54d000
    add      x19, x19, #0x7e5
    mov      w21, #0x84b
    movk     w21, #0x5483, lsl #16
    mov      w23, #0x8de6
    movk     w23, #0x40ac, lsl #16
    mov      w28, #0x84a
    movk     w28, #0x5483, lsl #16
    adrp     x27, #0x54d000
    add      x27, x27, #0x7a0
    adrp     x26, #0x54d000
    add      x26, x26, #0x7d0
    ldr      w8, [sp, #0xc]
    cmp      w8, w24
    b.gt     #0x3572a8
    cmp      w8, w25
    b.le     #0x357324
    cmp      w8, w20
    b.eq     #0x357650
    mov      w9, #0x466f
    movk     w9, #0xe7e8, lsl #16
    cmp      w8, w9
    b.eq     #0x3575f0
    mov      w9, #0xc51
    movk     w9, #0x39df, lsl #16
    cmp      w8, w9
    b.ne     #0x35724c
    ldrb     w8, [sp, #0x4b]
    cmp      w8, #0
    mov      w8, #0xeb81
    movk     w8, #0x454b, lsl #16
    csel     w8, w8, w20, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x35724c
    cmp      w8, w28
    b.le     #0x357450
    cmp      w8, w21
    b.eq     #0x357680
    mov      w9, #0x4419
    movk     w9, #0x79fb, lsl #16
    cmp      w8, w9
    b.eq     #0x357614
    mov      w9, #0xc564
    movk     w9, #0x7daf, lsl #16
    cmp      w8, w9
    b.ne     #0x35724c
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x2, [x8, #0x4e8]
    str      x2, [sp, #0x20]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    ldr      x0, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp]
    mov      w9, #0x6dcc
    movk     w9, #0x8dae, lsl #16
    mov      w10, #0x2119
    movk     w10, #0x8626, lsl #16
    csel     w9, w10, w9, ne
    str      w9, [x8]
    str      xzr, [sp, #0x10]
    b        #0x35724c
    mov      w9, #0x2119
    movk     w9, #0x8626, lsl #16
    cmp      w8, w9
    b.eq     #0x357630
    mov      w9, #0xfa1f
    movk     w9, #0xb4ae, lsl #16
    cmp      w8, w9
    b.ne     #0x3576c8
    ldrb     w8, [x22]
    mov      w9, #0xa3
    eor      w8, w8, w9
    strb     w8, [x19]
    ldrb     w8, [x22, #1]
    mov      w9, #0x37
    eor      w8, w8, w9
    strb     w8, [x19, #1]
    ldrb     w8, [x22, #2]
    eor      w8, w8, #0x3e
    strb     w8, [x19, #2]
    ldrb     w8, [x22, #3]
    mov      w9, #0x49
    eor      w8, w8, w9
    strb     w8, [x19, #3]
    ldrb     w8, [x22, #4]
    eor      w8, w8, #0xf
    strb     w8, [x19, #4]
    ldrb     w8, [x22, #5]
    mov      w9, #0x1d
    eor      w8, w8, w9
    strb     w8, [x19, #5]
    ldrb     w8, [x22, #6]
    eor      w8, w8, #2
    strb     w8, [x19, #6]
    ldrb     w8, [x22, #7]
    eor      w8, w8, #0x40
    strb     w8, [x19, #7]
    ldrb     w8, [x22, #8]
    mov      w9, #0xda
    eor      w8, w8, w9
    strb     w8, [x19, #8]
    ldrb     w8, [x22, #9]
    mov      w9, #0x6e
    eor      w8, w8, w9
    strb     w8, [x19, #9]
    ldrb     w8, [x22, #0xa]
    eor      w8, w8, #0xe0
    strb     w8, [x19, #0xa]
    ldrb     w8, [x22, #0xb]
    mov      w9, #0x90
    eor      w8, w8, w9
    strb     w8, [x19, #0xb]
    ldrb     w8, [x22, #0xc]
    mov      w9, #0x91
    eor      w8, w8, w9
    strb     w8, [x19, #0xc]
    ldrb     w8, [x22, #0xd]
    mov      w9, #0xe5
    eor      w8, w8, w9
    strb     w8, [x19, #0xd]
    ldrb     w8, [x22, #0xe]
    mov      w9, #0x72
    eor      w8, w8, w9
    strb     w8, [x19, #0xe]
    ldrb     w8, [x22, #0xf]
    mov      w9, #0x47
    eor      w8, w8, w9
    strb     w8, [x19, #0xf]
    ldrb     w8, [x22, #0x10]
    eor      w8, w8, #0xfffffff9
    strb     w8, [x19, #0x10]
    ldrb     w8, [x22, #0x11]
    strb     w8, [sp, #0x4a]
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x35724c
    cmp      w8, w23
    b.eq     #0x3575a8
    mov      w9, #0xeb81
    movk     w9, #0x454b, lsl #16
    cmp      w8, w9
    b.ne     #0x35724c
    ldrb     w8, [x27]
    mov      w9, #0x19
    eor      w8, w8, w9
    strb     w8, [x26]
    ldrb     w8, [x27, #1]
    mov      w9, #0xed
    eor      w8, w8, w9
    strb     w8, [x26, #1]
    ldrb     w8, [x27, #2]
    mov      w9, #0xd5
    eor      w8, w8, w9
    strb     w8, [x26, #2]
    ldrb     w8, [x27, #3]
    mov      w9, #0x93
    eor      w8, w8, w9
    strb     w8, [x26, #3]
    ldrb     w8, [x27, #4]
    eor      w8, w8, #0xffffffbf
    strb     w8, [x26, #4]
    ldrb     w8, [x27, #5]
    mov      w9, #0x9a
    eor      w8, w8, w9
    strb     w8, [x26, #5]
    ldrb     w8, [x27, #6]
    eor      w8, w8, #0xf
    strb     w8, [x26, #6]
    ldrb     w8, [x27, #7]
    mov      w9, #0xa6
    eor      w8, w8, w9
    strb     w8, [x26, #7]
    ldrb     w8, [x27, #8]
    mov      w9, #0xb7
    eor      w8, w8, w9
    strb     w8, [x26, #8]
    ldrb     w8, [x27, #9]
    mov      w9, #0x97
    eor      w8, w8, w9
    strb     w8, [x26, #9]
    ldrb     w8, [x27, #0xa]
    eor      w8, w8, #7
    strb     w8, [x26, #0xa]
    ldrb     w8, [x27, #0xb]
    eor      w8, w8, #0x11111111
    strb     w8, [x26, #0xb]
    ldrb     w8, [x27, #0xc]
    eor      w8, w8, #0x38
    strb     w8, [x26, #0xc]
    ldrb     w8, [x27, #0xd]
    eor      w8, w8, #0x3c
    strb     w8, [x26, #0xd]
    ldrb     w8, [x27, #0xe]
    eor      w8, w8, #0xf8
    strb     w8, [x26, #0xe]
    ldrb     w8, [x27, #0xf]
    mov      w9, #0x5a
    eor      w8, w8, w9
    strb     w8, [x26, #0xf]
    ldrb     w8, [x27, #0x10]
    mov      w9, #0x13
    eor      w8, w8, w9
    strb     w8, [x26, #0x10]
    ldrb     w8, [x27, #0x11]
    mov      w9, #0x34
    eor      w8, w8, w9
    strb     w8, [x26, #0x11]
    ldrb     w8, [x27, #0x12]
    eor      w8, w8, #0xffffffc3
    strb     w8, [x26, #0x12]
    ldrb     w8, [x27, #0x13]
    eor      w8, w8, #0xf8
    strb     w8, [x26, #0x13]
    ldrb     w8, [x27, #0x14]
    mov      w9, #0xd4
    eor      w8, w8, w9
    strb     w8, [x26, #0x14]
    ldr      x8, [sp]
    mov      w9, #0xfa1f
    movk     w9, #0xb4ae, lsl #16
    str      w9, [x8]
    b        #0x35724c
    ldp      x1, x0, [sp, #0x38]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    adrp     x2, #0x54d000
    add      x2, x2, #0x820
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    ldr      x8, [sp]
    mov      w9, #0xc564
    movk     w9, #0x7daf, lsl #16
    str      w9, [x8]
    b        #0x35724c
    ldr      w8, [sp, #0x4c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x4b]
    ldr      x8, [sp]
    mov      w9, #0xc51
    movk     w9, #0x39df, lsl #16
    str      w9, [x8]
    b        #0x35724c
    ldr      x8, [sp]
    mov      w9, #0x6dcc
    movk     w9, #0x8dae, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x18]
    str      x8, [sp, #0x10]
    b        #0x35724c
    ldp      x1, x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x18]
    ldr      x8, [sp]
    mov      w9, #0x4419
    movk     w9, #0x79fb, lsl #16
    str      w9, [x8]
    b        #0x35724c
    adrp     x8, #0x581000
    add      x8, x8, #0x31c
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x9, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x308]
    stp      x8, x9, [sp, #0x38]
    ldr      x8, [sp]
    str      w23, [x8]
    b        #0x35724c
    ldrb     w8, [sp, #0x4a]
    eor      w8, w8, #0xffffff8f
    adrp     x10, #0x54d000
    add      x10, x10, #0x7f6
    strb     w8, [x10]
    adrp     x11, #0x54d000
    add      x11, x11, #0x7c7
    ldrb     w8, [x11]
    mov      w9, #0x76
    eor      w8, w8, w9
    strb     w8, [x10, #1]
    ldrb     w8, [x11, #1]
    mov      w9, #0xed
    eor      w8, w8, w9
    strb     w8, [x10, #2]
    ldr      x8, [sp]
    str      w20, [x8]
    b        #0x35724c
    mov      w9, #0x6dcc
    movk     w9, #0x8dae, lsl #16
    cmp      w8, w9
    b.ne     #0x35724c
    ldr      x19, [sp, #0x10]
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    add      sp, sp, #0xb0
    ret      

// -[WCLGHomeGroups setStripSelectedColorDarkMode:] IMP=0x357708 bounds=0x357708-0x357BC0
loc_357708:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    stp      x0, x2, [sp, #8]
    adrp     x8, #0x581000
    add      x8, x8, #0x320
    mov      w23, #0x9c8d
    movk     w23, #0x6691, lsl #16
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w8, #0xed34
    movk     w8, #0xc83b, lsl #16
    str      w8, [sp, #0x24]
    add      x8, sp, #0x24
    mov      w25, #0x719d
    movk     w25, #0xf164, lsl #16
    str      x8, [sp, #0x18]
    mov      w26, #0xed8d
    movk     w26, #0xc749, lsl #16
    mov      w27, #0xba56
    movk     w27, #0x88dd, lsl #16
    adrp     x28, #0x54d000
    add      x28, x28, #0x840
    adrp     x22, #0x54d000
    add      x22, x22, #0x870
    mov      w21, #0x72
    mov      w24, #0x9c8c
    movk     w24, #0x6691, lsl #16
    mov      w19, #0x719e
    movk     w19, #0xf164, lsl #16
    mov      w20, #0x5c8d
    movk     w20, #0x5954, lsl #16
    ldr      w8, [sp, #0x24]
    cmp      w8, w25
    b.le     #0x3577f4
    cmp      w8, w24
    b.gt     #0x357a6c
    cmp      w8, w19
    b.eq     #0x357b04
    cmp      w8, w20
    b.ne     #0x35779c
    ldp      x2, x0, [sp, #0x28]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    adrp     x3, #0x54d000
    add      x3, x3, #0x8c0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x18]
    mov      w9, #0xed8e
    movk     w9, #0xc749, lsl #16
    str      w9, [x8]
    b        #0x35779c
    cmp      w8, w26
    b.gt     #0x357ab8
    cmp      w8, w27
    b.eq     #0x357ae4
    mov      w9, #0xf284
    movk     w9, #0xb5a3, lsl #16
    cmp      w8, w9
    b.ne     #0x35779c
    ldrb     w8, [x28]
    eor      w8, w8, #4
    strb     w8, [x22]
    ldrb     w8, [x28, #1]
    eor      w8, w8, #0xffffffcf
    strb     w8, [x22, #1]
    ldrb     w8, [x28, #2]
    mov      w9, #0xf4
    eor      w8, w8, w9
    strb     w8, [x22, #2]
    ldrb     w8, [x28, #3]
    mov      w9, #0xdb
    eor      w8, w8, w9
    strb     w8, [x22, #3]
    ldrb     w8, [x28, #4]
    eor      w8, w8, w21
    strb     w8, [x22, #4]
    ldrb     w8, [x28, #5]
    mov      w9, #0x58
    eor      w8, w8, w9
    strb     w8, [x22, #5]
    ldrb     w8, [x28, #6]
    mov      w9, #0x2b
    eor      w8, w8, w9
    strb     w8, [x22, #6]
    ldrb     w8, [x28, #7]
    mov      w9, #0x42
    eor      w8, w8, w9
    strb     w8, [x22, #7]
    ldrb     w8, [x28, #8]
    mov      w9, #0xc6
    eor      w8, w8, w9
    strb     w8, [x22, #8]
    ldrb     w8, [x28, #9]
    mov      w9, #0x6f
    eor      w8, w8, w9
    strb     w8, [x22, #9]
    ldrb     w8, [x28, #0xa]
    mov      w9, #0x9b
    eor      w8, w8, w9
    strb     w8, [x22, #0xa]
    ldrb     w8, [x28, #0xb]
    mov      w9, #0x14
    eor      w8, w8, w9
    strb     w8, [x22, #0xb]
    ldrb     w8, [x28, #0xc]
    eor      w8, w8, #0xfe
    strb     w8, [x22, #0xc]
    ldrb     w8, [x28, #0xd]
    eor      w8, w8, #0xffffffdf
    strb     w8, [x22, #0xd]
    ldrb     w8, [x28, #0xe]
    mov      w9, #0x4d
    eor      w8, w8, w9
    strb     w8, [x22, #0xe]
    ldrb     w8, [x28, #0xf]
    eor      w8, w8, #6
    strb     w8, [x22, #0xf]
    ldrb     w8, [x28, #0x10]
    eor      w8, w8, #0x3f
    strb     w8, [x22, #0x10]
    ldrb     w8, [x28, #0x11]
    eor      w8, w8, w9
    strb     w8, [x22, #0x11]
    ldrb     w8, [x28, #0x12]
    eor      w8, w8, #0xaaaaaaaa
    strb     w8, [x22, #0x12]
    ldrb     w8, [x28, #0x13]
    eor      w8, w8, #0xffffffc7
    strb     w8, [x22, #0x13]
    ldrb     w8, [x28, #0x14]
    mov      w9, #0x46
    eor      w8, w8, w9
    strb     w8, [x22, #0x14]
    ldrb     w8, [x28, #0x15]
    mov      w9, #0xf6
    eor      w8, w8, w9
    strb     w8, [x22, #0x15]
    ldrb     w8, [x28, #0x16]
    eor      w8, w8, w21
    strb     w8, [x22, #0x16]
    ldrb     w8, [x28, #0x17]
    mov      w9, #0x97
    eor      w8, w8, w9
    strb     w8, [x22, #0x17]
    ldrb     w8, [x28, #0x18]
    mov      w9, #0x9a
    eor      w8, w8, w9
    strb     w8, [x22, #0x18]
    ldrb     w8, [x28, #0x19]
    mov      w9, #0x17
    eor      w8, w8, w9
    strb     w8, [x22, #0x19]
    ldrb     w8, [x28, #0x1a]
    mov      w9, #0x61
    eor      w8, w8, w9
    strb     w8, [x22, #0x1a]
    ldrb     w8, [x28, #0x1b]
    mov      w9, #0xb9
    eor      w8, w8, w9
    strb     w8, [x22, #0x1b]
    ldrb     w8, [x28, #0x1c]
    mov      w9, #0x35
    eor      w8, w8, w9
    strb     w8, [x22, #0x1c]
    ldrb     w8, [x28, #0x1d]
    eor      w8, w8, #0xffffff81
    strb     w8, [x22, #0x1d]
    ldrb     w8, [x28, #0x1e]
    eor      w8, w8, w21
    strb     w8, [x22, #0x1e]
    ldrb     w8, [x28, #0x1f]
    mov      w9, #0xea
    eor      w8, w8, w9
    strb     w8, [x22, #0x1f]
    ldrb     w8, [x28, #0x20]
    mov      w9, #0xd8
    eor      w8, w8, w9
    strb     w8, [x22, #0x20]
    ldrb     w8, [x28, #0x21]
    mov      w9, #0x41
    eor      w8, w8, w9
    strb     w8, [x22, #0x21]
    ldrb     w8, [x28, #0x22]
    mov      w9, #0x7a
    eor      w8, w8, w9
    strb     w8, [x22, #0x22]
    ldrb     w8, [x28, #0x23]
    mov      w9, #0x4e
    eor      w8, w8, w9
    strb     w8, [x22, #0x23]
    ldrb     w8, [x28, #0x24]
    mov      w9, #0x95
    eor      w8, w8, w9
    strb     w8, [x22, #0x24]
    ldrb     w8, [x28, #0x25]
    mov      w9, #0x6c
    eor      w8, w8, w9
    strb     w8, [x22, #0x25]
    ldrb     w8, [x28, #0x26]
    mov      w9, #0x9d
    eor      w8, w8, w9
    strb     w8, [x22, #0x26]
    ldrb     w8, [x28, #0x27]
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp, #0x18]
    mov      w9, #0x618d
    movk     w9, #0x7b0d, lsl #16
    str      w9, [x8]
    b        #0x35779c
    cmp      w8, w23
    b.eq     #0x357b1c
    mov      w9, #0x618d
    movk     w9, #0x7b0d, lsl #16
    cmp      w8, w9
    b.ne     #0x35779c
    ldrb     w8, [sp, #0x3a]
    mov      w9, #0xec
    eor      w8, w8, w9
    adrp     x9, #0x54d000
    strb     w8, [x9, #0x897]
    adrp     x8, #0x54d000
    ldrb     w8, [x8, #0x868]
    mov      w9, #0xe4
    eor      w8, w8, w9
    strb     w8, [sp, #0x39]
    ldr      x8, [sp, #0x18]
    str      w19, [x8]
    b        #0x35779c
    mov      w9, #0xed34
    movk     w9, #0xc83b, lsl #16
    cmp      w8, w9
    b.ne     #0x357b7c
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp, #0x18]
    str      w27, [x8]
    b        #0x35779c
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    mov      w8, #0xf284
    movk     w8, #0xb5a3, lsl #16
    csel     w8, w8, w23, ne
    ldr      x9, [sp, #0x18]
    str      w8, [x9]
    b        #0x35779c
    ldrb     w8, [sp, #0x39]
    adrp     x9, #0x54d000
    strb     w8, [x9, #0x898]
    ldr      x8, [sp, #0x18]
    str      w23, [x8]
    b        #0x35779c
    adrp     x8, #0x581000
    add      x8, x8, #0x320
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4f0]
    ldr      x2, [sp, #0x10]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    ldr      x8, [sp, #0x18]
    str      w20, [x8]
    b        #0x35779c
    mov      w9, #0xed8e
    movk     w9, #0xc749, lsl #16
    cmp      w8, w9
    b.ne     #0x35779c
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp, #8]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups barVerticalOffset] IMP=0x357BC0 bounds=0x357BC0-0x358108
loc_357BC0:
    sub      sp, sp, #0xd0
    stp      d9, d8, [sp, #0x60]
    stp      x28, x27, [sp, #0x70]
    stp      x26, x25, [sp, #0x80]
    stp      x24, x23, [sp, #0x90]
    stp      x22, x21, [sp, #0xa0]
    stp      x20, x19, [sp, #0xb0]
    stp      x29, x30, [sp, #0xc0]
    add      x29, sp, #0xc0
    adrp     x8, #0x581000
    add      x8, x8, #0x324
    ldar     w8, [x8]
    str      w8, [sp, #0x5c]
    mov      w9, #0xcf17
    movk     w9, #0x9cb2, lsl #16
    add      x8, sp, #0x14
    str      w9, [sp, #0x14]
    mov      w24, #0xfcb0
    movk     w24, #0xa5f, lsl #16
    mov      w25, #0xfd2b
    movk     w25, #0xbd50, lsl #16
    str      x8, [sp, #8]
    mov      w27, #0xfd2c
    movk     w27, #0xbd50, lsl #16
    adrp     x28, #0x54d000
    add      x28, x28, #0x91a
    adrp     x21, #0x54d000
    add      x21, x21, #0x8fb
    mov      w22, #0x3fc3
    movk     w22, #0x50b2, lsl #16
    adrp     x26, #0x54d000
    add      x26, x26, #0x8e0
    mov      w19, #0xfcb1
    movk     w19, #0xa5f, lsl #16
    adrp     x23, #0x54d000
    add      x23, x23, #0x900
    mov      w20, #0x3fc4
    movk     w20, #0x50b2, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w24
    b.le     #0x357ce8
    cmp      w8, w22
    b.gt     #0x357d44
    cmp      w8, w19
    b.eq     #0x357e20
    mov      w9, #0xbbd3
    movk     w9, #0x1f27, lsl #16
    cmp      w8, w9
    b.eq     #0x35807c
    mov      w9, #0xc44c
    movk     w9, #0x4397, lsl #16
    cmp      w8, w9
    b.ne     #0x357c58
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    ldr      x0, [sp, #0x50]
    adrp     x2, #0x54d000
    add      x2, x2, #0x940
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x48]
    ldr      x0, [sp, #0x50]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x4a0]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x3e0]
    stp      x8, x9, [sp, #0x38]
    ldr      x8, [sp, #8]
    mov      w9, #0xcbc8
    movk     w9, #0x6ed, lsl #16
    str      w9, [x8]
    b        #0x357c58
    cmp      w8, w25
    b.le     #0x357d98
    cmp      w8, w27
    b.eq     #0x357ddc
    mov      w9, #0xd3cb
    movk     w9, #0xf99f, lsl #16
    cmp      w8, w9
    b.eq     #0x358020
    mov      w9, #0xcbc8
    movk     w9, #0x6ed, lsl #16
    cmp      w8, w9
    b.ne     #0x357c58
    ldp      x2, x0, [sp, #0x40]
    ldr      x1, [sp, #0x38]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp, #8]
    mov      w9, #0xcba9
    movk     w9, #0x8bf7, lsl #16
    csel     w9, w27, w9, ne
    str      w9, [x8]
    str      xzr, [sp, #0x18]
    b        #0x357c58
    cmp      w8, w20
    b.eq     #0x357fc0
    mov      w9, #0x61b3
    movk     w9, #0x5b29, lsl #16
    cmp      w8, w9
    b.eq     #0x3580a4
    mov      w9, #0xedec
    movk     w9, #0x6d3b, lsl #16
    cmp      w8, w9
    b.ne     #0x357c58
    adrp     x8, #0x54d000
    ldrb     w8, [x8, #0x8ff]
    mov      w9, #0xf4
    eor      w8, w8, w9
    adrp     x9, #0x54d000
    strb     w8, [x9, #0x91f]
    ldr      x8, [sp, #8]
    mov      w9, #0x90dd
    movk     w9, #0x98bd, lsl #16
    str      w9, [x8]
    b        #0x357c58
    mov      w9, #0x90dd
    movk     w9, #0x98bd, lsl #16
    cmp      w8, w9
    b.eq     #0x357fdc
    mov      w9, #0xcf17
    movk     w9, #0x9cb2, lsl #16
    cmp      w8, w9
    b.ne     #0x3580c4
    ldr      w8, [sp, #0x5c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x5b]
    ldr      x8, [sp, #8]
    mov      w9, #0x61b3
    movk     w9, #0x5b29, lsl #16
    str      w9, [x8]
    b        #0x357c58
    ldp      x1, x0, [sp, #0x40]
    bl       #0x461c6c // _objc_msgSend
    mov      x8, #0x4069000000000000
    fmov     d1, x8
    fcmp     d0, d1
    fcsel    d0, d1, d0, gt
    str      d0, [sp, #0x30]
    mov      x8, #-0x3fbc000000000000
    fmov     d1, x8
    fcmp     d0, d1
    cset     w8, gt
    strb     w8, [sp, #0x2f]
    ldr      x8, [sp, #8]
    mov      w9, #0xbbd3
    movk     w9, #0x1f27, lsl #16
    str      w9, [x8]
    b        #0x357c58
    ldrb     w8, [x26]
    mov      w9, #0x9b
    eor      w8, w8, w9
    strb     w8, [x23]
    ldrb     w8, [x26, #1]
    mov      w9, #0xd1
    eor      w8, w8, w9
    strb     w8, [x23, #1]
    ldrb     w8, [x26, #2]
    mov      w10, #0xed
    eor      w8, w8, w10
    strb     w8, [x23, #2]
    ldrb     w8, [x26, #3]
    mov      w10, #0x9c
    eor      w8, w8, w10
    strb     w8, [x23, #3]
    ldrb     w8, [x26, #4]
    mov      w10, #0xd8
    eor      w8, w8, w10
    strb     w8, [x23, #4]
    ldrb     w8, [x26, #5]
    mov      w10, #0x4e
    eor      w8, w8, w10
    strb     w8, [x23, #5]
    ldrb     w8, [x26, #6]
    eor      w8, w8, #0x18
    strb     w8, [x23, #6]
    ldrb     w8, [x26, #7]
    eor      w8, w8, #0x30
    strb     w8, [x23, #7]
    ldrb     w8, [x26, #8]
    mov      w10, #0xeb
    eor      w8, w8, w10
    strb     w8, [x23, #8]
    ldrb     w8, [x26, #9]
    eor      w8, w8, #0x38
    strb     w8, [x23, #9]
    ldrb     w8, [x26, #0xa]
    mov      w10, #0x8d
    eor      w8, w8, w10
    strb     w8, [x23, #0xa]
    ldrb     w8, [x26, #0xb]
    mov      w10, #0xe9
    eor      w8, w8, w10
    strb     w8, [x23, #0xb]
    ldrb     w8, [x26, #0xc]
    mov      w10, #0xd3
    eor      w8, w8, w10
    strb     w8, [x23, #0xc]
    ldrb     w8, [x26, #0xd]
    mov      w10, #0x42
    eor      w8, w8, w10
    strb     w8, [x23, #0xd]
    ldrb     w8, [x26, #0xe]
    mov      w10, #0xe8
    eor      w8, w8, w10
    strb     w8, [x23, #0xe]
    ldrb     w8, [x26, #0xf]
    mov      w10, #0xf5
    eor      w8, w8, w10
    strb     w8, [x23, #0xf]
    ldrb     w8, [x26, #0x10]
    mov      w10, #0x5e
    eor      w8, w8, w10
    strb     w8, [x23, #0x10]
    ldrb     w8, [x26, #0x11]
    eor      w8, w8, w9
    strb     w8, [x23, #0x11]
    ldrb     w8, [x26, #0x12]
    mov      w9, #0x1a
    eor      w8, w8, w9
    strb     w8, [x23, #0x12]
    ldrb     w8, [x26, #0x13]
    eor      w8, w8, #0xfffffffd
    strb     w8, [x23, #0x13]
    ldrb     w8, [x26, #0x14]
    eor      w8, w8, #0x1c
    strb     w8, [x23, #0x14]
    ldrb     w8, [x26, #0x15]
    mov      w9, #0x6d
    eor      w8, w8, w9
    strb     w8, [x23, #0x15]
    ldrb     w8, [x26, #0x16]
    mov      w9, #0xd5
    eor      w8, w8, w9
    strb     w8, [x23, #0x16]
    ldrb     w8, [x26, #0x17]
    mov      w9, #0xd7
    eor      w8, w8, w9
    strb     w8, [x23, #0x17]
    ldrb     w8, [x26, #0x18]
    mov      w9, #0xa7
    eor      w8, w8, w9
    strb     w8, [x23, #0x18]
    ldrb     w8, [x26, #0x19]
    eor      w8, w8, #0x70
    strb     w8, [x23, #0x19]
    ldrb     w8, [x26, #0x1a]
    strb     w8, [sp, #0x5a]
    ldr      x8, [sp, #8]
    mov      w9, #0xd3cb
    movk     w9, #0xf99f, lsl #16
    str      w9, [x8]
    b        #0x357c58
    ldr      x8, [sp, #8]
    mov      w9, #0xcba9
    movk     w9, #0x8bf7, lsl #16
    str      w9, [x8]
    ldr      d0, [sp, #0x20]
    str      d0, [sp, #0x18]
    b        #0x357c58
    adrp     x8, #0x581000
    add      x8, x8, #0x324
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x50]
    ldr      x8, [sp, #8]
    mov      w9, #0xc44c
    movk     w9, #0x4397, lsl #16
    str      w9, [x8]
    b        #0x357c58
    ldrb     w8, [sp, #0x5a]
    mov      w9, #0x73
    eor      w8, w8, w9
    strb     w8, [x28]
    ldrb     w8, [x21]
    eor      w8, w8, #0x78
    strb     w8, [x28, #1]
    ldrb     w8, [x21, #1]
    mov      w9, #0x6d
    eor      w8, w8, w9
    strb     w8, [x28, #2]
    ldrb     w8, [x21, #2]
    mov      w9, #0x49
    eor      w8, w8, w9
    strb     w8, [x28, #3]
    ldrb     w8, [x21, #3]
    eor      w8, w8, #3
    strb     w8, [x28, #4]
    ldr      x8, [sp, #8]
    mov      w9, #0xedec
    movk     w9, #0x6d3b, lsl #16
    str      w9, [x8]
    b        #0x357c58
    ldr      d0, [sp, #0x30]
    ldrb     w8, [sp, #0x2f]
    cmp      w8, #0
    mov      x8, #-0x3fbc000000000000
    fmov     d1, x8
    fcsel    d0, d0, d1, ne
    str      d0, [sp, #0x20]
    ldr      x8, [sp, #8]
    str      w20, [x8]
    b        #0x357c58
    ldrb     w8, [sp, #0x5b]
    cmp      w8, #0
    mov      w8, #0x90dd
    movk     w8, #0x98bd, lsl #16
    csel     w8, w19, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x357c58
    mov      w9, #0xcba9
    movk     w9, #0x8bf7, lsl #16
    cmp      w8, w9
    b.ne     #0x357c58
    ldr      d8, [sp, #0x18]
    ldr      x0, [sp, #0x48]
    bl       #0x461c9c // _objc_release
    fmov     d0, d8
    ldp      x29, x30, [sp, #0xc0]
    ldp      x20, x19, [sp, #0xb0]
    ldp      x22, x21, [sp, #0xa0]
    ldp      x24, x23, [sp, #0x90]
    ldp      x26, x25, [sp, #0x80]
    ldp      x28, x27, [sp, #0x70]
    ldp      d9, d8, [sp, #0x60]
    add      sp, sp, #0xd0
    ret      

// -[WCLGHomeGroups setBarVerticalOffset:] IMP=0x358108 bounds=0x358108-0x3585A8
loc_358108:
    sub      sp, sp, #0xb0
    stp      d9, d8, [sp, #0x40]
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    fmov     d8, d0
    mov      w20, #0x6557
    movk     w20, #0xa5d0, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x328
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w8, #0x6c3
    movk     w8, #0xb215, lsl #16
    str      w8, [sp, #0x1c]
    add      x8, sp, #0x1c
    mov      w23, #0x8bed
    movk     w23, #0x1060, lsl #16
    stp      x0, x8, [sp, #8]
    mov      w24, #0xd865
    movk     w24, #0xc09f, lsl #16
    mov      w10, #0x1694
    movk     w10, #0xe77f, lsl #16
    mov      w11, #0xaafc
    movk     w11, #0x7488, lsl #16
    mov      w12, #0xd866
    movk     w12, #0xc09f, lsl #16
    adrp     x21, #0x54d000
    add      x21, x21, #0x977
    adrp     x26, #0x54d000
    add      x26, x26, #0x997
    mov      w22, #0xb6fd
    movk     w22, #0x592b, lsl #16
    mov      w13, #0x8bee
    movk     w13, #0x1060, lsl #16
    adrp     x27, #0x54d000
    add      x27, x27, #0x98f
    adrp     x28, #0x54d000
    add      x28, x28, #0x970
    mov      w14, #0xb7
    mov      w15, #0xb6fe
    movk     w15, #0x592b, lsl #16
    adrp     x19, #0x54d000
    add      x19, x19, #0x960
    adrp     x25, #0x54d000
    add      x25, x25, #0x980
    ldr      w8, [sp, #0x1c]
    cmp      w8, w23
    b.gt     #0x358218
    cmp      w8, w24
    b.gt     #0x358248
    cmp      w8, w20
    b.eq     #0x358454
    mov      w9, #0x6c3
    movk     w9, #0xb215, lsl #16
    cmp      w8, w9
    b.ne     #0x3581d0
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp, #0x10]
    str      w11, [x8]
    b        #0x3581d0
    cmp      w8, w22
    b.le     #0x3582d0
    cmp      w8, w15
    b.eq     #0x35835c
    cmp      w8, w11
    b.ne     #0x3581d0
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    csel     w8, w15, w20, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x3581d0
    cmp      w8, w12
    b.eq     #0x358484
    cmp      w8, w10
    b.ne     #0x3581d0
    ldr      d0, [sp, #0x30]
    mov      x8, #-0x3fbc000000000000
    fmov     d1, x8
    fcmp     d0, d1
    fcsel    d0, d0, d1, gt
    str      d0, [sp, #0x28]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      w15, #0xb6fe
    movk     w15, #0x592b, lsl #16
    mov      w14, #0xb7
    mov      w13, #0x8bee
    movk     w13, #0x1060, lsl #16
    mov      w12, #0xd866
    movk     w12, #0xc09f, lsl #16
    mov      w11, #0xaafc
    movk     w11, #0x7488, lsl #16
    mov      w10, #0x1694
    movk     w10, #0xe77f, lsl #16
    str      x0, [sp, #0x20]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xe982
    movk     w9, #0x1cf7, lsl #16
    str      w9, [x8]
    b        #0x3581d0
    cmp      w8, w13
    b.ne     #0x358518
    ldrb     w8, [sp, #0x3a]
    mov      w9, #0xc9
    eor      w8, w8, w9
    strb     w8, [x27]
    ldrb     w8, [x28]
    eor      w8, w8, w14
    strb     w8, [x27, #1]
    ldrb     w8, [x28, #1]
    mov      w9, #0xe9
    eor      w8, w8, w9
    strb     w8, [x27, #2]
    ldrb     w8, [x28, #2]
    mov      w9, #0x82
    eor      w8, w8, w9
    strb     w8, [x27, #3]
    ldrb     w8, [x28, #3]
    mov      w9, #0xda
    eor      w8, w8, w9
    strb     w8, [x27, #4]
    ldrb     w8, [x28, #4]
    mov      w9, #0xd1
    eor      w8, w8, w9
    strb     w8, [x27, #5]
    ldrb     w8, [x28, #5]
    mov      w9, #0x32
    eor      w8, w8, w9
    strb     w8, [x27, #6]
    ldrb     w8, [x28, #6]
    eor      w8, w8, #0x78
    strb     w8, [x27, #7]
    ldr      x8, [sp, #0x10]
    str      w12, [x8]
    b        #0x3581d0
    ldrb     w8, [x19]
    mov      w9, #0xa
    eor      w8, w8, w9
    strb     w8, [x25]
    ldrb     w8, [x19, #1]
    mov      w9, #0x85
    eor      w8, w8, w9
    strb     w8, [x25, #1]
    ldrb     w8, [x19, #2]
    mov      w9, #0x1b
    eor      w8, w8, w9
    strb     w8, [x25, #2]
    ldrb     w8, [x19, #3]
    eor      w8, w8, #0x20
    strb     w8, [x25, #3]
    ldrb     w8, [x19, #4]
    mov      w9, #0x67
    eor      w8, w8, w9
    strb     w8, [x25, #4]
    ldrb     w8, [x19, #5]
    eor      w8, w8, #0xffffffdf
    strb     w8, [x25, #5]
    ldrb     w8, [x19, #6]
    mov      w9, #0x28
    eor      w8, w8, w9
    strb     w8, [x25, #6]
    ldrb     w8, [x19, #7]
    mov      w9, #0xf5
    eor      w8, w8, w9
    strb     w8, [x25, #7]
    ldrb     w8, [x19, #8]
    mov      w9, #0x69
    eor      w8, w8, w9
    strb     w8, [x25, #8]
    ldrb     w8, [x19, #9]
    mov      w9, #0xae
    eor      w8, w8, w9
    strb     w8, [x25, #9]
    ldrb     w8, [x19, #0xa]
    mov      w9, #0xf6
    eor      w8, w8, w9
    strb     w8, [x25, #0xa]
    ldrb     w8, [x19, #0xb]
    mov      w9, #0x2b
    eor      w8, w8, w9
    strb     w8, [x25, #0xb]
    ldrb     w8, [x19, #0xc]
    eor      w8, w8, w14
    strb     w8, [x25, #0xc]
    ldrb     w8, [x19, #0xd]
    mov      w9, #0x2e
    eor      w8, w8, w9
    strb     w8, [x25, #0xd]
    ldrb     w8, [x19, #0xe]
    mov      w9, #0xd4
    eor      w8, w8, w9
    strb     w8, [x25, #0xe]
    ldrb     w8, [x19, #0xf]
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp, #0x10]
    str      w13, [x8]
    b        #0x3581d0
    adrp     x8, #0x581000
    add      x8, x8, #0x328
    mov      w9, #1
    stlr     w9, [x8]
    mov      x8, #0x4069000000000000
    fmov     d0, x8
    fcmp     d8, d0
    fcsel    d0, d0, d8, gt
    str      d0, [sp, #0x30]
    ldr      x8, [sp, #0x10]
    str      w10, [x8]
    b        #0x3581d0
    ldrb     w8, [x21]
    mov      w9, #0x36
    eor      w8, w8, w9
    strb     w8, [x26]
    ldrb     w8, [x21, #1]
    mov      w9, #0xec
    eor      w8, w8, w9
    strb     w8, [x26, #1]
    ldrb     w8, [x21, #2]
    mov      w9, #0x7d
    eor      w8, w8, w9
    strb     w8, [x26, #2]
    ldrb     w8, [x21, #3]
    mov      w9, #0x51
    eor      w8, w8, w9
    strb     w8, [x26, #3]
    ldrb     w8, [x21, #4]
    eor      w8, w8, #0xffffffef
    strb     w8, [x26, #4]
    ldrb     w8, [x21, #5]
    mov      w9, #0x73
    eor      w8, w8, w9
    strb     w8, [x26, #5]
    ldrb     w8, [x21, #6]
    eor      w8, w8, #0x33333333
    strb     w8, [x26, #6]
    ldrb     w8, [x21, #7]
    mov      w9, #0xbc
    eor      w8, w8, w9
    strb     w8, [x26, #7]
    ldrb     w8, [x21, #8]
    mov      w9, #0xb6
    eor      w8, w8, w9
    strb     w8, [x26, #8]
    ldr      x8, [sp, #0x10]
    str      w20, [x8]
    b        #0x3581d0
    mov      w9, #0xe982
    movk     w9, #0x1cf7, lsl #16
    cmp      w8, w9
    b.ne     #0x3581d0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x498]
    ldr      d0, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    ldr      x0, [sp, #0x20]
    adrp     x3, #0x54d000
    add      x3, x3, #0x9c0
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp, #8]
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    ldp      d9, d8, [sp, #0x40]
    add      sp, sp, #0xb0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups pillGap] IMP=0x3585A8 bounds=0x3585A8-0x358A38
loc_3585A8:
    sub      sp, sp, #0xc0
    stp      d9, d8, [sp, #0x50]
    stp      x28, x27, [sp, #0x60]
    stp      x26, x25, [sp, #0x70]
    stp      x24, x23, [sp, #0x80]
    stp      x22, x21, [sp, #0x90]
    stp      x20, x19, [sp, #0xa0]
    stp      x29, x30, [sp, #0xb0]
    add      x29, sp, #0xb0
    adrp     x8, #0x581000
    add      x8, x8, #0x32c
    ldar     w8, [x8]
    str      w8, [sp, #0x4c]
    mov      w9, #0xb4e7
    movk     w9, #0x9adf, lsl #16
    add      x8, sp, #0x14
    str      w9, [sp, #0x14]
    mov      w24, #0xb45d
    movk     w24, #0xf229, lsl #16
    mov      w25, #0x395d
    movk     w25, #0xbc6e, lsl #16
    str      x8, [sp, #8]
    mov      w26, #0x4f46
    movk     w26, #0x89d3, lsl #16
    mov      w22, #0x395e
    movk     w22, #0xbc6e, lsl #16
    mov      w19, #0x3e45
    movk     w19, #0x1b24, lsl #16
    mov      w28, #0x3e44
    movk     w28, #0x1b24, lsl #16
    mov      w27, #0xb45e
    movk     w27, #0xf229, lsl #16
    fmov     d8, xzr
    adrp     x23, #0x54d000
    add      x23, x23, #0xa00
    mov      w21, #0xdce2
    movk     w21, #0x3cfa, lsl #16
    adrp     x20, #0x54d000
    add      x20, x20, #0x9e1
    ldr      w8, [sp, #0x14]
    cmp      w8, w24
    b.gt     #0x3586bc
    cmp      w8, w25
    b.gt     #0x358704
    cmp      w8, w26
    b.eq     #0x3587dc
    mov      w9, #0xb4e7
    movk     w9, #0x9adf, lsl #16
    cmp      w8, w9
    b.eq     #0x3589a8
    mov      w9, #0xafd7
    movk     w9, #0xb933, lsl #16
    cmp      w8, w9
    b.ne     #0x358644
    adrp     x8, #0x581000
    add      x8, x8, #0x32c
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x40]
    ldr      x8, [sp, #8]
    str      w22, [x8]
    b        #0x358644
    cmp      w8, w28
    b.le     #0x358754
    cmp      w8, w19
    b.eq     #0x358794
    cmp      w8, w21
    b.eq     #0x358870
    mov      w9, #0x95d2
    movk     w9, #0x5bdc, lsl #16
    cmp      w8, w9
    b.ne     #0x358644
    adrp     x8, #0x54d000
    ldrb     w8, [x8, #0x9e0]
    mov      w9, #0xb9
    eor      w8, w8, w9
    strb     w8, [sp, #0x4a]
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x358644
    cmp      w8, w22
    b.eq     #0x358800
    mov      w9, #0xf61d
    movk     w9, #0xbd0b, lsl #16
    cmp      w8, w9
    b.eq     #0x3589cc
    mov      w9, #0x9a0a
    movk     w9, #0xcfe3, lsl #16
    cmp      w8, w9
    b.ne     #0x358644
    ldrb     w8, [sp, #0x4b]
    cmp      w8, #0
    mov      w8, #0xafd7
    movk     w8, #0xb933, lsl #16
    mov      w9, #0x95d2
    movk     w9, #0x5bdc, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x358644
    cmp      w8, w27
    b.eq     #0x358838
    mov      w9, #0x32f3
    movk     w9, #0x1a5d, lsl #16
    cmp      w8, w9
    b.ne     #0x3589f4
    ldr      d0, [sp, #0x28]
    ldrb     w8, [sp, #0x27]
    cmp      w8, #0
    fcsel    d0, d0, d8, ne
    ldr      x8, [sp, #8]
    mov      w9, #0x55de
    movk     w9, #0xf563, lsl #16
    str      w9, [x8]
    str      d0, [sp, #0x18]
    b        #0x358644
    adrp     x8, #0x4be000
    ldr      x2, [x8, #0x4a0]
    str      x2, [sp, #0x30]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    ldr      x0, [sp, #0x38]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldr      x8, [sp, #8]
    mov      w9, #0x55de
    movk     w9, #0xf563, lsl #16
    mov      w10, #0xf61d
    movk     w10, #0xbd0b, lsl #16
    csel     w9, w10, w9, ne
    str      w9, [x8]
    mov      x8, #0x4022000000000000
    str      x8, [sp, #0x18]
    b        #0x358644
    ldr      d0, [sp, #0x28]
    fcmp     d0, #0.0
    cset     w8, gt
    strb     w8, [sp, #0x27]
    ldr      x8, [sp, #8]
    mov      w9, #0x32f3
    movk     w9, #0x1a5d, lsl #16
    str      w9, [x8]
    b        #0x358644
    ldr      x0, [sp, #0x40]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    adrp     x2, #0x54d000
    add      x2, x2, #0xa40
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x38]
    ldr      x0, [sp, #0x40]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w19, [x8]
    b        #0x358644
    ldrb     w8, [sp, #0x49]
    adrp     x9, #0x54d000
    add      x9, x9, #0xa14
    strb     w8, [x9]
    adrp     x8, #0x54d000
    ldrb     w8, [x8, #0x9f5]
    mov      w10, #0x93
    eor      w8, w8, w10
    strb     w8, [x9, #1]
    ldr      x8, [sp, #8]
    mov      w9, #0xafd7
    movk     w9, #0xb933, lsl #16
    str      w9, [x8]
    b        #0x358644
    ldrb     w8, [sp, #0x4a]
    strb     w8, [x23]
    ldrb     w8, [x20]
    mov      w9, #9
    eor      w8, w8, w9
    strb     w8, [x23, #1]
    ldrb     w8, [x20, #1]
    mov      w9, #0x94
    eor      w8, w8, w9
    strb     w8, [x23, #2]
    ldrb     w8, [x20, #2]
    eor      w8, w8, #0x7e
    strb     w8, [x23, #3]
    ldrb     w8, [x20, #3]
    mov      w9, #0x3d
    eor      w8, w8, w9
    strb     w8, [x23, #4]
    ldrb     w8, [x20, #4]
    mov      w9, #0x45
    eor      w8, w8, w9
    strb     w8, [x23, #5]
    ldrb     w8, [x20, #5]
    mov      w9, #0x71
    eor      w8, w8, w9
    strb     w8, [x23, #6]
    ldrb     w8, [x20, #6]
    eor      w8, w8, #0x7f
    strb     w8, [x23, #7]
    ldrb     w8, [x20, #7]
    eor      w8, w8, #0x40
    strb     w8, [x23, #8]
    ldrb     w8, [x20, #8]
    eor      w8, w8, #0xfffffff9
    strb     w8, [x23, #9]
    ldrb     w8, [x20, #9]
    mov      w9, #0xec
    eor      w8, w8, w9
    strb     w8, [x23, #0xa]
    ldrb     w8, [x20, #0xa]
    mov      w9, #0x6a
    eor      w8, w8, w9
    strb     w8, [x23, #0xb]
    ldrb     w8, [x20, #0xb]
    mov      w9, #0xd
    eor      w8, w8, w9
    strb     w8, [x23, #0xc]
    ldrb     w8, [x20, #0xc]
    mov      w9, #0xb7
    eor      w8, w8, w9
    strb     w8, [x23, #0xd]
    ldrb     w8, [x20, #0xd]
    mov      w9, #0x5b
    eor      w8, w8, w9
    strb     w8, [x23, #0xe]
    ldrb     w8, [x20, #0xe]
    eor      w8, w8, #0xffffffc1
    strb     w8, [x23, #0xf]
    ldrb     w8, [x20, #0xf]
    mov      w9, #0x37
    eor      w8, w8, w9
    strb     w8, [x23, #0x10]
    ldrb     w8, [x20, #0x10]
    mov      w9, #0xf5
    eor      w8, w8, w9
    strb     w8, [x23, #0x11]
    ldrb     w8, [x20, #0x11]
    eor      w8, w8, #0xfffffff7
    strb     w8, [x23, #0x12]
    ldrb     w8, [x20, #0x12]
    mov      w9, #0x41
    eor      w8, w8, w9
    strb     w8, [x23, #0x13]
    ldrb     w8, [x20, #0x13]
    eor      w8, w8, #0x11111111
    strb     w8, [sp, #0x49]
    ldr      x8, [sp, #8]
    str      w27, [x8]
    b        #0x358644
    ldr      w8, [sp, #0x4c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x4b]
    ldr      x8, [sp, #8]
    mov      w9, #0x9a0a
    movk     w9, #0xcfe3, lsl #16
    str      w9, [x8]
    b        #0x358644
    ldp      x1, x0, [sp, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x8, #0x4044000000000000
    fmov     d1, x8
    fcmp     d0, d1
    fcsel    d0, d1, d0, gt
    str      d0, [sp, #0x28]
    ldr      x8, [sp, #8]
    str      w26, [x8]
    b        #0x358644
    mov      w9, #0x55de
    movk     w9, #0xf563, lsl #16
    cmp      w8, w9
    b.ne     #0x358644
    ldr      d8, [sp, #0x18]
    ldr      x0, [sp, #0x38]
    bl       #0x461c9c // _objc_release
    fmov     d0, d8
    ldp      x29, x30, [sp, #0xb0]
    ldp      x20, x19, [sp, #0xa0]
    ldp      x22, x21, [sp, #0x90]
    ldp      x24, x23, [sp, #0x80]
    ldp      x26, x25, [sp, #0x70]
    ldp      x28, x27, [sp, #0x60]
    ldp      d9, d8, [sp, #0x50]
    add      sp, sp, #0xc0
    ret      

// -[WCLGHomeGroups setPillGap:] IMP=0x358A38 bounds=0x358A38-0x358DF8
loc_358A38:
    sub      sp, sp, #0xb0
    stp      d11, d10, [sp, #0x30]
    stp      d9, d8, [sp, #0x40]
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    fmov     d8, d0
    mov      w22, #0x5f92
    movk     w22, #0xe546, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x330
    ldar     w8, [x8]
    str      w8, [sp, #0x2c]
    mov      w8, #0xec47
    movk     w8, #0xdb8c, lsl #16
    str      w8, [sp, #0x1c]
    add      x8, sp, #0x1c
    mov      w25, #0x5f91
    movk     w25, #0xe546, lsl #16
    stp      x0, x8, [sp, #8]
    mov      w26, #0x8b06
    movk     w26, #0xd532, lsl #16
    mov      w27, #0xa318
    movk     w27, #0xace3, lsl #16
    mov      w21, #0xdb59
    movk     w21, #0x63e7, lsl #16
    adrp     x23, #0x54d000
    add      x23, x23, #0xa80
    mov      w20, #0x61cf
    movk     w20, #0x1ff9, lsl #16
    mov      w28, #0x61ce
    movk     w28, #0x1ff9, lsl #16
    fmov     d10, xzr
    adrp     x19, #0x54d000
    add      x19, x19, #0xa66
    adrp     x24, #0x54d000
    add      x24, x24, #0xa86
    ldr      w8, [sp, #0x1c]
    cmp      w8, w25
    b.le     #0x358b24
    cmp      w8, w28
    b.gt     #0x358b84
    cmp      w8, w22
    b.eq     #0x358cec
    mov      w9, #0x26d0
    movk     w9, #0x1823, lsl #16
    cmp      w8, w9
    b.ne     #0x358adc
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    mov      w9, #0x8b07
    movk     w9, #0xd532, lsl #16
    str      w9, [x8]
    b        #0x358adc
    cmp      w8, w26
    b.gt     #0x358c84
    cmp      w8, w27
    b.eq     #0x358cb0
    mov      w9, #0x62c8
    movk     w9, #0xb7b7, lsl #16
    cmp      w8, w9
    b.ne     #0x358adc
    adrp     x9, #0x54d000
    add      x9, x9, #0xa60
    ldrb     w8, [x9]
    eor      w8, w8, #0xffffffc3
    strb     w8, [x23]
    ldrb     w8, [x9, #1]
    mov      w10, #0xab
    eor      w8, w8, w10
    strb     w8, [x23, #1]
    ldrb     w8, [x9, #2]
    mov      w9, #0x4a
    eor      w8, w8, w9
    strb     w8, [x23, #2]
    ldr      x8, [sp, #0x10]
    str      w27, [x8]
    b        #0x358adc
    cmp      w8, w20
    b.eq     #0x358d94
    cmp      w8, w21
    b.ne     #0x358adc
    ldrb     w8, [x19]
    eor      w8, w8, #0xfffffff3
    strb     w8, [x24]
    ldrb     w8, [x19, #1]
    eor      w8, w8, #4
    strb     w8, [x24, #1]
    ldrb     w8, [x19, #2]
    mov      w9, #0x6f
    eor      w8, w8, w9
    strb     w8, [x24, #2]
    ldrb     w8, [x19, #3]
    mov      w9, #0xbc
    eor      w8, w8, w9
    strb     w8, [x24, #3]
    ldrb     w8, [x19, #4]
    eor      w8, w8, #0x18
    strb     w8, [x24, #4]
    ldrb     w8, [x19, #5]
    mov      w9, #0xda
    eor      w8, w8, w9
    strb     w8, [x24, #5]
    ldrb     w8, [x19, #6]
    mov      w9, #0x15
    eor      w8, w8, w9
    strb     w8, [x24, #6]
    ldrb     w8, [x19, #7]
    mov      w9, #0x5c
    eor      w8, w8, w9
    strb     w8, [x24, #7]
    ldrb     w8, [x19, #8]
    mov      w9, #0xf6
    eor      w8, w8, w9
    strb     w8, [x24, #8]
    ldrb     w8, [x19, #9]
    mov      w9, #0x84
    eor      w8, w8, w9
    strb     w8, [x24, #9]
    ldrb     w8, [x19, #0xa]
    eor      w8, w8, #0x38
    strb     w8, [x24, #0xa]
    ldrb     w8, [x19, #0xb]
    mov      w9, #0x7b
    eor      w8, w8, w9
    strb     w8, [x24, #0xb]
    ldrb     w8, [x19, #0xc]
    mov      w9, #0x9c
    eor      w8, w8, w9
    strb     w8, [x24, #0xc]
    ldrb     w8, [x19, #0xd]
    mov      w9, #0x59
    eor      w8, w8, w9
    strb     w8, [x24, #0xd]
    ldrb     w8, [x19, #0xe]
    eor      w8, w8, #0x99999999
    strb     w8, [x24, #0xe]
    ldrb     w8, [x19, #0xf]
    strb     w8, [x24, #0xf]
    ldr      x8, [sp, #0x10]
    str      w22, [x8]
    b        #0x358adc
    mov      w9, #0xec47
    movk     w9, #0xdb8c, lsl #16
    cmp      w8, w9
    b.ne     #0x358db4
    ldr      w8, [sp, #0x2c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x2b]
    ldr      x8, [sp, #0x10]
    str      w20, [x8]
    b        #0x358adc
    adrp     x9, #0x54d000
    add      x9, x9, #0xa63
    ldrb     w8, [x9]
    eor      w8, w8, #0x3c
    adrp     x10, #0x54d000
    add      x10, x10, #0xa83
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    eor      w8, w8, #0x22222222
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    strb     w8, [x10, #2]
    ldr      x8, [sp, #0x10]
    str      w21, [x8]
    b        #0x358adc
    adrp     x8, #0x581000
    add      x8, x8, #0x330
    mov      w9, #1
    stlr     w9, [x8]
    mov      x8, #0x4044000000000000
    fmov     d0, x8
    fcmp     d8, d0
    fcsel    d0, d0, d8, gt
    fmaxnm   d9, d0, d10
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x20]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x498]
    fmov     d0, d9
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    ldr      x0, [sp, #0x20]
    mov      x2, x21
    adrp     x3, #0x54d000
    add      x3, x3, #0xac0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      w21, #0xdb59
    movk     w21, #0x63e7, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    mov      w9, #0x26d0
    movk     w9, #0x1823, lsl #16
    str      w9, [x8]
    b        #0x358adc
    ldrb     w8, [sp, #0x2b]
    cmp      w8, #0
    mov      w8, #0x62c8
    movk     w8, #0xb7b7, lsl #16
    csel     w8, w8, w22, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x358adc
    mov      w9, #0x8b07
    movk     w9, #0xd532, lsl #16
    cmp      w8, w9
    b.ne     #0x358adc
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp, #8]
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    ldp      d9, d8, [sp, #0x40]
    ldp      d11, d10, [sp, #0x30]
    add      sp, sp, #0xb0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups pillHorizontalInset] IMP=0x358DF8 bounds=0x358DF8-0x35935C
loc_358DF8:
    sub      sp, sp, #0xd0
    stp      d9, d8, [sp, #0x60]
    stp      x28, x27, [sp, #0x70]
    stp      x26, x25, [sp, #0x80]
    stp      x24, x23, [sp, #0x90]
    stp      x22, x21, [sp, #0xa0]
    stp      x20, x19, [sp, #0xb0]
    stp      x29, x30, [sp, #0xc0]
    add      x29, sp, #0xc0
    adrp     x8, #0x581000
    add      x8, x8, #0x334
    ldar     w8, [x8]
    str      w8, [sp, #0x5c]
    mov      w9, #0xa73
    movk     w9, #0xcfa3, lsl #16
    add      x8, sp, #0x14
    str      w9, [sp, #0x14]
    mov      w24, #0xc197
    movk     w24, #0x102c, lsl #16
    mov      w25, #0xec8d
    movk     w25, #0xe3f0, lsl #16
    str      x8, [sp, #8]
    mov      w26, #0x2f1a
    movk     w26, #0x8777, lsl #16
    mov      w19, #0xec8e
    movk     w19, #0xe3f0, lsl #16
    adrp     x23, #0x54d000
    add      x23, x23, #0xae0
    adrp     x20, #0x54d000
    add      x20, x20, #0xb10
    adrp     x21, #0x54d000
    add      x21, x21, #0xb24
    fmov     d8, #8.00000000
    adrp     x22, #0x54d000
    add      x22, x22, #0xaf5
    mov      w27, #0x8e59
    movk     w27, #0x3e55, lsl #16
    mov      w28, #0xc198
    movk     w28, #0x102c, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w24
    b.gt     #0x358ef4
    cmp      w8, w25
    b.gt     #0x358f80
    cmp      w8, w26
    b.eq     #0x359048
    mov      w9, #0x8923
    movk     w9, #0x9103, lsl #16
    cmp      w8, w9
    b.eq     #0x35920c
    mov      w9, #0xa73
    movk     w9, #0xcfa3, lsl #16
    cmp      w8, w9
    b.ne     #0x358e94
    ldr      w8, [sp, #0x5c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x5b]
    ldr      x8, [sp, #8]
    mov      w9, #0x28f9
    movk     w9, #0xf043, lsl #16
    str      w9, [x8]
    b        #0x358e94
    cmp      w8, w27
    b.gt     #0x358fc8
    cmp      w8, w28
    b.eq     #0x359014
    mov      w9, #0x6fe7
    movk     w9, #0x2c62, lsl #16
    cmp      w8, w9
    b.eq     #0x3591dc
    mov      w9, #0xcc0d
    movk     w9, #0x31d2, lsl #16
    cmp      w8, w9
    b.ne     #0x358e94
    adrp     x8, #0x581000
    add      x8, x8, #0x334
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x50]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    adrp     x2, #0x54d000
    add      x2, x2, #0xb60
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x48]
    ldr      x8, [sp, #8]
    str      w26, [x8]
    b        #0x358e94
    cmp      w8, w19
    b.eq     #0x359084
    mov      w9, #0x8a63
    movk     w9, #0xf01e, lsl #16
    cmp      w8, w9
    b.eq     #0x35922c
    mov      w9, #0x28f9
    movk     w9, #0xf043, lsl #16
    cmp      w8, w9
    b.ne     #0x358e94
    ldrb     w8, [sp, #0x5b]
    cmp      w8, #0
    mov      w8, #0xcc0d
    movk     w8, #0x31d2, lsl #16
    csel     w8, w19, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x358e94
    mov      w9, #0xf283
    movk     w9, #0x599c, lsl #16
    cmp      w8, w9
    b.eq     #0x3591c0
    mov      w9, #0xead6
    movk     w9, #0x6ebb, lsl #16
    cmp      w8, w9
    b.ne     #0x359318
    ldp      x1, x0, [sp, #0x40]
    bl       #0x461c6c // _objc_msgSend
    str      d0, [sp, #0x30]
    mov      x8, #0x4048000000000000
    fmov     d1, x8
    fcmp     d0, d1
    cset     w8, gt
    strb     w8, [sp, #0x2f]
    ldr      x8, [sp, #8]
    str      w28, [x8]
    b        #0x358e94
    ldr      d0, [sp, #0x30]
    ldrb     w8, [sp, #0x2f]
    cmp      w8, #0
    mov      x8, #0x4048000000000000
    fmov     d1, x8
    fcsel    d0, d1, d0, ne
    fmaxnm   d0, d0, d8
    str      d0, [sp, #0x20]
    ldr      x8, [sp, #8]
    mov      w9, #0xf283
    movk     w9, #0x599c, lsl #16
    str      w9, [x8]
    b        #0x358e94
    ldr      x0, [sp, #0x50]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x2, [x8, #0x4a0]
    str      x2, [sp, #0x40]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    ldr      x0, [sp, #0x48]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x3f]
    ldr      x8, [sp, #8]
    mov      w9, #0x6fe7
    movk     w9, #0x2c62, lsl #16
    str      w9, [x8]
    b        #0x358e94
    ldrb     w8, [x23]
    mov      w9, #0x16
    eor      w8, w8, w9
    strb     w8, [x20]
    ldrb     w8, [x23, #1]
    mov      w9, #5
    eor      w8, w8, w9
    strb     w8, [x20, #1]
    ldrb     w8, [x23, #2]
    mov      w9, #0x8d
    eor      w8, w8, w9
    strb     w8, [x20, #2]
    ldrb     w8, [x23, #3]
    mov      w9, #0x71
    eor      w8, w8, w9
    strb     w8, [x20, #3]
    ldrb     w8, [x23, #4]
    eor      w8, w8, #0xfffffffb
    strb     w8, [x20, #4]
    ldrb     w8, [x23, #5]
    mov      w9, #0x3a
    eor      w8, w8, w9
    strb     w8, [x20, #5]
    ldrb     w8, [x23, #6]
    mov      w9, #0xd6
    eor      w8, w8, w9
    strb     w8, [x20, #6]
    ldrb     w8, [x23, #7]
    eor      w8, w8, #0x20
    strb     w8, [x20, #7]
    ldrb     w8, [x23, #8]
    mov      w10, #0x25
    eor      w8, w8, w10
    strb     w8, [x20, #8]
    ldrb     w8, [x23, #9]
    eor      w8, w8, #0xffffffe1
    strb     w8, [x20, #9]
    ldrb     w8, [x23, #0xa]
    mov      w10, #0x1d
    eor      w8, w8, w10
    strb     w8, [x20, #0xa]
    ldrb     w8, [x23, #0xb]
    mov      w10, #0x14
    eor      w8, w8, w10
    strb     w8, [x20, #0xb]
    ldrb     w8, [x23, #0xc]
    eor      w8, w8, #0xfc
    strb     w8, [x20, #0xc]
    ldrb     w8, [x23, #0xd]
    mov      w10, #0xc4
    eor      w8, w8, w10
    strb     w8, [x20, #0xd]
    ldrb     w8, [x23, #0xe]
    mov      w10, #0xb4
    eor      w8, w8, w10
    strb     w8, [x20, #0xe]
    ldrb     w8, [x23, #0xf]
    eor      w8, w8, #0x7f
    strb     w8, [x20, #0xf]
    ldrb     w8, [x23, #0x10]
    eor      w8, w8, #0x11111111
    strb     w8, [x20, #0x10]
    ldrb     w8, [x23, #0x11]
    mov      w10, #0x67
    eor      w8, w8, w10
    strb     w8, [x20, #0x11]
    ldrb     w8, [x23, #0x12]
    eor      w8, w8, #0xffffffc7
    strb     w8, [x20, #0x12]
    ldrb     w8, [x23, #0x13]
    eor      w8, w8, w9
    strb     w8, [x20, #0x13]
    ldrb     w8, [x23, #0x14]
    strb     w8, [sp, #0x5a]
    ldr      x8, [sp, #8]
    mov      w9, #0x8a63
    movk     w9, #0xf01e, lsl #16
    str      w9, [x8]
    b        #0x358e94
    ldr      x8, [sp, #8]
    mov      w9, #0x8e5a
    movk     w9, #0x3e55, lsl #16
    str      w9, [x8]
    ldr      d0, [sp, #0x20]
    str      d0, [sp, #0x18]
    b        #0x358e94
    ldrb     w8, [sp, #0x3f]
    cmp      w8, #0
    mov      w8, #0x8e5a
    movk     w8, #0x3e55, lsl #16
    mov      w9, #0xead6
    movk     w9, #0x6ebb, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    mov      x8, #0x4030000000000000
    str      x8, [sp, #0x18]
    b        #0x358e94
    ldrb     w8, [sp, #0x59]
    adrp     x9, #0x54d000
    strb     w8, [x9, #0xb31]
    ldr      x8, [sp, #8]
    mov      w9, #0xcc0d
    movk     w9, #0x31d2, lsl #16
    str      w9, [x8]
    b        #0x358e94
    ldrb     w8, [sp, #0x5a]
    mov      w9, #0xeb
    eor      w8, w8, w9
    strb     w8, [x21]
    ldrb     w8, [x22]
    mov      w9, #0x2c
    eor      w8, w8, w9
    strb     w8, [x21, #1]
    ldrb     w8, [x22, #1]
    eor      w8, w8, #0xfffffffd
    strb     w8, [x21, #2]
    ldrb     w8, [x22, #2]
    mov      w9, #0xb9
    eor      w8, w8, w9
    strb     w8, [x21, #3]
    ldrb     w8, [x22, #3]
    mov      w9, #0x47
    eor      w8, w8, w9
    strb     w8, [x21, #4]
    ldrb     w8, [x22, #4]
    mov      w9, #0x43
    eor      w8, w8, w9
    strb     w8, [x21, #5]
    ldrb     w8, [x22, #5]
    mov      w9, #0x91
    eor      w8, w8, w9
    strb     w8, [x21, #6]
    ldrb     w8, [x22, #6]
    mov      w9, #0x8e
    eor      w8, w8, w9
    strb     w8, [x21, #7]
    ldrb     w8, [x22, #7]
    mov      w9, #0x14
    eor      w8, w8, w9
    strb     w8, [x21, #8]
    ldrb     w8, [x22, #8]
    eor      w8, w8, #0x33333333
    strb     w8, [x21, #9]
    ldrb     w8, [x22, #9]
    mov      w9, #0xa8
    eor      w8, w8, w9
    strb     w8, [x21, #0xa]
    ldrb     w8, [x22, #0xa]
    mov      w9, #0xcd
    eor      w8, w8, w9
    strb     w8, [x21, #0xb]
    ldrb     w8, [x22, #0xb]
    mov      w9, #0x5e
    eor      w8, w8, w9
    strb     w8, [x21, #0xc]
    ldrb     w8, [x22, #0xc]
    mov      w9, #0x74
    eor      w8, w8, w9
    strb     w8, [sp, #0x59]
    ldr      x8, [sp, #8]
    mov      w9, #0x8923
    movk     w9, #0x9103, lsl #16
    str      w9, [x8]
    b        #0x358e94
    mov      w9, #0x8e5a
    movk     w9, #0x3e55, lsl #16
    cmp      w8, w9
    b.ne     #0x358e94
    ldr      d8, [sp, #0x18]
    ldr      x0, [sp, #0x48]
    bl       #0x461c9c // _objc_release
    fmov     d0, d8
    ldp      x29, x30, [sp, #0xc0]
    ldp      x20, x19, [sp, #0xb0]
    ldp      x22, x21, [sp, #0xa0]
    ldp      x24, x23, [sp, #0x90]
    ldp      x26, x25, [sp, #0x80]
    ldp      x28, x27, [sp, #0x70]
    ldp      d9, d8, [sp, #0x60]
    add      sp, sp, #0xd0
    ret      

// -[WCLGHomeGroups setPillHorizontalInset:] IMP=0x35935C bounds=0x35935C-0x3597E0
loc_35935C:
    sub      sp, sp, #0xa0
    stp      d9, d8, [sp, #0x30]
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      w8, #0x199
    movk     w8, #0x2fb3, lsl #16
    adrp     x9, #0x581000
    add      x9, x9, #0x338
    ldar     w9, [x9]
    str      w9, [sp, #0x2c]
    mov      w10, #0x9d50
    movk     w10, #0x6264, lsl #16
    str      w10, [sp, #0x18]
    add      x9, sp, #0x18
    mov      w11, #0x781b
    movk     w11, #0x602c, lsl #16
    stp      x0, x9, [sp, #8]
    mov      w12, #0x797d
    movk     w12, #0x18a4, lsl #16
    mov      w13, #0xc283
    movk     w13, #0x4eb, lsl #16
    mov      x14, #0x4048000000000000
    fmov     d1, #8.00000000
    mov      w15, #0xfe7d
    movk     w15, #0x8d2a, lsl #16
    mov      w16, #0x797e
    movk     w16, #0x18a4, lsl #16
    adrp     x17, #0x54d000
    add      x17, x17, #0xbd0
    mov      w3, #0xab6f
    movk     w3, #0x6aad, lsl #16
    mov      w4, #0x781c
    movk     w4, #0x602c, lsl #16
    mov      w5, #0x5460
    movk     w5, #0x7791, lsl #16
    mov      w6, #0xab70
    movk     w6, #0x6aad, lsl #16
    adrp     x7, #0x54d000
    add      x7, x7, #0xb95
    adrp     x21, #0x54d000
    add      x21, x21, #0xbc5
    adrp     x30, #0x54d000
    add      x30, x30, #0xb80
    mov      w1, #0xc4
    mov      w2, #0x34
    mov      w20, #0x91
    mov      w22, #0x71
    mov      w23, #0x23
    mov      w24, #0x57
    mov      w25, #0xb
    mov      w26, #0x47
    mov      w27, #0x86
    mov      w28, #0x14
    adrp     x19, #0x54d000
    add      x19, x19, #0xbb0
    ldr      w9, [sp, #0x18]
    cmp      w9, w11
    b.le     #0x35948c
    cmp      w9, w3
    b.gt     #0x3594d0
    cmp      w9, w4
    b.eq     #0x359654
    cmp      w9, w10
    b.ne     #0x35944c
    ldr      w9, [sp, #0x2c]
    cmp      w9, #0
    cset     w9, eq
    strb     w9, [sp, #0x2b]
    ldr      x9, [sp, #0x10]
    str      w4, [x9]
    b        #0x35944c
    cmp      w9, w12
    b.le     #0x3595f4
    cmp      w9, w16
    b.eq     #0x359628
    cmp      w9, w8
    b.ne     #0x35944c
    adrp     x9, #0x581000
    add      x9, x9, #0x338
    mov      w0, #1
    stlr     w0, [x9]
    fmov     d2, x14
    fcmp     d0, d2
    cset     w9, gt
    strb     w9, [sp, #0x29]
    ldr      x9, [sp, #0x10]
    str      w13, [x9]
    b        #0x35944c
    cmp      w9, w6
    b.eq     #0x35966c
    cmp      w9, w5
    b.ne     #0x35944c
    ldrb     w9, [x30]
    mov      w0, #0x35
    eor      w9, w9, w0
    strb     w9, [x19]
    ldrb     w9, [x30, #1]
    mov      w0, #0xfa
    eor      w9, w9, w0
    strb     w9, [x19, #1]
    ldrb     w9, [x30, #2]
    eor      w9, w9, #0xaaaaaaaa
    strb     w9, [x19, #2]
    ldrb     w9, [x30, #3]
    mov      w0, #0xd4
    eor      w9, w9, w0
    strb     w9, [x19, #3]
    ldrb     w9, [x30, #4]
    eor      w9, w9, #0xfffffff3
    strb     w9, [x19, #4]
    ldrb     w9, [x30, #5]
    mvn      w9, w9
    strb     w9, [x19, #5]
    ldrb     w9, [x30, #6]
    eor      w9, w9, w1
    strb     w9, [x19, #6]
    ldrb     w9, [x30, #7]
    eor      w9, w9, w2
    strb     w9, [x19, #7]
    ldrb     w9, [x30, #8]
    eor      w9, w9, w20
    strb     w9, [x19, #8]
    ldrb     w9, [x30, #9]
    eor      w9, w9, #8
    strb     w9, [x19, #9]
    ldrb     w9, [x30, #0xa]
    eor      w9, w9, w22
    strb     w9, [x19, #0xa]
    ldrb     w9, [x30, #0xb]
    eor      w9, w9, w23
    strb     w9, [x19, #0xb]
    ldrb     w9, [x30, #0xc]
    eor      w9, w9, w24
    strb     w9, [x19, #0xc]
    ldrb     w9, [x30, #0xd]
    eor      w9, w9, w25
    strb     w9, [x19, #0xd]
    ldrb     w9, [x30, #0xe]
    eor      w9, w9, #0xdddddddd
    strb     w9, [x19, #0xe]
    ldrb     w9, [x30, #0xf]
    eor      w9, w9, w26
    strb     w9, [x19, #0xf]
    ldrb     w9, [x30, #0x10]
    eor      w9, w9, #0x1f
    strb     w9, [x19, #0x10]
    ldrb     w9, [x30, #0x11]
    eor      w9, w9, w27
    strb     w9, [x19, #0x11]
    ldrb     w9, [x30, #0x12]
    eor      w9, w9, #0xaaaaaaaa
    strb     w9, [x19, #0x12]
    ldrb     w9, [x30, #0x13]
    eor      w9, w9, w28
    strb     w9, [x19, #0x13]
    ldrb     w9, [x30, #0x14]
    eor      w9, w9, #0xf0
    strb     w9, [x19, #0x14]
    ldr      x9, [sp, #0x10]
    str      w6, [x9]
    b        #0x35944c
    cmp      w9, w13
    b.ne     #0x359724
    ldrb     w9, [sp, #0x29]
    cmp      w9, #0
    fmov     d2, x14
    fcsel    d2, d2, d0, ne
    str      d2, [sp, #0x20]
    fcmp     d2, d1
    cset     w9, gt
    strb     w9, [sp, #0x1f]
    ldr      x9, [sp, #0x10]
    str      w15, [x9]
    b        #0x35944c
    ldrb     w9, [sp, #0x2a]
    mov      w0, #0xca
    eor      w9, w9, w0
    strb     w9, [x17]
    adrp     x9, #0x54d000
    ldrb     w9, [x9, #0xba1]
    eor      w9, w9, #0x80
    strb     w9, [x17, #1]
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x35944c
    ldrb     w9, [sp, #0x2b]
    cmp      w9, #0
    csel     w9, w5, w8, ne
    ldr      x0, [sp, #0x10]
    str      w9, [x0]
    b        #0x35944c
    ldrb     w9, [x7]
    mov      w0, #0xa
    eor      w9, w9, w0
    strb     w9, [x21]
    ldrb     w9, [x7, #1]
    mov      w0, #0xab
    eor      w9, w9, w0
    strb     w9, [x21, #1]
    ldrb     w9, [x7, #2]
    mov      w0, #0x4d
    eor      w9, w9, w0
    strb     w9, [x21, #2]
    ldrb     w9, [x7, #3]
    eor      w9, w9, #0xffffff9f
    strb     w9, [x21, #3]
    ldrb     w9, [x7, #4]
    eor      w9, w9, #0xffffff8f
    strb     w9, [x21, #4]
    ldrb     w9, [x7, #5]
    mov      w0, #0x96
    eor      w9, w9, w0
    strb     w9, [x21, #5]
    ldrb     w9, [x7, #6]
    mov      w0, #0x59
    eor      w9, w9, w0
    strb     w9, [x21, #6]
    ldrb     w9, [x7, #7]
    eor      w9, w9, #0xf8
    strb     w9, [x21, #7]
    ldrb     w9, [x7, #8]
    mov      w0, #0x92
    eor      w9, w9, w0
    strb     w9, [x21, #8]
    ldrb     w9, [x7, #9]
    mov      w0, #0x49
    eor      w9, w9, w0
    strb     w9, [x21, #9]
    ldrb     w9, [x7, #0xa]
    mov      w0, #0x5c
    eor      w9, w9, w0
    strb     w9, [x21, #0xa]
    ldrb     w9, [x7, #0xb]
    strb     w9, [sp, #0x2a]
    ldr      x9, [sp, #0x10]
    str      w16, [x9]
    b        #0x35944c
    cmp      w9, w15
    b.ne     #0x35944c
    ldr      d0, [sp, #0x20]
    ldrb     w8, [sp, #0x1f]
    cmp      w8, #0
    fmov     d1, #8.00000000
    fcsel    d8, d0, d1, ne
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x498]
    fmov     d0, d8
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    adrp     x3, #0x54d000
    add      x3, x3, #0xc00
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp, #8]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    ldp      d9, d8, [sp, #0x30]
    add      sp, sp, #0xa0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups hideAllGroup] IMP=0x3597E0 bounds=0x3597E0-0x359B54
loc_3597E0:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      w20, #0xd85
    movk     w20, #0x24bf, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x33c
    ldar     w8, [x8]
    mov      w9, #0x64db
    movk     w9, #0xbf1f, lsl #16
    str      w8, [sp, #0x2c]
    add      x8, sp, #8
    mov      w23, #0x1813
    movk     w23, #0xc93e, lsl #16
    str      w9, [sp, #8]
    mov      w24, #0xf3d7
    movk     w24, #0xbdfa, lsl #16
    str      x8, [sp]
    adrp     x25, #0x54d000
    add      x25, x25, #0xc20
    mov      w10, #0x32c2
    movk     w10, #0x87bc, lsl #16
    adrp     x28, #0x54d000
    add      x28, x28, #0xc40
    mov      w21, #0xa41
    movk     w21, #0x4223, lsl #16
    mov      w22, #0xf3d8
    movk     w22, #0xbdfa, lsl #16
    mov      w12, #0xdd29
    movk     w12, #0x7d78, lsl #16
    mov      w27, #0xa40
    movk     w27, #0x4223, lsl #16
    mov      w26, #0x1814
    movk     w26, #0xc93e, lsl #16
    adrp     x19, #0x54d000
    add      x19, x19, #0xc52
    ldr      w8, [sp, #8]
    cmp      w8, w23
    b.le     #0x3598d8
    cmp      w8, w27
    b.gt     #0x359914
    cmp      w8, w26
    b.eq     #0x359ab4
    cmp      w8, w20
    b.ne     #0x359884
    adrp     x8, #0x581000
    add      x8, x8, #0x33c
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x9, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x308]
    stp      x8, x9, [sp, #0x18]
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x359884
    cmp      w8, w24
    b.le     #0x35993c
    cmp      w8, w22
    b.eq     #0x359a60
    mov      w9, #0x64db
    movk     w9, #0xbf1f, lsl #16
    cmp      w8, w9
    b.ne     #0x359884
    ldr      w8, [sp, #0x2c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x2b]
    ldr      x8, [sp]
    str      w12, [x8]
    b        #0x359884
    cmp      w8, w21
    b.eq     #0x359ad4
    cmp      w8, w12
    b.ne     #0x359884
    ldrb     w8, [sp, #0x2b]
    cmp      w8, #0
    csel     w8, w10, w20, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x359884
    cmp      w8, w10
    b.ne     #0x359b18
    ldrb     w8, [x25]
    mov      w9, #0x58
    eor      w8, w8, w9
    strb     w8, [x28]
    ldrb     w8, [x25, #1]
    mov      w11, #0x52
    eor      w8, w8, w11
    strb     w8, [x28, #1]
    ldrb     w8, [x25, #2]
    mov      w11, #0xb0
    eor      w8, w8, w11
    strb     w8, [x28, #2]
    ldrb     w8, [x25, #3]
    eor      w8, w8, #0xcccccccc
    strb     w8, [x28, #3]
    ldrb     w8, [x25, #4]
    mov      w11, #0x25
    eor      w8, w8, w11
    strb     w8, [x28, #4]
    ldrb     w8, [x25, #5]
    mov      w11, #0xe4
    eor      w8, w8, w11
    strb     w8, [x28, #5]
    ldrb     w8, [x25, #6]
    mov      w11, #0xc2
    eor      w8, w8, w11
    strb     w8, [x28, #6]
    ldrb     w8, [x25, #7]
    eor      w8, w8, w9
    strb     w8, [x28, #7]
    ldrb     w8, [x25, #8]
    mov      w9, #0x47
    eor      w8, w8, w9
    strb     w8, [x28, #8]
    ldrb     w8, [x25, #9]
    mov      w9, #0xa2
    eor      w8, w8, w9
    strb     w8, [x28, #9]
    ldrb     w8, [x25, #0xa]
    eor      w8, w8, #0xfffffff7
    strb     w8, [x28, #0xa]
    ldrb     w8, [x25, #0xb]
    eor      w8, w8, #0xffffffef
    strb     w8, [x28, #0xb]
    ldrb     w8, [x25, #0xc]
    mov      w9, #0x3a
    eor      w8, w8, w9
    strb     w8, [x28, #0xc]
    ldrb     w8, [x25, #0xd]
    mov      w9, #0x3b
    eor      w8, w8, w9
    strb     w8, [x28, #0xd]
    ldrb     w8, [x25, #0xe]
    mov      w9, #0x9d
    eor      w8, w8, w9
    strb     w8, [x28, #0xe]
    ldrb     w8, [x25, #0xf]
    eor      w8, w8, #0x22222222
    strb     w8, [x28, #0xf]
    ldrb     w8, [x25, #0x10]
    mov      w9, #0xf4
    eor      w8, w8, w9
    strb     w8, [x28, #0x10]
    ldrb     w8, [x25, #0x11]
    eor      w8, w8, #0xffffff87
    strb     w8, [x28, #0x11]
    ldrb     w8, [x25, #0x12]
    strb     w8, [sp, #0x2a]
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x359884
    ldp      x1, x0, [sp, #0x18]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x480]
    adrp     x2, #0x54d000
    add      x2, x2, #0xc80
    mov      w3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      w12, #0xdd29
    movk     w12, #0x7d78, lsl #16
    mov      w10, #0x32c2
    movk     w10, #0x87bc, lsl #16
    strb     w0, [sp, #0xf]
    ldr      x8, [sp]
    mov      w9, #0x92ca
    movk     w9, #0xa76d, lsl #16
    str      w9, [x8]
    b        #0x359884
    adrp     x8, #0x54d000
    ldrb     w8, [x8, #0xc35]
    eor      w8, w8, #0xfffffff9
    adrp     x9, #0x54d000
    strb     w8, [x9, #0xc55]
    ldr      x8, [sp]
    str      w20, [x8]
    b        #0x359884
    ldrb     w8, [sp, #0x2a]
    mov      w9, #0xd4
    eor      w8, w8, w9
    strb     w8, [x19]
    adrp     x11, #0x54d000
    add      x11, x11, #0xc33
    ldrb     w8, [x11]
    mov      w9, #0x5c
    eor      w8, w8, w9
    strb     w8, [x19, #1]
    ldrb     w8, [x11, #1]
    mov      w9, #0xa
    eor      w8, w8, w9
    strb     w8, [x19, #2]
    ldr      x8, [sp]
    str      w26, [x8]
    b        #0x359884
    mov      w9, #0x92ca
    movk     w9, #0xa76d, lsl #16
    cmp      w8, w9
    b.ne     #0x359884
    ldr      x0, [sp, #0x10]
    bl       #0x461c9c // _objc_release
    ldrb     w0, [sp, #0xf]
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    ret      

// -[WCLGHomeGroups setHideAllGroup:] IMP=0x359B54 bounds=0x359B54-0x35A1C4
loc_359B54:
    sub      sp, sp, #0xb0
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    str      w2, [sp, #0xc]
    mov      x20, x0
    adrp     x8, #0x581000
    add      x8, x8, #0x340
    ldar     w8, [x8]
    str      w8, [sp, #0x4c]
    mov      w8, #0x8a11
    movk     w8, #0xb04d, lsl #16
    str      w8, [sp, #0x1c]
    add      x8, sp, #0x1c
    str      x8, [sp, #0x10]
    mov      w27, #0x3da4
    movk     w27, #0xffc4, lsl #16
    mov      w28, #0x8a10
    movk     w28, #0xb04d, lsl #16
    adrp     x22, #0x54d000
    add      x22, x22, #0xcc0
    adrp     x24, #0x54d000
    add      x24, x24, #0xce0
    mov      w21, #0xa00b
    movk     w21, #0x54ca, lsl #16
    mov      w19, #0x9c1
    movk     w19, #0x3b2f, lsl #16
    mov      w23, #0x63fc
    movk     w23, #0x6d59, lsl #16
    adrp     x25, #0x54d000
    add      x25, x25, #0xca0
    adrp     x26, #0x54d000
    add      x26, x26, #0xcad
    ldr      w8, [sp, #0x1c]
    cmp      w8, w27
    b.gt     #0x359c4c
    cmp      w8, w28
    b.le     #0x359ce4
    mov      w9, #0xa4a7
    movk     w9, #0xcf50, lsl #16
    cmp      w8, w9
    b.gt     #0x359d30
    mov      w9, #0x8a11
    movk     w9, #0xb04d, lsl #16
    cmp      w8, w9
    b.eq     #0x359e30
    mov      w9, #0x3c12
    movk     w9, #0xbeb3, lsl #16
    cmp      w8, w9
    b.ne     #0x35a194
    ldr      x1, [sp, #0x20]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x10]
    mov      w9, #0xae21
    movk     w9, #0xb0da, lsl #16
    str      w9, [x8]
    b        #0x359be8
    cmp      w8, w21
    b.gt     #0x359c9c
    cmp      w8, w19
    b.gt     #0x359d6c
    mov      w9, #0x3da5
    movk     w9, #0xffc4, lsl #16
    cmp      w8, w9
    b.eq     #0x359e80
    mov      w9, #0x6bb2
    movk     w9, #0xf81, lsl #16
    cmp      w8, w9
    b.ne     #0x359be8
    add      x0, x20, #8
    str      x0, [sp, #0x28]
    bl       #0x461d68 // _os_unfair_lock_lock
    ldr      x8, [sp, #0x10]
    mov      w9, #0x9f9c
    movk     w9, #0xd297, lsl #16
    str      w9, [x8]
    b        #0x359be8
    cmp      w8, w23
    b.gt     #0x359db0
    mov      w9, #0xa00c
    movk     w9, #0x54ca, lsl #16
    cmp      w8, w9
    b.eq     #0x359eb0
    mov      w9, #0xd83c
    movk     w9, #0x5e19, lsl #16
    cmp      w8, w9
    b.ne     #0x359be8
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xaf8]
    str      x8, [sp, #0x20]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x3c12
    movk     w9, #0xbeb3, lsl #16
    str      w9, [x8]
    b        #0x359be8
    mov      w9, #0xc4b1
    movk     w9, #0x92c5, lsl #16
    cmp      w8, w9
    b.gt     #0x359df4
    mov      w9, #0x444
    movk     w9, #0x820b, lsl #16
    cmp      w8, w9
    b.eq     #0x359ffc
    mov      w9, #0x1486
    movk     w9, #0x8677, lsl #16
    cmp      w8, w9
    b.ne     #0x359be8
    ldrb     w8, [sp, #0x4b]
    cmp      w8, #0
    mov      w8, #0xa06a
    movk     w8, #0x3d0c, lsl #16
    mov      w9, #0xc4b2
    movk     w9, #0x92c5, lsl #16
    b        #0x359ec8
    mov      w9, #0xa4a8
    movk     w9, #0xcf50, lsl #16
    cmp      w8, w9
    b.eq     #0x359e54
    mov      w9, #0x9f9c
    movk     w9, #0xd297, lsl #16
    cmp      w8, w9
    b.ne     #0x359be8
    mov      w8, #1
    strb     w8, [x20, #0x20]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x2ffa
    movk     w9, #0xa8ce, lsl #16
    str      w9, [x8]
    b        #0x359be8
    mov      w9, #0x9c2
    movk     w9, #0x3b2f, lsl #16
    cmp      w8, w9
    b.eq     #0x359ed8
    mov      w9, #0xa06a
    movk     w9, #0x3d0c, lsl #16
    cmp      w8, w9
    b.ne     #0x359be8
    adrp     x8, #0x581000
    add      x8, x8, #0x340
    mov      w9, #1
    stlr     w9, [x8]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x444
    movk     w9, #0x820b, lsl #16
    str      w9, [x8]
    b        #0x359be8
    mov      w9, #0x63fd
    movk     w9, #0x6d59, lsl #16
    cmp      w8, w9
    b.eq     #0x359f10
    mov      w9, #0xab97
    movk     w9, #0x74f5, lsl #16
    cmp      w8, w9
    b.ne     #0x359be8
    ldr      x0, [sp, #0x40]
    bl       #0x461c9c // _objc_release
    ldr      w8, [sp, #0xc]
    cmp      w8, #0
    mov      w8, #0xd83c
    movk     w8, #0x5e19, lsl #16
    mov      w9, #0x3da5
    movk     w9, #0xffc4, lsl #16
    b        #0x359ec8
    mov      w9, #0xc4b2
    movk     w9, #0x92c5, lsl #16
    cmp      w8, w9
    b.eq     #0x35a048
    mov      w9, #0x2ffa
    movk     w9, #0xa8ce, lsl #16
    cmp      w8, w9
    b.ne     #0x359be8
    ldr      x0, [sp, #0x28]
    bl       #0x461d74 // _os_unfair_lock_unlock
    ldr      x8, [sp, #0x10]
    mov      w9, #0xd83c
    movk     w9, #0x5e19, lsl #16
    str      w9, [x8]
    b        #0x359be8
    ldr      w8, [sp, #0x4c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x4b]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x1486
    movk     w9, #0x8677, lsl #16
    str      w9, [x8]
    b        #0x359be8
    ldrb     w8, [sp, #0x4a]
    adrp     x9, #0x54d000
    strb     w8, [x9, #0xcf4]
    adrp     x8, #0x54d000
    ldrb     w8, [x8, #0xcd5]
    strb     w8, [sp, #0x49]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x63fd
    movk     w9, #0x6d59, lsl #16
    str      w9, [x8]
    b        #0x359be8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf30]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x38]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x9c2
    movk     w9, #0x3b2f, lsl #16
    str      w9, [x8]
    b        #0x359be8
    ldrb     w8, [sp, #0x37]
    cmp      w8, #0
    mov      w8, #0xd83c
    movk     w8, #0x5e19, lsl #16
    mov      w9, #0x6bb2
    movk     w9, #0xf81, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x359be8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    ldr      x0, [sp, #0x38]
    adrp     x2, #0x54d000
    add      x2, x2, #0xd20
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x37]
    ldr      x0, [sp, #0x38]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    mov      w9, #0xa00c
    movk     w9, #0x54ca, lsl #16
    str      w9, [x8]
    b        #0x359be8
    ldrb     w8, [sp, #0x49]
    mov      w9, #0x5d
    eor      w8, w8, w9
    adrp     x9, #0x54d000
    strb     w8, [x9, #0xcf5]
    ldrb     w8, [x25]
    mov      w9, #0x56
    eor      w8, w8, w9
    strb     w8, [x26]
    ldrb     w8, [x25, #1]
    mov      w9, #0x96
    eor      w8, w8, w9
    strb     w8, [x26, #1]
    ldrb     w8, [x25, #2]
    mov      w9, #0xdc
    eor      w8, w8, w9
    strb     w8, [x26, #2]
    ldrb     w8, [x25, #3]
    mov      w9, #0x1d
    eor      w8, w8, w9
    strb     w8, [x26, #3]
    ldrb     w8, [x25, #4]
    eor      w8, w8, #0xfffffff9
    strb     w8, [x26, #4]
    ldrb     w8, [x25, #5]
    mov      w9, #0x3b
    eor      w8, w8, w9
    strb     w8, [x26, #5]
    ldrb     w8, [x25, #6]
    mov      w9, #0xc5
    eor      w8, w8, w9
    strb     w8, [x26, #6]
    ldrb     w8, [x25, #7]
    mov      w9, #0x39
    eor      w8, w8, w9
    strb     w8, [x26, #7]
    ldrb     w8, [x25, #8]
    eor      w8, w8, #0xfc
    strb     w8, [x26, #8]
    ldrb     w8, [x25, #9]
    mov      w9, #0xb6
    eor      w8, w8, w9
    strb     w8, [x26, #9]
    ldrb     w8, [x25, #0xa]
    mov      w9, #0x3d
    eor      w8, w8, w9
    strb     w8, [x26, #0xa]
    ldrb     w8, [x25, #0xb]
    eor      w8, w8, #0x80
    strb     w8, [x26, #0xb]
    ldrb     w8, [x25, #0xc]
    mov      w9, #0x86
    eor      w8, w8, w9
    strb     w8, [x26, #0xc]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xa06a
    movk     w9, #0x3d0c, lsl #16
    str      w9, [x8]
    b        #0x359be8
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x40]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x350]
    ldr      w2, [sp, #0xc]
    adrp     x3, #0x54d000
    add      x3, x3, #0xd60
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x10]
    mov      w9, #0xab97
    movk     w9, #0x74f5, lsl #16
    str      w9, [x8]
    b        #0x359be8
    ldrb     w8, [x22]
    mov      w9, #0x98
    eor      w8, w8, w9
    strb     w8, [x24]
    ldrb     w8, [x22, #1]
    eor      w8, w8, #0x3c
    strb     w8, [x24, #1]
    ldrb     w8, [x22, #2]
    mov      w9, #0x65
    eor      w8, w8, w9
    strb     w8, [x24, #2]
    ldrb     w8, [x22, #3]
    mov      w9, #0x75
    eor      w8, w8, w9
    strb     w8, [x24, #3]
    ldrb     w8, [x22, #4]
    eor      w8, w8, #0xe
    strb     w8, [x24, #4]
    ldrb     w8, [x22, #5]
    mov      w9, #0x32
    eor      w8, w8, w9
    strb     w8, [x24, #5]
    ldrb     w8, [x22, #6]
    mov      w9, #0x3a
    eor      w8, w8, w9
    strb     w8, [x24, #6]
    ldrb     w8, [x22, #7]
    mov      w9, #0x6c
    eor      w8, w8, w9
    strb     w8, [x24, #7]
    ldrb     w8, [x22, #8]
    mov      w9, #0x4f
    eor      w8, w8, w9
    strb     w8, [x24, #8]
    ldrb     w8, [x22, #9]
    mov      w9, #0xd0
    eor      w8, w8, w9
    strb     w8, [x24, #9]
    ldrb     w8, [x22, #0xa]
    eor      w8, w8, #0xf
    strb     w8, [x24, #0xa]
    ldrb     w8, [x22, #0xb]
    mov      w9, #0x45
    eor      w8, w8, w9
    strb     w8, [x24, #0xb]
    ldrb     w8, [x22, #0xc]
    mov      w9, #0x6e
    eor      w8, w8, w9
    strb     w8, [x24, #0xc]
    ldrb     w8, [x22, #0xd]
    mov      w9, #5
    eor      w8, w8, w9
    strb     w8, [x24, #0xd]
    ldrb     w8, [x22, #0xe]
    mov      w9, #0x1b
    eor      w8, w8, w9
    strb     w8, [x24, #0xe]
    ldrb     w8, [x22, #0xf]
    mov      w9, #0x5c
    eor      w8, w8, w9
    strb     w8, [x24, #0xf]
    ldrb     w8, [x22, #0x10]
    mov      w9, #0x8a
    eor      w8, w8, w9
    strb     w8, [x24, #0x10]
    ldrb     w8, [x22, #0x11]
    eor      w8, w8, #0x60
    strb     w8, [x24, #0x11]
    ldrb     w8, [x22, #0x12]
    mov      w9, #0xa8
    eor      w8, w8, w9
    strb     w8, [x24, #0x12]
    ldrb     w8, [x22, #0x13]
    eor      w8, w8, #0xffffffe3
    strb     w8, [x24, #0x13]
    ldrb     w8, [x22, #0x14]
    eor      w8, w8, #0xe0
    strb     w8, [sp, #0x4a]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xa4a8
    movk     w9, #0xcf50, lsl #16
    str      w9, [x8]
    b        #0x359be8
    mov      w9, #0xae21
    movk     w9, #0xb0da, lsl #16
    cmp      w8, w9
    b.ne     #0x359be8
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    add      sp, sp, #0xb0
    ret      

// -[WCLGHomeGroups effectiveEnabled] IMP=0x35A1C4 bounds=0x35A1C4-0x35A3F0
loc_35A1C4:
    sub      sp, sp, #0xb0
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      x19, x0
    mov      w20, #0x97ff
    movk     w20, #0x7bc, lsl #16
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xed0]
    str      x8, [sp, #0x48]
    mov      w8, #0xc220
    movk     w8, #0x5ca1, lsl #16
    str      w8, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w22, #0x97fe
    movk     w22, #0x7bc, lsl #16
    mov      w23, #0x40
    movk     w23, #0xbc48, lsl #16
    mov      w24, #0xf905
    movk     w24, #0x926c, lsl #16
    mov      w28, #0x41
    movk     w28, #0xbc48, lsl #16
    mov      w25, #0x1e99
    movk     w25, #0xd2f9, lsl #16
    mov      w21, #0xdefd
    movk     w21, #0x4e93, lsl #16
    mov      w26, #0xe59f
    movk     w26, #0x1f56, lsl #16
    mov      w27, #0xdefe
    movk     w27, #0x4e93, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w22
    b.le     #0x35a294
    cmp      w8, w21
    b.gt     #0x35a2d8
    cmp      w8, w26
    b.eq     #0x35a3a8
    mov      w9, #0x762
    movk     w9, #0x27fc, lsl #16
    cmp      w8, w9
    b.ne     #0x35a3c4
    ldr      x0, [sp, #0x38]
    bl       #0x461d74 // _os_unfair_lock_unlock
    ldrb     w8, [sp, #0x2f]
    cmp      w8, #0
    csel     w8, w20, w26, ne
    b        #0x35a340
    cmp      w8, w23
    b.gt     #0x35a30c
    cmp      w8, w24
    b.eq     #0x35a350
    mov      w9, #0xa9a1
    movk     w9, #0xa348, lsl #16
    cmp      w8, w9
    b.ne     #0x35a250
    ldr      x8, [sp, #0x30]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [sp, #0x2f]
    ldr      x8, [sp, #8]
    mov      w9, #0x762
    movk     w9, #0x27fc, lsl #16
    str      w9, [x8]
    b        #0x35a250
    cmp      w8, w27
    b.eq     #0x35a334
    mov      w9, #0xc220
    movk     w9, #0x5ca1, lsl #16
    cmp      w8, w9
    b.ne     #0x35a250
    ldr      x1, [sp, #0x48]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x47]
    ldr      x8, [sp, #8]
    str      w27, [x8]
    b        #0x35a250
    cmp      w8, w28
    b.eq     #0x35a384
    cmp      w8, w25
    b.ne     #0x35a250
    ldr      x0, [sp, #0x20]
    bl       #0xd6040
    str      w0, [sp, #0x1c]
    ldr      x8, [sp, #8]
    str      w28, [x8]
    b        #0x35a250
    ldrb     w8, [sp, #0x47]
    cmp      w8, #0
    csel     w8, w24, w20, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    strb     wzr, [sp, #0x1b]
    b        #0x35a250
    add      x0, x19, #8
    str      x0, [sp, #0x38]
    bl       #0x461d68 // _os_unfair_lock_lock
    ldr      x0, [x19, #0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x30]
    ldr      x8, [sp, #8]
    mov      w9, #0xa9a1
    movk     w9, #0xa348, lsl #16
    str      w9, [x8]
    b        #0x35a250
    ldr      w8, [sp, #0x1c]
    mov      w9, #0x5258
    movk     w9, #0x4735, lsl #16
    cmp      w8, w9
    cset     w8, eq
    ldr      x9, [sp, #8]
    str      w20, [x9]
    strb     w8, [sp, #0x1b]
    b        #0x35a250
    adrp     x8, #0x4a1000
    add      x8, x8, #0x830
    ldr      x8, [x8]
    str      x8, [sp, #0x20]
    ldr      x8, [sp, #8]
    str      w25, [x8]
    b        #0x35a250
    cmp      w8, w20
    b.ne     #0x35a250
    ldrb     w0, [sp, #0x1b]
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    add      sp, sp, #0xb0
    ret      

// -[WCLGHomeGroups allGroupTitle] IMP=0x35A3F0 bounds=0x35A3F0-0x35A824
loc_35A3F0:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      w20, #0x9cef
    movk     w20, #0x135a, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x348
    ldar     w8, [x8]
    mov      w9, #0xdbbe
    movk     w9, #0xa70a, lsl #16
    str      w8, [sp, #0x3c]
    add      x8, sp, #0x14
    mov      w23, #0x9cee
    movk     w23, #0x135a, lsl #16
    str      w9, [sp, #0x14]
    mov      w24, #0x2e5c
    movk     w24, #0xcd6f, lsl #16
    str      x8, [sp, #8]
    adrp     x25, #0x54d000
    add      x25, x25, #0xd90
    adrp     x28, #0x54d000
    add      x28, x28, #0xdb0
    mov      w22, #0xd00f
    movk     w22, #0x4dea, lsl #16
    adrp     x21, #0x54d000
    add      x21, x21, #0xdbc
    adrp     x27, #0x54d000
    add      x27, x27, #0xd9d
    adrp     x26, #0x54d000
    add      x26, x26, #0xd80
    adrp     x19, #0x54d000
    add      x19, x19, #0xd86
    ldr      w8, [sp, #0x14]
    cmp      w8, w23
    b.gt     #0x35a4dc
    cmp      w8, w24
    b.gt     #0x35a554
    mov      w9, #0x8596
    movk     w9, #0x8f53, lsl #16
    cmp      w8, w9
    b.eq     #0x35a718
    mov      w9, #0xdbbe
    movk     w9, #0xa70a, lsl #16
    cmp      w8, w9
    b.ne     #0x35a484
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp, #8]
    mov      w9, #0x2e5d
    movk     w9, #0xcd6f, lsl #16
    str      w9, [x8]
    b        #0x35a484
    cmp      w8, w22
    b.gt     #0x35a5c0
    cmp      w8, w20
    b.eq     #0x35a6a4
    mov      w9, #0x8770
    movk     w9, #0x462f, lsl #16
    cmp      w8, w9
    b.ne     #0x35a484
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    ldr      x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x20]
    cmp      x0, #0
    adrp     x9, #0x54d000
    add      x9, x9, #0xdf0
    csel     x0, x9, x8, eq
    str      x0, [sp, #0x18]
    bl       #0x461ca8 // _objc_retain
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0xd010
    movk     w9, #0x4dea, lsl #16
    str      w9, [x8]
    b        #0x35a484
    mov      w9, #0x2e5d
    movk     w9, #0xcd6f, lsl #16
    cmp      w8, w9
    b.eq     #0x35a7c8
    mov      w9, #0x1478
    movk     w9, #0xd4e9, lsl #16
    cmp      w8, w9
    b.ne     #0x35a484
    ldrb     w8, [sp, #0x3a]
    adrp     x9, #0x54d000
    add      x9, x9, #0xdba
    strb     w8, [x9]
    adrp     x10, #0x54d000
    add      x10, x10, #0xd9b
    ldrb     w8, [x10]
    mov      w11, #0x41
    eor      w8, w8, w11
    strb     w8, [x9, #1]
    ldrb     w8, [x10, #1]
    mov      w9, #0x57
    eor      w8, w8, w9
    strb     w8, [sp, #0x39]
    ldr      x8, [sp, #8]
    mov      w9, #0x8c15
    movk     w9, #0x624b, lsl #16
    str      w9, [x8]
    b        #0x35a484
    mov      w9, #0x8c15
    movk     w9, #0x624b, lsl #16
    cmp      w8, w9
    b.ne     #0x35a7e8
    ldrb     w8, [sp, #0x39]
    strb     w8, [x21]
    ldrb     w8, [x27]
    mov      w9, #0x5f
    eor      w8, w8, w9
    strb     w8, [x21, #1]
    ldrb     w8, [x27, #1]
    mov      w9, #0x65
    eor      w8, w8, w9
    strb     w8, [x21, #2]
    ldrb     w8, [x27, #2]
    mov      w9, #0x7a
    eor      w8, w8, w9
    strb     w8, [x21, #3]
    ldrb     w8, [x27, #3]
    eor      w8, w8, #0xf
    strb     w8, [x21, #4]
    ldrb     w8, [x27, #4]
    mov      w9, #0x82
    eor      w8, w8, w9
    strb     w8, [x21, #5]
    ldrb     w8, [x27, #5]
    strb     w8, [x21, #6]
    ldrb     w8, [x27, #6]
    mov      w9, #0x2b
    eor      w8, w8, w9
    strb     w8, [x21, #7]
    ldrb     w8, [x27, #7]
    mov      w9, #0xfa
    eor      w8, w8, w9
    strb     w8, [x21, #8]
    ldrb     w8, [x27, #8]
    mov      w9, #0xe9
    eor      w8, w8, w9
    strb     w8, [x21, #9]
    ldrb     w8, [x27, #9]
    eor      w8, w8, #0xffffff83
    strb     w8, [x21, #0xa]
    ldrh     w8, [x26]
    mov      w9, #0xa768
    eor      w8, w8, w9
    strh     w8, [x19]
    ldrh     w8, [x26, #2]
    mov      w9, #0x5be7
    eor      w8, w8, w9
    strh     w8, [x19, #2]
    ldrh     w8, [x26, #4]
    mov      w9, #0x619b
    eor      w8, w8, w9
    strh     w8, [x19, #4]
    ldr      x8, [sp, #8]
    str      w20, [x8]
    b        #0x35a484
    adrp     x8, #0x581000
    add      x8, x8, #0x348
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    adrp     x2, #0x54d000
    add      x2, x2, #0xe30
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    bl       #0x347364
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x20]
    ldr      x8, [sp, #8]
    mov      w9, #0x8770
    movk     w9, #0x462f, lsl #16
    str      w9, [x8]
    b        #0x35a484
    ldrb     w8, [x25]
    mov      w9, #0x61
    eor      w8, w8, w9
    strb     w8, [x28]
    ldrb     w8, [x25, #1]
    mov      w9, #0xb1
    eor      w8, w8, w9
    strb     w8, [x28, #1]
    ldrb     w8, [x25, #2]
    mov      w9, #0x4b
    eor      w8, w8, w9
    strb     w8, [x28, #2]
    ldrb     w8, [x25, #3]
    eor      w8, w8, #0xffffff87
    strb     w8, [x28, #3]
    ldrb     w8, [x25, #4]
    mov      w9, #0xcb
    eor      w8, w8, w9
    strb     w8, [x28, #4]
    ldrb     w8, [x25, #5]
    eor      w8, w8, #0x88888888
    strb     w8, [x28, #5]
    ldrb     w8, [x25, #6]
    mov      w9, #0xeb
    eor      w8, w8, w9
    strb     w8, [x28, #6]
    ldrb     w8, [x25, #7]
    eor      w8, w8, #0x78
    strb     w8, [x28, #7]
    ldrb     w8, [x25, #8]
    eor      w8, w8, #0x3c
    strb     w8, [x28, #8]
    ldrb     w8, [x25, #9]
    mov      w9, #0xb2
    eor      w8, w8, w9
    strb     w8, [x28, #9]
    ldrb     w8, [x25, #0xa]
    eor      w8, w8, #0xe0
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp, #8]
    mov      w9, #0x1478
    movk     w9, #0xd4e9, lsl #16
    str      w9, [x8]
    b        #0x35a484
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    mov      w8, #0x8596
    movk     w8, #0x8f53, lsl #16
    csel     w8, w8, w20, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x35a484
    mov      w9, #0xd010
    movk     w9, #0x4dea, lsl #16
    cmp      w8, w9
    b.ne     #0x35a484
    ldr      x0, [sp, #0x18]
    bl       #0x461be8 // _objc_autoreleaseReturnValue
    ldr      x0, [sp, #0x18]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    ret      

// -[WCLGHomeGroups isAllGroupTitleCustomized] IMP=0x35A824 bounds=0x35A824-0x35AD10
loc_35A824:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      w21, #0x4a50
    movk     w21, #0xdfb0, lsl #16
    mov      w22, #0xc430
    movk     w22, #0xc0, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x34c
    ldar     w8, [x8]
    str      w8, [sp, #0x2c]
    mov      w9, #0xd4a5
    movk     w9, #0x2d51, lsl #16
    add      x8, sp, #8
    str      w9, [sp, #8]
    mov      w27, #0x690c
    movk     w27, #0xe37, lsl #16
    mov      w28, #0xae0f
    movk     w28, #0xe848, lsl #16
    str      x8, [sp]
    adrp     x26, #0x54d000
    add      x26, x26, #0xe8f
    adrp     x23, #0x54d000
    add      x23, x23, #0xe70
    adrp     x20, #0x54d000
    add      x20, x20, #0xe60
    adrp     x19, #0x54d000
    add      x19, x19, #0xe80
    mov      w24, #0x9fd2
    movk     w24, #0x449b, lsl #16
    mov      w25, #0x9fd3
    movk     w25, #0x449b, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w27
    b.le     #0x35a918
    cmp      w8, w24
    b.gt     #0x35a9dc
    mov      w9, #0x690d
    movk     w9, #0xe37, lsl #16
    cmp      w8, w9
    b.eq     #0x35abe0
    mov      w9, #0xe06f
    movk     w9, #0x14f7, lsl #16
    cmp      w8, w9
    b.eq     #0x35ac78
    mov      w9, #0xd4a5
    movk     w9, #0x2d51, lsl #16
    cmp      w8, w9
    b.ne     #0x35a8b8
    ldr      w8, [sp, #0x2c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x2b]
    ldr      x8, [sp]
    str      w25, [x8]
    b        #0x35a8b8
    cmp      w8, w28
    b.le     #0x35aa18
    mov      w9, #0xae10
    movk     w9, #0xe848, lsl #16
    cmp      w8, w9
    b.eq     #0x35aafc
    mov      w9, #0xda04
    movk     w9, #0xeb12, lsl #16
    cmp      w8, w9
    b.eq     #0x35ac58
    cmp      w8, w22
    b.ne     #0x35a8b8
    adrp     x8, #0x581000
    add      x8, x8, #0x34c
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    adrp     x2, #0x54d000
    add      x2, x2, #0xf00
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    bl       #0x347364
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x20]
    mov      x0, x22
    mov      w22, #0xc430
    movk     w22, #0xc0, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      w21, #0x4a50
    movk     w21, #0xdfb0, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    mov      w9, #0xe06f
    movk     w9, #0x14f7, lsl #16
    str      w9, [x8]
    b        #0x35a8b8
    cmp      w8, w25
    b.eq     #0x35ac14
    mov      w9, #0xf3d2
    movk     w9, #0x611d, lsl #16
    cmp      w8, w9
    b.eq     #0x35aca8
    mov      w9, #0x5c04
    movk     w9, #0x7ee0, lsl #16
    cmp      w8, w9
    b.ne     #0x35a8b8
    ldr      x8, [sp]
    str      w21, [x8]
    ldrb     w8, [sp, #0xf]
    strb     w8, [sp, #0xe]
    b        #0x35a8b8
    mov      w9, #0x5d3c
    movk     w9, #0xd766, lsl #16
    cmp      w8, w9
    b.eq     #0x35ac34
    mov      w9, #0x2bd9
    movk     w9, #0xde5f, lsl #16
    cmp      w8, w9
    b.ne     #0x35acd8
    ldrb     w8, [sp, #0x2a]
    mov      w9, #0xc9
    eor      w8, w8, w9
    strb     w8, [x26]
    ldrb     w8, [x23]
    mov      w9, #0x57
    eor      w8, w8, w9
    strb     w8, [x26, #1]
    ldrb     w8, [x23, #1]
    mov      w9, #0x82
    eor      w8, w8, w9
    strb     w8, [x26, #2]
    ldrb     w8, [x23, #2]
    eor      w8, w8, #0xdddddddd
    strb     w8, [x26, #3]
    ldrb     w8, [x23, #3]
    mov      w9, #0x31
    eor      w8, w8, w9
    strb     w8, [x26, #4]
    ldrb     w8, [x23, #4]
    mov      w9, #0xc4
    eor      w8, w8, w9
    strb     w8, [x26, #5]
    ldrb     w8, [x23, #5]
    mov      w9, #0x6c
    eor      w8, w8, w9
    strb     w8, [x26, #6]
    ldrb     w8, [x23, #6]
    eor      w8, w8, #0xffffffe3
    strb     w8, [x26, #7]
    adrp     x9, #0x54d000
    add      x9, x9, #0xe50
    ldrh     w8, [x9]
    mov      w10, #0x2be4
    eor      w8, w8, w10
    adrp     x10, #0x54d000
    add      x10, x10, #0xe56
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0xac06
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w9, #0xe2c9
    eor      w8, w8, w9
    strh     w8, [x10, #4]
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x35a8b8
    ldrb     w8, [x20]
    mov      w9, #0x6e
    eor      w8, w8, w9
    strb     w8, [x19]
    ldrb     w8, [x20, #1]
    mov      w9, #0x23
    eor      w8, w8, w9
    strb     w8, [x19, #1]
    ldrb     w8, [x20, #2]
    mov      w9, #0x5b
    eor      w8, w8, w9
    strb     w8, [x19, #2]
    ldrb     w8, [x20, #3]
    mov      w9, #0x85
    eor      w8, w8, w9
    strb     w8, [x19, #3]
    ldrb     w8, [x20, #4]
    mov      w9, #0x29
    eor      w8, w8, w9
    strb     w8, [x19, #4]
    ldrb     w8, [x20, #5]
    mov      w9, #0x48
    eor      w8, w8, w9
    strb     w8, [x19, #5]
    ldrb     w8, [x20, #6]
    eor      w8, w8, #0x30
    strb     w8, [x19, #6]
    ldrb     w8, [x20, #7]
    eor      w8, w8, #0x66666666
    strb     w8, [x19, #7]
    ldrb     w8, [x20, #8]
    mov      w9, #0xd7
    eor      w8, w8, w9
    strb     w8, [x19, #8]
    ldrb     w8, [x20, #9]
    mov      w9, #0x92
    eor      w8, w8, w9
    strb     w8, [x19, #9]
    ldrb     w8, [x20, #0xa]
    mov      w9, #0x36
    eor      w8, w8, w9
    strb     w8, [x19, #0xa]
    ldrb     w8, [x20, #0xb]
    eor      w8, w8, #0xffffffbf
    strb     w8, [x19, #0xb]
    ldrb     w8, [x20, #0xc]
    mov      w9, #0x9b
    eor      w8, w8, w9
    strb     w8, [x19, #0xc]
    ldrb     w8, [x20, #0xd]
    eor      w8, w8, #0xffffff87
    strb     w8, [x19, #0xd]
    ldr      x8, [sp]
    mov      w9, #0x690d
    movk     w9, #0xe37, lsl #16
    str      w9, [x8]
    b        #0x35a8b8
    adrp     x9, #0x54d000
    add      x9, x9, #0xe6e
    ldrb     w8, [x9]
    eor      w8, w8, #0xc0
    adrp     x10, #0x54d000
    strb     w8, [x10, #0xe8e]
    ldrb     w8, [x9, #1]
    strb     w8, [sp, #0x2a]
    ldr      x8, [sp]
    mov      w9, #0x2bd9
    movk     w9, #0xde5f, lsl #16
    str      w9, [x8]
    b        #0x35a8b8
    ldrb     w8, [sp, #0x2b]
    cmp      w8, #0
    mov      w8, #0xae10
    movk     w8, #0xe848, lsl #16
    csel     w8, w8, w22, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x35a8b8
    ldrb     w8, [sp, #0x1f]
    cmp      w8, #0
    mov      w8, #0xda04
    movk     w8, #0xeb12, lsl #16
    csel     w8, w21, w8, ne
    ldr      x9, [sp]
    str      w8, [x9]
    strb     wzr, [sp, #0xe]
    b        #0x35a8b8
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x358]
    str      x8, [sp, #0x10]
    ldr      x8, [sp]
    mov      w9, #0xf3d2
    movk     w9, #0x611d, lsl #16
    str      w9, [x8]
    b        #0x35a8b8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    ldr      x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    cset     w8, eq
    strb     w8, [sp, #0x1f]
    ldr      x8, [sp]
    mov      w9, #0x5d3c
    movk     w9, #0xd766, lsl #16
    str      w9, [x8]
    b        #0x35a8b8
    ldr      x0, [sp, #0x20]
    ldr      x1, [sp, #0x10]
    adrp     x2, #0x54d000
    add      x2, x2, #0xec0
    bl       #0x461c6c // _objc_msgSend
    eor      w8, w0, #1
    strb     w8, [sp, #0xf]
    ldr      x8, [sp]
    mov      w9, #0x5c04
    movk     w9, #0x7ee0, lsl #16
    str      w9, [x8]
    b        #0x35a8b8
    cmp      w8, w21
    b.ne     #0x35a8b8
    ldrb     w19, [sp, #0xe]
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    ret      

// -[WCLGHomeGroups restoreAllGroupTitle] IMP=0x35AD10 bounds=0x35AD10-0x35B0B0
loc_35AD10:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    adrp     x8, #0x581000
    add      x8, x8, #0x350
    mov      w10, #0x89a2
    movk     w10, #0xf3db, lsl #16
    ldar     w8, [x8]
    str      w8, [sp, #0x2c]
    mov      w11, #0xa362
    movk     w11, #0x261, lsl #16
    add      x8, sp, #0x1c
    str      w11, [sp, #0x1c]
    mov      w25, #0xa361
    movk     w25, #0x261, lsl #16
    mov      w26, #0xf70c
    movk     w26, #0xd72d, lsl #16
    stp      x0, x8, [sp, #8]
    mov      w27, #0x5a51
    movk     w27, #0xc83d, lsl #16
    mov      w28, #0x4174
    movk     w28, #0x611a, lsl #16
    mov      w12, #0x1bd7
    movk     w12, #0xcb29, lsl #16
    mov      w20, #0x4173
    movk     w20, #0x611a, lsl #16
    mov      w13, #0xf575
    movk     w13, #0x5088, lsl #16
    adrp     x24, #0x54d000
    add      x24, x24, #0xf40
    adrp     x22, #0x54d000
    add      x22, x22, #0xf21
    mov      w15, #0x77ef
    movk     w15, #0x67b8, lsl #16
    adrp     x19, #0x54d000
    add      x19, x19, #0xf51
    adrp     x23, #0x54d000
    add      x23, x23, #0xf32
    ldr      w8, [sp, #0x1c]
    cmp      w8, w25
    b.le     #0x35aee4
    cmp      w8, w20
    b.gt     #0x35af84
    cmp      w8, w11
    b.eq     #0x35b048
    cmp      w8, w13
    b.ne     #0x35adbc
    ldrb     w8, [sp, #0x2a]
    strb     w8, [x24]
    ldrb     w8, [x22]
    mov      w9, #0x6d
    eor      w8, w8, w9
    strb     w8, [x24, #1]
    ldrb     w8, [x22, #1]
    mov      w9, #0x5e
    eor      w8, w8, w9
    strb     w8, [x24, #2]
    ldrb     w8, [x22, #2]
    mov      w9, #0x24
    eor      w8, w8, w9
    strb     w8, [x24, #3]
    ldrb     w8, [x22, #3]
    eor      w8, w8, #0xffffff8f
    strb     w8, [x24, #4]
    ldrb     w8, [x22, #4]
    mov      w9, #0x4f
    eor      w8, w8, w9
    strb     w8, [x24, #5]
    ldrb     w8, [x22, #5]
    mov      w9, #0x41
    eor      w8, w8, w9
    strb     w8, [x24, #6]
    ldrb     w8, [x22, #6]
    mov      w9, #0x5c
    eor      w8, w8, w9
    strb     w8, [x24, #7]
    ldrb     w8, [x22, #7]
    mov      w9, #0xe6
    eor      w8, w8, w9
    strb     w8, [x24, #8]
    ldrb     w8, [x22, #8]
    mov      w14, #0x2b
    eor      w8, w8, w14
    strb     w8, [x24, #9]
    ldrb     w8, [x22, #9]
    eor      w8, w8, #0xffffffc7
    strb     w8, [x24, #0xa]
    ldrb     w8, [x22, #0xa]
    mov      w14, #0x1d
    eor      w8, w8, w14
    strb     w8, [x24, #0xb]
    ldrb     w8, [x22, #0xb]
    eor      w8, w8, w9
    strb     w8, [x24, #0xc]
    ldrb     w8, [x22, #0xc]
    mov      w9, #0x21
    eor      w8, w8, w9
    strb     w8, [x24, #0xd]
    ldrb     w8, [x22, #0xd]
    eor      w8, w8, #0xffffff9f
    strb     w8, [x24, #0xe]
    ldrb     w8, [x22, #0xe]
    eor      w8, w8, #0xfffffff1
    strb     w8, [x24, #0xf]
    ldrb     w8, [x22, #0xf]
    eor      w8, w8, #8
    strb     w8, [x24, #0x10]
    ldrb     w8, [x22, #0x10]
    strb     w8, [sp, #0x29]
    ldr      x8, [sp, #0x10]
    str      w15, [x8]
    b        #0x35adbc
    cmp      w8, w26
    b.gt     #0x35b000
    cmp      w8, w27
    b.eq     #0x35b030
    cmp      w8, w12
    b.ne     #0x35adbc
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    ldr      x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    mov      x2, #0
    adrp     x3, #0x54d000
    add      x3, x3, #0xf80
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [sp, #8]
    bl       #0x461c6c // _objc_msgSend
    mov      w15, #0x77ef
    movk     w15, #0x67b8, lsl #16
    mov      w13, #0xf575
    movk     w13, #0x5088, lsl #16
    mov      w12, #0x1bd7
    movk     w12, #0xcb29, lsl #16
    mov      w11, #0xa362
    movk     w11, #0x261, lsl #16
    mov      w10, #0x89a2
    movk     w10, #0xf3db, lsl #16
    ldr      x8, [sp, #0x10]
    mov      w9, #0xf70d
    movk     w9, #0xd72d, lsl #16
    str      w9, [x8]
    b        #0x35adbc
    cmp      w8, w28
    b.eq     #0x35b064
    cmp      w8, w15
    b.ne     #0x35adbc
    ldrb     w8, [sp, #0x29]
    mov      w9, #0x31
    eor      w8, w8, w9
    strb     w8, [x19]
    ldrb     w8, [x23]
    mov      w9, #0xd3
    eor      w8, w8, w9
    strb     w8, [x19, #1]
    ldrb     w8, [x23, #1]
    mov      w9, #0x8c
    eor      w8, w8, w9
    strb     w8, [x19, #2]
    ldrb     w8, [x23, #2]
    mov      w9, #0xad
    eor      w8, w8, w9
    strb     w8, [x19, #3]
    ldrb     w8, [x23, #3]
    mov      w9, #0xd9
    eor      w8, w8, w9
    strb     w8, [x19, #4]
    ldrb     w8, [x23, #4]
    mov      w9, #0x13
    eor      w8, w8, w9
    strb     w8, [x19, #5]
    ldr      x8, [sp, #0x10]
    str      w10, [x8]
    b        #0x35adbc
    cmp      w8, w10
    b.ne     #0x35b080
    adrp     x8, #0x581000
    add      x8, x8, #0x350
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x60]
    str      x8, [sp, #0x20]
    ldr      x8, [sp, #0x10]
    str      w12, [x8]
    b        #0x35adbc
    ldrb     w8, [sp, #0x2b]
    cmp      w8, #0
    csel     w8, w28, w10, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x35adbc
    ldr      w8, [sp, #0x2c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x2b]
    ldr      x8, [sp, #0x10]
    str      w27, [x8]
    b        #0x35adbc
    adrp     x8, #0x54d000
    ldrb     w8, [x8, #0xf20]
    eor      w8, w8, #8
    strb     w8, [sp, #0x2a]
    ldr      x8, [sp, #0x10]
    str      w13, [x8]
    b        #0x35adbc
    mov      w9, #0xf70d
    movk     w9, #0xd72d, lsl #16
    cmp      w8, w9
    b.ne     #0x35adbc
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    ret      

// -[WCLGHomeGroups allGroupIndex] IMP=0x35B0B0 bounds=0x35B0B0-0x35B540
loc_35B0B0:
    sub      sp, sp, #0xb0
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      w21, #0xeedb
    movk     w21, #0x74e5, lsl #16
    mov      w10, #0xca90
    movk     w10, #0x2129, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x354
    ldar     w8, [x8]
    str      w8, [sp, #0x4c]
    mov      w8, #0x815f
    movk     w8, #0x777a, lsl #16
    str      w8, [sp, #0x14]
    add      x8, sp, #0x14
    mov      w26, #0xe805
    movk     w26, #0xd885, lsl #16
    stp      x0, x8, [sp]
    mov      w27, #0xaf1
    movk     w27, #0x9cba, lsl #16
    adrp     x19, #0x54d000
    add      x19, x19, #0xfa1
    adrp     x24, #0x54d000
    add      x24, x24, #0xfc1
    mov      w20, #0xe806
    movk     w20, #0xd885, lsl #16
    mov      w22, #0xaf2
    movk     w22, #0x9cba, lsl #16
    mov      w28, #0xd6f2
    movk     w28, #0x4e2d, lsl #16
    adrp     x25, #0x54d000
    add      x25, x25, #0xfb3
    adrp     x23, #0x54d000
    add      x23, x23, #0xfd3
    ldr      w8, [sp, #0x14]
    cmp      w8, w26
    b.le     #0x35b208
    cmp      w8, w28
    b.gt     #0x35b260
    cmp      w8, w20
    b.eq     #0x35b464
    cmp      w8, w10
    b.eq     #0x35b3ec
    mov      w9, #0x5a32
    movk     w9, #0x3aab, lsl #16
    cmp      w8, w9
    b.ne     #0x35b14c
    ldp      x1, x0, [sp, #0x38]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    adrp     x2, #0x54e000
    add      x2, x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x30]
    mov      x0, x21
    mov      w21, #0xeedb
    movk     w21, #0x74e5, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x2, [x8, #0x4e8]
    str      x2, [sp, #0x28]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    ldr      x0, [sp, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      w10, #0xca90
    movk     w10, #0x2129, lsl #16
    cmp      w0, #0
    ldr      x8, [sp, #8]
    mov      w9, #0xd6f3
    movk     w9, #0x4e2d, lsl #16
    csel     w9, w9, w21, ne
    str      w9, [x8]
    str      xzr, [sp, #0x18]
    b        #0x35b14c
    cmp      w8, w27
    b.le     #0x35b29c
    cmp      w8, w22
    b.eq     #0x35b4a8
    mov      w9, #0x23e9
    movk     w9, #0xc1c3, lsl #16
    cmp      w8, w9
    b.eq     #0x35b41c
    mov      w9, #0x9c22
    movk     w9, #0xc491, lsl #16
    cmp      w8, w9
    b.ne     #0x35b14c
    adrp     x8, #0x54d000
    ldrb     w8, [x8, #0xfa0]
    eor      w8, w8, #0xffffffef
    adrp     x9, #0x54d000
    strb     w8, [x9, #0xfc0]
    ldr      x8, [sp, #8]
    mov      w9, #0xe471
    movk     w9, #0x8fea, lsl #16
    str      w9, [x8]
    b        #0x35b14c
    mov      w9, #0xd6f3
    movk     w9, #0x4e2d, lsl #16
    cmp      w8, w9
    b.eq     #0x35b43c
    mov      w9, #0x815f
    movk     w9, #0x777a, lsl #16
    cmp      w8, w9
    b.ne     #0x35b4c8
    ldr      w8, [sp, #0x4c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x4b]
    ldr      x8, [sp, #8]
    str      w22, [x8]
    b        #0x35b14c
    mov      w9, #0xe471
    movk     w9, #0x8fea, lsl #16
    cmp      w8, w9
    b.eq     #0x35b2d0
    mov      w9, #0xb608
    movk     w9, #0x9b94, lsl #16
    cmp      w8, w9
    b.ne     #0x35b14c
    ldr      x8, [sp, #8]
    str      w21, [x8]
    ldr      x8, [sp, #0x20]
    str      x8, [sp, #0x18]
    b        #0x35b14c
    ldrb     w8, [x19]
    mov      w9, #0x8c
    eor      w8, w8, w9
    strb     w8, [x24]
    ldrb     w8, [x19, #1]
    mov      w9, #0x29
    eor      w8, w8, w9
    strb     w8, [x24, #1]
    ldrb     w8, [x19, #2]
    mov      w9, #0xb5
    eor      w8, w8, w9
    strb     w8, [x24, #2]
    ldrb     w8, [x19, #3]
    eor      w8, w8, #0x78
    strb     w8, [x24, #3]
    ldrb     w8, [x19, #4]
    eor      w8, w8, #0x1f
    strb     w8, [x24, #4]
    ldrb     w8, [x19, #5]
    mov      w9, #0x3b
    eor      w8, w8, w9
    strb     w8, [x24, #5]
    ldrb     w8, [x19, #6]
    mov      w9, #0xed
    eor      w8, w8, w9
    strb     w8, [x24, #6]
    ldrb     w8, [x19, #7]
    mov      w9, #0x9d
    eor      w8, w8, w9
    strb     w8, [x24, #7]
    ldrb     w8, [x19, #8]
    eor      w8, w8, #0x1f
    strb     w8, [x24, #8]
    ldrb     w8, [x19, #9]
    mov      w9, #0xe8
    eor      w8, w8, w9
    strb     w8, [x24, #9]
    ldrb     w8, [x19, #0xa]
    mov      w9, #0x8b
    eor      w8, w8, w9
    strb     w8, [x24, #0xa]
    ldrb     w8, [x19, #0xb]
    mov      w9, #0xd6
    eor      w8, w8, w9
    strb     w8, [x24, #0xb]
    ldrb     w8, [x19, #0xc]
    eor      w8, w8, #0x7c
    strb     w8, [x24, #0xc]
    ldrb     w8, [x19, #0xd]
    mov      w9, #0x9a
    eor      w8, w8, w9
    strb     w8, [x24, #0xd]
    ldrb     w8, [x19, #0xe]
    mov      w9, #0x98
    eor      w8, w8, w9
    strb     w8, [x24, #0xe]
    ldrb     w8, [x19, #0xf]
    mov      w9, #0x90
    eor      w8, w8, w9
    strb     w8, [x24, #0xf]
    ldrb     w8, [x19, #0x10]
    mov      w9, #0x8a
    eor      w8, w8, w9
    strb     w8, [x24, #0x10]
    ldrb     w8, [x19, #0x11]
    mov      w9, #0xe6
    eor      w8, w8, w9
    strb     w8, [x24, #0x11]
    ldr      x8, [sp, #8]
    str      w20, [x8]
    b        #0x35b14c
    adrp     x8, #0x581000
    add      x8, x8, #0x354
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x60]
    str      x8, [sp, #0x40]
    ldr      x8, [sp, #8]
    mov      w9, #0x23e9
    movk     w9, #0xc1c3, lsl #16
    str      w9, [x8]
    b        #0x35b14c
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x308]
    str      x8, [sp, #0x38]
    ldr      x8, [sp, #8]
    mov      w9, #0x5a32
    movk     w9, #0x3aab, lsl #16
    str      w9, [x8]
    b        #0x35b14c
    ldp      x1, x0, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    mov      w10, #0xca90
    movk     w10, #0x2129, lsl #16
    str      x0, [sp, #0x20]
    ldr      x8, [sp, #8]
    mov      w9, #0xb608
    movk     w9, #0x9b94, lsl #16
    str      w9, [x8]
    b        #0x35b14c
    ldrb     w8, [x25]
    eor      w8, w8, #0x60
    strb     w8, [x23]
    ldrb     w8, [x25, #1]
    eor      w8, w8, #0x22222222
    strb     w8, [x23, #1]
    ldrb     w8, [x25, #2]
    mov      w9, #0xb3
    eor      w8, w8, w9
    strb     w8, [x23, #2]
    ldrb     w8, [x25, #3]
    mov      w9, #0xb6
    eor      w8, w8, w9
    strb     w8, [x23, #3]
    ldr      x8, [sp, #8]
    str      w10, [x8]
    b        #0x35b14c
    ldrb     w8, [sp, #0x4b]
    cmp      w8, #0
    mov      w8, #0x9c22
    movk     w8, #0xc491, lsl #16
    csel     w8, w8, w10, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x35b14c
    cmp      w8, w21
    b.ne     #0x35b14c
    ldr      x21, [sp, #0x18]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xed8]
    ldr      x0, [sp]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cmp      x20, x21
    csel     x8, x20, x21, lt
    bic      x19, x8, x8, asr #63
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    add      sp, sp, #0xb0
    ret      

// -[WCLGHomeGroups setAllGroupIndex:] IMP=0x35B540 bounds=0x35B540-0x35B954
loc_35B540:
    sub      sp, sp, #0xb0
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      x19, x2
    mov      w21, #0x1a17
    movk     w21, #0xc73a, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x358
    ldar     w8, [x8]
    str      w8, [sp, #0x4c]
    mov      w8, #0x3afd
    movk     w8, #0xac21, lsl #16
    str      w8, [sp, #0x1c]
    add      x8, sp, #0x1c
    mov      w25, #0x83f4
    movk     w25, #0xced6, lsl #16
    stp      x0, x8, [sp, #8]
    mov      w26, #0x1e0a
    movk     w26, #0xb4d6, lsl #16
    adrp     x23, #0x54e000
    add      x23, x23, #0x52
    adrp     x28, #0x54e000
    add      x28, x28, #0x33
    mov      w20, #0x1e0b
    movk     w20, #0xb4d6, lsl #16
    mov      w22, #0xce66
    movk     w22, #0x5aad, lsl #16
    adrp     x27, #0x54e000
    add      x27, x27, #0x20
    adrp     x24, #0x54e000
    add      x24, x24, #0x40
    ldr      w8, [sp, #0x1c]
    cmp      w8, w25
    b.gt     #0x35b628
    cmp      w8, w26
    b.gt     #0x35b6ac
    mov      w9, #0xac2b
    movk     w9, #0x8cc2, lsl #16
    cmp      w8, w9
    b.eq     #0x35b840
    mov      w9, #0x3afd
    movk     w9, #0xac21, lsl #16
    cmp      w8, w9
    b.ne     #0x35b5d0
    ldr      w8, [sp, #0x4c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x4b]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x83f5
    movk     w9, #0xced6, lsl #16
    str      w9, [x8]
    b        #0x35b5d0
    cmp      w8, w22
    b.gt     #0x35b71c
    mov      w9, #0x83f5
    movk     w9, #0xced6, lsl #16
    cmp      w8, w9
    b.eq     #0x35b820
    mov      w9, #0xb379
    movk     w9, #0x4edb, lsl #16
    cmp      w8, w9
    b.ne     #0x35b5d0
    ldr      x8, [sp, #0x40]
    cmp      x8, x19
    csel     x8, x8, x19, lt
    bic      x8, x8, x8, asr #63
    str      x8, [sp, #0x38]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0xa8]
    stp      x8, x0, [sp, #0x28]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x4f0]
    str      x8, [sp, #0x20]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xce67
    movk     w9, #0x5aad, lsl #16
    str      w9, [x8]
    b        #0x35b5d0
    cmp      w8, w20
    b.eq     #0x35b898
    cmp      w8, w21
    b.ne     #0x35b5d0
    adrp     x8, #0x581000
    add      x8, x8, #0x358
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xed8]
    ldr      x0, [sp, #8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x40]
    mov      x0, x21
    mov      w21, #0x1a17
    movk     w21, #0xc73a, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    mov      w9, #0xb379
    movk     w9, #0x4edb, lsl #16
    str      w9, [x8]
    b        #0x35b5d0
    mov      w9, #0x9687
    movk     w9, #0x6824, lsl #16
    cmp      w8, w9
    b.ne     #0x35b8e4
    ldrb     w8, [x27]
    mov      w9, #0x58
    eor      w8, w8, w9
    strb     w8, [x24]
    ldrb     w8, [x27, #1]
    mov      w9, #0xa6
    eor      w8, w8, w9
    strb     w8, [x24, #1]
    ldrb     w8, [x27, #2]
    eor      w8, w8, #8
    strb     w8, [x24, #2]
    ldrb     w8, [x27, #3]
    eor      w8, w8, #0xfffffff9
    strb     w8, [x24, #3]
    ldrb     w8, [x27, #4]
    mov      w9, #0x13
    eor      w8, w8, w9
    strb     w8, [x24, #4]
    ldrb     w8, [x27, #5]
    mov      w9, #0x91
    eor      w8, w8, w9
    strb     w8, [x24, #5]
    ldrb     w8, [x27, #6]
    mov      w9, #0xe9
    eor      w8, w8, w9
    strb     w8, [x24, #6]
    ldrb     w8, [x27, #7]
    mov      w9, #0x4d
    eor      w8, w8, w9
    strb     w8, [x24, #7]
    ldrb     w8, [x27, #8]
    mov      w9, #0x72
    eor      w8, w8, w9
    strb     w8, [x24, #8]
    ldrb     w8, [x27, #9]
    eor      w8, w8, #0xbbbbbbbb
    strb     w8, [x24, #9]
    ldrb     w8, [x27, #0xa]
    mov      w9, #0xdc
    eor      w8, w8, w9
    strb     w8, [x24, #0xa]
    ldrb     w8, [x27, #0xb]
    eor      w8, w8, #0x77777777
    strb     w8, [x24, #0xb]
    ldrb     w8, [x27, #0xc]
    mov      w9, #0x12
    eor      w8, w8, w9
    strb     w8, [x24, #0xc]
    ldrb     w8, [x27, #0xd]
    eor      w8, w8, #0xffffff9f
    strb     w8, [x24, #0xd]
    ldrb     w8, [x27, #0xe]
    eor      w8, w8, #0xffffffc7
    strb     w8, [x24, #0xe]
    ldrb     w8, [x27, #0xf]
    mov      w9, #0x6d
    eor      w8, w8, w9
    strb     w8, [sp, #0x4a]
    ldr      x8, [sp, #0x10]
    str      w20, [x8]
    b        #0x35b5d0
    ldrb     w8, [sp, #0x4b]
    cmp      w8, #0
    mov      w8, #0x9687
    movk     w8, #0x6824, lsl #16
    csel     w8, w8, w21, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x35b5d0
    ldrb     w8, [sp, #0x49]
    mov      w9, #0x62
    eor      w8, w8, w9
    strb     w8, [x23]
    ldrb     w8, [x28]
    mov      w9, #0x48
    eor      w8, w8, w9
    strb     w8, [x23, #1]
    ldrb     w8, [x28, #1]
    mov      w9, #0xb4
    eor      w8, w8, w9
    strb     w8, [x23, #2]
    ldrb     w8, [x28, #2]
    eor      w8, w8, #0x99999999
    strb     w8, [x23, #3]
    ldrb     w8, [x28, #3]
    mov      w9, #0x32
    eor      w8, w8, w9
    strb     w8, [x23, #4]
    ldr      x8, [sp, #0x10]
    str      w21, [x8]
    b        #0x35b5d0
    ldrb     w8, [sp, #0x4a]
    adrp     x9, #0x54e000
    add      x9, x9, #0x4f
    strb     w8, [x9]
    adrp     x10, #0x54e000
    add      x10, x10, #0x30
    ldrb     w8, [x10]
    eor      w8, w8, #0xffffffcf
    strb     w8, [x9, #1]
    ldrb     w8, [x10, #1]
    eor      w8, w8, #2
    strb     w8, [x9, #2]
    ldrb     w8, [x10, #2]
    strb     w8, [sp, #0x49]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xac2b
    movk     w9, #0x8cc2, lsl #16
    str      w9, [x8]
    b        #0x35b5d0
    mov      w9, #0xce67
    movk     w9, #0x5aad, lsl #16
    cmp      w8, w9
    b.ne     #0x35b5d0
    ldr      x2, [sp, #0x38]
    ldp      x1, x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    ldr      x0, [sp, #0x30]
    adrp     x3, #0x54e000
    add      x3, x3, #0x80
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x30]
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    add      sp, sp, #0xb0
    b        #0x461c9c // _objc_release

// -[WCLGHomeGroups allGroup] IMP=0x35B954 bounds=0x35B954-0x35BC70
loc_35B954:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      w21, #0xfe66
    movk     w21, #0x122b, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x35c
    ldar     w8, [x8]
    str      w8, [sp, #0x2c]
    mov      w9, #0x1d3e
    movk     w9, #0x8c35, lsl #16
    add      x8, sp, #0x14
    str      w9, [sp, #0x14]
    mov      w24, #0xfe65
    movk     w24, #0x122b, lsl #16
    mov      w25, #0x4ed7
    movk     w25, #0xe7c7, lsl #16
    stp      x0, x8, [sp]
    adrp     x28, #0x54e000
    add      x28, x28, #0xa0
    adrp     x22, #0x54e000
    add      x22, x22, #0xad
    mov      w20, #0x92c2
    movk     w20, #0x739c, lsl #16
    mov      w19, #0x4ed8
    movk     w19, #0xe7c7, lsl #16
    mov      w23, #0x796c
    movk     w23, #0xf339, lsl #16
    mov      w26, #0x3204
    movk     w26, #0x4f2d, lsl #16
    adrp     x27, #0x54e000
    add      x27, x27, #0xb7
    ldr      w8, [sp, #0x14]
    cmp      w8, w24
    b.gt     #0x35bac8
    cmp      w8, w25
    b.gt     #0x35bb08
    mov      w9, #0x1d3e
    movk     w9, #0x8c35, lsl #16
    cmp      w8, w9
    b.eq     #0x35bbe0
    mov      w9, #0x1e0
    movk     w9, #0xaef5, lsl #16
    cmp      w8, w9
    b.ne     #0x35b9e8
    ldrb     w8, [x28]
    mov      w9, #0x28
    eor      w8, w8, w9
    strb     w8, [x22]
    ldrb     w8, [x28, #1]
    mov      w9, #0x57
    eor      w8, w8, w9
    strb     w8, [x22, #1]
    ldrb     w8, [x28, #2]
    eor      w8, w8, #0x38
    strb     w8, [x22, #2]
    ldrb     w8, [x28, #3]
    mov      w9, #0x58
    eor      w8, w8, w9
    strb     w8, [x22, #3]
    ldrb     w8, [x28, #4]
    mov      w9, #0xbe
    eor      w8, w8, w9
    strb     w8, [x22, #4]
    ldrb     w8, [x28, #5]
    mov      w9, #0x1b
    eor      w8, w8, w9
    strb     w8, [x22, #5]
    ldrb     w8, [x28, #6]
    eor      w8, w8, #0xffffffbf
    strb     w8, [x22, #6]
    ldrb     w8, [x28, #7]
    mov      w9, #0xcd
    eor      w8, w8, w9
    strb     w8, [x22, #7]
    ldrb     w8, [x28, #8]
    mov      w9, #0xb8
    eor      w8, w8, w9
    strb     w8, [x22, #8]
    ldrb     w8, [x28, #9]
    mov      w9, #0x29
    eor      w8, w8, w9
    strb     w8, [x22, #9]
    ldrb     w8, [x28, #0xa]
    strb     w8, [sp, #0x2a]
    ldr      x8, [sp, #8]
    str      w20, [x8]
    b        #0x35b9e8
    cmp      w8, w26
    b.gt     #0x35bb3c
    cmp      w8, w21
    b.eq     #0x35bb84
    mov      w9, #0x1d21
    movk     w9, #0x4698, lsl #16
    cmp      w8, w9
    b.ne     #0x35b9e8
    ldrb     w8, [sp, #0x2b]
    cmp      w8, #0
    mov      w8, #0x1e0
    movk     w8, #0xaef5, lsl #16
    csel     w8, w8, w21, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x35b9e8
    cmp      w8, w19
    b.eq     #0x35bc04
    cmp      w8, w23
    b.ne     #0x35b9e8
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb80]
    ldp      x2, x0, [sp, #0x18]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    mov      w9, #0x3205
    movk     w9, #0x4f2d, lsl #16
    str      w9, [x8]
    b        #0x35b9e8
    cmp      w8, w20
    b.ne     #0x35bc10
    ldrb     w8, [sp, #0x2a]
    mov      w9, #0xdc
    eor      w8, w8, w9
    strb     w8, [x27]
    adrp     x9, #0x54e000
    add      x9, x9, #0xab
    ldrb     w8, [x9]
    eor      w8, w8, #0xffffffe1
    strb     w8, [x27, #1]
    ldrb     w8, [x9, #1]
    mov      w9, #0x8a
    eor      w8, w8, w9
    strb     w8, [x27, #2]
    ldr      x8, [sp, #8]
    str      w19, [x8]
    b        #0x35b9e8
    adrp     x8, #0x581000
    add      x8, x8, #0x35c
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x5f8]
    bl       #0x461bac // _objc_alloc_init
    str      x0, [sp, #0x20]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x888]
    adrp     x2, #0x54e000
    add      x2, x2, #0xe0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf38]
    ldr      x0, [sp]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x18]
    ldr      x8, [sp, #8]
    str      w23, [x8]
    b        #0x35b9e8
    ldr      w8, [sp, #0x2c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x2b]
    ldr      x8, [sp, #8]
    mov      w9, #0x1d21
    movk     w9, #0x4698, lsl #16
    str      w9, [x8]
    b        #0x35b9e8
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x35b9e8
    mov      w9, #0x3205
    movk     w9, #0x4f2d, lsl #16
    cmp      w8, w9
    b.ne     #0x35b9e8
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x2d8]
    ldr      x2, [x8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xee8]
    ldr      x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x20]
    bl       #0x461be8 // _objc_autoreleaseReturnValue
    ldr      x0, [sp, #0x20]
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    ret      

// -[WCLGHomeGroups customGroups] IMP=0x35BC70 bounds=0x35BC70-0x35BD18
loc_35BC70:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    add      x8, x0, #8
    str      x8, [sp, #0x18]
    mov      w20, #0x5020
    movk     w20, #0x33af, lsl #16
    str      w20, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w21, #0x8aff
    movk     w21, #0x26fd, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w20
    b.eq     #0x35bcc4
    cmp      w8, w21
    b.ne     #0x35bcac
    b        #0x35bce0
    ldr      x0, [sp, #0x18]
    bl       #0x461d68 // _os_unfair_lock_lock
    add      x8, x19, #0x10
    str      x8, [sp, #0x10]
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x35bcac
    ldr      x8, [sp, #0x10]
    ldr      x0, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    ldr      x0, [sp, #0x18]
    bl       #0x461d74 // _os_unfair_lock_unlock
    mov      x0, x19
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGHomeGroups displayGroups] IMP=0x35BD18 bounds=0x35BD18-0x35BF68
loc_35BD18:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      x19, x0
    mov      w21, #0x3a97
    movk     w21, #0x5d32, lsl #16
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xed8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      w20, #0xb570
    movk     w20, #0xf2ce, lsl #16
    str      x0, [sp, #0x38]
    add      x8, sp, #0xc
    mov      w23, #0x3a96
    movk     w23, #0x5d32, lsl #16
    str      w20, [sp, #0xc]
    mov      w24, #0xb56f
    movk     w24, #0xf2ce, lsl #16
    str      x8, [sp]
    mov      w27, #0xeea6
    movk     w27, #0x737d, lsl #16
    mov      w26, #0xd516
    movk     w26, #0x2fd8, lsl #16
    mov      w28, #0x933a
    movk     w28, #0x79f7, lsl #16
    mov      w22, #0xb33d
    movk     w22, #0x755c, lsl #16
    mov      w25, #0xb33e
    movk     w25, #0x755c, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w23
    b.le     #0x35be14
    cmp      w8, w22
    b.gt     #0x35be5c
    cmp      w8, w21
    b.eq     #0x35bef0
    cmp      w8, w27
    b.ne     #0x35bda8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    ldr      x0, [sp, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf48]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x20, x0
    csel     x8, x20, x0, lt
    mov      w20, #0xb570
    movk     w20, #0xf2ce, lsl #16
    bic      x8, x8, x8, asr #63
    str      x8, [sp, #0x28]
    ldr      x8, [sp]
    str      w26, [x8]
    b        #0x35bda8
    cmp      w8, w24
    b.le     #0x35be8c
    cmp      w8, w20
    b.eq     #0x35bec0
    cmp      w8, w26
    b.ne     #0x35bda8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf50]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0x5f0]
    stp      x8, x0, [sp, #0x18]
    ldr      x8, [sp]
    str      w28, [x8]
    b        #0x35bda8
    cmp      w8, w25
    b.eq     #0x35bf18
    cmp      w8, w28
    b.ne     #0x35bda8
    ldp      x3, x0, [sp, #0x28]
    ldp      x1, x2, [sp, #0x18]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x35bda8
    mov      w9, #0xe5ba
    movk     w9, #0xc76d, lsl #16
    cmp      w8, w9
    b.ne     #0x35bf34
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf40]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    csel     w8, w21, w27, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x35bda8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x360]
    ldr      x0, [sp, #0x38]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x30]
    ldr      x0, [sp, #0x38]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    mov      w9, #0xe5ba
    movk     w9, #0xc76d, lsl #16
    str      w9, [x8]
    b        #0x35bda8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    ldr      x0, [sp, #0x30]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x10]
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    str      w25, [x8]
    b        #0x35bda8
    ldr      x0, [sp, #0x10]
    bl       #0x461be8 // _objc_autoreleaseReturnValue
    ldr      x8, [sp]
    mov      w9, #0x5dd3
    movk     w9, #0xea42, lsl #16
    str      w9, [x8]
    b        #0x35bda8
    mov      w9, #0x5dd3
    movk     w9, #0xea42, lsl #16
    cmp      w8, w9
    b.ne     #0x35bda8
    ldr      x0, [sp, #0x10]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    ret      

// -[WCLGHomeGroups groupForID:] IMP=0x35BF68 bounds=0x35BF68-0x35C9FC
loc_35BF68:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0xf0
    mov      x23, x2
    mov      x22, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    mov      w20, #0x13e4
    movk     w20, #0xe53e, lsl #16
    mov      w26, #0x5ec1
    movk     w26, #0xe3df, lsl #16
    stur     x8, [x29, #-0x60]
    adrp     x8, #0x581000
    add      x8, x8, #0x368
    ldar     w8, [x8]
    stur     w8, [x29, #-0x64]
    mov      w8, #0x8596
    movk     w8, #0x49b5, lsl #16
    sub      x9, x29, #0x2c
    stur     w8, [x9, #-0x100]
    sub      x8, x29, #0x12c
    sub      x9, x29, #0x38
    stur     x8, [x9, #-0x100]
    mov      w24, #0x5765
    movk     w24, #0x988, lsl #16
    mov      w27, #0x876a
    movk     w27, #0xd05b, lsl #16
    mov      w28, #0x4cf6
    movk     w28, #0xe9f4, lsl #16
    mov      w25, #0x1e43
    movk     w25, #0x2e02, lsl #16
    mov      w19, #0x7d9b
    movk     w19, #0x1c04, lsl #16
    mov      w21, #0x5315
    movk     w21, #0x3d9e, lsl #16
    sub      x8, x29, #0x2c
    ldur     w8, [x8, #-0x100]
    cmp      w8, w24
    b.le     #0x35c094
    cmp      w8, w25
    b.gt     #0x35c114
    cmp      w8, w19
    b.le     #0x35c1e4
    mov      w9, #0x22e0
    movk     w9, #0x1f9e, lsl #16
    cmp      w8, w9
    b.le     #0x35c42c
    mov      w9, #0x22e1
    movk     w9, #0x1f9e, lsl #16
    cmp      w8, w9
    b.eq     #0x35c934
    mov      w9, #0x9df2
    movk     w9, #0x24a4, lsl #16
    cmp      w8, w9
    b.eq     #0x35c86c
    mov      w9, #0x23ec
    movk     w9, #0x2b76, lsl #16
    cmp      w8, w9
    b.ne     #0x35c00c
    sub      x8, x29, #0x28
    ldur     x8, [x8, #-0x100]
    add      x8, x8, #1
    stur     x8, [x29, #-0xe8]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x1acf
    movk     w9, #0x3067, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    cmp      w8, w27
    b.le     #0x35c184
    cmp      w8, w28
    b.le     #0x35c2bc
    mov      w9, #0x9d3c
    movk     w9, #0xf09c, lsl #16
    cmp      w8, w9
    b.le     #0x35c4e8
    mov      w9, #0x9d3d
    movk     w9, #0xf09c, lsl #16
    cmp      w8, w9
    b.eq     #0x35c984
    mov      w9, #0x57db
    movk     w9, #0x444, lsl #16
    cmp      w8, w9
    b.eq     #0x35c914
    mov      w9, #0xe712
    movk     w9, #0x5c4, lsl #16
    cmp      w8, w9
    b.ne     #0x35c00c
    ldurb    w8, [x29, #-0xf9]
    cmp      w8, #0
    mov      w8, #0x98b6
    movk     w8, #0x5682, lsl #16
    mov      w9, #0x7d9c
    movk     w9, #0x1c04, lsl #16
    csel     w8, w8, w9, ne
    sub      x9, x29, #0x38
    ldur     x9, [x9, #-0x100]
    str      w8, [x9]
    ldur     x8, [x29, #-0xf8]
    b        #0x35c390
    cmp      w8, w21
    b.le     #0x35c25c
    mov      w9, #0x8595
    movk     w9, #0x49b5, lsl #16
    cmp      w8, w9
    b.le     #0x35c45c
    mov      w9, #0x8cff
    movk     w9, #0x5715, lsl #16
    cmp      w8, w9
    b.eq     #0x35c958
    mov      w9, #0x98b6
    movk     w9, #0x5682, lsl #16
    cmp      w8, w9
    b.eq     #0x35c8a0
    mov      w9, #0x8596
    movk     w9, #0x49b5, lsl #16
    cmp      w8, w9
    b.ne     #0x35c00c
    ldur     w8, [x29, #-0x64]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x65]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x12f0
    movk     w9, #0xe4d, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    mov      w9, #0xd09
    movk     w9, #0x96d7, lsl #16
    cmp      w8, w9
    b.le     #0x35c30c
    mov      w9, #0x4e2d
    movk     w9, #0xa3a1, lsl #16
    cmp      w8, w9
    b.le     #0x35c528
    mov      w9, #0x4e2e
    movk     w9, #0xa3a1, lsl #16
    cmp      w8, w9
    b.eq     #0x35c8c0
    mov      w9, #0x25ea
    movk     w9, #0xc317, lsl #16
    cmp      w8, w9
    b.ne     #0x35c99c
    ldur     x0, [x29, #-0x98]
    bl       #0x461c24 // _objc_enumerationMutation
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0xcda1
    movk     w9, #0x1d32, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    mov      w9, #0x12ef
    movk     w9, #0xe4d, lsl #16
    cmp      w8, w9
    b.gt     #0x35c358
    mov      w9, #0x5766
    movk     w9, #0x988, lsl #16
    cmp      w8, w9
    b.eq     #0x35c59c
    mov      w9, #0xbf29
    movk     w9, #0xe30, lsl #16
    cmp      w8, w9
    b.ne     #0x35c00c
    sub      x8, sp, #0x80
    mov      sp, x8
    stur     x8, [x29, #-0x78]
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    stur     x1, [x29, #-0x80]
    adrp     x2, #0x54e000
    add      x2, x2, #0x140
    bl       #0x461c6c // _objc_msgSend
    sturb    w0, [x29, #-0x81]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x6ff1
    movk     w9, #0x3f78, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    mov      w9, #0x678f
    movk     w9, #0x373d, lsl #16
    cmp      w8, w9
    b.gt     #0x35c39c
    mov      w9, #0x1e44
    movk     w9, #0x2e02, lsl #16
    cmp      w8, w9
    b.eq     #0x35c5d4
    mov      w9, #0x1acf
    movk     w9, #0x3067, lsl #16
    cmp      w8, w9
    b.ne     #0x35c00c
    ldur     x8, [x29, #-0xe8]
    sub      x9, x29, #0x20
    ldur     x9, [x9, #-0x100]
    cmp      x8, x9
    cset     w8, eq
    sturb    w8, [x29, #-0xe9]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x5766
    movk     w9, #0x988, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    mov      w9, #0x5ec0
    movk     w9, #0xe3df, lsl #16
    cmp      w8, w9
    b.gt     #0x35c3e8
    mov      w9, #0x876b
    movk     w9, #0xd05b, lsl #16
    cmp      w8, w9
    b.eq     #0x35c6b0
    mov      w9, #0xb2d1
    movk     w9, #0xe1d5, lsl #16
    cmp      w8, w9
    b.ne     #0x35c00c
    ldur     x0, [x29, #-0x98]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x22e1
    movk     w9, #0x1f9e, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    mov      w9, #0xc504
    movk     w9, #0x94df, lsl #16
    cmp      w8, w9
    b.gt     #0x35c498
    mov      w9, #0x49ff
    movk     w9, #0x8028, lsl #16
    cmp      w8, w9
    b.eq     #0x35c75c
    mov      w9, #0x143
    movk     w9, #0x940c, lsl #16
    cmp      w8, w9
    b.ne     #0x35c00c
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0xd9a8
    movk     w9, #0xc577, lsl #16
    str      w9, [x8]
    ldur     x8, [x29, #-0x90]
    b        #0x35c94c
    mov      w9, #0x12f0
    movk     w9, #0xe4d, lsl #16
    cmp      w8, w9
    b.eq     #0x35c63c
    mov      w9, #0xdb61
    movk     w9, #0x117a, lsl #16
    cmp      w8, w9
    b.ne     #0x35c00c
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x7d9c
    movk     w9, #0x1c04, lsl #16
    str      w9, [x8]
    ldur     x8, [x29, #-0xa8]
    sub      x9, x29, #8
    stur     x8, [x9, #-0x100]
    b        #0x35c00c
    mov      w9, #0x6790
    movk     w9, #0x373d, lsl #16
    cmp      w8, w9
    b.eq     #0x35c654
    mov      w9, #0x69cf
    movk     w9, #0x3bfe, lsl #16
    cmp      w8, w9
    b.ne     #0x35c00c
    ldur     x8, [x29, #-0x70]
    ldr      x9, [x8, #0x10]!
    stur     x8, [x29, #-0xb8]
    ldr      x8, [x9]
    stur     x8, [x29, #-0xc0]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x876b
    movk     w9, #0xd05b, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    cmp      w8, w26
    b.eq     #0x35c6d4
    cmp      w8, w20
    b.ne     #0x35c00c
    adrp     x8, #0x581000
    add      x8, x8, #0x368
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x40
    mov      sp, x8
    stur     x8, [x29, #-0x70]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0xbf29
    movk     w9, #0xe30, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    mov      w9, #0x7d9c
    movk     w9, #0x1c04, lsl #16
    cmp      w8, w9
    b.eq     #0x35c6f8
    mov      w9, #0xcda1
    movk     w9, #0x1d32, lsl #16
    cmp      w8, w9
    b.ne     #0x35c00c
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    str      w26, [x8]
    b        #0x35c00c
    mov      w9, #0x5316
    movk     w9, #0x3d9e, lsl #16
    cmp      w8, w9
    b.eq     #0x35c734
    mov      w9, #0x6ff1
    movk     w9, #0x3f78, lsl #16
    cmp      w8, w9
    b.ne     #0x35c00c
    ldurb    w8, [x29, #-0x81]
    cmp      w8, #0
    mov      w8, #0x9df2
    movk     w8, #0x24a4, lsl #16
    mov      w9, #0x6790
    movk     w9, #0x373d, lsl #16
    b        #0x35c7a0
    mov      w9, #0xc505
    movk     w9, #0x94df, lsl #16
    cmp      w8, w9
    b.eq     #0x35c788
    mov      w9, #0x244
    movk     w9, #0x952c, lsl #16
    cmp      w8, w9
    b.ne     #0x35c00c
    sub      x8, x29, #0x10
    ldur     x8, [x8, #-0x100]
    sub      x9, x29, #0x28
    stur     x8, [x9, #-0x100]
    ldp      x9, x8, [x29, #-0xc0]
    ldr      x8, [x8]
    ldr      x8, [x8]
    cmp      x8, x9
    mov      w8, #0x25ea
    movk     w8, #0xc317, lsl #16
    csel     w8, w26, w8, eq
    b        #0x35c7a4
    mov      w9, #0x4cf7
    movk     w9, #0xe9f4, lsl #16
    cmp      w8, w9
    b.eq     #0x35c7b4
    mov      w9, #0x2c7c
    movk     w9, #0xec7c, lsl #16
    cmp      w8, w9
    b.ne     #0x35c00c
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0xd9a8
    movk     w9, #0xc577, lsl #16
    str      w9, [x8]
    sub      x8, x29, #0x18
    stur     xzr, [x8, #-0x100]
    b        #0x35c00c
    mov      w9, #0xd0a
    movk     w9, #0x96d7, lsl #16
    cmp      w8, w9
    b.eq     #0x35c844
    mov      w9, #0x9309
    movk     w9, #0x9f0d, lsl #16
    cmp      w8, w9
    b.ne     #0x35c00c
    adrp     x9, #0x54e000
    add      x9, x9, #0x100
    ldrb     w8, [x9]
    mov      w10, #0x14
    eor      w8, w8, w10
    adrp     x11, #0x54e000
    add      x11, x11, #0x10d
    strb     w8, [x11]
    ldrb     w8, [x9, #1]
    mov      w12, #0x65
    eor      w8, w8, w12
    strb     w8, [x11, #1]
    ldrb     w8, [x9, #2]
    eor      w8, w8, w10
    sturb    w8, [x29, #-0x66]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x4e2e
    movk     w9, #0xa3a1, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    ldurb    w8, [x29, #-0xe9]
    cmp      w8, #0
    mov      w8, #0x244
    movk     w8, #0x952c, lsl #16
    mov      w9, #0x8cff
    movk     w9, #0x5715, lsl #16
    csel     w8, w9, w8, ne
    sub      x9, x29, #0x38
    ldur     x9, [x9, #-0x100]
    str      w8, [x9]
    ldur     x8, [x29, #-0xe8]
    sub      x9, x29, #0x10
    stur     x8, [x9, #-0x100]
    b        #0x35c00c
    ldur     x1, [x29, #-0xd0]
    ldur     x0, [x29, #-0xe0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x22
    mov      x22, x0
    ldur     x1, [x29, #-0x80]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x23
    mov      x23, x0
    mov      x0, x22
    mov      x22, x20
    mov      w20, #0x13e4
    movk     w20, #0xe53e, lsl #16
    bl       #0x461c9c // _objc_release
    cmp      w23, #0
    mov      x23, x26
    mov      w26, #0x5ec1
    movk     w26, #0xe3df, lsl #16
    mov      w8, #0x57db
    movk     w8, #0x444, lsl #16
    mov      w9, #0x23ec
    movk     w9, #0x2b76, lsl #16
    b        #0x35c7a0
    ldurb    w8, [x29, #-0x65]
    cmp      w8, #0
    mov      w8, #0x9309
    movk     w8, #0x9f0d, lsl #16
    csel     w8, w8, w20, ne
    b        #0x35c7a4
    ldur     x8, [x29, #-0x70]
    movi     v0.16b, #0
    stp      q0, q0, [x8]
    stp      q0, q0, [x8, #0x20]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xed8]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stp      x1, x0, [x29, #-0xa0]
    ldp      x3, x2, [x29, #-0x78]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xa8]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0xd0a
    movk     w9, #0x96d7, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    ldur     x8, [x29, #-0x70]
    add      x8, x8, #8
    stur     x8, [x29, #-0xc8]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0xdb61
    movk     w9, #0x117a, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    ldur     x8, [x29, #-0xc8]
    ldr      x8, [x8]
    stur     x8, [x29, #-0xd8]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x49ff
    movk     w9, #0x8028, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    sub      x8, x29, #8
    ldur     x8, [x8, #-0x100]
    sub      x9, x29, #0x20
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xdd0]
    stur     x8, [x29, #-0xd0]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x244
    movk     w9, #0x952c, lsl #16
    str      w9, [x8]
    sub      x8, x29, #0x10
    stur     xzr, [x8, #-0x100]
    b        #0x35c00c
    ldur     x8, [x29, #-0xf8]
    cmp      x8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0xf9]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0xe712
    movk     w9, #0x5c4, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    ldur     x8, [x29, #-0xd8]
    sub      x9, x29, #0x28
    ldur     x9, [x9, #-0x100]
    ldr      x8, [x8, x9, lsl #3]
    stur     x8, [x29, #-0xe0]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x1e44
    movk     w9, #0x2e02, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    ldurb    w8, [x29, #-0xa9]
    cmp      w8, #0
    mov      w8, #0x98b6
    movk     w8, #0x5682, lsl #16
    mov      w9, #0x69cf
    movk     w9, #0x3bfe, lsl #16
    csel     w8, w8, w9, ne
    sub      x9, x29, #0x38
    ldur     x9, [x9, #-0x100]
    str      w8, [x9]
    b        #0x35c00c
    ldurb    w8, [x29, #-0x67]
    eor      w8, w8, #6
    adrp     x9, #0x54e000
    add      x9, x9, #0x112
    strb     w8, [x9]
    adrp     x10, #0x54e000
    add      x10, x10, #0x106
    ldrb     w8, [x10]
    mov      w11, #0xa9
    eor      w8, w8, w11
    strb     w8, [x9, #1]
    ldrb     w8, [x10, #1]
    mov      w11, #0x72
    eor      w8, w8, w11
    strb     w8, [x9, #2]
    ldrb     w8, [x10, #2]
    mov      w11, #0xb5
    eor      w8, w8, w11
    strb     w8, [x9, #3]
    ldrb     w8, [x10, #3]
    eor      w8, w8, #0xffffffcf
    strb     w8, [x9, #4]
    ldrb     w8, [x10, #4]
    mov      w11, #0x97
    eor      w8, w8, w11
    strb     w8, [x9, #5]
    ldrb     w8, [x10, #5]
    eor      w8, w8, #0x10
    strb     w8, [x9, #6]
    ldrb     w8, [x10, #6]
    eor      w8, w8, #0x44444444
    strb     w8, [x9, #7]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    str      w20, [x8]
    b        #0x35c00c
    ldur     x8, [x29, #-0xa8]
    cmp      x8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0xa9]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0xc505
    movk     w9, #0x94df, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf50]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x90]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x9d3d
    movk     w9, #0xf09c, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    ldur     x0, [x29, #-0x98]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x2c7c
    movk     w9, #0xec7c, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    ldurb    w8, [x29, #-0x66]
    adrp     x9, #0x54e000
    add      x9, x9, #0x10f
    strb     w8, [x9]
    adrp     x10, #0x54e000
    add      x10, x10, #0x103
    ldrb     w8, [x10]
    mov      w11, #0xda
    eor      w8, w8, w11
    strb     w8, [x9, #1]
    ldrb     w8, [x10, #1]
    eor      w8, w8, #0xf8
    strb     w8, [x9, #2]
    ldrb     w8, [x10, #2]
    sturb    w8, [x29, #-0x67]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x4cf7
    movk     w9, #0xe9f4, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    ldur     x0, [x29, #-0xe0]
    bl       #0x461ca8 // _objc_retain
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0xb2d1
    movk     w9, #0xe1d5, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0xd9a8
    movk     w9, #0xc577, lsl #16
    str      w9, [x8]
    ldur     x8, [x29, #-0xe0]
    sub      x9, x29, #0x18
    stur     x8, [x9, #-0x100]
    b        #0x35c00c
    ldp      x3, x2, [x29, #-0x78]
    ldp      x1, x0, [x29, #-0xa0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xf8]
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x5316
    movk     w9, #0x3d9e, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    sub      x8, x29, #0x38
    ldur     x8, [x8, #-0x100]
    mov      w9, #0x143
    movk     w9, #0x940c, lsl #16
    str      w9, [x8]
    b        #0x35c00c
    mov      w9, #0xd9a8
    movk     w9, #0xc577, lsl #16
    cmp      w8, w9
    b.ne     #0x35c00c
    sub      x8, x29, #0x18
    ldur     x20, [x8, #-0x100]
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x35c9f8
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

// -[WCLGHomeGroups displayGroupAtIndex:] IMP=0x35C9FC bounds=0x35C9FC-0x35CC1C
loc_35C9FC:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      x19, x2
    mov      w20, #0x64ce
    movk     w20, #0xdb9, lsl #16
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xce0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      w9, #0x35d0
    movk     w9, #0x67fa, lsl #16
    str      x0, [sp, #0x38]
    add      x8, sp, #0xc
    str      w9, [sp, #0xc]
    mov      w22, #0x64cd
    movk     w22, #0xdb9, lsl #16
    mov      w23, #0xc223
    movk     w23, #0xe2d3, lsl #16
    mov      w24, #0x80c9
    movk     w24, #0xbd2b, lsl #16
    str      x8, [sp]
    mov      w25, #0x56a
    movk     w25, #0x1309, lsl #16
    mov      w28, #0xc224
    movk     w28, #0xe2d3, lsl #16
    mov      w21, #0x9abb
    movk     w21, #0x1f1e, lsl #16
    mov      w26, #0xff7c
    movk     w26, #0x35f9, lsl #16
    mov      w27, #0xff7d
    movk     w27, #0x35f9, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w22
    b.le     #0x35cac8
    cmp      w8, w26
    b.gt     #0x35cb0c
    cmp      w8, w25
    b.eq     #0x35cbd0
    cmp      w8, w21
    b.ne     #0x35cbe4
    ldrb     w8, [sp, #0x27]
    cmp      w8, #0
    csel     w8, w27, w20, ne
    b        #0x35cafc
    cmp      w8, w23
    b.gt     #0x35cb44
    cmp      w8, w24
    b.eq     #0x35cba0
    mov      w9, #0xb85a
    movk     w9, #0xd457, lsl #16
    cmp      w8, w9
    b.ne     #0x35ca94
    ldrb     w8, [sp, #0x37]
    cmp      w8, #0
    mov      w8, #0x1d6c
    movk     w8, #0xf726, lsl #16
    csel     w8, w20, w8, ne
    ldr      x9, [sp]
    str      w8, [x9]
    str      xzr, [sp, #0x10]
    b        #0x35ca94
    cmp      w8, w27
    b.eq     #0x35cb74
    mov      w9, #0x35d0
    movk     w9, #0x67fa, lsl #16
    cmp      w8, w9
    b.ne     #0x35ca94
    cmp      x19, #0
    cset     w8, lt
    strb     w8, [sp, #0x37]
    ldr      x8, [sp]
    mov      w9, #0xb85a
    movk     w9, #0xd457, lsl #16
    str      w9, [x8]
    b        #0x35ca94
    cmp      w8, w28
    b.eq     #0x35cbac
    mov      w9, #0x1d6c
    movk     w9, #0xf726, lsl #16
    cmp      w8, w9
    b.ne     #0x35ca94
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x600]
    str      x8, [sp, #0x28]
    ldr      x8, [sp]
    str      w28, [x8]
    b        #0x35ca94
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    ldr      x0, [sp, #0x38]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x18]
    ldr      x8, [sp]
    str      w24, [x8]
    b        #0x35ca94
    ldr      x8, [sp]
    str      w25, [x8]
    b        #0x35ca94
    ldr      x0, [sp, #0x38]
    ldr      x1, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, x19
    cset     w8, gt
    strb     w8, [sp, #0x27]
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x35ca94
    ldr      x8, [sp]
    str      w20, [x8]
    ldr      x8, [sp, #0x18]
    str      x8, [sp, #0x10]
    b        #0x35ca94
    cmp      w8, w20
    b.ne     #0x35ca94
    ldr      x19, [sp, #0x10]
    ldr      x0, [sp, #0x38]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGHomeGroups currentGroupID] IMP=0x35CC1C bounds=0x35CC1C-0x35CF08
loc_35CC1C:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x19, x0
    adrp     x8, #0x581000
    add      x8, x8, #0x370
    mov      w21, #0x6234
    movk     w21, #0x643, lsl #16
    ldar     w8, [x8]
    str      w8, [sp, #0x2c]
    mov      w9, #0xca98
    movk     w9, #0x8f3b, lsl #16
    add      x8, sp, #0x14
    str      w9, [sp, #0x14]
    mov      w23, #0xf285
    movk     w23, #0x299e, lsl #16
    mov      w24, #0x6233
    movk     w24, #0x643, lsl #16
    str      x8, [sp, #8]
    mov      w25, #0xaea0
    movk     w25, #0x8bea, lsl #16
    mov      w27, #0x2cd2
    movk     w27, #0x542c, lsl #16
    mov      w10, #0xb269
    movk     w10, #0x11fc, lsl #16
    mov      w13, #0x40
    movk     w13, #0x603f, lsl #16
    mov      w28, #0x2cd1
    movk     w28, #0x542c, lsl #16
    mov      w22, #0xf286
    movk     w22, #0x299e, lsl #16
    adrp     x20, #0x54e000
    add      x20, x20, #0x160
    adrp     x26, #0x54e000
    add      x26, x26, #0x16d
    mov      w14, #0x91
    ldr      w8, [sp, #0x14]
    cmp      w8, w23
    b.gt     #0x35cd08
    cmp      w8, w24
    b.gt     #0x35cd50
    cmp      w8, w25
    b.eq     #0x35ce58
    mov      w9, #0xca98
    movk     w9, #0x8f3b, lsl #16
    cmp      w8, w9
    b.ne     #0x35ccc0
    ldr      w8, [sp, #0x2c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x2b]
    ldr      x8, [sp, #8]
    str      w27, [x8]
    b        #0x35ccc0
    cmp      w8, w28
    b.le     #0x35cd9c
    cmp      w8, w27
    b.eq     #0x35ce40
    cmp      w8, w13
    b.ne     #0x35ccc0
    ldrb     w8, [sp, #0x29]
    eor      w8, w8, w14
    adrp     x9, #0x54e000
    add      x9, x9, #0x178
    strb     w8, [x9]
    adrp     x8, #0x54e000
    ldrb     w8, [x8, #0x16c]
    eor      w8, w8, #0xffffff9f
    strb     w8, [x9, #1]
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x35ccc0
    cmp      w8, w21
    b.eq     #0x35ce94
    cmp      w8, w10
    b.ne     #0x35ccc0
    ldrb     w8, [sp, #0x2a]
    adrp     x9, #0x54e000
    add      x9, x9, #0x176
    strb     w8, [x9]
    adrp     x11, #0x54e000
    add      x11, x11, #0x16a
    ldrb     w8, [x11]
    mov      w12, #0x96
    eor      w8, w8, w12
    strb     w8, [x9, #1]
    ldrb     w8, [x11, #1]
    strb     w8, [sp, #0x29]
    ldr      x8, [sp, #8]
    str      w13, [x8]
    b        #0x35ccc0
    cmp      w8, w22
    b.ne     #0x35ceb0
    ldrb     w8, [x20]
    eor      w8, w8, #0xffffffcf
    strb     w8, [x26]
    ldrb     w8, [x20, #1]
    mov      w9, #0x72
    eor      w8, w8, w9
    strb     w8, [x26, #1]
    ldrb     w8, [x20, #2]
    mov      w9, #0xa1
    eor      w8, w8, w9
    strb     w8, [x26, #2]
    ldrb     w8, [x20, #3]
    mov      w9, #0x9b
    eor      w8, w8, w9
    strb     w8, [x26, #3]
    ldrb     w8, [x20, #4]
    eor      w8, w8, #0x70
    strb     w8, [x26, #4]
    ldrb     w8, [x20, #5]
    eor      w8, w8, w14
    strb     w8, [x26, #5]
    ldrb     w8, [x20, #6]
    mov      w9, #0x23
    eor      w8, w8, w9
    strb     w8, [x26, #6]
    ldrb     w8, [x20, #7]
    eor      w8, w8, #7
    strb     w8, [x26, #7]
    ldrb     w8, [x20, #8]
    mov      w9, #0x48
    eor      w8, w8, w9
    strb     w8, [x26, #8]
    ldrb     w8, [x20, #9]
    mov      w9, #0xa5
    eor      w8, w8, w9
    strb     w8, [sp, #0x2a]
    ldr      x8, [sp, #8]
    str      w10, [x8]
    b        #0x35ccc0
    ldrb     w8, [sp, #0x2b]
    cmp      w8, #0
    csel     w8, w22, w21, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x35ccc0
    add      x0, x19, #8
    str      x0, [sp, #0x20]
    bl       #0x461d68 // _os_unfair_lock_lock
    mov      w14, #0x91
    mov      w13, #0x40
    movk     w13, #0x603f, lsl #16
    mov      w10, #0xb269
    movk     w10, #0x11fc, lsl #16
    ldr      x8, [x19, #0x18]
    str      x8, [sp, #0x18]
    ldr      x8, [sp, #8]
    mov      w9, #0x4b21
    movk     w9, #0x3bda, lsl #16
    str      w9, [x8]
    b        #0x35ccc0
    adrp     x8, #0x581000
    add      x8, x8, #0x370
    mov      w9, #1
    stlr     w9, [x8]
    ldr      x8, [sp, #8]
    str      w25, [x8]
    b        #0x35ccc0
    mov      w9, #0x4b21
    movk     w9, #0x3bda, lsl #16
    cmp      w8, w9
    b.ne     #0x35ccc0
    ldr      x8, [sp, #0x18]
    adrp     x9, #0x54e000
    add      x9, x9, #0x1a0
    cmp      x8, #0
    csel     x19, x9, x8, eq
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    ldr      x0, [sp, #0x20]
    bl       #0x461d74 // _os_unfair_lock_unlock
    mov      x0, x19
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGHomeGroups setCurrentGroupID:] IMP=0x35CF08 bounds=0x35CF08-0x35D684
loc_35CF08:
    sub      sp, sp, #0xd0
    stp      x28, x27, [sp, #0x70]
    stp      x26, x25, [sp, #0x80]
    stp      x24, x23, [sp, #0x90]
    stp      x22, x21, [sp, #0xa0]
    stp      x20, x19, [sp, #0xb0]
    stp      x29, x30, [sp, #0xc0]
    add      x29, sp, #0xc0
    mov      x20, x0
    mov      w24, #0x8554
    movk     w24, #0x5692, lsl #16
    mov      w23, #0xc8d
    movk     w23, #0x39ac, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x374
    ldar     w8, [x8]
    stur     w8, [x29, #-0x54]
    mov      w8, #0xf458
    movk     w8, #0x2163, lsl #16
    str      w8, [sp, #0x1c]
    add      x8, sp, #0x1c
    stp      x2, x8, [sp, #8]
    mov      w22, #0xf457
    movk     w22, #0x2163, lsl #16
    adrp     x21, #0x54e000
    add      x21, x21, #0x1c2
    adrp     x27, #0x54e000
    add      x27, x27, #0x1e2
    adrp     x25, #0x54e000
    add      x25, x25, #0x1f8
    adrp     x28, #0x54e000
    add      x28, x28, #0x205
    mov      w26, #0x9e4
    movk     w26, #0x4e5a, lsl #16
    adrp     x19, #0x54e000
    add      x19, x19, #0x1ef
    ldr      w8, [sp, #0x1c]
    cmp      w8, w22
    b.le     #0x35cffc
    cmp      w8, w26
    b.gt     #0x35d06c
    mov      w9, #0xeec2
    movk     w9, #0x2e33, lsl #16
    cmp      w8, w9
    b.le     #0x35d344
    mov      w9, #0xeec3
    movk     w9, #0x2e33, lsl #16
    cmp      w8, w9
    b.eq     #0x35d61c
    cmp      w8, w23
    b.eq     #0x35d550
    mov      w9, #0x6b6a
    movk     w9, #0x4352, lsl #16
    cmp      w8, w9
    b.ne     #0x35cf98
    ldurb    w8, [x29, #-0x55]
    cmp      w8, #0
    mov      w8, #0x90d0
    movk     w8, #0xb401, lsl #16
    csel     w8, w8, w24, ne
    b        #0x35d610
    mov      w9, #0xee28
    movk     w9, #0xd0ad, lsl #16
    cmp      w8, w9
    b.le     #0x35d0cc
    mov      w9, #0xc84
    movk     w9, #0xd8c0, lsl #16
    cmp      w8, w9
    b.le     #0x35d2e0
    mov      w9, #0xc85
    movk     w9, #0xd8c0, lsl #16
    cmp      w8, w9
    b.eq     #0x35d4d8
    mov      w9, #0xe480
    movk     w9, #0xf4a9, lsl #16
    cmp      w8, w9
    b.eq     #0x35d478
    mov      w9, #0x44f2
    movk     w9, #0x186a, lsl #16
    cmp      w8, w9
    b.ne     #0x35cf98
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xf28]
    str      x8, [sp, #0x30]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xee29
    movk     w9, #0xd0ad, lsl #16
    str      w9, [x8]
    b        #0x35cf98
    mov      w9, #0x8553
    movk     w9, #0x5692, lsl #16
    cmp      w8, w9
    b.gt     #0x35d238
    mov      w9, #0x187e
    movk     w9, #0x5458, lsl #16
    cmp      w8, w9
    b.eq     #0x35d518
    mov      w9, #0x229c
    movk     w9, #0x5474, lsl #16
    cmp      w8, w9
    b.ne     #0x35d654
    ldr      x2, [sp, #0x58]
    ldr      x1, [sp, #0x40]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x38]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x187e
    movk     w9, #0x5458, lsl #16
    str      w9, [x8]
    b        #0x35cf98
    mov      w9, #0x76bc
    movk     w9, #0xa441, lsl #16
    cmp      w8, w9
    b.gt     #0x35d118
    mov      w9, #0xf0d4
    movk     w9, #0x9546, lsl #16
    cmp      w8, w9
    b.eq     #0x35d380
    mov      w9, #0x7a5b
    movk     w9, #0xa17e, lsl #16
    cmp      w8, w9
    b.ne     #0x35cf98
    ldr      x0, [sp, #0x58]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    mov      w9, #0xf0d4
    movk     w9, #0x9546, lsl #16
    str      w9, [x8]
    b        #0x35cf98
    mov      w9, #0x76bd
    movk     w9, #0xa441, lsl #16
    cmp      w8, w9
    b.eq     #0x35d398
    mov      w9, #0x90d0
    movk     w9, #0xb401, lsl #16
    cmp      w8, w9
    b.ne     #0x35cf98
    ldrb     w8, [x25]
    mov      w9, #0x9c
    eor      w8, w8, w9
    strb     w8, [x28]
    ldrb     w8, [x25, #1]
    eor      w8, w8, #0xbbbbbbbb
    strb     w8, [x28, #1]
    ldrb     w8, [x25, #2]
    eor      w8, w8, #0x80
    strb     w8, [x28, #2]
    ldrb     w8, [x25, #3]
    mov      w9, #0x8e
    eor      w8, w8, w9
    strb     w8, [x28, #3]
    ldrb     w8, [x25, #4]
    mov      w9, #0xd1
    eor      w8, w8, w9
    strb     w8, [x28, #4]
    ldrb     w8, [x25, #5]
    mov      w9, #0xfa
    eor      w8, w8, w9
    strb     w8, [x28, #5]
    ldrb     w8, [x25, #6]
    mov      w9, #0x56
    eor      w8, w8, w9
    strb     w8, [x28, #6]
    ldrb     w8, [x25, #7]
    mov      w9, #0x47
    eor      w8, w8, w9
    strb     w8, [x28, #7]
    ldrb     w8, [x25, #8]
    mov      w9, #0x7d
    eor      w8, w8, w9
    strb     w8, [x28, #8]
    ldrb     w8, [x25, #9]
    eor      w8, w8, #0xffffff8f
    strb     w8, [x28, #9]
    ldrb     w8, [x25, #0xa]
    eor      w8, w8, #0xffffff83
    strb     w8, [x28, #0xa]
    ldrb     w8, [x25, #0xb]
    mov      w9, #0xe4
    eor      w8, w8, w9
    strb     w8, [x28, #0xb]
    ldrb     w8, [x25, #0xc]
    mov      w9, #0xca
    eor      w8, w8, w9
    strb     w8, [x28, #0xc]
    adrp     x9, #0x54e000
    add      x9, x9, #0x1c0
    ldrb     w8, [x9]
    eor      w8, w8, #0x7c
    adrp     x10, #0x54e000
    add      x10, x10, #0x1e0
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w9, #0xbd
    eor      w8, w8, w9
    strb     w8, [x10, #1]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x76bd
    movk     w9, #0xa441, lsl #16
    str      w9, [x8]
    b        #0x35cf98
    cmp      w8, w24
    b.eq     #0x35d490
    mov      w9, #0x953b
    movk     w9, #0x66c0, lsl #16
    cmp      w8, w9
    b.ne     #0x35cf98
    ldurb    w8, [x29, #-0x56]
    strb     w8, [x19]
    adrp     x10, #0x54e000
    add      x10, x10, #0x1d0
    ldrb     w8, [x10]
    eor      w8, w8, #0xffffffbf
    strb     w8, [x19, #1]
    ldrb     w8, [x10, #1]
    mov      w9, #0xc8
    eor      w8, w8, w9
    strb     w8, [x19, #2]
    ldrb     w8, [x10, #2]
    mov      w9, #0x8b
    eor      w8, w8, w9
    strb     w8, [x19, #3]
    ldrb     w8, [x10, #3]
    mov      w9, #0x62
    eor      w8, w8, w9
    strb     w8, [x19, #4]
    ldrb     w8, [x10, #4]
    mov      w9, #0xe4
    eor      w8, w8, w9
    strb     w8, [x19, #5]
    ldrb     w8, [x10, #5]
    eor      w8, w8, #0xe0
    strb     w8, [x19, #6]
    ldrb     w8, [x10, #6]
    mov      w9, #0x85
    eor      w8, w8, w9
    strb     w8, [x19, #7]
    ldrb     w8, [x10, #7]
    eor      w8, w8, #4
    strb     w8, [x19, #8]
    ldr      x8, [sp, #0x10]
    str      w24, [x8]
    b        #0x35cf98
    mov      w9, #0xee29
    movk     w9, #0xd0ad, lsl #16
    cmp      w8, w9
    b.eq     #0x35d4f8
    mov      w9, #0x733d
    movk     w9, #0xd47e, lsl #16
    cmp      w8, w9
    b.ne     #0x35cf98
    ldr      x0, [sp, #0x58]
    bl       #0x461ca8 // _objc_retain
    ldr      x0, [sp, #0x60]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    str      x1, [sp, #0x50]
    ldr      x0, [sp, #0x58]
    adrp     x2, #0x54e000
    add      x2, x2, #0x280
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x4f]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xe480
    movk     w9, #0xf4a9, lsl #16
    str      w9, [x8]
    b        #0x35cf98
    mov      w9, #0xf458
    movk     w9, #0x2163, lsl #16
    cmp      w8, w9
    b.eq     #0x35d630
    mov      w9, #0x57a
    movk     w9, #0x2c7f, lsl #16
    cmp      w8, w9
    b.ne     #0x35cf98
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    mov      w9, #0x9e5
    movk     w9, #0x4e5a, lsl #16
    str      w9, [x8]
    b        #0x35cf98
    ldr      x8, [sp, #0x10]
    str      w23, [x8]
    adrp     x8, #0x54e000
    add      x8, x8, #0x280
    str      x8, [sp, #0x28]
    b        #0x35cf98
    ldrb     w8, [x21]
    mov      w9, #0xb4
    eor      w8, w8, w9
    strb     w8, [x27]
    ldrb     w8, [x21, #1]
    mov      w9, #0xa7
    eor      w8, w8, w9
    strb     w8, [x27, #1]
    ldrb     w8, [x21, #2]
    eor      w8, w8, #0xf8
    strb     w8, [x27, #2]
    ldrb     w8, [x21, #3]
    eor      w8, w8, #7
    strb     w8, [x27, #3]
    ldrb     w8, [x21, #4]
    eor      w8, w8, #0x1c
    strb     w8, [x27, #4]
    ldrb     w8, [x21, #5]
    mov      w9, #0x16
    eor      w8, w8, w9
    strb     w8, [x27, #5]
    ldrb     w8, [x21, #6]
    mov      w9, #0xc2
    eor      w8, w8, w9
    strb     w8, [x27, #6]
    ldrb     w8, [x21, #7]
    mov      w9, #0x1d
    eor      w8, w8, w9
    strb     w8, [x27, #7]
    ldrb     w8, [x21, #8]
    mov      w9, #0x84
    eor      w8, w8, w9
    strb     w8, [x27, #8]
    ldrb     w8, [x21, #9]
    mov      w9, #0xce
    eor      w8, w8, w9
    strb     w8, [x27, #9]
    ldrb     w8, [x21, #0xa]
    mov      w9, #0xe2
    eor      w8, w8, w9
    strb     w8, [x27, #0xa]
    ldrb     w8, [x21, #0xb]
    eor      w8, w8, #0xffffffc3
    strb     w8, [x27, #0xb]
    ldrb     w8, [x21, #0xc]
    eor      w8, w8, #0xfc
    strb     w8, [x27, #0xc]
    ldrb     w8, [x21, #0xd]
    mov      w9, #0xf5
    eor      w8, w8, w9
    sturb    w8, [x29, #-0x56]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x953b
    movk     w9, #0x66c0, lsl #16
    str      w9, [x8]
    b        #0x35cf98
    ldrb     w8, [sp, #0x4f]
    cmp      w8, #0
    mov      w8, #0xc85
    movk     w8, #0xd8c0, lsl #16
    csel     w8, w23, w8, ne
    b        #0x35d53c
    adrp     x8, #0x581000
    add      x8, x8, #0x374
    mov      w9, #1
    stlr     w9, [x8]
    ldr      x0, [sp, #8]
    bl       #0x347364
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    cmp      x0, #0
    adrp     x8, #0x54e000
    add      x8, x8, #0x280
    csel     x8, x8, x0, eq
    stp      x8, x0, [sp, #0x58]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x733d
    movk     w9, #0xd47e, lsl #16
    str      w9, [x8]
    b        #0x35cf98
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xf58]
    str      x8, [sp, #0x40]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x229c
    movk     w9, #0x5474, lsl #16
    str      w9, [x8]
    b        #0x35cf98
    ldr      x1, [sp, #0x30]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x10]
    mov      w9, #0xeec3
    movk     w9, #0x2e33, lsl #16
    str      w9, [x8]
    b        #0x35cf98
    ldr      x23, [sp, #0x38]
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cmp      x23, #0
    mov      w23, #0xc8d
    movk     w23, #0x39ac, lsl #16
    mov      w8, #0x7a5b
    movk     w8, #0xa17e, lsl #16
    csel     w8, w8, w23, eq
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    ldr      x8, [sp, #0x58]
    str      x8, [sp, #0x28]
    b        #0x35cf98
    ldr      x8, [sp, #0x28]
    str      x8, [sp, #0x20]
    add      x0, x20, #8
    bl       #0x461d68 // _os_unfair_lock_lock
    ldr      x0, [x20, #0x18]
    ldr      x1, [sp, #0x50]
    ldr      x2, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    ldr      x0, [sp, #0x20]
    bl       #0x461ca8 // _objc_retain
    ldr      x0, [x20, #0x18]
    ldr      x8, [sp, #0x20]
    str      x8, [x20, #0x18]
    bl       #0x461c9c // _objc_release
    add      x0, x20, #8
    bl       #0x461d74 // _os_unfair_lock_unlock
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    ldr      x2, [sp, #0x20]
    adrp     x3, #0x54e000
    add      x3, x3, #0x240
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    mov      w24, #0x8554
    movk     w24, #0x5692, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf08]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    cmp      w23, #0
    mov      w23, #0xc8d
    movk     w23, #0x39ac, lsl #16
    mov      w8, #0x57a
    movk     w8, #0x2c7f, lsl #16
    mov      w9, #0x44f2
    movk     w9, #0x186a, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x35cf98
    ldr      x8, [sp, #0x10]
    mov      w9, #0x57a
    movk     w9, #0x2c7f, lsl #16
    str      w9, [x8]
    b        #0x35cf98
    ldur     w8, [x29, #-0x54]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x55]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x6b6a
    movk     w9, #0x4352, lsl #16
    str      w9, [x8]
    b        #0x35cf98
    mov      w9, #0x9e5
    movk     w9, #0x4e5a, lsl #16
    cmp      w8, w9
    b.ne     #0x35cf98
    ldp      x29, x30, [sp, #0xc0]
    ldp      x20, x19, [sp, #0xb0]
    ldp      x22, x21, [sp, #0xa0]
    ldp      x24, x23, [sp, #0x90]
    ldp      x26, x25, [sp, #0x80]
    ldp      x28, x27, [sp, #0x70]
    add      sp, sp, #0xd0
    ret      

// -[WCLGHomeGroups currentDisplayIndex] IMP=0x35D684 bounds=0x35D684-0x35D97C
loc_35D684:
    sub      sp, sp, #0xe0
    stp      x28, x27, [sp, #0x80]
    stp      x26, x25, [sp, #0x90]
    stp      x24, x23, [sp, #0xa0]
    stp      x22, x21, [sp, #0xb0]
    stp      x20, x19, [sp, #0xc0]
    stp      x29, x30, [sp, #0xd0]
    add      x29, sp, #0xd0
    mov      w20, #0x57f7
    movk     w20, #0xeb4a, lsl #16
    mov      w24, #0xb01f
    movk     w24, #0x2119, lsl #16
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf30]
    str      x0, [sp]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      w9, #0xee05
    movk     w9, #0xdfe4, lsl #16
    stur     x0, [x29, #-0x58]
    add      x8, sp, #0x14
    mov      w26, #0xb01e
    movk     w26, #0x2119, lsl #16
    str      w9, [sp, #0x14]
    mov      w27, #0x6b08
    movk     w27, #0xb4d0, lsl #16
    mov      w21, #0x240b
    movk     w21, #0x91df, lsl #16
    str      x8, [sp, #8]
    mov      w22, #0x12a2
    movk     w22, #0x94eb, lsl #16
    mov      w19, #0x6b09
    movk     w19, #0xb4d0, lsl #16
    mov      w25, #0xf951
    movk     w25, #0x607d, lsl #16
    mov      w23, #0x4836
    movk     w23, #0x4ae1, lsl #16
    mov      w28, #0x4835
    movk     w28, #0x4ae1, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w26
    b.le     #0x35d778
    cmp      w8, w28
    b.le     #0x35d7d4
    cmp      w8, w23
    b.eq     #0x35d8fc
    cmp      w8, w25
    b.eq     #0x35d8c4
    mov      w9, #0x8a2a
    movk     w9, #0x68f7, lsl #16
    cmp      w8, w9
    b.ne     #0x35d724
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x608]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xdd0]
    stp      x8, x9, [sp, #0x50]
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x35d724
    cmp      w8, w27
    b.le     #0x35d814
    cmp      w8, w19
    b.eq     #0x35d920
    mov      w9, #0xee05
    movk     w9, #0xdfe4, lsl #16
    cmp      w8, w9
    b.ne     #0x35d93c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xce0]
    ldr      x0, [sp]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    str      x1, [sp, #0x68]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x60]
    ldr      x8, [sp, #8]
    str      w23, [x8]
    b        #0x35d724
    cmp      w8, w24
    b.eq     #0x35d834
    mov      w9, #0x2d13
    movk     w9, #0x3661, lsl #16
    cmp      w8, w9
    b.ne     #0x35d724
    ldr      x8, [sp, #0x18]
    add      x8, x8, #1
    str      x8, [sp, #0x40]
    ldur     x0, [x29, #-0x60]
    ldr      x1, [sp, #0x68]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x38]
    ldr      x8, [sp, #8]
    str      w19, [x8]
    b        #0x35d724
    cmp      w8, w21
    b.eq     #0x35d8e4
    cmp      w8, w22
    b.ne     #0x35d724
    ldr      x8, [sp, #8]
    str      w24, [x8]
    str      xzr, [sp, #0x28]
    b        #0x35d724
    ldr      x2, [sp, #0x28]
    str      x2, [sp, #0x18]
    ldur     x0, [x29, #-0x60]
    ldr      x1, [sp, #0x58]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x1, [sp, #0x50]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    ldur     x2, [x29, #-0x58]
    ldr      x1, [sp, #0x48]
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    mov      x0, x21
    mov      w21, #0x240b
    movk     w21, #0x91df, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    mov      w20, #0x57f7
    movk     w20, #0xeb4a, lsl #16
    bl       #0x461c9c // _objc_release
    cmp      w22, #0
    mov      w22, #0x12a2
    movk     w22, #0x94eb, lsl #16
    mov      w8, #0x2d13
    movk     w8, #0x3661, lsl #16
    csel     w8, w20, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    ldr      x8, [sp, #0x18]
    str      x8, [sp, #0x20]
    b        #0x35d724
    ldrb     w8, [sp, #0x37]
    cmp      w8, #0
    csel     w8, w24, w20, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    ldr      x8, [sp, #0x40]
    stp      xzr, x8, [sp, #0x20]
    b        #0x35d724
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x358]
    str      x8, [sp, #0x48]
    ldr      x8, [sp, #8]
    str      w22, [x8]
    b        #0x35d724
    ldr      x8, [sp, #0x60]
    cmp      x8, #0
    mov      w8, #0x8a2a
    movk     w8, #0x68f7, lsl #16
    csel     w8, w8, w20, gt
    ldr      x9, [sp, #8]
    str      w8, [x9]
    str      xzr, [sp, #0x20]
    b        #0x35d724
    ldp      x9, x8, [sp, #0x38]
    cmp      x8, x9
    cset     w8, lt
    strb     w8, [sp, #0x37]
    ldr      x8, [sp, #8]
    str      w25, [x8]
    b        #0x35d724
    cmp      w8, w20
    b.ne     #0x35d724
    ldr      x19, [sp, #0x20]
    ldur     x0, [x29, #-0x60]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x58]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0xd0]
    ldp      x20, x19, [sp, #0xc0]
    ldp      x22, x21, [sp, #0xb0]
    ldp      x24, x23, [sp, #0xa0]
    ldp      x26, x25, [sp, #0x90]
    ldp      x28, x27, [sp, #0x80]
    add      sp, sp, #0xe0
    ret      

// -[WCLGHomeGroups currentGroup] IMP=0x35D97C bounds=0x35D97C-0x35DA38
loc_35D97C:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xf30]
    str      x8, [sp, #0x18]
    mov      w20, #0xd80e
    movk     w20, #0xf5d8, lsl #16
    str      w20, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w21, #0x5531
    movk     w21, #0x4ccd, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w20
    b.eq     #0x35d9d4
    cmp      w8, w21
    b.ne     #0x35d9bc
    b        #0x35d9f8
    ldr      x1, [sp, #0x18]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x10]
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x35d9bc
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf58]
    ldr      x2, [sp, #0x10]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldr      x0, [sp, #0x10]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGHomeGroups selectDisplayIndex:] IMP=0x35DA38 bounds=0x35DA38-0x35DBE0
loc_35DA38:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      x19, x0
    mov      w20, #0xe467
    movk     w20, #0x37d0, lsl #16
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf60]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x38]
    mov      w21, #0x8217
    movk     w21, #0xd74b, lsl #16
    add      x8, sp, #0x14
    mov      w22, #0x4fe2
    movk     w22, #0x29ea, lsl #16
    str      w21, [sp, #0x14]
    str      x8, [sp, #8]
    mov      w23, #0xa43e
    movk     w23, #0xd, lsl #16
    mov      w24, #0x8210
    movk     w24, #0xbc4e, lsl #16
    mov      w26, #0xf6b4
    movk     w26, #0x683e, lsl #16
    mov      w27, #0x4fe3
    movk     w27, #0x29ea, lsl #16
    mov      w28, #0x4cac
    movk     w28, #0xe1c, lsl #16
    mov      w25, #0xa43f
    movk     w25, #0xd, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w22
    b.gt     #0x35db08
    cmp      w8, w23
    b.gt     #0x35db4c
    cmp      w8, w24
    b.eq     #0x35db74
    cmp      w8, w21
    b.ne     #0x35dac8
    ldr      x8, [sp, #0x38]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [sp, #0x37]
    ldr      x8, [sp, #8]
    str      w27, [x8]
    b        #0x35dac8
    cmp      w8, w27
    b.eq     #0x35db8c
    cmp      w8, w20
    b.eq     #0x35dba4
    cmp      w8, w26
    b.ne     #0x35dac8
    ldr      x0, [sp, #0x38]
    ldr      x1, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xf68]
    stp      x8, x0, [sp, #0x18]
    ldr      x8, [sp, #8]
    str      w28, [x8]
    b        #0x35dac8
    cmp      w8, w28
    b.ne     #0x35dbb8
    ldp      x1, x2, [sp, #0x18]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w20, [x8]
    b        #0x35dac8
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xdd0]
    str      x8, [sp, #0x28]
    ldr      x8, [sp, #8]
    str      w26, [x8]
    b        #0x35dac8
    ldrb     w8, [sp, #0x37]
    cmp      w8, #0
    csel     w8, w20, w24, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x35dac8
    ldr      x0, [sp, #0x38]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w25, [x8]
    b        #0x35dac8
    cmp      w8, w25
    b.ne     #0x35dac8
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    ret      

// -[WCLGHomeGroups collapsed] IMP=0x35DBE0 bounds=0x35DBE0-0x35DEC0
loc_35DBE0:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      x19, x0
    mov      w21, #0x1060
    movk     w21, #0x793f, lsl #16
    add      x0, x0, #8
    str      x0, [sp, #0x38]
    bl       #0x461d68 // _os_unfair_lock_lock
    mov      w9, #0x1e42
    movk     w9, #0x91d8, lsl #16
    ldrb     w8, [x19, #0x20]
    mov      w19, #0xe2d6
    movk     w19, #0x9349, lsl #16
    strb     w8, [sp, #0x37]
    add      x8, sp, #8
    mov      w23, #0xc22a
    movk     w23, #0x181d, lsl #16
    mov      w24, #0x17a6
    movk     w24, #0xd961, lsl #16
    mov      w27, #0x17a7
    movk     w27, #0xd961, lsl #16
    str      w9, [sp, #8]
    str      x8, [sp]
    mov      w22, #0xc22b
    movk     w22, #0x181d, lsl #16
    mov      w26, #0x64fd
    movk     w26, #0x440f, lsl #16
    mov      w25, #0x89f6
    movk     w25, #0x3250, lsl #16
    mov      w20, #0x47f9
    movk     w20, #0x7453, lsl #16
    mov      w28, #0x64fe
    movk     w28, #0x440f, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w23
    b.le     #0x35dccc
    cmp      w8, w26
    b.gt     #0x35dd0c
    cmp      w8, w22
    b.eq     #0x35ddac
    cmp      w8, w25
    b.eq     #0x35de3c
    mov      w9, #0xb9c9
    movk     w9, #0x3407, lsl #16
    cmp      w8, w9
    b.ne     #0x35dc7c
    bl       #0x344340
    strb     w0, [sp, #0x35]
    ldr      x8, [sp]
    mov      w9, #0x9cac
    movk     w9, #0xf448, lsl #16
    str      w9, [x8]
    b        #0x35dc7c
    cmp      w8, w24
    b.le     #0x35dd38
    cmp      w8, w27
    b.eq     #0x35dd78
    mov      w9, #0x3164
    movk     w9, #0xe98e, lsl #16
    cmp      w8, w9
    b.eq     #0x35de18
    mov      w9, #0x9cac
    movk     w9, #0xf448, lsl #16
    cmp      w8, w9
    b.ne     #0x35dc7c
    ldrb     w8, [sp, #0x35]
    cmp      w8, #0
    csel     w8, w22, w21, ne
    b        #0x35de88
    cmp      w8, w28
    b.eq     #0x35ddcc
    cmp      w8, w20
    b.eq     #0x35de5c
    cmp      w8, w21
    b.ne     #0x35dc7c
    ldr      x8, [sp]
    str      w19, [x8]
    ldrb     w8, [sp, #0x36]
    strb     w8, [sp, #0xe]
    b        #0x35dc7c
    mov      w9, #0x1e42
    movk     w9, #0x91d8, lsl #16
    cmp      w8, w9
    b.eq     #0x35ddf8
    mov      w9, #0x774a
    movk     w9, #0xb4cc, lsl #16
    cmp      w8, w9
    b.ne     #0x35de94
    ldr      x0, [sp, #0x38]
    bl       #0x461d74 // _os_unfair_lock_unlock
    ldrb     w8, [sp, #0x36]
    cmp      w8, #0
    mov      w8, #0xb9c9
    movk     w8, #0x3407, lsl #16
    csel     w8, w8, w21, ne
    b        #0x35de88
    adrp     x8, #0x4a4000
    add      x8, x8, #0xde8
    ldr      x2, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x328]
    ldr      x0, [sp, #0x10]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0xf]
    ldr      x8, [sp]
    mov      w9, #0x3164
    movk     w9, #0xe98e, lsl #16
    str      w9, [x8]
    b        #0x35dc7c
    adrp     x8, #0x4c4000
    ldr      x9, [x8, #0x198]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xcd8]
    stp      x8, x9, [sp, #0x20]
    ldr      x8, [sp]
    str      w25, [x8]
    b        #0x35dc7c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x10]
    ldr      x8, [sp]
    str      w27, [x8]
    b        #0x35dc7c
    ldrb     w8, [sp, #0x37]
    and      w8, w8, #1
    strb     w8, [sp, #0x36]
    ldr      x8, [sp]
    mov      w9, #0x774a
    movk     w9, #0xb4cc, lsl #16
    str      w9, [x8]
    b        #0x35dc7c
    ldr      x0, [sp, #0x10]
    bl       #0x461c9c // _objc_release
    ldrb     w8, [sp, #0xf]
    cmp      w8, #0
    csel     w8, w19, w21, ne
    ldr      x9, [sp]
    str      w8, [x9]
    strb     wzr, [sp, #0xe]
    b        #0x35dc7c
    ldp      x1, x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x18]
    ldr      x8, [sp]
    str      w20, [x8]
    b        #0x35dc7c
    ldr      x0, [sp, #0x18]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xc30]
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    cmp      w19, #0
    mov      w19, #0xe2d6
    movk     w19, #0x9349, lsl #16
    csel     w8, w21, w28, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x35dc7c
    cmp      w8, w19
    b.ne     #0x35dc7c
    ldrb     w0, [sp, #0xe]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    ret      

// -[WCLGHomeGroups expandedDisplayIndex] IMP=0x35DEC0 bounds=0x35DEC0-0x35E018
loc_35DEC0:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      x19, x0
    mov      w20, #0x6a13
    movk     w20, #0xb1de, lsl #16
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xec8]
    mov      w21, #0xcd41
    movk     w21, #0x9c10, lsl #16
    str      x8, [sp, #0x38]
    str      w21, [sp, #0x14]
    add      x8, sp, #0x14
    mov      w22, #0x6a12
    movk     w22, #0xb1de, lsl #16
    mov      w23, #0x485c
    movk     w23, #0x8173, lsl #16
    mov      w24, #0xe2bf
    movk     w24, #0xfcdb, lsl #16
    str      x8, [sp, #8]
    mov      w25, #0x4b12
    movk     w25, #0xd581, lsl #16
    mov      w26, #0xcb8b
    movk     w26, #0x9d9f, lsl #16
    adrp     x27, #0x4c1000
    mov      x28, #-1
    ldr      w8, [sp, #0x14]
    cmp      w8, w22
    b.gt     #0x35df74
    cmp      w8, w23
    b.eq     #0x35df98
    cmp      w8, w21
    b.eq     #0x35dfb4
    cmp      w8, w26
    b.ne     #0x35df3c
    ldr      x8, [x27, #0xe08]
    str      x8, [sp, #0x28]
    ldr      x8, [sp, #8]
    str      w23, [x8]
    b        #0x35df3c
    cmp      w8, w25
    b.eq     #0x35dfd0
    cmp      w8, w24
    b.ne     #0x35dfec
    ldr      x8, [sp, #8]
    str      w20, [x8]
    ldr      x8, [sp, #0x20]
    str      x8, [sp, #0x18]
    b        #0x35df3c
    ldr      x1, [sp, #0x28]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x20]
    ldr      x8, [sp, #8]
    str      w24, [x8]
    b        #0x35df3c
    ldr      x1, [sp, #0x38]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x37]
    ldr      x8, [sp, #8]
    str      w25, [x8]
    b        #0x35df3c
    ldrb     w8, [sp, #0x37]
    cmp      w8, #0
    csel     w8, w20, w26, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    str      x28, [sp, #0x18]
    b        #0x35df3c
    cmp      w8, w20
    b.ne     #0x35df3c
    ldr      x0, [sp, #0x18]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    ret      

// -[WCLGHomeGroups toggleExpandDisplayIndex:] IMP=0x35E018 bounds=0x35E018-0x35E7F0
loc_35E018:
    sub      sp, sp, #0xf0
    stp      x28, x27, [sp, #0x90]
    stp      x26, x25, [sp, #0xa0]
    stp      x24, x23, [sp, #0xb0]
    stp      x22, x21, [sp, #0xc0]
    stp      x20, x19, [sp, #0xd0]
    stp      x29, x30, [sp, #0xe0]
    add      x29, sp, #0xe0
    mov      x19, x2
    mov      x20, x0
    mov      w22, #0x3acf
    movk     w22, #0x8c77, lsl #16
    mov      w23, #0x150b
    movk     w23, #0x5cde, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x38c
    ldar     w8, [x8]
    stur     w8, [x29, #-0x54]
    mov      w8, #0xa6bc
    movk     w8, #0x23e5, lsl #16
    str      w8, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w26, #0xcd79
    movk     w26, #0x21d8, lsl #16
    mov      w21, #0x4592
    movk     w21, #0xaeff, lsl #16
    adrp     x24, #0x54e000
    add      x24, x24, #0x2a3
    mov      w28, #0xec67
    movk     w28, #0x406f, lsl #16
    adrp     x25, #0x54e000
    add      x25, x25, #0x2ca
    adrp     x27, #0x54e000
    add      x27, x27, #0x2ab
    ldr      w8, [sp, #0xc]
    cmp      w8, w26
    b.gt     #0x35e114
    cmp      w8, w21
    b.le     #0x35e180
    mov      w9, #0xb178
    movk     w9, #0x13d9, lsl #16
    cmp      w8, w9
    b.gt     #0x35e33c
    mov      w9, #0xd973
    movk     w9, #0x51e, lsl #16
    cmp      w8, w9
    b.le     #0x35e3dc
    mov      w9, #0xd974
    movk     w9, #0x51e, lsl #16
    cmp      w8, w9
    b.eq     #0x35e410
    mov      w9, #0x4808
    movk     w9, #0x9f1, lsl #16
    cmp      w8, w9
    b.ne     #0x35e0a4
    ldp      x9, x8, [sp, #0x20]
    str      x8, [x9]
    ldr      x8, [sp]
    mov      w9, #0xcd7a
    movk     w9, #0x21d8, lsl #16
    str      w9, [x8]
    b        #0x35e0a4
    cmp      w8, w28
    b.gt     #0x35e1d8
    mov      w9, #0x318
    movk     w9, #0x262d, lsl #16
    cmp      w8, w9
    b.gt     #0x35e294
    mov      w9, #0xcd7a
    movk     w9, #0x21d8, lsl #16
    cmp      w8, w9
    b.eq     #0x35e69c
    mov      w9, #0xa29
    movk     w9, #0x2216, lsl #16
    cmp      w8, w9
    b.eq     #0x35e478
    mov      w9, #0xa6bc
    movk     w9, #0x23e5, lsl #16
    cmp      w8, w9
    b.ne     #0x35e0a4
    ldur     w8, [x29, #-0x54]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x55]
    ldr      x8, [sp]
    mov      w9, #0x319
    movk     w9, #0x262d, lsl #16
    str      w9, [x8]
    b        #0x35e0a4
    mov      w9, #0xf90a
    movk     w9, #0x9bc0, lsl #16
    cmp      w8, w9
    b.gt     #0x35e240
    mov      w9, #0xf212
    movk     w9, #0x84a2, lsl #16
    cmp      w8, w9
    b.eq     #0x35e5ac
    mov      w9, #0xfd97
    movk     w9, #0x867e, lsl #16
    cmp      w8, w9
    b.eq     #0x35e728
    cmp      w8, w22
    b.ne     #0x35e0a4
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xf08]
    str      x8, [sp, #0x10]
    ldr      x8, [sp]
    mov      w9, #0xd310
    movk     w9, #0xc30f, lsl #16
    str      w9, [x8]
    b        #0x35e0a4
    mov      w9, #0x150a
    movk     w9, #0x5cde, lsl #16
    cmp      w8, w9
    b.gt     #0x35e2e8
    mov      w9, #0xec68
    movk     w9, #0x406f, lsl #16
    cmp      w8, w9
    b.eq     #0x35e734
    mov      w9, #0x3c0e
    movk     w9, #0x46cf, lsl #16
    cmp      w8, w9
    b.eq     #0x35e49c
    mov      w9, #0x5c47
    movk     w9, #0x522e, lsl #16
    cmp      w8, w9
    b.ne     #0x35e0a4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    ldur     x0, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x70]
    ldr      x8, [sp]
    mov      w9, #0x2070
    movk     w9, #0xada4, lsl #16
    str      w9, [x8]
    b        #0x35e0a4
    mov      w9, #0xf90b
    movk     w9, #0x9bc0, lsl #16
    cmp      w8, w9
    b.eq     #0x35e638
    mov      w9, #0x64cf
    movk     w9, #0xaabd, lsl #16
    cmp      w8, w9
    b.eq     #0x35e460
    mov      w9, #0x2070
    movk     w9, #0xada4, lsl #16
    cmp      w8, w9
    b.ne     #0x35e0a4
    ldr      x8, [sp, #0x70]
    cmp      x8, x19
    cset     w8, gt
    strb     w8, [sp, #0x6f]
    ldr      x8, [sp]
    mov      w9, #0x64cf
    movk     w9, #0xaabd, lsl #16
    str      w9, [x8]
    b        #0x35e0a4
    mov      w9, #0x319
    movk     w9, #0x262d, lsl #16
    cmp      w8, w9
    b.eq     #0x35e758
    mov      w9, #0x3081
    movk     w9, #0x3533, lsl #16
    cmp      w8, w9
    b.eq     #0x35e4a8
    mov      w9, #0x945a
    movk     w9, #0x3889, lsl #16
    cmp      w8, w9
    b.ne     #0x35e0a4
    adrp     x8, #0x581000
    add      x8, x8, #0x38c
    mov      w9, #1
    stlr     w9, [x8]
    ldr      x8, [sp]
    mov      w9, #0x3081
    movk     w9, #0x3533, lsl #16
    str      w9, [x8]
    b        #0x35e0a4
    cmp      w8, w23
    b.eq     #0x35e780
    mov      w9, #0x4f60
    movk     w9, #0x792a, lsl #16
    cmp      w8, w9
    b.eq     #0x35e4c8
    mov      w9, #0xc6cb
    movk     w9, #0x7e46, lsl #16
    cmp      w8, w9
    b.ne     #0x35e0a4
    ldur     x1, [x29, #-0x60]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x68]
    cmp      x19, #0
    mov      w8, #0x5c47
    movk     w8, #0x522e, lsl #16
    csel     w8, w23, w8, lt
    b        #0x35e774
    mov      w9, #0xb179
    movk     w9, #0x13d9, lsl #16
    cmp      w8, w9
    b.eq     #0x35e79c
    mov      w9, #0x3629
    movk     w9, #0x1952, lsl #16
    cmp      w8, w9
    b.eq     #0x35e660
    mov      w9, #0x321b
    movk     w9, #0x1c03, lsl #16
    cmp      w8, w9
    b.ne     #0x35e0a4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    ldur     x0, [x29, #-0x68]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x40]
    add      x0, x20, #8
    str      x0, [sp, #0x38]
    bl       #0x461d68 // _os_unfair_lock_lock
    strb     wzr, [x20, #0x20]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xdd0]
    str      x1, [sp, #0x30]
    ldr      x0, [sp, #0x40]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x8, x20
    ldr      x9, [x8, #0x18]!
    stp      x8, x0, [sp, #0x20]
    str      x9, [sp, #0x18]
    ldr      x8, [sp]
    mov      w9, #0x4808
    movk     w9, #0x9f1, lsl #16
    str      w9, [x8]
    b        #0x35e0a4
    mov      w9, #0xd310
    movk     w9, #0xc30f, lsl #16
    cmp      w8, w9
    b.ne     #0x35e7c0
    ldr      x1, [sp, #0x10]
    mov      x0, x20
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp]
    mov      w9, #0x3c0e
    movk     w9, #0x46cf, lsl #16
    str      w9, [x8]
    b        #0x35e0a4
    adrp     x9, #0x54e000
    add      x9, x9, #0x2a0
    ldrb     w8, [x9]
    mov      w10, #0x29
    eor      w8, w8, w10
    adrp     x10, #0x54e000
    add      x10, x10, #0x2c0
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    eor      w8, w8, #0xc
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w9, #0x2d
    eor      w8, w8, w9
    strb     w8, [x10, #2]
    ldr      x8, [sp]
    mov      w9, #0xf212
    movk     w9, #0x84a2, lsl #16
    str      w9, [x8]
    b        #0x35e0a4
    ldrb     w8, [sp, #0x6f]
    cmp      w8, #0
    mov      w8, #0x3629
    movk     w8, #0x1952, lsl #16
    csel     w8, w8, w23, ne
    b        #0x35e774
    ldrb     w8, [sp, #0x6e]
    ldrb     w9, [sp, #0x5f]
    orr      w8, w8, w9
    tst      w8, #1
    mov      w8, #0xf90b
    movk     w8, #0x9bc0, lsl #16
    mov      w9, #0x321b
    movk     w9, #0x1c03, lsl #16
    b        #0x35e770
    ldr      x8, [sp]
    str      w23, [x8]
    b        #0x35e0a4
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xce0]
    stur     x8, [x29, #-0x60]
    ldr      x8, [sp]
    mov      w9, #0xc6cb
    movk     w9, #0x7e46, lsl #16
    str      w9, [x8]
    b        #0x35e0a4
    ldurb    w8, [x29, #-0x56]
    mov      w9, #0xb8
    eor      w8, w8, w9
    strb     w8, [x25]
    ldrb     w8, [x27]
    mov      w9, #0x6b
    eor      w8, w8, w9
    strb     w8, [x25, #1]
    ldrb     w8, [x27, #1]
    mov      w9, #0xb7
    eor      w8, w8, w9
    strb     w8, [x25, #2]
    ldrb     w8, [x27, #2]
    eor      w8, w8, #0x60
    strb     w8, [x25, #3]
    ldrb     w8, [x27, #3]
    mov      w9, #0x51
    eor      w8, w8, w9
    strb     w8, [x25, #4]
    ldrb     w8, [x27, #4]
    mov      w9, #0x23
    eor      w8, w8, w9
    strb     w8, [x25, #5]
    ldrb     w8, [x27, #5]
    eor      w8, w8, #0xffffffe1
    strb     w8, [x25, #6]
    ldrb     w8, [x27, #6]
    eor      w8, w8, #0xfe
    strb     w8, [x25, #7]
    ldrb     w8, [x27, #7]
    mov      w9, #0x96
    eor      w8, w8, w9
    strb     w8, [x25, #8]
    ldrb     w8, [x27, #8]
    mov      w9, #0x65
    eor      w8, w8, w9
    strb     w8, [x25, #9]
    ldrb     w8, [x27, #9]
    mov      w9, #0xdb
    eor      w8, w8, w9
    strb     w8, [x25, #0xa]
    ldrb     w8, [x27, #0xa]
    mov      w9, #0x45
    eor      w8, w8, w9
    strb     w8, [x25, #0xb]
    ldrb     w8, [x27, #0xb]
    mov      w9, #0x97
    eor      w8, w8, w9
    strb     w8, [x25, #0xc]
    ldrb     w8, [x27, #0xc]
    eor      w8, w8, #8
    strb     w8, [x25, #0xd]
    ldr      x8, [sp]
    mov      w9, #0x945a
    movk     w9, #0x3889, lsl #16
    str      w9, [x8]
    b        #0x35e0a4
    ldrb     w8, [x24]
    mov      w9, #0xde
    eor      w8, w8, w9
    adrp     x9, #0x54e000
    add      x9, x9, #0x2c3
    strb     w8, [x9]
    ldrb     w8, [x24, #1]
    mov      w10, #0xab
    eor      w8, w8, w10
    strb     w8, [x9, #1]
    ldrb     w8, [x24, #2]
    mov      w10, #0xec
    eor      w8, w8, w10
    strb     w8, [x9, #2]
    ldrb     w8, [x24, #3]
    eor      w8, w8, #0x1f
    strb     w8, [x9, #3]
    ldrb     w8, [x24, #4]
    mov      w10, #5
    eor      w8, w8, w10
    strb     w8, [x9, #4]
    ldrb     w8, [x24, #5]
    mov      w11, #0x79
    eor      w8, w8, w11
    strb     w8, [x9, #5]
    ldrb     w8, [x24, #6]
    eor      w8, w8, w10
    strb     w8, [x9, #6]
    ldrb     w8, [x24, #7]
    sturb    w8, [x29, #-0x56]
    ldr      x8, [sp]
    mov      w9, #0x4f60
    movk     w9, #0x792a, lsl #16
    str      w9, [x8]
    b        #0x35e0a4
    add      x0, x20, #8
    str      x0, [sp, #0x50]
    bl       #0x461d68 // _os_unfair_lock_lock
    add      x8, x20, #0x20
    str      x8, [sp, #0x48]
    ldr      x8, [sp]
    mov      w9, #0xec68
    movk     w9, #0x406f, lsl #16
    str      w9, [x8]
    b        #0x35e0a4
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xec8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x6e]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xe08]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x60]
    ldr      x8, [sp]
    mov      w9, #0xb179
    movk     w9, #0x13d9, lsl #16
    str      w9, [x8]
    b        #0x35e0a4
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x38]
    bl       #0x461d74 // _os_unfair_lock_unlock
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x308]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x0, [sp, #0x40]
    ldr      x1, [sp, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    mov      x0, x22
    mov      x2, x23
    adrp     x3, #0x54e000
    add      x3, x3, #0x300
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    mov      w23, #0x150b
    movk     w23, #0x5cde, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    mov      w22, #0x3acf
    movk     w22, #0x8c77, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x40]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x35e0a4
    ldp      x8, x0, [sp, #0x48]
    mov      w9, #1
    strb     w9, [x8]
    bl       #0x461d74 // _os_unfair_lock_unlock
    ldr      x8, [sp]
    mov      w9, #0xfd97
    movk     w9, #0x867e, lsl #16
    str      w9, [x8]
    b        #0x35e0a4
    ldurb    w8, [x29, #-0x55]
    cmp      w8, #0
    mov      w8, #0x945a
    movk     w8, #0x3889, lsl #16
    mov      w9, #0xd974
    movk     w9, #0x51e, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x35e0a4
    ldur     x0, [x29, #-0x68]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    mov      w9, #0x4593
    movk     w9, #0xaeff, lsl #16
    str      w9, [x8]
    b        #0x35e0a4
    ldr      x8, [sp, #0x60]
    cmp      x8, x19
    cset     w8, ne
    strb     w8, [sp, #0x5f]
    ldr      x8, [sp]
    mov      w9, #0xa29
    movk     w9, #0x2216, lsl #16
    str      w9, [x8]
    b        #0x35e0a4
    mov      w9, #0x4593
    movk     w9, #0xaeff, lsl #16
    cmp      w8, w9
    b.ne     #0x35e0a4
    ldp      x29, x30, [sp, #0xe0]
    ldp      x20, x19, [sp, #0xd0]
    ldp      x22, x21, [sp, #0xc0]
    ldp      x24, x23, [sp, #0xb0]
    ldp      x26, x25, [sp, #0xa0]
    ldp      x28, x27, [sp, #0x90]
    add      sp, sp, #0xf0
    ret      

// -[WCLGHomeGroups normalizeCurrentSelection] IMP=0x35E7F0 bounds=0x35E7F0-0x35EC9C
loc_35E7F0:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      x19, x0
    mov      w21, #0xdbf0
    movk     w21, #0xd443, lsl #16
    mov      w23, #0x9a92
    movk     w23, #0x5c7, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x390
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w8, #0xde91
    movk     w8, #0x955, lsl #16
    str      w8, [sp, #0xc]
    add      x8, sp, #0xc
    mov      w26, #0x9a91
    movk     w26, #0x5c7, lsl #16
    str      x8, [sp]
    mov      w27, #0xdb1a
    movk     w27, #0xe7dd, lsl #16
    mov      w22, #0xf5d2
    movk     w22, #0x295, lsl #16
    mov      w25, #0xa1e0
    movk     w25, #0x2e20, lsl #16
    mov      w20, #0x6ba8
    movk     w20, #0x1319, lsl #16
    adrp     x24, #0x54e000
    add      x24, x24, #0x320
    adrp     x28, #0x54e000
    add      x28, x28, #0x32d
    ldr      w8, [sp, #0xc]
    cmp      w8, w26
    b.gt     #0x35e8e4
    cmp      w8, w27
    b.gt     #0x35e930
    mov      w9, #0xc0d0
    movk     w9, #0xc4ab, lsl #16
    cmp      w8, w9
    b.gt     #0x35e9bc
    mov      w9, #0x13d1
    movk     w9, #0x9258, lsl #16
    cmp      w8, w9
    b.eq     #0x35eab4
    mov      w9, #0x86ef
    movk     w9, #0x9600, lsl #16
    cmp      w8, w9
    b.ne     #0x35e880
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xf68]
    str      x8, [sp, #0x10]
    ldr      x8, [sp]
    mov      w9, #0x22b
    movk     w9, #0xe975, lsl #16
    str      w9, [x8]
    b        #0x35e880
    cmp      w8, w25
    b.gt     #0x35e980
    cmp      w8, w20
    b.gt     #0x35ea3c
    cmp      w8, w23
    b.eq     #0x35ec1c
    mov      w9, #0xde91
    movk     w9, #0x955, lsl #16
    cmp      w8, w9
    b.ne     #0x35e880
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp]
    mov      w9, #0x5040
    movk     w9, #0x1d27, lsl #16
    str      w9, [x8]
    b        #0x35e880
    cmp      w8, w22
    b.gt     #0x35e9f8
    mov      w9, #0xdb1b
    movk     w9, #0xe7dd, lsl #16
    cmp      w8, w9
    b.eq     #0x35ead4
    mov      w9, #0x22b
    movk     w9, #0xe975, lsl #16
    cmp      w8, w9
    b.ne     #0x35e880
    ldr      x1, [sp, #0x10]
    mov      x0, x19
    adrp     x2, #0x54e000
    add      x2, x2, #0x360
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp]
    mov      w9, #0x6164
    movk     w9, #0x5e05, lsl #16
    str      w9, [x8]
    b        #0x35e880
    mov      w9, #0x21eb
    movk     w9, #0x628f, lsl #16
    cmp      w8, w9
    b.gt     #0x35ea74
    mov      w9, #0xa1e1
    movk     w9, #0x2e20, lsl #16
    cmp      w8, w9
    b.eq     #0x35eb84
    mov      w9, #0x6164
    movk     w9, #0x5e05, lsl #16
    cmp      w8, w9
    b.ne     #0x35e880
    ldr      x8, [sp]
    str      w23, [x8]
    b        #0x35e880
    mov      w9, #0xc0d1
    movk     w9, #0xc4ab, lsl #16
    cmp      w8, w9
    b.eq     #0x35eb1c
    cmp      w8, w21
    b.ne     #0x35e880
    adrp     x8, #0x581000
    add      x8, x8, #0x390
    mov      w9, #1
    stlr     w9, [x8]
    ldr      x8, [sp]
    mov      w9, #0xf5d3
    movk     w9, #0x295, lsl #16
    str      w9, [x8]
    b        #0x35e880
    mov      w9, #0xf5d3
    movk     w9, #0x295, lsl #16
    cmp      w8, w9
    b.eq     #0x35eb4c
    mov      w9, #0xd068
    movk     w9, #0x2e9, lsl #16
    cmp      w8, w9
    b.ne     #0x35e880
    ldp      x1, x0, [sp, #0x28]
    adrp     x2, #0x54e000
    add      x2, x2, #0x360
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #0x13d1
    movk     w8, #0x9258, lsl #16
    csel     w8, w23, w8, ne
    b        #0x35eaa8
    mov      w9, #0x6ba9
    movk     w9, #0x1319, lsl #16
    cmp      w8, w9
    b.eq     #0x35ec38
    mov      w9, #0x5040
    movk     w9, #0x1d27, lsl #16
    cmp      w8, w9
    b.ne     #0x35e880
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    mov      w8, #0xa1e1
    movk     w8, #0x2e20, lsl #16
    csel     w8, w8, w21, ne
    b        #0x35eaa8
    mov      w9, #0x21ec
    movk     w9, #0x628f, lsl #16
    cmp      w8, w9
    b.ne     #0x35ec6c
    ldr      x21, [sp, #0x18]
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    cmp      x21, #0
    mov      w21, #0xdbf0
    movk     w21, #0xd443, lsl #16
    mov      w8, #0x86ef
    movk     w8, #0x9600, lsl #16
    csel     w8, w8, w23, eq
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x35e880
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xf58]
    str      x8, [sp, #0x20]
    ldr      x8, [sp]
    mov      w9, #0xc0d1
    movk     w9, #0xc4ab, lsl #16
    str      w9, [x8]
    b        #0x35e880
    ldrb     w8, [sp, #0x39]
    mov      w9, #0xec
    eor      w8, w8, w9
    adrp     x9, #0x54e000
    add      x9, x9, #0x337
    strb     w8, [x9]
    adrp     x10, #0x54e000
    add      x10, x10, #0x32b
    ldrb     w8, [x10]
    eor      w8, w8, #0xf
    strb     w8, [x9, #1]
    ldrb     w8, [x10, #1]
    mov      w10, #0x4a
    eor      w8, w8, w10
    strb     w8, [x9, #2]
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x35e880
    ldr      x2, [sp, #0x30]
    ldr      x1, [sp, #0x20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x18]
    ldr      x8, [sp]
    mov      w9, #0x21ec
    movk     w9, #0x628f, lsl #16
    str      w9, [x8]
    b        #0x35e880
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf30]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x358]
    stp      x8, x0, [sp, #0x28]
    ldr      x8, [sp]
    mov      w9, #0xd068
    movk     w9, #0x2e9, lsl #16
    str      w9, [x8]
    b        #0x35e880
    ldrb     w8, [x24]
    mov      w9, #0xe2
    eor      w8, w8, w9
    strb     w8, [x28]
    ldrb     w8, [x24, #1]
    eor      w8, w8, #0xf0
    strb     w8, [x28, #1]
    ldrb     w8, [x24, #2]
    eor      w8, w8, #6
    strb     w8, [x28, #2]
    ldrb     w8, [x24, #3]
    mov      w9, #0x68
    eor      w8, w8, w9
    strb     w8, [x28, #3]
    ldrb     w8, [x24, #4]
    mov      w9, #0xf5
    eor      w8, w8, w9
    strb     w8, [x28, #4]
    ldrb     w8, [x24, #5]
    eor      w8, w8, #0x55555555
    strb     w8, [x28, #5]
    ldrb     w8, [x24, #6]
    eor      w8, w8, #0xfe
    strb     w8, [x28, #6]
    ldrb     w8, [x24, #7]
    mov      w9, #0x75
    eor      w8, w8, w9
    strb     w8, [x28, #7]
    ldrb     w8, [x24, #8]
    eor      w8, w8, #0x3e
    strb     w8, [x28, #8]
    ldrb     w8, [x24, #9]
    strb     w8, [sp, #0x3a]
    ldr      x8, [sp]
    mov      w9, #0x6ba9
    movk     w9, #0x1319, lsl #16
    str      w9, [x8]
    b        #0x35e880
    ldr      x0, [sp, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    mov      w9, #0x2ee1
    movk     w9, #0x68d6, lsl #16
    str      w9, [x8]
    b        #0x35e880
    ldrb     w8, [sp, #0x3a]
    mov      w9, #0xaf
    eor      w8, w8, w9
    adrp     x9, #0x54e000
    strb     w8, [x9, #0x336]
    adrp     x8, #0x54e000
    ldrb     w8, [x8, #0x32a]
    strb     w8, [sp, #0x39]
    ldr      x8, [sp]
    mov      w9, #0xdb1b
    movk     w9, #0xe7dd, lsl #16
    str      w9, [x8]
    b        #0x35e880
    mov      w9, #0x2ee1
    movk     w9, #0x68d6, lsl #16
    cmp      w8, w9
    b.ne     #0x35e880
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    ret      

// -[WCLGHomeGroups addGroupWithTitle:] IMP=0x35EC9C bounds=0x35EC9C-0x35EF88
loc_35EC9C:
    sub      sp, sp, #0xa0
    stp      x28, x27, [sp, #0x40]
    stp      x26, x25, [sp, #0x50]
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      x20, x2
    mov      x19, x0
    mov      w21, #0x88e4
    movk     w21, #0xfabe, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x394
    ldar     w8, [x8]
    str      w8, [sp, #0x3c]
    mov      w8, #0xcd3e
    movk     w8, #0x25c0, lsl #16
    str      w8, [sp, #0xc]
    add      x8, sp, #0xc
    mov      w25, #0x744e
    movk     w25, #0xef48, lsl #16
    str      x8, [sp]
    mov      w26, #0x3033
    movk     w26, #0xb5cf, lsl #16
    mov      w23, #0x3034
    movk     w23, #0xb5cf, lsl #16
    adrp     x27, #0x54e000
    add      x27, x27, #0x382
    mov      w24, #0x3a2
    movk     w24, #0x669e, lsl #16
    mov      w22, #0xcd3d
    movk     w22, #0x25c0, lsl #16
    mov      w28, #0x744f
    movk     w28, #0xef48, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w25
    b.le     #0x35edec
    cmp      w8, w22
    b.gt     #0x35ee50
    cmp      w8, w28
    b.eq     #0x35eef0
    cmp      w8, w21
    b.ne     #0x35ed28
    adrp     x8, #0x581000
    add      x8, x8, #0x394
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c4000
    ldr      x21, [x8, #0x5f8]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    bl       #0x461bac // _objc_alloc_init
    str      x0, [sp, #0x28]
    mov      x0, x20
    bl       #0x347364
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    cmp      x21, #0
    adrp     x8, #0x54e000
    add      x8, x8, #0x3b0
    csel     x2, x8, x21, eq
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb80]
    ldr      x0, [sp, #0x28]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      w21, #0x88e4
    movk     w21, #0xfabe, lsl #16
    bl       #0x461c9c // _objc_release
    add      x0, x19, #8
    str      x0, [sp, #0x20]
    bl       #0x461d68 // _os_unfair_lock_lock
    ldr      x8, [x19, #0x10]
    str      x8, [sp, #0x18]
    ldr      x8, [sp]
    mov      w9, #0x1339
    movk     w9, #0x963e, lsl #16
    str      w9, [x8]
    b        #0x35ed28
    cmp      w8, w26
    b.le     #0x35ee84
    cmp      w8, w23
    b.eq     #0x35eec8
    mov      w9, #0x5e38
    movk     w9, #0xc125, lsl #16
    cmp      w8, w9
    b.ne     #0x35ed28
    ldrh     w8, [sp, #0x38]
    adrp     x9, #0x54e000
    add      x9, x9, #0x388
    strh     w8, [x9]
    ldrh     w8, [x27]
    mov      w10, #0x57e7
    eor      w8, w8, w10
    strh     w8, [x9, #2]
    ldrh     w8, [x27, #2]
    mov      w10, #0xbe79
    eor      w8, w8, w10
    strh     w8, [x9, #4]
    ldrh     w8, [x27, #4]
    strh     w8, [sp, #0x36]
    ldr      x8, [sp]
    str      w24, [x8]
    b        #0x35ed28
    cmp      w8, w24
    b.eq     #0x35ef08
    mov      w9, #0xcd3e
    movk     w9, #0x25c0, lsl #16
    cmp      w8, w9
    b.ne     #0x35ed28
    ldr      w8, [sp, #0x3c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x3b]
    ldr      x8, [sp]
    str      w28, [x8]
    b        #0x35ed28
    mov      w9, #0x1339
    movk     w9, #0x963e, lsl #16
    cmp      w8, w9
    b.ne     #0x35ef28
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x830]
    ldr      x2, [sp, #0x28]
    ldr      x0, [sp, #0x18]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xf20]
    str      x8, [sp, #0x10]
    ldr      x8, [sp]
    mov      w9, #0x9951
    movk     w9, #0xb0b1, lsl #16
    str      w9, [x8]
    b        #0x35ed28
    adrp     x8, #0x54e000
    ldrh     w8, [x8, #0x380]
    mov      w9, #0xc12d
    eor      w8, w8, w9
    strh     w8, [sp, #0x38]
    ldr      x8, [sp]
    mov      w9, #0x5e38
    movk     w9, #0xc125, lsl #16
    str      w9, [x8]
    b        #0x35ed28
    ldrb     w8, [sp, #0x3b]
    cmp      w8, #0
    csel     w8, w23, w21, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x35ed28
    ldrh     w8, [sp, #0x36]
    mov      w9, #0xd9f
    eor      w8, w8, w9
    adrp     x9, #0x54e000
    strh     w8, [x9, #0x38e]
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x35ed28
    mov      w9, #0x9951
    movk     w9, #0xb0b1, lsl #16
    cmp      w8, w9
    b.ne     #0x35ed28
    ldr      x1, [sp, #0x10]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x20]
    bl       #0x461d74 // _os_unfair_lock_unlock
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xaf8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x28]
    bl       #0x461be8 // _objc_autoreleaseReturnValue
    ldr      x0, [sp, #0x28]
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    ldp      x26, x25, [sp, #0x50]
    ldp      x28, x27, [sp, #0x40]
    add      sp, sp, #0xa0
    ret      

// -[WCLGHomeGroups removeGroupID:] IMP=0x35EF88 bounds=0x35EF88-0x35F804
loc_35EF88:
    sub      sp, sp, #0x120
    stp      x28, x27, [sp, #0xc0]
    stp      x26, x25, [sp, #0xd0]
    stp      x24, x23, [sp, #0xe0]
    stp      x22, x21, [sp, #0xf0]
    stp      x20, x19, [sp, #0x100]
    stp      x29, x30, [sp, #0x110]
    add      x29, sp, #0x110
    mov      x19, x2
    mov      x20, x0
    mov      w22, #0xe207
    movk     w22, #0xc70c, lsl #16
    mov      w23, #0x8544
    movk     w23, #0xc42b, lsl #16
    mov      w24, #0x5d7e
    movk     w24, #0x94cd, lsl #16
    adrp     x8, #0x581000
    add      x8, x8, #0x398
    ldar     w8, [x8]
    stur     w8, [x29, #-0x5c]
    mov      w8, #0x9791
    movk     w8, #0xc9cb, lsl #16
    str      w8, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w21, #0xd20e
    movk     w21, #0xc59, lsl #16
    mov      w26, #0xe9f9
    movk     w26, #0xc553, lsl #16
    mov      w25, #0x178
    movk     w25, #0xe2f9, lsl #16
    mov      w27, #0x61f2
    movk     w27, #0x545b, lsl #16
    mov      w28, #0xaa2e
    movk     w28, #0x6a0f, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w21
    b.gt     #0x35f080
    cmp      w8, w26
    b.le     #0x35f0cc
    cmp      w8, w25
    b.gt     #0x35f20c
    mov      w9, #0x9790
    movk     w9, #0xc9cb, lsl #16
    cmp      w8, w9
    b.gt     #0x35f3a8
    mov      w9, #0xe9fa
    movk     w9, #0xc553, lsl #16
    cmp      w8, w9
    b.eq     #0x35f59c
    cmp      w8, w22
    b.ne     #0x35f014
    ldr      x0, [sp, #0x88]
    bl       #0x461d74 // _os_unfair_lock_unlock
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xf18]
    str      x8, [sp, #0x28]
    ldr      x8, [sp, #8]
    mov      w9, #0xc154
    movk     w9, #0x537d, lsl #16
    str      w9, [x8]
    b        #0x35f014
    cmp      w8, w27
    b.le     #0x35f170
    cmp      w8, w28
    b.gt     #0x35f264
    mov      w9, #0xacb4
    movk     w9, #0x66b3, lsl #16
    cmp      w8, w9
    b.gt     #0x35f4bc
    mov      w9, #0x61f3
    movk     w9, #0x545b, lsl #16
    cmp      w8, w9
    b.eq     #0x35f6f0
    mov      w9, #0xbf0f
    movk     w9, #0x5cc8, lsl #16
    cmp      w8, w9
    b.ne     #0x35f014
    ldr      x8, [sp, #8]
    str      w24, [x8]
    b        #0x35f014
    mov      w9, #0x126b
    movk     w9, #0xaef9, lsl #16
    cmp      w8, w9
    b.gt     #0x35f2a8
    mov      w9, #0x8eb6
    movk     w9, #0x989e, lsl #16
    cmp      w8, w9
    b.gt     #0x35f42c
    cmp      w8, w24
    b.eq     #0x35f66c
    mov      w9, #0x51fe
    movk     w9, #0x9634, lsl #16
    cmp      w8, w9
    b.ne     #0x35f014
    ldurb    w8, [x29, #-0x5e]
    adrp     x9, #0x54e000
    add      x9, x9, #0x3e1
    strb     w8, [x9]
    adrp     x10, #0x54e000
    add      x10, x10, #0x3d5
    ldrb     w8, [x10]
    eor      w8, w8, #4
    strb     w8, [x9, #1]
    ldrb     w8, [x10, #1]
    mov      w11, #0xd0
    eor      w8, w8, w11
    strb     w8, [x9, #2]
    ldrb     w8, [x10, #2]
    eor      w8, w8, #0xfffffff3
    strb     w8, [x9, #3]
    ldrb     w8, [x10, #3]
    mov      w11, #0x53
    eor      w8, w8, w11
    strb     w8, [x9, #4]
    ldrb     w8, [x10, #4]
    sturb    w8, [x29, #-0x5f]
    ldr      x8, [sp, #8]
    mov      w9, #0x7a85
    movk     w9, #0x3722, lsl #16
    str      w9, [x8]
    b        #0x35f014
    mov      w9, #0xa2f9
    movk     w9, #0x31ac, lsl #16
    cmp      w8, w9
    b.le     #0x35f358
    mov      w9, #0x8a86
    movk     w9, #0x4b3a, lsl #16
    cmp      w8, w9
    b.gt     #0x35f46c
    mov      w9, #0xa2fa
    movk     w9, #0x31ac, lsl #16
    cmp      w8, w9
    b.eq     #0x35f6a8
    mov      w9, #0x7a85
    movk     w9, #0x3722, lsl #16
    cmp      w8, w9
    b.ne     #0x35f014
    ldurb    w8, [x29, #-0x5f]
    adrp     x9, #0x54e000
    add      x9, x9, #0x3e6
    strb     w8, [x9]
    adrp     x10, #0x54e000
    add      x10, x10, #0x3da
    ldrb     w8, [x10]
    mov      w11, #0x97
    eor      w8, w8, w11
    strb     w8, [x9, #1]
    ldrb     w8, [x10, #1]
    mov      w11, #0xdb
    eor      w8, w8, w11
    strb     w8, [x9, #2]
    ldrb     w8, [x10, #2]
    mov      w10, #0x32
    eor      w8, w8, w10
    strb     w8, [x9, #3]
    ldr      x8, [sp, #8]
    mov      w9, #0x8a87
    movk     w9, #0x4b3a, lsl #16
    str      w9, [x8]
    b        #0x35f014
    mov      w9, #0x427e
    movk     w9, #0xee73, lsl #16
    cmp      w8, w9
    b.gt     #0x35f3ec
    mov      w9, #0x179
    movk     w9, #0xe2f9, lsl #16
    cmp      w8, w9
    b.eq     #0x35f5c4
    mov      w9, #0x7cff
    movk     w9, #0xee3b, lsl #16
    cmp      w8, w9
    b.ne     #0x35f014
    ldr      x1, [sp, #0x78]
    ldr      x0, [sp, #0x48]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x50]
    cmp      x8, x0
    csel     w9, w23, w22, lo
    ldr      x10, [sp, #8]
    str      w9, [x10]
    str      x8, [sp, #0x20]
    b        #0x35f014
    mov      w9, #0xa2aa
    movk     w9, #0x7b96, lsl #16
    cmp      w8, w9
    b.gt     #0x35f4f4
    mov      w9, #0xaa2f
    movk     w9, #0x6a0f, lsl #16
    cmp      w8, w9
    b.eq     #0x35f728
    mov      w9, #0x5979
    movk     w9, #0x795d, lsl #16
    cmp      w8, w9
    b.ne     #0x35f014
    ldrb     w8, [sp, #0x47]
    cmp      w8, #0
    mov      w8, #0xaa2f
    movk     w8, #0x6a0f, lsl #16
    b        #0x35f778
    mov      w9, #0xf04
    movk     w9, #0xbbf6, lsl #16
    cmp      w8, w9
    b.le     #0x35f554
    mov      w9, #0xf05
    movk     w9, #0xbbf6, lsl #16
    cmp      w8, w9
    b.eq     #0x35f58c
    cmp      w8, w23
    b.ne     #0x35f014
    ldr      x2, [sp, #0x20]
    str      x2, [sp, #0x18]
    ldr      x8, [sp, #0x80]
    ldr      x0, [x8]
    ldr      x1, [sp, #0x60]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldr      x1, [sp, #0x58]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldur     x1, [x29, #-0x68]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    mov      x0, x23
    mov      w23, #0x8544
    movk     w23, #0xc42b, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    mov      w22, #0xe207
    movk     w22, #0xc70c, lsl #16
    bl       #0x461c9c // _objc_release
    cmp      w24, #0
    mov      w24, #0x5d7e
    movk     w24, #0x94cd, lsl #16
    mov      w8, #0x8eb7
    movk     w8, #0x989e, lsl #16
    mov      w9, #0xe9fa
    movk     w9, #0xc553, lsl #16
    b        #0x35f424
    mov      w9, #0xd20f
    movk     w9, #0xc59, lsl #16
    cmp      w8, w9
    b.eq     #0x35f7a0
    mov      w9, #0x6c49
    movk     w9, #0x1a8a, lsl #16
    cmp      w8, w9
    b.eq     #0x35f780
    mov      w9, #0x5777
    movk     w9, #0x2633, lsl #16
    cmp      w8, w9
    b.ne     #0x35f014
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x608]
    str      x8, [sp, #0x60]
    ldr      x8, [sp, #8]
    mov      w9, #0xacb5
    movk     w9, #0x66b3, lsl #16
    str      w9, [x8]
    b        #0x35f014
    mov      w9, #0x9791
    movk     w9, #0xc9cb, lsl #16
    cmp      w8, w9
    b.eq     #0x35f634
    mov      w9, #0x6744
    movk     w9, #0xd38c, lsl #16
    cmp      w8, w9
    b.ne     #0x35f014
    ldr      x8, [sp, #0x70]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [sp, #0x6f]
    ldr      x8, [sp, #8]
    mov      w9, #0xa2ab
    movk     w9, #0x7b96, lsl #16
    str      w9, [x8]
    b        #0x35f014
    mov      w9, #0x427f
    movk     w9, #0xee73, lsl #16
    cmp      w8, w9
    b.eq     #0x35f658
    mov      w9, #0x11b9
    movk     w9, #0xf814, lsl #16
    cmp      w8, w9
    b.ne     #0x35f014
    ldurb    w8, [x29, #-0x5d]
    cmp      w8, #0
    mov      w8, #0x8a87
    movk     w8, #0x4b3a, lsl #16
    mov      w9, #0x179
    movk     w9, #0xe2f9, lsl #16
    csel     w8, w9, w8, ne
    b        #0x35f794
    mov      w9, #0x8eb7
    movk     w9, #0x989e, lsl #16
    cmp      w8, w9
    b.eq     #0x35f688
    mov      w9, #0x4bd3
    movk     w9, #0xab82, lsl #16
    cmp      w8, w9
    b.ne     #0x35f014
    ldr      x8, [sp, #0x80]
    ldr      x8, [x8]
    str      x8, [sp, #0x48]
    ldr      x8, [sp, #8]
    mov      w9, #0x7cff
    movk     w9, #0xee3b, lsl #16
    str      w9, [x8]
    b        #0x35f014
    mov      w9, #0x8a87
    movk     w9, #0x4b3a, lsl #16
    cmp      w8, w9
    b.eq     #0x35f6cc
    mov      w9, #0xc154
    movk     w9, #0x537d, lsl #16
    cmp      w8, w9
    b.ne     #0x35f014
    ldr      x1, [sp, #0x28]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xaf8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    mov      w9, #0xbf0f
    movk     w9, #0x5cc8, lsl #16
    str      w9, [x8]
    b        #0x35f014
    mov      w9, #0xacb5
    movk     w9, #0x66b3, lsl #16
    cmp      w8, w9
    b.eq     #0x35f748
    mov      w9, #0xf21f
    movk     w9, #0x6711, lsl #16
    cmp      w8, w9
    b.ne     #0x35f014
    ldr      x1, [sp, #0x30]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    str      w22, [x8]
    b        #0x35f014
    mov      w9, #0xa2ab
    movk     w9, #0x7b96, lsl #16
    cmp      w8, w9
    b.eq     #0x35f768
    mov      w9, #0xc323
    movk     w9, #0x7f12, lsl #16
    cmp      w8, w9
    b.ne     #0x35f014
    add      x0, x20, #8
    str      x0, [sp, #0x88]
    bl       #0x461d68 // _os_unfair_lock_lock
    mov      x8, x20
    ldr      x0, [x8, #0x10]!
    str      x8, [sp, #0x80]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    str      x1, [sp, #0x78]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x70]
    ldr      x8, [sp, #8]
    mov      w9, #0x6744
    movk     w9, #0xd38c, lsl #16
    str      w9, [x8]
    b        #0x35f014
    mov      w9, #0x3ffe
    movk     w9, #0xb306, lsl #16
    cmp      w8, w9
    b.ne     #0x35f7d4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0x78]
    ldr      x8, [sp, #8]
    mov      w9, #0xa2fa
    movk     w9, #0x31ac, lsl #16
    str      w9, [x8]
    b        #0x35f014
    ldr      x8, [sp, #8]
    str      w23, [x8]
    str      xzr, [sp, #0x20]
    b        #0x35f014
    ldr      x8, [sp, #0x18]
    mov      x9, #0x7fffffffffffffff
    cmp      x8, x9
    cset     w8, eq
    strb     w8, [sp, #0x47]
    ldr      x8, [sp, #8]
    mov      w9, #0x5979
    movk     w9, #0x795d, lsl #16
    str      w9, [x8]
    b        #0x35f014
    adrp     x9, #0x54e000
    add      x9, x9, #0x3d0
    ldrb     w8, [x9]
    mov      w10, #0x43
    eor      w8, w8, w10
    adrp     x10, #0x54e000
    add      x10, x10, #0x3dd
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    eor      w8, w8, #0x18
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w11, #0xdc
    eor      w8, w8, w11
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    mov      w11, #0xf4
    eor      w8, w8, w11
    strb     w8, [x10, #3]
    ldrb     w8, [x9, #4]
    mov      w9, #0x56
    eor      w8, w8, w9
    sturb    w8, [x29, #-0x5e]
    ldr      x8, [sp, #8]
    mov      w9, #0x51fe
    movk     w9, #0x9634, lsl #16
    str      w9, [x8]
    b        #0x35f014
    ldur     w8, [x29, #-0x5c]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x5d]
    ldr      x8, [sp, #8]
    mov      w9, #0x11b9
    movk     w9, #0xf814, lsl #16
    str      w9, [x8]
    b        #0x35f014
    ldurb    w8, [x29, #-0x69]
    cmp      w8, #0
    mov      w8, #0x3ffe
    movk     w8, #0xb306, lsl #16
    b        #0x35f790
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0x126c
    movk     w9, #0xaef9, lsl #16
    str      w9, [x8]
    b        #0x35f014
    ldr      x8, [sp, #0x18]
    add      x8, x8, #1
    str      x8, [sp, #0x50]
    ldr      x8, [sp, #8]
    mov      w9, #0x4bd3
    movk     w9, #0xab82, lsl #16
    str      w9, [x8]
    b        #0x35f014
    ldur     x8, [x29, #-0x78]
    cmp      x8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x79]
    ldr      x8, [sp, #8]
    mov      w9, #0x6c49
    movk     w9, #0x1a8a, lsl #16
    str      w9, [x8]
    b        #0x35f014
    adrp     x8, #0x581000
    add      x8, x8, #0x398
    mov      w9, #1
    stlr     w9, [x8]
    ldr      x8, [sp, #8]
    mov      w9, #0x61f3
    movk     w9, #0x545b, lsl #16
    str      w9, [x8]
    b        #0x35f014
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    stur     x1, [x29, #-0x68]
    adrp     x2, #0x54e000
    add      x2, x2, #0x410
    bl       #0x461c6c // _objc_msgSend
    sturb    w0, [x29, #-0x69]
    ldr      x8, [sp, #8]
    mov      w9, #0x427f
    movk     w9, #0xee73, lsl #16
    str      w9, [x8]
    b        #0x35f014
    ldr      x8, [sp, #0x80]
    ldr      x8, [x8]
    str      x8, [sp, #0x38]
    ldr      x8, [sp, #8]
    mov      w9, #0xd20f
    movk     w9, #0xc59, lsl #16
    str      w9, [x8]
    b        #0x35f014
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xdd0]
    str      x8, [sp, #0x58]
    ldr      x8, [sp, #8]
    mov      w9, #0xf05
    movk     w9, #0xbbf6, lsl #16
    str      w9, [x8]
    b        #0x35f014
    ldrb     w8, [sp, #0x6f]
    cmp      w8, #0
    mov      w8, #0x5777
    movk     w8, #0x2633, lsl #16
    csel     w8, w22, w8, ne
    b        #0x35f794
    ldurb    w8, [x29, #-0x79]
    cmp      w8, #0
    mov      w8, #0xc323
    movk     w8, #0x7f12, lsl #16
    csel     w8, w24, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x35f014
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x840]
    ldr      x0, [sp, #0x38]
    ldr      x2, [sp, #0x18]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xf20]
    str      x8, [sp, #0x30]
    ldr      x8, [sp, #8]
    mov      w9, #0xf21f
    movk     w9, #0x6711, lsl #16
    str      w9, [x8]
    b        #0x35f014
    mov      w9, #0x126c
    movk     w9, #0xaef9, lsl #16
    cmp      w8, w9
    b.ne     #0x35f014
    ldp      x29, x30, [sp, #0x110]
    ldp      x20, x19, [sp, #0x100]
    ldp      x22, x21, [sp, #0xf0]
    ldp      x24, x23, [sp, #0xe0]
    ldp      x26, x25, [sp, #0xd0]
    ldp      x28, x27, [sp, #0xc0]
    add      sp, sp, #0x120
    ret      

// -[WCLGHomeGroups renameGroupID:toTitle:] IMP=0x35F804 bounds=0x35F804-0x360498
loc_35F804:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x120
    mov      x19, sp
    str      x3, [x19]
    mov      x25, x2
    str      x0, [x19, #0x10]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x60]
    adrp     x8, #0x581000
    add      x8, x8, #0x39c
    ldar     w8, [x8]
    stur     w8, [x29, #-0x64]
    mov      w8, #0x6b1d
    movk     w8, #0x9e98, lsl #16
    str      w8, [x19, #0x24]
    add      x8, x19, #0x24
    str      x8, [x19, #0x18]
    mov      w24, #0xa5a9
    movk     w24, #0xa9e, lsl #16
    mov      w23, #0x6c09
    movk     w23, #0xbbaa, lsl #16
    mov      w28, #0xbe89
    movk     w28, #0xeaff, lsl #16
    adrp     x26, #0x54e000
    add      x26, x26, #0x467
    adrp     x20, #0x54e000
    add      x20, x20, #0x474
    mov      w21, #0xf8b0
    movk     w21, #0x4dfd, lsl #16
    adrp     x22, #0x54e000
    add      x22, x22, #0x434
    adrp     x27, #0x54e000
    add      x27, x27, #0x454
    str      x2, [x19, #8]
    ldr      w8, [x19, #0x24]
    cmp      w8, w24
    b.gt     #0x35f940
    cmp      w8, w23
    b.le     #0x35f9a4
    cmp      w8, w28
    b.le     #0x35fb40
    mov      w9, #0x28f7
    movk     w9, #0xfb92, lsl #16
    cmp      w8, w9
    b.gt     #0x35fbf8
    mov      w9, #0xbe8a
    movk     w9, #0xeaff, lsl #16
    cmp      w8, w9
    b.eq     #0x36026c
    mov      w9, #0x8bf0
    movk     w9, #0xf0c1, lsl #16
    cmp      w8, w9
    b.eq     #0x3600ac
    mov      w9, #0x4dad
    movk     w9, #0xf49a, lsl #16
    cmp      w8, w9
    b.ne     #0x35f8ac
    ldur     x1, [x29, #-0x88]
    ldr      x0, [x19, #0x78]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    ldr      x0, [x19, #0x78]
    bl       #0x461c9c // _objc_release
    cmp      w25, #0
    ldr      x25, [x19, #8]
    mov      w8, #0xaed2
    movk     w8, #0x6152, lsl #16
    mov      w9, #0x5517
    movk     w9, #0x667e, lsl #16
    b        #0x3603f0
    cmp      w8, w21
    b.gt     #0x35fa10
    mov      w9, #0xb941
    movk     w9, #0x35f4, lsl #16
    cmp      w8, w9
    b.gt     #0x35fae0
    mov      w9, #0x842e
    movk     w9, #0x1805, lsl #16
    cmp      w8, w9
    b.gt     #0x35fc54
    mov      w9, #0xa5aa
    movk     w9, #0xa9e, lsl #16
    cmp      w8, w9
    b.eq     #0x360400
    mov      w9, #0xf41c
    movk     w9, #0xb45, lsl #16
    cmp      w8, w9
    b.eq     #0x3603d8
    mov      w9, #0x514c
    movk     w9, #0xd1b, lsl #16
    cmp      w8, w9
    b.ne     #0x35f8ac
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    b        #0x35fe40
    mov      w9, #0xa5b2
    movk     w9, #0x9661, lsl #16
    cmp      w8, w9
    b.gt     #0x35fa80
    mov      w9, #0xd1d8
    movk     w9, #0x8717, lsl #16
    cmp      w8, w9
    b.le     #0x35fc9c
    mov      w9, #0xd1d9
    movk     w9, #0x8717, lsl #16
    cmp      w8, w9
    b.eq     #0x35fee4
    mov      w9, #0x6780
    movk     w9, #0x8cf3, lsl #16
    cmp      w8, w9
    b.eq     #0x35feac
    mov      w9, #0xbcb9
    movk     w9, #0x90ba, lsl #16
    cmp      w8, w9
    b.ne     #0x35f8ac
    ldurb    w8, [x29, #-0x65]
    cmp      w8, #0
    mov      w8, #0xe78d
    movk     w8, #0x81dd, lsl #16
    mov      w9, #0x6c0a
    movk     w9, #0xbbaa, lsl #16
    b        #0x3603f0
    mov      w9, #0x5d3f
    movk     w9, #0x6a79, lsl #16
    cmp      w8, w9
    b.gt     #0x35fb9c
    mov      w9, #0x6831
    movk     w9, #0x5547, lsl #16
    cmp      w8, w9
    b.le     #0x35fe1c
    mov      w9, #0x6832
    movk     w9, #0x5547, lsl #16
    cmp      w8, w9
    b.eq     #0x3600e8
    mov      w9, #0xaed2
    movk     w9, #0x6152, lsl #16
    cmp      w8, w9
    b.eq     #0x360050
    mov      w9, #0x5517
    movk     w9, #0x667e, lsl #16
    cmp      w8, w9
    b.ne     #0x35f8ac
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0xb80]
    str      x8, [x19, #0x70]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x6832
    movk     w9, #0x5547, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    mov      w9, #0x6b1c
    movk     w9, #0x9e98, lsl #16
    cmp      w8, w9
    b.le     #0x35fcf8
    mov      w9, #0x6b1d
    movk     w9, #0x9e98, lsl #16
    cmp      w8, w9
    b.eq     #0x35ff14
    mov      w9, #0xc213
    movk     w9, #0xa34a, lsl #16
    cmp      w8, w9
    b.eq     #0x35fed0
    mov      w9, #0x706a
    movk     w9, #0xadc5, lsl #16
    cmp      w8, w9
    b.ne     #0x35f8ac
    ldrb     w8, [x19, #0xaf]
    cmp      w8, #0
    mov      w8, #0x354e
    movk     w8, #0xe700, lsl #16
    mov      w9, #0xfe12
    movk     w9, #0xc0a9, lsl #16
    csel     w8, w8, w9, ne
    b        #0x3603f4
    mov      w9, #0x8afc
    movk     w9, #0x3e74, lsl #16
    cmp      w8, w9
    b.le     #0x35fd88
    mov      w9, #0x8afd
    movk     w9, #0x3e74, lsl #16
    cmp      w8, w9
    b.eq     #0x35ff4c
    mov      w9, #0xa577
    movk     w9, #0x408a, lsl #16
    cmp      w8, w9
    b.eq     #0x35ff38
    mov      w9, #0x343b
    movk     w9, #0x4132, lsl #16
    cmp      w8, w9
    b.ne     #0x35f8ac
    ldr      x8, [x19, #0x10]
    add      x8, x8, #8
    stur     x8, [x29, #-0xa8]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x8afd
    movk     w9, #0x3e74, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    mov      w9, #0xfe11
    movk     w9, #0xc0a9, lsl #16
    cmp      w8, w9
    b.le     #0x35fdc4
    mov      w9, #0xfe12
    movk     w9, #0xc0a9, lsl #16
    cmp      w8, w9
    b.eq     #0x360084
    mov      w9, #0x45c5
    movk     w9, #0xd58d, lsl #16
    cmp      w8, w9
    b.eq     #0x35fffc
    mov      w9, #0x354e
    movk     w9, #0xe700, lsl #16
    cmp      w8, w9
    b.ne     #0x35f8ac
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x18]
    mov      w9, #0xa5b3
    movk     w9, #0x9661, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    mov      w9, #0x95ec
    movk     w9, #0x6e97, lsl #16
    cmp      w8, w9
    b.le     #0x35fe5c
    mov      w9, #0x95ed
    movk     w9, #0x6e97, lsl #16
    cmp      w8, w9
    b.eq     #0x36011c
    mov      w9, #0x1fc3
    movk     w9, #0x74f6, lsl #16
    cmp      w8, w9
    b.eq     #0x360070
    mov      w9, #0x3be3
    movk     w9, #0x7f22, lsl #16
    cmp      w8, w9
    b.ne     #0x35f8ac
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x18]
    mov      w9, #0xa183
    movk     w9, #0x3295, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    mov      w9, #0x28f8
    movk     w9, #0xfb92, lsl #16
    cmp      w8, w9
    b.eq     #0x360288
    mov      w9, #0xbaf6
    movk     w9, #0x54, lsl #16
    cmp      w8, w9
    b.eq     #0x3600c8
    mov      w9, #0x1ce7
    movk     w9, #0x283, lsl #16
    cmp      w8, w9
    b.ne     #0x35f8ac
    ldur     x1, [x29, #-0x88]
    mov      x0, x25
    adrp     x2, #0x54e000
    add      x2, x2, #0x4f0
    bl       #0x461c6c // _objc_msgSend
    sturb    w0, [x29, #-0x89]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xf41c
    movk     w9, #0xb45, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    mov      w9, #0x842f
    movk     w9, #0x1805, lsl #16
    cmp      w8, w9
    b.eq     #0x3603b0
    mov      w9, #0xf776
    movk     w9, #0x35b0, lsl #16
    cmp      w8, w9
    b.ne     #0x36044c
    adrp     x8, #0x4c4000
    ldr      x9, [x8, #0x60]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x308]
    stp      x8, x9, [x29, #-0xa0]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xa5aa
    movk     w9, #0xa9e, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    mov      w9, #0x4684
    movk     w9, #0x8025, lsl #16
    cmp      w8, w9
    b.eq     #0x35ffb4
    mov      w9, #0xe78d
    movk     w9, #0x81dd, lsl #16
    cmp      w8, w9
    b.ne     #0x35f8ac
    adrp     x8, #0x581000
    add      x8, x8, #0x39c
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x40
    mov      sp, x8
    stur     x8, [x29, #-0x70]
    sub      x8, sp, #0x80
    mov      sp, x8
    stur     x8, [x29, #-0x78]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x4ac5
    movk     w9, #0x6c54, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    mov      w9, #0xa5b3
    movk     w9, #0x9661, lsl #16
    cmp      w8, w9
    b.eq     #0x35ffd4
    mov      w9, #0x288c
    movk     w9, #0x9698, lsl #16
    cmp      w8, w9
    b.ne     #0x35f8ac
    adrp     x9, #0x54e000
    add      x9, x9, #0x442
    ldrb     w8, [x9]
    mov      w10, #0xb5
    eor      w8, w8, w10
    adrp     x10, #0x54e000
    add      x10, x10, #0x462
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w11, #0x62
    eor      w8, w8, w11
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w11, #0x9d
    eor      w8, w8, w11
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    mov      w11, #0x68
    eor      w8, w8, w11
    strb     w8, [x10, #3]
    ldrb     w8, [x9, #4]
    eor      w8, w8, #0xfc
    strb     w8, [x10, #4]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xe78d
    movk     w9, #0x81dd, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    mov      w9, #0xb942
    movk     w9, #0x35f4, lsl #16
    cmp      w8, w9
    b.eq     #0x360028
    mov      w9, #0xdb65
    movk     w9, #0x3e45, lsl #16
    cmp      w8, w9
    b.ne     #0x35f8ac
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x19, #0x18]
    mov      w9, #0x1fc3
    movk     w9, #0x74f6, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    mov      w9, #0x6c0a
    movk     w9, #0xbbaa, lsl #16
    cmp      w8, w9
    b.eq     #0x36014c
    mov      w9, #0xc04b
    movk     w9, #0xbc9b, lsl #16
    cmp      w8, w9
    b.ne     #0x35f8ac
    ldp      x1, x8, [x19, #0x88]
    ldr      x8, [x8]
    ldr      x9, [x19, #0x28]
    ldr      x0, [x8, x9, lsl #3]
    str      x0, [x19, #0x80]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x78]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xc213
    movk     w9, #0xa34a, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    mov      w9, #0xf8b1
    movk     w9, #0x4dfd, lsl #16
    cmp      w8, w9
    b.eq     #0x3602a8
    mov      w9, #0x684c
    movk     w9, #0x4f4d, lsl #16
    cmp      w8, w9
    b.ne     #0x35f8ac
    ldr      x1, [x19, #0x48]
    ldr      x0, [x19, #0x10]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #0x18]
    mov      w9, #0x8bf0
    movk     w9, #0xf0c1, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    mov      w9, #0x5d40
    movk     w9, #0x6a79, lsl #16
    cmp      w8, w9
    b.eq     #0x360384
    mov      w9, #0x4ac5
    movk     w9, #0x6c54, lsl #16
    cmp      w8, w9
    b.ne     #0x35f8ac
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    ldr      x0, [x19]
    bl       #0x347364
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x80]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xbaf6
    movk     w9, #0x54, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldr      x8, [x19, #0x58]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [x19, #0x57]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x95ed
    movk     w9, #0x6e97, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldr      x8, [x19, #0x18]
    mov      w9, #0x4dad
    movk     w9, #0xf49a, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldrb     w8, [x19, #0x67]
    cmp      w8, #0
    mov      w8, #0x45c5
    movk     w8, #0xd58d, lsl #16
    mov      w9, #0x5d40
    movk     w9, #0x6a79, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [x19, #0x18]
    str      w8, [x9]
    ldr      x8, [x19, #0x68]
    str      x8, [x19, #0x38]
    b        #0x35f8ac
    ldur     w8, [x29, #-0x64]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x65]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xbcb9
    movk     w9, #0x90ba, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldr      x8, [x19, #0x18]
    mov      w9, #0x354e
    movk     w9, #0xe700, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldur     x0, [x29, #-0xa8]
    bl       #0x461d68 // _os_unfair_lock_lock
    ldur     x8, [x29, #-0x70]
    movi     v0.16b, #0
    stp      q0, q0, [x8]
    stp      q0, q0, [x8, #0x20]
    ldr      x8, [x19, #0x10]
    ldr      x0, [x8, #0x10]
    stur     x0, [x29, #-0xb0]
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    str      x1, [x19, #0xb8]
    ldp      x3, x2, [x29, #-0x78]
    ldur     x0, [x29, #-0xb0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0xb0]
    cmp      x0, #0
    cset     w8, eq
    strb     w8, [x19, #0xaf]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x706a
    movk     w9, #0xadc5, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldur     x8, [x29, #-0x70]
    add      x8, x8, #8
    str      x8, [x19, #0x90]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xbe8a
    movk     w9, #0xeaff, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldur     x0, [x29, #-0xa8]
    bl       #0x461d74 // _os_unfair_lock_unlock
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xf28]
    str      x8, [x19, #0x48]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x684c
    movk     w9, #0x4f4d, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldr      x8, [x19, #0x38]
    str      x8, [x19, #0x28]
    ldp      x9, x8, [x19, #0x98]
    ldr      x8, [x8]
    ldr      x8, [x8]
    cmp      x8, x9
    mov      w8, #0xc04b
    movk     w8, #0xbc9b, lsl #16
    mov      w9, #0xdb65
    movk     w9, #0x3e45, lsl #16
    b        #0x3600e0
    ldr      x8, [x19, #0x68]
    ldr      x9, [x19, #0x30]
    cmp      x8, x9
    cset     w8, eq
    strb     w8, [x19, #0x67]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xd1d9
    movk     w9, #0x8717, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldr      x8, [x19, #0x28]
    add      x8, x8, #1
    str      x8, [x19, #0x68]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xb942
    movk     w9, #0x35f4, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldr      x8, [x19, #0x18]
    mov      w9, #0xc04b
    movk     w9, #0xbc9b, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldur     x8, [x29, #-0x70]
    ldr      x9, [x8, #0x10]!
    str      x8, [x19, #0xa0]
    ldr      x8, [x9]
    str      x8, [x19, #0x98]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x4684
    movk     w9, #0x8025, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x18]
    mov      w9, #0x3be3
    movk     w9, #0x7f22, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldur     x8, [x29, #-0x80]
    cmp      x8, #0
    mov      w8, #0x8bf0
    movk     w8, #0xf0c1, lsl #16
    mov      w9, #0x28f8
    movk     w9, #0xfb92, lsl #16
    csel     w8, w8, w9, eq
    b        #0x3603f4
    ldur     x2, [x29, #-0x80]
    ldr      x0, [x19, #0x80]
    ldr      x1, [x19, #0x70]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf20]
    ldr      x0, [x19, #0x10]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #0x18]
    mov      w9, #0xa577
    movk     w9, #0x408a, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldrb     w8, [x19, #0x57]
    cmp      w8, #0
    mov      w8, #0x354e
    movk     w8, #0xe700, lsl #16
    mov      w9, #0x842f
    movk     w9, #0x1805, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [x19, #0x18]
    str      w8, [x9]
    ldr      x8, [x19, #0x58]
    str      x8, [x19, #0x40]
    b        #0x35f8ac
    ldrb     w8, [x26]
    mov      w9, #0xd1
    eor      w8, w8, w9
    strb     w8, [x20]
    ldrb     w8, [x26, #1]
    eor      w8, w8, #0xfffffff9
    strb     w8, [x20, #1]
    ldrb     w8, [x26, #2]
    mov      w9, #0x7a
    eor      w8, w8, w9
    strb     w8, [x20, #2]
    ldrb     w8, [x26, #3]
    eor      w8, w8, #0x11111111
    strb     w8, [x20, #3]
    ldrb     w8, [x26, #4]
    mov      w10, #0x2e
    eor      w8, w8, w10
    strb     w8, [x20, #4]
    ldrb     w8, [x26, #5]
    eor      w8, w8, #8
    strb     w8, [x20, #5]
    ldrb     w8, [x26, #6]
    mov      w10, #0x37
    eor      w8, w8, w10
    strb     w8, [x20, #6]
    ldrb     w8, [x26, #7]
    mov      w10, #5
    eor      w8, w8, w10
    strb     w8, [x20, #7]
    ldrb     w8, [x26, #8]
    mov      w10, #0xe4
    eor      w8, w8, w10
    strb     w8, [x20, #8]
    ldrb     w8, [x26, #9]
    mov      w10, #0xb3
    eor      w8, w8, w10
    strb     w8, [x20, #9]
    ldrb     w8, [x26, #0xa]
    mov      w10, #0xbc
    eor      w8, w8, w10
    strb     w8, [x20, #0xa]
    ldrb     w8, [x26, #0xb]
    mov      w10, #0xb9
    eor      w8, w8, w10
    strb     w8, [x20, #0xb]
    ldrb     w8, [x26, #0xc]
    mov      w10, #0x28
    eor      w8, w8, w10
    strb     w8, [x20, #0xc]
    adrp     x10, #0x54e000
    add      x10, x10, #0x430
    ldrb     w8, [x10]
    mov      w11, #0x5f
    eor      w8, w8, w11
    adrp     x11, #0x54e000
    add      x11, x11, #0x450
    strb     w8, [x11]
    ldrb     w8, [x10, #1]
    eor      w8, w8, #0xc0
    strb     w8, [x11, #1]
    ldrb     w8, [x10, #2]
    eor      w8, w8, w9
    strb     w8, [x11, #2]
    ldrb     w8, [x10, #3]
    mov      w9, #0xab
    eor      w8, w8, w9
    strb     w8, [x11, #3]
    ldr      x8, [x19, #0x18]
    mov      w9, #0xf8b1
    movk     w9, #0x4dfd, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldr      x8, [x19, #0x18]
    mov      w9, #0x842f
    movk     w9, #0x1805, lsl #16
    str      w9, [x8]
    ldr      x8, [x19, #0xb0]
    str      x8, [x19, #0x40]
    b        #0x35f8ac
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x358]
    stur     x8, [x29, #-0x88]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x1ce7
    movk     w9, #0x283, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldrb     w8, [x22]
    mov      w9, #0x9b
    eor      w8, w8, w9
    strb     w8, [x27]
    ldrb     w8, [x22, #1]
    eor      w8, w8, #0xffffffef
    strb     w8, [x27, #1]
    ldrb     w8, [x22, #2]
    mov      w10, #0x57
    eor      w8, w8, w10
    strb     w8, [x27, #2]
    ldrb     w8, [x22, #3]
    mov      w11, #0xd5
    eor      w8, w8, w11
    strb     w8, [x27, #3]
    ldrb     w8, [x22, #4]
    mov      w11, #0x39
    eor      w8, w8, w11
    strb     w8, [x27, #4]
    ldrb     w8, [x22, #5]
    eor      w8, w8, #0x60
    strb     w8, [x27, #5]
    ldrb     w8, [x22, #6]
    eor      w8, w8, #8
    strb     w8, [x27, #6]
    ldrb     w8, [x22, #7]
    mov      w11, #0xde
    eor      w8, w8, w11
    strb     w8, [x27, #7]
    ldrb     w8, [x22, #8]
    eor      w8, w8, w10
    strb     w8, [x27, #8]
    ldrb     w8, [x22, #9]
    eor      w8, w8, #0xfc
    strb     w8, [x27, #9]
    ldrb     w8, [x22, #0xa]
    mov      w10, #0x3a
    eor      w8, w8, w10
    strb     w8, [x27, #0xa]
    ldrb     w8, [x22, #0xb]
    mov      w10, #0xc4
    eor      w8, w8, w10
    strb     w8, [x27, #0xb]
    ldrb     w8, [x22, #0xc]
    mov      w10, #0x8c
    eor      w8, w8, w10
    strb     w8, [x27, #0xc]
    ldrb     w8, [x22, #0xd]
    eor      w8, w8, w9
    strb     w8, [x27, #0xd]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x288c
    movk     w9, #0x9698, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldp      x3, x2, [x29, #-0x78]
    ldur     x0, [x29, #-0xb0]
    ldr      x1, [x19, #0xb8]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x58]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x6780
    movk     w9, #0x8cf3, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldr      x8, [x19, #0x40]
    stp      x8, xzr, [x19, #0x30]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xdd0]
    str      x8, [x19, #0x88]
    ldr      x8, [x19, #0x18]
    mov      w9, #0x45c5
    movk     w9, #0xd58d, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    ldurb    w8, [x29, #-0x89]
    cmp      w8, #0
    mov      w8, #0x343b
    movk     w8, #0x4132, lsl #16
    mov      w9, #0xf776
    movk     w9, #0x35b0, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [x19, #0x18]
    str      w8, [x9]
    b        #0x35f8ac
    ldp      x1, x0, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x9e8]
    ldur     x2, [x29, #-0x80]
    adrp     x3, #0x54e000
    add      x3, x3, #0x4b0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    ldr      x25, [x19, #8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x18]
    mov      w9, #0x514c
    movk     w9, #0xd1b, lsl #16
    str      w9, [x8]
    b        #0x35f8ac
    mov      w9, #0xa183
    movk     w9, #0x3295, lsl #16
    cmp      w8, w9
    b.ne     #0x35f8ac
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x360494
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGHomeGroups setMembers:forGroupID:] IMP=0x360498 bounds=0x360498-0x361628
loc_360498:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x1e0
    mov      x19, sp
    stp      x0, x3, [x19]
    mov      x21, x2
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    mov      w20, #0x9f1d
    movk     w20, #0xefe6, lsl #16
    stur     x8, [x29, #-0x60]
    adrp     x8, #0x581000
    add      x8, x8, #0x3a0
    ldar     w8, [x8]
    stur     w8, [x29, #-0x64]
    mov      w8, #0x6faf
    movk     w8, #0xe6fa, lsl #16
    str      w8, [x19, #0x1c]
    add      x8, x19, #0x1c
    str      x8, [x19, #0x10]
    mov      w28, #0xb3b5
    movk     w28, #0x2e5, lsl #16
    mov      w23, #0x7724
    movk     w23, #0xd2fb, lsl #16
    mov      w24, #0xa47
    movk     w24, #0x9e1c, lsl #16
    mov      w25, #0x9f1c
    movk     w25, #0xefe6, lsl #16
    mov      w27, #0x35f0
    movk     w27, #0x382a, lsl #16
    mov      w22, #0xb816
    movk     w22, #0x26ea, lsl #16
    mov      w26, #0xacbb
    movk     w26, #0x517e, lsl #16
    ldr      w8, [x19, #0x1c]
    cmp      w8, w28
    b.gt     #0x3605cc
    cmp      w8, w23
    b.gt     #0x36065c
    cmp      w8, w24
    b.le     #0x360788
    mov      w9, #0xa54a
    movk     w9, #0xb652, lsl #16
    cmp      w8, w9
    b.le     #0x360948
    mov      w9, #0xc925
    movk     w9, #0xb7bf, lsl #16
    cmp      w8, w9
    b.le     #0x360ff0
    mov      w9, #0xc926
    movk     w9, #0xb7bf, lsl #16
    cmp      w8, w9
    b.eq     #0x361500
    mov      w9, #0xeef2
    movk     w9, #0xc110, lsl #16
    cmp      w8, w9
    b.eq     #0x361544
    mov      w9, #0xfcf2
    movk     w9, #0xd064, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldur     x8, [x29, #-0xf8]
    ldr      x8, [x8]
    ldr      x9, [x19, #0x38]
    ldr      x8, [x8, x9, lsl #3]
    str      x8, [x19, #0x120]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x24dd
    movk     w9, #0x903e, lsl #16
    str      w9, [x8]
    b        #0x360538
    cmp      w8, w27
    b.le     #0x3606c8
    cmp      w8, w26
    b.le     #0x36072c
    mov      w9, #0x7b88
    movk     w9, #0x628e, lsl #16
    cmp      w8, w9
    b.le     #0x3608f0
    mov      w9, #0x8465
    movk     w9, #0x69d9, lsl #16
    cmp      w8, w9
    b.le     #0x360fbc
    mov      w9, #0x8466
    movk     w9, #0x69d9, lsl #16
    cmp      w8, w9
    b.eq     #0x3614e4
    mov      w9, #0xcfb4
    movk     w9, #0x7968, lsl #16
    cmp      w8, w9
    b.eq     #0x361528
    mov      w9, #0xf1d
    movk     w9, #0x7c5f, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldr      x8, [x19, #0x108]
    ldr      x9, [x19, #0x40]
    cmp      x8, x9
    mov      w9, #0xff4b
    movk     w9, #0x1a1b, lsl #16
    mov      w10, #0x93a4
    movk     w10, #0x3544, lsl #16
    csel     w9, w10, w9, eq
    ldr      x10, [x19, #0x10]
    str      w9, [x10]
    str      x8, [x19, #0x60]
    b        #0x360538
    cmp      w8, w25
    b.gt     #0x360834
    mov      w9, #0x5967
    movk     w9, #0xe4fd, lsl #16
    cmp      w8, w9
    b.le     #0x360b50
    mov      w9, #0x285a
    movk     w9, #0xed37, lsl #16
    cmp      w8, w9
    b.gt     #0x360d38
    mov      w9, #0x9e57
    movk     w9, #0xe528, lsl #16
    cmp      w8, w9
    b.eq     #0x361140
    mov      w9, #0x6faf
    movk     w9, #0xe6fa, lsl #16
    cmp      w8, w9
    b.ne     #0x3615dc
    ldur     w8, [x29, #-0x64]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x65]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x35f1
    movk     w9, #0x382a, lsl #16
    str      w9, [x8]
    b        #0x360538
    cmp      w8, w22
    b.gt     #0x360894
    mov      w9, #0x620f
    movk     w9, #0x1532, lsl #16
    cmp      w8, w9
    b.gt     #0x360a88
    mov      w9, #0x1b52
    movk     w9, #0x133a, lsl #16
    cmp      w8, w9
    b.gt     #0x360e50
    mov      w9, #0xb3b6
    movk     w9, #0x2e5, lsl #16
    cmp      w8, w9
    b.eq     #0x361340
    mov      w9, #0x6f1
    movk     w9, #0x978, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldr      x8, [x19, #0x10]
    mov      w9, #0x3f9
    movk     w9, #0x2972, lsl #16
    str      w9, [x8]
    ldr      x8, [x19, #0xe0]
    str      x8, [x19, #0x50]
    b        #0x360538
    mov      w9, #0xf519
    movk     w9, #0x41d4, lsl #16
    cmp      w8, w9
    b.gt     #0x3609a0
    mov      w9, #0xf3e0
    movk     w9, #0x3a0a, lsl #16
    cmp      w8, w9
    b.gt     #0x360c20
    mov      w9, #0x35f1
    movk     w9, #0x382a, lsl #16
    cmp      w8, w9
    b.eq     #0x36115c
    mov      w9, #0x9c8c
    movk     w9, #0x38b0, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldr      x8, [x19, #0x10]
    mov      w9, #0x5ed4
    movk     w9, #0x888c, lsl #16
    str      w9, [x8]
    ldur     x8, [x29, #-0xd8]
    str      x8, [x19, #0x68]
    b        #0x360538
    mov      w9, #0xa116
    movk     w9, #0x891c, lsl #16
    cmp      w8, w9
    b.gt     #0x3609f8
    mov      w9, #0x8ac0
    movk     w9, #0x8576, lsl #16
    cmp      w8, w9
    b.gt     #0x360ca4
    mov      w9, #0xec68
    movk     w9, #0x8065, lsl #16
    cmp      w8, w9
    b.eq     #0x3611fc
    mov      w9, #0x2985
    movk     w9, #0x80a3, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldr      x8, [x19, #0x58]
    str      x8, [x19, #0x30]
    ldr      x20, [x19]
    add      x0, x20, #8
    str      x0, [x19, #0xf0]
    bl       #0x461d68 // _os_unfair_lock_lock
    ldur     x8, [x29, #-0x80]
    movi     v0.16b, #0
    stp      q0, q0, [x8]
    stp      q0, q0, [x8, #0x20]
    ldr      x0, [x20, #0x10]
    mov      w20, #0x9f1d
    movk     w20, #0xefe6, lsl #16
    str      x0, [x19, #0xe8]
    bl       #0x461ca8 // _objc_retain
    ldp      x3, x2, [x29, #-0x88]
    ldr      x0, [x19, #0xe8]
    ldr      x1, [x19, #0x30]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0xe0]
    cmp      x0, #0
    mov      w8, #0x8466
    movk     w8, #0x69d9, lsl #16
    mov      w9, #0x877d
    movk     w9, #0xb61c, lsl #16
    b        #0x361570
    mov      w9, #0x9338
    movk     w9, #0xf817, lsl #16
    cmp      w8, w9
    b.gt     #0x360a3c
    mov      w9, #0xc7e2
    movk     w9, #0xf2b2, lsl #16
    cmp      w8, w9
    b.gt     #0x360dc0
    cmp      w8, w20
    b.eq     #0x3612ac
    mov      w9, #0xb4b5
    movk     w9, #0xf29c, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldur     x0, [x29, #-0xb8]
    ldur     x1, [x29, #-0x100]
    ldr      x2, [x19, #0x118]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [x19, #0x117]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x3bf6
    movk     w9, #0x23b6, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      w9, #0xabd4
    movk     w9, #0x2d0b, lsl #16
    cmp      w8, w9
    b.gt     #0x360ae4
    mov      w9, #0x3f8
    movk     w9, #0x2972, lsl #16
    cmp      w8, w9
    b.gt     #0x360e90
    mov      w9, #0xb817
    movk     w9, #0x26ea, lsl #16
    cmp      w8, w9
    b.eq     #0x361354
    mov      w9, #0xe23b
    movk     w9, #0x27d8, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x10]
    mov      w9, #0x1b53
    movk     w9, #0x133a, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      w9, #0xe2f7
    movk     w9, #0x5de1, lsl #16
    cmp      w8, w9
    b.gt     #0x360b9c
    mov      w9, #0xacbc
    movk     w9, #0x517e, lsl #16
    cmp      w8, w9
    b.eq     #0x3610b8
    mov      w9, #0xcf7
    movk     w9, #0x5a47, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    ldr      x0, [x19, #8]
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xa0]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xb817
    movk     w9, #0x26ea, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      w9, #0x9083
    movk     w9, #0xa921, lsl #16
    cmp      w8, w9
    b.gt     #0x360be0
    mov      w9, #0xa48
    movk     w9, #0x9e1c, lsl #16
    cmp      w8, w9
    b.eq     #0x3610ec
    mov      w9, #0x84b9
    movk     w9, #0xa7c3, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldr      x8, [x19, #0xd0]
    ldr      x9, [x8]
    ldur     x8, [x29, #-0x80]
    add      x8, x8, #8
    stp      x8, x9, [x19, #0xc0]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x6f1
    movk     w9, #0x978, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      w9, #0x5141
    movk     w9, #0x48f8, lsl #16
    cmp      w8, w9
    b.gt     #0x360c68
    mov      w9, #0xf51a
    movk     w9, #0x41d4, lsl #16
    cmp      w8, w9
    b.eq     #0x36117c
    mov      w9, #0xb8e2
    movk     w9, #0x4666, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldur     x8, [x29, #-0xe8]
    ldr      x9, [x8]
    ldur     x8, [x29, #-0x70]
    add      x8, x8, #8
    stp      x8, x9, [x29, #-0xf8]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x9c8c
    movk     w9, #0x38b0, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      w9, #0x24dc
    movk     w9, #0x903e, lsl #16
    cmp      w8, w9
    b.gt     #0x360cfc
    mov      w9, #0xa117
    movk     w9, #0x891c, lsl #16
    cmp      w8, w9
    b.eq     #0x36121c
    mov      w9, #0x79c0
    movk     w9, #0x8a87, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldr      x8, [x19, #0x10]
    mov      w9, #0x3943
    movk     w9, #0xe1d6, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      w9, #0x9b73
    movk     w9, #0xffe2, lsl #16
    cmp      w8, w9
    b.gt     #0x360dfc
    mov      w9, #0x9339
    movk     w9, #0xf817, lsl #16
    cmp      w8, w9
    b.eq     #0x3612dc
    mov      w9, #0x51f0
    movk     w9, #0xfe2a, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldr      x0, [x19, #0xe8]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x19, #0x10]
    mov      w9, #0x79c0
    movk     w9, #0x8a87, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      w9, #0xff4a
    movk     w9, #0x1a1b, lsl #16
    cmp      w8, w9
    b.gt     #0x360ed0
    mov      w9, #0x6210
    movk     w9, #0x1532, lsl #16
    cmp      w8, w9
    b.eq     #0x361378
    mov      w9, #0x296d
    movk     w9, #0x19b4, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldur     x8, [x29, #-0x70]
    movi     v0.16b, #0
    stp      q0, q0, [x8]
    stp      q0, q0, [x8, #0x20]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [x19, #0x10]
    mov      w9, #0xacbc
    movk     w9, #0x517e, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      w9, #0x93a3
    movk     w9, #0x3544, lsl #16
    cmp      w8, w9
    b.gt     #0x360f0c
    mov      w9, #0xabd5
    movk     w9, #0x2d0b, lsl #16
    cmp      w8, w9
    b.eq     #0x361398
    mov      w9, #0x560f
    movk     w9, #0x3133, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    ldur     x0, [x29, #-0xc0]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #0x296d
    movk     w8, #0x19b4, lsl #16
    mov      w9, #0xf51a
    movk     w9, #0x41d4, lsl #16
    b        #0x361214
    mov      w9, #0x3160
    movk     w9, #0xda90, lsl #16
    cmp      w8, w9
    b.gt     #0x360f64
    mov      w9, #0x7725
    movk     w9, #0xd2fb, lsl #16
    cmp      w8, w9
    b.eq     #0x36145c
    mov      w9, #0x8028
    movk     w9, #0xd40c, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldr      x8, [x19, #0x118]
    cmp      x8, #0
    mov      w8, #0xcfb4
    movk     w8, #0x7968, lsl #16
    mov      w9, #0xb4b5
    movk     w9, #0xf29c, lsl #16
    b        #0x361570
    mov      w9, #0xe2f8
    movk     w9, #0x5de1, lsl #16
    cmp      w8, w9
    b.eq     #0x3610d8
    mov      w9, #0x1a39
    movk     w9, #0x5fc1, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldr      x0, [x19, #0xa8]
    bl       #0x461c9c // _objc_release
    ldrb     w8, [x19, #0xa7]
    cmp      w8, #0
    mov      w8, #0x9084
    movk     w8, #0xa921, lsl #16
    mov      w9, #0x6210
    movk     w9, #0x1532, lsl #16
    b        #0x361214
    mov      w9, #0x9084
    movk     w9, #0xa921, lsl #16
    cmp      w8, w9
    b.eq     #0x361110
    mov      w9, #0x877d
    movk     w9, #0xb61c, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldur     x8, [x29, #-0x80]
    ldr      x9, [x8, #0x10]!
    stp      x9, x8, [x19, #0xd0]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x84b9
    movk     w9, #0xa7c3, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      w9, #0xf3e1
    movk     w9, #0x3a0a, lsl #16
    cmp      w8, w9
    b.eq     #0x36119c
    mov      w9, #0xcb53
    movk     w9, #0x3c0b, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldr      x0, [x19, #0xa8]
    ldur     x1, [x29, #-0x90]
    ldr      x2, [x19, #8]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [x19, #0xa7]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x1a39
    movk     w9, #0x5fc1, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      w9, #0x5142
    movk     w9, #0x48f8, lsl #16
    cmp      w8, w9
    b.eq     #0x3611cc
    mov      w9, #0x3cf5
    movk     w9, #0x514d, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldr      x8, [x19, #0x10]
    mov      w9, #0x2985
    movk     w9, #0x80a3, lsl #16
    str      w9, [x8]
    ldur     x8, [x29, #-0xc8]
    str      x8, [x19, #0x58]
    b        #0x360538
    mov      w9, #0x8ac1
    movk     w9, #0x8576, lsl #16
    cmp      w8, w9
    b.eq     #0x361244
    mov      w9, #0x5ed4
    movk     w9, #0x888c, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldr      x8, [x19, #0x68]
    str      x8, [x19, #0x40]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xa08]
    stur     x8, [x29, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x830]
    str      x8, [x19, #0x128]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xff4b
    movk     w9, #0x1a1b, lsl #16
    str      w9, [x8]
    str      xzr, [x19, #0x60]
    b        #0x360538
    mov      w9, #0x24dd
    movk     w9, #0x903e, lsl #16
    cmp      w8, w9
    b.eq     #0x361268
    mov      w9, #0x8b67
    movk     w9, #0x97aa, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    mov      x0, x21
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x19, #0x10]
    mov      w9, #0xb3b6
    movk     w9, #0x2e5, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      w9, #0x285b
    movk     w9, #0xed37, lsl #16
    cmp      w8, w9
    b.eq     #0x361290
    mov      w9, #0x9ecd
    movk     w9, #0xed3c, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldurb    w8, [x29, #-0x67]
    adrp     x9, #0x54e000
    add      x9, x9, #0x525
    strb     w8, [x9]
    adrp     x11, #0x54e000
    add      x11, x11, #0x519
    ldrb     w8, [x11]
    mov      w10, #0x97
    eor      w8, w8, w10
    strb     w8, [x9, #1]
    ldrb     w8, [x11, #1]
    eor      w8, w8, #0xffffff81
    strb     w8, [x9, #2]
    ldrb     w8, [x11, #2]
    mov      w10, #0xb8
    eor      w8, w8, w10
    strb     w8, [x9, #3]
    ldrb     w8, [x11, #3]
    mov      w10, #0xd2
    eor      w8, w8, w10
    strb     w8, [x9, #4]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xf3e1
    movk     w9, #0x3a0a, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      w9, #0xc7e3
    movk     w9, #0xf2b2, lsl #16
    cmp      w8, w9
    b.eq     #0x3612fc
    mov      w9, #0x3811
    movk     w9, #0xf311, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldurb    w8, [x29, #-0xa1]
    cmp      w8, #0
    mov      w8, #0x285b
    movk     w8, #0xed37, lsl #16
    mov      w9, #0x9339
    movk     w9, #0xf817, lsl #16
    b        #0x361214
    mov      w9, #0x9b74
    movk     w9, #0xffe2, lsl #16
    cmp      w8, w9
    b.eq     #0x36131c
    mov      w9, #0x68cc
    movk     w9, #0x74, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldr      x0, [x19, #0xf0]
    bl       #0x461d74 // _os_unfair_lock_unlock
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    ldr      x0, [x19]
    bl       #0x461c6c // _objc_msgSend
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x10]
    mov      w9, #0xe2f8
    movk     w9, #0x5de1, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      w9, #0x1b53
    movk     w9, #0x133a, lsl #16
    cmp      w8, w9
    b.eq     #0x3613c0
    mov      w9, #0x8e6a
    movk     w9, #0x133a, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldur     x8, [x29, #-0x70]
    ldr      x9, [x8, #0x10]!
    stp      x9, x8, [x29, #-0xe8]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xb8e2
    movk     w9, #0x4666, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      w9, #0x3f9
    movk     w9, #0x2972, lsl #16
    cmp      w8, w9
    b.eq     #0x3613dc
    mov      w9, #0x9269
    movk     w9, #0x2ca3, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldr      x8, [x19, #0x38]
    add      x8, x8, #1
    str      x8, [x19, #0x108]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xf1d
    movk     w9, #0x7c5f, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      w9, #0xff4b
    movk     w9, #0x1a1b, lsl #16
    cmp      w8, w9
    b.eq     #0x361400
    mov      w9, #0x3bf6
    movk     w9, #0x23b6, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldrb     w8, [x19, #0x117]
    cmp      w8, #0
    mov      w8, #0xcfb4
    movk     w8, #0x7968, lsl #16
    mov      w9, #0x9b74
    movk     w9, #0xffe2, lsl #16
    b        #0x361214
    mov      w9, #0x93a4
    movk     w9, #0x3544, lsl #16
    cmp      w8, w9
    b.eq     #0x361430
    mov      w9, #0xbe66
    movk     w9, #0x36a6, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x98]
    stp      x8, x0, [x29, #-0xc0]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x560f
    movk     w9, #0x3133, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      w9, #0x3161
    movk     w9, #0xda90, lsl #16
    cmp      w8, w9
    b.eq     #0x3614c0
    mov      w9, #0x3943
    movk     w9, #0xe1d6, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldp      x1, x8, [x19, #0xb8]
    ldr      x8, [x8]
    ldr      x9, [x19, #0x20]
    ldr      x0, [x8, x9, lsl #3]
    str      x0, [x19, #0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0xa8]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xcb53
    movk     w9, #0x3c0b, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      w9, #0x7b89
    movk     w9, #0x628e, lsl #16
    cmp      w8, w9
    b.eq     #0x361580
    mov      w9, #0x4541
    movk     w9, #0x6893, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldr      x8, [x19, #0x10]
    mov      w9, #0xcfb4
    movk     w9, #0x7968, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      w9, #0xa54b
    movk     w9, #0xb652, lsl #16
    cmp      w8, w9
    b.eq     #0x3615ac
    mov      w9, #0x2c67
    movk     w9, #0xb740, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldurb    w8, [x29, #-0x66]
    eor      w8, w8, #0xffffffef
    adrp     x9, #0x54e000
    add      x9, x9, #0x51d
    strb     w8, [x9]
    adrp     x10, #0x54e000
    add      x10, x10, #0x511
    ldrb     w8, [x10]
    eor      w8, w8, #0xffffffbf
    strb     w8, [x9, #1]
    ldrb     w8, [x10, #1]
    mov      w11, #0xab
    eor      w8, w8, w11
    strb     w8, [x9, #2]
    ldrb     w8, [x10, #2]
    eor      w8, w8, #0x88888888
    strb     w8, [x9, #3]
    ldrb     w8, [x10, #3]
    mov      w11, #0x59
    eor      w8, w8, w11
    strb     w8, [x9, #4]
    ldrb     w8, [x10, #4]
    mov      w11, #0x27
    eor      w8, w8, w11
    strb     w8, [x9, #5]
    ldrb     w8, [x10, #5]
    mov      w11, #0xa
    eor      w8, w8, w11
    strb     w8, [x9, #6]
    ldrb     w8, [x10, #6]
    mov      w11, #0xb9
    eor      w8, w8, w11
    strb     w8, [x9, #7]
    ldrb     w8, [x10, #7]
    mov      w9, #0xd9
    eor      w8, w8, w9
    sturb    w8, [x29, #-0x67]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x9ecd
    movk     w9, #0xed3c, lsl #16
    str      w9, [x8]
    b        #0x360538
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x478]
    stur     x8, [x29, #-0xd0]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xeef2
    movk     w9, #0xc110, lsl #16
    str      w9, [x8]
    b        #0x360538
    ldr      x8, [x19, #0x10]
    mov      w9, #0x285b
    movk     w9, #0xed37, lsl #16
    str      w9, [x8]
    b        #0x360538
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf20]
    ldr      x0, [x19]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #0x10]
    mov      w9, #0x8466
    movk     w9, #0x69d9, lsl #16
    str      w9, [x8]
    b        #0x360538
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xee8]
    stp      x8, x0, [x19, #0x90]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xabd5
    movk     w9, #0x2d0b, lsl #16
    str      w9, [x8]
    b        #0x360538
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x10]
    mov      w9, #0x5968
    movk     w9, #0xe4fd, lsl #16
    str      w9, [x8]
    b        #0x360538
    ldurb    w8, [x29, #-0x65]
    cmp      w8, #0
    mov      w8, #0xf3e1
    movk     w8, #0x3a0a, lsl #16
    mov      w9, #0xc7e3
    movk     w9, #0xf2b2, lsl #16
    csel     w8, w9, w8, ne
    b        #0x361574
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x478]
    stur     x8, [x29, #-0xc8]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x3cf5
    movk     w9, #0x514d, lsl #16
    str      w9, [x8]
    b        #0x360538
    adrp     x8, #0x581000
    add      x8, x8, #0x3a0
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x40
    mov      sp, x8
    stur     x8, [x29, #-0x70]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x7725
    movk     w9, #0xd2fb, lsl #16
    str      w9, [x8]
    b        #0x360538
    ldrb     w8, [x19, #0x77]
    cmp      w8, #0
    mov      w8, #0x8466
    movk     w8, #0x69d9, lsl #16
    mov      w9, #0x3f9
    movk     w9, #0x2972, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [x19, #0x10]
    str      w8, [x9]
    ldr      x8, [x19, #0x78]
    str      x8, [x19, #0x50]
    b        #0x360538
    ldurb    w8, [x29, #-0x91]
    cmp      w8, #0
    mov      w8, #0x285b
    movk     w8, #0xed37, lsl #16
    mov      w9, #0xcf7
    movk     w9, #0x5a47, lsl #16
    csel     w8, w8, w9, ne
    b        #0x361574
    ldr      x8, [x19, #0x88]
    ldr      x9, [x19, #0x28]
    cmp      x8, x9
    cset     w8, eq
    strb     w8, [x19, #0x87]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xc926
    movk     w9, #0xb7bf, lsl #16
    str      w9, [x8]
    b        #0x360538
    ldr      x8, [x19, #0x100]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [x19, #0xff]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xa54b
    movk     w9, #0xb652, lsl #16
    str      w9, [x8]
    b        #0x360538
    ldr      x0, [x19, #0x120]
    bl       #0x347364
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x118]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x8028
    movk     w9, #0xd40c, lsl #16
    str      w9, [x8]
    b        #0x360538
    ldr      x0, [x19, #8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x10]
    mov      w9, #0x9e57
    movk     w9, #0xe528, lsl #16
    str      w9, [x8]
    b        #0x360538
    ldr      x8, [x19, #0x48]
    str      x8, [x19, #0x20]
    ldr      x8, [x19, #0xd8]
    ldr      x8, [x8]
    ldr      x8, [x8]
    ldr      x9, [x19, #0xc8]
    cmp      x8, x9
    mov      w8, #0x3943
    movk     w8, #0xe1d6, lsl #16
    mov      w9, #0x51f0
    movk     w9, #0xfe2a, lsl #16
    b        #0x361570
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x110]
    stur     x8, [x29, #-0xb0]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xbe66
    movk     w9, #0x36a6, lsl #16
    str      w9, [x8]
    b        #0x360538
    adrp     x8, #0x54e000
    ldrb     w8, [x8, #0x510]
    sturb    w8, [x29, #-0x66]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x2c67
    movk     w9, #0xb740, lsl #16
    str      w9, [x8]
    b        #0x360538
    ldur     x0, [x29, #-0xb8]
    ldr      x1, [x19, #0x128]
    ldr      x2, [x19, #0x118]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #0x10]
    mov      w9, #0x4541
    movk     w9, #0x6893, lsl #16
    str      w9, [x8]
    b        #0x360538
    ldr      x8, [x19, #0x10]
    mov      w9, #0xfcf2
    movk     w9, #0xd064, lsl #16
    str      w9, [x8]
    b        #0x360538
    ldur     x8, [x29, #-0xa0]
    cmp      x8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0xa1]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x3811
    movk     w9, #0xf311, lsl #16
    str      w9, [x8]
    b        #0x360538
    ldr      x8, [x19, #0x20]
    add      x8, x8, #1
    str      x8, [x19, #0x88]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xa117
    movk     w9, #0x891c, lsl #16
    str      w9, [x8]
    b        #0x360538
    ldr      x0, [x19, #0xb0]
    ldp      x1, x2, [x19, #0x90]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, #0x98]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x10]
    mov      w9, #0xa48
    movk     w9, #0x9e1c, lsl #16
    str      w9, [x8]
    b        #0x360538
    ldr      x8, [x19, #0x10]
    mov      w9, #0x2985
    movk     w9, #0x80a3, lsl #16
    str      w9, [x8]
    ldur     x8, [x29, #-0xd0]
    str      x8, [x19, #0x58]
    b        #0x360538
    ldr      x8, [x19, #0x50]
    str      x8, [x19, #0x28]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xdd0]
    str      x8, [x19, #0xb8]
    ldr      x8, [x19, #0x10]
    str      w20, [x8]
    str      xzr, [x19, #0x48]
    b        #0x360538
    ldr      x8, [x19, #0x60]
    str      x8, [x19, #0x38]
    ldur     x8, [x29, #-0xe0]
    ldr      x8, [x8]
    ldr      x8, [x8]
    ldur     x9, [x29, #-0xf0]
    cmp      x8, x9
    mov      w8, #0xfcf2
    movk     w8, #0xd064, lsl #16
    mov      w9, #0x8b67
    movk     w9, #0x97aa, lsl #16
    b        #0x361570
    ldp      x3, x2, [x29, #-0x78]
    ldur     x1, [x29, #-0xd0]
    mov      x0, x21
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x100]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x8ac1
    movk     w9, #0x8576, lsl #16
    str      w9, [x8]
    b        #0x360538
    sub      x8, sp, #0x80
    mov      sp, x8
    stur     x8, [x29, #-0x78]
    sub      x8, sp, #0x40
    mov      sp, x8
    stur     x8, [x29, #-0x80]
    sub      x8, sp, #0x80
    mov      sp, x8
    stur     x8, [x29, #-0x88]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    ldr      x0, [x19, #8]
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    stur     x1, [x29, #-0x90]
    adrp     x2, #0x54e000
    add      x2, x2, #0x550
    bl       #0x461c6c // _objc_msgSend
    sturb    w0, [x29, #-0x91]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xec68
    movk     w9, #0x8065, lsl #16
    str      w9, [x8]
    b        #0x360538
    ldr      x8, [x19, #0x78]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [x19, #0x77]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x5142
    movk     w9, #0x48f8, lsl #16
    str      w9, [x8]
    b        #0x360538
    ldr      x0, [x19, #0xe8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x10]
    mov      w9, #0x68cc
    movk     w9, #0x74, lsl #16
    str      w9, [x8]
    b        #0x360538
    ldrb     w8, [x19, #0x87]
    cmp      w8, #0
    mov      w8, #0x7b89
    movk     w8, #0x628e, lsl #16
    csel     w8, w8, w20, ne
    ldr      x9, [x19, #0x10]
    str      w8, [x9]
    ldr      x8, [x19, #0x88]
    str      x8, [x19, #0x48]
    b        #0x360538
    ldr      x0, [x19, #0x118]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x10]
    mov      w9, #0x9269
    movk     w9, #0x2ca3, lsl #16
    str      w9, [x8]
    b        #0x360538
    ldp      x3, x2, [x29, #-0x78]
    ldur     x1, [x29, #-0xd0]
    mov      x0, x21
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xd8]
    cmp      x0, #0
    mov      w8, #0xe23b
    movk     w8, #0x27d8, lsl #16
    mov      w9, #0x8e6a
    movk     w9, #0x133a, lsl #16
    csel     w8, w8, w9, eq
    ldr      x9, [x19, #0x10]
    str      w8, [x9]
    b        #0x360538
    ldp      x3, x2, [x29, #-0x88]
    ldr      x0, [x19, #0xe8]
    ldr      x1, [x19, #0x30]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x78]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x3161
    movk     w9, #0xda90, lsl #16
    str      w9, [x8]
    b        #0x360538
    ldrb     w8, [x19, #0xff]
    cmp      w8, #0
    mov      w8, #0x5ed4
    movk     w8, #0x888c, lsl #16
    mov      w9, #0xe23b
    movk     w9, #0x27d8, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [x19, #0x10]
    str      w8, [x9]
    ldr      x8, [x19, #0x100]
    str      x8, [x19, #0x68]
    b        #0x360538
    mov      w9, #0x5968
    movk     w9, #0xe4fd, lsl #16
    cmp      w8, w9
    b.ne     #0x360538
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x361624
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGHomeGroups customGroupWithRule:] IMP=0x361628 bounds=0x361628-0x361C84
loc_361628:
    sub      sp, sp, #0x1f0
    stp      x28, x27, [sp, #0x190]
    stp      x26, x25, [sp, #0x1a0]
    stp      x24, x23, [sp, #0x1b0]
    stp      x22, x21, [sp, #0x1c0]
    stp      x20, x19, [sp, #0x1d0]
    stp      x29, x30, [sp, #0x1e0]
    add      x29, sp, #0x1e0
    mov      x21, x2
    mov      x24, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    mov      w25, #0xfcaf
    movk     w25, #0xfe81, lsl #16
    stur     x8, [x29, #-0x60]
    mov      w8, #0xb504
    movk     w8, #0xcfdd, lsl #16
    str      w8, [sp, #0xbc]
    add      x8, sp, #0xbc
    str      x8, [sp, #0xb0]
    mov      w27, #0x1372
    movk     w27, #0xef20, lsl #16
    mov      w28, #0xacba
    movk     w28, #0xbab5, lsl #16
    mov      w26, #0x1b19
    movk     w26, #0x8f49, lsl #16
    mov      w19, #0xc34b
    movk     w19, #0xd1ac, lsl #16
    mov      w23, #0xf66b
    movk     w23, #0x47f3, lsl #16
    mov      w20, #0xc4a2
    movk     w20, #0x14f0, lsl #16
    mov      w22, #0xd3e9
    movk     w22, #0x606c, lsl #16
    ldr      w8, [sp, #0xbc]
    cmp      w8, w27
    b.gt     #0x361724
    cmp      w8, w28
    b.gt     #0x361790
    cmp      w8, w26
    b.le     #0x361958
    mov      w9, #0xbc1b
    movk     w9, #0xa1de, lsl #16
    cmp      w8, w9
    b.gt     #0x3619b0
    mov      w9, #0x1b1a
    movk     w9, #0x8f49, lsl #16
    cmp      w8, w9
    b.eq     #0x3619d4
    mov      w9, #0x7a34
    movk     w9, #0x96b9, lsl #16
    cmp      w8, w9
    b.ne     #0x3616b4
    ldr      x8, [sp, #0x58]
    cmp      x8, x21
    cset     w8, eq
    strb     w8, [sp, #0x57]
    ldr      x8, [sp, #0xb0]
    mov      w9, #0xc186
    movk     w9, #0x4c0e, lsl #16
    str      w9, [x8]
    b        #0x3616b4
    cmp      w8, w23
    b.gt     #0x3617e8
    cmp      w8, w20
    b.gt     #0x3618a8
    mov      w9, #0x1373
    movk     w9, #0xef20, lsl #16
    cmp      w8, w9
    b.eq     #0x361b5c
    cmp      w8, w25
    b.eq     #0x361a60
    mov      w9, #0xb8ff
    movk     w9, #0x975, lsl #16
    cmp      w8, w9
    b.ne     #0x3616b4
    ldrb     w8, [sp, #0x37]
    cmp      w8, #0
    mov      w8, #0x81d9
    movk     w8, #0x8050, lsl #16
    mov      w9, #0xc4a3
    movk     w9, #0x14f0, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #0xb0]
    str      w8, [x9]
    ldr      x8, [sp, #0x38]
    str      x8, [sp, #0x28]
    str      xzr, [sp, #0x18]
    b        #0x3616b4
    cmp      w8, w19
    b.gt     #0x36184c
    mov      w9, #0xacbb
    movk     w9, #0xbab5, lsl #16
    cmp      w8, w9
    b.eq     #0x361af4
    mov      w9, #0x2dc3
    movk     w9, #0xc7d3, lsl #16
    cmp      w8, w9
    b.eq     #0x361a14
    mov      w9, #0xb504
    movk     w9, #0xcfdd, lsl #16
    cmp      w8, w9
    b.ne     #0x3616b4
    cmp      x21, #0
    cset     w8, eq
    strb     w8, [sp, #0xaf]
    ldr      x8, [sp, #0xb0]
    mov      w9, #0xcd1a
    movk     w9, #0xe73d, lsl #16
    str      w9, [x8]
    b        #0x3616b4
    cmp      w8, w22
    b.gt     #0x3618fc
    mov      w9, #0xf66c
    movk     w9, #0x47f3, lsl #16
    cmp      w8, w9
    b.eq     #0x361b84
    mov      w9, #0xc186
    movk     w9, #0x4c0e, lsl #16
    cmp      w8, w9
    b.eq     #0x361a90
    mov      w9, #0x4d5e
    movk     w9, #0x54b4, lsl #16
    cmp      w8, w9
    b.ne     #0x3616b4
    ldr      x8, [sp, #0x80]
    ldr      x8, [x8]
    ldr      x9, [x8]
    add      x8, sp, #0xc0
    add      x8, x8, #8
    stp      x8, x9, [sp, #0x70]
    ldr      x8, [sp, #0xb0]
    mov      w9, #0x129d
    movk     w9, #0x62dc, lsl #16
    str      w9, [x8]
    b        #0x3616b4
    mov      w9, #0xc34c
    movk     w9, #0xd1ac, lsl #16
    cmp      w8, w9
    b.eq     #0x361b20
    mov      w9, #0x64fe
    movk     w9, #0xdf38, lsl #16
    cmp      w8, w9
    b.eq     #0x361a44
    mov      w9, #0xcd1a
    movk     w9, #0xe73d, lsl #16
    cmp      w8, w9
    b.ne     #0x3616b4
    ldrb     w8, [sp, #0xaf]
    cmp      w8, #0
    mov      w8, #0xbc1c
    movk     w8, #0xa1de, lsl #16
    mov      w9, #0xdd71
    movk     w9, #0x7858, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [sp, #0xb0]
    str      w8, [x9]
    str      xzr, [sp, #0x10]
    b        #0x3616b4
    mov      w9, #0xc4a3
    movk     w9, #0x14f0, lsl #16
    cmp      w8, w9
    b.eq     #0x361ba0
    mov      w9, #0x8809
    movk     w9, #0x1b46, lsl #16
    cmp      w8, w9
    b.eq     #0x361ab8
    mov      w9, #0x8d62
    movk     w9, #0x46d0, lsl #16
    cmp      w8, w9
    b.ne     #0x3616b4
    ldr      x8, [sp, #0x38]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [sp, #0x37]
    ldr      x8, [sp, #0xb0]
    mov      w9, #0xb8ff
    movk     w9, #0x975, lsl #16
    str      w9, [x8]
    b        #0x3616b4
    mov      w9, #0xd3ea
    movk     w9, #0x606c, lsl #16
    cmp      w8, w9
    b.eq     #0x361be4
    mov      w9, #0x129d
    movk     w9, #0x62dc, lsl #16
    cmp      w8, w9
    b.eq     #0x361ad8
    mov      w9, #0xdd71
    movk     w9, #0x7858, lsl #16
    cmp      w8, w9
    b.ne     #0x3616b4
    add      x0, x24, #8
    str      x0, [sp, #0xa0]
    bl       #0x461d68 // _os_unfair_lock_lock
    movi     v0.16b, #0
    stp      q0, q0, [sp, #0xe0]
    stp      q0, q0, [sp, #0xc0]
    ldr      x8, [sp, #0xb0]
    mov      w9, #0xacbb
    movk     w9, #0xbab5, lsl #16
    str      w9, [x8]
    b        #0x3616b4
    mov      w9, #0x81d9
    movk     w9, #0x8050, lsl #16
    cmp      w8, w9
    b.eq     #0x361c10
    mov      w9, #0x5ba9
    movk     w9, #0x83e1, lsl #16
    cmp      w8, w9
    b.eq     #0x361b40
    mov      w9, #0xfeeb
    movk     w9, #0x8454, lsl #16
    cmp      w8, w9
    b.ne     #0x3616b4
    ldrb     w8, [sp, #0x47]
    cmp      w8, #0
    mov      w8, #0xd3ea
    movk     w8, #0x606c, lsl #16
    csel     w8, w8, w25, ne
    ldr      x9, [sp, #0xb0]
    str      w8, [x9]
    ldr      x8, [sp, #0x48]
    str      x8, [sp, #0x20]
    b        #0x3616b4
    mov      w9, #0x8a0f
    movk     w9, #0xb7ba, lsl #16
    cmp      w8, w9
    b.ne     #0x361c34
    ldr      x8, [sp, #0xb0]
    mov      w9, #0x2dc3
    movk     w9, #0xc7d3, lsl #16
    str      w9, [x8]
    b        #0x3616b4
    ldp      x1, x0, [sp, #0x90]
    add      x2, sp, #0xc0
    sub      x3, x29, #0xe0
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x88]
    cmp      x0, #0
    mov      w8, #0xc4a3
    movk     w8, #0x14f0, lsl #16
    mov      w9, #0x8809
    movk     w9, #0x1b46, lsl #16
    csel     w8, w8, w9, eq
    ldr      x9, [sp, #0xb0]
    str      w8, [x9]
    str      xzr, [sp, #0x18]
    b        #0x3616b4
    ldp      x1, x8, [sp, #0x68]
    ldr      x8, [x8]
    ldr      x9, [sp]
    ldr      x0, [x8, x9, lsl #3]
    str      x0, [sp, #0x60]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x58]
    ldr      x8, [sp, #0xb0]
    mov      w9, #0x7a34
    movk     w9, #0x96b9, lsl #16
    str      w9, [x8]
    b        #0x3616b4
    ldr      x0, [sp, #0x60]
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp, #0xb0]
    mov      w9, #0x5ba9
    movk     w9, #0x83e1, lsl #16
    str      w9, [x8]
    b        #0x3616b4
    ldr      x8, [sp, #0x20]
    str      x8, [sp]
    ldp      x9, x8, [sp, #0x78]
    ldr      x8, [x8]
    ldr      x8, [x8]
    cmp      x8, x9
    mov      w8, #0x2dc3
    movk     w8, #0xc7d3, lsl #16
    mov      w9, #0xf66c
    movk     w9, #0x47f3, lsl #16
    csel     w8, w8, w9, eq
    b        #0x361aac
    ldrb     w8, [sp, #0x57]
    cmp      w8, #0
    mov      w8, #0xc34c
    movk     w8, #0xd1ac, lsl #16
    mov      w9, #0x64fe
    movk     w9, #0xdf38, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #0xb0]
    str      w8, [x9]
    b        #0x3616b4
    add      x8, sp, #0xc0
    add      x8, x8, #0x10
    str      x8, [sp, #0x80]
    ldr      x8, [sp, #0xb0]
    mov      w9, #0x4d5e
    movk     w9, #0x54b4, lsl #16
    str      w9, [x8]
    b        #0x3616b4
    ldr      x8, [sp, #0xb0]
    mov      w9, #0x81d9
    movk     w9, #0x8050, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x88]
    str      x8, [sp, #0x28]
    b        #0x3616b4
    ldr      x0, [x24, #0x10]
    str      x0, [sp, #0x98]
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x478]
    str      x8, [sp, #0x90]
    ldr      x8, [sp, #0xb0]
    mov      w9, #0x1b1a
    movk     w9, #0x8f49, lsl #16
    str      w9, [x8]
    b        #0x3616b4
    ldr      x8, [sp]
    add      x8, x8, #1
    str      x8, [sp, #0x48]
    ldr      x8, [sp, #0xb0]
    mov      w9, #0x1373
    movk     w9, #0xef20, lsl #16
    str      w9, [x8]
    b        #0x3616b4
    ldr      x8, [sp, #0xb0]
    mov      w9, #0xc4a3
    movk     w9, #0x14f0, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x60]
    str      x8, [sp, #0x18]
    b        #0x3616b4
    ldr      x8, [sp, #0x48]
    ldr      x9, [sp, #8]
    cmp      x8, x9
    cset     w8, eq
    strb     w8, [sp, #0x47]
    ldr      x8, [sp, #0xb0]
    mov      w9, #0xfeeb
    movk     w9, #0x8454, lsl #16
    str      w9, [x8]
    b        #0x3616b4
    ldr      x0, [sp, #0x98]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp, #0xb0]
    mov      w9, #0x8a0f
    movk     w9, #0xb7ba, lsl #16
    str      w9, [x8]
    b        #0x3616b4
    mov      x25, x24
    mov      x24, x21
    ldr      x21, [sp, #0x18]
    ldr      x0, [sp, #0x98]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0xa0]
    bl       #0x461d74 // _os_unfair_lock_unlock
    ldr      x8, [sp, #0xb0]
    mov      w9, #0xbc1c
    movk     w9, #0xa1de, lsl #16
    str      w9, [x8]
    str      x21, [sp, #0x10]
    mov      x21, x24
    mov      x24, x25
    mov      w25, #0xfcaf
    movk     w25, #0xfe81, lsl #16
    b        #0x3616b4
    ldp      x1, x0, [sp, #0x90]
    add      x2, sp, #0xc0
    sub      x3, x29, #0xe0
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x38]
    ldr      x8, [sp, #0xb0]
    mov      w9, #0x8d62
    movk     w9, #0x46d0, lsl #16
    str      w9, [x8]
    b        #0x3616b4
    ldr      x8, [sp, #0x28]
    str      x8, [sp, #8]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xd08]
    str      x8, [sp, #0x68]
    ldr      x8, [sp, #0xb0]
    str      w25, [x8]
    str      xzr, [sp, #0x20]
    b        #0x3616b4
    mov      w9, #0xbc1c
    movk     w9, #0xa1de, lsl #16
    cmp      w8, w9
    b.ne     #0x3616b4
    ldr      x0, [sp, #0x10]
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x361c80
    ldp      x29, x30, [sp, #0x1e0]
    ldp      x20, x19, [sp, #0x1d0]
    ldp      x22, x21, [sp, #0x1c0]
    ldp      x24, x23, [sp, #0x1b0]
    ldp      x26, x25, [sp, #0x1a0]
    ldp      x28, x27, [sp, #0x190]
    add      sp, sp, #0x1f0
    b        #0x461be8 // _objc_autoreleaseReturnValue
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGHomeGroups restoreDefaultGroupOfRule:] IMP=0x361C84 bounds=0x361C84-0x362324
loc_361C84:
    sub      sp, sp, #0xd0
    stp      x28, x27, [sp, #0x70]
    stp      x26, x25, [sp, #0x80]
    stp      x24, x23, [sp, #0x90]
    stp      x22, x21, [sp, #0xa0]
    stp      x20, x19, [sp, #0xb0]
    stp      x29, x30, [sp, #0xc0]
    add      x29, sp, #0xc0
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x581000
    add      x8, x8, #0x3a8
    ldar     w8, [x8]
    stur     w8, [x29, #-0x54]
    mov      w8, #0x8a28
    movk     w8, #0xd260, lsl #16
    str      w8, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w26, #0x8f9
    movk     w26, #0xdfd, lsl #16
    mov      w27, #0x6b6d
    movk     w27, #0xc7c5, lsl #16
    mov      w23, #0xf7e0
    movk     w23, #0xdf11, lsl #16
    sub      x8, x2, #1
    str      x8, [sp]
    mov      w24, #0x5a35
    movk     w24, #0x58f6, lsl #16
    mov      w21, #0x40bf
    movk     w21, #0x3466, lsl #16
    adrp     x28, #0x54e000
    add      x28, x28, #0x58c
    adrp     x25, #0x54e000
    add      x25, x25, #0x594
    mov      w22, #0x62f4
    movk     w22, #0x7881, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w26
    b.le     #0x361dd4
    cmp      w8, w24
    b.le     #0x361e4c
    cmp      w8, w22
    b.le     #0x362058
    mov      w9, #0x62f5
    movk     w9, #0x7881, lsl #16
    cmp      w8, w9
    b.eq     #0x3622a4
    mov      w9, #0x4332
    movk     w9, #0x7a59, lsl #16
    cmp      w8, w9
    b.eq     #0x362264
    mov      w9, #0xb75
    movk     w9, #0x7d9d, lsl #16
    cmp      w8, w9
    b.ne     #0x361d18
    ldurh    w8, [x29, #-0x58]
    adrp     x9, #0x54e000
    add      x9, x9, #0x5a2
    strh     w8, [x9]
    adrp     x10, #0x54e000
    add      x10, x10, #0x59e
    ldrh     w8, [x10]
    mov      w11, #0xfd4f
    eor      w8, w8, w11
    strh     w8, [x9, #2]
    ldrh     w8, [x10, #2]
    mov      w10, #0xa550
    eor      w8, w8, w10
    strh     w8, [x9, #4]
    adrp     x10, #0x54e000
    add      x10, x10, #0x57c
    ldrh     w8, [x10]
    mov      w9, #0xb7be
    eor      w8, w8, w9
    adrp     x9, #0x54e000
    strh     w8, [x9, #0x584]
    ldrh     w8, [x10, #2]
    sturh    w8, [x29, #-0x5a]
    ldr      x8, [sp, #8]
    mov      w9, #0x8da9
    movk     w9, #0x2f76, lsl #16
    str      w9, [x8]
    b        #0x361d18
    cmp      w8, w27
    b.le     #0x361f48
    cmp      w8, w23
    b.le     #0x362014
    mov      w9, #0xf7e1
    movk     w9, #0xdf11, lsl #16
    cmp      w8, w9
    b.eq     #0x3621f8
    mov      w9, #0x21c1
    movk     w9, #0xd7, lsl #16
    cmp      w8, w9
    b.eq     #0x362134
    mov      w9, #0x1535
    movk     w9, #0xbbb, lsl #16
    cmp      w8, w9
    b.ne     #0x361d18
    ldp      x1, x0, [sp, #0x40]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0xb80]
    str      x8, [sp, #0x38]
    cmp      x19, #6
    cset     w8, lo
    strb     w8, [sp, #0x37]
    ldr      x8, [sp, #8]
    mov      w9, #0x5a36
    movk     w9, #0x58f6, lsl #16
    str      w9, [x8]
    b        #0x361d18
    cmp      w8, w21
    b.gt     #0x361fd4
    mov      w9, #0x7397
    movk     w9, #0x1026, lsl #16
    cmp      w8, w9
    b.eq     #0x36223c
    mov      w9, #0x8da9
    movk     w9, #0x2f76, lsl #16
    cmp      w8, w9
    b.ne     #0x3622f4
    ldurh    w8, [x29, #-0x5a]
    mov      w9, #0xd3c0
    eor      w8, w8, w9
    adrp     x9, #0x54e000
    add      x9, x9, #0x586
    strh     w8, [x9]
    adrp     x10, #0x54e000
    add      x10, x10, #0x580
    ldrh     w8, [x10]
    mov      w11, #0x5ced
    eor      w8, w8, w11
    strh     w8, [x9, #2]
    ldrh     w8, [x10, #2]
    mov      w10, #0x1b92
    eor      w8, w8, w10
    strh     w8, [x9, #4]
    adrp     x9, #0x54e000
    add      x9, x9, #0x5a8
    ldrh     w8, [x9]
    mov      w10, #0x918a
    eor      w8, w8, w10
    adrp     x10, #0x54e000
    add      x10, x10, #0x5ae
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0xa464
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w9, #0x1cf2
    eor      w8, w8, w9
    strh     w8, [x10, #4]
    adrp     x9, #0x54e000
    add      x9, x9, #0x570
    ldrh     w8, [x9]
    mov      w10, #0x47b8
    eor      w8, w8, w10
    adrp     x10, #0x54e000
    add      x10, x10, #0x576
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0x532b
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w9, #0x4890
    eor      w8, w8, w9
    strh     w8, [x10, #4]
    ldr      x8, [sp, #8]
    mov      w9, #0xa94
    movk     w9, #0xbca4, lsl #16
    str      w9, [x8]
    b        #0x361d18
    mov      w9, #0xa93
    movk     w9, #0xbca4, lsl #16
    cmp      w8, w9
    b.gt     #0x361f94
    mov      w9, #0xab10
    movk     w9, #0x87c2, lsl #16
    cmp      w8, w9
    b.eq     #0x3620a0
    mov      w9, #0xdae5
    movk     w9, #0x87d8, lsl #16
    cmp      w8, w9
    b.ne     #0x361d18
    ldurb    w8, [x29, #-0x55]
    cmp      w8, #0
    mov      w8, #0xa94
    movk     w8, #0xbca4, lsl #16
    mov      w9, #0x40c0
    movk     w9, #0x3466, lsl #16
    b        #0x362090
    mov      w9, #0xa94
    movk     w9, #0xbca4, lsl #16
    cmp      w8, w9
    b.eq     #0x362110
    mov      w9, #0x2a69
    movk     w9, #0xbf67, lsl #16
    cmp      w8, w9
    b.ne     #0x361d18
    cmp      x19, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x5b]
    ldr      x8, [sp, #8]
    mov      w9, #0x59e6
    movk     w9, #0x574f, lsl #16
    str      w9, [x8]
    b        #0x361d18
    mov      w9, #0x40c0
    movk     w9, #0x3466, lsl #16
    cmp      w8, w9
    b.eq     #0x362150
    mov      w9, #0x59e6
    movk     w9, #0x574f, lsl #16
    cmp      w8, w9
    b.ne     #0x361d18
    ldurb    w8, [x29, #-0x5b]
    cmp      w8, #0
    mov      w8, #0x8fa
    movk     w8, #0xdfd, lsl #16
    mov      w9, #0x4332
    movk     w9, #0x7a59, lsl #16
    csel     w8, w8, w9, ne
    b        #0x362094
    mov      w9, #0x6b6e
    movk     w9, #0xc7c5, lsl #16
    cmp      w8, w9
    b.eq     #0x362210
    mov      w9, #0x8a28
    movk     w9, #0xd260, lsl #16
    cmp      w8, w9
    b.ne     #0x361d18
    ldur     w8, [x29, #-0x54]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x55]
    ldr      x8, [sp, #8]
    mov      w9, #0xdae5
    movk     w9, #0x87d8, lsl #16
    str      w9, [x8]
    b        #0x361d18
    mov      w9, #0x5a36
    movk     w9, #0x58f6, lsl #16
    cmp      w8, w9
    b.eq     #0x3622c0
    mov      w9, #0xcc19
    movk     w9, #0x666d, lsl #16
    cmp      w8, w9
    b.ne     #0x361d18
    ldrb     w8, [sp, #0x57]
    cmp      w8, #0
    mov      w8, #0x8fa
    movk     w8, #0xdfd, lsl #16
    mov      w9, #0x6b6e
    movk     w9, #0xc7c5, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x361d18
    ldr      x2, [sp, #0x18]
    ldr      x0, [sp, #0x48]
    ldr      x1, [sp, #0x38]
    bl       #0x461c6c // _objc_msgSend
    add      x0, x20, #8
    bl       #0x461d68 // _os_unfair_lock_lock
    ldr      x0, [x20, #0x10]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x830]
    ldr      x2, [sp, #0x48]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf20]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    add      x0, x20, #8
    bl       #0x461d74 // _os_unfair_lock_unlock
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xaf8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x48]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0x8fa
    movk     w9, #0xdfd, lsl #16
    str      w9, [x8]
    b        #0x361d18
    adrp     x8, #0x581000
    add      x8, x8, #0x3a8
    mov      w9, #1
    stlr     w9, [x8]
    ldr      x8, [sp, #8]
    mov      w9, #0x2a69
    movk     w9, #0xbf67, lsl #16
    str      w9, [x8]
    b        #0x361d18
    ldr      x0, [sp, #0x58]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0xcc19
    movk     w9, #0x666d, lsl #16
    str      w9, [x8]
    b        #0x361d18
    adrp     x9, #0x54e000
    add      x9, x9, #0x5b4
    ldrh     w8, [x9]
    mov      w10, #0xb2c9
    eor      w8, w8, w10
    adrp     x10, #0x54e000
    add      x10, x10, #0x5ba
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0x4e84
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w9, #0xb843
    eor      w8, w8, w9
    strh     w8, [x10, #4]
    ldrh     w8, [x28]
    mov      w9, #0xd68
    eor      w8, w8, w9
    strh     w8, [x25]
    ldrh     w8, [x28, #2]
    mov      w9, #0xe415
    eor      w8, w8, w9
    strh     w8, [x25, #2]
    ldrh     w8, [x28, #4]
    mov      w9, #0x6f1f
    eor      w8, w8, w9
    strh     w8, [x25, #4]
    ldrh     w8, [x28, #6]
    mov      w9, #0x6f3
    eor      w8, w8, w9
    strh     w8, [x25, #6]
    adrp     x8, #0x54e000
    ldrh     w8, [x8, #0x59c]
    mov      w9, #0xa396
    eor      w8, w8, w9
    sturh    w8, [x29, #-0x58]
    ldr      x8, [sp, #8]
    mov      w9, #0xb75
    movk     w9, #0x7d9d, lsl #16
    str      w9, [x8]
    b        #0x361d18
    ldp      x9, x8, [sp]
    str      x9, [sp, #0x28]
    mov      w9, #0x7397
    movk     w9, #0x1026, lsl #16
    str      w9, [x8]
    b        #0x361d18
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x5f8]
    bl       #0x461bac // _objc_alloc_init
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xef0]
    stp      x8, x0, [sp, #0x40]
    ldr      x8, [sp, #8]
    mov      w9, #0x1535
    movk     w9, #0xbbb, lsl #16
    str      w9, [x8]
    b        #0x361d18
    ldr      x8, [sp, #0x28]
    adrp     x9, #0x4a4000
    add      x9, x9, #0xf58
    ldr      x8, [x9, x8, lsl #3]
    str      x8, [sp, #0x20]
    ldr      x8, [sp, #8]
    mov      w9, #0x62f5
    movk     w9, #0x7881, lsl #16
    str      w9, [x8]
    b        #0x361d18
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf70]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x58]
    cmp      x0, #0
    cset     w8, eq
    strb     w8, [sp, #0x57]
    ldr      x8, [sp, #8]
    mov      w9, #0x21c1
    movk     w9, #0xd7, lsl #16
    str      w9, [x8]
    b        #0x361d18
    ldr      x8, [sp, #8]
    mov      w9, #0xab10
    movk     w9, #0x87c2, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x20]
    str      x8, [sp, #0x18]
    b        #0x361d18
    ldrb     w8, [sp, #0x37]
    cmp      w8, #0
    mov      w8, #0xab10
    movk     w8, #0x87c2, lsl #16
    mov      w9, #0xf7e1
    movk     w9, #0xdf11, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    adrp     x8, #0x54e000
    add      x8, x8, #0x720
    str      x8, [sp, #0x18]
    b        #0x361d18
    mov      w9, #0x8fa
    movk     w9, #0xdfd, lsl #16
    cmp      w8, w9
    b.ne     #0x361d18
    ldp      x29, x30, [sp, #0xc0]
    ldp      x20, x19, [sp, #0xb0]
    ldp      x22, x21, [sp, #0xa0]
    ldp      x24, x23, [sp, #0x90]
    ldp      x26, x25, [sp, #0x80]
    ldp      x28, x27, [sp, #0x70]
    add      sp, sp, #0xd0
    ret      

// -[WCLGHomeGroups moveCustomGroupFromIndex:toIndex:] IMP=0x362324 bounds=0x362324-0x362620
loc_362324:
    sub      sp, sp, #0xb0
    stp      x28, x27, [sp, #0x50]
    stp      x26, x25, [sp, #0x60]
    stp      x24, x23, [sp, #0x70]
    stp      x22, x21, [sp, #0x80]
    stp      x20, x19, [sp, #0x90]
    stp      x29, x30, [sp, #0xa0]
    add      x29, sp, #0xa0
    mov      x20, x3
    mov      x21, x2
    mov      x19, x0
    mov      w22, #0x5d3e
    movk     w22, #0x8182, lsl #16
    add      x0, x0, #8
    str      x0, [sp, #0x48]
    bl       #0x461d68 // _os_unfair_lock_lock
    mov      w9, #0xa9e9
    movk     w9, #0xfbea, lsl #16
    add      x8, sp, #0xc
    str      w9, [sp, #0xc]
    mov      w24, #0xa9e8
    movk     w24, #0xfbea, lsl #16
    mov      w25, #0x73e9
    movk     w25, #0xbbf8, lsl #16
    str      x8, [sp]
    mov      w28, #0xd308
    movk     w28, #0xbd93, lsl #16
    mov      w27, #0x73ea
    movk     w27, #0xbbf8, lsl #16
    mov      w23, #0x5749
    movk     w23, #0x2a6e, lsl #16
    mov      w26, #0x5748
    movk     w26, #0x2a6e, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w24
    b.le     #0x362408
    cmp      w8, w26
    b.gt     #0x36245c
    mov      w9, #0xa9e9
    movk     w9, #0xfbea, lsl #16
    cmp      w8, w9
    b.eq     #0x36258c
    mov      w9, #0xc9f
    movk     w9, #0x1718, lsl #16
    cmp      w8, w9
    b.eq     #0x362520
    mov      w9, #0x18ba
    movk     w9, #0x2570, lsl #16
    cmp      w8, w9
    b.ne     #0x3623a8
    ldr      x8, [sp, #0x38]
    cmp      x8, x21
    cset     w8, le
    strb     w8, [sp, #0x37]
    ldr      x8, [sp]
    str      w27, [x8]
    b        #0x3623a8
    cmp      w8, w25
    b.le     #0x3624cc
    cmp      w8, w27
    b.eq     #0x3625a8
    cmp      w8, w28
    b.eq     #0x362540
    mov      w9, #0x4039
    movk     w9, #0xfb60, lsl #16
    cmp      w8, w9
    b.ne     #0x3623a8
    ldr      x8, [sp, #0x40]
    ldr      x0, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x38]
    cmp      x21, #0
    mov      w8, #0x18ba
    movk     w8, #0x2570, lsl #16
    csel     w8, w8, w22, ge
    b        #0x362580
    cmp      w8, w23
    b.eq     #0x36256c
    mov      w9, #0xdd69
    movk     w9, #0x64ff, lsl #16
    cmp      w8, w9
    b.ne     #0x3625e8
    ldr      x8, [sp, #0x40]
    ldr      x0, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x840]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x40]
    ldr      x0, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x5f0]
    ldr      x2, [sp, #0x18]
    mov      x3, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x3623a8
    cmp      w8, w22
    b.eq     #0x362504
    mov      w9, #0xefb7
    movk     w9, #0x81bf, lsl #16
    cmp      w8, w9
    b.ne     #0x3623a8
    ldr      x8, [sp, #0x40]
    ldr      x9, [x8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x608]
    stp      x8, x9, [sp, #0x20]
    ldr      x8, [sp]
    str      w28, [x8]
    b        #0x3623a8
    ldr      x0, [sp, #0x48]
    bl       #0x461d74 // _os_unfair_lock_unlock
    ldr      x8, [sp]
    mov      w9, #0xc9f
    movk     w9, #0x1718, lsl #16
    str      w9, [x8]
    b        #0x3623a8
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xf28]
    str      x8, [sp, #0x10]
    ldr      x8, [sp]
    mov      w9, #0xfe6e
    movk     w9, #0x3092, lsl #16
    str      w9, [x8]
    b        #0x3623a8
    ldp      x1, x0, [sp, #0x20]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x18]
    ldr      x8, [sp]
    mov      w9, #0xdd69
    movk     w9, #0x64ff, lsl #16
    str      w9, [x8]
    b        #0x3623a8
    ldrb     w8, [sp, #0x36]
    cmp      w8, #0
    mov      w8, #0xefb7
    movk     w8, #0x81bf, lsl #16
    csel     w8, w22, w8, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x3623a8
    add      x8, x19, #0x10
    str      x8, [sp, #0x40]
    ldr      x8, [sp]
    mov      w9, #0x4039
    movk     w9, #0xfb60, lsl #16
    str      w9, [x8]
    b        #0x3623a8
    cmp      x20, #0
    cset     w8, lt
    ldrb     w9, [sp, #0x37]
    orr      w8, w8, w9
    ldr      x9, [sp, #0x38]
    cmp      x9, x20
    cset     w9, le
    cmp      x21, x20
    cset     w10, eq
    orr      w8, w10, w8
    orr      w8, w8, w9
    and      w8, w8, #1
    strb     w8, [sp, #0x36]
    ldr      x8, [sp]
    str      w23, [x8]
    b        #0x3623a8
    mov      w9, #0xfe6e
    movk     w9, #0x3092, lsl #16
    cmp      w8, w9
    b.ne     #0x3623a8
    ldr      x1, [sp, #0x10]
    mov      x0, x19
    ldp      x29, x30, [sp, #0xa0]
    ldp      x20, x19, [sp, #0x90]
    ldp      x22, x21, [sp, #0x80]
    ldp      x24, x23, [sp, #0x70]
    ldp      x26, x25, [sp, #0x60]
    ldp      x28, x27, [sp, #0x50]
    add      sp, sp, #0xb0
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups moveDisplayGroupFromIndex:toIndex:] IMP=0x362620 bounds=0x362620-0x362E9C
loc_362620:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x1e0
    mov      x19, x3
    mov      x20, x2
    mov      x21, x0
    add      x22, sp, #0x100
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x68]
    mov      w23, #0xae08
    movk     w23, #0xee64, lsl #16
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xce0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      w9, #0x41a1
    movk     w9, #0x740a, lsl #16
    str      x0, [sp, #0xf8]
    add      x8, sp, #0x14
    mov      w26, #0xe379
    movk     w26, #0x41, lsl #16
    str      w9, [sp, #0x14]
    mov      w25, #0xe785
    movk     w25, #0xe179, lsl #16
    str      x8, [sp, #8]
    mov      w24, #0x4b6f
    movk     w24, #0x3a98, lsl #16
    mov      w28, #0xfe69
    movk     w28, #0x16b7, lsl #16
    mov      w27, #0x41a0
    movk     w27, #0x740a, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w26
    b.gt     #0x36272c
    cmp      w8, w25
    b.gt     #0x36279c
    mov      w9, #0xc51e
    movk     w9, #0x97cf, lsl #16
    cmp      w8, w9
    b.le     #0x362868
    mov      w9, #0x2291
    movk     w9, #0x9eb5, lsl #16
    cmp      w8, w9
    b.gt     #0x362a0c
    mov      w9, #0xc51f
    movk     w9, #0x97cf, lsl #16
    cmp      w8, w9
    b.eq     #0x362c70
    mov      w9, #0xb536
    movk     w9, #0x9a45, lsl #16
    cmp      w8, w9
    b.ne     #0x3626bc
    ldr      x0, [sp, #0xd8]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [sp, #8]
    mov      w9, #0xc51f
    movk     w9, #0x97cf, lsl #16
    str      w9, [x8]
    b        #0x3626bc
    cmp      w8, w24
    b.gt     #0x36280c
    cmp      w8, w28
    b.le     #0x362920
    mov      w9, #0x1bb5
    movk     w9, #0x343d, lsl #16
    cmp      w8, w9
    b.gt     #0x362ae0
    mov      w9, #0xfe6a
    movk     w9, #0x16b7, lsl #16
    cmp      w8, w9
    b.eq     #0x362d24
    mov      w9, #0x3006
    movk     w9, #0x2c2d, lsl #16
    cmp      w8, w9
    b.ne     #0x3626bc
    ldp      x9, x8, [sp, #0x48]
    stp      x8, x9, [sp, #0x20]
    ldp      x9, x8, [sp, #0xa8]
    ldr      x8, [x8]
    ldr      x8, [x8]
    cmp      x8, x9
    mov      w8, #0x8297
    movk     w8, #0x6938, lsl #16
    mov      w9, #0xb536
    movk     w9, #0x9a45, lsl #16
    csel     w8, w8, w9, eq
    b        #0x362ce8
    mov      w9, #0x10c9
    movk     w9, #0xecc3, lsl #16
    cmp      w8, w9
    b.le     #0x3628b4
    mov      w9, #0xc8cf
    movk     w9, #0xf37e, lsl #16
    cmp      w8, w9
    b.gt     #0x3629c4
    mov      w9, #0x10ca
    movk     w9, #0xecc3, lsl #16
    cmp      w8, w9
    b.eq     #0x362c20
    cmp      w8, w23
    b.ne     #0x3626bc
    ldr      x8, [sp, #0x40]
    str      x8, [sp, #0x18]
    ldp      x9, x10, [sp, #0x28]
    add      x9, x9, #1
    cmp      x9, x10
    mov      w10, #0x3006
    movk     w10, #0x2c2d, lsl #16
    mov      w11, #0x4b70
    movk     w11, #0x3a98, lsl #16
    csel     w10, w11, w10, eq
    ldr      x11, [sp, #8]
    str      w10, [x11]
    stp      x9, x8, [sp, #0x48]
    b        #0x3626bc
    cmp      w8, w27
    b.le     #0x36296c
    mov      w9, #0xbf23
    movk     w9, #0x7987, lsl #16
    cmp      w8, w9
    b.gt     #0x362b38
    mov      w9, #0x41a1
    movk     w9, #0x740a, lsl #16
    cmp      w8, w9
    b.eq     #0x362d48
    mov      w9, #0xe7e4
    movk     w9, #0x7753, lsl #16
    cmp      w8, w9
    b.ne     #0x3626bc
    ldr      x0, [sp, #0xc8]
    ldr      x1, [sp, #0x90]
    ldr      x2, [sp, #0x80]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    mov      w9, #0x1bb6
    movk     w9, #0x343d, lsl #16
    str      w9, [x8]
    b        #0x3626bc
    mov      w9, #0xd82b
    movk     w9, #0x9304, lsl #16
    cmp      w8, w9
    b.gt     #0x362b7c
    mov      w9, #0xb4d7
    movk     w9, #0x8fed, lsl #16
    cmp      w8, w9
    b.eq     #0x362ba8
    mov      w9, #0xe709
    movk     w9, #0x91d0, lsl #16
    cmp      w8, w9
    b.ne     #0x3626bc
    ldrb     w8, [sp, #0xe5]
    cmp      w8, #0
    mov      w8, #0x691e
    movk     w8, #0x95c7, lsl #16
    mov      w9, #0xe786
    movk     w9, #0xe179, lsl #16
    b        #0x362ce4
    mov      w9, #0xe786
    movk     w9, #0xe179, lsl #16
    cmp      w8, w9
    b.eq     #0x362bdc
    mov      w9, #0x9acd
    movk     w9, #0xe467, lsl #16
    cmp      w8, w9
    b.eq     #0x362ca0
    mov      w9, #0x970
    movk     w9, #0xe518, lsl #16
    cmp      w8, w9
    b.ne     #0x3626bc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x840]
    ldr      x0, [sp, #0xd8]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x5f0]
    ldp      x2, x0, [sp, #0xd0]
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    mov      w9, #0xad79
    movk     w9, #0xeac, lsl #16
    str      w9, [x8]
    b        #0x3626bc
    mov      w9, #0xe37a
    movk     w9, #0x41, lsl #16
    cmp      w8, w9
    b.eq     #0x362cc4
    mov      w9, #0xad79
    movk     w9, #0xeac, lsl #16
    cmp      w8, w9
    b.eq     #0x362db4
    mov      w9, #0x7b16
    movk     w9, #0x1590, lsl #16
    cmp      w8, w9
    b.ne     #0x3626bc
    ldr      x8, [sp, #8]
    mov      w9, #0xb4d7
    movk     w9, #0x8fed, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0xb8]
    stp      x8, xzr, [sp, #0x58]
    b        #0x3626bc
    mov      w9, #0x4b70
    movk     w9, #0x3a98, lsl #16
    cmp      w8, w9
    b.eq     #0x362cf4
    mov      w9, #0x9398
    movk     w9, #0x44ed, lsl #16
    cmp      w8, w9
    b.eq     #0x362e34
    mov      w9, #0x8297
    movk     w9, #0x6938, lsl #16
    cmp      w8, w9
    b.ne     #0x3626bc
    ldr      x8, [sp, #0xa0]
    ldr      x8, [x8]
    ldr      x9, [sp, #0x28]
    add      x8, x8, x9, lsl #3
    str      x8, [sp, #0x88]
    ldr      x8, [sp, #8]
    mov      w9, #0xbf24
    movk     w9, #0x7987, lsl #16
    str      w9, [x8]
    b        #0x3626bc
    mov      w9, #0xc8d0
    movk     w9, #0xf37e, lsl #16
    cmp      w8, w9
    b.eq     #0x362c34
    mov      w9, #0x8929
    movk     w9, #0xf9c0, lsl #16
    cmp      w8, w9
    b.ne     #0x3626bc
    ldr      x8, [sp, #0xe8]
    cmp      x19, #0
    ccmp     x8, x20, #4, ge
    cset     w8, le
    strb     w8, [sp, #0xe6]
    ldr      x8, [sp, #8]
    mov      w9, #0xc8d0
    movk     w9, #0xf37e, lsl #16
    str      w9, [x8]
    b        #0x3626bc
    mov      w9, #0x2292
    movk     w9, #0x9eb5, lsl #16
    cmp      w8, w9
    b.eq     #0x362c84
    mov      w9, #0x4e42
    movk     w9, #0xb4c6, lsl #16
    cmp      w8, w9
    b.ne     #0x3626bc
    ldr      x22, [sp, #0x38]
    ldr      x0, [sp, #0xd8]
    bl       #0x461c9c // _objc_release
    add      x0, x21, #8
    bl       #0x461d68 // _os_unfair_lock_lock
    ldr      x23, [x21, #0x10]
    ldr      x0, [sp, #0xc8]
    str      x0, [x21, #0x10]
    bl       #0x461ca8 // _objc_retain
    mov      x0, x23
    mov      w23, #0xae08
    movk     w23, #0xee64, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf20]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    add      x0, x21, #8
    bl       #0x461d74 // _os_unfair_lock_unlock
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf78]
    mov      x0, x21
    mov      x2, x22
    add      x22, sp, #0x100
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf08]
    mov      x0, x21
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf28]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0xc8]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0xd0]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0xd8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0x691e
    movk     w9, #0x95c7, lsl #16
    str      w9, [x8]
    b        #0x3626bc
    mov      w9, #0x1bb6
    movk     w9, #0x343d, lsl #16
    cmp      w8, w9
    b.eq     #0x362d80
    mov      w9, #0xaf8c
    movk     w9, #0x3a7e, lsl #16
    cmp      w8, w9
    b.ne     #0x3626bc
    ldrb     w8, [sp, #0x6f]
    cmp      w8, #0
    mov      w8, #0x4e42
    movk     w8, #0xb4c6, lsl #16
    mov      w9, #0xb4d7
    movk     w9, #0x8fed, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    ldr      x8, [sp, #0x70]
    ldr      x9, [sp, #0x18]
    stp      x8, x9, [sp, #0x58]
    str      x9, [sp, #0x38]
    b        #0x3626bc
    mov      w9, #0xbf24
    movk     w9, #0x7987, lsl #16
    cmp      w8, w9
    b.eq     #0x362d94
    mov      w9, #0x2d7d
    movk     w9, #0x7a1a, lsl #16
    cmp      w8, w9
    b.ne     #0x3626bc
    ldr      x8, [sp, #0x70]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [sp, #0x6f]
    ldr      x8, [sp, #8]
    mov      w9, #0xaf8c
    movk     w9, #0x3a7e, lsl #16
    str      w9, [x8]
    b        #0x3626bc
    mov      w9, #0x691e
    movk     w9, #0x95c7, lsl #16
    cmp      w8, w9
    b.ne     #0x362e50
    ldr      x0, [sp, #0xf8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0xd82c
    movk     w9, #0x9304, lsl #16
    str      w9, [x8]
    b        #0x3626bc
    ldp      x9, x8, [sp, #0x58]
    str      x9, [sp, #0x30]
    adrp     x9, #0x4c1000
    ldr      x10, [x9, #0xd00]
    adrp     x9, #0x4be000
    ldr      x9, [x9, #0x830]
    stp      x9, x10, [sp, #0x90]
    ldr      x9, [sp, #8]
    mov      w10, #0x3006
    movk     w10, #0x2c2d, lsl #16
    str      w10, [x9]
    stp      xzr, x8, [sp, #0x48]
    b        #0x3626bc
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x360]
    ldr      x0, [sp, #0xf8]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0xd8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0xd0]
    ldr      x8, [sp, #8]
    mov      w9, #0x970
    movk     w9, #0xe518, lsl #16
    str      w9, [x8]
    b        #0x3626bc
    ldr      x8, [sp, #8]
    str      w23, [x8]
    ldr      x8, [sp, #0x78]
    str      x8, [sp, #0x40]
    b        #0x3626bc
    ldr      x8, [sp, #0xe8]
    cmp      x8, x19
    cset     w8, le
    ldrb     w9, [sp, #0xe6]
    cmp      x20, x19
    cset     w10, eq
    orr      w9, w10, w9
    orr      w8, w9, w8
    and      w8, w8, #1
    strb     w8, [sp, #0xe5]
    ldr      x8, [sp, #8]
    mov      w9, #0xe709
    movk     w9, #0x91d0, lsl #16
    str      w9, [x8]
    b        #0x3626bc
    ldr      x8, [sp, #8]
    mov      w9, #0x8297
    movk     w9, #0x6938, lsl #16
    str      w9, [x8]
    b        #0x3626bc
    ldrb     w8, [sp, #0xe7]
    cmp      w8, #0
    mov      w8, #0x691e
    movk     w8, #0x95c7, lsl #16
    mov      w9, #0x8929
    movk     w9, #0xf9c0, lsl #16
    b        #0x362ce4
    ldr      x1, [sp, #0xf0]
    ldr      x0, [sp, #0xc8]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x78]
    ldr      x8, [sp, #8]
    mov      w9, #0x10ca
    movk     w9, #0xecc3, lsl #16
    str      w9, [x8]
    b        #0x3626bc
    ldr      x1, [sp, #0x98]
    ldr      x0, [sp, #0x80]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #0x9acd
    movk     w8, #0xe467, lsl #16
    mov      w9, #0xe7e4
    movk     w9, #0x7753, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x3626bc
    ldr      x0, [sp, #0xd8]
    ldr      x1, [sp, #0xc0]
    add      x2, sp, #0x100
    sub      x3, x29, #0xe8
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x70]
    ldr      x8, [sp, #8]
    mov      w9, #0x2d7d
    movk     w9, #0x7a1a, lsl #16
    str      w9, [x8]
    b        #0x3626bc
    add      x9, x22, #0x10
    ldr      x8, [sp, #0x110]
    ldr      x8, [x8]
    stp      x8, x9, [sp, #0xa8]
    ldr      x8, [sp, #8]
    mov      w9, #0x9398
    movk     w9, #0x44ed, lsl #16
    str      w9, [x8]
    b        #0x3626bc
    ldr      x0, [sp, #0xf8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    str      x1, [sp, #0xf0]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0xe8]
    cmp      x20, #0
    cset     w8, lt
    strb     w8, [sp, #0xe7]
    ldr      x8, [sp, #8]
    mov      w9, #0x2292
    movk     w9, #0x9eb5, lsl #16
    str      w9, [x8]
    b        #0x3626bc
    ldr      x8, [sp, #8]
    str      w23, [x8]
    ldr      x8, [sp, #0x20]
    str      x8, [sp, #0x40]
    b        #0x3626bc
    ldr      x8, [sp, #0x88]
    ldr      x8, [x8]
    str      x8, [sp, #0x80]
    ldr      x8, [sp, #8]
    mov      w9, #0xe37a
    movk     w9, #0x41, lsl #16
    str      w9, [x8]
    b        #0x3626bc
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0xc8]
    movi     v0.16b, #0
    stp      q0, q0, [x22]
    stp      q0, q0, [x22, #0x20]
    ldr      x0, [sp, #0xd8]
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    str      x1, [sp, #0xc0]
    ldr      x0, [sp, #0xd8]
    add      x2, sp, #0x100
    sub      x3, x29, #0xe8
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0xb8]
    cmp      x0, #0
    mov      w8, #0x4e42
    movk     w8, #0xb4c6, lsl #16
    mov      w9, #0xfe6a
    movk     w9, #0x16b7, lsl #16
    csel     w8, w8, w9, eq
    ldr      x9, [sp, #8]
    str      w8, [x9]
    str      xzr, [sp, #0x38]
    b        #0x3626bc
    add      x8, x22, #8
    str      x8, [sp, #0xa0]
    ldr      x8, [sp, #8]
    mov      w9, #0x7b16
    movk     w9, #0x1590, lsl #16
    str      w9, [x8]
    b        #0x3626bc
    mov      w9, #0xd82c
    movk     w9, #0x9304, lsl #16
    cmp      w8, w9
    b.ne     #0x3626bc
    ldur     x8, [x29, #-0x68]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x362e98
    add      sp, sp, #0x1e0
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGHomeGroups currentGroupShouldShowSessionUsername:] IMP=0x362E9C bounds=0x362E9C-0x362F34
loc_362E9C:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xf80]
    str      x8, [sp, #0x18]
    mov      w21, #0x1110
    movk     w21, #0xf09f, lsl #16
    str      w21, [sp, #0x10]
    add      x8, sp, #0x10
    str      x8, [sp, #8]
    mov      w22, #0x70be
    movk     w22, #0xd84e, lsl #16
    ldr      w8, [sp, #0x10]
    cmp      w8, w21
    b.eq     #0x362ef8
    cmp      w8, w22
    b.ne     #0x362ee0
    b        #0x362f1c
    ldr      x1, [sp, #0x18]
    mov      x0, x20
    mov      x2, x19
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x17]
    ldr      x8, [sp, #8]
    str      w22, [x8]
    b        #0x362ee0
    ldrb     w0, [sp, #0x17]
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    ret      

// -[WCLGHomeGroups groupAtDisplayIndex:shouldShowSessionUsername:] IMP=0x362F34 bounds=0x362F34-0x362FDC
loc_362F34:
    sub      sp, sp, #0x60
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x3
    mov      x20, x2
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xf88]
    str      x8, [sp, #0x18]
    mov      w22, #0xa416
    movk     w22, #0xcf00, lsl #16
    str      w22, [sp, #0x10]
    add      x8, sp, #0x10
    str      x8, [sp, #8]
    mov      w23, #0x191d
    movk     w23, #0x5f1d, lsl #16
    ldr      w8, [sp, #0x10]
    cmp      w8, w22
    b.eq     #0x362f98
    cmp      w8, w23
    b.ne     #0x362f80
    b        #0x362fc0
    ldr      x1, [sp, #0x18]
    mov      x0, x21
    mov      x2, x20
    mov      x3, x19
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x17]
    ldr      x8, [sp, #8]
    str      w23, [x8]
    b        #0x362f80
    ldrb     w0, [sp, #0x17]
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    add      sp, sp, #0x60
    ret      

// -[WCLGHomeGroups currentGroupShouldShowSessionUsername:cellData:] IMP=0x362FDC bounds=0x362FDC-0x3630B4
loc_362FDC:
    sub      sp, sp, #0x60
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x20, x3
    mov      x19, x2
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xce8]
    str      x8, [sp, #0x18]
    mov      x0, x3
    bl       #0x461ca8 // _objc_retain
    mov      w22, #0x2edd
    movk     w22, #0x1207, lsl #16
    str      w22, [sp, #0x10]
    add      x8, sp, #0x10
    str      x8, [sp, #8]
    adrp     x23, #0x4c1000
    mov      w24, #0x9c24
    movk     w24, #0x4f55, lsl #16
    ldr      w8, [sp, #0x10]
    cmp      w8, w22
    b.eq     #0x36304c
    cmp      w8, w24
    b.ne     #0x363034
    b        #0x363088
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    ldr      x1, [sp, #0x18]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    ldr      x1, [x23, #0xf88]
    mov      x0, x21
    mov      x3, x19
    mov      x4, x20
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x17]
    ldr      x8, [sp, #8]
    str      w24, [x8]
    b        #0x363034
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldrb     w0, [sp, #0x17]
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    add      sp, sp, #0x60
    ret      

// -[WCLGHomeGroups groupAtDisplayIndex:shouldShowSessionUsername:cellData:] IMP=0x3630B4 bounds=0x3630B4-0x36362C
loc_3630B4:
    sub      sp, sp, #0xe0
    stp      x28, x27, [sp, #0x80]
    stp      x26, x25, [sp, #0x90]
    stp      x24, x23, [sp, #0xa0]
    stp      x22, x21, [sp, #0xb0]
    stp      x20, x19, [sp, #0xc0]
    stp      x29, x30, [sp, #0xd0]
    add      x29, sp, #0xd0
    mov      x20, x4
    mov      x19, x3
    mov      x28, x2
    mov      x21, x0
    mov      w23, #0x901
    movk     w23, #0xd837, lsl #16
    mov      x0, x3
    bl       #0x461ca8 // _objc_retain
    mov      w22, #0x2c59
    movk     w22, #0xb884, lsl #16
    add      x8, sp, #8
    str      w22, [sp, #8]
    mov      w26, #0xe61
    movk     w26, #0xe6a2, lsl #16
    mov      w27, #0xdadc
    movk     w27, #0xb56c, lsl #16
    str      x8, [sp]
    mov      w25, #0xa131
    movk     w25, #0xefc, lsl #16
    mov      w24, #0x25b8
    movk     w24, #0x2e1a, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w26
    b.le     #0x363198
    cmp      w8, w25
    b.le     #0x3631f8
    cmp      w8, w24
    b.gt     #0x3632c0
    mov      w9, #0xa132
    movk     w9, #0xefc, lsl #16
    cmp      w8, w9
    b.eq     #0x363594
    mov      w9, #0x2956
    movk     w9, #0x10ad, lsl #16
    cmp      w8, w9
    b.eq     #0x3634e8
    mov      w9, #0x458f
    movk     w9, #0x16e6, lsl #16
    cmp      w8, w9
    b.ne     #0x363128
    ldr      x1, [sp, #0x20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x18]
    ldr      x8, [sp]
    mov      w9, #0xe62
    movk     w9, #0xe6a2, lsl #16
    str      w9, [x8]
    b        #0x363128
    cmp      w8, w27
    b.le     #0x363260
    mov      w9, #0x707c
    movk     w9, #0xd72c, lsl #16
    cmp      w8, w9
    b.le     #0x363304
    mov      w9, #0x707d
    movk     w9, #0xd72c, lsl #16
    cmp      w8, w9
    b.eq     #0x363570
    cmp      w8, w23
    b.eq     #0x363428
    mov      w9, #0xadd5
    movk     w9, #0xde35, lsl #16
    cmp      w8, w9
    b.ne     #0x363128
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xee0]
    str      x8, [sp, #0x10]
    ldr      x8, [sp]
    mov      w9, #0xa132
    movk     w9, #0xefc, lsl #16
    str      w9, [x8]
    b        #0x363128
    mov      w9, #0x1f79
    movk     w9, #0xaaf, lsl #16
    cmp      w8, w9
    b.le     #0x36333c
    mov      w9, #0x1f7a
    movk     w9, #0xaaf, lsl #16
    cmp      w8, w9
    b.eq     #0x363524
    mov      w9, #0xd0d7
    movk     w9, #0xb35, lsl #16
    cmp      w8, w9
    b.eq     #0x3633c4
    mov      w9, #0x28b7
    movk     w9, #0xe5e, lsl #16
    cmp      w8, w9
    b.ne     #0x363128
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xd08]
    ldr      x0, [sp, #0x68]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x50]
    ldr      x8, [sp]
    mov      w9, #0x707d
    movk     w9, #0xd72c, lsl #16
    str      w9, [x8]
    b        #0x363128
    mov      w9, #0x552c
    movk     w9, #0x8a8f, lsl #16
    cmp      w8, w9
    b.le     #0x363374
    mov      w9, #0x552d
    movk     w9, #0x8a8f, lsl #16
    cmp      w8, w9
    b.eq     #0x363544
    mov      w9, #0x4952
    movk     w9, #0x941c, lsl #16
    cmp      w8, w9
    b.eq     #0x3633e4
    mov      w9, #0x3aa
    movk     w9, #0x95a7, lsl #16
    cmp      w8, w9
    b.ne     #0x363128
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xd00]
    str      x8, [sp, #0x60]
    ldr      x8, [sp]
    mov      w9, #0xd0d7
    movk     w9, #0xb35, lsl #16
    str      w9, [x8]
    b        #0x363128
    mov      w9, #0x25b9
    movk     w9, #0x2e1a, lsl #16
    cmp      w8, w9
    b.eq     #0x3635bc
    mov      w9, #0x2b77
    movk     w9, #0x4645, lsl #16
    cmp      w8, w9
    b.eq     #0x363510
    mov      w9, #0x9e6c
    movk     w9, #0x730a, lsl #16
    cmp      w8, w9
    b.ne     #0x363128
    ldr      x8, [sp]
    str      w23, [x8]
    ldrb     w8, [sp, #0xf]
    strb     w8, [sp, #0xe]
    b        #0x363128
    cmp      w8, w22
    b.eq     #0x3634c0
    mov      w9, #0xdbe9
    movk     w9, #0xc9fc, lsl #16
    cmp      w8, w9
    b.ne     #0x3635e4
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x338]
    str      x8, [sp, #0x20]
    ldr      x8, [sp]
    mov      w9, #0x458f
    movk     w9, #0x16e6, lsl #16
    str      w9, [x8]
    b        #0x363128
    mov      w9, #0xe62
    movk     w9, #0xe6a2, lsl #16
    cmp      w8, w9
    b.eq     #0x363464
    mov      w9, #0xac4f
    movk     w9, #0xe8d1, lsl #16
    cmp      w8, w9
    b.ne     #0x363128
    ldr      x8, [sp, #0x68]
    cmp      x8, #0
    mov      w8, #0x3aa
    movk     w8, #0x95a7, lsl #16
    csel     w8, w23, w8, eq
    b        #0x3635d0
    mov      w9, #0xa394
    movk     w9, #0x8150, lsl #16
    cmp      w8, w9
    b.eq     #0x363488
    mov      w9, #0x3112
    movk     w9, #0x894d, lsl #16
    cmp      w8, w9
    b.ne     #0x363128
    ldur     x1, [x29, #-0x60]
    mov      x0, x21
    mov      x2, x28
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x68]
    ldr      x8, [sp]
    mov      w9, #0xac4f
    movk     w9, #0xe8d1, lsl #16
    str      w9, [x8]
    b        #0x363128
    ldp      x1, x0, [sp, #0x60]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x5f]
    ldr      x8, [sp]
    mov      w9, #0x25b9
    movk     w9, #0x2e1a, lsl #16
    str      w9, [x8]
    b        #0x363128
    ldr      x1, [sp, #0x30]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x5, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf98]
    ldr      x0, [sp, #0x68]
    ldr      x3, [sp, #0x40]
    ldrb     w4, [sp, #0x3f]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x2f]
    ldr      x8, [sp]
    mov      w9, #0x2b77
    movk     w9, #0x4645, lsl #16
    str      w9, [x8]
    b        #0x363128
    mov      x22, x21
    mov      x21, x28
    ldrb     w28, [sp, #0xe]
    ldr      x0, [sp, #0x68]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    mov      w9, #0xdadd
    movk     w9, #0xb56c, lsl #16
    str      w9, [x8]
    strb     w28, [sp, #0xd]
    mov      x28, x21
    mov      x21, x22
    mov      w22, #0x2c59
    movk     w22, #0xb884, lsl #16
    b        #0x363128
    ldr      x8, [sp, #0x18]
    cmp      x8, #0
    mov      w8, #0xadd5
    movk     w8, #0xde35, lsl #16
    csel     w8, w23, w8, eq
    ldr      x9, [sp]
    str      w8, [x9]
    strb     wzr, [sp, #0xe]
    b        #0x363128
    mov      x0, x20
    bl       #0x33f4b4
    str      x0, [sp, #0x40]
    mov      x0, x20
    bl       #0x342124
    strb     w0, [sp, #0x3f]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xf90]
    str      x8, [sp, #0x30]
    ldr      x8, [sp]
    mov      w9, #0x4952
    movk     w9, #0x941c, lsl #16
    str      w9, [x8]
    b        #0x363128
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    cmp      x28, #0
    cset     w8, lt
    sturb    w8, [x29, #-0x51]
    ldr      x8, [sp]
    mov      w9, #0x552d
    movk     w9, #0x8a8f, lsl #16
    str      w9, [x8]
    b        #0x363128
    ldrb     w8, [sp, #0x4f]
    cmp      w8, #0
    mov      w8, #0xa394
    movk     w8, #0x8150, lsl #16
    mov      w9, #0xdbe9
    movk     w9, #0xc9fc, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x363128
    ldr      x8, [sp]
    str      w23, [x8]
    ldrb     w8, [sp, #0x2f]
    strb     w8, [sp, #0xe]
    b        #0x363128
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0xf60]
    stur     x8, [x29, #-0x60]
    ldr      x8, [sp]
    mov      w9, #0x3112
    movk     w9, #0x894d, lsl #16
    str      w9, [x8]
    b        #0x363128
    ldurb    w8, [x29, #-0x51]
    cmp      w8, #0
    mov      w8, #0xdadd
    movk     w8, #0xb56c, lsl #16
    mov      w9, #0x1f7a
    movk     w9, #0xaaf, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [sp]
    str      w8, [x9]
    strb     wzr, [sp, #0xd]
    b        #0x363128
    ldr      x8, [sp, #0x50]
    cmp      x8, #5
    cset     w8, eq
    strb     w8, [sp, #0x4f]
    ldr      x8, [sp]
    mov      w9, #0x2956
    movk     w9, #0x10ad, lsl #16
    str      w9, [x8]
    b        #0x363128
    ldr      x0, [sp, #0x68]
    ldr      x1, [sp, #0x10]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0xf]
    ldr      x8, [sp]
    mov      w9, #0x9e6c
    movk     w9, #0x730a, lsl #16
    str      w9, [x8]
    b        #0x363128
    ldrb     w8, [sp, #0x5f]
    cmp      w8, #0
    mov      w8, #0x28b7
    movk     w8, #0xe5e, lsl #16
    csel     w8, w23, w8, ne
    ldr      x9, [sp]
    str      w8, [x9]
    mov      w8, #1
    strb     w8, [sp, #0xe]
    b        #0x363128
    mov      w9, #0xdadd
    movk     w9, #0xb56c, lsl #16
    cmp      w8, w9
    b.ne     #0x363128
    ldrb     w21, [sp, #0xd]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    ldp      x29, x30, [sp, #0xd0]
    ldp      x20, x19, [sp, #0xc0]
    ldp      x22, x21, [sp, #0xb0]
    ldp      x24, x23, [sp, #0xa0]
    ldp      x26, x25, [sp, #0x90]
    ldp      x28, x27, [sp, #0x80]
    add      sp, sp, #0xe0
    ret      

// -[WCLGHomeGroups recomputeAtomicMirrorLocked:] IMP=0x36362C bounds=0x36362C-0x363D8C
loc_36362C:
    sub      sp, sp, #0xd0
    stp      x28, x27, [sp, #0x70]
    stp      x26, x25, [sp, #0x80]
    stp      x24, x23, [sp, #0x90]
    stp      x22, x21, [sp, #0xa0]
    stp      x20, x19, [sp, #0xb0]
    stp      x29, x30, [sp, #0xc0]
    add      x29, sp, #0xc0
    str      w2, [sp, #0xc]
    mov      x19, x0
    adrp     x8, #0x581000
    add      x8, x8, #0x3c4
    ldar     w8, [x8]
    stur     w8, [x29, #-0x54]
    mov      w8, #0x1428
    movk     w8, #0xa600, lsl #16
    str      w8, [sp, #0x18]
    add      x8, sp, #0x18
    str      x8, [sp, #0x10]
    mov      w27, #0xb45
    movk     w27, #0xfbb5, lsl #16
    mov      w21, #0xe809
    movk     w21, #0xa7fa, lsl #16
    mov      w26, #0x60f5
    movk     w26, #0xa5b3, lsl #16
    mov      w23, #0x69ea
    movk     w23, #0xb982, lsl #16
    adrp     x22, #0x54e000
    add      x22, x22, #0x740
    adrp     x28, #0x54e000
    add      x28, x28, #0x74d
    mov      w24, #0x1b2c
    movk     w24, #0x3fd5, lsl #16
    mov      w25, #0x87bd
    movk     w25, #0xa0b, lsl #16
    mov      w20, #0x9da0
    movk     w20, #0x56cc, lsl #16
    ldr      w8, [sp, #0x18]
    cmp      w8, w27
    b.le     #0x363720
    cmp      w8, w24
    b.le     #0x363788
    cmp      w8, w20
    b.le     #0x36389c
    mov      w9, #0x46b6
    movk     w9, #0x726c, lsl #16
    cmp      w8, w9
    b.gt     #0x363a34
    mov      w9, #0x9da1
    movk     w9, #0x56cc, lsl #16
    cmp      w8, w9
    b.eq     #0x363af4
    mov      w9, #0x5d00
    movk     w9, #0x6fcb, lsl #16
    cmp      w8, w9
    b.ne     #0x3636c0
    ldr      x8, [sp, #0x10]
    mov      w9, #0xaa58
    movk     w9, #0xddfd, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    cmp      w8, w21
    b.le     #0x3637dc
    cmp      w8, w23
    b.le     #0x363848
    mov      w9, #0xaa57
    movk     w9, #0xddfd, lsl #16
    cmp      w8, w9
    b.gt     #0x3639a0
    mov      w9, #0x69eb
    movk     w9, #0xb982, lsl #16
    cmp      w8, w9
    b.eq     #0x363abc
    mov      w9, #0xb521
    movk     w9, #0xcb21, lsl #16
    cmp      w8, w9
    b.ne     #0x3636c0
    ldrb     w8, [sp, #0x24]
    ldrb     w9, [sp, #0x1f]
    and      w8, w9, w8
    and      w8, w8, #1
    strb     w8, [sp, #0x23]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x2a73
    movk     w9, #0x837, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    cmp      w8, w25
    b.le     #0x36394c
    mov      w9, #0xb44f
    movk     w9, #0x2781, lsl #16
    cmp      w8, w9
    b.gt     #0x363a7c
    mov      w9, #0x87be
    movk     w9, #0xa0b, lsl #16
    cmp      w8, w9
    b.eq     #0x363aa0
    mov      w9, #0x5f4f
    movk     w9, #0x1392, lsl #16
    cmp      w8, w9
    b.ne     #0x3636c0
    add      x8, x19, #8
    str      x8, [sp, #0x28]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x9fd9
    movk     w9, #0x90d4, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    cmp      w8, w26
    b.gt     #0x3638f0
    mov      w9, #0x4087
    movk     w9, #0x8742, lsl #16
    cmp      w8, w9
    b.eq     #0x363b94
    mov      w9, #0x9fd9
    movk     w9, #0x90d4, lsl #16
    cmp      w8, w9
    b.eq     #0x363c78
    mov      w9, #0xb9d6
    movk     w9, #0x9837, lsl #16
    cmp      w8, w9
    b.ne     #0x3636c0
    ldrb     w8, [sp, #0x26]
    cmp      w8, #0
    mov      w8, #0xd32b
    movk     w8, #0x3b05, lsl #16
    mov      w9, #0x5179
    movk     w9, #0x4436, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    ldrb     w8, [sp, #0x25]
    strb     w8, [sp, #0x21]
    strb     wzr, [sp, #0x20]
    b        #0x3636c0
    mov      w9, #0xe80a
    movk     w9, #0xa7fa, lsl #16
    cmp      w8, w9
    b.eq     #0x363b48
    mov      w9, #0xcfff
    movk     w9, #0xa8dc, lsl #16
    cmp      w8, w9
    b.eq     #0x363c1c
    mov      w9, #0x32a7
    movk     w9, #0xb91c, lsl #16
    cmp      w8, w9
    b.ne     #0x3636c0
    adrp     x8, #0x581000
    add      x8, x8, #0x3c4
    mov      w9, #1
    stlr     w9, [x8]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x4087
    movk     w9, #0x8742, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    mov      w9, #0x1b2d
    movk     w9, #0x3fd5, lsl #16
    cmp      w8, w9
    b.eq     #0x363b68
    mov      w9, #0x4af5
    movk     w9, #0x4254, lsl #16
    cmp      w8, w9
    b.eq     #0x363c3c
    mov      w9, #0x5179
    movk     w9, #0x4436, lsl #16
    cmp      w8, w9
    b.ne     #0x3636c0
    ldrb     w8, [sp, #0x36]
    mov      w9, #1
    bic      w8, w9, w8
    strb     w8, [sp, #0x24]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xb521
    movk     w9, #0xcb21, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    mov      w9, #0x60f6
    movk     w9, #0xa5b3, lsl #16
    cmp      w8, w9
    b.eq     #0x363bbc
    mov      w9, #0x1428
    movk     w9, #0xa600, lsl #16
    cmp      w8, w9
    b.eq     #0x363c94
    mov      w9, #0xec6
    movk     w9, #0xa6bd, lsl #16
    cmp      w8, w9
    b.ne     #0x3636c0
    ldrb     w8, [sp, #0x22]
    strb     w8, [sp, #0x1f]
    ldrb     w8, [x19, #0x20]
    strb     w8, [sp, #0x36]
    ldr      w8, [sp, #0xc]
    cmp      w8, #0
    mov      w8, #0x60fb
    movk     w8, #0x7998, lsl #16
    mov      w9, #0x5f4f
    movk     w9, #0x1392, lsl #16
    b        #0x363bac
    mov      w9, #0xb46
    movk     w9, #0xfbb5, lsl #16
    cmp      w8, w9
    b.eq     #0x363be8
    mov      w9, #0x43e4
    movk     w9, #0xffc7, lsl #16
    cmp      w8, w9
    b.eq     #0x363cb8
    mov      w9, #0x2a73
    movk     w9, #0x837, lsl #16
    cmp      w8, w9
    b.ne     #0x3636c0
    ldr      x8, [sp, #0x10]
    mov      w9, #0xd32b
    movk     w9, #0x3b05, lsl #16
    str      w9, [x8]
    ldrb     w8, [sp, #0x36]
    ldrb     w9, [sp, #0x23]
    strb     w8, [sp, #0x21]
    strb     w9, [sp, #0x20]
    b        #0x3636c0
    mov      w9, #0xaa58
    movk     w9, #0xddfd, lsl #16
    cmp      w8, w9
    b.eq     #0x363ad8
    mov      w9, #0x9c
    movk     w9, #0xeba1, lsl #16
    cmp      w8, w9
    b.ne     #0x3636c0
    ldrb     w8, [x22]
    eor      w8, w8, #0x38
    strb     w8, [x28]
    ldrb     w8, [x22, #1]
    mov      w9, #0x9e
    eor      w8, w8, w9
    strb     w8, [x28, #1]
    ldrb     w8, [x22, #2]
    eor      w8, w8, #0x7e
    strb     w8, [x28, #2]
    ldrb     w8, [x22, #3]
    eor      w8, w8, #0xffffffcf
    strb     w8, [x28, #3]
    ldrb     w8, [x22, #4]
    mov      w9, #0x97
    eor      w8, w8, w9
    strb     w8, [x28, #4]
    ldrb     w8, [x22, #5]
    mov      w9, #0x3a
    eor      w8, w8, w9
    strb     w8, [x28, #5]
    ldrb     w8, [x22, #6]
    eor      w8, w8, #0x1c
    strb     w8, [x28, #6]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x43e4
    movk     w9, #0xffc7, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    mov      w9, #0x46b7
    movk     w9, #0x726c, lsl #16
    cmp      w8, w9
    b.eq     #0x363b10
    mov      w9, #0x60fb
    movk     w9, #0x7998, lsl #16
    cmp      w8, w9
    b.ne     #0x3636c0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xed0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [sp, #0x27]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x46b7
    movk     w9, #0x726c, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    mov      w9, #0xb450
    movk     w9, #0x2781, lsl #16
    cmp      w8, w9
    b.ne     #0x363d2c
    ldr      x8, [sp, #0x10]
    mov      w9, #0x60fb
    movk     w9, #0x7998, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    ldr      x8, [sp, #0x10]
    mov      w9, #0xec6
    movk     w9, #0xa6bd, lsl #16
    str      w9, [x8]
    ldrb     w8, [sp, #0x37]
    strb     w8, [sp, #0x22]
    b        #0x3636c0
    add      x8, x19, #8
    str      x8, [sp, #0x60]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x9da1
    movk     w9, #0x56cc, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    add      x8, x19, #0x10
    str      x8, [sp, #0x58]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x4af5
    movk     w9, #0x4254, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    ldr      x0, [sp, #0x60]
    bl       #0x461d68 // _os_unfair_lock_lock
    ldr      x8, [sp, #0x10]
    mov      w9, #0x5d00
    movk     w9, #0x6fcb, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    ldrb     w8, [sp, #0x57]
    ldrb     w9, [sp, #0x27]
    and      w8, w9, w8
    and      w8, w8, #1
    strb     w8, [sp, #0x26]
    ldrb     w8, [sp, #0x36]
    and      w8, w9, w8
    and      w8, w8, #1
    strb     w8, [sp, #0x25]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xb9d6
    movk     w9, #0x9837, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    ldurb    w8, [x29, #-0x55]
    cmp      w8, #0
    mov      w8, #0x32a7
    movk     w8, #0xb91c, lsl #16
    mov      w9, #0x9c
    movk     w9, #0xeba1, lsl #16
    csel     w8, w9, w8, ne
    b        #0x363bb0
    adrp     x8, #0x54e000
    ldrb     w8, [x8, #0x74c]
    mov      w9, #0xd2
    eor      w8, w8, w9
    adrp     x9, #0x54e000
    strb     w8, [x9, #0x759]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x32a7
    movk     w9, #0xb91c, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    ldr      w8, [sp, #0xc]
    cmp      w8, #0
    mov      w8, #0xaa58
    movk     w8, #0xddfd, lsl #16
    mov      w9, #0x69eb
    movk     w9, #0xb982, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x3636c0
    ldp      x1, x0, [sp, #0x38]
    adrp     x2, #0x54e000
    add      x2, x2, #0x780
    bl       #0x461c6c // _objc_msgSend
    eor      w8, w0, #1
    strb     w8, [sp, #0x37]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x87be
    movk     w9, #0xa0b, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    ldr      x8, [sp, #0x48]
    ldr      x8, [x8]
    str      x8, [sp, #0x40]
    cmp      x8, #0
    mov      w8, #0xec6
    movk     w8, #0xa6bd, lsl #16
    mov      w9, #0xcfff
    movk     w9, #0xa8dc, lsl #16
    csel     w8, w8, w9, eq
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    strb     wzr, [sp, #0x22]
    b        #0x3636c0
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x358]
    str      x8, [sp, #0x38]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x60f6
    movk     w9, #0xa5b3, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    ldr      x8, [sp, #0x58]
    ldr      x0, [x8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    cset     w8, ne
    strb     w8, [sp, #0x57]
    add      x8, x19, #0x18
    str      x8, [sp, #0x48]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xb46
    movk     w9, #0xfbb5, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    ldr      x0, [sp, #0x28]
    bl       #0x461d74 // _os_unfair_lock_unlock
    ldr      x8, [sp, #0x10]
    mov      w9, #0xb450
    movk     w9, #0x2781, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    ldur     w8, [x29, #-0x54]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x55]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xe80a
    movk     w9, #0xa7fa, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    adrp     x9, #0x54e000
    add      x9, x9, #0x747
    ldrb     w8, [x9]
    mov      w10, #0x4f
    eor      w8, w8, w10
    adrp     x11, #0x54e000
    add      x11, x11, #0x754
    strb     w8, [x11]
    ldrb     w8, [x9, #1]
    mov      w10, #0x92
    eor      w8, w8, w10
    strb     w8, [x11, #1]
    ldrb     w8, [x9, #2]
    mov      w10, #0x2b
    eor      w8, w8, w10
    strb     w8, [x11, #2]
    ldrb     w8, [x9, #3]
    mov      w10, #0xd
    eor      w8, w8, w10
    strb     w8, [x11, #3]
    ldrb     w8, [x9, #4]
    mov      w9, #0x3a
    eor      w8, w8, w9
    strb     w8, [x11, #4]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x1b2d
    movk     w9, #0x3fd5, lsl #16
    str      w9, [x8]
    b        #0x3636c0
    mov      w9, #0xd32b
    movk     w9, #0x3b05, lsl #16
    cmp      w8, w9
    b.ne     #0x3636c0
    ldrb     w8, [sp, #0x20]
    ldrb     w9, [sp, #0x21]
    adrp     x10, #0x581000
    strb     w8, [x10, #0x180]
    adrp     x8, #0x581000
    strb     w9, [x8, #0x181]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xfa0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x54a000
    strb     w0, [x8, #0x4e0]
    ldp      x29, x30, [sp, #0xc0]
    ldp      x20, x19, [sp, #0xb0]
    ldp      x22, x21, [sp, #0xa0]
    ldp      x24, x23, [sp, #0x90]
    ldp      x26, x25, [sp, #0x80]
    ldp      x28, x27, [sp, #0x70]
    add      sp, sp, #0xd0
    ret      

// -[WCLGHomeGroups refresh] IMP=0x363D8C bounds=0x363D8C-0x363E34
loc_363D8C:
    sub      sp, sp, #0x60
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xf18]
    bl       #0x461c6c // _objc_msgSend
    mov      w20, #0x3787
    movk     w20, #0x3cb2, lsl #16
    str      w20, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    adrp     x21, #0x4c1000
    adrp     x22, #0x4c1000
    mov      w23, #0x192e
    movk     w23, #0x33d2, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w20
    b.eq     #0x363df0
    cmp      w8, w23
    b.ne     #0x363dd8
    b        #0x363e14
    ldr      x1, [x21, #0xf08]
    mov      x0, x19
    mov      w2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x22, #0xf28]
    str      x8, [sp, #0x18]
    ldr      x8, [sp, #8]
    str      w23, [x8]
    b        #0x363dd8
    ldr      x1, [sp, #0x18]
    mov      x0, x19
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    add      sp, sp, #0x60
    b        #0x461c6c // _objc_msgSend

// -[WCLGHomeGroups beginQuietGroupSwitch] IMP=0x363E34 bounds=0x363E34-0x363EA0
loc_363E34:
    sub      sp, sp, #0x20
    adrp     x8, #0x581000
    ldr      x9, [x8, #0x1b0]
    str      x9, [sp, #0x18]
    mov      w9, #0x72b7
    movk     w9, #0xdab6, lsl #16
    str      w9, [sp, #0xc]
    add      x10, sp, #0xc
    str      x10, [sp]
    mov      w10, #0xc647
    movk     w10, #0xf279, lsl #16
    ldr      w11, [sp, #0xc]
    cmp      w11, w9
    b.eq     #0x363e78
    cmp      w11, w10
    b.ne     #0x363e60
    b        #0x363e90
    ldr      x11, [sp, #0x18]
    add      x11, x11, #1
    str      x11, [sp, #0x10]
    ldr      x11, [sp]
    str      w10, [x11]
    b        #0x363e60
    ldr      x9, [sp, #0x10]
    str      x9, [x8, #0x1b0]
    add      sp, sp, #0x20
    ret      

// -[WCLGHomeGroups endQuietGroupSwitch] IMP=0x363EA0 bounds=0x363EA0-0x363FA4
loc_363EA0:
    sub      sp, sp, #0x30
    mov      w8, #0xa7b1
    movk     w8, #0xf10, lsl #16
    adrp     x9, #0x581000
    ldr      x10, [x9, #0x1b0]
    str      x10, [sp, #0x28]
    mov      w10, #0x79ff
    movk     w10, #0xe5de, lsl #16
    add      x12, sp, #0x14
    mov      w11, #0x6278
    movk     w11, #0xf180, lsl #16
    str      w10, [sp, #0x14]
    str      x12, [sp, #8]
    mov      w12, #0xec45
    movk     w12, #0xa2cb, lsl #16
    mov      w13, #0x659b
    movk     w13, #0xeece, lsl #16
    mov      w14, #0x6279
    movk     w14, #0xf180, lsl #16
    mov      w15, #0xdf03
    movk     w15, #0x31d2, lsl #16
    ldr      w16, [sp, #0x14]
    cmp      w16, w11
    b.gt     #0x363f30
    cmp      w16, w12
    b.eq     #0x363f4c
    cmp      w16, w10
    b.eq     #0x363f64
    cmp      w16, w13
    b.ne     #0x363ef4
    ldr      x16, [sp, #0x28]
    sub      x16, x16, #1
    str      x16, [sp, #0x18]
    ldr      x16, [sp, #8]
    str      w14, [x16]
    b        #0x363ef4
    cmp      w16, w14
    b.eq     #0x363f80
    cmp      w16, w15
    b.ne     #0x363f94
    ldr      x16, [sp, #8]
    str      w8, [x16]
    b        #0x363ef4
    ldrb     w16, [sp, #0x27]
    cmp      w16, #0
    csel     w16, w13, w8, ne
    ldr      x17, [sp, #8]
    str      w16, [x17]
    b        #0x363ef4
    ldr      x16, [sp, #0x28]
    cmp      x16, #0
    cset     w16, gt
    strb     w16, [sp, #0x27]
    ldr      x16, [sp, #8]
    str      w12, [x16]
    b        #0x363ef4
    ldr      x16, [sp, #0x18]
    str      x16, [x9, #0x1b0]
    ldr      x16, [sp, #8]
    str      w15, [x16]
    b        #0x363ef4
    cmp      w16, w8
    b.ne     #0x363ef4
    add      sp, sp, #0x30
    ret      

// -[WCLGHomeGroups notifyChanged] IMP=0x363FA4 bounds=0x363FA4-0x36431C
loc_363FA4:
    sub      sp, sp, #0xf0
    stp      d9, d8, [sp, #0x80]
    stp      x28, x27, [sp, #0x90]
    stp      x26, x25, [sp, #0xa0]
    stp      x24, x23, [sp, #0xb0]
    stp      x22, x21, [sp, #0xc0]
    stp      x20, x19, [sp, #0xd0]
    stp      x29, x30, [sp, #0xe0]
    add      x29, sp, #0xe0
    mov      w8, #0xcb1a
    movk     w8, #0x8a39, lsl #16
    str      w8, [sp, #0x54]
    add      x8, sp, #0x54
    str      x8, [sp, #0x48]
    mov      w24, #0xfaf6
    movk     w24, #0xf444, lsl #16
    mov      w25, #0xe5a5
    movk     w25, #0x9829, lsl #16
    mov      w26, #0x5363
    movk     w26, #0x827c, lsl #16
    mov      w22, #0x4313
    movk     w22, #0xd104, lsl #16
    add      x8, sp, #0x58
    add      x8, x8, #8
    stp      x8, x0, [sp, #8]
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    mov      w27, #0x2ac
    movk     w27, #0x3a13, lsl #16
    mov      w23, #0x3c4d
    movk     w23, #0x1245, lsl #16
    mov      w20, #0xfaf7
    movk     w20, #0xf444, lsl #16
    mov      w21, #0x2ab
    movk     w21, #0x3a13, lsl #16
    mov      w19, #0x3c4c
    movk     w19, #0x1245, lsl #16
    mov      w28, #0xe520
    movk     w28, #0x7249, lsl #16
    ldr      w8, [sp, #0x54]
    cmp      w8, w24
    b.le     #0x364088
    cmp      w8, w21
    b.gt     #0x3640d4
    cmp      w8, w19
    b.gt     #0x364198
    cmp      w8, w20
    b.eq     #0x3641e0
    mov      w9, #0xbe83
    movk     w9, #0x8cd, lsl #16
    cmp      w8, w9
    b.ne     #0x364040
    ldr      x8, [sp, #0x48]
    mov      w9, #0x5614
    movk     w9, #0x73a2, lsl #16
    str      w9, [x8]
    b        #0x364040
    cmp      w8, w25
    b.le     #0x364114
    cmp      w8, w22
    b.gt     #0x36415c
    mov      w9, #0xe5a6
    movk     w9, #0x9829, lsl #16
    cmp      w8, w9
    b.eq     #0x3641f4
    mov      w9, #0xc495
    movk     w9, #0xab01, lsl #16
    cmp      w8, w9
    b.ne     #0x364040
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x48]
    mov      w9, #0xe64b
    movk     w9, #0x3732, lsl #16
    str      w9, [x8]
    b        #0x364040
    cmp      w8, w28
    b.gt     #0x3641c4
    cmp      w8, w27
    b.eq     #0x3642ac
    mov      w9, #0xa9d
    movk     w9, #0x4f5b, lsl #16
    cmp      w8, w9
    b.ne     #0x364040
    ldrb     w8, [sp, #0x47]
    cmp      w8, #0
    mov      w8, #0x5614
    movk     w8, #0x73a2, lsl #16
    mov      w9, #0x22c3
    movk     w9, #0x8cfd, lsl #16
    csel     w8, w8, w9, ne
    b        #0x364268
    cmp      w8, w26
    b.eq     #0x36428c
    mov      w9, #0xcb1a
    movk     w9, #0x8a39, lsl #16
    cmp      w8, w9
    b.eq     #0x3642c0
    mov      w9, #0x22c3
    movk     w9, #0x8cfd, lsl #16
    cmp      w8, w9
    b.ne     #0x364040
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp, #0x58]
    ldr      x8, [sp, #0x48]
    mov      w9, #0xe5a6
    movk     w9, #0x9829, lsl #16
    str      w9, [x8]
    b        #0x364040
    mov      w9, #0x4314
    movk     w9, #0xd104, lsl #16
    cmp      w8, w9
    b.eq     #0x364210
    mov      w9, #0x4abc
    movk     w9, #0xe8fc, lsl #16
    cmp      w8, w9
    b.ne     #0x364040
    ldr      x1, [sp, #0x28]
    adrp     x0, #0x4a0000
    ldr      x0, [x0, #0x770]
    bl       #0x461978 // _dispatch_async
    ldr      x8, [sp, #0x48]
    str      w20, [x8]
    b        #0x364040
    cmp      w8, w23
    b.eq     #0x364274
    mov      w9, #0xe64b
    movk     w9, #0x3732, lsl #16
    cmp      w8, w9
    b.ne     #0x364040
    ldr      x8, [sp, #0x48]
    mov      w9, #0xbe83
    movk     w9, #0x8cd, lsl #16
    str      w9, [x8]
    b        #0x364040
    mov      w9, #0xe521
    movk     w9, #0x7249, lsl #16
    cmp      w8, w9
    b.ne     #0x3642e8
    ldr      x0, [sp, #0x28]
    ldr      x8, [sp, #0x18]
    blr      x8
    ldr      x8, [sp, #0x48]
    mov      w9, #0xc495
    movk     w9, #0xab01, lsl #16
    str      w9, [x8]
    b        #0x364040
    ldr      x8, [sp, #8]
    str      x8, [sp, #0x38]
    ldr      x8, [sp, #0x48]
    mov      w9, #0x4314
    movk     w9, #0xd104, lsl #16
    str      w9, [x8]
    b        #0x364040
    ldr      x8, [sp, #0x38]
    str      d8, [x8]
    adrp     x8, #0x364000
    add      x9, x8, #0x31c
    adrp     x8, #0x4a1000
    add      x8, x8, #0xa00
    stp      x9, x8, [sp, #0x68]
    add      x8, sp, #0x58
    add      x8, x8, #0x20
    str      x8, [sp, #0x30]
    ldr      x8, [sp, #0x10]
    str      x8, [sp, #0x78]
    add      x0, sp, #0x58
    bl       #0x461cd8 // _objc_retainBlock
    str      x0, [sp, #0x28]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1a8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xd58]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    csel     w8, w23, w27, ne
    ldr      x9, [sp, #0x48]
    str      w8, [x9]
    b        #0x364040
    ldr      x8, [sp, #0x28]
    add      x8, x8, #0x10
    str      x8, [sp, #0x20]
    ldr      x8, [sp, #0x48]
    str      w26, [x8]
    b        #0x364040
    ldr      x8, [sp, #0x20]
    ldr      x8, [x8]
    str      x8, [sp, #0x18]
    ldr      x8, [sp, #0x48]
    mov      w9, #0xe521
    movk     w9, #0x7249, lsl #16
    str      w9, [x8]
    b        #0x364040
    ldr      x8, [sp, #0x48]
    mov      w9, #0x4abc
    movk     w9, #0xe8fc, lsl #16
    str      w9, [x8]
    b        #0x364040
    adrp     x8, #0x581000
    ldr      x8, [x8, #0x1b0]
    cmp      x8, #0
    cset     w8, gt
    strb     w8, [sp, #0x47]
    ldr      x8, [sp, #0x48]
    mov      w9, #0xa9d
    movk     w9, #0x4f5b, lsl #16
    str      w9, [x8]
    b        #0x364040
    mov      w9, #0x5614
    movk     w9, #0x73a2, lsl #16
    cmp      w8, w9
    b.ne     #0x364040
    ldp      x29, x30, [sp, #0xe0]
    ldp      x20, x19, [sp, #0xd0]
    ldp      x22, x21, [sp, #0xc0]
    ldp      x24, x23, [sp, #0xb0]
    ldp      x26, x25, [sp, #0xa0]
    ldp      x28, x27, [sp, #0x90]
    ldp      d9, d8, [sp, #0x80]
    add      sp, sp, #0xf0
    ret      

// -[WCLGHomeGroups .cxx_destruct] IMP=0x364784 bounds=0x364784-0x36480C
loc_364784:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    add      x8, x0, #0x18
    str      x8, [sp, #0x18]
    mov      w20, #0xaff6
    movk     w20, #0xb498, lsl #16
    str      w20, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w21, #0xb648
    movk     w21, #0x9e4f, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w20
    b.eq     #0x3647d8
    cmp      w8, w21
    b.ne     #0x3647c0
    b        #0x3647f0
    ldr      x0, [sp, #0x18]
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x3647c0
    add      x0, x19, #0x10
    mov      x1, #0
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    b        #0x461cfc // _objc_storeStrong
