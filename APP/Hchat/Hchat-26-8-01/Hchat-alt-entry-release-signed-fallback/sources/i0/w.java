package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends w0.w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.lang.Object f6060h = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f.b0 f6063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.Object f6064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6065g;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            i0.w.f6060h = r0
            return
    }

    public w(long r1) {
            r0 = this;
            r0.<init>(r1)
            f.b0 r1 = f.o0.f2877a
            r1.getClass()
            r0.f6063e = r1
            java.lang.Object r1 = i0.w.f6060h
            r0.f6064f = r1
            return
    }

    @Override // w0.w
    public final void a(w0.w r2) {
            r1 = this;
            r2.getClass()
            i0.w r2 = (i0.w) r2
            f.b0 r0 = r2.f6063e
            r1.f6063e = r0
            java.lang.Object r0 = r2.f6064f
            r1.f6064f = r0
            int r2 = r2.f6065g
            r1.f6065g = r2
            return
    }

    @Override // w0.w
    public final w0.w b(long r2) {
            r1 = this;
            i0.w r0 = new i0.w
            r0.<init>(r2)
            return r0
    }

    public final boolean c(i0.x r7, w0.f r8) {
            r6 = this;
            java.lang.Object r0 = w0.m.f14786c
            monitor-enter(r0)
            long r1 = r6.f6061c     // Catch: java.lang.Throwable -> L1a
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L1a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1c
            int r1 = r6.f6062d     // Catch: java.lang.Throwable -> L1a
            int r4 = r8.h()     // Catch: java.lang.Throwable -> L1a
            if (r1 == r4) goto L18
            goto L1c
        L18:
            r1 = r3
            goto L1d
        L1a:
            r7 = move-exception
            goto L47
        L1c:
            r1 = r2
        L1d:
            monitor-exit(r0)
            java.lang.Object r4 = r6.f6064f
            java.lang.Object r5 = i0.w.f6060h
            if (r4 == r5) goto L2f
            if (r1 == 0) goto L30
            int r4 = r6.f6065g
            int r7 = r6.d(r7, r8)
            if (r4 != r7) goto L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r2 == 0) goto L46
            if (r1 == 0) goto L46
            monitor-enter(r0)
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L43
            r6.f6061c = r3     // Catch: java.lang.Throwable -> L43
            int r7 = r8.h()     // Catch: java.lang.Throwable -> L43
            r6.f6062d = r7     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return r2
        L43:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L46:
            return r2
        L47:
            monitor-exit(r0)
            throw r7
    }

    public final int d(i0.x r32, w0.f r33) {
            r31 = this;
            r0 = r33
            java.lang.Object r1 = w0.m.f14786c
            monitor-enter(r1)
            r2 = r31
            f.b0 r3 = r2.f6063e     // Catch: java.lang.Throwable -> L178
            monitor-exit(r1)
            int r1 = r3.f2778e
            r4 = 7
            if (r1 == 0) goto L175
            j0.b r1 = i0.r.o()
            java.lang.Object[] r5 = r1.f6671g
            int r6 = r1.f6673i
            r8 = 0
        L18:
            if (r8 >= r6) goto L24
            r9 = r5[r8]
            i0.g0 r9 = (i0.g0) r9
            r9.b()
            int r8 = r8 + 1
            goto L18
        L24:
            java.lang.Object[] r5 = r3.f2775b     // Catch: java.lang.Throwable -> Lcd
            int[] r6 = r3.f2776c     // Catch: java.lang.Throwable -> Lcd
            long[] r3 = r3.f2774a     // Catch: java.lang.Throwable -> Lcd
            int r8 = r3.length     // Catch: java.lang.Throwable -> Lcd
            int r8 = r8 + (-2)
            if (r8 < 0) goto L14e
            r10 = r4
            r9 = 0
        L31:
            r11 = r3[r9]     // Catch: java.lang.Throwable -> Lcd
            long r13 = ~r11     // Catch: java.lang.Throwable -> Lcd
            long r13 = r13 << r4
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L134
            int r13 = r9 - r8
            int r13 = ~r13     // Catch: java.lang.Throwable -> Lcd
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r32 = r4
            r4 = 0
        L4c:
            if (r4 >= r13) goto L12a
            r17 = 255(0xff, double:1.26E-321)
            long r19 = r11 & r17
            r21 = 128(0x80, double:6.3E-322)
            int r19 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r19 >= 0) goto L10e
            int r19 = r9 << 3
            int r19 = r19 + r4
            r20 = r5[r19]     // Catch: java.lang.Throwable -> Lcd
            r23 = r15
            r15 = r6[r19]     // Catch: java.lang.Throwable -> Lcd
            r16 = r14
            r14 = r20
            w0.u r14 = (w0.u) r14     // Catch: java.lang.Throwable -> Lcd
            r7 = 1
            if (r15 == r7) goto L75
            r20 = r3
            r26 = r4
            r25 = r5
            r27 = r6
            goto L10b
        L75:
            boolean r7 = r14 instanceof i0.x     // Catch: java.lang.Throwable -> Lcd
            if (r7 == 0) goto Leb
            i0.x r14 = (i0.x) r14     // Catch: java.lang.Throwable -> Lcd
            i0.w r7 = r14.f6080j     // Catch: java.lang.Throwable -> Lcd
            w0.w r7 = w0.m.i(r7, r0)     // Catch: java.lang.Throwable -> Lcd
            i0.w r7 = (i0.w) r7     // Catch: java.lang.Throwable -> Lcd
            fg.a r15 = r14.f6078h     // Catch: java.lang.Throwable -> Lcd
            r2 = 0
            i0.w r7 = r14.g(r7, r0, r2, r15)     // Catch: java.lang.Throwable -> Lcd
            f.b0 r14 = r7.f6063e     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object[] r15 = r14.f2775b     // Catch: java.lang.Throwable -> Lcd
            long[] r14 = r14.f2774a     // Catch: java.lang.Throwable -> Lcd
            int r2 = r14.length     // Catch: java.lang.Throwable -> Lcd
            int r2 = r2 + (-2)
            r20 = r3
            r26 = r4
            r25 = r5
            if (r2 < 0) goto Le4
            r3 = 0
        L9c:
            r4 = r14[r3]     // Catch: java.lang.Throwable -> Lcd
            r27 = r6
            r28 = r7
            long r6 = ~r4     // Catch: java.lang.Throwable -> Lcd
            long r6 = r6 << r32
            long r6 = r6 & r4
            long r6 = r6 & r23
            int r6 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
            if (r6 == 0) goto Ld9
            int r6 = r3 - r2
            int r6 = ~r6     // Catch: java.lang.Throwable -> Lcd
            int r6 = r6 >>> 31
            int r6 = 8 - r6
            r7 = 0
        Lb4:
            if (r7 >= r6) goto Ld5
            long r29 = r4 & r17
            int r29 = (r29 > r21 ? 1 : (r29 == r21 ? 0 : -1))
            if (r29 >= 0) goto Ld0
            int r29 = r3 << 3
            int r29 = r29 + r7
            r29 = r15[r29]     // Catch: java.lang.Throwable -> Lcd
            w0.u r29 = (w0.u) r29     // Catch: java.lang.Throwable -> Lcd
            int r10 = r10 * 31
            int r29 = java.lang.System.identityHashCode(r29)     // Catch: java.lang.Throwable -> Lcd
            int r10 = r10 + r29
            goto Ld0
        Lcd:
            r0 = move-exception
            goto L163
        Ld0:
            long r4 = r4 >> r16
            int r7 = r7 + 1
            goto Lb4
        Ld5:
            r4 = r16
            if (r6 != r4) goto Le8
        Ld9:
            if (r3 == r2) goto Le8
            int r3 = r3 + 1
            r6 = r27
            r7 = r28
            r16 = 8
            goto L9c
        Le4:
            r27 = r6
            r28 = r7
        Le8:
            r7 = r28
            goto Lfb
        Leb:
            r20 = r3
            r26 = r4
            r25 = r5
            r27 = r6
            w0.w r2 = r14.a()     // Catch: java.lang.Throwable -> Lcd
            w0.w r7 = w0.m.i(r2, r0)     // Catch: java.lang.Throwable -> Lcd
        Lfb:
            int r10 = r10 * 31
            int r2 = java.lang.System.identityHashCode(r7)     // Catch: java.lang.Throwable -> Lcd
            int r10 = r10 + r2
            int r10 = r10 * 31
            long r2 = r7.f14824a     // Catch: java.lang.Throwable -> Lcd
            int r2 = java.lang.Long.hashCode(r2)     // Catch: java.lang.Throwable -> Lcd
            int r10 = r10 + r2
        L10b:
            r4 = 8
            goto L119
        L10e:
            r20 = r3
            r26 = r4
            r25 = r5
            r27 = r6
            r23 = r15
            r4 = r14
        L119:
            long r11 = r11 >> r4
            int r2 = r26 + 1
            r14 = r4
            r3 = r20
            r15 = r23
            r5 = r25
            r6 = r27
            r4 = r2
            r2 = r31
            goto L4c
        L12a:
            r20 = r3
            r25 = r5
            r27 = r6
            r4 = r14
            if (r13 != r4) goto L151
            goto L13c
        L134:
            r20 = r3
            r32 = r4
            r25 = r5
            r27 = r6
        L13c:
            if (r9 == r8) goto L14c
            int r9 = r9 + 1
            r2 = r31
            r4 = r32
            r3 = r20
            r5 = r25
            r6 = r27
            goto L31
        L14c:
            r4 = r10
            goto L150
        L14e:
            r32 = r4
        L150:
            r10 = r4
        L151:
            java.lang.Object[] r0 = r1.f6671g
            int r1 = r1.f6673i
            r7 = 0
        L156:
            if (r7 >= r1) goto L162
            r2 = r0[r7]
            i0.g0 r2 = (i0.g0) r2
            r2.a()
            int r7 = r7 + 1
            goto L156
        L162:
            return r10
        L163:
            java.lang.Object[] r2 = r1.f6671g
            int r1 = r1.f6673i
            r7 = 0
        L168:
            if (r7 >= r1) goto L174
            r3 = r2[r7]
            i0.g0 r3 = (i0.g0) r3
            r3.a()
            int r7 = r7 + 1
            goto L168
        L174:
            throw r0
        L175:
            r32 = r4
            return r32
        L178:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
