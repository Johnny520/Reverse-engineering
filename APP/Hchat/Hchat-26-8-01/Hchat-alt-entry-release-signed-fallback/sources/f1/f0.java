package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3054a;

    public /* synthetic */ f0(int r1) {
            r0 = this;
            r0.<init>()
            r0.f3054a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof f1.f0
            if (r0 != 0) goto L5
            goto Ld
        L5:
            f1.f0 r2 = (f1.f0) r2
            int r2 = r2.f3054a
            int r0 = r1.f3054a
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
            int r0 = r1.f3054a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            int r0 = r2.f3054a
            if (r0 != 0) goto L7
            java.lang.String r0 = "Argb8888"
            return r0
        L7:
            r1 = 1
            if (r0 != r1) goto Ld
            java.lang.String r0 = "Alpha8"
            return r0
        Ld:
            r1 = 2
            if (r0 != r1) goto L13
            java.lang.String r0 = "Rgb565"
            return r0
        L13:
            r1 = 3
            if (r0 != r1) goto L19
            java.lang.String r0 = "F16"
            return r0
        L19:
            r1 = 4
            if (r0 != r1) goto L1f
            java.lang.String r0 = "Gpu"
            return r0
        L1f:
            java.lang.String r0 = "Unknown"
            return r0
    }
}
