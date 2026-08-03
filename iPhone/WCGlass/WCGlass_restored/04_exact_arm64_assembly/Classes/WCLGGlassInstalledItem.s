// Exact ARM64 listing for WCLGGlassInstalledItem

// -[WCLGGlassInstalledItem themeId] IMP=0x2E2538 bounds=0x2E2538-0x2E2540
loc_2E2538:
    ldr      x0, [x0, #8]
    ret      

// -[WCLGGlassInstalledItem setThemeId:] IMP=0x2E2540 bounds=0x2E2540-0x2E2548
loc_2E2540:
    str      x2, [x0, #8]
    ret      

// -[WCLGGlassInstalledItem type] IMP=0x2E2548 bounds=0x2E2548-0x2E2550
loc_2E2548:
    ldr      x0, [x0, #0x10]
    ret      

// -[WCLGGlassInstalledItem setType:] IMP=0x2E2550 bounds=0x2E2550-0x2E2558
loc_2E2550:
    mov      w3, #0x10
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGlassInstalledItem name] IMP=0x2E2558 bounds=0x2E2558-0x2E2560
loc_2E2558:
    ldr      x0, [x0, #0x18]
    ret      

// -[WCLGGlassInstalledItem setName:] IMP=0x2E2560 bounds=0x2E2560-0x2E2568
loc_2E2560:
    mov      w3, #0x18
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGlassInstalledItem subtitle] IMP=0x2E2568 bounds=0x2E2568-0x2E2570
loc_2E2568:
    ldr      x0, [x0, #0x20]
    ret      

// -[WCLGGlassInstalledItem setSubtitle:] IMP=0x2E2570 bounds=0x2E2570-0x2E2578
loc_2E2570:
    mov      w3, #0x20
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGlassInstalledItem iconURL] IMP=0x2E2578 bounds=0x2E2578-0x2E2580
loc_2E2578:
    ldr      x0, [x0, #0x28]
    ret      

// -[WCLGGlassInstalledItem setIconURL:] IMP=0x2E2580 bounds=0x2E2580-0x2E2588
loc_2E2580:
    mov      w3, #0x28
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGlassInstalledItem version] IMP=0x2E2588 bounds=0x2E2588-0x2E2590
loc_2E2588:
    ldr      x0, [x0, #0x30]
    ret      

// -[WCLGGlassInstalledItem setVersion:] IMP=0x2E2590 bounds=0x2E2590-0x2E2598
loc_2E2590:
    mov      w3, #0x30
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGlassInstalledItem versionCode] IMP=0x2E2598 bounds=0x2E2598-0x2E25A0
loc_2E2598:
    ldr      x0, [x0, #0x38]
    ret      

// -[WCLGGlassInstalledItem setVersionCode:] IMP=0x2E25A0 bounds=0x2E25A0-0x2E25A8
loc_2E25A0:
    str      x2, [x0, #0x38]
    ret      

// -[WCLGGlassInstalledItem importPath] IMP=0x2E25A8 bounds=0x2E25A8-0x2E25B0
loc_2E25A8:
    ldr      x0, [x0, #0x40]
    ret      

// -[WCLGGlassInstalledItem setImportPath:] IMP=0x2E25B0 bounds=0x2E25B0-0x2E25B8
loc_2E25B0:
    mov      w3, #0x40
    b        #0x461cf0 // _objc_setProperty_nonatomic_copy

// -[WCLGGlassInstalledItem importedAt] IMP=0x2E25B8 bounds=0x2E25B8-0x2E25C0
loc_2E25B8:
    ldr      d0, [x0, #0x48]
    ret      

// -[WCLGGlassInstalledItem setImportedAt:] IMP=0x2E25C0 bounds=0x2E25C0-0x2E25C8
loc_2E25C0:
    str      d0, [x0, #0x48]
    ret      

// -[WCLGGlassInstalledItem .cxx_destruct] IMP=0x2E25C8 bounds=0x2E25C8-0x2E2628
loc_2E25C8:
    stp      x20, x19, [sp, #-0x20]!
    stp      x29, x30, [sp, #0x10]
    add      x29, sp, #0x10
    mov      x19, x0
    add      x0, x0, #0x40
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
    bl       #0x461cfc // _objc_storeStrong
    add      x0, x19, #0x10
    mov      x1, #0
    ldp      x29, x30, [sp, #0x10]
    ldp      x20, x19, [sp], #0x20
    b        #0x461cfc // _objc_storeStrong
