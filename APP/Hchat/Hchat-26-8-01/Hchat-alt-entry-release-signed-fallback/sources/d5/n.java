package d5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends d5.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f2000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2001k;

    public n(b5.i r7, int r8, l5.e0 r9) {
            r6 = this;
            r6.<init>(r7, r8, r9)
            java.lang.Object r0 = r7.f484j
            ac.k r0 = (ac.k) r0
            int r8 = r0.k(r8)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.f2000j = r0
            if (r8 < 0) goto L53
            java.util.List r9 = r9.s()
            java.util.Iterator r9 = r9.iterator()
        L1c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r9.next()
            l5.b0 r0 = (l5.b0) r0
            java.lang.Object r1 = r7.f482h
            b5.h r1 = (b5.h) r1
            b5.f r2 = new b5.f
            java.lang.Object r3 = r7.f476b
            b5.c r3 = (b5.c) r3
            java.lang.Object r3 = r3.f469a
            a5.a r3 = (a5.a) r3
            int r4 = r0.b()
            int r4 = r4 + r8
            java.lang.String r5 = "sswitch_"
            r2.<init>(r3, r4, r5)
            b5.f r1 = r1.b(r2)
            java.util.ArrayList r2 = r6.f2000j
            d5.k r3 = new d5.k
            int r0 = r0.a()
            r3.<init>(r0, r1)
            r2.add(r3)
            goto L1c
        L53:
            r7 = 1
            r6.f2001k = r7
            java.util.List r7 = r9.s()
            java.util.Iterator r7 = r7.iterator()
        L5e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L7d
            java.lang.Object r8 = r7.next()
            l5.b0 r8 = (l5.b0) r8
            java.util.ArrayList r9 = r6.f2000j
            d5.l r0 = new d5.l
            int r1 = r8.a()
            int r8 = r8.b()
            r0.<init>(r1, r8)
            r9.add(r0)
            goto L5e
        L7d:
            return
    }

    @Override // d5.e, b5.j
    public final boolean c(e5.a r5) {
            r4 = this;
            boolean r0 = r4.f2001k
            if (r0 == 0) goto Le
            b5.i r0 = r4.f1989h
            java.lang.Object r0 = r0.f476b
            b5.c r0 = (b5.c) r0
            e5.a r5 = r0.q(r5)
        Le:
            java.lang.String r0 = ".sparse-switch\n"
            r5.write(r0)
            r5.w()
            java.util.ArrayList r0 = r4.f2000j
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()
            d5.m r1 = (d5.m) r1
            b6.f r2 = new b6.f
            int r3 = r1.f1999a
            r2.<init>(r3)
            r5.g(r2)
            java.lang.String r2 = " -> "
            r5.write(r2)
            r1.a(r5)
            int r1 = r1.f1999a
            r4.f(r5, r1)
            r1 = 10
            r5.write(r1)
            goto L1c
        L45:
            r5.u()
            java.lang.String r0 = ".end sparse-switch"
            r5.write(r0)
            r5 = 1
            return r5
    }
}
