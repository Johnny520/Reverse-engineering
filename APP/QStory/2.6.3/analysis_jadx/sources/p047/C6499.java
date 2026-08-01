package p047;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.collections.AbstractC4347;
import p034.AbstractC6347;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6499 extends AbstractC6496 {
    public C6499(Method method) {
        super(method, AbstractC6347.m11928(method.getDeclaringClass()));
    }

    @Override // p047.InterfaceC6489
    public final Object call(Object[] objArr) {
        objArr.getClass();
        m11999(objArr);
        Object obj = objArr[0];
        Object[] objArrM8831 = objArr.length <= 1 ? new Object[0] : AbstractC4347.m8831(objArr, 1, objArr.length);
        return this.f17803.invoke(obj, Arrays.copyOf(objArrM8831, objArrM8831.length));
    }
}
