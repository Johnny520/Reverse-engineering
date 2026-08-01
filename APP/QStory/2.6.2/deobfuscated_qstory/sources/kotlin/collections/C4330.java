package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4330 extends AbstractC4329 implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f12909;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f12910;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC4329 f12911;

    public C4330(AbstractC4329 abstractC4329, int i, int i2) {
        this.f12911 = abstractC4329;
        this.f12909 = i;
        C4332 c4332 = AbstractC4329.Companion;
        int size = abstractC4329.size();
        c4332.getClass();
        C4332.m8772(i, i2, size);
        this.f12910 = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC4329.Companion.getClass();
        C4332.m8774(i, this.f12910);
        return this.f12911.get(this.f12909 + i);
    }

    @Override // kotlin.collections.AbstractC4334
    public final int getSize() {
        return this.f12910;
    }

    @Override // kotlin.collections.AbstractC4329, java.util.List
    public final List subList(int i, int i2) {
        AbstractC4329.Companion.getClass();
        C4332.m8772(i, i2, this.f12910);
        int i3 = this.f12909;
        return new C4330(this.f12911, i + i3, i3 + i2);
    }
}
