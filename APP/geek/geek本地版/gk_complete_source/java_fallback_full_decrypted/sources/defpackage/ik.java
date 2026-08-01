package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ik extends defpackage.a80 {
    public static void K(java.io.File r2, java.io.File r3) {
            boolean r0 = r2.exists()
            if (r0 == 0) goto L5c
            boolean r0 = r3.exists()
            if (r0 == 0) goto L1b
            boolean r0 = r3.delete()
            if (r0 == 0) goto L13
            goto L1b
        L13:
            xj r0 = new xj
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
            ak r0 = new ak
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
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4d
            defpackage.ff.m(r0, r2)     // Catch: java.lang.Throwable -> L4f
            r2.close()     // Catch: java.lang.Throwable -> L4d
            r0.close()
            return
        L4d:
            r2 = move-exception
            goto L56
        L4f:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L51
        L51:
            r1 = move-exception
            defpackage.ff.j(r2, r3)     // Catch: java.lang.Throwable -> L4d
            throw r1     // Catch: java.lang.Throwable -> L4d
        L56:
            throw r2     // Catch: java.lang.Throwable -> L57
        L57:
            r3 = move-exception
            defpackage.ff.j(r0, r2)
            throw r3
        L5c:
            xj r3 = new xj
            java.lang.String r0 = "The source file doesn't exist."
            r1 = 0
            r3.<init>(r2, r1, r0)
            throw r3
    }
}
