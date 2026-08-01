package kotlin.collections;

import bsh.C2633;
import java.util.Iterator;
import p054.InterfaceC6567;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4334 implements Iterator, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f12917;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f12918;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f12918;
        if (i == 0) {
            this.f12918 = 3;
            mo8760();
            return this.f12918 == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        C5925.m11310("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f12918;
        if (i == 1) {
            this.f12918 = 0;
            return this.f12917;
        }
        if (i != 2) {
            this.f12918 = 3;
            mo8760();
            if (this.f12918 == 1) {
                this.f12918 = 0;
                return this.f12917;
            }
        }
        C2633.m5336();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract void mo8760();
}
