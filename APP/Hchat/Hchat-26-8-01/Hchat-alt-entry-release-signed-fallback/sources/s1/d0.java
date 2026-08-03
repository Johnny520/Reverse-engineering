package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12224a;

    public /* synthetic */ d0(int r1) {
            r0 = this;
            r0.<init>()
            r0.f12224a = r1
            return
    }

    public static java.lang.String a(int r1) {
            r0 = 1
            if (r1 == r0) goto L18
            r0 = 2
            if (r1 == r0) goto L15
            r0 = 3
            if (r1 == r0) goto L12
            r0 = 4
            if (r1 == r0) goto Lf
            java.lang.String r1 = "Unknown"
            return r1
        Lf:
            java.lang.String r1 = "Eraser"
            return r1
        L12:
            java.lang.String r1 = "Stylus"
            return r1
        L15:
            java.lang.String r1 = "Mouse"
            return r1
        L18:
            java.lang.String r1 = "Touch"
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof s1.d0
            if (r0 != 0) goto L5
            goto Ld
        L5:
            s1.d0 r2 = (s1.d0) r2
            int r2 = r2.f12224a
            int r0 = r1.f12224a
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
            int r0 = r1.f12224a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            int r0 = r1.f12224a
            java.lang.String r0 = a(r0)
            return r0
    }
}
