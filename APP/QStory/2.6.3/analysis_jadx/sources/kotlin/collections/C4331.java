package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4331 extends AbstractC4330 implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f12913;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f12914;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC4330 f12915;

    public C4331(AbstractC4330 abstractC4330, int i, int i2) {
        this.f12915 = abstractC4330;
        this.f12913 = i;
        C4333 c4333 = AbstractC4330.Companion;
        int size = abstractC4330.size();
        c4333.getClass();
        C4333.m8762(i, i2, size);
        this.f12914 = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC4330.Companion.getClass();
        C4333.m8764(i, this.f12914);
        return this.f12915.get(this.f12913 + i);
    }

    @Override // kotlin.collections.AbstractC4335
    public final int getSize() {
        return this.f12914;
    }

    @Override // kotlin.collections.AbstractC4330, java.util.List
    public final List subList(int i, int i2) {
        AbstractC4330.Companion.getClass();
        C4333.m8762(i, i2, this.f12914);
        int i3 = this.f12913;
        return new C4331(this.f12915, i + i3, i3 + i2);
    }
}
