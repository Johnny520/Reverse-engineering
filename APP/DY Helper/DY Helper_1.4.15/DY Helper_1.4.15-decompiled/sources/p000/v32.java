package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class v32 extends p000.q01 implements p000.qp0, p000.InterfaceC0092bw, p000.zr1 {

    /* JADX INFO: renamed from: Α */
    public int f11090;

    /* JADX INFO: renamed from: Β */
    public java.util.HashMap f11091;

    /* JADX INFO: renamed from: Γ */
    public p000.q91 f11092;

    /* JADX INFO: renamed from: Δ */
    public p000.w32 f11093;

    /* JADX INFO: renamed from: Ε */
    public p000.t32 f11094;

    /* JADX INFO: renamed from: Ζ */
    public p000.u32 f11095;

    /* JADX INFO: renamed from: τ */
    public java.lang.String f11096;

    /* JADX INFO: renamed from: υ */
    public p000.w32 f11097;

    /* JADX INFO: renamed from: φ */
    public p000.f50 f11098;

    /* JADX INFO: renamed from: χ */
    public int f11099;

    /* JADX INFO: renamed from: ψ */
    public boolean f11100;

    /* JADX INFO: renamed from: ω */
    public int f11101;

    @Override // p000.InterfaceC0092bw
    /* JADX INFO: renamed from: Μ */
    public final void mo604(p000.aq0 r15) {
            r14 = this;
            boolean r0 = r14.f8784
            if (r0 != 0) goto L6
            goto Leb
        L6:
            u32 r0 = r14.f11095
            if (r0 == 0) goto L16
            boolean r1 = r0.f10583
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L16
            q91 r0 = r0.f10584
            if (r0 != 0) goto L1a
        L16:
            q91 r0 = r14.m6029()
        L1a:
            s2 r1 = r0.f8921
            if (r1 == 0) goto Lf2
            fe r15 = r15.f1284
            m6 r15 = r15.f3907
            de r2 = r15.m3787()
            boolean r15 = r0.f8922
            if (r15 == 0) goto L43
            long r3 = r0.f8923
            r0 = 32
            long r5 = r3 >> r0
            int r0 = (int) r5
            float r5 = (float) r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r0 = (int) r3
            float r6 = (float) r0
            r2.mo1729()
            r4 = 0
            r7 = 1
            r3 = 0
            r2.mo1724(r3, r4, r5, r6, r7)
        L43:
            r14.m6030()     // Catch: java.lang.Throwable -> L4d
            w32 r0 = r14.f11093     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L51
            w32 r0 = r14.f11097     // Catch: java.lang.Throwable -> L4d
            goto L51
        L4d:
            r0 = move-exception
            r14 = r0
            goto Lec
        L51:
            ux1 r14 = r0.f11556     // Catch: java.lang.Throwable -> L4d
            ux1 r0 = r0.f11556     // Catch: java.lang.Throwable -> L4d
            c32 r3 = r14.f11008     // Catch: java.lang.Throwable -> L4d
            if (r3 != 0) goto L5b
            c32 r3 = p000.c32.f1958     // Catch: java.lang.Throwable -> L4d
        L5b:
            fv1 r4 = r14.f11009     // Catch: java.lang.Throwable -> L4d
            if (r4 != 0) goto L61
            fv1 r4 = p000.fv1.f4142     // Catch: java.lang.Throwable -> L4d
        L61:
            kn0 r5 = r14.f11010     // Catch: java.lang.Throwable -> L4d
            if (r5 != 0) goto L67
            t30 r5 = p000.t30.f10165     // Catch: java.lang.Throwable -> L4d
        L67:
            f32 r14 = r14.f10996     // Catch: java.lang.Throwable -> L4d
            kn0 r14 = r14.mo2034()     // Catch: java.lang.Throwable -> L4d
            if (r14 == 0) goto Lae
            f32 r0 = r0.f10996     // Catch: java.lang.Throwable -> L4d
            float r0 = r0.mo2035()     // Catch: java.lang.Throwable -> L4d
            w2 r6 = r1.f9681     // Catch: java.lang.Throwable -> L4d
            d3 r6 = r6.f11538     // Catch: java.lang.Throwable -> L4d
            int r7 = r6.f2870     // Catch: java.lang.Throwable -> L4d
            float r8 = r1.m5354()     // Catch: java.lang.Throwable -> L4d
            float r9 = r1.m5353()     // Catch: java.lang.Throwable -> L4d
            int r8 = java.lang.Float.floatToRawIntBits(r8)     // Catch: java.lang.Throwable -> L4d
            long r10 = (long) r8     // Catch: java.lang.Throwable -> L4d
            int r8 = java.lang.Float.floatToRawIntBits(r9)     // Catch: java.lang.Throwable -> L4d
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L4d
            r12 = 32
            long r10 = r10 << r12
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r12
            long r8 = r8 | r10
            r6.m1642(r14, r8, r0)     // Catch: java.lang.Throwable -> L4d
            r6.m1645(r4)     // Catch: java.lang.Throwable -> L4d
            r6.m1646(r3)     // Catch: java.lang.Throwable -> L4d
            r6.m1644(r5)     // Catch: java.lang.Throwable -> L4d
            r14 = 3
            r6.m1641(r14)     // Catch: java.lang.Throwable -> L4d
            r1.m5355(r2)     // Catch: java.lang.Throwable -> L4d
            r6.m1641(r7)     // Catch: java.lang.Throwable -> L4d
            goto Le6
        Lae:
            long r6 = p000.C0114ci.f2125     // Catch: java.lang.Throwable -> L4d
            r8 = 16
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 == 0) goto Lb7
            goto Lca
        Lb7:
            f32 r14 = r0.f10996     // Catch: java.lang.Throwable -> L4d
            long r6 = r14.mo2033()     // Catch: java.lang.Throwable -> L4d
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 == 0) goto Lc8
            f32 r14 = r0.f10996     // Catch: java.lang.Throwable -> L4d
            long r6 = r14.mo2033()     // Catch: java.lang.Throwable -> L4d
            goto Lca
        Lc8:
            long r6 = p000.C0114ci.f2120     // Catch: java.lang.Throwable -> L4d
        Lca:
            w2 r14 = r1.f9681     // Catch: java.lang.Throwable -> L4d
            d3 r14 = r14.f11538     // Catch: java.lang.Throwable -> L4d
            int r0 = r14.f2870     // Catch: java.lang.Throwable -> L4d
            r14.m1643(r6)     // Catch: java.lang.Throwable -> L4d
            r14.m1645(r4)     // Catch: java.lang.Throwable -> L4d
            r14.m1646(r3)     // Catch: java.lang.Throwable -> L4d
            r14.m1644(r5)     // Catch: java.lang.Throwable -> L4d
            r3 = 3
            r14.m1641(r3)     // Catch: java.lang.Throwable -> L4d
            r1.m5355(r2)     // Catch: java.lang.Throwable -> L4d
            r14.m1641(r0)     // Catch: java.lang.Throwable -> L4d
        Le6:
            if (r15 == 0) goto Leb
            r2.mo1727()
        Leb:
            return
        Lec:
            if (r15 == 0) goto Lf1
            r2.mo1727()
        Lf1:
            throw r14
        Lf2:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache="
            r15.<init>(r0)
            q91 r0 = r14.f11092
            r15.append(r0)
            java.lang.String r0 = ", textSubstitution="
            r15.append(r0)
            u32 r14 = r14.f11095
            r15.append(r14)
            r14 = 41
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            p000.dm0.m1780(r14)
            pm r14 = new pm
            r14.<init>()
            throw r14
    }

    @Override // p000.qp0
    /* JADX INFO: renamed from: Φ */
    public final p000.qx0 mo605(p000.dw0 r9, p000.kx0 r10, long r11) {
            r8 = this;
            java.lang.String r0 = "TextStringSimpleNode::measure"
            android.os.Trace.beginSection(r0)
            boolean r0 = r8.m6030()     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto L25
            w32 r0 = r8.f11093     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto L11
            w32 r0 = r8.f11097     // Catch: java.lang.Throwable -> Lb9
        L11:
            r2 = r0
            q91 r0 = r8.m6029()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r1 = r8.f11096     // Catch: java.lang.Throwable -> Lb9
            f50 r3 = r8.f11098     // Catch: java.lang.Throwable -> Lb9
            int r4 = r8.f11099     // Catch: java.lang.Throwable -> Lb9
            boolean r5 = r8.f11100     // Catch: java.lang.Throwable -> Lb9
            int r6 = r8.f11101     // Catch: java.lang.Throwable -> Lb9
            int r7 = r8.f11090     // Catch: java.lang.Throwable -> Lb9
            r0.m4817(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb9
        L25:
            u32 r0 = r8.f11095     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto L35
            boolean r1 = r0.f10583     // Catch: java.lang.Throwable -> Lb9
            if (r1 == 0) goto L2e
            goto L2f
        L2e:
            r0 = 0
        L2f:
            if (r0 == 0) goto L35
            q91 r0 = r0.f10584     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto L39
        L35:
            q91 r0 = r8.m6029()     // Catch: java.lang.Throwable -> Lb9
        L39:
            r0.m4816(r9)     // Catch: java.lang.Throwable -> Lb9
            np0 r1 = r9.getLayoutDirection()     // Catch: java.lang.Throwable -> Lb9
            boolean r11 = r0.m4814(r11, r1)     // Catch: java.lang.Throwable -> Lb9
            o91 r12 = r0.f8925     // Catch: java.lang.Throwable -> Lb9
            if (r12 == 0) goto L4b
            r12.mo807()     // Catch: java.lang.Throwable -> Lb9
        L4b:
            s2 r12 = r0.f8921     // Catch: java.lang.Throwable -> Lb9
            r12.getClass()     // Catch: java.lang.Throwable -> Lb9
            k32 r12 = r12.f9684     // Catch: java.lang.Throwable -> Lb9
            long r0 = r0.f8923     // Catch: java.lang.Throwable -> Lb9
            if (r11 == 0) goto L90
            r11 = 2
            q31 r2 = p000.h62.m2443(r8, r11)     // Catch: java.lang.Throwable -> Lb9
            r2.m4743()     // Catch: java.lang.Throwable -> Lb9
            java.util.HashMap r2 = r8.f11091     // Catch: java.lang.Throwable -> Lb9
            if (r2 != 0) goto L69
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lb9
            r2.<init>(r11)     // Catch: java.lang.Throwable -> Lb9
            r8.f11091 = r2     // Catch: java.lang.Throwable -> Lb9
        L69:
            re0 r11 = p000.AbstractC0001a0.f2     // Catch: java.lang.Throwable -> Lb9
            r3 = 0
            float r3 = r12.m3150(r3)     // Catch: java.lang.Throwable -> Lb9
            int r3 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lb9
            r2.put(r11, r3)     // Catch: java.lang.Throwable -> Lb9
            re0 r11 = p000.AbstractC0001a0.f3     // Catch: java.lang.Throwable -> Lb9
            int r3 = r12.f5739     // Catch: java.lang.Throwable -> Lb9
            int r3 = r3 + (-1)
            float r12 = r12.m3150(r3)     // Catch: java.lang.Throwable -> Lb9
            int r12 = java.lang.Math.round(r12)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> Lb9
            r2.put(r11, r12)     // Catch: java.lang.Throwable -> Lb9
        L90:
            r11 = 32
            long r11 = r0 >> r11
            int r3 = (int) r11     // Catch: java.lang.Throwable -> Lb9
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r0
            int r4 = (int) r11     // Catch: java.lang.Throwable -> Lb9
            long r11 = p000.AbstractC1021yh.m6853(r3, r3, r4, r4)     // Catch: java.lang.Throwable -> Lb9
            ch1 r10 = r10.mo2146(r11)     // Catch: java.lang.Throwable -> Lb9
            java.util.HashMap r5 = r8.f11091     // Catch: java.lang.Throwable -> Lb9
            r5.getClass()     // Catch: java.lang.Throwable -> Lb9
            v30 r7 = new v30     // Catch: java.lang.Throwable -> Lb9
            r8 = 2
            r7.<init>(r10, r8)     // Catch: java.lang.Throwable -> Lb9
            r6 = 0
            r2 = r9
            qx0 r8 = r2.mo1609(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb9
            android.os.Trace.endSection()
            return r8
        Lb9:
            r0 = move-exception
            r8 = r0
            android.os.Trace.endSection()
            throw r8
    }

    @Override // p000.zr1
    /* JADX INFO: renamed from: Ω */
    public final void mo600(p000.js1 r8) {
            r7 = this;
            t32 r0 = r7.f11094
            if (r0 != 0) goto Lc
            t32 r0 = new t32
            r1 = 0
            r0.<init>(r7, r1)
            r7.f11094 = r0
        Lc:
            g4 r1 = new g4
            java.lang.String r2 = r7.f11096
            r1.<init>(r2)
            so0[] r2 = p000.hs1.f4798
            is1 r2 = p000.fs1.f4085
            java.util.List r1 = p000.AbstractC1021yh.m6896(r1)
            r8.mo2579(r2, r1)
            u32 r1 = r7.f11095
            r2 = 17
            if (r1 == 0) goto L43
            boolean r3 = r1.f10583
            is1 r4 = p000.fs1.f4087
            so0[] r5 = p000.hs1.f4798
            r6 = r5[r2]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r8.mo2579(r4, r3)
            g4 r3 = new g4
            java.lang.String r1 = r1.f10582
            r3.<init>(r1)
            is1 r1 = p000.fs1.f4086
            r4 = 16
            r4 = r5[r4]
            r8.mo2579(r1, r3)
        L43:
            t32 r1 = new t32
            r3 = 1
            r1.<init>(r7, r3)
            is1 r3 = p000.wr1.f11822
            м r4 = new м
            r5 = 0
            r4.<init>(r5, r1)
            r8.mo2579(r3, r4)
            t32 r1 = new t32
            r3 = 2
            r1.<init>(r7, r3)
            is1 r3 = p000.wr1.f11823
            м r4 = new м
            r4.<init>(r5, r1)
            r8.mo2579(r3, r4)
            η r1 = new η
            r1.<init>(r2, r7)
            is1 r7 = p000.wr1.f11824
            м r2 = new м
            r2.<init>(r5, r1)
            r8.mo2579(r7, r2)
            is1 r7 = p000.wr1.f11812
            м r1 = new м
            r1.<init>(r5, r0)
            r8.mo2579(r7, r1)
            return
    }

    /* JADX INFO: renamed from: В */
    public final p000.q91 m6029() {
            r9 = this;
            w32 r0 = r9.f11093
            if (r0 != 0) goto L6
            w32 r0 = r9.f11097
        L6:
            r3 = r0
            q91 r0 = r9.f11092
            if (r0 != 0) goto L1e
            q91 r1 = new q91
            java.lang.String r2 = r9.f11096
            f50 r4 = r9.f11098
            int r5 = r9.f11099
            boolean r6 = r9.f11100
            int r7 = r9.f11101
            int r8 = r9.f11090
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.f11092 = r1
        L1e:
            q91 r9 = r9.f11092
            r9.getClass()
            return r9
    }

    /* JADX INFO: renamed from: Г */
    public final boolean m6030() {
            r13 = this;
            w32 r0 = r13.f11093
            w32 r1 = r13.f11097
            q01 r2 = r13.f8771
            boolean r2 = r2.f8784
            if (r2 != 0) goto Lf
            java.lang.String r2 = "visitAncestors called on an unattached node"
            p000.am0.m178(r2)
        Lf:
            q01 r2 = r13.f8771
            q01 r2 = r2.f8775
            yp0 r3 = p000.h62.m2445(r13)
        L17:
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L8f
            k31 r6 = r3.f12733
            q01 r6 = r6.f5729
            int r6 = r6.f8774
            r7 = 262144(0x40000, float:3.67342E-40)
            r6 = r6 & r7
            r8 = 0
            if (r6 == 0) goto L80
        L27:
            if (r2 == 0) goto L80
            int r6 = r2.f8773
            r6 = r6 & r7
            if (r6 == 0) goto L7d
            r6 = r2
            r9 = r8
        L30:
            if (r6 == 0) goto L7d
            boolean r10 = r6 instanceof p000.x52
            if (r10 == 0) goto L42
            x52 r6 = (p000.x52) r6
            java.lang.Object r6 = r6.mo3887()
            java.lang.String r10 = "StyleOuterNode"
            r10.equals(r6)
            goto L78
        L42:
            int r10 = r6.f8773
            r10 = r10 & r7
            if (r10 == 0) goto L78
            boolean r10 = r6 instanceof p000.C1014ya
            if (r10 == 0) goto L78
            r10 = r6
            ya r10 = (p000.C1014ya) r10
            q01 r10 = r10.f12512
            r11 = r4
        L51:
            if (r10 == 0) goto L75
            int r12 = r10.f8773
            r12 = r12 & r7
            if (r12 == 0) goto L72
            int r11 = r11 + 1
            if (r11 != r5) goto L5e
            r6 = r10
            goto L72
        L5e:
            if (r9 != 0) goto L69
            k21 r9 = new k21
            r12 = 16
            q01[] r12 = new p000.q01[r12]
            r9.<init>(r12)
        L69:
            if (r6 == 0) goto L6f
            r9.m3127(r6)
            r6 = r8
        L6f:
            r9.m3127(r10)
        L72:
            q01 r10 = r10.f8776
            goto L51
        L75:
            if (r11 != r5) goto L78
            goto L30
        L78:
            q01 r6 = p000.h62.m2387(r9)
            goto L30
        L7d:
            q01 r2 = r2.f8775
            goto L27
        L80:
            yp0 r3 = r3.m7005()
            if (r3 == 0) goto L8d
            k31 r2 = r3.f12733
            if (r2 == 0) goto L8d
            q22 r2 = r2.f5728
            goto L17
        L8d:
            r2 = r8
            goto L17
        L8f:
            r13.f11093 = r1
            if (r0 != 0) goto L94
            return r4
        L94:
            boolean r13 = r0.equals(r1)
            r13 = r13 ^ r5
            return r13
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: ф */
    public final boolean mo1140() {
            r0 = this;
            r0 = 0
            return r0
    }
}
