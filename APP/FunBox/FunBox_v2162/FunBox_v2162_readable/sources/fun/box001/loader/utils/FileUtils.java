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
    public static void m220a(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str2);
        if (file.isDirectory()) {
            if (!file2.exists()) {
                file2.mkdirs();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file3 : fileArrListFiles) {
                m220a(file3.getAbsolutePath(), str2 + File.separator + file3.getName());
            }
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = fileInputStream.read(bArr);
                if (i2 == -1) {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i2);
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m221b(File file) {
        if (file == null) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m221b(file2);
            } else {
                file2.delete();
            }
        }
        file.delete();
    }

    /* JADX INFO: renamed from: c */
    public static String m222c(String str) {
        File file = new File(str);
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int i2 = fileInputStream.read(bArr, 0, 1024);
                if (i2 == -1) {
                    fileInputStream.close();
                    return new BigInteger(1, messageDigest.digest()).toString(16).toUpperCase();
                }
                messageDigest.update(bArr, 0, i2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m223d(String str, byte[] bArr) {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r5 = r2.read(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r5 <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r1.write(r4, 0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r4 = new byte[1024];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] readZipEntry(String str, String str2) throws IOException {
        ZipFile zipFile = new ZipFile(str);
        if (zipFile.getEntry(str2) == null) {
            zipFile.close();
            throw new FileNotFoundException("Entry " + str2 + " not found in " + str);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                if (nextEntry.getName().equals(str2)) {
                    break;
                }
            } catch (Throwable th) {
                try {
                    zipInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        zipInputStream.close();
        zipFile.close();
        return byteArrayOutputStream.toByteArray();
    }
}
