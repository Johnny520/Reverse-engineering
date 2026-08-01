package kotlinx.coroutines.flow;

import io.ktor.serialization.C4049;
import kotlinx.coroutines.flow.internal.C5225;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5273 implements InterfaceC5272 {

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

    @Override // kotlinx.coroutines.flow.InterfaceC5272
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5319 mo10308(C5225 c5225) {
        switch (this.f14861) {
            case 0:
                return new C4049(SharingCommand.START, 1);
            default:
                return new C5270(c5225);
        }
    }
}
