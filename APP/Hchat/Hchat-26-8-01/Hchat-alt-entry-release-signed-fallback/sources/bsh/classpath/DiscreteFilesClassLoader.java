package bsh.classpath;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class DiscreteFilesClassLoader extends bsh.classpath.BshClassLoader {
    private static bsh.classpath.DiscreteFilesClassLoader instance;
    bsh.classpath.DiscreteFilesClassLoader.ClassSourceMap map;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class ClassSourceMap extends java.util.HashMap<java.lang.String, bsh.classpath.BshClassPath.ClassSource> {
        private static final long serialVersionUID = 1;

        public ClassSourceMap() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public bsh.classpath.BshClassPath.ClassSource get(java.lang.Object r1) {
                r0 = this;
                java.lang.Object r1 = super.get(r1)
                bsh.classpath.BshClassPath$ClassSource r1 = (bsh.classpath.BshClassPath.ClassSource) r1
                return r1
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object r1) {
                r0 = this;
                bsh.classpath.BshClassPath$ClassSource r1 = r0.get(r1)
                return r1
        }

        public bsh.classpath.BshClassPath.ClassSource put(java.lang.String r1, bsh.classpath.BshClassPath.ClassSource r2) {
                r0 = this;
                java.lang.Object r1 = super.put(r1, r2)
                bsh.classpath.BshClassPath$ClassSource r1 = (bsh.classpath.BshClassPath.ClassSource) r1
                return r1
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                bsh.classpath.BshClassPath$ClassSource r2 = (bsh.classpath.BshClassPath.ClassSource) r2
                bsh.classpath.BshClassPath$ClassSource r1 = r0.put(r1, r2)
                return r1
        }
    }

    public DiscreteFilesClassLoader(bsh.BshClassManager r1, bsh.classpath.DiscreteFilesClassLoader.ClassSourceMap r2) {
            r0 = this;
            r0.<init>(r1)
            r0.map = r2
            return
    }

    public static bsh.classpath.DiscreteFilesClassLoader instance() {
            bsh.classpath.DiscreteFilesClassLoader r0 = bsh.classpath.DiscreteFilesClassLoader.instance
            return r0
    }

    public static void newInstance(bsh.BshClassManager r1, bsh.classpath.DiscreteFilesClassLoader.ClassSourceMap r2) {
            bsh.classpath.DiscreteFilesClassLoader r0 = new bsh.classpath.DiscreteFilesClassLoader
            r0.<init>(r1, r2)
            bsh.classpath.DiscreteFilesClassLoader.instance = r0
            return
    }

    @Override // bsh.classpath.BshClassLoader, java.net.URLClassLoader, java.lang.ClassLoader
    public java.lang.Class findClass(java.lang.String r3) {
            r2 = this;
            bsh.classpath.DiscreteFilesClassLoader$ClassSourceMap r0 = r2.map
            bsh.classpath.BshClassPath$ClassSource r0 = r0.get(r3)
            if (r0 == 0) goto L15
            byte[] r0 = r0.getCode(r3)
            bsh.BshClassManager r1 = r2.getClassManager()
            java.lang.Class r3 = r1.loadGeneratedClass(r3, r0)
            return r3
        L15:
            java.lang.Class r3 = super.findClass(r3)
            return r3
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "for files: "
            r0.append(r1)
            bsh.classpath.DiscreteFilesClassLoader$ClassSourceMap r1 = r2.map
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
