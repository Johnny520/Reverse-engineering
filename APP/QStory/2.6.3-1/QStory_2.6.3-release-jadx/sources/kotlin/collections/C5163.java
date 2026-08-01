package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5163 extends AbstractC5162 implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f13258;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f13259;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC5162 f13260;

    public C5163(AbstractC5162 abstractC5162, int i, int i2) {
        this.f13260 = abstractC5162;
        this.f13258 = i;
        C5165 c5165 = AbstractC5162.Companion;
        int size = abstractC5162.size();
        c5165.getClass();
        C5165.m9321(i, i2, size);
        this.f13259 = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC5162.Companion.getClass();
        C5165.m9323(i, this.f13259);
        return this.f13260.get(this.f13258 + i);
    }

    @Override // kotlin.collections.AbstractC5167
    public final int getSize() {
        return this.f13259;
    }

    @Override // kotlin.collections.AbstractC5162, java.util.List
    public final List subList(int i, int i2) {
        AbstractC5162.Companion.getClass();
        C5165.m9321(i, i2, this.f13259);
        int i3 = this.f13258;
        return new C5163(this.f13260, i + i3, i3 + i2);
    }
}
