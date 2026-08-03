package Yue;

import com.bumptech.glide.load.Key;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4792 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C4792 f1115 = new C4792();

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final String f1116 = "META-INF/services/";

    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC5919 m1696(Class<InterfaceC5919> cls, String str) {
        try {
            return cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final <S> S m1697(String str, ClassLoader classLoader, Class<S> cls) throws ClassNotFoundException {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(null).newInstance(null));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final <S> List<S> m14470(Class<S> cls, ClassLoader classLoader) {
        try {
            return m14472(cls, classLoader);
        } catch (Throwable unused) {
            return C3888.m11062(ServiceLoader.load(cls, classLoader));
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final List<InterfaceC5919> m14471() {
        InterfaceC5919 interfaceC5919;
        if (!C4793.m1698()) {
            return m14470(InterfaceC5919.class, InterfaceC5919.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            InterfaceC5919 interfaceC59192 = null;
            try {
                interfaceC5919 = (InterfaceC5919) InterfaceC5919.class.cast(Class.forName("Yue.ۥ۟۠ۤۧ", true, InterfaceC5919.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            } catch (ClassNotFoundException unused) {
                interfaceC5919 = null;
            }
            if (interfaceC5919 != null) {
                arrayList.add(interfaceC5919);
            }
            try {
                interfaceC59192 = (InterfaceC5919) InterfaceC5919.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, InterfaceC5919.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            } catch (ClassNotFoundException unused2) {
            }
            if (interfaceC59192 == null) {
                return arrayList;
            }
            arrayList.add(interfaceC59192);
            return arrayList;
        } catch (Throwable unused3) {
            return m14470(InterfaceC5919.class, InterfaceC5919.class.getClassLoader());
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final <S> List<S> m14472(@InterfaceC6399 Class<S> cls, @InterfaceC6399 ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources(f1116 + cls.getName()));
        C5499.m17102(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3885.m10772(arrayList, f1115.m14473((URL) it.next()));
        }
        Set setM11067 = C3888.m11067(arrayList);
        if (!(!setM11067.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        ArrayList arrayList2 = new ArrayList(C3881.m10756(setM11067, 10));
        Iterator it2 = setM11067.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f1115.m1697((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final List<String> m14473(URL url) throws IOException {
        BufferedReader bufferedReader;
        String string = url.toString();
        if (!C7627.m24008(string, "jar", false, 2, null)) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> listM14474 = f1115.m14474(bufferedReader);
                C3849.m904(bufferedReader, null);
                return listM14474;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        String strM24166 = C7628.m24166(C7628.m24159(string, "jar:file:", null, 2, null), PublicSuffixDatabase.f30961, null, 2, null);
        String strM24159 = C7628.m24159(string, "!/", null, 2, null);
        JarFile jarFile = new JarFile(strM24166, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strM24159)), Key.STRING_CHARSET_NAME));
            try {
                List<String> listM144742 = f1115.m14474(bufferedReader);
                C3849.m904(bufferedReader, null);
                jarFile.close();
                return listM144742;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    jarFile.close();
                    throw th3;
                } catch (Throwable th4) {
                    C4741.m1656(th2, th4);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final List<String> m14474(BufferedReader bufferedReader) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return C3888.m11062(linkedHashSet);
            }
            String string = C7628.m24174(C7628.m24167(line, "#", null, 2, null)).toString();
            for (int i = 0; i < string.length(); i++) {
                char cCharAt = string.charAt(i);
                if (cCharAt != '.' && !Character.isJavaIdentifierPart(cCharAt)) {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + string).toString());
                }
            }
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final <R> R m14475(JarFile jarFile, InterfaceC5124<? super JarFile, ? extends R> interfaceC5124) throws IOException {
        try {
            R rInvoke = interfaceC5124.invoke(jarFile);
            C5437.m16930(1);
            jarFile.close();
            C5437.m16929(1);
            return rInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C5437.m16930(1);
                try {
                    jarFile.close();
                    C5437.m16929(1);
                    throw th2;
                } catch (Throwable th3) {
                    C4741.m1656(th, th3);
                    throw th;
                }
            }
        }
    }
}
