package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5952 implements InterfaceC5959 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicReference f15000;

    public C5952(InterfaceC5959 interfaceC5959) {
        this.f15000 = new AtomicReference(interfaceC5959);
    }

    @Override // kotlin.sequences.InterfaceC5959
    public final Iterator iterator() {
        InterfaceC5959 interfaceC5959 = (InterfaceC5959) this.f15000.getAndSet(null);
        if (interfaceC5959 != null) {
            return interfaceC5959.iterator();
        }
        C6755.m11870("This sequence can be consumed only once.");
        return null;
    }
}
