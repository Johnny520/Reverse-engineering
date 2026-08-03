package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xa implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20125k;

    public /* synthetic */ xa(i0.a1 r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, int r5) {
            r0 = this;
            r0.f20121g = r5
            r0.f20122h = r1
            r0.f20123i = r2
            r0.f20124j = r3
            r0.f20125k = r4
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f20121g
            switch(r0) {
                case 0: goto La9;
                case 1: goto L50;
                default: goto L5;
            }
        L5:
            r.h r9 = (r.h) r9
            r9.getClass()
            s0.d r0 = wb.p0.f18213b0
            r1 = 0
            r2 = 3
            r.h.a(r9, r1, r0, r2)
            wb.s1 r0 = new wb.s1
            r3 = 4
            i0.a1 r4 = r8.f20122h
            r0.<init>(r4, r3)
            s0.d r3 = new s0.d
            r5 = -2108340708(0xffffffff8255461c, float:-1.5668889E-37)
            r6 = 1
            r3.<init>(r5, r0, r6)
            r.h.a(r9, r1, r3, r2)
            java.lang.Object r0 = r4.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4d
            s0.d r0 = wb.p0.f18221c0
            r.h.a(r9, r1, r0, r2)
            wb.p7 r0 = new wb.p7
            r3 = 0
            i0.a1 r4 = r8.f20123i
            i0.a1 r5 = r8.f20124j
            i0.a1 r7 = r8.f20125k
            r0.<init>(r4, r5, r7, r3)
            s0.d r3 = new s0.d
            r4 = 1926505271(0x72d42337, float:8.4036345E30)
            r3.<init>(r4, r0, r6)
            r.h.a(r9, r1, r3, r2)
        L4d:
            sf.n r9 = sf.n.f12433a
            return r9
        L50:
            nb.g0 r9 = (nb.g0) r9
            r9.getClass()
            java.util.List r0 = r9.f9268a
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L64:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7d
            java.lang.Object r2 = r0.next()
            nb.h0 r2 = (nb.h0) r2
            wb.dq r3 = new wb.dq
            java.lang.String r4 = r2.f9278b
            java.lang.String r2 = r2.f9277a
            r3.<init>(r2, r4)
            r1.add(r3)
            goto L64
        L7d:
            i0.a1 r0 = r8.f20122h
            r0.setValue(r1)
            java.lang.String r0 = r9.f9269b
            i0.a1 r1 = r8.f20123i
            r1.setValue(r0)
            boolean r0 = r9.f9271d
            if (r0 == 0) goto L98
            java.lang.String r9 = r9.f9270c
            boolean r0 = og.m.t0(r9)
            if (r0 == 0) goto L9a
            java.lang.String r9 = "其它可用引擎"
            goto L9a
        L98:
            java.lang.String r9 = ""
        L9a:
            i0.a1 r0 = r8.f20124j
            r0.setValue(r9)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            i0.a1 r0 = r8.f20125k
            r0.setValue(r9)
        La6:
            sf.n r9 = sf.n.f12433a
            return r9
        La9:
            nb.g0 r9 = (nb.g0) r9
            r9.getClass()
            java.util.List r0 = r9.f9268a
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        Lbd:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Ld6
            java.lang.Object r2 = r0.next()
            nb.h0 r2 = (nb.h0) r2
            wb.dq r3 = new wb.dq
            java.lang.String r4 = r2.f9278b
            java.lang.String r2 = r2.f9277a
            r3.<init>(r2, r4)
            r1.add(r3)
            goto Lbd
        Ld6:
            i0.a1 r0 = r8.f20122h
            r0.setValue(r1)
            java.lang.String r0 = r9.f9269b
            i0.a1 r1 = r8.f20123i
            r1.setValue(r0)
            boolean r0 = r9.f9271d
            if (r0 == 0) goto Lf1
            java.lang.String r9 = r9.f9270c
            boolean r0 = og.m.t0(r9)
            if (r0 == 0) goto Lf3
            java.lang.String r9 = "其它可用引擎"
            goto Lf3
        Lf1:
            java.lang.String r9 = ""
        Lf3:
            i0.a1 r0 = r8.f20124j
            r0.setValue(r9)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            i0.a1 r0 = r8.f20125k
            r0.setValue(r9)
            goto La6
    }
}
