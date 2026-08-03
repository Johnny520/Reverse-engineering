package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d2 extends gg.a implements fg.p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f8118n;

    public /* synthetic */ d2(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6, int r7) {
            r0 = this;
            r0.f8118n = r7
            r7 = r4
            r4 = r3
            r3 = r6
            r6 = r7
            r7 = r5
            r5 = r2
            r2 = r1
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            int r0 = r6.f8118n
            switch(r0) {
                case 0: goto L36;
                case 1: goto L17;
                default: goto L5;
            }
        L5:
            i0.h0 r7 = (i0.h0) r7
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r0 = r6.f4537g
            s0.d r0 = (s0.d) r0
            r0.f(r7, r8)
            sf.n r7 = sf.n.f12433a
            return r7
        L17:
            u2.q r7 = (u2.q) r7
            long r2 = r7.f13362a
            wf.c r8 = (wf.c) r8
            java.lang.Object r7 = r6.f4537g
            r1 = r7
            m.h2 r1 = (m.h2) r1
            r1.d r7 = r1.R
            qg.t r7 = r7.e()
            m.f2 r0 = new m.f2
            r5 = 1
            r4 = 0
            r0.<init>(r1, r2, r4, r5)
            r8 = 3
            qg.v.q(r7, r4, r0, r8)
            sf.n r7 = sf.n.f12433a
            return r7
        L36:
            u2.q r7 = (u2.q) r7
            long r2 = r7.f13362a
            wf.c r8 = (wf.c) r8
            java.lang.Object r7 = r6.f4537g
            r1 = r7
            m.h2 r1 = (m.h2) r1
            r1.d r7 = r1.R
            qg.t r7 = r7.e()
            m.f2 r0 = new m.f2
            r5 = 2
            r4 = 0
            r0.<init>(r1, r2, r4, r5)
            r8 = 3
            qg.v.q(r7, r4, r0, r8)
            sf.n r7 = sf.n.f12433a
            return r7
    }
}
