package xhss;

/* JADX INFO: renamed from: xhss.ᛷᲀᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0701 extends xhss.AbstractC0458 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ int f2366;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f2367;

    public C0701(java.lang.String r2, xhss.InterfaceC0030 r3) {
            r1 = this;
            r0 = 1
            r1.f2366 = r0
            r1.f2367 = r3
            r1.<init>(r2)
            return
    }

    public C0701(xhss.C1127 r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.f2366 = r0
            r1.f2367 = r2
            r1.<init>(r3)
            return
    }

    @Override // xhss.AbstractC0458
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final long mo835() {
            r18 = this;
            r0 = r18
            int r1 = r0.f2366
            r2 = -1
            switch(r1) {
                case 0: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.Object r0 = r0.f2367
            xhss.ᛱᛳᲇᛶ r0 = (xhss.InterfaceC0030) r0
            r0.mo136()
            return r2
        L11:
            java.lang.Object r0 = r0.f2367
            xhss.ᲈᛲᲀᛵ r0 = (xhss.C1127) r0
            long r4 = java.lang.System.nanoTime()
            long r6 = r0.f3640
            long r6 = r4 - r6
            r8 = 1
            long r6 = r6 + r8
            java.util.concurrent.ConcurrentLinkedQueue r1 = r0.f3641
            java.util.Iterator r1 = r1.iterator()
            r8 = 0
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
            r13 = r8
            r14 = r13
            r12 = r11
        L30:
            boolean r15 = r1.hasNext()
            if (r15 == 0) goto L5d
            java.lang.Object r15 = r1.next()
            xhss.ᲈᲁᛲᲇ r15 = (xhss.C1184) r15
            monitor-enter(r15)
            int r16 = r0.m1821(r15, r4)     // Catch: java.lang.Throwable -> L5a
            if (r16 <= 0) goto L46
            int r12 = r12 + 1
            goto L56
        L46:
            long r2 = r15.f3829     // Catch: java.lang.Throwable -> L5a
            int r17 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r17 >= 0) goto L4e
            r6 = r2
            r13 = r15
        L4e:
            int r11 = r11 + 1
            int r17 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r17 >= 0) goto L56
            r9 = r2
            r14 = r15
        L56:
            monitor-exit(r15)
            r2 = -1
            goto L30
        L5a:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L5d:
            if (r13 == 0) goto L61
            r8 = r13
            goto L69
        L61:
            r1 = 5
            if (r11 <= r1) goto L67
            r6 = r9
            r8 = r14
            goto L69
        L67:
            r6 = -1
        L69:
            if (r8 == 0) goto Laf
            monitor-enter(r8)
            java.util.ArrayList r1 = r8.f3824     // Catch: java.lang.Throwable -> Lac
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lac
            r2 = 0
            if (r1 != 0) goto L78
        L76:
            monitor-exit(r8)
            goto Lbe
        L78:
            long r4 = r8.f3829     // Catch: java.lang.Throwable -> Lac
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L7f
            goto L76
        L7f:
            r1 = 1
            r8.f3831 = r1     // Catch: java.lang.Throwable -> Lac
            java.util.concurrent.ConcurrentLinkedQueue r1 = r0.f3641     // Catch: java.lang.Throwable -> Lac
            r1.remove(r8)     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r8)
            java.net.Socket r1 = r8.f3825
            xhss.AbstractC0559.m987(r1)
            java.util.concurrent.ConcurrentLinkedQueue r1 = r0.f3641
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lbe
            xhss.ᲇᲀᲀᛷ r0 = r0.f3638
            xhss.ᛸᛱᛴᛳ r1 = r0.f3483
            monitor-enter(r1)
            boolean r4 = r0.m1741()     // Catch: java.lang.Throwable -> La6
            if (r4 == 0) goto La8
            xhss.ᛸᛱᛴᛳ r4 = r0.f3483     // Catch: java.lang.Throwable -> La6
            r4.m1268(r0)     // Catch: java.lang.Throwable -> La6
            goto La8
        La6:
            r0 = move-exception
            goto Laa
        La8:
            monitor-exit(r1)
            goto Lbe
        Laa:
            monitor-exit(r1)
            throw r0
        Lac:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        Laf:
            if (r14 == 0) goto Lb7
            long r0 = r0.f3640
            long r9 = r9 + r0
            long r2 = r9 - r4
            goto Lbe
        Lb7:
            if (r12 <= 0) goto Lbc
            long r2 = r0.f3640
            goto Lbe
        Lbc:
            r2 = -1
        Lbe:
            return r2
    }
}
