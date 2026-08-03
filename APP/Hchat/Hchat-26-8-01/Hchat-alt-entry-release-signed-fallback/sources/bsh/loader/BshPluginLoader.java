package bsh.loader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BshPluginLoader extends java.lang.ClassLoader {
    private final java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> clazzMap;

    public BshPluginLoader(java.lang.ClassLoader r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.clazzMap = r1
            return
    }

    @Override // java.lang.ClassLoader
    public java.lang.Class<?> findClass(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = r1.clazzMap
            java.lang.Object r0 = r0.get(r2)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r0.<init>(r2)
            throw r0
    }

    public void putClass(java.lang.String r2, java.lang.Class<?> r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = r1.clazzMap
            r0.put(r2, r3)
            return
    }
}
