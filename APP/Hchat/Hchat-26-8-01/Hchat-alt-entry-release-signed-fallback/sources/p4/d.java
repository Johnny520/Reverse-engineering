package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p4.c f10107i;

    public d(int r2, int r3, p4.c r4) {
            r1 = this;
            r1.<init>()
            if (r2 < 0) goto L20
            if (r3 <= r2) goto L19
            boolean r0 = r4.f22555g
            if (r0 != 0) goto L12
            r1.f10105g = r2
            r1.f10106h = r3
            r1.f10107i = r4
            return
        L12:
            java.lang.String r2 = "handlers.isMutable()"
            j8.o.t(r2)
            r2 = 0
            throw r2
        L19:
            java.lang.String r2 = "end <= start"
            j8.o.t(r2)
            r2 = 0
            throw r2
        L20:
            java.lang.String r2 = "start < 0"
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public final int a(p4.d r3) {
            r2 = this;
            int r0 = r3.f10105g
            int r1 = r2.f10105g
            if (r1 >= r0) goto L7
            goto L10
        L7:
            if (r1 <= r0) goto La
            goto L14
        La:
            int r0 = r3.f10106h
            int r1 = r2.f10106h
            if (r1 >= r0) goto L12
        L10:
            r3 = -1
            return r3
        L12:
            if (r1 <= r0) goto L16
        L14:
            r3 = 1
            return r3
        L16:
            p4.c r0 = r2.f10107i
            p4.c r3 = r3.f10107i
            int r3 = r0.o(r3)
            return r3
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            p4.d r1 = (p4.d) r1
            int r1 = r0.a(r1)
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p4.d
            r1 = 0
            if (r0 == 0) goto Lf
            p4.d r3 = (p4.d) r3
            int r3 = r2.a(r3)
            if (r3 != 0) goto Lf
            r3 = 1
            return r3
        Lf:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f10105g
            int r0 = r0 * 31
            int r1 = r2.f10106h
            int r0 = r0 + r1
            int r0 = r0 * 31
            p4.c r1 = r2.f10107i
            java.lang.Object[] r1 = r1.f22543h
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
