package androidx.compose.runtime.snapshots;

import androidx.collection.C0276;
import bsh.C2632;
import java.util.Iterator;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1266 implements Iterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f3680;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f3681;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Iterator f3682;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f3683;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final SnapshotStateSet f3684;

    public C1266(SnapshotStateSet snapshotStateSet, Iterator it) {
        this.f3684 = snapshotStateSet;
        this.f3682 = it;
        C1265 c1265 = snapshotStateSet.f3644;
        c1265.getClass();
        this.f3680 = ((C1265) AbstractC1280.m2265(c1265)).f3678;
        this.f3683 = this.f3681;
        this.f3681 = it.hasNext() ? it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3681 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1265 c1265 = this.f3684.f3644;
        c1265.getClass();
        if (((C1265) AbstractC1280.m2265(c1265)).f3678 != this.f3680) {
            C0276.m839();
            return null;
        }
        this.f3683 = this.f3681;
        Iterator it = this.f3682;
        this.f3681 = it.hasNext() ? it.next() : null;
        Object obj = this.f3683;
        if (obj != null) {
            return obj;
        }
        C2632.m5296();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        SnapshotStateSet snapshotStateSet = this.f3684;
        C1265 c1265 = snapshotStateSet.f3644;
        c1265.getClass();
        if (((C1265) AbstractC1280.m2265(c1265)).f3678 != this.f3680) {
            C0276.m839();
            return;
        }
        Object obj = this.f3683;
        if (obj == null) {
            C2632.m5296();
            return;
        }
        snapshotStateSet.remove(obj);
        this.f3683 = null;
        C1265 c12652 = snapshotStateSet.f3644;
        c12652.getClass();
        this.f3680 = ((C1265) AbstractC1280.m2265(c12652)).f3678;
    }
}
