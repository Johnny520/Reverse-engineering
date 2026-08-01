package bsh;

import androidx.activity.AbstractC0053;
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
import p103.C7271;
import p138.C7529;
import p280.C8371;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2660 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C8371 f7960 = new C8371(new C2641(2), ValueReferenceMap$Type.Soft);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7529 f7963;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ClassLoader f7965;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Interpreter f7966;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7271 f7964 = new C7271(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final transient ConcurrentHashMap f7962 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final transient ConcurrentHashMap.KeySetView f7961 = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final transient ConcurrentHashMap f7967 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C2660 m5368(Interpreter interpreter) {
        C2660 c2660;
        WeakHashMap weakHashMap = C2655.f7946;
        if (!weakHashMap.containsKey("bsh.classpath.ClassManagerImpl")) {
            try {
                weakHashMap.put("bsh.classpath.ClassManagerImpl", ClassManagerImpl.class);
            } catch (ClassNotFoundException unused) {
                weakHashMap.put("bsh.classpath.ClassManagerImpl", null);
            }
        }
        WeakHashMap weakHashMap2 = C2655.f7946;
        if (((Class) weakHashMap2.get("bsh.classpath.ClassManagerImpl")) != null) {
            try {
                try {
                    c2660 = (C2660) ((Class) weakHashMap2.get("bsh.classpath.ClassManagerImpl")).getConstructor(null).newInstance(null);
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
            c2660 = new C2660();
        }
        c2660.f7966 = interpreter;
        return c2660;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m5369() {
        this.f7961.clear();
        this.f7962.clear();
        C8371 c8371 = f7960;
        synchronized (c8371) {
            HashMap map = c8371.f23113;
            while (true) {
                Reference referencePoll = c8371.f23112.poll();
                if (referencePoll != null) {
                    Object obj = map.get(referencePoll);
                    if (obj != null) {
                        c8371.f23114.remove(obj);
                    }
                    map.remove(referencePoll);
                } else {
                    c8371.f23114.clear();
                    c8371.f23113.clear();
                    c8371.f23111 = 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Class mo5134(String str) {
        Class<?> clsLoadClass;
        try {
            ClassLoader classLoader = this.f7965;
            clsLoadClass = classLoader != null ? classLoader.loadClass(str) : Class.forName(str);
            m5370(clsLoadClass, str);
        } catch (ClassNotFoundException unused) {
            clsLoadClass = null;
        }
        return (clsLoadClass == null && this.f7966.getCompatibility()) ? m5371(str) : clsLoadClass;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5370(Class cls, String str) {
        if (cls == null) {
            this.f7961.add(str);
        } else {
            this.f7962.put(str, cls);
            f7960.m13870(cls);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public void mo5137() {
        m5369();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo5139() throws Capabilities$Unavailable {
        throw new Capabilities$Unavailable("ClassLoading features unavailable.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public Class mo5140(String str, byte[] bArr) {
        throw new InterpreterError(AbstractC0053.m158("Can't create class (", str, ") without class manager package."));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public boolean mo5141() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final Class m5371(String str) {
        String str2 = "/" + str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ".java";
        URL urlMo5143 = mo5143(str2);
        if (urlMo5143 == null) {
            return null;
        }
        try {
            C2634 c2634 = new C2634((InputStream) urlMo5143.getContent());
            try {
                Interpreter.debug("Loading class from source file: ".concat(str2));
                this.f7966.eval(c2634);
                c2634.close();
            } catch (Throwable th) {
                try {
                    c2634.close();
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
            ClassLoader classLoader = this.f7965;
            Class<?> clsLoadClass = classLoader != null ? classLoader.loadClass(str) : Class.forName(str);
            m5370(clsLoadClass, str);
            return clsLoadClass;
        } catch (ClassNotFoundException unused) {
            Interpreter.debug("Class not found in source file: ".concat(str));
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public String mo5142(String str) throws Capabilities$Unavailable {
        throw new Capabilities$Unavailable("ClassLoading features unavailable.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public URL mo5143(String str) {
        ClassLoader classLoader = this.f7965;
        URL resource = classLoader != null ? classLoader.getResource(str.substring(1)) : null;
        return resource == null ? Interpreter.class.getResource(str) : resource;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo5133() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo5135(InterfaceC2657 interfaceC2657) {
    }
}
