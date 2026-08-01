package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC4357;
import kotlinx.coroutines.C5444;
import kotlinx.coroutines.flow.internal.AbstractC5218;
import kotlinx.coroutines.flow.internal.AbstractC5220;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5286 extends AbstractC5218 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C5444 f14868;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long f14869;

    @Override // kotlinx.coroutines.flow.internal.AbstractC5218
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4357[] mo10296(AbstractC5220 abstractC5220) {
        long j = this.f14869;
        this.f14869 = -1L;
        this.f14868 = null;
        return ((C5287) abstractC5220).m10318(j);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5218
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo10297(AbstractC5220 abstractC5220) {
        C5287 c5287 = (C5287) abstractC5220;
        if (this.f14869 >= 0) {
            return false;
        }
        long j = c5287.f14875;
        if (j < c5287.f14872) {
            c5287.f14872 = j;
        }
        this.f14869 = j;
        return true;
    }
}
