package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.internal.AbstractC5361;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5386 extends AbstractC5361 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f15012;

    public C5386(long j, C5386 c5386, int i) {
        super(j, c5386, i);
        this.f15012 = new AtomicReferenceArray(AbstractC5384.f14998);
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f14944 + ", hashCode=" + hashCode() + ']';
    }

    @Override // kotlinx.coroutines.internal.AbstractC5361
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo10267(int i, InterfaceC4360 interfaceC4360) {
        this.f15012.set(i, AbstractC5384.f14999);
        m10387();
    }

    @Override // kotlinx.coroutines.internal.AbstractC5361
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo10271() {
        return AbstractC5384.f14998;
    }
}
