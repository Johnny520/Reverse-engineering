package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class s30 extends p000.AbstractC0978xb {
    /* JADX INFO: renamed from: и */
    public static void m5361(java.io.File r2, java.io.File r3) {
            boolean r0 = r2.exists()
            if (r0 == 0) goto L5e
            boolean r0 = r3.exists()
            if (r0 == 0) goto L1b
            boolean r0 = r3.delete()
            if (r0 == 0) goto L13
            goto L1b
        L13:
            i30 r0 = new i30
            java.lang.String r1 = "Tried to overwrite the destination, but failed to delete it."
            r0.<init>(r2, r3, r1)
            throw r0
        L1b:
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L30
            boolean r0 = r3.mkdirs()
            if (r0 == 0) goto L28
            return
        L28:
            k30 r0 = new k30
            java.lang.String r1 = "Failed to create target directory."
            r0.<init>(r2, r3, r1)
            throw r0
        L30:
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L39
            r0.mkdirs()
        L39:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4f
            r3 = 8192(0x2000, float:1.148E-41)
            p000.h62.m2364(r0, r2, r3)     // Catch: java.lang.Throwable -> L51
            r2.close()     // Catch: java.lang.Throwable -> L4f
            r0.close()
            return
        L4f:
            r2 = move-exception
            goto L58
        L51:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L53
        L53:
            r1 = move-exception
            p000.AbstractC0978xb.m6584(r2, r3)     // Catch: java.lang.Throwable -> L4f
            throw r1     // Catch: java.lang.Throwable -> L4f
        L58:
            throw r2     // Catch: java.lang.Throwable -> L59
        L59:
            r3 = move-exception
            p000.AbstractC0978xb.m6584(r0, r2)
            throw r3
        L5e:
            i30 r3 = new i30
            java.lang.String r0 = "The source file doesn't exist."
            r1 = 0
            r3.<init>(r2, r1, r0)
            throw r3
    }

    /* JADX INFO: renamed from: й */
    public static byte[] m5362(java.io.File r8) {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r8)
            long r1 = r8.length()     // Catch: java.lang.Throwable -> L23
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            java.lang.String r4 = "File "
            if (r3 > 0) goto L77
            int r1 = (int) r1
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L23
            r3 = 0
            r5 = r1
            r6 = r3
        L18:
            if (r5 <= 0) goto L25
            int r7 = r0.read(r2, r6, r5)     // Catch: java.lang.Throwable -> L23
            if (r7 < 0) goto L25
            int r5 = r5 - r7
            int r6 = r6 + r7
            goto L18
        L23:
            r8 = move-exception
            goto L96
        L25:
            if (r5 <= 0) goto L2c
            byte[] r2 = java.util.Arrays.copyOf(r2, r6)     // Catch: java.lang.Throwable -> L23
            goto L59
        L2c:
            int r5 = r0.read()     // Catch: java.lang.Throwable -> L23
            r6 = -1
            if (r5 != r6) goto L34
            goto L59
        L34:
            e00 r6 = new e00     // Catch: java.lang.Throwable -> L23
            r7 = 8193(0x2001, float:1.1481E-41)
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L23
            r6.write(r5)     // Catch: java.lang.Throwable -> L23
            r5 = 8192(0x2000, float:1.148E-41)
            p000.h62.m2364(r0, r6, r5)     // Catch: java.lang.Throwable -> L23
            int r5 = r6.size()     // Catch: java.lang.Throwable -> L23
            int r5 = r5 + r1
            if (r5 < 0) goto L5d
            byte[] r8 = r6.m1832()     // Catch: java.lang.Throwable -> L23
            byte[] r2 = java.util.Arrays.copyOf(r2, r5)     // Catch: java.lang.Throwable -> L23
            int r4 = r6.size()     // Catch: java.lang.Throwable -> L23
            p000.AbstractC0312g7.m2236(r8, r2, r1, r3, r4)     // Catch: java.lang.Throwable -> L23
        L59:
            r0.close()
            return r2
        L5d:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L23
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r2.<init>()     // Catch: java.lang.Throwable -> L23
            r2.append(r4)     // Catch: java.lang.Throwable -> L23
            r2.append(r8)     // Catch: java.lang.Throwable -> L23
            java.lang.String r8 = " is too big to fit in memory."
            r2.append(r8)     // Catch: java.lang.Throwable -> L23
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L77:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L23
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L23
            r5.append(r8)     // Catch: java.lang.Throwable -> L23
            java.lang.String r8 = " is too big ("
            r5.append(r8)     // Catch: java.lang.Throwable -> L23
            r5.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r8 = " bytes) to fit in memory."
            r5.append(r8)     // Catch: java.lang.Throwable -> L23
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> L23
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L23
            throw r3     // Catch: java.lang.Throwable -> L23
        L96:
            throw r8     // Catch: java.lang.Throwable -> L97
        L97:
            r1 = move-exception
            p000.AbstractC0978xb.m6584(r0, r8)
            throw r1
    }
}
