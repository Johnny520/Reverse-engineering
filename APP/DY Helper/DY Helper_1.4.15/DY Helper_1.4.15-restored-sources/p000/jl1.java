package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class jl1 extends p000.y12 implements p000.f80 {

    /* JADX INFO: renamed from: ι */
    public java.util.List f5507;

    /* JADX INFO: renamed from: κ */
    public java.util.List f5508;

    /* JADX INFO: renamed from: λ */
    public java.util.List f5509;

    /* JADX INFO: renamed from: μ */
    public p000.c21 f5510;

    /* JADX INFO: renamed from: ν */
    public p000.c21 f5511;

    /* JADX INFO: renamed from: ξ */
    public p000.c21 f5512;

    /* JADX INFO: renamed from: ο */
    public java.util.Set f5513;

    /* JADX INFO: renamed from: π */
    public p000.c21 f5514;

    /* JADX INFO: renamed from: ρ */
    public int f5515;

    /* JADX INFO: renamed from: σ */
    public /* synthetic */ p000.C0455k3 f5516;

    /* JADX INFO: renamed from: τ */
    public final /* synthetic */ p000.kl1 f5517;

    public jl1(p000.kl1 r1, p000.InterfaceC0631op r2) {
            r0 = this;
            r0.f5517 = r1
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    /* JADX INFO: renamed from: μ */
    public static final void m2961(p000.kl1 r22, java.util.List r23, java.util.List r24, java.util.List r25, p000.c21 r26, p000.c21 r27, p000.c21 r28, p000.c21 r29) {
            r0 = r22
            r1 = r26
            r2 = r27
            r3 = r29
            java.lang.Object r4 = r0.f6003
            monitor-enter(r4)
            r23.clear()     // Catch: java.lang.Throwable -> L29
            r24.clear()     // Catch: java.lang.Throwable -> L29
            int r5 = r25.size()     // Catch: java.lang.Throwable -> L29
            r7 = 0
        L16:
            if (r7 >= r5) goto L2c
            r8 = r25
            java.lang.Object r9 = r8.get(r7)     // Catch: java.lang.Throwable -> L29
            zn r9 = (p000.C1064zn) r9     // Catch: java.lang.Throwable -> L29
            r9.m7182()     // Catch: java.lang.Throwable -> L29
            r0.m3316(r9)     // Catch: java.lang.Throwable -> L29
            int r7 = r7 + 1
            goto L16
        L29:
            r0 = move-exception
            goto L107
        L2c:
            r8 = r25
            r8.clear()     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r5 = r1.f1942     // Catch: java.lang.Throwable -> L29
            long[] r7 = r1.f1941     // Catch: java.lang.Throwable -> L29
            int r8 = r7.length     // Catch: java.lang.Throwable -> L29
            int r8 = r8 + (-2)
            r6 = 8
            r24 = 128(0x80, double:6.3E-322)
            if (r8 < 0) goto L7a
            r9 = 0
            r16 = 255(0xff, double:1.26E-321)
        L41:
            r11 = r7[r9]     // Catch: java.lang.Throwable -> L29
            r10 = 7
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = ~r11     // Catch: java.lang.Throwable -> L29
            long r13 = r13 << r10
            long r13 = r13 & r11
            long r13 = r13 & r18
            int r13 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r13 == 0) goto L75
            int r13 = r9 - r8
            int r13 = ~r13     // Catch: java.lang.Throwable -> L29
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = 0
        L5a:
            if (r14 >= r13) goto L73
            long r20 = r11 & r16
            int r15 = (r20 > r24 ? 1 : (r20 == r24 ? 0 : -1))
            if (r15 >= 0) goto L6f
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]     // Catch: java.lang.Throwable -> L29
            zn r15 = (p000.C1064zn) r15     // Catch: java.lang.Throwable -> L29
            r15.m7182()     // Catch: java.lang.Throwable -> L29
            r0.m3316(r15)     // Catch: java.lang.Throwable -> L29
        L6f:
            long r11 = r11 >> r6
            int r14 = r14 + 1
            goto L5a
        L73:
            if (r13 != r6) goto L82
        L75:
            if (r9 == r8) goto L82
            int r9 = r9 + 1
            goto L41
        L7a:
            r10 = 7
            r16 = 255(0xff, double:1.26E-321)
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L82:
            r1.m1108()     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r1 = r2.f1942     // Catch: java.lang.Throwable -> L29
            long[] r5 = r2.f1941     // Catch: java.lang.Throwable -> L29
            int r7 = r5.length     // Catch: java.lang.Throwable -> L29
            int r7 = r7 + (-2)
            if (r7 < 0) goto Lbf
            r8 = 0
        L8f:
            r11 = r5[r8]     // Catch: java.lang.Throwable -> L29
            long r13 = ~r11     // Catch: java.lang.Throwable -> L29
            long r13 = r13 << r10
            long r13 = r13 & r11
            long r13 = r13 & r18
            int r9 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r9 == 0) goto Lba
            int r9 = r8 - r7
            int r9 = ~r9     // Catch: java.lang.Throwable -> L29
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r13 = 0
        La2:
            if (r13 >= r9) goto Lb8
            long r14 = r11 & r16
            int r14 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1))
            if (r14 >= 0) goto Lb4
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r1[r14]     // Catch: java.lang.Throwable -> L29
            zn r14 = (p000.C1064zn) r14     // Catch: java.lang.Throwable -> L29
            r14.m7188()     // Catch: java.lang.Throwable -> L29
        Lb4:
            long r11 = r11 >> r6
            int r13 = r13 + 1
            goto La2
        Lb8:
            if (r9 != r6) goto Lbf
        Lba:
            if (r8 == r7) goto Lbf
            int r8 = r8 + 1
            goto L8f
        Lbf:
            r2.m1108()     // Catch: java.lang.Throwable -> L29
            r28.m1108()     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r1 = r3.f1942     // Catch: java.lang.Throwable -> L29
            long[] r2 = r3.f1941     // Catch: java.lang.Throwable -> L29
            int r5 = r2.length     // Catch: java.lang.Throwable -> L29
            int r5 = r5 + (-2)
            if (r5 < 0) goto L102
            r7 = 0
        Lcf:
            r8 = r2[r7]     // Catch: java.lang.Throwable -> L29
            long r11 = ~r8     // Catch: java.lang.Throwable -> L29
            long r11 = r11 << r10
            long r11 = r11 & r8
            long r11 = r11 & r18
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 == 0) goto Lfd
            int r11 = r7 - r5
            int r11 = ~r11     // Catch: java.lang.Throwable -> L29
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = 0
        Le2:
            if (r12 >= r11) goto Lfb
            long r13 = r8 & r16
            int r13 = (r13 > r24 ? 1 : (r13 == r24 ? 0 : -1))
            if (r13 >= 0) goto Lf7
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r1[r13]     // Catch: java.lang.Throwable -> L29
            zn r13 = (p000.C1064zn) r13     // Catch: java.lang.Throwable -> L29
            r13.m7182()     // Catch: java.lang.Throwable -> L29
            r0.m3316(r13)     // Catch: java.lang.Throwable -> L29
        Lf7:
            long r8 = r8 >> r6
            int r12 = r12 + 1
            goto Le2
        Lfb:
            if (r11 != r6) goto L102
        Lfd:
            if (r7 == r5) goto L102
            int r7 = r7 + 1
            goto Lcf
        L102:
            r3.m1108()     // Catch: java.lang.Throwable -> L29
            monitor-exit(r4)
            return
        L107:
            monitor-exit(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ν */
    public static final void m2962(java.util.List r5, p000.kl1 r6) {
            r5.clear()
            java.lang.Object r0 = r6.f6003
            monitor-enter(r0)
            java.util.ArrayList r1 = r6.f6011     // Catch: java.lang.Throwable -> L1b
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L1b
            r3 = 0
        Ld:
            if (r3 >= r2) goto L1d
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L1b
            f11 r4 = (p000.f11) r4     // Catch: java.lang.Throwable -> L1b
            r5.add(r4)     // Catch: java.lang.Throwable -> L1b
            int r3 = r3 + 1
            goto Ld
        L1b:
            r5 = move-exception
            goto L24
        L1d:
            java.util.ArrayList r5 = r6.f6011     // Catch: java.lang.Throwable -> L1b
            r5.clear()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return
        L24:
            monitor-exit(r0)
            throw r5
    }

    @Override // p000.f80
    /* JADX INFO: renamed from: α */
    public final java.lang.Object mo10(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            bq r1 = (p000.InterfaceC0086bq) r1
            k3 r2 = (p000.C0455k3) r2
            op r3 = (p000.InterfaceC0631op) r3
            jl1 r1 = new jl1
            kl1 r0 = r0.f5517
            r1.<init>(r0, r3)
            r1.f5516 = r2
            s62 r0 = p000.s62.f9751
            r1.mo11(r0)
            cq r0 = p000.EnumC0184cq.f2716
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r23) {
            r22 = this;
            r0 = r22
            cq r1 = p000.EnumC0184cq.f2716
            int r2 = r0.f5515
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            c21 r2 = r0.f5514
            java.util.Set r6 = r0.f5513
            java.util.Set r6 = (java.util.Set) r6
            c21 r7 = r0.f5512
            c21 r8 = r0.f5511
            c21 r9 = r0.f5510
            java.util.List r10 = r0.f5509
            java.util.List r11 = r0.f5508
            java.util.List r12 = r0.f5507
            k3 r13 = r0.f5516
            p000.i81.m2649(r23)
            r21 = r13
            r13 = r2
            r2 = r21
            goto L12c
        L2d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r0)
            return r3
        L33:
            c21 r2 = r0.f5514
            java.util.Set r6 = r0.f5513
            java.util.Set r6 = (java.util.Set) r6
            c21 r7 = r0.f5512
            c21 r8 = r0.f5511
            c21 r9 = r0.f5510
            java.util.List r10 = r0.f5509
            java.util.List r11 = r0.f5508
            java.util.List r12 = r0.f5507
            k3 r13 = r0.f5516
            p000.i81.m2649(r23)
            r14 = r9
            r9 = r2
            r2 = r13
            r13 = r10
            r10 = r12
            r12 = r14
        L50:
            r15 = r6
            r14 = r8
            r8 = r7
            goto Lf5
        L55:
            p000.i81.m2649(r23)
            k3 r2 = r0.f5516
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r9 = p000.uq1.f10933
            c21 r9 = new c21
            r9.<init>()
            c21 r10 = new c21
            r10.<init>()
            c21 r11 = new c21
            r11.<init>()
            vq1 r12 = new vq1
            r12.<init>(r11)
            c21 r13 = new c21
            r13.<init>()
            r21 = r12
            r12 = r6
            r6 = r21
            r21 = r11
            r11 = r7
            r7 = r21
            r21 = r10
            r10 = r8
            r8 = r21
        L93:
            kl1 r14 = r0.f5517
            java.lang.Object r14 = r14.f6003
            monitor-enter(r14)
            monitor-exit(r14)
            kl1 r14 = r0.f5517
            r0.f5516 = r2
            r0.f5507 = r12
            r0.f5508 = r11
            r0.f5509 = r10
            r0.f5510 = r9
            r0.f5511 = r8
            r0.f5512 = r7
            r15 = r6
            java.util.Set r15 = (java.util.Set) r15
            r0.f5513 = r15
            r0.f5514 = r13
            r0.f5515 = r5
            boolean r15 = r14.m3309()
            if (r15 != 0) goto Le9
            ae r15 = new ae
            op r3 = p000.AbstractC0978xb.m6563(r0)
            r15.<init>(r5, r3)
            r15.m87()
            java.lang.Object r3 = r14.f6003
            monitor-enter(r3)
            boolean r16 = r14.m3309()     // Catch: java.lang.Throwable -> Le6
            if (r16 == 0) goto Lcf
            r14 = r15
            goto Ld2
        Lcf:
            r14.f6018 = r15     // Catch: java.lang.Throwable -> Le6
            r14 = 0
        Ld2:
            monitor-exit(r3)
            if (r14 == 0) goto Lda
            s62 r3 = p000.s62.f9751
            r14.mo75(r3)
        Lda:
            java.lang.Object r3 = r15.m86()
            cq r14 = p000.EnumC0184cq.f2716
            if (r3 != r14) goto Le3
            goto Leb
        Le3:
            s62 r3 = p000.s62.f9751
            goto Leb
        Le6:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        Le9:
            s62 r3 = p000.s62.f9751
        Leb:
            if (r3 != r1) goto Lee
            goto L123
        Lee:
            r14 = r12
            r12 = r9
            r9 = r13
            r13 = r10
            r10 = r14
            goto L50
        Lf5:
            kl1 r3 = r0.f5517
            f02 r6 = p000.kl1.f5999
            boolean r3 = r3.m3315()
            if (r3 == 0) goto L1d9
            kl1 r7 = r0.f5517
            il1 r6 = new il1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.f5516 = r2
            r0.f5507 = r10
            r0.f5508 = r11
            r0.f5509 = r13
            r0.f5510 = r12
            r0.f5511 = r14
            r0.f5512 = r8
            r3 = r15
            java.util.Set r3 = (java.util.Set) r3
            r0.f5513 = r3
            r0.f5514 = r9
            r0.f5515 = r4
            java.lang.Object r3 = r2.m3139(r6, r0)
            if (r3 != r1) goto L124
        L123:
            return r1
        L124:
            r6 = r13
            r13 = r9
            r9 = r12
            r12 = r10
            r10 = r6
            r7 = r8
            r8 = r14
            r6 = r15
        L12c:
            kl1 r3 = r0.f5517
            java.lang.Object r14 = r3.f6003
            monitor-enter(r14)
            b21 r15 = r3.f6012     // Catch: java.lang.Throwable -> L18a
            boolean r15 = r15.m698()     // Catch: java.lang.Throwable -> L18a
            if (r15 == 0) goto L194
            b21 r15 = r3.f6012     // Catch: java.lang.Throwable -> L18a
            v11 r15 = p000.i11.m2582(r15)     // Catch: java.lang.Throwable -> L18a
            b21 r5 = r3.f6012     // Catch: java.lang.Throwable -> L18a
            r5.m689()     // Catch: java.lang.Throwable -> L18a
            n5 r5 = r3.f6013     // Catch: java.lang.Throwable -> L18a
            java.lang.Object r4 = r5.f7387     // Catch: java.lang.Throwable -> L18a
            b21 r4 = (p000.b21) r4     // Catch: java.lang.Throwable -> L18a
            r4.m689()     // Catch: java.lang.Throwable -> L18a
            java.lang.Object r4 = r5.f7388     // Catch: java.lang.Throwable -> L18a
            b21 r4 = (p000.b21) r4     // Catch: java.lang.Throwable -> L18a
            r4.m689()     // Catch: java.lang.Throwable -> L18a
            b21 r4 = r3.f6015     // Catch: java.lang.Throwable -> L18a
            r4.m689()     // Catch: java.lang.Throwable -> L18a
            v11 r4 = new v11     // Catch: java.lang.Throwable -> L18a
            int r5 = r15.f11065     // Catch: java.lang.Throwable -> L18a
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L18a
            java.lang.Object[] r5 = r15.f11064     // Catch: java.lang.Throwable -> L18a
            int r15 = r15.f11065     // Catch: java.lang.Throwable -> L18a
            r17 = r1
            r1 = 0
        L167:
            if (r1 >= r15) goto L18c
            r18 = r5[r1]     // Catch: java.lang.Throwable -> L18a
            r19 = r1
            r1 = r18
            f11 r1 = (p000.f11) r1     // Catch: java.lang.Throwable -> L18a
            r18 = r2
            b21 r2 = r3.f6014     // Catch: java.lang.Throwable -> L18a
            java.lang.Object r2 = r2.m695(r1)     // Catch: java.lang.Throwable -> L18a
            r20 = r5
            l91 r5 = new l91     // Catch: java.lang.Throwable -> L18a
            r5.<init>(r1, r2)     // Catch: java.lang.Throwable -> L18a
            r4.m6015(r5)     // Catch: java.lang.Throwable -> L18a
            int r1 = r19 + 1
            r2 = r18
            r5 = r20
            goto L167
        L18a:
            r0 = move-exception
            goto L1d7
        L18c:
            r18 = r2
            b21 r1 = r3.f6014     // Catch: java.lang.Throwable -> L18a
            r1.m689()     // Catch: java.lang.Throwable -> L18a
            goto L19d
        L194:
            r17 = r1
            r18 = r2
            v11 r4 = p000.a41.f65     // Catch: java.lang.Throwable -> L18a
            r4.getClass()     // Catch: java.lang.Throwable -> L18a
        L19d:
            monitor-exit(r14)
            java.lang.Object[] r1 = r4.f11064
            int r2 = r4.f11065
            r3 = 0
        L1a3:
            if (r3 >= r2) goto L1b4
            r4 = r1[r3]
            l91 r4 = (p000.l91) r4
            java.lang.Object r5 = r4.f6502
            f11 r5 = (p000.f11) r5
            java.lang.Object r4 = r4.f6503
            e11 r4 = (p000.e11) r4
            int r3 = r3 + 1
            goto L1a3
        L1b4:
            kl1 r1 = r0.f5517
            m6 r1 = r1.f6002
            java.lang.Object r2 = r1.f6967
            j7 r2 = (p000.C0421j7) r2
            r3 = 0
            r2.set(r3)
            java.lang.Object r1 = r1.f6968
            b8 r1 = (p000.C0068b8) r1
            sv0 r2 = new sv0
            r3 = 10
            r2.<init>(r3)
            r1.m811(r2)
            r1 = r17
            r2 = r18
            r3 = 0
            r4 = 2
            r5 = 1
            goto L93
        L1d7:
            monitor-exit(r14)
            throw r0
        L1d9:
            r3 = r13
            r13 = r9
            r9 = r12
            r12 = r10
            r10 = r3
            r7 = r8
            r8 = r14
            r6 = r15
            r3 = 0
            goto L93
    }
}
