package p147;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.C5176;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5093;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7565 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6558 f20476;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5093 f20477;

    public C7565(InterfaceC5093 interfaceC5093, InterfaceC6558 interfaceC6558) {
        interfaceC5093.getClass();
        this.f20477 = interfaceC5093;
        this.f20476 = interfaceC6558;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        boolean zM8907 = AbstractC4395.m8907(method.getName(), "accept");
        InterfaceC6558 interfaceC6558 = this.f20476;
        if (zM8907 && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            InterfaceC5093 interfaceC5093 = this.f20477;
            interfaceC5093.getClass();
            if (interfaceC5093.isInstance(obj2)) {
                obj2.getClass();
                interfaceC6558.invoke(obj2);
                return C5176.f14739;
            }
            throw new ClassCastException("Value cannot be cast to " + interfaceC5093.mo8885());
        }
        if (AbstractC4395.m8907(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (AbstractC4395.m8907(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(interfaceC6558.hashCode());
        }
        if (AbstractC4395.m8907(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return interfaceC6558.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
