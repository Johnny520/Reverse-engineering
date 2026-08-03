package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f3 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xb.i f16057h;

    public /* synthetic */ f3(xb.i r1, int r2) {
            r0 = this;
            r0.f16056g = r2
            r0.f16057h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f16056g
            switch(r0) {
                case 0: goto L105;
                case 1: goto Ld1;
                case 2: goto Lb3;
                case 3: goto L81;
                case 4: goto L66;
                default: goto L5;
            }
        L5:
            i.c r10 = (i.c) r10
            xb.i r10 = r9.f16057h
            m.a r0 = r10.f21498q
            long r1 = java.lang.System.currentTimeMillis()
            float r3 = r10.c()
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r3
            r5 = 0
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r5 = (long) r5
            r7 = 32
            long r3 = r3 << r7
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            long r3 = r3 | r5
            java.lang.Object r5 = r0.f8069h
            t1.b r5 = (t1.b) r5
            r5.a(r1, r3)
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            long r1 = a.a.d(r1, r1)
            long r0 = r0.j(r1)
            float r0 = u2.q.b(r0)
            lg.a r1 = r10.f21483b
            float r2 = r1.f8041b
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r2 = r2.floatValue()
            float r1 = r1.f8040a
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r1 = r1.floatValue()
            float r2 = r2 - r1
            float r0 = r0 / r2
            qg.t r1 = r10.f21482a
            xb.a r2 = new xb.a
            r3 = 2
            r4 = 0
            r2.<init>(r10, r0, r4, r3)
            r10 = 3
            qg.v.q(r1, r4, r2, r10)
        L63:
            sf.n r10 = sf.n.f12433a
            return r10
        L66:
            s1.t r10 = (s1.t) r10
            r10.getClass()
            xb.i r10 = r9.f16057h
            hb.w r0 = r10.f21485d
            r0.invoke(r10)
            qg.t r0 = r10.f21482a
            ci.j r1 = new ci.j
            r2 = 24
            r3 = 0
            r1.<init>(r10, r3, r2)
            r10 = 3
            qg.v.q(r0, r3, r1, r10)
            goto L63
        L81:
            s1.t r10 = (s1.t) r10
            r10.getClass()
            xb.i r10 = r9.f16057h
            m.a r0 = r10.f21498q
            java.lang.Object r0 = r0.f8069h
            t1.b r0 = (t1.b) r0
            t1.d r1 = r0.f12980a
            t1.a[] r2 = r1.f12989d
            r3 = 0
            tf.l.x0(r3, r2)
            r2 = 0
            r1.f12990e = r2
            t1.d r1 = r0.f12981b
            t1.a[] r4 = r1.f12989d
            tf.l.x0(r3, r4)
            r1.f12990e = r2
            r1 = 0
            r0.f12982c = r1
            qg.t r0 = r10.f21482a
            ci.u r1 = new ci.u
            r2 = 7
            r1.<init>(r10, r3, r2)
            r10 = 3
            qg.v.q(r0, r3, r1, r10)
            goto L63
        Lb3:
            th.g r10 = (th.g) r10
            r10.getClass()
            xb.i r0 = r9.f16057h
            float r0 = r0.a()
            r1 = 10
            float r1 = (float) r1
            float r2 = r10.f13288g
            float r1 = r1 * r2
            float r1 = r1 * r0
            r3 = 14
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 * r0
            r0 = 1
            r3 = 1056964608(0x3f000000, float:0.5)
            a.a.w0(r10, r1, r2, r0, r3)
            goto L63
        Ld1:
            f1.d0 r10 = (f1.d0) r10
            r10.getClass()
            long r0 = r10.a()
            r2 = 32
            long r0 = r0 >> r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto Le9
            r0 = r1
        Le9:
            r2 = 16
            float r2 = (float) r2
            float r3 = r10.d()
            float r3 = r3 * r2
            float r3 = r3 / r0
            float r3 = r3 + r1
            xb.i r0 = r9.f16057h
            float r0 = r0.a()
            float r0 = fb.v0.C(r1, r3, r0)
            r10.q(r0)
            r10.i(r0)
            goto L63
        L105:
            f1.d0 r10 = (f1.d0) r10
            r10.getClass()
            xb.i r0 = r9.f16057h
            i.c r1 = r0.f21495n
            java.lang.Object r1 = r1.d()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r10.q(r1)
            i.c r1 = r0.f21496o
            java.lang.Object r1 = r1.d()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r10.i(r1)
            i.c r0 = r0.f21493l
            java.lang.Object r0 = r0.d()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r1
            float r1 = r10.b()
            r2 = 1061158912(0x3f400000, float:0.75)
            float r2 = r2 * r0
            r3 = -1102263091(0xffffffffbe4ccccd, float:-0.2)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L148
            r2 = r3
        L148:
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 <= 0) goto L150
            r2 = r4
        L150:
            r5 = 1065353216(0x3f800000, float:1.0)
            float r2 = r5 - r2
            float r1 = r1 / r2
            r10.q(r1)
            float r1 = r10.v()
            r2 = 1048576000(0x3e800000, float:0.25)
            float r0 = r0 * r2
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L164
            goto L165
        L164:
            r3 = r0
        L165:
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 <= 0) goto L16a
            goto L16b
        L16a:
            r4 = r3
        L16b:
            float r5 = r5 - r4
            float r5 = r5 * r1
            r10.i(r5)
            goto L63
    }
}
