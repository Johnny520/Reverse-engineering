package kotlinx.coroutines.flow;

import io.ktor.serialization.C4048;
import kotlinx.coroutines.flow.internal.C5224;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5272 implements InterfaceC5271 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f14861;

    public final String toString() {
        switch (this.f14861) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5271
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5318 mo10304(C5224 c5224) {
        switch (this.f14861) {
            case 0:
                return new C4048(SharingCommand.START, 1);
            default:
                return new C5269(c5224);
        }
    }
}
