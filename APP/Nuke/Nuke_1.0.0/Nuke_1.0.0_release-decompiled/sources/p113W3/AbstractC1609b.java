package p113W3;

import com.bumptech.glide.AbstractC1926h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Locale;
import p011B4.AbstractC0231b;
import p021D3.C0264a;
import p021D3.C0274k;
import p056K2.C0887m;
import p117X2.C1673r;
import p117X2.C1674s;
import p118X3.C1714x;
import p118X3.C1715y;
import p128a.AbstractC1785a;

/* JADX INFO: renamed from: W3.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1609b {

    /* JADX INFO: renamed from: a */
    public static final C1715y f5543a = new C1715y(new C1714x());

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (r9.equals(r6) != false) goto L11;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2858a(p021D3.C0264a r12) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p113W3.AbstractC1609b.m2858a(D3.a):void");
    }

    /* JADX INFO: renamed from: b */
    public static File m2859b() {
        return new File(new File(AbstractC1785a.f6095a.getFilesDir(), "nuke"), "libnuke_native.so");
    }

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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m2861d(p118X3.C1684F r5) {
        /*
            X3.q r5 = r5.f5743i
            java.lang.String r0 = "X-Checksum-SHA256"
            java.lang.String r0 = r5.m3038a(r0)
            r1 = 0
            if (r0 != 0) goto Lc
            r0 = r1
        Lc:
            java.lang.String r2 = "[0-9a-f]{64}"
            java.lang.String r3 = ""
            if (r0 != 0) goto L14
        L12:
            r0 = r3
            goto L24
        L14:
            java.lang.String r0 = r0.trim()
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r4)
            boolean r4 = r0.matches(r2)
            if (r4 == 0) goto L12
        L24:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L2b
            return r0
        L2b:
            java.lang.String r0 = "ETag"
            java.lang.String r5 = r5.m3038a(r0)
            if (r5 != 0) goto L34
            goto L35
        L34:
            r1 = r5
        L35:
            if (r1 != 0) goto L38
            return r3
        L38:
            java.lang.String r5 = "\""
            java.lang.String r5 = r1.replace(r5, r3)
            if (r5 != 0) goto L41
            goto L52
        L41:
            java.lang.String r5 = r5.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r0)
            boolean r0 = r5.matches(r2)
            if (r0 == 0) goto L52
            return r5
        L52:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p113W3.AbstractC1609b.m2861d(X3.F):java.lang.String");
    }

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
