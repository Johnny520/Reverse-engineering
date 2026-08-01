package p000;

/* JADX INFO: renamed from: es */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0259es extends p000.k02 {

    /* JADX INFO: renamed from: θ */
    public static final java.lang.Object f3651 = null;

    /* JADX INFO: renamed from: γ */
    public long f3652;

    /* JADX INFO: renamed from: δ */
    public int f3653;

    /* JADX INFO: renamed from: ε */
    public p000.u11 f3654;

    /* JADX INFO: renamed from: ζ */
    public java.lang.Object f3655;

    /* JADX INFO: renamed from: η */
    public int f3656;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.C0259es.f3651 = r0
            return
    }

    public C0259es(long r1) {
            r0 = this;
            r0.<init>(r1)
            u11 r1 = p000.z31.f12956
            r1.getClass()
            r0.f3654 = r1
            java.lang.Object r1 = p000.C0259es.f3651
            r0.f3655 = r1
            return
    }

    @Override // p000.k02
    /* JADX INFO: renamed from: α */
    public final void mo1083(p000.k02 r2) {
            r1 = this;
            r2.getClass()
            es r2 = (p000.C0259es) r2
            u11 r0 = r2.f3654
            r1.f3654 = r0
            java.lang.Object r0 = r2.f3655
            r1.f3655 = r0
            int r2 = r2.f3656
            r1.f3656 = r2
            return
    }

    @Override // p000.k02
    /* JADX INFO: renamed from: β */
    public final p000.k02 mo1084(long r1) {
            r0 = this;
            es r0 = new es
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final boolean m1951(p000.C0296fs r7, p000.tw1 r8) {
            r6 = this;
            java.lang.Object r0 = p000.ax1.f1362
            monitor-enter(r0)
            long r1 = r6.f3652     // Catch: java.lang.Throwable -> L1a
            long r3 = r8.mo5759()     // Catch: java.lang.Throwable -> L1a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1c
            int r1 = r6.f3653     // Catch: java.lang.Throwable -> L1a
            int r4 = r8.mo2003()     // Catch: java.lang.Throwable -> L1a
            if (r1 == r4) goto L18
            goto L1c
        L18:
            r1 = r3
            goto L1d
        L1a:
            r6 = move-exception
            goto L47
        L1c:
            r1 = r2
        L1d:
            monitor-exit(r0)
            java.lang.Object r4 = r6.f3655
            java.lang.Object r5 = p000.C0259es.f3651
            if (r4 == r5) goto L2f
            if (r1 == 0) goto L30
            int r4 = r6.f3656
            int r7 = r6.m1952(r7, r8)
            if (r4 != r7) goto L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r2 == 0) goto L46
            if (r1 == 0) goto L46
            monitor-enter(r0)
            long r3 = r8.mo5759()     // Catch: java.lang.Throwable -> L43
            r6.f3652 = r3     // Catch: java.lang.Throwable -> L43
            int r7 = r8.mo2003()     // Catch: java.lang.Throwable -> L43
            r6.f3653 = r7     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return r2
        L43:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L46:
            return r2
        L47:
            monitor-exit(r0)
            throw r6
    }

    /* JADX INFO: renamed from: δ */
    public final int m1952(p000.C0296fs r31, p000.tw1 r32) {
            r30 = this;
            r0 = r32
            java.lang.Object r1 = p000.ax1.f1362
            monitor-enter(r1)
            r2 = r30
            u11 r2 = r2.f3654     // Catch: java.lang.Throwable -> L16c
            monitor-exit(r1)
            int r1 = r2.f10559
            r3 = 7
            if (r1 == 0) goto L169
            k21 r1 = p000.j81.m2912()
            java.lang.Object[] r4 = r1.f5716
            int r5 = r1.f5718
            r6 = 0
            r7 = r6
        L19:
            if (r7 >= r5) goto L25
            r8 = r4[r7]
            u80 r8 = (p000.u80) r8
            r8.m5801()
            int r7 = r7 + 1
            goto L19
        L25:
            java.lang.Object[] r4 = r2.f10556     // Catch: java.lang.Throwable -> Lcc
            int[] r5 = r2.f10557     // Catch: java.lang.Throwable -> Lcc
            long[] r2 = r2.f10555     // Catch: java.lang.Throwable -> Lcc
            int r7 = r2.length     // Catch: java.lang.Throwable -> Lcc
            int r7 = r7 + (-2)
            if (r7 < 0) goto L142
            r9 = r3
            r8 = r6
        L32:
            r10 = r2[r8]     // Catch: java.lang.Throwable -> Lcc
            long r12 = ~r10     // Catch: java.lang.Throwable -> Lcc
            long r12 = r12 << r3
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L12d
            int r12 = r8 - r7
            int r12 = ~r12     // Catch: java.lang.Throwable -> Lcc
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r30 = r3
            r3 = r6
        L4d:
            if (r3 >= r12) goto L125
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r10 & r16
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L10b
            int r18 = r8 << 3
            int r18 = r18 + r3
            r19 = r4[r18]     // Catch: java.lang.Throwable -> Lcc
            r22 = r14
            r14 = r5[r18]     // Catch: java.lang.Throwable -> Lcc
            r15 = r19
            i02 r15 = (p000.i02) r15     // Catch: java.lang.Throwable -> Lcc
            r31 = r13
            r13 = 1
            if (r14 == r13) goto L76
            r19 = r2
            r25 = r3
            r24 = r4
            r26 = r10
            goto L108
        L76:
            boolean r13 = r15 instanceof p000.C0296fs     // Catch: java.lang.Throwable -> Lcc
            if (r13 == 0) goto Le8
            fs r15 = (p000.C0296fs) r15     // Catch: java.lang.Throwable -> Lcc
            es r13 = r15.f4081     // Catch: java.lang.Throwable -> Lcc
            k02 r13 = p000.ax1.m627(r13, r0)     // Catch: java.lang.Throwable -> Lcc
            es r13 = (p000.C0259es) r13     // Catch: java.lang.Throwable -> Lcc
            p70 r14 = r15.f4080     // Catch: java.lang.Throwable -> Lcc
            es r13 = r15.m2202(r13, r0, r6, r14)     // Catch: java.lang.Throwable -> Lcc
            u11 r14 = r13.f3654     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object[] r15 = r14.f10556     // Catch: java.lang.Throwable -> Lcc
            long[] r14 = r14.f10555     // Catch: java.lang.Throwable -> Lcc
            int r6 = r14.length     // Catch: java.lang.Throwable -> Lcc
            int r6 = r6 + (-2)
            r19 = r2
            r25 = r3
            r24 = r4
            if (r6 < 0) goto Le5
            r2 = 0
        L9c:
            r3 = r14[r2]     // Catch: java.lang.Throwable -> Lcc
            r26 = r10
            r11 = r9
            long r9 = ~r3     // Catch: java.lang.Throwable -> Lcc
            long r9 = r9 << r30
            long r9 = r9 & r3
            long r9 = r9 & r22
            int r9 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r9 == 0) goto Ld8
            int r9 = r2 - r6
            int r9 = ~r9     // Catch: java.lang.Throwable -> Lcc
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = 0
        Lb3:
            if (r10 >= r9) goto Ld4
            long r28 = r3 & r16
            int r28 = (r28 > r20 ? 1 : (r28 == r20 ? 0 : -1))
            if (r28 >= 0) goto Lcf
            int r28 = r2 << 3
            int r28 = r28 + r10
            r28 = r15[r28]     // Catch: java.lang.Throwable -> Lcc
            i02 r28 = (p000.i02) r28     // Catch: java.lang.Throwable -> Lcc
            int r11 = r11 * 31
            int r28 = java.lang.System.identityHashCode(r28)     // Catch: java.lang.Throwable -> Lcc
            int r11 = r11 + r28
            goto Lcf
        Lcc:
            r0 = move-exception
            goto L157
        Lcf:
            long r3 = r3 >> r31
            int r10 = r10 + 1
            goto Lb3
        Ld4:
            r3 = r31
            if (r9 != r3) goto Lda
        Ld8:
            r9 = r11
            goto Ldc
        Lda:
            r9 = r11
            goto Lf8
        Ldc:
            if (r2 == r6) goto Lf8
            int r2 = r2 + 1
            r10 = r26
            r31 = 8
            goto L9c
        Le5:
            r26 = r10
            goto Lf8
        Le8:
            r19 = r2
            r25 = r3
            r24 = r4
            r26 = r10
            k02 r2 = r15.mo2200()     // Catch: java.lang.Throwable -> Lcc
            k02 r13 = p000.ax1.m627(r2, r0)     // Catch: java.lang.Throwable -> Lcc
        Lf8:
            int r9 = r9 * 31
            int r2 = java.lang.System.identityHashCode(r13)     // Catch: java.lang.Throwable -> Lcc
            int r9 = r9 + r2
            int r9 = r9 * 31
            long r2 = r13.f5697     // Catch: java.lang.Throwable -> Lcc
            int r2 = java.lang.Long.hashCode(r2)     // Catch: java.lang.Throwable -> Lcc
            int r9 = r9 + r2
        L108:
            r3 = 8
            goto L116
        L10b:
            r19 = r2
            r25 = r3
            r24 = r4
            r26 = r10
            r22 = r14
            r3 = r13
        L116:
            long r10 = r26 >> r3
            int r2 = r25 + 1
            r13 = r3
            r14 = r22
            r4 = r24
            r6 = 0
            r3 = r2
            r2 = r19
            goto L4d
        L125:
            r19 = r2
            r24 = r4
            r3 = r13
            if (r12 != r3) goto L145
            goto L133
        L12d:
            r19 = r2
            r30 = r3
            r24 = r4
        L133:
            if (r8 == r7) goto L140
            int r8 = r8 + 1
            r3 = r30
            r2 = r19
            r4 = r24
            r6 = 0
            goto L32
        L140:
            r3 = r9
            goto L144
        L142:
            r30 = r3
        L144:
            r9 = r3
        L145:
            java.lang.Object[] r0 = r1.f5716
            int r1 = r1.f5718
            r6 = 0
        L14a:
            if (r6 >= r1) goto L156
            r2 = r0[r6]
            u80 r2 = (p000.u80) r2
            r2.m5800()
            int r6 = r6 + 1
            goto L14a
        L156:
            return r9
        L157:
            java.lang.Object[] r2 = r1.f5716
            int r1 = r1.f5718
            r6 = 0
        L15c:
            if (r6 >= r1) goto L168
            r3 = r2[r6]
            u80 r3 = (p000.u80) r3
            r3.m5800()
            int r6 = r6 + 1
            goto L15c
        L168:
            throw r0
        L169:
            r30 = r3
            return r30
        L16c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
