package p000;

/* JADX INFO: loaded from: classes.dex */
public final class n implements java.io.Closeable {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public p000.g0 f809;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.zip.ZipFile f810;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.io.File f811;

    public static class a extends java.lang.RuntimeException {
        public a(java.lang.String r1, java.io.IOException r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public n(java.io.File r6) {
            r5 = this;
            r5.<init>()
            r5.f811 = r6     // Catch: java.io.IOException -> Ld
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> Ld
            r0.<init>(r6)     // Catch: java.io.IOException -> Ld
            r5.f810 = r0     // Catch: java.io.IOException -> Ld
            return
        Ld:
            r0 = move-exception
            ۟.n$a r1 = new ۟.n$a
            r2 = 15
            byte[] r2 = new byte[r2]
            r2 = {x0034: FILL_ARRAY_DATA , data: [-38, 91, -31, 26, 25, 123, -9, 21, -42, 43, 62, 40, -77, 16, -28} // fill-array
            r3 = 6
            byte[] r3 = new byte[r3]
            r3 = {x0040: FILL_ARRAY_DATA , data: [-109, 53, -105, 123, 117, 18} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r3)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.String r6 = r6.getAbsolutePath()
            r3[r4] = r6
            java.lang.String r6 = java.lang.String.format(r2, r3)
            r1.<init>(r6, r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static p000.n m289(java.io.File r1) {
            ۟.n r0 = new ۟.n
            r0.<init>(r1)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            r0 = 0
            r1.f809 = r0
            java.util.zip.ZipFile r0 = r1.f810     // Catch: java.lang.Exception -> L8
            r0.close()     // Catch: java.lang.Exception -> L8
        L8:
            return
    }

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final p000.g0 m290() {
            r14 = this;
            ۟.g0 r0 = r14.f809
            if (r0 != 0) goto L15b
            java.util.zip.ZipFile r0 = r14.f810
            java.util.Enumeration r0 = r0.entries()
        La:
            boolean r1 = r0.hasMoreElements()
            r2 = 6
            r3 = 0
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.nextElement()
            r3 = r1
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3
            boolean r1 = r3.isDirectory()
            if (r1 == 0) goto L20
            goto La
        L20:
            java.lang.String r1 = r3.getName()
            java.lang.String r1 = r1.toUpperCase()
            r4 = 4
            byte[] r5 = new byte[r4]
            r5 = {x015e: FILL_ARRAY_DATA , data: [-127, -67, 18, 70} // fill-array
            byte[] r6 = new byte[r2]
            r6 = {x0164: FILL_ARRAY_DATA , data: [-81, -17, 65, 7, 27, 125} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            boolean r1 = r1.endsWith(r5)
            if (r1 != 0) goto L59
            java.lang.String r1 = r3.getName()
            java.lang.String r1 = r1.toUpperCase()
            byte[] r4 = new byte[r4]
            r4 = {x016c: FILL_ARRAY_DATA , data: [67, 99, -35, 110} // fill-array
            byte[] r5 = new byte[r2]
            r5 = {x0172: FILL_ARRAY_DATA , data: [109, 39, -114, 47, 73, -122} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r5)
            boolean r1 = r1.endsWith(r4)
            if (r1 == 0) goto La
        L59:
            if (r3 == 0) goto L145
            java.util.zip.ZipFile r0 = r14.f810
            java.io.InputStream r0 = r0.getInputStream(r3)
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r1.<init>(r0)
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L140
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L140
            r4.<init>()     // Catch: java.lang.Throwable -> L140
        L6f:
            int r5 = r1.read(r3)     // Catch: java.lang.Throwable -> L140
            r6 = -1
            r7 = 0
            if (r5 == r6) goto L7b
            r4.write(r3, r7, r5)     // Catch: java.lang.Throwable -> L140
            goto L6f
        L7b:
            byte[] r3 = r4.toByteArray()     // Catch: java.lang.Throwable -> L13b
            r4.close()     // Catch: java.lang.Throwable -> L140
            r1.close()
            javax.security.cert.X509Certificate r1 = javax.security.cert.X509Certificate.getInstance(r3)
            ۟.g0$a r3 = new ۟.g0$a
            r3.<init>()
            byte[] r4 = r1.getEncoded()
            r5 = 3
            byte[] r6 = new byte[r5]
            r6 = {x017a: FILL_ARRAY_DATA , data: [-47, -85, 59} // fill-array
            byte[] r8 = new byte[r2]
            r8 = {x0180: FILL_ARRAY_DATA , data: [-100, -17, 14, 67, -54, 1} // fill-array
            java.lang.String r6 = p000.oa.m332(r6, r8)
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r6)     // Catch: java.security.NoSuchAlgorithmException -> L134
            r6.update(r4)
            byte[] r6 = r6.digest()
            java.lang.String r6 = p000.h0.m177(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r9 = r4.length
            r8.<init>(r9)
            int r9 = r4.length
            r10 = r7
        Lb8:
            if (r10 >= r9) goto Ld7
            r11 = r4[r10]
            char r11 = (char) r11
            r11 = r11 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            int r12 = r11.length()
            r13 = 2
            if (r12 >= r13) goto Lcd
            r8.append(r7)
        Lcd:
            java.lang.String r11 = r11.toUpperCase()
            r8.append(r11)
            int r10 = r10 + 1
            goto Lb8
        Ld7:
            java.lang.String r4 = r8.toString()
            byte[] r5 = new byte[r5]
            r5 = {x0188: FILL_ARRAY_DATA , data: [85, -83, 45} // fill-array
            byte[] r7 = new byte[r2]
            r7 = {x018e: FILL_ARRAY_DATA , data: [24, -23, 24, -78, 119, -91} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r7)
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)     // Catch: java.security.NoSuchAlgorithmException -> L12d
            r7 = 5
            byte[] r7 = new byte[r7]
            r7 = {x0196: FILL_ARRAY_DATA , data: [84, -7, 110, 39, 94} // fill-array
            byte[] r2 = new byte[r2]
            r2 = {x019e: FILL_ARRAY_DATA , data: [1, -83, 40, 10, 102, 94} // fill-array
            java.lang.String r2 = p000.oa.m332(r7, r2)
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            byte[] r2 = r4.getBytes(r2)
            r5.update(r2)
            byte[] r2 = r5.digest()
            java.lang.String r2 = p000.h0.m177(r2)
            r3.f388 = r2
            r3.f389 = r6
            r1.getNotBefore()
            r1.getNotAfter()
            java.lang.String r2 = r1.getSigAlgName()
            r3.f387 = r2
            r1.getSigAlgOID()
            ۟.g0 r1 = new ۟.g0
            r1.<init>(r3)
            r14.f809 = r1
            r0.close()
            goto L15b
        L12d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L134:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L13b:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L140
            throw r0     // Catch: java.lang.Throwable -> L140
        L140:
            r0 = move-exception
            r1.close()
            throw r0
        L145:
            java.io.IOException r0 = new java.io.IOException
            r1 = 31
            byte[] r1 = new byte[r1]
            r1 = {x01a6: FILL_ARRAY_DATA , data: [-111, 85, 75, -70, 68, 17, -93, 64, 82, -54, 70, 6, -94, 81, 73, -116, 76, 0, -79, 81, 69, -54, 75, 12, -92, 5, 70, -123, 80, 13, -76} // fill-array
            byte[] r2 = new byte[r2]
            r2 = {x01ba: FILL_ARRAY_DATA , data: [-48, 37, 32, -22, 37, 99} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            r0.<init>(r1)
            throw r0
        L15b:
            ۟.g0 r0 = r14.f809
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public final int m291() {
            r8 = this;
            java.util.zip.ZipFile r0 = r8.f810
            r1 = 20
            byte[] r1 = new byte[r1]
            r1 = {x0052: FILL_ARRAY_DATA , data: [21, -68, 81, -65, -123, -96, 22, -65, 42, -77, -23, -89, 17, -65, 64, -83, -4, -57, 21, -65} // fill-array
            r2 = 6
            byte[] r2 = new byte[r2]
            r2 = {x0060: FILL_ARRAY_DATA , data: [88, -7, 5, -2, -88, -23} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            java.util.zip.ZipEntry r0 = r0.getEntry(r1)
            r1 = 0
            if (r0 != 0) goto L1b
            return r1
        L1b:
            java.util.jar.JarFile r0 = new java.util.jar.JarFile
            java.io.File r2 = r8.f811
            r0.<init>(r2)
            java.util.Enumeration r2 = r0.entries()
            r3 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r3]
        L2a:
            boolean r5 = r2.hasMoreElements()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r2.nextElement()
            java.util.jar.JarEntry r5 = (java.util.jar.JarEntry) r5
            boolean r6 = r5.isDirectory()
            if (r6 == 0) goto L3d
            goto L2a
        L3d:
            java.io.InputStream r5 = r0.getInputStream(r5)     // Catch: java.lang.SecurityException -> L4d
        L41:
            int r6 = r5.read(r4, r1, r3)     // Catch: java.lang.SecurityException -> L4d
            r7 = -1
            if (r6 == r7) goto L49
            goto L41
        L49:
            r5.close()     // Catch: java.lang.SecurityException -> L4d
            goto L2a
        L4d:
            r0 = 1
            return r0
        L4f:
            r0 = 2
            return r0
    }
}
