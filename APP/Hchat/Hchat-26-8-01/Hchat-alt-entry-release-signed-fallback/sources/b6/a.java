package b6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements w5.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b6.a f490h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b6.a f491i = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f492g;

    static {
            b6.a r0 = new b6.a
            r1 = 1
            r0.<init>(r1)
            b6.a.f490h = r0
            b6.a r0 = new b6.a
            r1 = 0
            r0.<init>(r1)
            b6.a.f491i = r0
            return
    }

    public a(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f492g = r1
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r3) {
            r2 = this;
            w5.a r3 = (w5.a) r3
            r0 = 31
            int r1 = r3.h()
            int r0 = java.lang.Integer.compare(r0, r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            b6.a r3 = (b6.a) r3
            boolean r3 = r3.f492g
            boolean r0 = r2.f492g
            int r3 = java.lang.Boolean.compare(r0, r3)
            return r3
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof b6.a
            if (r0 == 0) goto Le
            b6.a r2 = (b6.a) r2
            boolean r2 = r2.f492g
            boolean r0 = r1.f492g
            if (r0 != r2) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // w5.a
    public final int h() {
            r1 = this;
            r0 = 31
            return r0
    }

    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.f492g
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            q5.a r1 = new q5.a     // Catch: java.io.IOException -> L12
            r1.<init>(r0)     // Catch: java.io.IOException -> L12
            r1.g(r2)     // Catch: java.io.IOException -> L12
            java.lang.String r0 = r0.toString()
            return r0
        L12:
            java.lang.String r0 = "Unexpected IOException"
            j8.o.f(r0)
            r0 = 0
            return r0
    }
}
