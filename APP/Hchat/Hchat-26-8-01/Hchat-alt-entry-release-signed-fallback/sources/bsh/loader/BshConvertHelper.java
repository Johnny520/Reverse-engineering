package bsh.loader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BshConvertHelper {
    public BshConvertHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    private void appendClassToDex(m4.b r2, o4.a r3, n4.a r4, r4.p r5, java.lang.String r6, byte[] r7) {
            r1 = this;
            k4.b r0 = new k4.b
            r0.<init>(r6, r7)
            k4.d r6 = k4.d.f7166a
            r0.f7158l = r6
            r4.k r2 = oh.h.Y(r2, r0, r3, r4, r5)     // Catch: java.lang.RuntimeException -> L11
            r5.a(r2)
            return
        L11:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "...while processing "
            r3.<init>(r4)
            java.lang.String r4 = r0.f7147a
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            f4.a r2 = f4.a.b(r3, r2)
            throw r2
    }

    private int appendJarToDex(m4.b r11, o4.a r12, n4.a r13, r4.p r14, java.io.InputStream r15) {
            r10 = this;
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream
            r1.<init>(r15)
            r15 = 0
        L6:
            java.util.zip.ZipEntry r0 = r1.getNextEntry()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L42
            boolean r2 = r0.isDirectory()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L13
            goto L6
        L13:
            java.lang.String r8 = r0.getName()     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = ".class"
            boolean r0 = r8.endsWith(r0)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L39
            java.lang.String r0 = "META-INF/"
            boolean r0 = r8.startsWith(r0)     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L39
            byte[] r9 = bsh.loader.DataUtil.readAllBytes(r1)     // Catch: java.lang.Throwable -> L36
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r3.appendClassToDex(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L36
            int r15 = r15 + 1
            goto L3d
        L36:
            r0 = move-exception
            r11 = r0
            goto L46
        L39:
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
        L3d:
            r11 = r4
            r12 = r5
            r13 = r6
            r14 = r7
            goto L6
        L42:
            r1.close()
            return r15
        L46:
            r1.close()     // Catch: java.lang.Throwable -> L4a
            goto L4f
        L4a:
            r0 = move-exception
            r12 = r0
            r11.addSuppressed(r12)
        L4f:
            throw r11
    }

    private byte[] convertAarToDex(java.lang.String r9) {
            r8 = this;
            n4.a r4 = new n4.a
            r4.<init>()
            o4.a r3 = new o4.a
            r3.<init>()
            m4.b r2 = new m4.b
            r2.<init>()
            r4.p r5 = new r4.p
            r5.<init>(r4)
            java.util.zip.ZipInputStream r7 = new java.util.zip.ZipInputStream
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r9)
            r7.<init>(r0)
            r0 = 0
        L1f:
            java.util.zip.ZipEntry r1 = r7.getNextEntry()     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L5c
            boolean r6 = r1.isDirectory()     // Catch: java.lang.Throwable -> L49
            if (r6 == 0) goto L2c
            goto L1f
        L2c:
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L49
            java.lang.String r6 = "classes.jar"
            boolean r6 = r1.equals(r6)     // Catch: java.lang.Throwable -> L49
            if (r6 != 0) goto L4c
            java.lang.String r6 = "libs/"
            boolean r6 = r1.startsWith(r6)     // Catch: java.lang.Throwable -> L49
            if (r6 == 0) goto L1f
            java.lang.String r6 = ".jar"
            boolean r1 = r1.endsWith(r6)     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L1f
            goto L4c
        L49:
            r0 = move-exception
            r9 = r0
            goto L88
        L4c:
            byte[] r1 = bsh.loader.DataUtil.readAllBytes(r7)     // Catch: java.lang.Throwable -> L49
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L49
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L49
            r1 = r8
            int r6 = r1.appendJarToDex(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L49
            int r0 = r0 + r6
            goto L1f
        L5c:
            r7.close()
            if (r0 == 0) goto L7d
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream
            r9.<init>()
            r5.d(r9)     // Catch: java.lang.Throwable -> L71
            byte[] r0 = r9.toByteArray()     // Catch: java.lang.Throwable -> L71
            r9.close()
            return r0
        L71:
            r0 = move-exception
            r1 = r0
            r9.close()     // Catch: java.lang.Throwable -> L77
            goto L7c
        L77:
            r0 = move-exception
            r9 = r0
            r1.addSuppressed(r9)
        L7c:
            throw r1
        L7d:
            java.lang.String r0 = "No class file found in aar "
            java.lang.String r9 = wb.en.g(r0, r9)
            j8.o.y(r9)
            r9 = 0
            return r9
        L88:
            r7.close()     // Catch: java.lang.Throwable -> L8c
            goto L90
        L8c:
            r0 = move-exception
            r9.addSuppressed(r0)
        L90:
            throw r9
    }

    private byte[] convertClassToDex(java.lang.String r9, byte[] r10) {
            r8 = this;
            n4.a r4 = new n4.a
            r4.<init>()
            o4.a r3 = new o4.a
            r3.<init>()
            m4.b r2 = new m4.b
            r2.<init>()
            r0 = 46
            r1 = 47
            java.lang.String r9 = r9.replace(r0, r1)
            java.lang.String r0 = ".class"
            java.lang.String r6 = bc.e.i(r9, r0)
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream
            r9.<init>()
            r4.p r5 = new r4.p     // Catch: java.lang.Throwable -> L37
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L37
            r1 = r8
            r7 = r10
            r1.appendClassToDex(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L37
            r5.d(r9)     // Catch: java.lang.Throwable -> L37
            byte[] r10 = r9.toByteArray()     // Catch: java.lang.Throwable -> L37
            r9.close()
            return r10
        L37:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L3d
            goto L42
        L3d:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)
        L42:
            throw r10
    }

    private byte[] convertJarToDex(java.lang.String r8) {
            r7 = this;
            n4.a r4 = new n4.a
            r4.<init>()
            o4.a r3 = new o4.a
            r3.<init>()
            m4.b r2 = new m4.b
            r2.<init>()
            r4.p r5 = new r4.p
            r5.<init>(r4)
            java.io.FileInputStream r6 = new java.io.FileInputStream
            r6.<init>(r8)
            r1 = r7
            int r0 = r1.appendJarToDex(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4a
            r6.close()
            if (r0 == 0) goto L3f
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream
            r8.<init>()
            r5.d(r8)     // Catch: java.lang.Throwable -> L33
            byte[] r0 = r8.toByteArray()     // Catch: java.lang.Throwable -> L33
            r8.close()
            return r0
        L33:
            r0 = move-exception
            r1 = r0
            r8.close()     // Catch: java.lang.Throwable -> L39
            goto L3e
        L39:
            r0 = move-exception
            r8 = r0
            r1.addSuppressed(r8)
        L3e:
            throw r1
        L3f:
            java.lang.String r0 = "No class file found in jar "
            java.lang.String r8 = wb.en.g(r0, r8)
            j8.o.y(r8)
            r8 = 0
            return r8
        L4a:
            r0 = move-exception
            r8 = r0
            r6.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r0 = move-exception
            r8.addSuppressed(r0)
        L54:
            throw r8
    }

    public java.lang.ClassLoader convertAarToLoader(java.lang.String r1, java.lang.ClassLoader r2) {
            r0 = this;
            byte[] r1 = r0.convertAarToDex(r1)
            java.lang.ClassLoader r1 = r0.createCustomLoader(r1, r2)
            return r1
    }

    public java.lang.ClassLoader convertClassToLoader(java.lang.String r1, byte[] r2, java.lang.ClassLoader r3) {
            r0 = this;
            byte[] r1 = r0.convertClassToDex(r1, r2)
            java.lang.ClassLoader r1 = r0.createCustomLoader(r1, r3)
            return r1
    }

    public java.lang.ClassLoader convertDexToLoader(java.lang.String r2, java.lang.ClassLoader r3) {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.nio.file.Path r2 = r0.toPath()
            byte[] r2 = java.nio.file.Files.readAllBytes(r2)
            java.lang.ClassLoader r2 = r1.createCustomLoader(r2, r3)
            return r2
    }

    public java.lang.ClassLoader convertJarToLoader(java.lang.String r1, java.lang.ClassLoader r2) {
            r0 = this;
            byte[] r1 = r0.convertJarToDex(r1)
            java.lang.ClassLoader r1 = r0.createCustomLoader(r1, r2)
            return r1
    }

    public java.lang.ClassLoader createCustomLoader(byte[] r2, java.lang.ClassLoader r3) {
            r1 = this;
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            dalvik.system.InMemoryDexClassLoader r0 = new dalvik.system.InMemoryDexClassLoader
            r0.<init>(r2, r3)
            return r0
    }
}
