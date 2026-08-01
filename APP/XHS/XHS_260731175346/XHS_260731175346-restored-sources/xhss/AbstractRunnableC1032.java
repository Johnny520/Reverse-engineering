package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛴᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC1032 implements java.lang.Runnable, java.lang.Comparable, xhss.InterfaceC0022 {
    private volatile java.lang.Object _heap;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public long f3336;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f3337;

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r3) {
            r2 = this;
            xhss.ᲇᛴᲀᛴ r3 = (xhss.AbstractRunnableC1032) r3
            long r0 = r2.f3336
            long r2 = r3.f3336
            long r0 = r0 - r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lf
            r2 = 1
            return r2
        Lf:
            if (r2 >= 0) goto L13
            r2 = -1
            return r2
        L13:
            r2 = 0
            return r2
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Delayed[nanos="
            r0.<init>(r1)
            long r1 = r3.f3336
            r0.append(r1)
            r3 = 93
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int m1682(long r9, xhss.C0448 r11, xhss.AbstractC0503 r12) {
            r8 = this;
            monitor-enter(r8)
            java.lang.Object r0 = r8._heap     // Catch: java.lang.Throwable -> L29
            xhss.ᛶᛲᛷᛵ r1 = xhss.C0614.f2109     // Catch: java.lang.Throwable -> L29
            if (r0 != r1) goto La
            monitor-exit(r8)
            r8 = 2
            return r8
        La:
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L29
            xhss.ᲇᛴᲀᛴ[] r0 = r11.f3089     // Catch: java.lang.Throwable -> L32
            r1 = 0
            if (r0 == 0) goto L13
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L32
            goto L14
        L13:
            r0 = 0
        L14:
            int r2 = xhss.AbstractC0503.f1821     // Catch: java.lang.Throwable -> L32
            sun.misc.Unsafe r2 = xhss.AbstractC1067.f3442     // Catch: java.lang.Throwable -> L32
            long r3 = xhss.AbstractC0503.f1823     // Catch: java.lang.Throwable -> L32
            int r12 = r2.getIntVolatile(r12, r3)     // Catch: java.lang.Throwable -> L32
            r2 = 1
            if (r12 == 0) goto L23
            r12 = r2
            goto L24
        L23:
            r12 = r1
        L24:
            if (r12 == 0) goto L2b
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r8)
            return r2
        L29:
            r9 = move-exception
            goto L5b
        L2b:
            r2 = 0
            if (r0 != 0) goto L34
            r11.f1601 = r9     // Catch: java.lang.Throwable -> L32
            goto L4a
        L32:
            r9 = move-exception
            goto L59
        L34:
            long r4 = r0.f3336     // Catch: java.lang.Throwable -> L32
            long r6 = r4 - r9
            int r12 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r12 < 0) goto L3d
            goto L3e
        L3d:
            r9 = r4
        L3e:
            long r4 = r11.f1601     // Catch: java.lang.Throwable -> L32
            long r6 = r9 - r4
            int r12 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r12 <= 0) goto L49
            r11.f1601 = r9     // Catch: java.lang.Throwable -> L32
            goto L4a
        L49:
            r9 = r4
        L4a:
            long r4 = r8.f3336     // Catch: java.lang.Throwable -> L32
            long r4 = r4 - r9
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 >= 0) goto L53
            r8.f3336 = r9     // Catch: java.lang.Throwable -> L32
        L53:
            r11.m1546(r8)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r8)
            return r1
        L59:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L29
            throw r9     // Catch: java.lang.Throwable -> L29
        L5b:
            monitor-exit(r8)
            throw r9
    }

    @Override // xhss.InterfaceC0022
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo125() {
            r5 = this;
            monitor-enter(r5)
            java.lang.Object r0 = r5._heap     // Catch: java.lang.Throwable -> L11
            xhss.ᛶᛲᛷᛵ r1 = xhss.C0614.f2109     // Catch: java.lang.Throwable -> L11
            if (r0 != r1) goto L9
            monitor-exit(r5)
            return
        L9:
            boolean r2 = r0 instanceof xhss.C0448     // Catch: java.lang.Throwable -> L11
            r3 = 0
            if (r2 == 0) goto L13
            xhss.ᛵᛲᲀᛵ r0 = (xhss.C0448) r0     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r0 = move-exception
            goto L31
        L13:
            r0 = r3
        L14:
            if (r0 == 0) goto L2d
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r5._heap     // Catch: java.lang.Throwable -> L2a
            boolean r4 = r2 instanceof xhss.AbstractC0952     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L20
            r3 = r2
            xhss.ᲁᛵᛱᛸ r3 = (xhss.AbstractC0952) r3     // Catch: java.lang.Throwable -> L2a
        L20:
            if (r3 != 0) goto L23
            goto L28
        L23:
            int r2 = r5.f3337     // Catch: java.lang.Throwable -> L2a
            r0.m1545(r2)     // Catch: java.lang.Throwable -> L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            goto L2d
        L2a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1     // Catch: java.lang.Throwable -> L11
        L2d:
            r5._heap = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r5)
            return
        L31:
            monitor-exit(r5)
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m1683(xhss.C0448 r3) {
            r2 = this;
            java.lang.Object r0 = r2._heap
            xhss.ᛶᛲᛷᛵ r1 = xhss.C0614.f2109
            if (r0 == r1) goto L9
            r2._heap = r3
            return
        L9:
            java.lang.String r2 = "Failed requirement."
            xhss.C0532.m959(r2)
            return
    }
}
