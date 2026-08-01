package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1607 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f4710;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f4711;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ColorFilter f4712;

    public C1607(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1596.m2923();
            porterDuffColorFilter = AbstractC1596.m2925(AbstractC1581.m2873(j), AbstractC1581.m2887(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(AbstractC1581.m2873(j), AbstractC1581.m2870(i));
        }
        this.f4712 = porterDuffColorFilter;
        this.f4711 = j;
        this.f4710 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1607)) {
            return false;
        }
        C1607 c1607 = (C1607) obj;
        return C1599.m2949(this.f4711, c1607.f4711) && this.f4710 == c1607.f4710;
    }

    public final int hashCode() {
        int i = C1599.f4699;
        return Integer.hashCode(this.f4710) + (Long.hashCode(this.f4711) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        AbstractC0053.m138(this.f4711, sb, ", blendMode=");
        sb.append((Object) AbstractC1581.m2878(this.f4710));
        sb.append(')');
        return sb.toString();
    }
}
