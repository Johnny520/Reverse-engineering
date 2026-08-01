package p103;

import bsh.C2633;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言世苏楪兰子哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7267 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f19363;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C7274 f19364;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f19365;

    public C7267(C7274 c7274) {
        this.f19364 = c7274;
        this.f19363 = ((AbstractList) c7274).modCount;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f19365;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f19365) {
            C2633.m5336();
            return null;
        }
        this.f19365 = true;
        m12483();
        return this.f19364.f19373;
    }

    @Override // java.util.Iterator
    public final void remove() {
        m12483();
        this.f19364.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12483() {
        C7274 c7274 = this.f19364;
        int i = ((AbstractList) c7274).modCount;
        int i2 = this.f19363;
        if (i == i2) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) c7274).modCount + "; expected: " + i2);
    }
}
