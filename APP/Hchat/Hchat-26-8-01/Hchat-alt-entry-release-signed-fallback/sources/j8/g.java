package j8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f6784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6786c;

    public g(java.util.List r1, boolean r2, boolean r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f6784a = r1
            r0.f6785b = r2
            r0.f6786c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof j8.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            j8.g r5 = (j8.g) r5
            java.util.List r1 = r4.f6784a
            java.util.List r3 = r5.f6784a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            boolean r1 = r4.f6785b
            boolean r3 = r5.f6785b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            boolean r1 = r4.f6786c
            boolean r5 = r5.f6786c
            if (r1 == r5) goto L25
            return r2
        L25:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.util.List r0 = r3.f6784a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f6785b
            int r0 = eh.a.h(r0, r1, r2)
            boolean r1 = r3.f6786c
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FavoritePage(items="
            r0.<init>(r1)
            java.util.List r1 = r3.f6784a
            r0.append(r1)
            java.lang.String r1 = ", hasMore="
            r0.append(r1)
            boolean r1 = r3.f6785b
            r0.append(r1)
            java.lang.String r1 = ", changed="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r3.f6786c
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}
