package d1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1920a;

    public /* synthetic */ f(int r1) {
            r0 = this;
            r0.<init>()
            r0.f1920a = r1
            return
    }

    public static java.lang.String a(int r1) {
            r0 = 1
            if (r1 != r0) goto L6
            java.lang.String r1 = "Next"
            return r1
        L6:
            r0 = 2
            if (r1 != r0) goto Lc
            java.lang.String r1 = "Previous"
            return r1
        Lc:
            r0 = 3
            if (r1 != r0) goto L12
            java.lang.String r1 = "Left"
            return r1
        L12:
            r0 = 4
            if (r1 != r0) goto L18
            java.lang.String r1 = "Right"
            return r1
        L18:
            r0 = 5
            if (r1 != r0) goto L1e
            java.lang.String r1 = "Up"
            return r1
        L1e:
            r0 = 6
            if (r1 != r0) goto L24
            java.lang.String r1 = "Down"
            return r1
        L24:
            r0 = 7
            if (r1 != r0) goto L2a
            java.lang.String r1 = "Enter"
            return r1
        L2a:
            r0 = 8
            if (r1 != r0) goto L31
            java.lang.String r1 = "Exit"
            return r1
        L31:
            java.lang.String r1 = "Invalid FocusDirection"
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof d1.f
            if (r0 != 0) goto L5
            goto Ld
        L5:
            d1.f r2 = (d1.f) r2
            int r2 = r2.f1920a
            int r0 = r1.f1920a
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
            int r0 = r1.f1920a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            int r0 = r1.f1920a
            java.lang.String r0 = a(r0)
            return r0
    }
}
