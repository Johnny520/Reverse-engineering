package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.internal.AbstractC6193;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6218 extends AbstractC6193 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f15357;

    public C6218(long j, C6218 c6218, int i) {
        super(j, c6218, i);
        this.f15357 = new AtomicReferenceArray(AbstractC6216.f15343);
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f15289 + ", hashCode=" + hashCode() + ']';
    }

    @Override // kotlinx.coroutines.internal.AbstractC6193
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo10826(int i, InterfaceC5192 interfaceC5192) {
        this.f15357.set(i, AbstractC6216.f15344);
        m10946();
    }

    @Override // kotlinx.coroutines.internal.AbstractC6193
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo10830() {
        return AbstractC6216.f15343;
    }
}
