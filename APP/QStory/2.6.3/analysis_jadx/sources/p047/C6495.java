package p047;

import java.lang.reflect.Method;
import kotlin.collections.AbstractC4347;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6495 extends AbstractC6504 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17800;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6495(int i, int i2, Method method, boolean z) {
        super(method, z, i);
        this.f17800 = i2;
    }

    @Override // p047.AbstractC6504, p047.InterfaceC6489
    public final Object call(Object[] objArr) {
        int i = this.f17800;
        objArr.getClass();
        switch (i) {
            case 0:
                mo11998(objArr);
                return m12000(objArr[0], objArr.length <= 1 ? new Object[0] : AbstractC4347.m8831(objArr, 1, objArr.length));
            case 1:
                mo11998(objArr);
                m11997(AbstractC4347.m8828(objArr));
                return m12000(null, objArr.length <= 1 ? new Object[0] : AbstractC4347.m8831(objArr, 1, objArr.length));
            default:
                mo11998(objArr);
                return m12000(null, objArr);
        }
    }
}
