package androidx.compose.ui.graphics;

import p112.C7327;
import p112.C7328;
import p251.AbstractC8175;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1576 extends AbstractC1581 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C7327 f4656;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1614 f4657;

    public C1576(C7327 c7327) {
        C1614 c1614M2957;
        this.f4656 = c7327;
        if (AbstractC8175.m13638(c7327)) {
            c1614M2957 = null;
        } else {
            c1614M2957 = AbstractC1603.m2957();
            C1614.m2977(c1614M2957, c7327);
        }
        this.f4657 = c1614M2957;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1576) {
            return this.f4656.equals(((C1576) obj).f4656);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4656.hashCode();
    }

    @Override // androidx.compose.ui.graphics.AbstractC1581
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C7328 mo2869() {
        C7327 c7327 = this.f4656;
        return new C7328(c7327.f19533, c7327.f19532, c7327.f19531, c7327.f19530);
    }
}
