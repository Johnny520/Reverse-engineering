package bsh.classpath;

import androidx.activity.AbstractC0900;
import bsh.C3466;
import bsh.C3493;
import bsh.ClassPathException;
import bsh.InterfaceC3490;
import bsh.Interpreter;
import bsh.UtilEvalError;
import java.io.PrintStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import p025.AbstractC7012;
import p154.C8358;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ClassManagerImpl extends C3493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C3440 f8132;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C3443 f8135;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C3443 f8137;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f8138;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final ConcurrentHashMap.KeySetView f8136 = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ReferenceQueue f8133 = new ReferenceQueue();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final ConcurrentHashMap f8134 = new ConcurrentHashMap();

    public ClassManagerImpl() {
        mo5697();
    }

    @Override // bsh.C3493
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo5693() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap.KeySetView<WeakReference> keySetView = this.f8136;
        for (WeakReference weakReference : keySetView) {
            InterfaceC3490 interfaceC3490 = (InterfaceC3490) weakReference.get();
            if (interfaceC3490 == null) {
                arrayList.add(weakReference);
            } else {
                interfaceC3490.classLoaderChanged();
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            keySetView.remove((WeakReference) it.next());
        }
    }

    @Override // bsh.C3493
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class mo5694(String str) {
        ClassLoader classLoader;
        C3440 c3440;
        Class<?> clsLoadClass = (Class) this.f8307.get(str);
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        if (this.f8306.contains(str)) {
            Interpreter.debug("absoluteNonClass list hit: ", str);
            return null;
        }
        Interpreter.debug("Trying to load class: ", str);
        ClassLoader classLoader2 = (ClassLoader) this.f8134.get(str);
        if (classLoader2 != null) {
            try {
                clsLoadClass = classLoader2.loadClass(str);
            } catch (Exception e) {
                Interpreter.debug("overlay loader failed for '", "' - ", e);
            }
        }
        if (clsLoadClass == null && str.startsWith("bsh")) {
            ClassLoader classLoader3 = Interpreter.class.getClassLoader();
            try {
                clsLoadClass = classLoader3 != null ? classLoader3.loadClass(str) : Class.forName(str);
            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            }
        }
        if (clsLoadClass == null && (c3440 = this.f8132) != null) {
            try {
                clsLoadClass = c3440.loadClass(str);
            } catch (ClassNotFoundException unused2) {
            }
        }
        if (clsLoadClass == null && (classLoader = this.f8310) != null) {
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
            } catch (NoClassDefFoundError e2) {
                PrintStream printStream = System.err;
                StringBuilder sbM12144 = AbstractC7012.m12144("The class named '", str, "' could not be found, either because it no longer exists or it is not contained in the class file of the same name. Caused by: ");
                sbM12144.append(e2.getMessage());
                printStream.println(sbM12144.toString());
            }
        }
        if (clsLoadClass == null) {
            clsLoadClass = m5931(str);
        }
        m5930(clsLoadClass, str);
        return clsLoadClass;
    }

    @Override // bsh.C3493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo5695(InterfaceC3490 interfaceC3490) {
        ReferenceQueue referenceQueue = this.f8133;
        WeakReference weakReference = new WeakReference(interfaceC3490, referenceQueue);
        ConcurrentHashMap.KeySetView keySetView = this.f8136;
        keySetView.add(weakReference);
        while (true) {
            Reference referencePoll = referenceQueue.poll();
            if (referencePoll == null) {
                return;
            }
            if (!keySetView.remove(referencePoll)) {
                Interpreter.debug("tried to remove non-existent weak ref: ", referencePoll);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C3443 m5696() {
        C3443 c3443 = this.f8135;
        if (c3443 != null) {
            return c3443;
        }
        C3443 c34432 = new C3443("BeanShell Full Class Path");
        this.f8135 = c34432;
        c34432.m5712(C3443.m5709());
        try {
            this.f8135.m5712(C3443.m5706());
        } catch (ClassPathException unused) {
            System.err.println("Warning: can't get boot class path");
        }
        this.f8135.m5712(this.f8137);
        return this.f8135;
    }

    @Override // bsh.C3493
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo5697() {
        this.f8137 = new C3443("baseClassPath");
        this.f8132 = null;
        this.f8134.clear();
        ClassLoader classLoader = this.f8310;
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        this.f8308 = new C8358(classLoader);
        mo5693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m5698(String[] strArr) throws ClassPathException {
        m5929();
        if (this.f8132 == null) {
            C3443 c3443 = this.f8137;
            c3443.getClass();
            ArrayList arrayList = new ArrayList();
            c3443.f8159.forEach(new C3439(arrayList, 3));
            arrayList.addAll(c3443.f8160);
            this.f8132 = new C3440(this, (URL[]) arrayList.toArray(new URL[0]));
        }
        DiscreteFilesClassLoader$ClassSourceMap discreteFilesClassLoader$ClassSourceMap = new DiscreteFilesClassLoader$ClassSourceMap();
        for (String str : strArr) {
            AbstractC3441 abstractC3441M5711 = this.f8137.m5711(str);
            if (abstractC3441M5711 == null) {
                C3443.m5709().m5713(true);
                abstractC3441M5711 = C3443.m5709().m5711(str);
            }
            if (abstractC3441M5711 == null) {
                throw new ClassPathException(AbstractC0900.m717("Nothing known about class: ", str));
            }
            if (abstractC3441M5711 instanceof C3446) {
                throw new ClassPathException("Cannot reload class: " + str + " from source: " + abstractC3441M5711);
            }
            discreteFilesClassLoader$ClassSourceMap.put(str, abstractC3441M5711);
        }
        C3444 c3444 = new C3444(this, new URL[0]);
        c3444.f8165 = discreteFilesClassLoader$ClassSourceMap;
        C3444.f8164 = c3444;
        Iterator<String> it = discreteFilesClassLoader$ClassSourceMap.keySet().iterator();
        while (it.hasNext()) {
            this.f8134.put(it.next(), C3444.f8164);
        }
        mo5693();
    }

    @Override // bsh.C3493
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo5699() throws UtilEvalError {
        try {
            m5696().m5713(true);
            mo5702("");
            this.f8138 = true;
        } catch (ClassPathException e) {
            throw new UtilEvalError("Error importing classpath " + e, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bsh.C3493
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Class mo5700(String str, byte[] bArr) {
        C3443 c3443 = this.f8137;
        C3445 c3445 = new C3445(1);
        c3445.f8147 = bArr;
        c3443.f8157.put(str, c3445);
        try {
            m5698(new String[]{str});
            return mo5694(str);
        } catch (ClassPathException e) {
            C3466.m5898("defineClass: ", e);
            return null;
        }
    }

    @Override // bsh.C3493
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo5701() {
        return this.f8138;
    }

    @Override // bsh.C3493
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String mo5702(String str) throws ClassPathException {
        C3443 c3443M5696 = m5696();
        int i = 1;
        c3443M5696.m5713(true);
        if (c3443M5696.f8163 == null) {
            BshClassPath$UnqualifiedNameTable bshClassPath$UnqualifiedNameTable = new BshClassPath$UnqualifiedNameTable();
            c3443M5696.f8159.forEach(new C3439(bshClassPath$UnqualifiedNameTable, i));
            c3443M5696.f8157.keySet().forEach(new C3439(bshClassPath$UnqualifiedNameTable, 2));
            c3443M5696.f8163 = bshClassPath$UnqualifiedNameTable;
        }
        C3442 c3442 = c3443M5696.f8163.get(str);
        if (c3442 == null) {
            return null;
        }
        ArrayList arrayList = c3442.f8148;
        if (arrayList.size() == 1) {
            return (String) arrayList.get(0);
        }
        throw new ClassPathException("Ambiguous class names: " + arrayList);
    }

    @Override // bsh.C3493
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final URL mo5703(String str) {
        C3440 c3440 = this.f8132;
        URL resource = c3440 != null ? c3440.getResource(str.substring(1)) : null;
        return resource == null ? super.mo5703(str) : resource;
    }
}
