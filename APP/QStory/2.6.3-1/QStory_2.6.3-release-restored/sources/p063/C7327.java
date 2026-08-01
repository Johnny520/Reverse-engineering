package p063;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7327 extends AbstractC7325 implements InterfaceC7319 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f18150;

    public C7327(Method method, Object obj) {
        super(method, EmptyList.INSTANCE);
        this.f18150 = obj;
    }

    @Override // p063.InterfaceC7318
    public final Object call(Object[] objArr) {
        objArr.getClass();
        m12558(objArr);
        return this.f18148.invoke(this.f18150, Arrays.copyOf(objArr, objArr.length));
    }
}
