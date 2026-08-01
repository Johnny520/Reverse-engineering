package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vr0 {

    /* JADX INFO: renamed from: α */
    public final int f11371;

    public /* synthetic */ vr0(int r1) {
            r0 = this;
            r0.<init>()
            r0.f11371 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.vr0
            if (r0 != 0) goto L5
            goto Ld
        L5:
            vr0 r2 = (p000.vr0) r2
            int r2 = r2.f11371
            int r1 = r1.f11371
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
            int r0 = r0.f11371
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            r0 = 1
            int r1 = r1.f11371
            if (r1 != r0) goto L8
            java.lang.String r1 = "LineHeightStyle.Trim.FirstLineTop"
            return r1
        L8:
            r0 = 16
            if (r1 != r0) goto Lf
            java.lang.String r1 = "LineHeightStyle.Trim.LastLineBottom"
            return r1
        Lf:
            r0 = 17
            if (r1 != r0) goto L16
            java.lang.String r1 = "LineHeightStyle.Trim.Both"
            return r1
        L16:
            if (r1 != 0) goto L1b
            java.lang.String r1 = "LineHeightStyle.Trim.None"
            return r1
        L1b:
            java.lang.String r1 = "Invalid"
            return r1
    }
}
