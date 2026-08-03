package bsh.loader;

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
import p025bc.AbstractC0255e;
import p073f4.C1064a;
import p136j8.C2104o;
import p149k4.C2240b;
import p149k4.C2242d;
import p179m4.C2779b;
import p192n4.C2893a;
import p206o4.C3044a;
import p219oh.AbstractC3165h;
import p255r4.C3689p;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BshConvertHelper {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void appendClassToDex(C2779b c2779b, C3044a c3044a, C2893a c2893a, C3689p c3689p, String str, byte[] bArr) {
        C2240b c2240b = new C2240b(str, bArr);
        c2240b.f7426l = C2242d.f7434a;
        try {
            c3689p.m7701a(AbstractC3165h.m6773Y(c2779b, c2240b, c3044a, c2893a, c3689p));
        } catch (RuntimeException e6) {
            throw C1064a.m2686b("...while processing " + c2240b.f7415a, e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private int appendJarToDex(C2779b c2779b, C3044a c3044a, C2893a c2893a, C3689p c3689p, InputStream inputStream) throws IOException {
        C2779b c2779b2;
        C3044a c3044a2;
        C2893a c2893a2;
        C3689p c3689p2;
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        int i9 = 0;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return i9;
                }
                if (!nextEntry.isDirectory()) {
                    String name = nextEntry.getName();
                    if (!name.endsWith(".class") || name.startsWith("META-INF/")) {
                        c2779b2 = c2779b;
                        c3044a2 = c3044a;
                        c2893a2 = c2893a;
                        c3689p2 = c3689p;
                    } else {
                        c2779b2 = c2779b;
                        c3044a2 = c3044a;
                        c2893a2 = c2893a;
                        c3689p2 = c3689p;
                        appendClassToDex(c2779b2, c3044a2, c2893a2, c3689p2, name, DataUtil.readAllBytes(zipInputStream));
                        i9++;
                    }
                    c2779b = c2779b2;
                    c3044a = c3044a2;
                    c2893a = c2893a2;
                    c3689p = c3689p2;
                }
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private byte[] convertAarToDex(String str) throws IOException {
        C2893a c2893a = new C2893a();
        C3044a c3044a = new C3044a();
        C2779b c2779b = new C2779b();
        C3689p c3689p = new C3689p(c2893a);
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        int iAppendJarToDex = 0;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                if (!nextEntry.isDirectory()) {
                    String name = nextEntry.getName();
                    if (name.equals("classes.jar") || (name.startsWith("libs/") && name.endsWith(".jar"))) {
                        iAppendJarToDex += appendJarToDex(c2779b, c3044a, c2893a, c3689p, new ByteArrayInputStream(DataUtil.readAllBytes(zipInputStream)));
                    }
                }
            } finally {
            }
        }
        zipInputStream.close();
        if (iAppendJarToDex == 0) {
            C2104o.m5299y(AbstractC4855en.m9263g("No class file found in aar ", str));
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c3689p.m7704d(byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private byte[] convertClassToDex(String str, byte[] bArr) throws IOException {
        C2893a c2893a = new C2893a();
        C3044a c3044a = new C3044a();
        C2779b c2779b = new C2779b();
        String strM1020i = AbstractC0255e.m1020i(str.replace('.', '/'), ".class");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C3689p c3689p = new C3689p(c2893a);
            appendClassToDex(c2779b, c3044a, c2893a, c3689p, strM1020i, bArr);
            c3689p.m7704d(byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private byte[] convertJarToDex(String str) throws IOException {
        C2893a c2893a = new C2893a();
        C3044a c3044a = new C3044a();
        C2779b c2779b = new C2779b();
        C3689p c3689p = new C3689p(c2893a);
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            int iAppendJarToDex = appendJarToDex(c2779b, c3044a, c2893a, c3689p, fileInputStream);
            fileInputStream.close();
            if (iAppendJarToDex == 0) {
                C2104o.m5299y(AbstractC4855en.m9263g("No class file found in jar ", str));
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                c3689p.m7704d(byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClassLoader convertAarToLoader(String str, ClassLoader classLoader) {
        return createCustomLoader(convertAarToDex(str), classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClassLoader convertClassToLoader(String str, byte[] bArr, ClassLoader classLoader) {
        return createCustomLoader(convertClassToDex(str, bArr), classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClassLoader convertDexToLoader(String str, ClassLoader classLoader) {
        return createCustomLoader(Files.readAllBytes(new File(str).toPath()), classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClassLoader convertJarToLoader(String str, ClassLoader classLoader) {
        return createCustomLoader(convertJarToDex(str), classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClassLoader createCustomLoader(byte[] bArr, ClassLoader classLoader) {
        return new InMemoryDexClassLoader(ByteBuffer.wrap(bArr), classLoader);
    }
}
