package d2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources.Theme f1968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1969b;

    public b(android.content.res.Resources.Theme r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f1968a = r1
            r0.f1969b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof d2.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            d2.b r5 = (d2.b) r5
            android.content.res.Resources$Theme r1 = r4.f1968a
            android.content.res.Resources$Theme r3 = r5.f1968a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.f1969b
            int r5 = r5.f1969b
            if (r1 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            android.content.res.Resources$Theme r0 = r2.f1968a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.f1969b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Key(theme="
            r0.<init>(r1)
            android.content.res.Resources$Theme r1 = r3.f1968a
            r0.append(r1)
            java.lang.String r1 = ", id="
            r0.append(r1)
            int r1 = r3.f1969b
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
