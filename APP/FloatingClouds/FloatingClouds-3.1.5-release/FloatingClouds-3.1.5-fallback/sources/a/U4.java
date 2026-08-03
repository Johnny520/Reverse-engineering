package a;

/* JADX INFO: loaded from: classes.dex */
public final class U4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.O3 f286a;
    public boolean b;
    public boolean c;
    public a.O3 d;
    public java.util.ArrayList<a.ih> e;
    public a.C0114e2.b f;
    public a.C0114e2.a g;
    public java.util.ArrayList<a.Dd> h;

    public final void a(a.V4 r7, int r8, java.util.ArrayList r9, a.Dd r10) {
            r6 = this;
            a.ih r7 = r7.d
            a.Dd r0 = r7.c
            if (r0 != 0) goto Ldf
            a.O3 r0 = r6.f286a
            a.K8 r1 = r0.d
            if (r7 == r1) goto Ldf
            a.og r0 = r0.e
            if (r7 != r0) goto L12
            goto Ldf
        L12:
            if (r10 != 0) goto L28
            a.Dd r10 = new a.Dd
            r10.<init>()
            r0 = 0
            r10.f60a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.b = r0
            r10.f60a = r7
            r9.add(r10)
        L28:
            r7.c = r10
            java.util.ArrayList<a.ih> r0 = r10.b
            r0.add(r7)
            a.V4 r0 = r7.h
            java.util.ArrayList r1 = r0.k
            java.util.Iterator r1 = r1.iterator()
        L37:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r1.next()
            a.T4 r2 = (a.T4) r2
            boolean r3 = r2 instanceof a.V4
            if (r3 == 0) goto L37
            a.V4 r2 = (a.V4) r2
            r6.a(r2, r8, r9, r10)
            goto L37
        L4d:
            a.V4 r1 = r7.i
            java.util.ArrayList r2 = r1.k
            java.util.Iterator r2 = r2.iterator()
        L55:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r2.next()
            a.T4 r3 = (a.T4) r3
            boolean r4 = r3 instanceof a.V4
            if (r4 == 0) goto L55
            a.V4 r3 = (a.V4) r3
            r6.a(r3, r8, r9, r10)
            goto L55
        L6b:
            r2 = 1
            if (r8 != r2) goto L93
            boolean r3 = r7 instanceof a.C0307og
            if (r3 == 0) goto L93
            r3 = r7
            a.og r3 = (a.C0307og) r3
            a.V4 r3 = r3.k
            java.util.ArrayList r3 = r3.k
            java.util.Iterator r3 = r3.iterator()
        L7d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L93
            java.lang.Object r4 = r3.next()
            a.T4 r4 = (a.T4) r4
            boolean r5 = r4 instanceof a.V4
            if (r5 == 0) goto L7d
            a.V4 r4 = (a.V4) r4
            r6.a(r4, r8, r9, r10)
            goto L7d
        L93:
            java.util.ArrayList r0 = r0.l
            java.util.Iterator r0 = r0.iterator()
        L99:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto La9
            java.lang.Object r3 = r0.next()
            a.V4 r3 = (a.V4) r3
            r6.a(r3, r8, r9, r10)
            goto L99
        La9:
            java.util.ArrayList r0 = r1.l
            java.util.Iterator r0 = r0.iterator()
        Laf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbf
            java.lang.Object r1 = r0.next()
            a.V4 r1 = (a.V4) r1
            r6.a(r1, r8, r9, r10)
            goto Laf
        Lbf:
            if (r8 != r2) goto Ldf
            boolean r0 = r7 instanceof a.C0307og
            if (r0 == 0) goto Ldf
            a.og r7 = (a.C0307og) r7
            a.V4 r7 = r7.k
            java.util.ArrayList r7 = r7.l
            java.util.Iterator r7 = r7.iterator()
        Lcf:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Ldf
            java.lang.Object r0 = r7.next()
            a.V4 r0 = (a.V4) r0
            r6.a(r0, r8, r9, r10)
            goto Lcf
        Ldf:
            return
    }

    public final void b(a.O3 r25) {
            r24 = this;
            r0 = r25
            java.util.ArrayList<a.N3> r1 = r0.e0
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L305
            java.lang.Object r2 = r1.next()
            r4 = r2
            a.N3 r4 = (a.N3) r4
            a.N3$a[] r2 = r4.J
            r3 = 0
            r5 = r2[r3]
            r9 = 1
            r2 = r2[r9]
            int r6 = r4.X
            r7 = 8
            if (r6 != r7) goto L26
            r4.f180a = r9
            goto L8
        L26:
            float r6 = r4.o
            r10 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            a.N3$a r8 = a.N3.a.c
            r11 = 2
            if (r7 >= 0) goto L35
            if (r5 != r8) goto L35
            r4.j = r11
        L35:
            float r7 = r4.r
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 >= 0) goto L3f
            if (r2 != r8) goto L3f
            r4.k = r11
        L3f:
            float r12 = r4.N
            r13 = 0
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            a.N3$a r13 = a.N3.a.b
            a.N3$a r14 = a.N3.a.f181a
            r15 = 3
            if (r12 <= 0) goto L6d
            if (r5 != r8) goto L54
            if (r2 == r13) goto L51
            if (r2 != r14) goto L54
        L51:
            r4.j = r15
            goto L6d
        L54:
            if (r2 != r8) goto L5d
            if (r5 == r13) goto L5a
            if (r5 != r14) goto L5d
        L5a:
            r4.k = r15
            goto L6d
        L5d:
            if (r5 != r8) goto L6d
            if (r2 != r8) goto L6d
            int r12 = r4.j
            if (r12 != 0) goto L67
            r4.j = r15
        L67:
            int r12 = r4.k
            if (r12 != 0) goto L6d
            r4.k = r15
        L6d:
            a.M3 r12 = r4.A
            r16 = r3
            a.M3 r3 = r4.y
            r17 = r10
            if (r5 != r8) goto L84
            int r10 = r4.j
            if (r10 != r9) goto L84
            a.M3 r10 = r3.d
            if (r10 == 0) goto L83
            a.M3 r10 = r12.d
            if (r10 != 0) goto L84
        L83:
            r5 = r13
        L84:
            a.M3 r10 = r4.B
            a.M3 r11 = r4.z
            if (r2 != r8) goto L97
            int r15 = r4.k
            if (r15 != r9) goto L97
            a.M3 r15 = r11.d
            if (r15 == 0) goto L96
            a.M3 r15 = r10.d
            if (r15 != 0) goto L97
        L96:
            r2 = r13
        L97:
            a.K8 r15 = r4.d
            r15.d = r5
            int r9 = r4.j
            r15.f516a = r9
            r21 = r6
            a.og r6 = r4.e
            r6.d = r2
            r22 = r1
            int r1 = r4.k
            r6.f516a = r1
            r23 = r6
            a.N3$a r6 = a.N3.a.d
            if (r5 == r6) goto Lb5
            if (r5 == r14) goto Lb5
            if (r5 != r13) goto Lc0
        Lb5:
            if (r2 == r6) goto Lbb
            if (r2 == r14) goto Lbb
            if (r2 != r13) goto Lc0
        Lbb:
            r7 = r2
            r13 = r23
            goto L2c5
        Lc0:
            a.N3$a[] r3 = r0.J
            a.M3[] r10 = r4.G
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r5 != r8) goto Lce
            if (r2 == r13) goto Lcc
            if (r2 != r14) goto Lce
        Lcc:
            r12 = 3
            goto Ld9
        Lce:
            r12 = r11
            r11 = r5
            r5 = r13
            r13 = r23
            r23 = r12
            r12 = r7
            r7 = r2
            goto L190
        Ld9:
            if (r9 != r12) goto L115
            if (r2 != r13) goto Le9
            r8 = 0
            r6 = 0
            r7 = r13
            r3 = r24
            r5 = r13
            r13 = r23
            r3.f(r4, r5, r6, r7, r8)
            goto Leb
        Le9:
            r13 = r23
        Leb:
            int r8 = r4.i()
            float r1 = (float) r8
            float r2 = r4.N
            float r1 = r1 * r2
            float r1 = r1 + r11
            int r6 = (int) r1
            r7 = r14
            r3 = r24
            r5 = r14
            r3.f(r4, r5, r6, r7, r8)
            a.l5 r1 = r15.e
            int r2 = r4.l()
            r1.d(r2)
            a.l5 r1 = r13.e
            int r2 = r4.i()
            r1.d(r2)
            r12 = 1
            r4.f180a = r12
        L111:
            r1 = r22
            goto L8
        L115:
            r12 = r11
            r11 = r5
            r5 = r13
            r13 = r23
            r23 = r12
            r12 = 1
            if (r9 != r12) goto L130
            r6 = 0
            r8 = 0
            r3 = r24
            r7 = r2
            r3.f(r4, r5, r6, r7, r8)
            a.l5 r1 = r15.e
            int r2 = r4.l()
            r1.m = r2
            goto L111
        L130:
            r12 = r7
            r7 = r2
            r2 = 2
            if (r9 != r2) goto L165
            r2 = r3[r16]
            if (r2 == r14) goto L13b
            if (r2 != r6) goto L190
        L13b:
            int r1 = r0.l()
            float r1 = (float) r1
            float r6 = r21 * r1
            float r6 = r6 + r23
            int r6 = (int) r6
            int r8 = r4.i()
            r3 = r24
            r5 = r14
            r3.f(r4, r5, r6, r7, r8)
            a.l5 r1 = r15.e
            int r2 = r4.l()
            r1.d(r2)
            a.l5 r1 = r13.e
            int r2 = r4.i()
            r1.d(r2)
            r2 = 1
            r4.f180a = r2
            goto L111
        L165:
            r20 = 1
            r2 = r10[r16]
            a.M3 r2 = r2.d
            if (r2 == 0) goto L173
            r2 = r10[r20]
            a.M3 r2 = r2.d
            if (r2 != 0) goto L190
        L173:
            r6 = 0
            r8 = 0
            r3 = r24
            r3.f(r4, r5, r6, r7, r8)
            a.l5 r1 = r15.e
            int r2 = r4.l()
            r1.d(r2)
            a.l5 r1 = r13.e
            int r2 = r4.i()
            r1.d(r2)
            r2 = 1
            r4.f180a = r2
            goto L111
        L190:
            if (r7 != r8) goto L198
            if (r11 == r5) goto L196
            if (r11 != r14) goto L198
        L196:
            r2 = 3
            goto L19e
        L198:
            r2 = r11
            r11 = r5
            r5 = r2
        L19b:
            r2 = 1
            goto L25e
        L19e:
            if (r1 != r2) goto L1da
            if (r11 != r5) goto L1aa
            r8 = 0
            r6 = 0
            r7 = r5
            r3 = r24
            r3.f(r4, r5, r6, r7, r8)
        L1aa:
            int r6 = r4.l()
            float r1 = r4.N
            int r2 = r4.O
            r3 = -1
            if (r2 != r3) goto L1b7
            float r1 = r17 / r1
        L1b7:
            float r2 = (float) r6
            float r2 = r2 * r1
            float r2 = r2 + r23
            int r8 = (int) r2
            r7 = r14
            r3 = r24
            r5 = r14
            r3.f(r4, r5, r6, r7, r8)
            a.l5 r1 = r15.e
            int r2 = r4.l()
            r1.d(r2)
            a.l5 r1 = r13.e
            int r2 = r4.i()
            r1.d(r2)
            r2 = 1
            r4.f180a = r2
            goto L111
        L1da:
            r2 = 1
            if (r1 != r2) goto L1f0
            r8 = 0
            r6 = 0
            r3 = r24
            r7 = r5
            r5 = r11
            r3.f(r4, r5, r6, r7, r8)
            a.l5 r1 = r13.e
            int r2 = r4.i()
            r1.m = r2
            goto L111
        L1f0:
            r17 = r11
            r11 = r5
            r5 = 2
            if (r1 != r5) goto L22d
            r5 = r3[r2]
            if (r5 == r14) goto L200
            if (r5 != r6) goto L1fd
            goto L200
        L1fd:
            r5 = r17
            goto L19b
        L200:
            int r6 = r4.l()
            int r1 = r0.i()
            float r1 = (float) r1
            float r7 = r12 * r1
            float r7 = r7 + r23
            int r8 = (int) r7
            r3 = r24
            r7 = r14
            r5 = r17
            r3.f(r4, r5, r6, r7, r8)
            a.l5 r1 = r15.e
            int r2 = r4.l()
            r1.d(r2)
            a.l5 r1 = r13.e
            int r2 = r4.i()
            r1.d(r2)
            r2 = 1
            r4.f180a = r2
            goto L111
        L22d:
            r18 = r5
            r5 = r17
            r2 = r10[r18]
            a.M3 r2 = r2.d
            if (r2 == 0) goto L23f
            r19 = 3
            r2 = r10[r19]
            a.M3 r2 = r2.d
            if (r2 != 0) goto L19b
        L23f:
            r6 = 0
            r8 = 0
            r3 = r24
            r5 = r11
            r3.f(r4, r5, r6, r7, r8)
            a.l5 r1 = r15.e
            int r2 = r4.l()
            r1.d(r2)
            a.l5 r1 = r13.e
            int r2 = r4.i()
            r1.d(r2)
            r2 = 1
            r4.f180a = r2
            goto L111
        L25e:
            if (r5 != r8) goto L111
            if (r7 != r8) goto L111
            if (r9 == r2) goto L2aa
            if (r1 != r2) goto L267
            goto L2aa
        L267:
            r5 = 2
            if (r1 != r5) goto L111
            if (r9 != r5) goto L111
            r1 = r3[r16]
            if (r1 == r14) goto L272
            if (r1 != r14) goto L111
        L272:
            r1 = r3[r2]
            if (r1 == r14) goto L278
            if (r1 != r14) goto L111
        L278:
            int r1 = r0.l()
            float r1 = (float) r1
            float r6 = r21 * r1
            float r6 = r6 + r23
            int r6 = (int) r6
            int r1 = r0.i()
            float r1 = (float) r1
            float r7 = r12 * r1
            float r7 = r7 + r23
            int r8 = (int) r7
            r7 = r14
            r3 = r24
            r5 = r14
            r3.f(r4, r5, r6, r7, r8)
            a.l5 r1 = r15.e
            int r2 = r4.l()
            r1.d(r2)
            a.l5 r1 = r13.e
            int r2 = r4.i()
            r1.d(r2)
            r2 = 1
            r4.f180a = r2
            goto L111
        L2aa:
            r8 = 0
            r6 = 0
            r7 = r11
            r3 = r24
            r5 = r11
            r3.f(r4, r5, r6, r7, r8)
            a.l5 r1 = r15.e
            int r2 = r4.l()
            r1.m = r2
            a.l5 r1 = r13.e
            int r2 = r4.i()
            r1.m = r2
            goto L111
        L2c5:
            int r1 = r4.l()
            if (r5 != r6) goto L2d6
            int r1 = r0.l()
            int r2 = r3.e
            int r1 = r1 - r2
            int r2 = r12.e
            int r1 = r1 - r2
            r5 = r14
        L2d6:
            int r2 = r4.i()
            if (r7 != r6) goto L2e7
            int r2 = r0.i()
            int r3 = r11.e
            int r2 = r2 - r3
            int r3 = r10.e
            int r2 = r2 - r3
            r7 = r14
        L2e7:
            r3 = r24
            r6 = r1
            r8 = r2
            r3.f(r4, r5, r6, r7, r8)
            a.l5 r1 = r15.e
            int r2 = r4.l()
            r1.d(r2)
            a.l5 r1 = r13.e
            int r2 = r4.i()
            r1.d(r2)
            r2 = 1
            r4.f180a = r2
            goto L111
        L305:
            return
    }

    public final void c() {
            r8 = this;
            java.util.ArrayList<a.ih> r0 = r8.e
            r0.clear()
            a.O3 r1 = r8.d
            a.K8 r2 = r1.d
            r2.f()
            a.og r2 = r1.e
            r2.f()
            a.K8 r3 = r1.d
            r0.add(r3)
            r0.add(r2)
            java.util.ArrayList<a.N3> r2 = r1.e0
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L20:
            boolean r4 = r2.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L9e
            java.lang.Object r4 = r2.next()
            a.N3 r4 = (a.N3) r4
            boolean r7 = r4 instanceof a.C0046a8
            if (r7 == 0) goto L4b
            a.b8 r5 = new a.b8
            r5.<init>(r4)
            a.K8 r6 = r4.d
            r6.f()
            a.og r6 = r4.e
            r6.f()
            a.a8 r4 = (a.C0046a8) r4
            int r4 = r4.i0
            r5.f = r4
            r0.add(r5)
            goto L20
        L4b:
            boolean r7 = r4.q()
            if (r7 == 0) goto L69
            a.U2 r7 = r4.b
            if (r7 != 0) goto L5c
            a.U2 r7 = new a.U2
            r7.<init>(r4, r6)
            r4.b = r7
        L5c:
            if (r3 != 0) goto L63
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
        L63:
            a.U2 r6 = r4.b
            r3.add(r6)
            goto L6e
        L69:
            a.K8 r6 = r4.d
            r0.add(r6)
        L6e:
            boolean r6 = r4.r()
            if (r6 == 0) goto L8c
            a.U2 r6 = r4.c
            if (r6 != 0) goto L7f
            a.U2 r6 = new a.U2
            r6.<init>(r4, r5)
            r4.c = r6
        L7f:
            if (r3 != 0) goto L86
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
        L86:
            a.U2 r5 = r4.c
            r3.add(r5)
            goto L91
        L8c:
            a.og r5 = r4.e
            r0.add(r5)
        L91:
            boolean r5 = r4 instanceof a.C0138f8
            if (r5 == 0) goto L20
            a.e8 r5 = new a.e8
            r5.<init>(r4)
            r0.add(r5)
            goto L20
        L9e:
            if (r3 == 0) goto La3
            r0.addAll(r3)
        La3:
            java.util.Iterator r2 = r0.iterator()
        La7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb7
            java.lang.Object r3 = r2.next()
            a.ih r3 = (a.ih) r3
            r3.f()
            goto La7
        Lb7:
            java.util.Iterator r0 = r0.iterator()
        Lbb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Ld0
            java.lang.Object r2 = r0.next()
            a.ih r2 = (a.ih) r2
            a.N3 r3 = r2.b
            if (r3 != r1) goto Lcc
            goto Lbb
        Lcc:
            r2.d()
            goto Lbb
        Ld0:
            java.util.ArrayList<a.Dd> r0 = r8.h
            r0.clear()
            a.O3 r1 = r8.f286a
            a.K8 r2 = r1.d
            r8.e(r2, r6, r0)
            a.og r1 = r1.e
            r8.e(r1, r5, r0)
            r8.b = r6
            return
    }

    public final int d(a.O3 r20, int r21) {
            r19 = this;
            r0 = r20
            r1 = r19
            r2 = r21
            java.util.ArrayList<a.Dd> r3 = r1.h
            int r4 = r3.size()
            r7 = 0
            r8 = 0
        Lf:
            if (r7 >= r4) goto L112
            java.lang.Object r10 = r3.get(r7)
            a.Dd r10 = (a.Dd) r10
            a.ih r10 = r10.f60a
            boolean r11 = r10 instanceof a.U2
            if (r11 == 0) goto L2e
            r11 = r10
            a.U2 r11 = (a.U2) r11
            int r11 = r11.f
            if (r11 == r2) goto L3a
        L24:
            r18 = r3
            r16 = r4
            r17 = r7
            r0 = 0
            goto L102
        L2e:
            if (r2 != 0) goto L35
            boolean r11 = r10 instanceof a.K8
            if (r11 != 0) goto L3a
            goto L24
        L35:
            boolean r11 = r10 instanceof a.C0307og
            if (r11 != 0) goto L3a
            goto L24
        L3a:
            if (r2 != 0) goto L41
            a.K8 r11 = r0.d
        L3e:
            a.V4 r11 = r11.h
            goto L44
        L41:
            a.og r11 = r0.e
            goto L3e
        L44:
            if (r2 != 0) goto L4b
            a.K8 r12 = r0.d
        L48:
            a.V4 r12 = r12.i
            goto L4e
        L4b:
            a.og r12 = r0.e
            goto L48
        L4e:
            a.V4 r13 = r10.h
            java.util.ArrayList r13 = r13.l
            boolean r11 = r13.contains(r11)
            a.V4 r13 = r10.i
            java.util.ArrayList r14 = r13.l
            boolean r12 = r14.contains(r12)
            long r14 = r10.j()
            a.V4 r5 = r10.h
            if (r11 == 0) goto Lc9
            if (r12 == 0) goto Lc9
            r0 = 0
            long r11 = a.Dd.b(r5, r0)
            r6 = r3
            r16 = r4
            long r3 = a.Dd.a(r13, r0)
            long r11 = r11 - r14
            int r0 = r13.f
            int r1 = -r0
            r18 = r6
            r17 = r7
            long r6 = (long) r1
            int r1 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r1 < 0) goto L84
            long r0 = (long) r0
            long r11 = r11 + r0
        L84:
            long r0 = -r3
            long r0 = r0 - r14
            int r3 = r5.f
            long r3 = (long) r3
            long r0 = r0 - r3
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 < 0) goto L8f
            long r0 = r0 - r3
        L8f:
            a.N3 r3 = r10.b
            if (r2 != 0) goto L96
            float r3 = r3.U
            goto La1
        L96:
            r4 = 1
            if (r2 != r4) goto L9c
            float r3 = r3.V
            goto La1
        L9c:
            r3.getClass()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        La1:
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r4 <= 0) goto Lb1
            float r0 = (float) r0
            float r0 = r0 / r3
            float r1 = (float) r11
            float r4 = r6 - r3
            float r1 = r1 / r4
            float r1 = r1 + r0
            long r0 = (long) r1
            goto Lb3
        Lb1:
            r0 = 0
        Lb3:
            float r0 = (float) r0
            float r1 = r0 * r3
            r4 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r4
            long r10 = (long) r1
            float r6 = r6 - r3
            float r6 = r6 * r0
            float r6 = r6 + r4
            long r0 = (long) r6
            long r10 = r10 + r14
            long r10 = r10 + r0
            int r0 = r5.f
            long r0 = (long) r0
            long r0 = r0 + r10
            int r3 = r13.f
            long r3 = (long) r3
            long r0 = r0 - r3
            goto L102
        Lc9:
            r18 = r3
            r16 = r4
            r17 = r7
            if (r11 == 0) goto Le1
            int r0 = r5.f
            long r0 = (long) r0
            long r0 = a.Dd.b(r5, r0)
            int r3 = r5.f
            long r3 = (long) r3
            long r3 = r3 + r14
            long r0 = java.lang.Math.max(r0, r3)
            goto L102
        Le1:
            if (r12 == 0) goto Lf5
            int r0 = r13.f
            long r0 = (long) r0
            long r0 = a.Dd.a(r13, r0)
            int r3 = r13.f
            int r3 = -r3
            long r3 = (long) r3
            long r3 = r3 + r14
            long r0 = -r0
            long r0 = java.lang.Math.max(r0, r3)
            goto L102
        Lf5:
            int r0 = r5.f
            long r0 = (long) r0
            long r3 = r10.j()
            long r3 = r3 + r0
            int r0 = r13.f
            long r0 = (long) r0
            long r0 = r3 - r0
        L102:
            long r8 = java.lang.Math.max(r8, r0)
            int r7 = r17 + 1
            r1 = r19
            r0 = r20
            r4 = r16
            r3 = r18
            goto Lf
        L112:
            int r0 = (int) r8
            return r0
    }

    public final void e(a.ih r5, int r6, java.util.ArrayList<a.Dd> r7) {
            r4 = this;
            a.V4 r0 = r5.h
            java.util.ArrayList r0 = r0.k
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            a.V4 r2 = r5.i
            r3 = 0
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            a.T4 r1 = (a.T4) r1
            boolean r2 = r1 instanceof a.V4
            if (r2 == 0) goto L21
            a.V4 r1 = (a.V4) r1
            r4.a(r1, r6, r7, r3)
            goto L8
        L21:
            boolean r2 = r1 instanceof a.ih
            if (r2 == 0) goto L8
            a.ih r1 = (a.ih) r1
            a.V4 r1 = r1.h
            r4.a(r1, r6, r7, r3)
            goto L8
        L2d:
            java.util.ArrayList r0 = r2.k
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L55
            java.lang.Object r1 = r0.next()
            a.T4 r1 = (a.T4) r1
            boolean r2 = r1 instanceof a.V4
            if (r2 == 0) goto L49
            a.V4 r1 = (a.V4) r1
            r4.a(r1, r6, r7, r3)
            goto L33
        L49:
            boolean r2 = r1 instanceof a.ih
            if (r2 == 0) goto L33
            a.ih r1 = (a.ih) r1
            a.V4 r1 = r1.i
            r4.a(r1, r6, r7, r3)
            goto L33
        L55:
            r0 = 1
            if (r6 != r0) goto L78
            a.og r5 = (a.C0307og) r5
            a.V4 r5 = r5.k
            java.util.ArrayList r5 = r5.k
            java.util.Iterator r5 = r5.iterator()
        L62:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r5.next()
            a.T4 r0 = (a.T4) r0
            boolean r1 = r0 instanceof a.V4
            if (r1 == 0) goto L62
            a.V4 r0 = (a.V4) r0
            r4.a(r0, r6, r7, r3)
            goto L62
        L78:
            return
    }

    public final void f(a.N3 r2, a.N3.a r3, int r4, a.N3.a r5, int r6) {
            r1 = this;
            a.e2$a r0 = r1.g
            r0.f448a = r3
            r0.b = r5
            r0.c = r4
            r0.d = r6
            a.e2$b r3 = r1.f
            androidx.constraintlayout.widget.ConstraintLayout$b r3 = (androidx.constraintlayout.widget.ConstraintLayout.b) r3
            r3.a(r2, r0)
            int r3 = r0.e
            r2.y(r3)
            int r3 = r0.f
            r2.v(r3)
            boolean r3 = r0.h
            r2.w = r3
            int r3 = r0.g
            r2.R = r3
            if (r3 <= 0) goto L27
            r3 = 1
            goto L28
        L27:
            r3 = 0
        L28:
            r2.w = r3
            return
    }

    public final void g() {
            r17 = this;
            r0 = r17
            a.O3 r1 = r0.f286a
            java.util.ArrayList<a.N3> r1 = r1.e0
            java.util.Iterator r6 = r1.iterator()
        La:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lb7
            java.lang.Object r1 = r6.next()
            a.N3 r1 = (a.N3) r1
            boolean r2 = r1.f180a
            if (r2 == 0) goto L1b
            goto La
        L1b:
            a.N3$a[] r2 = r1.J
            r3 = 0
            r7 = r2[r3]
            r8 = 1
            r9 = r2[r8]
            int r2 = r1.j
            int r4 = r1.k
            a.N3$a r5 = a.N3.a.b
            a.N3$a r10 = a.N3.a.c
            if (r7 == r5) goto L34
            if (r7 != r10) goto L32
            if (r2 != r8) goto L32
            goto L34
        L32:
            r2 = r3
            goto L35
        L34:
            r2 = r8
        L35:
            if (r9 == r5) goto L3b
            if (r9 != r10) goto L3c
            if (r4 != r8) goto L3c
        L3b:
            r3 = r8
        L3c:
            a.K8 r11 = r1.d
            a.l5 r4 = r11.e
            boolean r12 = r4.j
            a.og r13 = r1.e
            a.l5 r14 = r13.e
            boolean r15 = r14.j
            r16 = r2
            a.N3$a r2 = a.N3.a.f181a
            if (r12 == 0) goto L5b
            if (r15 == 0) goto L5b
            int r3 = r4.g
            int r5 = r14.g
            r4 = r2
            r0.f(r1, r2, r3, r4, r5)
            r1.f180a = r8
            goto La6
        L5b:
            if (r12 == 0) goto L80
            if (r3 == 0) goto L80
            int r3 = r4.g
            r4 = r5
            int r5 = r14.g
            r0 = r17
            r0.f(r1, r2, r3, r4, r5)
            if (r9 != r10) goto L74
            a.l5 r0 = r13.e
            int r2 = r1.i()
            r0.m = r2
            goto La6
        L74:
            a.l5 r0 = r13.e
            int r2 = r1.i()
            r0.d(r2)
            r1.f180a = r8
            goto La6
        L80:
            r0 = r2
            r2 = r5
            if (r15 == 0) goto La6
            if (r16 == 0) goto La6
            int r3 = r4.g
            int r5 = r14.g
            r4 = r0
            r0 = r17
            r0.f(r1, r2, r3, r4, r5)
            if (r7 != r10) goto L9b
            a.l5 r0 = r11.e
            int r2 = r1.l()
            r0.m = r2
            goto La6
        L9b:
            a.l5 r0 = r11.e
            int r2 = r1.l()
            r0.d(r2)
            r1.f180a = r8
        La6:
            boolean r0 = r1.f180a
            if (r0 == 0) goto Lb3
            a.d2 r0 = r13.l
            if (r0 == 0) goto Lb3
            int r1 = r1.R
            r0.d(r1)
        Lb3:
            r0 = r17
            goto La
        Lb7:
            return
    }
}
