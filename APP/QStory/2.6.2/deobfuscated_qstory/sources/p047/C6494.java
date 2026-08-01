package p047;

import java.lang.reflect.Method;
import kotlin.collections.AbstractC4346;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6494 extends AbstractC6503 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17804;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6494(int i, int i2, Method method, boolean z) {
        super(method, z, i);
        this.f17804 = i2;
    }

    @Override // p047.AbstractC6503, p047.InterfaceC6488
    public final Object call(Object[] objArr) {
        int i = this.f17804;
        objArr.getClass();
        switch (i) {
            case 0:
                mo11955(objArr);
                return m11957(objArr[0], objArr.length <= 1 ? new Object[0] : AbstractC4346.m8862(objArr, 1, objArr.length));
            case 1:
                mo11955(objArr);
                m11954(AbstractC4346.m8848(objArr));
                return m11957(null, objArr.length <= 1 ? new Object[0] : AbstractC4346.m8862(objArr, 1, objArr.length));
            default:
                mo11955(objArr);
                return m11957(null, objArr);
        }
    }
}
