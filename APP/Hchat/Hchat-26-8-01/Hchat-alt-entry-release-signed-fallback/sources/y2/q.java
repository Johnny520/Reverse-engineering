package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends gg.m implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y2.q f22247h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y2.q f22248i = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22249g;

    static {
            y2.q r0 = new y2.q
            r1 = 2
            r2 = 0
            r0.<init>(r1, r2)
            y2.q.f22247h = r0
            y2.q r0 = new y2.q
            r2 = 1
            r0.<init>(r1, r2)
            y2.q.f22248i = r0
            return
    }

    public /* synthetic */ q(int r1, int r2) {
            r0 = this;
            r0.f22249g = r2
            r0.<init>(r1)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f22249g
            switch(r0) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            i0.h0 r4 = (i0.h0) r4
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r0 = r5 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L15
            r0 = r2
            goto L16
        L15:
            r0 = 0
        L16:
            r5 = r5 & r2
            boolean r5 = r4.S(r5, r0)
            if (r5 == 0) goto L1e
            goto L21
        L1e:
            r4.V()
        L21:
            sf.n r4 = sf.n.f12433a
            return r4
        L24:
            i0.h0 r4 = (i0.h0) r4
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r0 = r5 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L34
            r0 = r2
            goto L35
        L34:
            r0 = 0
        L35:
            r5 = r5 & r2
            boolean r5 = r4.S(r5, r0)
            if (r5 == 0) goto L3d
            goto L40
        L3d:
            r4.V()
        L40:
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
