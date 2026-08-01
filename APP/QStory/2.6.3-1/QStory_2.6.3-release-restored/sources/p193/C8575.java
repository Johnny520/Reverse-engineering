package p193;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.graphics.C2434;

/* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8575 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f21364;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f21365;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f21366;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f21367;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f21368;

    public C8575(long j, long j2, long j3, long j4, long j5) {
        this.f21368 = j;
        this.f21367 = j2;
        this.f21366 = j3;
        this.f21365 = j4;
        this.f21364 = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8575)) {
            return false;
        }
        C8575 c8575 = (C8575) obj;
        return C2434.m3509(this.f21368, c8575.f21368) && C2434.m3509(this.f21367, c8575.f21367) && C2434.m3509(this.f21366, c8575.f21366) && C2434.m3509(this.f21365, c8575.f21365) && C2434.m3509(this.f21364, c8575.f21364);
    }

    public final int hashCode() {
        int i = C2434.f5044;
        return Long.hashCode(this.f21364) + AbstractC0900.m702(AbstractC0900.m702(AbstractC0900.m702(Long.hashCode(this.f21368) * 31, 31, this.f21367), 31, this.f21366), 31, this.f21365);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        AbstractC0900.m698(this.f21368, sb, ", textColor=");
        AbstractC0900.m698(this.f21367, sb, ", iconColor=");
        AbstractC0900.m698(this.f21366, sb, ", disabledTextColor=");
        AbstractC0900.m698(this.f21365, sb, ", disabledIconColor=");
        sb.append((Object) C2434.m3514(this.f21364));
        sb.append(')');
        return sb.toString();
    }
}
