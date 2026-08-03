package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h3 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xb.i f16484h;

    public /* synthetic */ h3(xb.i r1, int r2) {
            r0 = this;
            r0.f16483g = r2
            r0.f16484h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r7 = this;
            int r0 = r7.f16483g
            switch(r0) {
                case 0: goto L44;
                case 1: goto L30;
                case 2: goto L18;
                default: goto L5;
            }
        L5:
            xb.i r0 = r7.f16484h
            i.c r0 = r0.f21492k
            java.lang.Object r0 = r0.d()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L18:
            xb.i r0 = r7.f16484h
            hb.w r1 = r0.f21485d
            r1.invoke(r0)
            qg.t r1 = r0.f21482a
            ci.j r2 = new ci.j
            r3 = 24
            r4 = 0
            r2.<init>(r0, r4, r3)
            r0 = 3
            qg.v.q(r1, r4, r2, r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L30:
            r0 = 1067030938(0x3f99999a, float:1.2)
            xb.i r1 = r7.f16484h
            float r1 = r1.a()
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = fb.v0.C(r2, r0, r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L44:
            yb.b r1 = new yb.b
            r0 = 8
            float r0 = (float) r0
            xb.i r2 = r7.f16484h
            float r3 = r2.a()
            float r3 = r3 * r0
            long r4 = f1.w.f3126b
            r0 = 1041865114(0x3e19999a, float:0.15)
            long r5 = f1.w.b(r4, r0)
            float r0 = r2.a()
            r4 = 18
            r2 = r3
            r3 = r0
            r1.<init>(r2, r3, r4, r5)
            return r1
    }
}
