package xhss;

/* JADX INFO: renamed from: xhss.ᛸᲈᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0827 implements java.io.Closeable, java.io.Flushable {

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public static final java.lang.String[] f2688 = null;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static final java.util.regex.Pattern f2689 = null;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public static final java.lang.String[] f2690 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.io.Writer f2691;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int[] f2692;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C0089 f2693;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public boolean f2694;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public int f2695;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public boolean f2696;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public boolean f2697;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public java.lang.String f2698;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f2699;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public java.lang.String f2700;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public java.lang.String f2701;

    static {
            java.lang.String r0 = "-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            xhss.C0827.f2689 = r0
            r0 = 128(0x80, float:1.8E-43)
            java.lang.String[] r0 = new java.lang.String[r0]
            xhss.C0827.f2690 = r0
            r0 = 0
        Lf:
            r1 = 31
            if (r0 > r1) goto L28
            java.lang.String[] r1 = xhss.C0827.f2690
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "\\u%04x"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1[r0] = r2
            int r0 = r0 + 1
            goto Lf
        L28:
            java.lang.String[] r0 = xhss.C0827.f2690
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
            xhss.C0827.f2688 = r0
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

    public C0827(java.io.Writer r4) {
            r3 = this;
            r3.<init>()
            r0 = 32
            int[] r0 = new int[r0]
            r3.f2692 = r0
            r1 = 0
            r3.f2699 = r1
            int r2 = r0.length
            if (r2 != 0) goto L15
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.f2692 = r0
        L15:
            int r1 = r3.f2699
            int r2 = r1 + 1
            r3.f2699 = r2
            r2 = 6
            r0[r1] = r2
            r0 = 2
            r3.f2695 = r0
            r0 = 1
            r3.f2694 = r0
            r3.f2691 = r4
            xhss.ᛱᲀᛸᛸ r4 = xhss.C0089.f435
            r3.m1402(r4)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            java.io.Writer r0 = r3.f2691
            r0.close()
            int r0 = r3.f2699
            r1 = 1
            if (r0 > r1) goto L18
            if (r0 != r1) goto L14
            int[] r2 = r3.f2692
            int r0 = r0 - r1
            r0 = r2[r0]
            r1 = 7
            if (r0 != r1) goto L18
        L14:
            r0 = 0
            r3.f2699 = r0
            return
        L18:
            java.lang.String r3 = "Incomplete document"
            xhss.C0532.m947(r3)
            return
    }

    @Override // java.io.Flushable
    public void flush() {
            r1 = this;
            int r0 = r1.f2699
            if (r0 == 0) goto La
            java.io.Writer r1 = r1.f2691
            r1.flush()
            return
        La:
            java.lang.String r1 = "JsonWriter is closed."
            xhss.C0532.m950(r1)
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m1393() {
            r4 = this;
            int r0 = r4.m1398()
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L45
            java.io.Writer r3 = r4.f2691
            if (r0 == r1) goto L3c
            r1 = 4
            if (r0 == r1) goto L2e
            r1 = 6
            r3 = 7
            if (r0 == r1) goto L26
            if (r0 != r3) goto L20
            int r0 = r4.f2695
            if (r0 != r2) goto L1a
            goto L26
        L1a:
            java.lang.String r4 = "JSON must have only one top-level value."
            xhss.C0532.m950(r4)
            return
        L20:
            java.lang.String r4 = "Nesting problem."
            xhss.C0532.m950(r4)
            return
        L26:
            int[] r0 = r4.f2692
            int r4 = r4.f2699
            int r4 = r4 - r2
            r0[r4] = r3
            return
        L2e:
            java.lang.String r0 = r4.f2700
            r3.append(r0)
            int[] r0 = r4.f2692
            int r4 = r4.f2699
            int r4 = r4 - r2
            r1 = 5
            r0[r4] = r1
            return
        L3c:
            java.lang.String r0 = r4.f2698
            r3.append(r0)
            r4.m1408()
            return
        L45:
            int[] r0 = r4.f2692
            int r3 = r4.f2699
            int r3 = r3 - r2
            r0[r3] = r1
            r4.m1408()
            return
    }

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public void m1394(java.lang.Number r4) {
            r3 = this;
            if (r4 != 0) goto L6
            r3.m1396()
            return
        L6:
            r3.m1406()
            java.lang.String r0 = r4.toString()
            java.lang.Class r4 = r4.getClass()
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r4 == r1) goto L8c
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r4 == r1) goto L8c
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            if (r4 == r1) goto L8c
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            if (r4 == r1) goto L8c
            java.lang.Class<java.math.BigDecimal> r1 = java.math.BigDecimal.class
            if (r4 == r1) goto L8c
            java.lang.Class<java.math.BigInteger> r1 = java.math.BigInteger.class
            if (r4 == r1) goto L8c
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r1 = java.util.concurrent.atomic.AtomicInteger.class
            if (r4 == r1) goto L8c
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r1 = java.util.concurrent.atomic.AtomicLong.class
            if (r4 != r1) goto L32
            goto L8c
        L32:
            java.lang.String r1 = "-Infinity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L7c
            java.lang.String r1 = "Infinity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L7c
            java.lang.String r1 = "NaN"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L4b
            goto L7c
        L4b:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r4 == r1) goto L8c
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r4 == r1) goto L8c
            java.util.regex.Pattern r1 = xhss.C0827.f2689
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L60
            goto L8c
        L60:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "String created by "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " is not a valid JSON number: "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4)
            throw r3
        L7c:
            int r4 = r3.f2695
            r1 = 1
            if (r4 != r1) goto L82
            goto L8c
        L82:
            java.lang.String r3 = "Numeric values must be finite, but was "
            java.lang.String r3 = r3.concat(r0)
            xhss.C0532.m959(r3)
            return
        L8c:
            r3.m1393()
            java.io.Writer r3 = r3.f2691
            r3.append(r0)
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public void m1395() {
            r3 = this;
            r3.m1406()
            r3.m1393()
            int r0 = r3.f2699
            int[] r1 = r3.f2692
            int r2 = r1.length
            if (r0 != r2) goto L15
            int r0 = r0 * 2
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.f2692 = r1
        L15:
            int r0 = r3.f2699
            int r2 = r0 + 1
            r3.f2699 = r2
            r2 = 1
            r1[r0] = r2
            java.io.Writer r3 = r3.f2691
            r0 = 91
            r3.write(r0)
            return
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public xhss.C0827 m1396() {
            r2 = this;
            java.lang.String r0 = r2.f2701
            if (r0 == 0) goto L10
            boolean r0 = r2.f2694
            if (r0 == 0) goto Lc
            r2.m1406()
            goto L10
        Lc:
            r0 = 0
            r2.f2701 = r0
            return r2
        L10:
            r2.m1393()
            java.io.Writer r0 = r2.f2691
            java.lang.String r1 = "null"
            r0.write(r1)
            return r2
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public void m1397(long r1) {
            r0 = this;
            r0.m1406()
            r0.m1393()
            java.io.Writer r0 = r0.f2691
            java.lang.String r1 = java.lang.Long.toString(r1)
            r0.write(r1)
            return
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public final int m1398() {
            r1 = this;
            int r0 = r1.f2699
            if (r0 == 0) goto Lb
            int[] r1 = r1.f2692
            int r0 = r0 + (-1)
            r1 = r1[r0]
            return r1
        Lb:
            java.lang.String r1 = "JsonWriter is closed."
            xhss.C0532.m950(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public void m1399() {
            r3 = this;
            r0 = 5
            r1 = 125(0x7d, float:1.75E-43)
            r2 = 3
            r3.m1404(r2, r0, r1)
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public final void m1400(java.lang.String r8) {
            r7 = this;
            boolean r0 = r7.f2697
            if (r0 == 0) goto L7
            java.lang.String[] r0 = xhss.C0827.f2688
            goto L9
        L7:
            java.lang.String[] r0 = xhss.C0827.f2690
        L9:
            java.io.Writer r7 = r7.f2691
            r1 = 34
            r7.write(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r2) goto L41
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L3e
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L3e
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L39
            int r6 = r3 - r4
            r7.write(r8, r4, r6)
        L39:
            r7.write(r5)
            int r4 = r3 + 1
        L3e:
            int r3 = r3 + 1
            goto L16
        L41:
            if (r4 >= r2) goto L47
            int r2 = r2 - r4
            r7.write(r8, r4, r2)
        L47:
            r7.write(r1)
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public void m1401() {
            r3 = this;
            r0 = 2
            r1 = 93
            r2 = 1
            r3.m1404(r2, r0, r1)
            return
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public final void m1402(xhss.C0089 r2) {
            r1 = this;
            r1.f2693 = r2
            java.lang.String r0 = ","
            r1.f2698 = r0
            boolean r0 = r2.f437
            if (r0 == 0) goto L1b
            java.lang.String r0 = ": "
            r1.f2700 = r0
            java.lang.String r2 = r2.f438
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1f
            java.lang.String r2 = ", "
            r1.f2698 = r2
            goto L1f
        L1b:
            java.lang.String r2 = ":"
            r1.f2700 = r2
        L1f:
            xhss.ᛱᲀᛸᛸ r2 = r1.f2693
            java.lang.String r2 = r2.f438
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L35
            xhss.ᛱᲀᛸᛸ r2 = r1.f2693
            java.lang.String r2 = r2.f436
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L35
            r2 = 1
            goto L36
        L35:
            r2 = 0
        L36:
            r1.f2696 = r2
            return
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public void m1403(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.f2701
            if (r0 != 0) goto L18
            int r0 = r2.m1398()
            r1 = 3
            if (r0 == r1) goto L15
            r1 = 5
            if (r0 != r1) goto Lf
            goto L15
        Lf:
            java.lang.String r2 = "Please begin an object before writing a name."
            xhss.C0532.m950(r2)
            return
        L15:
            r2.f2701 = r3
            return
        L18:
            java.lang.String r2 = "Already wrote a name, expecting a value."
            xhss.C0532.m950(r2)
            return
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final void m1404(int r2, int r3, char r4) {
            r1 = this;
            int r0 = r1.m1398()
            if (r0 == r3) goto Lf
            if (r0 != r2) goto L9
            goto Lf
        L9:
            java.lang.String r1 = "Nesting problem."
            xhss.C0532.m950(r1)
            return
        Lf:
            java.lang.String r2 = r1.f2701
            if (r2 != 0) goto L24
            int r2 = r1.f2699
            int r2 = r2 + (-1)
            r1.f2699 = r2
            if (r0 != r3) goto L1e
            r1.m1408()
        L1e:
            java.io.Writer r1 = r1.f2691
            r1.write(r4)
            return
        L24:
            java.lang.String r2 = "Dangling name: "
            java.lang.String r1 = r1.f2701
            xhss.C0532.m949(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public void m1405(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L6
            r0.m1396()
            return
        L6:
            r0.m1406()
            r0.m1393()
            r0.m1400(r1)
            return
    }

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ, reason: contains not printable characters */
    public final void m1406() {
            r3 = this;
            java.lang.String r0 = r3.f2701
            if (r0 == 0) goto L30
            int r0 = r3.m1398()
            r1 = 5
            if (r0 != r1) goto L13
            java.io.Writer r0 = r3.f2691
            java.lang.String r1 = r3.f2698
            r0.write(r1)
            goto L16
        L13:
            r1 = 3
            if (r0 != r1) goto L2b
        L16:
            r3.m1408()
            int[] r0 = r3.f2692
            int r1 = r3.f2699
            int r1 = r1 + (-1)
            r2 = 4
            r0[r1] = r2
            java.lang.String r0 = r3.f2701
            r3.m1400(r0)
            r0 = 0
            r3.f2701 = r0
            return
        L2b:
            java.lang.String r3 = "Nesting problem."
            xhss.C0532.m950(r3)
        L30:
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public void m1407() {
            r3 = this;
            r3.m1406()
            r3.m1393()
            int r0 = r3.f2699
            int[] r1 = r3.f2692
            int r2 = r1.length
            if (r0 != r2) goto L15
            int r0 = r0 * 2
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.f2692 = r1
        L15:
            int r0 = r3.f2699
            int r2 = r0 + 1
            r3.f2699 = r2
            r2 = 3
            r1[r0] = r2
            java.io.Writer r3 = r3.f2691
            r0 = 123(0x7b, float:1.72E-43)
            r3.write(r0)
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final void m1408() {
            r4 = this;
            boolean r0 = r4.f2696
            if (r0 == 0) goto L5
            goto L1d
        L5:
            xhss.ᛱᲀᛸᛸ r0 = r4.f2693
            java.lang.String r0 = r0.f438
            java.io.Writer r1 = r4.f2691
            r1.write(r0)
            int r0 = r4.f2699
            r2 = 1
        L11:
            if (r2 >= r0) goto L1d
            xhss.ᛱᲀᛸᛸ r3 = r4.f2693
            java.lang.String r3 = r3.f436
            r1.write(r3)
            int r2 = r2 + 1
            goto L11
        L1d:
            return
    }

    /* JADX INFO: renamed from: ᲈᛲᛵᲁ, reason: contains not printable characters */
    public void m1409(boolean r1) {
            r0 = this;
            r0.m1406()
            r0.m1393()
            if (r1 == 0) goto Lb
            java.lang.String r1 = "true"
            goto Ld
        Lb:
            java.lang.String r1 = "false"
        Ld:
            java.io.Writer r0 = r0.f2691
            r0.write(r1)
            return
    }
}
