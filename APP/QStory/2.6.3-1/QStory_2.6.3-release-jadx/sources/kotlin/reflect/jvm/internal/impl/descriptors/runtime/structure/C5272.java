package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.bumptech.glide.AbstractC3889;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5272 extends AbstractC5276 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f13415;

    public C5272(Object obj) {
        obj.getClass();
        this.f13415 = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC5269 m9540() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.f13415;
        obj.getClass();
        C5266 c5266 = AbstractC3889.f10110;
        Class cls = null;
        if (c5266 == null) {
            Class<?> cls2 = obj.getClass();
            try {
                c5266 = new C5266(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                c5266 = new C5266(null, null);
            }
            AbstractC3889.f10110 = c5266;
        }
        Method method = c5266.f13409;
        if (method != null) {
            Object objInvoke = method.invoke(obj, null);
            objInvoke.getClass();
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new C5282(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5276
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Member mo9538() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.f13415;
        obj.getClass();
        C5266 c5266 = AbstractC3889.f10110;
        Method method = null;
        if (c5266 == null) {
            Class<?> cls = obj.getClass();
            try {
                c5266 = new C5266(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                c5266 = new C5266(null, null);
            }
            AbstractC3889.f10110 = c5266;
        }
        Method method2 = c5266.f13408;
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
