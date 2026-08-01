package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ur0 {

    /* JADX INFO: renamed from: α */
    public final int f10934;

    public /* synthetic */ ur0(int r1) {
            r0 = this;
            r0.<init>()
            r0.f10934 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.ur0
            if (r0 != 0) goto L5
            goto Ld
        L5:
            ur0 r2 = (p000.ur0) r2
            int r2 = r2.f10934
            int r1 = r1.f10934
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
            int r0 = r0.f10934
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            int r1 = r1.f10934
            if (r1 != 0) goto L7
            java.lang.String r1 = "LineHeightStyle.Mode.Fixed"
            return r1
        L7:
            r0 = 1
            if (r1 != r0) goto Ld
            java.lang.String r1 = "LineHeightStyle.Mode.Minimum"
            return r1
        Ld:
            r0 = 2
            if (r1 != r0) goto L13
            java.lang.String r1 = "LineHeightStyle.Mode.Tight"
            return r1
        L13:
            java.lang.String r1 = "Invalid"
            return r1
    }
}
