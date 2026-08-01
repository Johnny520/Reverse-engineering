package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class k91 extends p000.q01 implements p000.qp0, p000.InterfaceC0092bw {

    /* JADX INFO: renamed from: τ */
    public p000.C0070ba f5816;

    /* JADX INFO: renamed from: υ */
    public boolean f5817;

    /* JADX INFO: renamed from: φ */
    public p000.C0011aa f5818;

    /* JADX INFO: renamed from: χ */
    public p000.C0381i2 f5819;

    /* JADX INFO: renamed from: ψ */
    public float f5820;

    /* JADX INFO: renamed from: В */
    public static boolean m3181(long r2) {
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r0 = p000.jw1.m2997(r2, r0)
            if (r0 != 0) goto L24
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r3
            r3 = 2139095040(0x7f800000, float:Infinity)
            if (r2 >= r3) goto L24
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: Г */
    public static boolean m3182(long r2) {
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r0 = p000.jw1.m2997(r2, r0)
            if (r0 != 0) goto L21
            r0 = 32
            long r2 = r2 >> r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r3
            r3 = 2139095040(0x7f800000, float:Infinity)
            if (r2 >= r3) goto L21
            r2 = 1
            return r2
        L21:
            r2 = 0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PainterModifier(painter="
            r0.<init>(r1)
            ba r1 = r2.f5816
            r0.append(r1)
            java.lang.String r1 = ", sizeToIntrinsics="
            r0.append(r1)
            boolean r1 = r2.f5817
            r0.append(r1)
            java.lang.String r1 = ", alignment="
            r0.append(r1)
            aa r1 = r2.f5818
            r0.append(r1)
            java.lang.String r1 = ", alpha="
            r0.append(r1)
            float r2 = r2.f5820
            r0.append(r2)
            java.lang.String r2 = ", colorFilter=null)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.InterfaceC0092bw
    /* JADX INFO: renamed from: Μ */
    public final void mo604(p000.aq0 r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            fe r2 = r1.f1284
            ba r3 = r0.f5816
            long r3 = r3.f1580
            long r3 = p000.AbstractC0782s1.m5322(r3)
            boolean r5 = m3182(r3)
            r6 = 32
            if (r5 == 0) goto L1e
            long r7 = r3 >> r6
            int r5 = (int) r7
            float r5 = java.lang.Float.intBitsToFloat(r5)
            goto L28
        L1e:
            long r7 = r2.mo585()
            long r7 = r7 >> r6
            int r5 = (int) r7
            float r5 = java.lang.Float.intBitsToFloat(r5)
        L28:
            boolean r7 = m3181(r3)
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r7 == 0) goto L3a
            long r3 = r3 & r8
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            goto L44
        L3a:
            long r3 = r2.mo585()
            long r3 = r3 & r8
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
        L44:
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r10 = (long) r3
            long r3 = r4 << r6
            long r10 = r10 & r8
            long r3 = r3 | r10
            long r10 = r2.mo585()
            long r10 = r10 >> r6
            int r5 = (int) r10
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L62
            goto L70
        L62:
            long r10 = r2.mo585()
            long r10 = r10 & r8
            int r5 = (int) r10
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L73
        L70:
            r3 = 0
            goto L81
        L73:
            i2 r5 = r0.f5819
            long r10 = r2.mo585()
            long r10 = r5.m2606(r3, r10)
            long r3 = p000.g81.m2289(r3, r10)
        L81:
            aa r10 = r0.f5818
            long r11 = r3 >> r6
            int r5 = (int) r11
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r5 = java.lang.Math.round(r5)
            long r11 = r3 & r8
            int r7 = (int) r11
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r7 = java.lang.Math.round(r7)
            long r11 = (long) r5
            long r11 = r11 << r6
            long r13 = (long) r7
            long r13 = r13 & r8
            long r11 = r11 | r13
            long r13 = r2.mo585()
            long r13 = r13 >> r6
            int r5 = (int) r13
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r5 = java.lang.Math.round(r5)
            long r13 = r2.mo585()
            long r13 = r13 & r8
            int r7 = (int) r13
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r7 = java.lang.Math.round(r7)
            long r13 = (long) r5
            long r13 = r13 << r6
            r5 = r6
            long r6 = (long) r7
            long r6 = r6 & r8
            long r13 = r13 | r6
            np0 r15 = r1.getLayoutDirection()
            long r6 = r10.m53(r11, r13, r15)
            long r10 = r6 >> r5
            int r5 = (int) r10
            float r5 = (float) r5
            long r6 = r6 & r8
            int r6 = (int) r6
            float r6 = (float) r6
            m6 r7 = r2.f3907
            java.lang.Object r7 = r7.f6967
            n r7 = (p000.C0568n) r7
            r7.m3925(r5, r6)
            ba r7 = r0.f5816     // Catch: java.lang.Throwable -> Lee
            float r0 = r0.f5820     // Catch: java.lang.Throwable -> Lee
            r7.m830(r1, r3, r0)     // Catch: java.lang.Throwable -> Lee
            m6 r0 = r2.f3907
            java.lang.Object r0 = r0.f6967
            n r0 = (p000.C0568n) r0
            float r2 = -r5
            float r3 = -r6
            r0.m3925(r2, r3)
            r1.m587()
            return
        Lee:
            r0 = move-exception
            m6 r1 = r2.f3907
            java.lang.Object r1 = r1.f6967
            n r1 = (p000.C0568n) r1
            float r2 = -r5
            float r3 = -r6
            r1.m3925(r2, r3)
            throw r0
    }

    @Override // p000.qp0
    /* JADX INFO: renamed from: Φ */
    public final p000.qx0 mo605(p000.dw0 r12, p000.kx0 r13, long r14) {
            r11 = this;
            boolean r0 = p000.C1028yo.m6949(r14)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L10
            boolean r0 = p000.C1028yo.m6948(r14)
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            boolean r3 = p000.C1028yo.m6951(r14)
            if (r3 == 0) goto L1e
            boolean r3 = p000.C1028yo.m6950(r14)
            if (r3 == 0) goto L1e
            r1 = r2
        L1e:
            boolean r2 = r11.f5817
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            if (r2 == 0) goto L34
            ba r2 = r11.f5816
            long r5 = r2.f1580
            long r5 = p000.AbstractC0782s1.m5322(r5)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L34
            goto L36
        L34:
            if (r0 != 0) goto L138
        L36:
            if (r1 == 0) goto L3a
            goto L138
        L3a:
            ba r0 = r11.f5816
            long r0 = r0.f1580
            long r0 = p000.AbstractC0782s1.m5322(r0)
            boolean r2 = m3182(r0)
            r5 = 32
            if (r2 == 0) goto L56
            long r6 = r0 >> r5
            int r2 = (int) r6
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r2 = java.lang.Math.round(r2)
            goto L5a
        L56:
            int r2 = p000.C1028yo.m6955(r14)
        L5a:
            boolean r6 = m3181(r0)
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r6 == 0) goto L70
            long r0 = r0 & r7
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = java.lang.Math.round(r0)
            goto L74
        L70:
            int r0 = p000.C1028yo.m6954(r14)
        L74:
            int r1 = p000.AbstractC1065zo.m7212(r2, r14)
            int r0 = p000.AbstractC1065zo.m7211(r0, r14)
            float r1 = (float) r1
            float r0 = (float) r0
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r9 = (long) r0
            long r0 = r1 << r5
            long r9 = r9 & r7
            long r0 = r0 | r9
            boolean r2 = r11.f5817
            if (r2 == 0) goto L116
            ba r2 = r11.f5816
            long r9 = r2.f1580
            long r9 = p000.AbstractC0782s1.m5322(r9)
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 == 0) goto L116
            ba r2 = r11.f5816
            long r2 = r2.f1580
            long r2 = p000.AbstractC0782s1.m5322(r2)
            boolean r2 = m3182(r2)
            if (r2 != 0) goto Lb2
            long r2 = r0 >> r5
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            goto Lc0
        Lb2:
            ba r2 = r11.f5816
            long r2 = r2.f1580
            long r2 = p000.AbstractC0782s1.m5322(r2)
            long r2 = r2 >> r5
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
        Lc0:
            ba r3 = r11.f5816
            long r3 = r3.f1580
            long r3 = p000.AbstractC0782s1.m5322(r3)
            boolean r3 = m3181(r3)
            if (r3 != 0) goto Ld6
            long r3 = r0 & r7
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            goto Le4
        Ld6:
            ba r3 = r11.f5816
            long r3 = r3.f1580
            long r3 = p000.AbstractC0782s1.m5322(r3)
            long r3 = r3 & r7
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
        Le4:
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r9 = (long) r2
            int r2 = java.lang.Float.floatToRawIntBits(r3)
            long r2 = (long) r2
            long r9 = r9 << r5
            long r2 = r2 & r7
            long r2 = r2 | r9
            long r9 = r0 >> r5
            int r4 = (int) r9
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto Lfe
            goto L109
        Lfe:
            long r9 = r0 & r7
            int r4 = (int) r9
            float r4 = java.lang.Float.intBitsToFloat(r4)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L10c
        L109:
            r0 = 0
            goto L116
        L10c:
            i2 r11 = r11.f5819
            long r0 = r11.m2606(r2, r0)
            long r0 = p000.g81.m2289(r2, r0)
        L116:
            long r2 = r0 >> r5
            int r11 = (int) r2
            float r11 = java.lang.Float.intBitsToFloat(r11)
            int r11 = java.lang.Math.round(r11)
            int r11 = p000.AbstractC1065zo.m7212(r11, r14)
            long r0 = r0 & r7
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = java.lang.Math.round(r0)
            int r0 = p000.AbstractC1065zo.m7211(r0, r14)
            long r14 = p000.C1028yo.m6946(r11, r0, r14)
            goto L144
        L138:
            int r11 = p000.C1028yo.m6953(r14)
            int r0 = p000.C1028yo.m6952(r14)
            long r14 = p000.C1028yo.m6946(r11, r0, r14)
        L144:
            ch1 r11 = r13.mo2146(r14)
            int r13 = r11.f2115
            int r14 = r11.f2116
            t0 r15 = new t0
            r0 = 1
            r15.<init>(r11, r0)
            kz r11 = p000.C0493kz.f6332
            qx0 r11 = r12.mo1612(r13, r14, r11, r15)
            return r11
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: ф */
    public final boolean mo1140() {
            r0 = this;
            r0 = 0
            return r0
    }
}
