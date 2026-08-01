package androidx.compose.material3;

import kotlin.jvm.internal.AbstractC4394;
import p181.AbstractC7759;
import p181.C7755;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1219 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC7759 f3509;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC7759 f3510;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC7759 f3511;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC7759 f3512;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC7759 f3513;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC7759 f3514;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC7759 f3515;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC7759 f3516;

    public C1219() {
        C7755 c7755 = AbstractC1218.f3505;
        C7755 c77552 = AbstractC1218.f3504;
        C7755 c77553 = AbstractC1218.f3503;
        C7755 c77554 = AbstractC1218.f3502;
        C7755 c77555 = AbstractC1218.f3500;
        C7755 c77556 = AbstractC1218.f3501;
        C7755 c77557 = AbstractC1218.f3507;
        C7755 c77558 = AbstractC1218.f3506;
        this.f3514 = c7755;
        this.f3513 = c77552;
        this.f3512 = c77553;
        this.f3511 = c77554;
        this.f3510 = c77555;
        this.f3509 = c77556;
        this.f3516 = c77557;
        this.f3515 = c77558;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1219)) {
            return false;
        }
        C1219 c1219 = (C1219) obj;
        return AbstractC4394.m8917(this.f3514, c1219.f3514) && AbstractC4394.m8917(this.f3513, c1219.f3513) && AbstractC4394.m8917(this.f3512, c1219.f3512) && AbstractC4394.m8917(this.f3511, c1219.f3511) && AbstractC4394.m8917(this.f3510, c1219.f3510) && AbstractC4394.m8917(this.f3509, c1219.f3509) && AbstractC4394.m8917(this.f3516, c1219.f3516) && AbstractC4394.m8917(this.f3515, c1219.f3515);
    }

    public final int hashCode() {
        return this.f3515.hashCode() + ((this.f3516.hashCode() + ((this.f3509.hashCode() + ((this.f3510.hashCode() + ((this.f3511.hashCode() + ((this.f3512.hashCode() + ((this.f3513.hashCode() + (this.f3514.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f3514 + ", small=" + this.f3513 + ", medium=" + this.f3512 + ", large=" + this.f3511 + ", largeIncreased=" + this.f3509 + ", extraLarge=" + this.f3510 + ", extralargeIncreased=" + this.f3516 + ", extraExtraLarge=" + this.f3515 + ')';
    }
}
