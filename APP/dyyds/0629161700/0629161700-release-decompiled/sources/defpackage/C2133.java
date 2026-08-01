package defpackage;

/* JADX INFO: renamed from: ᲇᲁᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2133 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C2133 f9104 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C0389 f9105 = null;

    static {
            r0 = -596223349661230(0xfffde1bcef0961d2, double:NaN)
            ᲇᲁᲁᛲ r0 = new ᲇᲁᲁᛲ
            r0.<init>()
            defpackage.C2133.f9104 = r0
            ᛷᛸᛵ r0 = new ᛷᛸᛵ
            r1 = 18
            r0.<init>(r1)
            ᛲᲈᛶᲈ r1 = new ᛲᲈᛶᲈ
            r1.<init>(r0)
            defpackage.C2133.f9105 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3551() {
            ᛲᲈᛶᲈ r0 = defpackage.C2133.f9105
            java.lang.Object r1 = r0.getValue()
            ᲇᲀᛴᛴ r1 = (defpackage.C2117) r1
            java.util.LinkedHashMap r1 = r1.f9070
            r1.clear()
            java.lang.Object r0 = r0.getValue()
            ᲇᲀᛴᛴ r0 = (defpackage.C2117) r0
            java.util.ArrayList r0 = r0.f9071
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()
            io.github.libxposed.api.XposedInterface$HookHandle r1 = (io.github.libxposed.api.XposedInterface.HookHandle) r1
            r1.unhook()     // Catch: java.lang.Exception -> L29
            goto L19
        L29:
            r1 = move-exception
            r2 = -596167515086382(0xfffde1c9ef0961d2, double:NaN)
            java.lang.String r2 = "unhook error"
            r3 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r3 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r3 = defpackage.C0346.f1773
            r3.getClass()
            defpackage.C0346.m1038(r2, r1)
            goto L19
        L4c:
            return
    }
}
