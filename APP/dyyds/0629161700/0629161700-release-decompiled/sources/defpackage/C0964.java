package defpackage;

/* JADX INFO: renamed from: ᛵᲀᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0964 {

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final java.util.logging.Logger f4273 = null;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static final defpackage.C0964 f4274 = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.util.ArrayList f4275;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final java.util.ArrayList f4276;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public long f4277;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f4278;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f4279;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1180 f4280;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final defpackage.RunnableC0439 f4281;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.logging.Logger f4282;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f4283;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f4284;

    static {
            java.lang.Class<ᛵᲀᲇᛸ> r0 = defpackage.C0964.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            defpackage.C0964.f4273 = r0
            ᛵᲀᲇᛸ r0 = new ᛵᲀᲇᛸ
            ᛶᲈᛱᲈ r1 = new ᛶᲈᛱᲈ
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = defpackage.AbstractC0508.f2502
            r2.append(r3)
            java.lang.String r3 = " TaskRunner"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            ᛳᛴᛵᛷ r10 = new ᛳᛴᛵᛷ
            r3 = 1
            r10.<init>(r2, r3)
            r1.<init>()
            java.util.concurrent.ThreadPoolExecutor r3 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.SynchronousQueue r9 = new java.util.concurrent.SynchronousQueue
            r9.<init>()
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 60
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            r3.<init>(r4, r5, r6, r8, r9, r10)
            r1.f5356 = r3
            r0.<init>(r1)
            defpackage.C0964.f4274 = r0
            return
    }

    public C0964(defpackage.C1180 r2) {
            r1 = this;
            r1.<init>()
            r1.f4280 = r2
            java.util.logging.Logger r2 = defpackage.C0964.f4273
            r1.f4282 = r2
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.f4279 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f4275 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f4276 = r2
            ᛳᛳᛵᛲ r2 = new ᛳᛳᛵᛲ
            r0 = 16
            r2.<init>(r0, r1)
            r1.f4281 = r2
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m1907() {
            r2 = this;
            java.util.TimeZone r0 = defpackage.AbstractC0508.f2501
            int r0 = r2.f4283
            int r1 = r2.f4284
            if (r0 <= r1) goto L9
            return
        L9:
            int r0 = r0 + 1
            r2.f4283 = r0
            ᛶᲈᛱᲈ r0 = r2.f4280
            java.lang.Object r0 = r0.f5356
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0
            ᛳᛳᛵᛲ r2 = r2.f4281
            r0.execute(r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0658 m1908() {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f4279     // Catch: java.lang.Throwable -> L14
            int r1 = r0 + 1
            r3.f4279 = r1     // Catch: java.lang.Throwable -> L14
            monitor-exit(r3)
            ᛴᛴᛸᛴ r1 = new ᛴᛴᛸᛴ
            java.lang.String r2 = "Q"
            java.lang.String r0 = defpackage.AbstractC1124.m2145(r0, r2)
            r1.<init>(r3, r0)
            return r1
        L14:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m1909(defpackage.C0658 r3) {
            r2 = this;
            java.util.TimeZone r0 = defpackage.AbstractC0508.f2501
            ᲀᛷᲁᛸ r0 = r3.f3201
            if (r0 != 0) goto L1f
            java.util.ArrayList r0 = r3.f3200
            boolean r0 = r0.isEmpty()
            java.util.ArrayList r1 = r2.f4276
            if (r0 != 0) goto L1c
            byte[] r0 = defpackage.AbstractC0709.f3358
            boolean r0 = r1.contains(r3)
            if (r0 != 0) goto L1f
            r1.add(r3)
            goto L1f
        L1c:
            r1.remove(r3)
        L1f:
            boolean r3 = r2.f4278
            if (r3 == 0) goto L27
            r2.notify()
            return
        L27:
            r2.m1907()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m1910(defpackage.AbstractC1714 r5, long r6, boolean r8) {
            r4 = this;
            java.util.TimeZone r0 = defpackage.AbstractC0508.f2501
            ᛴᛴᛸᛴ r0 = r5.f7625
            ᲀᛷᲁᛸ r1 = r0.f3201
            if (r1 != r5) goto L38
            boolean r1 = r0.f3205
            r2 = 0
            r0.f3205 = r2
            r2 = 0
            r0.f3201 = r2
            java.util.ArrayList r2 = r4.f4275
            r2.remove(r0)
            r2 = -1
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 == 0) goto L25
            if (r1 != 0) goto L25
            boolean r1 = r0.f3202
            if (r1 != 0) goto L25
            r1 = 1
            r0.m1490(r5, r6, r1)
        L25:
            java.util.ArrayList r5 = r0.f3200
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L37
            java.util.ArrayList r5 = r4.f4276
            r5.add(r0)
            if (r8 != 0) goto L37
            r4.m1907()
        L37:
            return
        L38:
            java.lang.String r4 = "Check failed."
            defpackage.C2264.m3676(r4)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.AbstractC1714 m1911() {
            r17 = this;
            r1 = r17
            java.util.TimeZone r0 = defpackage.AbstractC0508.f2501
        L4:
            java.util.ArrayList r0 = r1.f4276
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto Lf
            goto L83
        Lf:
            long r4 = java.lang.System.nanoTime()
            java.util.Iterator r2 = r0.iterator()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = r3
        L1d:
            boolean r9 = r2.hasNext()
            r10 = 1
            r11 = 0
            r13 = 0
            if (r9 == 0) goto L4b
            java.lang.Object r9 = r2.next()
            ᛴᛴᛸᛴ r9 = (defpackage.C0658) r9
            java.util.ArrayList r9 = r9.f3200
            java.lang.Object r9 = r9.get(r13)
            ᲀᛷᲁᛸ r9 = (defpackage.AbstractC1714) r9
            long r14 = r9.f7624
            long r14 = r14 - r4
            long r14 = java.lang.Math.max(r11, r14)
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 <= 0) goto L45
            long r6 = java.lang.Math.min(r14, r6)
            goto L1d
        L45:
            if (r8 == 0) goto L49
            r2 = r10
            goto L4c
        L49:
            r8 = r9
            goto L1d
        L4b:
            r2 = r13
        L4c:
            java.util.ArrayList r9 = r1.f4275
            if (r8 == 0) goto L75
            java.util.TimeZone r3 = defpackage.AbstractC0508.f2501
            r3 = -1
            r8.f7624 = r3
            ᛴᛴᛸᛴ r3 = r8.f7625
            java.util.ArrayList r4 = r3.f3200
            r4.remove(r8)
            r0.remove(r3)
            r3.f3201 = r8
            r9.add(r3)
            if (r2 != 0) goto L71
            boolean r2 = r1.f4278
            if (r2 != 0) goto L74
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L74
        L71:
            r1.m1907()
        L74:
            return r8
        L75:
            boolean r2 = r1.f4278
            if (r2 == 0) goto L84
            long r8 = r1.f4277
            long r8 = r8 - r4
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L83
            r1.notify()
        L83:
            return r3
        L84:
            r1.f4278 = r10
            long r4 = r4 + r6
            r1.f4277 = r4
            java.util.TimeZone r2 = defpackage.AbstractC0508.f2501     // Catch: java.lang.Throwable -> La1 java.lang.InterruptedException -> La7
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 <= 0) goto La3
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r14 = r6 / r3
            long r3 = r3 * r14
            long r6 = r6 - r3
            int r3 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r3 > 0) goto L9c
            if (r2 <= 0) goto La3
        L9c:
            int r2 = (int) r6     // Catch: java.lang.Throwable -> La1 java.lang.InterruptedException -> La7
            r1.wait(r14, r2)     // Catch: java.lang.Throwable -> La1 java.lang.InterruptedException -> La7
            goto La3
        La1:
            r0 = move-exception
            goto Ldb
        La3:
            r1.f4278 = r13
            goto L4
        La7:
            java.util.TimeZone r2 = defpackage.AbstractC0508.f2501     // Catch: java.lang.Throwable -> La1
            int r2 = r9.size()     // Catch: java.lang.Throwable -> La1
            int r2 = r2 - r10
        Lae:
            r3 = -1
            if (r3 >= r2) goto Lbd
            java.lang.Object r3 = r9.get(r2)     // Catch: java.lang.Throwable -> La1
            ᛴᛴᛸᛴ r3 = (defpackage.C0658) r3     // Catch: java.lang.Throwable -> La1
            r3.m1492()     // Catch: java.lang.Throwable -> La1
            int r2 = r2 + (-1)
            goto Lae
        Lbd:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> La1
            int r2 = r2 - r10
        Lc2:
            if (r3 >= r2) goto La3
            java.lang.Object r4 = r0.get(r2)     // Catch: java.lang.Throwable -> La1
            ᛴᛴᛸᛴ r4 = (defpackage.C0658) r4     // Catch: java.lang.Throwable -> La1
            r4.m1492()     // Catch: java.lang.Throwable -> La1
            java.util.ArrayList r4 = r4.f3200     // Catch: java.lang.Throwable -> La1
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> La1
            if (r4 == 0) goto Ld8
            r0.remove(r2)     // Catch: java.lang.Throwable -> La1
        Ld8:
            int r2 = r2 + (-1)
            goto Lc2
        Ldb:
            r1.f4278 = r13
            throw r0
    }
}
