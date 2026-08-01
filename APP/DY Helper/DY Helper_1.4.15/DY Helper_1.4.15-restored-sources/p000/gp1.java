package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gp1 implements p000.px0, p000.dp1 {

    /* JADX INFO: renamed from: α */
    public final p000.C1050z9 f4428;

    public gp1(p000.C1050z9 r2) {
            r1 = this;
            i2 r0 = p000.AbstractC0861u6.f10605
            r1.<init>()
            r1.f4428 = r2
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L1f
        L3:
            boolean r0 = r2 instanceof p000.gp1
            if (r0 != 0) goto L8
            goto L1d
        L8:
            gp1 r2 = (p000.gp1) r2
            i2 r0 = p000.AbstractC0861u6.f10605
            boolean r0 = r0.equals(r0)
            if (r0 != 0) goto L13
            goto L1d
        L13:
            z9 r1 = r1.f4428
            z9 r2 = r2.f4428
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1f
        L1d:
            r1 = 0
            return r1
        L1f:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r1 = this;
            i2 r0 = p000.AbstractC0861u6.f10605
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            z9 r1 = r1.f4428
            float r1 = r1.f13013
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RowMeasurePolicy(horizontalArrangement="
            r0.<init>(r1)
            i2 r1 = p000.AbstractC0861u6.f10605
            r0.append(r1)
            java.lang.String r1 = ", verticalAlignment="
            r0.append(r1)
            z9 r2 = r2.f4428
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.dp1
    /* JADX INFO: renamed from: α */
    public final p000.qx0 mo1789(p000.ch1[] r2, p000.rx0 r3, int[] r4, int r5, int r6) {
            r1 = this;
            ds r0 = new ds
            r0.<init>(r2, r1, r6, r4)
            kz r1 = p000.C0493kz.f6332
            qx0 r1 = r3.mo1612(r5, r6, r1, r0)
            return r1
    }

    @Override // p000.dp1
    /* JADX INFO: renamed from: β */
    public final void mo1790(int r3, p000.rx0 r4, int[] r5, int[] r6) {
            r2 = this;
            i2 r2 = p000.AbstractC0861u6.f10605
            np0 r2 = r4.getLayoutDirection()
            np0 r4 = p000.np0.f7701
            r0 = 0
            if (r2 != r4) goto Lf
            p000.AbstractC0861u6.m5787(r5, r6, r0)
            return
        Lf:
            int r2 = r5.length
            r4 = r0
        L11:
            if (r0 >= r2) goto L19
            r1 = r5[r0]
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L11
        L19:
            int r3 = r3 - r4
            int r2 = r5.length
            int r2 = r2 + (-1)
        L1d:
            r4 = -1
            if (r4 >= r2) goto L28
            r4 = r5[r2]
            r6[r2] = r3
            int r3 = r3 + r4
            int r2 = r2 + (-1)
            goto L1d
        L28:
            return
    }

    @Override // p000.dp1
    /* JADX INFO: renamed from: γ */
    public final long mo1791(int r1, int r2, int r3, boolean r4) {
            r0 = this;
            r0 = 0
            if (r4 != 0) goto L8
            long r0 = p000.AbstractC1065zo.m7207(r1, r2, r0, r3)
            return r0
        L8:
            long r0 = p000.AbstractC1021yh.m6853(r1, r2, r0, r3)
            return r0
    }

    @Override // p000.dp1
    /* JADX INFO: renamed from: δ */
    public final int mo1792(p000.ch1 r1) {
            r0 = this;
            int r0 = r1.f2116
            return r0
    }

    @Override // p000.px0
    /* JADX INFO: renamed from: ε */
    public final p000.qx0 mo1688(p000.rx0 r11, java.util.List r12, long r13) {
            r10 = this;
            int r1 = p000.C1028yo.m6955(r13)
            int r2 = p000.C1028yo.m6954(r13)
            int r3 = p000.C1028yo.m6953(r13)
            int r4 = p000.C1028yo.m6952(r13)
            i2 r13 = p000.AbstractC0861u6.f10605
            r13 = 0
            float r13 = (float) r13
            int r5 = r11.mo583(r13)
            int r13 = r12.size()
            ch1[] r8 = new p000.ch1[r13]
            int r9 = r12.size()
            r0 = r10
            r6 = r11
            r7 = r12
            qx0 r10 = p000.v81.m6128(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Override // p000.dp1
    /* JADX INFO: renamed from: ζ */
    public final int mo1793(p000.ch1 r1) {
            r0 = this;
            int r0 = r1.f2115
            return r0
    }
}
