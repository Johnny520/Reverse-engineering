package androidx.compose.runtime.composer.gapbuffer;

import java.util.Iterator;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1228 implements Iterator, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f3529;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f3530;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f3531;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1233 f3532;

    public C1228(C1233 c1233, int i, int i2) {
        this.f3532 = c1233;
        this.f3530 = i2;
        this.f3531 = i;
        this.f3529 = c1233.f3542;
        if (c1233.f3543) {
            AbstractC1238.m2136();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3531 < this.f3530;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1233 c1233 = this.f3532;
        int i = c1233.f3542;
        int i2 = this.f3529;
        if (i != i2) {
            AbstractC1238.m2136();
        }
        int i3 = this.f3531;
        this.f3531 = c1233.f3545[(i3 * 5) + 3] + i3;
        return new C1237(c1233, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
