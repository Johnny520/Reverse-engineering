package a;

/* JADX INFO: loaded from: classes.dex */
public final class X4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f334a;

    public X4(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "descriptor"
            a.C0193i9.e(r2, r0)
            r1.<init>()
            java.lang.String r2 = a.C0171h5.a(r2)
            r1.f334a = r2
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof a.X4
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            a.X4 r2 = (a.X4) r2
            java.lang.String r2 = r2.f334a
            java.lang.String r0 = r1.f334a
            boolean r2 = a.C0193i9.a(r0, r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f334a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f334a
            java.lang.String r0 = a.C0171h5.b(r0)
            return r0
    }
}
