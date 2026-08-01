package p125;

import java.util.List;
import kotlin.collections.AbstractC4329;
import p033.AbstractC6325;
import p124.AbstractC7414;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7421 extends AbstractC4329 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f20120;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f20121;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC7414 f20122;

    public C7421(AbstractC7414 abstractC7414, int i, int i2) {
        this.f20122 = abstractC7414;
        this.f20120 = i;
        AbstractC6325.m11855(i, i2, abstractC7414.size());
        this.f20121 = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC6325.m11857(i, this.f20121);
        return this.f20122.get(this.f20120 + i);
    }

    @Override // kotlin.collections.AbstractC4334
    public final int getSize() {
        return this.f20121;
    }

    @Override // kotlin.collections.AbstractC4329, java.util.List
    public final List subList(int i, int i2) {
        AbstractC6325.m11855(i, i2, this.f20121);
        int i3 = this.f20120;
        return new C7421(this.f20122, i + i3, i3 + i2);
    }
}
