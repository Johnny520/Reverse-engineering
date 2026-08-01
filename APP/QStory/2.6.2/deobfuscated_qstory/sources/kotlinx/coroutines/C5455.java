package kotlinx.coroutines;

import kotlin.AbstractC5184;
import kotlin.Result;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5455 extends AbstractC5449 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5448 f15107;

    public C5455(C5448 c5448) {
        this.f15107 = c5448;
    }

    @Override // kotlinx.coroutines.AbstractC5449
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo10464(Throwable th) {
        Object objM10578 = m10549().m10578();
        boolean z = objM10578 instanceof C5429;
        C5448 c5448 = this.f15107;
        if (z) {
            c5448.resumeWith(Result.m8755constructorimpl(AbstractC5184.m10207(((C5429) objM10578).f15075)));
        } else {
            c5448.resumeWith(Result.m8755constructorimpl(AbstractC5398.m10476(objM10578)));
        }
    }

    @Override // kotlinx.coroutines.AbstractC5449
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo10465() {
        return false;
    }
}
