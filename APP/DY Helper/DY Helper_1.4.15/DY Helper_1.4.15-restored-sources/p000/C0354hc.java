package p000;

/* JADX INFO: renamed from: hc */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0354hc implements p000.px0 {

    /* JADX INFO: renamed from: α */
    public final p000.C0011aa f4682;

    /* JADX INFO: renamed from: β */
    public final boolean f4683;

    public C0354hc(p000.C0011aa r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f4682 = r1
            r0.f4683 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof p000.C0354hc
            if (r0 != 0) goto L8
            goto L1b
        L8:
            hc r3 = (p000.C0354hc) r3
            aa r0 = r2.f4682
            aa r1 = r3.f4682
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            boolean r2 = r2.f4683
            boolean r3 = r3.f4683
            if (r2 == r3) goto L1d
        L1b:
            r2 = 0
            return r2
        L1d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            aa r0 = r1.f4682
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r1.f4683
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BoxMeasurePolicy(alignment="
            r0.<init>(r1)
            aa r1 = r2.f4682
            r0.append(r1)
            java.lang.String r1 = ", propagateMinConstraints="
            r0.append(r1)
            boolean r2 = r2.f4683
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.px0
    /* JADX INFO: renamed from: ε */
    public final p000.qx0 mo1688(p000.rx0 r14, java.util.List r15, long r16) {
            r13 = this;
            boolean r0 = r15.isEmpty()
            kz r8 = p000.C0493kz.f6332
            if (r0 == 0) goto L1c
            int r0 = p000.C1028yo.m6955(r16)
            int r1 = p000.C1028yo.m6954(r16)
            wj0 r2 = new wj0
            r4 = 21
            r2.<init>(r4)
            qx0 r0 = r14.mo1612(r0, r1, r8, r2)
            return r0
        L1c:
            boolean r0 = r13.f4683
            if (r0 == 0) goto L23
            r0 = r16
            goto L2a
        L23:
            r0 = -8589934589(0xfffffffe00000003, double:NaN)
            long r0 = r16 & r0
        L2a:
            int r4 = r15.size()
            r5 = 1
            r7 = 0
            if (r4 != r5) goto L5f
            java.lang.Object r2 = r15.get(r7)
            kx0 r2 = (p000.kx0) r2
            r2.mo1183()
            ch1 r1 = r2.mo2146(r0)
            int r0 = p000.C1028yo.m6955(r16)
            int r4 = r1.f2115
            int r4 = java.lang.Math.max(r0, r4)
            int r0 = p000.C1028yo.m6954(r16)
            int r5 = r1.f2116
            int r5 = java.lang.Math.max(r0, r5)
            fc r0 = new fc
            r6 = r13
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            qx0 r0 = r14.mo1612(r4, r5, r8, r0)
            return r0
        L5f:
            int r4 = r15.size()
            ch1[] r4 = new p000.ch1[r4]
            r5 = r4
            sm1 r4 = new sm1
            r4.<init>()
            int r6 = p000.C1028yo.m6955(r16)
            r4.f9967 = r6
            r6 = r5
            sm1 r5 = new sm1
            r5.<init>()
            int r9 = p000.C1028yo.m6954(r16)
            r5.f9967 = r9
            int r9 = r15.size()
        L81:
            if (r7 >= r9) goto La9
            java.lang.Object r10 = r15.get(r7)
            kx0 r10 = (p000.kx0) r10
            r10.mo1183()
            ch1 r10 = r10.mo2146(r0)
            r6[r7] = r10
            int r11 = r4.f9967
            int r12 = r10.f2115
            int r11 = java.lang.Math.max(r11, r12)
            r4.f9967 = r11
            int r11 = r5.f9967
            int r10 = r10.f2116
            int r10 = java.lang.Math.max(r11, r10)
            r5.f9967 = r10
            int r7 = r7 + 1
            goto L81
        La9:
            int r9 = r4.f9967
            int r10 = r5.f9967
            gc r0 = new gc
            r7 = 0
            r3 = r14
            r2 = r15
            r1 = r6
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            qx0 r0 = r14.mo1612(r9, r10, r8, r0)
            return r0
    }
}
