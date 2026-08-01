package p163;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5925;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8394 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC7387 f20821;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5925 f20822;

    public C8394(InterfaceC5925 interfaceC5925, InterfaceC7387 interfaceC7387) {
        interfaceC5925.getClass();
        this.f20822 = interfaceC5925;
        this.f20821 = interfaceC7387;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        boolean zM9466 = AbstractC5227.m9466(method.getName(), "accept");
        InterfaceC7387 interfaceC7387 = this.f20821;
        if (zM9466 && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            InterfaceC5925 interfaceC5925 = this.f20822;
            interfaceC5925.getClass();
            if (interfaceC5925.isInstance(obj2)) {
                obj2.getClass();
                interfaceC7387.invoke(obj2);
                return C6008.f15084;
            }
            throw new ClassCastException("Value cannot be cast to " + interfaceC5925.mo9444());
        }
        if (AbstractC5227.m9466(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (AbstractC5227.m9466(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(interfaceC7387.hashCode());
        }
        if (AbstractC5227.m9466(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return interfaceC7387.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
