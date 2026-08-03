package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(19)
public class C4960 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f15800 = 1;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f15801 = 2;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f15802 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f15803 = 6;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f15804 = 7;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final byte[] f15805 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final byte[] f15806 = null;

    static {
            r0 = 4
            byte[] r1 = new byte[r0]
            r1 = {x0010: FILL_ARRAY_DATA , data: [112, 114, 111, 0} // fill-array
            Yue.C4960.f15805 = r1
            byte[] r0 = new byte[r0]
            r0 = {x0016: FILL_ARRAY_DATA , data: [112, 114, 109, 0} // fill-array
            Yue.C4960.f15806 = r0
            return
    }

    public C4960() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m19343(@Yue.InterfaceC4410 Yue.C1829 r2) {
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r2 = r2.f5650
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        Lb:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0 = r0 | r1
            goto Lb
        L23:
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static byte[] m19344(@Yue.InterfaceC4410 Yue.C1829[] r8, @Yue.InterfaceC4410 byte[] r9) throws java.io.IOException {
            int r0 = r8.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto L29
            r4 = r8[r2]
            java.lang.String r5 = r4.f5642
            java.lang.String r6 = r4.f5643
            java.lang.String r5 = m19352(r5, r6, r9)
            int r5 = Yue.C2151.m10100(r5)
            int r5 = r5 + 16
            int r6 = r4.f5646
            int r6 = r6 * 2
            int r5 = r5 + r6
            int r6 = r4.f5647
            int r5 = r5 + r6
            int r4 = r4.f5648
            int r4 = m19353(r4)
            int r5 = r5 + r4
            int r3 = r3 + r5
            int r2 = r2 + 1
            goto L4
        L29:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>(r3)
            byte[] r2 = Yue.C4961.f15809
            boolean r2 = java.util.Arrays.equals(r9, r2)
            if (r2 == 0) goto L4c
            int r2 = r8.length
        L37:
            if (r1 >= r2) goto L6b
            r4 = r8[r1]
            java.lang.String r5 = r4.f5642
            java.lang.String r6 = r4.f5643
            java.lang.String r5 = m19352(r5, r6, r9)
            m19375(r0, r4, r5)
            m19374(r0, r4)
            int r1 = r1 + 1
            goto L37
        L4c:
            int r2 = r8.length
            r4 = r1
        L4e:
            if (r4 >= r2) goto L60
            r5 = r8[r4]
            java.lang.String r6 = r5.f5642
            java.lang.String r7 = r5.f5643
            java.lang.String r6 = m19352(r6, r7, r9)
            m19375(r0, r5, r6)
            int r4 = r4 + 1
            goto L4e
        L60:
            int r9 = r8.length
        L61:
            if (r1 >= r9) goto L6b
            r2 = r8[r1]
            m19374(r0, r2)
            int r1 = r1 + 1
            goto L61
        L6b:
            int r8 = r0.size()
            if (r8 != r3) goto L76
            byte[] r8 = r0.toByteArray()
            return r8
        L76:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "The bytes saved do not match expectation. actual="
            r8.append(r9)
            int r9 = r0.size()
            r8.append(r9)
            java.lang.String r9 = " expected="
            r8.append(r9)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            java.lang.RuntimeException r8 = Yue.C2151.m10092(r8)
            throw r8
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C7138 m19345(@Yue.InterfaceC4410 Yue.C1829[] r5) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r5.length     // Catch: java.lang.Throwable -> L21
            if (r1 >= r3) goto L23
            r3 = r5[r1]     // Catch: java.lang.Throwable -> L21
            Yue.C2151.m10105(r0, r1)     // Catch: java.lang.Throwable -> L21
            int r2 = r2 + 4
            int r4 = r3.f5646     // Catch: java.lang.Throwable -> L21
            Yue.C2151.m10105(r0, r4)     // Catch: java.lang.Throwable -> L21
            int r4 = r3.f5646     // Catch: java.lang.Throwable -> L21
            int r4 = r4 * 2
            int r2 = r2 + r4
            m19371(r0, r3)     // Catch: java.lang.Throwable -> L21
            int r1 = r1 + 1
            goto L7
        L21:
            r5 = move-exception
            goto L55
        L23:
            byte[] r5 = r0.toByteArray()     // Catch: java.lang.Throwable -> L21
            int r1 = r5.length     // Catch: java.lang.Throwable -> L21
            if (r2 != r1) goto L36
            Yue.ۥۢۦ۠ۤ r1 = new Yue.ۥۢۦ۠ۤ     // Catch: java.lang.Throwable -> L21
            Yue.ۥ۠ۡۨۢ r3 = Yue.EnumC2366.f7752     // Catch: java.lang.Throwable -> L21
            r4 = 1
            r1.<init>(r3, r2, r5, r4)     // Catch: java.lang.Throwable -> L21
            r0.close()
            return r1
        L36:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = "Expected size "
            r1.append(r3)     // Catch: java.lang.Throwable -> L21
            r1.append(r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = ", does not match actual size "
            r1.append(r2)     // Catch: java.lang.Throwable -> L21
            int r5 = r5.length     // Catch: java.lang.Throwable -> L21
            r1.append(r5)     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L21
            java.lang.RuntimeException r5 = Yue.C2151.m10092(r5)     // Catch: java.lang.Throwable -> L21
            throw r5     // Catch: java.lang.Throwable -> L21
        L55:
            r0.close()     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r0 = move-exception
            r5.addSuppressed(r0)
        L5d:
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C7138 m19346(@Yue.InterfaceC4410 Yue.C1829[] r9) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r9.length     // Catch: java.lang.Throwable -> L33
            if (r1 >= r3) goto L35
            r3 = r9[r1]     // Catch: java.lang.Throwable -> L33
            int r4 = m19343(r3)     // Catch: java.lang.Throwable -> L33
            byte[] r5 = m19347(r3)     // Catch: java.lang.Throwable -> L33
            byte[] r3 = m19348(r3)     // Catch: java.lang.Throwable -> L33
            Yue.C2151.m10105(r0, r1)     // Catch: java.lang.Throwable -> L33
            int r6 = r5.length     // Catch: java.lang.Throwable -> L33
            int r6 = r6 + 2
            int r7 = r3.length     // Catch: java.lang.Throwable -> L33
            int r6 = r6 + r7
            int r2 = r2 + 6
            long r7 = (long) r6     // Catch: java.lang.Throwable -> L33
            Yue.C2151.m10106(r0, r7)     // Catch: java.lang.Throwable -> L33
            Yue.C2151.m10105(r0, r4)     // Catch: java.lang.Throwable -> L33
            r0.write(r5)     // Catch: java.lang.Throwable -> L33
            r0.write(r3)     // Catch: java.lang.Throwable -> L33
            int r2 = r2 + r6
            int r1 = r1 + 1
            goto L7
        L33:
            r9 = move-exception
            goto L67
        L35:
            byte[] r9 = r0.toByteArray()     // Catch: java.lang.Throwable -> L33
            int r1 = r9.length     // Catch: java.lang.Throwable -> L33
            if (r2 != r1) goto L48
            Yue.ۥۢۦ۠ۤ r1 = new Yue.ۥۢۦ۠ۤ     // Catch: java.lang.Throwable -> L33
            Yue.ۥ۠ۡۨۢ r3 = Yue.EnumC2366.f7753     // Catch: java.lang.Throwable -> L33
            r4 = 1
            r1.<init>(r3, r2, r9, r4)     // Catch: java.lang.Throwable -> L33
            r0.close()
            return r1
        L48:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "Expected size "
            r1.append(r3)     // Catch: java.lang.Throwable -> L33
            r1.append(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = ", does not match actual size "
            r1.append(r2)     // Catch: java.lang.Throwable -> L33
            int r9 = r9.length     // Catch: java.lang.Throwable -> L33
            r1.append(r9)     // Catch: java.lang.Throwable -> L33
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> L33
            java.lang.RuntimeException r9 = Yue.C2151.m10092(r9)     // Catch: java.lang.Throwable -> L33
            throw r9     // Catch: java.lang.Throwable -> L33
        L67:
            r0.close()     // Catch: java.lang.Throwable -> L6b
            goto L6f
        L6b:
            r0 = move-exception
            r9.addSuppressed(r0)
        L6f:
            throw r9
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static byte[] m19347(@Yue.InterfaceC4410 Yue.C1829 r1) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            m19376(r0, r1)     // Catch: java.lang.Throwable -> L10
            byte[] r1 = r0.toByteArray()     // Catch: java.lang.Throwable -> L10
            r0.close()
            return r1
        L10:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r0 = move-exception
            r1.addSuppressed(r0)
        L19:
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static byte[] m19348(@Yue.InterfaceC4410 Yue.C1829 r1) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            m19377(r0, r1)     // Catch: java.lang.Throwable -> L10
            byte[] r1 = r0.toByteArray()     // Catch: java.lang.Throwable -> L10
            r0.close()
            return r1
        L10:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r0 = move-exception
            r1.addSuppressed(r0)
        L19:
            throw r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static java.lang.String m19349(@Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4410 java.lang.String r4) {
            java.lang.String r0 = "!"
            boolean r1 = r0.equals(r4)
            java.lang.String r2 = ":"
            if (r1 == 0) goto Lf
            java.lang.String r3 = r3.replace(r2, r0)
            return r3
        Lf:
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L19
            java.lang.String r3 = r3.replace(r0, r2)
        L19:
            return r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static java.lang.String m19350(@Yue.InterfaceC4410 java.lang.String r1) {
            java.lang.String r0 = "!"
            int r0 = r1.indexOf(r0)
            if (r0 >= 0) goto Le
            java.lang.String r0 = ":"
            int r0 = r1.indexOf(r0)
        Le:
            if (r0 <= 0) goto L16
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r0)
        L16:
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Yue.C1829 m19351(@Yue.InterfaceC4410 Yue.C1829[] r3, @Yue.InterfaceC4410 java.lang.String r4) {
            int r0 = r3.length
            r1 = 0
            if (r0 > 0) goto L5
            return r1
        L5:
            java.lang.String r4 = m19350(r4)
            r0 = 0
        La:
            int r2 = r3.length
            if (r0 >= r2) goto L1d
            r2 = r3[r0]
            java.lang.String r2 = r2.f5643
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L1a
            r3 = r3[r0]
            return r3
        L1a:
            int r0 = r0 + 1
            goto La
        L1d:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static java.lang.String m19352(@Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4410 byte[] r4) {
            java.lang.String r0 = Yue.C4961.m19384(r4)
            int r1 = r2.length()
            if (r1 > 0) goto Lf
            java.lang.String r2 = m19349(r3, r0)
            return r2
        Lf:
            java.lang.String r1 = "classes.dex"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L18
            return r2
        L18:
            java.lang.String r1 = "!"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L49
            java.lang.String r1 = ":"
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L29
            goto L49
        L29:
            java.lang.String r0 = ".apk"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L32
            return r3
        L32:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = Yue.C4961.m19384(r4)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            return r2
        L49:
            java.lang.String r2 = m19349(r3, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m19353(int r0) {
            int r0 = r0 * 2
            int r0 = m19367(r0)
            int r0 = r0 / 8
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static int m19354(int r1, int r2, int r3) {
            r0 = 1
            if (r1 == r0) goto L22
            r0 = 2
            if (r1 == r0) goto L21
            r0 = 4
            if (r1 != r0) goto Lb
            int r2 = r2 + r3
            return r2
        Lb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected flag: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.RuntimeException r1 = Yue.C2151.m10092(r1)
            throw r1
        L21:
            return r2
        L22:
            java.lang.String r1 = "HOT methods are not stored in the bitmap"
            java.lang.RuntimeException r1 = Yue.C2151.m10092(r1)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static int[] m19355(@Yue.InterfaceC4410 java.io.InputStream r4, int r5) throws java.io.IOException {
            int[] r0 = new int[r5]
            r1 = 0
            r2 = r1
        L4:
            if (r1 >= r5) goto L10
            int r3 = Yue.C2151.m10097(r4)
            int r2 = r2 + r3
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L10:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static int m19356(@Yue.InterfaceC4410 java.util.BitSet r2, int r3, int r4) {
            r0 = 2
            int r1 = m19354(r0, r3, r4)
            boolean r1 = r2.get(r1)
            if (r1 == 0) goto Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            r1 = 4
            int r3 = m19354(r1, r3, r4)
            boolean r2 = r2.get(r3)
            if (r2 == 0) goto L1a
            r0 = r0 | 4
        L1a:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static byte[] m19357(@Yue.InterfaceC4410 java.io.InputStream r1, @Yue.InterfaceC4410 byte[] r2) throws java.io.IOException {
            int r0 = r2.length
            byte[] r0 = Yue.C2151.m10093(r1, r0)
            boolean r2 = java.util.Arrays.equals(r2, r0)
            if (r2 == 0) goto L13
            byte[] r2 = Yue.C4961.f15808
            int r2 = r2.length
            byte[] r1 = Yue.C2151.m10093(r1, r2)
            return r1
        L13:
            java.lang.String r1 = "Invalid magic"
            java.lang.RuntimeException r1 = Yue.C2151.m10092(r1)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static void m19358(@Yue.InterfaceC4410 java.io.InputStream r5, @Yue.InterfaceC4410 Yue.C1829 r6) throws java.io.IOException {
            int r0 = r5.available()
            int r1 = r6.f5647
            int r0 = r0 - r1
            r1 = 0
        L8:
            int r2 = r5.available()
            if (r2 <= r0) goto L2d
            int r2 = Yue.C2151.m10097(r5)
            int r1 = r1 + r2
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r2 = r6.f5650
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            int r2 = Yue.C2151.m10097(r5)
        L25:
            if (r2 <= 0) goto L8
            m19369(r5)
            int r2 = r2 + (-1)
            goto L25
        L2d:
            int r5 = r5.available()
            if (r5 != r0) goto L34
            return
        L34:
            java.lang.String r5 = "Read too much data during profile line parse"
            java.lang.RuntimeException r5 = Yue.C2151.m10092(r5)
            throw r5
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static Yue.C1829[] m19359(@Yue.InterfaceC4410 java.io.InputStream r1, @Yue.InterfaceC4410 byte[] r2, @Yue.InterfaceC4410 byte[] r3, Yue.C1829[] r4) throws java.io.IOException {
            byte[] r0 = Yue.C4961.f15812
            boolean r0 = java.util.Arrays.equals(r2, r0)
            if (r0 == 0) goto L1c
            byte[] r0 = Yue.C4961.f15807
            boolean r3 = java.util.Arrays.equals(r0, r3)
            if (r3 != 0) goto L15
            Yue.ۥ۠۟۟ۦ[] r1 = m19360(r1, r2, r4)
            return r1
        L15:
            java.lang.String r1 = "Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher"
            java.lang.RuntimeException r1 = Yue.C2151.m10092(r1)
            throw r1
        L1c:
            byte[] r0 = Yue.C4961.f15813
            boolean r2 = java.util.Arrays.equals(r2, r0)
            if (r2 == 0) goto L29
            Yue.ۥ۠۟۟ۦ[] r1 = m19362(r1, r3, r4)
            return r1
        L29:
            java.lang.String r1 = "Unsupported meta version"
            java.lang.RuntimeException r1 = Yue.C2151.m10092(r1)
            throw r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static Yue.C1829[] m19360(@Yue.InterfaceC4410 java.io.InputStream r4, @Yue.InterfaceC4410 byte[] r5, Yue.C1829[] r6) throws java.io.IOException {
            byte[] r0 = Yue.C4961.f15812
            boolean r5 = java.util.Arrays.equals(r5, r0)
            if (r5 == 0) goto L3e
            int r5 = Yue.C2151.m10099(r4)
            long r0 = Yue.C2151.m10098(r4)
            long r2 = Yue.C2151.m10098(r4)
            int r2 = (int) r2
            int r0 = (int) r0
            byte[] r0 = Yue.C2151.m10094(r4, r2, r0)
            int r4 = r4.read()
            if (r4 > 0) goto L37
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            r4.<init>(r0)
            Yue.ۥ۠۟۟ۦ[] r5 = m19361(r4, r5, r6)     // Catch: java.lang.Throwable -> L2d
            r4.close()
            return r5
        L2d:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r4 = move-exception
            r5.addSuppressed(r4)
        L36:
            throw r5
        L37:
            java.lang.String r4 = "Content found after the end of file"
            java.lang.RuntimeException r4 = Yue.C2151.m10092(r4)
            throw r4
        L3e:
            java.lang.String r4 = "Unsupported meta version"
            java.lang.RuntimeException r4 = Yue.C2151.m10092(r4)
            throw r4
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static Yue.C1829[] m19361(@Yue.InterfaceC4410 java.io.InputStream r6, int r7, Yue.C1829[] r8) throws java.io.IOException {
            int r0 = r6.available()
            r1 = 0
            if (r0 != 0) goto La
            Yue.ۥ۠۟۟ۦ[] r6 = new Yue.C1829[r1]
            return r6
        La:
            int r0 = r8.length
            if (r7 != r0) goto L4a
            java.lang.String[] r0 = new java.lang.String[r7]
            int[] r2 = new int[r7]
            r3 = r1
        L12:
            if (r3 >= r7) goto L27
            int r4 = Yue.C2151.m10097(r6)
            int r5 = Yue.C2151.m10097(r6)
            r2[r3] = r5
            java.lang.String r4 = Yue.C2151.m10095(r6, r4)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L12
        L27:
            if (r1 >= r7) goto L49
            r3 = r8[r1]
            java.lang.String r4 = r3.f5643
            r5 = r0[r1]
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L42
            r4 = r2[r1]
            r3.f5646 = r4
            int[] r4 = m19355(r6, r4)
            r3.f5649 = r4
            int r1 = r1 + 1
            goto L27
        L42:
            java.lang.String r6 = "Order of dexfiles in metadata did not match baseline"
            java.lang.RuntimeException r6 = Yue.C2151.m10092(r6)
            throw r6
        L49:
            return r8
        L4a:
            java.lang.String r6 = "Mismatched number of dex files found in metadata"
            java.lang.RuntimeException r6 = Yue.C2151.m10092(r6)
            throw r6
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static Yue.C1829[] m19362(@Yue.InterfaceC4410 java.io.InputStream r5, @Yue.InterfaceC4410 byte[] r6, Yue.C1829[] r7) throws java.io.IOException {
            int r0 = Yue.C2151.m10097(r5)
            long r1 = Yue.C2151.m10098(r5)
            long r3 = Yue.C2151.m10098(r5)
            int r3 = (int) r3
            int r1 = (int) r1
            byte[] r1 = Yue.C2151.m10094(r5, r3, r1)
            int r5 = r5.read()
            if (r5 > 0) goto L2f
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            r5.<init>(r1)
            Yue.ۥ۠۟۟ۦ[] r6 = m19363(r5, r6, r0, r7)     // Catch: java.lang.Throwable -> L25
            r5.close()
            return r6
        L25:
            r6 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r5 = move-exception
            r6.addSuppressed(r5)
        L2e:
            throw r6
        L2f:
            java.lang.String r5 = "Content found after the end of file"
            java.lang.RuntimeException r5 = Yue.C2151.m10092(r5)
            throw r5
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static Yue.C1829[] m19363(@Yue.InterfaceC4410 java.io.InputStream r6, @Yue.InterfaceC4410 byte[] r7, int r8, Yue.C1829[] r9) throws java.io.IOException {
            int r0 = r6.available()
            r1 = 0
            if (r0 != 0) goto La
            Yue.ۥ۠۟۟ۦ[] r6 = new Yue.C1829[r1]
            return r6
        La:
            int r0 = r9.length
            if (r8 != r0) goto L54
        Ld:
            if (r1 >= r8) goto L53
            Yue.C2151.m10097(r6)
            int r0 = Yue.C2151.m10097(r6)
            java.lang.String r0 = Yue.C2151.m10095(r6, r0)
            long r2 = Yue.C2151.m10098(r6)
            int r4 = Yue.C2151.m10097(r6)
            Yue.ۥ۠۟۟ۦ r5 = m19351(r9, r0)
            if (r5 == 0) goto L3d
            r5.f5645 = r2
            int[] r0 = m19355(r6, r4)
            byte[] r2 = Yue.C4961.f15811
            boolean r2 = java.util.Arrays.equals(r7, r2)
            if (r2 == 0) goto L3a
            r5.f5646 = r4
            r5.f5649 = r0
        L3a:
            int r1 = r1 + 1
            goto Ld
        L3d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Missing profile key: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.RuntimeException r6 = Yue.C2151.m10092(r6)
            throw r6
        L53:
            return r9
        L54:
            java.lang.String r6 = "Mismatched number of dex files found in metadata"
            java.lang.RuntimeException r6 = Yue.C2151.m10092(r6)
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static void m19364(@Yue.InterfaceC4410 java.io.InputStream r6, @Yue.InterfaceC4410 Yue.C1829 r7) throws java.io.IOException {
            int r0 = r7.f5648
            int r0 = r0 * 2
            int r0 = Yue.C2151.m10090(r0)
            byte[] r6 = Yue.C2151.m10093(r6, r0)
            java.util.BitSet r6 = java.util.BitSet.valueOf(r6)
            r0 = 0
            r1 = r0
        L12:
            int r2 = r7.f5648
            if (r1 >= r2) goto L43
            int r2 = m19356(r6, r1, r2)
            if (r2 == 0) goto L40
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r3 = r7.f5650
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r3.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L2e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L2e:
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r4 = r7.f5650
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            int r3 = r3.intValue()
            r2 = r2 | r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.put(r5, r2)
        L40:
            int r1 = r1 + 1
            goto L12
        L43:
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static Yue.C1829[] m19365(@Yue.InterfaceC4410 java.io.InputStream r4, @Yue.InterfaceC4410 byte[] r5, @Yue.InterfaceC4410 java.lang.String r6) throws java.io.IOException {
            byte[] r0 = Yue.C4961.f15808
            boolean r5 = java.util.Arrays.equals(r5, r0)
            if (r5 == 0) goto L3e
            int r5 = Yue.C2151.m10099(r4)
            long r0 = Yue.C2151.m10098(r4)
            long r2 = Yue.C2151.m10098(r4)
            int r2 = (int) r2
            int r0 = (int) r0
            byte[] r0 = Yue.C2151.m10094(r4, r2, r0)
            int r4 = r4.read()
            if (r4 > 0) goto L37
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            r4.<init>(r0)
            Yue.ۥ۠۟۟ۦ[] r5 = m19366(r4, r6, r5)     // Catch: java.lang.Throwable -> L2d
            r4.close()
            return r5
        L2d:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r4 = move-exception
            r5.addSuppressed(r4)
        L36:
            throw r5
        L37:
            java.lang.String r4 = "Content found after the end of file"
            java.lang.RuntimeException r4 = Yue.C2151.m10092(r4)
            throw r4
        L3e:
            java.lang.String r4 = "Unsupported version"
            java.lang.RuntimeException r4 = Yue.C2151.m10092(r4)
            throw r4
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static Yue.C1829[] m19366(@Yue.InterfaceC4410 java.io.InputStream r19, @Yue.InterfaceC4410 java.lang.String r20, int r21) throws java.io.IOException {
            r0 = r19
            r1 = r21
            int r2 = r19.available()
            r3 = 0
            if (r2 != 0) goto Le
            Yue.ۥ۠۟۟ۦ[] r0 = new Yue.C1829[r3]
            return r0
        Le:
            Yue.ۥ۠۟۟ۦ[] r2 = new Yue.C1829[r1]
            r4 = r3
        L11:
            if (r4 >= r1) goto L46
            int r5 = Yue.C2151.m10097(r19)
            int r13 = Yue.C2151.m10097(r19)
            long r6 = Yue.C2151.m10098(r19)
            long r9 = Yue.C2151.m10098(r19)
            long r11 = Yue.C2151.m10098(r19)
            Yue.ۥ۠۟۟ۦ r18 = new Yue.ۥ۠۟۟ۦ
            java.lang.String r8 = Yue.C2151.m10095(r0, r5)
            int r14 = (int) r6
            int r15 = (int) r11
            int[] r5 = new int[r13]
            java.util.TreeMap r17 = new java.util.TreeMap
            r17.<init>()
            r11 = 0
            r6 = r18
            r7 = r20
            r16 = r5
            r6.<init>(r7, r8, r9, r11, r13, r14, r15, r16, r17)
            r2[r4] = r18
            int r4 = r4 + 1
            goto L11
        L46:
            if (r3 >= r1) goto L5b
            r4 = r2[r3]
            m19358(r0, r4)
            int r5 = r4.f5646
            int[] r5 = m19355(r0, r5)
            r4.f5649 = r5
            m19364(r0, r4)
            int r3 = r3 + 1
            goto L46
        L5b:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static int m19367(int r0) {
            int r0 = r0 + 7
            r0 = r0 & (-8)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static void m19368(@Yue.InterfaceC4410 byte[] r1, int r2, int r3, @Yue.InterfaceC4410 Yue.C1829 r4) {
            int r4 = r4.f5648
            int r2 = m19354(r2, r3, r4)
            int r3 = r2 / 8
            r4 = r1[r3]
            r0 = 1
            int r2 = r2 % 8
            int r2 = r0 << r2
            r2 = r2 | r4
            byte r2 = (byte) r2
            r1[r3] = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static void m19369(@Yue.InterfaceC4410 java.io.InputStream r2) throws java.io.IOException {
            Yue.C2151.m10097(r2)
            int r0 = Yue.C2151.m10099(r2)
            r1 = 6
            if (r0 != r1) goto Lb
            return
        Lb:
            r1 = 7
            if (r0 != r1) goto Lf
            return
        Lf:
            if (r0 <= 0) goto L23
            Yue.C2151.m10099(r2)
            int r1 = Yue.C2151.m10099(r2)
        L18:
            if (r1 <= 0) goto L20
            Yue.C2151.m10097(r2)
            int r1 = r1 + (-1)
            goto L18
        L20:
            int r0 = r0 + (-1)
            goto Lf
        L23:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static boolean m19370(@Yue.InterfaceC4410 java.io.OutputStream r2, @Yue.InterfaceC4410 byte[] r3, @Yue.InterfaceC4410 Yue.C1829[] r4) throws java.io.IOException {
            byte[] r0 = Yue.C4961.f15807
            boolean r0 = java.util.Arrays.equals(r3, r0)
            r1 = 1
            if (r0 == 0) goto Ld
            m19382(r2, r4)
            return r1
        Ld:
            byte[] r0 = Yue.C4961.f15808
            boolean r0 = java.util.Arrays.equals(r3, r0)
            if (r0 == 0) goto L19
            m19381(r2, r4)
            return r1
        L19:
            byte[] r0 = Yue.C4961.f15810
            boolean r0 = java.util.Arrays.equals(r3, r0)
            if (r0 == 0) goto L25
            m19379(r2, r4)
            return r1
        L25:
            byte[] r0 = Yue.C4961.f15809
            boolean r0 = java.util.Arrays.equals(r3, r0)
            if (r0 == 0) goto L31
            m19380(r2, r4)
            return r1
        L31:
            byte[] r0 = Yue.C4961.f15811
            boolean r3 = java.util.Arrays.equals(r3, r0)
            if (r3 == 0) goto L3d
            m19378(r2, r4)
            return r1
        L3d:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static void m19371(@Yue.InterfaceC4410 java.io.OutputStream r4, @Yue.InterfaceC4410 Yue.C1829 r5) throws java.io.IOException {
            int[] r5 = r5.f5649
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L5:
            if (r1 >= r0) goto L12
            r3 = r5[r1]
            int r2 = r3 - r2
            Yue.C2151.m10105(r4, r2)
            int r1 = r1 + 1
            r2 = r3
            goto L5
        L12:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static Yue.C7138 m19372(@Yue.InterfaceC4410 Yue.C1829[] r7) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            int r1 = r7.length     // Catch: java.lang.Throwable -> L3b
            Yue.C2151.m10105(r0, r1)     // Catch: java.lang.Throwable -> L3b
            r1 = 0
            r2 = 2
            r3 = r1
        Lc:
            int r4 = r7.length     // Catch: java.lang.Throwable -> L3b
            if (r3 >= r4) goto L3d
            r4 = r7[r3]     // Catch: java.lang.Throwable -> L3b
            long r5 = r4.f5644     // Catch: java.lang.Throwable -> L3b
            Yue.C2151.m10106(r0, r5)     // Catch: java.lang.Throwable -> L3b
            long r5 = r4.f5645     // Catch: java.lang.Throwable -> L3b
            Yue.C2151.m10106(r0, r5)     // Catch: java.lang.Throwable -> L3b
            int r5 = r4.f5648     // Catch: java.lang.Throwable -> L3b
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L3b
            Yue.C2151.m10106(r0, r5)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r5 = r4.f5642     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = r4.f5643     // Catch: java.lang.Throwable -> L3b
            byte[] r6 = Yue.C4961.f15807     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = m19352(r5, r4, r6)     // Catch: java.lang.Throwable -> L3b
            int r2 = r2 + 14
            int r5 = Yue.C2151.m10100(r4)     // Catch: java.lang.Throwable -> L3b
            Yue.C2151.m10105(r0, r5)     // Catch: java.lang.Throwable -> L3b
            int r2 = r2 + r5
            Yue.C2151.m10103(r0, r4)     // Catch: java.lang.Throwable -> L3b
            int r3 = r3 + 1
            goto Lc
        L3b:
            r7 = move-exception
            goto L6e
        L3d:
            byte[] r7 = r0.toByteArray()     // Catch: java.lang.Throwable -> L3b
            int r3 = r7.length     // Catch: java.lang.Throwable -> L3b
            if (r2 != r3) goto L4f
            Yue.ۥۢۦ۠ۤ r3 = new Yue.ۥۢۦ۠ۤ     // Catch: java.lang.Throwable -> L3b
            Yue.ۥ۠ۡۨۢ r4 = Yue.EnumC2366.f7750     // Catch: java.lang.Throwable -> L3b
            r3.<init>(r4, r2, r7, r1)     // Catch: java.lang.Throwable -> L3b
            r0.close()
            return r3
        L4f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r1.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "Expected size "
            r1.append(r3)     // Catch: java.lang.Throwable -> L3b
            r1.append(r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = ", does not match actual size "
            r1.append(r2)     // Catch: java.lang.Throwable -> L3b
            int r7 = r7.length     // Catch: java.lang.Throwable -> L3b
            r1.append(r7)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L3b
            java.lang.RuntimeException r7 = Yue.C2151.m10092(r7)     // Catch: java.lang.Throwable -> L3b
            throw r7     // Catch: java.lang.Throwable -> L3b
        L6e:
            r0.close()     // Catch: java.lang.Throwable -> L72
            goto L76
        L72:
            r0 = move-exception
            r7.addSuppressed(r0)
        L76:
            throw r7
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static void m19373(@Yue.InterfaceC4410 java.io.OutputStream r1, byte[] r2) throws java.io.IOException {
            byte[] r0 = Yue.C4960.f15805
            r1.write(r0)
            r1.write(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static void m19374(@Yue.InterfaceC4410 java.io.OutputStream r0, @Yue.InterfaceC4410 Yue.C1829 r1) throws java.io.IOException {
            m19377(r0, r1)
            m19371(r0, r1)
            m19376(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static void m19375(@Yue.InterfaceC4410 java.io.OutputStream r2, @Yue.InterfaceC4410 Yue.C1829 r3, @Yue.InterfaceC4410 java.lang.String r4) throws java.io.IOException {
            int r0 = Yue.C2151.m10100(r4)
            Yue.C2151.m10105(r2, r0)
            int r0 = r3.f5646
            Yue.C2151.m10105(r2, r0)
            int r0 = r3.f5647
            long r0 = (long) r0
            Yue.C2151.m10106(r2, r0)
            long r0 = r3.f5644
            Yue.C2151.m10106(r2, r0)
            int r3 = r3.f5648
            long r0 = (long) r3
            Yue.C2151.m10106(r2, r0)
            Yue.C2151.m10103(r2, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static void m19376(@Yue.InterfaceC4410 java.io.OutputStream r5, @Yue.InterfaceC4410 Yue.C1829 r6) throws java.io.IOException {
            int r0 = r6.f5648
            int r0 = m19353(r0)
            byte[] r0 = new byte[r0]
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r1 = r6.f5650
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = r2 & 2
            if (r4 == 0) goto L3a
            r4 = 2
            m19368(r0, r4, r3, r6)
        L3a:
            r2 = r2 & 4
            if (r2 == 0) goto L12
            r2 = 4
            m19368(r0, r2, r3, r6)
            goto L12
        L43:
            r5.write(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static void m19377(@Yue.InterfaceC4410 java.io.OutputStream r4, @Yue.InterfaceC4410 Yue.C1829 r5) throws java.io.IOException {
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r5 = r5.f5650
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = r0
        Lc:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r2 = r2 & 1
            if (r2 != 0) goto L31
            goto Lc
        L31:
            int r1 = r3 - r1
            Yue.C2151.m10105(r4, r1)
            Yue.C2151.m10105(r4, r0)
            r1 = r3
            goto Lc
        L3b:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static void m19378(@Yue.InterfaceC4410 java.io.OutputStream r7, @Yue.InterfaceC4410 Yue.C1829[] r8) throws java.io.IOException {
            int r0 = r8.length
            Yue.C2151.m10105(r7, r0)
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L7:
            if (r2 >= r0) goto L62
            r3 = r8[r2]
            java.lang.String r4 = r3.f5642
            java.lang.String r5 = r3.f5643
            byte[] r6 = Yue.C4961.f15811
            java.lang.String r4 = m19352(r4, r5, r6)
            int r5 = Yue.C2151.m10100(r4)
            Yue.C2151.m10105(r7, r5)
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r5 = r3.f5650
            int r5 = r5.size()
            Yue.C2151.m10105(r7, r5)
            int[] r5 = r3.f5649
            int r5 = r5.length
            Yue.C2151.m10105(r7, r5)
            long r5 = r3.f5644
            Yue.C2151.m10106(r7, r5)
            Yue.C2151.m10103(r7, r4)
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r4 = r3.f5650
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        L3d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            Yue.C2151.m10105(r7, r5)
            goto L3d
        L51:
            int[] r3 = r3.f5649
            int r4 = r3.length
            r5 = r1
        L55:
            if (r5 >= r4) goto L5f
            r6 = r3[r5]
            Yue.C2151.m10105(r7, r6)
            int r5 = r5 + 1
            goto L55
        L5f:
            int r2 = r2 + 1
            goto L7
        L62:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static void m19379(@Yue.InterfaceC4410 java.io.OutputStream r8, @Yue.InterfaceC4410 Yue.C1829[] r9) throws java.io.IOException {
            int r0 = r9.length
            Yue.C2151.m10107(r8, r0)
            int r0 = r9.length
            r1 = 0
            r2 = r1
        L7:
            if (r2 >= r0) goto L68
            r3 = r9[r2]
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r4 = r3.f5650
            int r4 = r4.size()
            int r4 = r4 * 4
            java.lang.String r5 = r3.f5642
            java.lang.String r6 = r3.f5643
            byte[] r7 = Yue.C4961.f15810
            java.lang.String r5 = m19352(r5, r6, r7)
            int r6 = Yue.C2151.m10100(r5)
            Yue.C2151.m10105(r8, r6)
            int[] r6 = r3.f5649
            int r6 = r6.length
            Yue.C2151.m10105(r8, r6)
            long r6 = (long) r4
            Yue.C2151.m10106(r8, r6)
            long r6 = r3.f5644
            Yue.C2151.m10106(r8, r6)
            Yue.C2151.m10103(r8, r5)
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r4 = r3.f5650
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        L40:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L57
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            Yue.C2151.m10105(r8, r5)
            Yue.C2151.m10105(r8, r1)
            goto L40
        L57:
            int[] r3 = r3.f5649
            int r4 = r3.length
            r5 = r1
        L5b:
            if (r5 >= r4) goto L65
            r6 = r3[r5]
            Yue.C2151.m10105(r8, r6)
            int r5 = r5 + 1
            goto L5b
        L65:
            int r2 = r2 + 1
            goto L7
        L68:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static void m19380(@Yue.InterfaceC4410 java.io.OutputStream r1, @Yue.InterfaceC4410 Yue.C1829[] r2) throws java.io.IOException {
            byte[] r0 = Yue.C4961.f15809
            byte[] r0 = m19344(r2, r0)
            int r2 = r2.length
            Yue.C2151.m10107(r1, r2)
            Yue.C2151.m10102(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static void m19381(@Yue.InterfaceC4410 java.io.OutputStream r1, @Yue.InterfaceC4410 Yue.C1829[] r2) throws java.io.IOException {
            byte[] r0 = Yue.C4961.f15808
            byte[] r0 = m19344(r2, r0)
            int r2 = r2.length
            Yue.C2151.m10107(r1, r2)
            Yue.C2151.m10102(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static void m19382(@Yue.InterfaceC4410 java.io.OutputStream r0, @Yue.InterfaceC4410 Yue.C1829[] r1) throws java.io.IOException {
            m19383(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static void m19383(@Yue.InterfaceC4410 java.io.OutputStream r10, @Yue.InterfaceC4410 Yue.C1829[] r11) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 3
            r0.<init>(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            Yue.ۥۢۦ۠ۤ r1 = m19372(r11)
            r0.add(r1)
            Yue.ۥۢۦ۠ۤ r1 = m19345(r11)
            r0.add(r1)
            Yue.ۥۢۦ۠ۤ r11 = m19346(r11)
            r0.add(r11)
            byte[] r11 = Yue.C4961.f15807
            int r11 = r11.length
            long r3 = (long) r11
            byte[] r11 = Yue.C4960.f15805
            int r11 = r11.length
            long r5 = (long) r11
            long r3 = r3 + r5
            r5 = 4
            long r3 = r3 + r5
            int r11 = r0.size()
            int r11 = r11 * 16
            long r5 = (long) r11
            long r3 = r3 + r5
            int r11 = r0.size()
            long r5 = (long) r11
            Yue.C2151.m10106(r10, r5)
            r11 = 0
            r1 = r11
        L3e:
            int r5 = r0.size()
            if (r1 >= r5) goto L89
            java.lang.Object r5 = r0.get(r1)
            Yue.ۥۢۦ۠ۤ r5 = (Yue.C7138) r5
            Yue.ۥ۠ۡۨۢ r6 = r5.f24677
            long r6 = r6.m10897()
            Yue.C2151.m10106(r10, r6)
            Yue.C2151.m10106(r10, r3)
            boolean r6 = r5.f24680
            if (r6 == 0) goto L71
            byte[] r5 = r5.f24679
            int r6 = r5.length
            long r6 = (long) r6
            byte[] r5 = Yue.C2151.m10091(r5)
            r2.add(r5)
            int r8 = r5.length
            long r8 = (long) r8
            Yue.C2151.m10106(r10, r8)
            Yue.C2151.m10106(r10, r6)
            int r5 = r5.length
        L6e:
            long r5 = (long) r5
            long r3 = r3 + r5
            goto L86
        L71:
            byte[] r6 = r5.f24679
            r2.add(r6)
            byte[] r6 = r5.f24679
            int r6 = r6.length
            long r6 = (long) r6
            Yue.C2151.m10106(r10, r6)
            r6 = 0
            Yue.C2151.m10106(r10, r6)
            byte[] r5 = r5.f24679
            int r5 = r5.length
            goto L6e
        L86:
            int r1 = r1 + 1
            goto L3e
        L89:
            int r0 = r2.size()
            if (r11 >= r0) goto L9b
            java.lang.Object r0 = r2.get(r11)
            byte[] r0 = (byte[]) r0
            r10.write(r0)
            int r11 = r11 + 1
            goto L89
        L9b:
            return
    }
}
