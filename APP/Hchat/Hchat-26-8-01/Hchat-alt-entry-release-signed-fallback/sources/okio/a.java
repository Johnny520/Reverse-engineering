package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements k7.f, i.v, i0.e2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9858g;

    public /* synthetic */ a(int r1) {
            r0 = this;
            r0.f9858g = r1
            r0.<init>()
            return
    }

    public static /* synthetic */ void c() {
            af.d r0 = new af.d
            r0.<init>()
            throw r0
    }

    public static /* synthetic */ void d(int r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ void e(int r0, java.lang.StringBuilder r1) {
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static /* synthetic */ void f(long r1, java.lang.String r3, java.lang.Object r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ void g(java.lang.Object r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.io.IOException r2 = new java.io.IOException
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ void h(java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ void i(java.lang.String r1) {
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void j(java.lang.String r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            java.io.IOException r2 = new java.io.IOException
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ void k() {
            af.d r0 = new af.d
            r0.<init>()
            throw r0
    }

    public static /* synthetic */ void l(java.lang.Object r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ void m(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = r1.toString()
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    public static /* synthetic */ void o(java.lang.Object r2, java.lang.String r3) {
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static /* synthetic */ void p(java.lang.Object r2, java.lang.String r3) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    @Override // i0.e2
    public boolean a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // i.v
    public float b(float r5) {
            r4 = this;
            double r0 = (double) r5
            r2 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r0 = r0 * r2
            r5 = 2
            double r2 = (double) r5
            double r0 = r0 / r2
            float r5 = (float) r0
            double r0 = (double) r5
            double r0 = java.lang.Math.sin(r0)
            float r5 = (float) r0
            return r5
    }

    @Override // k7.d
    public k7.a n() {
            r3 = this;
            int r0 = r3.f9858g
            switch(r0) {
                case 9: goto L28;
                case 10: goto L20;
                case 11: goto L18;
                case 12: goto L11;
                case 13: goto Lb;
                default: goto L5;
            }
        L5:
            v7.d r0 = new v7.d
            r0.<init>()
            return r0
        Lb:
            r7.u r0 = new r7.u
            r0.<init>()
            return r0
        L11:
            r7.n r0 = new r7.n
            r1 = 0
            r0.<init>(r1)
            return r0
        L18:
            r7.i r0 = new r7.i
            r1 = 2
            r2 = 0
            r0.<init>(r1, r2)
            return r0
        L20:
            r7.i r0 = new r7.i
            r1 = 4
            r2 = 1
            r0.<init>(r1, r2)
            return r0
        L28:
            r7.j r0 = new r7.j
            r1 = 4
            r0.<init>(r1)
            return r0
    }
}
