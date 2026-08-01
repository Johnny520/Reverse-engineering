package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import io.ktor.client.plugins.AbstractC3932;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4439 extends AbstractC4443 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f13066;

    public C4439(Object obj) {
        obj.getClass();
        this.f13066 = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC4436 m8991() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.f13066;
        obj.getClass();
        C4433 c4433 = AbstractC3932.f12146;
        Class cls = null;
        if (c4433 == null) {
            Class<?> cls2 = obj.getClass();
            try {
                c4433 = new C4433(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                c4433 = new C4433(null, null);
            }
            AbstractC3932.f12146 = c4433;
        }
        Method method = c4433.f13060;
        if (method != null) {
            Object objInvoke = method.invoke(obj, null);
            objInvoke.getClass();
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new C4449(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4443
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Member mo8989() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.f13066;
        obj.getClass();
        C4433 c4433 = AbstractC3932.f12146;
        Method method = null;
        if (c4433 == null) {
            Class<?> cls = obj.getClass();
            try {
                c4433 = new C4433(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                c4433 = new C4433(null, null);
            }
            AbstractC3932.f12146 = c4433;
        }
        Method method2 = c4433.f13059;
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
