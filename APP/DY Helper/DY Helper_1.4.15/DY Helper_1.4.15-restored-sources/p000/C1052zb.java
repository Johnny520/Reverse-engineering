package p000;

/* JADX INFO: renamed from: zb */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1052zb {

    /* JADX INFO: renamed from: α */
    public final int f13022;

    /* JADX INFO: renamed from: β */
    public final int f13023;

    /* JADX INFO: renamed from: γ */
    public final int f13024;

    /* JADX INFO: renamed from: δ */
    public final int f13025;

    static {
            zb r0 = new zb
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            return
    }

    public C1052zb(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f13022 = r1
            r0.f13023 = r2
            r0.f13024 = r3
            r0.f13025 = r4
            if (r1 > r3) goto L1d
            if (r2 > r4) goto L10
            return
        L10:
            java.lang.String r0 = "top must be less than or equal to bottom, top: "
            java.lang.String r1 = ", bottom: "
            java.lang.String r0 = p000.AbstractC0602nx.m4125(r2, r4, r0, r1)
            p000.C1080.m7266(r0)
            r0 = 0
            throw r0
        L1d:
            java.lang.String r0 = "Left must be less than or equal to right, left: "
            java.lang.String r2 = ", right: "
            java.lang.String r0 = p000.AbstractC0602nx.m4125(r1, r3, r0, r2)
            p000.C1080.m7266(r0)
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            if (r5 == 0) goto Lb
            java.lang.Class r1 = r5.getClass()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.Class<zb> r2 = p000.C1052zb.class
            boolean r1 = r2.equals(r1)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            r5.getClass()
            zb r5 = (p000.C1052zb) r5
            int r1 = r4.f13022
            int r3 = r5.f13022
            if (r1 == r3) goto L22
            return r2
        L22:
            int r1 = r4.f13023
            int r3 = r5.f13023
            if (r1 == r3) goto L29
            return r2
        L29:
            int r1 = r4.f13024
            int r3 = r5.f13024
            if (r1 == r3) goto L30
            return r2
        L30:
            int r4 = r4.f13025
            int r5 = r5.f13025
            if (r4 == r5) goto L37
            return r2
        L37:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f13022
            int r0 = r0 * 31
            int r1 = r2.f13023
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f13024
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.f13025
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<zb> r1 = p000.C1052zb.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " { ["
            r0.append(r1)
            int r1 = r3.f13022
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            int r2 = r3.f13023
            r0.append(r2)
            r0.append(r1)
            int r2 = r3.f13024
            r0.append(r2)
            r0.append(r1)
            int r3 = r3.f13025
            java.lang.String r1 = "] }"
            java.lang.String r3 = p000.AbstractC0602nx.m4131(r0, r3, r1)
            return r3
    }
}
