package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class rk0 implements p000.m31, p000.rc0, p000.mh1, p000.hj1, p000.zq1 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9394;

    public /* synthetic */ rk0(int r1) {
            r0 = this;
            r0.f9394 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ rk0(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f9394 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ι */
    public static final java.lang.String m5101(p000.C0208dd r19, p000.C0208dd[] r20, int r21) {
            r0 = r19
            r1 = r20
            dd r2 = p000.bk1.f1768
            int r2 = r0.mo1701()
            r4 = 0
        Lb:
            if (r4 >= r2) goto La4
            int r5 = r4 + r2
            int r5 = r5 / 2
        L11:
            r6 = 10
            r7 = -1
            if (r5 <= r7) goto L1f
            byte r8 = r0.mo1704(r5)
            if (r8 == r6) goto L1f
            int r5 = r5 + (-1)
            goto L11
        L1f:
            int r8 = r5 + 1
            r9 = 1
            r10 = r9
        L23:
            int r11 = r8 + r10
            byte r12 = r0.mo1704(r11)
            if (r12 == r6) goto L2e
            int r10 = r10 + 1
            goto L23
        L2e:
            int r6 = r11 - r8
            r12 = r21
            r10 = 0
            r13 = 0
            r14 = 0
        L35:
            if (r10 == 0) goto L3b
            r10 = 46
            r15 = 0
            goto L4a
        L3b:
            r15 = r1[r12]
            byte r15 = r15.mo1704(r13)
            byte[] r16 = p000.sd2.f9867
            r15 = r15 & 255(0xff, float:3.57E-43)
            r18 = r15
            r15 = r10
            r10 = r18
        L4a:
            int r3 = r8 + r14
            byte r3 = r0.mo1704(r3)
            byte[] r17 = p000.sd2.f9867
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r10 = r10 - r3
            if (r10 != 0) goto L71
            int r14 = r14 + 1
            int r13 = r13 + 1
            if (r14 == r6) goto L71
            r3 = r1[r12]
            int r3 = r3.mo1701()
            if (r3 != r13) goto L6f
            int r3 = r1.length
            int r3 = r3 - r9
            if (r12 != r3) goto L6a
            goto L71
        L6a:
            int r12 = r12 + 1
            r13 = r7
            r10 = r9
            goto L35
        L6f:
            r10 = r15
            goto L35
        L71:
            if (r10 >= 0) goto L75
        L73:
            r2 = r5
            goto Lb
        L75:
            if (r10 <= 0) goto L7a
        L77:
            int r4 = r11 + 1
            goto Lb
        L7a:
            int r3 = r6 - r14
            r7 = r1[r12]
            int r7 = r7.mo1701()
            int r7 = r7 - r13
            int r12 = r12 + 1
            int r9 = r1.length
        L86:
            if (r12 >= r9) goto L92
            r10 = r1[r12]
            int r10 = r10.mo1701()
            int r7 = r7 + r10
            int r12 = r12 + 1
            goto L86
        L92:
            if (r7 >= r3) goto L95
            goto L73
        L95:
            if (r7 <= r3) goto L98
            goto L77
        L98:
            int r6 = r6 + r8
            dd r0 = r0.mo1708(r8, r6)
            java.nio.charset.Charset r1 = p000.AbstractC0547mf.f7105
            java.lang.String r0 = r0.mo1707(r1)
            return r0
        La4:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static final java.lang.Long m5102(java.lang.Long r5) {
            r0 = 0
            if (r5 == 0) goto L26
            long r1 = r5.longValue()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto Le
            goto Lf
        Le:
            r5 = r0
        Lf:
            if (r5 == 0) goto L26
            long r0 = r5.longValue()
            r2 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L21
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
        L21:
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            return r5
        L26:
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static final void m5103(p000.rk0 r8) {
            f02 r0 = p000.kl1.f5999
        L2:
            f02 r0 = p000.kl1.f5999
            java.lang.Object r1 = r0.getValue()
            oa1 r1 = (p000.oa1) r1
            ga1 r2 = r1.f8014
            java.lang.Object r3 = r2.get(r8)
            is0 r3 = (p000.is0) r3
            if (r3 != 0) goto L16
            r3 = r1
            goto L78
        L16:
            java.lang.Object r4 = r3.f5176
            java.lang.Object r3 = r3.f5177
            z52 r5 = r2.f4297
            r6 = 0
            if (r8 == 0) goto L24
            int r7 = r8.hashCode()
            goto L25
        L24:
            r7 = r6
        L25:
            z52 r6 = r5.m7112(r7, r6, r8)
            if (r5 != r6) goto L2c
            goto L3b
        L2c:
            if (r6 != 0) goto L31
            ga1 r2 = p000.ga1.f4296
            goto L3b
        L31:
            ga1 r5 = new ga1
            int r2 = r2.f4298
            int r2 = r2 + (-1)
            r5.<init>(r6, r2)
            r2 = r5
        L3b:
            x r5 = p000.C0966x.f11929
            if (r4 == r5) goto L53
            java.lang.Object r6 = r2.get(r4)
            r6.getClass()
            is0 r6 = (p000.is0) r6
            is0 r7 = new is0
            java.lang.Object r6 = r6.f5176
            r7.<init>(r6, r3)
            ga1 r2 = r2.m2295(r4, r7)
        L53:
            if (r3 == r5) goto L69
            java.lang.Object r6 = r2.get(r3)
            r6.getClass()
            is0 r6 = (p000.is0) r6
            is0 r7 = new is0
            java.lang.Object r6 = r6.f5177
            r7.<init>(r4, r6)
            ga1 r2 = r2.m2295(r3, r7)
        L69:
            if (r4 == r5) goto L6e
            java.lang.Object r6 = r1.f8012
            goto L6f
        L6e:
            r6 = r3
        L6f:
            if (r3 == r5) goto L73
            java.lang.Object r4 = r1.f8013
        L73:
            oa1 r3 = new oa1
            r3.<init>(r6, r4, r2)
        L78:
            if (r1 == r3) goto L85
            uy r2 = p000.AbstractC0978xb.f12108
            if (r1 != 0) goto L7f
            r1 = r2
        L7f:
            boolean r0 = r0.m1988(r1, r3)
            if (r0 == 0) goto L2
        L85:
            return
    }

    /* JADX INFO: renamed from: μ */
    public static java.util.ArrayList m5104(java.util.List r4) {
            r4.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        Lc:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r4.next()
            r2 = r1
            zj1 r2 = (p000.zj1) r2
            zj1 r3 = p000.zj1.f13130
            if (r2 == r3) goto Lc
            r0.add(r1)
            goto Lc
        L21:
            java.util.ArrayList r4 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r0, r1)
            r4.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()
            zj1 r1 = (p000.zj1) r1
            java.lang.String r1 = r1.f13138
            r4.add(r1)
            goto L30
        L42:
            return r4
    }

    /* JADX INFO: renamed from: ν */
    public static byte[] m5105(java.util.List r3) {
            r3.getClass()
            sc r0 = new sc
            r0.<init>()
            java.util.ArrayList r3 = m5104(r3)
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r0.m5466(r2)
            r0.m5451(r1)
            goto L10
        L27:
            long r1 = r0.f9828
            byte[] r3 = r0.m5457(r1)
            return r3
    }

    /* JADX INFO: renamed from: ξ */
    public static p000.zj1 m5106(java.lang.String r2) {
            java.lang.String r0 = "http/1.0"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            zj1 r2 = p000.zj1.f13130
            return r2
        Lb:
            java.lang.String r0 = "http/1.1"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L16
            zj1 r2 = p000.zj1.f13131
            return r2
        L16:
            java.lang.String r0 = "h2_prior_knowledge"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L21
            zj1 r2 = p000.zj1.f13134
            return r2
        L21:
            java.lang.String r0 = "h2"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2c
            zj1 r2 = p000.zj1.f13133
            return r2
        L2c:
            java.lang.String r0 = "spdy/3.1"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L37
            zj1 r2 = p000.zj1.f13132
            return r2
        L37:
            java.lang.String r0 = "quic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L42
            zj1 r2 = p000.zj1.f13135
            return r2
        L42:
            java.lang.String r0 = "h3"
            r1 = 0
            boolean r0 = p000.x02.m6485(r2, r0, r1)
            if (r0 == 0) goto L4e
            zj1 r2 = p000.zj1.f13136
            return r2
        L4e:
            java.lang.String r0 = "Unexpected protocol: "
            java.lang.String r2 = r0.concat(r2)
            p000.C1080.m7281(r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ο */
    private final void m5107() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: π */
    private final void m5108(int r1, java.lang.Object r2) {
            r0 = this;
            return
    }

    @Override // p000.zq1
    public void onScrollLimit(int r1, int r2, int r3, boolean r4) {
            r0 = this;
            return
    }

    @Override // p000.zq1
    public void onScrollProgress(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f9394
            switch(r0) {
                case 29: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.String r1 = "SharingStarted.Eagerly"
            return r1
    }

    @Override // p000.m31
    /* JADX INFO: renamed from: α */
    public boolean mo3477(p000.q01 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.m31
    /* JADX INFO: renamed from: β */
    public int mo3478() {
            r0 = this;
            r0 = 8
            return r0
    }

    @Override // p000.m31
    /* JADX INFO: renamed from: γ */
    public boolean mo3719(p000.q01 r1) {
            r0 = this;
            yp0 r0 = p000.h62.m2445(r1)
            r1 = 0
            bs1 r0 = p000.p91.m4416(r0, r1)
            boolean r0 = p000.h62.m2432(r0)
            return r0
    }

    @Override // p000.m31
    /* JADX INFO: renamed from: δ */
    public void mo3479(p000.yp0 r8, long r9, p000.ne0 r11, int r12, boolean r13) {
            r7 = this;
            k31 r7 = r8.f12733
            q31 r8 = r7.f5727
            io1 r12 = p000.q31.f8818
            long r2 = r8.m4736(r9)
            q31 r0 = r7.f5727
            rk0 r1 = p000.q31.f8821
            r5 = 1
            r4 = r11
            r6 = r13
            r0.m4742(r1, r2, r4, r5, r6)
            return
    }

    @Override // p000.hj1
    /* JADX INFO: renamed from: ε */
    public void mo2511() {
            r1 = this;
            int r1 = r1.f9394
            switch(r1) {
                case 13: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = "DIAGNOSTIC_PROFILE_IS_COMPRESSED"
            java.lang.String r0 = "ProfileInstaller"
            android.util.Log.d(r0, r1)
        Lc:
            return
    }

    @Override // p000.m31
    /* JADX INFO: renamed from: ζ */
    public boolean mo3480(p000.ne0 r1, p000.yp0 r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.hj1
    /* JADX INFO: renamed from: η */
    public void mo2512(int r3, java.lang.Object r4) {
            r2 = this;
            int r2 = r2.f9394
            switch(r2) {
                case 13: goto L3d;
                default: goto L5;
            }
        L5:
            switch(r3) {
                case 1: goto L26;
                case 2: goto L23;
                case 3: goto L20;
                case 4: goto L1d;
                case 5: goto L1a;
                case 6: goto L17;
                case 7: goto L14;
                case 8: goto L11;
                case 9: goto L8;
                case 10: goto Le;
                case 11: goto Lb;
                default: goto L8;
            }
        L8:
            java.lang.String r2 = ""
            goto L28
        Lb:
            java.lang.String r2 = "RESULT_DELETE_SKIP_FILE_SUCCESS"
            goto L28
        Le:
            java.lang.String r2 = "RESULT_INSTALL_SKIP_FILE_SUCCESS"
            goto L28
        L11:
            java.lang.String r2 = "RESULT_PARSE_EXCEPTION"
            goto L28
        L14:
            java.lang.String r2 = "RESULT_IO_EXCEPTION"
            goto L28
        L17:
            java.lang.String r2 = "RESULT_BASELINE_PROFILE_NOT_FOUND"
            goto L28
        L1a:
            java.lang.String r2 = "RESULT_DESIRED_FORMAT_UNSUPPORTED"
            goto L28
        L1d:
            java.lang.String r2 = "RESULT_NOT_WRITABLE"
            goto L28
        L20:
            java.lang.String r2 = "RESULT_UNSUPPORTED_ART_VERSION"
            goto L28
        L23:
            java.lang.String r2 = "RESULT_ALREADY_INSTALLED"
            goto L28
        L26:
            java.lang.String r2 = "RESULT_INSTALL_SUCCESS"
        L28:
            r0 = 6
            java.lang.String r1 = "ProfileInstaller"
            if (r3 == r0) goto L38
            r0 = 7
            if (r3 == r0) goto L38
            r0 = 8
            if (r3 == r0) goto L38
            android.util.Log.d(r1, r2)
            goto L3d
        L38:
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            android.util.Log.e(r1, r2, r4)
        L3d:
            return
    }

    @Override // p000.m31
    /* JADX INFO: renamed from: θ */
    public boolean mo3481(p000.yp0 r2) {
            r1 = this;
            xr1 r1 = r2.m7007()
            r2 = 0
            r0 = 1
            if (r1 == 0) goto Ld
            boolean r1 = r1.f12271
            if (r1 != r0) goto Ld
            r2 = r0
        Ld:
            r1 = r2 ^ 1
            return r1
    }
}
