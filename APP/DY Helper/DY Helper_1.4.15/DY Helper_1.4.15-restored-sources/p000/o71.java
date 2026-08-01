package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class o71 {

    /* JADX INFO: renamed from: α */
    public final int f7971;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f7972;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f7973;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f7974;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f7975;

    public o71(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r5.getClass()
            r0.<init>()
            r0.f7971 = r1
            r0.f7972 = r2
            r0.f7973 = r3
            r0.f7974 = r4
            r0.f7975 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3e
        L3:
            boolean r0 = r3 instanceof p000.o71
            if (r0 != 0) goto L8
            goto L3c
        L8:
            o71 r3 = (p000.o71) r3
            int r0 = r2.f7971
            int r1 = r3.f7971
            if (r0 == r1) goto L11
            goto L3c
        L11:
            java.lang.String r0 = r2.f7972
            java.lang.String r1 = r3.f7972
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L3c
        L1c:
            java.lang.String r0 = r2.f7973
            java.lang.String r1 = r3.f7973
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L3c
        L27:
            java.lang.String r0 = r2.f7974
            java.lang.String r1 = r3.f7974
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L3c
        L32:
            java.lang.String r2 = r2.f7975
            java.lang.String r3 = r3.f7975
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L3e
        L3c:
            r2 = 0
            return r2
        L3e:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f7971
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f7972
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f7973
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f7974
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r3 = r3.f7975
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", iconBg="
            java.lang.String r1 = ", iconTint="
            int r2 = r5.f7971
            java.lang.String r3 = "MetaRow(iconRes="
            java.lang.String r4 = r5.f7972
            java.lang.StringBuilder r0 = p000.a12.m20(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", label="
            java.lang.String r2 = ", value="
            java.lang.String r3 = r5.f7973
            java.lang.String r4 = r5.f7974
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f7975
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }
}
