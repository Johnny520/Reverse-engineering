package p000;

/* JADX INFO: loaded from: classes.dex */
public final class t3 extends de.robv.android.xposed.XC_MethodReplacement {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ p000.g3<de.robv.android.xposed.XC_MethodHook.MethodHookParam, java.lang.Object> f1033;

    public t3(p000.g3<? super de.robv.android.xposed.XC_MethodHook.MethodHookParam, ? extends java.lang.Object> r1) {
            r0 = this;
            r0.f1033 = r1
            r0.<init>()
            return
    }

    public final java.lang.Object replaceHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) {
            r2 = this;
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x0022: FILL_ARRAY_DATA , data: [4, 29, -24, 58, 49} // fill-array
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x002a: FILL_ARRAY_DATA , data: [116, 124, -102, 91, 92, -22} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m189(r0, r3)
            ۟.g3<de.robv.android.xposed.XC_MethodHook$MethodHookParam, java.lang.Object> r0 = r2.f1033     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r3 = p000.s3.m393(r0, r3)     // Catch: java.lang.Throwable -> L1a
            goto L21
        L1a:
            r3 = move-exception
            java.lang.StringBuilder r0 = p000.b0.f131
            ۟.b0.a.m58(r3)
            r3 = 0
        L21:
            return r3
    }
}
