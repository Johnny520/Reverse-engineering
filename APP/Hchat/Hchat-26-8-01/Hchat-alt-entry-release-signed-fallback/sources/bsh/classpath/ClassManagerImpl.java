package bsh.classpath;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ClassManagerImpl extends bsh.BshClassManager {
    static final java.lang.String BSH_PACKAGE = "bsh";
    private bsh.classpath.BshClassPath baseClassPath;
    private bsh.classpath.BshClassLoader baseLoader;
    private bsh.classpath.BshClassPath fullClassPath;
    private final java.util.Set<java.lang.ref.WeakReference<bsh.BshClassManager.Listener>> listeners;
    private final java.util.Map<java.lang.String, bsh.classpath.DiscreteFilesClassLoader> loaderMap;
    private final java.lang.ref.ReferenceQueue<bsh.BshClassManager.Listener> refQueue;
    private boolean superImport;

    public ClassManagerImpl() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r1.listeners = r0
            java.lang.ref.ReferenceQueue r0 = new java.lang.ref.ReferenceQueue
            r0.<init>()
            r1.refQueue = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.loaderMap = r0
            r1.reset()
            return
    }

    private void initBaseLoader() {
            r2 = this;
            bsh.classpath.BshClassLoader r0 = new bsh.classpath.BshClassLoader
            bsh.classpath.BshClassPath r1 = r2.baseClassPath
            r0.<init>(r2, r1)
            r2.baseLoader = r0
            return
    }

    private void initPluginLoader() {
            r2 = this;
            bsh.loader.BshPluginLoader r0 = new bsh.loader.BshPluginLoader
            java.lang.ClassLoader r1 = r2.externalClassLoader
            if (r1 == 0) goto L7
            goto Lf
        L7:
            java.lang.Class r1 = r2.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
        Lf:
            r0.<init>(r1)
            r2.pluginLoader = r0
            return
    }

    @Override // bsh.BshClassManager
    public void addClassPath(java.net.URL r2) {
            r1 = this;
            bsh.classpath.BshClassLoader r0 = r1.baseLoader
            if (r0 != 0) goto Lc
            java.net.URL[] r2 = new java.net.URL[]{r2}
            r1.setClassPath(r2)
            return
        Lc:
            r0.addURL(r2)
            bsh.classpath.BshClassPath r0 = r1.baseClassPath
            r0.add(r2)
            r1.classLoaderChanged()
            return
    }

    @Override // bsh.BshClassManager
    public void addListener(bsh.BshClassManager.Listener r4) {
            r3 = this;
            java.util.Set<java.lang.ref.WeakReference<bsh.BshClassManager$Listener>> r0 = r3.listeners
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            java.lang.ref.ReferenceQueue<bsh.BshClassManager$Listener> r2 = r3.refQueue
            r1.<init>(r4, r2)
            r0.add(r1)
        Lc:
            java.lang.ref.ReferenceQueue<bsh.BshClassManager$Listener> r4 = r3.refQueue
            java.lang.ref.Reference r4 = r4.poll()
            if (r4 == 0) goto L26
            java.util.Set<java.lang.ref.WeakReference<bsh.BshClassManager$Listener>> r0 = r3.listeners
            boolean r0 = r0.remove(r4)
            if (r0 != 0) goto Lc
            java.lang.String r0 = "tried to remove non-existent weak ref: "
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4}
            bsh.Interpreter.debug(r4)
            goto Lc
        L26:
            return
    }

    @Override // bsh.BshClassManager
    public java.lang.Class<?> classForName(java.lang.String r6) {
            r5 = this;
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = r5.absoluteClassCache
            java.lang.Object r0 = r0.get(r6)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.util.Set<java.lang.String> r1 = r5.absoluteNonClasses
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L1e
            java.lang.String r0 = "absoluteNonClass list hit: "
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r6}
            bsh.Interpreter.debug(r6)
            r6 = 0
            return r6
        L1e:
            java.lang.String r1 = "Trying to load class: "
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r6}
            bsh.Interpreter.debug(r1)
            java.lang.ClassLoader r1 = r5.getLoaderForClass(r6)
            if (r1 == 0) goto L3e
            java.lang.Class r0 = r1.loadClass(r6)     // Catch: java.lang.Exception -> L32
            goto L3e
        L32:
            r1 = move-exception
            java.lang.String r2 = "overlay loader failed for '"
            java.lang.String r3 = "' - "
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r3, r1}
            bsh.Interpreter.debug(r1)
        L3e:
            if (r0 != 0) goto L59
            java.lang.String r1 = "bsh"
            boolean r1 = r6.startsWith(r1)
            if (r1 == 0) goto L59
            java.lang.Class<bsh.Interpreter> r1 = bsh.Interpreter.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r1 == 0) goto L55
            java.lang.Class r0 = r1.loadClass(r6)     // Catch: java.lang.Throwable -> L59
            goto L59
        L55:
            java.lang.Class r0 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L59
        L59:
            if (r0 != 0) goto L63
            bsh.classpath.BshClassLoader r1 = r5.baseLoader
            if (r1 == 0) goto L63
            java.lang.Class r0 = r1.loadClass(r6)     // Catch: java.lang.ClassNotFoundException -> L63
        L63:
            if (r0 != 0) goto L6d
            java.lang.ClassLoader r1 = r5.externalClassLoader
            if (r1 == 0) goto L6d
            java.lang.Class r0 = r1.loadClass(r6)     // Catch: java.lang.ClassNotFoundException -> L6d
        L6d:
            if (r0 != 0) goto L7e
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L7e
            java.lang.ClassLoader r1 = r1.getContextClassLoader()     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L7e
            r2 = 1
            java.lang.Class r0 = java.lang.Class.forName(r6, r2, r1)     // Catch: java.lang.Throwable -> L7e
        L7e:
            if (r0 != 0) goto L9e
            java.lang.Class r0 = java.lang.Class.forName(r6)     // Catch: java.lang.NoClassDefFoundError -> L85 java.lang.ClassNotFoundException -> L9e
            goto L9e
        L85:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.String r3 = "The class named '"
            java.lang.String r4 = "' could not be found, either because it no longer exists or it is not contained in the class file of the same name. Caused by: "
            java.lang.StringBuilder r3 = bc.e.o(r3, r6, r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.println(r1)
        L9e:
            if (r0 != 0) goto La4
            java.lang.Class r0 = r5.loadSourceClass(r6)
        La4:
            r5.cacheClassInfo(r6, r0)
            return r0
    }

    @Override // bsh.BshClassManager
    public void classLoaderChanged() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set<java.lang.ref.WeakReference<bsh.BshClassManager$Listener>> r1 = r4.listeners
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            bsh.BshClassManager$Listener r3 = (bsh.BshClassManager.Listener) r3
            if (r3 != 0) goto L23
            r0.add(r2)
            goto Lb
        L23:
            r3.classLoaderChanged()
            goto Lb
        L27:
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.util.Set<java.lang.ref.WeakReference<bsh.BshClassManager$Listener>> r2 = r4.listeners
            r2.remove(r1)
            goto L2b
        L3d:
            return
    }

    @Override // bsh.BshClassManager
    public java.lang.Class<?> defineClass(java.lang.String r3, byte[] r4) {
            r2 = this;
            bsh.classpath.BshClassPath r0 = r2.baseClassPath
            bsh.classpath.BshClassPath$GeneratedClassSource r1 = new bsh.classpath.BshClassPath$GeneratedClassSource
            r1.<init>(r4)
            r0.setClassSource(r3, r1)
            java.lang.String[] r4 = new java.lang.String[]{r3}     // Catch: bsh.ClassPathException -> L16
            r2.reloadClasses(r4)     // Catch: bsh.ClassPathException -> L16
            java.lang.Class r3 = r2.classForName(r3)
            return r3
        L16:
            r3 = move-exception
            java.lang.String r4 = "defineClass: "
            bsh.j.d(r4, r3)
            r3 = 0
            return r3
    }

    @Override // bsh.BshClassManager
    public void doSuperImport() {
            r4 = this;
            bsh.classpath.BshClassPath r0 = r4.getClassPath()     // Catch: bsh.ClassPathException -> L10
            r0.insureInitialized()     // Catch: bsh.ClassPathException -> L10
            java.lang.String r0 = ""
            r4.getClassNameByUnqName(r0)     // Catch: bsh.ClassPathException -> L10
            r0 = 1
            r4.superImport = r0
            return
        L10:
            r0 = move-exception
            bsh.UtilEvalError r1 = new bsh.UtilEvalError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error importing classpath "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // bsh.BshClassManager
    public void dump(java.io.PrintWriter r4) {
            r3 = this;
            java.lang.String r0 = "Bsh Class Manager Dump: "
            r4.println(r0)
            java.lang.String r0 = "----------------------- "
            r4.println(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "baseLoader = "
            r1.<init>(r2)
            bsh.classpath.BshClassLoader r2 = r3.baseLoader
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.println(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "loaderMap= "
            r1.<init>(r2)
            java.util.Map<java.lang.String, bsh.classpath.DiscreteFilesClassLoader> r2 = r3.loaderMap
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.println(r1)
            r4.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "baseClassPath = "
            r0.<init>(r1)
            bsh.classpath.BshClassPath r1 = r3.baseClassPath
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.println(r0)
            return
    }

    public java.lang.ClassLoader getBaseLoader() {
            r1 = this;
            bsh.classpath.BshClassLoader r0 = r1.baseLoader
            return r0
    }

    @Override // bsh.BshClassManager
    public java.lang.String getClassNameByUnqName(java.lang.String r2) {
            r1 = this;
            bsh.classpath.BshClassPath r0 = r1.getClassPath()
            java.lang.String r2 = r0.getClassNameByUnqName(r2)
            return r2
    }

    public bsh.classpath.BshClassPath getClassPath() {
            r2 = this;
            bsh.classpath.BshClassPath r0 = r2.fullClassPath
            if (r0 == 0) goto L5
            return r0
        L5:
            bsh.classpath.BshClassPath r0 = new bsh.classpath.BshClassPath
            java.lang.String r1 = "BeanShell Full Class Path"
            r0.<init>(r1)
            r2.fullClassPath = r0
            bsh.classpath.BshClassPath r1 = bsh.classpath.BshClassPath.getUserClassPath()
            r0.addComponent(r1)
            bsh.classpath.BshClassPath r0 = r2.fullClassPath     // Catch: bsh.ClassPathException -> L1f
            bsh.classpath.BshClassPath r1 = bsh.classpath.BshClassPath.getBootClassPath()     // Catch: bsh.ClassPathException -> L1f
            r0.addComponent(r1)     // Catch: bsh.ClassPathException -> L1f
            goto L26
        L1f:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Warning: can't get boot class path"
            r0.println(r1)
        L26:
            bsh.classpath.BshClassPath r0 = r2.fullClassPath
            bsh.classpath.BshClassPath r1 = r2.baseClassPath
            r0.addComponent(r1)
            bsh.classpath.BshClassPath r0 = r2.fullClassPath
            return r0
    }

    public java.lang.ClassLoader getLoaderForClass(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, bsh.classpath.DiscreteFilesClassLoader> r0 = r1.loaderMap
            java.lang.Object r2 = r0.get(r2)
            java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2
            return r2
    }

    @Override // bsh.BshClassManager
    public java.net.URL getResource(java.lang.String r3) {
            r2 = this;
            bsh.classpath.BshClassLoader r0 = r2.baseLoader
            if (r0 == 0) goto Le
            r1 = 1
            java.lang.String r1 = r3.substring(r1)
            java.net.URL r0 = r0.getResource(r1)
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L16
            java.net.URL r3 = super.getResource(r3)
            return r3
        L16:
            return r0
    }

    @Override // bsh.BshClassManager
    public java.io.InputStream getResourceAsStream(java.lang.String r3) {
            r2 = this;
            bsh.classpath.BshClassLoader r0 = r2.baseLoader
            if (r0 == 0) goto Le
            r1 = 1
            java.lang.String r1 = r3.substring(r1)
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L16
            java.io.InputStream r3 = super.getResourceAsStream(r3)
            return r3
        L16:
            return r0
    }

    @Override // bsh.BshClassManager
    public boolean hasSuperImport() {
            r1 = this;
            boolean r0 = r1.superImport
            return r0
    }

    @Override // bsh.BshClassManager
    public java.lang.Class<?> loadGeneratedClass(java.lang.String r2, byte[] r3) {
            r1 = this;
            bsh.loader.BshPluginLoader r0 = r1.pluginLoader
            java.lang.Class r3 = bsh.loader.BshLoaderHelper.getClassByCode(r2, r3, r0)
            bsh.loader.BshPluginLoader r0 = r1.pluginLoader
            r0.putClass(r2, r3)
            return r3
    }

    @Override // bsh.BshClassManager
    public void reloadAllClasses() {
            r2 = this;
            bsh.classpath.BshClassPath r0 = new bsh.classpath.BshClassPath
            java.lang.String r1 = "temp"
            r0.<init>(r1)
            bsh.classpath.BshClassPath r1 = r2.baseClassPath
            r0.addComponent(r1)
            bsh.classpath.BshClassPath r1 = bsh.classpath.BshClassPath.getUserClassPath()
            r0.addComponent(r1)
            java.net.URL[] r0 = r0.getPathComponents()
            r2.setClassPath(r0)
            return
    }

    @Override // bsh.BshClassManager
    public void reloadClasses(java.lang.String[] r6) {
            r5 = this;
            r5.clearCaches()
            bsh.classpath.BshClassLoader r0 = r5.baseLoader
            if (r0 != 0) goto La
            r5.initBaseLoader()
        La:
            bsh.classpath.DiscreteFilesClassLoader$ClassSourceMap r0 = new bsh.classpath.DiscreteFilesClassLoader$ClassSourceMap
            r0.<init>()
            r1 = 0
        L10:
            int r2 = r6.length
            if (r1 >= r2) goto L60
            r2 = r6[r1]
            bsh.classpath.BshClassPath r3 = r5.baseClassPath
            bsh.classpath.BshClassPath$ClassSource r3 = r3.getClassSource(r2)
            if (r3 != 0) goto L2c
            bsh.classpath.BshClassPath r3 = bsh.classpath.BshClassPath.getUserClassPath()
            r3.insureInitialized()
            bsh.classpath.BshClassPath r3 = bsh.classpath.BshClassPath.getUserClassPath()
            bsh.classpath.BshClassPath$ClassSource r3 = r3.getClassSource(r2)
        L2c:
            if (r3 == 0) goto L54
            boolean r4 = r3 instanceof bsh.classpath.BshClassPath.JarClassSource
            if (r4 != 0) goto L38
            r0.put(r2, r3)
            int r1 = r1 + 1
            goto L10
        L38:
            bsh.ClassPathException r6 = new bsh.ClassPathException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot reload class: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " from source: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L54:
            bsh.ClassPathException r6 = new bsh.ClassPathException
            java.lang.String r0 = "Nothing known about class: "
            java.lang.String r0 = wb.en.g(r0, r2)
            r6.<init>(r0)
            throw r6
        L60:
            bsh.classpath.DiscreteFilesClassLoader.newInstance(r5, r0)
            java.util.Set r6 = r0.keySet()
            java.util.Iterator r6 = r6.iterator()
        L6b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L81
            java.util.Map<java.lang.String, bsh.classpath.DiscreteFilesClassLoader> r0 = r5.loaderMap
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            bsh.classpath.DiscreteFilesClassLoader r2 = bsh.classpath.DiscreteFilesClassLoader.instance()
            r0.put(r1, r2)
            goto L6b
        L81:
            r5.classLoaderChanged()
            return
    }

    @Override // bsh.BshClassManager
    public void reloadPackage(java.lang.String r3) {
            r2 = this;
            bsh.classpath.BshClassPath r0 = r2.baseClassPath
            java.util.Set r0 = r0.getClassesForPackage(r3)
            if (r0 != 0) goto L10
            bsh.classpath.BshClassPath r0 = bsh.classpath.BshClassPath.getUserClassPath()
            java.util.Set r0 = r0.getClassesForPackage(r3)
        L10:
            if (r0 == 0) goto L22
            int r3 = r0.size()
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r2.reloadClasses(r3)
            return
        L22:
            bsh.ClassPathException r0 = new bsh.ClassPathException
            java.lang.String r1 = "No classes found for package: "
            java.lang.String r3 = wb.en.g(r1, r3)
            r0.<init>(r3)
            throw r0
    }

    @Override // bsh.BshClassManager
    public void removeListener(bsh.BshClassManager.Listener r2) {
            r1 = this;
            java.lang.Error r2 = new java.lang.Error
            java.lang.String r0 = "unimplemented"
            r2.<init>(r0)
            throw r2
    }

    @Override // bsh.BshClassManager
    public void reset() {
            r2 = this;
            bsh.classpath.BshClassPath r0 = new bsh.classpath.BshClassPath
            java.lang.String r1 = "baseClassPath"
            r0.<init>(r1)
            r2.baseClassPath = r0
            r0 = 0
            r2.baseLoader = r0
            java.util.Map<java.lang.String, bsh.classpath.DiscreteFilesClassLoader> r0 = r2.loaderMap
            r0.clear()
            r2.initPluginLoader()
            r2.classLoaderChanged()
            return
    }

    @Override // bsh.BshClassManager
    public void setClassPath(java.net.URL[] r2) {
            r1 = this;
            bsh.classpath.BshClassPath r0 = r1.baseClassPath
            r0.setPath(r2)
            r1.initBaseLoader()
            java.util.Map<java.lang.String, bsh.classpath.DiscreteFilesClassLoader> r2 = r1.loaderMap
            r2.clear()
            r1.classLoaderChanged()
            return
    }
}
