package defpackage;

/* JADX INFO: renamed from: ᲈᛷᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2298 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final int f9719 = 0;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1487 f9720 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C0389 f9721 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C0389 f9722 = null;

    static {
            ᛷᛸᛵ r0 = new ᛷᛸᛵ
            r1 = 22
            r0.<init>(r1)
            ᛲᲈᛶᲈ r1 = new ᛲᲈᛶᲈ
            r1.<init>(r0)
            defpackage.AbstractC2298.f9721 = r1
            ᛷᛸᛵ r0 = new ᛷᛸᛵ
            r1 = 23
            r0.<init>(r1)
            ᛲᲈᛶᲈ r1 = new ᛲᲈᛶᲈ
            r1.<init>(r0)
            defpackage.AbstractC2298.f9722 = r1
            ᛸᛵᛴᛲ r0 = new ᛸᛵᛴᛲ
            r0.<init>()
            defpackage.AbstractC2298.f9720 = r0
            r0 = 3
            defpackage.AbstractC2298.f9719 = r0
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L39
            java.lang.String r1 = "org.slf4j.simpleLogger.defaultLogLevel"
            java.lang.String r2 = "warn"
            java.lang.System.setProperty(r1, r2)
        L39:
            defpackage.AbstractC2298.f9719 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3729(java.lang.String r2, java.lang.Throwable r3) {
            int r0 = defpackage.AbstractC2298.f9719
            int r0 = defpackage.AbstractC0225.m812(r0)
            r1 = 3
            int r1 = defpackage.AbstractC0225.m812(r1)
            if (r0 > r1) goto L39
            ᛸᛵᛴᛲ r0 = defpackage.AbstractC2298.f9720
            r0.getClass()
            ᛲᲈᛶᲈ r0 = defpackage.AbstractC2298.f9722
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L30
            ᛲᲈᛶᲈ r0 = defpackage.AbstractC2298.f9721
            java.lang.Object r0 = r0.getValue()
            ᛱᛸᲀᛱ r0 = (defpackage.InterfaceC0150) r0
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.mo675(r2, r3)
            return
        L30:
            java.lang.String r0 = "KavaRef"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            android.util.Log.w(r0, r2, r3)
        L39:
            return
    }
}
