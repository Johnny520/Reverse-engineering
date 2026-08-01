package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.bumptech.glide.AbstractC3057;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4440 extends AbstractC4444 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f13070;

    public C4440(Object obj) {
        obj.getClass();
        this.f13070 = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC4437 m8981() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.f13070;
        obj.getClass();
        C4434 c4434 = AbstractC3057.f9765;
        Class cls = null;
        if (c4434 == null) {
            Class<?> cls2 = obj.getClass();
            try {
                c4434 = new C4434(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                c4434 = new C4434(null, null);
            }
            AbstractC3057.f9765 = c4434;
        }
        Method method = c4434.f13064;
        if (method != null) {
            Object objInvoke = method.invoke(obj, null);
            objInvoke.getClass();
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new C4450(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4444
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Member mo8979() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.f13070;
        obj.getClass();
        C4434 c4434 = AbstractC3057.f9765;
        Method method = null;
        if (c4434 == null) {
            Class<?> cls = obj.getClass();
            try {
                c4434 = new C4434(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                c4434 = new C4434(null, null);
            }
            AbstractC3057.f9765 = c4434;
        }
        Method method2 = c4434.f13063;
        if (method2 != null) {
            Object objInvoke = method2.invoke(obj, null);
            objInvoke.getClass();
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }
}
