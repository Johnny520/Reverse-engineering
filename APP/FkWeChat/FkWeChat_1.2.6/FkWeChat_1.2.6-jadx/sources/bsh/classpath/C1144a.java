package bsh.classpath;

import bsh.C1281x0;
import bsh.RunnableC1205k2;
import java.net.URL;
import java.net.URLClassLoader;

/* JADX INFO: renamed from: bsh.classpath.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1144a extends URLClassLoader {

    /* JADX INFO: renamed from: q */
    public C1281x0 f3489q;

    public C1144a(C1281x0 c1281x0, C1157n c1157n) {
        this(c1281x0, c1157n.m4256x());
    }

    @Override // java.net.URLClassLoader
    public void addURL(URL url) {
        super.addURL(url);
    }

    /* JADX INFO: renamed from: c */
    public C1281x0 m4209c() {
        return this.f3489q;
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public Class findClass(String str) throws ClassNotFoundException {
        ClassManagerImpl classManagerImpl = (ClassManagerImpl) m4209c();
        ClassLoader loaderForClass = classManagerImpl.getLoaderForClass(str);
        if (loaderForClass != null && loaderForClass != this) {
            try {
                return loaderForClass.loadClass(str);
            } catch (ClassNotFoundException e10) {
                throw new ClassNotFoundException("Designated loader could not find class: " + e10);
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

    @Override // java.lang.ClassLoader
    public Class loadClass(String str, boolean z10) throws ClassNotFoundException {
        ClassLoader classLoader;
        if (str.startsWith("java.")) {
            return super.loadClass(str, z10);
        }
        Class<?> clsFindLoadedClass = findLoadedClass(str);
        if (clsFindLoadedClass != null) {
            return clsFindLoadedClass;
        }
        if (str.startsWith("bsh") && (classLoader = RunnableC1205k2.class.getClassLoader()) != null) {
            try {
                return classLoader.loadClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        Class clsFindClass = findClass(str);
        if (z10) {
            resolveClass(clsFindClass);
        }
        return clsFindClass;
    }

    public C1144a(C1281x0 c1281x0, URL[] urlArr) {
        super(urlArr);
        this.f3489q = c1281x0;
    }

    public C1144a(C1281x0 c1281x0) {
        this(c1281x0, new URL[0]);
    }
}
