package com.abc.core.features;

import com.abc.core.hooks.ModuleLog;
import com.abc.core.runtime.SettingsUiBuilder;
import p007D0.C0146l;
import p029P0.InterfaceC0275a;

/* JADX INFO: renamed from: c0.D1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0581D1 implements InterfaceC0275a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1749a;

    public /* synthetic */ C0581D1(int r1) {
        this.f1749a = r1;
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        C0146l r02 = C0146l.f339a;
        switch(this.f1749a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ModuleLog r1 = ModuleLog.INSTANCE;
        ConfigStore r2 = ConfigStore.f2048a;
        r1.setEnabled(ConfigStore.m1661c("module_log_enabled", false));
        return r02;
    L6:
        SettingsUiBuilder r12 = SettingsUiBuilder.f2933a;
        return r02;
    L8:
        WallpaperOverlayHook.f1796e.post(new RunnableC0713z(2));
        return r02;
    }
}
