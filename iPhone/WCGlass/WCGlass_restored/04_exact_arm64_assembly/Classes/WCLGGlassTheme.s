// Exact ARM64 listing for WCLGGlassTheme

// -[WCLGGlassTheme themeId] IMP=0x2ED314 bounds=0x2ED314-0x2ED31C
loc_2ED314:
    ldr      x0, [x0, #0x10]
    ret      

// -[WCLGGlassTheme setThemeId:] IMP=0x2ED31C bounds=0x2ED31C-0x2ED324
loc_2ED31C:
    str      x2, [x0, #0x10]
    ret      

// -[WCLGGlassTheme type] IMP=0x2ED324 bounds=0x2ED324-0x2ED32C
loc_2ED324:
    ldr      x0, [x0, #0x18]
    ret      

// -[WCLGGlassTheme setType:] IMP=0x2ED32C bounds=0x2ED32C-0x2ED334
loc_2ED32C:
    mov      w3, #0x18
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGlassTheme name] IMP=0x2ED334 bounds=0x2ED334-0x2ED33C
loc_2ED334:
    ldr      x0, [x0, #0x20]
    ret      

// -[WCLGGlassTheme setName:] IMP=0x2ED33C bounds=0x2ED33C-0x2ED344
loc_2ED33C:
    mov      w3, #0x20
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGlassTheme subtitle] IMP=0x2ED344 bounds=0x2ED344-0x2ED34C
loc_2ED344:
    ldr      x0, [x0, #0x28]
    ret      

// -[WCLGGlassTheme setSubtitle:] IMP=0x2ED34C bounds=0x2ED34C-0x2ED354
loc_2ED34C:
    mov      w3, #0x28
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGlassTheme authorName] IMP=0x2ED354 bounds=0x2ED354-0x2ED35C
loc_2ED354:
    ldr      x0, [x0, #0x30]
    ret      

// -[WCLGGlassTheme setAuthorName:] IMP=0x2ED35C bounds=0x2ED35C-0x2ED364
loc_2ED35C:
    mov      w3, #0x30
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGlassTheme desc] IMP=0x2ED364 bounds=0x2ED364-0x2ED36C
loc_2ED364:
    ldr      x0, [x0, #0x38]
    ret      

// -[WCLGGlassTheme setDesc:] IMP=0x2ED36C bounds=0x2ED36C-0x2ED374
loc_2ED36C:
    mov      w3, #0x38
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGlassTheme iconURL] IMP=0x2ED374 bounds=0x2ED374-0x2ED37C
loc_2ED374:
    ldr      x0, [x0, #0x40]
    ret      

// -[WCLGGlassTheme setIconURL:] IMP=0x2ED37C bounds=0x2ED37C-0x2ED384
loc_2ED37C:
    mov      w3, #0x40
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGlassTheme previewURLs] IMP=0x2ED384 bounds=0x2ED384-0x2ED38C
loc_2ED384:
    ldr      x0, [x0, #0x48]
    ret      

// -[WCLGGlassTheme setPreviewURLs:] IMP=0x2ED38C bounds=0x2ED38C-0x2ED394
loc_2ED38C:
    mov      w3, #0x48
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGlassTheme version] IMP=0x2ED394 bounds=0x2ED394-0x2ED39C
loc_2ED394:
    ldr      x0, [x0, #0x50]
    ret      

// -[WCLGGlassTheme setVersion:] IMP=0x2ED39C bounds=0x2ED39C-0x2ED3A4
loc_2ED39C:
    mov      w3, #0x50
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGlassTheme versionCode] IMP=0x2ED3A4 bounds=0x2ED3A4-0x2ED3AC
loc_2ED3A4:
    ldr      x0, [x0, #0x58]
    ret      

// -[WCLGGlassTheme setVersionCode:] IMP=0x2ED3AC bounds=0x2ED3AC-0x2ED3B4
loc_2ED3AC:
    str      x2, [x0, #0x58]
    ret      

// -[WCLGGlassTheme versionId] IMP=0x2ED3B4 bounds=0x2ED3B4-0x2ED3BC
loc_2ED3B4:
    ldr      x0, [x0, #0x60]
    ret      

// -[WCLGGlassTheme setVersionId:] IMP=0x2ED3BC bounds=0x2ED3BC-0x2ED3C4
loc_2ED3BC:
    str      x2, [x0, #0x60]
    ret      

// -[WCLGGlassTheme changelog] IMP=0x2ED3C4 bounds=0x2ED3C4-0x2ED3CC
loc_2ED3C4:
    ldr      x0, [x0, #0x68]
    ret      

// -[WCLGGlassTheme setChangelog:] IMP=0x2ED3CC bounds=0x2ED3CC-0x2ED3D4
loc_2ED3CC:
    mov      w3, #0x68
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGlassTheme hasUpdate] IMP=0x2ED3D4 bounds=0x2ED3D4-0x2ED3DC
loc_2ED3D4:
    ldrb     w0, [x0, #8]
    ret      

// -[WCLGGlassTheme setHasUpdate:] IMP=0x2ED3DC bounds=0x2ED3DC-0x2ED3E4
loc_2ED3DC:
    strb     w2, [x0, #8]
    ret      

// -[WCLGGlassTheme installed] IMP=0x2ED3E4 bounds=0x2ED3E4-0x2ED3EC
loc_2ED3E4:
    ldrb     w0, [x0, #9]
    ret      

// -[WCLGGlassTheme setInstalled:] IMP=0x2ED3EC bounds=0x2ED3EC-0x2ED3F4
loc_2ED3EC:
    strb     w2, [x0, #9]
    ret      

// -[WCLGGlassTheme parentThemeId] IMP=0x2ED3F4 bounds=0x2ED3F4-0x2ED3FC
loc_2ED3F4:
    ldr      x0, [x0, #0x70]
    ret      

// -[WCLGGlassTheme setParentThemeId:] IMP=0x2ED3FC bounds=0x2ED3FC-0x2ED404
loc_2ED3FC:
    str      x2, [x0, #0x70]
    ret      

// -[WCLGGlassTheme subPackages] IMP=0x2ED404 bounds=0x2ED404-0x2ED40C
loc_2ED404:
    ldr      x0, [x0, #0x78]
    ret      

// -[WCLGGlassTheme setSubPackages:] IMP=0x2ED40C bounds=0x2ED40C-0x2ED414
loc_2ED40C:
    mov      w3, #0x78
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGlassTheme .cxx_destruct] IMP=0x2ED414 bounds=0x2ED414-0x2ED4A4
loc_2ED414:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    add      x0, x0, #0x78
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x68
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x50
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x48
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x40
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x38
    mov      x1, #0
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x30
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
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
