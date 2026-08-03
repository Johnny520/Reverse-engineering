package b6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements w5.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b6.h f499g = null;

    static {
            b6.h r0 = new b6.h
            r0.<init>()
            b6.h.f499g = r0
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            w5.a r2 = (w5.a) r2
            r0 = 30
            int r2 = r2.h()
            int r2 = java.lang.Integer.compare(r0, r2)
            return r2
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof b6.h
            return r1
    }

    @Override // w5.a
    public final int h() {
            r1 = this;
            r0 = 30
            return r0
    }

    public final int hashCode() {
            r1 = this;
            r0 = 0
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
