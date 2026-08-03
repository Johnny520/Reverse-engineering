package bsh.classpath;

import bsh.BshClassManager;
import bsh.Interpreter;
import java.net.URL;
import java.net.URLClassLoader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BshClassLoader extends URLClassLoader {
    BshClassManager classManager;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BshClassLoader(BshClassManager bshClassManager, BshClassPath bshClassPath) {
        this(bshClassManager, bshClassPath.getPathComponents());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.net.URLClassLoader
    public void addURL(URL url) {
        super.addURL(url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public Class findClass(String str) throws ClassNotFoundException {
        ClassManagerImpl classManagerImpl = (ClassManagerImpl) getClassManager();
        ClassLoader loaderForClass = classManagerImpl.getLoaderForClass(str);
        if (loaderForClass != null && loaderForClass != this) {
            try {
                return loaderForClass.loadClass(str);
            } catch (ClassNotFoundException e6) {
                throw new ClassNotFoundException("Designated loader could not find class: " + e6);
            }
        }
        if (getURLs().length > 0) {
            try {
                return super.findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        ClassLoader baseLoader = classManagerImpl.getBaseLoader();
        if (baseLoader != null && baseLoader != this) {
            try {
                return baseLoader.loadClass(str);
            } catch (ClassNotFoundException unused2) {
            }
        }
        return classManagerImpl.plainClassForName(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BshClassManager getClassManager() {
        return this.classManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.ClassLoader
    public Class loadClass(String str, boolean z9) throws ClassNotFoundException {
        ClassLoader classLoader;
        if (str.startsWith("java.")) {
            return super.loadClass(str, z9);
        }
        Class<?> clsFindLoadedClass = findLoadedClass(str);
        if (clsFindLoadedClass != null) {
            return clsFindLoadedClass;
        }
        if (str.startsWith("bsh") && (classLoader = Interpreter.class.getClassLoader()) != null) {
            try {
                return classLoader.loadClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        Class clsFindClass = findClass(str);
        if (z9) {
            resolveClass(clsFindClass);
        }
        return clsFindClass;
    }

    public BshClassLoader(BshClassManager bshClassManager, URL[] urlArr) {
        super(urlArr);
        this.classManager = bshClassManager;
    }

    public BshClassLoader(BshClassManager bshClassManager) {
        this(bshClassManager, new URL[0]);
    }
}
