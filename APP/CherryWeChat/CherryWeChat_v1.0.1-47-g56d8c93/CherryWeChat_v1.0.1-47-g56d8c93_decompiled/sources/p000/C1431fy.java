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
    public static final HashSet f5034a = new HashSet();

    static {
        new Random();
    }

    /* JADX INFO: renamed from: a */
    public static void m2737a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m2738b(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        CRC32 crc32 = new CRC32();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                crc32.update(bArr, 0, i);
            } catch (Exception unused) {
            } catch (Throwable th) {
                m2737a(inputStream);
                throw th;
            }
        }
        m2737a(inputStream);
        return Long.toString(crc32.getValue(), 16);
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
    public static void m2739c(String str, String str2, File file) throws Throwable {
        String strM2738b;
        ?? r0;
        IOException e;
        ?? r1 = 0;
        if (file.exists()) {
            try {
                strM2738b = m2738b(new FileInputStream(file));
            } catch (FileNotFoundException unused) {
                strM2738b = null;
            }
        } else {
            strM2738b = null;
        }
        if (strM2738b != null && (str2 = strM2738b.equals(str2)) != 0) {
            return;
        }
        try {
            try {
                str2 = m2743g(str);
            } catch (Throwable th) {
                th = th;
            }
            try {
                file.getParentFile().mkdirs();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = str2.read(bArr);
                        if (i == -1) {
                            m2737a(str2);
                            m2737a(fileOutputStream);
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                } catch (IOException e2) {
                    e = e2;
                    throw new C0232Fa("Error extracting file: " + str + "\nTo: " + file.getAbsolutePath(), e);
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                strM2738b = null;
                r1 = str2;
                r0 = strM2738b;
                m2737a(r1);
                m2737a(r0);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (Throwable th3) {
            th = th3;
            r0 = 0;
            m2737a(r1);
            m2737a(r0);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Throwable m2740d(String str, String str2, File file) {
        try {
            m2739c(str, str2, file);
            System.load(file.getAbsolutePath());
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2741e(String str) {
        String strM2738b = m2738b(m2743g(str));
        String name = new File(str).getName();
        Throwable thM2740d = m2740d(str, strM2738b, new File(System.getProperty("java.io.tmpdir") + "/libgdx" + System.getProperty("user.name") + "/" + strM2738b, name));
        if (thM2740d == null) {
            return;
        }
        try {
            File fileCreateTempFile = File.createTempFile(strM2738b, null);
            if (fileCreateTempFile.delete()) {
                if (m2740d(str, strM2738b, fileCreateTempFile) == null) {
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        if (m2740d(str, strM2738b, new File(System.getProperty("user.home") + "/.libgdx/" + strM2738b, name)) == null || m2740d(str, strM2738b, new File(AbstractC0213Ey.m420r(".temp/", strM2738b), name)) == null) {
            return;
        }
        File file = new File(System.getProperty("java.library.path"), str);
        if (!file.exists()) {
            throw new C0232Fa(thM2740d);
        }
        System.load(file.getAbsolutePath());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m2742f(String str) {
        String lowerCase;
        String strSubstring;
        int i = AbstractC0800Sk.f2505a;
        if (i == 4) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            throw null;
        }
        String str2 = "";
        sb.append((i == 2 || i == 4 || i == 3) ? "lib" : "");
        sb.append(str);
        int i2 = AbstractC0800Sk.f2507c;
        if (i2 != 1) {
            lowerCase = AbstractC0213Ey.m422t(i2).toLowerCase();
        } else {
            if (i2 == 0) {
                throw null;
            }
            lowerCase = "";
        }
        sb.append(lowerCase);
        int i3 = AbstractC0800Sk.f2506b;
        if (i3 != 1) {
            strSubstring = AbstractC0213Ey.m421s(i3).substring(1);
        } else {
            if (i3 == 0) {
                throw null;
            }
            strSubstring = "";
        }
        sb.append(strSubstring);
        sb.append(".");
        if (i == 0) {
            throw null;
        }
        if (i == 1) {
            str2 = "dll";
        } else if (i != 2) {
            if (i == 3) {
                str2 = "dylib";
            } else if (i == 4) {
                str2 = "so";
            }
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static InputStream m2743g(String str) {
        InputStream resourceAsStream = C1431fy.class.getClassLoader().getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        throw new C0232Fa(AbstractC0213Ey.m420r("Unable to read file for extraction: ", str));
    }
}
