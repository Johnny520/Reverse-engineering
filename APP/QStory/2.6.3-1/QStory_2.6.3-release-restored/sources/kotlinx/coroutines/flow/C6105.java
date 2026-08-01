package kotlinx.coroutines.flow;

import io.ktor.serialization.C4881;
import kotlinx.coroutines.flow.internal.C6057;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6105 implements InterfaceC6104 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15206;

    public final String toString() {
        switch (this.f15206) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6104
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC6151 mo10867(C6057 c6057) {
        switch (this.f15206) {
            case 0:
                return new C4881(SharingCommand.START, 1);
            default:
                return new C6102(c6057);
        }
    }
}
