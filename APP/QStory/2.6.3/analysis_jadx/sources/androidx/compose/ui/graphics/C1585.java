package androidx.compose.ui.graphics;

import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1585 extends AbstractC1581 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C7328 f4672;

    public C1585(C7328 c7328) {
        this.f4672 = c7328;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1585) {
            return this.f4672.equals(((C1585) obj).f4672);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4672.hashCode();
    }

    @Override // androidx.compose.ui.graphics.AbstractC1581
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final C7328 mo2869() {
        return this.f4672;
    }
}
