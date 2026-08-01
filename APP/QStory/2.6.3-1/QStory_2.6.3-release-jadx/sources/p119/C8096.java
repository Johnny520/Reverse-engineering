package p119;

import bsh.C3466;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言世苏楪兰子哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8096 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f19708;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C8103 f19709;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f19710;

    public C8096(C8103 c8103) {
        this.f19709 = c8103;
        this.f19708 = ((AbstractList) c8103).modCount;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f19710;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f19710) {
            C3466.m5896();
            return null;
        }
        this.f19710 = true;
        m13042();
        return this.f19709.f19718;
    }

    @Override // java.util.Iterator
    public final void remove() {
        m13042();
        this.f19709.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13042() {
        C8103 c8103 = this.f19709;
        int i = ((AbstractList) c8103).modCount;
        int i2 = this.f19708;
        if (i == i2) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) c8103).modCount + "; expected: " + i2);
    }
}
