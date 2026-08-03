package party.iroiro.luajava.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashSet;
import p000.AbstractC0213Ey;
import p000.AbstractC0800Sk;
import p000.C0232Fa;
import p000.C1431fy;
import party.iroiro.luajava.LuaNatives;

/* JADX INFO: loaded from: classes.dex */
public class GlobalLibraryLoader {
    private static volatile Class<? extends LuaNatives> loadedNatives;
    private static final C1431fy loader = null;
    private static volatile int nativesLoaded;

    static {
        loader = new C1431fy();
        loadedNatives = null;
        nativesLoaded = 0;
    }

    public GlobalLibraryLoader() {
    }

    public static String load(String r7) {
        loader.getClass();
        int r0 = AbstractC0800Sk.f2505a;
        if (r0 != 5) goto L6;
    L27:
        if (r0 != 5) goto L30;
        return "";
    L30:
        String r72 = C1431fy.m2742f(r7);
        if (r0 != 4) goto L33;
        return r72;
    L33:
        String r02 = C1431fy.m2738b(readFile(r72));
        File r73 = new File[]{new File(System.getProperty("java.io.tmpdir") + "/libgdx" + System.getProperty("user.name") + "/" + r02, r72)}[0];
        if (r73.exists() == false) goto L41;
        if (r02.equals(C1431fy.m2738b(new FileInputStream(r73))) == false) goto L41;
        return r73.toString();
    L41:
        throw new C0232Fa("Unable to locate the library path");
    L6:
        monitor-enter(C1431fy.class);
        monitor-enter(C1431fy.class);     // Catch: Throwable -> L14
        HashSet r5 = C1431fy.f5034a;     // Catch: Throwable -> L51
        boolean r6 = r5.contains(r7);     // Catch: Throwable -> L51
        monitor-exit(C1431fy.class);     // Catch: Throwable -> L14
        if (r6 == false) goto L16;
        monitor-exit(C1431fy.class);     // Catch: Throwable -> L14
        goto L27
    L16:
        String r4 = C1431fy.m2742f(r7);     // Catch: Throwable -> L14
        if (r0 != 4) goto L21;
        System.loadLibrary(r4);     // Catch: Throwable -> L19
    L23:
        monitor-enter(C1431fy.class);     // Catch: Throwable -> L19
        r5.add(r7);     // Catch: Throwable -> L42
        monitor-exit(C1431fy.class);     // Catch: Throwable -> L19
        monitor-exit(C1431fy.class);     // Catch: Throwable -> L14
        goto L27
    L42:
        th = move-exception;
        throw th;     // Catch: Throwable -> L19
    L21:
        C1431fy.m2741e(r4);     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        StringBuilder r2 = new StringBuilder();     // Catch: Throwable -> L14
        r2.append("Couldn't load shared library '");     // Catch: Throwable -> L14
        r2.append(r4);     // Catch: Throwable -> L14
        r2.append("' for target: ");     // Catch: Throwable -> L14
        if (AbstractC0800Sk.f2505a != 4) goto L48;
        String r1 = "Android";
    L49:
        r2.append(r1);     // Catch: Throwable -> L14
        throw new C0232Fa(r2.toString(), th);     // Catch: Throwable -> L14
    L48:
        r1 = System.getProperty("os.name") + ", " + AbstractC0213Ey.m422t(AbstractC0800Sk.f2507c) + ", " + AbstractC0213Ey.m421s(AbstractC0800Sk.f2506b).substring(1) + "-bit";     // Catch: Throwable -> L14
        goto L49
    L51:
        th = move-exception;
        throw th;     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        throw th;
    }

    private static InputStream readFile(String r2) {
        InputStream r0 = C1431fy.class.getResourceAsStream("/" + r2);
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new C0232Fa(AbstractC0213Ey.m420r("Unable to read file for extraction: ", r2));
    }

    public static synchronized void register(Class<? extends LuaNatives> r5, boolean r6) {
        monitor-enter(GlobalLibraryLoader.class);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (loadedNatives == null) goto L7;
    L13:
        if (r6 == false) goto L24;
        if (loadedNatives != r5) goto L22;
        if (nativesLoaded != 1) goto L22;
        nativesLoaded = 0;     // Catch: Throwable -> L11
        monitor-exit(GlobalLibraryLoader.class);
        return;
    L22:
        throw new C0232Fa("Library " + loadedNatives.getName() + " already loaded when loading " + r5.getName() + " globally");     // Catch: Throwable -> L11
    L24:
        if (loadedNatives != null) goto L26;
    L32:
        loadedNatives = r5;     // Catch: Throwable -> L11
        nativesLoaded++;
        monitor-exit(GlobalLibraryLoader.class);
        return;
    L26:
        if (nativesLoaded != 0) goto L32;
        if (loadedNatives == r5) goto L32;
        throw new C0232Fa("Global library " + loadedNatives.getName() + " already loaded when loading " + r5.getName());     // Catch: Throwable -> L11
    L7:
        if (nativesLoaded != 0) goto L13;
        loadedNatives = r5;     // Catch: Throwable -> L11
        nativesLoaded = !r6 ? 1 : 0;     // Catch: Throwable -> L11
        monitor-exit(GlobalLibraryLoader.class);
    }
}
