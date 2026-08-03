package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v4.d0 f10101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10102h;

    public b(v4.d0 r1, int r2) {
            r0 = this;
            r0.<init>()
            if (r2 < 0) goto La
            r0.f10102h = r2
            r0.f10101g = r1
            return
        La:
            java.lang.String r1 = "handler < 0"
            j8.o.t(r1)
            r1 = 0
            throw r1
    }

    public final int a(p4.b r3) {
            r2 = this;
            int r0 = r3.f10102h
            int r1 = r2.f10102h
            if (r1 >= r0) goto L8
            r3 = -1
            return r3
        L8:
            if (r1 <= r0) goto Lc
            r3 = 1
            return r3
        Lc:
            v4.d0 r0 = r2.f10101g
            v4.d0 r3 = r3.f10101g
            int r3 = r0.d(r3)
            return r3
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            p4.b r1 = (p4.b) r1
            int r1 = r0.a(r1)
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p4.b
            r1 = 0
            if (r0 == 0) goto Lf
            p4.b r3 = (p4.b) r3
            int r3 = r2.a(r3)
            if (r3 != 0) goto Lf
            r3 = 1
            return r3
        Lf:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f10102h
            int r0 = r0 * 31
            v4.d0 r1 = r2.f10101g
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
