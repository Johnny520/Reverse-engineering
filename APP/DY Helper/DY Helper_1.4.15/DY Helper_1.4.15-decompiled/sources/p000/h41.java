package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class h41 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f4570;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f4571;

    /* JADX INFO: renamed from: γ */
    public final boolean f4572;

    public h41(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f4570 = r1
            r0.f4571 = r2
            r0.f4572 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.h41
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h41 r5 = (p000.h41) r5
            java.lang.String r1 = r4.f4570
            java.lang.String r3 = r5.f4570
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f4571
            java.lang.String r3 = r5.f4571
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            boolean r4 = r4.f4572
            boolean r5 = r5.f4572
            if (r4 == r5) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f4570
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f4571
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r3 = r3.f4572
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", displayName="
            java.lang.String r1 = ", savedToAlbum="
            java.lang.String r2 = "OfficialSavedFile(sourcePath="
            java.lang.String r3 = r5.f4570
            java.lang.String r4 = r5.f4571
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ")"
            boolean r5 = r5.f4572
            java.lang.String r5 = p000.lz1.m3693(r0, r5, r1)
            return r5
    }
}
