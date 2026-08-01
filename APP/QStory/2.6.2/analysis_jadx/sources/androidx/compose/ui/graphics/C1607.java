package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1607 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f4709;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f4710;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ColorFilter f4711;

    public C1607(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1596.m2913();
            porterDuffColorFilter = AbstractC1596.m2915(AbstractC1581.m2863(j), AbstractC1581.m2877(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(AbstractC1581.m2863(j), AbstractC1581.m2860(i));
        }
        this.f4711 = porterDuffColorFilter;
        this.f4710 = j;
        this.f4709 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1607)) {
            return false;
        }
        C1607 c1607 = (C1607) obj;
        return C1599.m2939(this.f4710, c1607.f4710) && this.f4709 == c1607.f4709;
    }

    public final int hashCode() {
        int i = C1599.f4698;
        return Integer.hashCode(this.f4709) + (Long.hashCode(this.f4710) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        AbstractC0053.m138(this.f4710, sb, ", blendMode=");
        sb.append((Object) AbstractC1581.m2868(this.f4709));
        sb.append(')');
        return sb.toString();
    }
}
