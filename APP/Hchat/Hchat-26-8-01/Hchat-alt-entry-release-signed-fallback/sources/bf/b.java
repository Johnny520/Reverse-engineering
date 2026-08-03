package bf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mh.b f857a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static java.nio.file.Path f858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f859c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f860d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f861e = null;

    static {
            java.lang.Class<bf.b> r0 = bf.b.class
            mh.b r0 = mh.d.b(r0)
            bf.b.f857a = r0
            java.lang.String r0 = "jadx-instance-"
            r1 = 0
            java.nio.file.attribute.FileAttribute[] r1 = new java.nio.file.attribute.FileAttribute[r1]     // Catch: java.lang.Exception -> L34
            java.nio.file.Path r0 = java.nio.file.Files.createTempDirectory(r0, r1)     // Catch: java.lang.Exception -> L34
            java.io.File r1 = r0.toFile()     // Catch: java.lang.Exception -> L34
            r1.deleteOnExit()     // Catch: java.lang.Exception -> L34
            bf.b.f858b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            bf.b.f859c = r0
            java.lang.String r0 = "0123456789abcdef"
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            byte[] r0 = r0.getBytes(r1)
            bf.b.f860d = r0
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x003e: FILL_ARRAY_DATA , data: [80, 75, 3, 4} // fill-array
            bf.b.f861e = r0
            return
        L34:
            r0 = move-exception
            af.g r1 = new af.g
            java.lang.String r2 = "Failed to create temp root directory"
            r1.<init>(r2, r0)
            throw r1
    }

    public static java.lang.String a(byte[] r6) {
            int r0 = r6.length
            if (r0 != 0) goto L6
            java.lang.String r6 = ""
            return r6
        L6:
            int r0 = r6.length
            int r0 = r0 * 2
            byte[] r0 = new byte[r0]
            r1 = 0
        Lc:
            int r2 = r6.length
            if (r1 >= r2) goto L28
            r2 = r6[r1]
            r3 = r2 & 255(0xff, float:3.57E-43)
            int r4 = r1 * 2
            int r3 = r3 >>> 4
            byte[] r5 = bf.b.f860d
            r3 = r5[r3]
            r0[r4] = r3
            int r4 = r4 + 1
            r2 = r2 & 15
            r2 = r5[r2]
            r0[r4] = r2
            int r1 = r1 + 1
            goto Lc
        L28:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            r6.<init>(r0, r1)
            return r6
    }

    public static void b(java.nio.file.Path r5, boolean r6) {
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2c
            r0.<init>()     // Catch: java.lang.Exception -> L2c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2c
            r1.<init>()     // Catch: java.lang.Exception -> L2c
            java.util.Set r2 = java.util.Collections.EMPTY_SET     // Catch: java.lang.Exception -> L2c
            bf.a r3 = new bf.a     // Catch: java.lang.Exception -> L2c
            r3.<init>(r0, r1)     // Catch: java.lang.Exception -> L2c
            r4 = 2147483647(0x7fffffff, float:NaN)
            java.nio.file.Files.walkFileTree(r5, r2, r4, r3)     // Catch: java.lang.Exception -> L2c
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Exception -> L2c
            if (r2 != 0) goto L2e
            java.util.stream.Stream r0 = r0.parallelStream()     // Catch: java.lang.Exception -> L2c
            ae.e r2 = new ae.e     // Catch: java.lang.Exception -> L2c
            r3 = 8
            r2.<init>(r3)     // Catch: java.lang.Exception -> L2c
            r0.forEach(r2)     // Catch: java.lang.Exception -> L2c
            goto L2e
        L2c:
            r6 = move-exception
            goto L55
        L2e:
            if (r6 == 0) goto L33
            be.h.U(r1)     // Catch: java.lang.Exception -> L2c
        L33:
            java.util.Iterator r6 = r1.iterator()     // Catch: java.lang.Exception -> L2c
        L37:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L54
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Exception -> L2c
            java.nio.file.Path r0 = (java.nio.file.Path) r0     // Catch: java.lang.Exception -> L2c
            java.nio.file.Files.delete(r0)     // Catch: java.lang.Exception -> L2c java.io.IOException -> L47
            goto L37
        L47:
            r1 = move-exception
            mh.b r2 = bf.b.f857a     // Catch: java.lang.Exception -> L2c
            java.lang.String r3 = "Failed to delete directory {}"
            java.nio.file.Path r0 = r0.toAbsolutePath()     // Catch: java.lang.Exception -> L2c
            r2.s(r0, r3, r1)     // Catch: java.lang.Exception -> L2c
            goto L37
        L54:
            return
        L55:
            af.g r0 = new af.g
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Failed to delete directory "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5, r6)
            throw r0
    }

    public static void c(java.io.File r3) {
            java.lang.String r0 = "Can't create directory "
            if (r3 == 0) goto L28
            java.lang.Object r1 = bf.b.f859c
            monitor-enter(r1)
            boolean r2 = r3.mkdirs()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L24
            boolean r2 = r3.isDirectory()     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L14
            goto L24
        L14:
            af.g r2 = new af.g     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r0.concat(r3)     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L22
            throw r2     // Catch: java.lang.Throwable -> L22
        L22:
            r3 = move-exception
            goto L26
        L24:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            return
        L26:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            throw r3
        L28:
            return
    }
}
