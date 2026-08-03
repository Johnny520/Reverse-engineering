package n2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8959a;

    public /* synthetic */ k(int r1) {
            r0 = this;
            r0.<init>()
            r0.f8959a = r1
            return
    }

    public static java.lang.String a(int r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "Unspecified"
            return r1
        L5:
            r0 = 1
            if (r1 != r0) goto Lb
            java.lang.String r1 = "Text"
            return r1
        Lb:
            r0 = 2
            if (r1 != r0) goto L11
            java.lang.String r1 = "Ascii"
            return r1
        L11:
            r0 = 3
            if (r1 != r0) goto L17
            java.lang.String r1 = "Number"
            return r1
        L17:
            r0 = 4
            if (r1 != r0) goto L1d
            java.lang.String r1 = "Phone"
            return r1
        L1d:
            r0 = 5
            if (r1 != r0) goto L23
            java.lang.String r1 = "Uri"
            return r1
        L23:
            r0 = 6
            if (r1 != r0) goto L29
            java.lang.String r1 = "Email"
            return r1
        L29:
            r0 = 7
            if (r1 != r0) goto L2f
            java.lang.String r1 = "Password"
            return r1
        L2f:
            r0 = 8
            if (r1 != r0) goto L36
            java.lang.String r1 = "NumberPassword"
            return r1
        L36:
            r0 = 9
            if (r1 != r0) goto L3d
            java.lang.String r1 = "Decimal"
            return r1
        L3d:
            java.lang.String r1 = "Invalid"
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof n2.k
            if (r0 != 0) goto L5
            goto Ld
        L5:
            n2.k r2 = (n2.k) r2
            int r2 = r2.f8959a
            int r0 = r1.f8959a
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
            int r0 = r1.f8959a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            int r0 = r1.f8959a
            java.lang.String r0 = a(r0)
            return r0
    }
}
