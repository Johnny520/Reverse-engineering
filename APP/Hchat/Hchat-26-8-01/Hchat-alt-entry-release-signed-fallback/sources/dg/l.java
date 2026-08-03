package dg;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends oh.h {
    public static void Z(java.io.File r3, java.lang.String r4) {
            java.nio.charset.Charset r0 = og.a.f9804a
            r0.getClass()
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r2 = 1
            r1.<init>(r3, r2)
            j0(r1, r4, r0)     // Catch: java.lang.Throwable -> L12
            r1.close()
            return
        L12:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L14
        L14:
            r4 = move-exception
            ig.a.i(r1, r3)
            throw r4
    }

    public static void a0(java.io.File r2, java.io.File r3) {
            r2.getClass()
            boolean r0 = r2.exists()
            if (r0 == 0) goto L5f
            boolean r0 = r3.exists()
            if (r0 == 0) goto L1e
            boolean r0 = r3.delete()
            if (r0 == 0) goto L16
            goto L1e
        L16:
            dg.b r0 = new dg.b
            java.lang.String r1 = "Tried to overwrite the destination, but failed to delete it."
            r0.<init>(r2, r3, r1)
            throw r0
        L1e:
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L33
            boolean r0 = r3.mkdirs()
            if (r0 == 0) goto L2b
            return
        L2b:
            c7.c r0 = new c7.c
            java.lang.String r1 = "Failed to create target directory."
            r0.<init>(r2, r3, r1)
            throw r0
        L33:
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L3c
            r0.mkdirs()
        L3c:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L50
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L50
            g4.a.j(r0, r2)     // Catch: java.lang.Throwable -> L52
            r2.close()     // Catch: java.lang.Throwable -> L50
            r0.close()
            return
        L50:
            r2 = move-exception
            goto L59
        L52:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L54
        L54:
            r1 = move-exception
            ig.a.i(r2, r3)     // Catch: java.lang.Throwable -> L50
            throw r1     // Catch: java.lang.Throwable -> L50
        L59:
            throw r2     // Catch: java.lang.Throwable -> L5a
        L5a:
            r3 = move-exception
            ig.a.i(r0, r2)
            throw r3
        L5f:
            dg.b r3 = new dg.b
            java.lang.String r0 = "The source file doesn't exist."
            r1 = 0
            r3.<init>(r2, r1, r0)
            throw r3
    }

    public static void b0(java.io.File r4) {
            dg.j r0 = new dg.j
            r1 = 0
            dg.k r2 = dg.k.f2256h
            r0.<init>(r4, r2, r1)
            dg.h r4 = new dg.h
            r4.<init>(r0)
            r0 = 1
        Le:
            r1 = r0
        Lf:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r4.next()
            java.io.File r2 = (java.io.File) r2
            boolean r3 = r2.delete()
            if (r3 != 0) goto L27
            boolean r2 = r2.exists()
            if (r2 != 0) goto L2a
        L27:
            if (r1 == 0) goto L2a
            goto Le
        L2a:
            r1 = 0
            goto Lf
        L2c:
            return
    }

    public static java.lang.String c0(java.io.File r2) {
            r2.getClass()
            java.lang.String r2 = r2.getName()
            r2.getClass()
            r0 = 46
            java.lang.String r1 = ""
            java.lang.String r2 = og.m.L0(r2, r0, r1)
            return r2
    }

    public static java.lang.String d0(java.io.File r2) {
            char r0 = java.io.File.separatorChar
            r1 = 47
            java.lang.String r2 = r2.getPath()
            r2.getClass()
            if (r0 == r1) goto L14
            java.lang.String r2 = r2.replace(r0, r1)
            r2.getClass()
        L14:
            return r2
    }

    public static java.lang.String e0(java.io.File r2) {
            java.lang.String r2 = r2.getName()
            r2.getClass()
            java.lang.String r0 = "."
            r1 = 6
            int r0 = og.m.v0(r1, r2, r0)
            r1 = -1
            if (r0 != r1) goto L12
            return r2
        L12:
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
            return r2
    }

    public static final dg.c f0(dg.c r6) {
            dg.c r0 = new dg.c
            java.io.File r1 = r6.f2236a
            java.lang.Object r6 = r6.f2237b
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r6.size()
            r2.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
        L13:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r6.next()
            java.io.File r3 = (java.io.File) r3
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "."
            boolean r5 = gg.l.a(r4, r5)
            if (r5 == 0) goto L2c
            goto L13
        L2c:
            java.lang.String r5 = ".."
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L5b
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L57
            java.lang.Object r4 = tf.m.B1(r2)
            java.io.File r4 = (java.io.File) r4
            java.lang.String r4 = r4.getName()
            boolean r4 = gg.l.a(r4, r5)
            if (r4 != 0) goto L57
            int r3 = r2.size()
            int r3 = r3 + (-1)
            java.lang.Object r3 = r2.remove(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            goto L13
        L57:
            r2.add(r3)
            goto L13
        L5b:
            r2.add(r3)
            goto L13
        L5f:
            r0.<init>(r1, r2)
            return r0
    }

    public static byte[] g0(java.io.File r8) {
            r8.getClass()
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r8)
            long r1 = r8.length()     // Catch: java.lang.Throwable -> L26
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            java.lang.String r4 = "File "
            if (r3 > 0) goto L78
            int r1 = (int) r1
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L26
            r3 = 0
            r5 = r1
            r6 = r3
        L1b:
            if (r5 <= 0) goto L28
            int r7 = r0.read(r2, r6, r5)     // Catch: java.lang.Throwable -> L26
            if (r7 < 0) goto L28
            int r5 = r5 - r7
            int r6 = r6 + r7
            goto L1b
        L26:
            r8 = move-exception
            goto L97
        L28:
            if (r5 <= 0) goto L2f
            byte[] r2 = java.util.Arrays.copyOf(r2, r6)     // Catch: java.lang.Throwable -> L26
            goto L5a
        L2f:
            int r5 = r0.read()     // Catch: java.lang.Throwable -> L26
            r6 = -1
            if (r5 != r6) goto L37
            goto L5a
        L37:
            dg.a r6 = new dg.a     // Catch: java.lang.Throwable -> L26
            r7 = 8193(0x2001, float:1.1481E-41)
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L26
            r6.write(r5)     // Catch: java.lang.Throwable -> L26
            g4.a.j(r0, r6)     // Catch: java.lang.Throwable -> L26
            int r5 = r6.size()     // Catch: java.lang.Throwable -> L26
            int r5 = r5 + r1
            if (r5 < 0) goto L5e
            byte[] r8 = r6.a()     // Catch: java.lang.Throwable -> L26
            byte[] r2 = java.util.Arrays.copyOf(r2, r5)     // Catch: java.lang.Throwable -> L26
            int r4 = r6.size()     // Catch: java.lang.Throwable -> L26
            tf.l.o0(r8, r1, r3, r2, r4)     // Catch: java.lang.Throwable -> L26
        L5a:
            r0.close()
            return r2
        L5e:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r2.<init>()     // Catch: java.lang.Throwable -> L26
            r2.append(r4)     // Catch: java.lang.Throwable -> L26
            r2.append(r8)     // Catch: java.lang.Throwable -> L26
            java.lang.String r8 = " is too big to fit in memory."
            r2.append(r8)     // Catch: java.lang.Throwable -> L26
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L26
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L26
            throw r1     // Catch: java.lang.Throwable -> L26
        L78:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L26
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L26
            r5.append(r8)     // Catch: java.lang.Throwable -> L26
            java.lang.String r8 = " is too big ("
            r5.append(r8)     // Catch: java.lang.Throwable -> L26
            r5.append(r1)     // Catch: java.lang.Throwable -> L26
            java.lang.String r8 = " bytes) to fit in memory."
            r5.append(r8)     // Catch: java.lang.Throwable -> L26
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> L26
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L26
            throw r3     // Catch: java.lang.Throwable -> L26
        L97:
            throw r8     // Catch: java.lang.Throwable -> L98
        L98:
            r1 = move-exception
            ig.a.i(r0, r8)
            throw r1
    }

    public static java.lang.String h0(java.io.File r2, java.nio.charset.Charset r3) {
            r2.getClass()
            r3.getClass()
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.lang.String r2 = r9.e0.e0(r0)     // Catch: java.lang.Throwable -> L18
            r0.close()
            return r2
        L18:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r3 = move-exception
            ig.a.i(r0, r2)
            throw r3
    }

    public static java.io.File i0(java.io.File r11, java.io.File r12) {
            r11.getClass()
            r12.getClass()
            java.io.File r0 = new java.io.File
            dg.c r1 = oh.h.V(r11)
            dg.c r1 = f0(r1)
            java.lang.Object r2 = r1.f2237b
            dg.c r3 = oh.h.V(r12)
            dg.c r3 = f0(r3)
            java.lang.Object r4 = r3.f2237b
            java.io.File r1 = r1.f2236a
            java.io.File r3 = r3.f2236a
            boolean r1 = r1.equals(r3)
            r3 = 0
            if (r1 != 0) goto L28
            goto L8e
        L28:
            int r1 = r4.size()
            int r5 = r2.size()
            int r6 = java.lang.Math.min(r5, r1)
            r7 = 0
        L35:
            if (r7 >= r6) goto L48
            java.lang.Object r8 = r2.get(r7)
            java.lang.Object r9 = r4.get(r7)
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto L48
            int r7 = r7 + 1
            goto L35
        L48:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r8 = r1 + (-1)
            if (r7 > r8) goto L73
        L51:
            java.lang.Object r9 = r4.get(r8)
            java.io.File r9 = (java.io.File) r9
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = ".."
            boolean r9 = gg.l.a(r9, r10)
            if (r9 == 0) goto L64
            goto L8e
        L64:
            r6.append(r10)
            if (r8 == r7) goto L6e
            char r9 = java.io.File.separatorChar
            r6.append(r9)
        L6e:
            if (r8 == r7) goto L73
            int r8 = r8 + (-1)
            goto L51
        L73:
            if (r7 >= r5) goto L8a
            if (r7 >= r1) goto L7c
            char r1 = java.io.File.separatorChar
            r6.append(r1)
        L7c:
            java.util.List r1 = tf.m.q1(r7, r2)
            java.lang.String r2 = java.io.File.separator
            r2.getClass()
            r4 = 124(0x7c, float:1.74E-43)
            tf.m.z1(r1, r6, r2, r3, r4)
        L8a:
            java.lang.String r3 = r6.toString()
        L8e:
            if (r3 == 0) goto L94
            r0.<init>(r3)
            return r0
        L94:
            java.lang.String r0 = " and "
            r1 = 46
            java.lang.String r2 = "this and base files have different roots: "
            ah.a.j(r11, r2, r0, r12, r1)
            r11 = 0
            return r11
    }

    public static final void j0(java.io.FileOutputStream r8, java.lang.String r9, java.nio.charset.Charset r10) {
            int r0 = r9.length()
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r0 >= r1) goto L13
            byte[] r9 = r9.getBytes(r10)
            r9.getClass()
            r8.write(r9)
            return
        L13:
            java.nio.charset.CharsetEncoder r10 = r10.newEncoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r10 = r10.onMalformedInput(r0)
            java.nio.charset.CharsetEncoder r10 = r10.onUnmappableCharacter(r0)
            r0 = 8192(0x2000, float:1.148E-41)
            java.nio.CharBuffer r1 = java.nio.CharBuffer.allocate(r0)
            r10.getClass()
            float r2 = r10.maxBytesPerChar()
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            int r2 = (int) r2
            int r0 = r0 * r2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r0.getClass()
            r2 = 0
            r3 = r2
            r4 = r3
        L40:
            int r5 = r9.length()
            if (r3 >= r5) goto La0
            int r5 = 8192 - r4
            int r6 = r9.length()
            int r6 = r6 - r3
            int r5 = java.lang.Math.min(r5, r6)
            int r6 = r3 + r5
            char[] r7 = r1.array()
            r7.getClass()
            r9.getChars(r3, r6, r7, r4)
            int r5 = r5 + r4
            r1.limit(r5)
            int r3 = r9.length()
            r4 = 1
            if (r6 != r3) goto L6a
            r3 = r4
            goto L6b
        L6a:
            r3 = r2
        L6b:
            java.nio.charset.CoderResult r3 = r10.encode(r1, r0, r3)
            boolean r3 = r3.isUnderflow()
            if (r3 == 0) goto L9b
            byte[] r3 = r0.array()
            int r5 = r0.position()
            r8.write(r3, r2, r5)
            int r3 = r1.position()
            int r5 = r1.limit()
            if (r3 == r5) goto L92
            char r3 = r1.get()
            r1.put(r2, r3)
            goto L93
        L92:
            r4 = r2
        L93:
            r1.clear()
            r0.clear()
            r3 = r6
            goto L40
        L9b:
            java.lang.String r8 = "Check failed."
            j8.o.A(r8)
        La0:
            return
    }
}
