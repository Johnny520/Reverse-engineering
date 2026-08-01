package androidx.compose.runtime.snapshots;

import androidx.collection.C0276;
import bsh.C2633;
import java.util.Iterator;
import java.util.Map;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1258 implements Iterator, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Map.Entry f3649;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Map.Entry f3650;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ int f3651;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Iterator f3652;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f3653;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1277 f3654;

    public C1258(C1277 c1277, Iterator it, int i) {
        this.f3651 = i;
        this.f3654 = c1277;
        this.f3652 = it;
        this.f3653 = c1277.m2252().f3703;
        m2201();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3649 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3651) {
            case 0:
                m2201();
                if (this.f3650 == null) {
                    C2633.m5341();
                }
                break;
            case 1:
                Map.Entry entry = this.f3649;
                if (entry == null) {
                    C2633.m5341();
                } else {
                    m2201();
                }
                break;
            default:
                Map.Entry entry2 = this.f3649;
                if (entry2 == null) {
                    C2633.m5341();
                } else {
                    m2201();
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C1277 c1277 = this.f3654;
        if (c1277.m2252().f3703 != this.f3653) {
            C0276.m840();
            return;
        }
        Map.Entry entry = this.f3650;
        if (entry == null) {
            C2633.m5341();
            return;
        }
        c1277.remove(entry.getKey());
        this.f3650 = null;
        this.f3653 = c1277.m2252().f3703;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2201() {
        this.f3650 = this.f3649;
        Iterator it = this.f3652;
        this.f3649 = it.hasNext() ? (Map.Entry) it.next() : null;
    }
}
