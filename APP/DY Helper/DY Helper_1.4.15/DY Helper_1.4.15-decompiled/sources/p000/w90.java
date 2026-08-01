package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class w90 {

    /* JADX INFO: renamed from: α */
    public final float f11606;

    /* JADX INFO: renamed from: β */
    public final float f11607;

    /* JADX INFO: renamed from: γ */
    public final float f11608;

    /* JADX INFO: renamed from: δ */
    public final float f11609;

    /* JADX INFO: renamed from: ε */
    public final float f11610;

    /* JADX INFO: renamed from: ζ */
    public final float f11611;

    /* JADX INFO: renamed from: η */
    public final float f11612;

    /* JADX INFO: renamed from: θ */
    public final float f11613;

    public w90(float r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8) {
            r0 = this;
            r0.<init>()
            r0.f11606 = r1
            r0.f11607 = r2
            r0.f11608 = r3
            r0.f11609 = r4
            r0.f11610 = r5
            r0.f11611 = r6
            r0.f11612 = r7
            r0.f11613 = r8
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.w90 m6330(p000.w90 r9, float r10, float r11, float r12, float r13, float r14, float r15, float r16, float r17, int r18) {
            r0 = r18
            r1 = r0 & 1
            if (r1 == 0) goto L8
            float r10 = r9.f11606
        L8:
            r1 = r10
            r10 = r0 & 2
            if (r10 == 0) goto Lf
            float r11 = r9.f11607
        Lf:
            r2 = r11
            r10 = r0 & 4
            if (r10 == 0) goto L16
            float r12 = r9.f11608
        L16:
            r3 = r12
            r10 = r0 & 8
            if (r10 == 0) goto L1d
            float r13 = r9.f11609
        L1d:
            r4 = r13
            r10 = r0 & 16
            if (r10 == 0) goto L24
            float r14 = r9.f11610
        L24:
            r5 = r14
            r10 = r0 & 32
            if (r10 == 0) goto L2b
            float r15 = r9.f11611
        L2b:
            r6 = r15
            r10 = r0 & 64
            if (r10 == 0) goto L34
            float r10 = r9.f11612
            r7 = r10
            goto L36
        L34:
            r7 = r16
        L36:
            r10 = r0 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L3e
            float r10 = r9.f11613
            r8 = r10
            goto L40
        L3e:
            r8 = r17
        L40:
            r9.getClass()
            w90 r0 = new w90
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static boolean m6331(p000.w90 r3, p000.w90 r4) {
            r3.getClass()
            r4.getClass()
            float r0 = r3.f11606
            float r1 = r4.f11606
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            r1 = 973279855(0x3a03126f, float:5.0E-4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L73
            float r0 = r3.f11607
            float r2 = r4.f11607
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L73
            float r0 = r3.f11608
            float r2 = r4.f11608
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L73
            float r0 = r3.f11609
            float r2 = r4.f11609
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L73
            float r0 = r3.f11610
            float r2 = r4.f11610
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L73
            float r0 = r3.f11611
            float r2 = r4.f11611
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L73
            float r0 = r3.f11612
            float r2 = r4.f11612
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L73
            float r3 = r3.f11613
            float r4 = r4.f11613
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto L73
            r3 = 1
            return r3
        L73:
            r3 = 0
            return r3
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.w90
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            w90 r5 = (p000.w90) r5
            float r1 = r4.f11606
            float r3 = r5.f11606
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r1 = r4.f11607
            float r3 = r5.f11607
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L22
            return r2
        L22:
            float r1 = r4.f11608
            float r3 = r5.f11608
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L2d
            return r2
        L2d:
            float r1 = r4.f11609
            float r3 = r5.f11609
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L38
            return r2
        L38:
            float r1 = r4.f11610
            float r3 = r5.f11610
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L43
            return r2
        L43:
            float r1 = r4.f11611
            float r3 = r5.f11611
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L4e
            return r2
        L4e:
            float r1 = r4.f11612
            float r3 = r5.f11612
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L59
            return r2
        L59:
            float r4 = r4.f11613
            float r5 = r5.f11613
            int r4 = java.lang.Float.compare(r4, r5)
            if (r4 == 0) goto L64
            return r2
        L64:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f11606
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f11607
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r2 = r3.f11608
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r2 = r3.f11609
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r2 = r3.f11610
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r2 = r3.f11611
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r2 = r3.f11612
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r3 = r3.f11613
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GridBounds(firstVertical="
            r0.<init>(r1)
            float r1 = r2.f11606
            r0.append(r1)
            java.lang.String r1 = ", secondVertical="
            r0.append(r1)
            float r1 = r2.f11607
            r0.append(r1)
            java.lang.String r1 = ", firstHorizontal="
            r0.append(r1)
            float r1 = r2.f11608
            r0.append(r1)
            java.lang.String r1 = ", secondHorizontal="
            r0.append(r1)
            float r1 = r2.f11609
            r0.append(r1)
            java.lang.String r1 = ", leftMargin="
            r0.append(r1)
            float r1 = r2.f11610
            r0.append(r1)
            java.lang.String r1 = ", rightMargin="
            r0.append(r1)
            float r1 = r2.f11611
            r0.append(r1)
            java.lang.String r1 = ", topMargin="
            r0.append(r1)
            float r1 = r2.f11612
            r0.append(r1)
            java.lang.String r1 = ", bottomMargin="
            r0.append(r1)
            float r2 = r2.f11613
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
