package bc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.r f756a;

    static {
            java.lang.Class<bc.n> r0 = bc.n.class
            mh.d.b(r0)
            return
    }

    public n(ud.r r1) {
            r0 = this;
            r0.<init>()
            r0.f756a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 == r2) goto L15
            boolean r0 = r2 instanceof bc.n
            if (r0 == 0) goto L13
            bc.n r2 = (bc.n) r2
            ud.r r2 = r2.f756a
            ud.r r0 = r1.f756a
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L13
            goto L15
        L13:
            r2 = 0
            return r2
        L15:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            ud.r r0 = r1.f756a
            od.d r0 = r0.f13717k
            int r0 = r0.f9783m
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            ud.r r0 = r1.f756a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
