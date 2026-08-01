package kotlinx.coroutines.flow;

import kotlinx.coroutines.C5443;
import kotlinx.coroutines.InterfaceC5397;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5281 implements InterfaceC5397 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5443 f14862;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f14863;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f14864;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5286 f14865;

    public C5281(C5286 c5286, long j, Object obj, C5443 c5443) {
        this.f14865 = c5286;
        this.f14863 = j;
        this.f14864 = obj;
        this.f14862 = c5443;
    }

    @Override // kotlinx.coroutines.InterfaceC5397
    public final void dispose() {
        C5286 c5286 = this.f14865;
        synchronized (c5286) {
            if (this.f14863 >= c5286.m10318()) {
                Object[] objArr = c5286.f14874;
                objArr.getClass();
                long j = this.f14863;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    AbstractC5321.m10326(objArr, j, AbstractC5321.f14891);
                    c5286.m10323();
                }
            }
        }
    }
}
