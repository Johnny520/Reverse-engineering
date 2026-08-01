package androidx.compose.p001ui.graphics;

import p128.C8157;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2420 extends AbstractC2416 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8157 f5017;

    public C2420(C8157 c8157) {
        this.f5017 = c8157;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2420) {
            return this.f5017.equals(((C2420) obj).f5017);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5017.hashCode();
    }

    @Override // androidx.compose.p001ui.graphics.AbstractC2416
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final C8157 mo3429() {
        return this.f5017;
    }
}
