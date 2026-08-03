package bc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.g f755a;

    public m(ud.g r1) {
            r0 = this;
            r0.<init>()
            r0.f755a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 == r2) goto L15
            boolean r0 = r2 instanceof bc.m
            if (r0 == 0) goto L13
            bc.m r2 = (bc.m) r2
            ud.g r2 = r2.f755a
            ud.g r0 = r1.f755a
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
            ud.g r0 = r1.f755a
            od.c r0 = r0.f13707l
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            ud.g r0 = r1.f755a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
