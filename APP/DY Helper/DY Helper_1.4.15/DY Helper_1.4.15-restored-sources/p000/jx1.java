package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class jx1 {

    /* JADX INFO: renamed from: α */
    public final p000.a80 f5635;

    /* JADX INFO: renamed from: β */
    public java.lang.Object f5636;

    /* JADX INFO: renamed from: γ */
    public p000.u11 f5637;

    /* JADX INFO: renamed from: δ */
    public int f5638;

    /* JADX INFO: renamed from: ε */
    public final p000.b21 f5639;

    /* JADX INFO: renamed from: ζ */
    public final p000.b21 f5640;

    /* JADX INFO: renamed from: η */
    public final p000.c21 f5641;

    /* JADX INFO: renamed from: θ */
    public final p000.k21 f5642;

    /* JADX INFO: renamed from: ι */
    public final p000.u80 f5643;

    /* JADX INFO: renamed from: κ */
    public boolean f5644;

    /* JADX INFO: renamed from: λ */
    public int f5645;

    /* JADX INFO: renamed from: μ */
    public final p000.b21 f5646;

    /* JADX INFO: renamed from: ν */
    public final java.util.HashMap f5647;

    public jx1(p000.a80 r2) {
            r1 = this;
            r1.<init>()
            r1.f5635 = r2
            r2 = -1
            r1.f5638 = r2
            b21 r2 = p000.i81.m2660()
            r1.f5639 = r2
            b21 r2 = new b21
            r2.<init>()
            r1.f5640 = r2
            c21 r2 = new c21
            r2.<init>()
            r1.f5641 = r2
            k21 r2 = new k21
            r0 = 16
            fs[] r0 = new p000.C0296fs[r0]
            r2.<init>(r0)
            r1.f5642 = r2
            u80 r2 = new u80
            r0 = 1
            r2.<init>(r0, r1)
            r1.f5643 = r2
            b21 r2 = p000.i81.m2660()
            r1.f5646 = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f5647 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public final boolean m3067(java.util.Set r45) {
            r44 = this;
            r1 = r44
            r0 = r45
            boolean r2 = r0 instanceof p000.vq1
            k21 r3 = r1.f5642
            r9 = 2
            b21 r15 = r1.f5646
            r16 = 128(0x80, double:6.3E-322)
            java.util.HashMap r4 = r1.f5647
            b21 r5 = r1.f5639
            r18 = 255(0xff, double:1.26E-321)
            c21 r6 = r1.f5641
            if (r2 == 0) goto L2ef
            vq1 r0 = (p000.vq1) r0
            c21 r0 = r0.f11364
            java.lang.Object[] r2 = r0.f1942
            long[] r0 = r0.f1941
            int r7 = r0.length
            int r7 = r7 - r9
            if (r7 < 0) goto L2e2
            r8 = 0
            r20 = 7
            r21 = 0
            r22 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L2d:
            r10 = r0[r8]
            r24 = 8
            long r12 = ~r10
            long r12 = r12 << r20
            long r12 = r12 & r10
            long r12 = r12 & r22
            int r12 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r12 == 0) goto L2d2
            int r12 = r8 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = 0
        L43:
            if (r13 >= r12) goto L2c1
            long r26 = r10 & r18
            int r26 = (r26 > r16 ? 1 : (r26 == r16 ? 0 : -1))
            if (r26 >= 0) goto L29f
            int r26 = r8 << 3
            int r26 = r26 + r13
            r14 = r2[r26]
            boolean r9 = r14 instanceof p000.j02
            if (r9 == 0) goto L63
            r9 = r14
            j02 r9 = (p000.j02) r9
            r45 = r0
            r0 = 2
            boolean r9 = r9.m2846(r0)
            if (r9 != 0) goto L65
            goto L2a1
        L63:
            r45 = r0
        L65:
            boolean r0 = r1.f5644
            if (r0 != 0) goto L238
            boolean r0 = r15.m691(r14)
            if (r0 == 0) goto L238
            r0 = 1
            r1.f5644 = r0
            java.lang.Object r0 = r15.m695(r14)     // Catch: java.lang.Throwable -> L11e
            if (r0 == 0) goto L220
            boolean r9 = r0 instanceof p000.c21     // Catch: java.lang.Throwable -> L11e
            if (r9 == 0) goto L1a7
            c21 r0 = (p000.c21) r0     // Catch: java.lang.Throwable -> L11e
            java.lang.Object[] r9 = r0.f1942     // Catch: java.lang.Throwable -> L11e
            long[] r0 = r0.f1941     // Catch: java.lang.Throwable -> L11e
            r28 = r2
            int r2 = r0.length     // Catch: java.lang.Throwable -> L11e
            r26 = 2
            int r2 = r2 + (-2)
            if (r2 < 0) goto L222
            r29 = r0
            r30 = r10
            r0 = 0
            r11 = r9
        L91:
            r9 = r29[r0]     // Catch: java.lang.Throwable -> L11e
            r32 = r7
            r33 = r8
            long r7 = ~r9     // Catch: java.lang.Throwable -> L11e
            long r7 = r7 << r20
            long r7 = r7 & r9
            long r7 = r7 & r22
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L188
            int r7 = r0 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L11e
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = 0
        La9:
            if (r8 >= r7) goto L17b
            long r34 = r9 & r18
            int r34 = (r34 > r16 ? 1 : (r34 == r16 ? 0 : -1))
            if (r34 >= 0) goto L15d
            int r34 = r0 << 3
            int r34 = r34 + r8
            r34 = r11[r34]     // Catch: java.lang.Throwable -> L11e
            r35 = r8
            r8 = r34
            fs r8 = (p000.C0296fs) r8     // Catch: java.lang.Throwable -> L11e
            r8.getClass()     // Catch: java.lang.Throwable -> L11e
            r36 = r9
            java.lang.Object r9 = r4.get(r8)     // Catch: java.lang.Throwable -> L11e
            es r10 = r8.m2203()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r10 = r10.f3655     // Catch: java.lang.Throwable -> L11e
            boolean r9 = p000.ln0.m3626(r10, r9)     // Catch: java.lang.Throwable -> L11e
            if (r9 != 0) goto L14f
            java.lang.Object r8 = r5.m695(r8)     // Catch: java.lang.Throwable -> L11e
            if (r8 == 0) goto L161
            boolean r9 = r8 instanceof p000.c21     // Catch: java.lang.Throwable -> L11e
            if (r9 == 0) goto L141
            c21 r8 = (p000.c21) r8     // Catch: java.lang.Throwable -> L11e
            java.lang.Object[] r9 = r8.f1942     // Catch: java.lang.Throwable -> L11e
            long[] r8 = r8.f1941     // Catch: java.lang.Throwable -> L11e
            int r10 = r8.length     // Catch: java.lang.Throwable -> L11e
            r26 = 2
            int r10 = r10 + (-2)
            if (r10 < 0) goto L161
            r34 = r8
            r39 = r11
            r38 = r12
            r8 = 0
        Lf0:
            r11 = r34[r8]     // Catch: java.lang.Throwable -> L11e
            r40 = r13
            r41 = r14
            long r13 = ~r11     // Catch: java.lang.Throwable -> L11e
            long r13 = r13 << r20
            long r13 = r13 & r11
            long r13 = r13 & r22
            int r13 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r13 == 0) goto L132
            int r13 = r8 - r10
            int r13 = ~r13     // Catch: java.lang.Throwable -> L11e
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = 0
        L108:
            if (r14 >= r13) goto L12b
            long r42 = r11 & r18
            int r42 = (r42 > r16 ? 1 : (r42 == r16 ? 0 : -1))
            if (r42 >= 0) goto L122
            int r21 = r8 << 3
            int r21 = r21 + r14
            r42 = r9
            r9 = r42[r21]     // Catch: java.lang.Throwable -> L11e
            r6.m1107(r9)     // Catch: java.lang.Throwable -> L11e
            r21 = 1
            goto L124
        L11e:
            r0 = move-exception
            r2 = 0
            goto L235
        L122:
            r42 = r9
        L124:
            long r11 = r11 >> r24
            int r14 = r14 + 1
            r9 = r42
            goto L108
        L12b:
            r42 = r9
            r9 = r24
            if (r13 != r9) goto L15a
            goto L134
        L132:
            r42 = r9
        L134:
            if (r8 == r10) goto L15a
            int r8 = r8 + 1
            r13 = r40
            r14 = r41
            r9 = r42
            r24 = 8
            goto Lf0
        L141:
            r39 = r11
            r38 = r12
            r40 = r13
            r41 = r14
            r6.m1107(r8)     // Catch: java.lang.Throwable -> L11e
            r21 = 1
            goto L15a
        L14f:
            r39 = r11
            r38 = r12
            r40 = r13
            r41 = r14
            r3.m3127(r8)     // Catch: java.lang.Throwable -> L11e
        L15a:
            r9 = 8
            goto L16a
        L15d:
            r35 = r8
            r36 = r9
        L161:
            r39 = r11
            r38 = r12
            r40 = r13
            r41 = r14
            goto L15a
        L16a:
            long r10 = r36 >> r9
            int r8 = r35 + 1
            r24 = r9
            r9 = r10
            r12 = r38
            r11 = r39
            r13 = r40
            r14 = r41
            goto La9
        L17b:
            r39 = r11
            r38 = r12
            r40 = r13
            r41 = r14
            r9 = r24
            if (r7 != r9) goto L1a4
            goto L190
        L188:
            r39 = r11
            r38 = r12
            r40 = r13
            r41 = r14
        L190:
            if (r0 == r2) goto L1a4
            int r0 = r0 + 1
            r7 = r32
            r8 = r33
            r12 = r38
            r11 = r39
            r13 = r40
            r14 = r41
            r24 = 8
            goto L91
        L1a4:
            r2 = 0
            goto L230
        L1a7:
            r28 = r2
            r32 = r7
            r33 = r8
            r30 = r10
            r38 = r12
            r40 = r13
            r41 = r14
            fs r0 = (p000.C0296fs) r0     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r2 = r4.get(r0)     // Catch: java.lang.Throwable -> L11e
            es r7 = r0.m2203()     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r7 = r7.f3655     // Catch: java.lang.Throwable -> L11e
            boolean r2 = p000.ln0.m3626(r7, r2)     // Catch: java.lang.Throwable -> L11e
            if (r2 != 0) goto L21c
            java.lang.Object r0 = r5.m695(r0)     // Catch: java.lang.Throwable -> L11e
            if (r0 == 0) goto L1a4
            boolean r2 = r0 instanceof p000.c21     // Catch: java.lang.Throwable -> L11e
            if (r2 == 0) goto L216
            c21 r0 = (p000.c21) r0     // Catch: java.lang.Throwable -> L11e
            java.lang.Object[] r2 = r0.f1942     // Catch: java.lang.Throwable -> L11e
            long[] r0 = r0.f1941     // Catch: java.lang.Throwable -> L11e
            int r7 = r0.length     // Catch: java.lang.Throwable -> L11e
            r26 = 2
            int r7 = r7 + (-2)
            if (r7 < 0) goto L1a4
            r8 = 0
        L1df:
            r9 = r0[r8]     // Catch: java.lang.Throwable -> L11e
            long r11 = ~r9     // Catch: java.lang.Throwable -> L11e
            long r11 = r11 << r20
            long r11 = r11 & r9
            long r11 = r11 & r22
            int r11 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r11 == 0) goto L211
            int r11 = r8 - r7
            int r11 = ~r11     // Catch: java.lang.Throwable -> L11e
            int r11 = r11 >>> 31
            r24 = 8
            int r12 = 8 - r11
            r11 = 0
        L1f5:
            if (r11 >= r12) goto L20d
            long r13 = r9 & r18
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 >= 0) goto L207
            int r13 = r8 << 3
            int r13 = r13 + r11
            r13 = r2[r13]     // Catch: java.lang.Throwable -> L11e
            r6.m1107(r13)     // Catch: java.lang.Throwable -> L11e
            r21 = 1
        L207:
            r13 = 8
            long r9 = r9 >> r13
            int r11 = r11 + 1
            goto L1f5
        L20d:
            r13 = 8
            if (r12 != r13) goto L1a4
        L211:
            if (r8 == r7) goto L1a4
            int r8 = r8 + 1
            goto L1df
        L216:
            r6.m1107(r0)     // Catch: java.lang.Throwable -> L11e
            r21 = 1
            goto L1a4
        L21c:
            r3.m3127(r0)     // Catch: java.lang.Throwable -> L11e
            goto L1a4
        L220:
            r28 = r2
        L222:
            r32 = r7
            r33 = r8
            r30 = r10
            r38 = r12
            r40 = r13
            r41 = r14
            goto L1a4
        L230:
            r1.f5644 = r2
        L232:
            r0 = r41
            goto L247
        L235:
            r1.f5644 = r2
            throw r0
        L238:
            r28 = r2
            r32 = r7
            r33 = r8
            r30 = r10
            r38 = r12
            r40 = r13
            r41 = r14
            goto L232
        L247:
            java.lang.Object r0 = r5.m695(r0)
            if (r0 == 0) goto L29c
            boolean r2 = r0 instanceof p000.c21
            if (r2 == 0) goto L297
            c21 r0 = (p000.c21) r0
            java.lang.Object[] r2 = r0.f1942
            long[] r0 = r0.f1941
            int r7 = r0.length
            r26 = 2
            int r7 = r7 + (-2)
            if (r7 < 0) goto L29c
            r8 = 0
        L25f:
            r9 = r0[r8]
            long r11 = ~r9
            long r11 = r11 << r20
            long r11 = r11 & r9
            long r11 = r11 & r22
            int r11 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r11 == 0) goto L292
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r24 = 8
            int r12 = 8 - r11
            r10 = r9
            r9 = 0
        L276:
            if (r9 >= r12) goto L28e
            long r13 = r10 & r18
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 >= 0) goto L288
            int r13 = r8 << 3
            int r13 = r13 + r9
            r13 = r2[r13]
            r6.m1107(r13)
            r21 = 1
        L288:
            r13 = 8
            long r10 = r10 >> r13
            int r9 = r9 + 1
            goto L276
        L28e:
            r13 = 8
            if (r12 != r13) goto L29c
        L292:
            if (r8 == r7) goto L29c
            int r8 = r8 + 1
            goto L25f
        L297:
            r6.m1107(r0)
            r21 = 1
        L29c:
            r9 = 8
            goto L2ae
        L29f:
            r45 = r0
        L2a1:
            r28 = r2
            r32 = r7
            r33 = r8
            r30 = r10
            r38 = r12
            r40 = r13
            goto L29c
        L2ae:
            long r10 = r30 >> r9
            int r13 = r40 + 1
            r0 = r45
            r24 = r9
            r2 = r28
            r7 = r32
            r8 = r33
            r12 = r38
            r9 = 2
            goto L43
        L2c1:
            r45 = r0
            r28 = r2
            r32 = r7
            r33 = r8
            r9 = r24
            if (r12 != r9) goto L2eb
            r7 = r32
            r14 = r33
            goto L2d7
        L2d2:
            r45 = r0
            r28 = r2
            r14 = r8
        L2d7:
            if (r14 == r7) goto L2eb
            int r8 = r14 + 1
            r0 = r45
            r2 = r28
            r9 = 2
            goto L2d
        L2e2:
            r20 = 7
            r22 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r21 = 0
        L2eb:
            r8 = r1
            r1 = 0
            goto L526
        L2ef:
            r20 = 7
            r22 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L2fd:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L522
            java.lang.Object r7 = r0.next()
            boolean r8 = r7 instanceof p000.j02
            if (r8 == 0) goto L31b
            r8 = r7
            j02 r8 = (p000.j02) r8
            r9 = 2
            boolean r8 = r8.m2846(r9)
            if (r8 != 0) goto L31b
            r45 = r0
            r8 = r1
            r1 = 0
            goto L51d
        L31b:
            boolean r8 = r1.f5644
            if (r8 != 0) goto L4c2
            boolean r8 = r15.m691(r7)
            if (r8 == 0) goto L4c2
            r8 = 1
            r1.f5644 = r8
            java.lang.Object r9 = r15.m695(r7)     // Catch: java.lang.Throwable -> L4bc
            if (r9 == 0) goto L4b5
            boolean r10 = r9 instanceof p000.c21     // Catch: java.lang.Throwable -> L3d0
            if (r10 == 0) goto L440
            c21 r9 = (p000.c21) r9     // Catch: java.lang.Throwable -> L3d0
            java.lang.Object[] r10 = r9.f1942     // Catch: java.lang.Throwable -> L3d0
            long[] r9 = r9.f1941     // Catch: java.lang.Throwable -> L3d0
            int r11 = r9.length     // Catch: java.lang.Throwable -> L3d0
            r26 = 2
            int r11 = r11 + (-2)
            if (r11 < 0) goto L4b5
            r12 = r2
            r2 = 0
        L341:
            r13 = r9[r2]     // Catch: java.lang.Throwable -> L3d0
            r21 = r9
            long r8 = ~r13     // Catch: java.lang.Throwable -> L3d0
            long r8 = r8 << r20
            long r8 = r8 & r13
            long r8 = r8 & r22
            int r8 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r8 == 0) goto L428
            int r8 = r2 - r11
            int r8 = ~r8     // Catch: java.lang.Throwable -> L3d0
            int r8 = r8 >>> 31
            r24 = 8
            int r8 = 8 - r8
            r9 = 0
        L359:
            if (r9 >= r8) goto L41d
            long r28 = r13 & r18
            int r28 = (r28 > r16 ? 1 : (r28 == r16 ? 0 : -1))
            if (r28 >= 0) goto L407
            int r28 = r2 << 3
            int r28 = r28 + r9
            r28 = r10[r28]     // Catch: java.lang.Throwable -> L3d0
            r45 = r0
            r0 = r28
            fs r0 = (p000.C0296fs) r0     // Catch: java.lang.Throwable -> L3d0
            r0.getClass()     // Catch: java.lang.Throwable -> L3d0
            r28 = r9
            java.lang.Object r9 = r4.get(r0)     // Catch: java.lang.Throwable -> L3d0
            r29 = r10
            es r10 = r0.m2203()     // Catch: java.lang.Throwable -> L3d0
            java.lang.Object r10 = r10.f3655     // Catch: java.lang.Throwable -> L3d0
            boolean r9 = p000.ln0.m3626(r10, r9)     // Catch: java.lang.Throwable -> L3d0
            if (r9 != 0) goto L3ff
            java.lang.Object r0 = r5.m695(r0)     // Catch: java.lang.Throwable -> L3d0
            if (r0 == 0) goto L3fa
            boolean r9 = r0 instanceof p000.c21     // Catch: java.lang.Throwable -> L3d0
            if (r9 == 0) goto L3f3
            c21 r0 = (p000.c21) r0     // Catch: java.lang.Throwable -> L3d0
            java.lang.Object[] r9 = r0.f1942     // Catch: java.lang.Throwable -> L3d0
            long[] r0 = r0.f1941     // Catch: java.lang.Throwable -> L3d0
            int r10 = r0.length     // Catch: java.lang.Throwable -> L3d0
            r26 = 2
            int r10 = r10 + (-2)
            if (r10 < 0) goto L3fa
            r30 = r12
            r31 = r13
            r12 = 0
        L3a0:
            r13 = r0[r12]     // Catch: java.lang.Throwable -> L3d0
            r33 = r0
            long r0 = ~r13     // Catch: java.lang.Throwable -> L3d0
            long r0 = r0 << r20
            long r0 = r0 & r13
            long r0 = r0 & r22
            int r0 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r0 == 0) goto L3e7
            int r0 = r12 - r10
            int r0 = ~r0     // Catch: java.lang.Throwable -> L3d0
            int r0 = r0 >>> 31
            r24 = 8
            int r0 = 8 - r0
            r1 = 0
        L3b8:
            if (r1 >= r0) goto L3df
            long r34 = r13 & r18
            int r34 = (r34 > r16 ? 1 : (r34 == r16 ? 0 : -1))
            if (r34 >= 0) goto L3d6
            int r30 = r12 << 3
            int r30 = r30 + r1
            r34 = r1
            r1 = r9[r30]     // Catch: java.lang.Throwable -> L3d0
            r6.m1107(r1)     // Catch: java.lang.Throwable -> L3d0
            r30 = 1
        L3cd:
            r1 = 8
            goto L3d9
        L3d0:
            r0 = move-exception
            r1 = 0
            r8 = r44
            goto L4bf
        L3d6:
            r34 = r1
            goto L3cd
        L3d9:
            long r13 = r13 >> r1
            int r24 = r34 + 1
            r1 = r24
            goto L3b8
        L3df:
            r1 = 8
            if (r0 != r1) goto L3e4
            goto L3e7
        L3e4:
            r0 = r30
            goto L3fd
        L3e7:
            if (r12 == r10) goto L3f0
            int r12 = r12 + 1
            r1 = r44
            r0 = r33
            goto L3a0
        L3f0:
            r12 = r30
            goto L3fc
        L3f3:
            r31 = r13
            r6.m1107(r0)     // Catch: java.lang.Throwable -> L3d0
            r0 = 1
            goto L3fd
        L3fa:
            r31 = r13
        L3fc:
            r0 = r12
        L3fd:
            r12 = r0
            goto L404
        L3ff:
            r31 = r13
            r3.m3127(r0)     // Catch: java.lang.Throwable -> L3d0
        L404:
            r9 = 8
            goto L410
        L407:
            r45 = r0
            r28 = r9
            r29 = r10
            r31 = r13
            goto L404
        L410:
            long r13 = r31 >> r9
            int r0 = r28 + 1
            r1 = r44
            r9 = r0
            r10 = r29
            r0 = r45
            goto L359
        L41d:
            r45 = r0
            r29 = r10
            r9 = 8
            if (r8 != r9) goto L426
            goto L42c
        L426:
            r2 = r12
            goto L43b
        L428:
            r45 = r0
            r29 = r10
        L42c:
            if (r2 == r11) goto L426
            int r2 = r2 + 1
            r8 = 1
            r1 = r44
            r0 = r45
            r9 = r21
            r10 = r29
            goto L341
        L43b:
            r1 = 0
            r8 = r44
            goto L4b8
        L440:
            r45 = r0
            fs r9 = (p000.C0296fs) r9     // Catch: java.lang.Throwable -> L3d0
            java.lang.Object r0 = r4.get(r9)     // Catch: java.lang.Throwable -> L3d0
            es r1 = r9.m2203()     // Catch: java.lang.Throwable -> L3d0
            java.lang.Object r1 = r1.f3655     // Catch: java.lang.Throwable -> L3d0
            boolean r0 = p000.ln0.m3626(r1, r0)     // Catch: java.lang.Throwable -> L3d0
            if (r0 != 0) goto L4b1
            java.lang.Object r0 = r5.m695(r9)     // Catch: java.lang.Throwable -> L3d0
            if (r0 == 0) goto L4ae
            boolean r1 = r0 instanceof p000.c21     // Catch: java.lang.Throwable -> L3d0
            if (r1 == 0) goto L4a9
            c21 r0 = (p000.c21) r0     // Catch: java.lang.Throwable -> L3d0
            java.lang.Object[] r1 = r0.f1942     // Catch: java.lang.Throwable -> L3d0
            long[] r0 = r0.f1941     // Catch: java.lang.Throwable -> L3d0
            int r8 = r0.length     // Catch: java.lang.Throwable -> L3d0
            r26 = 2
            int r8 = r8 + (-2)
            if (r8 < 0) goto L4ae
            r9 = r2
            r2 = 0
        L46d:
            r10 = r0[r2]     // Catch: java.lang.Throwable -> L3d0
            long r12 = ~r10     // Catch: java.lang.Throwable -> L3d0
            long r12 = r12 << r20
            long r12 = r12 & r10
            long r12 = r12 & r22
            int r12 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r12 == 0) goto L4a2
            int r12 = r2 - r8
            int r12 = ~r12     // Catch: java.lang.Throwable -> L3d0
            int r12 = r12 >>> 31
            r24 = 8
            int r12 = 8 - r12
            r13 = r10
            r10 = 0
        L484:
            if (r10 >= r12) goto L49b
            long r28 = r13 & r18
            int r11 = (r28 > r16 ? 1 : (r28 == r16 ? 0 : -1))
            if (r11 >= 0) goto L495
            int r9 = r2 << 3
            int r9 = r9 + r10
            r9 = r1[r9]     // Catch: java.lang.Throwable -> L3d0
            r6.m1107(r9)     // Catch: java.lang.Throwable -> L3d0
            r9 = 1
        L495:
            r11 = 8
            long r13 = r13 >> r11
            int r10 = r10 + 1
            goto L484
        L49b:
            r11 = 8
            if (r12 != r11) goto L4a0
            goto L4a2
        L4a0:
            r0 = r9
            goto L4af
        L4a2:
            if (r2 == r8) goto L4a7
            int r2 = r2 + 1
            goto L46d
        L4a7:
            r2 = r9
            goto L4ae
        L4a9:
            r6.m1107(r0)     // Catch: java.lang.Throwable -> L3d0
            r0 = 1
            goto L4af
        L4ae:
            r0 = r2
        L4af:
            r2 = r0
            goto L43b
        L4b1:
            r3.m3127(r9)     // Catch: java.lang.Throwable -> L3d0
            goto L43b
        L4b5:
            r45 = r0
            goto L43b
        L4b8:
            r8.f5644 = r1
        L4ba:
            r0 = r2
            goto L4c7
        L4bc:
            r0 = move-exception
            r8 = r1
            r1 = 0
        L4bf:
            r8.f5644 = r1
            throw r0
        L4c2:
            r45 = r0
            r8 = r1
            r1 = 0
            goto L4ba
        L4c7:
            java.lang.Object r2 = r5.m695(r7)
            if (r2 == 0) goto L51c
            boolean r7 = r2 instanceof p000.c21
            if (r7 == 0) goto L518
            c21 r2 = (p000.c21) r2
            java.lang.Object[] r7 = r2.f1942
            long[] r2 = r2.f1941
            int r9 = r2.length
            r26 = 2
            int r9 = r9 + (-2)
            if (r9 < 0) goto L51c
            r10 = r1
        L4df:
            r11 = r2[r10]
            long r13 = ~r11
            long r13 = r13 << r20
            long r13 = r13 & r11
            long r13 = r13 & r22
            int r13 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r13 == 0) goto L513
            int r13 = r10 - r9
            int r13 = ~r13
            int r13 = r13 >>> 31
            r24 = 8
            int r13 = 8 - r13
            r27 = r11
            r11 = r1
        L4f7:
            if (r11 >= r13) goto L50f
            long r29 = r27 & r18
            int r12 = (r29 > r16 ? 1 : (r29 == r16 ? 0 : -1))
            if (r12 >= 0) goto L508
            int r0 = r10 << 3
            int r0 = r0 + r11
            r0 = r7[r0]
            r6.m1107(r0)
            r0 = 1
        L508:
            r12 = 8
            long r27 = r27 >> r12
            int r11 = r11 + 1
            goto L4f7
        L50f:
            r12 = 8
            if (r13 != r12) goto L51c
        L513:
            if (r10 == r9) goto L51c
            int r10 = r10 + 1
            goto L4df
        L518:
            r6.m1107(r2)
            r0 = 1
        L51c:
            r2 = r0
        L51d:
            r0 = r45
            r1 = r8
            goto L2fd
        L522:
            r21 = r2
            goto L2eb
        L526:
            boolean r0 = r8.f5644
            if (r0 != 0) goto L5f7
            int r0 = r3.f5718
            if (r0 == 0) goto L5f7
            java.lang.Object[] r2 = r3.f5716
            r4 = r1
        L531:
            if (r4 >= r0) goto L5f4
            r6 = r2[r4]
            fs r6 = (p000.C0296fs) r6
            tw1 r7 = p000.ax1.m628()
            long r9 = r7.mo5759()
            int r7 = java.lang.Long.hashCode(r9)
            java.lang.Object r9 = r5.m695(r6)
            if (r9 == 0) goto L5e3
            boolean r10 = r9 instanceof p000.c21
            b21 r11 = r8.f5640
            if (r10 == 0) goto L5c7
            c21 r9 = (p000.c21) r9
            java.lang.Object[] r10 = r9.f1942
            long[] r9 = r9.f1941
            int r12 = r9.length
            r26 = 2
            int r12 = r12 + (-2)
            if (r12 < 0) goto L5c0
            r13 = r1
        L55d:
            r14 = r9[r13]
            r25 = r2
            long r1 = ~r14
            long r1 = r1 << r20
            long r1 = r1 & r14
            long r1 = r1 & r22
            int r1 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r1 == 0) goto L5b2
            int r1 = r13 - r12
            int r1 = ~r1
            int r1 = r1 >>> 31
            r24 = 8
            int r1 = 8 - r1
            r2 = 0
        L575:
            if (r2 >= r1) goto L5ab
            long r28 = r14 & r18
            int r28 = (r28 > r16 ? 1 : (r28 == r16 ? 0 : -1))
            if (r28 >= 0) goto L5a0
            int r28 = r13 << 3
            int r28 = r28 + r2
            r29 = r0
            r0 = r10[r28]
            java.lang.Object r28 = r11.m695(r0)
            u11 r28 = (p000.u11) r28
            r30 = r2
            if (r28 != 0) goto L598
            u11 r2 = new u11
            r2.<init>()
            r11.m701(r0, r2)
            goto L59a
        L598:
            r2 = r28
        L59a:
            r8.m3068(r6, r7, r0, r2)
        L59d:
            r0 = 8
            goto L5a5
        L5a0:
            r29 = r0
            r30 = r2
            goto L59d
        L5a5:
            long r14 = r14 >> r0
            int r2 = r30 + 1
            r0 = r29
            goto L575
        L5ab:
            r29 = r0
            r0 = 8
            if (r1 != r0) goto L5eb
            goto L5b6
        L5b2:
            r29 = r0
            r0 = 8
        L5b6:
            if (r13 == r12) goto L5eb
            int r13 = r13 + 1
            r2 = r25
            r0 = r29
            r1 = 0
            goto L55d
        L5c0:
            r29 = r0
            r25 = r2
            r0 = 8
            goto L5eb
        L5c7:
            r29 = r0
            r25 = r2
            r0 = 8
            r26 = 2
            java.lang.Object r1 = r11.m695(r9)
            u11 r1 = (p000.u11) r1
            if (r1 != 0) goto L5df
            u11 r1 = new u11
            r1.<init>()
            r11.m701(r9, r1)
        L5df:
            r8.m3068(r6, r7, r9, r1)
            goto L5eb
        L5e3:
            r29 = r0
            r25 = r2
            r0 = 8
            r26 = 2
        L5eb:
            int r4 = r4 + 1
            r2 = r25
            r0 = r29
            r1 = 0
            goto L531
        L5f4:
            r3.m3132()
        L5f7:
            return r21
    }

    /* JADX INFO: renamed from: β */
    public final void m3068(java.lang.Object r21, int r22, java.lang.Object r23, p000.u11 r24) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r0.f5645
            if (r4 <= 0) goto Le
            goto La4
        Le:
            int r4 = r3.m5775(r1)
            if (r4 >= 0) goto L17
            int r4 = ~r4
            r6 = -1
            goto L1b
        L17:
            int[] r6 = r3.f10557
            r6 = r6[r4]
        L1b:
            java.lang.Object[] r7 = r3.f10556
            r7[r4] = r1
            int[] r3 = r3.f10557
            r3[r4] = r2
            boolean r3 = r1 instanceof p000.C0296fs
            r4 = 2
            if (r3 == 0) goto L90
            if (r6 == r2) goto L90
            r2 = r1
            fs r2 = (p000.C0296fs) r2
            es r2 = r2.m2203()
            java.util.HashMap r3 = r0.f5647
            java.lang.Object r7 = r2.f3655
            r3.put(r1, r7)
            u11 r2 = r2.f3654
            b21 r3 = r0.f5646
            p000.i81.m2674(r3, r1)
            java.lang.Object[] r7 = r2.f10556
            long[] r2 = r2.f10555
            int r8 = r2.length
            int r8 = r8 - r4
            if (r8 < 0) goto L90
            r10 = 0
        L48:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8b
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L62:
            if (r15 >= r13) goto L89
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L85
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r7[r16]
            r9 = r16
            i02 r9 = (p000.i02) r9
            boolean r5 = r9 instanceof p000.j02
            if (r5 == 0) goto L82
            r5 = r9
            j02 r5 = (p000.j02) r5
            r5.m2847(r4)
        L82:
            p000.i81.m2655(r3, r9, r1)
        L85:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L62
        L89:
            if (r13 != r14) goto L90
        L8b:
            if (r10 == r8) goto L90
            int r10 = r10 + 1
            goto L48
        L90:
            r2 = -1
            if (r6 != r2) goto La4
            boolean r2 = r1 instanceof p000.j02
            if (r2 == 0) goto L9d
            r2 = r1
            j02 r2 = (p000.j02) r2
            r2.m2847(r4)
        L9d:
            b21 r0 = r0.f5639
            r2 = r23
            p000.i81.m2655(r0, r1, r2)
        La4:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m3069(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            b21 r0 = r1.f5639
            p000.i81.m2673(r0, r3, r2)
            boolean r2 = r3 instanceof p000.C0296fs
            if (r2 == 0) goto L19
            boolean r2 = r0.m691(r3)
            if (r2 != 0) goto L19
            b21 r2 = r1.f5646
            p000.i81.m2674(r2, r3)
            java.util.HashMap r1 = r1.f5647
            r1.remove(r3)
        L19:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m3070() {
            r33 = this;
            r0 = r33
            b21 r1 = r0.f5640
            long[] r2 = r1.f1427
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto Lde
            r5 = 0
        Lc:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto Ld4
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r13 = 0
        L26:
            if (r13 >= r8) goto Lce
            r14 = 255(0xff, double:1.26E-321)
            long r16 = r6 & r14
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto Lb6
            int r16 = r5 << 3
            int r4 = r16 + r13
            r16 = r10
            java.lang.Object[] r10 = r1.f1428
            r10 = r10[r4]
            r20 = r11
            java.lang.Object[] r11 = r1.f1429
            r11 = r11[r4]
            u11 r11 = (p000.u11) r11
            r10.getClass()
            r12 = r10
            x81 r12 = (p000.x81) r12
            boolean r12 = r12.mo410()
            if (r12 != 0) goto La8
            r22 = r14
            java.lang.Object[] r14 = r11.f10556
            int[] r15 = r11.f10557
            long[] r11 = r11.f10555
            r24 = r9
            int r9 = r11.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto La8
            r25 = r2
            r26 = r6
            r2 = 0
        L64:
            r6 = r11[r2]
            r29 = r11
            r28 = r12
            long r11 = ~r6
            long r11 = r11 << r16
            long r11 = r11 & r6
            long r11 = r11 & r20
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 == 0) goto L9d
            int r11 = r2 - r9
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = 0
        L7c:
            if (r12 >= r11) goto L99
            long r30 = r6 & r22
            int r30 = (r30 > r18 ? 1 : (r30 == r18 ? 0 : -1))
            if (r30 >= 0) goto L92
            int r30 = r2 << 3
            int r30 = r30 + r12
            r31 = r6
            r6 = r14[r30]
            r7 = r15[r30]
            r0.m3069(r10, r6)
            goto L94
        L92:
            r31 = r6
        L94:
            long r6 = r31 >> r24
            int r12 = r12 + 1
            goto L7c
        L99:
            r6 = r24
            if (r11 != r6) goto Lae
        L9d:
            if (r2 == r9) goto Lae
            int r2 = r2 + 1
            r12 = r28
            r11 = r29
            r24 = 8
            goto L64
        La8:
            r25 = r2
            r26 = r6
            r28 = r12
        Lae:
            if (r28 != 0) goto Lb3
            r1.m700(r4)
        Lb3:
            r6 = 8
            goto Lbf
        Lb6:
            r25 = r2
            r26 = r6
            r16 = r10
            r20 = r11
            r6 = r9
        Lbf:
            long r9 = r26 >> r6
            int r13 = r13 + 1
            r11 = r9
            r9 = r6
            r6 = r11
            r10 = r16
            r11 = r20
            r2 = r25
            goto L26
        Lce:
            r25 = r2
            r6 = r9
            if (r8 != r6) goto Lde
            goto Ld6
        Ld4:
            r25 = r2
        Ld6:
            if (r5 == r3) goto Lde
            int r5 = r5 + 1
            r2 = r25
            goto Lc
        Lde:
            return
    }
}
