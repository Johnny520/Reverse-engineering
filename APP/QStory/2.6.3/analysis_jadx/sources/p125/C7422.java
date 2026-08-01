package p125;

import java.util.List;
import kotlin.collections.AbstractC4330;
import p124.AbstractC7415;
import p316.C8667;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7422 extends AbstractC4330 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f20115;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f20116;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC7415 f20117;

    public C7422(AbstractC7415 abstractC7415, int i, int i2) {
        this.f20117 = abstractC7415;
        this.f20115 = i;
        C8667.m14371(i, i2, abstractC7415.size());
        this.f20116 = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C8667.m14373(i, this.f20116);
        return this.f20117.get(this.f20115 + i);
    }

    @Override // kotlin.collections.AbstractC4335
    public final int getSize() {
        return this.f20116;
    }

    @Override // kotlin.collections.AbstractC4330, java.util.List
    public final List subList(int i, int i2) {
        C8667.m14371(i, i2, this.f20116);
        int i3 = this.f20115;
        return new C7422(this.f20117, i + i3, i3 + i2);
    }
}
