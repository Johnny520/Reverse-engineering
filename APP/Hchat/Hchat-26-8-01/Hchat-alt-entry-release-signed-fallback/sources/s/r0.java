package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12083a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12084b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12085c = 0.0f;

    static {
            r0 = 2500(0x9c4, float:3.503E-42)
            float r0 = (float) r0
            s.r0.f12083a = r0
            r0 = 1500(0x5dc, float:2.102E-42)
            float r0 = (float) r0
            s.r0.f12084b = r0
            r0 = 50
            float r0 = (float) r0
            s.r0.f12085c = r0
            return
    }

    public static final java.lang.Object a(m.k2 r25, int r26, int r27, u2.c r28, yf.c r29) {
            r1 = r26
            r0 = r28
            r2 = r29
            boolean r3 = r2 instanceof s.q0
            if (r3 == 0) goto L19
            r3 = r2
            s.q0 r3 = (s.q0) r3
            int r4 = r3.f12078r
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f12078r = r4
            goto L1e
        L19:
            s.q0 r3 = new s.q0
            r3.<init>(r2)
        L1e:
            java.lang.Object r2 = r3.f12077q
            int r4 = r3.f12078r
            r5 = 0
            r6 = 2
            r8 = 1
            xf.a r9 = xf.a.f21579g
            if (r4 == 0) goto L63
            if (r4 == r8) goto L3d
            if (r4 != r6) goto L36
            int r0 = r3.f12071k
            m.k2 r1 = r3.f12067g
            f8.i.I0(r2)
            goto L209
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r0)
            r0 = 0
            return r0
        L3d:
            int r0 = r3.f12073m
            float r1 = r3.f12076p
            float r4 = r3.f12075o
            float r10 = r3.f12074n
            int r11 = r3.f12072l
            int r12 = r3.f12071k
            gg.s r13 = r3.f12070j
            gg.u r14 = r3.f12069i
            gg.q r15 = r3.f12068h
            m.k2 r7 = r3.f12067g
            f8.i.I0(r2)     // Catch: s.j -> L5e
            r2 = r15
            r15 = r7
            r7 = r2
            r2 = r1
            r1 = r12
        L59:
            r21 = r4
            r4 = r14
            goto L179
        L5e:
            r0 = move-exception
            r11 = r7
            r7 = r12
            goto L1b6
        L63:
            f8.i.I0(r2)
            float r2 = (float) r1
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L6c
            goto L71
        L6c:
            java.lang.String r2 = "Index should be non-negative"
            o.b.a(r2)
        L71:
            float r2 = s.r0.f12083a     // Catch: s.j -> L1b2
            float r2 = r0.x0(r2)     // Catch: s.j -> L1b2
            float r4 = s.r0.f12084b     // Catch: s.j -> L1b2
            float r4 = r0.x0(r4)     // Catch: s.j -> L1b2
            float r7 = s.r0.f12085c     // Catch: s.j -> L1b2
            float r0 = r0.x0(r7)     // Catch: s.j -> L1b2
            gg.q r7 = new gg.q     // Catch: s.j -> L1b2
            r7.<init>()     // Catch: s.j -> L1b2
            r7.f4560g = r8     // Catch: s.j -> L1b2
            gg.u r10 = new gg.u     // Catch: s.j -> L1b2
            r10.<init>()     // Catch: s.j -> L1b2
            r11 = 30
            i.l r11 = i.d.b(r5, r5, r11)     // Catch: s.j -> L1b2
            r10.f4564g = r11     // Catch: s.j -> L1b2
            boolean r11 = c(r25, r26)     // Catch: s.j -> L1b2
            if (r11 != 0) goto L1a2
            r11 = r25
            java.lang.Object r12 = r11.f8249c     // Catch: s.j -> L19f
            r.z r12 = (r.z) r12     // Catch: s.j -> L19f
            int r12 = r12.h()     // Catch: s.j -> L19f
            if (r1 <= r12) goto Lab
            r12 = r8
            goto Lac
        Lab:
            r12 = 0
        Lac:
            gg.s r13 = new gg.s     // Catch: s.j -> L19f
            r13.<init>()     // Catch: s.j -> L19f
            r13.f4562g = r8     // Catch: s.j -> L19f
            r23 = r27
            r21 = r4
            r4 = r10
            r15 = r11
            r10 = r2
            r2 = r0
            r0 = r12
        Lbc:
            r22 = r13
            boolean r11 = r7.f4560g     // Catch: s.j -> L193
            if (r11 == 0) goto L210
            java.lang.Object r11 = r15.f8249c     // Catch: s.j -> L199
            r.z r11 = (r.z) r11     // Catch: s.j -> L199
            r.p r11 = r11.j()     // Catch: s.j -> L199
            int r11 = r11.f11232n     // Catch: s.j -> L199
            if (r11 <= 0) goto L210
            int r11 = m.k2.b(r15, r1)     // Catch: s.j -> L193
            int r12 = java.lang.Math.abs(r11)     // Catch: s.j -> L193
            float r12 = (float) r12
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 >= 0) goto Lee
            float r11 = (float) r11
            float r11 = java.lang.Math.abs(r11)     // Catch: s.j -> Le9
            float r11 = java.lang.Math.max(r11, r2)     // Catch: s.j -> Le9
            if (r0 == 0) goto Le7
            goto Lf3
        Le7:
            float r11 = -r11
            goto Lf3
        Le9:
            r0 = move-exception
            r7 = r1
        Leb:
            r11 = r15
            goto L1b6
        Lee:
            if (r0 == 0) goto Lf2
            r11 = r10
            goto Lf3
        Lf2:
            float r11 = -r10
        Lf3:
            java.lang.Object r12 = r4.f4564g     // Catch: s.j -> L193
            i.l r12 = (i.l) r12     // Catch: s.j -> L193
            i.l r12 = i.d.j(r12, r5)     // Catch: s.j -> L193
            r4.f4564g = r12     // Catch: s.j -> L193
            gg.r r18 = new gg.r     // Catch: s.j -> L193
            r18.<init>()     // Catch: s.j -> L193
            java.lang.Float r13 = new java.lang.Float     // Catch: s.j -> L199
            r13.<init>(r11)     // Catch: s.j -> L199
            java.lang.Object r14 = r4.f4564g     // Catch: s.j -> L193
            i.l r14 = (i.l) r14     // Catch: s.j -> L193
            i.m1 r6 = r14.f5718g     // Catch: s.j -> L199
            fg.l r6 = r6.f5731b     // Catch: s.j -> L199
            i.q r14 = r14.f5720i     // Catch: s.j -> L199
            java.lang.Object r6 = r6.invoke(r14)     // Catch: s.j -> L199
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: s.j -> L193
            float r6 = r6.floatValue()     // Catch: s.j -> L193
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 != 0) goto L121
            r6 = r8
            goto L122
        L121:
            r6 = 0
        L122:
            r6 = r6 ^ r8
            if (r0 == 0) goto L128
            r20 = r8
            goto L12a
        L128:
            r20 = 0
        L12a:
            s.p0 r14 = new s.p0     // Catch: s.j -> L193
            r16 = r1
            r24 = r4
            r19 = r7
            r17 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch: s.j -> L18c
            r20 = r14
            r11 = r15
            r7 = r16
            r15 = r19
            r4 = r21
            r1 = r22
            r5 = r23
            r14 = r24
            r3.f12067g = r11     // Catch: s.j -> L188
            r3.f12068h = r15     // Catch: s.j -> L188
            r3.f12069i = r14     // Catch: s.j -> L188
            r3.f12070j = r1     // Catch: s.j -> L188
            r3.f12071k = r7     // Catch: s.j -> L188
            r3.f12072l = r5     // Catch: s.j -> L188
            r3.f12074n = r10     // Catch: s.j -> L188
            r3.f12075o = r4     // Catch: s.j -> L188
            r3.f12076p = r2     // Catch: s.j -> L188
            r3.f12073m = r0     // Catch: s.j -> L188
            r3.f12078r = r8     // Catch: s.j -> L188
            r18 = 0
            r22 = 2
            r21 = r3
            r19 = r6
            r16 = r12
            r17 = r13
            java.lang.Object r3 = i.d.h(r16, r17, r18, r19, r20, r21, r22)     // Catch: s.j -> L184
            if (r3 != r9) goto L170
            goto L206
        L170:
            r13 = r1
            r1 = r7
            r7 = r15
            r3 = r21
            r15 = r11
            r11 = r5
            goto L59
        L179:
            int r5 = r13.f4562g     // Catch: s.j -> Le9
            int r5 = r5 + r8
            r13.f4562g = r5     // Catch: s.j -> Le9
            r23 = r11
            r5 = 0
            r6 = 2
            goto Lbc
        L184:
            r0 = move-exception
        L185:
            r3 = r21
            goto L1b6
        L188:
            r0 = move-exception
            r21 = r3
            goto L1b6
        L18c:
            r0 = move-exception
            r21 = r3
            r11 = r15
            r7 = r16
            goto L1b6
        L193:
            r0 = move-exception
            r7 = r1
            r21 = r3
            goto Leb
        L199:
            r0 = move-exception
            r7 = r1
            r21 = r3
            r11 = r15
            goto L185
        L19f:
            r0 = move-exception
        L1a0:
            r7 = r1
            goto L1b6
        L1a2:
            r11 = r25
            int r0 = m.k2.b(r25, r26)     // Catch: s.j -> L19f
            s.j r2 = new s.j     // Catch: s.j -> L19f
            java.lang.Object r4 = r10.f4564g     // Catch: s.j -> L19f
            i.l r4 = (i.l) r4     // Catch: s.j -> L19f
            r2.<init>(r0, r4)     // Catch: s.j -> L19f
            throw r2     // Catch: s.j -> L19f
        L1b2:
            r0 = move-exception
            r11 = r25
            goto L1a0
        L1b6:
            i.l r1 = r0.f12035h
            r2 = 0
            i.l r12 = i.d.j(r1, r2)
            int r0 = r0.f12034g
            float r0 = (float) r0
            gg.r r1 = new gg.r
            r1.<init>()
            java.lang.Float r13 = new java.lang.Float
            r13.<init>(r0)
            i.m1 r2 = r12.f5718g
            fg.l r2 = r2.f5731b
            i.q r4 = r12.f5720i
            java.lang.Object r2 = r2.invoke(r4)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r23 = 0
            int r2 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r2 != 0) goto L1e2
            r2 = r8
            goto L1e3
        L1e2:
            r2 = 0
        L1e3:
            r15 = r2 ^ 1
            m.e3 r2 = new m.e3
            r4 = 1
            r2.<init>(r0, r1, r11, r4)
            r3.f12067g = r11
            r0 = 0
            r3.f12068h = r0
            r3.f12069i = r0
            r3.f12070j = r0
            r3.f12071k = r7
            r1 = 2
            r3.f12078r = r1
            r14 = 0
            r18 = 2
            r16 = r2
            r17 = r3
            java.lang.Object r0 = i.d.h(r12, r13, r14, r15, r16, r17, r18)
            if (r0 != r9) goto L207
        L206:
            return r9
        L207:
            r0 = r7
            r1 = r11
        L209:
            java.lang.Object r1 = r1.f8249c
            r.z r1 = (r.z) r1
            r1.n(r0, r8)
        L210:
            sf.n r0 = sf.n.f12433a
            return r0
    }

    public static final boolean b(boolean r0, m.k2 r1, int r2) {
            java.lang.Object r1 = r1.f8249c
            r.z r1 = (r.z) r1
            if (r0 == 0) goto L1a
            int r0 = r1.h()
            if (r0 <= r2) goto Ld
            goto L2d
        Ld:
            int r0 = r1.h()
            if (r0 != r2) goto L2f
            int r0 = r1.i()
            if (r0 <= 0) goto L2f
            goto L2d
        L1a:
            int r0 = r1.h()
            if (r0 >= r2) goto L21
            goto L2d
        L21:
            int r0 = r1.h()
            if (r0 != r2) goto L2f
            int r0 = r1.i()
            if (r0 >= 0) goto L2f
        L2d:
            r0 = 1
            return r0
        L2f:
            r0 = 0
            return r0
    }

    public static final boolean c(m.k2 r1, int r2) {
            java.lang.Object r0 = r1.f8249c
            r.z r0 = (r.z) r0
            int r0 = r0.h()
            int r1 = r1.c()
            if (r2 > r1) goto L12
            if (r0 > r2) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }
}
