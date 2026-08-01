package p147;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5092;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7564 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6557 f20481;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5092 f20482;

    public C7564(InterfaceC5092 interfaceC5092, InterfaceC6557 interfaceC6557) {
        interfaceC5092.getClass();
        this.f20482 = interfaceC5092;
        this.f20481 = interfaceC6557;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        boolean zM8917 = AbstractC4394.m8917(method.getName(), "accept");
        InterfaceC6557 interfaceC6557 = this.f20481;
        if (zM8917 && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            InterfaceC5092 interfaceC5092 = this.f20482;
            interfaceC5092.getClass();
            if (interfaceC5092.isInstance(obj2)) {
                obj2.getClass();
                interfaceC6557.invoke(obj2);
                return C5175.f14739;
            }
            throw new ClassCastException("Value cannot be cast to " + interfaceC5092.mo8895());
        }
        if (AbstractC4394.m8917(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (AbstractC4394.m8917(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(interfaceC6557.hashCode());
        }
        if (AbstractC4394.m8917(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return interfaceC6557.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
