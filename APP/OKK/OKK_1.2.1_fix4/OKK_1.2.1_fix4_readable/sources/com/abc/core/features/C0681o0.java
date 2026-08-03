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

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f2139a) {
            case 0:
                FoldBannerPinHook foldBannerPinHook = FoldBannerPinHook.f2154a;
                return Boolean.FALSE;
            case 1:
                AtomicBoolean atomicBoolean = GroupMemberTitleHook.f1874a;
                return Boolean.FALSE;
            case 2:
                ModuleLog moduleLog = ModuleLog.INSTANCE;
                return new SimpleDateFormat("HH:mm:ss.SSS", Locale.US);
            default:
                RealNameTailHook realNameTailHook = RealNameTailHook.f2163a;
                return Boolean.FALSE;
        }
    }
}
