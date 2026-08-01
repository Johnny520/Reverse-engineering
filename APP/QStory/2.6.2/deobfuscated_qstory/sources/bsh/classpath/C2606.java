package bsh.classpath;

import bsh.Interpreter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collections;
import java.util.Enumeration;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2606 extends URLClassLoader {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f7798;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7799 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2606(URL[] urlArr, ClassLoader classLoader) {
        super(urlArr, null);
        urlArr.getClass();
        this.f7798 = classLoader;
    }

    @Override // java.net.URLClassLoader
    public void addURL(URL url) {
        switch (this.f7799) {
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
        int i = this.f7799;
        Object obj = this.f7798;
        switch (i) {
            case 0:
                ClassManagerImpl classManagerImpl = (ClassManagerImpl) obj;
                ClassLoader classLoader = (ClassLoader) classManagerImpl.f7787.get(str);
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
                C2606 c2606 = classManagerImpl.f7785;
                if (c2606 != null && c2606 != this) {
                    try {
                        return c2606.loadClass(str);
                    } catch (ClassNotFoundException unused2) {
                    }
                }
                ClassLoader classLoader2 = classManagerImpl.f7963;
                Class<?> clsLoadClass = classLoader2 != null ? classLoader2.loadClass(str) : Class.forName(str);
                classManagerImpl.m5325(clsLoadClass, str);
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
        switch (this.f7799) {
            case 1:
                return null;
            default:
                return super.findResource(str);
        }
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public Enumeration findResources(String str) {
        switch (this.f7799) {
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
        switch (this.f7799) {
            case 1:
                return ((ClassLoader) this.f7798).getResource(str);
            default:
                return super.getResource(str);
        }
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public InputStream getResourceAsStream(String str) {
        switch (this.f7799) {
            case 1:
                return ((ClassLoader) this.f7798).getResourceAsStream(str);
            default:
                return super.getResourceAsStream(str);
        }
    }

    @Override // java.lang.ClassLoader
    public Enumeration getResources(String str) throws IOException {
        switch (this.f7799) {
            case 1:
                Enumeration<URL> resources = ((ClassLoader) this.f7798).getResources(str);
                resources.getClass();
                return resources;
            default:
                return super.getResources(str);
        }
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str, boolean z) throws ClassNotFoundException {
        ClassLoader classLoader;
        switch (this.f7799) {
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

    public C2606(ClassManagerImpl classManagerImpl, URL[] urlArr) {
        super(urlArr);
        this.f7798 = classManagerImpl;
    }
}
