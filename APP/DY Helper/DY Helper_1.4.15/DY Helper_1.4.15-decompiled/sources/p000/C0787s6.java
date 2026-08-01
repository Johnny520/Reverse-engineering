package p000;

/* JADX INFO: renamed from: s6 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0787s6 implements p000.InterfaceC0824t6 {

    /* JADX INFO: renamed from: ε */
    public final float f9743;

    /* JADX INFO: renamed from: ζ */
    public final p000.C1080 f9744;

    /* JADX INFO: renamed from: η */
    public final float f9745;

    public C0787s6(float r1, p000.C1080 r2) {
            r0 = this;
            r0.<init>()
            r0.f9743 = r1
            r0.f9744 = r2
            r0.f9745 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof p000.C0787s6
            if (r0 != 0) goto L8
            goto L1f
        L8:
            s6 r3 = (p000.C0787s6) r3
            float r0 = r2.f9743
            float r1 = r3.f9743
            boolean r0 = p000.C0408iv.m2806(r0, r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            γ r2 = r2.f9744
            γ r3 = r3.f9744
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f9743
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            int r0 = p000.lz1.m3678(r0, r1, r2)
            γ r3 = r3.f9744
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AbsoluteArrangement#spacedAligned("
            r0.<init>(r1)
            float r1 = r2.f9743
            java.lang.String r1 = p000.C0408iv.m2807(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            γ r2 = r2.f9744
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.InterfaceC0824t6
    /* JADX INFO: renamed from: β */
    public final float mo5067() {
            r0 = this;
            float r0 = r0.f9745
            return r0
    }

    @Override // p000.InterfaceC0824t6
    /* JADX INFO: renamed from: δ */
    public final void mo2605(int r8, p000.rx0 r9, int[] r10, int[] r11) {
            r7 = this;
            int r0 = r10.length
            if (r0 != 0) goto L4
            goto L50
        L4:
            float r7 = r7.f9743
            int r7 = r9.mo583(r7)
            int r9 = r10.length
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
        L10:
            if (r1 >= r9) goto L31
            r3 = r10[r1]
            int r5 = r4 + 1
            int r6 = r8 - r3
            int r2 = java.lang.Math.min(r2, r6)
            r11[r4] = r2
            int r2 = r8 - r2
            int r2 = r2 - r3
            int r2 = java.lang.Math.min(r7, r2)
            r4 = r11[r4]
            int r4 = r4 + r3
            int r3 = r4 + r2
            int r1 = r1 + 1
            r4 = r3
            r3 = r2
            r2 = r4
            r4 = r5
            goto L10
        L31:
            int r2 = r2 - r3
            int r8 = r8 - r2
            if (r8 <= 0) goto L50
            int r8 = r8 - r0
            float r7 = (float) r8
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r8
            r8 = 1
            float r8 = (float) r8
            r9 = 0
            float r8 = r8 + r9
            float r8 = r8 * r7
            int r7 = java.lang.Math.round(r8)
            if (r7 == 0) goto L50
            int r8 = r11.length
        L46:
            if (r0 >= r8) goto L50
            r9 = r11[r0]
            int r9 = r9 + r7
            r11[r0] = r9
            int r0 = r0 + 1
            goto L46
        L50:
            return
    }
}
