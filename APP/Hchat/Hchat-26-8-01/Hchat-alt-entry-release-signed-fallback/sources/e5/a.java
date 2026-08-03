package e5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends q5.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f2353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final char[] f2354i;

    public a(java.io.Writer r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r2 instanceof d6.g
            if (r0 == 0) goto L5
            goto Lb
        L5:
            d6.g r0 = new d6.g
            r0.<init>(r2)
            r2 = r0
        Lb:
            r1.<init>(r2)
            r2 = 24
            char[] r2 = new char[r2]
            r1.f2354i = r2
            r1.f2353h = r3
            return
    }

    public final void A(long r6) {
            r5 = this;
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 76
            java.io.Writer r2 = r5.f10661g
            if (r0 >= 0) goto L1e
            java.lang.String r0 = "-0x"
            r2.write(r0)
            long r3 = -r6
            r5.C(r3)
            r3 = -2147483648(0xffffffff80000000, double:NaN)
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 >= 0) goto L30
            r2.write(r1)
            return
        L1e:
            java.lang.String r0 = "0x"
            r2.write(r0)
            r5.C(r6)
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L30
            r2.write(r1)
        L30:
            return
    }

    public final void B(java.lang.CharSequence r3, boolean r4) {
            r2 = this;
            r0 = 96
            java.io.Writer r1 = r2.f10661g
            if (r4 == 0) goto L9
            r1.write(r0)
        L9:
            r1.append(r3)
            if (r4 == 0) goto L11
            r1.write(r0)
        L11:
            return
    }

    public final void C(long r5) {
            r4 = this;
            r0 = 23
        L2:
            r1 = 15
            long r1 = r1 & r5
            int r1 = (int) r1
            r2 = 10
            char[] r3 = r4.f2354i
            if (r1 >= r2) goto L15
            int r2 = r0 + (-1)
            int r1 = r1 + 48
            char r1 = (char) r1
            r3[r0] = r1
        L13:
            r0 = r2
            goto L1d
        L15:
            int r2 = r0 + (-1)
            int r1 = r1 + 87
            char r1 = (char) r1
            r3[r0] = r1
            goto L13
        L1d:
            r1 = 4
            long r5 = r5 >>> r1
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L2
            int r0 = r0 + 1
            int r5 = 24 - r0
            r4.write(r3, r0, r5)
            return
    }

    @Override // q5.a
    public final void a(p5.a r3) {
            r2 = this;
            java.lang.String r0 = ".subannotation "
            java.io.Writer r1 = r2.f10661g
            r1.write(r0)
            java.lang.String r0 = r3.getType()
            r2.t(r0)
            r0 = 10
            r1.write(r0)
            java.util.Set r3 = r3.a()
            java.util.Set r3 = (java.util.Set) r3
            r2.x(r3)
            java.lang.String r3 = ".end subannotation"
            r1.write(r3)
            return
    }

    @Override // q5.a
    public final void b(p5.b r4) {
            r3 = this;
            r0 = 123(0x7b, float:1.72E-43)
            java.io.Writer r1 = r3.f10661g
            r1.write(r0)
            java.util.List r4 = r4.a()
            int r0 = r4.size()
            if (r0 != 0) goto L17
            r4 = 125(0x7d, float:1.75E-43)
            r1.write(r4)
            return
        L17:
            r0 = 10
            r1.write(r0)
            r3.w()
            java.util.Iterator r4 = r4.iterator()
            r0 = 1
        L24:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r4.next()
            w5.a r2 = (w5.a) r2
            if (r0 != 0) goto L37
            java.lang.String r0 = ",\n"
            r1.write(r0)
        L37:
            r3.g(r2)
            r0 = 0
            goto L24
        L3c:
            r3.u()
            java.lang.String r4 = "\n}"
            r1.write(r4)
            return
    }

    @Override // q5.a
    public final void c(n5.a r5) {
            r4 = this;
            java.lang.String r0 = r5.getName()
            r4.s(r0)
            r0 = 40
            java.io.Writer r1 = r4.f10661g
            r1.write(r0)
            java.lang.String r0 = r5.h1()
            r4.m(r0)
            java.lang.String r0 = ", "
            r1.write(r0)
            n5.d r2 = r5.i1()
            r4.l(r2)
            java.util.List r2 = r5.f1()
            java.util.Iterator r2 = r2.iterator()
        L29:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r2.next()
            w5.a r3 = (w5.a) r3
            r1.write(r0)
            r4.g(r3)
            goto L29
        L3c:
            java.lang.String r0 = ")@"
            r1.write(r0)
            n5.c r0 = r5.g1()
            int r0 = r0.g1()
            r1 = 4
            if (r0 != r1) goto L5a
            n5.c r5 = r5.g1()
            v5.b r5 = r5.f1()
            i5.b r5 = (i5.b) r5
            r4.i(r5)
            return
        L5a:
            java.lang.String r5 = "The linker method handle for a call site must be of type invoke-static"
            j8.o.t(r5)
            return
    }

    @Override // q5.a
    public final void e(java.lang.CharSequence r12) {
            r11 = this;
            r0 = 0
            char r1 = r12.charAt(r0)
            java.io.Writer r2 = r11.f10661g
            r2.write(r1)
            r1 = 1
            r5 = r0
            r3 = r1
            r4 = r3
        Le:
            int r6 = r12.length()
            r7 = 59
            java.lang.String r8 = "Invalid type string: %s"
            if (r3 >= r6) goto L64
            char r6 = r12.charAt(r3)
            int r9 = java.lang.Character.getType(r6)
            r10 = 12
            if (r9 != r10) goto L26
            r5 = r1
            goto L61
        L26:
            r9 = 47
            if (r6 != r9) goto L46
            if (r3 == r4) goto L3e
            java.lang.CharSequence r4 = r12.subSequence(r4, r3)
            r11.B(r4, r5)
            char r4 = r12.charAt(r3)
            r2.write(r4)
            int r4 = r3 + 1
            r5 = r0
            goto L61
        L3e:
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            ah.a.q(r8, r12)
            return
        L46:
            if (r6 != r7) goto L61
            if (r3 == r4) goto L59
            java.lang.CharSequence r0 = r12.subSequence(r4, r3)
            r11.B(r0, r5)
            char r0 = r12.charAt(r3)
            r2.write(r0)
            goto L64
        L59:
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            ah.a.q(r8, r12)
            return
        L61:
            int r3 = r3 + 1
            goto Le
        L64:
            int r0 = r12.length()
            int r0 = r0 - r1
            if (r3 != r0) goto L72
            char r0 = r12.charAt(r3)
            if (r0 != r7) goto L72
            return
        L72:
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            ah.a.q(r8, r12)
            return
    }

    @Override // q5.a
    public final void g(w5.a r6) {
            r5 = this;
            int r0 = r6.h()
            if (r0 == 0) goto L14c
            r1 = 6
            if (r0 == r1) goto L13e
            r1 = 2
            if (r0 == r1) goto L12f
            r1 = 3
            r2 = 16
            java.io.Writer r3 = r5.f10661g
            if (r0 == r1) goto Lb5
            r1 = 4
            if (r0 == r1) goto Lab
            if (r0 == r2) goto L9a
            r1 = 17
            if (r0 == r1) goto L8e
            switch(r0) {
                case 21: goto L84;
                case 22: goto L7a;
                case 23: goto L70;
                case 24: goto L66;
                case 25: goto L5c;
                case 26: goto L52;
                case 27: goto L43;
                case 28: goto L3d;
                case 29: goto L37;
                case 30: goto L31;
                case 31: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.String r6 = "Unknown encoded value type"
            j8.o.t(r6)
            return
        L25:
            b6.a r6 = (b6.a) r6
            boolean r6 = r6.f492g
            java.lang.String r6 = java.lang.Boolean.toString(r6)
            r3.write(r6)
            return
        L31:
            java.lang.String r6 = "null"
            r3.write(r6)
            return
        L37:
            p5.a r6 = (p5.a) r6
            r5.a(r6)
            return
        L3d:
            p5.b r6 = (p5.b) r6
            r5.b(r6)
            return
        L43:
            p5.c r6 = (p5.c) r6
            java.lang.String r0 = ".enum "
            r3.write(r0)
            i5.a r6 = r6.a()
            r5.h(r6)
            return
        L52:
            p5.e r6 = (p5.e) r6
            i5.b r6 = r6.a()
            r5.i(r6)
            return
        L5c:
            p5.d r6 = (p5.d) r6
            i5.a r6 = r6.a()
            r5.h(r6)
            return
        L66:
            p5.i r6 = (p5.i) r6
            java.lang.String r6 = r6.a()
            r5.t(r6)
            return
        L70:
            p5.h r6 = (p5.h) r6
            java.lang.String r6 = r6.a()
            r5.m(r6)
            return
        L7a:
            p5.f r6 = (p5.f) r6
            n5.c r6 = r6.a()
            r5.k(r6)
            return
        L84:
            p5.g r6 = (p5.g) r6
            n5.d r6 = r6.a()
            r5.l(r6)
            return
        L8e:
            b6.d r6 = (b6.d) r6
            double r0 = r6.f495g
            java.lang.String r6 = java.lang.Double.toString(r0)
            r3.write(r6)
            return
        L9a:
            b6.e r6 = (b6.e) r6
            float r6 = r6.f496g
            java.lang.String r6 = java.lang.Float.toString(r6)
            r3.write(r6)
            r6 = 102(0x66, float:1.43E-43)
            r3.write(r6)
            return
        Lab:
            b6.f r6 = (b6.f) r6
            int r6 = r6.f497g
            long r0 = (long) r6
            r6 = 0
            r5.y(r0, r6)
            return
        Lb5:
            b6.c r6 = (b6.c) r6
            char r6 = r6.f494g
            r0 = 32
            r1 = 127(0x7f, float:1.78E-43)
            r4 = 39
            if (r6 < r0) goto Lda
            if (r6 >= r1) goto Lda
            r3.write(r4)
            r0 = 92
            if (r6 == r4) goto Ld0
            r1 = 34
            if (r6 == r1) goto Ld0
            if (r6 != r0) goto Ld3
        Ld0:
            r3.write(r0)
        Ld3:
            r3.write(r6)
            r3.write(r4)
            return
        Lda:
            if (r6 > r1) goto Lfb
            r0 = 9
            if (r6 == r0) goto Lf5
            r0 = 10
            if (r6 == r0) goto Lef
            r0 = 13
            if (r6 == r0) goto Le9
            goto Lfb
        Le9:
            java.lang.String r6 = "'\\r'"
            r3.write(r6)
            return
        Lef:
            java.lang.String r6 = "'\\n'"
            r3.write(r6)
            return
        Lf5:
            java.lang.String r6 = "'\\t'"
            r3.write(r6)
            return
        Lfb:
            r3.write(r4)
            java.lang.String r0 = "\\u"
            r3.write(r0)
            int r0 = r6 >> 12
            char r0 = java.lang.Character.forDigit(r0, r2)
            r3.write(r0)
            int r0 = r6 >> 8
            r0 = r0 & 15
            char r0 = java.lang.Character.forDigit(r0, r2)
            r3.write(r0)
            int r0 = r6 >> 4
            r0 = r0 & 15
            char r0 = java.lang.Character.forDigit(r0, r2)
            r3.write(r0)
            r6 = r6 & 15
            char r6 = java.lang.Character.forDigit(r6, r2)
            r3.write(r6)
            r3.write(r4)
            return
        L12f:
            b6.i r6 = (b6.i) r6
            short r6 = r6.f500g
            long r0 = (long) r6
            r6 = 115(0x73, float:1.61E-43)
            java.lang.Character r6 = java.lang.Character.valueOf(r6)
            r5.y(r0, r6)
            return
        L13e:
            b6.g r6 = (b6.g) r6
            long r0 = r6.f498g
            r6 = 76
            java.lang.Character r6 = java.lang.Character.valueOf(r6)
            r5.y(r0, r6)
            return
        L14c:
            b6.b r6 = (b6.b) r6
            byte r6 = r6.f493g
            long r0 = (long) r6
            r6 = 116(0x74, float:1.63E-43)
            java.lang.Character r6 = java.lang.Character.valueOf(r6)
            r5.y(r0, r6)
            return
    }

    @Override // q5.a
    public final void h(i5.a r3) {
            r2 = this;
            java.lang.String r0 = r3.f1()
            java.lang.String r1 = r2.f2353h
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L22
            java.lang.String r0 = r3.getName()
            r2.s(r0)
            java.io.Writer r0 = r2.f10661g
            r1 = 58
            r0.write(r1)
            java.lang.String r3 = r3.getType()
            r2.t(r3)
            return
        L22:
            super.h(r3)
            return
    }

    @Override // q5.a
    public final void i(i5.b r3) {
            r2 = this;
            java.lang.String r0 = r3.f1()
            java.lang.String r1 = r2.f2353h
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L10
            r2.q(r3)
            return
        L10:
            super.i(r3)
            return
    }

    @Override // q5.a
    public final void s(java.lang.CharSequence r5) {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.length()
            if (r1 >= r2) goto L19
            char r2 = r5.charAt(r1)
            int r2 = java.lang.Character.getType(r2)
            r3 = 12
            if (r2 != r3) goto L16
            r0 = 1
            goto L19
        L16:
            int r1 = r1 + 1
            goto L2
        L19:
            r4.B(r5, r0)
            return
    }

    public final void u() {
            r2 = this;
            java.io.Writer r0 = r2.f10661g
            d6.g r0 = (d6.g) r0
            int r1 = r0.f2011h
            int r1 = r1 + (-4)
            r0.f2011h = r1
            if (r1 >= 0) goto Lf
            r1 = 0
            r0.f2011h = r1
        Lf:
            return
    }

    public final void w() {
            r2 = this;
            java.io.Writer r0 = r2.f10661g
            d6.g r0 = (d6.g) r0
            int r1 = r0.f2011h
            int r1 = r1 + 4
            r0.f2011h = r1
            if (r1 >= 0) goto Lf
            r1 = 0
            r0.f2011h = r1
        Lf:
            return
    }

    public final void x(java.util.Set r4) {
            r3 = this;
            r3.w()
            java.util.Iterator r4 = r4.iterator()
        L7:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r4.next()
            k5.c r0 = (k5.c) r0
            java.lang.String r1 = r0.a()
            r3.s(r1)
            java.lang.String r1 = " = "
            java.io.Writer r2 = r3.f10661g
            r2.write(r1)
            w5.a r0 = r0.b()
            r3.g(r0)
            r0 = 10
            r2.write(r0)
            goto L7
        L2e:
            r3.u()
            return
    }

    public final void y(long r3, java.lang.Character r5) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            java.io.Writer r1 = r2.f10661g
            if (r0 >= 0) goto L12
            java.lang.String r0 = "-0x"
            r1.write(r0)
            long r3 = -r3
            r2.C(r3)
            goto L1a
        L12:
            java.lang.String r0 = "0x"
            r1.write(r0)
            r2.C(r3)
        L1a:
            if (r5 == 0) goto L23
            char r3 = r5.charValue()
            r1.write(r3)
        L23:
            return
    }

    public final void z(int r5) {
            r4 = this;
            if (r5 >= 0) goto L7
            r0 = 45
            r4.write(r0)
        L7:
            r0 = 15
        L9:
            int r1 = r5 % 10
            int r1 = java.lang.Math.abs(r1)
            int r2 = r0 + (-1)
            int r1 = r1 + 48
            char r1 = (char) r1
            char[] r3 = r4.f2354i
            r3[r0] = r1
            int r5 = r5 / 10
            if (r5 != 0) goto L22
            int r5 = 16 - r0
            r4.write(r3, r0, r5)
            return
        L22:
            r0 = r2
            goto L9
    }
}
