package o6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class a implements java.io.Closeable, java.io.Flushable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final java.util.regex.Pattern f9549r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f9550s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f9551t = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.io.Writer f9552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f9553h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9554i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h6.a f9555j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.String f9556k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.String f9557l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9558m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9559n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f9560o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.lang.String f9561p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9562q;

    static {
            java.lang.String r0 = "-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            o6.a.f9549r = r0
            r0 = 128(0x80, float:1.8E-43)
            java.lang.String[] r0 = new java.lang.String[r0]
            o6.a.f9550s = r0
            r0 = 0
        Lf:
            r1 = 31
            if (r0 > r1) goto L28
            java.lang.String[] r1 = o6.a.f9550s
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "\\u%04x"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1[r0] = r2
            int r0 = r0 + 1
            goto Lf
        L28:
            java.lang.String[] r0 = o6.a.f9550s
            r1 = 34
            java.lang.String r2 = "\\\""
            r0[r1] = r2
            r1 = 92
            java.lang.String r2 = "\\\\"
            r0[r1] = r2
            r1 = 9
            java.lang.String r2 = "\\t"
            r0[r1] = r2
            r1 = 8
            java.lang.String r2 = "\\b"
            r0[r1] = r2
            r1 = 10
            java.lang.String r2 = "\\n"
            r0[r1] = r2
            r1 = 13
            java.lang.String r2 = "\\r"
            r0[r1] = r2
            r1 = 12
            java.lang.String r2 = "\\f"
            r0[r1] = r2
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            o6.a.f9551t = r0
            r1 = 60
            java.lang.String r2 = "\\u003c"
            r0[r1] = r2
            r1 = 62
            java.lang.String r2 = "\\u003e"
            r0[r1] = r2
            r1 = 38
            java.lang.String r2 = "\\u0026"
            r0[r1] = r2
            r1 = 61
            java.lang.String r2 = "\\u003d"
            r0[r1] = r2
            r1 = 39
            java.lang.String r2 = "\\u0027"
            r0[r1] = r2
            return
    }

    public a(java.io.Writer r4) {
            r3 = this;
            r3.<init>()
            r0 = 32
            int[] r0 = new int[r0]
            r3.f9553h = r0
            r1 = 0
            r3.f9554i = r1
            int r2 = r0.length
            if (r2 != 0) goto L15
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.f9553h = r0
        L15:
            int[] r0 = r3.f9553h
            int r1 = r3.f9554i
            int r2 = r1 + 1
            r3.f9554i = r2
            r2 = 6
            r0[r1] = r2
            r0 = 2
            r3.f9559n = r0
            r0 = 1
            r3.f9562q = r0
            java.lang.String r0 = "out == null"
            java.util.Objects.requireNonNull(r4, r0)
            r3.f9552g = r4
            h6.a r4 = h6.a.f5099d
            r3.o(r4)
            return
    }

    public final void a() {
            r4 = this;
            int r0 = r4.m()
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L45
            java.io.Writer r3 = r4.f9552g
            if (r0 == r1) goto L3c
            r1 = 4
            if (r0 == r1) goto L2e
            r1 = 6
            r3 = 7
            if (r0 == r1) goto L26
            if (r0 != r3) goto L20
            int r0 = r4.f9559n
            if (r0 != r2) goto L1a
            goto L26
        L1a:
            java.lang.String r0 = "JSON must have only one top-level value."
            j8.o.A(r0)
            return
        L20:
            java.lang.String r0 = "Nesting problem."
            j8.o.A(r0)
            return
        L26:
            int[] r0 = r4.f9553h
            int r1 = r4.f9554i
            int r1 = r1 - r2
            r0[r1] = r3
            return
        L2e:
            java.lang.String r0 = r4.f9556k
            r3.append(r0)
            int[] r0 = r4.f9553h
            int r1 = r4.f9554i
            int r1 = r1 - r2
            r2 = 5
            r0[r1] = r2
            return
        L3c:
            java.lang.String r0 = r4.f9557l
            r3.append(r0)
            r4.k()
            return
        L45:
            int[] r0 = r4.f9553h
            int r3 = r4.f9554i
            int r3 = r3 - r2
            r0[r3] = r1
            r4.k()
            return
    }

    public void b() {
            r3 = this;
            r3.y()
            r3.a()
            int r0 = r3.f9554i
            int[] r1 = r3.f9553h
            int r2 = r1.length
            if (r0 != r2) goto L15
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.f9553h = r0
        L15:
            int[] r0 = r3.f9553h
            int r1 = r3.f9554i
            int r2 = r1 + 1
            r3.f9554i = r2
            r2 = 1
            r0[r1] = r2
            java.io.Writer r0 = r3.f9552g
            r1 = 91
            r0.write(r1)
            return
    }

    public void c() {
            r3 = this;
            r3.y()
            r3.a()
            int r0 = r3.f9554i
            int[] r1 = r3.f9553h
            int r2 = r1.length
            if (r0 != r2) goto L15
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.f9553h = r0
        L15:
            int[] r0 = r3.f9553h
            int r1 = r3.f9554i
            int r2 = r1 + 1
            r3.f9554i = r2
            r2 = 3
            r0[r1] = r2
            java.io.Writer r0 = r3.f9552g
            r1 = 123(0x7b, float:1.72E-43)
            r0.write(r1)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            java.io.Writer r0 = r3.f9552g
            r0.close()
            int r0 = r3.f9554i
            r1 = 1
            if (r0 > r1) goto L18
            if (r0 != r1) goto L14
            int[] r2 = r3.f9553h
            int r0 = r0 - r1
            r0 = r2[r0]
            r1 = 7
            if (r0 != r1) goto L18
        L14:
            r0 = 0
            r3.f9554i = r0
            return
        L18:
            java.lang.String r0 = "Incomplete document"
            j8.o.y(r0)
            return
    }

    public final void e(int r2, int r3, char r4) {
            r1 = this;
            int r0 = r1.m()
            if (r0 == r3) goto Lf
            if (r0 != r2) goto L9
            goto Lf
        L9:
            java.lang.String r2 = "Nesting problem."
            j8.o.A(r2)
            return
        Lf:
            java.lang.String r2 = r1.f9561p
            if (r2 != 0) goto L24
            int r2 = r1.f9554i
            int r2 = r2 + (-1)
            r1.f9554i = r2
            if (r0 != r3) goto L1e
            r1.k()
        L1e:
            java.io.Writer r2 = r1.f9552g
            r2.write(r4)
            return
        L24:
            java.lang.String r2 = "Dangling name: "
            java.lang.String r3 = r1.f9561p
            okio.a.l(r3, r2)
            return
    }

    @Override // java.io.Flushable
    public void flush() {
            r1 = this;
            int r0 = r1.f9554i
            if (r0 == 0) goto La
            java.io.Writer r0 = r1.f9552g
            r0.flush()
            return
        La:
            java.lang.String r0 = "JsonWriter is closed."
            j8.o.A(r0)
            return
    }

    public void g() {
            r3 = this;
            r0 = 2
            r1 = 93
            r2 = 1
            r3.e(r2, r0, r1)
            return
    }

    public void h() {
            r3 = this;
            r0 = 5
            r1 = 125(0x7d, float:1.75E-43)
            r2 = 3
            r3.e(r2, r0, r1)
            return
    }

    public void i(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "name == null"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = r2.f9561p
            if (r0 != 0) goto L1d
            int r0 = r2.m()
            r1 = 3
            if (r0 == r1) goto L1a
            r1 = 5
            if (r0 != r1) goto L14
            goto L1a
        L14:
            java.lang.String r3 = "Please begin an object before writing a name."
            j8.o.A(r3)
            return
        L1a:
            r2.f9561p = r3
            return
        L1d:
            java.lang.String r3 = "Already wrote a name, expecting a value."
            j8.o.A(r3)
            return
    }

    public final void k() {
            r4 = this;
            boolean r0 = r4.f9558m
            if (r0 == 0) goto L5
            goto L1d
        L5:
            h6.a r0 = r4.f9555j
            java.lang.String r0 = r0.f5101a
            java.io.Writer r1 = r4.f9552g
            r1.write(r0)
            int r0 = r4.f9554i
            r2 = 1
        L11:
            if (r2 >= r0) goto L1d
            h6.a r3 = r4.f9555j
            java.lang.String r3 = r3.f5102b
            r1.write(r3)
            int r2 = r2 + 1
            goto L11
        L1d:
            return
    }

    public o6.a l() {
            r2 = this;
            java.lang.String r0 = r2.f9561p
            if (r0 == 0) goto L10
            boolean r0 = r2.f9562q
            if (r0 == 0) goto Lc
            r2.y()
            goto L10
        Lc:
            r0 = 0
            r2.f9561p = r0
            return r2
        L10:
            r2.a()
            java.io.Writer r0 = r2.f9552g
            java.lang.String r1 = "null"
            r0.write(r1)
            return r2
    }

    public final int m() {
            r2 = this;
            int r0 = r2.f9554i
            if (r0 == 0) goto Lb
            int[] r1 = r2.f9553h
            int r0 = r0 + (-1)
            r0 = r1[r0]
            return r0
        Lb:
            java.lang.String r0 = "JsonWriter is closed."
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    public final void o(h6.a r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            r1.f9555j = r2
            java.lang.String r0 = ","
            r1.f9557l = r0
            boolean r0 = r2.f5103c
            if (r0 == 0) goto L1e
            java.lang.String r0 = ": "
            r1.f9556k = r0
            java.lang.String r2 = r2.f5101a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L22
            java.lang.String r2 = ", "
            r1.f9557l = r2
            goto L22
        L1e:
            java.lang.String r2 = ":"
            r1.f9556k = r2
        L22:
            h6.a r2 = r1.f9555j
            java.lang.String r2 = r2.f5101a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L38
            h6.a r2 = r1.f9555j
            java.lang.String r2 = r2.f5102b
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L38
            r2 = 1
            goto L39
        L38:
            r2 = 0
        L39:
            r1.f9558m = r2
            return
    }

    public final void q(int r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.f9559n = r1
            return
        L5:
            r1 = 0
            throw r1
    }

    public final void s(java.lang.String r9) {
            r8 = this;
            boolean r0 = r8.f9560o
            if (r0 == 0) goto L7
            java.lang.String[] r0 = o6.a.f9551t
            goto L9
        L7:
            java.lang.String[] r0 = o6.a.f9550s
        L9:
            java.io.Writer r1 = r8.f9552g
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
    }

    public void t(double r4) {
            r3 = this;
            r3.y()
            int r0 = r3.f9559n
            r1 = 1
            if (r0 == r1) goto L29
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto L15
            boolean r0 = java.lang.Double.isInfinite(r4)
            if (r0 != 0) goto L15
            goto L29
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Numeric values must be finite, but was "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L29:
            r3.a()
            java.io.Writer r0 = r3.f9552g
            java.lang.String r4 = java.lang.Double.toString(r4)
            r0.append(r4)
            return
    }

    public void u(long r2) {
            r1 = this;
            r1.y()
            r1.a()
            java.io.Writer r0 = r1.f9552g
            java.lang.String r2 = java.lang.Long.toString(r2)
            r0.write(r2)
            return
    }

    public void w(java.lang.Number r4) {
            r3 = this;
            if (r4 != 0) goto L6
            r3.l()
            return
        L6:
            r3.y()
            java.lang.String r0 = r4.toString()
            java.lang.Class r4 = r4.getClass()
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r4 == r1) goto L78
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r4 == r1) goto L78
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            if (r4 == r1) goto L78
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            if (r4 == r1) goto L78
            java.lang.Class<java.math.BigDecimal> r1 = java.math.BigDecimal.class
            if (r4 == r1) goto L78
            java.lang.Class<java.math.BigInteger> r1 = java.math.BigInteger.class
            if (r4 == r1) goto L78
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r1 = java.util.concurrent.atomic.AtomicInteger.class
            if (r4 == r1) goto L78
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r1 = java.util.concurrent.atomic.AtomicLong.class
            if (r4 != r1) goto L32
            goto L78
        L32:
            java.lang.String r1 = "-Infinity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L68
            java.lang.String r1 = "Infinity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L68
            java.lang.String r1 = "NaN"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L4b
            goto L68
        L4b:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r4 == r1) goto L78
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r4 == r1) goto L78
            java.util.regex.Pattern r1 = o6.a.f9549r
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L60
            goto L78
        L60:
            java.lang.String r1 = "String created by "
            java.lang.String r2 = " is not a valid JSON number: "
            j8.o.m(r1, r4, r2, r0)
            return
        L68:
            int r4 = r3.f9559n
            r1 = 1
            if (r4 != r1) goto L6e
            goto L78
        L6e:
            java.lang.String r4 = "Numeric values must be finite, but was "
            java.lang.String r4 = r4.concat(r0)
            j8.o.t(r4)
            return
        L78:
            r3.a()
            java.io.Writer r4 = r3.f9552g
            r4.append(r0)
            return
    }

    public void x(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L6
            r0.l()
            return
        L6:
            r0.y()
            r0.a()
            r0.s(r1)
            return
    }

    public final void y() {
            r3 = this;
            java.lang.String r0 = r3.f9561p
            if (r0 == 0) goto L30
            int r0 = r3.m()
            r1 = 5
            if (r0 != r1) goto L13
            java.io.Writer r0 = r3.f9552g
            java.lang.String r1 = r3.f9557l
            r0.write(r1)
            goto L16
        L13:
            r1 = 3
            if (r0 != r1) goto L2b
        L16:
            r3.k()
            int[] r0 = r3.f9553h
            int r1 = r3.f9554i
            int r1 = r1 + (-1)
            r2 = 4
            r0[r1] = r2
            java.lang.String r0 = r3.f9561p
            r3.s(r0)
            r0 = 0
            r3.f9561p = r0
            return
        L2b:
            java.lang.String r0 = "Nesting problem."
            j8.o.A(r0)
        L30:
            return
    }
}
