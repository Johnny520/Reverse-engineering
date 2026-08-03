// Exact ARM64 listing for WCLGChatAvatarMenuDelegate

// -[WCLGChatAvatarMenuDelegate contextMenuInteraction:configurationForMenuAtLocation:] IMP=0x1244EC bounds=0x1244EC-0x1245D4
loc_1244EC:
    sub      sp, sp, #0x60
    stp      x22, x21, [sp, #0x30]
    stp      x20, x19, [sp, #0x40]
    stp      x29, x30, [sp, #0x50]
    add      x29, sp, #0x50
    mov      x19, x2
    mov      x20, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    add      x0, sp, #0x28
    mov      x1, x20
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4c4000
    adrp     x9, #0x4a0000
    ldr      x9, [x9, #0x748]
    ldr      x20, [x8, #0x360]
    str      x9, [sp]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    adrp     x8, #0x124000
    add      x8, x8, #0x5d4
    str      d0, [sp, #8]
    adrp     x9, #0x4a1000
    add      x9, x9, #0xdc0
    stp      x8, x9, [sp, #0x10]
    mov      x21, sp
    add      x0, x21, #0x20
    add      x1, sp, #0x28
    bl       #0x461c00 // _objc_copyWeak
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xcd0]
    mov      x4, sp
    mov      x0, x20
    mov      x2, #0
    mov      x3, #0
    bl       #0x461c6c // _objc_msgSend
    mov      x29, x29
    bl       #0x461ccc // _objc_retainAutoreleasedReturnValue
    mov      x20, x0
    add      x0, x21, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, sp, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    ldp      x29, x30, [sp, #0x50]
    ldp      x20, x19, [sp, #0x40]
    ldp      x22, x21, [sp, #0x30]
    add      sp, sp, #0x60
    b        #0x461be8 // _objc_autoreleaseReturnValue
    mov      x19, x0
    add      x0, x21, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, sp, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGChatAvatarMenuDelegate contextMenuInteraction:willEndForConfiguration:animator:] IMP=0x125D58 bounds=0x125D58-0x125E78
loc_125D58:
    sub      sp, sp, #0x70
    stp      x24, x23, [sp, #0x30]
    stp      x22, x21, [sp, #0x40]
    stp      x20, x19, [sp, #0x50]
    stp      x29, x30, [sp, #0x60]
    add      x29, sp, #0x60
    mov      x21, x4
    mov      x20, x3
    mov      x19, x2
    mov      x22, x0
    mov      x0, x2
    bl       #0x461ca8 // _objc_retain
    mov      x0, x20
    bl       #0x461ca8 // _objc_retain
    mov      x0, x21
    bl       #0x461ca8 // _objc_retain
    add      x0, sp, #0x28
    mov      x1, x22
    bl       #0x461c54 // _objc_initWeak
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x748]
    str      x8, [sp]
    adrp     x8, #0x491000
    ldr      d0, [x8, #0x388]
    adrp     x8, #0x125000
    add      x8, x8, #0xe78
    str      d0, [sp, #8]
    adrp     x9, #0x4a1000
    add      x9, x9, #0xdf0
    stp      x8, x9, [sp, #0x10]
    mov      x23, sp
    add      x0, x23, #0x20
    add      x1, sp, #0x28
    bl       #0x461c00 // _objc_copyWeak
    mov      x0, sp
    bl       #0x461cd8 // _objc_retainBlock
    mov      x22, x0
    cbz      x21, #0x125e08
    adrp     x8, #0x4be000
    ldr      x1, [x8, #0xa78]
    mov      x0, x21
    mov      x2, x22
    bl       #0x461c6c // _objc_msgSend
    b        #0x125e14
    ldr      x8, [x22, #0x10]
    mov      x0, x22
    blr      x8
    mov      x0, x22
    bl       #0x461c9c // _objc_release
    add      x0, x23, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, sp, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x21
    bl       #0x461c9c // _objc_release
    mov      x0, x20
    bl       #0x461c9c // _objc_release
    mov      x0, x19
    bl       #0x461c9c // _objc_release
    ldp      x29, x30, [sp, #0x60]
    ldp      x20, x19, [sp, #0x50]
    ldp      x22, x21, [sp, #0x40]
    ldp      x24, x23, [sp, #0x30]
    add      sp, sp, #0x70
    ret      
    mov      x19, x0
    add      x0, x23, #0x20
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, sp, #0x28
    bl       #0x461c0c // _objc_destroyWeak
    mov      x0, x19
    bl       #0x461894 // __Unwind_Resume

// -[WCLGChatAvatarMenuDelegate cell] IMP=0x125FD0 bounds=0x125FD0-0x125FE8
loc_125FD0:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    add      x0, x0, #8
    bl       #0x461c60 // _objc_loadWeakRetained
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGChatAvatarMenuDelegate setCell:] IMP=0x125FE8 bounds=0x125FE8-0x125FF4
loc_125FE8:
    mov      x1, x2
    add      x0, x0, #8
    b        #0x461d08 // _objc_storeWeak

// -[WCLGChatAvatarMenuDelegate headView] IMP=0x125FF4 bounds=0x125FF4-0x12600C
loc_125FF4:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    add      x0, x0, #0x10
    bl       #0x461c60 // _objc_loadWeakRetained
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGChatAvatarMenuDelegate setHeadView:] IMP=0x12600C bounds=0x12600C-0x126018
loc_12600C:
    mov      x1, x2
    add      x0, x0, #0x10
    b        #0x461d08 // _objc_storeWeak

// -[WCLGChatAvatarMenuDelegate frozenWxid] IMP=0x126018 bounds=0x126018-0x126020
loc_126018:
    ldr      x0, [x0, #0x18]
    ret      

// -[WCLGChatAvatarMenuDelegate setFrozenWxid:] IMP=0x126020 bounds=0x126020-0x126028
loc_126020:
    mov      w3, #0x18
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGChatAvatarMenuDelegate frozenChatRoomId] IMP=0x126028 bounds=0x126028-0x126030
loc_126028:
    ldr      x0, [x0, #0x20]
    ret      

// -[WCLGChatAvatarMenuDelegate setFrozenChatRoomId:] IMP=0x126030 bounds=0x126030-0x126038
loc_126030:
    mov      w3, #0x20
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGChatAvatarMenuDelegate frozenWrap] IMP=0x126038 bounds=0x126038-0x126040
loc_126038:
    ldr      x0, [x0, #0x28]
    ret      

// -[WCLGChatAvatarMenuDelegate setFrozenWrap:] IMP=0x126040 bounds=0x126040-0x12604C
loc_126040:
    mov      x1, x2
    add      x0, x0, #0x28
    b        #0x461cfc // _objc_storeStrong

// -[WCLGChatAvatarMenuDelegate .cxx_destruct] IMP=0x12604C bounds=0x12604C-0x126098
loc_12604C:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    add      x0, x0, #0x28
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x20
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x18
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x10
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x19, #8
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c0c // _objc_destroyWeak
