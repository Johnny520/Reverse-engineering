package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f4959h;

    public /* synthetic */ o0(int r1, java.util.ArrayList r2) {
            r0 = this;
            r0.f4958g = r1
            r0.f4959h = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f4958g
            switch(r0) {
                case 0: goto L54;
                case 1: goto L31;
                case 2: goto L16;
                default: goto L5;
            }
        L5:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.ArrayList r0 = r5.f4959h
            java.lang.Object r6 = r0.get(r6)
            eb.c0 r6 = (eb.c0) r6
            java.lang.String r6 = r6.f2506a
            return r6
        L16:
            v1.a1 r6 = (v1.a1) r6
            java.util.ArrayList r0 = r5.f4959h
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L20:
            if (r3 >= r1) goto L2e
            java.lang.Object r4 = r0.get(r3)
            v1.b1 r4 = (v1.b1) r4
            v1.a1.E(r6, r4, r2, r2)
            int r3 = r3 + 1
            goto L20
        L2e:
            sf.n r6 = sf.n.f12433a
            return r6
        L31:
            v1.a1 r6 = (v1.a1) r6
            r6.getClass()
            java.util.ArrayList r0 = r5.f4959h
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L3e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r0.next()
            v1.b1 r3 = (v1.b1) r3
            v1.a1.E(r6, r3, r1, r2)
            int r3 = r3.f13901h
            int r2 = r2 + r3
            goto L3e
        L51:
            sf.n r6 = sf.n.f12433a
            return r6
        L54:
            v1.a1 r6 = (v1.a1) r6
            java.util.ArrayList r0 = r5.f4959h
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L5e:
            if (r3 >= r1) goto L6c
            java.lang.Object r4 = r0.get(r3)
            v1.b1 r4 = (v1.b1) r4
            v1.a1.B(r6, r4, r2, r2)
            int r3 = r3 + 1
            goto L5e
        L6c:
            sf.n r6 = sf.n.f12433a
            return r6
    }
}
