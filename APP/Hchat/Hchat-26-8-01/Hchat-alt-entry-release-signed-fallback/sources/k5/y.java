package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends k5.t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7301j;

    public /* synthetic */ y(java.lang.Object r1, int r2, int r3, int r4) {
            r0 = this;
            r0.f7298g = r4
            r0.f7301j = r1
            r0.f7299h = r2
            r0.f7300i = r3
            r0.<init>()
            return
    }

    @Override // k5.t
    public final java.lang.Object a(int r4) {
            r3 = this;
            int r0 = r3.f7298g
            switch(r0) {
                case 0: goto L4b;
                case 1: goto L33;
                case 2: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f7301j
            k5.u r0 = (k5.u) r0
            androidx.lifecycle.x r1 = r0.f7264b
            int r2 = r3.f7299h
            int r2 = r2 + 4
            int r4 = r4 * 4
            int r4 = r4 + r2
            int r4 = r1.N(r4)
            java.util.Set r4 = o5.e.a(r0, r4)
            return r4
        L1b:
            java.lang.Object r0 = r3.f7301j
            n5.e r0 = (n5.e) r0
            k5.u r0 = r0.f9021j
            k5.s r1 = r0.f7281s
            androidx.lifecycle.x r0 = r0.f7264b
            int r4 = r4 * 2
            int r2 = r3.f7299h
            int r4 = r4 + r2
            int r4 = r0.P(r4)
            java.lang.String r4 = r1.b(r4)
            return r4
        L33:
            java.lang.Object r0 = r3.f7301j
            n5.d r0 = (n5.d) r0
            k5.u r0 = r0.f9019j
            k5.s r1 = r0.f7281s
            androidx.lifecycle.x r0 = r0.f7264b
            int r4 = r4 * 2
            int r2 = r3.f7299h
            int r4 = r4 + r2
            int r4 = r0.P(r4)
            java.lang.String r4 = r1.b(r4)
            return r4
        L4b:
            java.lang.Object r0 = r3.f7301j
            k5.z r0 = (k5.z) r0
            k5.u r0 = r0.f7302j
            k5.s r1 = r0.f7281s
            androidx.lifecycle.x r0 = r0.f7264b
            int r4 = r4 * 2
            int r2 = r3.f7299h
            int r4 = r4 + r2
            int r4 = r0.P(r4)
            java.lang.String r4 = r1.b(r4)
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.f7298g
            switch(r0) {
                case 0: goto Le;
                case 1: goto Lb;
                case 2: goto L8;
                default: goto L5;
            }
        L5:
            int r0 = r1.f7300i
            return r0
        L8:
            int r0 = r1.f7300i
            return r0
        Lb:
            int r0 = r1.f7300i
            return r0
        Le:
            int r0 = r1.f7300i
            return r0
    }
}
