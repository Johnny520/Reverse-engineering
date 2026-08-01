package bsh;

import androidx.activity.AbstractC0900;
import bsh.classpath.ClassManagerImpl;
import bsh.util.ValueReferenceMap$Type;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.net.URL;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import net.bytebuddy.pool.TypePool;
import p119.C8100;
import p154.C8358;
import p296.C9200;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C9200 f8305 = new C9200(new C3474(2), ValueReferenceMap$Type.Soft);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8358 f8308;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ClassLoader f8310;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Interpreter f8311;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8100 f8309 = new C8100(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final transient ConcurrentHashMap f8307 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final transient ConcurrentHashMap.KeySetView f8306 = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final transient ConcurrentHashMap f8312 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C3493 m5928(Interpreter interpreter) {
        C3493 c3493;
        WeakHashMap weakHashMap = C3488.f8291;
        if (!weakHashMap.containsKey("bsh.classpath.ClassManagerImpl")) {
            try {
                weakHashMap.put("bsh.classpath.ClassManagerImpl", ClassManagerImpl.class);
            } catch (ClassNotFoundException unused) {
                weakHashMap.put("bsh.classpath.ClassManagerImpl", null);
            }
        }
        WeakHashMap weakHashMap2 = C3488.f8291;
        if (((Class) weakHashMap2.get("bsh.classpath.ClassManagerImpl")) != null) {
            try {
                try {
                    c3493 = (C3493) ((Class) weakHashMap2.get("bsh.classpath.ClassManagerImpl")).getConstructor(null).newInstance(null);
                } catch (IllegalArgumentException | ReflectiveOperationException | SecurityException e) {
                    e = e;
                    throw new InterpreterError("Error loading classmanager", e);
                }
            } catch (ReflectiveOperationException e2) {
                e = e2;
                throw new InterpreterError("Error loading classmanager", e);
            } catch (SecurityException e3) {
                e = e3;
                throw new InterpreterError("Error loading classmanager", e);
            }
        } else {
            c3493 = new C3493();
        }
        c3493.f8311 = interpreter;
        return c3493;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m5929() {
        this.f8306.clear();
        this.f8307.clear();
        C9200 c9200 = f8305;
        synchronized (c9200) {
            HashMap map = c9200.f23458;
            while (true) {
                Reference referencePoll = c9200.f23457.poll();
                if (referencePoll != null) {
                    Object obj = map.get(referencePoll);
                    if (obj != null) {
                        c9200.f23459.remove(obj);
                    }
                    map.remove(referencePoll);
                } else {
                    c9200.f23459.clear();
                    c9200.f23458.clear();
                    c9200.f23456 = 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Class mo5694(String str) {
        Class<?> clsLoadClass;
        try {
            ClassLoader classLoader = this.f8310;
            clsLoadClass = classLoader != null ? classLoader.loadClass(str) : Class.forName(str);
            m5930(clsLoadClass, str);
        } catch (ClassNotFoundException unused) {
            clsLoadClass = null;
        }
        return (clsLoadClass == null && this.f8311.getCompatibility()) ? m5931(str) : clsLoadClass;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5930(Class cls, String str) {
        if (cls == null) {
            this.f8306.add(str);
        } else {
            this.f8307.put(str, cls);
            f8305.m14429(cls);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public void mo5697() {
        m5929();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo5699() throws Capabilities$Unavailable {
        throw new Capabilities$Unavailable("ClassLoading features unavailable.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public Class mo5700(String str, byte[] bArr) {
        throw new InterpreterError(AbstractC0900.m718("Can't create class (", str, ") without class manager package."));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public boolean mo5701() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final Class m5931(String str) {
        String str2 = "/" + str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ".java";
        URL urlMo5703 = mo5703(str2);
        if (urlMo5703 == null) {
            return null;
        }
        try {
            C3467 c3467 = new C3467((InputStream) urlMo5703.getContent());
            try {
                Interpreter.debug("Loading class from source file: ".concat(str2));
                this.f8311.eval(c3467);
                c3467.close();
            } catch (Throwable th) {
                try {
                    c3467.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (EvalError | IOException e) {
            if (Interpreter.DEBUG.get().booleanValue()) {
                e.printStackTrace();
            }
        }
        try {
            ClassLoader classLoader = this.f8310;
            Class<?> clsLoadClass = classLoader != null ? classLoader.loadClass(str) : Class.forName(str);
            m5930(clsLoadClass, str);
            return clsLoadClass;
        } catch (ClassNotFoundException unused) {
            Interpreter.debug("Class not found in source file: ".concat(str));
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public String mo5702(String str) throws Capabilities$Unavailable {
        throw new Capabilities$Unavailable("ClassLoading features unavailable.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public URL mo5703(String str) {
        ClassLoader classLoader = this.f8310;
        URL resource = classLoader != null ? classLoader.getResource(str.substring(1)) : null;
        return resource == null ? Interpreter.class.getResource(str) : resource;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo5693() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo5695(InterfaceC3490 interfaceC3490) {
    }
}
