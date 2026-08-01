package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5119 implements InterfaceC5126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicReference f14655;

    public C5119(InterfaceC5126 interfaceC5126) {
        this.f14655 = new AtomicReference(interfaceC5126);
    }

    @Override // kotlin.sequences.InterfaceC5126
    public final Iterator iterator() {
        InterfaceC5126 interfaceC5126 = (InterfaceC5126) this.f14655.getAndSet(null);
        if (interfaceC5126 != null) {
            return interfaceC5126.iterator();
        }
        C5919.m11250("This sequence can be consumed only once.");
        return null;
    }
}
