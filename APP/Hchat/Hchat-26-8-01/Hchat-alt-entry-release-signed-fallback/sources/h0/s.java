package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f4982e;

    public /* synthetic */ s() {
            r1 = this;
            r0 = 2
            r1.f4978a = r0
            r1.<init>()
            return
    }

    public s(int r2, int r3, int r4, i2.k0 r5) {
            r1 = this;
            r0 = 0
            r1.f4978a = r0
            r1.<init>()
            r1.f4979b = r2
            r1.f4980c = r3
            r1.f4981d = r4
            r1.f4982e = r5
            return
    }

    public s(m0.l0 r2) {
            r1 = this;
            r0 = 1
            r1.f4978a = r0
            r1.<init>()
            r1.f4982e = r2
            return
    }

    public h0.u a(int r5) {
            r4 = this;
            h0.u r0 = new h0.u
            java.lang.Object r1 = r4.f4982e
            i2.k0 r1 = (i2.k0) r1
            t2.j r1 = a7.a.y(r1, r5)
            r2 = 1
            r0.<init>(r1, r5, r2)
            return r0
    }

    public int b() {
            r2 = this;
            int r0 = r2.f4981d
            int r1 = r2.f4980c
            int r0 = r0 - r1
            return r0
    }

    public int c(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f4982e
            m0.l0 r0 = (m0.l0) r0
            int[] r0 = r0.f8474e
            int r1 = r2.f4980c
            int r1 = r1 + r3
            r3 = r0[r1]
            return r3
    }

    public java.lang.Object d(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f4982e
            m0.l0 r0 = (m0.l0) r0
            java.lang.Object[] r0 = r0.f8476g
            int r1 = r2.f4981d
            int r1 = r1 + r3
            r3 = r0[r1]
            return r3
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.f4978a
            switch(r0) {
                case 0: goto Ld;
                case 1: goto L5;
                case 2: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.String r0 = ""
            return r0
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SelectionInfo(id=1, range=("
            r0.<init>(r1)
            int r1 = r4.f4979b
            r0.append(r1)
            r2 = 45
            r0.append(r2)
            java.lang.Object r3 = r4.f4982e
            i2.k0 r3 = (i2.k0) r3
            t2.j r1 = a7.a.y(r3, r1)
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            int r1 = r4.f4980c
            r0.append(r1)
            r0.append(r2)
            t2.j r1 = a7.a.y(r3, r1)
            r0.append(r1)
            java.lang.String r1 = "), prevOffset="
            r0.append(r1)
            int r1 = r4.f4981d
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
