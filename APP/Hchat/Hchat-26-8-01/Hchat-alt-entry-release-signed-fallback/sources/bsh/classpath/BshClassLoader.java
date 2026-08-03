package bsh.classpath;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BshClassLoader extends java.net.URLClassLoader {
    bsh.BshClassManager classManager;

    public BshClassLoader(bsh.BshClassManager r2) {
            r1 = this;
            r0 = 0
            java.net.URL[] r0 = new java.net.URL[r0]
            r1.<init>(r2, r0)
            return
    }

    public BshClassLoader(bsh.BshClassManager r1, bsh.classpath.BshClassPath r2) {
            r0 = this;
            java.net.URL[] r2 = r2.getPathComponents()
            r0.<init>(r1, r2)
            return
    }

    public BshClassLoader(bsh.BshClassManager r1, java.net.URL[] r2) {
            r0 = this;
            r0.<init>(r2)
            r0.classManager = r1
            return
    }

    @Override // java.net.URLClassLoader
    public void addURL(java.net.URL r1) {
            r0 = this;
            super.addURL(r1)
            return
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public java.lang.Class findClass(java.lang.String r4) {
            r3 = this;
            bsh.BshClassManager r0 = r3.getClassManager()
            bsh.classpath.ClassManagerImpl r0 = (bsh.classpath.ClassManagerImpl) r0
            java.lang.ClassLoader r1 = r0.getLoaderForClass(r4)
            if (r1 == 0) goto L28
            if (r1 == r3) goto L28
            java.lang.Class r4 = r1.loadClass(r4)     // Catch: java.lang.ClassNotFoundException -> L13
            return r4
        L13:
            r4 = move-exception
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Designated loader could not find class: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L28:
            java.net.URL[] r1 = r3.getURLs()
            int r1 = r1.length
            if (r1 <= 0) goto L34
            java.lang.Class r4 = super.findClass(r4)     // Catch: java.lang.ClassNotFoundException -> L34
            return r4
        L34:
            java.lang.ClassLoader r1 = r0.getBaseLoader()
            if (r1 == 0) goto L41
            if (r1 == r3) goto L41
            java.lang.Class r4 = r1.loadClass(r4)     // Catch: java.lang.ClassNotFoundException -> L41
            return r4
        L41:
            java.lang.Class r4 = r0.plainClassForName(r4)
            return r4
    }

    public bsh.BshClassManager getClassManager() {
            r1 = this;
            bsh.BshClassManager r0 = r1.classManager
            return r0
    }

    @Override // java.lang.ClassLoader
    public java.lang.Class loadClass(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "java."
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto Ld
            java.lang.Class r2 = super.loadClass(r2, r3)
            return r2
        Ld:
            java.lang.Class r0 = r1.findLoadedClass(r2)
            if (r0 == 0) goto L14
            return r0
        L14:
            java.lang.String r0 = "bsh"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L29
            java.lang.Class<bsh.Interpreter> r0 = bsh.Interpreter.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 == 0) goto L29
            java.lang.Class r2 = r0.loadClass(r2)     // Catch: java.lang.ClassNotFoundException -> L29
            return r2
        L29:
            java.lang.Class r2 = r1.findClass(r2)
            if (r3 == 0) goto L32
            r1.resolveClass(r2)
        L32:
            return r2
    }
}
