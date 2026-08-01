package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class eg0 implements p000.b00 {

    /* JADX INFO: renamed from: η */
    public static final java.util.List f3537 = null;

    /* JADX INFO: renamed from: θ */
    public static final java.util.List f3538 = null;

    /* JADX INFO: renamed from: α */
    public final p000.vk1 f3539;

    /* JADX INFO: renamed from: β */
    public final p000.yk1 f3540;

    /* JADX INFO: renamed from: γ */
    public final p000.dg0 f3541;

    /* JADX INFO: renamed from: δ */
    public volatile p000.kg0 f3542;

    /* JADX INFO: renamed from: ε */
    public final p000.zj1 f3543;

    /* JADX INFO: renamed from: ζ */
    public volatile boolean f3544;

    static {
            java.lang.String r10 = ":scheme"
            java.lang.String r11 = ":authority"
            java.lang.String r0 = "connection"
            java.lang.String r1 = "host"
            java.lang.String r2 = "keep-alive"
            java.lang.String r3 = "proxy-connection"
            java.lang.String r4 = "te"
            java.lang.String r5 = "transfer-encoding"
            java.lang.String r6 = "encoding"
            java.lang.String r7 = "upgrade"
            java.lang.String r8 = ":method"
            java.lang.String r9 = ":path"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.util.List r0 = p000.ud2.m5852(r0)
            p000.eg0.f3537 = r0
            java.lang.String r7 = "encoding"
            java.lang.String r8 = "upgrade"
            java.lang.String r1 = "connection"
            java.lang.String r2 = "host"
            java.lang.String r3 = "keep-alive"
            java.lang.String r4 = "proxy-connection"
            java.lang.String r5 = "te"
            java.lang.String r6 = "transfer-encoding"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.List r0 = p000.ud2.m5852(r0)
            p000.eg0.f3538 = r0
            return
    }

    public eg0(p000.t41 r1, p000.vk1 r2, p000.yk1 r3, p000.dg0 r4) {
            r0 = this;
            r1.getClass()
            r4.getClass()
            r0.<init>()
            r0.f3539 = r2
            r0.f3540 = r3
            r0.f3541 = r4
            java.util.List r1 = r1.f10192
            zj1 r2 = p000.zj1.f13134
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L1a
            goto L1c
        L1a:
            zj1 r2 = p000.zj1.f13133
        L1c:
            r0.f3543 = r2
            return
    }

    @Override // p000.b00
    public final void cancel() {
            r1 = this;
            r0 = 1
            r1.f3544 = r0
            kg0 r1 = r1.f3542
            if (r1 == 0) goto Lc
            sz r0 = p000.EnumC0816sz.f10092
            r1.m3246(r0)
        Lc:
            return
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: α */
    public final void mo644(p000.C0384i5 r15) {
            r14 = this;
            kg0 r0 = r14.f3542
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.Object r0 = r15.f4917
            kn1 r0 = (p000.kn1) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lf
            r0 = r2
            goto L10
        Lf:
            r0 = r1
        L10:
            java.lang.Object r3 = r15.f4916
            vc0 r3 = (p000.vc0) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r3.size()
            int r5 = r5 + 4
            r4.<init>(r5)
            tc0 r5 = new tc0
            dd r6 = p000.tc0.f10307
            java.lang.Object r7 = r15.f4915
            java.lang.String r7 = (java.lang.String) r7
            r5.<init>(r6, r7)
            r4.add(r5)
            tc0 r5 = new tc0
            dd r6 = p000.tc0.f10308
            java.lang.Object r15 = r15.f4914
            og0 r15 = (p000.og0) r15
            r15.getClass()
            java.lang.String r7 = r15.m4231()
            java.lang.String r8 = r15.m4233()
            if (r8 == 0) goto L56
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r7 = 63
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
        L56:
            r5.<init>(r6, r7)
            r4.add(r5)
            java.lang.String r5 = "Host"
            java.lang.String r5 = r3.m6168(r5)
            if (r5 == 0) goto L6e
            tc0 r6 = new tc0
            dd r7 = p000.tc0.f10310
            r6.<init>(r7, r5)
            r4.add(r6)
        L6e:
            tc0 r5 = new tc0
            dd r6 = p000.tc0.f10309
            java.lang.String r15 = r15.f8090
            r5.<init>(r6, r15)
            r4.add(r5)
            int r15 = r3.size()
            r5 = r1
        L7f:
            if (r5 >= r15) goto Lb6
            java.lang.String r6 = r3.m6169(r5)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r6 = p000.AbstractC0602nx.m4134(r7, r6, r7)
            java.util.List r7 = p000.eg0.f3537
            boolean r7 = r7.contains(r6)
            if (r7 == 0) goto La7
            java.lang.String r7 = "te"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto Lb3
            java.lang.String r7 = r3.m6171(r5)
            java.lang.String r8 = "trailers"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto Lb3
        La7:
            tc0 r7 = new tc0
            java.lang.String r8 = r3.m6171(r5)
            r7.<init>(r6, r8)
            r4.add(r7)
        Lb3:
            int r5 = r5 + 1
            goto L7f
        Lb6:
            dg0 r8 = r14.f3541
            r8.getClass()
            r9 = r0 ^ 1
            lg0 r15 = r8.f3129
            monitor-enter(r15)
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L146
            int r3 = r8.f3136     // Catch: java.lang.Throwable -> Lce
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r3 <= r5) goto Ld2
            sz r3 = p000.EnumC0816sz.f10091     // Catch: java.lang.Throwable -> Lce
            r8.m1741(r3)     // Catch: java.lang.Throwable -> Lce
            goto Ld2
        Lce:
            r0 = move-exception
            r14 = r0
            goto L14f
        Ld2:
            boolean r3 = r8.f3137     // Catch: java.lang.Throwable -> Lce
            if (r3 != 0) goto L149
            int r7 = r8.f3136     // Catch: java.lang.Throwable -> Lce
            int r3 = r7 + 2
            r8.f3136 = r3     // Catch: java.lang.Throwable -> Lce
            kg0 r6 = new kg0     // Catch: java.lang.Throwable -> Lce
            r11 = 0
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto Lf5
            long r10 = r8.f3151     // Catch: java.lang.Throwable -> Lce
            long r12 = r8.f3127     // Catch: java.lang.Throwable -> Lce
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 >= 0) goto Lf5
            long r10 = r6.f5902     // Catch: java.lang.Throwable -> Lce
            long r12 = r6.f5903     // Catch: java.lang.Throwable -> Lce
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto Lf6
        Lf5:
            r1 = r2
        Lf6:
            boolean r0 = r6.m3249()     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto L105
            java.util.LinkedHashMap r0 = r8.f3133     // Catch: java.lang.Throwable -> Lce
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lce
            r0.put(r2, r6)     // Catch: java.lang.Throwable -> Lce
        L105:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L146
            lg0 r0 = r8.f3129     // Catch: java.lang.Throwable -> L146
            r0.m3561(r9, r7, r4)     // Catch: java.lang.Throwable -> L146
            monitor-exit(r15)
            if (r1 == 0) goto L113
            lg0 r15 = r8.f3129
            r15.flush()
        L113:
            r14.f3542 = r6
            boolean r15 = r14.f3544
            kg0 r0 = r14.f3542
            if (r15 != 0) goto L138
            r0.getClass()
            jg0 r15 = r0.f5908
            yk1 r0 = r14.f3540
            int r0 = r0.f12666
            long r0 = (long) r0
            r15.mo2874(r0)
            kg0 r15 = r14.f3542
            r15.getClass()
            jg0 r15 = r15.f5909
            yk1 r14 = r14.f3540
            int r14 = r14.f12667
            long r0 = (long) r14
            r15.mo2874(r0)
            return
        L138:
            r0.getClass()
            sz r14 = p000.EnumC0816sz.f10092
            r0.m3246(r14)
            java.lang.String r14 = "Canceled"
            p000.C1080.m7281(r14)
            return
        L146:
            r0 = move-exception
            r14 = r0
            goto L151
        L149:
            no r14 = new no     // Catch: java.lang.Throwable -> Lce
            r14.<init>()     // Catch: java.lang.Throwable -> Lce
            throw r14     // Catch: java.lang.Throwable -> Lce
        L14f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L146
            throw r14     // Catch: java.lang.Throwable -> L146
        L151:
            monitor-exit(r15)
            throw r14
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: β */
    public final p000.rx1 mo645(p000.zn1 r1) {
            r0 = this;
            kg0 r0 = r0.f3542
            r0.getClass()
            ig0 r0 = r0.f5906
            return r0
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: γ */
    public final void mo646() {
            r0 = this;
            kg0 r0 = r0.f3542
            r0.getClass()
            hg0 r0 = r0.f5907
            r0.close()
            return
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: δ */
    public final boolean mo647() {
            r4 = this;
            kg0 r4 = r4.f3542
            r0 = 0
            if (r4 == 0) goto L20
            monitor-enter(r4)
            ig0 r1 = r4.f5906     // Catch: java.lang.Throwable -> L17
            boolean r2 = r1.f5070     // Catch: java.lang.Throwable -> L17
            r3 = 1
            if (r2 == 0) goto L19
            sc r1 = r1.f5072     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.m5454()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            r1 = r3
            goto L1a
        L17:
            r0 = move-exception
            goto L1e
        L19:
            r1 = r0
        L1a:
            monitor-exit(r4)
            if (r1 != r3) goto L20
            return r3
        L1e:
            monitor-exit(r4)
            throw r0
        L20:
            return r0
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: ε */
    public final void mo648() {
            r0 = this;
            dg0 r0 = r0.f3541
            r0.flush()
            return
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: ζ */
    public final p000.lx1 mo649() {
            r0 = this;
            kg0 r0 = r0.f3542
            r0.getClass()
            return r0
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: η */
    public final p000.a00 mo650() {
            r0 = this;
            vk1 r0 = r0.f3539
            return r0
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: θ */
    public final long mo651(p000.zn1 r1) {
            r0 = this;
            boolean r0 = p000.mg0.m3822(r1)
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            long r0 = p000.ud2.m5847(r1)
            return r0
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: ι */
    public final p000.iw1 mo652(p000.C0384i5 r1, long r2) {
            r0 = this;
            kg0 r0 = r0.f3542
            r0.getClass()
            hg0 r0 = r0.f5907
            return r0
    }

    @Override // p000.b00
    /* JADX INFO: renamed from: κ */
    public final p000.yn1 mo653(boolean r11) {
            r10 = this;
            kg0 r0 = r10.f3542
            if (r0 == 0) goto L103
            monitor-enter(r0)
        L5:
            java.util.ArrayDeque r1 = r0.f5904     // Catch: java.lang.Throwable -> L35
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L35
            r2 = 0
            if (r1 == 0) goto L5a
            sz r1 = r0.m3247()     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L5a
            r1 = 1
            if (r11 != 0) goto L2c
            dg0 r3 = r0.f5900     // Catch: java.lang.Throwable -> L35
            r3.getClass()     // Catch: java.lang.Throwable -> L35
            hg0 r3 = r0.f5907     // Catch: java.lang.Throwable -> L35
            boolean r4 = r3.f4727     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L29
            boolean r3 = r3.f4725     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L27
            goto L29
        L27:
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            if (r3 == 0) goto L2d
        L2c:
            r2 = r1
        L2d:
            if (r2 == 0) goto L38
            jg0 r1 = r0.f5908     // Catch: java.lang.Throwable -> L35
            r1.m2628()     // Catch: java.lang.Throwable -> L35
            goto L38
        L35:
            r10 = move-exception
            goto L101
        L38:
            r0.wait()     // Catch: java.lang.Throwable -> L43 java.lang.InterruptedException -> L45
            if (r2 == 0) goto L5
            jg0 r1 = r0.f5908     // Catch: java.lang.Throwable -> L35
            r1.m2958()     // Catch: java.lang.Throwable -> L35
            goto L5
        L43:
            r10 = move-exception
            goto L52
        L45:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L43
            r10.interrupt()     // Catch: java.lang.Throwable -> L43
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L43
            r10.<init>()     // Catch: java.lang.Throwable -> L43
            throw r10     // Catch: java.lang.Throwable -> L43
        L52:
            if (r2 == 0) goto L59
            jg0 r11 = r0.f5908     // Catch: java.lang.Throwable -> L35
            r11.m2958()     // Catch: java.lang.Throwable -> L35
        L59:
            throw r10     // Catch: java.lang.Throwable -> L35
        L5a:
            java.util.ArrayDeque r1 = r0.f5904     // Catch: java.lang.Throwable -> L35
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto Lef
            java.util.ArrayDeque r1 = r0.f5904     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L35
            vc0 r1 = (p000.vc0) r1     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)
            zj1 r10 = r10.f3543
            r10.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 20
            r0.<init>(r3)
            int r3 = r1.size()
            r4 = 0
            r5 = r2
            r6 = r4
        L81:
            if (r5 >= r3) goto Lb7
            java.lang.String r7 = r1.m6169(r5)
            java.lang.String r8 = r1.m6171(r5)
            java.lang.String r9 = ":status"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L9e
            java.lang.String r6 = "HTTP/1.1 "
            java.lang.String r6 = r6.concat(r8)
            n2 r6 = p000.g81.m2281(r6)
            goto Lb4
        L9e:
            java.util.List r9 = p000.eg0.f3538
            boolean r9 = r9.contains(r7)
            if (r9 != 0) goto Lb4
            r0.add(r7)
            java.lang.CharSequence r7 = p000.q02.m4660(r8)
            java.lang.String r7 = r7.toString()
            r0.add(r7)
        Lb4:
            int r5 = r5 + 1
            goto L81
        Lb7:
            if (r6 == 0) goto Le7
            yn1 r1 = new yn1
            r1.<init>()
            r1.f12692 = r10
            int r10 = r6.f7358
            r1.f12693 = r10
            java.lang.Object r10 = r6.f7360
            java.lang.String r10 = (java.lang.String) r10
            r1.f12694 = r10
            vc0 r10 = new vc0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r10.<init>(r0)
            uc0 r10 = r10.m6170()
            r1.f12696 = r10
            if (r11 == 0) goto Le6
            int r10 = r1.f12693
            r11 = 100
            if (r10 != r11) goto Le6
            return r4
        Le6:
            return r1
        Le7:
            java.net.ProtocolException r10 = new java.net.ProtocolException
            java.lang.String r11 = "Expected ':status' header not present"
            r10.<init>(r11)
            throw r10
        Lef:
            java.io.IOException r10 = r0.f5911     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto Lf4
            goto L100
        Lf4:
            o02 r10 = new o02     // Catch: java.lang.Throwable -> L35
            sz r11 = r0.m3247()     // Catch: java.lang.Throwable -> L35
            r11.getClass()     // Catch: java.lang.Throwable -> L35
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L35
        L100:
            throw r10     // Catch: java.lang.Throwable -> L35
        L101:
            monitor-exit(r0)
            throw r10
        L103:
            java.lang.String r10 = "stream wasn't created"
            p000.C1080.m7281(r10)
            r10 = 0
            return r10
    }
}
