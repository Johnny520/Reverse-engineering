package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ea.c f22163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.w f22164b;

    public y1() {
            r1 = this;
            r1.<init>()
            ea.c r0 = new ea.c
            r0.<init>()
            r1.f22163a = r0
            f.w r0 = f.l.f2854a
            f.w r0 = new f.w
            r0.<init>()
            r1.f22164b = r0
            return
    }

    public final void a() {
            r18 = this;
            r1 = r18
            ea.c r0 = r1.f22163a
            r2 = 1
            if (r0 == 0) goto L66
            boolean r3 = r0.f2484c
            if (r3 == 0) goto Lc
            goto L66
        Lc:
            r0.f2484c = r2
            java.lang.Object r3 = r0.f2482a
            l3.w r3 = (l3.w) r3
            monitor-enter(r3)
            java.lang.Object r4 = r0.f2485d     // Catch: java.lang.Throwable -> L38
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4     // Catch: java.lang.Throwable -> L38
            java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L38
        L1f:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L3a
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L38
            java.lang.AutoCloseable r5 = (java.lang.AutoCloseable) r5     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L1f
            p.a.t(r5)     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L38
            goto L1f
        L31:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L38
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L38
            throw r2     // Catch: java.lang.Throwable -> L38
        L38:
            r0 = move-exception
            goto L64
        L3a:
            java.lang.Object r4 = r0.f2483b     // Catch: java.lang.Throwable -> L38
            java.util.LinkedHashSet r4 = (java.util.LinkedHashSet) r4     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L38
        L42:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L5b
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L38
            java.lang.AutoCloseable r5 = (java.lang.AutoCloseable) r5     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L42
            p.a.t(r5)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L54
            goto L42
        L54:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L38
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L38
            throw r2     // Catch: java.lang.Throwable -> L38
        L5b:
            java.lang.Object r0 = r0.f2483b     // Catch: java.lang.Throwable -> L38
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0     // Catch: java.lang.Throwable -> L38
            r0.clear()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            goto L66
        L64:
            monitor-exit(r3)
            throw r0
        L66:
            f.w r0 = r1.f22164b
            int[] r3 = r0.f2844b
            java.lang.Object[] r4 = r0.f2845c
            long[] r0 = r0.f2843a
            int r5 = r0.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto Le3
            r7 = 0
        L74:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto Ldd
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L8e:
            if (r12 >= r10) goto Ld8
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto Lce
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            f.f0 r13 = (f.f0) r13
            java.lang.Object[] r14 = r13.f2803a
            int r13 = r13.f2804b
            r15 = 0
        La7:
            if (r15 >= r13) goto Lce
            r16 = r14[r15]
            r17 = r11
            r11 = r16
            y1.x1 r11 = (y1.x1) r11
            i0.f r6 = r11.f22155d
            if (r6 == 0) goto Lb8
            r6.cancel()
        Lb8:
            r6 = 0
            r11.f22155d = r6
            xe.e r6 = r11.f22152a
            java.lang.Object r6 = r6.f21559b
            t0.c r6 = (t0.c) r6
            r6.f12975b = r2
            r11 = 0
            r6.f12974a = r11
            r6.a()
            int r15 = r15 + 1
            r11 = r17
            goto La7
        Lce:
            r17 = r11
            r11 = 0
            long r8 = r8 >> r17
            int r12 = r12 + 1
            r11 = r17
            goto L8e
        Ld8:
            r6 = r11
            r11 = 0
            if (r10 != r6) goto Le3
            goto Lde
        Ldd:
            r11 = 0
        Lde:
            if (r7 == r5) goto Le3
            int r7 = r7 + 1
            goto L74
        Le3:
            return
    }
}
