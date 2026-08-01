package androidx.compose.runtime.composer.gapbuffer;

import java.util.Iterator;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2063 implements Iterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f3874;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f3875;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f3876;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2068 f3877;

    public C2063(C2068 c2068, int i, int i2) {
        this.f3877 = c2068;
        this.f3875 = i2;
        this.f3876 = i;
        this.f3874 = c2068.f3887;
        if (c2068.f3888) {
            AbstractC2073.m2696();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3876 < this.f3875;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2068 c2068 = this.f3877;
        int i = c2068.f3887;
        int i2 = this.f3874;
        if (i != i2) {
            AbstractC2073.m2696();
        }
        int i3 = this.f3876;
        this.f3876 = c2068.f3890[(i3 * 5) + 3] + i3;
        return new C2072(c2068, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
