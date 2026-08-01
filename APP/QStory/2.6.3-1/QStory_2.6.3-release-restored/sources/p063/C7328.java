package p063;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.collections.AbstractC5179;
import p050.AbstractC7176;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7328 extends AbstractC7325 {
    public C7328(Method method) {
        super(method, AbstractC7176.m12487(method.getDeclaringClass()));
    }

    @Override // p063.InterfaceC7318
    public final Object call(Object[] objArr) {
        objArr.getClass();
        m12558(objArr);
        Object obj = objArr[0];
        Object[] objArrM9390 = objArr.length <= 1 ? new Object[0] : AbstractC5179.m9390(objArr, 1, objArr.length);
        return this.f18148.invoke(obj, Arrays.copyOf(objArrM9390, objArrM9390.length));
    }
}
