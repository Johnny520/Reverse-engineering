package androidx.compose.animation;

import androidx.compose.animation.core.InterfaceC0311;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0433 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0311 f1396;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6557 f1397;

    public C0433(InterfaceC6557 interfaceC6557, InterfaceC0311 interfaceC0311) {
        this.f1397 = interfaceC6557;
        this.f1396 = interfaceC0311;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0433)) {
            return false;
        }
        C0433 c0433 = (C0433) obj;
        return this.f1397.equals(c0433.f1397) && this.f1396.equals(c0433.f1396);
    }

    public final int hashCode() {
        return this.f1396.hashCode() + (this.f1397.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f1397 + ", animationSpec=" + this.f1396 + ')';
    }
}
