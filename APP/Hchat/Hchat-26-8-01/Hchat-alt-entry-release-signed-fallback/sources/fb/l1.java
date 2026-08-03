package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final og.k f3623e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.io.File f3625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fb.k1 f3626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.String f3627d;

    static {
            og.k r0 = new og.k
            java.lang.String r1 = "classes(\\d*)\\.dex"
            r0.<init>(r1)
            fb.l1.f3623e = r0
            return
    }

    public l1(java.io.File r4, java.lang.String r5) {
            r3 = this;
            r3.<init>()
            r3.f3624a = r5
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)
            java.nio.charset.Charset r2 = og.a.f9804a
            byte[] r5 = r5.getBytes(r2)
            r5.getClass()
            byte[] r5 = r1.digest(r5)
            r5.getClass()
            fb.g0 r1 = new fb.g0
            r2 = 18
            r1.<init>(r2)
            java.lang.String r5 = tf.l.E0(r5, r1)
            r1 = 24
            java.lang.String r5 = og.m.P0(r1, r5)
            java.lang.String r1 = ".json"
            java.lang.String r5 = r5.concat(r1)
            r0.<init>(r4, r5)
            r3.f3625b = r0
            fb.k1 r4 = new fb.k1
            r5 = 1
            r0 = 0
            r1 = 64
            r2 = 1061158912(0x3f400000, float:0.75)
            r4.<init>(r1, r2, r5, r0)
            r3.f3626c = r4
            java.lang.String r4 = ""
            r3.f3627d = r4
            return
    }

    public static final int a(fb.l1 r0, java.lang.String r1) {
            java.lang.String r0 = "classes"
            java.lang.String r0 = og.m.A0(r1, r0)
            java.lang.String r1 = ".dex"
            java.lang.String r0 = og.m.B0(r0, r1)
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r1 = 10
            java.lang.Integer r0 = og.t.e0(r1, r0)
            if (r0 == 0) goto L21
            int r0 = r0.intValue()
            return r0
        L21:
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
    }

    public static java.lang.String c(java.lang.String r5) {
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            boolean r0 = og.m.t0(r5)
            if (r0 != 0) goto L45
            r0 = 76
            boolean r1 = og.m.I0(r5, r0)
            r2 = 59
            if (r1 == 0) goto L1f
            boolean r1 = og.m.l0(r5, r2)
            if (r1 == 0) goto L1f
            return r5
        L1f:
            r1 = 46
            r3 = 47
            java.lang.String r5 = r5.replace(r1, r3)
            r5.getClass()
            r1 = 1
            char[] r3 = new char[r1]
            r4 = 0
            r3[r4] = r0
            java.lang.String r5 = og.m.W0(r5, r3)
            char[] r0 = new char[r1]
            r0[r4] = r2
            java.lang.String r5 = og.m.U0(r5, r0)
            java.lang.String r0 = "L"
            java.lang.String r1 = ";"
            java.lang.String r5 = eh.a.n(r0, r5, r1)
            return r5
        L45:
            java.lang.String r5 = "类 descriptor 为空"
            j8.o.t(r5)
            r5 = 0
            return r5
    }

    public static a5.a h(k5.u r3) {
            a5.a r0 = new a5.a
            r1 = 0
            r2 = 0
            r0.<init>(r2, r1)
            r1 = 15
            r0.f56h = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f57i = r1
            f5.g r3 = r3.f7265c
            int r3 = r3.f3297b
            r0.f56h = r3
            return r0
    }

    public static k5.u j(java.util.zip.ZipFile r1, java.util.zip.ZipEntry r2) {
            java.io.InputStream r1 = r1.getInputStream(r2)
            r1.getClass()
            boolean r2 = r1 instanceof java.io.BufferedInputStream
            if (r2 == 0) goto Le
            java.io.BufferedInputStream r1 = (java.io.BufferedInputStream) r1
            goto L16
        Le:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            r0 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r1, r0)
            r1 = r2
        L16:
            k5.u r2 = k5.u.a(r1)     // Catch: java.lang.Throwable -> L1e
            r1.close()
            return r2
        L1e:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L20
        L20:
            r0 = move-exception
            ig.a.i(r1, r2)
            throw r0
    }

    public final java.lang.String b(java.lang.String r8, java.lang.String r9, java.lang.String r10, org.json.JSONObject r11) {
            r7 = this;
            java.lang.String r0 = "offset"
            r1 = 0
            int r2 = r11.optInt(r0, r1)
            int r3 = r10.length()
            int r2 = r9.e0.r(r2, r1, r3)
            java.lang.String r3 = "max_chars"
            r4 = 24000(0x5dc0, float:3.3631E-41)
            int r11 = r11.optInt(r3, r4)
            r3 = 1000(0x3e8, float:1.401E-42)
            r4 = 120000(0x1d4c0, float:1.68156E-40)
            int r11 = r9.e0.r(r11, r3, r4)
            int r11 = r11 + r2
            int r3 = r10.length()
            if (r11 <= r3) goto L28
            r11 = r3
        L28:
            int r3 = r10.length()
            r4 = 1
            if (r11 >= r3) goto L3e
            int r3 = r11 + (-1)
            r5 = 4
            r6 = 10
            int r3 = og.m.w0(r10, r6, r3, r5)
            int r5 = r2 + 1000
            if (r3 < r5) goto L3e
            int r11 = r3 + 1
        L3e:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r5 = "ok"
            r3.put(r5, r4)
            java.lang.String r5 = "descriptor"
            r3.put(r5, r8)
            java.lang.String r8 = "sourceEntry"
            r3.put(r8, r9)
            java.lang.String r8 = "sourcePath"
            java.lang.String r9 = r7.f3624a
            r3.put(r8, r9)
            r3.put(r0, r2)
            java.lang.String r8 = "returnedLength"
            int r9 = r11 - r2
            r3.put(r8, r9)
            java.lang.String r8 = "totalLength"
            int r9 = r10.length()
            r3.put(r8, r9)
            int r8 = r10.length()
            if (r11 >= r8) goto L73
            r1 = r4
        L73:
            java.lang.String r8 = "truncated"
            r3.put(r8, r1)
            int r8 = r10.length()
            if (r11 >= r8) goto L83
            java.lang.String r8 = "nextOffset"
            r3.put(r8, r11)
        L83:
            java.lang.String r8 = "smali"
            java.lang.String r9 = r10.substring(r2, r11)
            r3.put(r8, r9)
            java.lang.String r8 = r3.toString()
            r8.getClass()
            return r8
    }

    public final java.util.List d(java.util.zip.ZipFile r4) {
            r3 = this;
            java.util.Enumeration r4 = r4.entries()
            r4.getClass()
            m1.f0 r0 = new m1.f0
            r0.<init>(r4)
            ng.j r4 = ng.m.R(r0)
            fb.g0 r0 = new fb.g0
            r1 = 17
            r0.<init>(r1)
            ng.i r1 = new ng.i
            r2 = 1
            r1.<init>(r4, r2, r0)
            c9.a0 r4 = new c9.a0
            r0 = 14
            r4.<init>(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ng.m.a0(r1, r0)
            tf.q.g1(r0, r4)
            java.util.Iterator r4 = r0.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L3c
            tf.t r4 = tf.t.f13167g
            goto L62
        L3c:
            java.lang.Object r0 = r4.next()
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L4b
            java.util.List r4 = a.a.x0(r0)
            goto L62
        L4b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
        L53:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r4.next()
            r1.add(r0)
            goto L53
        L61:
            r4 = r1
        L62:
            return r4
    }

    public final fb.i1 e(java.lang.String r10, fb.b r11) {
            r9 = this;
            fb.k1 r0 = r9.f3626c
            r9.k()
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile
            java.lang.String r2 = r9.f3624a
            r1.<init>(r2)
            java.lang.Object r2 = r0.get(r10)     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L44
            r3 = 0
            if (r2 == 0) goto L5b
            r11.d()     // Catch: java.lang.Throwable -> L44
            java.util.zip.ZipEntry r4 = r1.getEntry(r2)     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L55
            k5.u r4 = j(r1, r4)     // Catch: java.lang.Throwable -> L44
            k5.q r5 = new k5.q     // Catch: java.lang.Throwable -> L44
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L44
            o5.n r6 = new o5.n     // Catch: java.lang.Throwable -> L44
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L44
        L2c:
            boolean r5 = r6.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto L47
            java.lang.Object r5 = r6.next()     // Catch: java.lang.Throwable -> L44
            r7 = r5
            k5.o r7 = (k5.o) r7     // Catch: java.lang.Throwable -> L44
            java.lang.String r7 = r7.getType()     // Catch: java.lang.Throwable -> L44
            boolean r7 = gg.l.a(r7, r10)     // Catch: java.lang.Throwable -> L44
            if (r7 == 0) goto L2c
            goto L48
        L44:
            r10 = move-exception
            goto Lbb
        L47:
            r5 = r3
        L48:
            k5.o r5 = (k5.o) r5     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto L55
            fb.i1 r10 = new fb.i1     // Catch: java.lang.Throwable -> L44
            r10.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L44
            r1.close()
            return r10
        L55:
            r0.remove(r10)     // Catch: java.lang.Throwable -> L44
            r9.l()     // Catch: java.lang.Throwable -> L44
        L5b:
            java.util.List r2 = r9.d(r1)     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L44
        L63:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto Lb7
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L44
            java.util.zip.ZipEntry r4 = (java.util.zip.ZipEntry) r4     // Catch: java.lang.Throwable -> L44
            r11.d()     // Catch: java.lang.Throwable -> L44
            k5.u r5 = j(r1, r4)     // Catch: java.lang.Throwable -> L44
            k5.q r6 = new k5.q     // Catch: java.lang.Throwable -> L44
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L44
            o5.n r7 = new o5.n     // Catch: java.lang.Throwable -> L44
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L44
        L80:
            boolean r6 = r7.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L98
            java.lang.Object r6 = r7.next()     // Catch: java.lang.Throwable -> L44
            r8 = r6
            k5.o r8 = (k5.o) r8     // Catch: java.lang.Throwable -> L44
            java.lang.String r8 = r8.getType()     // Catch: java.lang.Throwable -> L44
            boolean r8 = gg.l.a(r8, r10)     // Catch: java.lang.Throwable -> L44
            if (r8 == 0) goto L80
            goto L99
        L98:
            r6 = r3
        L99:
            k5.o r6 = (k5.o) r6     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L63
            java.lang.String r11 = r4.getName()     // Catch: java.lang.Throwable -> L44
            r0.put(r10, r11)     // Catch: java.lang.Throwable -> L44
            r9.l()     // Catch: java.lang.Throwable -> L44
            fb.i1 r10 = new fb.i1     // Catch: java.lang.Throwable -> L44
            java.lang.String r11 = r4.getName()     // Catch: java.lang.Throwable -> L44
            r11.getClass()     // Catch: java.lang.Throwable -> L44
            r10.<init>(r11, r5, r6)     // Catch: java.lang.Throwable -> L44
            r1.close()
            return r10
        Lb7:
            r1.close()
            return r3
        Lbb:
            throw r10     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r11 = move-exception
            ig.a.i(r1, r10)
            throw r11
    }

    public final java.util.Map f(java.util.List r13, fb.b r14) {
            r12 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r13 = r13.iterator()
        L9:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r13.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = c(r1)
            r0.add(r1)
            goto L9
        L1d:
            boolean r13 = r0.isEmpty()
            if (r13 == 0) goto L26
            tf.u r13 = tf.u.f13168g
            return r13
        L26:
            r12.k()
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile
            java.lang.String r2 = r12.f3624a
            r1.<init>(r2)
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L5c
            r3 = 0
            r4 = r3
        L3b:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L5c
            fb.k1 r6 = r12.f3626c
            r7 = 1
            if (r5 == 0) goto L64
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r8 = r6.get(r5)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L3b
            java.util.zip.ZipEntry r9 = r1.getEntry(r8)     // Catch: java.lang.Throwable -> L5c
            if (r9 == 0) goto L5f
            r13.put(r5, r8)     // Catch: java.lang.Throwable -> L5c
            goto L3b
        L5c:
            r13 = move-exception
            goto Lf9
        L5f:
            r6.remove(r5)     // Catch: java.lang.Throwable -> L5c
            r4 = r7
            goto L3b
        L64:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L5c
            r2.<init>()     // Catch: java.lang.Throwable -> L5c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L5c
        L6d:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto L84
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L5c
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L5c
            boolean r8 = r13.containsKey(r8)     // Catch: java.lang.Throwable -> L5c
            if (r8 != 0) goto L6d
            r2.add(r5)     // Catch: java.lang.Throwable -> L5c
            goto L6d
        L84:
            java.util.List r0 = r12.d(r1)     // Catch: java.lang.Throwable -> L5c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L5c
        L8c:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto Lf0
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L5c
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5     // Catch: java.lang.Throwable -> L5c
            boolean r8 = r2.isEmpty()     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L9f
            goto Lf0
        L9f:
            r14.d()     // Catch: java.lang.Throwable -> L5c
            k5.u r8 = j(r1, r5)     // Catch: java.lang.Throwable -> L5c
            k5.q r9 = new k5.q     // Catch: java.lang.Throwable -> L5c
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L5c
            o5.n r8 = new o5.n     // Catch: java.lang.Throwable -> L5c
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L5c
            r9 = r3
        Lb1:
            boolean r10 = r8.hasNext()     // Catch: java.lang.Throwable -> L5c
            if (r10 == 0) goto L8c
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L5c
            k5.o r10 = (k5.o) r10     // Catch: java.lang.Throwable -> L5c
            boolean r11 = r2.isEmpty()     // Catch: java.lang.Throwable -> L5c
            if (r11 == 0) goto Lc4
            goto L8c
        Lc4:
            int r11 = r9 + 1
            int r9 = r9 % 2048
            if (r9 != 0) goto Lcd
            r14.d()     // Catch: java.lang.Throwable -> L5c
        Lcd:
            java.lang.String r9 = r10.getType()     // Catch: java.lang.Throwable -> L5c
            boolean r9 = r2.remove(r9)     // Catch: java.lang.Throwable -> L5c
            if (r9 == 0) goto Lee
            java.lang.String r4 = r10.getType()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r9 = r5.getName()     // Catch: java.lang.Throwable -> L5c
            r13.put(r4, r9)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = r10.getType()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r9 = r5.getName()     // Catch: java.lang.Throwable -> L5c
            r6.put(r4, r9)     // Catch: java.lang.Throwable -> L5c
            r4 = r7
        Lee:
            r9 = r11
            goto Lb1
        Lf0:
            r1.close()
            if (r4 == 0) goto Lf8
            r12.l()
        Lf8:
            return r13
        Lf9:
            throw r13     // Catch: java.lang.Throwable -> Lfa
        Lfa:
            r14 = move-exception
            ig.a.i(r1, r13)
            throw r14
    }

    public final fb.j1 g(java.lang.String r5, fb.b r6) {
            r4 = this;
            java.lang.String r0 = "Dex 条目不存在: "
            java.lang.String r5 = c(r5)
            fb.i1 r1 = r4.e(r5, r6)
            if (r1 == 0) goto L5d
            java.lang.String r1 = r1.f3555a
            r6.d()
            java.util.zip.ZipFile r6 = new java.util.zip.ZipFile
            java.lang.String r2 = r4.f3624a
            r6.<init>(r2)
            java.util.zip.ZipEntry r2 = r6.getEntry(r1)     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L4d
            java.io.InputStream r0 = r6.getInputStream(r2)     // Catch: java.lang.Throwable -> L2c
            r0.getClass()     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r0 instanceof java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2e
            java.io.BufferedInputStream r0 = (java.io.BufferedInputStream) r0     // Catch: java.lang.Throwable -> L2c
            goto L36
        L2c:
            r5 = move-exception
            goto L57
        L2e:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L2c
            r3 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L2c
            r0 = r2
        L36:
            byte[] r2 = g4.a.G(r0)     // Catch: java.lang.Throwable -> L46
            r0.close()     // Catch: java.lang.Throwable -> L2c
            r6.close()
            fb.j1 r6 = new fb.j1
            r6.<init>(r5, r1, r2)
            return r6
        L46:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L48
        L48:
            r1 = move-exception
            ig.a.i(r0, r5)     // Catch: java.lang.Throwable -> L2c
            throw r1     // Catch: java.lang.Throwable -> L2c
        L4d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> L2c
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            throw r5     // Catch: java.lang.Throwable -> L2c
        L57:
            throw r5     // Catch: java.lang.Throwable -> L58
        L58:
            r0 = move-exception
            ig.a.i(r6, r5)
            throw r0
        L5d:
            java.lang.String r6 = "没有找到类: "
            java.lang.String r5 = r6.concat(r5)
            j8.o.t(r5)
            r5 = 0
            return r5
    }

    public final void i() {
            r3 = this;
            java.io.File r0 = r3.f3625b
            java.io.File r0 = r0.getParentFile()
            if (r0 == 0) goto L13
            fb.h1 r1 = new fb.h1
            r2 = 0
            r1.<init>(r2)
            java.io.File[] r0 = r0.listFiles(r1)
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 != 0) goto L19
            r0 = 0
            java.io.File[] r0 = new java.io.File[r0]
        L19:
            fb.r r1 = new fb.r
            r2 = 8
            r1.<init>(r2)
            java.util.List r0 = tf.l.H0(r0, r1)
            r1 = 8
            java.util.List r0 = tf.m.q1(r1, r0)
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            java.io.File r1 = (java.io.File) r1
            r1.delete()
            goto L2e
        L3e:
            return
    }

    public final void k() {
            r12 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r12.f3624a
            r0.<init>(r1)
            long r2 = r0.length()
            long r4 = r0.lastModified()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = ":"
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = r6.toString()
            java.lang.String r3 = r12.f3627d
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lf3
            fb.k1 r3 = r12.f3626c
            r3.clear()
            r12.f3627d = r2
            java.lang.String r2 = ""
            java.io.File r4 = r12.f3625b
            android.util.AtomicFile r5 = new android.util.AtomicFile     // Catch: java.lang.Throwable -> Lcb
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Lcb
            java.io.FileInputStream r5 = r5.openRead()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> Ld8
            r5.getClass()     // Catch: java.lang.Throwable -> Ld8
            byte[] r7 = g4.a.G(r5)     // Catch: java.lang.Throwable -> Ld8
            java.nio.charset.Charset r8 = og.a.f9804a     // Catch: java.lang.Throwable -> Ld8
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> Ld8
            r5.close()     // Catch: java.lang.Throwable -> Lcb
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lcb
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r6 = "schema"
            r7 = 0
            int r6 = r5.optInt(r6, r7)     // Catch: java.lang.Throwable -> Lcb
            r7 = 1
            if (r6 != r7) goto Lcd
            java.lang.String r6 = "apkPath"
            java.lang.String r6 = r5.optString(r6, r2)     // Catch: java.lang.Throwable -> Lcb
            boolean r1 = gg.l.a(r6, r1)     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto Lcd
            java.lang.String r1 = "apkLength"
            r6 = -1
            long r8 = r5.optLong(r1, r6)     // Catch: java.lang.Throwable -> Lcb
            long r10 = r0.length()     // Catch: java.lang.Throwable -> Lcb
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 != 0) goto Lcd
            java.lang.String r1 = "apkLastModified"
            long r6 = r5.optLong(r1, r6)     // Catch: java.lang.Throwable -> Lcb
            long r0 = r0.lastModified()     // Catch: java.lang.Throwable -> Lcb
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L8a
            goto Lcd
        L8a:
            java.lang.String r0 = "entries"
            org.json.JSONObject r0 = r5.optJSONObject(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto Ld5
            java.util.Iterator r1 = r0.keys()     // Catch: java.lang.Throwable -> Lcb
            r1.getClass()     // Catch: java.lang.Throwable -> Lcb
        L99:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> Lcb
            if (r5 == 0) goto Ld5
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r6 = r0.optString(r5, r2)     // Catch: java.lang.Throwable -> Lcb
            r5.getClass()     // Catch: java.lang.Throwable -> Lcb
            r7 = 76
            boolean r7 = og.m.I0(r5, r7)     // Catch: java.lang.Throwable -> Lcb
            if (r7 == 0) goto L99
            r7 = 59
            boolean r7 = og.m.l0(r5, r7)     // Catch: java.lang.Throwable -> Lcb
            if (r7 == 0) goto L99
            og.k r7 = fb.l1.f3623e     // Catch: java.lang.Throwable -> Lcb
            r6.getClass()     // Catch: java.lang.Throwable -> Lcb
            boolean r7 = r7.d(r6)     // Catch: java.lang.Throwable -> Lcb
            if (r7 == 0) goto L99
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> Lcb
            goto L99
        Lcb:
            r0 = move-exception
            goto Ldf
        Lcd:
            android.util.AtomicFile r0 = new android.util.AtomicFile     // Catch: java.lang.Throwable -> Lcb
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Lcb
            r0.delete()     // Catch: java.lang.Throwable -> Lcb
        Ld5:
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> Lcb
            goto Le5
        Ld8:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lda
        Lda:
            r1 = move-exception
            ig.a.i(r5, r0)     // Catch: java.lang.Throwable -> Lcb
            throw r1     // Catch: java.lang.Throwable -> Lcb
        Ldf:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        Le5:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto Lf3
            android.util.AtomicFile r0 = new android.util.AtomicFile
            r0.<init>(r4)
            r0.delete()
        Lf3:
            return
    }

    public final void l() {
            r7 = this;
            java.lang.String r0 = r7.f3624a
            java.io.File r1 = r7.f3625b
            java.io.File r2 = r1.getParentFile()     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto Ld
            r2.mkdirs()     // Catch: java.lang.Throwable -> L8c
        Ld:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L8c
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8c
            r3.<init>()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r4 = "schema"
            r5 = 1
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r4 = "apkPath"
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r0 = "apkLength"
            long r4 = r2.length()     // Catch: java.lang.Throwable -> L8c
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r0 = "apkLastModified"
            long r4 = r2.lastModified()     // Catch: java.lang.Throwable -> L8c
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r0 = "entries"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8c
            r2.<init>()     // Catch: java.lang.Throwable -> L8c
            fb.k1 r4 = r7.f3626c     // Catch: java.lang.Throwable -> L8c
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L8c
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L8c
        L45:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L8c
            if (r5 == 0) goto L61
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L8c
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L8c
            r2.put(r6, r5)     // Catch: java.lang.Throwable -> L8c
            goto L45
        L61:
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> L8c
            android.util.AtomicFile r0 = new android.util.AtomicFile     // Catch: java.lang.Throwable -> L8c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8c
            java.io.FileOutputStream r1 = r0.startWrite()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L87
            r2.getClass()     // Catch: java.lang.Throwable -> L87
            java.nio.charset.Charset r3 = og.a.f9804a     // Catch: java.lang.Throwable -> L87
            byte[] r2 = r2.getBytes(r3)     // Catch: java.lang.Throwable -> L87
            r2.getClass()     // Catch: java.lang.Throwable -> L87
            r1.write(r2)     // Catch: java.lang.Throwable -> L87
            r0.finishWrite(r1)     // Catch: java.lang.Throwable -> L87
            r7.i()     // Catch: java.lang.Throwable -> L8c
            return
        L87:
            r2 = move-exception
            r0.failWrite(r1)     // Catch: java.lang.Throwable -> L8c
            throw r2     // Catch: java.lang.Throwable -> L8c
        L8c:
            return
    }
}
