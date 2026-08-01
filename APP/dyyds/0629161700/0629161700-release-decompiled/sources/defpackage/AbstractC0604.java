package defpackage;

/* JADX INFO: renamed from: ᛴᛱᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0604 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C1580 f2989 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final java.lang.Object f2990 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C2301 f2991 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.util.concurrent.ThreadPoolExecutor f2992 = null;

    static {
            ᲈᛸᛲᛵ r0 = new ᲈᛸᛲᛵ
            r1 = 16
            r0.<init>(r1)
            defpackage.AbstractC0604.f2991 = r0
            ᛴᲁᲇᛲ r9 = new ᛴᲁᲇᛲ
            r0 = 2
            r9.<init>(r0)
            java.util.concurrent.ThreadPoolExecutor r2 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingDeque r8 = new java.util.concurrent.LinkedBlockingDeque
            r8.<init>()
            r3 = 0
            r4 = 1
            r5 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2.<init>(r3, r4, r5, r7, r8, r9)
            r0 = 1
            r2.allowCoreThreadTimeOut(r0)
            defpackage.AbstractC0604.f2992 = r2
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.AbstractC0604.f2990 = r0
            ᛸᲇᛲᛶ r0 = new ᛸᲇᛲᛶ
            r1 = 0
            r0.<init>(r1)
            defpackage.AbstractC0604.f2989 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.lang.String m1398(int r3, java.util.List r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.size()
            if (r1 >= r2) goto L2f
            java.lang.Object r2 = r4.get(r1)
            ᲇᛱᛸᛱ r2 = (defpackage.C1982) r2
            java.lang.String r2 = r2.f8578
            r0.append(r2)
            java.lang.String r2 = "-"
            r0.append(r2)
            r0.append(r3)
            int r2 = r4.size()
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L2c
            java.lang.String r2 = ";"
            r0.append(r2)
        L2c:
            int r1 = r1 + 1
            goto L6
        L2f:
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static defpackage.C0748 m1399(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
            ᲈᛸᛲᛵ r0 = defpackage.AbstractC0604.f2991
            java.lang.String r1 = "getFontSync"
            defpackage.AbstractC2193.m3597(r1)
            java.lang.Object r1 = r0.m3732(r8)     // Catch: java.lang.Throwable -> La0
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L18
            ᛴᲀᛷ r8 = new ᛴᲀᛷ     // Catch: java.lang.Throwable -> La0
            r8.<init>(r1)     // Catch: java.lang.Throwable -> La0
            android.os.Trace.endSection()
            return r8
        L18:
            ᲇᛶᲀᛸ r10 = defpackage.AbstractC2323.m3796(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L96 java.lang.Throwable -> La0
            java.lang.Object r1 = r10.f8900     // Catch: java.lang.Throwable -> La0
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> La0
            int r10 = r10.f8901     // Catch: java.lang.Throwable -> La0
            r2 = 1
            r3 = -3
            r4 = 0
            if (r10 == 0) goto L2d
            if (r10 == r2) goto L2b
        L29:
            r10 = r3
            goto L4e
        L2b:
            r10 = -2
            goto L4e
        L2d:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> La0
            ᛲᛳᲈᲁ[] r10 = (defpackage.C0275[]) r10     // Catch: java.lang.Throwable -> La0
            if (r10 == 0) goto L4d
            int r5 = r10.length     // Catch: java.lang.Throwable -> La0
            if (r5 != 0) goto L39
            goto L4d
        L39:
            int r5 = r10.length     // Catch: java.lang.Throwable -> La0
            r6 = r4
        L3b:
            if (r6 >= r5) goto L4b
            r7 = r10[r6]     // Catch: java.lang.Throwable -> La0
            int r7 = r7.f1552     // Catch: java.lang.Throwable -> La0
            if (r7 == 0) goto L48
            if (r7 >= 0) goto L46
            goto L29
        L46:
            r10 = r7
            goto L4e
        L48:
            int r6 = r6 + 1
            goto L3b
        L4b:
            r10 = r4
            goto L4e
        L4d:
            r10 = r2
        L4e:
            if (r10 == 0) goto L59
            ᛴᲀᛷ r8 = new ᛴᲀᛷ     // Catch: java.lang.Throwable -> La0
            r8.<init>(r10)     // Catch: java.lang.Throwable -> La0
            android.os.Trace.endSection()
            return r8
        L59:
            int r10 = r1.size()     // Catch: java.lang.Throwable -> La0
            if (r10 <= r2) goto L75
            ᛸᛵᛴᛲ r10 = defpackage.AbstractC0796.f3688     // Catch: java.lang.Throwable -> La0
            java.lang.String r10 = "TypefaceCompat.createFromFontInfoWithFallback"
            defpackage.AbstractC2193.m3597(r10)     // Catch: java.lang.Throwable -> La0
            ᛸᛵᛴᛲ r10 = defpackage.AbstractC0796.f3688     // Catch: java.lang.Throwable -> L70
            android.graphics.Typeface r9 = r10.m2697(r9, r1, r11)     // Catch: java.lang.Throwable -> L70
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> La0
            goto L7f
        L70:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> La0
            throw r8     // Catch: java.lang.Throwable -> La0
        L75:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> La0
            ᛲᛳᲈᲁ[] r10 = (defpackage.C0275[]) r10     // Catch: java.lang.Throwable -> La0
            android.graphics.Typeface r9 = defpackage.AbstractC0796.m1726(r9, r10, r11)     // Catch: java.lang.Throwable -> La0
        L7f:
            if (r9 == 0) goto L8d
            r0.m3734(r8, r9)     // Catch: java.lang.Throwable -> La0
            ᛴᲀᛷ r8 = new ᛴᲀᛷ     // Catch: java.lang.Throwable -> La0
            r8.<init>(r9)     // Catch: java.lang.Throwable -> La0
            android.os.Trace.endSection()
            return r8
        L8d:
            ᛴᲀᛷ r8 = new ᛴᲀᛷ     // Catch: java.lang.Throwable -> La0
            r8.<init>(r3)     // Catch: java.lang.Throwable -> La0
            android.os.Trace.endSection()
            return r8
        L96:
            ᛴᲀᛷ r8 = new ᛴᲀᛷ     // Catch: java.lang.Throwable -> La0
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> La0
            android.os.Trace.endSection()
            return r8
        La0:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
    }
}
