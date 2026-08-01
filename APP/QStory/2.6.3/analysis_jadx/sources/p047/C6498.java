package p047;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6498 extends AbstractC6496 implements InterfaceC6490 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f17805;

    public C6498(Method method, Object obj) {
        super(method, EmptyList.INSTANCE);
        this.f17805 = obj;
    }

    @Override // p047.InterfaceC6489
    public final Object call(Object[] objArr) {
        objArr.getClass();
        m11999(objArr);
        return this.f17803.invoke(this.f17805, Arrays.copyOf(objArr, objArr.length));
    }
}
