package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC4356;
import kotlinx.coroutines.C5443;
import kotlinx.coroutines.flow.internal.AbstractC5217;
import kotlinx.coroutines.flow.internal.AbstractC5219;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5285 extends AbstractC5217 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C5443 f14868;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long f14869;

    @Override // kotlinx.coroutines.flow.internal.AbstractC5217
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4356[] mo10292(AbstractC5219 abstractC5219) {
        long j = this.f14869;
        this.f14869 = -1L;
        this.f14868 = null;
        return ((C5286) abstractC5219).m10314(j);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5217
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo10293(AbstractC5219 abstractC5219) {
        C5286 c5286 = (C5286) abstractC5219;
        if (this.f14869 >= 0) {
            return false;
        }
        long j = c5286.f14875;
        if (j < c5286.f14872) {
            c5286.f14872 = j;
        }
        this.f14869 = j;
        return true;
    }
}
