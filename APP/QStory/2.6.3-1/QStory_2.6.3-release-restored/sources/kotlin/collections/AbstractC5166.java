package kotlin.collections;

import bsh.C3466;
import java.util.Iterator;
import p070.InterfaceC7396;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5166 implements Iterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f13262;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f13263;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f13263;
        if (i == 0) {
            this.f13263 = 3;
            mo9319();
            return this.f13263 == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        C6755.m11869("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f13263;
        if (i == 1) {
            this.f13263 = 0;
            return this.f13262;
        }
        if (i != 2) {
            this.f13263 = 3;
            mo9319();
            if (this.f13263 == 1) {
                this.f13263 = 0;
                return this.f13262;
            }
        }
        C3466.m5896();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract void mo9319();
}
