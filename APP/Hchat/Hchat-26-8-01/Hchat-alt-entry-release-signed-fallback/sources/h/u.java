package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f4759h;

    public /* synthetic */ u(int r1, java.util.ArrayList r2) {
            r0 = this;
            r0.f4758g = r1
            r0.f4759h = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f4758g
            switch(r0) {
                case 0: goto L5a;
                case 1: goto L3f;
                case 2: goto L24;
                default: goto L5;
            }
        L5:
            v1.a1 r6 = (v1.a1) r6
            java.util.ArrayList r0 = r5.f4759h
            int r1 = r0.size()
            int r1 = r1 + (-1)
            if (r1 < 0) goto L21
            r2 = 0
            r3 = r2
        L13:
            java.lang.Object r4 = r0.get(r3)
            v1.b1 r4 = (v1.b1) r4
            v1.a1.E(r6, r4, r2, r2)
            if (r3 == r1) goto L21
            int r3 = r3 + 1
            goto L13
        L21:
            sf.n r6 = sf.n.f12433a
            return r6
        L24:
            v1.a1 r6 = (v1.a1) r6
            java.util.ArrayList r0 = r5.f4759h
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L2e:
            if (r3 >= r1) goto L3c
            java.lang.Object r4 = r0.get(r3)
            v1.b1 r4 = (v1.b1) r4
            v1.a1.E(r6, r4, r2, r2)
            int r3 = r3 + 1
            goto L2e
        L3c:
            sf.n r6 = sf.n.f12433a
            return r6
        L3f:
            v1.a1 r6 = (v1.a1) r6
            java.util.ArrayList r0 = r5.f4759h
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L49:
            if (r3 >= r1) goto L57
            java.lang.Object r4 = r0.get(r3)
            v1.b1 r4 = (v1.b1) r4
            v1.a1.F(r6, r4, r2, r2)
            int r3 = r3 + 1
            goto L49
        L57:
            sf.n r6 = sf.n.f12433a
            return r6
        L5a:
            v1.a1 r6 = (v1.a1) r6
            java.util.ArrayList r0 = r5.f4759h
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L64:
            if (r3 >= r1) goto L72
            java.lang.Object r4 = r0.get(r3)
            v1.b1 r4 = (v1.b1) r4
            v1.a1.B(r6, r4, r2, r2)
            int r3 = r3 + 1
            goto L64
        L72:
            sf.n r6 = sf.n.f12433a
            return r6
    }
}
