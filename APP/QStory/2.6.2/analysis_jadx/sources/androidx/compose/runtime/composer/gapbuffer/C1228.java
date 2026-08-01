package androidx.compose.runtime.composer.gapbuffer;

import java.util.Iterator;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1228 implements Iterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f3528;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f3529;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f3530;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1233 f3531;

    public C1228(C1233 c1233, int i, int i2) {
        this.f3531 = c1233;
        this.f3529 = i2;
        this.f3530 = i;
        this.f3528 = c1233.f3541;
        if (c1233.f3542) {
            AbstractC1238.m2126();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3530 < this.f3529;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1233 c1233 = this.f3531;
        int i = c1233.f3541;
        int i2 = this.f3528;
        if (i != i2) {
            AbstractC1238.m2126();
        }
        int i3 = this.f3530;
        this.f3530 = c1233.f3544[(i3 * 5) + 3] + i3;
        return new C1237(c1233, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
