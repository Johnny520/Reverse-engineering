package zb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sf.i f22655a = null;

    static {
            wb.pp r0 = new wb.pp
            r1 = 7
            r0.<init>(r1)
            sf.i r1 = new sf.i
            r1.<init>(r0)
            zb.b.f22655a = r1
            return
    }

    public static java.lang.String a(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = "."
            java.lang.String r1 = "_"
            if (r4 == 0) goto L11
            boolean r2 = og.m.t0(r4)
            if (r2 != 0) goto Ld
            goto Le
        Ld:
            r4 = 0
        Le:
            if (r4 == 0) goto L11
            goto L2d
        L11:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            r4.append(r1)
            r4.append(r2)
            r4.append(r0)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
        L2d:
            java.lang.String r5 = "[\\\\/:*?\"<>|\\r\\n]+"
            java.lang.String r4 = j8.b.h(r5, r4, r1)
            r5 = 46
            java.lang.String r1 = ""
            java.lang.String r5 = og.m.L0(r4, r5, r1)
            boolean r5 = og.m.t0(r5)
            if (r5 == 0) goto L45
            java.lang.String r4 = wb.en.h(r4, r0, r6)
        L45:
            return r4
    }

    public static void b(byte[] r11, int r12, m8.c r13) {
            if (r12 > 0) goto L4
            goto L87
        L4:
            r0 = 0
            lg.d r1 = r9.e0.r0(r0, r12)
            r2 = 8
            lg.b r1 = r9.e0.n0(r1, r2)
            int r3 = r1.f8042g
            int r4 = r1.f8043h
            int r1 = r1.f8044i
            if (r1 <= 0) goto L19
            if (r3 <= r4) goto L1d
        L19:
            if (r1 >= 0) goto L87
            if (r4 > r3) goto L87
        L1d:
            int r5 = r13.f8778a
            java.lang.Object r6 = r13.f8781d
            java.math.BigInteger[] r6 = (java.math.BigInteger[]) r6
            r6 = r6[r5]
            if (r5 != 0) goto L2f
            r13.n()
            r5 = 255(0xff, float:3.57E-43)
            r13.f8778a = r5
            goto L33
        L2f:
            int r5 = r5 + (-1)
            r13.f8778a = r5
        L33:
            byte[] r5 = new byte[r2]
            r7 = r0
        L36:
            if (r7 < r2) goto L53
            int r6 = r12 - r3
            int r8 = java.lang.Math.min(r2, r6)
            r6 = r0
        L3f:
            if (r6 < r8) goto L46
            if (r3 != r4) goto L44
            goto L87
        L44:
            int r3 = r3 + r1
            goto L1d
        L46:
            int r7 = r3 + r6
            r9 = r11[r7]
            r10 = r5[r6]
            r9 = r9 ^ r10
            byte r9 = (byte) r9
            r11[r7] = r9
            int r6 = r6 + 1
            goto L3f
        L53:
            int r8 = r7 * 8
            java.math.BigInteger r8 = r6.shiftRight(r8)
            r9 = 255(0xff, double:1.26E-321)
            java.math.BigInteger r9 = java.math.BigInteger.valueOf(r9)
            java.math.BigInteger r8 = r8.and(r9)
            int r9 = 7 - r7
            byte[] r8 = r8.toByteArray()
            r8.getClass()
            int r10 = r8.length
            if (r10 != 0) goto L71
            r8 = 0
            goto L7a
        L71:
            int r10 = r8.length
            int r10 = r10 + (-1)
            r8 = r8[r10]
            java.lang.Byte r8 = java.lang.Byte.valueOf(r8)
        L7a:
            if (r8 == 0) goto L81
            byte r8 = r8.byteValue()
            goto L82
        L81:
            r8 = r0
        L82:
            r5[r9] = r8
            int r7 = r7 + 1
            goto L36
        L87:
            return
    }

    public static void c(java.io.File r4, java.io.File r5, java.math.BigInteger r6) {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r4)
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L23
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L23
            m8.c r5 = new m8.c     // Catch: java.lang.Throwable -> L30
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L30
            r6 = 33554432(0x2000000, float:9.403955E-38)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L30
            r1 = 131072(0x20000, float:1.83671E-40)
        L15:
            int r2 = r0.read(r6)     // Catch: java.lang.Throwable -> L30
            r3 = -1
            if (r2 != r3) goto L25
            r4.close()     // Catch: java.lang.Throwable -> L23
            r0.close()
            return
        L23:
            r4 = move-exception
            goto L3d
        L25:
            if (r1 <= 0) goto L32
            int r3 = java.lang.Math.min(r2, r1)     // Catch: java.lang.Throwable -> L30
            b(r6, r3, r5)     // Catch: java.lang.Throwable -> L30
            int r1 = r1 - r3
            goto L32
        L30:
            r5 = move-exception
            goto L37
        L32:
            r3 = 0
            r4.write(r6, r3, r2)     // Catch: java.lang.Throwable -> L30
            goto L15
        L37:
            throw r5     // Catch: java.lang.Throwable -> L38
        L38:
            r6 = move-exception
            ig.a.i(r4, r5)     // Catch: java.lang.Throwable -> L23
            throw r6     // Catch: java.lang.Throwable -> L23
        L3d:
            throw r4     // Catch: java.lang.Throwable -> L3e
        L3e:
            r5 = move-exception
            ig.a.i(r0, r4)
            throw r5
    }

    public static final java.io.File d(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r0 = 0
            if (r5 == 0) goto L73
            boolean r1 = og.m.t0(r5)
            if (r1 == 0) goto Lb
            goto L73
        Lb:
            boolean r1 = og.m.t0(r6)
            if (r1 == 0) goto L12
            goto L73
        L12:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "Finder"
            java.io.File r4 = i(r4, r2)
            java.lang.String r2 = "finder_video"
            java.lang.String r3 = "mp4"
            java.lang.String r7 = a(r7, r2, r3)
            r1.<init>(r4, r7)
            java.io.File r4 = new java.io.File
            java.io.File r7 = r1.getParentFile()
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = ".tmp"
            java.lang.String r2 = bc.e.i(r2, r3)
            r4.<init>(r7, r2)
            r7 = 0
            java.io.File r5 = g(r4, r5, r7)     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L4e
            java.math.BigInteger r5 = new java.math.BigInteger     // Catch: java.lang.Throwable -> L4c
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L4c
            c(r4, r1, r5)     // Catch: java.lang.Throwable -> L4c
            r4.delete()     // Catch: java.lang.Throwable -> L4c
            r5 = r1
            goto L56
        L4c:
            r5 = move-exception
            goto L50
        L4e:
            r5 = r0
            goto L56
        L50:
            sf.f r6 = new sf.f
            r6.<init>(r5)
            r5 = r6
        L56:
            java.lang.Throwable r6 = sf.g.b(r5)
            if (r6 == 0) goto L6b
            r4.delete()
            r1.delete()
            java.lang.String r4 = r6.getMessage()
            java.lang.String r7 = "[Hchat:MediaDownloader] 视频号视频下载解密失败: "
            eh.a.x(r7, r4, r6)
        L6b:
            boolean r4 = r5 instanceof sf.f
            if (r4 == 0) goto L70
            goto L71
        L70:
            r0 = r5
        L71:
            java.io.File r0 = (java.io.File) r0
        L73:
            return r0
    }

    public static final java.io.File e(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            r3.getClass()
            if (r4 == 0) goto L27
            boolean r0 = og.m.t0(r4)
            if (r0 == 0) goto Lc
            goto L27
        Lc:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "Image"
            java.io.File r3 = i(r3, r1)
            java.lang.String r1 = "image"
            java.lang.String r2 = h(r4)
            java.lang.String r5 = a(r5, r1, r2)
            r0.<init>(r3, r5)
            r3 = 0
            java.io.File r3 = g(r0, r4, r3)
            return r3
        L27:
            r3 = 0
            return r3
    }

    public static final java.util.List f(android.content.Context r6, java.lang.String r7, java.util.List r8) {
            r6.getClass()
            if (r8 != 0) goto L8
            tf.t r6 = tf.t.f13167g
            return r6
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
            r1 = 1
        L12:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r2 = r8.next()
            if (r2 == 0) goto L12
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L12
            boolean r3 = og.m.t0(r2)
            r4 = 0
            if (r3 != 0) goto L2c
            goto L2d
        L2c:
            r2 = r4
        L2d:
            if (r2 == 0) goto L12
            if (r7 == 0) goto L58
            boolean r3 = og.m.t0(r7)
            if (r3 == 0) goto L38
            goto L58
        L38:
            java.lang.String r3 = h(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            java.lang.String r5 = "_"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = "."
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
        L58:
            java.io.File r2 = e(r6, r2, r4)
            if (r2 == 0) goto L61
            r0.add(r2)
        L61:
            int r1 = r1 + 1
            goto L12
        L64:
            return r0
    }

    public static java.io.File g(java.io.File r9, java.lang.String r10, boolean r11) {
            r0 = 0
            r1 = 0
            java.io.File r2 = r9.getParentFile()     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto L15
            boolean r3 = r2.isDirectory()     // Catch: java.lang.Throwable -> L12
            if (r3 != 0) goto L15
            r2.mkdirs()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r10 = move-exception
            goto Ld8
        L15:
            if (r11 == 0) goto L48
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = "."
            if (r2 == 0) goto L1e
            goto L23
        L1e:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L12
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L12
        L23:
            java.lang.String r5 = r9.getName()     // Catch: java.lang.Throwable -> L12
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L12
            r8.append(r5)     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = ".download."
            r8.append(r4)     // Catch: java.lang.Throwable -> L12
            r8.append(r6)     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = ".tmp"
            r8.append(r4)     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> L12
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L12
            goto L49
        L48:
            r3 = r9
        L49:
            okhttp3.Request$Builder r2 = new okhttp3.Request$Builder     // Catch: java.lang.Throwable -> L12
            r2.<init>()     // Catch: java.lang.Throwable -> L12
            okhttp3.Request$Builder r10 = r2.url(r10)     // Catch: java.lang.Throwable -> L12
            okhttp3.Request$Builder r10 = r10.get()     // Catch: java.lang.Throwable -> L12
            okhttp3.Request r10 = r10.build()     // Catch: java.lang.Throwable -> L12
            sf.i r2 = zb.b.f22655a     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L12
            okhttp3.OkHttpClient r2 = (okhttp3.OkHttpClient) r2     // Catch: java.lang.Throwable -> L12
            okhttp3.Call r10 = r2.newCall(r10)     // Catch: java.lang.Throwable -> L12
            okhttp3.Response r10 = r10.execute()     // Catch: java.lang.Throwable -> L12
            boolean r2 = r10.isSuccessful()     // Catch: java.lang.Throwable -> L78
            if (r2 != 0) goto L7a
            r3.delete()     // Catch: java.lang.Throwable -> L78
        L73:
            r10.close()     // Catch: java.lang.Throwable -> L12
            r10 = r1
            goto Lde
        L78:
            r2 = move-exception
            goto Ld2
        L7a:
            okhttp3.ResponseBody r2 = r10.body()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto Lce
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L78
            java.io.InputStream r2 = r2.byteStream()     // Catch: java.lang.Throwable -> L78
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L78
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lba
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lba
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> Lbc
        L92:
            int r6 = r4.read(r5)     // Catch: java.lang.Throwable -> Lbc
            if (r6 > 0) goto Lbe
            r2.flush()     // Catch: java.lang.Throwable -> Lbc
            r2.close()     // Catch: java.lang.Throwable -> Lba
            r4.close()     // Catch: java.lang.Throwable -> L78
            r10.close()     // Catch: java.lang.Throwable -> L12
            if (r11 == 0) goto Lb8
            java.nio.file.Path r10 = r3.toPath()     // Catch: java.lang.Throwable -> L12
            java.nio.file.Path r2 = r9.toPath()     // Catch: java.lang.Throwable -> L12
            r3 = 1
            java.nio.file.CopyOption[] r3 = new java.nio.file.CopyOption[r3]     // Catch: java.lang.Throwable -> L12
            java.nio.file.StandardCopyOption r4 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.lang.Throwable -> L12
            r3[r0] = r4     // Catch: java.lang.Throwable -> L12
            java.nio.file.Files.move(r10, r2, r3)     // Catch: java.lang.Throwable -> L12
        Lb8:
            r10 = r9
            goto Lde
        Lba:
            r2 = move-exception
            goto Lc8
        Lbc:
            r3 = move-exception
            goto Lc2
        Lbe:
            r2.write(r5, r0, r6)     // Catch: java.lang.Throwable -> Lbc
            goto L92
        Lc2:
            throw r3     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r5 = move-exception
            ig.a.i(r2, r3)     // Catch: java.lang.Throwable -> Lba
            throw r5     // Catch: java.lang.Throwable -> Lba
        Lc8:
            throw r2     // Catch: java.lang.Throwable -> Lc9
        Lc9:
            r3 = move-exception
            ig.a.i(r4, r2)     // Catch: java.lang.Throwable -> L78
            throw r3     // Catch: java.lang.Throwable -> L78
        Lce:
            r3.delete()     // Catch: java.lang.Throwable -> L78
            goto L73
        Ld2:
            throw r2     // Catch: java.lang.Throwable -> Ld3
        Ld3:
            r3 = move-exception
            ig.a.i(r10, r2)     // Catch: java.lang.Throwable -> L12
            throw r3     // Catch: java.lang.Throwable -> L12
        Ld8:
            sf.f r2 = new sf.f
            r2.<init>(r10)
            r10 = r2
        Lde:
            java.lang.Throwable r2 = sf.g.b(r10)
            if (r2 == 0) goto L10b
            if (r11 == 0) goto L102
            java.io.File r11 = r9.getParentFile()
            if (r11 == 0) goto L102
            zb.a r3 = new zb.a
            r3.<init>(r9)
            java.io.File[] r9 = r11.listFiles(r3)
            if (r9 == 0) goto L102
            int r11 = r9.length
        Lf8:
            if (r0 >= r11) goto L102
            r3 = r9[r0]
            r3.delete()     // Catch: java.lang.Throwable -> Lff
        Lff:
            int r0 = r0 + 1
            goto Lf8
        L102:
            java.lang.String r9 = r2.getMessage()
            java.lang.String r11 = "[Hchat:MediaDownloader] 下载失败: "
            eh.a.x(r11, r9, r2)
        L10b:
            boolean r9 = r10 instanceof sf.f
            if (r9 == 0) goto L110
            goto L111
        L110:
            r1 = r10
        L111:
            java.io.File r1 = (java.io.File) r1
            return r1
    }

    public static java.lang.String h(java.lang.String r2) {
            java.lang.String r0 = ""
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r2.getLastPathSegment()     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L15
            r2 = r0
            goto L15
        Le:
            r2 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r2)
            r2 = r1
        L15:
            boolean r1 = r2 instanceof sf.f
            if (r1 == 0) goto L1b
            r2 = r0
        L1b:
            java.lang.String r2 = (java.lang.String) r2
            r1 = 46
            java.lang.String r2 = og.m.L0(r2, r1, r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = j8.b.l(r0, r2, r0)
            int r0 = r2.hashCode()
            java.lang.String r1 = "png"
            switch(r0) {
                case 97669: goto L67;
                case 102340: goto L5e;
                case 105441: goto L55;
                case 108273: goto L4c;
                case 111145: goto L45;
                case 3268712: goto L3c;
                case 3645340: goto L33;
                default: goto L32;
            }
        L32:
            goto L6f
        L33:
            java.lang.String r0 = "webp"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L70
            goto L6f
        L3c:
            java.lang.String r0 = "jpeg"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L70
            goto L6f
        L45:
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L70
            goto L6f
        L4c:
            java.lang.String r0 = "mp4"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L70
            goto L6f
        L55:
            java.lang.String r0 = "jpg"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L70
            goto L6f
        L5e:
            java.lang.String r0 = "gif"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L70
            goto L6f
        L67:
            java.lang.String r0 = "bmp"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L70
        L6f:
            r2 = r1
        L70:
            return r2
    }

    public static final java.io.File i(android.content.Context r7, java.lang.String r8) {
            r7.getClass()
            android.content.Context r0 = r7.getApplicationContext()
            if (r0 == 0) goto La
            r7 = r0
        La:
            r0 = 0
            java.io.File[] r1 = r7.getExternalMediaDirs()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L25
            int r2 = r1.length     // Catch: java.lang.Throwable -> L23
            r3 = 0
            r4 = r3
        L14:
            if (r4 >= r2) goto L25
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L1c
            r6 = 1
            goto L1d
        L1c:
            r6 = r3
        L1d:
            if (r6 == 0) goto L20
            goto L2c
        L20:
            int r4 = r4 + 1
            goto L14
        L23:
            r1 = move-exception
            goto L27
        L25:
            r5 = r0
            goto L2c
        L27:
            sf.f r5 = new sf.f
            r5.<init>(r1)
        L2c:
            boolean r1 = r5 instanceof sf.f
            if (r1 == 0) goto L31
            goto L32
        L31:
            r0 = r5
        L32:
            java.io.File r0 = (java.io.File) r0
            if (r0 == 0) goto L37
            goto L46
        L37:
            java.io.File r0 = new java.io.File
            java.lang.String r7 = r7.getPackageName()
            java.lang.String r1 = "/storage/emulated/0/Android/media/"
            java.lang.String r7 = wb.en.g(r1, r7)
            r0.<init>(r7)
        L46:
            java.io.File r7 = new java.io.File
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "Hchat"
            r1.<init>(r0, r2)
            r7.<init>(r1, r8)
            r7.mkdirs()
            return r7
    }
}
