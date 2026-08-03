package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends p4.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p4.f f10092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f10093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v4.a f10094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10095i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10096j;

    public a(u4.t r2, p4.f r3, java.util.ArrayList r4, v4.a r5) {
            r1 = this;
            u4.p r0 = u4.p.f13403i
            r1.<init>(r2, r0)
            if (r3 == 0) goto L65
            if (r4 == 0) goto L5e
            int r2 = r4.size()
            if (r2 <= 0) goto L57
            r1.f10094h = r5
            v4.d0 r2 = v4.d0.f14082u
            if (r5 == r2) goto L49
            v4.d0 r2 = v4.d0.f14081t
            if (r5 != r2) goto L1a
            goto L49
        L1a:
            v4.d0 r2 = v4.d0.A
            if (r5 == r2) goto L45
            v4.d0 r2 = v4.d0.f14083v
            if (r5 != r2) goto L23
            goto L45
        L23:
            v4.d0 r2 = v4.d0.f14087z
            if (r5 == r2) goto L41
            v4.d0 r2 = v4.d0.f14085x
            if (r5 != r2) goto L2c
            goto L41
        L2c:
            v4.d0 r2 = v4.d0.f14086y
            if (r5 == r2) goto L3c
            v4.d0 r2 = v4.d0.f14084w
            if (r5 != r2) goto L35
            goto L3c
        L35:
            java.lang.String r2 = "Unexpected constant type"
            j8.o.t(r2)
            r2 = 0
            throw r2
        L3c:
            r2 = 8
            r1.f10095i = r2
            goto L4c
        L41:
            r2 = 4
            r1.f10095i = r2
            goto L4c
        L45:
            r2 = 2
            r1.f10095i = r2
            goto L4c
        L49:
            r2 = 1
            r1.f10095i = r2
        L4c:
            r1.f10092f = r3
            r1.f10093g = r4
            int r2 = r4.size()
            r1.f10096j = r2
            return
        L57:
            java.lang.String r2 = "Illegal number of init values"
            j8.o.t(r2)
            r2 = 0
            throw r2
        L5e:
            java.lang.String r2 = "values == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
        L65:
            java.lang.String r2 = "user == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
    }

    @Override // p4.h
    public final java.lang.String a() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.util.ArrayList r1 = r5.f10093g
            int r2 = r1.size()
            r3 = 0
        Le:
            if (r3 >= r2) goto L2d
            java.lang.String r4 = "\n    "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = ": "
            r0.append(r4)
            java.lang.Object r4 = r1.get(r3)
            v4.a r4 = (v4.a) r4
            java.lang.String r4 = r4.a()
            r0.append(r4)
            int r3 = r3 + 1
            goto Le
        L2d:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p4.l, p4.h
    public final int b() {
            r2 = this;
            int r0 = r2.f10095i
            int r1 = r2.f10096j
            int r1 = r1 * r0
            int r1 = r1 + 1
            int r1 = r1 / 2
            int r1 = r1 + 4
            return r1
    }

    @Override // p4.l, p4.h
    public final java.lang.String g() {
            r5 = this;
            p4.f r0 = r5.f10092f
            int r0 = r0.e()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.util.ArrayList r2 = r5.f10093g
            int r3 = r2.size()
            java.lang.String r4 = "fill-array-data-payload // for fill-array-data @ "
            r1.append(r4)
            java.lang.String r0 = a.a.X0(r0)
            r1.append(r0)
            r0 = 0
        L20:
            if (r0 >= r3) goto L3f
            java.lang.String r4 = "\n  "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = ": "
            r1.append(r4)
            java.lang.Object r4 = r2.get(r0)
            v4.a r4 = (v4.a) r4
            java.lang.String r4 = r4.a()
            r1.append(r4)
            int r0 = r0 + 1
            goto L20
        L3f:
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // p4.h
    public final p4.h k(u4.p r5) {
            r4 = this;
            p4.a r5 = new p4.a
            java.util.ArrayList r0 = r4.f10093g
            v4.a r1 = r4.f10094h
            u4.t r2 = r4.f10115c
            p4.f r3 = r4.f10092f
            r5.<init>(r2, r3, r0, r1)
            return r5
    }

    @Override // p4.l, p4.h
    public final void l(z4.d r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.ArrayList r2 = r0.f10093g
            int r3 = r2.size()
            r4 = 768(0x300, float:1.076E-42)
            r1.l(r4)
            int r4 = r0.f10095i
            r1.l(r4)
            int r5 = r0.f10096j
            r1.k(r5)
            r5 = 2
            r6 = 0
            r7 = 1
            if (r4 == r7) goto Lbb
            if (r4 == r5) goto La5
            r8 = 4
            if (r4 == r8) goto L90
            r8 = 8
            if (r4 == r8) goto L2b
        L27:
            r16 = r5
            goto Ld1
        L2b:
            r8 = r6
        L2c:
            if (r8 >= r3) goto L27
            java.lang.Object r9 = r2.get(r8)
            v4.a r9 = (v4.a) r9
            v4.t r9 = (v4.t) r9
            long r9 = r9.f14122g
            int r11 = r1.f22538c
            int r12 = r11 + 8
            boolean r13 = r1.f22536a
            if (r13 == 0) goto L44
            r1.f(r12)
            goto L49
        L44:
            byte[] r13 = r1.f22537b
            int r13 = r13.length
            if (r12 > r13) goto L8b
        L49:
            int r13 = (int) r9
            byte[] r14 = r1.f22537b
            byte r15 = (byte) r13
            r14[r11] = r15
            int r15 = r11 + 1
            r16 = r5
            int r5 = r13 >> 8
            byte r5 = (byte) r5
            r14[r15] = r5
            int r5 = r11 + 2
            int r15 = r13 >> 16
            byte r15 = (byte) r15
            r14[r5] = r15
            int r5 = r11 + 3
            int r13 = r13 >> 24
            byte r13 = (byte) r13
            r14[r5] = r13
            r5 = 32
            long r9 = r9 >> r5
            int r5 = (int) r9
            int r9 = r11 + 4
            byte r10 = (byte) r5
            r14[r9] = r10
            int r9 = r11 + 5
            int r10 = r5 >> 8
            byte r10 = (byte) r10
            r14[r9] = r10
            int r9 = r11 + 6
            int r10 = r5 >> 16
            byte r10 = (byte) r10
            r14[r9] = r10
            int r11 = r11 + 7
            int r5 = r5 >> 24
            byte r5 = (byte) r5
            r14[r11] = r5
            r1.f22538c = r12
            int r8 = r8 + 1
            r5 = r16
            goto L2c
        L8b:
            z4.d.g()
            r1 = 0
            throw r1
        L90:
            r16 = r5
            r5 = r6
        L93:
            if (r5 >= r3) goto Ld1
            java.lang.Object r8 = r2.get(r5)
            v4.a r8 = (v4.a) r8
            v4.s r8 = (v4.s) r8
            int r8 = r8.f14121g
            r1.k(r8)
            int r5 = r5 + 1
            goto L93
        La5:
            r16 = r5
            r5 = r6
        La8:
            if (r5 >= r3) goto Ld1
            java.lang.Object r8 = r2.get(r5)
            v4.a r8 = (v4.a) r8
            v4.s r8 = (v4.s) r8
            int r8 = r8.f14121g
            short r8 = (short) r8
            r1.l(r8)
            int r5 = r5 + 1
            goto La8
        Lbb:
            r16 = r5
            r5 = r6
        Lbe:
            if (r5 >= r3) goto Ld1
            java.lang.Object r8 = r2.get(r5)
            v4.a r8 = (v4.a) r8
            v4.s r8 = (v4.s) r8
            int r8 = r8.f14121g
            byte r8 = (byte) r8
            r1.j(r8)
            int r5 = r5 + 1
            goto Lbe
        Ld1:
            if (r4 != r7) goto Lda
            int r3 = r3 % 2
            if (r3 == 0) goto Lda
            r1.j(r6)
        Lda:
            return
    }
}
