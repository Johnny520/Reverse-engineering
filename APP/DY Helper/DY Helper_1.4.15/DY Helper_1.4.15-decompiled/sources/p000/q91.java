package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class q91 {

    /* JADX INFO: renamed from: α */
    public java.lang.String f8912;

    /* JADX INFO: renamed from: β */
    public p000.w32 f8913;

    /* JADX INFO: renamed from: γ */
    public p000.f50 f8914;

    /* JADX INFO: renamed from: δ */
    public int f8915;

    /* JADX INFO: renamed from: ε */
    public boolean f8916;

    /* JADX INFO: renamed from: ζ */
    public int f8917;

    /* JADX INFO: renamed from: η */
    public int f8918;

    /* JADX INFO: renamed from: θ */
    public long f8919;

    /* JADX INFO: renamed from: ι */
    public p000.InterfaceC1031yr f8920;

    /* JADX INFO: renamed from: κ */
    public p000.C0783s2 f8921;

    /* JADX INFO: renamed from: λ */
    public boolean f8922;

    /* JADX INFO: renamed from: μ */
    public long f8923;

    /* JADX INFO: renamed from: ν */
    public p000.n01 f8924;

    /* JADX INFO: renamed from: ξ */
    public p000.o91 f8925;

    /* JADX INFO: renamed from: ο */
    public p000.np0 f8926;

    /* JADX INFO: renamed from: π */
    public long f8927;

    /* JADX INFO: renamed from: ρ */
    public long f8928;

    public q91(java.lang.String r1, p000.w32 r2, p000.f50 r3, int r4, boolean r5, int r6, int r7) {
            r0 = this;
            r0.<init>()
            r0.f8912 = r1
            r0.f8913 = r2
            r0.f8914 = r3
            r0.f8915 = r4
            r0.f8916 = r5
            r0.f8917 = r6
            r0.f8918 = r7
            long r1 = p000.em0.f3592
            r0.f8919 = r1
            r1 = 0
            long r2 = (long) r1
            r4 = 32
            long r4 = r2 << r4
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            long r2 = r2 | r4
            r0.f8923 = r2
            long r1 = p000.AbstractC1065zo.m7213(r1, r1, r1, r1)
            r0.f8927 = r1
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ParagraphLayoutCache(paragraph="
            r0.<init>(r1)
            s2 r1 = r3.f8921
            if (r1 == 0) goto Le
            java.lang.String r1 = "<paragraph>"
            goto L10
        Le:
            java.lang.String r1 = "null"
        L10:
            r0.append(r1)
            java.lang.String r1 = ", lastDensity="
            r0.append(r1)
            long r1 = r3.f8919
            java.lang.String r1 = p000.em0.m1936(r1)
            r0.append(r1)
            java.lang.String r1 = ", history="
            r0.append(r1)
            long r1 = r3.f8928
            r0.append(r1)
            java.lang.String r3 = ", constraints=$)"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final boolean m4814(long r21, p000.np0 r23) {
            r20 = this;
            r0 = r20
            r1 = r23
            long r2 = r0.f8928
            r4 = 2
            long r2 = r2 << r4
            r5 = 3
            long r2 = r2 | r5
            r0.f8928 = r2
            int r2 = r0.f8918
            r3 = 1
            if (r2 <= r3) goto L93
            w32 r2 = r0.f8913
            n01 r5 = r0.f8924
            yr r6 = r0.f8920
            r6.getClass()
            f50 r7 = r0.f8914
            n01 r2 = p000.jx0.m3011(r5, r1, r2, r6, r7)
            r0.f8924 = r2
            int r5 = r0.f8918
            zr r10 = r2.f7343
            float r6 = r2.f7347
            float r7 = r2.f7346
            boolean r8 = java.lang.Float.isNaN(r6)
            r13 = 0
            if (r8 != 0) goto L38
            boolean r8 = java.lang.Float.isNaN(r7)
            if (r8 == 0) goto L67
        L38:
            java.lang.String r6 = p000.o01.f7854
            w32 r7 = r2.f7345
            r14 = 15
            long r8 = p000.AbstractC1065zo.m7208(r13, r13, r14)
            f50 r11 = r2.f7344
            r12 = 1
            s2 r6 = p000.p91.m4415(r6, r7, r8, r10, r11, r12)
            float r15 = r6.m5353()
            java.lang.String r6 = p000.o01.f7855
            w32 r7 = r2.f7345
            long r8 = p000.AbstractC1065zo.m7208(r13, r13, r14)
            f50 r11 = r2.f7344
            r12 = 2
            s2 r6 = p000.p91.m4415(r6, r7, r8, r10, r11, r12)
            float r6 = r6.m5353()
            float r7 = r6 - r15
            r2.f7347 = r15
            r2.f7346 = r7
            r6 = r15
        L67:
            r2 = 1
            if (r5 == r2) goto L7e
            int r5 = r5 - r2
            float r2 = (float) r5
            float r7 = r7 * r2
            float r7 = r7 + r6
            int r2 = java.lang.Math.round(r7)
            if (r2 >= 0) goto L75
            goto L76
        L75:
            r13 = r2
        L76:
            int r2 = p000.C1028yo.m6952(r21)
            if (r13 <= r2) goto L82
            r13 = r2
            goto L82
        L7e:
            int r13 = p000.C1028yo.m6954(r21)
        L82:
            int r2 = p000.C1028yo.m6952(r21)
            int r5 = p000.C1028yo.m6955(r21)
            int r6 = p000.C1028yo.m6953(r21)
            long r5 = p000.AbstractC1065zo.m7207(r5, r6, r13, r2)
            goto L95
        L93:
            r5 = r21
        L95:
            s2 r2 = r0.f8921
            r7 = 3
            r8 = 0
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r11 = 32
            if (r2 != 0) goto La4
            goto L147
        La4:
            o91 r12 = r0.f8925
            if (r12 != 0) goto Laa
            goto L147
        Laa:
            boolean r12 = r12.mo807()
            if (r12 == 0) goto Lb2
            goto L147
        Lb2:
            np0 r12 = r0.f8926
            if (r1 == r12) goto Lb8
            goto L147
        Lb8:
            long r12 = r0.f8927
            boolean r12 = p000.C1028yo.m6947(r5, r12)
            if (r12 == 0) goto Lc1
            goto Lf0
        Lc1:
            int r12 = p000.C1028yo.m6953(r5)
            long r13 = r0.f8927
            int r13 = p000.C1028yo.m6953(r13)
            if (r12 == r13) goto Lcf
            goto L147
        Lcf:
            int r12 = p000.C1028yo.m6955(r5)
            long r13 = r0.f8927
            int r13 = p000.C1028yo.m6955(r13)
            if (r12 == r13) goto Ldc
            goto L147
        Ldc:
            int r12 = p000.C1028yo.m6952(r5)
            float r12 = (float) r12
            float r13 = r2.m5353()
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 < 0) goto L147
            k32 r2 = r2.f9684
            boolean r2 = r2.f5737
            if (r2 == 0) goto Lf0
            goto L147
        Lf0:
            long r1 = r0.f8927
            boolean r1 = p000.C1028yo.m6947(r5, r1)
            if (r1 != 0) goto L146
            s2 r1 = r0.f8921
            r1.getClass()
            w2 r2 = r1.f9681
            pp0 r2 = r2.f11540
            float r2 = r2.m4565()
            float r4 = r1.m5354()
            float r2 = java.lang.Math.min(r2, r4)
            int r2 = p000.v71.m6033(r2)
            float r4 = r1.m5353()
            int r4 = p000.v71.m6033(r4)
            long r12 = (long) r2
            long r12 = r12 << r11
            long r14 = (long) r4
            long r14 = r14 & r9
            long r12 = r12 | r14
            long r12 = p000.AbstractC1065zo.m7210(r5, r12)
            r0.f8923 = r12
            int r2 = r0.f8915
            if (r2 != r7) goto L129
            goto L141
        L129:
            long r14 = r12 >> r11
            int r2 = (int) r14
            float r2 = (float) r2
            float r4 = r1.m5354()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L142
            long r9 = r9 & r12
            int r2 = (int) r9
            float r2 = (float) r2
            float r1 = r1.m5353()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto L141
            goto L142
        L141:
            r3 = r8
        L142:
            r0.f8922 = r3
            r0.f8927 = r5
        L146:
            return r8
        L147:
            o91 r2 = r0.f8925
            if (r2 == 0) goto L155
            np0 r12 = r0.f8926
            if (r1 != r12) goto L155
            boolean r12 = r2.mo807()
            if (r12 == 0) goto L174
        L155:
            r0.f8926 = r1
            java.lang.String r14 = r0.f8912
            w32 r2 = r0.f8913
            w32 r15 = p000.j81.m2887(r2, r1)
            yr r1 = r0.f8920
            r1.getClass()
            f50 r2 = r0.f8914
            w2 r13 = new w2
            jz r16 = p000.C0450jz.f5672
            r17 = r16
            r19 = r1
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r2 = r13
        L174:
            r0.f8925 = r2
            boolean r1 = r0.f8916
            int r12 = r0.f8915
            float r13 = r2.mo808()
            long r18 = p000.kn0.m3376(r5, r1, r12, r13)
            boolean r1 = r0.f8916
            int r12 = r0.f8915
            int r13 = r0.f8917
            if (r1 != 0) goto L197
            if (r12 != r4) goto L18d
            goto L194
        L18d:
            r1 = 4
            if (r12 != r1) goto L191
            goto L194
        L191:
            r1 = 5
            if (r12 != r1) goto L197
        L194:
            r16 = r3
            goto L19c
        L197:
            if (r13 >= r3) goto L19a
            goto L194
        L19a:
            r16 = r13
        L19c:
            s2 r14 = new s2
            r15 = r2
            w2 r15 = (p000.C0932w2) r15
            r17 = r12
            r14.<init>(r15, r16, r17, r18)
            r0.f8927 = r5
            float r1 = r14.m5354()
            int r1 = p000.v71.m6033(r1)
            float r2 = r14.m5353()
            int r2 = p000.v71.m6033(r2)
            long r12 = (long) r1
            long r12 = r12 << r11
            long r1 = (long) r2
            long r1 = r1 & r9
            long r1 = r1 | r12
            long r1 = p000.AbstractC1065zo.m7210(r5, r1)
            r0.f8923 = r1
            int r4 = r0.f8915
            if (r4 != r7) goto L1c8
            goto L1e0
        L1c8:
            long r4 = r1 >> r11
            int r4 = (int) r4
            float r4 = (float) r4
            float r5 = r14.m5354()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L1df
            long r1 = r1 & r9
            int r1 = (int) r1
            float r1 = (float) r1
            float r2 = r14.m5353()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L1e0
        L1df:
            r8 = r3
        L1e0:
            r0.f8922 = r8
            r0.f8921 = r14
            return r3
    }

    /* JADX INFO: renamed from: β */
    public final void m4815() {
            r7 = this;
            r0 = 0
            r7.f8921 = r0
            r7.f8925 = r0
            r7.f8926 = r0
            r0 = 0
            long r1 = p000.AbstractC1065zo.m7213(r0, r0, r0, r0)
            r7.f8927 = r1
            long r1 = (long) r0
            r3 = 32
            long r3 = r1 << r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
            long r1 = r1 | r3
            r7.f8923 = r1
            r7.f8922 = r0
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m4816(p000.InterfaceC1031yr r6) {
            r5 = this;
            yr r0 = r5.f8920
            if (r6 == 0) goto L13
            int r1 = p000.em0.f3593
            float r1 = r6.mo586()
            float r2 = r6.mo590()
            long r1 = p000.em0.m1935(r1, r2)
            goto L15
        L13:
            long r1 = p000.em0.f3592
        L15:
            if (r0 != 0) goto L1c
            r5.f8920 = r6
            r5.f8919 = r1
            return
        L1c:
            if (r6 == 0) goto L25
            long r3 = r5.f8919
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L25
            return
        L25:
            r5.f8920 = r6
            r5.f8919 = r1
            long r0 = r5.f8928
            r6 = 2
            long r0 = r0 << r6
            r2 = 1
            long r0 = r0 | r2
            r5.f8928 = r0
            r5.m4815()
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m4817(java.lang.String r1, p000.w32 r2, p000.f50 r3, int r4, boolean r5, int r6, int r7) {
            r0 = this;
            r0.f8912 = r1
            r0.f8913 = r2
            r0.f8914 = r3
            r0.f8915 = r4
            r0.f8916 = r5
            r0.f8917 = r6
            r0.f8918 = r7
            long r1 = r0.f8928
            r3 = 2
            long r1 = r1 << r3
            r3 = 2
            long r1 = r1 | r3
            r0.f8928 = r1
            r0.m4815()
            return
    }
}
