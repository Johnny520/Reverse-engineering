package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛷᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0294 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final java.util.concurrent.ThreadPoolExecutor f1133 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final java.lang.Object f1134 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.C1084 f1135 = null;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final xhss.C0377 f1136 = null;

    static {
            xhss.ᲇᲀᲈᛲ r0 = new xhss.ᲇᲀᲈᛲ
            r1 = 16
            r0.<init>(r1)
            xhss.AbstractC0294.f1135 = r0
            xhss.ᲇᛳᲀᲀ r9 = new xhss.ᲇᛳᲀᲀ
            r9.<init>()
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
            xhss.AbstractC0294.f1133 = r2
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            xhss.AbstractC0294.f1134 = r0
            xhss.ᛴᛶᲀᛶ r0 = new xhss.ᛴᛶᲀᛶ
            r0.<init>()
            xhss.AbstractC0294.f1136 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static xhss.C0271 m619(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
            xhss.ᲇᲀᲈᛲ r0 = xhss.AbstractC0294.f1135
            java.lang.String r1 = "getFontSync"
            xhss.AbstractC0060.m180(r1)
            java.lang.Object r1 = r0.m1745(r8)     // Catch: java.lang.Throwable -> La0
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L18
            xhss.ᛳᛵᛴᲈ r8 = new xhss.ᛳᛵᛴᲈ     // Catch: java.lang.Throwable -> La0
            r8.<init>(r1)     // Catch: java.lang.Throwable -> La0
            android.os.Trace.endSection()
            return r8
        L18:
            xhss.ᛱᲇᛴᲇ r10 = xhss.AbstractC0791.m1359(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L96 java.lang.Throwable -> La0
            java.lang.Object r1 = r10.f486     // Catch: java.lang.Throwable -> La0
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> La0
            int r10 = r10.f485     // Catch: java.lang.Throwable -> La0
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
            xhss.ᛵᛶᲈᛳ[] r10 = (xhss.C0486[]) r10     // Catch: java.lang.Throwable -> La0
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
            int r7 = r7.f1791     // Catch: java.lang.Throwable -> La0
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
            xhss.ᛳᛵᛴᲈ r8 = new xhss.ᛳᛵᛴᲈ     // Catch: java.lang.Throwable -> La0
            r8.<init>(r10)     // Catch: java.lang.Throwable -> La0
            android.os.Trace.endSection()
            return r8
        L59:
            int r10 = r1.size()     // Catch: java.lang.Throwable -> La0
            if (r10 <= r2) goto L75
            xhss.ᛶᛵᲇᛸ r10 = xhss.AbstractC0101.f469     // Catch: java.lang.Throwable -> La0
            java.lang.String r10 = "TypefaceCompat.createFromFontInfoWithFallback"
            xhss.AbstractC0060.m180(r10)     // Catch: java.lang.Throwable -> La0
            xhss.ᛶᛵᲇᛸ r10 = xhss.AbstractC0101.f469     // Catch: java.lang.Throwable -> L70
            android.graphics.Typeface r9 = r10.m1034(r9, r1, r11)     // Catch: java.lang.Throwable -> L70
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> La0
            goto L7f
        L70:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> La0
            throw r8     // Catch: java.lang.Throwable -> La0
        L75:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> La0
            xhss.ᛵᛶᲈᛳ[] r10 = (xhss.C0486[]) r10     // Catch: java.lang.Throwable -> La0
            android.graphics.Typeface r9 = xhss.AbstractC0101.m270(r9, r10, r11)     // Catch: java.lang.Throwable -> La0
        L7f:
            if (r9 == 0) goto L8d
            r0.m1744(r8, r9)     // Catch: java.lang.Throwable -> La0
            xhss.ᛳᛵᛴᲈ r8 = new xhss.ᛳᛵᛴᲈ     // Catch: java.lang.Throwable -> La0
            r8.<init>(r9)     // Catch: java.lang.Throwable -> La0
            android.os.Trace.endSection()
            return r8
        L8d:
            xhss.ᛳᛵᛴᲈ r8 = new xhss.ᛳᛵᛴᲈ     // Catch: java.lang.Throwable -> La0
            r8.<init>(r3)     // Catch: java.lang.Throwable -> La0
            android.os.Trace.endSection()
            return r8
        L96:
            xhss.ᛳᛵᛴᲈ r8 = new xhss.ᛳᛵᛴᲈ     // Catch: java.lang.Throwable -> La0
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> La0
            android.os.Trace.endSection()
            return r8
        La0:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static java.lang.String m620(java.util.List r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r3.size()
            if (r1 >= r2) goto L2f
            java.lang.Object r2 = r3.get(r1)
            xhss.ᛷᛱᛲᲇ r2 = (xhss.C0622) r2
            java.lang.String r2 = r2.f2145
            r0.append(r2)
            java.lang.String r2 = "-"
            r0.append(r2)
            r0.append(r4)
            int r2 = r3.size()
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
}
