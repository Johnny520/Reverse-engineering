package bsh.loader;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class DataUtil {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String bytesToHex(byte[] bArr) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getMd5ByBytes(byte[] bArr) {
        try {
            return bytesToHex(MessageDigest.getInstance("MD5").digest(bArr));
        } catch (Exception e6) {
            System.err.println("[BeanShell] GetMd5ByBytes: " + e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getMd5ByFilePath(String str) {
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
        } catch (Exception e6) {
            System.err.println("[BeanShell] GetMd5ByFilePath: " + e6);
            return null;
        }
        while (true) {
            int i9 = fileInputStream.read(bArr);
            if (i9 == -1) {
                String strBytesToHex = bytesToHex(messageDigest.digest());
                fileInputStream.close();
                return strBytesToHex;
            }
            messageDigest.update(bArr, 0, i9);
            System.err.println("[BeanShell] GetMd5ByFilePath: " + e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] readAllBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i9 = inputStream.read(bArr);
            if (i9 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i9);
        }
    }
}
