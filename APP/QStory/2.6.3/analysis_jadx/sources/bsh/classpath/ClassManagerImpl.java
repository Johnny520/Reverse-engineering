package bsh.classpath;

import androidx.activity.AbstractC0053;
import bsh.C2633;
import bsh.C2660;
import bsh.ClassPathException;
import bsh.InterfaceC2657;
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
import p009.AbstractC6183;
import p138.C7529;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ClassManagerImpl extends C2660 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C2607 f7787;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C2610 f7790;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C2610 f7792;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f7793;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final ConcurrentHashMap.KeySetView f7791 = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ReferenceQueue f7788 = new ReferenceQueue();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final ConcurrentHashMap f7789 = new ConcurrentHashMap();

    public ClassManagerImpl() {
        mo5137();
    }

    @Override // bsh.C2660
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo5133() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap.KeySetView<WeakReference> keySetView = this.f7791;
        for (WeakReference weakReference : keySetView) {
            InterfaceC2657 interfaceC2657 = (InterfaceC2657) weakReference.get();
            if (interfaceC2657 == null) {
                arrayList.add(weakReference);
            } else {
                interfaceC2657.classLoaderChanged();
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            keySetView.remove((WeakReference) it.next());
        }
    }

    @Override // bsh.C2660
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class mo5134(String str) {
        ClassLoader classLoader;
        C2607 c2607;
        Class<?> clsLoadClass = (Class) this.f7962.get(str);
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        if (this.f7961.contains(str)) {
            Interpreter.debug("absoluteNonClass list hit: ", str);
            return null;
        }
        Interpreter.debug("Trying to load class: ", str);
        ClassLoader classLoader2 = (ClassLoader) this.f7789.get(str);
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
        if (clsLoadClass == null && (c2607 = this.f7787) != null) {
            try {
                clsLoadClass = c2607.loadClass(str);
            } catch (ClassNotFoundException unused2) {
            }
        }
        if (clsLoadClass == null && (classLoader = this.f7965) != null) {
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
                StringBuilder sbM11585 = AbstractC6183.m11585("The class named '", str, "' could not be found, either because it no longer exists or it is not contained in the class file of the same name. Caused by: ");
                sbM11585.append(e2.getMessage());
                printStream.println(sbM11585.toString());
            }
        }
        if (clsLoadClass == null) {
            clsLoadClass = m5371(str);
        }
        m5370(clsLoadClass, str);
        return clsLoadClass;
    }

    @Override // bsh.C2660
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo5135(InterfaceC2657 interfaceC2657) {
        ReferenceQueue referenceQueue = this.f7788;
        WeakReference weakReference = new WeakReference(interfaceC2657, referenceQueue);
        ConcurrentHashMap.KeySetView keySetView = this.f7791;
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
    public final C2610 m5136() {
        C2610 c2610 = this.f7790;
        if (c2610 != null) {
            return c2610;
        }
        C2610 c26102 = new C2610("BeanShell Full Class Path");
        this.f7790 = c26102;
        c26102.m5152(C2610.m5149());
        try {
            this.f7790.m5152(C2610.m5146());
        } catch (ClassPathException unused) {
            System.err.println("Warning: can't get boot class path");
        }
        this.f7790.m5152(this.f7792);
        return this.f7790;
    }

    @Override // bsh.C2660
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo5137() {
        this.f7792 = new C2610("baseClassPath");
        this.f7787 = null;
        this.f7789.clear();
        ClassLoader classLoader = this.f7965;
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        this.f7963 = new C7529(classLoader);
        mo5133();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m5138(String[] strArr) throws ClassPathException {
        m5369();
        if (this.f7787 == null) {
            C2610 c2610 = this.f7792;
            c2610.getClass();
            ArrayList arrayList = new ArrayList();
            c2610.f7814.forEach(new C2606(arrayList, 3));
            arrayList.addAll(c2610.f7815);
            this.f7787 = new C2607(this, (URL[]) arrayList.toArray(new URL[0]));
        }
        DiscreteFilesClassLoader$ClassSourceMap discreteFilesClassLoader$ClassSourceMap = new DiscreteFilesClassLoader$ClassSourceMap();
        for (String str : strArr) {
            AbstractC2608 abstractC2608M5151 = this.f7792.m5151(str);
            if (abstractC2608M5151 == null) {
                C2610.m5149().m5153(true);
                abstractC2608M5151 = C2610.m5149().m5151(str);
            }
            if (abstractC2608M5151 == null) {
                throw new ClassPathException(AbstractC0053.m157("Nothing known about class: ", str));
            }
            if (abstractC2608M5151 instanceof C2613) {
                throw new ClassPathException("Cannot reload class: " + str + " from source: " + abstractC2608M5151);
            }
            discreteFilesClassLoader$ClassSourceMap.put(str, abstractC2608M5151);
        }
        C2611 c2611 = new C2611(this, new URL[0]);
        c2611.f7820 = discreteFilesClassLoader$ClassSourceMap;
        C2611.f7819 = c2611;
        Iterator<String> it = discreteFilesClassLoader$ClassSourceMap.keySet().iterator();
        while (it.hasNext()) {
            this.f7789.put(it.next(), C2611.f7819);
        }
        mo5133();
    }

    @Override // bsh.C2660
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo5139() throws UtilEvalError {
        try {
            m5136().m5153(true);
            mo5142("");
            this.f7793 = true;
        } catch (ClassPathException e) {
            throw new UtilEvalError("Error importing classpath " + e, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bsh.C2660
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Class mo5140(String str, byte[] bArr) {
        C2610 c2610 = this.f7792;
        C2612 c2612 = new C2612(1);
        c2612.f7802 = bArr;
        c2610.f7812.put(str, c2612);
        try {
            m5138(new String[]{str});
            return mo5134(str);
        } catch (ClassPathException e) {
            C2633.m5338("defineClass: ", e);
            return null;
        }
    }

    @Override // bsh.C2660
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo5141() {
        return this.f7793;
    }

    @Override // bsh.C2660
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String mo5142(String str) throws ClassPathException {
        C2610 c2610M5136 = m5136();
        int i = 1;
        c2610M5136.m5153(true);
        if (c2610M5136.f7818 == null) {
            BshClassPath$UnqualifiedNameTable bshClassPath$UnqualifiedNameTable = new BshClassPath$UnqualifiedNameTable();
            c2610M5136.f7814.forEach(new C2606(bshClassPath$UnqualifiedNameTable, i));
            c2610M5136.f7812.keySet().forEach(new C2606(bshClassPath$UnqualifiedNameTable, 2));
            c2610M5136.f7818 = bshClassPath$UnqualifiedNameTable;
        }
        C2609 c2609 = c2610M5136.f7818.get(str);
        if (c2609 == null) {
            return null;
        }
        ArrayList arrayList = c2609.f7803;
        if (arrayList.size() == 1) {
            return (String) arrayList.get(0);
        }
        throw new ClassPathException("Ambiguous class names: " + arrayList);
    }

    @Override // bsh.C2660
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final URL mo5143(String str) {
        C2607 c2607 = this.f7787;
        URL resource = c2607 != null ? c2607.getResource(str.substring(1)) : null;
        return resource == null ? super.mo5143(str) : resource;
    }
}
