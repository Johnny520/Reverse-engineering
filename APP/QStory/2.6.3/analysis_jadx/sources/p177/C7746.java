package p177;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.C1599;

/* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7746 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f21019;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f21020;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f21021;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f21022;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f21023;

    public C7746(long j, long j2, long j3, long j4, long j5) {
        this.f21023 = j;
        this.f21022 = j2;
        this.f21021 = j3;
        this.f21020 = j4;
        this.f21019 = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7746)) {
            return false;
        }
        C7746 c7746 = (C7746) obj;
        return C1599.m2949(this.f21023, c7746.f21023) && C1599.m2949(this.f21022, c7746.f21022) && C1599.m2949(this.f21021, c7746.f21021) && C1599.m2949(this.f21020, c7746.f21020) && C1599.m2949(this.f21019, c7746.f21019);
    }

    public final int hashCode() {
        int i = C1599.f4699;
        return Long.hashCode(this.f21019) + AbstractC0053.m142(AbstractC0053.m142(AbstractC0053.m142(Long.hashCode(this.f21023) * 31, 31, this.f21022), 31, this.f21021), 31, this.f21020);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        AbstractC0053.m138(this.f21023, sb, ", textColor=");
        AbstractC0053.m138(this.f21022, sb, ", iconColor=");
        AbstractC0053.m138(this.f21021, sb, ", disabledTextColor=");
        AbstractC0053.m138(this.f21020, sb, ", disabledIconColor=");
        sb.append((Object) C1599.m2954(this.f21019));
        sb.append(')');
        return sb.toString();
    }
}
