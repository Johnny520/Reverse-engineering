package o7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class c extends o7.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f9565m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r7.g f9566n;

    public c(k7.f r2, r7.g r3) {
            r1 = this;
            r0 = 0
            r1.f9565m = r0
            r1.<init>(r2)
            r1.f9566n = r3
            return
    }

    public c(r7.f r2) {
            r1 = this;
            r0 = 1
            r1.f9565m = r0
            okio.a r0 = r7.k.f11566o
            r1.<init>(r0)
            r1.f9566n = r2
            return
    }

    private final void j0() {
            r0 = this;
            return
    }

    @Override // k7.a
    public void B(q7.b r4) {
            r3 = this;
            int r0 = r3.f9565m
            switch(r0) {
                case 0: goto L1e;
                default: goto L5;
            }
        L5:
            r7.g r0 = r3.f9566n
            int r0 = r0.get()
            r3.c0(r0)
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1d
            k7.a r2 = r3.Q(r1)
            r7.k r2 = (r7.k) r2
            r2.G(r4)
            int r1 = r1 + 1
            goto Lf
        L1d:
            return
        L1e:
            r7.g r0 = r3.f9566n
            int r0 = r0.get()
            r3.c0(r0)
            r3.Y(r4)
            return
    }

    @Override // o7.b
    public boolean R() {
            r1 = this;
            int r0 = r1.f9565m
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r0 = super.R()
            return r0
        La:
            r0 = 1
            return r0
    }

    @Override // o7.b
    public void X() {
            r2 = this;
            int r0 = r2.f9565m
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.X()
            return
        L9:
            z7.c r0 = r2.f9563k
            int r0 = r0.size()
            r7.g r1 = r2.f9566n
            r1.k(r0)
            r2.U()
            return
    }

    @Override // o7.b
    public void Z() {
            r1 = this;
            int r0 = r1.f9565m
            switch(r0) {
                case 1: goto L8;
                default: goto L5;
            }
        L5:
            super.Z()
        L8:
            return
    }

    @Override // o7.b
    public void c0(int r2) {
            r1 = this;
            int r0 = r1.f9565m
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.c0(r2)
            return
        L9:
            r0 = 0
            r1.d0(r2, r0)
            r7.g r0 = r1.f9566n
            r0.k(r2)
            return
    }
}
