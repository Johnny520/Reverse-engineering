package defpackage;

/* JADX INFO: renamed from: ᛲᲀᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C0353 implements java.io.Closeable, java.io.Flushable {

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static final java.lang.String[] f1833 = null;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static final java.util.regex.Pattern f1834 = null;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static final java.lang.String[] f1835 = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.lang.String f1836;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public boolean f1837;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public java.lang.String f1838;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public boolean f1839;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f1840;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public boolean f1841;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int[] f1842;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.io.Writer f1843;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int f1844;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.C0622 f1845;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public java.lang.String f1846;

    static {
            java.lang.String r0 = "-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.C0353.f1834 = r0
            r0 = 128(0x80, float:1.8E-43)
            java.lang.String[] r0 = new java.lang.String[r0]
            defpackage.C0353.f1833 = r0
            r0 = 0
        Lf:
            r1 = 31
            if (r0 > r1) goto L28
            java.lang.String[] r1 = defpackage.C0353.f1833
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "\\u%04x"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1[r0] = r2
            int r0 = r0 + 1
            goto Lf
        L28:
            java.lang.String[] r0 = defpackage.C0353.f1833
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
            defpackage.C0353.f1835 = r0
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

    public C0353(java.io.Writer r4) {
            r3 = this;
            r3.<init>()
            r0 = 32
            int[] r0 = new int[r0]
            r3.f1842 = r0
            r1 = 0
            r3.f1840 = r1
            int r2 = r0.length
            if (r2 != 0) goto L15
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.f1842 = r0
        L15:
            int r1 = r3.f1840
            int r2 = r1 + 1
            r3.f1840 = r2
            r2 = 6
            r0[r1] = r2
            r0 = 2
            r3.f1844 = r0
            r0 = 1
            r3.f1841 = r0
            r3.f1843 = r4
            ᛴᛲᛵᛱ r4 = defpackage.C0622.f3054
            r3.m1081(r4)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            java.io.Writer r0 = r3.f1843
            r0.close()
            int r0 = r3.f1840
            r1 = 1
            if (r0 > r1) goto L18
            if (r0 != r1) goto L14
            int[] r2 = r3.f1842
            int r0 = r0 - r1
            r0 = r2[r0]
            r1 = 7
            if (r0 != r1) goto L18
        L14:
            r0 = 0
            r3.f1840 = r0
            return
        L18:
            java.lang.String r3 = "Incomplete document"
            defpackage.C2264.m3682(r3)
            return
    }

    @Override // java.io.Flushable
    public void flush() {
            r1 = this;
            int r0 = r1.f1840
            if (r0 == 0) goto La
            java.io.Writer r1 = r1.f1843
            r1.flush()
            return
        La:
            java.lang.String r1 = "JsonWriter is closed."
            defpackage.C2264.m3676(r1)
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final void m1066(int r2, int r3, char r4) {
            r1 = this;
            int r0 = r1.m1074()
            if (r0 == r3) goto Lf
            if (r0 != r2) goto L9
            goto Lf
        L9:
            java.lang.String r1 = "Nesting problem."
            defpackage.C2264.m3676(r1)
            return
        Lf:
            java.lang.String r2 = r1.f1838
            if (r2 != 0) goto L24
            int r2 = r1.f1840
            int r2 = r2 + (-1)
            r1.f1840 = r2
            if (r0 != r3) goto L1e
            r1.m1080()
        L1e:
            java.io.Writer r1 = r1.f1843
            r1.write(r4)
            return
        L24:
            java.lang.String r2 = "Dangling name: "
            java.lang.String r1 = r1.f1838
            defpackage.C2264.m3674(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public defpackage.C0353 m1067() {
            r2 = this;
            java.lang.String r0 = r2.f1838
            if (r0 == 0) goto L10
            boolean r0 = r2.f1841
            if (r0 == 0) goto Lc
            r2.m1071()
            goto L10
        Lc:
            r0 = 0
            r2.f1838 = r0
            return r2
        L10:
            r2.m1078()
            java.io.Writer r0 = r2.f1843
            java.lang.String r1 = "null"
            r0.write(r1)
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public void m1068() {
            r3 = this;
            r0 = 2
            r1 = 93
            r2 = 1
            r3.m1066(r2, r0, r1)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public void m1069() {
            r3 = this;
            r3.m1071()
            r3.m1078()
            int r0 = r3.f1840
            int[] r1 = r3.f1842
            int r2 = r1.length
            if (r0 != r2) goto L15
            int r0 = r0 * 2
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.f1842 = r1
        L15:
            int r0 = r3.f1840
            int r2 = r0 + 1
            r3.f1840 = r2
            r2 = 3
            r1[r0] = r2
            java.io.Writer r3 = r3.f1843
            r0 = 123(0x7b, float:1.72E-43)
            r3.write(r0)
            return
    }

    /* JADX INFO: renamed from: ᛳᛳᛳᲈ, reason: contains not printable characters */
    public void m1070(long r1) {
            r0 = this;
            r0.m1071()
            r0.m1078()
            java.io.Writer r0 = r0.f1843
            java.lang.String r1 = java.lang.Long.toString(r1)
            r0.write(r1)
            return
    }

    /* JADX INFO: renamed from: ᛳᛸᛱᲇ, reason: contains not printable characters */
    public final void m1071() {
            r3 = this;
            java.lang.String r0 = r3.f1838
            if (r0 == 0) goto L30
            int r0 = r3.m1074()
            r1 = 5
            if (r0 != r1) goto L13
            java.io.Writer r0 = r3.f1843
            java.lang.String r1 = r3.f1836
            r0.write(r1)
            goto L16
        L13:
            r1 = 3
            if (r0 != r1) goto L2b
        L16:
            r3.m1080()
            int[] r0 = r3.f1842
            int r1 = r3.f1840
            int r1 = r1 + (-1)
            r2 = 4
            r0[r1] = r2
            java.lang.String r0 = r3.f1838
            r3.m1077(r0)
            r0 = 0
            r3.f1838 = r0
            return
        L2b:
            java.lang.String r3 = "Nesting problem."
            defpackage.C2264.m3676(r3)
        L30:
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public void m1072(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.f1838
            if (r0 != 0) goto L18
            int r0 = r2.m1074()
            r1 = 3
            if (r0 == r1) goto L15
            r1 = 5
            if (r0 != r1) goto Lf
            goto L15
        Lf:
            java.lang.String r2 = "Please begin an object before writing a name."
            defpackage.C2264.m3676(r2)
            return
        L15:
            r2.f1838 = r3
            return
        L18:
            java.lang.String r2 = "Already wrote a name, expecting a value."
            defpackage.C2264.m3676(r2)
            return
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public void m1073() {
            r3 = this;
            r0 = 5
            r1 = 125(0x7d, float:1.75E-43)
            r2 = 3
            r3.m1066(r2, r0, r1)
            return
    }

    /* JADX INFO: renamed from: ᛶᲈᲈᛸ, reason: contains not printable characters */
    public final int m1074() {
            r1 = this;
            int r0 = r1.f1840
            if (r0 == 0) goto Lb
            int[] r1 = r1.f1842
            int r0 = r0 + (-1)
            r1 = r1[r0]
            return r1
        Lb:
            java.lang.String r1 = "JsonWriter is closed."
            defpackage.C2264.m3676(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛵᛷᛷ, reason: contains not printable characters */
    public void m1075(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L6
            r0.m1067()
            return
        L6:
            r0.m1071()
            r0.m1078()
            r0.m1077(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᛶ, reason: contains not printable characters */
    public void m1076(java.lang.Number r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.m1067()
            return
        L6:
            r2.m1071()
            java.lang.String r0 = r3.toString()
            java.lang.Class r3 = r3.getClass()
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r3 == r1) goto L78
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r3 == r1) goto L78
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            if (r3 == r1) goto L78
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            if (r3 == r1) goto L78
            java.lang.Class<java.math.BigDecimal> r1 = java.math.BigDecimal.class
            if (r3 == r1) goto L78
            java.lang.Class<java.math.BigInteger> r1 = java.math.BigInteger.class
            if (r3 == r1) goto L78
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r1 = java.util.concurrent.atomic.AtomicInteger.class
            if (r3 == r1) goto L78
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r1 = java.util.concurrent.atomic.AtomicLong.class
            if (r3 != r1) goto L32
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
            if (r3 == r1) goto L78
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r3 == r1) goto L78
            java.util.regex.Pattern r1 = defpackage.C0353.f1834
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L60
            goto L78
        L60:
            java.lang.String r2 = "String created by "
            java.lang.String r1 = " is not a valid JSON number: "
            defpackage.C2264.m3680(r2, r3, r1, r0)
            return
        L68:
            int r3 = r2.f1844
            r1 = 1
            if (r3 != r1) goto L6e
            goto L78
        L6e:
            java.lang.String r2 = "Numeric values must be finite, but was "
            java.lang.String r2 = r2.concat(r0)
            defpackage.C2264.m3684(r2)
            return
        L78:
            r2.m1078()
            java.io.Writer r2 = r2.f1843
            r2.append(r0)
            return
    }

    /* JADX INFO: renamed from: ᛷᛷᛱᛱ, reason: contains not printable characters */
    public final void m1077(java.lang.String r8) {
            r7 = this;
            boolean r0 = r7.f1837
            if (r0 == 0) goto L7
            java.lang.String[] r0 = defpackage.C0353.f1835
            goto L9
        L7:
            java.lang.String[] r0 = defpackage.C0353.f1833
        L9:
            java.io.Writer r7 = r7.f1843
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

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m1078() {
            r4 = this;
            int r0 = r4.m1074()
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L45
            java.io.Writer r3 = r4.f1843
            if (r0 == r1) goto L3c
            r1 = 4
            if (r0 == r1) goto L2e
            r1 = 6
            r3 = 7
            if (r0 == r1) goto L26
            if (r0 != r3) goto L20
            int r0 = r4.f1844
            if (r0 != r2) goto L1a
            goto L26
        L1a:
            java.lang.String r4 = "JSON must have only one top-level value."
            defpackage.C2264.m3676(r4)
            return
        L20:
            java.lang.String r4 = "Nesting problem."
            defpackage.C2264.m3676(r4)
            return
        L26:
            int[] r0 = r4.f1842
            int r4 = r4.f1840
            int r4 = r4 - r2
            r0[r4] = r3
            return
        L2e:
            java.lang.String r0 = r4.f1846
            r3.append(r0)
            int[] r0 = r4.f1842
            int r4 = r4.f1840
            int r4 = r4 - r2
            r1 = 5
            r0[r4] = r1
            return
        L3c:
            java.lang.String r0 = r4.f1836
            r3.append(r0)
            r4.m1080()
            return
        L45:
            int[] r0 = r4.f1842
            int r3 = r4.f1840
            int r3 = r3 - r2
            r0[r3] = r1
            r4.m1080()
            return
    }

    /* JADX INFO: renamed from: ᛷᲇᛷᛶ, reason: contains not printable characters */
    public void m1079(boolean r1) {
            r0 = this;
            r0.m1071()
            r0.m1078()
            if (r1 == 0) goto Lb
            java.lang.String r1 = "true"
            goto Ld
        Lb:
            java.lang.String r1 = "false"
        Ld:
            java.io.Writer r0 = r0.f1843
            r0.write(r1)
            return
    }

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public final void m1080() {
            r4 = this;
            boolean r0 = r4.f1839
            if (r0 == 0) goto L5
            goto L1d
        L5:
            ᛴᛲᛵᛱ r0 = r4.f1845
            java.lang.String r0 = r0.f3056
            java.io.Writer r1 = r4.f1843
            r1.write(r0)
            int r0 = r4.f1840
            r2 = 1
        L11:
            if (r2 >= r0) goto L1d
            ᛴᛲᛵᛱ r3 = r4.f1845
            java.lang.String r3 = r3.f3057
            r1.write(r3)
            int r2 = r2 + 1
            goto L11
        L1d:
            return
    }

    /* JADX INFO: renamed from: ᲈᛸᲇ, reason: contains not printable characters */
    public final void m1081(defpackage.C0622 r2) {
            r1 = this;
            r1.f1845 = r2
            java.lang.String r0 = ","
            r1.f1836 = r0
            boolean r0 = r2.f3055
            if (r0 == 0) goto L1b
            java.lang.String r0 = ": "
            r1.f1846 = r0
            java.lang.String r2 = r2.f3056
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1f
            java.lang.String r2 = ", "
            r1.f1836 = r2
            goto L1f
        L1b:
            java.lang.String r2 = ":"
            r1.f1846 = r2
        L1f:
            ᛴᛲᛵᛱ r2 = r1.f1845
            java.lang.String r2 = r2.f3056
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L35
            ᛴᛲᛵᛱ r2 = r1.f1845
            java.lang.String r2 = r2.f3057
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L35
            r2 = 1
            goto L36
        L35:
            r2 = 0
        L36:
            r1.f1839 = r2
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public void m1082() {
            r3 = this;
            r3.m1071()
            r3.m1078()
            int r0 = r3.f1840
            int[] r1 = r3.f1842
            int r2 = r1.length
            if (r0 != r2) goto L15
            int r0 = r0 * 2
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.f1842 = r1
        L15:
            int r0 = r3.f1840
            int r2 = r0 + 1
            r3.f1840 = r2
            r2 = 1
            r1[r0] = r2
            java.io.Writer r3 = r3.f1843
            r0 = 91
            r3.write(r0)
            return
    }
}
