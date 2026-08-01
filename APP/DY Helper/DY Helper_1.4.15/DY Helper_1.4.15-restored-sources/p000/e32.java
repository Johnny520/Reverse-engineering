package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class e32 {

    /* JADX INFO: renamed from: α */
    public final int f3402;

    public /* synthetic */ e32(int r1) {
            r0 = this;
            r0.<init>()
            r0.f3402 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m1840(int r1) {
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
            boolean r0 = r2 instanceof p000.e32
            if (r0 != 0) goto L5
            goto Ld
        L5:
            e32 r2 = (p000.e32) r2
            int r2 = r2.f3402
            int r1 = r1.f3402
            if (r1 == r2) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.f3402
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            int r0 = r0.f3402
            java.lang.String r0 = m1840(r0)
            return r0
    }
}
