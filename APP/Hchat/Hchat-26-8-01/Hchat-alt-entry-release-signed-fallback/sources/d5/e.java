package d5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class e extends b5.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b5.i f1989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t5.d f1990i;

    public e(b5.i r1, int r2, t5.d r3) {
            r0 = this;
            r0.<init>(r2)
            r0.f1989h = r1
            r0.f1990i = r3
            return
    }

    public static void d(e5.a r6, long r7) {
            long r0 = d6.h.f2017e
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L84
            long r0 = d6.h.f2018f
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L84
            long r0 = d6.h.f2019g
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L84
            long r0 = d6.h.f2020h
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L19
            goto L84
        L19:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L83
            r0 = -9223372036854775808
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L29
            goto L83
        L29:
            double r0 = java.lang.Double.longBitsToDouble(r7)
            boolean r2 = java.lang.Double.isNaN(r0)
            if (r2 == 0) goto L34
            goto L83
        L34:
            java.text.DecimalFormat r2 = d6.h.f2021i
            java.lang.String r3 = r2.format(r7)
            java.lang.String r0 = r2.format(r0)
            r1 = 46
            int r1 = r0.indexOf(r1)
            java.lang.String r2 = "E"
            int r2 = r0.indexOf(r2)
            java.lang.String r4 = "000"
            int r4 = r0.indexOf(r4)
            r5 = 0
            if (r4 <= r1) goto L62
            if (r4 >= r2) goto L62
            java.lang.String r1 = r0.substring(r5, r4)
            java.lang.String r0 = r0.substring(r2)
            java.lang.String r0 = r1.concat(r0)
            goto L78
        L62:
            java.lang.String r4 = "999"
            int r4 = r0.indexOf(r4)
            if (r4 <= r1) goto L78
            if (r4 >= r2) goto L78
            java.lang.String r1 = r0.substring(r5, r4)
            java.lang.String r0 = r0.substring(r2)
            java.lang.String r0 = r1.concat(r0)
        L78:
            int r0 = r0.length()
            int r1 = r3.length()
            if (r0 >= r1) goto L83
            goto L84
        L83:
            return
        L84:
            java.lang.String r0 = "    # "
            r6.write(r0)
            double r7 = java.lang.Double.longBitsToDouble(r7)
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L99
            java.lang.String r7 = "Double.POSITIVE_INFINITY"
            r6.write(r7)
            return
        L99:
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto La5
            java.lang.String r7 = "Double.NEGATIVE_INFINITY"
            r6.write(r7)
            return
        La5:
            boolean r0 = java.lang.Double.isNaN(r7)
            if (r0 == 0) goto Lb1
            java.lang.String r7 = "Double.NaN"
            r6.write(r7)
            return
        Lb1:
            r0 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc0
            java.lang.String r7 = "Double.MAX_VALUE"
            r6.write(r7)
            return
        Lc0:
            r0 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto Lcf
            java.lang.String r7 = "Math.PI"
            r6.write(r7)
            return
        Lcf:
            r0 = 4613303445314885481(0x4005bf0a8b145769, double:2.718281828459045)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto Lde
            java.lang.String r7 = "Math.E"
            r6.write(r7)
            return
        Lde:
            java.lang.String r7 = java.lang.Double.toString(r7)
            r6.write(r7)
            return
    }

    public static void e(e5.a r6, int r7) {
            int r0 = d6.h.f2013a
            if (r7 == r0) goto L94
            int r0 = d6.h.f2014b
            if (r7 == r0) goto L94
            int r0 = d6.h.f2015c
            if (r7 == r0) goto L94
            int r0 = d6.h.f2016d
            if (r7 != r0) goto L12
            goto L94
        L12:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r7 == r0) goto L93
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 != r0) goto L1d
            goto L93
        L1d:
            int r0 = r7 >> 24
            int r1 = r7 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r7
            r3 = 127(0x7f, float:1.78E-43)
            if (r0 == r3) goto L2e
            r3 = 1
            if (r0 != r3) goto L37
        L2e:
            r0 = 31
            if (r1 >= r0) goto L37
            r0 = 4095(0xfff, float:5.738E-42)
            if (r2 >= r0) goto L37
            goto L93
        L37:
            float r0 = java.lang.Float.intBitsToFloat(r7)
            boolean r1 = java.lang.Float.isNaN(r0)
            if (r1 == 0) goto L42
            goto L93
        L42:
            java.text.DecimalFormat r1 = d6.h.f2021i
            long r2 = (long) r7
            java.lang.String r2 = r1.format(r2)
            double r3 = (double) r0
            java.lang.String r0 = r1.format(r3)
            r1 = 46
            int r1 = r0.indexOf(r1)
            java.lang.String r3 = "E"
            int r3 = r0.indexOf(r3)
            java.lang.String r4 = "000"
            int r4 = r0.indexOf(r4)
            r5 = 0
            if (r4 <= r1) goto L72
            if (r4 >= r3) goto L72
            java.lang.String r1 = r0.substring(r5, r4)
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r0 = r1.concat(r0)
            goto L88
        L72:
            java.lang.String r4 = "999"
            int r4 = r0.indexOf(r4)
            if (r4 <= r1) goto L88
            if (r4 >= r3) goto L88
            java.lang.String r1 = r0.substring(r5, r4)
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r0 = r1.concat(r0)
        L88:
            int r0 = r0.length()
            int r1 = r2.length()
            if (r0 >= r1) goto L93
            goto L94
        L93:
            return
        L94:
            java.lang.String r0 = "    # "
            r6.write(r0)
            float r7 = java.lang.Float.intBitsToFloat(r7)
            r0 = 2139095040(0x7f800000, float:Infinity)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto La9
            java.lang.String r7 = "Float.POSITIVE_INFINITY"
            r6.write(r7)
            return
        La9:
            r0 = -8388608(0xffffffffff800000, float:-Infinity)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto Lb5
            java.lang.String r7 = "Float.NEGATIVE_INFINITY"
            r6.write(r7)
            return
        Lb5:
            boolean r0 = java.lang.Float.isNaN(r7)
            if (r0 == 0) goto Lc1
            java.lang.String r7 = "Float.NaN"
            r6.write(r7)
            return
        Lc1:
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto Lce
            java.lang.String r7 = "Float.MAX_VALUE"
            r6.write(r7)
            return
        Lce:
            r0 = 1078530011(0x40490fdb, float:3.1415927)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto Ldb
            java.lang.String r7 = "(float)Math.PI"
            r6.write(r7)
            return
        Ldb:
            r0 = 1076754516(0x402df854, float:2.7182817)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto Le8
            java.lang.String r7 = "(float)Math.E"
            r6.write(r7)
            return
        Le8:
            java.lang.String r7 = java.lang.Float.toString(r7)
            r6.write(r7)
            r7 = 102(0x66, float:1.43E-43)
            r6.write(r7)
            return
    }

    @Override // b5.j
    public final double b() {
            r2 = this;
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            return r0
    }

    @Override // b5.j
    public boolean c(e5.a r18) {
            r17 = this;
            r1 = r17
            r2 = r18
            t5.d r3 = r1.f1990i
            f5.f r4 = r3.i()
            boolean r0 = r3 instanceof l5.h
            java.lang.String r5 = "\n"
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L54
            r0 = r3
            l5.h r0 = (l5.h) r0
            k5.u r8 = r0.f7847a
            androidx.lifecycle.x r8 = r8.f7264b
            int r0 = r0.f7849c
            int r0 = r0 + r6
            int r0 = r8.O(r0)
            r0 = r0 & 63
            int r8 = f5.i.f3303a
            java.lang.String r8 = "generic-error"
            switch(r0) {
                case 1: goto L43;
                case 2: goto L40;
                case 3: goto L3d;
                case 4: goto L3a;
                case 5: goto L37;
                case 6: goto L34;
                case 7: goto L31;
                case 8: goto L2e;
                case 9: goto L2b;
                default: goto L29;
            }
        L29:
            r9 = r7
            goto L44
        L2b:
            java.lang.String r9 = "instantiation-error"
            goto L44
        L2e:
            java.lang.String r9 = "class-change-error"
            goto L44
        L31:
            java.lang.String r9 = "illegal-method-access"
            goto L44
        L34:
            java.lang.String r9 = "illegal-field-access"
            goto L44
        L37:
            java.lang.String r9 = "illegal-class-access"
            goto L44
        L3a:
            java.lang.String r9 = "no-such-method"
            goto L44
        L3d:
            java.lang.String r9 = "no-such-field"
            goto L44
        L40:
            java.lang.String r9 = "no-such-class"
            goto L44
        L43:
            r9 = r8
        L44:
            if (r9 != 0) goto L52
            java.lang.String r9 = "#was invalid verification error type: "
            r2.write(r9)
            r2.z(r0)
            r2.write(r5)
            goto L55
        L52:
            r8 = r9
            goto L55
        L54:
            r8 = r7
        L55:
            boolean r0 = r3 instanceof t5.h
            java.lang.String r9 = "#"
            r10 = 0
            if (r0 == 0) goto Lab
            r0 = r3
            t5.h r0 = (t5.h) r0
            v5.b r0 = r0.a()
            r0.a()     // Catch: v5.a -> L6d
            d5.b r11 = new d5.b     // Catch: v5.a -> L6d
            r11.<init>(r2, r0, r10)     // Catch: v5.a -> L6d
            r0 = r10
            goto L81
        L6d:
            r0 = move-exception
            r2.write(r9)
            java.lang.String r11 = r0.getMessage()
            r2.write(r11)
            r2.write(r5)
            d5.c r11 = new d5.c
            r11.<init>(r2, r0, r10)
            r0 = r6
        L81:
            boolean r12 = r3 instanceof t5.a
            if (r12 == 0) goto La9
            r12 = r3
            t5.a r12 = (t5.a) r12
            v5.b r12 = r12.f()     // Catch: v5.a -> L95
            r12.a()     // Catch: v5.a -> L95
            d5.b r13 = new d5.b     // Catch: v5.a -> L95
            r13.<init>(r2, r12, r6)     // Catch: v5.a -> L95
            goto Lae
        L95:
            r0 = move-exception
            r2.write(r9)
            java.lang.String r11 = r0.getMessage()
            r2.write(r11)
            r2.write(r5)
            d5.c r11 = new d5.c
            r11.<init>(r2, r0, r6)
            r0 = r6
        La9:
            r13 = r7
            goto Lae
        Lab:
            r11 = r7
            r13 = r11
            r0 = r10
        Lae:
            boolean r5 = r3 instanceof u5.a
            b5.i r12 = r1.f1989h
            if (r5 == 0) goto L11b
            f5.f r5 = r3.i()
            int r5 = r5.ordinal()
            r14 = 38
            int r15 = r1.f486g
            if (r5 == r14) goto L103
            r14 = 43
            r16 = r6
            r6 = -1
            if (r5 == r14) goto Lf0
            r14 = 44
            if (r5 != r14) goto Le0
            r5 = r3
            u5.a r5 = (u5.a) r5
            int r5 = r5.l()
            int r5 = r5 + r15
            java.lang.Object r7 = r12.f484j
            ac.k r7 = (ac.k) r7
            int r5 = r7.k(r5)
            if (r5 != r6) goto L11d
            goto L113
        Le0:
            d6.f r0 = new d6.f
            f5.f r2 = r3.i()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "Invalid 31t opcode: %s"
            r0.<init>(r7, r3, r2)
            throw r0
        Lf0:
            r5 = r3
            u5.a r5 = (u5.a) r5
            int r5 = r5.l()
            int r5 = r5 + r15
            java.lang.Object r7 = r12.f483i
            ac.k r7 = (ac.k) r7
            int r5 = r7.k(r5)
            if (r5 != r6) goto L11d
            goto L113
        L103:
            r16 = r6
            r5 = r3
            u5.a r5 = (u5.a) r5     // Catch: b5.g -> L113
            int r5 = r5.l()     // Catch: b5.g -> L113
            int r15 = r15 + r5
            f5.f r5 = f5.f.f3287u     // Catch: b5.g -> L113
            r12.e(r15, r5)     // Catch: b5.g -> L113
            goto L11d
        L113:
            java.lang.String r0 = "#invalid payload reference\n"
            r2.write(r0)
            r0 = r16
            goto L11d
        L11b:
            r16 = r6
        L11d:
            int r5 = r4.f3293k
            r6 = r5 & 2
            if (r6 == 0) goto L143
            java.lang.Object r6 = r12.f476b
            b5.c r6 = (b5.c) r6
            java.lang.Object r6 = r6.f469a
            a5.a r6 = (a5.a) r6
            int r6 = r6.f56h
            r7 = 14
            if (r6 < r7) goto L132
            goto L13c
        L132:
            r5 = r5 & 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L137
            goto L143
        L137:
            f5.f r5 = f5.f.f3284r
            if (r4 != r5) goto L13c
            goto L143
        L13c:
            java.lang.String r0 = "#disallowed odex opcode\n"
            r2.write(r0)
            r0 = r16
        L143:
            if (r0 == 0) goto L148
            r2.write(r9)
        L148:
            f5.f r4 = r3.i()
            int r4 = r4.f3295m
            int r4 = t3.c.b(r4)
            java.lang.String r5 = "inline@"
            java.lang.String r6 = "vtable@"
            r7 = 32
            java.lang.String r9 = ", "
            switch(r4) {
                case 0: goto L38d;
                case 1: goto L363;
                case 2: goto L34d;
                case 3: goto L343;
                case 4: goto L333;
                case 5: goto L323;
                case 6: goto L38d;
                case 7: goto L312;
                case 8: goto L2d3;
                case 9: goto L2d3;
                case 10: goto L2d3;
                case 11: goto L2c2;
                case 12: goto L2a5;
                case 13: goto L28e;
                case 14: goto L263;
                case 15: goto L2a5;
                case 16: goto L24c;
                case 17: goto L23b;
                case 18: goto L216;
                case 19: goto L38d;
                case 20: goto L312;
                case 21: goto L2d3;
                case 22: goto L2c2;
                case 23: goto L23b;
                case 24: goto L205;
                case 25: goto L1eb;
                case 26: goto L1d1;
                case 27: goto L1c0;
                case 28: goto L1a6;
                case 29: goto L18c;
                case 30: goto L175;
                case 31: goto L15e;
                case 32: goto L2d3;
                default: goto L15d;
            }
        L15d:
            return r10
        L15e:
            r17.k(r18)
            r2.write(r7)
            r17.i(r18)
            r2.write(r9)
            r11.a()
            r2.write(r9)
            r13.a()
            goto L396
        L175:
            r17.k(r18)
            r2.write(r7)
            r17.j(r18)
            r2.write(r9)
            r11.a()
            r2.write(r9)
            r13.a()
            goto L396
        L18c:
            r17.k(r18)
            r2.write(r7)
            r17.i(r18)
            r2.write(r9)
            r2.write(r6)
            t5.m r3 = (t5.m) r3
            int r3 = r3.o()
            r2.z(r3)
            goto L396
        L1a6:
            r17.k(r18)
            r2.write(r7)
            r17.i(r18)
            r2.write(r9)
            r2.write(r5)
            t5.c r3 = (t5.c) r3
            int r3 = r3.m()
            r2.z(r3)
            goto L396
        L1c0:
            r17.k(r18)
            r2.write(r7)
            r17.i(r18)
            r2.write(r9)
            r11.a()
            goto L396
        L1d1:
            r17.k(r18)
            r2.write(r7)
            r17.j(r18)
            r2.write(r9)
            r2.write(r6)
            t5.m r3 = (t5.m) r3
            int r3 = r3.o()
            r2.z(r3)
            goto L396
        L1eb:
            r17.k(r18)
            r2.write(r7)
            r17.j(r18)
            r2.write(r9)
            r2.write(r5)
            t5.c r3 = (t5.c) r3
            int r3 = r3.m()
            r2.z(r3)
            goto L396
        L205:
            r17.k(r18)
            r2.write(r7)
            r17.j(r18)
            r2.write(r9)
            r11.a()
            goto L396
        L216:
            r17.k(r18)
            r2.write(r7)
            r17.g(r18)
            r2.write(r9)
            r17.m(r18)
            r2.write(r9)
            l5.p r3 = (l5.p) r3
            k5.u r4 = r3.f7847a
            androidx.lifecycle.x r4 = r4.f7264b
            int r3 = r3.f7849c
            int r3 = r3 + 3
            int r3 = r4.O(r3)
            r1.l(r2, r3)
            goto L396
        L23b:
            r17.k(r18)
            r2.write(r7)
            r17.g(r18)
            r2.write(r9)
            r17.m(r18)
            goto L396
        L24c:
            r17.k(r18)
            r2.write(r7)
            r17.g(r18)
            r2.write(r9)
            r17.m(r18)
            r2.write(r9)
            r17.n(r18)
            goto L396
        L263:
            r17.k(r18)
            r2.write(r7)
            r17.g(r18)
            r2.write(r9)
            r17.m(r18)
            r2.write(r9)
            java.lang.String r4 = "field@0x"
            r2.write(r4)
            l5.n r3 = (l5.n) r3
            k5.u r4 = r3.f7847a
            androidx.lifecycle.x r4 = r4.f7264b
            int r3 = r3.f7849c
            int r3 = r3 + 2
            int r3 = r4.P(r3)
            long r3 = (long) r3
            r2.C(r3)
            goto L396
        L28e:
            r17.k(r18)
            r2.write(r7)
            r17.g(r18)
            r2.write(r9)
            r17.m(r18)
            r2.write(r9)
            r11.a()
            goto L396
        L2a5:
            r17.k(r18)
            r2.write(r7)
            r17.g(r18)
            r2.write(r9)
            r17.m(r18)
            r2.write(r9)
            t5.n r3 = (t5.n) r3
            long r3 = r3.g()
            r2.A(r3)
            goto L396
        L2c2:
            r17.k(r18)
            r2.write(r7)
            r17.g(r18)
            r2.write(r9)
            r17.n(r18)
            goto L396
        L2d3:
            r17.k(r18)
            r2.write(r7)
            r17.g(r18)
            r2.write(r9)
            r4 = r3
            t5.n r4 = (t5.n) r4
            long r4 = r4.g()
            r2.A(r4)
            f5.f r4 = r3.i()
            int r4 = r4.f3293k
            r4 = r4 & r7
            if (r4 == 0) goto L2fd
            t5.n r3 = (t5.n) r3
            long r3 = r3.g()
            d(r2, r3)
            goto L396
        L2fd:
            t5.e r3 = (t5.e) r3
            int r4 = r3.k()
            boolean r4 = r1.f(r2, r4)
            if (r4 != 0) goto L396
            int r3 = r3.k()
            e(r2, r3)
            goto L396
        L312:
            r17.k(r18)
            r2.write(r7)
            r17.g(r18)
            r2.write(r9)
            r11.a()
            goto L396
        L323:
            r17.k(r18)
            r2.write(r7)
            r2.write(r8)
            r2.write(r9)
            r11.a()
            goto L396
        L333:
            r17.k(r18)
            r2.write(r7)
            r17.g(r18)
            r2.write(r9)
            r17.m(r18)
            goto L396
        L343:
            r17.k(r18)
            r2.write(r7)
            r17.g(r18)
            goto L396
        L34d:
            r17.k(r18)
            r2.write(r7)
            r17.g(r18)
            r2.write(r9)
            t5.n r3 = (t5.n) r3
            long r3 = r3.g()
            r2.A(r3)
            goto L396
        L363:
            boolean r4 = r3 instanceof l5.f0
            if (r4 == 0) goto L389
            java.lang.String r4 = "#unknown opcode: 0x"
            r2.write(r4)
            l5.f0 r3 = (l5.f0) r3
            k5.u r4 = r3.f7847a
            androidx.lifecycle.x r5 = r4.f7264b
            int r3 = r3.f7849c
            int r5 = r5.O(r3)
            if (r5 != 0) goto L380
            androidx.lifecycle.x r4 = r4.f7264b
            int r5 = r4.P(r3)
        L380:
            long r3 = (long) r5
            r2.C(r3)
            r3 = 10
            r2.write(r3)
        L389:
            r17.k(r18)
            goto L396
        L38d:
            r17.k(r18)
            r2.write(r7)
            r17.n(r18)
        L396:
            if (r0 == 0) goto L39d
            java.lang.String r0 = "\nnop"
            r2.write(r0)
        L39d:
            return r16
    }

    public final boolean f(e5.a r2, int r3) {
            r1 = this;
            b5.i r0 = r1.f1989h
            java.lang.Object r0 = r0.f476b
            b5.c r0 = (b5.c) r0
            java.lang.Object r0 = r0.f469a
            a5.a r0 = (a5.a) r0
            java.lang.Object r0 = r0.f57i
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L24
            java.lang.String r0 = "    # "
            r2.write(r0)
            r2.write(r3)
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    public final void g(e5.a r2) {
            r1 = this;
            t5.d r0 = r1.f1990i
            t5.g r0 = (t5.g) r0
            int r0 = r0.h()
            r1.l(r2, r0)
            return
    }

    public final void i(e5.a r6) {
            r5 = this;
            t5.d r0 = r5.f1990i
            t5.i r0 = (t5.i) r0
            int r1 = r0.b()
            if (r1 != 0) goto L10
            java.lang.String r0 = "{}"
            r6.write(r0)
            return
        L10:
            int r0 = r0.n()
            b5.i r2 = r5.f1989h
            java.lang.Object r2 = r2.f481g
            b5.k r2 = (b5.k) r2
            int r1 = r1 + r0
            int r1 = r1 + (-1)
            int r3 = r2.f489c
            int r2 = r2.f488b
            int r2 = r2 - r3
            r3 = 125(0x7d, float:1.75E-43)
            if (r0 < r2) goto L3c
            java.lang.String r4 = "{p"
            r6.write(r4)
            int r0 = r0 - r2
            r6.z(r0)
            java.lang.String r0 = " .. p"
            r6.write(r0)
            int r1 = r1 - r2
            r6.z(r1)
            r6.write(r3)
            return
        L3c:
            java.lang.String r2 = "{v"
            r6.write(r2)
            r6.z(r0)
            java.lang.String r0 = " .. v"
            r6.write(r0)
            r6.z(r1)
            r6.write(r3)
            return
    }

    public final void j(e5.a r5) {
            r4 = this;
            t5.d r0 = r4.f1990i
            t5.b r0 = (t5.b) r0
            int r1 = r0.b()
            r2 = 123(0x7b, float:1.72E-43)
            r5.write(r2)
            r2 = 1
            if (r1 == r2) goto La4
            r2 = 2
            java.lang.String r3 = ", "
            if (r1 == r2) goto L92
            r2 = 3
            if (r1 == r2) goto L76
            r2 = 4
            if (r1 == r2) goto L50
            r2 = 5
            if (r1 == r2) goto L20
            goto Lab
        L20:
            int r1 = r0.p()
            r4.l(r5, r1)
            r5.write(r3)
            int r1 = r0.j()
            r4.l(r5, r1)
            r5.write(r3)
            int r1 = r0.r()
            r4.l(r5, r1)
            r5.write(r3)
            int r1 = r0.q()
            r4.l(r5, r1)
            r5.write(r3)
            int r0 = r0.d()
            r4.l(r5, r0)
            goto Lab
        L50:
            int r1 = r0.p()
            r4.l(r5, r1)
            r5.write(r3)
            int r1 = r0.j()
            r4.l(r5, r1)
            r5.write(r3)
            int r1 = r0.r()
            r4.l(r5, r1)
            r5.write(r3)
            int r0 = r0.q()
            r4.l(r5, r0)
            goto Lab
        L76:
            int r1 = r0.p()
            r4.l(r5, r1)
            r5.write(r3)
            int r1 = r0.j()
            r4.l(r5, r1)
            r5.write(r3)
            int r0 = r0.r()
            r4.l(r5, r0)
            goto Lab
        L92:
            int r1 = r0.p()
            r4.l(r5, r1)
            r5.write(r3)
            int r0 = r0.j()
            r4.l(r5, r0)
            goto Lab
        La4:
            int r0 = r0.p()
            r4.l(r5, r0)
        Lab:
            r0 = 125(0x7d, float:1.75E-43)
            r5.write(r0)
            return
    }

    public final void k(e5.a r2) {
            r1 = this;
            t5.d r0 = r1.f1990i
            f5.f r0 = r0.i()
            java.lang.String r0 = r0.f3291i
            r2.write(r0)
            return
    }

    public final void l(e5.a r2, int r3) {
            r1 = this;
            b5.i r0 = r1.f1989h
            java.lang.Object r0 = r0.f481g
            b5.k r0 = (b5.k) r0
            r0.o(r2, r3)
            return
    }

    public final void m(e5.a r2) {
            r1 = this;
            t5.d r0 = r1.f1990i
            t5.k r0 = (t5.k) r0
            int r0 = r0.e()
            r1.l(r2, r0)
            return
    }

    public void n(e5.a r1) {
            r0 = this;
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>()
            throw r1
    }
}
