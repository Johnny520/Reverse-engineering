package androidx.compose.runtime.snapshots;

import androidx.collection.C0276;
import bsh.C2632;
import java.util.Iterator;
import java.util.Map;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1258 implements Iterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Map.Entry f3648;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Map.Entry f3649;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ int f3650;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Iterator f3651;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f3652;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1277 f3653;

    public C1258(C1277 c1277, Iterator it, int i) {
        this.f3650 = i;
        this.f3653 = c1277;
        this.f3651 = it;
        this.f3652 = c1277.m2242().f3702;
        m2191();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3648 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3650) {
            case 0:
                m2191();
                if (this.f3649 == null) {
                    C2632.m5296();
                }
                break;
            case 1:
                Map.Entry entry = this.f3648;
                if (entry == null) {
                    C2632.m5296();
                } else {
                    m2191();
                }
                break;
            default:
                Map.Entry entry2 = this.f3648;
                if (entry2 == null) {
                    C2632.m5296();
                } else {
                    m2191();
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C1277 c1277 = this.f3653;
        if (c1277.m2242().f3702 != this.f3652) {
            C0276.m839();
            return;
        }
        Map.Entry entry = this.f3649;
        if (entry == null) {
            C2632.m5296();
            return;
        }
        c1277.remove(entry.getKey());
        this.f3649 = null;
        this.f3652 = c1277.m2242().f3702;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2191() {
        this.f3649 = this.f3648;
        Iterator it = this.f3651;
        this.f3648 = it.hasNext() ? (Map.Entry) it.next() : null;
    }
}
