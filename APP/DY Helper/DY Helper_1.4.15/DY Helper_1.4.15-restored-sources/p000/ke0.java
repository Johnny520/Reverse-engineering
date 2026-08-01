package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ke0 {

    /* JADX INFO: renamed from: α */
    public final p000.mp0 f5867;

    /* JADX INFO: renamed from: β */
    public boolean f5868;

    /* JADX INFO: renamed from: γ */
    public boolean f5869;

    /* JADX INFO: renamed from: δ */
    public boolean f5870;

    /* JADX INFO: renamed from: ε */
    public boolean f5871;

    /* JADX INFO: renamed from: ζ */
    public final p000.v11 f5872;

    /* JADX INFO: renamed from: η */
    public final p000.t31 f5873;

    /* JADX INFO: renamed from: θ */
    public final p000.r11 f5874;

    public ke0(p000.mp0 r2) {
            r1 = this;
            r1.<init>()
            r1.f5867 = r2
            v11 r2 = new v11
            r2.<init>()
            r1.f5872 = r2
            t31 r2 = new t31
            r2.<init>()
            r1.f5873 = r2
            r11 r2 = new r11
            r2.<init>()
            long[] r0 = p000.tq1.f10431
            r2.f9196 = r0
            long[] r0 = p000.yv0.f12838
            r2.f9197 = r0
            java.lang.Object[] r0 = p000.AbstractC1021yh.f12618
            r2.f9198 = r0
            r0 = 10
            int r0 = p000.tq1.m5734(r0)
            r2.m5047(r0)
            r1.f5874 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m3206(long r22, java.util.List r24, boolean r25) {
            r21 = this;
            r0 = r21
            r1 = r22
            int r3 = r24.size()
            t31 r4 = r0.f5873
            r5 = 1
            r9 = r4
            r8 = r5
            r7 = 0
        Le:
            r11 r10 = r0.f5874
            if (r7 >= r3) goto L92
            r12 = r24
            java.lang.Object r13 = r12.get(r7)
            q01 r13 = (p000.q01) r13
            boolean r14 = r13.f8784
            if (r14 == 0) goto L8e
            y0 r14 = new y0
            r15 = 4
            r14.<init>(r0, r15, r13)
            r13.f8783 = r14
            if (r8 == 0) goto L69
            k21 r14 = r9.f10166
            java.lang.Object[] r15 = r14.f5716
            int r14 = r14.f5718
            r11 = 0
        L2f:
            if (r11 >= r14) goto L45
            r16 = r15[r11]
            r6 = r16
            h31 r6 = (p000.h31) r6
            q01 r6 = r6.f4557
            boolean r6 = p000.ln0.m3626(r6, r13)
            if (r6 == 0) goto L42
            r11 = r16
            goto L46
        L42:
            int r11 = r11 + 1
            goto L2f
        L45:
            r11 = 0
        L46:
            h31 r11 = (p000.h31) r11
            if (r11 == 0) goto L68
            r11.f4563 = r5
            v r6 = r11.f4558
            r6.m6009(r1)
            if (r25 == 0) goto L66
            java.lang.Object r6 = r10.m5046(r1)
            if (r6 != 0) goto L61
            v11 r6 = new v11
            r6.<init>()
            r10.m5048(r1, r6)
        L61:
            v11 r6 = (p000.v11) r6
            r6.m6015(r11)
        L66:
            r9 = r11
            goto L8e
        L68:
            r8 = 0
        L69:
            h31 r6 = new h31
            r6.<init>(r13)
            v r11 = r6.f4558
            r11.m6009(r1)
            if (r25 == 0) goto L88
            java.lang.Object r11 = r10.m5046(r1)
            if (r11 != 0) goto L83
            v11 r11 = new v11
            r11.<init>()
            r10.m5048(r1, r11)
        L83:
            v11 r11 = (p000.v11) r11
            r11.m6015(r6)
        L88:
            k21 r9 = r9.f10166
            r9.m3127(r6)
            r9 = r6
        L8e:
            int r7 = r7 + 1
            goto Le
        L92:
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r5 = 7
            if (r25 == 0) goto L126
            long[] r6 = r10.f9197
            java.lang.Object[] r7 = r10.f9198
            long[] r8 = r10.f9196
            int r9 = r8.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto L126
            r11 = 0
        La6:
            r12 = r8[r11]
            long r14 = ~r12
            long r14 = r14 << r5
            long r14 = r14 & r12
            long r14 = r14 & r2
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 == 0) goto L110
            int r14 = r11 - r9
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r21 = 255(0xff, double:1.26E-321)
            r0 = 0
        Lbc:
            if (r0 >= r14) goto L108
            long r17 = r12 & r21
            r19 = 128(0x80, double:6.3E-322)
            int r1 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r1 >= 0) goto Lf1
            int r1 = r11 << 3
            int r1 = r1 + r0
            r23 = r5
            r16 = r6
            r5 = r16[r1]
            r1 = r7[r1]
            v11 r1 = (p000.v11) r1
            k21 r2 = r4.f10166
            java.lang.Object[] r3 = r2.f5716
            int r2 = r2.f5718
            r24 = r15
            r15 = 0
        Ldc:
            if (r15 >= r2) goto Lee
            r19 = r3[r15]
            r20 = r0
            r0 = r19
            h31 r0 = (p000.h31) r0
            r0.m2358(r5, r1)
            int r15 = r15 + 1
            r0 = r20
            goto Ldc
        Lee:
            r20 = r0
            goto Lf8
        Lf1:
            r23 = r5
            r16 = r6
            r24 = r15
            goto Lee
        Lf8:
            long r12 = r12 >> r24
            int r0 = r20 + 1
            r5 = r23
            r15 = r24
            r6 = r16
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto Lbc
        L108:
            r23 = r5
            r16 = r6
            r0 = r15
            if (r14 != r0) goto L124
            goto L116
        L110:
            r23 = r5
            r16 = r6
            r21 = 255(0xff, double:1.26E-321)
        L116:
            if (r11 == r9) goto L124
            int r11 = r11 + 1
            r5 = r23
            r6 = r16
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto La6
        L124:
            r0 = 0
            goto L12b
        L126:
            r23 = r5
            r21 = 255(0xff, double:1.26E-321)
            goto L124
        L12b:
            r10.f9200 = r0
            long[] r0 = r10.f9196
            long[] r1 = p000.tq1.f10431
            if (r0 == r1) goto L14e
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            p000.AbstractC0312g7.m2245(r1, r0)
            long[] r0 = r10.f9196
            int r1 = r10.f9199
            int r2 = r1 >> 3
            r1 = r1 & 7
            int r1 = r1 << 3
            r3 = r0[r2]
            long r5 = r21 << r1
            long r7 = ~r5
            long r3 = r3 & r7
            long r3 = r3 | r5
            r0[r2] = r3
        L14e:
            java.lang.Object[] r0 = r10.f9198
            int r1 = r10.f9199
            r2 = 0
            r3 = 0
            p000.AbstractC0312g7.m2244(r3, r1, r2, r0)
            int r0 = r10.f9199
            int r0 = p000.tq1.m5731(r0)
            int r1 = r10.f9200
            int r0 = r0 - r1
            r10.f9201 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public final boolean m3207(p000.C0574n5 r10, boolean r11) {
            r9 = this;
            java.lang.Object r0 = r10.f7387
            zv0 r0 = (p000.zv0) r0
            mp0 r1 = r9.f5867
            t31 r2 = r9.f5873
            boolean r0 = r2.mo2353(r0, r1, r10, r11)
            k21 r1 = r2.f10166
            r3 = 0
            if (r0 != 0) goto L12
            return r3
        L12:
            r0 = 1
            r9.f5868 = r0
            java.lang.Object[] r4 = r1.f5716
            int r5 = r1.f5718
            r6 = r3
            r7 = r6
        L1b:
            if (r6 >= r5) goto L30
            r8 = r4[r6]
            h31 r8 = (p000.h31) r8
            boolean r8 = r8.m2357(r10, r11)
            if (r8 != 0) goto L2c
            if (r7 == 0) goto L2a
            goto L2c
        L2a:
            r7 = r3
            goto L2d
        L2c:
            r7 = r0
        L2d:
            int r6 = r6 + 1
            goto L1b
        L30:
            java.lang.Object[] r11 = r1.f5716
            int r1 = r1.f5718
            r4 = r3
            r5 = r4
        L36:
            if (r4 >= r1) goto L4b
            r6 = r11[r4]
            h31 r6 = (p000.h31) r6
            boolean r6 = r6.m2356(r10)
            if (r6 != 0) goto L47
            if (r5 == 0) goto L45
            goto L47
        L45:
            r5 = r3
            goto L48
        L47:
            r5 = r0
        L48:
            int r4 = r4 + 1
            goto L36
        L4b:
            r2.mo2354(r10)
            if (r5 != 0) goto L54
            if (r7 == 0) goto L53
            goto L54
        L53:
            r0 = r3
        L54:
            r9.f5868 = r3
            boolean r10 = r9.f5871
            if (r10 == 0) goto L72
            r9.f5871 = r3
            v11 r10 = r9.f5872
            int r11 = r10.f11065
            r1 = r3
        L61:
            if (r1 >= r11) goto L6f
            java.lang.Object r4 = r10.m6020(r1)
            q01 r4 = (p000.q01) r4
            r9.m3209(r4)
            int r1 = r1 + 1
            goto L61
        L6f:
            r10.m6018()
        L72:
            boolean r10 = r9.f5869
            if (r10 == 0) goto L7b
            r9.f5869 = r3
            r9.m3208()
        L7b:
            boolean r10 = r9.f5870
            if (r10 == 0) goto L86
            r9.f5870 = r3
            k21 r9 = r2.f10166
            r9.m3132()
        L86:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final void m3208() {
            r6 = this;
            boolean r0 = r6.f5868
            r1 = 1
            if (r0 == 0) goto L8
            r6.f5869 = r1
            return
        L8:
            t31 r0 = r6.f5873
            k21 r2 = r0.f10166
            java.lang.Object[] r3 = r2.f5716
            int r2 = r2.f5718
            r4 = 0
        L11:
            if (r4 >= r2) goto L1d
            r5 = r3[r4]
            h31 r5 = (p000.h31) r5
            r5.m2355()
            int r4 = r4 + 1
            goto L11
        L1d:
            boolean r2 = r6.f5870
            if (r2 == 0) goto L24
            r6.f5870 = r1
            return
        L24:
            k21 r6 = r0.f10166
            r6.m3132()
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m3209(p000.q01 r6) {
            r5 = this;
            boolean r0 = r5.f5868
            r1 = 1
            if (r0 == 0) goto Ld
            r5.f5871 = r1
            v11 r5 = r5.f5872
            r5.m6015(r6)
            return
        Ld:
            t31 r5 = r5.f5873
            v11 r0 = r5.f10167
            r0.m6018()
            r0.m6015(r5)
        L17:
            boolean r5 = r0.m6023()
            if (r5 == 0) goto L4a
            int r5 = r0.f11065
            int r5 = r5 - r1
            java.lang.Object r5 = r0.m6025(r5)
            t31 r5 = (p000.t31) r5
            r2 = 0
        L27:
            k21 r3 = r5.f10166
            int r4 = r3.f5718
            if (r2 >= r4) goto L17
            java.lang.Object[] r3 = r3.f5716
            r3 = r3[r2]
            h31 r3 = (p000.h31) r3
            q01 r4 = r3.f4557
            boolean r4 = p000.ln0.m3626(r4, r6)
            if (r4 == 0) goto L44
            k21 r4 = r5.f10166
            r4.m3135(r3)
            r3.m2355()
            goto L27
        L44:
            r0.m6015(r3)
            int r2 = r2 + 1
            goto L27
        L4a:
            return
    }
}
