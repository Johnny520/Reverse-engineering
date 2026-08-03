package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends w0.v implements i0.l2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fg.a f6078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i0.e f6079i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i0.w f6080j;

    public x(fg.a r3, i0.e r4) {
            r2 = this;
            r2.<init>()
            r2.f6078h = r3
            r2.f6079i = r4
            i0.w r3 = new i0.w
            w0.f r4 = w0.m.j()
            long r0 = r4.g()
            r3.<init>(r0)
            r2.f6080j = r3
            return
    }

    @Override // w0.u
    public final w0.w a() {
            r1 = this;
            i0.w r0 = r1.f6080j
            return r0
    }

    @Override // w0.u
    public final void c(w0.w r1) {
            r0 = this;
            r1.getClass()
            i0.w r1 = (i0.w) r1
            r0.f6080j = r1
            return
    }

    public final i0.w g(i0.w r22, w0.f r23, boolean r24, fg.a r25) {
            r21 = this;
            r1 = r21
            r6 = r22
            r0 = r23
            boolean r2 = r6.c(r1, r0)
            if (r2 == 0) goto Lc9
            if (r24 == 0) goto Lc8
            j0.b r2 = i0.r.o()
            java.lang.Object[] r3 = r2.f6671g
            int r4 = r2.f6673i
            r5 = 0
        L17:
            if (r5 >= r4) goto L23
            r8 = r3[r5]
            i0.g0 r8 = (i0.g0) r8
            r8.b()
            int r5 = r5 + 1
            goto L17
        L23:
            f.b0 r3 = r6.f6063e     // Catch: java.lang.Throwable -> L38
            b5.c r4 = i0.k2.f5950a     // Catch: java.lang.Throwable -> L38
            java.lang.Object r5 = r4.o()     // Catch: java.lang.Throwable -> L38
            s0.e r5 = (s0.e) r5     // Catch: java.lang.Throwable -> L38
            if (r5 != 0) goto L3b
            s0.e r5 = new s0.e     // Catch: java.lang.Throwable -> L38
            r5.<init>()     // Catch: java.lang.Throwable -> L38
            r4.O(r5)     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r0 = move-exception
            goto Lb6
        L3b:
            int r4 = r5.f12186a     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r8 = r3.f2775b     // Catch: java.lang.Throwable -> L38
            int[] r9 = r3.f2776c     // Catch: java.lang.Throwable -> L38
            long[] r3 = r3.f2774a     // Catch: java.lang.Throwable -> L38
            int r10 = r3.length     // Catch: java.lang.Throwable -> L38
            int r10 = r10 + (-2)
            if (r10 < 0) goto La3
            r11 = 0
        L49:
            r12 = r3[r11]     // Catch: java.lang.Throwable -> L38
            long r14 = ~r12     // Catch: java.lang.Throwable -> L38
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L9c
            int r14 = r11 - r10
            int r14 = ~r14     // Catch: java.lang.Throwable -> L38
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r7 = 0
        L66:
            if (r7 >= r14) goto L99
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r12 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L8e
            int r17 = r11 << 3
            int r17 = r17 + r7
            r18 = r8[r17]     // Catch: java.lang.Throwable -> L38
            r17 = r9[r17]     // Catch: java.lang.Throwable -> L38
            r24 = r15
            r15 = r18
            w0.u r15 = (w0.u) r15     // Catch: java.lang.Throwable -> L38
            int r0 = r4 + r17
            r5.f12186a = r0     // Catch: java.lang.Throwable -> L38
            fg.l r0 = r23.e()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L90
            r0.invoke(r15)     // Catch: java.lang.Throwable -> L38
            goto L90
        L8e:
            r24 = r15
        L90:
            long r12 = r12 >> r24
            int r7 = r7 + 1
            r0 = r23
            r15 = r24
            goto L66
        L99:
            r0 = r15
            if (r14 != r0) goto La3
        L9c:
            if (r11 == r10) goto La3
            int r11 = r11 + 1
            r0 = r23
            goto L49
        La3:
            r5.f12186a = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r0 = r2.f6671g
            int r2 = r2.f6673i
            r7 = 0
        Laa:
            if (r7 >= r2) goto Lc8
            r3 = r0[r7]
            i0.g0 r3 = (i0.g0) r3
            r3.a()
            int r7 = r7 + 1
            goto Laa
        Lb6:
            java.lang.Object[] r3 = r2.f6671g
            int r2 = r2.f6673i
            r7 = 0
        Lbb:
            if (r7 >= r2) goto Lc7
            r4 = r3[r7]
            i0.g0 r4 = (i0.g0) r4
            r4.a()
            int r7 = r7 + 1
            goto Lbb
        Lc7:
            throw r0
        Lc8:
            return r6
        Lc9:
            f.b0 r3 = new f.b0
            r3.<init>()
            b5.c r0 = i0.k2.f5950a
            java.lang.Object r2 = r0.o()
            s0.e r2 = (s0.e) r2
            if (r2 != 0) goto Le0
            s0.e r2 = new s0.e
            r2.<init>()
            r0.O(r2)
        Le0:
            int r4 = r2.f12186a
            j0.b r7 = i0.r.o()
            java.lang.Object[] r0 = r7.f6671g
            int r5 = r7.f6673i
            r8 = 0
        Leb:
            if (r8 >= r5) goto Lf7
            r9 = r0[r8]
            i0.g0 r9 = (i0.g0) r9
            r9.b()
            int r8 = r8 + 1
            goto Leb
        Lf7:
            int r0 = r4 + 1
            r2.f12186a = r0     // Catch: java.lang.Throwable -> L18e
            ca.k r0 = new ca.k     // Catch: java.lang.Throwable -> L18e
            r5 = 3
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L18e
            r5 = r25
            java.lang.Object r0 = w0.q.j(r0, r5)     // Catch: java.lang.Throwable -> L18e
            r2.f12186a = r4     // Catch: java.lang.Throwable -> L18e
            java.lang.Object[] r2 = r7.f6671g
            int r4 = r7.f6673i
            r7 = 0
        L10e:
            if (r7 >= r4) goto L11a
            r5 = r2[r7]
            i0.g0 r5 = (i0.g0) r5
            r5.a()
            int r7 = r7 + 1
            goto L10e
        L11a:
            java.lang.Object r2 = w0.m.f14786c
            monitor-enter(r2)
            w0.f r4 = w0.m.j()     // Catch: java.lang.Throwable -> L13c
            java.lang.Object r5 = r6.f6064f     // Catch: java.lang.Throwable -> L13c
            java.lang.Object r7 = i0.w.f6060h     // Catch: java.lang.Throwable -> L13c
            if (r5 == r7) goto L13e
            i0.e r7 = r1.f6079i     // Catch: java.lang.Throwable -> L13c
            if (r7 == 0) goto L13e
            boolean r5 = r7.b(r0, r5)     // Catch: java.lang.Throwable -> L13c
            r7 = 1
            if (r5 != r7) goto L13e
            r6.f6063e = r3     // Catch: java.lang.Throwable -> L13c
            int r0 = r6.d(r1, r4)     // Catch: java.lang.Throwable -> L13c
            r6.f6065g = r0     // Catch: java.lang.Throwable -> L13c
            r5 = r6
            goto L15c
        L13c:
            r0 = move-exception
            goto L18c
        L13e:
            i0.w r5 = r1.f6080j     // Catch: java.lang.Throwable -> L13c
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L13c
            w0.w r6 = w0.m.m(r5, r1)     // Catch: java.lang.Throwable -> L189
            r6.a(r5)     // Catch: java.lang.Throwable -> L189
            long r7 = r4.g()     // Catch: java.lang.Throwable -> L189
            r6.f14824a = r7     // Catch: java.lang.Throwable -> L189
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13c
            r5 = r6
            i0.w r5 = (i0.w) r5     // Catch: java.lang.Throwable -> L13c
            r5.f6063e = r3     // Catch: java.lang.Throwable -> L13c
            int r3 = r5.d(r1, r4)     // Catch: java.lang.Throwable -> L13c
            r5.f6065g = r3     // Catch: java.lang.Throwable -> L13c
            r5.f6064f = r0     // Catch: java.lang.Throwable -> L13c
        L15c:
            monitor-exit(r2)
            b5.c r0 = i0.k2.f5950a
            java.lang.Object r0 = r0.o()
            s0.e r0 = (s0.e) r0
            if (r0 == 0) goto L188
            int r0 = r0.f12186a
            if (r0 != 0) goto L188
            w0.f r0 = w0.m.j()
            r0.m()
            monitor-enter(r2)
            w0.f r0 = w0.m.j()     // Catch: java.lang.Throwable -> L185
            long r3 = r0.g()     // Catch: java.lang.Throwable -> L185
            r5.f6061c = r3     // Catch: java.lang.Throwable -> L185
            int r0 = r0.h()     // Catch: java.lang.Throwable -> L185
            r5.f6062d = r0     // Catch: java.lang.Throwable -> L185
            monitor-exit(r2)
            return r5
        L185:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L188:
            return r5
        L189:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13c
            throw r0     // Catch: java.lang.Throwable -> L13c
        L18c:
            monitor-exit(r2)
            throw r0
        L18e:
            r0 = move-exception
            java.lang.Object[] r2 = r7.f6671g
            int r3 = r7.f6673i
            r7 = 0
        L194:
            if (r7 >= r3) goto L1a0
            r4 = r2[r7]
            i0.g0 r4 = (i0.g0) r4
            r4.a()
            int r7 = r7 + 1
            goto L194
        L1a0:
            throw r0
    }

    @Override // i0.l2
    public final java.lang.Object getValue() {
            r4 = this;
            w0.f r0 = w0.m.j()
            fg.l r0 = r0.e()
            if (r0 == 0) goto Ld
            r0.invoke(r4)
        Ld:
            w0.f r0 = w0.m.j()
            i0.w r1 = r4.f6080j
            w0.w r1 = w0.m.i(r1, r0)
            i0.w r1 = (i0.w) r1
            r2 = 1
            fg.a r3 = r4.f6078h
            i0.w r0 = r4.g(r1, r0, r2, r3)
            java.lang.Object r0 = r0.f6064f
            return r0
    }

    public final i0.w h() {
            r4 = this;
            w0.f r0 = w0.m.j()
            i0.w r1 = r4.f6080j
            w0.w r1 = w0.m.i(r1, r0)
            i0.w r1 = (i0.w) r1
            r2 = 0
            fg.a r3 = r4.f6078h
            i0.w r0 = r4.g(r1, r0, r2, r3)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            i0.w r0 = r3.f6080j
            w0.w r0 = w0.m.h(r0)
            i0.w r0 = (i0.w) r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DerivedState(value="
            r0.<init>(r1)
            i0.w r1 = r3.f6080j
            w0.w r1 = w0.m.h(r1)
            i0.w r1 = (i0.w) r1
            w0.f r2 = w0.m.j()
            boolean r2 = r1.c(r3, r2)
            if (r2 == 0) goto L28
            java.lang.Object r1 = r1.f6064f
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L2a
        L28:
            java.lang.String r1 = "<Not calculated>"
        L2a:
            r0.append(r1)
            java.lang.String r1 = ")@"
            r0.append(r1)
            int r1 = r3.hashCode()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
