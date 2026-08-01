package kotlinx.coroutines.flow;

import kotlinx.coroutines.C6276;
import kotlinx.coroutines.InterfaceC6230;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6114 implements InterfaceC6230 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6276 f15207;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f15208;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f15209;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6119 f15210;

    public C6114(C6119 c6119, long j, Object obj, C6276 c6276) {
        this.f15210 = c6119;
        this.f15208 = j;
        this.f15209 = obj;
        this.f15207 = c6276;
    }

    @Override // kotlinx.coroutines.InterfaceC6230
    public final void dispose() {
        C6119 c6119 = this.f15210;
        synchronized (c6119) {
            if (this.f15208 >= c6119.m10881()) {
                Object[] objArr = c6119.f15219;
                objArr.getClass();
                long j = this.f15208;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    AbstractC6154.m10889(objArr, j, AbstractC6154.f15236);
                    c6119.m10886();
                }
            }
        }
    }
}
