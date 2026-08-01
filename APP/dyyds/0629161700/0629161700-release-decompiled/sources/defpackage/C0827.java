package defpackage;

/* JADX INFO: renamed from: ᛵᛲᛵᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0827 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final boolean f3818 = false;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C1926 f3819;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1939 f3820;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1702 f3821;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1186 f3822;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1403 f3823;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C1126 f3824;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C1326 f3825;

    static {
            java.lang.String r0 = "Engine"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            defpackage.C0827.f3818 = r0
            return
    }

    public C0827(defpackage.C1702 r10, defpackage.C1180 r11, defpackage.ExecutorServiceC0166 r12, defpackage.ExecutorServiceC0166 r13, defpackage.ExecutorServiceC0166 r14, defpackage.ExecutorServiceC0166 r15) {
            r9 = this;
            r9.<init>()
            r9.f3821 = r10
            ᲈᛵᛷᛱ r0 = new ᲈᛵᛷᛱ
            r0.<init>(r11)
            ᛷᛸᛱᛸ r11 = new ᛷᛸᛱᛸ
            r1 = 2
            r11.<init>(r1)
            r9.f3825 = r11
            monitor-enter(r9)
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L56
            r11.f5859 = r9     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L56
            ᛷᲈᲀ r11 = new ᛷᲈᲀ
            r2 = 21
            r11.<init>(r2)
            r9.f3823 = r11
            ᛶᲈᛷᛶ r11 = new ᛶᲈᛷᛶ
            r11.<init>(r1)
            r9.f3822 = r11
            ᲁᲇᛱᲈ r2 = new ᲁᲇᛱᲈ
            r8 = r9
            r7 = r9
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r7.f3820 = r2
            ᛶᛸᛶᛲ r9 = new ᛶᛸᛶᛲ
            r9.<init>(r0)
            r7.f3824 = r9
            ᲁᲁᛴᲇ r9 = new ᲁᲁᛴᲇ
            r9.<init>()
            android.os.Handler r11 = new android.os.Handler
            android.os.Looper r12 = android.os.Looper.getMainLooper()
            ᲈᛷᛴᲁ r13 = new ᲈᛷᛴᲁ
            r13.<init>()
            r11.<init>(r12, r13)
            r9.f8366 = r11
            r7.f3819 = r9
            r10.f7584 = r7
            return
        L56:
            r0 = move-exception
            r7 = r9
        L58:
            r9 = r0
            goto L63
        L5a:
            r0 = move-exception
            r7 = r9
        L5c:
            r9 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L61
            throw r9     // Catch: java.lang.Throwable -> L5f
        L5f:
            r0 = move-exception
            goto L58
        L61:
            r0 = move-exception
            goto L5c
        L63:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5f
            throw r9
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static void m1754(java.lang.String r1, long r2, defpackage.C0442 r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            double r1 = defpackage.AbstractC1856.m3272(r2)
            r0.append(r1)
            java.lang.String r1 = "ms, key: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = "Engine"
            android.util.Log.v(r2, r1)
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static void m1755(defpackage.InterfaceC1901 r1) {
            boolean r0 = r1 instanceof defpackage.C2014
            if (r0 == 0) goto La
            ᲇᛳᛲ r1 = (defpackage.C2014) r1
            r1.m3404()
            return
        La:
            java.lang.String r1 = "Cannot release anything but an EngineResource"
            defpackage.C2264.m3684(r1)
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m1756(defpackage.InterfaceC1711 r4, defpackage.C2014 r5) {
            r3 = this;
            ᛷᛸᛱᛸ r0 = r3.f3825
            monitor-enter(r0)
            java.lang.Object r1 = r0.f5856     // Catch: java.lang.Throwable -> L2a
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r1 = r1.remove(r4)     // Catch: java.lang.Throwable -> L2a
            ᲀᛴᲀ r1 = (defpackage.C1664) r1     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L15
            r2 = 0
            r1.f7441 = r2     // Catch: java.lang.Throwable -> L2a
            r1.clear()     // Catch: java.lang.Throwable -> L2a
        L15:
            monitor-exit(r0)
            boolean r0 = r5.f8704
            if (r0 == 0) goto L23
            ᲀᛷᛲᛱ r3 = r3.f3821
            java.lang.Object r3 = r3.m1692(r4, r5)
            ᲁᛸᛸ r3 = (defpackage.InterfaceC1901) r3
            return
        L23:
            ᲁᲁᛴᲇ r3 = r3.f3819
            r4 = 0
            r3.m3352(r5, r4)
            return
        L2a:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final synchronized void m1757(defpackage.C0621 r2, defpackage.C0442 r3, defpackage.C2014 r4) {
            r1 = this;
            monitor-enter(r1)
            if (r4 == 0) goto Lf
            boolean r0 = r4.f8704     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            ᛷᛸᛱᛸ r0 = r1.f3825     // Catch: java.lang.Throwable -> Ld
            r0.m2484(r3, r4)     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L25
        Lf:
            ᛶᲈᛷᛶ r4 = r1.f3822     // Catch: java.lang.Throwable -> Ld
            r4.getClass()     // Catch: java.lang.Throwable -> Ld
            r2.getClass()     // Catch: java.lang.Throwable -> Ld
            java.util.HashMap r4 = r4.f5383     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r0 = r4.get(r3)     // Catch: java.lang.Throwable -> Ld
            if (r2 == r0) goto L20
            goto L23
        L20:
            r4.remove(r3)     // Catch: java.lang.Throwable -> Ld
        L23:
            monitor-exit(r1)
            return
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1326 m1758(defpackage.C0909 r24, java.lang.Object r25, defpackage.InterfaceC1711 r26, int r27, int r28, java.lang.Class r29, java.lang.Class r30, defpackage.EnumC1307 r31, defpackage.C1506 r32, defpackage.C0619 r33, boolean r34, boolean r35, defpackage.C0533 r36, boolean r37, boolean r38, defpackage.C1622 r39, defpackage.ExecutorC1811 r40) {
            r23 = this;
            r2 = r23
            boolean r0 = defpackage.C0827.f3818
            if (r0 == 0) goto Ld
            int r0 = defpackage.AbstractC1856.f8102
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            goto Lf
        Ld:
            r0 = 0
        Lf:
            ᛷᲈᲀ r3 = r2.f3823
            r3.getClass()
            ᛳᛳᛸᛷ r4 = new ᛳᛳᛸᛷ
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r10 = r29
            r11 = r30
            r9 = r33
            r12 = r36
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            monitor-enter(r23)
            r3 = r37
            ᲇᛳᛲ r5 = r2.m1759(r4, r3, r0)     // Catch: java.lang.Throwable -> L5e
            if (r5 != 0) goto L60
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r17 = r38
            r18 = r39
            r19 = r40
            r21 = r0
            r16 = r3
            r20 = r4
            r3 = r24
            r4 = r25
            ᛷᛸᛱᛸ r0 = r2.m1760(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r23)     // Catch: java.lang.Throwable -> L5e
            return r0
        L5e:
            r0 = move-exception
            goto L6a
        L60:
            r0 = r5
            monitor-exit(r23)     // Catch: java.lang.Throwable -> L5e
            r1 = 5
            r2 = r39
            r2.m2938(r0, r1)
            r0 = 0
            return r0
        L6a:
            monitor-exit(r23)     // Catch: java.lang.Throwable -> L5e
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2014 m1759(defpackage.C0442 r8, boolean r9, long r10) {
            r7 = this;
            r0 = 0
            if (r9 != 0) goto L5
            goto L86
        L5:
            ᛷᛸᛱᛸ r9 = r7.f3825
            monitor-enter(r9)
            java.lang.Object r1 = r9.f5856     // Catch: java.lang.Throwable -> L23
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L23
            ᲀᛴᲀ r1 = (defpackage.C1664) r1     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L17
            monitor-exit(r9)
            r2 = r0
            goto L28
        L17:
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> L23
            ᲇᛳᛲ r2 = (defpackage.C2014) r2     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L27
            r9.m2467(r1)     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r0 = move-exception
            r7 = r0
            goto L8b
        L27:
            monitor-exit(r9)
        L28:
            if (r2 == 0) goto L2d
            r2.m3403()
        L2d:
            if (r2 == 0) goto L39
            boolean r7 = defpackage.C0827.f3818
            if (r7 == 0) goto L38
            java.lang.String r7 = "Loaded resource from active resources"
            m1754(r7, r10, r8)
        L38:
            return r2
        L39:
            ᲀᛷᛲᛱ r1 = r7.f3821
            monitor-enter(r1)
            java.util.LinkedHashMap r9 = r1.f3554     // Catch: java.lang.Throwable -> L87
            java.lang.Object r9 = r9.remove(r8)     // Catch: java.lang.Throwable -> L87
            ᛴᛴᛵᛲ r9 = (defpackage.C0650) r9     // Catch: java.lang.Throwable -> L87
            if (r9 != 0) goto L49
            monitor-exit(r1)
            r9 = r0
            goto L54
        L49:
            long r2 = r1.f3553     // Catch: java.lang.Throwable -> L87
            int r4 = r9.f3173     // Catch: java.lang.Throwable -> L87
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L87
            long r2 = r2 - r4
            r1.f3553 = r2     // Catch: java.lang.Throwable -> L87
            java.lang.Object r9 = r9.f3172     // Catch: java.lang.Throwable -> L87
            monitor-exit(r1)
        L54:
            r2 = r9
            ᲁᛸᛸ r2 = (defpackage.InterfaceC1901) r2
            if (r2 != 0) goto L5d
            r6 = r7
            r5 = r8
            r2 = r0
            goto L70
        L5d:
            boolean r9 = r2 instanceof defpackage.C2014
            if (r9 == 0) goto L66
            ᲇᛳᛲ r2 = (defpackage.C2014) r2
            r6 = r7
            r5 = r8
            goto L70
        L66:
            ᲇᛳᛲ r1 = new ᲇᛳᛲ
            r3 = 1
            r4 = 1
            r6 = r7
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r2 = r1
        L70:
            if (r2 == 0) goto L7a
            r2.m3403()
            ᛷᛸᛱᛸ r7 = r6.f3825
            r7.m2484(r5, r2)
        L7a:
            if (r2 == 0) goto L86
            boolean r7 = defpackage.C0827.f3818
            if (r7 == 0) goto L85
            java.lang.String r7 = "Loaded resource from cache"
            m1754(r7, r10, r5)
        L85:
            return r2
        L86:
            return r0
        L87:
            r0 = move-exception
            r7 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L87
            throw r7
        L8b:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L23
            throw r7
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C1326 m1760(defpackage.C0909 r17, java.lang.Object r18, defpackage.InterfaceC1711 r19, int r20, int r21, java.lang.Class r22, java.lang.Class r23, defpackage.EnumC1307 r24, defpackage.C1506 r25, defpackage.C0619 r26, boolean r27, boolean r28, defpackage.C0533 r29, boolean r30, boolean r31, defpackage.C1622 r32, java.util.concurrent.Executor r33, defpackage.C0442 r34, long r35) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r24
            r7 = r25
            r8 = r29
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            ᛶᲈᛷᛶ r14 = r0.f3822
            java.util.HashMap r14 = r14.f5383
            java.lang.Object r14 = r14.get(r11)
            ᛴᛲᛲᛷ r14 = (defpackage.C0621) r14
            if (r14 == 0) goto L38
            r14.m1428(r9, r10)
            boolean r1 = defpackage.C0827.f3818
            if (r1 == 0) goto L32
            java.lang.String r1 = "Added to existing load"
            m1754(r1, r12, r11)
        L32:
            ᛷᛸᛱᛸ r1 = new ᛷᛸᛱᛸ
            r1.<init>(r0, r9, r14)
            return r1
        L38:
            ᲁᲇᛱᲈ r14 = r0.f3820
            java.lang.Object r14 = r14.f8442
            ᛷᛸᛱᛸ r14 = (defpackage.C1326) r14
            java.lang.Object r14 = r14.mo913()
            ᛴᛲᛲᛷ r14 = (defpackage.C0621) r14
            monitor-enter(r14)
            r14.f3035 = r11     // Catch: java.lang.Throwable -> Lf6
            r15 = r30
            r14.f3042 = r15     // Catch: java.lang.Throwable -> Lf6
            r15 = r31
            r14.f3047 = r15     // Catch: java.lang.Throwable -> Lf6
            monitor-exit(r14)
            ᛶᛸᛶᛲ r15 = r0.f3824
            java.lang.Object r12 = r15.f5013
            ᛷᛸᛱᛸ r12 = (defpackage.C1326) r12
            java.lang.Object r12 = r12.mo913()
            ᛸᛱᲁᛵ r12 = (defpackage.RunnableC1425) r12
            int r13 = r15.f5016
            int r9 = r13 + 1
            r15.f5016 = r9
            ᛴᛶᛱᛲ r9 = r12.f6269
            ᲈᛵᛷᛱ r15 = r12.f6279
            r9.f3296 = r1
            r9.f3295 = r2
            r9.f3299 = r3
            r9.f3293 = r4
            r9.f3303 = r5
            r9.f3304 = r7
            r10 = r22
            r9.f3305 = r10
            r9.f3288 = r15
            r10 = r23
            r9.f3289 = r10
            r9.f3292 = r6
            r9.f3291 = r8
            r10 = r26
            r9.f3298 = r10
            r10 = r27
            r9.f3300 = r10
            r10 = r28
            r9.f3301 = r10
            r12.f6270 = r1
            r12.f6252 = r3
            r12.f6254 = r6
            r12.f6264 = r11
            r12.f6271 = r4
            r12.f6259 = r5
            r12.f6280 = r7
            r12.f6276 = r8
            r12.f6277 = r14
            r12.f6260 = r13
            r3 = 1
            r12.f6267 = r3
            r12.f6256 = r2
            ᛸᲈᛸᲈ r1 = r1.f4141
            r12.f6268 = r1
            ᛵᲇᛳᲇ r1 = defpackage.RunnableC1425.f6250
            java.lang.Object r1 = r8.m1326(r1)
            java.util.function.Supplier r1 = (java.util.function.Supplier) r1
            r12.f6272 = r1
            ᛶᲈᛷᛶ r1 = r0.f3822
            r1.getClass()
            java.util.HashMap r1 = r1.f5383
            r1.put(r11, r14)
            r9 = r32
            r10 = r33
            r14.m1428(r9, r10)
            monitor-enter(r14)
            r14.f3037 = r12     // Catch: java.lang.Throwable -> Lf3
            int r1 = r12.m2606(r3)     // Catch: java.lang.Throwable -> Lf3
            r2 = 2
            if (r1 == r2) goto Ldc
            r2 = 3
            if (r1 != r2) goto Ld2
            goto Ldc
        Ld2:
            boolean r1 = r14.f3047     // Catch: java.lang.Throwable -> Lf3
            if (r1 == 0) goto Ld9
            ᛱᲀᛷᛱ r1 = r14.f3046     // Catch: java.lang.Throwable -> Lf3
            goto Lde
        Ld9:
            ᛱᲀᛷᛱ r1 = r14.f3036     // Catch: java.lang.Throwable -> Lf3
            goto Lde
        Ldc:
            ᛱᲀᛷᛱ r1 = r14.f3033     // Catch: java.lang.Throwable -> Lf3
        Lde:
            r1.execute(r12)     // Catch: java.lang.Throwable -> Lf3
            monitor-exit(r14)
            boolean r1 = defpackage.C0827.f3818
            if (r1 == 0) goto Led
            java.lang.String r1 = "Started new load"
            r12 = r35
            m1754(r1, r12, r11)
        Led:
            ᛷᛸᛱᛸ r1 = new ᛷᛸᛱᛸ
            r1.<init>(r0, r9, r14)
            return r1
        Lf3:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lf3
            throw r0
        Lf6:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lf6
            throw r0
    }
}
