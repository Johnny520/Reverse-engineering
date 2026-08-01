package p113W3;

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

/* JADX INFO: renamed from: W3.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1611d {

    /* JADX INFO: renamed from: a */
    public static final byte[] f5550a = {78, 75, 83, 73, 71, 49, 0, 0};

    /* JADX INFO: renamed from: b */
    public static final byte[] f5551b;

    /* JADX INFO: renamed from: c */
    public static final byte[] f5552c;

    static {
        Charset charset = StandardCharsets.US_ASCII;
        f5551b = "NKSIG-PTLOAD-V1\u0000".getBytes(charset);
        f5552c = "NKSIG-IMAGE-V2\u0000".getBytes(charset);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m2864a(long j5, byte[] bArr, byte[] bArr2, byte[] bArr3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(f5551b);
        for (int i5 = 0; i5 < 8; i5++) {
            byteArrayOutputStream.write((int) ((j5 >>> (i5 * 8)) & 255));
        }
        byteArrayOutputStream.write(bArr);
        m2875l(byteArrayOutputStream, bArr2.length);
        m2875l(byteArrayOutputStream, bArr3.length);
        byteArrayOutputStream.write(bArr2);
        byteArrayOutputStream.write(bArr3);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: b */
    public static void m2865b(byte[] bArr) {
        if (bArr.length < 64 || bArr[0] != 127 || bArr[1] != 69 || bArr[2] != 76 || bArr[3] != 70) {
            throw new SecurityException("Native SO is not an ELF file");
        }
        if (bArr[4] != 2 || bArr[5] != 1) {
            throw new SecurityException("Native SO must be little-endian ELF64");
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m2866c(byte[] bArr, long j5, long j6) {
        if (j5 < 0 || j6 < 0 || j6 > 2147483647L || j5 > ((long) bArr.length) - j6) {
            throw new SecurityException("Native SO metadata is out of range");
        }
        return (int) j5;
    }

    /* JADX INFO: renamed from: d */
    public static C1610c m2867d(byte[] bArr) {
        String str;
        m2865b(bArr);
        long jM2872i = m2872i(40, bArr);
        int iM2870g = m2870g(58, bArr);
        int iM2870g2 = m2870g(60, bArr);
        int iM2870g3 = m2870g(62, bArr);
        if (jM2872i <= 0 || iM2870g < 64 || iM2870g2 <= 0 || iM2870g3 >= iM2870g2) {
            throw new SecurityException("Native SO section table is unavailable");
        }
        long j5 = iM2870g;
        int iM2866c = m2866c(bArr, (((long) iM2870g3) * j5) + jM2872i, j5);
        long jM2872i2 = m2872i(iM2866c + 24, bArr);
        long jM2872i3 = m2872i(iM2866c + 32, bArr);
        int iM2866c2 = m2866c(bArr, jM2872i2, jM2872i3);
        int i5 = ((int) jM2872i3) + iM2866c2;
        for (int i6 = 0; i6 < iM2870g2; i6++) {
            int iM2866c3 = m2866c(bArr, (((long) i6) * j5) + jM2872i, j5);
            int iM2871h = ((int) m2871h(iM2866c3, bArr)) + iM2866c2;
            if (iM2871h < 0 || iM2871h >= i5 || i5 > bArr.length) {
                str = "";
            } else {
                int i7 = iM2871h;
                while (i7 < i5 && bArr[i7] != 0) {
                    i7++;
                }
                str = new String(bArr, iM2871h, i7 - iM2871h, StandardCharsets.UTF_8);
            }
            if (".note.nksig".equals(str)) {
                long jM2872i4 = m2872i(iM2866c3 + 24, bArr);
                long jM2872i5 = m2872i(iM2866c3 + 32, bArr);
                int iM2866c4 = m2866c(bArr, jM2872i4, jM2872i5);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, iM2866c4, ((int) jM2872i5) + iM2866c4);
                if (bArrCopyOfRange.length >= 68 && bArrCopyOfRange.length >= 8) {
                    for (int i8 = 0; i8 < 8; i8++) {
                        if (bArrCopyOfRange[i8] == f5550a[i8]) {
                        }
                    }
                    if (((int) m2871h(8, bArrCopyOfRange)) != 1) {
                        throw new SecurityException("Native SO signature version is unsupported");
                    }
                    long jM2872i6 = m2872i(12, bArrCopyOfRange);
                    byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrCopyOfRange, 20, 52);
                    int iM2871h2 = (int) m2871h(52, bArrCopyOfRange);
                    int iM2871h3 = (int) m2871h(56, bArrCopyOfRange);
                    int iM2871h4 = (int) m2871h(60, bArrCopyOfRange);
                    int iM2871h5 = (int) m2871h(64, bArrCopyOfRange);
                    int i9 = iM2871h2 + 68;
                    int i10 = i9 + iM2871h3;
                    int i11 = i10 + iM2871h4;
                    int i12 = i11 + iM2871h5;
                    if (iM2871h2 <= 0 || iM2871h3 <= 0 || iM2871h4 <= 0 || iM2871h5 <= 0 || i12 != bArrCopyOfRange.length) {
                        throw new SecurityException("Native SO signature envelope length mismatch");
                    }
                    byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArrCopyOfRange, 68, i9);
                    byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArrCopyOfRange, i9, i10);
                    Charset charset = StandardCharsets.UTF_8;
                    return new C1610c(jM2872i6, bArrCopyOfRange2, bArrCopyOfRange3, bArrCopyOfRange4, new String(bArrCopyOfRange, i10, iM2871h4, charset), new String(bArrCopyOfRange, i11, iM2871h5, charset));
                }
                throw new SecurityException("Native SO signature envelope is invalid");
            }
        }
        throw new SecurityException("Native SO signature section missing");
    }

    /* JADX INFO: renamed from: e */
    public static String m2868e(byte[] bArr) {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr);
        StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
        for (byte b2 : bArrDigest) {
            sb.append(String.format(Locale.US, "%02x", Integer.valueOf(b2 & 255)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m2869f(byte[] bArr) throws NoSuchAlgorithmException {
        m2865b(bArr);
        long jM2872i = m2872i(32, bArr);
        int iM2870g = m2870g(54, bArr);
        int iM2870g2 = m2870g(56, bArr);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(f5552c);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 64);
        m2876m(bArrCopyOfRange);
        messageDigest.update(bArrCopyOfRange);
        long j5 = iM2870g;
        messageDigest.update(bArr, m2866c(bArr, jM2872i, ((long) iM2870g2) * j5), iM2870g * iM2870g2);
        int i5 = 0;
        for (int i6 = 0; i6 < iM2870g2; i6++) {
            int iM2866c = m2866c(bArr, (((long) i6) * j5) + jM2872i, j5);
            if (((int) m2871h(iM2866c, bArr)) == 1) {
                long jM2872i2 = m2872i(iM2866c + 8, bArr);
                long jM2872i3 = m2872i(iM2866c + 32, bArr);
                int iM2866c2 = m2866c(bArr, jM2872i2, jM2872i3);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, iM2866c2, ((int) jM2872i3) + iM2866c2);
                if (jM2872i2 == 0 && jM2872i3 >= 64) {
                    m2876m(bArrCopyOfRange2);
                }
                messageDigest.update(bArrCopyOfRange2);
                i5++;
            }
        }
        if (i5 != 0) {
            return messageDigest.digest();
        }
        throw new SecurityException("Native SO has no loadable segments");
    }

    /* JADX INFO: renamed from: g */
    public static int m2870g(int i5, byte[] bArr) {
        return ByteBuffer.wrap(bArr, i5, 2).order(ByteOrder.LITTLE_ENDIAN).getShort() & 65535;
    }

    /* JADX INFO: renamed from: h */
    public static long m2871h(int i5, byte[] bArr) {
        return ((long) ByteBuffer.wrap(bArr, i5, 4).order(ByteOrder.LITTLE_ENDIAN).getInt()) & 4294967295L;
    }

    /* JADX INFO: renamed from: i */
    public static long m2872i(int i5, byte[] bArr) {
        return ByteBuffer.wrap(bArr, i5, 8).order(ByteOrder.LITTLE_ENDIAN).getLong();
    }

    /* JADX INFO: renamed from: j */
    public static void m2873j(byte[] bArr, String str) {
        try {
            C1610c c1610cM2867d = m2867d(bArr);
            String str2 = c1610cM2867d.f5549f;
            byte[] bArr2 = c1610cM2867d.f5545b;
            long j5 = c1610cM2867d.f5544a;
            if (j5 <= 0 || j5 > bArr.length) {
                throw new SecurityException("Native SO signed size is invalid: " + str);
            }
            if (!MessageDigest.isEqual(m2869f(bArr), bArr2)) {
                throw new SecurityException("Native SO load hash mismatch: " + str);
            }
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(c1610cM2867d.f5546c));
            x509Certificate.checkValidity();
            x509Certificate.verify(x509Certificate.getPublicKey());
            String lowerCase = "341e386452ad60d52c0ff2c53e06e2c385ac6f03ccfe954043193a0acde8dbe4".toLowerCase(Locale.US);
            String strM2868e = m2868e(x509Certificate.getEncoded());
            if (!lowerCase.isEmpty() && !lowerCase.equals(strM2868e)) {
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
            String str3 = c1610cM2867d.f5548e;
            Charset charset = StandardCharsets.UTF_8;
            signature.update(m2864a(j5, bArr2, str3.getBytes(charset), str2.getBytes(charset)));
            if (signature.verify(c1610cM2867d.f5547d)) {
                return;
            }
            throw new SecurityException("Native SO signature verification failed: " + str);
        } catch (SecurityException e5) {
            throw e5;
        } catch (Exception e6) {
            throw new SecurityException("Native SO signature check failed: " + str, e6);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m2874k(File file) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i5 = fileInputStream.read(bArr);
                    if (i5 == -1) {
                        fileInputStream.close();
                        m2873j(byteArrayOutputStream.toByteArray(), file.getAbsolutePath());
                        return;
                    }
                    byteArrayOutputStream.write(bArr, 0, i5);
                }
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException e5) {
            throw new SecurityException("Native SO read failed: " + file, e5);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m2875l(ByteArrayOutputStream byteArrayOutputStream, int i5) {
        byteArrayOutputStream.write(i5 & 255);
        byteArrayOutputStream.write((i5 >>> 8) & 255);
        byteArrayOutputStream.write((i5 >>> 16) & 255);
        byteArrayOutputStream.write((i5 >>> 24) & 255);
    }

    /* JADX INFO: renamed from: m */
    public static void m2876m(byte[] bArr) {
        Arrays.fill(bArr, 40, 48, (byte) 0);
        bArr[58] = 0;
        bArr[59] = 0;
        bArr[60] = 0;
        bArr[61] = 0;
        bArr[62] = 0;
        bArr[63] = 0;
    }
}
