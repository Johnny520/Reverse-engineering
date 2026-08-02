package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Locale;
import me.dartcv.nuke.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cm1 {
    public static final byte[] a = {78, 75, 83, 73, 71, 49, 0, 0};
    public static final byte[] b;
    public static final byte[] c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Charset charset = StandardCharsets.US_ASCII;
        b = "NKSIG-PTLOAD-V1\u0000".getBytes(charset);
        c = "NKSIG-IMAGE-V2\u0000".getBytes(charset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] a(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(b);
        for (int i = 0; i < 8; i++) {
            byteArrayOutputStream.write((int) ((j >>> (i * 8)) & 255));
        }
        byteArrayOutputStream.write(bArr);
        l(byteArrayOutputStream, bArr2.length);
        l(byteArrayOutputStream, bArr3.length);
        byteArrayOutputStream.write(bArr2);
        byteArrayOutputStream.write(bArr3);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(byte[] bArr) {
        if (bArr.length < 64 || bArr[0] != 127 || bArr[1] != 69 || bArr[2] != 76 || bArr[3] != 70) {
            c80.x("Native SO is not an ELF file");
        } else {
            if (bArr[4] == 2 && bArr[5] == 1) {
                return;
            }
            c80.x("Native SO must be little-endian ELF64");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int c(long j, long j2, byte[] bArr) {
        if (j >= 0 && j2 >= 0 && j2 <= 2147483647L && j <= ((long) bArr.length) - j2) {
            return (int) j;
        }
        c80.x("Native SO metadata is out of range");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static bm1 d(byte[] bArr) {
        bm1 bm1Var;
        String str;
        b(bArr);
        long jI = i(40, bArr);
        int iG = g(58, bArr);
        int iG2 = g(60, bArr);
        int iG3 = g(62, bArr);
        if (jI <= 0 || iG < 64 || iG2 <= 0 || iG3 >= iG2) {
            c80.x("Native SO section table is unavailable");
            return null;
        }
        long j = iG;
        int iC = c((((long) iG3) * j) + jI, j, bArr);
        long jI2 = i(iC + 24, bArr);
        long jI3 = i(iC + 32, bArr);
        int iC2 = c(jI2, jI3, bArr);
        int i = ((int) jI3) + iC2;
        for (int i2 = 0; i2 < iG2; i2++) {
            int iC3 = c((((long) i2) * j) + jI, j, bArr);
            int iH = ((int) h(iC3, bArr)) + iC2;
            if (iH < 0 || iH >= i || i > bArr.length) {
                bm1Var = null;
                str = "";
            } else {
                int i3 = iH;
                while (i3 < i && bArr[i3] != 0) {
                    i3++;
                }
                bm1Var = null;
                str = new String(bArr, iH, i3 - iH, StandardCharsets.UTF_8);
            }
            if (".note.nksig".equals(str)) {
                long jI4 = i(iC3 + 24, bArr);
                long jI5 = i(iC3 + 32, bArr);
                int iC4 = c(jI4, jI5, bArr);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, iC4, ((int) jI5) + iC4);
                if (bArrCopyOfRange.length >= 68 && bArrCopyOfRange.length >= 8) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if (bArrCopyOfRange[i4] == a[i4]) {
                        }
                    }
                    if (((int) h(8, bArrCopyOfRange)) != 1) {
                        c80.x("Native SO signature version is unsupported");
                        return bm1Var;
                    }
                    long jI6 = i(12, bArrCopyOfRange);
                    byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrCopyOfRange, 20, 52);
                    int iH2 = (int) h(52, bArrCopyOfRange);
                    int iH3 = (int) h(56, bArrCopyOfRange);
                    int iH4 = (int) h(60, bArrCopyOfRange);
                    int iH5 = (int) h(64, bArrCopyOfRange);
                    int i5 = iH2 + 68;
                    int i6 = i5 + iH3;
                    int i7 = i6 + iH4;
                    int i8 = i7 + iH5;
                    if (iH2 <= 0 || iH3 <= 0 || iH4 <= 0 || iH5 <= 0 || i8 != bArrCopyOfRange.length) {
                        c80.x("Native SO signature envelope length mismatch");
                        return bm1Var;
                    }
                    byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArrCopyOfRange, 68, i5);
                    byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArrCopyOfRange, i5, i6);
                    Charset charset = StandardCharsets.UTF_8;
                    return new bm1(jI6, bArrCopyOfRange2, bArrCopyOfRange3, bArrCopyOfRange4, new String(bArrCopyOfRange, i6, iH4, charset), new String(bArrCopyOfRange, i7, iH5, charset));
                }
                c80.x("Native SO signature envelope is invalid");
                return bm1Var;
            }
        }
        c80.x("Native SO signature section missing");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String e(byte[] bArr) {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr);
        StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
        for (byte b2 : bArrDigest) {
            sb.append(String.format(Locale.US, "%02x", Integer.valueOf(b2 & 255)));
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] f(byte[] bArr) throws NoSuchAlgorithmException {
        b(bArr);
        long jI = i(32, bArr);
        int iG = g(54, bArr);
        int iG2 = g(56, bArr);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(c);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 64);
        m(bArrCopyOfRange);
        messageDigest.update(bArrCopyOfRange);
        long j = iG;
        messageDigest.update(bArr, c(jI, ((long) iG2) * j, bArr), iG * iG2);
        int i = 0;
        for (int i2 = 0; i2 < iG2; i2++) {
            int iC = c((((long) i2) * j) + jI, j, bArr);
            if (((int) h(iC, bArr)) == 1) {
                long jI2 = i(iC + 8, bArr);
                long jI3 = i(iC + 32, bArr);
                int iC2 = c(jI2, jI3, bArr);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, iC2, ((int) jI3) + iC2);
                if (jI2 == 0 && jI3 >= 64) {
                    m(bArrCopyOfRange2);
                }
                messageDigest.update(bArrCopyOfRange2);
                i++;
            }
        }
        if (i != 0) {
            return messageDigest.digest();
        }
        c80.x("Native SO has no loadable segments");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int g(int i, byte[] bArr) {
        return ByteBuffer.wrap(bArr, i, 2).order(ByteOrder.LITTLE_ENDIAN).getShort() & 65535;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long h(int i, byte[] bArr) {
        return ((long) ByteBuffer.wrap(bArr, i, 4).order(ByteOrder.LITTLE_ENDIAN).getInt()) & 4294967295L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long i(int i, byte[] bArr) {
        return ByteBuffer.wrap(bArr, i, 8).order(ByteOrder.LITTLE_ENDIAN).getLong();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(byte[] bArr, String str) {
        try {
            bm1 bm1VarD = d(bArr);
            String str2 = bm1VarD.f;
            byte[] bArr2 = bm1VarD.b;
            long j = bm1VarD.a;
            if (j <= 0 || j > bArr.length) {
                throw new SecurityException("Native SO signed size is invalid: " + str);
            }
            if (!MessageDigest.isEqual(f(bArr), bArr2)) {
                throw new SecurityException("Native SO load hash mismatch: " + str);
            }
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bm1VarD.c));
            x509Certificate.checkValidity();
            x509Certificate.verify(x509Certificate.getPublicKey());
            String lowerCase = BuildConfig.NUKE_NATIVE_SO_CERT_SHA256.toLowerCase(Locale.US);
            String strE = e(x509Certificate.getEncoded());
            if (!lowerCase.isEmpty() && !lowerCase.equals(strE)) {
                throw new SecurityException("Native SO certificate fingerprint mismatch: " + str);
            }
            String name = x509Certificate.getSubjectX500Principal().getName("RFC2253");
            if (!name.contains("CN=Admilk") || !name.contains("OU=design by Admilk")) {
                throw new SecurityException("Native SO certificate subject mismatch: " + str);
            }
            if (!"design by Admilk".equals(str2)) {
                throw new SecurityException("Native SO signature description mismatch: " + str);
            }
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(x509Certificate.getPublicKey());
            String str3 = bm1VarD.e;
            Charset charset = StandardCharsets.UTF_8;
            signature.update(a(j, bArr2, str3.getBytes(charset), str2.getBytes(charset)));
            if (signature.verify(bm1VarD.d)) {
                return;
            }
            throw new SecurityException("Native SO signature verification failed: " + str);
        } catch (SecurityException e) {
            throw e;
        } catch (Exception e2) {
            throw new SecurityException(vi0.i("Native SO signature check failed: ", str), e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void k(File file) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        fileInputStream.close();
                        j(byteArrayOutputStream.toByteArray(), file.getAbsolutePath());
                        return;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException e) {
            throw new SecurityException("Native SO read failed: " + file, e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void l(ByteArrayOutputStream byteArrayOutputStream, int i) {
        byteArrayOutputStream.write(i & 255);
        byteArrayOutputStream.write((i >>> 8) & 255);
        byteArrayOutputStream.write((i >>> 16) & 255);
        byteArrayOutputStream.write((i >>> 24) & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void m(byte[] bArr) {
        Arrays.fill(bArr, 40, 48, (byte) 0);
        bArr[58] = 0;
        bArr[59] = 0;
        bArr[60] = 0;
        bArr[61] = 0;
        bArr[62] = 0;
        bArr[63] = 0;
    }
}
