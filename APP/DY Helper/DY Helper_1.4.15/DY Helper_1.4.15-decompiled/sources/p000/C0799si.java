package p000;

/* JADX INFO: renamed from: si */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0799si implements p000.px0, p000.dp1 {

    /* JADX INFO: renamed from: α */
    public final p000.InterfaceC0824t6 f9920;

    /* JADX INFO: renamed from: β */
    public final p000.C1013y9 f9921;

    public C0799si(p000.InterfaceC0824t6 r1, p000.C1013y9 r2) {
            r0 = this;
            r0.<init>()
            r0.f9920 = r1
            r0.f9921 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof p000.C0799si
            if (r0 != 0) goto L8
            goto L1f
        L8:
            si r3 = (p000.C0799si) r3
            t6 r0 = r2.f9920
            t6 r1 = r3.f9920
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            y9 r2 = r2.f9921
            y9 r3 = r3.f9921
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
            r1 = this;
            t6 r0 = r1.f9920
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            y9 r1 = r1.f9921
            float r1 = r1.f12499
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ColumnMeasurePolicy(verticalArrangement="
            r0.<init>(r1)
            t6 r1 = r2.f9920
            r0.append(r1)
            java.lang.String r1 = ", horizontalAlignment="
            r0.append(r1)
            y9 r2 = r2.f9921
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.dp1
    /* JADX INFO: renamed from: α */
    public final p000.qx0 mo1789(p000.ch1[] r7, p000.rx0 r8, int[] r9, int r10, int r11) {
            r6 = this;
            ri r0 = new ri
            r2 = r6
            r1 = r7
            r4 = r8
            r5 = r9
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            kz r6 = p000.C0493kz.f6332
            qx0 r6 = r4.mo1612(r3, r10, r6, r0)
            return r6
    }

    @Override // p000.dp1
    /* JADX INFO: renamed from: β */
    public final void mo1790(int r1, p000.rx0 r2, int[] r3, int[] r4) {
            r0 = this;
            t6 r0 = r0.f9920
            r0.mo2605(r1, r2, r3, r4)
            return
    }

    @Override // p000.dp1
    /* JADX INFO: renamed from: γ */
    public final long mo1791(int r1, int r2, int r3, boolean r4) {
            r0 = this;
            r0 = 0
            if (r4 != 0) goto L8
            long r0 = p000.AbstractC1065zo.m7207(r0, r3, r1, r2)
            return r0
        L8:
            long r0 = p000.AbstractC1021yh.m6852(r0, r3, r1, r2)
            return r0
    }

    @Override // p000.dp1
    /* JADX INFO: renamed from: δ */
    public final int mo1792(p000.ch1 r1) {
            r0 = this;
            int r0 = r1.f2115
            return r0
    }

    @Override // p000.px0
    /* JADX INFO: renamed from: ε */
    public final p000.qx0 mo1688(p000.rx0 r11, java.util.List r12, long r13) {
            r10 = this;
            int r1 = p000.C1028yo.m6954(r13)
            int r2 = p000.C1028yo.m6955(r13)
            int r3 = p000.C1028yo.m6952(r13)
            int r4 = p000.C1028yo.m6953(r13)
            t6 r13 = r10.f9920
            float r13 = r13.mo5067()
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
            int r0 = r1.f2116
            return r0
    }
}
