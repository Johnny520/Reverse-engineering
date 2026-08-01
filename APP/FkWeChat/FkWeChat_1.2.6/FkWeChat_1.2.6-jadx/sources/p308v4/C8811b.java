package p308v4;

import dalvik.system.InMemoryDexClassLoader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p076f5.C2293e;
import p076f5.C2297i;
import p106h5.C2872a;
import p123i5.C3198a;
import p138j5.AbstractC3601c;
import p138j5.C3600b;
import p182m5.C5009p;
import p376zd.C9980b1;

/* JADX INFO: renamed from: v4.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C8811b {
    /* JADX INFO: renamed from: a */
    public final void m33797a(C2872a c2872a, C3600b c3600b, C3198a c3198a, C5009p c5009p, String str, byte[] bArr) {
        C2293e c2293e = new C2293e(bArr, str, true);
        c2293e.m8382w(C2297i.f6298a);
        c5009p.m20242a(AbstractC3601c.m13471d(c2872a, c2293e, bArr, c3600b, c3198a, c5009p));
    }

    /* JADX INFO: renamed from: b */
    public final int m33798b(C2872a c2872a, C3600b c3600b, C3198a c3198a, C5009p c5009p, InputStream inputStream) throws IOException {
        C2872a c2872a2;
        C3600b c3600b2;
        C3198a c3198a2;
        C5009p c5009p2;
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        int i10 = 0;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return i10;
                }
                if (!nextEntry.isDirectory()) {
                    String name = nextEntry.getName();
                    if (!name.endsWith(".class") || name.startsWith("META-INF/")) {
                        c2872a2 = c2872a;
                        c3600b2 = c3600b;
                        c3198a2 = c3198a;
                        c5009p2 = c5009p;
                    } else {
                        c2872a2 = c2872a;
                        c3600b2 = c3600b;
                        c3198a2 = c3198a;
                        c5009p2 = c5009p;
                        m33797a(c2872a2, c3600b2, c3198a2, c5009p2, name, AbstractC8818i.m33822d(zipInputStream));
                        i10++;
                    }
                    c2872a = c2872a2;
                    c3600b = c3600b2;
                    c3198a = c3198a2;
                    c5009p = c5009p2;
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m33799c(String str) throws IOException {
        C3198a c3198a = new C3198a();
        C3600b c3600b = new C3600b();
        C2872a c2872a = new C2872a();
        C5009p c5009p = new C5009p(c3198a);
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        int iM33798b = 0;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                if (!nextEntry.isDirectory()) {
                    String name = nextEntry.getName();
                    if (name.equals("classes.jar") || (name.startsWith("libs/") && name.endsWith(".jar"))) {
                        iM33798b += m33798b(c2872a, c3600b, c3198a, c5009p, new ByteArrayInputStream(AbstractC8818i.m33822d(zipInputStream)));
                    }
                }
            } finally {
            }
        }
        zipInputStream.close();
        if (iM33798b == 0) {
            C9980b1.m38629a("No class file found in aar ", str);
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c5009p.m20265z(byteArrayOutputStream, null, true);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } finally {
        }
    }

    /* JADX INFO: renamed from: d */
    public ClassLoader m33800d(String str, ClassLoader classLoader) {
        return m33806j(m33799c(str), classLoader);
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m33801e(String str, byte[] bArr) throws IOException {
        C3198a c3198a = new C3198a();
        C3600b c3600b = new C3600b();
        C2872a c2872a = new C2872a();
        String str2 = String.format("%s.class", str.replace('.', '/'));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C5009p c5009p = new C5009p(c3198a);
            m33797a(c2872a, c3600b, c3198a, c5009p, str2, bArr);
            c5009p.m20265z(byteArrayOutputStream, null, true);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } finally {
        }
    }

    /* JADX INFO: renamed from: f */
    public ClassLoader m33802f(String str, byte[] bArr, ClassLoader classLoader) {
        return m33806j(m33801e(str, bArr), classLoader);
    }

    /* JADX INFO: renamed from: g */
    public ClassLoader m33803g(String str, ClassLoader classLoader) {
        return m33806j(Files.readAllBytes(new File(str).toPath()), classLoader);
    }

    /* JADX INFO: renamed from: h */
    public final byte[] m33804h(String str) throws IOException {
        C3198a c3198a = new C3198a();
        C3600b c3600b = new C3600b();
        C2872a c2872a = new C2872a();
        C5009p c5009p = new C5009p(c3198a);
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            int iM33798b = m33798b(c2872a, c3600b, c3198a, c5009p, fileInputStream);
            fileInputStream.close();
            if (iM33798b == 0) {
                C9980b1.m38629a("No class file found in jar ", str);
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                c5009p.m20265z(byteArrayOutputStream, null, true);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: i */
    public ClassLoader m33805i(String str, ClassLoader classLoader) {
        return m33806j(m33804h(str), classLoader);
    }

    /* JADX INFO: renamed from: j */
    public ClassLoader m33806j(byte[] bArr, ClassLoader classLoader) {
        return new InMemoryDexClassLoader(ByteBuffer.wrap(bArr), classLoader);
    }
}
