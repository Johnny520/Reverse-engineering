package bsh.classpath;

import androidx.activity.AbstractC0053;
import bsh.C2632;
import bsh.C2659;
import bsh.ClassPathException;
import bsh.InterfaceC2656;
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
import p007.AbstractC6136;
import p138.C7528;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class ClassManagerImpl extends C2659 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C2606 f7785;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C2609 f7788;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C2609 f7790;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f7791;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final ConcurrentHashMap.KeySetView f7789 = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ReferenceQueue f7786 = new ReferenceQueue();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final ConcurrentHashMap f7787 = new ConcurrentHashMap();

    public ClassManagerImpl() {
        mo5092();
    }

    @Override // bsh.C2659
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo5088() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap.KeySetView<WeakReference> keySetView = this.f7789;
        for (WeakReference weakReference : keySetView) {
            InterfaceC2656 interfaceC2656 = (InterfaceC2656) weakReference.get();
            if (interfaceC2656 == null) {
                arrayList.add(weakReference);
            } else {
                interfaceC2656.classLoaderChanged();
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            keySetView.remove((WeakReference) it.next());
        }
    }

    @Override // bsh.C2659
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class mo5089(String str) {
        ClassLoader classLoader;
        C2606 c2606;
        Class<?> clsLoadClass = (Class) this.f7960.get(str);
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        if (this.f7959.contains(str)) {
            Interpreter.debug("absoluteNonClass list hit: ", str);
            return null;
        }
        Interpreter.debug("Trying to load class: ", str);
        ClassLoader classLoader2 = (ClassLoader) this.f7787.get(str);
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
        if (clsLoadClass == null && (c2606 = this.f7785) != null) {
            try {
                clsLoadClass = c2606.loadClass(str);
            } catch (ClassNotFoundException unused2) {
            }
        }
        if (clsLoadClass == null && (classLoader = this.f7963) != null) {
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
                StringBuilder sbM11550 = AbstractC6136.m11550("The class named '", str, "' could not be found, either because it no longer exists or it is not contained in the class file of the same name. Caused by: ");
                sbM11550.append(e2.getMessage());
                printStream.println(sbM11550.toString());
            }
        }
        if (clsLoadClass == null) {
            clsLoadClass = m5326(str);
        }
        m5325(clsLoadClass, str);
        return clsLoadClass;
    }

    @Override // bsh.C2659
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo5090(InterfaceC2656 interfaceC2656) {
        ReferenceQueue referenceQueue = this.f7786;
        WeakReference weakReference = new WeakReference(interfaceC2656, referenceQueue);
        ConcurrentHashMap.KeySetView keySetView = this.f7789;
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
    public final C2609 m5091() {
        C2609 c2609 = this.f7788;
        if (c2609 != null) {
            return c2609;
        }
        C2609 c26092 = new C2609("BeanShell Full Class Path");
        this.f7788 = c26092;
        c26092.m5107(C2609.m5104());
        try {
            this.f7788.m5107(C2609.m5101());
        } catch (ClassPathException unused) {
            System.err.println("Warning: can't get boot class path");
        }
        this.f7788.m5107(this.f7790);
        return this.f7788;
    }

    @Override // bsh.C2659
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo5092() {
        this.f7790 = new C2609("baseClassPath");
        this.f7785 = null;
        this.f7787.clear();
        ClassLoader classLoader = this.f7963;
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        this.f7961 = new C7528(classLoader);
        mo5088();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m5093(String[] strArr) throws ClassPathException {
        m5324();
        if (this.f7785 == null) {
            C2609 c2609 = this.f7790;
            c2609.getClass();
            ArrayList arrayList = new ArrayList();
            c2609.f7812.forEach(new C2605(arrayList, 3));
            arrayList.addAll(c2609.f7813);
            this.f7785 = new C2606(this, (URL[]) arrayList.toArray(new URL[0]));
        }
        DiscreteFilesClassLoader$ClassSourceMap discreteFilesClassLoader$ClassSourceMap = new DiscreteFilesClassLoader$ClassSourceMap();
        for (String str : strArr) {
            AbstractC2607 abstractC2607M5106 = this.f7790.m5106(str);
            if (abstractC2607M5106 == null) {
                C2609.m5104().m5108(true);
                abstractC2607M5106 = C2609.m5104().m5106(str);
            }
            if (abstractC2607M5106 == null) {
                throw new ClassPathException(AbstractC0053.m152("Nothing known about class: ", str));
            }
            if (abstractC2607M5106 instanceof C2612) {
                throw new ClassPathException("Cannot reload class: " + str + " from source: " + abstractC2607M5106);
            }
            discreteFilesClassLoader$ClassSourceMap.put(str, abstractC2607M5106);
        }
        C2610 c2610 = new C2610(this, new URL[0]);
        c2610.f7818 = discreteFilesClassLoader$ClassSourceMap;
        C2610.f7817 = c2610;
        Iterator<String> it = discreteFilesClassLoader$ClassSourceMap.keySet().iterator();
        while (it.hasNext()) {
            this.f7787.put(it.next(), C2610.f7817);
        }
        mo5088();
    }

    @Override // bsh.C2659
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo5094() throws UtilEvalError {
        try {
            m5091().m5108(true);
            mo5097("");
            this.f7791 = true;
        } catch (ClassPathException e) {
            throw new UtilEvalError("Error importing classpath " + e, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bsh.C2659
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Class mo5095(String str, byte[] bArr) {
        C2609 c2609 = this.f7790;
        C2611 c2611 = new C2611(1);
        c2611.f7800 = bArr;
        c2609.f7810.put(str, c2611);
        try {
            m5093(new String[]{str});
            return mo5089(str);
        } catch (ClassPathException e) {
            C2632.m5293("defineClass: ", e);
            return null;
        }
    }

    @Override // bsh.C2659
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo5096() {
        return this.f7791;
    }

    @Override // bsh.C2659
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String mo5097(String str) throws ClassPathException {
        C2609 c2609M5091 = m5091();
        int i = 1;
        c2609M5091.m5108(true);
        if (c2609M5091.f7816 == null) {
            BshClassPath$UnqualifiedNameTable bshClassPath$UnqualifiedNameTable = new BshClassPath$UnqualifiedNameTable();
            c2609M5091.f7812.forEach(new C2605(bshClassPath$UnqualifiedNameTable, i));
            c2609M5091.f7810.keySet().forEach(new C2605(bshClassPath$UnqualifiedNameTable, 2));
            c2609M5091.f7816 = bshClassPath$UnqualifiedNameTable;
        }
        C2608 c2608 = c2609M5091.f7816.get(str);
        if (c2608 == null) {
            return null;
        }
        ArrayList arrayList = c2608.f7801;
        if (arrayList.size() == 1) {
            return (String) arrayList.get(0);
        }
        throw new ClassPathException("Ambiguous class names: " + arrayList);
    }

    @Override // bsh.C2659
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final URL mo5098(String str) {
        C2606 c2606 = this.f7785;
        URL resource = c2606 != null ? c2606.getResource(str.substring(1)) : null;
        return resource == null ? super.mo5098(str) : resource;
    }
}
