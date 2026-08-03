package a;

/* JADX INFO: renamed from: a.og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0307og extends a.ih {
    public a.V4 k;
    public a.C0096d2 l;

    @Override // a.ih, a.T4
    public final void a(a.T4 r11) {
            r10 = this;
            a.ih$a r11 = r10.j
            int r11 = r11.ordinal()
            r0 = 1
            r1 = 3
            if (r11 == r1) goto L152
            a.l5 r11 = r10.e
            boolean r2 = r11.c
            a.N3$a r3 = a.N3.a.c
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 0
            if (r2 == 0) goto L6b
            boolean r2 = r11.j
            if (r2 != 0) goto L6b
            a.N3$a r2 = r10.d
            if (r2 != r3) goto L6b
            a.N3 r2 = r10.b
            int r6 = r2.k
            r7 = 2
            if (r6 == r7) goto L54
            if (r6 == r1) goto L27
            goto L6b
        L27:
            a.K8 r1 = r2.d
            a.l5 r1 = r1.e
            boolean r6 = r1.j
            if (r6 == 0) goto L6b
            int r6 = r2.O
            r7 = -1
            if (r6 == r7) goto L4a
            if (r6 == 0) goto L43
            if (r6 == r0) goto L3a
            r1 = r5
            goto L50
        L3a:
            int r1 = r1.g
            float r1 = (float) r1
            float r2 = r2.N
        L3f:
            float r1 = r1 / r2
        L40:
            float r1 = r1 + r4
            int r1 = (int) r1
            goto L50
        L43:
            int r1 = r1.g
            float r1 = (float) r1
            float r2 = r2.N
            float r1 = r1 * r2
            goto L40
        L4a:
            int r1 = r1.g
            float r1 = (float) r1
            float r2 = r2.N
            goto L3f
        L50:
            r11.d(r1)
            goto L6b
        L54:
            a.N3 r1 = r2.K
            if (r1 == 0) goto L6b
            a.og r1 = r1.e
            a.l5 r1 = r1.e
            boolean r6 = r1.j
            if (r6 == 0) goto L6b
            float r2 = r2.r
            int r1 = r1.g
            float r1 = (float) r1
            float r1 = r1 * r2
            float r1 = r1 + r4
            int r1 = (int) r1
            r11.d(r1)
        L6b:
            a.V4 r1 = r10.h
            boolean r2 = r1.c
            if (r2 == 0) goto L151
            a.V4 r2 = r10.i
            boolean r6 = r2.c
            if (r6 != 0) goto L79
            goto L151
        L79:
            boolean r6 = r1.j
            if (r6 == 0) goto L87
            boolean r6 = r2.j
            if (r6 == 0) goto L87
            boolean r6 = r11.j
            if (r6 == 0) goto L87
            goto L151
        L87:
            boolean r6 = r11.j
            if (r6 != 0) goto Lc1
            a.N3$a r6 = r10.d
            if (r6 != r3) goto Lc1
            a.N3 r6 = r10.b
            int r7 = r6.j
            if (r7 != 0) goto Lc1
            boolean r6 = r6.r()
            if (r6 != 0) goto Lc1
            java.util.ArrayList r0 = r1.l
            java.lang.Object r0 = r0.get(r5)
            a.V4 r0 = (a.V4) r0
            java.util.ArrayList r3 = r2.l
            java.lang.Object r3 = r3.get(r5)
            a.V4 r3 = (a.V4) r3
            int r0 = r0.g
            int r4 = r1.f
            int r0 = r0 + r4
            int r3 = r3.g
            int r4 = r2.f
            int r3 = r3 + r4
            int r4 = r3 - r0
            r1.d(r0)
            r2.d(r3)
            r11.d(r4)
            return
        Lc1:
            boolean r6 = r11.j
            if (r6 != 0) goto L103
            a.N3$a r6 = r10.d
            if (r6 != r3) goto L103
            int r3 = r10.f516a
            if (r3 != r0) goto L103
            java.util.ArrayList r0 = r1.l
            int r0 = r0.size()
            if (r0 <= 0) goto L103
            java.util.ArrayList r0 = r2.l
            int r0 = r0.size()
            if (r0 <= 0) goto L103
            java.util.ArrayList r0 = r1.l
            java.lang.Object r0 = r0.get(r5)
            a.V4 r0 = (a.V4) r0
            java.util.ArrayList r3 = r2.l
            java.lang.Object r3 = r3.get(r5)
            a.V4 r3 = (a.V4) r3
            int r0 = r0.g
            int r6 = r1.f
            int r0 = r0 + r6
            int r3 = r3.g
            int r6 = r2.f
            int r3 = r3 + r6
            int r3 = r3 - r0
            int r0 = r11.m
            if (r3 >= r0) goto L100
            r11.d(r3)
            goto L103
        L100:
            r11.d(r0)
        L103:
            boolean r0 = r11.j
            if (r0 != 0) goto L108
            goto L151
        L108:
            java.util.ArrayList r0 = r1.l
            int r0 = r0.size()
            if (r0 <= 0) goto L151
            java.util.ArrayList r0 = r2.l
            int r0 = r0.size()
            if (r0 <= 0) goto L151
            java.util.ArrayList r0 = r1.l
            java.lang.Object r0 = r0.get(r5)
            a.V4 r0 = (a.V4) r0
            java.util.ArrayList r3 = r2.l
            java.lang.Object r3 = r3.get(r5)
            a.V4 r3 = (a.V4) r3
            int r5 = r0.g
            int r6 = r1.f
            int r6 = r6 + r5
            int r7 = r3.g
            int r8 = r2.f
            int r8 = r8 + r7
            a.N3 r9 = r10.b
            float r9 = r9.V
            if (r0 != r3) goto L13a
            r9 = r4
            goto L13c
        L13a:
            r5 = r6
            r7 = r8
        L13c:
            int r7 = r7 - r5
            int r0 = r11.g
            int r7 = r7 - r0
            float r0 = (float) r5
            float r0 = r0 + r4
            float r3 = (float) r7
            float r3 = r3 * r9
            float r3 = r3 + r0
            int r0 = (int) r3
            r1.d(r0)
            int r0 = r1.g
            int r11 = r11.g
            int r0 = r0 + r11
            r2.d(r0)
        L151:
            return
        L152:
            a.N3 r11 = r10.b
            a.M3 r1 = r11.z
            a.M3 r11 = r11.B
            r10.l(r1, r11, r0)
            return
    }

    @Override // a.ih
    public final void d() {
            r15 = this;
            a.N3 r0 = r15.b
            boolean r1 = r0.f180a
            a.l5 r2 = r15.e
            if (r1 == 0) goto Lf
            int r0 = r0.i()
            r2.d(r0)
        Lf:
            boolean r0 = r2.j
            a.N3$a r1 = a.N3.a.d
            a.N3$a r3 = a.N3.a.f181a
            a.N3$a r4 = a.N3.a.c
            a.V4 r5 = r15.i
            a.V4 r6 = r15.h
            r7 = 1
            if (r0 != 0) goto L86
            a.N3 r0 = r15.b
            a.N3$a[] r8 = r0.J
            r8 = r8[r7]
            r15.d = r8
            boolean r0 = r0.w
            if (r0 == 0) goto L31
            a.d2 r0 = new a.d2
            r0.<init>(r15)
            r15.l = r0
        L31:
            a.N3$a r0 = r15.d
            if (r0 == r4) goto Lb2
            if (r0 != r1) goto L7a
            a.N3 r1 = r15.b
            a.N3 r1 = r1.K
            if (r1 == 0) goto L7a
            a.N3$a[] r8 = r1.J
            r8 = r8[r7]
            if (r8 != r3) goto L7a
            int r0 = r1.i()
            a.N3 r3 = r15.b
            a.M3 r3 = r3.z
            int r3 = r3.c()
            int r0 = r0 - r3
            a.N3 r3 = r15.b
            a.M3 r3 = r3.B
            int r3 = r3.c()
            int r0 = r0 - r3
            a.og r1 = r1.e
            a.V4 r3 = r1.h
            a.N3 r4 = r15.b
            a.M3 r4 = r4.z
            int r4 = r4.c()
            a.ih.b(r6, r3, r4)
            a.V4 r1 = r1.i
            a.N3 r3 = r15.b
            a.M3 r3 = r3.B
            int r3 = r3.c()
            int r3 = -r3
            a.ih.b(r5, r1, r3)
            r2.d(r0)
            return
        L7a:
            if (r0 != r3) goto Lb2
            a.N3 r0 = r15.b
            int r0 = r0.i()
            r2.d(r0)
            goto Lb2
        L86:
            a.N3$a r0 = r15.d
            if (r0 != r1) goto Lb2
            a.N3 r0 = r15.b
            a.N3 r1 = r0.K
            if (r1 == 0) goto Lb2
            a.N3$a[] r8 = r1.J
            r8 = r8[r7]
            if (r8 != r3) goto Lb2
            a.og r1 = r1.e
            a.V4 r2 = r1.h
            a.M3 r0 = r0.z
            int r0 = r0.c()
            a.ih.b(r6, r2, r0)
            a.V4 r0 = r1.i
            a.N3 r1 = r15.b
            a.M3 r1 = r1.B
            int r1 = r1.c()
            int r1 = -r1
            a.ih.b(r5, r0, r1)
            return
        Lb2:
            boolean r0 = r2.j
            a.V4 r1 = r15.k
            r3 = 0
            r8 = 4
            r9 = 2
            r10 = 3
            if (r0 == 0) goto L1d4
            a.N3 r11 = r15.b
            boolean r12 = r11.f180a
            if (r12 == 0) goto L1d4
            a.M3[] r0 = r11.G
            r4 = r0[r9]
            a.M3 r12 = r4.d
            if (r12 == 0) goto L133
            r13 = r0[r10]
            a.M3 r13 = r13.d
            if (r13 == 0) goto L133
            boolean r0 = r11.r()
            if (r0 == 0) goto Lf0
            a.N3 r0 = r15.b
            a.M3[] r0 = r0.G
            r0 = r0[r9]
            int r0 = r0.c()
            r6.f = r0
            a.N3 r0 = r15.b
            a.M3[] r0 = r0.G
            r0 = r0[r10]
            int r0 = r0.c()
            int r0 = -r0
            r5.f = r0
            goto L127
        Lf0:
            a.N3 r0 = r15.b
            a.M3[] r0 = r0.G
            r0 = r0[r9]
            a.V4 r0 = a.ih.h(r0)
            if (r0 == 0) goto L109
            a.N3 r2 = r15.b
            a.M3[] r2 = r2.G
            r2 = r2[r9]
            int r2 = r2.c()
            a.ih.b(r6, r0, r2)
        L109:
            a.N3 r0 = r15.b
            a.M3[] r0 = r0.G
            r0 = r0[r10]
            a.V4 r0 = a.ih.h(r0)
            if (r0 == 0) goto L123
            a.N3 r2 = r15.b
            a.M3[] r2 = r2.G
            r2 = r2[r10]
            int r2 = r2.c()
            int r2 = -r2
            a.ih.b(r5, r0, r2)
        L123:
            r6.b = r7
            r5.b = r7
        L127:
            a.N3 r0 = r15.b
            boolean r2 = r0.w
            if (r2 == 0) goto L368
            int r0 = r0.R
            a.ih.b(r1, r6, r0)
            return
        L133:
            if (r12 == 0) goto L159
            a.V4 r0 = a.ih.h(r4)
            if (r0 == 0) goto L368
            a.N3 r3 = r15.b
            a.M3[] r3 = r3.G
            r3 = r3[r9]
            int r3 = r3.c()
            a.ih.b(r6, r0, r3)
            int r0 = r2.g
            a.ih.b(r5, r6, r0)
            a.N3 r0 = r15.b
            boolean r2 = r0.w
            if (r2 == 0) goto L368
            int r0 = r0.R
            a.ih.b(r1, r6, r0)
            return
        L159:
            r4 = r0[r10]
            a.M3 r7 = r4.d
            if (r7 == 0) goto L185
            a.V4 r0 = a.ih.h(r4)
            if (r0 == 0) goto L179
            a.N3 r3 = r15.b
            a.M3[] r3 = r3.G
            r3 = r3[r10]
            int r3 = r3.c()
            int r3 = -r3
            a.ih.b(r5, r0, r3)
            int r0 = r2.g
            int r0 = -r0
            a.ih.b(r6, r5, r0)
        L179:
            a.N3 r0 = r15.b
            boolean r2 = r0.w
            if (r2 == 0) goto L368
            int r0 = r0.R
            a.ih.b(r1, r6, r0)
            return
        L185:
            r0 = r0[r8]
            a.M3 r4 = r0.d
            if (r4 == 0) goto L1a2
            a.V4 r0 = a.ih.h(r0)
            if (r0 == 0) goto L368
            a.ih.b(r1, r0, r3)
            a.N3 r0 = r15.b
            int r0 = r0.R
            int r0 = -r0
            a.ih.b(r6, r1, r0)
            int r0 = r2.g
            a.ih.b(r5, r6, r0)
            return
        L1a2:
            boolean r0 = r11 instanceof a.C0138f8
            if (r0 != 0) goto L368
            a.N3 r0 = r11.K
            if (r0 == 0) goto L368
            a.M3$a r0 = a.M3.a.f
            a.M3 r0 = r11.g(r0)
            a.M3 r0 = r0.d
            if (r0 != 0) goto L368
            a.N3 r0 = r15.b
            a.N3 r3 = r0.K
            a.og r3 = r3.e
            a.V4 r3 = r3.h
            int r0 = r0.n()
            a.ih.b(r6, r3, r0)
            int r0 = r2.g
            a.ih.b(r5, r6, r0)
            a.N3 r0 = r15.b
            boolean r2 = r0.w
            if (r2 == 0) goto L368
            int r0 = r0.R
            a.ih.b(r1, r6, r0)
            return
        L1d4:
            if (r0 != 0) goto L22b
            a.N3$a r0 = r15.d
            if (r0 != r4) goto L22b
            a.N3 r0 = r15.b
            int r11 = r0.k
            if (r11 == r9) goto L20b
            if (r11 == r10) goto L1e3
            goto L22e
        L1e3:
            boolean r0 = r0.r()
            if (r0 != 0) goto L22e
            a.N3 r0 = r15.b
            int r11 = r0.j
            if (r11 != r10) goto L1f0
            goto L22e
        L1f0:
            a.K8 r0 = r0.d
            a.l5 r0 = r0.e
            java.util.ArrayList r11 = r2.l
            r11.add(r0)
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            r2.b = r7
            java.util.ArrayList r0 = r2.k
            r0.add(r6)
            java.util.ArrayList r0 = r2.k
            r0.add(r5)
            goto L22e
        L20b:
            a.N3 r0 = r0.K
            if (r0 != 0) goto L210
            goto L22e
        L210:
            a.og r0 = r0.e
            a.l5 r0 = r0.e
            java.util.ArrayList r11 = r2.l
            r11.add(r0)
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            r2.b = r7
            java.util.ArrayList r0 = r2.k
            r0.add(r6)
            java.util.ArrayList r0 = r2.k
            r0.add(r5)
            goto L22e
        L22b:
            r2.b(r15)
        L22e:
            a.N3 r0 = r15.b
            a.M3[] r11 = r0.G
            r12 = r11[r9]
            a.M3 r13 = r12.d
            if (r13 == 0) goto L289
            r14 = r11[r10]
            a.M3 r14 = r14.d
            if (r14 == 0) goto L289
            boolean r0 = r0.r()
            if (r0 == 0) goto L25e
            a.N3 r0 = r15.b
            a.M3[] r0 = r0.G
            r0 = r0[r9]
            int r0 = r0.c()
            r6.f = r0
            a.N3 r0 = r15.b
            a.M3[] r0 = r0.G
            r0 = r0[r10]
            int r0 = r0.c()
            int r0 = -r0
            r5.f = r0
            goto L27c
        L25e:
            a.N3 r0 = r15.b
            a.M3[] r0 = r0.G
            r0 = r0[r9]
            a.V4 r0 = a.ih.h(r0)
            a.N3 r3 = r15.b
            a.M3[] r3 = r3.G
            r3 = r3[r10]
            a.V4 r3 = a.ih.h(r3)
            r0.b(r15)
            r3.b(r15)
            a.ih$a r0 = a.ih.a.b
            r15.j = r0
        L27c:
            a.N3 r0 = r15.b
            boolean r0 = r0.w
            if (r0 == 0) goto L35e
            a.d2 r0 = r15.l
            r15.c(r1, r6, r7, r0)
            goto L35e
        L289:
            r14 = 0
            if (r13 == 0) goto L2d5
            a.V4 r0 = a.ih.h(r12)
            if (r0 == 0) goto L35e
            a.N3 r3 = r15.b
            a.M3[] r3 = r3.G
            r3 = r3[r9]
            int r3 = r3.c()
            a.ih.b(r6, r0, r3)
            r15.c(r5, r6, r7, r2)
            a.N3 r0 = r15.b
            boolean r0 = r0.w
            if (r0 == 0) goto L2ad
            a.d2 r0 = r15.l
            r15.c(r1, r6, r7, r0)
        L2ad:
            a.N3$a r0 = r15.d
            if (r0 != r4) goto L35e
            a.N3 r0 = r15.b
            float r1 = r0.N
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 <= 0) goto L35e
            a.K8 r0 = r0.d
            a.N3$a r1 = r0.d
            if (r1 != r4) goto L35e
            a.l5 r0 = r0.e
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            java.util.ArrayList r0 = r2.l
            a.N3 r1 = r15.b
            a.K8 r1 = r1.d
            a.l5 r1 = r1.e
            r0.add(r1)
            r2.f300a = r15
            goto L35e
        L2d5:
            r9 = r11[r10]
            a.M3 r12 = r9.d
            r13 = -1
            if (r12 == 0) goto L2ff
            a.V4 r0 = a.ih.h(r9)
            if (r0 == 0) goto L35e
            a.N3 r3 = r15.b
            a.M3[] r3 = r3.G
            r3 = r3[r10]
            int r3 = r3.c()
            int r3 = -r3
            a.ih.b(r5, r0, r3)
            r15.c(r6, r5, r13, r2)
            a.N3 r0 = r15.b
            boolean r0 = r0.w
            if (r0 == 0) goto L35e
            a.d2 r0 = r15.l
            r15.c(r1, r6, r7, r0)
            goto L35e
        L2ff:
            r8 = r11[r8]
            a.M3 r9 = r8.d
            if (r9 == 0) goto L317
            a.V4 r0 = a.ih.h(r8)
            if (r0 == 0) goto L35e
            a.ih.b(r1, r0, r3)
            a.d2 r0 = r15.l
            r15.c(r6, r1, r13, r0)
            r15.c(r5, r6, r7, r2)
            goto L35e
        L317:
            boolean r3 = r0 instanceof a.C0138f8
            if (r3 != 0) goto L35e
            a.N3 r3 = r0.K
            if (r3 == 0) goto L35e
            a.og r3 = r3.e
            a.V4 r3 = r3.h
            int r0 = r0.n()
            a.ih.b(r6, r3, r0)
            r15.c(r5, r6, r7, r2)
            a.N3 r0 = r15.b
            boolean r0 = r0.w
            if (r0 == 0) goto L338
            a.d2 r0 = r15.l
            r15.c(r1, r6, r7, r0)
        L338:
            a.N3$a r0 = r15.d
            if (r0 != r4) goto L35e
            a.N3 r0 = r15.b
            float r1 = r0.N
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 <= 0) goto L35e
            a.K8 r0 = r0.d
            a.N3$a r1 = r0.d
            if (r1 != r4) goto L35e
            a.l5 r0 = r0.e
            java.util.ArrayList r0 = r0.k
            r0.add(r2)
            java.util.ArrayList r0 = r2.l
            a.N3 r1 = r15.b
            a.K8 r1 = r1.d
            a.l5 r1 = r1.e
            r0.add(r1)
            r2.f300a = r15
        L35e:
            java.util.ArrayList r0 = r2.l
            int r0 = r0.size()
            if (r0 != 0) goto L368
            r2.c = r7
        L368:
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
            r1.Q = r0
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
            a.V4 r0 = r1.k
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
            int r0 = r0.k
            if (r0 != 0) goto Le
            return r2
        Le:
            r0 = 0
            return r0
        L10:
            return r2
    }

    public final void m() {
            r2 = this;
            r0 = 0
            r2.g = r0
            a.V4 r1 = r2.h
            r1.c()
            r1.j = r0
            a.V4 r1 = r2.i
            r1.c()
            r1.j = r0
            a.V4 r1 = r2.k
            r1.c()
            r1.j = r0
            a.l5 r1 = r2.e
            r1.j = r0
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VerticalRun "
            r0.<init>(r1)
            a.N3 r1 = r2.b
            java.lang.String r1 = r1.Y
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
