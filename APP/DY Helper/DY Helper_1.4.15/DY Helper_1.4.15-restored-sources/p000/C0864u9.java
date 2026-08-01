package p000;

/* JADX INFO: renamed from: u9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0864u9 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f10649;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f10650;

    public C0864u9(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f10649 = r1
            r0.f10650 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0864u9
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            u9 r5 = (p000.C0864u9) r5
            java.lang.String r1 = r4.f10649
            java.lang.String r3 = r5.f10649
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r4 = r4.f10650
            java.lang.String r5 = r5.f10650
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f10649
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r1.f10650
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = ", expire="
            java.lang.String r1 = ")"
            java.lang.String r2 = "BetaUserInfo(uid="
            java.lang.String r3 = r4.f10649
            java.lang.String r4 = r4.f10650
            java.lang.String r4 = p000.lz1.m3689(r2, r3, r0, r4, r1)
            return r4
    }
}
