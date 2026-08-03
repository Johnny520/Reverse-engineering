package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jj implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17059h;

    public /* synthetic */ jj(int r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f17058g = r2
            r0.f17059h = r3
            r0.<init>()
            return
    }

    public /* synthetic */ jj(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f17058g = r2
            r0.f17059h = r1
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.f17058g
            switch(r0) {
                case 0: goto L5c;
                case 1: goto L48;
                case 2: goto L34;
                case 3: goto L1a;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f17059h
            i0.f1 r0 = (i0.f1) r0
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            java.lang.Float r6 = (java.lang.Float) r6
            r6.floatValue()
            r0.h(r5)
        L17:
            sf.n r5 = sf.n.f12433a
            return r5
        L1a:
            java.lang.Object r0 = r4.f17059h
            xb.o r0 = (xb.o) r0
            s1.t r5 = (s1.t) r5
            e1.b r6 = (e1.b) r6
            r5.getClass()
            qg.t r6 = r0.f21523a
            ci.j r1 = new ci.j
            r2 = 25
            r3 = 0
            r1.<init>(r0, r5, r3, r2)
            r5 = 3
            qg.v.q(r6, r3, r1, r5)
            goto L17
        L34:
            java.lang.Object r0 = r4.f17059h
            wb.s0 r0 = (wb.s0) r0
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.getClass()
            r6 = 1
            int r6 = i0.r.C(r6)
            wb.ho.W(r0, r5, r6)
            goto L17
        L48:
            java.lang.Object r0 = r4.f17059h
            x8.y r0 = (x8.y) r0
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.getClass()
            r6 = 1
            int r6 = i0.r.C(r6)
            wb.ho.p4(r0, r5, r6)
            goto L17
        L5c:
            java.lang.Object r0 = r4.f17059h
            java.lang.String r0 = (java.lang.String) r0
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.getClass()
            r6 = 1
            int r6 = i0.r.C(r6)
            wb.ho.o4(r0, r5, r6)
            goto L17
    }
}
