package p000;

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

    /* JADX INFO: renamed from: a */
    public static final byte[] f1621a = {78, 75, 83, 73, 71, 49, 0, 0};

    /* JADX INFO: renamed from: b */
    public static final byte[] f1622b;

    /* JADX INFO: renamed from: c */
    public static final byte[] f1623c;

    static {
        Charset charset = StandardCharsets.US_ASCII;
        f1622b = "NKSIG-PTLOAD-V1\u0000".getBytes(charset);
        f1623c = "NKSIG-IMAGE-V2\u0000".getBytes(charset);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m850a(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(f1622b);
        for (int i = 0; i < 8; i++) {
            byteArrayOutputStream.write((int) ((j >>> (i * 8)) & 255));
        }
        byteArrayOutputStream.write(bArr);
        m861l(byteArrayOutputStream, bArr2.length);
        m861l(byteArrayOutputStream, bArr3.length);
        byteArrayOutputStream.write(bArr2);
        byteArrayOutputStream.write(bArr3);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: b */
    public static void m851b(byte[] bArr) {
        if (bArr.length < 64 || bArr[0] != 127 || bArr[1] != 69 || bArr[2] != 76 || bArr[3] != 70) {
            c80.m680x("Native SO is not an ELF file");
        } else {
            if (bArr[4] == 2 && bArr[5] == 1) {
                return;
            }
            c80.m680x("Native SO must be little-endian ELF64");
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m852c(long j, long j2, byte[] bArr) {
        if (j >= 0 && j2 >= 0 && j2 <= 2147483647L && j <= ((long) bArr.length) - j2) {
            return (int) j;
        }
        c80.m680x("Native SO metadata is out of range");
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static bm1 m853d(byte[] bArr) {
        bm1 bm1Var;
        String str;
        m851b(bArr);
        long jM858i = m858i(40, bArr);
        int iM856g = m856g(58, bArr);
        int iM856g2 = m856g(60, bArr);
        int iM856g3 = m856g(62, bArr);
        if (jM858i <= 0 || iM856g < 64 || iM856g2 <= 0 || iM856g3 >= iM856g2) {
            c80.m680x("Native SO section table is unavailable");
            return null;
        }
        long j = iM856g;
        int iM852c = m852c((((long) iM856g3) * j) + jM858i, j, bArr);
        long jM858i2 = m858i(iM852c + 24, bArr);
        long jM858i3 = m858i(iM852c + 32, bArr);
        int iM852c2 = m852c(jM858i2, jM858i3, bArr);
        int i = ((int) jM858i3) + iM852c2;
        for (int i2 = 0; i2 < iM856g2; i2++) {
            int iM852c3 = m852c((((long) i2) * j) + jM858i, j, bArr);
            int iM857h = ((int) m857h(iM852c3, bArr)) + iM852c2;
            if (iM857h < 0 || iM857h >= i || i > bArr.length) {
                bm1Var = null;
                str = "";
            } else {
                int i3 = iM857h;
                while (i3 < i && bArr[i3] != 0) {
                    i3++;
                }
                bm1Var = null;
                str = new String(bArr, iM857h, i3 - iM857h, StandardCharsets.UTF_8);
            }
            if (".note.nksig".equals(str)) {
                long jM858i4 = m858i(iM852c3 + 24, bArr);
                long jM858i5 = m858i(iM852c3 + 32, bArr);
                int iM852c4 = m852c(jM858i4, jM858i5, bArr);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, iM852c4, ((int) jM858i5) + iM852c4);
                if (bArrCopyOfRange.length >= 68 && bArrCopyOfRange.length >= 8) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if (bArrCopyOfRange[i4] == f1621a[i4]) {
                        }
                    }
                    if (((int) m857h(8, bArrCopyOfRange)) != 1) {
                        c80.m680x("Native SO signature version is unsupported");
                        return bm1Var;
                    }
                    long jM858i6 = m858i(12, bArrCopyOfRange);
                    byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrCopyOfRange, 20, 52);
                    int iM857h2 = (int) m857h(52, bArrCopyOfRange);
                    int iM857h3 = (int) m857h(56, bArrCopyOfRange);
                    int iM857h4 = (int) m857h(60, bArrCopyOfRange);
                    int iM857h5 = (int) m857h(64, bArrCopyOfRange);
                    int i5 = iM857h2 + 68;
                    int i6 = i5 + iM857h3;
                    int i7 = i6 + iM857h4;
                    int i8 = i7 + iM857h5;
                    if (iM857h2 <= 0 || iM857h3 <= 0 || iM857h4 <= 0 || iM857h5 <= 0 || i8 != bArrCopyOfRange.length) {
                        c80.m680x("Native SO signature envelope length mismatch");
                        return bm1Var;
                    }
                    byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArrCopyOfRange, 68, i5);
                    byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArrCopyOfRange, i5, i6);
                    Charset charset = StandardCharsets.UTF_8;
                    return new bm1(jM858i6, bArrCopyOfRange2, bArrCopyOfRange3, bArrCopyOfRange4, new String(bArrCopyOfRange, i6, iM857h4, charset), new String(bArrCopyOfRange, i7, iM857h5, charset));
                }
                c80.m680x("Native SO signature envelope is invalid");
                return bm1Var;
            }
        }
        c80.m680x("Native SO signature section missing");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static String m854e(byte[] bArr) {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr);
        StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
        for (byte b : bArrDigest) {
            sb.append(String.format(Locale.US, "%02x", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m855f(byte[] bArr) throws NoSuchAlgorithmException {
        m851b(bArr);
        long jM858i = m858i(32, bArr);
        int iM856g = m856g(54, bArr);
        int iM856g2 = m856g(56, bArr);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(f1623c);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 64);
        m862m(bArrCopyOfRange);
        messageDigest.update(bArrCopyOfRange);
        long j = iM856g;
        messageDigest.update(bArr, m852c(jM858i, ((long) iM856g2) * j, bArr), iM856g * iM856g2);
        int i = 0;
        for (int i2 = 0; i2 < iM856g2; i2++) {
            int iM852c = m852c((((long) i2) * j) + jM858i, j, bArr);
            if (((int) m857h(iM852c, bArr)) == 1) {
                long jM858i2 = m858i(iM852c + 8, bArr);
                long jM858i3 = m858i(iM852c + 32, bArr);
                int iM852c2 = m852c(jM858i2, jM858i3, bArr);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, iM852c2, ((int) jM858i3) + iM852c2);
                if (jM858i2 == 0 && jM858i3 >= 64) {
                    m862m(bArrCopyOfRange2);
                }
                messageDigest.update(bArrCopyOfRange2);
                i++;
            }
        }
        if (i != 0) {
            return messageDigest.digest();
        }
        c80.m680x("Native SO has no loadable segments");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static int m856g(int i, byte[] bArr) {
        return ByteBuffer.wrap(bArr, i, 2).order(ByteOrder.LITTLE_ENDIAN).getShort() & 65535;
    }

    /* JADX INFO: renamed from: h */
    public static long m857h(int i, byte[] bArr) {
        return ((long) ByteBuffer.wrap(bArr, i, 4).order(ByteOrder.LITTLE_ENDIAN).getInt()) & 4294967295L;
    }

    /* JADX INFO: renamed from: i */
    public static long m858i(int i, byte[] bArr) {
        return ByteBuffer.wrap(bArr, i, 8).order(ByteOrder.LITTLE_ENDIAN).getLong();
    }

    /* JADX INFO: renamed from: j */
    public static void m859j(byte[] bArr, String str) {
        try {
            bm1 bm1VarM853d = m853d(bArr);
            String str2 = bm1VarM853d.f942f;
            byte[] bArr2 = bm1VarM853d.f938b;
            long j = bm1VarM853d.f937a;
            if (j <= 0 || j > bArr.length) {
                throw new SecurityException("Native SO signed size is invalid: " + str);
            }
            if (!MessageDigest.isEqual(m855f(bArr), bArr2)) {
                throw new SecurityException("Native SO load hash mismatch: " + str);
            }
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bm1VarM853d.f939c));
            x509Certificate.checkValidity();
            x509Certificate.verify(x509Certificate.getPublicKey());
            String lowerCase = BuildConfig.NUKE_NATIVE_SO_CERT_SHA256.toLowerCase(Locale.US);
            String strM854e = m854e(x509Certificate.getEncoded());
            if (!lowerCase.isEmpty() && !lowerCase.equals(strM854e)) {
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
            String str3 = bm1VarM853d.f941e;
            Charset charset = StandardCharsets.UTF_8;
            signature.update(m850a(j, bArr2, str3.getBytes(charset), str2.getBytes(charset)));
            if (signature.verify(bm1VarM853d.f940d)) {
                return;
            }
            throw new SecurityException("Native SO signature verification failed: " + str);
        } catch (SecurityException e) {
            throw e;
        } catch (Exception e2) {
            throw new SecurityException(vi0.m5690i("Native SO signature check failed: ", str), e2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m860k(File file) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        fileInputStream.close();
                        m859j(byteArrayOutputStream.toByteArray(), file.getAbsolutePath());
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

    /* JADX INFO: renamed from: l */
    public static void m861l(ByteArrayOutputStream byteArrayOutputStream, int i) {
        byteArrayOutputStream.write(i & 255);
        byteArrayOutputStream.write((i >>> 8) & 255);
        byteArrayOutputStream.write((i >>> 16) & 255);
        byteArrayOutputStream.write((i >>> 24) & 255);
    }

    /* JADX INFO: renamed from: m */
    public static void m862m(byte[] bArr) {
        Arrays.fill(bArr, 40, 48, (byte) 0);
        bArr[58] = 0;
        bArr[59] = 0;
        bArr[60] = 0;
        bArr[61] = 0;
        bArr[62] = 0;
        bArr[63] = 0;
    }
}
