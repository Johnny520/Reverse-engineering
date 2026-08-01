package p063;

import java.lang.reflect.Method;
import kotlin.collections.AbstractC5179;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7324 extends AbstractC7333 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f18145;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7324(int i, int i2, Method method, boolean z) {
        super(method, z, i);
        this.f18145 = i2;
    }

    @Override // p063.AbstractC7333, p063.InterfaceC7318
    public final Object call(Object[] objArr) {
        int i = this.f18145;
        objArr.getClass();
        switch (i) {
            case 0:
                mo12557(objArr);
                return m12559(objArr[0], objArr.length <= 1 ? new Object[0] : AbstractC5179.m9390(objArr, 1, objArr.length));
            case 1:
                mo12557(objArr);
                m12556(AbstractC5179.m9387(objArr));
                return m12559(null, objArr.length <= 1 ? new Object[0] : AbstractC5179.m9390(objArr, 1, objArr.length));
            default:
                mo12557(objArr);
                return m12559(null, objArr);
        }
    }
}
