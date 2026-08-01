package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class kx1 {

    /* JADX INFO: renamed from: α */
    public final p000.C0061b1 f6298;

    /* JADX INFO: renamed from: β */
    public final java.util.concurrent.atomic.AtomicReference f6299;

    /* JADX INFO: renamed from: γ */
    public boolean f6300;

    /* JADX INFO: renamed from: δ */
    public final p000.C0108cc f6301;

    /* JADX INFO: renamed from: ε */
    public final p000.cl1 f6302;

    /* JADX INFO: renamed from: ζ */
    public final p000.k21 f6303;

    /* JADX INFO: renamed from: η */
    public final java.lang.Object f6304;

    /* JADX INFO: renamed from: θ */
    public p000.hi0 f6305;

    /* JADX INFO: renamed from: ι */
    public p000.jx1 f6306;

    /* JADX INFO: renamed from: κ */
    public long f6307;

    public kx1(p000.C0061b1 r3) {
            r2 = this;
            r2.<init>()
            r2.f6298 = r3
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r0 = 0
            r3.<init>(r0)
            r2.f6299 = r3
            cc r3 = new cc
            r0 = 10
            r3.<init>(r0, r2)
            r2.f6301 = r3
            cl1 r3 = new cl1
            r0 = 7
            r3.<init>(r0, r2)
            r2.f6302 = r3
            k21 r3 = new k21
            r0 = 16
            jx1[] r0 = new p000.jx1[r0]
            r3.<init>(r0)
            r2.f6303 = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.f6304 = r3
            r0 = -1
            r2.f6307 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final boolean m3424() {
            r10 = this;
            java.lang.Object r0 = r10.f6304
            monitor-enter(r0)
            boolean r1 = r10.f6300     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)
            r0 = 0
            if (r1 == 0) goto La
            return r0
        La:
            r1 = r0
        Lb:
            java.util.concurrent.atomic.AtomicReference r2 = r10.f6299
        Ld:
            java.lang.Object r3 = r2.get()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L16
            goto L4d
        L16:
            boolean r6 = r3 instanceof java.util.Set
            if (r6 == 0) goto L1e
            r6 = r3
            java.util.Set r6 = (java.util.Set) r6
            goto L46
        L1e:
            boolean r6 = r3 instanceof java.util.List
            if (r6 == 0) goto L7c
            r6 = r3
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r6.get(r0)
            java.util.Set r7 = (java.util.Set) r7
            int r8 = r6.size()
            r9 = 2
            if (r8 != r9) goto L37
            java.lang.Object r4 = r6.get(r5)
            goto L45
        L37:
            int r8 = r6.size()
            if (r8 <= r9) goto L45
            int r4 = r6.size()
            java.util.List r4 = r6.subList(r5, r4)
        L45:
            r6 = r7
        L46:
            boolean r7 = r2.compareAndSet(r3, r4)
            if (r7 == 0) goto L75
            r4 = r6
        L4d:
            if (r4 != 0) goto L50
            return r1
        L50:
            java.lang.Object r2 = r10.f6304
            monitor-enter(r2)
            k21 r3 = r10.f6303     // Catch: java.lang.Throwable -> L6f
            java.lang.Object[] r6 = r3.f5716     // Catch: java.lang.Throwable -> L6f
            int r3 = r3.f5718     // Catch: java.lang.Throwable -> L6f
            r7 = r0
        L5a:
            if (r7 >= r3) goto L71
            r8 = r6[r7]     // Catch: java.lang.Throwable -> L6f
            jx1 r8 = (p000.jx1) r8     // Catch: java.lang.Throwable -> L6f
            boolean r8 = r8.m3067(r4)     // Catch: java.lang.Throwable -> L6f
            if (r8 != 0) goto L6b
            if (r1 == 0) goto L69
            goto L6b
        L69:
            r1 = r0
            goto L6c
        L6b:
            r1 = r5
        L6c:
            int r7 = r7 + 1
            goto L5a
        L6f:
            r10 = move-exception
            goto L73
        L71:
            monitor-exit(r2)
            goto Lb
        L73:
            monitor-exit(r2)
            throw r10
        L75:
            java.lang.Object r7 = r2.get()
            if (r7 == r3) goto L46
            goto Ld
        L7c:
            java.lang.String r10 = "Unexpected notification"
            p000.AbstractC0804sn.m5527(r10)
            pm r10 = new pm
            r10.<init>()
            throw r10
        L87:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
    }

    /* JADX INFO: renamed from: β */
    public final void m3425(java.lang.Object r27, p000.a80 r28, p000.p70 r29) {
            r26 = this;
            r1 = r26
            r0 = r27
            r2 = r28
            long r3 = p000.i91.m2680()
            java.lang.Object r5 = r1.f6304
            monitor-enter(r5)
            k21 r6 = r1.f6303     // Catch: java.lang.Throwable -> L22b
            java.lang.Object[] r7 = r6.f5716     // Catch: java.lang.Throwable -> L22b
            int r8 = r6.f5718     // Catch: java.lang.Throwable -> L22b
            r10 = 0
        L14:
            if (r10 >= r8) goto L23
            r12 = r7[r10]     // Catch: java.lang.Throwable -> L22b
            r13 = r12
            jx1 r13 = (p000.jx1) r13     // Catch: java.lang.Throwable -> L22b
            a80 r13 = r13.f5635     // Catch: java.lang.Throwable -> L22b
            if (r13 != r2) goto L20
            goto L24
        L20:
            int r10 = r10 + 1
            goto L14
        L23:
            r12 = 0
        L24:
            jx1 r12 = (p000.jx1) r12     // Catch: java.lang.Throwable -> L22b
            r7 = 1
            if (r12 != 0) goto L37
            jx1 r12 = new jx1     // Catch: java.lang.Throwable -> L22b
            r2.getClass()     // Catch: java.lang.Throwable -> L22b
            p000.h62.m2394(r7, r2)     // Catch: java.lang.Throwable -> L22b
            r12.<init>(r2)     // Catch: java.lang.Throwable -> L22b
            r6.m3127(r12)     // Catch: java.lang.Throwable -> L22b
        L37:
            jx1 r2 = r1.f6306     // Catch: java.lang.Throwable -> L22b
            long r13 = r1.f6307     // Catch: java.lang.Throwable -> L22b
            monitor-exit(r5)
            r5 = -1
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 == 0) goto L75
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 != 0) goto L47
            goto L75
        L47:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Detected multithreaded access to SnapshotStateObserver: previousThreadId="
            r5.<init>(r6)
            r5.append(r13)
            java.lang.String r6 = "), currentThread={id="
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = ", name="
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            p000.pi1.m4544(r5)
        L75:
            java.lang.Object r5 = r1.f6304     // Catch: java.lang.Throwable -> La5
            monitor-enter(r5)     // Catch: java.lang.Throwable -> La5
            r1.f6306 = r12     // Catch: java.lang.Throwable -> L21b
            r1.f6307 = r3     // Catch: java.lang.Throwable -> L21b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La5
            cl1 r3 = r1.f6302     // Catch: java.lang.Throwable -> La5
            java.lang.Object r4 = r12.f5636     // Catch: java.lang.Throwable -> La5
            u11 r5 = r12.f5637     // Catch: java.lang.Throwable -> La5
            int r6 = r12.f5638     // Catch: java.lang.Throwable -> La5
            r12.f5636 = r0     // Catch: java.lang.Throwable -> La5
            b21 r8 = r12.f5640     // Catch: java.lang.Throwable -> La5
            java.lang.Object r0 = r8.m695(r0)     // Catch: java.lang.Throwable -> La5
            u11 r0 = (p000.u11) r0     // Catch: java.lang.Throwable -> La5
            r12.f5637 = r0     // Catch: java.lang.Throwable -> La5
            int r0 = r12.f5638     // Catch: java.lang.Throwable -> La5
            r8 = -1
            if (r0 != r8) goto La9
            tw1 r0 = p000.ax1.m628()     // Catch: java.lang.Throwable -> La5
            long r15 = r0.mo5759()     // Catch: java.lang.Throwable -> La5
            int r0 = java.lang.Long.hashCode(r15)     // Catch: java.lang.Throwable -> La5
            r12.f5638 = r0     // Catch: java.lang.Throwable -> La5
            goto La9
        La5:
            r0 = move-exception
            r6 = r13
            goto L21f
        La9:
            u80 r0 = r12.f5643     // Catch: java.lang.Throwable -> La5
            k21 r8 = p000.j81.m2912()     // Catch: java.lang.Throwable -> La5
            r8.m3127(r0)     // Catch: java.lang.Throwable -> Lbb
            if (r3 != 0) goto Lc1
            r29.invoke()     // Catch: java.lang.Throwable -> Lbb
            r28 = r12
            goto L143
        Lbb:
            r0 = move-exception
            r18 = r7
            r6 = r13
            goto L211
        Lc1:
            m6 r0 = p000.ax1.f1361     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r0 = r0.m3786()     // Catch: java.lang.Throwable -> Lbb
            r10 = r0
            tw1 r10 = (p000.tw1) r10     // Catch: java.lang.Throwable -> Lbb
            boolean r0 = r10 instanceof p000.u52     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto L10d
            r0 = r10
            u52 r0 = (p000.u52) r0     // Catch: java.lang.Throwable -> Lbb
            r28 = r12
            long r11 = r0.f10604     // Catch: java.lang.Throwable -> Lbb
            long r16 = p000.i91.m2680()     // Catch: java.lang.Throwable -> Lbb
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 != 0) goto L10f
            r0 = r10
            u52 r0 = (p000.u52) r0     // Catch: java.lang.Throwable -> Lbb
            a80 r11 = r0.f10602     // Catch: java.lang.Throwable -> Lbb
            r0 = r10
            u52 r0 = (p000.u52) r0     // Catch: java.lang.Throwable -> Lbb
            a80 r12 = r0.f10603     // Catch: java.lang.Throwable -> Lbb
            r0 = r10
            u52 r0 = (p000.u52) r0     // Catch: java.lang.Throwable -> L102
            a80 r3 = p000.ax1.m629(r3, r11, r7)     // Catch: java.lang.Throwable -> L102
            r0.f10602 = r3     // Catch: java.lang.Throwable -> L102
            r0 = r10
            u52 r0 = (p000.u52) r0     // Catch: java.lang.Throwable -> L102
            r0.f10603 = r12     // Catch: java.lang.Throwable -> L102
            r29.invoke()     // Catch: java.lang.Throwable -> L102
            r0 = r10
            u52 r0 = (p000.u52) r0     // Catch: java.lang.Throwable -> Lbb
            r0.f10602 = r11     // Catch: java.lang.Throwable -> Lbb
            u52 r10 = (p000.u52) r10     // Catch: java.lang.Throwable -> Lbb
            r10.f10603 = r12     // Catch: java.lang.Throwable -> Lbb
            goto L143
        L102:
            r0 = move-exception
            r3 = r10
            u52 r3 = (p000.u52) r3     // Catch: java.lang.Throwable -> Lbb
            r3.f10602 = r11     // Catch: java.lang.Throwable -> Lbb
            u52 r10 = (p000.u52) r10     // Catch: java.lang.Throwable -> Lbb
            r10.f10603 = r12     // Catch: java.lang.Throwable -> Lbb
            throw r0     // Catch: java.lang.Throwable -> Lbb
        L10d:
            r28 = r12
        L10f:
            if (r10 == 0) goto L115
            boolean r0 = r10 instanceof p000.f21     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto L117
        L115:
            r0 = 0
            goto L11d
        L117:
            tw1 r0 = r10.mo2011(r3)     // Catch: java.lang.Throwable -> Lbb
            r15 = r0
            goto L136
        L11d:
            u52 r15 = new u52     // Catch: java.lang.Throwable -> Lbb
            boolean r11 = r10 instanceof p000.f21     // Catch: java.lang.Throwable -> Lbb
            if (r11 == 0) goto L129
            r11 = r10
            f21 r11 = (p000.f21) r11     // Catch: java.lang.Throwable -> Lbb
            r16 = r11
            goto L12b
        L129:
            r16 = r0
        L12b:
            r19 = 1
            r20 = 0
            r18 = 0
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> Lbb
        L136:
            tw1 r3 = r15.m5760()     // Catch: java.lang.Throwable -> L1fe
            r29.invoke()     // Catch: java.lang.Throwable -> L203
            p000.tw1.m5756(r3)     // Catch: java.lang.Throwable -> L1fe
            r15.mo2000()     // Catch: java.lang.Throwable -> Lbb
        L143:
            int r0 = r8.f5718     // Catch: java.lang.Throwable -> La5
            int r0 = r0 - r7
            r8.m3136(r0)     // Catch: java.lang.Throwable -> La5
            r12 = r28
            java.lang.Object r0 = r12.f5636     // Catch: java.lang.Throwable -> La5
            r0.getClass()     // Catch: java.lang.Throwable -> La5
            int r3 = r12.f5638     // Catch: java.lang.Throwable -> La5
            u11 r8 = r12.f5637     // Catch: java.lang.Throwable -> La5
            if (r8 == 0) goto L1df
            long[] r10 = r8.f10555     // Catch: java.lang.Throwable -> L1e2
            int r11 = r10.length     // Catch: java.lang.Throwable -> L1e2
            int r11 = r11 + (-2)
            if (r11 < 0) goto L1df
            r17 = r10
            r15 = 0
        L160:
            r9 = r17[r15]     // Catch: java.lang.Throwable -> L1e2
            r18 = r7
            r19 = r8
            long r7 = ~r9     // Catch: java.lang.Throwable -> L1e2
            r20 = 7
            long r7 = r7 << r20
            long r7 = r7 & r9
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r20
            int r7 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r7 == 0) goto L1d1
            int r7 = r15 - r11
            int r7 = ~r7     // Catch: java.lang.Throwable -> L1e2
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r27 = r8
            r8 = 0
        L183:
            if (r8 >= r7) goto L1c8
            r20 = 255(0xff, double:1.26E-321)
            long r20 = r9 & r20
            r22 = 128(0x80, double:6.3E-322)
            int r20 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r20 >= 0) goto L1b4
            int r20 = r15 << 3
            r21 = r8
            int r8 = r20 + r21
            r28 = r9
            r9 = r19
            java.lang.Object[] r10 = r9.f10556     // Catch: java.lang.Throwable -> L1e2
            r10 = r10[r8]     // Catch: java.lang.Throwable -> L1e2
            r19 = r13
            int[] r13 = r9.f10557     // Catch: java.lang.Throwable -> L1fa
            r13 = r13[r8]     // Catch: java.lang.Throwable -> L1fa
            if (r13 == r3) goto L1a8
            r13 = r18
            goto L1a9
        L1a8:
            r13 = 0
        L1a9:
            if (r13 == 0) goto L1ae
            r12.m3069(r0, r10)     // Catch: java.lang.Throwable -> L1fa
        L1ae:
            if (r13 == 0) goto L1bc
            r9.m5778(r8)     // Catch: java.lang.Throwable -> L1fa
            goto L1bc
        L1b4:
            r21 = r8
            r28 = r9
            r9 = r19
            r19 = r13
        L1bc:
            long r13 = r28 >> r27
            int r8 = r21 + 1
            r24 = r19
            r19 = r9
            r9 = r13
            r13 = r24
            goto L183
        L1c8:
            r8 = r27
            r9 = r19
            r19 = r13
            if (r7 != r8) goto L1e6
            goto L1d5
        L1d1:
            r9 = r19
            r19 = r13
        L1d5:
            if (r15 == r11) goto L1e6
            int r15 = r15 + 1
            r8 = r9
            r7 = r18
            r13 = r19
            goto L160
        L1df:
            r19 = r13
            goto L1e6
        L1e2:
            r0 = move-exception
            r19 = r13
            goto L1fb
        L1e6:
            r12.f5636 = r4     // Catch: java.lang.Throwable -> L1fa
            r12.f5637 = r5     // Catch: java.lang.Throwable -> L1fa
            r12.f5638 = r6     // Catch: java.lang.Throwable -> L1fa
            java.lang.Object r3 = r1.f6304
            monitor-enter(r3)
            r1.f6306 = r2     // Catch: java.lang.Throwable -> L1f7
            r6 = r19
            r1.f6307 = r6     // Catch: java.lang.Throwable -> L1f7
            monitor-exit(r3)
            return
        L1f7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L1fa:
            r0 = move-exception
        L1fb:
            r6 = r19
            goto L21f
        L1fe:
            r0 = move-exception
            r18 = r7
            r6 = r13
            goto L20c
        L203:
            r0 = move-exception
            r18 = r7
            r6 = r13
            p000.tw1.m5756(r3)     // Catch: java.lang.Throwable -> L20b
            throw r0     // Catch: java.lang.Throwable -> L20b
        L20b:
            r0 = move-exception
        L20c:
            r15.mo2000()     // Catch: java.lang.Throwable -> L210
            throw r0     // Catch: java.lang.Throwable -> L210
        L210:
            r0 = move-exception
        L211:
            int r3 = r8.f5718     // Catch: java.lang.Throwable -> L219
            int r3 = r3 + (-1)
            r8.m3136(r3)     // Catch: java.lang.Throwable -> L219
            throw r0     // Catch: java.lang.Throwable -> L219
        L219:
            r0 = move-exception
            goto L21f
        L21b:
            r0 = move-exception
            r6 = r13
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L219
            throw r0     // Catch: java.lang.Throwable -> L219
        L21f:
            java.lang.Object r3 = r1.f6304
            monitor-enter(r3)
            r1.f6306 = r2     // Catch: java.lang.Throwable -> L228
            r1.f6307 = r6     // Catch: java.lang.Throwable -> L228
            monitor-exit(r3)
            throw r0
        L228:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L22b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }
}
