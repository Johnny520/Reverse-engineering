package defpackage;

/* JADX INFO: renamed from: ᛴᛴᛸᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0658 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.util.ArrayList f3200;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.AbstractC1714 f3201;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public boolean f3202;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0964 f3203;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f3204;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f3205;

    public C0658(defpackage.C0964 r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f3203 = r1
            r0.f3204 = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3200 = r1
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static void m1488(defpackage.C0658 r1, java.lang.String r2, defpackage.InterfaceC1781 r3) {
            r1.getClass()
            ᛷᛱᛴᲈ r0 = new ᛷᛱᛴᲈ
            r0.<init>(r2, r3)
            r2 = 0
            r1.m1491(r0, r2)
            return
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.f3204
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m1489() {
            r2 = this;
            ᛵᲀᲇᛸ r0 = r2.f3203
            java.util.TimeZone r1 = defpackage.AbstractC0508.f2501
            monitor-enter(r0)
            r1 = 1
            r2.f3202 = r1     // Catch: java.lang.Throwable -> L14
            boolean r1 = r2.m1492()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            ᛵᲀᲇᛸ r1 = r2.f3203     // Catch: java.lang.Throwable -> L14
            r1.m1909(r2)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r2 = move-exception
            goto L18
        L16:
            monitor-exit(r0)
            return
        L18:
            monitor-exit(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean m1490(defpackage.AbstractC1714 r12, long r13, boolean r15) {
            r11 = this;
            ᛵᲀᲇᛸ r0 = r11.f3203
            java.util.logging.Logger r0 = r0.f4282
            ᛴᛴᛸᛴ r1 = r12.f7625
            r2 = 0
            if (r1 != r11) goto La
            goto Le
        La:
            if (r1 != 0) goto L85
            r12.f7625 = r11
        Le:
            long r3 = java.lang.System.nanoTime()
            long r5 = r3 + r13
            java.util.ArrayList r1 = r11.f3200
            int r7 = r1.indexOf(r12)
            r8 = -1
            if (r7 == r8) goto L34
            long r9 = r12.f7624
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 > 0) goto L31
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r0.isLoggable(r13)
            if (r13 == 0) goto L84
            java.lang.String r13 = "already scheduled"
            defpackage.AbstractC1533.m2774(r0, r12, r11, r13)
            return r2
        L31:
            r1.remove(r7)
        L34:
            r12.f7624 = r5
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            boolean r7 = r0.isLoggable(r7)
            if (r7 == 0) goto L5a
            if (r15 == 0) goto L4c
            long r5 = r5 - r3
            java.lang.String r15 = defpackage.AbstractC1533.m2779(r5)
            java.lang.String r5 = "run again after "
            java.lang.String r15 = r5.concat(r15)
            goto L57
        L4c:
            long r5 = r5 - r3
            java.lang.String r15 = defpackage.AbstractC1533.m2779(r5)
            java.lang.String r5 = "scheduled after "
            java.lang.String r15 = r5.concat(r15)
        L57:
            defpackage.AbstractC1533.m2774(r0, r12, r11, r15)
        L5a:
            java.util.Iterator r11 = r1.iterator()
            r15 = r2
        L5f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r0 = r11.next()
            ᲀᛷᲁᛸ r0 = (defpackage.AbstractC1714) r0
            long r5 = r0.f7624
            long r5 = r5 - r3
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 <= 0) goto L73
            goto L77
        L73:
            int r15 = r15 + 1
            goto L5f
        L76:
            r15 = r8
        L77:
            if (r15 != r8) goto L7d
            int r15 = r1.size()
        L7d:
            r1.add(r15, r12)
            if (r15 != 0) goto L84
            r11 = 1
            return r11
        L84:
            return r2
        L85:
            java.lang.String r11 = "task is in multiple queues"
            defpackage.C2264.m3676(r11)
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m1491(defpackage.AbstractC1714 r3, long r4) {
            r2 = this;
            ᛵᲀᲇᛸ r0 = r2.f3203
            monitor-enter(r0)
            boolean r1 = r2.f3202     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L34
            boolean r4 = r3.f7627     // Catch: java.lang.Throwable -> L1d
            ᛵᲀᲇᛸ r5 = r2.f3203
            java.util.logging.Logger r5 = r5.f4282
            if (r4 == 0) goto L21
            java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L1d
            boolean r4 = r5.isLoggable(r4)     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto L1f
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            defpackage.AbstractC1533.m2774(r5, r3, r2, r4)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r2 = move-exception
            goto L42
        L1f:
            monitor-exit(r0)
            return
        L21:
            java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L1d
            boolean r4 = r5.isLoggable(r4)     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto L2e
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            defpackage.AbstractC1533.m2774(r5, r3, r2, r4)     // Catch: java.lang.Throwable -> L1d
        L2e:
            java.util.concurrent.RejectedExecutionException r2 = new java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L1d
            r2.<init>()     // Catch: java.lang.Throwable -> L1d
            throw r2     // Catch: java.lang.Throwable -> L1d
        L34:
            r1 = 0
            boolean r3 = r2.m1490(r3, r4, r1)     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L40
            ᛵᲀᲇᛸ r3 = r2.f3203     // Catch: java.lang.Throwable -> L1d
            r3.m1909(r2)     // Catch: java.lang.Throwable -> L1d
        L40:
            monitor-exit(r0)
            return
        L42:
            monitor-exit(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean m1492() {
            r6 = this;
            ᲀᛷᲁᛸ r0 = r6.f3201
            r1 = 1
            if (r0 == 0) goto Lb
            boolean r0 = r0.f7627
            if (r0 == 0) goto Lb
            r6.f3205 = r1
        Lb:
            java.util.ArrayList r0 = r6.f3200
            int r2 = r0.size()
            int r2 = r2 - r1
            r3 = 0
        L13:
            r4 = -1
            if (r4 >= r2) goto L3e
            java.lang.Object r4 = r0.get(r2)
            ᲀᛷᲁᛸ r4 = (defpackage.AbstractC1714) r4
            boolean r4 = r4.f7627
            if (r4 == 0) goto L3b
            ᛵᲀᲇᛸ r3 = r6.f3203
            java.util.logging.Logger r3 = r3.f4282
            java.lang.Object r4 = r0.get(r2)
            ᲀᛷᲁᛸ r4 = (defpackage.AbstractC1714) r4
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            boolean r5 = r3.isLoggable(r5)
            if (r5 == 0) goto L37
            java.lang.String r5 = "canceled"
            defpackage.AbstractC1533.m2774(r3, r4, r6, r5)
        L37:
            r0.remove(r2)
            r3 = r1
        L3b:
            int r2 = r2 + (-1)
            goto L13
        L3e:
            return r3
    }
}
