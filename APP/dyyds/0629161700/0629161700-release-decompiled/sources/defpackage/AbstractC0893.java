package defpackage;

/* JADX INFO: renamed from: ᛵᛵᲀᛱ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0893 extends defpackage.AbstractC0729 {
    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public static void m1865(java.io.File r2, java.lang.String r3) {
            java.nio.charset.Charset r0 = defpackage.AbstractC1422.f6221
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r2)
            m1867(r1, r3, r0)     // Catch: java.lang.Throwable -> Le
            r1.close()
            return
        Le:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L10
        L10:
            r3 = move-exception
            defpackage.AbstractC2346.m3845(r1, r2)
            throw r3
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public static void m1866(java.io.File r3, java.io.File r4) {
            boolean r0 = r3.exists()
            if (r0 == 0) goto L6c
            boolean r0 = r4.exists()
            if (r0 == 0) goto L1b
            boolean r0 = r4.delete()
            if (r0 == 0) goto L13
            goto L1b
        L13:
            ᛳᛸᲇᛲ r0 = new ᛳᛸᲇᛲ
            java.lang.String r1 = "Tried to overwrite the destination, but failed to delete it."
            r0.<init>(r3, r4, r1)
            throw r0
        L1b:
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L30
            boolean r0 = r4.mkdirs()
            if (r0 == 0) goto L28
            return
        L28:
            ᛳᛳᛵᛶ r0 = new ᛳᛳᛵᛶ
            java.lang.String r1 = "Failed to create target directory."
            r0.<init>(r3, r4, r1)
            throw r0
        L30:
            java.io.File r0 = r4.getParentFile()
            if (r0 == 0) goto L39
            r0.mkdirs()
        L39:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5d
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L5f
            int r1 = r0.read(r4)     // Catch: java.lang.Throwable -> L5f
        L4b:
            if (r1 < 0) goto L56
            r2 = 0
            r3.write(r4, r2, r1)     // Catch: java.lang.Throwable -> L5f
            int r1 = r0.read(r4)     // Catch: java.lang.Throwable -> L5f
            goto L4b
        L56:
            r3.close()     // Catch: java.lang.Throwable -> L5d
            r0.close()
            return
        L5d:
            r3 = move-exception
            goto L66
        L5f:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L61
        L61:
            r1 = move-exception
            defpackage.AbstractC2346.m3845(r3, r4)     // Catch: java.lang.Throwable -> L5d
            throw r1     // Catch: java.lang.Throwable -> L5d
        L66:
            throw r3     // Catch: java.lang.Throwable -> L67
        L67:
            r4 = move-exception
            defpackage.AbstractC2346.m3845(r0, r3)
            throw r4
        L6c:
            ᛳᛸᲇᛲ r4 = new ᛳᛸᲇᛲ
            java.lang.String r0 = "The source file doesn't exist."
            r1 = 0
            r4.<init>(r3, r1, r0)
            throw r4
    }

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public static final void m1867(java.io.FileOutputStream r8, java.lang.String r9, java.nio.charset.Charset r10) {
            int r0 = r9.length()
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r0 >= r1) goto L10
            byte[] r9 = r9.getBytes(r10)
            r8.write(r9)
            return
        L10:
            java.nio.charset.CharsetEncoder r10 = r10.newEncoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r10 = r10.onMalformedInput(r0)
            java.nio.charset.CharsetEncoder r10 = r10.onUnmappableCharacter(r0)
            r0 = 8192(0x2000, float:1.148E-41)
            java.nio.CharBuffer r1 = java.nio.CharBuffer.allocate(r0)
            float r2 = r10.maxBytesPerChar()
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            int r2 = (int) r2
            int r0 = r0 * r2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r2 = 0
            r3 = r2
            r4 = r3
        L37:
            int r5 = r9.length()
            if (r3 >= r5) goto L94
            int r5 = 8192 - r4
            int r6 = r9.length()
            int r6 = r6 - r3
            int r5 = java.lang.Math.min(r5, r6)
            int r6 = r3 + r5
            char[] r7 = r1.array()
            r9.getChars(r3, r6, r7, r4)
            int r5 = r5 + r4
            r1.limit(r5)
            int r3 = r9.length()
            r4 = 1
            if (r6 != r3) goto L5e
            r3 = r4
            goto L5f
        L5e:
            r3 = r2
        L5f:
            java.nio.charset.CoderResult r3 = r10.encode(r1, r0, r3)
            boolean r3 = r3.isUnderflow()
            if (r3 == 0) goto L8f
            byte[] r3 = r0.array()
            int r5 = r0.position()
            r8.write(r3, r2, r5)
            int r3 = r1.position()
            int r5 = r1.limit()
            if (r3 == r5) goto L86
            char r3 = r1.get()
            r1.put(r2, r3)
            goto L87
        L86:
            r4 = r2
        L87:
            r1.clear()
            r0.clear()
            r3 = r6
            goto L37
        L8f:
            java.lang.String r8 = "Check failed."
            defpackage.C2264.m3676(r8)
        L94:
            return
    }
}
