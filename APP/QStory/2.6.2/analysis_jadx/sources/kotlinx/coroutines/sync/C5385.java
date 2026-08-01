package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.internal.AbstractC5360;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5385 extends AbstractC5360 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f15012;

    public C5385(long j, C5385 c5385, int i) {
        super(j, c5385, i);
        this.f15012 = new AtomicReferenceArray(AbstractC5383.f14998);
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f14944 + ", hashCode=" + hashCode() + ']';
    }

    @Override // kotlinx.coroutines.internal.AbstractC5360
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo10263(int i, InterfaceC4359 interfaceC4359) {
        this.f15012.set(i, AbstractC5383.f14999);
        m10383();
    }

    @Override // kotlinx.coroutines.internal.AbstractC5360
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo10267() {
        return AbstractC5383.f14998;
    }
}
