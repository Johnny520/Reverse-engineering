package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class t50 {

    /* JADX INFO: renamed from: α */
    public static final p000.kw0 f10202 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ThreadPoolExecutor f10203 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.lang.Object f10204 = null;

    /* JADX INFO: renamed from: δ */
    public static final p000.fw1 f10205 = null;

    static {
            kw0 r0 = new kw0
            r1 = 16
            r0.<init>(r1)
            p000.t50.f10202 = r0
            mn1 r9 = new mn1
            r9.<init>()
            java.util.concurrent.ThreadPoolExecutor r2 = new java.util.concurrent.ThreadPoolExecutor
            r0 = 10000(0x2710, float:1.4013E-41)
            long r5 = (long) r0
            java.util.concurrent.LinkedBlockingDeque r8 = new java.util.concurrent.LinkedBlockingDeque
            r8.<init>()
            r3 = 0
            r4 = 1
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2.<init>(r3, r4, r5, r7, r8, r9)
            r0 = 1
            r2.allowCoreThreadTimeOut(r0)
            p000.t50.f10203 = r2
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.t50.f10204 = r0
            fw1 r0 = new fw1
            r1 = 0
            r0.<init>(r1)
            p000.t50.f10205 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m5606(int r3, java.util.List r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.size()
            if (r1 >= r2) goto L2f
            java.lang.Object r2 = r4.get(r1)
            n50 r2 = (p000.n50) r2
            java.lang.String r2 = r2.f7395
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

    /* JADX INFO: renamed from: β */
    public static p000.s50 m5607(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
            kw0 r0 = p000.t50.f10202
            java.lang.String r1 = "getFontSync"
            p000.e81.m1872(r1)
            java.lang.Object r1 = r0.m3421(r8)     // Catch: java.lang.Throwable -> La0
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L18
            s50 r8 = new s50     // Catch: java.lang.Throwable -> La0
            r8.<init>(r1)     // Catch: java.lang.Throwable -> La0
            android.os.Trace.endSection()
            return r8
        L18:
            v r10 = p000.m50.m3728(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L96 java.lang.Throwable -> La0
            java.lang.Object r1 = r10.f11045     // Catch: java.lang.Throwable -> La0
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> La0
            int r10 = r10.f11044     // Catch: java.lang.Throwable -> La0
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
            f60[] r10 = (p000.f60[]) r10     // Catch: java.lang.Throwable -> La0
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
            int r7 = r7.f3763     // Catch: java.lang.Throwable -> La0
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
            s50 r8 = new s50     // Catch: java.lang.Throwable -> La0
            r8.<init>(r10)     // Catch: java.lang.Throwable -> La0
            android.os.Trace.endSection()
            return r8
        L59:
            int r10 = r1.size()     // Catch: java.lang.Throwable -> La0
            if (r10 <= r2) goto L75
            zz1 r10 = p000.i62.f4928     // Catch: java.lang.Throwable -> La0
            java.lang.String r10 = "TypefaceCompat.createFromFontInfoWithFallback"
            p000.e81.m1872(r10)     // Catch: java.lang.Throwable -> La0
            zz1 r10 = p000.i62.f4928     // Catch: java.lang.Throwable -> L70
            android.graphics.Typeface r9 = r10.m7261(r9, r1, r11)     // Catch: java.lang.Throwable -> L70
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> La0
            goto L7f
        L70:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> La0
            throw r8     // Catch: java.lang.Throwable -> La0
        L75:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> La0
            f60[] r10 = (p000.f60[]) r10     // Catch: java.lang.Throwable -> La0
            android.graphics.Typeface r9 = p000.i62.m2622(r9, r10, r11)     // Catch: java.lang.Throwable -> La0
        L7f:
            if (r9 == 0) goto L8d
            r0.m3422(r8, r9)     // Catch: java.lang.Throwable -> La0
            s50 r8 = new s50     // Catch: java.lang.Throwable -> La0
            r8.<init>(r9)     // Catch: java.lang.Throwable -> La0
            android.os.Trace.endSection()
            return r8
        L8d:
            s50 r8 = new s50     // Catch: java.lang.Throwable -> La0
            r8.<init>(r3)     // Catch: java.lang.Throwable -> La0
            android.os.Trace.endSection()
            return r8
        L96:
            s50 r8 = new s50     // Catch: java.lang.Throwable -> La0
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
