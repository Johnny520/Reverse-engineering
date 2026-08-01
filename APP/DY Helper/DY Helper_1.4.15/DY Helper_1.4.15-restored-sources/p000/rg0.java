package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class rg0 {

    /* JADX INFO: renamed from: α */
    public final int f9370;

    public /* synthetic */ rg0(int r1) {
            r0 = this;
            r0.<init>()
            r0.f9370 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m5086(int r1) {
            r0 = 1
            if (r1 != r0) goto L6
            java.lang.String r1 = "Hyphens.None"
            return r1
        L6:
            r0 = 2
            if (r1 != r0) goto Lc
            java.lang.String r1 = "Hyphens.Auto"
            return r1
        Lc:
            if (r1 != 0) goto L11
            java.lang.String r1 = "Hyphens.Unspecified"
            return r1
        L11:
            java.lang.String r1 = "Invalid"
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.rg0
            if (r0 != 0) goto L5
            goto Ld
        L5:
            rg0 r2 = (p000.rg0) r2
            int r2 = r2.f9370
            int r1 = r1.f9370
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
            int r0 = r0.f9370
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            int r0 = r0.f9370
            java.lang.String r0 = m5086(r0)
            return r0
    }
}
