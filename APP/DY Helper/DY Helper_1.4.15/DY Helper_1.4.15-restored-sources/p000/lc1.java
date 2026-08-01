package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class lc1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f6544;

    /* JADX INFO: renamed from: β */
    public final java.lang.Integer f6545;

    /* JADX INFO: renamed from: γ */
    public final p000.mc1 f6546;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Integer f6547;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Long f6548;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Long f6549;

    /* JADX INFO: renamed from: η */
    public final long f6550;

    /* JADX INFO: renamed from: θ */
    public final boolean f6551;

    /* JADX INFO: renamed from: ι */
    public final java.lang.Integer f6552;

    /* JADX INFO: renamed from: κ */
    public final java.lang.Integer f6553;

    /* JADX INFO: renamed from: λ */
    public final java.lang.Long f6554;

    /* JADX INFO: renamed from: μ */
    public final java.lang.Integer f6555;

    /* JADX INFO: renamed from: ν */
    public final java.lang.Long f6556;

    public lc1(java.lang.String r1, java.lang.Integer r2, p000.mc1 r3, java.lang.Integer r4, java.lang.Long r5, java.lang.Long r6, long r7, boolean r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.Long r12, java.lang.Integer r13, java.lang.Long r14) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r0.<init>()
            r0.f6544 = r1
            r0.f6545 = r2
            r0.f6546 = r3
            r0.f6547 = r4
            r0.f6548 = r5
            r0.f6549 = r6
            r0.f6550 = r7
            r0.f6551 = r9
            r0.f6552 = r10
            r0.f6553 = r11
            r0.f6554 = r12
            r0.f6555 = r13
            r0.f6556 = r14
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.lc1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            lc1 r8 = (p000.lc1) r8
            java.lang.String r1 = r7.f6544
            java.lang.String r3 = r8.f6544
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Integer r1 = r7.f6545
            java.lang.Integer r3 = r8.f6545
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            mc1 r1 = r7.f6546
            mc1 r3 = r8.f6546
            if (r1 == r3) goto L29
            return r2
        L29:
            java.lang.Integer r1 = r7.f6547
            java.lang.Integer r3 = r8.f6547
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            java.lang.Long r1 = r7.f6548
            java.lang.Long r3 = r8.f6548
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.lang.Long r1 = r7.f6549
            java.lang.Long r3 = r8.f6549
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            long r3 = r7.f6550
            long r5 = r8.f6550
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L53
            return r2
        L53:
            boolean r1 = r7.f6551
            boolean r3 = r8.f6551
            if (r1 == r3) goto L5a
            return r2
        L5a:
            java.lang.Integer r1 = r7.f6552
            java.lang.Integer r3 = r8.f6552
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L65
            return r2
        L65:
            java.lang.Integer r1 = r7.f6553
            java.lang.Integer r3 = r8.f6553
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L70
            return r2
        L70:
            java.lang.Long r1 = r7.f6554
            java.lang.Long r3 = r8.f6554
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L7b
            return r2
        L7b:
            java.lang.Integer r1 = r7.f6555
            java.lang.Integer r3 = r8.f6555
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L86
            return r2
        L86:
            java.lang.Long r7 = r7.f6556
            java.lang.Long r8 = r8.f6556
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 != 0) goto L91
            return r2
        L91:
            return r0
    }

    public final int hashCode() {
            r6 = this;
            java.lang.String r0 = r6.f6544
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.Integer r3 = r6.f6545
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            mc1 r3 = r6.f6546
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            int r3 = r3 * r1
            java.lang.Integer r0 = r6.f6547
            if (r0 != 0) goto L24
            r0 = r2
            goto L28
        L24:
            int r0 = r0.hashCode()
        L28:
            int r3 = r3 + r0
            int r3 = r3 * r1
            java.lang.Long r0 = r6.f6548
            if (r0 != 0) goto L30
            r0 = r2
            goto L34
        L30:
            int r0 = r0.hashCode()
        L34:
            int r3 = r3 + r0
            int r3 = r3 * r1
            java.lang.Long r0 = r6.f6549
            if (r0 != 0) goto L3c
            r0 = r2
            goto L40
        L3c:
            int r0 = r0.hashCode()
        L40:
            int r3 = r3 + r0
            int r3 = r3 * r1
            long r4 = r6.f6550
            int r0 = p000.lz1.m3677(r3, r1, r4)
            boolean r3 = r6.f6551
            int r0 = p000.lz1.m3678(r0, r1, r3)
            java.lang.Integer r3 = r6.f6552
            if (r3 != 0) goto L54
            r3 = r2
            goto L58
        L54:
            int r3 = r3.hashCode()
        L58:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r6.f6553
            if (r3 != 0) goto L60
            r3 = r2
            goto L64
        L60:
            int r3 = r3.hashCode()
        L64:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Long r3 = r6.f6554
            if (r3 != 0) goto L6c
            r3 = r2
            goto L70
        L6c:
            int r3 = r3.hashCode()
        L70:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r6.f6555
            if (r3 != 0) goto L78
            r3 = r2
            goto L7c
        L78:
            int r3 = r3.hashCode()
        L7c:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Long r6 = r6.f6556
            if (r6 != 0) goto L83
            goto L87
        L83:
            int r2 = r6.hashCode()
        L87:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PetElfCampPlot(decorateUuid="
            r0.<init>(r1)
            java.lang.String r1 = r3.f6544
            r0.append(r1)
            java.lang.String r1 = ", itemId="
            r0.append(r1)
            java.lang.Integer r1 = r3.f6545
            r0.append(r1)
            java.lang.String r1 = ", state="
            r0.append(r1)
            mc1 r1 = r3.f6546
            r0.append(r1)
            java.lang.String r1 = ", seedId="
            r0.append(r1)
            java.lang.Integer r1 = r3.f6547
            r0.append(r1)
            java.lang.String r1 = ", plantedAtMillis="
            r0.append(r1)
            java.lang.Long r1 = r3.f6548
            r0.append(r1)
            java.lang.String r1 = ", matureAtMillis="
            r0.append(r1)
            java.lang.Long r1 = r3.f6549
            r0.append(r1)
            java.lang.String r1 = ", wateringSavedSeconds="
            r0.append(r1)
            long r1 = r3.f6550
            r0.append(r1)
            java.lang.String r1 = ", isDoubleIncome="
            r0.append(r1)
            boolean r1 = r3.f6551
            r0.append(r1)
            java.lang.String r1 = ", coordinateX="
            r0.append(r1)
            java.lang.Integer r1 = r3.f6552
            r0.append(r1)
            java.lang.String r1 = ", coordinateY="
            r0.append(r1)
            java.lang.Integer r1 = r3.f6553
            r0.append(r1)
            java.lang.String r1 = ", growthDurationSeconds="
            r0.append(r1)
            java.lang.Long r1 = r3.f6554
            r0.append(r1)
            java.lang.String r1 = ", wateringCount="
            r0.append(r1)
            java.lang.Integer r1 = r3.f6555
            r0.append(r1)
            java.lang.String r1 = ", lastWateredAtMillis="
            r0.append(r1)
            java.lang.Long r3 = r3.f6556
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.Integer m3547() {
            r0 = this;
            java.lang.Integer r0 = r0.f6547
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final boolean m3548() {
            r0 = this;
            boolean r0 = r0.f6551
            return r0
    }
}
