package p113W3;

import com.bumptech.glide.AbstractC1926h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Locale;
import p011B4.AbstractC0231b;
import p014C1.C0240b;
import p021D3.C0264a;
import p021D3.C0274k;
import p056K2.C0887m;
import p117X2.C1673r;
import p117X2.C1674s;
import p118X3.AbstractC1687I;
import p118X3.C1679A;
import p118X3.C1684F;
import p118X3.C1707q;
import p118X3.C1714x;
import p118X3.C1715y;
import p128a.AbstractC1785a;
import p138b4.C1869n;

/* JADX INFO: renamed from: W3.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1609b {

    /* JADX INFO: renamed from: a */
    public static final C1715y f5543a = new C1715y(new C1714x());

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (r9.equals(r6) != false) goto L11;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2858a(C0264a c0264a) {
        File fileM2859b = m2859b();
        String str = "https://www.guang233.com/api/client/native/libnuke_native.so";
        boolean zIsFile = fileM2859b.isFile();
        C1715y c1715y = f5543a;
        if (zIsFile) {
            try {
                AbstractC1611d.m2874k(fileM2859b);
                FileInputStream fileInputStream = new FileInputStream(fileM2859b);
                try {
                    byte[] bArrM2860c = m2860c(fileInputStream, -1L, null);
                    fileInputStream.close();
                    String strM2862e = m2862e(bArrM2860c);
                    C0240b c0240b = new C0240b(4);
                    c0240b.m443t(str);
                    c0240b.m438o("HEAD", null);
                    c0240b.m436m("If-None-Match", "\"" + strM2862e + "\"");
                    C1679A c1679a = new C1679A(c0240b);
                    c1715y.getClass();
                    C1684F c1684fM3351h = new C1869n(c1715y, c1679a).m3351h();
                    try {
                        if (c1684fM3351h.f5741g != 304) {
                            if (c1684fM3351h.f5753s) {
                                String strM2861d = m2861d(c1684fM3351h);
                                if (!strM2861d.isEmpty()) {
                                }
                            }
                            c1684fM3351h.close();
                        }
                        c1684fM3351h.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            c1684fM3351h.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException unused) {
                return;
            } catch (SecurityException unused2) {
                fileM2859b.delete();
            }
        }
        C0240b c0240b2 = new C0240b(4);
        c0240b2.m443t(str);
        c0240b2.m438o("GET", null);
        C1679A c1679a2 = new C1679A(c0240b2);
        try {
            c1715y.getClass();
            C1684F c1684fM3351h2 = new C1869n(c1715y, c1679a2).m3351h();
            try {
                if (!c1684fM3351h2.f5753s) {
                    throw new SecurityException("Native SO download failed: HTTP " + c1684fM3351h2.f5741g);
                }
                AbstractC1687I abstractC1687I = c1684fM3351h2.f5744j;
                if (abstractC1687I == null) {
                    throw new SecurityException("Native SO download failed: empty response body");
                }
                long jMo505c = abstractC1687I.mo505c();
                byte[] bArrM2860c2 = m2860c(abstractC1687I.mo507f().mo4700B(), jMo505c, c0264a);
                String strM2861d2 = m2861d(c1684fM3351h2);
                String strM2862e2 = m2862e(bArrM2860c2);
                if (!strM2861d2.isEmpty() && !strM2861d2.equals(strM2862e2)) {
                    throw new SecurityException("Native SO SHA-256 mismatch: ".concat(str));
                }
                if (jMo505c >= 0 && jMo505c != bArrM2860c2.length) {
                    throw new SecurityException("Native SO length mismatch: ".concat(str));
                }
                AbstractC1611d.m2873j(bArrM2860c2, str);
                m2863f(fileM2859b, bArrM2860c2);
                AbstractC1611d.m2874k(fileM2859b);
                c1684fM3351h2.close();
            } finally {
            }
        } catch (IOException e5) {
            throw new SecurityException("Native SO download failed: ".concat(str), e5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static File m2859b() {
        return new File(new File(AbstractC1785a.f6095a.getFilesDir(), "nuke"), "libnuke_native.so");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static byte[] m2860c(InputStream inputStream, long j5, C0264a c0264a) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        long j6 = 0;
        while (true) {
            int i5 = inputStream.read(bArr);
            if (i5 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i5);
            j6 += (long) i5;
            if (c0264a != null) {
                C1673r c1673r = c0264a.f856a;
                C1674s c1674s = c0264a.f857b;
                C0887m c0887m = C0274k.f881a;
                if (j5 > 0) {
                    int iM3568k = AbstractC1926h.m3568k((int) ((100 * j6) / j5), 0, 100);
                    if (iM3568k != c1673r.f5707d) {
                        c1673r.f5707d = iM3568k;
                        String strM463f = C0274k.m463f(j6);
                        String strM463f2 = C0274k.m463f(j5);
                        StringBuilder sb = new StringBuilder("正在下载 Native 运行环境 ");
                        sb.append(iM3568k);
                        sb.append("% (");
                        sb.append(strM463f);
                        sb.append("/");
                        C0274k.m479v(AbstractC0231b.m403n(sb, strM463f2, ")"), Float.valueOf(((iM3568k / 100.0f) * 0.25f) + 0.05f));
                    }
                } else {
                    long j7 = j6 / 1048576;
                    if (j7 != c1674s.f5708d) {
                        c1674s.f5708d = j7;
                        C0274k.m479v(AbstractC0231b.m400k("正在下载 Native 运行环境 (", C0274k.m463f(j6), ")"), Float.valueOf(0.08f));
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m2861d(C1684F c1684f) {
        String lowerCase;
        String strReplace;
        C1707q c1707q = c1684f.f5743i;
        String strM3038a = c1707q.m3038a("X-Checksum-SHA256");
        if (strM3038a == null) {
            strM3038a = null;
        }
        if (strM3038a == null) {
            lowerCase = "";
        } else {
            lowerCase = strM3038a.trim().toLowerCase(Locale.US);
            if (!lowerCase.matches("[0-9a-f]{64}")) {
            }
        }
        if (!lowerCase.isEmpty()) {
            return lowerCase;
        }
        String strM3038a2 = c1707q.m3038a("ETag");
        String str = strM3038a2 != null ? strM3038a2 : null;
        if (str != null && (strReplace = str.replace("\"", "")) != null) {
            String lowerCase2 = strReplace.trim().toLowerCase(Locale.US);
            if (lowerCase2.matches("[0-9a-f]{64}")) {
                return lowerCase2;
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m2862e(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr);
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b2 : bArrDigest) {
                sb.append(String.format(Locale.US, "%02x", Integer.valueOf(b2 & 255)));
            }
            return sb.toString();
        } catch (Exception e5) {
            throw new SecurityException("SHA-256 is unavailable", e5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:61:0x0033 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.io.File */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.File] */
    /* JADX INFO: renamed from: f */
    public static synchronized void m2863f(File file, byte[] bArr) {
        File file2 = "Unable to create native library directory: ";
        synchronized (AbstractC1609b.class) {
            try {
                File parentFile = file.getParentFile();
                if (parentFile == null) {
                    throw new SecurityException("Native library parent directory is unavailable: " + file);
                }
                if (!parentFile.exists() && !parentFile.mkdirs()) {
                    throw new SecurityException("Unable to create native library directory: " + parentFile);
                }
                file2 = new File(parentFile, file.getName() + ".download");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream((File) file2);
                    try {
                        fileOutputStream.write(bArr);
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        if (file.exists() && !file.delete()) {
                            throw new IOException("Unable to replace existing native library: " + file);
                        }
                        if (!file2.renameTo(file)) {
                            throw new IOException("Unable to move native library into place: " + file);
                        }
                        file.setReadable(true, true);
                        file.setExecutable(true, true);
                        if (file2.exists()) {
                            file2.delete();
                        }
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e5) {
                    throw new SecurityException("Unable to write native library", e5);
                }
            } catch (Throwable th3) {
                if (file2.exists()) {
                    file2.delete();
                }
                throw th3;
            } finally {
            }
        }
    }
}
