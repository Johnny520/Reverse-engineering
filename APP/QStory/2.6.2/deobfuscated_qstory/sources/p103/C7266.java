package p103;

import bsh.C2632;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言世苏楪兰子哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7266 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f19368;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C7273 f19369;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f19370;

    public C7266(C7273 c7273) {
        this.f19369 = c7273;
        this.f19368 = ((AbstractList) c7273).modCount;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f19370;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f19370) {
            C2632.m5291();
            return null;
        }
        this.f19370 = true;
        m12456();
        return this.f19369.f19378;
    }

    @Override // java.util.Iterator
    public final void remove() {
        m12456();
        this.f19369.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12456() {
        C7273 c7273 = this.f19369;
        int i = ((AbstractList) c7273).modCount;
        int i2 = this.f19368;
        if (i == i2) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) c7273).modCount + "; expected: " + i2);
    }
}
