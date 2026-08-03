package a;

/* JADX INFO: loaded from: classes.dex */
public final class Kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f153a = null;
    public static final byte[] b = null;

    static {
            r0 = 4
            byte[] r1 = new byte[r0]
            r1 = {x0010: FILL_ARRAY_DATA , data: [112, 114, 111, 0} // fill-array
            a.Kc.f153a = r1
            byte[] r0 = new byte[r0]
            r0 = {x0016: FILL_ARRAY_DATA , data: [112, 114, 109, 0} // fill-array
            a.Kc.b = r0
            return
    }

    public static byte[] a(a.C0153g5[] r11, byte[] r12) {
            int r0 = r11.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto L30
            r4 = r11[r2]
            java.lang.String r5 = r4.f481a
            java.lang.String r6 = r4.b
            java.lang.String r5 = b(r5, r6, r12)
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r5 = r5.getBytes(r6)
            int r5 = r5.length
            int r5 = r5 + 16
            int r6 = r4.e
            int r6 = r6 * 2
            int r6 = r6 + r5
            int r5 = r4.f
            int r6 = r6 + r5
            int r4 = r4.g
            int r4 = r4 * 2
            int r4 = r4 + 7
            r4 = r4 & (-8)
            int r4 = r4 / 8
            int r4 = r4 + r6
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        L30:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>(r3)
            byte[] r2 = a.Lc.c
            boolean r2 = java.util.Arrays.equals(r12, r2)
            if (r2 == 0) goto L69
            int r2 = r11.length
            r4 = r1
        L3f:
            if (r4 >= r2) goto L9e
            r5 = r11[r4]
            java.lang.String r6 = r5.f481a
            java.lang.String r7 = r5.b
            java.lang.String r6 = b(r6, r7, r12)
            j(r0, r5, r6)
            l(r0, r5)
            int[] r6 = r5.h
            int r7 = r6.length
            r8 = r1
            r9 = r8
        L56:
            if (r8 >= r7) goto L63
            r10 = r6[r8]
            int r9 = r10 - r9
            a.C0435w1.a0(r0, r9)
            int r8 = r8 + 1
            r9 = r10
            goto L56
        L63:
            k(r0, r5)
            int r4 = r4 + 1
            goto L3f
        L69:
            int r2 = r11.length
            r4 = r1
        L6b:
            if (r4 >= r2) goto L7d
            r5 = r11[r4]
            java.lang.String r6 = r5.f481a
            java.lang.String r7 = r5.b
            java.lang.String r6 = b(r6, r7, r12)
            j(r0, r5, r6)
            int r4 = r4 + 1
            goto L6b
        L7d:
            int r12 = r11.length
            r2 = r1
        L7f:
            if (r2 >= r12) goto L9e
            r4 = r11[r2]
            l(r0, r4)
            int[] r5 = r4.h
            int r6 = r5.length
            r7 = r1
            r8 = r7
        L8b:
            if (r7 >= r6) goto L98
            r9 = r5[r7]
            int r8 = r9 - r8
            a.C0435w1.a0(r0, r8)
            int r7 = r7 + 1
            r8 = r9
            goto L8b
        L98:
            k(r0, r4)
            int r2 = r2 + 1
            goto L7f
        L9e:
            int r11 = r0.size()
            if (r11 != r3) goto La9
            byte[] r11 = r0.toByteArray()
            return r11
        La9:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "The bytes saved do not match expectation. actual="
            r11.<init>(r12)
            int r12 = r0.size()
            r11.append(r12)
            java.lang.String r12 = " expected="
            r11.append(r12)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r11)
            throw r12
    }

    public static java.lang.String b(java.lang.String r6, java.lang.String r7, byte[] r8) {
            byte[] r0 = a.Lc.e
            boolean r1 = java.util.Arrays.equals(r8, r0)
            byte[] r2 = a.Lc.d
            java.lang.String r3 = "!"
            java.lang.String r4 = ":"
            if (r1 == 0) goto Lf
            goto L15
        Lf:
            boolean r1 = java.util.Arrays.equals(r8, r2)
            if (r1 == 0) goto L17
        L15:
            r1 = r4
            goto L18
        L17:
            r1 = r3
        L18:
            int r5 = r6.length()
            if (r5 > 0) goto L34
            boolean r6 = r3.equals(r1)
            if (r6 == 0) goto L29
            java.lang.String r6 = r7.replace(r4, r3)
            return r6
        L29:
            boolean r6 = r4.equals(r1)
            if (r6 == 0) goto L84
            java.lang.String r6 = r7.replace(r3, r4)
            return r6
        L34:
            java.lang.String r5 = "classes.dex"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L3d
            return r6
        L3d:
            boolean r5 = r7.contains(r3)
            if (r5 != 0) goto L6e
            boolean r5 = r7.contains(r4)
            if (r5 == 0) goto L4a
            goto L6e
        L4a:
            java.lang.String r1 = ".apk"
            boolean r1 = r7.endsWith(r1)
            if (r1 == 0) goto L53
            goto L84
        L53:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            boolean r6 = java.util.Arrays.equals(r8, r0)
            if (r6 == 0) goto L62
            goto L68
        L62:
            boolean r6 = java.util.Arrays.equals(r8, r2)
            if (r6 == 0) goto L69
        L68:
            r3 = r4
        L69:
            java.lang.String r6 = a.C0487z.h(r1, r3, r7)
            return r6
        L6e:
            boolean r6 = r3.equals(r1)
            if (r6 == 0) goto L79
            java.lang.String r6 = r7.replace(r4, r3)
            return r6
        L79:
            boolean r6 = r4.equals(r1)
            if (r6 == 0) goto L84
            java.lang.String r6 = r7.replace(r3, r4)
            return r6
        L84:
            return r7
    }

    public static int[] c(java.io.ByteArrayInputStream r5, int r6) {
            int[] r0 = new int[r6]
            r1 = 0
            r2 = r1
        L4:
            if (r1 >= r6) goto L12
            r3 = 2
            long r3 = a.C0435w1.U(r5, r3)
            int r3 = (int) r3
            int r2 = r2 + r3
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    public static a.C0153g5[] d(java.io.FileInputStream r6, byte[] r7, byte[] r8, a.C0153g5[] r9) {
            byte[] r0 = a.Lc.f
            boolean r1 = java.util.Arrays.equals(r7, r0)
            java.lang.String r2 = "Unsupported meta version"
            java.lang.String r3 = "Content found after the end of file"
            r4 = 4
            if (r1 == 0) goto L60
            byte[] r1 = a.Lc.f165a
            boolean r8 = java.util.Arrays.equals(r1, r8)
            if (r8 != 0) goto L58
            boolean r7 = java.util.Arrays.equals(r7, r0)
            if (r7 == 0) goto L52
            r7 = 1
            long r7 = a.C0435w1.U(r6, r7)
            int r7 = (int) r7
            long r0 = a.C0435w1.U(r6, r4)
            long r4 = a.C0435w1.U(r6, r4)
            int r8 = (int) r4
            int r0 = (int) r0
            byte[] r8 = a.C0435w1.Q(r6, r8, r0)
            int r6 = r6.read()
            if (r6 > 0) goto L4c
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r8)
            a.g5[] r7 = e(r6, r7, r9)     // Catch: java.lang.Throwable -> L42
            r6.close()
            return r7
        L42:
            r7 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r6 = move-exception
            r7.addSuppressed(r6)
        L4b:
            throw r7
        L4c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r3)
            throw r6
        L52:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r2)
            throw r6
        L58:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher"
            r6.<init>(r7)
            throw r6
        L60:
            byte[] r0 = a.Lc.g
            boolean r7 = java.util.Arrays.equals(r7, r0)
            if (r7 == 0) goto L9f
            r7 = 2
            long r0 = a.C0435w1.U(r6, r7)
            int r7 = (int) r0
            long r0 = a.C0435w1.U(r6, r4)
            long r4 = a.C0435w1.U(r6, r4)
            int r2 = (int) r4
            int r0 = (int) r0
            byte[] r0 = a.C0435w1.Q(r6, r2, r0)
            int r6 = r6.read()
            if (r6 > 0) goto L99
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r0)
            a.g5[] r7 = f(r6, r8, r7, r9)     // Catch: java.lang.Throwable -> L8f
            r6.close()
            return r7
        L8f:
            r7 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L94
            goto L98
        L94:
            r6 = move-exception
            r7.addSuppressed(r6)
        L98:
            throw r7
        L99:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r3)
            throw r6
        L9f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r2)
            throw r6
    }

    public static a.C0153g5[] e(java.io.ByteArrayInputStream r8, int r9, a.C0153g5[] r10) {
            int r0 = r8.available()
            r1 = 0
            if (r0 != 0) goto La
            a.g5[] r8 = new a.C0153g5[r1]
            return r8
        La:
            int r0 = r10.length
            if (r9 != r0) goto L55
            java.lang.String[] r0 = new java.lang.String[r9]
            int[] r2 = new int[r9]
            r3 = r1
        L12:
            if (r3 >= r9) goto L31
            r4 = 2
            long r5 = a.C0435w1.U(r8, r4)
            int r5 = (int) r5
            long r6 = a.C0435w1.U(r8, r4)
            int r4 = (int) r6
            r2[r3] = r4
            java.lang.String r4 = new java.lang.String
            byte[] r5 = a.C0435w1.P(r8, r5)
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            r4.<init>(r5, r6)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L12
        L31:
            if (r1 >= r9) goto L54
            r3 = r10[r1]
            java.lang.String r4 = r3.b
            r5 = r0[r1]
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L4c
            r4 = r2[r1]
            r3.e = r4
            int[] r4 = c(r8, r4)
            r3.h = r4
            int r1 = r1 + 1
            goto L31
        L4c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Order of dexfiles in metadata did not match baseline"
            r8.<init>(r9)
            throw r8
        L54:
            return r10
        L55:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Mismatched number of dex files found in metadata"
            r8.<init>(r9)
            throw r8
    }

    public static a.C0153g5[] f(java.io.ByteArrayInputStream r10, byte[] r11, int r12, a.C0153g5[] r13) {
            int r0 = r10.available()
            r1 = 0
            if (r0 != 0) goto La
            a.g5[] r10 = new a.C0153g5[r1]
            return r10
        La:
            int r0 = r13.length
            if (r12 != r0) goto L83
            r0 = r1
        Le:
            if (r0 >= r12) goto L82
            r2 = 2
            a.C0435w1.U(r10, r2)
            long r3 = a.C0435w1.U(r10, r2)
            int r3 = (int) r3
            java.lang.String r4 = new java.lang.String
            byte[] r3 = a.C0435w1.P(r10, r3)
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            r4.<init>(r3, r5)
            r3 = 4
            long r5 = a.C0435w1.U(r10, r3)
            long r2 = a.C0435w1.U(r10, r2)
            int r2 = (int) r2
            int r3 = r13.length
            r7 = 0
            if (r3 > 0) goto L33
            goto L5f
        L33:
            java.lang.String r3 = "!"
            int r3 = r4.indexOf(r3)
            if (r3 >= 0) goto L41
            java.lang.String r3 = ":"
            int r3 = r4.indexOf(r3)
        L41:
            if (r3 <= 0) goto L4a
            int r3 = r3 + 1
            java.lang.String r3 = r4.substring(r3)
            goto L4b
        L4a:
            r3 = r4
        L4b:
            r8 = r1
        L4c:
            int r9 = r13.length
            if (r8 >= r9) goto L5f
            r9 = r13[r8]
            java.lang.String r9 = r9.b
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L5c
            r7 = r13[r8]
            goto L5f
        L5c:
            int r8 = r8 + 1
            goto L4c
        L5f:
            if (r7 == 0) goto L76
            r7.d = r5
            int[] r3 = c(r10, r2)
            byte[] r4 = a.Lc.e
            boolean r4 = java.util.Arrays.equals(r11, r4)
            if (r4 == 0) goto L73
            r7.e = r2
            r7.h = r3
        L73:
            int r0 = r0 + 1
            goto Le
        L76:
            java.lang.String r10 = "Missing profile key: "
            java.lang.String r10 = r10.concat(r4)
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r10)
            throw r11
        L82:
            return r13
        L83:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Mismatched number of dex files found in metadata"
            r10.<init>(r11)
            throw r10
    }

    public static a.C0153g5[] g(java.io.FileInputStream r5, byte[] r6, java.lang.String r7) {
            byte[] r0 = a.Lc.b
            boolean r6 = java.util.Arrays.equals(r6, r0)
            if (r6 == 0) goto L42
            r6 = 1
            long r0 = a.C0435w1.U(r5, r6)
            int r6 = (int) r0
            r0 = 4
            long r1 = a.C0435w1.U(r5, r0)
            long r3 = a.C0435w1.U(r5, r0)
            int r0 = (int) r3
            int r1 = (int) r1
            byte[] r0 = a.C0435w1.Q(r5, r0, r1)
            int r5 = r5.read()
            if (r5 > 0) goto L3a
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            r5.<init>(r0)
            a.g5[] r6 = h(r5, r7, r6)     // Catch: java.lang.Throwable -> L30
            r5.close()
            return r6
        L30:
            r6 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r5 = move-exception
            r6.addSuppressed(r5)
        L39:
            throw r6
        L3a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Content found after the end of file"
            r5.<init>(r6)
            throw r5
        L42:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Unsupported version"
            r5.<init>(r6)
            throw r5
    }

    public static a.C0153g5[] h(java.io.ByteArrayInputStream r19, java.lang.String r20, int r21) {
            r0 = r19
            r1 = r21
            int r2 = r0.available()
            r3 = 0
            if (r2 != 0) goto Le
            a.g5[] r0 = new a.C0153g5[r3]
            return r0
        Le:
            a.g5[] r2 = new a.C0153g5[r1]
            r4 = r3
        L11:
            r5 = 2
            if (r4 >= r1) goto L50
            long r6 = a.C0435w1.U(r0, r5)
            int r6 = (int) r6
            long r7 = a.C0435w1.U(r0, r5)
            int r14 = (int) r7
            r5 = 4
            long r7 = a.C0435w1.U(r0, r5)
            long r12 = a.C0435w1.U(r0, r5)
            long r9 = a.C0435w1.U(r0, r5)
            a.g5 r5 = new a.g5
            java.lang.String r11 = new java.lang.String
            byte[] r6 = a.C0435w1.P(r0, r6)
            java.nio.charset.Charset r15 = java.nio.charset.StandardCharsets.UTF_8
            r11.<init>(r6, r15)
            int r15 = (int) r7
            int r6 = (int) r9
            int[] r7 = new int[r14]
            java.util.TreeMap r18 = new java.util.TreeMap
            r18.<init>()
            r10 = r20
            r9 = r5
            r16 = r6
            r17 = r7
            r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18)
            r2[r4] = r9
            int r4 = r4 + 1
            goto L11
        L50:
            r4 = r3
        L51:
            if (r4 >= r1) goto L10c
            r6 = r2[r4]
            int r7 = r0.available()
            int r8 = r6.f
            int r7 = r7 - r8
            r8 = r3
        L5d:
            int r9 = r0.available()
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r10 = r6.i
            r11 = 7
            if (r9 <= r7) goto La6
            long r12 = a.C0435w1.U(r0, r5)
            int r9 = (int) r12
            int r8 = r8 + r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r12 = 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r10.put(r9, r13)
            long r9 = a.C0435w1.U(r0, r5)
            int r9 = (int) r9
        L7d:
            if (r9 <= 0) goto L5d
            a.C0435w1.U(r0, r5)
            long r13 = a.C0435w1.U(r0, r12)
            int r10 = (int) r13
            r13 = 6
            if (r10 != r13) goto L8b
            goto La3
        L8b:
            if (r10 != r11) goto L8e
            goto La3
        L8e:
            if (r10 <= 0) goto La3
            a.C0435w1.U(r0, r12)
            long r13 = a.C0435w1.U(r0, r12)
            int r13 = (int) r13
        L98:
            if (r13 <= 0) goto La0
            a.C0435w1.U(r0, r5)
            int r13 = r13 + (-1)
            goto L98
        La0:
            int r10 = r10 + (-1)
            goto L8e
        La3:
            int r9 = r9 + (-1)
            goto L7d
        La6:
            int r8 = r0.available()
            if (r8 != r7) goto L104
            int r7 = r6.e
            int[] r7 = c(r0, r7)
            r6.h = r7
            int r6 = r6.g
            int r7 = r6 * 2
            int r7 = r7 + r11
            r7 = r7 & (-8)
            int r7 = r7 / 8
            byte[] r7 = a.C0435w1.P(r0, r7)
            java.util.BitSet r7 = java.util.BitSet.valueOf(r7)
            r8 = r3
        Lc6:
            if (r8 >= r6) goto L100
            boolean r9 = r7.get(r8)
            if (r9 == 0) goto Ld0
            r9 = r5
            goto Ld1
        Ld0:
            r9 = r3
        Ld1:
            int r11 = r8 + r6
            boolean r11 = r7.get(r11)
            if (r11 == 0) goto Ldb
            r9 = r9 | 4
        Ldb:
            if (r9 == 0) goto Lfd
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            java.lang.Object r11 = r10.get(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 != 0) goto Led
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
        Led:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            int r11 = r11.intValue()
            r9 = r9 | r11
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10.put(r12, r9)
        Lfd:
            int r8 = r8 + 1
            goto Lc6
        L100:
            int r4 = r4 + 1
            goto L51
        L104:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Read too much data during profile line parse"
            r0.<init>(r1)
            throw r0
        L10c:
            return r2
    }

    public static boolean i(java.io.ByteArrayOutputStream r19, byte[] r20, a.C0153g5[] r21) {
            r0 = r19
            r1 = r20
            r2 = r21
            byte[] r3 = a.Lc.f165a
            boolean r4 = java.util.Arrays.equals(r1, r3)
            r5 = 4
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L267
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 3
            r1.<init>(r4)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r4)
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream
            r9.<init>()
            int r10 = r2.length     // Catch: java.lang.Throwable -> L5f
            a.C0435w1.a0(r9, r10)     // Catch: java.lang.Throwable -> L5f
            r10 = 2
            r11 = r6
            r12 = r10
        L28:
            int r13 = r2.length     // Catch: java.lang.Throwable -> L5f
            if (r11 >= r13) goto L61
            r13 = r2[r11]     // Catch: java.lang.Throwable -> L5f
            long r14 = r13.c     // Catch: java.lang.Throwable -> L5f
            a.C0435w1.Z(r9, r14, r5)     // Catch: java.lang.Throwable -> L5f
            long r14 = r13.d     // Catch: java.lang.Throwable -> L5f
            a.C0435w1.Z(r9, r14, r5)     // Catch: java.lang.Throwable -> L5f
            int r14 = r13.g     // Catch: java.lang.Throwable -> L5f
            long r14 = (long) r14     // Catch: java.lang.Throwable -> L5f
            a.C0435w1.Z(r9, r14, r5)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r14 = r13.f481a     // Catch: java.lang.Throwable -> L5f
            java.lang.String r13 = r13.b     // Catch: java.lang.Throwable -> L5f
            java.lang.String r13 = b(r14, r13, r3)     // Catch: java.lang.Throwable -> L5f
            int r12 = r12 + 14
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L5f
            byte[] r15 = r13.getBytes(r14)     // Catch: java.lang.Throwable -> L5f
            int r15 = r15.length     // Catch: java.lang.Throwable -> L5f
            a.C0435w1.a0(r9, r15)     // Catch: java.lang.Throwable -> L5f
            int r12 = r12 + r15
            byte[] r13 = r13.getBytes(r14)     // Catch: java.lang.Throwable -> L5f
            r9.write(r13)     // Catch: java.lang.Throwable -> L5f
            int r11 = r11 + 1
            goto L28
        L5c:
            r1 = r0
            goto L25e
        L5f:
            r0 = move-exception
            goto L5c
        L61:
            byte[] r3 = r9.toByteArray()     // Catch: java.lang.Throwable -> L5f
            int r11 = r3.length     // Catch: java.lang.Throwable -> L5f
            java.lang.String r13 = ", does not match actual size "
            java.lang.String r14 = "Expected size "
            if (r12 != r11) goto L242
            a.wh r11 = new a.wh     // Catch: java.lang.Throwable -> L5f
            r11.<init>(r7, r3, r6)     // Catch: java.lang.Throwable -> L5f
            r9.close()
            r1.add(r11)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r9 = r6
            r11 = r9
        L7e:
            int r12 = r2.length     // Catch: java.lang.Throwable -> Lb2
            if (r9 >= r12) goto Lb4
            r12 = r2[r9]     // Catch: java.lang.Throwable -> Lb2
            a.C0435w1.a0(r3, r9)     // Catch: java.lang.Throwable -> Lb2
            int r11 = r11 + 4
            int r15 = r12.e     // Catch: java.lang.Throwable -> Lb2
            a.C0435w1.a0(r3, r15)     // Catch: java.lang.Throwable -> Lb2
            int r15 = r12.e     // Catch: java.lang.Throwable -> Lb2
            int r15 = r15 * r10
            int r11 = r11 + r15
            int[] r12 = r12.h     // Catch: java.lang.Throwable -> Lb2
            int r15 = r12.length     // Catch: java.lang.Throwable -> Lb2
            r16 = r6
            r20 = r10
            r10 = r16
        L9a:
            if (r10 >= r15) goto La9
            r17 = r12[r10]     // Catch: java.lang.Throwable -> Lb2
            int r6 = r17 - r16
            a.C0435w1.a0(r3, r6)     // Catch: java.lang.Throwable -> Lb2
            int r10 = r10 + 1
            r16 = r17
            r6 = 0
            goto L9a
        La9:
            int r9 = r9 + 1
            r10 = r20
            r6 = 0
            goto L7e
        Laf:
            r1 = r0
            goto L239
        Lb2:
            r0 = move-exception
            goto Laf
        Lb4:
            r20 = r10
            byte[] r6 = r3.toByteArray()     // Catch: java.lang.Throwable -> Lb2
            int r9 = r6.length     // Catch: java.lang.Throwable -> Lb2
            if (r11 != r9) goto L21d
            a.wh r9 = new a.wh     // Catch: java.lang.Throwable -> Lb2
            r9.<init>(r4, r6, r7)     // Catch: java.lang.Throwable -> Lb2
            r3.close()
            r1.add(r9)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r4 = 0
            r6 = 0
        Lcf:
            int r9 = r2.length     // Catch: java.lang.Throwable -> L135
            if (r4 >= r9) goto L14f
            r9 = r2[r4]     // Catch: java.lang.Throwable -> L135
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r10 = r9.i     // Catch: java.lang.Throwable -> L135
            java.util.Set r10 = r10.entrySet()     // Catch: java.lang.Throwable -> L135
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L135
            r11 = 0
        Ldf:
            boolean r12 = r10.hasNext()     // Catch: java.lang.Throwable -> L135
            if (r12 == 0) goto Lf7
            java.lang.Object r12 = r10.next()     // Catch: java.lang.Throwable -> L135
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch: java.lang.Throwable -> L135
            java.lang.Object r12 = r12.getValue()     // Catch: java.lang.Throwable -> L135
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Throwable -> L135
            int r12 = r12.intValue()     // Catch: java.lang.Throwable -> L135
            r11 = r11 | r12
            goto Ldf
        Lf7:
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L135
            r10.<init>()     // Catch: java.lang.Throwable -> L135
            k(r10, r9)     // Catch: java.lang.Throwable -> L144
            byte[] r12 = r10.toByteArray()     // Catch: java.lang.Throwable -> L144
            r10.close()     // Catch: java.lang.Throwable -> L135
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L135
            r10.<init>()     // Catch: java.lang.Throwable -> L135
            l(r10, r9)     // Catch: java.lang.Throwable -> L139
            byte[] r9 = r10.toByteArray()     // Catch: java.lang.Throwable -> L139
            r10.close()     // Catch: java.lang.Throwable -> L135
            a.C0435w1.a0(r3, r4)     // Catch: java.lang.Throwable -> L135
            int r10 = r12.length     // Catch: java.lang.Throwable -> L135
            int r10 = r10 + 2
            int r15 = r9.length     // Catch: java.lang.Throwable -> L135
            int r10 = r10 + r15
            int r6 = r6 + 6
            r16 = r8
            long r7 = (long) r10     // Catch: java.lang.Throwable -> L135
            a.C0435w1.Z(r3, r7, r5)     // Catch: java.lang.Throwable -> L135
            a.C0435w1.a0(r3, r11)     // Catch: java.lang.Throwable -> L135
            r3.write(r12)     // Catch: java.lang.Throwable -> L135
            r3.write(r9)     // Catch: java.lang.Throwable -> L135
            int r6 = r6 + r10
            int r4 = r4 + 1
            r8 = r16
            r7 = 1
            goto Lcf
        L135:
            r0 = move-exception
            r1 = r0
            goto L214
        L139:
            r0 = move-exception
            r1 = r0
            r10.close()     // Catch: java.lang.Throwable -> L13f
            goto L143
        L13f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L135
        L143:
            throw r1     // Catch: java.lang.Throwable -> L135
        L144:
            r0 = move-exception
            r1 = r0
            r10.close()     // Catch: java.lang.Throwable -> L14a
            goto L14e
        L14a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L135
        L14e:
            throw r1     // Catch: java.lang.Throwable -> L135
        L14f:
            r16 = r8
            byte[] r2 = r3.toByteArray()     // Catch: java.lang.Throwable -> L135
            int r4 = r2.length     // Catch: java.lang.Throwable -> L135
            if (r6 != r4) goto L1f8
            a.wh r4 = new a.wh     // Catch: java.lang.Throwable -> L135
            r15 = 1
            r4.<init>(r5, r2, r15)     // Catch: java.lang.Throwable -> L135
            r3.close()
            r1.add(r4)
            long r2 = (long) r5
            long r2 = r2 + r2
            r6 = 4
            long r2 = r2 + r6
            int r4 = r1.size()
            int r4 = r4 * 16
            long r6 = (long) r4
            long r2 = r2 + r6
            int r4 = r1.size()
            long r6 = (long) r4
            a.C0435w1.Z(r0, r6, r5)
            r4 = 0
        L17a:
            int r6 = r1.size()
            if (r4 >= r6) goto L1e0
            java.lang.Object r6 = r1.get(r4)
            a.wh r6 = (a.wh) r6
            int r7 = r6.f755a
            r8 = 1
            if (r7 == r8) goto L1a5
            r8 = 2
            if (r7 == r8) goto L1a2
            r8 = 3
            if (r7 == r8) goto L19f
            r8 = 4
            if (r7 == r8) goto L19c
            r8 = 5
            if (r7 != r8) goto L19a
            r7 = 4
            goto L1a7
        L19a:
            r0 = 0
            throw r0
        L19c:
            r7 = 3
            goto L1a7
        L19f:
            r7 = 2
            goto L1a7
        L1a2:
            r7 = 1
            goto L1a7
        L1a5:
            r7 = 0
        L1a7:
            a.C0435w1.Z(r0, r7, r5)
            a.C0435w1.Z(r0, r2, r5)
            byte[] r7 = r6.b
            boolean r6 = r6.c
            if (r6 == 0) goto L1ca
            int r6 = r7.length
            long r8 = (long) r6
            byte[] r6 = a.C0435w1.g(r7)
            r10 = r16
            r10.add(r6)
            int r7 = r6.length
            long r11 = (long) r7
            a.C0435w1.Z(r0, r11, r5)
            a.C0435w1.Z(r0, r8, r5)
            int r6 = r6.length
        L1c7:
            long r6 = (long) r6
            long r2 = r2 + r6
            goto L1db
        L1ca:
            r10 = r16
            r10.add(r7)
            int r6 = r7.length
            long r8 = (long) r6
            a.C0435w1.Z(r0, r8, r5)
            r8 = 0
            a.C0435w1.Z(r0, r8, r5)
            int r6 = r7.length
            goto L1c7
        L1db:
            int r4 = r4 + 1
            r16 = r10
            goto L17a
        L1e0:
            r10 = r16
            r6 = 0
        L1e3:
            int r1 = r10.size()
            if (r6 >= r1) goto L1f5
            java.lang.Object r1 = r10.get(r6)
            byte[] r1 = (byte[]) r1
            r0.write(r1)
            int r6 = r6 + 1
            goto L1e3
        L1f5:
            r15 = 1
            goto L393
        L1f8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L135
            r0.<init>()     // Catch: java.lang.Throwable -> L135
            r0.append(r14)     // Catch: java.lang.Throwable -> L135
            r0.append(r6)     // Catch: java.lang.Throwable -> L135
            r0.append(r13)     // Catch: java.lang.Throwable -> L135
            int r1 = r2.length     // Catch: java.lang.Throwable -> L135
            r0.append(r1)     // Catch: java.lang.Throwable -> L135
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L135
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L135
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L135
            throw r1     // Catch: java.lang.Throwable -> L135
        L214:
            r3.close()     // Catch: java.lang.Throwable -> L218
            goto L21c
        L218:
            r0 = move-exception
            r1.addSuppressed(r0)
        L21c:
            throw r1
        L21d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r0.<init>()     // Catch: java.lang.Throwable -> Lb2
            r0.append(r14)     // Catch: java.lang.Throwable -> Lb2
            r0.append(r11)     // Catch: java.lang.Throwable -> Lb2
            r0.append(r13)     // Catch: java.lang.Throwable -> Lb2
            int r1 = r6.length     // Catch: java.lang.Throwable -> Lb2
            r0.append(r1)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb2
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb2
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb2
            throw r1     // Catch: java.lang.Throwable -> Lb2
        L239:
            r3.close()     // Catch: java.lang.Throwable -> L23d
            goto L241
        L23d:
            r0 = move-exception
            r1.addSuppressed(r0)
        L241:
            throw r1
        L242:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r0.<init>()     // Catch: java.lang.Throwable -> L5f
            r0.append(r14)     // Catch: java.lang.Throwable -> L5f
            r0.append(r12)     // Catch: java.lang.Throwable -> L5f
            r0.append(r13)     // Catch: java.lang.Throwable -> L5f
            int r1 = r3.length     // Catch: java.lang.Throwable -> L5f
            r0.append(r1)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5f
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L5f
            throw r1     // Catch: java.lang.Throwable -> L5f
        L25e:
            r9.close()     // Catch: java.lang.Throwable -> L262
            goto L266
        L262:
            r0 = move-exception
            r1.addSuppressed(r0)
        L266:
            throw r1
        L267:
            byte[] r3 = a.Lc.b
            boolean r4 = java.util.Arrays.equals(r1, r3)
            if (r4 == 0) goto L28c
            byte[] r1 = a(r2, r3)
            int r2 = r2.length
            long r2 = (long) r2
            r15 = 1
            a.C0435w1.Z(r0, r2, r15)
            int r2 = r1.length
            long r2 = (long) r2
            a.C0435w1.Z(r0, r2, r5)
            byte[] r1 = a.C0435w1.g(r1)
            int r2 = r1.length
            long r2 = (long) r2
            a.C0435w1.Z(r0, r2, r5)
            r0.write(r1)
        L28a:
            r15 = 1
            return r15
        L28c:
            r15 = 1
            byte[] r3 = a.Lc.d
            boolean r4 = java.util.Arrays.equals(r1, r3)
            if (r4 == 0) goto L302
            int r1 = r2.length
            long r6 = (long) r1
            a.C0435w1.Z(r0, r6, r15)
            int r1 = r2.length
            r4 = 0
        L29c:
            if (r4 >= r1) goto L1f5
            r6 = r2[r4]
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r7 = r6.i
            int r7 = r7.size()
            int r7 = r7 * r5
            java.lang.String r8 = r6.b
            java.lang.String r9 = r6.f481a
            java.lang.String r8 = b(r9, r8, r3)
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r10 = r8.getBytes(r9)
            int r10 = r10.length
            a.C0435w1.a0(r0, r10)
            int[] r10 = r6.h
            int r10 = r10.length
            a.C0435w1.a0(r0, r10)
            long r10 = (long) r7
            a.C0435w1.Z(r0, r10, r5)
            long r10 = r6.c
            a.C0435w1.Z(r0, r10, r5)
            byte[] r7 = r8.getBytes(r9)
            r0.write(r7)
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r7 = r6.i
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L2d9:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L2f1
            java.lang.Object r8 = r7.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            a.C0435w1.a0(r0, r8)
            r8 = 0
            a.C0435w1.a0(r0, r8)
            goto L2d9
        L2f1:
            int[] r6 = r6.h
            int r7 = r6.length
            r8 = 0
        L2f5:
            if (r8 >= r7) goto L2ff
            r9 = r6[r8]
            a.C0435w1.a0(r0, r9)
            int r8 = r8 + 1
            goto L2f5
        L2ff:
            int r4 = r4 + 1
            goto L29c
        L302:
            byte[] r3 = a.Lc.c
            boolean r4 = java.util.Arrays.equals(r1, r3)
            if (r4 == 0) goto L327
            byte[] r1 = a(r2, r3)
            int r2 = r2.length
            long r2 = (long) r2
            r15 = 1
            a.C0435w1.Z(r0, r2, r15)
            int r2 = r1.length
            long r2 = (long) r2
            a.C0435w1.Z(r0, r2, r5)
            byte[] r1 = a.C0435w1.g(r1)
            int r2 = r1.length
            long r2 = (long) r2
            a.C0435w1.Z(r0, r2, r5)
            r0.write(r1)
            goto L28a
        L327:
            byte[] r3 = a.Lc.e
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L394
            int r1 = r2.length
            a.C0435w1.a0(r0, r1)
            int r1 = r2.length
            r8 = 0
        L335:
            if (r8 >= r1) goto L1f5
            r4 = r2[r8]
            java.lang.String r6 = r4.f481a
            java.lang.String r7 = r4.b
            java.lang.String r6 = b(r6, r7, r3)
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r9 = r6.getBytes(r7)
            int r9 = r9.length
            a.C0435w1.a0(r0, r9)
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r9 = r4.i
            int r10 = r9.size()
            a.C0435w1.a0(r0, r10)
            int[] r10 = r4.h
            int r10 = r10.length
            a.C0435w1.a0(r0, r10)
            long r10 = r4.c
            a.C0435w1.Z(r0, r10, r5)
            byte[] r6 = r6.getBytes(r7)
            r0.write(r6)
            java.util.Set r6 = r9.keySet()
            java.util.Iterator r6 = r6.iterator()
        L36e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L382
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            a.C0435w1.a0(r0, r7)
            goto L36e
        L382:
            int[] r4 = r4.h
            int r6 = r4.length
            r7 = 0
        L386:
            if (r7 >= r6) goto L390
            r9 = r4[r7]
            a.C0435w1.a0(r0, r9)
            int r7 = r7 + 1
            goto L386
        L390:
            int r8 = r8 + 1
            goto L335
        L393:
            return r15
        L394:
            r18 = 0
            return r18
    }

    public static void j(java.io.ByteArrayOutputStream r4, a.C0153g5 r5, java.lang.String r6) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r6.getBytes(r0)
            int r1 = r1.length
            a.C0435w1.a0(r4, r1)
            int r1 = r5.e
            a.C0435w1.a0(r4, r1)
            int r1 = r5.f
            long r1 = (long) r1
            r3 = 4
            a.C0435w1.Z(r4, r1, r3)
            long r1 = r5.c
            a.C0435w1.Z(r4, r1, r3)
            int r5 = r5.g
            long r1 = (long) r5
            a.C0435w1.Z(r4, r1, r3)
            byte[] r5 = r6.getBytes(r0)
            r4.write(r5)
            return
    }

    public static void k(java.io.ByteArrayOutputStream r8, a.C0153g5 r9) {
            int r0 = r9.g
            int r0 = r0 * 2
            int r0 = r0 + 7
            r0 = r0 & (-8)
            int r0 = r0 / 8
            byte[] r0 = new byte[r0]
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r1 = r9.i
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = r2 & 2
            r5 = 1
            if (r4 == 0) goto L47
            int r4 = r3 / 8
            r6 = r0[r4]
            int r7 = r3 % 8
            int r7 = r5 << r7
            r6 = r6 | r7
            byte r6 = (byte) r6
            r0[r4] = r6
        L47:
            r2 = r2 & 4
            if (r2 == 0) goto L16
            int r2 = r9.g
            int r3 = r3 + r2
            int r2 = r3 / 8
            r4 = r0[r2]
            int r3 = r3 % 8
            int r3 = r5 << r3
            r3 = r3 | r4
            byte r3 = (byte) r3
            r0[r2] = r3
            goto L16
        L5b:
            r8.write(r0)
            return
    }

    public static void l(java.io.ByteArrayOutputStream r4, a.C0153g5 r5) {
            java.util.TreeMap<java.lang.Integer, java.lang.Integer> r5 = r5.i
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
            a.C0435w1.a0(r4, r1)
            a.C0435w1.a0(r4, r0)
            r1 = r3
            goto Lc
        L3b:
            return
    }
}
