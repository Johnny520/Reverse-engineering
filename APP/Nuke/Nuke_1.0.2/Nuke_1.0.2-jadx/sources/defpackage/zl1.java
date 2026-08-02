package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import me.dartcv.nuke.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zl1 {
    public static final byte[] a = "NUKE-NATIVE-RELEASE-V1\u0000".getBytes(StandardCharsets.US_ASCII);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(ZipFile zipFile, ZipEntry zipEntry, File file, h80 h80Var) throws NoSuchAlgorithmException, IOException {
        long j = h80Var.g;
        Path path = file.getParentFile().getParentFile().toPath();
        Path pathCreateTempFile = Files.createTempFile(file.getParentFile().toPath(), file.getName() + ".", ".tmp", new FileAttribute[0]);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(pathCreateTempFile.toFile());
            try {
                byte[] bArr = new byte[16384];
                long j2 = 0;
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        inputStream.close();
                        String strB = b(messageDigest.digest());
                        if (j2 != j || !strB.equals((String) h80Var.i)) {
                            Files.deleteIfExists(pathCreateTempFile);
                            c80.x("Native release Engine digest mismatch");
                            return;
                        } else {
                            cm1.k(pathCreateTempFile.toFile());
                            up0.g(path, pathCreateTempFile, file.toPath());
                            file.setReadable(true, true);
                            file.setExecutable(true, true);
                            return;
                        }
                    }
                    j2 += (long) i;
                    if (j2 > j || j2 > 67108864) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i);
                    messageDigest.update(bArr, 0, i);
                }
                throw new SecurityException("Native release Engine exceeds declared size");
            } finally {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format(Locale.US, "%02x", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] c(InputStream inputStream) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                long j = 0;
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        inputStream.close();
                        return byteArray;
                    }
                    j += (long) i;
                    if (j > 131072) {
                        throw new SecurityException("Native manifest is too large");
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String d(File file) throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    fileInputStream.close();
                    return b(messageDigest.digest());
                }
                messageDigest.update(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r4.contains("\\") != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r1.add(r4) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if ("release.nkm".equals(r4) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r4.matches("lib/arm64-v8a/libnuke_engine_[0-9]+_[0-9a-f]{12}\\.so") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        defpackage.c80.x("Native release contains an unexpected entry");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        r0.add(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList e(ZipFile zipFile) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        loop0: while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            String name = zipEntryNextElement.getName();
            if (!zipEntryNextElement.isDirectory() && !name.isEmpty() && !name.startsWith("/") && !name.startsWith("\\")) {
                String[] strArrSplit = name.split("/", -1);
                int length = strArrSplit.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String str = strArrSplit[i];
                    if (str.isEmpty() || ".".equals(str) || "..".equals(str)) {
                        break loop0;
                    }
                    i++;
                }
            }
            c80.x("Native release ZIP entry is invalid");
            return null;
        }
        if (arrayList.size() == 2) {
            return arrayList;
        }
        c80.x("Native release must contain exactly two entries");
        return null;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static b5 f(File file, File file2) {
        if (!up0.y(file2.toPath(), file.toPath()) || file.length() <= 0 || file.length() > 67108864) {
            c80.x("Native release package size is invalid");
            return null;
        }
        try {
            ZipFile zipFile = new ZipFile(file);
            try {
                ArrayList arrayListE = e(zipFile);
                final h80 h80VarG = g(c(zipFile.getInputStream((ZipEntry) arrayListE.stream().filter(new wl1()).findFirst().orElseThrow(new xl1(0)))));
                long j = h80VarG.g;
                ZipEntry zipEntry = (ZipEntry) arrayListE.stream().filter(new Predicate() { // from class: yl1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((String) h80VarG.h).equals(((ZipEntry) obj).getName());
                    }
                }).findFirst().orElseThrow(new xl1(1));
                if (zipEntry.getSize() != j) {
                    throw new SecurityException("Native release Engine size mismatch");
                }
                File file3 = new File(file2, "release-" + h80VarG.a);
                up0.r(file2.toPath(), file3.toPath());
                File file4 = new File(file3, new File((String) h80VarG.h).getName());
                if (up0.y(file4.getParentFile().getParentFile().toPath(), file4.toPath()) && file4.length() == j) {
                    try {
                        if (((String) h80VarG.i).equals(d(file4))) {
                            cm1.k(file4);
                        }
                    } catch (Exception unused) {
                    }
                    a(zipFile, zipEntry, file4, h80VarG);
                } else {
                    a(zipFile, zipEntry, file4, h80VarG);
                }
                b5 b5Var = new b5(h80VarG, file4, d(file), 22);
                zipFile.close();
                return b5Var;
            } finally {
            }
        } catch (SecurityException e) {
            throw e;
        } catch (Exception e2) {
            throw new SecurityException("Native release verification failed", e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static h80 g(byte[] bArr) throws JSONException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        boolean zEquals;
        Charset charset = StandardCharsets.UTF_8;
        JSONObject jSONObject = new JSONObject(new String(bArr, charset));
        if (jSONObject.getInt("v") != 1) {
            c80.x("Native release envelope version is unsupported");
            return null;
        }
        byte[] bArrDecode = Base64.getDecoder().decode(jSONObject.getString("payload"));
        byte[] bArrDecode2 = Base64.getDecoder().decode(jSONObject.getString("certificate"));
        byte[] bArrDecode3 = Base64.getDecoder().decode(jSONObject.getString("signature"));
        if (bArrDecode.length == 0 || bArrDecode.length > 131072) {
            c80.x("Native release payload size is invalid");
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArrDecode2));
        x509Certificate.checkValidity();
        x509Certificate.verify(x509Certificate.getPublicKey());
        Locale locale = Locale.US;
        String lowerCase = BuildConfig.NUKE_NATIVE_SO_CERT_SHA256.toLowerCase(locale);
        String strB = b(MessageDigest.getInstance("SHA-256").digest(x509Certificate.getEncoded()));
        if (!lowerCase.isEmpty() && !lowerCase.equals(strB)) {
            c80.x("Native release certificate fingerprint mismatch");
            return null;
        }
        String name = x509Certificate.getSubjectX500Principal().getName("RFC2253");
        if (!name.contains("CN=Admilk") || !name.contains("OU=design by Admilk")) {
            c80.x("Native release certificate subject mismatch");
            return null;
        }
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initVerify(x509Certificate.getPublicKey());
        signature.update(a);
        signature.update(bArrDecode);
        if (!signature.verify(bArrDecode3)) {
            c80.x("Native release manifest signature mismatch");
            return null;
        }
        JSONObject jSONObject2 = new JSONObject(new String(bArrDecode, charset));
        JSONObject jSONObject3 = jSONObject2.getJSONObject("engine");
        String string = jSONObject2.getString("releaseId");
        long j = jSONObject2.getLong("generation");
        int i = jSONObject2.getInt("engineAbi");
        int i2 = jSONObject2.getInt("minBridgeAbi");
        int i3 = jSONObject2.getInt("minAppVersionCode");
        String lowerCase2 = jSONObject2.getString("kid").toLowerCase(locale);
        String string2 = jSONObject3.getString("path");
        String lowerCase3 = jSONObject3.getString("sha256").toLowerCase(locale);
        long j2 = jSONObject3.getLong("size");
        jSONObject2.optString("buildId", "");
        h80 h80Var = new h80(string, j, i, i2, i3, lowerCase2, string2, lowerCase3, j2);
        try {
            zEquals = UUID.fromString(string).toString().equals(string.toLowerCase(locale));
        } catch (IllegalArgumentException unused) {
            zEquals = false;
        }
        if (zEquals && j > 0 && h80Var.c == 1 && h80Var.d <= 1 && h80Var.e >= 1 && h80Var.f.matches("[0-9a-f]{8}") && ((String) h80Var.i).matches("[0-9a-f]{64}")) {
            long j3 = h80Var.g;
            if (j3 > 0 && j3 <= 67108864) {
                if (((String) h80Var.h).matches("lib/arm64-v8a/libnuke_engine_" + j + "_[0-9a-f]{12}\\.so")) {
                    return h80Var;
                }
            }
        }
        c80.x("Native release manifest fields are invalid");
        return null;
    }
}
