package p047;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6497 extends AbstractC6495 implements InterfaceC6489 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f17809;

    public C6497(Method method, Object obj) {
        super(method, EmptyList.INSTANCE);
        this.f17809 = obj;
    }

    @Override // p047.InterfaceC6488
    public final Object call(Object[] objArr) {
        objArr.getClass();
        m11956(objArr);
        return this.f17807.invoke(this.f17809, Arrays.copyOf(objArr, objArr.length));
    }
}
