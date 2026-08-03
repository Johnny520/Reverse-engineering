package bsh.classpath;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BshClassPath implements bsh.classpath.ClassPathListener, bsh.NameSource {
    private static bsh.classpath.BshClassPath bootClassPath;
    private static final java.util.regex.Pattern dotClass = null;
    private static bsh.classpath.BshClassPath.MappingFeedback mappingFeedbackListener;
    private static final java.util.regex.Pattern moduleName = null;
    private static final java.util.regex.Pattern slashDot = null;
    private static final java.util.regex.Pattern splitClass = null;
    private static bsh.classpath.BshClassPath userClassPath;
    private static java.net.URL[] userClassPathComp;
    private final java.util.Map<java.lang.String, bsh.classpath.BshClassPath.ClassSource> classSource;
    private final java.util.Set<bsh.classpath.BshClassPath> compPaths;
    java.util.Vector<java.lang.ref.WeakReference<bsh.classpath.ClassPathListener>> listeners;
    private boolean mapsInitialized;
    java.lang.String name;
    private boolean nameCompletionIncludesUnqNames;
    private java.util.List<bsh.NameSource.Listener> nameSourceListeners;
    private final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> packageMap;
    private final java.util.Set<java.net.URL> path;
    private bsh.classpath.BshClassPath.UnqualifiedNameTable unqNameTable;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class AmbiguousName {
        java.util.List<java.lang.String> list;

        public AmbiguousName(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.list = r0
                r0.add(r2)
                return
        }

        public void add(java.lang.String r2) {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.list
                r0.add(r2)
                return
        }

        public java.util.List<java.lang.String> get() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.list
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static abstract class ClassSource {
        java.lang.Object source;

        public ClassSource() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract byte[] getCode(java.lang.String r1);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class DirClassSource extends bsh.classpath.BshClassPath.ClassSource {
        public DirClassSource(java.io.File r1) {
                r0 = this;
                r0.<init>()
                r0.source = r1
                return
        }

        public static byte[] readBytesFromFile(java.io.File r3, java.lang.String r4) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 46
                char r2 = java.io.File.separatorChar
                java.lang.String r4 = r4.replace(r1, r2)
                r0.append(r4)
                java.lang.String r4 = ".class"
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.io.File r0 = new java.io.File
                r0.<init>(r3, r4)
                boolean r3 = r0.exists()
                if (r3 != 0) goto L26
                r3 = 0
                return r3
            L26:
                java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.IOException -> L44
                r3.<init>(r0)     // Catch: java.io.IOException -> L44
                java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L46
                r4.<init>(r3)     // Catch: java.lang.Throwable -> L46
                long r1 = r0.length()     // Catch: java.lang.Throwable -> L48
                int r1 = (int) r1     // Catch: java.lang.Throwable -> L48
                byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L48
                r4.readFully(r1)     // Catch: java.lang.Throwable -> L48
                r4.close()     // Catch: java.lang.Throwable -> L48
                r4.close()     // Catch: java.lang.Throwable -> L46
                r3.close()     // Catch: java.io.IOException -> L44
                return r1
            L44:
                r3 = move-exception
                goto L5b
            L46:
                r4 = move-exception
                goto L52
            L48:
                r1 = move-exception
                r4.close()     // Catch: java.lang.Throwable -> L4d
                goto L51
            L4d:
                r4 = move-exception
                r1.addSuppressed(r4)     // Catch: java.lang.Throwable -> L46
            L51:
                throw r1     // Catch: java.lang.Throwable -> L46
            L52:
                r3.close()     // Catch: java.lang.Throwable -> L56
                goto L5a
            L56:
                r3 = move-exception
                r4.addSuppressed(r3)     // Catch: java.io.IOException -> L44
            L5a:
                throw r4     // Catch: java.io.IOException -> L44
            L5b:
                java.lang.RuntimeException r4 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Couldn't load file: "
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r4.<init>(r0, r3)
                throw r4
        }

        @Override // bsh.classpath.BshClassPath.ClassSource
        public byte[] getCode(java.lang.String r2) {
                r1 = this;
                java.io.File r0 = r1.getDir()
                byte[] r2 = readBytesFromFile(r0, r2)
                return r2
        }

        public java.io.File getDir() {
                r1 = this;
                java.lang.Object r0 = r1.source
                java.io.File r0 = (java.io.File) r0
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Dir: "
                r0.<init>(r1)
                java.lang.Object r1 = r2.source
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class GeneratedClassSource extends bsh.classpath.BshClassPath.ClassSource {
        public GeneratedClassSource(byte[] r1) {
                r0 = this;
                r0.<init>()
                r0.source = r1
                return
        }

        @Override // bsh.classpath.BshClassPath.ClassSource
        public byte[] getCode(java.lang.String r1) {
                r0 = this;
                java.lang.Object r1 = r0.source
                byte[] r1 = (byte[]) r1
                return r1
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class JarClassSource extends bsh.classpath.BshClassPath.ClassSource {
        public JarClassSource(java.net.URL r1) {
                r0 = this;
                r0.<init>()
                r0.source = r1
                return
        }

        @Override // bsh.classpath.BshClassPath.ClassSource
        public byte[] getCode(java.lang.String r4) {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "/"
                r0.<init>(r1)
                r1 = 46
                r2 = 47
                java.lang.String r1 = r4.replace(r1, r2)
                r0.append(r1)
                java.lang.String r1 = ".class"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.net.URLClassLoader r1 = new java.net.URLClassLoader     // Catch: java.lang.Throwable -> L5a
                java.net.URL r2 = r3.getURL()     // Catch: java.lang.Throwable -> L5a
                java.net.URL[] r2 = new java.net.URL[]{r2}     // Catch: java.lang.Throwable -> L5a
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L5a
                java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L45
                java.lang.Class r4 = r1.loadClass(r4)     // Catch: java.lang.Throwable -> L45
                java.io.InputStream r4 = r4.getResourceAsStream(r0)     // Catch: java.lang.Throwable -> L45
                r2.<init>(r4)     // Catch: java.lang.Throwable -> L45
                int r4 = r2.available()     // Catch: java.lang.Throwable -> L47
                byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L47
                r2.readFully(r4)     // Catch: java.lang.Throwable -> L47
                r2.close()     // Catch: java.lang.Throwable -> L45
                r1.close()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L5a
                return r4
            L45:
                r4 = move-exception
                goto L51
            L47:
                r4 = move-exception
                r2.close()     // Catch: java.lang.Throwable -> L4c
                goto L50
            L4c:
                r0 = move-exception
                r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L45
            L50:
                throw r4     // Catch: java.lang.Throwable -> L45
            L51:
                r1.close()     // Catch: java.lang.Throwable -> L55
                goto L59
            L55:
                r0 = move-exception
                r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L5a
            L59:
                throw r4     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L5a
            L5a:
                r4 = 0
                byte[] r4 = new byte[r4]
                return r4
        }

        public java.net.URL getURL() {
                r1 = this;
                java.lang.Object r0 = r1.source
                java.net.URL r0 = (java.net.URL) r0
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Jar: "
                r0.<init>(r1)
                java.lang.Object r1 = r2.source
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class JrtClassSource extends bsh.classpath.BshClassPath.ClassSource {
        public JrtClassSource(java.net.URL r1) {
                r0 = this;
                r0.<init>()
                r0.source = r1
                return
        }

        @Override // bsh.classpath.BshClassPath.ClassSource
        public byte[] getCode(java.lang.String r5) {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "/"
                r0.<init>(r1)
                r1 = 46
                r2 = 47
                java.lang.String r5 = r5.replace(r1, r2)
                r0.append(r5)
                java.lang.String r5 = ".class"
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch: java.io.IOException -> L53
                java.net.URL r1 = new java.net.URL     // Catch: java.io.IOException -> L53
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L53
                r2.<init>()     // Catch: java.io.IOException -> L53
                java.lang.Object r3 = r4.source     // Catch: java.io.IOException -> L53
                r2.append(r3)     // Catch: java.io.IOException -> L53
                r2.append(r5)     // Catch: java.io.IOException -> L53
                java.lang.String r5 = r2.toString()     // Catch: java.io.IOException -> L53
                r1.<init>(r5)     // Catch: java.io.IOException -> L53
                java.lang.Object r5 = r1.getContent()     // Catch: java.io.IOException -> L53
                java.io.InputStream r5 = (java.io.InputStream) r5     // Catch: java.io.IOException -> L53
                r0.<init>(r5)     // Catch: java.io.IOException -> L53
                int r5 = r0.available()     // Catch: java.lang.Throwable -> L49
                byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L49
                r0.readFully(r5)     // Catch: java.lang.Throwable -> L49
                r0.close()     // Catch: java.io.IOException -> L53
                return r5
            L49:
                r5 = move-exception
                r0.close()     // Catch: java.lang.Throwable -> L4e
                goto L52
            L4e:
                r0 = move-exception
                r5.addSuppressed(r0)     // Catch: java.io.IOException -> L53
            L52:
                throw r5     // Catch: java.io.IOException -> L53
            L53:
                r5 = 0
                byte[] r5 = new byte[r5]
                return r5
        }

        public java.net.URL getURL() {
                r1 = this;
                java.lang.Object r0 = r1.source
                java.net.URL r0 = (java.net.URL) r0
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Jrt: "
                r0.<init>(r1)
                java.lang.Object r1 = r2.source
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface MappingFeedback {
        void classMapping(java.lang.String r1);

        void endClassMapping();

        void errorWhileMapping(java.lang.String r1);

        void startClassMapping();
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class UnqualifiedNameTable extends java.util.HashMap<java.lang.String, bsh.classpath.BshClassPath.AmbiguousName> {
        private static final long serialVersionUID = 1;

        public UnqualifiedNameTable() {
                r0 = this;
                r0.<init>()
                return
        }

        public void add(java.lang.String r3) {
                r2 = this;
                java.lang.String[] r0 = bsh.classpath.BshClassPath.splitClassname(r3)
                r1 = 1
                r0 = r0[r1]
                boolean r1 = super.containsKey(r0)
                if (r1 != 0) goto L16
                bsh.classpath.BshClassPath$AmbiguousName r1 = new bsh.classpath.BshClassPath$AmbiguousName
                r1.<init>(r3)
                super.put(r0, r1)
                return
            L16:
                java.lang.Object r0 = super.get(r0)
                bsh.classpath.BshClassPath$AmbiguousName r0 = (bsh.classpath.BshClassPath.AmbiguousName) r0
                r0.add(r3)
                return
        }
    }

    static {
            java.lang.String r0 = "[/\\\\]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            bsh.classpath.BshClassPath.slashDot = r0
            java.lang.String r0 = "^modules/[^/]+/"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            bsh.classpath.BshClassPath.moduleName = r0
            java.lang.String r0 = "\\.[^\\.]+$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            bsh.classpath.BshClassPath.dotClass = r0
            java.lang.String r0 = "\\.(?=[^.]+$)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            bsh.classpath.BshClassPath.splitClass = r0
            return
    }

    public BshClassPath(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r1.path = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r1.compPaths = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.packageMap = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.classSource = r0
            r0 = 1
            r1.nameCompletionIncludesUnqNames = r0
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.listeners = r0
            r1.name = r2
            r1.reset()
            return
    }

    public BshClassPath(java.lang.String r1, java.net.URL[] r2) {
            r0 = this;
            r0.<init>(r1)
            r0.add(r2)
            return
    }

    public static /* synthetic */ void a(java.util.ArrayList r0, bsh.classpath.BshClassPath r1) {
            lambda$getFullPath$2(r0, r1)
            return
    }

    public static void addMappingFeedback(bsh.classpath.BshClassPath.MappingFeedback r1) {
            bsh.classpath.BshClassPath$MappingFeedback r0 = bsh.classpath.BshClassPath.mappingFeedbackListener
            if (r0 != 0) goto L7
            bsh.classpath.BshClassPath.mappingFeedbackListener = r1
            return
        L7:
            java.lang.String r1 = "Unimplemented: already a listener"
            bsh.j.g(r1)
            return
    }

    public static /* synthetic */ void b(bsh.classpath.BshClassPath r0) {
            lambda$insureInitialized$1(r0)
            return
    }

    private bsh.classpath.BshClassPath.UnqualifiedNameTable buildUnqualifiedNameTable() {
            r4 = this;
            bsh.classpath.BshClassPath$UnqualifiedNameTable r0 = new bsh.classpath.BshClassPath$UnqualifiedNameTable
            r0.<init>()
            java.util.Set<bsh.classpath.BshClassPath> r1 = r4.compPaths
            bsh.classpath.a r2 = new bsh.classpath.a
            r3 = 0
            r2.<init>(r0, r3)
            r1.forEach(r2)
            java.util.Map<java.lang.String, bsh.classpath.BshClassPath$ClassSource> r1 = r4.classSource
            java.util.Set r1 = r1.keySet()
            bsh.classpath.a r2 = new bsh.classpath.a
            r3 = 1
            r2.<init>(r0, r3)
            r1.forEach(r2)
            return r0
    }

    public static /* synthetic */ void c(bsh.classpath.BshClassPath.UnqualifiedNameTable r0, bsh.classpath.BshClassPath r1) {
            lambda$buildUnqualifiedNameTable$4(r0, r1)
            return
    }

    public static java.lang.String canonicalizeClassName(java.lang.String r3) {
            java.lang.String r0 = "modules/"
            boolean r0 = r3.startsWith(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L14
            java.util.regex.Pattern r0 = bsh.classpath.BshClassPath.moduleName
            java.util.regex.Matcher r3 = r0.matcher(r3)
            java.lang.String r3 = r3.replaceFirst(r1)
        L14:
            r0 = 47
            int r0 = r3.indexOf(r0)
            java.lang.String r2 = "."
            if (r0 >= 0) goto L26
            r0 = 92
            int r0 = r3.indexOf(r0)
            if (r0 < 0) goto L30
        L26:
            java.util.regex.Pattern r0 = bsh.classpath.BshClassPath.slashDot
            java.util.regex.Matcher r3 = r0.matcher(r3)
            java.lang.String r3 = r3.replaceAll(r2)
        L30:
            boolean r0 = r3.startsWith(r2)
            if (r0 == 0) goto L3b
            r0 = 1
            java.lang.String r3 = r3.substring(r0)
        L3b:
            java.lang.String r0 = "class "
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L48
            r0 = 6
            java.lang.String r3 = r3.substring(r0)
        L48:
            java.lang.String r0 = "classes."
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L56
            r0 = 8
            java.lang.String r3 = r3.substring(r0)
        L56:
            java.lang.String r0 = ".class"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L68
            java.util.regex.Pattern r0 = bsh.classpath.BshClassPath.dotClass
            java.util.regex.Matcher r3 = r0.matcher(r3)
            java.lang.String r3 = r3.replaceFirst(r1)
        L68:
            return r3
    }

    private void clearCachedStructures() {
            r1 = this;
            r0 = 0
            r1.mapsInitialized = r0
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r0 = r1.packageMap
            r0.clear()
            java.util.Map<java.lang.String, bsh.classpath.BshClassPath$ClassSource> r0 = r1.classSource
            r0.clear()
            r0 = 0
            r1.unqNameTable = r0
            r1.nameSpaceChanged()
            return
    }

    public static /* synthetic */ java.lang.String[] d(int r0) {
            java.lang.String[] r0 = lambda$searchJarFSForClasses$8(r0)
            return r0
    }

    public static /* synthetic */ void e(bsh.classpath.BshClassPath r0, java.util.ArrayList r1, java.lang.String r2) {
            r0.lambda$getAllNames$6(r1, r2)
            return
    }

    public static /* synthetic */ void f(java.util.HashSet r0, bsh.classpath.BshClassPath r1) {
            lambda$getPackagesSet$9(r0, r1)
            return
    }

    public static /* synthetic */ void g(bsh.classpath.BshClassPath.UnqualifiedNameTable r0, java.lang.String r1) {
            lambda$buildUnqualifiedNameTable$3(r0, r1)
            return
    }

    public static bsh.classpath.BshClassPath getBootClassPath() {
            bsh.classpath.BshClassPath r0 = bsh.classpath.BshClassPath.bootClassPath
            if (r0 != 0) goto L2b
            bsh.classpath.BshClassPath r0 = new bsh.classpath.BshClassPath     // Catch: java.net.MalformedURLException -> L16
            java.lang.String r1 = "Boot Class Path"
            java.net.URL r2 = getRTJarPath()     // Catch: java.net.MalformedURLException -> L16
            java.net.URL[] r2 = new java.net.URL[]{r2}     // Catch: java.net.MalformedURLException -> L16
            r0.<init>(r1, r2)     // Catch: java.net.MalformedURLException -> L16
            bsh.classpath.BshClassPath.bootClassPath = r0     // Catch: java.net.MalformedURLException -> L16
            goto L2b
        L16:
            r0 = move-exception
            bsh.ClassPathException r1 = new bsh.ClassPathException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " can't find boot jar: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L2b:
            bsh.classpath.BshClassPath r0 = bsh.classpath.BshClassPath.bootClassPath
            return r0
    }

    private static java.net.URL getRTJarPath() {
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            java.lang.String r1 = "/java/lang/String.class"
            java.net.URL r0 = r0.getResource(r1)
            java.lang.String r0 = r0.toExternalForm()
            java.lang.String r1 = "jrt:/"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L26
            java.net.URL r1 = new java.net.URL
            r2 = 47
            r3 = 5
            int r2 = r0.indexOf(r2, r3)
            r3 = 0
            java.lang.String r0 = r0.substring(r3, r2)
            r1.<init>(r0)
            return r1
        L26:
            java.net.URL r1 = new java.net.URL
            java.lang.String r2 = "[^!]*$"
            java.lang.String r3 = "/"
            java.lang.String r0 = r0.replaceFirst(r2, r3)
            r1.<init>(r0)
            return r1
    }

    private bsh.classpath.BshClassPath.UnqualifiedNameTable getUnqualifiedNameTable() {
            r1 = this;
            bsh.classpath.BshClassPath$UnqualifiedNameTable r0 = r1.unqNameTable
            if (r0 != 0) goto La
            bsh.classpath.BshClassPath$UnqualifiedNameTable r0 = r1.buildUnqualifiedNameTable()
            r1.unqNameTable = r0
        La:
            bsh.classpath.BshClassPath$UnqualifiedNameTable r0 = r1.unqNameTable
            return r0
    }

    public static bsh.classpath.BshClassPath getUserClassPath() {
            bsh.classpath.BshClassPath r0 = bsh.classpath.BshClassPath.userClassPath
            if (r0 != 0) goto L11
            bsh.classpath.BshClassPath r0 = new bsh.classpath.BshClassPath
            java.lang.String r1 = "User Class Path"
            java.net.URL[] r2 = getUserClassPathComponents()
            r0.<init>(r1, r2)
            bsh.classpath.BshClassPath.userClassPath = r0
        L11:
            bsh.classpath.BshClassPath r0 = bsh.classpath.BshClassPath.userClassPath
            return r0
    }

    public static java.net.URL[] getUserClassPathComponents() {
            java.net.URL[] r0 = bsh.classpath.BshClassPath.userClassPathComp
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "java.class.path"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            if (r0 != 0) goto L11
            java.lang.String[] r0 = new java.lang.String[r1]
            goto L17
        L11:
            java.lang.String r2 = java.io.File.pathSeparator
            java.lang.String[] r0 = r0.split(r2)
        L17:
            int r2 = r0.length
            java.net.URL[] r2 = new java.net.URL[r2]
        L1a:
            int r3 = r0.length     // Catch: java.io.IOException -> L3d
            if (r1 >= r3) goto L3a
            java.io.File r3 = new java.io.File     // Catch: java.io.IOException -> L3d
            java.io.File r4 = new java.io.File     // Catch: java.io.IOException -> L3d
            r5 = r0[r1]     // Catch: java.io.IOException -> L3d
            r4.<init>(r5)     // Catch: java.io.IOException -> L3d
            java.lang.String r4 = r4.getCanonicalPath()     // Catch: java.io.IOException -> L3d
            r3.<init>(r4)     // Catch: java.io.IOException -> L3d
            java.net.URI r3 = r3.toURI()     // Catch: java.io.IOException -> L3d
            java.net.URL r3 = r3.toURL()     // Catch: java.io.IOException -> L3d
            r2[r1] = r3     // Catch: java.io.IOException -> L3d
            int r1 = r1 + 1
            goto L1a
        L3a:
            bsh.classpath.BshClassPath.userClassPathComp = r2
            return r2
        L3d:
            r0 = move-exception
            bsh.ClassPathException r1 = new bsh.ClassPathException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "can't parse class path: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
    }

    public static /* synthetic */ void h(java.lang.String r0, java.util.HashSet r1, bsh.classpath.BshClassPath r2) {
            lambda$getClassesForPackage$0(r0, r1, r2)
            return
    }

    public static /* synthetic */ java.lang.String[] i(int r0) {
            java.lang.String[] r0 = lambda$searchJrtFSForClasses$7(r0)
            return r0
    }

    public static boolean isArchiveFileName(java.lang.String r1) {
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r0 = ".jar"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L1f
            java.lang.String r0 = ".zip"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L1f
            java.lang.String r0 = ".jmod"
            boolean r1 = r1.endsWith(r0)
            if (r1 == 0) goto L1d
            goto L1f
        L1d:
            r1 = 0
            return r1
        L1f:
            r1 = 1
            return r1
    }

    public static boolean isClassFileName(java.lang.String r1) {
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r0 = ".class"
            boolean r1 = r1.endsWith(r0)
            return r1
    }

    public static /* synthetic */ void j(bsh.classpath.BshClassPath.UnqualifiedNameTable r0, java.lang.String r1) {
            lambda$buildUnqualifiedNameTable$5(r0, r1)
            return
    }

    private static /* synthetic */ void lambda$buildUnqualifiedNameTable$3(bsh.classpath.BshClassPath.UnqualifiedNameTable r0, java.lang.String r1) {
            r0.add(r1)
            return
    }

    private static /* synthetic */ void lambda$buildUnqualifiedNameTable$4(bsh.classpath.BshClassPath.UnqualifiedNameTable r2, bsh.classpath.BshClassPath r3) {
            java.util.Map<java.lang.String, bsh.classpath.BshClassPath$ClassSource> r3 = r3.classSource
            java.util.Set r3 = r3.keySet()
            bsh.classpath.a r0 = new bsh.classpath.a
            r1 = 2
            r0.<init>(r2, r1)
            r3.forEach(r0)
            return
    }

    private static /* synthetic */ void lambda$buildUnqualifiedNameTable$5(bsh.classpath.BshClassPath.UnqualifiedNameTable r0, java.lang.String r1) {
            r0.add(r1)
            return
    }

    private /* synthetic */ void lambda$getAllNames$6(java.util.List r1, java.lang.String r2) {
            r0 = this;
            java.util.Set r2 = r0.getClassesForPackage(r2)
            java.util.Collection r2 = removeInnerClassNames(r2)
            r1.addAll(r2)
            return
    }

    private static /* synthetic */ void lambda$getClassesForPackage$0(java.lang.String r0, java.util.Set r1, bsh.classpath.BshClassPath r2) {
            java.util.Set r0 = r2.getClassesForPackage(r0)
            if (r0 == 0) goto L9
            r1.addAll(r0)
        L9:
            return
    }

    private static /* synthetic */ void lambda$getFullPath$2(java.util.List r2, bsh.classpath.BshClassPath r3) {
            java.util.List r3 = r3.getFullPath()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r3.next()
            java.net.URL r0 = (java.net.URL) r0
            boolean r1 = r2.contains(r0)
            if (r1 != 0) goto L8
            r2.add(r0)
            goto L8
        L1e:
            return
    }

    private static /* synthetic */ void lambda$getPackagesSet$9(java.util.Set r0, bsh.classpath.BshClassPath r1) {
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r1 = r1.packageMap
            java.util.Set r1 = r1.keySet()
            r0.addAll(r1)
            return
    }

    private static /* synthetic */ void lambda$insureInitialized$1(bsh.classpath.BshClassPath r1) {
            r0 = 0
            r1.insureInitialized(r0)
            return
    }

    private static /* synthetic */ java.lang.String[] lambda$searchJarFSForClasses$8(int r0) {
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    private static /* synthetic */ java.lang.String[] lambda$searchJrtFSForClasses$7(int r0) {
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    private void map(java.lang.String[] r3, bsh.classpath.BshClassPath.ClassSource r4) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r3.length
            if (r0 >= r1) goto Lc
            r1 = r3[r0]
            r2.mapClass(r1, r4)
            int r0 = r0 + 1
            goto L1
        Lc:
            return
    }

    private void mapClass(java.lang.String r4, bsh.classpath.BshClassPath.ClassSource r5) {
            r3 = this;
            java.lang.String[] r0 = splitClassname(r4)
            r1 = 0
            r0 = r0[r1]
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r1 = r3.packageMap
            java.lang.Object r1 = r1.get(r0)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 != 0) goto L1b
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r2 = r3.packageMap
            r2.put(r0, r1)
        L1b:
            r1.add(r4)
            java.util.Map<java.lang.String, bsh.classpath.BshClassPath$ClassSource> r0 = r3.classSource
            java.lang.Object r0 = r0.get(r4)
            if (r0 != 0) goto L2b
            java.util.Map<java.lang.String, bsh.classpath.BshClassPath$ClassSource> r0 = r3.classSource
            r0.put(r4, r5)
        L2b:
            return
    }

    public static java.util.Collection<java.lang.String> removeInnerClassNames(java.util.Collection<java.lang.String> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.addAll(r3)
            java.util.Iterator r3 = r0.iterator()
        Lc:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "$"
            int r1 = r1.indexOf(r2)
            r2 = -1
            if (r1 == r2) goto Lc
            r3.remove()
            goto Lc
        L25:
            return r0
    }

    private void reset() {
            r1 = this;
            java.util.Set<java.net.URL> r0 = r1.path
            r0.clear()
            java.util.Set<bsh.classpath.BshClassPath> r0 = r1.compPaths
            r0.clear()
            r1.clearCachedStructures()
            return
    }

    public static java.lang.String[] searchArchiveForClasses(java.net.URL r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream
            java.io.InputStream r3 = r3.openStream()
            r1.<init>(r3)
        Le:
            int r3 = r1.available()
            r2 = 1
            if (r3 != r2) goto L31
            java.util.zip.ZipEntry r3 = r1.getNextEntry()
            if (r3 == 0) goto Le
            java.lang.String r2 = r3.getName()
            boolean r2 = isClassFileName(r2)
            if (r2 == 0) goto Le
            java.lang.String r3 = r3.getName()
            java.lang.String r3 = canonicalizeClassName(r3)
            r0.add(r3)
            goto Le
        L31:
            r1.close()
            int r3 = r0.size()
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            return r3
    }

    public static java.lang.String[] searchJarFSForClasses(java.net.URL r4) {
            r0 = 0
            java.net.URI r1 = r4.toURI()     // Catch: java.nio.file.FileSystemAlreadyExistsException -> Ld java.net.URISyntaxException -> L63
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.nio.file.FileSystemAlreadyExistsException -> Ld java.net.URISyntaxException -> L63
            r2.<init>()     // Catch: java.nio.file.FileSystemAlreadyExistsException -> Ld java.net.URISyntaxException -> L63
            java.nio.file.FileSystems.newFileSystem(r1, r2)     // Catch: java.nio.file.FileSystemAlreadyExistsException -> Ld java.net.URISyntaxException -> L63
        Ld:
            java.net.URI r4 = r4.toURI()     // Catch: java.net.URISyntaxException -> L63
            java.nio.file.FileSystem r4 = java.nio.file.FileSystems.getFileSystem(r4)     // Catch: java.net.URISyntaxException -> L63
            java.lang.String r1 = "/"
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: java.net.URISyntaxException -> L63
            java.nio.file.Path r4 = r4.getPath(r1, r2)     // Catch: java.net.URISyntaxException -> L63
            java.nio.file.FileVisitOption[] r1 = new java.nio.file.FileVisitOption[r0]     // Catch: java.lang.Exception -> L54
            java.util.stream.Stream r4 = java.nio.file.Files.walk(r4, r1)     // Catch: java.lang.Exception -> L54
            ae.d r1 = new ae.d     // Catch: java.lang.Throwable -> L56
            r2 = 20
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L56
            java.util.stream.Stream r1 = r4.map(r1)     // Catch: java.lang.Throwable -> L56
            a7.b r2 = new a7.b     // Catch: java.lang.Throwable -> L56
            r3 = 22
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L56
            java.util.stream.Stream r1 = r1.filter(r2)     // Catch: java.lang.Throwable -> L56
            ae.d r2 = new ae.d     // Catch: java.lang.Throwable -> L56
            r3 = 21
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L56
            java.util.stream.Stream r1 = r1.map(r2)     // Catch: java.lang.Throwable -> L56
            bsh.classpath.b r2 = new bsh.classpath.b     // Catch: java.lang.Throwable -> L56
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L56
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.lang.Throwable -> L56
            r4.close()     // Catch: java.lang.Exception -> L54
            return r1
        L54:
            r4 = move-exception
            goto L62
        L56:
            r1 = move-exception
            if (r4 == 0) goto L61
            r4.close()     // Catch: java.lang.Throwable -> L5d
            goto L61
        L5d:
            r4 = move-exception
            r1.addSuppressed(r4)     // Catch: java.lang.Exception -> L54
        L61:
            throw r1     // Catch: java.lang.Exception -> L54
        L62:
            throw r4     // Catch: java.net.URISyntaxException -> L63
        L63:
            java.lang.String[] r4 = new java.lang.String[r0]
            return r4
    }

    public static java.lang.String[] searchJrtFSForClasses(java.net.URL r4) {
            r0 = 0
            java.net.URI r1 = new java.net.URI     // Catch: java.net.URISyntaxException -> L60
            java.lang.String r2 = "jrt:/"
            r1.<init>(r2)     // Catch: java.net.URISyntaxException -> L60
            java.nio.file.FileSystem r1 = java.nio.file.FileSystems.getFileSystem(r1)     // Catch: java.net.URISyntaxException -> L60
            java.lang.String r2 = "modules"
            java.lang.String r4 = r4.getPath()     // Catch: java.net.URISyntaxException -> L60
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.net.URISyntaxException -> L60
            java.nio.file.Path r4 = r1.getPath(r2, r4)     // Catch: java.net.URISyntaxException -> L60
            java.nio.file.FileVisitOption[] r1 = new java.nio.file.FileVisitOption[r0]     // Catch: java.lang.Exception -> L51
            java.util.stream.Stream r4 = java.nio.file.Files.walk(r4, r1)     // Catch: java.lang.Exception -> L51
            ae.d r1 = new ae.d     // Catch: java.lang.Throwable -> L53
            r2 = 20
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L53
            java.util.stream.Stream r1 = r4.map(r1)     // Catch: java.lang.Throwable -> L53
            a7.b r2 = new a7.b     // Catch: java.lang.Throwable -> L53
            r3 = 22
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L53
            java.util.stream.Stream r1 = r1.filter(r2)     // Catch: java.lang.Throwable -> L53
            ae.d r2 = new ae.d     // Catch: java.lang.Throwable -> L53
            r3 = 21
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L53
            java.util.stream.Stream r1 = r1.map(r2)     // Catch: java.lang.Throwable -> L53
            bsh.classpath.b r2 = new bsh.classpath.b     // Catch: java.lang.Throwable -> L53
            r3 = 1
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L53
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch: java.lang.Throwable -> L53
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.lang.Throwable -> L53
            r4.close()     // Catch: java.lang.Exception -> L51
            return r1
        L51:
            r4 = move-exception
            goto L5f
        L53:
            r1 = move-exception
            if (r4 == 0) goto L5e
            r4.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r4 = move-exception
            r1.addSuppressed(r4)     // Catch: java.lang.Exception -> L51
        L5e:
            throw r1     // Catch: java.lang.Exception -> L51
        L5f:
            throw r4     // Catch: java.net.URISyntaxException -> L60
        L60:
            java.lang.String[] r4 = new java.lang.String[r0]
            return r4
    }

    public static java.lang.String[] splitClassname(java.lang.String r2) {
            java.lang.String r2 = canonicalizeClassName(r2)
            r0 = 46
            int r0 = r2.indexOf(r0)
            r1 = -1
            if (r0 != r1) goto L14
            java.lang.String r0 = "<unpackaged>"
            java.lang.String[] r2 = new java.lang.String[]{r0, r2}
            return r2
        L14:
            java.util.regex.Pattern r0 = bsh.classpath.BshClassPath.splitClass
            java.lang.String[] r2 = r0.split(r2)
            return r2
    }

    public static java.lang.String[] traverseDirForClasses(java.io.File r1) {
            java.util.List r1 = traverseDirForClassesAux(r1, r1)
            int r0 = r1.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            return r1
    }

    public static java.util.List<java.lang.String> traverseDirForClassesAux(java.io.File r5, java.io.File r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = r5.getAbsolutePath()
            java.io.File[] r6 = r6.listFiles()
            r2 = 0
            if (r6 != 0) goto L12
            java.io.File[] r6 = new java.io.File[r2]
        L12:
            int r3 = r6.length
            if (r2 >= r3) goto L51
            r3 = r6[r2]
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L25
            java.util.List r3 = traverseDirForClassesAux(r5, r3)
            r0.addAll(r3)
            goto L4e
        L25:
            java.lang.String r3 = r3.getAbsolutePath()
            boolean r4 = isClassFileName(r3)
            if (r4 == 0) goto L4e
            boolean r4 = r3.startsWith(r1)
            if (r4 == 0) goto L47
            int r4 = r1.length()
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)
            java.lang.String r3 = canonicalizeClassName(r3)
            r0.add(r3)
            goto L4e
        L47:
            java.lang.String r5 = "problem parsing paths"
            j8.o.y(r5)
            r5 = 0
            return r5
        L4e:
            int r2 = r2 + 1
            goto L12
        L51:
            return r0
    }

    public void add(java.net.URL r2) {
            r1 = this;
            java.util.Set<java.net.URL> r0 = r1.path
            r0.add(r2)
            boolean r0 = r1.mapsInitialized
            if (r0 == 0) goto Lc
            r1.map(r2)
        Lc:
            return
    }

    public void add(java.net.URL[] r3) {
            r2 = this;
            java.util.Set<java.net.URL> r0 = r2.path
            java.util.List r1 = java.util.Arrays.asList(r3)
            r0.addAll(r1)
            boolean r0 = r2.mapsInitialized
            if (r0 == 0) goto L10
            r2.map(r3)
        L10:
            return
    }

    public void addComponent(bsh.classpath.BshClassPath r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.Set<bsh.classpath.BshClassPath> r0 = r1.compPaths
            r0.add(r2)
            r2.addListener(r1)
            return
    }

    public void addListener(bsh.classpath.ClassPathListener r3) {
            r2 = this;
            java.util.Vector<java.lang.ref.WeakReference<bsh.classpath.ClassPathListener>> r0 = r2.listeners
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.addElement(r1)
            return
    }

    @Override // bsh.NameSource
    public void addNameSourceListener(bsh.NameSource.Listener r2) {
            r1 = this;
            java.util.List<bsh.NameSource$Listener> r0 = r1.nameSourceListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.nameSourceListeners = r0
        Lb:
            java.util.List<bsh.NameSource$Listener> r0 = r1.nameSourceListeners
            r0.add(r2)
            return
    }

    public void classMapping(java.lang.String r4) {
            r3 = this;
            bsh.classpath.BshClassPath$MappingFeedback r0 = bsh.classpath.BshClassPath.mappingFeedbackListener
            if (r0 == 0) goto L8
            r0.classMapping(r4)
            return
        L8:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Mapping: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.println(r4)
            return
    }

    @Override // bsh.classpath.ClassPathListener
    public void classPathChanged() {
            r0 = this;
            r0.clearCachedStructures()
            r0.notifyListeners()
            return
    }

    public void endClassMapping() {
            r2 = this;
            bsh.classpath.BshClassPath$MappingFeedback r0 = bsh.classpath.BshClassPath.mappingFeedbackListener
            if (r0 == 0) goto L8
            r0.endClassMapping()
            return
        L8:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "End ClassPath Mapping"
            r0.println(r1)
            return
    }

    public void errorWhileMapping(java.lang.String r2) {
            r1 = this;
            bsh.classpath.BshClassPath$MappingFeedback r0 = bsh.classpath.BshClassPath.mappingFeedbackListener
            if (r0 == 0) goto L8
            r0.errorWhileMapping(r2)
            return
        L8:
            java.io.PrintStream r0 = java.lang.System.err
            r0.println(r2)
            return
    }

    @Override // bsh.NameSource
    public java.lang.String[] getAllNames() {
            r4 = this;
            r4.insureInitialized()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r1 = r4.getPackagesSet()
            be.w r2 = new be.w
            r3 = 3
            r2.<init>(r4, r3, r0)
            r1.forEach(r2)
            boolean r1 = r4.nameCompletionIncludesUnqNames
            if (r1 == 0) goto L24
            bsh.classpath.BshClassPath$UnqualifiedNameTable r1 = r4.getUnqualifiedNameTable()
            java.util.Set r1 = r1.keySet()
            r0.addAll(r1)
        L24:
            int r1 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public java.lang.String getClassNameByUnqName(java.lang.String r4) {
            r3 = this;
            r3.insureInitialized()
            bsh.classpath.BshClassPath$UnqualifiedNameTable r0 = r3.getUnqualifiedNameTable()
            java.lang.Object r4 = r0.get(r4)
            bsh.classpath.BshClassPath$AmbiguousName r4 = (bsh.classpath.BshClassPath.AmbiguousName) r4
            if (r4 != 0) goto L11
            r4 = 0
            return r4
        L11:
            java.util.List r4 = r4.get()
            int r0 = r4.size()
            r1 = 1
            if (r0 != r1) goto L24
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L24:
            bsh.ClassPathException r0 = new bsh.ClassPathException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Ambiguous class names: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public bsh.classpath.BshClassPath.ClassSource getClassSource(java.lang.String r4) {
            r3 = this;
            java.util.Map<java.lang.String, bsh.classpath.BshClassPath$ClassSource> r0 = r3.classSource
            java.lang.Object r0 = r0.get(r4)
            bsh.classpath.BshClassPath$ClassSource r0 = (bsh.classpath.BshClassPath.ClassSource) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            r3.insureInitialized()
            java.util.Set<bsh.classpath.BshClassPath> r0 = r3.compPaths
            java.util.Iterator r0 = r0.iterator()
            java.util.Map<java.lang.String, bsh.classpath.BshClassPath$ClassSource> r1 = r3.classSource
            java.lang.Object r1 = r1.get(r4)
            bsh.classpath.BshClassPath$ClassSource r1 = (bsh.classpath.BshClassPath.ClassSource) r1
        L1c:
            if (r1 != 0) goto L2f
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            bsh.classpath.BshClassPath r1 = (bsh.classpath.BshClassPath) r1
            bsh.classpath.BshClassPath$ClassSource r1 = r1.getClassSource(r4)
            goto L1c
        L2f:
            return r1
    }

    public java.util.Set<java.lang.String> getClassesForPackage(java.lang.String r5) {
            r4 = this;
            r4.insureInitialized()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r1 = r4.packageMap
            java.lang.Object r1 = r1.get(r5)
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L15
            r0.addAll(r1)
        L15:
            java.util.Set<bsh.classpath.BshClassPath> r1 = r4.compPaths
            be.w r2 = new be.w
            r3 = 4
            r2.<init>(r5, r3, r0)
            r1.forEach(r2)
            return r0
    }

    public java.util.List<java.net.URL> getFullPath() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set<bsh.classpath.BshClassPath> r1 = r4.compPaths
            bsh.classpath.c r2 = new bsh.classpath.c
            r3 = 0
            r2.<init>(r0, r3)
            r1.forEach(r2)
            java.util.Set<java.net.URL> r1 = r4.path
            r0.addAll(r1)
            return r0
    }

    public java.util.List<bsh.NameSource.Listener> getNameSourceListeners() {
            r1 = this;
            java.util.List<bsh.NameSource$Listener> r0 = r1.nameSourceListeners
            return r0
    }

    public java.util.Set<java.lang.String> getPackagesSet() {
            r4 = this;
            r4.insureInitialized()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r1 = r4.packageMap
            java.util.Set r1 = r1.keySet()
            r0.addAll(r1)
            java.util.Set<bsh.classpath.BshClassPath> r1 = r4.compPaths
            bsh.classpath.c r2 = new bsh.classpath.c
            r3 = 1
            r2.<init>(r0, r3)
            r1.forEach(r2)
            return r0
    }

    public java.net.URL[] getPathComponents() {
            r2 = this;
            java.util.List r0 = r2.getFullPath()
            r1 = 0
            java.net.URL[] r1 = new java.net.URL[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.net.URL[] r0 = (java.net.URL[]) r0
            return r0
    }

    public bsh.classpath.BshClassPath.UnqualifiedNameTable getUnqNameTable() {
            r1 = this;
            bsh.classpath.BshClassPath$UnqualifiedNameTable r0 = r1.unqNameTable
            return r0
    }

    public void insureInitialized() {
            r1 = this;
            r0 = 1
            r1.insureInitialized(r0)
            return
    }

    public void insureInitialized(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L9
            boolean r0 = r3.mapsInitialized
            if (r0 != 0) goto L9
            r3.startClassMapping()
        L9:
            java.util.Set<bsh.classpath.BshClassPath> r0 = r3.compPaths
            ae.e r1 = new ae.e
            r2 = 9
            r1.<init>(r2)
            r0.forEach(r1)
            boolean r0 = r3.mapsInitialized
            if (r0 != 0) goto L27
            java.util.Set<java.net.URL> r0 = r3.path
            r1 = 0
            java.net.URL[] r1 = new java.net.URL[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.net.URL[] r0 = (java.net.URL[]) r0
            r3.map(r0)
        L27:
            if (r4 == 0) goto L30
            boolean r4 = r3.mapsInitialized
            if (r4 != 0) goto L30
            r3.endClassMapping()
        L30:
            r4 = 1
            r3.mapsInitialized = r4
            return
    }

    public boolean isMapsInitialized() {
            r1 = this;
            boolean r0 = r1.mapsInitialized
            return r0
    }

    public boolean isNameCompletionIncludesUnqNames() {
            r1 = this;
            boolean r0 = r1.nameCompletionIncludesUnqNames
            return r0
    }

    public void map(java.net.URL r4) {
            r3 = this;
            java.lang.String r0 = "jrt"
            java.lang.String r1 = r4.getProtocol()
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = "FileSystem: "
            if (r0 == 0) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r3.classMapping(r0)
            java.lang.String[] r0 = searchJrtFSForClasses(r4)
            bsh.classpath.BshClassPath$JrtClassSource r1 = new bsh.classpath.BshClassPath$JrtClassSource
            r1.<init>(r4)
            r3.map(r0, r1)
            return
        L2a:
            java.lang.String r0 = "jar"
            java.lang.String r2 = r4.getProtocol()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L52
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r3.classMapping(r0)
            java.lang.String[] r0 = searchJarFSForClasses(r4)
            bsh.classpath.BshClassPath$JarClassSource r1 = new bsh.classpath.BshClassPath$JarClassSource
            r1.<init>(r4)
            r3.map(r0, r1)
            return
        L52:
            java.lang.String r0 = r4.getFile()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r2 = r1.isDirectory()
            if (r2 == 0) goto L83
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Directory "
            r4.<init>(r0)
            java.lang.String r0 = r1.toString()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.classMapping(r4)
            java.lang.String[] r4 = traverseDirForClasses(r1)
            bsh.classpath.BshClassPath$DirClassSource r0 = new bsh.classpath.BshClassPath$DirClassSource
            r0.<init>(r1)
            r3.map(r4, r0)
            return
        L83:
            boolean r1 = isArchiveFileName(r0)
            if (r1 == 0) goto La7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Archive: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r3.classMapping(r0)
            java.lang.String[] r0 = searchArchiveForClasses(r4)
            bsh.classpath.BshClassPath$JarClassSource r1 = new bsh.classpath.BshClassPath$JarClassSource
            r1.<init>(r4)
            r3.map(r0, r1)
            return
        La7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Not a classpath component: "
            r4.<init>(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.errorWhileMapping(r4)
            return
    }

    public void map(java.net.URL[] r5) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r5.length
            if (r0 >= r1) goto L31
            r1 = r5[r0]     // Catch: java.lang.Exception -> Lc
            r4.map(r1)     // Catch: java.lang.Exception -> Lc
            int r0 = r0 + 1
            goto L1
        Lc:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error constructing classpath: "
            r2.<init>(r3)
            r5 = r5[r0]
            r2.append(r5)
            java.lang.String r5 = ": "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = r2.toString()
            r4.errorWhileMapping(r5)
            java.lang.String r5 = "Failed to map class path "
            java.lang.String r5 = eh.a.l(r0, r5)
            ah.a.p(r5, r1)
        L31:
            return
    }

    public void nameSpaceChanged() {
            r2 = this;
            java.util.List<bsh.NameSource$Listener> r0 = r2.nameSourceListeners
            if (r0 != 0) goto L5
            goto L1c
        L5:
            r0 = 0
        L6:
            java.util.List<bsh.NameSource$Listener> r1 = r2.nameSourceListeners
            int r1 = r1.size()
            if (r0 >= r1) goto L1c
            java.util.List<bsh.NameSource$Listener> r1 = r2.nameSourceListeners
            java.lang.Object r1 = r1.get(r0)
            bsh.NameSource$Listener r1 = (bsh.NameSource.Listener) r1
            r1.nameSourceChanged(r2)
            int r0 = r0 + 1
            goto L6
        L1c:
            return
    }

    public void notifyListeners() {
            r2 = this;
            java.util.Vector<java.lang.ref.WeakReference<bsh.classpath.ClassPathListener>> r0 = r2.listeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            bsh.classpath.ClassPathListener r1 = (bsh.classpath.ClassPathListener) r1
            if (r1 != 0) goto L1e
            r0.remove()
            goto L6
        L1e:
            r1.classPathChanged()
            goto L6
        L22:
            return
    }

    public void removeListener(bsh.classpath.ClassPathListener r3) {
            r2 = this;
            java.util.Vector<java.lang.ref.WeakReference<bsh.classpath.ClassPathListener>> r0 = r2.listeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            if (r1 != r3) goto L6
            r0.remove()
            goto L6
        L1c:
            return
    }

    public void setClassSource(java.lang.String r2, bsh.classpath.BshClassPath.ClassSource r3) {
            r1 = this;
            java.util.Map<java.lang.String, bsh.classpath.BshClassPath$ClassSource> r0 = r1.classSource
            r0.put(r2, r3)
            return
    }

    public void setMapsInitialized(boolean r1) {
            r0 = this;
            r0.mapsInitialized = r1
            return
    }

    public void setNameCompletionIncludesUnqNames(boolean r1) {
            r0 = this;
            r0.nameCompletionIncludesUnqNames = r1
            return
    }

    public void setNameSourceListeners(java.util.List<bsh.NameSource.Listener> r1) {
            r0 = this;
            r0.nameSourceListeners = r1
            return
    }

    public void setPath(java.net.URL[] r1) {
            r0 = this;
            r0.reset()
            r0.add(r1)
            return
    }

    public void setUnqNameTable(bsh.classpath.BshClassPath.UnqualifiedNameTable r1) {
            r0 = this;
            r0.unqNameTable = r1
            return
    }

    public void startClassMapping() {
            r2 = this;
            bsh.classpath.BshClassPath$MappingFeedback r0 = bsh.classpath.BshClassPath.mappingFeedbackListener
            if (r0 == 0) goto L8
            r0.startClassMapping()
            return
        L8:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Start ClassPath Mapping"
            r0.println(r1)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BshClassPath "
            r0.<init>(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ") path= "
            r0.append(r1)
            java.util.Set<java.net.URL> r1 = r2.path
            r0.append(r1)
            java.lang.String r1 = "\ncompPaths = {"
            r0.append(r1)
            java.util.Set<bsh.classpath.BshClassPath> r1 = r2.compPaths
            r0.append(r1)
            java.lang.String r1 = " }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
