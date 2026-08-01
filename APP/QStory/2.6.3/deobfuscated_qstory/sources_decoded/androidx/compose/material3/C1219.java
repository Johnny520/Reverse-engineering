package androidx.compose.material3;

import kotlin.jvm.internal.AbstractC4395;
import p181.AbstractC7760;
import p181.C7756;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1219 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC7760 f3510;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC7760 f3511;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC7760 f3512;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC7760 f3513;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC7760 f3514;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC7760 f3515;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC7760 f3516;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC7760 f3517;

    public C1219() {
        C7756 c7756 = AbstractC1218.f3506;
        C7756 c77562 = AbstractC1218.f3505;
        C7756 c77563 = AbstractC1218.f3504;
        C7756 c77564 = AbstractC1218.f3503;
        C7756 c77565 = AbstractC1218.f3501;
        C7756 c77566 = AbstractC1218.f3502;
        C7756 c77567 = AbstractC1218.f3508;
        C7756 c77568 = AbstractC1218.f3507;
        this.f3515 = c7756;
        this.f3514 = c77562;
        this.f3513 = c77563;
        this.f3512 = c77564;
        this.f3511 = c77565;
        this.f3510 = c77566;
        this.f3517 = c77567;
        this.f3516 = c77568;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1219)) {
            return false;
        }
        C1219 c1219 = (C1219) obj;
        return AbstractC4395.m8907(this.f3515, c1219.f3515) && AbstractC4395.m8907(this.f3514, c1219.f3514) && AbstractC4395.m8907(this.f3513, c1219.f3513) && AbstractC4395.m8907(this.f3512, c1219.f3512) && AbstractC4395.m8907(this.f3511, c1219.f3511) && AbstractC4395.m8907(this.f3510, c1219.f3510) && AbstractC4395.m8907(this.f3517, c1219.f3517) && AbstractC4395.m8907(this.f3516, c1219.f3516);
    }

    public final int hashCode() {
        return this.f3516.hashCode() + ((this.f3517.hashCode() + ((this.f3510.hashCode() + ((this.f3511.hashCode() + ((this.f3512.hashCode() + ((this.f3513.hashCode() + ((this.f3514.hashCode() + (this.f3515.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f3515 + ", small=" + this.f3514 + ", medium=" + this.f3513 + ", large=" + this.f3512 + ", largeIncreased=" + this.f3510 + ", extraLarge=" + this.f3511 + ", extralargeIncreased=" + this.f3517 + ", extraExtraLarge=" + this.f3516 + ')';
    }
}
