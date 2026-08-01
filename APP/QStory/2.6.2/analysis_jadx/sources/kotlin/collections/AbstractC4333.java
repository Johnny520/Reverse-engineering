package kotlin.collections;

import bsh.C2632;
import java.util.Iterator;
import p054.InterfaceC6566;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4333 implements Iterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f12913;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f12914;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f12914;
        if (i == 0) {
            this.f12914 = 3;
            mo8770();
            return this.f12914 == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        C5919.m11249("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f12914;
        if (i == 1) {
            this.f12914 = 0;
            return this.f12913;
        }
        if (i != 2) {
            this.f12914 = 3;
            mo8770();
            if (this.f12914 == 1) {
                this.f12914 = 0;
                return this.f12913;
            }
        }
        C2632.m5291();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract void mo8770();
}
