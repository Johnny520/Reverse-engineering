package xe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xe.q f21574b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21575a;

    static {
            xe.q r0 = new xe.q
            bc.g r1 = new bc.g
            r1.<init>()
            r0.<init>(r1)
            xe.q.f21574b = r0
            return
    }

    public q(bc.g r1) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            int r1 = r1.V
            r0.f21575a = r1
            return
    }

    public static java.lang.String a(java.lang.String r5) {
            int r0 = r5.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L52
            char r3 = r5.charAt(r2)
            r4 = 32
            if (r3 == r4) goto L4a
            r4 = 36
            if (r3 == r4) goto L4a
            r4 = 42
            if (r3 == r4) goto L4f
            r4 = 44
            if (r3 == r4) goto L4a
            r4 = 91
            if (r3 == r4) goto L44
            r4 = 93
            if (r3 == r4) goto L4f
            r4 = 46
            if (r3 == r4) goto L4a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 59
            if (r3 == r4) goto L4a
            r4 = 60
            if (r3 == r4) goto L4a
            r4 = 62
            if (r3 == r4) goto L4f
            r4 = 63
            if (r3 == r4) goto L4f
            r1.append(r3)
            goto L4f
        L44:
            r3 = 65
            r1.append(r3)
            goto L4f
        L4a:
            r3 = 95
            r1.append(r3)
        L4f:
            int r2 = r2 + 1
            goto La
        L52:
            java.lang.String r5 = r1.toString()
            return r5
    }

    public static java.lang.String b(double r2) {
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = "Double.NaN"
            return r2
        L9:
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L12
            java.lang.String r2 = "Double.NEGATIVE_INFINITY"
            return r2
        L12:
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L1b
            java.lang.String r2 = "Double.POSITIVE_INFINITY"
            return r2
        L1b:
            r0 = 1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L24
            java.lang.String r2 = "Double.MIN_VALUE"
            return r2
        L24:
            r0 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L30
            java.lang.String r2 = "Double.MAX_VALUE"
            return r2
        L30:
            r0 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L39
            java.lang.String r2 = "Double.MIN_NORMAL"
            return r2
        L39:
            java.lang.String r2 = java.lang.Double.toString(r2)
            java.lang.String r3 = "d"
            java.lang.String r2 = bc.e.i(r2, r3)
            return r2
    }

    public static java.lang.String c(float r1) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L9
            java.lang.String r1 = "Float.NaN"
            return r1
        L9:
            r0 = -8388608(0xffffffffff800000, float:-Infinity)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L12
            java.lang.String r1 = "Float.NEGATIVE_INFINITY"
            return r1
        L12:
            r0 = 2139095040(0x7f800000, float:Infinity)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L1b
            java.lang.String r1 = "Float.POSITIVE_INFINITY"
            return r1
        L1b:
            r0 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L23
            java.lang.String r1 = "Float.MIN_VALUE"
            return r1
        L23:
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L2d
            java.lang.String r1 = "Float.MAX_VALUE"
            return r1
        L2d:
            r0 = 8388608(0x800000, float:1.1754944E-38)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L36
            java.lang.String r1 = "Float.MIN_NORMAL"
            return r1
        L36:
            java.lang.String r1 = java.lang.Float.toString(r1)
            java.lang.String r0 = "f"
            java.lang.String r1 = bc.e.i(r1, r0)
            return r1
    }

    public static java.lang.String f(int r1) {
            r0 = 12
            if (r1 == r0) goto L2e
            r0 = 13
            if (r1 == r0) goto L2b
            r0 = 34
            if (r1 == r0) goto L28
            r0 = 39
            if (r1 == r0) goto L25
            r0 = 92
            if (r1 == r0) goto L22
            switch(r1) {
                case 8: goto L1f;
                case 9: goto L1c;
                case 10: goto L19;
                default: goto L17;
            }
        L17:
            r1 = 0
            return r1
        L19:
            java.lang.String r1 = "\\n"
            return r1
        L1c:
            java.lang.String r1 = "\\t"
            return r1
        L1f:
            java.lang.String r1 = "\\b"
            return r1
        L22:
            java.lang.String r1 = "\\\\"
            return r1
        L25:
            java.lang.String r1 = "'"
            return r1
        L28:
            java.lang.String r1 = "\\\""
            return r1
        L2b:
            java.lang.String r1 = "\\r"
            return r1
        L2e:
            java.lang.String r1 = "\\f"
            return r1
    }

    public static boolean g(java.lang.String r0) {
            if (r0 == 0) goto Lb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public static java.lang.String h(char r2, boolean r3) {
            r0 = 39
            if (r2 != r0) goto L7
            java.lang.String r2 = "'\\''"
            return r2
        L7:
            java.lang.String r0 = f(r2)
            java.lang.String r1 = "'"
            if (r0 == 0) goto L14
            java.lang.String r2 = eh.a.n(r1, r0, r1)
            return r2
        L14:
            java.util.regex.Pattern r0 = kd.d.f7584a
            r0 = 32
            if (r0 > r2) goto L2e
            r0 = 126(0x7e, float:1.77E-43)
            if (r2 > r0) goto L2e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r2)
            r3.append(r1)
            java.lang.String r2 = r3.toString()
            return r2
        L2e:
            java.lang.String r2 = java.lang.Integer.toString(r2)
            if (r3 == 0) goto L3a
            java.lang.String r3 = "(char) "
            java.lang.String r2 = wb.en.g(r3, r2)
        L3a:
            return r2
    }

    public static void j(java.lang.String r3, java.util.function.IntConsumer r4) {
            int r0 = r3.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L14
            int r2 = r3.codePointAt(r1)
            r4.accept(r2)
            int r2 = java.lang.Character.charCount(r2)
            int r1 = r1 + r2
            goto L5
        L14:
            return
    }

    public final java.lang.String d(long r3, boolean r5) {
            r2 = this;
            int r0 = r2.f21575a
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L11
            java.lang.String r3 = "Long.MAX_VALUE"
            return r3
        L11:
            r0 = -9223372036854775808
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L1a
            java.lang.String r3 = "Long.MIN_VALUE"
            return r3
        L1a:
            r0 = 8
            java.lang.String r3 = r2.e(r0, r3, r5)
            return r3
    }

    public final java.lang.String e(int r6, long r7, boolean r9) {
            r5 = this;
            int r0 = r5.f21575a
            if (r0 == 0) goto L77
            r1 = 3
            r2 = 1
            if (r0 != r1) goto L2c
            java.lang.String r0 = java.lang.Long.toHexString(r7)
            r3 = 0
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            java.lang.String r3 = "0x"
            if (r1 >= 0) goto L27
            int r9 = r0.length()
            int r1 = r6 * 2
            int r1 = r9 - r1
            java.lang.String r9 = r0.substring(r1, r9)
            java.lang.String r9 = r3.concat(r9)
            r0 = r9
            r9 = r2
            goto L30
        L27:
            java.lang.String r0 = wb.en.g(r3, r0)
            goto L30
        L2c:
            java.lang.String r0 = java.lang.Long.toString(r7)
        L30:
            r1 = 8
            if (r6 != r1) goto L46
            r3 = -9223372036854775808
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 == 0) goto L45
            long r7 = java.lang.Math.abs(r7)
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 < 0) goto L46
        L45:
            r9 = r2
        L46:
            if (r9 == 0) goto L76
            if (r6 != r1) goto L51
            java.lang.String r6 = "L"
            java.lang.String r6 = bc.e.i(r0, r6)
            return r6
        L51:
            if (r6 == r2) goto L6f
            r7 = 2
            if (r6 == r7) goto L6c
            r7 = 4
            if (r6 == r7) goto L69
            if (r6 != r1) goto L5e
            java.lang.String r6 = "(long) "
            goto L71
        L5e:
            java.lang.String r7 = "Unexpected number type length: "
            java.lang.String r6 = eh.a.l(r6, r7)
            ah.a.k(r6)
            r6 = 0
            return r6
        L69:
            java.lang.String r6 = "(int) "
            goto L71
        L6c:
            java.lang.String r6 = "(short) "
            goto L71
        L6f:
            java.lang.String r6 = "(byte) "
        L71:
            java.lang.String r6 = bc.e.i(r6, r0)
            return r6
        L76:
            return r0
        L77:
            r6 = 0
            throw r6
    }

    public final java.lang.String i(java.lang.String r4) {
            r3 = this;
            int r0 = r4.length()
            if (r0 != 0) goto L9
            java.lang.String r4 = "\"\""
            return r4
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 34
            r0.append(r1)
            kd.c r2 = new kd.c
            r2.<init>(r3, r0)
            j(r4, r2)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
