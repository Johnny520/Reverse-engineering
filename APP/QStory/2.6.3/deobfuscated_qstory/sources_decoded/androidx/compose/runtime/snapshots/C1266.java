package androidx.compose.runtime.snapshots;

import androidx.collection.C0276;
import bsh.C2633;
import java.util.Iterator;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1266 implements Iterator, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f3681;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f3682;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Iterator f3683;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f3684;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final SnapshotStateSet f3685;

    public C1266(SnapshotStateSet snapshotStateSet, Iterator it) {
        this.f3685 = snapshotStateSet;
        this.f3683 = it;
        C1265 c1265 = snapshotStateSet.f3645;
        c1265.getClass();
        this.f3681 = ((C1265) AbstractC1280.m2275(c1265)).f3679;
        this.f3684 = this.f3682;
        this.f3682 = it.hasNext() ? it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3682 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1265 c1265 = this.f3685.f3645;
        c1265.getClass();
        if (((C1265) AbstractC1280.m2275(c1265)).f3679 != this.f3681) {
            C0276.m840();
            return null;
        }
        this.f3684 = this.f3682;
        Iterator it = this.f3683;
        this.f3682 = it.hasNext() ? it.next() : null;
        Object obj = this.f3684;
        if (obj != null) {
            return obj;
        }
        C2633.m5341();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        SnapshotStateSet snapshotStateSet = this.f3685;
        C1265 c1265 = snapshotStateSet.f3645;
        c1265.getClass();
        if (((C1265) AbstractC1280.m2275(c1265)).f3679 != this.f3681) {
            C0276.m840();
            return;
        }
        Object obj = this.f3684;
        if (obj == null) {
            C2633.m5341();
            return;
        }
        snapshotStateSet.remove(obj);
        this.f3684 = null;
        C1265 c12652 = snapshotStateSet.f3645;
        c12652.getClass();
        this.f3681 = ((C1265) AbstractC1280.m2275(c12652)).f3679;
    }
}
