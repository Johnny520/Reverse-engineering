package bsh.loader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BshLoaderManager {
    private final java.util.HashSet<java.lang.ClassLoader> loaders;

    public BshLoaderManager() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.loaders = r0
            return
    }

    public void addClassLoader(java.lang.ClassLoader r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.HashSet<java.lang.ClassLoader> r0 = r1.loaders
            r0.add(r2)
        L7:
            return
    }

    public java.lang.Class<?> getLoaderClass(java.lang.String r4) {
            r3 = this;
            java.util.HashSet<java.lang.ClassLoader> r0 = r3.loaders
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r0.next()
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1
            java.lang.Class r4 = r1.loadClass(r4)     // Catch: java.lang.ClassNotFoundException -> L6
            return r4
        L17:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[BeanShell] GetLoaderClass: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " is null"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.println(r4)
            r4 = 0
            return r4
    }
}
