package bsh.classpath;

import bsh.C1234p1;
import bsh.C1237p4;
import bsh.C1279w4;
import bsh.C1281x0;
import bsh.RunnableC1205k2;
import bsh.classpath.C1157n;
import bsh.classpath.C1159p;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ClassManagerImpl extends C1281x0 {
    static final String BSH_PACKAGE = "bsh";
    private C1157n baseClassPath;
    private C1144a baseLoader;
    private C1157n fullClassPath;
    private boolean superImport;
    private final Set<WeakReference<C1281x0.a>> listeners = ConcurrentHashMap.newKeySet();
    private final ReferenceQueue<C1281x0.a> refQueue = new ReferenceQueue<>();
    private final Map<String, C1159p> loaderMap = new ConcurrentHashMap();

    public ClassManagerImpl() {
        reset();
    }

    private void initBaseLoader() {
        this.baseLoader = new C1144a(this, this.baseClassPath);
    }

    public void addClassPath(URL url) {
        C1144a c1144a = this.baseLoader;
        if (c1144a == null) {
            setClassPath(new URL[]{url});
            return;
        }
        c1144a.addURL(url);
        this.baseClassPath.m4243i(url);
        classLoaderChanged();
    }

    @Override // bsh.C1281x0
    public void addListener(C1281x0.a aVar) {
        this.listeners.add(new WeakReference<>(aVar, this.refQueue));
        while (true) {
            Reference<? extends C1281x0.a> referencePoll = this.refQueue.poll();
            if (referencePoll == null) {
                return;
            }
            if (!this.listeners.remove(referencePoll)) {
                RunnableC1205k2.m4462e("tried to remove non-existent weak ref: ", referencePoll);
            }
        }
    }

    @Override // bsh.C1281x0
    public Class<?> classForName(String str) {
        ClassLoader classLoader;
        C1144a c1144a;
        Class<?> clsLoadClass = this.absoluteClassCache.get(str);
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        if (this.absoluteNonClasses.contains(str)) {
            RunnableC1205k2.m4462e("absoluteNonClass list hit: ", str);
            return null;
        }
        RunnableC1205k2.m4462e("Trying to load class: ", str);
        ClassLoader loaderForClass = getLoaderForClass(str);
        if (loaderForClass != null) {
            try {
                clsLoadClass = loaderForClass.loadClass(str);
            } catch (Exception e10) {
                RunnableC1205k2.m4462e("overlay loader failed for '", "' - ", e10);
            }
        }
        if (clsLoadClass == null && str.startsWith(BSH_PACKAGE)) {
            ClassLoader classLoader2 = RunnableC1205k2.class.getClassLoader();
            try {
                clsLoadClass = classLoader2 != null ? classLoader2.loadClass(str) : Class.forName(str);
            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            }
        }
        if (clsLoadClass == null && (c1144a = this.baseLoader) != null) {
            try {
                clsLoadClass = c1144a.loadClass(str);
            } catch (ClassNotFoundException unused2) {
            }
        }
        if (clsLoadClass == null && (classLoader = this.externalClassLoader) != null) {
            try {
                clsLoadClass = classLoader.loadClass(str);
            } catch (ClassNotFoundException unused3) {
            }
        }
        if (clsLoadClass == null) {
            try {
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                if (contextClassLoader != null) {
                    clsLoadClass = Class.forName(str, true, contextClassLoader);
                }
            } catch (ClassNotFoundException | NoClassDefFoundError | SecurityException unused4) {
            }
        }
        if (clsLoadClass == null) {
            try {
                clsLoadClass = Class.forName(str);
            } catch (ClassNotFoundException unused5) {
            } catch (NoClassDefFoundError e11) {
                System.err.println("The class named '" + str + "' could not be found, either because it no longer exists or it is not contained in the class file of the same name. Caused by: " + e11.getMessage());
            }
        }
        if (clsLoadClass == null) {
            clsLoadClass = loadSourceClass(str);
        }
        cacheClassInfo(str, clsLoadClass);
        return clsLoadClass;
    }

    @Override // bsh.C1281x0
    public void classLoaderChanged() {
        ArrayList arrayList = new ArrayList();
        for (WeakReference<C1281x0.a> weakReference : this.listeners) {
            C1281x0.a aVar = weakReference.get();
            if (aVar == null) {
                arrayList.add(weakReference);
            } else {
                aVar.mo4283b();
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.listeners.remove((WeakReference) it.next());
        }
    }

    @Override // bsh.C1281x0
    public Class<?> defineClass(String str, byte[] bArr) {
        this.baseClassPath.m4240P(str, new C1157n.d(bArr));
        try {
            reloadClasses(new String[]{str});
            return classForName(str);
        } catch (C1234p1 e10) {
            C1237p4.m5045a("defineClass: ", e10);
            return null;
        }
    }

    @Override // bsh.C1281x0
    public void doSuperImport() throws C1279w4 {
        try {
            getClassPath().m4233C();
            getClassNameByUnqName(_UrlKt.FRAGMENT_ENCODE_SET);
            this.superImport = true;
        } catch (C1234p1 e10) {
            throw new C1279w4("Error importing classpath " + e10, e10);
        }
    }

    public void dump(PrintWriter printWriter) {
        printWriter.println("Bsh Class Manager Dump: ");
        printWriter.println("----------------------- ");
        printWriter.println("baseLoader = " + this.baseLoader);
        printWriter.println("loaderMap= " + this.loaderMap);
        printWriter.println("----------------------- ");
        printWriter.println("baseClassPath = " + this.baseClassPath);
    }

    public ClassLoader getBaseLoader() {
        return this.baseLoader;
    }

    @Override // bsh.C1281x0
    public String getClassNameByUnqName(String str) {
        return getClassPath().m4252t(str);
    }

    public C1157n getClassPath() {
        C1157n c1157n = this.fullClassPath;
        if (c1157n != null) {
            return c1157n;
        }
        C1157n c1157n2 = new C1157n("BeanShell Full Class Path");
        this.fullClassPath = c1157n2;
        c1157n2.m4245k(C1157n.m4211A());
        try {
            this.fullClassPath.m4245k(C1157n.m4231s());
        } catch (C1234p1 unused) {
            System.err.println("Warning: can't get boot class path");
        }
        this.fullClassPath.m4245k(this.baseClassPath);
        return this.fullClassPath;
    }

    public ClassLoader getLoaderForClass(String str) {
        return this.loaderMap.get(str);
    }

    @Override // bsh.C1281x0
    public URL getResource(String str) {
        C1144a c1144a = this.baseLoader;
        URL resource = c1144a != null ? c1144a.getResource(str.substring(1)) : null;
        return resource == null ? super.getResource(str) : resource;
    }

    @Override // bsh.C1281x0
    public InputStream getResourceAsStream(String str) {
        C1144a c1144a = this.baseLoader;
        InputStream resourceAsStream = c1144a != null ? c1144a.getResourceAsStream(str.substring(1)) : null;
        return resourceAsStream == null ? super.getResourceAsStream(str) : resourceAsStream;
    }

    @Override // bsh.C1281x0
    public boolean hasSuperImport() {
        return this.superImport;
    }

    public void reloadAllClasses() {
        C1157n c1157n = new C1157n("temp");
        c1157n.m4245k(this.baseClassPath);
        c1157n.m4245k(C1157n.m4211A());
        setClassPath(c1157n.m4256x());
    }

    public void reloadClasses(String[] strArr) throws C1234p1 {
        clearCaches();
        if (this.baseLoader == null) {
            initBaseLoader();
        }
        C1159p.a aVar = new C1159p.a();
        for (String str : strArr) {
            C1157n.b bVarM4253u = this.baseClassPath.m4253u(str);
            if (bVarM4253u == null) {
                C1157n.m4211A().m4233C();
                bVarM4253u = C1157n.m4211A().m4253u(str);
            }
            if (bVarM4253u == null) {
                throw new C1234p1("Nothing known about class: " + str);
            }
            if (bVarM4253u instanceof C1157n.e) {
                throw new C1234p1("Cannot reload class: " + str + " from source: " + bVarM4253u);
            }
            aVar.put(str, bVarM4253u);
        }
        C1159p.m4266e(this, aVar);
        Iterator it = aVar.keySet().iterator();
        while (it.hasNext()) {
            this.loaderMap.put((String) it.next(), C1159p.m4265d());
        }
        classLoaderChanged();
    }

    public void reloadPackage(String str) throws C1234p1 {
        Set setM4254v = this.baseClassPath.m4254v(str);
        if (setM4254v == null) {
            setM4254v = C1157n.m4211A().m4254v(str);
        }
        if (setM4254v != null) {
            reloadClasses((String[]) setM4254v.toArray(new String[setM4254v.size()]));
        } else {
            throw new C1234p1("No classes found for package: " + str);
        }
    }

    public void removeListener(C1281x0.a aVar) {
        throw new Error("unimplemented");
    }

    @Override // bsh.C1281x0
    public void reset() {
        this.baseClassPath = new C1157n("baseClassPath");
        this.baseLoader = null;
        this.loaderMap.clear();
        classLoaderChanged();
    }

    public void setClassPath(URL[] urlArr) {
        this.baseClassPath.m4241Q(urlArr);
        initBaseLoader();
        this.loaderMap.clear();
        classLoaderChanged();
    }
}
