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
import p103.C7270;
import p138.C7528;
import p280.C8370;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2659 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C8370 f7958 = new C8370(new C2640(2), ValueReferenceMap$Type.Soft);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7528 f7961;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ClassLoader f7963;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Interpreter f7964;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7270 f7962 = new C7270(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final transient ConcurrentHashMap f7960 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final transient ConcurrentHashMap.KeySetView f7959 = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final transient ConcurrentHashMap f7965 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C2659 m5323(Interpreter interpreter) {
        C2659 c2659;
        WeakHashMap weakHashMap = C2654.f7944;
        if (!weakHashMap.containsKey("bsh.classpath.ClassManagerImpl")) {
            try {
                weakHashMap.put("bsh.classpath.ClassManagerImpl", ClassManagerImpl.class);
            } catch (ClassNotFoundException unused) {
                weakHashMap.put("bsh.classpath.ClassManagerImpl", null);
            }
        }
        WeakHashMap weakHashMap2 = C2654.f7944;
        if (((Class) weakHashMap2.get("bsh.classpath.ClassManagerImpl")) != null) {
            try {
                try {
                    c2659 = (C2659) ((Class) weakHashMap2.get("bsh.classpath.ClassManagerImpl")).getConstructor(null).newInstance(null);
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
            c2659 = new C2659();
        }
        c2659.f7964 = interpreter;
        return c2659;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m5324() {
        this.f7959.clear();
        this.f7960.clear();
        C8370 c8370 = f7958;
        synchronized (c8370) {
            HashMap map = c8370.f23114;
            while (true) {
                Reference referencePoll = c8370.f23113.poll();
                if (referencePoll != null) {
                    Object obj = map.get(referencePoll);
                    if (obj != null) {
                        c8370.f23115.remove(obj);
                    }
                    map.remove(referencePoll);
                } else {
                    c8370.f23115.clear();
                    c8370.f23114.clear();
                    c8370.f23112 = 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Class mo5089(String str) {
        Class<?> clsLoadClass;
        try {
            ClassLoader classLoader = this.f7963;
            clsLoadClass = classLoader != null ? classLoader.loadClass(str) : Class.forName(str);
            m5325(clsLoadClass, str);
        } catch (ClassNotFoundException unused) {
            clsLoadClass = null;
        }
        return (clsLoadClass == null && this.f7964.getCompatibility()) ? m5326(str) : clsLoadClass;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5325(Class cls, String str) {
        if (cls == null) {
            this.f7959.add(str);
        } else {
            this.f7960.put(str, cls);
            f7958.m13853(cls);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public void mo5092() {
        m5324();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo5094() throws Capabilities$Unavailable {
        throw new Capabilities$Unavailable("ClassLoading features unavailable.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public Class mo5095(String str, byte[] bArr) {
        throw new InterpreterError(AbstractC0053.m156("Can't create class (", str, ") without class manager package."));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public boolean mo5096() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final Class m5326(String str) {
        String str2 = "/" + str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ".java";
        URL urlMo5098 = mo5098(str2);
        if (urlMo5098 == null) {
            return null;
        }
        try {
            C2633 c2633 = new C2633((InputStream) urlMo5098.getContent());
            try {
                Interpreter.debug("Loading class from source file: ".concat(str2));
                this.f7964.eval(c2633);
                c2633.close();
            } catch (Throwable th) {
                try {
                    c2633.close();
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
            ClassLoader classLoader = this.f7963;
            Class<?> clsLoadClass = classLoader != null ? classLoader.loadClass(str) : Class.forName(str);
            m5325(clsLoadClass, str);
            return clsLoadClass;
        } catch (ClassNotFoundException unused) {
            Interpreter.debug("Class not found in source file: ".concat(str));
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public String mo5097(String str) throws Capabilities$Unavailable {
        throw new Capabilities$Unavailable("ClassLoading features unavailable.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public URL mo5098(String str) {
        ClassLoader classLoader = this.f7963;
        URL resource = classLoader != null ? classLoader.getResource(str.substring(1)) : null;
        return resource == null ? Interpreter.class.getResource(str) : resource;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo5088() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo5090(InterfaceC2656 interfaceC2656) {
    }
}
