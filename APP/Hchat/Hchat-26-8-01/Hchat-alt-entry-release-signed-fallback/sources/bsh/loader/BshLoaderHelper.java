package bsh.loader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BshLoaderHelper {
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> clazzMap = null;
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.ClassLoader> loaderMap = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            bsh.loader.BshLoaderHelper.clazzMap = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            bsh.loader.BshLoaderHelper.loaderMap = r0
            return
    }

    public BshLoaderHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.Class a(java.lang.String r0, byte[] r1, java.lang.ClassLoader r2, java.lang.String r3) {
            java.lang.Class r0 = lambda$getClassByCode$0(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.ClassLoader b(java.lang.String r0, java.lang.ClassLoader r1, java.lang.String r2) {
            java.lang.ClassLoader r0 = lambda$getLoaderByJar$2(r0, r1, r2)
            return r0
    }

    private static java.lang.String buildLoaderKey(java.lang.String r1, java.lang.String r2, java.lang.ClassLoader r3) {
            int r3 = java.lang.System.identityHashCode(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            r0.append(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static /* synthetic */ java.lang.ClassLoader c(java.lang.String r0, java.lang.ClassLoader r1, java.lang.String r2) {
            java.lang.ClassLoader r0 = lambda$getLoaderByDex$1(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.ClassLoader d(java.lang.String r0, java.lang.ClassLoader r1, java.lang.String r2) {
            java.lang.ClassLoader r0 = lambda$getLoaderByAar$3(r0, r1, r2)
            return r0
    }

    public static java.lang.Class<?> getClassByCode(java.lang.String r1, byte[] r2) {
            java.lang.Class<bsh.loader.BshLoaderHelper> r0 = bsh.loader.BshLoaderHelper.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Class r1 = getClassByCode(r1, r2, r0)
            return r1
    }

    public static java.lang.Class<?> getClassByCode(java.lang.String r4, byte[] r5, java.lang.ClassLoader r6) {
            java.lang.String r0 = bsh.loader.DataUtil.getMd5ByBytes(r5)
            if (r0 != 0) goto L8
            r4 = 0
            return r4
        L8:
            java.lang.String r0 = buildLoaderKey(r4, r0, r6)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r1 = bsh.loader.BshLoaderHelper.clazzMap
            d4.b r2 = new d4.b
            r3 = 0
            r2.<init>(r4, r5, r6, r3)
            java.lang.Object r4 = r1.computeIfAbsent(r0, r2)
            java.lang.Class r4 = (java.lang.Class) r4
            return r4
    }

    public static java.lang.ClassLoader getLoaderByAar(java.lang.String r4, java.lang.ClassLoader r5) {
            java.lang.String r0 = bsh.loader.DataUtil.getMd5ByFilePath(r4)
            if (r0 != 0) goto L8
            r4 = 0
            return r4
        L8:
            java.lang.String r1 = "aar"
            java.lang.String r0 = buildLoaderKey(r1, r0, r5)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.ClassLoader> r1 = bsh.loader.BshLoaderHelper.loaderMap
            d4.a r2 = new d4.a
            r3 = 2
            r2.<init>(r4, r5, r3)
            java.lang.Object r4 = r1.computeIfAbsent(r0, r2)
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4
            return r4
    }

    public static java.lang.ClassLoader getLoaderByDex(java.lang.String r4, java.lang.ClassLoader r5) {
            java.lang.String r0 = bsh.loader.DataUtil.getMd5ByFilePath(r4)
            if (r0 != 0) goto L8
            r4 = 0
            return r4
        L8:
            java.lang.String r1 = "dex"
            java.lang.String r0 = buildLoaderKey(r1, r0, r5)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.ClassLoader> r1 = bsh.loader.BshLoaderHelper.loaderMap
            d4.a r2 = new d4.a
            r3 = 1
            r2.<init>(r4, r5, r3)
            java.lang.Object r4 = r1.computeIfAbsent(r0, r2)
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4
            return r4
    }

    public static java.lang.ClassLoader getLoaderByJar(java.lang.String r4, java.lang.ClassLoader r5) {
            java.lang.String r0 = bsh.loader.DataUtil.getMd5ByFilePath(r4)
            if (r0 != 0) goto L8
            r4 = 0
            return r4
        L8:
            java.lang.String r1 = "jar"
            java.lang.String r0 = buildLoaderKey(r1, r0, r5)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.ClassLoader> r1 = bsh.loader.BshLoaderHelper.loaderMap
            d4.a r2 = new d4.a
            r3 = 0
            r2.<init>(r4, r5, r3)
            java.lang.Object r4 = r1.computeIfAbsent(r0, r2)
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4
            return r4
    }

    private static /* synthetic */ java.lang.Class lambda$getClassByCode$0(java.lang.String r0, byte[] r1, java.lang.ClassLoader r2, java.lang.String r3) {
            bsh.loader.BshConvertHelper r3 = new bsh.loader.BshConvertHelper     // Catch: java.lang.Exception -> Le
            r3.<init>()     // Catch: java.lang.Exception -> Le
            java.lang.ClassLoader r1 = r3.convertClassToLoader(r0, r1, r2)     // Catch: java.lang.Exception -> Le
            java.lang.Class r0 = r1.loadClass(r0)     // Catch: java.lang.Exception -> Le
            return r0
        Le:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[BeanShell] getClassByCode: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.println(r0)
            r0 = 0
            return r0
    }

    private static /* synthetic */ java.lang.ClassLoader lambda$getLoaderByAar$3(java.lang.String r1, java.lang.ClassLoader r2, java.lang.String r3) {
            bsh.loader.BshConvertHelper r3 = new bsh.loader.BshConvertHelper     // Catch: java.lang.Exception -> La
            r3.<init>()     // Catch: java.lang.Exception -> La
            java.lang.ClassLoader r1 = r3.convertAarToLoader(r1, r2)     // Catch: java.lang.Exception -> La
            return r1
        La:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "[BeanShell] GetLoaderByAar: "
            r3.<init>(r0)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.println(r1)
            r1 = 0
            return r1
    }

    private static /* synthetic */ java.lang.ClassLoader lambda$getLoaderByDex$1(java.lang.String r1, java.lang.ClassLoader r2, java.lang.String r3) {
            bsh.loader.BshConvertHelper r3 = new bsh.loader.BshConvertHelper     // Catch: java.lang.Exception -> La
            r3.<init>()     // Catch: java.lang.Exception -> La
            java.lang.ClassLoader r1 = r3.convertDexToLoader(r1, r2)     // Catch: java.lang.Exception -> La
            return r1
        La:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "[BeanShell] GetLoaderByDex: "
            r3.<init>(r0)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.println(r1)
            r1 = 0
            return r1
    }

    private static /* synthetic */ java.lang.ClassLoader lambda$getLoaderByJar$2(java.lang.String r1, java.lang.ClassLoader r2, java.lang.String r3) {
            bsh.loader.BshConvertHelper r3 = new bsh.loader.BshConvertHelper     // Catch: java.lang.Exception -> La
            r3.<init>()     // Catch: java.lang.Exception -> La
            java.lang.ClassLoader r1 = r3.convertJarToLoader(r1, r2)     // Catch: java.lang.Exception -> La
            return r1
        La:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "[BeanShell] GetLoaderByJar: "
            r3.<init>(r0)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.println(r1)
            r1 = 0
            return r1
    }
}
