package p000;

/* JADX INFO: renamed from: mo */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0556mo implements p000.bp1, p000.a00 {

    /* JADX INFO: renamed from: α */
    public final p000.x22 f7215;

    /* JADX INFO: renamed from: β */
    public final p000.xk1 f7216;

    /* JADX INFO: renamed from: γ */
    public final int f7217;

    /* JADX INFO: renamed from: δ */
    public final int f7218;

    /* JADX INFO: renamed from: ε */
    public final int f7219;

    /* JADX INFO: renamed from: ζ */
    public final int f7220;

    /* JADX INFO: renamed from: η */
    public final boolean f7221;

    /* JADX INFO: renamed from: θ */
    public final p000.uk1 f7222;

    /* JADX INFO: renamed from: ι */
    public final p000.al1 f7223;

    /* JADX INFO: renamed from: κ */
    public final p000.zo1 f7224;

    /* JADX INFO: renamed from: λ */
    public final java.util.List f7225;

    /* JADX INFO: renamed from: μ */
    public final p000.C0384i5 f7226;

    /* JADX INFO: renamed from: ν */
    public final int f7227;

    /* JADX INFO: renamed from: ξ */
    public final boolean f7228;

    /* JADX INFO: renamed from: ο */
    public volatile boolean f7229;

    /* JADX INFO: renamed from: π */
    public java.net.Socket f7230;

    /* JADX INFO: renamed from: ρ */
    public java.net.Socket f7231;

    /* JADX INFO: renamed from: σ */
    public p000.qc0 f7232;

    /* JADX INFO: renamed from: τ */
    public p000.zj1 f7233;

    /* JADX INFO: renamed from: υ */
    public p000.C0538m6 f7234;

    /* JADX INFO: renamed from: φ */
    public p000.vk1 f7235;

    public C0556mo(p000.x22 r1, p000.xk1 r2, int r3, int r4, int r5, int r6, boolean r7, p000.uk1 r8, p000.al1 r9, p000.zo1 r10, java.util.List r11, p000.C0384i5 r12, int r13, boolean r14) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r10.getClass()
            r0.<init>()
            r0.f7215 = r1
            r0.f7216 = r2
            r0.f7217 = r3
            r0.f7218 = r4
            r0.f7219 = r5
            r0.f7220 = r6
            r0.f7221 = r7
            r0.f7222 = r8
            r0.f7223 = r9
            r0.f7224 = r10
            r0.f7225 = r11
            r0.f7226 = r12
            r0.f7227 = r13
            r0.f7228 = r14
            return
    }

    @Override // p000.bp1
    public final void cancel() {
            r1 = this;
            r0 = 1
            r1.f7229 = r0
            java.net.Socket r1 = r1.f7230
            if (r1 == 0) goto La
            p000.ud2.m5845(r1)
        La:
            return
    }

    @Override // p000.bp1
    /* JADX INFO: renamed from: α */
    public final p000.bp1 mo988() {
            r15 = this;
            mo r0 = new mo
            int r13 = r15.f7227
            boolean r14 = r15.f7228
            x22 r1 = r15.f7215
            xk1 r2 = r15.f7216
            int r3 = r15.f7217
            int r4 = r15.f7218
            int r5 = r15.f7219
            int r6 = r15.f7220
            boolean r7 = r15.f7221
            uk1 r8 = r15.f7222
            al1 r9 = r15.f7223
            zo1 r10 = r15.f7224
            java.util.List r11 = r15.f7225
            i5 r12 = r15.f7226
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
    }

    @Override // p000.a00
    /* JADX INFO: renamed from: β */
    public final void mo1(p000.uk1 r1, java.io.IOException r2) {
            r0 = this;
            return
    }

    @Override // p000.bp1
    /* JADX INFO: renamed from: γ */
    public final p000.ap1 mo989() {
            r18 = this;
            r1 = r18
            xk1 r2 = r1.f7216
            uk1 r0 = r1.f7222
            java.util.concurrent.CopyOnWriteArrayList r3 = r0.f10905
            java.net.Socket r8 = r1.f7230
            if (r8 == 0) goto L15b
            boolean r0 = r1.mo991()
            if (r0 != 0) goto L154
            zo1 r0 = r1.f7224
            p r4 = r0.f13229
            java.net.InetSocketAddress r13 = r0.f13231
            p r0 = r0.f13229
            java.util.List r4 = r4.f8373
            r3.add(r1)
            r14 = 0
            r15 = 0
            i5 r5 = r1.f7226     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            if (r5 == 0) goto L42
            ap1 r5 = r1.m3874()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            java.lang.Throwable r6 = r5.f1272     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            if (r6 == 0) goto L42
            r3.remove(r1)
            java.net.Socket r0 = r1.f7231
            if (r0 == 0) goto L37
            p000.ud2.m5845(r0)
        L37:
            p000.ud2.m5845(r8)
            return r5
        L3b:
            r0 = move-exception
            goto L144
        L3e:
            r0 = move-exception
            r4 = r15
            goto L104
        L42:
            javax.net.ssl.SSLSocketFactory r5 = r0.f8366     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            r6 = 1
            java.lang.String r7 = "socket"
            if (r5 == 0) goto La8
            m6 r5 = r1.f7234     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            if (r5 == 0) goto La4
            java.lang.Object r5 = r5.f6968     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            rk1 r5 = (p000.rk1) r5     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            sc r5 = r5.f9396     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            boolean r5 = r5.m5454()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            if (r5 == 0) goto L9c
            m6 r5 = r1.f7234     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            if (r5 == 0) goto L98
            java.lang.Object r5 = r5.f6969     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            qk1 r5 = (p000.qk1) r5     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            sc r5 = r5.f9029     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            boolean r5 = r5.m5454()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            if (r5 == 0) goto L9c
            javax.net.ssl.SSLSocketFactory r5 = r0.f8366     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            og0 r0 = r0.f8371     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            java.lang.String r9 = r0.f8093     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            int r0 = r0.f8094     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            java.net.Socket r0 = r5.createSocket(r8, r9, r0, r6)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            r0.getClass()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            mo r5 = r1.m3876(r4, r0)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            int r9 = r5.f7227     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            java.lang.Object r9 = r4.get(r9)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            po r9 = (p000.C0694po) r9     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            mo r4 = r5.m3875(r4, r0)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            boolean r5 = r5.f7228     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L95
            r9.m4559(r0, r5)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L95
            r1.m3873(r0, r9)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L95
            r16 = r4
            goto Lbb
        L95:
            r0 = move-exception
            goto L104
        L98:
            p000.ln0.m3650(r7)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            throw r15     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
        L9c:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            java.lang.String r4 = "TLS tunnel buffered too many bytes!"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            throw r0     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
        La4:
            p000.ln0.m3650(r7)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            throw r15     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
        La8:
            r1.f7231 = r8     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            java.util.List r0 = r0.f8372     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            zj1 r4 = p000.zj1.f13134     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            boolean r0 = r0.contains(r4)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            if (r0 == 0) goto Lb5
            goto Lb7
        Lb5:
            zj1 r4 = p000.zj1.f13131     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
        Lb7:
            r1.f7233 = r4     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            r16 = r15
        Lbb:
            vk1 r4 = new vk1     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            x22 r5 = r1.f7215     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r9 = r6
            xk1 r6 = r1.f7216     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r0 = r7
            zo1 r7 = r1.f7224     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r10 = r9
            java.net.Socket r9 = r1.f7231     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r9.getClass()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r11 = r10
            qc0 r10 = r1.f7232     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r12 = r11
            zj1 r11 = r1.f7233     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r11.getClass()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r17 = r12
            m6 r12 = r1.f7234     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            if (r12 == 0) goto L100
            r2.getClass()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r1.f7235 = r4     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r4.m6271()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            r13.getClass()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            ap1 r0 = new ap1     // Catch: java.lang.Throwable -> Lf2 java.io.IOException -> Lf6
            r4 = 6
            r0.<init>(r1, r15, r4)     // Catch: java.lang.Throwable -> Lf2 java.io.IOException -> Lf6
            r3.remove(r1)
            return r0
        Lf2:
            r0 = move-exception
            r14 = r17
            goto L144
        Lf6:
            r0 = move-exception
            r4 = r16
            r14 = r17
            goto L104
        Lfc:
            r0 = move-exception
            r4 = r16
            goto L104
        L100:
            p000.ln0.m3650(r0)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
            throw r15     // Catch: java.lang.Throwable -> L3b java.io.IOException -> Lfc
        L104:
            r13.getClass()     // Catch: java.lang.Throwable -> L3b
            r2.getClass()     // Catch: java.lang.Throwable -> L3b
            boolean r2 = r1.f7221     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L12f
            boolean r2 = r0 instanceof java.net.ProtocolException     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L113
            goto L12f
        L113:
            boolean r2 = r0 instanceof java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L118
            goto L12f
        L118:
            boolean r2 = r0 instanceof javax.net.ssl.SSLHandshakeException     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L125
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L3b
            boolean r2 = r2 instanceof java.security.cert.CertificateException     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L125
            goto L12f
        L125:
            boolean r2 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L12a
            goto L12f
        L12a:
            boolean r2 = r0 instanceof javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L12f
            r15 = r4
        L12f:
            ap1 r2 = new ap1     // Catch: java.lang.Throwable -> L3b
            r2.<init>(r1, r15, r0)     // Catch: java.lang.Throwable -> L3b
            r3.remove(r1)
            if (r14 != 0) goto L143
            java.net.Socket r0 = r1.f7231
            if (r0 == 0) goto L140
            p000.ud2.m5845(r0)
        L140:
            p000.ud2.m5845(r8)
        L143:
            return r2
        L144:
            r3.remove(r1)
            if (r14 != 0) goto L153
            java.net.Socket r1 = r1.f7231
            if (r1 == 0) goto L150
            p000.ud2.m5845(r1)
        L150:
            p000.ud2.m5845(r8)
        L153:
            throw r0
        L154:
            java.lang.String r0 = "already connected"
            p000.C1080.m7279(r0)
        L159:
            r0 = 0
            return r0
        L15b:
            java.lang.String r0 = "TCP not connected"
            p000.C1080.m7275(r0)
            goto L159
    }

    @Override // p000.bp1
    /* JADX INFO: renamed from: δ */
    public final p000.vk1 mo990() {
            r5 = this;
            uk1 r0 = r5.f7222
            t41 r0 = r0.f10888
            ij0 r0 = r0.f10172
            zo1 r1 = r5.f7224
            monitor-enter(r0)
            r1.getClass()     // Catch: java.lang.Throwable -> L49
            java.util.LinkedHashSet r2 = r0.f5096     // Catch: java.lang.Throwable -> L49
            r2.remove(r1)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)
            vk1 r0 = r5.f7235
            r0.getClass()
            zo1 r1 = r5.f7224
            r1.getClass()
            al1 r1 = r5.f7223
            java.util.List r2 = r5.f7225
            jo1 r1 = r1.m176(r5, r2)
            if (r1 == 0) goto L29
            vk1 r5 = r1.f5531
            return r5
        L29:
            monitor-enter(r0)
            xk1 r1 = r5.f7216     // Catch: java.lang.Throwable -> L46
            r1.getClass()     // Catch: java.lang.Throwable -> L46
            java.util.TimeZone r2 = p000.ud2.f10709     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.ConcurrentLinkedQueue r2 = r1.f12204     // Catch: java.lang.Throwable -> L46
            r2.add(r0)     // Catch: java.lang.Throwable -> L46
            w22 r2 = r1.f12202     // Catch: java.lang.Throwable -> L46
            wk1 r1 = r1.f12203     // Catch: java.lang.Throwable -> L46
            r3 = 0
            r2.m6311(r1, r3)     // Catch: java.lang.Throwable -> L46
            uk1 r5 = r5.f7222     // Catch: java.lang.Throwable -> L46
            r5.m5927(r0)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r0)
            return r0
        L46:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L49:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            throw r5
    }

    @Override // p000.bp1
    /* JADX INFO: renamed from: ε */
    public final boolean mo991() {
            r0 = this;
            zj1 r0 = r0.f7233
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // p000.a00
    /* JADX INFO: renamed from: ζ */
    public final p000.zo1 mo2() {
            r0 = this;
            zo1 r0 = r0.f7224
            return r0
    }

    @Override // p000.bp1
    /* JADX INFO: renamed from: η */
    public final p000.ap1 mo992() {
            r8 = this;
            xk1 r0 = r8.f7216
            uk1 r1 = r8.f7222
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.f10905
            zo1 r2 = r8.f7224
            java.net.Socket r3 = r8.f7230
            if (r3 != 0) goto L71
            r1.add(r8)
            r3 = 0
            java.net.InetSocketAddress r4 = r2.f13231     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r4.getClass()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r0.getClass()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r8.m3872()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r3 = 1
            ap1 r4 = new ap1     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r5 = 0
            r6 = 6
            r4.<init>(r8, r5, r6)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r1.remove(r8)
            return r4
        L27:
            r0 = move-exception
            goto L64
        L29:
            r4 = move-exception
            p r5 = r2.f13229     // Catch: java.lang.Throwable -> L27
            java.net.Proxy r5 = r2.f13230     // Catch: java.lang.Throwable -> L27
            java.net.Proxy$Type r5 = r5.type()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy$Type r6 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.Throwable -> L27
            if (r5 == r6) goto L49
            p r5 = r2.f13229     // Catch: java.lang.Throwable -> L27
            java.net.ProxySelector r6 = r5.f8370     // Catch: java.lang.Throwable -> L27
            og0 r5 = r5.f8371     // Catch: java.lang.Throwable -> L27
            java.net.URI r5 = r5.m4236()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy r7 = r2.f13230     // Catch: java.lang.Throwable -> L27
            java.net.SocketAddress r7 = r7.address()     // Catch: java.lang.Throwable -> L27
            r6.connectFailed(r5, r7, r4)     // Catch: java.lang.Throwable -> L27
        L49:
            java.net.InetSocketAddress r2 = r2.f13231     // Catch: java.lang.Throwable -> L27
            r2.getClass()     // Catch: java.lang.Throwable -> L27
            r0.getClass()     // Catch: java.lang.Throwable -> L27
            ap1 r0 = new ap1     // Catch: java.lang.Throwable -> L27
            r2 = 2
            r0.<init>(r8, r4, r2)     // Catch: java.lang.Throwable -> L27
            r1.remove(r8)
            if (r3 != 0) goto L63
            java.net.Socket r8 = r8.f7230
            if (r8 == 0) goto L63
            p000.ud2.m5845(r8)
        L63:
            return r0
        L64:
            r1.remove(r8)
            if (r3 != 0) goto L70
            java.net.Socket r8 = r8.f7230
            if (r8 == 0) goto L70
            p000.ud2.m5845(r8)
        L70:
            throw r0
        L71:
            java.lang.String r8 = "TCP already connected"
            p000.C1080.m7279(r8)
            r8 = 0
            return r8
    }

    @Override // p000.a00
    /* JADX INFO: renamed from: θ */
    public final void mo3() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ι */
    public final void m3872() {
            r4 = this;
            zo1 r0 = r4.f7224
            java.net.Proxy r0 = r0.f13230
            java.net.Proxy$Type r0 = r0.type()
            if (r0 != 0) goto Lc
            r0 = -1
            goto L14
        Lc:
            int[] r1 = p000.AbstractC0519lo.f6725
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L14:
            r1 = 1
            if (r0 == r1) goto L24
            r1 = 2
            if (r0 == r1) goto L24
            java.net.Socket r0 = new java.net.Socket
            zo1 r1 = r4.f7224
            java.net.Proxy r1 = r1.f13230
            r0.<init>(r1)
            goto L31
        L24:
            zo1 r0 = r4.f7224
            p r0 = r0.f13229
            javax.net.SocketFactory r0 = r0.f8365
            java.net.Socket r0 = r0.createSocket()
            r0.getClass()
        L31:
            r4.f7230 = r0
            boolean r1 = r4.f7229
            if (r1 != 0) goto L8c
            int r1 = r4.f7220
            r0.setSoTimeout(r1)
            f0 r1 = p000.gh1.f4375     // Catch: java.net.ConnectException -> L70
            f0 r1 = p000.gh1.f4375     // Catch: java.net.ConnectException -> L70
            zo1 r2 = r4.f7224     // Catch: java.net.ConnectException -> L70
            java.net.InetSocketAddress r2 = r2.f13231     // Catch: java.net.ConnectException -> L70
            int r3 = r4.f7219     // Catch: java.net.ConnectException -> L70
            r1.getClass()     // Catch: java.net.ConnectException -> L70
            r2.getClass()     // Catch: java.net.ConnectException -> L70
            r0.connect(r2, r3)     // Catch: java.net.ConnectException -> L70
            i0 r1 = new i0     // Catch: java.lang.NullPointerException -> L5c
            r1.<init>(r0)     // Catch: java.lang.NullPointerException -> L5c
            m6 r0 = new m6     // Catch: java.lang.NullPointerException -> L5c
            r0.<init>(r1)     // Catch: java.lang.NullPointerException -> L5c
            r4.f7234 = r0     // Catch: java.lang.NullPointerException -> L5c
            return
        L5c:
            r4 = move-exception
            java.lang.String r0 = r4.getMessage()
            java.lang.String r1 = "throw with null exception"
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L6a
            return
        L6a:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r4)
            throw r0
        L70:
            r0 = move-exception
            java.net.ConnectException r1 = new java.net.ConnectException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to connect to "
            r2.<init>(r3)
            zo1 r4 = r4.f7224
            java.net.InetSocketAddress r4 = r4.f13231
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            r1.initCause(r0)
            throw r1
        L8c:
            java.lang.String r4 = "canceled"
            p000.C1080.m7281(r4)
            return
    }

    /* JADX INFO: renamed from: κ */
    public final void m3873(javax.net.ssl.SSLSocket r11, p000.C0694po r12) {
            r10 = this;
            zo1 r0 = r10.f7224
            p r0 = r0.f13229
            boolean r1 = r12.f8621     // Catch: java.lang.Throwable -> L3c
            r2 = 0
            if (r1 == 0) goto L3f
            f0 r1 = p000.gh1.f4375     // Catch: java.lang.Throwable -> L3c
            f0 r1 = p000.gh1.f4375     // Catch: java.lang.Throwable -> L3c
            og0 r3 = r0.f8371     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r3.f8093     // Catch: java.lang.Throwable -> L3c
            java.util.List r4 = r0.f8372     // Catch: java.lang.Throwable -> L3c
            r1.getClass()     // Catch: java.lang.Throwable -> L3c
            r4.getClass()     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r1 = r1.f3701     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3c
        L1f:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L33
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L3c
            r6 = r5
            mx1 r6 = (p000.mx1) r6     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.mo1120(r11)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L1f
            goto L34
        L33:
            r5 = r2
        L34:
            mx1 r5 = (p000.mx1) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L3f
            r5.mo1123(r11, r3, r4)     // Catch: java.lang.Throwable -> L3c
            goto L3f
        L3c:
            r10 = move-exception
            goto L171
        L3f:
            r11.startHandshake()     // Catch: java.lang.Throwable -> L3c
            javax.net.ssl.SSLSession r1 = r11.getSession()     // Catch: java.lang.Throwable -> L3c
            r1.getClass()     // Catch: java.lang.Throwable -> L3c
            qc0 r3 = p000.jx0.m3012(r1)     // Catch: java.lang.Throwable -> L3c
            javax.net.ssl.HostnameVerifier r4 = r0.f8367     // Catch: java.lang.Throwable -> L3c
            r4.getClass()     // Catch: java.lang.Throwable -> L3c
            og0 r5 = r0.f8371     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = r5.f8093     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r4.verify(r5, r1)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto Le8
            java.util.List r10 = r3.m4851()     // Catch: java.lang.Throwable -> L3c
            boolean r12 = r10.isEmpty()     // Catch: java.lang.Throwable -> L3c
            if (r12 != 0) goto Lc8
            r12 = 0
            java.lang.Object r10 = r10.get(r12)     // Catch: java.lang.Throwable -> L3c
            r10.getClass()     // Catch: java.lang.Throwable -> L3c
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10     // Catch: java.lang.Throwable -> L3c
            javax.net.ssl.SSLPeerUnverifiedException r12 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r1.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "\n            |Hostname "
            r1.append(r2)     // Catch: java.lang.Throwable -> L3c
            og0 r0 = r0.f8371     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r0.f8093     // Catch: java.lang.Throwable -> L3c
            r1.append(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = " not verified:\n            |    certificate: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L3c
            je r0 = p000.C0428je.f5435     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = p000.AbstractC1021yh.m6904(r10)     // Catch: java.lang.Throwable -> L3c
            r1.append(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = "\n            |    DN: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L3c
            java.security.Principal r0 = r10.getSubjectDN()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L3c
            r1.append(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = "\n            |    subjectAltNames: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L3c
            r0 = 7
            java.util.List r0 = p000.r41.m5063(r10, r0)     // Catch: java.lang.Throwable -> L3c
            r2 = 2
            java.util.List r10 = p000.r41.m5063(r10, r2)     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r10 = p000.AbstractC0984xh.m6651(r0, r10)     // Catch: java.lang.Throwable -> L3c
            r1.append(r10)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r10 = "\n            "
            r1.append(r10)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r10 = p000.r02.m5043(r10)     // Catch: java.lang.Throwable -> L3c
            r12.<init>(r10)     // Catch: java.lang.Throwable -> L3c
            throw r12     // Catch: java.lang.Throwable -> L3c
        Lc8:
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r12.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "Hostname "
            r12.append(r1)     // Catch: java.lang.Throwable -> L3c
            og0 r0 = r0.f8371     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r0.f8093     // Catch: java.lang.Throwable -> L3c
            r12.append(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = " not verified (no certificates)"
            r12.append(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L3c
            r10.<init>(r12)     // Catch: java.lang.Throwable -> L3c
            throw r10     // Catch: java.lang.Throwable -> L3c
        Le8:
            je r1 = r0.f8368     // Catch: java.lang.Throwable -> L3c
            r1.getClass()     // Catch: java.lang.Throwable -> L3c
            qc0 r4 = new qc0     // Catch: java.lang.Throwable -> L3c
            q42 r5 = r3.f8957     // Catch: java.lang.Throwable -> L3c
            uf r6 = r3.f8958     // Catch: java.lang.Throwable -> L3c
            java.util.List r7 = r3.f8959     // Catch: java.lang.Throwable -> L3c
            z7 r8 = new z7     // Catch: java.lang.Throwable -> L3c
            r9 = 4
            r8.<init>(r1, r3, r0, r9)     // Catch: java.lang.Throwable -> L3c
            r4.<init>(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3c
            r10.f7232 = r4     // Catch: java.lang.Throwable -> L3c
            og0 r0 = r0.f8371     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r0.f8093     // Catch: java.lang.Throwable -> L3c
            r0.getClass()     // Catch: java.lang.Throwable -> L3c
            java.util.Set r0 = r1.f5436     // Catch: java.lang.Throwable -> L3c
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L169
            boolean r12 = r12.f8621     // Catch: java.lang.Throwable -> L3c
            if (r12 == 0) goto L143
            f0 r12 = p000.gh1.f4375     // Catch: java.lang.Throwable -> L3c
            f0 r12 = p000.gh1.f4375     // Catch: java.lang.Throwable -> L3c
            r12.getClass()     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r12 = r12.f3701     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L3c
        L126:
            boolean r0 = r12.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L13a
            java.lang.Object r0 = r12.next()     // Catch: java.lang.Throwable -> L3c
            r1 = r0
            mx1 r1 = (p000.mx1) r1     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r1.mo1120(r11)     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L126
            goto L13b
        L13a:
            r0 = r2
        L13b:
            mx1 r0 = (p000.mx1) r0     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L143
            java.lang.String r2 = r0.mo1121(r11)     // Catch: java.lang.Throwable -> L3c
        L143:
            r10.f7231 = r11     // Catch: java.lang.Throwable -> L3c
            i0 r12 = new i0     // Catch: java.lang.Throwable -> L3c
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L3c
            m6 r0 = new m6     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L3c
            r10.f7234 = r0     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L15d
            rk0 r12 = p000.zj1.f13129     // Catch: java.lang.Throwable -> L3c
            r12.getClass()     // Catch: java.lang.Throwable -> L3c
            zj1 r12 = p000.rk0.m5106(r2)     // Catch: java.lang.Throwable -> L3c
            goto L15f
        L15d:
            zj1 r12 = p000.zj1.f13131     // Catch: java.lang.Throwable -> L3c
        L15f:
            r10.f7233 = r12     // Catch: java.lang.Throwable -> L3c
            f0 r10 = p000.gh1.f4375
            f0 r10 = p000.gh1.f4375
            r10.getClass()
            return
        L169:
            java.lang.Object r10 = r0.next()     // Catch: java.lang.Throwable -> L3c
            p000.lz1.m3698(r10)     // Catch: java.lang.Throwable -> L3c
            throw r2     // Catch: java.lang.Throwable -> L3c
        L171:
            f0 r12 = p000.gh1.f4375
            f0 r12 = p000.gh1.f4375
            r12.getClass()
            p000.ud2.m5845(r11)
            throw r10
    }

    /* JADX INFO: renamed from: λ */
    public final p000.ap1 m3874() {
            r9 = this;
            i5 r0 = r9.f7226
            r0.getClass()
            zo1 r1 = r9.f7224
            p r2 = r1.f13229
            og0 r2 = r2.f8371
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "CONNECT "
            r3.<init>(r4)
            r4 = 1
            java.lang.String r2 = p000.ud2.m5850(r2, r4)
            r3.append(r2)
            java.lang.String r2 = " HTTP/1.1"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            uf0 r3 = new uf0
            m6 r4 = r9.f7234
            java.lang.String r5 = "socket"
            r6 = 0
            if (r4 == 0) goto Lbe
            r3.<init>(r6, r9, r4)
            m6 r4 = r9.f7234
            if (r4 == 0) goto Lba
            java.lang.Object r4 = r4.f6968
            rk1 r4 = (p000.rk1) r4
            rx1 r4 = r4.f9395
            m42 r4 = r4.mo2105()
            int r7 = r9.f7217
            long r7 = (long) r7
            r4.mo2874(r7)
            m6 r4 = r9.f7234
            if (r4 == 0) goto Lb6
            java.lang.Object r4 = r4.f6969
            qk1 r4 = (p000.qk1) r4
            iw1 r4 = r4.f9028
            m42 r4 = r4.mo2505()
            int r5 = r9.f7218
            long r7 = (long) r5
            r4.mo2874(r7)
            java.lang.Object r4 = r0.f4916
            vc0 r4 = (p000.vc0) r4
            r3.m5855(r4, r2)
            r3.mo646()
            r2 = 0
            yn1 r2 = r3.mo653(r2)
            r2.getClass()
            r2.f12691 = r0
            zn1 r0 = r2.m6945()
            int r2 = r0.f13200
            long r4 = p000.ud2.m5847(r0)
            r7 = -1
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 != 0) goto L7c
            goto L8f
        L7c:
            i5 r0 = r0.f13197
            java.lang.Object r0 = r0.f4914
            og0 r0 = (p000.og0) r0
            rf0 r0 = r3.m5854(r0, r4)
            r3 = 2147483647(0x7fffffff, float:NaN)
            p000.ud2.m5848(r0, r3)
            r0.close()
        L8f:
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto Laf
            r9 = 407(0x197, float:5.7E-43)
            if (r2 != r9) goto La5
            p r9 = r1.f13229
            x r9 = r9.f8369
            r9.getClass()
            java.lang.String r9 = "Failed to authenticate with proxy"
            p000.C1080.m7281(r9)
        La3:
            r9 = 0
            return r9
        La5:
            java.lang.String r9 = "Unexpected response code for CONNECT: "
            java.lang.String r9 = p000.a12.m17(r9, r2)
            p000.C1080.m7281(r9)
            goto La3
        Laf:
            ap1 r0 = new ap1
            r1 = 6
            r0.<init>(r9, r6, r1)
            return r0
        Lb6:
            p000.ln0.m3650(r5)
            throw r6
        Lba:
            p000.ln0.m3650(r5)
            throw r6
        Lbe:
            p000.ln0.m3650(r5)
            throw r6
    }

    /* JADX INFO: renamed from: μ */
    public final p000.C0556mo m3875(java.util.List r20, javax.net.ssl.SSLSocket r21) {
            r19 = this;
            r0 = r19
            r20.getClass()
            int r1 = r0.f7227
            int r2 = r1 + 1
            int r3 = r20.size()
        Ld:
            if (r2 >= r3) goto L6e
            r4 = r20
            java.lang.Object r5 = r4.get(r2)
            po r5 = (p000.C0694po) r5
            r5.getClass()
            boolean r6 = r5.f8620
            if (r6 != 0) goto L1f
            goto L40
        L1f:
            java.lang.String[] r6 = r5.f8623
            if (r6 == 0) goto L30
            java.lang.String[] r7 = r21.getEnabledProtocols()
            s21 r8 = p000.s21.f9688
            boolean r6 = p000.sd2.m5475(r6, r7, r8)
            if (r6 != 0) goto L30
            goto L40
        L30:
            java.lang.String[] r5 = r5.f8622
            if (r5 == 0) goto L43
            java.lang.String[] r6 = r21.getEnabledCipherSuites()
            tf r7 = p000.C0870uf.f10719
            boolean r5 = p000.sd2.m5475(r5, r6, r7)
            if (r5 != 0) goto L43
        L40:
            int r2 = r2 + 1
            goto Ld
        L43:
            r3 = -1
            if (r1 == r3) goto L4a
            r1 = 1
        L47:
            r18 = r1
            goto L4c
        L4a:
            r1 = 0
            goto L47
        L4c:
            mo r4 = new mo
            zo1 r14 = r0.f7224
            java.util.List r15 = r0.f7225
            x22 r5 = r0.f7215
            xk1 r6 = r0.f7216
            int r7 = r0.f7217
            int r8 = r0.f7218
            int r9 = r0.f7219
            int r10 = r0.f7220
            boolean r11 = r0.f7221
            uk1 r12 = r0.f7222
            al1 r13 = r0.f7223
            i5 r0 = r0.f7226
            r16 = r0
            r17 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r4
        L6e:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public final p000.C0556mo m3876(java.util.List r4, javax.net.ssl.SSLSocket r5) {
            r3 = this;
            r4.getClass()
            int r0 = r3.f7227
            r1 = -1
            if (r0 == r1) goto L9
            return r3
        L9:
            mo r0 = r3.m3875(r4, r5)
            if (r0 == 0) goto L10
            return r0
        L10:
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to find acceptable protocols. isFallback="
            r1.<init>(r2)
            boolean r3 = r3.f7228
            r1.append(r3)
            java.lang.String r3 = ", modes="
            r1.append(r3)
            r1.append(r4)
            java.lang.String[] r3 = r5.getEnabledProtocols()
            r3.getClass()
            java.lang.String r3 = java.util.Arrays.toString(r3)
            r3.getClass()
            java.lang.String r4 = ", supported protocols="
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
