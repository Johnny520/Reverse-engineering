package p125i7;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/* JADX INFO: renamed from: i7.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3227n0 extends ClassLoader implements Closeable {

    /* JADX INFO: renamed from: q */
    public final a f8637q;

    /* JADX INFO: renamed from: i7.n0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends URLClassLoader {

        /* JADX INFO: renamed from: q */
        public final ClassLoader f8638q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(URL[] urlArr, ClassLoader classLoader) {
            super(urlArr, null);
            urlArr.getClass();
            classLoader.getClass();
            this.f8638q = classLoader;
        }

        @Override // java.net.URLClassLoader, java.lang.ClassLoader
        public Class findClass(String str) throws ClassNotFoundException {
            str.getClass();
            Class<?> clsFindLoadedClass = super.findLoadedClass(str);
            if (clsFindLoadedClass != null) {
                return clsFindLoadedClass;
            }
            try {
                Class<?> clsFindClass = super.findClass(str);
                clsFindClass.getClass();
                return clsFindClass;
            } catch (ClassNotFoundException unused) {
                Class<?> clsLoadClass = this.f8638q.loadClass(str);
                clsLoadClass.getClass();
                return clsLoadClass;
            }
        }

        @Override // java.net.URLClassLoader, java.lang.ClassLoader
        public URL findResource(String str) {
            return null;
        }

        @Override // java.net.URLClassLoader, java.lang.ClassLoader
        public Enumeration findResources(String str) {
            Enumeration enumerationEmptyEnumeration = Collections.emptyEnumeration();
            enumerationEmptyEnumeration.getClass();
            return enumerationEmptyEnumeration;
        }

        @Override // java.lang.ClassLoader
        public URL getResource(String str) {
            return this.f8638q.getResource(str);
        }

        @Override // java.net.URLClassLoader, java.lang.ClassLoader
        public InputStream getResourceAsStream(String str) {
            return this.f8638q.getResourceAsStream(str);
        }

        @Override // java.lang.ClassLoader
        public Enumeration getResources(String str) throws IOException {
            Enumeration<URL> resources = this.f8638q.getResources(str);
            resources.getClass();
            return resources;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3227n0(List list, ClassLoader classLoader) {
        super(classLoader);
        list.getClass();
        URL[] urlArr = (URL[]) list.toArray(new URL[0]);
        ClassLoader parent = getParent();
        parent.getClass();
        this.f8637q = new a(urlArr, parent);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f8637q.close();
    }

    @Override // java.lang.ClassLoader
    public synchronized Class loadClass(String str, boolean z10) {
        Class clsLoadClass;
        str.getClass();
        try {
            clsLoadClass = this.f8637q.findClass(str);
        } catch (ClassNotFoundException unused) {
            clsLoadClass = super.loadClass(str, z10);
            clsLoadClass.getClass();
        }
        return clsLoadClass;
    }
}
