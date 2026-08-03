package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends gg.m implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fg.l f4780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i.k1 f4781h;

    public y(fg.l r1, i.k1 r2) {
            r0 = this;
            r0.f4780g = r1
            r0.f4781h = r2
            r1 = 3
            r0.<init>(r1)
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            r8 = this;
            v1.p0 r9 = (v1.p0) r9
            v1.m0 r10 = (v1.m0) r10
            u2.a r11 = (u2.a) r11
            long r0 = r11.f13338a
            v1.b1 r10 = r10.Q(r0)
            boolean r11 = r9.u0()
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r2 = 32
            if (r11 == 0) goto L32
            i.k1 r11 = r8.f4781h
            i0.j1 r11 = r11.f5710d
            java.lang.Object r11 = r11.getValue()
            fg.l r3 = r8.f4780g
            java.lang.Object r11 = r3.invoke(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L32
            r3 = 0
            goto L3c
        L32:
            int r11 = r10.f13900g
            int r3 = r10.f13901h
            long r4 = (long) r11
            long r4 = r4 << r2
            long r6 = (long) r3
            long r6 = r6 & r0
            long r3 = r4 | r6
        L3c:
            long r5 = r3 >> r2
            int r11 = (int) r5
            long r0 = r0 & r3
            int r0 = (int) r0
            c1.n r1 = new c1.n
            r2 = 1
            r1.<init>(r10, r2)
            tf.u r10 = tf.u.f13168g
            v1.o0 r9 = r9.z(r11, r0, r10, r1)
            return r9
    }
}
