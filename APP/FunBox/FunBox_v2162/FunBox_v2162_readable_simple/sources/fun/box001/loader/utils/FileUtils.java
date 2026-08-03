package fun.box001.loader.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public class FileUtils {
    /* JADX INFO: renamed from: a */
    public static void m220a(String r6, String r7) {
        File r0 = new File(r6);
        File r62 = new File(r7);
        int r2 = 0;
        if (r0.isDirectory() == true) goto L5;
        FileInputStream r72 = new FileInputStream(r0);     // Catch: IOException -> L19
        FileOutputStream r02 = new FileOutputStream(r62);     // Catch: IOException -> L19
        byte[] r63 = new byte[1024];     // Catch: IOException -> L19
    L14:
        int r1 = r72.read(r63);     // Catch: IOException -> L19
        if (r1 == (-1)) goto L17;
        r02.write(r63, 0, r1);     // Catch: IOException -> L19
        goto L14
    L17:
        r72.close();     // Catch: IOException -> L19
        r02.close();     // Catch: IOException -> L19
        return;
    L24:
        return;
    L5:
        if (r62.exists() == true) goto L7;
        r62.mkdirs();
    L7:
        File[] r64 = r0.listFiles();
        if (r64 != null) goto L10;
        return;
    L10:
        int r03 = r64.length;
    L11:
        if (r2 >= r03) goto L25;
        File r12 = r64[r2];
        m220a(r12.getAbsolutePath(), r7 + File.separator + r12.getName());
        r2 = r2 + 1;
        goto L11
    }

    /* JADX INFO: renamed from: b */
    public static void m221b(File r5) {
        if (r5 != null) goto L5;
        return;
    L5:
        if (r5.isFile() == false) goto L8;
        r5.delete();
        return;
    L8:
        File[] r0 = r5.listFiles();
        if (r0 != null) goto L11;
        return;
    L11:
        int r1 = r0.length;
        int r2 = 0;
    L12:
        if (r2 >= r1) goto L18;
        File r3 = r0[r2];
        if (r3.isDirectory() == false) goto L16;
        m221b(r3);
    L17:
        r2 = r2 + 1;
        goto L12
    L16:
        r3.delete();
        goto L17
    L18:
        r5.delete();
    }

    /* JADX INFO: renamed from: c */
    public static String m222c(String r7) {
        File r0 = new File(r7);
        if (r0.isFile() == false) goto L19;
        byte[] r2 = new byte[1024];
        MessageDigest r3 = MessageDigest.getInstance("MD5");     // Catch: Exception -> L12
        FileInputStream r4 = new FileInputStream(r0);     // Catch: Exception -> L12
    L7:
        int r5 = r4.read(r2, 0, 1024);     // Catch: Exception -> L12
        if (r5 == (-1)) goto L10;
        r3.update(r2, 0, r5);     // Catch: Exception -> L12
        goto L7
    L10:
        r4.close();     // Catch: Exception -> L12
        return new BigInteger(1, r3.digest()).toString(16).toUpperCase();
    L12:
        e = move-exception;
        e.printStackTrace();
        return null;
    L19:
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static void m223d(String r2, byte[] r3) {
        File r0 = new File(r2);
        File r22 = r0.getParentFile();
        if (r22.exists() == true) goto L10;
        r22.mkdirs();
    L10:
        FileOutputStream r23 = new FileOutputStream(r0);     // Catch: IOException -> L7
        r23.write(r3);     // Catch: IOException -> L7
        r23.close();     // Catch: IOException -> L7
        return;
    L7:
        e = move-exception;
        throw new RuntimeException(e);
    }

    public static byte[] readZipEntry(String r4, String r5) {
        ZipFile r0 = new ZipFile(r4);
        if (r0.getEntry(r5) == null) goto L22;
        ByteArrayOutputStream r1 = new ByteArrayOutputStream();
        ZipInputStream r2 = new ZipInputStream(new FileInputStream(r4));
    L24:
        ZipEntry r42 = r2.getNextEntry();     // Catch: Throwable -> L16
        if (r42 == null) goto L14;
        if (r42.getName().equals(r5) == false) goto L24;
        byte[] r43 = new byte[1024];     // Catch: Throwable -> L16
    L10:
        int r52 = r2.read(r43);     // Catch: Throwable -> L16
        if (r52 <= 0) goto L14;
        r1.write(r43, 0, r52);     // Catch: Throwable -> L16
    L14:
        r2.close();
        r0.close();
        return r1.toByteArray();
    L16:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L19
    L21:
        throw th;
    L19:
        th = move-exception;
        th.addSuppressed(th);
        goto L21
    L22:
        r0.close();
        throw new FileNotFoundException("Entry " + r5 + " not found in " + r4);
    }
}
