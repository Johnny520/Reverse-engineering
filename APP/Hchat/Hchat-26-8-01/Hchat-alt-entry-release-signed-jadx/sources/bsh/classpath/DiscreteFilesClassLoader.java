package bsh.classpath;

import bsh.BshClassManager;
import bsh.classpath.BshClassPath;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class DiscreteFilesClassLoader extends BshClassLoader {
    private static DiscreteFilesClassLoader instance;
    ClassSourceMap map;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DiscreteFilesClassLoader(BshClassManager bshClassManager, ClassSourceMap classSourceMap) {
        super(bshClassManager);
        this.map = classSourceMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static DiscreteFilesClassLoader instance() {
        return instance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void newInstance(BshClassManager bshClassManager, ClassSourceMap classSourceMap) {
        instance = new DiscreteFilesClassLoader(bshClassManager, classSourceMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.classpath.BshClassLoader, java.net.URLClassLoader, java.lang.ClassLoader
    public Class findClass(String str) {
        BshClassPath.ClassSource classSource = this.map.get((Object) str);
        if (classSource == null) {
            return super.findClass(str);
        }
        return getClassManager().loadGeneratedClass(str, classSource.getCode(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return super.toString() + "for files: " + this.map;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class ClassSourceMap extends HashMap<String, BshClassPath.ClassSource> {
        private static final long serialVersionUID = 1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public BshClassPath.ClassSource get(Object obj) {
            return (BshClassPath.ClassSource) super.get(obj);
        }

        /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public BshClassPath.ClassSource put(String str, BshClassPath.ClassSource classSource) {
            return (BshClassPath.ClassSource) super.put(str, classSource);
        }
    }
}
