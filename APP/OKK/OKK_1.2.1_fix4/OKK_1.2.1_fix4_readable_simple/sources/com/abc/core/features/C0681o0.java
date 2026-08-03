package com.abc.core.features;

import com.abc.core.hooks.ModuleLog;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

/* JADX INFO: renamed from: c0.o0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0681o0 implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2139a;

    public /* synthetic */ C0681o0(int r1) {
        this.f2139a = r1;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch(this.f2139a) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        RealNameTailHook r02 = RealNameTailHook.f2163a;
        return Boolean.FALSE;
    L6:
        ModuleLog r03 = ModuleLog.INSTANCE;
        return new SimpleDateFormat("HH:mm:ss.SSS", Locale.US);
    L8:
        AtomicBoolean r04 = GroupMemberTitleHook.f1874a;
        return Boolean.FALSE;
    L10:
        FoldBannerPinHook r05 = FoldBannerPinHook.f2154a;
        return Boolean.FALSE;
    }
}
