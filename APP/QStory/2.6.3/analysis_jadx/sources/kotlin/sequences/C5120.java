package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5120 implements InterfaceC5127 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicReference f14655;

    public C5120(InterfaceC5127 interfaceC5127) {
        this.f14655 = new AtomicReference(interfaceC5127);
    }

    @Override // kotlin.sequences.InterfaceC5127
    public final Iterator iterator() {
        InterfaceC5127 interfaceC5127 = (InterfaceC5127) this.f14655.getAndSet(null);
        if (interfaceC5127 != null) {
            return interfaceC5127.iterator();
        }
        C5925.m11311("This sequence can be consumed only once.");
        return null;
    }
}
