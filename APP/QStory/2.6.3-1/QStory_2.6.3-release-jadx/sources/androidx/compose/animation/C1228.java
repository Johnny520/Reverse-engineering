package androidx.compose.animation;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.graphics.C2434;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1228 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f1632;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f1633;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f1634;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f1635;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f1636;

    public C1228(boolean z, long j, long j2, long j3, boolean z2) {
        this.f1636 = z;
        this.f1635 = j;
        this.f1634 = j2;
        this.f1633 = j3;
        this.f1632 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1228)) {
            return false;
        }
        C1228 c1228 = (C1228) obj;
        return this.f1636 == c1228.f1636 && C2434.m3509(this.f1635, c1228.f1635) && C2434.m3509(this.f1634, c1228.f1634) && C2434.m3509(this.f1633, c1228.f1633) && this.f1632 == c1228.f1632;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f1636) * 31;
        int i = C2434.f5044;
        return Boolean.hashCode(this.f1632) + AbstractC0900.m702(AbstractC0900.m702(AbstractC0900.m702(iHashCode, 31, this.f1635), 31, this.f1634), 31, this.f1633);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LookaheadAnimationVisualDebugConfig(isEnabled=");
        sb.append(this.f1636);
        sb.append(", overlayColor=");
        AbstractC0900.m698(this.f1635, sb, ", multipleMatchesColor=");
        AbstractC0900.m698(this.f1634, sb, ", unmatchedElementColor=");
        AbstractC0900.m698(this.f1633, sb, ", isShowKeyLabelEnabled=");
        return AbstractC0900.m712(sb, this.f1632, ')');
    }
}
