package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class iu1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f5206;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f5207;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f5208;

    public iu1(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.f5206 = r1
            r0.f5207 = r2
            r0.f5208 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof p000.iu1
            if (r0 != 0) goto L8
            goto L2a
        L8:
            iu1 r3 = (p000.iu1) r3
            java.lang.String r0 = r2.f5206
            java.lang.String r1 = r3.f5206
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.String r0 = r2.f5207
            java.lang.String r1 = r3.f5207
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.lang.String r2 = r2.f5208
            java.lang.String r3 = r3.f5208
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f5206
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f5207
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r3 = r3.f5208
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", versionName="
            java.lang.String r1 = ", versionCode="
            java.lang.String r2 = "AppVersionInfo(packageName="
            java.lang.String r3 = r5.f5206
            java.lang.String r4 = r5.f5207
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f5208
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }
}
