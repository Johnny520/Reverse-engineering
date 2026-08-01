package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class uf0 implements p000.b00 {

    /* JADX INFO: renamed from: ζ */
    public static final p000.vc0 f10738 = null;

    /* JADX INFO: renamed from: α */
    public final p000.t41 f10739;

    /* JADX INFO: renamed from: β */
    public final p000.a00 f10740;

    /* JADX INFO: renamed from: γ */
    public final p000.C0538m6 f10741;

    /* JADX INFO: renamed from: δ */
    public int f10742;

    /* JADX INFO: renamed from: ε */
    public final p000.C0759rf f10743;

    static {
            vc0 r0 = p000.vc0.f11229
            java.lang.String r0 = "OkHttp-Response-Body"
            java.lang.String r1 = "Truncated"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
            int r2 = r2 % r1
            if (r2 != 0) goto L5c
            int r2 = r0.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r3 = r2.length
            r4 = 0
            r5 = r4
        L1f:
            if (r5 >= r3) goto L3a
            r6 = r2[r5]
            if (r6 == 0) goto L34
            r6 = r0[r5]
            java.lang.CharSequence r6 = p000.q02.m4660(r6)
            java.lang.String r6 = r6.toString()
            r2[r5] = r6
            int r5 = r5 + 1
            goto L1f
        L34:
            java.lang.String r0 = "Headers cannot be null"
            p000.C1080.m7275(r0)
            return
        L3a:
            int r0 = r2.length
            int r0 = r0 + (-1)
            int r0 = p000.g81.m2275(r4, r0, r1)
            if (r0 < 0) goto L54
        L43:
            r1 = r2[r4]
            int r3 = r4 + 1
            r3 = r2[r3]
            p000.v81.m6124(r1)
            p000.v81.m6125(r3, r1)
            if (r4 == r0) goto L54
            int r4 = r4 + 2
            goto L43
        L54:
            vc0 r0 = new vc0
            r0.<init>(r2)
            p000.uf0.f10738 = r0
            return
        L5c:
            java.lang.String r0 = "Expected alternating header names and values"
            p000.C1080.m7275(r0)
            return
    }

    public uf0(p000.t41 r1, p000.a00 r2, p000.C0538m6 r3) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.f10739 = r1
            r0.f10740 = r2
            r0.f10741 = r3
            rf r1 = new rf
            java.lang.Object r2 = r3.f6968
            rk1 r2 = (p000.rk1) r2
            r1.<init>(r2)
            r0.f10743 = r1
            return
    }

    @Override // p000.b00
    public final void cancel() {
            r0 = this;
            a00 r0 = r0.f10740
            r0.cancel()
            return
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: α */
    public final void mo644(p000.C0384i5 r6) {
            r5 = this;
            a00 r0 = r5.f10740
            zo1 r0 = r0.mo2()
            java.net.Proxy r0 = r0.f13230
            java.net.Proxy$Type r0 = r0.type()
            r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = r6.f4915
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            java.lang.Object r2 = r6.f4914
            og0 r2 = (p000.og0) r2
            java.lang.String r3 = r2.f8090
            java.lang.String r4 = "https"
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L36
            java.net.Proxy$Type r3 = java.net.Proxy.Type.HTTP
            if (r0 != r3) goto L36
            r1.append(r2)
            goto L57
        L36:
            java.lang.String r0 = r2.m4231()
            java.lang.String r2 = r2.m4233()
            if (r2 == 0) goto L54
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r0 = 63
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
        L54:
            r1.append(r0)
        L57:
            java.lang.String r0 = " HTTP/1.1"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object r6 = r6.f4916
            vc0 r6 = (p000.vc0) r6
            r5.m5855(r6, r0)
            return
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: β */
    public final p000.rx1 mo645(p000.zn1 r10) {
            r9 = this;
            i5 r0 = r10.f13197
            boolean r1 = p000.mg0.m3822(r10)
            if (r1 != 0) goto L13
            java.lang.Object r10 = r0.f4914
            og0 r10 = (p000.og0) r10
            r0 = 0
            rf0 r9 = r9.m5854(r10, r0)
            return r9
        L13:
            vc0 r1 = r10.f13202
            java.lang.String r2 = "Transfer-Encoding"
            java.lang.String r1 = r1.m6168(r2)
            if (r1 != 0) goto L1e
            r1 = 0
        L1e:
            java.lang.String r2 = "chunked"
            boolean r1 = r2.equalsIgnoreCase(r1)
            java.lang.String r2 = "state: "
            r3 = 5
            r4 = 4
            if (r1 == 0) goto L41
            java.lang.Object r10 = r0.f4914
            og0 r10 = (p000.og0) r10
            int r0 = r9.f10742
            if (r0 != r4) goto L3a
            r9.f10742 = r3
            qf0 r0 = new qf0
            r0.<init>(r9, r10)
            return r0
        L3a:
            int r9 = r9.f10742
            p000.ql1.m4937(r2, r9)
            r9 = 0
            return r9
        L41:
            long r5 = p000.ud2.m5847(r10)
            r7 = -1
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L54
            java.lang.Object r10 = r0.f4914
            og0 r10 = (p000.og0) r10
            rf0 r9 = r9.m5854(r10, r5)
            return r9
        L54:
            java.lang.Object r10 = r0.f4914
            og0 r10 = (p000.og0) r10
            int r0 = r9.f10742
            if (r0 != r4) goto L6c
            r9.f10742 = r3
            a00 r0 = r9.f10740
            r0.mo3()
            tf0 r0 = new tf0
            r10.getClass()
            r0.<init>(r9, r10)
            return r0
        L6c:
            int r9 = r9.f10742
            p000.ql1.m4937(r2, r9)
            r9 = 0
            return r9
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: γ */
    public final void mo646() {
            r0 = this;
            m6 r0 = r0.f10741
            java.lang.Object r0 = r0.f6969
            qk1 r0 = (p000.qk1) r0
            r0.flush()
            return
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: δ */
    public final boolean mo647() {
            r1 = this;
            int r1 = r1.f10742
            r0 = 6
            if (r1 != r0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: ε */
    public final void mo648() {
            r0 = this;
            m6 r0 = r0.f10741
            java.lang.Object r0 = r0.f6969
            qk1 r0 = (p000.qk1) r0
            r0.flush()
            return
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: ζ */
    public final p000.lx1 mo649() {
            r0 = this;
            m6 r0 = r0.f10741
            return r0
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: η */
    public final p000.a00 mo650() {
            r0 = this;
            a00 r0 = r0.f10740
            return r0
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: θ */
    public final long mo651(p000.zn1 r2) {
            r1 = this;
            boolean r1 = p000.mg0.m3822(r2)
            if (r1 != 0) goto L9
            r1 = 0
            return r1
        L9:
            vc0 r1 = r2.f13202
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r1 = r1.m6168(r0)
            if (r1 != 0) goto L14
            r1 = 0
        L14:
            java.lang.String r0 = "chunked"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L1f
            r1 = -1
            return r1
        L1f:
            long r1 = p000.ud2.m5847(r2)
            return r1
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: ι */
    public final p000.iw1 mo652(p000.C0384i5 r6, long r7) {
            r5 = this;
            java.lang.Object r6 = r6.f4916
            vc0 r6 = (p000.vc0) r6
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r6 = r6.m6168(r0)
            java.lang.String r0 = "chunked"
            boolean r6 = r0.equalsIgnoreCase(r6)
            java.lang.String r0 = "state: "
            r1 = 2
            r2 = 1
            if (r6 == 0) goto L29
            int r6 = r5.f10742
            if (r6 != r2) goto L22
            r5.f10742 = r1
            pf0 r6 = new pf0
            r6.<init>(r5)
            return r6
        L22:
            int r5 = r5.f10742
            p000.ql1.m4937(r0, r5)
        L27:
            r5 = 0
            return r5
        L29:
            r3 = -1
            int r6 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r6 == 0) goto L41
            int r6 = r5.f10742
            if (r6 != r2) goto L3b
            r5.f10742 = r1
            sf0 r6 = new sf0
            r6.<init>(r5)
            return r6
        L3b:
            int r5 = r5.f10742
            p000.ql1.m4937(r0, r5)
            goto L27
        L41:
            java.lang.String r5 = "Cannot stream a request body without chunked encoding or a known content length!"
            p000.C1080.m7279(r5)
            goto L27
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: κ */
    public final p000.yn1 mo653(boolean r8) {
            r7 = this;
            rf r0 = r7.f10743
            int r1 = r7.f10742
            r2 = 3
            if (r1 == 0) goto L19
            r3 = 1
            if (r1 == r3) goto L19
            r3 = 2
            if (r1 == r3) goto L19
            if (r1 != r2) goto L10
            goto L19
        L10:
            java.lang.String r8 = "state: "
            int r7 = r7.f10742
            p000.ql1.m4937(r8, r7)
            r7 = 0
            return r7
        L19:
            java.lang.Object r1 = r0.f9359     // Catch: java.io.EOFException -> L5d
            ad r1 = (p000.InterfaceC0014ad) r1     // Catch: java.io.EOFException -> L5d
            long r3 = r0.f9358     // Catch: java.io.EOFException -> L5d
            java.lang.String r1 = r1.mo60(r3)     // Catch: java.io.EOFException -> L5d
            long r3 = r0.f9358     // Catch: java.io.EOFException -> L5d
            int r5 = r1.length()     // Catch: java.io.EOFException -> L5d
            long r5 = (long) r5     // Catch: java.io.EOFException -> L5d
            long r3 = r3 - r5
            r0.f9358 = r3     // Catch: java.io.EOFException -> L5d
            n2 r1 = p000.g81.m2281(r1)     // Catch: java.io.EOFException -> L5d
            int r3 = r1.f7358     // Catch: java.io.EOFException -> L5d
            yn1 r4 = new yn1     // Catch: java.io.EOFException -> L5d
            r4.<init>()     // Catch: java.io.EOFException -> L5d
            java.lang.Object r5 = r1.f7359     // Catch: java.io.EOFException -> L5d
            zj1 r5 = (p000.zj1) r5     // Catch: java.io.EOFException -> L5d
            r4.f12692 = r5     // Catch: java.io.EOFException -> L5d
            r4.f12693 = r3     // Catch: java.io.EOFException -> L5d
            java.lang.Object r1 = r1.f7360     // Catch: java.io.EOFException -> L5d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.io.EOFException -> L5d
            r4.f12694 = r1     // Catch: java.io.EOFException -> L5d
            vc0 r0 = r0.m5083()     // Catch: java.io.EOFException -> L5d
            uc0 r0 = r0.m6170()     // Catch: java.io.EOFException -> L5d
            r4.f12696 = r0     // Catch: java.io.EOFException -> L5d
            r0 = 100
            if (r8 == 0) goto L58
            if (r3 != r0) goto L58
            r7 = 0
            return r7
        L58:
            if (r3 != r0) goto L5f
            r7.f10742 = r2     // Catch: java.io.EOFException -> L5d
            return r4
        L5d:
            r8 = move-exception
            goto L6e
        L5f:
            r8 = 102(0x66, float:1.43E-43)
            if (r8 > r3) goto L6a
            r8 = 200(0xc8, float:2.8E-43)
            if (r3 >= r8) goto L6a
            r7.f10742 = r2     // Catch: java.io.EOFException -> L5d
            return r4
        L6a:
            r8 = 4
            r7.f10742 = r8     // Catch: java.io.EOFException -> L5d
            return r4
        L6e:
            a00 r7 = r7.f10740
            zo1 r7 = r7.mo2()
            p r7 = r7.f13229
            og0 r7 = r7.f8371
            java.lang.String r7 = r7.m4235()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "unexpected end of stream on "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7, r8)
            throw r0
    }

    /* JADX INFO: renamed from: λ */
    public final p000.rf0 m5854(p000.og0 r3, long r4) {
            r2 = this;
            int r0 = r2.f10742
            r1 = 4
            if (r0 != r1) goto Le
            r0 = 5
            r2.f10742 = r0
            rf0 r0 = new rf0
            r0.<init>(r2, r3, r4)
            return r0
        Le:
            java.lang.String r3 = "state: "
            int r2 = r2.f10742
            p000.ql1.m4937(r3, r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: μ */
    public final void m5855(p000.vc0 r6, java.lang.String r7) {
            r5 = this;
            r6.getClass()
            int r0 = r5.f10742
            if (r0 != 0) goto L40
            m6 r0 = r5.f10741
            java.lang.Object r1 = r0.f6969
            qk1 r1 = (p000.qk1) r1
            r1.mo4893(r7)
            java.lang.String r7 = "\r\n"
            r1.mo4893(r7)
            int r1 = r6.size()
            r2 = 0
        L1a:
            java.lang.Object r3 = r0.f6969
            qk1 r3 = (p000.qk1) r3
            if (r2 >= r1) goto L39
            java.lang.String r4 = r6.m6169(r2)
            r3.mo4893(r4)
            java.lang.String r4 = ": "
            r3.mo4893(r4)
            java.lang.String r4 = r6.m6171(r2)
            r3.mo4893(r4)
            r3.mo4893(r7)
            int r2 = r2 + 1
            goto L1a
        L39:
            r3.mo4893(r7)
            r6 = 1
            r5.f10742 = r6
            return
        L40:
            java.lang.String r6 = "state: "
            int r5 = r5.f10742
            p000.ql1.m4937(r6, r5)
            return
    }
}
