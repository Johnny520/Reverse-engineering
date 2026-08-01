package p315vd;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;

/* JADX INFO: renamed from: vd.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8925e {
    /* JADX INFO: renamed from: a */
    public static boolean m34272a(String str) {
        File file = new File(str);
        return file.exists() && file.length() > 0;
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m34273b(String str, String str2, String str3) {
        String str4 = str + str2;
        Bitmap bitmapM34274c = m34274c(str4);
        if (bitmapM34274c != null) {
            return bitmapM34274c;
        }
        m34275d(str3, str2, str4);
        return m34274c(str4);
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m34274c(String str) {
        if (m34272a(str)) {
            return BitmapFactory.decodeFile(str);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        r5 = new java.io.File(r6);
        r6 = r5.getParentFile();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r6 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r6.exists() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r6.mkdirs();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r6 = new java.io.FileOutputStream(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        r5 = new byte[8192];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        r2 = r0.read(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        if (r2 == (-1)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        r6.write(r5, 0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        r6.close();
        r0.closeEntry();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0091, code lost:
    
        throw r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m34275d(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "assets/"
            r1 = 0
            java.lang.Class<vd.e> r2 = p315vd.AbstractC8925e.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Exception -> L31
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Exception -> L31
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L31
            r3.<init>(r0)     // Catch: java.lang.Exception -> L31
            r3.append(r4)     // Catch: java.lang.Exception -> L31
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Exception -> L31
            java.io.InputStream r4 = r2.getResourceAsStream(r4)     // Catch: java.lang.Exception -> L31
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> L35
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L35
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L35
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L38
            r0.close()     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L34
            r4.close()     // Catch: java.lang.Exception -> L31
            return r1
        L31:
            r4 = move-exception
            goto Lb1
        L34:
            return r1
        L35:
            r5 = move-exception
            goto La6
        L38:
            java.util.zip.ZipEntry r2 = r0.getNextEntry()     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L96
            java.lang.String r3 = r2.getName()     // Catch: java.lang.Throwable -> L63
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L92
            boolean r2 = r2.isDirectory()     // Catch: java.lang.Throwable -> L63
            if (r2 != 0) goto L92
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L63
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L63
            java.io.File r6 = r5.getParentFile()     // Catch: java.lang.Throwable -> L63
            if (r6 == 0) goto L65
            boolean r2 = r6.exists()     // Catch: java.lang.Throwable -> L63
            if (r2 != 0) goto L65
            r6.mkdirs()     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            r5 = move-exception
            goto L9d
        L65:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L63
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L63
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L79
        L6e:
            int r2 = r0.read(r5)     // Catch: java.lang.Throwable -> L79
            r3 = -1
            if (r2 == r3) goto L7b
            r6.write(r5, r1, r2)     // Catch: java.lang.Throwable -> L79
            goto L6e
        L79:
            r5 = move-exception
            goto L89
        L7b:
            r6.close()     // Catch: java.lang.Throwable -> L63
            r0.closeEntry()     // Catch: java.lang.Throwable -> L63
            r0.close()     // Catch: java.lang.Throwable -> L35
            r5 = 1
            r4.close()     // Catch: java.lang.Exception -> L31
            return r5
        L89:
            r6.close()     // Catch: java.lang.Throwable -> L8d
            goto L91
        L8d:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.lang.Throwable -> L63
        L91:
            throw r5     // Catch: java.lang.Throwable -> L63
        L92:
            r0.closeEntry()     // Catch: java.lang.Throwable -> L63
            goto L38
        L96:
            r0.close()     // Catch: java.lang.Throwable -> L35
            r4.close()     // Catch: java.lang.Exception -> L31
            goto Lb8
        L9d:
            r0.close()     // Catch: java.lang.Throwable -> La1
            goto La5
        La1:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.lang.Throwable -> L35
        La5:
            throw r5     // Catch: java.lang.Throwable -> L35
        La6:
            if (r4 == 0) goto Lb0
            r4.close()     // Catch: java.lang.Throwable -> Lac
            goto Lb0
        Lac:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.lang.Exception -> L31
        Lb0:
            throw r5     // Catch: java.lang.Exception -> L31
        Lb1:
            java.lang.String r5 = "ResourceUtils"
            java.lang.String r6 = "unzipSingle error"
            p315vd.AbstractC8924d.m34264d(r5, r6, r4)
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p315vd.AbstractC8925e.m34275d(java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
