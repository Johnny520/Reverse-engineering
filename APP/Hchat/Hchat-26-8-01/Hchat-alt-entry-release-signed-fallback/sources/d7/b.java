package d7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class b extends o7.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2035m;

    public /* synthetic */ b(k7.f r1, int r2) {
            r0 = this;
            r0.f2035m = r2
            r0.<init>(r1)
            return
    }

    @Override // k7.a
    public void B(q7.b r2) {
            r1 = this;
            int r0 = r1.f2035m
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            boolean r0 = r2.b()
            if (r0 == 0) goto L18
            d7.k r0 = new d7.k
            r0.<init>()
            r0.G(r2)
            r1.M(r0)
            goto L6
        L18:
            return
    }

    @Override // o7.b
    public void W(k7.a r2) {
            r1 = this;
            int r0 = r1.f2035m
            switch(r0) {
                case 1: goto Lc;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            m7.q r2 = (m7.q) r2
            r2.N()
            return
        Lc:
            m7.b r2 = (m7.b) r2
            r1.j0(r2)
            return
    }

    public void j0(m7.b r1) {
            r0 = this;
            r1.Z()
            return
    }
}
