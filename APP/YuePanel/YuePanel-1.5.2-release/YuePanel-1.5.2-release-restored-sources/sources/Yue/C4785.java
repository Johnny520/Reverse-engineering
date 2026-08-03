package Yue;

import com.bumptech.glide.load.Key;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Properties;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4785 {

    /* JADX INFO: renamed from: ۥ */
    public static boolean f1109;

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ Class f1110;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۦ۠$ۥ */
    public static abstract class AbstractC0489 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC0489() {
        }

        /* JADX INFO: renamed from: ۥ */
        public abstract ClassLoader mo1691();
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۦ۠$ۥ۟ */
    public static class C0490 extends AbstractC0489 {
        public C0490() {
            super();
        }

        @Override // Yue.C4785.AbstractC0489
        /* JADX INFO: renamed from: ۥ */
        public ClassLoader mo1691() {
            return Thread.currentThread().getContextClassLoader();
        }
    }

    static {
        try {
            f1109 = System.getProperty("xml.stream.debug") != null;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static /* synthetic */ Class m1689(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m1690(String str) {
        if (f1109) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("STREAM: ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Object m14455(String str) throws C4783 {
        return m14456(str, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Object m14456(String str, String str2) throws C4783 {
        return m14457(str, str2, m14458());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Object m14457(String str, String str2, ClassLoader classLoader) throws C4783 {
        try {
            String property = System.getProperty(str);
            if (property != null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("found system property");
                stringBuffer.append(property);
                m1690(stringBuffer.toString());
                return m14459(property, classLoader);
            }
        } catch (SecurityException unused) {
        }
        try {
            String property2 = System.getProperty("java.home");
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(property2);
            String str3 = File.separator;
            stringBuffer2.append(str3);
            stringBuffer2.append("lib");
            stringBuffer2.append(str3);
            stringBuffer2.append("jaxp.properties");
            File file = new File(stringBuffer2.toString());
            if (file.exists()) {
                Properties properties = new Properties();
                properties.load(new FileInputStream(file));
                String property3 = properties.getProperty(str);
                if (property3 != null && property3.length() > 0) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("found java.home property ");
                    stringBuffer3.append(property3);
                    m1690(stringBuffer3.toString());
                    return m14459(property3, classLoader);
                }
            }
        } catch (Exception e) {
            if (f1109) {
                e.printStackTrace();
            }
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(C4792.f1116);
        stringBuffer4.append(str);
        String string = stringBuffer4.toString();
        try {
            InputStream systemResourceAsStream = classLoader == null ? ClassLoader.getSystemResourceAsStream(string) : classLoader.getResourceAsStream(string);
            if (systemResourceAsStream != null) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("found ");
                stringBuffer5.append(string);
                m1690(stringBuffer5.toString());
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(systemResourceAsStream, Key.STRING_CHARSET_NAME));
                String line = bufferedReader.readLine();
                bufferedReader.close();
                if (line != null && !"".equals(line)) {
                    StringBuffer stringBuffer6 = new StringBuffer();
                    stringBuffer6.append("loaded from services: ");
                    stringBuffer6.append(line);
                    m1690(stringBuffer6.toString());
                    return m14459(line, classLoader);
                }
            }
        } catch (Exception e2) {
            if (f1109) {
                e2.printStackTrace();
            }
        }
        if (str2 != null) {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append("loaded from fallback value: ");
            stringBuffer7.append(str2);
            m1690(stringBuffer7.toString());
            return m14459(str2, classLoader);
        }
        StringBuffer stringBuffer8 = new StringBuffer();
        stringBuffer8.append("Provider for ");
        stringBuffer8.append(str);
        stringBuffer8.append(" cannot be found");
        throw new C4783(stringBuffer8.toString(), (Exception) null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static ClassLoader m14458() throws C4783 {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            Class clsM1689 = f1110;
            if (clsM1689 == null) {
                clsM1689 = m1689("javax.xml.stream.FactoryFinder");
                f1110 = clsM1689;
            }
            stringBuffer.append(clsM1689.getName());
            stringBuffer.append("$ClassLoaderFinderConcrete");
            return ((AbstractC0489) Class.forName(stringBuffer.toString()).newInstance()).mo1691();
        } catch (ClassNotFoundException unused) {
            Class clsM16892 = f1110;
            if (clsM16892 == null) {
                clsM16892 = m1689("javax.xml.stream.FactoryFinder");
                f1110 = clsM16892;
            }
            return clsM16892.getClassLoader();
        } catch (Exception e) {
            throw new C4783(e.toString(), e);
        } catch (LinkageError unused2) {
            Class clsM16893 = f1110;
            if (clsM16893 == null) {
                clsM16893 = m1689("javax.xml.stream.FactoryFinder");
                f1110 = clsM16893;
            }
            return clsM16893.getClassLoader();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Object m14459(String str, ClassLoader classLoader) throws C4783 {
        try {
            return (classLoader == null ? Class.forName(str) : classLoader.loadClass(str)).newInstance();
        } catch (ClassNotFoundException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Provider ");
            stringBuffer.append(str);
            stringBuffer.append(" not found");
            throw new C4783(stringBuffer.toString(), e);
        } catch (Exception e2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Provider ");
            stringBuffer2.append(str);
            stringBuffer2.append(" could not be instantiated: ");
            stringBuffer2.append(e2);
            throw new C4783(stringBuffer2.toString(), e2);
        }
    }
}
