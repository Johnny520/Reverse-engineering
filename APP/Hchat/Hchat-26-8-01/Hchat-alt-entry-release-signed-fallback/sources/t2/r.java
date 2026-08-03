package t2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13027a;

    public /* synthetic */ r(int r1) {
            r0 = this;
            r0.<init>()
            r0.f13027a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof t2.r
            if (r0 != 0) goto L5
            goto Ld
        L5:
            t2.r r2 = (t2.r) r2
            int r2 = r2.f13027a
            int r0 = r1.f13027a
            if (r0 == r2) goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f13027a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            r0 = 1
            int r1 = r2.f13027a
            if (r1 != r0) goto L8
            java.lang.String r0 = "Linearity.Linear"
            return r0
        L8:
            r0 = 2
            if (r1 != r0) goto Le
            java.lang.String r0 = "Linearity.FontHinting"
            return r0
        Le:
            r0 = 3
            if (r1 != r0) goto L14
            java.lang.String r0 = "Linearity.None"
            return r0
        L14:
            java.lang.String r0 = "Invalid"
            return r0
    }
}
