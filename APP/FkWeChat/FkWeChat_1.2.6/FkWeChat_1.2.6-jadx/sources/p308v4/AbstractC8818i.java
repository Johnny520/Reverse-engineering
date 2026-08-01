package p308v4;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: v4.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8818i {
    /* JADX INFO: renamed from: a */
    public static String m33819a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString().toUpperCase();
    }

    /* JADX INFO: renamed from: b */
    public static String m33820b(byte[] bArr) {
        try {
            return m33819a(MessageDigest.getInstance("MD5").digest(bArr));
        } catch (Exception e10) {
            System.err.println("[BeanShell] GetMd5ByBytes: " + e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m33821c(String str) {
        FileInputStream fileInputStream;
        MessageDigest messageDigest;
        byte[] bArr;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                messageDigest = MessageDigest.getInstance("MD5");
                bArr = new byte[8192];
            } finally {
            }
        } catch (Exception e10) {
            System.err.println("[BeanShell] GetMd5ByFilePath: " + e10);
            return null;
        }
        while (true) {
            int i10 = fileInputStream.read(bArr);
            if (i10 == -1) {
                String strM33819a = m33819a(messageDigest.digest());
                fileInputStream.close();
                return strM33819a;
            }
            messageDigest.update(bArr, 0, i10);
            System.err.println("[BeanShell] GetMd5ByFilePath: " + e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m33822d(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }
}
