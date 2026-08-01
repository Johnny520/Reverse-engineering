package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class c60 {

    /* JADX INFO: renamed from: α */
    public final int f1968;

    public /* synthetic */ c60(int r1) {
            r0 = this;
            r0.<init>()
            r0.f1968 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.c60
            if (r0 != 0) goto L5
            goto Ld
        L5:
            c60 r2 = (p000.c60) r2
            int r2 = r2.f1968
            int r1 = r1.f1968
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
            int r0 = r0.f1968
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            int r1 = r1.f1968
            if (r1 != 0) goto L7
            java.lang.String r1 = "None"
            return r1
        L7:
            r0 = 1
            if (r1 != r0) goto Ld
            java.lang.String r1 = "Weight"
            return r1
        Ld:
            r0 = 2
            if (r1 != r0) goto L13
            java.lang.String r1 = "Style"
            return r1
        L13:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r0) goto L1b
            java.lang.String r1 = "All"
            return r1
        L1b:
            java.lang.String r1 = "Invalid"
            return r1
    }
}
