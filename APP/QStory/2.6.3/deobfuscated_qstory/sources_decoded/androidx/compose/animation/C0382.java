package androidx.compose.animation;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.C1599;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0382 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f1287;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f1288;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f1289;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f1290;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f1291;

    public C0382(boolean z, long j, long j2, long j3, boolean z2) {
        this.f1291 = z;
        this.f1290 = j;
        this.f1289 = j2;
        this.f1288 = j3;
        this.f1287 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0382)) {
            return false;
        }
        C0382 c0382 = (C0382) obj;
        return this.f1291 == c0382.f1291 && C1599.m2949(this.f1290, c0382.f1290) && C1599.m2949(this.f1289, c0382.f1289) && C1599.m2949(this.f1288, c0382.f1288) && this.f1287 == c0382.f1287;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f1291) * 31;
        int i = C1599.f4699;
        return Boolean.hashCode(this.f1287) + AbstractC0053.m142(AbstractC0053.m142(AbstractC0053.m142(iHashCode, 31, this.f1290), 31, this.f1289), 31, this.f1288);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LookaheadAnimationVisualDebugConfig(isEnabled=");
        sb.append(this.f1291);
        sb.append(", overlayColor=");
        AbstractC0053.m138(this.f1290, sb, ", multipleMatchesColor=");
        AbstractC0053.m138(this.f1289, sb, ", unmatchedElementColor=");
        AbstractC0053.m138(this.f1288, sb, ", isShowKeyLabelEnabled=");
        return AbstractC0053.m152(sb, this.f1287, ')');
    }
}
