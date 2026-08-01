package kotlinx.coroutines;

import kotlin.C5175;
import kotlin.Result;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5417 extends AbstractC5449 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5443 f15058;

    public C5417(C5443 c5443) {
        this.f15058 = c5443;
    }

    @Override // kotlinx.coroutines.AbstractC5449
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo10464(Throwable th) {
        this.f15058.resumeWith(Result.m8755constructorimpl(C5175.f14739));
    }

    @Override // kotlinx.coroutines.AbstractC5449
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo10465() {
        return false;
    }
}
