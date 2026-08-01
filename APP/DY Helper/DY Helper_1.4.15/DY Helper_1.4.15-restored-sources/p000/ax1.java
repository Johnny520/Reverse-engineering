package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ax1 {

    /* JADX INFO: renamed from: α */
    public static final p000.eu1 f1360 = null;

    /* JADX INFO: renamed from: β */
    public static final p000.C0538m6 f1361 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.lang.Object f1362 = null;

    /* JADX INFO: renamed from: δ */
    public static p000.yw1 f1363;

    /* JADX INFO: renamed from: ε */
    public static long f1364;

    /* JADX INFO: renamed from: ζ */
    public static final p000.g11 f1365 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.C0571n2 f1366 = null;

    /* JADX INFO: renamed from: θ */
    public static java.lang.Object f1367;

    /* JADX INFO: renamed from: ι */
    public static java.lang.Object f1368;

    /* JADX INFO: renamed from: κ */
    public static final p000.sa0 f1369 = null;

    /* JADX INFO: renamed from: λ */
    public static final p000.C0421j7 f1370 = null;

    static {
            eu1 r0 = new eu1
            r1 = 24
            r0.<init>(r1)
            p000.ax1.f1360 = r0
            m6 r0 = new m6
            r1 = 11
            r0.<init>(r1)
            p000.ax1.f1361 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.ax1.f1362 = r0
            yw1 r4 = p000.yw1.f12861
            p000.ax1.f1363 = r4
            r0 = 1
            long r0 = (long) r0
            long r2 = r0 + r0
            p000.ax1.f1364 = r2
            g11 r2 = new g11
            r2.<init>()
            r3 = 16
            long[] r5 = new long[r3]
            r2.f4207 = r5
            int[] r5 = new int[r3]
            r2.f4208 = r5
            int[] r5 = new int[r3]
            r7 = 0
            r6 = r7
        L36:
            if (r6 >= r3) goto L3e
            int r8 = r6 + 1
            r5[r6] = r8
            r6 = r8
            goto L36
        L3e:
            r2.f4209 = r5
            p000.ax1.f1365 = r2
            n2 r2 = new n2
            r5 = 3
            r2.<init>(r5)
            int[] r5 = new int[r3]
            r2.f7359 = r5
            mb2[] r3 = new p000.mb2[r3]
            r2.f7360 = r3
            p000.ax1.f1366 = r2
            jz r2 = p000.C0450jz.f5672
            p000.ax1.f1367 = r2
            p000.ax1.f1368 = r2
            long r2 = p000.ax1.f1364
            long r0 = r0 + r2
            p000.ax1.f1364 = r0
            sa0 r1 = new sa0
            s20 r6 = new s20
            r0 = 24
            r6.<init>(r0)
            r5 = 0
            r1.<init>(r2, r4, r5, r6)
            yw1 r0 = p000.ax1.f1363
            long r2 = r1.f10483
            yw1 r0 = r0.m7048(r2)
            p000.ax1.f1363 = r0
            p000.ax1.f1369 = r1
            j7 r0 = new j7
            r0.<init>(r7)
            p000.ax1.f1370 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m619() {
            eu1 r0 = p000.ax1.f1360
            m623(r0)
            return
    }

    /* JADX INFO: renamed from: β */
    public static final java.util.HashMap m620(long r22, p000.f21 r24, p000.yw1 r25) {
            c21 r0 = r24.mo2014()
            if (r0 != 0) goto La
        L6:
            r17 = 0
            goto Ldf
        La:
            long r2 = r24.mo5759()
            yw1 r4 = r24.mo5758()
            yw1 r4 = r4.m7048(r2)
            r5 = r24
            yw1 r6 = r5.f3732
            yw1 r4 = r4.m7047(r6)
            java.lang.Object[] r6 = r0.f1942
            long[] r0 = r0.f1941
            int r7 = r0.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L6
            r9 = 0
            r10 = 0
        L29:
            r11 = r0[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto Lca
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L43:
            if (r15 >= r13) goto Lbd
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto La3
            int r16 = r9 << 3
            int r16 = r16 + r15
            r16 = r6[r16]
            r17 = 0
            r1 = r16
            i02 r1 = (p000.i02) r1
            k02 r8 = r1.mo2200()
            r20 = r0
            r18 = r14
            r19 = r15
            r14 = r22
            r0 = r25
            k02 r5 = m637(r8, r14, r0)
            if (r5 != 0) goto L70
            goto L76
        L70:
            k02 r0 = m637(r8, r2, r4)
            if (r0 != 0) goto L77
        L76:
            goto La0
        L77:
            boolean r21 = r5.equals(r0)
            if (r21 != 0) goto La0
            r21 = r4
            yw1 r4 = r24.mo5758()
            k02 r4 = m637(r8, r2, r4)
            if (r4 == 0) goto L9c
            k02 r0 = r1.mo2578(r0, r5, r4)
            if (r0 == 0) goto Ldf
            if (r10 != 0) goto L96
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
        L96:
            r1 = r10
            r10.put(r5, r0)
            r10 = r1
            goto Laf
        L9c:
            m636()
            throw r17
        La0:
            r21 = r4
            goto Laf
        La3:
            r20 = r0
            r21 = r4
            r18 = r14
            r19 = r15
            r17 = 0
            r14 = r22
        Laf:
            long r11 = r11 >> r18
            int r0 = r19 + 1
            r5 = r24
            r15 = r0
            r14 = r18
            r0 = r20
            r4 = r21
            goto L43
        Lbd:
            r20 = r0
            r21 = r4
            r0 = r14
            r17 = 0
            r14 = r22
            if (r13 != r0) goto Lc9
            goto Ld2
        Lc9:
            return r10
        Lca:
            r14 = r22
            r20 = r0
            r21 = r4
            r17 = 0
        Ld2:
            if (r9 == r7) goto Lde
            int r9 = r9 + 1
            r5 = r24
            r0 = r20
            r4 = r21
            goto L29
        Lde:
            return r10
        Ldf:
            return r17
    }

    /* JADX INFO: renamed from: γ */
    public static final void m621(p000.tw1 r3) {
            yw1 r0 = p000.ax1.f1363
            long r1 = r3.mo5759()
            boolean r0 = r0.m7046(r1)
            if (r0 != 0) goto L6c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Snapshot is not open: snapshotId="
            r0.<init>(r1)
            long r1 = r3.mo5759()
            r0.append(r1)
            java.lang.String r1 = ", disposed="
            r0.append(r1)
            boolean r1 = r3.f10484
            r0.append(r1)
            java.lang.String r1 = ", applied="
            r0.append(r1)
            boolean r1 = r3 instanceof p000.f21
            if (r1 == 0) goto L30
            f21 r3 = (p000.f21) r3
            goto L31
        L30:
            r3 = 0
        L31:
            if (r3 == 0) goto L3a
            boolean r3 = r3.f3735
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L3c
        L3a:
            java.lang.String r3 = "read-only"
        L3c:
            r0.append(r3)
            java.lang.String r3 = ", lowestPin="
            r0.append(r3)
            java.lang.Object r3 = p000.ax1.f1362
            monitor-enter(r3)
            g11 r1 = p000.ax1.f1365     // Catch: java.lang.Throwable -> L69
            int r2 = r1.f4205     // Catch: java.lang.Throwable -> L69
            if (r2 <= 0) goto L55
            java.lang.Object r1 = r1.f4207     // Catch: java.lang.Throwable -> L69
            long[] r1 = (long[]) r1     // Catch: java.lang.Throwable -> L69
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L69
            goto L57
        L55:
            r1 = -1
        L57:
            monitor-exit(r3)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L69:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L6c:
            return
    }

    /* JADX INFO: renamed from: δ */
    public static final p000.yw1 m622(p000.yw1 r2, long r3, long r5) {
        L0:
            int r0 = p000.ln0.m3633(r3, r5)
            if (r0 >= 0) goto Le
            yw1 r2 = r2.m7048(r3)
            r0 = 1
            long r0 = (long) r0
            long r3 = r3 + r0
            goto L0
        Le:
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public static final java.lang.Object m623(p000.a80 r15) {
            sa0 r0 = p000.ax1.f1369
            java.lang.Object r1 = p000.ax1.f1362
            monitor-enter(r1)
            c21 r2 = r0.f3730     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            j7 r3 = p000.ax1.f1370     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L97
        L13:
            java.lang.Object r15 = m640(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L44
            r3 = -1
            java.lang.Object r4 = p000.ax1.f1367     // Catch: java.lang.Throwable -> L36
            vq1 r5 = new vq1     // Catch: java.lang.Throwable -> L36
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L36
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L36
            r7 = r1
        L28:
            if (r7 >= r6) goto L38
            java.lang.Object r8 = r4.get(r7)     // Catch: java.lang.Throwable -> L36
            e80 r8 = (p000.e80) r8     // Catch: java.lang.Throwable -> L36
            r8.invoke(r5, r0)     // Catch: java.lang.Throwable -> L36
            int r7 = r7 + 1
            goto L28
        L36:
            r15 = move-exception
            goto L3e
        L38:
            j7 r0 = p000.ax1.f1370
            r0.addAndGet(r3)
            goto L44
        L3e:
            j7 r0 = p000.ax1.f1370
            r0.addAndGet(r3)
            throw r15
        L44:
            java.lang.Object r0 = p000.ax1.f1362
            monitor-enter(r0)
            m624()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L93
            java.lang.Object[] r3 = r2.f1942     // Catch: java.lang.Throwable -> L86
            long[] r2 = r2.f1941     // Catch: java.lang.Throwable -> L86
            int r4 = r2.length     // Catch: java.lang.Throwable -> L86
            int r4 = r4 + (-2)
            if (r4 < 0) goto L93
            r5 = r1
        L56:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L86
            long r8 = ~r6     // Catch: java.lang.Throwable -> L86
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8e
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L86
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L70:
            if (r10 >= r8) goto L8c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L88
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L86
            i02 r11 = (p000.i02) r11     // Catch: java.lang.Throwable -> L86
            m635(r11)     // Catch: java.lang.Throwable -> L86
            goto L88
        L86:
            r15 = move-exception
            goto L95
        L88:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L70
        L8c:
            if (r8 != r9) goto L93
        L8e:
            if (r5 == r4) goto L93
            int r5 = r5 + 1
            goto L56
        L93:
            monitor-exit(r0)
            return r15
        L95:
            monitor-exit(r0)
            throw r15
        L97:
            monitor-exit(r1)
            throw r15
    }

    /* JADX INFO: renamed from: ζ */
    public static final void m624() {
            n2 r0 = p000.ax1.f1366
            int r1 = r0.f7358
            r2 = 0
            r3 = r2
            r4 = r3
        L7:
            r5 = 0
            if (r3 >= r1) goto L35
            java.lang.Object r6 = r0.f7360
            mb2[] r6 = (p000.mb2[]) r6
            r6 = r6[r3]
            if (r6 == 0) goto L16
            java.lang.Object r5 = r6.get()
        L16:
            if (r5 == 0) goto L32
            i02 r5 = (p000.i02) r5
            boolean r5 = m634(r5)
            if (r5 == 0) goto L32
            if (r4 == r3) goto L30
            java.lang.Object r5 = r0.f7360
            mb2[] r5 = (p000.mb2[]) r5
            r5[r4] = r6
            java.lang.Object r5 = r0.f7359
            int[] r5 = (int[]) r5
            r6 = r5[r3]
            r5[r4] = r6
        L30:
            int r4 = r4 + 1
        L32:
            int r3 = r3 + 1
            goto L7
        L35:
            r3 = r4
        L36:
            if (r3 >= r1) goto L47
            java.lang.Object r6 = r0.f7360
            mb2[] r6 = (p000.mb2[]) r6
            r6[r3] = r5
            java.lang.Object r6 = r0.f7359
            int[] r6 = (int[]) r6
            r6[r3] = r2
            int r3 = r3 + 1
            goto L36
        L47:
            if (r4 == r1) goto L4b
            r0.f7358 = r4
        L4b:
            return
    }

    /* JADX INFO: renamed from: η */
    public static final p000.tw1 m625(p000.tw1 r8, p000.a80 r9, boolean r10) {
            boolean r0 = r8 instanceof p000.f21
            if (r0 != 0) goto Le
            if (r8 != 0) goto L7
            goto Le
        L7:
            v52 r0 = new v52
            r1 = 0
            r0.<init>(r8, r9, r1, r10)
            return r0
        Le:
            u52 r2 = new u52
            if (r0 == 0) goto L16
            f21 r8 = (p000.f21) r8
        L14:
            r3 = r8
            goto L18
        L16:
            r8 = 0
            goto L14
        L18:
            r5 = 0
            r6 = 0
            r4 = r9
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }

    /* JADX INFO: renamed from: θ */
    public static final p000.k02 m626(p000.k02 r4) {
            tw1 r0 = m628()
            long r1 = r0.mo5759()
            yw1 r0 = r0.mo5758()
            k02 r0 = m637(r4, r1, r0)
            if (r0 != 0) goto L31
            java.lang.Object r0 = p000.ax1.f1362
            monitor-enter(r0)
            tw1 r1 = m628()     // Catch: java.lang.Throwable -> L2e
            long r2 = r1.mo5759()     // Catch: java.lang.Throwable -> L2e
            yw1 r1 = r1.mo5758()     // Catch: java.lang.Throwable -> L2e
            k02 r4 = m637(r4, r2, r1)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)
            if (r4 == 0) goto L29
            return r4
        L29:
            m636()
            r4 = 0
            throw r4
        L2e:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L31:
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public static final p000.k02 m627(p000.k02 r3, p000.tw1 r4) {
            long r0 = r4.mo5759()
            yw1 r2 = r4.mo5758()
            k02 r0 = m637(r3, r0, r2)
            if (r0 != 0) goto L29
            java.lang.Object r0 = p000.ax1.f1362
            monitor-enter(r0)
            long r1 = r4.mo5759()     // Catch: java.lang.Throwable -> L26
            yw1 r4 = r4.mo5758()     // Catch: java.lang.Throwable -> L26
            k02 r3 = m637(r3, r1, r4)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            if (r3 == 0) goto L21
            return r3
        L21:
            m636()
            r3 = 0
            throw r3
        L26:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L29:
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static final p000.tw1 m628() {
            m6 r0 = p000.ax1.f1361
            java.lang.Object r0 = r0.m3786()
            tw1 r0 = (p000.tw1) r0
            if (r0 != 0) goto Lc
            sa0 r0 = p000.ax1.f1369
        Lc:
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static final p000.a80 m629(p000.a80 r1, p000.a80 r2, boolean r3) {
            if (r3 == 0) goto L3
            goto L4
        L3:
            r2 = 0
        L4:
            if (r1 == 0) goto L11
            if (r2 == 0) goto L11
            if (r1 == r2) goto L11
            zw1 r3 = new zw1
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
        L11:
            if (r1 != 0) goto L14
            return r2
        L14:
            return r1
    }

    /* JADX INFO: renamed from: μ */
    public static final p000.a80 m630(p000.a80 r2, p000.a80 r3) {
            if (r2 == 0) goto Ld
            if (r3 == 0) goto Ld
            if (r2 == r3) goto Ld
            zw1 r0 = new zw1
            r1 = 1
            r0.<init>(r2, r3, r1)
            return r0
        Ld:
            if (r2 != 0) goto L10
            return r3
        L10:
            return r2
    }

    /* JADX INFO: renamed from: ν */
    public static final p000.k02 m631(p000.k02 r10, p000.i02 r11) {
            k02 r0 = r11.mo2200()
            long r1 = p000.ax1.f1364
            g11 r3 = p000.ax1.f1365
            int r4 = r3.f4205
            if (r4 <= 0) goto L13
            java.lang.Object r1 = r3.f4207
            long[] r1 = (long[]) r1
            r2 = 0
            r1 = r1[r2]
        L13:
            r3 = 1
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L18:
            if (r0 == 0) goto L4a
            long r5 = r0.f5697
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L23
            goto L43
        L23:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L47
            int r7 = p000.ln0.m3633(r5, r1)
            if (r7 > 0) goto L47
            yw1 r7 = p000.yw1.f12861
            boolean r5 = r7.m7046(r5)
            if (r5 != 0) goto L47
            if (r4 != 0) goto L39
            r4 = r0
            goto L47
        L39:
            long r1 = r0.f5697
            long r5 = r4.f5697
            int r1 = p000.ln0.m3633(r1, r5)
            if (r1 >= 0) goto L45
        L43:
            r3 = r0
            goto L4a
        L45:
            r3 = r4
            goto L4a
        L47:
            k02 r0 = r0.f5698
            goto L18
        L4a:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L54
            r3.f5697 = r0
            return r3
        L54:
            k02 r10 = r10.mo1084(r0)
            k02 r0 = r11.mo2200()
            r10.f5698 = r0
            r11.mo2201(r10)
            return r10
    }

    /* JADX INFO: renamed from: ξ */
    public static final void m632(p000.tw1 r1, p000.i02 r2) {
            int r0 = r1.mo2003()
            int r0 = r0 + 1
            r1.mo2010(r0)
            a80 r1 = r1.mo2004()
            if (r1 == 0) goto L12
            r1.invoke(r2)
        L12:
            return
    }

    /* JADX INFO: renamed from: ο */
    public static final p000.k02 m633(p000.k02 r4, p000.j02 r5, p000.tw1 r6, p000.k02 r7) {
            boolean r0 = r6.mo2002()
            if (r0 == 0) goto L9
            r6.mo2008(r5)
        L9:
            long r0 = r6.mo5759()
            long r2 = r7.f5697
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L14
            return r7
        L14:
            java.lang.Object r2 = p000.ax1.f1362
            monitor-enter(r2)
            k02 r4 = m631(r4, r5)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r2)
            r4.f5697 = r0
            long r0 = r7.f5697
            r7 = 1
            long r2 = (long) r7
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L29
            r6.mo2008(r5)
        L29:
            return r4
        L2a:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
    }

    /* JADX INFO: renamed from: π */
    public static final boolean m634(p000.i02 r15) {
            k02 r0 = r15.mo2200()
            long r1 = p000.ax1.f1364
            g11 r3 = p000.ax1.f1365
            int r4 = r3.f4205
            r5 = 0
            if (r4 <= 0) goto L13
            java.lang.Object r1 = r3.f4207
            long[] r1 = (long[]) r1
            r1 = r1[r5]
        L13:
            r3 = 0
            r4 = r3
            r6 = r5
        L16:
            if (r0 == 0) goto L67
            long r7 = r0.f5697
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L64
            int r7 = p000.ln0.m3633(r7, r1)
            if (r7 >= 0) goto L62
            if (r3 != 0) goto L2c
            int r6 = r6 + 1
            r3 = r0
            goto L64
        L2c:
            long r7 = r0.f5697
            long r11 = r3.f5697
            int r7 = p000.ln0.m3633(r7, r11)
            if (r7 >= 0) goto L39
            r7 = r3
            r3 = r0
            goto L3a
        L39:
            r7 = r0
        L3a:
            if (r4 != 0) goto L5b
            k02 r4 = r15.mo2200()
            r8 = r4
        L41:
            if (r4 == 0) goto L5a
            long r11 = r4.f5697
            int r11 = p000.ln0.m3633(r11, r1)
            if (r11 < 0) goto L4c
            goto L5b
        L4c:
            long r11 = r8.f5697
            long r13 = r4.f5697
            int r11 = p000.ln0.m3633(r11, r13)
            if (r11 >= 0) goto L57
            r8 = r4
        L57:
            k02 r4 = r4.f5698
            goto L41
        L5a:
            r4 = r8
        L5b:
            r3.f5697 = r9
            r3.mo1083(r4)
            r3 = r7
            goto L64
        L62:
            int r6 = r6 + 1
        L64:
            k02 r0 = r0.f5698
            goto L16
        L67:
            r15 = 1
            if (r6 <= r15) goto L6b
            return r15
        L6b:
            return r5
    }

    /* JADX INFO: renamed from: ρ */
    public static final void m635(p000.i02 r10) {
            boolean r0 = m634(r10)
            if (r0 == 0) goto Leb
            n2 r0 = p000.ax1.f1366
            int r1 = r0.f7358
            int r2 = java.lang.System.identityHashCode(r10)
            r3 = 0
            r4 = -1
            if (r1 <= 0) goto L94
            int r5 = r0.f7358
            int r5 = r5 + (-1)
            r6 = r3
        L17:
            if (r6 > r5) goto L8e
            int r7 = r6 + r5
            int r7 = r7 >>> 1
            java.lang.Object r8 = r0.f7359
            int[] r8 = (int[]) r8
            r8 = r8[r7]
            if (r8 >= r2) goto L28
            int r6 = r7 + 1
            goto L17
        L28:
            if (r8 <= r2) goto L2d
            int r5 = r7 + (-1)
            goto L17
        L2d:
            java.lang.Object r5 = r0.f7360
            mb2[] r5 = (p000.mb2[]) r5
            r5 = r5[r7]
            r6 = 0
            if (r5 == 0) goto L3b
            java.lang.Object r5 = r5.get()
            goto L3c
        L3b:
            r5 = r6
        L3c:
            if (r10 != r5) goto L40
        L3e:
            r4 = r7
            goto L91
        L40:
            int r5 = r7 + (-1)
        L42:
            if (r4 >= r5) goto L62
            java.lang.Object r8 = r0.f7359
            int[] r8 = (int[]) r8
            r8 = r8[r5]
            if (r8 == r2) goto L4d
            goto L62
        L4d:
            java.lang.Object r8 = r0.f7360
            mb2[] r8 = (p000.mb2[]) r8
            r8 = r8[r5]
            if (r8 == 0) goto L5a
            java.lang.Object r8 = r8.get()
            goto L5b
        L5a:
            r8 = r6
        L5b:
            if (r8 != r10) goto L5f
            r4 = r5
            goto L91
        L5f:
            int r5 = r5 + (-1)
            goto L42
        L62:
            int r7 = r7 + 1
            int r4 = r0.f7358
        L66:
            if (r7 >= r4) goto L88
            java.lang.Object r5 = r0.f7359
            int[] r5 = (int[]) r5
            r5 = r5[r7]
            if (r5 == r2) goto L74
            int r7 = r7 + 1
            int r4 = -r7
            goto L91
        L74:
            java.lang.Object r5 = r0.f7360
            mb2[] r5 = (p000.mb2[]) r5
            r5 = r5[r7]
            if (r5 == 0) goto L81
            java.lang.Object r5 = r5.get()
            goto L82
        L81:
            r5 = r6
        L82:
            if (r5 != r10) goto L85
            goto L3e
        L85:
            int r7 = r7 + 1
            goto L66
        L88:
            int r4 = r0.f7358
            int r4 = r4 + 1
            int r4 = -r4
            goto L91
        L8e:
            int r6 = r6 + 1
            int r4 = -r6
        L91:
            if (r4 < 0) goto L94
            goto Leb
        L94:
            int r4 = r4 + 1
            int r4 = -r4
            java.lang.Object r5 = r0.f7360
            mb2[] r5 = (p000.mb2[]) r5
            int r6 = r5.length
            if (r1 != r6) goto Lc6
            int r6 = r6 * 2
            mb2[] r7 = new p000.mb2[r6]
            int[] r6 = new int[r6]
            int r8 = r4 + 1
            int r9 = r1 - r4
            java.lang.System.arraycopy(r5, r4, r7, r8, r9)
            java.lang.Object r5 = r0.f7360
            mb2[] r5 = (p000.mb2[]) r5
            java.lang.System.arraycopy(r5, r3, r7, r3, r4)
            java.lang.Object r5 = r0.f7359
            int[] r5 = (int[]) r5
            p000.AbstractC0312g7.m2235(r8, r4, r1, r5, r6)
            java.lang.Object r1 = r0.f7359
            int[] r1 = (int[]) r1
            r5 = 6
            p000.AbstractC0312g7.m2239(r3, r4, r5, r1, r6)
            r0.f7360 = r7
            r0.f7359 = r6
            goto Ld4
        Lc6:
            int r3 = r4 + 1
            int r6 = r1 - r4
            java.lang.System.arraycopy(r5, r4, r5, r3, r6)
            java.lang.Object r5 = r0.f7359
            int[] r5 = (int[]) r5
            p000.AbstractC0312g7.m2235(r3, r4, r1, r5, r5)
        Ld4:
            java.lang.Object r1 = r0.f7360
            mb2[] r1 = (p000.mb2[]) r1
            mb2 r3 = new mb2
            r3.<init>(r10)
            r1[r4] = r3
            java.lang.Object r10 = r0.f7359
            int[] r10 = (int[]) r10
            r10[r4] = r2
            int r10 = r0.f7358
            int r10 = r10 + 1
            r0.f7358 = r10
        Leb:
            return
    }

    /* JADX INFO: renamed from: σ */
    public static final void m636() {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: τ */
    public static final p000.k02 m637(p000.k02 r6, long r7, p000.yw1 r9) {
            r0 = 0
            r1 = r0
        L2:
            if (r6 == 0) goto L29
            long r2 = r6.f5697
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L26
            int r4 = p000.ln0.m3633(r2, r7)
            if (r4 > 0) goto L26
            boolean r2 = r9.m7046(r2)
            if (r2 != 0) goto L26
            if (r1 != 0) goto L1b
            goto L25
        L1b:
            long r2 = r1.f5697
            long r4 = r6.f5697
            int r2 = p000.ln0.m3633(r2, r4)
            if (r2 >= 0) goto L26
        L25:
            r1 = r6
        L26:
            k02 r6 = r6.f5698
            goto L2
        L29:
            if (r1 == 0) goto L2c
            return r1
        L2c:
            return r0
    }

    /* JADX INFO: renamed from: υ */
    public static final p000.k02 m638(p000.k02 r3, p000.i02 r4) {
            tw1 r0 = m628()
            a80 r1 = r0.mo2001()
            if (r1 == 0) goto Ld
            r1.invoke(r4)
        Ld:
            long r1 = r0.mo5759()
            yw1 r0 = r0.mo5758()
            k02 r3 = m637(r3, r1, r0)
            if (r3 != 0) goto L41
            java.lang.Object r3 = p000.ax1.f1362
            monitor-enter(r3)
            tw1 r0 = m628()     // Catch: java.lang.Throwable -> L3e
            k02 r4 = r4.mo2200()     // Catch: java.lang.Throwable -> L3e
            r4.getClass()     // Catch: java.lang.Throwable -> L3e
            long r1 = r0.mo5759()     // Catch: java.lang.Throwable -> L3e
            yw1 r0 = r0.mo5758()     // Catch: java.lang.Throwable -> L3e
            k02 r4 = m637(r4, r1, r0)     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L39
            monitor-exit(r3)
            return r4
        L39:
            m636()     // Catch: java.lang.Throwable -> L3e
            r4 = 0
            throw r4     // Catch: java.lang.Throwable -> L3e
        L3e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L41:
            return r3
    }

    /* JADX INFO: renamed from: φ */
    public static final void m639(int r10) {
            g11 r0 = p000.ax1.f1365
            java.lang.Object r1 = r0.f4209
            int[] r1 = (int[]) r1
            r1 = r1[r10]
            int r2 = r0.f4205
            int r2 = r2 + (-1)
            r0.m2229(r1, r2)
            int r2 = r0.f4205
            int r2 = r2 + (-1)
            r0.f4205 = r2
            java.lang.Object r2 = r0.f4207
            long[] r2 = (long[]) r2
            r3 = r2[r1]
            r5 = r1
        L1c:
            if (r5 <= 0) goto L31
            int r6 = r5 + 1
            int r6 = r6 >> 1
            int r6 = r6 + (-1)
            r7 = r2[r6]
            int r7 = p000.ln0.m3633(r7, r3)
            if (r7 <= 0) goto L31
            r0.m2229(r6, r5)
            r5 = r6
            goto L1c
        L31:
            java.lang.Object r2 = r0.f4207
            long[] r2 = (long[]) r2
            int r3 = r0.f4205
            int r3 = r3 >> 1
        L39:
            if (r1 >= r3) goto L6d
            int r4 = r1 + 1
            int r4 = r4 << 1
            int r5 = r4 + (-1)
            int r6 = r0.f4205
            if (r4 >= r6) goto L5e
            r6 = r2[r4]
            r8 = r2[r5]
            int r6 = p000.ln0.m3633(r6, r8)
            if (r6 >= 0) goto L5e
            r5 = r2[r4]
            r7 = r2[r1]
            int r5 = p000.ln0.m3633(r5, r7)
            if (r5 >= 0) goto L6d
            r0.m2229(r4, r1)
            r1 = r4
            goto L39
        L5e:
            r6 = r2[r5]
            r8 = r2[r1]
            int r4 = p000.ln0.m3633(r6, r8)
            if (r4 >= 0) goto L6d
            r0.m2229(r5, r1)
            r1 = r5
            goto L39
        L6d:
            java.lang.Object r1 = r0.f4209
            int[] r1 = (int[]) r1
            int r2 = r0.f4206
            r1[r10] = r2
            r0.f4206 = r10
            return
    }

    /* JADX INFO: renamed from: χ */
    public static final java.lang.Object m640(p000.sa0 r6, p000.a80 r7) {
            long r0 = r6.f10483
            yw1 r2 = p000.ax1.f1363
            yw1 r2 = r2.m7045(r0)
            java.lang.Object r7 = r7.invoke(r2)
            long r2 = p000.ax1.f1364
            r4 = 1
            long r4 = (long) r4
            long r4 = r4 + r2
            p000.ax1.f1364 = r4
            yw1 r4 = p000.ax1.f1363
            yw1 r0 = r4.m7045(r0)
            p000.ax1.f1363 = r0
            r6.f10483 = r2
            r6.f10482 = r0
            r0 = 0
            r6.f3729 = r0
            r0 = 0
            r6.f3730 = r0
            r6.m5761()
            yw1 r6 = p000.ax1.f1363
            yw1 r6 = r6.m7048(r2)
            p000.ax1.f1363 = r6
            return r7
    }

    /* JADX INFO: renamed from: ψ */
    public static final p000.k02 m641(p000.k02 r7, p000.i02 r8, p000.tw1 r9) {
            boolean r0 = r9.mo2002()
            if (r0 == 0) goto L9
            r9.mo2008(r8)
        L9:
            long r0 = r9.mo5759()
            yw1 r2 = r9.mo5758()
            k02 r7 = m637(r7, r0, r2)
            r2 = 0
            if (r7 == 0) goto L5e
            long r3 = r7.f5697
            long r5 = r9.mo5759()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L23
            return r7
        L23:
            java.lang.Object r3 = p000.ax1.f1362
            monitor-enter(r3)
            k02 r4 = r8.mo2200()     // Catch: java.lang.Throwable -> L56
            yw1 r5 = r9.mo5758()     // Catch: java.lang.Throwable -> L56
            k02 r4 = m637(r4, r0, r5)     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L58
            long r5 = r4.f5697     // Catch: java.lang.Throwable -> L56
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L3b
            goto L49
        L3b:
            k02 r0 = m631(r4, r8)     // Catch: java.lang.Throwable -> L56
            r0.mo1083(r4)     // Catch: java.lang.Throwable -> L56
            long r1 = r9.mo5759()     // Catch: java.lang.Throwable -> L56
            r0.f5697 = r1     // Catch: java.lang.Throwable -> L56
            r4 = r0
        L49:
            monitor-exit(r3)
            long r0 = r7.f5697
            r7 = 1
            long r2 = (long) r7
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L55
            r9.mo2008(r8)
        L55:
            return r4
        L56:
            r7 = move-exception
            goto L5c
        L58:
            m636()     // Catch: java.lang.Throwable -> L56
            throw r2     // Catch: java.lang.Throwable -> L56
        L5c:
            monitor-exit(r3)
            throw r7
        L5e:
            m636()
            throw r2
    }
}
