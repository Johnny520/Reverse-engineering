package p001;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* JADX INFO: renamed from: ۟.k0 */
/* JADX INFO: loaded from: classes.dex */
public class C0275k0 extends C0272jb {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public static void m1113(File file, File file2) throws C0424v2 {
        if (!file.exists()) {
            throw new C0398t2(file, null, "The source file doesn't exist.", 1);
        }
        if (file2.exists() && !file2.delete()) {
            throw new C0398t2(file, file2, "Tried to overwrite the destination, but failed to delete it.", 0);
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new C0424v2(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i < 0) {
                        C0272jb.m875(fileOutputStream, null);
                        C0272jb.m875(fileInputStream, null);
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C0272jb.m875(fileInputStream, th);
                throw th2;
            }
        }
    }
}
