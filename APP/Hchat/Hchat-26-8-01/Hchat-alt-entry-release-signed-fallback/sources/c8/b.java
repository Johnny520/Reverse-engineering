package c8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements qh.a, java.io.Closeable {
    public static final java.util.HashMap G = null;
    public static final char[] H = null;
    public static final char[] I = null;
    public static final char[] J = null;
    public static final char[] K = null;
    public static final char[] L = null;
    public static final char[] M = null;
    public static final char[] N = null;
    public static final char[] O = null;
    public static final char[] P = null;
    public static final char[] Q = null;
    public static final char[] R = null;
    public static final char[] S = null;
    public static final char[] T = null;
    public static final char[] U = null;
    public static final char[] V = null;
    public static final char[] W = null;
    public static final char[] X = null;
    public static final char[] Y = null;
    public static final char[] Z = null;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final char[] f1057a0 = null;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final char[] f1058b0 = null;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final char[] f1059c0 = null;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final char[] f1060d0 = null;
    public boolean A;
    public int B;
    public boolean C;
    public java.lang.String[] D;
    public java.lang.String E;
    public boolean F;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.String f1061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.util.HashMap f1062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.HashMap f1063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.String[] f1065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.String[] f1066l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f1067m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.io.StringReader f1068n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c8.a f1069o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char[] f1070p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1071q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1072r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1073s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1074t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1075u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1076v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public java.lang.String f1077w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public java.lang.String f1078x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public java.lang.String f1079y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public java.lang.String f1080z;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            c8.b.G = r0
            java.lang.String r1 = "lt"
            java.lang.String r2 = "<"
            r0.put(r1, r2)
            java.lang.String r1 = "gt"
            java.lang.String r2 = ">"
            r0.put(r1, r2)
            java.lang.String r1 = "amp"
            java.lang.String r2 = "&"
            r0.put(r1, r2)
            java.lang.String r1 = "apos"
            java.lang.String r2 = "'"
            r0.put(r1, r2)
            java.lang.String r1 = "quot"
            java.lang.String r2 = "\""
            r0.put(r1, r2)
            r0 = 4
            char[] r0 = new char[r0]
            r0 = {x00de: FILL_ARRAY_DATA , data: [60, 33, 45, 45} // fill-array
            c8.b.H = r0
            r0 = 3
            char[] r1 = new char[r0]
            r1 = {x00e6: FILL_ARRAY_DATA , data: [45, 45, 62} // fill-array
            c8.b.I = r1
            r1 = 2
            char[] r2 = new char[r1]
            r2 = {x00ee: FILL_ARRAY_DATA , data: [45, 45} // fill-array
            c8.b.J = r2
            r2 = 9
            char[] r3 = new char[r2]
            r3 = {x00f4: FILL_ARRAY_DATA , data: [60, 33, 91, 67, 68, 65, 84, 65, 91} // fill-array
            c8.b.K = r3
            char[] r3 = new char[r0]
            r3 = {x0102: FILL_ARRAY_DATA , data: [93, 93, 62} // fill-array
            c8.b.L = r3
            char[] r3 = new char[r1]
            r3 = {x010a: FILL_ARRAY_DATA , data: [60, 63} // fill-array
            c8.b.M = r3
            char[] r1 = new char[r1]
            r1 = {x0110: FILL_ARRAY_DATA , data: [63, 62} // fill-array
            c8.b.N = r1
            char[] r1 = new char[r2]
            r1 = {x0116: FILL_ARRAY_DATA , data: [60, 33, 68, 79, 67, 84, 89, 80, 69} // fill-array
            c8.b.O = r1
            r1 = 6
            char[] r3 = new char[r1]
            r3 = {x0124: FILL_ARRAY_DATA , data: [83, 89, 83, 84, 69, 77} // fill-array
            c8.b.P = r3
            char[] r1 = new char[r1]
            r1 = {x012e: FILL_ARRAY_DATA , data: [80, 85, 66, 76, 73, 67} // fill-array
            c8.b.Q = r1
            char[] r1 = new char[r2]
            r1 = {x0138: FILL_ARRAY_DATA , data: [60, 33, 69, 76, 69, 77, 69, 78, 84} // fill-array
            c8.b.R = r1
            char[] r1 = new char[r2]
            r1 = {x0146: FILL_ARRAY_DATA , data: [60, 33, 65, 84, 84, 76, 73, 83, 84} // fill-array
            c8.b.S = r1
            r1 = 8
            char[] r2 = new char[r1]
            r2 = {x0154: FILL_ARRAY_DATA , data: [60, 33, 69, 78, 84, 73, 84, 89} // fill-array
            c8.b.T = r2
            r2 = 10
            char[] r2 = new char[r2]
            r2 = {x0160: FILL_ARRAY_DATA , data: [60, 33, 78, 79, 84, 65, 84, 73, 79, 78} // fill-array
            c8.b.U = r2
            r2 = 5
            char[] r3 = new char[r2]
            r3 = {x016e: FILL_ARRAY_DATA , data: [69, 77, 80, 84, 89} // fill-array
            c8.b.V = r3
            char[] r0 = new char[r0]
            r0 = {x0178: FILL_ARRAY_DATA , data: [65, 78, 89} // fill-array
            c8.b.W = r0
            char[] r0 = new char[r2]
            r0 = {x0180: FILL_ARRAY_DATA , data: [78, 68, 65, 84, 65} // fill-array
            c8.b.X = r0
            char[] r0 = new char[r1]
            r0 = {x018a: FILL_ARRAY_DATA , data: [78, 79, 84, 65, 84, 73, 79, 78} // fill-array
            c8.b.Y = r0
            char[] r0 = new char[r1]
            r0 = {x0196: FILL_ARRAY_DATA , data: [82, 69, 81, 85, 73, 82, 69, 68} // fill-array
            c8.b.Z = r0
            r0 = 7
            char[] r0 = new char[r0]
            r0 = {x01a2: FILL_ARRAY_DATA , data: [73, 77, 80, 76, 73, 69, 68} // fill-array
            c8.b.f1057a0 = r0
            char[] r0 = new char[r2]
            r0 = {x01ae: FILL_ARRAY_DATA , data: [70, 73, 88, 69, 68} // fill-array
            c8.b.f1058b0 = r0
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 39
            r2 = 0
            r0[r2] = r1
            c8.b.f1059c0 = r0
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 34
            r0[r2] = r1
            c8.b.f1060d0 = r0
            return
    }

    public static java.lang.String[] b(java.lang.String[] r2, int r3) {
            int r0 = r2.length
            if (r0 < r3) goto L4
            return r2
        L4:
            int r3 = r3 + 16
            java.lang.String[] r3 = new java.lang.String[r3]
            int r0 = r2.length
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r3, r1, r0)
            return r3
    }

    public final void a(java.lang.String r2) {
            r1 = this;
            af.e r0 = new af.e
            r0.<init>(r2, r1)
            throw r0
    }

    public final boolean c(int r7) {
            r6 = this;
        L0:
            c8.a r0 = r6.f1069o
            r1 = 1
            if (r0 == 0) goto L2b
            int r2 = r6.f1071q
            int r3 = r6.f1072r
            if (r2 < r3) goto L23
            java.lang.Object r2 = r0.f1056e
            char[] r2 = (char[]) r2
            r6.f1070p = r2
            int r2 = r0.f1053b
            r6.f1071q = r2
            int r3 = r0.f1054c
            r6.f1072r = r3
            java.lang.Object r0 = r0.f1055d
            c8.a r0 = (c8.a) r0
            r6.f1069o = r0
            int r3 = r3 - r2
            if (r3 < r7) goto L0
            goto L70
        L23:
            af.e r7 = new af.e
            java.lang.String r0 = "Unbalanced entity!"
            r7.<init>(r0, r6)
            throw r7
        L2b:
            r0 = 0
            r2 = r0
        L2d:
            int r3 = r6.f1071q
            if (r2 >= r3) goto L49
            char[] r3 = r6.f1070p
            char r3 = r3[r2]
            r4 = 10
            if (r3 != r4) goto L41
            int r3 = r6.f1073s
            int r3 = r3 + r1
            r6.f1073s = r3
            r6.f1074t = r0
            goto L46
        L41:
            int r3 = r6.f1074t
            int r3 = r3 + r1
            r6.f1074t = r3
        L46:
            int r2 = r2 + 1
            goto L2d
        L49:
            int r2 = r6.f1072r
            if (r2 == r3) goto L56
            int r2 = r2 - r3
            r6.f1072r = r2
            char[] r4 = r6.f1070p
            java.lang.System.arraycopy(r4, r3, r4, r0, r2)
            goto L58
        L56:
            r6.f1072r = r0
        L58:
            r6.f1071q = r0
        L5a:
            java.io.StringReader r2 = r6.f1068n
            char[] r3 = r6.f1070p
            int r4 = r6.f1072r
            int r5 = r3.length
            int r5 = r5 - r4
            int r2 = r2.read(r3, r4, r5)
            r3 = -1
            if (r2 == r3) goto L71
            int r3 = r6.f1072r
            int r3 = r3 + r2
            r6.f1072r = r3
            if (r3 < r7) goto L5a
        L70:
            return r1
        L71:
            return r0
    }

    public final int e() {
            r6 = this;
            int r0 = r6.f1073s
            int r1 = r6.f1071q
            int r1 = r1 + (-1)
            char[] r2 = r6.f1070p
            r3 = 0
        L9:
            r4 = 10
            if (r3 >= r1) goto L16
            char r5 = r2[r3]
            if (r5 != r4) goto L13
            int r0 = r0 + 1
        L13:
            int r3 = r3 + 1
            goto L9
        L16:
            if (r3 < 0) goto L26
            char r1 = r2[r3]
            r5 = 32
            if (r1 <= r5) goto L1f
            goto L26
        L1f:
            if (r1 != r4) goto L23
            int r0 = r0 + (-1)
        L23:
            int r3 = r3 + (-1)
            goto L16
        L26:
            int r0 = r0 + 1
            return r0
    }

    public final java.lang.String g(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "xml"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto Lb
            java.lang.String r4 = "http://www.w3.org/XML/1998/namespace"
            return r4
        Lb:
            java.lang.String r0 = "xmlns"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L16
            java.lang.String r4 = "http://www.w3.org/2000/xmlns/"
            return r4
        L16:
            int r0 = r3.f1064j
            int[] r1 = r3.f1067m
            r0 = r1[r0]
            int r0 = r0 << 1
            int r0 = r0 + (-2)
        L20:
            if (r0 < 0) goto L41
            java.lang.String[] r1 = r3.f1066l
            if (r4 != 0) goto L2f
            r2 = r1[r0]
            if (r2 != 0) goto L3e
            int r0 = r0 + 1
            r4 = r1[r0]
            return r4
        L2f:
            r1 = r1[r0]
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L3e
            java.lang.String[] r4 = r3.f1066l
            int r0 = r0 + 1
            r4 = r4[r0]
            return r4
        L3e:
            int r0 = r0 + (-2)
            goto L20
        L41:
            r4 = 0
            return r4
    }

    public final java.lang.String h() {
            r2 = this;
            int r0 = r2.f1075u
            r1 = 4
            if (r0 < r1) goto L14
            r1 = 6
            if (r0 != r1) goto Ld
            boolean r0 = r2.F
            if (r0 == 0) goto Ld
            goto L14
        Ld:
            java.lang.String r0 = r2.f1080z
            if (r0 != 0) goto L13
            java.lang.String r0 = ""
        L13:
            return r0
        L14:
            r0 = 0
            return r0
    }

    public final void i(boolean r10, boolean r11) {
            r9 = this;
            if (r10 != 0) goto L7
            r0 = 60
            r9.m(r0)
        L7:
            java.lang.String r0 = r9.t()
            r9.f1079y = r0
            r0 = 0
            r9.B = r0
        L10:
            r9.y()
            int r1 = r9.f1071q
            int r2 = r9.f1072r
            java.lang.String r3 = "Unexpected EOF"
            r4 = 1
            if (r1 < r2) goto L26
            boolean r1 = r9.c(r4)
            if (r1 != 0) goto L26
            r9.a(r3)
            return
        L26:
            char[] r1 = r9.f1070p
            int r2 = r9.f1071q
            char r1 = r1[r2]
            r5 = 62
            java.lang.String r6 = ""
            r7 = 0
            if (r10 == 0) goto L3e
            r8 = 63
            if (r1 != r8) goto L118
            int r2 = r2 + r4
            r9.f1071q = r2
            r9.m(r5)
            return
        L3e:
            r8 = 47
            if (r1 != r8) goto L4e
            r9.A = r4
            int r2 = r2 + r4
            r9.f1071q = r2
            r9.y()
            r9.m(r5)
            goto L53
        L4e:
            if (r1 != r5) goto L118
            int r2 = r2 + r4
            r9.f1071q = r2
        L53:
            int r10 = r9.f1064j
            int r11 = r10 + 1
            r9.f1064j = r11
            int r10 = r10 * 4
            if (r11 != r4) goto L5f
            r9.C = r4
        L5f:
            java.lang.String[] r11 = r9.f1065k
            int r1 = r10 + 4
            java.lang.String[] r11 = b(r11, r1)
            r9.f1065k = r11
            int r1 = r10 + 3
            java.lang.String r2 = r9.f1079y
            r11[r1] = r2
            int r11 = r9.f1064j
            int[] r1 = r9.f1067m
            int r2 = r1.length
            if (r11 < r2) goto L80
            int r11 = r11 + 4
            int[] r11 = new int[r11]
            int r2 = r1.length
            java.lang.System.arraycopy(r1, r0, r11, r0, r2)
            r9.f1067m = r11
        L80:
            int[] r11 = r9.f1067m
            int r0 = r9.f1064j
            int r1 = r0 + (-1)
            r1 = r11[r1]
            r11[r0] = r1
            r9.f1077w = r6
            java.util.HashMap r11 = r9.f1063i
            if (r11 == 0) goto L105
            java.lang.String r0 = r9.f1079y
            java.lang.Object r11 = r11.get(r0)
            java.util.Map r11 = (java.util.Map) r11
            if (r11 == 0) goto L105
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        La2:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L105
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r9.B
            int r2 = r2 * 4
            int r2 = r2 + (-4)
        Lba:
            if (r2 < 0) goto Ld2
            java.lang.String[] r3 = r9.D
            int r4 = r2 + 2
            r3 = r3[r4]
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto Lcf
            java.lang.String[] r1 = r9.D
            int r2 = r2 + 3
            r1 = r1[r2]
            goto Ld3
        Lcf:
            int r2 = r2 + (-4)
            goto Lba
        Ld2:
            r1 = 0
        Ld3:
            if (r1 == 0) goto Ld6
            goto La2
        Ld6:
            int r1 = r9.B
            int r2 = r1 + 1
            r9.B = r2
            int r1 = r1 * 4
            java.lang.String[] r2 = r9.D
            int r3 = r1 + 4
            java.lang.String[] r2 = b(r2, r3)
            r9.D = r2
            r2[r1] = r6
            int r3 = r1 + 1
            r2[r3] = r7
            int r3 = r1 + 2
            java.lang.Object r4 = r0.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r2[r3] = r4
            java.lang.String[] r2 = r9.D
            int r1 = r1 + 3
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r2[r1] = r0
            goto La2
        L105:
            java.lang.String[] r11 = r9.f1065k
            java.lang.String r0 = r9.f1077w
            r11[r10] = r0
            int r0 = r10 + 1
            java.lang.String r1 = r9.f1078x
            r11[r0] = r1
            int r10 = r10 + 2
            java.lang.String r0 = r9.f1079y
            r11[r10] = r0
            return
        L118:
            java.lang.String r1 = r9.t()
            int r2 = r9.B
            int r5 = r2 + 1
            r9.B = r5
            int r2 = r2 * 4
            java.lang.String[] r5 = r9.D
            int r8 = r2 + 4
            java.lang.String[] r5 = b(r5, r8)
            r9.D = r5
            r5[r2] = r6
            int r6 = r2 + 1
            r5[r6] = r7
            int r6 = r2 + 2
            r5[r6] = r1
            r9.y()
            int r5 = r9.f1071q
            int r6 = r9.f1072r
            if (r5 < r6) goto L14b
            boolean r5 = r9.c(r4)
            if (r5 != 0) goto L14b
            r9.a(r3)
            return
        L14b:
            char[] r5 = r9.f1070p
            int r6 = r9.f1071q
            char r5 = r5[r6]
            r7 = 61
            if (r5 != r7) goto L1a2
            int r6 = r6 + 1
            r9.f1071q = r6
            r9.y()
            int r1 = r9.f1071q
            int r5 = r9.f1072r
            if (r1 < r5) goto L16c
            boolean r1 = r9.c(r4)
            if (r1 != 0) goto L16c
            r9.a(r3)
            return
        L16c:
            char[] r1 = r9.f1070p
            int r3 = r9.f1071q
            char r1 = r1[r3]
            r5 = 39
            if (r1 == r5) goto L183
            r5 = 34
            if (r1 != r5) goto L17b
            goto L183
        L17b:
            af.e r10 = new af.e
            java.lang.String r11 = "attr value delimiter missing!"
            r10.<init>(r11, r9)
            throw r10
        L183:
            int r3 = r3 + 1
            r9.f1071q = r3
            java.lang.String[] r3 = r9.D
            int r2 = r2 + 3
            java.lang.String r5 = r9.x(r1, r4, r11, r4)
            r3[r2] = r5
            r2 = 32
            if (r1 == r2) goto L10
            int r2 = r9.k()
            if (r2 != r1) goto L10
            int r1 = r9.f1071q
            int r1 = r1 + r4
            r9.f1071q = r1
            goto L10
        L1a2:
            java.lang.String r3 = "Attr.value missing f. "
            java.lang.String r3 = r3.concat(r1)
            r9.a(r3)
            java.lang.String[] r3 = r9.D
            int r2 = r2 + 3
            r3[r2] = r1
            goto L10
    }

    public final int k() {
            r2 = this;
            int r0 = r2.f1071q
            int r1 = r2.f1072r
            if (r0 < r1) goto L10
            r0 = 1
            boolean r0 = r2.c(r0)
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = -1
            return r0
        L10:
            char[] r0 = r2.f1070p
            int r1 = r2.f1071q
            char r0 = r0[r1]
            return r0
    }

    public final int l(boolean r8) {
            r7 = this;
            int r0 = r7.f1071q
            int r1 = r7.f1072r
            if (r0 < r1) goto Le
            r0 = 1
            boolean r1 = r7.c(r0)
            if (r1 != 0) goto Le
            return r0
        Le:
            char[] r0 = r7.f1070p
            int r1 = r7.f1071q
            char r0 = r0[r1]
            r2 = 37
            r3 = 4
            if (r0 == r2) goto Lcf
            r8 = 38
            r2 = 6
            if (r0 == r8) goto Lce
            r8 = 60
            if (r0 == r8) goto L24
            goto Ld4
        L24:
            r8 = 3
            int r1 = r1 + r8
            int r0 = r7.f1072r
            if (r1 < r0) goto L39
            boolean r0 = r7.c(r3)
            if (r0 == 0) goto L31
            goto L39
        L31:
            af.e r8 = new af.e
            java.lang.String r0 = "Dangling <"
            r8.<init>(r0, r7)
            throw r8
        L39:
            char[] r0 = r7.f1070p
            int r1 = r7.f1071q
            int r3 = r1 + 1
            char r3 = r0[r3]
            r4 = 33
            r5 = 76
            r6 = 5
            if (r3 == r4) goto L90
            r0 = 47
            if (r3 == r0) goto L8f
            r8 = 63
            if (r3 == r8) goto L52
            r8 = 2
            return r8
        L52:
            int r1 = r1 + r6
            int r8 = r7.f1072r
            if (r1 < r8) goto L5d
            boolean r8 = r7.c(r2)
            if (r8 == 0) goto L8d
        L5d:
            char[] r8 = r7.f1070p
            int r0 = r7.f1071q
            int r1 = r0 + 2
            char r1 = r8[r1]
            r2 = 120(0x78, float:1.68E-43)
            if (r1 == r2) goto L6d
            r2 = 88
            if (r1 != r2) goto L8d
        L6d:
            int r1 = r0 + 3
            char r1 = r8[r1]
            r2 = 109(0x6d, float:1.53E-43)
            if (r1 == r2) goto L79
            r2 = 77
            if (r1 != r2) goto L8d
        L79:
            int r1 = r0 + 4
            char r1 = r8[r1]
            r2 = 108(0x6c, float:1.51E-43)
            if (r1 == r2) goto L83
            if (r1 != r5) goto L8d
        L83:
            int r0 = r0 + r6
            char r8 = r8[r0]
            r0 = 32
            if (r8 != r0) goto L8d
            r8 = 998(0x3e6, float:1.398E-42)
            return r8
        L8d:
            r8 = 8
        L8f:
            return r8
        L90:
            int r2 = r1 + 2
            char r2 = r0[r2]
            r3 = 45
            if (r2 == r3) goto Lcb
            r3 = 65
            if (r2 == r3) goto Lc8
            r3 = 78
            if (r2 == r3) goto Lc5
            r4 = 91
            if (r2 == r4) goto Lc4
            r4 = 68
            if (r2 == r4) goto Lc1
            r4 = 69
            if (r2 != r4) goto Lb9
            int r1 = r1 + r8
            char r8 = r0[r1]
            if (r8 == r5) goto Lb6
            if (r8 != r3) goto Lb9
            r8 = 12
            return r8
        Lb6:
            r8 = 11
            return r8
        Lb9:
            af.e r8 = new af.e
            java.lang.String r0 = "Unexpected <!"
            r8.<init>(r0, r7)
            throw r8
        Lc1:
            r8 = 10
            return r8
        Lc4:
            return r6
        Lc5:
            r8 = 14
            return r8
        Lc8:
            r8 = 13
            return r8
        Lcb:
            r8 = 9
            return r8
        Lce:
            return r2
        Lcf:
            if (r8 == 0) goto Ld4
            r8 = 15
            return r8
        Ld4:
            return r3
    }

    public final void m(char r4) {
            r3 = this;
            int r0 = r3.k()
            if (r0 == r4) goto L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "expected: '"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "' actual: '"
            r1.append(r4)
            char r4 = (char) r0
            r1.append(r4)
            java.lang.String r4 = "'"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.a(r4)
            r4 = -1
            if (r0 != r4) goto L29
            return
        L29:
            int r4 = r3.f1071q
            int r4 = r4 + 1
            r3.f1071q = r4
            return
    }

    public final void o(char[] r7) {
            r6 = this;
            int r0 = r6.f1071q
            int r1 = r7.length
            int r0 = r0 + r1
            int r1 = r6.f1072r
            if (r0 <= r1) goto L2b
            int r0 = r7.length
            boolean r0 = r6.c(r0)
            if (r0 != 0) goto L2b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "expected: '"
            r0.<init>(r1)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r7)
            r0.append(r1)
            java.lang.String r7 = "' but was EOF"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.a(r7)
            return
        L2b:
            r0 = 0
        L2c:
            int r1 = r7.length
            if (r0 >= r1) goto L6a
            char[] r1 = r6.f1070p
            int r2 = r6.f1071q
            int r2 = r2 + r0
            char r1 = r1[r2]
            char r2 = r7[r0]
            if (r1 == r2) goto L67
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "expected: \""
            r1.<init>(r2)
            java.lang.String r2 = new java.lang.String
            r2.<init>(r7)
            r1.append(r2)
            java.lang.String r2 = "\" but was \""
            r1.append(r2)
            java.lang.String r2 = new java.lang.String
            char[] r3 = r6.f1070p
            int r4 = r6.f1071q
            int r5 = r7.length
            r2.<init>(r3, r4, r5)
            r1.append(r2)
            java.lang.String r2 = "...\""
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r6.a(r1)
        L67:
            int r0 = r0 + 1
            goto L2c
        L6a:
            int r0 = r6.f1071q
            int r7 = r7.length
            int r0 = r0 + r7
            r6.f1071q = r0
            return
    }

    public final java.lang.String q() {
            r3 = this;
            char[] r0 = c8.b.H
            r3.o(r0)
            char[] r0 = c8.b.J
            r1 = 0
            java.lang.String r0 = r3.w(r0, r1)
            int r1 = r3.k()
            r2 = 62
            if (r1 != r2) goto L1b
            int r1 = r3.f1071q
            int r1 = r1 + 1
            r3.f1071q = r1
            return r0
        L1b:
            af.e r0 = new af.e
            java.lang.String r1 = "Comments may not contain --"
            r0.<init>(r1, r3)
            throw r0
    }

    public final boolean s(boolean r5, boolean r6) {
            r4 = this;
            r4.y()
            int r0 = r4.k()
            r1 = 83
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L13
            char[] r0 = c8.b.P
            r4.o(r0)
            goto L28
        L13:
            r1 = 80
            if (r0 != r1) goto L47
            char[] r0 = c8.b.Q
            r4.o(r0)
            r4.y()
            if (r6 == 0) goto L25
            r4.u(r3)
            goto L28
        L25:
            r4.u(r2)
        L28:
            r4.y()
            if (r5 != 0) goto L3a
            int r5 = r4.k()
            r0 = 34
            if (r5 == r0) goto L3a
            r0 = 39
            if (r5 == r0) goto L3a
            return r3
        L3a:
            if (r6 == 0) goto L43
            java.lang.String r5 = r4.u(r3)
            r4.f1061g = r5
            return r3
        L43:
            r4.u(r2)
            return r3
        L47:
            return r2
    }

    public final java.lang.String t() {
            r13 = this;
            int r0 = r13.f1071q
            int r1 = r13.f1072r
            java.lang.String r2 = ""
            java.lang.String r3 = "name expected"
            r4 = 1
            if (r0 < r1) goto L15
            boolean r0 = r13.c(r4)
            if (r0 != 0) goto L15
            r13.a(r3)
            return r2
        L15:
            int r0 = r13.f1071q
            char[] r1 = r13.f1070p
            char r1 = r1[r0]
            r5 = 58
            r6 = 95
            r7 = 90
            r8 = 65
            r9 = 122(0x7a, float:1.71E-43)
            r10 = 97
            if (r1 < r10) goto L2b
            if (r1 <= r9) goto L3b
        L2b:
            if (r1 < r8) goto L2f
            if (r1 <= r7) goto L3b
        L2f:
            if (r1 == r6) goto L3b
            if (r1 == r5) goto L3b
            r11 = 192(0xc0, float:2.69E-43)
            if (r1 >= r11) goto L3b
            r13.a(r3)
            return r2
        L3b:
            int r1 = r0 + 1
            r13.f1071q = r1
            r1 = 0
        L40:
            int r2 = r13.f1071q
            int r3 = r13.f1072r
            if (r2 < r3) goto L62
            if (r1 != 0) goto L4d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L4d:
            char[] r2 = r13.f1070p
            int r3 = r13.f1071q
            int r3 = r3 - r0
            r1.append(r2, r0, r3)
            boolean r0 = r13.c(r4)
            if (r0 != 0) goto L60
            java.lang.String r0 = r1.toString()
            return r0
        L60:
            int r0 = r13.f1071q
        L62:
            char[] r2 = r13.f1070p
            int r3 = r13.f1071q
            char r11 = r2[r3]
            if (r11 < r10) goto L6c
            if (r11 <= r9) goto L9b
        L6c:
            if (r11 < r8) goto L70
            if (r11 <= r7) goto L9b
        L70:
            r12 = 48
            if (r11 < r12) goto L78
            r12 = 57
            if (r11 <= r12) goto L9b
        L78:
            if (r11 == r6) goto L9b
            r12 = 45
            if (r11 == r12) goto L9b
            if (r11 == r5) goto L9b
            r12 = 46
            if (r11 == r12) goto L9b
            r12 = 183(0xb7, float:2.56E-43)
            if (r11 < r12) goto L89
            goto L9b
        L89:
            if (r1 != 0) goto L92
            java.lang.String r1 = new java.lang.String
            int r3 = r3 - r0
            r1.<init>(r2, r0, r3)
            return r1
        L92:
            int r3 = r3 - r0
            r1.append(r2, r0, r3)
            java.lang.String r0 = r1.toString()
            return r0
        L9b:
            int r3 = r3 + 1
            r13.f1071q = r3
            goto L40
    }

    public final java.lang.String u(boolean r3) {
            r2 = this;
            int r0 = r2.k()
            r1 = 34
            if (r0 != r1) goto Lb
            char[] r0 = c8.b.f1060d0
            goto L11
        Lb:
            r1 = 39
            if (r0 != r1) goto L1c
            char[] r0 = c8.b.f1059c0
        L11:
            int r1 = r2.f1071q
            int r1 = r1 + 1
            r2.f1071q = r1
            java.lang.String r3 = r2.w(r0, r3)
            return r3
        L1c:
            af.e r3 = new af.e
            java.lang.String r0 = "Expected a quoted string"
            r3.<init>(r0, r2)
            throw r3
    }

    public final java.lang.String w(char[] r8, boolean r9) {
            r7 = this;
            int r0 = r7.f1071q
            r1 = 0
            if (r9 == 0) goto L14
            java.lang.String r2 = r7.f1080z
            if (r2 == 0) goto L14
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.f1080z
            r2.append(r3)
            goto L15
        L14:
            r2 = r1
        L15:
            int r3 = r7.f1071q
            int r4 = r8.length
            int r4 = r4 + r3
            int r5 = r7.f1072r
            if (r4 <= r5) goto L43
            if (r0 >= r3) goto L30
            if (r9 == 0) goto L30
            if (r2 != 0) goto L28
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L28:
            char[] r3 = r7.f1070p
            int r4 = r7.f1071q
            int r4 = r4 - r0
            r2.append(r3, r0, r4)
        L30:
            int r0 = r8.length
            boolean r0 = r7.c(r0)
            if (r0 != 0) goto L41
            java.lang.String r8 = "Unexpected EOF"
            r7.a(r8)
            r8 = 9
            r7.f1075u = r8
            return r1
        L41:
            int r0 = r7.f1071q
        L43:
            r3 = 0
        L44:
            int r4 = r8.length
            if (r3 >= r4) goto L5b
            char[] r4 = r7.f1070p
            int r5 = r7.f1071q
            int r6 = r5 + r3
            char r4 = r4[r6]
            char r6 = r8[r3]
            if (r4 == r6) goto L58
            int r5 = r5 + 1
            r7.f1071q = r5
            goto L15
        L58:
            int r3 = r3 + 1
            goto L44
        L5b:
            int r3 = r7.f1071q
            int r8 = r8.length
            int r8 = r8 + r3
            r7.f1071q = r8
            if (r9 != 0) goto L64
            return r1
        L64:
            char[] r8 = r7.f1070p
            if (r2 != 0) goto L6f
            java.lang.String r9 = new java.lang.String
            int r3 = r3 - r0
            r9.<init>(r8, r0, r3)
            return r9
        L6f:
            int r3 = r3 - r0
            r2.append(r8, r0, r3)
            java.lang.String r8 = r2.toString()
            return r8
    }

    public final java.lang.String x(char r17, boolean r18, boolean r19, int r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r20
            int r3 = r0.f1071q
            r4 = 2
            if (r2 != r4) goto L1a
            java.lang.String r5 = r0.f1080z
            if (r5 == 0) goto L1a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r0.f1080z
            r5.append(r6)
            goto L1b
        L1a:
            r5 = 0
        L1b:
            int r6 = r0.f1071q
            int r7 = r0.f1072r
            r8 = 1
            if (r6 < r7) goto L45
            if (r3 >= r6) goto L33
            if (r5 != 0) goto L2b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        L2b:
            char[] r6 = r0.f1070p
            int r7 = r0.f1071q
            int r7 = r7 - r3
            r5.append(r6, r3, r7)
        L33:
            boolean r3 = r0.c(r8)
            if (r3 != 0) goto L43
            if (r5 == 0) goto L40
            java.lang.String r1 = r5.toString()
            return r1
        L40:
            java.lang.String r1 = ""
            return r1
        L43:
            int r3 = r0.f1071q
        L45:
            char[] r6 = r0.f1070p
            int r7 = r0.f1071q
            char r9 = r6[r7]
            if (r9 == r1) goto L232
            r10 = 62
            r11 = 32
            if (r1 != r11) goto L57
            if (r9 <= r11) goto L232
            if (r9 == r10) goto L232
        L57:
            r12 = 38
            if (r9 != r12) goto L5f
            if (r18 != 0) goto L5f
            goto L232
        L5f:
            r13 = 37
            r14 = 60
            r15 = 13
            r10 = 93
            r11 = 10
            r6 = 0
            if (r9 == r15) goto L71
            if (r9 != r11) goto L74
            if (r2 == r8) goto L71
            goto L74
        L71:
            r13 = 32
            goto L92
        L74:
            if (r9 == r12) goto L71
            if (r9 == r14) goto L71
            if (r9 != r10) goto L7c
            if (r2 == r4) goto L71
        L7c:
            if (r9 != r13) goto L81
            r13 = 3
            if (r2 == r13) goto L71
        L81:
            boolean r10 = r0.f1076v
            r13 = 32
            if (r9 > r13) goto L88
            goto L89
        L88:
            r8 = r6
        L89:
            r6 = r10 & r8
            r0.f1076v = r6
            int r7 = r7 + 1
            r0.f1071q = r7
            goto L1b
        L92:
            if (r5 != 0) goto L99
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        L99:
            char[] r7 = r0.f1070p
            int r13 = r0.f1071q
            int r13 = r13 - r3
            r5.append(r7, r3, r13)
            if (r9 != r15) goto Lc1
            int r3 = r0.f1071q
            int r3 = r3 + r8
            int r6 = r0.f1072r
            if (r3 < r6) goto Lb0
            boolean r3 = r0.c(r4)
            if (r3 == 0) goto Lbb
        Lb0:
            char[] r3 = r0.f1070p
            int r6 = r0.f1071q
            int r6 = r6 + r8
            char r3 = r3[r6]
            if (r3 != r11) goto Lbb
            r0.f1071q = r6
        Lbb:
            if (r2 != r8) goto Lbe
            goto Lc3
        Lbe:
            r9 = r11
            goto L214
        Lc1:
            if (r9 != r11) goto Lc7
        Lc3:
            r9 = 32
            goto L214
        Lc7:
            if (r9 != r12) goto L1df
            r0.f1076v = r6
            java.lang.String r3 = "Invalid character reference: &"
            int r7 = r5.length()
            char[] r9 = r0.f1070p
            int r10 = r0.f1071q
            int r11 = r10 + 1
            r0.f1071q = r11
            char r9 = r9[r10]
            if (r9 != r12) goto L1d9
            r5.append(r12)
        Le0:
            int r9 = r0.k()
            r10 = 59
            if (r9 != r10) goto L19d
            r5.append(r10)
            int r9 = r0.f1071q
            int r9 = r9 + r8
            r0.f1071q = r9
            int r9 = r7 + 1
            int r10 = r5.length()
            int r10 = r10 - r8
            java.lang.String r9 = r5.substring(r9, r10)
            java.lang.String r10 = "#"
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L13f
            java.lang.String r10 = "#x"
            boolean r10 = r9.startsWith(r10)     // Catch: java.lang.IllegalArgumentException -> L12b java.lang.NumberFormatException -> L135
            if (r10 == 0) goto L116
            java.lang.String r8 = r9.substring(r4)     // Catch: java.lang.IllegalArgumentException -> L12b java.lang.NumberFormatException -> L135
            r10 = 16
            int r8 = java.lang.Integer.parseInt(r8, r10)     // Catch: java.lang.IllegalArgumentException -> L12b java.lang.NumberFormatException -> L135
            goto L11e
        L116:
            java.lang.String r8 = r9.substring(r8)     // Catch: java.lang.IllegalArgumentException -> L12b java.lang.NumberFormatException -> L135
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.IllegalArgumentException -> L12b java.lang.NumberFormatException -> L135
        L11e:
            int r10 = r5.length()     // Catch: java.lang.IllegalArgumentException -> L12b java.lang.NumberFormatException -> L135
            r5.delete(r7, r10)     // Catch: java.lang.IllegalArgumentException -> L12b java.lang.NumberFormatException -> L135
            r5.appendCodePoint(r8)     // Catch: java.lang.IllegalArgumentException -> L12b java.lang.NumberFormatException -> L135
            r0.F = r6     // Catch: java.lang.IllegalArgumentException -> L12b java.lang.NumberFormatException -> L135
            goto L199
        L12b:
            af.e r1 = new af.e
            java.lang.String r2 = r3.concat(r9)
            r1.<init>(r2)
            throw r1
        L135:
            af.e r1 = new af.e
            java.lang.String r2 = r3.concat(r9)
            r1.<init>(r2)
            throw r1
        L13f:
            r13 = 3
            if (r2 != r13) goto L143
            goto L199
        L143:
            java.util.HashMap r3 = c8.b.G
            java.lang.Object r3 = r3.get(r9)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L15a
            int r8 = r5.length()
            r5.delete(r7, r8)
            r0.F = r6
            r5.append(r3)
            goto L199
        L15a:
            java.util.HashMap r3 = r0.f1062h
            if (r3 == 0) goto L173
            java.lang.Object r3 = r3.get(r9)
            char[] r3 = (char[]) r3
            if (r3 == 0) goto L173
            int r8 = r5.length()
            r5.delete(r7, r8)
            r0.F = r6
            r5.append(r3)
            goto L199
        L173:
            java.lang.String r3 = r0.f1061g
            if (r3 == 0) goto L17f
            int r3 = r5.length()
            r5.delete(r7, r3)
            goto L199
        L17f:
            r0.F = r8
            if (r19 == 0) goto L199
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "unresolved: &"
            r3.<init>(r6)
            r3.append(r9)
            java.lang.String r6 = ";"
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r0.a(r3)
        L199:
            int r3 = r0.f1071q
            goto L1b
        L19d:
            r10 = 128(0x80, float:1.8E-43)
            if (r9 >= r10) goto L1ce
            r10 = 48
            if (r9 < r10) goto L1a9
            r10 = 57
            if (r9 <= r10) goto L1ce
        L1a9:
            r10 = 97
            if (r9 < r10) goto L1b1
            r10 = 122(0x7a, float:1.71E-43)
            if (r9 <= r10) goto L1ce
        L1b1:
            r10 = 65
            if (r9 < r10) goto L1b9
            r10 = 90
            if (r9 <= r10) goto L1ce
        L1b9:
            r10 = 95
            if (r9 == r10) goto L1ce
            r10 = 45
            if (r9 == r10) goto L1ce
            r10 = 35
            if (r9 != r10) goto L1c6
            goto L1ce
        L1c6:
            af.e r1 = new af.e
            java.lang.String r2 = "unterminated entity ref"
            r1.<init>(r2, r0)
            throw r1
        L1ce:
            int r10 = r0.f1071q
            int r10 = r10 + r8
            r0.f1071q = r10
            char r9 = (char) r9
            r5.append(r9)
            goto Le0
        L1d9:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L1df:
            if (r9 != r14) goto L1eb
            if (r2 != r8) goto L1e8
            java.lang.String r3 = "Illegal: \"<\" inside attribute value"
            r0.a(r3)
        L1e8:
            r0.f1076v = r6
            goto L214
        L1eb:
            if (r9 != r10) goto L220
            int r3 = r0.f1071q
            int r3 = r3 + r4
            int r7 = r0.f1072r
            if (r3 < r7) goto L1fb
            r13 = 3
            boolean r3 = r0.c(r13)
            if (r3 == 0) goto L212
        L1fb:
            char[] r3 = r0.f1070p
            int r7 = r0.f1071q
            int r11 = r7 + 1
            char r11 = r3[r11]
            if (r11 != r10) goto L212
            int r7 = r7 + 2
            char r3 = r3[r7]
            r7 = 62
            if (r3 != r7) goto L212
            java.lang.String r3 = "Illegal: \"]]>\" outside CDATA section"
            r0.a(r3)
        L212:
            r0.f1076v = r6
        L214:
            int r3 = r0.f1071q
            int r3 = r3 + r8
            r0.f1071q = r3
            r5.append(r9)
            int r3 = r0.f1071q
            goto L1b
        L220:
            r3 = 37
            if (r9 != r3) goto L22c
            af.e r1 = new af.e
            java.lang.String r2 = "This parser doesn't support parameter entities"
            r1.<init>(r2, r0)
            throw r1
        L22c:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L232:
            if (r5 != 0) goto L23b
            java.lang.String r1 = new java.lang.String
            int r7 = r7 - r3
            r1.<init>(r6, r3, r7)
            return r1
        L23b:
            int r7 = r7 - r3
            r5.append(r6, r3, r7)
            java.lang.String r1 = r5.toString()
            return r1
    }

    public final void y() {
            r3 = this;
        L0:
            int r0 = r3.f1071q
            int r1 = r3.f1072r
            if (r0 < r1) goto Ld
            r0 = 1
            boolean r0 = r3.c(r0)
            if (r0 == 0) goto L17
        Ld:
            char[] r0 = r3.f1070p
            int r1 = r3.f1071q
            char r0 = r0[r1]
            r2 = 32
            if (r0 <= r2) goto L18
        L17:
            return
        L18:
            int r1 = r1 + 1
            r3.f1071q = r1
            goto L0
    }
}
