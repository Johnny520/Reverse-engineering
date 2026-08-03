package n2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8951a;

    public /* synthetic */ i(int r1) {
            r0 = this;
            r0.<init>()
            r0.f8951a = r1
            return
    }

    public static java.lang.String a(int r1) {
            r0 = -1
            if (r1 != r0) goto L6
            java.lang.String r1 = "Unspecified"
            return r1
        L6:
            if (r1 != 0) goto Lb
            java.lang.String r1 = "None"
            return r1
        Lb:
            r0 = 1
            if (r1 != r0) goto L11
            java.lang.String r1 = "Default"
            return r1
        L11:
            r0 = 2
            if (r1 != r0) goto L17
            java.lang.String r1 = "Go"
            return r1
        L17:
            r0 = 3
            if (r1 != r0) goto L1d
            java.lang.String r1 = "Search"
            return r1
        L1d:
            r0 = 4
            if (r1 != r0) goto L23
            java.lang.String r1 = "Send"
            return r1
        L23:
            r0 = 5
            if (r1 != r0) goto L29
            java.lang.String r1 = "Previous"
            return r1
        L29:
            r0 = 6
            if (r1 != r0) goto L2f
            java.lang.String r1 = "Next"
            return r1
        L2f:
            r0 = 7
            if (r1 != r0) goto L35
            java.lang.String r1 = "Done"
            return r1
        L35:
            java.lang.String r1 = "Invalid"
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof n2.i
            if (r0 != 0) goto L5
            goto Ld
        L5:
            n2.i r2 = (n2.i) r2
            int r2 = r2.f8951a
            int r0 = r1.f8951a
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
            int r0 = r1.f8951a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            int r0 = r1.f8951a
            java.lang.String r0 = a(r0)
            return r0
    }
}
