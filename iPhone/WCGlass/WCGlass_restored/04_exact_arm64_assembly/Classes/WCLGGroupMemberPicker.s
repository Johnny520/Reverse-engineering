// Exact ARM64 listing for WCLGGroupMemberPicker

// +[WCLGGroupMemberPicker presentForGroupID:title:preselectedMembers:sessionUsernames:fromController:onComplete:] IMP=0x30000C bounds=0x30000C-0x300860
loc_30000C:
    sub      sp, sp, #0xf0
    stp      x28, x27, [sp, #0x90]
    stp      x26, x25, [sp, #0xa0]
    stp      x24, x23, [sp, #0xb0]
    stp      x22, x21, [sp, #0xc0]
    stp      x20, x19, [sp, #0xd0]
    stp      x29, x30, [sp, #0xe0]
    add      x29, sp, #0xe0
    mov      x20, x6
    mov      x22, x5
    mov      x21, x4
    mov      x23, x3
    mov      x19, x2
    mov      w24, #0x4ab9
    movk     w24, #0x41a6, lsl #16
    mov      w27, #0x740
    movk     w27, #0x32a0, lsl #16
    adrp     x8, #0x580000
    add      x8, x8, #0x868
    ldar     w8, [x8]
    stur     w8, [x29, #-0x54]
    mov      w8, #0xcc9f
    movk     w8, #0x1430, lsl #16
    str      w8, [sp, #0x14]
    add      x8, sp, #0x14
    stp      x7, x8, [sp]
    mov      w28, #0xd81a
    movk     w28, #0xfa5, lsl #16
    mov      w25, #0x105b
    movk     w25, #0xe503, lsl #16
    mov      w26, #0x400c
    movk     w26, #0x657, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w28
    b.le     #0x300108
    mov      w9, #0xfe65
    movk     w9, #0x33ad, lsl #16
    cmp      w8, w9
    b.le     #0x300224
    mov      w9, #0x4ab8
    movk     w9, #0x41a6, lsl #16
    cmp      w8, w9
    b.le     #0x300530
    mov      w9, #0xaf2c
    movk     w9, #0x62c5, lsl #16
    cmp      w8, w9
    b.gt     #0x300578
    cmp      w8, w24
    b.eq     #0x300630
    mov      w9, #0xb13c
    movk     w9, #0x4c31, lsl #16
    cmp      w8, w9
    b.ne     #0x30008c
    ldurh    w8, [x29, #-0x58]
    mov      w9, #0xea08
    eor      w8, w8, w9
    adrp     x9, #0x545000
    strh     w8, [x9, #0xa96]
    ldr      x8, [sp, #8]
    mov      w9, #0xc898
    movk     w9, #0x90c, lsl #16
    str      w9, [x8]
    b        #0x30008c
    cmp      w8, w25
    b.le     #0x3002e0
    mov      w9, #0x400b
    movk     w9, #0x657, lsl #16
    cmp      w8, w9
    b.gt     #0x3003ac
    mov      w9, #0x759
    movk     w9, #0xf4be, lsl #16
    cmp      w8, w9
    b.le     #0x3005d0
    mov      w9, #0x75a
    movk     w9, #0xf4be, lsl #16
    cmp      w8, w9
    b.eq     #0x300604
    mov      w9, #0x473c
    movk     w9, #0xfbb5, lsl #16
    cmp      w8, w9
    b.ne     #0x30008c
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x888]
    ldr      x0, [sp, #0x40]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    adrp     x8, #0x545000
    add      x8, x8, #0xac0
    csel     x2, x8, x23, eq
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb80]
    ldr      x0, [sp, #0x40]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x170]
    adrp     x26, #0x4a0000
    ldr      x26, [x26, #0x2d8]
    ldr      x8, [x26]
    cmp      x21, #0
    csel     x2, x8, x21, eq
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xaf8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x750]
    ldr      x0, [sp, #0x40]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    mov      w25, #0x105b
    movk     w25, #0xe503, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x8, [x26]
    mov      w26, #0x400c
    movk     w26, #0x657, lsl #16
    cmp      x22, #0
    csel     x2, x8, x22, eq
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x890]
    ldr      x0, [sp, #0x40]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    mov      w9, #0xb9ff
    movk     w9, #0x8ccd, lsl #16
    str      w9, [x8]
    b        #0x30008c
    mov      w9, #0x67a5
    movk     w9, #0x300b, lsl #16
    cmp      w8, w9
    b.gt     #0x300420
    mov      w9, #0xd81b
    movk     w9, #0xfa5, lsl #16
    cmp      w8, w9
    b.eq     #0x300770
    mov      w9, #0xcc9f
    movk     w9, #0x1430, lsl #16
    cmp      w8, w9
    b.eq     #0x3006b4
    mov      w9, #0x2f11
    movk     w9, #0x1fb2, lsl #16
    cmp      w8, w9
    b.ne     #0x30008c
    ldp      x0, x25, [sp, #0x30]
    str      x0, [sp, #0x20]
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    ldr      x1, [sp, #0x60]
    bl       #0x461c6c // _objc_msgSend
    mov      x27, x0
    mov      x0, x26
    mov      w26, #0x400c
    movk     w26, #0x657, lsl #16
    mov      w24, #0x4ab9
    movk     w24, #0x41a6, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      w25, #0x105b
    movk     w25, #0xe503, lsl #16
    bl       #0x461c9c // _objc_release
    cmp      w27, #0
    mov      w27, #0x740
    movk     w27, #0x32a0, lsl #16
    mov      w8, #0x2bba
    movk     w8, #0xb44, lsl #16
    csel     w8, w27, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    ldr      x8, [sp, #0x20]
    str      x8, [sp, #0x28]
    b        #0x30008c
    mov      w9, #0x91cf
    movk     w9, #0xb0d9, lsl #16
    cmp      w8, w9
    b.gt     #0x30048c
    mov      w9, #0x2382
    movk     w9, #0x8267, lsl #16
    cmp      w8, w9
    b.eq     #0x3007a8
    mov      w9, #0xc9ff
    movk     w9, #0x894d, lsl #16
    cmp      w8, w9
    b.eq     #0x30070c
    mov      w9, #0xb9ff
    movk     w9, #0x8ccd, lsl #16
    cmp      w8, w9
    b.ne     #0x30008c
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x898]
    ldr      x0, [sp, #0x40]
    ldr      x2, [sp]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1b8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f0]
    ldr      x2, [sp, #0x40]
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb50]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    ldr      x0, [sp, #0x18]
    mov      x2, x25
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    mov      w25, #0x105b
    movk     w25, #0xe503, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x40]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0xd81b
    movk     w9, #0xfa5, lsl #16
    str      w9, [x8]
    b        #0x30008c
    cmp      w8, w26
    b.eq     #0x300764
    mov      w9, #0xc898
    movk     w9, #0x90c, lsl #16
    cmp      w8, w9
    b.eq     #0x300670
    mov      w9, #0x2bba
    movk     w9, #0xb44, lsl #16
    cmp      w8, w9
    b.ne     #0x30008c
    ldur     x1, [x29, #-0x68]
    ldr      x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x58]
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    ldur     x1, [x29, #-0x68]
    ldr      x0, [sp, #0x58]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x50]
    ldr      x8, [sp, #8]
    mov      w9, #0x105c
    movk     w9, #0xe503, lsl #16
    str      w9, [x8]
    b        #0x30008c
    mov      w9, #0x67a6
    movk     w9, #0x300b, lsl #16
    cmp      w8, w9
    b.eq     #0x300784
    mov      w9, #0x393b
    movk     w9, #0x3134, lsl #16
    cmp      w8, w9
    b.eq     #0x3006d8
    cmp      w8, w27
    b.ne     #0x30008c
    ldr      x0, [sp, #0x28]
    str      x0, [sp, #0x18]
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    bl       #0x461c9c // _objc_release
    cmp      x25, #0
    mov      w25, #0x105b
    movk     w25, #0xe503, lsl #16
    mov      w8, #0xd81b
    movk     w8, #0xfa5, lsl #16
    mov      w9, #0xfe66
    movk     w9, #0x33ad, lsl #16
    csel     w8, w9, w8, eq
    b        #0x300728
    mov      w9, #0x91d0
    movk     w9, #0xb0d9, lsl #16
    cmp      w8, w9
    b.eq     #0x3007c8
    mov      w9, #0x7eab
    movk     w9, #0xc844, lsl #16
    cmp      w8, w9
    b.eq     #0x300734
    mov      w9, #0x3f79
    movk     w9, #0xe127, lsl #16
    cmp      w8, w9
    b.ne     #0x30008c
    adrp     x9, #0x545000
    add      x9, x9, #0xa80
    ldrh     w8, [x9]
    mov      w10, #0xcc7d
    eor      w8, w8, w10
    adrp     x10, #0x545000
    add      x10, x10, #0xa8c
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0xd7d
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0xe738
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w11, #0xf944
    eor      w8, w8, w11
    strh     w8, [x10, #6]
    ldrh     w8, [x9, #8]
    mov      w9, #0xa494
    eor      w8, w8, w9
    strh     w8, [x10, #8]
    ldr      x8, [sp, #8]
    mov      w9, #0x91d0
    movk     w9, #0xb0d9, lsl #16
    str      w9, [x8]
    b        #0x30008c
    mov      w9, #0xfe66
    movk     w9, #0x33ad, lsl #16
    cmp      w8, w9
    b.eq     #0x30080c
    mov      w9, #0x3e21
    movk     w9, #0x3595, lsl #16
    cmp      w8, w9
    b.eq     #0x3007e8
    mov      w9, #0x17
    movk     w9, #0x3889, lsl #16
    cmp      w8, w9
    b.ne     #0x30008c
    ldurb    w8, [x29, #-0x59]
    cmp      w8, #0
    mov      w8, #0x9ab
    movk     w8, #0x7849, lsl #16
    csel     w8, w24, w8, ne
    b        #0x300728
    mov      w9, #0xaf2d
    movk     w9, #0x62c5, lsl #16
    cmp      w8, w9
    b.eq     #0x300654
    mov      w9, #0x9ab
    movk     w9, #0x7849, lsl #16
    cmp      w8, w9
    b.ne     #0x30008c
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xdb8]
    stur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x70]
    ldr      x8, [sp, #8]
    mov      w9, #0x3e21
    movk     w9, #0x3595, lsl #16
    str      w9, [x8]
    b        #0x30008c
    mov      w9, #0x105c
    movk     w9, #0xe503, lsl #16
    cmp      w8, w9
    b.ne     #0x300830
    ldr      x8, [sp, #0x50]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [sp, #0x4f]
    ldr      x8, [sp, #8]
    mov      w9, #0x75a
    movk     w9, #0xf4be, lsl #16
    str      w9, [x8]
    b        #0x30008c
    ldrb     w8, [sp, #0x4f]
    cmp      w8, #0
    mov      w8, #0x2f11
    movk     w8, #0x1fb2, lsl #16
    csel     w8, w27, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    ldp      x9, x8, [sp, #0x50]
    stp      x8, x9, [sp, #0x30]
    str      x8, [sp, #0x28]
    b        #0x30008c
    ldr      x0, [sp]
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0x393b
    movk     w9, #0x3134, lsl #16
    str      w9, [x8]
    b        #0x30008c
    ldr      x8, [sp, #8]
    mov      w9, #0x2f11
    movk     w9, #0x1fb2, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x70]
    stp      x20, x8, [sp, #0x30]
    b        #0x30008c
    adrp     x8, #0x580000
    add      x8, x8, #0x868
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp, #8]
    mov      w9, #0x7eab
    movk     w9, #0xc844, lsl #16
    str      w9, [x8]
    b        #0x30008c
    ldur     w8, [x29, #-0x54]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x55]
    ldr      x8, [sp, #8]
    mov      w9, #0xc9ff
    movk     w9, #0x894d, lsl #16
    str      w9, [x8]
    b        #0x30008c
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0xa648
    movk     w9, #0xf4a4, lsl #16
    str      w9, [x8]
    b        #0x30008c
    ldurb    w8, [x29, #-0x55]
    cmp      w8, #0
    mov      w8, #0xc898
    movk     w8, #0x90c, lsl #16
    mov      w9, #0x3f79
    movk     w9, #0xe127, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x30008c
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    ldr      x0, [sp]
    bl       #0x461ca8 // _objc_retain
    cmp      x20, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x59]
    ldr      x8, [sp, #8]
    mov      w9, #0x17
    movk     w9, #0x3889, lsl #16
    str      w9, [x8]
    b        #0x30008c
    ldr      x8, [sp, #8]
    str      w24, [x8]
    b        #0x30008c
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w26, [x8]
    b        #0x30008c
    ldrb     w8, [sp, #0x6f]
    cmp      w8, #0
    mov      w8, #0x2382
    movk     w8, #0x8267, lsl #16
    csel     w8, w27, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    str      x20, [sp, #0x28]
    b        #0x30008c
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0xc40]
    str      x8, [sp, #0x60]
    ldr      x8, [sp, #8]
    mov      w9, #0xaf2d
    movk     w9, #0x62c5, lsl #16
    str      w9, [x8]
    b        #0x30008c
    adrp     x8, #0x545000
    ldrh     w8, [x8, #0xa8a]
    sturh    w8, [x29, #-0x58]
    ldr      x8, [sp, #8]
    mov      w9, #0xb13c
    movk     w9, #0x4c31, lsl #16
    str      w9, [x8]
    b        #0x30008c
    ldr      x8, [sp, #0x70]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [sp, #0x6f]
    ldr      x8, [sp, #8]
    mov      w9, #0x67a6
    movk     w9, #0x300b, lsl #16
    str      w9, [x8]
    b        #0x30008c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x560]
    bl       #0x461bac // _objc_alloc_init
    str      x0, [sp, #0x40]
    ldr      x8, [sp, #8]
    mov      w9, #0x473c
    movk     w9, #0xfbb5, lsl #16
    str      w9, [x8]
    b        #0x30008c
    mov      w9, #0xa648
    movk     w9, #0xf4a4, lsl #16
    cmp      w8, w9
    b.ne     #0x30008c
    ldp      x29, x30, [sp, #0xe0]
    ldp      x20, x19, [sp, #0xd0]
    ldp      x22, x21, [sp, #0xc0]
    ldp      x24, x23, [sp, #0xb0]
    ldp      x26, x25, [sp, #0xa0]
    ldp      x28, x27, [sp, #0x90]
    add      sp, sp, #0xf0
    ret      

// +[WCLGGroupMemberPicker presentSingleSelectWithTitle:excludeMembers:fromController:onPick:] IMP=0x300860 bounds=0x300860-0x30108C
loc_300860:
    sub      sp, sp, #0xf0
    stp      x28, x27, [sp, #0x90]
    stp      x26, x25, [sp, #0xa0]
    stp      x24, x23, [sp, #0xb0]
    stp      x22, x21, [sp, #0xc0]
    stp      x20, x19, [sp, #0xd0]
    stp      x29, x30, [sp, #0xe0]
    add      x29, sp, #0xe0
    mov      x24, x5
    mov      x20, x4
    mov      x22, x3
    mov      x25, x2
    mov      w19, #0x18d2
    movk     w19, #0xf13b, lsl #16
    mov      w26, #0xcc54
    movk     w26, #0xca6f, lsl #16
    adrp     x8, #0x580000
    add      x8, x8, #0x86c
    ldar     w8, [x8]
    stur     w8, [x29, #-0x54]
    mov      w8, #0x953a
    movk     w8, #0x107b, lsl #16
    str      w8, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w28, #0xb257
    movk     w28, #0xfd1a, lsl #16
    mov      w27, #0xcc53
    movk     w27, #0xca6f, lsl #16
    mov      w21, #0x4746
    movk     w21, #0x30a7, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w28
    b.gt     #0x30095c
    cmp      w8, w27
    b.le     #0x3009c8
    mov      w9, #0x8613
    movk     w9, #0xe7a2, lsl #16
    cmp      w8, w9
    b.le     #0x300c04
    mov      w9, #0x18d1
    movk     w9, #0xf13b, lsl #16
    cmp      w8, w9
    b.gt     #0x300cd4
    mov      w9, #0x8614
    movk     w9, #0xe7a2, lsl #16
    cmp      w8, w9
    b.eq     #0x300e04
    mov      w9, #0xeaec
    movk     w9, #0xedf5, lsl #16
    cmp      w8, w9
    b.ne     #0x3008dc
    ldur     x8, [x29, #-0x68]
    cmp      x8, #0
    mov      w8, #0x3198
    movk     w8, #0x7d1d, lsl #16
    mov      w9, #0xcb50
    movk     w9, #0xbd3c, lsl #16
    csel     w8, w8, w9, eq
    ldr      x9, [sp, #8]
    str      w8, [x9]
    str      x20, [sp, #0x28]
    b        #0x3008dc
    cmp      w8, w21
    b.le     #0x300a24
    mov      w9, #0x9ecf
    movk     w9, #0x61df, lsl #16
    cmp      w8, w9
    b.gt     #0x300ae8
    mov      w9, #0x290c
    movk     w9, #0x50c7, lsl #16
    cmp      w8, w9
    b.gt     #0x300d0c
    mov      w9, #0x4747
    movk     w9, #0x30a7, lsl #16
    cmp      w8, w9
    b.eq     #0x300df0
    mov      w9, #0xb6c2
    movk     w9, #0x3bf6, lsl #16
    cmp      w8, w9
    b.ne     #0x3008dc
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0x290d
    movk     w9, #0x50c7, lsl #16
    str      w9, [x8]
    b        #0x3008dc
    mov      w9, #0x7219
    movk     w9, #0xb941, lsl #16
    cmp      w8, w9
    b.gt     #0x300b4c
    mov      w9, #0x63b6
    movk     w9, #0x8837, lsl #16
    cmp      w8, w9
    b.eq     #0x300f20
    mov      w9, #0xa1f2
    movk     w9, #0x89de, lsl #16
    cmp      w8, w9
    b.eq     #0x300e78
    mov      w9, #0xcf2f
    movk     w9, #0x9bd3, lsl #16
    cmp      w8, w9
    b.ne     #0x3008dc
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp, #8]
    mov      w9, #0x2b25
    movk     w9, #0xce43, lsl #16
    str      w9, [x8]
    b        #0x3008dc
    mov      w9, #0xddfa
    movk     w9, #0xb5f, lsl #16
    cmp      w8, w9
    b.gt     #0x300bb0
    mov      w9, #0xb258
    movk     w9, #0xfd1a, lsl #16
    cmp      w8, w9
    b.eq     #0x300fb0
    mov      w9, #0x7ef2
    movk     w9, #0x63, lsl #16
    cmp      w8, w9
    b.eq     #0x300ea4
    mov      w9, #0x7642
    movk     w9, #0x780, lsl #16
    cmp      w8, w9
    b.ne     #0x3008dc
    ldp      x0, x23, [sp, #0x30]
    str      x0, [sp, #0x20]
    ldur     x1, [x29, #-0x60]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x24
    mov      x24, x0
    ldr      x1, [sp, #0x70]
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x25
    mov      x25, x0
    mov      x0, x24
    mov      x24, x26
    mov      w26, #0xcc54
    movk     w26, #0xca6f, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    cmp      w25, #0
    mov      x25, x19
    mov      w19, #0x18d2
    movk     w19, #0xf13b, lsl #16
    mov      w8, #0x3198
    movk     w8, #0x7d1d, lsl #16
    mov      w9, #0xb258
    movk     w9, #0xfd1a, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    ldr      x8, [sp, #0x20]
    str      x8, [sp, #0x28]
    b        #0x3008dc
    mov      w9, #0x9ed0
    movk     w9, #0x61df, lsl #16
    cmp      w8, w9
    b.eq     #0x300ef4
    mov      w9, #0x82a9
    movk     w9, #0x64fe, lsl #16
    cmp      w8, w9
    b.eq     #0x300e40
    mov      w9, #0x3198
    movk     w9, #0x7d1d, lsl #16
    cmp      w8, w9
    b.ne     #0x3008dc
    ldr      x0, [sp, #0x28]
    str      x0, [sp, #0x18]
    ldur     x1, [x29, #-0x60]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    bl       #0x461c9c // _objc_release
    cmp      x23, #0
    mov      w8, #0x8614
    movk     w8, #0xe7a2, lsl #16
    csel     w8, w8, w19, eq
    b        #0x301030
    mov      w9, #0x721a
    movk     w9, #0xb941, lsl #16
    cmp      w8, w9
    b.eq     #0x300f3c
    mov      w9, #0xcb50
    movk     w9, #0xbd3c, lsl #16
    cmp      w8, w9
    b.eq     #0x300e84
    mov      w9, #0xb5b8
    movk     w9, #0xc450, lsl #16
    cmp      w8, w9
    b.ne     #0x3008dc
    ldr      x8, [sp, #0x60]
    cmp      x8, #0
    mov      w9, #0x3198
    movk     w9, #0x7d1d, lsl #16
    mov      w10, #0x7642
    movk     w10, #0x780, lsl #16
    csel     w9, w9, w10, eq
    ldr      x10, [sp, #8]
    str      w9, [x10]
    ldr      x9, [sp, #0x68]
    stp      x9, x8, [sp, #0x30]
    str      x9, [sp, #0x28]
    b        #0x3008dc
    mov      w9, #0xddfb
    movk     w9, #0xb5f, lsl #16
    cmp      w8, w9
    b.eq     #0x300fdc
    mov      w9, #0xb2a4
    movk     w9, #0xd88, lsl #16
    cmp      w8, w9
    b.eq     #0x300ed8
    mov      w9, #0x953a
    movk     w9, #0x107b, lsl #16
    cmp      w8, w9
    b.ne     #0x3008dc
    ldur     w8, [x29, #-0x54]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x55]
    ldr      x8, [sp, #8]
    mov      w9, #0xeffb
    movk     w9, #0xf491, lsl #16
    str      w9, [x8]
    b        #0x3008dc
    cmp      w8, w26
    b.eq     #0x30103c
    mov      w9, #0x2b25
    movk     w9, #0xce43, lsl #16
    cmp      w8, w9
    b.eq     #0x301010
    mov      w9, #0xf912
    movk     w9, #0xce4e, lsl #16
    cmp      w8, w9
    b.ne     #0x3008dc
    ldr      x2, [sp, #0x40]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x8a8]
    ldr      x0, [sp, #0x50]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x40]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x890]
    ldp      x2, x0, [sp, #0x48]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x8b0]
    ldr      x0, [sp, #0x50]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x1b8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f0]
    ldr      x2, [sp, #0x50]
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb50]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x9f8]
    ldr      x0, [sp, #0x18]
    mov      x2, x23
    mov      w3, #1
    mov      x4, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x50]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w19, [x8]
    b        #0x3008dc
    cmp      w8, w19
    b.eq     #0x300e24
    mov      w9, #0xeffb
    movk     w9, #0xf491, lsl #16
    cmp      w8, w9
    b.ne     #0x3008dc
    ldurb    w8, [x29, #-0x55]
    cmp      w8, #0
    mov      w8, #0x9ed0
    movk     w8, #0x61df, lsl #16
    mov      w9, #0x721a
    movk     w9, #0xb941, lsl #16
    csel     w8, w9, w8, ne
    b        #0x301030
    mov      w9, #0x3f82
    movk     w9, #0x5dcd, lsl #16
    cmp      w8, w9
    b.ne     #0x301058
    ldr      x0, [sp, #0x58]
    bl       #0x461bac // _objc_alloc_init
    str      x0, [sp, #0x50]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x8a0]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    mov      x0, x25
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    adrp     x8, #0x545000
    add      x8, x8, #0xb20
    csel     x2, x8, x25, eq
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb80]
    ldr      x0, [sp, #0x50]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x170]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x750]
    ldr      x0, [sp, #0x50]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2d8]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x2d8]
    ldr      x8, [x8]
    str      x8, [sp, #0x48]
    cmp      x22, #0
    csel     x2, x8, x22, eq
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xaf8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x40]
    ldr      x8, [sp, #8]
    mov      w9, #0xf912
    movk     w9, #0xce4e, lsl #16
    str      w9, [x8]
    b        #0x3008dc
    ldr      x8, [sp, #8]
    mov      w9, #0x9ed0
    movk     w9, #0x61df, lsl #16
    str      w9, [x8]
    b        #0x3008dc
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x560]
    str      x8, [sp, #0x58]
    ldr      x8, [sp, #8]
    mov      w9, #0x3f82
    movk     w9, #0x5dcd, lsl #16
    str      w9, [x8]
    b        #0x3008dc
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0xa1f2
    movk     w9, #0x89de, lsl #16
    str      w9, [x8]
    b        #0x3008dc
    ldurh    w8, [x29, #-0x58]
    adrp     x10, #0x545000
    add      x10, x10, #0xaf4
    strh     w8, [x10]
    adrp     x8, #0x545000
    ldrh     w8, [x8, #0xaea]
    mov      w9, #0x6cda
    eor      w8, w8, w9
    strh     w8, [x10, #2]
    ldr      x8, [sp, #8]
    mov      w9, #0x4747
    movk     w9, #0x30a7, lsl #16
    str      w9, [x8]
    b        #0x3008dc
    ldr      x8, [sp, #8]
    str      w26, [x8]
    b        #0x3008dc
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0xc40]
    str      x8, [sp, #0x70]
    ldr      x8, [sp, #8]
    mov      w9, #0x63b6
    movk     w9, #0x8837, lsl #16
    str      w9, [x8]
    b        #0x3008dc
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xdb8]
    stur     x1, [x29, #-0x60]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x68]
    ldr      x8, [sp, #8]
    mov      w9, #0xeaec
    movk     w9, #0xedf5, lsl #16
    str      w9, [x8]
    b        #0x3008dc
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp, #8]
    mov      w9, #0x7ef2
    movk     w9, #0x63, lsl #16
    str      w9, [x8]
    b        #0x3008dc
    adrp     x8, #0x580000
    add      x8, x8, #0x86c
    mov      w9, #1
    stlr     w9, [x8]
    mov      x0, x25
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp, #8]
    mov      w9, #0xcf2f
    movk     w9, #0x9bd3, lsl #16
    str      w9, [x8]
    b        #0x3008dc
    ldr      x8, [sp, #8]
    mov      w9, #0x7642
    movk     w9, #0x780, lsl #16
    str      w9, [x8]
    ldur     x8, [x29, #-0x68]
    stp      x20, x8, [sp, #0x30]
    b        #0x3008dc
    adrp     x9, #0x545000
    add      x9, x9, #0xae0
    ldrh     w8, [x9]
    mov      w10, #0x7240
    eor      w8, w8, w10
    adrp     x10, #0x545000
    add      x10, x10, #0xaec
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0xcb8d
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0x5308
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w11, #0x3dd6
    eor      w8, w8, w11
    strh     w8, [x10, #6]
    ldrh     w8, [x9, #8]
    mov      w9, #0x3cbc
    eor      w8, w8, w9
    sturh    w8, [x29, #-0x58]
    ldr      x8, [sp, #8]
    mov      w9, #0x82a9
    movk     w9, #0x64fe, lsl #16
    str      w9, [x8]
    b        #0x3008dc
    ldur     x1, [x29, #-0x60]
    ldr      x0, [sp, #0x20]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x68]
    ldr      x8, [sp, #8]
    mov      w9, #0xddfb
    movk     w9, #0xb5f, lsl #16
    str      w9, [x8]
    b        #0x3008dc
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    ldur     x1, [x29, #-0x60]
    ldr      x0, [sp, #0x68]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x60]
    ldr      x8, [sp, #8]
    mov      w9, #0xb5b8
    movk     w9, #0xc450, lsl #16
    str      w9, [x8]
    b        #0x3008dc
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    cmp      x20, #0
    mov      w8, #0xb2a4
    movk     w8, #0xd88, lsl #16
    csel     w8, w26, w8, eq
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x3008dc
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    mov      w9, #0xb6c2
    movk     w9, #0x3bf6, lsl #16
    str      w9, [x8]
    b        #0x3008dc
    mov      w9, #0x290d
    movk     w9, #0x50c7, lsl #16
    cmp      w8, w9
    b.ne     #0x3008dc
    mov      x0, x25
    ldp      x29, x30, [sp, #0xe0]
    ldp      x20, x19, [sp, #0xd0]
    ldp      x22, x21, [sp, #0xc0]
    ldp      x24, x23, [sp, #0xb0]
    ldp      x26, x25, [sp, #0xa0]
    ldp      x28, x27, [sp, #0x90]
    add      sp, sp, #0xf0
    b        #0x461c9c // _objc_release

// -[WCLGGroupMemberPicker viewDidLoad] IMP=0x30108C bounds=0x30108C-0x301B44
loc_30108C:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x70
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    adrp     x9, #0x580000
    add      x9, x9, #0x870
    stur     x8, [x29, #-0x58]
    mov      w10, #0x1746
    movk     w10, #0xb327, lsl #16
    ldar     w8, [x9]
    sub      x9, x29, #0xac
    mov      w26, #0xc998
    movk     w26, #0x183f, lsl #16
    stur     w8, [x29, #-0x5c]
    mov      w20, #0x1745
    movk     w20, #0xb327, lsl #16
    mov      w22, #0xd07e
    movk     w22, #0x8e62, lsl #16
    stur     w10, [x29, #-0xac]
    stur     x9, [x29, #-0xb8]
    mov      w23, #0x48cc
    movk     w23, #0x5282, lsl #16
    adrp     x27, #0x545000
    add      x27, x27, #0xb40
    adrp     x21, #0x545000
    add      x21, x21, #0xb4c
    mov      w28, #0x48cb
    movk     w28, #0x5282, lsl #16
    ldur     w8, [x29, #-0xac]
    cmp      w8, w26
    b.gt     #0x301190
    cmp      w8, w20
    b.gt     #0x301208
    cmp      w8, w22
    b.eq     #0x30133c
    mov      w9, #0x67ff
    movk     w9, #0x94a5, lsl #16
    cmp      w8, w9
    b.eq     #0x301794
    mov      w9, #0x3cd3
    movk     w9, #0xa1c2, lsl #16
    cmp      w8, w9
    b.ne     #0x30111c
    ldur     x0, [x29, #-0x68]
    ldur     x8, [x29, #-0x78]
    str      x8, [x0, #8]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc80]
    bl       #0x461c84 // _objc_msgSendSuper2
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x8b8]
    stur     x8, [x29, #-0x80]
    ldur     x8, [x29, #-0xb8]
    mov      w9, #0xe8de
    movk     w9, #0x4e64, lsl #16
    str      w9, [x8]
    b        #0x30111c
    cmp      w8, w28
    b.le     #0x301288
    cmp      w8, w23
    b.eq     #0x3012e4
    mov      w9, #0x1144
    movk     w9, #0x786a, lsl #16
    cmp      w8, w9
    b.eq     #0x301774
    mov      w9, #0x2e02
    movk     w9, #0x7ac5, lsl #16
    cmp      w8, w9
    b.ne     #0x30111c
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x908]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x910]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldur     x8, [x29, #-0xb8]
    mov      w9, #0xc999
    movk     w9, #0x183f, lsl #16
    str      w9, [x8]
    adrp     x8, #0x4c1000
    add      x8, x8, #0x918
    stur     x8, [x29, #-0xa8]
    b        #0x30111c
    mov      w9, #0x1746
    movk     w9, #0xb327, lsl #16
    cmp      w8, w9
    b.eq     #0x3013a0
    mov      w9, #0x866d
    movk     w9, #0x216, lsl #16
    cmp      w8, w9
    b.eq     #0x3018f0
    mov      w9, #0xd382
    movk     w9, #0x17c7, lsl #16
    cmp      w8, w9
    b.ne     #0x30111c
    adrp     x8, #0x580000
    add      x8, x8, #0x870
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x10
    mov      sp, x8
    stur     x8, [x29, #-0x68]
    sub      x8, sp, #0x20
    mov      sp, x8
    stur     x8, [x29, #-0x70]
    ldur     x8, [x29, #-0x68]
    str      x19, [x8]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x7b0]
    stur     x8, [x29, #-0x78]
    ldur     x8, [x29, #-0xb8]
    mov      w9, #0x3cd3
    movk     w9, #0xa1c2, lsl #16
    str      w9, [x8]
    b        #0x30111c
    mov      w9, #0xed8e
    movk     w9, #0x34cf, lsl #16
    cmp      w8, w9
    b.eq     #0x3013c4
    mov      w9, #0xe8de
    movk     w9, #0x4e64, lsl #16
    cmp      w8, w9
    b.ne     #0x301ae8
    ldur     x1, [x29, #-0x80]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    ldur     x8, [x29, #-0xb8]
    mov      w9, #0xc999
    movk     w9, #0x183f, lsl #16
    mov      w10, #0xed8e
    movk     w10, #0x34cf, lsl #16
    csel     w9, w9, w10, ne
    str      w9, [x8]
    adrp     x8, #0x4c1000
    add      x8, x8, #0x8c0
    stur     x8, [x29, #-0xa8]
    b        #0x30111c
    ldurh    w8, [x29, #-0x60]
    mov      w9, #0xfa8d
    eor      w8, w8, w9
    adrp     x9, #0x545000
    strh     w8, [x9, #0xb9e]
    adrp     x9, #0x545000
    add      x9, x9, #0xb64
    ldrh     w8, [x9]
    mov      w10, #0x96e5
    eor      w8, w8, w10
    adrp     x10, #0x545000
    add      x10, x10, #0xb6a
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w9, #0xb0f0
    eor      w8, w8, w9
    strh     w8, [x10, #2]
    ldur     x8, [x29, #-0xb8]
    mov      w9, #0x67ff
    movk     w9, #0x94a5, lsl #16
    str      w9, [x8]
    b        #0x30111c
    adrp     x11, #0x545000
    add      x11, x11, #0xb8c
    ldrh     w8, [x11]
    mov      w9, #0x4744
    eor      w8, w8, w9
    adrp     x9, #0x545000
    add      x9, x9, #0xb96
    strh     w8, [x9]
    ldrh     w8, [x11, #2]
    mov      w10, #0x27de
    eor      w8, w8, w10
    strh     w8, [x9, #2]
    ldrh     w8, [x11, #4]
    mov      w10, #0xf485
    eor      w8, w8, w10
    strh     w8, [x9, #4]
    ldrh     w8, [x11, #6]
    mov      w10, #0x2444
    eor      w8, w8, w10
    strh     w8, [x9, #6]
    ldrh     w8, [x11, #8]
    sturh    w8, [x29, #-0x60]
    ldur     x8, [x29, #-0xb8]
    str      w23, [x8]
    b        #0x30111c
    ldur     w8, [x29, #-0x5c]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x5d]
    ldur     x8, [x29, #-0xb8]
    mov      w9, #0x1144
    movk     w9, #0x786a, lsl #16
    str      w9, [x8]
    b        #0x30111c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x620]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    stur     x1, [x29, #-0x88]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x25, #0x4c4000
    ldr      x0, [x25, #0x328]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c1000
    ldr      x4, [x8, #0x8d0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xba8]
    mov      w2, #1
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x22, [x8, #0xbb0]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbb8]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldr      x0, [x25, #0x328]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4bf000
    ldr      x5, [x8, #0xb30]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x650]
    adrp     x2, #0x545000
    add      x2, x2, #0xd00
    mov      w3, #2
    mov      x4, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x378]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x468]
    bl       #0x461ba0 // _objc_alloc
    mov      x23, x0
    ldur     x2, [x29, #-0x70]
    adrp     x8, #0x545000
    add      x9, x8, #0xcc0
    adrp     x8, #0x545000
    add      x8, x8, #0xc80
    stp      x9, x8, [x2]
    adrp     x8, #0x545000
    add      x9, x8, #0xc40
    adrp     x8, #0x545000
    add      x8, x8, #0xc00
    stp      x9, x8, [x2, #0x10]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    mov      w3, #4
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa10]
    mov      x0, x23
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x8d8]
    mov      x0, x19
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x23, [x8, #0x8e0]
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa28]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4c1000
    ldr      x3, [x8, #0x8e8]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    mov      x2, x19
    mov      w4, #0x1000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x250]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    mov      w23, #0x48cc
    movk     w23, #0x5282, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x568]
    bl       #0x461bac // _objc_alloc_init
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x8f0]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x5a0]
    stur     x1, [x29, #-0x90]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x8f8]
    adrp     x2, #0x545000
    add      x2, x2, #0xbc0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x1, [x29, #-0x90]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xc78]
    stur     x1, [x29, #-0x98]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x1, [x29, #-0x90]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x900]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x1, [x29, #-0x90]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x7f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    mov      w22, #0xd07e
    movk     w22, #0x8e62, lsl #16
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0xb8]
    mov      w9, #0x866d
    movk     w9, #0x216, lsl #16
    str      w9, [x8]
    b        #0x30111c
    ldurb    w8, [x29, #-0x5d]
    cmp      w8, #0
    mov      w8, #0xd382
    movk     w8, #0x17c7, lsl #16
    csel     w8, w22, w8, ne
    ldur     x9, [x29, #-0xb8]
    str      w8, [x9]
    b        #0x30111c
    adrp     x8, #0x545000
    ldrh     w8, [x8, #0xb68]
    mov      w9, #0x5f13
    eor      w8, w8, w9
    adrp     x9, #0x545000
    strh     w8, [x9, #0xb6e]
    adrp     x9, #0x545000
    add      x9, x9, #0xb58
    ldrh     w8, [x9]
    mov      w10, #0x5648
    eor      w8, w8, w10
    adrp     x10, #0x545000
    add      x10, x10, #0xb5e
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0x1328
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w9, #0x4614
    eor      w8, w8, w9
    strh     w8, [x10, #4]
    adrp     x9, #0x545000
    add      x9, x9, #0xb7c
    ldrh     w8, [x9]
    mov      w10, #0xd7c3
    eor      w8, w8, w10
    adrp     x10, #0x545000
    add      x10, x10, #0xb84
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0xb31c
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0xfbf9
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w9, #0xa2bc
    eor      w8, w8, w9
    strh     w8, [x10, #6]
    adrp     x9, #0x545000
    add      x9, x9, #0xb70
    ldrh     w8, [x9]
    mov      w10, #0xea95
    eor      w8, w8, w10
    adrp     x10, #0x545000
    add      x10, x10, #0xb76
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0xdb2f
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w9, #0x69c2
    eor      w8, w8, w9
    strh     w8, [x10, #4]
    ldrh     w8, [x27]
    mov      w9, #0xea30
    eor      w8, w8, w9
    strh     w8, [x21]
    ldrh     w8, [x27, #2]
    mov      w9, #0x51eb
    eor      w8, w8, w9
    strh     w8, [x21, #2]
    ldrh     w8, [x27, #4]
    mov      w9, #0xa5fc
    eor      w8, w8, w9
    strh     w8, [x21, #4]
    ldrh     w8, [x27, #6]
    mov      w9, #0x5bb9
    eor      w8, w8, w9
    strh     w8, [x21, #6]
    ldrh     w8, [x27, #8]
    mov      w9, #0x5e5b
    eor      w8, w8, w9
    strh     w8, [x21, #8]
    ldrh     w8, [x27, #0xa]
    mov      w9, #0x48c3
    eor      w8, w8, w9
    strh     w8, [x21, #0xa]
    ldur     x8, [x29, #-0xb8]
    mov      w9, #0xd382
    movk     w9, #0x17c7, lsl #16
    str      w9, [x8]
    b        #0x30111c
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa0]
    bl       #0x461ba0 // _objc_alloc
    mov      x22, x0
    ldur     x1, [x29, #-0x88]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf08]
    mov      x0, x22
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf10]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x628]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x448]
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbf0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldur     x1, [x29, #-0x98]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    ldur     x1, [x29, #-0x90]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xd48]
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x638]
    mov      x8, #0x404c000000000000
    fmov     d0, x8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    mov      w23, #0x48cc
    movk     w23, #0x5282, lsl #16
    bl       #0x461c9c // _objc_release
    ldur     x1, [x29, #-0x88]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xa0]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    ldur     x0, [x29, #-0xa0]
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    mov      w22, #0xd07e
    movk     w22, #0x8e62, lsl #16
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0xb8]
    mov      w9, #0x2e02
    movk     w9, #0x7ac5, lsl #16
    str      w9, [x8]
    b        #0x30111c
    mov      w9, #0xc999
    movk     w9, #0x183f, lsl #16
    cmp      w8, w9
    b.ne     #0x30111c
    ldur     x8, [x29, #-0xa8]
    ldr      x1, [x8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x301b40
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGGroupMemberPicker setupSingleSelect] IMP=0x301B44 bounds=0x301B44-0x302398
loc_301B44:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x60
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    adrp     x9, #0x580000
    add      x9, x9, #0x874
    mov      w21, #0xc30c
    movk     w21, #0x138f, lsl #16
    stur     x8, [x29, #-0x58]
    mov      w10, #0x910e
    movk     w10, #0x62d6, lsl #16
    sub      x8, x29, #0x9c
    ldar     w9, [x9]
    mov      w25, #0x7de4
    movk     w25, #0x462c, lsl #16
    mov      w26, #0xc30b
    movk     w26, #0x138f, lsl #16
    stur     w9, [x29, #-0x5c]
    stur     w10, [x29, #-0x9c]
    adrp     x28, #0x545000
    add      x28, x28, #0xd44
    stur     x8, [x29, #-0xa8]
    adrp     x22, #0x545000
    add      x22, x22, #0xd4c
    mov      w27, #0xe1e2
    movk     w27, #0x5a91, lsl #16
    adrp     x24, #0x545000
    add      x24, x24, #0xd20
    adrp     x23, #0x545000
    add      x23, x23, #0xd2c
    ldur     w8, [x29, #-0x9c]
    cmp      w8, w25
    b.le     #0x301c48
    cmp      w8, w27
    b.gt     #0x301c90
    mov      w9, #0x7de5
    movk     w9, #0x462c, lsl #16
    cmp      w8, w9
    b.eq     #0x301e4c
    mov      w9, #0x4107
    movk     w9, #0x4fd2, lsl #16
    cmp      w8, w9
    b.ne     #0x301bdc
    ldurh    w8, [x29, #-0x62]
    mov      w9, #0x88f5
    eor      w8, w8, w9
    adrp     x9, #0x545000
    add      x9, x9, #0xd34
    strh     w8, [x9]
    adrp     x8, #0x545000
    ldrh     w8, [x8, #0xd2a]
    mov      w10, #0x1d51
    eor      w8, w8, w10
    strh     w8, [x9, #2]
    ldur     x8, [x29, #-0xa8]
    str      w21, [x8]
    b        #0x301bdc
    cmp      w8, w26
    b.gt     #0x301cd4
    mov      w9, #0xeea
    movk     w9, #0x82c1, lsl #16
    cmp      w8, w9
    b.eq     #0x301dec
    mov      w9, #0x2ec8
    movk     w9, #0xb551, lsl #16
    cmp      w8, w9
    b.ne     #0x301bdc
    ldurb    w8, [x29, #-0x5d]
    cmp      w8, #0
    mov      w8, #0xeea
    movk     w8, #0x82c1, lsl #16
    csel     w8, w8, w21, ne
    ldur     x9, [x29, #-0xa8]
    str      w8, [x9]
    b        #0x301bdc
    mov      w9, #0xe1e3
    movk     w9, #0x5a91, lsl #16
    cmp      w8, w9
    b.eq     #0x301ee8
    mov      w9, #0x910e
    movk     w9, #0x62d6, lsl #16
    cmp      w8, w9
    b.ne     #0x301bdc
    ldur     w8, [x29, #-0x5c]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x5d]
    ldur     x8, [x29, #-0xa8]
    mov      w9, #0x2ec8
    movk     w9, #0xb551, lsl #16
    str      w9, [x8]
    b        #0x301bdc
    cmp      w8, w21
    b.ne     #0x301f80
    adrp     x8, #0x580000
    add      x8, x8, #0x874
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x10
    mov      sp, x8
    stur     x8, [x29, #-0x70]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x90]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x620]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3d8]
    stur     x1, [x29, #-0x78]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x460]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x328]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c1000
    ldr      x4, [x8, #0x8d0]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xba8]
    mov      w2, #1
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbb0]
    stur     x1, [x29, #-0x80]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbb8]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    mov      w21, #0xc30c
    movk     w21, #0x138f, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x920]
    stur     x8, [x29, #-0x88]
    ldur     x8, [x29, #-0xa8]
    mov      w9, #0xe1e3
    movk     w9, #0x5a91, lsl #16
    str      w9, [x8]
    b        #0x301bdc
    ldrh     w8, [x28]
    mov      w9, #0x77fd
    eor      w8, w8, w9
    strh     w8, [x22]
    ldrh     w8, [x28, #2]
    mov      w9, #0x5f83
    eor      w8, w8, w9
    strh     w8, [x22, #2]
    ldrh     w8, [x28, #4]
    mov      w9, #0x3da7
    eor      w8, w8, w9
    strh     w8, [x22, #4]
    ldrh     w8, [x28, #6]
    mov      w9, #0x86f2
    eor      w8, w8, w9
    strh     w8, [x22, #6]
    adrp     x8, #0x545000
    ldrh     w8, [x8, #0xd38]
    sturh    w8, [x29, #-0x60]
    ldur     x8, [x29, #-0xa8]
    mov      w9, #0x7de5
    movk     w9, #0x462c, lsl #16
    str      w9, [x8]
    b        #0x301bdc
    ldurh    w8, [x29, #-0x60]
    mov      w9, #0xd1b1
    eor      w8, w8, w9
    adrp     x9, #0x545000
    add      x9, x9, #0xd3e
    strh     w8, [x9]
    adrp     x10, #0x545000
    add      x10, x10, #0xd3a
    ldrh     w8, [x10]
    mov      w11, #0xd1d2
    eor      w8, w8, w11
    strh     w8, [x9, #2]
    ldrh     w8, [x10, #2]
    mov      w10, #0x139d
    eor      w8, w8, w10
    strh     w8, [x9, #4]
    ldrh     w8, [x24]
    mov      w9, #0xc29b
    eor      w8, w8, w9
    strh     w8, [x23]
    ldrh     w8, [x24, #2]
    mov      w9, #0xcfde
    eor      w8, w8, w9
    strh     w8, [x23, #2]
    ldrh     w8, [x24, #4]
    mov      w9, #0x6c09
    eor      w8, w8, w9
    strh     w8, [x23, #4]
    ldrh     w8, [x24, #6]
    mov      w9, #0x145
    eor      w8, w8, w9
    strh     w8, [x23, #6]
    ldrh     w8, [x24, #8]
    sturh    w8, [x29, #-0x62]
    ldur     x8, [x29, #-0xa8]
    mov      w9, #0x4107
    movk     w9, #0x4fd2, lsl #16
    str      w9, [x8]
    b        #0x301bdc
    ldur     x1, [x29, #-0x88]
    mov      x0, x19
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x928]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x468]
    bl       #0x461ba0 // _objc_alloc
    mov      x20, x0
    ldur     x2, [x29, #-0x70]
    adrp     x8, #0x545000
    add      x9, x8, #0xe00
    adrp     x8, #0x545000
    add      x8, x8, #0xdc0
    stp      x9, x8, [x2]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    mov      w3, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    stur     x0, [x29, #-0x90]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa10]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0x98]
    ldur     x8, [x29, #-0xa8]
    mov      w9, #0xade1
    movk     w9, #0x1b9f, lsl #16
    str      w9, [x8]
    b        #0x301bdc
    mov      w9, #0xade1
    movk     w9, #0x1b9f, lsl #16
    cmp      w8, w9
    b.ne     #0x301bdc
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x8d8]
    ldur     x2, [x29, #-0x98]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldur     x0, [x29, #-0x98]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x90]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x20, [x8, #0x8e0]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xa28]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x3, [x8, #0x930]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xec8]
    mov      x2, x19
    mov      w4, #0x1000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldur     x1, [x29, #-0x80]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x250]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x568]
    bl       #0x461bac // _objc_alloc_init
    mov      x20, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x8f0]
    mov      x0, x19
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x20, [x8, #0x5a0]
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x8f8]
    adrp     x2, #0x545000
    add      x2, x2, #0xd80
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0xc78]
    mov      x1, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x900]
    mov      w2, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x7f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa0]
    bl       #0x461ba0 // _objc_alloc
    mov      x22, x0
    ldur     x1, [x29, #-0x78]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x4d8]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf08]
    mov      x0, x22
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xf10]
    mov      x0, x19
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x628]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x448]
    mov      w2, #0x12
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbf0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x1, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xd48]
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x638]
    mov      x8, #0x404c000000000000
    fmov     d0, x8
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x1, [x29, #-0x78]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb40]
    mov      x0, x20
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x910]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x302394
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGGroupMemberPicker onSingleModeChanged:] IMP=0x302398 bounds=0x302398-0x302718
loc_302398:
    sub      sp, sp, #0x90
    stp      x28, x27, [sp, #0x30]
    stp      x26, x25, [sp, #0x40]
    stp      x24, x23, [sp, #0x50]
    stp      x22, x21, [sp, #0x60]
    stp      x20, x19, [sp, #0x70]
    stp      x29, x30, [sp, #0x80]
    add      x29, sp, #0x80
    mov      x19, x0
    mov      w21, #0xa4f1
    movk     w21, #0x7f63, lsl #16
    adrp     x8, #0x580000
    add      x8, x8, #0x878
    ldar     w8, [x8]
    str      w8, [sp, #0x2c]
    mov      w22, #0xe7cd
    movk     w22, #0xb0d0, lsl #16
    str      w22, [sp, #0x14]
    add      x8, sp, #0x14
    mov      w26, #0x7649
    movk     w26, #0xcf02, lsl #16
    stp      x2, x8, [sp]
    mov      w27, #0xe7cc
    movk     w27, #0xb0d0, lsl #16
    adrp     x20, #0x545000
    add      x20, x20, #0xe38
    adrp     x25, #0x545000
    add      x25, x25, #0xe42
    adrp     x24, #0x545000
    add      x24, x24, #0xe20
    adrp     x23, #0x545000
    add      x23, x23, #0xe2c
    mov      w28, #0xd804
    movk     w28, #0x2d77, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w26
    b.gt     #0x3024f8
    cmp      w8, w27
    b.gt     #0x30255c
    mov      w9, #0x6921
    movk     w9, #0x83a2, lsl #16
    cmp      w8, w9
    b.eq     #0x3025fc
    mov      w9, #0x6a4b
    movk     w9, #0x8e65, lsl #16
    cmp      w8, w9
    b.ne     #0x302420
    ldrh     w8, [x20]
    mov      w9, #0xb8f7
    eor      w8, w8, w9
    strh     w8, [x25]
    ldrh     w8, [x20, #2]
    mov      w9, #0x7e19
    eor      w8, w8, w9
    strh     w8, [x25, #2]
    ldrh     w8, [x20, #4]
    mov      w9, #0x6b0d
    eor      w8, w8, w9
    strh     w8, [x25, #4]
    ldrh     w8, [x20, #6]
    mov      w9, #0x4fd1
    eor      w8, w8, w9
    strh     w8, [x25, #6]
    ldrh     w8, [x20, #8]
    mov      w9, #0xfd1d
    eor      w8, w8, w9
    strh     w8, [x25, #8]
    ldrh     w8, [x24]
    mov      w9, #0x7890
    eor      w8, w8, w9
    strh     w8, [x23]
    ldrh     w8, [x24, #2]
    mov      w9, #0x57ad
    eor      w8, w8, w9
    strh     w8, [x23, #2]
    ldrh     w8, [x24, #4]
    mov      w9, #0x151
    eor      w8, w8, w9
    strh     w8, [x23, #4]
    ldrh     w8, [x24, #6]
    mov      w9, #0xd808
    eor      w8, w8, w9
    strh     w8, [x23, #6]
    ldr      x8, [sp, #8]
    mov      w9, #0x7000
    movk     w9, #0x1f01, lsl #16
    str      w9, [x8]
    b        #0x302420
    cmp      w8, w28
    b.le     #0x302594
    mov      w9, #0xd805
    movk     w9, #0x2d77, lsl #16
    cmp      w8, w9
    b.eq     #0x3025dc
    cmp      w8, w21
    b.ne     #0x302420
    adrp     x8, #0x580000
    add      x8, x8, #0x878
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xd08]
    ldr      x0, [sp]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    mov      w8, #3
    csinc    x8, x8, xzr, eq
    str      x8, [sp, #0x20]
    ldr      x8, [sp, #8]
    mov      w9, #0x6921
    movk     w9, #0x83a2, lsl #16
    str      w9, [x8]
    b        #0x302420
    cmp      w8, w22
    b.eq     #0x3026bc
    mov      w9, #0xda14
    movk     w9, #0xb151, lsl #16
    cmp      w8, w9
    b.ne     #0x302420
    ldrh     w8, [sp, #0x28]
    mov      w9, #0x1bc5
    eor      w8, w8, w9
    adrp     x9, #0x545000
    strh     w8, [x9, #0xe36]
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x302420
    mov      w9, #0x7000
    movk     w9, #0x1f01, lsl #16
    cmp      w8, w9
    b.ne     #0x3026e0
    adrp     x10, #0x545000
    add      x10, x10, #0xe28
    ldrh     w8, [x10]
    mov      w9, #0x27b9
    eor      w8, w8, w9
    adrp     x9, #0x545000
    strh     w8, [x9, #0xe34]
    ldrh     w8, [x10, #2]
    strh     w8, [sp, #0x28]
    ldr      x8, [sp, #8]
    mov      w9, #0xda14
    movk     w9, #0xb151, lsl #16
    str      w9, [x8]
    b        #0x302420
    ldrb     w8, [sp, #0x2b]
    cmp      w8, #0
    mov      w8, #0x6a4b
    movk     w8, #0x8e65, lsl #16
    csel     w8, w8, w21, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x302420
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x920]
    ldr      x2, [sp, #0x20]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x938]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #3
    adrp     x8, #0x545000
    add      x8, x8, #0xe70
    adrp     x9, #0x545000
    add      x9, x9, #0xeb0
    csel     x21, x9, x8, eq
    adrp     x8, #0x4c1000
    add      x8, x8, #0x940
    adrp     x9, #0x4c1000
    add      x9, x9, #0x928
    csel     x8, x8, x9, eq
    ldr      x1, [x8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x5a0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x8f8]
    mov      x2, x21
    mov      w21, #0xa4f1
    movk     w21, #0x7f63, lsl #16
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    mov      w22, #0xe7cd
    movk     w22, #0xb0d0, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x910]
    str      x8, [sp, #0x18]
    ldr      x8, [sp, #8]
    mov      w9, #0x764a
    movk     w9, #0xcf02, lsl #16
    str      w9, [x8]
    b        #0x302420
    ldr      w8, [sp, #0x2c]
    cmp      w8, #0
    cset     w8, eq
    strb     w8, [sp, #0x2b]
    ldr      x8, [sp, #8]
    mov      w9, #0xd805
    movk     w9, #0x2d77, lsl #16
    str      w9, [x8]
    b        #0x302420
    mov      w9, #0x764a
    movk     w9, #0xcf02, lsl #16
    cmp      w8, w9
    b.ne     #0x302420
    ldr      x1, [sp, #0x18]
    mov      x0, x19
    ldp      x29, x30, [sp, #0x80]
    ldp      x20, x19, [sp, #0x70]
    ldp      x22, x21, [sp, #0x60]
    ldp      x24, x23, [sp, #0x50]
    ldp      x26, x25, [sp, #0x40]
    ldp      x28, x27, [sp, #0x30]
    add      sp, sp, #0x90
    b        #0x461c6c // _objc_msgSend

// -[WCLGGroupMemberPicker buildSessionRows] IMP=0x302718 bounds=0x302718-0x3035D0
loc_302718:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x1e0
    mov      x19, sp
    mov      x21, x0
    mov      w25, #0xb283
    movk     w25, #0xee73, lsl #16
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x60]
    adrp     x8, #0x580000
    add      x8, x8, #0x87c
    ldar     w8, [x8]
    stur     w8, [x29, #-0x64]
    mov      w8, #0xe4ca
    movk     w8, #0xa34e, lsl #16
    str      w8, [x19, #0xc]
    add      x8, x19, #0xc
    str      x8, [x19]
    mov      w24, #0x1491
    movk     w24, #0xf1, lsl #16
    mov      w27, #0xffb1
    movk     w27, #0xbf8b, lsl #16
    mov      w28, #0x5a36
    movk     w28, #0x9dd2, lsl #16
    mov      w26, #0xde5e
    movk     w26, #0xe845, lsl #16
    mov      w22, #0xa712
    movk     w22, #0x5059, lsl #16
    mov      w23, #0x51f2
    movk     w23, #0x36ca, lsl #16
    mov      w20, #0x650
    movk     w20, #0x6106, lsl #16
    ldr      w8, [x19, #0xc]
    cmp      w8, w24
    b.le     #0x302830
    cmp      w8, w22
    b.gt     #0x3028a8
    cmp      w8, w23
    b.le     #0x302994
    mov      w9, #0xf273
    movk     w9, #0x4eda, lsl #16
    cmp      w8, w9
    b.le     #0x302bd4
    mov      w9, #0x4d13
    movk     w9, #0x4f6e, lsl #16
    cmp      w8, w9
    b.gt     #0x302e38
    mov      w9, #0xf274
    movk     w9, #0x4eda, lsl #16
    cmp      w8, w9
    b.eq     #0x302fa4
    mov      w9, #0xd2ae
    movk     w9, #0x4f2b, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldur     x8, [x29, #-0x80]
    ldr      x9, [x8, #0x10]!
    stp      x9, x8, [x19, #0xe0]
    ldr      x8, [x19]
    mov      w9, #0x5140
    movk     w9, #0xb502, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    cmp      w8, w27
    b.gt     #0x302928
    cmp      w8, w28
    b.le     #0x302a50
    mov      w9, #0xbc8
    movk     w9, #0xadf5, lsl #16
    cmp      w8, w9
    b.le     #0x302c70
    mov      w9, #0x777d
    movk     w9, #0xbb2a, lsl #16
    cmp      w8, w9
    b.gt     #0x302e80
    mov      w9, #0xbc9
    movk     w9, #0xadf5, lsl #16
    cmp      w8, w9
    b.eq     #0x303010
    mov      w9, #0x5140
    movk     w9, #0xb502, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldr      x8, [x19, #0xe0]
    ldr      x9, [x8]
    ldur     x8, [x29, #-0x80]
    add      x8, x8, #8
    stp      x8, x9, [x19, #0xd0]
    ldr      x8, [x19]
    mov      w9, #0xb8bd
    movk     w9, #0xbe5f, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    cmp      w8, w20
    b.le     #0x3029f0
    mov      w9, #0xf27f
    movk     w9, #0x7448, lsl #16
    cmp      w8, w9
    b.le     #0x302b84
    mov      w9, #0x6595
    movk     w9, #0x7acf, lsl #16
    cmp      w8, w9
    b.gt     #0x302de8
    mov      w9, #0xf280
    movk     w9, #0x7448, lsl #16
    cmp      w8, w9
    b.eq     #0x302f64
    mov      w9, #0x450
    movk     w9, #0x753c, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldr      x8, [x19, #0x98]
    ldr      x9, [x19, #0x10]
    ldr      x0, [x8, x9, lsl #3]
    str      x0, [x19, #0x90]
    ldr      x1, [x19, #0xb8]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    cset     w8, eq
    strb     w8, [x19, #0x8f]
    ldr      x8, [x19]
    mov      w9, #0xc541
    movk     w9, #0x1b89, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    cmp      w8, w26
    b.le     #0x302ab8
    mov      w9, #0x4770
    movk     w9, #0xf299, lsl #16
    cmp      w8, w9
    b.le     #0x302cd8
    mov      w9, #0x1ad
    movk     w9, #0xf75d, lsl #16
    cmp      w8, w9
    b.gt     #0x302ed0
    mov      w9, #0x4771
    movk     w9, #0xf299, lsl #16
    cmp      w8, w9
    b.eq     #0x303024
    mov      w9, #0xdb93
    movk     w9, #0xf354, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldr      x8, [x19, #0x100]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [x19, #0xff]
    ldr      x8, [x19]
    mov      w9, #0xfeef
    movk     w9, #0x7c80, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    mov      w9, #0xc540
    movk     w9, #0x1b89, lsl #16
    cmp      w8, w9
    b.le     #0x302b2c
    mov      w9, #0x3de6
    movk     w9, #0x2c1e, lsl #16
    cmp      w8, w9
    b.gt     #0x302f10
    mov      w9, #0xc541
    movk     w9, #0x1b89, lsl #16
    cmp      w8, w9
    b.eq     #0x302f48
    mov      w9, #0xe3bc
    movk     w9, #0x2068, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldur     x0, [x29, #-0xc8]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x19]
    mov      w9, #0xe008
    movk     w9, #0xe83f, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    mov      w9, #0x5291
    movk     w9, #0x5562, lsl #16
    cmp      w8, w9
    b.gt     #0x302c2c
    mov      w9, #0xa713
    movk     w9, #0x5059, lsl #16
    cmp      w8, w9
    b.eq     #0x3031c8
    mov      w9, #0xf128
    movk     w9, #0x50e8, lsl #16
    cmp      w8, w9
    b.eq     #0x3033fc
    mov      w9, #0x5f1a
    movk     w9, #0x51f8, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldr      x8, [x19, #0x20]
    add      x8, x8, #1
    str      x8, [x19, #0x110]
    ldr      x8, [x19]
    mov      w9, #0xf6d1
    movk     w9, #0x1b82, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    mov      w9, #0x611
    movk     w9, #0x91c9, lsl #16
    cmp      w8, w9
    b.gt     #0x302d30
    mov      w9, #0x69ac
    movk     w9, #0x8957, lsl #16
    cmp      w8, w9
    b.eq     #0x3032d8
    mov      w9, #0xf7db
    movk     w9, #0x8d60, lsl #16
    cmp      w8, w9
    b.eq     #0x30347c
    mov      w9, #0xa14f
    movk     w9, #0x8ec3, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldp      x3, x2, [x29, #-0x78]
    ldp      x1, x0, [x29, #-0xd0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x100]
    ldr      x8, [x19]
    mov      w9, #0xdb93
    movk     w9, #0xf354, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    mov      w9, #0x395a
    movk     w9, #0xdf5d, lsl #16
    cmp      w8, w9
    b.gt     #0x302da4
    mov      w9, #0xffb2
    movk     w9, #0xbf8b, lsl #16
    cmp      w8, w9
    b.eq     #0x303324
    mov      w9, #0x81c6
    movk     w9, #0xc15b, lsl #16
    cmp      w8, w9
    b.eq     #0x3034ac
    mov      w9, #0xea48
    movk     w9, #0xc444, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldur     x0, [x29, #-0xa8]
    ldr      x1, [x19, #0xa8]
    ldr      x2, [x19, #0x78]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, #0x78]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x80]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19]
    mov      w9, #0x19b7
    movk     w9, #0xa96, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    mov      w9, #0x1492
    movk     w9, #0xf1, lsl #16
    cmp      w8, w9
    b.eq     #0x30314c
    mov      w9, #0x19b7
    movk     w9, #0xa96, lsl #16
    cmp      w8, w9
    b.eq     #0x303214
    mov      w9, #0xf6d1
    movk     w9, #0x1b82, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldr      x8, [x19, #0x110]
    ldr      x9, [x19, #0x28]
    cmp      x8, x9
    cset     w8, eq
    strb     w8, [x19, #0x10f]
    ldr      x8, [x19]
    mov      w9, #0x651
    movk     w9, #0x6106, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    mov      w9, #0x651
    movk     w9, #0x6106, lsl #16
    cmp      w8, w9
    b.eq     #0x30316c
    mov      w9, #0xa3f9
    movk     w9, #0x646f, lsl #16
    cmp      w8, w9
    b.eq     #0x30329c
    mov      w9, #0xfef6
    movk     w9, #0x709f, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldurb    w8, [x29, #-0x65]
    cmp      w8, #0
    mov      w8, #0xffb2
    movk     w8, #0xbf8b, lsl #16
    mov      w9, #0x3a5e
    movk     w9, #0x565a, lsl #16
    csel     w8, w9, w8, ne
    b        #0x3033f0
    mov      w9, #0x51f3
    movk     w9, #0x36ca, lsl #16
    cmp      w8, w9
    b.eq     #0x30319c
    mov      w9, #0x3b9b
    movk     w9, #0x38a8, lsl #16
    cmp      w8, w9
    b.eq     #0x3032b8
    mov      w9, #0xc8b3
    movk     w9, #0x3d0b, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldur     x0, [x29, #-0xb0]
    ldr      x1, [x19, #0xb0]
    ldr      x2, [x19, #0x90]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [x19, #0x8e]
    ldr      x8, [x19]
    mov      w9, #0x1492
    movk     w9, #0xf1, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    mov      w9, #0x5292
    movk     w9, #0x5562, lsl #16
    cmp      w8, w9
    b.eq     #0x3031f4
    mov      w9, #0x3a5e
    movk     w9, #0x565a, lsl #16
    cmp      w8, w9
    b.eq     #0x30341c
    mov      w9, #0x9ef9
    movk     w9, #0x5f19, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldr      x8, [x19]
    mov      w9, #0x5f1a
    movk     w9, #0x51f8, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    mov      w9, #0x5a37
    movk     w9, #0x9dd2, lsl #16
    cmp      w8, w9
    b.eq     #0x303234
    mov      w9, #0xe4ca
    movk     w9, #0xa34e, lsl #16
    cmp      w8, w9
    b.eq     #0x30343c
    mov      w9, #0x3af0
    movk     w9, #0xad95, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldr      x8, [x19, #0x48]
    str      x8, [x19, #0x28]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xa08]
    stur     x8, [x29, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x830]
    str      x8, [x19, #0x128]
    ldr      x8, [x19]
    mov      w9, #0x395b
    movk     w9, #0xdf5d, lsl #16
    str      w9, [x8]
    str      xzr, [x19, #0x40]
    b        #0x3027b4
    mov      w9, #0xde5f
    movk     w9, #0xe845, lsl #16
    cmp      w8, w9
    b.eq     #0x303264
    mov      w9, #0x7e46
    movk     w9, #0xe92f, lsl #16
    cmp      w8, w9
    b.eq     #0x303460
    cmp      w8, w25
    b.ne     #0x3027b4
    ldr      x8, [x19, #0x30]
    str      x8, [x19, #0x10]
    ldr      x8, [x19, #0xe8]
    ldr      x8, [x8]
    ldr      x8, [x8]
    ldr      x9, [x19, #0xd8]
    cmp      x8, x9
    mov      w8, #0xf128
    movk     w8, #0x50e8, lsl #16
    mov      w9, #0xa3f9
    movk     w9, #0x646f, lsl #16
    b        #0x3033ec
    mov      w9, #0x612
    movk     w9, #0x91c9, lsl #16
    cmp      w8, w9
    b.eq     #0x30339c
    mov      w9, #0x3681
    movk     w9, #0x93c6, lsl #16
    cmp      w8, w9
    b.eq     #0x303504
    mov      w9, #0xc807
    movk     w9, #0x96f8, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldr      x8, [x19, #0xc0]
    ldr      x9, [x19, #0x80]
    str      x9, [x8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    ldp      x3, x2, [x29, #-0x98]
    ldr      x1, [x19, #0xa0]
    mov      w4, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x78]
    ldr      x8, [x19]
    mov      w9, #0xea48
    movk     w9, #0xc444, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    mov      w9, #0x395b
    movk     w9, #0xdf5d, lsl #16
    cmp      w8, w9
    b.eq     #0x3033c0
    mov      w9, #0x627
    movk     w9, #0xe0de, lsl #16
    cmp      w8, w9
    b.eq     #0x30352c
    mov      w9, #0xe008
    movk     w9, #0xe83f, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldr      x8, [x19]
    mov      w9, #0x4d14
    movk     w9, #0x4f6e, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    mov      w9, #0x6596
    movk     w9, #0x7acf, lsl #16
    cmp      w8, w9
    b.eq     #0x302f88
    mov      w9, #0xfeef
    movk     w9, #0x7c80, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldrb     w8, [x19, #0xff]
    cmp      w8, #0
    mov      w8, #0x7e46
    movk     w8, #0xe92f, lsl #16
    mov      w9, #0x3af0
    movk     w9, #0xad95, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [x19]
    str      w8, [x9]
    ldr      x8, [x19, #0x100]
    str      x8, [x19, #0x48]
    b        #0x3027b4
    mov      w9, #0x4d14
    movk     w9, #0x4f6e, lsl #16
    cmp      w8, w9
    b.eq     #0x302fe8
    mov      w9, #0x8369
    movk     w9, #0x501d, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldur     x0, [x29, #-0xc0]
    ldur     x1, [x29, #-0x100]
    ldr      x2, [x19, #0x118]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #0x5f1a
    movk     w8, #0x51f8, lsl #16
    mov      w9, #0x612
    movk     w9, #0x91c9, lsl #16
    b        #0x303164
    mov      w9, #0x777e
    movk     w9, #0xbb2a, lsl #16
    cmp      w8, w9
    b.eq     #0x303054
    mov      w9, #0xb8bd
    movk     w9, #0xbe5f, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldur     x8, [x29, #-0x98]
    add      x9, x8, #8
    ldur     x8, [x29, #-0x90]
    add      x8, x8, #8
    stp      x8, x9, [x19, #0xc0]
    ldr      x8, [x19]
    mov      w9, #0x627
    movk     w9, #0xe0de, lsl #16
    str      w9, [x8]
    ldr      x8, [x19, #0xf0]
    str      x8, [x19, #0x38]
    b        #0x3027b4
    mov      w9, #0x1ae
    movk     w9, #0xf75d, lsl #16
    cmp      w8, w9
    b.eq     #0x3030b0
    mov      w9, #0x7d2d
    movk     w9, #0xfc99, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldr      x8, [x19, #0x120]
    ldr      x8, [x8]
    str      x8, [x19, #0x118]
    ldr      x8, [x19]
    mov      w9, #0x8369
    movk     w9, #0x501d, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    mov      w9, #0x3404
    movk     w9, #0x350a, lsl #16
    cmp      w8, w9
    b.ne     #0x30356c
    ldrb     w8, [x19, #0x6f]
    cmp      w8, #0
    mov      w8, #0x51f3
    movk     w8, #0x36ca, lsl #16
    csel     w8, w8, w25, ne
    ldr      x9, [x19]
    str      w8, [x9]
    ldr      x8, [x19, #0x70]
    str      x8, [x19, #0x30]
    b        #0x3027b4
    ldrb     w8, [x19, #0x8f]
    cmp      w8, #0
    mov      w8, #0x19b7
    movk     w8, #0xa96, lsl #16
    mov      w9, #0xc8b3
    movk     w9, #0x3d0b, lsl #16
    b        #0x303164
    ldr      x8, [x19, #0x60]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [x19, #0x5f]
    ldr      x8, [x19]
    mov      w9, #0xf7db
    movk     w9, #0x8d60, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldr      x0, [x19, #0x50]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19]
    mov      w9, #0x3de7
    movk     w9, #0x2c1e, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldur     x0, [x29, #-0xc0]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    ldur     x0, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    str      x0, [x19, #0x50]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x958]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19]
    mov      w9, #0x6596
    movk     w9, #0x7acf, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldur     x8, [x29, #-0xf8]
    ldr      x8, [x8]
    ldr      x9, [x19, #0x20]
    add      x8, x8, x9, lsl #3
    str      x8, [x19, #0x120]
    ldr      x8, [x19]
    mov      w9, #0x7d2d
    movk     w9, #0xfc99, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldr      x8, [x19]
    mov      w9, #0xf128
    movk     w9, #0x50e8, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldur     x8, [x29, #-0xe8]
    ldr      x9, [x8]
    ldur     x8, [x29, #-0x70]
    add      x8, x8, #8
    stp      x8, x9, [x29, #-0xf8]
    ldr      x8, [x19]
    mov      w9, #0x3af0
    movk     w9, #0xad95, lsl #16
    str      w9, [x8]
    ldur     x8, [x29, #-0xd8]
    str      x8, [x19, #0x48]
    b        #0x3027b4
    ldur     x0, [x29, #-0xb0]
    ldr      x1, [x19, #0xa8]
    ldr      x2, [x19, #0x90]
    bl       #0x461c6c // _objc_msgSend
    ldp      x10, x8, [x29, #-0x98]
    adrp     x9, #0x545000
    add      x9, x9, #0xf40
    str      x9, [x10]
    ldr      x0, [x19, #0x90]
    str      x0, [x8]
    ldr      x8, [x19, #0xc8]
    adrp     x9, #0x545000
    add      x9, x9, #0xf00
    str      x9, [x8]
    bl       #0x3035d0
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x80]
    ldr      x8, [x19]
    mov      w9, #0xc807
    movk     w9, #0x96f8, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldur     x1, [x29, #-0xb8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x21
    mov      x21, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x360]
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xc0]
    mov      x0, x21
    mov      x21, x25
    mov      w25, #0xb283
    movk     w25, #0xee73, lsl #16
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x70]
    movi     v0.16b, #0
    stp      q0, q0, [x8]
    stp      q0, q0, [x8, #0x20]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x950]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stp      x1, x0, [x29, #-0xd0]
    ldp      x3, x2, [x29, #-0x78]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xd8]
    cmp      x0, #0
    mov      w8, #0x7e46
    movk     w8, #0xe92f, lsl #16
    mov      w9, #0x5292
    movk     w9, #0x5562, lsl #16
    b        #0x3033ec
    ldrb     w8, [x19, #0x8e]
    cmp      w8, #0
    mov      w8, #0x19b7
    movk     w8, #0xa96, lsl #16
    mov      w9, #0x777e
    movk     w9, #0xbb2a, lsl #16
    csel     w8, w8, w9, ne
    b        #0x3033f0
    ldrb     w8, [x19, #0x10f]
    cmp      w8, #0
    mov      w8, #0x395b
    movk     w8, #0xdf5d, lsl #16
    mov      w9, #0xa14f
    movk     w9, #0x8ec3, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [x19]
    str      w8, [x9]
    ldr      x8, [x19, #0x110]
    str      x8, [x19, #0x40]
    b        #0x3027b4
    ldp      x3, x2, [x29, #-0x88]
    ldur     x0, [x29, #-0xc0]
    ldur     x1, [x29, #-0xd0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x60]
    ldr      x8, [x19]
    mov      w9, #0xf280
    movk     w9, #0x7448, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldur     x8, [x29, #-0x80]
    movi     v0.16b, #0
    stp      q0, q0, [x8]
    stp      q0, q0, [x8, #0x20]
    ldur     x0, [x29, #-0xc0]
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [x19]
    mov      w9, #0x5a37
    movk     w9, #0x9dd2, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldur     x8, [x29, #-0x70]
    add      x8, x8, #0x10
    stur     x8, [x29, #-0xe0]
    ldr      x8, [x19]
    mov      w9, #0x3b9b
    movk     w9, #0x38a8, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldr      x8, [x19, #0x10]
    add      x8, x8, #1
    str      x8, [x19, #0x70]
    ldr      x8, [x19]
    mov      w9, #0x3681
    movk     w9, #0x93c6, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldp      x3, x2, [x29, #-0x88]
    ldur     x0, [x29, #-0xc0]
    ldur     x1, [x29, #-0xd0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0xf0]
    cmp      x0, #0
    mov      w8, #0xf274
    movk     w8, #0x4eda, lsl #16
    mov      w9, #0xd2ae
    movk     w9, #0x4f2b, lsl #16
    b        #0x3033ec
    ldurb    w8, [x29, #-0x67]
    adrp     x10, #0x545000
    add      x10, x10, #0xed2
    strb     w8, [x10]
    adrp     x8, #0x545000
    ldrb     w8, [x8, #0xed1]
    mov      w9, #5
    eor      w8, w8, w9
    strb     w8, [x10, #1]
    ldr      x8, [x19]
    mov      w9, #0xffb2
    movk     w9, #0xbf8b, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldur     x0, [x29, #-0xc0]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x19]
    mov      w9, #0xbc9
    movk     w9, #0xadf5, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldur     x8, [x29, #-0xe0]
    ldr      x8, [x8]
    stur     x8, [x29, #-0xe8]
    ldr      x8, [x19]
    mov      w9, #0x4771
    movk     w9, #0xf299, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldurb    w8, [x29, #-0x66]
    mov      w9, #5
    eor      w8, w8, w9
    adrp     x9, #0x545000
    add      x9, x9, #0xed6
    strb     w8, [x9]
    adrp     x8, #0x545000
    ldrb     w8, [x8, #0xed5]
    eor      w8, w8, #0xffffffc1
    strb     w8, [x9, #1]
    adrp     x8, #0x545000
    ldrb     w8, [x8, #0xed0]
    eor      w8, w8, #0x7f
    sturb    w8, [x29, #-0x67]
    ldr      x8, [x19]
    mov      w9, #0xde5f
    movk     w9, #0xe845, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    adrp     x8, #0x580000
    add      x8, x8, #0x87c
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x40
    mov      sp, x8
    stur     x8, [x29, #-0x70]
    sub      x8, sp, #0x80
    mov      sp, x8
    stur     x8, [x29, #-0x78]
    sub      x8, sp, #0x40
    mov      sp, x8
    stur     x8, [x29, #-0x80]
    sub      x8, sp, #0x80
    mov      sp, x8
    stur     x8, [x29, #-0x88]
    sub      x8, sp, #0x10
    mov      sp, x8
    stur     x8, [x29, #-0x90]
    sub      x8, sp, #0x10
    mov      sp, x8
    stur     x8, [x29, #-0x98]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x110]
    stur     x8, [x29, #-0xa0]
    ldr      x8, [x19]
    mov      w9, #0x81c6
    movk     w9, #0xc15b, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldur     x0, [x29, #-0xc0]
    ldr      x1, [x19, #0x128]
    ldr      x2, [x19, #0x118]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19]
    mov      w9, #0x9ef9
    movk     w9, #0x5f19, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldr      x8, [x19, #0x40]
    str      x8, [x19, #0x20]
    ldur     x8, [x29, #-0xe0]
    ldr      x8, [x8]
    ldr      x8, [x8]
    ldur     x9, [x29, #-0xf0]
    cmp      x8, x9
    mov      w8, #0x4d14
    movk     w8, #0x4f6e, lsl #16
    mov      w9, #0xe3bc
    movk     w9, #0x2068, lsl #16
    csel     w8, w8, w9, eq
    ldr      x9, [x19]
    str      w8, [x9]
    b        #0x3027b4
    ldr      x8, [x19, #0xd0]
    ldr      x8, [x8]
    str      x8, [x19, #0x98]
    ldr      x8, [x19]
    mov      w9, #0x450
    movk     w9, #0x753c, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    adrp     x8, #0x545000
    ldrb     w8, [x8, #0xed4]
    sturb    w8, [x29, #-0x66]
    ldr      x8, [x19]
    mov      w9, #0x69ac
    movk     w9, #0x8957, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldur     w8, [x29, #-0x64]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x65]
    ldr      x8, [x19]
    mov      w9, #0xfef6
    movk     w9, #0x709f, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldur     x0, [x29, #-0xc8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19]
    mov      w9, #0xa713
    movk     w9, #0x5059, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldrb     w8, [x19, #0x5f]
    cmp      w8, #0
    mov      w8, #0x627
    movk     w8, #0xe0de, lsl #16
    mov      w9, #0xf274
    movk     w9, #0x4eda, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [x19]
    str      w8, [x9]
    ldr      x8, [x19, #0x60]
    str      x8, [x19, #0x38]
    b        #0x3027b4
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xa8]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x170]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x948]
    stp      x8, x0, [x29, #-0xb8]
    ldr      x8, [x19]
    mov      w9, #0x1ae
    movk     w9, #0xf75d, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldr      x8, [x19, #0x70]
    ldr      x9, [x19, #0x18]
    cmp      x8, x9
    cset     w8, eq
    strb     w8, [x19, #0x6f]
    ldr      x8, [x19]
    mov      w9, #0x3404
    movk     w9, #0x350a, lsl #16
    str      w9, [x8]
    b        #0x3027b4
    ldr      x8, [x19, #0x38]
    str      x8, [x19, #0x18]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x338]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xa08]
    stp      x8, x9, [x19, #0xb0]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x830]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0x108]
    stp      x8, x9, [x19, #0xa0]
    ldr      x8, [x19]
    str      w25, [x8]
    str      xzr, [x19, #0x30]
    b        #0x3027b4
    mov      w9, #0x3de7
    movk     w9, #0x2c1e, lsl #16
    cmp      w8, w9
    b.ne     #0x3027b4
    ldur     x0, [x29, #-0xc0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xa8]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x3035cc
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGGroupMemberPicker ensureContactsLoaded] IMP=0x3036AC bounds=0x3036AC-0x303D7C
loc_3036AC:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x60
    mov      x21, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x580000
    add      x8, x8, #0x884
    ldar     w9, [x8]
    cbnz     w9, #0x30387c
    adrp     x9, #0x545000
    add      x9, x9, #0xf68
    ldrh     w10, [x9]
    eor      w10, w10, #0xffffc003
    adrp     x11, #0x545000
    add      x11, x11, #0xf76
    strh     w10, [x11]
    ldrh     w10, [x9, #2]
    mov      w12, #0x3f29
    eor      w10, w10, w12
    strh     w10, [x11, #2]
    ldrh     w10, [x9, #4]
    mov      w12, #0x5710
    eor      w10, w10, w12
    strh     w10, [x11, #4]
    ldrh     w10, [x9, #6]
    mov      w12, #0xe3b8
    eor      w10, w10, w12
    strh     w10, [x11, #6]
    ldrh     w10, [x9, #8]
    mov      w12, #0x15eb
    eor      w10, w10, w12
    strh     w10, [x11, #8]
    ldrh     w10, [x9, #0xa]
    mov      w12, #0x8e09
    eor      w10, w10, w12
    strh     w10, [x11, #0xa]
    ldrh     w9, [x9, #0xc]
    mov      w10, #0xf9af
    eor      w9, w9, w10
    strh     w9, [x11, #0xc]
    adrp     x9, #0x545000
    add      x9, x9, #0xf84
    ldrb     w10, [x9]
    mov      w11, #0xd6
    eor      w10, w10, w11
    adrp     x11, #0x545000
    add      x11, x11, #0xf8f
    strb     w10, [x11]
    ldrb     w10, [x9, #1]
    eor      w10, w10, #0xffffffe7
    strb     w10, [x11, #1]
    ldrb     w10, [x9, #2]
    eor      w10, w10, #0x11111111
    strb     w10, [x11, #2]
    ldrb     w10, [x9, #3]
    mov      w12, #0x68
    eor      w10, w10, w12
    strb     w10, [x11, #3]
    ldrb     w10, [x9, #4]
    mov      w12, #0x5b
    eor      w10, w10, w12
    strb     w10, [x11, #4]
    ldrb     w10, [x9, #5]
    mov      w12, #0x75
    eor      w10, w10, w12
    strb     w10, [x11, #5]
    ldrb     w10, [x9, #6]
    mov      w13, #0xea
    eor      w10, w10, w13
    strb     w10, [x11, #6]
    ldrb     w10, [x9, #7]
    mov      w13, #0xda
    eor      w10, w10, w13
    strb     w10, [x11, #7]
    ldrb     w10, [x9, #8]
    eor      w10, w10, w12
    strb     w10, [x11, #8]
    ldrb     w10, [x9, #9]
    mov      w12, #0xbe
    eor      w10, w10, w12
    strb     w10, [x11, #9]
    ldrb     w9, [x9, #0xa]
    mov      w10, #0x76
    eor      w9, w9, w10
    strb     w9, [x11, #0xa]
    adrp     x9, #0x545000
    add      x9, x9, #0xf64
    ldrb     w10, [x9]
    mov      w11, #0xcb
    eor      w10, w10, w11
    adrp     x11, #0x545000
    add      x11, x11, #0xf66
    strb     w10, [x11]
    ldrb     w9, [x9, #1]
    mov      w10, #0x19
    eor      w9, w9, w10
    strb     w9, [x11, #1]
    adrp     x9, #0x545000
    add      x9, x9, #0xf60
    ldrb     w10, [x9]
    mov      w11, #0x1a
    eor      w10, w10, w11
    adrp     x11, #0x545000
    add      x11, x11, #0xf62
    strb     w10, [x11]
    ldrb     w9, [x9, #1]
    eor      w9, w9, #0xffffff83
    strb     w9, [x11, #1]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x27, sp, #0x40
    mov      sp, x27
    sub      x19, sp, #0x80
    mov      sp, x19
    sub      x24, sp, #0x10
    mov      sp, x24
    sub      x28, sp, #0x10
    mov      sp, x28
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x960]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x303cc4
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x968]
    mov      x0, x21
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x8b8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x170]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x60]
    bl       #0x30da28
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    cbz      x0, #0x303c84
    stur     x19, [x29, #-0x68]
    adrp     x8, #0x4c1000
    ldr      x19, [x8, #0xa28]
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x3e0]
    mov      x0, x25
    mov      x1, x22
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x303990
    mov      x0, x25
    mov      x1, x19
    mov      w2, #1
    mov      w3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x20
    ldur     x2, [x29, #-0x60]
    bl       #0x30e000
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    mov      x0, x20
    stur     x1, [x29, #-0x70]
    bl       #0x461c6c // _objc_msgSend
    cbnz     x0, #0x303b08
    adrp     x8, #0x4c1000
    ldr      x19, [x8, #0xa30]
    mov      x0, x25
    mov      x1, x22
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x303b08
    stp      x22, x25, [x29, #-0x88]
    mov      x0, x25
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x410]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x418]
    mov      x0, x26
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x303af8
    stur     w23, [x29, #-0xa4]
    stp      x28, x24, [x29, #-0xa0]
    stur     x21, [x29, #-0x90]
    movi     v0.16b, #0
    stp      q0, q0, [x27, #0x20]
    stp      q0, q0, [x27]
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stur     x1, [x29, #-0x78]
    mov      x2, x27
    ldur     x3, [x29, #-0x68]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    cbz      x0, #0x303ae4
    ldr      x8, [x27, #0x10]
    ldr      x23, [x8]
    adrp     x28, #0x4c4000
    mov      x21, #0
    ldr      x8, [x27, #0x10]
    ldr      x8, [x8]
    cmp      x8, x23
    b.eq     #0x303a80
    mov      x0, x26
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x27, #8]
    ldr      x19, [x8, x21, lsl #3]
    ldr      x0, [x28, #0xb8]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x303ab8
    mov      x0, x19
    mov      x1, x20
    ldur     x2, [x29, #-0x60]
    bl       #0x30e808
    add      x21, x21, #1
    cmp      x24, x21
    b.ne     #0x303a68
    mov      x0, x26
    ldur     x1, [x29, #-0x78]
    mov      x2, x27
    ldur     x3, [x29, #-0x68]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    cbnz     x0, #0x303a64
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldp      x24, x21, [x29, #-0x98]
    ldur     x28, [x29, #-0xa0]
    ldur     w23, [x29, #-0xa4]
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldur     x25, [x29, #-0x80]
    ldur     x22, [x29, #-0x88]
    mov      x0, x20
    ldur     x1, [x29, #-0x70]
    bl       #0x461c6c // _objc_msgSend
    cbnz     x0, #0x303b60
    adrp     x8, #0x4c1000
    ldr      x19, [x8, #0xa38]
    mov      x0, x25
    mov      x1, x22
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x303b60
    mov      x0, x25
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x1, x20
    ldur     x2, [x29, #-0x60]
    bl       #0x30e000
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cbz      w23, #0x303c54
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xa08]
    adrp     x2, #0x546000
    add      x2, x2, #0x80
    ldur     x0, [x29, #-0x60]
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x303c54
    adrp     x23, #0x546000
    add      x23, x23, #0x80
    mov      x0, x23
    bl       #0x3035d0
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x303bc8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x358]
    adrp     x2, #0x546000
    add      x2, x2, #0x80
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x303bd8
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x22, #0x546000
    add      x22, x22, #0x40
    adrp     x8, #0x4be000
    ldr      x19, [x8, #0x830]
    ldur     x0, [x29, #-0x60]
    mov      x1, x19
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x545000
    add      x8, x8, #0xfc0
    adrp     x9, #0x546000
    add      x9, x9, #0
    stp      x8, x9, [x28]
    stp      x23, x22, [x24]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x108]
    mov      x2, x24
    mov      x3, x28
    mov      w4, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x20
    mov      x1, x19
    mov      x2, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xee0]
    adrp     x2, #0x4a4000
    add      x2, x2, #0x928
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    b        #0x303c90
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x19, x20
    mov      x0, x25
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x60]
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x970]
    mov      x0, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x303cfc
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail
    b        #0x303d54
    b        #0x303d08
    cmp      w1, #1
    b.ne     #0x303d78
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    cbnz     w23, #0x303b64
    b        #0x303c54
    stp      x22, x25, [x29, #-0x88]
    b        #0x303d28
    stur     w23, [x29, #-0xa4]
    stp      x28, x24, [x29, #-0xa0]
    stur     x21, [x29, #-0x90]
    b        #0x303d54
    b        #0x303d3c
    cmp      w1, #1
    b.ne     #0x303d78
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    b        #0x303990
    b        #0x303d54
    cmp      w1, #1
    b.ne     #0x303d78
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    ldp      x24, x21, [x29, #-0x98]
    ldur     x28, [x29, #-0xa0]
    ldur     x25, [x29, #-0x80]
    ldur     w23, [x29, #-0xa4]
    b        #0x303b04
    bl       #0x461894 // __Unwind_Resume

// -[WCLGGroupMemberPicker ensureLabelsLoaded] IMP=0x303D7C bounds=0x303D7C-0x30527C
loc_303D7C:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x140
    mov      x20, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x60]
    adrp     x8, #0x580000
    add      x8, x8, #0x888
    ldar     w9, [x8]
    cbnz     w9, #0x304310
    adrp     x10, #0x546000
    add      x10, x10, #0x10a
    ldrb     w11, [x10]
    mov      w9, #0x12
    eor      w11, w11, w9
    adrp     x12, #0x546000
    add      x12, x12, #0x113
    strb     w11, [x12]
    ldrb     w11, [x10, #1]
    mov      w13, #0xdb
    eor      w11, w11, w13
    strb     w11, [x12, #1]
    ldrb     w11, [x10, #2]
    eor      w11, w11, #0xc
    strb     w11, [x12, #2]
    ldrb     w11, [x10, #3]
    mov      w13, #0x1d
    eor      w11, w11, w13
    strb     w11, [x12, #3]
    ldrb     w11, [x10, #4]
    eor      w11, w11, #0xcccccccc
    strb     w11, [x12, #4]
    ldrb     w11, [x10, #5]
    eor      w11, w11, #0x70
    strb     w11, [x12, #5]
    ldrb     w11, [x10, #6]
    eor      w11, w11, #0xfffffff1
    strb     w11, [x12, #6]
    ldrb     w11, [x10, #7]
    eor      w11, w11, #0xdddddddd
    strb     w11, [x12, #7]
    ldrb     w10, [x10, #8]
    mov      w11, #0xa8
    eor      w10, w10, w11
    strb     w10, [x12, #8]
    adrp     x10, #0x546000
    add      x10, x10, #0x11c
    ldrh     w11, [x10]
    mov      w12, #0xb29d
    eor      w11, w11, w12
    adrp     x12, #0x546000
    add      x12, x12, #0x126
    strh     w11, [x12]
    ldrh     w11, [x10, #2]
    mov      w13, #0xee12
    eor      w11, w11, w13
    strh     w11, [x12, #2]
    ldrh     w11, [x10, #4]
    mov      w13, #0x1a07
    eor      w11, w11, w13
    strh     w11, [x12, #4]
    ldrh     w11, [x10, #6]
    mov      w13, #0xf7c0
    eor      w11, w11, w13
    strh     w11, [x12, #6]
    ldrh     w10, [x10, #8]
    mov      w11, #0x514a
    eor      w10, w10, w11
    strh     w10, [x12, #8]
    adrp     x11, #0x546000
    add      x11, x11, #0xea
    ldrb     w10, [x11]
    adrp     x12, #0x546000
    add      x12, x12, #0xfa
    eor      w10, w10, #0x30
    strb     w10, [x12]
    ldrb     w10, [x11, #1]
    mov      w13, #0x91
    eor      w10, w10, w13
    strb     w10, [x12, #1]
    ldrb     w10, [x11, #2]
    mov      w13, #0x76
    eor      w10, w10, w13
    strb     w10, [x12, #2]
    ldrb     w10, [x11, #3]
    mov      w13, #0x43
    eor      w10, w10, w13
    strb     w10, [x12, #3]
    ldrb     w10, [x11, #4]
    mov      w13, #0x4e
    eor      w10, w10, w13
    strb     w10, [x12, #4]
    ldrb     w13, [x11, #5]
    mov      w10, #0x94
    eor      w13, w13, w10
    strb     w13, [x12, #5]
    ldrb     w13, [x11, #6]
    mov      w14, #0xa4
    eor      w13, w13, w14
    strb     w13, [x12, #6]
    ldrb     w13, [x11, #7]
    mov      w14, #0xf2
    eor      w13, w13, w14
    strb     w13, [x12, #7]
    ldrb     w13, [x11, #8]
    mov      w14, #0x9a
    eor      w13, w13, w14
    strb     w13, [x12, #8]
    ldrb     w13, [x11, #9]
    mov      w14, #0x15
    eor      w13, w13, w14
    strb     w13, [x12, #9]
    ldrb     w13, [x11, #0xa]
    mov      w14, #0x7d
    eor      w13, w13, w14
    strb     w13, [x12, #0xa]
    ldrb     w13, [x11, #0xb]
    mov      w14, #0xa2
    eor      w13, w13, w14
    strb     w13, [x12, #0xb]
    ldrb     w13, [x11, #0xc]
    mov      w14, #0x4a
    eor      w13, w13, w14
    strb     w13, [x12, #0xc]
    ldrb     w13, [x11, #0xd]
    mov      w14, #0xfa
    eor      w13, w13, w14
    strb     w13, [x12, #0xd]
    ldrb     w13, [x11, #0xe]
    mov      w14, #0x6d
    eor      w13, w13, w14
    strb     w13, [x12, #0xe]
    ldrb     w11, [x11, #0xf]
    eor      w11, w11, #0x55555555
    strb     w11, [x12, #0xf]
    adrp     x12, #0x546000
    add      x12, x12, #0x130
    ldrb     w11, [x12]
    mov      w13, #0xd5
    eor      w13, w11, w13
    adrp     x11, #0x546000
    add      x11, x11, #0x140
    strb     w13, [x11]
    ldrb     w13, [x12, #1]
    mov      w14, #0xb6
    eor      w13, w13, w14
    strb     w13, [x11, #1]
    ldrb     w13, [x12, #2]
    mov      w14, #0x57
    eor      w13, w13, w14
    strb     w13, [x11, #2]
    ldrb     w13, [x12, #3]
    eor      w13, w13, #0x99999999
    strb     w13, [x11, #3]
    ldrb     w13, [x12, #4]
    eor      w9, w13, w9
    strb     w9, [x11, #4]
    ldrb     w9, [x12, #5]
    eor      w9, w9, #0xe
    strb     w9, [x11, #5]
    ldrb     w9, [x12, #6]
    mov      w13, #0x9b
    eor      w9, w9, w13
    strb     w9, [x11, #6]
    ldrb     w9, [x12, #7]
    mov      w13, #0x9e
    eor      w9, w9, w13
    strb     w9, [x11, #7]
    ldrb     w9, [x12, #8]
    mov      w13, #0x45
    eor      w9, w9, w13
    strb     w9, [x11, #8]
    ldrb     w9, [x12, #9]
    eor      w9, w9, #0x66666666
    strb     w9, [x11, #9]
    ldrb     w9, [x12, #0xa]
    mov      w13, #0x68
    eor      w9, w9, w13
    strb     w9, [x11, #0xa]
    ldrb     w9, [x12, #0xb]
    mov      w13, #0xa6
    eor      w9, w9, w13
    strb     w9, [x11, #0xb]
    ldrb     w9, [x12, #0xc]
    mov      w13, #0xb3
    eor      w9, w9, w13
    strb     w9, [x11, #0xc]
    ldrb     w9, [x12, #0xd]
    mov      w13, #0x8e
    eor      w9, w9, w13
    strb     w9, [x11, #0xd]
    ldrb     w13, [x12, #0xe]
    mov      w9, #0xdc
    eor      w13, w13, w9
    strb     w13, [x11, #0xe]
    ldrb     w12, [x12, #0xf]
    mov      w13, #0x62
    eor      w12, w12, w13
    adrp     x14, #0x546000
    add      x14, x14, #0xe4
    strb     w12, [x11, #0xf]
    ldrb     w11, [x14]
    eor      w11, w11, w13
    adrp     x12, #0x546000
    add      x12, x12, #0xe7
    strb     w11, [x12]
    ldrb     w11, [x14, #1]
    mvn      w11, w11
    strb     w11, [x12, #1]
    ldrb     w11, [x14, #2]
    eor      w11, w11, #0x55555555
    strb     w11, [x12, #2]
    adrp     x11, #0x546000
    add      x11, x11, #0xd6
    ldrb     w12, [x11]
    mov      w13, #0xcd
    adrp     x14, #0x546000
    add      x14, x14, #0xdd
    eor      w12, w12, w13
    strb     w12, [x14]
    ldrb     w12, [x11, #1]
    mov      w13, #0x92
    eor      w12, w12, w13
    strb     w12, [x14, #1]
    ldrb     w12, [x11, #2]
    eor      w10, w12, w10
    strb     w10, [x14, #2]
    ldrb     w10, [x11, #3]
    mov      w12, #0xd0
    eor      w10, w10, w12
    strb     w10, [x14, #3]
    ldrb     w10, [x11, #4]
    eor      w10, w10, #0xfffffffb
    strb     w10, [x14, #4]
    ldrb     w10, [x11, #5]
    mov      w12, #0xb1
    eor      w10, w10, w12
    strb     w10, [x14, #5]
    ldrb     w10, [x11, #6]
    mov      w11, #0x32
    eor      w10, w10, w11
    strb     w10, [x14, #6]
    adrp     x11, #0x546000
    add      x11, x11, #0xba
    ldrb     w12, [x11]
    mov      w10, #0x25
    adrp     x13, #0x546000
    add      x13, x13, #0xc8
    eor      w12, w12, w10
    strb     w12, [x13]
    ldrb     w12, [x11, #1]
    eor      w12, w12, #0xffffff83
    strb     w12, [x13, #1]
    ldrb     w12, [x11, #2]
    eor      w12, w12, #0xc0
    strb     w12, [x13, #2]
    ldrb     w12, [x11, #3]
    mov      w14, #0x2c
    eor      w12, w12, w14
    strb     w12, [x13, #3]
    ldrb     w12, [x11, #4]
    eor      w12, w12, #0x66666666
    strb     w12, [x13, #4]
    ldrb     w12, [x11, #5]
    mov      w15, #0x7b
    eor      w12, w12, w15
    strb     w12, [x13, #5]
    ldrb     w12, [x11, #6]
    mov      w15, #0x69
    eor      w12, w12, w15
    strb     w12, [x13, #6]
    ldrb     w12, [x11, #7]
    mov      w15, #0xde
    eor      w12, w12, w15
    strb     w12, [x13, #7]
    ldrb     w12, [x11, #8]
    eor      w12, w12, #0xffffffc3
    strb     w12, [x13, #8]
    ldrb     w12, [x11, #9]
    mov      w15, #0xe4
    eor      w12, w12, w15
    strb     w12, [x13, #9]
    ldrb     w12, [x11, #0xa]
    eor      w12, w12, #7
    strb     w12, [x13, #0xa]
    ldrb     w12, [x11, #0xb]
    mov      w15, #0xed
    eor      w12, w12, w15
    strb     w12, [x13, #0xb]
    ldrb     w12, [x11, #0xc]
    mov      w16, #0x56
    eor      w12, w12, w16
    strb     w12, [x13, #0xc]
    ldrb     w11, [x11, #0xd]
    mov      w12, #0x6c
    eor      w11, w11, w12
    strb     w11, [x13, #0xd]
    adrp     x11, #0x546000
    add      x11, x11, #0xb0
    ldrb     w12, [x11]
    adrp     x13, #0x546000
    add      x13, x13, #0xb5
    eor      w12, w12, #0xe
    strb     w12, [x13]
    ldrb     w12, [x11, #1]
    eor      w12, w12, w15
    strb     w12, [x13, #1]
    ldrb     w12, [x11, #2]
    eor      w12, w12, w14
    strb     w12, [x13, #2]
    ldrb     w12, [x11, #3]
    eor      w12, w12, #0x11111111
    strb     w12, [x13, #3]
    ldrb     w11, [x11, #4]
    eor      w10, w11, w10
    strb     w10, [x13, #4]
    adrp     x10, #0x546000
    add      x10, x10, #0xa0
    ldrb     w11, [x10]
    mov      w12, #0x8d
    eor      w11, w11, w12
    adrp     x12, #0x546000
    add      x12, x12, #0xa8
    strb     w11, [x12]
    ldrb     w11, [x10, #1]
    eor      w9, w11, w9
    strb     w9, [x12, #1]
    ldrb     w9, [x10, #2]
    eor      w9, w9, #0xffffffc7
    strb     w9, [x12, #2]
    ldrb     w9, [x10, #3]
    mov      w11, #0x89
    eor      w9, w9, w11
    strb     w9, [x12, #3]
    ldrb     w9, [x10, #4]
    mov      w11, #0x3b
    eor      w9, w9, w11
    strb     w9, [x12, #4]
    ldrb     w9, [x10, #5]
    mov      w11, #0x1a
    eor      w9, w9, w11
    strb     w9, [x12, #5]
    ldrb     w9, [x10, #6]
    mov      w11, #0x4b
    eor      w9, w9, w11
    strb     w9, [x12, #6]
    ldrb     w9, [x10, #7]
    mov      w10, #0xaf
    eor      w9, w9, w10
    strb     w9, [x12, #7]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x40
    stur     x8, [x29, #-0x70]
    mov      sp, x8
    sub      x8, sp, #0x80
    stur     x8, [x29, #-0x98]
    mov      sp, x8
    sub      x8, sp, #0x40
    stur     x8, [x29, #-0x78]
    mov      sp, x8
    sub      x27, sp, #0x80
    mov      sp, x27
    sub      x21, sp, #0x40
    mov      sp, x21
    sub      x8, sp, #0x80
    sub      x9, x29, #0x28
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    sub      x24, sp, #0x40
    mov      sp, x24
    sub      x8, sp, #0x80
    sub      x9, x29, #0x68
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    sub      x25, sp, #0x40
    mov      sp, x25
    sub      x8, sp, #0x80
    stur     x8, [x29, #-0x90]
    mov      sp, x8
    sub      x8, sp, #0x30
    sub      x9, x29, #0x70
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    sub      x8, sp, #0x40
    stur     x8, [x29, #-0xd8]
    mov      sp, x8
    sub      x8, sp, #0x80
    sub      x9, x29, #0x60
    stur     x8, [x9, #-0x100]
    mov      sp, x8
    sub      x8, sp, #0x10
    stur     x8, [x29, #-0xe0]
    mov      sp, x8
    sub      x8, sp, #0x10
    stur     x8, [x29, #-0xe8]
    mov      sp, x8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x978]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x30521c
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x980]
    mov      x0, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    stur     x1, [x29, #-0xc0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x0, #0x546000
    add      x0, x0, #0x370
    bl       #0x461780 // _NSClassFromString
    adrp     x8, #0x4bf000
    ldr      x2, [x8, #0x28]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x2f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x0, #0x546000
    add      x0, x0, #0x330
    bl       #0x461780 // _NSClassFromString
    mov      x3, x0
    adrp     x8, #0x4bf000
    ldr      x2, [x8, #0x580]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0x4a8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cbz      x23, #0x3051f0
    adrp     x8, #0x4c1000
    ldr      x19, [x8, #0xa48]
    adrp     x8, #0x4be000
    ldr      x26, [x8, #0x3e0]
    mov      x0, x23
    mov      x1, x26
    mov      x2, x19
    sub      x8, x29, #0x78
    stur     x23, [x8, #-0x100]
    sub      x8, x29, #0x18
    stur     x24, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3044d4
    mov      x0, x23
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    b        #0x3044d8
    mov      x24, #0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    stur     x1, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    mov      x0, x24
    stur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x305178
    sub      x8, x29, #0x30
    stur     x27, [x8, #-0x100]
    sub      x8, x29, #0x80
    stur     x26, [x8, #-0x100]
    stur     x22, [x29, #-0xf0]
    sub      x8, x29, #0x88
    stur     x20, [x8, #-0x100]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    ldur     x1, [x29, #-0xc0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x100]
    adrp     x20, #0x4c4000
    ldr      x0, [x20, #0xb0]
    adrp     x8, #0x4bf000
    ldr      x19, [x8, #0x8f0]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xc8]
    ldr      x0, [x20, #0xb0]
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb0]
    movi     v0.16b, #0
    stp      q0, q0, [x21]
    stp      q0, q0, [x21, #0x20]
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    sub      x8, x29, #0x20
    stur     x24, [x8, #-0x100]
    stur     x1, [x29, #-0x88]
    mov      x2, x21
    sub      x8, x29, #0x28
    ldur     x3, [x8, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x304824
    mov      x20, x0
    ldr      x8, [x21, #0x10]
    ldr      x28, [x8]
    adrp     x19, #0x546000
    add      x19, x19, #0x1f0
    sub      x8, x29, #0x10
    stur     x28, [x8, #-0x100]
    mov      x27, #0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x500]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x338]
    stur     x8, [x29, #-0x68]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0x920]
    stur     x8, [x29, #-0x80]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x620]
    stur     x8, [x29, #-0xb8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x830]
    stur     x8, [x29, #-0xd0]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x368]
    stur     x8, [x29, #-0xf8]
    adrp     x8, #0x4c1000
    ldr      x8, [x8]
    sub      x9, x29, #8
    stur     x8, [x9, #-0x100]
    ldr      x8, [x21, #0x10]
    ldr      x8, [x8]
    cmp      x8, x28
    b.eq     #0x304650
    sub      x8, x29, #0x20
    ldur     x0, [x8, #-0x100]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x21, #8]
    ldr      x22, [x8, x27, lsl #3]
    mov      x0, x22
    mov      x1, x23
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    mov      x0, x22
    mov      x1, x23
    adrp     x2, #0x546000
    add      x2, x2, #0x2b0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    ldur     x1, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x24
    ldur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3047ac
    mov      x0, x24
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x3047ac
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xa8]
    ldur     x1, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x26
    ldur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    tbz      w0, #0, #0x3047ac
    adrp     x8, #0x4c4000
    mov      x28, x21
    ldr      x19, [x8, #0xb8]
    mov      x0, x26
    ldur     x1, [x29, #-0x80]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #-0x10]!
    mov      x0, x19
    ldur     x1, [x29, #-0xb8]
    adrp     x2, #0x546000
    add      x2, x2, #0x230
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    add      sp, sp, #0x10
    mov      x19, x0
    ldur     x0, [x29, #-0x100]
    ldur     x1, [x29, #-0xd0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    ldur     x0, [x29, #-0xc8]
    ldur     x21, [x29, #-0xf8]
    mov      x1, x21
    mov      x2, x24
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x4c8]
    sub      x8, x29, #8
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x0, [x29, #-0xb0]
    mov      x1, x21
    mov      x2, x22
    mov      x3, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    adrp     x19, #0x546000
    add      x19, x19, #0x1f0
    mov      x21, x28
    sub      x8, x29, #0x10
    ldur     x28, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    add      x27, x27, #1
    cmp      x20, x27
    b.ne     #0x304634
    b        #0x3047fc
    cmp      w1, #1
    b.ne     #0x305278
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    mov      x26, #0
    b        #0x304694
    cmp      w1, #1
    b.ne     #0x305278
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    mov      x24, #0
    b        #0x304674
    sub      x8, x29, #0x20
    ldur     x0, [x8, #-0x100]
    ldur     x1, [x29, #-0x88]
    mov      x2, x21
    sub      x8, x29, #0x28
    ldur     x3, [x8, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    cbnz     x0, #0x3045dc
    sub      x8, x29, #0x20
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    bl       #0x30da28
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    ldur     x1, [x29, #-0xc0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    sub      x8, x29, #0x10
    stur     x0, [x8, #-0x100]
    sub      x8, x29, #0x18
    ldur     x21, [x8, #-0x100]
    adrp     x22, #0x4c4000
    cbz      x27, #0x304a18
    adrp     x8, #0x4c1000
    ldr      x19, [x8, #0xa28]
    mov      x0, x27
    sub      x8, x29, #0x80
    ldur     x1, [x8, #-0x100]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x304a18
    mov      x0, x27
    mov      x1, x19
    mov      w2, #1
    mov      w3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    ldr      x0, [x22, #0x98]
    ldur     x1, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x20
    ldur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x304a10
    movi     v0.16b, #0
    ldur     x19, [x29, #-0x78]
    stp      q0, q0, [x19, #0x20]
    stp      q0, q0, [x19]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    ldur     x1, [x29, #-0x88]
    mov      x2, x19
    sub      x8, x29, #0x30
    ldur     x3, [x8, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    cbz      x0, #0x304a00
    ldur     x8, [x29, #-0x78]
    ldr      x8, [x8, #0x10]
    ldr      x26, [x8]
    mov      x28, #0
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x830]
    adrp     x8, #0x4c1000
    ldr      x24, [x8, #0xa18]
    ldur     x8, [x29, #-0x78]
    ldr      x8, [x8, #0x10]
    ldr      x8, [x8]
    cmp      x8, x26
    b.eq     #0x304948
    mov      x0, x20
    bl       #0x461c24 // _objc_enumerationMutation
    ldur     x8, [x29, #-0x78]
    ldr      x8, [x8, #8]
    ldr      x22, [x8, x28, lsl #3]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    ldur     x1, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x22
    ldur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x3049b8
    mov      x0, x27
    mov      x1, x24
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cbz      x0, #0x3049ac
    sub      x8, x29, #0x10
    ldur     x0, [x8, #-0x100]
    mov      x1, x23
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    b        #0x3049d0
    cbz      x22, #0x3049d0
    sub      x8, x29, #0x10
    ldur     x0, [x8, #-0x100]
    mov      x1, x23
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    add      x28, x28, #1
    cmp      x21, x28
    b.ne     #0x30492c
    mov      x0, x20
    ldur     x1, [x29, #-0x88]
    ldur     x2, [x29, #-0x78]
    sub      x8, x29, #0x30
    ldur     x3, [x8, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    cbnz     x0, #0x304918
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x18
    ldur     x21, [x8, #-0x100]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x90
    stur     x27, [x8, #-0x100]
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    stp      q0, q0, [x21, #0x20]
    stp      q0, q0, [x21]
    sub      x8, x29, #0x10
    ldur     x0, [x8, #-0x100]
    bl       #0x461ca8 // _objc_retain
    ldur     x1, [x29, #-0x88]
    mov      x2, x21
    sub      x8, x29, #0x68
    ldur     x3, [x8, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    ldur     x28, [x29, #-0xb0]
    stur     x0, [x29, #-0xd0]
    cbz      x0, #0x304e9c
    ldr      x8, [x21, #0x10]
    ldr      x8, [x8]
    stur     x8, [x29, #-0xf8]
    mov      x19, #0
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x338]
    stur     x8, [x29, #-0x68]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x500]
    sub      x9, x29, #8
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0x308]
    sub      x9, x29, #0x48
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0xf40]
    sub      x9, x29, #0x50
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x900]
    sub      x9, x29, #0x58
    stur     x8, [x9, #-0x100]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x2d8]
    ldr      x8, [x8]
    sub      x9, x29, #0x28
    stur     x8, [x9, #-0x100]
    ldr      x8, [x21, #0x10]
    ldr      x8, [x8]
    ldur     x9, [x29, #-0xf8]
    cmp      x8, x9
    b.eq     #0x304af4
    sub      x8, x29, #0x10
    ldur     x0, [x8, #-0x100]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x21, #8]
    ldr      x20, [x8, x19, lsl #3]
    mov      x0, x20
    bl       #0x30f868
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x304e38
    stur     x19, [x29, #-0xb8]
    movi     v0.16b, #0
    stp      q0, q0, [x25, #0x20]
    stp      q0, q0, [x25]
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    sub      x8, x29, #8
    ldur     x1, [x8, #-0x100]
    adrp     x2, #0x546000
    add      x2, x2, #0x270
    ldur     x19, [x29, #-0x70]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    ldur     x1, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x21
    ldur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x304d50
    mov      x0, x21
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x304d50
    sub      x8, x29, #0x30
    stur     x20, [x8, #-0x100]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    ldur     x1, [x29, #-0xc0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x78]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xc0]
    sub      x8, x29, #0x48
    ldur     x1, [x8, #-0x100]
    adrp     x2, #0x546000
    add      x2, x2, #0x2f0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x2, x0
    movi     v0.16b, #0
    stp      q0, q0, [x19]
    stp      q0, q0, [x19, #0x20]
    sub      x8, x29, #0x38
    stur     x21, [x8, #-0x100]
    mov      x0, x21
    sub      x8, x29, #0x50
    ldur     x1, [x8, #-0x100]
    sub      x8, x29, #0x40
    stur     x2, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x80]
    ldur     x1, [x29, #-0x88]
    mov      x2, x19
    ldur     x3, [x29, #-0x98]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x304d04
    mov      x21, x0
    ldr      x8, [x19, #0x10]
    ldr      x28, [x8]
    mov      x26, #0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x5b8]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x5c0]
    adrp     x8, #0x4be000
    ldr      x27, [x8, #0x830]
    ldr      x8, [x19, #0x10]
    ldr      x8, [x8]
    cmp      x8, x28
    b.eq     #0x304c68
    ldur     x0, [x29, #-0x80]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x19, #8]
    ldr      x19, [x8, x26, lsl #3]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xc0]
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    mov      x0, x19
    mov      x1, x23
    mov      x2, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldur     x1, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x304cd0
    ldur     x0, [x29, #-0x78]
    mov      x1, x27
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    add      x26, x26, #1
    cmp      x21, x26
    ldur     x19, [x29, #-0x70]
    b.ne     #0x304c50
    ldp      x1, x0, [x29, #-0x88]
    mov      x2, x19
    ldur     x3, [x29, #-0x98]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    cbnz     x0, #0x304c34
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    ldur     x19, [x29, #-0x78]
    mov      x0, x19
    sub      x8, x29, #0x58
    ldur     x1, [x8, #-0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x26, x0
    sub      x8, x29, #0x40
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x28, [x29, #-0xb0]
    sub      x8, x29, #0x30
    ldur     x20, [x8, #-0x100]
    sub      x8, x29, #0x38
    ldur     x21, [x8, #-0x100]
    b        #0x304d60
    sub      x8, x29, #0x28
    ldur     x26, [x8, #-0x100]
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    ldp      x3, x1, [x29, #-0x90]
    mov      x2, x25
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x304e24
    mov      x21, x0
    ldr      x8, [x25, #0x10]
    ldr      x20, [x8]
    mov      x27, #0
    adrp     x8, #0x4be000
    ldr      x22, [x8, #0x528]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x830]
    ldr      x8, [x25, #0x10]
    ldr      x8, [x8]
    cmp      x8, x20
    b.eq     #0x304dc0
    mov      x0, x26
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x25, #8]
    ldr      x2, [x8, x27, lsl #3]
    mov      x0, x28
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    cbz      x0, #0x304df4
    mov      x0, x19
    mov      x1, x23
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    add      x27, x27, #1
    cmp      x21, x27
    b.ne     #0x304da8
    mov      x0, x26
    ldp      x3, x1, [x29, #-0x90]
    mov      x2, x25
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x0
    cbnz     x0, #0x304d94
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x18
    ldur     x21, [x8, #-0x100]
    ldur     x19, [x29, #-0xb8]
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    add      x19, x19, #1
    ldur     x8, [x29, #-0xd0]
    cmp      x19, x8
    b.ne     #0x304ad4
    b        #0x304e74
    cmp      w1, #1
    b.ne     #0x305278
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    mov      x21, #0
    ldur     x28, [x29, #-0xb0]
    ldur     x19, [x29, #-0x70]
    b        #0x304b58
    sub      x8, x29, #0x10
    ldur     x0, [x8, #-0x100]
    ldur     x1, [x29, #-0x88]
    mov      x2, x21
    sub      x8, x29, #0x68
    ldur     x3, [x8, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xd0]
    cbnz     x0, #0x304a70
    sub      x8, x29, #0x10
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x19, [x8, #0xa50]
    sub      x8, x29, #0x78
    ldur     x20, [x8, #-0x100]
    mov      x0, x20
    sub      x8, x29, #0x80
    ldur     x1, [x8, #-0x100]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    ldur     x25, [x29, #-0xd8]
    cbz      w0, #0x304f7c
    mov      x0, x20
    mov      x1, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    ldur     x1, [x29, #-0xa0]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x20
    ldur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x304f74
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x740]
    sub      x9, x29, #0x70
    ldur     x19, [x9, #-0x100]
    str      x8, [x19]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x398]
    str      d0, [x19, #8]
    adrp     x8, #0x310000
    add      x8, x8, #0x75c
    adrp     x9, #0x4a4000
    add      x9, x9, #0x948
    stp      x8, x9, [x19, #0x10]
    mov      x0, x28
    bl       #0x461ca8 // _objc_retain
    str      x28, [x19, #0x20]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0xdb8]
    mov      x0, x20
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    sub      x8, x29, #0x70
    ldur     x8, [x8, #-0x100]
    ldr      x0, [x8, #0x20]
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    stp      q0, q0, [x25, #0x20]
    stp      q0, q0, [x25]
    ldur     x0, [x29, #-0x100]
    bl       #0x461ca8 // _objc_retain
    ldur     x1, [x29, #-0x88]
    mov      x2, x25
    sub      x8, x29, #0x60
    ldur     x3, [x8, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x305114
    mov      x20, x0
    ldr      x8, [x25, #0x10]
    ldr      x27, [x8]
    mov      x28, #0
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x528]
    adrp     x8, #0x4bf000
    ldr      x23, [x8, #0x108]
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x830]
    ldr      x8, [x25, #0x10]
    ldr      x8, [x8]
    cmp      x8, x27
    b.eq     #0x304fec
    ldur     x0, [x29, #-0x100]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x25, #8]
    ldr      x19, [x8, x28, lsl #3]
    ldur     x0, [x29, #-0xc8]
    mov      x1, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    ldur     x0, [x29, #-0xb0]
    mov      x1, x21
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x1, [x29, #-0xc0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x2d8]
    ldr      x8, [x8]
    cmp      x0, #0
    csel     x26, x8, x0, eq
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    mov      x0, x25
    ldur     x25, [x29, #-0xd8]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    cmp      x22, #0
    adrp     x8, #0x4a6000
    add      x8, x8, #0xd8
    csel     x8, x8, x22, eq
    ldp      x3, x2, [x29, #-0xe8]
    adrp     x9, #0x546000
    add      x10, x9, #0x1b0
    adrp     x9, #0x546000
    add      x9, x9, #0x170
    stp      x10, x9, [x3]
    stp      x8, x26, [x2]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x208]
    mov      x1, x23
    mov      w4, #2
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    ldur     x0, [x29, #-0xf0]
    mov      x1, x24
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    add      x28, x28, #1
    cmp      x20, x28
    b.ne     #0x304fd4
    ldur     x0, [x29, #-0x100]
    ldur     x1, [x29, #-0x88]
    mov      x2, x25
    sub      x8, x29, #0x60
    ldur     x3, [x8, #-0x100]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x20, x0
    cbnz     x0, #0x304fb8
    ldur     x19, [x29, #-0x100]
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldur     x22, [x29, #-0xf0]
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    sub      x8, x29, #0x10
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x90
    ldur     x0, [x8, #-0x100]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xc8]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    sub      x8, x29, #0x88
    ldur     x20, [x8, #-0x100]
    sub      x8, x29, #0x78
    ldur     x23, [x8, #-0x100]
    sub      x8, x29, #0x20
    ldur     x24, [x8, #-0x100]
    b        #0x305180
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    b        #0x3051f8
    b        #0x30525c
    b        #0x30525c
    b        #0x30525c
    b        #0x3051a4
    cmp      w1, #1
    b.ne     #0x305278
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    ldur     x25, [x29, #-0xd8]
    b        #0x304f7c
    cmp      w1, #1
    b.ne     #0x305278
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    mov      x24, #0
    sub      x8, x29, #0x78
    ldur     x23, [x8, #-0x100]
    b        #0x3044d8
    b        #0x30525c
    cmp      w1, #1
    b.ne     #0x305278
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    mov      x0, x22
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x988]
    mov      x0, x20
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x305254
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail
    b        #0x30525c
    cmp      w1, #1
    b.ne     #0x305278
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    sub      x8, x29, #0x18
    ldur     x21, [x8, #-0x100]
    b        #0x304a18
    bl       #0x461894 // __Unwind_Resume

// -[WCLGGroupMemberPicker ensureChatroomsLoaded] IMP=0x30527C bounds=0x30527C-0x306040
loc_30527C:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x80
    mov      x19, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x58]
    adrp     x8, #0x580000
    add      x8, x8, #0x88c
    ldar     w9, [x8]
    cbnz     w9, #0x305818
    adrp     x10, #0x546000
    add      x10, x10, #0x446
    ldrb     w9, [x10]
    mov      w11, #0x68
    adrp     x13, #0x546000
    add      x13, x13, #0x455
    eor      w9, w9, w11
    strb     w9, [x13]
    ldrb     w9, [x10, #1]
    eor      w9, w9, #0x11111111
    strb     w9, [x13, #1]
    ldrb     w11, [x10, #2]
    mov      w9, #0xb
    eor      w11, w11, w9
    strb     w11, [x13, #2]
    ldrb     w11, [x10, #3]
    mov      w15, #0x36
    eor      w11, w11, w15
    strb     w11, [x13, #3]
    ldrb     w11, [x10, #4]
    mov      w12, #0xb4
    eor      w11, w11, w12
    strb     w11, [x13, #4]
    ldrb     w11, [x10, #5]
    mov      w16, #0xd
    eor      w11, w11, w16
    strb     w11, [x13, #5]
    ldrb     w11, [x10, #6]
    mov      w12, #0xb1
    eor      w11, w11, w12
    strb     w11, [x13, #6]
    ldrb     w11, [x10, #7]
    mov      w14, #0xe9
    eor      w11, w11, w14
    strb     w11, [x13, #7]
    ldrb     w11, [x10, #8]
    eor      w11, w11, w16
    strb     w11, [x13, #8]
    ldrb     w11, [x10, #9]
    eor      w11, w11, #0x1e
    strb     w11, [x13, #9]
    ldrb     w11, [x10, #0xa]
    mov      w14, #0xac
    eor      w11, w11, w14
    strb     w11, [x13, #0xa]
    ldrb     w11, [x10, #0xb]
    mov      w14, #0x41
    eor      w11, w11, w14
    strb     w11, [x13, #0xb]
    ldrb     w11, [x10, #0xc]
    mov      w14, #0x37
    eor      w11, w11, w14
    strb     w11, [x13, #0xc]
    ldrb     w11, [x10, #0xd]
    mov      w14, #0xc8
    eor      w11, w11, w14
    strb     w11, [x13, #0xd]
    ldrb     w11, [x10, #0xe]
    mov      w10, #0xbc
    eor      w11, w11, w10
    strb     w11, [x13, #0xe]
    adrp     x13, #0x546000
    add      x13, x13, #0x410
    ldrb     w11, [x13]
    mov      w14, #0x93
    eor      w11, w11, w14
    adrp     x14, #0x546000
    add      x14, x14, #0x430
    strb     w11, [x14]
    ldrb     w11, [x13, #1]
    eor      w11, w11, w16
    strb     w11, [x14, #1]
    ldrb     w11, [x13, #2]
    mov      w16, #0x4a
    eor      w11, w11, w16
    strb     w11, [x14, #2]
    ldrb     w11, [x13, #3]
    mov      w16, #0xcd
    eor      w11, w11, w16
    strb     w11, [x14, #3]
    ldrb     w16, [x13, #4]
    mov      w11, #0xd7
    eor      w16, w16, w11
    strb     w16, [x14, #4]
    ldrb     w16, [x13, #5]
    eor      w15, w16, w15
    strb     w15, [x14, #5]
    ldrb     w15, [x13, #6]
    eor      w15, w15, #0xffffffdf
    strb     w15, [x14, #6]
    ldrb     w15, [x13, #7]
    mov      w16, #0x6e
    eor      w15, w15, w16
    strb     w15, [x14, #7]
    ldrb     w15, [x13, #8]
    mov      w16, #0x1d
    eor      w15, w15, w16
    strb     w15, [x14, #8]
    ldrb     w15, [x13, #9]
    mov      w17, #0x25
    eor      w15, w15, w17
    strb     w15, [x14, #9]
    ldrb     w15, [x13, #0xa]
    eor      w15, w15, #0xaaaaaaaa
    strb     w15, [x14, #0xa]
    ldrb     w15, [x13, #0xb]
    mov      w17, #5
    eor      w15, w15, w17
    strb     w15, [x14, #0xb]
    ldrb     w15, [x13, #0xc]
    eor      w12, w15, w12
    strb     w12, [x14, #0xc]
    ldrb     w12, [x13, #0xd]
    eor      w12, w12, #0xffffffe1
    strb     w12, [x14, #0xd]
    ldrb     w12, [x13, #0xe]
    mov      w15, #0x7b
    eor      w12, w12, w15
    strb     w12, [x14, #0xe]
    ldrb     w12, [x13, #0xf]
    eor      w12, w12, #0xffffffcf
    strb     w12, [x14, #0xf]
    ldrb     w12, [x13, #0x10]
    eor      w12, w12, #0xfffffff9
    strb     w12, [x14, #0x10]
    ldrb     w12, [x13, #0x11]
    eor      w12, w12, #0x22222222
    strb     w12, [x14, #0x11]
    ldrb     w15, [x13, #0x12]
    mov      w12, #0xc2
    eor      w15, w15, w12
    strb     w15, [x14, #0x12]
    ldrb     w15, [x13, #0x13]
    mov      w17, #0x52
    eor      w15, w15, w17
    strb     w15, [x14, #0x13]
    ldrb     w15, [x13, #0x14]
    mov      w17, #0x92
    eor      w15, w15, w17
    strb     w15, [x14, #0x14]
    ldrb     w13, [x13, #0x15]
    eor      w15, w13, w16
    adrp     x13, #0x546000
    add      x13, x13, #0x3e4
    strb     w15, [x14, #0x15]
    ldrb     w14, [x13]
    mov      w15, #0x39
    eor      w14, w14, w15
    adrp     x15, #0x546000
    add      x15, x15, #0x3f4
    strb     w14, [x15]
    ldrb     w14, [x13, #1]
    mov      w16, #0x90
    eor      w14, w14, w16
    strb     w14, [x15, #1]
    ldrb     w14, [x13, #2]
    mov      w16, #0xb7
    eor      w14, w14, w16
    strb     w14, [x15, #2]
    ldrb     w14, [x13, #3]
    mov      w16, #0x63
    eor      w14, w14, w16
    strb     w14, [x15, #3]
    ldrb     w14, [x13, #4]
    mov      w16, #0x15
    eor      w14, w14, w16
    strb     w14, [x15, #4]
    ldrb     w14, [x13, #5]
    mov      w16, #0xb2
    eor      w14, w14, w16
    strb     w14, [x15, #5]
    ldrb     w14, [x13, #6]
    eor      w14, w14, #0x40
    strb     w14, [x15, #6]
    ldrb     w14, [x13, #7]
    eor      w14, w14, w11
    strb     w14, [x15, #7]
    ldrb     w14, [x13, #8]
    mov      w16, #0x34
    eor      w14, w14, w16
    strb     w14, [x15, #8]
    ldrb     w14, [x13, #9]
    mov      w16, #0x59
    eor      w14, w14, w16
    strb     w14, [x15, #9]
    ldrb     w14, [x13, #0xa]
    mov      w16, #0xe4
    eor      w14, w14, w16
    strb     w14, [x15, #0xa]
    ldrb     w14, [x13, #0xb]
    mov      w16, #0x27
    eor      w14, w14, w16
    strb     w14, [x15, #0xb]
    ldrb     w14, [x13, #0xc]
    eor      w14, w14, #0xfffffffd
    strb     w14, [x15, #0xc]
    ldrb     w14, [x13, #0xd]
    mov      w16, #0x2c
    eor      w14, w14, w16
    strb     w14, [x15, #0xd]
    ldrb     w14, [x13, #0xe]
    eor      w14, w14, w16
    strb     w14, [x15, #0xe]
    ldrb     w13, [x13, #0xf]
    eor      w12, w13, w12
    strb     w12, [x15, #0xf]
    adrp     x12, #0x546000
    add      x12, x12, #0x3c6
    ldrb     w13, [x12]
    mov      w14, #0xdb
    eor      w13, w13, w14
    adrp     x15, #0x546000
    add      x15, x15, #0x3d5
    strb     w13, [x15]
    ldrb     w13, [x12, #1]
    mov      w16, #0xbd
    eor      w13, w13, w16
    strb     w13, [x15, #1]
    ldrb     w13, [x12, #2]
    mov      w16, #0x43
    eor      w13, w13, w16
    strb     w13, [x15, #2]
    ldrb     w13, [x12, #3]
    eor      w13, w13, #0x44444444
    strb     w13, [x15, #3]
    ldrb     w13, [x12, #4]
    mov      w16, #0x72
    eor      w13, w13, w16
    strb     w13, [x15, #4]
    ldrb     w13, [x12, #5]
    mov      w16, #0x13
    eor      w13, w13, w16
    strb     w13, [x15, #5]
    ldrb     w16, [x12, #6]
    mov      w13, #0xec
    eor      w16, w16, w13
    strb     w16, [x15, #6]
    ldrb     w16, [x12, #7]
    mov      w17, #0x1a
    eor      w16, w16, w17
    strb     w16, [x15, #7]
    ldrb     w16, [x12, #8]
    eor      w16, w16, #0x18
    strb     w16, [x15, #8]
    ldrb     w16, [x12, #9]
    eor      w14, w16, w14
    strb     w14, [x15, #9]
    ldrb     w14, [x12, #0xa]
    eor      w11, w14, w11
    strb     w11, [x15, #0xa]
    ldrb     w11, [x12, #0xb]
    eor      w11, w11, #0xffffffe3
    strb     w11, [x15, #0xb]
    ldrb     w11, [x12, #0xc]
    eor      w11, w11, #0xdddddddd
    strb     w11, [x15, #0xc]
    ldrb     w11, [x12, #0xd]
    mov      w14, #0x6b
    eor      w11, w11, w14
    strb     w11, [x15, #0xd]
    ldrb     w11, [x12, #0xe]
    eor      w12, w11, #0xeeeeeeee
    adrp     x11, #0x546000
    add      x11, x11, #0x390
    strb     w12, [x15, #0xe]
    ldrb     w12, [x11]
    mov      w14, #0xe2
    eor      w14, w12, w14
    adrp     x12, #0x546000
    add      x12, x12, #0x3b0
    strb     w14, [x12]
    ldrb     w14, [x11, #1]
    eor      w14, w14, #0xf
    strb     w14, [x12, #1]
    ldrb     w14, [x11, #2]
    mov      w15, #0x12
    eor      w14, w14, w15
    strb     w14, [x12, #2]
    ldrb     w14, [x11, #3]
    eor      w14, w14, #0x7e
    strb     w14, [x12, #3]
    ldrb     w14, [x11, #4]
    mov      w15, #0x3b
    eor      w14, w14, w15
    strb     w14, [x12, #4]
    ldrb     w14, [x11, #5]
    mov      w15, #0xa9
    eor      w14, w14, w15
    strb     w14, [x12, #5]
    ldrb     w14, [x11, #6]
    eor      w14, w14, #0x20
    strb     w14, [x12, #6]
    ldrb     w14, [x11, #7]
    eor      w9, w14, w9
    strb     w9, [x12, #7]
    ldrb     w9, [x11, #8]
    eor      w9, w9, w13
    strb     w9, [x12, #8]
    ldrb     w9, [x11, #9]
    eor      w9, w9, w10
    strb     w9, [x12, #9]
    ldrb     w9, [x11, #0xa]
    eor      w9, w9, #0xfc
    strb     w9, [x12, #0xa]
    ldrb     w9, [x11, #0xb]
    mov      w10, #0xbe
    eor      w9, w9, w10
    strb     w9, [x12, #0xb]
    ldrb     w9, [x11, #0xc]
    eor      w9, w9, #0xc0
    strb     w9, [x12, #0xc]
    ldrb     w9, [x11, #0xd]
    mov      w10, #0xe6
    eor      w9, w9, w10
    strb     w9, [x12, #0xd]
    ldrb     w9, [x11, #0xe]
    mov      w10, #0x32
    eor      w9, w9, w10
    strb     w9, [x12, #0xe]
    ldrb     w9, [x11, #0xf]
    eor      w9, w9, #0x1e
    strb     w9, [x12, #0xf]
    ldrb     w9, [x11, #0x10]
    eor      w9, w9, #0x44444444
    strb     w9, [x12, #0x10]
    ldrb     w9, [x11, #0x11]
    eor      w9, w9, #0xffffffbf
    strb     w9, [x12, #0x11]
    ldrb     w9, [x11, #0x12]
    eor      w9, w9, #0x66666666
    strb     w9, [x12, #0x12]
    ldrb     w9, [x11, #0x13]
    mov      w10, #0xb0
    eor      w9, w9, w10
    strb     w9, [x12, #0x13]
    ldrb     w9, [x11, #0x14]
    mov      w10, #0x4e
    eor      w9, w9, w10
    strb     w9, [x12, #0x14]
    ldrb     w9, [x11, #0x15]
    eor      w9, w9, #0x1c
    strb     w9, [x12, #0x15]
    mov      w9, #1
    stlr     w9, [x8]
    sub      x22, sp, #0x40
    mov      sp, x22
    sub      x24, sp, #0x40
    mov      sp, x24
    sub      x27, sp, #0x80
    mov      sp, x27
    sub      x21, sp, #0x40
    mov      sp, x21
    sub      x26, sp, #0x80
    mov      sp, x26
    sub      x20, sp, #0x40
    mov      sp, x20
    sub      x8, sp, #0x80
    stur     x8, [x29, #-0x88]
    mov      sp, x8
    sub      x8, sp, #0x40
    stur     x8, [x29, #-0x78]
    mov      sp, x8
    sub      x8, sp, #0x80
    stur     x8, [x29, #-0xa8]
    mov      sp, x8
    sub      x23, sp, #0x30
    mov      sp, x23
    sub      x25, sp, #0x40
    mov      sp, x25
    sub      x8, sp, #0x80
    stur     x8, [x29, #-0x68]
    mov      sp, x8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x990]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    tbnz     w0, #0, #0x305fd8
    stur     x26, [x29, #-0x70]
    stur     x23, [x29, #-0x98]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x998]
    mov      x0, x19
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x948]
    stur     x19, [x29, #-0xb0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x170]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb78]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    bl       #0x30da28
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x27, [x29, #-0x90]
    mov      x27, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [x22]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    str      d0, [x22, #8]
    adrp     x8, #0x311000
    add      x8, x8, #0x4a0
    adrp     x9, #0x4a4000
    add      x9, x9, #0x968
    stp      x8, x9, [x22, #0x10]
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    stur     x26, [x29, #-0xd0]
    str      x26, [x22, #0x20]
    mov      x0, x27
    bl       #0x461ca8 // _objc_retain
    stur     x27, [x29, #-0x80]
    str      x27, [x22, #0x28]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    stur     x19, [x29, #-0xc8]
    str      x19, [x22, #0x30]
    stur     x22, [x29, #-0xb8]
    mov      x0, x22
    bl       #0x461cd8 // _objc_retainBlock
    mov      x27, x0
    movi     v0.16b, #0
    stp      q0, q0, [x24]
    stp      q0, q0, [x24, #0x20]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x2d8]
    ldr      x8, [x8]
    cmp      x23, #0
    stur     x23, [x29, #-0xc0]
    csel     x28, x8, x23, eq
    mov      x0, x28
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stur     x1, [x29, #-0x60]
    mov      x2, x24
    ldur     x3, [x29, #-0x90]
    mov      x19, x3
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x305a5c
    mov      x23, x0
    ldr      x8, [x24, #0x10]
    ldr      x22, [x8]
    mov      x26, #0
    ldr      x8, [x24, #0x10]
    ldr      x8, [x8]
    cmp      x8, x22
    b.eq     #0x305a1c
    mov      x0, x28
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x24, #8]
    ldr      x1, [x8, x26, lsl #3]
    ldr      x8, [x27, #0x10]
    mov      x0, x27
    blr      x8
    add      x26, x26, #1
    cmp      x23, x26
    b.ne     #0x305a04
    mov      x0, x28
    ldur     x1, [x29, #-0x60]
    mov      x2, x24
    mov      x3, x19
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    cbnz     x0, #0x305a00
    mov      x0, x28
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    stp      q0, q0, [x21, #0x20]
    stp      q0, q0, [x21]
    bl       #0x365ce8
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x2d8]
    ldr      x8, [x8]
    cmp      x0, #0
    csel     x23, x8, x0, eq
    mov      x0, x23
    bl       #0x461ca8 // _objc_retain
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    ldur     x1, [x29, #-0x60]
    mov      x2, x21
    ldur     x26, [x29, #-0x70]
    mov      x3, x26
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    cbz      x0, #0x305b2c
    mov      x24, x0
    ldr      x8, [x21, #0x10]
    ldr      x19, [x8]
    mov      x22, #0
    ldr      x8, [x21, #0x10]
    ldr      x8, [x8]
    cmp      x8, x19
    b.eq     #0x305aec
    mov      x0, x23
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x21, #8]
    ldr      x1, [x8, x22, lsl #3]
    ldr      x8, [x27, #0x10]
    mov      x0, x27
    blr      x8
    add      x22, x22, #1
    cmp      x24, x22
    b.ne     #0x305ad4
    mov      x0, x23
    ldur     x1, [x29, #-0x60]
    mov      x2, x21
    mov      x3, x26
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    cbnz     x0, #0x305ad0
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x21, [x8, #0xa28]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x3e0]
    ldur     x0, [x29, #-0x80]
    stur     x1, [x29, #-0x90]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x305cac
    ldur     x0, [x29, #-0x80]
    mov      x1, x21
    mov      w2, #1
    mov      w3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x70]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x21, [x8, #0x410]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x418]
    ldur     x0, [x29, #-0x70]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x305ca4
    movi     v0.16b, #0
    stp      q0, q0, [x20, #0x20]
    stp      q0, q0, [x20]
    ldur     x0, [x29, #-0x70]
    bl       #0x461ca8 // _objc_retain
    ldur     x1, [x29, #-0x60]
    mov      x2, x20
    ldur     x3, [x29, #-0x88]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    cbz      x0, #0x305c9c
    ldr      x8, [x20, #0x10]
    ldr      x26, [x8]
    mov      x19, #0
    ldr      x8, [x20, #0x10]
    ldr      x8, [x8]
    cmp      x8, x26
    b.eq     #0x305c00
    ldur     x0, [x29, #-0x70]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x20, #8]
    ldr      x28, [x8, x19, lsl #3]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xb8]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x28
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x305c40
    ldr      x8, [x27, #0x10]
    mov      x0, x27
    mov      x1, x28
    blr      x8
    b        #0x305c70
    mov      x0, x28
    bl       #0x30f868
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    cbz      x0, #0x305c68
    ldr      x8, [x27, #0x10]
    mov      x0, x27
    mov      x1, x22
    blr      x8
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    add      x19, x19, #1
    cmp      x23, x19
    b.ne     #0x305be8
    ldur     x0, [x29, #-0x70]
    ldur     x1, [x29, #-0x60]
    mov      x2, x20
    ldur     x3, [x29, #-0x88]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x23, x0
    cbnz     x0, #0x305be4
    ldur     x0, [x29, #-0x70]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x70]
    bl       #0x461c9c // _objc_release
    movi     v0.16b, #0
    ldur     x19, [x29, #-0x78]
    stp      q0, q0, [x19, #0x20]
    adrp     x8, #0x546000
    add      x8, x8, #0x590
    stp      q0, q0, [x19]
    adrp     x9, #0x546000
    add      x9, x9, #0x550
    adrp     x10, #0x546000
    add      x10, x10, #0x510
    ldur     x2, [x29, #-0x98]
    stp      x8, x9, [x2]
    adrp     x8, #0x546000
    add      x8, x8, #0x4d0
    adrp     x9, #0x546000
    add      x9, x9, #0x490
    stp      x10, x8, [x2, #0x10]
    str      x9, [x2, #0x20]
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    mov      w3, #5
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xa0]
    ldur     x1, [x29, #-0x60]
    mov      x2, x19
    ldur     x3, [x29, #-0xa8]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0x88]
    cbz      x0, #0x305f34
    ldur     x8, [x29, #-0x78]
    ldr      x8, [x8, #0x10]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x98]
    adrp     x24, #0x4c4000
    stur     xzr, [x29, #-0x70]
    adrp     x8, #0x4be000
    ldr      x23, [x8, #0x410]
    adrp     x8, #0x4be000
    ldr      x20, [x8, #0x418]
    ldur     x8, [x29, #-0x78]
    ldr      x8, [x8, #0x10]
    ldr      x8, [x8]
    ldur     x9, [x29, #-0x98]
    cmp      x8, x9
    b.eq     #0x305d7c
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c24 // _objc_enumerationMutation
    ldp      x8, x9, [x29, #-0x78]
    ldr      x8, [x8, #8]
    ldr      x0, [x8, x9, lsl #3]
    bl       #0x4617a4 // _NSSelectorFromString
    mov      x21, x0
    ldur     x0, [x29, #-0x80]
    ldur     x1, [x29, #-0x90]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x305ed4
    ldur     x0, [x29, #-0x80]
    mov      x1, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x98]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x21
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x305ecc
    movi     v0.16b, #0
    stp      q0, q0, [x25, #0x20]
    stp      q0, q0, [x25]
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    ldp      x3, x1, [x29, #-0x68]
    mov      x2, x25
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    cbz      x0, #0x305ec4
    ldr      x8, [x25, #0x10]
    ldr      x19, [x8]
    mov      x26, #0
    ldr      x8, [x25, #0x10]
    ldr      x8, [x8]
    cmp      x8, x19
    b.eq     #0x305e30
    mov      x0, x21
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x25, #8]
    ldr      x22, [x8, x26, lsl #3]
    ldr      x0, [x24, #0xb8]
    mov      x1, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    mov      x0, x22
    mov      x1, x20
    bl       #0x461c6c // _objc_msgSend
    cbz      w0, #0x305e6c
    ldr      x8, [x27, #0x10]
    mov      x0, x27
    mov      x1, x22
    blr      x8
    b        #0x305e9c
    mov      x0, x22
    bl       #0x30f868
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    cbz      x0, #0x305e94
    ldr      x8, [x27, #0x10]
    mov      x0, x27
    mov      x1, x22
    blr      x8
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    add      x26, x26, #1
    cmp      x28, x26
    b.ne     #0x305e18
    mov      x0, x21
    ldp      x3, x1, [x29, #-0x68]
    mov      x2, x25
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    mov      x28, x0
    cbnz     x0, #0x305e14
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldur     x9, [x29, #-0x70]
    add      x9, x9, #1
    ldur     x8, [x29, #-0x88]
    stur     x9, [x29, #-0x70]
    cmp      x9, x8
    b.ne     #0x305d5c
    b        #0x305f18
    b        #0x305f04
    b        #0x305f04
    b        #0x305f04
    b        #0x305f04
    b        #0x305f04
    cmp      w1, #1
    b.ne     #0x30603c
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    b        #0x305ed4
    ldp      x3, x0, [x29, #-0xa8]
    ldur     x1, [x29, #-0x60]
    ldur     x2, [x29, #-0x78]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0x88]
    cbnz     x0, #0x305d48
    ldur     x0, [x29, #-0xa0]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xee0]
    adrp     x2, #0x4a4000
    add      x2, x2, #0x998
    ldur     x21, [x29, #-0xc8]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    mov      x0, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    ldur     x20, [x29, #-0xb8]
    ldr      x0, [x20, #0x30]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x20, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x20, #0x20]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xd0]
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    ldur     x20, [x29, #-0xc0]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x9a0]
    ldur     x0, [x29, #-0xb0]
    mov      x2, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x58]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x306010
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail
    b        #0x306028
    b        #0x306028
    b        #0x306028
    b        #0x306028
    b        #0x306028
    cmp      w1, #1
    b.ne     #0x30603c
    bl       #0x461bf4 // _objc_begin_catch
    bl       #0x461c18 // _objc_end_catch
    b        #0x305cac
    bl       #0x461894 // __Unwind_Resume

// -[WCLGGroupMemberPicker applyFilter] IMP=0x306040 bounds=0x306040-0x306CA4
loc_306040:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x140
    mov      x19, sp
    mov      x20, x0
    mov      w24, #0xc019
    movk     w24, #0xdf36, lsl #16
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    stur     x8, [x29, #-0x60]
    adrp     x8, #0x580000
    add      x8, x8, #0x890
    ldar     w8, [x8]
    stur     w8, [x29, #-0x64]
    mov      w8, #0x671f
    movk     w8, #0x618b, lsl #16
    str      w8, [x19, #0x14]
    add      x8, x19, #0x14
    str      x8, [x19, #8]
    mov      w28, #0x4795
    movk     w28, #0xedc9, lsl #16
    mov      w21, #0xa835
    movk     w21, #0xb59b, lsl #16
    mov      w23, #0x8330
    movk     w23, #0x9ec7, lsl #16
    mov      w26, #0xc018
    movk     w26, #0xdf36, lsl #16
    mov      w22, #0x354f
    movk     w22, #0x1a68, lsl #16
    mov      w27, #0x67c6
    movk     w27, #0x991, lsl #16
    mov      w25, #0xd538
    movk     w25, #0x37c7, lsl #16
    ldr      w8, [x19, #0x14]
    cmp      w8, w28
    b.le     #0x306164
    cmp      w8, w22
    b.gt     #0x30625c
    cmp      w8, w27
    b.gt     #0x3062cc
    mov      w9, #0xee39
    movk     w9, #0xfc11, lsl #16
    cmp      w8, w9
    b.gt     #0x306530
    mov      w9, #0x4796
    movk     w9, #0xedc9, lsl #16
    cmp      w8, w9
    b.eq     #0x306af0
    mov      w9, #0x2707
    movk     w9, #0xf1c4, lsl #16
    cmp      w8, w9
    b.eq     #0x306820
    mov      w9, #0x8c49
    movk     w9, #0xf54d, lsl #16
    cmp      w8, w9
    b.ne     #0x3060dc
    adrp     x8, #0x546000
    ldrb     w8, [x8, #0x5b4]
    mov      w9, #0x57
    eor      w8, w8, w9
    adrp     x9, #0x546000
    strb     w8, [x9, #0x5b6]
    ldr      x8, [x19, #8]
    mov      w9, #0x477b
    movk     w9, #0x331, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    cmp      w8, w21
    b.gt     #0x3061f8
    cmp      w8, w23
    b.le     #0x306334
    mov      w9, #0x8626
    movk     w9, #0xb139, lsl #16
    cmp      w8, w9
    b.gt     #0x306474
    mov      w9, #0x8331
    movk     w9, #0x9ec7, lsl #16
    cmp      w8, w9
    b.eq     #0x306b04
    mov      w9, #0x5c52
    movk     w9, #0xa14f, lsl #16
    cmp      w8, w9
    b.eq     #0x306794
    mov      w9, #0x4d41
    movk     w9, #0xa8c6, lsl #16
    cmp      w8, w9
    b.ne     #0x3060dc
    ldr      x0, [x19, #0x28]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x900]
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    str      x0, [x19, #0x50]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x9c8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #8]
    mov      w9, #0x9e09
    movk     w9, #0xd11b, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    cmp      w8, w26
    b.le     #0x306390
    mov      w9, #0xb9c
    movk     w9, #0xe5ad, lsl #16
    cmp      w8, w9
    b.gt     #0x3064ec
    cmp      w8, w24
    b.eq     #0x306b44
    mov      w9, #0xca9c
    movk     w9, #0xdf37, lsl #16
    cmp      w8, w9
    b.eq     #0x3067bc
    mov      w9, #0x8bf2
    movk     w9, #0xe381, lsl #16
    cmp      w8, w9
    b.ne     #0x3060dc
    ldur     x1, [x29, #-0x90]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xa0]
    ldr      x8, [x19, #8]
    mov      w9, #0x8627
    movk     w9, #0xb139, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    cmp      w8, w25
    b.le     #0x306400
    mov      w9, #0x27b0
    movk     w9, #0x537f, lsl #16
    cmp      w8, w9
    b.gt     #0x30657c
    mov      w9, #0xd539
    movk     w9, #0x37c7, lsl #16
    cmp      w8, w9
    b.eq     #0x306be0
    mov      w9, #0x6aad
    movk     w9, #0x41ef, lsl #16
    cmp      w8, w9
    b.eq     #0x3068ac
    mov      w9, #0x8215
    movk     w9, #0x527a, lsl #16
    cmp      w8, w9
    b.ne     #0x3060dc
    ldur     x2, [x29, #-0x80]
    ldr      x1, [x19, #0x90]
    ldr      x0, [x19, #0x70]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [x19, #0x6e]
    ldr      x8, [x19, #8]
    mov      w9, #0x2707
    movk     w9, #0xf1c4, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    mov      w9, #0x94fe
    movk     w9, #0x16e9, lsl #16
    cmp      w8, w9
    b.le     #0x3065d0
    mov      w9, #0x94ff
    movk     w9, #0x16e9, lsl #16
    cmp      w8, w9
    b.eq     #0x306a20
    mov      w9, #0x1ef8
    movk     w9, #0x1931, lsl #16
    cmp      w8, w9
    b.eq     #0x3066f4
    mov      w9, #0xa81c
    movk     w9, #0x195a, lsl #16
    cmp      w8, w9
    b.ne     #0x3060dc
    ldr      x8, [x19, #0xb0]
    ldr      x9, [x8]
    ldur     x8, [x29, #-0x70]
    add      x8, x8, #8
    stp      x8, x9, [x19, #0xa0]
    ldr      x8, [x19, #8]
    str      w24, [x8]
    ldr      x8, [x19, #0xc8]
    str      x8, [x19, #0x38]
    b        #0x3060dc
    mov      w9, #0x6027
    movk     w9, #0x882c, lsl #16
    cmp      w8, w9
    b.le     #0x30661c
    mov      w9, #0x6028
    movk     w9, #0x882c, lsl #16
    cmp      w8, w9
    b.eq     #0x306a54
    mov      w9, #0x86ab
    movk     w9, #0x9bcd, lsl #16
    cmp      w8, w9
    b.eq     #0x306714
    mov      w9, #0xf315
    movk     w9, #0x9dd1, lsl #16
    cmp      w8, w9
    b.ne     #0x3060dc
    ldr      x0, [x19, #0x70]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #8]
    mov      w9, #0x9504
    movk     w9, #0x438, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    mov      w9, #0x99b4
    movk     w9, #0xc06a, lsl #16
    cmp      w8, w9
    b.le     #0x306670
    mov      w9, #0x99b5
    movk     w9, #0xc06a, lsl #16
    cmp      w8, w9
    b.eq     #0x306a7c
    mov      w9, #0x9e09
    movk     w9, #0xd11b, lsl #16
    cmp      w8, w9
    b.eq     #0x306758
    mov      w9, #0x937f
    movk     w9, #0xda39, lsl #16
    cmp      w8, w9
    b.ne     #0x3060dc
    ldp      x8, x9, [x19, #0x18]
    add      x8, x8, #1
    cmp      x8, x9
    mov      w9, #0x821
    movk     w9, #0x34b4, lsl #16
    mov      w10, #0xb02f
    movk     w10, #0xb1da, lsl #16
    csel     w9, w10, w9, eq
    ldr      x10, [x19, #8]
    str      w9, [x10]
    str      x8, [x19, #0x30]
    b        #0x3060dc
    mov      w9, #0x7202
    movk     w9, #0x2647, lsl #16
    cmp      w8, w9
    b.le     #0x3066b4
    mov      w9, #0x7203
    movk     w9, #0x2647, lsl #16
    cmp      w8, w9
    b.eq     #0x306ae8
    mov      w9, #0xea9c
    movk     w9, #0x307b, lsl #16
    cmp      w8, w9
    b.eq     #0x306774
    mov      w9, #0x821
    movk     w9, #0x34b4, lsl #16
    cmp      w8, w9
    b.ne     #0x3060dc
    ldr      x8, [x19, #0x30]
    str      x8, [x19, #0x18]
    ldr      x8, [x19, #0xb8]
    ldr      x8, [x8]
    ldr      x8, [x8]
    ldr      x9, [x19, #0xa8]
    cmp      x8, x9
    mov      w8, #0x8331
    movk     w8, #0x9ec7, lsl #16
    mov      w9, #0x7d98
    movk     w9, #0x6713, lsl #16
    csel     w8, w8, w9, eq
    b        #0x306a70
    mov      w9, #0x8627
    movk     w9, #0xb139, lsl #16
    cmp      w8, w9
    b.eq     #0x306b84
    mov      w9, #0xb02f
    movk     w9, #0xb1da, lsl #16
    cmp      w8, w9
    b.eq     #0x3067d8
    mov      w9, #0x2993
    movk     w9, #0xb2bb, lsl #16
    cmp      w8, w9
    b.ne     #0x3060dc
    ldr      x1, [x19, #0x98]
    ldr      x0, [x19, #0x80]
    adrp     x2, #0x546000
    add      x2, x2, #0x5e0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x70]
    ldur     x2, [x29, #-0x80]
    ldr      x1, [x19, #0x90]
    ldr      x0, [x19, #0x78]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [x19, #0x6f]
    ldr      x8, [x19, #8]
    mov      w9, #0x6028
    movk     w9, #0x882c, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    mov      w9, #0xb9d
    movk     w9, #0xe5ad, lsl #16
    cmp      w8, w9
    b.eq     #0x306ba8
    mov      w9, #0x6761
    movk     w9, #0xe618, lsl #16
    cmp      w8, w9
    b.eq     #0x306804
    mov      w9, #0xe9b0
    movk     w9, #0xec8f, lsl #16
    cmp      w8, w9
    b.ne     #0x3060dc
    ldr      x8, [x19, #8]
    mov      w9, #0x8331
    movk     w9, #0x9ec7, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    mov      w9, #0xee3a
    movk     w9, #0xfc11, lsl #16
    cmp      w8, w9
    b.eq     #0x306bcc
    mov      w9, #0x477b
    movk     w9, #0x331, lsl #16
    cmp      w8, w9
    b.eq     #0x306840
    mov      w9, #0x9504
    movk     w9, #0x438, lsl #16
    cmp      w8, w9
    b.ne     #0x3060dc
    ldr      x0, [x19, #0x78]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #8]
    mov      w9, #0x937f
    movk     w9, #0xda39, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    mov      w9, #0x27b1
    movk     w9, #0x537f, lsl #16
    cmp      w8, w9
    b.eq     #0x306c04
    mov      w9, #0x7d98
    movk     w9, #0x6713, lsl #16
    cmp      w8, w9
    b.eq     #0x3068d4
    mov      w9, #0x671f
    movk     w9, #0x618b, lsl #16
    cmp      w8, w9
    b.ne     #0x3060dc
    ldur     w8, [x29, #-0x64]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x65]
    ldr      x8, [x19, #8]
    mov      w9, #0xca9c
    movk     w9, #0xdf37, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    mov      w9, #0x67c7
    movk     w9, #0x991, lsl #16
    cmp      w8, w9
    b.eq     #0x30688c
    mov      w9, #0x4a58
    movk     w9, #0xac6, lsl #16
    cmp      w8, w9
    b.ne     #0x306c50
    ldur     x1, [x29, #-0x90]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #1
    cset     w8, eq
    sturb    w8, [x29, #-0x91]
    ldr      x8, [x19, #8]
    mov      w9, #0x9c3a
    movk     w9, #0x8331, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    mov      w9, #0x4442
    movk     w9, #0x8064, lsl #16
    cmp      w8, w9
    b.eq     #0x3068f0
    mov      w9, #0x9c3a
    movk     w9, #0x8331, lsl #16
    cmp      w8, w9
    b.ne     #0x3060dc
    ldurb    w8, [x29, #-0x91]
    cmp      w8, #0
    mov      w8, #0x86ab
    movk     w8, #0x9bcd, lsl #16
    mov      w9, #0x8bf2
    movk     w9, #0xe381, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [x19, #8]
    str      w8, [x9]
    adrp     x8, #0x4c1000
    add      x8, x8, #0x9b8
    str      x8, [x19, #0x48]
    b        #0x3060dc
    mov      w9, #0xa836
    movk     w9, #0xb59b, lsl #16
    cmp      w8, w9
    b.eq     #0x306928
    mov      w9, #0x58a7
    movk     w9, #0xbda9, lsl #16
    cmp      w8, w9
    b.ne     #0x3060dc
    ldur     x1, [x29, #-0xb0]
    ldr      x2, [x19, #0x28]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #8]
    mov      w9, #0x4796
    movk     w9, #0xedc9, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    mov      w9, #0x3550
    movk     w9, #0x1a68, lsl #16
    cmp      w8, w9
    b.eq     #0x306944
    mov      w9, #0xc6d1
    movk     w9, #0x2212, lsl #16
    cmp      w8, w9
    b.ne     #0x3060dc
    ldr      x8, [x19, #0xb8]
    ldr      x8, [x8]
    str      x8, [x19, #0xb0]
    ldr      x8, [x19, #8]
    mov      w9, #0xa81c
    movk     w9, #0x195a, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    ldur     x8, [x29, #-0x70]
    add      x8, x8, #0x10
    str      x8, [x19, #0xb8]
    ldr      x8, [x19, #8]
    mov      w9, #0xc6d1
    movk     w9, #0x2212, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    ldr      x8, [x19, #0x48]
    ldr      x1, [x8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    ldur     x0, [x29, #-0x88]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #8]
    mov      w9, #0x94ff
    movk     w9, #0x16e9, lsl #16
    str      w9, [x8]
    str      x23, [x19, #0x40]
    mov      w23, #0x8330
    movk     w23, #0x9ec7, lsl #16
    b        #0x3060dc
    ldr      x0, [x19, #0x50]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #8]
    mov      w9, #0x7203
    movk     w9, #0x2647, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x9c8]
    stur     x8, [x29, #-0xb0]
    ldr      x8, [x19, #8]
    mov      w9, #0x58a7
    movk     w9, #0xbda9, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    ldurb    w8, [x29, #-0x66]
    mov      w9, #5
    eor      w8, w8, w9
    adrp     x9, #0x546000
    strb     w8, [x9, #0x5b3]
    ldr      x8, [x19, #8]
    mov      w9, #0x3550
    movk     w9, #0x1a68, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    ldurb    w8, [x29, #-0x65]
    cmp      w8, #0
    mov      w8, #0x3550
    movk     w8, #0x1a68, lsl #16
    mov      w9, #0x8c49
    movk     w9, #0xf54d, lsl #16
    b        #0x306838
    ldp      x3, x2, [x29, #-0x78]
    ldur     x1, [x29, #-0xc0]
    ldr      x0, [x19, #0x28]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x60]
    ldr      x8, [x19, #8]
    mov      w9, #0xb9d
    movk     w9, #0xe5ad, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    ldrb     w8, [x19, #0xc7]
    cmp      w8, #0
    mov      w8, #0x4d41
    movk     w8, #0xa8c6, lsl #16
    mov      w9, #0x1ef8
    movk     w9, #0x1931, lsl #16
    b        #0x306a6c
    ldrb     w8, [x19, #0x6e]
    cmp      w8, #0
    mov      w8, #0xf315
    movk     w8, #0x9dd1, lsl #16
    mov      w9, #0x67c7
    movk     w9, #0x991, lsl #16
    csel     w8, w9, w8, ne
    b        #0x306a70
    adrp     x8, #0x546000
    ldrb     w8, [x8, #0x5b5]
    mov      w9, #0x2d
    eor      w8, w8, w9
    adrp     x9, #0x546000
    strb     w8, [x9, #0x5b7]
    adrp     x10, #0x546000
    add      x10, x10, #0x5b0
    ldrb     w8, [x10]
    eor      w8, w8, #0x55555555
    adrp     x9, #0x546000
    strb     w8, [x9, #0x5b2]
    ldrb     w8, [x10, #1]
    sturb    w8, [x29, #-0x66]
    ldr      x8, [x19, #8]
    mov      w9, #0x5c52
    movk     w9, #0xa14f, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    ldur     x0, [x29, #-0xb8]
    ldp      x2, x1, [x19, #0x80]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #8]
    mov      w9, #0xee3a
    movk     w9, #0xfc11, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    ldrb     w8, [x19, #0x5f]
    cmp      w8, #0
    mov      w8, #0x4d41
    movk     w8, #0xa8c6, lsl #16
    csel     w8, w8, w24, ne
    ldr      x9, [x19, #8]
    str      w8, [x9]
    ldr      x8, [x19, #0x60]
    str      x8, [x19, #0x38]
    b        #0x3060dc
    ldr      x0, [x19, #0x28]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x19, #8]
    mov      w9, #0xe9b0
    movk     w9, #0xec8f, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    ldurb    w8, [x29, #-0xa1]
    cmp      w8, #0
    mov      w8, #0x86ab
    movk     w8, #0x9bcd, lsl #16
    mov      w9, #0x94ff
    movk     w9, #0x16e9, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [x19, #8]
    str      w8, [x9]
    ldur     x8, [x29, #-0x88]
    adrp     x9, #0x4c1000
    add      x9, x9, #0x9c0
    stp      x8, x9, [x19, #0x40]
    b        #0x3060dc
    ldr      x0, [x19, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #8]
    mov      w9, #0x671
    movk     w9, #0x13ed, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    adrp     x8, #0x580000
    add      x8, x8, #0x890
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x40
    mov      sp, x8
    stur     x8, [x29, #-0x70]
    sub      x8, sp, #0x80
    mov      sp, x8
    stur     x8, [x29, #-0x78]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x9a8]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0xc0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5b8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5c0]
    mov      x0, x23
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x80]
    mov      x0, x24
    mov      w24, #0xc019
    movk     w24, #0xdf36, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x23
    mov      w23, #0x8330
    movk     w23, #0x9ec7, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x9b0]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x938]
    stp      x8, x0, [x29, #-0x90]
    ldr      x8, [x19, #8]
    mov      w9, #0x4a58
    movk     w9, #0xac6, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    ldr      x8, [x19, #0x40]
    str      x8, [x19, #0x28]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    ldur     x0, [x29, #-0x80]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    mov      w8, #0x99b5
    movk     w8, #0xc06a, lsl #16
    mov      w9, #0xea9c
    movk     w9, #0x307b, lsl #16
    csel     w8, w9, w8, eq
    b        #0x306a70
    ldrb     w8, [x19, #0x6f]
    cmp      w8, #0
    mov      w8, #0x67c7
    movk     w8, #0x991, lsl #16
    mov      w9, #0x8215
    movk     w9, #0x527a, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [x19, #8]
    str      w8, [x9]
    b        #0x3060dc
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x110]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x808]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb8]
    ldur     x8, [x29, #-0x70]
    movi     v0.16b, #0
    stp      q0, q0, [x8]
    stp      q0, q0, [x8, #0x20]
    ldr      x0, [x19, #0x28]
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stur     x1, [x29, #-0xc0]
    ldp      x3, x2, [x29, #-0x78]
    ldr      x0, [x19, #0x28]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0xc8]
    ldr      x8, [x19, #8]
    mov      w9, #0xd539
    movk     w9, #0x37c7, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    ldur     x0, [x29, #-0xb8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #8]
    mov      w9, #0x27b1
    movk     w9, #0x537f, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    ldp      x1, x8, [x19, #0x98]
    ldr      x8, [x8]
    ldr      x9, [x19, #0x18]
    ldr      x0, [x8, x9, lsl #3]
    str      x0, [x19, #0x80]
    adrp     x2, #0x546000
    add      x2, x2, #0x620
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x78]
    ldr      x8, [x19, #8]
    mov      w9, #0x2993
    movk     w9, #0xb2bb, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    ldr      x8, [x19, #0x38]
    str      x8, [x19, #0x20]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x528]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x9d0]
    stp      x8, x9, [x19, #0x90]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x830]
    str      x8, [x19, #0x88]
    ldr      x8, [x19, #8]
    mov      w9, #0x821
    movk     w9, #0x34b4, lsl #16
    str      w9, [x8]
    str      xzr, [x19, #0x30]
    b        #0x3060dc
    ldur     x8, [x29, #-0xa0]
    cmp      x8, #3
    cset     w8, eq
    sturb    w8, [x29, #-0xa1]
    ldr      x8, [x19, #8]
    mov      w9, #0x4442
    movk     w9, #0x8064, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    ldr      x8, [x19, #0x60]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [x19, #0x5f]
    ldr      x8, [x19, #8]
    mov      w9, #0x6aad
    movk     w9, #0x41ef, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    ldr      x8, [x19, #8]
    mov      w9, #0xf315
    movk     w9, #0x9dd1, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    ldr      x8, [x19, #0xc8]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [x19, #0xc7]
    ldr      x8, [x19, #8]
    mov      w9, #0x6761
    movk     w9, #0xe618, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x628]
    mov      x0, x20
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x488]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    mov      w23, #0x8330
    movk     w23, #0x9ec7, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #8]
    mov      w9, #0xa836
    movk     w9, #0xb59b, lsl #16
    str      w9, [x8]
    b        #0x3060dc
    mov      w9, #0x671
    movk     w9, #0x13ed, lsl #16
    cmp      w8, w9
    b.ne     #0x3060dc
    ldur     x0, [x29, #-0x80]
    bl       #0x461c9c // _objc_release
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x306ca0
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGGroupMemberPicker onModeChanged:] IMP=0x306CA4 bounds=0x306CA4-0x3073DC
loc_306CA4:
    sub      sp, sp, #0x100
    stp      x28, x27, [sp, #0xa0]
    stp      x26, x25, [sp, #0xb0]
    stp      x24, x23, [sp, #0xc0]
    stp      x22, x21, [sp, #0xd0]
    stp      x20, x19, [sp, #0xe0]
    stp      x29, x30, [sp, #0xf0]
    add      x29, sp, #0xf0
    mov      x19, x0
    mov      w23, #0x59d8
    movk     w23, #0xd4bb, lsl #16
    mov      w22, #0xcf95
    movk     w22, #0x53ae, lsl #16
    mov      w21, #0x78b2
    movk     w21, #0x14e, lsl #16
    adrp     x8, #0x580000
    add      x8, x8, #0x894
    ldar     w8, [x8]
    stur     w8, [x29, #-0x5c]
    mov      w8, #0x3c98
    movk     w8, #0x84e9, lsl #16
    str      w8, [sp, #0x14]
    add      x8, sp, #0x14
    stp      x2, x8, [sp]
    mov      w20, #0x59d7
    movk     w20, #0xd4bb, lsl #16
    mov      w24, #0x651f
    movk     w24, #0xb434, lsl #16
    mov      w27, #0xbe8a
    movk     w27, #0x357f, lsl #16
    mov      w26, #0x734c
    movk     w26, #0x4ca5, lsl #16
    adrp     x28, #0x546000
    add      x28, x28, #0x654
    adrp     x25, #0x546000
    add      x25, x25, #0x65e
    ldr      w8, [sp, #0x14]
    cmp      w8, w20
    b.gt     #0x306dac
    cmp      w8, w24
    b.gt     #0x306e08
    mov      w9, #0x475c
    movk     w9, #0x9f27, lsl #16
    cmp      w8, w9
    b.le     #0x306f00
    mov      w9, #0x475d
    movk     w9, #0x9f27, lsl #16
    cmp      w8, w9
    b.eq     #0x3070c4
    mov      w9, #0x8679
    movk     w9, #0xaab6, lsl #16
    cmp      w8, w9
    b.eq     #0x30714c
    mov      w9, #0xe492
    movk     w9, #0xab60, lsl #16
    cmp      w8, w9
    b.ne     #0x306d34
    ldur     x1, [x29, #-0x70]
    ldr      x0, [sp]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x78]
    ldr      x8, [sp, #8]
    mov      w9, #0xd3f4
    movk     w9, #0xd2de, lsl #16
    str      w9, [x8]
    b        #0x306d34
    cmp      w8, w27
    b.le     #0x306e6c
    cmp      w8, w26
    b.le     #0x306fd8
    mov      w9, #0x734d
    movk     w9, #0x4ca5, lsl #16
    cmp      w8, w9
    b.eq     #0x307128
    cmp      w8, w22
    b.eq     #0x30728c
    mov      w9, #0xd0fe
    movk     w9, #0x62c0, lsl #16
    cmp      w8, w9
    b.ne     #0x306d34
    ldr      x8, [sp, #0x50]
    cmp      x8, #1
    cset     w8, eq
    strb     w8, [sp, #0x4f]
    ldr      x8, [sp, #8]
    mov      w9, #0x2b4
    movk     w9, #0xfbe5, lsl #16
    str      w9, [x8]
    b        #0x306d34
    mov      w9, #0x7c5a
    movk     w9, #0xbda7, lsl #16
    cmp      w8, w9
    b.le     #0x306f94
    mov      w9, #0x7c5b
    movk     w9, #0xbda7, lsl #16
    cmp      w8, w9
    b.eq     #0x307108
    mov      w9, #0xd3f4
    movk     w9, #0xd2de, lsl #16
    cmp      w8, w9
    b.eq     #0x30718c
    mov      w9, #0x9ed
    movk     w9, #0xd3d0, lsl #16
    cmp      w8, w9
    b.ne     #0x306d34
    ldr      x1, [sp, #0x70]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x50]
    ldr      x8, [sp, #8]
    mov      w9, #0xd0fe
    movk     w9, #0x62c0, lsl #16
    str      w9, [x8]
    b        #0x306d34
    mov      w9, #0x78b1
    movk     w9, #0x14e, lsl #16
    cmp      w8, w9
    b.gt     #0x306ed0
    mov      w9, #0x3880
    movk     w9, #0xed17, lsl #16
    cmp      w8, w9
    b.eq     #0x307254
    mov      w9, #0x2b4
    movk     w9, #0xfbe5, lsl #16
    cmp      w8, w9
    b.ne     #0x30738c
    ldrb     w8, [sp, #0x4f]
    cmp      w8, #0
    mov      w8, #0x734d
    movk     w8, #0x4ca5, lsl #16
    csel     w8, w21, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    adrp     x8, #0x4c1000
    add      x9, x8, #0x928
    adrp     x8, #0x546000
    add      x8, x8, #0x720
    stp      x8, x9, [sp, #0x28]
    b        #0x306d34
    cmp      w8, w21
    b.eq     #0x3071d8
    mov      w9, #0xa43e
    movk     w9, #0x2225, lsl #16
    cmp      w8, w9
    b.ne     #0x306d34
    ldurb    w8, [x29, #-0x5d]
    cmp      w8, #0
    mov      w8, #0x46a7
    movk     w8, #0x8824, lsl #16
    csel     w8, w8, w22, ne
    b        #0x3071cc
    mov      w9, #0x3c98
    movk     w9, #0x84e9, lsl #16
    cmp      w8, w9
    b.eq     #0x307208
    mov      w9, #0x46a7
    movk     w9, #0x8824, lsl #16
    cmp      w8, w9
    b.ne     #0x306d34
    adrp     x9, #0x546000
    add      x9, x9, #0x668
    ldrh     w8, [x9]
    mov      w10, #0xada7
    eor      w8, w8, w10
    adrp     x10, #0x546000
    add      x10, x10, #0x674
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0x6f83
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0x526b
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w11, #0x622c
    eor      w8, w8, w11
    strh     w8, [x10, #6]
    ldrh     w8, [x9, #8]
    mov      w9, #0x11d
    eor      w8, w8, w9
    sturh    w8, [x29, #-0x60]
    ldr      x8, [sp, #8]
    mov      w9, #0xbe8b
    movk     w9, #0x357f, lsl #16
    str      w9, [x8]
    b        #0x306d34
    mov      w9, #0x6520
    movk     w9, #0xb434, lsl #16
    cmp      w8, w9
    b.eq     #0x30722c
    mov      w9, #0x75c9
    movk     w9, #0xb43b, lsl #16
    cmp      w8, w9
    b.ne     #0x306d34
    ldr      x8, [sp, #0x40]
    cmp      x8, #3
    cset     w8, eq
    strb     w8, [sp, #0x3f]
    ldr      x8, [sp, #8]
    mov      w9, #0x8679
    movk     w9, #0xaab6, lsl #16
    str      w9, [x8]
    b        #0x306d34
    mov      w9, #0xbe8b
    movk     w9, #0x357f, lsl #16
    cmp      w8, w9
    b.eq     #0x3072bc
    mov      w9, #0xad8f
    movk     w9, #0x359c, lsl #16
    cmp      w8, w9
    b.ne     #0x306d34
    ldr      x21, [sp, #0x20]
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x5a0]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x8f8]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x21, x0
    adrp     x8, #0x4c0000
    ldr      x22, [x8, #0x628]
    mov      x0, x19
    mov      x1, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xd48]
    mov      x2, x21
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    mov      w23, #0x59d8
    movk     w23, #0xd4bb, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x21
    mov      w21, #0x78b2
    movk     w21, #0x14e, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x910]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    str      w23, [x8]
    str      x22, [sp, #0x18]
    mov      w22, #0xcf95
    movk     w22, #0x53ae, lsl #16
    b        #0x306d34
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x9d8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x628]
    str      x1, [sp, #0x68]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x60]
    ldr      x8, [sp, #8]
    mov      w9, #0x7c5b
    movk     w9, #0xbda7, lsl #16
    str      w9, [x8]
    b        #0x306d34
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xd48]
    str      x8, [sp, #0x58]
    ldr      x8, [sp, #8]
    mov      w9, #0x6520
    movk     w9, #0xb434, lsl #16
    str      w9, [x8]
    b        #0x306d34
    ldr      x1, [sp, #0x70]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x40]
    ldr      x8, [sp, #8]
    mov      w9, #0x75c9
    movk     w9, #0xb43b, lsl #16
    str      w9, [x8]
    b        #0x306d34
    ldrb     w8, [sp, #0x3f]
    cmp      w8, #0
    mov      w8, #0xad8f
    movk     w8, #0x359c, lsl #16
    csel     w8, w21, w8, ne
    ldr      x9, [sp, #8]
    str      w8, [x9]
    adrp     x8, #0x4c1000
    add      x9, x8, #0x940
    adrp     x8, #0x546000
    add      x8, x8, #0x6e0
    stp      x8, x9, [sp, #0x28]
    adrp     x8, #0x546000
    add      x8, x8, #0x6a0
    str      x8, [sp, #0x20]
    b        #0x306d34
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x920]
    ldr      x2, [sp, #0x78]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x938]
    str      x1, [sp, #0x70]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #2
    mov      w8, #0x475d
    movk     w8, #0x9f27, lsl #16
    mov      w9, #0x9ed
    movk     w9, #0xd3d0, lsl #16
    csel     w8, w8, w9, eq
    ldr      x9, [sp, #8]
    str      w8, [x9]
    b        #0x306d34
    ldp      x21, x8, [sp, #0x28]
    ldr      x1, [x8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    mov      w9, #0xad8f
    movk     w9, #0x359c, lsl #16
    str      w9, [x8]
    str      x21, [sp, #0x20]
    mov      w21, #0x78b2
    movk     w21, #0x14e, lsl #16
    b        #0x306d34
    ldur     w8, [x29, #-0x5c]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x5d]
    ldr      x8, [sp, #8]
    mov      w9, #0xa43e
    movk     w9, #0x2225, lsl #16
    str      w9, [x8]
    b        #0x306d34
    ldp      x1, x0, [sp, #0x58]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [sp, #0x60]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w23, [x8]
    ldr      x8, [sp, #0x68]
    str      x8, [sp, #0x18]
    b        #0x306d34
    ldurh    w8, [x29, #-0x62]
    mov      w9, #0xccfd
    eor      w8, w8, w9
    adrp     x9, #0x546000
    add      x9, x9, #0x650
    strh     w8, [x9]
    adrp     x8, #0x546000
    ldrh     w8, [x8, #0x648]
    mov      w10, #0x4b0a
    eor      w8, w8, w10
    strh     w8, [x9, #2]
    ldr      x8, [sp, #8]
    str      w22, [x8]
    b        #0x306d34
    adrp     x8, #0x580000
    add      x8, x8, #0x894
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0xd08]
    stur     x8, [x29, #-0x70]
    ldr      x8, [sp, #8]
    mov      w9, #0xe492
    movk     w9, #0xab60, lsl #16
    str      w9, [x8]
    b        #0x306d34
    ldurh    w8, [x29, #-0x60]
    adrp     x9, #0x546000
    add      x9, x9, #0x67c
    strh     w8, [x9]
    adrp     x8, #0x546000
    ldrh     w8, [x8, #0x672]
    mov      w10, #0xd3dc
    eor      w8, w8, w10
    strh     w8, [x9, #2]
    ldrh     w8, [x28]
    mov      w9, #0xa1f4
    eor      w8, w8, w9
    strh     w8, [x25]
    ldrh     w8, [x28, #2]
    mov      w9, #0x2b
    eor      w8, w8, w9
    strh     w8, [x25, #2]
    ldrh     w8, [x28, #4]
    mov      w9, #0x33d
    eor      w8, w8, w9
    strh     w8, [x25, #4]
    ldrh     w8, [x28, #6]
    mov      w9, #0xe054
    eor      w8, w8, w9
    strh     w8, [x25, #6]
    ldrh     w8, [x28, #8]
    mov      w9, #0x5cbb
    eor      w8, w8, w9
    strh     w8, [x25, #8]
    adrp     x9, #0x546000
    add      x9, x9, #0x640
    ldrh     w8, [x9]
    mov      w10, #0x7871
    eor      w8, w8, w10
    adrp     x11, #0x546000
    add      x11, x11, #0x64a
    strh     w8, [x11]
    ldrh     w8, [x9, #2]
    mov      w10, #0xb99d
    eor      w8, w8, w10
    strh     w8, [x11, #2]
    ldrh     w8, [x9, #4]
    mov      w10, #0x9f39
    eor      w8, w8, w10
    strh     w8, [x11, #4]
    ldrh     w8, [x9, #6]
    sturh    w8, [x29, #-0x62]
    ldr      x8, [sp, #8]
    mov      w9, #0x3880
    movk     w9, #0xed17, lsl #16
    str      w9, [x8]
    b        #0x306d34
    cmp      w8, w23
    b.ne     #0x306d34
    ldr      x1, [sp, #0x18]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x19, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x488]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x19
    ldp      x29, x30, [sp, #0xf0]
    ldp      x20, x19, [sp, #0xe0]
    ldp      x22, x21, [sp, #0xd0]
    ldp      x24, x23, [sp, #0xc0]
    ldp      x26, x25, [sp, #0xb0]
    ldp      x28, x27, [sp, #0xa0]
    add      sp, sp, #0x100
    b        #0x461c9c // _objc_release

// -[WCLGGroupMemberPicker updateDoneTitle] IMP=0x3073DC bounds=0x3073DC-0x30795C
loc_3073DC:
    sub      sp, sp, #0xf0
    stp      x28, x27, [sp, #0x90]
    stp      x26, x25, [sp, #0xa0]
    stp      x24, x23, [sp, #0xb0]
    stp      x22, x21, [sp, #0xc0]
    stp      x20, x19, [sp, #0xd0]
    stp      x29, x30, [sp, #0xe0]
    add      x29, sp, #0xe0
    mov      x19, x0
    mov      w21, #0xe6ec
    movk     w21, #0x5c33, lsl #16
    mov      w22, #0xf68b
    movk     w22, #0x5294, lsl #16
    mov      w23, #0xdd9d
    movk     w23, #0x2264, lsl #16
    adrp     x8, #0x580000
    add      x8, x8, #0x898
    ldar     w8, [x8]
    stur     w8, [x29, #-0x54]
    mov      w8, #0xcc07
    movk     w8, #0x60f1, lsl #16
    str      w8, [sp, #0x1c]
    add      x8, sp, #0x1c
    str      x8, [sp, #0x10]
    mov      w27, #0xdd9c
    movk     w27, #0x2264, lsl #16
    mov      w20, #0x7c6a
    movk     w20, #0xd342, lsl #16
    mov      w24, #0xb923
    movk     w24, #0x5a46, lsl #16
    mov      w28, #0xcc06
    movk     w28, #0x60f1, lsl #16
    adrp     x25, #0x546000
    add      x25, x25, #0x75e
    adrp     x26, #0x546000
    add      x26, x26, #0x750
    ldr      w8, [sp, #0x1c]
    cmp      w8, w27
    b.gt     #0x3074e8
    cmp      w8, w20
    b.le     #0x3075ac
    mov      w9, #0xc16e
    movk     w9, #0xe8bc, lsl #16
    cmp      w8, w9
    b.le     #0x3075fc
    mov      w9, #0xc16f
    movk     w9, #0xe8bc, lsl #16
    cmp      w8, w9
    b.eq     #0x30775c
    mov      w9, #0x41de
    movk     w9, #0x1db6, lsl #16
    cmp      w8, w9
    b.ne     #0x30792c
    ldurh    w8, [x29, #-0x5a]
    mov      w9, #0x4fb9
    eor      w8, w8, w9
    adrp     x9, #0x546000
    add      x9, x9, #0x748
    strh     w8, [x9]
    adrp     x8, #0x546000
    ldrh     w8, [x8, #0x744]
    mov      w10, #0x4030
    eor      w8, w8, w10
    strh     w8, [x9, #2]
    ldr      x8, [sp, #0x10]
    str      w21, [x8]
    b        #0x30746c
    cmp      w8, w24
    b.gt     #0x307540
    mov      w9, #0xadce
    movk     w9, #0x385c, lsl #16
    cmp      w8, w9
    b.gt     #0x307638
    cmp      w8, w23
    b.eq     #0x3077c8
    mov      w9, #0x2431
    movk     w9, #0x308c, lsl #16
    cmp      w8, w9
    b.ne     #0x30746c
    ldp      x1, x0, [sp, #0x68]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    cset     w8, eq
    strb     w8, [sp, #0x67]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x7c6b
    movk     w9, #0xd342, lsl #16
    str      w9, [x8]
    b        #0x30746c
    cmp      w8, w28
    b.gt     #0x3076e0
    mov      w9, #0xb924
    movk     w9, #0x5a46, lsl #16
    cmp      w8, w9
    b.eq     #0x3077e4
    cmp      w8, w21
    b.ne     #0x30746c
    adrp     x8, #0x580000
    add      x8, x8, #0x898
    mov      w9, #1
    stlr     w9, [x8]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x950]
    stur     x1, [x29, #-0x68]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x600]
    stp      x8, x0, [sp, #0x68]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x2431
    movk     w9, #0x308c, lsl #16
    str      w9, [x8]
    b        #0x30746c
    mov      w9, #0xa939
    movk     w9, #0x9618, lsl #16
    cmp      w8, w9
    b.gt     #0x307724
    mov      w9, #0x25e0
    movk     w9, #0x8592, lsl #16
    cmp      w8, w9
    b.eq     #0x307904
    mov      w9, #0xaad4
    movk     w9, #0x9561, lsl #16
    cmp      w8, w9
    b.ne     #0x30746c
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0xb8]
    str      x8, [sp, #0x58]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xb924
    movk     w9, #0x5a46, lsl #16
    str      w9, [x8]
    b        #0x30746c
    mov      w9, #0x7c6b
    movk     w9, #0xd342, lsl #16
    cmp      w8, w9
    b.eq     #0x30779c
    mov      w9, #0xec02
    movk     w9, #0xdab9, lsl #16
    cmp      w8, w9
    b.ne     #0x30746c
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    mov      w9, #0x25e0
    movk     w9, #0x8592, lsl #16
    str      w9, [x8]
    b        #0x30746c
    mov      w9, #0xadcf
    movk     w9, #0x385c, lsl #16
    cmp      w8, w9
    b.eq     #0x307844
    cmp      w8, w22
    b.ne     #0x30746c
    ldp      x21, x9, [sp, #0x30]
    ldr      x8, [sp, #0x40]
    stp      x8, x9, [sp, #0x20]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xbb0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x22, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x370]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x23, x0
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb80]
    mov      x2, x21
    mov      w21, #0xe6ec
    movk     w21, #0x5c33, lsl #16
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x23
    mov      w23, #0xdd9d
    movk     w23, #0x2264, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    mov      w22, #0xf68b
    movk     w22, #0x5294, lsl #16
    bl       #0x461c9c // _objc_release
    ldrb     w8, [sp, #0x67]
    cmp      w8, #0
    mov      w8, #0xa93a
    movk     w8, #0x9618, lsl #16
    csel     w8, w23, w8, ne
    b        #0x307858
    mov      w9, #0xeb1c
    movk     w9, #0x783f, lsl #16
    cmp      w8, w9
    b.eq     #0x307864
    mov      w9, #0xcc07
    movk     w9, #0x60f1, lsl #16
    cmp      w8, w9
    b.ne     #0x30746c
    ldur     w8, [x29, #-0x54]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x55]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xadcf
    movk     w9, #0x385c, lsl #16
    str      w9, [x8]
    b        #0x30746c
    mov      w9, #0xa93a
    movk     w9, #0x9618, lsl #16
    cmp      w8, w9
    b.eq     #0x307910
    mov      w9, #0x652f
    movk     w9, #0xc2ea, lsl #16
    cmp      w8, w9
    b.ne     #0x30746c
    ldr      x8, [sp, #0x10]
    str      w22, [x8]
    ldp      x9, x8, [sp, #0x48]
    stp      x9, x8, [sp, #0x38]
    str      x9, [sp, #0x30]
    b        #0x30746c
    adrp     x9, #0x546000
    add      x9, x9, #0x74c
    ldrh     w8, [x9]
    mov      w10, #0x4e2f
    eor      w8, w8, w10
    adrp     x10, #0x546000
    strh     w8, [x10, #0x75c]
    ldrh     w8, [x9, #2]
    mov      w9, #0x40f
    eor      w8, w8, w9
    sturh    w8, [x29, #-0x58]
    ldr      x8, [sp, #0x10]
    mov      w9, #0xeb1c
    movk     w9, #0x783f, lsl #16
    str      w9, [x8]
    b        #0x30746c
    ldrb     w8, [sp, #0x67]
    cmp      w8, #0
    mov      w8, #0xaad4
    movk     w8, #0x9561, lsl #16
    csel     w8, w22, w8, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    adrp     x8, #0x546000
    add      x8, x8, #0x790
    str      x8, [sp, #0x30]
    b        #0x30746c
    ldr      x0, [sp, #0x70]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    mov      w9, #0xe201
    movk     w9, #0xf687, lsl #16
    str      w9, [x8]
    b        #0x30746c
    ldur     x1, [x29, #-0x68]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x50]
    ldr      x1, [sp, #0x68]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    ldr      x8, [sp, #0x58]
    str      x0, [sp]
    mov      x0, x8
    adrp     x2, #0x546000
    add      x2, x2, #0x7d0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x48]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x652f
    movk     w9, #0xc2ea, lsl #16
    str      w9, [x8]
    b        #0x30746c
    ldurb    w8, [x29, #-0x55]
    cmp      w8, #0
    mov      w8, #0xc16f
    movk     w8, #0xe8bc, lsl #16
    csel     w8, w8, w21, ne
    ldr      x9, [sp, #0x10]
    str      w8, [x9]
    b        #0x30746c
    ldurh    w8, [x29, #-0x58]
    strh     w8, [x25]
    ldrh     w8, [x26]
    mov      w9, #0xb791
    eor      w8, w8, w9
    strh     w8, [x25, #2]
    ldrh     w8, [x26, #2]
    mov      w9, #0xde5f
    eor      w8, w8, w9
    strh     w8, [x25, #4]
    ldrh     w8, [x26, #4]
    mov      w9, #0x7d2b
    eor      w8, w8, w9
    strh     w8, [x25, #6]
    ldrh     w8, [x26, #6]
    mov      w9, #0x442
    eor      w8, w8, w9
    strh     w8, [x25, #8]
    ldrh     w8, [x26, #8]
    mov      w9, #0xb299
    eor      w8, w8, w9
    strh     w8, [x25, #0xa]
    ldrh     w8, [x26, #0xa]
    mov      w9, #0xb5d2
    eor      w8, w8, w9
    strh     w8, [x25, #0xc]
    adrp     x10, #0x546000
    add      x10, x10, #0x740
    ldrh     w8, [x10]
    mov      w9, #0x7867
    eor      w8, w8, w9
    adrp     x9, #0x546000
    strh     w8, [x9, #0x746]
    ldrh     w8, [x10, #2]
    sturh    w8, [x29, #-0x5a]
    ldr      x8, [sp, #0x10]
    mov      w9, #0x41de
    movk     w9, #0x1db6, lsl #16
    str      w9, [x8]
    b        #0x30746c
    ldr      x8, [sp, #0x10]
    str      w23, [x8]
    b        #0x30746c
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x10]
    mov      w9, #0xec02
    movk     w9, #0xdab9, lsl #16
    str      w9, [x8]
    b        #0x30746c
    mov      w9, #0xe201
    movk     w9, #0xf687, lsl #16
    cmp      w8, w9
    b.ne     #0x30746c
    ldp      x29, x30, [sp, #0xe0]
    ldp      x20, x19, [sp, #0xd0]
    ldp      x22, x21, [sp, #0xc0]
    ldp      x24, x23, [sp, #0xb0]
    ldp      x26, x25, [sp, #0xa0]
    ldp      x28, x27, [sp, #0x90]
    add      sp, sp, #0xf0
    ret      

// -[WCLGGroupMemberPicker onCancel] IMP=0x30795C bounds=0x30795C-0x3079E8
loc_30795C:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x0
    adrp     x8, #0x4bf000
    ldr      x8, [x8, #0xb38]
    str      x8, [sp, #0x18]
    mov      w20, #0x2710
    movk     w20, #0xe3f3, lsl #16
    str      w20, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w21, #0xf23b
    movk     w21, #0x2bbf, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w20
    b.eq     #0x3079b4
    cmp      w8, w21
    b.ne     #0x30799c
    b        #0x3079d4
    ldr      x1, [sp, #0x18]
    mov      x0, x19
    mov      w2, #1
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x30799c
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    ret      

// -[WCLGGroupMemberPicker onDone] IMP=0x3079E8 bounds=0x3079E8-0x307B50
loc_3079E8:
    sub      sp, sp, #0xa0
    stp      x24, x23, [sp, #0x60]
    stp      x22, x21, [sp, #0x70]
    stp      x20, x19, [sp, #0x80]
    stp      x29, x30, [sp, #0x90]
    add      x29, sp, #0x90
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x9e0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x28]
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x950]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xa80]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x20]
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp, #0x30]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    adrp     x8, #0x307000
    add      x8, x8, #0xb50
    str      d0, [sp, #0x38]
    adrp     x9, #0x4a1000
    add      x9, x9, #0xba0
    stp      x8, x9, [sp, #0x40]
    add      x8, sp, #0x30
    add      x10, x8, #0x28
    ldr      x9, [sp, #0x28]
    str      x9, [sp, #0x58]
    add      x8, x8, #0x20
    stp      x8, x10, [sp, #0x10]
    mov      w21, #0x9f80
    movk     w21, #0xb3bf, lsl #16
    str      w21, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    adrp     x22, #0x4bf000
    mov      w23, #0x2d45
    movk     w23, #0x3778, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w21
    b.eq     #0x307ad4
    cmp      w8, w23
    b.ne     #0x307abc
    b        #0x307b30
    ldr      x0, [sp, #0x20]
    ldr      x8, [sp, #0x10]
    str      x0, [x8]
    ldr      x20, [x22, #0xb38]
    bl       #0x461ca8 // _objc_retain
    ldr      x0, [sp, #0x28]
    bl       #0x461ca8 // _objc_retain
    add      x3, sp, #0x30
    mov      x0, x19
    mov      x1, x20
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #0x10]
    ldr      x0, [x8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #0x18]
    ldr      x0, [x8]
    bl       #0x461c9c // _objc_release
    ldr      x0, [sp, #0x20]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    str      w23, [x8]
    b        #0x307abc
    ldr      x0, [sp, #0x28]
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x90]
    ldp      x20, x19, [sp, #0x80]
    ldp      x22, x21, [sp, #0x70]
    ldp      x24, x23, [sp, #0x60]
    add      sp, sp, #0xa0
    ret      

// -[WCLGGroupMemberPicker searchBar:textDidChange:] IMP=0x307C9C bounds=0x307C9C-0x307D30
loc_307C9C:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x2, x3
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x9e8]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x910]
    str      x8, [sp, #0x18]
    mov      w20, #0x8a26
    movk     w20, #0x879b, lsl #16
    str      w20, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w21, #0x4d89
    movk     w21, #0x7c83, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w20
    b.eq     #0x307d04
    cmp      w8, w21
    b.ne     #0x307cec
    b        #0x307d1c
    ldr      x1, [sp, #0x18]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x307cec
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    ret      

// -[WCLGGroupMemberPicker searchBarSearchButtonClicked:] IMP=0x307D30 bounds=0x307D30-0x307DB4
loc_307D30:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0xd48]
    str      x8, [sp, #0x18]
    mov      w20, #0x534f
    movk     w20, #0xdcb1, lsl #16
    str      w20, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w21, #0x4882
    movk     w21, #0xd79c, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w20
    b.eq     #0x307d88
    cmp      w8, w21
    b.ne     #0x307d70
    b        #0x307da0
    ldr      x1, [sp, #0x18]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x307d70
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    ret      

// -[WCLGGroupMemberPicker tableView:numberOfRowsInSection:] IMP=0x307DB4 bounds=0x307DB4-0x307E74
loc_307DB4:
    sub      sp, sp, #0x40
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x938]
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    add      x8, x8, #0x9f0
    adrp     x9, #0x4c1000
    add      x9, x9, #0x9f8
    cmp      x0, #2
    csel     x8, x8, x9, eq
    ldr      x1, [x8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x18]
    mov      w8, #0x1490
    movk     w8, #0xdac3, lsl #16
    str      w8, [sp, #0x14]
    add      x9, sp, #0x14
    str      x9, [sp, #8]
    mov      w9, #0xc4e1
    movk     w9, #0xfc7c, lsl #16
    ldr      w10, [sp, #0x14]
    cmp      w10, w8
    b.eq     #0x307e38
    cmp      w10, w9
    b.ne     #0x307e20
    b        #0x307e44
    ldr      x10, [sp, #8]
    str      w9, [x10]
    b        #0x307e20
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    ldr      x0, [sp, #0x18]
    bl       #0x461c6c // _objc_msgSend
    mov      x19, x0
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    add      sp, sp, #0x40
    ret      

// -[WCLGGroupMemberPicker tableView:cellForRowAtIndexPath:] IMP=0x307E74 bounds=0x307E74-0x309944
loc_307E74:
    stp      x28, x27, [sp, #-0x60]!
    stp      x26, x25, [sp, #0x10]
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    sub      sp, sp, #0x240
    mov      x19, sp
    mov      x26, x3
    str      x2, [x19, #8]
    mov      x23, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    mov      w20, #0x3d2e
    movk     w20, #0xf18e, lsl #16
    stur     x8, [x29, #-0x60]
    mov      w27, #0x84b7
    movk     w27, #0xea2f, lsl #16
    mov      w25, #0xa46
    movk     w25, #0x579f, lsl #16
    adrp     x8, #0x580000
    add      x8, x8, #0x8bc
    ldar     w8, [x8]
    stur     w8, [x29, #-0x64]
    mov      w8, #0xa9b0
    movk     w8, #0xe824, lsl #16
    str      w8, [x19, #0x1c]
    add      x8, x19, #0x1c
    str      x8, [x19, #0x10]
    mov      w28, #0x5e73
    movk     w28, #0xfcca, lsl #16
    mov      w21, #0xd5a3
    movk     w21, #0xbdb1, lsl #16
    mov      w24, #0x9e82
    movk     w24, #0x94e0, lsl #16
    mov      w22, #0xb69c
    movk     w22, #0x50ae, lsl #16
    ldr      w8, [x19, #0x1c]
    cmp      w8, w28
    b.le     #0x307fac
    cmp      w8, w22
    b.gt     #0x30802c
    mov      w9, #0x55bb
    movk     w9, #0xbff, lsl #16
    cmp      w8, w9
    b.le     #0x308148
    mov      w9, #0xc87d
    movk     w9, #0x30c5, lsl #16
    cmp      w8, w9
    b.gt     #0x308328
    mov      w9, #0xbcd2
    movk     w9, #0x12de, lsl #16
    cmp      w8, w9
    b.le     #0x308a14
    mov      w9, #0xbcd3
    movk     w9, #0x12de, lsl #16
    cmp      w8, w9
    b.eq     #0x309304
    mov      w9, #0x3704
    movk     w9, #0x1ae7, lsl #16
    cmp      w8, w9
    b.eq     #0x309588
    mov      w9, #0xed30
    movk     w9, #0x25a0, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    adrp     x8, #0x580000
    ldr      x9, [x8, #0x858]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x9e8]
    stp      x8, x9, [x19, #0xa8]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x3342
    movk     w9, #0xa48, lsl #16
    str      w9, [x8]
    b        #0x307f10
    cmp      w8, w21
    b.gt     #0x3080c8
    cmp      w8, w24
    b.le     #0x308228
    mov      w9, #0x1ab6
    movk     w9, #0xa7f5, lsl #16
    cmp      w8, w9
    b.gt     #0x3083c8
    mov      w9, #0xb260
    movk     w9, #0x9c59, lsl #16
    cmp      w8, w9
    b.le     #0x308adc
    mov      w9, #0xb261
    movk     w9, #0x9c59, lsl #16
    cmp      w8, w9
    b.eq     #0x309498
    mov      w9, #0xe98a
    movk     w9, #0xa0d3, lsl #16
    cmp      w8, w9
    b.eq     #0x3096a0
    mov      w9, #0xe423
    movk     w9, #0xa3fa, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xa08]
    str      x8, [x19, #0x68]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xc8ec
    movk     w9, #0xe251, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      w9, #0xb56b
    movk     w9, #0x6aed, lsl #16
    cmp      w8, w9
    b.le     #0x3081bc
    mov      w9, #0xec6b
    movk     w9, #0x73bf, lsl #16
    cmp      w8, w9
    b.gt     #0x308524
    mov      w9, #0x2f89
    movk     w9, #0x6db4, lsl #16
    cmp      w8, w9
    b.le     #0x308c28
    mov      w9, #0x2f8a
    movk     w9, #0x6db4, lsl #16
    cmp      w8, w9
    b.eq     #0x3095c0
    mov      w9, #0x2fee
    movk     w9, #0x6dc0, lsl #16
    cmp      w8, w9
    b.eq     #0x309778
    mov      w9, #0x3d30
    movk     w9, #0x7026, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldr      x0, [x19, #0x130]
    ldr      x1, [x19, #0x110]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    cset     w8, eq
    strb     w8, [x19, #0xa7]
    ldr      x8, [x19, #0x138]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [x19, #0xa6]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xb05d
    movk     w9, #0x63e4, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      w9, #0xa9af
    movk     w9, #0xe824, lsl #16
    cmp      w8, w9
    b.le     #0x308294
    mov      w9, #0x3d2d
    movk     w9, #0xf18e, lsl #16
    cmp      w8, w9
    b.gt     #0x3084d0
    mov      w9, #0x84b6
    movk     w9, #0xea2f, lsl #16
    cmp      w8, w9
    b.le     #0x308b48
    cmp      w8, w27
    b.eq     #0x3094c0
    mov      w9, #0xa31e
    movk     w9, #0xed67, lsl #16
    cmp      w8, w9
    b.eq     #0x3096dc
    mov      w9, #0x865
    movk     w9, #0xefc6, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldrb     w8, [x19, #0xcf]
    cmp      w8, #0
    mov      w8, #0xfa07
    movk     w8, #0x7b9b, lsl #16
    csel     w8, w25, w8, ne
    ldr      x9, [x19, #0x10]
    str      w8, [x9]
    ldr      x8, [x19, #0xe8]
    str      x8, [x19, #0x40]
    b        #0x307f10
    mov      w9, #0x7db7
    movk     w9, #0x752, lsl #16
    cmp      w8, w9
    b.gt     #0x308594
    mov      w9, #0x16c
    movk     w9, #0x3b2, lsl #16
    cmp      w8, w9
    b.le     #0x308a94
    mov      w9, #0x16d
    movk     w9, #0x3b2, lsl #16
    cmp      w8, w9
    b.eq     #0x309438
    mov      w9, #0x37f7
    movk     w9, #0x47b, lsl #16
    cmp      w8, w9
    b.eq     #0x309654
    mov      w9, #0x141d
    movk     w9, #0x5c0, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldr      x8, [x19, #0x160]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [x19, #0x15f]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x2934
    movk     w9, #0x93c, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      w9, #0xa45
    movk     w9, #0x579f, lsl #16
    cmp      w8, w9
    b.gt     #0x3085f4
    mov      w9, #0x4d55
    movk     w9, #0x5371, lsl #16
    cmp      w8, w9
    b.le     #0x3089a4
    mov      w9, #0x4d56
    movk     w9, #0x5371, lsl #16
    cmp      w8, w9
    b.eq     #0x309088
    mov      w9, #0xba9d
    movk     w9, #0x559d, lsl #16
    cmp      w8, w9
    b.eq     #0x309468
    mov      w9, #0x14c6
    movk     w9, #0x5624, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldr      x0, [x19, #0x108]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x10]
    mov      w9, #0x1ab7
    movk     w9, #0xa7f5, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      w9, #0xc0c4
    movk     w9, #0x8e0f, lsl #16
    cmp      w8, w9
    b.le     #0x308644
    mov      w9, #0xe1a6
    movk     w9, #0x8ec4, lsl #16
    cmp      w8, w9
    b.le     #0x308878
    mov      w9, #0xe1a7
    movk     w9, #0x8ec4, lsl #16
    cmp      w8, w9
    b.eq     #0x308cd8
    mov      w9, #0xf2f1
    movk     w9, #0x8f29, lsl #16
    cmp      w8, w9
    b.eq     #0x308f98
    mov      w9, #0xd7ab
    movk     w9, #0x9385, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldur     x0, [x29, #-0xc8]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x19, #0x10]
    mov      w9, #0xc87e
    movk     w9, #0x30c5, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      w9, #0x3700
    movk     w9, #0xce9c, lsl #16
    cmp      w8, w9
    b.le     #0x3087d4
    mov      w9, #0x7b2c
    movk     w9, #0xdb28, lsl #16
    cmp      w8, w9
    b.le     #0x3088b8
    mov      w9, #0x7b2d
    movk     w9, #0xdb28, lsl #16
    cmp      w8, w9
    b.eq     #0x308d84
    mov      w9, #0x5976
    movk     w9, #0xde2c, lsl #16
    cmp      w8, w9
    b.eq     #0x308fac
    mov      w9, #0xc8ec
    movk     w9, #0xe251, lsl #16
    cmp      w8, w9
    mov      w24, #0x9e82
    movk     w24, #0x94e0, lsl #16
    b.ne     #0x307f10
    ldr      x2, [x19, #0x138]
    ldp      x1, x0, [x19, #0x68]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #3
    csel     x2, x8, xzr, ne
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x828]
    ldr      x0, [x19, #0x30]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #0x10]
    str      w20, [x8]
    ldr      x8, [x19, #0x70]
    str      x8, [x19, #0x38]
    b        #0x307f10
    mov      w9, #0x7c06
    movk     w9, #0x3909, lsl #16
    cmp      w8, w9
    b.le     #0x308a58
    mov      w9, #0x7c07
    movk     w9, #0x3909, lsl #16
    cmp      w8, w9
    b.eq     #0x309320
    mov      w9, #0x2dd1
    movk     w9, #0x3b28, lsl #16
    cmp      w8, w9
    b.eq     #0x3095a4
    mov      w9, #0x6756
    movk     w9, #0x453c, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldr      x0, [x19, #0x88]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x440]
    ldrb     w2, [x19, #0x96]
    ldr      x0, [x19, #0x30]
    bl       #0x461c6c // _objc_msgSend
    ldrb     w8, [x19, #0x97]
    cmp      w8, #0
    adrp     x8, #0x546000
    add      x8, x8, #0x880
    csel     x8, x8, xzr, ne
    str      x8, [x19, #0x80]
    ldr      x1, [x19, #0x118]
    ldr      x0, [x19, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x78]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x6a90
    movk     w9, #0x8e7c, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      w9, #0xa765
    movk     w9, #0xb222, lsl #16
    cmp      w8, w9
    b.le     #0x308b98
    mov      w9, #0xa766
    movk     w9, #0xb222, lsl #16
    cmp      w8, w9
    b.eq     #0x3094f0
    mov      w9, #0xe8ed
    movk     w9, #0xbaed, lsl #16
    cmp      w8, w9
    b.eq     #0x309708
    mov      w9, #0x771e
    movk     w9, #0xbc3a, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldr      x0, [x19, #0x60]
    str      x0, [x19, #0x30]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb90]
    stur     x1, [x29, #-0xa8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xac8]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xb48]
    fmov     d0, #20.00000000
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    mov      w25, #0xa46
    movk     w25, #0x579f, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldur     x1, [x29, #-0xa8]
    ldr      x0, [x19, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x438]
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    mov      w24, #0x9e82
    movk     w24, #0x94e0, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x938]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #2
    mov      w8, #0x4d56
    movk     w8, #0x5371, lsl #16
    mov      w9, #0xb56c
    movk     w9, #0x6aed, lsl #16
    csel     w8, w9, w8, eq
    b        #0x30976c
    mov      w9, #0xb083
    movk     w9, #0xf365, lsl #16
    cmp      w8, w9
    b.le     #0x308bd8
    mov      w9, #0xb084
    movk     w9, #0xf365, lsl #16
    cmp      w8, w9
    b.eq     #0x309538
    mov      w9, #0x72f6
    movk     w9, #0xf4d2, lsl #16
    cmp      w8, w9
    b.eq     #0x309750
    mov      w9, #0x3f8a
    movk     w9, #0xf8db, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldr      x8, [x19, #0x10]
    str      w25, [x8]
    ldr      x8, [x19, #0xc0]
    str      x8, [x19, #0x40]
    b        #0x307f10
    mov      w9, #0xc191
    movk     w9, #0x77ab, lsl #16
    cmp      w8, w9
    b.le     #0x308c88
    mov      w9, #0xc192
    movk     w9, #0x77ab, lsl #16
    cmp      w8, w9
    b.eq     #0x3095ec
    mov      w9, #0x395d
    movk     w9, #0x79d9, lsl #16
    cmp      w8, w9
    b.eq     #0x308cc4
    mov      w9, #0xfa07
    movk     w9, #0x7b9b, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldr      x0, [x19, #0x138]
    mov      x8, #0x4044000000000000
    fmov     d0, x8
    bl       #0x37fe38
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0xc0]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x722e
    movk     w9, #0xf206, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      w9, #0xd909
    movk     w9, #0x9b5, lsl #16
    cmp      w8, w9
    b.gt     #0x30882c
    mov      w9, #0x7db8
    movk     w9, #0x752, lsl #16
    cmp      w8, w9
    b.eq     #0x3092c0
    mov      w9, #0x2934
    movk     w9, #0x93c, lsl #16
    cmp      w8, w9
    b.ne     #0x3098cc
    ldrb     w8, [x19, #0x15f]
    cmp      w8, #0
    mov      w8, #0x254f
    movk     w8, #0xd1ff, lsl #16
    mov      w9, #0xba9d
    movk     w9, #0x559d, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [x19, #0x10]
    str      w8, [x9]
    ldr      x8, [x19, #0x160]
    str      x8, [x19, #0x58]
    b        #0x307f10
    mov      w9, #0xb05c
    movk     w9, #0x63e4, lsl #16
    cmp      w8, w9
    b.le     #0x308900
    mov      w9, #0xb05d
    movk     w9, #0x63e4, lsl #16
    cmp      w8, w9
    b.eq     #0x308f28
    mov      w9, #0x8f85
    movk     w9, #0x6819, lsl #16
    cmp      w8, w9
    b.ne     #0x3098f4
    ldr      x8, [x19, #0x20]
    add      x8, x8, #1
    str      x8, [x19, #0x170]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xb69d
    movk     w9, #0x50ae, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      w9, #0x2b4c
    movk     w9, #0x8bf4, lsl #16
    cmp      w8, w9
    b.gt     #0x308934
    mov      w9, #0xc5d2
    movk     w9, #0x869e, lsl #16
    cmp      w8, w9
    b.eq     #0x309340
    mov      w9, #0xfcfb
    movk     w9, #0x8a92, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    adrp     x9, #0x546000
    add      x9, x9, #0x84e
    ldrb     w8, [x9]
    mov      w10, #0xf5
    eor      w8, w8, w10
    adrp     x10, #0x546000
    add      x10, x10, #0x853
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    eor      w8, w8, #0xffffffe7
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    eor      w8, w8, #0x7c
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    mov      w11, #0xb7
    eor      w8, w8, w11
    strb     w8, [x10, #3]
    ldrb     w8, [x9, #4]
    mov      w9, #0xb6
    eor      w8, w8, w9
    strb     w8, [x10, #4]
    adrp     x9, #0x546000
    add      x9, x9, #0x836
    ldrh     w8, [x9]
    mov      w10, #0x14d1
    eor      w8, w8, w10
    adrp     x10, #0x546000
    add      x10, x10, #0x842
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w12, #0xd0e2
    eor      w8, w8, w12
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w12, #0xa6ce
    eor      w8, w8, w12
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w12, #0xc14a
    eor      w8, w8, w12
    strh     w8, [x10, #6]
    ldrh     w8, [x9, #8]
    mov      w12, #0x4a22
    eor      w8, w8, w12
    strh     w8, [x10, #8]
    ldrh     w8, [x9, #0xa]
    mov      w9, #0xc295
    eor      w8, w8, w9
    strh     w8, [x10, #0xa]
    adrp     x9, #0x546000
    add      x9, x9, #0x818
    ldrb     w8, [x9]
    mov      w10, #0xac
    eor      w8, w8, w10
    adrp     x10, #0x546000
    add      x10, x10, #0x827
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w12, #0x84
    eor      w8, w8, w12
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    eor      w8, w8, w11
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    eor      w8, w8, #0x3c
    strb     w8, [x10, #3]
    ldrb     w8, [x9, #4]
    mov      w11, #0x12
    eor      w8, w8, w11
    strb     w8, [x10, #4]
    ldrb     w8, [x9, #5]
    mov      w11, #0x46
    eor      w8, w8, w11
    strb     w8, [x10, #5]
    ldrb     w8, [x9, #6]
    eor      w8, w8, #0xc0
    strb     w8, [x10, #6]
    ldrb     w8, [x9, #7]
    mov      w9, #0xc4
    eor      w8, w8, w9
    strb     w8, [x10, #7]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x3701
    movk     w9, #0xce9c, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      w9, #0x74da
    movk     w9, #0xcaa4, lsl #16
    cmp      w8, w9
    b.gt     #0x308970
    mov      w9, #0xd5a4
    movk     w9, #0xbdb1, lsl #16
    cmp      w8, w9
    b.eq     #0x308cc4
    mov      w9, #0xc51b
    movk     w9, #0xc7f2, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldur     x8, [x29, #-0xf8]
    ldr      x8, [x8]
    ldr      x9, [x19, #0x20]
    ldr      x8, [x8, x9, lsl #3]
    str      x8, [x19, #0x180]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x2fee
    movk     w9, #0x6dc0, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      w9, #0xd90a
    movk     w9, #0x9b5, lsl #16
    cmp      w8, w9
    b.eq     #0x308f74
    mov      w9, #0x3342
    movk     w9, #0xa48, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldr      x3, [x19, #0x138]
    ldr      x2, [x19, #0xc0]
    ldp      x1, x0, [x19, #0xa8]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, #0xe8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x10]
    mov      w9, #0x3f8a
    movk     w9, #0xf8db, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      w9, #0xc0c5
    movk     w9, #0x8e0f, lsl #16
    cmp      w8, w9
    b.eq     #0x309104
    mov      w9, #0x6a90
    movk     w9, #0x8e7c, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldr      x1, [x19, #0x120]
    ldp      x0, x2, [x19, #0x78]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #0x10]
    str      w20, [x8]
    ldr      x8, [x19, #0x78]
    str      x8, [x19, #0x38]
    b        #0x307f10
    mov      w9, #0x3701
    movk     w9, #0xce9c, lsl #16
    cmp      w8, w9
    b.eq     #0x309120
    mov      w9, #0x254f
    movk     w9, #0xd1ff, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldurb    w8, [x29, #-0xc9]
    cmp      w8, #0
    mov      w8, #3
    csel     x8, xzr, x8, ne
    str      x8, [x19, #0x150]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xc0c5
    movk     w9, #0x8e0f, lsl #16
    str      w9, [x8]
    b        #0x307f10
    cmp      w8, w25
    b.eq     #0x30923c
    mov      w9, #0xe6f2
    movk     w9, #0x6397, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldrb     w8, [x19, #0xf5]
    cmp      w8, #0
    mov      w8, #0x3d30
    movk     w8, #0x7026, lsl #16
    mov      w9, #0x9e83
    movk     w9, #0x94e0, lsl #16
    b        #0x30966c
    mov      w9, #0x2b4d
    movk     w9, #0x8bf4, lsl #16
    cmp      w8, w9
    b.eq     #0x309354
    mov      w9, #0xa082
    movk     w9, #0x8c83, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldr      x0, [x19, #0x30]
    bl       #0x461be8 // _objc_autoreleaseReturnValue
    ldr      x8, [x19, #0x10]
    mov      w9, #0x8efe
    movk     w9, #0x646d, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      w9, #0x74db
    movk     w9, #0xcaa4, lsl #16
    cmp      w8, w9
    b.eq     #0x309418
    mov      w9, #0xbb6c
    movk     w9, #0xcd79, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldr      x8, [x19, #0x10]
    mov      w9, #0x3d30
    movk     w9, #0x7026, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      w9, #0xb69d
    movk     w9, #0x50ae, lsl #16
    cmp      w8, w9
    b.eq     #0x309560
    mov      w9, #0x42a3
    movk     w9, #0x5191, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldur     x8, [x29, #-0x70]
    movi     v0.16b, #0
    stp      q0, q0, [x8]
    stp      q0, q0, [x8, #0x20]
    ldur     x0, [x29, #-0xc8]
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x478]
    stur     x1, [x29, #-0xd8]
    ldp      x3, x2, [x29, #-0x78]
    ldur     x0, [x29, #-0xc8]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xe0]
    cmp      x0, #0
    mov      w8, #0x254f
    movk     w8, #0xd1ff, lsl #16
    mov      w9, #0xb084
    movk     w9, #0xf365, lsl #16
    b        #0x3094e8
    mov      w9, #0x55bc
    movk     w9, #0xbff, lsl #16
    cmp      w8, w9
    b.eq     #0x309618
    mov      w9, #0x332c
    movk     w9, #0x1113, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldr      x0, [x19, #0x138]
    ldr      x1, [x19, #0x110]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    mov      w8, #0x7c07
    movk     w8, #0x3909, lsl #16
    mov      w9, #0xf2e2
    movk     w9, #0x394, lsl #16
    b        #0x3094e8
    mov      w9, #0xc87e
    movk     w9, #0x30c5, lsl #16
    cmp      w8, w9
    b.eq     #0x309640
    mov      w9, #0x10f8
    movk     w9, #0x3201, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldurb    w8, [x29, #-0x65]
    cmp      w8, #0
    mov      w8, #0xe98a
    movk     w8, #0xa0d3, lsl #16
    mov      w9, #0xfcfb
    movk     w9, #0x8a92, lsl #16
    b        #0x309768
    mov      w9, #0x5e74
    movk     w9, #0xfcca, lsl #16
    cmp      w8, w9
    b.eq     #0x309674
    mov      w9, #0xf2e2
    movk     w9, #0x394, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldr      x0, [x19, #0x138]
    bl       #0x11cf3c
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x108]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x9539
    movk     w9, #0xafce, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      w9, #0x9e83
    movk     w9, #0x94e0, lsl #16
    cmp      w8, w9
    b.eq     #0x3097a4
    mov      w9, #0x26bb
    movk     w9, #0x98ab, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    mov      x0, x26
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7d8]
    ldr      x0, [x19, #8]
    adrp     x2, #0x546000
    add      x2, x2, #0x980
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x80]
    cmp      x0, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x81]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xa7f4
    movk     w9, #0xe952, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      w9, #0xa9b0
    movk     w9, #0xe824, lsl #16
    cmp      w8, w9
    b.eq     #0x3097e4
    mov      w9, #0xa7f4
    movk     w9, #0xe952, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldurb    w8, [x29, #-0x81]
    cmp      w8, #0
    mov      w8, #0x771e
    movk     w8, #0xbc3a, lsl #16
    mov      w9, #0xc192
    movk     w9, #0x77ab, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [x19, #0x10]
    str      w8, [x9]
    ldur     x8, [x29, #-0x80]
    str      x8, [x19, #0x60]
    b        #0x307f10
    mov      w9, #0x1ab7
    movk     w9, #0xa7f5, lsl #16
    cmp      w8, w9
    b.eq     #0x309808
    mov      w9, #0x9539
    movk     w9, #0xafce, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x80]
    str      x8, [x19, #0x100]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xe8ed
    movk     w9, #0xbaed, lsl #16
    str      w9, [x8]
    b        #0x307f10
    cmp      w8, w20
    b.eq     #0x30981c
    mov      w9, #0x722e
    movk     w9, #0xf206, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x80]
    ldr      x1, [x19, #0xd8]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    ldr      x1, [x19, #0xd0]
    ldr      x0, [x19, #0xc0]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [x19, #0xbf]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x72f6
    movk     w9, #0xf4d2, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      w9, #0xb56c
    movk     w9, #0x6aed, lsl #16
    cmp      w8, w9
    b.eq     #0x309850
    mov      w9, #0xbd57
    movk     w9, #0x6d5d, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldr      x24, [x19, #0x48]
    ldur     x0, [x29, #-0xc8]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x828]
    ldr      x0, [x19, #0x30]
    mov      x2, x24
    mov      w24, #0x9e82
    movk     w24, #0x94e0, lsl #16
    bl       #0x461c6c // _objc_msgSend
    ldur     x0, [x29, #-0xc8]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xc0]
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xb8]
    b        #0x309838
    mov      w9, #0xec6c
    movk     w9, #0x73bf, lsl #16
    cmp      w8, w9
    b.eq     #0x3098b0
    mov      w9, #0xf235
    movk     w9, #0x7642, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldr      x8, [x19, #0x10]
    mov      w9, #0xba9d
    movk     w9, #0x559d, lsl #16
    str      w9, [x8]
    ldur     x8, [x29, #-0xe0]
    str      x8, [x19, #0x58]
    b        #0x307f10
    ldr      x8, [x19, #0x10]
    mov      w9, #0xb261
    movk     w9, #0x9c59, lsl #16
    str      w9, [x8]
    b        #0x307f10
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xa00]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xa08]
    ldr      x2, [x19, #0x138]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [x19, #0x97]
    mov      x0, x24
    mov      w24, #0x9e82
    movk     w24, #0x94e0, lsl #16
    bl       #0x461c9c // _objc_release
    ldrb     w8, [x19, #0x97]
    cmp      w8, #0
    mov      w8, #3
    csel     x2, x8, xzr, ne
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x828]
    ldr      x0, [x19, #0x30]
    bl       #0x461c6c // _objc_msgSend
    ldrb     w8, [x19, #0x97]
    mov      w9, #1
    bic      w8, w9, w8
    strb     w8, [x19, #0x96]
    ldr      x1, [x19, #0x128]
    ldr      x0, [x19, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x88]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xfb0]
    ldrb     w2, [x19, #0x96]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19, #0x10]
    mov      w9, #0x6756
    movk     w9, #0x453c, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x528]
    ldur     x0, [x29, #-0xb8]
    mov      x1, x24
    adrp     x2, #0x546000
    add      x2, x2, #0xa00
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xc0]
    ldur     x0, [x29, #-0xb8]
    mov      x1, x24
    adrp     x2, #0x546000
    add      x2, x2, #0x940
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xc8]
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7f0]
    ldr      x0, [x19, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x25, [x8, #0x6f8]
    ldur     x2, [x29, #-0xc0]
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    mov      x20, x23
    mov      x23, x26
    adrp     x8, #0x4c4000
    ldr      x26, [x8, #0xb8]
    adrp     x8, #0x4be000
    ldr      x24, [x8, #0x600]
    ldur     x0, [x29, #-0xc8]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x620]
    str      x0, [sp, #-0x10]!
    mov      x0, x26
    adrp     x2, #0x546000
    add      x2, x2, #0x9c0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    add      sp, sp, #0x10
    mov      x26, x0
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x818]
    ldr      x0, [x19, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x27, x0
    mov      x1, x25
    mov      x2, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x27
    mov      w27, #0x84b7
    movk     w27, #0xea2f, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xc0]
    bl       #0x309944
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    ldur     x1, [x29, #-0xa8]
    ldr      x0, [x19, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    mov      x2, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x26
    mov      x26, x23
    mov      x23, x20
    mov      w20, #0x3d2e
    movk     w20, #0xf18e, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x25
    mov      w25, #0xa46
    movk     w25, #0x579f, lsl #16
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xc8]
    mov      x1, x24
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    cset     w8, eq
    sturb    w8, [x29, #-0xc9]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x42a3
    movk     w9, #0x5191, lsl #16
    b        #0x309078
    ldr      x8, [x19, #0x138]
    ldrb     w9, [x19, #0xa6]
    cmp      w9, #0
    adrp     x9, #0x4a6000
    add      x9, x9, #0xd8
    csel     x8, x9, x8, ne
    ldr      x9, [x19, #0x130]
    ldrb     w10, [x19, #0xa7]
    cmp      w10, #0
    csel     x0, x8, x9, ne
    bl       #0x309944
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x98]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xf2f1
    movk     w9, #0x8f29, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldr      x8, [x19, #0xf8]
    cmn      x8, #1
    cset     w8, eq
    strb     w8, [x19, #0xf7]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x37f7
    movk     w9, #0x47b, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldr      x8, [x19, #0x10]
    str      w25, [x8]
    ldr      x8, [x19, #0x98]
    str      x8, [x19, #0x40]
    b        #0x307f10
    ldp      x1, x0, [x19, #0x140]
    adrp     x2, #0x546000
    add      x2, x2, #0x900
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x138]
    ldp      x1, x0, [x19, #0x140]
    adrp     x2, #0x546000
    add      x2, x2, #0x8c0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x7f0]
    stp      x1, x0, [x19, #0x128]
    ldr      x0, [x19, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x6f8]
    str      x1, [x19, #0x120]
    ldr      x2, [x19, #0x130]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x818]
    str      x1, [x19, #0x118]
    ldr      x0, [x19, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    ldr      x1, [x19, #0x120]
    mov      x2, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x138]
    bl       #0x461ca8 // _objc_retain
    ldr      x0, [x19, #0x130]
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x338]
    str      x8, [x19, #0x110]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x332c
    movk     w9, #0x1113, lsl #16
    str      w9, [x8]
    mov      w24, #0x9e82
    movk     w24, #0x94e0, lsl #16
    b        #0x307f10
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x24, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5f0]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    mov      x0, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x148]
    mov      x0, x24
    mov      w24, #0x9e82
    movk     w24, #0x94e0, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x528]
    str      x8, [x19, #0x140]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x5976
    movk     w9, #0xde2c, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldr      x8, [x19, #0x10]
    mov      w9, #0xbd57
    movk     w9, #0x6d5d, lsl #16
    str      w9, [x8]
    ldr      x8, [x19, #0x150]
    str      x8, [x19, #0x48]
    b        #0x307f10
    adrp     x9, #0x546000
    add      x9, x9, #0x820
    ldrb     w8, [x9]
    mov      w10, #0x65
    eor      w8, w8, w10
    adrp     x10, #0x546000
    add      x10, x10, #0x82f
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w11, #0x68
    eor      w8, w8, w11
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w11, #0xfa
    eor      w8, w8, w11
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    eor      w8, w8, #2
    strb     w8, [x10, #3]
    ldrb     w8, [x9, #4]
    mov      w11, #0xa6
    eor      w8, w8, w11
    strb     w8, [x10, #4]
    ldrb     w8, [x9, #5]
    eor      w8, w8, #0x1f
    strb     w8, [x10, #5]
    ldrb     w8, [x9, #6]
    eor      w8, w8, #0x70
    strb     w8, [x10, #6]
    adrp     x9, #0x546000
    add      x9, x9, #0x810
    ldrb     w8, [x9]
    mov      w10, #0x5f
    eor      w8, w8, w10
    adrp     x10, #0x546000
    add      x10, x10, #0x812
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w9, #0xe5
    eor      w8, w8, w9
    strb     w8, [x10, #1]
    adrp     x9, #0x546000
    add      x9, x9, #0x7f0
    ldrh     w8, [x9]
    mov      w10, #0xfaf5
    eor      w8, w8, w10
    adrp     x10, #0x546000
    add      x10, x10, #0x7f8
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0x20ed
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0x70b4
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w9, #0x394
    eor      w8, w8, w9
    strh     w8, [x10, #6]
    adrp     x8, #0x546000
    ldrb     w8, [x8, #0x814]
    mov      w9, #0xbd
    eor      w8, w8, w9
    sturb    w8, [x29, #-0x66]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x2b4d
    movk     w9, #0x8bf4, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldr      x24, [x19, #0x40]
    ldr      x0, [x19, #0x130]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x138]
    bl       #0x461c9c // _objc_release
    ldur     x1, [x29, #-0xa8]
    ldr      x0, [x19, #0x30]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x8e0]
    mov      x2, x24
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    mov      w25, #0xa46
    movk     w25, #0x579f, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x24
    mov      w24, #0x9e82
    movk     w24, #0x94e0, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x8b8]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #0xe1a7
    movk     w8, #0x8ec4, lsl #16
    mov      w9, #0x16d
    movk     w9, #0x3b2, lsl #16
    b        #0x30966c
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    str      x1, [x19, #0xd8]
    ldr      x0, [x19, #0xe0]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    str      x1, [x19, #0xd0]
    ldr      x0, [x19, #0xe8]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [x19, #0xcf]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x865
    movk     w9, #0xefc6, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldr      x0, [x19, #0xe8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x10]
    mov      w9, #0xbb6c
    movk     w9, #0xcd79, lsl #16
    str      w9, [x8]
    b        #0x307f10
    adrp     x8, #0x580000
    ldr      x8, [x8, #0x860]
    str      x8, [x19, #0xf8]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xd90a
    movk     w9, #0x9b5, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldr      x8, [x19, #0x10]
    mov      w9, #0xd5a4
    movk     w9, #0xbdb1, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldurb    w8, [x29, #-0x66]
    adrp     x9, #0x546000
    add      x9, x9, #0x816
    strb     w8, [x9]
    adrp     x8, #0x546000
    ldrb     w8, [x8, #0x815]
    mov      w10, #0xad
    eor      w8, w8, w10
    strb     w8, [x9, #1]
    adrp     x9, #0x546000
    add      x9, x9, #0x800
    ldrb     w8, [x9]
    mov      w10, #0x28
    eor      w8, w8, w10
    adrp     x10, #0x546000
    add      x10, x10, #0x808
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    mov      w11, #0xa8
    eor      w8, w8, w11
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w11, #0x9a
    eor      w8, w8, w11
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    mov      w11, #0x2d
    eor      w8, w8, w11
    strb     w8, [x10, #3]
    ldrb     w8, [x9, #4]
    mov      w11, #0x27
    eor      w8, w8, w11
    strb     w8, [x10, #4]
    ldrb     w8, [x9, #5]
    mov      w11, #0x29
    eor      w8, w8, w11
    strb     w8, [x10, #5]
    ldrb     w8, [x9, #6]
    mov      w11, #0x36
    eor      w8, w8, w11
    strb     w8, [x10, #6]
    ldrb     w8, [x9, #7]
    mvn      w8, w8
    strb     w8, [x10, #7]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xe98a
    movk     w9, #0xa0d3, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldur     x8, [x29, #-0x70]
    add      x8, x8, #8
    stur     x8, [x29, #-0xf8]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xf235
    movk     w9, #0x7642, lsl #16
    str      w9, [x8]
    b        #0x307f10
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x950]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x70]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xe423
    movk     w9, #0xa3fa, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldr      x8, [x19, #0x58]
    str      x8, [x19, #0x28]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x950]
    stur     x8, [x29, #-0x100]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xa08]
    str      x8, [x19, #0x188]
    ldr      x8, [x19, #0x10]
    str      w27, [x8]
    str      xzr, [x19, #0x50]
    b        #0x307f10
    adrp     x8, #0x580000
    ldr      x8, [x8, #0x860]
    cmn      x8, #1
    cset     w8, eq
    strb     w8, [x19, #0xf6]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x2f8a
    movk     w9, #0x6db4, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldr      x8, [x19, #0x50]
    str      x8, [x19, #0x20]
    ldp      x9, x8, [x29, #-0xf0]
    ldr      x8, [x8]
    ldr      x8, [x8]
    cmp      x8, x9
    mov      w8, #0xc51b
    movk     w8, #0xc7f2, lsl #16
    mov      w9, #0xd7ab
    movk     w9, #0x9385, lsl #16
    csel     w8, w8, w9, eq
    b        #0x30976c
    ldp      x0, x2, [x19, #0x178]
    ldr      x1, [x19, #0x188]
    bl       #0x461c6c // _objc_msgSend
    mov      x24, x0
    ldr      x0, [x19, #0x178]
    bl       #0x461c9c // _objc_release
    cmp      w24, #0
    mov      w24, #0x9e82
    movk     w24, #0x94e0, lsl #16
    ldr      x8, [x19, #0x10]
    mov      w9, #0xbd57
    movk     w9, #0x6d5d, lsl #16
    mov      w10, #0x8f85
    movk     w10, #0x6819, lsl #16
    csel     w9, w10, w9, ne
    str      w9, [x8]
    str      xzr, [x19, #0x48]
    b        #0x307f10
    ldur     x8, [x29, #-0x70]
    ldr      x9, [x8, #0x10]!
    stur     x8, [x29, #-0xe8]
    ldr      x8, [x9]
    stur     x8, [x29, #-0xf0]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x74db
    movk     w9, #0xcaa4, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldr      x8, [x19, #0x170]
    ldr      x9, [x19, #0x28]
    cmp      x8, x9
    cset     w8, eq
    strb     w8, [x19, #0x16f]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x55bc
    movk     w9, #0xbff, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldr      x8, [x19, #0x10]
    mov      w9, #0x771e
    movk     w9, #0xbc3a, lsl #16
    str      w9, [x8]
    ldur     x8, [x29, #-0xa0]
    str      x8, [x19, #0x60]
    b        #0x307f10
    ldr      x0, [x19, #0xc0]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x10]
    mov      w9, #0xbcd3
    movk     w9, #0x12de, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldr      x0, [x19, #0x138]
    ldr      x1, [x19, #0x110]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    cset     w8, eq
    strb     w8, [x19, #0xf5]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xe6f2
    movk     w9, #0x6397, lsl #16
    str      w9, [x8]
    b        #0x307f10
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x2b8]
    bl       #0x461ba0 // _objc_alloc
    adrp     x8, #0x4c0000
    ldr      x8, [x8, #0x7e0]
    stp      x8, x0, [x29, #-0x98]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x5e74
    movk     w9, #0xfcca, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldrb     w8, [x19, #0x16f]
    cmp      w8, #0
    mov      w8, #0xa31e
    movk     w8, #0xed67, lsl #16
    csel     w8, w8, w27, ne
    ldr      x9, [x19, #0x10]
    str      w8, [x9]
    ldr      x8, [x19, #0x170]
    str      x8, [x19, #0x50]
    b        #0x307f10
    ldr      x8, [x19, #0x10]
    mov      w9, #0xc51b
    movk     w9, #0xc7f2, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldrb     w8, [x19, #0xf7]
    cmp      w8, #0
    mov      w8, #0xc5d2
    movk     w8, #0x869e, lsl #16
    mov      w9, #0x465d
    movk     w9, #0x830, lsl #16
    csel     w8, w8, w9, ne
    b        #0x30976c
    ldp      x1, x0, [x29, #-0x98]
    mov      w2, #3
    adrp     x3, #0x546000
    add      x3, x3, #0x980
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0xa0]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x3704
    movk     w9, #0x1ae7, lsl #16
    str      w9, [x8]
    b        #0x307f10
    adrp     x8, #0x580000
    add      x8, x8, #0x8bc
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x40
    mov      sp, x8
    stur     x8, [x29, #-0x70]
    sub      x8, sp, #0x80
    mov      sp, x8
    stur     x8, [x29, #-0x78]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x26bb
    movk     w9, #0x98ab, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldp      x3, x2, [x29, #-0x78]
    ldur     x0, [x29, #-0xc8]
    ldur     x1, [x29, #-0xd8]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x160]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x141d
    movk     w9, #0x5c0, lsl #16
    str      w9, [x8]
    b        #0x307f10
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x410]
    ldr      x0, [x19, #0x100]
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x418]
    ldr      x0, [x19, #0x108]
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #0x14c6
    movk     w8, #0x5624, lsl #16
    csel     w8, w25, w8, ne
    ldr      x9, [x19, #0x10]
    str      w8, [x9]
    ldr      x8, [x19, #0x108]
    str      x8, [x19, #0x40]
    b        #0x307f10
    ldrb     w8, [x19, #0xbf]
    cmp      w8, #0
    mov      w8, #0x2dd1
    movk     w8, #0x3b28, lsl #16
    mov      w9, #0xed30
    movk     w9, #0x25a0, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [x19, #0x10]
    str      w8, [x9]
    b        #0x307f10
    ldur     x1, [x29, #-0x100]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x178]
    ldr      x8, [x19, #0x10]
    mov      w9, #0xa766
    movk     w9, #0xb222, lsl #16
    str      w9, [x8]
    b        #0x307f10
    adrp     x8, #0x580000
    ldr      x0, [x8, #0x858]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x330]
    ldr      x2, [x19, #0x138]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x80]
    stp      x8, x0, [x19, #0xe0]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x7db8
    movk     w9, #0x752, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldur     w8, [x29, #-0x64]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x65]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x10f8
    movk     w9, #0x3201, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldr      x8, [x19, #0x10]
    mov      w9, #0x7c07
    movk     w9, #0x3909, lsl #16
    str      w9, [x8]
    b        #0x307f10
    ldr      x0, [x19, #0x38]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x130]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x138]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x148]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x10]
    mov      w9, #0xec6c
    movk     w9, #0x73bf, lsl #16
    str      w9, [x8]
    b        #0x307f10
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x9f0]
    mov      x0, x23
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5f0]
    mov      x0, x26
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    ldur     x0, [x29, #-0xb0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xb8]
    ldr      x8, [x19, #0x10]
    mov      w9, #0x7b2d
    movk     w9, #0xdb28, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      x0, x26
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19, #0x10]
    mov      w9, #0xa082
    movk     w9, #0x8c83, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      w9, #0x465d
    movk     w9, #0x830, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    bl       #0x4603cc
    ldr      x8, [x19, #0x10]
    mov      w9, #0x395d
    movk     w9, #0x79d9, lsl #16
    str      w9, [x8]
    b        #0x307f10
    mov      w9, #0x8efe
    movk     w9, #0x646d, lsl #16
    cmp      w8, w9
    b.ne     #0x307f10
    ldr      x0, [x19, #0x30]
    ldur     x8, [x29, #-0x60]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x309940
    sub      sp, x29, #0x50
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    ldp      x26, x25, [sp, #0x10]
    ldp      x28, x27, [sp], #0x60
    ret      
    bl       #0x4618b8 // ___stack_chk_fail

// -[WCLGGroupMemberPicker tableView:titleForHeaderInSection:] IMP=0x309F18 bounds=0x309F18-0x30A970
loc_309F18:
    sub      sp, sp, #0xf0
    stp      x28, x27, [sp, #0x90]
    stp      x26, x25, [sp, #0xa0]
    stp      x24, x23, [sp, #0xb0]
    stp      x22, x21, [sp, #0xc0]
    stp      x20, x19, [sp, #0xd0]
    stp      x29, x30, [sp, #0xe0]
    add      x29, sp, #0xe0
    mov      x19, x0
    adrp     x8, #0x580000
    add      x8, x8, #0x8c4
    ldar     w8, [x8]
    stur     w8, [x29, #-0x54]
    mov      w8, #0x9f0
    movk     w8, #0x421f, lsl #16
    str      w8, [sp, #0xc]
    add      x8, sp, #0xc
    mov      w24, #0x5719
    movk     w24, #0xfcda, lsl #16
    str      x8, [sp]
    mov      w25, #0xa189
    movk     w25, #0xce5c, lsl #16
    adrp     x27, #0x546000
    add      x27, x27, #0xae2
    adrp     x28, #0x546000
    add      x28, x28, #0xb06
    adrp     x23, #0x546000
    add      x23, x23, #0xb16
    adrp     x22, #0x546000
    add      x22, x22, #0xaa0
    adrp     x21, #0x546000
    add      x21, x21, #0xac0
    mov      w26, #0xf406
    movk     w26, #0x389b, lsl #16
    mov      w20, #0x72e9
    movk     w20, #0x5273, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w24
    b.gt     #0x30a170
    cmp      w8, w25
    b.gt     #0x30a1ec
    mov      w9, #0x1ae5
    movk     w9, #0xa5c4, lsl #16
    cmp      w8, w9
    b.le     #0x30a4d4
    mov      w9, #0x193a
    movk     w9, #0xb07d, lsl #16
    cmp      w8, w9
    b.gt     #0x30a61c
    mov      w9, #0x1ae6
    movk     w9, #0xa5c4, lsl #16
    cmp      w8, w9
    b.eq     #0x30a710
    mov      w9, #0xbab8
    movk     w9, #0xab93, lsl #16
    cmp      w8, w9
    b.ne     #0x309fa8
    adrp     x8, #0x546000
    ldrh     w8, [x8, #0xb42]
    mov      w9, #0xb5c7
    eor      w8, w8, w9
    adrp     x9, #0x546000
    strh     w8, [x9, #0xb62]
    adrp     x9, #0x546000
    add      x9, x9, #0xa7c
    ldrh     w8, [x9]
    mov      w10, #0xe03a
    eor      w8, w8, w10
    adrp     x10, #0x546000
    add      x10, x10, #0xa8a
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0xbf21
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0xff46
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w11, #0x8886
    eor      w8, w8, w11
    strh     w8, [x10, #6]
    ldrh     w8, [x9, #8]
    mov      w11, #0x11d8
    eor      w8, w8, w11
    strh     w8, [x10, #8]
    ldrh     w8, [x9, #0xa]
    mov      w11, #0x3300
    eor      w8, w8, w11
    strh     w8, [x10, #0xa]
    ldrh     w8, [x9, #0xc]
    mov      w9, #0xb8bf
    eor      w8, w8, w9
    strh     w8, [x10, #0xc]
    adrp     x9, #0x546000
    add      x9, x9, #0xad2
    ldrh     w8, [x9]
    mov      w10, #0xb6c8
    eor      w8, w8, w10
    strh     w8, [x27]
    ldrh     w8, [x9, #2]
    mov      w10, #0xfa06
    eor      w8, w8, w10
    strh     w8, [x27, #2]
    ldrh     w8, [x9, #4]
    mov      w10, #0xe792
    eor      w8, w8, w10
    strh     w8, [x27, #4]
    ldrh     w8, [x9, #6]
    mov      w10, #0xb633
    eor      w8, w8, w10
    strh     w8, [x27, #6]
    ldrh     w8, [x9, #8]
    mov      w10, #0x19c4
    eor      w8, w8, w10
    strh     w8, [x27, #8]
    ldrh     w8, [x9, #0xa]
    mov      w10, #0x703b
    eor      w8, w8, w10
    strh     w8, [x27, #0xa]
    ldrh     w8, [x9, #0xc]
    mov      w10, #0x1c35
    eor      w8, w8, w10
    strh     w8, [x27, #0xc]
    ldrh     w8, [x9, #0xe]
    mov      w9, #0xa541
    eor      w8, w8, w9
    strh     w8, [x27, #0xe]
    adrp     x9, #0x546000
    add      x9, x9, #0xa70
    ldrh     w8, [x9]
    mov      w10, #0xa0a8
    eor      w8, w8, w10
    adrp     x10, #0x546000
    add      x10, x10, #0xa76
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0x7e17
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w9, #0x7d25
    eor      w8, w8, w9
    strh     w8, [x10, #4]
    ldr      x8, [sp]
    mov      w9, #0x1ae6
    movk     w9, #0xa5c4, lsl #16
    str      w9, [x8]
    b        #0x309fa8
    cmp      w8, w26
    b.le     #0x30a410
    cmp      w8, w20
    b.le     #0x30a488
    mov      w9, #0x71b
    movk     w9, #0x6b38, lsl #16
    cmp      w8, w9
    b.gt     #0x30a5e0
    mov      w9, #0x72ea
    movk     w9, #0x5273, lsl #16
    cmp      w8, w9
    b.eq     #0x30a6b8
    mov      w9, #0xd972
    movk     w9, #0x6908, lsl #16
    cmp      w8, w9
    b.ne     #0x309fa8
    ldr      x8, [sp, #0x48]
    cmp      x8, #0
    adrp     x8, #0x546000
    add      x8, x8, #0xc10
    adrp     x9, #0x546000
    add      x9, x9, #0xcd0
    csel     x0, x9, x8, eq
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp]
    mov      w9, #0xa18a
    movk     w9, #0xce5c, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x58]
    stp      x0, x8, [sp, #0x10]
    b        #0x309fa8
    mov      w9, #0x69a8
    movk     w9, #0xe180, lsl #16
    cmp      w8, w9
    b.gt     #0x30a58c
    mov      w9, #0xf004
    movk     w9, #0xdd16, lsl #16
    cmp      w8, w9
    b.le     #0x30a66c
    mov      w9, #0xf005
    movk     w9, #0xdd16, lsl #16
    cmp      w8, w9
    b.eq     #0x30a698
    mov      w9, #0xd942
    movk     w9, #0xe051, lsl #16
    cmp      w8, w9
    b.ne     #0x309fa8
    ldrh     w8, [x28]
    mov      w9, #0x6df0
    eor      w8, w8, w9
    strh     w8, [x23]
    ldrh     w8, [x28, #2]
    mov      w9, #0xd9c1
    eor      w8, w8, w9
    strh     w8, [x23, #2]
    ldrh     w8, [x28, #4]
    mov      w9, #0x6f10
    eor      w8, w8, w9
    strh     w8, [x23, #4]
    ldrh     w8, [x28, #6]
    mov      w9, #0x20c9
    eor      w8, w8, w9
    strh     w8, [x23, #6]
    ldrh     w8, [x28, #8]
    mov      w9, #0x66f
    eor      w8, w8, w9
    strh     w8, [x23, #8]
    ldrh     w8, [x28, #0xa]
    mov      w9, #0xbde0
    eor      w8, w8, w9
    strh     w8, [x23, #0xa]
    ldrh     w8, [x28, #0xc]
    mov      w9, #0xbe7
    eor      w8, w8, w9
    strh     w8, [x23, #0xc]
    ldrh     w8, [x28, #0xe]
    mov      w9, #0xa4a3
    eor      w8, w8, w9
    strh     w8, [x23, #0xe]
    adrp     x10, #0x546000
    add      x10, x10, #0xaf2
    ldrh     w8, [x10]
    mov      w9, #0x1d14
    eor      w8, w8, w9
    adrp     x11, #0x546000
    add      x11, x11, #0xafc
    strh     w8, [x11]
    ldrh     w8, [x10, #2]
    mov      w9, #0x66a6
    eor      w8, w8, w9
    strh     w8, [x11, #2]
    ldrh     w8, [x10, #4]
    mov      w9, #0x699a
    eor      w8, w8, w9
    strh     w8, [x11, #4]
    ldrh     w8, [x10, #6]
    mov      w9, #0x1c35
    eor      w8, w8, w9
    strh     w8, [x11, #6]
    ldrh     w8, [x10, #8]
    mov      w9, #0xd445
    eor      w8, w8, w9
    strh     w8, [x11, #8]
    ldrh     w8, [x22]
    mov      w9, #0x5c1
    eor      w8, w8, w9
    strh     w8, [x21]
    ldrh     w8, [x22, #2]
    mov      w9, #0x375f
    eor      w8, w8, w9
    strh     w8, [x21, #2]
    ldrh     w8, [x22, #4]
    mov      w9, #0x1ec
    eor      w8, w8, w9
    strh     w8, [x21, #4]
    ldrh     w8, [x22, #6]
    mov      w9, #0xfc77
    eor      w8, w8, w9
    strh     w8, [x21, #6]
    ldrh     w8, [x22, #8]
    mov      w9, #0x554d
    eor      w8, w8, w9
    strh     w8, [x21, #8]
    ldrh     w8, [x22, #0xa]
    mov      w9, #0x9c5d
    eor      w8, w8, w9
    strh     w8, [x21, #0xa]
    ldrh     w8, [x22, #0xc]
    mov      w9, #0x15c
    eor      w8, w8, w9
    strh     w8, [x21, #0xc]
    ldrh     w8, [x22, #0xe]
    mov      w9, #0x6e27
    eor      w8, w8, w9
    strh     w8, [x21, #0xe]
    ldrh     w8, [x22, #0x10]
    mov      w9, #0x72dc
    eor      w8, w8, w9
    strh     w8, [x21, #0x10]
    adrp     x9, #0x546000
    add      x9, x9, #0xb30
    ldrh     w8, [x9]
    mov      w10, #0x1910
    eor      w8, w8, w10
    adrp     x10, #0x546000
    add      x10, x10, #0xb50
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0x65fc
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0x2c3
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w11, #0xb77f
    eor      w8, w8, w11
    strh     w8, [x10, #6]
    ldrh     w8, [x9, #8]
    mov      w9, #0x61f4
    eor      w8, w8, w9
    strh     w8, [x10, #8]
    ldr      x8, [sp]
    mov      w9, #0xa4b
    movk     w9, #0x27de, lsl #16
    str      w9, [x8]
    b        #0x309fa8
    mov      w9, #0xfdcb
    movk     w9, #0x264a, lsl #16
    cmp      w8, w9
    b.gt     #0x30a530
    mov      w9, #0x571a
    movk     w9, #0xfcda, lsl #16
    cmp      w8, w9
    b.eq     #0x30a7a0
    mov      w9, #0x168
    movk     w9, #0xff4a, lsl #16
    cmp      w8, w9
    b.eq     #0x30a860
    mov      w9, #0x472e
    movk     w9, #0x1299, lsl #16
    cmp      w8, w9
    b.ne     #0x309fa8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    ldr      x0, [sp, #0x38]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    cset     w8, eq
    strb     w8, [sp, #0x37]
    ldrb     w8, [sp, #0x47]
    cmp      w8, #0
    mov      w8, #0x3d65
    movk     w8, #0x9ecd, lsl #16
    mov      w9, #0x571a
    movk     w9, #0xfcda, lsl #16
    b        #0x30a6b0
    mov      w9, #0xf407
    movk     w9, #0x389b, lsl #16
    cmp      w8, w9
    b.eq     #0x30a754
    mov      w9, #0x9f0
    movk     w9, #0x421f, lsl #16
    cmp      w8, w9
    b.eq     #0x30a818
    mov      w9, #0x53a9
    movk     w9, #0x44ab, lsl #16
    cmp      w8, w9
    b.ne     #0x309fa8
    ldrb     w8, [sp, #0x67]
    cmp      w8, #0
    mov      w8, #0x13fe
    movk     w8, #0x3059, lsl #16
    mov      w9, #0x71c
    movk     w9, #0x6b38, lsl #16
    b        #0x30a6b0
    mov      w9, #0x2d93
    movk     w9, #0x81a1, lsl #16
    cmp      w8, w9
    b.eq     #0x30a784
    mov      w9, #0x5284
    movk     w9, #0x845e, lsl #16
    cmp      w8, w9
    b.eq     #0x30a83c
    mov      w9, #0x3d65
    movk     w9, #0x9ecd, lsl #16
    cmp      w8, w9
    b.ne     #0x309fa8
    ldrb     w8, [sp, #0x37]
    cmp      w8, #0
    adrp     x8, #0x546000
    add      x8, x8, #0xb90
    csel     x8, xzr, x8, ne
    str      x8, [sp, #0x20]
    ldr      x8, [sp]
    mov      w9, #0xfdcc
    movk     w9, #0x264a, lsl #16
    str      w9, [x8]
    b        #0x309fa8
    mov      w9, #0xfdcc
    movk     w9, #0x264a, lsl #16
    cmp      w8, w9
    b.eq     #0x30a7d4
    mov      w9, #0xa4b
    movk     w9, #0x27de, lsl #16
    cmp      w8, w9
    b.eq     #0x30a890
    mov      w9, #0x13fe
    movk     w9, #0x3059, lsl #16
    cmp      w8, w9
    b.ne     #0x309fa8
    ldur     x1, [x29, #-0x60]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #3
    cset     w8, eq
    strb     w8, [sp, #0x47]
    ldr      x8, [sp]
    mov      w9, #0x168
    movk     w9, #0xff4a, lsl #16
    str      w9, [x8]
    b        #0x309fa8
    mov      w9, #0x69a9
    movk     w9, #0xe180, lsl #16
    cmp      w8, w9
    b.eq     #0x30a7f0
    mov      w9, #9
    movk     w9, #0xe3ea, lsl #16
    cmp      w8, w9
    b.eq     #0x30a8f4
    mov      w9, #0x541e
    movk     w9, #0xeabf, lsl #16
    cmp      w8, w9
    b.ne     #0x309fa8
    ldr      x8, [sp, #0x68]
    cmp      x8, #1
    cset     w8, eq
    strb     w8, [sp, #0x67]
    ldr      x8, [sp]
    mov      w9, #0x53a9
    movk     w9, #0x44ab, lsl #16
    str      w9, [x8]
    b        #0x309fa8
    mov      w9, #0x71c
    movk     w9, #0x6b38, lsl #16
    cmp      w8, w9
    b.eq     #0x30a6d8
    mov      w9, #0x54e
    movk     w9, #0x734c, lsl #16
    cmp      w8, w9
    b.ne     #0x309fa8
    ldr      x8, [sp]
    mov      w9, #0xa18a
    movk     w9, #0xce5c, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x38]
    ldr      x9, [sp, #0x28]
    b        #0x30a810
    mov      w9, #0x193b
    movk     w9, #0xb07d, lsl #16
    cmp      w8, w9
    b.eq     #0x30a734
    mov      w9, #0x220d
    movk     w9, #0xbb1e, lsl #16
    cmp      w8, w9
    b.ne     #0x309fa8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x9f0]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0x68]
    ldr      x8, [sp]
    mov      w9, #9
    movk     w9, #0xe3ea, lsl #16
    str      w9, [x8]
    b        #0x309fa8
    mov      w9, #0x9b75
    movk     w9, #0xd581, lsl #16
    cmp      w8, w9
    b.ne     #0x30a934
    ldr      x8, [sp]
    mov      w9, #0xa18a
    movk     w9, #0xce5c, lsl #16
    str      w9, [x8]
    ldr      x8, [sp, #0x38]
    ldr      x9, [sp, #0x20]
    b        #0x30a810
    ldurb    w8, [x29, #-0x55]
    cmp      w8, #0
    mov      w8, #0x1ae6
    movk     w8, #0xa5c4, lsl #16
    mov      w9, #0xd942
    movk     w9, #0xe051, lsl #16
    csel     w8, w9, w8, ne
    b        #0x30a778
    ldp      x1, x0, [sp, #0x50]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x48]
    ldr      x8, [sp]
    mov      w9, #0xd972
    movk     w9, #0x6908, lsl #16
    str      w9, [x8]
    b        #0x309fa8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x600]
    stp      x8, x0, [sp, #0x50]
    ldr      x8, [sp]
    mov      w9, #0x72ea
    movk     w9, #0x5273, lsl #16
    str      w9, [x8]
    b        #0x309fa8
    adrp     x8, #0x580000
    add      x8, x8, #0x8c4
    mov      w9, #1
    stlr     w9, [x8]
    ldr      x8, [sp]
    mov      w9, #0x193b
    movk     w9, #0xb07d, lsl #16
    str      w9, [x8]
    b        #0x309fa8
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x938]
    stur     x8, [x29, #-0x60]
    ldr      x8, [sp]
    mov      w9, #0xf407
    movk     w9, #0x389b, lsl #16
    str      w9, [x8]
    b        #0x309fa8
    ldur     x1, [x29, #-0x60]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #2
    mov      w8, #0x5284
    movk     w8, #0x845e, lsl #16
    mov      w9, #0x220d
    movk     w9, #0xbb1e, lsl #16
    csel     w8, w9, w8, eq
    ldr      x9, [sp]
    str      w8, [x9]
    b        #0x309fa8
    ldr      x0, [sp, #0x28]
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp]
    mov      w9, #0x54e
    movk     w9, #0x734c, lsl #16
    str      w9, [x8]
    b        #0x309fa8
    ldrb     w8, [sp, #0x37]
    cmp      w8, #0
    adrp     x8, #0x546000
    add      x8, x8, #0xbd0
    adrp     x9, #0x546000
    add      x9, x9, #0xc50
    csel     x8, x9, x8, ne
    str      x8, [sp, #0x28]
    ldr      x8, [sp]
    mov      w9, #0x2d93
    movk     w9, #0x81a1, lsl #16
    str      w9, [x8]
    b        #0x309fa8
    ldr      x0, [sp, #0x20]
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp]
    mov      w9, #0x9b75
    movk     w9, #0xd581, lsl #16
    str      w9, [x8]
    b        #0x309fa8
    ldr      x0, [sp, #0x70]
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp]
    mov      w9, #0xa18a
    movk     w9, #0xce5c, lsl #16
    str      w9, [x8]
    ldur     x8, [x29, #-0x68]
    ldr      x9, [sp, #0x70]
    stp      x9, x8, [sp, #0x10]
    b        #0x309fa8
    ldur     w8, [x29, #-0x54]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x55]
    ldr      x8, [sp]
    mov      w9, #0xf005
    movk     w9, #0xdd16, lsl #16
    str      w9, [x8]
    b        #0x309fa8
    ldur     x1, [x29, #-0x60]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    str      x0, [sp, #0x68]
    ldr      x8, [sp]
    mov      w9, #0x541e
    movk     w9, #0xeabf, lsl #16
    str      w9, [x8]
    b        #0x309fa8
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x19
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [sp, #0x38]
    ldr      x8, [sp]
    mov      w9, #0x472e
    movk     w9, #0x1299, lsl #16
    str      w9, [x8]
    b        #0x309fa8
    adrp     x9, #0x546000
    add      x9, x9, #0xb3a
    ldrh     w8, [x9]
    mov      w10, #0xf9ea
    eor      w8, w8, w10
    adrp     x10, #0x546000
    add      x10, x10, #0xb5a
    strh     w8, [x10]
    ldrh     w8, [x9, #2]
    mov      w11, #0x1b75
    eor      w8, w8, w11
    strh     w8, [x10, #2]
    ldrh     w8, [x9, #4]
    mov      w11, #0x71a8
    eor      w8, w8, w11
    strh     w8, [x10, #4]
    ldrh     w8, [x9, #6]
    mov      w9, #0x5029
    eor      w8, w8, w9
    strh     w8, [x10, #6]
    ldr      x8, [sp]
    mov      w9, #0xbab8
    movk     w9, #0xab93, lsl #16
    str      w9, [x8]
    b        #0x309fa8
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    ldur     x0, [x29, #-0x68]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    adrp     x8, #0x546000
    add      x8, x8, #0xc90
    adrp     x9, #0x546000
    add      x9, x9, #0xd10
    csel     x8, x9, x8, eq
    str      x8, [sp, #0x70]
    ldr      x8, [sp]
    mov      w9, #0x69a9
    movk     w9, #0xe180, lsl #16
    str      w9, [x8]
    b        #0x309fa8
    mov      w9, #0xa18a
    movk     w9, #0xce5c, lsl #16
    cmp      w8, w9
    b.ne     #0x309fa8
    ldp      x19, x0, [sp, #0x10]
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    ldp      x29, x30, [sp, #0xe0]
    ldp      x20, x19, [sp, #0xd0]
    ldp      x22, x21, [sp, #0xc0]
    ldp      x24, x23, [sp, #0xb0]
    ldp      x26, x25, [sp, #0xa0]
    ldp      x28, x27, [sp, #0x90]
    add      sp, sp, #0xf0
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGGroupMemberPicker tableView:didSelectRowAtIndexPath:] IMP=0x30A970 bounds=0x30A970-0x30C448
loc_30A970:
    stp      d9, d8, [sp, #-0x70]!
    stp      x28, x27, [sp, #0x10]
    stp      x26, x25, [sp, #0x20]
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    sub      sp, sp, #0x2c0
    mov      x19, sp
    mov      x27, x3
    mov      x24, x2
    mov      x22, x0
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x760]
    ldr      x8, [x8]
    mov      w21, #0x150e
    movk     w21, #0xea74, lsl #16
    stur     x8, [x29, #-0x70]
    mov      w26, #0xa682
    movk     w26, #0xc8ce, lsl #16
    adrp     x8, #0x580000
    add      x8, x8, #0x8c8
    ldar     w8, [x8]
    stur     w8, [x29, #-0x74]
    mov      w8, #0x214c
    movk     w8, #0x34e3, lsl #16
    str      w8, [x19, #0xc]
    add      x8, x19, #0xc
    str      x8, [x19]
    mov      w28, #0x8200
    movk     w28, #0xd85, lsl #16
    mov      w23, #0x42ff
    movk     w23, #0xd338, lsl #16
    mov      w25, #0x9256
    movk     w25, #0x97c4, lsl #16
    adrp     x8, #0x491000
    ldr      d8, [x8, #0x388]
    mov      w20, #0x9958
    movk     w20, #0x4758, lsl #16
    ldr      w8, [x19, #0xc]
    cmp      w8, w28
    b.le     #0x30aac8
    cmp      w8, w20
    b.gt     #0x30abec
    mov      w9, #0xb435
    movk     w9, #0x238f, lsl #16
    cmp      w8, w9
    b.le     #0x30ac7c
    mov      w9, #0xa2a7
    movk     w9, #0x3c85, lsl #16
    cmp      w8, w9
    b.gt     #0x30b008
    mov      w9, #0xeb0c
    movk     w9, #0x342d, lsl #16
    cmp      w8, w9
    b.gt     #0x30b1d4
    mov      w9, #0x4e6c
    movk     w9, #0x3313, lsl #16
    cmp      w8, w9
    b.le     #0x30b778
    mov      w9, #0x4e6d
    movk     w9, #0x3313, lsl #16
    cmp      w8, w9
    b.eq     #0x30b7a4
    mov      w9, #0xc063
    movk     w9, #0x33be, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldur     x1, [x29, #-0xc8]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xe0]
    ldur     x1, [x29, #-0xc0]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x608]
    stp      x8, x0, [x29, #-0xf0]
    ldr      x8, [x19]
    mov      w9, #0xd150
    movk     w9, #0x61e8, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    cmp      w8, w23
    b.gt     #0x30ab68
    cmp      w8, w25
    b.gt     #0x30acf4
    mov      w9, #0x8604
    movk     w9, #0x8ba3, lsl #16
    cmp      w8, w9
    b.gt     #0x30ae80
    mov      w9, #0x8c2d
    movk     w9, #0x8665, lsl #16
    cmp      w8, w9
    b.gt     #0x30b220
    mov      w9, #0x887b
    movk     w9, #0x8075, lsl #16
    cmp      w8, w9
    b.eq     #0x30bd18
    mov      w9, #0x221d
    movk     w9, #0x8201, lsl #16
    cmp      w8, w9
    b.eq     #0x30b98c
    mov      w9, #0x2217
    movk     w9, #0x84e1, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldr      x8, [x19, #0x50]
    str      x8, [x19, #0x18]
    adrp     x8, #0x4be000
    ldr      x9, [x8, #0x338]
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x950]
    stp      x8, x9, [x19, #0xd8]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x830]
    str      x8, [x19, #0xd0]
    ldr      x8, [x19]
    mov      w9, #0xec54
    movk     w9, #0xb044, lsl #16
    str      w9, [x8]
    str      xzr, [x19, #0x48]
    b        #0x30aa10
    mov      w9, #0x150d
    movk     w9, #0xea74, lsl #16
    cmp      w8, w9
    b.gt     #0x30ad58
    mov      w9, #0xd0ec
    movk     w9, #0xe0b1, lsl #16
    cmp      w8, w9
    b.gt     #0x30aee0
    mov      w9, #0x1a0a
    movk     w9, #0xd9c1, lsl #16
    cmp      w8, w9
    b.gt     #0x30b278
    mov      w9, #0x4300
    movk     w9, #0xd338, lsl #16
    cmp      w8, w9
    b.eq     #0x30bd44
    mov      w9, #0x4206
    movk     w9, #0xd432, lsl #16
    cmp      w8, w9
    b.eq     #0x30b9a8
    mov      w9, #0x4ac2
    movk     w9, #0xd4ab, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldur     x0, [x29, #-0xd0]
    bl       #0x461c9c // _objc_release
    ldurb    w8, [x29, #-0xd1]
    cmp      w8, #0
    mov      w8, #0xb2d5
    movk     w8, #0x30c7, lsl #16
    mov      w9, #0xc063
    movk     w9, #0x33be, lsl #16
    b        #0x30aed8
    mov      w9, #0xd14f
    movk     w9, #0x61e8, lsl #16
    cmp      w8, w9
    b.gt     #0x30adc0
    mov      w9, #0x9344
    movk     w9, #0x5859, lsl #16
    cmp      w8, w9
    b.gt     #0x30b04c
    mov      w9, #0xe13a
    movk     w9, #0x4cad, lsl #16
    cmp      w8, w9
    b.gt     #0x30b608
    mov      w9, #0x9959
    movk     w9, #0x4758, lsl #16
    cmp      w8, w9
    b.eq     #0x30c220
    mov      w9, #0xfe4c
    movk     w9, #0x4837, lsl #16
    cmp      w8, w9
    b.eq     #0x30c018
    mov      w9, #0x85b
    movk     w9, #0x486a, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldp      x3, x2, [x29, #-0x90]
    ldr      x0, [x19, #0x1e0]
    ldr      x1, [x19, #0x1d0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x1c8]
    cmp      x0, #0
    mov      w8, #0xd275
    movk     w8, #0x37b8, lsl #16
    mov      w9, #0x9d16
    movk     w9, #0x6ca3, lsl #16
    b        #0x30bec4
    mov      w9, #0x8b6c
    movk     w9, #0x175f, lsl #16
    cmp      w8, w9
    b.gt     #0x30ae2c
    mov      w9, #0xa9e8
    movk     w9, #0xecc, lsl #16
    cmp      w8, w9
    b.gt     #0x30b124
    mov      w9, #0x8201
    movk     w9, #0xd85, lsl #16
    cmp      w8, w9
    b.eq     #0x30b8a4
    mov      w9, #0x19
    movk     w9, #0xe0e, lsl #16
    cmp      w8, w9
    b.eq     #0x30b7c0
    mov      w9, #0xbf4e
    movk     w9, #0xe94, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldur     x8, [x29, #-0xb8]
    str      x27, [x8]
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x98]
    str      x8, [x19, #0x78]
    ldr      x8, [x19]
    mov      w9, #0x9e60
    movk     w9, #0x448, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0x51ce
    movk     w9, #0xb4f1, lsl #16
    cmp      w8, w9
    b.gt     #0x30af48
    mov      w9, #0x5ae2
    movk     w9, #0xac70, lsl #16
    cmp      w8, w9
    b.gt     #0x30b2d4
    mov      w9, #0x9257
    movk     w9, #0x97c4, lsl #16
    cmp      w8, w9
    b.eq     #0x30bd74
    mov      w9, #0x53cd
    movk     w9, #0xa30e, lsl #16
    cmp      w8, w9
    b.eq     #0x30b9c4
    mov      w9, #0xe13c
    movk     w9, #0xa350, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldr      x8, [x19]
    mov      w9, #0xa9e9
    movk     w9, #0xecc, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0xb4fc
    movk     w9, #0xfce7, lsl #16
    cmp      w8, w9
    b.gt     #0x30afa8
    mov      w9, #0xeebb
    movk     w9, #0xf04b, lsl #16
    cmp      w8, w9
    b.gt     #0x30b320
    cmp      w8, w21
    b.eq     #0x30bd90
    mov      w9, #0x323a
    movk     w9, #0xedf4, lsl #16
    cmp      w8, w9
    b.eq     #0x30b9f0
    mov      w9, #0xbe
    movk     w9, #0xef1c, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldur     x8, [x29, #-0x98]
    add      x8, x8, #8
    str      x8, [x19, #0x148]
    ldr      x8, [x19]
    mov      w9, #0x6059
    movk     w9, #0xb165, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0x93fa
    movk     w9, #0x6ef0, lsl #16
    cmp      w8, w9
    b.gt     #0x30b0bc
    mov      w9, #0x8d02
    movk     w9, #0x66c8, lsl #16
    cmp      w8, w9
    b.gt     #0x30b654
    mov      w9, #0xd150
    movk     w9, #0x61e8, lsl #16
    cmp      w8, w9
    b.eq     #0x30c248
    mov      w9, #0xaf36
    movk     w9, #0x63da, lsl #16
    cmp      w8, w9
    b.eq     #0x30c038
    mov      w9, #0x516e
    movk     w9, #0x6668, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldr      x0, [x19, #0x1e8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19]
    mov      w9, #0xcd0d
    movk     w9, #0x3fcf, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0x683d
    movk     w9, #0x1b54, lsl #16
    cmp      w8, w9
    b.gt     #0x30b170
    mov      w9, #0x8b6d
    movk     w9, #0x175f, lsl #16
    cmp      w8, w9
    b.eq     #0x30b8d0
    mov      w9, #0x69b
    movk     w9, #0x18d0, lsl #16
    cmp      w8, w9
    b.eq     #0x30b7e4
    mov      w9, #0x6564
    movk     w9, #0x1a60, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldr      x8, [x19]
    mov      w9, #0x4b0f
    movk     w9, #0xe360, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0xaa4a
    movk     w9, #0x8ee1, lsl #16
    cmp      w8, w9
    b.gt     #0x30b380
    mov      w9, #0x8605
    movk     w9, #0x8ba3, lsl #16
    cmp      w8, w9
    b.eq     #0x30bdc0
    mov      w9, #0x5fe2
    movk     w9, #0x8c39, lsl #16
    cmp      w8, w9
    b.eq     #0x30ba18
    mov      w9, #0x325
    movk     w9, #0x8d1a, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldrb     w8, [x19, #0x1ff]
    cmp      w8, #0
    mov      w8, #0x93fb
    movk     w8, #0x6ef0, lsl #16
    mov      w9, #0xc157
    movk     w9, #0x5e00, lsl #16
    csel     w8, w9, w8, ne
    b        #0x30c1bc
    mov      w9, #0x5c75
    movk     w9, #0xe3dd, lsl #16
    cmp      w8, w9
    b.gt     #0x30b3c8
    mov      w9, #0xd0ed
    movk     w9, #0xe0b1, lsl #16
    cmp      w8, w9
    b.eq     #0x30bddc
    mov      w9, #0x262a
    movk     w9, #0xe343, lsl #16
    cmp      w8, w9
    b.eq     #0x30ba44
    mov      w9, #0x4b0f
    movk     w9, #0xe360, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldr      x8, [x19, #0x148]
    ldr      x8, [x8]
    ldr      x9, [x19, #0x20]
    add      x8, x8, x9, lsl #3
    str      x8, [x19, #0x130]
    ldr      x8, [x19]
    mov      w9, #0xa2a8
    movk     w9, #0x3c85, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0xa681
    movk     w9, #0xc8ce, lsl #16
    cmp      w8, w9
    b.gt     #0x30b510
    mov      w9, #0x51cf
    movk     w9, #0xb4f1, lsl #16
    cmp      w8, w9
    b.eq     #0x30be2c
    mov      w9, #0xdad6
    movk     w9, #0xb54d, lsl #16
    cmp      w8, w9
    b.eq     #0x30bac4
    mov      w9, #0xde38
    movk     w9, #0xc7a8, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x5f0]
    stur     x8, [x29, #-0xc0]
    ldr      x8, [x19]
    mov      w9, #0xb797
    movk     w9, #0x5bba, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0xcd49
    movk     w9, #0xfff0, lsl #16
    cmp      w8, w9
    b.gt     #0x30b54c
    mov      w9, #0xb4fd
    movk     w9, #0xfce7, lsl #16
    cmp      w8, w9
    b.eq     #0x30be60
    mov      w9, #0x9f33
    movk     w9, #0xfea8, lsl #16
    cmp      w8, w9
    b.eq     #0x30bb00
    mov      w9, #0xe31d
    movk     w9, #0xff7d, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldur     x8, [x29, #-0xa8]
    ldr      x9, [x8, #0x10]!
    stp      x9, x8, [x19, #0xf8]
    ldr      x8, [x19]
    mov      w9, #0x5c76
    movk     w9, #0xe3dd, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0x40d9
    movk     w9, #0x4323, lsl #16
    cmp      w8, w9
    b.gt     #0x30b5a4
    mov      w9, #0xa2a8
    movk     w9, #0x3c85, lsl #16
    cmp      w8, w9
    b.eq     #0x30c1c8
    mov      w9, #0xecef
    movk     w9, #0x3d56, lsl #16
    cmp      w8, w9
    b.eq     #0x30bfac
    mov      w9, #0xcd0d
    movk     w9, #0x3fcf, lsl #16
    cmp      w8, w9
    b.eq     #0x30b694
    b        #0x30aa10
    mov      w9, #0x5849
    movk     w9, #0x5e8e, lsl #16
    cmp      w8, w9
    b.gt     #0x30b6a8
    mov      w9, #0x9345
    movk     w9, #0x5859, lsl #16
    cmp      w8, w9
    b.eq     #0x30c2c0
    mov      w9, #0xb797
    movk     w9, #0x5bba, lsl #16
    cmp      w8, w9
    b.eq     #0x30c068
    mov      w9, #0xc157
    movk     w9, #0x5e00, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x9f0]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x1f0]
    ldr      x8, [x19]
    mov      w9, #0xa11
    movk     w9, #0xd0f0, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0x5e26
    movk     w9, #0x72a6, lsl #16
    cmp      w8, w9
    b.gt     #0x30b6f4
    mov      w9, #0x93fb
    movk     w9, #0x6ef0, lsl #16
    cmp      w8, w9
    b.eq     #0x30c2e4
    mov      w9, #0x7c0c
    movk     w9, #0x704b, lsl #16
    cmp      w8, w9
    b.eq     #0x30c0cc
    mov      w9, #0xb1e0
    movk     w9, #0x705f, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldr      x8, [x19, #0xb0]
    ldr      x9, [x19, #0x18]
    cmp      x8, x9
    cset     w8, eq
    strb     w8, [x19, #0xaf]
    ldr      x8, [x19]
    mov      w9, #0x584a
    movk     w9, #0x5e8e, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0xa9e9
    movk     w9, #0xecc, lsl #16
    cmp      w8, w9
    b.eq     #0x30b8fc
    mov      w9, #0x5aa2
    movk     w9, #0x127b, lsl #16
    cmp      w8, w9
    b.eq     #0x30b874
    mov      w9, #0x6d90
    movk     w9, #0x15a5, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldrb     w8, [x19, #0x1df]
    cmp      w8, #0
    mov      w8, #0xeb0d
    movk     w8, #0x342d, lsl #16
    mov      w9, #0x7c0c
    movk     w9, #0x704b, lsl #16
    b        #0x30c1b8
    mov      w9, #0x683e
    movk     w9, #0x1b54, lsl #16
    cmp      w8, w9
    b.eq     #0x30b924
    mov      w9, #0x1c39
    movk     w9, #0x1f0e, lsl #16
    cmp      w8, w9
    b.eq     #0x30b888
    mov      w9, #0xb727
    movk     w9, #0x236f, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldr      x8, [x19, #0x60]
    str      x8, [x19, #0x28]
    adrp     x8, #0x4c1000
    ldr      x9, [x8, #0x950]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xc58]
    stp      x8, x9, [x19, #0x138]
    ldr      x8, [x19]
    mov      w9, #0x9268
    movk     w9, #0x9442, lsl #16
    str      w9, [x8]
    str      xzr, [x19, #0x58]
    b        #0x30aa10
    mov      w9, #0xeb0d
    movk     w9, #0x342d, lsl #16
    cmp      w8, w9
    b.eq     #0x30b968
    mov      w9, #0x214c
    movk     w9, #0x34e3, lsl #16
    cmp      w8, w9
    b.eq     #0x30b944
    mov      w9, #0xd275
    movk     w9, #0x37b8, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldr      x0, [x19, #0x1e0]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19]
    mov      w9, #0x6d90
    movk     w9, #0x15a5, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0x8c2e
    movk     w9, #0x8665, lsl #16
    cmp      w8, w9
    b.eq     #0x30be80
    mov      w9, #0xbf30
    movk     w9, #0x8790, lsl #16
    cmp      w8, w9
    b.eq     #0x30bb1c
    mov      w9, #0x5548
    movk     w9, #0x8aea, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldr      x8, [x19, #0x180]
    ldr      x9, [x19, #0x38]
    cmp      x8, x9
    cset     w8, eq
    strb     w8, [x19, #0x17f]
    ldr      x8, [x19]
    mov      w9, #0xd5f4
    movk     w9, #0x451b, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0x1a0b
    movk     w9, #0xd9c1, lsl #16
    cmp      w8, w9
    b.eq     #0x30beac
    mov      w9, #0xe00a
    movk     w9, #0xddbb, lsl #16
    cmp      w8, w9
    b.eq     #0x30bb3c
    mov      w9, #0xa964
    movk     w9, #0xdf3f, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldp      x2, x1, [x19, #0x198]
    ldr      x0, [x19, #0x190]
    bl       #0x461c6c // _objc_msgSend
    strb     w0, [x19, #0x18f]
    ldr      x0, [x19, #0x190]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19]
    mov      w9, #0xd178
    movk     w9, #0x5e9c, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0x5ae3
    movk     w9, #0xac70, lsl #16
    cmp      w8, w9
    b.eq     #0x30becc
    mov      w9, #0xec54
    movk     w9, #0xb044, lsl #16
    cmp      w8, w9
    b.eq     #0x30bb50
    mov      w9, #0x6059
    movk     w9, #0xb165, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldr      x8, [x19]
    mov      w9, #0xb727
    movk     w9, #0x236f, lsl #16
    str      w9, [x8]
    ldr      x8, [x19, #0x160]
    str      x8, [x19, #0x60]
    b        #0x30aa10
    mov      w9, #0xeebc
    movk     w9, #0xf04b, lsl #16
    cmp      w8, w9
    b.eq     #0x30bee8
    mov      w9, #0x11b6
    movk     w9, #0xf2e6, lsl #16
    cmp      w8, w9
    b.eq     #0x30bb80
    mov      w9, #0xcd27
    movk     w9, #0xfb02, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xc38]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x208]
    ldr      x8, [x19]
    mov      w9, #0xcd4a
    movk     w9, #0xfff0, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0xaa4b
    movk     w9, #0x8ee1, lsl #16
    cmp      w8, w9
    b.eq     #0x30bf0c
    mov      w9, #0x9268
    movk     w9, #0x9442, lsl #16
    cmp      w8, w9
    b.eq     #0x30bbac
    mov      w9, #0x51fe
    movk     w9, #0x95e2, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldurb    w8, [x29, #-0x75]
    cmp      w8, #0
    mov      w8, #0x8b6d
    movk     w8, #0x175f, lsl #16
    csel     w8, w8, w21, ne
    b        #0x30c1bc
    mov      w9, #0x5c76
    movk     w9, #0xe3dd, lsl #16
    cmp      w8, w9
    b.eq     #0x30bf38
    mov      w9, #0x4da7
    movk     w9, #0xe7be, lsl #16
    cmp      w8, w9
    b.eq     #0x30bbd8
    mov      w9, #0x85c2
    movk     w9, #0xe81a, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5f0]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    ldr      x0, [x19, #0x90]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x88]
    ldr      x0, [x19, #0x90]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x528]
    ldr      x0, [x19, #0x88]
    adrp     x2, #0x546000
    add      x2, x2, #0xdb0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x80]
    adrp     x8, #0x4c1000
    ldr      x25, [x8, #0x950]
    mov      x0, x22
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x26, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xa08]
    ldr      x2, [x19, #0x80]
    bl       #0x461c6c // _objc_msgSend
    mov      x21, x24
    mov      x24, x27
    mov      x27, x0
    mov      x0, x26
    mov      w26, #0xa682
    movk     w26, #0xc8ce, lsl #16
    bl       #0x461c9c // _objc_release
    mov      x0, x22
    mov      x1, x25
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    cmp      w27, #0
    mov      x27, x24
    mov      x24, x21
    mov      w21, #0x150e
    movk     w21, #0xea74, lsl #16
    adrp     x8, #0x4be000
    add      x8, x8, #0xc58
    adrp     x9, #0x4be000
    add      x9, x9, #0x830
    csel     x8, x8, x9, ne
    ldr      x1, [x8]
    ldr      x2, [x19, #0x80]
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    mov      w25, #0x9256
    movk     w25, #0x97c4, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19]
    mov      w9, #0x5672
    movk     w9, #0x6e5e, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    cmp      w8, w26
    b.eq     #0x30bf60
    mov      w9, #0xa11
    movk     w9, #0xd0f0, lsl #16
    cmp      w8, w9
    b.eq     #0x30bbfc
    mov      w9, #0x9ba3
    movk     w9, #0xd321, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldr      x8, [x19]
    mov      w9, #0xecef
    movk     w9, #0x3d56, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0xcd4a
    movk     w9, #0xfff0, lsl #16
    cmp      w8, w9
    b.eq     #0x30bf84
    mov      w9, #0x9e60
    movk     w9, #0x448, lsl #16
    cmp      w8, w9
    b.eq     #0x30bca8
    mov      w9, #0x430d
    movk     w9, #0xbd6, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldrb     w8, [x19, #0x117]
    cmp      w8, #0
    mov      w8, #0xb727
    movk     w8, #0x236f, lsl #16
    csel     w8, w26, w8, ne
    ldr      x9, [x19]
    str      w8, [x9]
    ldr      x8, [x19, #0x118]
    str      x8, [x19, #0x60]
    b        #0x30aa10
    mov      w9, #0x40da
    movk     w9, #0x4323, lsl #16
    cmp      w8, w9
    b.eq     #0x30c200
    mov      w9, #0xd5f4
    movk     w9, #0x451b, lsl #16
    cmp      w8, w9
    b.eq     #0x30bfe8
    mov      w9, #0xaf18
    movk     w9, #0x4589, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldr      x1, [x19, #0xd8]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0xb8]
    ldp      x2, x1, [x19, #0xc8]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19]
    mov      w9, #0x44af
    movk     w9, #0x5f36, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0xe13b
    movk     w9, #0x4cad, lsl #16
    cmp      w8, w9
    b.eq     #0x30c314
    mov      w9, #0xa8b3
    movk     w9, #0x5213, lsl #16
    cmp      w8, w9
    b.eq     #0x30c0f0
    mov      w9, #0x885d
    movk     w9, #0x54b4, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldr      x0, [x19, #0x40]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19]
    mov      w9, #0xb2d5
    movk     w9, #0x30c7, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0x8d03
    movk     w9, #0x66c8, lsl #16
    cmp      w8, w9
    b.eq     #0x30c370
    mov      w9, #0x9d16
    movk     w9, #0x6ca3, lsl #16
    cmp      w8, w9
    b.eq     #0x30c124
    mov      w9, #0x5672
    movk     w9, #0x6e5e, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldr      x0, [x19, #0x80]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x88]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19]
    mov      w9, #0xbf4e
    movk     w9, #0xe94, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0x584a
    movk     w9, #0x5e8e, lsl #16
    cmp      w8, w9
    b.eq     #0x30c384
    mov      w9, #0xd178
    movk     w9, #0x5e9c, lsl #16
    cmp      w8, w9
    b.eq     #0x30c144
    mov      w9, #0x44af
    movk     w9, #0x5f36, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldr      x0, [x19, #0xb8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19]
    mov      w9, #0xe00a
    movk     w9, #0xddbb, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      w9, #0x5e27
    movk     w9, #0x72a6, lsl #16
    cmp      w8, w9
    b.eq     #0x30c3b4
    mov      w9, #0xeff
    movk     w9, #0x7adb, lsl #16
    cmp      w8, w9
    b.eq     #0x30c160
    mov      w9, #0xd9e0
    movk     w9, #0x7df9, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldurb    w8, [x29, #-0x76]
    adrp     x9, #0x546000
    add      x9, x9, #0xd3c
    strb     w8, [x9]
    adrp     x11, #0x546000
    add      x11, x11, #0xd35
    ldrb     w8, [x11]
    mov      w10, #0x52
    eor      w8, w8, w10
    strb     w8, [x9, #1]
    ldrb     w8, [x11, #1]
    mov      w10, #0x72
    eor      w8, w8, w10
    strb     w8, [x9, #2]
    ldrb     w8, [x11, #2]
    mov      w10, #0x84
    eor      w8, w8, w10
    strb     w8, [x9, #3]
    ldr      x8, [x19]
    str      w21, [x8]
    b        #0x30aa10
    mov      w9, #0xb2d5
    movk     w9, #0x30c7, lsl #16
    cmp      w8, w9
    b.ne     #0x30c3f8
    mov      x0, x27
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19]
    mov      w9, #0x4e6d
    movk     w9, #0x3313, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    mov      x0, x24
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19]
    mov      w9, #0xb436
    movk     w9, #0x238f, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldr      x8, [x19, #0x118]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [x19, #0x117]
    ldr      x8, [x19]
    mov      w9, #0x430d
    movk     w9, #0xbd6, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldur     x26, [x29, #-0x80]
    adrp     x8, #0x30c000
    add      x9, x8, #0x448
    adrp     x8, #0x4a1000
    add      x8, x8, #0xba0
    stp      x9, x8, [x26, #0x10]
    ldr      x8, [x19, #0x208]
    str      x8, [x26, #0x28]
    ldur     x0, [x29, #-0xf8]
    bl       #0x461ca8 // _objc_retain
    ldur     x8, [x29, #-0xf8]
    str      x8, [x26, #0x20]
    adrp     x8, #0x4bf000
    ldr      x25, [x8, #0xb38]
    ldr      x0, [x19, #0x208]
    bl       #0x461ca8 // _objc_retain
    ldur     x3, [x29, #-0x80]
    mov      x0, x22
    mov      x1, x25
    mov      w25, #0x9256
    movk     w25, #0x97c4, lsl #16
    mov      w2, #1
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x26, #0x20]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x26, #0x28]
    mov      w26, #0xa682
    movk     w26, #0xc8ce, lsl #16
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x208]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19]
    mov      w9, #0x885d
    movk     w9, #0x54b4, lsl #16
    str      w9, [x8]
    b        #0x30be20
    ldr      x8, [x19, #0x108]
    cmp      x8, #0
    mov      w8, #0xe31d
    movk     w8, #0xff7d, lsl #16
    b        #0x30bba4
    ldr      x0, [x19, #0x1e0]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19]
    mov      w9, #0x8d03
    movk     w9, #0x66c8, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldp      x3, x2, [x29, #-0xa0]
    ldr      x0, [x19, #0x1e0]
    ldr      x1, [x19, #0x1d0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x118]
    ldr      x8, [x19]
    mov      w9, #0x19
    movk     w9, #0xe0e, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    adrp     x8, #0x546000
    ldrb     w8, [x8, #0xd40]
    mov      w9, #0x6a
    eor      w8, w8, w9
    adrp     x9, #0x546000
    strb     w8, [x9, #0xd42]
    ldr      x8, [x19]
    mov      w9, #0x262a
    movk     w9, #0xe343, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldr      x8, [x19, #0xe8]
    ldr      x8, [x8]
    ldr      x9, [x19, #0x10]
    ldr      x8, [x8, x9, lsl #3]
    str      x8, [x19, #0xc8]
    ldr      x8, [x19]
    mov      w9, #0x4da7
    movk     w9, #0xe7be, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldr      x8, [x19, #0x10]
    add      x8, x8, #1
    str      x8, [x19, #0xb0]
    ldr      x8, [x19]
    mov      w9, #0xb1e0
    movk     w9, #0x705f, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldur     w8, [x29, #-0x74]
    cmp      w8, #0
    cset     w8, eq
    sturb    w8, [x29, #-0x75]
    ldr      x8, [x19]
    mov      w9, #0x51fe
    movk     w9, #0x95e2, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldur     x8, [x29, #-0xa8]
    movi     v0.16b, #0
    stp      q0, q0, [x8]
    stp      q0, q0, [x8, #0x20]
    ldr      x8, [x19]
    mov      w9, #0xa8b3
    movk     w9, #0x5213, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldr      x0, [x19, #0x1e0]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x19]
    mov      w9, #0x9ba3
    movk     w9, #0xd321, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldr      x0, [x19, #0x1e0]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x19]
    mov      w9, #0x6564
    movk     w9, #0x1a60, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldp      x3, x2, [x29, #-0x90]
    ldr      x0, [x19, #0x1e0]
    ldr      x1, [x19, #0x1d0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x170]
    ldr      x8, [x19]
    mov      w9, #0xeebc
    movk     w9, #0xf04b, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldrb     w8, [x19, #0x9f]
    cmp      w8, #0
    mov      w8, #0x2217
    movk     w8, #0x84e1, lsl #16
    csel     w8, w26, w8, ne
    ldr      x9, [x19]
    str      w8, [x9]
    ldr      x8, [x19, #0xa0]
    str      x8, [x19, #0x50]
    b        #0x30aa10
    ldr      x8, [x19, #0x68]
    str      x8, [x19, #0x30]
    ldp      x9, x8, [x19, #0x1b8]
    ldr      x8, [x8]
    ldr      x8, [x8]
    cmp      x8, x9
    mov      w8, #0xecef
    movk     w8, #0x3d56, lsl #16
    mov      w9, #0x221d
    movk     w9, #0x8201, lsl #16
    b        #0x30bec4
    adrp     x8, #0x546000
    ldrb     w8, [x8, #0xd41]
    mov      w9, #0x2f
    eor      w8, w8, w9
    adrp     x9, #0x546000
    strb     w8, [x9, #0xd43]
    adrp     x9, #0x546000
    add      x9, x9, #0xd30
    ldrb     w8, [x9]
    eor      w8, w8, #0x40
    adrp     x10, #0x546000
    add      x10, x10, #0xd38
    strb     w8, [x10]
    ldrb     w8, [x9, #1]
    eor      w8, w8, #0xffffff87
    strb     w8, [x10, #1]
    ldrb     w8, [x9, #2]
    mov      w11, #0x92
    eor      w8, w8, w11
    strb     w8, [x10, #2]
    ldrb     w8, [x9, #3]
    eor      w8, w8, #8
    strb     w8, [x10, #3]
    ldrb     w8, [x9, #4]
    mov      w9, #0x98
    eor      w8, w8, w9
    sturb    w8, [x29, #-0x76]
    ldr      x8, [x19]
    mov      w9, #0xd9e0
    movk     w9, #0x7df9, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    adrp     x8, #0x4c4000
    ldr      x0, [x8, #0x570]
    bl       #0x461bac // _objc_alloc_init
    mov      x25, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xa10]
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19]
    mov      w9, #0x885d
    movk     w9, #0x54b4, lsl #16
    str      w9, [x8]
    str      x25, [x19, #0x40]
    mov      w25, #0x9256
    movk     w25, #0x97c4, lsl #16
    b        #0x30aa10
    ldr      x0, [x19, #0x1e0]
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [x19]
    mov      w9, #0x11b6
    movk     w9, #0xf2e6, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldur     x8, [x29, #-0x100]
    cmp      x8, #0
    mov      w8, #0x885d
    movk     w8, #0x54b4, lsl #16
    mov      w9, #0xaf36
    movk     w9, #0x63da, lsl #16
    csel     w8, w8, w9, eq
    b        #0x30be18
    ldr      x8, [x19]
    mov      w9, #0x683e
    movk     w9, #0x1b54, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldr      x8, [x19, #0x48]
    str      x8, [x19, #0x10]
    ldr      x8, [x19, #0x100]
    ldr      x8, [x8]
    ldr      x8, [x8]
    ldr      x9, [x19, #0xf0]
    cmp      x8, x9
    mov      w8, #0xa9e9
    movk     w8, #0xecc, lsl #16
    mov      w9, #0x8605
    movk     w9, #0x8ba3, lsl #16
    b        #0x30bec4
    ldp      x3, x2, [x29, #-0xa0]
    ldr      x0, [x19, #0x1e0]
    ldr      x1, [x19, #0x1d0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x160]
    cmp      x0, #0
    mov      w8, #0x9959
    movk     w8, #0x4758, lsl #16
    csel     w8, w26, w8, eq
    b        #0x30c1bc
    ldr      x8, [x19, #0x58]
    str      x8, [x19, #0x20]
    ldp      x9, x8, [x19, #0x150]
    ldr      x8, [x8]
    ldr      x8, [x8]
    cmp      x8, x9
    mov      w8, #0x4b0f
    movk     w8, #0xe360, lsl #16
    mov      w9, #0x4206
    movk     w9, #0xd432, lsl #16
    b        #0x30bec4
    ldr      x1, [x19, #0xe0]
    ldr      x0, [x19, #0xc8]
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0xc0]
    ldr      x8, [x19]
    mov      w9, #0x1a0b
    movk     w9, #0xd9c1, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x5f0]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x2, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x608]
    ldr      x0, [x19, #0x1f0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x1e8]
    ldr      x0, [x19, #0x1f0]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x528]
    ldr      x0, [x19, #0x1e8]
    adrp     x2, #0x546000
    add      x2, x2, #0xd70
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x1e0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #0
    cset     w8, eq
    strb     w8, [x19, #0x1df]
    ldur     x8, [x29, #-0x88]
    movi     v0.16b, #0
    stp      q0, q0, [x8]
    stp      q0, q0, [x8, #0x20]
    ldr      x0, [x19, #0x1e0]
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0x478]
    str      x8, [x19, #0x1d0]
    ldr      x8, [x19]
    mov      w9, #0x85b
    movk     w9, #0x486a, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x470]
    ldur     x2, [x29, #-0xb8]
    ldr      x0, [x19, #0x78]
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xa08]
    mov      x0, x24
    mov      x2, x25
    mov      w3, #5
    bl       #0x461c6c // _objc_msgSend
    mov      x0, x25
    mov      w25, #0x9256
    movk     w25, #0x97c4, lsl #16
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x918]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    ldr      x8, [x19]
    mov      w9, #0xdad6
    movk     w9, #0xb54d, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldr      x8, [x19, #0x1c0]
    ldr      x8, [x8]
    ldr      x9, [x8]
    ldur     x8, [x29, #-0x88]
    add      x8, x8, #8
    stp      x8, x9, [x19, #0x1b0]
    ldr      x8, [x19]
    mov      w9, #0x5ae3
    movk     w9, #0xac70, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldrb     w8, [x19, #0x16f]
    cmp      w8, #0
    mov      w8, #0x51cf
    movk     w8, #0xb4f1, lsl #16
    mov      w9, #0xd275
    movk     w9, #0x37b8, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [x19]
    str      w8, [x9]
    ldr      x8, [x19, #0x170]
    str      x8, [x19, #0x70]
    b        #0x30aa10
    ldr      x8, [x19]
    mov      w9, #0x2217
    movk     w9, #0x84e1, lsl #16
    str      w9, [x8]
    ldr      x8, [x19, #0x108]
    str      x8, [x19, #0x50]
    b        #0x30aa10
    adrp     x8, #0x580000
    add      x8, x8, #0x8c8
    mov      w9, #1
    stlr     w9, [x8]
    sub      x8, sp, #0x30
    mov      sp, x8
    stur     x8, [x29, #-0x80]
    ldr      x8, [x19]
    mov      w9, #0xe13b
    movk     w9, #0x4cad, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldr      x0, [x19, #0x1e0]
    bl       #0x461c24 // _objc_enumerationMutation
    ldr      x8, [x19]
    mov      w9, #0xe13c
    movk     w9, #0xa350, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldur     x2, [x29, #-0xf8]
    ldr      x0, [x19, #0x218]
    ldr      x1, [x19, #0x210]
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    ldr      x0, [x19, #0x218]
    bl       #0x461c9c // _objc_release
    cmp      w25, #0
    mov      w25, #0x9256
    movk     w25, #0x97c4, lsl #16
    mov      w8, #0x885d
    movk     w8, #0x54b4, lsl #16
    mov      w9, #0xcd27
    movk     w9, #0xfb02, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [x19]
    str      w8, [x9]
    ldur     x8, [x29, #-0xf8]
    str      x8, [x19, #0x40]
    b        #0x30aa10
    ldr      x8, [x19, #0x70]
    str      x8, [x19, #0x38]
    adrp     x8, #0x4c1000
    ldr      x9, [x8, #0x950]
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xa08]
    stp      x8, x9, [x19, #0x1a0]
    ldr      x8, [x19]
    mov      w9, #0x5fe2
    movk     w9, #0x8c39, lsl #16
    str      w9, [x8]
    str      xzr, [x19, #0x68]
    b        #0x30aa10
    ldr      x8, [x19, #0x30]
    add      x8, x8, #1
    str      x8, [x19, #0x180]
    ldr      x8, [x19]
    mov      w9, #0x5548
    movk     w9, #0x8aea, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldp      x3, x2, [x29, #-0xb0]
    ldr      x0, [x19, #0x1e0]
    ldr      x1, [x19, #0x1d0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0xa0]
    ldr      x8, [x19]
    mov      w9, #0x9345
    movk     w9, #0x5859, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldr      x8, [x19, #0xc0]
    cmp      x8, #0
    mov      w8, #0x683e
    movk     w8, #0x1b54, lsl #16
    mov      w9, #0xaf18
    movk     w9, #0x4589, lsl #16
    csel     w8, w8, w9, eq
    b        #0x30c1bc
    ldr      x8, [x19]
    mov      w9, #0x51cf
    movk     w9, #0xb4f1, lsl #16
    str      w9, [x8]
    ldr      x8, [x19, #0x1c8]
    str      x8, [x19, #0x70]
    b        #0x30aa10
    ldr      x8, [x19, #0x170]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [x19, #0x16f]
    ldr      x8, [x19]
    mov      w9, #0x4300
    movk     w9, #0xd338, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldr      x1, [x19, #0x200]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    cmp      x0, #2
    cset     w8, eq
    strb     w8, [x19, #0x1ff]
    ldr      x8, [x19]
    mov      w9, #0x325
    movk     w9, #0x8d1a, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldr      x8, [x19, #0xf8]
    ldr      x9, [x8]
    ldur     x8, [x29, #-0xa8]
    add      x8, x8, #8
    stp      x8, x9, [x19, #0xe8]
    ldr      x8, [x19]
    mov      w9, #0x9257
    movk     w9, #0x97c4, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldr      x0, [x19, #0x1e0]
    bl       #0x461c9c // _objc_release
    ldr      x0, [x19, #0x1e0]
    bl       #0x461c9c // _objc_release
    ldr      x8, [x19]
    mov      w9, #0x516e
    movk     w9, #0x6668, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldur     x8, [x29, #-0x80]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x748]
    str      x9, [x8]
    str      d8, [x8, #8]
    ldr      x8, [x19]
    mov      w9, #0x69b
    movk     w9, #0x18d0, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldp      x1, x8, [x19, #0x1a8]
    ldr      x8, [x8]
    ldr      x9, [x19, #0x30]
    ldr      x8, [x8, x9, lsl #3]
    str      x8, [x19, #0x198]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x190]
    ldr      x8, [x19]
    mov      w9, #0xa964
    movk     w9, #0xdf3f, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldrb     w8, [x19, #0x17f]
    cmp      w8, #0
    mov      w8, #0x5fe2
    movk     w8, #0x8c39, lsl #16
    mov      w9, #0x53cd
    movk     w9, #0xa30e, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [x19]
    str      w8, [x9]
    ldr      x8, [x19, #0x180]
    str      x8, [x19, #0x68]
    b        #0x30aa10
    adrp     x8, #0x4c1000
    ldr      x8, [x8, #0x938]
    str      x8, [x19, #0x200]
    ldr      x8, [x19]
    mov      w9, #0xaa4b
    movk     w9, #0x8ee1, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0xa00]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x218]
    ldr      x8, [x19]
    mov      w9, #0x40da
    movk     w9, #0x4323, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldur     x1, [x29, #-0xc0]
    mov      x0, x27
    bl       #0x461c6c // _objc_msgSend
    mov      x25, x0
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x9f8]
    stur     x1, [x29, #-0xc8]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xd0]
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x600]
    bl       #0x461c6c // _objc_msgSend
    cmp      x25, x0
    mov      w25, #0x9256
    movk     w25, #0x97c4, lsl #16
    cset     w8, lt
    sturb    w8, [x29, #-0xd1]
    ldr      x8, [x19]
    mov      w9, #0x4ac2
    movk     w9, #0xd4ab, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldur     x8, [x29, #-0x98]
    movi     v0.16b, #0
    stp      q0, q0, [x8]
    stp      q0, q0, [x8, #0x20]
    ldr      x8, [x19]
    mov      w9, #0x9f33
    movk     w9, #0xfea8, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldr      x0, [x19, #0x1e0]
    bl       #0x461ca8 // _objc_retain
    ldp      x3, x2, [x29, #-0xb0]
    ldr      x0, [x19, #0x1e0]
    ldr      x1, [x19, #0x1d0]
    mov      w4, #0x10
    bl       #0x461c6c // _objc_msgSend
    str      x0, [x19, #0x108]
    ldr      x8, [x19]
    mov      w9, #0x5aa2
    movk     w9, #0x127b, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldur     x8, [x29, #-0x88]
    add      x8, x8, #0x10
    str      x8, [x19, #0x1c0]
    ldr      x8, [x19]
    mov      w9, #0x887b
    movk     w9, #0x8075, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldrb     w8, [x19, #0x18f]
    cmp      w8, #0
    mov      w8, #0xb4fd
    movk     w8, #0xfce7, lsl #16
    mov      w9, #0x1c39
    movk     w9, #0x1f0e, lsl #16
    b        #0x30c1b8
    sub      x8, sp, #0x10
    mov      sp, x8
    stur     x8, [x29, #-0xb8]
    mov      x0, x24
    bl       #0x461ca8 // _objc_retain
    mov      x0, x27
    bl       #0x461ca8 // _objc_retain
    adrp     x8, #0x4c0000
    ldr      x1, [x8, #0x738]
    mov      x0, x24
    mov      x2, x27
    mov      w3, #1
    bl       #0x461c6c // _objc_msgSend
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x8b8]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    cmp      w0, #0
    mov      w8, #0xde38
    movk     w8, #0xc7a8, lsl #16
    mov      w9, #0xfe4c
    movk     w9, #0x4837, lsl #16
    csel     w8, w8, w9, ne
    ldr      x9, [x19]
    str      w8, [x9]
    b        #0x30aa10
    ldr      x8, [x19, #0x130]
    ldr      x8, [x8]
    str      x8, [x19, #0x128]
    ldr      x1, [x19, #0x140]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x120]
    ldr      x8, [x19]
    mov      w9, #0x5e27
    movk     w9, #0x72a6, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    adrp     x8, #0x4be000
    ldr      x8, [x8, #0xa08]
    str      x8, [x19, #0x210]
    ldr      x8, [x19]
    mov      w9, #0xd0ed
    movk     w9, #0xe0b1, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldur     x8, [x29, #-0x98]
    ldr      x9, [x8, #0x10]!
    str      x8, [x19, #0x158]
    ldr      x8, [x9]
    str      x8, [x19, #0x150]
    ldr      x8, [x19]
    mov      w9, #0xbe
    movk     w9, #0xef1c, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldp      x2, x0, [x29, #-0xe8]
    ldur     x1, [x29, #-0xf0]
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x25, x0
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x528]
    adrp     x2, #0x546000
    add      x2, x2, #0xdb0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    stur     x0, [x29, #-0xf8]
    mov      x0, x25
    mov      w25, #0x9256
    movk     w25, #0x97c4, lsl #16
    bl       #0x461c9c // _objc_release
    ldur     x0, [x29, #-0xe0]
    bl       #0x461c9c // _objc_release
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0x338]
    ldur     x0, [x29, #-0xf8]
    bl       #0x461c6c // _objc_msgSend
    stur     x0, [x29, #-0x100]
    ldr      x8, [x19]
    mov      w9, #0xbf30
    movk     w9, #0x8790, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldr      x8, [x19, #0xa0]
    cmp      x8, #0
    cset     w8, eq
    strb     w8, [x19, #0x9f]
    ldr      x8, [x19]
    mov      w9, #0x323a
    movk     w9, #0xedf4, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    adrp     x8, #0x4c1000
    ldr      x1, [x8, #0x9f8]
    mov      x0, x22
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    str      x0, [x19, #0x90]
    ldr      x8, [x19]
    mov      w9, #0x85c2
    movk     w9, #0xe81a, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    sub      x8, sp, #0x40
    mov      sp, x8
    stur     x8, [x29, #-0x88]
    sub      x8, sp, #0x80
    mov      sp, x8
    stur     x8, [x29, #-0x90]
    sub      x8, sp, #0x40
    mov      sp, x8
    stur     x8, [x29, #-0x98]
    sub      x8, sp, #0x80
    mov      sp, x8
    stur     x8, [x29, #-0xa0]
    sub      x8, sp, #0x40
    mov      sp, x8
    stur     x8, [x29, #-0xa8]
    sub      x8, sp, #0x80
    mov      sp, x8
    stur     x8, [x29, #-0xb0]
    ldr      x8, [x19]
    mov      w9, #0xeff
    movk     w9, #0x7adb, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldr      x8, [x19]
    mov      w9, #0xeb0d
    movk     w9, #0x342d, lsl #16
    str      w9, [x8]
    b        #0x30aa10
    ldrb     w8, [x19, #0xaf]
    cmp      w8, #0
    mov      w8, #0xec54
    movk     w8, #0xb044, lsl #16
    mov      w9, #0x8c2e
    movk     w9, #0x8665, lsl #16
    csel     w8, w9, w8, ne
    ldr      x9, [x19]
    str      w8, [x9]
    ldr      x8, [x19, #0xb0]
    str      x8, [x19, #0x48]
    b        #0x30aa10
    ldp      x0, x2, [x19, #0x120]
    ldr      x1, [x19, #0x138]
    bl       #0x461c6c // _objc_msgSend
    ldr      x0, [x19, #0x120]
    bl       #0x461c9c // _objc_release
    ldp      x8, x9, [x19, #0x20]
    add      x8, x8, #1
    cmp      x8, x9
    mov      w9, #0x9268
    movk     w9, #0x9442, lsl #16
    mov      w10, #0x8201
    movk     w10, #0xd85, lsl #16
    csel     w9, w10, w9, eq
    ldr      x10, [x19]
    str      w9, [x10]
    str      x8, [x19, #0x58]
    b        #0x30aa10
    mov      w9, #0xb436
    movk     w9, #0x238f, lsl #16
    cmp      w8, w9
    b.ne     #0x30aa10
    ldur     x8, [x29, #-0x70]
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x760]
    ldr      x9, [x9]
    cmp      x9, x8
    b.ne     #0x30c444
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

// -[WCLGGroupMemberPicker groupID] IMP=0x30C58C bounds=0x30C58C-0x30C5F8
loc_30C58C:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xce0]
    str      w8, [sp, #0x1c]
    mov      w8, #0x32c3
    movk     w8, #0x4f33, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x149b
    movk     w9, #0x809e, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30c5d0
    cmp      w10, w9
    b.ne     #0x30c5b8
    b        #0x30c5e8
    ldrsw    x10, [sp, #0x1c]
    add      x10, x0, x10
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30c5b8
    ldr      x8, [sp, #0x10]
    ldr      x0, [x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setGroupID:] IMP=0x30C5F8 bounds=0x30C5F8-0x30C690
loc_30C5F8:
    sub      sp, sp, #0x50
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    mov      x20, x1
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xce0]
    mov      w22, #0xade8
    movk     w22, #0x8f2, lsl #16
    stp      w22, w8, [sp, #8]
    add      x8, sp, #8
    str      x8, [sp]
    mov      w23, #0xa9f9
    movk     w23, #0xe34e, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w22
    b.eq     #0x30c658
    cmp      w8, w23
    b.ne     #0x30c640
    b        #0x30c678
    ldrsw    x3, [sp, #0xc]
    mov      x0, x21
    mov      x1, x20
    mov      x2, x19
    bl       #0x461cf0 // _objc_setProperty_nonatomic_copy
    ldr      x8, [sp]
    str      w23, [x8]
    b        #0x30c640
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    add      sp, sp, #0x50
    ret      

// -[WCLGGroupMemberPicker onComplete] IMP=0x30C690 bounds=0x30C690-0x30C6FC
loc_30C690:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xce4]
    str      w8, [sp, #0x1c]
    mov      w8, #0x76e6
    movk     w8, #0x8658, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x7a8f
    movk     w9, #0x21ad, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30c6d4
    cmp      w10, w9
    b.ne     #0x30c6bc
    b        #0x30c6ec
    ldrsw    x10, [sp, #0x1c]
    add      x10, x0, x10
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30c6bc
    ldr      x8, [sp, #0x10]
    ldr      x0, [x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setOnComplete:] IMP=0x30C6FC bounds=0x30C6FC-0x30C798
loc_30C6FC:
    sub      sp, sp, #0x60
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x2
    mov      x20, x1
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xce4]
    str      x8, [sp, #0x18]
    mov      w22, #0x1190
    movk     w22, #0x6a5b, lsl #16
    str      w22, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w23, #0x91fe
    movk     w23, #0x8c35, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w22
    b.eq     #0x30c760
    cmp      w8, w23
    b.ne     #0x30c748
    b        #0x30c780
    ldr      x3, [sp, #0x18]
    mov      x0, x21
    mov      x1, x20
    mov      x2, x19
    bl       #0x461cf0 // _objc_setProperty_nonatomic_copy
    ldr      x8, [sp, #8]
    str      w23, [x8]
    b        #0x30c748
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    add      sp, sp, #0x60
    ret      

// -[WCLGGroupMemberPicker selected] IMP=0x30C798 bounds=0x30C798-0x30C800
loc_30C798:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xce8]
    str      w8, [sp, #0x1c]
    mov      w8, #0xd485
    movk     w8, #0x8623, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x2c43
    movk     w9, #0x86ab, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30c7dc
    cmp      w10, w9
    b.ne     #0x30c7c4
    b        #0x30c7f0
    ldrsw    x10, [sp, #0x1c]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30c7c4
    ldr      x8, [sp, #0x10]
    ldr      x0, [x0, x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setSelected:] IMP=0x30C800 bounds=0x30C800-0x30C89C
loc_30C800:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xce8]
    add      x8, x0, x8
    str      x8, [sp, #0x18]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp, #0x18]
    ldr      x8, [x8]
    str      x8, [sp, #0x10]
    mov      w20, #0x3129
    movk     w20, #0xb4a8, lsl #16
    str      w20, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w21, #0xec3b
    movk     w21, #0x3dd8, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w20
    b.eq     #0x30c870
    cmp      w8, w21
    b.ne     #0x30c858
    b        #0x30c888
    ldp      x0, x8, [sp, #0x10]
    str      x19, [x8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x30c858
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    ret      

// -[WCLGGroupMemberPicker sessionUsernames] IMP=0x30C89C bounds=0x30C89C-0x30C908
loc_30C89C:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xcec]
    str      w8, [sp, #0x1c]
    mov      w8, #0xe755
    movk     w8, #0x7864, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x2ad1
    movk     w9, #0xcc95, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30c8e0
    cmp      w10, w9
    b.ne     #0x30c8c8
    b        #0x30c8f8
    ldrsw    x10, [sp, #0x1c]
    add      x10, x0, x10
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30c8c8
    ldr      x8, [sp, #0x10]
    ldr      x0, [x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setSessionUsernames:] IMP=0x30C908 bounds=0x30C908-0x30C990
loc_30C908:
    sub      sp, sp, #0x40
    stp      x22, x21, [sp, #0x10]
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xcec]
    mov      w21, #0xce41
    movk     w21, #0xbe25, lsl #16
    stp      w21, w8, [sp, #8]
    add      x8, sp, #8
    str      x8, [sp]
    mov      w22, #0x5c77
    movk     w22, #0x4986, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w21
    b.eq     #0x30c960
    cmp      w8, w22
    b.ne     #0x30c948
    b        #0x30c97c
    ldrsw    x8, [sp, #0xc]
    add      x0, x20, x8
    mov      x1, x19
    bl       #0x461cfc // _objc_storeStrong
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x30c948
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    ldp      x22, x21, [sp, #0x10]
    add      sp, sp, #0x40
    ret      

// -[WCLGGroupMemberPicker sessionRows] IMP=0x30C990 bounds=0x30C990-0x30C9FC
loc_30C990:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xcf0]
    str      w8, [sp, #0x1c]
    mov      w8, #0xdc96
    movk     w8, #0x1524, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x9c2b
    movk     w9, #0x770d, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30c9d4
    cmp      w10, w9
    b.ne     #0x30c9bc
    b        #0x30c9ec
    ldrsw    x10, [sp, #0x1c]
    add      x10, x0, x10
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30c9bc
    ldr      x8, [sp, #0x10]
    ldr      x0, [x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setSessionRows:] IMP=0x30C9FC bounds=0x30C9FC-0x30CA98
loc_30C9FC:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xcf0]
    str      x8, [sp, #0x18]
    mov      w21, #0x8785
    movk     w21, #0x9fce, lsl #16
    str      w21, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w22, #0x36c3
    movk     w22, #0x978c, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w21
    b.eq     #0x30ca58
    cmp      w8, w22
    b.ne     #0x30ca40
    b        #0x30ca78
    ldr      x8, [sp, #0x18]
    add      x8, x20, x8
    str      x8, [sp, #0x10]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x30ca40
    ldr      x8, [sp, #0x10]
    ldr      x0, [x8]
    str      x19, [x8]
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    b        #0x461c9c // _objc_release

// -[WCLGGroupMemberPicker contactRows] IMP=0x30CA98 bounds=0x30CA98-0x30CB00
loc_30CA98:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xcf4]
    str      w8, [sp, #0x1c]
    mov      w8, #0x77ef
    movk     w8, #0x7148, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0xce24
    movk     w9, #0x8477, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30cadc
    cmp      w10, w9
    b.ne     #0x30cac4
    b        #0x30caf4
    ldrsw    x10, [sp, #0x1c]
    ldr      x10, [x0, x10]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30cac4
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setContactRows:] IMP=0x30CB00 bounds=0x30CB00-0x30CB7C
loc_30CB00:
    sub      sp, sp, #0x30
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    mov      x1, x2
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xcf4]
    stur     w8, [x29, #-4]
    mov      w8, #0xe261
    movk     w8, #0x42ee, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x6a2e
    movk     w9, #0xb311, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30cb50
    cmp      w10, w9
    b.ne     #0x30cb38
    b        #0x30cb64
    ldursw   x10, [x29, #-4]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30cb38
    ldr      x8, [sp, #0x10]
    add      x0, x0, x8
    bl       #0x461cfc // _objc_storeStrong
    ldp      x29, x30, [sp, #0x20]
    add      sp, sp, #0x30
    ret      

// -[WCLGGroupMemberPicker filteredRows] IMP=0x30CB7C bounds=0x30CB7C-0x30CBE4
loc_30CB7C:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xcf8]
    str      w8, [sp, #0x1c]
    mov      w8, #0x5575
    movk     w8, #0xc5ff, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x249e
    movk     w9, #0xecd0, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30cbc0
    cmp      w10, w9
    b.ne     #0x30cba8
    b        #0x30cbd8
    ldrsw    x10, [sp, #0x1c]
    ldr      x10, [x0, x10]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30cba8
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setFilteredRows:] IMP=0x30CBE4 bounds=0x30CBE4-0x30CC80
loc_30CBE4:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xcf8]
    str      x8, [sp, #0x18]
    mov      w21, #0x78e7
    movk     w21, #0xb6a0, lsl #16
    str      w21, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w22, #0x6476
    movk     w22, #0xeace, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w21
    b.eq     #0x30cc40
    cmp      w8, w22
    b.ne     #0x30cc28
    b        #0x30cc60
    ldr      x8, [sp, #0x18]
    add      x8, x20, x8
    str      x8, [sp, #0x10]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x30cc28
    ldr      x8, [sp, #0x10]
    ldr      x0, [x8]
    str      x19, [x8]
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    b        #0x461c9c // _objc_release

// -[WCLGGroupMemberPicker labels] IMP=0x30CC80 bounds=0x30CC80-0x30CCE8
loc_30CC80:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xcfc]
    str      w8, [sp, #0x1c]
    mov      w8, #0xbdb1
    movk     w8, #0x7829, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0xc0ae
    movk     w9, #0xf549, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30ccc4
    cmp      w10, w9
    b.ne     #0x30ccac
    b        #0x30ccd8
    ldrsw    x10, [sp, #0x1c]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30ccac
    ldr      x8, [sp, #0x10]
    ldr      x0, [x0, x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setLabels:] IMP=0x30CCE8 bounds=0x30CCE8-0x30CD7C
loc_30CCE8:
    sub      sp, sp, #0x40
    stp      x20, x19, [sp, #0x20]
    stp      x29, x30, [sp, #0x30]
    add      x29, sp, #0x30
    mov      x19, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xcfc]
    add      x8, x0, x8
    str      x8, [sp, #0x18]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp, #0x18]
    ldr      x8, [x8]
    str      x8, [sp, #0x10]
    mov      w8, #0x51
    movk     w8, #0x91f0, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0xa94b
    movk     w9, #0xccc9, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30cd54
    cmp      w10, w9
    b.ne     #0x30cd3c
    b        #0x30cd68
    ldr      x10, [sp, #0x18]
    str      x19, [x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30cd3c
    ldr      x0, [sp, #0x10]
    ldp      x29, x30, [sp, #0x30]
    ldp      x20, x19, [sp, #0x20]
    add      sp, sp, #0x40
    b        #0x461c9c // _objc_release

// -[WCLGGroupMemberPicker chatroomRows] IMP=0x30CD7C bounds=0x30CD7C-0x30CDE4
loc_30CD7C:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd00]
    str      w8, [sp, #0x1c]
    mov      w8, #0x8f58
    movk     w8, #0x4dcd, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x46bf
    movk     w9, #0x32a3, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30cdc0
    cmp      w10, w9
    b.ne     #0x30cda8
    b        #0x30cdd8
    ldrsw    x10, [sp, #0x1c]
    ldr      x10, [x0, x10]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30cda8
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setChatroomRows:] IMP=0x30CDE4 bounds=0x30CDE4-0x30CE7C
loc_30CDE4:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd00]
    add      x8, x0, x8
    str      x8, [sp, #0x18]
    mov      w20, #0x36
    movk     w20, #0x5423, lsl #16
    str      w20, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w21, #0x716a
    movk     w21, #0xd4eb, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w20
    b.eq     #0x30ce40
    cmp      w8, w21
    b.ne     #0x30ce28
    b        #0x30ce64
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp, #0x18]
    ldr      x9, [x8]
    str      x9, [sp, #0x10]
    str      x19, [x8]
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x30ce28
    ldr      x0, [sp, #0x10]
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    b        #0x461c9c // _objc_release

// -[WCLGGroupMemberPicker contactsLoaded] IMP=0x30CE7C bounds=0x30CE7C-0x30CEE8
loc_30CE7C:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd04]
    str      w8, [sp, #0x1c]
    mov      w8, #0xbdbf
    movk     w8, #0x6a39, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x2af1
    movk     w9, #0x8039, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30cec0
    cmp      w10, w9
    b.ne     #0x30cea8
    b        #0x30ced8
    ldrsw    x10, [sp, #0x1c]
    add      x10, x0, x10
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30cea8
    ldr      x8, [sp, #0x10]
    ldrb     w0, [x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setContactsLoaded:] IMP=0x30CEE8 bounds=0x30CEE8-0x30CF50
loc_30CEE8:
    sub      sp, sp, #0x20
    strb     w2, [sp, #0x1f]
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd04]
    str      x8, [sp, #0x10]
    mov      w8, #0x98a3
    movk     w8, #0xb28d, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x422e
    movk     w9, #0xc546, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30cf30
    cmp      w10, w9
    b.ne     #0x30cf18
    b        #0x30cf48
    ldr      x10, [sp, #0x10]
    ldrb     w11, [sp, #0x1f]
    strb     w11, [x0, x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30cf18
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker labelsLoaded] IMP=0x30CF50 bounds=0x30CF50-0x30CFBC
loc_30CF50:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd08]
    str      w8, [sp, #0x1c]
    mov      w8, #0xa3d8
    movk     w8, #0x30bd, lsl #16
    str      w8, [sp, #0x14]
    add      x9, sp, #0x14
    str      x9, [sp, #8]
    mov      w9, #0xb07d
    movk     w9, #0x2c5e, lsl #16
    ldr      w10, [sp, #0x14]
    cmp      w10, w8
    b.eq     #0x30cf94
    cmp      w10, w9
    b.ne     #0x30cf7c
    b        #0x30cfac
    ldrsw    x10, [sp, #0x1c]
    ldrb     w10, [x0, x10]
    strb     w10, [sp, #0x1b]
    ldr      x10, [sp, #8]
    str      w9, [x10]
    b        #0x30cf7c
    ldrb     w8, [sp, #0x1b]
    and      w0, w8, #1
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setLabelsLoaded:] IMP=0x30CFBC bounds=0x30CFBC-0x30D02C
loc_30CFBC:
    sub      sp, sp, #0x20
    strb     w2, [sp, #0x1f]
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd08]
    str      w8, [sp, #0x18]
    mov      w8, #0x493c
    movk     w8, #0xd9aa, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x6a29
    movk     w9, #0xa8b3, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30d004
    cmp      w10, w9
    b.ne     #0x30cfec
    b        #0x30d018
    ldrsw    x10, [sp, #0x18]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30cfec
    ldr      x8, [sp, #0x10]
    ldrb     w9, [sp, #0x1f]
    strb     w9, [x0, x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker chatroomsLoaded] IMP=0x30D02C bounds=0x30D02C-0x30D09C
loc_30D02C:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd0c]
    add      x8, x0, x8
    str      x8, [sp, #0x18]
    mov      w8, #0x61b1
    movk     w8, #0x3224, lsl #16
    str      w8, [sp, #0x10]
    add      x9, sp, #0x10
    str      x9, [sp, #8]
    mov      w9, #0x77b0
    movk     w9, #0xc3d, lsl #16
    ldr      w10, [sp, #0x10]
    cmp      w10, w8
    b.eq     #0x30d074
    cmp      w10, w9
    b.ne     #0x30d05c
    b        #0x30d08c
    ldr      x10, [sp, #0x18]
    ldrb     w10, [x10]
    strb     w10, [sp, #0x17]
    ldr      x10, [sp, #8]
    str      w9, [x10]
    b        #0x30d05c
    ldrb     w8, [sp, #0x17]
    and      w0, w8, #1
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setChatroomsLoaded:] IMP=0x30D09C bounds=0x30D09C-0x30D0FC
loc_30D09C:
    sub      sp, sp, #0x10
    strb     w2, [sp, #0xf]
    mov      w8, #0xd33d
    movk     w8, #0x56de, lsl #16
    str      w8, [sp, #8]
    add      x9, sp, #8
    str      x9, [sp]
    adrp     x9, #0x4c4000
    mov      w10, #0x7a4c
    movk     w10, #0xedec, lsl #16
    ldr      w11, [sp, #8]
    cmp      w11, w8
    b.eq     #0x30d0dc
    cmp      w11, w10
    b.ne     #0x30d0c4
    b        #0x30d0f4
    ldrsw    x11, [x9, #0xd0c]
    ldrb     w12, [sp, #0xf]
    strb     w12, [x0, x11]
    ldr      x11, [sp]
    str      w10, [x11]
    b        #0x30d0c4
    add      sp, sp, #0x10
    ret      

// -[WCLGGroupMemberPicker singleSelect] IMP=0x30D0FC bounds=0x30D0FC-0x30D164
loc_30D0FC:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd10]
    str      w8, [sp, #0x1c]
    mov      w8, #0xd96a
    movk     w8, #0x1a4c, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x5109
    movk     w9, #0x21df, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30d140
    cmp      w10, w9
    b.ne     #0x30d128
    b        #0x30d154
    ldrsw    x10, [sp, #0x1c]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30d128
    ldr      x8, [sp, #0x10]
    ldrb     w0, [x0, x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setSingleSelect:] IMP=0x30D164 bounds=0x30D164-0x30D1C8
loc_30D164:
    sub      sp, sp, #0x20
    strb     w2, [sp, #0x1f]
    adrp     x8, #0x4c4000
    ldr      w9, [x8, #0xd10]
    mov      w8, #0x6362
    movk     w8, #0x52a6, lsl #16
    stp      w8, w9, [sp, #0x14]
    add      x9, sp, #0x14
    str      x9, [sp, #8]
    mov      w9, #0xaff6
    movk     w9, #0xf7e0, lsl #16
    ldr      w10, [sp, #0x14]
    cmp      w10, w8
    b.eq     #0x30d1a8
    cmp      w10, w9
    b.ne     #0x30d190
    b        #0x30d1c0
    ldrsw    x10, [sp, #0x18]
    ldrb     w11, [sp, #0x1f]
    strb     w11, [x0, x10]
    ldr      x10, [sp, #8]
    str      w9, [x10]
    b        #0x30d190
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker onPick] IMP=0x30D1C8 bounds=0x30D1C8-0x30D230
loc_30D1C8:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd14]
    str      w8, [sp, #0x1c]
    mov      w8, #0x6743
    movk     w8, #0x14cc, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x8733
    movk     w9, #0x8431, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30d20c
    cmp      w10, w9
    b.ne     #0x30d1f4
    b        #0x30d224
    ldrsw    x10, [sp, #0x1c]
    ldr      x10, [x0, x10]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30d1f4
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setOnPick:] IMP=0x30D230 bounds=0x30D230-0x30D2C8
loc_30D230:
    sub      sp, sp, #0x50
    stp      x24, x23, [sp, #0x10]
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    mov      x20, x1
    mov      x21, x0
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd14]
    mov      w22, #0x65d8
    movk     w22, #0xf22c, lsl #16
    stp      w22, w8, [sp, #8]
    add      x8, sp, #8
    str      x8, [sp]
    mov      w23, #0x5a7c
    movk     w23, #0x12fe, lsl #16
    ldr      w8, [sp, #8]
    cmp      w8, w22
    b.eq     #0x30d290
    cmp      w8, w23
    b.ne     #0x30d278
    b        #0x30d2b0
    ldrsw    x3, [sp, #0xc]
    mov      x0, x21
    mov      x1, x20
    mov      x2, x19
    bl       #0x461cf0 // _objc_setProperty_nonatomic_copy
    ldr      x8, [sp]
    str      w23, [x8]
    b        #0x30d278
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    ldp      x24, x23, [sp, #0x10]
    add      sp, sp, #0x50
    ret      

// -[WCLGGroupMemberPicker excluded] IMP=0x30D2C8 bounds=0x30D2C8-0x30D330
loc_30D2C8:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd18]
    str      w8, [sp, #0x1c]
    mov      w8, #0x3978
    movk     w8, #0xbd77, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x946a
    movk     w9, #0xdaf1, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30d30c
    cmp      w10, w9
    b.ne     #0x30d2f4
    b        #0x30d320
    ldrsw    x10, [sp, #0x1c]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30d2f4
    ldr      x8, [sp, #0x10]
    ldr      x0, [x0, x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setExcluded:] IMP=0x30D330 bounds=0x30D330-0x30D3D0
loc_30D330:
    sub      sp, sp, #0x60
    stp      x24, x23, [sp, #0x20]
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd18]
    str      x8, [sp, #0x18]
    mov      w21, #0x88d5
    movk     w21, #0xeef8, lsl #16
    str      w21, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w22, #0x11b6
    movk     w22, #0x242f, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w21
    b.eq     #0x30d390
    cmp      w8, w22
    b.ne     #0x30d378
    b        #0x30d3b4
    ldr      x23, [sp, #0x18]
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [x20, x23]
    str      x8, [sp, #0x10]
    str      x19, [x20, x23]
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x30d378
    ldr      x0, [sp, #0x10]
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    ldp      x24, x23, [sp, #0x20]
    add      sp, sp, #0x60
    b        #0x461c9c // _objc_release

// -[WCLGGroupMemberPicker mode] IMP=0x30D3D0 bounds=0x30D3D0-0x30D438
loc_30D3D0:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd1c]
    str      w8, [sp, #0x1c]
    mov      w8, #0x4626
    movk     w8, #0xcebb, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x4c8e
    movk     w9, #0x48fc, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30d414
    cmp      w10, w9
    b.ne     #0x30d3fc
    b        #0x30d428
    ldrsw    x10, [sp, #0x1c]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30d3fc
    ldr      x8, [sp, #0x10]
    ldr      x0, [x0, x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setMode:] IMP=0x30D438 bounds=0x30D438-0x30D4A4
loc_30D438:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd1c]
    str      w8, [sp, #0x1c]
    mov      w8, #0x588f
    movk     w8, #0x6cf2, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0xdf4f
    movk     w9, #0x7a6a, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30d47c
    cmp      w10, w9
    b.ne     #0x30d464
    b        #0x30d494
    ldrsw    x10, [sp, #0x1c]
    add      x10, x0, x10
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30d464
    ldr      x8, [sp, #0x10]
    str      x2, [x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker segmented] IMP=0x30D4A4 bounds=0x30D4A4-0x30D50C
loc_30D4A4:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd20]
    str      x8, [sp, #0x18]
    mov      w8, #0xc52b
    movk     w8, #0x8b29, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x9d4c
    movk     w9, #0xd6c0, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30d4e8
    cmp      w10, w9
    b.ne     #0x30d4d0
    b        #0x30d500
    ldr      x10, [sp, #0x18]
    ldr      x10, [x0, x10]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30d4d0
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setSegmented:] IMP=0x30D50C bounds=0x30D50C-0x30D5A0
loc_30D50C:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    mov      x20, x0
    adrp     x8, #0x4c4000
    ldrsw    x21, [x8, #0xd20]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [x20, x21]
    str      x19, [x20, x21]
    str      x8, [sp, #0x18]
    mov      w19, #0xe935
    movk     w19, #0x74ca, lsl #16
    str      w19, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w20, #0x5382
    movk     w20, #0x8268, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w19
    b.eq     #0x30d578
    cmp      w8, w20
    b.ne     #0x30d560
    b        #0x30d58c
    ldr      x0, [sp, #0x18]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w20, [x8]
    b        #0x30d560
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    ret      

// -[WCLGGroupMemberPicker tableView] IMP=0x30D5A0 bounds=0x30D5A0-0x30D60C
loc_30D5A0:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd24]
    str      w8, [sp, #0x1c]
    mov      w8, #0x31c0
    movk     w8, #0x62f9, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0xe460
    movk     w9, #0xe2c5, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30d5e4
    cmp      w10, w9
    b.ne     #0x30d5cc
    b        #0x30d5fc
    ldrsw    x10, [sp, #0x1c]
    add      x10, x0, x10
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30d5cc
    ldr      x8, [sp, #0x10]
    ldr      x0, [x8]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setTableView:] IMP=0x30D60C bounds=0x30D60C-0x30D6A4
loc_30D60C:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd24]
    add      x8, x0, x8
    str      x8, [sp, #0x18]
    mov      w20, #0x620e
    movk     w20, #0x32b, lsl #16
    str      w20, [sp, #0xc]
    add      x8, sp, #0xc
    str      x8, [sp]
    mov      w21, #0x94d
    movk     w21, #0xf6ef, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w20
    b.eq     #0x30d668
    cmp      w8, w21
    b.ne     #0x30d650
    b        #0x30d68c
    mov      x0, x19
    bl       #0x461ca8 // _objc_retain
    ldr      x8, [sp, #0x18]
    ldr      x9, [x8]
    str      x9, [sp, #0x10]
    str      x19, [x8]
    ldr      x8, [sp]
    str      w21, [x8]
    b        #0x30d650
    ldr      x0, [sp, #0x10]
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    b        #0x461c9c // _objc_release

// -[WCLGGroupMemberPicker searchBar] IMP=0x30D6A4 bounds=0x30D6A4-0x30D70C
loc_30D6A4:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd28]
    str      x8, [sp, #0x18]
    mov      w8, #0xc6d6
    movk     w8, #0x5c3d, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0xaf8
    movk     w9, #0x7bdb, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30d6e8
    cmp      w10, w9
    b.ne     #0x30d6d0
    b        #0x30d700
    ldr      x10, [sp, #0x18]
    ldr      x10, [x0, x10]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30d6d0
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setSearchBar:] IMP=0x30D70C bounds=0x30D70C-0x30D7A0
loc_30D70C:
    sub      sp, sp, #0x50
    stp      x22, x21, [sp, #0x20]
    stp      x20, x19, [sp, #0x30]
    stp      x29, x30, [sp, #0x40]
    add      x29, sp, #0x40
    mov      x19, x2
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd28]
    add      x8, x0, x8
    str      x8, [sp, #0x18]
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      w20, #0x4049
    movk     w20, #0xacd3, lsl #16
    str      w20, [sp, #0x14]
    add      x8, sp, #0x14
    str      x8, [sp, #8]
    mov      w21, #0x124d
    movk     w21, #0xfd2e, lsl #16
    ldr      w8, [sp, #0x14]
    cmp      w8, w20
    b.eq     #0x30d770
    cmp      w8, w21
    b.ne     #0x30d758
    b        #0x30d78c
    ldr      x8, [sp, #0x18]
    ldr      x0, [x8]
    str      x19, [x8]
    bl       #0x461c9c // _objc_release
    ldr      x8, [sp, #8]
    str      w21, [x8]
    b        #0x30d758
    ldp      x29, x30, [sp, #0x40]
    ldp      x20, x19, [sp, #0x30]
    ldp      x22, x21, [sp, #0x20]
    add      sp, sp, #0x50
    ret      

// -[WCLGGroupMemberPicker searchText] IMP=0x30D7A0 bounds=0x30D7A0-0x30D808
loc_30D7A0:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd2c]
    str      x8, [sp, #0x18]
    mov      w8, #0xe5bc
    movk     w8, #0x19fa, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0xe76a
    movk     w9, #0xdb27, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30d7e4
    cmp      w10, w9
    b.ne     #0x30d7cc
    b        #0x30d7fc
    ldr      x10, [sp, #0x18]
    ldr      x10, [x0, x10]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30d7cc
    ldr      x0, [sp, #0x10]
    add      sp, sp, #0x20
    ret      

// -[WCLGGroupMemberPicker setSearchText:] IMP=0x30D808 bounds=0x30D808-0x30D86C
loc_30D808:
    sub      sp, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd2c]
    str      w8, [sp, #0x1c]
    mov      w8, #0x7a6c
    movk     w8, #0x357, lsl #16
    str      w8, [sp, #0xc]
    add      x9, sp, #0xc
    str      x9, [sp]
    mov      w9, #0x3fa1
    movk     w9, #0x5508, lsl #16
    ldr      w10, [sp, #0xc]
    cmp      w10, w8
    b.eq     #0x30d84c
    cmp      w10, w9
    b.ne     #0x30d834
    b        #0x30d860
    ldrsw    x10, [sp, #0x1c]
    str      x10, [sp, #0x10]
    ldr      x10, [sp]
    str      w9, [x10]
    b        #0x30d834
    ldr      x3, [sp, #0x10]
    add      sp, sp, #0x20
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGroupMemberPicker .cxx_destruct] IMP=0x30D86C bounds=0x30D86C-0x30DA28
loc_30D86C:
    sub      sp, sp, #0x80
    stp      x28, x27, [sp, #0x20]
    stp      x26, x25, [sp, #0x30]
    stp      x24, x23, [sp, #0x40]
    stp      x22, x21, [sp, #0x50]
    stp      x20, x19, [sp, #0x60]
    stp      x29, x30, [sp, #0x70]
    add      x29, sp, #0x70
    mov      x19, x0
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd2c]
    add      x0, x0, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd28]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd24]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd20]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd18]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldr      w8, [x8, #0xd14]
    mov      w20, #0x2713
    movk     w20, #0x2004, lsl #16
    add      x9, sp, #0xc
    str      w8, [sp, #0x1c]
    str      w20, [sp, #0xc]
    adrp     x23, #0x4c4000
    adrp     x24, #0x4c4000
    adrp     x25, #0x4c4000
    str      x9, [sp]
    adrp     x26, #0x4c4000
    adrp     x27, #0x4c4000
    adrp     x28, #0x4c4000
    adrp     x21, #0x4c4000
    mov      w22, #0xfce3
    movk     w22, #0x58fa, lsl #16
    ldr      w8, [sp, #0xc]
    cmp      w8, w20
    b.eq     #0x30d950
    cmp      w8, w22
    b.ne     #0x30d938
    b        #0x30d9fc
    ldrsw    x8, [sp, #0x1c]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xd00]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    adrp     x8, #0x4c4000
    ldrsw    x8, [x8, #0xcfc]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    ldrsw    x8, [x23, #0xcf8]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    ldrsw    x8, [x24, #0xcf4]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    ldrsw    x8, [x25, #0xcf0]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    ldrsw    x8, [x26, #0xcec]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    ldrsw    x8, [x27, #0xce8]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    ldrsw    x8, [x28, #0xce4]
    add      x0, x19, x8
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    ldrsw    x8, [x21, #0xce0]
    str      x8, [sp, #0x10]
    ldr      x8, [sp]
    str      w22, [x8]
    b        #0x30d938
    ldr      x8, [sp, #0x10]
    add      x0, x19, x8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x70]
    ldp      x20, x19, [sp, #0x60]
    ldp      x22, x21, [sp, #0x50]
    ldp      x24, x23, [sp, #0x40]
    ldp      x26, x25, [sp, #0x30]
    ldp      x28, x27, [sp, #0x20]
    add      sp, sp, #0x80
    b        #0x461cfc // _objc_storeStrong
