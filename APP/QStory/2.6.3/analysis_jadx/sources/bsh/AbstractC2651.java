package bsh;

import com.kongzue.dialogx.util.C3763;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import p138.AbstractC7530;
import p283.C8381;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2651 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f7935;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2619 f7936;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3763 f7934 = new C3763();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final WeakHashMap f7933 = new WeakHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static volatile int f7932 = 1;

    static {
        new HashMap();
    }

    public AbstractC2651(InterfaceC2619 interfaceC2619) {
        this.f7936 = interfaceC2619;
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC2651.class.getName());
        sb.append("Type");
        int i = f7932;
        f7932 = i + 1;
        sb.append(i);
        String string = sb.toString();
        C8381 c8381 = new C8381();
        c8381.m13931(1537, string.replace(".", "/"), null, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME, null);
        C3763 c3763 = f7934;
        byte[] bArrM13932 = c8381.m13932();
        c3763.getClass();
        ConcurrentHashMap concurrentHashMap = AbstractC7530.f20407;
        Class clsM12754 = AbstractC7530.m12754(string, bArrM13932, AbstractC7530.class.getClassLoader());
        this.f7935 = clsM12754;
        f7933.put(this, clsM12754);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m5354(Class cls, Class cls2, int i) {
        for (Method method : cls2.getMethods()) {
            if (Modifier.isAbstract(method.getModifiers()) && !method.isBridge() && !method.isSynthetic()) {
                Map map = AbstractC2662.f7972;
                try {
                    Object.class.getMethod(method.getName(), method.getParameterTypes());
                } catch (NoSuchMethodException unused) {
                    for (Map.Entry entry : f7933.entrySet()) {
                        if (entry.getValue() == cls) {
                            return ((AbstractC2651) entry.getKey()).mo5355(method, i);
                        }
                    }
                    return false;
                }
            }
        }
        C5925.m11310("This class isn't a valid Functional Interface: ".concat(cls2.getName()));
        return false;
    }

    public final <T> T invoke(Object[] objArr, Class<?>[] clsArr, Class<T> cls) throws Throwable {
        InterfaceC2619 interfaceC2619 = this.f7936;
        try {
            Object objUnwrap = cls.isPrimitive() ? Primitive.unwrap(mo5356(objArr)) : mo5356(objArr);
            if (cls == Void.TYPE) {
                return null;
            }
            return (T) Primitive.unwrap(AbstractC2662.m5373(objUnwrap, cls, 1));
        } catch (TargetError e) {
            for (Class<?> cls2 : clsArr) {
                if (cls2.isInstance(e.getTarget())) {
                    throw e.getTarget();
                }
            }
            throw new RuntimeEvalError("Can't invoke lambda: Unexpected Exception: " + e.getTarget().getMessage(), interfaceC2619, null, e.getTarget());
        } catch (EvalError e2) {
            throw new RuntimeEvalError("Can't invoke lambda: " + e2.getMessage(), interfaceC2619, null, e2);
        } catch (UtilEvalError e3) {
            throw new RuntimeEvalError(e3.toEvalError(interfaceC2619, null));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public abstract boolean mo5355(Method method, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract Object mo5356(Object[] objArr);
}
