package p000;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Random;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: fy */
/* JADX INFO: loaded from: classes.dex */
public final class C1431fy {

    /* JADX INFO: renamed from: a */
    public static final HashSet f5034a = null;

    static {
        f5034a = new HashSet();
        new Random();
    }

    /* JADX INFO: renamed from: a */
    public static void m2737a(Closeable r0) {
        if (r0 == null) goto L8;
        r0.close();     // Catch: Throwable -> L5
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: b */
    public static String m2738b(InputStream r4) {
        if (r4 == null) goto L17;
        CRC32 r0 = new CRC32();
        byte[] r1 = new byte[4096];
    L19:
        int r2 = r4.read(r1);     // Catch: Exception -> L18 Throwable -> L11
        goto L7
    L6:
        if (r2 == (-1)) goto L7;
        r0.update(r1, 0, r2);     // Catch: Exception -> L18 Throwable -> L11
    L11:
        th = move-exception;
        m2737a(r4);
        throw th;
    L7:
        m2737a(r4);
        return Long.toString(r0.getValue(), 16);
    L17:
        throw new IllegalArgumentException("input cannot be null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean] */
    /* JADX INFO: renamed from: c */
    public static void m2739c(String r6, String r7, File r8) {
        ?? r1 = 0;
        if (r8.exists() == true) goto L40;
    L6:
        String r0 = null;
    L7:
        if (r0 == null) goto L39;
        r7 = r0.equals(r7);
        if (r7 == 0) goto L39;
        return;
    L39:
        r7 = m2743g(r6);     // Catch: Throwable -> L30 IOException -> L32
        r8.getParentFile().mkdirs();     // Catch: Throwable -> L26 IOException -> L28
        FileOutputStream r02 = new FileOutputStream(r8);     // Catch: Throwable -> L26 IOException -> L28
    L42:
        byte[] r12 = new byte[4096];     // Catch: Throwable -> L22 IOException -> L24
    L14:
        int r2 = r7.read(r12);     // Catch: Throwable -> L22 IOException -> L24
        if (r2 == (-1)) goto L17;
        r02.write(r12, 0, r2);     // Catch: Throwable -> L22 IOException -> L24
        goto L14
    L17:
        m2737a(r7);
        m2737a(r02);
        return;
    L24:
        IOException e = e;
    L35:
        throw new C0232Fa("Error extracting file: " + r6 + "\nTo: " + r8.getAbsolutePath(), e);     // Catch: Throwable -> L22
    L28:
        e = move-exception;
        e = e;
    L26:
        th = th;
        r0 = null;
    L23:
        r1 = r7;
        ?? r03 = r0;
    L36:
        m2737a(r1);
        m2737a(r03);
        throw th;
    L22:
        th = th;
    L32:
        e = move-exception;
        e = e;
    L30:
        th = th;
        r03 = 0;
        goto L36
    L40:
        r0 = m2738b(new FileInputStream(r8));     // Catch: FileNotFoundException -> L38
        goto L7
    }

    /* JADX INFO: renamed from: d */
    public static Throwable m2740d(String r0, String r1, File r2) {
        m2739c(r0, r1, r2);     // Catch: Throwable -> L5
        System.load(r2.getAbsolutePath());     // Catch: Throwable -> L5
        return null;
    L5:
        th = move-exception;
        return th;
    }

    /* JADX INFO: renamed from: e */
    public static void m2741e(String r6) {
        String r0 = m2738b(m2743g(r6));
        String r1 = new File(r6).getName();
        Throwable r2 = m2740d(r6, r0, new File(System.getProperty("java.io.tmpdir") + "/libgdx" + System.getProperty("user.name") + "/" + r0, r1));
        if (r2 != null) goto L24;
        return;
    L24:
        File r3 = File.createTempFile(r0, null);     // Catch: Throwable -> L23
        if (r3.delete() == false) goto L12;
        if (m2740d(r6, r0, r3) != null) goto L12;
        return;
    L12:
        if (m2740d(r6, r0, new File(System.getProperty("user.home") + "/.libgdx/" + r0, r1)) != null) goto L15;
        return;
    L15:
        if (m2740d(r6, r0, new File(AbstractC0213Ey.m420r(".temp/", r0), r1)) != null) goto L17;
        return;
    L17:
        File r02 = new File(System.getProperty("java.library.path"), r6);
        if (r02.exists() == false) goto L22;
        System.load(r02.getAbsolutePath());
        return;
    L22:
        throw new C0232Fa(r2);
    }

    /* JADX INFO: renamed from: f */
    public static String m2742f(String r8) {
        int r0 = AbstractC0800Sk.f2505a;
        if (r0 != 4) goto L5;
        return r8;
    L5:
        StringBuilder r2 = new StringBuilder();
        if (r0 == 0) goto L40;
        String r5 = "";
        if (r0 == 2) goto L13;
        if (r0 == 4) goto L13;
        if (r0 == 3) goto L13;
        String r7 = "";
    L14:
        r2.append(r7);
        r2.append(r8);
        int r82 = AbstractC0800Sk.f2507c;
        if (r82 != 1) goto L19;
        if (r82 == 0) goto L18;
        String r83 = "";
    L20:
        r2.append(r83);
        int r84 = AbstractC0800Sk.f2506b;
        if (r84 != 1) goto L25;
        if (r84 == 0) goto L24;
        String r85 = "";
    L26:
        r2.append(r85);
        r2.append(".");
        if (r0 == 0) goto L39;
        if (r0 != 1) goto L31;
        r5 = "dll";
    L37:
        r2.append(r5);
        return r2.toString();
    L31:
        if (r0 != 2) goto L33;
    L32:
        r5 = "so";
        goto L37
    L33:
        if (r0 != 3) goto L35;
        r5 = "dylib";
        goto L37
    L35:
        if (r0 != 4) goto L37;
    L39:
        throw null;
    L24:
        throw null;
    L25:
        r85 = AbstractC0213Ey.m421s(r84).substring(1);
        goto L26
    L18:
        throw null;
    L19:
        r83 = AbstractC0213Ey.m422t(r82).toLowerCase();
    L13:
        r7 = "lib";
        goto L14
    L40:
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static InputStream m2743g(String r2) {
        InputStream r0 = C1431fy.class.getClassLoader().getResourceAsStream(r2);
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new C0232Fa(AbstractC0213Ey.m420r("Unable to read file for extraction: ", r2));
    }
}
