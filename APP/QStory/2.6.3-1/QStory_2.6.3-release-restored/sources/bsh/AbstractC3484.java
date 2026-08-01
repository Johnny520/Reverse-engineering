package bsh;

import com.kongzue.dialogx.util.C4595;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import p154.AbstractC8359;
import p299.C9210;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3484 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8280;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3452 f8281;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4595 f8279 = new C4595();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final WeakHashMap f8278 = new WeakHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static volatile int f8277 = 1;

    static {
        new HashMap();
    }

    public AbstractC3484(InterfaceC3452 interfaceC3452) {
        this.f8281 = interfaceC3452;
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3484.class.getName());
        sb.append("Type");
        int i = f8277;
        f8277 = i + 1;
        sb.append(i);
        String string = sb.toString();
        C9210 c9210 = new C9210();
        c9210.m14490(1537, string.replace(".", "/"), null, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME, null);
        C4595 c4595 = f8279;
        byte[] bArrM14491 = c9210.m14491();
        c4595.getClass();
        ConcurrentHashMap concurrentHashMap = AbstractC8359.f20752;
        Class clsM13313 = AbstractC8359.m13313(string, bArrM14491, AbstractC8359.class.getClassLoader());
        this.f8280 = clsM13313;
        f8278.put(this, clsM13313);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m5914(Class cls, Class cls2, int i) {
        for (Method method : cls2.getMethods()) {
            if (Modifier.isAbstract(method.getModifiers()) && !method.isBridge() && !method.isSynthetic()) {
                Map map = AbstractC3495.f8317;
                try {
                    Object.class.getMethod(method.getName(), method.getParameterTypes());
                } catch (NoSuchMethodException unused) {
                    for (Map.Entry entry : f8278.entrySet()) {
                        if (entry.getValue() == cls) {
                            return ((AbstractC3484) entry.getKey()).mo5915(method, i);
                        }
                    }
                    return false;
                }
            }
        }
        C6755.m11869("This class isn't a valid Functional Interface: ".concat(cls2.getName()));
        return false;
    }

    public final <T> T invoke(Object[] objArr, Class<?>[] clsArr, Class<T> cls) throws Throwable {
        InterfaceC3452 interfaceC3452 = this.f8281;
        try {
            Object objUnwrap = cls.isPrimitive() ? Primitive.unwrap(mo5916(objArr)) : mo5916(objArr);
            if (cls == Void.TYPE) {
                return null;
            }
            return (T) Primitive.unwrap(AbstractC3495.m5933(objUnwrap, cls, 1));
        } catch (TargetError e) {
            for (Class<?> cls2 : clsArr) {
                if (cls2.isInstance(e.getTarget())) {
                    throw e.getTarget();
                }
            }
            throw new RuntimeEvalError("Can't invoke lambda: Unexpected Exception: " + e.getTarget().getMessage(), interfaceC3452, null, e.getTarget());
        } catch (EvalError e2) {
            throw new RuntimeEvalError("Can't invoke lambda: " + e2.getMessage(), interfaceC3452, null, e2);
        } catch (UtilEvalError e3) {
            throw new RuntimeEvalError(e3.toEvalError(interfaceC3452, null));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public abstract boolean mo5915(Method method, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract Object mo5916(Object[] objArr);
}
