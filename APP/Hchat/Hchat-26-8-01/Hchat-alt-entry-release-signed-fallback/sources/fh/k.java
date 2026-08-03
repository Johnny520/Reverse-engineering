package fh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends x6.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public gh.c f3950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public fh.a f3951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public fh.a f3952i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fh.j f3953j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.util.List f3954k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.util.ArrayList f3955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public fh.l f3956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public fh.l f3957n;

    public k(java.lang.reflect.Method r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r4 = kh.b.b(r4)
            lh.d r0 = new lh.d
            r0.<init>(r4)
            java.lang.String r4 = r0.f8064h
            r4.getClass()
            gh.c r1 = new gh.c
            r2 = 5
            r1.<init>(r4, r2)
            r3.f3950g = r1
            r4 = 6
            r4 = r4 & 2
            if (r4 == 0) goto L20
            r4 = 5
            goto L21
        L20:
            r4 = 0
        L21:
            java.lang.String r1 = r0.f8063g
            r3.l0(r4, r1)
            java.lang.String r4 = r0.f8066j
            q0(r3, r4)
            java.util.ArrayList r4 = r0.f8065i
            r4.getClass()
            fh.j r0 = new fh.j
            r1 = 1
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            tf.t r2 = tf.t.f13167g
            r1.<init>(r2)
            r0.f3948h = r1
            java.util.Iterator r4 = r4.iterator()
        L43:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L5a
            fh.m r2 = new fh.m
            r2.<init>()
            fh.m.k0(r2, r1)
            goto L5b
        L5a:
            r2 = 0
        L5b:
            r0.k0(r2)
            goto L43
        L5f:
            r3.f3953j = r0
            return
    }

    public static void q0(fh.k r2, java.lang.String r3) {
            r3.getClass()
            fh.a r0 = new fh.a
            r0.<init>()
            r1 = 5
            r0.m0(r1, r3)
            r2.f3952i = r0
            return
    }

    public static void u0(fh.k r4, java.util.Collection r5) {
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r5)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            gh.c r2 = new gh.c
            r3 = 1
            r2.<init>(r1, r3)
            r0.add(r2)
            goto L12
        L28:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            r4.f3954k = r5
            return
    }

    @Override // x6.d
    public final int G(g6.b r15) {
            r14 = this;
            gh.c r0 = r14.f3950g
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.G(r15)
            goto Lb
        La:
            r0 = r1
        Lb:
            fh.a r2 = r14.f3951h
            if (r2 == 0) goto L14
            int r2 = r2.G(r15)
            goto L15
        L14:
            r2 = r1
        L15:
            fh.a r3 = r14.f3952i
            if (r3 == 0) goto L1e
            int r3 = r3.G(r15)
            goto L1f
        L1e:
            r3 = r1
        L1f:
            fh.j r4 = r14.f3953j
            if (r4 == 0) goto L28
            int r4 = r4.G(r15)
            goto L29
        L28:
            r4 = r1
        L29:
            java.util.List r5 = r14.f3954k
            if (r5 == 0) goto L5b
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = tf.n.e1(r5)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L3a:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L52
            java.lang.Object r7 = r5.next()
            gh.c r7 = (gh.c) r7
            int r7 = r7.G(r15)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.add(r7)
            goto L3a
        L52:
            int[] r5 = tf.m.O1(r6)
            int r5 = r15.f(r5)
            goto L5c
        L5b:
            r5 = r1
        L5c:
            java.util.ArrayList r6 = r14.f3955l
            r7 = -1
            r8 = 1
            if (r6 == 0) goto Lcc
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = tf.n.e1(r6)
            r9.<init>(r10)
            java.util.Iterator r6 = r6.iterator()
        L6f:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L9a
            java.lang.Object r10 = r6.next()
            gh.b r10 = (gh.b) r10
            int r10 = r10.f4569b
            if (r10 == 0) goto L98
            switch(r10) {
                case 1: goto L8e;
                case 2: goto L8c;
                case 3: goto L8a;
                case 4: goto L88;
                case 5: goto L86;
                case 6: goto L84;
                default: goto L82;
            }
        L82:
            r15 = 0
            throw r15
        L84:
            r10 = 6
            goto L8f
        L86:
            r10 = 5
            goto L8f
        L88:
            r10 = 4
            goto L8f
        L8a:
            r10 = 3
            goto L8f
        L8c:
            r10 = 2
            goto L8f
        L8e:
            r10 = 1
        L8f:
            sf.l r11 = new sf.l
            r11.<init>(r10)
            r9.add(r11)
            goto L6f
        L98:
            r15 = 0
            throw r15
        L9a:
            int r6 = r9.size()
            byte[] r10 = new byte[r6]
            java.util.Iterator r9 = r9.iterator()
            r11 = r1
        La5:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto Lb9
            java.lang.Object r12 = r9.next()
            sf.l r12 = (sf.l) r12
            byte r12 = r12.f12431g
            int r13 = r11 + 1
            r10[r11] = r12
            r11 = r13
            goto La5
        Lb9:
            r15.o(r8, r6, r8)
            int r6 = r6 - r8
        Lbd:
            if (r7 >= r6) goto Lc7
            r9 = r10[r6]
            r15.a(r9)
            int r6 = r6 + (-1)
            goto Lbd
        Lc7:
            int r6 = r15.h()
            goto Lcd
        Lcc:
            r6 = r1
        Lcd:
            java.util.ArrayList r9 = r14.f3955l
            r10 = 4
            if (r9 == 0) goto L115
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = tf.n.e1(r9)
            r11.<init>(r12)
            java.util.Iterator r9 = r9.iterator()
        Ldf:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto Lfc
            java.lang.Object r12 = r9.next()
            gh.b r12 = (gh.b) r12
            fh.b r12 = r12.f4568a
            r12.getClass()
            int r12 = r12.G(r15)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.add(r12)
            goto Ldf
        Lfc:
            int[] r9 = tf.m.O1(r11)
            int r11 = r9.length
            r15.o(r10, r11, r10)
            int r11 = r9.length
            int r11 = r11 - r8
        L106:
            if (r7 >= r11) goto L110
            r12 = r9[r11]
            r15.b(r12)
            int r11 = r11 + (-1)
            goto L106
        L110:
            int r7 = r15.h()
            goto L116
        L115:
            r7 = r1
        L116:
            fh.l r9 = r14.f3956m
            if (r9 == 0) goto L11f
            int r9 = r9.G(r15)
            goto L120
        L11f:
            r9 = r1
        L120:
            fh.l r11 = r14.f3957n
            if (r11 == 0) goto L129
            int r11 = r11.G(r15)
            goto L12a
        L129:
            r11 = r1
        L12a:
            r12 = 13
            r15.n(r12)
            r12 = 12
            r15.c(r12, r11)
            r11 = 11
            r15.c(r11, r9)
            r9 = 10
            r15.c(r9, r7)
            r7 = 9
            r15.c(r7, r6)
            r6 = 8
            r15.c(r6, r1)
            r6 = 7
            r15.c(r6, r5)
            r5 = 6
            r15.c(r5, r1)
            r5 = 5
            r15.c(r5, r1)
            r15.c(r10, r4)
            r4 = 3
            r15.c(r4, r3)
            r3 = 2
            r15.c(r3, r2)
            r15.c(r8, r1)
            r15.c(r1, r0)
            int r0 = r15.g()
            r15.i(r0)
            return r0
    }

    public final void k0(java.lang.Class r5) {
            r4 = this;
            fh.j r0 = r4.f3953j
            if (r0 != 0) goto La
            fh.j r0 = new fh.j
            r1 = 1
            r0.<init>(r1)
        La:
            r4.f3953j = r0
            if (r5 == 0) goto L23
            fh.m r1 = new fh.m
            r1.<init>()
            fh.a r2 = new fh.a
            r2.<init>()
            java.lang.String r5 = kh.b.d(r5)
            r3 = 5
            r2.m0(r3, r5)
            r1.f3959g = r2
            goto L24
        L23:
            r1 = 0
        L24:
            r0.k0(r1)
            return
    }

    public final void l0(int r2, java.lang.String r3) {
            r1 = this;
            r3.getClass()
            if (r2 == 0) goto L10
            fh.a r0 = new fh.a
            r0.<init>()
            r0.m0(r2, r3)
            r1.f3951h = r0
            return
        L10:
            r2 = 0
            throw r2
    }

    public final void m0(int r3) {
            r2 = this;
            fh.j r0 = r2.f3953j
            if (r0 != 0) goto Lc
            fh.j r0 = new fh.j
            r1 = 1
            r0.<init>(r1)
            r2.f3953j = r0
        Lc:
            fh.j r0 = r2.f3953j
            r0.getClass()
            gh.a r1 = new gh.a
            r1.<init>(r3)
            r0.f3949i = r1
            return
    }

    public final void n0(java.lang.Class... r8) {
            r7 = this;
            fh.j r0 = new fh.j
            r1 = 1
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            tf.t r2 = tf.t.f13167g
            r1.<init>(r2)
            r0.f3948h = r1
            int r1 = r8.length
            r2 = 0
        L11:
            if (r2 >= r1) goto L33
            r3 = r8[r2]
            if (r3 == 0) goto L2c
            fh.m r4 = new fh.m
            r4.<init>()
            fh.a r5 = new fh.a
            r5.<init>()
            java.lang.String r3 = kh.b.d(r3)
            r6 = 5
            r5.m0(r6, r3)
            r4.f3959g = r5
            goto L2d
        L2c:
            r4 = 0
        L2d:
            r0.k0(r4)
            int r2 = r2 + 1
            goto L11
        L33:
            r7.f3953j = r0
            return
    }

    public final void o0(java.lang.String... r6) {
            r5 = this;
            fh.j r0 = new fh.j
            r1 = 1
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            tf.t r2 = tf.t.f13167g
            r1.<init>(r2)
            r0.f3948h = r1
            int r1 = r6.length
            r2 = 0
        L11:
            if (r2 >= r1) goto L27
            r3 = r6[r2]
            if (r3 == 0) goto L20
            fh.m r4 = new fh.m
            r4.<init>()
            fh.m.k0(r4, r3)
            goto L21
        L20:
            r4 = 0
        L21:
            r0.k0(r4)
            int r2 = r2 + 1
            goto L11
        L27:
            r5.f3953j = r0
            return
    }

    public final void p0(java.lang.Class r3) {
            r2 = this;
            r3.getClass()
            fh.a r0 = new fh.a
            r0.<init>()
            java.lang.String r3 = kh.b.d(r3)
            r1 = 5
            r0.m0(r1, r3)
            r2.f3952i = r0
            return
    }

    public final void r0(java.lang.String... r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L18
            r3 = r7[r2]
            gh.c r4 = new gh.c
            r5 = 5
            r4.<init>(r3, r5)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L18:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            r6.f3954k = r7
            return
    }

    public final void s0(java.lang.Number... r8) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r8.length
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L8c
            r3 = r8[r2]
            gh.b r4 = new gh.b
            r4.<init>()
            r3.getClass()
            boolean r5 = r3 instanceof java.lang.Byte
            if (r5 == 0) goto L27
            byte r3 = r3.byteValue()
            fh.c r5 = new fh.c
            r5.<init>(r3)
            r4.f4568a = r5
            r3 = 1
            r4.f4569b = r3
            goto L85
        L27:
            boolean r5 = r3 instanceof java.lang.Short
            if (r5 == 0) goto L3a
            short r3 = r3.shortValue()
            fh.h r5 = new fh.h
            r5.<init>(r3)
            r4.f4568a = r5
            r3 = 2
            r4.f4569b = r3
            goto L85
        L3a:
            boolean r5 = r3 instanceof java.lang.Integer
            if (r5 == 0) goto L4d
            int r3 = r3.intValue()
            fh.f r5 = new fh.f
            r5.<init>(r3)
            r4.f4568a = r5
            r3 = 3
            r4.f4569b = r3
            goto L85
        L4d:
            boolean r5 = r3 instanceof java.lang.Long
            if (r5 == 0) goto L60
            long r5 = r3.longValue()
            fh.g r3 = new fh.g
            r3.<init>(r5)
            r4.f4568a = r3
            r3 = 4
            r4.f4569b = r3
            goto L85
        L60:
            boolean r5 = r3 instanceof java.lang.Float
            if (r5 == 0) goto L73
            float r3 = r3.floatValue()
            fh.e r5 = new fh.e
            r5.<init>(r3)
            r4.f4568a = r5
            r3 = 5
            r4.f4569b = r3
            goto L85
        L73:
            boolean r5 = r3 instanceof java.lang.Double
            if (r5 == 0) goto L85
            double r5 = r3.doubleValue()
            fh.d r3 = new fh.d
            r3.<init>(r5)
            r4.f4568a = r3
            r3 = 6
            r4.f4569b = r3
        L85:
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L8c:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            r7.f3955l = r8
            return
    }

    public final void t0(java.util.List r1) {
            r0 = this;
            r1.getClass()
            u0(r0, r1)
            return
    }
}
