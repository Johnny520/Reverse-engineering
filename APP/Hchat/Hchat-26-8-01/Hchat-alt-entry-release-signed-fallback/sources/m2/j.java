package m2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8695a;

    public /* synthetic */ j(int r1) {
            r0 = this;
            r0.<init>()
            r0.f8695a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof m2.j
            if (r0 != 0) goto L5
            goto Ld
        L5:
            m2.j r2 = (m2.j) r2
            int r2 = r2.f8695a
            int r0 = r1.f8695a
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
            int r0 = r1.f8695a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            int r0 = r2.f8695a
            if (r0 != 0) goto L7
            java.lang.String r0 = "None"
            return r0
        L7:
            r1 = 1
            if (r0 != r1) goto Ld
            java.lang.String r0 = "Weight"
            return r0
        Ld:
            r1 = 2
            if (r0 != r1) goto L13
            java.lang.String r0 = "Style"
            return r0
        L13:
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r1) goto L1b
            java.lang.String r0 = "All"
            return r0
        L1b:
            java.lang.String r0 = "Invalid"
            return r0
    }
}
