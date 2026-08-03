package j7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends k7.b implements q7.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f6770m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r7.f f6771n;

    public a(r7.f r1, int r2) {
            r0 = this;
            r0.f6770m = r2
            switch(r2) {
                case 1: goto Lb;
                default: goto L5;
            }
        L5:
            r0.<init>()
            r0.f6771n = r1
            return
        Lb:
            r0.<init>()
            r0.f6771n = r1
            r1.f7391j = r0
            return
    }

    @Override // k7.b, k7.a
    public void B(q7.b r2) {
            r1 = this;
            int r0 = r1.f6770m
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.B(r2)
            return
        L9:
            r7.f r0 = r1.f6771n
            int r0 = r0.f11560n
            r1.c0(r0)
            r1.Y(r2)
            return
    }

    @Override // o7.b
    public final void X() {
            r2 = this;
            int r0 = r2.f6770m
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            z7.c r0 = r2.f9563k
            int r0 = r0.size()
            r7.f r1 = r2.f6771n
            r1.k(r0)
            return
        L11:
            z7.c r0 = r2.f9563k
            int r0 = r0.size()
            r7.f r1 = r2.f6771n
            r1.k(r0)
            return
    }

    @Override // q7.a
    public void m(k7.a r2) {
            r1 = this;
            r7.f r0 = r1.f6771n
            if (r2 != r0) goto L9
            int r2 = r0.f11560n
            r1.c0(r2)
        L9:
            return
    }

    @Override // k7.d
    public final k7.a n() {
            r3 = this;
            int r0 = r3.f6770m
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            v7.f0 r0 = new v7.f0
            r1 = 8
            r2 = 0
            r0.<init>(r1, r2)
            return r0
        Le:
            v7.g r0 = new v7.g
            r0.<init>()
            return r0
    }
}
