package t3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l3.w f13050a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f13051b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f13052c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f13053d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f13054e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f13055f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f13056g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f13057h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f13058i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f13059j = null;

    static {
            l3.w r0 = new l3.w
            r1 = 24
            r0.<init>(r1)
            t3.f.f13050a = r0
            r0 = 4
            byte[] r1 = new byte[r0]
            r1 = {x004a: FILL_ARRAY_DATA , data: [112, 114, 111, 0} // fill-array
            t3.f.f13051b = r1
            byte[] r1 = new byte[r0]
            r1 = {x0050: FILL_ARRAY_DATA , data: [112, 114, 109, 0} // fill-array
            t3.f.f13052c = r1
            byte[] r1 = new byte[r0]
            r1 = {x0056: FILL_ARRAY_DATA , data: [48, 49, 53, 0} // fill-array
            t3.f.f13053d = r1
            byte[] r1 = new byte[r0]
            r1 = {x005c: FILL_ARRAY_DATA , data: [48, 49, 48, 0} // fill-array
            t3.f.f13054e = r1
            byte[] r1 = new byte[r0]
            r1 = {x0062: FILL_ARRAY_DATA , data: [48, 48, 57, 0} // fill-array
            t3.f.f13055f = r1
            byte[] r1 = new byte[r0]
            r1 = {x0068: FILL_ARRAY_DATA , data: [48, 48, 53, 0} // fill-array
            t3.f.f13056g = r1
            byte[] r1 = new byte[r0]
            r1 = {x006e: FILL_ARRAY_DATA , data: [48, 48, 49, 0} // fill-array
            t3.f.f13057h = r1
            byte[] r1 = new byte[r0]
            r1 = {x0074: FILL_ARRAY_DATA , data: [48, 48, 49, 0} // fill-array
            t3.f.f13058i = r1
            byte[] r0 = new byte[r0]
            r0 = {x007a: FILL_ARRAY_DATA , data: [48, 48, 50, 0} // fill-array
            t3.f.f13059j = r0
            return
    }

    public static byte[] a(byte[] r3) {
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r1 = 1
            r0.<init>(r1)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.util.zip.DeflaterOutputStream r2 = new java.util.zip.DeflaterOutputStream     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L1e
            r2.write(r3)     // Catch: java.lang.Throwable -> L20
            r2.close()     // Catch: java.lang.Throwable -> L1e
            r0.end()
            byte[] r3 = r1.toByteArray()
            return r3
        L1e:
            r3 = move-exception
            goto L2a
        L20:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r1 = move-exception
            r3.addSuppressed(r1)     // Catch: java.lang.Throwable -> L1e
        L29:
            throw r3     // Catch: java.lang.Throwable -> L1e
        L2a:
            r0.end()
            throw r3
    }

    public static byte[] b(t3.b[] r8, byte[] r9) {
            int r0 = r8.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto L30
            r4 = r8[r2]
            java.lang.String r5 = r4.f13040a
            java.lang.String r6 = r4.f13041b
            java.lang.String r5 = d(r5, r6, r9)
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r5 = r5.getBytes(r6)
            int r5 = r5.length
            int r5 = r5 + 16
            int r6 = r4.f13044e
            int r6 = r6 * 2
            int r6 = r6 + r5
            int r5 = r4.f13045f
            int r6 = r6 + r5
            int r4 = r4.f13046g
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
            byte[] r2 = t3.f.f13055f
            boolean r2 = java.util.Arrays.equals(r9, r2)
            if (r2 == 0) goto L53
            int r2 = r8.length
        L3e:
            if (r1 >= r2) goto L72
            r4 = r8[r1]
            java.lang.String r5 = r4.f13040a
            java.lang.String r6 = r4.f13041b
            java.lang.String r5 = d(r5, r6, r9)
            q(r0, r4, r5)
            p(r0, r4)
            int r1 = r1 + 1
            goto L3e
        L53:
            int r2 = r8.length
            r4 = r1
        L55:
            if (r4 >= r2) goto L67
            r5 = r8[r4]
            java.lang.String r6 = r5.f13040a
            java.lang.String r7 = r5.f13041b
            java.lang.String r6 = d(r6, r7, r9)
            q(r0, r5, r6)
            int r4 = r4 + 1
            goto L55
        L67:
            int r9 = r8.length
        L68:
            if (r1 >= r9) goto L72
            r2 = r8[r1]
            p(r0, r2)
            int r1 = r1 + 1
            goto L68
        L72:
            int r8 = r0.size()
            if (r8 != r3) goto L7d
            byte[] r8 = r0.toByteArray()
            return r8
        L7d:
            int r8 = r0.size()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "The bytes saved do not match expectation. actual="
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r8 = " expected="
            r9.append(r8)
            r9.append(r3)
            java.lang.String r8 = r9.toString()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r8)
            throw r9
    }

    public static boolean c(java.io.File r6) {
            boolean r0 = r6.isDirectory()
            r1 = 1
            if (r0 == 0) goto L25
            java.io.File[] r6 = r6.listFiles()
            r0 = 0
            if (r6 != 0) goto Lf
            return r0
        Lf:
            int r2 = r6.length
            r3 = r0
            r4 = r1
        L12:
            if (r3 >= r2) goto L24
            r5 = r6[r3]
            boolean r5 = c(r5)
            if (r5 == 0) goto L20
            if (r4 == 0) goto L20
            r4 = r1
            goto L21
        L20:
            r4 = r0
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            return r4
        L25:
            r6.delete()
            return r1
    }

    public static java.lang.String d(java.lang.String r6, java.lang.String r7, byte[] r8) {
            byte[] r0 = t3.f.f13057h
            boolean r1 = java.util.Arrays.equals(r8, r0)
            byte[] r2 = t3.f.f13056g
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
            java.lang.String r6 = eh.a.r(r1, r3, r7)
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

    public static void e(android.content.pm.PackageInfo r2, java.io.File r3) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r3, r1)
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch: java.io.IOException -> L24
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L24
            r1.<init>(r0)     // Catch: java.io.IOException -> L24
            r3.<init>(r1)     // Catch: java.io.IOException -> L24
            long r0 = r2.lastUpdateTime     // Catch: java.lang.Throwable -> L1a
            r3.writeLong(r0)     // Catch: java.lang.Throwable -> L1a
            r3.close()     // Catch: java.io.IOException -> L24
            return
        L1a:
            r2 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch: java.io.IOException -> L24
        L23:
            throw r2     // Catch: java.io.IOException -> L24
        L24:
            return
    }

    public static byte[] f(java.io.InputStream r3, int r4) {
            byte[] r0 = new byte[r4]
            r1 = 0
        L3:
            if (r1 >= r4) goto L1a
            int r2 = r4 - r1
            int r2 = r3.read(r0, r1, r2)
            if (r2 < 0) goto Lf
            int r1 = r1 + r2
            goto L3
        Lf:
            java.lang.String r3 = "Not enough bytes to read: "
            java.lang.String r3 = eh.a.l(r4, r3)
            j8.o.A(r3)
            r3 = 0
            return r3
        L1a:
            return r0
    }

    public static int[] g(java.io.ByteArrayInputStream r5, int r6) {
            int[] r0 = new int[r6]
            r1 = 0
            r2 = r1
        L4:
            if (r1 >= r6) goto L12
            r3 = 2
            long r3 = m(r5, r3)
            int r3 = (int) r3
            int r2 = r2 + r3
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    public static byte[] h(java.io.FileInputStream r8, int r9, int r10) {
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
    }

    public static t3.b[] i(java.io.FileInputStream r6, byte[] r7, byte[] r8, t3.b[] r9) {
            byte[] r0 = t3.f.f13058i
            boolean r1 = java.util.Arrays.equals(r7, r0)
            java.lang.String r2 = "Unsupported meta version"
            java.lang.String r3 = "Content found after the end of file"
            r4 = 4
            if (r1 == 0) goto L5b
            byte[] r1 = t3.f.f13053d
            boolean r8 = java.util.Arrays.equals(r1, r8)
            if (r8 != 0) goto L55
            boolean r7 = java.util.Arrays.equals(r7, r0)
            if (r7 == 0) goto L51
            r7 = 1
            long r7 = m(r6, r7)
            int r7 = (int) r7
            long r0 = m(r6, r4)
            long r4 = m(r6, r4)
            int r8 = (int) r4
            int r0 = (int) r0
            byte[] r8 = h(r6, r8, r0)
            int r6 = r6.read()
            if (r6 > 0) goto L4c
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r8)
            t3.b[] r7 = j(r6, r7, r9)     // Catch: java.lang.Throwable -> L42
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
            j8.o.A(r3)
        L4f:
            r6 = 0
            return r6
        L51:
            j8.o.A(r2)
            goto L4f
        L55:
            java.lang.String r6 = "Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher"
            j8.o.A(r6)
            goto L4f
        L5b:
            byte[] r0 = t3.f.f13059j
            boolean r7 = java.util.Arrays.equals(r7, r0)
            if (r7 == 0) goto L98
            r7 = 2
            long r0 = m(r6, r7)
            int r7 = (int) r0
            long r0 = m(r6, r4)
            long r4 = m(r6, r4)
            int r2 = (int) r4
            int r0 = (int) r0
            byte[] r0 = h(r6, r2, r0)
            int r6 = r6.read()
            if (r6 > 0) goto L94
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r0)
            t3.b[] r7 = k(r6, r8, r7, r9)     // Catch: java.lang.Throwable -> L8a
            r6.close()
            return r7
        L8a:
            r7 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L8f
            goto L93
        L8f:
            r6 = move-exception
            r7.addSuppressed(r6)
        L93:
            throw r7
        L94:
            j8.o.A(r3)
            goto L4f
        L98:
            j8.o.A(r2)
            goto L4f
    }

    public static t3.b[] j(java.io.ByteArrayInputStream r8, int r9, t3.b[] r10) {
            int r0 = r8.available()
            r1 = 0
            if (r0 != 0) goto La
            t3.b[] r8 = new t3.b[r1]
            return r8
        La:
            int r0 = r10.length
            if (r9 != r0) goto L54
            java.lang.String[] r0 = new java.lang.String[r9]
            int[] r2 = new int[r9]
            r3 = r1
        L12:
            if (r3 >= r9) goto L31
            r4 = 2
            long r5 = m(r8, r4)
            int r5 = (int) r5
            long r6 = m(r8, r4)
            int r4 = (int) r6
            r2[r3] = r4
            java.lang.String r4 = new java.lang.String
            byte[] r5 = f(r8, r5)
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            r4.<init>(r5, r6)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L12
        L31:
            if (r1 >= r9) goto L53
            r3 = r10[r1]
            java.lang.String r4 = r3.f13041b
            r5 = r0[r1]
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L4c
            r4 = r2[r1]
            r3.f13044e = r4
            int[] r4 = g(r8, r4)
            r3.f13047h = r4
            int r1 = r1 + 1
            goto L31
        L4c:
            java.lang.String r8 = "Order of dexfiles in metadata did not match baseline"
            j8.o.A(r8)
        L51:
            r8 = 0
            return r8
        L53:
            return r10
        L54:
            java.lang.String r8 = "Mismatched number of dex files found in metadata"
            j8.o.A(r8)
            goto L51
    }

    public static t3.b[] k(java.io.ByteArrayInputStream r10, byte[] r11, int r12, t3.b[] r13) {
            int r0 = r10.available()
            r1 = 0
            if (r0 != 0) goto La
            t3.b[] r10 = new t3.b[r1]
            return r10
        La:
            int r0 = r13.length
            if (r12 != r0) goto L82
            r0 = r1
        Le:
            if (r0 >= r12) goto L81
            r2 = 2
            m(r10, r2)
            long r3 = m(r10, r2)
            int r3 = (int) r3
            java.lang.String r4 = new java.lang.String
            byte[] r3 = f(r10, r3)
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            r4.<init>(r3, r5)
            r3 = 4
            long r5 = m(r10, r3)
            long r2 = m(r10, r2)
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
            java.lang.String r9 = r9.f13041b
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L5c
            r7 = r13[r8]
            goto L5f
        L5c:
            int r8 = r8 + 1
            goto L4c
        L5f:
            if (r7 == 0) goto L76
            r7.f13043d = r5
            int[] r3 = g(r10, r2)
            byte[] r4 = t3.f.f13057h
            boolean r4 = java.util.Arrays.equals(r11, r4)
            if (r4 == 0) goto L73
            r7.f13044e = r2
            r7.f13047h = r3
        L73:
            int r0 = r0 + 1
            goto Le
        L76:
            java.lang.String r10 = "Missing profile key: "
            java.lang.String r10 = r10.concat(r4)
            j8.o.A(r10)
        L7f:
            r10 = 0
            return r10
        L81:
            return r13
        L82:
            java.lang.String r10 = "Mismatched number of dex files found in metadata"
            j8.o.A(r10)
            goto L7f
    }

    public static t3.b[] l(java.io.FileInputStream r5, byte[] r6, java.lang.String r7) {
            byte[] r0 = t3.f.f13054e
            boolean r6 = java.util.Arrays.equals(r6, r0)
            if (r6 == 0) goto L41
            r6 = 1
            long r0 = m(r5, r6)
            int r6 = (int) r0
            r0 = 4
            long r1 = m(r5, r0)
            long r3 = m(r5, r0)
            int r0 = (int) r3
            int r1 = (int) r1
            byte[] r0 = h(r5, r0, r1)
            int r5 = r5.read()
            if (r5 > 0) goto L3a
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            r5.<init>(r0)
            t3.b[] r6 = n(r5, r7, r6)     // Catch: java.lang.Throwable -> L30
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
            java.lang.String r5 = "Content found after the end of file"
            j8.o.A(r5)
        L3f:
            r5 = 0
            return r5
        L41:
            java.lang.String r5 = "Unsupported version"
            j8.o.A(r5)
            goto L3f
    }

    public static long m(java.io.InputStream r6, int r7) {
            byte[] r6 = f(r6, r7)
            r0 = 0
            r2 = 0
        L7:
            if (r2 >= r7) goto L15
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            int r5 = r2 * 8
            long r3 = r3 << r5
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L7
        L15:
            return r0
    }

    public static t3.b[] n(java.io.ByteArrayInputStream r19, java.lang.String r20, int r21) {
            r0 = r19
            r1 = r21
            int r2 = r0.available()
            r3 = 0
            if (r2 != 0) goto Le
            t3.b[] r0 = new t3.b[r3]
            return r0
        Le:
            t3.b[] r2 = new t3.b[r1]
            r4 = r3
        L11:
            r5 = 2
            if (r4 >= r1) goto L50
            long r6 = m(r0, r5)
            int r6 = (int) r6
            long r7 = m(r0, r5)
            int r14 = (int) r7
            r5 = 4
            long r7 = m(r0, r5)
            long r12 = m(r0, r5)
            long r9 = m(r0, r5)
            t3.b r5 = new t3.b
            java.lang.String r11 = new java.lang.String
            byte[] r6 = f(r0, r6)
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
            if (r4 >= r1) goto L11b
            r6 = r2[r4]
            int r7 = r0.available()
            int r8 = r6.f13045f
            int r9 = r6.f13046g
            java.util.TreeMap r10 = r6.f13048i
            int r7 = r7 - r8
            r8 = r3
        L61:
            int r11 = r0.available()
            r12 = 7
            if (r11 <= r7) goto Lb4
            long r13 = m(r0, r5)
            int r11 = (int) r13
            int r8 = r8 + r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r13 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r10.put(r11, r14)
            long r14 = m(r0, r5)
            int r11 = (int) r14
        L7f:
            if (r11 <= 0) goto L61
            m(r0, r5)
            long r14 = m(r0, r13)
            int r14 = (int) r14
            r15 = 6
            if (r14 != r15) goto L90
        L8c:
            r15 = r3
            r16 = r4
            goto Lae
        L90:
            if (r14 != r12) goto L93
            goto L8c
        L93:
            if (r14 <= 0) goto L8c
            m(r0, r13)
            r15 = r3
            r16 = r4
            long r3 = m(r0, r13)
            int r3 = (int) r3
        La0:
            if (r3 <= 0) goto La8
            m(r0, r5)
            int r3 = r3 + (-1)
            goto La0
        La8:
            int r14 = r14 + (-1)
            r3 = r15
            r4 = r16
            goto L93
        Lae:
            int r11 = r11 + (-1)
            r3 = r15
            r4 = r16
            goto L7f
        Lb4:
            r15 = r3
            r16 = r4
            int r3 = r0.available()
            if (r3 != r7) goto L114
            int r3 = r6.f13044e
            int[] r3 = g(r0, r3)
            r6.f13047h = r3
            int r3 = r9 * 2
            int r3 = r3 + r12
            r3 = r3 & (-8)
            int r3 = r3 / 8
            byte[] r3 = f(r0, r3)
            java.util.BitSet r3 = java.util.BitSet.valueOf(r3)
            r4 = r15
        Ld5:
            if (r4 >= r9) goto L10f
            boolean r6 = r3.get(r4)
            if (r6 == 0) goto Ldf
            r6 = r5
            goto Le0
        Ldf:
            r6 = r15
        Le0:
            int r7 = r4 + r9
            boolean r7 = r3.get(r7)
            if (r7 == 0) goto Lea
            r6 = r6 | 4
        Lea:
            if (r6 == 0) goto L10c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.Object r7 = r10.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto Lfc
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
        Lfc:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            int r7 = r7.intValue()
            r6 = r6 | r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10.put(r8, r6)
        L10c:
            int r4 = r4 + 1
            goto Ld5
        L10f:
            int r4 = r16 + 1
            r3 = r15
            goto L51
        L114:
            java.lang.String r0 = "Read too much data during profile line parse"
            j8.o.A(r0)
            r0 = 0
            return r0
        L11b:
            return r2
    }

    public static boolean o(java.io.ByteArrayOutputStream r19, byte[] r20, t3.b[] r21) {
            r0 = r19
            r1 = r20
            r2 = r21
            byte[] r3 = t3.f.f13053d
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
            v(r9, r10)     // Catch: java.lang.Throwable -> L5f
            r10 = 2
            r11 = r6
            r12 = r10
        L28:
            int r13 = r2.length     // Catch: java.lang.Throwable -> L5f
            if (r11 >= r13) goto L61
            r13 = r2[r11]     // Catch: java.lang.Throwable -> L5f
            long r14 = r13.f13042c     // Catch: java.lang.Throwable -> L5f
            u(r9, r14, r5)     // Catch: java.lang.Throwable -> L5f
            long r14 = r13.f13043d     // Catch: java.lang.Throwable -> L5f
            u(r9, r14, r5)     // Catch: java.lang.Throwable -> L5f
            int r14 = r13.f13046g     // Catch: java.lang.Throwable -> L5f
            long r14 = (long) r14     // Catch: java.lang.Throwable -> L5f
            u(r9, r14, r5)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r14 = r13.f13040a     // Catch: java.lang.Throwable -> L5f
            java.lang.String r13 = r13.f13041b     // Catch: java.lang.Throwable -> L5f
            java.lang.String r13 = d(r14, r13, r3)     // Catch: java.lang.Throwable -> L5f
            int r12 = r12 + 14
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L5f
            byte[] r15 = r13.getBytes(r14)     // Catch: java.lang.Throwable -> L5f
            int r15 = r15.length     // Catch: java.lang.Throwable -> L5f
            v(r9, r15)     // Catch: java.lang.Throwable -> L5f
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
            t3.j r11 = new t3.j     // Catch: java.lang.Throwable -> L5f
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
            v(r3, r9)     // Catch: java.lang.Throwable -> Lb2
            int r11 = r11 + 4
            int r15 = r12.f13044e     // Catch: java.lang.Throwable -> Lb2
            v(r3, r15)     // Catch: java.lang.Throwable -> Lb2
            int r15 = r12.f13044e     // Catch: java.lang.Throwable -> Lb2
            int r15 = r15 * r10
            int r11 = r11 + r15
            int[] r12 = r12.f13047h     // Catch: java.lang.Throwable -> Lb2
            int r15 = r12.length     // Catch: java.lang.Throwable -> Lb2
            r16 = r6
            r20 = r10
            r10 = r16
        L9a:
            if (r10 >= r15) goto La9
            r17 = r12[r10]     // Catch: java.lang.Throwable -> Lb2
            int r6 = r17 - r16
            v(r3, r6)     // Catch: java.lang.Throwable -> Lb2
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
            t3.j r9 = new t3.j     // Catch: java.lang.Throwable -> Lb2
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
            java.util.TreeMap r10 = r9.f13048i     // Catch: java.lang.Throwable -> L135
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
            r(r10, r11, r9)     // Catch: java.lang.Throwable -> L144
            byte[] r12 = r10.toByteArray()     // Catch: java.lang.Throwable -> L144
            r10.close()     // Catch: java.lang.Throwable -> L135
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L135
            r10.<init>()     // Catch: java.lang.Throwable -> L135
            s(r10, r9)     // Catch: java.lang.Throwable -> L139
            byte[] r9 = r10.toByteArray()     // Catch: java.lang.Throwable -> L139
            r10.close()     // Catch: java.lang.Throwable -> L135
            v(r3, r4)     // Catch: java.lang.Throwable -> L135
            int r10 = r12.length     // Catch: java.lang.Throwable -> L135
            int r10 = r10 + 2
            int r15 = r9.length     // Catch: java.lang.Throwable -> L135
            int r10 = r10 + r15
            int r6 = r6 + 6
            r16 = r8
            long r7 = (long) r10     // Catch: java.lang.Throwable -> L135
            u(r3, r7, r5)     // Catch: java.lang.Throwable -> L135
            v(r3, r11)     // Catch: java.lang.Throwable -> L135
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
            t3.j r4 = new t3.j     // Catch: java.lang.Throwable -> L135
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
            u(r0, r6, r5)
            r4 = 0
        L17a:
            int r6 = r1.size()
            if (r4 >= r6) goto L1e0
            java.lang.Object r6 = r1.get(r4)
            t3.j r6 = (t3.j) r6
            int r7 = r6.f13067a
            byte[] r8 = r6.f13068b
            r9 = 1
            if (r7 == r9) goto L1a7
            r9 = 2
            if (r7 == r9) goto L1a4
            r9 = 3
            if (r7 == r9) goto L1a1
            r9 = 4
            if (r7 == r9) goto L19e
            r9 = 5
            if (r7 != r9) goto L19c
            r9 = 4
            goto L1a9
        L19c:
            r0 = 0
            throw r0
        L19e:
            r9 = 3
            goto L1a9
        L1a1:
            r9 = 2
            goto L1a9
        L1a4:
            r9 = 1
            goto L1a9
        L1a7:
            r9 = 0
        L1a9:
            u(r0, r9, r5)
            u(r0, r2, r5)
            boolean r6 = r6.f13069c
            if (r6 == 0) goto L1ca
            int r6 = r8.length
            long r6 = (long) r6
            byte[] r8 = a(r8)
            r9 = r16
            r9.add(r8)
            int r10 = r8.length
            long r10 = (long) r10
            u(r0, r10, r5)
            u(r0, r6, r5)
            int r6 = r8.length
        L1c7:
            long r6 = (long) r6
            long r2 = r2 + r6
            goto L1db
        L1ca:
            r9 = r16
            r9.add(r8)
            int r6 = r8.length
            long r6 = (long) r6
            u(r0, r6, r5)
            r6 = 0
            u(r0, r6, r5)
            int r6 = r8.length
            goto L1c7
        L1db:
            int r4 = r4 + 1
            r16 = r9
            goto L17a
        L1e0:
            r9 = r16
            r6 = 0
        L1e3:
            int r1 = r9.size()
            if (r6 >= r1) goto L1f5
            java.lang.Object r1 = r9.get(r6)
            byte[] r1 = (byte[]) r1
            r0.write(r1)
            int r6 = r6 + 1
            goto L1e3
        L1f5:
            r15 = 1
            goto L391
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
            byte[] r3 = t3.f.f13054e
            boolean r4 = java.util.Arrays.equals(r1, r3)
            if (r4 == 0) goto L28b
            byte[] r1 = b(r2, r3)
            int r2 = r2.length
            long r2 = (long) r2
            r15 = 1
            u(r0, r2, r15)
            int r2 = r1.length
            long r2 = (long) r2
            u(r0, r2, r5)
            byte[] r1 = a(r1)
            int r2 = r1.length
            long r2 = (long) r2
            u(r0, r2, r5)
            r0.write(r1)
            return r15
        L28b:
            r15 = 1
            byte[] r3 = t3.f.f13056g
            boolean r4 = java.util.Arrays.equals(r1, r3)
            if (r4 == 0) goto L301
            int r1 = r2.length
            long r6 = (long) r1
            u(r0, r6, r15)
            int r1 = r2.length
            r4 = 0
        L29b:
            if (r4 >= r1) goto L1f5
            r6 = r2[r4]
            java.util.TreeMap r7 = r6.f13048i
            int r7 = r7.size()
            int r7 = r7 * r5
            java.lang.String r8 = r6.f13040a
            java.lang.String r9 = r6.f13041b
            java.lang.String r8 = d(r8, r9, r3)
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r10 = r8.getBytes(r9)
            int r10 = r10.length
            v(r0, r10)
            int[] r10 = r6.f13047h
            int r10 = r10.length
            v(r0, r10)
            long r10 = (long) r7
            u(r0, r10, r5)
            long r10 = r6.f13042c
            u(r0, r10, r5)
            byte[] r7 = r8.getBytes(r9)
            r0.write(r7)
            java.util.TreeMap r7 = r6.f13048i
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L2d8:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L2f0
            java.lang.Object r8 = r7.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            v(r0, r8)
            r8 = 0
            v(r0, r8)
            goto L2d8
        L2f0:
            int[] r6 = r6.f13047h
            int r7 = r6.length
            r8 = 0
        L2f4:
            if (r8 >= r7) goto L2fe
            r9 = r6[r8]
            v(r0, r9)
            int r8 = r8 + 1
            goto L2f4
        L2fe:
            int r4 = r4 + 1
            goto L29b
        L301:
            byte[] r3 = t3.f.f13055f
            boolean r4 = java.util.Arrays.equals(r1, r3)
            if (r4 == 0) goto L325
            byte[] r1 = b(r2, r3)
            int r2 = r2.length
            long r2 = (long) r2
            r15 = 1
            u(r0, r2, r15)
            int r2 = r1.length
            long r2 = (long) r2
            u(r0, r2, r5)
            byte[] r1 = a(r1)
            int r2 = r1.length
            long r2 = (long) r2
            u(r0, r2, r5)
            r0.write(r1)
            return r15
        L325:
            byte[] r3 = t3.f.f13057h
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L392
            int r1 = r2.length
            v(r0, r1)
            int r1 = r2.length
            r8 = 0
        L333:
            if (r8 >= r1) goto L1f5
            r4 = r2[r8]
            java.lang.String r6 = r4.f13040a
            java.util.TreeMap r7 = r4.f13048i
            java.lang.String r9 = r4.f13041b
            java.lang.String r6 = d(r6, r9, r3)
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r10 = r6.getBytes(r9)
            int r10 = r10.length
            v(r0, r10)
            int r10 = r7.size()
            v(r0, r10)
            int[] r10 = r4.f13047h
            int r10 = r10.length
            v(r0, r10)
            long r10 = r4.f13042c
            u(r0, r10, r5)
            byte[] r6 = r6.getBytes(r9)
            r0.write(r6)
            java.util.Set r6 = r7.keySet()
            java.util.Iterator r6 = r6.iterator()
        L36c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L380
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            v(r0, r7)
            goto L36c
        L380:
            int[] r4 = r4.f13047h
            int r6 = r4.length
            r7 = 0
        L384:
            if (r7 >= r6) goto L38e
            r9 = r4[r7]
            v(r0, r9)
            int r7 = r7 + 1
            goto L384
        L38e:
            int r8 = r8 + 1
            goto L333
        L391:
            return r15
        L392:
            r18 = 0
            return r18
    }

    public static void p(java.io.ByteArrayOutputStream r8, t3.b r9) {
            s(r8, r9)
            int r0 = r9.f13046g
            int[] r1 = r9.f13047h
            int r2 = r1.length
            r3 = 0
            r4 = r3
        La:
            if (r3 >= r2) goto L17
            r5 = r1[r3]
            int r4 = r5 - r4
            v(r8, r4)
            int r3 = r3 + 1
            r4 = r5
            goto La
        L17:
            int r1 = r0 * 2
            int r1 = r1 + 7
            r1 = r1 & (-8)
            int r1 = r1 / 8
            byte[] r1 = new byte[r1]
            java.util.TreeMap r9 = r9.f13048i
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L2b:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r9.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = r2 & 2
            r5 = 1
            if (r4 == 0) goto L5c
            int r4 = r3 / 8
            r6 = r1[r4]
            int r7 = r3 % 8
            int r7 = r5 << r7
            r6 = r6 | r7
            byte r6 = (byte) r6
            r1[r4] = r6
        L5c:
            r2 = r2 & 4
            if (r2 == 0) goto L2b
            int r3 = r3 + r0
            int r2 = r3 / 8
            r4 = r1[r2]
            int r3 = r3 % 8
            int r3 = r5 << r3
            r3 = r3 | r4
            byte r3 = (byte) r3
            r1[r2] = r3
            goto L2b
        L6e:
            r8.write(r1)
            return
    }

    public static void q(java.io.ByteArrayOutputStream r4, t3.b r5, java.lang.String r6) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r6.getBytes(r0)
            int r1 = r1.length
            v(r4, r1)
            int r1 = r5.f13044e
            v(r4, r1)
            int r1 = r5.f13045f
            long r1 = (long) r1
            r3 = 4
            u(r4, r1, r3)
            long r1 = r5.f13042c
            u(r4, r1, r3)
            int r5 = r5.f13046g
            long r1 = (long) r5
            u(r4, r1, r3)
            byte[] r5 = r6.getBytes(r0)
            r4.write(r5)
            return
    }

    public static void r(java.io.ByteArrayOutputStream r10, int r11, t3.b r12) {
            int r0 = r12.f13046g
            r1 = r11 & (-2)
            int r1 = java.lang.Integer.bitCount(r1)
            int r1 = r1 * r0
            int r1 = r1 + 7
            r1 = r1 & (-8)
            int r1 = r1 / 8
            byte[] r1 = new byte[r1]
            java.util.TreeMap r12 = r12.f13048i
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L1b:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r12.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = 1
            r5 = 0
            r6 = r4
        L3e:
            r7 = 4
            if (r6 > r7) goto L1b
            if (r6 != r4) goto L46
        L43:
            int r6 = r6 << 1
            goto L3e
        L46:
            r7 = r6 & r11
            if (r7 != 0) goto L4b
            goto L43
        L4b:
            r7 = r6 & r2
            if (r7 != r6) goto L5e
            int r7 = r5 * r0
            int r7 = r7 + r3
            int r8 = r7 / 8
            r9 = r1[r8]
            int r7 = r7 % 8
            int r7 = r4 << r7
            r7 = r7 | r9
            byte r7 = (byte) r7
            r1[r8] = r7
        L5e:
            int r5 = r5 + 1
            goto L43
        L61:
            r10.write(r1)
            return
    }

    public static void s(java.io.ByteArrayOutputStream r4, t3.b r5) {
            java.util.TreeMap r5 = r5.f13048i
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
            v(r4, r1)
            v(r4, r0)
            r1 = r3
            goto Lc
        L3b:
            return
    }

    public static void t(android.content.Context r18, java.util.concurrent.Executor r19, t3.e r20, boolean r21) {
            r1 = r18
            r5 = r20
            android.content.Context r0 = r1.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r4 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            r8 = 7
            r9 = 0
            android.content.pm.PackageInfo r10 = r0.getPackageInfo(r2, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d2
            java.io.File r11 = r1.getFilesDir()
            java.lang.String r3 = "ProfileInstaller"
            r12 = 0
            if (r21 != 0) goto L8c
            java.io.File r0 = new java.io.File
            java.lang.String r7 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r11, r7)
            boolean r7 = r0.exists()
            if (r7 != 0) goto L41
        L3f:
            r0 = r9
            goto L6f
        L41:
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch: java.io.IOException -> L3f
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch: java.io.IOException -> L3f
            r14.<init>(r0)     // Catch: java.io.IOException -> L3f
            r7.<init>(r14)     // Catch: java.io.IOException -> L3f
            long r14 = r7.readLong()     // Catch: java.lang.Throwable -> L64
            r7.close()     // Catch: java.io.IOException -> L3f
            r16 = r14
            long r13 = r10.lastUpdateTime
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 != 0) goto L5c
            r0 = 1
            goto L5d
        L5c:
            r0 = r9
        L5d:
            if (r0 == 0) goto L6f
            r7 = 2
            r5.c(r7, r12)
            goto L6f
        L64:
            r0 = move-exception
            r13 = r0
            r7.close()     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r0 = move-exception
            r13.addSuppressed(r0)     // Catch: java.io.IOException -> L3f
        L6e:
            throw r13     // Catch: java.io.IOException -> L3f
        L6f:
            if (r0 != 0) goto L72
            goto L8c
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Skipping profile installation for "
            r0.<init>(r2)
            java.lang.String r2 = r1.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            t3.i.c(r1, r9)
            goto L2d1
        L8c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "Installing profile for "
            r0.<init>(r7)
            java.lang.String r7 = r1.getPackageName()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            java.io.File r7 = new java.io.File
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "/data/misc/profiles/cur/0"
            r0.<init>(r3, r2)
            java.lang.String r2 = "primary.prof"
            r7.<init>(r0, r2)
            t3.a r2 = new t3.a
            java.lang.String r0 = "dexopt/baseline.prof"
            r3 = r4
            r4 = r19
            r2.<init>(r3, r4, r5, r6, r7)
            byte[] r4 = r2.f13034c
            if (r4 != 0) goto Lca
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 3
            r2.b(r3, r0)
        Lc7:
            r7 = 1
            goto L2c6
        Lca:
            boolean r6 = r7.exists()
            r13 = 4
            if (r6 == 0) goto Ldd
            boolean r6 = r7.canWrite()
            if (r6 != 0) goto Ldb
            r2.b(r13, r12)
            goto Lc7
        Ldb:
            r6 = 1
            goto Lea
        Ldd:
            boolean r6 = r7.createNewFile()     // Catch: java.io.IOException -> Le7
            if (r6 != 0) goto Ldb
            r2.b(r13, r12)     // Catch: java.io.IOException -> Le7
            goto Lc7
        Le7:
            r7 = 1
            goto L2c3
        Lea:
            r2.f13037f = r6
            r6 = 6
            java.io.FileInputStream r0 = r2.a(r3, r0)     // Catch: java.io.IOException -> Lf3 java.io.FileNotFoundException -> Lf8
            r7 = r0
            goto Lfd
        Lf3:
            r0 = move-exception
            r5.c(r8, r0)
            goto Lfc
        Lf8:
            r0 = move-exception
            r5.c(r6, r0)
        Lfc:
            r7 = r12
        Lfd:
            java.lang.String r14 = "Invalid magic"
            byte[] r15 = t3.f.f13051b
            r6 = 8
            if (r7 == 0) goto L14c
            byte[] r0 = f(r7, r13)     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            boolean r0 = java.util.Arrays.equals(r15, r0)     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            if (r0 == 0) goto L129
            byte[] r0 = f(r7, r13)     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            java.lang.String r9 = r2.f13036e     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            t3.b[] r9 = l(r7, r0, r9)     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            r7.close()     // Catch: java.io.IOException -> L11d
            goto L140
        L11d:
            r0 = move-exception
            r5.c(r8, r0)
            goto L140
        L122:
            r0 = move-exception
            r1 = r0
            goto L143
        L125:
            r0 = move-exception
            goto L12f
        L127:
            r0 = move-exception
            goto L13b
        L129:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            r0.<init>(r14)     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            throw r0     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
        L12f:
            r5.c(r6, r0)     // Catch: java.lang.Throwable -> L122
        L132:
            r7.close()     // Catch: java.io.IOException -> L136
            goto L13f
        L136:
            r0 = move-exception
            r5.c(r8, r0)
            goto L13f
        L13b:
            r5.c(r8, r0)     // Catch: java.lang.Throwable -> L122
            goto L132
        L13f:
            r9 = r12
        L140:
            r2.f13038g = r9
            goto L14c
        L143:
            r7.close()     // Catch: java.io.IOException -> L147
            goto L14b
        L147:
            r0 = move-exception
            r5.c(r8, r0)
        L14b:
            throw r1
        L14c:
            t3.b[] r0 = r2.f13038g
            if (r0 == 0) goto L1aa
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 31
            if (r7 < r9) goto L1aa
            java.lang.String r7 = "dexopt/baseline.profm"
            java.io.FileInputStream r3 = r2.a(r3, r7)     // Catch: java.lang.IllegalStateException -> L179 java.io.IOException -> L17b java.io.FileNotFoundException -> L17d
            if (r3 == 0) goto L191
            byte[] r7 = t3.f.f13052c     // Catch: java.lang.Throwable -> L17f
            byte[] r9 = f(r3, r13)     // Catch: java.lang.Throwable -> L17f
            boolean r7 = java.util.Arrays.equals(r7, r9)     // Catch: java.lang.Throwable -> L17f
            if (r7 == 0) goto L182
            byte[] r7 = f(r3, r13)     // Catch: java.lang.Throwable -> L17f
            t3.b[] r0 = i(r3, r7, r4, r0)     // Catch: java.lang.Throwable -> L17f
            r2.f13038g = r0     // Catch: java.lang.Throwable -> L17f
            r3.close()     // Catch: java.lang.IllegalStateException -> L179 java.io.IOException -> L17b java.io.FileNotFoundException -> L17d
            r0 = r2
            goto L1a7
        L179:
            r0 = move-exception
            goto L197
        L17b:
            r0 = move-exception
            goto L19d
        L17d:
            r0 = move-exception
            goto L1a1
        L17f:
            r0 = move-exception
            r4 = r0
            goto L188
        L182:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17f
            r0.<init>(r14)     // Catch: java.lang.Throwable -> L17f
            throw r0     // Catch: java.lang.Throwable -> L17f
        L188:
            r3.close()     // Catch: java.lang.Throwable -> L18c
            goto L190
        L18c:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.IllegalStateException -> L179 java.io.IOException -> L17b java.io.FileNotFoundException -> L17d
        L190:
            throw r4     // Catch: java.lang.IllegalStateException -> L179 java.io.IOException -> L17b java.io.FileNotFoundException -> L17d
        L191:
            if (r3 == 0) goto L1a6
            r3.close()     // Catch: java.lang.IllegalStateException -> L179 java.io.IOException -> L17b java.io.FileNotFoundException -> L17d
            goto L1a6
        L197:
            r2.f13038g = r12
            r5.c(r6, r0)
            goto L1a6
        L19d:
            r5.c(r8, r0)
            goto L1a6
        L1a1:
            r3 = 9
            r5.c(r3, r0)
        L1a6:
            r0 = r12
        L1a7:
            if (r0 == 0) goto L1aa
            r2 = r0
        L1aa:
            t3.e r3 = r2.f13033b
            t3.b[] r0 = r2.f13038g
            byte[] r4 = r2.f13034c
            java.lang.String r5 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L1fe
            if (r4 != 0) goto L1b7
            goto L1fe
        L1b7:
            boolean r7 = r2.f13037f
            if (r7 == 0) goto L1fa
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.IllegalStateException -> L1d6 java.io.IOException -> L1d8
            r7.<init>()     // Catch: java.lang.IllegalStateException -> L1d6 java.io.IOException -> L1d8
            r7.write(r15)     // Catch: java.lang.Throwable -> L1da
            r7.write(r4)     // Catch: java.lang.Throwable -> L1da
            boolean r0 = o(r7, r4, r0)     // Catch: java.lang.Throwable -> L1da
            if (r0 != 0) goto L1dd
            r0 = 5
            r3.c(r0, r12)     // Catch: java.lang.Throwable -> L1da
            r2.f13038g = r12     // Catch: java.lang.Throwable -> L1da
            r7.close()     // Catch: java.lang.IllegalStateException -> L1d6 java.io.IOException -> L1d8
            goto L1fe
        L1d6:
            r0 = move-exception
            goto L1f0
        L1d8:
            r0 = move-exception
            goto L1f4
        L1da:
            r0 = move-exception
            r4 = r0
            goto L1e7
        L1dd:
            byte[] r0 = r7.toByteArray()     // Catch: java.lang.Throwable -> L1da
            r2.f13039h = r0     // Catch: java.lang.Throwable -> L1da
            r7.close()     // Catch: java.lang.IllegalStateException -> L1d6 java.io.IOException -> L1d8
            goto L1f7
        L1e7:
            r7.close()     // Catch: java.lang.Throwable -> L1eb
            goto L1ef
        L1eb:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.IllegalStateException -> L1d6 java.io.IOException -> L1d8
        L1ef:
            throw r4     // Catch: java.lang.IllegalStateException -> L1d6 java.io.IOException -> L1d8
        L1f0:
            r3.c(r6, r0)
            goto L1f7
        L1f4:
            r3.c(r8, r0)
        L1f7:
            r2.f13038g = r12
            goto L1fe
        L1fa:
            j8.o.A(r5)
            return
        L1fe:
            byte[] r0 = r2.f13039h
            if (r0 != 0) goto L206
            r6 = 0
            r7 = 1
            goto L2b3
        L206:
            boolean r3 = r2.f13037f
            if (r3 == 0) goto L2bf
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L24c java.io.IOException -> L2a0 java.io.FileNotFoundException -> L2a3
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L24c java.io.IOException -> L2a0 java.io.FileNotFoundException -> L2a3
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L294
            java.io.File r0 = r2.f13035d     // Catch: java.lang.Throwable -> L294
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L294
            java.nio.channels.FileChannel r5 = r4.getChannel()     // Catch: java.lang.Throwable -> L288
            java.nio.channels.FileLock r6 = r5.tryLock()     // Catch: java.lang.Throwable -> L27a
            if (r6 == 0) goto L262
            boolean r0 = r6.isValid()     // Catch: java.lang.Throwable -> L264
            if (r0 == 0) goto L262
            r0 = 512(0x200, float:7.17E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L264
        L22a:
            int r7 = r3.read(r0)     // Catch: java.lang.Throwable -> L264
            if (r7 <= 0) goto L235
            r9 = 0
            r4.write(r0, r9, r7)     // Catch: java.lang.Throwable -> L264
            goto L22a
        L235:
            r7 = 1
            r2.b(r7, r12)     // Catch: java.lang.Throwable -> L25f
            r6.close()     // Catch: java.lang.Throwable -> L25c
            r5.close()     // Catch: java.lang.Throwable -> L259
            r4.close()     // Catch: java.lang.Throwable -> L256
            r3.close()     // Catch: java.lang.Throwable -> L24c java.io.IOException -> L24f java.io.FileNotFoundException -> L252
            r2.f13039h = r12
            r2.f13038g = r12
            r6 = r7
            goto L2b3
        L24c:
            r0 = move-exception
            goto L2ba
        L24f:
            r0 = move-exception
            goto L2a6
        L252:
            r0 = move-exception
        L253:
            r3 = 6
            goto L2ae
        L256:
            r0 = move-exception
        L257:
            r4 = r0
            goto L297
        L259:
            r0 = move-exception
        L25a:
            r5 = r0
            goto L28b
        L25c:
            r0 = move-exception
        L25d:
            r6 = r0
            goto L27d
        L25f:
            r0 = move-exception
        L260:
            r9 = r0
            goto L26f
        L262:
            r7 = 1
            goto L267
        L264:
            r0 = move-exception
            r7 = 1
            goto L260
        L267:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L25f
            java.lang.String r9 = "Unable to acquire a lock on the underlying file channel."
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L25f
            throw r0     // Catch: java.lang.Throwable -> L25f
        L26f:
            if (r6 == 0) goto L279
            r6.close()     // Catch: java.lang.Throwable -> L275
            goto L279
        L275:
            r0 = move-exception
            r9.addSuppressed(r0)     // Catch: java.lang.Throwable -> L25c
        L279:
            throw r9     // Catch: java.lang.Throwable -> L25c
        L27a:
            r0 = move-exception
            r7 = 1
            goto L25d
        L27d:
            if (r5 == 0) goto L287
            r5.close()     // Catch: java.lang.Throwable -> L283
            goto L287
        L283:
            r0 = move-exception
            r6.addSuppressed(r0)     // Catch: java.lang.Throwable -> L259
        L287:
            throw r6     // Catch: java.lang.Throwable -> L259
        L288:
            r0 = move-exception
            r7 = 1
            goto L25a
        L28b:
            r4.close()     // Catch: java.lang.Throwable -> L28f
            goto L293
        L28f:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.Throwable -> L256
        L293:
            throw r5     // Catch: java.lang.Throwable -> L256
        L294:
            r0 = move-exception
            r7 = 1
            goto L257
        L297:
            r3.close()     // Catch: java.lang.Throwable -> L29b
            goto L29f
        L29b:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L24c java.io.IOException -> L24f java.io.FileNotFoundException -> L252
        L29f:
            throw r4     // Catch: java.lang.Throwable -> L24c java.io.IOException -> L24f java.io.FileNotFoundException -> L252
        L2a0:
            r0 = move-exception
            r7 = 1
            goto L2a6
        L2a3:
            r0 = move-exception
            r7 = 1
            goto L253
        L2a6:
            r2.b(r8, r0)     // Catch: java.lang.Throwable -> L24c
        L2a9:
            r2.f13039h = r12
            r2.f13038g = r12
            goto L2b2
        L2ae:
            r2.b(r3, r0)     // Catch: java.lang.Throwable -> L24c
            goto L2a9
        L2b2:
            r6 = 0
        L2b3:
            if (r6 == 0) goto L2b8
            e(r10, r11)
        L2b8:
            r9 = r6
            goto L2c7
        L2ba:
            r2.f13039h = r12
            r2.f13038g = r12
            throw r0
        L2bf:
            j8.o.A(r5)
            return
        L2c3:
            r2.b(r13, r12)
        L2c6:
            r9 = 0
        L2c7:
            if (r9 == 0) goto L2cd
            if (r21 == 0) goto L2cd
            r9 = r7
            goto L2ce
        L2cd:
            r9 = 0
        L2ce:
            t3.i.c(r1, r9)
        L2d1:
            return
        L2d2:
            r0 = move-exception
            r5.c(r8, r0)
            r9 = 0
            t3.i.c(r1, r9)
            return
    }

    public static void u(java.io.ByteArrayOutputStream r6, long r7, int r9) {
            byte[] r0 = new byte[r9]
            r1 = 0
        L3:
            if (r1 >= r9) goto L13
            int r2 = r1 * 8
            long r2 = r7 >> r2
            r4 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r4
            int r2 = (int) r2
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L3
        L13:
            r6.write(r0)
            return
    }

    public static void v(java.io.ByteArrayOutputStream r2, int r3) {
            long r0 = (long) r3
            r3 = 2
            u(r2, r0, r3)
            return
    }
}
