package p000;

/* JADX INFO: renamed from: px */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0703px {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f8750;

    /* JADX INFO: renamed from: β */
    public final long f8751;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f8752;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f8753;

    /* JADX INFO: renamed from: ε */
    public final long f8754;

    public C0703px(java.lang.String r1, long r2, java.lang.String r4, java.lang.String r5, long r6) {
            r0 = this;
            r0.<init>()
            r0.f8750 = r1
            r0.f8751 = r2
            r0.f8752 = r4
            r0.f8753 = r5
            r0.f8754 = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L39
        L3:
            if (r5 == 0) goto La
            java.lang.Class r0 = r5.getClass()
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.Class<px> r1 = p000.C0703px.class
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L14
            goto L37
        L14:
            r5.getClass()
            px r5 = (p000.C0703px) r5
            java.lang.String r0 = r4.f8750
            java.lang.String r1 = r5.f8750
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L24
            goto L37
        L24:
            long r0 = r4.f8751
            long r2 = r5.f8751
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L2d
            goto L37
        L2d:
            java.lang.String r4 = r4.f8752
            java.lang.String r5 = r5.f8752
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L39
        L37:
            r4 = 0
            return r4
        L39:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f8750
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f8751
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.lang.String r4 = r4.f8752
            int r4 = p000.a12.m15(r0, r1, r4)
            r2 = 60
            int r0 = java.lang.Long.hashCode(r2)
            int r0 = r0 + r4
            int r0 = r0 * r1
            r4 = 1446905275(0x563e05bb, float:5.2232955E13)
            int r0 = r0 + r4
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "DyDexKitMeta(hostPackageName="
            java.lang.String r1 = ", hostVersionCode="
            java.lang.String r2 = r5.f8750
            long r3 = r5.f8751
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4137(r0, r2, r3, r1)
            java.lang.String r1 = ", hostVersionName="
            java.lang.String r2 = ", hostSourceDir="
            java.lang.String r3 = r5.f8752
            java.lang.String r4 = r5.f8753
            p000.AbstractC0602nx.m4119(r0, r1, r3, r2, r4)
            java.lang.String r1 = ", hostLastUpdateTime="
            r0.append(r1)
            long r1 = r5.f8754
            r0.append(r1)
            java.lang.String r5 = ", moduleVersionCode=60, moduleVersionName=1.4.15)"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
