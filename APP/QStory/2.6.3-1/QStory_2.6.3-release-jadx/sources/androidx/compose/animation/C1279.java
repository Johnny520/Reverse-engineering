package androidx.compose.animation;

import androidx.compose.animation.core.InterfaceC1157;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1279 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1157 f1741;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7387 f1742;

    public C1279(InterfaceC7387 interfaceC7387, InterfaceC1157 interfaceC1157) {
        this.f1742 = interfaceC7387;
        this.f1741 = interfaceC1157;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1279)) {
            return false;
        }
        C1279 c1279 = (C1279) obj;
        return this.f1742.equals(c1279.f1742) && this.f1741.equals(c1279.f1741);
    }

    public final int hashCode() {
        return this.f1741.hashCode() + (this.f1742.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f1742 + ", animationSpec=" + this.f1741 + ')';
    }
}
