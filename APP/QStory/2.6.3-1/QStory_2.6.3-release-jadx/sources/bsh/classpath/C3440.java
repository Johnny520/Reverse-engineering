package bsh.classpath;

import bsh.Interpreter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collections;
import java.util.Enumeration;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3440 extends URLClassLoader {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f8145;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8146 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3440(URL[] urlArr, ClassLoader classLoader) {
        super(urlArr, null);
        urlArr.getClass();
        this.f8145 = classLoader;
    }

    @Override // java.net.URLClassLoader
    public void addURL(URL url) {
        switch (this.f8146) {
            case 0:
                super.addURL(url);
                break;
            default:
                super.addURL(url);
                break;
        }
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public Class findClass(String str) throws ClassNotFoundException {
        int i = this.f8146;
        Object obj = this.f8145;
        switch (i) {
            case 0:
                ClassManagerImpl classManagerImpl = (ClassManagerImpl) obj;
                ClassLoader classLoader = (ClassLoader) classManagerImpl.f8134.get(str);
                if (classLoader != null && classLoader != this) {
                    try {
                        return classLoader.loadClass(str);
                    } catch (ClassNotFoundException e) {
                        throw new ClassNotFoundException("Designated loader could not find class: " + e);
                    }
                }
                if (getURLs().length > 0) {
                    try {
                        return super.findClass(str);
                    } catch (ClassNotFoundException unused) {
                    }
                }
                C3440 c3440 = classManagerImpl.f8132;
                if (c3440 != null && c3440 != this) {
                    try {
                        return c3440.loadClass(str);
                    } catch (ClassNotFoundException unused2) {
                    }
                }
                ClassLoader classLoader2 = classManagerImpl.f8310;
                Class<?> clsLoadClass = classLoader2 != null ? classLoader2.loadClass(str) : Class.forName(str);
                classManagerImpl.m5930(clsLoadClass, str);
                return clsLoadClass;
            default:
                str.getClass();
                Class<?> clsFindLoadedClass = findLoadedClass(str);
                if (clsFindLoadedClass != null) {
                    return clsFindLoadedClass;
                }
                try {
                    return super.findClass(str);
                } catch (ClassNotFoundException unused3) {
                    return ((ClassLoader) obj).loadClass(str);
                }
        }
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public URL findResource(String str) {
        switch (this.f8146) {
            case 1:
                return null;
            default:
                return super.findResource(str);
        }
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public Enumeration findResources(String str) {
        switch (this.f8146) {
            case 1:
                Enumeration enumerationEmptyEnumeration = Collections.emptyEnumeration();
                enumerationEmptyEnumeration.getClass();
                return enumerationEmptyEnumeration;
            default:
                return super.findResources(str);
        }
    }

    @Override // java.lang.ClassLoader
    public URL getResource(String str) {
        switch (this.f8146) {
            case 1:
                return ((ClassLoader) this.f8145).getResource(str);
            default:
                return super.getResource(str);
        }
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public InputStream getResourceAsStream(String str) {
        switch (this.f8146) {
            case 1:
                return ((ClassLoader) this.f8145).getResourceAsStream(str);
            default:
                return super.getResourceAsStream(str);
        }
    }

    @Override // java.lang.ClassLoader
    public Enumeration getResources(String str) throws IOException {
        switch (this.f8146) {
            case 1:
                Enumeration<URL> resources = ((ClassLoader) this.f8145).getResources(str);
                resources.getClass();
                return resources;
            default:
                return super.getResources(str);
        }
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str, boolean z) throws ClassNotFoundException {
        ClassLoader classLoader;
        switch (this.f8146) {
            case 0:
                if (str.startsWith("java.")) {
                    return super.loadClass(str, z);
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
                Class clsFindClass = this.findClass(str);
                if (z) {
                    this.resolveClass(clsFindClass);
                }
                return clsFindClass;
            default:
                return super.loadClass(str, z);
        }
    }

    public C3440(ClassManagerImpl classManagerImpl, URL[] urlArr) {
        super(urlArr);
        this.f8145 = classManagerImpl;
    }
}
