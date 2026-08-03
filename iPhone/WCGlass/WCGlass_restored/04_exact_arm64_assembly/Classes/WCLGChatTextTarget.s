// Exact ARM64 listing for WCLGChatTextTarget

// -[WCLGChatTextTarget view] IMP=0x197518 bounds=0x197518-0x197530
loc_197518:
    stp      x29, x30, [sp, #-0x10]!
    mov      x29, sp
    add      x0, x0, #0x10
    bl       #0x461c60 // _objc_loadWeakRetained
    ldp      x29, x30, [sp], #0x10
    b        #0x461be8 // _objc_autoreleaseReturnValue

// -[WCLGChatTextTarget setView:] IMP=0x197530 bounds=0x197530-0x19753C
loc_197530:
    mov      x1, x2
    add      x0, x0, #0x10
    b        #0x461d08 // _objc_storeWeak

// -[WCLGChatTextTarget richText] IMP=0x19753C bounds=0x19753C-0x197544
loc_19753C:
    ldrb     w0, [x0, #8]
    ret      

// -[WCLGChatTextTarget setRichText:] IMP=0x197544 bounds=0x197544-0x19754C
loc_197544:
    strb     w2, [x0, #8]
    ret      

// -[WCLGChatTextTarget explicitExternalTarget] IMP=0x19754C bounds=0x19754C-0x197554
loc_19754C:
    ldrb     w0, [x0, #9]
    ret      

// -[WCLGChatTextTarget setExplicitExternalTarget:] IMP=0x197554 bounds=0x197554-0x19755C
loc_197554:
    strb     w2, [x0, #9]
    ret      

// -[WCLGChatTextTarget lastAppliedColor] IMP=0x19755C bounds=0x19755C-0x197564
loc_19755C:
    ldr      x0, [x0, #0x18]
    ret      

// -[WCLGChatTextTarget setLastAppliedColor:] IMP=0x197564 bounds=0x197564-0x197570
loc_197564:
    mov      x1, x2
    add      x0, x0, #0x18
    b        #0x461cfc // _objc_storeStrong

// -[WCLGChatTextTarget originalTextColor] IMP=0x197570 bounds=0x197570-0x197578
loc_197570:
    ldr      x0, [x0, #0x20]
    ret      

// -[WCLGChatTextTarget setOriginalTextColor:] IMP=0x197578 bounds=0x197578-0x197584
loc_197578:
    mov      x1, x2
    add      x0, x0, #0x20
    b        #0x461cfc // _objc_storeStrong

// -[WCLGChatTextTarget originalRichTextColor] IMP=0x197584 bounds=0x197584-0x19758C
loc_197584:
    ldr      x0, [x0, #0x28]
    ret      

// -[WCLGChatTextTarget setOriginalRichTextColor:] IMP=0x19758C bounds=0x19758C-0x197598
loc_19758C:
    mov      x1, x2
    add      x0, x0, #0x28
    b        #0x461cfc // _objc_storeStrong

// -[WCLGChatTextTarget originalAttributedText] IMP=0x197598 bounds=0x197598-0x1975A0
loc_197598:
    ldr      x0, [x0, #0x30]
    ret      

// -[WCLGChatTextTarget setOriginalAttributedText:] IMP=0x1975A0 bounds=0x1975A0-0x1975AC
loc_1975A0:
    mov      x1, x2
    add      x0, x0, #0x30
    b        #0x461cfc // _objc_storeStrong

// -[WCLGChatTextTarget capturedLabelOriginals] IMP=0x1975AC bounds=0x1975AC-0x1975B4
loc_1975AC:
    ldrb     w0, [x0, #0xa]
    ret      

// -[WCLGChatTextTarget setCapturedLabelOriginals:] IMP=0x1975B4 bounds=0x1975B4-0x1975BC
loc_1975B4:
    strb     w2, [x0, #0xa]
    ret      

// -[WCLGChatTextTarget capturedRichTextOriginal] IMP=0x1975BC bounds=0x1975BC-0x1975C4
loc_1975BC:
    ldrb     w0, [x0, #0xb]
    ret      

// -[WCLGChatTextTarget setCapturedRichTextOriginal:] IMP=0x1975C4 bounds=0x1975C4-0x1975CC
loc_1975C4:
    strb     w2, [x0, #0xb]
    ret      

// -[WCLGChatTextTarget lastTextObject] IMP=0x1975CC bounds=0x1975CC-0x1975D4
loc_1975CC:
    ldr      x0, [x0, #0x38]
    ret      

// -[WCLGChatTextTarget setLastTextObject:] IMP=0x1975D4 bounds=0x1975D4-0x1975DC
loc_1975D4:
    str      x2, [x0, #0x38]
    ret      

// -[WCLGChatTextTarget lastAttributedObject] IMP=0x1975DC bounds=0x1975DC-0x1975E4
loc_1975DC:
    ldr      x0, [x0, #0x40]
    ret      

// -[WCLGChatTextTarget setLastAttributedObject:] IMP=0x1975E4 bounds=0x1975E4-0x1975EC
loc_1975E4:
    str      x2, [x0, #0x40]
    ret      

// -[WCLGChatTextTarget lastTextLength] IMP=0x1975EC bounds=0x1975EC-0x1975F4
loc_1975EC:
    ldr      x0, [x0, #0x48]
    ret      

// -[WCLGChatTextTarget setLastTextLength:] IMP=0x1975F4 bounds=0x1975F4-0x1975FC
loc_1975F4:
    str      x2, [x0, #0x48]
    ret      

// -[WCLGChatTextTarget lastAttributedLength] IMP=0x1975FC bounds=0x1975FC-0x197604
loc_1975FC:
    ldr      x0, [x0, #0x50]
    ret      

// -[WCLGChatTextTarget setLastAttributedLength:] IMP=0x197604 bounds=0x197604-0x19760C
loc_197604:
    str      x2, [x0, #0x50]
    ret      

// -[WCLGChatTextTarget .cxx_destruct] IMP=0x19760C bounds=0x19760C-0x19765C
loc_19760C:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    add      x0, x0, #0x30
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x28
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x20
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x18
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x10
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461c0c // _objc_destroyWeak
