package d5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends d5.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f1994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f1996l;

    public j(b5.i r9, int r10, l5.c0 r11) {
            r8 = this;
            r8.<init>(r9, r10, r11)
            java.lang.Object r0 = r9.f483i
            ac.k r0 = (ac.k) r0
            int r10 = r0.k(r10)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.f1994j = r0
            r0 = 1
            r1 = 0
            if (r10 < 0) goto L59
            java.util.List r11 = r11.s()
            java.util.Iterator r11 = r11.iterator()
            r2 = r1
        L1f:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L86
            java.lang.Object r3 = r11.next()
            l5.b0 r3 = (l5.b0) r3
            if (r0 == 0) goto L32
            int r2 = r3.a()
            r0 = r1
        L32:
            java.lang.Object r4 = r9.f482h
            b5.h r4 = (b5.h) r4
            b5.f r5 = new b5.f
            java.lang.Object r6 = r9.f476b
            b5.c r6 = (b5.c) r6
            java.lang.Object r6 = r6.f469a
            a5.a r6 = (a5.a) r6
            int r3 = r3.b()
            int r3 = r3 + r10
            java.lang.String r7 = "pswitch_"
            r5.<init>(r6, r3, r7)
            b5.f r3 = r4.b(r5)
            java.util.ArrayList r4 = r8.f1994j
            d5.g r5 = new d5.g
            r5.<init>(r3)
            r4.add(r5)
            goto L1f
        L59:
            r8.f1996l = r0
            java.util.List r9 = r11.s()
            java.util.Iterator r9 = r9.iterator()
            r2 = r1
        L64:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L86
            java.lang.Object r10 = r9.next()
            l5.b0 r10 = (l5.b0) r10
            if (r0 == 0) goto L77
            int r2 = r10.a()
            r0 = r1
        L77:
            java.util.ArrayList r11 = r8.f1994j
            d5.h r3 = new d5.h
            int r10 = r10.b()
            r3.<init>(r10)
            r11.add(r3)
            goto L64
        L86:
            r8.f1995k = r2
            return
    }

    @Override // d5.e, b5.j
    public final boolean c(e5.a r6) {
            r5 = this;
            boolean r0 = r5.f1996l
            if (r0 == 0) goto Le
            b5.i r0 = r5.f1989h
            java.lang.Object r0 = r0.f476b
            b5.c r0 = (b5.c) r0
            e5.a r6 = r0.q(r6)
        Le:
            java.lang.String r0 = ".packed-switch "
            r6.write(r0)
            b6.f r0 = new b6.f
            int r1 = r5.f1995k
            r0.<init>(r1)
            r6.g(r0)
            r6.w()
            r0 = 10
            r6.write(r0)
            java.util.ArrayList r2 = r5.f1994j
            java.util.Iterator r2 = r2.iterator()
        L2b:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L43
            java.lang.Object r3 = r2.next()
            d5.i r3 = (d5.i) r3
            r3.a(r6)
            r5.f(r6, r1)
            r6.write(r0)
            int r1 = r1 + r4
            goto L2b
        L43:
            r6.u()
            java.lang.String r0 = ".end packed-switch"
            r6.write(r0)
            return r4
    }
}
