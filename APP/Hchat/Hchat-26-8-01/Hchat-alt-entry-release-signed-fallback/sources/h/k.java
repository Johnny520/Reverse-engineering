package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f4707a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4708b = 0;

    static {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            long r0 = (long) r0
            r2 = 32
            long r2 = r0 << r2
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            h.k.f4707a = r0
            return
    }

    public static final void a(i.k1 r19, y0.o r20, fg.l r21, fg.l r22, s0.d r23, i0.h0 r24, int r25) {
            r1 = r19
            r7 = r20
            r3 = r21
            r8 = r22
            r9 = r24
            r10 = r25
            y0.g r0 = y0.b.f21792g
            r2 = 511725103(0x1e804e2f, float:1.3584863E-20)
            r9.b0(r2)
            boolean r2 = r9.f(r1)
            r4 = 4
            if (r2 == 0) goto L1d
            r2 = r4
            goto L1e
        L1d:
            r2 = 2
        L1e:
            r2 = r2 | r10
            r5 = r10 & 48
            if (r5 != 0) goto L2f
            boolean r5 = r9.f(r7)
            if (r5 == 0) goto L2c
            r5 = 32
            goto L2e
        L2c:
            r5 = 16
        L2e:
            r2 = r2 | r5
        L2f:
            r5 = r10 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L3f
            boolean r5 = r9.h(r3)
            if (r5 == 0) goto L3c
            r5 = 256(0x100, float:3.59E-43)
            goto L3e
        L3c:
            r5 = 128(0x80, float:1.8E-43)
        L3e:
            r2 = r2 | r5
        L3f:
            r5 = r10 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L4f
            boolean r0 = r9.f(r0)
            if (r0 == 0) goto L4c
            r0 = 2048(0x800, float:2.87E-42)
            goto L4e
        L4c:
            r0 = 1024(0x400, float:1.435E-42)
        L4e:
            r2 = r2 | r0
        L4f:
            r0 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L5f
            boolean r0 = r9.h(r8)
            if (r0 == 0) goto L5c
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L5e
        L5c:
            r0 = 8192(0x2000, float:1.148E-41)
        L5e:
            r2 = r2 | r0
        L5f:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r10
            r5 = r23
            if (r0 != 0) goto L72
            boolean r0 = r9.h(r5)
            if (r0 == 0) goto L6f
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L71
        L6f:
            r0 = 65536(0x10000, float:9.1835E-41)
        L71:
            r2 = r2 | r0
        L72:
            r0 = 74899(0x12493, float:1.04956E-40)
            r0 = r0 & r2
            r6 = 74898(0x12492, float:1.04954E-40)
            r11 = 1
            r12 = 0
            if (r0 == r6) goto L7f
            r0 = r11
            goto L80
        L7f:
            r0 = r12
        L80:
            r6 = r2 & 1
            boolean r0 = r9.S(r6, r0)
            if (r0 == 0) goto L35b
            i0.m2 r0 = y1.h1.f21952n
            java.lang.Object r0 = r9.j(r0)
            u2.m r0 = (u2.m) r0
            r0 = r2 & 14
            if (r0 != r4) goto L96
            r2 = r11
            goto L97
        L96:
            r2 = r12
        L97:
            java.lang.Object r6 = r9.P()
            i0.e r13 = i0.l.f5952a
            if (r2 != 0) goto La1
            if (r6 != r13) goto La9
        La1:
            h.t r6 = new h.t
            r6.<init>(r1)
            r9.k0(r6)
        La9:
            h.t r6 = (h.t) r6
            if (r0 != r4) goto Laf
            r2 = r11
            goto Lb0
        Laf:
            r2 = r12
        Lb0:
            java.lang.Object r14 = r9.P()
            if (r2 != 0) goto Lb8
            if (r14 != r13) goto Lcf
        Lb8:
            java.lang.Object r2 = r1.c()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            w0.p r14 = new w0.p
            r14.<init>()
            java.util.List r2 = tf.l.L0(r2)
            r14.addAll(r2)
            r9.k0(r14)
        Lcf:
            w0.p r14 = (w0.p) r14
            if (r0 != r4) goto Ld5
            r0 = r11
            goto Ld6
        Ld5:
            r0 = r12
        Ld6:
            java.lang.Object r2 = r9.P()
            if (r0 != 0) goto Lde
            if (r2 != r13) goto Le8
        Lde:
            long[] r0 = f.r0.f2895a
            f.k0 r2 = new f.k0
            r2.<init>()
            r9.k0(r2)
        Le8:
            r15 = r2
            f.k0 r15 = (f.k0) r15
            java.lang.Object r0 = r1.c()
            i0.j1 r2 = r1.f5710d
            boolean r0 = r14.contains(r0)
            if (r0 != 0) goto L101
            r14.clear()
            java.lang.Object r0 = r1.c()
            r14.add(r0)
        L101:
            java.lang.Object r0 = r1.c()
            java.lang.Object r4 = r2.getValue()
            boolean r0 = gg.l.a(r0, r4)
            if (r0 == 0) goto L141
            int r0 = r14.size()
            if (r0 != r11) goto L123
            java.lang.Object r0 = r14.get(r12)
            java.lang.Object r4 = r1.c()
            boolean r0 = gg.l.a(r0, r4)
            if (r0 != 0) goto L12d
        L123:
            r14.clear()
            java.lang.Object r0 = r1.c()
            r14.add(r0)
        L12d:
            int r0 = r15.f2852e
            if (r0 != r11) goto L13b
            java.lang.Object r0 = r1.c()
            boolean r0 = r15.c(r0)
            if (r0 == 0) goto L13e
        L13b:
            r15.a()
        L13e:
            r6.getClass()
        L141:
            java.lang.Object r0 = r1.c()
            java.lang.Object r4 = r2.getValue()
            boolean r0 = gg.l.a(r0, r4)
            if (r0 != 0) goto L198
            java.lang.Object r0 = r2.getValue()
            boolean r0 = r14.contains(r0)
            if (r0 != 0) goto L198
            java.util.ListIterator r0 = r14.listIterator()
            r4 = r12
        L15e:
            r16 = r0
            uf.a r16 = (uf.a) r16
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L185
            java.lang.Object r12 = r16.next()
            java.lang.Object r12 = r8.invoke(r12)
            java.lang.Object r11 = r2.getValue()
            java.lang.Object r11 = r8.invoke(r11)
            boolean r11 = gg.l.a(r12, r11)
            if (r11 == 0) goto L180
        L17e:
            r0 = -1
            goto L187
        L180:
            int r4 = r4 + 1
            r11 = 1
            r12 = 0
            goto L15e
        L185:
            r4 = -1
            goto L17e
        L187:
            if (r4 != r0) goto L191
            java.lang.Object r0 = r2.getValue()
            r14.add(r0)
            goto L198
        L191:
            java.lang.Object r0 = r2.getValue()
            r14.set(r4, r0)
        L198:
            java.lang.Object r0 = r2.getValue()
            boolean r0 = r15.c(r0)
            if (r0 == 0) goto L1bb
            java.lang.Object r0 = r1.c()
            boolean r0 = r15.c(r0)
            if (r0 != 0) goto L1ad
            goto L1bb
        L1ad:
            r0 = 1968995539(0x755c7cd3, float:2.7950123E32)
            r9.a0(r0)
            r0 = 0
            r9.p(r0)
            r5 = r14
            r14 = r6
            r6 = r3
            goto L1f3
        L1bb:
            r0 = 1966410449(0x75350ad1, float:2.2949832E32)
            r9.a0(r0)
            r15.a()
            int r11 = r14.size()
            r12 = 0
        L1c9:
            if (r12 >= r11) goto L1ec
            java.lang.Object r2 = r14.get(r12)
            h.h r0 = new h.h
            r4 = r6
            r6 = r5
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r6 = r3
            r14 = r4
            r1 = -23915175(0xfffffffffe931559, float:-9.775368E37)
            s0.d r0 = s0.i.e(r1, r0, r9)
            r15.m(r2, r0)
            int r12 = r12 + 1
            r1 = r19
            r6 = r14
            r14 = r5
            r5 = r23
            goto L1c9
        L1ec:
            r5 = r14
            r0 = 0
            r14 = r6
            r6 = r3
            r9.p(r0)
        L1f3:
            i.e1 r0 = r19.f()
            boolean r1 = r9.f(r14)
            boolean r0 = r9.f(r0)
            r0 = r0 | r1
            java.lang.Object r1 = r9.P()
            if (r0 != 0) goto L208
            if (r1 != r13) goto L212
        L208:
            java.lang.Object r0 = r6.invoke(r14)
            r1 = r0
            h.e0 r1 = (h.e0) r1
            r9.k0(r1)
        L212:
            h.e0 r1 = (h.e0) r1
            i.k1 r0 = r14.f4754a
            boolean r2 = r9.f(r14)
            java.lang.Object r3 = r9.P()
            if (r2 != 0) goto L222
            if (r3 != r13) goto L22b
        L222:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            i0.j1 r3 = i0.r.u(r2)
            r9.k0(r3)
        L22b:
            i0.a1 r3 = (i0.a1) r3
            h.e1 r1 = r1.f4653d
            i0.a1 r11 = i0.r.y(r1, r9)
            java.lang.Object r1 = r0.c()
            i0.j1 r0 = r0.f5710d
            java.lang.Object r0 = r0.getValue()
            boolean r0 = gg.l.a(r1, r0)
            if (r0 == 0) goto L249
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.setValue(r0)
            goto L254
        L249:
            java.lang.Object r0 = r11.getValue()
            if (r0 == 0) goto L254
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.setValue(r0)
        L254:
            java.lang.Object r0 = r3.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            y0.l r12 = y0.l.f21818a
            r1 = 0
            if (r0 == 0) goto L2a0
            r0 = 1353077497(0x50a652f9, float:2.2323644E10)
            r9.a0(r0)
            i.k1 r0 = r14.f4754a
            r2 = r1
            i.m1 r1 = i.d.f5635q
            r4 = 0
            r3 = r5
            r5 = 2
            r16 = r2
            r2 = 0
            r18 = r16
            r16 = r3
            r3 = r9
            r9 = r18
            i.d1 r1 = i.d.k(r0, r1, r2, r3, r4, r5)
            boolean r0 = r3.f(r1)
            java.lang.Object r2 = r3.P()
            if (r0 != 0) goto L28b
            if (r2 != r13) goto L298
        L28b:
            java.lang.Object r0 = r11.getValue()
            h.e1 r0 = (h.e1) r0
            y0.o r2 = c1.h.c(r12)
            r3.k0(r2)
        L298:
            r12 = r2
            y0.o r12 = (y0.o) r12
            r0 = 0
            r3.p(r0)
            goto L2af
        L2a0:
            r16 = r5
            r3 = r9
            r0 = 0
            r9 = r1
            r1 = 1353343539(0x50aa6233, float:2.2868498E10)
            r3.a0(r1)
            r3.p(r0)
            r1 = r9
        L2af:
            h.p r0 = new h.p
            r0.<init>(r1, r11, r14)
            y0.o r0 = r12.d(r0)
            y0.o r0 = r7.d(r0)
            java.lang.Object r1 = r3.P()
            if (r1 != r13) goto L2ca
            h.m r1 = new h.m
            r1.<init>(r14)
            r3.k0(r1)
        L2ca:
            h.m r1 = (h.m) r1
            long r4 = r3.T
            int r2 = java.lang.Long.hashCode(r4)
            s0.h r4 = r3.l()
            y0.o r0 = y0.a.c(r3, r0)
            x1.f r5 = x1.g.f20914f
            r5.getClass()
            x1.y r5 = x1.f.f20883b
            r3.d0()
            boolean r11 = r3.S
            if (r11 == 0) goto L2ec
            r3.k(r5)
            goto L2ef
        L2ec:
            r3.n0()
        L2ef:
            x1.e r5 = x1.f.f20886e
            i0.r.A(r5, r3, r1)
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r3, r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            x1.e r2 = x1.f.f20887f
            i0.r.t(r3, r1, r2)
            x1.d r1 = x1.f.f20888g
            i0.r.w(r1, r3)
            x1.e r1 = x1.f.f20884c
            i0.r.A(r1, r3, r0)
            r0 = -860173498(0xffffffffccbacb46, float:-9.793387E7)
            r3.a0(r0)
            int r0 = r16.size()
            r1 = 0
        L317:
            if (r1 >= r0) goto L352
            r5 = r16
            java.lang.Object r2 = r5.get(r1)
            r4 = -2026002954(0xffffffff873da5f6, float:-1.4267551E-34)
            java.lang.Object r11 = r8.invoke(r2)
            r12 = 0
            r3.W(r4, r11, r9, r12)
            java.lang.Object r2 = r15.g(r2)
            fg.p r2 = (fg.p) r2
            if (r2 != 0) goto L33c
            r2 = 1618454323(0x6077a733, float:7.1381152E19)
            r3.a0(r2)
        L338:
            r3.p(r12)
            goto L34a
        L33c:
            r4 = -2026001778(0xffffffff873daa8e, float:-1.4268901E-34)
            r3.a0(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r2.invoke(r3, r4)
            goto L338
        L34a:
            r3.p(r12)
            int r1 = r1 + 1
            r16 = r5
            goto L317
        L352:
            r12 = 0
            r3.p(r12)
            r0 = 1
            r3.p(r0)
            goto L360
        L35b:
            r6 = r3
            r3 = r9
            r3.V()
        L360:
            i0.r1 r9 = r3.t()
            if (r9 == 0) goto L375
            h.i r0 = new h.i
            r1 = r19
            r5 = r23
            r3 = r6
            r2 = r7
            r4 = r8
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.f6035d = r0
        L375:
            return
    }

    public static final void b(java.lang.Object r13, y0.o r14, fg.l r15, y0.c r16, java.lang.String r17, fg.l r18, s0.d r19, i0.h0 r20, int r21) {
            r5 = r17
            r11 = r20
            r0 = r21
            r1 = 1501828832(0x598416e0, float:4.647481E15)
            r11.b0(r1)
            r1 = r0 & 6
            if (r1 != 0) goto L24
            r1 = r0 & 8
            if (r1 != 0) goto L19
            boolean r1 = r11.f(r13)
            goto L1d
        L19:
            boolean r1 = r11.h(r13)
        L1d:
            if (r1 == 0) goto L21
            r1 = 4
            goto L22
        L21:
            r1 = 2
        L22:
            r1 = r1 | r0
            goto L25
        L24:
            r1 = r0
        L25:
            boolean r2 = r11.f(r14)
            if (r2 == 0) goto L2e
            r2 = 32
            goto L30
        L2e:
            r2 = 16
        L30:
            r1 = r1 | r2
            r2 = r0 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L41
            boolean r2 = r11.h(r15)
            if (r2 == 0) goto L3e
            r2 = 256(0x100, float:3.59E-43)
            goto L40
        L3e:
            r2 = 128(0x80, float:1.8E-43)
        L40:
            r1 = r1 | r2
        L41:
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r2 = r0 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L53
            boolean r2 = r11.f(r5)
            if (r2 == 0) goto L50
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L52
        L50:
            r2 = 8192(0x2000, float:1.148E-41)
        L52:
            r1 = r1 | r2
        L53:
            r2 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r2
            r2 = 599187(0x92493, float:8.3964E-40)
            r2 = r2 & r1
            r3 = 599186(0x92492, float:8.39638E-40)
            if (r2 == r3) goto L61
            r2 = 1
            goto L62
        L61:
            r2 = 0
        L62:
            r3 = r1 & 1
            boolean r2 = r11.S(r3, r2)
            if (r2 == 0) goto L98
            y0.g r2 = y0.b.f21792g
            java.lang.Object r3 = r11.P()
            i0.e r4 = i0.l.f5952a
            if (r3 != r4) goto L79
            h.c r3 = h.c.f4620h
            r11.k0(r3)
        L79:
            r9 = r3
            fg.l r9 = (fg.l) r9
            r3 = r1 & 14
            int r4 = r1 >> 9
            r4 = r4 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            i.k1 r6 = i.d.r(r13, r5, r11, r3)
            r1 = r1 & 8176(0x1ff0, float:1.1457E-41)
            r3 = 221184(0x36000, float:3.09945E-40)
            r12 = r1 | r3
            r7 = r14
            r8 = r15
            r10 = r19
            a(r6, r7, r8, r9, r10, r11, r12)
            r4 = r2
            r6 = r9
            goto L9f
        L98:
            r20.V()
            r4 = r16
            r6 = r18
        L9f:
            i0.r1 r9 = r20.t()
            if (r9 == 0) goto Lb3
            h.d r0 = new h.d
            r1 = r13
            r2 = r14
            r3 = r15
            r7 = r19
            r8 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f6035d = r0
        Lb3:
            return
    }
}
