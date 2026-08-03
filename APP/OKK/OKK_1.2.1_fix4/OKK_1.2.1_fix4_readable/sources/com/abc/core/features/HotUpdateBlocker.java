package com.abc.core.features;

import de.robv.android.xposed.AbstractC0762d;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p009E0.AbstractC0182m;

/* JADX INFO: renamed from: c0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class HotUpdateBlocker {

    /* JADX INFO: renamed from: a */
    public static final HotUpdateBlocker f2005a = new HotUpdateBlocker();

    /* JADX INFO: renamed from: b */
    public static final List f2006b = AbstractC0182m.m556h0("com.tencent.tinker.lib.service.TinkerPatchForeService", "com.tencent.tinker.lib.service.TinkerPatchService", "com.tencent.tinker.lib.service.TinkerPatchService$InnerService", "com.tencent.tinker.lib.service.DefaultTinkerResultService");

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2007c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static boolean m1628a() {
        Object objM116u;
        try {
            ConfigStore configStore = ConfigStore.f2048a;
            objM116u = Boolean.valueOf(ConfigStore.m1661c("disable_hot_update", false));
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Object obj = Boolean.FALSE;
        if (objM116u instanceof C0140f) {
            objM116u = obj;
        }
        return ((Boolean) objM116u).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public static void m1629b(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-HotUpdate] " + str);
        } catch (Throwable unused) {
        }
    }
}
