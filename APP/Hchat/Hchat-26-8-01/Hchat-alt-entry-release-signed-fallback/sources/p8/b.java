package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p8.b f10312a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.nio.charset.Charset f10313b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.List f10314c = null;

    static {
            p8.b r0 = new p8.b
            r0.<init>()
            p8.b.f10312a = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            p8.b.f10313b = r0
            og.k r0 = new og.k
            java.lang.String r1 = "(?:GCamera|Camera):(?:MicroVideoOffset|MotionPhotoOffset)\\s*=\\s*[\"'](\\d+)[\"']"
            r0.<init>(r1)
            og.k r1 = new og.k
            java.lang.String r2 = "<(?:GCamera|Camera):(?:MicroVideoOffset|MotionPhotoOffset)>\\s*(\\d+)\\s*</"
            r1.<init>(r2)
            og.k r2 = new og.k
            java.lang.String r3 = "(?:Item|GContainerItem):Length\\s*=\\s*[\"'](\\d+)[\"'][^>]{0,1024}(?:Item|GContainerItem):Semantic\\s*=\\s*[\"'](?:MotionPhoto|MicroVideo)[\"']"
            r4 = 0
            r2.<init>(r3, r4)
            og.k r3 = new og.k
            java.lang.String r5 = "(?:Item|GContainerItem):Semantic\\s*=\\s*[\"'](?:MotionPhoto|MicroVideo)[\"'][^>]{0,1024}(?:Item|GContainerItem):Length\\s*=\\s*[\"'](\\d+)[\"']"
            r3.<init>(r5, r4)
            og.k[] r0 = new og.k[]{r0, r1, r2, r3}
            java.util.List r0 = a.a.y0(r0)
            p8.b.f10314c = r0
            return
    }

    public static java.lang.String a(java.io.File r8, p8.a r9) {
            java.lang.String r0 = r8.getAbsolutePath()
            long r1 = r8.length()
            long r3 = r8.lastModified()
            long r5 = r9.f10308a
            long r8 = r9.f10309b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r0 = "|"
            r7.append(r0)
            r7.append(r1)
            r7.append(r0)
            r7.append(r3)
            j8.b.s(r7, r0, r5, r0)
            r7.append(r8)
            java.lang.String r8 = r7.toString()
            java.lang.String r9 = "SHA-256"
            java.security.MessageDigest r9 = java.security.MessageDigest.getInstance(r9)     // Catch: java.lang.Throwable -> L84
            java.nio.charset.Charset r0 = og.a.f9804a     // Catch: java.lang.Throwable -> L84
            byte[] r0 = r8.getBytes(r0)     // Catch: java.lang.Throwable -> L84
            r0.getClass()     // Catch: java.lang.Throwable -> L84
            byte[] r9 = r9.digest(r0)     // Catch: java.lang.Throwable -> L84
            r9.getClass()     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r1.<init>()     // Catch: java.lang.Throwable -> L84
            r1.append(r0)     // Catch: java.lang.Throwable -> L84
            int r2 = r9.length     // Catch: java.lang.Throwable -> L84
            r3 = 0
            r4 = r3
        L53:
            if (r3 >= r2) goto L76
            r5 = r9[r3]     // Catch: java.lang.Throwable -> L84
            r6 = 1
            int r4 = r4 + r6
            if (r4 <= r6) goto L5e
            r1.append(r0)     // Catch: java.lang.Throwable -> L84
        L5e:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)     // Catch: java.lang.Throwable -> L84
            java.lang.String r7 = "%02x"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L84
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = java.lang.String.format(r7, r5)     // Catch: java.lang.Throwable -> L84
            r1.append(r5)     // Catch: java.lang.Throwable -> L84
            int r3 = r3 + 1
            goto L53
        L76:
            r1.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> L84
            r0 = 24
            java.lang.String r9 = og.m.P0(r0, r9)     // Catch: java.lang.Throwable -> L84
            goto L8b
        L84:
            r9 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r9)
            r9 = r0
        L8b:
            int r8 = r8.hashCode()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            boolean r0 = r9 instanceof sf.f
            if (r0 == 0) goto L98
            r9 = r8
        L98:
            java.lang.String r9 = (java.lang.String) r9
            return r9
    }

    public static java.lang.String b(java.io.File r1) {
            java.lang.String r1 = dg.l.c0(r1)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            r1.getClass()
            int r0 = r1.hashCode()
            switch(r0) {
                case 111145: goto L39;
                case 3006482: goto L30;
                case 3198679: goto L27;
                case 3198682: goto L1e;
                case 3645340: goto L15;
                default: goto L14;
            }
        L14:
            goto L41
        L15:
            java.lang.String r0 = "webp"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L43
            goto L41
        L1e:
            java.lang.String r0 = "heif"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L43
            goto L41
        L27:
            java.lang.String r0 = "heic"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L43
            goto L41
        L30:
            java.lang.String r0 = "avif"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L43
            goto L41
        L39:
            java.lang.String r0 = "png"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L43
        L41:
            java.lang.String r1 = "jpg"
        L43:
            return r1
    }

    public static boolean c(java.io.File r2) {
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "r"
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L2a
            int r2 = r0.readUnsignedByte()     // Catch: java.lang.Throwable -> L19
            r1 = 255(0xff, float:3.57E-43)
            if (r2 != r1) goto L1b
            int r2 = r0.readUnsignedByte()     // Catch: java.lang.Throwable -> L19
            r1 = 216(0xd8, float:3.03E-43)
            if (r2 != r1) goto L1b
            r2 = 1
            goto L1c
        L19:
            r2 = move-exception
            goto L24
        L1b:
            r2 = 0
        L1c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L19
            r0.close()     // Catch: java.lang.Throwable -> L2a
            goto L31
        L24:
            throw r2     // Catch: java.lang.Throwable -> L25
        L25:
            r1 = move-exception
            ig.a.i(r0, r2)     // Catch: java.lang.Throwable -> L2a
            throw r1     // Catch: java.lang.Throwable -> L2a
        L2a:
            r2 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        L31:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r2 instanceof sf.f
            if (r1 == 0) goto L38
            r2 = r0
        L38:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    public static p8.a d(java.io.RandomAccessFile r26, long r27, long r29) {
            r0 = r26
            r1 = r29
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto Lec
            r5 = 8
            long r7 = r1 + r5
            int r7 = (r7 > r27 ? 1 : (r7 == r27 ? 0 : -1))
            if (r7 <= 0) goto L14
            goto Lec
        L14:
            r8 = r1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L19:
            long r14 = r8 + r5
            int r14 = (r14 > r27 ? 1 : (r14 == r27 ? 0 : -1))
            if (r14 > 0) goto Ldc
            int r14 = r10 + 1
            r15 = 10000(0x2710, float:1.4013E-41)
            if (r10 >= r15) goto Ldc
            r0.seek(r8)
            int r10 = r0.readInt()
            r15 = r3
            long r3 = (long) r10
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r17
            r10 = 4
            byte[] r5 = new byte[r10]
            r0.readFully(r5)
            r6 = 0
        L3c:
            r19 = 1
            if (r6 >= r10) goto L57
            r7 = r5[r6]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r10 = 32
            if (r10 > r7) goto L4d
            r10 = 127(0x7f, float:1.78E-43)
            if (r7 >= r10) goto L4d
            goto L4f
        L4d:
            r19 = 0
        L4f:
            if (r19 != 0) goto L53
            goto Ldc
        L53:
            int r6 = r6 + 1
            r10 = 4
            goto L3c
        L57:
            int r6 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            r20 = 16
            r22 = 1
            if (r6 != 0) goto L62
            long r24 = r27 - r8
            goto L73
        L62:
            int r7 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r7 != 0) goto L71
            long r24 = r8 + r20
            int r7 = (r24 > r27 ? 1 : (r24 == r27 ? 0 : -1))
            if (r7 > 0) goto Lec
            long r24 = r0.readLong()
            goto L73
        L71:
            r24 = r3
        L73:
            int r3 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r3 != 0) goto L78
            goto L7a
        L78:
            r20 = 8
        L7a:
            int r3 = (r24 > r20 ? 1 : (r24 == r20 ? 0 : -1))
            if (r3 < 0) goto Ldc
            long r3 = r27 - r8
            int r3 = (r24 > r3 ? 1 : (r24 == r3 ? 0 : -1))
            if (r3 <= 0) goto L85
            goto Ldc
        L85:
            java.nio.charset.Charset r3 = p8.b.f10313b
            r3.getClass()
            java.lang.String r4 = new java.lang.String
            r4.<init>(r5, r3)
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            java.lang.String r5 = "ftyp"
            if (r3 != 0) goto L9c
            boolean r3 = r4.equals(r5)
            if (r3 != 0) goto L9c
            goto Lec
        L9c:
            int r3 = r4.hashCode()
            r7 = 3154021(0x302065, float:4.419725E-39)
            if (r3 == r7) goto Lc8
            r5 = 3346442(0x33100a, float:4.689364E-39)
            if (r3 == r5) goto Lbc
            r5 = 3357449(0x333b09, float:4.704788E-39)
            if (r3 == r5) goto Lb0
            goto Ld1
        Lb0:
            java.lang.String r3 = "moov"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto Lb9
            goto Ld1
        Lb9:
            r13 = r19
            goto Ld1
        Lbc:
            java.lang.String r3 = "mdat"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto Lc5
            goto Ld1
        Lc5:
            r12 = r19
            goto Ld1
        Lc8:
            boolean r3 = r4.equals(r5)
            if (r3 != 0) goto Lcf
            goto Ld1
        Lcf:
            r11 = r19
        Ld1:
            long r8 = r8 + r24
            if (r6 != 0) goto Ld6
            goto Ldc
        Ld6:
            r10 = r14
            r3 = r15
            r5 = 8
            goto L19
        Ldc:
            if (r11 == 0) goto Lec
            if (r12 == 0) goto Lec
            if (r13 == 0) goto Lec
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lec
            p8.a r0 = new p8.a
            r0.<init>(r1, r8)
            return r0
        Lec:
            r0 = 0
            return r0
    }

    public static boolean e(java.io.File r7, java.io.File r8, long r9, long r11) {
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r3 = 0
            if (r2 > 0) goto L8
            return r3
        L8:
            boolean r2 = r8.isFile()
            if (r2 == 0) goto L18
            long r4 = r8.length()
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 != 0) goto L18
            r7 = 1
            return r7
        L18:
            java.io.File r2 = new java.io.File
            java.io.File r4 = r8.getParentFile()
            java.lang.String r5 = r8.getName()
            java.lang.String r6 = ".tmp"
            java.lang.String r5 = bc.e.i(r5, r6)
            r2.<init>(r4, r5)
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L80
            java.lang.String r5 = "r"
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L80
            r4.seek(r9)     // Catch: java.lang.Throwable -> L93
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L93
            r7.<init>(r2, r3)     // Catch: java.lang.Throwable -> L93
            r9 = 262144(0x40000, float:3.67342E-40)
            byte[] r10 = new byte[r9]     // Catch: java.lang.Throwable -> L54
        L3e:
            int r5 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r5 <= 0) goto L5e
            long r5 = (long) r9     // Catch: java.lang.Throwable -> L54
            long r5 = java.lang.Math.min(r5, r11)     // Catch: java.lang.Throwable -> L54
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L54
            int r5 = r4.read(r10, r3, r5)     // Catch: java.lang.Throwable -> L54
            if (r5 <= 0) goto L56
            r7.write(r10, r3, r5)     // Catch: java.lang.Throwable -> L54
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L54
            long r11 = r11 - r5
            goto L3e
        L54:
            r8 = move-exception
            goto L95
        L56:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L54
            java.lang.String r9 = "unexpected end of source"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L54
            throw r8     // Catch: java.lang.Throwable -> L54
        L5e:
            java.io.FileDescriptor r9 = r7.getFD()     // Catch: java.lang.Throwable -> L54
            r9.sync()     // Catch: java.lang.Throwable -> L54
            r7.close()     // Catch: java.lang.Throwable -> L93
            r4.close()     // Catch: java.lang.Throwable -> L80
            boolean r7 = r8.exists()     // Catch: java.lang.Throwable -> L80
            if (r7 == 0) goto L82
            boolean r7 = r8.delete()     // Catch: java.lang.Throwable -> L80
            if (r7 == 0) goto L78
            goto L82
        L78:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L80
            java.lang.String r8 = "cannot replace cache file"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L80
            throw r7     // Catch: java.lang.Throwable -> L80
        L80:
            r7 = move-exception
            goto La1
        L82:
            boolean r7 = r2.renameTo(r8)     // Catch: java.lang.Throwable -> L80
            if (r7 == 0) goto L8b
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L80
            goto La7
        L8b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L80
            java.lang.String r8 = "cannot finalize cache file"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L80
            throw r7     // Catch: java.lang.Throwable -> L80
        L93:
            r7 = move-exception
            goto L9b
        L95:
            throw r8     // Catch: java.lang.Throwable -> L96
        L96:
            r9 = move-exception
            ig.a.i(r7, r8)     // Catch: java.lang.Throwable -> L93
            throw r9     // Catch: java.lang.Throwable -> L93
        L9b:
            throw r7     // Catch: java.lang.Throwable -> L9c
        L9c:
            r8 = move-exception
            ig.a.i(r4, r7)     // Catch: java.lang.Throwable -> L80
            throw r8     // Catch: java.lang.Throwable -> L80
        La1:
            sf.f r8 = new sf.f
            r8.<init>(r7)
            r7 = r8
        La7:
            java.lang.Throwable r8 = sf.g.b(r7)
            if (r8 != 0) goto Lae
            goto Lb3
        Lae:
            r2.delete()
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        Lb3:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
    }
}
