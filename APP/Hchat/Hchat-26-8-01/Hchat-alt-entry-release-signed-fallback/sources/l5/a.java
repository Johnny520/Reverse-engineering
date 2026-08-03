package l5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends k5.t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l5.b f7843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l5.b f7846j;

    public a(l5.b r1, int r2, int r3) {
            r0 = this;
            r0.f7844h = r3
            r0.f7846j = r1
            r0.f7845i = r2
            r0.f7843g = r1
            r0.<init>()
            return
    }

    @Override // k5.t
    public final java.lang.Object a(int r3) {
            r2 = this;
            int r0 = r2.f7844h
            switch(r0) {
                case 0: goto L41;
                case 1: goto L2d;
                case 2: goto L19;
                default: goto L5;
            }
        L5:
            l5.b r0 = r2.f7846j
            k5.u r0 = r0.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r3 = r3 * 8
            int r1 = r2.f7845i
            int r3 = r3 + r1
            long r0 = r0.K(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L19:
            l5.b r0 = r2.f7846j
            k5.u r0 = r0.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r3 = r3 * 4
            int r1 = r2.f7845i
            int r3 = r3 + r1
            int r3 = r0.J(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L2d:
            l5.b r0 = r2.f7846j
            k5.u r0 = r0.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r3 = r3 * 2
            int r1 = r2.f7845i
            int r3 = r3 + r1
            int r3 = r0.M(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L41:
            l5.b r0 = r2.f7846j
            k5.u r0 = r0.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7845i
            int r1 = r1 + r3
            java.lang.Object r3 = r0.f310h
            byte[] r3 = (byte[]) r3
            r3 = r3[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            l5.b r0 = r1.f7843g
            int r0 = r0.f7852e
            return r0
    }
}
