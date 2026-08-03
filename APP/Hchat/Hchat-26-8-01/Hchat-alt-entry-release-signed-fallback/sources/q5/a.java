package q5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class a extends java.io.Writer {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.io.Writer f10661g;

    public a(java.io.Writer r1) {
            r0 = this;
            r0.<init>()
            r0.f10661g = r1
            return
    }

    public void a(p5.a r4) {
            r3 = this;
            java.lang.String r0 = "Annotation["
            java.io.Writer r1 = r3.f10661g
            r1.write(r0)
            java.lang.String r0 = r4.getType()
            r3.t(r0)
            java.util.Set r4 = r4.a()
            java.util.Iterator r4 = r4.iterator()
        L16:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r4.next()
            k5.c r0 = (k5.c) r0
            java.lang.String r2 = ", "
            r1.write(r2)
            java.lang.String r2 = r0.a()
            r3.s(r2)
            r2 = 61
            r1.write(r2)
            w5.a r0 = r0.b()
            r3.g(r0)
            goto L16
        L3b:
            r4 = 93
            r1.write(r4)
            return
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(char r2) {
            r1 = this;
            java.io.Writer r0 = r1.f10661g
            java.io.Writer r2 = r0.append(r2)
            return r2
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(java.lang.CharSequence r2) {
            r1 = this;
            java.io.Writer r0 = r1.f10661g
            java.io.Writer r2 = r0.append(r2)
            return r2
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(java.lang.CharSequence r2, int r3, int r4) {
            r1 = this;
            java.io.Writer r0 = r1.f10661g
            java.io.Writer r2 = r0.append(r2, r3, r4)
            return r2
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.lang.Appendable append(char r2) {
            r1 = this;
            java.io.Writer r0 = r1.f10661g
            java.io.Writer r2 = r0.append(r2)
            return r2
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r2) {
            r1 = this;
            java.io.Writer r0 = r1.f10661g
            java.io.Writer r2 = r0.append(r2)
            return r2
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r2, int r3, int r4) {
            r1 = this;
            java.io.Writer r0 = r1.f10661g
            java.io.Writer r2 = r0.append(r2, r3, r4)
            return r2
    }

    public void b(p5.b r5) {
            r4 = this;
            java.lang.String r0 = "Array["
            java.io.Writer r1 = r4.f10661g
            r1.write(r0)
            java.util.List r5 = r5.a()
            java.util.Iterator r5 = r5.iterator()
            r0 = 1
        L10:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r5.next()
            w5.a r2 = (w5.a) r2
            if (r0 == 0) goto L20
            r0 = 0
            goto L25
        L20:
            java.lang.String r3 = ", "
            r1.write(r3)
        L25:
            r4.g(r2)
            goto L10
        L29:
            r5 = 93
            r1.write(r5)
            return
    }

    public void c(n5.a r5) {
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

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.io.Writer r0 = r1.f10661g
            r0.close()
            return
    }

    public void e(java.lang.CharSequence r9) {
            r8 = this;
            r0 = 0
            char r0 = r9.charAt(r0)
            java.io.Writer r1 = r8.f10661g
            r1.write(r0)
            r0 = 1
            r2 = r0
            r3 = r2
        Ld:
            int r4 = r9.length()
            r5 = 59
            java.lang.String r6 = "Invalid type string: %s"
            if (r2 >= r4) goto L58
            char r4 = r9.charAt(r2)
            r7 = 47
            if (r4 != r7) goto L3a
            if (r2 == r3) goto L32
            java.lang.CharSequence r3 = r9.subSequence(r3, r2)
            r8.s(r3)
            char r3 = r9.charAt(r2)
            r1.write(r3)
            int r3 = r2 + 1
            goto L55
        L32:
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            ah.a.q(r6, r9)
            return
        L3a:
            if (r4 != r5) goto L55
            if (r2 == r3) goto L4d
            java.lang.CharSequence r3 = r9.subSequence(r3, r2)
            r8.s(r3)
            char r3 = r9.charAt(r2)
            r1.write(r3)
            goto L58
        L4d:
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            ah.a.q(r6, r9)
            return
        L55:
            int r2 = r2 + 1
            goto Ld
        L58:
            int r1 = r9.length()
            int r1 = r1 - r0
            if (r2 != r1) goto L66
            char r0 = r9.charAt(r2)
            if (r0 != r5) goto L66
            return
        L66:
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            ah.a.q(r6, r9)
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
            r1 = this;
            java.io.Writer r0 = r1.f10661g
            r0.flush()
            return
    }

    public void g(w5.a r6) {
            r5 = this;
            int r0 = r6.h()
            java.lang.String r1 = "0x%x"
            java.io.Writer r2 = r5.f10661g
            if (r0 == 0) goto Lf3
            r3 = 6
            if (r0 == r3) goto Ldf
            r3 = 2
            if (r0 == r3) goto Lcb
            r3 = 3
            if (r0 == r3) goto Lb7
            r3 = 4
            if (r0 == r3) goto La3
            r1 = 16
            if (r0 == r1) goto L97
            r1 = 17
            if (r0 == r1) goto L8b
            switch(r0) {
                case 21: goto L81;
                case 22: goto L77;
                case 23: goto L6d;
                case 24: goto L63;
                case 25: goto L59;
                case 26: goto L4f;
                case 27: goto L45;
                case 28: goto L3f;
                case 29: goto L39;
                case 30: goto L33;
                case 31: goto L27;
                default: goto L21;
            }
        L21:
            java.lang.String r6 = "Unknown encoded value type"
            j8.o.t(r6)
            return
        L27:
            b6.a r6 = (b6.a) r6
            boolean r6 = r6.f492g
            java.lang.String r6 = java.lang.Boolean.toString(r6)
            r2.write(r6)
            return
        L33:
            java.lang.String r6 = "null"
            r2.write(r6)
            return
        L39:
            p5.a r6 = (p5.a) r6
            r5.a(r6)
            return
        L3f:
            p5.b r6 = (p5.b) r6
            r5.b(r6)
            return
        L45:
            p5.c r6 = (p5.c) r6
            i5.a r6 = r6.a()
            r5.h(r6)
            return
        L4f:
            p5.e r6 = (p5.e) r6
            i5.b r6 = r6.a()
            r5.i(r6)
            return
        L59:
            p5.d r6 = (p5.d) r6
            i5.a r6 = r6.a()
            r5.h(r6)
            return
        L63:
            p5.i r6 = (p5.i) r6
            java.lang.String r6 = r6.a()
            r5.t(r6)
            return
        L6d:
            p5.h r6 = (p5.h) r6
            java.lang.String r6 = r6.a()
            r5.m(r6)
            return
        L77:
            p5.f r6 = (p5.f) r6
            n5.c r6 = r6.a()
            r5.k(r6)
            return
        L81:
            p5.g r6 = (p5.g) r6
            n5.d r6 = r6.a()
            r5.l(r6)
            return
        L8b:
            b6.d r6 = (b6.d) r6
            double r0 = r6.f495g
            java.lang.String r6 = java.lang.Double.toString(r0)
            r2.write(r6)
            return
        L97:
            b6.e r6 = (b6.e) r6
            float r6 = r6.f496g
            java.lang.String r6 = java.lang.Float.toString(r6)
            r2.write(r6)
            return
        La3:
            b6.f r6 = (b6.f) r6
            int r6 = r6.f497g
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r6 = java.lang.String.format(r1, r6)
            r2.write(r6)
            return
        Lb7:
            b6.c r6 = (b6.c) r6
            char r6 = r6.f494g
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r6 = java.lang.String.format(r1, r6)
            r2.write(r6)
            return
        Lcb:
            b6.i r6 = (b6.i) r6
            short r6 = r6.f500g
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r6 = java.lang.String.format(r1, r6)
            r2.write(r6)
            return
        Ldf:
            b6.g r6 = (b6.g) r6
            long r3 = r6.f498g
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r6 = java.lang.String.format(r1, r6)
            r2.write(r6)
            return
        Lf3:
            b6.b r6 = (b6.b) r6
            byte r6 = r6.f493g
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r6 = java.lang.String.format(r1, r6)
            r2.write(r6)
            return
    }

    public void h(i5.a r3) {
            r2 = this;
            java.lang.String r0 = r3.f1()
            r2.t(r0)
            java.lang.String r0 = "->"
            java.io.Writer r1 = r2.f10661g
            r1.write(r0)
            java.lang.String r0 = r3.getName()
            r2.s(r0)
            r0 = 58
            r1.write(r0)
            java.lang.String r3 = r3.getType()
            r2.t(r3)
            return
    }

    public void i(i5.b r4) {
            r3 = this;
            java.lang.String r0 = r4.f1()
            r3.t(r0)
            java.lang.String r0 = "->"
            java.io.Writer r1 = r3.f10661g
            r1.write(r0)
            java.lang.String r0 = r4.getName()
            r3.s(r0)
            r0 = 40
            r1.write(r0)
            java.util.List r0 = r4.g1()
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r0.next()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.t(r2)
            goto L22
        L32:
            r0 = 41
            r1.write(r0)
            java.lang.String r4 = r4.h1()
            r3.t(r4)
            return
    }

    public final void k(n5.c r4) {
            r3 = this;
            int r0 = r4.g1()
            java.util.Map r1 = f5.d.f3276a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L30
            java.io.Writer r0 = r3.f10661g
            r0.write(r1)
            r1 = 64
            r0.write(r1)
            v5.b r4 = r4.f1()
            boolean r0 = r4 instanceof i5.b
            if (r0 == 0) goto L2a
            i5.b r4 = (i5.b) r4
            r3.i(r4)
            return
        L2a:
            i5.a r4 = (i5.a) r4
            r3.h(r4)
            return
        L30:
            c6.a r4 = new c6.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 0
            java.lang.String r2 = "Invalid method handle type: %d"
            r4.<init>(r1, r2, r0)
            throw r4
    }

    public final void l(n5.d r4) {
            r3 = this;
            r0 = 40
            java.io.Writer r1 = r3.f10661g
            r1.write(r0)
            java.util.List r0 = r4.e1()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r0.next()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.t(r2)
            goto Lf
        L1f:
            r0 = 41
            r1.write(r0)
            java.lang.String r4 = r4.f1()
            r3.t(r4)
            return
    }

    public final void m(java.lang.CharSequence r7) {
            r6 = this;
            java.io.Writer r0 = r6.f10661g
            r1 = 34
            r0.write(r1)
            java.lang.String r7 = r7.toString()
            r2 = 0
        Lc:
            int r3 = r7.length()
            if (r2 >= r3) goto L82
            char r3 = r7.charAt(r2)
            r4 = 32
            r5 = 127(0x7f, float:1.78E-43)
            if (r3 < r4) goto L2f
            if (r3 >= r5) goto L2f
            r4 = 39
            r5 = 92
            if (r3 == r4) goto L28
            if (r3 == r1) goto L28
            if (r3 != r5) goto L2b
        L28:
            r0.write(r5)
        L2b:
            r0.write(r3)
            goto L7f
        L2f:
            if (r3 > r5) goto L50
            r4 = 9
            if (r3 == r4) goto L4a
            r4 = 10
            if (r3 == r4) goto L44
            r4 = 13
            if (r3 == r4) goto L3e
            goto L50
        L3e:
            java.lang.String r3 = "\\r"
            r0.write(r3)
            goto L7f
        L44:
            java.lang.String r3 = "\\n"
            r0.write(r3)
            goto L7f
        L4a:
            java.lang.String r3 = "\\t"
            r0.write(r3)
            goto L7f
        L50:
            java.lang.String r4 = "\\u"
            r0.write(r4)
            int r4 = r3 >> 12
            r5 = 16
            char r4 = java.lang.Character.forDigit(r4, r5)
            r0.write(r4)
            int r4 = r3 >> 8
            r4 = r4 & 15
            char r4 = java.lang.Character.forDigit(r4, r5)
            r0.write(r4)
            int r4 = r3 >> 4
            r4 = r4 & 15
            char r4 = java.lang.Character.forDigit(r4, r5)
            r0.write(r4)
            r3 = r3 & 15
            char r3 = java.lang.Character.forDigit(r3, r5)
            r0.write(r3)
        L7f:
            int r2 = r2 + 1
            goto Lc
        L82:
            r0.write(r1)
            return
    }

    public final void o(v5.b r2) {
            r1 = this;
            boolean r0 = r2 instanceof n5.f
            if (r0 == 0) goto La
            n5.f r2 = (n5.f) r2
            r1.m(r2)
            return
        La:
            boolean r0 = r2 instanceof v5.c
            if (r0 == 0) goto L14
            v5.c r2 = (v5.c) r2
            r1.t(r2)
            return
        L14:
            boolean r0 = r2 instanceof i5.a
            if (r0 == 0) goto L1e
            i5.a r2 = (i5.a) r2
            r1.h(r2)
            return
        L1e:
            boolean r0 = r2 instanceof i5.b
            if (r0 == 0) goto L28
            i5.b r2 = (i5.b) r2
            r1.i(r2)
            return
        L28:
            boolean r0 = r2 instanceof n5.d
            if (r0 == 0) goto L32
            n5.d r2 = (n5.d) r2
            r1.l(r2)
            return
        L32:
            boolean r0 = r2 instanceof n5.c
            if (r0 == 0) goto L3c
            n5.c r2 = (n5.c) r2
            r1.k(r2)
            return
        L3c:
            boolean r0 = r2 instanceof n5.a
            if (r0 == 0) goto L46
            n5.a r2 = (n5.a) r2
            r1.c(r2)
            return
        L46:
            java.lang.Class r2 = r2.getClass()
            java.lang.String r0 = "Not a known reference type: "
            java.lang.String r2 = p.a.k(r2, r0)
            j8.o.t(r2)
            return
    }

    public final void q(i5.b r4) {
            r3 = this;
            java.lang.String r0 = r4.getName()
            r3.s(r0)
            r0 = 40
            java.io.Writer r1 = r3.f10661g
            r1.write(r0)
            java.util.List r0 = r4.g1()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r0.next()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.t(r2)
            goto L16
        L26:
            r0 = 41
            r1.write(r0)
            java.lang.String r4 = r4.h1()
            r3.t(r4)
            return
    }

    public void s(java.lang.CharSequence r2) {
            r1 = this;
            java.io.Writer r0 = r1.f10661g
            r0.append(r2)
            return
    }

    public final void t(java.lang.CharSequence r6) {
            r5 = this;
            r0 = 0
        L1:
            int r1 = r6.length()
            java.lang.String r2 = "Invalid type string: %s"
            if (r0 >= r1) goto L6a
            char r1 = r6.charAt(r0)
            r3 = 76
            if (r1 != r3) goto L1d
            int r1 = r6.length()
            java.lang.CharSequence r6 = r6.subSequence(r0, r1)
            r5.e(r6)
            return
        L1d:
            r3 = 91
            java.io.Writer r4 = r5.f10661g
            if (r1 != r3) goto L29
            r4.write(r1)
            int r0 = r0 + 1
            goto L1
        L29:
            r3 = 90
            if (r1 == r3) goto L56
            r3 = 66
            if (r1 == r3) goto L56
            r3 = 83
            if (r1 == r3) goto L56
            r3 = 67
            if (r1 == r3) goto L56
            r3 = 73
            if (r1 == r3) goto L56
            r3 = 74
            if (r1 == r3) goto L56
            r3 = 70
            if (r1 == r3) goto L56
            r3 = 68
            if (r1 == r3) goto L56
            r3 = 86
            if (r1 != r3) goto L4e
            goto L56
        L4e:
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            ah.a.q(r2, r6)
            return
        L56:
            r4.write(r1)
            int r1 = r6.length()
            int r1 = r1 + (-1)
            if (r0 != r1) goto L62
            return
        L62:
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            ah.a.q(r2, r6)
            return
        L6a:
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            ah.a.q(r2, r6)
            return
    }

    @Override // java.io.Writer
    public final void write(int r2) {
            r1 = this;
            java.io.Writer r0 = r1.f10661g
            r0.write(r2)
            return
    }

    @Override // java.io.Writer
    public final void write(java.lang.String r2) {
            r1 = this;
            java.io.Writer r0 = r1.f10661g
            r0.write(r2)
            return
    }

    @Override // java.io.Writer
    public final void write(java.lang.String r2, int r3, int r4) {
            r1 = this;
            java.io.Writer r0 = r1.f10661g
            r0.write(r2, r3, r4)
            return
    }

    @Override // java.io.Writer
    public final void write(char[] r2) {
            r1 = this;
            java.io.Writer r0 = r1.f10661g
            r0.write(r2)
            return
    }

    @Override // java.io.Writer
    public final void write(char[] r2, int r3, int r4) {
            r1 = this;
            java.io.Writer r0 = r1.f10661g
            r0.write(r2, r3, r4)
            return
    }
}
