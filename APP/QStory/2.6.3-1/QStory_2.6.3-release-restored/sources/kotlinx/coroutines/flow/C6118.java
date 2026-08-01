package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC5189;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.flow.internal.AbstractC6050;
import kotlinx.coroutines.flow.internal.AbstractC6052;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6118 extends AbstractC6050 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C6276 f15213;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long f15214;

    @Override // kotlinx.coroutines.flow.internal.AbstractC6050
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC5189[] mo10855(AbstractC6052 abstractC6052) {
        long j = this.f15214;
        this.f15214 = -1L;
        this.f15213 = null;
        return ((C6119) abstractC6052).m10877(j);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6050
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo10856(AbstractC6052 abstractC6052) {
        C6119 c6119 = (C6119) abstractC6052;
        if (this.f15214 >= 0) {
            return false;
        }
        long j = c6119.f15220;
        if (j < c6119.f15217) {
            c6119.f15217 = j;
        }
        this.f15214 = j;
        return true;
    }
}
