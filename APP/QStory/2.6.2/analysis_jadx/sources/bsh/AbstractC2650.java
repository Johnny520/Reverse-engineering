package bsh;

import com.kongzue.dialogx.util.C3762;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import p138.AbstractC7529;
import p283.C8380;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2650 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f7933;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2618 f7934;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3762 f7932 = new C3762();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final WeakHashMap f7931 = new WeakHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static volatile int f7930 = 1;

    static {
        new HashMap();
    }

    public AbstractC2650(InterfaceC2618 interfaceC2618) {
        this.f7934 = interfaceC2618;
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC2650.class.getName());
        sb.append("Type");
        int i = f7930;
        f7930 = i + 1;
        sb.append(i);
        String string = sb.toString();
        C8380 c8380 = new C8380();
        c8380.m13914(1537, string.replace(".", "/"), null, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME, null);
        C3762 c3762 = f7932;
        byte[] bArrM13915 = c8380.m13915();
        c3762.getClass();
        ConcurrentHashMap concurrentHashMap = AbstractC7529.f20412;
        Class clsM12725 = AbstractC7529.m12725(string, bArrM13915, AbstractC7529.class.getClassLoader());
        this.f7933 = clsM12725;
        f7931.put(this, clsM12725);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m5309(Class cls, Class cls2, int i) {
        for (Method method : cls2.getMethods()) {
            if (Modifier.isAbstract(method.getModifiers()) && !method.isBridge() && !method.isSynthetic()) {
                Map map = AbstractC2661.f7970;
                try {
                    Object.class.getMethod(method.getName(), method.getParameterTypes());
                } catch (NoSuchMethodException unused) {
                    for (Map.Entry entry : f7931.entrySet()) {
                        if (entry.getValue() == cls) {
                            return ((AbstractC2650) entry.getKey()).mo5310(method, i);
                        }
                    }
                    return false;
                }
            }
        }
        C5919.m11249("This class isn't a valid Functional Interface: ".concat(cls2.getName()));
        return false;
    }

    public final <T> T invoke(Object[] objArr, Class<?>[] clsArr, Class<T> cls) throws Throwable {
        InterfaceC2618 interfaceC2618 = this.f7934;
        try {
            Object objUnwrap = cls.isPrimitive() ? Primitive.unwrap(mo5311(objArr)) : mo5311(objArr);
            if (cls == Void.TYPE) {
                return null;
            }
            return (T) Primitive.unwrap(AbstractC2661.m5328(objUnwrap, cls, 1));
        } catch (TargetError e) {
            for (Class<?> cls2 : clsArr) {
                if (cls2.isInstance(e.getTarget())) {
                    throw e.getTarget();
                }
            }
            throw new RuntimeEvalError("Can't invoke lambda: Unexpected Exception: " + e.getTarget().getMessage(), interfaceC2618, null, e.getTarget());
        } catch (EvalError e2) {
            throw new RuntimeEvalError("Can't invoke lambda: " + e2.getMessage(), interfaceC2618, null, e2);
        } catch (UtilEvalError e3) {
            throw new RuntimeEvalError(e3.toEvalError(interfaceC2618, null));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public abstract boolean mo5310(Method method, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract Object mo5311(Object[] objArr);
}
