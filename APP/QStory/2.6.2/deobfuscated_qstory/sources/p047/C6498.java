package p047;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.collections.AbstractC4346;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6498 extends AbstractC6495 {
    public C6498(Method method) {
        super(method, AbstractC8189.m13660(method.getDeclaringClass()));
    }

    @Override // p047.InterfaceC6488
    public final Object call(Object[] objArr) {
        objArr.getClass();
        m11956(objArr);
        Object obj = objArr[0];
        Object[] objArrM8862 = objArr.length <= 1 ? new Object[0] : AbstractC4346.m8862(objArr, 1, objArr.length);
        return this.f17807.invoke(obj, Arrays.copyOf(objArrM8862, objArrM8862.length));
    }
}
