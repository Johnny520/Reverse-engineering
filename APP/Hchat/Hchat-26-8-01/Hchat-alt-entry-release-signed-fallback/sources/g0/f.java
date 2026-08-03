package g0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.g f4011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2.n0 f4012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m2.d f4013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fg.l f4014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.List f4019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fg.l f4020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final fg.l f4021k;

    public f(i2.g r1, i2.n0 r2, m2.d r3, fg.l r4, int r5, boolean r6, int r7, int r8, java.util.List r9, fg.l r10, fg.l r11) {
            r0 = this;
            r0.<init>()
            r0.f4011a = r1
            r0.f4012b = r2
            r0.f4013c = r3
            r0.f4014d = r4
            r0.f4015e = r5
            r0.f4016f = r6
            r0.f4017g = r7
            r0.f4018h = r8
            r0.f4019i = r9
            r0.f4020j = r10
            r0.f4021k = r11
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L68
        L4:
            boolean r0 = r3 instanceof g0.f
            if (r0 != 0) goto La
            goto L6a
        La:
            g0.f r3 = (g0.f) r3
            i2.g r0 = r2.f4011a
            i2.g r1 = r3.f4011a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L17
            goto L6a
        L17:
            i2.n0 r0 = r2.f4012b
            i2.n0 r1 = r3.f4012b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L22
            goto L6a
        L22:
            java.util.List r0 = r2.f4019i
            java.util.List r1 = r3.f4019i
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2d
            goto L6a
        L2d:
            m2.d r0 = r2.f4013c
            m2.d r1 = r3.f4013c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L38
            goto L6a
        L38:
            fg.l r0 = r2.f4014d
            fg.l r1 = r3.f4014d
            if (r0 == r1) goto L3f
            goto L6a
        L3f:
            fg.l r0 = r2.f4021k
            fg.l r1 = r3.f4021k
            if (r0 == r1) goto L46
            goto L6a
        L46:
            int r0 = r2.f4015e
            int r1 = r3.f4015e
            if (r0 != r1) goto L6a
            boolean r0 = r2.f4016f
            boolean r1 = r3.f4016f
            if (r0 == r1) goto L53
            goto L6a
        L53:
            int r0 = r2.f4017g
            int r1 = r3.f4017g
            if (r0 == r1) goto L5a
            goto L6a
        L5a:
            int r0 = r2.f4018h
            int r1 = r3.f4018h
            if (r0 == r1) goto L61
            goto L6a
        L61:
            fg.l r0 = r2.f4020j
            fg.l r3 = r3.f4020j
            if (r0 == r3) goto L68
            goto L6a
        L68:
            r3 = 1
            return r3
        L6a:
            r3 = 0
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            g0.j r0 = new g0.j
            r0.<init>()
            i2.g r1 = r2.f4011a
            r0.f4030u = r1
            i2.n0 r1 = r2.f4012b
            r0.f4031v = r1
            m2.d r1 = r2.f4013c
            r0.f4032w = r1
            fg.l r1 = r2.f4014d
            r0.f4033x = r1
            int r1 = r2.f4015e
            r0.f4034y = r1
            boolean r1 = r2.f4016f
            r0.f4035z = r1
            int r1 = r2.f4017g
            r0.A = r1
            int r1 = r2.f4018h
            r0.B = r1
            java.util.List r1 = r2.f4019i
            r0.C = r1
            fg.l r1 = r2.f4020j
            r0.D = r1
            fg.l r1 = r2.f4021k
            r0.E = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            g0.j r1 = (g0.j) r1
            i2.n0 r2 = r1.f4031v
            i2.n0 r3 = r0.f4012b
            if (r3 == r2) goto L19
            i2.f0 r3 = r3.f6365a
            i2.f0 r2 = r2.f6365a
            boolean r2 = r3.b(r2)
            if (r2 == 0) goto L17
            goto L1c
        L17:
            r2 = 1
            goto L1d
        L19:
            r3.getClass()
        L1c:
            r2 = 0
        L1d:
            i2.g r3 = r1.f4030u
            java.lang.String r3 = r3.f6314h
            i2.g r4 = r0.f4011a
            java.lang.String r5 = r4.f6314h
            boolean r3 = gg.l.a(r3, r5)
            i2.g r5 = r1.f4030u
            java.util.List r5 = r5.f6313g
            java.util.List r6 = r4.f6313g
            boolean r5 = gg.l.a(r5, r6)
            if (r3 == 0) goto L3a
            if (r5 != 0) goto L38
            goto L3a
        L38:
            r5 = 0
            goto L3b
        L3a:
            r5 = 1
        L3b:
            if (r5 == 0) goto L3f
            r1.f4030u = r4
        L3f:
            if (r3 != 0) goto L44
            r3 = 0
            r1.I = r3
        L44:
            i2.n0 r3 = r1.f4031v
            i2.n0 r4 = r0.f4012b
            boolean r3 = r3.b(r4)
            r6 = 1
            r3 = r3 ^ r6
            r1.f4031v = r4
            java.util.List r4 = r1.C
            java.util.List r7 = r0.f4019i
            boolean r4 = gg.l.a(r4, r7)
            if (r4 != 0) goto L5d
            r1.C = r7
            r3 = r6
        L5d:
            int r4 = r1.B
            int r7 = r0.f4018h
            if (r4 == r7) goto L66
            r1.B = r7
            r3 = r6
        L66:
            int r4 = r1.A
            int r7 = r0.f4017g
            if (r4 == r7) goto L6f
            r1.A = r7
            r3 = r6
        L6f:
            boolean r4 = r1.f4035z
            boolean r7 = r0.f4016f
            if (r4 == r7) goto L78
            r1.f4035z = r7
            r3 = r6
        L78:
            m2.d r4 = r1.f4032w
            m2.d r7 = r0.f4013c
            boolean r4 = gg.l.a(r4, r7)
            if (r4 != 0) goto L85
            r1.f4032w = r7
            r3 = r6
        L85:
            int r4 = r1.f4034y
            int r7 = r0.f4015e
            if (r4 != r7) goto L8d
            r6 = r3
            goto L8f
        L8d:
            r1.f4034y = r7
        L8f:
            fg.l r3 = r1.f4033x
            fg.l r4 = r0.f4014d
            r7 = 1
            if (r3 == r4) goto L9a
            r1.f4033x = r4
            r3 = r7
            goto L9b
        L9a:
            r3 = 0
        L9b:
            fg.l r4 = r1.D
            fg.l r8 = r0.f4020j
            if (r4 == r8) goto La4
            r1.D = r8
            r3 = r7
        La4:
            fg.l r4 = r1.E
            fg.l r8 = r0.f4021k
            if (r4 == r8) goto Lad
            r1.E = r8
            goto Lae
        Lad:
            r7 = r3
        Lae:
            if (r5 != 0) goto Lb4
            if (r6 != 0) goto Lb4
            if (r7 == 0) goto Lcd
        Lb4:
            g0.d r8 = r1.k1()
            i2.g r9 = r1.f4030u
            i2.n0 r10 = r1.f4031v
            m2.d r11 = r1.f4032w
            int r12 = r1.f4034y
            boolean r13 = r1.f4035z
            int r14 = r1.A
            int r15 = r1.B
            java.util.List r3 = r1.C
            r16 = r3
            r8.g(r9, r10, r11, r12, r13, r14, r15, r16)
        Lcd:
            boolean r3 = r1.f21832t
            if (r3 != 0) goto Ld2
            goto Lee
        Ld2:
            if (r5 != 0) goto Lda
            if (r2 == 0) goto Ldd
            g0.h r3 = r1.H
            if (r3 == 0) goto Ldd
        Lda:
            x1.k.n(r1)
        Ldd:
            if (r5 != 0) goto Le3
            if (r6 != 0) goto Le3
            if (r7 == 0) goto Le9
        Le3:
            x1.k.m(r1)
            x1.k.l(r1)
        Le9:
            if (r2 == 0) goto Lee
            x1.k.l(r1)
        Lee:
            return
    }

    public final int hashCode() {
            r4 = this;
            i2.g r0 = r4.f4011a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            i2.n0 r2 = r4.f4012b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            m2.d r0 = r4.f4013c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            r2 = 0
            fg.l r3 = r4.f4014d
            if (r3 == 0) goto L23
            int r3 = r3.hashCode()
            goto L24
        L23:
            r3 = r2
        L24:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.f4015e
            int r0 = eh.a.e(r3, r0, r1)
            boolean r3 = r4.f4016f
            int r0 = eh.a.h(r0, r1, r3)
            int r3 = r4.f4017g
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.f4018h
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.util.List r3 = r4.f4019i
            if (r3 == 0) goto L43
            int r3 = r3.hashCode()
            goto L44
        L43:
            r3 = r2
        L44:
            int r0 = r0 + r3
            int r0 = r0 * r1
            fg.l r1 = r4.f4020j
            if (r1 == 0) goto L4f
            int r1 = r1.hashCode()
            goto L50
        L4f:
            r1 = r2
        L50:
            int r0 = r0 + r1
            int r0 = r0 * 29791
            fg.l r1 = r4.f4021k
            if (r1 == 0) goto L5b
            int r2 = r1.hashCode()
        L5b:
            int r0 = r0 + r2
            return r0
    }
}
