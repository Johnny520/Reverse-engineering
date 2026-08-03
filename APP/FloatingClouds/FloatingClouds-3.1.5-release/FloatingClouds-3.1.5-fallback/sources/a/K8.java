package a;

/* JADX INFO: loaded from: classes.dex */
public final class K8 extends a.ih {
    public static final int[] k = null;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            a.K8.k = r0
            return
    }

    public static void m(int[] r2, int r3, int r4, int r5, int r6, float r7, int r8) {
            int r4 = r4 - r3
            int r6 = r6 - r5
            r3 = -1
            r5 = 0
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1
            if (r8 == r3) goto L20
            if (r8 == 0) goto L17
            if (r8 == r1) goto Le
            goto L35
        Le:
            float r3 = (float) r4
            float r3 = r3 * r7
            float r3 = r3 + r0
            int r3 = (int) r3
            r2[r5] = r4
            r2[r1] = r3
            return
        L17:
            float r3 = (float) r6
            float r3 = r3 * r7
            float r3 = r3 + r0
            int r3 = (int) r3
            r2[r5] = r3
            r2[r1] = r6
            return
        L20:
            float r3 = (float) r6
            float r3 = r3 * r7
            float r3 = r3 + r0
            int r3 = (int) r3
            float r8 = (float) r4
            float r8 = r8 / r7
            float r8 = r8 + r0
            int r7 = (int) r8
            if (r3 > r4) goto L2f
            r2[r5] = r3
            r2[r1] = r6
            return
        L2f:
            if (r7 > r6) goto L35
            r2[r5] = r4
            r2[r1] = r7
        L35:
            return
    }

    @Override // a.ih, a.T4
    public final void a(a.T4 r24) {
            r23 = this;
            r0 = r23
            a.ih$a r1 = r0.j
            int r1 = r1.ordinal()
            r2 = 0
            r3 = 3
            if (r1 == r3) goto L389
            a.l5 r1 = r0.e
            boolean r4 = r1.j
            a.N3$a r5 = a.N3.a.c
            a.V4 r6 = r0.h
            a.V4 r7 = r0.i
            r8 = 1056964608(0x3f000000, float:0.5)
            r9 = 1
            if (r4 != 0) goto L28
            a.N3$a r4 = r0.d
            if (r4 != r5) goto L28
            a.N3 r4 = r0.b
            int r10 = r4.j
            r11 = 2
            if (r10 == r11) goto L28c
            if (r10 == r3) goto L2c
        L28:
            r24 = r8
            goto L2a6
        L2c:
            int r10 = r4.k
            r11 = -1
            if (r10 == 0) goto L64
            if (r10 != r3) goto L34
            goto L64
        L34:
            int r3 = r4.O
            if (r3 == r11) goto L56
            if (r3 == 0) goto L4b
            if (r3 == r9) goto L3e
            r3 = r2
            goto L60
        L3e:
            a.og r3 = r4.e
            a.l5 r3 = r3.e
            int r3 = r3.g
            float r3 = (float) r3
            float r4 = r4.N
        L47:
            float r3 = r3 * r4
        L48:
            float r3 = r3 + r8
            int r3 = (int) r3
            goto L60
        L4b:
            a.og r3 = r4.e
            a.l5 r3 = r3.e
            int r3 = r3.g
            float r3 = (float) r3
            float r4 = r4.N
            float r3 = r3 / r4
            goto L48
        L56:
            a.og r3 = r4.e
            a.l5 r3 = r3.e
            int r3 = r3.g
            float r3 = (float) r3
            float r4 = r4.N
            goto L47
        L60:
            r1.d(r3)
            goto L28
        L64:
            a.og r3 = r4.e
            a.V4 r10 = r3.h
            a.V4 r3 = r3.i
            a.M3 r12 = r4.y
            a.M3 r12 = r12.d
            if (r12 == 0) goto L72
            r12 = r9
            goto L73
        L72:
            r12 = r2
        L73:
            a.M3 r13 = r4.z
            a.M3 r13 = r13.d
            if (r13 == 0) goto L7b
            r13 = r9
            goto L7c
        L7b:
            r13 = r2
        L7c:
            a.M3 r14 = r4.A
            a.M3 r14 = r14.d
            if (r14 == 0) goto L84
            r14 = r9
            goto L85
        L84:
            r14 = r2
        L85:
            a.M3 r15 = r4.B
            a.M3 r15 = r15.d
            if (r15 == 0) goto L8f
            r15 = r9
        L8c:
            r24 = r8
            goto L91
        L8f:
            r15 = r2
            goto L8c
        L91:
            int r8 = r4.O
            if (r12 == 0) goto L19f
            if (r13 == 0) goto L19f
            if (r14 == 0) goto L19f
            if (r15 == 0) goto L19f
            float r4 = r4.N
            boolean r11 = r10.j
            int[] r16 = a.K8.k
            if (r11 == 0) goto Lf1
            boolean r11 = r3.j
            if (r11 == 0) goto Lf1
            boolean r5 = r6.c
            if (r5 == 0) goto L388
            boolean r5 = r7.c
            if (r5 != 0) goto Lb1
            goto L388
        Lb1:
            java.util.ArrayList r5 = r6.l
            java.lang.Object r5 = r5.get(r2)
            a.V4 r5 = (a.V4) r5
            int r5 = r5.g
            int r6 = r6.f
            int r17 = r5 + r6
            java.util.ArrayList r5 = r7.l
            java.lang.Object r5 = r5.get(r2)
            a.V4 r5 = (a.V4) r5
            int r5 = r5.g
            int r6 = r7.f
            int r18 = r5 - r6
            int r5 = r10.g
            int r6 = r10.f
            int r19 = r5 + r6
            int r5 = r3.g
            int r3 = r3.f
            int r20 = r5 - r3
            r21 = r4
            r22 = r8
            m(r16, r17, r18, r19, r20, r21, r22)
            r2 = r16[r2]
            r1.d(r2)
            a.N3 r1 = r0.b
            a.og r1 = r1.e
            a.l5 r1 = r1.e
            r2 = r16[r9]
            r1.d(r2)
            return
        Lf1:
            r21 = r4
            r22 = r8
            boolean r4 = r6.j
            java.util.ArrayList r8 = r10.l
            if (r4 == 0) goto L142
            boolean r4 = r7.j
            if (r4 == 0) goto L142
            boolean r4 = r10.c
            if (r4 == 0) goto L388
            boolean r4 = r3.c
            if (r4 != 0) goto L109
            goto L388
        L109:
            int r4 = r6.g
            int r11 = r6.f
            int r17 = r4 + r11
            int r4 = r7.g
            int r11 = r7.f
            int r18 = r4 - r11
            java.lang.Object r4 = r8.get(r2)
            a.V4 r4 = (a.V4) r4
            int r4 = r4.g
            int r11 = r10.f
            int r19 = r4 + r11
            java.util.ArrayList r4 = r3.l
            java.lang.Object r4 = r4.get(r2)
            a.V4 r4 = (a.V4) r4
            int r4 = r4.g
            int r11 = r3.f
            int r20 = r4 - r11
            m(r16, r17, r18, r19, r20, r21, r22)
            r4 = r16[r2]
            r1.d(r4)
            a.N3 r4 = r0.b
            a.og r4 = r4.e
            a.l5 r4 = r4.e
            r11 = r16[r9]
            r4.d(r11)
        L142:
            boolean r4 = r6.c
            if (r4 == 0) goto L388
            boolean r4 = r7.c
            if (r4 == 0) goto L388
            boolean r4 = r10.c
            if (r4 == 0) goto L388
            boolean r4 = r3.c
            if (r4 != 0) goto L154
            goto L388
        L154:
            java.util.ArrayList r4 = r6.l
            java.lang.Object r4 = r4.get(r2)
            a.V4 r4 = (a.V4) r4
            int r4 = r4.g
            int r11 = r6.f
            int r17 = r4 + r11
            java.util.ArrayList r4 = r7.l
            java.lang.Object r4 = r4.get(r2)
            a.V4 r4 = (a.V4) r4
            int r4 = r4.g
            int r11 = r7.f
            int r18 = r4 - r11
            java.lang.Object r4 = r8.get(r2)
            a.V4 r4 = (a.V4) r4
            int r4 = r4.g
            int r8 = r10.f
            int r19 = r4 + r8
            java.util.ArrayList r4 = r3.l
            java.lang.Object r4 = r4.get(r2)
            a.V4 r4 = (a.V4) r4
            int r4 = r4.g
            int r3 = r3.f
            int r20 = r4 - r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r3 = r16[r2]
            r1.d(r3)
            a.N3 r3 = r0.b
            a.og r3 = r3.e
            a.l5 r3 = r3.e
            r4 = r16[r9]
            r3.d(r4)
            goto L2a6
        L19f:
            if (r12 == 0) goto L217
            if (r14 == 0) goto L217
            boolean r3 = r6.c
            if (r3 == 0) goto L388
            boolean r3 = r7.c
            if (r3 != 0) goto L1ad
            goto L388
        L1ad:
            float r3 = r4.N
            java.util.ArrayList r4 = r6.l
            java.lang.Object r4 = r4.get(r2)
            a.V4 r4 = (a.V4) r4
            int r4 = r4.g
            int r10 = r6.f
            int r4 = r4 + r10
            java.util.ArrayList r10 = r7.l
            java.lang.Object r10 = r10.get(r2)
            a.V4 r10 = (a.V4) r10
            int r10 = r10.g
            int r12 = r7.f
            int r10 = r10 - r12
            if (r8 == r11) goto L1f4
            if (r8 == 0) goto L1f4
            if (r8 == r9) goto L1d1
            goto L2a6
        L1d1:
            int r10 = r10 - r4
            int r4 = r0.g(r10, r2)
            float r8 = (float) r4
            float r8 = r8 / r3
            float r8 = r8 + r24
            int r8 = (int) r8
            int r10 = r0.g(r8, r9)
            if (r8 == r10) goto L1e6
            float r4 = (float) r10
            float r4 = r4 * r3
            float r4 = r4 + r24
            int r4 = (int) r4
        L1e6:
            r1.d(r4)
            a.N3 r3 = r0.b
            a.og r3 = r3.e
            a.l5 r3 = r3.e
            r3.d(r10)
            goto L2a6
        L1f4:
            int r10 = r10 - r4
            int r4 = r0.g(r10, r2)
            float r8 = (float) r4
            float r8 = r8 * r3
            float r8 = r8 + r24
            int r8 = (int) r8
            int r10 = r0.g(r8, r9)
            if (r8 == r10) goto L209
            float r4 = (float) r10
            float r4 = r4 / r3
            float r4 = r4 + r24
            int r4 = (int) r4
        L209:
            r1.d(r4)
            a.N3 r3 = r0.b
            a.og r3 = r3.e
            a.l5 r3 = r3.e
            r3.d(r10)
            goto L2a6
        L217:
            if (r13 == 0) goto L2a6
            if (r15 == 0) goto L2a6
            boolean r12 = r10.c
            if (r12 == 0) goto L388
            boolean r12 = r3.c
            if (r12 != 0) goto L225
            goto L388
        L225:
            float r4 = r4.N
            java.util.ArrayList r12 = r10.l
            java.lang.Object r12 = r12.get(r2)
            a.V4 r12 = (a.V4) r12
            int r12 = r12.g
            int r10 = r10.f
            int r12 = r12 + r10
            java.util.ArrayList r10 = r3.l
            java.lang.Object r10 = r10.get(r2)
            a.V4 r10 = (a.V4) r10
            int r10 = r10.g
            int r3 = r3.f
            int r10 = r10 - r3
            if (r8 == r11) goto L26a
            if (r8 == 0) goto L248
            if (r8 == r9) goto L26a
            goto L2a6
        L248:
            int r10 = r10 - r12
            int r3 = r0.g(r10, r9)
            float r8 = (float) r3
            float r8 = r8 * r4
            float r8 = r8 + r24
            int r8 = (int) r8
            int r10 = r0.g(r8, r2)
            if (r8 == r10) goto L25d
            float r3 = (float) r10
            float r3 = r3 / r4
            float r3 = r3 + r24
            int r3 = (int) r3
        L25d:
            r1.d(r10)
            a.N3 r4 = r0.b
            a.og r4 = r4.e
            a.l5 r4 = r4.e
            r4.d(r3)
            goto L2a6
        L26a:
            int r10 = r10 - r12
            int r3 = r0.g(r10, r9)
            float r8 = (float) r3
            float r8 = r8 / r4
            float r8 = r8 + r24
            int r8 = (int) r8
            int r10 = r0.g(r8, r2)
            if (r8 == r10) goto L27f
            float r3 = (float) r10
            float r3 = r3 * r4
            float r3 = r3 + r24
            int r3 = (int) r3
        L27f:
            r1.d(r10)
            a.N3 r4 = r0.b
            a.og r4 = r4.e
            a.l5 r4 = r4.e
            r4.d(r3)
            goto L2a6
        L28c:
            r24 = r8
            a.N3 r3 = r4.K
            if (r3 == 0) goto L2a6
            a.K8 r3 = r3.d
            a.l5 r3 = r3.e
            boolean r8 = r3.j
            if (r8 == 0) goto L2a6
            float r4 = r4.o
            int r3 = r3.g
            float r3 = (float) r3
            float r3 = r3 * r4
            float r3 = r3 + r24
            int r3 = (int) r3
            r1.d(r3)
        L2a6:
            boolean r3 = r6.c
            if (r3 == 0) goto L388
            boolean r3 = r7.c
            if (r3 != 0) goto L2b0
            goto L388
        L2b0:
            boolean r3 = r6.j
            if (r3 == 0) goto L2be
            boolean r3 = r7.j
            if (r3 == 0) goto L2be
            boolean r3 = r1.j
            if (r3 == 0) goto L2be
            goto L388
        L2be:
            boolean r3 = r1.j
            if (r3 != 0) goto L2f8
            a.N3$a r3 = r0.d
            if (r3 != r5) goto L2f8
            a.N3 r3 = r0.b
            int r4 = r3.j
            if (r4 != 0) goto L2f8
            boolean r3 = r3.q()
            if (r3 != 0) goto L2f8
            java.util.ArrayList r3 = r6.l
            java.lang.Object r3 = r3.get(r2)
            a.V4 r3 = (a.V4) r3
            java.util.ArrayList r4 = r7.l
            java.lang.Object r2 = r4.get(r2)
            a.V4 r2 = (a.V4) r2
            int r3 = r3.g
            int r4 = r6.f
            int r3 = r3 + r4
            int r2 = r2.g
            int r4 = r7.f
            int r2 = r2 + r4
            int r4 = r2 - r3
            r6.d(r3)
            r7.d(r2)
            r1.d(r4)
            return
        L2f8:
            boolean r3 = r1.j
            if (r3 != 0) goto L348
            a.N3$a r3 = r0.d
            if (r3 != r5) goto L348
            int r3 = r0.f516a
            if (r3 != r9) goto L348
            java.util.ArrayList r3 = r6.l
            int r3 = r3.size()
            if (r3 <= 0) goto L348
            java.util.ArrayList r3 = r7.l
            int r3 = r3.size()
            if (r3 <= 0) goto L348
            java.util.ArrayList r3 = r6.l
            java.lang.Object r3 = r3.get(r2)
            a.V4 r3 = (a.V4) r3
            java.util.ArrayList r4 = r7.l
            java.lang.Object r4 = r4.get(r2)
            a.V4 r4 = (a.V4) r4
            int r3 = r3.g
            int r5 = r6.f
            int r3 = r3 + r5
            int r4 = r4.g
            int r5 = r7.f
            int r4 = r4 + r5
            int r4 = r4 - r3
            int r3 = r1.m
            int r3 = java.lang.Math.min(r4, r3)
            a.N3 r4 = r0.b
            int r5 = r4.n
            int r4 = r4.m
            int r3 = java.lang.Math.max(r4, r3)
            if (r5 <= 0) goto L345
            int r3 = java.lang.Math.min(r5, r3)
        L345:
            r1.d(r3)
        L348:
            boolean r3 = r1.j
            if (r3 != 0) goto L34d
            goto L388
        L34d:
            java.util.ArrayList r3 = r6.l
            java.lang.Object r3 = r3.get(r2)
            a.V4 r3 = (a.V4) r3
            java.util.ArrayList r4 = r7.l
            java.lang.Object r2 = r4.get(r2)
            a.V4 r2 = (a.V4) r2
            int r4 = r3.g
            int r5 = r6.f
            int r5 = r5 + r4
            int r8 = r2.g
            int r9 = r7.f
            int r9 = r9 + r8
            a.N3 r10 = r0.b
            float r10 = r10.U
            if (r3 != r2) goto L370
            r10 = r24
            goto L372
        L370:
            r4 = r5
            r8 = r9
        L372:
            int r8 = r8 - r4
            int r2 = r1.g
            int r8 = r8 - r2
            float r2 = (float) r4
            float r2 = r2 + r24
            float r3 = (float) r8
            float r3 = r3 * r10
            float r3 = r3 + r2
            int r2 = (int) r3
            r6.d(r2)
            int r2 = r6.g
            int r1 = r1.g
            int r2 = r2 + r1
            r7.d(r2)
        L388:
            return
        L389:
            a.N3 r1 = r0.b
            a.M3 r3 = r1.y
            a.M3 r1 = r1.A
            r0.l(r3, r1, r2)
            return
    }

    @Override // a.ih
    public final void d() {
            r11 = this;
            a.N3 r0 = r11.b
            boolean r1 = r0.f180a
            a.l5 r2 = r11.e
            if (r1 == 0) goto Lf
            int r0 = r0.l()
            r2.d(r0)
        Lf:
            boolean r0 = r2.j
            a.N3$a r1 = a.N3.a.d
            a.N3$a r3 = a.N3.a.c
            a.N3$a r4 = a.N3.a.f181a
            a.V4 r5 = r11.i
            a.V4 r6 = r11.h
            r7 = 0
            if (r0 != 0) goto L7b
            a.N3 r0 = r11.b
            a.N3$a[] r8 = r0.J
            r8 = r8[r7]
            r11.d = r8
            if (r8 == r3) goto Laf
            if (r8 != r1) goto L71
            a.N3 r9 = r0.K
            if (r9 == 0) goto L34
            a.N3$a[] r10 = r9.J
            r10 = r10[r7]
            if (r10 == r4) goto L3a
        L34:
            a.N3$a[] r10 = r9.J
            r10 = r10[r7]
            if (r10 != r1) goto L71
        L3a:
            int r0 = r9.l()
            a.N3 r1 = r11.b
            a.M3 r1 = r1.y
            int r1 = r1.c()
            int r0 = r0 - r1
            a.N3 r1 = r11.b
            a.M3 r1 = r1.A
            int r1 = r1.c()
            int r0 = r0 - r1
            a.K8 r1 = r9.d
            a.V4 r3 = r1.h
            a.N3 r4 = r11.b
            a.M3 r4 = r4.y
            int r4 = r4.c()
            a.ih.b(r6, r3, r4)
            a.V4 r1 = r1.i
            a.N3 r3 = r11.b
            a.M3 r3 = r3.A
            int r3 = r3.c()
            int r3 = -r3
            a.ih.b(r5, r1, r3)
            r2.d(r0)
            return
        L71:
            if (r8 != r4) goto Laf
            int r0 = r0.l()
            r2.d(r0)
            goto Laf
        L7b:
            a.N3$a r0 = r11.d
            if (r0 != r1) goto Laf
            a.N3 r0 = r11.b
            a.N3 r8 = r0.K
            if (r8 == 0) goto L8b
            a.N3$a[] r9 = r8.J
            r9 = r9[r7]
            if (r9 == r4) goto L91
        L8b:
            a.N3$a[] r4 = r8.J
            r4 = r4[r7]
            if (r4 != r1) goto Laf
        L91:
            a.K8 r1 = r8.d
            a.V4 r1 = r1.h
            a.M3 r0 = r0.y
            int r0 = r0.c()
            a.ih.b(r6, r1, r0)
            a.K8 r0 = r8.d
            a.V4 r0 = r0.i
            a.N3 r1 = r11.b
            a.M3 r1 = r1.A
            int r1 = r1.c()
            int r1 = -r1
            a.ih.b(r5, r0, r1)
            return
        Laf:
            boolean r0 = r2.j
            r1 = 1
            if (r0 == 0) goto L183
            a.N3 r0 = r11.b
            boolean r4 = r0.f180a
            if (r4 == 0) goto L183
            a.M3[] r3 = r0.G
            r4 = r3[r7]
            a.M3 r8 = r4.d
            if (r8 == 0) goto L120
            r9 = r3[r1]
            a.M3 r9 = r9.d
            if (r9 == 0) goto L120
            boolean r0 = r0.q()
            if (r0 == 0) goto Le8
            a.N3 r0 = r11.b
            a.M3[] r0 = r0.G
            r0 = r0[r7]
            int r0 = r0.c()
            r6.f = r0
            a.N3 r0 = r11.b
            a.M3[] r0 = r0.G
            r0 = r0[r1]
            int r0 = r0.c()
            int r0 = -r0
            r5.f = r0
            return
        Le8:
            a.N3 r0 = r11.b
            a.M3[] r0 = r0.G
            r0 = r0[r7]
            a.V4 r0 = a.ih.h(r0)
            if (r0 == 0) goto L101
            a.N3 r2 = r11.b
            a.M3[] r2 = r2.G
            r2 = r2[r7]
            int r2 = r2.c()
            a.ih.b(r6, r0, r2)
        L101:
            a.N3 r0 = r11.b
            a.M3[] r0 = r0.G
            r0 = r0[r1]
            a.V4 r0 = a.ih.h(r0)
            if (r0 == 0) goto L11b
            a.N3 r2 = r11.b
            a.M3[] r2 = r2.G
            r2 = r2[r1]
            int r2 = r2.c()
            int r2 = -r2
            a.ih.b(r5, r0, r2)
        L11b:
            r6.b = r1
            r5.b = r1
            return
        L120:
            if (r8 == 0) goto L13b
            a.V4 r0 = a.ih.h(r4)
            if (r0 == 0) goto L317
            a.N3 r1 = r11.b
            a.M3[] r1 = r1.G
            r1 = r1[r7]
            int r1 = r1.c()
            a.ih.b(r6, r0, r1)
            int r0 = r2.g
            a.ih.b(r5, r6, r0)
            return
        L13b:
            r3 = r3[r1]
            a.M3 r4 = r3.d
            if (r4 == 0) goto L15c
            a.V4 r0 = a.ih.h(r3)
            if (r0 == 0) goto L317
            a.N3 r3 = r11.b
            a.M3[] r3 = r3.G
            r1 = r3[r1]
            int r1 = r1.c()
            int r1 = -r1
            a.ih.b(r5, r0, r1)
            int r0 = r2.g
            int r0 = -r0
            a.ih.b(r6, r5, r0)
            return
        L15c:
            boolean r1 = r0 instanceof a.C0138f8
            if (r1 != 0) goto L317
            a.N3 r1 = r0.K
            if (r1 == 0) goto L317
            a.M3$a r1 = a.M3.a.f
            a.M3 r0 = r0.g(r1)
            a.M3 r0 = r0.d
            if (r0 != 0) goto L317
            a.N3 r0 = r11.b
            a.N3 r1 = r0.K
            a.K8 r1 = r1.d
            a.V4 r1 = r1.h
            int r0 = r0.m()
            a.ih.b(r6, r1, r0)
            int r0 = r2.g
            a.ih.b(r5, r6, r0)
            return
        L183:
            a.N3$a r0 = r11.d
            if (r0 != r3) goto L27a
            a.N3 r0 = r11.b
            int r3 = r0.j
            r4 = 2
            if (r3 == r4) goto L25b
            r4 = 3
            if (r3 == r4) goto L193
            goto L27a
        L193:
            int r3 = r0.k
            if (r3 != r4) goto L220
            r6.f300a = r11
            r5.f300a = r11
            a.og r3 = r0.e
            a.V4 r4 = r3.h
            r4.f300a = r11
            a.V4 r3 = r3.i
            r3.f300a = r11
            r2.f300a = r11
            boolean r0 = r0.r()
            if (r0 == 0) goto L1f5
            java.util.ArrayList r0 = r2.l
            a.N3 r3 = r11.b
            a.og r3 = r3.e
            a.l5 r3 = r3.e
            r0.add(r3)
            a.N3 r0 = r11.b
            a.og r0 = r0.e
            a.l5 r0 = r0.e
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            a.N3 r0 = r11.b
            a.og r0 = r0.e
            a.l5 r3 = r0.e
            r3.f300a = r11
            java.util.ArrayList r3 = r2.l
            a.V4 r0 = r0.h
            r3.add(r0)
            java.util.ArrayList r0 = r2.l
            a.N3 r3 = r11.b
            a.og r3 = r3.e
            a.V4 r3 = r3.i
            r0.add(r3)
            a.N3 r0 = r11.b
            a.og r0 = r0.e
            a.V4 r0 = r0.h
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            a.N3 r0 = r11.b
            a.og r0 = r0.e
            a.V4 r0 = r0.i
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            goto L27a
        L1f5:
            a.N3 r0 = r11.b
            boolean r0 = r0.q()
            if (r0 == 0) goto L214
            a.N3 r0 = r11.b
            a.og r0 = r0.e
            a.l5 r0 = r0.e
            java.util.ArrayList r0 = r0.l
            r0.add(r2)
            java.util.ArrayList r0 = r2.k
            a.N3 r3 = r11.b
            a.og r3 = r3.e
            a.l5 r3 = r3.e
            r0.add(r3)
            goto L27a
        L214:
            a.N3 r0 = r11.b
            a.og r0 = r0.e
            a.l5 r0 = r0.e
            java.util.ArrayList r0 = r0.l
            r0.add(r2)
            goto L27a
        L220:
            a.og r0 = r0.e
            a.l5 r0 = r0.e
            java.util.ArrayList r3 = r2.l
            r3.add(r0)
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            a.N3 r0 = r11.b
            a.og r0 = r0.e
            a.V4 r0 = r0.h
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            a.N3 r0 = r11.b
            a.og r0 = r0.e
            a.V4 r0 = r0.i
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            r2.b = r1
            java.util.ArrayList r0 = r2.k
            r0.add(r6)
            java.util.ArrayList r0 = r2.k
            r0.add(r5)
            java.util.ArrayList r0 = r6.l
            r0.add(r2)
            java.util.ArrayList r0 = r5.l
            r0.add(r2)
            goto L27a
        L25b:
            a.N3 r0 = r0.K
            if (r0 != 0) goto L260
            goto L27a
        L260:
            a.og r0 = r0.e
            a.l5 r0 = r0.e
            java.util.ArrayList r3 = r2.l
            r3.add(r0)
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            r2.b = r1
            java.util.ArrayList r0 = r2.k
            r0.add(r6)
            java.util.ArrayList r0 = r2.k
            r0.add(r5)
        L27a:
            a.N3 r0 = r11.b
            a.M3[] r3 = r0.G
            r4 = r3[r7]
            a.M3 r8 = r4.d
            if (r8 == 0) goto L2c9
            r9 = r3[r1]
            a.M3 r9 = r9.d
            if (r9 == 0) goto L2c9
            boolean r0 = r0.q()
            if (r0 == 0) goto L2aa
            a.N3 r0 = r11.b
            a.M3[] r0 = r0.G
            r0 = r0[r7]
            int r0 = r0.c()
            r6.f = r0
            a.N3 r0 = r11.b
            a.M3[] r0 = r0.G
            r0 = r0[r1]
            int r0 = r0.c()
            int r0 = -r0
            r5.f = r0
            return
        L2aa:
            a.N3 r0 = r11.b
            a.M3[] r0 = r0.G
            r0 = r0[r7]
            a.V4 r0 = a.ih.h(r0)
            a.N3 r2 = r11.b
            a.M3[] r2 = r2.G
            r1 = r2[r1]
            a.V4 r1 = a.ih.h(r1)
            r0.b(r11)
            r1.b(r11)
            a.ih$a r0 = a.ih.a.b
            r11.j = r0
            return
        L2c9:
            if (r8 == 0) goto L2e2
            a.V4 r0 = a.ih.h(r4)
            if (r0 == 0) goto L317
            a.N3 r3 = r11.b
            a.M3[] r3 = r3.G
            r3 = r3[r7]
            int r3 = r3.c()
            a.ih.b(r6, r0, r3)
            r11.c(r5, r6, r1, r2)
            return
        L2e2:
            r3 = r3[r1]
            a.M3 r4 = r3.d
            if (r4 == 0) goto L301
            a.V4 r0 = a.ih.h(r3)
            if (r0 == 0) goto L317
            a.N3 r3 = r11.b
            a.M3[] r3 = r3.G
            r1 = r3[r1]
            int r1 = r1.c()
            int r1 = -r1
            a.ih.b(r5, r0, r1)
            r0 = -1
            r11.c(r6, r5, r0, r2)
            return
        L301:
            boolean r3 = r0 instanceof a.C0138f8
            if (r3 != 0) goto L317
            a.N3 r3 = r0.K
            if (r3 == 0) goto L317
            a.K8 r3 = r3.d
            a.V4 r3 = r3.h
            int r0 = r0.m()
            a.ih.b(r6, r3, r0)
            r11.c(r5, r6, r1, r2)
        L317:
            return
    }

    @Override // a.ih
    public final void e() {
            r2 = this;
            a.V4 r0 = r2.h
            boolean r1 = r0.j
            if (r1 == 0) goto Lc
            a.N3 r1 = r2.b
            int r0 = r0.g
            r1.P = r0
        Lc:
            return
    }

    @Override // a.ih
    public final void f() {
            r1 = this;
            r0 = 0
            r1.c = r0
            a.V4 r0 = r1.h
            r0.c()
            a.V4 r0 = r1.i
            r0.c()
            a.l5 r0 = r1.e
            r0.c()
            r0 = 0
            r1.g = r0
            return
    }

    @Override // a.ih
    public final boolean k() {
            r3 = this;
            a.N3$a r0 = r3.d
            a.N3$a r1 = a.N3.a.c
            r2 = 1
            if (r0 != r1) goto L10
            a.N3 r0 = r3.b
            int r0 = r0.j
            if (r0 != 0) goto Le
            return r2
        Le:
            r0 = 0
            return r0
        L10:
            return r2
    }

    public final void n() {
            r2 = this;
            r0 = 0
            r2.g = r0
            a.V4 r1 = r2.h
            r1.c()
            r1.j = r0
            a.V4 r1 = r2.i
            r1.c()
            r1.j = r0
            a.l5 r1 = r2.e
            r1.j = r0
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HorizontalRun "
            r0.<init>(r1)
            a.N3 r1 = r2.b
            java.lang.String r1 = r1.Y
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
