package l7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends r7.f {
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof l7.i
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l7.i r4 = (l7.i) r4
            int r1 = r3.f11560n
            int r4 = r4.f11560n
            if (r1 != r4) goto L13
            return r0
        L13:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f11560n
            return r0
    }

    @Override // r7.f
    public final java.lang.String toString() {
            r4 = this;
            java.lang.Class<l7.f> r0 = l7.f.class
            k7.a r1 = r4.v(r0)
            l7.f r1 = (l7.f) r1
            r2 = 0
            if (r1 == 0) goto L12
            int r3 = r4.f11560n
            t7.b r1 = r1.W(r3)
            goto L13
        L12:
            r1 = r2
        L13:
            if (r1 == 0) goto L20
            k7.a r0 = r4.v(r0)
            l7.f r0 = (l7.f) r0
            java.lang.String r0 = r1.a(r0, r2)
            return r0
        L20:
            int r0 = r4.f11560n
            r1 = 8
            java.lang.String r0 = y7.a.k(r0, r1)
            return r0
    }
}
