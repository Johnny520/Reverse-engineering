package p141;

import java.util.List;
import kotlin.collections.AbstractC5162;
import p140.AbstractC8244;
import p332.C9496;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8251 extends AbstractC5162 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f20460;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f20461;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC8244 f20462;

    public C8251(AbstractC8244 abstractC8244, int i, int i2) {
        this.f20462 = abstractC8244;
        this.f20460 = i;
        C9496.m14930(i, i2, abstractC8244.size());
        this.f20461 = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C9496.m14932(i, this.f20461);
        return this.f20462.get(this.f20460 + i);
    }

    @Override // kotlin.collections.AbstractC5167
    public final int getSize() {
        return this.f20461;
    }

    @Override // kotlin.collections.AbstractC5162, java.util.List
    public final List subList(int i, int i2) {
        C9496.m14930(i, i2, this.f20461);
        int i3 = this.f20460;
        return new C8251(this.f20462, i + i3, i3 + i2);
    }
}
