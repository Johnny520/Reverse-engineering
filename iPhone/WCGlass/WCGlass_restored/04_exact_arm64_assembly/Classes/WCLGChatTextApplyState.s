// Exact ARM64 listing for WCLGChatTextApplyState

// -[WCLGChatTextApplyState init] IMP=0x19765C bounds=0x19765C-0x1976C8
loc_19765C:
    sub      sp, sp, #0x30
    stp      x20, x19, [sp, #0x10]
    stp      x29, x30, [sp, #0x20]
    add      x29, sp, #0x20
    adrp     x8, #0x4c4000
    ldr      x8, [x8, #0x708]
    stp      x0, x8, [sp]
    adrp     x8, #0x4bf000
    ldr      x1, [x8, #0xb78]
    mov      x0, sp
    bl       #0x461c84 // _objc_msgSendSuper2
    mov      x19, x0
    cbz      x0, #0x1976b4
    mov      w8, #1
    dup      v0.2d, x8
    str      q0, [x19, #0x20]
    str      x8, [x19, #0x30]
    adrp     x8, #0x4a0000
    ldr      x8, [x8, #0x2d8]
    ldr      x1, [x8]
    add      x0, x19, #0x80
    bl       #0x461cfc // _objc_storeStrong
    mov      x0, x19
    ldp      x29, x30, [sp, #0x20]
    ldp      x20, x19, [sp, #0x10]
    add      sp, sp, #0x30
    ret      

// -[WCLGChatTextApplyState viewModelToken] IMP=0x1976C8 bounds=0x1976C8-0x1976D0
loc_1976C8:
    ldr      x0, [x0, #0x10]
    ret      

// -[WCLGChatTextApplyState setViewModelToken:] IMP=0x1976D0 bounds=0x1976D0-0x1976D8
loc_1976D0:
    str      x2, [x0, #0x10]
    ret      

// -[WCLGChatTextApplyState stableIdentityHash] IMP=0x1976D8 bounds=0x1976D8-0x1976E0
loc_1976D8:
    ldr      x0, [x0, #0x18]
    ret      

// -[WCLGChatTextApplyState setStableIdentityHash:] IMP=0x1976E0 bounds=0x1976E0-0x1976E8
loc_1976E0:
    str      x2, [x0, #0x18]
    ret      

// -[WCLGChatTextApplyState identityGeneration] IMP=0x1976E8 bounds=0x1976E8-0x1976F0
loc_1976E8:
    ldr      x0, [x0, #0x20]
    ret      

// -[WCLGChatTextApplyState setIdentityGeneration:] IMP=0x1976F0 bounds=0x1976F0-0x1976F8
loc_1976F0:
    str      x2, [x0, #0x20]
    ret      

// -[WCLGChatTextApplyState contentGeneration] IMP=0x1976F8 bounds=0x1976F8-0x197700
loc_1976F8:
    ldr      x0, [x0, #0x28]
    ret      

// -[WCLGChatTextApplyState setContentGeneration:] IMP=0x197700 bounds=0x197700-0x197708
loc_197700:
    str      x2, [x0, #0x28]
    ret      

// -[WCLGChatTextApplyState targetGeneration] IMP=0x197708 bounds=0x197708-0x197710
loc_197708:
    ldr      x0, [x0, #0x30]
    ret      

// -[WCLGChatTextApplyState setTargetGeneration:] IMP=0x197710 bounds=0x197710-0x197718
loc_197710:
    str      x2, [x0, #0x30]
    ret      

// -[WCLGChatTextApplyState layoutGeneration] IMP=0x197718 bounds=0x197718-0x197720
loc_197718:
    ldr      x0, [x0, #0x38]
    ret      

// -[WCLGChatTextApplyState setLayoutGeneration:] IMP=0x197720 bounds=0x197720-0x197728
loc_197720:
    str      x2, [x0, #0x38]
    ret      

// -[WCLGChatTextApplyState layoutDepth] IMP=0x197728 bounds=0x197728-0x197730
loc_197728:
    ldr      x0, [x0, #0x40]
    ret      

// -[WCLGChatTextApplyState setLayoutDepth:] IMP=0x197730 bounds=0x197730-0x197738
loc_197730:
    str      x2, [x0, #0x40]
    ret      

// -[WCLGChatTextApplyState lastAppliedLayoutGeneration] IMP=0x197738 bounds=0x197738-0x197740
loc_197738:
    ldr      x0, [x0, #0x48]
    ret      

// -[WCLGChatTextApplyState setLastAppliedLayoutGeneration:] IMP=0x197740 bounds=0x197740-0x197748
loc_197740:
    str      x2, [x0, #0x48]
    ret      

// -[WCLGChatTextApplyState lastApplySignature] IMP=0x197748 bounds=0x197748-0x197750
loc_197748:
    ldr      x0, [x0, #0x50]
    ret      

// -[WCLGChatTextApplyState setLastApplySignature:] IMP=0x197750 bounds=0x197750-0x197758
loc_197750:
    str      x2, [x0, #0x50]
    ret      

// -[WCLGChatTextApplyState targetStructureSignature] IMP=0x197758 bounds=0x197758-0x197760
loc_197758:
    ldr      x0, [x0, #0x58]
    ret      

// -[WCLGChatTextApplyState setTargetStructureSignature:] IMP=0x197760 bounds=0x197760-0x197768
loc_197760:
    str      x2, [x0, #0x58]
    ret      

// -[WCLGChatTextApplyState contentSignature] IMP=0x197768 bounds=0x197768-0x197770
loc_197768:
    ldr      x0, [x0, #0x60]
    ret      

// -[WCLGChatTextApplyState setContentSignature:] IMP=0x197770 bounds=0x197770-0x197778
loc_197770:
    str      x2, [x0, #0x60]
    ret      

// -[WCLGChatTextApplyState nextFallbackScanLayoutGeneration] IMP=0x197778 bounds=0x197778-0x197780
loc_197778:
    ldr      x0, [x0, #0x68]
    ret      

// -[WCLGChatTextApplyState setNextFallbackScanLayoutGeneration:] IMP=0x197780 bounds=0x197780-0x197788
loc_197780:
    str      x2, [x0, #0x68]
    ret      

// -[WCLGChatTextApplyState contentView] IMP=0x197788 bounds=0x197788-0x1977A0
loc_197788:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    add      x0, x0, #0x70
    bl       #0x461c60 // _objc_loadWeakRetained
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGChatTextApplyState setContentView:] IMP=0x1977A0 bounds=0x1977A0-0x1977AC
loc_1977A0:
    mov      x1, x2
    add      x0, x0, #0x70
    b        #0x461d08 // _objc_storeWeak

// -[WCLGChatTextApplyState bodyView] IMP=0x1977AC bounds=0x1977AC-0x1977C4
loc_1977AC:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    add      x0, x0, #0x78
    bl       #0x461c60 // _objc_loadWeakRetained
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGChatTextApplyState setBodyView:] IMP=0x1977C4 bounds=0x1977C4-0x1977D0
loc_1977C4:
    mov      x1, x2
    add      x0, x0, #0x78
    b        #0x461d08 // _objc_storeWeak

// -[WCLGChatTextApplyState targets] IMP=0x1977D0 bounds=0x1977D0-0x1977D8
loc_1977D0:
    ldr      x0, [x0, #0x80]
    ret      

// -[WCLGChatTextApplyState setTargets:] IMP=0x1977D8 bounds=0x1977D8-0x1977E0
loc_1977D8:
    mov      w3, #0x80
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGChatTextApplyState resolvedColorSignature] IMP=0x1977E0 bounds=0x1977E0-0x1977E8
loc_1977E0:
    ldr      x0, [x0, #0x88]
    ret      

// -[WCLGChatTextApplyState setResolvedColorSignature:] IMP=0x1977E8 bounds=0x1977E8-0x1977F0
loc_1977E8:
    str      x2, [x0, #0x88]
    ret      

// -[WCLGChatTextApplyState resolvedDarkMode] IMP=0x1977F0 bounds=0x1977F0-0x1977F8
loc_1977F0:
    ldrb     w0, [x0, #8]
    ret      

// -[WCLGChatTextApplyState setResolvedDarkMode:] IMP=0x1977F8 bounds=0x1977F8-0x197800
loc_1977F8:
    strb     w2, [x0, #8]
    ret      

// -[WCLGChatTextApplyState resolvedOutgoing] IMP=0x197800 bounds=0x197800-0x197808
loc_197800:
    ldrb     w0, [x0, #9]
    ret      

// -[WCLGChatTextApplyState setResolvedOutgoing:] IMP=0x197808 bounds=0x197808-0x197810
loc_197808:
    strb     w2, [x0, #9]
    ret      

// -[WCLGChatTextApplyState resolvedPayment] IMP=0x197810 bounds=0x197810-0x197818
loc_197810:
    ldrb     w0, [x0, #0xa]
    ret      

// -[WCLGChatTextApplyState setResolvedPayment:] IMP=0x197818 bounds=0x197818-0x197820
loc_197818:
    strb     w2, [x0, #0xa]
    ret      

// -[WCLGChatTextApplyState resolvedColor] IMP=0x197820 bounds=0x197820-0x197828
loc_197820:
    ldr      x0, [x0, #0x90]
    ret      

// -[WCLGChatTextApplyState setResolvedColor:] IMP=0x197828 bounds=0x197828-0x197834
loc_197828:
    mov      x1, x2
    add      x0, x0, #0x90
    b        #0x461cfc // _objc_storeStrong

// -[WCLGChatTextApplyState .cxx_destruct] IMP=0x197834 bounds=0x197834-0x197874
loc_197834:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    add      x0, x0, #0x90
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x80
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x78
    bl       #0x461c0c // _objc_destroyWeak
    add      x0, x19, #0x70
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c0c // _objc_destroyWeak
