package kotlinx.coroutines.flow;

import kotlinx.coroutines.C5444;
import kotlinx.coroutines.InterfaceC5398;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5282 implements InterfaceC5398 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5444 f14862;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f14863;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f14864;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5287 f14865;

    public C5282(C5287 c5287, long j, Object obj, C5444 c5444) {
        this.f14865 = c5287;
        this.f14863 = j;
        this.f14864 = obj;
        this.f14862 = c5444;
    }

    @Override // kotlinx.coroutines.InterfaceC5398
    public final void dispose() {
        C5287 c5287 = this.f14865;
        synchronized (c5287) {
            if (this.f14863 >= c5287.m10322()) {
                Object[] objArr = c5287.f14874;
                objArr.getClass();
                long j = this.f14863;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    AbstractC5322.m10330(objArr, j, AbstractC5322.f14891);
                    c5287.m10327();
                }
            }
        }
    }
}
