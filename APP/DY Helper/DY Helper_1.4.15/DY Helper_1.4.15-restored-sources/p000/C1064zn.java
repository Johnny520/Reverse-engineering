package p000;

/* JADX INFO: renamed from: zn */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1064zn implements p000.InterfaceC0841tn {

    /* JADX INFO: renamed from: Α */
    public int f13175;

    /* JADX INFO: renamed from: ε */
    public final p000.AbstractC0878un f13176;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0538m6 f13177;

    /* JADX INFO: renamed from: η */
    public final java.util.concurrent.atomic.AtomicReference f13178;

    /* JADX INFO: renamed from: θ */
    public final java.lang.Object f13179;

    /* JADX INFO: renamed from: ι */
    public final p000.e21 f13180;

    /* JADX INFO: renamed from: κ */
    public final p000.ow1 f13181;

    /* JADX INFO: renamed from: λ */
    public final p000.b21 f13182;

    /* JADX INFO: renamed from: μ */
    public final p000.c21 f13183;

    /* JADX INFO: renamed from: ν */
    public final p000.c21 f13184;

    /* JADX INFO: renamed from: ξ */
    public final p000.b21 f13185;

    /* JADX INFO: renamed from: ο */
    public final p000.C0466ke f13186;

    /* JADX INFO: renamed from: π */
    public final p000.C0466ke f13187;

    /* JADX INFO: renamed from: ρ */
    public final p000.b21 f13188;

    /* JADX INFO: renamed from: σ */
    public p000.b21 f13189;

    /* JADX INFO: renamed from: τ */
    public boolean f13190;

    /* JADX INFO: renamed from: υ */
    public p000.C1064zn f13191;

    /* JADX INFO: renamed from: φ */
    public int f13192;

    /* JADX INFO: renamed from: χ */
    public final p000.C0568n f13193;

    /* JADX INFO: renamed from: ψ */
    public final p000.en1 f13194;

    /* JADX INFO: renamed from: ω */
    public final p000.v80 f13195;

    public C1064zn(p000.AbstractC0878un r11, p000.C0538m6 r12) {
            r10 = this;
            r10.<init>()
            r10.f13176 = r11
            r10.f13177 = r12
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            r10.f13178 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r10.f13179 = r0
            c21 r0 = new c21
            r0.<init>()
            e21 r5 = new e21
            r5.<init>(r0)
            r10.f13180 = r5
            ow1 r0 = new ow1
            r0.<init>()
            boolean r1 = r11.mo3319()
            if (r1 == 0) goto L34
            n11 r1 = new n11
            r1.<init>()
            r0.f8296 = r1
        L34:
            boolean r1 = r11.mo3321()
            if (r1 == 0) goto L3d
            r0.m4301()
        L3d:
            r10.f13181 = r0
            b21 r1 = p000.i81.m2660()
            r10.f13182 = r1
            c21 r1 = new c21
            r1.<init>()
            r10.f13183 = r1
            c21 r1 = new c21
            r1.<init>()
            r10.f13184 = r1
            b21 r1 = p000.i81.m2660()
            r10.f13185 = r1
            ke r6 = new ke
            r6.<init>()
            r10.f13186 = r6
            ke r7 = new ke
            r7.<init>()
            r10.f13187 = r7
            b21 r1 = p000.i81.m2660()
            r10.f13188 = r1
            b21 r1 = p000.i81.m2660()
            r10.f13189 = r1
            n r8 = new n
            r1 = 6
            r8.<init>(r1, r11)
            r10.f13193 = r8
            en1 r1 = new en1
            r1.<init>()
            r10.f13194 = r1
            ow1 r4 = p000.qw1.m4948(r0)
            v80 r1 = new v80
            r9 = r10
            r3 = r11
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r3.mo5617(r1)
            r9.f13195 = r1
            return
    }

    /* JADX INFO: renamed from: Α */
    public final void m7180(java.lang.Object r15) {
            r14 = this;
            java.lang.Object r0 = r14.f13179
            monitor-enter(r0)
            r14.m7201(r15)     // Catch: java.lang.Throwable -> L4f
            b21 r1 = r14.f13185     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.m695(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof p000.c21     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            c21 r15 = (p000.c21) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.f1942     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.f1941     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            fs r10 = (p000.C0296fs) r10     // Catch: java.lang.Throwable -> L4f
            r14.m7201(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r14 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            fs r15 = (p000.C0296fs) r15     // Catch: java.lang.Throwable -> L4f
            r14.m7201(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r14
    }

    /* JADX INFO: renamed from: Β */
    public final void m7181(p000.e80 r4) {
            r3 = this;
            boolean r0 = r3.m7190()
            r3.m7197()
            un r1 = r3.f13176
            if (r0 == 0) goto L1a
            r0 = 0
            v80 r2 = r3.f13195
            r2.f11135 = r0
            r0 = 1
            r2.f11134 = r0
            r1.mo3318(r3, r4)
            r2.m6102()
            return
        L1a:
            r1.mo3318(r3, r4)
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m7182() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f13178
            r1 = 0
            r0.set(r1)
            ke r0 = r2.f13186
            h81 r0 = r0.f5866
            r0.m2455()
            ke r0 = r2.f13187
            h81 r0 = r0.f5866
            r0.m2455()
            e21 r0 = r2.f13180
            c21 r1 = r0.f3378
            boolean r1 = r1.m1113()
            if (r1 != 0) goto L35
            en1 r1 = r2.f13194
            v80 r2 = r2.f13195
            xn r2 = r2.m6108()
            r1.m1941(r0, r2)     // Catch: java.lang.Throwable -> L30
            r1.m1938()     // Catch: java.lang.Throwable -> L30
            r1.m1937()
            return
        L30:
            r2 = move-exception
            r1.m1937()
            throw r2
        L35:
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m7183(java.lang.Object r20, boolean r21) {
            r19 = this;
            r0 = r19
            r1 = r20
            b21 r2 = r0.f13182
            java.lang.Object r2 = r2.m695(r1)
            if (r2 == 0) goto L8f
            boolean r3 = r2 instanceof p000.c21
            sn0 r4 = p000.sn0.f9973
            c21 r5 = r0.f13183
            c21 r6 = r0.f13184
            b21 r0 = r0.f13188
            if (r3 == 0) goto L74
            c21 r2 = (p000.c21) r2
            java.lang.Object[] r3 = r2.f1942
            long[] r2 = r2.f1941
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8f
            r9 = 0
        L24:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L6f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L3e:
            if (r14 >= r12) goto L6d
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L69
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r3[r15]
            bl1 r15 = (p000.bl1) r15
            boolean r16 = p000.i81.m2673(r0, r1, r15)
            if (r16 != 0) goto L69
            sn0 r8 = r15.m979(r1)
            if (r8 == r4) goto L69
            b21 r8 = r15.f1783
            if (r8 == 0) goto L66
            if (r21 != 0) goto L66
            r6.m1107(r15)
            goto L69
        L66:
            r5.m1107(r15)
        L69:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L3e
        L6d:
            if (r12 != r13) goto L8f
        L6f:
            if (r9 == r7) goto L8f
            int r9 = r9 + 1
            goto L24
        L74:
            bl1 r2 = (p000.bl1) r2
            boolean r0 = p000.i81.m2673(r0, r1, r2)
            if (r0 != 0) goto L8f
            sn0 r0 = r2.m979(r1)
            if (r0 == r4) goto L8f
            b21 r0 = r2.f1783
            if (r0 == 0) goto L8c
            if (r21 != 0) goto L8c
            r6.m1107(r2)
            return
        L8c:
            r5.m1107(r2)
        L8f:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m7184(java.util.Set r33, boolean r34) {
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
            boolean r3 = r1 instanceof p000.vq1
            b21 r4 = r0.f13185
            r5 = 0
            r14 = 8
            if (r3 == 0) goto L111
            vq1 r1 = (p000.vq1) r1
            c21 r1 = r1.f11364
            java.lang.Object[] r3 = r1.f1942
            long[] r1 = r1.f1941
            int r15 = r1.length
            int r15 = r15 + (-2)
            if (r15 < 0) goto L104
            r6 = 0
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L21:
            r8 = r1[r6]
            r7 = 7
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = ~r8
            long r10 = r10 << r7
            long r10 = r10 & r8
            long r10 = r10 & r20
            int r10 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r10 == 0) goto Lf5
            int r10 = r6 - r15
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r11 = 0
        L3a:
            if (r11 >= r10) goto Le9
            long r22 = r8 & r18
            int r12 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r12 >= 0) goto Ld2
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            r22 = r7
            boolean r7 = r12 instanceof p000.bl1
            if (r7 == 0) goto L5a
            bl1 r12 = (p000.bl1) r12
            r12.m979(r5)
        L52:
            r29 = r1
            r26 = r8
            r33 = r15
            goto Lcf
        L5a:
            r0.m7183(r12, r2)
            java.lang.Object r7 = r4.m695(r12)
            if (r7 == 0) goto L52
            boolean r12 = r7 instanceof p000.c21
            if (r12 == 0) goto Lc4
            c21 r7 = (p000.c21) r7
            java.lang.Object[] r12 = r7.f1942
            long[] r7 = r7.f1941
            int r13 = r7.length
            int r13 = r13 + (-2)
            if (r13 < 0) goto L52
            r25 = r14
            r33 = r15
            r5 = 0
        L77:
            r14 = r7[r5]
            r26 = r8
            r9 = r7
            long r7 = ~r14
            long r7 = r7 << r22
            long r7 = r7 & r14
            long r7 = r7 & r20
            int r7 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r7 == 0) goto Lb6
            int r7 = r5 - r13
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = 0
        L8e:
            if (r8 >= r7) goto Laf
            long r28 = r14 & r18
            int r28 = (r28 > r16 ? 1 : (r28 == r16 ? 0 : -1))
            if (r28 >= 0) goto La6
            int r28 = r5 << 3
            int r28 = r28 + r8
            r28 = r12[r28]
            r29 = r1
            r1 = r28
            fs r1 = (p000.C0296fs) r1
            r0.m7183(r1, r2)
            goto La8
        La6:
            r29 = r1
        La8:
            long r14 = r14 >> r25
            int r8 = r8 + 1
            r1 = r29
            goto L8e
        Laf:
            r29 = r1
            r1 = r25
            if (r7 != r1) goto Lcf
            goto Lb8
        Lb6:
            r29 = r1
        Lb8:
            if (r5 == r13) goto Lcf
            int r5 = r5 + 1
            r7 = r9
            r8 = r26
            r1 = r29
            r25 = 8
            goto L77
        Lc4:
            r29 = r1
            r26 = r8
            r33 = r15
            fs r7 = (p000.C0296fs) r7
            r0.m7183(r7, r2)
        Lcf:
            r1 = 8
            goto Ldb
        Ld2:
            r29 = r1
            r22 = r7
            r26 = r8
            r33 = r15
            r1 = r14
        Ldb:
            long r8 = r26 >> r1
            int r11 = r11 + 1
            r15 = r33
            r14 = r1
            r7 = r22
            r1 = r29
            r5 = 0
            goto L3a
        Le9:
            r29 = r1
            r22 = r7
            r1 = r14
            r33 = r15
            if (r10 != r1) goto L18e
            r15 = r33
            goto Lf9
        Lf5:
            r29 = r1
            r22 = r7
        Lf9:
            if (r6 == r15) goto L18e
            int r6 = r6 + 1
            r1 = r29
            r5 = 0
            r14 = 8
            goto L21
        L104:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r22 = 7
            goto L18e
        L111:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r22 = 7
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L122:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L18e
            java.lang.Object r3 = r1.next()
            boolean r5 = r3 instanceof p000.bl1
            if (r5 == 0) goto L137
            bl1 r3 = (p000.bl1) r3
            r5 = 0
            r3.m979(r5)
            goto L122
        L137:
            r5 = 0
            r0.m7183(r3, r2)
            java.lang.Object r3 = r4.m695(r3)
            if (r3 == 0) goto L122
            boolean r6 = r3 instanceof p000.c21
            if (r6 == 0) goto L188
            c21 r3 = (p000.c21) r3
            java.lang.Object[] r6 = r3.f1942
            long[] r3 = r3.f1941
            int r7 = r3.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L122
            r8 = 0
        L151:
            r9 = r3[r8]
            long r11 = ~r9
            long r11 = r11 << r22
            long r11 = r11 & r9
            long r11 = r11 & r20
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 == 0) goto L183
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r25 = 8
            int r14 = 8 - r11
            r11 = 0
        L167:
            if (r11 >= r14) goto L17f
            long r12 = r9 & r18
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 >= 0) goto L179
            int r12 = r8 << 3
            int r12 = r12 + r11
            r12 = r6[r12]
            fs r12 = (p000.C0296fs) r12
            r0.m7183(r12, r2)
        L179:
            r12 = 8
            long r9 = r9 >> r12
            int r11 = r11 + 1
            goto L167
        L17f:
            r12 = 8
            if (r14 != r12) goto L122
        L183:
            if (r8 == r7) goto L122
            int r8 = r8 + 1
            goto L151
        L188:
            fs r3 = (p000.C0296fs) r3
            r0.m7183(r3, r2)
            goto L122
        L18e:
            b21 r1 = r0.f13182
            c21 r4 = r0.f13183
            if (r2 == 0) goto L299
            c21 r2 = r0.f13184
            boolean r5 = r2.m1114()
            if (r5 == 0) goto L299
            long[] r5 = r1.f1427
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L292
            r7 = 0
        L1a4:
            r8 = r5[r7]
            long r10 = ~r8
            long r10 = r10 << r22
            long r10 = r10 & r8
            long r10 = r10 & r20
            int r10 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r10 == 0) goto L286
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r25 = 8
            int r14 = 8 - r10
            r10 = 0
        L1ba:
            if (r10 >= r14) goto L27b
            long r11 = r8 & r18
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 >= 0) goto L268
            int r11 = r7 << 3
            int r11 = r11 + r10
            java.lang.Object[] r12 = r1.f1428
            r12 = r12[r11]
            java.lang.Object[] r12 = r1.f1429
            r12 = r12[r11]
            boolean r13 = r12 instanceof p000.c21
            if (r13 == 0) goto L245
            c21 r12 = (p000.c21) r12
            java.lang.Object[] r13 = r12.f1942
            long[] r15 = r12.f1941
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L23a
            r26 = r8
            r0 = 0
        L1df:
            r8 = r15[r0]
            r24 = r5
            r34 = r6
            long r5 = ~r8
            long r5 = r5 << r22
            long r5 = r5 & r8
            long r5 = r5 & r20
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 == 0) goto L231
            int r5 = r0 - r3
            int r5 = ~r5
            int r5 = r5 >>> 31
            r25 = 8
            int r5 = 8 - r5
            r6 = 0
        L1f9:
            if (r6 >= r5) goto L22d
            long r28 = r8 & r18
            int r28 = (r28 > r16 ? 1 : (r28 == r16 ? 0 : -1))
            if (r28 >= 0) goto L221
            int r28 = r0 << 3
            r29 = r6
            int r6 = r28 + r29
            r28 = r13[r6]
            r30 = r8
            r8 = r28
            bl1 r8 = (p000.bl1) r8
            boolean r9 = r2.m1109(r8)
            if (r9 != 0) goto L21b
            boolean r8 = r4.m1109(r8)
            if (r8 == 0) goto L21e
        L21b:
            r12.m1118(r6)
        L21e:
            r6 = 8
            goto L226
        L221:
            r29 = r6
            r30 = r8
            goto L21e
        L226:
            long r8 = r30 >> r6
            int r25 = r29 + 1
            r6 = r25
            goto L1f9
        L22d:
            r6 = 8
            if (r5 != r6) goto L240
        L231:
            if (r0 == r3) goto L240
            int r0 = r0 + 1
            r6 = r34
            r5 = r24
            goto L1df
        L23a:
            r24 = r5
            r34 = r6
            r26 = r8
        L240:
            boolean r0 = r12.m1113()
            goto L260
        L245:
            r24 = r5
            r34 = r6
            r26 = r8
            r12.getClass()
            bl1 r12 = (p000.bl1) r12
            boolean r0 = r2.m1109(r12)
            if (r0 != 0) goto L25f
            boolean r0 = r4.m1109(r12)
            if (r0 == 0) goto L25d
            goto L25f
        L25d:
            r0 = 0
            goto L260
        L25f:
            r0 = 1
        L260:
            if (r0 == 0) goto L265
            r1.m700(r11)
        L265:
            r6 = 8
            goto L26f
        L268:
            r24 = r5
            r34 = r6
            r26 = r8
            goto L265
        L26f:
            long r8 = r26 >> r6
            int r10 = r10 + 1
            r0 = r32
            r6 = r34
            r5 = r24
            goto L1ba
        L27b:
            r24 = r5
            r34 = r6
            r6 = 8
            if (r14 != r6) goto L292
            r6 = r34
            goto L288
        L286:
            r24 = r5
        L288:
            if (r7 == r6) goto L292
            int r7 = r7 + 1
            r0 = r32
            r5 = r24
            goto L1a4
        L292:
            r2.m1108()
            r32.m7189()
            return
        L299:
            boolean r0 = r4.m1114()
            if (r0 == 0) goto L38f
            long[] r0 = r1.f1427
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L389
            r3 = 0
        L2a7:
            r5 = r0[r3]
            long r7 = ~r5
            long r7 = r7 << r22
            long r7 = r7 & r5
            long r7 = r7 & r20
            int r7 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r7 == 0) goto L37d
            int r7 = r3 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r25 = 8
            int r14 = 8 - r7
            r7 = 0
        L2bd:
            if (r7 >= r14) goto L376
            long r8 = r5 & r18
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 >= 0) goto L2c7
            r8 = 1
            goto L2c8
        L2c7:
            r8 = 0
        L2c8:
            if (r8 == 0) goto L368
            int r8 = r3 << 3
            int r8 = r8 + r7
            java.lang.Object[] r9 = r1.f1428
            r9 = r9[r8]
            java.lang.Object[] r9 = r1.f1429
            r9 = r9[r8]
            boolean r10 = r9 instanceof p000.c21
            if (r10 == 0) goto L353
            c21 r9 = (p000.c21) r9
            java.lang.Object[] r10 = r9.f1942
            long[] r11 = r9.f1941
            int r12 = r11.length
            int r12 = r12 + (-2)
            if (r12 < 0) goto L34a
            r26 = r5
            r13 = 0
        L2e7:
            r5 = r11[r13]
            r15 = r10
            r24 = r11
            long r10 = ~r5
            long r10 = r10 << r22
            long r10 = r10 & r5
            long r10 = r10 & r20
            int r10 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r10 == 0) goto L33e
            int r10 = r13 - r12
            int r10 = ~r10
            int r10 = r10 >>> 31
            r25 = 8
            int r10 = 8 - r10
            r11 = 0
        L300:
            if (r11 >= r10) goto L337
            long r28 = r5 & r18
            int r28 = (r28 > r16 ? 1 : (r28 == r16 ? 0 : -1))
            if (r28 >= 0) goto L30b
            r28 = 1
            goto L30d
        L30b:
            r28 = 0
        L30d:
            if (r28 == 0) goto L329
            int r28 = r13 << 3
            r29 = r0
            int r0 = r28 + r11
            r28 = r15[r0]
            r30 = r5
            r5 = r28
            bl1 r5 = (p000.bl1) r5
            boolean r5 = r4.m1109(r5)
            if (r5 == 0) goto L326
            r9.m1118(r0)
        L326:
            r6 = 8
            goto L32e
        L329:
            r29 = r0
            r30 = r5
            goto L326
        L32e:
            long r30 = r30 >> r6
            int r11 = r11 + 1
            r0 = r29
            r5 = r30
            goto L300
        L337:
            r29 = r0
            r6 = 8
            if (r10 != r6) goto L34e
            goto L340
        L33e:
            r29 = r0
        L340:
            if (r13 == r12) goto L34e
            int r13 = r13 + 1
            r10 = r15
            r11 = r24
            r0 = r29
            goto L2e7
        L34a:
            r29 = r0
            r26 = r5
        L34e:
            boolean r0 = r9.m1113()
            goto L360
        L353:
            r29 = r0
            r26 = r5
            r9.getClass()
            bl1 r9 = (p000.bl1) r9
            boolean r0 = r4.m1109(r9)
        L360:
            if (r0 == 0) goto L365
            r1.m700(r8)
        L365:
            r6 = 8
            goto L36d
        L368:
            r29 = r0
            r26 = r5
            goto L365
        L36d:
            long r8 = r26 >> r6
            int r7 = r7 + 1
            r5 = r8
            r0 = r29
            goto L2bd
        L376:
            r29 = r0
            r6 = 8
            if (r14 != r6) goto L389
            goto L381
        L37d:
            r29 = r0
            r6 = 8
        L381:
            if (r3 == r2) goto L389
            int r3 = r3 + 1
            r0 = r29
            goto L2a7
        L389:
            r32.m7189()
            r4.m1108()
        L38f:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m7185() {
            r5 = this;
            java.lang.Object r0 = r5.f13179
            monitor-enter(r0)
            ke r1 = r5.f13186     // Catch: java.lang.Throwable -> Ld
            r5.m7186(r1)     // Catch: java.lang.Throwable -> Ld
            r5.m7195()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return
        Ld:
            r1 = move-exception
            e21 r2 = r5.f13180     // Catch: java.lang.Throwable -> L2c
            c21 r2 = r2.f3378     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r2.m1113()     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L33
            en1 r2 = r5.f13194     // Catch: java.lang.Throwable -> L2c
            e21 r3 = r5.f13180     // Catch: java.lang.Throwable -> L2c
            v80 r4 = r5.f13195     // Catch: java.lang.Throwable -> L2c
            xn r4 = r4.m6108()     // Catch: java.lang.Throwable -> L2c
            r2.m1941(r3, r4)     // Catch: java.lang.Throwable -> L2e
            r2.m1938()     // Catch: java.lang.Throwable -> L2e
            r2.m1937()     // Catch: java.lang.Throwable -> L2c
            goto L33
        L2c:
            r1 = move-exception
            goto L34
        L2e:
            r1 = move-exception
            r2.m1937()     // Catch: java.lang.Throwable -> L2c
            throw r1     // Catch: java.lang.Throwable -> L2c
        L33:
            throw r1     // Catch: java.lang.Throwable -> L2c
        L34:
            r5.m7182()     // Catch: java.lang.Throwable -> L38
            throw r1     // Catch: java.lang.Throwable -> L38
        L38:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    /* JADX INFO: renamed from: ε */
    public final void m7186(p000.C0466ke r32) {
            r31 = this;
            r0 = r31
            r1 = r32
            ke r2 = r0.f13187
            v80 r3 = r0.f13195
            xn r4 = r3.m6108()
            en1 r5 = r0.f13194
            e21 r6 = r0.f13180
            r5.m1941(r6, r4)
            h81 r4 = r1.f5866     // Catch: java.lang.Throwable -> L3d
            boolean r4 = r4.m2457()     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L31
            h81 r0 = r2.f5866     // Catch: java.lang.Throwable -> L27
            boolean r0 = r0.m2457()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L29
            r5.m1938()     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r0 = move-exception
            goto L2d
        L29:
            r5.m1937()
            return
        L2d:
            r5.m1937()
            throw r0
        L31:
            m6 r4 = r0.f13177     // Catch: java.lang.Throwable -> L3d
            r6 = 0
            boolean r6 = r4.equals(r6)     // Catch: java.lang.Throwable -> L3d
            if (r6 == 0) goto L42
            java.lang.String r6 = "Compose:recordChanges"
            goto L44
        L3d:
            r0 = move-exception
            r25 = r5
            goto L1e4
        L42:
            java.lang.String r6 = "Compose:applyChanges"
        L44:
            android.os.Trace.beginSection(r6)     // Catch: java.lang.Throwable -> L3d
            ow1 r6 = r0.f13181     // Catch: java.lang.Throwable -> L1d3
            xn r3 = r3.m6108()     // Catch: java.lang.Throwable -> L1d3
            ow1 r6 = p000.qw1.m4948(r6)     // Catch: java.lang.Throwable -> L1d3
            rw1 r6 = r6.m4303()     // Catch: java.lang.Throwable -> L1d3
            r7 = 0
            r1.m3205(r4, r6, r5, r3)     // Catch: java.lang.Throwable -> L1d7
            r1 = 1
            r6.m5155(r1)     // Catch: java.lang.Throwable -> L1d3
            r4.mo3776()     // Catch: java.lang.Throwable -> L1d3
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L3d
            r5.m1939()     // Catch: java.lang.Throwable -> L3d
            k21 r3 = r5.f3609     // Catch: java.lang.Throwable -> L3d
            int r4 = r3.f5718     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L8f
            java.lang.String r4 = "Compose:sideeffects"
            android.os.Trace.beginSection(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object[] r4 = r3.f5716     // Catch: java.lang.Throwable -> L82
            int r6 = r3.f5718     // Catch: java.lang.Throwable -> L82
            r8 = 0
        L76:
            if (r8 >= r6) goto L84
            r9 = r4[r8]     // Catch: java.lang.Throwable -> L82
            p70 r9 = (p000.p70) r9     // Catch: java.lang.Throwable -> L82
            r9.invoke()     // Catch: java.lang.Throwable -> L82
            int r8 = r8 + 1
            goto L76
        L82:
            r0 = move-exception
            goto L8b
        L84:
            r3.m3132()     // Catch: java.lang.Throwable -> L82
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L3d
            goto L8f
        L8b:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L3d
            throw r0     // Catch: java.lang.Throwable -> L3d
        L8f:
            boolean r3 = r0.f13190     // Catch: java.lang.Throwable -> L3d
            if (r3 == 0) goto L1bb
            java.lang.String r3 = "Compose:unobserve"
            android.os.Trace.beginSection(r3)     // Catch: java.lang.Throwable -> L3d
            r0.f13190 = r7     // Catch: java.lang.Throwable -> L14f
            b21 r3 = r0.f13182     // Catch: java.lang.Throwable -> L14f
            long[] r4 = r3.f1427     // Catch: java.lang.Throwable -> L14f
            int r6 = r4.length     // Catch: java.lang.Throwable -> L14f
            int r6 = r6 + (-2)
            if (r6 < 0) goto L1ac
            r8 = r7
        La4:
            r9 = r4[r8]     // Catch: java.lang.Throwable -> L14f
            long r11 = ~r9     // Catch: java.lang.Throwable -> L14f
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r14
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 == 0) goto L19a
            int r11 = r8 - r6
            int r11 = ~r11     // Catch: java.lang.Throwable -> L14f
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r1 = r7
        Lbe:
            if (r1 >= r11) goto L192
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r9 & r16
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L172
            int r18 = r8 << 3
            r19 = r13
            int r13 = r18 + r1
            r22 = r14
            java.lang.Object[] r14 = r3.f1428     // Catch: java.lang.Throwable -> L14f
            r14 = r14[r13]     // Catch: java.lang.Throwable -> L14f
            java.lang.Object[] r14 = r3.f1429     // Catch: java.lang.Throwable -> L14f
            r14 = r14[r13]     // Catch: java.lang.Throwable -> L14f
            boolean r15 = r14 instanceof p000.c21     // Catch: java.lang.Throwable -> L14f
            if (r15 == 0) goto L154
            c21 r14 = (p000.c21) r14     // Catch: java.lang.Throwable -> L14f
            java.lang.Object[] r15 = r14.f1942     // Catch: java.lang.Throwable -> L14f
            long[] r7 = r14.f1941     // Catch: java.lang.Throwable -> L14f
            r24 = r12
            int r12 = r7.length     // Catch: java.lang.Throwable -> L14f
            int r12 = r12 + (-2)
            if (r12 < 0) goto L142
            r26 = r4
            r25 = r5
            r0 = 0
        Lf0:
            r4 = r7[r0]     // Catch: java.lang.Throwable -> L122
            r27 = r9
            long r9 = ~r4     // Catch: java.lang.Throwable -> L122
            long r9 = r9 << r19
            long r9 = r9 & r4
            long r9 = r9 & r22
            int r9 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r9 == 0) goto L135
            int r9 = r0 - r12
            int r9 = ~r9     // Catch: java.lang.Throwable -> L122
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = 0
        L106:
            if (r10 >= r9) goto L12e
            long r29 = r4 & r16
            int r29 = (r29 > r20 ? 1 : (r29 == r20 ? 0 : -1))
            if (r29 >= 0) goto L125
            int r29 = r0 << 3
            r30 = r1
            int r1 = r29 + r10
            r29 = r15[r1]     // Catch: java.lang.Throwable -> L122
            bl1 r29 = (p000.bl1) r29     // Catch: java.lang.Throwable -> L122
            boolean r29 = r29.m978()     // Catch: java.lang.Throwable -> L122
            if (r29 != 0) goto L127
            r14.m1118(r1)     // Catch: java.lang.Throwable -> L122
            goto L127
        L122:
            r0 = move-exception
            goto L1b7
        L125:
            r30 = r1
        L127:
            long r4 = r4 >> r24
            int r10 = r10 + 1
            r1 = r30
            goto L106
        L12e:
            r30 = r1
            r1 = r24
            if (r9 != r1) goto L14a
            goto L137
        L135:
            r30 = r1
        L137:
            if (r0 == r12) goto L14a
            int r0 = r0 + 1
            r9 = r27
            r1 = r30
            r24 = 8
            goto Lf0
        L142:
            r30 = r1
            r26 = r4
            r25 = r5
            r27 = r9
        L14a:
            boolean r0 = r14.m1113()     // Catch: java.lang.Throwable -> L122
            goto L16a
        L14f:
            r0 = move-exception
            r25 = r5
            goto L1b7
        L154:
            r30 = r1
            r26 = r4
            r25 = r5
            r27 = r9
            r14.getClass()     // Catch: java.lang.Throwable -> L122
            bl1 r14 = (p000.bl1) r14     // Catch: java.lang.Throwable -> L122
            boolean r0 = r14.m978()     // Catch: java.lang.Throwable -> L122
            if (r0 != 0) goto L169
            r0 = 1
            goto L16a
        L169:
            r0 = 0
        L16a:
            if (r0 == 0) goto L16f
            r3.m700(r13)     // Catch: java.lang.Throwable -> L122
        L16f:
            r1 = 8
            goto L17f
        L172:
            r30 = r1
            r26 = r4
            r25 = r5
            r27 = r9
            r19 = r13
            r22 = r14
            r1 = r12
        L17f:
            long r9 = r27 >> r1
            int r0 = r30 + 1
            r12 = r1
            r13 = r19
            r14 = r22
            r5 = r25
            r4 = r26
            r7 = 0
            r1 = r0
            r0 = r31
            goto Lbe
        L192:
            r26 = r4
            r25 = r5
            r1 = r12
            if (r11 != r1) goto L1ae
            goto L19e
        L19a:
            r26 = r4
            r25 = r5
        L19e:
            if (r8 == r6) goto L1ae
            int r8 = r8 + 1
            r0 = r31
            r5 = r25
            r4 = r26
            r1 = 1
            r7 = 0
            goto La4
        L1ac:
            r25 = r5
        L1ae:
            r31.m7189()     // Catch: java.lang.Throwable -> L122
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1b5
            goto L1bd
        L1b5:
            r0 = move-exception
            goto L1e4
        L1b7:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1b5
            throw r0     // Catch: java.lang.Throwable -> L1b5
        L1bb:
            r25 = r5
        L1bd:
            h81 r0 = r2.f5866     // Catch: java.lang.Throwable -> L1c9
            boolean r0 = r0.m2457()     // Catch: java.lang.Throwable -> L1c9
            if (r0 == 0) goto L1cb
            r25.m1938()     // Catch: java.lang.Throwable -> L1c9
            goto L1cb
        L1c9:
            r0 = move-exception
            goto L1cf
        L1cb:
            r25.m1937()
            return
        L1cf:
            r25.m1937()
            throw r0
        L1d3:
            r0 = move-exception
            r25 = r5
            goto L1e0
        L1d7:
            r0 = move-exception
            r25 = r5
            r1 = 0
            r6.m5155(r1)     // Catch: java.lang.Throwable -> L1df
            throw r0     // Catch: java.lang.Throwable -> L1df
        L1df:
            r0 = move-exception
        L1e0:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1b5
            throw r0     // Catch: java.lang.Throwable -> L1b5
        L1e4:
            h81 r1 = r2.f5866     // Catch: java.lang.Throwable -> L1f0
            boolean r1 = r1.m2457()     // Catch: java.lang.Throwable -> L1f0
            if (r1 == 0) goto L1f2
            r25.m1938()     // Catch: java.lang.Throwable -> L1f0
            goto L1f2
        L1f0:
            r0 = move-exception
            goto L1f6
        L1f2:
            r25.m1937()
            throw r0
        L1f6:
            r25.m1937()
            throw r0
    }

    /* JADX INFO: renamed from: ζ */
    public final void m7187() {
            r5 = this;
            java.lang.Object r0 = r5.f13179
            monitor-enter(r0)
            ke r1 = r5.f13187     // Catch: java.lang.Throwable -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L16
            h81 r1 = r1.f5866     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.m2457()     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            ke r1 = r5.f13187     // Catch: java.lang.Throwable -> L16
            r5.m7186(r1)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)
            return
        L1a:
            e21 r2 = r5.f13180     // Catch: java.lang.Throwable -> L38
            c21 r2 = r2.f3378     // Catch: java.lang.Throwable -> L38
            boolean r2 = r2.m1113()     // Catch: java.lang.Throwable -> L38
            if (r2 != 0) goto L3f
            en1 r2 = r5.f13194     // Catch: java.lang.Throwable -> L38
            e21 r3 = r5.f13180     // Catch: java.lang.Throwable -> L38
            v80 r4 = r5.f13195     // Catch: java.lang.Throwable -> L38
            xn r4 = r4.m6108()     // Catch: java.lang.Throwable -> L38
            r2.m1941(r3, r4)     // Catch: java.lang.Throwable -> L3a
            r2.m1938()     // Catch: java.lang.Throwable -> L3a
            r2.m1937()     // Catch: java.lang.Throwable -> L38
            goto L3f
        L38:
            r1 = move-exception
            goto L40
        L3a:
            r1 = move-exception
            r2.m1937()     // Catch: java.lang.Throwable -> L38
            throw r1     // Catch: java.lang.Throwable -> L38
        L3f:
            throw r1     // Catch: java.lang.Throwable -> L38
        L40:
            r5.m7182()     // Catch: java.lang.Throwable -> L44
            throw r1     // Catch: java.lang.Throwable -> L44
        L44:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    /* JADX INFO: renamed from: η */
    public final void m7188() {
            r5 = this;
            java.lang.Object r0 = r5.f13179
            monitor-enter(r0)
            v80 r1 = r5.f13195     // Catch: java.lang.Throwable -> L26
            r2 = 0
            r1.f11178 = r2     // Catch: java.lang.Throwable -> L26
            e21 r1 = r5.f13180     // Catch: java.lang.Throwable -> L26
            c21 r1 = r1.f3378     // Catch: java.lang.Throwable -> L26
            boolean r1 = r1.m1113()     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L2d
            en1 r1 = r5.f13194     // Catch: java.lang.Throwable -> L26
            e21 r2 = r5.f13180     // Catch: java.lang.Throwable -> L26
            v80 r3 = r5.f13195     // Catch: java.lang.Throwable -> L26
            xn r3 = r3.m6108()     // Catch: java.lang.Throwable -> L26
            r1.m1941(r2, r3)     // Catch: java.lang.Throwable -> L28
            r1.m1938()     // Catch: java.lang.Throwable -> L28
            r1.m1937()     // Catch: java.lang.Throwable -> L26
            goto L2d
        L26:
            r1 = move-exception
            goto L2f
        L28:
            r2 = move-exception
            r1.m1937()     // Catch: java.lang.Throwable -> L26
            throw r2     // Catch: java.lang.Throwable -> L26
        L2d:
            monitor-exit(r0)
            return
        L2f:
            e21 r2 = r5.f13180     // Catch: java.lang.Throwable -> L4d
            c21 r2 = r2.f3378     // Catch: java.lang.Throwable -> L4d
            boolean r2 = r2.m1113()     // Catch: java.lang.Throwable -> L4d
            if (r2 != 0) goto L54
            en1 r2 = r5.f13194     // Catch: java.lang.Throwable -> L4d
            e21 r3 = r5.f13180     // Catch: java.lang.Throwable -> L4d
            v80 r4 = r5.f13195     // Catch: java.lang.Throwable -> L4d
            xn r4 = r4.m6108()     // Catch: java.lang.Throwable -> L4d
            r2.m1941(r3, r4)     // Catch: java.lang.Throwable -> L4f
            r2.m1938()     // Catch: java.lang.Throwable -> L4f
            r2.m1937()     // Catch: java.lang.Throwable -> L4d
            goto L54
        L4d:
            r1 = move-exception
            goto L55
        L4f:
            r1 = move-exception
            r2.m1937()     // Catch: java.lang.Throwable -> L4d
            throw r1     // Catch: java.lang.Throwable -> L4d
        L54:
            throw r1     // Catch: java.lang.Throwable -> L4d
        L55:
            r5.m7182()     // Catch: java.lang.Throwable -> L59
            throw r1     // Catch: java.lang.Throwable -> L59
        L59:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    /* JADX INFO: renamed from: θ */
    public final void m7189() {
            r33 = this;
            r0 = r33
            b21 r1 = r0.f13185
            long[] r2 = r1.f1427
            int r3 = r2.length
            int r3 = r3 + (-2)
            r8 = 7
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = 8
            if (r3 < 0) goto L119
            r14 = 0
            r15 = 128(0x80, double:6.3E-322)
        L16:
            r4 = r2[r14]
            r17 = 255(0xff, double:1.26E-321)
            long r6 = ~r4
            long r6 = r6 << r8
            long r6 = r6 & r4
            long r6 = r6 & r9
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L101
            int r6 = r14 - r3
            int r6 = ~r6
            int r6 = r6 >>> 31
            int r6 = 8 - r6
            r7 = 0
        L2a:
            if (r7 >= r6) goto Lf1
            long r19 = r4 & r17
            int r19 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r19 >= 0) goto Ld3
            int r19 = r14 << 3
            r20 = r8
            int r8 = r19 + r7
            r21 = r9
            java.lang.Object[] r9 = r1.f1428
            r9 = r9[r8]
            java.lang.Object[] r9 = r1.f1429
            r9 = r9[r8]
            boolean r10 = r9 instanceof p000.c21
            b21 r11 = r0.f13182
            if (r10 == 0) goto Lb5
            c21 r9 = (p000.c21) r9
            java.lang.Object[] r10 = r9.f1942
            long[] r13 = r9.f1941
            r23 = r15
            int r15 = r13.length
            int r15 = r15 + (-2)
            if (r15 < 0) goto Laa
            r25 = r4
            r16 = r12
            r12 = 0
        L5a:
            r4 = r13[r12]
            r27 = r2
            r28 = r3
            long r2 = ~r4
            long r2 = r2 << r20
            long r2 = r2 & r4
            long r2 = r2 & r21
            int r2 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r2 == 0) goto L9f
            int r2 = r12 - r15
            int r2 = ~r2
            int r2 = r2 >>> 31
            int r2 = 8 - r2
            r3 = 0
        L72:
            if (r3 >= r2) goto L9b
            long r29 = r4 & r17
            int r29 = (r29 > r23 ? 1 : (r29 == r23 ? 0 : -1))
            if (r29 >= 0) goto L92
            int r29 = r12 << 3
            r30 = r3
            int r3 = r29 + r30
            r29 = r10[r3]
            r31 = r4
            r4 = r29
            fs r4 = (p000.C0296fs) r4
            boolean r4 = r11.m691(r4)
            if (r4 != 0) goto L96
            r9.m1118(r3)
            goto L96
        L92:
            r30 = r3
            r31 = r4
        L96:
            long r4 = r31 >> r16
            int r3 = r30 + 1
            goto L72
        L9b:
            r3 = r16
            if (r2 != r3) goto Lb0
        L9f:
            if (r12 == r15) goto Lb0
            int r12 = r12 + 1
            r2 = r27
            r3 = r28
            r16 = 8
            goto L5a
        Laa:
            r27 = r2
            r28 = r3
            r25 = r4
        Lb0:
            boolean r2 = r9.m1113()
            goto Lcb
        Lb5:
            r27 = r2
            r28 = r3
            r25 = r4
            r23 = r15
            r9.getClass()
            fs r9 = (p000.C0296fs) r9
            boolean r2 = r11.m691(r9)
            if (r2 != 0) goto Lca
            r2 = 1
            goto Lcb
        Lca:
            r2 = 0
        Lcb:
            if (r2 == 0) goto Ld0
            r1.m700(r8)
        Ld0:
            r3 = 8
            goto Le0
        Ld3:
            r27 = r2
            r28 = r3
            r25 = r4
            r20 = r8
            r21 = r9
            r23 = r15
            r3 = r12
        Le0:
            long r4 = r25 >> r3
            int r7 = r7 + 1
            r12 = r3
            r8 = r20
            r9 = r21
            r15 = r23
            r2 = r27
            r3 = r28
            goto L2a
        Lf1:
            r27 = r2
            r28 = r3
            r20 = r8
            r21 = r9
            r3 = r12
            r23 = r15
            if (r6 != r3) goto L121
            r3 = r28
            goto L109
        L101:
            r27 = r2
            r20 = r8
            r21 = r9
            r23 = r15
        L109:
            if (r14 == r3) goto L121
            int r14 = r14 + 1
            r8 = r20
            r9 = r21
            r15 = r23
            r2 = r27
            r12 = 8
            goto L16
        L119:
            r20 = r8
            r21 = r9
            r17 = 255(0xff, double:1.26E-321)
            r23 = 128(0x80, double:6.3E-322)
        L121:
            c21 r0 = r0.f13184
            boolean r1 = r0.m1114()
            if (r1 == 0) goto L17b
            java.lang.Object[] r1 = r0.f1942
            long[] r2 = r0.f1941
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L17b
            r4 = 0
        L133:
            r5 = r2[r4]
            long r7 = ~r5
            long r7 = r7 << r20
            long r7 = r7 & r5
            long r7 = r7 & r21
            int r7 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r7 == 0) goto L174
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r16 = 8
            int r12 = 8 - r7
            r7 = 0
        L149:
            if (r7 >= r12) goto L16f
            long r8 = r5 & r17
            int r8 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r8 >= 0) goto L153
            r8 = 1
            goto L154
        L153:
            r8 = 0
        L154:
            if (r8 == 0) goto L169
            int r8 = r4 << 3
            int r8 = r8 + r7
            r9 = r1[r8]
            bl1 r9 = (p000.bl1) r9
            b21 r9 = r9.f1783
            if (r9 == 0) goto L163
            r9 = 1
            goto L164
        L163:
            r9 = 0
        L164:
            if (r9 != 0) goto L169
            r0.m1118(r8)
        L169:
            r8 = 8
            long r5 = r5 >> r8
            int r7 = r7 + 1
            goto L149
        L16f:
            r8 = 8
            if (r12 != r8) goto L17b
            goto L176
        L174:
            r8 = 8
        L176:
            if (r4 == r3) goto L17b
            int r4 = r4 + 1
            goto L133
        L17b:
            return
    }

    /* JADX INFO: renamed from: ι */
    public final boolean m7190() {
            r4 = this;
            java.lang.Object r0 = r4.f13179
            monitor-enter(r0)
            int r1 = r4.f13175     // Catch: java.lang.Throwable -> L10
            r2 = 0
            r3 = 1
            if (r1 != r3) goto La
            goto Lb
        La:
            r3 = r2
        Lb:
            if (r3 == 0) goto L12
            r4.f13175 = r2     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r4 = move-exception
            goto L14
        L12:
            monitor-exit(r0)
            return r3
        L14:
            monitor-exit(r0)
            throw r4
    }

    /* JADX INFO: renamed from: κ */
    public final void m7191(p000.e80 r5) {
            r4 = this;
            java.lang.Object r0 = r4.f13179     // Catch: java.lang.Throwable -> L2a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L2a
            r4.m7194()     // Catch: java.lang.Throwable -> L34
            b21 r1 = r4.f13189     // Catch: java.lang.Throwable -> L34
            b21 r2 = p000.i81.m2660()     // Catch: java.lang.Throwable -> L34
            r4.f13189 = r2     // Catch: java.lang.Throwable -> L34
            v80 r2 = r4.f13195     // Catch: java.lang.Throwable -> L30
            ke r3 = r2.f11161     // Catch: java.lang.Throwable -> L30
            h81 r3 = r3.f5866     // Catch: java.lang.Throwable -> L30
            boolean r3 = r3.m2457()     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L1f
            java.lang.String r3 = "Expected applyChanges() to have been called"
            p000.AbstractC0804sn.m5526(r3)     // Catch: java.lang.Throwable -> L30
        L1f:
            r3 = 0
            r2.f11151 = r3     // Catch: java.lang.Throwable -> L30
            r3 = 0
            r2.m6098(r1, r5)     // Catch: java.lang.Throwable -> L2c
            r2.f11151 = r3     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r5 = move-exception
            goto L37
        L2c:
            r5 = move-exception
            r2.f11151 = r3     // Catch: java.lang.Throwable -> L30
            throw r5     // Catch: java.lang.Throwable -> L30
        L30:
            r5 = move-exception
            r4.f13189 = r1     // Catch: java.lang.Throwable -> L34
            throw r5     // Catch: java.lang.Throwable -> L34
        L34:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r5     // Catch: java.lang.Throwable -> L2a
        L37:
            e21 r0 = r4.f13180     // Catch: java.lang.Throwable -> L55
            c21 r0 = r0.f3378     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.m1113()     // Catch: java.lang.Throwable -> L55
            if (r0 != 0) goto L5c
            en1 r0 = r4.f13194     // Catch: java.lang.Throwable -> L55
            e21 r1 = r4.f13180     // Catch: java.lang.Throwable -> L55
            v80 r2 = r4.f13195     // Catch: java.lang.Throwable -> L55
            xn r2 = r2.m6108()     // Catch: java.lang.Throwable -> L55
            r0.m1941(r1, r2)     // Catch: java.lang.Throwable -> L57
            r0.m1938()     // Catch: java.lang.Throwable -> L57
            r0.m1937()     // Catch: java.lang.Throwable -> L55
            goto L5c
        L55:
            r5 = move-exception
            goto L5d
        L57:
            r5 = move-exception
            r0.m1937()     // Catch: java.lang.Throwable -> L55
            throw r5     // Catch: java.lang.Throwable -> L55
        L5c:
            throw r5     // Catch: java.lang.Throwable -> L55
        L5d:
            r4.m7182()
            throw r5
    }

    /* JADX INFO: renamed from: λ */
    public final void m7192() {
            r9 = this;
            java.lang.Object r0 = r9.f13179
            monitor-enter(r0)
            ow1 r1 = r9.f13181     // Catch: java.lang.Throwable -> L1b
            int r1 = r1.f8287     // Catch: java.lang.Throwable -> L1b
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Ld
            r1 = r3
            goto Le
        Ld:
            r1 = r2
        Le:
            if (r1 == 0) goto L1e
            e21 r4 = r9.f13180     // Catch: java.lang.Throwable -> L1b
            c21 r4 = r4.f3378     // Catch: java.lang.Throwable -> L1b
            boolean r4 = r4.m1113()     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L61
            goto L1e
        L1b:
            r9 = move-exception
            goto La2
        L1e:
            java.lang.String r4 = "Compose:deactivate"
            android.os.Trace.beginSection(r4)     // Catch: java.lang.Throwable -> L1b
            en1 r4 = r9.f13194     // Catch: java.lang.Throwable -> L98
            e21 r5 = r9.f13180     // Catch: java.lang.Throwable -> L98
            v80 r6 = r9.f13195     // Catch: java.lang.Throwable -> L98
            xn r6 = r6.m6108()     // Catch: java.lang.Throwable -> L98
            r4.m1941(r5, r6)     // Catch: java.lang.Throwable -> L51
            if (r1 != 0) goto L58
            ow1 r1 = r9.f13181     // Catch: java.lang.Throwable -> L51
            en1 r5 = r9.f13194     // Catch: java.lang.Throwable -> L51
            rw1 r1 = r1.m4303()     // Catch: java.lang.Throwable -> L51
            int r6 = r1.f9557     // Catch: java.lang.Throwable -> L53
            ic r7 = new ic     // Catch: java.lang.Throwable -> L53
            r8 = 3
            r7.<init>(r5, r8, r1)     // Catch: java.lang.Throwable -> L53
            r1.m5163(r6, r7)     // Catch: java.lang.Throwable -> L53
            r1.m5155(r3)     // Catch: java.lang.Throwable -> L51
            m6 r1 = r9.f13177     // Catch: java.lang.Throwable -> L51
            r1.mo3776()     // Catch: java.lang.Throwable -> L51
            r4.m1939()     // Catch: java.lang.Throwable -> L51
            goto L58
        L51:
            r9 = move-exception
            goto L9a
        L53:
            r9 = move-exception
            r1.m5155(r2)     // Catch: java.lang.Throwable -> L51
            throw r9     // Catch: java.lang.Throwable -> L51
        L58:
            r4.m1938()     // Catch: java.lang.Throwable -> L51
            r4.m1937()     // Catch: java.lang.Throwable -> L98
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1b
        L61:
            b21 r1 = r9.f13182     // Catch: java.lang.Throwable -> L1b
            r1.m689()     // Catch: java.lang.Throwable -> L1b
            b21 r1 = r9.f13185     // Catch: java.lang.Throwable -> L1b
            r1.m689()     // Catch: java.lang.Throwable -> L1b
            b21 r1 = r9.f13189     // Catch: java.lang.Throwable -> L1b
            r1.m689()     // Catch: java.lang.Throwable -> L1b
            ke r1 = r9.f13186     // Catch: java.lang.Throwable -> L1b
            h81 r1 = r1.f5866     // Catch: java.lang.Throwable -> L1b
            r1.m2455()     // Catch: java.lang.Throwable -> L1b
            ke r1 = r9.f13187     // Catch: java.lang.Throwable -> L1b
            h81 r1 = r1.f5866     // Catch: java.lang.Throwable -> L1b
            r1.m2455()     // Catch: java.lang.Throwable -> L1b
            v80 r1 = r9.f13195     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayList r2 = r1.f11140     // Catch: java.lang.Throwable -> L1b
            r2.clear()     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayList r2 = r1.f11175     // Catch: java.lang.Throwable -> L1b
            r2.clear()     // Catch: java.lang.Throwable -> L1b
            ke r2 = r1.f11161     // Catch: java.lang.Throwable -> L1b
            h81 r2 = r2.f5866     // Catch: java.lang.Throwable -> L1b
            r2.m2455()     // Catch: java.lang.Throwable -> L1b
            r2 = 0
            r1.f11178 = r2     // Catch: java.lang.Throwable -> L1b
            r9.f13175 = r3     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return
        L98:
            r9 = move-exception
            goto L9e
        L9a:
            r4.m1937()     // Catch: java.lang.Throwable -> L98
            throw r9     // Catch: java.lang.Throwable -> L98
        L9e:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1b
            throw r9     // Catch: java.lang.Throwable -> L1b
        La2:
            monitor-exit(r0)
            throw r9
    }

    /* JADX INFO: renamed from: μ */
    public final void m7193() {
            r9 = this;
            java.lang.Object r0 = r9.f13179
            monitor-enter(r0)
            v80 r1 = r9.f13195     // Catch: java.lang.Throwable -> Lf
            boolean r1 = r1.f11141     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L12
            java.lang.String r1 = "Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block."
            p000.pi1.m4545(r1)     // Catch: java.lang.Throwable -> Lf
            goto L12
        Lf:
            r9 = move-exception
            goto Lb8
        L12:
            int r1 = r9.f13175     // Catch: java.lang.Throwable -> Lf
            r2 = 3
            if (r1 == r2) goto Lb1
            r9.f13175 = r2     // Catch: java.lang.Throwable -> Lf
            v80 r1 = r9.f13195     // Catch: java.lang.Throwable -> Lf
            ke r1 = r1.f11147     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L22
            r9.m7186(r1)     // Catch: java.lang.Throwable -> Lf
        L22:
            ow1 r1 = r9.f13181     // Catch: java.lang.Throwable -> Lf
            int r1 = r1.f8287     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L2c
            r1 = r3
            goto L2d
        L2c:
            r1 = r2
        L2d:
            if (r1 == 0) goto L39
            e21 r4 = r9.f13180     // Catch: java.lang.Throwable -> Lf
            c21 r4 = r4.f3378     // Catch: java.lang.Throwable -> Lf
            boolean r4 = r4.m1113()     // Catch: java.lang.Throwable -> Lf
            if (r4 != 0) goto L7c
        L39:
            en1 r4 = r9.f13194     // Catch: java.lang.Throwable -> Lf
            e21 r5 = r9.f13180     // Catch: java.lang.Throwable -> Lf
            v80 r6 = r9.f13195     // Catch: java.lang.Throwable -> Lf
            xn r6 = r6.m6108()     // Catch: java.lang.Throwable -> Lf
            r4.m1941(r5, r6)     // Catch: java.lang.Throwable -> L6f
            if (r1 != 0) goto L76
            ow1 r1 = r9.f13181     // Catch: java.lang.Throwable -> L6f
            en1 r5 = r9.f13194     // Catch: java.lang.Throwable -> L6f
            rw1 r1 = r1.m4303()     // Catch: java.lang.Throwable -> L6f
            int r6 = r1.f9557     // Catch: java.lang.Throwable -> L71
            cc r7 = new cc     // Catch: java.lang.Throwable -> L71
            r8 = 1
            r7.<init>(r8, r5)     // Catch: java.lang.Throwable -> L71
            r1.m5163(r6, r7)     // Catch: java.lang.Throwable -> L71
            r1.m5137()     // Catch: java.lang.Throwable -> L71
            r1.m5155(r3)     // Catch: java.lang.Throwable -> L6f
            m6 r1 = r9.f13177     // Catch: java.lang.Throwable -> L6f
            r1.m3782()     // Catch: java.lang.Throwable -> L6f
            m6 r1 = r9.f13177     // Catch: java.lang.Throwable -> L6f
            r1.mo3776()     // Catch: java.lang.Throwable -> L6f
            r4.m1939()     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r9 = move-exception
            goto Lad
        L71:
            r9 = move-exception
            r1.m5155(r2)     // Catch: java.lang.Throwable -> L6f
            throw r9     // Catch: java.lang.Throwable -> L6f
        L76:
            r4.m1938()     // Catch: java.lang.Throwable -> L6f
            r4.m1937()     // Catch: java.lang.Throwable -> Lf
        L7c:
            v80 r1 = r9.f13195     // Catch: java.lang.Throwable -> Lf
            r1.getClass()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = "Compose:Composer.dispose"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> Lf
            un r2 = r1.f11158     // Catch: java.lang.Throwable -> La8
            r2.mo5619(r1)     // Catch: java.lang.Throwable -> La8
            java.util.ArrayList r2 = r1.f11140     // Catch: java.lang.Throwable -> La8
            r2.clear()     // Catch: java.lang.Throwable -> La8
            java.util.ArrayList r2 = r1.f11175     // Catch: java.lang.Throwable -> La8
            r2.clear()     // Catch: java.lang.Throwable -> La8
            ke r2 = r1.f11161     // Catch: java.lang.Throwable -> La8
            h81 r2 = r2.f5866     // Catch: java.lang.Throwable -> La8
            r2.m2455()     // Catch: java.lang.Throwable -> La8
            r2 = 0
            r1.f11178 = r2     // Catch: java.lang.Throwable -> La8
            m6 r1 = r1.f11157     // Catch: java.lang.Throwable -> La8
            r1.m3782()     // Catch: java.lang.Throwable -> La8
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lf
            goto Lb1
        La8:
            r9 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lf
            throw r9     // Catch: java.lang.Throwable -> Lf
        Lad:
            r4.m1937()     // Catch: java.lang.Throwable -> Lf
            throw r9     // Catch: java.lang.Throwable -> Lf
        Lb1:
            monitor-exit(r0)
            un r0 = r9.f13176
            r0.mo3331(r9)
            return
        Lb8:
            monitor-exit(r0)
            throw r9
    }

    /* JADX INFO: renamed from: ν */
    public final void m7194() {
            r5 = this;
            java.lang.Object r0 = p000.AbstractC0978xb.f12099
            java.util.concurrent.atomic.AtomicReference r1 = r5.f13178
            java.lang.Object r2 = r1.getAndSet(r0)
            if (r2 == 0) goto L4f
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L44
            boolean r0 = r2 instanceof java.util.Set
            r3 = 1
            if (r0 == 0) goto L1b
            java.util.Set r2 = (java.util.Set) r2
            r5.m7184(r2, r3)
            return
        L1b:
            boolean r0 = r2 instanceof java.lang.Object[]
            if (r0 == 0) goto L2d
            java.util.Set[] r2 = (java.util.Set[]) r2
            int r0 = r2.length
            r1 = 0
        L23:
            if (r1 >= r0) goto L4f
            r4 = r2[r1]
            r5.m7184(r4, r3)
            int r1 = r1 + 1
            goto L23
        L2d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "corrupt pendingModifications drain: "
            r5.<init>(r0)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            p000.AbstractC0804sn.m5527(r5)
            pm r5 = new pm
            r5.<init>()
            throw r5
        L44:
            java.lang.String r5 = "pending composition has not been applied"
            p000.AbstractC0804sn.m5527(r5)
            pm r5 = new pm
            r5.<init>()
            throw r5
        L4f:
            return
    }

    /* JADX INFO: renamed from: ξ */
    public final void m7195() {
            r5 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicReference r1 = r5.f13178
            java.lang.Object r0 = r1.getAndSet(r0)
            java.lang.Object r2 = p000.AbstractC0978xb.f12099
            boolean r2 = p000.ln0.m3626(r0, r2)
            if (r2 != 0) goto L4b
            boolean r2 = r0 instanceof java.util.Set
            r3 = 0
            if (r2 == 0) goto L1a
            java.util.Set r0 = (java.util.Set) r0
            r5.m7184(r0, r3)
            return
        L1a:
            boolean r2 = r0 instanceof java.lang.Object[]
            if (r2 == 0) goto L2c
            java.util.Set[] r0 = (java.util.Set[]) r0
            int r1 = r0.length
            r2 = r3
        L22:
            if (r2 >= r1) goto L4b
            r4 = r0[r2]
            r5.m7184(r4, r3)
            int r2 = r2 + 1
            goto L22
        L2c:
            if (r0 != 0) goto L34
            java.lang.String r5 = "calling recordModificationsOf and applyChanges concurrently is not supported"
            p000.AbstractC0804sn.m5526(r5)
            return
        L34:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "corrupt pendingModifications drain: "
            r5.<init>(r0)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            p000.AbstractC0804sn.m5527(r5)
            pm r5 = new pm
            r5.<init>()
            throw r5
        L4b:
            return
    }

    /* JADX INFO: renamed from: ο */
    public final void m7196() {
            r5 = this;
            nz r0 = p000.C0604nz.f7825
            java.util.concurrent.atomic.AtomicReference r1 = r5.f13178
            java.lang.Object r0 = r1.getAndSet(r0)
            java.lang.Object r2 = p000.AbstractC0978xb.f12099
            boolean r2 = p000.ln0.m3626(r0, r2)
            if (r2 != 0) goto L47
            if (r0 != 0) goto L13
            goto L47
        L13:
            boolean r2 = r0 instanceof java.util.Set
            r3 = 0
            if (r2 == 0) goto L1e
            java.util.Set r0 = (java.util.Set) r0
            r5.m7184(r0, r3)
            return
        L1e:
            boolean r2 = r0 instanceof java.lang.Object[]
            if (r2 == 0) goto L30
            java.util.Set[] r0 = (java.util.Set[]) r0
            int r1 = r0.length
            r2 = r3
        L26:
            if (r2 >= r1) goto L47
            r4 = r0[r2]
            r5.m7184(r4, r3)
            int r2 = r2 + 1
            goto L26
        L30:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "corrupt pendingModifications drain: "
            r5.<init>(r0)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            p000.AbstractC0804sn.m5527(r5)
            pm r5 = new pm
            r5.<init>()
            throw r5
        L47:
            return
    }

    /* JADX INFO: renamed from: π */
    public final void m7197() {
            r1 = this;
            int r1 = r1.f13175
            if (r1 != 0) goto L5
            goto L1c
        L5:
            r0 = 1
            if (r1 == r0) goto L17
            r0 = 2
            if (r1 == r0) goto L14
            r0 = 3
            if (r1 == r0) goto L11
            java.lang.String r1 = ""
            goto L19
        L11:
            java.lang.String r1 = "The composition is disposed"
            goto L19
        L14:
            java.lang.String r1 = "A previous pausable composition for this composition was cancelled. This composition must be disposed."
            goto L19
        L17:
            java.lang.String r1 = "The composition should be activated before setting content."
        L19:
            p000.pi1.m4545(r1)
        L1c:
            return
    }

    /* JADX INFO: renamed from: ρ */
    public final void m7198(java.util.ArrayList r4) {
            r3 = this;
            e21 r0 = r3.f13180
            v80 r1 = r3.f13195
            int r2 = r4.size()
            if (r2 > 0) goto L4c
            r1.getClass()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "Compose:insertMovableContent"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L27
            r1.m6063(r4)     // Catch: java.lang.Throwable -> L1e
            r1.m6093()     // Catch: java.lang.Throwable -> L1c
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L27
            return
        L1c:
            r4 = move-exception
            goto L23
        L1e:
            r4 = move-exception
            r1.m6086()     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L23:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L27
            throw r4     // Catch: java.lang.Throwable -> L27
        L27:
            r4 = move-exception
            c21 r2 = r0.f3378     // Catch: java.lang.Throwable -> L40
            boolean r2 = r2.m1113()     // Catch: java.lang.Throwable -> L40
            if (r2 != 0) goto L47
            en1 r2 = r3.f13194     // Catch: java.lang.Throwable -> L40
            xn r1 = r1.m6108()     // Catch: java.lang.Throwable -> L40
            r2.m1941(r0, r1)     // Catch: java.lang.Throwable -> L42
            r2.m1938()     // Catch: java.lang.Throwable -> L42
            r2.m1937()     // Catch: java.lang.Throwable -> L40
            goto L47
        L40:
            r4 = move-exception
            goto L48
        L42:
            r4 = move-exception
            r2.m1937()     // Catch: java.lang.Throwable -> L40
            throw r4     // Catch: java.lang.Throwable -> L40
        L47:
            throw r4     // Catch: java.lang.Throwable -> L40
        L48:
            r3.m7182()
            throw r4
        L4c:
            r3 = 0
            java.lang.Object r3 = r4.get(r3)
            l91 r3 = (p000.l91) r3
            java.lang.Object r3 = r3.f6502
            f11 r3 = (p000.f11) r3
            r3.getClass()
            r3 = 0
            throw r3
    }

    /* JADX INFO: renamed from: σ */
    public final p000.sn0 m7199(p000.bl1 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r4.f1778
            r1 = r0 & 2
            if (r1 == 0) goto La
            r0 = r0 | 4
            r4.f1778 = r0
        La:
            q80 r0 = r4.f1779
            if (r0 == 0) goto L5b
            boolean r1 = r0.m4810()
            if (r1 != 0) goto L15
            goto L5b
        L15:
            ow1 r1 = r3.f13181
            r1.getClass()
            q80 r2 = r4.f1779
            if (r2 == 0) goto L3e
            q80 r2 = p000.AbstractC0073bd.m872(r2)
            boolean r1 = r1.m4304(r2)
            r2 = 1
            if (r1 != r2) goto L3e
            e80 r1 = r4.f1780
            if (r1 == 0) goto L3b
            sn0 r4 = r3.m7200(r4, r0, r5)
            sn0 r5 = p000.sn0.f9973
            if (r4 == r5) goto L3a
            n r3 = r3.f13193
            r3.m3927()
        L3a:
            return r4
        L3b:
            sn0 r3 = p000.sn0.f9973
            return r3
        L3e:
            java.lang.Object r0 = r3.f13179
            monitor-enter(r0)
            zn r3 = r3.f13191     // Catch: java.lang.Throwable -> L58
            monitor-exit(r0)
            if (r3 == 0) goto L55
            v80 r3 = r3.f13195
            boolean r0 = r3.f11141
            if (r0 == 0) goto L55
            boolean r3 = r3.m6110(r4, r5)
            if (r3 == 0) goto L55
            sn0 r3 = p000.sn0.f9976
            return r3
        L55:
            sn0 r3 = p000.sn0.f9973
            return r3
        L58:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L5b:
            sn0 r3 = p000.sn0.f9973
            return r3
    }

    /* JADX INFO: renamed from: τ */
    public final p000.sn0 m7200(p000.bl1 r20, p000.q80 r21, java.lang.Object r22) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            java.lang.Object r3 = r0.f13179
            monitor-enter(r3)
            zn r4 = r0.f13191     // Catch: java.lang.Throwable -> L44
            r5 = 0
            if (r4 == 0) goto L47
            ow1 r6 = r0.f13181     // Catch: java.lang.Throwable -> L44
            int r7 = r0.f13192     // Catch: java.lang.Throwable -> L44
            boolean r8 = r6.f8292     // Catch: java.lang.Throwable -> L44
            if (r8 == 0) goto L1b
            java.lang.String r8 = "Writer is active"
            p000.AbstractC0804sn.m5526(r8)     // Catch: java.lang.Throwable -> L44
        L1b:
            if (r7 < 0) goto L22
            int r8 = r6.f8287     // Catch: java.lang.Throwable -> L44
            if (r7 >= r8) goto L22
            goto L27
        L22:
            java.lang.String r8 = "Invalid group index"
            p000.AbstractC0804sn.m5526(r8)     // Catch: java.lang.Throwable -> L44
        L27:
            q80 r8 = p000.AbstractC0073bd.m872(r21)     // Catch: java.lang.Throwable -> L44
            boolean r9 = r6.m4304(r8)     // Catch: java.lang.Throwable -> L44
            if (r9 == 0) goto L41
            int[] r6 = r6.f8286     // Catch: java.lang.Throwable -> L44
            int r9 = r7 * 5
            int r9 = r9 + 3
            r6 = r6[r9]     // Catch: java.lang.Throwable -> L44
            int r6 = r6 + r7
            int r8 = r8.f8904     // Catch: java.lang.Throwable -> L44
            if (r7 > r8) goto L41
            if (r8 >= r6) goto L41
            goto L42
        L41:
            r4 = r5
        L42:
            r5 = r4
            goto L47
        L44:
            r0 = move-exception
            goto Le9
        L47:
            if (r5 != 0) goto Lce
            v80 r4 = r0.f13195     // Catch: java.lang.Throwable -> L44
            boolean r6 = r4.f11141     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L57
            boolean r4 = r4.m6110(r1, r2)     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L57
            r4 = 1
            goto L58
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L5e
            sn0 r0 = p000.sn0.f9976     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)
            return r0
        L5e:
            if (r2 != 0) goto L68
            b21 r4 = r0.f13189     // Catch: java.lang.Throwable -> L44
            xn0 r6 = p000.xn0.f12219     // Catch: java.lang.Throwable -> L44
            r4.m701(r1, r6)     // Catch: java.lang.Throwable -> L44
            goto Lce
        L68:
            boolean r4 = r2 instanceof p000.C0296fs     // Catch: java.lang.Throwable -> L44
            b21 r6 = r0.f13189
            if (r4 != 0) goto L74
            xn0 r4 = p000.xn0.f12219     // Catch: java.lang.Throwable -> L44
            r6.m701(r1, r4)     // Catch: java.lang.Throwable -> L44
            goto Lce
        L74:
            java.lang.Object r4 = r6.m695(r1)     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto Lc9
            boolean r6 = r4 instanceof p000.c21     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto Lc4
            c21 r4 = (p000.c21) r4     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r6 = r4.f1942     // Catch: java.lang.Throwable -> L44
            long[] r4 = r4.f1941     // Catch: java.lang.Throwable -> L44
            int r8 = r4.length     // Catch: java.lang.Throwable -> L44
            int r8 = r8 + (-2)
            if (r8 < 0) goto Lc9
            r9 = 0
        L8a:
            r10 = r4[r9]     // Catch: java.lang.Throwable -> L44
            long r12 = ~r10     // Catch: java.lang.Throwable -> L44
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto Lbf
            int r12 = r9 - r8
            int r12 = ~r12     // Catch: java.lang.Throwable -> L44
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        La4:
            if (r14 >= r12) goto Lbd
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto Lb9
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r6[r15]     // Catch: java.lang.Throwable -> L44
            xn0 r7 = p000.xn0.f12219     // Catch: java.lang.Throwable -> L44
            if (r15 != r7) goto Lb9
            goto Lce
        Lb9:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto La4
        Lbd:
            if (r12 != r13) goto Lc9
        Lbf:
            if (r9 == r8) goto Lc9
            int r9 = r9 + 1
            goto L8a
        Lc4:
            xn0 r6 = p000.xn0.f12219     // Catch: java.lang.Throwable -> L44
            if (r4 != r6) goto Lc9
            goto Lce
        Lc9:
            b21 r4 = r0.f13189     // Catch: java.lang.Throwable -> L44
            p000.i81.m2655(r4, r1, r2)     // Catch: java.lang.Throwable -> L44
        Lce:
            monitor-exit(r3)
            if (r5 == 0) goto Ld8
            r3 = r21
            sn0 r0 = r5.m7200(r1, r3, r2)
            return r0
        Ld8:
            un r1 = r0.f13176
            r1.mo3326(r0)
            v80 r0 = r0.f13195
            boolean r0 = r0.f11141
            if (r0 == 0) goto Le6
            sn0 r0 = p000.sn0.f9975
            return r0
        Le6:
            sn0 r0 = p000.sn0.f9974
            return r0
        Le9:
            monitor-exit(r3)
            throw r0
    }

    /* JADX INFO: renamed from: υ */
    public final void m7201(java.lang.Object r15) {
            r14 = this;
            b21 r0 = r14.f13182
            java.lang.Object r0 = r0.m695(r15)
            if (r0 == 0) goto L6a
            boolean r1 = r0 instanceof p000.c21
            b21 r14 = r14.f13188
            if (r1 == 0) goto L5d
            c21 r0 = (p000.c21) r0
            java.lang.Object[] r1 = r0.f1942
            long[] r0 = r0.f1941
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L6a
            r3 = 0
            r4 = r3
        L1b:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L58
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L35:
            if (r9 >= r7) goto L56
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L52
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            bl1 r10 = (p000.bl1) r10
            sn0 r11 = r10.m979(r15)
            sn0 r12 = p000.sn0.f9976
            if (r11 != r12) goto L52
            p000.i81.m2655(r14, r15, r10)
        L52:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L56:
            if (r7 != r8) goto L6a
        L58:
            if (r4 == r2) goto L6a
            int r4 = r4 + 1
            goto L1b
        L5d:
            bl1 r0 = (p000.bl1) r0
            sn0 r1 = r0.m979(r15)
            sn0 r2 = p000.sn0.f9976
            if (r1 != r2) goto L6a
            p000.i81.m2655(r14, r15, r0)
        L6a:
            return
    }

    /* JADX INFO: renamed from: φ */
    public final boolean m7202(java.util.Set r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof p000.vq1
            b21 r3 = r0.f13185
            b21 r0 = r0.f13182
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L5e
            vq1 r1 = (p000.vq1) r1
            c21 r1 = r1.f11364
            java.lang.Object[] r2 = r1.f1942
            long[] r1 = r1.f1941
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L7b
            r7 = r4
        L1c:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L36:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            boolean r14 = r0.m691(r13)
            if (r14 != 0) goto L52
            boolean r13 = r3.m691(r13)
            if (r13 == 0) goto L53
        L52:
            return r5
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L36
        L57:
            if (r10 != r11) goto L7b
        L59:
            if (r7 == r6) goto L7b
            int r7 = r7 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r6 = r0.m691(r2)
            if (r6 != 0) goto L7a
            boolean r2 = r3.m691(r2)
            if (r2 == 0) goto L64
        L7a:
            return r5
        L7b:
            return r4
    }

    /* JADX INFO: renamed from: χ */
    public final boolean m7203() {
            r5 = this;
            java.lang.Object r0 = r5.f13179
            monitor-enter(r0)
            r5.m7194()     // Catch: java.lang.Throwable -> L78
            b21 r1 = r5.f13189     // Catch: java.lang.Throwable -> L4d
            b21 r2 = p000.i81.m2660()     // Catch: java.lang.Throwable -> L4d
            r5.f13189 = r2     // Catch: java.lang.Throwable -> L4d
            v80 r2 = r5.f13195     // Catch: java.lang.Throwable -> L42
            ke r3 = r2.f11161     // Catch: java.lang.Throwable -> L42
            h81 r3 = r3.f5866     // Catch: java.lang.Throwable -> L42
            boolean r4 = r3.m2457()     // Catch: java.lang.Throwable -> L42
            if (r4 != 0) goto L1f
            java.lang.String r4 = "Expected applyChanges() to have been called"
            p000.AbstractC0804sn.m5526(r4)     // Catch: java.lang.Throwable -> L42
        L1f:
            int r4 = r1.f1431     // Catch: java.lang.Throwable -> L42
            if (r4 > 0) goto L2d
            java.util.ArrayList r4 = r2.f11175     // Catch: java.lang.Throwable -> L42
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L2d
            r2 = 0
            goto L3c
        L2d:
            r4 = 0
            r2.f11151 = r4     // Catch: java.lang.Throwable -> L42
            r4 = 0
            r2.m6098(r1, r4)     // Catch: java.lang.Throwable -> L46
            r2.f11151 = r4     // Catch: java.lang.Throwable -> L42
            boolean r2 = r3.m2457()     // Catch: java.lang.Throwable -> L42
            r2 = r2 ^ 1
        L3c:
            if (r2 != 0) goto L44
            r5.m7195()     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r2 = move-exception
            goto L4a
        L44:
            monitor-exit(r0)
            return r2
        L46:
            r3 = move-exception
            r2.f11151 = r4     // Catch: java.lang.Throwable -> L42
            throw r3     // Catch: java.lang.Throwable -> L42
        L4a:
            r5.f13189 = r1     // Catch: java.lang.Throwable -> L4d
            throw r2     // Catch: java.lang.Throwable -> L4d
        L4d:
            r1 = move-exception
            e21 r2 = r5.f13180     // Catch: java.lang.Throwable -> L6c
            c21 r2 = r2.f3378     // Catch: java.lang.Throwable -> L6c
            boolean r2 = r2.m1113()     // Catch: java.lang.Throwable -> L6c
            if (r2 != 0) goto L73
            en1 r2 = r5.f13194     // Catch: java.lang.Throwable -> L6c
            e21 r3 = r5.f13180     // Catch: java.lang.Throwable -> L6c
            v80 r4 = r5.f13195     // Catch: java.lang.Throwable -> L6c
            xn r4 = r4.m6108()     // Catch: java.lang.Throwable -> L6c
            r2.m1941(r3, r4)     // Catch: java.lang.Throwable -> L6e
            r2.m1938()     // Catch: java.lang.Throwable -> L6e
            r2.m1937()     // Catch: java.lang.Throwable -> L6c
            goto L73
        L6c:
            r1 = move-exception
            goto L74
        L6e:
            r1 = move-exception
            r2.m1937()     // Catch: java.lang.Throwable -> L6c
            throw r1     // Catch: java.lang.Throwable -> L6c
        L73:
            throw r1     // Catch: java.lang.Throwable -> L6c
        L74:
            r5.m7182()     // Catch: java.lang.Throwable -> L78
            throw r1     // Catch: java.lang.Throwable -> L78
        L78:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    /* JADX INFO: renamed from: ψ */
    public final void m7204(p000.vq1 r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference r0 = r4.f13178
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L4a
            java.lang.Object r1 = p000.AbstractC0978xb.f12099
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L11
            goto L4a
        L11:
            boolean r1 = r0 instanceof java.util.Set
            if (r1 == 0) goto L1f
            r1 = 2
            java.util.Set[] r1 = new java.util.Set[r1]
            r2 = 0
            r1[r2] = r0
            r2 = 1
            r1[r2] = r5
            goto L4b
        L1f:
            boolean r1 = r0 instanceof java.lang.Object[]
            if (r1 == 0) goto L30
            r1 = r0
            java.util.Set[] r1 = (java.util.Set[]) r1
            int r2 = r1.length
            int r3 = r2 + 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            r1[r2] = r5
            goto L4b
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "corrupt pendingModifications: "
            java.util.concurrent.atomic.AtomicReference r4 = r4.f13178
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L4a:
            r1 = r5
        L4b:
            java.util.concurrent.atomic.AtomicReference r2 = r4.f13178
        L4d:
            boolean r3 = r2.compareAndSet(r0, r1)
            if (r3 == 0) goto L61
            if (r0 != 0) goto L60
            java.lang.Object r5 = r4.f13179
            monitor-enter(r5)
            r4.m7195()     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r5)
            return
        L5d:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L60:
            return
        L61:
            java.lang.Object r3 = r2.get()
            if (r3 == r0) goto L4d
            goto L0
    }

    /* JADX INFO: renamed from: ω */
    public final void m7205(java.lang.Object r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            v80 r2 = r0.f13195
            int r3 = r2.f11136
            if (r3 <= 0) goto Lc
            goto Ld8
        Lc:
            bl1 r2 = r2.m6107()
            if (r2 == 0) goto Ld8
            int r3 = r2.f1778
            r4 = 1
            r3 = r3 | r4
            r2.f1778 = r3
            r3 = r3 & 32
            if (r3 == 0) goto L1e
        L1c:
            r3 = 0
            goto L45
        L1e:
            u11 r3 = r2.f1782
            if (r3 != 0) goto L29
            u11 r3 = new u11
            r3.<init>()
            r2.f1782 = r3
        L29:
            int r6 = r2.f1781
            int r7 = r3.m5775(r1)
            if (r7 >= 0) goto L34
            int r7 = ~r7
            r8 = -1
            goto L38
        L34:
            int[] r8 = r3.f10557
            r8 = r8[r7]
        L38:
            java.lang.Object[] r9 = r3.f10556
            r9[r7] = r1
            int[] r3 = r3.f10557
            r3[r7] = r6
            int r3 = r2.f1781
            if (r8 != r3) goto L1c
            r3 = r4
        L45:
            n r6 = r0.f13193
            r6.m3927()
            if (r3 != 0) goto Ld8
            boolean r3 = r1 instanceof p000.j02
            if (r3 == 0) goto L56
            r3 = r1
            j02 r3 = (p000.j02) r3
            r3.m2847(r4)
        L56:
            b21 r3 = r0.f13182
            p000.i81.m2655(r3, r1, r2)
            boolean r3 = r1 instanceof p000.C0296fs
            if (r3 == 0) goto Ld8
            r3 = r1
            fs r3 = (p000.C0296fs) r3
            es r6 = r3.m2203()
            b21 r0 = r0.f13185
            p000.i81.m2674(r0, r1)
            u11 r7 = r6.f3654
            java.lang.Object[] r8 = r7.f10556
            long[] r7 = r7.f10555
            int r9 = r7.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto Lc8
            r10 = 0
        L77:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto Lc3
            int r13 = r10 - r9
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L91:
            if (r15 >= r13) goto Lc0
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto Lb7
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r8[r16]
            r5 = r16
            i02 r5 = (p000.i02) r5
            r20 = r14
            boolean r14 = r5 instanceof p000.j02
            if (r14 == 0) goto Lb3
            r14 = r5
            j02 r14 = (p000.j02) r14
            r14.m2847(r4)
        Lb3:
            p000.i81.m2655(r0, r5, r1)
            goto Lb9
        Lb7:
            r20 = r14
        Lb9:
            long r11 = r11 >> r20
            int r15 = r15 + 1
            r14 = r20
            goto L91
        Lc0:
            r5 = r14
            if (r13 != r5) goto Lc8
        Lc3:
            if (r10 == r9) goto Lc8
            int r10 = r10 + 1
            goto L77
        Lc8:
            java.lang.Object r0 = r6.f3655
            b21 r1 = r2.f1783
            if (r1 != 0) goto Ld5
            b21 r1 = new b21
            r1.<init>()
            r2.f1783 = r1
        Ld5:
            r1.m701(r3, r0)
        Ld8:
            return
    }
}
