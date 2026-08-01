package p177;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.C1599;

/* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7745 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f21022;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f21023;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f21024;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f21025;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f21026;

    public C7745(long j, long j2, long j3, long j4, long j5) {
        this.f21026 = j;
        this.f21025 = j2;
        this.f21024 = j3;
        this.f21023 = j4;
        this.f21022 = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7745)) {
            return false;
        }
        C7745 c7745 = (C7745) obj;
        return C1599.m2939(this.f21026, c7745.f21026) && C1599.m2939(this.f21025, c7745.f21025) && C1599.m2939(this.f21024, c7745.f21024) && C1599.m2939(this.f21023, c7745.f21023) && C1599.m2939(this.f21022, c7745.f21022);
    }

    public final int hashCode() {
        int i = C1599.f4698;
        return Long.hashCode(this.f21022) + AbstractC0053.m141(AbstractC0053.m141(AbstractC0053.m141(Long.hashCode(this.f21026) * 31, 31, this.f21025), 31, this.f21024), 31, this.f21023);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        AbstractC0053.m138(this.f21026, sb, ", textColor=");
        AbstractC0053.m138(this.f21025, sb, ", iconColor=");
        AbstractC0053.m138(this.f21024, sb, ", disabledTextColor=");
        AbstractC0053.m138(this.f21023, sb, ", disabledIconColor=");
        sb.append((Object) C1599.m2944(this.f21022));
        sb.append(')');
        return sb.toString();
    }
}
