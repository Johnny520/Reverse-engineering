package bsh.loader;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p044d4.C0688a;
import p044d4.C0689b;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BshLoaderHelper {
    private static final ConcurrentMap<String, Class<?>> clazzMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, ClassLoader> loaderMap = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String buildLoaderKey(String str, String str2, ClassLoader classLoader) {
        return str + "#" + str2 + "#" + System.identityHashCode(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class<?> getClassByCode(String str, byte[] bArr, ClassLoader classLoader) {
        String md5ByBytes = DataUtil.getMd5ByBytes(bArr);
        if (md5ByBytes == null) {
            return null;
        }
        return clazzMap.computeIfAbsent(buildLoaderKey(str, md5ByBytes, classLoader), new C0689b(str, bArr, classLoader, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ClassLoader getLoaderByAar(String str, ClassLoader classLoader) {
        String md5ByFilePath = DataUtil.getMd5ByFilePath(str);
        if (md5ByFilePath == null) {
            return null;
        }
        return loaderMap.computeIfAbsent(buildLoaderKey("aar", md5ByFilePath, classLoader), new C0688a(str, classLoader, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ClassLoader getLoaderByDex(String str, ClassLoader classLoader) {
        String md5ByFilePath = DataUtil.getMd5ByFilePath(str);
        if (md5ByFilePath == null) {
            return null;
        }
        return loaderMap.computeIfAbsent(buildLoaderKey("dex", md5ByFilePath, classLoader), new C0688a(str, classLoader, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ClassLoader getLoaderByJar(String str, ClassLoader classLoader) {
        String md5ByFilePath = DataUtil.getMd5ByFilePath(str);
        if (md5ByFilePath == null) {
            return null;
        }
        return loaderMap.computeIfAbsent(buildLoaderKey("jar", md5ByFilePath, classLoader), new C0688a(str, classLoader, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Class lambda$getClassByCode$0(String str, byte[] bArr, ClassLoader classLoader, String str2) {
        try {
            return new BshConvertHelper().convertClassToLoader(str, bArr, classLoader).loadClass(str);
        } catch (Exception e6) {
            System.err.println("[BeanShell] getClassByCode: " + e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ClassLoader lambda$getLoaderByAar$3(String str, ClassLoader classLoader, String str2) {
        try {
            return new BshConvertHelper().convertAarToLoader(str, classLoader);
        } catch (Exception e6) {
            System.err.println("[BeanShell] GetLoaderByAar: " + e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ClassLoader lambda$getLoaderByDex$1(String str, ClassLoader classLoader, String str2) {
        try {
            return new BshConvertHelper().convertDexToLoader(str, classLoader);
        } catch (Exception e6) {
            System.err.println("[BeanShell] GetLoaderByDex: " + e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ClassLoader lambda$getLoaderByJar$2(String str, ClassLoader classLoader, String str2) {
        try {
            return new BshConvertHelper().convertJarToLoader(str, classLoader);
        } catch (Exception e6) {
            System.err.println("[BeanShell] GetLoaderByJar: " + e6);
            return null;
        }
    }

    public static Class<?> getClassByCode(String str, byte[] bArr) {
        return getClassByCode(str, bArr, BshLoaderHelper.class.getClassLoader());
    }
}
