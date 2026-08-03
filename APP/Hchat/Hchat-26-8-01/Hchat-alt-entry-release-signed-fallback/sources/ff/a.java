package ff;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mh.b f3923c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f3924d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fd.h f3925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m.a f3926b;

    static {
            java.lang.Class<ff.a> r0 = ff.a.class
            mh.b r0 = mh.d.b(r0)
            ff.a.f3923c = r0
            r0 = 1
            ff.a.f3924d = r0
            return
    }

    public a(fd.h r6) {
            r5 = this;
            r5.<init>()
            m.a r0 = new m.a
            b.e r1 = new b.e
            rf.c r2 = new rf.c
            r2.<init>()
            java.lang.Class<nf.d> r3 = nf.d.class
            java.util.EnumSet r3 = java.util.EnumSet.noneOf(r3)
            r4 = 29
            r1.<init>(r2, r4, r3)
            r2 = 7
            r0.<init>(r1, r2)
            r5.f3926b = r0
            r5.f3925a = r6
            return
    }

    public static boolean b(byte[] r5, byte[] r6) {
            int r0 = r6.length
            int r1 = r5.length
            r2 = 0
            if (r1 >= r0) goto L6
            goto Lf
        L6:
            r1 = r2
        L7:
            if (r1 >= r0) goto L13
            r3 = r5[r1]
            r4 = r6[r1]
            if (r3 == r4) goto L10
        Lf:
            return r2
        L10:
            int r1 = r1 + 1
            goto L7
        L13:
            r5 = 1
            return r5
    }

    public final java.util.ArrayList a(java.io.File r9) {
            r8 = this;
            mh.b r0 = ff.a.f3923c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            m.a r2 = r8.f3926b     // Catch: java.lang.Exception -> L72
            nf.c r2 = r2.r(r9)     // Catch: java.lang.Exception -> L72
            java.util.ArrayList r3 = r2.f9416h     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L4d
        L13:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L4d
            nf.a r4 = (nf.a) r4     // Catch: java.lang.Throwable -> L4d
            boolean r5 = r4.isDirectory()     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto L26
            goto L13
        L26:
            boolean r5 = r4.a()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            if (r5 == 0) goto L51
            byte[] r5 = r4.getBytes()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            byte[] r7 = jf.c.f6868a     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            boolean r7 = b(r5, r7)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            if (r7 != 0) goto L48
            java.lang.String r7 = ".dex"
            boolean r7 = r6.endsWith(r7)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            if (r7 == 0) goto L45
            goto L48
        L45:
            java.util.List r5 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            goto L5e
        L48:
            java.util.List r5 = r8.d(r6, r5)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            goto L5e
        L4d:
            r3 = move-exception
            goto L74
        L4f:
            r5 = move-exception
            goto L68
        L51:
            java.io.InputStream r5 = r4.b()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r7 = 0
            java.util.List r5 = r8.c(r7, r5, r6)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
        L5e:
            boolean r6 = r5.isEmpty()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            if (r6 != 0) goto L13
            r1.addAll(r5)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            goto L13
        L68:
            java.lang.String r6 = "Failed to read zip entry: {}"
            r0.n(r4, r6, r5)     // Catch: java.lang.Throwable -> L4d
            goto L13
        L6e:
            r2.close()     // Catch: java.lang.Exception -> L72
            goto L88
        L72:
            r2 = move-exception
            goto L7f
        L74:
            if (r2 == 0) goto L7e
            r2.close()     // Catch: java.lang.Throwable -> L7a
            goto L7e
        L7a:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.lang.Exception -> L72
        L7e:
            throw r3     // Catch: java.lang.Exception -> L72
        L7f:
            java.lang.String r3 = "Failed to process zip file: {}"
            java.lang.String r9 = r9.getAbsolutePath()
            r0.n(r9, r3, r2)
        L88:
            return r1
    }

    public final java.util.List c(java.io.File r8, java.io.InputStream r9, java.lang.String r10) {
            r7 = this;
            boolean r0 = r9.markSupported()
            if (r0 == 0) goto L7
            goto Ld
        L7:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r9)
            r9 = r0
        Ld:
            r0 = 4
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> L1f
            r9.mark(r0)     // Catch: java.lang.Throwable -> L1f
            int r2 = r9.read(r1)     // Catch: java.lang.Throwable -> L1f
            if (r2 == r0) goto L22
            java.util.List r8 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L1f
            r9.close()
            return r8
        L1f:
            r8 = move-exception
            goto La1
        L22:
            byte[] r0 = jf.c.f6868a     // Catch: java.lang.Throwable -> L1f
            boolean r0 = b(r1, r0)     // Catch: java.lang.Throwable -> L1f
            r2 = 0
            r3 = -1
            if (r0 == 0) goto L4e
            r9.reset()     // Catch: java.lang.Throwable -> L1f
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L1f
            r8.<init>()     // Catch: java.lang.Throwable -> L1f
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L1f
        L38:
            int r1 = r9.read(r0)     // Catch: java.lang.Throwable -> L1f
            if (r1 != r3) goto L4a
            byte[] r8 = r8.toByteArray()     // Catch: java.lang.Throwable -> L1f
            java.util.List r8 = r7.d(r10, r8)     // Catch: java.lang.Throwable -> L1f
            r9.close()
            return r8
        L4a:
            r8.write(r0, r2, r1)     // Catch: java.lang.Throwable -> L1f
            goto L38
        L4e:
            java.lang.String r0 = ".dex"
            boolean r0 = r10.endsWith(r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L6c
            java.lang.String r0 = bf.b.a(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L1f
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.US_ASCII     // Catch: java.lang.Throwable -> L1f
            r4.<init>(r1, r5)     // Catch: java.lang.Throwable -> L1f
            mh.b r5 = ff.a.f3923c     // Catch: java.lang.Throwable -> L1f
            java.lang.String r6 = "Invalid DEX magic: 0x{}(\"{}\") in file: {}"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r4, r10}     // Catch: java.lang.Throwable -> L1f
            r5.i(r6, r0)     // Catch: java.lang.Throwable -> L1f
        L6c:
            if (r8 == 0) goto L9b
            byte[] r0 = jf.c.f6869b     // Catch: java.lang.Throwable -> L1f
            boolean r0 = b(r1, r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L93
            java.util.Set r0 = yc.a.f22416a     // Catch: java.lang.Throwable -> L1f
            r0 = 46
            int r0 = r10.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 != r3) goto L82
            r10 = 0
            goto L88
        L82:
            int r0 = r0 + 1
            java.lang.String r10 = r10.substring(r0)     // Catch: java.lang.Throwable -> L1f
        L88:
            if (r10 != 0) goto L8b
            goto L91
        L8b:
            java.util.Set r0 = yc.a.f22416a     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r0.contains(r10)     // Catch: java.lang.Throwable -> L1f
        L91:
            if (r2 == 0) goto L9b
        L93:
            java.util.ArrayList r8 = r7.a(r8)     // Catch: java.lang.Throwable -> L1f
            r9.close()
            return r8
        L9b:
            java.util.List r8 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L1f
            r9.close()
            return r8
        La1:
            r9.close()     // Catch: java.lang.Throwable -> La5
            goto La9
        La5:
            r9 = move-exception
            r8.addSuppressed(r9)
        La9:
            throw r8
    }

    public final java.util.List d(java.lang.String r6, byte[] r7) {
            r5 = this;
            r0 = 36
            int r0 = x6.d.e0(r7, r0)
            r1 = 120(0x78, float:1.68E-43)
            if (r0 >= r1) goto Lc
            r0 = 0
            goto L24
        Lc:
            r0 = 32
            int r0 = x6.d.e0(r7, r0)
            r1 = 112(0x70, float:1.57E-43)
            int r1 = x6.d.e0(r7, r1)
            r2 = 116(0x74, float:1.63E-43)
            x6.d.e0(r7, r2)
            b5.k r2 = new b5.k
            r3 = 2
            r2.<init>(r0, r1, r3)
            r0 = r2
        L24:
            r1 = 0
            if (r0 == 0) goto L61
            int r2 = r0.f488b
            int r0 = r0.f489c
            int r3 = r7.length
            int r0 = java.lang.Math.min(r0, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L35:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.add(r1)
            if (r2 < r0) goto L56
            java.util.stream.Stream r0 = r3.stream()
            d4.b r1 = new d4.b
            r1.<init>(r5, r6, r7)
            java.util.stream.Stream r6 = r0.map(r1)
            java.util.stream.Collector r7 = java.util.stream.Collectors.toList()
            java.lang.Object r6 = r6.collect(r7)
            java.util.List r6 = (java.util.List) r6
            return r6
        L56:
            int r1 = r2 + 32
            int r1 = x6.d.e0(r7, r1)
            int r1 = r1 + r2
            r4 = r2
            r2 = r1
            r1 = r4
            goto L35
        L61:
            ff.e r6 = r5.e(r6, r7, r1)
            java.util.List r6 = java.util.Collections.singletonList(r6)
            return r6
    }

    public final ff.e e(java.lang.String r6, byte[] r7, int r8) {
            r5 = this;
            fd.h r0 = r5.f3925a
            boolean r0 = r0.f3918g
            if (r0 == 0) goto L70
            int r0 = r8 + 32
            int r1 = r8 + 36
            int r2 = r7.length
            if (r1 > r2) goto L64
            int r0 = x6.d.e0(r7, r0)
            int r1 = r8 + r0
            int r2 = r7.length
            if (r1 > r2) goto L48
            int r1 = r8 + 8
            int r1 = x6.d.e0(r7, r1)
            java.util.zip.Adler32 r2 = new java.util.zip.Adler32
            r2.<init>()
            int r3 = r8 + 12
            int r0 = r0 + (-12)
            r2.update(r7, r3, r0)
            long r2 = r2.getValue()
            int r0 = (int) r2
            if (r1 != r0) goto L30
            goto L70
        L30:
            af.d r7 = new af.d
            java.lang.String r8 = "Bad dex file checksum: 0x%08x, expected: 0x%08x, file: %s"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r1, r6}
            java.lang.String r6 = java.lang.String.format(r8, r6)
            r7.<init>(r6)
            throw r7
        L48:
            af.d r7 = new af.d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "Dex file truncated, length in header: "
            r8.<init>(r1)
            r8.append(r0)
            java.lang.String r0 = ", file: "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        L64:
            af.d r7 = new af.d
            java.lang.String r8 = "Dex file truncated, can't read file length, file: "
            java.lang.String r6 = wb.en.g(r8, r6)
            r7.<init>(r6)
            throw r7
        L70:
            ff.e r0 = new ff.e
            java.lang.Class<ff.a> r1 = ff.a.class
            monitor-enter(r1)
            int r2 = ff.a.f3924d     // Catch: java.lang.Throwable -> L83
            r3 = 1
            int r2 = r2 + r3
            ff.a.f3924d = r2     // Catch: java.lang.Throwable -> L83
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r2 < r4) goto L85
            ff.a.f3924d = r3     // Catch: java.lang.Throwable -> L83
            goto L85
        L83:
            r6 = move-exception
            goto L8c
        L85:
            int r2 = ff.a.f3924d     // Catch: java.lang.Throwable -> L83
            monitor-exit(r1)
            r0.<init>(r2, r6, r7, r8)
            return r0
        L8c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
            throw r6
    }
}
