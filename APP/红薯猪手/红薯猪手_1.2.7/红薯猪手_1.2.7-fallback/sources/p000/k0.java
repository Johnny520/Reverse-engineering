package p000;

/* JADX INFO: loaded from: classes.dex */
public class k0 extends p000.jb {
    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public static void m224(java.io.File r4, java.io.File r5) {
            r0 = 8192(0x2000, float:1.148E-41)
            boolean r1 = r4.exists()
            r2 = 0
            if (r1 == 0) goto L68
            boolean r1 = r5.exists()
            r3 = 0
            if (r1 == 0) goto L1f
            boolean r1 = r5.delete()
            if (r1 == 0) goto L17
            goto L1f
        L17:
            ۟.t2 r0 = new ۟.t2
            java.lang.String r1 = "Tried to overwrite the destination, but failed to delete it."
            r0.<init>(r4, r5, r1, r3)
            throw r0
        L1f:
            boolean r1 = r4.isDirectory()
            if (r1 == 0) goto L34
            boolean r0 = r5.mkdirs()
            if (r0 == 0) goto L2c
            goto L59
        L2c:
            ۟.v2 r0 = new ۟.v2
            java.lang.String r1 = "Failed to create target directory."
            r0.<init>(r4, r5, r1)
            throw r0
        L34:
            java.io.File r1 = r5.getParentFile()
            if (r1 == 0) goto L3d
            r1.mkdirs()
        L3d:
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r4)
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L61
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L61
            byte[] r5 = new byte[r0]     // Catch: java.lang.Throwable -> L5a
        L49:
            int r0 = r1.read(r5)     // Catch: java.lang.Throwable -> L5a
            if (r0 < 0) goto L53
            r4.write(r5, r3, r0)     // Catch: java.lang.Throwable -> L5a
            goto L49
        L53:
            p000.jb.m206(r4, r2)     // Catch: java.lang.Throwable -> L61
            p000.jb.m206(r1, r2)
        L59:
            return
        L5a:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L5c
        L5c:
            r0 = move-exception
            p000.jb.m206(r4, r5)     // Catch: java.lang.Throwable -> L61
            throw r0     // Catch: java.lang.Throwable -> L61
        L61:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L63
        L63:
            r5 = move-exception
            p000.jb.m206(r1, r4)
            throw r5
        L68:
            ۟.t2 r5 = new ۟.t2
            r0 = 1
            java.lang.String r1 = "The source file doesn't exist."
            r5.<init>(r4, r2, r1, r0)
            throw r5
    }
}
