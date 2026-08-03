package party.iroiro.luajava.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashSet;
import p000.AbstractC0213Ey;
import p000.AbstractC0800Sk;
import p000.C0232Fa;
import p000.C1431fy;
import party.iroiro.luajava.LuaNatives;

/* JADX INFO: loaded from: classes.dex */
public class GlobalLibraryLoader {
    private static final C1431fy loader = new C1431fy();
    private static volatile Class<? extends LuaNatives> loadedNatives = null;
    private static volatile int nativesLoaded = 0;

    public static String load(String str) {
        HashSet hashSet;
        boolean zContains;
        String strM2742f;
        String str2;
        loader.getClass();
        int i = AbstractC0800Sk.f2505a;
        if (i != 5) {
            synchronized (C1431fy.class) {
                try {
                    synchronized (C1431fy.class) {
                        hashSet = C1431fy.f5034a;
                        zContains = hashSet.contains(str);
                    }
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Couldn't load shared library '");
                    sb.append(strM2742f);
                    sb.append("' for target: ");
                    if (AbstractC0800Sk.f2505a == 4) {
                        str2 = "Android";
                    } else {
                        str2 = System.getProperty("os.name") + ", " + AbstractC0213Ey.m422t(AbstractC0800Sk.f2507c) + ", " + AbstractC0213Ey.m421s(AbstractC0800Sk.f2506b).substring(1) + "-bit";
                    }
                    sb.append(str2);
                    throw new C0232Fa(sb.toString(), th);
                } finally {
                }
            }
            if (!zContains) {
                strM2742f = C1431fy.m2742f(str);
                if (i == 4) {
                    System.loadLibrary(strM2742f);
                } else {
                    C1431fy.m2741e(strM2742f);
                }
                synchronized (C1431fy.class) {
                    hashSet.add(str);
                }
            }
        }
        if (i == 5) {
            return "";
        }
        String strM2742f2 = C1431fy.m2742f(str);
        if (i == 4) {
            return strM2742f2;
        }
        String strM2738b = C1431fy.m2738b(readFile(strM2742f2));
        File file = new File[]{new File(System.getProperty("java.io.tmpdir") + "/libgdx" + System.getProperty("user.name") + "/" + strM2738b, strM2742f2)}[0];
        try {
            if (file.exists() && strM2738b.equals(C1431fy.m2738b(new FileInputStream(file)))) {
                return file.toString();
            }
        } catch (FileNotFoundException unused) {
        }
        throw new C0232Fa("Unable to locate the library path");
    }

    private static InputStream readFile(String str) {
        InputStream resourceAsStream = C1431fy.class.getResourceAsStream("/" + str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        throw new C0232Fa(AbstractC0213Ey.m420r("Unable to read file for extraction: ", str));
    }

    public static synchronized void register(Class<? extends LuaNatives> cls, boolean z) {
        if (loadedNatives == null && nativesLoaded == 0) {
            loadedNatives = cls;
            nativesLoaded = !z ? 1 : 0;
            return;
        }
        if (z) {
            if (loadedNatives == cls && nativesLoaded == 1) {
                nativesLoaded = 0;
                return;
            }
            throw new C0232Fa("Library " + loadedNatives.getName() + " already loaded when loading " + cls.getName() + " globally");
        }
        if (loadedNatives != null && nativesLoaded == 0 && loadedNatives != cls) {
            throw new C0232Fa("Global library " + loadedNatives.getName() + " already loaded when loading " + cls.getName());
        }
        loadedNatives = cls;
        nativesLoaded++;
    }
}
