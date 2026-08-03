package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f4233i;

    public s(int r2) {
            r1 = this;
            r0 = 0
            r1.f4231g = r0
            r1.<init>()
            r1.f4232h = r2
            return
    }

    public s(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 1
            r1.f4231g = r0
            r1.<init>()
            r1.f4232h = r2
            r1.f4233i = r3
            return
    }

    public void a(g3.b0 r1) {
            r0 = this;
            return
    }

    public void b() {
            r0 = this;
            return
    }

    public abstract g3.r0 d(g3.r0 r1, java.util.List r2);

    public abstract b.e e(g3.b0 r1, b.e r2);

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f4231g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r2 = super.equals(r2)
            return r2
        La:
            if (r2 != r1) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.f4231g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            int r0 = super.hashCode()
            return r0
        La:
            java.lang.Object r0 = r1.f4233i
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f4231g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.Object r0 = r1.f4233i
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }
}
