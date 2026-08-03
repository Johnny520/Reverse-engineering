package p001;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.security.cert.CertificateException;
import javax.security.cert.X509Certificate;
import p001.C0219g0;

/* JADX INFO: renamed from: ۟.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0316n implements Closeable {

    /* JADX INFO: renamed from: ۥ */
    public C0219g0 f982;

    /* JADX INFO: renamed from: ۥ۟ */
    public final ZipFile f983;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public File f1713;

    /* JADX INFO: renamed from: ۟.n$a */
    public static class a extends RuntimeException {
        public a(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    public C0316n(File file) {
        try {
            this.f1713 = file;
            this.f983 = new ZipFile(file);
        } catch (IOException e) {
            throw new a(String.format("Invalid APK: %s", file.getAbsolutePath()), e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C0316n m1155(File file) {
        return new C0316n(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f982 = null;
        try {
            this.f983.close();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final C0219g0 m1156() throws CertificateException, IOException {
        ZipEntry zipEntryNextElement;
        if (this.f982 == null) {
            Enumeration<? extends ZipEntry> enumerationEntries = this.f983.entries();
            while (true) {
                zipEntryNextElement = null;
                if (!enumerationEntries.hasMoreElements()) {
                    break;
                }
                zipEntryNextElement = enumerationEntries.nextElement();
                if (!zipEntryNextElement.isDirectory() && (zipEntryNextElement.getName().toUpperCase().endsWith(".RSA") || zipEntryNextElement.getName().toUpperCase().endsWith(".DSA"))) {
                    break;
                }
            }
            if (zipEntryNextElement == null) {
                throw new IOException("ApkParser certificate not found");
            }
            InputStream inputStream = this.f983.getInputStream(zipEntryNextElement);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[1024];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i == -1) {
                        try {
                            break;
                        } finally {
                            byteArrayOutputStream.close();
                        }
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedInputStream.close();
                X509Certificate x509Certificate = X509Certificate.getInstance(byteArray);
                C0219g0.a aVar = new C0219g0.a();
                byte[] encoded = x509Certificate.getEncoded();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(encoded);
                    String strM860 = C0233h0.m860(messageDigest.digest());
                    StringBuilder sb = new StringBuilder(encoded.length);
                    for (byte b : encoded) {
                        String hexString = Integer.toHexString(((char) b) & 255);
                        if (hexString.length() < 2) {
                            sb.append(0);
                        }
                        sb.append(hexString.toUpperCase());
                    }
                    String string = sb.toString();
                    try {
                        MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
                        messageDigest2.update(string.getBytes(Charset.forName("UTF-8")));
                        aVar.f807 = C0233h0.m860(messageDigest2.digest());
                        aVar.f1467 = strM860;
                        x509Certificate.getNotBefore();
                        x509Certificate.getNotAfter();
                        aVar.f806 = x509Certificate.getSigAlgName();
                        x509Certificate.getSigAlgOID();
                        this.f982 = new C0219g0(aVar);
                        inputStream.close();
                    } catch (NoSuchAlgorithmException e) {
                        throw new RuntimeException(e);
                    }
                } catch (NoSuchAlgorithmException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (Throwable th) {
                bufferedInputStream.close();
                throw th;
            }
        }
        return this.f982;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public final int m1157() throws IOException {
        if (this.f983.getEntry("META-INF/MANIFEST.MF") == null) {
            return 0;
        }
        JarFile jarFile = new JarFile(this.f1713);
        Enumeration<JarEntry> enumerationEntries = jarFile.entries();
        byte[] bArr = new byte[8192];
        while (enumerationEntries.hasMoreElements()) {
            JarEntry jarEntryNextElement = enumerationEntries.nextElement();
            if (!jarEntryNextElement.isDirectory()) {
                try {
                    InputStream inputStream = jarFile.getInputStream(jarEntryNextElement);
                    do {
                    } while (inputStream.read(bArr, 0, 8192) != -1);
                    inputStream.close();
                } catch (SecurityException unused) {
                    return 1;
                }
            }
        }
        return 2;
    }
}
