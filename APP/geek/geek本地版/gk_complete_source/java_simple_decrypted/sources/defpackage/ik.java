package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class ik extends a80 {
    public static void K(File r2, File r3) {
        if (r2.exists() == false) goto L39;
        if (r3.exists() == false) goto L12;
        if (r3.delete() == true) goto L12;
        throw new xj(r2, r3, "Tried to overwrite the destination, but failed to delete it.");
    L12:
        if (r2.isDirectory() == true) goto L14;
        File r0 = r3.getParentFile();
        if (r0 == null) goto L21;
        r0.mkdirs();
    L21:
        FileInputStream r02 = new FileInputStream(r2);
        FileOutputStream r22 = new FileOutputStream(r3);     // Catch: Throwable -> L27
        ff.m(r02, r22);     // Catch: Throwable -> L29
        r22.close();     // Catch: Throwable -> L27
        r02.close();
        return;
    L29:
        th = move-exception;
        throw th;     // Catch: Throwable -> L31
    L31:
        th = move-exception;
        ff.j(r22, th);     // Catch: Throwable -> L27
        throw th;     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        throw th;     // Catch: Throwable -> L35
    L35:
        th = move-exception;
        ff.j(r02, th);
        throw th;
    L14:
        if (r3.mkdirs() == false) goto L17;
        return;
    L17:
        throw new ak(r2, r3, "Failed to create target directory.");
    L39:
        throw new xj(r2, null, "The source file doesn't exist.");
    }
}
