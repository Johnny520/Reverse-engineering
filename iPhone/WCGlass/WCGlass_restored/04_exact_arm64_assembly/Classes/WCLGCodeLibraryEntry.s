// Exact ARM64 listing for WCLGCodeLibraryEntry

// -[WCLGCodeLibraryEntry entryId] IMP=0x23F590 bounds=0x23F590-0x23F598
loc_23F590:
    ldr      x0, [x0, #8]
    ret      

// -[WCLGCodeLibraryEntry setEntryId:] IMP=0x23F598 bounds=0x23F598-0x23F5A0
loc_23F598:
    mov      w3, #8
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGCodeLibraryEntry name] IMP=0x23F5A0 bounds=0x23F5A0-0x23F5A8
loc_23F5A0:
    ldr      x0, [x0, #0x10]
    ret      

// -[WCLGCodeLibraryEntry setName:] IMP=0x23F5A8 bounds=0x23F5A8-0x23F5B0
loc_23F5A8:
    mov      w3, #0x10
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGCodeLibraryEntry charCount] IMP=0x23F5B0 bounds=0x23F5B0-0x23F5B8
loc_23F5B0:
    ldr      x0, [x0, #0x18]
    ret      

// -[WCLGCodeLibraryEntry setCharCount:] IMP=0x23F5B8 bounds=0x23F5B8-0x23F5C0
loc_23F5B8:
    str      x2, [x0, #0x18]
    ret      

// -[WCLGCodeLibraryEntry createdAt] IMP=0x23F5C0 bounds=0x23F5C0-0x23F5C8
loc_23F5C0:
    ldr      x0, [x0, #0x20]
    ret      

// -[WCLGCodeLibraryEntry setCreatedAt:] IMP=0x23F5C8 bounds=0x23F5C8-0x23F5D4
loc_23F5C8:
    mov      x1, x2
    add      x0, x0, #0x20
    b        #0x461cfc // _objc_storeStrong

// -[WCLGCodeLibraryEntry .cxx_destruct] IMP=0x23F5D4 bounds=0x23F5D4-0x23F610
loc_23F5D4:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    add      x0, x0, #0x20
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x10
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #8
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
