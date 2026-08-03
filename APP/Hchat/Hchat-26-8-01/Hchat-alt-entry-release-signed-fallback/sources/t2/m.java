package t2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13019a;

    public /* synthetic */ m(int r1) {
            r0 = this;
            r0.<init>()
            r0.f13019a = r1
            return
    }

    public static java.lang.String a(int r1) {
            r0 = 1
            if (r1 != r0) goto L6
            java.lang.String r1 = "Ltr"
            return r1
        L6:
            r0 = 2
            if (r1 != r0) goto Lc
            java.lang.String r1 = "Rtl"
            return r1
        Lc:
            r0 = 3
            if (r1 != r0) goto L12
            java.lang.String r1 = "Content"
            return r1
        L12:
            r0 = 4
            if (r1 != r0) goto L18
            java.lang.String r1 = "ContentOrLtr"
            return r1
        L18:
            r0 = 5
            if (r1 != r0) goto L1e
            java.lang.String r1 = "ContentOrRtl"
            return r1
        L1e:
            if (r1 != 0) goto L23
            java.lang.String r1 = "Unspecified"
            return r1
        L23:
            java.lang.String r1 = "Invalid"
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof t2.m
            if (r0 != 0) goto L5
            goto Ld
        L5:
            t2.m r2 = (t2.m) r2
            int r2 = r2.f13019a
            int r0 = r1.f13019a
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
            int r0 = r1.f13019a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            int r0 = r1.f13019a
            java.lang.String r0 = a(r0)
            return r0
    }
}
