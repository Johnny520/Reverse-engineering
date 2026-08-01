package defpackage;

/* JADX INFO: renamed from: ᛸᛸᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1538 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final java.util.concurrent.locks.Lock f6792 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final android.graphics.Paint f6793 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final android.graphics.Paint f6794 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final android.graphics.Paint f6795 = null;

    static {
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 6
            r0.<init>(r1)
            defpackage.AbstractC1538.f6794 = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 7
            r0.<init>(r1)
            defpackage.AbstractC1538.f6795 = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r29 = "XT1078"
            java.lang.String r30 = "XT1079"
            java.lang.String r2 = "XT1085"
            java.lang.String r3 = "XT1092"
            java.lang.String r4 = "XT1093"
            java.lang.String r5 = "XT1094"
            java.lang.String r6 = "XT1095"
            java.lang.String r7 = "XT1096"
            java.lang.String r8 = "XT1097"
            java.lang.String r9 = "XT1098"
            java.lang.String r10 = "XT1031"
            java.lang.String r11 = "XT1028"
            java.lang.String r12 = "XT937C"
            java.lang.String r13 = "XT1032"
            java.lang.String r14 = "XT1008"
            java.lang.String r15 = "XT1033"
            java.lang.String r16 = "XT1035"
            java.lang.String r17 = "XT1034"
            java.lang.String r18 = "XT939G"
            java.lang.String r19 = "XT1039"
            java.lang.String r20 = "XT1040"
            java.lang.String r21 = "XT1042"
            java.lang.String r22 = "XT1045"
            java.lang.String r23 = "XT1063"
            java.lang.String r24 = "XT1064"
            java.lang.String r25 = "XT1068"
            java.lang.String r26 = "XT1069"
            java.lang.String r27 = "XT1072"
            java.lang.String r28 = "XT1077"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            java.lang.String r2 = android.os.Build.MODEL
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L65
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            goto L6a
        L65:
            ᲈᛷᛵᛱ r0 = new ᲈᛷᛵᛱ
            r0.<init>()
        L6a:
            defpackage.AbstractC1538.f6792 = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            defpackage.AbstractC1538.f6793 = r0
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.<init>(r2)
            r0.setXfermode(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m2796(android.graphics.Bitmap r2, android.graphics.Bitmap r3, android.graphics.Matrix r4) {
            java.util.concurrent.locks.Lock r0 = defpackage.AbstractC1538.f6792
            r0.lock()
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L17
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L17
            android.graphics.Paint r3 = defpackage.AbstractC1538.f6794     // Catch: java.lang.Throwable -> L17
            r1.drawBitmap(r2, r4, r3)     // Catch: java.lang.Throwable -> L17
            r2 = 0
            r1.setBitmap(r2)     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            return
        L17:
            r2 = move-exception
            r0.unlock()
            throw r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static android.graphics.Bitmap m2797(defpackage.InterfaceC1612 r6, android.graphics.Bitmap r7, int r8, int r9) {
            int r0 = r7.getWidth()
            r1 = 2
            java.lang.String r2 = "TransformationUtils"
            if (r0 != r8) goto L1b
            int r0 = r7.getHeight()
            if (r0 != r9) goto L1b
            boolean r6 = android.util.Log.isLoggable(r2, r1)
            if (r6 == 0) goto L58
            java.lang.String r6 = "requested target size matches input, returning input"
            android.util.Log.v(r2, r6)
            return r7
        L1b:
            float r0 = (float) r8
            int r3 = r7.getWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            float r3 = (float) r9
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r0 = java.lang.Math.min(r0, r3)
            int r3 = r7.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            int r5 = r7.getWidth()
            if (r5 != r3) goto L59
            int r3 = r7.getHeight()
            if (r3 != r4) goto L59
            boolean r6 = android.util.Log.isLoggable(r2, r1)
            if (r6 == 0) goto L58
            java.lang.String r6 = "adjusted target size matches input, returning input"
            android.util.Log.v(r2, r6)
        L58:
            return r7
        L59:
            int r3 = r7.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = (int) r3
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r0
            int r4 = (int) r4
            android.graphics.Bitmap$Config r5 = r7.getConfig()
            if (r5 == 0) goto L72
            android.graphics.Bitmap$Config r5 = r7.getConfig()
            goto L74
        L72:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L74:
            android.graphics.Bitmap r6 = r6.mo1254(r3, r4, r5)
            boolean r3 = r7.hasAlpha()
            r6.setHasAlpha(r3)
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto Led
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "request: "
            r1.<init>(r3)
            r1.append(r8)
            java.lang.String r8 = "x"
            r1.append(r8)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            android.util.Log.v(r2, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "toFit:   "
            r9.<init>(r1)
            int r1 = r7.getWidth()
            r9.append(r1)
            r9.append(r8)
            int r1 = r7.getHeight()
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r2, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "toReuse: "
            r9.<init>(r1)
            int r1 = r6.getWidth()
            r9.append(r1)
            r9.append(r8)
            int r8 = r6.getHeight()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.v(r2, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "minPct:   "
            r8.<init>(r9)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r2, r8)
        Led:
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            r8.setScale(r0, r0)
            m2796(r7, r6, r8)
            return r6
    }
}
