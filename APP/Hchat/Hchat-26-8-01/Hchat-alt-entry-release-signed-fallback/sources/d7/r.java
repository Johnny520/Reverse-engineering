package d7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class r extends d7.q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2068n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r7.c f2069o;

    public r() {
            r3 = this;
            r0 = 1
            r3.f2068n = r0
            d7.o r0 = d7.o.f2060o
            r3.<init>(r0)
            r7.c r0 = new r7.c
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            r3.f2069o = r0
            r3.P(r0)
            return
    }

    public r(d7.o r3) {
            r2 = this;
            r0 = 0
            r2.f2068n = r0
            r2.<init>(r3)
            r7.c r3 = new r7.c
            r1 = 0
            r3.<init>(r0, r1)
            r2.f2069o = r3
            r2.P(r3)
            return
    }

    @Override // k7.c, k7.a
    public final void B(q7.b r3) {
            r2 = this;
            int r0 = r2.f2068n
            switch(r0) {
                case 0: goto L1d;
                default: goto L5;
            }
        L5:
            java.lang.Class<d7.p> r0 = d7.p.class
            k7.a r0 = r2.u(r0)
            d7.p r0 = (d7.p) r0
            long r0 = r0.Q()
            int r0 = (int) r0
            int r0 = r0 + (-4)
            r7.c r1 = r2.f2069o
            r1.Q(r0)
            super.B(r3)
            return
        L1d:
            java.lang.Class<d7.p> r0 = d7.p.class
            k7.a r0 = r2.u(r0)
            d7.p r0 = (d7.p) r0
            long r0 = r0.Q()
            int r0 = (int) r0
            int r0 = r0 + (-4)
            r7.c r1 = r2.f2069o
            r1.Q(r0)
            super.B(r3)
            return
    }

    @Override // d7.q
    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f2068n
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "padding = "
            r0.<init>(r1)
            r7.c r1 = r2.f2069o
            byte[] r1 = r1.f11553k
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
