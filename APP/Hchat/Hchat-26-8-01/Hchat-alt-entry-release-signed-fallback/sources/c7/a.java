package c7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements java.io.Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i7.f f1031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c7.b[] f1032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1033i;

    public a(i7.f r22, int r23) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r0.f1033i = r2
            r0.<init>()
            r0.f1031g = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            d7.i r2 = new d7.i
            c7.g r3 = c7.g.f1048m
            r4 = 22
            r2.<init>(r4, r3)
            byte[] r3 = r1.a()
            int r5 = r3.length
            int r5 = r5 - r4
        L21:
            r6 = 0
            if (r5 < 0) goto L31
            r2.P(r3, r5, r6, r4)
            boolean r7 = r2.U()
            if (r7 == 0) goto L2e
            goto L31
        L2e:
            int r5 = r5 + (-1)
            goto L21
        L31:
            boolean r4 = r2.U()
            if (r4 == 0) goto L2e4
            byte[] r4 = r2.f11553k
            r7 = 16
            int r4 = k7.a.s(r4, r7)
            r8 = -1
            if (r4 != r8) goto L6d
            d7.h r4 = new d7.h
            c7.g r8 = c7.g.f1047l
            r9 = 1
            r10 = 20
            r4.<init>(r10, r8, r9)
            int r5 = r5 - r10
        L4d:
            if (r5 < 0) goto L5c
            r4.P(r3, r5, r6, r10)
            boolean r8 = r4.U()
            if (r8 == 0) goto L59
            goto L5c
        L59:
            int r5 = r5 + (-1)
            goto L4d
        L5c:
            boolean r3 = r4.U()
            if (r3 == 0) goto L65
            r2.f2045o = r4
            goto L6d
        L65:
            c7.c r1 = new c7.c
            java.lang.String r2 = "Failed to find zip64 locator"
            r1.<init>(r2)
            throw r1
        L6d:
            d7.h r3 = r2.f2045o
            r5 = 8
            if (r3 != 0) goto L74
            goto L95
        L74:
            d7.h r8 = new d7.h
            c7.g r9 = c7.g.f1046k
            r10 = 2
            r11 = 56
            r8.<init>(r11, r9, r10)
            byte[] r3 = r3.f11553k
            long r10 = k7.a.t(r3, r5)
            r12 = 56
            java.io.InputStream r3 = r1.b(r10, r12)
            r8.S(r3)
            boolean r3 = r8.U()
            if (r3 == 0) goto L2ae
            r2.f2046p = r8
        L95:
            d7.h r3 = r2.f2046p
            r8 = 48
            if (r3 == 0) goto La2
            byte[] r3 = r3.f11553k
            long r9 = k7.a.t(r3, r8)
            goto La6
        La2:
            long r9 = r2.N(r7)
        La6:
            r3 = 12
            long r11 = r2.N(r3)
            java.io.InputStream r9 = r1.b(r9, r11)
            r10 = 10
            int r10 = r2.O(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r10)
            d7.d r10 = new d7.d
            r10.<init>()
            r10.S(r9)
        Lc3:
            boolean r12 = r10.U()
            if (r12 == 0) goto Ld5
            r11.add(r10)
            d7.d r10 = new d7.d
            r10.<init>()
            r10.S(r9)
            goto Lc3
        Ld5:
            r9.close()
            long r9 = r2.N(r3)
            int r3 = r2.p()
            d7.h r12 = r2.f2045o
            if (r12 == 0) goto Le9
            int r12 = r12.p()
            int r3 = r3 + r12
        Le9:
            d7.h r12 = r2.f2046p
            if (r12 == 0) goto Lf4
            d7.h r12 = r2.f2045o
            int r12 = r12.p()
            int r3 = r3 + r12
        Lf4:
            long r12 = r1.c()
            long r14 = (long) r3
            long r12 = r12 - r14
            long r12 = r12 - r9
            r3 = 24
            long r9 = (long) r3
            long r12 = r12 - r9
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r17 = 24
            r23 = 4
            byte[] r4 = d7.n.f2054m
            r19 = 0
            if (r16 >= 0) goto L110
        L10d:
            r10 = r19
            goto L148
        L110:
            java.io.InputStream r9 = r1.b(r12, r9)
            d7.n r10 = new d7.n
            r10.<init>(r3)
            r10.M(r3, r6)
            r10.P(r4, r6, r5, r7)
            r10.S(r9)
            r9.close()
            byte[] r3 = r10.f11553k
            long r12 = k7.a.t(r3, r6)
            int r3 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r3 <= 0) goto L10d
            byte[] r3 = r10.f11553k
            int r9 = r3.length
            int r9 = r9 - r5
            if (r9 > 0) goto L138
            byte[] r3 = new byte[r6]
            goto L142
        L138:
            if (r7 <= r9) goto L13b
            goto L13c
        L13b:
            r9 = r7
        L13c:
            byte[] r12 = new byte[r9]
            java.lang.System.arraycopy(r3, r5, r12, r6, r9)
            r3 = r12
        L142:
            boolean r3 = r7.c.N(r4, r3)
            if (r3 == 0) goto L10d
        L148:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r9 = r11.size()
            int r9 = r9 + 2
            r3.<init>(r9)
            long r12 = r1.c()
            java.io.InputStream r9 = r1.b(r14, r12)
            java.util.Iterator r11 = r11.iterator()
            r12 = r6
        L160:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L228
            java.lang.Object r13 = r11.next()
            d7.d r13 = (d7.d) r13
            boolean r15 = r13.g0()
            if (r15 == 0) goto L185
            int r15 = r13.f2039o
            int r16 = r13.b0()
            int r16 = r16 + r15
            int r15 = r16 + 4
            r16 = 1
            byte[] r14 = r13.f11553k
            long r14 = k7.a.t(r14, r15)
            goto L18d
        L185:
            r16 = 1
            r14 = 42
            long r14 = r13.N(r14)
        L18d:
            r9.reset()
            long r14 = r9.skip(r14)
            d7.m r8 = new d7.m
            r20 = r5
            c7.g r5 = c7.g.f1044i
            r7 = 6
            r6 = 30
            r8.<init>(r6, r5, r7)
            r8.S(r9)
            boolean r5 = r8.U()
            if (r5 == 0) goto L1aa
            goto L1ac
        L1aa:
            r8 = r19
        L1ac:
            if (r8 == 0) goto L20f
            int r5 = r8.p()
            long r5 = (long) r5
            long r14 = r14 + r5
            r13.f2043s = r14
            r8.n0(r13)
            int r5 = r8.c0()
            if (r5 != 0) goto L1c4
            long r5 = r8.e0()
            goto L1c8
        L1c4:
            long r5 = r8.X()
        L1c8:
            r9.skip(r5)
            r8.s0()
            d7.h r5 = r8.f2052t
            if (r5 == 0) goto L1fe
            int r6 = r5.S(r9)
            int r5 = r5.p()
            if (r6 == r5) goto L1fe
            a5.a r5 = r8.f2041q
            int r6 = r5.f56h
            java.lang.Object r5 = r5.f57i
            d7.g r5 = (d7.g) r5
            r7 = 3
            byte[] r13 = r5.f11553k
            boolean r7 = k7.a.q(r13, r6, r7)
            if (r7 != 0) goto L1f2
            d7.h r7 = r8.f2052t
            if (r7 != 0) goto L1f2
            goto L1fe
        L1f2:
            byte[] r5 = r5.f11553k
            r7 = r5[r6]
            r7 = r7 & 247(0xf7, float:3.46E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            r8.s0()
        L1fe:
            r8.H(r12)
            r3.add(r8)
            int r12 = r12 + 1
            r5 = r20
            r6 = 0
            r7 = 16
            r8 = 48
            goto L160
        L20f:
            c7.c r1 = new c7.c
            java.lang.String r2 = "Error reading LFH at "
            java.lang.String r3 = ", for CEH = "
            java.lang.StringBuilder r2 = p.a.o(r14, r2, r3)
            java.lang.String r3 = r13.a0()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L228:
            r20 = r5
            r16 = 1
            if (r10 == 0) goto L28d
            byte[] r5 = r10.f11553k
            r6 = 0
            long r7 = k7.a.t(r5, r6)
            int r5 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r5 <= 0) goto L28d
            byte[] r5 = r10.f11553k
            int r7 = r5.length
            int r7 = r7 + (-8)
            if (r7 > 0) goto L243
            byte[] r5 = new byte[r6]
            goto L252
        L243:
            r8 = 16
            if (r8 <= r7) goto L248
            goto L24a
        L248:
            r7 = 16
        L24a:
            byte[] r8 = new byte[r7]
            r9 = r20
            java.lang.System.arraycopy(r5, r9, r8, r6, r7)
            r5 = r8
        L252:
            boolean r4 = r7.c.N(r4, r5)
            if (r4 == 0) goto L28d
            byte[] r4 = r10.f11553k
            long r4 = k7.a.t(r4, r6)
            r6 = 8
            long r4 = r4 + r6
            d7.h r6 = r2.f2046p
            if (r6 == 0) goto L26e
            byte[] r2 = r6.f11553k
            r6 = 48
            long r6 = k7.a.t(r2, r6)
            goto L274
        L26e:
            r8 = 16
            long r6 = r2.N(r8)
        L274:
            long r6 = r6 - r4
            d7.a r2 = new d7.a
            r8 = r16
            r2.<init>(r8)
            o7.g r8 = r2.f2051o
            r8.P(r10)
            q7.b r8 = new q7.b
            java.io.InputStream r1 = r1.b(r6, r4)
            r8.<init>(r1)
            r2.G(r8)
        L28d:
            int r1 = r3.size()
            c7.b[] r2 = new c7.b[r1]
            r6 = 0
        L294:
            if (r6 >= r1) goto L2ab
            java.lang.Object r4 = r3.get(r6)
            d7.m r4 = (d7.m) r4
            d7.d r5 = r4.f2053u
            if (r5 != 0) goto L2a1
            goto L2a8
        L2a1:
            c7.b r5 = new c7.b
            r5.<init>(r4)
            r2[r6] = r5
        L2a8:
            int r6 = r6 + 1
            goto L294
        L2ab:
            r0.f1032h = r2
            return
        L2ae:
            r23 = 4
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid "
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r3 = ": "
            r2.append(r3)
            int r3 = r8.p()
            r4 = r23
            if (r3 >= r4) goto L2cd
            r6 = 0
        L2ca:
            r9 = 8
            goto L2d5
        L2cd:
            byte[] r3 = r8.f11553k
            r6 = 0
            int r6 = k7.a.s(r3, r6)
            goto L2ca
        L2d5:
            java.lang.String r3 = y7.a.k(r6, r9)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L2e4:
            c7.c r1 = new c7.c
            java.lang.String r2 = "Failed to find end record"
            r1.<init>(r2)
            throw r1
    }

    public final c7.f a() {
            r6 = this;
            c7.f r0 = new c7.f
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            c7.b[] r2 = r6.f1032h
            int r3 = r2.length
            r1.<init>(r3)
            a7.b r3 = new a7.b
            r4 = 23
            r3.<init>(r4)
            z7.d r4 = new z7.d
            int r5 = r2.length
            r4.<init>(r2, r5, r3)
        L17:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r4.next()
            c7.b r2 = (c7.b) r2
            int r3 = r6.f1033i
            switch(r3) {
                case 0: goto L3a;
                default: goto L28;
            }
        L28:
            i7.c r3 = new i7.c
            i7.f r5 = r6.f1031g
            i7.e r5 = (i7.e) r5
            r3.<init>(r5, r2)
            d7.d r2 = r2.a()
            int r2 = r2.f7388g
            r3.f1039d = r2
            goto L4b
        L3a:
            i7.a r3 = new i7.a
            i7.f r5 = r6.f1031g
            i7.d r5 = (i7.d) r5
            r3.<init>(r5, r2)
            d7.d r2 = r2.a()
            int r2 = r2.f7388g
            r3.f1039d = r2
        L4b:
            java.lang.String r2 = r3.a()
            r1.put(r2, r3)
            goto L17
        L53:
            r0.<init>(r1)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            i7.f r0 = r1.f1031g
            r0.close()
            return
    }
}
