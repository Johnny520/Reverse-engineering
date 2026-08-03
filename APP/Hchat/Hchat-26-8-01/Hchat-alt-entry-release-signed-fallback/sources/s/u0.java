package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u0 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s.w0 f12115h;

    public /* synthetic */ u0(s.w0 r1, int r2) {
            r0 = this;
            r0.f12114g = r2
            r0.f12115h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r5 = this;
            int r0 = r5.f12114g
            switch(r0) {
                case 0: goto L70;
                case 1: goto L4a;
                default: goto L5;
            }
        L5:
            s.w0 r0 = r5.f12115h
            r.f r1 = r0.f12122v
            r.z r1 = r1.f11163b
            r.p r2 = r1.j()
            m.p1 r2 = r2.f11233o
            m.p1 r3 = m.p1.f8324g
            if (r2 != r3) goto L25
            r.p r1 = r1.j()
            long r1 = r1.b()
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
        L23:
            int r1 = (int) r1
            goto L31
        L25:
            r.p r1 = r1.j()
            long r1 = r1.b()
            r3 = 32
            long r1 = r1 >> r3
            goto L23
        L31:
            r.f r0 = r0.f12122v
            r.z r0 = r0.f11163b
            r.p r2 = r0.j()
            int r2 = r2.f11230l
            int r2 = -r2
            r.p r0 = r0.j()
            int r0 = r0.f11234p
            int r2 = r2 + r0
            int r1 = r1 - r2
            float r0 = (float) r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L4a:
            s.w0 r0 = r5.f12115h
            r.f r0 = r0.f12122v
            r.z r0 = r0.f11163b
            int r1 = r0.h()
            int r2 = r0.i()
            boolean r0 = r0.d()
            if (r0 == 0) goto L67
            int r1 = r1 * 500
            int r1 = r1 + r2
            float r0 = (float) r1
            r1 = 100
            float r1 = (float) r1
            float r0 = r0 + r1
            goto L6b
        L67:
            int r1 = r1 * 500
            int r1 = r1 + r2
            float r0 = (float) r1
        L6b:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L70:
            s.w0 r0 = r5.f12115h
            r.f r0 = r0.f12122v
            r.z r0 = r0.f11163b
            int r1 = r0.h()
            int r0 = r0.i()
            int r1 = r1 * 500
            int r1 = r1 + r0
            float r0 = (float) r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }
}
