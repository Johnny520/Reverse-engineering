package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class lg1 {

    /* JADX INFO: renamed from: α */
    public final p000.kg1 f6623;

    /* JADX INFO: renamed from: β */
    public final boolean f6624;

    /* JADX INFO: renamed from: γ */
    public final boolean f6625;

    /* JADX INFO: renamed from: δ */
    public final boolean f6626;

    /* JADX INFO: renamed from: ε */
    public final boolean f6627;

    /* JADX INFO: renamed from: ζ */
    public final android.net.Uri f6628;

    /* JADX INFO: renamed from: η */
    public final p000.ky1 f6629;

    /* JADX INFO: renamed from: θ */
    public final p000.my1 f6630;

    public lg1(p000.kg1 r3, boolean r4, boolean r5, boolean r6, boolean r7, android.net.Uri r8, p000.ky1 r9, p000.my1 r10, int r11) {
            r2 = this;
            r0 = r11 & 16
            if (r0 == 0) goto L5
            r7 = 1
        L5:
            r0 = r11 & 32
            r1 = 0
            if (r0 == 0) goto Lb
            r8 = r1
        Lb:
            r0 = r11 & 64
            if (r0 == 0) goto L10
            r9 = r1
        L10:
            r11 = r11 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L15
            r10 = r1
        L15:
            r2.<init>()
            r2.f6623 = r3
            r2.f6624 = r4
            r2.f6625 = r5
            r2.f6626 = r6
            r2.f6627 = r7
            r2.f6628 = r8
            r2.f6629 = r9
            r2.f6630 = r10
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4f
        L3:
            boolean r0 = r3 instanceof p000.lg1
            if (r0 != 0) goto L8
            goto L4d
        L8:
            lg1 r3 = (p000.lg1) r3
            kg1 r0 = r2.f6623
            kg1 r1 = r3.f6623
            if (r0 == r1) goto L11
            goto L4d
        L11:
            boolean r0 = r2.f6624
            boolean r1 = r3.f6624
            if (r0 == r1) goto L18
            goto L4d
        L18:
            boolean r0 = r2.f6625
            boolean r1 = r3.f6625
            if (r0 == r1) goto L1f
            goto L4d
        L1f:
            boolean r0 = r2.f6626
            boolean r1 = r3.f6626
            if (r0 == r1) goto L26
            goto L4d
        L26:
            boolean r0 = r2.f6627
            boolean r1 = r3.f6627
            if (r0 == r1) goto L2d
            goto L4d
        L2d:
            android.net.Uri r0 = r2.f6628
            android.net.Uri r1 = r3.f6628
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L38
            goto L4d
        L38:
            ky1 r0 = r2.f6629
            ky1 r1 = r3.f6629
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L43
            goto L4d
        L43:
            my1 r2 = r2.f6630
            my1 r3 = r3.f6630
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L4f
        L4d:
            r2 = 0
            return r2
        L4f:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            kg1 r0 = r4.f6623
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r4.f6624
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r4.f6625
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r4.f6626
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r4.f6627
            int r0 = p000.lz1.m3678(r0, r1, r2)
            r2 = 0
            android.net.Uri r3 = r4.f6628
            if (r3 != 0) goto L28
            r3 = r2
            goto L2c
        L28:
            int r3 = r3.hashCode()
        L2c:
            int r0 = r0 + r3
            int r0 = r0 * r1
            ky1 r3 = r4.f6629
            if (r3 != 0) goto L34
            r3 = r2
            goto L38
        L34:
            int r3 = r3.hashCode()
        L38:
            int r0 = r0 + r3
            int r0 = r0 * r1
            my1 r4 = r4.f6630
            if (r4 != 0) goto L3f
            goto L43
        L3f:
            int r2 = r4.hashCode()
        L43:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RunOptions(mode="
            r0.<init>(r1)
            kg1 r1 = r5.f6623
            r0.append(r1)
            java.lang.String r1 = ", completeMutualMessage="
            r0.append(r1)
            boolean r1 = r5.f6624
            r0.append(r1)
            java.lang.String r1 = ", sendImage="
            r0.append(r1)
            java.lang.String r1 = ", autoClaim="
            java.lang.String r2 = ", showNotice="
            boolean r3 = r5.f6625
            boolean r4 = r5.f6626
            p000.AbstractC0602nx.m4120(r0, r3, r1, r4, r2)
            boolean r1 = r5.f6627
            r0.append(r1)
            java.lang.String r1 = ", imageUri="
            r0.append(r1)
            android.net.Uri r1 = r5.f6628
            r0.append(r1)
            java.lang.String r1 = ", targetSpark="
            r0.append(r1)
            ky1 r1 = r5.f6629
            r0.append(r1)
            java.lang.String r1 = ", targetConfig="
            r0.append(r1)
            my1 r5 = r5.f6630
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
